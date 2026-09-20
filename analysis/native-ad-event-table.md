# Orbit callback table containing ad-state transition 0x10a9668

Known relocation: table slot 0x184c840 -> 0x10a9668.

## Relocations 0x184c780..0x184c900

    000000000184c780  0000000000000008 R_X86_64_RELATIVE                         10a8ecc
    000000000184c788  0000000000000008 R_X86_64_RELATIVE                         10a8f66
    000000000184c790  0000000000000008 R_X86_64_RELATIVE                         10a8f84
    000000000184c798  0000000000000008 R_X86_64_RELATIVE                         10a913a
    000000000184c7a0  0000000000000008 R_X86_64_RELATIVE                         10a9298
    000000000184c7a8  0000000000000008 R_X86_64_RELATIVE                         10a92b6
    000000000184c7b0  0000000000000008 R_X86_64_RELATIVE                         10a92d4
    000000000184c7b8  0000000000000008 R_X86_64_RELATIVE                         10a92f2
    000000000184c7c0  0000000000000008 R_X86_64_RELATIVE                         10a9310
    000000000184c7c8  0000000000000008 R_X86_64_RELATIVE                         10a932e
    000000000184c7d0  0000000000000008 R_X86_64_RELATIVE                         10a934c
    000000000184c7d8  0000000000000008 R_X86_64_RELATIVE                         10a936a
    000000000184c7e0  0000000000000008 R_X86_64_RELATIVE                         10a9388
    000000000184c7e8  0000000000000008 R_X86_64_RELATIVE                         10a93a6
    000000000184c7f0  0000000000000008 R_X86_64_RELATIVE                         10a93c4
    000000000184c7f8  0000000000000008 R_X86_64_RELATIVE                         10a93dc
    000000000184c800  0000000000000008 R_X86_64_RELATIVE                         10a941c
    000000000184c808  0000000000000008 R_X86_64_RELATIVE                         10a9436
    000000000184c810  0000000000000008 R_X86_64_RELATIVE                         10a9566
    000000000184c818  0000000000000008 R_X86_64_RELATIVE                         10a9584
    000000000184c820  0000000000000008 R_X86_64_RELATIVE                         10a95a2
    000000000184c828  0000000000000008 R_X86_64_RELATIVE                         10a95c0
    000000000184c830  0000000000000008 R_X86_64_RELATIVE                         10a95de
    000000000184c838  0000000000000008 R_X86_64_RELATIVE                         10a95fc
    000000000184c840  0000000000000008 R_X86_64_RELATIVE                         10a9668
    000000000184c858  0000000000000008 R_X86_64_RELATIVE                         10a969c
    000000000184c860  0000000000000008 R_X86_64_RELATIVE                         10a96a6
    000000000184c868  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c870  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c878  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c880  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c888  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c890  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c898  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8a0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8a8  0000000000000008 R_X86_64_RELATIVE                         10a96b0
    000000000184c8b0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8b8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8c0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8c8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8d0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8d8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8e0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8f8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c900  0000000000000008 R_X86_64_RELATIVE                         a50370

## Slot 0x184c780 -> 0x10a8ecc
Function: 0x10a8ecc..0x10a8f65
     10a8ecc:	55                   	push   rbp
     10a8ecd:	41 56                	push   r14
     10a8ecf:	53                   	push   rbx
     10a8ed0:	48 83 ec 60          	sub    rsp,0x60
     10a8ed4:	48 89 fb             	mov    rbx,rdi
     10a8ed7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a8ede:	00 00 
     10a8ee0:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     10a8ee5:	49 89 e6             	mov    r14,rsp
     10a8ee8:	41 83 66 38 00       	and    DWORD PTR [r14+0x38],0x0
     10a8eed:	0f 57 c0             	xorps  xmm0,xmm0
     10a8ef0:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     10a8ef4:	41 0f 29 46 10       	movaps XMMWORD PTR [r14+0x10],xmm0
     10a8ef9:	41 0f 29 46 20       	movaps XMMWORD PTR [r14+0x20],xmm0
     10a8efe:	48 89 f7             	mov    rdi,rsi
     10a8f01:	e8 30 29 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a8f06:	4c 89 f7             	mov    rdi,r14
     10a8f09:	48 89 c6             	mov    rsi,rax
     10a8f0c:	e8 2f c5 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a8f11:	40 b5 01             	mov    bpl,0x1
     10a8f14:	84 c0                	test   al,al
     10a8f16:	74 1d                	je     10a8f35 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27034b>
     10a8f18:	8b 44 24 38          	mov    eax,DWORD PTR [rsp+0x38]
     10a8f1c:	83 f8 64             	cmp    eax,0x64
     10a8f1f:	74 05                	je     10a8f26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27033c>
     10a8f21:	83 f8 04             	cmp    eax,0x4
     10a8f24:	75 0f                	jne    10a8f35 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27034b>
     10a8f26:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     10a8f2a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a8f2d:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     10a8f33:	89 c5                	mov    ebp,eax
     10a8f35:	48 89 e7             	mov    rdi,rsp
     10a8f38:	e8 f1 c3 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a8f3d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a8f44:	00 00 
     10a8f46:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     10a8f4b:	75 0b                	jne    10a8f58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27036e>
     10a8f4d:	89 e8                	mov    eax,ebp
     10a8f4f:	48 83 c4 60          	add    rsp,0x60
     10a8f53:	5b                   	pop    rbx
     10a8f54:	41 5e                	pop    r14
     10a8f56:	5d                   	pop    rbp
     10a8f57:	c3                   	ret
     10a8f58:	e8 53 6b 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a8f5d:	48 89 c7             	mov    rdi,rax
     10a8f60:	e8 40 0b 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c788 -> 0x10a8f66
Function: 0x10a8f66..0x10a8f83
     10a8f66:	53                   	push   rbx
     10a8f67:	48 89 fb             	mov    rbx,rdi
     10a8f6a:	48 81 c6 d0 14 00 00 	add    rsi,0x14d0
     10a8f71:	e8 44 07 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a8f76:	48 89 d8             	mov    rax,rbx
     10a8f79:	5b                   	pop    rbx
     10a8f7a:	c3                   	ret
     10a8f7b:	48 89 c7             	mov    rdi,rax
     10a8f7e:	e8 22 0b 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c790 -> 0x10a8f84
Function: 0x10a8f84..0x10a9139
     10a8f84:	41 57                	push   r15
     10a8f86:	41 56                	push   r14
     10a8f88:	41 54                	push   r12
     10a8f8a:	53                   	push   rbx
     10a8f8b:	48 81 ec 08 01 00 00 	sub    rsp,0x108
     10a8f92:	49 89 cf             	mov    r15,rcx
     10a8f95:	49 89 f6             	mov    r14,rsi
     10a8f98:	48 89 fb             	mov    rbx,rdi
     10a8f9b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a8fa2:	00 00 
     10a8fa4:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     10a8fab:	00 
     10a8fac:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
     10a8fb3:	00 
     10a8fb4:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
     10a8fba:	0f 57 c0             	xorps  xmm0,xmm0
     10a8fbd:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
     10a8fc2:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
     10a8fc8:	41 0f 29 44 24 20    	movaps XMMWORD PTR [r12+0x20],xmm0
     10a8fce:	48 89 d7             	mov    rdi,rdx
     10a8fd1:	e8 60 28 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a8fd6:	4c 89 e7             	mov    rdi,r12
     10a8fd9:	48 89 c6             	mov    rsi,rax
     10a8fdc:	e8 5f c4 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a8fe1:	84 c0                	test   al,al
     10a8fe3:	74 0a                	je     10a8fef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270405>
     10a8fe5:	83 bc 24 d8 00 00 00 	cmp    DWORD PTR [rsp+0xd8],0x3e
     10a8fec:	3e 
     10a8fed:	74 6f                	je     10a905e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270474>
     10a8fef:	41 80 7f 18 00       	cmp    BYTE PTR [r15+0x18],0x0
     10a8ff4:	74 52                	je     10a9048 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27045e>
     10a8ff6:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
     10a8ffb:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
     10a9001:	0f 57 c0             	xorps  xmm0,xmm0
     10a9004:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
     10a9009:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
     10a900f:	41 0f 29 44 24 20    	movaps XMMWORD PTR [r12+0x20],xmm0
     10a9015:	4c 89 ff             	mov    rdi,r15
     10a9018:	e8 19 28 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a901d:	4c 89 e7             	mov    rdi,r12
     10a9020:	48 89 c6             	mov    rsi,rax
     10a9023:	e8 18 c4 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a9028:	84 c0                	test   al,al
     10a902a:	74 12                	je     10a903e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270454>
     10a902c:	8b 44 24 78          	mov    eax,DWORD PTR [rsp+0x78]
     10a9030:	83 f8 04             	cmp    eax,0x4
     10a9033:	74 09                	je     10a903e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270454>
     10a9035:	83 f8 64             	cmp    eax,0x64
     10a9038:	0f 85 d4 00 00 00    	jne    10a9112 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270528>
     10a903e:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     10a9043:	e8 e6 c2 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a9048:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a904c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a904f:	48 8d 74 24 3c       	lea    rsi,[rsp+0x3c]
     10a9054:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     10a905a:	84 c0                	test   al,al
     10a905c:	74 10                	je     10a906e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270484>
     10a905e:	48 8d 43 08          	lea    rax,[rbx+0x8]
     10a9062:	0f 57 c0             	xorps  xmm0,xmm0
     10a9065:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     10a9069:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a906c:	eb 72                	jmp    10a90e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2704f6>
     10a906e:	48 8d 44 24 48       	lea    rax,[rsp+0x48]
     10a9073:	0f 57 c0             	xorps  xmm0,xmm0
     10a9076:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a9079:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a907d:	83 7c 24 3c 02       	cmp    DWORD PTR [rsp+0x3c],0x2
     10a9082:	75 2a                	jne    10a90ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2704c4>
     10a9084:	48 8d 35 7b e2 2d ff 	lea    rsi,[rip+0xffffffffff2de27b]        # 387306 <_ZTSSt12bad_any_cast@@Base-0x8ec2>
     10a908b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     10a9090:	e8 e9 09 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a9095:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     10a909a:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     10a909f:	e8 ec 49 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a90a4:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     10a90a9:	e8 e2 4d 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a90ae:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     10a90b3:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     10a90b8:	e8 c7 06 aa ff       	call   b49784 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96724>
     10a90bd:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     10a90c2:	48 89 df             	mov    rdi,rbx
     10a90c5:	4c 89 f6             	mov    rsi,r14
     10a90c8:	e8 6d 06 00 00       	call   10a973a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270b50>
     10a90cd:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     10a90d1:	e8 10 ad a8 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     10a90d6:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     10a90db:	e8 06 ad a8 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     10a90e0:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     10a90e7:	00 
     10a90e8:	e8 41 c2 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a90ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a90f4:	00 00 
     10a90f6:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
     10a90fd:	00 
     10a90fe:	75 2c                	jne    10a912c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270542>
     10a9100:	48 89 d8             	mov    rax,rbx
     10a9103:	48 81 c4 08 01 00 00 	add    rsp,0x108
     10a910a:	5b                   	pop    rbx
     10a910b:	41 5c                	pop    r12
     10a910d:	41 5e                	pop    r14
     10a910f:	41 5f                	pop    r15
     10a9111:	c3                   	ret
     10a9112:	48 8d 43 08          	lea    rax,[rbx+0x8]
     10a9116:	0f 57 c0             	xorps  xmm0,xmm0
     10a9119:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     10a911d:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a9120:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     10a9125:	e8 04 c2 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a912a:	eb b4                	jmp    10a90e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2704f6>
     10a912c:	e8 7f 69 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9131:	48 89 c7             	mov    rdi,rax
     10a9134:	e8 6c 09 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- 0x10a9084: mftplus_pick_and_shuffle_capped

## Slot 0x184c798 -> 0x10a913a
Function: 0x10a913a..0x10a9297
     10a913a:	55                   	push   rbp
     10a913b:	41 57                	push   r15
     10a913d:	41 56                	push   r14
     10a913f:	41 55                	push   r13
     10a9141:	41 54                	push   r12
     10a9143:	53                   	push   rbx
     10a9144:	48 83 ec 58          	sub    rsp,0x58
     10a9148:	49 89 f6             	mov    r14,rsi
     10a914b:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     10a9150:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a9157:	00 00 
     10a9159:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     10a915e:	4c 8d 44 24 18       	lea    r8,[rsp+0x18]
     10a9163:	0f 57 c0             	xorps  xmm0,xmm0
     10a9166:	41 0f 11 00          	movups XMMWORD PTR [r8],xmm0
     10a916a:	4d 89 40 f8          	mov    QWORD PTR [r8-0x8],r8
     10a916e:	4c 8b ae a0 14 00 00 	mov    r13,QWORD PTR [rsi+0x14a0]
     10a9175:	4c 8b be b8 14 00 00 	mov    r15,QWORD PTR [rsi+0x14b8]
     10a917c:	4c 8d a6 a8 14 00 00 	lea    r12,[rsi+0x14a8]
     10a9183:	49 81 c6 c0 14 00 00 	add    r14,0x14c0
     10a918a:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     10a918f:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
     10a9194:	4c 89 44 24 30       	mov    QWORD PTR [rsp+0x30],r8
     10a9199:	4d 39 e5             	cmp    r13,r12
     10a919c:	74 7b                	je     10a9219 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27062f>
     10a919e:	4d 39 f7             	cmp    r15,r14
     10a91a1:	0f 84 89 00 00 00    	je     10a9230 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270646>
     10a91a7:	49 8d 6f 20          	lea    rbp,[r15+0x20]
     10a91ab:	49 8d 5d 20          	lea    rbx,[r13+0x20]
     10a91af:	48 89 ef             	mov    rdi,rbp
     10a91b2:	48 89 de             	mov    rsi,rbx
     10a91b5:	e8 ff 29 a5 ff       	call   afbbb9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x48b59>
     10a91ba:	84 c0                	test   al,al
     10a91bc:	78 34                	js     10a91f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270608>
     10a91be:	48 89 df             	mov    rdi,rbx
     10a91c1:	48 89 ee             	mov    rsi,rbp
     10a91c4:	e8 f0 29 a5 ff       	call   afbbb9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x48b59>
     10a91c9:	84 c0                	test   al,al
     10a91cb:	78 0b                	js     10a91d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2705ee>
     10a91cd:	4c 89 ff             	mov    rdi,r15
     10a91d0:	e8 0d 56 9f ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     10a91d5:	49 89 c7             	mov    r15,rax
     10a91d8:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     10a91dd:	48 89 de             	mov    rsi,rbx
     10a91e0:	e8 7b 06 00 00       	call   10a9860 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270c76>
     10a91e5:	4c 89 ef             	mov    rdi,r13
     10a91e8:	e8 f5 55 9f ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     10a91ed:	49 89 c5             	mov    r13,rax
     10a91f0:	eb 18                	jmp    10a920a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270620>
     10a91f2:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     10a91f7:	48 89 ee             	mov    rsi,rbp
     10a91fa:	e8 61 06 00 00       	call   10a9860 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270c76>
     10a91ff:	4c 89 ff             	mov    rdi,r15
     10a9202:	e8 db 55 9f ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     10a9207:	49 89 c7             	mov    r15,rax
     10a920a:	4d 39 e5             	cmp    r13,r12
     10a920d:	75 8f                	jne    10a919e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2705b4>
     10a920f:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     10a9214:	4c 8b 44 24 30       	mov    r8,QWORD PTR [rsp+0x30]
     10a9219:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     10a921e:	4c 89 fe             	mov    rsi,r15
     10a9221:	4c 89 f2             	mov    rdx,r14
     10a9224:	e8 b2 05 00 00       	call   10a97db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270bf1>
     10a9229:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     10a922e:	eb 1f                	jmp    10a924f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270665>
     10a9230:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     10a9235:	4c 8b 44 24 30       	mov    r8,QWORD PTR [rsp+0x30]
     10a923a:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     10a923f:	4c 89 ee             	mov    rsi,r13
     10a9242:	4c 89 e2             	mov    rdx,r12
     10a9245:	e8 91 05 00 00       	call   10a97db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270bf1>
     10a924a:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     10a924f:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     10a9254:	48 89 df             	mov    rdi,rbx
     10a9257:	e8 5e 04 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a925c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     10a9261:	e8 80 ab a8 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     10a9266:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a926d:	00 00 
     10a926f:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     10a9274:	75 12                	jne    10a9288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27069e>
     10a9276:	48 89 d8             	mov    rax,rbx
     10a9279:	48 83 c4 58          	add    rsp,0x58
     10a927d:	5b                   	pop    rbx
     10a927e:	41 5c                	pop    r12
     10a9280:	41 5d                	pop    r13
     10a9282:	41 5e                	pop    r14
     10a9284:	41 5f                	pop    r15
     10a9286:	5d                   	pop    rbp
     10a9287:	c3                   	ret
     10a9288:	e8 23 68 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a928d:	eb 00                	jmp    10a928f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2706a5>
     10a928f:	48 89 c7             	mov    rdi,rax
     10a9292:	e8 0e 08 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c7a0 -> 0x10a9298
Function: 0x10a9298..0x10a92b5
     10a9298:	53                   	push   rbx
     10a9299:	48 89 fb             	mov    rbx,rdi
     10a929c:	48 81 c6 88 14 00 00 	add    rsi,0x1488
     10a92a3:	e8 12 04 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a92a8:	48 89 d8             	mov    rax,rbx
     10a92ab:	5b                   	pop    rbx
     10a92ac:	c3                   	ret
     10a92ad:	48 89 c7             	mov    rdi,rax
     10a92b0:	e8 f0 07 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c7a8 -> 0x10a92b6
Function: 0x10a92b6..0x10a92d3
     10a92b6:	53                   	push   rbx
     10a92b7:	48 89 fb             	mov    rbx,rdi
     10a92ba:	48 81 c6 60 15 00 00 	add    rsi,0x1560
     10a92c1:	e8 f4 03 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a92c6:	48 89 d8             	mov    rax,rbx
     10a92c9:	5b                   	pop    rbx
     10a92ca:	c3                   	ret
     10a92cb:	48 89 c7             	mov    rdi,rax
     10a92ce:	e8 d2 07 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c7b0 -> 0x10a92d4
Function: 0x10a92d4..0x10a92f1
     10a92d4:	53                   	push   rbx
     10a92d5:	48 89 fb             	mov    rbx,rdi
     10a92d8:	48 81 c6 30 15 00 00 	add    rsi,0x1530
     10a92df:	e8 d6 03 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a92e4:	48 89 d8             	mov    rax,rbx
     10a92e7:	5b                   	pop    rbx
     10a92e8:	c3                   	ret
     10a92e9:	48 89 c7             	mov    rdi,rax
     10a92ec:	e8 b4 07 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c7b8 -> 0x10a92f2
Function: 0x10a92f2..0x10a930f
     10a92f2:	53                   	push   rbx
     10a92f3:	48 89 fb             	mov    rbx,rdi
     10a92f6:	48 81 c6 48 15 00 00 	add    rsi,0x1548
     10a92fd:	e8 b8 03 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a9302:	48 89 d8             	mov    rax,rbx
     10a9305:	5b                   	pop    rbx
     10a9306:	c3                   	ret
     10a9307:	48 89 c7             	mov    rdi,rax
     10a930a:	e8 96 07 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c7c0 -> 0x10a9310
Function: 0x10a9310..0x10a932d
     10a9310:	53                   	push   rbx
     10a9311:	48 89 fb             	mov    rbx,rdi
     10a9314:	48 81 c6 58 14 00 00 	add    rsi,0x1458
     10a931b:	e8 9a 03 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a9320:	48 89 d8             	mov    rax,rbx
     10a9323:	5b                   	pop    rbx
     10a9324:	c3                   	ret
     10a9325:	48 89 c7             	mov    rdi,rax
     10a9328:	e8 78 07 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c7c8 -> 0x10a932e
Function: 0x10a932e..0x10a934b
     10a932e:	53                   	push   rbx
     10a932f:	48 89 fb             	mov    rbx,rdi
     10a9332:	48 81 c6 70 14 00 00 	add    rsi,0x1470
     10a9339:	e8 7c 03 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a933e:	48 89 d8             	mov    rax,rbx
     10a9341:	5b                   	pop    rbx
     10a9342:	c3                   	ret
     10a9343:	48 89 c7             	mov    rdi,rax
     10a9346:	e8 5a 07 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c7d0 -> 0x10a934c
Function: 0x10a934c..0x10a9369
     10a934c:	53                   	push   rbx
     10a934d:	48 89 fb             	mov    rbx,rdi
     10a9350:	48 81 c6 c0 15 00 00 	add    rsi,0x15c0
     10a9357:	e8 5e 03 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a935c:	48 89 d8             	mov    rax,rbx
     10a935f:	5b                   	pop    rbx
     10a9360:	c3                   	ret
     10a9361:	48 89 c7             	mov    rdi,rax
     10a9364:	e8 3c 07 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c7d8 -> 0x10a936a
Function: 0x10a936a..0x10a9387
     10a936a:	53                   	push   rbx
     10a936b:	48 89 fb             	mov    rbx,rdi
     10a936e:	48 81 c6 98 16 00 00 	add    rsi,0x1698
     10a9375:	e8 40 03 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a937a:	48 89 d8             	mov    rax,rbx
     10a937d:	5b                   	pop    rbx
     10a937e:	c3                   	ret
     10a937f:	48 89 c7             	mov    rdi,rax
     10a9382:	e8 1e 07 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c7e0 -> 0x10a9388
Function: 0x10a9388..0x10a93a5
     10a9388:	53                   	push   rbx
     10a9389:	48 89 fb             	mov    rbx,rdi
     10a938c:	48 81 c6 b0 16 00 00 	add    rsi,0x16b0
     10a9393:	e8 22 03 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a9398:	48 89 d8             	mov    rax,rbx
     10a939b:	5b                   	pop    rbx
     10a939c:	c3                   	ret
     10a939d:	48 89 c7             	mov    rdi,rax
     10a93a0:	e8 00 07 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c7e8 -> 0x10a93a6
Function: 0x10a93a6..0x10a93c3
     10a93a6:	53                   	push   rbx
     10a93a7:	48 89 fb             	mov    rbx,rdi
     10a93aa:	48 81 c6 a8 15 00 00 	add    rsi,0x15a8
     10a93b1:	e8 04 03 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a93b6:	48 89 d8             	mov    rax,rbx
     10a93b9:	5b                   	pop    rbx
     10a93ba:	c3                   	ret
     10a93bb:	48 89 c7             	mov    rdi,rax
     10a93be:	e8 e2 06 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c7f0 -> 0x10a93c4
Function: 0x10a93c4..0x10a93dc
     10a93c4:	50                   	push   rax
     10a93c5:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     10a93c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a93cc:	ff 90 f8 00 00 00    	call   QWORD PTR [rax+0xf8]
     10a93d2:	59                   	pop    rcx
     10a93d3:	c3                   	ret
     10a93d4:	48 89 c7             	mov    rdi,rax
     10a93d7:	e8 c9 06 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c7f8 -> 0x10a93dc
Function: 0x10a93dc..0x10a941c
     10a93dc:	41 56                	push   r14
     10a93de:	53                   	push   rbx
     10a93df:	50                   	push   rax
     10a93e0:	b3 01                	mov    bl,0x1
     10a93e2:	80 bf 58 18 00 00 00 	cmp    BYTE PTR [rdi+0x1858],0x0
     10a93e9:	75 1f                	jne    10a940a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270820>
     10a93eb:	49 89 fe             	mov    r14,rdi
     10a93ee:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     10a93f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a93f5:	ff 90 80 01 00 00    	call   QWORD PTR [rax+0x180]
     10a93fb:	84 c0                	test   al,al
     10a93fd:	74 0b                	je     10a940a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270820>
     10a93ff:	41 80 be 59 18 00 00 	cmp    BYTE PTR [r14+0x1859],0x0
     10a9406:	00 
     10a9407:	0f 94 c3             	sete   bl
     10a940a:	89 d8                	mov    eax,ebx
     10a940c:	48 83 c4 08          	add    rsp,0x8
     10a9410:	5b                   	pop    rbx
     10a9411:	41 5e                	pop    r14
     10a9413:	c3                   	ret
     10a9414:	48 89 c7             	mov    rdi,rax
     10a9417:	e8 89 06 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c800 -> 0x10a941c
Function: 0x10a941c..0x10a9436
     10a941c:	50                   	push   rax
     10a941d:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     10a9421:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a9424:	ff 90 80 01 00 00    	call   QWORD PTR [rax+0x180]
     10a942a:	34 01                	xor    al,0x1
     10a942c:	59                   	pop    rcx
     10a942d:	c3                   	ret
     10a942e:	48 89 c7             	mov    rdi,rax
     10a9431:	e8 6f 06 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c808 -> 0x10a9436
Function: 0x10a9436..0x10a9566
     10a9436:	41 57                	push   r15
     10a9438:	41 56                	push   r14
     10a943a:	53                   	push   rbx
     10a943b:	48 81 ec b0 00 00 00 	sub    rsp,0xb0
     10a9442:	49 89 f6             	mov    r14,rsi
     10a9445:	48 89 fb             	mov    rbx,rdi
     10a9448:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a944f:	00 00 
     10a9451:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     10a9458:	00 
     10a9459:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
     10a945e:	41 83 67 38 00       	and    DWORD PTR [r15+0x38],0x0
     10a9463:	0f 57 c0             	xorps  xmm0,xmm0
     10a9466:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     10a946a:	41 0f 29 47 10       	movaps XMMWORD PTR [r15+0x10],xmm0
     10a946f:	41 0f 29 47 20       	movaps XMMWORD PTR [r15+0x20],xmm0
     10a9474:	48 89 d7             	mov    rdi,rdx
     10a9477:	e8 ba 23 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a947c:	4c 89 ff             	mov    rdi,r15
     10a947f:	48 89 c6             	mov    rsi,rax
     10a9482:	e8 b9 bf 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a9487:	84 c0                	test   al,al
     10a9489:	74 1f                	je     10a94aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2708c0>
     10a948b:	8b 84 24 88 00 00 00 	mov    eax,DWORD PTR [rsp+0x88]
     10a9492:	83 f8 64             	cmp    eax,0x64
     10a9495:	74 05                	je     10a949c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2708b2>
     10a9497:	83 f8 04             	cmp    eax,0x4
     10a949a:	75 0e                	jne    10a94aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2708c0>
     10a949c:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a94a0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a94a3:	ff 50 18             	call   QWORD PTR [rax+0x18]
     10a94a6:	84 c0                	test   al,al
     10a94a8:	74 3f                	je     10a94e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2708ff>
     10a94aa:	48 8d 43 08          	lea    rax,[rbx+0x8]
     10a94ae:	0f 57 c0             	xorps  xmm0,xmm0
     10a94b1:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     10a94b5:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a94b8:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     10a94bd:	e8 6c be 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a94c2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a94c9:	00 00 
     10a94cb:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]
     10a94d2:	00 
     10a94d3:	0f 85 80 00 00 00    	jne    10a9559 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27096f>
     10a94d9:	48 89 d8             	mov    rax,rbx
     10a94dc:	48 81 c4 b0 00 00 00 	add    rsp,0xb0
     10a94e3:	5b                   	pop    rbx
     10a94e4:	41 5e                	pop    r14
     10a94e6:	41 5f                	pop    r15
     10a94e8:	c3                   	ret
     10a94e9:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     10a94ee:	0f 57 c0             	xorps  xmm0,xmm0
     10a94f1:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a94f4:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a94f8:	48 8d 35 a7 29 28 ff 	lea    rsi,[rip+0xffffffffff2829a7]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a94ff:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     10a9504:	e8 75 05 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a9509:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     10a950e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     10a9513:	e8 78 45 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a9518:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     10a951d:	e8 6e 49 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a9522:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     10a9527:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
     10a952c:	e8 53 02 aa ff       	call   b49784 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96724>
     10a9531:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     10a9536:	48 89 df             	mov    rdi,rbx
     10a9539:	4c 89 f6             	mov    rsi,r14
     10a953c:	e8 f9 01 00 00       	call   10a973a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270b50>
     10a9541:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     10a9545:	e8 9c a8 a8 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     10a954a:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     10a954f:	e8 92 a8 a8 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     10a9554:	e9 5f ff ff ff       	jmp    10a94b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2708ce>
     10a9559:	e8 52 65 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a955e:	48 89 c7             	mov    rdi,rax
     10a9561:	e8 3f 05 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- 0x10a94f8: mft_disallow

## Slot 0x184c810 -> 0x10a9566
Function: 0x10a9566..0x10a9583
     10a9566:	53                   	push   rbx
     10a9567:	48 89 fb             	mov    rbx,rdi
     10a956a:	48 81 c6 58 17 00 00 	add    rsi,0x1758
     10a9571:	e8 44 01 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a9576:	48 89 d8             	mov    rax,rbx
     10a9579:	5b                   	pop    rbx
     10a957a:	c3                   	ret
     10a957b:	48 89 c7             	mov    rdi,rax
     10a957e:	e8 22 05 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c818 -> 0x10a9584
Function: 0x10a9584..0x10a95a1
     10a9584:	53                   	push   rbx
     10a9585:	48 89 fb             	mov    rbx,rdi
     10a9588:	48 81 c6 78 15 00 00 	add    rsi,0x1578
     10a958f:	e8 26 01 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a9594:	48 89 d8             	mov    rax,rbx
     10a9597:	5b                   	pop    rbx
     10a9598:	c3                   	ret
     10a9599:	48 89 c7             	mov    rdi,rax
     10a959c:	e8 04 05 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c820 -> 0x10a95a2
Function: 0x10a95a2..0x10a95bf
     10a95a2:	53                   	push   rbx
     10a95a3:	48 89 fb             	mov    rbx,rdi
     10a95a6:	48 81 c6 d8 17 00 00 	add    rsi,0x17d8
     10a95ad:	e8 08 01 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a95b2:	48 89 d8             	mov    rax,rbx
     10a95b5:	5b                   	pop    rbx
     10a95b6:	c3                   	ret
     10a95b7:	48 89 c7             	mov    rdi,rax
     10a95ba:	e8 e6 04 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c828 -> 0x10a95c0
Function: 0x10a95c0..0x10a95dd
     10a95c0:	53                   	push   rbx
     10a95c1:	48 89 fb             	mov    rbx,rdi
     10a95c4:	48 81 c6 f0 17 00 00 	add    rsi,0x17f0
     10a95cb:	e8 ea 00 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a95d0:	48 89 d8             	mov    rax,rbx
     10a95d3:	5b                   	pop    rbx
     10a95d4:	c3                   	ret
     10a95d5:	48 89 c7             	mov    rdi,rax
     10a95d8:	e8 c8 04 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c830 -> 0x10a95de
Function: 0x10a95de..0x10a95fb
     10a95de:	53                   	push   rbx
     10a95df:	48 89 fb             	mov    rbx,rdi
     10a95e2:	48 81 c6 08 18 00 00 	add    rsi,0x1808
     10a95e9:	e8 cc 00 00 00       	call   10a96ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ad0>
     10a95ee:	48 89 d8             	mov    rax,rbx
     10a95f1:	5b                   	pop    rbx
     10a95f2:	c3                   	ret
     10a95f3:	48 89 c7             	mov    rdi,rax
     10a95f6:	e8 aa 04 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

Printable strings:
- none

## Slot 0x184c838 -> 0x10a95fc
Function: 0x10a95fc..0x10a9668
     10a95fc:	41 57                	push   r15
     10a95fe:	41 56                	push   r14
     10a9600:	53                   	push   rbx
     10a9601:	48 83 ec 50          	sub    rsp,0x50
     10a9605:	49 89 f6             	mov    r14,rsi
     10a9608:	48 89 fb             	mov    rbx,rdi
     10a960b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a9612:	00 00 
     10a9614:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     10a9619:	49 81 c6 38 10 00 00 	add    r14,0x1038
     10a9620:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     10a9625:	4c 89 ff             	mov    rdi,r15
     10a9628:	48 89 d6             	mov    rsi,rdx
     10a962b:	e8 0a 11 73 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     10a9630:	48 89 df             	mov    rdi,rbx
     10a9633:	4c 89 f6             	mov    rsi,r14
     10a9636:	4c 89 fa             	mov    rdx,r15
     10a9639:	e8 8c 09 73 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     10a963e:	4c 89 ff             	mov    rdi,r15
     10a9641:	e8 a2 11 73 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     10a9646:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a964d:	00 00 
     10a964f:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     10a9654:	75 0d                	jne    10a9663 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a79>
     10a9656:	48 89 d8             	mov    rax,rbx
     10a9659:	48 83 c4 50          	add    rsp,0x50
     10a965d:	5b                   	pop    rbx
     10a965e:	41 5e                	pop    r14
     10a9660:	41 5f                	pop    r15
     10a9662:	c3                   	ret
     10a9663:	e8 48 64 74 00       	call   17efab0 <__stack_chk_fail@plt>

Printable strings:
- none

## Slot 0x184c840 -> 0x10a9668
Function: 0x10a9668..0x10a969c
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret

Printable strings:
- none

## Slot 0x184c858 -> 0x10a969c
Function: 0x10a969c..0x10a96a5
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>

Printable strings:
- none

## Slot 0x184c860 -> 0x10a96a6
Function: 0x10a96a6..0x10a96af
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96aa:	e9 31 f2 ff ff       	jmp    10a88e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fcf6>

Printable strings:
- none

## Slot 0x184c868 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c870 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c878 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c880 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c888 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c890 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c898 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c8a0 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c8a8 -> 0x10a96b0
Function: 0x10a96b0..0x10a96b9
     10a96b0:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96b4:	e9 af ff ff ff       	jmp    10a9668 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a7e>

Printable strings:
- none

## Slot 0x184c8b0 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c8b8 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c8c0 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c8c8 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c8d0 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c8d8 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c8e0 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c8f8 -> 0x9d7de0
Function: 0x9d7de0..0x9d7de1
      9d7de0:	c3                   	ret

Printable strings:
- none

## Slot 0x184c900 -> 0xa50370
Function: 0xa50370..0xa50375
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

Printable strings:
- none

## Direct xrefs to 0x10a9668 and nearby thunk 0x10a96b0

### 0x10a9668
- 0x10a96b4 from 0x10a96b0..0x10a96b9: 10a96b4:	e9 af ff ff ff       	jmp    10a9668 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a7e>

### 0x10a96b0

