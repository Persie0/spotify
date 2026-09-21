# ef91cc owner AP 0x18365e0 slot +0x1d8

Structural fingerprint to test: d85524 receiver has +0x210 byte and +0x258 pointer; AP 0x18365e0 owner initializes/owns those same offsets.

## Relocation at AP+0x1d8 = 0x18367b8
00000000018367b8  0000000000000008 R_X86_64_RELATIVE                         f00edc

target=f00edc

## Target body

/tmp/ef1d8/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000f00e9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc82b2>:
  f00e9c:	c4                   	(bad)
  f00e9d:	18 5b 41             	sbb    BYTE PTR [rbx+0x41],bl
  f00ea0:	5e                   	pop    rsi
  f00ea1:	41 5f                	pop    r15
  f00ea3:	5d                   	pop    rbp
  f00ea4:	c3                   	ret
  f00ea5:	e8 06 ec 8e 00       	call   17efab0 <__stack_chk_fail@plt>
  f00eaa:	53                   	push   rbx
  f00eab:	48 89 fb             	mov    rbx,rdi
  f00eae:	e8 31 f9 7c 00       	call   16d07e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84950>
  f00eb3:	c6 43 68 01          	mov    BYTE PTR [rbx+0x68],0x1
  f00eb7:	5b                   	pop    rbx
  f00eb8:	c3                   	ret
  f00eb9:	cc                   	int3
  f00eba:	48 8d 05 e7 58 93 00 	lea    rax,[rip+0x9358e7]        # 18367a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8740>
  f00ec1:	48 89 07             	mov    QWORD PTR [rdi],rax
  f00ec4:	e9 47 d1 8e 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  f00ec9:	cc                   	int3
  f00eca:	53                   	push   rbx
  f00ecb:	48 89 fb             	mov    rbx,rdi
  f00ece:	e8 e7 ff ff ff       	call   f00eba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc82d0>
  f00ed3:	48 89 df             	mov    rdi,rbx
  f00ed6:	5b                   	pop    rbx
  f00ed7:	e9 44 d0 8e 00       	jmp    17edf20 <_ZdlPv@plt>
  f00edc:	41 57                	push   r15
  f00ede:	41 56                	push   r14
  f00ee0:	53                   	push   rbx
  f00ee1:	49 89 fe             	mov    r14,rdi
  f00ee4:	48 8d 5f 18          	lea    rbx,[rdi+0x18]
  f00ee8:	4c 8b 7f 18          	mov    r15,QWORD PTR [rdi+0x18]
  f00eec:	49 8d 47 ff          	lea    rax,[r15-0x1]
  f00ef0:	48 83 f8 fb          	cmp    rax,0xfffffffffffffffb
  f00ef4:	77 0f                	ja     f00f05 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc831b>
  f00ef6:	4c 89 ff             	mov    rdi,r15
  f00ef9:	41 ff 57 08          	call   QWORD PTR [r15+0x8]
  f00efd:	4c 89 ff             	mov    rdi,r15
  f00f00:	e8 1b d0 8e 00       	call   17edf20 <_ZdlPv@plt>
  f00f05:	49 83 c6 40          	add    r14,0x40
  f00f09:	4c 89 f7             	mov    rdi,r14
  f00f0c:	e8 0d 00 00 00       	call   f00f1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8334>
  f00f11:	48 89 df             	mov    rdi,rbx
  f00f14:	5b                   	pop    rbx
  f00f15:	41 5e                	pop    r14
  f00f17:	41 5f                	pop    r15
  f00f19:	e9 14 1b bf ff       	jmp    af2a32 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f9d2>
  f00f1e:	80 7f 68 00          	cmp    BYTE PTR [rdi+0x68],0x0
  f00f22:	0f 85 82 f9 7c 00    	jne    16d08aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84a16>
  f00f28:	c3                   	ret
  f00f29:	cc                   	int3
  f00f2a:	48 8d 05 e7 02 96 00 	lea    rax,[rip+0x9602e7]        # 1861218 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d900>
  f00f31:	48 89 07             	mov    QWORD PTR [rdi],rax
  f00f34:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
  f00f38:	e9 49 d5 b9 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  f00f3d:	cc                   	int3
  f00f3e:	53                   	push   rbx
  f00f3f:	48 89 fb             	mov    rbx,rdi
  f00f42:	e8 e3 ff ff ff       	call   f00f2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8340>
  f00f47:	48 89 df             	mov    rdi,rbx
  f00f4a:	5b                   	pop    rbx
  f00f4b:	e9 d0 cf 8e 00       	jmp    17edf20 <_ZdlPv@plt>
  f00f50:	53                   	push   rbx
  f00f51:	48 89 fb             	mov    rbx,rdi
  f00f54:	6a 18                	push   0x18
  f00f56:	5f                   	pop    rdi
  f00f57:	e8 a4 cf 8e 00       	call   17edf00 <_Znwm@plt>
  f00f5c:	48 8d 0d b5 02 96 00 	lea    rcx,[rip+0x9602b5]        # 1861218 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d900>
  f00f63:	48 89 08             	mov    QWORD PTR [rax],rcx
  f00f66:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
  f00f6a:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
  f00f6e:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  f00f72:	48 85 c9             	test   rcx,rcx
  f00f75:	74 05                	je     f00f7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8392>
  f00f77:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  f00f7c:	5b                   	pop    rbx
  f00f7d:	c3                   	ret
  f00f7e:	48 8d 05 93 02 96 00 	lea    rax,[rip+0x960293]        # 1861218 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d900>
  f00f85:	48 89 06             	mov    QWORD PTR [rsi],rax
  f00f88:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  f00f8c:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  f00f90:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  f00f94:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
  f00f98:	48 85 c0             	test   rax,rax
  f00f9b:	74 05                	je     f00fa2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc83b8>
  f00f9d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  f00fa2:	c3                   	ret
  f00fa3:	cc                   	int3
  f00fa4:	55                   	push   rbp
  f00fa5:	41 57                	push   r15
  f00fa7:	41 56                	push   r14
  f00fa9:	41 55                	push   r13
  f00fab:	41 54                	push   r12
  f00fad:	53                   	push   rbx
  f00fae:	48 81 ec 68 01 00 00 	sub    rsp,0x168
  f00fb5:	48 89 fb             	mov    rbx,rdi
  f00fb8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f00fbf:	00 00 
  f00fc1:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
  f00fc8:	00 
  f00fc9:	4c 8d 77 08          	lea    r14,[rdi+0x8]
  f00fcd:	4c 8d a4 24 f8 00 00 	lea    r12,[rsp+0xf8]
  f00fd4:	00 
  f00fd5:	4c 89 e7             	mov    rdi,r12
  f00fd8:	4c 89 f6             	mov    rsi,r14
  f00fdb:	e8                   	.byte 0xe8

## Table slice AP 0x18365e0 +0x180..+0x240
+0x180 @0x1836760: 
+0x188 @0x1836768: 
+0x190 @0x1836770: 0000000001836770  0000000000000008 R_X86_64_RELATIVE                         efeb00
+0x198 @0x1836778: 0000000001836778  0000000000000008 R_X86_64_RELATIVE                         efeb10
+0x1a0 @0x1836780: 0000000001836780  0000000000000008 R_X86_64_RELATIVE                         efeb22
+0x1a8 @0x1836788: 0000000001836788  000006bb00000001 R_X86_64_64            00000000009d81d0 _ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0
+0x1b0 @0x1836790: 0000000001836790  0000000000000008 R_X86_64_RELATIVE                         a50370
+0x1b8 @0x1836798: 
+0x1c0 @0x18367a0: 
+0x1c8 @0x18367a8: 00000000018367a8  0000000000000008 R_X86_64_RELATIVE                         f00eba
+0x1d0 @0x18367b0: 00000000018367b0  0000000000000008 R_X86_64_RELATIVE                         f00eca
+0x1d8 @0x18367b8: 00000000018367b8  0000000000000008 R_X86_64_RELATIVE                         f00edc
+0x1e0 @0x18367c0: 00000000018367c0  000006bb00000001 R_X86_64_64            00000000009d81d0 _ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0
+0x1e8 @0x18367c8: 00000000018367c8  0000000000000008 R_X86_64_RELATIVE                         a50370
+0x1f0 @0x18367d0: 
+0x1f8 @0x18367d8: 
+0x200 @0x18367e0: 00000000018367e0  0000000000000008 R_X86_64_RELATIVE                         f021ea
+0x208 @0x18367e8: 00000000018367e8  0000000000000008 R_X86_64_RELATIVE                         f021fe
+0x210 @0x18367f0: 00000000018367f0  0000000000000008 R_X86_64_RELATIVE                         f02210
+0x218 @0x18367f8: 00000000018367f8  0000000000000008 R_X86_64_RELATIVE                         f0223e
+0x220 @0x1836800: 0000000001836800  0000000000000008 R_X86_64_RELATIVE                         aae9b2
+0x228 @0x1836808: 0000000001836808  0000000000000008 R_X86_64_RELATIVE                         aae9bc
+0x230 @0x1836810: 0000000001836810  0000000000000008 R_X86_64_RELATIVE                         f02264
+0x238 @0x1836818: 
+0x240 @0x1836820: 

## Compare authoritative state AP 0x1841fc0 +0x1d8
0000000001842198  0000000000000008 R_X86_64_RELATIVE                         fd4a92
