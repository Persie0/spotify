# Service184 tail factory 0x17dbc9a

Caller 0x15da3b7 tail-jumps here with rdi=24-byte output, rsi=0x32f434, rdx/rcx=unwrapped strings, eax=0.
- constant 0x32f434 cstring: "List could not be created from '%s': %s"
- nearby 0x32f3b4: 'cade::setQueue/user_queue_truncated] dropping tail queue items: next_items=%zu queue_items_in_next=%zu max_user_queue_items=%zu'
- nearby 0x32f3c4: 'ser_queue_truncated] dropping tail queue items: next_items=%zu queue_items_in_next=%zu max_user_queue_items=%zu'
- nearby 0x32f3d4: 'ted] dropping tail queue items: next_items=%zu queue_items_in_next=%zu max_user_queue_items=%zu'
- nearby 0x32f3e4: 'il queue items: next_items=%zu queue_items_in_next=%zu max_user_queue_items=%zu'
- nearby 0x32f3f4: 'next_items=%zu queue_items_in_next=%zu max_user_queue_items=%zu'
- nearby 0x32f404: 'ueue_items_in_next=%zu max_user_queue_items=%zu'
- nearby 0x32f414: 'xt=%zu max_user_queue_items=%zu'
- nearby 0x32f424: 'queue_items=%zu'
- nearby 0x32f434: "List could not be created from '%s': %s"
- nearby 0x32f444: "e created from '%s': %s"
- nearby 0x32f454: "%s': %s"
- nearby 0x32f474: 'context.proto'
- nearby 0x32f484: 'art_timeout'
- nearby 0x32f494: 'uctorImpl.play'
- nearby 0x32f4a4: '=> Skip anchor observer for %s: actual logical clip %s not found'
- nearby 0x32f4b4: 'bserver for %s: actual logical clip %s not found'
- nearby 0x32f4c4: 'actual logical clip %s not found'
- nearby 0x32f4d4: 'lip %s not found'
- nearby 0x32f4f4: 'paused)'
- nearby 0x32f504: 'om='
- nearby 0x32f514: 'ine_conductor::CosmosVideoProtocolDispatcher::handleError %s'
- nearby 0x32f524: 'osmosVideoProtocolDispatcher::handleError %s'

## FDE (25017498, 25017690)
 17dbc9a:	53                   	push   rbx
 17dbc9b:	48 81 ec d0 00 00 00 	sub    rsp,0xd0
 17dbca2:	48 89 fb             	mov    rbx,rdi
 17dbca5:	48 89 e7             	mov    rdi,rsp
 17dbca8:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx
 17dbcac:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx
 17dbcb0:	4c 89 47 20          	mov    QWORD PTR [rdi+0x20],r8
 17dbcb4:	4c 89 4f 28          	mov    QWORD PTR [rdi+0x28],r9
 17dbcb8:	84 c0                	test   al,al
 17dbcba:	74 31                	je     17dbced <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b0e>
 17dbcbc:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
 17dbcc1:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
 17dbcc6:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
 17dbccb:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
 17dbcd0:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
 17dbcd5:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
 17dbcdc:	00 
 17dbcdd:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
 17dbce4:	00 
 17dbce5:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
 17dbcec:	00 
 17dbced:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17dbcf4:	00 00 
 17dbcf6:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
 17dbcfd:	00 
 17dbcfe:	48 8d 94 24 b0 00 00 	lea    rdx,[rsp+0xb0]
 17dbd05:	00 
 17dbd06:	48 89 7a 10          	mov    QWORD PTR [rdx+0x10],rdi
 17dbd0a:	48 8d 84 24 e0 00 00 	lea    rax,[rsp+0xe0]
 17dbd11:	00 
 17dbd12:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
 17dbd16:	48 b8 10 00 00 00 30 	movabs rax,0x3000000010
 17dbd1d:	00 00 00 
 17dbd20:	48 89 02             	mov    QWORD PTR [rdx],rax
 17dbd23:	0f 57 c0             	xorps  xmm0,xmm0
 17dbd26:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 17dbd29:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 17dbd2e:	48 89 df             	mov    rdi,rbx
 17dbd31:	e8 ae fc ff ff       	call   17db9e4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7805>
 17dbd36:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17dbd3d:	00 00 
 17dbd3f:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
 17dbd46:	00 
 17dbd47:	75 0c                	jne    17dbd55 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b76>
 17dbd49:	48 89 d8             	mov    rax,rbx
 17dbd4c:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
 17dbd53:	5b                   	pop    rbx
 17dbd54:	c3                   	ret
 17dbd55:	e8 56 3d 01 00       	call   17efab0 <__stack_chk_fail@plt>

## Destination writes and object-producing operations
### 0x17dbca8: mov    QWORD PTR [rdi+0x10],rdx
     17dbc90:	41 5e                	pop    r14
     17dbc92:	41 5f                	pop    r15
     17dbc94:	c3                   	ret
     17dbc95:	e8 16 3e 01 00       	call   17efab0 <__stack_chk_fail@plt>
     17dbc9a:	53                   	push   rbx
     17dbc9b:	48 81 ec d0 00 00 00 	sub    rsp,0xd0
     17dbca2:	48 89 fb             	mov    rbx,rdi
     17dbca5:	48 89 e7             	mov    rdi,rsp
     17dbca8:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx
     17dbcac:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx
     17dbcb0:	4c 89 47 20          	mov    QWORD PTR [rdi+0x20],r8
     17dbcb4:	4c 89 4f 28          	mov    QWORD PTR [rdi+0x28],r9
     17dbcb8:	84 c0                	test   al,al
     17dbcba:	74 31                	je     17dbced <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b0e>
     17dbcbc:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     17dbcc1:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
     17dbcc6:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
     17dbccb:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
     17dbcd0:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
     17dbcd5:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
     17dbcdc:	00 
     17dbcdd:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
     17dbce4:	00 

### 0x17dbcac: mov    QWORD PTR [rdi+0x18],rcx
     17dbc92:	41 5f                	pop    r15
     17dbc94:	c3                   	ret
     17dbc95:	e8 16 3e 01 00       	call   17efab0 <__stack_chk_fail@plt>
     17dbc9a:	53                   	push   rbx
     17dbc9b:	48 81 ec d0 00 00 00 	sub    rsp,0xd0
     17dbca2:	48 89 fb             	mov    rbx,rdi
     17dbca5:	48 89 e7             	mov    rdi,rsp
     17dbca8:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx
     17dbcac:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx
     17dbcb0:	4c 89 47 20          	mov    QWORD PTR [rdi+0x20],r8
     17dbcb4:	4c 89 4f 28          	mov    QWORD PTR [rdi+0x28],r9
     17dbcb8:	84 c0                	test   al,al
     17dbcba:	74 31                	je     17dbced <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b0e>
     17dbcbc:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     17dbcc1:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
     17dbcc6:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
     17dbccb:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
     17dbcd0:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
     17dbcd5:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
     17dbcdc:	00 
     17dbcdd:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
     17dbce4:	00 
     17dbce5:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7

### 0x17dbcb0: mov    QWORD PTR [rdi+0x20],r8
     17dbc94:	c3                   	ret
     17dbc95:	e8 16 3e 01 00       	call   17efab0 <__stack_chk_fail@plt>
     17dbc9a:	53                   	push   rbx
     17dbc9b:	48 81 ec d0 00 00 00 	sub    rsp,0xd0
     17dbca2:	48 89 fb             	mov    rbx,rdi
     17dbca5:	48 89 e7             	mov    rdi,rsp
     17dbca8:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx
     17dbcac:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx
     17dbcb0:	4c 89 47 20          	mov    QWORD PTR [rdi+0x20],r8
     17dbcb4:	4c 89 4f 28          	mov    QWORD PTR [rdi+0x28],r9
     17dbcb8:	84 c0                	test   al,al
     17dbcba:	74 31                	je     17dbced <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b0e>
     17dbcbc:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     17dbcc1:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
     17dbcc6:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
     17dbccb:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
     17dbcd0:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
     17dbcd5:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
     17dbcdc:	00 
     17dbcdd:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
     17dbce4:	00 
     17dbce5:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
     17dbcec:	00 

### 0x17dbcb4: mov    QWORD PTR [rdi+0x28],r9
     17dbc95:	e8 16 3e 01 00       	call   17efab0 <__stack_chk_fail@plt>
     17dbc9a:	53                   	push   rbx
     17dbc9b:	48 81 ec d0 00 00 00 	sub    rsp,0xd0
     17dbca2:	48 89 fb             	mov    rbx,rdi
     17dbca5:	48 89 e7             	mov    rdi,rsp
     17dbca8:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx
     17dbcac:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx
     17dbcb0:	4c 89 47 20          	mov    QWORD PTR [rdi+0x20],r8
     17dbcb4:	4c 89 4f 28          	mov    QWORD PTR [rdi+0x28],r9
     17dbcb8:	84 c0                	test   al,al
     17dbcba:	74 31                	je     17dbced <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b0e>
     17dbcbc:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     17dbcc1:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
     17dbcc6:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
     17dbccb:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
     17dbcd0:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
     17dbcd5:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
     17dbcdc:	00 
     17dbcdd:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
     17dbce4:	00 
     17dbce5:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
     17dbcec:	00 
     17dbced:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x17dbd26: movups XMMWORD PTR [rbx],xmm0
     17dbd06:	48 89 7a 10          	mov    QWORD PTR [rdx+0x10],rdi
     17dbd0a:	48 8d 84 24 e0 00 00 	lea    rax,[rsp+0xe0]
     17dbd11:	00 
     17dbd12:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
     17dbd16:	48 b8 10 00 00 00 30 	movabs rax,0x3000000010
     17dbd1d:	00 00 00 
     17dbd20:	48 89 02             	mov    QWORD PTR [rdx],rax
     17dbd23:	0f 57 c0             	xorps  xmm0,xmm0
     17dbd26:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     17dbd29:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     17dbd2e:	48 89 df             	mov    rdi,rbx
     17dbd31:	e8 ae fc ff ff       	call   17db9e4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7805>
     17dbd36:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     17dbd3d:	00 00 
     17dbd3f:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
     17dbd46:	00 
     17dbd47:	75 0c                	jne    17dbd55 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b76>
     17dbd49:	48 89 d8             	mov    rax,rbx
     17dbd4c:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
     17dbd53:	5b                   	pop    rbx
     17dbd54:	c3                   	ret
     17dbd55:	e8 56 3d 01 00       	call   17efab0 <__stack_chk_fail@plt>
     17dbd5a:	48 83 fa 02          	cmp    rdx,0x2

### 0x17dbd29: and    QWORD PTR [rbx+0x10],0x0
     17dbd0a:	48 8d 84 24 e0 00 00 	lea    rax,[rsp+0xe0]
     17dbd11:	00 
     17dbd12:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
     17dbd16:	48 b8 10 00 00 00 30 	movabs rax,0x3000000010
     17dbd1d:	00 00 00 
     17dbd20:	48 89 02             	mov    QWORD PTR [rdx],rax
     17dbd23:	0f 57 c0             	xorps  xmm0,xmm0
     17dbd26:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     17dbd29:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     17dbd2e:	48 89 df             	mov    rdi,rbx
     17dbd31:	e8 ae fc ff ff       	call   17db9e4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7805>
     17dbd36:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     17dbd3d:	00 00 
     17dbd3f:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
     17dbd46:	00 
     17dbd47:	75 0c                	jne    17dbd55 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b76>
     17dbd49:	48 89 d8             	mov    rax,rbx
     17dbd4c:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
     17dbd53:	5b                   	pop    rbx
     17dbd54:	c3                   	ret
     17dbd55:	e8 56 3d 01 00       	call   17efab0 <__stack_chk_fail@plt>
     17dbd5a:	48 83 fa 02          	cmp    rdx,0x2
     17dbd5e:	73 03                	jae    17dbd63 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b84>

## Calls / tail jumps
 17dbd31:	e8 ae fc ff ff       	call   17db9e4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7805>
 17dbd55:	e8 56 3d 01 00       	call   17efab0 <__stack_chk_fail@plt>

## Heap allocations and vptr constants in FDE
