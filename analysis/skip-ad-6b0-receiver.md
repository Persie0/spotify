# Skip Ad 0x6b0 receiver class

Proven dataflow:
- rsp+0x1338 is set to a current/new 0x6b0-stride element at 0x122190f
- e9c8ec copies rsp+0x1338 into rsp+0x770
- e9ccf3 copies rsp+0x770 into state+0x10
- efc630 publishes [state+0x10] as Skip Ad adapter receiver
- fd384d calls receiver vtable +0x140 and requires EAX==0

## Constructor/copy 0x12240cc FDE=(19022028, 19022072)
     12240cc:	41 56                	push   r14
     12240ce:	53                   	push   rbx
     12240cf:	50                   	push   rax
     12240d0:	48 89 f3             	mov    rbx,rsi
     12240d3:	49 89 fe             	mov    r14,rdi
     12240d6:	e8 1d 00 00 00       	call   12240f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6967c>
     12240db:	b8 60 01 00 00       	mov    eax,0x160
     12240e0:	49 01 c6             	add    r14,rax
     12240e3:	48 01 c3             	add    rbx,rax
     12240e6:	4c 89 f7             	mov    rdi,r14
     12240e9:	48 89 de             	mov    rsi,rbx
     12240ec:	48 83 c4 08          	add    rsp,0x8
     12240f0:	5b                   	pop    rbx
     12240f1:	41 5e                	pop    r14
     12240f3:	e9 dc 9b e6 ff       	jmp    108dcd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2550ea>

## High-address constants / vptr stores

## Writes near receiver head

## Candidate address points and +0x140
## Exact direct stores of candidate APs elsewhere
