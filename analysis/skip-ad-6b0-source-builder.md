# Skip Ad 0x6b0 source builder / mutator

Call-site contract at 0x122185d:
- rdi = rsp+0x120 temporary that later becomes the 0x6b0 element
- rsi = current 0x550-stride source record
- rdx = result of 0x124a491 lookup
- after this call, 0x108d88c fills another payload and 0x12240cc moves rsp+0x120 into the 0x6b0 array

## 0x124ae36 FDE=(19181110, 19181725)
     124ae36:	55                   	push   rbp
     124ae37:	41 57                	push   r15
     124ae39:	41 56                	push   r14
     124ae3b:	41 55                	push   r13
     124ae3d:	41 54                	push   r12
     124ae3f:	53                   	push   rbx
     124ae40:	48 83 ec 78          	sub    rsp,0x78
     124ae44:	49 89 d7             	mov    r15,rdx
     124ae47:	49 89 f5             	mov    r13,rsi
     124ae4a:	48 89 fb             	mov    rbx,rdi
     124ae4d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124ae54:	00 00 
     124ae56:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     124ae5b:	48 83 c6 48          	add    rsi,0x48
     124ae5f:	49 8d 95 90 00 00 00 	lea    rdx,[r13+0x90]
     124ae66:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     124ae6b:	4c 89 f9             	mov    rcx,r15
     124ae6e:	e8 ef 02 00 00       	call   124b162 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906e6>
     124ae73:	41 8a 85 4c 05 00 00 	mov    al,BYTE PTR [r13+0x54c]
     124ae7a:	41 0a 85 f0 01 00 00 	or     al,BYTE PTR [r13+0x1f0]
     124ae81:	41 0f 94 c4          	sete   r12b
     124ae85:	4d 8d 75 18          	lea    r14,[r13+0x18]
     124ae89:	48 89 df             	mov    rdi,rbx
     124ae8c:	4c 89 f6             	mov    rsi,r14
     124ae8f:	e8 ac 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124ae94:	49 8d b5 f0 03 00 00 	lea    rsi,[r13+0x3f0]
     124ae9b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aea0:	e8 c1 2b e4 ff       	call   108da66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e7c>
     124aea5:	48 8d 6b 18          	lea    rbp,[rbx+0x18]
     124aea9:	80 7c 24 68 00       	cmp    BYTE PTR [rsp+0x68],0x0
     124aeae:	74 26                	je     124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aeb0:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     124aeb5:	48 85 f6             	test   rsi,rsi
     124aeb8:	74 1c                	je     124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aeba:	80 7c 24 60 00       	cmp    BYTE PTR [rsp+0x60],0x0
     124aebf:	75 15                	jne    124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aec1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     124aec4:	48 89 ef             	mov    rdi,rbp
     124aec7:	ff 50 38             	call   QWORD PTR [rax+0x38]
     124aeca:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aecf:	e8 04 ec e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aed4:	eb 15                	jmp    124aeeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9046f>
     124aed6:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aedb:	e8 f8 eb e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aee0:	48 89 ef             	mov    rdi,rbp
     124aee3:	4c 89 f6             	mov    rsi,r14
     124aee6:	e8 55 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124aeeb:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
     124aef0:	4c 8d 73 30          	lea    r14,[rbx+0x30]
     124aef4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     124aef9:	4c 89 f7             	mov    rdi,r14
     124aefc:	e8 3f 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124af01:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
     124af06:	48 8d 6b 48          	lea    rbp,[rbx+0x48]
     124af0a:	49 8d 75 60          	lea    rsi,[r13+0x60]
     124af0e:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
     124af13:	48 89 ef             	mov    rdi,rbp
     124af16:	e8 6a 03 00 00       	call   124b285 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90809>
     124af1b:	4c 8d 73 60          	lea    r14,[rbx+0x60]
     124af1f:	49 83 c5 78          	add    r13,0x78
     124af23:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
     124af28:	4c 89 f7             	mov    rdi,r14
     124af2b:	4c 89 ee             	mov    rsi,r13
     124af2e:	e8 52 03 00 00       	call   124b285 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90809>
     124af33:	4d 85 ff             	test   r15,r15
     124af36:	0f 94 c0             	sete   al
     124af39:	41 80 f4 01          	xor    r12b,0x1
     124af3d:	41 08 c4             	or     r12b,al
     124af40:	75 0c                	jne    124af4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x904d2>
     124af42:	41 8b 87 a4 02 00 00 	mov    eax,DWORD PTR [r15+0x2a4]
     124af49:	89 43 78             	mov    DWORD PTR [rbx+0x78],eax
     124af4c:	eb 0d                	jmp    124af5b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x904df>
     124af4e:	83 63 78 00          	and    DWORD PTR [rbx+0x78],0x0
     124af52:	4d 85 ff             	test   r15,r15
     124af55:	0f 84 88 00 00 00    	je     124afe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90567>
     124af5b:	41 0f b7 87 ac 02 00 	movzx  eax,WORD PTR [r15+0x2ac]
     124af62:	00 
     124af63:	66 89 43 7c          	mov    WORD PTR [rbx+0x7c],ax
     124af67:	41 80 bf c3 02 00 00 	cmp    BYTE PTR [r15+0x2c3],0x1
     124af6e:	01 
     124af6f:	0f 94 43 7e          	sete   BYTE PTR [rbx+0x7e]
     124af73:	41 8b 87 a0 02 00 00 	mov    eax,DWORD PTR [r15+0x2a0]
     124af7a:	89 83 80 00 00 00    	mov    DWORD PTR [rbx+0x80],eax
     124af80:	41 8a 87 c4 02 00 00 	mov    al,BYTE PTR [r15+0x2c4]
     124af87:	88 83 84 00 00 00    	mov    BYTE PTR [rbx+0x84],al
     124af8d:	4c 8d ab 88 00 00 00 	lea    r13,[rbx+0x88]
     124af94:	49 8d b7 48 02 00 00 	lea    rsi,[r15+0x248]
     124af9b:	4c 89 ef             	mov    rdi,r13
     124af9e:	e8 9d 2f 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124afa3:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
     124afaa:	49 83 c7 30          	add    r15,0x30
     124afae:	4c 89 fe             	mov    rsi,r15
     124afb1:	e8 e8 20 e4 ff       	call   108d09e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2544b4>
     124afb6:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     124afbb:	e8 d0 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124afc0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124afc7:	00 00 
     124afc9:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
     124afce:	0f 85 c4 00 00 00    	jne    124b098 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9061c>
     124afd4:	48 83 c4 78          	add    rsp,0x78
     124afd8:	5b                   	pop    rbx
     124afd9:	41 5c                	pop    r12
     124afdb:	41 5d                	pop    r13
     124afdd:	41 5e                	pop    r14
     124afdf:	41 5f                	pop    r15
     124afe1:	5d                   	pop    rbp
     124afe2:	c3                   	ret
     124afe3:	66 83 63 7c 00       	and    WORD PTR [rbx+0x7c],0x0
     124afe8:	31 c0                	xor    eax,eax
     124afea:	88 43 7e             	mov    BYTE PTR [rbx+0x7e],al
     124afed:	83 a3 80 00 00 00 00 	and    DWORD PTR [rbx+0x80],0x0
     124aff4:	88 83 84 00 00 00    	mov    BYTE PTR [rbx+0x84],al
     124affa:	48 81 c3 88 00 00 00 	add    rbx,0x88
     124b001:	ba d8 00 00 00       	mov    edx,0xd8
     124b006:	48 89 df             	mov    rdi,rbx
     124b009:	31 f6                	xor    esi,esi
     124b00b:	e8 80 3b 5a 00       	call   17eeb90 <memset@plt>
     124b010:	eb a4                	jmp    124afb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9053a>
     124b012:	49 89 c7             	mov    r15,rax
     124b015:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124b01a:	e8 b9 ea e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124b01f:	eb 4d                	jmp    124b06e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905f2>
     124b021:	49 89 c7             	mov    r15,rax
     124b024:	4c 89 ef             	mov    rdi,r13
     124b027:	e8 64 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b02c:	eb 03                	jmp    124b031 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905b5>
     124b02e:	49 89 c7             	mov    r15,rax
     124b031:	4c 89 f7             	mov    rdi,r14
     124b034:	e8 57 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b039:	eb 03                	jmp    124b03e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905c2>
     124b03b:	49 89 c7             	mov    r15,rax
     124b03e:	48 89 ef             	mov    rdi,rbp
     124b041:	e8 4a 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b046:	eb 03                	jmp    124b04b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905cf>
     124b048:	49 89 c7             	mov    r15,rax
     124b04b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     124b050:	e8 3b 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b055:	eb 03                	jmp    124b05a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905de>
     124b057:	49 89 c7             	mov    r15,rax
     124b05a:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     124b05f:	e8 2c 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b064:	eb 08                	jmp    124b06e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905f2>
     124b066:	49 89 c7             	mov    r15,rax
     124b069:	eb 0b                	jmp    124b076 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905fa>
     124b06b:	49 89 c7             	mov    r15,rax
     124b06e:	48 89 df             	mov    rdi,rbx
     124b071:	e8 1a 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b076:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     124b07b:	e8 10 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b080:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124b087:	00 00 
     124b089:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
     124b08e:	75 08                	jne    124b098 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9061c>
     124b090:	4c 89 ff             	mov    rdi,r15
     124b093:	e8 38 4c 82 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     124b098:	e8 13 4a 5a 00       	call   17efab0 <__stack_chk_fail@plt>

## Destination aliases
rbx, rdi

## Writes to destination head [0..0x40]
## High-address materializations in builder

## High-address value stores into destination / nearby object
## Candidate dispatch/vtable neighborhoods
## Calls in builder with destination passed as argument
### call 0x124ae6e: call   124b162 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906e6>
     124ae3f:	53                   	push   rbx
     124ae40:	48 83 ec 78          	sub    rsp,0x78
     124ae44:	49 89 d7             	mov    r15,rdx
     124ae47:	49 89 f5             	mov    r13,rsi
     124ae4a:	48 89 fb             	mov    rbx,rdi
     124ae4d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124ae54:	00 00 
     124ae56:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     124ae5b:	48 83 c6 48          	add    rsi,0x48
     124ae5f:	49 8d 95 90 00 00 00 	lea    rdx,[r13+0x90]
     124ae66:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     124ae6b:	4c 89 f9             	mov    rcx,r15
     124ae6e:	e8 ef 02 00 00       	call   124b162 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906e6>
     124ae73:	41 8a 85 4c 05 00 00 	mov    al,BYTE PTR [r13+0x54c]

### call 0x124ae8f: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124ae56:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     124ae5b:	48 83 c6 48          	add    rsi,0x48
     124ae5f:	49 8d 95 90 00 00 00 	lea    rdx,[r13+0x90]
     124ae66:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     124ae6b:	4c 89 f9             	mov    rcx,r15
     124ae6e:	e8 ef 02 00 00       	call   124b162 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906e6>
     124ae73:	41 8a 85 4c 05 00 00 	mov    al,BYTE PTR [r13+0x54c]
     124ae7a:	41 0a 85 f0 01 00 00 	or     al,BYTE PTR [r13+0x1f0]
     124ae81:	41 0f 94 c4          	sete   r12b
     124ae85:	4d 8d 75 18          	lea    r14,[r13+0x18]
     124ae89:	48 89 df             	mov    rdi,rbx
     124ae8c:	4c 89 f6             	mov    rsi,r14
     124ae8f:	e8 ac 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124ae94:	49 8d b5 f0 03 00 00 	lea    rsi,[r13+0x3f0]

### call 0x124aea0: call   108da66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e7c>
     124ae66:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     124ae6b:	4c 89 f9             	mov    rcx,r15
     124ae6e:	e8 ef 02 00 00       	call   124b162 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906e6>
     124ae73:	41 8a 85 4c 05 00 00 	mov    al,BYTE PTR [r13+0x54c]
     124ae7a:	41 0a 85 f0 01 00 00 	or     al,BYTE PTR [r13+0x1f0]
     124ae81:	41 0f 94 c4          	sete   r12b
     124ae85:	4d 8d 75 18          	lea    r14,[r13+0x18]
     124ae89:	48 89 df             	mov    rdi,rbx
     124ae8c:	4c 89 f6             	mov    rsi,r14
     124ae8f:	e8 ac 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124ae94:	49 8d b5 f0 03 00 00 	lea    rsi,[r13+0x3f0]
     124ae9b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aea0:	e8 c1 2b e4 ff       	call   108da66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e7c>
     124aea5:	48 8d 6b 18          	lea    rbp,[rbx+0x18]

### call 0x124aec7: call   QWORD PTR [rax+0x38]
     124ae9b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aea0:	e8 c1 2b e4 ff       	call   108da66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e7c>
     124aea5:	48 8d 6b 18          	lea    rbp,[rbx+0x18]
     124aea9:	80 7c 24 68 00       	cmp    BYTE PTR [rsp+0x68],0x0
     124aeae:	74 26                	je     124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aeb0:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     124aeb5:	48 85 f6             	test   rsi,rsi
     124aeb8:	74 1c                	je     124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aeba:	80 7c 24 60 00       	cmp    BYTE PTR [rsp+0x60],0x0
     124aebf:	75 15                	jne    124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aec1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     124aec4:	48 89 ef             	mov    rdi,rbp
     124aec7:	ff 50 38             	call   QWORD PTR [rax+0x38]
     124aeca:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]

### call 0x124aecf: call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aea5:	48 8d 6b 18          	lea    rbp,[rbx+0x18]
     124aea9:	80 7c 24 68 00       	cmp    BYTE PTR [rsp+0x68],0x0
     124aeae:	74 26                	je     124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aeb0:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     124aeb5:	48 85 f6             	test   rsi,rsi
     124aeb8:	74 1c                	je     124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aeba:	80 7c 24 60 00       	cmp    BYTE PTR [rsp+0x60],0x0
     124aebf:	75 15                	jne    124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aec1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     124aec4:	48 89 ef             	mov    rdi,rbp
     124aec7:	ff 50 38             	call   QWORD PTR [rax+0x38]
     124aeca:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aecf:	e8 04 ec e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aed4:	eb 15                	jmp    124aeeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9046f>

### call 0x124aedb: call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aeb0:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     124aeb5:	48 85 f6             	test   rsi,rsi
     124aeb8:	74 1c                	je     124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aeba:	80 7c 24 60 00       	cmp    BYTE PTR [rsp+0x60],0x0
     124aebf:	75 15                	jne    124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aec1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     124aec4:	48 89 ef             	mov    rdi,rbp
     124aec7:	ff 50 38             	call   QWORD PTR [rax+0x38]
     124aeca:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aecf:	e8 04 ec e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aed4:	eb 15                	jmp    124aeeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9046f>
     124aed6:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aedb:	e8 f8 eb e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aee0:	48 89 ef             	mov    rdi,rbp

### call 0x124aee6: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124aeba:	80 7c 24 60 00       	cmp    BYTE PTR [rsp+0x60],0x0
     124aebf:	75 15                	jne    124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aec1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     124aec4:	48 89 ef             	mov    rdi,rbp
     124aec7:	ff 50 38             	call   QWORD PTR [rax+0x38]
     124aeca:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aecf:	e8 04 ec e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aed4:	eb 15                	jmp    124aeeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9046f>
     124aed6:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aedb:	e8 f8 eb e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aee0:	48 89 ef             	mov    rdi,rbp
     124aee3:	4c 89 f6             	mov    rsi,r14
     124aee6:	e8 55 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124aeeb:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp

### call 0x124aefc: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124aeca:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aecf:	e8 04 ec e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aed4:	eb 15                	jmp    124aeeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9046f>
     124aed6:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aedb:	e8 f8 eb e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aee0:	48 89 ef             	mov    rdi,rbp
     124aee3:	4c 89 f6             	mov    rsi,r14
     124aee6:	e8 55 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124aeeb:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
     124aef0:	4c 8d 73 30          	lea    r14,[rbx+0x30]
     124aef4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     124aef9:	4c 89 f7             	mov    rdi,r14
     124aefc:	e8 3f 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124af01:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14

### call 0x124af16: call   124b285 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90809>
     124aee3:	4c 89 f6             	mov    rsi,r14
     124aee6:	e8 55 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124aeeb:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
     124aef0:	4c 8d 73 30          	lea    r14,[rbx+0x30]
     124aef4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     124aef9:	4c 89 f7             	mov    rdi,r14
     124aefc:	e8 3f 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124af01:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
     124af06:	48 8d 6b 48          	lea    rbp,[rbx+0x48]
     124af0a:	49 8d 75 60          	lea    rsi,[r13+0x60]
     124af0e:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
     124af13:	48 89 ef             	mov    rdi,rbp
     124af16:	e8 6a 03 00 00       	call   124b285 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90809>
     124af1b:	4c 8d 73 60          	lea    r14,[rbx+0x60]

### call 0x124af2e: call   124b285 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90809>
     124aefc:	e8 3f 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124af01:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
     124af06:	48 8d 6b 48          	lea    rbp,[rbx+0x48]
     124af0a:	49 8d 75 60          	lea    rsi,[r13+0x60]
     124af0e:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
     124af13:	48 89 ef             	mov    rdi,rbp
     124af16:	e8 6a 03 00 00       	call   124b285 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90809>
     124af1b:	4c 8d 73 60          	lea    r14,[rbx+0x60]
     124af1f:	49 83 c5 78          	add    r13,0x78
     124af23:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
     124af28:	4c 89 f7             	mov    rdi,r14
     124af2b:	4c 89 ee             	mov    rsi,r13
     124af2e:	e8 52 03 00 00       	call   124b285 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90809>
     124af33:	4d 85 ff             	test   r15,r15

### call 0x124af9e: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124af62:	00 
     124af63:	66 89 43 7c          	mov    WORD PTR [rbx+0x7c],ax
     124af67:	41 80 bf c3 02 00 00 	cmp    BYTE PTR [r15+0x2c3],0x1
     124af6e:	01 
     124af6f:	0f 94 43 7e          	sete   BYTE PTR [rbx+0x7e]
     124af73:	41 8b 87 a0 02 00 00 	mov    eax,DWORD PTR [r15+0x2a0]
     124af7a:	89 83 80 00 00 00    	mov    DWORD PTR [rbx+0x80],eax
     124af80:	41 8a 87 c4 02 00 00 	mov    al,BYTE PTR [r15+0x2c4]
     124af87:	88 83 84 00 00 00    	mov    BYTE PTR [rbx+0x84],al
     124af8d:	4c 8d ab 88 00 00 00 	lea    r13,[rbx+0x88]
     124af94:	49 8d b7 48 02 00 00 	lea    rsi,[r15+0x248]
     124af9b:	4c 89 ef             	mov    rdi,r13
     124af9e:	e8 9d 2f 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124afa3:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]

### call 0x124afb1: call   108d09e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2544b4>
     124af6f:	0f 94 43 7e          	sete   BYTE PTR [rbx+0x7e]
     124af73:	41 8b 87 a0 02 00 00 	mov    eax,DWORD PTR [r15+0x2a0]
     124af7a:	89 83 80 00 00 00    	mov    DWORD PTR [rbx+0x80],eax
     124af80:	41 8a 87 c4 02 00 00 	mov    al,BYTE PTR [r15+0x2c4]
     124af87:	88 83 84 00 00 00    	mov    BYTE PTR [rbx+0x84],al
     124af8d:	4c 8d ab 88 00 00 00 	lea    r13,[rbx+0x88]
     124af94:	49 8d b7 48 02 00 00 	lea    rsi,[r15+0x248]
     124af9b:	4c 89 ef             	mov    rdi,r13
     124af9e:	e8 9d 2f 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124afa3:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
     124afaa:	49 83 c7 30          	add    r15,0x30
     124afae:	4c 89 fe             	mov    rsi,r15
     124afb1:	e8 e8 20 e4 ff       	call   108d09e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2544b4>
     124afb6:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]

### call 0x124afbb: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124af7a:	89 83 80 00 00 00    	mov    DWORD PTR [rbx+0x80],eax
     124af80:	41 8a 87 c4 02 00 00 	mov    al,BYTE PTR [r15+0x2c4]
     124af87:	88 83 84 00 00 00    	mov    BYTE PTR [rbx+0x84],al
     124af8d:	4c 8d ab 88 00 00 00 	lea    r13,[rbx+0x88]
     124af94:	49 8d b7 48 02 00 00 	lea    rsi,[r15+0x248]
     124af9b:	4c 89 ef             	mov    rdi,r13
     124af9e:	e8 9d 2f 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124afa3:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
     124afaa:	49 83 c7 30          	add    r15,0x30
     124afae:	4c 89 fe             	mov    rsi,r15
     124afb1:	e8 e8 20 e4 ff       	call   108d09e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2544b4>
     124afb6:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     124afbb:	e8 d0 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124afc0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### call 0x124b00b: call   17eeb90 <memset@plt>
     124afdf:	41 5f                	pop    r15
     124afe1:	5d                   	pop    rbp
     124afe2:	c3                   	ret
     124afe3:	66 83 63 7c 00       	and    WORD PTR [rbx+0x7c],0x0
     124afe8:	31 c0                	xor    eax,eax
     124afea:	88 43 7e             	mov    BYTE PTR [rbx+0x7e],al
     124afed:	83 a3 80 00 00 00 00 	and    DWORD PTR [rbx+0x80],0x0
     124aff4:	88 83 84 00 00 00    	mov    BYTE PTR [rbx+0x84],al
     124affa:	48 81 c3 88 00 00 00 	add    rbx,0x88
     124b001:	ba d8 00 00 00       	mov    edx,0xd8
     124b006:	48 89 df             	mov    rdi,rbx
     124b009:	31 f6                	xor    esi,esi
     124b00b:	e8 80 3b 5a 00       	call   17eeb90 <memset@plt>
     124b010:	eb a4                	jmp    124afb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9053a>

### call 0x124b01a: call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124afe8:	31 c0                	xor    eax,eax
     124afea:	88 43 7e             	mov    BYTE PTR [rbx+0x7e],al
     124afed:	83 a3 80 00 00 00 00 	and    DWORD PTR [rbx+0x80],0x0
     124aff4:	88 83 84 00 00 00    	mov    BYTE PTR [rbx+0x84],al
     124affa:	48 81 c3 88 00 00 00 	add    rbx,0x88
     124b001:	ba d8 00 00 00       	mov    edx,0xd8
     124b006:	48 89 df             	mov    rdi,rbx
     124b009:	31 f6                	xor    esi,esi
     124b00b:	e8 80 3b 5a 00       	call   17eeb90 <memset@plt>
     124b010:	eb a4                	jmp    124afb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9053a>
     124b012:	49 89 c7             	mov    r15,rax
     124b015:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124b01a:	e8 b9 ea e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124b01f:	eb 4d                	jmp    124b06e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905f2>

### call 0x124b027: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124affa:	48 81 c3 88 00 00 00 	add    rbx,0x88
     124b001:	ba d8 00 00 00       	mov    edx,0xd8
     124b006:	48 89 df             	mov    rdi,rbx
     124b009:	31 f6                	xor    esi,esi
     124b00b:	e8 80 3b 5a 00       	call   17eeb90 <memset@plt>
     124b010:	eb a4                	jmp    124afb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9053a>
     124b012:	49 89 c7             	mov    r15,rax
     124b015:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124b01a:	e8 b9 ea e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124b01f:	eb 4d                	jmp    124b06e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905f2>
     124b021:	49 89 c7             	mov    r15,rax
     124b024:	4c 89 ef             	mov    rdi,r13
     124b027:	e8 64 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b02c:	eb 03                	jmp    124b031 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905b5>

### call 0x124b034: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b00b:	e8 80 3b 5a 00       	call   17eeb90 <memset@plt>
     124b010:	eb a4                	jmp    124afb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9053a>
     124b012:	49 89 c7             	mov    r15,rax
     124b015:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124b01a:	e8 b9 ea e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124b01f:	eb 4d                	jmp    124b06e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905f2>
     124b021:	49 89 c7             	mov    r15,rax
     124b024:	4c 89 ef             	mov    rdi,r13
     124b027:	e8 64 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b02c:	eb 03                	jmp    124b031 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905b5>
     124b02e:	49 89 c7             	mov    r15,rax
     124b031:	4c 89 f7             	mov    rdi,r14
     124b034:	e8 57 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b039:	eb 03                	jmp    124b03e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905c2>

### call 0x124b041: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b01a:	e8 b9 ea e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124b01f:	eb 4d                	jmp    124b06e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905f2>
     124b021:	49 89 c7             	mov    r15,rax
     124b024:	4c 89 ef             	mov    rdi,r13
     124b027:	e8 64 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b02c:	eb 03                	jmp    124b031 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905b5>
     124b02e:	49 89 c7             	mov    r15,rax
     124b031:	4c 89 f7             	mov    rdi,r14
     124b034:	e8 57 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b039:	eb 03                	jmp    124b03e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905c2>
     124b03b:	49 89 c7             	mov    r15,rax
     124b03e:	48 89 ef             	mov    rdi,rbp
     124b041:	e8 4a 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b046:	eb 03                	jmp    124b04b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905cf>

### call 0x124b050: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b027:	e8 64 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b02c:	eb 03                	jmp    124b031 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905b5>
     124b02e:	49 89 c7             	mov    r15,rax
     124b031:	4c 89 f7             	mov    rdi,r14
     124b034:	e8 57 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b039:	eb 03                	jmp    124b03e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905c2>
     124b03b:	49 89 c7             	mov    r15,rax
     124b03e:	48 89 ef             	mov    rdi,rbp
     124b041:	e8 4a 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b046:	eb 03                	jmp    124b04b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905cf>
     124b048:	49 89 c7             	mov    r15,rax
     124b04b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     124b050:	e8 3b 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b055:	eb 03                	jmp    124b05a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905de>

### call 0x124b05f: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b034:	e8 57 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b039:	eb 03                	jmp    124b03e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905c2>
     124b03b:	49 89 c7             	mov    r15,rax
     124b03e:	48 89 ef             	mov    rdi,rbp
     124b041:	e8 4a 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b046:	eb 03                	jmp    124b04b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905cf>
     124b048:	49 89 c7             	mov    r15,rax
     124b04b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     124b050:	e8 3b 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b055:	eb 03                	jmp    124b05a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905de>
     124b057:	49 89 c7             	mov    r15,rax
     124b05a:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     124b05f:	e8 2c 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b064:	eb 08                	jmp    124b06e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905f2>

### call 0x124b071: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b048:	49 89 c7             	mov    r15,rax
     124b04b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     124b050:	e8 3b 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b055:	eb 03                	jmp    124b05a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905de>
     124b057:	49 89 c7             	mov    r15,rax
     124b05a:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     124b05f:	e8 2c 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b064:	eb 08                	jmp    124b06e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905f2>
     124b066:	49 89 c7             	mov    r15,rax
     124b069:	eb 0b                	jmp    124b076 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905fa>
     124b06b:	49 89 c7             	mov    r15,rax
     124b06e:	48 89 df             	mov    rdi,rbx
     124b071:	e8 1a 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b076:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]

### call 0x124b07b: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b050:	e8 3b 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b055:	eb 03                	jmp    124b05a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905de>
     124b057:	49 89 c7             	mov    r15,rax
     124b05a:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     124b05f:	e8 2c 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b064:	eb 08                	jmp    124b06e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905f2>
     124b066:	49 89 c7             	mov    r15,rax
     124b069:	eb 0b                	jmp    124b076 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905fa>
     124b06b:	49 89 c7             	mov    r15,rax
     124b06e:	48 89 df             	mov    rdi,rbx
     124b071:	e8 1a 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b076:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     124b07b:	e8 10 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b080:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### call 0x124b093: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     124b066:	49 89 c7             	mov    r15,rax
     124b069:	eb 0b                	jmp    124b076 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905fa>
     124b06b:	49 89 c7             	mov    r15,rax
     124b06e:	48 89 df             	mov    rdi,rbx
     124b071:	e8 1a 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b076:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     124b07b:	e8 10 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b080:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124b087:	00 00 
     124b089:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
     124b08e:	75 08                	jne    124b098 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9061c>
     124b090:	4c 89 ff             	mov    rdi,r15
     124b093:	e8 38 4c 82 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     124b098:	e8 13 4a 5a 00       	call   17efab0 <__stack_chk_fail@plt>

### call 0x124b098: call   17efab0 <__stack_chk_fail@plt>
     124b069:	eb 0b                	jmp    124b076 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x905fa>
     124b06b:	49 89 c7             	mov    r15,rax
     124b06e:	48 89 df             	mov    rdi,rbx
     124b071:	e8 1a 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b076:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     124b07b:	e8 10 2e 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124b080:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124b087:	00 00 
     124b089:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
     124b08e:	75 08                	jne    124b098 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9061c>
     124b090:	4c 89 ff             	mov    rdi,r15
     124b093:	e8 38 4c 82 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     124b098:	e8 13 4a 5a 00       	call   17efab0 <__stack_chk_fail@plt>

## All writes to offset 0 / first qword in builder family
