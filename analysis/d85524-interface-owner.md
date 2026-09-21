# d85524 interface owner / caller provenance

Known: incoming rsi of d85524 becomes carrier[0], whose vtable+0x1d8 is called by d8a5c2.

## Direct code refs/calls/jumps to d85524
1058399-  d88c5c:	e8 01 f8 ff ff       	call   d88462 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x554e8>
1058400-  d88c61:	48 89 d8             	mov    rax,rbx
1058401-  d88c64:	5b                   	pop    rbx
1058402-  d88c65:	c3                   	ret
1058403-  d88c66:	48 8b bf 98 03 00 00 	mov    rdi,QWORD PTR [rdi+0x398]
1058404-  d88c6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
1058405-  d88c70:	ff 60 28             	jmp    QWORD PTR [rax+0x28]
1058406-  d88c73:	cc                   	int3
1058407-  d88c74:	48 8b 47 68          	mov    rax,QWORD PTR [rdi+0x68]
1058408-  d88c78:	c3                   	ret
1058409-  d88c79:	cc                   	int3
1058410-  d88c7a:	48 83 c7 d8          	add    rdi,0xffffffffffffffd8
1058411-  d88c7e:	e9 f5 f9 ff ff       	jmp    d88678 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x556fe>
1058412-  d88c83:	cc                   	int3
1058413-  d88c84:	48 8b 87 e0 00 00 00 	mov    rax,QWORD PTR [rdi+0xe0]
1058414-  d88c8b:	c3                   	ret
1058415-  d88c8c:	8a 87 ed 01 00 00    	mov    al,BYTE PTR [rdi+0x1ed]
1058416-  d88c92:	c3                   	ret
1058417-  d88c93:	cc                   	int3
1058418-  d88c94:	53                   	push   rbx
1058419-  d88c95:	48 89 fb             	mov    rbx,rdi
1058420-  d88c98:	48 8b b6 f8 03 00 00 	mov    rsi,QWORD PTR [rsi+0x3f8]
1058421-  d88c9f:	e8 36 00 00 00       	call   d88cda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d60>
1058422-  d88ca4:	48 89 d8             	mov    rax,rbx
1058423-  d88ca7:	5b                   	pop    rbx
1058424-  d88ca8:	c3                   	ret
1058425-  d88ca9:	cc                   	int3
1058426-  d88caa:	53                   	push   rbx
1058427-  d88cab:	48 89 fb             	mov    rbx,rdi
1058428-  d88cae:	48 83 c6 d8          	add    rsi,0xffffffffffffffd8
1058429:  d88cb2:	e8 6d c8 ff ff       	call   d85524 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x525aa>
1058430-  d88cb7:	48 89 d8             	mov    rax,rbx
1058431-  d88cba:	5b                   	pop    rbx
1058432-  d88cbb:	c3                   	ret
1058433-  d88cbc:	48 83 c7 d0          	add    rdi,0xffffffffffffffd0
1058434-  d88cc0:	e9 79 56 ff ff       	jmp    d7e33e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b3c4>
1058435-  d88cc5:	cc                   	int3
1058436-  d88cc6:	48 83 c7 d0          	add    rdi,0xffffffffffffffd0
1058437-  d88cca:	e9 af 5e ff ff       	jmp    d7eb7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bc04>
1058438-  d88ccf:	cc                   	int3
1058439-  d88cd0:	48 83 c7 d0          	add    rdi,0xffffffffffffffd0
1058440-  d88cd4:	e9 cd fc ff ff       	jmp    d889a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55a2c>
1058441-  d88cd9:	cc                   	int3
1058442-  d88cda:	48 83 ec 18          	sub    rsp,0x18
1058443-  d88cde:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1058444-  d88ce5:	00 00 
1058445-  d88ce7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
1058446-  d88cec:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
1058447-  d88cf1:	48 85 f6             	test   rsi,rsi
1058448-  d88cf4:	74 20                	je     d88d16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d9c>
1058449-  d88cf6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
1058450-  d88cf9:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
1058451-  d88cfe:	ff 50 30             	call   QWORD PTR [rax+0x30]
1058452-  d88d01:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1058453-  d88d08:	00 00 
1058454-  d88d0a:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
1058455-  d88d0f:	75 1a                	jne    d88d2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55db1>
1058456-  d88d11:	48 83 c4 18          	add    rsp,0x18
1058457-  d88d15:	c3                   	ret
1058458-  d88d16:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1058459-  d88d1d:	00 00 
1058460-  d88d1f:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
1058461-  d88d24:	75 05                	jne    d88d2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55db1>
1058462-  d88d26:	e8 48 17 cf ff       	call   a7a473 <JNI_OnUnload@@Base+0x1d40>
1058463-  d88d2b:	e8 80 6d a6 00       	call   17efab0 <__stack_chk_fail@plt>
1058464-  d88d30:	41 57                	push   r15
1058465-  d88d32:	41 56                	push   r14
1058466-  d88d34:	53                   	push   rbx
1058467-  d88d35:	48 83 ec 20          	sub    rsp,0x20
1058468-  d88d39:	49 89 f6             	mov    r14,rsi
1058469-  d88d3c:	48 89 fb             	mov    rbx,rdi
1058470-  d88d3f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1058471-  d88d46:	00 00 
1058472-  d88d48:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1058473-  d88d4d:	83 fa 01             	cmp    edx,0x1
1058474-  d88d50:	75 2c                	jne    d88d7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e04>

## Relocations targeting d85524
0000000001826bd8  0000000000000008 R_X86_64_RELATIVE                         d85524

## Vtable neighborhoods for every relocation target d85524
slots= ['0x1826bd8']
### relocation slot 0x1826bd8
- candidate AP 0x1826b78; target offset +0x60; codeSlots=32
  +0x0: 0xd83540
  +0x8: 0xd83da6
  +0x10: 0xd84c9c
  +0x18: 0xd84e18
  +0x20: 0xd8507a
  +0x28: 0xd85114
  +0x30: 0xd851bc
  +0x38: 0xa4b870
  +0x40: 0xd85336
  +0x48: 0xd853b2
  +0x50: 0xd8545e
  +0x58: 0xd854ba
  +0x60: 0xd85524
  +0x68: 0xd85886
  +0x70: 0xd858f2
  +0x78: 0xd85900
  +0x80: 0xd85a40
  +0x88: 0xd85dea
  +0x90: 0xd85e6a
  +0x98: 0xd85ea6
  +0xa0: 0xd85f88
  +0xa8: 0xd85f90
  +0xb0: 0xd8617e
  +0xb8: 0xd8618a
  +0xc0: 0xd86192
  +0xc8: 0xd861ce
  +0xd0: 0xd861d8
  +0xd8: 0xd86436
  +0xe0: 0xd8680a
  +0xe8: 0xd86810
  +0xf0: 0xd8681e
  +0xf8: 0xd86826
- candidate AP 0x1826b80; target offset +0x58; codeSlots=32
  +0x0: 0xd83da6
  +0x8: 0xd84c9c
  +0x10: 0xd84e18
  +0x18: 0xd8507a
  +0x20: 0xd85114
  +0x28: 0xd851bc
  +0x30: 0xa4b870
  +0x38: 0xd85336
  +0x40: 0xd853b2
  +0x48: 0xd8545e
  +0x50: 0xd854ba
  +0x58: 0xd85524
  +0x60: 0xd85886
  +0x68: 0xd858f2
  +0x70: 0xd85900
  +0x78: 0xd85a40
  +0x80: 0xd85dea
  +0x88: 0xd85e6a
  +0x90: 0xd85ea6
  +0x98: 0xd85f88
  +0xa0: 0xd85f90
  +0xa8: 0xd8617e
  +0xb0: 0xd8618a
  +0xb8: 0xd86192
  +0xc0: 0xd861ce
  +0xc8: 0xd861d8
  +0xd0: 0xd86436
  +0xd8: 0xd8680a
  +0xe0: 0xd86810
  +0xe8: 0xd8681e
  +0xf0: 0xd86826
  +0xf8: 0xd8687e
- candidate AP 0x1826b88; target offset +0x50; codeSlots=32
  +0x0: 0xd84c9c
  +0x8: 0xd84e18
  +0x10: 0xd8507a
  +0x18: 0xd85114
  +0x20: 0xd851bc
  +0x28: 0xa4b870
  +0x30: 0xd85336
  +0x38: 0xd853b2
  +0x40: 0xd8545e
  +0x48: 0xd854ba
  +0x50: 0xd85524
  +0x58: 0xd85886
  +0x60: 0xd858f2
  +0x68: 0xd85900
  +0x70: 0xd85a40
  +0x78: 0xd85dea
  +0x80: 0xd85e6a
  +0x88: 0xd85ea6
  +0x90: 0xd85f88
  +0x98: 0xd85f90
  +0xa0: 0xd8617e
  +0xa8: 0xd8618a
  +0xb0: 0xd86192
  +0xb8: 0xd861ce
  +0xc0: 0xd861d8
  +0xc8: 0xd86436
  +0xd0: 0xd8680a
  +0xd8: 0xd86810
  +0xe0: 0xd8681e
  +0xe8: 0xd86826
  +0xf0: 0xd8687e
  +0xf8: 0xd8689a
- candidate AP 0x1826b90; target offset +0x48; codeSlots=32
  +0x0: 0xd84e18
  +0x8: 0xd8507a
  +0x10: 0xd85114
  +0x18: 0xd851bc
  +0x20: 0xa4b870
  +0x28: 0xd85336
  +0x30: 0xd853b2
  +0x38: 0xd8545e
  +0x40: 0xd854ba
  +0x48: 0xd85524
  +0x50: 0xd85886
  +0x58: 0xd858f2
  +0x60: 0xd85900
  +0x68: 0xd85a40
  +0x70: 0xd85dea
  +0x78: 0xd85e6a
  +0x80: 0xd85ea6
  +0x88: 0xd85f88
  +0x90: 0xd85f90
  +0x98: 0xd8617e
  +0xa0: 0xd8618a
  +0xa8: 0xd86192
  +0xb0: 0xd861ce
  +0xb8: 0xd861d8
  +0xc0: 0xd86436
  +0xc8: 0xd8680a
  +0xd0: 0xd86810
  +0xd8: 0xd8681e
  +0xe0: 0xd86826
  +0xe8: 0xd8687e
  +0xf0: 0xd8689a
  +0xf8: 0xd86dd6
- candidate AP 0x1826b98; target offset +0x40; codeSlots=32
  +0x0: 0xd8507a
  +0x8: 0xd85114
  +0x10: 0xd851bc
  +0x18: 0xa4b870
  +0x20: 0xd85336
  +0x28: 0xd853b2
  +0x30: 0xd8545e
  +0x38: 0xd854ba
  +0x40: 0xd85524
  +0x48: 0xd85886
  +0x50: 0xd858f2
  +0x58: 0xd85900
  +0x60: 0xd85a40
  +0x68: 0xd85dea
  +0x70: 0xd85e6a
  +0x78: 0xd85ea6
  +0x80: 0xd85f88
  +0x88: 0xd85f90
  +0x90: 0xd8617e
  +0x98: 0xd8618a
  +0xa0: 0xd86192
  +0xa8: 0xd861ce
  +0xb0: 0xd861d8
  +0xb8: 0xd86436
  +0xc0: 0xd8680a
  +0xc8: 0xd86810
  +0xd0: 0xd8681e
  +0xd8: 0xd86826
  +0xe0: 0xd8687e
  +0xe8: 0xd8689a
  +0xf0: 0xd86dd6
  +0xf8: 0xd86f6c
- candidate AP 0x1826ba0; target offset +0x38; codeSlots=32
  +0x0: 0xd85114
  +0x8: 0xd851bc
  +0x10: 0xa4b870
  +0x18: 0xd85336
  +0x20: 0xd853b2
  +0x28: 0xd8545e
  +0x30: 0xd854ba
  +0x38: 0xd85524
  +0x40: 0xd85886
  +0x48: 0xd858f2
  +0x50: 0xd85900
  +0x58: 0xd85a40
  +0x60: 0xd85dea
  +0x68: 0xd85e6a
  +0x70: 0xd85ea6
  +0x78: 0xd85f88
  +0x80: 0xd85f90
  +0x88: 0xd8617e
  +0x90: 0xd8618a
  +0x98: 0xd86192
  +0xa0: 0xd861ce
  +0xa8: 0xd861d8
  +0xb0: 0xd86436
  +0xb8: 0xd8680a
  +0xc0: 0xd86810
  +0xc8: 0xd8681e
  +0xd0: 0xd86826
  +0xd8: 0xd8687e
  +0xe0: 0xd8689a
  +0xe8: 0xd86dd6
  +0xf0: 0xd86f6c
  +0xf8: 0xd86fbe
- candidate AP 0x1826ba8; target offset +0x30; codeSlots=32
  +0x0: 0xd851bc
  +0x8: 0xa4b870
  +0x10: 0xd85336
  +0x18: 0xd853b2
  +0x20: 0xd8545e
  +0x28: 0xd854ba
  +0x30: 0xd85524
  +0x38: 0xd85886
  +0x40: 0xd858f2
  +0x48: 0xd85900
  +0x50: 0xd85a40
  +0x58: 0xd85dea
  +0x60: 0xd85e6a
  +0x68: 0xd85ea6
  +0x70: 0xd85f88
  +0x78: 0xd85f90
  +0x80: 0xd8617e
  +0x88: 0xd8618a
  +0x90: 0xd86192
  +0x98: 0xd861ce
  +0xa0: 0xd861d8
  +0xa8: 0xd86436
  +0xb0: 0xd8680a
  +0xb8: 0xd86810
  +0xc0: 0xd8681e
  +0xc8: 0xd86826
  +0xd0: 0xd8687e
  +0xd8: 0xd8689a
  +0xe0: 0xd86dd6
  +0xe8: 0xd86f6c
  +0xf0: 0xd86fbe
  +0xf8: 0xd8710c
- candidate AP 0x1826bb0; target offset +0x28; codeSlots=32
  +0x0: 0xa4b870
  +0x8: 0xd85336
  +0x10: 0xd853b2
  +0x18: 0xd8545e
  +0x20: 0xd854ba
  +0x28: 0xd85524
  +0x30: 0xd85886
  +0x38: 0xd858f2
  +0x40: 0xd85900
  +0x48: 0xd85a40
  +0x50: 0xd85dea
  +0x58: 0xd85e6a
  +0x60: 0xd85ea6
  +0x68: 0xd85f88
  +0x70: 0xd85f90
  +0x78: 0xd8617e
  +0x80: 0xd8618a
  +0x88: 0xd86192
  +0x90: 0xd861ce
  +0x98: 0xd861d8
  +0xa0: 0xd86436
  +0xa8: 0xd8680a
  +0xb0: 0xd86810
  +0xb8: 0xd8681e
  +0xc0: 0xd86826
  +0xc8: 0xd8687e
  +0xd0: 0xd8689a
  +0xd8: 0xd86dd6
  +0xe0: 0xd86f6c
  +0xe8: 0xd86fbe
  +0xf0: 0xd8710c
  +0xf8: 0xd87206
- candidate AP 0x1826bb8; target offset +0x20; codeSlots=32
  +0x0: 0xd85336
  +0x8: 0xd853b2
  +0x10: 0xd8545e
  +0x18: 0xd854ba
  +0x20: 0xd85524
  +0x28: 0xd85886
  +0x30: 0xd858f2
  +0x38: 0xd85900
  +0x40: 0xd85a40
  +0x48: 0xd85dea
  +0x50: 0xd85e6a
  +0x58: 0xd85ea6
  +0x60: 0xd85f88
  +0x68: 0xd85f90
  +0x70: 0xd8617e
  +0x78: 0xd8618a
  +0x80: 0xd86192
  +0x88: 0xd861ce
  +0x90: 0xd861d8
  +0x98: 0xd86436
  +0xa0: 0xd8680a
  +0xa8: 0xd86810
  +0xb0: 0xd8681e
  +0xb8: 0xd86826
  +0xc0: 0xd8687e
  +0xc8: 0xd8689a
  +0xd0: 0xd86dd6
  +0xd8: 0xd86f6c
  +0xe0: 0xd86fbe
  +0xe8: 0xd8710c
  +0xf0: 0xd87206
  +0xf8: 0xd872b0
- candidate AP 0x1826bc0; target offset +0x18; codeSlots=32
  +0x0: 0xd853b2
  +0x8: 0xd8545e
  +0x10: 0xd854ba
  +0x18: 0xd85524
  +0x20: 0xd85886
  +0x28: 0xd858f2
  +0x30: 0xd85900
  +0x38: 0xd85a40
  +0x40: 0xd85dea
  +0x48: 0xd85e6a
  +0x50: 0xd85ea6
  +0x58: 0xd85f88
  +0x60: 0xd85f90
  +0x68: 0xd8617e
  +0x70: 0xd8618a
  +0x78: 0xd86192
  +0x80: 0xd861ce
  +0x88: 0xd861d8
  +0x90: 0xd86436
  +0x98: 0xd8680a
  +0xa0: 0xd86810
  +0xa8: 0xd8681e
  +0xb0: 0xd86826
  +0xb8: 0xd8687e
  +0xc0: 0xd8689a
  +0xc8: 0xd86dd6
  +0xd0: 0xd86f6c
  +0xd8: 0xd86fbe
  +0xe0: 0xd8710c
  +0xe8: 0xd87206
  +0xf0: 0xd872b0
  +0xf8: 0xd872b8
- candidate AP 0x1826bc8; target offset +0x10; codeSlots=32
  +0x0: 0xd8545e
  +0x8: 0xd854ba
  +0x10: 0xd85524
  +0x18: 0xd85886
  +0x20: 0xd858f2
  +0x28: 0xd85900
  +0x30: 0xd85a40
  +0x38: 0xd85dea
  +0x40: 0xd85e6a
  +0x48: 0xd85ea6
  +0x50: 0xd85f88
  +0x58: 0xd85f90
  +0x60: 0xd8617e
  +0x68: 0xd8618a
  +0x70: 0xd86192
  +0x78: 0xd861ce
  +0x80: 0xd861d8
  +0x88: 0xd86436
  +0x90: 0xd8680a
  +0x98: 0xd86810
  +0xa0: 0xd8681e
  +0xa8: 0xd86826
  +0xb0: 0xd8687e
  +0xb8: 0xd8689a
  +0xc0: 0xd86dd6
  +0xc8: 0xd86f6c
  +0xd0: 0xd86fbe
  +0xd8: 0xd8710c
  +0xe0: 0xd87206
  +0xe8: 0xd872b0
  +0xf0: 0xd872b8
  +0xf8: 0xd87590
- candidate AP 0x1826bd0; target offset +0x8; codeSlots=32
  +0x0: 0xd854ba
  +0x8: 0xd85524
  +0x10: 0xd85886
  +0x18: 0xd858f2
  +0x20: 0xd85900
  +0x28: 0xd85a40
  +0x30: 0xd85dea
  +0x38: 0xd85e6a
  +0x40: 0xd85ea6
  +0x48: 0xd85f88
  +0x50: 0xd85f90
  +0x58: 0xd8617e
  +0x60: 0xd8618a
  +0x68: 0xd86192
  +0x70: 0xd861ce
  +0x78: 0xd861d8
  +0x80: 0xd86436
  +0x88: 0xd8680a
  +0x90: 0xd86810
  +0x98: 0xd8681e
  +0xa0: 0xd86826
  +0xa8: 0xd8687e
  +0xb0: 0xd8689a
  +0xb8: 0xd86dd6
  +0xc0: 0xd86f6c
  +0xc8: 0xd86fbe
  +0xd0: 0xd8710c
  +0xd8: 0xd87206
  +0xe0: 0xd872b0
  +0xe8: 0xd872b8
  +0xf0: 0xd87590
  +0xf8: 0xd87d8c
- candidate AP 0x1826bd8; target offset +0x0; codeSlots=32
  +0x0: 0xd85524
  +0x8: 0xd85886
  +0x10: 0xd858f2
  +0x18: 0xd85900
  +0x20: 0xd85a40
  +0x28: 0xd85dea
  +0x30: 0xd85e6a
  +0x38: 0xd85ea6
  +0x40: 0xd85f88
  +0x48: 0xd85f90
  +0x50: 0xd8617e
  +0x58: 0xd8618a
  +0x60: 0xd86192
  +0x68: 0xd861ce
  +0x70: 0xd861d8
  +0x78: 0xd86436
  +0x80: 0xd8680a
  +0x88: 0xd86810
  +0x90: 0xd8681e
  +0x98: 0xd86826
  +0xa0: 0xd8687e
  +0xa8: 0xd8689a
  +0xb0: 0xd86dd6
  +0xb8: 0xd86f6c
  +0xc0: 0xd86fbe
  +0xc8: 0xd8710c
  +0xd0: 0xd87206
  +0xd8: 0xd872b0
  +0xe0: 0xd872b8
  +0xe8: 0xd87590
  +0xf0: 0xd87d8c
  +0xf8: 0xd87d94
- candidate AP 0x1826be0; target offset +0x-8; codeSlots=32
  +0x0: 0xd85886
  +0x8: 0xd858f2
  +0x10: 0xd85900
  +0x18: 0xd85a40
  +0x20: 0xd85dea
  +0x28: 0xd85e6a
  +0x30: 0xd85ea6
  +0x38: 0xd85f88
  +0x40: 0xd85f90
  +0x48: 0xd8617e
  +0x50: 0xd8618a
  +0x58: 0xd86192
  +0x60: 0xd861ce
  +0x68: 0xd861d8
  +0x70: 0xd86436
  +0x78: 0xd8680a
  +0x80: 0xd86810
  +0x88: 0xd8681e
  +0x90: 0xd86826
  +0x98: 0xd8687e
  +0xa0: 0xd8689a
  +0xa8: 0xd86dd6
  +0xb0: 0xd86f6c
  +0xb8: 0xd86fbe
  +0xc0: 0xd8710c
  +0xc8: 0xd87206
  +0xd0: 0xd872b0
  +0xd8: 0xd872b8
  +0xe0: 0xd87590
  +0xe8: 0xd87d8c
  +0xf0: 0xd87d94
  +0xf8: 0xd87dea
- candidate AP 0x1826be8; target offset +0x-10; codeSlots=32
  +0x0: 0xd858f2
  +0x8: 0xd85900
  +0x10: 0xd85a40
  +0x18: 0xd85dea
  +0x20: 0xd85e6a
  +0x28: 0xd85ea6
  +0x30: 0xd85f88
  +0x38: 0xd85f90
  +0x40: 0xd8617e
  +0x48: 0xd8618a
  +0x50: 0xd86192
  +0x58: 0xd861ce
  +0x60: 0xd861d8
  +0x68: 0xd86436
  +0x70: 0xd8680a
  +0x78: 0xd86810
  +0x80: 0xd8681e
  +0x88: 0xd86826
  +0x90: 0xd8687e
  +0x98: 0xd8689a
  +0xa0: 0xd86dd6
  +0xa8: 0xd86f6c
  +0xb0: 0xd86fbe
  +0xb8: 0xd8710c
  +0xc0: 0xd87206
  +0xc8: 0xd872b0
  +0xd0: 0xd872b8
  +0xd8: 0xd87590
  +0xe0: 0xd87d8c
  +0xe8: 0xd87d94
  +0xf0: 0xd87dea
  +0xf8: 0xd87fb8


## All high-address AP materializations near candidate relocation slots
slot=0000000001826bd8 range=1826b58..1826c58

## Full d85524 body

/tmp/d855/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000d85524 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x525aa>:
  d85524:	55                   	push   rbp
  d85525:	41 57                	push   r15
  d85527:	41 56                	push   r14
  d85529:	41 55                	push   r13
  d8552b:	41 54                	push   r12
  d8552d:	53                   	push   rbx
  d8552e:	48 81 ec e8 01 00 00 	sub    rsp,0x1e8
  d85535:	4d 89 c6             	mov    r14,r8
  d85538:	48 89 fb             	mov    rbx,rdi
  d8553b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d85542:	00 00 
  d85544:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
  d8554b:	00 
  d8554c:	80 be 10 02 00 00 00 	cmp    BYTE PTR [rsi+0x210],0x0
  d85553:	0f 84 32 01 00 00    	je     d8568b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52711>
  d85559:	89 cd                	mov    ebp,ecx
  d8555b:	49 89 d7             	mov    r15,rdx
  d8555e:	49 89 f4             	mov    r12,rsi
  d85561:	48 89 5c 24 20       	mov    QWORD PTR [rsp+0x20],rbx
  d85566:	44 0f b6 ed          	movzx  r13d,bpl
  d8556a:	48 8d bc 24 cc 01 00 	lea    rdi,[rsp+0x1cc]
  d85571:	00 
  d85572:	48 89 d6             	mov    rsi,rdx
  d85575:	44 89 ea             	mov    edx,r13d
  d85578:	e8 b3 37 00 00       	call   d88d30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55db6>
  d8557d:	48 8d 9c 24 68 01 00 	lea    rbx,[rsp+0x168]
  d85584:	00 
  d85585:	4c 89 63 f8          	mov    QWORD PTR [rbx-0x8],r12
  d85589:	48 89 df             	mov    rdi,rbx
  d8558c:	4c 89 fe             	mov    rsi,r15
  d8558f:	e8 ac 89 a6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  d85594:	44 88 6b 18          	mov    BYTE PTR [rbx+0x18],r13b
  d85598:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
  d8559f:	00 
  d855a0:	4c 89 f6             	mov    rsi,r14
  d855a3:	e8 e8 4c cf ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  d855a8:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  d855af:	00 
  d855b0:	4c 89 f6             	mov    rsi,r14
  d855b3:	e8 d8 4c cf ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  d855b8:	40 84 ed             	test   bpl,bpl
  d855bb:	0f 84 f7 00 00 00    	je     d856b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5273e>
  d855c1:	41 83 fd 01          	cmp    r13d,0x1
  d855c5:	0f 85 ae 01 00 00    	jne    d85779 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x527ff>
  d855cb:	4d 8b b4 24 58 02 00 	mov    r14,QWORD PTR [r12+0x258]
  d855d2:	00 
  d855d3:	8b 84 24 dc 01 00 00 	mov    eax,DWORD PTR [rsp+0x1dc]
  d855da:	89 84 24 90 00 00 00 	mov    DWORD PTR [rsp+0x90],eax
  d855e1:	0f 10 84 24 cc 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1cc]
  d855e8:	00 
  d855e9:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
  d855f0:	00 
  d855f1:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0
  d855f8:	00 00 
  d855fa:	83 a4 24 a0 00 00 00 	and    DWORD PTR [rsp+0xa0],0x0
  d85601:	00 
  d85602:	31 c0                	xor    eax,eax
  d85604:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
  d85608:	88 44 24 78          	mov    BYTE PTR [rsp+0x78],al
  d8560c:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  d85611:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  d85618:	00 
  d85619:	e8 6a 4e 00 00       	call   d8a488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5750e>
  d8561e:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  d85623:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  d85628:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
  d8562f:	00 
  d85630:	e8 df 4e 00 00       	call   d8a514 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5759a>
  d85635:	49 8b 06             	mov    rax,QWORD PTR [r14]
  d85638:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
  d8563c:	8a 4c 24 78          	mov    cl,BYTE PTR [rsp+0x78]
  d85640:	88 4c 24 10          	mov    BYTE PTR [rsp+0x10],cl
  d85644:	0f 10 44 24 68       	movups xmm0,XMMWORD PTR [rsp+0x68]
  d85649:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  d8564d:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
  d85654:	00 
  d85655:	6a 01                	push   0x1
  d85657:	59                   	pop    rcx
  d85658:	4c 8d 44 24 48       	lea    r8,[rsp+0x48]
  d8565d:	4c 8d 4c 24 28       	lea    r9,[rsp+0x28]
  d85662:	48 89 df             	mov    rdi,rbx
  d85665:	4c 89 f6             	mov    rsi,r14
  d85668:	ff d0                	call   rax
  d8566a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  d8566f:	e8 ac e2 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
  d85674:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  d85679:	e8 76 e3 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
  d8567e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  d85685:	00 
  d85686:	e9 e7 00 00 00       	jmp    d85772 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x527f8>
  d8568b:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  d8568f:	31 f6                	xor    esi,esi
  d85691:	e8 ca 32 e0 ff       	call   b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
  d85696:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d8569d:	00 00 
  d8569f:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
  d856a6:	00 
  d856a7:	0f 85 d3 01 00 00    	jne    d85880 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52906>
  d856ad:	0f 57 c0             	xorps  xmm0,xmm0
  d856b0:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  d856b3:	e9 08 01 00 00       	jmp    d857c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52846>
  d856b8:	4d 8b b4 24 58 02 00 	mov    r14,QWORD PTR [r12+0x258]
  d856bf:	00 
  d856c0:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
  d856c7:	00 
  d856c8:	4c 89 fe             	mov    rsi,r15
  d856cb:	e8 00 ca ed ff       	call   c620d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1af070>
  d856d0:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  d856d5:	31 c0                	xor    eax,eax
  d856d7:	88 84 24 f0 00 00 00 	mov    BYTE PTR [rsp+0xf0],al
  d856de:	88 84 24 00 01 00 00 	mov    BYTE PTR [rsp+0x100],al
  d856e5:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  d856ec:	00 
  d856ed:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  d856f4:	00 
  d856f5:	e8 8e 4d 00 00       	call   d8a488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5750e>
  d856fa:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  d85701:	00 
  d85702:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
  d85709:	00 
  d8570a:	e8 05 4e 00 00       	call   d8a514 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5759a>
  d8570f:	49 8b 06             	mov    rax,QWORD PTR [r14]
  d85712:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
  d85716:	8a 8c 24 00 01 00 00 	mov    cl,BYTE PTR [rsp+0x100]
  d8571d:	88 4c 24 10          	mov    BYTE PTR [rsp+0x10],cl
  d85721:	0f 10 84 24 f0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xf0]
  d85728:	00 
  d85729:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  d8572d:	48 8d 94 24 08 01 00 	lea    rdx,[rsp+0x108]
  d85734:	00 
  d85735:	6a 01                	push   0x1
  d85737:	59                   	pop    rcx
  d85738:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
  d8573f:	00 
  d85740:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
  d85747:	00 
  d85748:	48 89 df             	mov    rdi,rbx
  d8574b:	4c 89 f6             	mov    rsi,r14
  d8574e:	ff d0                	call   rax
  d85750:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  d85757:	00 
  d85758:	e8 c3 e1 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
  d8575d:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  d85764:	00 
  d85765:	e8 8a e2 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
  d8576a:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
  d85771:	00 
  d85772:	e8 39 ce ed ff       	call   c625b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1af550>
  d85777:	eb 16                	jmp    d8578f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52815>
  d85779:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  d8577d:	31 f6                	xor    esi,esi
  d8577f:	e8 dc 31 e0 ff       	call   b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
  d85784:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
  d85789:	0f 57 c0             	xorps  xmm0,xmm0
  d8578c:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  d8578f:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  d85796:	00 
  d85797:	e8 ce 47 cf ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d8579c:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d857a3:	00 
  d857a4:	e8 c7 4d 00 00       	call   d8a570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x575f6>
  d857a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d857b0:	00 00 
  d857b2:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
  d857b9:	00 
  d857ba:	0f 85 c0 00 00 00    	jne    d85880 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52906>
  d857c0:	48 89 d8             	mov    rax,rbx
  d857c3:	48 81 c4 e8 01 00 00 	add    rsp,0x1e8
  d857ca:	5b                   	pop    rbx
  d857cb:	41 5c                	pop    r12
  d857cd:	41 5d                	pop    r13
  d857cf:	41 5e                	pop    r14
  d857d1:	41 5f                	pop    r15
  d857d3:	5d                   	pop    rbp
  d857d4:	c3                   	ret
  d857d5:	49 89 c6             	mov    r14,rax
  d857d8:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  d857df:	00 
  d857e0:	e8 3b e1 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
  d857e5:	eb 03                	jmp    d857ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52870>
  d857e7:	49 89 c6             	mov    r14,rax
  d857ea:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  d857f1:	00 
  d857f2:	e8 fd e1 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
  d857f7:	eb 12                	jmp    d8580b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52891>
  d857f9:	49 89 c6             	mov    r14,rax
  d857fc:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  d85801:	e8 1a e1 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
  d85806:	eb 10                	jmp    d85818 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5289e>
  d85808:	49 89 c6             	mov    r14,rax
  d8580b:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
  d85812:	00 
  d85813:	eb 1a                	jmp    d8582f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x528b5>
  d85815:	49 89 c6             	mov    r14,rax
  d85818:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  d8581d:	e8 d2 e1 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
  d85822:	eb 03                	jmp    d85827 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x528ad>
  d85824:	49 89 c6             	mov    r14,rax
  d85827:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  d8582e:	00 
  d8582f:	e8 7c cd ed ff       	call   c625b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1af550>
  d85834:	eb 03                	jmp    d85839 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x528bf>
  d85836:	49 89 c6             	mov    r14,rax
  d85839:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  d85840:	00 
  d85841:	e8 24 47 cf ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d85846:	eb 03                	jmp    d8584b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x528d1>
  d85848:	49 89 c6             	mov    r14,rax
  d8584b:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d85852:	00 
  d85853:	e8 18 4d 00 00       	call   d8a570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x575f6>
  d85858:	eb 0b                	jmp    d85865 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x528eb>
  d8585a:	49 89 c6             	mov    r14,rax
  d8585d:	48 89 df             	mov    rdi,rbx
  d85860:	e8 2b 86 a6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d85865:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d8586c:	00 00 
  d8586e:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
  d85875:	00 
  d85876:	75 08                	jne    d85880 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52906>
  d85878:	4c 89 f7             	mov    rdi,r14
  d8587b:	e8 50 a4 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  d85880:	e8 2b a2 a6 00       	call   17efab0 <__stack_chk_fail@plt>
