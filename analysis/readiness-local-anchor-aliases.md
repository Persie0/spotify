# Readiness caller-local anchor aliases

Concrete alias: e91df6 passes caller rsp+0x260 as e92f2c rsi/r13.
Therefore every owner-relative field in e92f2c maps to caller stack base 0x260 + field offset.

- rsp+0x260: base
- rsp+0x618: base+0x3b8 provider
- rsp+0x688: base+0x428 readiness wrapper
- rsp+0x6d0: base+0x470 optional/state
- rsp+0x7d0: base+0x570 dependency
- rsp+0x7f8: base+0x598 state/control

Caller FDE: ('0xe8fad0', '0xe92c49')

## Exact direct refs: rsp+0x260 (base)
  e91df6:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
  e9247f:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
  e92c1a:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]

### context 0xe91df6
      e91dae:	00 
      e91daf:	e8 6e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e91db4:	31 ff                	xor    edi,edi
      e91db6:	e8 61 c6 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e91dbb:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]
      e91dc2:	00 
      e91dc3:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      e91dc8:	48 89 03             	mov    QWORD PTR [rbx],rax
      e91dcb:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      e91dd0:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      e91dd4:	4c 8d b4 24 60 09 00 	lea    r14,[rsp+0x960]
      e91ddb:	00 
      e91ddc:	4c 89 f7             	mov    rdi,r14
      e91ddf:	e8 3e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e91de4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e91de9:	e8 98 c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91dee:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e91df5:	00 
      e91df6:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
      e91dfd:	00 
      e91dfe:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
      e91e03:	48 89 d9             	mov    rcx,rbx
      e91e06:	e8 21 11 00 00       	call   e92f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a342>
      e91e0b:	0f 28 84 24 b0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8b0]
      e91e12:	00 
      e91e13:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      e91e18:	4c 89 ff             	mov    rdi,r15
      e91e1b:	e8 16 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e20:	49 8d 7f 10          	lea    rdi,[r15+0x10]
      e91e24:	0f 28 84 24 a0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8a0]
      e91e2b:	00 
      e91e2c:	e8 05 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e31:	0f 28 84 24 c0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8c0]
      e91e38:	00 
      e91e39:	48 8b 84 24 c8 08 00 	mov    rax,QWORD PTR [rsp+0x8c8]
      e91e40:	00 
      e91e41:	48 85 c0             	test   rax,rax
      e91e44:	74 05                	je     e91e4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59261>
      e91e46:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91e4b:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
      e91e4f:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      e91e54:	e8 2d c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91e59:	48 8d 9c 24 e0 08 00 	lea    rbx,[rsp+0x8e0]
      e91e60:	00 
      e91e61:	49 8d 7f 30          	lea    rdi,[r15+0x30]

### context 0xe9247f
      e92430:	48 85 c0             	test   rax,rax
      e92433:	74 05                	je     e9243a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59850>
      e92435:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9243a:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      e9243f:	48 8b b8 10 01 00 00 	mov    rdi,QWORD PTR [rax+0x110]
      e92446:	f3 0f 7f 80 08 01 00 	movdqu XMMWORD PTR [rax+0x108],xmm0
      e9244d:	00 
      e9244e:	e8 33 c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92453:	4c 89 e7             	mov    rdi,r12
      e92456:	e8 2b c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9245b:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e92462:	00 
      e92463:	e8 1c 6d 00 00       	call   e99184 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6059a>
      e92468:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
      e9246f:	00 
      e92470:	e8 11 c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92475:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e9247a:	e8 33 c0 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e9247f:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      e92486:	00 
      e92487:	e8 de 08 00 00       	call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e9248c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e92493:	00 00 
      e92495:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e9249c:	00 
      e9249d:	0f 85 a1 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e924a3:	48 81 c4 c8 09 00 00 	add    rsp,0x9c8
      e924aa:	5b                   	pop    rbx
      e924ab:	41 5c                	pop    r12
      e924ad:	41 5d                	pop    r13
      e924af:	41 5e                	pop    r14
      e924b1:	41 5f                	pop    r15
      e924b3:	5d                   	pop    rbp
      e924b4:	c3                   	ret
      e924b5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e924bc:	00 00 
      e924be:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e924c5:	00 
      e924c6:	0f 85 78 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e924cc:	e8 a2 7f be ff       	call   a7a473 <JNI_OnUnload@@Base+0x1d40>
      e924d1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e924d8:	00 00 
      e924da:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e924e1:	00 
      e924e2:	0f 85 5c 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>

### context 0xe92c1a
      e92bc8:	e8 55 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bcd:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
      e92bd4:	00 
      e92bd5:	e8 48 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bda:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]
      e92bdf:	48 89 df             	mov    rdi,rbx
      e92be2:	e8 29 b4 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e92be7:	48 89 df             	mov    rdi,rbx
      e92bea:	e8 2d b8 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e92bef:	48 8d bc 24 60 09 00 	lea    rdi,[rsp+0x960]
      e92bf6:	00 
      e92bf7:	e8 26 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bfc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e92c01:	e8 80 b8 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92c06:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e92c0b:	e8 a2 b8 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e92c10:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e92c15:	e8 2c 40 62 00       	call   14b6c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc1ca>
      e92c1a:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      e92c21:	00 
      e92c22:	e8 43 01 00 00       	call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e92c27:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e92c2e:	00 00 
      e92c30:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e92c37:	00 
      e92c38:	75 0a                	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e92c3a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      e92c3f:	e8 8c d0 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      e92c44:	e8 67 ce 95 00       	call   17efab0 <__stack_chk_fail@plt>
      e92c49:	41 57                	push   r15
      e92c4b:	41 56                	push   r14
      e92c4d:	41 54                	push   r12
      e92c4f:	53                   	push   rbx
      e92c50:	50                   	push   rax
      e92c51:	48 89 d3             	mov    rbx,rdx
      e92c54:	48 39 f7             	cmp    rdi,rsi
      e92c57:	74 22                	je     e92c7b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a091>
      e92c59:	49 89 f6             	mov    r14,rsi
      e92c5c:	49 89 ff             	mov    r15,rdi
      e92c5f:	41 bc 80 00 00 00    	mov    r12d,0x80
      e92c65:	48 89 df             	mov    rdi,rbx
      e92c68:	4c 89 fe             	mov    rsi,r15
      e92c6b:	e8 c0 c7 ff ff       	call   e8f430 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56846>
      e92c70:	4d 01 e7             	add    r15,r12
      e92c73:	4c 01 e3             	add    rbx,r12

## Exact direct refs: rsp+0x618 (base+0x3b8 provider)
  e9158b:	48 8b b4 24 18 06 00 	mov    rsi,QWORD PTR [rsp+0x618]

### context 0xe9158b
      e91541:	4c 89 f7             	mov    rdi,r14
      e91544:	e8 9b e0 c4 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
      e91549:	4c 89 74 24 68       	mov    QWORD PTR [rsp+0x68],r14
      e9154e:	4c 89 f7             	mov    rdi,r14
      e91551:	e8 5c cf c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e91556:	49 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [r12+0x80]
      e9155d:	00 
      e9155e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e91561:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e91564:	49 89 c5             	mov    r13,rax
      e91567:	f3 0f 6f 84 24 38 03 	movdqu xmm0,XMMWORD PTR [rsp+0x338]
      e9156e:	00 00 
      e91570:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
      e91576:	48 8b 9c 24 a0 02 00 	mov    rbx,QWORD PTR [rsp+0x2a0]
      e9157d:	00 
      e9157e:	48 8b 84 24 58 03 00 	mov    rax,QWORD PTR [rsp+0x358]
      e91585:	00 
      e91586:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      e9158b:	48 8b b4 24 18 06 00 	mov    rsi,QWORD PTR [rsp+0x618]
      e91592:	00 
      e91593:	48 8b ac 24 d0 07 00 	mov    rbp,QWORD PTR [rsp+0x7d0]
      e9159a:	00 
      e9159b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e9159e:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]
      e915a5:	00 
      e915a6:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e915a9:	bf 58 01 00 00       	mov    edi,0x158
      e915ae:	e8 4d c9 95 00       	call   17edf00 <_Znwm@plt>
      e915b3:	49 89 c6             	mov    r14,rax
      e915b6:	66 0f ef c0          	pxor   xmm0,xmm0
      e915ba:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e915bf:	48 8d 05 a2 be 96 00 	lea    rax,[rip+0x96bea2]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e915c6:	49 89 06             	mov    QWORD PTR [r14],rax
      e915c9:	f3 0f 6f 84 24 28 03 	movdqu xmm0,XMMWORD PTR [rsp+0x328]
      e915d0:	00 00 
      e915d2:	48 8b 84 24 30 03 00 	mov    rax,QWORD PTR [rsp+0x330]
      e915d9:	00 
      e915da:	48 85 c0             	test   rax,rax
      e915dd:	74 05                	je     e915e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x589fa>
      e915df:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e915e4:	48 8d 05 e5 14 9a 00 	lea    rax,[rip+0x9a14e5]        # 1832ad0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4a68>
      e915eb:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e915ef:	48 8b 84 24 68 08 00 	mov    rax,QWORD PTR [rsp+0x868]
      e915f6:	00 
      e915f7:	66 0f 6f 8c 24 60 08 	movdqa xmm1,XMMWORD PTR [rsp+0x860]

## Exact direct refs: rsp+0x688 (base+0x428 readiness wrapper)
  e8ff88:	48 89 8c 24 88 06 00 	mov    QWORD PTR [rsp+0x688],rcx

### context 0xe8ff88
      e8ff43:	4c 89 e3             	mov    rbx,r12
      e8ff46:	74 05                	je     e8ff4d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57363>
      e8ff48:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
      e8ff4d:	48 8b b4 24 50 0b 00 	mov    rsi,QWORD PTR [rsp+0xb50]
      e8ff54:	00 
      e8ff55:	0f 57 c0             	xorps  xmm0,xmm0
      e8ff58:	0f 29 84 24 60 06 00 	movaps XMMWORD PTR [rsp+0x660],xmm0
      e8ff5f:	00 
      e8ff60:	0f 29 84 24 50 06 00 	movaps XMMWORD PTR [rsp+0x650],xmm0
      e8ff67:	00 
      e8ff68:	0f 29 84 24 40 06 00 	movaps XMMWORD PTR [rsp+0x640],xmm0
      e8ff6f:	00 
      e8ff70:	4c 89 84 24 70 06 00 	mov    QWORD PTR [rsp+0x670],r8
      e8ff77:	00 
      e8ff78:	48 89 bc 24 78 06 00 	mov    QWORD PTR [rsp+0x678],rdi
      e8ff7f:	00 
      e8ff80:	48 89 94 24 80 06 00 	mov    QWORD PTR [rsp+0x680],rdx
      e8ff87:	00 
      e8ff88:	48 89 8c 24 88 06 00 	mov    QWORD PTR [rsp+0x688],rcx
      e8ff8f:	00 
      e8ff90:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
      e8ff94:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e8ff97:	0f 29 84 24 90 06 00 	movaps XMMWORD PTR [rsp+0x690],xmm0
      e8ff9e:	00 
      e8ff9f:	48 85 c9             	test   rcx,rcx
      e8ffa2:	74 05                	je     e8ffa9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x573bf>
      e8ffa4:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e8ffa9:	48 89 b4 24 a0 06 00 	mov    QWORD PTR [rsp+0x6a0],rsi
      e8ffb0:	00 
      e8ffb1:	6a 20                	push   0x20
      e8ffb3:	5f                   	pop    rdi
      e8ffb4:	e8 47 df 95 00       	call   17edf00 <_Znwm@plt>
      e8ffb9:	48 8b 94 24 80 0b 00 	mov    rdx,QWORD PTR [rsp+0xb80]
      e8ffc0:	00 
      e8ffc1:	48 8b 8c 24 78 0b 00 	mov    rcx,QWORD PTR [rsp+0xb78]
      e8ffc8:	00 
      e8ffc9:	48 89 c6             	mov    rsi,rax
      e8ffcc:	48 83 c6 18          	add    rsi,0x18
      e8ffd0:	83 60 18 00          	and    DWORD PTR [rax+0x18],0x0
      e8ffd4:	0f 57 c0             	xorps  xmm0,xmm0
      e8ffd7:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e8ffdb:	48 8d 3d ee 08 97 00 	lea    rdi,[rip+0x9708ee]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
      e8ffe2:	48 89 38             	mov    QWORD PTR [rax],rdi
      e8ffe5:	48 89 b4 24 a8 06 00 	mov    QWORD PTR [rsp+0x6a8],rsi
      e8ffec:	00 

## Exact direct refs: rsp+0x6d0 (base+0x470 optional/state)
  e9002b:	0f 29 84 24 d0 06 00 	movaps XMMWORD PTR [rsp+0x6d0],xmm0

### context 0xe9002b
      e8ffe5:	48 89 b4 24 a8 06 00 	mov    QWORD PTR [rsp+0x6a8],rsi
      e8ffec:	00 
      e8ffed:	48 89 84 24 b0 06 00 	mov    QWORD PTR [rsp+0x6b0],rax
      e8fff4:	00 
      e8fff5:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      e8fffa:	0f 11 84 24 b8 06 00 	movups XMMWORD PTR [rsp+0x6b8],xmm0
      e90001:	00 
      e90002:	4d 85 ed             	test   r13,r13
      e90005:	74 05                	je     e9000c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57422>
      e90007:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      e9000c:	48 8b b4 24 90 0b 00 	mov    rsi,QWORD PTR [rsp+0xb90]
      e90013:	00 
      e90014:	48 8b bc 24 88 0b 00 	mov    rdi,QWORD PTR [rsp+0xb88]
      e9001b:	00 
      e9001c:	48 89 94 24 c8 06 00 	mov    QWORD PTR [rsp+0x6c8],rdx
      e90023:	00 
      e90024:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e90028:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      e9002b:	0f 29 84 24 d0 06 00 	movaps XMMWORD PTR [rsp+0x6d0],xmm0
      e90032:	00 
      e90033:	48 85 c0             	test   rax,rax
      e90036:	74 05                	je     e9003d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57453>
      e90038:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9003d:	48 8b 84 24 a0 0b 00 	mov    rax,QWORD PTR [rsp+0xba0]
      e90044:	00 
      e90045:	48 8b 8c 24 98 0b 00 	mov    rcx,QWORD PTR [rsp+0xb98]
      e9004c:	00 
      e9004d:	48 89 bc 24 e0 06 00 	mov    QWORD PTR [rsp+0x6e0],rdi
      e90054:	00 
      e90055:	48 8b 56 08          	mov    rdx,QWORD PTR [rsi+0x8]
      e90059:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
      e9005c:	0f 11 84 24 e8 06 00 	movups XMMWORD PTR [rsp+0x6e8],xmm0
      e90063:	00 
      e90064:	48 85 d2             	test   rdx,rdx
      e90067:	74 05                	je     e9006e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57484>
      e90069:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
      e9006e:	4c 8b b4 24 c8 0b 00 	mov    r14,QWORD PTR [rsp+0xbc8]
      e90075:	00 
      e90076:	4c 8b bc 24 c0 0b 00 	mov    r15,QWORD PTR [rsp+0xbc0]
      e9007d:	00 
      e9007e:	4c 8b a4 24 b8 0b 00 	mov    r12,QWORD PTR [rsp+0xbb8]
      e90085:	00 
      e90086:	48 8b b4 24 b0 0b 00 	mov    rsi,QWORD PTR [rsp+0xbb0]
      e9008d:	00 
      e9008e:	48 89 8c 24 f8 06 00 	mov    QWORD PTR [rsp+0x6f8],rcx

## Exact direct refs: rsp+0x7d0 (base+0x570 dependency)
  e91593:	48 8b ac 24 d0 07 00 	mov    rbp,QWORD PTR [rsp+0x7d0]
  e91f12:	48 8b 84 24 d0 07 00 	mov    rax,QWORD PTR [rsp+0x7d0]
  e91fc9:	48 8b 84 24 d0 07 00 	mov    rax,QWORD PTR [rsp+0x7d0]
  e9226d:	48 8b 84 24 d0 07 00 	mov    rax,QWORD PTR [rsp+0x7d0]
  e9232c:	48 8b 84 24 d0 07 00 	mov    rax,QWORD PTR [rsp+0x7d0]

### context 0xe91593
      e91549:	4c 89 74 24 68       	mov    QWORD PTR [rsp+0x68],r14
      e9154e:	4c 89 f7             	mov    rdi,r14
      e91551:	e8 5c cf c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e91556:	49 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [r12+0x80]
      e9155d:	00 
      e9155e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e91561:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e91564:	49 89 c5             	mov    r13,rax
      e91567:	f3 0f 6f 84 24 38 03 	movdqu xmm0,XMMWORD PTR [rsp+0x338]
      e9156e:	00 00 
      e91570:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
      e91576:	48 8b 9c 24 a0 02 00 	mov    rbx,QWORD PTR [rsp+0x2a0]
      e9157d:	00 
      e9157e:	48 8b 84 24 58 03 00 	mov    rax,QWORD PTR [rsp+0x358]
      e91585:	00 
      e91586:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      e9158b:	48 8b b4 24 18 06 00 	mov    rsi,QWORD PTR [rsp+0x618]
      e91592:	00 
      e91593:	48 8b ac 24 d0 07 00 	mov    rbp,QWORD PTR [rsp+0x7d0]
      e9159a:	00 
      e9159b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e9159e:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]
      e915a5:	00 
      e915a6:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e915a9:	bf 58 01 00 00       	mov    edi,0x158
      e915ae:	e8 4d c9 95 00       	call   17edf00 <_Znwm@plt>
      e915b3:	49 89 c6             	mov    r14,rax
      e915b6:	66 0f ef c0          	pxor   xmm0,xmm0
      e915ba:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e915bf:	48 8d 05 a2 be 96 00 	lea    rax,[rip+0x96bea2]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e915c6:	49 89 06             	mov    QWORD PTR [r14],rax
      e915c9:	f3 0f 6f 84 24 28 03 	movdqu xmm0,XMMWORD PTR [rsp+0x328]
      e915d0:	00 00 
      e915d2:	48 8b 84 24 30 03 00 	mov    rax,QWORD PTR [rsp+0x330]
      e915d9:	00 
      e915da:	48 85 c0             	test   rax,rax
      e915dd:	74 05                	je     e915e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x589fa>
      e915df:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e915e4:	48 8d 05 e5 14 9a 00 	lea    rax,[rip+0x9a14e5]        # 1832ad0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4a68>
      e915eb:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e915ef:	48 8b 84 24 68 08 00 	mov    rax,QWORD PTR [rsp+0x868]
      e915f6:	00 
      e915f7:	66 0f 6f 8c 24 60 08 	movdqa xmm1,XMMWORD PTR [rsp+0x860]
      e915fe:	00 00 
      e91600:	f3 41 0f 7f 4e 20    	movdqu XMMWORD PTR [r14+0x20],xmm1

### context 0xe91f12
      e91ec6:	48 85 c0             	test   rax,rax
      e91ec9:	74 05                	je     e91ed0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x592e6>
      e91ecb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91ed0:	49 8d 9f f8 00 00 00 	lea    rbx,[r15+0xf8]
      e91ed7:	49 8b bf c8 00 00 00 	mov    rdi,QWORD PTR [r15+0xc8]
      e91ede:	41 0f 11 87 c0 00 00 	movups XMMWORD PTR [r15+0xc0],xmm0
      e91ee5:	00 
      e91ee6:	e8 9b c5 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91eeb:	48 8b 84 24 f8 05 00 	mov    rax,QWORD PTR [rsp+0x5f8]
      e91ef2:	00 
      e91ef3:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e91ef7:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e91efb:	48 85 c0             	test   rax,rax
      e91efe:	74 05                	je     e91f05 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5931b>
      e91f00:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91f05:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e91f09:	f3 0f 7f 03          	movdqu XMMWORD PTR [rbx],xmm0
      e91f0d:	e8 74 c5 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91f12:	48 8b 84 24 d0 07 00 	mov    rax,QWORD PTR [rsp+0x7d0]
      e91f19:	00 
      e91f1a:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e91f1e:	0f 85 90 00 00 00    	jne    e91fb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x593ca>
      e91f24:	49 8b 9f 80 00 00 00 	mov    rbx,QWORD PTR [r15+0x80]
      e91f2b:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
      e91f2f:	f3 41 0f 6f 47 10    	movdqu xmm0,XMMWORD PTR [r15+0x10]
      e91f35:	66 0f 7f 84 24 90 09 	movdqa XMMWORD PTR [rsp+0x990],xmm0
      e91f3c:	00 00 
      e91f3e:	48 85 c0             	test   rax,rax
      e91f41:	74 05                	je     e91f48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5935e>
      e91f43:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91f48:	48 8d 35 d5 7c c2 ff 	lea    rsi,[rip+0xffffffffffc27cd5]        # ab9c24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6bc4>
      e91f4f:	48 8d 15 e8 7c c2 ff 	lea    rdx,[rip+0xffffffffffc27ce8]        # ab9c3e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6bde>
      e91f56:	48 8d 0d 0b 05 c5 ff 	lea    rcx,[rip+0xffffffffffc5050b]        # ae2468 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f408>
      e91f5d:	4c 8d bc 24 60 08 00 	lea    r15,[rsp+0x860]
      e91f64:	00 
      e91f65:	4c 8d 84 24 90 09 00 	lea    r8,[rsp+0x990]
      e91f6c:	00 
      e91f6d:	6a 10                	push   0x10
      e91f6f:	41 59                	pop    r9
      e91f71:	4c 89 ff             	mov    rdi,r15
      e91f74:	e8 1b 88 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e91f79:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e91f7c:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      e91f83:	00 
      e91f84:	48 89 de             	mov    rsi,rbx

### context 0xe91fc9
      e91f83:	00 
      e91f84:	48 89 de             	mov    rsi,rbx
      e91f87:	4c 89 fa             	mov    rdx,r15
      e91f8a:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e91f8d:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
      e91f94:	00 
      e91f95:	e8 ec c4 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91f9a:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]
      e91fa1:	00 
      e91fa2:	e8 41 88 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e91fa7:	48 8b bc 24 98 09 00 	mov    rdi,QWORD PTR [rsp+0x998]
      e91fae:	00 
      e91faf:	e8 d2 c4 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91fb4:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
      e91fbb:	00 
      e91fbc:	48 8d b4 24 60 04 00 	lea    rsi,[rsp+0x460]
      e91fc3:	00 
      e91fc4:	e8 c7 82 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e91fc9:	48 8b 84 24 d0 07 00 	mov    rax,QWORD PTR [rsp+0x7d0]
      e91fd0:	00 
      e91fd1:	40 8a 68 01          	mov    bpl,BYTE PTR [rax+0x1]
      e91fd5:	48 8b 9c 24 48 03 00 	mov    rbx,QWORD PTR [rsp+0x348]
      e91fdc:	00 
      e91fdd:	48 8d 35 d2 8f 4f ff 	lea    rsi,[rip+0xffffffffff4f8fd2]        # 38afb6 <_ZTSSt12bad_any_cast@@Base-0x5212>
      e91fe4:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      e91feb:	00 
      e91fec:	e8 8d 7a be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e91ff1:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
      e91ff6:	48 8b b4 24 00 05 00 	mov    rsi,QWORD PTR [rsp+0x500]
      e91ffd:	00 
      e91ffe:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
      e92005:	00 
      e92006:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
      e9200d:	00 
      e9200e:	e8 a7 b0 c1 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
      e92013:	48 8d 05 c6 c8 97 00 	lea    rax,[rip+0x97c8c6]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e9201a:	48 8d 8c 24 00 08 00 	lea    rcx,[rsp+0x800]
      e92021:	00 
      e92022:	48 89 01             	mov    QWORD PTR [rcx],rax
      e92025:	48 8b 05 74 fa a1 00 	mov    rax,QWORD PTR [rip+0xa1fa74]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e9202c:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
      e92030:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      e92034:	bf 60 01 00 00       	mov    edi,0x160
      e92039:	e8 c2 be 95 00       	call   17edf00 <_Znwm@plt>
      e9203e:	49 89 c4             	mov    r12,rax

### context 0xe9226d
      e92216:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      e9221c:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      e92221:	48 8b b8 d8 00 00 00 	mov    rdi,QWORD PTR [rax+0xd8]
      e92228:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      e9222d:	0f 11 80 d0 00 00 00 	movups XMMWORD PTR [rax+0xd0],xmm0
      e92234:	e8 4d c2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92239:	66 0f 6f 84 24 d0 08 	movdqa xmm0,XMMWORD PTR [rsp+0x8d0]
      e92240:	00 00 
      e92242:	48 8b 84 24 d8 08 00 	mov    rax,QWORD PTR [rsp+0x8d8]
      e92249:	00 
      e9224a:	48 85 c0             	test   rax,rax
      e9224d:	74 05                	je     e92254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5966a>
      e9224f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e92254:	48 8b 5c 24 38       	mov    rbx,QWORD PTR [rsp+0x38]
      e92259:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
      e92260:	f3 0f 7f 83 e0 00 00 	movdqu XMMWORD PTR [rbx+0xe0],xmm0
      e92267:	00 
      e92268:	e8 19 c2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9226d:	48 8b 84 24 d0 07 00 	mov    rax,QWORD PTR [rsp+0x7d0]
      e92274:	00 
      e92275:	8a 48 01             	mov    cl,BYTE PTR [rax+0x1]
      e92278:	80 f1 01             	xor    cl,0x1
      e9227b:	88 8b f0 00 00 00    	mov    BYTE PTR [rbx+0xf0],cl
      e92281:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e92285:	0f 85 3b 01 00 00    	jne    e923c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x597dc>
      e9228b:	48 8d b4 24 60 09 00 	lea    rsi,[rsp+0x960]
      e92292:	00 
      e92293:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e92299:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9229d:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      e922a3:	48 8b bc 24 40 05 00 	mov    rdi,QWORD PTR [rsp+0x540]
      e922aa:	00 
      e922ab:	e8 e0 ba c2 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      e922b0:	48 8b bc 24 68 09 00 	mov    rdi,QWORD PTR [rsp+0x968]
      e922b7:	00 
      e922b8:	e8 f5 c1 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e922bd:	48 8b bc 24 48 03 00 	mov    rdi,QWORD PTR [rsp+0x348]
      e922c4:	00 
      e922c5:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      e922cb:	48 8d b4 24 90 09 00 	lea    rsi,[rsp+0x990]
      e922d2:	00 
      e922d3:	48 8d 05 3e f9 5b ff 	lea    rax,[rip+0xffffffffff5bf93e]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      e922da:	48 89 06             	mov    QWORD PTR [rsi],rax
      e922dd:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e922e1:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0

### context 0xe9232c
      e922dd:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e922e1:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      e922e6:	48 8d 9c 24 60 08 00 	lea    rbx,[rsp+0x860]
      e922ed:	00 
      e922ee:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e922f4:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0
      e922f8:	48 8d 05 25 bc c6 ff 	lea    rax,[rip+0xffffffffffc6bc25]        # afdf24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4aec4>
      e922ff:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e92303:	48 8d 05 d2 6c 00 00 	lea    rax,[rip+0x6cd2]        # e98fdc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x603f2>
      e9230a:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e9230e:	48 89 da             	mov    rdx,rbx
      e92311:	e8 72 f1 92 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
      e92316:	48 89 df             	mov    rdi,rbx
      e92319:	e8 80 4f c1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      e9231e:	31 ff                	xor    edi,edi
      e92320:	e8 bf d2 c4 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
      e92325:	31 ff                	xor    edi,edi
      e92327:	e8 86 c1 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e9232c:	48 8b 84 24 d0 07 00 	mov    rax,QWORD PTR [rsp+0x7d0]
      e92333:	00 
      e92334:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e92338:	0f 85 88 00 00 00    	jne    e923c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x597dc>
      e9233e:	48 8b 9c 24 a0 08 00 	mov    rbx,QWORD PTR [rsp+0x8a0]
      e92345:	00 
      e92346:	4c 8d 84 24 30 08 00 	lea    r8,[rsp+0x830]
      e9234d:	00 
      e9234e:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e92354:	66 41 0f 7f 00       	movdqa XMMWORD PTR [r8],xmm0
      e92359:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      e9235f:	48 8d 35 6a b8 cf ff 	lea    rsi,[rip+0xffffffffffcfb86a]        # b8dbd0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab70>
      e92366:	48 8d 15 7c b8 cf ff 	lea    rdx,[rip+0xffffffffffcfb87c]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
      e9236d:	48 8d 0d 6e 6c 00 00 	lea    rcx,[rip+0x6c6e]        # e98fe2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x603f8>
      e92374:	4c 8d b4 24 60 08 00 	lea    r14,[rsp+0x860]
      e9237b:	00 
      e9237c:	6a 10                	push   0x10
      e9237e:	41 59                	pop    r9
      e92380:	4c 89 f7             	mov    rdi,r14
      e92383:	e8 0c 84 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e92388:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e9238b:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
      e92392:	00 
      e92393:	48 89 de             	mov    rsi,rbx
      e92396:	4c 89 f2             	mov    rdx,r14
      e92399:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      e9239f:	48 8b bc 24 98 09 00 	mov    rdi,QWORD PTR [rsp+0x998]

## Exact direct refs: rsp+0x7f8 (base+0x598 state/control)
  e9010a:	48 83 a4 24 f8 07 00 	and    QWORD PTR [rsp+0x7f8],0x0
  e913ef:	48 89 84 24 f8 07 00 	mov    QWORD PTR [rsp+0x7f8],rax

### context 0xe9010a
      e900b5:	4c 8b ac 24 d8 0b 00 	mov    r13,QWORD PTR [rsp+0xbd8]
      e900bc:	00 
      e900bd:	48 8d 9c 24 18 07 00 	lea    rbx,[rsp+0x718]
      e900c4:	00 
      e900c5:	ba b0 00 00 00       	mov    edx,0xb0
      e900ca:	48 89 df             	mov    rdi,rbx
      e900cd:	e8 fe f9 95 00       	call   17efad0 <memcpy@plt>
      e900d2:	4c 89 a3 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],r12
      e900d9:	4c 89 bb b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],r15
      e900e0:	4c 89 b3 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],r14
      e900e7:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
      e900ec:	0f 29 83 c8 00 00 00 	movaps XMMWORD PTR [rbx+0xc8],xmm0
      e900f3:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
      e900f8:	48 85 c0             	test   rax,rax
      e900fb:	74 05                	je     e90102 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57518>
      e900fd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e90102:	4c 89 ac 24 f0 07 00 	mov    QWORD PTR [rsp+0x7f0],r13
      e90109:	00 
      e9010a:	48 83 a4 24 f8 07 00 	and    QWORD PTR [rsp+0x7f8],0x0
      e90111:	00 00 
      e90113:	48 8b 84 24 00 0a 00 	mov    rax,QWORD PTR [rsp+0xa00]
      e9011a:	00 
      e9011b:	48 8b 18             	mov    rbx,QWORD PTR [rax]
      e9011e:	48 8d 35 0d 31 54 ff 	lea    rsi,[rip+0xffffffffff54310d]        # 3d3232 <_ZTSN5boost17bad_function_callE@@Base+0x578>
      e90125:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e9012c:	00 
      e9012d:	e8 4c 99 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e90132:	4c 8d b4 24 b8 08 00 	lea    r14,[rsp+0x8b8]
      e90139:	00 
      e9013a:	48 8d 35 fa 30 54 ff 	lea    rsi,[rip+0xffffffffff5430fa]        # 3d323b <_ZTSN5boost17bad_function_callE@@Base+0x581>
      e90141:	4c 89 f7             	mov    rdi,r14
      e90144:	e8 35 99 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e90149:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
      e90150:	00 
      e90151:	48 8d b4 24 a0 08 00 	lea    rsi,[rsp+0x8a0]
      e90158:	00 
      e90159:	6a 02                	push   0x2
      e9015b:	5a                   	pop    rdx
      e9015c:	4c 89 e7             	mov    rdi,r12
      e9015f:	e8 f4 72 c1 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
      e90164:	6a 18                	push   0x18
      e90166:	41 5f                	pop    r15
      e90168:	4a 8d 3c 3c          	lea    rdi,[rsp+r15*1]
      e9016c:	48 81 c7 a0 08 00 00 	add    rdi,0x8a0
      e90173:	e8 18 dd 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### context 0xe913ef
      e913aa:	00 
      e913ab:	e8 86 d7 c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e913b0:	48 8b b4 24 b0 0a 00 	mov    rsi,QWORD PTR [rsp+0xab0]
      e913b7:	00 
      e913b8:	48 83 7e 20 00       	cmp    QWORD PTR [rsi+0x20],0x0
      e913bd:	74 28                	je     e913e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587fd>
      e913bf:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
      e913c6:	00 
      e913c7:	48 89 df             	mov    rdi,rbx
      e913ca:	e8 5d b6 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e913cf:	48 8d bc 24 b0 04 00 	lea    rdi,[rsp+0x4b0]
      e913d6:	00 
      e913d7:	48 89 de             	mov    rsi,rbx
      e913da:	e8 c1 05 d8 ff       	call   c119a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e940>
      e913df:	48 89 df             	mov    rdi,rbx
      e913e2:	e8 83 8b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e913e7:	48 8b 84 24 e0 0b 00 	mov    rax,QWORD PTR [rsp+0xbe0]
      e913ee:	00 
      e913ef:	48 89 84 24 f8 07 00 	mov    QWORD PTR [rsp+0x7f8],rax
      e913f6:	00 
      e913f7:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e913fe:	00 
      e913ff:	48 8b b4 24 80 0a 00 	mov    rsi,QWORD PTR [rsp+0xa80]
      e91406:	00 
      e91407:	e8 84 8e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9140c:	48 8d 9c 24 a0 08 00 	lea    rbx,[rsp+0x8a0]
      e91413:	00 
      e91414:	48 89 df             	mov    rdi,rbx
      e91417:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
      e9141e:	00 
      e9141f:	e8 02 6f cf ff       	call   b88326 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd52c6>
      e91424:	48 89 df             	mov    rdi,rbx
      e91427:	e8 3e 8b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9142c:	ba f0 00 00 00       	mov    edx,0xf0
      e91431:	4c 89 e7             	mov    rdi,r12
      e91434:	31 f6                	xor    esi,esi
      e91436:	e8 55 d7 95 00       	call   17eeb90 <memset@plt>
      e9143b:	41 c6 84 24 f0 00 00 	mov    BYTE PTR [r12+0xf0],0x1
      e91442:	00 01 
      e91444:	66 0f ef c0          	pxor   xmm0,xmm0
      e91448:	f3 41 0f 7f 84 24 f8 	movdqu XMMWORD PTR [r12+0xf8],xmm0
      e9144f:	00 00 00 
      e91452:	f3 41 0f 7f 84 24 08 	movdqu XMMWORD PTR [r12+0x108],xmm0
      e91459:	01 00 00 
      e9145c:	48 8b bc 24 50 03 00 	mov    rdi,QWORD PTR [rsp+0x350]

## Address-taking of the rsp+0x260 base
### 0xe91df6: lea    rsi,[rsp+0x260]
      e91d92:	48 89 df             	mov    rdi,rbx
      e91d95:	e8 4e 8a 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e91d9a:	49 83 c5 10          	add    r13,0x10
      e91d9e:	4d 39 e5             	cmp    r13,r12
      e91da1:	0f 85 77 ff ff ff    	jne    e91d1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59134>
      e91da7:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
      e91dae:	00 
      e91daf:	e8 6e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e91db4:	31 ff                	xor    edi,edi
      e91db6:	e8 61 c6 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e91dbb:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]
      e91dc2:	00 
      e91dc3:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      e91dc8:	48 89 03             	mov    QWORD PTR [rbx],rax
      e91dcb:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      e91dd0:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      e91dd4:	4c 8d b4 24 60 09 00 	lea    r14,[rsp+0x960]
      e91ddb:	00 
      e91ddc:	4c 89 f7             	mov    rdi,r14
      e91ddf:	e8 3e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e91de4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e91de9:	e8 98 c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91dee:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e91df5:	00 
      e91df6:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
      e91dfd:	00 
      e91dfe:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
      e91e03:	48 89 d9             	mov    rcx,rbx
      e91e06:	e8 21 11 00 00       	call   e92f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a342>
      e91e0b:	0f 28 84 24 b0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8b0]
      e91e12:	00 
      e91e13:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      e91e18:	4c 89 ff             	mov    rdi,r15
      e91e1b:	e8 16 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e20:	49 8d 7f 10          	lea    rdi,[r15+0x10]
      e91e24:	0f 28 84 24 a0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8a0]
      e91e2b:	00 
      e91e2c:	e8 05 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e31:	0f 28 84 24 c0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8c0]
      e91e38:	00 
      e91e39:	48 8b 84 24 c8 08 00 	mov    rax,QWORD PTR [rsp+0x8c8]
      e91e40:	00 
      e91e41:	48 85 c0             	test   rax,rax
      e91e44:	74 05                	je     e91e4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59261>
      e91e46:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91e4b:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
      e91e4f:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      e91e54:	e8 2d c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91e59:	48 8d 9c 24 e0 08 00 	lea    rbx,[rsp+0x8e0]
      e91e60:	00 
      e91e61:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      e91e65:	48 89 de             	mov    rsi,rbx
      e91e68:	e8 cf 70 00 00       	call   e98f3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60352>
      e91e6d:	4d 8d a7 90 00 00 00 	lea    r12,[r15+0x90]
      e91e74:	0f 28 43 50          	movaps xmm0,XMMWORD PTR [rbx+0x50]
      e91e78:	4c 89 e7             	mov    rdi,r12
      e91e7b:	e8 b6 cc c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e80:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
      e91e87:	0f 28 43 60          	movaps xmm0,XMMWORD PTR [rbx+0x60]
      e91e8b:	e8 a6 cc c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>

### 0xe9247f: lea    rdi,[rsp+0x260]
      e92419:	00 
      e9241a:	e8 67 c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9241f:	66 0f 6f 84 24 90 06 	movdqa xmm0,XMMWORD PTR [rsp+0x690]
      e92426:	00 00 
      e92428:	48 8b 84 24 98 06 00 	mov    rax,QWORD PTR [rsp+0x698]
      e9242f:	00 
      e92430:	48 85 c0             	test   rax,rax
      e92433:	74 05                	je     e9243a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59850>
      e92435:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9243a:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      e9243f:	48 8b b8 10 01 00 00 	mov    rdi,QWORD PTR [rax+0x110]
      e92446:	f3 0f 7f 80 08 01 00 	movdqu XMMWORD PTR [rax+0x108],xmm0
      e9244d:	00 
      e9244e:	e8 33 c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92453:	4c 89 e7             	mov    rdi,r12
      e92456:	e8 2b c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9245b:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e92462:	00 
      e92463:	e8 1c 6d 00 00       	call   e99184 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6059a>
      e92468:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
      e9246f:	00 
      e92470:	e8 11 c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92475:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e9247a:	e8 33 c0 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e9247f:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      e92486:	00 
      e92487:	e8 de 08 00 00       	call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e9248c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e92493:	00 00 
      e92495:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e9249c:	00 
      e9249d:	0f 85 a1 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e924a3:	48 81 c4 c8 09 00 00 	add    rsp,0x9c8
      e924aa:	5b                   	pop    rbx
      e924ab:	41 5c                	pop    r12
      e924ad:	41 5d                	pop    r13
      e924af:	41 5e                	pop    r14
      e924b1:	41 5f                	pop    r15
      e924b3:	5d                   	pop    rbp
      e924b4:	c3                   	ret
      e924b5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e924bc:	00 00 
      e924be:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e924c5:	00 
      e924c6:	0f 85 78 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e924cc:	e8 a2 7f be ff       	call   a7a473 <JNI_OnUnload@@Base+0x1d40>
      e924d1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e924d8:	00 00 
      e924da:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e924e1:	00 
      e924e2:	0f 85 5c 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e924e8:	e8 d3 20 b7 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      e924ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e924f4:	00 00 
      e924f6:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e924fd:	00 
      e924fe:	0f 85 40 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e92504:	e8 d6 91 be ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
      e92509:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9250e:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]

### 0xe92c1a: lea    rdi,[rsp+0x260]
      e92bac:	e8 37 7c 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e92bb1:	4c 89 ff             	mov    rdi,r15
      e92bb4:	e8 ab 9f c2 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
      e92bb9:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      e92bbe:	e8 a3 72 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e92bc3:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e92bc8:	e8 55 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bcd:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
      e92bd4:	00 
      e92bd5:	e8 48 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bda:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]
      e92bdf:	48 89 df             	mov    rdi,rbx
      e92be2:	e8 29 b4 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e92be7:	48 89 df             	mov    rdi,rbx
      e92bea:	e8 2d b8 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e92bef:	48 8d bc 24 60 09 00 	lea    rdi,[rsp+0x960]
      e92bf6:	00 
      e92bf7:	e8 26 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bfc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e92c01:	e8 80 b8 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92c06:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e92c0b:	e8 a2 b8 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e92c10:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e92c15:	e8 2c 40 62 00       	call   14b6c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc1ca>
      e92c1a:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      e92c21:	00 
      e92c22:	e8 43 01 00 00       	call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e92c27:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e92c2e:	00 00 
      e92c30:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e92c37:	00 
      e92c38:	75 0a                	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e92c3a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      e92c3f:	e8 8c d0 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      e92c44:	e8 67 ce 95 00       	call   17efab0 <__stack_chk_fail@plt>
      e92c49:	41 57                	push   r15
      e92c4b:	41 56                	push   r14
      e92c4d:	41 54                	push   r12
      e92c4f:	53                   	push   rbx
      e92c50:	50                   	push   rax
      e92c51:	48 89 d3             	mov    rbx,rdx
      e92c54:	48 39 f7             	cmp    rdi,rsi
      e92c57:	74 22                	je     e92c7b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a091>
      e92c59:	49 89 f6             	mov    r14,rsi
      e92c5c:	49 89 ff             	mov    r15,rdi
      e92c5f:	41 bc 80 00 00 00    	mov    r12d,0x80
      e92c65:	48 89 df             	mov    rdi,rbx
      e92c68:	4c 89 fe             	mov    rsi,r15
      e92c6b:	e8 c0 c7 ff ff       	call   e8f430 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56846>
      e92c70:	4d 01 e7             	add    r15,r12
      e92c73:	4c 01 e3             	add    rbx,r12
      e92c76:	4d 39 f7             	cmp    r15,r14
      e92c79:	75 ea                	jne    e92c65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a07b>
      e92c7b:	48 89 d8             	mov    rax,rbx
      e92c7e:	48 83 c4 08          	add    rsp,0x8
      e92c82:	5b                   	pop    rbx
      e92c83:	41 5c                	pop    r12
      e92c85:	41 5e                	pop    r14
      e92c87:	41 5f                	pop    r15
      e92c89:	c3                   	ret

## Calls immediately following base-address materialization
### base @0xe91df6 -> call @0xe91e06: call   e92f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a342>
      e91dae:	00 
      e91daf:	e8 6e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e91db4:	31 ff                	xor    edi,edi
      e91db6:	e8 61 c6 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e91dbb:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]
      e91dc2:	00 
      e91dc3:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      e91dc8:	48 89 03             	mov    QWORD PTR [rbx],rax
      e91dcb:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      e91dd0:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      e91dd4:	4c 8d b4 24 60 09 00 	lea    r14,[rsp+0x960]
      e91ddb:	00 
      e91ddc:	4c 89 f7             	mov    rdi,r14
      e91ddf:	e8 3e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e91de4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e91de9:	e8 98 c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91dee:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e91df5:	00 
      e91df6:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
      e91dfd:	00 
      e91dfe:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
      e91e03:	48 89 d9             	mov    rcx,rbx
      e91e06:	e8 21 11 00 00       	call   e92f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a342>
      e91e0b:	0f 28 84 24 b0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8b0]
      e91e12:	00 
      e91e13:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      e91e18:	4c 89 ff             	mov    rdi,r15
      e91e1b:	e8 16 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e20:	49 8d 7f 10          	lea    rdi,[r15+0x10]
      e91e24:	0f 28 84 24 a0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8a0]
      e91e2b:	00 
      e91e2c:	e8 05 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e31:	0f 28 84 24 c0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8c0]
      e91e38:	00 
      e91e39:	48 8b 84 24 c8 08 00 	mov    rax,QWORD PTR [rsp+0x8c8]
      e91e40:	00 
      e91e41:	48 85 c0             	test   rax,rax
      e91e44:	74 05                	je     e91e4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59261>
      e91e46:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91e4b:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
      e91e4f:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      e91e54:	e8 2d c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91e59:	48 8d 9c 24 e0 08 00 	lea    rbx,[rsp+0x8e0]
      e91e60:	00 
      e91e61:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      e91e65:	48 89 de             	mov    rsi,rbx
      e91e68:	e8 cf 70 00 00       	call   e98f3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60352>
      e91e6d:	4d 8d a7 90 00 00 00 	lea    r12,[r15+0x90]
      e91e74:	0f 28 43 50          	movaps xmm0,XMMWORD PTR [rbx+0x50]
      e91e78:	4c 89 e7             	mov    rdi,r12
      e91e7b:	e8 b6 cc c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e80:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
      e91e87:	0f 28 43 60          	movaps xmm0,XMMWORD PTR [rbx+0x60]

### base @0xe9247f -> call @0xe92487: call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e92428:	48 8b 84 24 98 06 00 	mov    rax,QWORD PTR [rsp+0x698]
      e9242f:	00 
      e92430:	48 85 c0             	test   rax,rax
      e92433:	74 05                	je     e9243a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59850>
      e92435:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9243a:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      e9243f:	48 8b b8 10 01 00 00 	mov    rdi,QWORD PTR [rax+0x110]
      e92446:	f3 0f 7f 80 08 01 00 	movdqu XMMWORD PTR [rax+0x108],xmm0
      e9244d:	00 
      e9244e:	e8 33 c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92453:	4c 89 e7             	mov    rdi,r12
      e92456:	e8 2b c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9245b:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e92462:	00 
      e92463:	e8 1c 6d 00 00       	call   e99184 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6059a>
      e92468:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
      e9246f:	00 
      e92470:	e8 11 c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92475:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e9247a:	e8 33 c0 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e9247f:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      e92486:	00 
      e92487:	e8 de 08 00 00       	call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e9248c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e92493:	00 00 
      e92495:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e9249c:	00 
      e9249d:	0f 85 a1 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e924a3:	48 81 c4 c8 09 00 00 	add    rsp,0x9c8
      e924aa:	5b                   	pop    rbx
      e924ab:	41 5c                	pop    r12
      e924ad:	41 5d                	pop    r13
      e924af:	41 5e                	pop    r14
      e924b1:	41 5f                	pop    r15
      e924b3:	5d                   	pop    rbp
      e924b4:	c3                   	ret
      e924b5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e924bc:	00 00 
      e924be:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e924c5:	00 
      e924c6:	0f 85 78 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e924cc:	e8 a2 7f be ff       	call   a7a473 <JNI_OnUnload@@Base+0x1d40>
      e924d1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e924d8:	00 00 
      e924da:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e924e1:	00 
      e924e2:	0f 85 5c 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e924e8:	e8 d3 20 b7 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      e924ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e924f4:	00 00 
      e924f6:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e924fd:	00 
      e924fe:	0f 85 40 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>

### base @0xe92c1a -> call @0xe92c22: call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e92bbe:	e8 a3 72 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e92bc3:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e92bc8:	e8 55 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bcd:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
      e92bd4:	00 
      e92bd5:	e8 48 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bda:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]
      e92bdf:	48 89 df             	mov    rdi,rbx
      e92be2:	e8 29 b4 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e92be7:	48 89 df             	mov    rdi,rbx
      e92bea:	e8 2d b8 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e92bef:	48 8d bc 24 60 09 00 	lea    rdi,[rsp+0x960]
      e92bf6:	00 
      e92bf7:	e8 26 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bfc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e92c01:	e8 80 b8 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92c06:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e92c0b:	e8 a2 b8 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e92c10:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e92c15:	e8 2c 40 62 00       	call   14b6c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc1ca>
      e92c1a:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      e92c21:	00 
      e92c22:	e8 43 01 00 00       	call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e92c27:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e92c2e:	00 00 
      e92c30:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e92c37:	00 
      e92c38:	75 0a                	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e92c3a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      e92c3f:	e8 8c d0 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      e92c44:	e8 67 ce 95 00       	call   17efab0 <__stack_chk_fail@plt>
      e92c49:	41 57                	push   r15
      e92c4b:	41 56                	push   r14
      e92c4d:	41 54                	push   r12
      e92c4f:	53                   	push   rbx
      e92c50:	50                   	push   rax
      e92c51:	48 89 d3             	mov    rbx,rdx
      e92c54:	48 39 f7             	cmp    rdi,rsi
      e92c57:	74 22                	je     e92c7b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a091>
      e92c59:	49 89 f6             	mov    r14,rsi
      e92c5c:	49 89 ff             	mov    r15,rdi
      e92c5f:	41 bc 80 00 00 00    	mov    r12d,0x80
      e92c65:	48 89 df             	mov    rdi,rbx
      e92c68:	4c 89 fe             	mov    rsi,r15
      e92c6b:	e8 c0 c7 ff ff       	call   e8f430 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56846>
      e92c70:	4d 01 e7             	add    r15,r12
      e92c73:	4c 01 e3             	add    rbx,r12
      e92c76:	4d 39 f7             	cmp    r15,r14
      e92c79:	75 ea                	jne    e92c65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a07b>
      e92c7b:	48 89 d8             	mov    rax,rbx
      e92c7e:	48 83 c4 08          	add    rsp,0x8
      e92c82:	5b                   	pop    rbx
      e92c83:	41 5c                	pop    r12

## Wide XMM/qword copies covering anchor neighborhoods
  e8ff38:	0f 29 84 24 30 06 00 	movaps XMMWORD PTR [rsp+0x630],xmm0
  e8ff58:	0f 29 84 24 60 06 00 	movaps XMMWORD PTR [rsp+0x660],xmm0
  e8ff60:	0f 29 84 24 50 06 00 	movaps XMMWORD PTR [rsp+0x650],xmm0
  e8ff68:	0f 29 84 24 40 06 00 	movaps XMMWORD PTR [rsp+0x640],xmm0
  e8ff70:	4c 89 84 24 70 06 00 	mov    QWORD PTR [rsp+0x670],r8
  e8ff78:	48 89 bc 24 78 06 00 	mov    QWORD PTR [rsp+0x678],rdi
  e8ff80:	48 89 94 24 80 06 00 	mov    QWORD PTR [rsp+0x680],rdx
  e8ff88:	48 89 8c 24 88 06 00 	mov    QWORD PTR [rsp+0x688],rcx
  e8ff97:	0f 29 84 24 90 06 00 	movaps XMMWORD PTR [rsp+0x690],xmm0
  e8ffa9:	48 89 b4 24 a0 06 00 	mov    QWORD PTR [rsp+0x6a0],rsi
  e8ffe5:	48 89 b4 24 a8 06 00 	mov    QWORD PTR [rsp+0x6a8],rsi
  e8ffed:	48 89 84 24 b0 06 00 	mov    QWORD PTR [rsp+0x6b0],rax
  e8fffa:	0f 11 84 24 b8 06 00 	movups XMMWORD PTR [rsp+0x6b8],xmm0
  e9001c:	48 89 94 24 c8 06 00 	mov    QWORD PTR [rsp+0x6c8],rdx
  e9002b:	0f 29 84 24 d0 06 00 	movaps XMMWORD PTR [rsp+0x6d0],xmm0
  e9004d:	48 89 bc 24 e0 06 00 	mov    QWORD PTR [rsp+0x6e0],rdi
  e9005c:	0f 11 84 24 e8 06 00 	movups XMMWORD PTR [rsp+0x6e8],xmm0
  e9008e:	48 89 8c 24 f8 06 00 	mov    QWORD PTR [rsp+0x6f8],rcx
  e90096:	48 89 84 24 00 07 00 	mov    QWORD PTR [rsp+0x700],rax
  e900a3:	0f 11 84 24 08 07 00 	movups XMMWORD PTR [rsp+0x708],xmm0
  e90102:	4c 89 ac 24 f0 07 00 	mov    QWORD PTR [rsp+0x7f0],r13
  e913ef:	48 89 84 24 f8 07 00 	mov    QWORD PTR [rsp+0x7f8],rax
  e9241f:	66 0f 6f 84 24 90 06 	movdqa xmm0,XMMWORD PTR [rsp+0x690]

## Calls with destination/address inside rsp+0x240..0x280
### addr 0x260 @0xe91df6 -> call 0xe91e06: call   e92f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a342>
      e91dc3:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      e91dc8:	48 89 03             	mov    QWORD PTR [rbx],rax
      e91dcb:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      e91dd0:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      e91dd4:	4c 8d b4 24 60 09 00 	lea    r14,[rsp+0x960]
      e91ddb:	00 
      e91ddc:	4c 89 f7             	mov    rdi,r14
      e91ddf:	e8 3e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e91de4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e91de9:	e8 98 c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91dee:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e91df5:	00 
      e91df6:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
      e91dfd:	00 
      e91dfe:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
      e91e03:	48 89 d9             	mov    rcx,rbx
      e91e06:	e8 21 11 00 00       	call   e92f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a342>
      e91e0b:	0f 28 84 24 b0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8b0]
      e91e12:	00 
      e91e13:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      e91e18:	4c 89 ff             	mov    rdi,r15
      e91e1b:	e8 16 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e20:	49 8d 7f 10          	lea    rdi,[r15+0x10]
      e91e24:	0f 28 84 24 a0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8a0]
      e91e2b:	00 
      e91e2c:	e8 05 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e31:	0f 28 84 24 c0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8c0]
      e91e38:	00 
      e91e39:	48 8b 84 24 c8 08 00 	mov    rax,QWORD PTR [rsp+0x8c8]
      e91e40:	00 
      e91e41:	48 85 c0             	test   rax,rax
      e91e44:	74 05                	je     e91e4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59261>
      e91e46:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91e4b:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
      e91e4f:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      e91e54:	e8 2d c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91e59:	48 8d 9c 24 e0 08 00 	lea    rbx,[rsp+0x8e0]
      e91e60:	00 
      e91e61:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      e91e65:	48 89 de             	mov    rsi,rbx
      e91e68:	e8 cf 70 00 00       	call   e98f3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60352>

### addr 0x260 @0xe9247f -> call 0xe92487: call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e9243f:	48 8b b8 10 01 00 00 	mov    rdi,QWORD PTR [rax+0x110]
      e92446:	f3 0f 7f 80 08 01 00 	movdqu XMMWORD PTR [rax+0x108],xmm0
      e9244d:	00 
      e9244e:	e8 33 c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92453:	4c 89 e7             	mov    rdi,r12
      e92456:	e8 2b c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9245b:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e92462:	00 
      e92463:	e8 1c 6d 00 00       	call   e99184 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6059a>
      e92468:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
      e9246f:	00 
      e92470:	e8 11 c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92475:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e9247a:	e8 33 c0 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e9247f:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      e92486:	00 
      e92487:	e8 de 08 00 00       	call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e9248c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e92493:	00 00 
      e92495:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e9249c:	00 
      e9249d:	0f 85 a1 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e924a3:	48 81 c4 c8 09 00 00 	add    rsp,0x9c8
      e924aa:	5b                   	pop    rbx
      e924ab:	41 5c                	pop    r12
      e924ad:	41 5d                	pop    r13
      e924af:	41 5e                	pop    r14
      e924b1:	41 5f                	pop    r15
      e924b3:	5d                   	pop    rbp
      e924b4:	c3                   	ret
      e924b5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e924bc:	00 00 
      e924be:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e924c5:	00 
      e924c6:	0f 85 78 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e924cc:	e8 a2 7f be ff       	call   a7a473 <JNI_OnUnload@@Base+0x1d40>
      e924d1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e924d8:	00 00 
      e924da:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e924e1:	00 
      e924e2:	0f 85 5c 07 00 00    	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>

### addr 0x260 @0xe92c1a -> call 0xe92c22: call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e92bda:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]
      e92bdf:	48 89 df             	mov    rdi,rbx
      e92be2:	e8 29 b4 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e92be7:	48 89 df             	mov    rdi,rbx
      e92bea:	e8 2d b8 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e92bef:	48 8d bc 24 60 09 00 	lea    rdi,[rsp+0x960]
      e92bf6:	00 
      e92bf7:	e8 26 af c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e92bfc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e92c01:	e8 80 b8 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e92c06:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e92c0b:	e8 a2 b8 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e92c10:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e92c15:	e8 2c 40 62 00       	call   14b6c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc1ca>
      e92c1a:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      e92c21:	00 
      e92c22:	e8 43 01 00 00       	call   e92d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a180>
      e92c27:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e92c2e:	00 00 
      e92c30:	48 3b 84 24 c0 09 00 	cmp    rax,QWORD PTR [rsp+0x9c0]
      e92c37:	00 
      e92c38:	75 0a                	jne    e92c44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05a>
      e92c3a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      e92c3f:	e8 8c d0 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      e92c44:	e8 67 ce 95 00       	call   17efab0 <__stack_chk_fail@plt>
      e92c49:	41 57                	push   r15
      e92c4b:	41 56                	push   r14
      e92c4d:	41 54                	push   r12
      e92c4f:	53                   	push   rbx
      e92c50:	50                   	push   rax
      e92c51:	48 89 d3             	mov    rbx,rdx
      e92c54:	48 39 f7             	cmp    rdi,rsi
      e92c57:	74 22                	je     e92c7b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a091>
      e92c59:	49 89 f6             	mov    r14,rsi
      e92c5c:	49 89 ff             	mov    r15,rdi
      e92c5f:	41 bc 80 00 00 00    	mov    r12d,0x80
      e92c65:	48 89 df             	mov    rdi,rbx
      e92c68:	4c 89 fe             	mov    rsi,r15
      e92c6b:	e8 c0 c7 ff ff       	call   e8f430 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56846>
      e92c70:	4d 01 e7             	add    r15,r12
      e92c73:	4c 01 e3             	add    rbx,r12

