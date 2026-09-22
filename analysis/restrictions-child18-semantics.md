# Restrictions child+0x18 semantic trace

Purpose: continue after the factory-consumption closure by tracing constructor `0x10aba36`, the call target reached after the factory loads `[bundle+0x30]` into `rcx`. The goal is to confirm how that dependency becomes the child field returned by `0xb411a4`, and to classify whether the object itself has meaningful readiness methods or is just a dependency carrier.

## Factory callsite into constructor

At the callsite, the resolved setup-bundle slot is loaded into `rcx` before calling `0x10aba36`:

```text
  10ab918:	48 8d 05 99 59 78 00 	lea    rax,[rip+0x785999]        # 18312b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3250>
  10ab91f:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]
  10ab926:	00
  10ab927:	49 89 00             	mov    QWORD PTR [r8],rax
  10ab92a:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
  10ab92f:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
  10ab933:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
  10ab937:	41 0f b6 47 11       	movzx  eax,BYTE PTR [r15+0x11]
  10ab93c:	48 89 df             	mov    rdi,rbx
  10ab93f:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
  10ab944:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
  10ab949:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
  10ab94e:	4c 8b 4c 24 48       	mov    r9,QWORD PTR [rsp+0x48]
  10ab953:	41 56                	push   r14
  10ab955:	41 55                	push   r13
  10ab957:	41 54                	push   r12
  10ab959:	50                   	push   rax
  10ab95a:	55                   	push   rbp
  10ab95b:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
  10ab95f:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
  10ab963:	ff 74 24 48          	push   QWORD PTR [rsp+0x48]
  10ab967:	ff 74 24 58          	push   QWORD PTR [rsp+0x58]
  10ab96b:	ff 74 24 68          	push   QWORD PTR [rsp+0x68]
  10ab96f:	ff b4 24 88 00 00 00 	push   QWORD PTR [rsp+0x88]
  10ab976:	48 8d 84 24 d8 00 00 	lea    rax,[rsp+0xd8]
  10ab97d:	00
  10ab97e:	50                   	push   rax
  10ab97f:	e8 b2 00 00 00       	call   10aba36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e4c>
  10ab984:	48 83 c4 60          	add    rsp,0x60
  10ab988:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  10ab98f:	00
  10ab990:	e8 d5 e5 9c ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
```

Call ABI interpretation at `10ab97f -> 10aba36`:

```text
rdi = newly allocated 0x80-byte Restrictions child/service object
rsi = dependency from rsp+0x58
rdx = dependency from rsp+0x50
rcx = dependency from rsp+0x40 = factory read of [bundle+0x30]
r8  = local erased/shared wrapper at rsp+0x90
r9  = dependency from rsp+0x48
additional constructor arguments are pushed on the stack
```

## Constructor `0x10aba36` excerpt

```text
  10aba36:	55                   	push   rbp
  10aba37:	41 57                	push   r15
  10aba39:	41 56                	push   r14
  10aba3b:	41 55                	push   r13
  10aba3d:	41 54                	push   r12
  10aba3f:	53                   	push   rbx
  10aba40:	48 81 ec 58 01 00 00 	sub    rsp,0x158
  10aba47:	4c 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],r9
  10aba4c:	4c 89 44 24 10       	mov    QWORD PTR [rsp+0x10],r8
  10aba51:	48 89 cd             	mov    rbp,rcx
  10aba54:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx
  10aba59:	49 89 f7             	mov    r15,rsi
  10aba5c:	48 89 fb             	mov    rbx,rdi
  10aba5f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  10aba66:	00 00
  10aba68:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
  10aba6f:	00
  10aba70:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
  10aba74:	48 8d 05 15 10 7a 00 	lea    rax,[rip+0x7a1015]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>
  10aba7b:	48 89 07             	mov    QWORD PTR [rdi],rax
  10aba7e:	48 8d 47 10          	lea    rax,[rdi+0x10]
  10aba82:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
  10aba89:	00
  10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]
  10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  10aba93:	48 8d 47 40          	lea    rax,[rdi+0x40]
  10aba97:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  10aba9c:	48 83 c7 48          	add    rdi,0x48
  10abaa0:	0f 57 c0             	xorps  xmm0,xmm0
  10abaa3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
  10abaa7:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
  10abaab:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
  10abaaf:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
  10abab4:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
  10abab9:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
  10abac0:	00
  10abac1:	e8 64 9c ab ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
  10abac6:	48 8d 43 58          	lea    rax,[rbx+0x58]
  10abaca:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  10abacf:	48 8d 43 60          	lea    rax,[rbx+0x60]
  10abad3:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
  10abad8:	48 8d 43 68          	lea    rax,[rbx+0x68]
  10abadc:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
  10abae1:	48 8d 43 70          	lea    rax,[rbx+0x70]
  10abae5:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  10abaec:	00
  10abaed:	48 8d 43 78          	lea    rax,[rbx+0x78]
  10abaf1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  10abaf8:	00
  10abaf9:	0f 57 c0             	xorps  xmm0,xmm0
  10abafc:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0
  10abb00:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
  10abb04:	48 83 63 78 00       	and    QWORD PTR [rbx+0x78],0x0
  10abb09:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
  10abb0d:	48 8d 35 fc b8 32 ff 	lea    rsi,[rip+0xffffffffff32b8fc]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
  10abb14:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  10abb1b:	00
  10abb1c:	e8 5d df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  10abb21:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
  10abb28:	00
  10abb29:	48 8d 35 7b cd 32 ff 	lea    rsi,[rip+0xffffffffff32cd7b]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
  10abb30:	e8 49 df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  10abb35:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
  10abb3c:	00
  10abb3d:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
  10abb44:	00
  10abb45:	6a 02                	push   0x2
  10abb47:	5a                   	pop    rdx
  10abb48:	4c 89 e7             	mov    rdi,r12
  10abb4b:	e8 08 b9 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  10abb50:	8a 9c 24 d0 01 00 00 	mov    bl,BYTE PTR [rsp+0x1d0]
  10abb57:	6a 18                	push   0x18
  10abb59:	41 5d                	pop    r13
  10abb5b:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
  10abb5f:	48 81 c7 10 01 00 00 	add    rdi,0x110
  10abb66:	e8 25 23 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  10abb6b:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
  10abb6f:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
  10abb73:	75 e6                	jne    10abb5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272f71>
  10abb75:	48 8d 35 a4 b8 32 ff 	lea    rsi,[rip+0xffffffffff32b8a4]        # 3d7420 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2005>
  10abb7c:	48 8d 0d bd b8 32 ff 	lea    rcx,[rip+0xffffffffff32b8bd]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>
  10abb83:	4c 8d 2d 86 b8 32 ff 	lea    r13,[rip+0xffffffffff32b886]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
  10abb8a:	6a 11                	push   0x11
  10abb8c:	5a                   	pop    rdx
  10abb8d:	6a 20                	push   0x20
  10abb8f:	41 58                	pop    r8
  10abb91:	4c 89 f7             	mov    rdi,r14
  10abb94:	4d 89 e9             	mov    r9,r13
  10abb97:	41 54                	push   r12
  10abb99:	6a 08                	push   0x8
  10abb9b:	e8 ee ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
  10abba0:	58                   	pop    rax
  10abba1:	59                   	pop    rcx
  10abba2:	4c 89 e7             	mov    rdi,r12
  10abba5:	e8 3e fa 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  10abbaa:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
  10abbae:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  10abbb5:	00
  10abbb6:	4c 89 ee             	mov    rsi,r13
  10abbb9:	e8 c0 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  10abbbe:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
  10abbc5:	00
  10abbc6:	48 8d 35 de cc 32 ff 	lea    rsi,[rip+0xffffffffff32ccde]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
  10abbcd:	e8 ac de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  10abbd2:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
  10abbd9:	00
  10abbda:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
  10abbe1:	00
  10abbe2:	6a 02                	push   0x2
  10abbe4:	5a                   	pop    rdx
  10abbe5:	4c 89 e7             	mov    rdi,r12
  10abbe8:	e8 6b b8 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  10abbed:	6a 18                	push   0x18
  10abbef:	41 5d                	pop    r13
  10abbf1:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
  10abbf5:	48 81 c7 10 01 00 00 	add    rdi,0x110
  10abbfc:	e8 8f 22 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  10abc01:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
  10abc05:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
  10abc09:	75 e6                	jne    10abbf1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273007>
  10abc0b:	48 8d 35 5e b8 32 ff 	lea    rsi,[rip+0xffffffffff32b85e]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>
  10abc12:	48 8d 0d 77 b8 32 ff 	lea    rcx,[rip+0xffffffffff32b877]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>
  10abc19:	4c 8d 0d eb b9 32 ff 	lea    r9,[rip+0xffffffffff32b9eb]        # 3d760b <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21f0>
  10abc20:	6a 11                	push   0x11
  10abc22:	5a                   	pop    rdx
  10abc23:	6a 19                	push   0x19
  10abc25:	41 58                	pop    r8
  10abc27:	4c 89 f7             	mov    rdi,r14
  10abc2a:	41 54                	push   r12
  10abc2c:	6a 08                	push   0x8
  10abc2e:	e8 5b ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
  10abc33:	58                   	pop    rax
  10abc34:	59                   	pop    rcx
  10abc35:	4c 89 e7             	mov    rdi,r12
  10abc38:	e8 ab f9 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  10abc3d:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
  10abc41:	48 8d 35 c8 b7 32 ff 	lea    rsi,[rip+0xffffffffff32b7c8]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
  10abc48:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  10abc4f:	00
  10abc50:	e8 29 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  10abc55:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
  10abc5c:	00
  10abc5d:	48 8d 35 47 cc 32 ff 	lea    rsi,[rip+0xffffffffff32cc47]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
  10abc64:	e8 15 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  10abc69:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
  10abc70:	00
  10abc71:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
  10abc78:	00
  10abc79:	6a 02                	push   0x2
  10abc7b:	5a                   	pop    rdx
  10abc7c:	4c 89 e7             	mov    rdi,r12
  10abc7f:	e8 d4 b7 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  10abc84:	6a 18                	push   0x18
  10abc86:	41 5d                	pop    r13
  10abc88:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
  10abc8c:	48 81 c7 10 01 00 00 	add    rdi,0x110
  10abc93:	e8 f8 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  10abc98:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
  10abc9c:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
  10abca0:	75 e6                	jne    10abc88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27309e>
  10abca2:	48 8d 35 27 b9 32 ff 	lea    rsi,[rip+0xffffffffff32b927]        # 3d75d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21b5>
  10abca9:	48 8d 0d 40 b9 32 ff 	lea    rcx,[rip+0xffffffffff32b940]        # 3d75f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21d5>
  10abcb0:	4c 8d 0d 5d b9 32 ff 	lea    r9,[rip+0xffffffffff32b95d]        # 3d7614 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21f9>
  10abcb7:	6a 11                	push   0x11
  10abcb9:	5a                   	pop    rdx
  10abcba:	6a 1a                	push   0x1a
  10abcbc:	41 58                	pop    r8
  10abcbe:	4c 89 f7             	mov    rdi,r14
  10abcc1:	41 54                	push   r12
  10abcc3:	6a 08                	push   0x8
  10abcc5:	e8 c4 b9 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
  10abcca:	58                   	pop    rax
  10abccb:	59                   	pop    rcx
  10abccc:	4c 89 e7             	mov    rdi,r12
  10abccf:	e8 14 f9 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  10abcd4:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
  10abcd8:	48 8d 35 31 b7 32 ff 	lea    rsi,[rip+0xffffffffff32b731]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
  10abcdf:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  10abce6:	00
  10abce7:	e8 92 dd 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  10abcec:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
  10abcf3:	00
  10abcf4:	48 8d 35 b0 cb 32 ff 	lea    rsi,[rip+0xffffffffff32cbb0]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
  10abcfb:	e8 7e dd 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  10abd00:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
  10abd07:	00
  10abd08:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
  10abd0f:	00
  10abd10:	6a 02                	push   0x2
  10abd12:	5a                   	pop    rdx
  10abd13:	4c 89 e7             	mov    rdi,r12
  10abd16:	e8 3d b7 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  10abd1b:	6a 18                	push   0x18
  10abd1d:	41 5d                	pop    r13
  10abd1f:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
  10abd23:	48 81 c7 10 01 00 00 	add    rdi,0x110
  10abd2a:	e8 61 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  10abd2f:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
  10abd33:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
  10abd37:	75 e6                	jne    10abd1f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273135>
  10abd39:	48 8d 35 b0 bb 32 ff 	lea    rsi,[rip+0xffffffffff32bbb0]        # 3d78f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24d5>
  10abd40:	48 8d 0d c9 bb 32 ff 	lea    rcx,[rip+0xffffffffff32bbc9]        # 3d7910 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24f5>
  10abd47:	4c 8d 0d cf b8 32 ff 	lea    r9,[rip+0xffffffffff32b8cf]        # 3d761d <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2202>
  10abd4e:	6a 11                	push   0x11
  10abd50:	5a                   	pop    rdx
  10abd51:	6a 24                	push   0x24
  10abd53:	41 58                	pop    r8
  10abd55:	4c 89 f7             	mov    rdi,r14
  10abd58:	41 54                	push   r12
  10abd5a:	6a 08                	push   0x8
  10abd5c:	e8 2d b9 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
  10abd61:	58                   	pop    rax
  10abd62:	59                   	pop    rcx
  10abd63:	4c 89 e7             	mov    rdi,r12
  10abd66:	e8 7d f8 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  10abd6b:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
  10abd6f:	48 8d 35 9a b6 32 ff 	lea    rsi,[rip+0xffffffffff32b69a]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
  10abd76:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  10abd7d:	00
  10abd7e:	e8 fb dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  10abd83:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
  10abd8a:	00
  10abd8b:	48 8d 35 19 cb 32 ff 	lea    rsi,[rip+0xffffffffff32cb19]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
  10abd92:	e8 e7 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  10abd97:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
  10abd9e:	00
  10abd9f:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
  10abda6:	00
  10abda7:	6a 02                	push   0x2
  10abda9:	5a                   	pop    rdx
  10abdaa:	4c 89 e7             	mov    rdi,r12
  10abdad:	e8 a6 b6 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  10abdb2:	6a 18                	push   0x18
  10abdb4:	41 5d                	pop    r13
  10abdb6:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
  10abdba:	48 81 c7 10 01 00 00 	add    rdi,0x110
  10abdc1:	e8 ca 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  10abdc6:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
  10abdca:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
  10abdce:	75 e6                	jne    10abdb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2731cc>
  10abdd0:	48 8d 35 f9 b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5f9]        # 3d73d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fb5>
  10abdd7:	48 8d 0d 12 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b612]        # 3d73f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fd5>
  10abdde:	4c 8d 0d 41 b8 32 ff 	lea    r9,[rip+0xffffffffff32b841]        # 3d7626 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x220b>
  10abde5:	6a 11                	push   0x11
  10abde7:	5a                   	pop    rdx
  10abde8:	6a 1f                	push   0x1f
  10abdea:	41 58                	pop    r8
  10abdec:	4c 89 f7             	mov    rdi,r14
  10abdef:	41 54                	push   r12
  10abdf1:	6a 08                	push   0x8
  10abdf3:	e8 96 b8 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
  10abdf8:	58                   	pop    rax
  10abdf9:	59                   	pop    rcx
  10abdfa:	4c 89 e7             	mov    rdi,r12
  10abdfd:	e8 e6 f7 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  10abe02:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
  10abe06:	48 8d 35 03 b6 32 ff 	lea    rsi,[rip+0xffffffffff32b603]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
  10abe0d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  10abe14:	00
  10abe15:	e8 64 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
```

## Constructor field/storage hits

```text
  10aba74:	48 8d 05 15 10 7a 00 	lea    rax,[rip+0x7a1015]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>
  10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]
```

## Child accessor `0xb411a4`

```text
   b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
   b411a8:	c3                   	ret
```

## Current interpretation

```text
Restrictions factory:
  [bundle+0x30] -> rsp+0x40 -> rcx
Constructor 0x10aba36:
  expected to store/carry rcx into child state
Accessor 0xb411a4:
  returns [child+0x18]
```

If the constructor excerpt shows `rcx` being stored at `child+0x18`, the semantic role of the Restrictions child is simple: it is a carrier/provider for the resolved dependency object. The readiness behavior then belongs to that dependency object or the later erased/shared wrapper chain, not to `b411a4` itself.
