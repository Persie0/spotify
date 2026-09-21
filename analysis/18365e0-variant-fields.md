# AP 0x18365e0 variant fields +0x10 / +0x1b5

Goal: prove whether the e9ccb0 instance keeps +0x1b5 false while +0x10 points at a 0x6b0 data record, and find any class path where +0x1b5 is true with a different +0x10 receiver.

## e9ccb0 owner builder FDE=(15310087, 15343400)
### Direct r12 object accesses after allocation
- 0xe9cceb: mov    QWORD PTR [r12],rax
- 0xe9ccf3: mov    QWORD PTR [r12+0x10],rax
- 0xe9cd0e: movaps XMMWORD PTR [r12+0x50],xmm0
- 0xe9cd19: movups XMMWORD PTR [r12+0x60],xmm0
- 0xe9cd9d: movdqa XMMWORD PTR [r12+0x140],xmm1
- 0xe9cda7: movaps XMMWORD PTR [r12+0x130],xmm0
- 0xe9cdc0: movdqu XMMWORD PTR [r12+0x150],xmm0
- 0xe9cdfa: movdqu XMMWORD PTR [r12+0x200],xmm0
- 0xe9ce15: mov    BYTE PTR [r12+0x210],al
- 0xe9ce46: movdqu XMMWORD PTR [r12+0x250],xmm0
- 0xe9ce92: movups XMMWORD PTR [r12+0x2c0],xmm0
- 0xe9cea9: movups XMMWORD PTR [r12+0x2d0],xmm0
- 0xe9cecc: movups XMMWORD PTR [r12+0x2e0],xmm0
- 0xe9ceef: movups XMMWORD PTR [r12+0x2f0],xmm0
- 0xe9cf12: movups XMMWORD PTR [r12+0x300],xmm0
- 0xe9cf35: movups XMMWORD PTR [r12+0x310],xmm0
- 0xe9cf58: movups XMMWORD PTR [r12+0x320],xmm0
- 0xe9cf7b: movups XMMWORD PTR [r12+0x330],xmm0
- 0xe9cf95: mov    BYTE PTR [r12+0x340],al
- 0xe9cfad: movups XMMWORD PTR [r12+0x348],xmm0
- 0xe9cfcc: movups XMMWORD PTR [r12+0x358],xmm0
- 0xe9cfd9: mov    QWORD PTR [r12+0x368],rcx
- 0xe9cff3: movups XMMWORD PTR [r12+0x370],xmm0
- 0xe9d012: movups XMMWORD PTR [r12+0x380],xmm0
- 0xe9d035: movups XMMWORD PTR [r12+0x390],xmm0
- 0xe9d058: movups XMMWORD PTR [r12+0x3a0],xmm0
- 0xe9d07b: movups XMMWORD PTR [r12+0x3b0],xmm0
- 0xe9d09e: movups XMMWORD PTR [r12+0x3c0],xmm0
- 0xe9d9dd: mov    QWORD PTR [r12],rax
- 0xe9d9e1: lea    rdi,[r12+0x10]
- 0xe9da19: mov    QWORD PTR [r12+0xa0],rax
- 0xe9da8e: mov    QWORD PTR [r12],rax
- 0xe9da92: lea    rdi,[r12+0x10]
- 0xe9daca: mov    QWORD PTR [r12+0xa0],rax
- 0xe9e9e0: mov    QWORD PTR [r12],rax
- 0xe9e9fd: movdqa XMMWORD PTR [r12+0x40],xmm0
- 0xe9eabc: mov    QWORD PTR [r12+0x20],rbx
- 0xe9ff2b: mov    QWORD PTR [r12],rax
- 0xe9ff37: movaps XMMWORD PTR [r12+0x10],xmm0
- 0xe9ff4d: movups XMMWORD PTR [r12+0x20],xmm0
- 0xe9ff6d: movups XMMWORD PTR [r12+0x30],xmm0
- 0xe9ff8d: movups XMMWORD PTR [r12+0x40],xmm0
- 0xe9ffef: movups XMMWORD PTR [r12+0x168],xmm0
- 0xea0013: movdqu XMMWORD PTR [r12+0x178],xmm0
- 0xea0049: movups XMMWORD PTR [r12+0x1a0],xmm0
- 0xea01eb: mov    QWORD PTR [r12],rax
- 0xea01f7: movaps XMMWORD PTR [r12+0x10],xmm0
- 0xea020d: movups XMMWORD PTR [r12+0x20],xmm0
- 0xea022d: movups XMMWORD PTR [r12+0x30],xmm0
- 0xea024d: movups XMMWORD PTR [r12+0x40],xmm0
- 0xea02aa: movups XMMWORD PTR [r12+0x168],xmm0
- 0xea02ce: movdqu XMMWORD PTR [r12+0x178],xmm0
- 0xea030a: movdqu XMMWORD PTR [r12+0x1a0],xmm0
- 0xea0d27: mov    rdi,QWORD PTR [r12+0x180]
- 0xea0d34: mov    rdi,QWORD PTR [r12+0x170]
- 0xea0d51: mov    rdi,QWORD PTR [r12+0x48]
- 0xea0d5b: mov    rdi,QWORD PTR [r12+0x38]
- 0xea0d65: mov    rdi,QWORD PTR [r12+0x28]
- 0xea0e20: mov    rdi,QWORD PTR [r12+0x180]
- 0xea0e2d: mov    rdi,QWORD PTR [r12+0x170]
- 0xea0e4a: mov    rdi,QWORD PTR [r12+0x48]
- 0xea0e54: mov    rdi,QWORD PTR [r12+0x38]
- 0xea0e5e: mov    rdi,QWORD PTR [r12+0x28]
- 0xea18b2: mov    rdi,QWORD PTR [r12+0x258]
- 0xea18ce: mov    rdi,QWORD PTR [r12+0x208]
- 0xea18f1: mov    rdi,QWORD PTR [r12+0x158]
- 0xea1925: mov    rdi,QWORD PTR [r12+0x68]

### All direct writes to r12+0x1b0..0x1bf
### All direct writes to r12+0x10
#### 0xe9ccf3: mov    QWORD PTR [r12+0x10],rax
      e9ccc7:	00 
      e9ccc8:	48 8d 84 24 20 05 00 	lea    rax,[rsp+0x520]
      e9cccf:	00 
      e9ccd0:	48 89 84 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],rax
      e9ccd7:	00 
      e9ccd8:	48 c7 84 24 40 0b 00 	mov    QWORD PTR [rsp+0xb40],0x1
      e9ccdf:	00 01 00 00 00 
      e9cce4:	48 8d 05 f5 98 99 00 	lea    rax,[rip+0x9998f5]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      e9cceb:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ccef:	49 8b 47 c0          	mov    rax,QWORD PTR [r15-0x40]
      e9ccf3:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      e9ccf8:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
      e9ccfd:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      e9cd02:	48 89 ee             	mov    rsi,rbp
      e9cd05:	e8 ee c4 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
      e9cd0a:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
      e9cd0e:	41 0f 29 44 24 50    	movaps XMMWORD PTR [r12+0x50],xmm0
      e9cd14:	41 0f 28 47 10       	movaps xmm0,XMMWORD PTR [r15+0x10]
      e9cd19:	41 0f 11 44 24 60    	movups XMMWORD PTR [r12+0x60],xmm0
      e9cd1f:	0f 57 c0             	xorps  xmm0,xmm0
      e9cd22:	48 8d 84 24 c0 07 00 	lea    rax,[rsp+0x7c0]
      e9cd29:	00 
      e9cd2a:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      e9cd2d:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e9cd32:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      e9cd37:	48 8d b4 24 d0 07 00 	lea    rsi,[rsp+0x7d0]
      e9cd3e:	00 
      e9cd3f:	e8 60 c1 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
      e9cd44:	49 8d bc 24 a0 00 00 	lea    rdi,[r12+0xa0]

#### 0xe9ff37: movaps XMMWORD PTR [r12+0x10],xmm0
      e9ff08:	48 8d 84 24 d0 0e 00 	lea    rax,[rsp+0xed0]
      e9ff0f:	00 
      e9ff10:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9ff17:	00 
      e9ff18:	48 c7 84 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],0x1
      e9ff1f:	00 01 00 00 00 
      e9ff24:	48 8d 05 ed 44 99 00 	lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
      e9ff2b:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ff2f:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
      e9ff36:	00 
      e9ff37:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      e9ff3d:	48 8b 84 24 88 07 00 	mov    rax,QWORD PTR [rsp+0x788]
      e9ff44:	00 
      e9ff45:	0f 28 84 24 80 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x780]
      e9ff4c:	00 
      e9ff4d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      e9ff53:	48 85 c0             	test   rax,rax
      e9ff56:	74 05                	je     e9ff5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67373>
      e9ff58:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff5d:	48 8b 84 24 98 07 00 	mov    rax,QWORD PTR [rsp+0x798]
      e9ff64:	00 
      e9ff65:	0f 28 84 24 90 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x790]
      e9ff6c:	00 
      e9ff6d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      e9ff73:	48 85 c0             	test   rax,rax
      e9ff76:	74 05                	je     e9ff7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67393>
      e9ff78:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff7d:	48 8b 84 24 a8 07 00 	mov    rax,QWORD PTR [rsp+0x7a8]
      e9ff84:	00 

#### 0xea01f7: movaps XMMWORD PTR [r12+0x10],xmm0
      ea01c8:	48 8d 84 24 80 03 00 	lea    rax,[rsp+0x380]
      ea01cf:	00 
      ea01d0:	48 89 84 24 a8 0e 00 	mov    QWORD PTR [rsp+0xea8],rax
      ea01d7:	00 
      ea01d8:	48 c7 84 24 b0 0e 00 	mov    QWORD PTR [rsp+0xeb0],0x1
      ea01df:	00 01 00 00 00 
      ea01e4:	48 8d 05 3d 45 99 00 	lea    rax,[rip+0x99453d]        # 1834728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x66c0>
      ea01eb:	49 89 04 24          	mov    QWORD PTR [r12],rax
      ea01ef:	0f 28 84 24 60 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1060]
      ea01f6:	00 
      ea01f7:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      ea01fd:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
      ea0204:	00 
      ea0205:	0f 28 84 24 70 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1070]
      ea020c:	00 
      ea020d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      ea0213:	48 85 c0             	test   rax,rax
      ea0216:	74 05                	je     ea021d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67633>
      ea0218:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea021d:	48 8b 84 24 88 10 00 	mov    rax,QWORD PTR [rsp+0x1088]
      ea0224:	00 
      ea0225:	0f 28 84 24 80 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1080]
      ea022c:	00 
      ea022d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      ea0233:	48 85 c0             	test   rax,rax
      ea0236:	74 05                	je     ea023d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67653>
      ea0238:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea023d:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
      ea0244:	00 

## 0x18365e0 virtual method family
### 0xef90ca FDE=(15700170, 15700189)
      ef90ca:	48 8d 05 0f d5 93 00 	lea    rax,[rip+0x93d50f]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef90d1:	48 89 07             	mov    QWORD PTR [rdi],rax
      ef90d4:	48 83 c7 10          	add    rdi,0x10
      ef90d8:	e9 91 fe ff ff       	jmp    ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
#### +0x10/+0x1b5 accesses

### 0xef90de FDE=(15700190, 15700208)
      ef90de:	53                   	push   rbx
      ef90df:	48 89 fb             	mov    rbx,rdi
      ef90e2:	e8 e3 ff ff ff       	call   ef90ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc04e0>
      ef90e7:	48 89 df             	mov    rdi,rbx
      ef90ea:	5b                   	pop    rbx
      ef90eb:	e9 30 4e 8f 00       	jmp    17edf20 <_ZdlPv@plt>
#### +0x10/+0x1b5 accesses

### 0xef90f0 FDE=(15700208, 15700370)
      ef90f0:	41 56                	push   r14
      ef90f2:	53                   	push   rbx
      ef90f3:	48 83 ec 28          	sub    rsp,0x28
      ef90f7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef90fe:	00 00 
      ef9100:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ef9105:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      ef9109:	bf d0 03 00 00       	mov    edi,0x3d0
      ef910e:	e8 ed 4d 8f 00       	call   17edf00 <_Znwm@plt>
      ef9113:	48 89 c3             	mov    rbx,rax
      ef9116:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef911a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      ef911f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ef9124:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      ef912b:	00 00 
      ef912d:	48 8d 05 ac d4 93 00 	lea    rax,[rip+0x93d4ac]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef9134:	48 89 03             	mov    QWORD PTR [rbx],rax
      ef9137:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      ef913b:	4c 89 f6             	mov    rsi,r14
      ef913e:	e8 2d 8a 00 00       	call   f01b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8f86>
      ef9143:	48 89 e7             	mov    rdi,rsp
      ef9146:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ef914a:	e8 7b 11 b8 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ef914f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef9156:	00 00 
      ef9158:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ef915d:	75 2e                	jne    ef918d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc05a3>
      ef915f:	48 89 d8             	mov    rax,rbx
      ef9162:	48 83 c4 28          	add    rsp,0x28
      ef9166:	5b                   	pop    rbx
      ef9167:	41 5e                	pop    r14
      ef9169:	c3                   	ret
      ef916a:	48 89 c3             	mov    rbx,rax
      ef916d:	48 89 e7             	mov    rdi,rsp
      ef9170:	e8 55 11 b8 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ef9175:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef917c:	00 00 
      ef917e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ef9183:	75 08                	jne    ef918d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc05a3>
      ef9185:	48 89 df             	mov    rdi,rbx
      ef9188:	e8 43 6b b7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ef918d:	e8 1e 69 8f 00       	call   17efab0 <__stack_chk_fail@plt>
#### +0x10/+0x1b5 accesses
      ef9105:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      ef9124:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      ef9137:	48 8d 7b 10          	lea    rdi,[rbx+0x10]

### 0xef9192 FDE=(15700370, 15700396)
      ef9192:	48 8d 47 10          	lea    rax,[rdi+0x10]
      ef9196:	48 8d 0d 43 d4 93 00 	lea    rcx,[rip+0x93d443]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef919d:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ef91a0:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      ef91a4:	48 89 c6             	mov    rsi,rax
      ef91a7:	e9 c4 89 00 00       	jmp    f01b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8f86>
#### +0x10/+0x1b5 accesses
      ef9192:	48 8d 47 10          	lea    rax,[rdi+0x10]
      ef91a0:	48 8d 7e 10          	lea    rdi,[rsi+0x10]

### 0xef91ac FDE=(15700396, 15700405)
      ef91ac:	48 83 c7 10          	add    rdi,0x10
      ef91b0:	e9 b9 fd ff ff       	jmp    ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
#### +0x10/+0x1b5 accesses

### 0xef91b6 FDE=(15700406, 15700428)
      ef91b6:	53                   	push   rbx
      ef91b7:	48 89 fb             	mov    rbx,rdi
      ef91ba:	48 83 c7 10          	add    rdi,0x10
      ef91be:	e8 ab fd ff ff       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      ef91c3:	48 89 df             	mov    rdi,rbx
      ef91c6:	5b                   	pop    rbx
      ef91c7:	e9 54 4d 8f 00       	jmp    17edf20 <_ZdlPv@plt>
#### +0x10/+0x1b5 accesses

### 0xef91cc FDE=(15700428, 15722027)
      ef91cc:	55                   	push   rbp
      ef91cd:	41 57                	push   r15
      ef91cf:	41 56                	push   r14
      ef91d1:	41 55                	push   r13
      ef91d3:	41 54                	push   r12
      ef91d5:	53                   	push   rbx
      ef91d6:	48 81 ec f8 0a 00 00 	sub    rsp,0xaf8
      ef91dd:	49 89 fc             	mov    r12,rdi
      ef91e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef91e7:	00 00 
      ef91e9:	48 89 84 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],rax
      ef91f0:	00 
      ef91f1:	0f 57 c0             	xorps  xmm0,xmm0
      ef91f4:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      ef91f7:	48 8d 47 18          	lea    rax,[rdi+0x18]
      ef91fb:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
      ef91ff:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ef9203:	48 8d 47 30          	lea    rax,[rdi+0x30]
      ef9207:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
      ef920b:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      ef920f:	66 0f 6f 86 50 01 00 	movdqa xmm0,XMMWORD PTR [rsi+0x150]
      ef9216:	00 
      ef9217:	48 89 74 24 60       	mov    QWORD PTR [rsp+0x60],rsi
      ef921c:	48 8b 86 58 01 00 00 	mov    rax,QWORD PTR [rsi+0x158]
      ef9223:	48 85 c0             	test   rax,rax
      ef9226:	74 05                	je     ef922d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0643>
      ef9228:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef922d:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef9232:	8a 80 b7 01 00 00    	mov    al,BYTE PTR [rax+0x1b7]
      ef9238:	66 0f 7f 84 24 10 07 	movdqa XMMWORD PTR [rsp+0x710],xmm0
      ef923f:	00 00 
      ef9241:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
      ef9248:	4d 85 f6             	test   r14,r14
      ef924b:	74 05                	je     ef9252 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0668>
      ef924d:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      ef9252:	66 0f 7f 84 24 b0 00 	movdqa XMMWORD PTR [rsp+0xb0],xmm0
      ef9259:	00 00 
      ef925b:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      ef9260:	4c 8b 79 60          	mov    r15,QWORD PTR [rcx+0x60]
      ef9264:	4c 89 bc 24 20 07 00 	mov    QWORD PTR [rsp+0x720],r15
      ef926b:	00 
      ef926c:	48 8b 59 68          	mov    rbx,QWORD PTR [rcx+0x68]
      ef9270:	48 89 9c 24 28 07 00 	mov    QWORD PTR [rsp+0x728],rbx
      ef9277:	00 
      ef9278:	48 85 db             	test   rbx,rbx
      ef927b:	74 05                	je     ef9282 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0698>
      ef927d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ef9282:	c6 84 24 30 07 00 00 	mov    BYTE PTR [rsp+0x730],0x0
      ef9289:	00 
      ef928a:	88 84 24 31 07 00 00 	mov    BYTE PTR [rsp+0x731],al
      ef9291:	48 83 a4 24 e0 0a 00 	and    QWORD PTR [rsp+0xae0],0x0
      ef9298:	00 00 
      ef929a:	6a 30                	push   0x30
      ef929c:	5f                   	pop    rdi
      ef929d:	4c 89 64 24 68       	mov    QWORD PTR [rsp+0x68],r12
      ef92a2:	e8 59 4c 8f 00       	call   17edf00 <_Znwm@plt>
      ef92a7:	48 8d 0d aa f4 99 00 	lea    rcx,[rip+0x99f4aa]        # 1898758 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5698>
      ef92ae:	48 89 08             	mov    QWORD PTR [rax],rcx
      ef92b1:	66 0f 6f 84 24 b0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xb0]
      ef92b8:	00 00 
      ef92ba:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef92bf:	66 0f ef c0          	pxor   xmm0,xmm0
      ef92c3:	66 0f 7f 84 24 10 07 	movdqa XMMWORD PTR [rsp+0x710],xmm0
      ef92ca:	00 00 
      ef92cc:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
      ef92d0:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      ef92d4:	48 85 db             	test   rbx,rbx
      ef92d7:	74 05                	je     ef92de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc06f4>
      ef92d9:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ef92de:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef92e5:	00 
      ef92e6:	0f b7 4f 20          	movzx  ecx,WORD PTR [rdi+0x20]
      ef92ea:	66 89 48 28          	mov    WORD PTR [rax+0x28],cx
      ef92ee:	48 89 84 24 e0 0a 00 	mov    QWORD PTR [rsp+0xae0],rax
      ef92f5:	00 
      ef92f6:	e8 15 98 bf ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ef92fb:	48 83 bc 24 e0 0a 00 	cmp    QWORD PTR [rsp+0xae0],0x0
      ef9302:	00 00 
      ef9304:	0f 84 4a 01 00 00    	je     ef9454 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc086a>
      ef930a:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      ef9311:	00 
      ef9312:	48 8d b4 24 c0 0a 00 	lea    rsi,[rsp+0xac0]
      ef9319:	00 
      ef931a:	e8 23 f3 3c 00       	call   12c8642 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dbc6>
      ef931f:	bf f0 04 00 00       	mov    edi,0x4f0
      ef9324:	e8 d7 4b 8f 00       	call   17edf00 <_Znwm@plt>
      ef9329:	49 89 c7             	mov    r15,rax
      ef932c:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9330:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef9335:	48 8d 05 44 f2 99 00 	lea    rax,[rip+0x99f244]        # 1898580 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x54c0>
      ef933c:	49 89 07             	mov    QWORD PTR [r15],rax
      ef933f:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      ef9346:	00 
      ef9347:	48 8d b4 24 f0 05 00 	lea    rsi,[rsp+0x5f0]
      ef934e:	00 
      ef934f:	e8 ee f2 3c 00       	call   12c8642 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dbc6>
      ef9354:	6a 40                	push   0x40
      ef9356:	5f                   	pop    rdi
      ef9357:	e8 a4 4b 8f 00       	call   17edf00 <_Znwm@plt>
      ef935c:	48 89 c3             	mov    rbx,rax
      ef935f:	49 8d 6f 20          	lea    rbp,[r15+0x20]
      ef9363:	48 8d 05 4e f2 99 00 	lea    rax,[rip+0x99f24e]        # 18985b8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x54f8>
      ef936a:	48 89 03             	mov    QWORD PTR [rbx],rax
      ef936d:	48 89 df             	mov    rdi,rbx
      ef9370:	48 83 c7 10          	add    rdi,0x10
      ef9374:	4c 8d a4 24 40 02 00 	lea    r12,[rsp+0x240]
      ef937b:	00 
      ef937c:	4c 89 e6             	mov    rsi,r12
      ef937f:	e8 be f2 3c 00       	call   12c8642 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dbc6>
      ef9384:	4c 8d ac 24 10 07 00 	lea    r13,[rsp+0x710]
      ef938b:	00 
      ef938c:	49 89 5d 20          	mov    QWORD PTR [r13+0x20],rbx
      ef9390:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9394:	66 41 0f 7f 47 20    	movdqa XMMWORD PTR [r15+0x20],xmm0
      ef939a:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      ef939e:	e8 eb ee c2 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ef93a3:	31 c0                	xor    eax,eax
      ef93a5:	41 88 87 88 00 00 00 	mov    BYTE PTR [r15+0x88],al
      ef93ac:	41 88 87 a0 04 00 00 	mov    BYTE PTR [r15+0x4a0],al
      ef93b3:	4c 89 ff             	mov    rdi,r15
      ef93b6:	48 81 c7 b0 04 00 00 	add    rdi,0x4b0
      ef93bd:	4c 89 ee             	mov    rsi,r13
      ef93c0:	e8 e3 54 00 00       	call   efe8a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5cbe>
      ef93c5:	66 0f ef c0          	pxor   xmm0,xmm0
      ef93c9:	66 41 0f 7f 87 e0 04 	movdqa XMMWORD PTR [r15+0x4e0],xmm0
      ef93d0:	00 00 
      ef93d2:	4c 89 ef             	mov    rdi,r13
      ef93d5:	e8 90 0b b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef93da:	4c 89 e7             	mov    rdi,r12
      ef93dd:	e8 88 0b b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef93e2:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
      ef93e6:	48 85 ff             	test   rdi,rdi
      ef93e9:	74 0a                	je     ef93f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc080b>
      ef93eb:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      ef93ef:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
      ef93f3:	75 1f                	jne    ef9414 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc082a>
      ef93f5:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      ef93fa:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      ef93ff:	49 89 6f 20          	mov    QWORD PTR [r15+0x20],rbp
      ef9403:	4d 89 7f 28          	mov    QWORD PTR [r15+0x28],r15
      ef9407:	e8 a6 50 ba ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      ef940c:	4c 89 ff             	mov    rdi,r15
      ef940f:	e8 72 50 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9414:	31 ff                	xor    edi,edi
      ef9416:	e8 01 50 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ef941b:	48 8d 05 5e f2 99 00 	lea    rax,[rip+0x99f25e]        # 1898680 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x55c0>
      ef9422:	48 8d 8c 24 b0 06 00 	lea    rcx,[rsp+0x6b0]
      ef9429:	00 
      ef942a:	48 89 01             	mov    QWORD PTR [rcx],rax
      ef942d:	48 89 69 08          	mov    QWORD PTR [rcx+0x8],rbp
      ef9431:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15
      ef9435:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      ef9439:	31 ff                	xor    edi,edi
      ef943b:	e8 46 50 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9440:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      ef9447:	00 
      ef9448:	e8 1d 0b b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef944d:	4c 8b 64 24 68       	mov    r12,QWORD PTR [rsp+0x68]
      ef9452:	eb 09                	jmp    ef945d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0873>
      ef9454:	48 83 a4 24 d0 06 00 	and    QWORD PTR [rsp+0x6d0],0x0
      ef945b:	00 00 
      ef945d:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      ef9464:	00 
      ef9465:	e8 00 0b b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef946a:	4c 89 f7             	mov    rdi,r14
      ef946d:	e8 14 50 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9472:	31 ff                	xor    edi,edi
      ef9474:	e8 0d 50 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9479:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef947e:	4c 8b b8 00 02 00 00 	mov    r15,QWORD PTR [rax+0x200]
      ef9485:	49 83 7f 78 00       	cmp    QWORD PTR [r15+0x78],0x0
      ef948a:	74 3d                	je     ef94c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08df>
      ef948c:	49 8b 7f 70          	mov    rdi,QWORD PTR [r15+0x70]
      ef9490:	e8 49 e6 fa ff       	call   ea7ade <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6eef4>
      ef9495:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
      ef949a:	49 8b 47 68          	mov    rax,QWORD PTR [r15+0x68]
      ef949e:	48 85 c0             	test   rax,rax
      ef94a1:	74 13                	je     ef94b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08cc>
      ef94a3:	31 c9                	xor    ecx,ecx
      ef94a5:	49 8b 57 60          	mov    rdx,QWORD PTR [r15+0x60]
      ef94a9:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
      ef94ae:	48 ff c1             	inc    rcx
      ef94b1:	48 39 c8             	cmp    rax,rcx
      ef94b4:	75 ef                	jne    ef94a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08bb>
      ef94b6:	49 83 67 78 00       	and    QWORD PTR [r15+0x78],0x0
      ef94bb:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef94c0:	4c 8b b8 00 02 00 00 	mov    r15,QWORD PTR [rax+0x200]
      ef94c7:	eb 05                	jmp    ef94ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08e4>
      ef94c9:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef94ce:	48 8b 80 08 02 00 00 	mov    rax,QWORD PTR [rax+0x208]
      ef94d5:	48 85 c0             	test   rax,rax
      ef94d8:	74 05                	je     ef94df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc08f5>
      ef94da:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef94df:	49 8d 4c 24 10       	lea    rcx,[r12+0x10]
      ef94e4:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
      ef94eb:	00 
      ef94ec:	4d 8d 74 24 28       	lea    r14,[r12+0x28]
      ef94f1:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      ef94f6:	4c 8d a9 00 01 00 00 	lea    r13,[rcx+0x100]
      ef94fd:	80 b9 10 02 00 00 00 	cmp    BYTE PTR [rcx+0x210],0x0
      ef9504:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      ef950b:	00 
      ef950c:	4c 89 b4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r14
      ef9513:	00 
      ef9514:	0f 84 a7 00 00 00    	je     ef95c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc09d7>
      ef951a:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9521:	00 
      ef9522:	4c 89 ee             	mov    rsi,r13
      ef9525:	e8 01 51 00 00       	call   efe62b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a41>
      ef952a:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      ef9531:	00 
      ef9532:	4c 89 e7             	mov    rdi,r12
      ef9535:	48 89 de             	mov    rsi,rbx
      ef9538:	e8 df 02 bc ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ef953d:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ef9541:	e8 40 4f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9546:	48 8d 35 ad e0 47 ff 	lea    rsi,[rip+0xffffffffff47e0ad]        # 3775fa <_ZTSSt12bad_any_cast@@Base-0x18bce>
      ef954d:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9554:	00 
      ef9555:	e8 24 05 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ef955a:	4d 89 fc             	mov    r12,r15
      ef955d:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      ef9564:	00 
      ef9565:	4c 89 f7             	mov    rdi,r14
      ef9568:	e8 23 45 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      ef956d:	4c 8d ac 24 10 07 00 	lea    r13,[rsp+0x710]
      ef9574:	00 
      ef9575:	4c 89 ef             	mov    rdi,r13
      ef9578:	e8 13 49 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ef957d:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
      ef9582:	48 8b bb 40 02 00 00 	mov    rdi,QWORD PTR [rbx+0x240]
      ef9589:	e8 d4 0e b8 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      ef958e:	49 89 c7             	mov    r15,rax
      ef9591:	80 bb ba 01 00 00 00 	cmp    BYTE PTR [rbx+0x1ba],0x0
      ef9598:	0f 84 e4 00 00 00    	je     ef9682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0a98>
      ef959e:	8a 83 c8 01 00 00    	mov    al,BYTE PTR [rbx+0x1c8]
      ef95a4:	88 84 24 08 02 00 00 	mov    BYTE PTR [rsp+0x208],al
      ef95ab:	48 8b 83 c0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1c0]
      ef95b2:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
      ef95b9:	00 
      ef95ba:	b0 01                	mov    al,0x1
      ef95bc:	e9 cb 00 00 00       	jmp    ef968c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0aa2>
      ef95c1:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef95c8:	00 
      ef95c9:	4c 89 ee             	mov    rsi,r13
      ef95cc:	e8 5a 50 00 00       	call   efe62b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a41>
      ef95d1:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      ef95d8:	00 
      ef95d9:	4c 89 e7             	mov    rdi,r12
      ef95dc:	48 89 de             	mov    rsi,rbx
      ef95df:	e8 38 02 bc ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ef95e4:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ef95e8:	e8 99 4e ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef95ed:	48 8d 35 06 e0 47 ff 	lea    rsi,[rip+0xffffffffff47e006]        # 3775fa <_ZTSSt12bad_any_cast@@Base-0x18bce>
      ef95f4:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef95fb:	00 
      ef95fc:	e8 7d 04 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ef9601:	4c 89 ac 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r13
      ef9608:	00 
      ef9609:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
      ef9610:	00 
      ef9611:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      ef9618:	00 
      ef9619:	4c 89 f7             	mov    rdi,r14
      ef961c:	e8 6f 44 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      ef9621:	4c 8d ac 24 10 07 00 	lea    r13,[rsp+0x710]
      ef9628:	00 
      ef9629:	4c 89 ef             	mov    rdi,r13
      ef962c:	e8 5f 48 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ef9631:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9635:	66 0f 7f 84 24 c0 01 	movdqa XMMWORD PTR [rsp+0x1c0],xmm0
      ef963c:	00 00 
      ef963e:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
      ef9643:	48 8b bb 40 02 00 00 	mov    rdi,QWORD PTR [rbx+0x240]
      ef964a:	e8 13 0e b8 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      ef964f:	48 89 c5             	mov    rbp,rax
      ef9652:	80 bb ba 01 00 00 00 	cmp    BYTE PTR [rbx+0x1ba],0x0
      ef9659:	0f 84 cf 02 00 00    	je     ef992e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0d44>
      ef965f:	8a 83 c8 01 00 00    	mov    al,BYTE PTR [rbx+0x1c8]
      ef9665:	88 84 24 08 02 00 00 	mov    BYTE PTR [rsp+0x208],al
      ef966c:	48 8b 83 c0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1c0]
      ef9673:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
      ef967a:	00 
      ef967b:	b0 01                	mov    al,0x1
      ef967d:	e9 b6 02 00 00       	jmp    ef9938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0d4e>
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
      ef96e1:	48 83 a4 24 20 07 00 	and    QWORD PTR [rsp+0x720],0x0
      ef96e8:	00 00 
      ef96ea:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      ef96ef:	48 8d b1 a0 00 00 00 	lea    rsi,[rcx+0xa0]
      ef96f6:	48 8d 15 2b cf 93 00 	lea    rdx,[rip+0x93cf2b]        # 1836628 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x85c0>
      ef96fd:	48 89 94 24 10 07 00 	mov    QWORD PTR [rsp+0x710],rdx
      ef9704:	00 
      ef9705:	4c 89 ac 24 30 07 00 	mov    QWORD PTR [rsp+0x730],r13
      ef970c:	00 
      ef970d:	48 8b 91 58 02 00 00 	mov    rdx,QWORD PTR [rcx+0x258]
      ef9714:	66 0f 6f 81 50 02 00 	movdqa xmm0,XMMWORD PTR [rcx+0x250]
      ef971b:	00 
      ef971c:	66 0f 7f 84 24 20 02 	movdqa XMMWORD PTR [rsp+0x220],xmm0
      ef9723:	00 00 
      ef9725:	48 85 d2             	test   rdx,rdx
      ef9728:	74 05                	je     ef972f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0b45>
      ef972a:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
      ef972f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      ef9734:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      ef973b:	00 
      ef973c:	e8 4f 0b b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ef9741:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
      ef9746:	49 8d b6 d0 00 00 00 	lea    rsi,[r14+0xd0]
      ef974d:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      ef9754:	00 
      ef9755:	e8 36 0b b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ef975a:	49 8d b6 60 02 00 00 	lea    rsi,[r14+0x260]
      ef9761:	48 8d 9c 24 c0 0a 00 	lea    rbx,[rsp+0xac0]
      ef9768:	00 
      ef9769:	48 89 df             	mov    rdi,rbx
      ef976c:	e8 1f 0b b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ef9771:	48 8d 35 2d a1 43 ff 	lea    rsi,[rip+0xffffffffff43a12d]        # 3338a5 <_ZTSSt12bad_any_cast@@Base-0x5c923>
      ef9778:	4c 8d b4 24 e0 06 00 	lea    r14,[rsp+0x6e0]
      ef977f:	00 
      ef9780:	4c 89 f7             	mov    rdi,r14
      ef9783:	e8 f6 02 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ef9788:	4c 8b 64 24 70       	mov    r12,QWORD PTR [rsp+0x70]
      ef978d:	4d 89 e5             	mov    r13,r12
      ef9790:	49 83 c5 20          	add    r13,0x20
      ef9794:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef9799:	0f b6 80 d4 01 00 00 	movzx  eax,BYTE PTR [rax+0x1d4]
      ef97a0:	48 8b 6c 24 68       	mov    rbp,QWORD PTR [rsp+0x68]
      ef97a5:	48 8b 75 00          	mov    rsi,QWORD PTR [rbp+0x0]
      ef97a9:	48 8b 55 08          	mov    rdx,QWORD PTR [rbp+0x8]
      ef97ad:	48 8b 8c 24 10 02 00 	mov    rcx,QWORD PTR [rsp+0x210]
      ef97b4:	00 
      ef97b5:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
      ef97ba:	f3 0f 6f 84 24 00 02 	movdqu xmm0,XMMWORD PTR [rsp+0x200]
      ef97c1:	00 00 
      ef97c3:	f3 0f 7f 44 24 38    	movdqu XMMWORD PTR [rsp+0x38],xmm0
      ef97c9:	89 44 24 28          	mov    DWORD PTR [rsp+0x28],eax
      ef97cd:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
      ef97d2:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      ef97d7:	48 8d 84 24 f0 05 00 	lea    rax,[rsp+0x5f0]
      ef97de:	00 
      ef97df:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ef97e4:	48 8d 84 24 40 02 00 	lea    rax,[rsp+0x240]
      ef97eb:	00 
      ef97ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef97f0:	83 64 24 50 00       	and    DWORD PTR [rsp+0x50],0x0
      ef97f5:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
      ef97fb:	48 c7 44 24 18 0a 00 	mov    QWORD PTR [rsp+0x18],0xa
      ef9802:	00 00 
      ef9804:	48 8d 8c 24 10 07 00 	lea    rcx,[rsp+0x710]
      ef980b:	00 
      ef980c:	4c 8d 8c 24 20 02 00 	lea    r9,[rsp+0x220]
      ef9813:	00 
      ef9814:	4c 89 ef             	mov    rdi,r13
      ef9817:	4d 89 f8             	mov    r8,r15
      ef981a:	e8 15 d2 04 00       	call   f46a34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10de4a>
      ef981f:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      ef9826:	00 
      ef9827:	e8 64 46 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ef982c:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      ef9833:	00 
      ef9834:	e8 31 07 b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef9839:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      ef9840:	00 
      ef9841:	e8 24 07 b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef9846:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      ef984d:	00 
      ef984e:	e8 17 07 b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef9853:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
      ef985a:	00 
      ef985b:	e8 26 4c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9860:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9867:	00 
      ef9868:	e8 fd 06 b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef986d:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      ef9874:	00 
      ef9875:	e8 0c 4c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef987a:	48 8d 9c 24 a0 01 00 	lea    rbx,[rsp+0x1a0]
      ef9881:	00 
      ef9882:	48 89 df             	mov    rdi,rbx
      ef9885:	4c 89 ee             	mov    rsi,r13
      ef9888:	4c 89 e2             	mov    rdx,r12
      ef988b:	e8 74 4f 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      ef9890:	31 ff                	xor    edi,edi
      ef9892:	e8 85 4b ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ef9897:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      ef989b:	66 0f ef c9          	pxor   xmm1,xmm1
      ef989f:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      ef98a3:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
      ef98a7:	f3 0f 7f 45 00       	movdqu XMMWORD PTR [rbp+0x0],xmm0
      ef98ac:	e8 d5 4b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef98b1:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ef98b5:	e8 cc 4b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef98ba:	48 8d 35 e4 9f 43 ff 	lea    rsi,[rip+0xffffffffff439fe4]        # 3338a5 <_ZTSSt12bad_any_cast@@Base-0x5c923>
      ef98c1:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef98c8:	00 
      ef98c9:	49 89 ed             	mov    r13,rbp
      ef98cc:	e8 ad 01 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ef98d1:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      ef98d8:	00 
      ef98d9:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      ef98e0:	00 
      ef98e1:	e8 aa 41 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      ef98e6:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef98ed:	00 
      ef98ee:	e8 9d 45 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ef98f3:	48 8d 35 bc 3f 48 ff 	lea    rsi,[rip+0xffffffffff483fbc]        # 37d8b6 <_ZTSSt12bad_any_cast@@Base-0x12912>
      ef98fa:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9901:	00 
      ef9902:	e8 77 01 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ef9907:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      ef990e:	00 
      ef990f:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
      ef9916:	00 
      ef9917:	e8 74 41 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      ef991c:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9923:	00 
      ef9924:	e8 67 45 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ef9929:	e9 8b 41 00 00       	jmp    efdab9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4ecf>
      ef992e:	c6 84 24 00 02 00 00 	mov    BYTE PTR [rsp+0x200],0x0
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
      ef9990:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
      ef9997:	00 
      ef9998:	48 89 84 24 18 07 00 	mov    QWORD PTR [rsp+0x718],rax
      ef999f:	00 
      ef99a0:	48 83 a4 24 20 07 00 	and    QWORD PTR [rsp+0x720],0x0
      ef99a7:	00 00 
      ef99a9:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      ef99ae:	48 8d b1 a0 00 00 00 	lea    rsi,[rcx+0xa0]
      ef99b5:	48 8d 05 6c cc 93 00 	lea    rax,[rip+0x93cc6c]        # 1836628 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x85c0>
      ef99bc:	48 89 84 24 10 07 00 	mov    QWORD PTR [rsp+0x710],rax
      ef99c3:	00 
      ef99c4:	4c 89 ac 24 30 07 00 	mov    QWORD PTR [rsp+0x730],r13
      ef99cb:	00 
      ef99cc:	48 8b 81 58 02 00 00 	mov    rax,QWORD PTR [rcx+0x258]
      ef99d3:	66 0f 6f 81 50 02 00 	movdqa xmm0,XMMWORD PTR [rcx+0x250]
      ef99da:	00 
      ef99db:	66 0f 7f 84 24 20 02 	movdqa XMMWORD PTR [rsp+0x220],xmm0
      ef99e2:	00 00 
      ef99e4:	48 85 c0             	test   rax,rax
      ef99e7:	74 05                	je     ef99ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0e04>
      ef99e9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef99ee:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      ef99f5:	00 
      ef99f6:	48 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rsi
      ef99fd:	00 
      ef99fe:	e8 8d 08 b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ef9a03:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
      ef9a08:	49 8d b6 d0 00 00 00 	lea    rsi,[r14+0xd0]
      ef9a0f:	48 8d 9c 24 f0 05 00 	lea    rbx,[rsp+0x5f0]
      ef9a16:	00 
      ef9a17:	48 89 df             	mov    rdi,rbx
      ef9a1a:	48 89 b4 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rsi
      ef9a21:	00 
      ef9a22:	e8 69 08 b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ef9a27:	49 8d b6 60 02 00 00 	lea    rsi,[r14+0x260]
      ef9a2e:	4c 8d b4 24 c0 0a 00 	lea    r14,[rsp+0xac0]
      ef9a35:	00 
      ef9a36:	4c 89 f7             	mov    rdi,r14
      ef9a39:	48 89 b4 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rsi
      ef9a40:	00 
      ef9a41:	e8 4a 08 b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ef9a46:	48 8d 35 58 9e 43 ff 	lea    rsi,[rip+0xffffffffff439e58]        # 3338a5 <_ZTSSt12bad_any_cast@@Base-0x5c923>
      ef9a4d:	4c 8d a4 24 e0 06 00 	lea    r12,[rsp+0x6e0]
      ef9a54:	00 
      ef9a55:	4c 89 e7             	mov    rdi,r12
      ef9a58:	e8 21 00 b8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ef9a5d:	4d 89 fd             	mov    r13,r15
      ef9a60:	49 83 c5 20          	add    r13,0x20
      ef9a64:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]
      ef9a69:	0f b6 82 d4 01 00 00 	movzx  eax,BYTE PTR [rdx+0x1d4]
      ef9a70:	48 8b 8a e8 01 00 00 	mov    rcx,QWORD PTR [rdx+0x1e8]
      ef9a77:	0f b6 ba f5 01 00 00 	movzx  edi,BYTE PTR [rdx+0x1f5]
      ef9a7e:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
      ef9a83:	48 8b 32             	mov    rsi,QWORD PTR [rdx]
      ef9a86:	48 8b 52 08          	mov    rdx,QWORD PTR [rdx+0x8]
      ef9a8a:	4c 8b 84 24 10 02 00 	mov    r8,QWORD PTR [rsp+0x210]
      ef9a91:	00 
      ef9a92:	4c 89 44 24 48       	mov    QWORD PTR [rsp+0x48],r8
      ef9a97:	f3 0f 6f 84 24 00 02 	movdqu xmm0,XMMWORD PTR [rsp+0x200]
      ef9a9e:	00 00 
      ef9aa0:	f3 0f 7f 44 24 38    	movdqu XMMWORD PTR [rsp+0x38],xmm0
      ef9aa6:	89 7c 24 50          	mov    DWORD PTR [rsp+0x50],edi
      ef9aaa:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
      ef9aaf:	89 44 24 28          	mov    DWORD PTR [rsp+0x28],eax
      ef9ab3:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
      ef9ab8:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      ef9abd:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ef9ac2:	48 8d 84 24 40 02 00 	lea    rax,[rsp+0x240]
      ef9ac9:	00 
      ef9aca:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef9ace:	48 c7 44 24 18 0a 00 	mov    QWORD PTR [rsp+0x18],0xa
      ef9ad5:	00 00 
      ef9ad7:	48 8d 8c 24 10 07 00 	lea    rcx,[rsp+0x710]
      ef9ade:	00 
      ef9adf:	4c 8d 8c 24 20 02 00 	lea    r9,[rsp+0x220]
      ef9ae6:	00 
      ef9ae7:	4c 89 ef             	mov    rdi,r13
      ef9aea:	49 89 e8             	mov    r8,rbp
      ef9aed:	e8 42 cf 04 00       	call   f46a34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10de4a>
      ef9af2:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      ef9af9:	00 
      ef9afa:	e8 91 43 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ef9aff:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      ef9b06:	00 
      ef9b07:	e8 5e 04 b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef9b0c:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      ef9b13:	00 
      ef9b14:	e8 51 04 b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef9b19:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      ef9b20:	00 
      ef9b21:	e8 44 04 b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef9b26:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
      ef9b2d:	00 
      ef9b2e:	e8 53 49 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9b33:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9b3a:	00 
      ef9b3b:	e8 2a 04 b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef9b40:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      ef9b47:	00 
      ef9b48:	e8 39 49 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9b4d:	48 8d 9c 24 a0 01 00 	lea    rbx,[rsp+0x1a0]
      ef9b54:	00 
      ef9b55:	48 89 df             	mov    rdi,rbx
      ef9b58:	4c 89 ee             	mov    rsi,r13
      ef9b5b:	4c 89 fa             	mov    rdx,r15
      ef9b5e:	e8 a1 4c 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      ef9b63:	31 ff                	xor    edi,edi
      ef9b65:	e8 b2 48 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ef9b6a:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      ef9b6e:	66 0f ef c9          	pxor   xmm1,xmm1
      ef9b72:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      ef9b76:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
      ef9b7d:	00 
      ef9b7e:	66 0f 7f 84 24 c0 01 	movdqa XMMWORD PTR [rsp+0x1c0],xmm0
      ef9b85:	00 00 
      ef9b87:	e8 fa 48 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9b8c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ef9b90:	e8 f1 48 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9b95:	6a 60                	push   0x60
      ef9b97:	5f                   	pop    rdi
      ef9b98:	e8 63 43 8f 00       	call   17edf00 <_Znwm@plt>
      ef9b9d:	49 89 c6             	mov    r14,rax
      ef9ba0:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9ba4:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef9ba9:	48 8d 05 10 0c 94 00 	lea    rax,[rip+0x940c10]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      ef9bb0:	49 89 06             	mov    QWORD PTR [r14],rax
      ef9bb3:	66 0f 6f 84 24 c0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1c0]
      ef9bba:	00 00 
      ef9bbc:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
      ef9bc3:	00 
      ef9bc4:	48 85 c0             	test   rax,rax
      ef9bc7:	74 13                	je     ef9bdc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0ff2>
      ef9bc9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef9bce:	4c 89 f3             	mov    rbx,r14
      ef9bd1:	48 83 c3 18          	add    rbx,0x18
      ef9bd5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef9bda:	eb 07                	jmp    ef9be3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0ff9>
      ef9bdc:	4c 89 f3             	mov    rbx,r14
      ef9bdf:	48 83 c3 18          	add    rbx,0x18
      ef9be3:	48 8d 05 de 99 94 00 	lea    rax,[rip+0x9499de]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      ef9bea:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ef9bee:	66 0f ef c9          	pxor   xmm1,xmm1
      ef9bf2:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
      ef9bf8:	48 8d 05 39 41 94 00 	lea    rax,[rip+0x944139]        # 183dd38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xfcd0>
      ef9bff:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ef9c03:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
      ef9c09:	66 49 0f 3a 16 c7 01 	pextrq r15,xmm0,0x1
      ef9c10:	4d 85 ff             	test   r15,r15
      ef9c13:	74 05                	je     ef9c1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1030>
      ef9c15:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      ef9c1a:	48 8d 05 3f 41 94 00 	lea    rax,[rip+0x94413f]        # 183dd60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xfcf8>
      ef9c21:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ef9c25:	48 8d 05 24 41 94 00 	lea    rax,[rip+0x944124]        # 183dd50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xfce8>
      ef9c2c:	41 bc f8 01 00 00    	mov    r12d,0x1f8
      ef9c32:	4c 01 e0             	add    rax,r12
      ef9c35:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ef9c39:	4c 89 ff             	mov    rdi,r15
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
      ef9c78:	00 
      ef9c79:	4c 89 ff             	mov    rdi,r15
      ef9c7c:	48 89 de             	mov    rsi,rbx
      ef9c7f:	4c 89 f2             	mov    rdx,r14
      ef9c82:	e8 7d 4b 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      ef9c87:	31 ff                	xor    edi,edi
      ef9c89:	e8 8e 47 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ef9c8e:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
      ef9c93:	66 0f ef c9          	pxor   xmm1,xmm1
      ef9c97:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
      ef9c9c:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
      ef9ca3:	00 
      ef9ca4:	66 0f 7f 84 24 c0 01 	movdqa XMMWORD PTR [rsp+0x1c0],xmm0
      ef9cab:	00 00 
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
      ef9d0c:	e8 a3 7c 04 00       	call   f419b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108dca>
      ef9d11:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
      ef9d17:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ef9d1e:	e8 63 47 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9d23:	4c 8d bc 24 10 07 00 	lea    r15,[rsp+0x710]
      ef9d2a:	00 
      ef9d2b:	4c 89 ff             	mov    rdi,r15
      ef9d2e:	4c 89 f6             	mov    rsi,r14
      ef9d31:	48 89 da             	mov    rdx,rbx
      ef9d34:	e8 cb 4a 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      ef9d39:	31 ff                	xor    edi,edi
      ef9d3b:	e8 dc 46 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ef9d40:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      ef9d47:	00 
      ef9d48:	4c 89 fe             	mov    rsi,r15
      ef9d4b:	e8 cc fa bb ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      ef9d50:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      ef9d54:	e8 2d 47 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9d59:	bf 30 01 00 00       	mov    edi,0x130
      ef9d5e:	e8 9d 41 8f 00       	call   17edf00 <_Znwm@plt>
      ef9d63:	49 89 c6             	mov    r14,rax
      ef9d66:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9d6a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef9d6f:	48 8d 05 4a 0a 94 00 	lea    rax,[rip+0x940a4a]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      ef9d76:	49 89 06             	mov    QWORD PTR [r14],rax
      ef9d79:	66 0f 6f 84 24 c0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1c0]
      ef9d80:	00 00 
      ef9d82:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
      ef9d89:	00 
      ef9d8a:	48 85 c0             	test   rax,rax
      ef9d8d:	74 13                	je     ef9da2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc11b8>
      ef9d8f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef9d94:	4c 89 f3             	mov    rbx,r14
      ef9d97:	48 83 c3 18          	add    rbx,0x18
      ef9d9b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef9da0:	eb 07                	jmp    ef9da9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc11bf>
      ef9da2:	4c 89 f3             	mov    rbx,r14
      ef9da5:	48 83 c3 18          	add    rbx,0x18
      ef9da9:	48 8d 05 18 98 94 00 	lea    rax,[rip+0x949818]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      ef9db0:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ef9db4:	66 0f ef c9          	pxor   xmm1,xmm1
      ef9db8:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
      ef9dbe:	48 8d 05 ab 8a 94 00 	lea    rax,[rip+0x948aab]        # 1842870 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14808>
      ef9dc5:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ef9dc9:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
      ef9dcf:	66 49 0f 3a 16 c7 01 	pextrq r15,xmm0,0x1
      ef9dd6:	4d 85 ff             	test   r15,r15
      ef9dd9:	74 05                	je     ef9de0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc11f6>
      ef9ddb:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      ef9de0:	48 8d 05 79 88 94 00 	lea    rax,[rip+0x948879]        # 1842660 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x145f8>
      ef9de7:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ef9deb:	48 8d 05 56 8a 94 00 	lea    rax,[rip+0x948a56]        # 1842848 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x147e0>
      ef9df2:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ef9df6:	4c 89 ff             	mov    rdi,r15
      ef9df9:	e8 88 46 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9dfe:	48 8d 05 43 86 94 00 	lea    rax,[rip+0x948643]        # 1842448 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x143e0>
      ef9e05:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ef9e09:	48 8d 05 28 88 94 00 	lea    rax,[rip+0x948828]        # 1842638 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x145d0>
      ef9e10:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ef9e14:	31 c0                	xor    eax,eax
      ef9e16:	41 88 46 48          	mov    BYTE PTR [r14+0x48],al
      ef9e1a:	41 88 46 50          	mov    BYTE PTR [r14+0x50],al
      ef9e1e:	41 88 86 28 01 00 00 	mov    BYTE PTR [r14+0x128],al
      ef9e25:	4c 89 ff             	mov    rdi,r15
      ef9e28:	e8 59 46 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9e2d:	4c 8d bc 24 10 07 00 	lea    r15,[rsp+0x710]
      ef9e34:	00 
      ef9e35:	4c 89 ff             	mov    rdi,r15
      ef9e38:	48 89 de             	mov    rsi,rbx
      ef9e3b:	4c 89 f2             	mov    rdx,r14
      ef9e3e:	e8 c1 49 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      ef9e43:	31 ff                	xor    edi,edi
      ef9e45:	e8 d2 45 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ef9e4a:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
      ef9e4f:	66 0f ef c9          	pxor   xmm1,xmm1
      ef9e53:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
      ef9e58:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
      ef9e5f:	00 
      ef9e60:	66 0f 7f 84 24 c0 01 	movdqa XMMWORD PTR [rsp+0x1c0],xmm0
      ef9e67:	00 00 
      ef9e69:	e8 18 46 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9e6e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      ef9e72:	e8 0f 46 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9e77:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef9e7c:	4c 8d b8 90 02 00 00 	lea    r15,[rax+0x290]
      ef9e83:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9e8a:	00 
      ef9e8b:	4c 89 fe             	mov    rsi,r15
      ef9e8e:	e8 fd 03 b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ef9e93:	bf 90 00 00 00       	mov    edi,0x90
      ef9e98:	e8 63 40 8f 00       	call   17edf00 <_Znwm@plt>
      ef9e9d:	49 89 c4             	mov    r12,rax
      ef9ea0:	49 89 c6             	mov    r14,rax
      ef9ea3:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9ea7:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
      ef9eae:	48 8d 05 13 0f 91 00 	lea    rax,[rip+0x910f13]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      ef9eb5:	49 89 04 24          	mov    QWORD PTR [r12],rax
      ef9eb9:	48 8d 05 c0 ab 94 00 	lea    rax,[rip+0x94abc0]        # 1844a80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1168>
      ef9ec0:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      ef9ec5:	49 8d 5c 24 30       	lea    rbx,[r12+0x30]
      ef9eca:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      ef9ed1:	00 
      ef9ed2:	48 89 df             	mov    rdi,rbx
      ef9ed5:	e8 a6 e0 d6 ff       	call   c67f80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b4f20>
      ef9eda:	49 83 a4 24 80 00 00 	and    QWORD PTR [r12+0x80],0x0
      ef9ee1:	00 00 
      ef9ee3:	bf d0 84 00 00       	mov    edi,0x84d0
      ef9ee8:	e8 13 40 8f 00       	call   17edf00 <_Znwm@plt>
      ef9eed:	4c 89 a4 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],r12
      ef9ef4:	00 
      ef9ef5:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
      ef9ef9:	48 89 c1             	mov    rcx,rax
      ef9efc:	48 81 c1 d0 84 00 00 	add    rcx,0x84d0
      ef9f03:	49 89 4e 68          	mov    QWORD PTR [r14+0x68],rcx
      ef9f07:	49 89 46 78          	mov    QWORD PTR [r14+0x78],rax
      ef9f0b:	49 89 46 70          	mov    QWORD PTR [r14+0x70],rax
      ef9f0f:	31 ff                	xor    edi,edi
      ef9f11:	e8 06 45 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ef9f16:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef9f1d:	00 
      ef9f1e:	e8 47 00 b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef9f23:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef9f28:	66 0f 6f 80 c0 02 00 	movdqa xmm0,XMMWORD PTR [rax+0x2c0]
      ef9f2f:	00 
      ef9f30:	48 8b 98 c8 02 00 00 	mov    rbx,QWORD PTR [rax+0x2c8]
      ef9f37:	48 85 db             	test   rbx,rbx
      ef9f3a:	74 05                	je     ef9f41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1357>
      ef9f3c:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ef9f41:	66 48 0f 7e c0       	movq   rax,xmm0
      ef9f46:	66 49 0f 3a 16 c5 01 	pextrq r13,xmm0,0x1
      ef9f4d:	4d 85 ed             	test   r13,r13
      ef9f50:	66 0f 7f 44 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm0
      ef9f56:	74 0f                	je     ef9f67 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc137d>
      ef9f58:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      ef9f5d:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      ef9f62:	4c 89 e9             	mov    rcx,r13
      ef9f65:	eb 02                	jmp    ef9f69 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc137f>
      ef9f67:	31 c9                	xor    ecx,ecx
      ef9f69:	48 89 84 24 f0 05 00 	mov    QWORD PTR [rsp+0x5f0],rax
      ef9f70:	00 
      ef9f71:	48 89 8c 24 f8 05 00 	mov    QWORD PTR [rsp+0x5f8],rcx
      ef9f78:	00 
      ef9f79:	6a 20                	push   0x20
      ef9f7b:	5f                   	pop    rdi
      ef9f7c:	4c 89 b4 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r14
      ef9f83:	00 
      ef9f84:	4c 89 ac 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r13
      ef9f8b:	00 
      ef9f8c:	e8 6f 3f 8f 00       	call   17edf00 <_Znwm@plt>
      ef9f91:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9f95:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef9f9a:	48 8d 0d c7 34 90 00 	lea    rcx,[rip+0x9034c7]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      ef9fa1:	48 89 08             	mov    QWORD PTR [rax],rcx
      ef9fa4:	48 89 c1             	mov    rcx,rax
      ef9fa7:	48 83 c1 18          	add    rcx,0x18
      ef9fab:	48 8d 15 4e b1 94 00 	lea    rdx,[rip+0x94b14e]        # 1845100 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17e8>
      ef9fb2:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      ef9fb6:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ef9fbd:	00 
      ef9fbe:	48 89 4f f0          	mov    QWORD PTR [rdi-0x10],rcx
      ef9fc2:	48 89 47 f8          	mov    QWORD PTR [rdi-0x8],rax
      ef9fc6:	ba a0 00 00 00       	mov    edx,0xa0
      ef9fcb:	31 f6                	xor    esi,esi
      ef9fcd:	e8 be 4b 8f 00       	call   17eeb90 <memset@plt>
      ef9fd2:	4c 89 ef             	mov    rdi,r13
      ef9fd5:	e8 ac 44 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9fda:	6a 20                	push   0x20
      ef9fdc:	5f                   	pop    rdi
      ef9fdd:	e8 1e 3f 8f 00       	call   17edf00 <_Znwm@plt>
      ef9fe2:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9fe6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef9feb:	48 8d 0d 76 34 90 00 	lea    rcx,[rip+0x903476]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      ef9ff2:	48 89 08             	mov    QWORD PTR [rax],rcx
      ef9ff5:	48 89 c1             	mov    rcx,rax
      ef9ff8:	48 83 c1 18          	add    rcx,0x18
      ef9ffc:	48 8d 15 c5 ba 94 00 	lea    rdx,[rip+0x94bac5]        # 1845ac8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21b0>
      efa003:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa007:	48 89 8c 24 30 06 00 	mov    QWORD PTR [rsp+0x630],rcx
      efa00e:	00 
      efa00f:	48 8b bc 24 38 06 00 	mov    rdi,QWORD PTR [rsp+0x638]
      efa016:	00 
      efa017:	48 89 84 24 38 06 00 	mov    QWORD PTR [rsp+0x638],rax
      efa01e:	00 
      efa01f:	e8 62 44 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa024:	6a 20                	push   0x20
      efa026:	5f                   	pop    rdi
      efa027:	e8 d4 3e 8f 00       	call   17edf00 <_Znwm@plt>
      efa02c:	66 0f ef c0          	pxor   xmm0,xmm0
      efa030:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa035:	48 8d 0d 2c 34 90 00 	lea    rcx,[rip+0x90342c]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa03c:	48 89 08             	mov    QWORD PTR [rax],rcx
      efa03f:	48 89 c1             	mov    rcx,rax
      efa042:	48 83 c1 18          	add    rcx,0x18
      efa046:	48 8d 15 9b bc 94 00 	lea    rdx,[rip+0x94bc9b]        # 1845ce8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23d0>
      efa04d:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa051:	48 89 8c 24 70 06 00 	mov    QWORD PTR [rsp+0x670],rcx
      efa058:	00 
      efa059:	48 8b bc 24 78 06 00 	mov    rdi,QWORD PTR [rsp+0x678]
      efa060:	00 
      efa061:	48 89 84 24 78 06 00 	mov    QWORD PTR [rsp+0x678],rax
      efa068:	00 
      efa069:	e8 18 44 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa06e:	6a 20                	push   0x20
      efa070:	5f                   	pop    rdi
      efa071:	e8 8a 3e 8f 00       	call   17edf00 <_Znwm@plt>
      efa076:	66 0f ef c0          	pxor   xmm0,xmm0
      efa07a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa07f:	48 8d 0d e2 33 90 00 	lea    rcx,[rip+0x9033e2]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa086:	48 89 08             	mov    QWORD PTR [rax],rcx
      efa089:	48 89 c1             	mov    rcx,rax
      efa08c:	48 83 c1 18          	add    rcx,0x18
      efa090:	48 8d 15 81 ba 94 00 	lea    rdx,[rip+0x94ba81]        # 1845b18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2200>
      efa097:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa09b:	48 89 8c 24 60 06 00 	mov    QWORD PTR [rsp+0x660],rcx
      efa0a2:	00 
      efa0a3:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
      efa0aa:	00 
      efa0ab:	48 89 84 24 68 06 00 	mov    QWORD PTR [rsp+0x668],rax
      efa0b2:	00 
      efa0b3:	e8 ce 43 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa0b8:	6a 20                	push   0x20
      efa0ba:	5f                   	pop    rdi
      efa0bb:	e8 40 3e 8f 00       	call   17edf00 <_Znwm@plt>
      efa0c0:	66 0f ef c0          	pxor   xmm0,xmm0
      efa0c4:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa0c9:	48 8d 0d 98 33 90 00 	lea    rcx,[rip+0x903398]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa0d0:	48 89 08             	mov    QWORD PTR [rax],rcx
      efa0d3:	48 89 c1             	mov    rcx,rax
      efa0d6:	48 83 c1 18          	add    rcx,0x18
      efa0da:	48 8d 15 df bb 94 00 	lea    rdx,[rip+0x94bbdf]        # 1845cc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a8>
      efa0e1:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa0e5:	48 89 8c 24 80 06 00 	mov    QWORD PTR [rsp+0x680],rcx
      efa0ec:	00 
      efa0ed:	48 8b bc 24 88 06 00 	mov    rdi,QWORD PTR [rsp+0x688]
      efa0f4:	00 
      efa0f5:	48 89 84 24 88 06 00 	mov    QWORD PTR [rsp+0x688],rax
      efa0fc:	00 
      efa0fd:	e8 84 43 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa102:	6a 20                	push   0x20
      efa104:	5f                   	pop    rdi
      efa105:	e8 f6 3d 8f 00       	call   17edf00 <_Znwm@plt>
      efa10a:	66 0f ef c0          	pxor   xmm0,xmm0
      efa10e:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa113:	48 8d 0d 4e 33 90 00 	lea    rcx,[rip+0x90334e]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa11a:	48 89 08             	mov    QWORD PTR [rax],rcx
      efa11d:	48 89 c1             	mov    rcx,rax
      efa120:	48 83 c1 18          	add    rcx,0x18
      efa124:	48 8d 15 35 bb 94 00 	lea    rdx,[rip+0x94bb35]        # 1845c60 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2348>
      efa12b:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa12f:	48 89 8c 24 90 06 00 	mov    QWORD PTR [rsp+0x690],rcx
      efa136:	00 
      efa137:	48 8b bc 24 98 06 00 	mov    rdi,QWORD PTR [rsp+0x698]
      efa13e:	00 
      efa13f:	48 89 84 24 98 06 00 	mov    QWORD PTR [rsp+0x698],rax
      efa146:	00 
      efa147:	e8 3a 43 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa14c:	6a 20                	push   0x20
      efa14e:	5f                   	pop    rdi
      efa14f:	e8 ac 3d 8f 00       	call   17edf00 <_Znwm@plt>
      efa154:	66 0f ef c0          	pxor   xmm0,xmm0
      efa158:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa15d:	48 8d 0d 04 33 90 00 	lea    rcx,[rip+0x903304]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa164:	48 89 08             	mov    QWORD PTR [rax],rcx
      efa167:	48 89 c1             	mov    rcx,rax
      efa16a:	48 83 c1 18          	add    rcx,0x18
      efa16e:	48 8d 15 7b b9 94 00 	lea    rdx,[rip+0x94b97b]        # 1845af0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21d8>
      efa175:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa179:	48 89 8c 24 40 06 00 	mov    QWORD PTR [rsp+0x640],rcx
      efa180:	00 
      efa181:	48 8b bc 24 48 06 00 	mov    rdi,QWORD PTR [rsp+0x648]
      efa188:	00 
      efa189:	48 89 84 24 48 06 00 	mov    QWORD PTR [rsp+0x648],rax
      efa190:	00 
      efa191:	e8 f0 42 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa196:	6a 20                	push   0x20
      efa198:	5f                   	pop    rdi
      efa199:	e8 62 3d 8f 00       	call   17edf00 <_Znwm@plt>
      efa19e:	66 0f ef c0          	pxor   xmm0,xmm0
      efa1a2:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa1a7:	48 8d 0d ba 32 90 00 	lea    rcx,[rip+0x9032ba]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa1ae:	48 89 08             	mov    QWORD PTR [rax],rcx
      efa1b1:	48 89 c1             	mov    rcx,rax
      efa1b4:	48 83 c1 18          	add    rcx,0x18
      efa1b8:	48 8d 15 f1 b4 94 00 	lea    rdx,[rip+0x94b4f1]        # 18456b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d98>
      efa1bf:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa1c3:	48 89 8c 24 50 06 00 	mov    QWORD PTR [rsp+0x650],rcx
      efa1ca:	00 
      efa1cb:	48 8b bc 24 58 06 00 	mov    rdi,QWORD PTR [rsp+0x658]
      efa1d2:	00 
      efa1d3:	48 89 84 24 58 06 00 	mov    QWORD PTR [rsp+0x658],rax
      efa1da:	00 
      efa1db:	e8 a6 42 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa1e0:	6a 30                	push   0x30
      efa1e2:	5f                   	pop    rdi
      efa1e3:	e8 18 3d 8f 00       	call   17edf00 <_Znwm@plt>
      efa1e8:	49 89 c5             	mov    r13,rax
      efa1eb:	66 0f ef c0          	pxor   xmm0,xmm0
      efa1ef:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa1f4:	48 8d 05 6d 32 90 00 	lea    rax,[rip+0x90326d]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa1fb:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      efa1ff:	48 8d 05 f2 a9 94 00 	lea    rax,[rip+0x94a9f2]        # 1844bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x12e0>
      efa206:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      efa20a:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
      efa210:	f3 41 0f 7f 45 20    	movdqu XMMWORD PTR [r13+0x20],xmm0
      efa216:	48 85 db             	test   rbx,rbx
      efa219:	74 05                	je     efa220 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1636>
      efa21b:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      efa220:	6a 20                	push   0x20
      efa222:	5f                   	pop    rdi
      efa223:	e8 d8 3c 8f 00       	call   17edf00 <_Znwm@plt>
      efa228:	48 89 c5             	mov    rbp,rax
      efa22b:	66 0f ef c0          	pxor   xmm0,xmm0
      efa22f:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa234:	48 8d 05 2d 32 90 00 	lea    rax,[rip+0x90322d]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa23b:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      efa23f:	48 8d 05 0a af 94 00 	lea    rax,[rip+0x94af0a]        # 1845150 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1838>
      efa246:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
      efa24a:	bf 90 00 00 00       	mov    edi,0x90
      efa24f:	e8 ac 3c 8f 00       	call   17edf00 <_Znwm@plt>
      efa254:	49 89 c6             	mov    r14,rax
      efa257:	4c 89 e8             	mov    rax,r13
      efa25a:	48 83 c0 18          	add    rax,0x18
      efa25e:	48 89 e9             	mov    rcx,rbp
      efa261:	48 83 c1 18          	add    rcx,0x18
      efa265:	66 0f ef c0          	pxor   xmm0,xmm0
      efa269:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efa26f:	48 8d 15 f2 31 90 00 	lea    rdx,[rip+0x9031f2]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa276:	49 89 16             	mov    QWORD PTR [r14],rdx
      efa279:	4d 89 f4             	mov    r12,r14
      efa27c:	49 83 c4 18          	add    r12,0x18
      efa280:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
      efa286:	48 8d 15 03 ad 94 00 	lea    rdx,[rip+0x94ad03]        # 1844f90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1678>
      efa28d:	49 89 56 18          	mov    QWORD PTR [r14+0x18],rdx
      efa291:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
      efa297:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
      efa29b:	4d 89 6e 48          	mov    QWORD PTR [r14+0x48],r13
      efa29f:	f3 41 0f 7f 46 50    	movdqu XMMWORD PTR [r14+0x50],xmm0
      efa2a5:	49 89 4e 60          	mov    QWORD PTR [r14+0x60],rcx
      efa2a9:	49 89 6e 68          	mov    QWORD PTR [r14+0x68],rbp
      efa2ad:	f3 41 0f 7f 46 70    	movdqu XMMWORD PTR [r14+0x70],xmm0
      efa2b3:	f3 41 0f 7f 86 80 00 	movdqu XMMWORD PTR [r14+0x80],xmm0
      efa2ba:	00 00 
      efa2bc:	31 ff                	xor    edi,edi
      efa2be:	e8 c3 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa2c3:	31 ff                	xor    edi,edi
      efa2c5:	e8 bc 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa2ca:	31 ff                	xor    edi,edi
      efa2cc:	e8 b5 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa2d1:	31 ff                	xor    edi,edi
      efa2d3:	e8 ae 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa2d8:	31 ff                	xor    edi,edi
      efa2da:	e8 a7 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa2df:	31 ff                	xor    edi,edi
      efa2e1:	e8 a0 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa2e6:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
      efa2ea:	48 85 ff             	test   rdi,rdi
      efa2ed:	74 0a                	je     efa2f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc170f>
      efa2ef:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      efa2f3:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
      efa2f7:	75 1f                	jne    efa318 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc172e>
      efa2f9:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      efa2fe:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      efa303:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12
      efa307:	4d 89 76 28          	mov    QWORD PTR [r14+0x28],r14
      efa30b:	e8 a2 41 ba ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      efa310:	4c 89 f7             	mov    rdi,r14
      efa313:	e8 6e 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa318:	6a 20                	push   0x20
      efa31a:	5f                   	pop    rdi
      efa31b:	e8 e0 3b 8f 00       	call   17edf00 <_Znwm@plt>
      efa320:	49 89 c5             	mov    r13,rax
      efa323:	66 0f ef c0          	pxor   xmm0,xmm0
      efa327:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa32c:	48 8d 05 35 31 90 00 	lea    rax,[rip+0x903135]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa333:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      efa337:	48 8d 05 2a af 94 00 	lea    rax,[rip+0x94af2a]        # 1845268 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1950>
      efa33e:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      efa342:	6a 20                	push   0x20
      efa344:	5f                   	pop    rdi
      efa345:	e8 b6 3b 8f 00       	call   17edf00 <_Znwm@plt>
      efa34a:	48 89 c5             	mov    rbp,rax
      efa34d:	4c 89 bc 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r15
      efa354:	00 
      efa355:	66 0f ef c0          	pxor   xmm0,xmm0
      efa359:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa35e:	48 8d 05 03 31 90 00 	lea    rax,[rip+0x903103]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa365:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      efa369:	48 8d 05 f8 af 94 00 	lea    rax,[rip+0x94aff8]        # 1845368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a50>
      efa370:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
      efa374:	6a 50                	push   0x50
      efa376:	5f                   	pop    rdi
      efa377:	e8 84 3b 8f 00       	call   17edf00 <_Znwm@plt>
      efa37c:	48 89 c3             	mov    rbx,rax
      efa37f:	4c 89 e8             	mov    rax,r13
      efa382:	48 83 c0 18          	add    rax,0x18
      efa386:	48 89 e9             	mov    rcx,rbp
      efa389:	48 83 c1 18          	add    rcx,0x18
      efa38d:	66 0f ef c0          	pxor   xmm0,xmm0
      efa391:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      efa396:	48 8d 15 a3 10 93 00 	lea    rdx,[rip+0x9310a3]        # 182b440 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7a70>
      efa39d:	48 89 13             	mov    QWORD PTR [rbx],rdx
      efa3a0:	49 89 df             	mov    r15,rbx
      efa3a3:	49 83 c7 18          	add    r15,0x18
      efa3a7:	48 8d 15 3a ac 94 00 	lea    rdx,[rip+0x94ac3a]        # 1844fe8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16d0>
      efa3ae:	48 89 53 18          	mov    QWORD PTR [rbx+0x18],rdx
      efa3b2:	4c 89 63 20          	mov    QWORD PTR [rbx+0x20],r12
      efa3b6:	4c 89 73 28          	mov    QWORD PTR [rbx+0x28],r14
      efa3ba:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
      efa3be:	4c 89 6b 38          	mov    QWORD PTR [rbx+0x38],r13
      efa3c2:	48 89 4b 40          	mov    QWORD PTR [rbx+0x40],rcx
      efa3c6:	48 89 6b 48          	mov    QWORD PTR [rbx+0x48],rbp
      efa3ca:	31 ff                	xor    edi,edi
      efa3cc:	e8 b5 40 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa3d1:	31 ff                	xor    edi,edi
      efa3d3:	e8 ae 40 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa3d8:	31 ff                	xor    edi,edi
      efa3da:	e8 a7 40 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa3df:	4c 89 bc 24 10 06 00 	mov    QWORD PTR [rsp+0x610],r15
      efa3e6:	00 
      efa3e7:	48 8b bc 24 18 06 00 	mov    rdi,QWORD PTR [rsp+0x618]
      efa3ee:	00 
      efa3ef:	48 89 9c 24 18 06 00 	mov    QWORD PTR [rsp+0x618],rbx
      efa3f6:	00 
      efa3f7:	e8 8a 40 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa3fc:	6a 20                	push   0x20
      efa3fe:	5f                   	pop    rdi
      efa3ff:	e8 fc 3a 8f 00       	call   17edf00 <_Znwm@plt>
      efa404:	66 0f ef c0          	pxor   xmm0,xmm0
      efa408:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa40d:	48 8d 0d 54 30 90 00 	lea    rcx,[rip+0x903054]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa414:	48 89 08             	mov    QWORD PTR [rax],rcx
      efa417:	48 89 c1             	mov    rcx,rax
      efa41a:	48 83 c1 18          	add    rcx,0x18
      efa41e:	48 8d 15 b3 ac 94 00 	lea    rdx,[rip+0x94acb3]        # 18450d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17c0>
      efa425:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa429:	48 89 8c 24 20 06 00 	mov    QWORD PTR [rsp+0x620],rcx
      efa430:	00 
      efa431:	48 8b bc 24 28 06 00 	mov    rdi,QWORD PTR [rsp+0x628]
      efa438:	00 
      efa439:	48 89 84 24 28 06 00 	mov    QWORD PTR [rsp+0x628],rax
      efa440:	00 
      efa441:	e8 40 40 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa446:	6a 20                	push   0x20
      efa448:	5f                   	pop    rdi
      efa449:	4c 8b b4 24 d0 00 00 	mov    r14,QWORD PTR [rsp+0xd0]
      efa450:	00 
      efa451:	e8 aa 3a 8f 00       	call   17edf00 <_Znwm@plt>
      efa456:	4c 8b bc 24 c0 00 00 	mov    r15,QWORD PTR [rsp+0xc0]
      efa45d:	00 
      efa45e:	66 0f ef c0          	pxor   xmm0,xmm0
      efa462:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa467:	48 8d 0d fa 2f 90 00 	lea    rcx,[rip+0x902ffa]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa46e:	48 89 08             	mov    QWORD PTR [rax],rcx
      efa471:	48 89 c1             	mov    rcx,rax
      efa474:	48 83 c1 18          	add    rcx,0x18
      efa478:	48 8d 15 c9 b8 94 00 	lea    rdx,[rip+0x94b8c9]        # 1845d48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2430>
      efa47f:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa483:	48 8d 9c 24 f0 05 00 	lea    rbx,[rsp+0x5f0]
      efa48a:	00 
      efa48b:	48 89 8b b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rcx
      efa492:	48 8b bb b8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb8]
      efa499:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
      efa4a0:	e8 e1 3f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa4a5:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
      efa4a8:	48 89 df             	mov    rdi,rbx
      efa4ab:	e8 86 46 be ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      efa4b0:	66 0f 6f 43 10       	movdqa xmm0,XMMWORD PTR [rbx+0x10]
      efa4b5:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
      efa4b9:	48 85 c0             	test   rax,rax
      efa4bc:	74 10                	je     efa4ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc18e4>
      efa4be:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa4c3:	66 0f 6f 8c 24 00 06 	movdqa xmm1,XMMWORD PTR [rsp+0x600]
      efa4ca:	00 00 
      efa4cc:	eb 04                	jmp    efa4d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc18e8>
      efa4ce:	f3 0f 7e c8          	movq   xmm1,xmm0
      efa4d2:	66 0f 7f 84 24 00 06 	movdqa XMMWORD PTR [rsp+0x600],xmm0
      efa4d9:	00 00 
      efa4db:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efa4e2:	e8 9f 3f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa4e7:	66 0f 6f 84 24 10 06 	movdqa xmm0,XMMWORD PTR [rsp+0x610]
      efa4ee:	00 00 
      efa4f0:	48 8b 84 24 18 06 00 	mov    rax,QWORD PTR [rsp+0x618]
      efa4f7:	00 
      efa4f8:	48 85 c0             	test   rax,rax
      efa4fb:	74 10                	je     efa50d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1923>
      efa4fd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa502:	66 0f 6f 8c 24 10 06 	movdqa xmm1,XMMWORD PTR [rsp+0x610]
      efa509:	00 00 
      efa50b:	eb 04                	jmp    efa511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1927>
      efa50d:	f3 0f 7e c8          	movq   xmm1,xmm0
      efa511:	66 0f 7f 84 24 10 06 	movdqa XMMWORD PTR [rsp+0x610],xmm0
      efa518:	00 00 
      efa51a:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efa521:	e8 60 3f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa526:	66 0f 6f 84 24 20 06 	movdqa xmm0,XMMWORD PTR [rsp+0x620]
      efa52d:	00 00 
      efa52f:	48 8b 84 24 28 06 00 	mov    rax,QWORD PTR [rsp+0x628]
      efa536:	00 
      efa537:	48 85 c0             	test   rax,rax
      efa53a:	74 10                	je     efa54c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1962>
      efa53c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa541:	66 0f 6f 8c 24 20 06 	movdqa xmm1,XMMWORD PTR [rsp+0x620]
      efa548:	00 00 
      efa54a:	eb 04                	jmp    efa550 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1966>
      efa54c:	f3 0f 7e c8          	movq   xmm1,xmm0
      efa550:	66 0f 7f 84 24 20 06 	movdqa XMMWORD PTR [rsp+0x620],xmm0
      efa557:	00 00 
      efa559:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efa560:	e8 21 3f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa565:	66 0f 6f 84 24 30 06 	movdqa xmm0,XMMWORD PTR [rsp+0x630]
      efa56c:	00 00 
      efa56e:	48 8b 84 24 38 06 00 	mov    rax,QWORD PTR [rsp+0x638]
      efa575:	00 
      efa576:	48 85 c0             	test   rax,rax
      efa579:	74 10                	je     efa58b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc19a1>
      efa57b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa580:	66 0f 6f 8c 24 30 06 	movdqa xmm1,XMMWORD PTR [rsp+0x630]
      efa587:	00 00 
      efa589:	eb 04                	jmp    efa58f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc19a5>
      efa58b:	f3 0f 7e c8          	movq   xmm1,xmm0
      efa58f:	66 0f 7f 84 24 30 06 	movdqa XMMWORD PTR [rsp+0x630],xmm0
      efa596:	00 00 
      efa598:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efa59f:	e8 e2 3e ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa5a4:	66 0f 6f 84 24 40 06 	movdqa xmm0,XMMWORD PTR [rsp+0x640]
      efa5ab:	00 00 
      efa5ad:	48 8b 84 24 48 06 00 	mov    rax,QWORD PTR [rsp+0x648]
      efa5b4:	00 
      efa5b5:	48 85 c0             	test   rax,rax
      efa5b8:	74 10                	je     efa5ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc19e0>
      efa5ba:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa5bf:	66 0f 6f 8c 24 40 06 	movdqa xmm1,XMMWORD PTR [rsp+0x640]
      efa5c6:	00 00 
      efa5c8:	eb 04                	jmp    efa5ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc19e4>
      efa5ca:	f3 0f 7e c8          	movq   xmm1,xmm0
      efa5ce:	66 0f 7f 84 24 40 06 	movdqa XMMWORD PTR [rsp+0x640],xmm0
      efa5d5:	00 00 
      efa5d7:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efa5de:	e8 a3 3e ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa5e3:	66 0f 6f 84 24 50 06 	movdqa xmm0,XMMWORD PTR [rsp+0x650]
      efa5ea:	00 00 
      efa5ec:	48 8b 84 24 58 06 00 	mov    rax,QWORD PTR [rsp+0x658]
      efa5f3:	00 
      efa5f4:	48 85 c0             	test   rax,rax
      efa5f7:	74 10                	je     efa609 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1a1f>
      efa5f9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa5fe:	66 0f 6f 8c 24 50 06 	movdqa xmm1,XMMWORD PTR [rsp+0x650]
      efa605:	00 00 
      efa607:	eb 04                	jmp    efa60d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1a23>
      efa609:	f3 0f 7e c8          	movq   xmm1,xmm0
      efa60d:	66 0f 7f 84 24 50 06 	movdqa XMMWORD PTR [rsp+0x650],xmm0
      efa614:	00 00 
      efa616:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efa61d:	e8 64 3e ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa622:	66 0f 6f 84 24 60 06 	movdqa xmm0,XMMWORD PTR [rsp+0x660]
      efa629:	00 00 
      efa62b:	48 8b 84 24 68 06 00 	mov    rax,QWORD PTR [rsp+0x668]
      efa632:	00 
      efa633:	48 85 c0             	test   rax,rax
      efa636:	74 10                	je     efa648 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1a5e>
      efa638:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa63d:	66 0f 6f 8c 24 60 06 	movdqa xmm1,XMMWORD PTR [rsp+0x660]
      efa644:	00 00 
      efa646:	eb 04                	jmp    efa64c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1a62>
      efa648:	f3 0f 7e c8          	movq   xmm1,xmm0
      efa64c:	66 0f 7f 84 24 60 06 	movdqa XMMWORD PTR [rsp+0x660],xmm0
      efa653:	00 00 
      efa655:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efa65c:	e8 25 3e ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa661:	66 0f 6f 84 24 70 06 	movdqa xmm0,XMMWORD PTR [rsp+0x670]
      efa668:	00 00 
      efa66a:	48 8b 84 24 78 06 00 	mov    rax,QWORD PTR [rsp+0x678]
      efa671:	00 
      efa672:	48 85 c0             	test   rax,rax
      efa675:	74 10                	je     efa687 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1a9d>
      efa677:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa67c:	66 0f 6f 8c 24 70 06 	movdqa xmm1,XMMWORD PTR [rsp+0x670]
      efa683:	00 00 
      efa685:	eb 04                	jmp    efa68b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1aa1>
      efa687:	f3 0f 7e c8          	movq   xmm1,xmm0
      efa68b:	4d 8d 67 20          	lea    r12,[r15+0x20]
      efa68f:	66 0f 7f 84 24 70 06 	movdqa XMMWORD PTR [rsp+0x670],xmm0
      efa696:	00 00 
      efa698:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efa69f:	e8 e2 3d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa6a4:	66 0f 6f 84 24 80 06 	movdqa xmm0,XMMWORD PTR [rsp+0x680]
      efa6ab:	00 00 
      efa6ad:	48 8b 84 24 88 06 00 	mov    rax,QWORD PTR [rsp+0x688]
      efa6b4:	00 
      efa6b5:	48 85 c0             	test   rax,rax
      efa6b8:	74 10                	je     efa6ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1ae0>
      efa6ba:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa6bf:	66 0f 6f 8c 24 80 06 	movdqa xmm1,XMMWORD PTR [rsp+0x680]
      efa6c6:	00 00 
      efa6c8:	eb 04                	jmp    efa6ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1ae4>
      efa6ca:	f3 0f 7e c8          	movq   xmm1,xmm0
      efa6ce:	66 49 0f 6e d7       	movq   xmm2,r15
      efa6d3:	66 0f 7f 94 24 10 01 	movdqa XMMWORD PTR [rsp+0x110],xmm2
      efa6da:	00 00 
      efa6dc:	66 49 0f 6e d4       	movq   xmm2,r12
      efa6e1:	66 0f 7f 54 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm2
      efa6e7:	66 0f 7f 84 24 80 06 	movdqa XMMWORD PTR [rsp+0x680],xmm0
      efa6ee:	00 00 
      efa6f0:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efa6f7:	e8 8a 3d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa6fc:	66 0f 6f 84 24 90 06 	movdqa xmm0,XMMWORD PTR [rsp+0x690]
      efa703:	00 00 
      efa705:	48 8b 84 24 98 06 00 	mov    rax,QWORD PTR [rsp+0x698]
      efa70c:	00 
      efa70d:	48 85 c0             	test   rax,rax
      efa710:	74 10                	je     efa722 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1b38>
      efa712:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa717:	66 0f 6f 8c 24 90 06 	movdqa xmm1,XMMWORD PTR [rsp+0x690]
      efa71e:	00 00 
      efa720:	eb 04                	jmp    efa726 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1b3c>
      efa722:	f3 0f 7e c8          	movq   xmm1,xmm0
      efa726:	49 83 c7 08          	add    r15,0x8
      efa72a:	0f 28 54 24 70       	movaps xmm2,XMMWORD PTR [rsp+0x70]
      efa72f:	66 0f 14 94 24 10 01 	unpcklpd xmm2,XMMWORD PTR [rsp+0x110]
      efa736:	00 00 
      efa738:	0f 29 54 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm2
      efa73d:	66 0f 7f 84 24 90 06 	movdqa XMMWORD PTR [rsp+0x690],xmm0
      efa744:	00 00 
      efa746:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efa74d:	e8 34 3d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa752:	66 0f 6f 84 24 a0 06 	movdqa xmm0,XMMWORD PTR [rsp+0x6a0]
      efa759:	00 00 
      efa75b:	48 8b 84 24 a8 06 00 	mov    rax,QWORD PTR [rsp+0x6a8]
      efa762:	00 
      efa763:	48 85 c0             	test   rax,rax
      efa766:	74 10                	je     efa778 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1b8e>
      efa768:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa76d:	66 0f 6f 8c 24 a0 06 	movdqa xmm1,XMMWORD PTR [rsp+0x6a0]
      efa774:	00 00 
      efa776:	eb 04                	jmp    efa77c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1b92>
      efa778:	f3 0f 7e c8          	movq   xmm1,xmm0
      efa77c:	66 0f 7f 84 24 a0 06 	movdqa XMMWORD PTR [rsp+0x6a0],xmm0
      efa783:	00 00 
      efa785:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efa78c:	e8 f5 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa791:	31 ff                	xor    edi,edi
      efa793:	e8 ee 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa798:	31 ff                	xor    edi,edi
      efa79a:	e8 e7 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa79f:	31 ff                	xor    edi,edi
      efa7a1:	e8 e0 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7a6:	31 ff                	xor    edi,edi
      efa7a8:	e8 d9 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7ad:	31 ff                	xor    edi,edi
      efa7af:	e8 d2 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7b4:	31 ff                	xor    edi,edi
      efa7b6:	e8 cb 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7bb:	31 ff                	xor    edi,edi
      efa7bd:	e8 c4 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7c2:	31 ff                	xor    edi,edi
      efa7c4:	e8 bd 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7c9:	31 ff                	xor    edi,edi
      efa7cb:	e8 b6 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7d0:	31 ff                	xor    edi,edi
      efa7d2:	e8 af 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7d7:	31 ff                	xor    edi,edi
      efa7d9:	e8 a8 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7de:	31 ff                	xor    edi,edi
      efa7e0:	e8 a1 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7e5:	31 ff                	xor    edi,edi
      efa7e7:	e8 9a 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7ec:	31 ff                	xor    edi,edi
      efa7ee:	e8 93 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7f3:	31 ff                	xor    edi,edi
      efa7f5:	e8 8c 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa7fa:	31 ff                	xor    edi,edi
      efa7fc:	e8 85 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa801:	31 ff                	xor    edi,edi
      efa803:	e8 7e 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa808:	31 ff                	xor    edi,edi
      efa80a:	e8 77 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa80f:	31 ff                	xor    edi,edi
      efa811:	e8 70 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa816:	31 ff                	xor    edi,edi
      efa818:	e8 69 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa81d:	31 ff                	xor    edi,edi
      efa81f:	e8 62 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa824:	31 ff                	xor    edi,edi
      efa826:	e8 5b 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa82b:	31 ff                	xor    edi,edi
      efa82d:	e8 54 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa832:	31 ff                	xor    edi,edi
      efa834:	e8 4d 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa839:	4c 89 f7             	mov    rdi,r14
      efa83c:	e8 45 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa841:	f0 49 ff 07          	lock inc QWORD PTR [r15]
      efa845:	48 8b bc 24 08 06 00 	mov    rdi,QWORD PTR [rsp+0x608]
      efa84c:	00 
      efa84d:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]
      efa852:	0f 29 84 24 00 06 00 	movaps XMMWORD PTR [rsp+0x600],xmm0
      efa859:	00 
      efa85a:	e8 27 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa85f:	31 ff                	xor    edi,edi
      efa861:	e8 20 3c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa866:	0f 28 84 24 30 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x630]
      efa86d:	00 
      efa86e:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
      efa873:	48 8b 84 24 38 06 00 	mov    rax,QWORD PTR [rsp+0x638]
      efa87a:	00 
      efa87b:	48 85 c0             	test   rax,rax
      efa87e:	74 05                	je     efa885 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1c9b>
      efa880:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa885:	0f 28 84 24 40 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x640]
      efa88c:	00 
      efa88d:	0f 29 84 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm0
      efa894:	00 
      efa895:	48 8b 84 24 48 06 00 	mov    rax,QWORD PTR [rsp+0x648]
      efa89c:	00 
      efa89d:	48 85 c0             	test   rax,rax
      efa8a0:	74 05                	je     efa8a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1cbd>
      efa8a2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa8a7:	0f 28 84 24 50 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x650]
      efa8ae:	00 
      efa8af:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
      efa8b6:	00 
      efa8b7:	48 8b 84 24 58 06 00 	mov    rax,QWORD PTR [rsp+0x658]
      efa8be:	00 
      efa8bf:	48 85 c0             	test   rax,rax
      efa8c2:	74 05                	je     efa8c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1cdf>
      efa8c4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa8c9:	0f 28 84 24 60 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x660]
      efa8d0:	00 
      efa8d1:	0f 29 84 24 10 01 00 	movaps XMMWORD PTR [rsp+0x110],xmm0
      efa8d8:	00 
      efa8d9:	48 8b 84 24 68 06 00 	mov    rax,QWORD PTR [rsp+0x668]
      efa8e0:	00 
      efa8e1:	48 85 c0             	test   rax,rax
      efa8e4:	74 05                	je     efa8eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1d01>
      efa8e6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa8eb:	0f 28 84 24 70 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x670]
      efa8f2:	00 
      efa8f3:	0f 29 84 24 60 01 00 	movaps XMMWORD PTR [rsp+0x160],xmm0
      efa8fa:	00 
      efa8fb:	48 8b 84 24 78 06 00 	mov    rax,QWORD PTR [rsp+0x678]
      efa902:	00 
      efa903:	48 85 c0             	test   rax,rax
      efa906:	74 05                	je     efa90d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1d23>
      efa908:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa90d:	0f 28 84 24 80 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x680]
      efa914:	00 
      efa915:	0f 29 84 24 50 01 00 	movaps XMMWORD PTR [rsp+0x150],xmm0
      efa91c:	00 
      efa91d:	48 8b 84 24 88 06 00 	mov    rax,QWORD PTR [rsp+0x688]
      efa924:	00 
      efa925:	48 85 c0             	test   rax,rax
      efa928:	74 05                	je     efa92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1d45>
      efa92a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa92f:	0f 28 84 24 90 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x690]
      efa936:	00 
      efa937:	0f 29 84 24 40 01 00 	movaps XMMWORD PTR [rsp+0x140],xmm0
      efa93e:	00 
      efa93f:	48 8b 84 24 98 06 00 	mov    rax,QWORD PTR [rsp+0x698]
      efa946:	00 
      efa947:	48 85 c0             	test   rax,rax
      efa94a:	74 05                	je     efa951 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1d67>
      efa94c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa951:	0f 28 84 24 a0 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x6a0]
      efa958:	00 
      efa959:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
      efa960:	00 
      efa961:	48 8b 84 24 a8 06 00 	mov    rax,QWORD PTR [rsp+0x6a8]
      efa968:	00 
      efa969:	48 85 c0             	test   rax,rax
      efa96c:	74 05                	je     efa973 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1d89>
      efa96e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa973:	bf b0 00 00 00       	mov    edi,0xb0
      efa978:	e8 83 35 8f 00       	call   17edf00 <_Znwm@plt>
      efa97d:	49 89 c7             	mov    r15,rax
      efa980:	0f 57 c0             	xorps  xmm0,xmm0
      efa983:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      efa987:	48 8d 05 da 2a 90 00 	lea    rax,[rip+0x902ada]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa98e:	49 89 07             	mov    QWORD PTR [r15],rax
      efa991:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      efa996:	48 8d 05 33 a1 94 00 	lea    rax,[rip+0x94a133]        # 1844ad0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11b8>
      efa99d:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efa9a1:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]
      efa9a6:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
      efa9ab:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
      efa9b2:	00 
      efa9b3:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0
      efa9b8:	0f 28 84 24 c0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xc0]
      efa9bf:	00 
      efa9c0:	41 0f 11 47 50       	movups XMMWORD PTR [r15+0x50],xmm0
      efa9c5:	0f 28 84 24 10 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x110]
      efa9cc:	00 
      efa9cd:	41 0f 11 47 60       	movups XMMWORD PTR [r15+0x60],xmm0
      efa9d2:	0f 28 84 24 60 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x160]
      efa9d9:	00 
      efa9da:	41 0f 11 47 70       	movups XMMWORD PTR [r15+0x70],xmm0
      efa9df:	0f 28 84 24 50 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x150]
      efa9e6:	00 
      efa9e7:	41 0f 11 87 80 00 00 	movups XMMWORD PTR [r15+0x80],xmm0
      efa9ee:	00 
      efa9ef:	0f 28 84 24 40 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x140]
      efa9f6:	00 
      efa9f7:	41 0f 11 87 90 00 00 	movups XMMWORD PTR [r15+0x90],xmm0
      efa9fe:	00 
      efa9ff:	66 0f 6f 84 24 30 01 	movdqa xmm0,XMMWORD PTR [rsp+0x130]
      efaa06:	00 00 
      efaa08:	f3 41 0f 7f 87 a0 00 	movdqu XMMWORD PTR [r15+0xa0],xmm0
      efaa0f:	00 00 
      efaa11:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      efaa16:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      efaa1b:	4c 89 fb             	mov    rbx,r15
      efaa1e:	48 83 c3 18          	add    rbx,0x18
      efaa22:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
      efaa26:	4d 89 7f 28          	mov    QWORD PTR [r15+0x28],r15
      efaa2a:	31 ff                	xor    edi,edi
      efaa2c:	e8 81 3a ba ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      efaa31:	4c 89 ff             	mov    rdi,r15
      efaa34:	e8 4d 3a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaa39:	31 ff                	xor    edi,edi
      efaa3b:	e8 46 3a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaa40:	31 ff                	xor    edi,edi
      efaa42:	e8 3f 3a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaa47:	31 ff                	xor    edi,edi
      efaa49:	e8 38 3a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaa4e:	31 ff                	xor    edi,edi
      efaa50:	e8 31 3a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaa55:	31 ff                	xor    edi,edi
      efaa57:	e8 2a 3a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaa5c:	31 ff                	xor    edi,edi
      efaa5e:	e8 23 3a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaa63:	31 ff                	xor    edi,edi
      efaa65:	e8 1c 3a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaa6a:	31 ff                	xor    edi,edi
      efaa6c:	e8 15 3a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaa71:	6a 28                	push   0x28
      efaa73:	5f                   	pop    rdi
      efaa74:	e8 87 34 8f 00       	call   17edf00 <_Znwm@plt>
      efaa79:	49 89 c6             	mov    r14,rax
      efaa7c:	66 0f ef c0          	pxor   xmm0,xmm0
      efaa80:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efaa85:	48 8d 05 f4 65 90 00 	lea    rax,[rip+0x9065f4]        # 1801080 <_ZTIN4asio22service_already_existsE@@Base+0x2868>
      efaa8c:	49 89 06             	mov    QWORD PTR [r14],rax
      efaa8f:	48 8b 84 24 20 06 00 	mov    rax,QWORD PTR [rsp+0x620]
      efaa96:	00 
      efaa97:	48 8b bc 24 28 06 00 	mov    rdi,QWORD PTR [rsp+0x628]
      efaa9e:	00 
      efaa9f:	48 85 ff             	test   rdi,rdi
      efaaa2:	74 14                	je     efaab8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1ece>
      efaaa4:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efaaa9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efaaad:	49 89 7e 20          	mov    QWORD PTR [r14+0x20],rdi
      efaab1:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efaab6:	eb 09                	jmp    efaac1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1ed7>
      efaab8:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efaabc:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
      efaac1:	e8 c0 39 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaac6:	6a 58                	push   0x58
      efaac8:	5f                   	pop    rdi
      efaac9:	e8 32 34 8f 00       	call   17edf00 <_Znwm@plt>
      efaace:	48 89 c5             	mov    rbp,rax
      efaad1:	48 8d 05 b8 a8 94 00 	lea    rax,[rip+0x94a8b8]        # 1845390 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a78>
      efaad8:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      efaadc:	48 8b 84 24 08 06 00 	mov    rax,QWORD PTR [rsp+0x608]
      efaae3:	00 
      efaae4:	0f 28 84 24 00 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x600]
      efaaeb:	00 
      efaaec:	0f 11 45 08          	movups XMMWORD PTR [rbp+0x8],xmm0
      efaaf0:	48 85 c0             	test   rax,rax
      efaaf3:	74 05                	je     efaafa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1f10>
      efaaf5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efaafa:	48 89 5d 18          	mov    QWORD PTR [rbp+0x18],rbx
      efaafe:	4c 89 7d 20          	mov    QWORD PTR [rbp+0x20],r15
      efab02:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      efab07:	49 8d 46 08          	lea    rax,[r14+0x8]
      efab0b:	0f 28 84 24 f0 05 00 	movaps xmm0,XMMWORD PTR [rsp+0x5f0]
      efab12:	00 
      efab13:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
      efab18:	48 8b 8c 24 f8 05 00 	mov    rcx,QWORD PTR [rsp+0x5f8]
      efab1f:	00 
      efab20:	48 85 c9             	test   rcx,rcx
      efab23:	74 05                	je     efab2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1f40>
      efab25:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      efab2a:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      efab2e:	6a 58                	push   0x58
      efab30:	5f                   	pop    rdi
      efab31:	e8 ca 33 8f 00       	call   17edf00 <_Znwm@plt>
      efab36:	48 89 c3             	mov    rbx,rax
      efab39:	4d 89 f5             	mov    r13,r14
      efab3c:	49 83 c5 18          	add    r13,0x18
      efab40:	0f 57 c0             	xorps  xmm0,xmm0
      efab43:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      efab47:	48 8d 05 ea a8 94 00 	lea    rax,[rip+0x94a8ea]        # 1845438 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b20>
      efab4e:	48 89 03             	mov    QWORD PTR [rbx],rax
      efab51:	48 89 d8             	mov    rax,rbx
      efab54:	48 83 c0 18          	add    rax,0x18
      efab58:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
      efab5c:	48 8b 4d 10          	mov    rcx,QWORD PTR [rbp+0x10]
      efab60:	0f 10 45 08          	movups xmm0,XMMWORD PTR [rbp+0x8]
      efab64:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      efab68:	48 85 c9             	test   rcx,rcx
      efab6b:	74 05                	je     efab72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1f88>
      efab6d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      efab72:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]
      efab77:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
      efab7b:	4c 89 6b 48          	mov    QWORD PTR [rbx+0x48],r13
      efab7f:	4c 89 73 50          	mov    QWORD PTR [rbx+0x50],r14
      efab83:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
      efab87:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax
      efab8b:	48 89 5d 30          	mov    QWORD PTR [rbp+0x30],rbx
      efab8f:	48 85 c9             	test   rcx,rcx
      efab92:	74 0a                	je     efab9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1fb4>
      efab94:	48 8b 49 08          	mov    rcx,QWORD PTR [rcx+0x8]
      efab98:	48 83 f9 ff          	cmp    rcx,0xffffffffffffffff
      efab9c:	75 23                	jne    efabc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1fd7>
      efab9e:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      efaba3:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      efaba8:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
      efabac:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      efabb0:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
      efabb4:	e8 f9 38 ba ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      efabb9:	48 89 df             	mov    rdi,rbx
      efabbc:	e8 c5 38 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efabc1:	31 ff                	xor    edi,edi
      efabc3:	e8 be 38 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efabc8:	31 ff                	xor    edi,edi
      efabca:	e8 b7 38 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efabcf:	48 8b 84 24 18 06 00 	mov    rax,QWORD PTR [rsp+0x618]
      efabd6:	00 
      efabd7:	66 0f 6f 84 24 10 06 	movdqa xmm0,XMMWORD PTR [rsp+0x610]
      efabde:	00 00 
      efabe0:	f3 0f 7f 45 38       	movdqu XMMWORD PTR [rbp+0x38],xmm0
      efabe5:	48 85 c0             	test   rax,rax
      efabe8:	74 05                	je     efabef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2005>
      efabea:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efabef:	4c 89 6d 48          	mov    QWORD PTR [rbp+0x48],r13
      efabf3:	4c 89 75 50          	mov    QWORD PTR [rbp+0x50],r14
      efabf7:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      efabfc:	4c 89 ff             	mov    rdi,r15
      efabff:	e8 82 38 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efac04:	4c 89 f7             	mov    rdi,r14
      efac07:	e8 7a 38 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efac0c:	31 ff                	xor    edi,edi
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
      efac71:	e8 1a f6 b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efac76:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efac7d:	00 
      efac7e:	48 8b b4 24 f0 00 00 	mov    rsi,QWORD PTR [rsp+0xf0]
      efac85:	00 
      efac86:	e8 05 f6 b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efac8b:	48 8d 35 13 8c 43 ff 	lea    rsi,[rip+0xffffffffff438c13]        # 3338a5 <_ZTSSt12bad_any_cast@@Base-0x5c923>
      efac92:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efac99:	00 
      efac9a:	e8 df ed b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efac9f:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
      efaca4:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      efaca7:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      efacab:	48 85 ff             	test   rdi,rdi
      efacae:	74 05                	je     efacb5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc20cb>
      efacb0:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efacb5:	48 8d 05 0c 89 94 00 	lea    rax,[rip+0x94890c]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efacbc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efacc0:	66 0f ef c9          	pxor   xmm1,xmm1
      efacc4:	66 41 0f 7f 4f 30    	movdqa XMMWORD PTR [r15+0x30],xmm1
      efacca:	48 8d 05 6f 67 94 00 	lea    rax,[rip+0x94676f]        # 1841440 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x133d8>
      efacd1:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
      efacd5:	41 0f 29 47 40       	movaps XMMWORD PTR [r15+0x40],xmm0
      efacda:	48 85 ff             	test   rdi,rdi
      efacdd:	74 05                	je     eface4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc20fa>
      efacdf:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      eface4:	48 8d 05 3d 68 94 00 	lea    rax,[rip+0x94683d]        # 1841528 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x134c0>
      efaceb:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efacef:	48 8d 05 22 68 94 00 	lea    rax,[rip+0x946822]        # 1841518 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x134b0>
      efacf6:	41 be f8 01 00 00    	mov    r14d,0x1f8
      efacfc:	4c 01 f0             	add    rax,r14
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
      efad36:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
      efad3d:	00 
      efad3e:	49 89 47 70          	mov    QWORD PTR [r15+0x70],rax
      efad42:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efad47:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efad4c:	48 8b 81 d8 02 00 00 	mov    rax,QWORD PTR [rcx+0x2d8]
      efad53:	66 0f 6f 81 d0 02 00 	movdqa xmm0,XMMWORD PTR [rcx+0x2d0]
      efad5a:	00 
      efad5b:	f3 41 0f 7f 47 78    	movdqu XMMWORD PTR [r15+0x78],xmm0
      efad61:	48 85 c0             	test   rax,rax
      efad64:	74 05                	je     efad6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2181>
      efad66:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efad6b:	31 c0                	xor    eax,eax
      efad6d:	41 88 87 a0 01 00 00 	mov    BYTE PTR [r15+0x1a0],al
      efad74:	41 88 87 a8 01 00 00 	mov    BYTE PTR [r15+0x1a8],al
      efad7b:	41 88 87 60 02 00 00 	mov    BYTE PTR [r15+0x260],al
      efad82:	66 0f ef c0          	pxor   xmm0,xmm0
      efad86:	f3 41 0f 7f 87 88 00 	movdqu XMMWORD PTR [r15+0x88],xmm0
      efad8d:	00 00 
      efad8f:	f3 41 0f 7f 87 98 00 	movdqu XMMWORD PTR [r15+0x98],xmm0
      efad96:	00 00 
      efad98:	f3 41 0f 7f 87 a1 00 	movdqu XMMWORD PTR [r15+0xa1],xmm0
      efad9f:	00 00 
      efada1:	48 8d 35 38 bf 46 ff 	lea    rsi,[rip+0xffffffffff46bf38]        # 366ce0 <_ZTSSt12bad_any_cast@@Base-0x294e8>
      efada8:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      efadaf:	00 
      efadb0:	e8 c9 ec b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efadb5:	49 8d bf 68 02 00 00 	lea    rdi,[r15+0x268]
      efadbc:	48 8d b4 24 c0 0a 00 	lea    rsi,[rsp+0xac0]
      efadc3:	00 
      efadc4:	48 8d 94 24 e0 06 00 	lea    rdx,[rsp+0x6e0]
      efadcb:	00 
      efadcc:	e8 dd 44 0e 00       	call   fdf2ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66c4>
      efadd1:	4d 8d 77 20          	lea    r14,[r15+0x20]
      efadd5:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      efaddc:	00 
      efaddd:	e8 ae 30 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efade2:	45 31 e4             	xor    r12d,r12d
      efade5:	45 88 a7 90 02 00 00 	mov    BYTE PTR [r15+0x290],r12b
      efadec:	45 88 a7 50 03 00 00 	mov    BYTE PTR [r15+0x350],r12b
      efadf3:	49 8d bf 58 03 00 00 	lea    rdi,[r15+0x358]
      efadfa:	e8 d7 14 77 00       	call   166c2d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20442>
      efadff:	49 8d bf e0 0a 00 00 	lea    rdi,[r15+0xae0]
      efae06:	48 8d ac 24 10 07 00 	lea    rbp,[rsp+0x710]
      efae0d:	00 
      efae0e:	48 89 ee             	mov    rsi,rbp
      efae11:	e8 56 b5 fa ff       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      efae16:	4c 89 ff             	mov    rdi,r15
      efae19:	48 81 c7 10 0b 00 00 	add    rdi,0xb10
      efae20:	48 8d 9c 24 40 02 00 	lea    rbx,[rsp+0x240]
      efae27:	00 
      efae28:	48 89 de             	mov    rsi,rbx
      efae2b:	e8 80 b5 fa ff       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
      efae30:	45 88 a7 48 0b 00 00 	mov    BYTE PTR [r15+0xb48],r12b
      efae37:	45 88 a7 4c 0b 00 00 	mov    BYTE PTR [r15+0xb4c],r12b
      efae3e:	66 0f ef c0          	pxor   xmm0,xmm0
      efae42:	66 41 0f 7f 87 50 0b 	movdqa XMMWORD PTR [r15+0xb50],xmm0
      efae49:	00 00 
      efae4b:	66 41 0f 7f 87 60 0b 	movdqa XMMWORD PTR [r15+0xb60],xmm0
      efae52:	00 00 
      efae54:	41 83 a7 40 0b 00 00 	and    DWORD PTR [r15+0xb40],0x0
      efae5b:	00 
      efae5c:	66 41 83 a7 44 0b 00 	and    WORD PTR [r15+0xb44],0x0
      efae63:	00 00 
      efae65:	b8 00 00 80 3f       	mov    eax,0x3f800000
      efae6a:	41 89 87 70 0b 00 00 	mov    DWORD PTR [r15+0xb70],eax
      efae71:	b1 01                	mov    cl,0x1
      efae73:	41 88 8f 78 0b 00 00 	mov    BYTE PTR [r15+0xb78],cl
      efae7a:	45 88 a7 88 0b 00 00 	mov    BYTE PTR [r15+0xb88],r12b
      efae81:	45 88 a7 8c 0b 00 00 	mov    BYTE PTR [r15+0xb8c],r12b
      efae88:	66 41 0f 7f 87 90 0b 	movdqa XMMWORD PTR [r15+0xb90],xmm0
      efae8f:	00 00 
      efae91:	66 41 0f 7f 87 a0 0b 	movdqa XMMWORD PTR [r15+0xba0],xmm0
      efae98:	00 00 
      efae9a:	41 83 a7 80 0b 00 00 	and    DWORD PTR [r15+0xb80],0x0
      efaea1:	00 
      efaea2:	66 41 83 a7 84 0b 00 	and    WORD PTR [r15+0xb84],0x0
      efaea9:	00 00 
      efaeab:	41 89 87 b0 0b 00 00 	mov    DWORD PTR [r15+0xbb0],eax
      efaeb2:	41 88 8f b8 0b 00 00 	mov    BYTE PTR [r15+0xbb8],cl
      efaeb9:	45 88 a7 c0 0b 00 00 	mov    BYTE PTR [r15+0xbc0],r12b
      efaec0:	45 88 a7 c8 0b 00 00 	mov    BYTE PTR [r15+0xbc8],r12b
      efaec7:	45 88 a7 d0 0b 00 00 	mov    BYTE PTR [r15+0xbd0],r12b
      efaece:	45 88 a7 d8 0b 00 00 	mov    BYTE PTR [r15+0xbd8],r12b
      efaed5:	45 88 a7 58 0c 00 00 	mov    BYTE PTR [r15+0xc58],r12b
      efaedc:	f3 41 0f 7f 87 48 0c 	movdqu XMMWORD PTR [r15+0xc48],xmm0
      efaee3:	00 00 
      efaee5:	66 41 0f 7f 87 e0 0b 	movdqa XMMWORD PTR [r15+0xbe0],xmm0
      efaeec:	00 00 
      efaeee:	66 41 0f 7f 87 f0 0b 	movdqa XMMWORD PTR [r15+0xbf0],xmm0
      efaef5:	00 00 
      efaef7:	66 41 0f 7f 87 00 0c 	movdqa XMMWORD PTR [r15+0xc00],xmm0
      efaefe:	00 00 
      efaf00:	66 41 0f 7f 87 10 0c 	movdqa XMMWORD PTR [r15+0xc10],xmm0
      efaf07:	00 00 
      efaf09:	66 41 83 a7 40 0c 00 	and    WORD PTR [r15+0xc40],0x0
      efaf10:	00 00 
      efaf12:	66 41 0f 7f 87 20 0c 	movdqa XMMWORD PTR [r15+0xc20],xmm0
      efaf19:	00 00 
      efaf1b:	66 41 0f 7f 87 30 0c 	movdqa XMMWORD PTR [r15+0xc30],xmm0
      efaf22:	00 00 
      efaf24:	45 88 a7 60 0c 00 00 	mov    BYTE PTR [r15+0xc60],r12b
      efaf2b:	45 88 a7 80 0c 00 00 	mov    BYTE PTR [r15+0xc80],r12b
      efaf32:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efaf39:	00 
      efaf3a:	e8 51 2f 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efaf3f:	48 89 df             	mov    rdi,rbx
      efaf42:	e8 23 f0 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efaf47:	48 89 ef             	mov    rdi,rbp
      efaf4a:	e8 1b f0 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efaf4f:	4c 89 ef             	mov    rdi,r13
      efaf52:	e8 2f 35 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaf57:	48 8d 9c 24 00 02 00 	lea    rbx,[rsp+0x200]
      efaf5e:	00 
      efaf5f:	48 89 df             	mov    rdi,rbx
      efaf62:	4c 89 f6             	mov    rsi,r14
      efaf65:	4c 89 fa             	mov    rdx,r15
      efaf68:	e8 97 38 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efaf6d:	31 ff                	xor    edi,edi
      efaf6f:	e8 a8 34 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efaf74:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efaf78:	66 0f 7f 44 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm0
      efaf7e:	31 ff                	xor    edi,edi
      efaf80:	e8 01 35 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaf85:	31 ff                	xor    edi,edi
      efaf87:	e8 fa 34 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efaf8c:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efaf91:	8a 80 b6 01 00 00    	mov    al,BYTE PTR [rax+0x1b6]
      efaf97:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
      efaf9e:	00 00 
      efafa0:	66 0f ef c0          	pxor   xmm0,xmm0
      efafa4:	66 0f 7f 84 24 a0 01 	movdqa XMMWORD PTR [rsp+0x1a0],xmm0
      efafab:	00 00 
      efafad:	44 38 e0             	cmp    al,r12b
      efafb0:	0f 84 16 02 00 00    	je     efb1cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc25e2>
      efafb6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efafbb:	66 0f 6f 80 f0 02 00 	movdqa xmm0,XMMWORD PTR [rax+0x2f0]
      efafc2:	00 
      efafc3:	4c 8b a0 f8 02 00 00 	mov    r12,QWORD PTR [rax+0x2f8]
      efafca:	4d 85 e4             	test   r12,r12
      efafcd:	74 06                	je     efafd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc23eb>
      efafcf:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      efafd5:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efafda:	48 8b 98 e0 02 00 00 	mov    rbx,QWORD PTR [rax+0x2e0]
      efafe1:	48 89 9c 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rbx
      efafe8:	00 
      efafe9:	4c 8b b0 e8 02 00 00 	mov    r14,QWORD PTR [rax+0x2e8]
      efaff0:	4c 89 b4 24 08 02 00 	mov    QWORD PTR [rsp+0x208],r14
      efaff7:	00 
      efaff8:	4d 85 f6             	test   r14,r14
      efaffb:	74 05                	je     efb002 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2418>
      efaffd:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      efb002:	f3 0f 7f 84 24 10 02 	movdqu XMMWORD PTR [rsp+0x210],xmm0
      efb009:	00 00 
      efb00b:	4d 85 e4             	test   r12,r12
      efb00e:	74 06                	je     efb016 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc242c>
      efb010:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      efb016:	48 83 a4 24 30 07 00 	and    QWORD PTR [rsp+0x730],0x0
      efb01d:	00 00 
      efb01f:	6a 28                	push   0x28
      efb021:	5f                   	pop    rdi
      efb022:	e8 d9 2e 8f 00       	call   17edf00 <_Znwm@plt>
      efb027:	48 8d 8c 24 10 02 00 	lea    rcx,[rsp+0x210]
      efb02e:	00 
      efb02f:	48 8d 15 aa b6 93 00 	lea    rdx,[rip+0x93b6aa]        # 18366e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8678>
      efb036:	48 89 10             	mov    QWORD PTR [rax],rdx
      efb039:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
      efb03d:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
      efb041:	66 0f ef c0          	pxor   xmm0,xmm0
      efb045:	66 0f 7f 41 f0       	movdqa XMMWORD PTR [rcx-0x10],xmm0
      efb04a:	66 0f 6f 09          	movdqa xmm1,XMMWORD PTR [rcx]
      efb04e:	f3 0f 7f 48 18       	movdqu XMMWORD PTR [rax+0x18],xmm1
      efb053:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
      efb057:	48 89 84 24 30 07 00 	mov    QWORD PTR [rsp+0x730],rax
      efb05e:	00 
      efb05f:	4c 8b bc 24 a8 01 00 	mov    r15,QWORD PTR [rsp+0x1a8]
      efb066:	00 
      efb067:	48 8b 8c 24 b0 01 00 	mov    rcx,QWORD PTR [rsp+0x1b0]
      efb06e:	00 
      efb06f:	49 39 cf             	cmp    r15,rcx
      efb072:	73 19                	jae    efb08d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc24a3>
      efb074:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb07b:	00 
      efb07c:	4c 89 ff             	mov    rdi,r15
      efb07f:	e8 e0 37 00 00       	call   efe864 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c7a>
      efb084:	49 83 c7 30          	add    r15,0x30
      efb088:	e9 15 01 00 00       	jmp    efb1a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc25b8>
      efb08d:	48 bf 55 55 55 55 55 	movabs rdi,0x555555555555555
      efb094:	55 55 05 
      efb097:	4c 89 f8             	mov    rax,r15
      efb09a:	48 99                	cqo
      efb09c:	6a 30                	push   0x30
      efb09e:	41 58                	pop    r8
      efb0a0:	49 f7 f8             	idiv   r8
      efb0a3:	48 8d 70 01          	lea    rsi,[rax+0x1]
      efb0a7:	48 39 fe             	cmp    rsi,rdi
      efb0aa:	0f 87 4f 2a 00 00    	ja     efdaff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4f15>
      efb0b0:	48 89 c3             	mov    rbx,rax
      efb0b3:	48 89 c8             	mov    rax,rcx
      efb0b6:	48 99                	cqo
      efb0b8:	49 f7 f8             	idiv   r8
      efb0bb:	48 8d 0c 00          	lea    rcx,[rax+rax*1]
      efb0bf:	48 39 f1             	cmp    rcx,rsi
      efb0c2:	48 0f 47 f1          	cmova  rsi,rcx
      efb0c6:	48 b9 aa aa aa aa aa 	movabs rcx,0x2aaaaaaaaaaaaaa
      efb0cd:	aa aa 02 
      efb0d0:	48 39 c8             	cmp    rax,rcx
      efb0d3:	48 0f 42 fe          	cmovb  rdi,rsi
      efb0d7:	48 85 ff             	test   rdi,rdi
      efb0da:	74 12                	je     efb0ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2504>
      efb0dc:	e8 56 d4 be ff       	call   ae8537 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x354d7>
      efb0e1:	49 89 c5             	mov    r13,rax
      efb0e4:	48 89 94 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rdx
      efb0eb:	00 
      efb0ec:	eb 0d                	jmp    efb0fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2511>
      efb0ee:	45 31 ed             	xor    r13d,r13d
      efb0f1:	31 c0                	xor    eax,eax
      efb0f3:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
      efb0fa:	00 
      efb0fb:	4c 6b fb 30          	imul   r15,rbx,0x30
      efb0ff:	4d 01 ef             	add    r15,r13
      efb102:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb109:	00 
      efb10a:	4c 89 ff             	mov    rdi,r15
      efb10d:	e8 52 37 00 00       	call   efe864 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c7a>
      efb112:	48 8b 9c 24 a0 01 00 	mov    rbx,QWORD PTR [rsp+0x1a0]
      efb119:	00 
      efb11a:	48 8b ac 24 a8 01 00 	mov    rbp,QWORD PTR [rsp+0x1a8]
      efb121:	00 
      efb122:	48 39 dd             	cmp    rbp,rbx
      efb125:	74 2d                	je     efb154 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc256a>
      efb127:	4d 89 fe             	mov    r14,r15
      efb12a:	49 83 c6 d0          	add    r14,0xffffffffffffffd0
      efb12e:	48 83 c5 d0          	add    rbp,0xffffffffffffffd0
      efb132:	4c 89 f7             	mov    rdi,r14
      efb135:	48 89 ee             	mov    rsi,rbp
      efb138:	e8 27 37 00 00       	call   efe864 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c7a>
      efb13d:	48 39 dd             	cmp    rbp,rbx
      efb140:	75 e8                	jne    efb12a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2540>
      efb142:	48 8b 9c 24 a0 01 00 	mov    rbx,QWORD PTR [rsp+0x1a0]
      efb149:	00 
      efb14a:	48 8b ac 24 a8 01 00 	mov    rbp,QWORD PTR [rsp+0x1a8]
      efb151:	00 
      efb152:	eb 06                	jmp    efb15a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2570>
      efb154:	48 89 eb             	mov    rbx,rbp
      efb157:	4d 89 fe             	mov    r14,r15
      efb15a:	49 83 c7 30          	add    r15,0x30
      efb15e:	48 6b 84 24 d0 00 00 	imul   rax,QWORD PTR [rsp+0xd0],0x30
      efb165:	00 30 
      efb167:	49 01 c5             	add    r13,rax
      efb16a:	4c 89 b4 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],r14
      efb171:	00 
      efb172:	4c 89 bc 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],r15
      efb179:	00 
      efb17a:	4c 89 ac 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r13
      efb181:	00 
      efb182:	48 39 dd             	cmp    rbp,rbx
      efb185:	74 0e                	je     efb195 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc25ab>
      efb187:	48 83 c5 d0          	add    rbp,0xffffffffffffffd0
      efb18b:	48 89 ef             	mov    rdi,rbp
      efb18e:	e8 d7 ed b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efb193:	eb ed                	jmp    efb182 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2598>
      efb195:	48 85 db             	test   rbx,rbx
      efb198:	74 08                	je     efb1a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc25b8>
      efb19a:	48 89 df             	mov    rdi,rbx
      efb19d:	e8 7e 2d 8f 00       	call   17edf20 <_ZdlPv@plt>
      efb1a2:	4c 89 bc 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],r15
      efb1a9:	00 
      efb1aa:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efb1b1:	00 
      efb1b2:	e8 b3 ed b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efb1b7:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
      efb1be:	00 
      efb1bf:	e8 4c 79 bf ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      efb1c4:	4c 89 e7             	mov    rdi,r12
      efb1c7:	e8 ba 32 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb1cc:	bf 88 00 00 00       	mov    edi,0x88
      efb1d1:	e8 2a 2d 8f 00       	call   17edf00 <_Znwm@plt>
      efb1d6:	49 89 c6             	mov    r14,rax
      efb1d9:	49 89 c7             	mov    r15,rax
      efb1dc:	66 0f ef c0          	pxor   xmm0,xmm0
      efb1e0:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efb1e6:	48 8d 05 d3 f5 93 00 	lea    rax,[rip+0x93f5d3]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efb1ed:	49 89 06             	mov    QWORD PTR [r14],rax
      efb1f0:	66 0f 6f 8c 24 c0 01 	movdqa xmm1,XMMWORD PTR [rsp+0x1c0]
      efb1f7:	00 00 
      efb1f9:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
      efb200:	00 
      efb201:	48 85 c0             	test   rax,rax
      efb204:	74 05                	je     efb20b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2621>
      efb206:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efb20b:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
      efb211:	66 48 0f 3a 16 c1 01 	pextrq rcx,xmm0,0x1
      efb218:	48 85 c9             	test   rcx,rcx
      efb21b:	74 05                	je     efb222 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2638>
      efb21d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      efb222:	48 85 c0             	test   rax,rax
      efb225:	74 05                	je     efb22c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2642>
      efb227:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efb22c:	48 89 8c 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rcx
      efb233:	00 
      efb234:	48 8d 05 8d 83 94 00 	lea    rax,[rip+0x94838d]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efb23b:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efb23f:	66 0f ef c0          	pxor   xmm0,xmm0
      efb243:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
      efb249:	48 8d 05 88 5a 94 00 	lea    rax,[rip+0x945a88]        # 1840cd8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12c70>
      efb250:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efb254:	66 49 0f 3a 16 cd 01 	pextrq r13,xmm1,0x1
      efb25b:	f3 41 0f 7f 4f 38    	movdqu XMMWORD PTR [r15+0x38],xmm1
      efb261:	48 8d 0d 60 58 94 00 	lea    rcx,[rip+0x945860]        # 1840ac8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12a60>
      efb268:	48 8d 05 49 58 94 00 	lea    rax,[rip+0x945849]        # 1840ab8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12a50>
      efb26f:	4d 85 ed             	test   r13,r13
      efb272:	66 0f 7f 8c 24 c0 00 	movdqa XMMWORD PTR [rsp+0xc0],xmm1
      efb279:	00 00 
      efb27b:	74 4a                	je     efb2c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc26dd>
      efb27d:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      efb282:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
      efb286:	bb f8 01 00 00       	mov    ebx,0x1f8
      efb28b:	48 01 d8             	add    rax,rbx
      efb28e:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efb292:	4c 89 ef             	mov    rdi,r13
      efb295:	e8 ec 31 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb29a:	48 8d 05 17 56 94 00 	lea    rax,[rip+0x945617]        # 18408b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12850>
      efb2a1:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efb2a5:	48 8d 05 fc 55 94 00 	lea    rax,[rip+0x9455fc]        # 18408a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12840>
      efb2ac:	48 01 d8             	add    rax,rbx
      efb2af:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efb2b3:	0f 28 84 24 c0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xc0]
      efb2ba:	00 
      efb2bb:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0
      efb2c0:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      efb2c5:	eb 3e                	jmp    efb305 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc271b>
      efb2c7:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
      efb2cb:	bb f8 01 00 00       	mov    ebx,0x1f8
      efb2d0:	48 01 d8             	add    rax,rbx
      efb2d3:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efb2d7:	4c 89 ef             	mov    rdi,r13
      efb2da:	e8 a7 31 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb2df:	48 8d 05 d2 55 94 00 	lea    rax,[rip+0x9455d2]        # 18408b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12850>
      efb2e6:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
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
      efb31e:	74 05                	je     efb325 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc273b>
      efb320:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efb325:	41 c6 47 68 00       	mov    BYTE PTR [r15+0x68],0x0
      efb32a:	0f 28 84 24 a0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1a0]
      efb331:	00 
      efb332:	41 0f 11 47 70       	movups XMMWORD PTR [r15+0x70],xmm0
      efb337:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
      efb33e:	00 
      efb33f:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
      efb346:	0f 57 c0             	xorps  xmm0,xmm0
      efb349:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
      efb350:	00 
      efb351:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
      efb358:	00 00 
      efb35a:	e8 27 31 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb35f:	4c 89 ef             	mov    rdi,r13
      efb362:	e8 1f 31 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb367:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efb36e:	00 
      efb36f:	48 89 df             	mov    rdi,rbx
      efb372:	4c 89 f6             	mov    rsi,r14
      efb375:	4c 89 fa             	mov    rdx,r15
      efb378:	e8 87 34 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efb37d:	31 ff                	xor    edi,edi
      efb37f:	e8 98 30 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efb384:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efb388:	66 0f ef c9          	pxor   xmm1,xmm1
      efb38c:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efb390:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
      efb395:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      efb399:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
      efb39d:	e8 e4 30 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb3a2:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efb3a6:	e8 db 30 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb3ab:	48 8d 35 f3 84 43 ff 	lea    rsi,[rip+0xffffffffff4384f3]        # 3338a5 <_ZTSSt12bad_any_cast@@Base-0x5c923>
      efb3b2:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efb3b9:	00 
      efb3ba:	e8 bf e6 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efb3bf:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb3c6:	00 
      efb3c7:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      efb3ce:	00 
      efb3cf:	e8 bc 26 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efb3d4:	48 8b 9c 24 e0 00 00 	mov    rbx,QWORD PTR [rsp+0xe0]
      efb3db:	00 
      efb3dc:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efb3e3:	00 
      efb3e4:	e8 a7 2a 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efb3e9:	48 8d 35 c6 24 48 ff 	lea    rsi,[rip+0xffffffffff4824c6]        # 37d8b6 <_ZTSSt12bad_any_cast@@Base-0x12912>
      efb3f0:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efb3f7:	00 
      efb3f8:	e8 81 e6 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efb3fd:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb404:	00 
      efb405:	48 89 df             	mov    rdi,rbx
      efb408:	e8 83 26 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efb40d:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efb414:	00 
      efb415:	e8 76 2a 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efb41a:	48 8d 35 f1 87 47 ff 	lea    rsi,[rip+0xffffffffff4787f1]        # 373c12 <_ZTSSt12bad_any_cast@@Base-0x1c5b6>
      efb421:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efb428:	00 
      efb429:	e8 50 e6 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efb42e:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb435:	00 
      efb436:	48 89 df             	mov    rdi,rbx
      efb439:	e8 52 26 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efb43e:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efb445:	00 
      efb446:	e8 45 2a 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efb44b:	48 8d 35 c8 c1 47 ff 	lea    rsi,[rip+0xffffffffff47c1c8]        # 37761a <_ZTSSt12bad_any_cast@@Base-0x18bae>
      efb452:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efb459:	00 
      efb45a:	e8 1f e6 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efb45f:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb466:	00 
      efb467:	48 89 df             	mov    rdi,rbx
      efb46a:	e8 21 26 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efb46f:	4c 8d ac 24 10 07 00 	lea    r13,[rsp+0x710]
      efb476:	00 
      efb477:	4c 89 ef             	mov    rdi,r13
      efb47a:	e8 11 2a 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efb47f:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      efb486:	00 
      efb487:	48 8b b4 24 00 01 00 	mov    rsi,QWORD PTR [rsp+0x100]
      efb48e:	00 
      efb48f:	e8 97 31 00 00       	call   efe62b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a41>
      efb494:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efb499:	48 8b b8 40 02 00 00 	mov    rdi,QWORD PTR [rax+0x240]
      efb4a0:	e8 bd ef b7 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      efb4a5:	49 89 c4             	mov    r12,rax
      efb4a8:	48 b8 61 75 74 6f 70 	movabs rax,0x79616c706f747561
      efb4af:	6c 61 79 
      efb4b2:	c6 84 24 e0 01 00 00 	mov    BYTE PTR [rsp+0x1e0],0x10
      efb4b9:	10 
      efb4ba:	48 89 84 24 e1 01 00 	mov    QWORD PTR [rsp+0x1e1],rax
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
      efb51f:	48 89 8c 24 18 07 00 	mov    QWORD PTR [rsp+0x718],rcx
      efb526:	00 
      efb527:	48 89 84 24 20 07 00 	mov    QWORD PTR [rsp+0x720],rax
      efb52e:	00 
      efb52f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efb534:	eb 19                	jmp    efb54f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2965>
      efb536:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
      efb53d:	00 
      efb53e:	48 89 84 24 18 07 00 	mov    QWORD PTR [rsp+0x718],rax
      efb545:	00 
      efb546:	48 83 a4 24 20 07 00 	and    QWORD PTR [rsp+0x720],0x0
      efb54d:	00 00 
      efb54f:	48 8d 05 d2 b0 93 00 	lea    rax,[rip+0x93b0d2]        # 1836628 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x85c0>
      efb556:	48 89 84 24 10 07 00 	mov    QWORD PTR [rsp+0x710],rax
      efb55d:	00 
      efb55e:	4c 89 ac 24 30 07 00 	mov    QWORD PTR [rsp+0x730],r13
      efb565:	00 
      efb566:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efb56b:	48 8b 81 58 02 00 00 	mov    rax,QWORD PTR [rcx+0x258]
      efb572:	0f 28 81 50 02 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x250]
      efb579:	0f 29 84 24 d0 01 00 	movaps XMMWORD PTR [rsp+0x1d0],xmm0
      efb580:	00 
      efb581:	48 85 c0             	test   rax,rax
      efb584:	74 05                	je     efb58b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc29a1>
      efb586:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efb58b:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efb592:	00 
      efb593:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
      efb59a:	00 
      efb59b:	e8 f0 ec b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efb5a0:	4c 8d bc 24 c0 0a 00 	lea    r15,[rsp+0xac0]
      efb5a7:	00 
      efb5a8:	4c 89 ff             	mov    rdi,r15
      efb5ab:	48 8b b4 24 f0 00 00 	mov    rsi,QWORD PTR [rsp+0xf0]
      efb5b2:	00 
      efb5b3:	e8 d8 ec b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efb5b8:	48 8d 9c 24 e0 06 00 	lea    rbx,[rsp+0x6e0]
      efb5bf:	00 
      efb5c0:	48 89 df             	mov    rdi,rbx
      efb5c3:	48 8b b4 24 28 01 00 	mov    rsi,QWORD PTR [rsp+0x128]
      efb5ca:	00 
      efb5cb:	e8 c0 ec b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efb5d0:	4d 89 f5             	mov    r13,r14
      efb5d3:	49 83 c5 20          	add    r13,0x20
      efb5d7:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
      efb5dc:	48 63 86 dc 01 00 00 	movsxd rax,DWORD PTR [rsi+0x1dc]
      efb5e3:	0f b6 8e d4 01 00 00 	movzx  ecx,BYTE PTR [rsi+0x1d4]
      efb5ea:	31 d2                	xor    edx,edx
      efb5ec:	88 94 24 20 02 00 00 	mov    BYTE PTR [rsp+0x220],dl
      efb5f3:	88 94 24 30 02 00 00 	mov    BYTE PTR [rsp+0x230],dl
      efb5fa:	0f b6 96 f5 01 00 00 	movzx  edx,BYTE PTR [rsi+0x1f5]
      efb601:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      efb608:	00 00 
      efb60a:	66 48 0f 7e c6       	movq   rsi,xmm0
      efb60f:	66 48 0f 3a 16 c5 01 	pextrq rbp,xmm0,0x1
      efb616:	48 8b bc 24 30 02 00 	mov    rdi,QWORD PTR [rsp+0x230]
      efb61d:	00 
      efb61e:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
      efb623:	0f 10 84 24 20 02 00 	movups xmm0,XMMWORD PTR [rsp+0x220]
      efb62a:	00 
      efb62b:	0f 11 44 24 38       	movups XMMWORD PTR [rsp+0x38],xmm0
      efb630:	89 54 24 50          	mov    DWORD PTR [rsp+0x50],edx
      efb634:	89 4c 24 28          	mov    DWORD PTR [rsp+0x28],ecx
      efb638:	48 8d 8c 24 e0 01 00 	lea    rcx,[rsp+0x1e0]
      efb63f:	00 
      efb640:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
      efb645:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      efb64a:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      efb64f:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      efb654:	48 8d 84 24 40 02 00 	lea    rax,[rsp+0x240]
      efb65b:	00 
      efb65c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      efb660:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
      efb666:	48 8d 8c 24 10 07 00 	lea    rcx,[rsp+0x710]
      efb66d:	00 
      efb66e:	4c 8d 8c 24 d0 01 00 	lea    r9,[rsp+0x1d0]
      efb675:	00 
      efb676:	4c 89 ef             	mov    rdi,r13
      efb679:	48 89 ea             	mov    rdx,rbp
      efb67c:	4d 89 e0             	mov    r8,r12
      efb67f:	e8 b0 b3 04 00       	call   f46a34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10de4a>
      efb684:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efb68b:	00 
      efb68c:	e8 d9 e8 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efb691:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      efb698:	00 
      efb699:	e8 cc e8 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efb69e:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efb6a5:	00 
      efb6a6:	e8 bf e8 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efb6ab:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
      efb6b2:	00 
      efb6b3:	e8 ce 2d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb6b8:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efb6bf:	00 
      efb6c0:	e8 a5 e8 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efb6c5:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      efb6cc:	00 
      efb6cd:	e8 b4 2d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb6d2:	48 89 ef             	mov    rdi,rbp
      efb6d5:	e8 ac 2d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb6da:	48 8d 9c 24 80 01 00 	lea    rbx,[rsp+0x180]
      efb6e1:	00 
      efb6e2:	48 89 df             	mov    rdi,rbx
      efb6e5:	4c 89 ee             	mov    rsi,r13
      efb6e8:	4c 89 f2             	mov    rdx,r14
      efb6eb:	e8 14 31 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efb6f0:	31 ff                	xor    edi,edi
      efb6f2:	e8 25 2d ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efb6f7:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efb6fb:	66 0f 7f 84 24 90 01 	movdqa XMMWORD PTR [rsp+0x190],xmm0
      efb702:	00 00 
      efb704:	31 ff                	xor    edi,edi
      efb706:	e8 7b 2d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb70b:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
      efb712:	00 
      efb713:	e8 78 27 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
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
      efb777:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efb77c:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efb783:	00 
      efb784:	48 8d b4 24 c0 0a 00 	lea    rsi,[rsp+0xac0]
      efb78b:	00 
      efb78c:	e8 ff ea b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
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
      efb7ed:	00 
      efb7ee:	48 89 df             	mov    rdi,rbx
      efb7f1:	e8 74 e7 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efb7f6:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efb7fd:	00 
      efb7fe:	e8 67 e7 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efb803:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
      efb80a:	00 00 
      efb80c:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efb813:	e8 6e 2c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb818:	4c 8d a4 24 e0 06 00 	lea    r12,[rsp+0x6e0]
      efb81f:	00 
      efb820:	4c 89 e7             	mov    rdi,r12
      efb823:	4c 89 fe             	mov    rsi,r15
      efb826:	4c 89 f2             	mov    rdx,r14
      efb829:	e8 d6 2f 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efb82e:	31 ff                	xor    edi,edi
      efb830:	e8 e7 2b ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efb835:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
      efb83c:	00 
      efb83d:	4c 89 e6             	mov    rsi,r12
      efb840:	e8 d7 df bb ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      efb845:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      efb84a:	e8 37 2c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb84f:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efb856:	00 
      efb857:	e8 e2 5a 7d 00       	call   16d133e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x854aa>
      efb85c:	c6 03 10             	mov    BYTE PTR [rbx],0x10
      efb85f:	49 be 61 75 74 6f 70 	movabs r14,0x79616c706f747561
      efb866:	6c 61 79 
      efb869:	4c 89 73 01          	mov    QWORD PTR [rbx+0x1],r14
      efb86d:	c6 43 09 00          	mov    BYTE PTR [rbx+0x9],0x0
      efb871:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
      efb878:	00 
      efb879:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb880:	00 
      efb881:	e8 0a 22 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efb886:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efb88d:	00 
      efb88e:	48 89 df             	mov    rdi,rbx
      efb891:	e8 fa 25 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efb896:	c6 03 10             	mov    BYTE PTR [rbx],0x10
      efb899:	4c 89 73 01          	mov    QWORD PTR [rbx+0x1],r14
      efb89d:	c6 43 09 00          	mov    BYTE PTR [rbx+0x9],0x0
      efb8a1:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
      efb8a8:	00 
      efb8a9:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb8b0:	00 
      efb8b1:	e8 da 21 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efb8b6:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efb8bd:	00 
      efb8be:	48 89 df             	mov    rdi,rbx
      efb8c1:	e8 ca 25 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efb8c6:	c6 03 10             	mov    BYTE PTR [rbx],0x10
      efb8c9:	4c 89 73 01          	mov    QWORD PTR [rbx+0x1],r14
      efb8cd:	c6 43 09 00          	mov    BYTE PTR [rbx+0x9],0x0
      efb8d1:	48 8d bc 24 48 03 00 	lea    rdi,[rsp+0x348]
      efb8d8:	00 
      efb8d9:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb8e0:	00 
      efb8e1:	e8 aa 21 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efb8e6:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efb8ed:	00 
      efb8ee:	e8 9d 25 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efb8f3:	bf f8 03 00 00       	mov    edi,0x3f8
      efb8f8:	e8 03 26 8f 00       	call   17edf00 <_Znwm@plt>
      efb8fd:	49 89 c6             	mov    r14,rax
      efb900:	66 0f ef c0          	pxor   xmm0,xmm0
      efb904:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efb909:	48 8d 05 b0 ee 93 00 	lea    rax,[rip+0x93eeb0]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efb910:	49 89 06             	mov    QWORD PTR [r14],rax
      efb913:	0f 28 84 24 90 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x190]
      efb91a:	00 
      efb91b:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      efb922:	00 
      efb923:	48 8b 9c 24 98 01 00 	mov    rbx,QWORD PTR [rsp+0x198]
      efb92a:	00 
      efb92b:	48 85 db             	test   rbx,rbx
      efb92e:	74 05                	je     efb935 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2d4b>
      efb930:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      efb935:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efb93c:	00 
      efb93d:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
      efb944:	00 
      efb945:	e8 e8 5c 7d 00       	call   16d1632 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8579e>
      efb94a:	48 85 db             	test   rbx,rbx
      efb94d:	74 05                	je     efb954 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2d6a>
      efb94f:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      efb954:	49 8d 5e 18          	lea    rbx,[r14+0x18]
      efb958:	48 8d 05 69 7c 94 00 	lea    rax,[rip+0x947c69]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efb95f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efb963:	66 0f ef c9          	pxor   xmm1,xmm1
      efb967:	0f 57 c0             	xorps  xmm0,xmm0
      efb96a:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
      efb971:	00 
      efb972:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
      efb978:	48 8d 05 c9 4c 94 00 	lea    rax,[rip+0x944cc9]        # 1840648 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x125e0>
      efb97f:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efb983:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
      efb98a:	00 00 
      efb98c:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
      efb992:	66 49 0f 3a 16 c7 01 	pextrq r15,xmm0,0x1
      efb999:	4d 85 ff             	test   r15,r15
      efb99c:	74 05                	je     efb9a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2db9>
      efb99e:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      efb9a3:	48 8d 05 c6 4c 94 00 	lea    rax,[rip+0x944cc6]        # 1840670 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12608>
      efb9aa:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efb9ae:	48 8d 05 ab 4c 94 00 	lea    rax,[rip+0x944cab]        # 1840660 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x125f8>
      efb9b5:	41 bc f8 01 00 00    	mov    r12d,0x1f8
      efb9bb:	4c 01 e0             	add    rax,r12
      efb9be:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efb9c2:	4c 89 ff             	mov    rdi,r15
      efb9c5:	e8 bc 2a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb9ca:	48 8d 05 67 4a 94 00 	lea    rax,[rip+0x944a67]        # 1840438 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x123d0>
      efb9d1:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efb9d5:	48 8d 05 4c 4a 94 00 	lea    rax,[rip+0x944a4c]        # 1840428 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x123c0>
      efb9dc:	4c 01 e0             	add    rax,r12
      efb9df:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efb9e3:	4c 89 f7             	mov    rdi,r14
      efb9e6:	48 83 c7 48          	add    rdi,0x48
      efb9ea:	4c 8d a4 24 10 07 00 	lea    r12,[rsp+0x710]
      efb9f1:	00 
      efb9f2:	4c 89 e6             	mov    rsi,r12
      efb9f5:	e8 38 5c 7d 00       	call   16d1632 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8579e>
      efb9fa:	4c 89 e7             	mov    rdi,r12
      efb9fd:	e8 2a 61 7d 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
      efba02:	4c 89 ff             	mov    rdi,r15
      efba05:	e8 7c 2a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efba0a:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      efba11:	00 
      efba12:	48 89 de             	mov    rsi,rbx
      efba15:	4c 89 f2             	mov    rdx,r14
      efba18:	e8 e7 2d 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efba1d:	31 ff                	xor    edi,edi
      efba1f:	e8 f8 29 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efba24:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efba29:	80 b8 e0 01 00 00 00 	cmp    BYTE PTR [rax+0x1e0],0x0
      efba30:	4c 8b bc 24 20 01 00 	mov    r15,QWORD PTR [rsp+0x120]
      efba37:	00 
      efba38:	74 27                	je     efba61 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2e77>
      efba3a:	66 0f 6f 80 00 03 00 	movdqa xmm0,XMMWORD PTR [rax+0x300]
      efba41:	00 
      efba42:	66 0f 7f 84 24 80 00 	movdqa XMMWORD PTR [rsp+0x80],xmm0
      efba49:	00 00 
      efba4b:	48 8b 80 08 03 00 00 	mov    rax,QWORD PTR [rax+0x308]
      efba52:	48 85 c0             	test   rax,rax
      efba55:	74 05                	je     efba5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2e72>
      efba57:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efba5c:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efba61:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efba68:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
      efba6f:	00 
      efba70:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efba77:	48 85 c0             	test   rax,rax
      efba7a:	74 05                	je     efba81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2e97>
      efba7c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efba81:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efba86:	4c 8b 60 10          	mov    r12,QWORD PTR [rax+0x10]
      efba8a:	40 8a a8 f6 01 00 00 	mov    bpl,BYTE PTR [rax+0x1f6]
      efba91:	bf d0 00 00 00       	mov    edi,0xd0
      efba96:	e8 65 24 8f 00       	call   17edf00 <_Znwm@plt>
      efba9b:	49 89 c6             	mov    r14,rax
      efba9e:	49 89 c5             	mov    r13,rax
      efbaa1:	0f 57 c0             	xorps  xmm0,xmm0
      efbaa4:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
      efbaa9:	48 8d 05 18 f3 90 00 	lea    rax,[rip+0x90f318]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      efbab0:	49 89 06             	mov    QWORD PTR [r14],rax
      efbab3:	48 8d 05 86 7d 94 00 	lea    rax,[rip+0x947d86]        # 1843840 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x157d8>
      efbaba:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efbabe:	49 8d 5e 30          	lea    rbx,[r14+0x30]
      efbac2:	48 89 df             	mov    rdi,rbx
      efbac5:	4c 89 fe             	mov    rsi,r15
      efbac8:	4c 89 b4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r14
      efbacf:	00 
      efbad0:	e8 bb e7 b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efbad5:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efbada:	48 8d 71 70          	lea    rsi,[rcx+0x70]
      efbade:	48 8b 81 58 01 00 00 	mov    rax,QWORD PTR [rcx+0x158]
      efbae5:	0f 28 81 50 01 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x150]
      efbaec:	41 0f 29 45 60       	movaps XMMWORD PTR [r13+0x60],xmm0
      efbaf1:	48 85 c0             	test   rax,rax
      efbaf4:	74 05                	je     efbafb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2f11>
      efbaf6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efbafb:	49 8d 7e 70          	lea    rdi,[r14+0x70]
      efbaff:	e8 8c e7 b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efbb04:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
      efbb0b:	00 00 
      efbb0d:	66 41 0f 7f 85 a0 00 	movdqa XMMWORD PTR [r13+0xa0],xmm0
      efbb14:	00 00 
      efbb16:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      efbb1d:	48 85 db             	test   rbx,rbx
      efbb20:	74 05                	je     efbb27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2f3d>
      efbb22:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      efbb27:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
      efbb2e:	00 00 
      efbb30:	66 41 0f 7f 85 b0 00 	movdqa XMMWORD PTR [r13+0xb0],xmm0
      efbb37:	00 00 
      efbb39:	66 49 0f 3a 16 c7 01 	pextrq r15,xmm0,0x1
      efbb40:	4d 85 ff             	test   r15,r15
      efbb43:	74 05                	je     efbb4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2f60>
      efbb45:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      efbb4a:	4d 89 a5 c0 00 00 00 	mov    QWORD PTR [r13+0xc0],r12
      efbb51:	41 88 ad c8 00 00 00 	mov    BYTE PTR [r13+0xc8],bpl
      efbb58:	31 ff                	xor    edi,edi
      efbb5a:	e8 bd 28 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efbb5f:	4c 89 ff             	mov    rdi,r15
      efbb62:	e8 1f 29 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efbb67:	48 89 df             	mov    rdi,rbx
      efbb6a:	e8 17 29 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efbb6f:	bf 38 01 00 00       	mov    edi,0x138
      efbb74:	e8 87 23 8f 00       	call   17edf00 <_Znwm@plt>
      efbb79:	49 89 c7             	mov    r15,rax
      efbb7c:	49 89 c5             	mov    r13,rax
      efbb7f:	66 0f ef c0          	pxor   xmm0,xmm0
      efbb83:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      efbb89:	48 8d 05 30 ec 93 00 	lea    rax,[rip+0x93ec30]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efbb90:	49 89 07             	mov    QWORD PTR [r15],rax
      efbb93:	0f 28 84 24 d0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1d0]
      efbb9a:	00 
      efbb9b:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
      efbba2:	00 
      efbba3:	48 8b 84 24 d8 01 00 	mov    rax,QWORD PTR [rsp+0x1d8]
      efbbaa:	00 
      efbbab:	48 85 c0             	test   rax,rax
      efbbae:	74 05                	je     efbbb5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2fcb>
      efbbb0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efbbb5:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
      efbbba:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      efbbbe:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      efbbc2:	48 85 c0             	test   rax,rax
      efbbc5:	74 05                	je     efbbcc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2fe2>
      efbbc7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efbbcc:	48 8d 05 f5 79 94 00 	lea    rax,[rip+0x9479f5]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efbbd3:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      efbbd7:	66 0f ef c9          	pxor   xmm1,xmm1
      efbbdb:	f3 41 0f 7f 4d 28    	movdqu XMMWORD PTR [r13+0x28],xmm1
      efbbe1:	48 8d 05 88 fb 93 00 	lea    rax,[rip+0x93fb88]        # 183b770 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd708>
      efbbe8:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
      efbbec:	f3 41 0f 7f 45 38    	movdqu XMMWORD PTR [r13+0x38],xmm0
      efbbf2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efbbf9:	48 85 ff             	test   rdi,rdi
      efbbfc:	74 05                	je     efbc03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3019>
      efbbfe:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efbc03:	49 83 c6 20          	add    r14,0x20
      efbc07:	49 83 c7 18          	add    r15,0x18
      efbc0b:	48 8d 05 86 fb 93 00 	lea    rax,[rip+0x93fb86]        # 183b798 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd730>
      efbc12:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      efbc16:	48 8d 05 63 fd 93 00 	lea    rax,[rip+0x93fd63]        # 183b980 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd918>
      efbc1d:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
      efbc21:	e8 60 28 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efbc26:	48 8d 05 2b f9 93 00 	lea    rax,[rip+0x93f92b]        # 183b558 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd4f0>
      efbc2d:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      efbc31:	48 8d 05 10 fb 93 00 	lea    rax,[rip+0x93fb10]        # 183b748 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd6e0>
      efbc38:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
      efbc3c:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
      efbc43:	00 00 
      efbc45:	f3 41 0f 7f 45 48    	movdqu XMMWORD PTR [r13+0x48],xmm0
      efbc4b:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      efbc52:	48 85 db             	test   rbx,rbx
      efbc55:	74 05                	je     efbc5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3072>
      efbc57:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      efbc5c:	66 41 83 65 58 00    	and    WORD PTR [r13+0x58],0x0
      efbc62:	31 c0                	xor    eax,eax
      efbc64:	41 88 45 60          	mov    BYTE PTR [r13+0x60],al
      efbc68:	41 88 45 68          	mov    BYTE PTR [r13+0x68],al
      efbc6c:	41 88 45 70          	mov    BYTE PTR [r13+0x70],al
      efbc70:	41 88 45 78          	mov    BYTE PTR [r13+0x78],al
      efbc74:	66 0f ef c0          	pxor   xmm0,xmm0
      efbc78:	f3 41 0f 7f 85 e8 00 	movdqu XMMWORD PTR [r13+0xe8],xmm0
      efbc7f:	00 00 
      efbc81:	41 88 85 f8 00 00 00 	mov    BYTE PTR [r13+0xf8],al
      efbc88:	f3 41 0f 7f 85 80 00 	movdqu XMMWORD PTR [r13+0x80],xmm0
      efbc8f:	00 00 
      efbc91:	f3 41 0f 7f 85 90 00 	movdqu XMMWORD PTR [r13+0x90],xmm0
      efbc98:	00 00 
      efbc9a:	f3 41 0f 7f 85 a0 00 	movdqu XMMWORD PTR [r13+0xa0],xmm0
      efbca1:	00 00 
      efbca3:	f3 41 0f 7f 85 b0 00 	movdqu XMMWORD PTR [r13+0xb0],xmm0
      efbcaa:	00 00 
      efbcac:	66 41 83 a5 e0 00 00 	and    WORD PTR [r13+0xe0],0x0
      efbcb3:	00 00 
      efbcb5:	f3 41 0f 7f 85 c0 00 	movdqu XMMWORD PTR [r13+0xc0],xmm0
      efbcbc:	00 00 
      efbcbe:	f3 41 0f 7f 85 d0 00 	movdqu XMMWORD PTR [r13+0xd0],xmm0
      efbcc5:	00 00 
      efbcc7:	f3 41 0f 7f 85 00 01 	movdqu XMMWORD PTR [r13+0x100],xmm0
      efbcce:	00 00 
      efbcd0:	4d 89 b5 10 01 00 00 	mov    QWORD PTR [r13+0x110],r14
      efbcd7:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
      efbcde:	00 
      efbcdf:	49 89 85 18 01 00 00 	mov    QWORD PTR [r13+0x118],rax
      efbce6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efbceb:	f3 41 0f 7f 85 20 01 	movdqu XMMWORD PTR [r13+0x120],xmm0
      efbcf2:	00 00 
      efbcf4:	66 41 83 a5 30 01 00 	and    WORD PTR [r13+0x130],0x0
      efbcfb:	00 00 
      efbcfd:	31 ff                	xor    edi,edi
      efbcff:	e8 82 27 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efbd04:	48 89 df             	mov    rdi,rbx
      efbd07:	e8 7a 27 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efbd0c:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efbd13:	00 
      efbd14:	48 89 df             	mov    rdi,rbx
      efbd17:	4c 89 fe             	mov    rsi,r15
      efbd1a:	4c 89 ea             	mov    rdx,r13
      efbd1d:	e8 e2 2a 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efbd22:	31 ff                	xor    edi,edi
      efbd24:	e8 f3 26 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efbd29:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efbd2d:	66 0f ef c9          	pxor   xmm1,xmm1
      efbd31:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efbd35:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      efbd3a:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efbd3e:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efbd44:	e8 3d 27 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efbd49:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efbd4d:	e8 34 27 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efbd52:	48 8d 35 71 46 43 ff 	lea    rsi,[rip+0xffffffffff434671]        # 3303ca <_ZTSSt12bad_any_cast@@Base-0x5fdfe>
      efbd59:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efbd60:	00 
      efbd61:	e8 18 dd b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efbd66:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efbd6d:	00 
      efbd6e:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      efbd75:	00 
      efbd76:	e8 15 1d f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efbd7b:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efbd82:	00 
      efbd83:	e8 08 21 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efbd88:	48 8d 35 8b 1a 47 ff 	lea    rsi,[rip+0xffffffffff471a8b]        # 36d81a <_ZTSSt12bad_any_cast@@Base-0x229ae>
      efbd8f:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efbd96:	00 
      efbd97:	e8 e2 dc b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efbd9c:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efbda3:	00 
      efbda4:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
      efbdab:	00 
      efbdac:	e8 df 1c f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efbdb1:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efbdb8:	00 
      efbdb9:	e8 d2 20 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efbdbe:	bf b8 01 00 00       	mov    edi,0x1b8
      efbdc3:	e8 38 21 8f 00       	call   17edf00 <_Znwm@plt>
      efbdc8:	49 89 c6             	mov    r14,rax
      efbdcb:	66 0f ef c9          	pxor   xmm1,xmm1
      efbdcf:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
      efbdd4:	48 8d 05 e5 e9 93 00 	lea    rax,[rip+0x93e9e5]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efbddb:	49 89 06             	mov    QWORD PTR [r14],rax
      efbdde:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efbde4:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efbde8:	48 85 c0             	test   rax,rax
      efbdeb:	74 05                	je     efbdf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3208>
      efbded:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efbdf2:	48 8d 05 cf 77 94 00 	lea    rax,[rip+0x9477cf]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efbdf9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efbdfd:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
      efbe03:	48 8d 05 f6 2c 94 00 	lea    rax,[rip+0x942cf6]        # 183eb00 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10a98>
      efbe0a:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efbe0e:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
      efbe14:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efbe1b:	48 85 ff             	test   rdi,rdi
      efbe1e:	74 05                	je     efbe25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc323b>
      efbe20:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efbe25:	48 8d 05 fc 2c 94 00 	lea    rax,[rip+0x942cfc]        # 183eb28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10ac0>
      efbe2c:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efbe30:	48 8d 05 d9 2e 94 00 	lea    rax,[rip+0x942ed9]        # 183ed10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10ca8>
      efbe37:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efbe3b:	e8 46 26 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efbe40:	48 8d 05 a1 2a 94 00 	lea    rax,[rip+0x942aa1]        # 183e8e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10880>
      efbe47:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efbe4b:	48 8d 05 86 2c 94 00 	lea    rax,[rip+0x942c86]        # 183ead8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10a70>
      efbe52:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efbe56:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efbe5b:	48 8b 81 18 03 00 00 	mov    rax,QWORD PTR [rcx+0x318]
      efbe62:	66 0f 6f 81 10 03 00 	movdqa xmm0,XMMWORD PTR [rcx+0x310]
      efbe69:	00 
      efbe6a:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
      efbe70:	48 85 c0             	test   rax,rax
      efbe73:	74 05                	je     efbe7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3290>
      efbe75:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efbe7a:	48 8d 35 76 f9 42 ff 	lea    rsi,[rip+0xffffffffff42f976]        # 32b7f7 <_ZTSSt12bad_any_cast@@Base-0x649d1>
      efbe81:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efbe88:	00 
      efbe89:	e8 f0 db b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efbe8e:	48 8d 35 93 c4 44 ff 	lea    rsi,[rip+0xffffffffff44c493]        # 348328 <_ZTSSt12bad_any_cast@@Base-0x47ea0>
      efbe95:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efbe9c:	00 
      efbe9d:	e8 dc db b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efbea2:	49 8d 7e 58          	lea    rdi,[r14+0x58]
      efbea6:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efbead:	00 
      efbeae:	48 8d 94 24 e0 06 00 	lea    rdx,[rsp+0x6e0]
      efbeb5:	00 
      efbeb6:	e8 f3 33 0e 00       	call   fdf2ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66c4>
      efbebb:	4c 89 f3             	mov    rbx,r14
      efbebe:	48 83 c3 18          	add    rbx,0x18
      efbec2:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efbec9:	00 
      efbeca:	e8 c1 1f 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efbecf:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efbed6:	00 
      efbed7:	e8 b4 1f 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efbedc:	31 c0                	xor    eax,eax
      efbede:	41 88 86 a0 01 00 00 	mov    BYTE PTR [r14+0x1a0],al
      efbee5:	66 0f ef c0          	pxor   xmm0,xmm0
      efbee9:	f3 41 0f 7f 86 80 00 	movdqu XMMWORD PTR [r14+0x80],xmm0
      efbef0:	00 00 
      efbef2:	f3 41 0f 7f 86 90 00 	movdqu XMMWORD PTR [r14+0x90],xmm0
      efbef9:	00 00 
      efbefb:	f3 41 0f 7f 86 a0 00 	movdqu XMMWORD PTR [r14+0xa0],xmm0
      efbf02:	00 00 
      efbf04:	41 88 86 b0 00 00 00 	mov    BYTE PTR [r14+0xb0],al
      efbf0b:	49 83 a6 a8 01 00 00 	and    QWORD PTR [r14+0x1a8],0x0
      efbf12:	00 
      efbf13:	49 83 a6 ae 01 00 00 	and    QWORD PTR [r14+0x1ae],0x0
      efbf1a:	00 
      efbf1b:	4c 8d bc 24 20 02 00 	lea    r15,[rsp+0x220]
      efbf22:	00 
      efbf23:	4c 89 ff             	mov    rdi,r15
      efbf26:	48 89 de             	mov    rsi,rbx
      efbf29:	4c 89 f2             	mov    rdx,r14
      efbf2c:	e8 d3 28 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efbf31:	31 ff                	xor    edi,edi
      efbf33:	e8 e4 24 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efbf38:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
      efbf3d:	66 0f ef c9          	pxor   xmm1,xmm1
      efbf41:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
      efbf46:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efbf4a:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efbf50:	e8 31 25 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efbf55:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      efbf59:	e8 28 25 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efbf5e:	48 8d 35 c3 c3 44 ff 	lea    rsi,[rip+0xffffffffff44c3c3]        # 348328 <_ZTSSt12bad_any_cast@@Base-0x47ea0>
      efbf65:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efbf6c:	00 
      efbf6d:	e8 0c db b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efbf72:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efbf79:	00 
      efbf7a:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      efbf81:	00 
      efbf82:	e8 09 1b f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efbf87:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efbf8e:	00 
      efbf8f:	e8 fc 1e 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efbf94:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efbf99:	80 b8 f3 01 00 00 00 	cmp    BYTE PTR [rax+0x1f3],0x0
      efbfa0:	0f 84 95 01 00 00    	je     efc13b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3551>
      efbfa6:	bf 80 01 00 00       	mov    edi,0x180
      efbfab:	e8 50 1f 8f 00       	call   17edf00 <_Znwm@plt>
      efbfb0:	49 89 c6             	mov    r14,rax
      efbfb3:	66 0f ef c9          	pxor   xmm1,xmm1
      efbfb7:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
      efbfbc:	48 8d 05 fd e7 93 00 	lea    rax,[rip+0x93e7fd]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efbfc3:	49 89 06             	mov    QWORD PTR [r14],rax
      efbfc6:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efbfcc:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efbfd0:	48 85 c0             	test   rax,rax
      efbfd3:	74 05                	je     efbfda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc33f0>
      efbfd5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efbfda:	48 8d 05 e7 75 94 00 	lea    rax,[rip+0x9475e7]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efbfe1:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efbfe5:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
      efbfeb:	48 8d 05 26 4f 94 00 	lea    rax,[rip+0x944f26]        # 1840f18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12eb0>
      efbff2:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efbff6:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
      efbffc:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efc003:	48 85 ff             	test   rdi,rdi
      efc006:	74 05                	je     efc00d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3423>
      efc008:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efc00d:	48 8d 05 2c 4f 94 00 	lea    rax,[rip+0x944f2c]        # 1840f40 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12ed8>
      efc014:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efc018:	48 8d 05 09 51 94 00 	lea    rax,[rip+0x945109]        # 1841128 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x130c0>
      efc01f:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efc023:	e8 5e 24 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc028:	48 8d 05 d1 4c 94 00 	lea    rax,[rip+0x944cd1]        # 1840d00 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12c98>
      efc02f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efc033:	48 8d 05 b6 4e 94 00 	lea    rax,[rip+0x944eb6]        # 1840ef0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12e88>
      efc03a:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efc03e:	48 8d 35 ed 6b 45 ff 	lea    rsi,[rip+0xffffffffff456bed]        # 352c32 <_ZTSSt12bad_any_cast@@Base-0x3d596>
      efc045:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efc04c:	00 
      efc04d:	e8 2c da b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efc052:	48 8d 35 eb 6b 45 ff 	lea    rsi,[rip+0xffffffffff456beb]        # 352c44 <_ZTSSt12bad_any_cast@@Base-0x3d584>
      efc059:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efc060:	00 
      efc061:	e8 18 da b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efc066:	49 8d 7e 48          	lea    rdi,[r14+0x48]
      efc06a:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efc071:	00 
      efc072:	48 8d 94 24 e0 06 00 	lea    rdx,[rsp+0x6e0]
      efc079:	00 
      efc07a:	e8 2f 32 0e 00       	call   fdf2ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66c4>
      efc07f:	4c 89 f3             	mov    rbx,r14
      efc082:	48 83 c3 18          	add    rbx,0x18
      efc086:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efc08d:	00 
      efc08e:	e8 fd 1d 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efc093:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efc09a:	00 
      efc09b:	e8 f0 1d 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efc0a0:	31 c0                	xor    eax,eax
      efc0a2:	41 88 46 70          	mov    BYTE PTR [r14+0x70],al
      efc0a6:	41 88 86 60 01 00 00 	mov    BYTE PTR [r14+0x160],al
      efc0ad:	41 88 86 68 01 00 00 	mov    BYTE PTR [r14+0x168],al
      efc0b4:	41 88 86 70 01 00 00 	mov    BYTE PTR [r14+0x170],al
      efc0bb:	41 88 86 78 01 00 00 	mov    BYTE PTR [r14+0x178],al
      efc0c2:	4c 8d bc 24 20 02 00 	lea    r15,[rsp+0x220]
      efc0c9:	00 
      efc0ca:	4c 89 ff             	mov    rdi,r15
      efc0cd:	48 89 de             	mov    rsi,rbx
      efc0d0:	4c 89 f2             	mov    rdx,r14
      efc0d3:	e8 2c 27 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efc0d8:	31 ff                	xor    edi,edi
      efc0da:	e8 3d 23 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efc0df:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
      efc0e4:	66 0f ef c9          	pxor   xmm1,xmm1
      efc0e8:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
      efc0ed:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efc0f1:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efc0f7:	e8 8a 23 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc0fc:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      efc100:	e8 81 23 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc105:	48 8d 35 e4 de 44 ff 	lea    rsi,[rip+0xffffffffff44dee4]        # 349ff0 <_ZTSSt12bad_any_cast@@Base-0x461d8>
      efc10c:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efc113:	00 
      efc114:	e8 65 d9 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efc119:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efc120:	00 
      efc121:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
      efc128:	00 
      efc129:	e8 62 19 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efc12e:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efc135:	00 
      efc136:	e8 55 1d 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efc13b:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efc140:	80 b8 64 01 00 00 00 	cmp    BYTE PTR [rax+0x164],0x0
      efc147:	0f 84 d1 04 00 00    	je     efc61e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3a34>
      efc14d:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efc152:	4c 8d b0 20 03 00 00 	lea    r14,[rax+0x320]
      efc159:	48 83 b8 20 03 00 00 	cmp    QWORD PTR [rax+0x320],0x0
      efc160:	00 
      efc161:	74 36                	je     efc199 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc35af>
      efc163:	48 8d 15 cb 77 48 ff 	lea    rdx,[rip+0xffffffffff4877cb]        # 383935 <_ZTSSt12bad_any_cast@@Base-0xc893>
      efc16a:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efc171:	00 
      efc172:	4c 89 ee             	mov    rsi,r13
      efc175:	4c 89 f1             	mov    rcx,r14
      efc178:	e8 6e 27 00 00       	call   efe8eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5d01>
      efc17d:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efc184:	00 
      efc185:	4c 89 ef             	mov    rdi,r13
      efc188:	48 89 de             	mov    rsi,rbx
      efc18b:	e8 8c d6 bb ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      efc190:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efc194:	e8 ed 22 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc199:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efc19e:	8b 80 6c 01 00 00    	mov    eax,DWORD PTR [rax+0x16c]
      efc1a4:	ff c8                	dec    eax
      efc1a6:	83 f8 05             	cmp    eax,0x5
      efc1a9:	4c 89 b4 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],r14
      efc1b0:	00 
      efc1b1:	77 21                	ja     efc1d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc35ea>
      efc1b3:	48 8d 0d ce ab 49 ff 	lea    rcx,[rip+0xffffffffff49abce]        # 396d88 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x3969>
      efc1ba:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
      efc1be:	48 01 c8             	add    rax,rcx
      efc1c1:	ff e0                	jmp    rax
      efc1c3:	6a 08                	push   0x8
      efc1c5:	5f                   	pop    rdi
      efc1c6:	e8 35 1d 8f 00       	call   17edf00 <_Znwm@plt>
      efc1cb:	48 8d 15 c6 6e 94 00 	lea    rdx,[rip+0x946ec6]        # 1843098 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15030>
      efc1d2:	eb 53                	jmp    efc227 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc363d>
      efc1d4:	6a 08                	push   0x8
      efc1d6:	5f                   	pop    rdi
      efc1d7:	e8 24 1d 8f 00       	call   17edf00 <_Znwm@plt>
      efc1dc:	48 8d 15 f5 6c 94 00 	lea    rdx,[rip+0x946cf5]        # 1842ed8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14e70>
      efc1e3:	eb 42                	jmp    efc227 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc363d>
      efc1e5:	6a 08                	push   0x8
      efc1e7:	5f                   	pop    rdi
      efc1e8:	e8 13 1d 8f 00       	call   17edf00 <_Znwm@plt>
      efc1ed:	48 8d 15 c4 6d 94 00 	lea    rdx,[rip+0x946dc4]        # 1842fb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14f50>
      efc1f4:	eb 31                	jmp    efc227 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc363d>
      efc1f6:	6a 08                	push   0x8
      efc1f8:	5f                   	pop    rdi
      efc1f9:	e8 02 1d 8f 00       	call   17edf00 <_Znwm@plt>
      efc1fe:	48 8d 15 23 6e 94 00 	lea    rdx,[rip+0x946e23]        # 1843028 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14fc0>
      efc205:	eb 20                	jmp    efc227 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc363d>
      efc207:	6a 08                	push   0x8
      efc209:	5f                   	pop    rdi
      efc20a:	e8 f1 1c 8f 00       	call   17edf00 <_Znwm@plt>
      efc20f:	48 8d 15 42 73 94 00 	lea    rdx,[rip+0x947342]        # 1843558 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x154f0>
      efc216:	eb 0f                	jmp    efc227 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc363d>
      efc218:	6a 08                	push   0x8
      efc21a:	5f                   	pop    rdi
      efc21b:	e8 e0 1c 8f 00       	call   17edf00 <_Znwm@plt>
      efc220:	48 8d 15 21 6d 94 00 	lea    rdx,[rip+0x946d21]        # 1842f48 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14ee0>
      efc227:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      efc22e:	00 
      efc22f:	48 89 10             	mov    QWORD PTR [rax],rdx
      efc232:	48 8b 6c 24 60       	mov    rbp,QWORD PTR [rsp+0x60]
      efc237:	4c 8b 65 10          	mov    r12,QWORD PTR [rbp+0x10]
      efc23b:	4c 8b bd 30 01 00 00 	mov    r15,QWORD PTR [rbp+0x130]
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
      efc2aa:	48 89 c5             	mov    rbp,rax
      efc2ad:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]
      efc2b2:	48 8d 82 64 01 00 00 	lea    rax,[rdx+0x164]
      efc2b9:	0f 57 c0             	xorps  xmm0,xmm0
      efc2bc:	0f 11 45 08          	movups XMMWORD PTR [rbp+0x8],xmm0
      efc2c0:	48 8d 0d 69 12 90 00 	lea    rcx,[rip+0x901269]        # 17fd530 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe25750>
      efc2c7:	48 89 4d 00          	mov    QWORD PTR [rbp+0x0],rcx
      efc2cb:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]
      efc2d2:	00 
      efc2d3:	48 89 4d 18          	mov    QWORD PTR [rbp+0x18],rcx
      efc2d7:	0f 10 08             	movups xmm1,XMMWORD PTR [rax]
      efc2da:	0f 29 8c 24 e0 01 00 	movaps XMMWORD PTR [rsp+0x1e0],xmm1
      efc2e1:	00 
      efc2e2:	8a 82 40 03 00 00    	mov    al,BYTE PTR [rdx+0x340]
      efc2e8:	88 84 24 00 01 00 00 	mov    BYTE PTR [rsp+0x100],al
      efc2ef:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
      efc2f4:	f3 0f 6f 08          	movdqu xmm1,XMMWORD PTR [rax]
      efc2f8:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      efc2fc:	48 85 ff             	test   rdi,rdi
      efc2ff:	74 05                	je     efc306 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc371c>
      efc301:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efc306:	48 8d 05 bb 72 94 00 	lea    rax,[rip+0x9472bb]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efc30d:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
      efc311:	41 0f 29 45 30       	movaps XMMWORD PTR [r13+0x30],xmm0
      efc316:	48 8d 05 eb 22 94 00 	lea    rax,[rip+0x9422eb]        # 183e608 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x105a0>
      efc31d:	49 89 45 28          	mov    QWORD PTR [r13+0x28],rax
      efc321:	66 41 0f 7f 4d 40    	movdqa XMMWORD PTR [r13+0x40],xmm1
      efc327:	48 85 ff             	test   rdi,rdi
      efc32a:	74 05                	je     efc331 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3747>
      efc32c:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efc331:	48 8d 05 f8 22 94 00 	lea    rax,[rip+0x9422f8]        # 183e630 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x105c8>
      efc338:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
      efc33c:	48 8d 05 d5 24 94 00 	lea    rax,[rip+0x9424d5]        # 183e818 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x107b0>
      efc343:	49 89 45 28          	mov    QWORD PTR [r13+0x28],rax
      efc347:	e8 3a 21 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc34c:	48 8d 05 9d 20 94 00 	lea    rax,[rip+0x94209d]        # 183e3f0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10388>
      efc353:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
      efc357:	48 8d 05 82 22 94 00 	lea    rax,[rip+0x942282]        # 183e5e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10578>
      efc35e:	49 89 45 28          	mov    QWORD PTR [r13+0x28],rax
      efc362:	66 41 83 65 50 00    	and    WORD PTR [r13+0x50],0x0
      efc368:	4d 89 65 58          	mov    QWORD PTR [r13+0x58],r12
      efc36c:	4d 89 75 60          	mov    QWORD PTR [r13+0x60],r14
      efc370:	4d 89 7d 68          	mov    QWORD PTR [r13+0x68],r15
      efc374:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
      efc37b:	00 00 
      efc37d:	66 41 0f 7f 45 70    	movdqa XMMWORD PTR [r13+0x70],xmm0
      efc383:	66 49 0f 3a 16 c7 01 	pextrq r15,xmm0,0x1
      efc38a:	4d 85 ff             	test   r15,r15
      efc38d:	74 05                	je     efc394 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc37aa>
      efc38f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      efc394:	49 89 9d 80 00 00 00 	mov    QWORD PTR [r13+0x80],rbx
      efc39b:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
      efc3a2:	00 
      efc3a3:	49 89 85 88 00 00 00 	mov    QWORD PTR [r13+0x88],rax
      efc3aa:	49 89 ad 90 00 00 00 	mov    QWORD PTR [r13+0x90],rbp
      efc3b1:	31 c0                	xor    eax,eax
      efc3b3:	41 88 85 b0 00 00 00 	mov    BYTE PTR [r13+0xb0],al
      efc3ba:	41 88 85 b4 00 00 00 	mov    BYTE PTR [r13+0xb4],al
      efc3c1:	41 88 85 b8 00 00 00 	mov    BYTE PTR [r13+0xb8],al
      efc3c8:	41 88 85 d0 00 00 00 	mov    BYTE PTR [r13+0xd0],al
      efc3cf:	41 88 85 d8 00 00 00 	mov    BYTE PTR [r13+0xd8],al
      efc3d6:	41 88 85 e0 00 00 00 	mov    BYTE PTR [r13+0xe0],al
      efc3dd:	41 88 85 f8 00 00 00 	mov    BYTE PTR [r13+0xf8],al
      efc3e4:	41 88 85 00 01 00 00 	mov    BYTE PTR [r13+0x100],al
      efc3eb:	41 88 85 18 01 00 00 	mov    BYTE PTR [r13+0x118],al
      efc3f2:	41 88 85 20 01 00 00 	mov    BYTE PTR [r13+0x120],al
      efc3f9:	41 88 85 28 01 00 00 	mov    BYTE PTR [r13+0x128],al
      efc400:	41 88 85 18 02 00 00 	mov    BYTE PTR [r13+0x218],al
      efc407:	41 88 85 20 02 00 00 	mov    BYTE PTR [r13+0x220],al
      efc40e:	41 88 85 10 03 00 00 	mov    BYTE PTR [r13+0x310],al
      efc415:	41 88 85 18 03 00 00 	mov    BYTE PTR [r13+0x318],al
      efc41c:	41 88 85 08 04 00 00 	mov    BYTE PTR [r13+0x408],al
      efc423:	41 88 85 10 04 00 00 	mov    BYTE PTR [r13+0x410],al
      efc42a:	41 88 85 60 04 00 00 	mov    BYTE PTR [r13+0x460],al
      efc431:	66 41 83 a5 68 04 00 	and    WORD PTR [r13+0x468],0x0
      efc438:	00 00 
      efc43a:	41 88 85 6a 04 00 00 	mov    BYTE PTR [r13+0x46a],al
      efc441:	66 0f ef c0          	pxor   xmm0,xmm0
      efc445:	f3 41 0f 7f 85 98 00 	movdqu XMMWORD PTR [r13+0x98],xmm0
      efc44c:	00 00 
      efc44e:	49 83 a5 a5 00 00 00 	and    QWORD PTR [r13+0xa5],0x0
      efc455:	00 
      efc456:	48 8d 35 ff 13 47 ff 	lea    rsi,[rip+0xffffffffff4713ff]        # 36d85c <_ZTSSt12bad_any_cast@@Base-0x2296c>
      efc45d:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efc464:	00 
      efc465:	e8 14 d6 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efc46a:	48 8d 35 36 dc 44 ff 	lea    rsi,[rip+0xffffffffff44dc36]        # 34a0a7 <_ZTSSt12bad_any_cast@@Base-0x46121>
      efc471:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
      efc478:	00 
      efc479:	e8 00 d6 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efc47e:	49 8d bd 70 04 00 00 	lea    rdi,[r13+0x470]
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
      efc901:	49 89 07             	mov    QWORD PTR [r15],rax
      efc904:	48 8d 05 85 34 94 00 	lea    rax,[rip+0x943485]        # 183fd90 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11d28>
      efc90b:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efc90f:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      efc913:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efc918:	66 0f 6f 80 50 01 00 	movdqa xmm0,XMMWORD PTR [rax+0x150]
      efc91f:	00 
      efc920:	e8 71 57 00 00       	call   f02096 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc94ac>
      efc925:	6a 58                	push   0x58
      efc927:	5f                   	pop    rdi
      efc928:	e8 d3 15 8f 00       	call   17edf00 <_Znwm@plt>
      efc92d:	49 89 c5             	mov    r13,rax
      efc930:	48 89 c5             	mov    rbp,rax
      efc933:	66 0f ef c0          	pxor   xmm0,xmm0
      efc937:	f3 41 0f 7f 45 08    	movdqu XMMWORD PTR [r13+0x8],xmm0
      efc93d:	48 8d 05 7c de 93 00 	lea    rax,[rip+0x93de7c]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efc944:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      efc948:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
      efc94d:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      efc951:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      efc955:	48 85 c0             	test   rax,rax
      efc958:	74 05                	je     efc95f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3d75>
      efc95a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efc95f:	49 83 c7 20          	add    r15,0x20
      efc963:	49 83 c5 18          	add    r13,0x18
      efc967:	48 8d 05 5a 6c 94 00 	lea    rax,[rip+0x946c5a]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efc96e:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
      efc972:	66 0f ef c9          	pxor   xmm1,xmm1
      efc976:	f3 0f 7f 4d 28       	movdqu XMMWORD PTR [rbp+0x28],xmm1
      efc97b:	48 8d 05 36 34 94 00 	lea    rax,[rip+0x943436]        # 183fdb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11d50>
      efc982:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      efc986:	f3 0f 7f 45 38       	movdqu XMMWORD PTR [rbp+0x38],xmm0
      efc98b:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efc992:	48 85 ff             	test   rdi,rdi
      efc995:	74 05                	je     efc99c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3db2>
      efc997:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efc99c:	48 8d 05 3d 34 94 00 	lea    rax,[rip+0x94343d]        # 183fde0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11d78>
      efc9a3:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
      efc9a7:	48 8d 05 22 34 94 00 	lea    rax,[rip+0x943422]        # 183fdd0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11d68>
      efc9ae:	bb f8 01 00 00       	mov    ebx,0x1f8
      efc9b3:	48 01 d8             	add    rax,rbx
      efc9b6:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      efc9ba:	e8 c7 1a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc9bf:	48 8d 05 ba 31 94 00 	lea    rax,[rip+0x9431ba]        # 183fb80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11b18>
      efc9c6:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
      efc9ca:	48 8d 05 9f 31 94 00 	lea    rax,[rip+0x94319f]        # 183fb70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11b08>
      efc9d1:	48 01 d8             	add    rax,rbx
      efc9d4:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      efc9d8:	4c 89 7d 48          	mov    QWORD PTR [rbp+0x48],r15
      efc9dc:	4c 89 75 50          	mov    QWORD PTR [rbp+0x50],r14
      efc9e0:	31 ff                	xor    edi,edi
      efc9e2:	e8 9f 1a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc9e7:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efc9ee:	00 
      efc9ef:	48 89 df             	mov    rdi,rbx
      efc9f2:	4c 89 ee             	mov    rsi,r13
      efc9f5:	48 89 ea             	mov    rdx,rbp
      efc9f8:	e8 07 1e 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efc9fd:	31 ff                	xor    edi,edi
      efc9ff:	e8 18 1a ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efca04:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efca08:	66 0f ef c9          	pxor   xmm1,xmm1
      efca0c:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efca10:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      efca15:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efca19:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efca1f:	e8 62 1a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efca24:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efca28:	e8 59 1a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efca2d:	31 ff                	xor    edi,edi
      efca2f:	e8 52 1a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efca34:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efca39:	80 b8 d2 01 00 00 00 	cmp    BYTE PTR [rax+0x1d2],0x0
      efca40:	0f 84 6b 01 00 00    	je     efcbb1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3fc7>
      efca46:	48 8b 98 58 03 00 00 	mov    rbx,QWORD PTR [rax+0x358]
      efca4d:	48 85 db             	test   rbx,rbx
      efca50:	0f 84 5b 01 00 00    	je     efcbb1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3fc7>
      efca56:	4c 8b a0 38 01 00 00 	mov    r12,QWORD PTR [rax+0x138]
      efca5d:	4c 8b a8 40 01 00 00 	mov    r13,QWORD PTR [rax+0x140]
      efca64:	6a 38                	push   0x38
      efca66:	5f                   	pop    rdi
      efca67:	e8 94 14 8f 00       	call   17edf00 <_Znwm@plt>
      efca6c:	49 89 c7             	mov    r15,rax
      efca6f:	49 89 c6             	mov    r14,rax
      efca72:	66 0f ef c0          	pxor   xmm0,xmm0
      efca76:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      efca7c:	48 8d 05 e5 09 90 00 	lea    rax,[rip+0x9009e5]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efca83:	49 89 07             	mov    QWORD PTR [r15],rax
      efca86:	48 8d 05 eb 79 94 00 	lea    rax,[rip+0x9479eb]        # 1844478 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb60>
      efca8d:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efca91:	4d 89 6f 20          	mov    QWORD PTR [r15+0x20],r13
      efca95:	49 89 5f 28          	mov    QWORD PTR [r15+0x28],rbx
      efca99:	4d 89 67 30          	mov    QWORD PTR [r15+0x30],r12
      efca9d:	6a 58                	push   0x58
      efca9f:	5f                   	pop    rdi
      efcaa0:	e8 5b 14 8f 00       	call   17edf00 <_Znwm@plt>
      efcaa5:	49 89 c5             	mov    r13,rax
      efcaa8:	48 89 c5             	mov    rbp,rax
      efcaab:	66 0f ef c0          	pxor   xmm0,xmm0
      efcaaf:	f3 41 0f 7f 45 08    	movdqu XMMWORD PTR [r13+0x8],xmm0
      efcab5:	48 8d 05 04 dd 93 00 	lea    rax,[rip+0x93dd04]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efcabc:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      efcac0:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
      efcac5:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      efcac9:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      efcacd:	48 85 c0             	test   rax,rax
      efcad0:	74 05                	je     efcad7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3eed>
      efcad2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efcad7:	49 83 c7 18          	add    r15,0x18
      efcadb:	49 83 c5 18          	add    r13,0x18
      efcadf:	48 8d 05 e2 6a 94 00 	lea    rax,[rip+0x946ae2]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efcae6:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
      efcaea:	66 0f ef c9          	pxor   xmm1,xmm1
      efcaee:	f3 0f 7f 4d 28       	movdqu XMMWORD PTR [rbp+0x28],xmm1
      efcaf3:	48 8d 05 8e 52 94 00 	lea    rax,[rip+0x94528e]        # 1841d88 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13d20>
      efcafa:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      efcafe:	f3 0f 7f 45 38       	movdqu XMMWORD PTR [rbp+0x38],xmm0
      efcb03:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efcb0a:	48 85 ff             	test   rdi,rdi
      efcb0d:	74 05                	je     efcb14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3f2a>
      efcb0f:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efcb14:	48 8d 05 95 52 94 00 	lea    rax,[rip+0x945295]        # 1841db0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13d48>
      efcb1b:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
      efcb1f:	48 8d 05 7a 52 94 00 	lea    rax,[rip+0x94527a]        # 1841da0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13d38>
      efcb26:	bb f8 01 00 00       	mov    ebx,0x1f8
      efcb2b:	48 01 d8             	add    rax,rbx
      efcb2e:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      efcb32:	e8 4f 19 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcb37:	48 8d 05 3a 50 94 00 	lea    rax,[rip+0x94503a]        # 1841b78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13b10>
      efcb3e:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
      efcb42:	48 8d 05 1f 50 94 00 	lea    rax,[rip+0x94501f]        # 1841b68 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13b00>
      efcb49:	48 01 d8             	add    rax,rbx
      efcb4c:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      efcb50:	4c 89 7d 48          	mov    QWORD PTR [rbp+0x48],r15
      efcb54:	4c 89 75 50          	mov    QWORD PTR [rbp+0x50],r14
      efcb58:	31 ff                	xor    edi,edi
      efcb5a:	e8 27 19 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcb5f:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efcb66:	00 
      efcb67:	48 89 df             	mov    rdi,rbx
      efcb6a:	4c 89 ee             	mov    rsi,r13
      efcb6d:	48 89 ea             	mov    rdx,rbp
      efcb70:	e8 8f 1c 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efcb75:	31 ff                	xor    edi,edi
      efcb77:	e8 a0 18 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efcb7c:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efcb80:	66 0f ef c9          	pxor   xmm1,xmm1
      efcb84:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efcb88:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      efcb8d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efcb91:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efcb97:	e8 ea 18 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcb9c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efcba0:	e8 e1 18 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcba5:	31 ff                	xor    edi,edi
      efcba7:	e8 da 18 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcbac:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efcbb1:	80 b8 f4 01 00 00 00 	cmp    BYTE PTR [rax+0x1f4],0x0
      efcbb8:	0f 84 55 01 00 00    	je     efcd13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4129>
      efcbbe:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efcbc3:	48 83 b8 60 03 00 00 	cmp    QWORD PTR [rax+0x360],0x0
      efcbca:	00 
      efcbcb:	0f 84 42 01 00 00    	je     efcd13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4129>
      efcbd1:	bf 10 01 00 00       	mov    edi,0x110
      efcbd6:	e8 25 13 8f 00       	call   17edf00 <_Znwm@plt>
      efcbdb:	49 89 c6             	mov    r14,rax
      efcbde:	49 89 c7             	mov    r15,rax
      efcbe1:	66 0f ef c9          	pxor   xmm1,xmm1
      efcbe5:	f3 41 0f 7f 4e 08    	movdqu XMMWORD PTR [r14+0x8],xmm1
      efcbeb:	48 8d 05 ce db 93 00 	lea    rax,[rip+0x93dbce]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efcbf2:	49 89 06             	mov    QWORD PTR [r14],rax
      efcbf5:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efcbfb:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efcbff:	48 85 c0             	test   rax,rax
      efcc02:	74 05                	je     efcc09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc401f>
      efcc04:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efcc09:	48 8d 05 b8 69 94 00 	lea    rax,[rip+0x9469b8]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efcc10:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efcc14:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efcc1a:	48 8d 05 97 15 94 00 	lea    rax,[rip+0x941597]        # 183e1b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10150>
      efcc21:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efcc25:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efcc2b:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efcc32:	48 85 ff             	test   rdi,rdi
      efcc35:	74 05                	je     efcc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4052>
      efcc37:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efcc3c:	49 83 c6 18          	add    r14,0x18
      efcc40:	48 8d 05 99 15 94 00 	lea    rax,[rip+0x941599]        # 183e1e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10178>
      efcc47:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efcc4b:	48 8d 05 76 17 94 00 	lea    rax,[rip+0x941776]        # 183e3c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10360>
      efcc52:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efcc56:	e8 2b 18 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcc5b:	48 8d 05 0e 13 94 00 	lea    rax,[rip+0x94130e]        # 183df70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xff08>
      efcc62:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efcc66:	48 8d 05 f3 14 94 00 	lea    rax,[rip+0x9414f3]        # 183e160 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x100f8>
      efcc6d:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efcc71:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efcc76:	48 8b 81 68 03 00 00 	mov    rax,QWORD PTR [rcx+0x368]
      efcc7d:	0f 28 81 60 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x360]
      efcc84:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0
      efcc89:	48 85 c0             	test   rax,rax
      efcc8c:	74 05                	je     efcc93 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc40a9>
      efcc8e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efcc93:	31 c0                	xor    eax,eax
      efcc95:	41 88 47 58          	mov    BYTE PTR [r15+0x58],al
      efcc99:	41 88 87 b0 00 00 00 	mov    BYTE PTR [r15+0xb0],al
      efcca0:	0f 57 c0             	xorps  xmm0,xmm0
      efcca3:	41 0f 11 87 b8 00 00 	movups XMMWORD PTR [r15+0xb8],xmm0
      efccaa:	00 
      efccab:	41 0f 11 87 c8 00 00 	movups XMMWORD PTR [r15+0xc8],xmm0
      efccb2:	00 
      efccb3:	41 0f 11 87 d8 00 00 	movups XMMWORD PTR [r15+0xd8],xmm0
      efccba:	00 
      efccbb:	41 88 87 e8 00 00 00 	mov    BYTE PTR [r15+0xe8],al
      efccc2:	41 0f 11 87 f0 00 00 	movups XMMWORD PTR [r15+0xf0],xmm0
      efccc9:	00 
      efccca:	41 0f 11 87 f9 00 00 	movups XMMWORD PTR [r15+0xf9],xmm0
      efccd1:	00 
      efccd2:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efccd9:	00 
      efccda:	48 89 df             	mov    rdi,rbx
      efccdd:	4c 89 f6             	mov    rsi,r14
      efcce0:	4c 89 fa             	mov    rdx,r15
      efcce3:	e8 1c 1b 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efcce8:	31 ff                	xor    edi,edi
      efccea:	e8 2d 17 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efccef:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efccf3:	66 0f ef c9          	pxor   xmm1,xmm1
      efccf7:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efccfb:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efccff:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efcd05:	e8 7c 17 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcd0a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efcd0e:	e8 73 17 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcd13:	6a 48                	push   0x48
      efcd15:	5f                   	pop    rdi
      efcd16:	e8 e5 11 8f 00       	call   17edf00 <_Znwm@plt>
      efcd1b:	48 89 c3             	mov    rbx,rax
      efcd1e:	49 89 c6             	mov    r14,rax
      efcd21:	66 0f ef c9          	pxor   xmm1,xmm1
      efcd25:	f3 0f 7f 4b 08       	movdqu XMMWORD PTR [rbx+0x8],xmm1
      efcd2a:	48 8d 05 8f da 93 00 	lea    rax,[rip+0x93da8f]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efcd31:	48 89 03             	mov    QWORD PTR [rbx],rax
      efcd34:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efcd3a:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efcd3e:	48 85 c0             	test   rax,rax
      efcd41:	74 05                	je     efcd48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc415e>
      efcd43:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efcd48:	48 83 c3 18          	add    rbx,0x18
      efcd4c:	48 8d 05 75 68 94 00 	lea    rax,[rip+0x946875]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efcd53:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efcd57:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
      efcd5d:	48 8d 05 e4 2b 94 00 	lea    rax,[rip+0x942be4]        # 183f948 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x118e0>
      efcd64:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efcd68:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
      efcd6e:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efcd75:	48 85 ff             	test   rdi,rdi
      efcd78:	74 05                	je     efcd7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4195>
      efcd7a:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efcd7f:	48 8d 05 ea 2b 94 00 	lea    rax,[rip+0x942bea]        # 183f970 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11908>
      efcd86:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efcd8a:	48 8d 05 cf 2b 94 00 	lea    rax,[rip+0x942bcf]        # 183f960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x118f8>
      efcd91:	41 bf f8 01 00 00    	mov    r15d,0x1f8
      efcd97:	4c 01 f8             	add    rax,r15
      efcd9a:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efcd9e:	e8 e3 16 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcda3:	48 8d 05 8e 29 94 00 	lea    rax,[rip+0x94298e]        # 183f738 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x116d0>
      efcdaa:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efcdae:	48 8d 05 73 29 94 00 	lea    rax,[rip+0x942973]        # 183f728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x116c0>
      efcdb5:	4c 01 f8             	add    rax,r15
      efcdb8:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efcdbc:	4c 8d bc 24 10 07 00 	lea    r15,[rsp+0x710]
      efcdc3:	00 
      efcdc4:	4c 89 ff             	mov    rdi,r15
      efcdc7:	48 89 de             	mov    rsi,rbx
      efcdca:	4c 89 f2             	mov    rdx,r14
      efcdcd:	e8 32 1a 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efcdd2:	31 ff                	xor    edi,edi
      efcdd4:	e8 43 16 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efcdd9:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
      efcdde:	66 0f ef c9          	pxor   xmm1,xmm1
      efcde2:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
      efcde7:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efcdeb:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efcdf1:	e8 90 16 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcdf6:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      efcdfa:	e8 87 16 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcdff:	bf a0 00 00 00       	mov    edi,0xa0
      efce04:	e8 f7 10 8f 00       	call   17edf00 <_Znwm@plt>
      efce09:	49 89 c6             	mov    r14,rax
      efce0c:	49 89 c7             	mov    r15,rax
      efce0f:	66 0f ef c0          	pxor   xmm0,xmm0
      efce13:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efce19:	48 8d 05 a0 d9 93 00 	lea    rax,[rip+0x93d9a0]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efce20:	49 89 06             	mov    QWORD PTR [r14],rax
      efce23:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efce28:	0f 28 80 70 03 00 00 	movaps xmm0,XMMWORD PTR [rax+0x370]
      efce2f:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efce36:	00 
      efce37:	48 8b 80 78 03 00 00 	mov    rax,QWORD PTR [rax+0x378]
      efce3e:	48 85 c0             	test   rax,rax
      efce41:	74 05                	je     efce48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc425e>
      efce43:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efce48:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efce4d:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efce54:	0f 29 84 24 e0 00 00 	movaps XMMWORD PTR [rsp+0xe0],xmm0
      efce5b:	00 
      efce5c:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efce63:	48 85 c0             	test   rax,rax
      efce66:	74 05                	je     efce6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4283>
      efce68:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efce6d:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efce73:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efce77:	48 85 c0             	test   rax,rax
      efce7a:	74 05                	je     efce81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4297>
      efce7c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efce81:	49 83 c6 18          	add    r14,0x18
      efce85:	48 8d 05 3c 67 94 00 	lea    rax,[rip+0x94673c]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efce8c:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efce90:	66 0f ef c9          	pxor   xmm1,xmm1
      efce94:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efce9a:	48 8d 05 27 01 94 00 	lea    rax,[rip+0x940127]        # 183cfc8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xef60>
      efcea1:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efcea5:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efceab:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efceb2:	48 85 ff             	test   rdi,rdi
      efceb5:	74 05                	je     efcebc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc42d2>
      efceb7:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efcebc:	48 8d 05 f5 fe 93 00 	lea    rax,[rip+0x93fef5]        # 183cdb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xed50>
      efcec3:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efcec7:	48 8d 05 d2 00 94 00 	lea    rax,[rip+0x9400d2]        # 183cfa0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xef38>
      efcece:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efced2:	e8 af 15 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efced7:	48 8d 05 c2 fc 93 00 	lea    rax,[rip+0x93fcc2]        # 183cba0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xeb38>
      efcede:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efcee2:	48 8d 05 a7 fe 93 00 	lea    rax,[rip+0x93fea7]        # 183cd90 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xed28>
      efcee9:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efceed:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
      efcef4:	00 
      efcef5:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0
      efcefa:	31 c0                	xor    eax,eax
      efcefc:	41 88 47 58          	mov    BYTE PTR [r15+0x58],al
      efcf00:	41 88 47 68          	mov    BYTE PTR [r15+0x68],al
      efcf04:	0f 28 84 24 e0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xe0]
      efcf0b:	00 
      efcf0c:	41 0f 11 47 70       	movups XMMWORD PTR [r15+0x70],xmm0
      efcf11:	41 88 87 80 00 00 00 	mov    BYTE PTR [r15+0x80],al
      efcf18:	41 88 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],al
      efcf1f:	31 ff                	xor    edi,edi
      efcf21:	e8 60 15 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcf26:	31 ff                	xor    edi,edi
      efcf28:	e8 59 15 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcf2d:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efcf34:	00 
      efcf35:	48 89 df             	mov    rdi,rbx
      efcf38:	4c 89 f6             	mov    rsi,r14
      efcf3b:	4c 89 fa             	mov    rdx,r15
      efcf3e:	e8 c1 18 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efcf43:	31 ff                	xor    edi,edi
      efcf45:	e8 d2 14 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efcf4a:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efcf4e:	66 0f ef c9          	pxor   xmm1,xmm1
      efcf52:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efcf56:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efcf5a:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efcf60:	e8 21 15 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcf65:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efcf69:	e8 18 15 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efcf6e:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efcf73:	48 8b 78 58          	mov    rdi,QWORD PTR [rax+0x58]
      efcf77:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      efcf7a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      efcf7d:	84 c0                	test   al,al
      efcf7f:	0f 84 3c 01 00 00    	je     efd0c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc44d7>
      efcf85:	4c 8b 64 24 60       	mov    r12,QWORD PTR [rsp+0x60]
      efcf8a:	41 80 bc 24 b9 01 00 	cmp    BYTE PTR [r12+0x1b9],0x0
      efcf91:	00 00 
      efcf93:	0f 84 94 02 00 00    	je     efd22d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4643>
      efcf99:	49 8b 5c 24 58       	mov    rbx,QWORD PTR [r12+0x58]
      efcf9e:	6a 60                	push   0x60
      efcfa0:	5f                   	pop    rdi
      efcfa1:	e8 5a 0f 8f 00       	call   17edf00 <_Znwm@plt>
      efcfa6:	49 89 c6             	mov    r14,rax
      efcfa9:	49 89 c7             	mov    r15,rax
      efcfac:	66 0f ef c0          	pxor   xmm0,xmm0
      efcfb0:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efcfb6:	48 8d 05 03 d8 93 00 	lea    rax,[rip+0x93d803]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efcfbd:	49 89 06             	mov    QWORD PTR [r14],rax
      efcfc0:	41 0f 28 84 24 f0 02 	movaps xmm0,XMMWORD PTR [r12+0x2f0]
      efcfc7:	00 00 
      efcfc9:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efcfd0:	00 
      efcfd1:	49 8b 84 24 f8 02 00 	mov    rax,QWORD PTR [r12+0x2f8]
      efcfd8:	00 
      efcfd9:	48 85 c0             	test   rax,rax
      efcfdc:	74 05                	je     efcfe3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc43f9>
      efcfde:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efcfe3:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efcfe9:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efcfed:	48 85 c0             	test   rax,rax
      efcff0:	74 05                	je     efcff7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc440d>
      efcff2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efcff7:	49 83 c6 18          	add    r14,0x18
      efcffb:	48 8d 05 c6 65 94 00 	lea    rax,[rip+0x9465c6]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd002:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd006:	66 0f ef c9          	pxor   xmm1,xmm1
      efd00a:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efd010:	48 8d 05 81 de 93 00 	lea    rax,[rip+0x93de81]        # 183ae98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xce30>
      efd017:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd01b:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efd021:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd028:	48 85 ff             	test   rdi,rdi
      efd02b:	74 05                	je     efd032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4448>
      efd02d:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd032:	48 8d 05 87 de 93 00 	lea    rax,[rip+0x93de87]        # 183aec0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xce58>
      efd039:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd03d:	48 8d 05 64 e0 93 00 	lea    rax,[rip+0x93e064]        # 183b0a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd040>
      efd044:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd048:	e8 39 14 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd04d:	48 8d 05 2c dc 93 00 	lea    rax,[rip+0x93dc2c]        # 183ac80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xcc18>
      efd054:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd058:	48 8d 05 11 de 93 00 	lea    rax,[rip+0x93de11]        # 183ae70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xce08>
      efd05f:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd063:	49 89 5f 48          	mov    QWORD PTR [r15+0x48],rbx
      efd067:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
      efd06e:	00 
      efd06f:	41 0f 11 47 50       	movups XMMWORD PTR [r15+0x50],xmm0
      efd074:	31 ff                	xor    edi,edi
      efd076:	e8 0b 14 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd07b:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efd082:	00 
      efd083:	48 89 df             	mov    rdi,rbx
      efd086:	4c 89 f6             	mov    rsi,r14
      efd089:	4c 89 fa             	mov    rdx,r15
      efd08c:	e8 73 17 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd091:	31 ff                	xor    edi,edi
      efd093:	e8 84 13 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd098:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efd09c:	66 0f ef c9          	pxor   xmm1,xmm1
      efd0a0:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efd0a4:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd0a8:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd0ae:	e8 d3 13 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd0b3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd0b7:	e8 ca 13 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd0bc:	e9 94 02 00 00       	jmp    efd355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc476b>
      efd0c1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd0c6:	83 b8 60 01 00 00 01 	cmp    DWORD PTR [rax+0x160],0x1
      efd0cd:	0f 85 82 02 00 00    	jne    efd355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc476b>
      efd0d3:	6a 68                	push   0x68
      efd0d5:	5f                   	pop    rdi
      efd0d6:	e8 25 0e 8f 00       	call   17edf00 <_Znwm@plt>
      efd0db:	49 89 c6             	mov    r14,rax
      efd0de:	49 89 c7             	mov    r15,rax
      efd0e1:	66 0f ef c0          	pxor   xmm0,xmm0
      efd0e5:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efd0eb:	48 8d 05 ce d6 93 00 	lea    rax,[rip+0x93d6ce]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd0f2:	49 89 06             	mov    QWORD PTR [r14],rax
      efd0f5:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd0fa:	0f 28 80 80 03 00 00 	movaps xmm0,XMMWORD PTR [rax+0x380]
      efd101:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efd108:	00 
      efd109:	48 8b 80 88 03 00 00 	mov    rax,QWORD PTR [rax+0x388]
      efd110:	48 85 c0             	test   rax,rax
      efd113:	74 05                	je     efd11a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4530>
      efd115:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd11a:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd11f:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efd126:	0f 29 84 24 e0 00 00 	movaps XMMWORD PTR [rsp+0xe0],xmm0
      efd12d:	00 
      efd12e:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efd135:	48 85 c0             	test   rax,rax
      efd138:	74 05                	je     efd13f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4555>
      efd13a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd13f:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efd145:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd149:	48 85 c0             	test   rax,rax
      efd14c:	74 05                	je     efd153 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4569>
      efd14e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd153:	49 83 c6 18          	add    r14,0x18
      efd157:	48 8d 05 6a 64 94 00 	lea    rax,[rip+0x94646a]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd15e:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd162:	66 0f ef c9          	pxor   xmm1,xmm1
      efd166:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efd16c:	48 8d 05 75 e1 93 00 	lea    rax,[rip+0x93e175]        # 183b2e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd280>
      efd173:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd177:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efd17d:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd184:	48 85 ff             	test   rdi,rdi
      efd187:	74 05                	je     efd18e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc45a4>
      efd189:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd18e:	48 8d 05 7b e1 93 00 	lea    rax,[rip+0x93e17b]        # 183b310 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd2a8>
      efd195:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd199:	48 8d 05 58 e3 93 00 	lea    rax,[rip+0x93e358]        # 183b4f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd490>
      efd1a0:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd1a4:	e8 dd 12 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd1a9:	48 8d 05 20 df 93 00 	lea    rax,[rip+0x93df20]        # 183b0d0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd068>
      efd1b0:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd1b4:	48 8d 05 05 e1 93 00 	lea    rax,[rip+0x93e105]        # 183b2c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd258>
      efd1bb:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd1bf:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
      efd1c6:	00 
      efd1c7:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0
      efd1cc:	0f 28 84 24 e0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xe0]
      efd1d3:	00 
      efd1d4:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
      efd1d9:	31 ff                	xor    edi,edi
      efd1db:	e8 a6 12 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd1e0:	31 ff                	xor    edi,edi
      efd1e2:	e8 9f 12 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd1e7:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efd1ee:	00 
      efd1ef:	48 89 df             	mov    rdi,rbx
      efd1f2:	4c 89 f6             	mov    rsi,r14
      efd1f5:	4c 89 fa             	mov    rdx,r15
      efd1f8:	e8 07 16 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd1fd:	31 ff                	xor    edi,edi
      efd1ff:	e8 18 12 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd204:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efd208:	66 0f ef c9          	pxor   xmm1,xmm1
      efd20c:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efd210:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd214:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd21a:	e8 67 12 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd21f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd223:	e8 5e 12 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd228:	e9 28 01 00 00       	jmp    efd355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc476b>
      efd22d:	49 8b 5c 24 58       	mov    rbx,QWORD PTR [r12+0x58]
      efd232:	6a 68                	push   0x68
      efd234:	5f                   	pop    rdi
      efd235:	e8 c6 0c 8f 00       	call   17edf00 <_Znwm@plt>
      efd23a:	49 89 c6             	mov    r14,rax
      efd23d:	49 89 c7             	mov    r15,rax
      efd240:	66 0f ef c0          	pxor   xmm0,xmm0
      efd244:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efd24a:	48 8d 05 6f d5 93 00 	lea    rax,[rip+0x93d56f]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd251:	49 89 06             	mov    QWORD PTR [r14],rax
      efd254:	41 0f 28 84 24 f0 02 	movaps xmm0,XMMWORD PTR [r12+0x2f0]
      efd25b:	00 00 
      efd25d:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efd264:	00 
      efd265:	49 8b 84 24 f8 02 00 	mov    rax,QWORD PTR [r12+0x2f8]
      efd26c:	00 
      efd26d:	48 85 c0             	test   rax,rax
      efd270:	74 05                	je     efd277 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc468d>
      efd272:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd277:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efd27d:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd281:	48 85 c0             	test   rax,rax
      efd284:	74 05                	je     efd28b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc46a1>
      efd286:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd28b:	49 83 c6 18          	add    r14,0x18
      efd28f:	48 8d 05 32 63 94 00 	lea    rax,[rip+0x946332]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd296:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd29a:	66 0f ef c9          	pxor   xmm1,xmm1
      efd29e:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efd2a4:	48 8d 05 9d d7 93 00 	lea    rax,[rip+0x93d79d]        # 183aa48 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc9e0>
      efd2ab:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd2af:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efd2b5:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd2bc:	48 85 ff             	test   rdi,rdi
      efd2bf:	74 05                	je     efd2c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc46dc>
      efd2c1:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd2c6:	48 8d 05 a3 d7 93 00 	lea    rax,[rip+0x93d7a3]        # 183aa70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xca08>
      efd2cd:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd2d1:	48 8d 05 80 d9 93 00 	lea    rax,[rip+0x93d980]        # 183ac58 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xcbf0>
      efd2d8:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd2dc:	e8 a5 11 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd2e1:	48 8d 05 48 d5 93 00 	lea    rax,[rip+0x93d548]        # 183a830 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc7c8>
      efd2e8:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd2ec:	48 8d 05 2d d7 93 00 	lea    rax,[rip+0x93d72d]        # 183aa20 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc9b8>
      efd2f3:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd2f7:	49 89 5f 48          	mov    QWORD PTR [r15+0x48],rbx
      efd2fb:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
      efd302:	00 
      efd303:	41 0f 11 47 50       	movups XMMWORD PTR [r15+0x50],xmm0
      efd308:	41 c6 47 60 00       	mov    BYTE PTR [r15+0x60],0x0
      efd30d:	31 ff                	xor    edi,edi
      efd30f:	e8 72 11 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd314:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efd31b:	00 
      efd31c:	48 89 df             	mov    rdi,rbx
      efd31f:	4c 89 f6             	mov    rsi,r14
      efd322:	4c 89 fa             	mov    rdx,r15
      efd325:	e8 da 14 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd32a:	31 ff                	xor    edi,edi
      efd32c:	e8 eb 10 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd331:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efd335:	66 0f ef c9          	pxor   xmm1,xmm1
      efd339:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efd33d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd341:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd347:	e8 3a 11 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd34c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd350:	e8 31 11 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd355:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
      efd35a:	48 83 bb 90 03 00 00 	cmp    QWORD PTR [rbx+0x390],0x0
      efd361:	00 
      efd362:	0f 84 21 02 00 00    	je     efd589 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc499f>
      efd368:	48 83 bb a0 03 00 00 	cmp    QWORD PTR [rbx+0x3a0],0x0
      efd36f:	00 
      efd370:	0f 84 13 02 00 00    	je     efd589 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc499f>
      efd376:	80 bb b3 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b3],0x0
      efd37d:	0f 84 06 02 00 00    	je     efd589 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc499f>
      efd383:	4c 8b 63 50          	mov    r12,QWORD PTR [rbx+0x50]
      efd387:	bf a0 00 00 00       	mov    edi,0xa0
      efd38c:	e8 6f 0b 8f 00       	call   17edf00 <_Znwm@plt>
      efd391:	49 89 c6             	mov    r14,rax
      efd394:	66 0f ef c0          	pxor   xmm0,xmm0
      efd398:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efd39d:	48 8d 05 1c d4 93 00 	lea    rax,[rip+0x93d41c]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd3a4:	49 89 06             	mov    QWORD PTR [r14],rax
      efd3a7:	0f b7 ab 74 01 00 00 	movzx  ebp,WORD PTR [rbx+0x174]
      efd3ae:	0f b6 9b 76 01 00 00 	movzx  ebx,BYTE PTR [rbx+0x176]
      efd3b5:	f3 41 0f 6f 4d 00    	movdqu xmm1,XMMWORD PTR [r13+0x0]
      efd3bb:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd3bf:	48 85 c0             	test   rax,rax
      efd3c2:	74 05                	je     efd3c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc47df>
      efd3c4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd3c9:	48 8d 05 f8 61 94 00 	lea    rax,[rip+0x9461f8]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd3d0:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd3d4:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
      efd3da:	48 8d 05 17 1c 94 00 	lea    rax,[rip+0x941c17]        # 183eff8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10f90>
      efd3e1:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd3e5:	f3 41 0f 7f 4e 38    	movdqu XMMWORD PTR [r14+0x38],xmm1
      efd3eb:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
      efd3f2:	48 85 ff             	test   rdi,rdi
      efd3f5:	74 05                	je     efd3fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4812>
      efd3f7:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd3fc:	48 8d 05 1d 1c 94 00 	lea    rax,[rip+0x941c1d]        # 183f020 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10fb8>
      efd403:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd407:	48 8d 05 fa 1d 94 00 	lea    rax,[rip+0x941dfa]        # 183f208 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x111a0>
      efd40e:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd412:	e8 6f 10 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd417:	48 8d 05 c2 19 94 00 	lea    rax,[rip+0x9419c2]        # 183ede0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10d78>
      efd41e:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd422:	48 8d 05 a7 1b 94 00 	lea    rax,[rip+0x941ba7]        # 183efd0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10f68>
      efd429:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd42d:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd432:	48 8b 81 98 03 00 00 	mov    rax,QWORD PTR [rcx+0x398]
      efd439:	0f 28 81 90 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x390]
      efd440:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
      efd445:	48 85 c0             	test   rax,rax
      efd448:	74 05                	je     efd44f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4865>
      efd44a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd44f:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd454:	48 8b 81 a8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3a8]
      efd45b:	0f 28 81 a0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3a0]
      efd462:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      efd467:	48 85 c0             	test   rax,rax
      efd46a:	74 05                	je     efd471 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4887>
      efd46c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd471:	c1 e3 10             	shl    ebx,0x10
      efd474:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd479:	48 8b 81 b8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3b8]
      efd480:	0f 28 81 b0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3b0]
      efd487:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
      efd48c:	48 85 c0             	test   rax,rax
      efd48f:	74 05                	je     efd496 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc48ac>
      efd491:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd496:	4d 8d 7e 18          	lea    r15,[r14+0x18]
      efd49a:	09 dd                	or     ebp,ebx
      efd49c:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd4a1:	48 8b 81 c8 03 00 00 	mov    rax,QWORD PTR [rcx+0x3c8]
      efd4a8:	0f 28 81 c0 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x3c0]
      efd4af:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
      efd4b4:	48 85 c0             	test   rax,rax
      efd4b7:	74 05                	je     efd4be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc48d4>
      efd4b9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd4be:	89 e8                	mov    eax,ebp
      efd4c0:	c1 e8 10             	shr    eax,0x10
      efd4c3:	89 e9                	mov    ecx,ebp
      efd4c5:	c1 e9 08             	shr    ecx,0x8
      efd4c8:	41 88 ae 88 00 00 00 	mov    BYTE PTR [r14+0x88],bpl
      efd4cf:	41 88 8e 89 00 00 00 	mov    BYTE PTR [r14+0x89],cl
      efd4d6:	41 88 86 8a 00 00 00 	mov    BYTE PTR [r14+0x8a],al
      efd4dd:	4c 89 f3             	mov    rbx,r14
      efd4e0:	48 81 c3 8c 00 00 00 	add    rbx,0x8c
      efd4e7:	40 80 e5 01          	and    bpl,0x1
      efd4eb:	41 83 a6 8c 00 00 00 	and    DWORD PTR [r14+0x8c],0x0
      efd4f2:	00 
      efd4f3:	80 e1 01             	and    cl,0x1
      efd4f6:	41 c6 86 90 00 00 00 	mov    BYTE PTR [r14+0x90],0x0
      efd4fd:	00 
      efd4fe:	41 88 ae 91 00 00 00 	mov    BYTE PTR [r14+0x91],bpl
      efd505:	41 88 8e 92 00 00 00 	mov    BYTE PTR [r14+0x92],cl
      efd50c:	48 89 df             	mov    rdi,rbx
      efd50f:	31 f6                	xor    esi,esi
      efd511:	e8 92 02 0b 00       	call   fad7a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174bbe>
      efd516:	4d 89 a6 98 00 00 00 	mov    QWORD PTR [r14+0x98],r12
      efd51d:	49 8b 7e 58          	mov    rdi,QWORD PTR [r14+0x58]
      efd521:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      efd524:	ff 50 10             	call   QWORD PTR [rax+0x10]
      efd527:	66 3d 01 01          	cmp    ax,0x101
      efd52b:	b9 00 01 00 00       	mov    ecx,0x100
      efd530:	0f 43 c8             	cmovae ecx,eax
      efd533:	31 f6                	xor    esi,esi
      efd535:	84 c9                	test   cl,cl
      efd537:	40 0f 95 c6          	setne  sil
      efd53b:	48 89 df             	mov    rdi,rbx
      efd53e:	e8 d3 53 0a 00       	call   fa2916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x169d2c>
      efd543:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efd54a:	00 
      efd54b:	48 89 df             	mov    rdi,rbx
      efd54e:	4c 89 fe             	mov    rsi,r15
      efd551:	4c 89 f2             	mov    rdx,r14
      efd554:	e8 ab 12 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd559:	31 ff                	xor    edi,edi
      efd55b:	e8 bc 0e ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd560:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efd564:	66 0f ef c9          	pxor   xmm1,xmm1
      efd568:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efd56c:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd570:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd576:	e8 0b 0f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd57b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd57f:	e8 02 0f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd584:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
      efd589:	80 bb d3 01 00 00 00 	cmp    BYTE PTR [rbx+0x1d3],0x0
      efd590:	0f 84 36 01 00 00    	je     efd6cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4ae2>
      efd596:	bf 10 01 00 00       	mov    edi,0x110
      efd59b:	e8 60 09 8f 00       	call   17edf00 <_Znwm@plt>
      efd5a0:	49 89 c6             	mov    r14,rax
      efd5a3:	66 0f ef c9          	pxor   xmm1,xmm1
      efd5a7:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
      efd5ac:	48 8d 05 0d d2 93 00 	lea    rax,[rip+0x93d20d]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd5b3:	49 89 06             	mov    QWORD PTR [r14],rax
      efd5b6:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efd5bc:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd5c0:	48 85 c0             	test   rax,rax
      efd5c3:	74 05                	je     efd5ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc49e0>
      efd5c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd5ca:	49 8d 5e 18          	lea    rbx,[r14+0x18]
      efd5ce:	48 8d 05 f3 5f 94 00 	lea    rax,[rip+0x945ff3]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd5d5:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd5d9:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
      efd5df:	48 8d 05 1a 2c 94 00 	lea    rax,[rip+0x942c1a]        # 1840200 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12198>
      efd5e6:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd5ea:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
      efd5f0:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd5f7:	48 85 ff             	test   rdi,rdi
      efd5fa:	74 05                	je     efd601 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4a17>
      efd5fc:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd601:	48 8d 05 20 2c 94 00 	lea    rax,[rip+0x942c20]        # 1840228 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x121c0>
      efd608:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd60c:	48 8d 05 05 2c 94 00 	lea    rax,[rip+0x942c05]        # 1840218 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x121b0>
      efd613:	41 bf f8 01 00 00    	mov    r15d,0x1f8
      efd619:	4c 01 f8             	add    rax,r15
      efd61c:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd620:	e8 61 0e ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd625:	48 8d 05 c4 29 94 00 	lea    rax,[rip+0x9429c4]        # 183fff0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11f88>
      efd62c:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd630:	48 8d 05 a9 29 94 00 	lea    rax,[rip+0x9429a9]        # 183ffe0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11f78>
      efd637:	4c 01 f8             	add    rax,r15
      efd63a:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd63e:	49 8d 7e 48          	lea    rdi,[r14+0x48]
      efd642:	4d 89 f7             	mov    r15,r14
      efd645:	49 81 c7 e0 00 00 00 	add    r15,0xe0
      efd64c:	66 0f ef c0          	pxor   xmm0,xmm0
      efd650:	f3 41 0f 7f 86 e0 00 	movdqu XMMWORD PTR [r14+0xe0],xmm0
      efd657:	00 00 
      efd659:	ba 90 00 00 00       	mov    edx,0x90
      efd65e:	31 f6                	xor    esi,esi
      efd660:	e8 2b 15 8f 00       	call   17eeb90 <memset@plt>
      efd665:	4d 89 be d8 00 00 00 	mov    QWORD PTR [r14+0xd8],r15
      efd66c:	49 83 a6 00 01 00 00 	and    QWORD PTR [r14+0x100],0x0
      efd673:	00 
      efd674:	66 0f ef c0          	pxor   xmm0,xmm0
      efd678:	f3 41 0f 7f 86 f0 00 	movdqu XMMWORD PTR [r14+0xf0],xmm0
      efd67f:	00 00 
      efd681:	41 83 a6 09 01 00 00 	and    DWORD PTR [r14+0x109],0x0
      efd688:	00 
      efd689:	4c 8d bc 24 10 07 00 	lea    r15,[rsp+0x710]
      efd690:	00 
      efd691:	4c 89 ff             	mov    rdi,r15
      efd694:	48 89 de             	mov    rsi,rbx
      efd697:	4c 89 f2             	mov    rdx,r14
      efd69a:	e8 65 11 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd69f:	31 ff                	xor    edi,edi
      efd6a1:	e8 76 0d ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd6a6:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
      efd6ab:	66 0f ef c9          	pxor   xmm1,xmm1
      efd6af:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
      efd6b4:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd6b8:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd6be:	e8 c3 0d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd6c3:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      efd6c7:	e8 ba 0d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd6cc:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd6d1:	80 b8 b4 01 00 00 00 	cmp    BYTE PTR [rax+0x1b4],0x0
      efd6d8:	0f 84 1e 01 00 00    	je     efd7fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4c12>
      efd6de:	48 83 b8 90 03 00 00 	cmp    QWORD PTR [rax+0x390],0x0
      efd6e5:	00 
      efd6e6:	0f 84 10 01 00 00    	je     efd7fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4c12>
      efd6ec:	6a 68                	push   0x68
      efd6ee:	5f                   	pop    rdi
      efd6ef:	e8 0c 08 8f 00       	call   17edf00 <_Znwm@plt>
      efd6f4:	49 89 c6             	mov    r14,rax
      efd6f7:	49 89 c7             	mov    r15,rax
      efd6fa:	66 0f ef c9          	pxor   xmm1,xmm1
      efd6fe:	f3 41 0f 7f 4e 08    	movdqu XMMWORD PTR [r14+0x8],xmm1
      efd704:	48 8d 05 b5 d0 93 00 	lea    rax,[rip+0x93d0b5]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd70b:	49 89 06             	mov    QWORD PTR [r14],rax
      efd70e:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efd714:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd718:	48 85 c0             	test   rax,rax
      efd71b:	74 05                	je     efd722 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4b38>
      efd71d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd722:	48 8d 05 9f 5e 94 00 	lea    rax,[rip+0x945e9f]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd729:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd72d:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efd733:	48 8d 05 8e 1d 94 00 	lea    rax,[rip+0x941d8e]        # 183f4c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11460>
      efd73a:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd73e:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efd744:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd74b:	48 85 ff             	test   rdi,rdi
      efd74e:	74 05                	je     efd755 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4b6b>
      efd750:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd755:	49 83 c6 18          	add    r14,0x18
      efd759:	48 8d 05 90 1d 94 00 	lea    rax,[rip+0x941d90]        # 183f4f0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11488>
      efd760:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd764:	48 8d 05 6d 1f 94 00 	lea    rax,[rip+0x941f6d]        # 183f6d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11670>
      efd76b:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd76f:	e8 12 0d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd774:	48 8d 05 35 1b 94 00 	lea    rax,[rip+0x941b35]        # 183f2b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11248>
      efd77b:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd77f:	48 8d 05 1a 1d 94 00 	lea    rax,[rip+0x941d1a]        # 183f4a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11438>
      efd786:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd78a:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      efd78f:	48 8b 81 98 03 00 00 	mov    rax,QWORD PTR [rcx+0x398]
      efd796:	0f 28 81 90 03 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x390]
      efd79d:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0
      efd7a2:	48 85 c0             	test   rax,rax
      efd7a5:	74 05                	je     efd7ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4bc2>
      efd7a7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd7ac:	31 c0                	xor    eax,eax
      efd7ae:	41 88 47 58          	mov    BYTE PTR [r15+0x58],al
      efd7b2:	41 88 47 60          	mov    BYTE PTR [r15+0x60],al
      efd7b6:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efd7bd:	00 
      efd7be:	48 89 df             	mov    rdi,rbx
      efd7c1:	4c 89 f6             	mov    rsi,r14
      efd7c4:	4c 89 fa             	mov    rdx,r15
      efd7c7:	e8 38 10 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd7cc:	31 ff                	xor    edi,edi
      efd7ce:	e8 49 0c ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd7d3:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efd7d7:	66 0f ef c9          	pxor   xmm1,xmm1
      efd7db:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efd7df:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd7e3:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd7e9:	e8 98 0c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd7ee:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd7f2:	e8 8f 0c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd7f7:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd7fc:	80 b8 f2 01 00 00 00 	cmp    BYTE PTR [rax+0x1f2],0x0
      efd803:	0f 84 4e 01 00 00    	je     efd957 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4d6d>
      efd809:	6a 78                	push   0x78
      efd80b:	5f                   	pop    rdi
      efd80c:	e8 ef 06 8f 00       	call   17edf00 <_Znwm@plt>
      efd811:	49 89 c6             	mov    r14,rax
      efd814:	49 89 c7             	mov    r15,rax
      efd817:	66 0f ef c0          	pxor   xmm0,xmm0
      efd81b:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efd821:	48 8d 05 98 cf 93 00 	lea    rax,[rip+0x93cf98]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd828:	49 89 06             	mov    QWORD PTR [r14],rax
      efd82b:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efd830:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
      efd837:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efd83e:	00 
      efd83f:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
      efd846:	48 85 c0             	test   rax,rax
      efd849:	74 05                	je     efd850 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4c66>
      efd84b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd850:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efd856:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd85a:	48 85 c0             	test   rax,rax
      efd85d:	74 05                	je     efd864 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4c7a>
      efd85f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd864:	48 8d 05 5d 5d 94 00 	lea    rax,[rip+0x945d5d]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd86b:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd86f:	66 0f ef c9          	pxor   xmm1,xmm1
      efd873:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efd879:	48 8d 05 a0 5a 94 00 	lea    rax,[rip+0x945aa0]        # 1843320 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x152b8>
      efd880:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd884:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efd88a:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd891:	48 85 ff             	test   rdi,rdi
      efd894:	74 05                	je     efd89b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4cb1>
      efd896:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd89b:	49 83 c6 18          	add    r14,0x18
      efd89f:	48 8d 05 a2 5a 94 00 	lea    rax,[rip+0x945aa2]        # 1843348 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x152e0>
      efd8a6:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd8aa:	48 8d 05 7f 5c 94 00 	lea    rax,[rip+0x945c7f]        # 1843530 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x154c8>
      efd8b1:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd8b5:	e8 cc 0b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd8ba:	48 8d 05 47 58 94 00 	lea    rax,[rip+0x945847]        # 1843108 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x150a0>
      efd8c1:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efd8c5:	48 8d 05 2c 5a 94 00 	lea    rax,[rip+0x945a2c]        # 18432f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15290>
      efd8cc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efd8d0:	48 8d 05 81 5c 94 00 	lea    rax,[rip+0x945c81]        # 1843558 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x154f0>
      efd8d7:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
      efd8db:	31 c0                	xor    eax,eax
      efd8dd:	41 88 47 50          	mov    BYTE PTR [r15+0x50],al
      efd8e1:	41 88 47 54          	mov    BYTE PTR [r15+0x54],al
      efd8e5:	41 88 47 58          	mov    BYTE PTR [r15+0x58],al
      efd8e9:	41 88 47 5c          	mov    BYTE PTR [r15+0x5c],al
      efd8ed:	41 88 47 60          	mov    BYTE PTR [r15+0x60],al
      efd8f1:	66 0f 6f 84 24 90 00 	movdqa xmm0,XMMWORD PTR [rsp+0x90]
      efd8f8:	00 00 
      efd8fa:	f3 41 0f 7f 47 68    	movdqu XMMWORD PTR [r15+0x68],xmm0
      efd900:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd907:	48 85 ff             	test   rdi,rdi
      efd90a:	74 05                	je     efd911 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4d27>
      efd90c:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd911:	e8 70 0b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd916:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efd91d:	00 
      efd91e:	48 89 df             	mov    rdi,rbx
      efd921:	4c 89 f6             	mov    rsi,r14
      efd924:	4c 89 fa             	mov    rdx,r15
      efd927:	e8 d8 0e 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efd92c:	31 ff                	xor    edi,edi
      efd92e:	e8 e9 0a ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efd933:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efd937:	66 0f ef c9          	pxor   xmm1,xmm1
      efd93b:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efd93f:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efd943:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efd949:	e8 38 0b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd94e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efd952:	e8 2f 0b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd957:	6a 48                	push   0x48
      efd959:	5f                   	pop    rdi
      efd95a:	e8 a1 05 8f 00       	call   17edf00 <_Znwm@plt>
      efd95f:	48 89 c3             	mov    rbx,rax
      efd962:	49 89 c6             	mov    r14,rax
      efd965:	66 0f ef c9          	pxor   xmm1,xmm1
      efd969:	f3 0f 7f 4b 08       	movdqu XMMWORD PTR [rbx+0x8],xmm1
      efd96e:	48 8d 05 4b ce 93 00 	lea    rax,[rip+0x93ce4b]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efd975:	48 89 03             	mov    QWORD PTR [rbx],rax
      efd978:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efd97e:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efd982:	48 85 c0             	test   rax,rax
      efd985:	74 05                	je     efd98c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4da2>
      efd987:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efd98c:	48 83 c3 18          	add    rbx,0x18
      efd990:	48 8d 05 31 5c 94 00 	lea    rax,[rip+0x945c31]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efd997:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd99b:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
      efd9a1:	48 8d 05 50 ef 93 00 	lea    rax,[rip+0x93ef50]        # 183c8f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xe890>
      efd9a8:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd9ac:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
      efd9b2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efd9b9:	48 85 ff             	test   rdi,rdi
      efd9bc:	74 05                	je     efd9c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4dd9>
      efd9be:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efd9c3:	48 8d 05 56 ef 93 00 	lea    rax,[rip+0x93ef56]        # 183c920 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xe8b8>
      efd9ca:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd9ce:	48 8d 05 33 f1 93 00 	lea    rax,[rip+0x93f133]        # 183cb08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xeaa0>
      efd9d5:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd9d9:	e8 a8 0a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efd9de:	48 8d 05 fb ec 93 00 	lea    rax,[rip+0x93ecfb]        # 183c6e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xe678>
      efd9e5:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efd9e9:	48 8d 05 e0 ee 93 00 	lea    rax,[rip+0x93eee0]        # 183c8d0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xe868>
      efd9f0:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efd9f4:	4c 8d bc 24 10 07 00 	lea    r15,[rsp+0x710]
      efd9fb:	00 
      efd9fc:	4c 89 ff             	mov    rdi,r15
      efd9ff:	48 89 de             	mov    rsi,rbx
      efda02:	4c 89 f2             	mov    rdx,r14
      efda05:	e8 fa 0d 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efda0a:	31 ff                	xor    edi,edi
      efda0c:	e8 0b 0a ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efda11:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
      efda16:	66 0f ef c9          	pxor   xmm1,xmm1
      efda1a:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
      efda1f:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efda23:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efda29:	e8 58 0a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efda2e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      efda32:	e8 4f 0a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efda37:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      efda3e:	00 
      efda3f:	e8 42 0a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efda44:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
      efda4b:	00 
      efda4c:	e8 35 0a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efda51:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efda58:	00 
      efda59:	e8 ce 40 7d 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
      efda5e:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      efda65:	00 
      efda66:	e8 ff c4 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efda6b:	48 8b bc 24 98 01 00 	mov    rdi,QWORD PTR [rsp+0x198]
      efda72:	00 
      efda73:	e8 0e 0a ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efda78:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      efda7f:	00 
      efda80:	e8 db 92 db ff       	call   cb6d60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203d00>
      efda85:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      efda8c:	00 
      efda8d:	e8 a0 0f 00 00       	call   efea32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5e48>
      efda92:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
      efda99:	00 
      efda9a:	e8 e7 09 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efda9f:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
      efdaa6:	00 
      efdaa7:	e8 da 09 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdaac:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
      efdab3:	00 
      efdab4:	e8 cd 09 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdab9:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      efdac0:	00 
      efdac1:	e8 c0 09 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdac6:	48 8d bc 24 b0 06 00 	lea    rdi,[rsp+0x6b0]
      efdacd:	00 
      efdace:	e8 97 c4 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efdad3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      efdada:	00 00 
      efdadc:	48 3b 84 24 f0 0a 00 	cmp    rax,QWORD PTR [rsp+0xaf0]
      efdae3:	00 
      efdae4:	0f 85 e0 03 00 00    	jne    efdeca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc52e0>
      efdaea:	4c 89 e8             	mov    rax,r13
      efdaed:	48 81 c4 f8 0a 00 00 	add    rsp,0xaf8
      efdaf4:	5b                   	pop    rbx
      efdaf5:	41 5c                	pop    r12
      efdaf7:	41 5d                	pop    r13
      efdaf9:	41 5e                	pop    r14
      efdafb:	41 5f                	pop    r15
      efdafd:	5d                   	pop    rbp
      efdafe:	c3                   	ret
      efdaff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      efdb06:	00 00 
      efdb08:	48 3b 84 24 f0 0a 00 	cmp    rax,QWORD PTR [rsp+0xaf0]
      efdb0f:	00 
      efdb10:	0f 85 b4 03 00 00    	jne    efdeca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc52e0>
      efdb16:	e8 a5 6a b0 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      efdb1b:	e9 e1 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb20:	e9 dc 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb25:	e9 d7 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb2a:	e9 d2 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb2f:	e9 cd 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb34:	49 89 c4             	mov    r12,rax
      efdb37:	4c 89 f7             	mov    rdi,r14
      efdb3a:	e8 47 09 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdb3f:	e9 c0 02 00 00       	jmp    efde04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc521a>
      efdb44:	e9 b8 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb49:	e9 b3 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb4e:	e9 ae 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb53:	e9 a9 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb58:	4c 89 e3             	mov    rbx,r12
      efdb5b:	49 89 c4             	mov    r12,rax
      efdb5e:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efdb65:	00 
      efdb66:	e8 ff c3 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efdb6b:	e9 00 02 00 00       	jmp    efdd70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5186>
      efdb70:	e9 8c 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb75:	e9 87 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb7a:	e9 6e 02 00 00       	jmp    efdded <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5203>
      efdb7f:	49 89 c4             	mov    r12,rax
      efdb82:	4c 89 f7             	mov    rdi,r14
      efdb85:	e8 fc 08 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdb8a:	e9 75 02 00 00       	jmp    efde04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc521a>
      efdb8f:	e9 6d 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb94:	e9 68 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdb99:	e9 4f 02 00 00       	jmp    efdded <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5203>
      efdb9e:	e9 5e 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdba3:	e9 59 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdba8:	e9 54 02 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdbad:	49 89 c4             	mov    r12,rax
      efdbb0:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
      efdbb7:	00 
      efdbb8:	e8 d3 02 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efdbbd:	eb 03                	jmp    efdbc2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4fd8>
      efdbbf:	49 89 c4             	mov    r12,rax
      efdbc2:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efdbc9:	00 
      efdbca:	e8 c1 02 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efdbcf:	eb 03                	jmp    efdbd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4fea>
      efdbd1:	49 89 c4             	mov    r12,rax
      efdbd4:	49 8d 45 28          	lea    rax,[r13+0x28]
      efdbd8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      efdbdd:	49 8d 85 b8 00 00 00 	lea    rax,[r13+0xb8]
      efdbe4:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      efdbeb:	00 
      efdbec:	49 8d 85 e0 00 00 00 	lea    rax,[r13+0xe0]
      efdbf3:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      efdbfa:	00 
      efdbfb:	49 8d 85 00 01 00 00 	lea    rax,[r13+0x100]
      efdc02:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      efdc09:	00 
      efdc0a:	4d 8d b5 28 01 00 00 	lea    r14,[r13+0x128]
      efdc11:	49 8d ad 20 02 00 00 	lea    rbp,[r13+0x220]
      efdc18:	49 8d 9d 18 03 00 00 	lea    rbx,[r13+0x318]
      efdc1f:	4c 89 ef             	mov    rdi,r13
      efdc22:	48 81 c7 10 04 00 00 	add    rdi,0x410
      efdc29:	e8 70 8c 08 00       	call   f8689e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14dcb4>
      efdc2e:	48 89 df             	mov    rdi,rbx
      efdc31:	e8 4a 77 00 00       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      efdc36:	48 89 ef             	mov    rdi,rbp
      efdc39:	e8 42 77 00 00       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      efdc3e:	4c 89 f7             	mov    rdi,r14
      efdc41:	e8 3a 77 00 00       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      efdc46:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      efdc4d:	00 
      efdc4e:	e8 dd 90 ba ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      efdc53:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
      efdc5a:	00 
      efdc5b:	e8 d0 90 ba ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      efdc60:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      efdc67:	00 
      efdc68:	e8 c3 90 ba ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      efdc6d:	49 8b bd a0 00 00 00 	mov    rdi,QWORD PTR [r13+0xa0]
      efdc74:	e8 0d 08 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdc79:	49 8b bd 90 00 00 00 	mov    rdi,QWORD PTR [r13+0x90]
      efdc80:	e8 01 08 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdc85:	49 8b 7d 78          	mov    rdi,QWORD PTR [r13+0x78]
      efdc89:	e8 f8 07 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdc8e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      efdc93:	e8 12 8c 08 00       	call   f868aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14dcc0>
      efdc98:	31 c0                	xor    eax,eax
      efdc9a:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      efdca1:	00 
      efdca2:	31 ff                	xor    edi,edi
      efdca4:	e8 dd 07 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdca9:	eb 13                	jmp    efdcbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc50d4>
      efdcab:	49 89 c4             	mov    r12,rax
      efdcae:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
      efdcb5:	00 00 
      efdcb7:	66 49 0f 3a 16 c7 01 	pextrq r15,xmm0,0x1
      efdcbe:	4c 89 ff             	mov    rdi,r15
      efdcc1:	e8 c0 07 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdcc6:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efdccd:	00 
      efdcce:	e8 97 c2 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efdcd3:	eb 03                	jmp    efdcd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc50ee>
      efdcd5:	49 89 c4             	mov    r12,rax
      efdcd8:	4c 89 ef             	mov    rdi,r13
      efdcdb:	e8 30 03 8f 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efdce0:	4c 89 ef             	mov    rdi,r13
      efdce3:	e8 34 07 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efdce8:	48 83 bc 24 80 00 00 	cmp    QWORD PTR [rsp+0x80],0x0
      efdcef:	00 00 
      efdcf1:	75 08                	jne    efdcfb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5111>
      efdcf3:	e9 0c 01 00 00       	jmp    efde04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc521a>
      efdcf8:	49 89 c4             	mov    r12,rax
      efdcfb:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      efdd02:	00 
      efdd03:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      efdd06:	ff 50 08             	call   QWORD PTR [rax+0x8]
      efdd09:	e9 f6 00 00 00       	jmp    efde04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc521a>
      efdd0e:	e9 da 00 00 00       	jmp    efdded <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5203>
      efdd13:	e9 e9 00 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdd18:	e9 e4 00 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdd1d:	49 89 c4             	mov    r12,rax
      efdd20:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efdd27:	00 
      efdd28:	e8 63 01 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efdd2d:	eb 03                	jmp    efdd32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5148>
      efdd2f:	49 89 c4             	mov    r12,rax
      efdd32:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efdd39:	00 
      efdd3a:	e8 51 01 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efdd3f:	eb 03                	jmp    efdd44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc515a>
      efdd41:	49 89 c4             	mov    r12,rax
      efdd44:	4c 89 f7             	mov    rdi,r14
      efdd47:	48 83 c7 20          	add    rdi,0x20
      efdd4b:	e8 8c 2e 0c 00       	call   fc0bdc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187ff2>
      efdd50:	4c 89 f7             	mov    rdi,r14
      efdd53:	e8 b8 02 8f 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efdd58:	4c 89 f7             	mov    rdi,r14
      efdd5b:	e8 bc 06 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efdd60:	e9 9f 00 00 00       	jmp    efde04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc521a>
      efdd65:	e9 97 00 00 00       	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdd6a:	4c 89 e3             	mov    rbx,r12
      efdd6d:	49 89 c4             	mov    r12,rax
      efdd70:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
      efdd77:	00 
      efdd78:	e8 93 4d bf ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      efdd7d:	48 89 df             	mov    rdi,rbx
      efdd80:	e8 01 07 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdd85:	e9 bb 00 00 00       	jmp    efde45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc525b>
      efdd8a:	eb 75                	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdd8c:	eb 73                	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdd8e:	eb 71                	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdd90:	eb 6f                	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdd92:	eb 59                	jmp    efdded <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5203>
      efdd94:	eb 6b                	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdd96:	49 89 c4             	mov    r12,rax
      efdd99:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efdda0:	00 
      efdda1:	e8 ea 00 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efdda6:	eb 03                	jmp    efddab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc51c1>
      efdda8:	49 89 c4             	mov    r12,rax
      efddab:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efddb2:	00 
      efddb3:	e8 d8 00 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efddb8:	eb 03                	jmp    efddbd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc51d3>
      efddba:	49 89 c4             	mov    r12,rax
      efddbd:	4c 89 f3             	mov    rbx,r14
      efddc0:	48 83 c3 20          	add    rbx,0x20
      efddc4:	49 8b 7e 50          	mov    rdi,QWORD PTR [r14+0x50]
      efddc8:	e8 b9 06 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efddcd:	48 89 df             	mov    rdi,rbx
      efddd0:	e8 a1 bf 09 00       	call   f99d76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16118c>
      efddd5:	4c 89 f7             	mov    rdi,r14
      efddd8:	e8 33 02 8f 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efdddd:	4c 89 f7             	mov    rdi,r14
      efdde0:	e8 37 06 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efdde5:	eb 1d                	jmp    efde04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc521a>
      efdde7:	eb 18                	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdde9:	eb 02                	jmp    efdded <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5203>
      efddeb:	eb 14                	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efdded:	49 89 c4             	mov    r12,rax
      efddf0:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efddf7:	00 
      efddf8:	e8 93 00 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efddfd:	eb 05                	jmp    efde04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc521a>
      efddff:	eb 00                	jmp    efde01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5217>
      efde01:	49 89 c4             	mov    r12,rax
      efde04:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      efde0b:	00 
      efde0c:	e8 75 06 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efde11:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
      efde18:	00 
      efde19:	e8 68 06 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efde1e:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efde25:	00 
      efde26:	e8 01 3d 7d 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
      efde2b:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      efde32:	00 
      efde33:	e8 32 c1 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efde38:	48 8b bc 24 98 01 00 	mov    rdi,QWORD PTR [rsp+0x198]
      efde3f:	00 
      efde40:	e8 41 06 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efde45:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      efde4c:	00 
      efde4d:	e8 0e 8f db ff       	call   cb6d60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203d00>
      efde52:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      efde59:	00 
      efde5a:	e8 d3 0b 00 00       	call   efea32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5e48>
      efde5f:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
      efde66:	00 
      efde67:	e8 1a 06 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efde6c:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
      efde72:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efde79:	e8 08 06 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efde7e:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
      efde85:	00 
      efde86:	e8 fb 05 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efde8b:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      efde92:	00 
      efde93:	e8 ee 05 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efde98:	48 8d bc 24 b0 06 00 	lea    rdi,[rsp+0x6b0]
      efde9f:	00 
      efdea0:	e8 c5 c0 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efdea5:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      efdeaa:	e8 01 0c 00 00       	call   efeab0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5ec6>
      efdeaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      efdeb6:	00 00 
      efdeb8:	48 3b 84 24 f0 0a 00 	cmp    rax,QWORD PTR [rsp+0xaf0]
      efdebf:	00 
      efdec0:	75 08                	jne    efdeca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc52e0>
      efdec2:	4c 89 e7             	mov    rdi,r12
      efdec5:	e8 06 1e b7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      efdeca:	e8 e1 1b 8f 00       	call   17efab0 <__stack_chk_fail@plt>
      efdecf:	49 89 c4             	mov    r12,rax
      efded2:	49 8b 7d 68          	mov    rdi,QWORD PTR [r13+0x68]
      efded6:	e8 ab 05 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdedb:	48 89 df             	mov    rdi,rbx
      efdede:	e8 87 c0 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efdee3:	eb 03                	jmp    efdee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc52fe>
      efdee5:	49 89 c4             	mov    r12,rax
      efdee8:	48 8b 9c 24 a0 00 00 	mov    rbx,QWORD PTR [rsp+0xa0]
      efdeef:	00 
      efdef0:	48 89 df             	mov    rdi,rbx
      efdef3:	e8 18 01 8f 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efdef8:	48 89 df             	mov    rdi,rbx
      efdefb:	e8 1c 05 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efdf00:	eb 03                	jmp    efdf05 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc531b>
      efdf02:	49 89 c4             	mov    r12,rax
      efdf05:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
      efdf0c:	00 00 
      efdf0e:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efdf15:	e8 6c 05 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdf1a:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
      efdf21:	00 00 
      efdf23:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efdf2a:	e8 57 05 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdf2f:	e9 dd fe ff ff       	jmp    efde11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5227>
      efdf34:	49 89 c4             	mov    r12,rax
      efdf37:	e9 e2 fe ff ff       	jmp    efde1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5234>
      efdf3c:	eb 02                	jmp    efdf40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5356>
      efdf3e:	eb 00                	jmp    efdf40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5356>
      efdf40:	49 89 c4             	mov    r12,rax
      efdf43:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efdf4a:	00 
      efdf4b:	e8 40 ff 8e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efdf50:	e9 c9 fe ff ff       	jmp    efde1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5234>
      efdf55:	49 89 c4             	mov    r12,rax
      efdf58:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efdf5f:	00 
      efdf60:	e8 05 c0 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efdf65:	eb 03                	jmp    efdf6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5380>
      efdf67:	49 89 c4             	mov    r12,rax
      efdf6a:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efdf71:	00 
      efdf72:	e8 f3 bf b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efdf77:	eb 03                	jmp    efdf7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5392>
      efdf79:	49 89 c4             	mov    r12,rax
      efdf7c:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
      efdf83:	00 00 
      efdf85:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efdf8c:	e8 f5 04 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdf91:	4c 89 f7             	mov    rdi,r14
      efdf94:	e8 77 00 8f 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efdf99:	4c 89 f7             	mov    rdi,r14
      efdf9c:	e8 7b 04 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efdfa1:	e9 85 fe ff ff       	jmp    efde2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5241>
      efdfa6:	49 89 c4             	mov    r12,rax
      efdfa9:	e9 7d fe ff ff       	jmp    efde2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5241>
      efdfae:	49 89 c4             	mov    r12,rax
      efdfb1:	e9 82 fe ff ff       	jmp    efde38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc524e>
      efdfb6:	49 89 c4             	mov    r12,rax
      efdfb9:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efdfc0:	00 
      efdfc1:	e8 a4 bf b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efdfc6:	eb 03                	jmp    efdfcb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc53e1>
      efdfc8:	49 89 c4             	mov    r12,rax
      efdfcb:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      efdfd2:	00 
      efdfd3:	e8 92 bf b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efdfd8:	eb 03                	jmp    efdfdd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc53f3>
      efdfda:	49 89 c4             	mov    r12,rax
      efdfdd:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efdfe4:	00 
      efdfe5:	e8 80 bf b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efdfea:	eb 03                	jmp    efdfef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5405>
      efdfec:	49 89 c4             	mov    r12,rax
      efdfef:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
      efdff6:	00 
      efdff7:	e8 8a 04 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efdffc:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efe003:	00 
      efe004:	e8 61 bf b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe009:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      efe010:	00 
      efe011:	e8 70 04 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe016:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      efe01d:	00 00 
      efe01f:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efe026:	e8 5b 04 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe02b:	4c 89 f7             	mov    rdi,r14
      efe02e:	e8 dd ff 8e 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efe033:	4c 89 f7             	mov    rdi,r14
      efe036:	e8 e1 03 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efe03b:	eb 03                	jmp    efe040 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5456>
      efe03d:	49 89 c4             	mov    r12,rax
      efe040:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
      efe047:	00 
      efe048:	e8 43 fe 8e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efe04d:	48 8b bc 24 78 01 00 	mov    rdi,QWORD PTR [rsp+0x178]
      efe054:	00 
      efe055:	e8 2c 04 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe05a:	e9 e6 fd ff ff       	jmp    efde45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc525b>
      efe05f:	49 89 c4             	mov    r12,rax
      efe062:	eb e9                	jmp    efe04d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5463>
      efe064:	eb 23                	jmp    efe089 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc549f>
      efe066:	eb 0a                	jmp    efe072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5488>
      efe068:	eb 1f                	jmp    efe089 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc549f>
      efe06a:	eb 06                	jmp    efe072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5488>
      efe06c:	eb 1b                	jmp    efe089 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc549f>
      efe06e:	eb 02                	jmp    efe072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5488>
      efe070:	eb 17                	jmp    efe089 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc549f>
      efe072:	49 89 c4             	mov    r12,rax
      efe075:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efe07c:	00 
      efe07d:	e8 0e fe 8e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efe082:	e9 be fd ff ff       	jmp    efde45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc525b>
      efe087:	eb 00                	jmp    efe089 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc549f>
      efe089:	49 89 c4             	mov    r12,rax
      efe08c:	e9 b4 fd ff ff       	jmp    efde45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc525b>
      efe091:	49 89 c4             	mov    r12,rax
      efe094:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      efe09b:	00 
      efe09c:	e8 ef fd 8e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efe0a1:	eb 03                	jmp    efe0a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc54bc>
      efe0a3:	49 89 c4             	mov    r12,rax
      efe0a6:	49 8d 5f 28          	lea    rbx,[r15+0x28]
      efe0aa:	4d 8d b7 88 00 00 00 	lea    r14,[r15+0x88]
      efe0b1:	49 8d bf a8 01 00 00 	lea    rdi,[r15+0x1a8]
      efe0b8:	4c 89 fd             	mov    rbp,r15
      efe0bb:	48 81 c5 b0 00 00 00 	add    rbp,0xb0
      efe0c2:	e8 97 61 0c 00       	call   fc425e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18b674>
      efe0c7:	48 89 ef             	mov    rdi,rbp
      efe0ca:	e8 b1 72 00 00       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      efe0cf:	49 8b bf a8 00 00 00 	mov    rdi,QWORD PTR [r15+0xa8]
      efe0d6:	e8 ab 03 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe0db:	4c 89 f7             	mov    rdi,r14
      efe0de:	e8 89 61 0c 00       	call   fc426c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18b682>
      efe0e3:	49 8b bf 80 00 00 00 	mov    rdi,QWORD PTR [r15+0x80]
      efe0ea:	e8 97 03 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe0ef:	49 8b 7f 70          	mov    rdi,QWORD PTR [r15+0x70]
      efe0f3:	e8 8e 03 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe0f8:	49 8b 7f 60          	mov    rdi,QWORD PTR [r15+0x60]
      efe0fc:	e8 85 03 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe101:	48 89 df             	mov    rdi,rbx
      efe104:	e8 9f 61 0c 00       	call   fc42a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18b6be>
      efe109:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efe110:	00 
      efe111:	e8 7a fd 8e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efe116:	eb 03                	jmp    efe11b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5531>
      efe118:	49 89 c4             	mov    r12,rax
      efe11b:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efe122:	00 
      efe123:	e8 42 be b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe128:	eb 03                	jmp    efe12d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5543>
      efe12a:	49 89 c4             	mov    r12,rax
      efe12d:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efe134:	00 
      efe135:	e8 30 be b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe13a:	eb 03                	jmp    efe13f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5555>
      efe13c:	49 89 c4             	mov    r12,rax
      efe13f:	4c 89 ef             	mov    rdi,r13
      efe142:	e8 3f 03 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe147:	31 ed                	xor    ebp,ebp
      efe149:	4c 89 ff             	mov    rdi,r15
      efe14c:	e8 bf fe 8e 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efe151:	4c 89 ff             	mov    rdi,r15
      efe154:	e8 c3 02 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efe159:	48 85 ed             	test   rbp,rbp
      efe15c:	75 0d                	jne    efe16b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5581>
      efe15e:	e9 20 01 00 00       	jmp    efe283 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5699>
      efe163:	49 89 c4             	mov    r12,rax
      efe166:	eb e1                	jmp    efe149 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc555f>
      efe168:	49 89 c4             	mov    r12,rax
      efe16b:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      efe16f:	48 89 ef             	mov    rdi,rbp
      efe172:	ff 50 08             	call   QWORD PTR [rax+0x8]
      efe175:	e9 09 01 00 00       	jmp    efe283 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5699>
      efe17a:	49 89 c4             	mov    r12,rax
      efe17d:	4c 89 f7             	mov    rdi,r14
      efe180:	e8 01 03 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe185:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
      efe18b:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efe192:	e8 ef 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe197:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
      efe19b:	e8 e6 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe1a0:	48 8b 7d 10          	mov    rdi,QWORD PTR [rbp+0x10]
      efe1a4:	e8 dd 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe1a9:	4c 89 ff             	mov    rdi,r15
      efe1ac:	e8 d5 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe1b1:	48 89 ef             	mov    rdi,rbp
      efe1b4:	e8 67 fd 8e 00       	call   17edf20 <_ZdlPv@plt>
      efe1b9:	45 31 ff             	xor    r15d,r15d
      efe1bc:	eb 03                	jmp    efe1c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc55d7>
      efe1be:	49 89 c4             	mov    r12,rax
      efe1c1:	4c 89 f7             	mov    rdi,r14
      efe1c4:	e8 bd 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe1c9:	eb 03                	jmp    efe1ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc55e4>
      efe1cb:	49 89 c4             	mov    r12,rax
      efe1ce:	4c 89 ff             	mov    rdi,r15
      efe1d1:	e8 b0 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe1d6:	e9 a8 00 00 00       	jmp    efe283 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5699>
      efe1db:	49 89 c4             	mov    r12,rax
      efe1de:	66 0f 6f 84 24 30 01 	movdqa xmm0,XMMWORD PTR [rsp+0x130]
      efe1e5:	00 00 
      efe1e7:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efe1ee:	e8 93 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe1f3:	66 0f 6f 84 24 40 01 	movdqa xmm0,XMMWORD PTR [rsp+0x140]
      efe1fa:	00 00 
      efe1fc:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efe203:	e8 7e 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe208:	66 0f 6f 84 24 50 01 	movdqa xmm0,XMMWORD PTR [rsp+0x150]
      efe20f:	00 00 
      efe211:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efe218:	e8 69 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe21d:	66 0f 6f 84 24 60 01 	movdqa xmm0,XMMWORD PTR [rsp+0x160]
      efe224:	00 00 
      efe226:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efe22d:	e8 54 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe232:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
      efe239:	00 00 
      efe23b:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efe242:	e8 3f 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe247:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      efe24e:	00 00 
      efe250:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efe257:	e8 2a 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe25c:	66 0f 6f 84 24 d0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xd0]
      efe263:	00 00 
      efe265:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efe26c:	e8 15 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe271:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
      efe277:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efe27e:	e8 03 02 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe283:	66 0f ef c0          	pxor   xmm0,xmm0
      efe287:	66 0f 7f 44 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm0
      efe28d:	e9 c0 fb ff ff       	jmp    efde52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5268>
      efe292:	49 89 c4             	mov    r12,rax
      efe295:	31 ff                	xor    edi,edi
      efe297:	e8 ea 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe29c:	31 ff                	xor    edi,edi
      efe29e:	e8 e3 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe2a3:	eb 03                	jmp    efe2a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc56be>
      efe2a5:	49 89 c4             	mov    r12,rax
      efe2a8:	31 ed                	xor    ebp,ebp
      efe2aa:	31 ff                	xor    edi,edi
      efe2ac:	e8 d5 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe2b1:	31 ff                	xor    edi,edi
      efe2b3:	e8 ce 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe2b8:	45 31 ed             	xor    r13d,r13d
      efe2bb:	45 31 f6             	xor    r14d,r14d
      efe2be:	eb 03                	jmp    efe2c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc56d9>
      efe2c0:	49 89 c4             	mov    r12,rax
      efe2c3:	48 89 ef             	mov    rdi,rbp
      efe2c6:	e8 bb 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe2cb:	eb 03                	jmp    efe2d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc56e6>
      efe2cd:	49 89 c4             	mov    r12,rax
      efe2d0:	4c 89 ef             	mov    rdi,r13
      efe2d3:	e8 ae 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe2d8:	eb 03                	jmp    efe2dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc56f3>
      efe2da:	49 89 c4             	mov    r12,rax
      efe2dd:	4c 89 f7             	mov    rdi,r14
      efe2e0:	e8 a1 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe2e5:	31 ed                	xor    ebp,ebp
      efe2e7:	45 31 ed             	xor    r13d,r13d
      efe2ea:	48 89 ef             	mov    rdi,rbp
      efe2ed:	e8 94 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe2f2:	4c 89 ef             	mov    rdi,r13
      efe2f5:	e8 8c 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe2fa:	31 ff                	xor    edi,edi
      efe2fc:	e8 85 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe301:	31 ff                	xor    edi,edi
      efe303:	e8 7e 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe308:	31 ff                	xor    edi,edi
      efe30a:	e8 77 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe30f:	31 ff                	xor    edi,edi
      efe311:	e8 70 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe316:	31 ff                	xor    edi,edi
      efe318:	e8 69 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe31d:	31 ff                	xor    edi,edi
      efe31f:	e8 62 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe324:	31 ff                	xor    edi,edi
      efe326:	e8 5b 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe32b:	31 ff                	xor    edi,edi
      efe32d:	e8 54 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe332:	31 ff                	xor    edi,edi
      efe334:	e8 4d 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe339:	31 ff                	xor    edi,edi
      efe33b:	e8 46 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe340:	31 ff                	xor    edi,edi
      efe342:	e8 3f 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe347:	31 ff                	xor    edi,edi
      efe349:	e8 38 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe34e:	31 ff                	xor    edi,edi
      efe350:	e8 31 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe355:	31 ff                	xor    edi,edi
      efe357:	e8 2a 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe35c:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      efe363:	00 
      efe364:	e8 c9 06 00 00       	call   efea32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5e48>
      efe369:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
      efe370:	00 
      efe371:	e8 10 01 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe376:	66 0f ef c0          	pxor   xmm0,xmm0
      efe37a:	66 0f 7f 44 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm0
      efe380:	e9 da fa ff ff       	jmp    efde5f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5275>
      efe385:	49 89 c4             	mov    r12,rax
      efe388:	e9 5d ff ff ff       	jmp    efe2ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5700>
      efe38d:	49 89 c4             	mov    r12,rax
      efe390:	e9 5d ff ff ff       	jmp    efe2f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5708>
      efe395:	49 89 c4             	mov    r12,rax
      efe398:	e9 5d ff ff ff       	jmp    efe2fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5710>
      efe39d:	49 89 c4             	mov    r12,rax
      efe3a0:	e9 63 ff ff ff       	jmp    efe308 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc571e>
      efe3a5:	49 89 c4             	mov    r12,rax
      efe3a8:	e9 69 ff ff ff       	jmp    efe316 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc572c>
      efe3ad:	49 89 c4             	mov    r12,rax
      efe3b0:	e9 6f ff ff ff       	jmp    efe324 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc573a>
      efe3b5:	49 89 c4             	mov    r12,rax
      efe3b8:	e9 75 ff ff ff       	jmp    efe332 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5748>
      efe3bd:	49 89 c4             	mov    r12,rax
      efe3c0:	e9 7b ff ff ff       	jmp    efe340 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5756>
      efe3c5:	49 89 c4             	mov    r12,rax
      efe3c8:	eb 84                	jmp    efe34e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5764>
      efe3ca:	49 89 c4             	mov    r12,rax
      efe3cd:	eb 8d                	jmp    efe35c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5772>
      efe3cf:	49 89 c4             	mov    r12,rax
      efe3d2:	48 8b bc 24 f8 05 00 	mov    rdi,QWORD PTR [rsp+0x5f8]
      efe3d9:	00 
      efe3da:	e8 a7 00 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe3df:	4c 89 ef             	mov    rdi,r13
      efe3e2:	e8 9f 00 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe3e7:	eb 80                	jmp    efe369 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc577f>
      efe3e9:	49 89 c4             	mov    r12,rax
      efe3ec:	48 89 df             	mov    rdi,rbx
      efe3ef:	e8 76 bb b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe3f4:	4c 89 f7             	mov    rdi,r14
      efe3f7:	e8 14 fc 8e 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efe3fc:	4c 89 f7             	mov    rdi,r14
      efe3ff:	e8 18 00 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efe404:	eb 03                	jmp    efe409 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc581f>
      efe406:	49 89 c4             	mov    r12,rax
      efe409:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efe410:	00 
      efe411:	e8 54 bb b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe416:	eb 03                	jmp    efe41b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5831>
      efe418:	49 89 c4             	mov    r12,rax
      efe41b:	66 0f ef c0          	pxor   xmm0,xmm0
      efe41f:	66 0f 7f 44 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm0
      efe425:	e9 42 fa ff ff       	jmp    efde6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5282>
      efe42a:	e9 bd 00 00 00       	jmp    efe4ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5902>
      efe42f:	49 89 c4             	mov    r12,rax
      efe432:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
      efe438:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efe43f:	e8 42 00 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe444:	48 89 df             	mov    rdi,rbx
      efe447:	e8 c4 fb 8e 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efe44c:	48 89 df             	mov    rdi,rbx
      efe44f:	e8 c8 ff b9 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efe454:	e9 25 fa ff ff       	jmp    efde7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5294>
      efe459:	e9 8e 00 00 00       	jmp    efe4ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5902>
      efe45e:	e9 89 00 00 00       	jmp    efe4ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5902>
      efe463:	49 89 c4             	mov    r12,rax
      efe466:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efe46d:	00 
      efe46e:	e8 1d fa 8e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efe473:	eb 03                	jmp    efe478 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc588e>
      efe475:	49 89 c4             	mov    r12,rax
      efe478:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      efe47f:	00 
      efe480:	e8 e5 ba b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe485:	eb 03                	jmp    efe48a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc58a0>
      efe487:	49 89 c4             	mov    r12,rax
      efe48a:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      efe491:	00 
      efe492:	e8 d3 ba b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe497:	eb 03                	jmp    efe49c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc58b2>
      efe499:	49 89 c4             	mov    r12,rax
      efe49c:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efe4a3:	00 
      efe4a4:	e8 c1 ba b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe4a9:	eb 03                	jmp    efe4ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc58c4>
      efe4ab:	49 89 c4             	mov    r12,rax
      efe4ae:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
      efe4b5:	00 
      efe4b6:	e8 cb ff b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe4bb:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efe4c2:	00 
      efe4c3:	e8 a2 ba b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe4c8:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      efe4cf:	00 
      efe4d0:	e8 b1 ff b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe4d5:	4c 89 ff             	mov    rdi,r15
      efe4d8:	e8 33 fb 8e 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efe4dd:	4c 89 ff             	mov    rdi,r15
      efe4e0:	e8 37 ff b9 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efe4e5:	e9 94 f9 ff ff       	jmp    efde7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5294>
      efe4ea:	eb 00                	jmp    efe4ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5902>
      efe4ec:	49 89 c4             	mov    r12,rax
      efe4ef:	e9 8a f9 ff ff       	jmp    efde7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5294>
      efe4f4:	e9 ae 00 00 00       	jmp    efe5a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc59bd>
      efe4f9:	e9 c0 00 00 00       	jmp    efe5be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc59d4>
      efe4fe:	e9 bb 00 00 00       	jmp    efe5be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc59d4>
      efe503:	e9 9f 00 00 00       	jmp    efe5a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc59bd>
      efe508:	e9 b1 00 00 00       	jmp    efe5be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc59d4>
      efe50d:	e9 95 00 00 00       	jmp    efe5a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc59bd>
      efe512:	e9 a7 00 00 00       	jmp    efe5be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc59d4>
      efe517:	49 89 c4             	mov    r12,rax
      efe51a:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efe521:	00 
      efe522:	e8 69 f9 8e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efe527:	eb 03                	jmp    efe52c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5942>
      efe529:	49 89 c4             	mov    r12,rax
      efe52c:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      efe533:	00 
      efe534:	e8 31 ba b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe539:	eb 03                	jmp    efe53e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5954>
      efe53b:	49 89 c4             	mov    r12,rax
      efe53e:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      efe545:	00 
      efe546:	e8 1f ba b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe54b:	eb 03                	jmp    efe550 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5966>
      efe54d:	49 89 c4             	mov    r12,rax
      efe550:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efe557:	00 
      efe558:	e8 0d ba b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe55d:	eb 03                	jmp    efe562 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5978>
      efe55f:	49 89 c4             	mov    r12,rax
      efe562:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
      efe569:	00 
      efe56a:	e8 17 ff b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe56f:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efe576:	00 
      efe577:	e8 ee b9 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe57c:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      efe583:	00 
      efe584:	e8 fd fe b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe589:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]
      efe58e:	48 89 df             	mov    rdi,rbx
      efe591:	e8 7a fa 8e 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efe596:	48 89 df             	mov    rdi,rbx
      efe599:	e8 7e fe b9 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efe59e:	e9 e8 f8 ff ff       	jmp    efde8b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc52a1>
      efe5a3:	eb 19                	jmp    efe5be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc59d4>
      efe5a5:	eb 17                	jmp    efe5be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc59d4>
      efe5a7:	49 89 c4             	mov    r12,rax
      efe5aa:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efe5b1:	00 
      efe5b2:	e8 d9 f8 8e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efe5b7:	e9 cf f8 ff ff       	jmp    efde8b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc52a1>
      efe5bc:	eb 00                	jmp    efe5be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc59d4>
      efe5be:	49 89 c4             	mov    r12,rax
      efe5c1:	e9 c5 f8 ff ff       	jmp    efde8b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc52a1>
      efe5c6:	49 89 c4             	mov    r12,rax
      efe5c9:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      efe5d0:	00 
      efe5d1:	e8 94 b9 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe5d6:	4c 89 ff             	mov    rdi,r15
      efe5d9:	e8 32 fa 8e 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efe5de:	4c 89 ff             	mov    rdi,r15
      efe5e1:	e8 36 fe b9 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efe5e6:	eb 03                	jmp    efe5eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a01>
      efe5e8:	49 89 c4             	mov    r12,rax
      efe5eb:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      efe5f2:	00 
      efe5f3:	e8 72 b9 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe5f8:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      efe5ff:	00 
      efe600:	e8 65 b9 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efe605:	eb 10                	jmp    efe617 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a2d>
      efe607:	49 89 c4             	mov    r12,rax
      efe60a:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efe611:	00 
      efe612:	e8 f9 44 bf ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      efe617:	4c 89 f7             	mov    rdi,r14
      efe61a:	e8 67 fe b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe61f:	31 ff                	xor    edi,edi
      efe621:	e8 60 fe b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efe626:	e9 7a f8 ff ff       	jmp    efdea5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc52bb>
#### +0x10/+0x1b5 accesses
      ef91ff:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ef93fa:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      ef9431:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15
      ef94df:	49 8d 4c 24 10       	lea    rcx,[r12+0x10]
      ef97d2:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      ef9ab8:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      efa2fe:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      efa4b0:	66 0f 6f 43 10       	movdqa xmm0,XMMWORD PTR [rbx+0x10]
      efaa16:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      efab5c:	48 8b 4d 10          	mov    rcx,QWORD PTR [rbp+0x10]
      efaba3:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      efb03d:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
      efb64a:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      efba86:	4c 8b 60 10          	mov    r12,QWORD PTR [rax+0x10]
      efc237:	4c 8b 65 10          	mov    r12,QWORD PTR [rbp+0x10]
      efc623:	80 bb b5 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b5],0x0
      efc630:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
      efd524:	ff 50 10             	call   QWORD PTR [rax+0x10]
      efe1a0:	48 8b 7d 10          	mov    rdi,QWORD PTR [rbp+0x10]

## All AP 0x18365e0 materializations
### 0xe9cce4: lea    rax,[rip+0x9998f5]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>; FDE=(15310087, 15343400)
      e9cc98:	48 85 c0             	test   rax,rax
      e9cc9b:	74 05                	je     e9cca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x640b8>
      e9cc9d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9cca2:	48 83 a4 24 60 06 00 	and    QWORD PTR [rsp+0x660],0x0
      e9cca9:	00 00 
      e9ccab:	bf d0 03 00 00       	mov    edi,0x3d0
      e9ccb0:	e8 4b 12 95 00       	call   17edf00 <_Znwm@plt>
      e9ccb5:	49 89 c4             	mov    r12,rax
      e9ccb8:	4c 8d bc 24 b0 07 00 	lea    r15,[rsp+0x7b0]
      e9ccbf:	00 
      e9ccc0:	48 89 84 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],rax
      e9ccc7:	00 
      e9ccc8:	48 8d 84 24 20 05 00 	lea    rax,[rsp+0x520]
      e9cccf:	00 
      e9ccd0:	48 89 84 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],rax
      e9ccd7:	00 
      e9ccd8:	48 c7 84 24 40 0b 00 	mov    QWORD PTR [rsp+0xb40],0x1
      e9ccdf:	00 01 00 00 00 
      e9cce4:	48 8d 05 f5 98 99 00 	lea    rax,[rip+0x9998f5]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      e9cceb:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ccef:	49 8b 47 c0          	mov    rax,QWORD PTR [r15-0x40]
      e9ccf3:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      e9ccf8:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
      e9ccfd:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      e9cd02:	48 89 ee             	mov    rsi,rbp
      e9cd05:	e8 ee c4 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
      e9cd0a:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
      e9cd0e:	41 0f 29 44 24 50    	movaps XMMWORD PTR [r12+0x50],xmm0
      e9cd14:	41 0f 28 47 10       	movaps xmm0,XMMWORD PTR [r15+0x10]
      e9cd19:	41 0f 11 44 24 60    	movups XMMWORD PTR [r12+0x60],xmm0
      e9cd1f:	0f 57 c0             	xorps  xmm0,xmm0
      e9cd22:	48 8d 84 24 c0 07 00 	lea    rax,[rsp+0x7c0]
      e9cd29:	00 
      e9cd2a:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      e9cd2d:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e9cd32:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      e9cd37:	48 8d b4 24 d0 07 00 	lea    rsi,[rsp+0x7d0]
      e9cd3e:	00 
      e9cd3f:	e8 60 c1 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
      e9cd44:	49 8d bc 24 a0 00 00 	lea    rdi,[r12+0xa0]
      e9cd4b:	00 
      e9cd4c:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
      e9cd53:	00 
      e9cd54:	48 8d b4 24 00 08 00 	lea    rsi,[rsp+0x800]
      e9cd5b:	00 
      e9cd5c:	e8 0b 96 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e9cd61:	49 8d ac 24 d0 00 00 	lea    rbp,[r12+0xd0]
      e9cd68:	00 
      e9cd69:	48 89 ef             	mov    rdi,rbp
      e9cd6c:	48 8d b4 24 30 08 00 	lea    rsi,[rsp+0x830]
      e9cd73:	00 
      e9cd74:	e8 37 96 00 00       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
      e9cd79:	4d 8d b4 24 00 01 00 	lea    r14,[r12+0x100]
      e9cd80:	00 
      e9cd81:	4c 89 f7             	mov    rdi,r14
      e9cd84:	48 89 de             	mov    rsi,rbx
      e9cd87:	e8 5c c1 05 00       	call   ef8ee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02fe>
      e9cd8c:	41 0f 28 87 e0 00 00 	movaps xmm0,XMMWORD PTR [r15+0xe0]
      e9cd93:	00 

### 0xef90ca: lea    rax,[rip+0x93d50f]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>; FDE=(15700170, 15700189)
      ef9075:	e8 f0 0e b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef907a:	48 8b bb 48 01 00 00 	mov    rdi,QWORD PTR [rbx+0x148]
      ef9081:	e8 00 54 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9086:	48 8d bb f0 00 00 00 	lea    rdi,[rbx+0xf0]
      ef908d:	e8 d8 0e b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef9092:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
      ef9099:	e8 cc 0e b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef909e:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
      ef90a5:	e8 c0 0e b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef90aa:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
      ef90ae:	e8 b7 0e b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef90b3:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      ef90b7:	e8 ca 53 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef90bc:	48 83 c3 10          	add    rbx,0x10
      ef90c0:	48 89 df             	mov    rdi,rbx
      ef90c3:	5b                   	pop    rbx
      ef90c4:	e9 a1 0e b8 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
      ef90c9:	cc                   	int3
      ef90ca:	48 8d 05 0f d5 93 00 	lea    rax,[rip+0x93d50f]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef90d1:	48 89 07             	mov    QWORD PTR [rdi],rax
      ef90d4:	48 83 c7 10          	add    rdi,0x10
      ef90d8:	e9 91 fe ff ff       	jmp    ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      ef90dd:	cc                   	int3
      ef90de:	53                   	push   rbx
      ef90df:	48 89 fb             	mov    rbx,rdi
      ef90e2:	e8 e3 ff ff ff       	call   ef90ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc04e0>
      ef90e7:	48 89 df             	mov    rdi,rbx
      ef90ea:	5b                   	pop    rbx
      ef90eb:	e9 30 4e 8f 00       	jmp    17edf20 <_ZdlPv@plt>
      ef90f0:	41 56                	push   r14
      ef90f2:	53                   	push   rbx
      ef90f3:	48 83 ec 28          	sub    rsp,0x28
      ef90f7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef90fe:	00 00 
      ef9100:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ef9105:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      ef9109:	bf d0 03 00 00       	mov    edi,0x3d0
      ef910e:	e8 ed 4d 8f 00       	call   17edf00 <_Znwm@plt>
      ef9113:	48 89 c3             	mov    rbx,rax
      ef9116:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef911a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      ef911f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ef9124:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      ef912b:	00 00 
      ef912d:	48 8d 05 ac d4 93 00 	lea    rax,[rip+0x93d4ac]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef9134:	48 89 03             	mov    QWORD PTR [rbx],rax
      ef9137:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      ef913b:	4c 89 f6             	mov    rsi,r14
      ef913e:	e8 2d 8a 00 00       	call   f01b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8f86>
      ef9143:	48 89 e7             	mov    rdi,rsp
      ef9146:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ef914a:	e8 7b 11 b8 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ef914f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef9156:	00 00 
      ef9158:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ef915d:	75 2e                	jne    ef918d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc05a3>
      ef915f:	48 89 d8             	mov    rax,rbx
      ef9162:	48 83 c4 28          	add    rsp,0x28
      ef9166:	5b                   	pop    rbx

### 0xef912d: lea    rax,[rip+0x93d4ac]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>; FDE=(15700208, 15700370)
      ef90e7:	48 89 df             	mov    rdi,rbx
      ef90ea:	5b                   	pop    rbx
      ef90eb:	e9 30 4e 8f 00       	jmp    17edf20 <_ZdlPv@plt>
      ef90f0:	41 56                	push   r14
      ef90f2:	53                   	push   rbx
      ef90f3:	48 83 ec 28          	sub    rsp,0x28
      ef90f7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef90fe:	00 00 
      ef9100:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ef9105:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      ef9109:	bf d0 03 00 00       	mov    edi,0x3d0
      ef910e:	e8 ed 4d 8f 00       	call   17edf00 <_Znwm@plt>
      ef9113:	48 89 c3             	mov    rbx,rax
      ef9116:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef911a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      ef911f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ef9124:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      ef912b:	00 00 
      ef912d:	48 8d 05 ac d4 93 00 	lea    rax,[rip+0x93d4ac]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef9134:	48 89 03             	mov    QWORD PTR [rbx],rax
      ef9137:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      ef913b:	4c 89 f6             	mov    rsi,r14
      ef913e:	e8 2d 8a 00 00       	call   f01b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8f86>
      ef9143:	48 89 e7             	mov    rdi,rsp
      ef9146:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ef914a:	e8 7b 11 b8 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ef914f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef9156:	00 00 
      ef9158:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ef915d:	75 2e                	jne    ef918d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc05a3>
      ef915f:	48 89 d8             	mov    rax,rbx
      ef9162:	48 83 c4 28          	add    rsp,0x28
      ef9166:	5b                   	pop    rbx
      ef9167:	41 5e                	pop    r14
      ef9169:	c3                   	ret
      ef916a:	48 89 c3             	mov    rbx,rax
      ef916d:	48 89 e7             	mov    rdi,rsp
      ef9170:	e8 55 11 b8 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ef9175:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef917c:	00 00 
      ef917e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ef9183:	75 08                	jne    ef918d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc05a3>
      ef9185:	48 89 df             	mov    rdi,rbx
      ef9188:	e8 43 6b b7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ef918d:	e8 1e 69 8f 00       	call   17efab0 <__stack_chk_fail@plt>
      ef9192:	48 8d 47 10          	lea    rax,[rdi+0x10]
      ef9196:	48 8d 0d 43 d4 93 00 	lea    rcx,[rip+0x93d443]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef919d:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ef91a0:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      ef91a4:	48 89 c6             	mov    rsi,rax
      ef91a7:	e9 c4 89 00 00       	jmp    f01b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8f86>
      ef91ac:	48 83 c7 10          	add    rdi,0x10
      ef91b0:	e9 b9 fd ff ff       	jmp    ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      ef91b5:	cc                   	int3
      ef91b6:	53                   	push   rbx
      ef91b7:	48 89 fb             	mov    rbx,rdi
      ef91ba:	48 83 c7 10          	add    rdi,0x10
      ef91be:	e8 ab fd ff ff       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      ef91c3:	48 89 df             	mov    rdi,rbx

### 0xef9196: lea    rcx,[rip+0x93d443]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>; FDE=(15700370, 15700396)
      ef9158:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ef915d:	75 2e                	jne    ef918d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc05a3>
      ef915f:	48 89 d8             	mov    rax,rbx
      ef9162:	48 83 c4 28          	add    rsp,0x28
      ef9166:	5b                   	pop    rbx
      ef9167:	41 5e                	pop    r14
      ef9169:	c3                   	ret
      ef916a:	48 89 c3             	mov    rbx,rax
      ef916d:	48 89 e7             	mov    rdi,rsp
      ef9170:	e8 55 11 b8 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ef9175:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef917c:	00 00 
      ef917e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ef9183:	75 08                	jne    ef918d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc05a3>
      ef9185:	48 89 df             	mov    rdi,rbx
      ef9188:	e8 43 6b b7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ef918d:	e8 1e 69 8f 00       	call   17efab0 <__stack_chk_fail@plt>
      ef9192:	48 8d 47 10          	lea    rax,[rdi+0x10]
      ef9196:	48 8d 0d 43 d4 93 00 	lea    rcx,[rip+0x93d443]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef919d:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ef91a0:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      ef91a4:	48 89 c6             	mov    rsi,rax
      ef91a7:	e9 c4 89 00 00       	jmp    f01b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8f86>
      ef91ac:	48 83 c7 10          	add    rdi,0x10
      ef91b0:	e9 b9 fd ff ff       	jmp    ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      ef91b5:	cc                   	int3
      ef91b6:	53                   	push   rbx
      ef91b7:	48 89 fb             	mov    rbx,rdi
      ef91ba:	48 83 c7 10          	add    rdi,0x10
      ef91be:	e8 ab fd ff ff       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      ef91c3:	48 89 df             	mov    rdi,rbx
      ef91c6:	5b                   	pop    rbx
      ef91c7:	e9 54 4d 8f 00       	jmp    17edf20 <_ZdlPv@plt>
      ef91cc:	55                   	push   rbp
      ef91cd:	41 57                	push   r15
      ef91cf:	41 56                	push   r14
      ef91d1:	41 55                	push   r13
      ef91d3:	41 54                	push   r12
      ef91d5:	53                   	push   rbx
      ef91d6:	48 81 ec f8 0a 00 00 	sub    rsp,0xaf8
      ef91dd:	49 89 fc             	mov    r12,rdi
      ef91e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef91e7:	00 00 
      ef91e9:	48 89 84 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],rax
      ef91f0:	00 
      ef91f1:	0f 57 c0             	xorps  xmm0,xmm0
      ef91f4:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      ef91f7:	48 8d 47 18          	lea    rax,[rdi+0x18]
      ef91fb:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
      ef91ff:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ef9203:	48 8d 47 30          	lea    rax,[rdi+0x30]
      ef9207:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
      ef920b:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      ef920f:	66 0f 6f 86 50 01 00 	movdqa xmm0,XMMWORD PTR [rsi+0x150]
      ef9216:	00 
      ef9217:	48 89 74 24 60       	mov    QWORD PTR [rsp+0x60],rsi
      ef921c:	48 8b 86 58 01 00 00 	mov    rax,QWORD PTR [rsi+0x158]
      ef9223:	48 85 c0             	test   rax,rax
      ef9226:	74 05                	je     ef922d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0643>

## FDEs containing same-register accesses to both +0x10 and +0x1b5
### FDE 0xef91cc..0xefe62b, base=rbx, nearest=0xd
- +0x10:
  - 0xefa4b0: movdqa xmm0,XMMWORD PTR [rbx+0x10]
  - 0xefaba3: lock inc QWORD PTR [rbx+0x10]
  - 0xefc630: mov    r15,QWORD PTR [rbx+0x10]
- +0x1b5:
  - 0xefc623: cmp    BYTE PTR [rbx+0x1b5],0x0
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

### FDE 0x12d0bc4..0x12d38ce, base=r12, nearest=0xb8
- +0x10:
  - 0x12d2047: or     DWORD PTR [r12+0x10],0x2
  - 0x12d28b4: mov    rax,QWORD PTR [r12+0x10]
  - 0x12d2975: movzx  ebx,WORD PTR [r12+0x10]
  - 0x12d2d12: mov    rcx,QWORD PTR [r12+0x10]
  - 0x12d2f06: mov    rcx,QWORD PTR [r12+0x10]
  - 0x12d2fcf: mov    rax,QWORD PTR [r12+0x10]
- +0x1b5:
  - 0x12d3087: or     al,BYTE PTR [r12+0x1b5]
     12d2f7d:	48 8d 05 b6 35 00 00 	lea    rax,[rip+0x35b6]        # 12d653a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11babe>
     12d2f84:	48 89 84 24 18 03 00 	mov    QWORD PTR [rsp+0x318],rax
     12d2f8b:	00 
     12d2f8c:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12d2f91:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d2f94:	48 8d 9c 24 00 03 00 	lea    rbx,[rsp+0x300]
     12d2f9b:	00 
     12d2f9c:	48 89 de             	mov    rsi,rbx
     12d2f9f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12d2fa2:	48 89 df             	mov    rdi,rbx
     12d2fa5:	e8 f4 d0 af ff       	call   dd009e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d124>
     12d2faa:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     12d2fae:	41 80 bc 24 21 06 00 	cmp    BYTE PTR [r12+0x621],0x0
     12d2fb5:	00 00 
     12d2fb7:	0f 84 c2 00 00 00    	je     12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
     12d2fbd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2fc2:	80 b8 f5 00 00 00 00 	cmp    BYTE PTR [rax+0xf5],0x0
     12d2fc9:	0f 85 b0 00 00 00    	jne    12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
     12d2fcf:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     12d2fd4:	48 8b 58 60          	mov    rbx,QWORD PTR [rax+0x60]
     12d2fd8:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12d2fdd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d2fe0:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12d2fe3:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
     12d2fe6:	48 89 df             	mov    rdi,rbx
     12d2fe9:	48 89 c6             	mov    rsi,rax
     12d2fec:	48 8d 15 45 29 72 00 	lea    rdx,[rip+0x722945]        # 19f5938 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x39f7>
     12d2ff3:	ff 51 50             	call   QWORD PTR [rcx+0x50]
     12d2ff6:	84 c0                	test   al,al
     12d2ff8:	74 1e                	je     12d3018 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11859c>
     12d2ffa:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2fff:	c6 80 f5 00 00 00 01 	mov    BYTE PTR [rax+0xf5],0x1
     12d3006:	80 48 12 10          	or     BYTE PTR [rax+0x12],0x10
     12d300a:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     12d300e:	4c 8d b4 24 50 03 00 	lea    r14,[rsp+0x350]
     12d3015:	00 
     12d3016:	eb 67                	jmp    12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
     12d3018:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d301d:	80 b8 f5 00 00 00 00 	cmp    BYTE PTR [rax+0xf5],0x0
     12d3024:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     12d3028:	4c 8d b4 24 50 03 00 	lea    r14,[rsp+0x350]
     12d302f:	00 
     12d3030:	75 4d                	jne    12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
     12d3032:	4c 89 a4 24 50 03 00 	mov    QWORD PTR [rsp+0x350],r12
     12d3039:	00 
     12d303a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d303f:	48 89 84 24 58 03 00 	mov    QWORD PTR [rsp+0x358],rax
     12d3046:	00 
     12d3047:	48 8d 05 f6 ab 80 ff 	lea    rax,[rip+0xffffffffff80abf6]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
     12d304e:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
     12d3055:	00 
     12d3056:	48 8d 05 13 35 00 00 	lea    rax,[rip+0x3513]        # 12d6570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11baf4>
     12d305d:	48 89 84 24 68 03 00 	mov    QWORD PTR [rsp+0x368],rax
     12d3064:	00 
     12d3065:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12d306a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d306d:	4c 89 f6             	mov    rsi,r14
     12d3070:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12d3073:	4c 89 f7             	mov    rdi,r14
     12d3076:	e8 23 d0 af ff       	call   dd009e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d124>
     12d307b:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     12d307f:	41 8a 84 24 01 01 00 	mov    al,BYTE PTR [r12+0x101]
     12d3086:	00 
     12d3087:	41 0a 84 24 b5 01 00 	or     al,BYTE PTR [r12+0x1b5]
     12d308e:	00 
     12d308f:	74 2a                	je     12d30bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11863f>
     12d3091:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12d3096:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d3099:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12d309c:	48 89 84 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rax
     12d30a3:	00 
     12d30a4:	4c 89 f7             	mov    rdi,r14
     12d30a7:	e8 94 ba 51 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
     12d30ac:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d30b1:	89 81 f0 00 00 00    	mov    DWORD PTR [rcx+0xf0],eax
     12d30b7:	80 49 12 04          	or     BYTE PTR [rcx+0x12],0x4
     12d30bb:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
     12d30bf:	8a 81 00 01 00 00    	mov    al,BYTE PTR [rcx+0x100]
     12d30c5:	0a 81 b4 01 00 00    	or     al,BYTE PTR [rcx+0x1b4]
     12d30cb:	74 45                	je     12d3112 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118696>
     12d30cd:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12d30d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d30d5:	ff 50 60             	call   QWORD PTR [rax+0x60]
     12d30d8:	4c 89 f7             	mov    rdi,r14
     12d30db:	48 89 c6             	mov    rsi,rax
     12d30de:	e8 5d ae 51 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12d30e3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d30e8:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
     12d30ec:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]

### FDE 0xad1a74..0xad5057, base=r15, nearest=0x62d
- +0x10:
  - 0xad2b30: and    QWORD PTR [r15+0x10],0x0
  - 0xad3c18: movdqa XMMWORD PTR [r15+0x10],xmm0
- +0x1b5:
  - 0xad2503: cmp    BYTE PTR [r15+0x1b5],0x0
      ad24b5:	48 89 de             	mov    rsi,rbx
      ad24b8:	ff 90 00 01 00 00    	call   QWORD PTR [rax+0x100]
      ad24be:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ad24c2:	e8 eb bf fc ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      ad24c7:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
      ad24cc:	41 80 bf b6 01 00 00 	cmp    BYTE PTR [r15+0x1b6],0x0
      ad24d3:	00 
      ad24d4:	74 2d                	je     ad2503 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f4a3>
      ad24d6:	48 8d 35 79 82 88 ff 	lea    rsi,[rip+0xffffffffff888279]        # 35a756 <_ZTSSt12bad_any_cast@@Base-0x35a72>
      ad24dd:	4c 8d b4 24 50 07 00 	lea    r14,[rsp+0x750]
      ad24e4:	00 
      ad24e5:	4c 89 f7             	mov    rdi,r14
      ad24e8:	e8 91 75 fa ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ad24ed:	48 8d 35 2c f7 97 ff 	lea    rsi,[rip+0xffffffffff97f72c]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
      ad24f4:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
      ad24fb:	00 
      ad24fc:	e8 7d 75 fa ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ad2501:	eb 39                	jmp    ad253c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f4dc>
      ad2503:	41 80 bf b5 01 00 00 	cmp    BYTE PTR [r15+0x1b5],0x0
      ad250a:	00 
      ad250b:	0f 84 a4 02 00 00    	je     ad27b5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f755>
      ad2511:	48 8d 35 d5 1c 88 ff 	lea    rsi,[rip+0xffffffffff881cd5]        # 3541ed <_ZTSSt12bad_any_cast@@Base-0x3bfdb>
      ad2518:	4c 8d b4 24 50 07 00 	lea    r14,[rsp+0x750]
      ad251f:	00 
      ad2520:	4c 89 f7             	mov    rdi,r14
      ad2523:	e8 56 75 fa ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ad2528:	48 8d 35 f1 f6 97 ff 	lea    rsi,[rip+0xffffffffff97f6f1]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
      ad252f:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
      ad2536:	00 
      ad2537:	e8 42 75 fa ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ad253c:	48 8d 9c 24 40 09 00 	lea    rbx,[rsp+0x940]
      ad2543:	00 
      ad2544:	4c 8d b4 24 50 07 00 	lea    r14,[rsp+0x750]
      ad254b:	00 
      ad254c:	4c 8d bc 24 a0 04 00 	lea    r15,[rsp+0x4a0]
      ad2553:	00 
      ad2554:	48 89 df             	mov    rdi,rbx
      ad2557:	4c 89 f6             	mov    rsi,r14
      ad255a:	4c 89 fa             	mov    rdx,r15
      ad255d:	e8 62 76 b1 00       	call   15e9bc4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f148>
      ad2562:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      ad2566:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ad256b:	f3 0f 7f 80 d8 02 00 	movdqu XMMWORD PTR [rax+0x2d8],xmm0
      ad2572:	00 
      ad2573:	66 0f ef c0          	pxor   xmm0,xmm0
      ad2577:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0
      ad257b:	48 89 c3             	mov    rbx,rax
      ad257e:	4c 89 ff             	mov    rdi,r15
      ad2581:	e8 0a b9 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad2586:	4c 89 f7             	mov    rdi,r14
      ad2589:	e8 02 b9 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad258e:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
      ad2593:	45 31 f6             	xor    r14d,r14d
      ad2596:	31 ff                	xor    edi,edi
      ad2598:	e8 15 bf fc ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      ad259d:	48 8b bc 24 48 09 00 	mov    rdi,QWORD PTR [rsp+0x948]
      ad25a4:	00 
      ad25a5:	e8 dc be fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ad25aa:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
      ad25b1:	00 
      ad25b2:	e8 d9 b8 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad25b7:	4c 8d a3 e8 02 00 00 	lea    r12,[rbx+0x2e8]
      ad25be:	48 8b b3 d8 02 00 00 	mov    rsi,QWORD PTR [rbx+0x2d8]
      ad25c5:	48 8d 9c 24 50 07 00 	lea    rbx,[rsp+0x750]
      ad25cc:	00 
      ad25cd:	48 89 df             	mov    rdi,rbx
      ad25d0:	e8 d1 72 b1 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      ad25d5:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ad25da:	48 8b 50 18          	mov    rdx,QWORD PTR [rax+0x18]
      ad25de:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ad25e3:	48 8b 48 20          	mov    rcx,QWORD PTR [rax+0x20]
      ad25e7:	4c 89 e7             	mov    rdi,r12
      ad25ea:	48 89 de             	mov    rsi,rbx
      ad25ed:	e8 69 2b 00 00       	call   ad515b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x220fb>
      ad25f2:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      ad25f6:	e8 8b be fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ad25fb:	48 8d 9c 24 60 01 00 	lea    rbx,[rsp+0x160]
      ad2602:	00 
      ad2603:	44 88 b3 30 01 00 00 	mov    BYTE PTR [rbx+0x130],r14b
      ad260a:	44 88 b3 c8 01 00 00 	mov    BYTE PTR [rbx+0x1c8],r14b
      ad2611:	44 88 b3 d0 01 00 00 	mov    BYTE PTR [rbx+0x1d0],r14b
      ad2618:	44 88 b3 e8 01 00 00 	mov    BYTE PTR [rbx+0x1e8],r14b
      ad261f:	ba 2c 01 00 00       	mov    edx,0x12c
      ad2624:	48 89 df             	mov    rdi,rbx
      ad2627:	31 f6                	xor    esi,esi
      ad2629:	e8 62 c5 d1 00       	call   17eeb90 <memset@plt>
      ad262e:	48 89 df             	mov    rdi,rbx
      ad2631:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      ad2636:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]

## Global writers to +0x1b5
### 0xcea876: mov    WORD PTR [rsp+0x1b5],ax; FDE=(13541732, 13544418)
      cea826:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
      cea82d:	00 
      cea82e:	4c 89 fe             	mov    rsi,r15
      cea831:	e8 4a 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea836:	4c 8d ac 24 70 04 00 	lea    r13,[rsp+0x470]
      cea83d:	00 
      cea83e:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      cea842:	e8 ef 0f d9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      cea847:	48 89 c7             	mov    rdi,rax
      cea84a:	48 89 d6             	mov    rsi,rdx
      cea84d:	e8 1b 17 84 00       	call   152bf6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3714f1>
      cea852:	89 84 24 b0 01 00 00 	mov    DWORD PTR [rsp+0x1b0],eax
      cea859:	41 8a 87 b4 00 00 00 	mov    al,BYTE PTR [r15+0xb4]
      cea860:	88 84 24 b4 01 00 00 	mov    BYTE PTR [rsp+0x1b4],al
      cea867:	41 0f b6 87 b5 00 00 	movzx  eax,BYTE PTR [r15+0xb5]
      cea86e:	00 
      cea86f:	b9 00 01 00 00       	mov    ecx,0x100
      cea874:	09 c8                	or     eax,ecx
      cea876:	66 89 84 24 b5 01 00 	mov    WORD PTR [rsp+0x1b5],ax
      cea87d:	00 
      cea87e:	41 0f b6 87 b6 00 00 	movzx  eax,BYTE PTR [r15+0xb6]
      cea885:	00 
      cea886:	09 c8                	or     eax,ecx
      cea888:	66 89 84 24 b7 01 00 	mov    WORD PTR [rsp+0x1b7],ax
      cea88f:	00 
      cea890:	41 80 7d 14 00       	cmp    BYTE PTR [r13+0x14],0x0
      cea895:	74 3e                	je     cea8d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237875>
      cea897:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      cea89e:	00 
      cea89f:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
      cea8a3:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea8a8:	41 89 44 24 11       	mov    DWORD PTR [r12+0x11],eax
      cea8ad:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      cea8b3:	f3 41 0f 7f 44 24 01 	movdqu XMMWORD PTR [r12+0x1],xmm0
      cea8ba:	41 c6 04 24 28       	mov    BYTE PTR [r12],0x28
      cea8bf:	41 c6 44 24 15 00    	mov    BYTE PTR [r12+0x15],0x0
      cea8c5:	4c 89 e6             	mov    rsi,r12
      cea8c8:	e8 61 11 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea8cd:	4c 89 e7             	mov    rdi,r12
      cea8d0:	e8 bb 35 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cea8d5:	4d 89 f5             	mov    r13,r14
      cea8d8:	83 a4 24 d8 01 00 00 	and    DWORD PTR [rsp+0x1d8],0x0
      cea8df:	00 
      cea8e0:	49 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [r15+0xb8]
      cea8e7:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
      cea8ee:	00 
      cea8ef:	49 69 87 18 01 00 00 	imul   rax,QWORD PTR [r15+0x118],0x3e8

