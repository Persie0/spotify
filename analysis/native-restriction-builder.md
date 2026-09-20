# Orbit restriction-builder function

Function range from ELF .eh_frame grouping: 0x10a6464..0x10a7f52.

This one native function contains the main direct xref clusters for both mft_disallow and ad_disallow.

## Referenced printable strings in source order


## Unique strings


## Restriction-reason assignments

## Function prologue

    
    /tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64
    
    
    Disassembly of section .text:
    
    00000000010a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>:
     10a6464:	55                   	push   rbp
     10a6465:	41 57                	push   r15
     10a6467:	41 56                	push   r14
     10a6469:	41 55                	push   r13
     10a646b:	41 54                	push   r12
     10a646d:	53                   	push   rbx
     10a646e:	48 81 ec 38 08 00 00 	sub    rsp,0x838
     10a6475:	89 f5                	mov    ebp,esi
     10a6477:	49 89 fe             	mov    r14,rdi
     10a647a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a6481:	00 00 
     10a6483:	48 89 84 24 30 08 00 	mov    QWORD PTR [rsp+0x830],rax
     10a648a:	00 
     10a648b:	48 8d 9f 58 14 00 00 	lea    rbx,[rdi+0x1458]
     10a6492:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     10a6497:	48 89 de             	mov    rsi,rbx
     10a649a:	e8 95 e5 c4 ff       	call   cf4a34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2419d4>
     10a649f:	48 8d 84 24 48 04 00 	lea    rax,[rsp+0x448]
     10a64a6:	00 
     10a64a7:	0f 57 c0             	xorps  xmm0,xmm0
     10a64aa:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64ad:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64b1:	48 8d 84 24 60 04 00 	lea    rax,[rsp+0x460]
     10a64b8:	00 
     10a64b9:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64bc:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64c0:	48 8d 84 24 78 04 00 	lea    rax,[rsp+0x478]
     10a64c7:	00 
     10a64c8:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64cb:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64cf:	48 8d 84 24 90 04 00 	lea    rax,[rsp+0x490]
     10a64d6:	00 
     10a64d7:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64da:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64de:	48 8d 84 24 a8 04 00 	lea    rax,[rsp+0x4a8]
     10a64e5:	00 
     10a64e6:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64e9:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64ed:	48 8d 84 24 c0 04 00 	lea    rax,[rsp+0x4c0]
     10a64f4:	00 
     10a64f5:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64f8:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64fc:	48 8d 84 24 d8 04 00 	lea    rax,[rsp+0x4d8]
     10a6503:	00 
     10a6504:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6507:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a650b:	48 8d 84 24 f0 04 00 	lea    rax,[rsp+0x4f0]
     10a6512:	00 
     10a6513:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6516:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a651a:	48 8d 84 24 08 05 00 	lea    rax,[rsp+0x508]
     10a6521:	00 
     10a6522:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6525:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6529:	48 8d 84 24 20 05 00 	lea    rax,[rsp+0x520]
     10a6530:	00 
     10a6531:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6534:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6538:	48 8d 84 24 38 05 00 	lea    rax,[rsp+0x538]
     10a653f:	00 
     10a6540:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6543:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6547:	48 8d 84 24 50 05 00 	lea    rax,[rsp+0x550]
     10a654e:	00 
     10a654f:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6552:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6556:	48 8d 84 24 68 05 00 	lea    rax,[rsp+0x568]
     10a655d:	00 
     10a655e:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6561:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6565:	48 8d 84 24 80 05 00 	lea    rax,[rsp+0x580]
     10a656c:	00 
     10a656d:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6570:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6574:	48 8d 84 24 98 05 00 	lea    rax,[rsp+0x598]
     10a657b:	00 
     10a657c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a657f:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6583:	48 8d 84 24 b0 05 00 	lea    rax,[rsp+0x5b0]
     10a658a:	00 
     10a658b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a658e:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6592:	48 8d 84 24 c8 05 00 	lea    rax,[rsp+0x5c8]
     10a6599:	00 
     10a659a:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a659d:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65a1:	48 8d 84 24 e0 05 00 	lea    rax,[rsp+0x5e0]
     10a65a8:	00 
     10a65a9:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65ac:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65b0:	48 8d 84 24 f8 05 00 	lea    rax,[rsp+0x5f8]
     10a65b7:	00 
     10a65b8:	0f 11 00             	movups XMMWORD PTR [rax],xmm0

## Function epilogue

     10a7e15:	e8 76 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7e1a:	48 89 e7             	mov    rdi,rsp
     10a7e1d:	e8 6e 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7e22:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7e27:	e8 64 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7e2c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a7e31:	e9 47 fe ff ff       	jmp    10a7c7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f093>
     10a7e36:	e8 75 7c 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a7e3b:	e9 0a 01 00 00       	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7e40:	e9 cd 00 00 00       	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
     10a7e45:	e9 d7 00 00 00       	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     10a7e4a:	e9 c3 00 00 00       	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
     10a7e4f:	e9 cd 00 00 00       	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     10a7e54:	eb 06                	jmp    10a7e5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f272>
     10a7e56:	eb 13                	jmp    10a7e6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f281>
     10a7e58:	eb 02                	jmp    10a7e5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f272>
     10a7e5a:	eb 0f                	jmp    10a7e6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f281>
     10a7e5c:	48 89 c3             	mov    rbx,rax
     10a7e5f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7e64:	e8 27 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7e69:	eb 03                	jmp    10a7e6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f284>
     10a7e6b:	48 89 c3             	mov    rbx,rax
     10a7e6e:	48 8d bc 24 48 04 00 	lea    rdi,[rsp+0x448]
     10a7e75:	00 
     10a7e76:	e8 77 7c e2 ff       	call   ecfaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96f08>
     10a7e7b:	e9 be 00 00 00       	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
     10a7e80:	eb 7a                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e82:	eb 78                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e84:	eb 76                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e86:	eb 74                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e88:	eb 72                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e8a:	eb 70                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e8c:	eb 6e                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e8e:	eb 6c                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e90:	eb 6a                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e92:	eb 68                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e94:	eb 66                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e96:	eb 64                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e98:	eb 62                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e9a:	eb 60                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e9c:	eb 5e                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e9e:	eb 72                	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
     10a7ea0:	eb 7f                	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     10a7ea2:	48 89 c3             	mov    rbx,rax
     10a7ea5:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     10a7eaa:	e8 d7 65 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a7eaf:	eb 03                	jmp    10a7eb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2ca>
     10a7eb1:	48 89 c3             	mov    rbx,rax
     10a7eb4:	48 8b bc 24 58 04 00 	mov    rdi,QWORD PTR [rsp+0x458]
     10a7ebb:	00 
     10a7ebc:	e8 c5 65 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a7ec1:	eb 03                	jmp    10a7ec6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2dc>
     10a7ec3:	48 89 c3             	mov    rbx,rax
     10a7ec6:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7ecb:	e8 94 4c a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     10a7ed0:	eb 03                	jmp    10a7ed5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2eb>
     10a7ed2:	48 89 c3             	mov    rbx,rax
     10a7ed5:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7edc:	00 
     10a7edd:	e8 82 4c a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     10a7ee2:	eb 5a                	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
     10a7ee4:	eb 16                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ee6:	eb 14                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ee8:	eb 12                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7eea:	eb 10                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7eec:	eb 0e                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7eee:	eb 0c                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef0:	eb 0a                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef2:	eb 08                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef4:	eb 06                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef6:	eb 04                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef8:	eb 02                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7efa:	eb 00                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7efc:	48 89 c3             	mov    rbx,rax
     10a7eff:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7f06:	00 
     10a7f07:	e8 84 5f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7f0c:	eb 30                	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
     10a7f0e:	eb 02                	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
     10a7f10:	eb 0f                	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     10a7f12:	48 89 c3             	mov    rbx,rax
     10a7f15:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7f1a:	e8 71 5f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7f1f:	eb 03                	jmp    10a7f24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f33a>
     10a7f21:	48 89 c3             	mov    rbx,rax
     10a7f24:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7f2b:	00 
     10a7f2c:	e8 fd d3 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a7f31:	eb 0b                	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
     10a7f33:	eb 15                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f35:	eb 13                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f37:	eb 02                	jmp    10a7f3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f351>
     10a7f39:	eb 0f                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f3b:	48 89 c3             	mov    rbx,rax
     10a7f3e:	48 89 df             	mov    rdi,rbx
     10a7f41:	e8 5f 1b 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a7f46:	eb 02                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f48:	eb 00                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f4a:	48 89 c7             	mov    rdi,rax
     10a7f4d:	e8 53 1b 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
