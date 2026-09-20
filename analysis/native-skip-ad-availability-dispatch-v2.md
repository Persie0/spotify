# Native skip-ad availability / dispatch trace v2

## Available-signal producer: 0xfd381a..0xfd38d6

/tmp/nskip2/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fd381a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac30>:
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

## Incoming skip-ad discriminator: 0xfd38d6..0xfd39bb

/tmp/nskip2/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fd38d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19acec>:
  fd38d6:	41 57                	push   r15
  fd38d8:	41 56                	push   r14
  fd38da:	41 55                	push   r13
  fd38dc:	41 54                	push   r12
  fd38de:	53                   	push   rbx
  fd38df:	48 83 ec 20          	sub    rsp,0x20
  fd38e3:	49 89 ce             	mov    r14,rcx
  fd38e6:	49 89 d7             	mov    r15,rdx
  fd38e9:	49 89 f4             	mov    r12,rsi
  fd38ec:	48 89 fb             	mov    rbx,rdi
  fd38ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd38f6:	00 00 
  fd38f8:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  fd38fd:	48 89 d7             	mov    rdi,rdx
  fd3900:	e8 31 7f aa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  fd3905:	48 89 d1             	mov    rcx,rdx
  fd3908:	48 8d 3d 7b 37 37 ff 	lea    rdi,[rip+0xffffffffff37377b]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
  fd390f:	6a 07                	push   0x7
  fd3911:	5e                   	pop    rsi
  fd3912:	48 89 c2             	mov    rdx,rax
  fd3915:	e8 66 7f aa ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  fd391a:	84 c0                	test   al,al
  fd391c:	74 12                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd391e:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
  fd3923:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd3926:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  fd392c:	85 c0                	test   eax,eax
  fd392e:	74 4f                	je     fd397f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad95>
  fd3930:	49 83 c4 08          	add    r12,0x8
  fd3934:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
  fd3939:	4c 89 ef             	mov    rdi,r13
  fd393c:	4c 89 e6             	mov    rsi,r12
  fd393f:	4c 89 fa             	mov    rdx,r15
  fd3942:	4c 89 f1             	mov    rcx,r14
  fd3945:	e8 8a 30 00 00       	call   fd69d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ddea>
  fd394a:	48 89 df             	mov    rdi,rbx
  fd394d:	4c 89 ee             	mov    rsi,r13
  fd3950:	e8 7f 2c 00 00       	call   fd65d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9ea>
  fd3955:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fd3959:	e8 28 ab ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd395e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3965:	00 00 
  fd3967:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  fd396c:	75 48                	jne    fd39b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19adcc>
  fd396e:	48 89 d8             	mov    rax,rbx
  fd3971:	48 83 c4 20          	add    rsp,0x20
  fd3975:	5b                   	pop    rbx
  fd3976:	41 5c                	pop    r12
  fd3978:	41 5d                	pop    r13
  fd397a:	41 5e                	pop    r14
  fd397c:	41 5f                	pop    r15
  fd397e:	c3                   	ret
  fd397f:	41 80 7c 24 68 00    	cmp    BYTE PTR [r12+0x68],0x0
  fd3985:	74 a9                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3987:	41 80 7e 60 00       	cmp    BYTE PTR [r14+0x60],0x0
  fd398c:	74 a2                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd398e:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
  fd3992:	49 3b 44 24 58       	cmp    rax,QWORD PTR [r12+0x58]
  fd3997:	7e 97                	jle    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3999:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
  fd399e:	48 39 f0             	cmp    rax,rsi
  fd39a1:	7d 8d                	jge    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd39a3:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
  fd39a8:	48 ff c6             	inc    rsi
  fd39ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd39ae:	ff 50 20             	call   QWORD PTR [rax+0x20]
  fd39b1:	e9 7a ff ff ff       	jmp    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd39b6:	e8 f5 c0 81 00       	call   17efab0 <__stack_chk_fail@plt>

## Secondary skip-ad handler: 0x1204218..0x1204ede

/tmp/nskip2/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001204218 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4979c>:
 1204218:	55                   	push   rbp
 1204219:	41 57                	push   r15
 120421b:	41 56                	push   r14
 120421d:	41 55                	push   r13
 120421f:	41 54                	push   r12
 1204221:	53                   	push   rbx
 1204222:	48 81 ec 78 09 00 00 	sub    rsp,0x978
 1204229:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
 120422e:	49 89 f6             	mov    r14,rsi
 1204231:	49 89 fd             	mov    r13,rdi
 1204234:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 120423b:	00 00 
 120423d:	48 89 84 24 70 09 00 	mov    QWORD PTR [rsp+0x970],rax
 1204244:	00 
 1204245:	48 81 c7 98 05 00 00 	add    rdi,0x598
 120424c:	45 8a bd 08 0a 00 00 	mov    r15b,BYTE PTR [r13+0xa08]
 1204253:	45 84 ff             	test   r15b,r15b
 1204256:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
 120425b:	74 24                	je     1204281 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49805>
 120425d:	e8 d4 75 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1204262:	48 89 c3             	mov    rbx,rax
 1204265:	49 89 d4             	mov    r12,rdx
 1204268:	4c 89 ed             	mov    rbp,r13
 120426b:	49 8d bd b0 05 00 00 	lea    rdi,[r13+0x5b0]
 1204272:	e8 bf 75 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1204277:	49 89 c5             	mov    r13,rax
 120427a:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
 120427f:	eb 12                	jmp    1204293 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49817>
 1204281:	4c 89 ed             	mov    rbp,r13
 1204284:	31 db                	xor    ebx,ebx
 1204286:	45 31 e4             	xor    r12d,r12d
 1204289:	31 c0                	xor    eax,eax
 120428b:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 1204290:	45 31 ed             	xor    r13d,r13d
 1204293:	48 8d 35 87 34 18 ff 	lea    rsi,[rip+0xffffffffff183487]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
 120429a:	4c 89 f7             	mov    rdi,r14
 120429d:	e8 ad 75 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12042a2:	84 c0                	test   al,al
 12042a4:	74 67                	je     120430d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49891>
 12042a6:	48 8b 55 60          	mov    rdx,QWORD PTR [rbp+0x60]
 12042aa:	48 89 df             	mov    rdi,rbx
 12042ad:	4c 89 e6             	mov    rsi,r12
 12042b0:	e8 ed 21 00 00       	call   12064a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ba26>
 12042b5:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
 12042b9:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
 12042bc:	0f b6 c0             	movzx  eax,al
 12042bf:	6a 01                	push   0x1
 12042c1:	5e                   	pop    rsi
 12042c2:	4c 89 ea             	mov    rdx,r13
 12042c5:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 12042ca:	41 ff 54 c0 38       	call   QWORD PTR [r8+rax*8+0x38]
 12042cf:	e8 f3 65 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 12042d4:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 12042db:	00 
 12042dc:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 12042e0:	48 8d 0d 69 eb 77 00 	lea    rcx,[rip+0x77eb69]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 12042e7:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 12042eb:	0f 57 c0             	xorps  xmm0,xmm0
 12042ee:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 12042f1:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 12042f5:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 12042fa:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 12042fe:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 1204305:	00 
 1204306:	e8 85 9a 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 120430b:	eb 7c                	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
 120430d:	48 8d 35 2e 34 18 ff 	lea    rsi,[rip+0xffffffffff18342e]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 1204314:	4c 89 f7             	mov    rdi,r14
 1204317:	e8 33 75 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 120431c:	84 c0                	test   al,al
 120431e:	0f 84 9b 00 00 00    	je     12043bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49943>
 1204324:	48 8b 55 60          	mov    rdx,QWORD PTR [rbp+0x60]
 1204328:	48 89 df             	mov    rdi,rbx
 120432b:	4c 89 e6             	mov    rsi,r12
 120432e:	e8 6f 21 00 00       	call   12064a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ba26>
 1204333:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
 1204337:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
 120433a:	0f b6 c0             	movzx  eax,al
 120433d:	6a 02                	push   0x2
 120433f:	5e                   	pop    rsi
 1204340:	4c 89 ea             	mov    rdx,r13
 1204343:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 1204348:	41 ff 54 c0 38       	call   QWORD PTR [r8+rax*8+0x38]
 120434d:	e8 75 65 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 1204352:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 1204359:	00 
 120435a:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 120435e:	48 8d 0d eb ea 77 00 	lea    rcx,[rip+0x77eaeb]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 1204365:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1204369:	0f 57 c0             	xorps  xmm0,xmm0
 120436c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 120436f:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 1204373:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204378:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 120437c:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 1204383:	00 
 1204384:	e8 07 9a 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204389:	48 8b bc 24 f8 04 00 	mov    rdi,QWORD PTR [rsp+0x4f8]
 1204390:	00 
 1204391:	e8 08 a4 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 1204396:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 120439d:	00 00 
 120439f:	48 3b 84 24 70 09 00 	cmp    rax,QWORD PTR [rsp+0x970]
 12043a6:	00 
 12043a7:	0f 85 2c 0b 00 00    	jne    1204ed9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a45d>
 12043ad:	48 81 c4 78 09 00 00 	add    rsp,0x978
 12043b4:	5b                   	pop    rbx
 12043b5:	41 5c                	pop    r12
 12043b7:	41 5d                	pop    r13
 12043b9:	41 5e                	pop    r14
 12043bb:	41 5f                	pop    r15
 12043bd:	5d                   	pop    rbp
 12043be:	c3                   	ret
 12043bf:	48 8d 35 b7 7a 12 ff 	lea    rsi,[rip+0xffffffffff127ab7]        # 32be7d <_ZTSSt12bad_any_cast@@Base-0x6434b>
 12043c6:	4c 89 f7             	mov    rdi,r14
 12043c9:	e8 81 74 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12043ce:	84 c0                	test   al,al
 12043d0:	4c 89 f3             	mov    rbx,r14
 12043d3:	0f 84 ff 00 00 00    	je     12044d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49a5c>
 12043d9:	45 84 ff             	test   r15b,r15b
 12043dc:	0f 84 f6 00 00 00    	je     12044d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49a5c>
 12043e2:	4c 8b ad e8 11 00 00 	mov    r13,QWORD PTR [rbp+0x11e8]
 12043e9:	4c 8d a4 24 e8 04 00 	lea    r12,[rsp+0x4e8]
 12043f0:	00 
 12043f1:	49 89 ee             	mov    r14,rbp
 12043f4:	49 89 6c 24 f8       	mov    QWORD PTR [r12-0x8],rbp
 12043f9:	4c 89 e7             	mov    rdi,r12
 12043fc:	48 89 de             	mov    rsi,rbx
 12043ff:	e8 86 37 46 00       	call   1667b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bcf6>
 1204404:	48 8d 9c 24 d0 05 00 	lea    rbx,[rsp+0x5d0]
 120440b:	00 
 120440c:	48 89 df             	mov    rdi,rbx
 120440f:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
 1204414:	e8 77 5e 87 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 1204419:	48 83 a4 24 50 09 00 	and    QWORD PTR [rsp+0x950],0x0
 1204420:	00 00 
 1204422:	48 83 a4 24 60 09 00 	and    QWORD PTR [rsp+0x960],0x0
 1204429:	00 00 
 120442b:	bf 20 01 00 00       	mov    edi,0x120
 1204430:	e8 cb 9a 5e 00       	call   17edf00 <_Znwm@plt>
 1204435:	49 89 c7             	mov    r15,rax
 1204438:	48 8b 84 24 e0 04 00 	mov    rax,QWORD PTR [rsp+0x4e0]
 120443f:	00 
 1204440:	49 89 07             	mov    QWORD PTR [r15],rax
 1204443:	49 8d 6f 08          	lea    rbp,[r15+0x8]
 1204447:	48 89 ef             	mov    rdi,rbp
 120444a:	4c 89 e6             	mov    rsi,r12
 120444d:	e8 ca 36 46 00       	call   1667b1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bc88>
 1204452:	4c 89 ff             	mov    rdi,r15
 1204455:	48 81 c7 f0 00 00 00 	add    rdi,0xf0
 120445c:	48 89 de             	mov    rsi,rbx
 120445f:	e8 2c 5e 87 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 1204464:	48 8d 8c 24 50 09 00 	lea    rcx,[rsp+0x950]
 120446b:	00 
 120446c:	4c 89 39             	mov    QWORD PTR [rcx],r15
 120446f:	48 8d 05 ea 20 00 00 	lea    rax,[rip+0x20ea]        # 1206560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bae4>
 1204476:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 120447a:	48 8d 05 09 21 00 00 	lea    rax,[rip+0x2109]        # 120658a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bb0e>
 1204481:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 1204485:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 1204489:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 120448e:	4c 89 ee             	mov    rsi,r13
 1204491:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
 1204496:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1204499:	49 81 c6 f0 11 00 00 	add    r14,0x11f0
 12044a0:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
 12044a5:	4c 89 f7             	mov    rdi,r14
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
 120456f:	00 
 1204570:	e8 ed f9 cc ff       	call   ed3f62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9b378>
 1204575:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 1204579:	0f 84 41 03 00 00    	je     12048c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49e44>
 120457f:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
 1204586:	00 
 1204587:	e8 aa 72 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 120458c:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204593:	00 
 1204594:	48 89 c6             	mov    rsi,rax
 1204597:	e8 b6 b2 57 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 120459c:	84 c0                	test   al,al
 120459e:	0f 84 1c 03 00 00    	je     12048c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49e44>
 12045a4:	80 bd 08 0a 00 00 00 	cmp    BYTE PTR [rbp+0xa08],0x0
 12045ab:	0f 84 a4 02 00 00    	je     1204855 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49dd9>
 12045b1:	48 8d b5 b0 05 00 00 	lea    rsi,[rbp+0x5b0]
 12045b8:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 12045bd:	e8 7e 99 5e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 12045c2:	e9 9f 02 00 00       	jmp    1204866 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49dea>
 12045c7:	48 8d 35 c6 63 17 ff 	lea    rsi,[rip+0xffffffffff1763c6]        # 37a994 <_ZTSSt12bad_any_cast@@Base-0x15834>
 12045ce:	48 89 df             	mov    rdi,rbx
 12045d1:	e8 79 72 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12045d6:	84 c0                	test   al,al
 12045d8:	0f 84 88 00 00 00    	je     1204666 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49bea>
 12045de:	49 89 de             	mov    r14,rbx
 12045e1:	48 8b 9d d0 11 00 00 	mov    rbx,QWORD PTR [rbp+0x11d0]
 12045e8:	49 8d 7e 18          	lea    rdi,[r14+0x18]
 12045ec:	48 8d 35 2d d6 24 ff 	lea    rsi,[rip+0xffffffffff24d62d]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
 12045f3:	e8 57 72 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12045f8:	4c 89 f7             	mov    rdi,r14
 12045fb:	89 c5                	mov    ebp,eax
 12045fd:	48 83 c7 48          	add    rdi,0x48
 1204601:	e8 aa 71 0f 00       	call   12fb7b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140d34>
 1204606:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 120460d:	00 
 120460e:	49 89 06             	mov    QWORD PTR [r14],rax
 1204611:	41 88 56 08          	mov    BYTE PTR [r14+0x8],dl
 1204615:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1204618:	40 0f b6 f5          	movzx  esi,bpl
 120461c:	48 89 df             	mov    rdi,rbx
 120461f:	4c 89 f2             	mov    rdx,r14
 1204622:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1204625:	e8 9d 62 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 120462a:	41 83 26 00          	and    DWORD PTR [r14],0x0
 120462e:	48 8d 05 1b e8 77 00 	lea    rax,[rip+0x77e81b]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 1204635:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 1204639:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 1204640:	00 
 1204641:	0f 57 c0             	xorps  xmm0,xmm0
 1204644:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 1204647:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 120464b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204650:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 1204654:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 120465b:	00 
 120465c:	e8 2f 97 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204661:	e9 23 fd ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
 1204666:	48 8d 35 2c 31 18 ff 	lea    rsi,[rip+0xffffffffff18312c]        # 387799 <_ZTSSt12bad_any_cast@@Base-0x8a2f>
 120466d:	48 89 df             	mov    rdi,rbx
 1204670:	e8 da 71 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 1204675:	84 c0                	test   al,al
 1204677:	0f 84 b2 00 00 00    	je     120472f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49cb3>
 120467d:	49 89 de             	mov    r14,rbx
 1204680:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 1204684:	e8 ad 71 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1204689:	48 8d 9c 24 c0 04 00 	lea    rbx,[rsp+0x4c0]
 1204690:	00 
 1204691:	48 89 df             	mov    rdi,rbx
 1204694:	48 89 c6             	mov    rsi,rax
 1204697:	e8 c9 21 00 00       	call   1206865 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bde9>
 120469c:	0f 57 c0             	xorps  xmm0,xmm0
 120469f:	0f 11 84 24 e8 04 00 	movups XMMWORD PTR [rsp+0x4e8],xmm0
 12046a6:	00 
 12046a7:	48 8d 05 82 a7 65 00 	lea    rax,[rip+0x65a782]        # 185ee30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b518>
 12046ae:	48 89 84 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],rax
 12046b5:	00 
 12046b6:	48 8d 05 3b b1 23 ff 	lea    rax,[rip+0xffffffffff23b13b]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 12046bd:	48 89 84 24 f8 04 00 	mov    QWORD PTR [rsp+0x4f8],rax
 12046c4:	00 
 12046c5:	48 89 84 24 00 05 00 	mov    QWORD PTR [rsp+0x500],rax
 12046cc:	00 
 12046cd:	0f 11 84 24 08 05 00 	movups XMMWORD PTR [rsp+0x508],xmm0
 12046d4:	00 
 12046d5:	0f 11 84 24 18 05 00 	movups XMMWORD PTR [rsp+0x518],xmm0
 12046dc:	00 
 12046dd:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 12046e1:	0f 84 9d 04 00 00    	je     1204b84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a108>
 12046e7:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
 12046ee:	00 
 12046ef:	e8 42 71 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 12046f4:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 12046fb:	00 
 12046fc:	48 89 c6             	mov    rsi,rax
 12046ff:	e8 4e b1 57 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 1204704:	84 c0                	test   al,al
 1204706:	0f 84 78 04 00 00    	je     1204b84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a108>
 120470c:	80 bd 08 0a 00 00 00 	cmp    BYTE PTR [rbp+0xa08],0x0
 1204713:	0f 84 00 04 00 00    	je     1204b19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a09d>
 1204719:	48 8d b5 b0 05 00 00 	lea    rsi,[rbp+0x5b0]
 1204720:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1204725:	e8 16 98 5e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 120472a:	e9 fb 03 00 00       	jmp    1204b2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a0ae>
 120472f:	48 8d 35 34 77 12 ff 	lea    rsi,[rip+0xffffffffff127734]        # 32be6a <_ZTSSt12bad_any_cast@@Base-0x6435e>
 1204736:	48 89 df             	mov    rdi,rbx
 1204739:	e8 11 71 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 120473e:	84 c0                	test   al,al
 1204740:	0f 84 88 00 00 00    	je     12047ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49d52>
 1204746:	49 89 de             	mov    r14,rbx
 1204749:	48 8b 9d d8 11 00 00 	mov    rbx,QWORD PTR [rbp+0x11d8]
 1204750:	49 8d 7e 18          	lea    rdi,[r14+0x18]
 1204754:	48 8d 35 c5 d4 24 ff 	lea    rsi,[rip+0xffffffffff24d4c5]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
 120475b:	e8 ef 70 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 1204760:	4c 89 f7             	mov    rdi,r14
 1204763:	89 c5                	mov    ebp,eax
 1204765:	48 83 c7 48          	add    rdi,0x48
 1204769:	e8 42 70 0f 00       	call   12fb7b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140d34>
 120476e:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 1204775:	00 
 1204776:	49 89 06             	mov    QWORD PTR [r14],rax
 1204779:	41 88 56 08          	mov    BYTE PTR [r14+0x8],dl
 120477d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1204780:	40 0f b6 f5          	movzx  esi,bpl
 1204784:	48 89 df             	mov    rdi,rbx
 1204787:	4c 89 f2             	mov    rdx,r14
 120478a:	ff 50 18             	call   QWORD PTR [rax+0x18]
 120478d:	e8 35 61 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 1204792:	41 83 26 00          	and    DWORD PTR [r14],0x0
 1204796:	48 8d 05 b3 e6 77 00 	lea    rax,[rip+0x77e6b3]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 120479d:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 12047a1:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 12047a8:	00 
 12047a9:	0f 57 c0             	xorps  xmm0,xmm0
 12047ac:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 12047af:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 12047b3:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 12047b8:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 12047bc:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 12047c3:	00 
 12047c4:	e8 c7 95 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 12047c9:	e9 bb fb ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
 12047ce:	48 8d 35 41 22 15 ff 	lea    rsi,[rip+0xffffffffff152241]        # 356a16 <_ZTSSt12bad_any_cast@@Base-0x397b2>
 12047d5:	48 89 df             	mov    rdi,rbx
 12047d8:	e8 72 70 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12047dd:	84 c0                	test   al,al
 12047df:	0f 84 3a 01 00 00    	je     120491f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49ea3>
 12047e5:	48 8b 7d 50          	mov    rdi,QWORD PTR [rbp+0x50]
 12047e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12047ec:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
 12047f2:	84 c0                	test   al,al
 12047f4:	74 1e                	je     1204814 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49d98>
 12047f6:	48 8b bd e0 11 00 00 	mov    rdi,QWORD PTR [rbp+0x11e0]
 12047fd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1204800:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1204803:	84 c0                	test   al,al
 1204805:	74 0d                	je     1204814 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49d98>
 1204807:	48 8b bd e0 11 00 00 	mov    rdi,QWORD PTR [rbp+0x11e0]
 120480e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1204811:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1204814:	e8 ae 60 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 1204819:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 1204820:	00 
 1204821:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 1204825:	48 8d 0d 24 e6 77 00 	lea    rcx,[rip+0x77e624]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 120482c:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1204830:	0f 57 c0             	xorps  xmm0,xmm0
 1204833:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 1204836:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 120483a:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 120483f:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 1204843:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 120484a:	00 
 120484b:	e8 40 95 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204850:	e9 34 fb ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
 1204855:	48 8d 35 20 d7 24 ff 	lea    rsi,[rip+0xffffffffff24d720]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 120485c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1204861:	e8 18 52 87 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1204866:	48 8b 9d d0 11 00 00 	mov    rbx,QWORD PTR [rbp+0x11d0]
 120486d:	80 bd 68 0a 00 00 00 	cmp    BYTE PTR [rbp+0xa68],0x0
 1204874:	74 09                	je     120487f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49e03>
 1204876:	4c 8b bd 60 0a 00 00 	mov    r15,QWORD PTR [rbp+0xa60]
 120487d:	eb 03                	jmp    1204882 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49e06>
 120487f:	45 31 ff             	xor    r15d,r15d
 1204882:	4c 89 f7             	mov    rdi,r14
 1204885:	48 83 c7 48          	add    rdi,0x48
 1204889:	e8 22 6f 0f 00       	call   12fb7b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140d34>
 120488e:	4c 8d 84 24 b0 04 00 	lea    r8,[rsp+0x4b0]
 1204895:	00 
 1204896:	49 89 00             	mov    QWORD PTR [r8],rax
 1204899:	41 88 50 08          	mov    BYTE PTR [r8+0x8],dl
 120489d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 12048a0:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 12048a7:	00 
 12048a8:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
 12048ad:	48 89 df             	mov    rdi,rbx
 12048b0:	4c 89 f9             	mov    rcx,r15
 12048b3:	ff 50 10             	call   QWORD PTR [rax+0x10]
 12048b6:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 12048bb:	e8 d0 95 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12048c0:	e8 02 60 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 12048c5:	48 8d 44 24 58       	lea    rax,[rsp+0x58]
 12048ca:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 12048ce:	48 8d 0d 7b e5 77 00 	lea    rcx,[rip+0x77e57b]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 12048d5:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 12048d9:	0f 57 c0             	xorps  xmm0,xmm0
 12048dc:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 12048df:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 12048e3:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 12048e8:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 12048ec:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
 12048f1:	e8 9a 94 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 12048f6:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 12048fb:	e8 9e 9e 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 1204900:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204907:	00 
 1204908:	e8 0d 8d 3a 00       	call   15ad61a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f2b9e>
 120490d:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
 1204914:	00 
 1204915:	e8 16 24 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 120491a:	e9 77 fa ff ff       	jmp    1204396 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4991a>
 120491f:	48 8d 35 8d a8 12 ff 	lea    rsi,[rip+0xffffffffff12a88d]        # 32f1b3 <_ZTSSt12bad_any_cast@@Base-0x61015>
 1204926:	48 89 df             	mov    rdi,rbx
 1204929:	e8 21 6f 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 120492e:	84 c0                	test   al,al
 1204930:	0f 84 fb 00 00 00    	je     1204a31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49fb5>
 1204936:	49 89 de             	mov    r14,rbx
 1204939:	48 8d 9c 24 c0 04 00 	lea    rbx,[rsp+0x4c0]
 1204940:	00 
 1204941:	48 89 df             	mov    rdi,rbx
 1204944:	48 89 ee             	mov    rsi,rbp
 1204947:	e8 b8 1f 00 00       	call   1206904 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4be88>
 120494c:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
 120494f:	48 85 db             	test   rbx,rbx
 1204952:	0f 84 8b 00 00 00    	je     12049e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49f67>
 1204958:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
 120495d:	4c 89 e7             	mov    rdi,r12
 1204960:	e8 03 49 47 00       	call   1679268 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d3d4>
 1204965:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 120496c:	00 
 120496d:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 1204972:	4c 89 e2             	mov    rdx,r12
 1204975:	e8 40 71 e5 ff       	call   105baba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222ed0>
 120497a:	48 8d 94 24 f8 04 00 	lea    rdx,[rsp+0x4f8]
 1204981:	00 
 1204982:	48 89 df             	mov    rdi,rbx
 1204985:	4c 89 f6             	mov    rsi,r14
 1204988:	e8 2a 20 00 00       	call   12069b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bf3b>
 120498d:	89 c3                	mov    ebx,eax
 120498f:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204996:	00 
 1204997:	e8 cc 4a 47 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
 120499c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 12049a1:	e8 c2 4a 47 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
 12049a6:	84 db                	test   bl,bl
 12049a8:	74 39                	je     12049e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49f67>
 12049aa:	48 8b 5d 08          	mov    rbx,QWORD PTR [rbp+0x8]
 12049ae:	49 83 c6 48          	add    r14,0x48
 12049b2:	4c 89 f7             	mov    rdi,r14
 12049b5:	e8 f6 6d 0f 00       	call   12fb7b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140d34>
 12049ba:	48 8d 8c 24 e0 04 00 	lea    rcx,[rsp+0x4e0]
 12049c1:	00 
 12049c2:	48 89 01             	mov    QWORD PTR [rcx],rax
 12049c5:	88 51 08             	mov    BYTE PTR [rcx+0x8],dl
 12049c8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 12049cb:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 12049d0:	48 89 de             	mov    rsi,rbx
 12049d3:	48 89 ca             	mov    rdx,rcx
 12049d6:	ff 50 48             	call   QWORD PTR [rax+0x48]
 12049d9:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
 12049de:	e8 03 f4 92 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
 12049e3:	48 8b bc 24 c8 04 00 	mov    rdi,QWORD PTR [rsp+0x4c8]
 12049ea:	00 
 12049eb:	e8 96 9a 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 12049f0:	e8 d2 5e 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 12049f5:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 12049fc:	00 
 12049fd:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 1204a01:	48 8d 0d 48 e4 77 00 	lea    rcx,[rip+0x77e448]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 1204a08:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1204a0c:	0f 57 c0             	xorps  xmm0,xmm0
 1204a0f:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 1204a12:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 1204a16:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204a1b:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 1204a1f:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 1204a26:	00 
 1204a27:	e8 64 93 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204a2c:	e9 58 f9 ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
 1204a31:	48 8d 35 96 b9 14 ff 	lea    rsi,[rip+0xffffffffff14b996]        # 3503ce <_ZTSSt12bad_any_cast@@Base-0x3fdfa>
 1204a38:	48 89 df             	mov    rdi,rbx
 1204a3b:	e8 0f 6e 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 1204a40:	84 c0                	test   al,al
 1204a42:	75 17                	jne    1204a5b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49fdf>
 1204a44:	48 8d 35 a5 66 1d ff 	lea    rsi,[rip+0xffffffffff1d66a5]        # 3db0f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0xb3f>
 1204a4b:	48 89 df             	mov    rdi,rbx
 1204a4e:	e8 fc 6d 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 1204a53:	84 c0                	test   al,al
 1204a55:	0f 84 bf 01 00 00    	je     1204c1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a19e>
 1204a5b:	49 89 de             	mov    r14,rbx
 1204a5e:	48 8d 9c 24 c0 04 00 	lea    rbx,[rsp+0x4c0]
 1204a65:	00 
 1204a66:	48 89 df             	mov    rdi,rbx
 1204a69:	48 89 ee             	mov    rsi,rbp
 1204a6c:	e8 93 1e 00 00       	call   1206904 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4be88>
 1204a71:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1204a74:	48 85 ff             	test   rdi,rdi
 1204a77:	0f 84 59 01 00 00    	je     1204bd6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a15a>
 1204a7d:	4c 89 f6             	mov    rsi,r14
 1204a80:	e8 68 20 00 00       	call   1206aed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c071>
 1204a85:	84 c0                	test   al,al
 1204a87:	75 5e                	jne    1204ae7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a06b>
 1204a89:	48 8b 9c 24 c0 04 00 	mov    rbx,QWORD PTR [rsp+0x4c0]
 1204a90:	00 
 1204a91:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
 1204a96:	4c 89 e7             	mov    rdi,r12
 1204a99:	e8 ca 47 47 00       	call   1679268 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d3d4>
 1204a9e:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204aa5:	00 
 1204aa6:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 1204aab:	4c 89 e2             	mov    rdx,r12
 1204aae:	e8 07 70 e5 ff       	call   105baba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222ed0>
 1204ab3:	48 8d 94 24 f8 04 00 	lea    rdx,[rsp+0x4f8]
 1204aba:	00 
 1204abb:	48 89 df             	mov    rdi,rbx
 1204abe:	4c 89 f6             	mov    rsi,r14
 1204ac1:	e8 f1 1e 00 00       	call   12069b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bf3b>
 1204ac6:	89 c3                	mov    ebx,eax
 1204ac8:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204acf:	00 
 1204ad0:	e8 93 49 47 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
 1204ad5:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1204ada:	e8 89 49 47 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
 1204adf:	84 db                	test   bl,bl
 1204ae1:	0f 84 ef 00 00 00    	je     1204bd6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a15a>
 1204ae7:	80 bd 81 0a 00 00 00 	cmp    BYTE PTR [rbp+0xa81],0x0
 1204aee:	0f 84 3c 02 00 00    	je     1204d30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a2b4>
 1204af4:	48 8d b5 70 1f 00 00 	lea    rsi,[rbp+0x1f70]
 1204afb:	48 8d bd a0 1f 00 00 	lea    rdi,[rbp+0x1fa0]
 1204b02:	80 bd d0 1f 00 00 00 	cmp    BYTE PTR [rbp+0x1fd0],0x0
 1204b09:	0f 84 15 02 00 00    	je     1204d24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a2a8>
 1204b0f:	e8 64 7c e8 ff       	call   108c778 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b8e>
 1204b14:	e9 17 02 00 00       	jmp    1204d30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a2b4>
 1204b19:	48 8d 35 5c d4 24 ff 	lea    rsi,[rip+0xffffffffff24d45c]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 1204b20:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1204b25:	e8 54 4f 87 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1204b2a:	48 8b 9d d8 11 00 00 	mov    rbx,QWORD PTR [rbp+0x11d8]
 1204b31:	80 bd 68 0a 00 00 00 	cmp    BYTE PTR [rbp+0xa68],0x0
 1204b38:	74 09                	je     1204b43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a0c7>
 1204b3a:	4c 8b bd 60 0a 00 00 	mov    r15,QWORD PTR [rbp+0xa60]
 1204b41:	eb 03                	jmp    1204b46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a0ca>
 1204b43:	45 31 ff             	xor    r15d,r15d
 1204b46:	4c 89 f7             	mov    rdi,r14
 1204b49:	48 83 c7 48          	add    rdi,0x48
 1204b4d:	e8 5e 6c 0f 00       	call   12fb7b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140d34>
 1204b52:	4c 8d 84 24 b0 04 00 	lea    r8,[rsp+0x4b0]
 1204b59:	00 
 1204b5a:	49 89 00             	mov    QWORD PTR [r8],rax
 1204b5d:	41 88 50 08          	mov    BYTE PTR [r8+0x8],dl
 1204b61:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1204b64:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 1204b6b:	00 
 1204b6c:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
 1204b71:	48 89 df             	mov    rdi,rbx
 1204b74:	4c 89 f9             	mov    rcx,r15
 1204b77:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1204b7a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1204b7f:	e8 0c 93 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1204b84:	e8 3e 5d 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 1204b89:	48 8d 44 24 58       	lea    rax,[rsp+0x58]
 1204b8e:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 1204b92:	48 8d 0d b7 e2 77 00 	lea    rcx,[rip+0x77e2b7]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 1204b99:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1204b9d:	0f 57 c0             	xorps  xmm0,xmm0
 1204ba0:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 1204ba3:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 1204ba7:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204bac:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 1204bb0:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
 1204bb5:	e8 d6 91 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204bba:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 1204bbf:	e8 da 9b 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 1204bc4:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204bcb:	00 
 1204bcc:	e8 13 9e 8b ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
 1204bd1:	e9 37 fd ff ff       	jmp    120490d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49e91>
 1204bd6:	e8 ec 5c 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 1204bdb:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 1204be2:	00 
 1204be3:	c7 40 e8 14 00 00 00 	mov    DWORD PTR [rax-0x18],0x14
 1204bea:	48 8d 0d 5f e2 77 00 	lea    rcx,[rip+0x77e25f]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 1204bf1:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1204bf5:	0f 57 c0             	xorps  xmm0,xmm0
 1204bf8:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 1204bfb:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 1204bff:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204c04:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 1204c08:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 1204c0f:	00 
 1204c10:	e8 7b 91 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204c15:	e9 52 01 00 00       	jmp    1204d6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a2f0>
 1204c1a:	49 89 de             	mov    r14,rbx
 1204c1d:	48 8d 9c 24 c0 04 00 	lea    rbx,[rsp+0x4c0]
 1204c24:	00 
 1204c25:	48 89 df             	mov    rdi,rbx
 1204c28:	48 89 ee             	mov    rsi,rbp
 1204c2b:	e8 d4 1c 00 00       	call   1206904 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4be88>
 1204c30:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1204c33:	48 85 ff             	test   rdi,rdi
 1204c36:	0f 84 a7 00 00 00    	je     1204ce3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a267>
 1204c3c:	4c 89 f6             	mov    rsi,r14
 1204c3f:	e8 a9 1e 00 00       	call   1206aed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c071>
 1204c44:	84 c0                	test   al,al
 1204c46:	75 5a                	jne    1204ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a226>
 1204c48:	48 8b 9c 24 c0 04 00 	mov    rbx,QWORD PTR [rsp+0x4c0]
 1204c4f:	00 
 1204c50:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
 1204c55:	4c 89 ff             	mov    rdi,r15
 1204c58:	e8 0b 46 47 00       	call   1679268 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d3d4>
 1204c5d:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204c64:	00 
 1204c65:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 1204c6a:	4c 89 fa             	mov    rdx,r15
 1204c6d:	e8 48 6e e5 ff       	call   105baba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222ed0>
 1204c72:	48 8d 94 24 f8 04 00 	lea    rdx,[rsp+0x4f8]
 1204c79:	00 
 1204c7a:	48 89 df             	mov    rdi,rbx
 1204c7d:	4c 89 f6             	mov    rsi,r14
 1204c80:	e8 32 1d 00 00       	call   12069b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bf3b>
 1204c85:	89 c3                	mov    ebx,eax
 1204c87:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204c8e:	00 
 1204c8f:	e8 d4 47 47 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
 1204c94:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1204c99:	e8 ca 47 47 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
 1204c9e:	84 db                	test   bl,bl
 1204ca0:	74 41                	je     1204ce3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a267>
 1204ca2:	e8 20 5c 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 1204ca7:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 1204cae:	00 
 1204caf:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 1204cb3:	48 8d 0d 96 e1 77 00 	lea    rcx,[rip+0x77e196]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 1204cba:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1204cbe:	0f 57 c0             	xorps  xmm0,xmm0
 1204cc1:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 1204cc4:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 1204cc8:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204ccd:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 1204cd1:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 1204cd8:	00 
 1204cd9:	e8 b2 90 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204cde:	e9 89 00 00 00       	jmp    1204d6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a2f0>
 1204ce3:	e8 df 5b 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 1204ce8:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 1204cef:	00 
 1204cf0:	c7 40 e8 14 00 00 00 	mov    DWORD PTR [rax-0x18],0x14
 1204cf7:	48 8d 0d 52 e1 77 00 	lea    rcx,[rip+0x77e152]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 1204cfe:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1204d02:	0f 57 c0             	xorps  xmm0,xmm0
 1204d05:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 1204d08:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 1204d0c:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204d11:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 1204d15:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 1204d1c:	00 
 1204d1d:	e8 6e 90 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204d22:	eb 48                	jmp    1204d6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a2f0>
 1204d24:	e8 89 1e 00 00       	call   1206bb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c136>
 1204d29:	c6 85 d0 1f 00 00 01 	mov    BYTE PTR [rbp+0x1fd0],0x1
 1204d30:	e8 92 5b 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 1204d35:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 1204d3c:	00 
 1204d3d:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 1204d41:	48 8d 0d 08 e1 77 00 	lea    rcx,[rip+0x77e108]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 1204d48:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1204d4c:	0f 57 c0             	xorps  xmm0,xmm0
 1204d4f:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 1204d52:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 1204d56:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204d5b:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 1204d5f:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 1204d66:	00 
 1204d67:	e8 24 90 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204d6c:	48 8b bc 24 f8 04 00 	mov    rdi,QWORD PTR [rsp+0x4f8]
 1204d73:	00 
 1204d74:	e8 25 9a 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 1204d79:	48 8b bc 24 c8 04 00 	mov    rdi,QWORD PTR [rsp+0x4c8]
 1204d80:	00 
 1204d81:	e8 00 97 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1204d86:	e9 0b f6 ff ff       	jmp    1204396 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4991a>
 1204d8b:	eb 22                	jmp    1204daf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a333>
 1204d8d:	eb 32                	jmp    1204dc1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a345>
 1204d8f:	eb 0c                	jmp    1204d9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a321>
 1204d91:	eb 0a                	jmp    1204d9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a321>
 1204d93:	eb 3b                	jmp    1204dd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a354>
 1204d95:	eb 18                	jmp    1204daf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a333>
 1204d97:	eb 28                	jmp    1204dc1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a345>
 1204d99:	eb 35                	jmp    1204dd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a354>
 1204d9b:	eb 00                	jmp    1204d9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a321>
 1204d9d:	48 89 c3             	mov    rbx,rax
 1204da0:	48 8b bc 24 f8 04 00 	mov    rdi,QWORD PTR [rsp+0x4f8]
 1204da7:	00 
 1204da8:	e8 f1 99 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 1204dad:	eb 24                	jmp    1204dd3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a357>
 1204daf:	48 89 c3             	mov    rbx,rax
 1204db2:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204db9:	00 
 1204dba:	e8 a9 46 47 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
 1204dbf:	eb 03                	jmp    1204dc4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a348>
 1204dc1:	48 89 c3             	mov    rbx,rax
 1204dc4:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1204dc9:	e8 9a 46 47 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
 1204dce:	eb 03                	jmp    1204dd3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a357>
 1204dd0:	48 89 c3             	mov    rbx,rax
 1204dd3:	48 8b bc 24 c8 04 00 	mov    rdi,QWORD PTR [rsp+0x4c8]
 1204dda:	00 
 1204ddb:	e8 a6 96 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1204de0:	e9 d9 00 00 00       	jmp    1204ebe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a442>
 1204de5:	e9 c4 00 00 00       	jmp    1204eae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a432>
 1204dea:	e9 bf 00 00 00       	jmp    1204eae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a432>
 1204def:	48 89 c3             	mov    rbx,rax
 1204df2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1204df7:	e8 94 90 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1204dfc:	eb 19                	jmp    1204e17 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a39b>
 1204dfe:	eb 05                	jmp    1204e05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a389>
 1204e00:	e9 a9 00 00 00       	jmp    1204eae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a432>
 1204e05:	48 89 c3             	mov    rbx,rax
 1204e08:	eb 0d                	jmp    1204e17 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a39b>
 1204e0a:	48 89 c3             	mov    rbx,rax
 1204e0d:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 1204e12:	e8 87 99 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 1204e17:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204e1e:	00 
 1204e1f:	e8 c0 9b 8b ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
 1204e24:	eb 32                	jmp    1204e58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a3dc>
 1204e26:	48 89 c3             	mov    rbx,rax
 1204e29:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1204e2e:	e8 5d 90 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1204e33:	eb 16                	jmp    1204e4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a3cf>
 1204e35:	eb 02                	jmp    1204e39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a3bd>
 1204e37:	eb 75                	jmp    1204eae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a432>
 1204e39:	48 89 c3             	mov    rbx,rax
 1204e3c:	eb 0d                	jmp    1204e4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a3cf>
 1204e3e:	48 89 c3             	mov    rbx,rax
 1204e41:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 1204e46:	e8 53 99 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 1204e4b:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204e52:	00 
 1204e53:	e8 c2 87 3a 00       	call   15ad61a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f2b9e>
 1204e58:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
 1204e5f:	00 
 1204e60:	e8 cb 1e 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1204e65:	eb 57                	jmp    1204ebe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a442>
 1204e67:	eb 45                	jmp    1204eae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a432>
 1204e69:	eb 15                	jmp    1204e80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a404>
 1204e6b:	48 89 c3             	mov    rbx,rax
 1204e6e:	48 89 ef             	mov    rdi,rbp
 1204e71:	e8 f4 2c 46 00       	call   1667b6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bcd6>
 1204e76:	4c 89 ff             	mov    rdi,r15
 1204e79:	e8 a2 90 5e 00       	call   17edf20 <_ZdlPv@plt>
 1204e7e:	eb 03                	jmp    1204e83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a407>
 1204e80:	48 89 c3             	mov    rbx,rax
 1204e83:	48 8d bc 24 50 09 00 	lea    rdi,[rsp+0x950]
 1204e8a:	00 
 1204e8b:	e8 70 54 ff ff       	call   11fa300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f884>
 1204e90:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204e97:	00 
 1204e98:	e8 ab 19 00 00       	call   1206848 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bdcc>
 1204e9d:	eb 1f                	jmp    1204ebe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a442>
 1204e9f:	48 89 c3             	mov    rbx,rax
 1204ea2:	4c 89 e7             	mov    rdi,r12
 1204ea5:	e8 c0 2c 46 00       	call   1667b6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bcd6>
 1204eaa:	eb 12                	jmp    1204ebe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a442>
 1204eac:	eb 00                	jmp    1204eae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a432>
 1204eae:	48 89 c3             	mov    rbx,rax
 1204eb1:	48 8b bc 24 f8 04 00 	mov    rdi,QWORD PTR [rsp+0x4f8]
 1204eb8:	00 
 1204eb9:	e8 e0 98 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 1204ebe:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1204ec5:	00 00 
 1204ec7:	48 3b 84 24 70 09 00 	cmp    rax,QWORD PTR [rsp+0x970]
 1204ece:	00 
 1204ecf:	75 08                	jne    1204ed9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a45d>
 1204ed1:	48 89 df             	mov    rdi,rbx
 1204ed4:	e8 f7 ad 86 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1204ed9:	e8 d2 ab 5e 00       	call   17efab0 <__stack_chk_fail@plt>

## Helpers near availability/dispatch
### d23a2c

/tmp/nskip2/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000d239c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270960>:
  d239c0:	e7 4c                	out    0x4c,eax
  d239c2:	89 ff                	mov    edi,edi
  d239c4:	e8 ac 5c 00 00       	call   d29675 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x276615>
  d239c9:	49 83 c6 20          	add    r14,0x20
  d239cd:	4c 89 f7             	mov    rdi,r14
  d239d0:	4c 89 fe             	mov    rsi,r15
  d239d3:	e8 68 c2 dc ff       	call   aefc40 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3cbe0>
  d239d8:	6a fe                	push   0xfffffffffffffffe
  d239da:	5a                   	pop    rdx
  d239db:	89 d9                	mov    ecx,ebx
  d239dd:	d3 c2                	rol    edx,cl
  d239df:	21 10                	and    DWORD PTR [rax],edx
  d239e1:	48 89 e7             	mov    rdi,rsp
  d239e4:	e8 a7 a4 ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d239e9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d239f0:	00 00 
  d239f2:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  d239f7:	75 2d                	jne    d23a26 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709c6>
  d239f9:	48 83 c4 20          	add    rsp,0x20
  d239fd:	5b                   	pop    rbx
  d239fe:	41 5e                	pop    r14
  d23a00:	41 5f                	pop    r15
  d23a02:	c3                   	ret
  d23a03:	48 89 c3             	mov    rbx,rax
  d23a06:	48 89 e7             	mov    rdi,rsp
  d23a09:	e8 82 a4 ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d23a0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d23a15:	00 00 
  d23a17:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  d23a1c:	75 08                	jne    d23a26 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709c6>
  d23a1e:	48 89 df             	mov    rdi,rbx
  d23a21:	e8 aa c2 d4 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  d23a26:	e8 85 c0 ac 00       	call   17efab0 <__stack_chk_fail@plt>
  d23a2b:	cc                   	int3
  d23a2c:	55                   	push   rbp
  d23a2d:	41 57                	push   r15
  d23a2f:	41 56                	push   r14
  d23a31:	41 55                	push   r13
  d23a33:	41 54                	push   r12
  d23a35:	53                   	push   rbx
  d23a36:	48 83 ec 38          	sub    rsp,0x38
  d23a3a:	49 89 f5             	mov    r13,rsi
  d23a3d:	48 89 fb             	mov    rbx,rdi
  d23a40:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d23a47:	00 00 
  d23a49:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  d23a4e:	48 89 f7             	mov    rdi,rsi
  d23a51:	e8 6a bc d7 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
  d23a56:	49 89 c6             	mov    r14,rax
  d23a59:	48 8b 6b 08          	mov    rbp,QWORD PTR [rbx+0x8]
  d23a5d:	48 85 ed             	test   rbp,rbp
  d23a60:	74 14                	je     d23a76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270a16>
  d23a62:	f3 4c 0f b8 fd       	popcnt r15,rbp
  d23a67:	49 83 ff 01          	cmp    r15,0x1
  d23a6b:	77 0e                	ja     d23a7b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270a1b>
  d23a6d:	48 8d 55 ff          	lea    rdx,[rbp-0x1]
  d23a71:	4c 21 f2             	and    rdx,r14
  d23a74:	eb 15                	jmp    d23a8b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270a2b>
  d23a76:	e9 85 00 00 00       	jmp    d23b00 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270aa0>
  d23a7b:	4c 89 f2             	mov    rdx,r14
  d23a7e:	49 39 ee             	cmp    r14,rbp
  d23a81:	72 08                	jb     d23a8b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270a2b>
  d23a83:	4c 89 f0             	mov    rax,r14
  d23a86:	31 d2                	xor    edx,edx
  d23a88:	48 f7 f5             	div    rbp
  d23a8b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  d23a8e:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
  d23a92:	48 85 c0             	test   rax,rax
  d23a95:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
  d23a9a:	74 64                	je     d23b00 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270aa0>
  d23a9c:	48 89 1c 24          	mov    QWORD PTR [rsp],rbx
  d23aa0:	4c 8b 20             	mov    r12,QWORD PTR [rax]
  d23aa3:	4d 85 e4             	test   r12,r12
  d23aa6:	74 54                	je     d23afc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270a9c>
  d23aa8:	48 89 d3             	mov    rbx,rdx
  d23aab:	48 8d 45 ff          	lea    rax,[rbp-0x1]
  d23aaf:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  d23ab4:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
  d23ab9:	4c 39 f0             	cmp    rax,r14
  d23abc:	75 16                	jne    d23ad4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270a74>
  d23abe:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
  d23ac3:	4c 89 ee             	mov    rsi,r13
  d23ac6:	e8 23 bc d7 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
  d23acb:	84 c0                	test   al,al
  d23acd:	74 24                	je     d23af3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270a93>
  d23acf:	e9 d6 01 00 00       	jmp    d23caa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270c4a>
  d23ad4:	41 83 ff 01          	cmp    r15d,0x1
  d23ad8:	77 07                	ja     d23ae1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270a81>
  d23ada:	48 23 44 24 08       	and    rax,QWORD PTR [rsp+0x8]
  d23adf:	eb 0d                	jmp    d23aee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270a8e>
  d23ae1:	48 39 e8             	cmp    rax,rbp
  d23ae4:	72 08                	jb     d23aee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270a8e>
  d23ae6:	31 d2                	xor    edx,edx
  d23ae8:	48 f7 f5             	div    rbp
  d23aeb:	48 89 d0             	mov    rax,rdx
  d23aee:	48 39 d8             	cmp    rax,rbx
  d23af1:	75 09                	jne    d23afc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270a9c>
  d23af3:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
  d23af7:	4d 85 e4             	test   r12,r12
  d23afa:	75 b8                	jne    d23ab4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270a54>
  d23afc:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
  d23b00:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  d23b04:	6a 28                	push   0x28
  d23b06:	5f                   	pop    rdi
  d23b07:	e8 f4 a3 ac 00       	call   17edf00 <_Znwm@plt>
  d23b0c:	49 89 c7             	mov    r15,rax
  d23b0f:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  d23b14:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
  d23b19:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
  d23b1e:	48                   	rex.W
  d23b1f:	83                   	.byte 0x83

### fd65d4 / fd69d4

/tmp/nskip2/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fd6560 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d976>:
  fd6560:	fb                   	sti
  fd6561:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fd6564:	48 89 07             	mov    QWORD PTR [rdi],rax
  fd6567:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
  fd656b:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
  fd656f:	48 85 c0             	test   rax,rax
  fd6572:	74 05                	je     fd6579 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d98f>
  fd6574:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  fd6579:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  fd657d:	48 83 c6 10          	add    rsi,0x10
  fd6581:	e8 30 07 f5 ff       	call   f26cb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee0cc>
  fd6586:	48 83 c4 08          	add    rsp,0x8
  fd658a:	5b                   	pop    rbx
  fd658b:	41 5e                	pop    r14
  fd658d:	c3                   	ret
  fd658e:	49 89 c6             	mov    r14,rax
  fd6591:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  fd6595:	e8 ec 7e ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd659a:	4c 89 f7             	mov    rdi,r14
  fd659d:	e8 2e 97 a9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  fd65a2:	8a 57 10             	mov    dl,BYTE PTR [rdi+0x10]
  fd65a5:	84 d2                	test   dl,dl
  fd65a7:	41 0f 95 c0          	setne  r8b
  fd65ab:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
  fd65ae:	84 c9                	test   cl,cl
  fd65b0:	0f 95 c0             	setne  al
  fd65b3:	44 30 c0             	xor    al,r8b
  fd65b6:	84 d2                	test   dl,dl
  fd65b8:	74 18                	je     fd65d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9e8>
  fd65ba:	84 c9                	test   cl,cl
  fd65bc:	74 14                	je     fd65d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9e8>
  fd65be:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd65c1:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
  fd65c5:	48 33 06             	xor    rax,QWORD PTR [rsi]
  fd65c8:	48 33 4e 08          	xor    rcx,QWORD PTR [rsi+0x8]
  fd65cc:	48 09 c1             	or     rcx,rax
  fd65cf:	0f 95 c0             	setne  al
  fd65d2:	c3                   	ret
  fd65d3:	cc                   	int3
  fd65d4:	41 57                	push   r15
  fd65d6:	41 56                	push   r14
  fd65d8:	41 55                	push   r13
  fd65da:	41 54                	push   r12
  fd65dc:	53                   	push   rbx
  fd65dd:	48 83 ec 40          	sub    rsp,0x40
  fd65e1:	49 89 f6             	mov    r14,rsi
  fd65e4:	48 89 fb             	mov    rbx,rdi
  fd65e7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd65ee:	00 00 
  fd65f0:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  fd65f5:	e8 9e eb f3 ff       	call   f15198 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdc5ae>
  fd65fa:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
  fd65fd:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
  fd6602:	48 8b 5b 08          	mov    rbx,QWORD PTR [rbx+0x8]
  fd6606:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx
  fd660b:	48 85 db             	test   rbx,rbx
  fd660e:	74 14                	je     fd6624 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19da3a>
  fd6610:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
  fd6615:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
  fd661a:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
  fd661f:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
  fd6624:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
  fd6627:	4d 85 ff             	test   r15,r15
  fd662a:	74 6b                	je     fd6697 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19daad>
  fd662c:	6a 20                	push   0x20
  fd662e:	5f                   	pop    rdi
  fd662f:	e8 cc 78 81 00       	call   17edf00 <_Znwm@plt>
  fd6634:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
  fd6638:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
  fd663c:	48 8d 0d 4d 2b f5 ff 	lea    rcx,[rip+0xfffffffffff52b4d]        # f29190 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf05a6>
  fd6643:	48 89 08             	mov    QWORD PTR [rax],rcx
  fd6646:	48 8d 0d 6b 92 b6 ff 	lea    rcx,[rip+0xffffffffffb6926b]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
  fd664d:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  fd6651:	4c 89 ff             	mov    rdi,r15
  fd6654:	48 89 c6             	mov    rsi,rax
  fd6657:	e8 9e f3 f4 ff       	call   f259fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xece10>
  fd665c:	4d 8b 2e             	mov    r13,QWORD PTR [r14]
  fd665f:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
  fd6663:	0f 57 c0             	xorps  xmm0,xmm0
  fd6666:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
  fd666a:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
  fd666f:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
  fd6674:	4c 89 f7             	mov    rdi,r14
  fd6677:	4c 89 e6             	mov    rsi,r12
  fd667a:	e8 9d 31 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd667f:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  fd6684:	e8 fd 7d ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd6689:	49 83 7d 00 fd       	cmp    QWORD PTR [r13+0x0],0xfffffffffffffffd
  fd668e:	76 15                	jbe    fd66a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dabb>
  fd6690:	31 c0                	xor    eax,eax
  fd6692:	45 31 ed             	xor    r13d,r13d
  fd6695:	eb 1f                	jmp    fd66b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dacc>
  fd6697:	66 0f ef c0          	pxor   xmm0,xmm0
  fd669b:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
  fd66a0:	49 89 de             	mov    r14,rbx
  fd66a3:	eb 36                	jmp    fd66db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19daf1>
  fd66a5:	4d 85 ff             	test   r15,r15
  fd66a8:	74 0a                	je     fd66b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19daca>
  fd66aa:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  fd66af:	4c 89 f8             	mov    rax,r15
  fd66b2:	eb 02                	jmp    fd66b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dacc>
  fd66b4:	31 c0                	xor    eax,eax
  fd66b6:	66 48 0f 6e c0       	movq   xmm0,rax
  fd66bb:	66 49 0f 6e cd       	movq   xmm1,r13
  fd66c0:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  fd66c4:	66 0f 7f 0c 24       	movdqa XMMWORD PTR [rsp],xmm1
  fd66c9:	45 31 f6             	xor    r14d,r14d
  fd66cc:	31 ff                	xor    edi,edi
  fd66ce:	e8 b3 7d ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd66d3:	4c 89 ff             	mov    rdi,r15
  fd66d6:	e8 ab 7d ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd66db:	4c 89 f7             	mov    rdi,r14
  fd66de:	e8 cf 7d ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd66e3:	48 89 df             	mov    rdi,rbx
  fd66e6:	e8 c7 7d ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd66eb:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  fd66f0:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
  fd66f5:	4c 89 f7             	mov    rdi,r14
  fd66f8:	e8 33 4c ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  fd66fd:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  fd6700:	49 89 de             	mov    r14,rbx
  fd6703:	48 85 ff             	test   rdi,rdi
  fd6706:	74 1f                	je     fd6727 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19db3d>
  fd6708:	48 83 c7 08          	add    rdi,0x8
  fd670c:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
  fd6711:	e8 20 84 b0 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  fd6716:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
  fd671b:	4c 89 f7             	mov    rdi,r14
  fd671e:	e8 ad e2 d4 ff       	call   d249d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271970>
  fd6723:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
  fd6727:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fd672c:	e8 55 7d ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd6731:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
  fd6736:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  fd673d:	e8 44 7d ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd6742:	48 89 df             	mov    rdi,rbx
  fd6745:	e8 68 7d ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd674a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd6751:	00 00 
  fd6753:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
  fd6758:	75 15                	jne    fd676f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19db85>
  fd675a:	4c 89 f7             	mov    rdi,r14
  fd675d:	48 83 c4 40          	add    rsp,0x40
  fd6761:	5b                   	pop    rbx
  fd6762:	41 5c                	pop    r12
  fd6764:	41 5d                	pop    r13
  fd6766:	41 5e                	pop    r14
  fd6768:	41 5f                	pop    r15
  fd676a:	e9 43 7d ac ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd676f:	e8 3c 93 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd6774:	eb 00                	jmp    fd6776 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19db8c>
  fd6776:	48 89 c7             	mov    rdi,rax
  fd6779:	e8 27 33 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd677e:	41 56                	push   r14
  fd6780:	53                   	push   rbx
  fd6781:	48 83 ec 58          	sub    rsp,0x58
  fd6785:	48 89 fb             	mov    rbx,rdi
  fd6788:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd678f:	00 00 
  fd6791:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
  fd6796:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  fd679b:	4c 89 f7             	mov    rdi,r14
  fd679e:	e8 8d fd ff ff       	call   fd6530 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d946>
  fd67a3:	6a 01                	push   0x1
  fd67a5:	5a                   	pop    rdx
  fd67a6:	48 89 df             	mov    rdi,rbx
  fd67a9:	4c 89 f6             	mov    rsi,r14
  fd67ac:	e8 25 00 00 00       	call   fd67d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dbec>
  fd67b1:	4c 89 f7             	mov    rdi,r14
  fd67b4:	e8 95 d0 f3 ff       	call   f1384e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdac64>
  fd67b9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd67c0:	00 00 
  fd67c2:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
  fd67c7:	75 08                	jne    fd67d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dbe7>
  fd67c9:	48 83 c4 58          	add    rsp,0x58
  fd67cd:	5b                   	pop    rbx
  fd67ce:	41 5e                	pop    r14
  fd67d0:	c3                   	ret
  fd67d1:	e8 da 92 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd67d6:	55                   	push   rbp
  fd67d7:	41 57                	push   r15
  fd67d9:	41 56                	push   r14
  fd67db:	53                   	push   rbx
  fd67dc:	48 83 ec 68          	sub    rsp,0x68
  fd67e0:	49 89 fe             	mov    r14,rdi
  fd67e3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd67ea:	00 00 
  fd67ec:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  fd67f1:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  fd67f5:	48 85 ff             	test   rdi,rdi
  fd67f8:	0f 84 b7 00 00 00    	je     fd68b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dccb>
  fd67fe:	89 d5                	mov    ebp,edx
  fd6800:	49 89 f7             	mov    r15,rsi
  fd6803:	e8 38 79 81 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
  fd6808:	48 85 c0             	test   rax,rax
  fd680b:	0f 84 a4 00 00 00    	je     fd68b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dccb>
  fd6811:	48 89 c3             	mov    rbx,rax
  fd6814:	4d 8b 36             	mov    r14,QWORD PTR [r14]
  fd6817:	4d 85 f6             	test   r14,r14
  fd681a:	0f 84 1e 01 00 00    	je     fd693e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dd54>
  fd6820:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  fd6825:	4c 89 fe             	mov    rsi,r15
  fd6828:	e8 03 fd ff ff       	call   fd6530 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d946>
  fd682d:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  fd6830:	48 85 ff             	test   rdi,rdi
  fd6833:	0f 84 83 00 00 00    	je     fd68bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dcd2>
  fd6839:	48 83 ff fc          	cmp    rdi,0xfffffffffffffffc
  fd683d:	0f 87 ab 00 00 00    	ja     fd68ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dd04>
  fd6843:	40 0f b6 d5          	movzx  edx,bpl
  fd6847:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  fd684c:	ff 17                	call   QWORD PTR [rdi]
  fd684e:	40 84 ed             	test   bpl,bpl
  fd6851:	0f 84 dd 00 00 00    	je     fd6934 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dd4a>
  fd6857:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
  fd685a:	49 8d 47 ff          	lea    rax,[r15-0x1]
  fd685e:	48 83 f8 fb          	cmp    rax,0xfffffffffffffffb
  fd6862:	77 0f                	ja     fd6873 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dc89>
  fd6864:	4c 89 ff             	mov    rdi,r15
  fd6867:	41 ff 57 08          	call   QWORD PTR [r15+0x8]
  fd686b:	4c 89 ff             	mov    rdi,r15
  fd686e:	e8 ad 76 81 00       	call   17edf20 <_ZdlPv@plt>
  fd6873:	0f 57 c0             	xorps  xmm0,xmm0
  fd6876:	49 89 e7             	mov    r15,rsp
  fd6879:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  fd687d:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  fd6881:	4c 89 fe             	mov    rsi,r15
  fd6884:	e8 93 2f ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd6889:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  fd688d:	e8 f4 7b ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd6892:	0f 57 c0             	xorps  xmm0,xmm0
  fd6895:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  fd6899:	49 8d 7e 18          	lea    rdi,[r14+0x18]
  fd689d:	49 89 e7             	mov    r15,rsp
  fd68a0:	4c 89 fe             	mov    rsi,r15
  fd68a3:	e8 74 2f ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd68a8:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  fd68ac:	e8 d5 7b ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd68b1:	6a fe                	push   0xfffffffffffffffe
  fd68b3:	eb 33                	jmp    fd68e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dcfe>
  fd68b5:	31 db                	xor    ebx,ebx
  fd68b7:	e9 82 00 00 00       	jmp    fd693e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dd54>
  fd68bc:	4d 8d 7e 28          	lea    r15,[r14+0x28]
  fd68c0:	41 80 7e 70 00       	cmp    BYTE PTR [r14+0x70],0x0
  fd68c5:	74 08                	je     fd68cf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dce5>
  fd68c7:	4c 89 ff             	mov    rdi,r15
  fd68ca:	e8 7f cf f3 ff       	call   f1384e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdac64>
  fd68cf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  fd68d4:	4c 89 ff             	mov    rdi,r15
  fd68d7:	e8 54 fc ff ff       	call   fd6530 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d946>
  fd68dc:	41 c6 46 70 01       	mov    BYTE PTR [r14+0x70],0x1
  fd68e1:	40 84 ed             	test   bpl,bpl
  fd68e4:	74 4e                	je     fd6934 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dd4a>
  fd68e6:	6a ff                	push   0xffffffffffffffff
  fd68e8:	58                   	pop    rax
  fd68e9:	49 89 06             	mov    QWORD PTR [r14],rax
  fd68ec:	eb 05                	jmp    fd68f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dd09>
  fd68ee:	40 84 ed             	test   bpl,bpl
  fd68f1:	74 41                	je     fd6934 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dd4a>
  fd68f3:	0f 57 c0             	xorps  xmm0,xmm0
  fd68f6:	49 89 e7             	mov    r15,rsp
  fd68f9:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  fd68fd:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  fd6901:	4c 89 fe             	mov    rsi,r15
  fd6904:	e8 13 2f ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd6909:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  fd690d:	e8 74 7b ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd6912:	0f 57 c0             	xorps  xmm0,xmm0
  fd6915:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  fd6919:	49 83 c6 18          	add    r14,0x18
  fd691d:	49 89 e7             	mov    r15,rsp
  fd6920:	4c 89 f7             	mov    rdi,r14
  fd6923:	4c 89 fe             	mov    rsi,r15
  fd6926:	e8 f1 2e ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd692b:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  fd692f:	e8 52 7b ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd6934:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  fd6939:	e8 10 cf f3 ff       	call   f1384e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdac64>
  fd693e:	48 89 df             	mov    rdi,rbx
  fd6941:	e8 40 7b ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd6946:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd694d:	00 00 
  fd694f:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
  fd6954:	75 0b                	jne    fd6961 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dd77>
  fd6956:	48 83 c4 68          	add    rsp,0x68
  fd695a:	5b                   	pop    rbx
  fd695b:	41 5e                	pop    r14
  fd695d:	41 5f                	pop    r15
  fd695f:	5d                   	pop    rbp
  fd6960:	c3                   	ret
  fd6961:	e8 4a 91 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd6966:	48 8d 05 a3 ba 86 00 	lea    rax,[rip+0x86baa3]        # 1842410 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x143a8>
  fd696d:	48 89 07             	mov    QWORD PTR [rdi],rax
  fd6970:	e9 9b 76 81 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  fd6975:	cc                   	int3
  fd6976:	53                   	push   rbx
  fd6977:	48 89 fb             	mov    rbx,rdi
  fd697a:	e8 e7 ff ff ff       	call   fd6966 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dd7c>
  fd697f:	48 89 df             	mov    rdi,rbx
  fd6982:	5b                   	pop    rbx
  fd6983:	e9 98 75 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd6988:	41 56                	push   r14
  fd698a:	53                   	push   rbx
  fd698b:	50                   	push   rax
  fd698c:	48 89 fb             	mov    rbx,rdi
  fd698f:	4c 8b 77 18          	mov    r14,QWORD PTR [rdi+0x18]
  fd6993:	49 8d 46 ff          	lea    rax,[r14-0x1]
  fd6997:	48 83 f8 fb          	cmp    rax,0xfffffffffffffffb
  fd699b:	77 0f                	ja     fd69ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ddc2>
  fd699d:	4c 89 f7             	mov    rdi,r14
  fd69a0:	41 ff 56 08          	call   QWORD PTR [r14+0x8]
  fd69a4:	4c 89 f7             	mov    rdi,r14
  fd69a7:	e8 74 75 81 00       	call   17edf20 <_ZdlPv@plt>
  fd69ac:	4c 8d 73 18          	lea    r14,[rbx+0x18]
  fd69b0:	80 bb 88 00 00 00 00 	cmp    BYTE PTR [rbx+0x88],0x0
  fd69b7:	74 0c                	je     fd69c5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dddb>
  fd69b9:	48 83 c3 40          	add    rbx,0x40
  fd69bd:	48 89 df             	mov    rdi,rbx
  fd69c0:	e8 89 ce f3 ff       	call   f1384e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdac64>
  fd69c5:	4c 89 f7             	mov    rdi,r14
  fd69c8:	48 83 c4 08          	add    rsp,0x8
  fd69cc:	5b                   	pop    rbx
  fd69cd:	41 5e                	pop    r14
  fd69cf:	e9 5e c0 b1 ff       	jmp    af2a32 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f9d2>
  fd69d4:	41 57                	push   r15
  fd69d6:	41 56                	push   r14
  fd69d8:	41 55                	push   r13
  fd69da:	41 54                	push   r12
  fd69dc:	53                   	push   rbx
  fd69dd:	48 81 ec 70 01 00 00 	sub    rsp,0x170
  fd69e4:	49 89 ce             	mov    r14,rcx
  fd69e7:	49 89 d7             	mov    r15,rdx
  fd69ea:	48 89 fb             	mov    rbx,rdi
  fd69ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd69f4:	00 00 
  fd69f6:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
  fd69fd:	00 
  fd69fe:	48 83 c6 08          	add    rsi,0x8
  fd6a02:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  fd6a07:	e8 4e 54 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd6a0c:	0f 57 c0             	xorps  xmm0,xmm0
  fd6a0f:	48 89 e2             	mov    rdx,rsp
  fd6a12:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
  fd6a15:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
  fd6a1a:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
  fd6a1f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  fd6a24:	4c 89 e7             	mov    rdi,r12
  fd6a27:	e8 2e e6 f4 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  fd6a2c:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
  fd6a31:	4c 8b 60 20          	mov    r12,QWORD PTR [rax+0x20]
  fd6a35:	4d 85 e4             	test   r12,r12
  fd6a38:	74 62                	je     fd6a9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19deb2>
  fd6a3a:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  fd6a3e:	4c 8b a8 28 01 00 00 	mov    r13,QWORD PTR [rax+0x128]
  fd6a45:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  fd6a4c:	00 
  fd6a4d:	4c 89 fe             	mov    rsi,r15
  fd6a50:	e8 35 11 69 00       	call   1667b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bcf6>
  fd6a55:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
  fd6a5a:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
  fd6a61:	00 
  fd6a62:	4c 89 e6             	mov    rsi,r12
  fd6a65:	4c 89 f1             	mov    rcx,r14
  fd6a68:	41 ff d5             	call   r13
  fd6a6b:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  fd6a70:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
  fd6a75:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
  fd6a7a:	31 d2                	xor    edx,edx
  fd6a7c:	4c 89 f1             	mov    rcx,r14
  fd6a7f:	e8 34 e4 ff ff       	call   fd4eb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c2ce>
  fd6a84:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fd6a88:	e8 f9 79 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd6a8d:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  fd6a94:	00 
  fd6a95:	e8 d0 10 69 00       	call   1667b6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bcd6>
  fd6a9a:	eb 0f                	jmp    fd6aab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dec1>
  fd6a9c:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  fd6aa1:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
  fd6aa6:	e8 55 e2 ff ff       	call   fd4d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c116>
  fd6aab:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
  fd6ab0:	48 89 df             	mov    rdi,rbx
  fd6ab3:	4c 89 f6             	mov    rsi,r14
  fd6ab6:	e8 ff ef f3 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
  fd6abb:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fd6abf:	e8 c2 79 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd6ac4:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  fd6ac9:	e8 44 e8 f4 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd6ace:	48 89 e7             	mov    rdi,rsp
  fd6ad1:	e8 a6 54 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd6ad6:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  fd6adb:	e8 a6 79 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd6ae0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd6ae7:	00 00 
  fd6ae9:	48 3b 84 24 68 01 00 	cmp    rax,QWORD PTR [rsp+0x168]
  fd6af0:	00 
  fd6af1:	75 11                	jne    fd6b04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19df1a>
  fd6af3:	48 81 c4 70 01 00 00 	add    rsp,0x170
  fd6afa:	5b                   	pop    rbx
  fd6afb:	41 5c                	pop    r12
  fd6afd:	41 5d                	pop    r13
  fd6aff:	41 5e                	pop    r14
  fd6b01:	41 5f                	pop    r15
  fd6b03:	c3                   	ret
  fd6b04:	e8 a7 8f 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd6b09:	eb 00                	jmp    fd6b0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19df21>
  fd6b0b:	48 89 c7             	mov    rdi,rax
  fd6b0e:	e8 92 2f aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd6b13:	cc                   	int3
  fd6b14:	48 83 c7 08          	add    rdi,0x8
  fd6b18:	e9 83 e2 ff ff       	jmp    fd4da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1b6>
  fd6b1d:	cc                   	int3
  fd6b1e:	53                   	push   rbx
  fd6b1f:	48 89 fb             	mov    rbx,rdi
  fd6b22:	48 83 c7 08          	add    rdi,0x8
  fd6b26:	e8 75 e2 ff ff       	call   fd4da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1b6>
  fd6b2b:	48 89 df             	mov    rdi,rbx
  fd6b2e:	5b                   	pop    rbx
  fd6b2f:	e9 ec 73 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd6b34:	e9 67 e2 ff ff       	jmp    fd4da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1b6>
  fd6b39:	cc                   	int3
  fd6b3a:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  fd6b3e:	e9                   	.byte 0xe9
  fd6b3f:	db                   	.byte 0xdb

## Direct call/jump xrefs
  d16c54:	49 89 f6             	mov    r14,rsi
  d16c57:	6a 01                	push   0x1
  d16c59:	41 5d                	pop    r13
  d16c5b:	31 f6                	xor    esi,esi
  d16c5d:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
  d16c62:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]
  d16c67:	6a 18                	push   0x18
  d16c69:	41 5c                	pop    r12
  d16c6b:	48 6b f6 18          	imul   rsi,rsi,0x18
  d16c6f:	48 01 ce             	add    rsi,rcx
  d16c72:	4c 89 ff             	mov    rdi,r15
  d16c75:	e8 fb 29 01 00       	call   d29675 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x276615>
  d16c7a:	48 89 ef             	mov    rdi,rbp
  d16c7d:	4c 89 fe             	mov    rsi,r15
  d16c80:	e8 a7 cd 00 00       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  d16c85:	4c 89 ff             	mov    rdi,r15
  d16c88:	e8 03 72 ad 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d16c8d:	44 89 ee             	mov    esi,r13d
  d16c90:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
  d16c93:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
  d16c97:	48 29 c8             	sub    rax,rcx
  d16c9a:	48 99                	cqo
  d16c9c:	49 f7 fc             	idiv   r12
  d16c9f:	41 ff c5             	inc    r13d
  d16ca2:	48 39 f0             	cmp    rax,rsi
  d16ca5:	77 c4                	ja     d16c6b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263c0b>
  d16ca7:	83 64 24 08 00       	and    DWORD PTR [rsp+0x8],0x0
  d16cac:	48 8b 8b 18 02 00 00 	mov    rcx,QWORD PTR [rbx+0x218]
  d16cb3:	48 39 8b 20 02 00 00 	cmp    QWORD PTR [rbx+0x220],rcx
  d16cba:	0f 84 bb 00 00 00    	je     d16d7b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263d1b>
  d16cc0:	45 31 ed             	xor    r13d,r13d
  d16cc3:	49 6b c5 30          	imul   rax,r13,0x30
  d16cc7:	48 8b 3c 01          	mov    rdi,QWORD PTR [rcx+rax*1]
  d16ccb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d16cce:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
--
  d25399:	4c 89 f7             	mov    rdi,r14
  d2539c:	e8 8f 19 d8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  d253a1:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
  d253a8:	00 
  d253a9:	4c 89 f7             	mov    rdi,r14
  d253ac:	e8 f9 9d d9 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
  d253b1:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
  d253b6:	e8 d5 8a ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d253bb:	4c 89 f7             	mov    rdi,r14
  d253be:	48 89 ee             	mov    rsi,rbp
  d253c1:	e8 7a 8b ac 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  d253c6:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
  d253cd:	00 
  d253ce:	4c 89 f6             	mov    rsi,r14
  d253d1:	e8 56 e6 ff ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  d253d6:	4c 89 f7             	mov    rdi,r14
  d253d9:	e8 b2 8a ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d253de:	ff 44 24 54          	inc    DWORD PTR [rsp+0x54]
  d253e2:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  d253e9:	00 
  d253ea:	e8 a1 8a ac 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d253ef:	48 8d bc 24 c8 01 00 	lea    rdi,[rsp+0x1c8]
  d253f6:	00 
  d253f7:	e8 32 ff 99 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  d253fc:	4c 89 e7             	mov    rdi,r12
  d253ff:	48 89 de             	mov    rsi,rbx
  d25402:	e8 6b 1c d9 ff       	call   ab7072 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4012>
  d25407:	0f 28 84 24 20 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x120]
  d2540e:	00 
  d2540f:	4c 89 e7             	mov    rdi,r12
  d25412:	e8 6f 20 f5 ff       	call   c77486 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c4426>
  d25417:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
  d2541e:	00 
  d2541f:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
  d25426:	00 
--
  f878ae:	ff 50 70             	call   QWORD PTR [rax+0x70]
  f878b1:	41 80 be b0 00 00 00 	cmp    BYTE PTR [r14+0xb0],0x0
  f878b8:	00 
  f878b9:	74 3b                	je     f878f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ed0c>
  f878bb:	41 80 be b8 00 00 00 	cmp    BYTE PTR [r14+0xb8],0x0
  f878c2:	00 
  f878c3:	75 31                	jne    f878f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ed0c>
  f878c5:	48 8d 35 55 fe 3f ff 	lea    rsi,[rip+0xffffffffff3ffe55]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
  f878cc:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f878d3:	00 
  f878d4:	e8 a5 21 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f878d9:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
  f878e0:	00 
  f878e1:	48 89 df             	mov    rdi,rbx
  f878e4:	e8 43 c1 d9 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  f878e9:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f878f0:	00 
  f878f1:	e8 9a 65 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f878f6:	4c 89 f7             	mov    rdi,r14
  f878f9:	e8 6c 5c 00 00       	call   f8d56a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x154980>
  f878fe:	84 c0                	test   al,al
  f87900:	0f 84 98 00 00 00    	je     f8799e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14edb4>
  f87906:	41 80 be 48 04 00 00 	cmp    BYTE PTR [r14+0x448],0x0
  f8790d:	00 
  f8790e:	74 5d                	je     f8796d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ed83>
  f87910:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f87914:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f87917:	ff 50 10             	call   QWORD PTR [rax+0x10]
  f8791a:	85 c0                	test   eax,eax
  f8791c:	0f 84 a1 01 00 00    	je     f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87922:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f87926:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f87929:	ff 50 20             	call   QWORD PTR [rax+0x20]
  f8792c:	84 c0                	test   al,al
  f8792e:	74 14                	je     f87944 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ed5a>
  f87930:	49 8b be c0 04 00 00 	mov    rdi,QWORD PTR [r14+0x4c0]
  f87937:	e8 26 2b af ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
  f8793c:	84 c0                	test   al,al
  f8793e:	0f 84 7f 01 00 00    	je     f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87944:	48 8d 35 f7 fd 3f ff 	lea    rsi,[rip+0xffffffffff3ffdf7]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f8794b:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87952:	00 
  f87953:	e8 26 21 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f87958:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
  f8795f:	00 
  f87960:	48 89 df             	mov    rdi,rbx
  f87963:	e8 c4 c0 d9 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  f87968:	e9 49 01 00 00       	jmp    f87ab6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eecc>
  f8796d:	48 8d 35 ad fd 3f ff 	lea    rsi,[rip+0xffffffffff3ffdad]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
  f87974:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f8797b:	00 
  f8797c:	e8 fd 20 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f87981:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
  f87988:	00 
  f87989:	48 89 df             	mov    rdi,rbx
  f8798c:	e8 9b c0 d9 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  f87991:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87998:	00 
  f87999:	e8 f2 64 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f8799e:	41 80 be e8 03 00 00 	cmp    BYTE PTR [r14+0x3e8],0x0
  f879a5:	00 
  f879a6:	74 51                	je     f879f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ee0f>
  f879a8:	49 8d b6 f8 02 00 00 	lea    rsi,[r14+0x2f8]
  f879af:	49 8b 7e 50          	mov    rdi,QWORD PTR [r14+0x50]
  f879b3:	e8 50 34 00 00       	call   f8ae08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15221e>
  f879b8:	89 c5                	mov    ebp,eax
  f879ba:	84 c0                	test   al,al
  f879bc:	75 3d                	jne    f879fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ee11>
  f879be:	41 80 be e8 03 00 00 	cmp    BYTE PTR [r14+0x3e8],0x0
  f879c5:	00 
  f879c6:	74 33                	je     f879fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ee11>
  f879c8:	48 8d 35 52 fd 3f ff 	lea    rsi,[rip+0xffffffffff3ffd52]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
  f879cf:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f879d6:	00 
  f879d7:	e8 a2 20 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f879dc:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
  f879e3:	00 
  f879e4:	48 89 df             	mov    rdi,rbx
  f879e7:	e8 40 c0 d9 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  f879ec:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f879f3:	00 
  f879f4:	e8 97 64 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f879f9:	31 ed                	xor    ebp,ebp
  f879fb:	4c 89 f7             	mov    rdi,r14
  f879fe:	e8 4d 57 00 00       	call   f8d150 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x154566>
  f87a03:	84 c0                	test   al,al
  f87a05:	0f 85 b8 00 00 00    	jne    f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87a0b:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f87a0f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f87a12:	ff 50 10             	call   QWORD PTR [rax+0x10]
  f87a15:	85 c0                	test   eax,eax
  f87a17:	0f 84 a6 00 00 00    	je     f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87a1d:	41 80 be e8 03 00 00 	cmp    BYTE PTR [r14+0x3e8],0x0
  f87a24:	00 
  f87a25:	0f 94 c0             	sete   al
  f87a28:	40 80 f5 01          	xor    bpl,0x1
  f87a2c:	40 08 c5             	or     bpl,al
  f87a2f:	75 3f                	jne    f87a70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ee86>
  f87a31:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f87a35:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f87a38:	ff 50 20             	call   QWORD PTR [rax+0x20]
  f87a3b:	84 c0                	test   al,al
  f87a3d:	75 31                	jne    f87a70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ee86>
  f87a3f:	48 8d 35 fc fc 3f ff 	lea    rsi,[rip+0xffffffffff3ffcfc]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f87a46:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87a4d:	00 
  f87a4e:	e8 2b 20 af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f87a53:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
  f87a5a:	00 
  f87a5b:	48 89 df             	mov    rdi,rbx
  f87a5e:	e8 c9 bf d9 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  f87a63:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87a6a:	00 
  f87a6b:	e8 20 64 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f87a70:	41 80 be d8 00 00 00 	cmp    BYTE PTR [r14+0xd8],0x0
  f87a77:	00 
  f87a78:	74 49                	je     f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87a7a:	41 80 be 00 01 00 00 	cmp    BYTE PTR [r14+0x100],0x0
  f87a81:	00 
  f87a82:	75 3f                	jne    f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87a84:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  f87a88:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f87a8b:	ff 50 20             	call   QWORD PTR [rax+0x20]
  f87a8e:	84 c0                	test   al,al
  f87a90:	75 31                	jne    f87ac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eed9>
  f87a92:	48 8d 35 a9 fc 3f ff 	lea    rsi,[rip+0xffffffffff3ffca9]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  f87a99:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87aa0:	00 
  f87aa1:	e8 d8 1f af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f87aa6:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
  f87aad:	00 
  f87aae:	48 89 df             	mov    rdi,rbx
  f87ab1:	e8 76 bf d9 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  f87ab6:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  f87abd:	00 
  f87abe:	e8 cd 63 86 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f87ac3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f87aca:	00 00 
  f87acc:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
  f87ad3:	00 
  f87ad4:	75 73                	jne    f87b49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef5f>
  f87ad6:	48 89 d8             	mov    rax,rbx
  f87ad9:	48 81 c4 f8 01 00 00 	add    rsp,0x1f8
  f87ae0:	5b                   	pop    rbx
  f87ae1:	41 5e                	pop    r14
  f87ae3:	41 5f                	pop    r15
  f87ae5:	5d                   	pop    rbp
  f87ae6:	c3                   	ret
  f87ae7:	eb 16                	jmp    f87aff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef15>
  f87ae9:	eb 14                	jmp    f87aff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef15>
  f87aeb:	eb 24                	jmp    f87b11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef27>
  f87aed:	eb 22                	jmp    f87b11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef27>
  f87aef:	eb 0e                	jmp    f87aff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ef15>
--
  fc0d55:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fc0d58:	ff 50 70             	call   QWORD PTR [rax+0x70]
  fc0d5b:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  fc0d5f:	e8 02 27 00 00       	call   fc3466 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a87c>
  fc0d64:	84 c0                	test   al,al
  fc0d66:	74 32                	je     fc0d9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1881b0>
  fc0d68:	41 80 be 48 01 00 00 	cmp    BYTE PTR [r14+0x148],0x0
  fc0d6f:	00 
  fc0d70:	75 28                	jne    fc0d9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1881b0>
  fc0d72:	48 8d 35 04 b1 36 ff 	lea    rsi,[rip+0xffffffffff36b104]        # 32be7d <_ZTSSt12bad_any_cast@@Base-0x6434b>
  fc0d79:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fc0d7e:	e8 fb 8c ab ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  fc0d83:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  fc0d88:	48 89 df             	mov    rdi,rbx
  fc0d8b:	e8 9c 2c d6 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  fc0d90:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fc0d95:	e8 f6 d0 82 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fc0d9a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fc0da1:	00 00 
  fc0da3:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fc0da8:	75 3d                	jne    fc0de7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1881fd>
  fc0daa:	48 89 d8             	mov    rax,rbx
  fc0dad:	48 83 c4 28          	add    rsp,0x28
  fc0db1:	5b                   	pop    rbx
  fc0db2:	41 5e                	pop    r14
  fc0db4:	c3                   	ret
  fc0db5:	49 89 c6             	mov    r14,rax
  fc0db8:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fc0dbd:	e8 ce d0 82 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fc0dc2:	eb 03                	jmp    fc0dc7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1881dd>
  fc0dc4:	49 89 c6             	mov    r14,rax
  fc0dc7:	48 89 df             	mov    rdi,rbx
  fc0dca:	e8 97 18 b2 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  fc0dcf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fc0dd6:	00 00 
--
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
--
  fd3915:	e8 66 7f aa ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  fd391a:	84 c0                	test   al,al
  fd391c:	74 12                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd391e:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
  fd3923:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd3926:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  fd392c:	85 c0                	test   eax,eax
  fd392e:	74 4f                	je     fd397f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad95>
  fd3930:	49 83 c4 08          	add    r12,0x8
  fd3934:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
  fd3939:	4c 89 ef             	mov    rdi,r13
  fd393c:	4c 89 e6             	mov    rsi,r12
  fd393f:	4c 89 fa             	mov    rdx,r15
  fd3942:	4c 89 f1             	mov    rcx,r14
  fd3945:	e8 8a 30 00 00       	call   fd69d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ddea>
  fd394a:	48 89 df             	mov    rdi,rbx
  fd394d:	4c 89 ee             	mov    rsi,r13
  fd3950:	e8 7f 2c 00 00       	call   fd65d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9ea>
  fd3955:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fd3959:	e8 28 ab ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd395e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3965:	00 00 
  fd3967:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  fd396c:	75 48                	jne    fd39b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19adcc>
  fd396e:	48 89 d8             	mov    rax,rbx
  fd3971:	48 83 c4 20          	add    rsp,0x20
  fd3975:	5b                   	pop    rbx
  fd3976:	41 5c                	pop    r12
  fd3978:	41 5d                	pop    r13
  fd397a:	41 5e                	pop    r14
  fd397c:	41 5f                	pop    r15
  fd397e:	c3                   	ret
  fd397f:	41 80 7c 24 68 00    	cmp    BYTE PTR [r12+0x68],0x0
  fd3985:	74 a9                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3987:	41 80 7e 60 00       	cmp    BYTE PTR [r14+0x60],0x0
  fd398c:	74 a2                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd398e:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
  fd3992:	49 3b 44 24 58       	cmp    rax,QWORD PTR [r12+0x58]
--
  fd636d:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
  fd6372:	e8 0f 81 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd6377:	8b 2c 24             	mov    ebp,DWORD PTR [rsp]
  fd637a:	eb 14                	jmp    fd6390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d7a6>
  fd637c:	49 83 c7 08          	add    r15,0x8
  fd6380:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  fd6387:	00 
  fd6388:	4c 89 fe             	mov    rsi,r15
  fd638b:	e8 52 ea ff ff       	call   fd4de2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1f8>
  fd6390:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  fd6397:	00 
  fd6398:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
  fd639f:	00 
  fd63a0:	4c 89 fe             	mov    rsi,r15
  fd63a3:	e8 2c 02 00 00       	call   fd65d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9ea>
  fd63a8:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  fd63ac:	e8 d5 80 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd63b1:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  fd63b8:	00 
  fd63b9:	e8 90 d4 f3 ff       	call   f1384e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdac64>
  fd63be:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
  fd63c2:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  fd63c6:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
  fd63ca:	4d 85 f6             	test   r14,r14
  fd63cd:	74 05                	je     fd63d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d7ea>
  fd63cf:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fd63d4:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]
  fd63db:	00 
  fd63dc:	4d 85 ff             	test   r15,r15
  fd63df:	74 7b                	je     fd645c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d872>
  fd63e1:	6a 28                	push   0x28
  fd63e3:	5f                   	pop    rdi
  fd63e4:	e8 17 7b 81 00       	call   17edf00 <_Znwm@plt>
  fd63e9:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  fd63ed:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
--
  fe451b:	74 5e                	je     fe457b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab991>
  fe451d:	49 8b 46 38          	mov    rax,QWORD PTR [r14+0x38]
  fe4521:	48 89 c1             	mov    rcx,rax
  fe4524:	48 c1 e9 20          	shr    rcx,0x20
  fe4528:	84 c9                	test   cl,cl
  fe452a:	74 27                	je     fe4553 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab969>
  fe452c:	89 c0                	mov    eax,eax
  fe452e:	48 85 c0             	test   rax,rax
  fe4531:	75 20                	jne    fe4553 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab969>
  fe4533:	48 8d 35 08 32 3a ff 	lea    rsi,[rip+0xffffffffff3a3208]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
  fe453a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fe453f:	e8 3a 55 a9 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  fe4544:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  fe4549:	48 89 df             	mov    rdi,rbx
  fe454c:	e8 db f4 d3 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  fe4551:	eb 1e                	jmp    fe4571 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab987>
  fe4553:	48 8d 35 c7 31 3a ff 	lea    rsi,[rip+0xffffffffff3a31c7]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
  fe455a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fe455f:	e8 1a 55 a9 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  fe4564:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  fe4569:	48 89 df             	mov    rdi,rbx
  fe456c:	e8 bb f4 d3 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  fe4571:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fe4576:	e8 15 99 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fe457b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fe4582:	00 00 
  fe4584:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fe4589:	75 41                	jne    fe45cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab9e2>
  fe458b:	48 89 d8             	mov    rax,rbx
  fe458e:	48 83 c4 28          	add    rsp,0x28
  fe4592:	5b                   	pop    rbx
  fe4593:	41 5e                	pop    r14
  fe4595:	c3                   	ret
  fe4596:	eb 00                	jmp    fe4598 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab9ae>
  fe4598:	49 89 c6             	mov    r14,rax
  fe459b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fe45a0:	e8 eb 98 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fe45a5:	eb 05                	jmp    fe45ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab9c2>
  fe45a7:	eb 00                	jmp    fe45a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab9bf>
  fe45a9:	49 89 c6             	mov    r14,rax
  fe45ac:	48 89 df             	mov    rdi,rbx
  fe45af:	e8 b2 e0 af ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
--
  ff68a7:	0f b6 73 10          	movzx  esi,BYTE PTR [rbx+0x10]
  ff68ab:	48 8b 93 c0 25 00 00 	mov    rdx,QWORD PTR [rbx+0x25c0]
  ff68b2:	4c 89 ff             	mov    rdi,r15
  ff68b5:	e8 a8 21 00 00       	call   ff8a62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bfe78>
  ff68ba:	4c 8d ab 98 0e 00 00 	lea    r13,[rbx+0xe98]
  ff68c1:	84 c0                	test   al,al
  ff68c3:	74 2e                	je     ff68f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bdd09>
  ff68c5:	48 8d 35 4a 01 36 ff 	lea    rsi,[rip+0xffffffffff36014a]        # 356a16 <_ZTSSt12bad_any_cast@@Base-0x397b2>
  ff68cc:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  ff68d3:	00 
  ff68d4:	e8 a5 31 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  ff68d9:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
  ff68e0:	00 
  ff68e1:	4c 89 ef             	mov    rdi,r13
  ff68e4:	e8 43 d1 d2 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  ff68e9:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  ff68f0:	00 
  ff68f1:	eb 2a                	jmp    ff691d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bdd33>
  ff68f3:	48 8d 35 1c 01 36 ff 	lea    rsi,[rip+0xffffffffff36011c]        # 356a16 <_ZTSSt12bad_any_cast@@Base-0x397b2>
  ff68fa:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  ff6901:	00 
  ff6902:	e8 77 31 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  ff6907:	48 8d ac 24 90 00 00 	lea    rbp,[rsp+0x90]
  ff690e:	00 
  ff690f:	4c 89 ef             	mov    rdi,r13
  ff6912:	48 89 ee             	mov    rsi,rbp
  ff6915:	e8 0a 21 cb ff       	call   ca8a24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f59c4>
  ff691a:	48 89 ef             	mov    rdi,rbp
  ff691d:	e8 6e 75 7f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ff6922:	48 89 df             	mov    rdi,rbx
  ff6925:	e8 7c 21 00 00       	call   ff8aa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bfebc>
  ff692a:	48 8d bb 58 1d 00 00 	lea    rdi,[rbx+0x1d58]
  ff6931:	4c 89 e6             	mov    rsi,r12
  ff6934:	e8 a5 f3 e6 ff       	call   e65cde <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d0f4>
  ff6939:	48 89 df             	mov    rdi,rbx
--
 10ffcc3:	e8 ee 09 00 00       	call   11006b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7acc>
 10ffcc8:	84 c0                	test   al,al
 10ffcca:	74 53                	je     10ffd1f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7135>
 10ffccc:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 10ffccf:	4c 89 ff             	mov    rdi,r15
 10ffcd2:	e8 a1 b2 54 00       	call   164af78 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x460e6>
 10ffcd7:	48 8b b4 24 88 00 00 	mov    rsi,QWORD PTR [rsp+0x88]
 10ffcde:	00 
 10ffcdf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ffce2:	4c 89 e7             	mov    rdi,r12
 10ffce5:	31 d2                	xor    edx,edx
 10ffce7:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ffcea:	4c 89 ef             	mov    rdi,r13
 10ffced:	4c 89 e6             	mov    rsi,r12
 10ffcf0:	e8 37 3d c2 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 10ffcf5:	89 c5                	mov    ebp,eax
 10ffcf7:	4c 89 e7             	mov    rdi,r12
 10ffcfa:	e8 91 e1 6e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ffcff:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
 10ffd06:	00 
 10ffd07:	e8 7a e7 99 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ffd0c:	40 f6 c5 01          	test   bpl,0x1
 10ffd10:	74 0d                	je     10ffd1f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7135>
 10ffd12:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 10ffd15:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 10ffd1a:	e8 95 3a ad ff       	call   bd37b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120754>
 10ffd1f:	48 83 c3 10          	add    rbx,0x10
 10ffd23:	4c 39 f3             	cmp    rbx,r14
 10ffd26:	75 8f                	jne    10ffcb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c70cd>
 10ffd28:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 10ffd2c:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 10ffd2f:	f6 40 10 01          	test   BYTE PTR [rax+0x10],0x1
 10ffd33:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
 10ffd38:	74 04                	je     10ffd3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7154>
 10ffd3a:	48 8b 50 20          	mov    rdx,QWORD PTR [rax+0x20]
--
 10ffd6f:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
 10ffd76:	00 
 10ffd77:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 10ffd7a:	48 85 f6             	test   rsi,rsi
 10ffd7d:	74 4a                	je     10ffdc9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c71df>
 10ffd7f:	4c 89 f7             	mov    rdi,r14
 10ffd82:	e8 f1 b1 54 00       	call   164af78 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x460e6>
 10ffd87:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10ffd8c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ffd8f:	4c 89 ff             	mov    rdi,r15
 10ffd92:	31 d2                	xor    edx,edx
 10ffd94:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ffd97:	4c 89 e7             	mov    rdi,r12
 10ffd9a:	4c 89 fe             	mov    rsi,r15
 10ffd9d:	e8 8a 3c c2 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 10ffda2:	89 c5                	mov    ebp,eax
 10ffda4:	4c 89 ff             	mov    rdi,r15
 10ffda7:	e8 e4 e0 6e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ffdac:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
 10ffdb1:	e8 d0 e6 99 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ffdb6:	40 f6 c5 01          	test   bpl,0x1
 10ffdba:	74 0d                	je     10ffdc9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c71df>
 10ffdbc:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 10ffdbf:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 10ffdc4:	e8 eb 39 ad ff       	call   bd37b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120754>
 10ffdc9:	48 83 c3 10          	add    rbx,0x10
 10ffdcd:	4c 39 eb             	cmp    rbx,r13
 10ffdd0:	75 a5                	jne    10ffd77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c718d>
 10ffdd2:	4c 8b 74 24 50       	mov    r14,QWORD PTR [rsp+0x50]
 10ffdd7:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 10ffddc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 10ffde1:	49 39 c6             	cmp    r14,rax
 10ffde4:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
 10ffde8:	0f 84 65 01 00 00    	je     10fff53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7369>
 10ffdee:	48 8d 41 60          	lea    rax,[rcx+0x60]
--
 1105c3d:	48 8d 8c 24 a0 02 00 	lea    rcx,[rsp+0x2a0]
 1105c44:	00 
 1105c45:	89 41 10             	mov    DWORD PTR [rcx+0x10],eax
 1105c48:	0f 10 84 24 bc 02 00 	movups xmm0,XMMWORD PTR [rsp+0x2bc]
 1105c4f:	00 
 1105c50:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
 1105c53:	4c 8d b4 24 e0 00 00 	lea    r14,[rsp+0xe0]
 1105c5a:	00 
 1105c5b:	4c 89 f7             	mov    rdi,r14
 1105c5e:	48 89 de             	mov    rsi,rbx
 1105c61:	e8 c4 48 5c 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
 1105c66:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 1105c6d:	00 
 1105c6e:	4c 89 f6             	mov    rsi,r14
 1105c71:	e8 b6 dd c1 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 1105c76:	4c 89 f7             	mov    rdi,r14
 1105c79:	e8 12 82 6e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1105c7e:	48 89 df             	mov    rdi,rbx
 1105c81:	e8 a8 f6 5b 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 1105c86:	eb 10                	jmp    1105c98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cd0ae>
 1105c88:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 1105c8f:	00 
 1105c90:	4c 89 f6             	mov    rsi,r14
 1105c93:	e8 d8 7b b1 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
 1105c98:	48 8b bc 24 f0 01 00 	mov    rdi,QWORD PTR [rsp+0x1f0]
 1105c9f:	00 
 1105ca0:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
 1105ca7:	00 
 1105ca8:	e8 e3 80 9b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1105cad:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 1105cb4:	00 
 1105cb5:	e8 ac c9 9d ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 1105cba:	48 8d 9c 24 d0 02 00 	lea    rbx,[rsp+0x2d0]
 1105cc1:	00 
 1105cc2:	48 89 df             	mov    rdi,rbx
--
 110a60d:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 110a612:	c7 44 24 40 00 00 80 	mov    DWORD PTR [rsp+0x40],0x3f800000
 110a619:	3f 
 110a61a:	4c 8b b3 a8 00 00 00 	mov    r14,QWORD PTR [rbx+0xa8]
 110a621:	4c 8b ab b0 00 00 00 	mov    r13,QWORD PTR [rbx+0xb0]
 110a628:	4d 39 ee             	cmp    r14,r13
 110a62b:	74 31                	je     110a65e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1a74>
 110a62d:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
 110a632:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
 110a637:	4c 89 ff             	mov    rdi,r15
 110a63a:	4c 89 f6             	mov    rsi,r14
 110a63d:	e8 e8 fe 5b 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
 110a642:	4c 89 e7             	mov    rdi,r12
 110a645:	4c 89 fe             	mov    rsi,r15
 110a648:	e8 df 93 c1 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 110a64d:	4c 89 ff             	mov    rdi,r15
 110a650:	e8 3b 38 6e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 110a655:	49 83 c6 58          	add    r14,0x58
 110a659:	4d 39 ee             	cmp    r14,r13
 110a65c:	75 d9                	jne    110a637 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1a4d>
 110a65e:	48 8b 73 38          	mov    rsi,QWORD PTR [rbx+0x38]
 110a662:	4c 8d 4c 24 50       	lea    r9,[rsp+0x50]
 110a667:	49 89 19             	mov    QWORD PTR [r9],rbx
 110a66a:	41 88 69 08          	mov    BYTE PTR [r9+0x8],bpl
 110a66e:	48 8d 05 cf 35 9d ff 	lea    rax,[rip+0xffffffffff9d35cf]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
 110a675:	49 89 41 10          	mov    QWORD PTR [r9+0x10],rax
 110a679:	48 8d 05 b0 00 00 00 	lea    rax,[rip+0xb0]        # 110a730 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1b46>
 110a680:	49 89 41 18          	mov    QWORD PTR [r9+0x18],rax
 110a684:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 110a687:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 110a68c:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
 110a691:	6a 01                	push   0x1
 110a693:	59                   	pop    rcx
 110a694:	6a 03                	push   0x3
 110a696:	41 58                	pop    r8
--
 111f225:	00 
 111f226:	c7 84 24 68 01 00 00 	mov    DWORD PTR [rsp+0x168],0x3e
 111f22d:	3e 00 00 00 
 111f231:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
 111f234:	48 8d 84 24 70 01 00 	lea    rax,[rsp+0x170]
 111f23b:	00 
 111f23c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 111f23f:	4c 8d bc 24 e0 00 00 	lea    r15,[rsp+0xe0]
 111f246:	00 
 111f247:	4c 89 ff             	mov    rdi,r15
 111f24a:	4c 89 ee             	mov    rsi,r13
 111f24d:	e8 d8 b2 5a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
 111f252:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 111f257:	4c 89 fe             	mov    rsi,r15
 111f25a:	e8 cd 47 c0 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 111f25f:	4c 89 ff             	mov    rdi,r15
 111f262:	e8 29 ec 6c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 111f267:	8b bb e0 00 00 00    	mov    edi,DWORD PTR [rbx+0xe0]
 111f26d:	48 8b b3 08 01 00 00 	mov    rsi,QWORD PTR [rbx+0x108]
 111f274:	e8 5a f6 ff ff       	call   111e8d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5ce9>
 111f279:	84 c0                	test   al,al
 111f27b:	0f 84 ba 00 00 00    	je     111f33b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e6751>
 111f281:	49 89 ec             	mov    r12,rbp
 111f284:	4c 89 ef             	mov    rdi,r13
 111f287:	48 8d ac 24 a0 00 00 	lea    rbp,[rsp+0xa0]
 111f28e:	00 
 111f28f:	48 89 ee             	mov    rsi,rbp
 111f292:	e8 13 b5 b8 ff       	call   caa7aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f774a>
 111f297:	48 8b 43 58          	mov    rax,QWORD PTR [rbx+0x58]
 111f29b:	4c 8b 78 78          	mov    r15,QWORD PTR [rax+0x78]
 111f29f:	48 89 ef             	mov    rdi,rbp
 111f2a2:	e8 8f c5 95 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 111f2a7:	49 89 d0             	mov    r8,rdx
 111f2aa:	4c 8b 8b f8 02 00 00 	mov    r9,QWORD PTR [rbx+0x2f8]
 111f2b1:	4d 8b 17             	mov    r10,QWORD PTR [r15]
--
 11a4eb1:	00 
 11a4eb2:	e8 f5 f3 af ff       	call   ca42ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f124c>
 11a4eb7:	83 fd 03             	cmp    ebp,0x3
 11a4eba:	0f 85 8a 00 00 00    	jne    11a4f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36c360>
 11a4ec0:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 11a4ec5:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
 11a4ecc:	00 
 11a4ecd:	e8 9e 89 a7 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
 11a4ed2:	4c 89 ef             	mov    rdi,r13
 11a4ed5:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
 11a4edc:	00 
 11a4edd:	e8 48 56 52 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
 11a4ee2:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 11a4ee7:	4c 89 ee             	mov    rsi,r13
 11a4eea:	e8 3d eb b7 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 11a4eef:	4c 89 ef             	mov    rdi,r13
 11a4ef2:	e8 99 8f 64 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11a4ef7:	48 83 bc 24 a0 00 00 	cmp    QWORD PTR [rsp+0xa0],0x0
 11a4efe:	00 00 
 11a4f00:	74 68                	je     11a4f6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36c380>
 11a4f02:	31 ed                	xor    ebp,ebp
 11a4f04:	83 bc 24 9c 00 00 00 	cmp    DWORD PTR [rsp+0x9c],0x1
 11a4f0b:	01 
 11a4f0c:	41 0f 94 c7          	sete   r15b
 11a4f10:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 11a4f17:	00 
 11a4f18:	e8 47 ed ff ff       	call   11a3c64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b07a>
 11a4f1d:	66 89 84 24 a0 02 00 	mov    WORD PTR [rsp+0x2a0],ax
 11a4f24:	00 
 11a4f25:	66 89 44 24 16       	mov    WORD PTR [rsp+0x16],ax
 11a4f2a:	66 3d 00 01          	cmp    ax,0x100
 11a4f2e:	73 57                	jae    11a4f87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36c39d>
 11a4f30:	66 83 a4 24 20 02 00 	and    WORD PTR [rsp+0x220],0x0
 11a4f37:	00 00 
 11a4f39:	83 a4 24 38 02 00 00 	and    DWORD PTR [rsp+0x238],0x0
--
 11aa0af:	45 31 ed             	xor    r13d,r13d
 11aa0b2:	48 8d 2d c7 2e 1e ff 	lea    rbp,[rip+0xffffffffff1e2ec7]        # 38cf80 <_ZTSSt12bad_any_cast@@Base-0x3248>
 11aa0b9:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
 11aa0be:	49 89 e4             	mov    r12,rsp
 11aa0c1:	41 8b 54 2d 00       	mov    edx,DWORD PTR [r13+rbp*1+0x0]
 11aa0c6:	49 8b 06             	mov    rax,QWORD PTR [r14]
 11aa0c9:	4c 89 ff             	mov    rdi,r15
 11aa0cc:	4c 89 f6             	mov    rsi,r14
 11aa0cf:	ff 50 18             	call   QWORD PTR [rax+0x18]
 11aa0d2:	4c 89 e7             	mov    rdi,r12
 11aa0d5:	4c 89 fe             	mov    rsi,r15
 11aa0d8:	e8 4d 04 52 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
 11aa0dd:	48 89 df             	mov    rdi,rbx
 11aa0e0:	4c 89 e6             	mov    rsi,r12
 11aa0e3:	e8 44 99 b7 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 11aa0e8:	4c 89 e7             	mov    rdi,r12
 11aa0eb:	e8 a0 3d 64 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11aa0f0:	4c 89 ff             	mov    rdi,r15
 11aa0f3:	e8 36 b2 51 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 11aa0f8:	49 83 c5 04          	add    r13,0x4
 11aa0fc:	49 83 fd 10          	cmp    r13,0x10
 11aa100:	75 bf                	jne    11aa0c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3714d7>
 11aa102:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11aa109:	00 00 
 11aa10b:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
 11aa110:	75 3c                	jne    11aa14e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371564>
 11aa112:	48 83 c4 78          	add    rsp,0x78
 11aa116:	5b                   	pop    rbx
 11aa117:	41 5c                	pop    r12
 11aa119:	41 5d                	pop    r13
 11aa11b:	41 5e                	pop    r14
 11aa11d:	41 5f                	pop    r15
 11aa11f:	5d                   	pop    rbp
 11aa120:	c3                   	ret
 11aa121:	48 89 c3             	mov    rbx,rax
--
 11aa187:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 11aa18c:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
 11aa191:	48 8d 05 e8 2d 1e ff 	lea    rax,[rip+0xffffffffff1e2de8]        # 38cf80 <_ZTSSt12bad_any_cast@@Base-0x3248>
 11aa198:	8b 2c 03             	mov    ebp,DWORD PTR [rbx+rax*1]
 11aa19b:	49 8b 07             	mov    rax,QWORD PTR [r15]
 11aa19e:	4c 89 e7             	mov    rdi,r12
 11aa1a1:	4c 89 fe             	mov    rsi,r15
 11aa1a4:	89 ea                	mov    edx,ebp
 11aa1a6:	ff 50 18             	call   QWORD PTR [rax+0x18]
 11aa1a9:	4c 89 ef             	mov    rdi,r13
 11aa1ac:	4c 89 e6             	mov    rsi,r12
 11aa1af:	e8 76 03 52 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
 11aa1b4:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 11aa1b9:	4c 89 ee             	mov    rsi,r13
 11aa1bc:	e8 6b 98 b7 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 11aa1c1:	4c 89 ef             	mov    rdi,r13
 11aa1c4:	e8 c7 3c 64 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11aa1c9:	4c 89 e7             	mov    rdi,r12
 11aa1cc:	e8 5d b1 51 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 11aa1d1:	49 8b 06             	mov    rax,QWORD PTR [r14]
 11aa1d4:	4c 89 f7             	mov    rdi,r14
 11aa1d7:	89 ee                	mov    esi,ebp
 11aa1d9:	ff 50 18             	call   QWORD PTR [rax+0x18]
 11aa1dc:	48 85 c0             	test   rax,rax
 11aa1df:	74 20                	je     11aa201 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371617>
 11aa1e1:	4c 89 e7             	mov    rdi,r12
 11aa1e4:	48 89 c6             	mov    rsi,rax
 11aa1e7:	e8 74 2a 52 00       	call   16ccc60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80dcc>
 11aa1ec:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 11aa1f1:	4c 89 e6             	mov    rsi,r12
 11aa1f4:	e8 33 98 b7 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 11aa1f9:	4c 89 e7             	mov    rdi,r12
 11aa1fc:	e8 8f 3c 64 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11aa201:	48 83 c3 04          	add    rbx,0x4
 11aa205:	48 83 fb 10          	cmp    rbx,0x10
 11aa209:	75 86                	jne    11aa191 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3715a7>
 11aa20b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11aa212:	00 00 
 11aa214:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
 11aa21b:	00 
 11aa21c:	75 53                	jne    11aa271 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371687>
 11aa21e:	48 81 c4 88 00 00 00 	add    rsp,0x88
 11aa225:	5b                   	pop    rbx
 11aa226:	41 5c                	pop    r12
 11aa228:	41 5d                	pop    r13
 11aa22a:	41 5e                	pop    r14
 11aa22c:	41 5f                	pop    r15
 11aa22e:	5d                   	pop    rbp
 11aa22f:	c3                   	ret
 11aa230:	48 89 c3             	mov    rbx,rax
 11aa233:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
--
 1251366:	4d 39 e6             	cmp    r14,r12
 1251369:	74 4c                	je     12513b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9693b>
 125136b:	4c 8d 2d c6 a8 18 ff 	lea    r13,[rip+0xffffffffff18a8c6]        # 3dbc38 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1687>
 1251372:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]
 1251379:	00 
 125137a:	41 8b 46 1c          	mov    eax,DWORD PTR [r14+0x1c]
 125137e:	48 83 f8 02          	cmp    rax,0x2
 1251382:	77 23                	ja     12513a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9692b>
 1251384:	49 63 74 85 00       	movsxd rsi,DWORD PTR [r13+rax*4+0x0]
 1251389:	4c 01 ee             	add    rsi,r13
 125138c:	4c 89 ff             	mov    rdi,r15
 125138f:	e8 ea 86 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1251394:	48 89 df             	mov    rdi,rbx
 1251397:	4c 89 fe             	mov    rsi,r15
 125139a:	e8 8d 26 ad ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 125139f:	4c 89 ff             	mov    rdi,r15
 12513a2:	e8 e9 ca 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12513a7:	4c 89 f7             	mov    rdi,r14
 12513aa:	e8 33 d4 84 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
 12513af:	49 89 c6             	mov    r14,rax
 12513b2:	4c 39 e0             	cmp    rax,r12
 12513b5:	75 c3                	jne    125137a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x968fe>
 12513b7:	48 8d 35 80 b5 0e ff 	lea    rsi,[rip+0xffffffffff0eb580]        # 33c93e <_ZTSSt12bad_any_cast@@Base-0x5388a>
 12513be:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 12513c5:	00 
 12513c6:	e8 b3 86 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 12513cb:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 12513d2:	00 
 12513d3:	48 89 df             	mov    rdi,rbx
 12513d6:	e8 51 26 ad ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 12513db:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
 12513e0:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 12513e7:	00 
 12513e8:	e8 a3 ca 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12513ed:	48 8d 35 a0 95 12 ff 	lea    rsi,[rip+0xffffffffff1295a0]        # 37a994 <_ZTSSt12bad_any_cast@@Base-0x15834>
 12513f4:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 12513fb:	00 
 12513fc:	e8 7d 86 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1251401:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 1251408:	00 
 1251409:	48 89 df             	mov    rdi,rbx
 125140c:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]
 1251410:	e8 17 26 ad ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 1251415:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 125141c:	00 
 125141d:	e8 6e ca 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1251422:	48 8d 35 70 63 13 ff 	lea    rsi,[rip+0xffffffffff136370]        # 387799 <_ZTSSt12bad_any_cast@@Base-0x8a2f>
 1251429:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 1251430:	00 
 1251431:	e8 48 86 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1251436:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 125143d:	00 
 125143e:	48 89 df             	mov    rdi,rbx
 1251441:	e8 e6 25 ad ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 1251446:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 125144d:	00 
 125144e:	e8 3d ca 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1251453:	48 8d 35 10 aa 0d ff 	lea    rsi,[rip+0xffffffffff0daa10]        # 32be6a <_ZTSSt12bad_any_cast@@Base-0x6435e>
 125145a:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 1251461:	00 
 1251462:	e8 17 86 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1251467:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 125146e:	00 
 125146f:	48 89 df             	mov    rdi,rbx
 1251472:	e8 b5 25 ad ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 1251477:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 125147e:	00 
 125147f:	e8 0c ca 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1251484:	4d 8b a6 98 0f 00 00 	mov    r12,QWORD PTR [r14+0xf98]
 125148b:	49 8b 86 a0 0f 00 00 	mov    rax,QWORD PTR [r14+0xfa0]
 1251492:	49 39 c4             	cmp    r12,rax
 1251495:	74 14                	je     12514ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96a2f>
 1251497:	41 80 bc 24 ae 06 00 	cmp    BYTE PTR [r12+0x6ae],0x0
 125149e:	00 00 
 12514a0:	75 22                	jne    12514c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96a48>
 12514a2:	49 81 c4 b0 06 00 00 	add    r12,0x6b0
 12514a9:	eb e7                	jmp    1251492 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96a16>
 12514ab:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 12514b0:	80 b8 90 0f 00 00 00 	cmp    BYTE PTR [rax+0xf90],0x0
 12514b7:	0f 84 84 01 00 00    	je     1251641 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96bc5>
 12514bd:	4c 8d a0 e0 08 00 00 	lea    r12,[rax+0x8e0]
 12514c4:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
 12514cb:	00 
 12514cc:	48 89 df             	mov    rdi,rbx
 12514cf:	e8 94 7d 42 00       	call   1679268 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d3d4>
--
 1254d58:	84 c0                	test   al,al
 1254d5a:	74 3a                	je     1254d96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a31a>
 1254d5c:	8b 84 24 70 02 00 00 	mov    eax,DWORD PTR [rsp+0x270]
 1254d63:	83 f8 05             	cmp    eax,0x5
 1254d66:	77 2e                	ja     1254d96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a31a>
 1254d68:	6a 2a                	push   0x2a
 1254d6a:	59                   	pop    rcx
 1254d6b:	0f a3 c1             	bt     ecx,eax
 1254d6e:	73 26                	jae    1254d96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a31a>
 1254d70:	48 8d 35 06 71 0d ff 	lea    rsi,[rip+0xffffffffff0d7106]        # 32be7d <_ZTSSt12bad_any_cast@@Base-0x6434b>
 1254d77:	48 89 e7             	mov    rdi,rsp
 1254d7a:	e8 ff 4c 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1254d7f:	48 8d bb 80 0e 00 00 	lea    rdi,[rbx+0xe80]
 1254d86:	48 89 e6             	mov    rsi,rsp
 1254d89:	e8 9e ec ac ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 1254d8e:	48 89 e7             	mov    rdi,rsp
 1254d91:	e8 fa 90 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1254d96:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
 1254d9d:	00 
 1254d9e:	e8 65 5c 85 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 1254da3:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 1254da8:	e8 e3 90 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1254dad:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 1254db2:	e8 ab 02 41 00       	call   1665062 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191ce>
 1254db7:	4c 8d a3 f0 04 00 00 	lea    r12,[rbx+0x4f0]
 1254dbe:	48 8d 35 93 76 1e ff 	lea    rsi,[rip+0xffffffffff1e7693]        # 43c458 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2064>
 1254dc5:	4c 89 e7             	mov    rdi,r12
 1254dc8:	e8 57 5b c3 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
 1254dcd:	48 89 c7             	mov    rdi,rax
 1254dd0:	4c 89 fe             	mov    rsi,r15
 1254dd3:	e8 a8 92 59 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 1254dd8:	48 8d 35 91 76 1e ff 	lea    rsi,[rip+0xffffffffff1e7691]        # 43c470 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x207c>
 1254ddf:	4c 89 e7             	mov    rdi,r12
 1254de2:	e8 3d 5b c3 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
 1254de7:	48 8d 35 9a 76 1e ff 	lea    rsi,[rip+0xffffffffff1e769a]        # 43c488 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2094>
--
 1258be5:	00 00 
 1258be7:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 1258bec:	48 8b 7f 60          	mov    rdi,QWORD PTR [rdi+0x60]
 1258bf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1258bf3:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1258bf6:	48 81 c3 80 0e 00 00 	add    rbx,0xe80
 1258bfd:	48 8d 35 12 de 0f ff 	lea    rsi,[rip+0xffffffffff0fde12]        # 356a16 <_ZTSSt12bad_any_cast@@Base-0x397b2>
 1258c04:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 1258c09:	4c 89 f7             	mov    rdi,r14
 1258c0c:	84 c0                	test   al,al
 1258c0e:	74 17                	je     1258c27 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e1ab>
 1258c10:	e8 69 0e 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1258c15:	48 89 df             	mov    rdi,rbx
 1258c18:	4c 89 f6             	mov    rsi,r14
 1258c1b:	e8 0c ae ac ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 1258c20:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1258c25:	eb 13                	jmp    1258c3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e1be>
 1258c27:	e8 52 0e 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1258c2c:	48 89 df             	mov    rdi,rbx
 1258c2f:	4c 89 f6             	mov    rsi,r14
 1258c32:	e8 ed fd a4 ff       	call   ca8a24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f59c4>
 1258c37:	4c 89 f7             	mov    rdi,r14
 1258c3a:	e8 51 52 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1258c3f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1258c46:	00 00 
 1258c48:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 1258c4d:	75 2d                	jne    1258c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e200>
 1258c4f:	48 83 c4 28          	add    rsp,0x28
 1258c53:	5b                   	pop    rbx
 1258c54:	41 5e                	pop    r14
 1258c56:	c3                   	ret
 1258c57:	48 89 c3             	mov    rbx,rax
 1258c5a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1258c5f:	e8 2c 52 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1258c64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
--
 12c80fa:	48 29 f2             	sub    rdx,rsi
 12c80fd:	4c 89 ef             	mov    rdi,r13
 12c8100:	e8 15 49 7d ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 12c8105:	4c 89 ef             	mov    rdi,r13
 12c8108:	e8 0b 33 51 00       	call   17db418 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7239>
 12c810d:	4c 89 ef             	mov    rdi,r13
 12c8110:	e8 21 37 7b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 12c8115:	48 89 c7             	mov    rdi,rax
 12c8118:	48 89 d6             	mov    rsi,rdx
 12c811b:	e8 01 05 00 00       	call   12c8621 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dba5>
 12c8120:	84 c0                	test   al,al
 12c8122:	75 0b                	jne    12c812f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d6b3>
 12c8124:	48 89 ef             	mov    rdi,rbp
 12c8127:	4c 89 ee             	mov    rsi,r13
 12c812a:	e8 fd b8 a5 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 12c812f:	4c 89 ef             	mov    rdi,r13
 12c8132:	e8 59 5d 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12c8137:	4c 89 e7             	mov    rdi,r12
 12c813a:	e8 0f 67 9a ff       	call   c6e84e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bb7ee>
 12c813f:	eb 9a                	jmp    12c80db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d65f>
 12c8141:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 12c8146:	e8 45 5d 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12c814b:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 12c8150:	e8 a1 92 88 ff       	call   b513f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9e396>
 12c8155:	0f 57 c0             	xorps  xmm0,xmm0
 12c8158:	0f 29 84 24 40 01 00 	movaps XMMWORD PTR [rsp+0x140],xmm0
 12c815f:	00 
 12c8160:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
 12c8167:	00 
 12c8168:	c7 84 24 50 01 00 00 	mov    DWORD PTR [rsp+0x150],0x3f800000
 12c816f:	00 00 80 3f 
 12c8173:	49 8b 06             	mov    rax,QWORD PTR [r14]
 12c8176:	4d 89 f7             	mov    r15,r14
 12c8179:	4c 89 f7             	mov    rdi,r14
 12c817c:	ff 50 30             	call   QWORD PTR [rax+0x30]
--
 12dd4f0:	48 99                	cqo
 12dd4f2:	49 f7 fc             	idiv   r12
 12dd4f5:	48 8d 15 26 3f 09 ff 	lea    rdx,[rip+0xffffffffff093f26]        # 371422 <_ZTSSt12bad_any_cast@@Base-0x1eda6>
 12dd4fc:	48 89 c6             	mov    rsi,rax
 12dd4ff:	e8 18 d2 f3 ff       	call   121a71c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fca0>
 12dd504:	4c 39 f8             	cmp    rax,r15
 12dd507:	75 34                	jne    12dd53d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x122ac1>
 12dd509:	4c 8d b3 28 09 00 00 	lea    r14,[rbx+0x928]
 12dd510:	48 8d 35 0b 3f 09 ff 	lea    rsi,[rip+0xffffffffff093f0b]        # 371422 <_ZTSSt12bad_any_cast@@Base-0x1eda6>
 12dd517:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
 12dd51c:	4c 89 ff             	mov    rdi,r15
 12dd51f:	e8 5a c5 79 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 12dd524:	4c 89 f7             	mov    rdi,r14
 12dd527:	4c 89 fe             	mov    rsi,r15
 12dd52a:	e8 fd 64 a4 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 12dd52f:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 12dd534:	e8 57 09 51 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12dd539:	4c 8b 73 20          	mov    r14,QWORD PTR [rbx+0x20]
 12dd53d:	48 8d 35 de 3e 09 ff 	lea    rsi,[rip+0xffffffffff093ede]        # 371422 <_ZTSSt12bad_any_cast@@Base-0x1eda6>
 12dd544:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 12dd549:	e8 30 c5 79 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 12dd54e:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 12dd553:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 12dd558:	6a 01                	push   0x1
 12dd55a:	5a                   	pop    rdx
 12dd55b:	e8 f8 9e 7c ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 12dd560:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 12dd565:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 12dd56a:	48 29 c8             	sub    rax,rcx
 12dd56d:	48 99                	cqo
 12dd56f:	49 f7 fc             	idiv   r12
 12dd572:	48 89 e7             	mov    rdi,rsp
 12dd575:	6a 01                	push   0x1
 12dd577:	5a                   	pop    rdx
 12dd578:	4c 89 f6             	mov    rsi,r14
--
 13127f0:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 13127f3:	c7 47 20 00 00 80 3f 	mov    DWORD PTR [rdi+0x20],0x3f800000
 13127fa:	48 8b 86 78 01 00 00 	mov    rax,QWORD PTR [rsi+0x178]
 1312801:	48 2b 86 70 01 00 00 	sub    rax,QWORD PTR [rsi+0x170]
 1312808:	b9 d0 02 00 00       	mov    ecx,0x2d0
 131280d:	48 99                	cqo
 131280f:	48 f7 f9             	idiv   rcx
 1312812:	48 8d 70 01          	lea    rsi,[rax+0x1]
 1312816:	e8 d7 d3 93 ff       	call   c4fbf2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cb92>
 131281b:	48 8d 35 5a f7 13 ff 	lea    rsi,[rip+0xffffffffff13f75a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 1312822:	48 89 e7             	mov    rdi,rsp
 1312825:	e8 54 72 76 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 131282a:	48 89 e6             	mov    rsi,rsp
 131282d:	48 89 df             	mov    rdi,rbx
 1312830:	e8 f7 11 a1 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 1312835:	48 89 e7             	mov    rdi,rsp
 1312838:	e8 53 b6 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 131283d:	4d 8b be 70 01 00 00 	mov    r15,QWORD PTR [r14+0x170]
 1312844:	4d 8b b6 78 01 00 00 	mov    r14,QWORD PTR [r14+0x178]
 131284b:	4d 39 f7             	cmp    r15,r14
 131284e:	74 15                	je     1312865 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x157de9>
 1312850:	49 8d 77 18          	lea    rsi,[r15+0x18]
 1312854:	48 89 df             	mov    rdi,rbx
 1312857:	e8 14 b0 90 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
 131285c:	49 81 c7 d0 02 00 00 	add    r15,0x2d0
 1312863:	eb e6                	jmp    131284b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x157dcf>
 1312865:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 131286c:	00 00 
 131286e:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 1312873:	75 3e                	jne    13128b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x157e37>
 1312875:	48 83 c4 20          	add    rsp,0x20
 1312879:	5b                   	pop    rbx
 131287a:	41 5e                	pop    r14
 131287c:	41 5f                	pop    r15
 131287e:	c3                   	ret
--
 1463b80:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 1463b84:	4c 01 f7             	add    rdi,r14
 1463b87:	e8 4a 3a 00 00       	call   14675d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2acb5a>
 1463b8c:	49 89 c4             	mov    r12,rax
 1463b8f:	85 db                	test   ebx,ebx
 1463b91:	74 0a                	je     1463b9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a9121>
 1463b93:	4c 89 e7             	mov    rdi,r12
 1463b96:	e8 ab 4e 84 ff       	call   ca8a46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f59e6>
 1463b9b:	eb 22                	jmp    1463bbf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a9143>
 1463b9d:	4c 89 ff             	mov    rdi,r15
 1463ba0:	48 8d 35 ce 66 ef fe 	lea    rsi,[rip+0xfffffffffeef66ce]        # 35a275 <_ZTSSt12bad_any_cast@@Base-0x35f53>
 1463ba7:	e8 d2 5e 61 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1463bac:	4c 89 e7             	mov    rdi,r12
 1463baf:	4c 89 fe             	mov    rsi,r15
 1463bb2:	e8 75 fe 8b ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 1463bb7:	4c 89 ff             	mov    rdi,r15
 1463bba:	e8 d1 a2 38 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1463bbf:	48 8b 6d 00          	mov    rbp,QWORD PTR [rbp+0x0]
 1463bc3:	48 85 ed             	test   rbp,rbp
 1463bc6:	75 b1                	jne    1463b79 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a90fd>
 1463bc8:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
 1463bcc:	80 be 18 0a 00 00 00 	cmp    BYTE PTR [rsi+0xa18],0x0
 1463bd3:	74 58                	je     1463c2d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a91b1>
 1463bd5:	0f 57 c0             	xorps  xmm0,xmm0
 1463bd8:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 1463bdd:	eb 0d                	jmp    1463bec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a9170>
 1463bdf:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 1463be4:	e8 45 17 26 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
 1463be9:	0f 57 c0             	xorps  xmm0,xmm0
 1463bec:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
 1463bf1:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
 1463bf7:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 1463bfc:	e8 65 ea 67 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 1463c01:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1463c08:	00 00 
--
 14dd74d:	74 10                	je     14dd75f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322ce3>
 14dd74f:	49 8b bf 80 00 00 00 	mov    rdi,QWORD PTR [r15+0x80]
 14dd756:	e8 9d bd f8 ff       	call   14694f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2aea7c>
 14dd75b:	84 c0                	test   al,al
 14dd75d:	74 74                	je     14dd7d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322d57>
 14dd75f:	49 8b 06             	mov    rax,QWORD PTR [r14]
 14dd762:	80 78 48 00          	cmp    BYTE PTR [rax+0x48],0x0
 14dd766:	74 67                	je     14dd7cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322d53>
 14dd768:	48 8d 35 1e fc e5 fe 	lea    rsi,[rip+0xfffffffffee5fc1e]        # 33d38d <_ZTSSt12bad_any_cast@@Base-0x52e3b>
 14dd76f:	49 89 e6             	mov    r14,rsp
 14dd772:	4c 89 f7             	mov    rdi,r14
 14dd775:	e8 04 c3 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14dd77a:	48 89 df             	mov    rdi,rbx
 14dd77d:	4c 89 f6             	mov    rsi,r14
 14dd780:	e8 a7 62 84 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14dd785:	e9 85 00 00 00       	jmp    14dd80f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322d93>
 14dd78a:	41 8b 87 90 00 00 00 	mov    eax,DWORD PTR [r15+0x90]
 14dd791:	41 3b 47 10          	cmp    eax,DWORD PTR [r15+0x10]
 14dd795:	7d 5b                	jge    14dd7f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322d76>
 14dd797:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 14dd79a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14dd79d:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
 14dd7a3:	49 03 87 98 00 00 00 	add    rax,QWORD PTR [r15+0x98]
 14dd7aa:	49 3b 47 08          	cmp    rax,QWORD PTR [r15+0x8]
 14dd7ae:	7e 92                	jle    14dd742 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322cc6>
 14dd7b0:	48 8d 35 79 db e9 fe 	lea    rsi,[rip+0xfffffffffee9db79]        # 37b330 <_ZTSSt12bad_any_cast@@Base-0x14e98>
 14dd7b7:	49 89 e6             	mov    r14,rsp
 14dd7ba:	4c 89 f7             	mov    rdi,r14
 14dd7bd:	e8 bc c2 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14dd7c2:	48 89 df             	mov    rdi,rbx
 14dd7c5:	4c 89 f6             	mov    rsi,r14
 14dd7c8:	e8 5f 62 84 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14dd7cd:	eb 40                	jmp    14dd80f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322d93>
 14dd7cf:	b0 01                	mov    al,0x1
 14dd7d1:	eb 46                	jmp    14dd819 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322d9d>
 14dd7d3:	48 8d 35 a3 68 e6 fe 	lea    rsi,[rip+0xfffffffffee668a3]        # 34407d <_ZTSSt12bad_any_cast@@Base-0x4c14b>
 14dd7da:	49 89 e6             	mov    r14,rsp
 14dd7dd:	4c 89 f7             	mov    rdi,r14
 14dd7e0:	e8 99 c2 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14dd7e5:	48 89 df             	mov    rdi,rbx
 14dd7e8:	4c 89 f6             	mov    rsi,r14
 14dd7eb:	e8 3c 62 84 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14dd7f0:	eb 1d                	jmp    14dd80f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322d93>
 14dd7f2:	48 8d 35 4a bb e4 fe 	lea    rsi,[rip+0xfffffffffee4bb4a]        # 329343 <_ZTSSt12bad_any_cast@@Base-0x66e85>
 14dd7f9:	49 89 e6             	mov    r14,rsp
 14dd7fc:	4c 89 f7             	mov    rdi,r14
 14dd7ff:	e8 7a c2 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14dd804:	48 89 df             	mov    rdi,rbx
 14dd807:	4c 89 f6             	mov    rsi,r14
 14dd80a:	e8 1d 62 84 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14dd80f:	48 89 e7             	mov    rdi,rsp
 14dd812:	e8 79 06 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14dd817:	31 c0                	xor    eax,eax
 14dd819:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 14dd820:	00 00 
 14dd822:	48 3b 4c 24 18       	cmp    rcx,QWORD PTR [rsp+0x18]
 14dd827:	75 33                	jne    14dd85c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322de0>
 14dd829:	48 83 c4 20          	add    rsp,0x20
 14dd82d:	5b                   	pop    rbx
 14dd82e:	41 5e                	pop    r14
 14dd830:	41 5f                	pop    r15
 14dd832:	c3                   	ret
 14dd833:	eb 04                	jmp    14dd839 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322dbd>
 14dd835:	eb 02                	jmp    14dd839 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322dbd>
 14dd837:	eb 00                	jmp    14dd839 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322dbd>
 14dd839:	48 89 c3             	mov    rbx,rax
 14dd83c:	48 89 e7             	mov    rdi,rsp
 14dd83f:	e8 4c 06 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14dd844:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14dd84b:	00 00 
--
 14dddfe:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 14dde03:	40 b5 01             	mov    bpl,0x1
 14dde06:	80 7f 48 00          	cmp    BYTE PTR [rdi+0x48],0x0
 14dde0a:	74 35                	je     14dde41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3233c5>
 14dde0c:	41 83 7f 10 00       	cmp    DWORD PTR [r15+0x10],0x0
 14dde11:	74 07                	je     14dde1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32339e>
 14dde13:	49 83 7f 08 00       	cmp    QWORD PTR [r15+0x8],0x0
 14dde18:	75 27                	jne    14dde41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3233c5>
 14dde1a:	48 8d 35 8b 1f e5 fe 	lea    rsi,[rip+0xfffffffffee51f8b]        # 32fdac <_ZTSSt12bad_any_cast@@Base-0x6041c>
 14dde21:	49 89 e4             	mov    r12,rsp
 14dde24:	4c 89 e7             	mov    rdi,r12
 14dde27:	e8 52 bc 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14dde2c:	48 89 df             	mov    rdi,rbx
 14dde2f:	4c 89 e6             	mov    rsi,r12
 14dde32:	e8 f5 5b 84 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14dde37:	48 89 e7             	mov    rdi,rsp
 14dde3a:	e8 51 00 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14dde3f:	31 ed                	xor    ebp,ebp
 14dde41:	49 8b 07             	mov    rax,QWORD PTR [r15]
 14dde44:	4c 89 ff             	mov    rdi,r15
 14dde47:	4c 89 f6             	mov    rsi,r14
 14dde4a:	ff 50 10             	call   QWORD PTR [rax+0x10]
 14dde4d:	84 c0                	test   al,al
 14dde4f:	74 29                	je     14dde7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3233fe>
 14dde51:	49 83 be f8 00 00 00 	cmp    QWORD PTR [r14+0xf8],0x0
 14dde58:	00 
 14dde59:	75 46                	jne    14ddea1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x323425>
 14dde5b:	48 8d 35 13 c4 e7 fe 	lea    rsi,[rip+0xfffffffffee7c413]        # 35a275 <_ZTSSt12bad_any_cast@@Base-0x35f53>
 14dde62:	49 89 e6             	mov    r14,rsp
 14dde65:	4c 89 f7             	mov    rdi,r14
 14dde68:	e8 11 bc 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14dde6d:	48 89 df             	mov    rdi,rbx
 14dde70:	4c 89 f6             	mov    rsi,r14
 14dde73:	e8 b4 5b 84 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14dde78:	eb 1d                	jmp    14dde97 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32341b>
 14dde7a:	48 8d 35 37 da ea fe 	lea    rsi,[rip+0xfffffffffeeada37]        # 38b8b8 <_ZTSSt12bad_any_cast@@Base-0x4910>
 14dde81:	49 89 e6             	mov    r14,rsp
 14dde84:	4c 89 f7             	mov    rdi,r14
 14dde87:	e8 f2 bb 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14dde8c:	48 89 df             	mov    rdi,rbx
 14dde8f:	4c 89 f6             	mov    rsi,r14
 14dde92:	e8 95 5b 84 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14dde97:	48 89 e7             	mov    rdi,rsp
 14dde9a:	e8 f1 ff 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14dde9f:	31 ed                	xor    ebp,ebp
 14ddea1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14ddea8:	00 00 
 14ddeaa:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 14ddeaf:	75 36                	jne    14ddee7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32346b>
 14ddeb1:	89 e8                	mov    eax,ebp
 14ddeb3:	48 83 c4 20          	add    rsp,0x20
 14ddeb7:	5b                   	pop    rbx
 14ddeb8:	41 5c                	pop    r12
 14ddeba:	41 5e                	pop    r14
 14ddebc:	41 5f                	pop    r15
 14ddebe:	5d                   	pop    rbp
 14ddebf:	c3                   	ret
 14ddec0:	eb 02                	jmp    14ddec4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x323448>
 14ddec2:	eb 00                	jmp    14ddec4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x323448>
 14ddec4:	48 89 c3             	mov    rbx,rax
 14ddec7:	48 89 e7             	mov    rdi,rsp
 14ddeca:	e8 c1 ff 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
--
 14e5c6c:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
 14e5c71:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 14e5c74:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
 14e5c7b:	00 
 14e5c7c:	4c 89 f7             	mov    rdi,r14
 14e5c7f:	e8 40 7a ff ff       	call   14dd6c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322c48>
 14e5c84:	31 ff                	xor    edi,edi
 14e5c86:	e9 bd 00 00 00       	jmp    14e5d48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b2cc>
 14e5c8b:	48 8d 35 94 1d e6 fe 	lea    rsi,[rip+0xfffffffffee61d94]        # 347a26 <_ZTSSt12bad_any_cast@@Base-0x487a2>
 14e5c92:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 14e5c97:	e8 e2 3d 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14e5c9c:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 14e5ca3:	00 
 14e5ca4:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 14e5ca9:	e8 7e dd 83 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14e5cae:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
 14e5cb3:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 14e5cb8:	48 89 df             	mov    rdi,rbx
 14e5cbb:	e8 d0 81 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14e5cc0:	0f 57 c0             	xorps  xmm0,xmm0
 14e5cc3:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
 14e5cc6:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 14e5ccb:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
 14e5cd2:	00 
 14e5cd3:	4c 89 f7             	mov    rdi,r14
 14e5cd6:	e8 e9 79 ff ff       	call   14dd6c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322c48>
 14e5cdb:	eb 50                	jmp    14e5d2d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b2b1>
 14e5cdd:	48 8d 35 99 af e6 fe 	lea    rsi,[rip+0xfffffffffee6af99]        # 350c7d <_ZTSSt12bad_any_cast@@Base-0x3f54b>
 14e5ce4:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 14e5ce9:	e8 90 3d 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14e5cee:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 14e5cf5:	00 
 14e5cf6:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 14e5cfb:	e8 2c dd 83 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14e5d00:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
 14e5d05:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 14e5d0a:	48 89 df             	mov    rdi,rbx
 14e5d0d:	e8 7e 81 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14e5d12:	0f 57 c0             	xorps  xmm0,xmm0
 14e5d15:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
 14e5d18:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 14e5d1d:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
 14e5d24:	00 
 14e5d25:	4c 89 f7             	mov    rdi,r14
 14e5d28:	e8 97 79 ff ff       	call   14dd6c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322c48>
 14e5d2d:	31 ff                	xor    edi,edi
 14e5d2f:	e8 52 87 5b ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14e5d34:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
 14e5d39:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 14e5d3e:	e8 4d 81 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14e5d43:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
 14e5d48:	e8 39 87 5b ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14e5d4d:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 14e5d54:	00 
--
 14e5e5a:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 14e5e5d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14e5e60:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
 14e5e66:	84 c0                	test   al,al
 14e5e68:	74 28                	je     14e5e92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b416>
 14e5e6a:	49 8b 06             	mov    rax,QWORD PTR [r14]
 14e5e6d:	80 78 48 00          	cmp    BYTE PTR [rax+0x48],0x0
 14e5e71:	74 64                	je     14e5ed7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b45b>
 14e5e73:	48 8d 35 13 75 e5 fe 	lea    rsi,[rip+0xfffffffffee57513]        # 33d38d <_ZTSSt12bad_any_cast@@Base-0x52e3b>
 14e5e7a:	49 89 e6             	mov    r14,rsp
 14e5e7d:	4c 89 f7             	mov    rdi,r14
 14e5e80:	e8 f9 3b 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14e5e85:	48 89 df             	mov    rdi,rbx
 14e5e88:	4c 89 f6             	mov    rsi,r14
 14e5e8b:	e8 9c db 83 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14e5e90:	eb 66                	jmp    14e5ef8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b47c>
 14e5e92:	41 8b 87 90 00 00 00 	mov    eax,DWORD PTR [r15+0x90]
 14e5e99:	41 3b 47 10          	cmp    eax,DWORD PTR [r15+0x10]
 14e5e9d:	7d 3c                	jge    14e5edb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b45f>
 14e5e9f:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 14e5ea2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14e5ea5:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
 14e5eab:	49 03 87 98 00 00 00 	add    rax,QWORD PTR [r15+0x98]
 14e5eb2:	49 3b 47 08          	cmp    rax,QWORD PTR [r15+0x8]
 14e5eb6:	7e b2                	jle    14e5e6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b3ee>
 14e5eb8:	48 8d 35 71 54 e9 fe 	lea    rsi,[rip+0xfffffffffee95471]        # 37b330 <_ZTSSt12bad_any_cast@@Base-0x14e98>
 14e5ebf:	49 89 e6             	mov    r14,rsp
 14e5ec2:	4c 89 f7             	mov    rdi,r14
 14e5ec5:	e8 b4 3b 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14e5eca:	48 89 df             	mov    rdi,rbx
 14e5ecd:	4c 89 f6             	mov    rsi,r14
 14e5ed0:	e8 57 db 83 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14e5ed5:	eb 21                	jmp    14e5ef8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b47c>
 14e5ed7:	b0 01                	mov    al,0x1
 14e5ed9:	eb 27                	jmp    14e5f02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b486>
 14e5edb:	48 8d 35 61 34 e4 fe 	lea    rsi,[rip+0xfffffffffee43461]        # 329343 <_ZTSSt12bad_any_cast@@Base-0x66e85>
 14e5ee2:	49 89 e6             	mov    r14,rsp
 14e5ee5:	4c 89 f7             	mov    rdi,r14
 14e5ee8:	e8 91 3b 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14e5eed:	48 89 df             	mov    rdi,rbx
 14e5ef0:	4c 89 f6             	mov    rsi,r14
 14e5ef3:	e8 34 db 83 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14e5ef8:	48 89 e7             	mov    rdi,rsp
 14e5efb:	e8 90 7f 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14e5f00:	31 c0                	xor    eax,eax
 14e5f02:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 14e5f09:	00 00 
 14e5f0b:	48 3b 4c 24 18       	cmp    rcx,QWORD PTR [rsp+0x18]
 14e5f10:	75 31                	jne    14e5f43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b4c7>
 14e5f12:	48 83 c4 20          	add    rsp,0x20
 14e5f16:	5b                   	pop    rbx
 14e5f17:	41 5e                	pop    r14
 14e5f19:	41 5f                	pop    r15
 14e5f1b:	c3                   	ret
 14e5f1c:	eb 02                	jmp    14e5f20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b4a4>
 14e5f1e:	eb 00                	jmp    14e5f20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32b4a4>
 14e5f20:	48 89 c3             	mov    rbx,rax
 14e5f23:	48 89 e7             	mov    rdi,rsp
 14e5f26:	e8 65 7f 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14e5f2b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14e5f32:	00 00 
 14e5f34:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
--
 14e6500:	49 81 c4 a0 00 00 00 	add    r12,0xa0
 14e6507:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
 14e650c:	4c 89 e7             	mov    rdi,r12
 14e650f:	e8 6c 7b 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 14e6514:	48 8d 35 62 a7 e6 fe 	lea    rsi,[rip+0xfffffffffee6a762]        # 350c7d <_ZTSSt12bad_any_cast@@Base-0x3f54b>
 14e651b:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
 14e6522:	00 
 14e6523:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
 14e6528:	e8 51 35 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14e652d:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
 14e6532:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 14e6539:	00 
 14e653a:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
 14e6541:	00 
 14e6542:	e8 e5 d4 83 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
 14e6547:	48 8d 9c 24 e0 01 00 	lea    rbx,[rsp+0x1e0]
 14e654e:	00 
 14e654f:	48 89 df             	mov    rdi,rbx
 14e6552:	e8 39 79 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14e6557:	66 0f ef c0          	pxor   xmm0,xmm0
 14e655b:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0
 14e655f:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
 14e6566:	00 
 14e6567:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
 14e656e:	00 
 14e656f:	48 89 ef             	mov    rdi,rbp
 14e6572:	e8 4d 71 ff ff       	call   14dd6c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x322c48>
 14e6577:	31 ff                	xor    edi,edi
 14e6579:	e8 08 7f 5b ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14e657e:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 14e6583:	e8 08 79 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14e6588:	e9 ee 00 00 00       	jmp    14e667b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32bbff>
 14e658d:	e8 19 5c fe ff       	call   14cc1ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31172f>
 14e6592:	49 89 d1             	mov    r9,rdx
 14e6595:	48 89 df             	mov    rdi,rbx

## Relocations targeting producer/consumer
0000000001842030  0000000000000008 R_X86_64_RELATIVE                         fd381a
00000000018420e8  0000000000000008 R_X86_64_RELATIVE                         fd38d6
000000000185c048  0000000000000008 R_X86_64_RELATIVE                         1204218

## All virtual +0x140 calls in nearby player regions
  bc4b7d:	31 c7                	xor    edi,eax
  bc4b7f:	31 d1                	xor    ecx,edx
  bc4b81:	01 f9                	add    ecx,edi
  bc4b83:	89 c8                	mov    eax,ecx
  bc4b85:	48 83 c4 08          	add    rsp,0x8
  bc4b89:	5b                   	pop    rbx
  bc4b8a:	5d                   	pop    rbp
  bc4b8b:	c3                   	ret
  bc4b8c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  bc4b8f:	48 03 78 d8          	add    rdi,QWORD PTR [rax-0x28]
  bc4b93:	e9 6c ff ff ff       	jmp    bc4b04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x111aa4>
  bc4b98:	53                   	push   rbx
  bc4b99:	48 89 fb             	mov    rbx,rdi
  bc4b9c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  bc4b9f:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  bc4ba5:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
  bc4ba8:	48 89 df             	mov    rdi,rbx
  bc4bab:	48 89 c6             	mov    rsi,rax
  bc4bae:	ff 91 80 01 00 00    	call   QWORD PTR [rcx+0x180]
  bc4bb4:	48 89 c1             	mov    rcx,rax
  bc4bb7:	48 c1 e9 20          	shr    rcx,0x20
  bc4bbb:	0f ba e1 1c          	bt     ecx,0x1c
  bc4bbf:	73 1d                	jae    bc4bde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x111b7e>
  bc4bc1:	48 c1 e0 20          	shl    rax,0x20
  bc4bc5:	48 09 c8             	or     rax,rcx
  bc4bc8:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
  bc4bcb:	48 89 df             	mov    rdi,rbx
  bc4bce:	48 89 c6             	mov    rsi,rax
  bc4bd1:	ff 91 58 08 00 00    	call   QWORD PTR [rcx+0x858]
  bc4bd7:	48 89 c1             	mov    rcx,rax
  bc4bda:	48 c1 e8 20          	shr    rax,0x20
  bc4bde:	48 89 d6             	mov    rsi,rdx
  bc4be1:	48 c1 ee 20          	shr    rsi,0x20
  bc4be5:	31 c8                	xor    eax,ecx
  bc4be7:	31 d6                	xor    esi,edx
  bc4be9:	01 c6                	add    esi,eax
  bc4beb:	89 f0                	mov    eax,esi
  bc4bed:	5b                   	pop    rbx
  bc4bee:	c3                   	ret
--
  c97444:	0f 84 5e 01 00 00    	je     c975a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4548>
  c9744a:	49 8b b6 b0 00 00 00 	mov    rsi,QWORD PTR [r14+0xb0]
  c97451:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
  c97455:	48 83 c6 08          	add    rsi,0x8
  c97459:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  c97460:	00 
  c97461:	ff 50 18             	call   QWORD PTR [rax+0x18]
  c97464:	48 83 bc 24 00 01 00 	cmp    QWORD PTR [rsp+0x100],0x0
  c9746b:	00 00 
  c9746d:	0f 84 2e 01 00 00    	je     c975a1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4541>
  c97473:	49 8b 86 f8 00 00 00 	mov    rax,QWORD PTR [r14+0xf8]
  c9747a:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  c9747f:	4d 8d a6 28 01 00 00 	lea    r12,[r14+0x128]
  c97486:	4c 89 e7             	mov    rdi,r12
  c97489:	41 ff 96 40 01 00 00 	call   QWORD PTR [r14+0x140]
  c97490:	49 89 c7             	mov    r15,rax
  c97493:	49 81 c6 f0 00 00 00 	add    r14,0xf0
  c9749a:	4d 8b 36             	mov    r14,QWORD PTR [r14]
  c9749d:	4d 85 f6             	test   r14,r14
  c974a0:	74 37                	je     c974d9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4479>
  c974a2:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  c974a7:	48 8b 98 a8 00 00 00 	mov    rbx,QWORD PTR [rax+0xa8]
  c974ae:	4c 8b ac 24 00 01 00 	mov    r13,QWORD PTR [rsp+0x100]
  c974b5:	00 
  c974b6:	41 0f b7 6e 10       	movzx  ebp,WORD PTR [r14+0x10]
  c974bb:	49 8d 7e 18          	lea    rdi,[r14+0x18]
  c974bf:	e8 72 43 de ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c974c4:	49 89 d0             	mov    r8,rdx
  c974c7:	48 89 df             	mov    rdi,rbx
  c974ca:	4c 89 ee             	mov    rsi,r13
  c974cd:	89 ea                	mov    edx,ebp
  c974cf:	48 89 c1             	mov    rcx,rax
  c974d2:	e8 43 f3 00 00       	call   ca681a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f37ba>
  c974d7:	eb c1                	jmp    c9749a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e443a>
  c974d9:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
  c974de:	49 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [r14+0xa8]
  c974e5:	48 8b 94 24 00 01 00 	mov    rdx,QWORD PTR [rsp+0x100]
  c974ec:	00 
  c974ed:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
--
  c97513:	49 83 a6 f0 00 00 00 	and    QWORD PTR [r14+0xf0],0x0
  c9751a:	00 
  c9751b:	49 8b 86 e8 00 00 00 	mov    rax,QWORD PTR [r14+0xe8]
  c97522:	48 85 c0             	test   rax,rax
  c97525:	74 16                	je     c9753d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e44dd>
  c97527:	31 c9                	xor    ecx,ecx
  c97529:	49 8b 96 e0 00 00 00 	mov    rdx,QWORD PTR [r14+0xe0]
  c97530:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
  c97535:	48 ff c1             	inc    rcx
  c97538:	48 39 c8             	cmp    rax,rcx
  c9753b:	75 ec                	jne    c97529 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e44c9>
  c9753d:	49 83 a6 f8 00 00 00 	and    QWORD PTR [r14+0xf8],0x0
  c97544:	00 
  c97545:	4c 89 e7             	mov    rdi,r12
  c97548:	41 ff 96 40 01 00 00 	call   QWORD PTR [r14+0x140]
  c9754f:	4c 29 f8             	sub    rax,r15
  c97552:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
  c97557:	f3 0f 5e 05 79 73 6f 	divss  xmm0,DWORD PTR [rip+0xffffffffff6f7379]        # 38e8d8 <_ZTSSt12bad_any_cast@@Base-0x18f0>
  c9755e:	ff 
  c9755f:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
  c97563:	48 8d 35 12 aa 7b ff 	lea    rsi,[rip+0xffffffffff7baa12]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  c9756a:	48 8d 0d 48 ee 6e ff 	lea    rcx,[rip+0xffffffffff6eee48]        # 3863b9 <_ZTSSt12bad_any_cast@@Base-0x9e0f>
  c97571:	6a 04                	push   0x4
  c97573:	5f                   	pop    rdi
  c97574:	ba af 00 00 00       	mov    edx,0xaf
  c97579:	4c 8b 44 24 30       	mov    r8,QWORD PTR [rsp+0x30]
  c9757e:	b0 01                	mov    al,0x1
  c97580:	e8 4d f3 b3 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  c97585:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
  c9758c:	00 
  c9758d:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
  c97594:	00 00 
  c97596:	48 85 ff             	test   rdi,rdi
  c97599:	74 06                	je     c975a1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4541>
  c9759b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c9759e:	ff 50 08             	call   QWORD PTR [rax+0x8]
  c975a1:	31 db                	xor    ebx,ebx
  c975a3:	e9 36 0a 00 00       	jmp    c97fde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4f7e>
  c975a8:	48 8d 35 cd a9 7b ff 	lea    rsi,[rip+0xffffffffff7ba9cd]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
--
  c97813:	e8 dc 91 9e 00       	call   16809f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b60>
  c97818:	4c 89 f7             	mov    rdi,r14
  c9781b:	e8 d4 ba 9e 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
  c97820:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
  c97825:	49 8d be 08 01 00 00 	lea    rdi,[r14+0x108]
  c9782c:	41 ff 96 20 01 00 00 	call   QWORD PTR [r14+0x120]
  c97833:	b9 40 42 0f 00       	mov    ecx,0xf4240
  c97838:	48 99                	cqo
  c9783a:	48 f7 f9             	idiv   rcx
  c9783d:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
  c97842:	49 2b 86 60 01 00 00 	sub    rax,QWORD PTR [r14+0x160]
  c97849:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  c9784e:	4d 8d be 28 01 00 00 	lea    r15,[r14+0x128]
  c97855:	4c 89 ff             	mov    rdi,r15
  c97858:	41 ff 96 40 01 00 00 	call   QWORD PTR [r14+0x140]
  c9785f:	49 8d ae b8 00 00 00 	lea    rbp,[r14+0xb8]
  c97866:	41 80 7d 30 00       	cmp    BYTE PTR [r13+0x30],0x0
  c9786b:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  c97870:	0f 84 c5 06 00 00    	je     c97f3b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4edb>
  c97876:	49 8d 8e c0 00 00 00 	lea    rcx,[r14+0xc0]
  c9787d:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
  c97882:	49 69 8e 48 01 00 00 	imul   rcx,QWORD PTR [r14+0x148],0xf4240
  c97889:	40 42 0f 00 
  c9788d:	48 01 c1             	add    rcx,rax
  c97890:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
  c97895:	49 8d 86 e0 00 00 00 	lea    rax,[r14+0xe0]
  c9789c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  c978a1:	49 8d 86 f0 00 00 00 	lea    rax,[r14+0xf0]
  c978a8:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  c978ad:	45 31 f6             	xor    r14d,r14d
  c978b0:	c7 44 24 18 00 00 00 	mov    DWORD PTR [rsp+0x18],0x0
  c978b7:	00 
  c978b8:	48 89 6c 24 50       	mov    QWORD PTR [rsp+0x50],rbp
  c978bd:	4c 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],r15
  c978c2:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
  c978c6:	48 8b 78 30          	mov    rdi,QWORD PTR [rax+0x30]
  c978ca:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c978cd:	ff 50 40             	call   QWORD PTR [rax+0x40]
  c978d0:	48 89 c3             	mov    rbx,rax
--
  c97d7a:	48 83 a4 24 e0 01 00 	and    QWORD PTR [rsp+0x1e0],0x0
  c97d81:	00 00 
  c97d83:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
  c97d8a:	00 
  c97d8b:	e8 da 09 ff ff       	call   c8876a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d570a>
  c97d90:	ff 44 24 18          	inc    DWORD PTR [rsp+0x18]
  c97d94:	48 8b 6c 24 50       	mov    rbp,QWORD PTR [rsp+0x50]
  c97d99:	4c 8b 7c 24 48       	mov    r15,QWORD PTR [rsp+0x48]
  c97d9e:	44 89 f0             	mov    eax,r14d
  c97da1:	f7 d0                	not    eax
  c97da3:	a8 0f                	test   al,0xf
  c97da5:	75 19                	jne    c97dc0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4d60>
  c97da7:	4c 89 ff             	mov    rdi,r15
  c97daa:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  c97daf:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  c97db5:	48 3b 44 24 68       	cmp    rax,QWORD PTR [rsp+0x68]
  c97dba:	0f 8f 7b 02 00 00    	jg     c9803b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4fdb>
  c97dc0:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  c97dc7:	00 
  c97dc8:	e8 e5 36 a0 00       	call   169b4b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4f61e>
  c97dcd:	4c 8b ac 24 c0 00 00 	mov    r13,QWORD PTR [rsp+0xc0]
  c97dd4:	00 
  c97dd5:	4c 89 ef             	mov    rdi,r13
  c97dd8:	e8 17 8c 9e 00       	call   16809f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b60>
  c97ddd:	41 ff c6             	inc    r14d
  c97de0:	4c 8b ac 24 c0 00 00 	mov    r13,QWORD PTR [rsp+0xc0]
  c97de7:	00 
  c97de8:	41 80 7d 30 00       	cmp    BYTE PTR [r13+0x30],0x0
  c97ded:	0f 85 cf fa ff ff    	jne    c978c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4862>
  c97df3:	e9 4e 01 00 00       	jmp    c97f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4ee6>
  c97df8:	48 39 e9             	cmp    rcx,rbp
  c97dfb:	72 0b                	jb     c97e08 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4da8>
  c97dfd:	48 89 c8             	mov    rax,rcx
  c97e00:	31 d2                	xor    edx,edx
  c97e02:	48 f7 f5             	div    rbp
  c97e05:	48 89 d1             	mov    rcx,rdx
  c97e08:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  c97e0b:	48 8b 54 24 28       	mov    rdx,QWORD PTR [rsp+0x28]
  c97e10:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
--
  c97f16:	48 85 ed             	test   rbp,rbp
  c97f19:	0f 85 a0 fd ff ff    	jne    c97cbf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4c5f>
  c97f1f:	48 89 df             	mov    rdi,rbx
  c97f22:	31 f6                	xor    esi,esi
  c97f24:	e8 6d 78 e0 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
  c97f29:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  c97f2e:	48 83 a0 e8 00 00 00 	and    QWORD PTR [rax+0xe8],0x0
  c97f35:	00 
  c97f36:	e9 82 fc ff ff       	jmp    c97bbd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e4b5d>
  c97f3b:	c7 44 24 18 00 00 00 	mov    DWORD PTR [rsp+0x18],0x0
  c97f42:	00 
  c97f43:	45 31 f6             	xor    r14d,r14d
  c97f46:	4c 89 ff             	mov    rdi,r15
  c97f49:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
  c97f4e:	41 ff 97 40 01 00 00 	call   QWORD PTR [r15+0x140]
  c97f55:	48 2b 44 24 38       	sub    rax,QWORD PTR [rsp+0x38]
  c97f5a:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
  c97f5f:	f3 0f 5e 05 71 69 6f 	divss  xmm0,DWORD PTR [rip+0xffffffffff6f6971]        # 38e8d8 <_ZTSSt12bad_any_cast@@Base-0x18f0>
  c97f66:	ff 
  c97f67:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
  c97f6b:	49 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [r15+0xf8]
  c97f72:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  c97f76:	48 8d 35 ff 9f 7b ff 	lea    rsi,[rip+0xffffffffff7b9fff]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  c97f7d:	48 8d 0d 90 19 6e ff 	lea    rcx,[rip+0xffffffffff6e1990]        # 379914 <_ZTSSt12bad_any_cast@@Base-0x168b4>
  c97f84:	6a 04                	push   0x4
  c97f86:	5f                   	pop    rdi
  c97f87:	ba 95 00 00 00       	mov    edx,0x95
  c97f8c:	45 89 f0             	mov    r8d,r14d
  c97f8f:	44 8b 4c 24 18       	mov    r9d,DWORD PTR [rsp+0x18]
  c97f94:	b0 01                	mov    al,0x1
  c97f96:	e8 37 e9 b3 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  c97f9b:	48 8d 9c 24 08 01 00 	lea    rbx,[rsp+0x108]
  c97fa2:	00 
  c97fa3:	66 83 63 f8 00       	and    WORD PTR [rbx-0x8],0x0
  c97fa8:	0f 57 c0             	xorps  xmm0,xmm0
  c97fab:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  c97fae:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  c97fb3:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
  c97fba:	00 
--
  cc4e5c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cc4e5f:	ff 90 58 01 00 00    	call   QWORD PTR [rax+0x158]
  cc4e65:	48 85 c0             	test   rax,rax
  cc4e68:	74 46                	je     cc4eb0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211e50>
  cc4e6a:	48 8b bb e0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5e0]
  cc4e71:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cc4e74:	ff 90 58 01 00 00    	call   QWORD PTR [rax+0x158]
  cc4e7a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  cc4e7d:	48 89 c7             	mov    rdi,rax
  cc4e80:	ff 51 48             	call   QWORD PTR [rcx+0x48]
  cc4e83:	48 85 c0             	test   rax,rax
  cc4e86:	74 28                	je     cc4eb0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211e50>
  cc4e88:	48 8b bb e0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5e0]
  cc4e8f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cc4e92:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  cc4e98:	48 89 d1             	mov    rcx,rdx
  cc4e9b:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
  cc4ea2:	48 99                	cqo
  cc4ea4:	48 f7 f9             	idiv   rcx
  cc4ea7:	48 03 83 50 06 00 00 	add    rax,QWORD PTR [rbx+0x650]
  cc4eae:	eb 07                	jmp    cc4eb7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211e57>
  cc4eb0:	48 8b 83 50 06 00 00 	mov    rax,QWORD PTR [rbx+0x650]
  cc4eb7:	5b                   	pop    rbx
  cc4eb8:	c3                   	ret
  cc4eb9:	cc                   	int3
  cc4eba:	53                   	push   rbx
  cc4ebb:	48 89 fb             	mov    rbx,rdi
  cc4ebe:	31 c0                	xor    eax,eax
  cc4ec0:	88 07                	mov    BYTE PTR [rdi],al
  cc4ec2:	88 47 10             	mov    BYTE PTR [rdi+0x10],al
  cc4ec5:	48 8b be e0 05 00 00 	mov    rdi,QWORD PTR [rsi+0x5e0]
  cc4ecc:	48 85 ff             	test   rdi,rdi
  cc4ecf:	74 14                	je     cc4ee5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211e85>
  cc4ed1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cc4ed4:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
  cc4eda:	48 89 03             	mov    QWORD PTR [rbx],rax
  cc4edd:	48 89 53 08          	mov    QWORD PTR [rbx+0x8],rdx
  cc4ee1:	c6 43 10 01          	mov    BYTE PTR [rbx+0x10],0x1
  cc4ee5:	48 89 d8             	mov    rax,rbx
--
  cccdf6:	4c 89 e7             	mov    rdi,r12
  cccdf9:	e8 d2 50 84 00       	call   1511ed0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x357454>
  cccdfe:	66 49 0f 6e c6       	movq   xmm0,r14
  ccce03:	66 49 0f 6e cc       	movq   xmm1,r12
  ccce08:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  ccce0c:	66 0f 7f 4c 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm1
  ccce12:	4d 8b af f0 03 00 00 	mov    r13,QWORD PTR [r15+0x3f0]
  ccce19:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
  ccce1d:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
  ccce24:	00 
  ccce25:	49 8b 9f 20 01 00 00 	mov    rbx,QWORD PTR [r15+0x120]
  ccce2c:	49 8d b7 28 01 00 00 	lea    rsi,[r15+0x128]
  ccce33:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
  ccce3a:	00 
  ccce3b:	41 ff 97 40 01 00 00 	call   QWORD PTR [r15+0x140]
  ccce42:	4c 89 fd             	mov    rbp,r15
  ccce45:	49 8b bf 00 04 00 00 	mov    rdi,QWORD PTR [r15+0x400]
  ccce4c:	48 85 ff             	test   rdi,rdi
  ccce4f:	74 0b                	je     ccce5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x219dfc>
  ccce51:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ccce54:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
  ccce5a:	eb 02                	jmp    ccce5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x219dfe>
  ccce5c:	31 c0                	xor    eax,eax
  ccce5e:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  ccce65:	00 
  ccce66:	4c 89 ac 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r13
  ccce6d:	00 
  ccce6e:	4c 89 a4 24 28 01 00 	mov    QWORD PTR [rsp+0x128],r12
  ccce75:	00 
  ccce76:	48 89 9c 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rbx
  ccce7d:	00 
  ccce7e:	4c 89 74 24 68       	mov    QWORD PTR [rsp+0x68],r14
  ccce83:	49 89 ed             	mov    r13,rbp
  ccce86:	48 8b b5 10 02 00 00 	mov    rsi,QWORD PTR [rbp+0x210]
  ccce8d:	48 8d bc 24 58 02 00 	lea    rdi,[rsp+0x258]
  ccce94:	00 
  ccce95:	e8 20 02 de ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
  ccce9a:	48 8d 94 24 18 0a 00 	lea    rdx,[rsp+0xa18]
  cccea1:	00 
--
  cdc4c1:	e8 4a 48 b1 00       	call   17f0d10 <llround@plt>
  cdc4c6:	48 89 03             	mov    QWORD PTR [rbx],rax
  cdc4c9:	48 c7 43 08 a8 ba 06 	mov    QWORD PTR [rbx+0x8],0x6baa8
  cdc4d0:	00 
  cdc4d1:	5b                   	pop    rbx
  cdc4d2:	c3                   	ret
  cdc4d3:	cc                   	int3
  cdc4d4:	41 57                	push   r15
  cdc4d6:	41 56                	push   r14
  cdc4d8:	53                   	push   rbx
  cdc4d9:	49 89 f6             	mov    r14,rsi
  cdc4dc:	48 89 fb             	mov    rbx,rdi
  cdc4df:	48 8b 7e 10          	mov    rdi,QWORD PTR [rsi+0x10]
  cdc4e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cdc4e6:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  cdc4ec:	49 89 c7             	mov    r15,rax
  cdc4ef:	4d 85 ff             	test   r15,r15
  cdc4f2:	74 26                	je     cdc51a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2294ba>
  cdc4f4:	49 83 7f 20 00       	cmp    QWORD PTR [r15+0x20],0x0
  cdc4f9:	75 33                	jne    cdc52e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2294ce>
  cdc4fb:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
  cdc4ff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cdc502:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
  cdc508:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
  cdc50c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cdc50f:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  cdc515:	49 89 c7             	mov    r15,rax
  cdc518:	eb d5                	jmp    cdc4ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22948f>
  cdc51a:	0f 57 c0             	xorps  xmm0,xmm0
  cdc51d:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  cdc520:	80 63 10 e0          	and    BYTE PTR [rbx+0x10],0xe0
  cdc524:	f3 0f 10 05 5c 21 6b 	movss  xmm0,DWORD PTR [rip+0xffffffffff6b215c]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
  cdc52b:	ff 
  cdc52c:	eb 6f                	jmp    cdc59d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22953d>
  cdc52e:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
  cdc532:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
  cdc536:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cdc539:	ff 50 10             	call   QWORD PTR [rax+0x10]
  cdc53c:	80 78 20 00          	cmp    BYTE PTR [rax+0x20],0x0
  cdc540:	74 46                	je     cdc588 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x229528>
  cdc542:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]
  cdc546:	48 8b 50 18          	mov    rdx,QWORD PTR [rax+0x18]
  cdc54a:	4c 89 f7             	mov    rdi,r14
  cdc54d:	e8 66 01 00 00       	call   cdc6b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x229658>
  cdc552:	49 8b 4f 18          	mov    rcx,QWORD PTR [r15+0x18]
  cdc556:	49 8b 57 20          	mov    rdx,QWORD PTR [r15+0x20]
  cdc55a:	48 39 c2             	cmp    rdx,rax
  cdc55d:	48 89 c6             	mov    rsi,rax
  cdc560:	48 0f 4c f2          	cmovl  rsi,rdx
  cdc564:	31 ff                	xor    edi,edi
--
  eb2edc:	48 89 84 24 f0 03 00 	mov    QWORD PTR [rsp+0x3f0],rax
  eb2ee3:	00 
  eb2ee4:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
  eb2eeb:	00 
  eb2eec:	48 89 84 24 f8 03 00 	mov    QWORD PTR [rsp+0x3f8],rax
  eb2ef3:	00 
  eb2ef4:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
  eb2efb:	00 
  eb2efc:	48 89 84 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rax
  eb2f03:	00 
  eb2f04:	4c 89 bc 24 10 04 00 	mov    QWORD PTR [rsp+0x410],r15
  eb2f0b:	00 
  eb2f0c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  eb2f0f:	4c 89 fe             	mov    rsi,r15
  eb2f12:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  eb2f18:	48 8d bc 24 f0 03 00 	lea    rdi,[rsp+0x3f0]
  eb2f1f:	00 
  eb2f20:	e8 45 70 bc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  eb2f25:	49 8b 9e 50 02 00 00 	mov    rbx,QWORD PTR [r14+0x250]
  eb2f2c:	4c 8d 84 24 c0 03 00 	lea    r8,[rsp+0x3c0]
  eb2f33:	00 
  eb2f34:	4d 89 30             	mov    QWORD PTR [r8],r14
  eb2f37:	48 8d 35 53 a1 be ff 	lea    rsi,[rip+0xffffffffffbea153]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  eb2f3e:	48 8d 0d 8f 03 00 00 	lea    rcx,[rip+0x38f]        # eb32d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6ea>
  eb2f45:	4c 8d bc 24 f0 03 00 	lea    r15,[rsp+0x3f0]
  eb2f4c:	00 
  eb2f4d:	6a 08                	push   0x8
  eb2f4f:	41 59                	pop    r9
  eb2f51:	4c 89 ff             	mov    rdi,r15
  eb2f54:	31 d2                	xor    edx,edx
  eb2f56:	e8 39 78 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  eb2f5b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  eb2f5e:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  eb2f65:	00 
  eb2f66:	48 89 de             	mov    rsi,rbx
  eb2f69:	4c 89 fa             	mov    rdx,r15
  eb2f6c:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
  eb2f72:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
  eb2f79:	00 
--
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
--
  fd38f6:	00 00 
  fd38f8:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  fd38fd:	48 89 d7             	mov    rdi,rdx
  fd3900:	e8 31 7f aa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  fd3905:	48 89 d1             	mov    rcx,rdx
  fd3908:	48 8d 3d 7b 37 37 ff 	lea    rdi,[rip+0xffffffffff37377b]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
  fd390f:	6a 07                	push   0x7
  fd3911:	5e                   	pop    rsi
  fd3912:	48 89 c2             	mov    rdx,rax
  fd3915:	e8 66 7f aa ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  fd391a:	84 c0                	test   al,al
  fd391c:	74 12                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd391e:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
  fd3923:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd3926:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  fd392c:	85 c0                	test   eax,eax
  fd392e:	74 4f                	je     fd397f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad95>
  fd3930:	49 83 c4 08          	add    r12,0x8
  fd3934:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
  fd3939:	4c 89 ef             	mov    rdi,r13
  fd393c:	4c 89 e6             	mov    rsi,r12
  fd393f:	4c 89 fa             	mov    rdx,r15
  fd3942:	4c 89 f1             	mov    rcx,r14
  fd3945:	e8 8a 30 00 00       	call   fd69d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ddea>
  fd394a:	48 89 df             	mov    rdi,rbx
  fd394d:	4c 89 ee             	mov    rsi,r13
  fd3950:	e8 7f 2c 00 00       	call   fd65d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9ea>
  fd3955:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fd3959:	e8 28 ab ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd395e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3965:	00 00 
  fd3967:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  fd396c:	75 48                	jne    fd39b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19adcc>
  fd396e:	48 89 d8             	mov    rax,rbx
  fd3971:	48 83 c4 20          	add    rsp,0x20
  fd3975:	5b                   	pop    rbx
  fd3976:	41 5c                	pop    r12
  fd3978:	41 5d                	pop    r13
  fd397a:	41 5e                	pop    r14
--
  ff6c78:	4c 8b b3 00 25 00 00 	mov    r14,QWORD PTR [rbx+0x2500]
  ff6c7f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  ff6c82:	48 89 df             	mov    rdi,rbx
  ff6c85:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
  ff6c8b:	49 89 c7             	mov    r15,rax
  ff6c8e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  ff6c91:	48 89 df             	mov    rdi,rbx
  ff6c94:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
  ff6c9a:	4c 8d a3 d0 21 00 00 	lea    r12,[rbx+0x21d0]
  ff6ca1:	4d 8b 06             	mov    r8,QWORD PTR [r14]
  ff6ca4:	4c 89 f7             	mov    rdi,r14
  ff6ca7:	4c 89 fe             	mov    rsi,r15
  ff6caa:	48 89 c2             	mov    rdx,rax
  ff6cad:	4c 89 e1             	mov    rcx,r12
  ff6cb0:	41 ff 90 40 01 00 00 	call   QWORD PTR [r8+0x140]
  ff6cb7:	84 c0                	test   al,al
  ff6cb9:	0f 84 f0 01 00 00    	je     ff6eaf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1be2c5>
  ff6cbf:	4c 89 e7             	mov    rdi,r12
  ff6cc2:	e8 95 69 f4 ff       	call   f3d65c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104a72>
  ff6cc7:	c6 83 e4 24 00 00 00 	mov    BYTE PTR [rbx+0x24e4],0x0
  ff6cce:	48 89 df             	mov    rdi,rbx
  ff6cd1:	e8 54 f8 ff ff       	call   ff652a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bd940>
  ff6cd6:	48 8d 35 33 d5 84 00 	lea    rsi,[rip+0x84d533]        # 1844210 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8f8>
  ff6cdd:	48 89 df             	mov    rdi,rbx
  ff6ce0:	e8 9d 0b 00 00       	call   ff7882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bec98>
  ff6ce5:	e9 9f 02 00 00       	jmp    ff6f89 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1be39f>
  ff6cea:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
  ff6cef:	80 7c 24 78 00       	cmp    BYTE PTR [rsp+0x78],0x0
  ff6cf4:	0f 84 77 01 00 00    	je     ff6e71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1be287>
  ff6cfa:	4c 8d ab f8 0d 00 00 	lea    r13,[rbx+0xdf8]
  ff6d01:	45 84 f6             	test   r14b,r14b
  ff6d04:	48 8d 05 09 11 00 00 	lea    rax,[rip+0x1109]        # ff7e14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bf22a>
  ff6d0b:	48 8d 0d 2c 12 00 00 	lea    rcx,[rip+0x122c]        # ff7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bf354>
  ff6d12:	48 0f 44 c8          	cmove  rcx,rax
  ff6d16:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
  ff6d1b:	c7 44 24 08 00 00 00 	mov    DWORD PTR [rsp+0x8],0x0
  ff6d22:	00 
  ff6d23:	4c 8d bc 24 a8 00 00 	lea    r15,[rsp+0xa8]
  ff6d2a:	00 
--
 1066525:	48 89 c3             	mov    rbx,rax
 1066528:	eb f3                	jmp    106651d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d933>
 106652a:	41 56                	push   r14
 106652c:	53                   	push   rbx
 106652d:	50                   	push   rax
 106652e:	48 89 fb             	mov    rbx,rdi
 1066531:	80 bf d0 07 00 00 00 	cmp    BYTE PTR [rdi+0x7d0],0x0
 1066538:	74 1f                	je     1066559 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d96f>
 106653a:	48 8d b3 68 01 00 00 	lea    rsi,[rbx+0x168]
 1066541:	4c 8b 73 10          	mov    r14,QWORD PTR [rbx+0x10]
 1066545:	48 89 df             	mov    rdi,rbx
 1066548:	e8 8f be ff ff       	call   10623dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2297f2>
 106654d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1066550:	4c 89 f7             	mov    rdi,r14
 1066553:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 1066559:	80 bb 40 0e 00 00 00 	cmp    BYTE PTR [rbx+0xe40],0x0
 1066560:	74 29                	je     106658b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d9a1>
 1066562:	48 8d b3 d8 07 00 00 	lea    rsi,[rbx+0x7d8]
 1066569:	4c 8b 73 10          	mov    r14,QWORD PTR [rbx+0x10]
 106656d:	48 89 df             	mov    rdi,rbx
 1066570:	e8 67 be ff ff       	call   10623dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2297f2>
 1066575:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1066578:	48 8b 80 48 01 00 00 	mov    rax,QWORD PTR [rax+0x148]
 106657f:	4c 89 f7             	mov    rdi,r14
 1066582:	48 83 c4 08          	add    rsp,0x8
 1066586:	5b                   	pop    rbx
 1066587:	41 5e                	pop    r14
 1066589:	ff e0                	jmp    rax
 106658b:	48 83 c4 08          	add    rsp,0x8
 106658f:	5b                   	pop    rbx
 1066590:	41 5e                	pop    r14
 1066592:	c3                   	ret
 1066593:	cc                   	int3
 1066594:	48 83 c7 08          	add    rdi,0x8
 1066598:	48 8d 35 dd b9 3e ff 	lea    rsi,[rip+0xffffffffff3eb9dd]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 106659f:	e9 da 34 a1 ff       	jmp    a79a7e <JNI_OnUnload@@Base+0x134b>
 10665a4:	55                   	push   rbp
 10665a5:	41 57                	push   r15
 10665a7:	41 56                	push   r14
--
 10a670a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10a670d:	8b 00                	mov    eax,DWORD PTR [rax]
 10a670f:	48 83 f8 05          	cmp    rax,0x5
 10a6713:	77 0c                	ja     10a6721 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26db37>
 10a6715:	48 8d 0d 8c 0c 33 ff 	lea    rcx,[rip+0xffffffffff330c8c]        # 3d73a8 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f8d>
 10a671c:	8b 34 81             	mov    esi,DWORD PTR [rcx+rax*4]
 10a671f:	eb 03                	jmp    10a6724 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26db3a>
 10a6721:	6a 05                	push   0x5
 10a6723:	5e                   	pop    rsi
 10a6724:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10a6728:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a672b:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
 10a6731:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10a6735:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a6738:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 10a673e:	85 c0                	test   eax,eax
 10a6740:	74 35                	je     10a6777 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26db8d>
 10a6742:	48 8d 35 5d 57 28 ff 	lea    rsi,[rip+0xffffffffff28575d]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
 10a6749:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6750:	00 
 10a6751:	e8 28 33 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a6756:	49 8d be b0 16 00 00 	lea    rdi,[r14+0x16b0]
 10a675d:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
 10a6764:	00 
 10a6765:	e8 26 73 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
 10a676a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6771:	00 
 10a6772:	e8 19 77 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a6777:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10a677a:	4c 89 f7             	mov    rdi,r14
 10a677d:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
 10a6783:	84 c0                	test   al,al
 10a6785:	75 35                	jne    10a67bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dbd2>
 10a6787:	48 8d 35 9a 52 28 ff 	lea    rsi,[rip+0xffffffffff28529a]        # 32ba28 <_ZTSSt12bad_any_cast@@Base-0x647a0>
 10a678e:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
 10a6795:	00 
 10a6796:	e8 e3 32 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10a679b:	49 8d be 70 17 00 00 	lea    rdi,[r14+0x1770]
 10a67a2:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
--
 10b844d:	e8 5e 76 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10b8452:	48 89 c7             	mov    rdi,rax
 10b8455:	e8 4b 16 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10b845a:	41 57                	push   r15
 10b845c:	41 56                	push   r14
 10b845e:	53                   	push   rbx
 10b845f:	48 83 ec 30          	sub    rsp,0x30
 10b8463:	49 89 ce             	mov    r14,rcx
 10b8466:	48 89 fb             	mov    rbx,rdi
 10b8469:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b8470:	00 00 
 10b8472:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 10b8477:	48 8b 7e 20          	mov    rdi,QWORD PTR [rsi+0x20]
 10b847b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b847e:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 10b8484:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
 10b8489:	49 83 27 00          	and    QWORD PTR [r15],0x0
 10b848d:	83 f8 03             	cmp    eax,0x3
 10b8490:	6a 01                	push   0x1
 10b8492:	59                   	pop    rcx
 10b8493:	0f 42 c8             	cmovb  ecx,eax
 10b8496:	48 8d 05 23 4f 79 00 	lea    rax,[rip+0x794f23]        # 184d3c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9aa8>
 10b849d:	49 89 47 f8          	mov    QWORD PTR [r15-0x8],rax
 10b84a1:	41 89 4f 10          	mov    DWORD PTR [r15+0x10],ecx
 10b84a5:	49 c7 47 08 01 00 00 	mov    QWORD PTR [r15+0x8],0x1
 10b84ac:	00 
 10b84ad:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 10b84b0:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 10b84b5:	e8 a2 93 52 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
 10b84ba:	48 89 df             	mov    rdi,rbx
 10b84bd:	e8 6f 92 52 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
 10b84c2:	4c 89 ff             	mov    rdi,r15
 10b84c5:	e8 3e 25 9f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10b84ca:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b84d1:	00 00 
 10b84d3:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
 10b84d8:	75 0d                	jne    10b84e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f8fd>
 10b84da:	48 89 d8             	mov    rax,rbx
 10b84dd:	48 83 c4 30          	add    rsp,0x30
--
 1283696:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1283699:	6a 01                	push   0x1
 128369b:	5e                   	pop    rsi
 128369c:	48 89 df             	mov    rdi,rbx
 128369f:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]
 12836a5:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 12836a8:	6a 01                	push   0x1
 12836aa:	5e                   	pop    rsi
 12836ab:	48 89 df             	mov    rdi,rbx
 12836ae:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
 12836b4:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 12836b7:	6a 01                	push   0x1
 12836b9:	5e                   	pop    rsi
 12836ba:	48 89 df             	mov    rdi,rbx
 12836bd:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 12836c3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 12836c6:	6a 01                	push   0x1
 12836c8:	5e                   	pop    rsi
 12836c9:	48 89 df             	mov    rdi,rbx
 12836cc:	ff 90 50 01 00 00    	call   QWORD PTR [rax+0x150]
 12836d2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 12836d5:	48 89 df             	mov    rdi,rbx
 12836d8:	ff 90 50 02 00 00    	call   QWORD PTR [rax+0x250]
 12836de:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 12836e1:	6a 01                	push   0x1
 12836e3:	5e                   	pop    rsi
 12836e4:	48 89 df             	mov    rdi,rbx
 12836e7:	ff 90 60 02 00 00    	call   QWORD PTR [rax+0x260]
 12836ed:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 12836f0:	48 89 df             	mov    rdi,rbx
 12836f3:	ff 90 f0 02 00 00    	call   QWORD PTR [rax+0x2f0]
 12836f9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 12836fc:	48 89 df             	mov    rdi,rbx
 12836ff:	ff 90 00 03 00 00    	call   QWORD PTR [rax+0x300]
 1283705:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1283708:	48 89 df             	mov    rdi,rbx
 128370b:	5b                   	pop    rbx
 128370c:	ff a0 10 03 00 00    	jmp    QWORD PTR [rax+0x310]
 1283712:	48 89 c7             	mov    rdi,rax
--
 12837d2:	48 89 df             	mov    rdi,rbx
 12837d5:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
 12837db:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
 12837e2:	00 
 12837e3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 12837e6:	48 89 df             	mov    rdi,rbx
 12837e9:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 12837ef:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 12837f4:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 12837f7:	48 89 df             	mov    rdi,rbx
 12837fa:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
 1283800:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 1283805:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1283808:	48 89 df             	mov    rdi,rbx
 128380b:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 1283811:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 1283816:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1283819:	48 89 df             	mov    rdi,rbx
 128381c:	ff 90 90 01 00 00    	call   QWORD PTR [rax+0x190]
 1283822:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 1283827:	4d 8b be 88 06 00 00 	mov    r15,QWORD PTR [r14+0x688]
 128382e:	4c 89 74 24 78       	mov    QWORD PTR [rsp+0x78],r14
 1283833:	49 8b 86 90 06 00 00 	mov    rax,QWORD PTR [r14+0x690]
 128383a:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 1283841:	00 
 1283842:	49 39 c7             	cmp    r15,rax
 1283845:	0f 84 07 09 00 00    	je     1284152 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc96d6>
 128384b:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
 1283850:	48 83 c0 08          	add    rax,0x8
 1283854:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
 128385b:	00 
 128385c:	4c 89 ff             	mov    rdi,r15
 128385f:	e8 5c be 81 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
 1283864:	48 89 c3             	mov    rbx,rax
 1283867:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
 128386c:	4c 8b 60 08          	mov    r12,QWORD PTR [rax+0x8]
 1283870:	4d 85 e4             	test   r12,r12
 1283873:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
 1283878:	74 15                	je     128388f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8e13>
--
 1365416:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1365419:	ff a0 c0 01 00 00    	jmp    QWORD PTR [rax+0x1c0]
 136541f:	cc                   	int3
 1365420:	41 57                	push   r15
 1365422:	41 56                	push   r14
 1365424:	53                   	push   rbx
 1365425:	48 83 ec 20          	sub    rsp,0x20
 1365429:	49 89 f7             	mov    r15,rsi
 136542c:	48 89 fb             	mov    rbx,rdi
 136542f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1365436:	00 00 
 1365438:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 136543d:	48 8b 7e 18          	mov    rdi,QWORD PTR [rsi+0x18]
 1365441:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1365444:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 136544a:	49 89 c6             	mov    r14,rax
 136544d:	4d 85 f6             	test   r14,r14
 1365450:	74 28                	je     136547a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa9fe>
 1365452:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
 1365456:	48 85 c0             	test   rax,rax
 1365459:	75 36                	jne    1365491 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aaa15>
 136545b:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
 136545f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1365462:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
 1365468:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
 136546c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 136546f:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 1365475:	49 89 c6             	mov    r14,rax
 1365478:	eb d3                	jmp    136544d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa9d1>
 136547a:	0f 57 c0             	xorps  xmm0,xmm0
 136547d:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 1365480:	80 63 10 e0          	and    BYTE PTR [rbx+0x10],0xe0
 1365484:	f3 0f 10 05 fc 91 02 	movss  xmm0,DWORD PTR [rip+0xffffffffff0291fc]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
 136548b:	ff 
 136548c:	e9 ad 00 00 00       	jmp    136553e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aaac2>
 1365491:	41 80 bf 80 00 00 00 	cmp    BYTE PTR [r15+0x80],0x0
 1365498:	00 
 1365499:	0f 84 87 00 00 00    	je     1365526 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aaaaa>
 136549f:	41 8b 57 20          	mov    edx,DWORD PTR [r15+0x20]
 13654a3:	49 8b 7f 70          	mov    rdi,QWORD PTR [r15+0x70]
 13654a7:	49 8b 77 78          	mov    rsi,QWORD PTR [r15+0x78]
 13654ab:	e8 54 01 00 00       	call   1365604 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aab88>
 13654b0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 13654b5:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
 13654ba:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
 13654be:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13654c1:	ff 90 f8 00 00 00    	call   QWORD PTR [rax+0xf8]
 13654c7:	4d 63 7f 20          	movsxd r15,DWORD PTR [r15+0x20]
 13654cb:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 13654d0:	48 89 c6             	mov    rsi,rax
 13654d3:	4c 89 fa             	mov    rdx,r15
--
 13d26ce:	48 83 c7 08          	add    rdi,0x8
 13d26d2:	e9 8f 77 40 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 13d26d7:	cc                   	int3
 13d26d8:	44 89 c2             	mov    edx,r8d
 13d26db:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13d26de:	48 8b 00             	mov    rax,QWORD PTR [rax]
 13d26e1:	89 ce                	mov    esi,ecx
 13d26e3:	ff e0                	jmp    rax
 13d26e5:	cc                   	int3
 13d26e6:	53                   	push   rbx
 13d26e7:	48 89 fb             	mov    rbx,rdi
 13d26ea:	89 57 60             	mov    DWORD PTR [rdi+0x60],edx
 13d26ed:	89 4f 64             	mov    DWORD PTR [rdi+0x64],ecx
 13d26f0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13d26f3:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 13d26f9:	8b 73 68             	mov    esi,DWORD PTR [rbx+0x68]
 13d26fc:	48 89 df             	mov    rdi,rbx
 13d26ff:	5b                   	pop    rbx
 13d2700:	e9 e3 00 00 00       	jmp    13d27e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x217d6c>
 13d2705:	cc                   	int3
 13d2706:	53                   	push   rbx
 13d2707:	48 89 fb             	mov    rbx,rdi
 13d270a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13d270d:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
 13d2713:	84 c0                	test   al,al
 13d2715:	74 04                	je     13d271b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x217c9f>
 13d2717:	31 c0                	xor    eax,eax
 13d2719:	eb 11                	jmp    13d272c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x217cb0>
 13d271b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 13d271e:	48 89 df             	mov    rdi,rbx
 13d2721:	ff 50 60             	call   QWORD PTR [rax+0x60]
 13d2724:	89 c1                	mov    ecx,eax
 13d2726:	b0 01                	mov    al,0x1
 13d2728:	84 c9                	test   cl,cl
 13d272a:	74 02                	je     13d272e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x217cb2>
 13d272c:	5b                   	pop    rbx
 13d272d:	c3                   	ret
 13d272e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 13d2731:	48 89 df             	mov    rdi,rbx
--
 13e9881:	5d                   	pop    rbp
 13e9882:	c3                   	ret
 13e9883:	e8 28 62 40 00       	call   17efab0 <__stack_chk_fail@plt>
 13e9888:	41 57                	push   r15
 13e988a:	41 56                	push   r14
 13e988c:	53                   	push   rbx
 13e988d:	8b 8f bc 01 00 00    	mov    ecx,DWORD PTR [rdi+0x1bc]
 13e9893:	b8 9b fc ff ff       	mov    eax,0xfffffc9b
 13e9898:	83 f9 0c             	cmp    ecx,0xc
 13e989b:	0f 84 89 00 00 00    	je     13e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22eeae>
 13e98a1:	48 89 fb             	mov    rbx,rdi
 13e98a4:	e8 29 a7 ff ff       	call   13e3fd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x229556>
 13e98a9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 13e98ac:	48 89 df             	mov    rdi,rbx
 13e98af:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 13e98b5:	6a 0c                	push   0xc
 13e98b7:	58                   	pop    rax
 13e98b8:	87 83 bc 01 00 00    	xchg   DWORD PTR [rbx+0x1bc],eax
 13e98be:	4c 8b b3 48 01 00 00 	mov    r14,QWORD PTR [rbx+0x148]
 13e98c5:	48 83 a3 48 01 00 00 	and    QWORD PTR [rbx+0x148],0x0
 13e98cc:	00 
 13e98cd:	4d 85 f6             	test   r14,r14
 13e98d0:	74 20                	je     13e98f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ee76>
 13e98d2:	4c 8d bb f0 00 00 00 	lea    r15,[rbx+0xf0]
 13e98d9:	4c 89 ff             	mov    rdi,r15
 13e98dc:	e8 1f 48 40 00       	call   17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>
 13e98e1:	49 8b 06             	mov    rax,QWORD PTR [r14]
 13e98e4:	4c 89 f7             	mov    rdi,r14
 13e98e7:	ff 50 30             	call   QWORD PTR [rax+0x30]
 13e98ea:	4c 89 ff             	mov    rdi,r15
 13e98ed:	e8 fe 47 40 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
 13e98f2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 13e98f5:	48 89 df             	mov    rdi,rbx
 13e98f8:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
 13e98fe:	48 83 a3 50 01 00 00 	and    QWORD PTR [rbx+0x150],0x0
 13e9905:	00 
 13e9906:	e8 a7 00 00 00       	call   13e99b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ef36>
 13e990b:	48 8d 3d ce 4e 60 00 	lea    rdi,[rip+0x604ece]        # 19ee7e0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x5418>
 13e9912:	e8 d9 47 40 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
--
 14841f0:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9
 14841f5:	4c 89 c3             	mov    rbx,r8
 14841f8:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
 14841fd:	49 89 d5             	mov    r13,rdx
 1484200:	48 89 f5             	mov    rbp,rsi
 1484203:	49 89 ff             	mov    r15,rdi
 1484206:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 148420d:	00 00 
 148420f:	48 89 84 24 f0 0b 00 	mov    QWORD PTR [rsp+0xbf0],rax
 1484216:	00 
 1484217:	44 8b a6 88 00 00 00 	mov    r12d,DWORD PTR [rsi+0x88]
 148421e:	49 8b 00             	mov    rax,QWORD PTR [r8]
 1484221:	4c 89 c7             	mov    rdi,r8
 1484224:	44 89 e6             	mov    esi,r12d
 1484227:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 148422d:	84 c0                	test   al,al
 148422f:	0f 84 df 0b 00 00    	je     1484e14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca398>
 1484235:	45 85 e4             	test   r12d,r12d
 1484238:	0f 84 07 0c 00 00    	je     1484e45 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca3c9>
 148423e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1484241:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 1484246:	48 89 de             	mov    rsi,rbx
 1484249:	44 89 e2             	mov    edx,r12d
 148424c:	ff 90 38 01 00 00    	call   QWORD PTR [rax+0x138]
 1484252:	8b 45 10             	mov    eax,DWORD PTR [rbp+0x10]
 1484255:	a8 01                	test   al,0x1
 1484257:	74 19                	je     1484272 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c97f6>
 1484259:	48 8b 4d 18          	mov    rcx,QWORD PTR [rbp+0x18]
 148425d:	48 85 c9             	test   rcx,rcx
 1484260:	48 8d 15 b9 c0 4b 00 	lea    rdx,[rip+0x4bc0b9]        # 1940320 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x8f68>
 1484267:	48 0f 45 d1          	cmovne rdx,rcx
 148426b:	8b 4a 18             	mov    ecx,DWORD PTR [rdx+0x18]
 148426e:	89 4c 24 60          	mov    DWORD PTR [rsp+0x60],ecx
 1484272:	a8 02                	test   al,0x2
 1484274:	74 19                	je     148428f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9813>
 1484276:	48 8b 4d 20          	mov    rcx,QWORD PTR [rbp+0x20]
 148427a:	48 85 c9             	test   rcx,rcx
 148427d:	48 8d 15 1c c2 4b 00 	lea    rdx,[rip+0x4bc21c]        # 19404a0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x90e8>
 1484284:	48 0f 45 d1          	cmovne rdx,rcx
--
 1487a5d:	e8 44 5d 12 00       	call   15ad7a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f2d2a>
 1487a62:	e9 e9 f4 ff ff       	jmp    1486f50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cc4d4>
 1487a67:	44 88 54 24 08       	mov    BYTE PTR [rsp+0x8],r10b
 1487a6c:	44 89 c5             	mov    ebp,r8d
 1487a6f:	48 8b 84 24 a0 0d 00 	mov    rax,QWORD PTR [rsp+0xda0]
 1487a76:	00 
 1487a77:	48 85 c0             	test   rax,rax
 1487a7a:	4c 8d 2d ff 8c 4b 00 	lea    r13,[rip+0x4b8cff]        # 1940780 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x93c8>
 1487a81:	4c 0f 45 e8          	cmovne r13,rax
 1487a85:	41 8b b5 88 00 00 00 	mov    esi,DWORD PTR [r13+0x88]
 1487a8c:	4c 8b bc 24 20 0e 00 	mov    r15,QWORD PTR [rsp+0xe20]
 1487a93:	00 
 1487a94:	49 8b 07             	mov    rax,QWORD PTR [r15]
 1487a97:	4c 89 ff             	mov    rdi,r15
 1487a9a:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 1487aa0:	84 c0                	test   al,al
 1487aa2:	0f 84 86 00 00 00    	je     1487b2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cd0b2>
 1487aa8:	48 8b 84 24 98 0d 00 	mov    rax,QWORD PTR [rsp+0xd98]
 1487aaf:	00 
 1487ab0:	48 85 c0             	test   rax,rax
 1487ab3:	48 8d 0d d6 88 4b 00 	lea    rcx,[rip+0x4b88d6]        # 1940390 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x8fd8>
 1487aba:	48 0f 45 c8          	cmovne rcx,rax
 1487abe:	48 8d 84 24 30 0e 00 	lea    rax,[rsp+0xe30]
 1487ac5:	00 
 1487ac6:	f2 0f 10 00          	movsd  xmm0,QWORD PTR [rax]
 1487aca:	48 8d 84 24 40 0e 00 	lea    rax,[rsp+0xe40]
 1487ad1:	00 
 1487ad2:	f2 0f 10 08          	movsd  xmm1,QWORD PTR [rax]
 1487ad6:	0f b6 44 24 08       	movzx  eax,BYTE PTR [rsp+0x8]
 1487adb:	44 0f b6 d5          	movzx  r10d,bpl
 1487adf:	48 8d 94 24 80 05 00 	lea    rdx,[rsp+0x580]
 1487ae6:	00 
 1487ae7:	48 89 df             	mov    rdi,rbx
 1487aea:	4c 89 ee             	mov    rsi,r13
 1487aed:	4d 89 f8             	mov    r8,r15
 1487af0:	4c 8b 8c 24 28 0e 00 	mov    r9,QWORD PTR [rsp+0xe28]
 1487af7:	00 
 1487af8:	50                   	push   rax
 1487af9:	41 52                	push   r10
--
 14b4721:	e8 7f 53 5c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 14b4726:	41 57                	push   r15
 14b4728:	41 56                	push   r14
 14b472a:	53                   	push   rbx
 14b472b:	48 83 ec 20          	sub    rsp,0x20
 14b472f:	49 89 ce             	mov    r14,rcx
 14b4732:	48 89 fb             	mov    rbx,rdi
 14b4735:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14b473c:	00 00 
 14b473e:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 14b4743:	4c 8b 7e 20          	mov    r15,QWORD PTR [rsi+0x20]
 14b4747:	0f b6 72 18          	movzx  esi,BYTE PTR [rdx+0x18]
 14b474b:	49 8b 07             	mov    rax,QWORD PTR [r15]
 14b474e:	4c 89 ff             	mov    rdi,r15
 14b4751:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 14b4757:	49 8b 07             	mov    rax,QWORD PTR [r15]
 14b475a:	4c 89 ff             	mov    rdi,r15
 14b475d:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 14b4763:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 14b4766:	49 89 e6             	mov    r14,rsp
 14b4769:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
 14b476e:	41 83 66 10 00       	and    DWORD PTR [r14+0x10],0x0
 14b4773:	48 8d 05 be 45 3f 00 	lea    rax,[rip+0x3f45be]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>
 14b477a:	49 89 06             	mov    QWORD PTR [r14],rax
 14b477d:	4c 89 f6             	mov    rsi,r14
 14b4780:	e8 d7 d0 12 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
 14b4785:	4c 89 f7             	mov    rdi,r14
 14b4788:	e8 93 52 28 00       	call   1739a20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xedb8c>
 14b478d:	48 89 df             	mov    rdi,rbx
 14b4790:	e8 9c cf 12 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
 14b4795:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14b479c:	00 00 
 14b479e:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 14b47a3:	75 0d                	jne    14b47b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f9d36>
 14b47a5:	48 89 d8             	mov    rax,rbx
 14b47a8:	48 83 c4 20          	add    rsp,0x20
 14b47ac:	5b                   	pop    rbx
 14b47ad:	41 5e                	pop    r14
 14b47af:	41 5f                	pop    r15
--
 1562b14:	48 89 c7             	mov    rdi,rax
 1562b17:	e8 1a 8d 51 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1562b1c:	4c 89 ef             	mov    rdi,r13
 1562b1f:	48 89 c6             	mov    rsi,rax
 1562b22:	48 8d 0d 41 83 de fe 	lea    rcx,[rip+0xfffffffffede8341]        # 34ae6a <_ZTSSt12bad_any_cast@@Base-0x4535e>
 1562b29:	6a 0b                	push   0xb
 1562b2b:	41 58                	pop    r8
 1562b2d:	4d 89 e1             	mov    r9,r12
 1562b30:	e8 8f 91 10 00       	call   166bcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fe30>
 1562b35:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1562b38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1562b3b:	4c 89 fe             	mov    rsi,r15
 1562b3e:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
 1562b43:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 1562b48:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
 1562b4e:	40 08 c5             	or     bpl,al
 1562b51:	4c 89 ef             	mov    rdi,r13
 1562b54:	e8 77 92 10 00       	call   166bdd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff3c>
 1562b59:	48 83 c3 10          	add    rbx,0x10
 1562b5d:	4c 39 f3             	cmp    rbx,r14
 1562b60:	75 a9                	jne    1562b0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a808f>
 1562b62:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
 1562b67:	e8 dc 1c 55 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
 1562b6c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1562b73:	00 00 
 1562b75:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
 1562b7c:	00 
 1562b7d:	75 4f                	jne    1562bce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a8152>
 1562b7f:	40 80 e5 01          	and    bpl,0x1
 1562b83:	89 e8                	mov    eax,ebp
 1562b85:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
 1562b8c:	5b                   	pop    rbx
 1562b8d:	41 5c                	pop    r12
 1562b8f:	41 5d                	pop    r13
 1562b91:	41 5e                	pop    r14
 1562b93:	41 5f                	pop    r15
 1562b95:	5d                   	pop    rbp
 1562b96:	c3                   	ret
 1562b97:	48 89 c3             	mov    rbx,rax

## Exact skip-ad references
  fd3805:	e9 16 a7 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd380a:	e9 dd fb ff ff       	jmp    fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd380f:	cc                   	int3
  fd3810:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  fd3814:	e9 db ff ff ff       	jmp    fd37f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac0a>
  fd3819:	cc                   	int3
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
  fd38d6:	41 57                	push   r15
  fd38d8:	41 56                	push   r14
  fd38da:	41 55                	push   r13
  fd38dc:	41 54                	push   r12
  fd38de:	53                   	push   rbx
  fd38df:	48 83 ec 20          	sub    rsp,0x20
  fd38e3:	49 89 ce             	mov    r14,rcx
  fd38e6:	49 89 d7             	mov    r15,rdx
  fd38e9:	49 89 f4             	mov    r12,rsi
  fd38ec:	48 89 fb             	mov    rbx,rdi
  fd38ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd38f6:	00 00 
  fd38f8:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  fd38fd:	48 89 d7             	mov    rdi,rdx
  fd3900:	e8 31 7f aa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  fd3905:	48 89 d1             	mov    rcx,rdx
  fd3908:	48 8d 3d 7b 37 37 ff 	lea    rdi,[rip+0xffffffffff37377b]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
  fd390f:	6a 07                	push   0x7
  fd3911:	5e                   	pop    rsi
  fd3912:	48 89 c2             	mov    rdx,rax
  fd3915:	e8 66 7f aa ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  fd391a:	84 c0                	test   al,al
  fd391c:	74 12                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd391e:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
  fd3923:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd3926:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  fd392c:	85 c0                	test   eax,eax
  fd392e:	74 4f                	je     fd397f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad95>
  fd3930:	49 83 c4 08          	add    r12,0x8
  fd3934:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
  fd3939:	4c 89 ef             	mov    rdi,r13
  fd393c:	4c 89 e6             	mov    rsi,r12
  fd393f:	4c 89 fa             	mov    rdx,r15
  fd3942:	4c 89 f1             	mov    rcx,r14
  fd3945:	e8 8a 30 00 00       	call   fd69d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ddea>
  fd394a:	48 89 df             	mov    rdi,rbx
  fd394d:	4c 89 ee             	mov    rsi,r13
  fd3950:	e8 7f 2c 00 00       	call   fd65d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9ea>
  fd3955:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fd3959:	e8 28 ab ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd395e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3965:	00 00 
  fd3967:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  fd396c:	75 48                	jne    fd39b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19adcc>
  fd396e:	48 89 d8             	mov    rax,rbx
  fd3971:	48 83 c4 20          	add    rsp,0x20
  fd3975:	5b                   	pop    rbx
  fd3976:	41 5c                	pop    r12
  fd3978:	41 5d                	pop    r13
  fd397a:	41 5e                	pop    r14
  fd397c:	41 5f                	pop    r15
  fd397e:	c3                   	ret
  fd397f:	41 80 7c 24 68 00    	cmp    BYTE PTR [r12+0x68],0x0
  fd3985:	74 a9                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3987:	41 80 7e 60 00       	cmp    BYTE PTR [r14+0x60],0x0
  fd398c:	74 a2                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd398e:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
  fd3992:	49 3b 44 24 58       	cmp    rax,QWORD PTR [r12+0x58]
  fd3997:	7e 97                	jle    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3999:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
  fd399e:	48 39 f0             	cmp    rax,rsi
  fd39a1:	7d 8d                	jge    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd39a3:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
  fd39a8:	48 ff c6             	inc    rsi
  fd39ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd39ae:	ff 50 20             	call   QWORD PTR [rax+0x20]
  fd39b1:	e9 7a ff ff ff       	jmp    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd39b6:	e8 f5 c0 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd39bb:	cc                   	int3
  fd39bc:	55                   	push   rbp
  fd39bd:	41 57                	push   r15
  fd39bf:	41 56                	push   r14
  fd39c1:	41 55                	push   r13
  fd39c3:	41 54                	push   r12
  fd39c5:	53                   	push   rbx
  fd39c6:	48 81 ec 58 01 00 00 	sub    rsp,0x158
  fd39cd:	49 89 f4             	mov    r12,rsi
--
 120446c:	4c 89 39             	mov    QWORD PTR [rcx],r15
 120446f:	48 8d 05 ea 20 00 00 	lea    rax,[rip+0x20ea]        # 1206560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bae4>
 1204476:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 120447a:	48 8d 05 09 21 00 00 	lea    rax,[rip+0x2109]        # 120658a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bb0e>
 1204481:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 1204485:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 1204489:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 120448e:	4c 89 ee             	mov    rsi,r13
 1204491:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
 1204496:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1204499:	49 81 c6 f0 11 00 00 	add    r14,0x11f0
 12044a0:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
 12044a5:	4c 89 f7             	mov    rdi,r14
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
 120456f:	00 
 1204570:	e8 ed f9 cc ff       	call   ed3f62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9b378>
 1204575:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 1204579:	0f 84 41 03 00 00    	je     12048c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49e44>
 120457f:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
 1204586:	00 
 1204587:	e8 aa 72 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 120458c:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204593:	00 
 1204594:	48 89 c6             	mov    rsi,rax
 1204597:	e8 b6 b2 57 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 120459c:	84 c0                	test   al,al
 120459e:	0f 84 1c 03 00 00    	je     12048c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49e44>
 12045a4:	80 bd 08 0a 00 00 00 	cmp    BYTE PTR [rbp+0xa08],0x0
 12045ab:	0f 84 a4 02 00 00    	je     1204855 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49dd9>
 12045b1:	48 8d b5 b0 05 00 00 	lea    rsi,[rbp+0x5b0]
 12045b8:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 12045bd:	e8 7e 99 5e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 12045c2:	e9 9f 02 00 00       	jmp    1204866 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49dea>
 12045c7:	48 8d 35 c6 63 17 ff 	lea    rsi,[rip+0xffffffffff1763c6]        # 37a994 <_ZTSSt12bad_any_cast@@Base-0x15834>
 12045ce:	48 89 df             	mov    rdi,rbx
 12045d1:	e8 79 72 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12045d6:	84 c0                	test   al,al
 12045d8:	0f 84 88 00 00 00    	je     1204666 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49bea>
