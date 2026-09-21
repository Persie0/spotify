# Service184 real factory 0x17dbc9a

Entry contract inherited from 0x15da3b7:
- rdi = output object / 24-byte return aggregate
- rsi = type/key string at 0x32f434
- rdx = normalized source string
- rcx = normalized config string
- output +0x10 is later moved into serviceTable[184]

## Factory FDE (25017498, 25017690)
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

## Writes through destination aliases
- aliases: rbx, rdi
### 0x17dbca8: mov    QWORD PTR [rdi+0x10],rdx
     17dbc88:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
     17dbc8f:	5b                   	pop    rbx
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
     17dbce5:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
     17dbcec:	00 
     17dbced:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     17dbcf4:	00 00 

### 0x17dbcac: mov    QWORD PTR [rdi+0x18],rcx
     17dbc8f:	5b                   	pop    rbx
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
     17dbce5:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
     17dbcec:	00 
     17dbced:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     17dbcf4:	00 00 
     17dbcf6:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax

### 0x17dbcb0: mov    QWORD PTR [rdi+0x20],r8
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
     17dbce5:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
     17dbcec:	00 
     17dbced:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     17dbcf4:	00 00 
     17dbcf6:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     17dbcfd:	00 

### 0x17dbcb4: mov    QWORD PTR [rdi+0x28],r9
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
     17dbcec:	00 
     17dbced:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     17dbcf4:	00 00 
     17dbcf6:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     17dbcfd:	00 
     17dbcfe:	48 8d 94 24 b0 00 00 	lea    rdx,[rsp+0xb0]

### 0x17dbd26: movups XMMWORD PTR [rbx],xmm0
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
     17dbd5a:	48 83 fa 02          	cmp    rdx,0x2
     17dbd5e:	73 03                	jae    17dbd63 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b84>
     17dbd60:	b0 01                	mov    al,0x1
     17dbd62:	c3                   	ret
     17dbd63:	55                   	push   rbp

### 0x17dbd29: and    QWORD PTR [rbx+0x10],0x0
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
     17dbd5a:	48 83 fa 02          	cmp    rdx,0x2
     17dbd5e:	73 03                	jae    17dbd63 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b84>
     17dbd60:	b0 01                	mov    al,0x1
     17dbd62:	c3                   	ret
     17dbd63:	55                   	push   rbp
     17dbd64:	41 57                	push   r15

## Heap allocations
## High-address constants and possible vptr materializations
## Candidate table neighborhoods
## Calls in factory and return-value stores
### call @0x17dbd31: call   17db9e4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7805>
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
     17dbd60:	b0 01                	mov    al,0x1
     17dbd62:	c3                   	ret

### call @0x17dbd55: call   17efab0 <__stack_chk_fail@plt>
     17dbd46:	00 
     17dbd47:	75 0c                	jne    17dbd55 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b76>
     17dbd49:	48 89 d8             	mov    rax,rbx
     17dbd4c:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
     17dbd53:	5b                   	pop    rbx
     17dbd54:	c3                   	ret
     17dbd55:	e8 56 3d 01 00       	call   17efab0 <__stack_chk_fail@plt>
     17dbd5a:	48 83 fa 02          	cmp    rdx,0x2
     17dbd5e:	73 03                	jae    17dbd63 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7b84>
     17dbd60:	b0 01                	mov    al,0x1
     17dbd62:	c3                   	ret
     17dbd63:	55                   	push   rbp
     17dbd64:	41 57                	push   r15
     17dbd66:	41 56                	push   r14
     17dbd68:	41 55                	push   r13
     17dbd6a:	41 54                	push   r12
     17dbd6c:	53                   	push   rbx
     17dbd6d:	48 83 ec 18          	sub    rsp,0x18
     17dbd71:	48 89 d3             	mov    rbx,rdx
     17dbd74:	49 89 f6             	mov    r14,rsi
     17dbd77:	49 89 ff             	mov    r15,rdi

## Direct callers of 0x17dbc9a
### caller/xfer 0xac1ee7; FDE=(11278045, 11286889)
      ac1eb4:	66 0f ef c0          	pxor   xmm0,xmm0
      ac1eb8:	f3 41 0f 7f 86 88 00 	movdqu XMMWORD PTR [r14+0x88],xmm0
      ac1ebf:	00 00 
      ac1ec1:	f3 41 0f 7f 46 78    	movdqu XMMWORD PTR [r14+0x78],xmm0
      ac1ec7:	49 83 a6 98 00 00 00 	and    QWORD PTR [r14+0x98],0x0
      ac1ece:	00 
      ac1ecf:	41 8b 56 30          	mov    edx,DWORD PTR [r14+0x30]
      ac1ed3:	48 8d 35 6a f6 86 ff 	lea    rsi,[rip+0xffffffffff86f66a]        # 331544 <_ZTSSt12bad_any_cast@@Base-0x5ec84>
      ac1eda:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
      ac1ee1:	00 
      ac1ee2:	48 89 df             	mov    rdi,rbx
      ac1ee5:	31 c0                	xor    eax,eax
      ac1ee7:	e8 ae 9d d1 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      ac1eec:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      ac1ef0:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
      ac1ef7:	00 
      ac1ef8:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
      ac1efc:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      ac1f00:	66 0f 7f 02          	movdqa XMMWORD PTR [rdx],xmm0
      ac1f04:	66 0f ef c0          	pxor   xmm0,xmm0
      ac1f08:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0
      ac1f0c:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      ac1f11:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      ac1f18:	00 
      ac1f19:	48 8d b4 24 c8 00 00 	lea    rsi,[rsp+0xc8]
      ac1f20:	00 
      ac1f21:	e8 81 63 fe ff       	call   aa82a7 <JNI_OnUnload@@Base+0x2fb74>
      ac1f26:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      ac1f2d:	00 
      ac1f2e:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
      ac1f35:	00 
      ac1f36:	e8 05 c0 d2 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ac1f3b:	4c 89 64 24 38       	mov    QWORD PTR [rsp+0x38],r12

### caller/xfer 0xacd7de; FDE=(11323428, 11332417)
      acd7b1:	f6 84 24 e0 03 00 00 	test   BYTE PTR [rsp+0x3e0],0x1
      acd7b8:	01 
      acd7b9:	74 0a                	je     acd7c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a765>
      acd7bb:	4c 8b 84 24 f0 03 00 	mov    r8,QWORD PTR [rsp+0x3f0]
      acd7c2:	00 
      acd7c3:	eb 08                	jmp    acd7cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a76d>
      acd7c5:	4c 8d 84 24 e1 03 00 	lea    r8,[rsp+0x3e1]
      acd7cc:	00 
      acd7cd:	48 8d 35 d1 04 89 ff 	lea    rsi,[rip+0xffffffffff8904d1]        # 35dca5 <_ZTSSt12bad_any_cast@@Base-0x32523>
      acd7d4:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
      acd7db:	00 
      acd7dc:	31 c0                	xor    eax,eax
      acd7de:	e8 b7 e4 d0 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      acd7e3:	80 bc 24 10 04 00 00 	cmp    BYTE PTR [rsp+0x410],0x0
      acd7ea:	00 
      acd7eb:	74 67                	je     acd854 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a7f4>
      acd7ed:	48 8d 94 24 f8 03 00 	lea    rdx,[rsp+0x3f8]
      acd7f4:	00 
      acd7f5:	48 8d 35 b9 3f 88 ff 	lea    rsi,[rip+0xffffffffff883fb9]        # 3517b5 <_ZTSSt12bad_any_cast@@Base-0x3ea13>
      acd7fc:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
      acd803:	00 
      acd804:	e8 67 0d d2 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>
      acd809:	48 8d 15 80 e2 87 ff 	lea    rdx,[rip+0xffffffffff87e280]        # 34ba90 <_ZTSSt12bad_any_cast@@Base-0x44738>
      acd810:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      acd817:	00 
      acd818:	48 8d b4 24 00 05 00 	lea    rsi,[rsp+0x500]
      acd81f:	00 
      acd820:	e8 18 dc fc ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>
      acd825:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
      acd82c:	00 
      acd82d:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
      acd834:	00 
      acd835:	e8 02 ab fd ff       	call   aa833c <JNI_OnUnload@@Base+0x2fc09>

### caller/xfer 0xad512e; FDE=(11358322, 11358555)
      ad50fc:	48 8d 4c 24 09       	lea    rcx,[rsp+0x9]
      ad5101:	f6 83 80 00 00 00 01 	test   BYTE PTR [rbx+0x80],0x1
      ad5108:	74 09                	je     ad5113 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x220b3>
      ad510a:	48 8b 9b 90 00 00 00 	mov    rbx,QWORD PTR [rbx+0x90]
      ad5111:	eb 07                	jmp    ad511a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x220ba>
      ad5113:	48 81 c3 81 00 00 00 	add    rbx,0x81
      ad511a:	48 8d 35 66 6e 87 ff 	lea    rsi,[rip+0xffffffffff876e66]        # 34bf87 <_ZTSSt12bad_any_cast@@Base-0x44241>
      ad5121:	4c 89 f7             	mov    rdi,r14
      ad5124:	89 ea                	mov    edx,ebp
      ad5126:	45 31 c0             	xor    r8d,r8d
      ad5129:	49 89 d9             	mov    r9,rbx
      ad512c:	31 c0                	xor    eax,eax
      ad512e:	e8 67 6b d0 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      ad5133:	4c 89 ff             	mov    rdi,r15
      ad5136:	e8 55 8d d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad513b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ad5142:	00 00 
      ad5144:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ad5149:	75 0b                	jne    ad5156 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x220f6>
      ad514b:	48 83 c4 28          	add    rsp,0x28
      ad514f:	5b                   	pop    rbx
      ad5150:	41 5e                	pop    r14
      ad5152:	41 5f                	pop    r15
      ad5154:	5d                   	pop    rbp
      ad5155:	c3                   	ret
      ad5156:	e8 55 a9 d1 00       	call   17efab0 <__stack_chk_fail@plt>
      ad515b:	41 57                	push   r15
      ad515d:	41 56                	push   r14
      ad515f:	41 55                	push   r13
      ad5161:	41 54                	push   r12
      ad5163:	53                   	push   rbx
      ad5164:	48 81 ec 90 00 00 00 	sub    rsp,0x90
      ad516b:	48 89 cb             	mov    rbx,rcx

### caller/xfer 0xaf820e; FDE=(11499836, 11502971)
      af81e0:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      af81e7:	00 
      af81e8:	6a 09                	push   0x9
      af81ea:	5a                   	pop    rdx
      af81eb:	48 89 d9             	mov    rcx,rbx
      af81ee:	e8 df 2f 00 00       	call   afb1d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x48172>
      af81f3:	e9 f5 00 00 00       	jmp    af82ed <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4528d>
      af81f8:	48 8d 94 24 81 01 00 	lea    rdx,[rsp+0x181]
      af81ff:	00 
      af8200:	48 8d 35 7e 62 85 ff 	lea    rsi,[rip+0xffffffffff85627e]        # 34e485 <_ZTSSt12bad_any_cast@@Base-0x41d43>
      af8207:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      af820c:	31 c0                	xor    eax,eax
      af820e:	e8 87 3a ce 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      af8213:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      af821a:	00 
      af821b:	e8 70 5c cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af8220:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      af8227:	00 
      af8228:	e8 63 5c cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af822d:	6a 40                	push   0x40
      af822f:	5f                   	pop    rdi
      af8230:	e8 cb 5c cf 00       	call   17edf00 <_Znwm@plt>
      af8235:	48 89 c3             	mov    rbx,rax
      af8238:	48 8d 84 24 b8 00 00 	lea    rax,[rsp+0xb8]
      af823f:	00 
      af8240:	48 89 9c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rbx
      af8247:	00 
      af8248:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
      af824f:	00 
      af8250:	c6 84 24 10 01 00 00 	mov    BYTE PTR [rsp+0x110],0x0
      af8257:	00 
      af8258:	49 89 de             	mov    r14,rbx
      af825b:	49 83 c6 10          	add    r14,0x10

### caller/xfer 0xb54b19; FDE=(11880854, 11882234)
      b54ae8:	e8 dd 0f 00 00       	call   b55aca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa2a6a>
      b54aed:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      b54af2:	44 89 e6             	mov    esi,r12d
      b54af5:	e8 69 79 9d 00       	call   152c463 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3719e7>
      b54afa:	f6 44 24 30 01       	test   BYTE PTR [rsp+0x30],0x1
      b54aff:	74 07                	je     b54b08 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1aa8>
      b54b01:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
      b54b06:	eb 05                	jmp    b54b0d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1aad>
      b54b08:	48 8d 54 24 31       	lea    rdx,[rsp+0x31]
      b54b0d:	48 8d 35 e9 65 7e ff 	lea    rsi,[rip+0xffffffffff7e65e9]        # 33b0fd <_ZTSSt12bad_any_cast@@Base-0x550cb>
      b54b14:	48 89 e7             	mov    rdi,rsp
      b54b17:	31 c0                	xor    eax,eax
      b54b19:	e8 7c 71 c8 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      b54b1e:	0f b6 44 24 48       	movzx  eax,BYTE PTR [rsp+0x48]
      b54b23:	a8 01                	test   al,0x1
      b54b25:	74 07                	je     b54b2e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1ace>
      b54b27:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      b54b2c:	eb 02                	jmp    b54b30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1ad0>
      b54b2e:	d1 e8                	shr    eax,1
      b54b30:	48 85 c0             	test   rax,rax
      b54b33:	75 0b                	jne    b54b40 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1ae0>
      b54b35:	41 80 7f 20 00       	cmp    BYTE PTR [r15+0x20],0x0
      b54b3a:	0f 84 98 00 00 00    	je     b54bd8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1b78>
      b54b40:	48 8d 35 a3 d5 80 ff 	lea    rsi,[rip+0xffffffffff80d5a3]        # 3620ea <_ZTSSt12bad_any_cast@@Base-0x2e0de>
      b54b47:	48 89 e7             	mov    rdi,rsp
      b54b4a:	e8 71 94 c9 00       	call   17edfc0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKc@plt>
      b54b4f:	0f b6 44 24 48       	movzx  eax,BYTE PTR [rsp+0x48]
      b54b54:	a8 01                	test   al,0x1
      b54b56:	74 07                	je     b54b5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1aff>
      b54b58:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      b54b5d:	eb 02                	jmp    b54b61 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1b01>
      b54b5f:	d1 e8                	shr    eax,1
      b54b61:	48 85 c0             	test   rax,rax

### caller/xfer 0xb54bbb; FDE=(11880854, 11882234)
      b54b8a:	e8 ad 37 f5 ff       	call   aa833c <JNI_OnUnload@@Base+0x2fc09>
      b54b8f:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      b54b96:	00 
      b54b97:	e8 f4 92 c9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b54b9c:	41 80 7f 20 00       	cmp    BYTE PTR [r15+0x20],0x0
      b54ba1:	74 35                	je     b54bd8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1b78>
      b54ba3:	49 8b 57 18          	mov    rdx,QWORD PTR [r15+0x18]
      b54ba7:	48 8d 35 2f ce 7e ff 	lea    rsi,[rip+0xffffffffff7ece2f]        # 3419dd <_ZTSSt12bad_any_cast@@Base-0x4e7eb>
      b54bae:	4c 8d a4 24 80 00 00 	lea    r12,[rsp+0x80]
      b54bb5:	00 
      b54bb6:	4c 89 e7             	mov    rdi,r12
      b54bb9:	31 c0                	xor    eax,eax
      b54bbb:	e8 da 70 c8 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      b54bc0:	48 89 e7             	mov    rdi,rsp
      b54bc3:	4c 89 e6             	mov    rsi,r12
      b54bc6:	e8 71 37 f5 ff       	call   aa833c <JNI_OnUnload@@Base+0x2fc09>
      b54bcb:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      b54bd2:	00 
      b54bd3:	e8 b8 92 c9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b54bd8:	48 8d 35 41 a6 82 ff 	lea    rsi,[rip+0xffffffffff82a641]        # 37f220 <_ZTSSt12bad_any_cast@@Base-0x10fa8>
      b54bdf:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      b54be6:	00 
      b54be7:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
      b54bec:	e8 7f 99 c9 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>
      b54bf1:	48 89 e7             	mov    rdi,rsp
      b54bf4:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      b54bfb:	00 
      b54bfc:	e8 3b 37 f5 ff       	call   aa833c <JNI_OnUnload@@Base+0x2fc09>
      b54c01:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      b54c08:	00 
      b54c09:	e8 82 92 c9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b54c0e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
      b54c13:	74 34                	je     b54c49 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1be9>

### caller/xfer 0xb865fc; FDE=(12083334, 12091202)
      b865d2:	48 8d 2d a3 b9 8c ff 	lea    rbp,[rip+0xffffffffff8cb9a3]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      b865d9:	48 0f 44 e8          	cmove  rbp,rax
      b865dd:	45 0f b6 cc          	movzx  r9d,r12b
      b865e1:	48 8d 35 00 18 7b ff 	lea    rsi,[rip+0xffffffffff7b1800]        # 337de8 <_ZTSSt12bad_any_cast@@Base-0x583e0>
      b865e8:	4c 8d a4 24 40 02 00 	lea    r12,[rsp+0x240]
      b865ef:	00 
      b865f0:	6a 06                	push   0x6
      b865f2:	59                   	pop    rcx
      b865f3:	6a 02                	push   0x2
      b865f5:	41 58                	pop    r8
      b865f7:	4c 89 e7             	mov    rdi,r12
      b865fa:	31 c0                	xor    eax,eax
      b865fc:	e8 99 56 c5 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      b86601:	41 f6 04 24 01       	test   BYTE PTR [r12],0x1
      b86606:	74 0a                	je     b86612 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd35b2>
      b86608:	4c 8b 8c 24 50 02 00 	mov    r9,QWORD PTR [rsp+0x250]
      b8660f:	00 
      b86610:	eb 08                	jmp    b8661a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd35ba>
      b86612:	4c 8d 8c 24 41 02 00 	lea    r9,[rsp+0x241]
      b86619:	00 
      b8661a:	48 8d 35 db ff 7e ff 	lea    rsi,[rip+0xffffffffff7effdb]        # 3765fc <_ZTSSt12bad_any_cast@@Base-0x19bcc>
      b86621:	48 8d 9c 24 d8 02 00 	lea    rbx,[rsp+0x2d8]
      b86628:	00 
      b86629:	48 89 df             	mov    rdi,rbx
      b8662c:	4c 89 fa             	mov    rdx,r15
      b8662f:	4c 89 e9             	mov    rcx,r13
      b86632:	49 89 e8             	mov    r8,rbp
      b86635:	31 c0                	xor    eax,eax
      b86637:	e8 5e 56 c5 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      b8663c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      b86643:	00 
      b86644:	48 89 de             	mov    rsi,rbx
      b86647:	e8 e2 53 ef ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>

### caller/xfer 0xb86637; FDE=(12083334, 12091202)
      b8660f:	00 
      b86610:	eb 08                	jmp    b8661a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd35ba>
      b86612:	4c 8d 8c 24 41 02 00 	lea    r9,[rsp+0x241]
      b86619:	00 
      b8661a:	48 8d 35 db ff 7e ff 	lea    rsi,[rip+0xffffffffff7effdb]        # 3765fc <_ZTSSt12bad_any_cast@@Base-0x19bcc>
      b86621:	48 8d 9c 24 d8 02 00 	lea    rbx,[rsp+0x2d8]
      b86628:	00 
      b86629:	48 89 df             	mov    rdi,rbx
      b8662c:	4c 89 fa             	mov    rdx,r15
      b8662f:	4c 89 e9             	mov    rcx,r13
      b86632:	49 89 e8             	mov    r8,rbp
      b86635:	31 c0                	xor    eax,eax
      b86637:	e8 5e 56 c5 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      b8663c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      b86643:	00 
      b86644:	48 89 de             	mov    rsi,rbx
      b86647:	e8 e2 53 ef ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      b8664c:	48 89 df             	mov    rdi,rbx
      b8664f:	e8 3c 78 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b86654:	4c 89 e7             	mov    rdi,r12
      b86657:	e8 34 78 c6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b8665c:	4c 8d bc 24 70 06 00 	lea    r15,[rsp+0x670]
      b86663:	00 
      b86664:	4c 89 ff             	mov    rdi,r15
      b86667:	e8 f2 22 f4 ff       	call   ac895e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x158fe>
      b8666c:	49 8b 2e             	mov    rbp,QWORD PTR [r14]
      b8666f:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      b86674:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b86677:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b8667a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      b8667d:	48 89 c7             	mov    rdi,rax
      b86680:	ff 51 40             	call   QWORD PTR [rcx+0x40]
      b86683:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax

### caller/xfer 0xc12d80; FDE=(12659676, 12660235)
      c12d50:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
      c12d57:	00 
      c12d58:	4c 89 ff             	mov    rdi,r15
      c12d5b:	e8 ca 77 ab 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
      c12d60:	41 f6 07 01          	test   BYTE PTR [r15],0x1
      c12d64:	74 07                	je     c12d6d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fd0d>
      c12d66:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
      c12d6b:	eb 05                	jmp    c12d72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fd12>
      c12d6d:	48 8d 54 24 11       	lea    rdx,[rsp+0x11]
      c12d72:	48 8d 35 4c 11 71 ff 	lea    rsi,[rip+0xffffffffff71114c]        # 323ec5 <_ZTSSt12bad_any_cast@@Base-0x6c303>
      c12d79:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      c12d7e:	31 c0                	xor    eax,eax
      c12d80:	e8 15 8f bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c12d85:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
      c12d89:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      c12d8d:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      c12d91:	48 85 c0             	test   rax,rax
      c12d94:	74 05                	je     c12d9b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fd3b>
      c12d96:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      c12d9b:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
      c12da0:	48 89 e2             	mov    rdx,rsp
      c12da3:	48 89 df             	mov    rdi,rbx
      c12da6:	e8 0f f9 ff ff       	call   c126ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15f65a>
      c12dab:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      c12db0:	e8 d1 b6 e8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c12db5:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      c12dba:	e8 d1 b0 bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c12dbf:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      c12dc4:	e8 c7 b0 bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c12dc9:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      c12dd0:	00 
      c12dd1:	e8 58 25 ab 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      c12dd6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### caller/xfer 0xc130e6; FDE=(12660318, 12661073)
      c130c3:	41 5f                	pop    r15
      c130c5:	5d                   	pop    rbp
      c130c6:	c3                   	ret
      c130c7:	f6 03 01             	test   BYTE PTR [rbx],0x1
      c130ca:	74 06                	je     c130d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x160072>
      c130cc:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
      c130d0:	eb 03                	jmp    c130d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x160075>
      c130d2:	48 ff c3             	inc    rbx
      c130d5:	48 8d 35 8f 9a 75 ff 	lea    rsi,[rip+0xffffffffff759a8f]        # 36cb6b <_ZTSSt12bad_any_cast@@Base-0x2365d>
      c130dc:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      c130e1:	48 89 da             	mov    rdx,rbx
      c130e4:	31 c0                	xor    eax,eax
      c130e6:	e8 af 8b bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c130eb:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
      c130f0:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      c130f4:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      c130f7:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      c130fc:	48 85 c0             	test   rax,rax
      c130ff:	74 05                	je     c13106 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1600a6>
      c13101:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      c13106:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      c1310b:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      c13110:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
      c13114:	48 89 df             	mov    rdi,rbx
      c13117:	e8 35 00 00 00       	call   c13151 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1600f1>
      c1311c:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      c13121:	e8 60 b3 e8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c13126:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      c1312b:	e8 60 ad bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c13130:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
      c13137:	00 
      c13138:	e8 f1 21 ab 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      c1313d:	e9 4f ff ff ff       	jmp    c13091 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x160031>

### caller/xfer 0xc1395a; FDE=(12662482, 12663237)
      c13937:	41 5f                	pop    r15
      c13939:	5d                   	pop    rbp
      c1393a:	c3                   	ret
      c1393b:	f6 03 01             	test   BYTE PTR [rbx],0x1
      c1393e:	74 06                	je     c13946 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1608e6>
      c13940:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
      c13944:	eb 03                	jmp    c13949 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1608e9>
      c13946:	48 ff c3             	inc    rbx
      c13949:	48 8d 35 1b 92 75 ff 	lea    rsi,[rip+0xffffffffff75921b]        # 36cb6b <_ZTSSt12bad_any_cast@@Base-0x2365d>
      c13950:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      c13955:	48 89 da             	mov    rdx,rbx
      c13958:	31 c0                	xor    eax,eax
      c1395a:	e8 3b 83 bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c1395f:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
      c13964:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      c13968:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      c1396b:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      c13970:	48 85 c0             	test   rax,rax
      c13973:	74 05                	je     c1397a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16091a>
      c13975:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      c1397a:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      c1397f:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      c13984:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
      c13988:	48 89 df             	mov    rdi,rbx
      c1398b:	e8 c1 f7 ff ff       	call   c13151 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1600f1>
      c13990:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      c13995:	e8 ec aa e8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c1399a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      c1399f:	e8 ec a4 bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c139a4:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
      c139ab:	00 
      c139ac:	e8 7d 19 ab 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      c139b1:	e9 4f ff ff ff       	jmp    c13905 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1608a5>

### caller/xfer 0xc143da; FDE=(12665408, 12666269)
      c143a5:	e8 06 aa bd 00       	call   17eedb0 <strcmp@plt>
      c143aa:	85 c0                	test   eax,eax
      c143ac:	0f 84 03 01 00 00    	je     c144b5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x161455>
      c143b2:	48 8d 35 65 bd 71 ff 	lea    rsi,[rip+0xffffffffff71bd65]        # 33011e <_ZTSSt12bad_any_cast@@Base-0x600aa>
      c143b9:	4c 89 e7             	mov    rdi,r12
      c143bc:	e8 ef a9 bd 00       	call   17eedb0 <strcmp@plt>
      c143c1:	85 c0                	test   eax,eax
      c143c3:	0f 84 f0 00 00 00    	je     c144b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x161459>
      c143c9:	48 8d 35 f3 30 71 ff 	lea    rsi,[rip+0xffffffffff7130f3]        # 3274c3 <_ZTSSt12bad_any_cast@@Base-0x68d05>
      c143d0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      c143d5:	4c 89 e2             	mov    rdx,r12
      c143d8:	31 c0                	xor    eax,eax
      c143da:	e8 bb 78 bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c143df:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
      c143e2:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
      c143e6:	4d 85 f6             	test   r14,r14
      c143e9:	74 05                	je     c143f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x161390>
      c143eb:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      c143f0:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      c143f5:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0
      c143fa:	48 8d 05 af 27 c0 00 	lea    rax,[rip+0xc027af]        # 1816bb0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xc870>
      c14401:	48 89 07             	mov    QWORD PTR [rdi],rax
      c14404:	0f 57 c0             	xorps  xmm0,xmm0
      c14407:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      c1440b:	c6 47 20 00          	mov    BYTE PTR [rdi+0x20],0x0
      c1440f:	e8 56 e7 ff ff       	call   c12b6a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fb0a>
      c14414:	c7 40 20 90 01 00 00 	mov    DWORD PTR [rax+0x20],0x190
      c1441b:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
      c1441f:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      c14424:	e8 41 e7 ff ff       	call   c12b6a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fb0a>
      c14429:	48 89 c1             	mov    rcx,rax
      c1442c:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
      c14430:	48 83 c0 18          	add    rax,0x18

### caller/xfer 0xc14689; FDE=(12666270, 12666736)
      c14665:	41 59                	pop    r9
      c14667:	ff d0                	call   rax
      c14669:	eb 62                	jmp    c146cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16166d>
      c1466b:	f6 45 00 01          	test   BYTE PTR [rbp+0x0],0x1
      c1466f:	74 06                	je     c14677 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x161617>
      c14671:	48 8b 6d 10          	mov    rbp,QWORD PTR [rbp+0x10]
      c14675:	eb 03                	jmp    c1467a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16161a>
      c14677:	48 ff c5             	inc    rbp
      c1467a:	48 89 df             	mov    rdi,rbx
      c1467d:	48 8d 35 0b 79 74 ff 	lea    rsi,[rip+0xffffffffff74790b]        # 35bf8f <_ZTSSt12bad_any_cast@@Base-0x34239>
      c14684:	48 89 ea             	mov    rdx,rbp
      c14687:	31 c0                	xor    eax,eax
      c14689:	e8 0c 76 bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c1468e:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
      c14693:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      c14697:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      c1469a:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      c1469f:	48 85 c0             	test   rax,rax
      c146a2:	74 05                	je     c146a9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x161649>
      c146a4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      c146a9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c146ae:	48 89 de             	mov    rsi,rbx
      c146b1:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      c146b6:	e8 b5 00 00 00       	call   c14770 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x161710>
      c146bb:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      c146c0:	e8 c1 9d e8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c146c5:	48 89 df             	mov    rdi,rbx
      c146c8:	e8 c3 97 bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c146cd:	4c 89 e7             	mov    rdi,r12
      c146d0:	e8 59 0c ab 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      c146d5:	49 83 c6 08          	add    r14,0x8
      c146d9:	41 83 fd 3f          	cmp    r13d,0x3f
      c146dd:	0f 84 1c ff ff ff    	je     c145ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16159f>

### caller/xfer 0xc1493c; FDE=(12666962, 12667427)
      c14918:	41 59                	pop    r9
      c1491a:	ff d0                	call   rax
      c1491c:	eb 62                	jmp    c14980 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x161920>
      c1491e:	f6 45 00 01          	test   BYTE PTR [rbp+0x0],0x1
      c14922:	74 06                	je     c1492a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1618ca>
      c14924:	48 8b 6d 10          	mov    rbp,QWORD PTR [rbp+0x10]
      c14928:	eb 03                	jmp    c1492d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1618cd>
      c1492a:	48 ff c5             	inc    rbp
      c1492d:	4c 89 ff             	mov    rdi,r15
      c14930:	48 8d 35 58 76 74 ff 	lea    rsi,[rip+0xffffffffff747658]        # 35bf8f <_ZTSSt12bad_any_cast@@Base-0x34239>
      c14937:	48 89 ea             	mov    rdx,rbp
      c1493a:	31 c0                	xor    eax,eax
      c1493c:	e8 59 73 bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c14941:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
      c14946:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      c1494a:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      c1494d:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      c14952:	48 85 c0             	test   rax,rax
      c14955:	74 05                	je     c1495c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1618fc>
      c14957:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      c1495c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c14961:	4c 89 fe             	mov    rsi,r15
      c14964:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      c14969:	e8 02 fe ff ff       	call   c14770 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x161710>
      c1496e:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      c14973:	e8 0e 9b e8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c14978:	4c 89 ff             	mov    rdi,r15
      c1497b:	e8 10 95 bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c14980:	4c 89 e7             	mov    rdi,r12
      c14983:	e8 a6 09 ab 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      c14988:	49 83 c6 08          	add    r14,0x8
      c1498c:	41 83 fd 3f          	cmp    r13d,0x3f
      c14990:	0f 84 1d ff ff ff    	je     c148b3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x161853>

### caller/xfer 0xc1622e; FDE=(12671822, 12676442)
      c16203:	48 8b 53 18          	mov    rdx,QWORD PTR [rbx+0x18]
      c16207:	48 83 e2 fc          	and    rdx,0xfffffffffffffffc
      c1620b:	f6 02 01             	test   BYTE PTR [rdx],0x1
      c1620e:	74 06                	je     c16216 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1631b6>
      c16210:	48 8b 52 10          	mov    rdx,QWORD PTR [rdx+0x10]
      c16214:	eb 04                	jmp    c1621a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1631ba>
      c16216:	48 83 ca 01          	or     rdx,0x1
      c1621a:	48 8d 35 5b b6 71 ff 	lea    rsi,[rip+0xffffffffff71b65b]        # 33187c <_ZTSSt12bad_any_cast@@Base-0x5e94c>
      c16221:	4c 8d b4 24 c0 01 00 	lea    r14,[rsp+0x1c0]
      c16228:	00 
      c16229:	4c 89 f7             	mov    rdi,r14
      c1622c:	31 c0                	xor    eax,eax
      c1622e:	e8 67 5a bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c16233:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      c16238:	be 90 01 00 00       	mov    esi,0x190
      c1623d:	4c 89 f2             	mov    rdx,r14
      c16240:	e8 ff 0b 00 00       	call   c16e44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163de4>
      c16245:	eb 31                	jmp    c16278 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163218>
      c16247:	49 ff c6             	inc    r14
      c1624a:	48 8d 35 2b b6 71 ff 	lea    rsi,[rip+0xffffffffff71b62b]        # 33187c <_ZTSSt12bad_any_cast@@Base-0x5e94c>
      c16251:	4c 8d bc 24 c0 01 00 	lea    r15,[rsp+0x1c0]
      c16258:	00 
      c16259:	4c 89 ff             	mov    rdi,r15
      c1625c:	4c 89 f2             	mov    rdx,r14
      c1625f:	31 c0                	xor    eax,eax
      c16261:	e8 34 5a bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c16266:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      c1626b:	be 90 01 00 00       	mov    esi,0x190
      c16270:	4c 89 fa             	mov    rdx,r15
      c16273:	e8 cc 0b 00 00       	call   c16e44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163de4>
      c16278:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      c1627f:	00 
      c16280:	e8 0b 7c bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### caller/xfer 0xc16261; FDE=(12671822, 12676442)
      c16233:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      c16238:	be 90 01 00 00       	mov    esi,0x190
      c1623d:	4c 89 f2             	mov    rdx,r14
      c16240:	e8 ff 0b 00 00       	call   c16e44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163de4>
      c16245:	eb 31                	jmp    c16278 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163218>
      c16247:	49 ff c6             	inc    r14
      c1624a:	48 8d 35 2b b6 71 ff 	lea    rsi,[rip+0xffffffffff71b62b]        # 33187c <_ZTSSt12bad_any_cast@@Base-0x5e94c>
      c16251:	4c 8d bc 24 c0 01 00 	lea    r15,[rsp+0x1c0]
      c16258:	00 
      c16259:	4c 89 ff             	mov    rdi,r15
      c1625c:	4c 89 f2             	mov    rdx,r14
      c1625f:	31 c0                	xor    eax,eax
      c16261:	e8 34 5a bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c16266:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      c1626b:	be 90 01 00 00       	mov    esi,0x190
      c16270:	4c 89 fa             	mov    rdx,r15
      c16273:	e8 cc 0b 00 00       	call   c16e44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163de4>
      c16278:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      c1627f:	00 
      c16280:	e8 0b 7c bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c16285:	e9 88 08 00 00       	jmp    c16b12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163ab2>
      c1628a:	48 8d 35 eb bc 83 ff 	lea    rsi,[rip+0xffffffffff83bceb]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      c16291:	48 8d 0d 76 36 75 ff 	lea    rcx,[rip+0xffffffffff753676]        # 36990e <_ZTSSt12bad_any_cast@@Base-0x268ba>
      c16298:	6a 04                	push   0x4
      c1629a:	5f                   	pop    rdi
      c1629b:	6a 7b                	push   0x7b
      c1629d:	5a                   	pop    rdx
      c1629e:	31 c0                	xor    eax,eax
      c162a0:	e8 2d 06 bc 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      c162a5:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      c162aa:	e8 b9 d1 ff ff       	call   c13468 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x160408>
      c162af:	49 8b 86 30 01 00 00 	mov    rax,QWORD PTR [r14+0x130]
      c162b6:	49 8b 8e 38 01 00 00 	mov    rcx,QWORD PTR [r14+0x138]

### caller/xfer 0xc16b5c; FDE=(12671822, 12676442)
      c16b3b:	41 5c                	pop    r12
      c16b3d:	41 5d                	pop    r13
      c16b3f:	41 5e                	pop    r14
      c16b41:	41 5f                	pop    r15
      c16b43:	5d                   	pop    rbp
      c16b44:	c3                   	ret
      c16b45:	48 8d 35 8d 86 74 ff 	lea    rsi,[rip+0xffffffffff74868d]        # 35f1d9 <_ZTSSt12bad_any_cast@@Base-0x30fef>
      c16b4c:	4c 8d b4 24 c0 01 00 	lea    r14,[rsp+0x1c0]
      c16b53:	00 
      c16b54:	4c 89 f7             	mov    rdi,r14
      c16b57:	4c 89 ea             	mov    rdx,r13
      c16b5a:	31 c0                	xor    eax,eax
      c16b5c:	e8 39 51 bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c16b61:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      c16b66:	be 90 01 00 00       	mov    esi,0x190
      c16b6b:	4c 89 f2             	mov    rdx,r14
      c16b6e:	e8 d1 02 00 00       	call   c16e44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163de4>
      c16b73:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      c16b7a:	00 
      c16b7b:	e8 10 73 bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c16b80:	eb 86                	jmp    c16b08 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163aa8>
      c16b82:	4c 89 f7             	mov    rdi,r14
      c16b85:	e8 da 04 00 00       	call   c17064 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x164004>
      c16b8a:	e9 79 ff ff ff       	jmp    c16b08 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163aa8>
      c16b8f:	e9 f2 00 00 00       	jmp    c16c86 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163c26>
      c16b94:	eb 13                	jmp    c16ba9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163b49>
      c16b96:	e9 55 01 00 00       	jmp    c16cf0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163c90>
      c16b9b:	eb 0c                	jmp    c16ba9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163b49>
      c16b9d:	e9 4e 01 00 00       	jmp    c16cf0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163c90>
      c16ba2:	eb 05                	jmp    c16ba9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163b49>
      c16ba4:	e9 47 01 00 00       	jmp    c16cf0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163c90>
      c16ba9:	48 89 c3             	mov    rbx,rax
      c16bac:	48 8b bc 24 48 01 00 	mov    rdi,QWORD PTR [rsp+0x148]

### caller/xfer 0xc18450; FDE=(12681568, 12682769)
      c18426:	48 8b 52 10          	mov    rdx,QWORD PTR [rdx+0x10]
      c1842a:	eb 10                	jmp    c1843c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1653dc>
      c1842c:	41 f6 06 01          	test   BYTE PTR [r14],0x1
      c18430:	74 44                	je     c18476 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x165416>
      c18432:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
      c18436:	eb 41                	jmp    c18479 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x165419>
      c18438:	48 83 ca 01          	or     rdx,0x1
      c1843c:	48 8d 35 6e fc 71 ff 	lea    rsi,[rip+0xffffffffff71fc6e]        # 3380b1 <_ZTSSt12bad_any_cast@@Base-0x58117>
      c18443:	4c 8d b4 24 b8 00 00 	lea    r14,[rsp+0xb8]
      c1844a:	00 
      c1844b:	4c 89 f7             	mov    rdi,r14
      c1844e:	31 c0                	xor    eax,eax
      c18450:	e8 45 38 bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c18455:	48 89 e7             	mov    rdi,rsp
      c18458:	4c 89 f6             	mov    rsi,r14
      c1845b:	e8 ce 35 e6 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      c18460:	4c 89 f7             	mov    rdi,r14
      c18463:	e8 28 5a bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c18468:	eb 54                	jmp    c184be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16545e>
      c1846a:	41 f6 06 01          	test   BYTE PTR [r14],0x1
      c1846e:	74 12                	je     c18482 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x165422>
      c18470:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
      c18474:	eb 0f                	jmp    c18485 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x165425>
      c18476:	49 ff c6             	inc    r14
      c18479:	48 8d 35 90 0f 73 ff 	lea    rsi,[rip+0xffffffffff730f90]        # 349410 <_ZTSSt12bad_any_cast@@Base-0x46db8>
      c18480:	eb 0a                	jmp    c1848c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16542c>
      c18482:	49 ff c6             	inc    r14
      c18485:	48 8d 35 cb 05 74 ff 	lea    rsi,[rip+0xffffffffff7405cb]        # 358a57 <_ZTSSt12bad_any_cast@@Base-0x37771>
      c1848c:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      c18491:	4c 89 ff             	mov    rdi,r15
      c18494:	4c 89 f2             	mov    rdx,r14
      c18497:	31 c0                	xor    eax,eax
      c18499:	e8 fc 37 bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>

### caller/xfer 0xc18499; FDE=(12681568, 12682769)
      c1846e:	74 12                	je     c18482 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x165422>
      c18470:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
      c18474:	eb 0f                	jmp    c18485 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x165425>
      c18476:	49 ff c6             	inc    r14
      c18479:	48 8d 35 90 0f 73 ff 	lea    rsi,[rip+0xffffffffff730f90]        # 349410 <_ZTSSt12bad_any_cast@@Base-0x46db8>
      c18480:	eb 0a                	jmp    c1848c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16542c>
      c18482:	49 ff c6             	inc    r14
      c18485:	48 8d 35 cb 05 74 ff 	lea    rsi,[rip+0xffffffffff7405cb]        # 358a57 <_ZTSSt12bad_any_cast@@Base-0x37771>
      c1848c:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      c18491:	4c 89 ff             	mov    rdi,r15
      c18494:	4c 89 f2             	mov    rdx,r14
      c18497:	31 c0                	xor    eax,eax
      c18499:	e8 fc 37 bc 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c1849e:	48 89 e7             	mov    rdi,rsp
      c184a1:	4c 89 fe             	mov    rsi,r15
      c184a4:	e8 85 35 e6 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      c184a9:	4c 89 ff             	mov    rdi,r15
      c184ac:	e8 df 59 bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c184b1:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
      c184b8:	00 
      c184b9:	e8 70 ce aa 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      c184be:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
      c184c5:	00 
      c184c6:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0
      c184cb:	48 8d 05 a6 e2 bf 00 	lea    rax,[rip+0xbfe2a6]        # 1816778 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xc438>
      c184d2:	48 89 07             	mov    QWORD PTR [rdi],rax
      c184d5:	48 83 67 28 00       	and    QWORD PTR [rdi+0x28],0x0
      c184da:	0f 57 c0             	xorps  xmm0,xmm0
      c184dd:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      c184e1:	e8 2c 01 00 00       	call   c18612 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1655b2>
      c184e6:	c7 40 20 90 01 00 00 	mov    DWORD PTR [rax+0x20],0x190
      c184ed:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
      c184f1:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]

### caller/xfer 0xc280b3; FDE=(12746100, 12747363)
      c28084:	4c 89 fe             	mov    rsi,r15
      c28087:	e8 9e 24 aa 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
      c2808c:	41 f6 04 24 01       	test   BYTE PTR [r12],0x1
      c28091:	74 07                	je     c2809a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17503a>
      c28093:	48 8b 54 24 38       	mov    rdx,QWORD PTR [rsp+0x38]
      c28098:	eb 05                	jmp    c2809f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17503f>
      c2809a:	48 8d 54 24 29       	lea    rdx,[rsp+0x29]
      c2809f:	48 8d 35 d9 b6 73 ff 	lea    rsi,[rip+0xffffffffff73b6d9]        # 36377f <_ZTSSt12bad_any_cast@@Base-0x2ca49>
      c280a6:	4c 8d bc 24 68 02 00 	lea    r15,[rsp+0x268]
      c280ad:	00 
      c280ae:	4c 89 ff             	mov    rdi,r15
      c280b1:	31 c0                	xor    eax,eax
      c280b3:	e8 e2 3b bb 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c280b8:	4c 89 f7             	mov    rdi,r14
      c280bb:	be 90 01 00 00       	mov    esi,0x190
      c280c0:	4c 89 fa             	mov    rdx,r15
      c280c3:	e8 9c 01 00 00       	call   c28264 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x175204>
      c280c8:	48 8d bc 24 68 02 00 	lea    rdi,[rsp+0x268]
      c280cf:	00 
      c280d0:	e8 bb 5d bc 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c280d5:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      c280da:	e8 b1 5d bc 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c280df:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      c280e4:	e8 23 b3 fe ff       	call   c1340c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1603ac>
      c280e9:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      c280ee:	e8 9d 5d bc 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c280f3:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
      c280fa:	00 
      c280fb:	e8 fe b5 aa 00       	call   16d36fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8786a>
      c28100:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
      c28107:	00 00 
      c28109:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      c2810c:	48 89 df             	mov    rdi,rbx

### caller/xfer 0xc414e8; FDE=(12850220, 12850767)
      c414ba:	b0 01                	mov    al,0x1
      c414bc:	f6 44 24 40 01       	test   BYTE PTR [rsp+0x40],0x1
      c414c1:	74 07                	je     c414ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18e46a>
      c414c3:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
      c414c8:	eb 05                	jmp    c414cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18e46f>
      c414ca:	48 8d 54 24 41       	lea    rdx,[rsp+0x41]
      c414cf:	48 8d 74 24 21       	lea    rsi,[rsp+0x21]
      c414d4:	84 c0                	test   al,al
      c414d6:	48 0f 45 ce          	cmovne rcx,rsi
      c414da:	48 8d 35 03 6c 6f ff 	lea    rsi,[rip+0xffffffffff6f6c03]        # 3380e4 <_ZTSSt12bad_any_cast@@Base-0x580e4>
      c414e1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      c414e6:	31 c0                	xor    eax,eax
      c414e8:	e8 ad a7 b9 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c414ed:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      c414f4:	00 
      c414f5:	48 83 67 f0 00       	and    QWORD PTR [rdi-0x10],0x0
      c414fa:	48 8d 05 af 25 c5 00 	lea    rax,[rip+0xc525af]        # 1893ab0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x9f0>
      c41501:	48 89 47 e8          	mov    QWORD PTR [rdi-0x18],rax
      c41505:	48 8d 05 ec e2 7f ff 	lea    rax,[rip+0xffffffffff7fe2ec]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      c4150c:	48 89 07             	mov    QWORD PTR [rdi],rax
      c4150f:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      c41513:	48 c7 47 f8 01 00 00 	mov    QWORD PTR [rdi-0x8],0x1
      c4151a:	00 
      c4151b:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      c41520:	31 d2                	xor    edx,edx
      c41522:	e8 6b 42 b2 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      c41527:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
      c4152e:	00 
      c4152f:	80 4f f0 02          	or     BYTE PTR [rdi-0x10],0x2
      c41533:	48 8b 57 e8          	mov    rdx,QWORD PTR [rdi-0x18]
      c41537:	f6 c2 01             	test   dl,0x1
      c4153a:	0f 85 92 00 00 00    	jne    c415d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18e572>
      c41540:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]

### caller/xfer 0xc74854; FDE=(13060034, 13062458)
      c74825:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      c7482a:	f6 00 01             	test   BYTE PTR [rax],0x1
      c7482d:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
      c74832:	74 09                	je     c7483d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c17dd>
      c74834:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      c74839:	48 8b 50 10          	mov    rdx,QWORD PTR [rax+0x10]
      c7483d:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]
      c74844:	00 
      c74845:	4c 89 e7             	mov    rdi,r12
      c74848:	48 8d 35 3e 98 6b ff 	lea    rsi,[rip+0xffffffffff6b983e]        # 32e08d <_ZTSSt12bad_any_cast@@Base-0x6213b>
      c7484f:	4c 89 f1             	mov    rcx,r14
      c74852:	31 c0                	xor    eax,eax
      c74854:	e8 41 74 b6 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c74859:	0f 57 c0             	xorps  xmm0,xmm0
      c7485c:	0f 29 84 24 b0 00 00 	movaps XMMWORD PTR [rsp+0xb0],xmm0
      c74863:	00 
      c74864:	48 83 a4 24 c0 00 00 	and    QWORD PTR [rsp+0xc0],0x0
      c7486b:	00 00 
      c7486d:	48 89 df             	mov    rdi,rbx
      c74870:	4c 89 e6             	mov    rsi,r12
      c74873:	e8 24 34 e3 ff       	call   aa7c9c <JNI_OnUnload@@Base+0x2f569>
      c74878:	48 89 df             	mov    rdi,rbx
      c7487b:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
      c74882:	00 
      c74883:	e8 e7 2a 00 00       	call   c7736f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c430f>
      c74888:	41 89 c4             	mov    r12d,eax
      c7488b:	48 89 df             	mov    rdi,rbx
      c7488e:	e8 fd 95 b7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c74893:	45 84 e4             	test   r12b,r12b
      c74896:	0f 84 7c 07 00 00    	je     c75018 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c1fb8>
      c7489c:	0f 57 c0             	xorps  xmm0,xmm0
      c7489f:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      c748a6:	00 

### caller/xfer 0xc75560; FDE=(13063437, 13063557)
      c75536:	48 ff c3             	inc    rbx
      c75539:	0f b6 2a             	movzx  ebp,BYTE PTR [rdx]
      c7553c:	4c 8d 7c 24 07       	lea    r15,[rsp+0x7]
      c75541:	4c 89 ff             	mov    rdi,r15
      c75544:	48 89 d6             	mov    rsi,rdx
      c75547:	e8 e8 2c e3 ff       	call   aa8234 <JNI_OnUnload@@Base+0x2fb01>
      c7554c:	48 8d 35 9b a7 70 ff 	lea    rsi,[rip+0xffffffffff70a79b]        # 37fcee <_ZTSSt12bad_any_cast@@Base-0x104da>
      c75553:	4c 89 f7             	mov    rdi,r14
      c75556:	48 89 da             	mov    rdx,rbx
      c75559:	89 e9                	mov    ecx,ebp
      c7555b:	4d 89 f8             	mov    r8,r15
      c7555e:	31 c0                	xor    eax,eax
      c75560:	e8 35 67 b6 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      c75565:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c7556c:	00 00 
      c7556e:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      c75573:	75 0b                	jne    c75580 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2520>
      c75575:	48 83 c4 38          	add    rsp,0x38
      c75579:	5b                   	pop    rbx
      c7557a:	41 5e                	pop    r14
      c7557c:	41 5f                	pop    r15
      c7557e:	5d                   	pop    rbp
      c7557f:	c3                   	ret
      c75580:	e8 2b a5 b7 00       	call   17efab0 <__stack_chk_fail@plt>
      c75585:	cc                   	int3
      c75586:	55                   	push   rbp
      c75587:	41 57                	push   r15
      c75589:	41 56                	push   r14
      c7558b:	41 55                	push   r13
      c7558d:	41 54                	push   r12
      c7558f:	53                   	push   rbx
      c75590:	48 81 ec 88 02 00 00 	sub    rsp,0x288
      c75597:	48 89 4c 24 78       	mov    QWORD PTR [rsp+0x78],rcx

### caller/xfer 0xd1f69c; FDE=(13759512, 13761120)
      d1f66c:	74 04                	je     d1f672 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26c612>
      d1f66e:	4d 8b 6e 10          	mov    r13,QWORD PTR [r14+0x10]
      d1f672:	f6 44 24 30 01       	test   BYTE PTR [rsp+0x30],0x1
      d1f677:	48 8d 4c 24 31       	lea    rcx,[rsp+0x31]
      d1f67c:	48 8d 9c 24 a0 00 00 	lea    rbx,[rsp+0xa0]
      d1f683:	00 
      d1f684:	74 05                	je     d1f68b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26c62b>
      d1f686:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
      d1f68b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      d1f690:	48 8d 35 3c c1 65 ff 	lea    rsi,[rip+0xffffffffff65c13c]        # 37b7d3 <_ZTSSt12bad_any_cast@@Base-0x149f5>
      d1f697:	4c 89 ea             	mov    rdx,r13
      d1f69a:	31 c0                	xor    eax,eax
      d1f69c:	e8 f9 c5 ab 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      d1f6a1:	48 83 a4 24 a8 00 00 	and    QWORD PTR [rsp+0xa8],0x0
      d1f6a8:	00 00 
      d1f6aa:	48 8d 05 57 4b b7 00 	lea    rax,[rip+0xb74b57]        # 1894208 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1148>
      d1f6b1:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      d1f6b8:	00 
      d1f6b9:	48 8d 05 38 01 72 ff 	lea    rax,[rip+0xffffffffff720138]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d1f6c0:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
      d1f6c7:	00 
      d1f6c8:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      d1f6cf:	00 
      d1f6d0:	48 c7 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],0x1f
      d1f6d7:	00 1f 00 00 00 
      d1f6dc:	48 c7 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],0x5
      d1f6e3:	00 05 00 00 00 
      d1f6e8:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
      d1f6ef:	00 
      d1f6f0:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
      d1f6f5:	31 d2                	xor    edx,edx
      d1f6f7:	e8 96 60 a4 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d1f6fc:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]

### caller/xfer 0xd3779f; FDE=(13858614, 13859222)
      d37767:	48 8b 93 c8 00 00 00 	mov    rdx,QWORD PTR [rbx+0xc8]
      d3776e:	eb 07                	jmp    d37777 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47fd>
      d37770:	48 8d 93 b9 00 00 00 	lea    rdx,[rbx+0xb9]
      d37777:	f6 83 a0 00 00 00 01 	test   BYTE PTR [rbx+0xa0],0x1
      d3777e:	74 09                	je     d37789 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x480f>
      d37780:	48 8b 8b b0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xb0]
      d37787:	eb 07                	jmp    d37790 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4816>
      d37789:	48 8d 8b a1 00 00 00 	lea    rcx,[rbx+0xa1]
      d37790:	48 8d 35 1b ec 60 ff 	lea    rsi,[rip+0xffffffffff60ec1b]        # 3463b2 <_ZTSSt12bad_any_cast@@Base-0x49e16>
      d37797:	49 89 e4             	mov    r12,rsp
      d3779a:	4c 89 e7             	mov    rdi,r12
      d3779d:	31 c0                	xor    eax,eax
      d3779f:	e8 f6 44 aa 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      d377a4:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d377a9:	48 83 67 f0 00       	and    QWORD PTR [rdi-0x10],0x0
      d377ae:	48 8d 05 33 c9 b5 00 	lea    rax,[rip+0xb5c933]        # 18940e8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1028>
      d377b5:	48 89 47 e8          	mov    QWORD PTR [rdi-0x18],rax
      d377b9:	48 8d 05 38 80 70 ff 	lea    rax,[rip+0xffffffffff708038]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d377c0:	48 89 07             	mov    QWORD PTR [rdi],rax
      d377c3:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      d377c7:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      d377cb:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
      d377cf:	0f 57 c0             	xorps  xmm0,xmm0
      d377d2:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
      d377d6:	0f 11 47 2b          	movups XMMWORD PTR [rdi+0x2b],xmm0
      d377da:	48 c7 47 f8 01 00 00 	mov    QWORD PTR [rdi-0x8],0x1
      d377e1:	00 
      d377e2:	4c 89 e6             	mov    rsi,r12
      d377e5:	31 d2                	xor    edx,edx
      d377e7:	e8 a6 df a2 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d377ec:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      d377f1:	80 4f f0 02          	or     BYTE PTR [rdi-0x10],0x2
      d377f5:	48 8d 73 70          	lea    rsi,[rbx+0x70]

### caller/xfer 0xd71150; FDE=(14094302, 14095120)
      d7111d:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
      d71122:	f6 44 24 60 01       	test   BYTE PTR [rsp+0x60],0x1
      d71127:	48 8d 4c 24 61       	lea    rcx,[rsp+0x61]
      d7112c:	74 05                	je     d71133 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e1b9>
      d7112e:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]
      d71133:	f6 44 24 48 01       	test   BYTE PTR [rsp+0x48],0x1
      d71138:	4c 8d 44 24 49       	lea    r8,[rsp+0x49]
      d7113d:	74 05                	je     d71144 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e1ca>
      d7113f:	4c 8b 44 24 58       	mov    r8,QWORD PTR [rsp+0x58]
      d71144:	4c 89 ef             	mov    rdi,r13
      d71147:	48 8d 35 c8 9d 5b ff 	lea    rsi,[rip+0xffffffffff5b9dc8]        # 32af16 <_ZTSSt12bad_any_cast@@Base-0x652b2>
      d7114e:	31 c0                	xor    eax,eax
      d71150:	e8 45 ab a6 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      d71155:	4c 89 ef             	mov    rdi,r13
      d71158:	e8 d9 a6 d0 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      d7115d:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      d71164:	00 
      d71165:	48 89 94 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdx
      d7116c:	00 
      d7116d:	c6 84 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],0x1
      d71174:	01 
      d71175:	4c 8d 3d 79 12 5d ff 	lea    r15,[rip+0xffffffffff5d1279]        # 3423f5 <_ZTSSt12bad_any_cast@@Base-0x4ddd3>
      d7117c:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
      d71183:	00 
      d71184:	48 c7 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],0xb
      d7118b:	00 0b 00 00 00 
      d71190:	48 8b bb 60 07 00 00 	mov    rdi,QWORD PTR [rbx+0x760]
      d71197:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      d7119e:	00 
      d7119f:	48 8d 94 24 90 00 00 	lea    rdx,[rsp+0x90]
      d711a6:	00 
      d711a7:	e8 e4 cb d4 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      d711ac:	4c 89 ef             	mov    rdi,r13

### caller/xfer 0xd79114; FDE=(14124352, 14129483)
      d790e9:	4c 8d 35 63 8b 5b ff 	lea    r14,[rip+0xffffffffff5b8b63]        # 331c53 <_ZTSSt12bad_any_cast@@Base-0x5e575>
      d790f0:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
      d790f5:	f6 45 20 01          	test   BYTE PTR [rbp+0x20],0x1
      d790f9:	74 06                	je     d79101 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46187>
      d790fb:	48 8b 55 30          	mov    rdx,QWORD PTR [rbp+0x30]
      d790ff:	eb 04                	jmp    d79105 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4618b>
      d79101:	48 8d 55 21          	lea    rdx,[rbp+0x21]
      d79105:	4c 8b 6d 40          	mov    r13,QWORD PTR [rbp+0x40]
      d79109:	8b 4d 38             	mov    ecx,DWORD PTR [rbp+0x38]
      d7910c:	4c 89 ff             	mov    rdi,r15
      d7910f:	4c 89 f6             	mov    rsi,r14
      d79112:	31 c0                	xor    eax,eax
      d79114:	e8 81 2b a6 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      d79119:	4c 89 e7             	mov    rdi,r12
      d7911c:	4c 89 fe             	mov    rsi,r15
      d7911f:	e8 3c 19 00 00       	call   d7aa60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47ae6>
      d79124:	4c 89 28             	mov    QWORD PTR [rax],r13
      d79127:	4c 89 ff             	mov    rdi,r15
      d7912a:	e8 61 4d a7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d7912f:	48 89 ef             	mov    rdi,rbp
      d79132:	e8 ab 56 d2 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
      d79137:	48 89 c5             	mov    rbp,rax
      d7913a:	48 39 d8             	cmp    rax,rbx
      d7913d:	75 b6                	jne    d790f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4617b>
      d7913f:	4c 8d b4 24 88 01 00 	lea    r14,[rsp+0x188]
      d79146:	00 
      d79147:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
      d7914c:	0f 57 c0             	xorps  xmm0,xmm0
      d7914f:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      d79152:	48 89 5b f8          	mov    QWORD PTR [rbx-0x8],rbx
      d79156:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d7915b:	48 8d b0 c8 01 00 00 	lea    rsi,[rax+0x1c8]
      d79162:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]

### caller/xfer 0xd791ac; FDE=(14124352, 14129483)
      d79181:	4c 8d 35 cb 8a 5b ff 	lea    r14,[rip+0xffffffffff5b8acb]        # 331c53 <_ZTSSt12bad_any_cast@@Base-0x5e575>
      d79188:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
      d7918d:	f6 45 20 01          	test   BYTE PTR [rbp+0x20],0x1
      d79191:	74 06                	je     d79199 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4621f>
      d79193:	48 8b 55 30          	mov    rdx,QWORD PTR [rbp+0x30]
      d79197:	eb 04                	jmp    d7919d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46223>
      d79199:	48 8d 55 21          	lea    rdx,[rbp+0x21]
      d7919d:	4c 8b 6d 40          	mov    r13,QWORD PTR [rbp+0x40]
      d791a1:	8b 4d 38             	mov    ecx,DWORD PTR [rbp+0x38]
      d791a4:	4c 89 ff             	mov    rdi,r15
      d791a7:	4c 89 f6             	mov    rsi,r14
      d791aa:	31 c0                	xor    eax,eax
      d791ac:	e8 e9 2a a6 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      d791b1:	4c 89 e7             	mov    rdi,r12
      d791b4:	4c 89 fe             	mov    rsi,r15
      d791b7:	e8 a4 18 00 00       	call   d7aa60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47ae6>
      d791bc:	4c 89 28             	mov    QWORD PTR [rax],r13
      d791bf:	4c 89 ff             	mov    rdi,r15
      d791c2:	e8 c9 4c a7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d791c7:	48 89 ef             	mov    rdi,rbp
      d791ca:	e8 13 56 d2 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
      d791cf:	48 89 c5             	mov    rbp,rax
      d791d2:	48 39 d8             	cmp    rax,rbx
      d791d5:	75 b6                	jne    d7918d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46213>
      d791d7:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d791dc:	48 8b 83 e0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1e0]
      d791e3:	48 83 a3 e0 01 00 00 	and    QWORD PTR [rbx+0x1e0],0x0
      d791ea:	00 
      d791eb:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
      d791f2:	00 
      d791f3:	80 8c 24 f1 00 00 00 	or     BYTE PTR [rsp+0xf1],0x80
      d791fa:	80 
      d791fb:	4c 8d 25 7a 8d 6d ff 	lea    r12,[rip+0xffffffffff6d8d7a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>

### caller/xfer 0xd8a75a; FDE=(14198362, 14199941)
      d8a72f:	4c 8d 15 3f 2a 5f ff 	lea    r10,[rip+0xffffffffff5f2a3f]        # 37d175 <_ZTSSt12bad_any_cast@@Base-0x13053>
      d8a736:	48 8d 35 43 29 5e ff 	lea    rsi,[rip+0xffffffffff5e2943]        # 36d080 <_ZTSSt12bad_any_cast@@Base-0x23148>
      d8a73d:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      d8a742:	89 ea                	mov    edx,ebp
      d8a744:	4c 89 e9             	mov    rcx,r13
      d8a747:	4d 89 e0             	mov    r8,r12
      d8a74a:	44 8b 4c 24 10       	mov    r9d,DWORD PTR [rsp+0x10]
      d8a74f:	31 c0                	xor    eax,eax
      d8a751:	41 52                	push   r10
      d8a753:	41 56                	push   r14
      d8a755:	53                   	push   rbx
      d8a756:	ff 74 24 20          	push   QWORD PTR [rsp+0x20]
      d8a75a:	e8 3b 15 a5 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      d8a75f:	48 83 c4 20          	add    rsp,0x20
      d8a763:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d8a768:	48 8d 5c 24 60       	lea    rbx,[rsp+0x60]
      d8a76d:	48 89 de             	mov    rsi,rbx
      d8a770:	e8 b9 12 cf ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      d8a775:	48 89 df             	mov    rdi,rbx
      d8a778:	e9 91 00 00 00       	jmp    d8a80e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57894>
      d8a77d:	48 8d 35 6e dc 5a ff 	lea    rsi,[rip+0xffffffffff5adc6e]        # 3383f2 <_ZTSSt12bad_any_cast@@Base-0x57dd6>
      d8a784:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d8a789:	e8 f2 37 a6 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
      d8a78e:	e9 7d 01 00 00       	jmp    d8a910 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57996>
      d8a793:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
      d8a798:	4c 8d 74 24 28       	lea    r14,[rsp+0x28]
      d8a79d:	4c 89 f7             	mov    rdi,r14
      d8a7a0:	4c 89 fe             	mov    rsi,r15
      d8a7a3:	e8 82 fd 93 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
      d8a7a8:	41 f6 06 01          	test   BYTE PTR [r14],0x1
      d8a7ac:	74 07                	je     d8a7b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5783b>
      d8a7ae:	4c 8b 54 24 38       	mov    r10,QWORD PTR [rsp+0x38]
      d8a7b3:	eb 05                	jmp    d8a7ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57840>

### caller/xfer 0xd8a7e6; FDE=(14198362, 14199941)
      d8a7bf:	44 8b 4c 24 10       	mov    r9d,DWORD PTR [rsp+0x10]
      d8a7c4:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
      d8a7c9:	48 8d 35 b0 28 5e ff 	lea    rsi,[rip+0xffffffffff5e28b0]        # 36d080 <_ZTSSt12bad_any_cast@@Base-0x23148>
      d8a7d0:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      d8a7d5:	89 ea                	mov    edx,ebp
      d8a7d7:	4c 89 e9             	mov    rcx,r13
      d8a7da:	4d 89 e0             	mov    r8,r12
      d8a7dd:	31 c0                	xor    eax,eax
      d8a7df:	41 52                	push   r10
      d8a7e1:	41 56                	push   r14
      d8a7e3:	53                   	push   rbx
      d8a7e4:	41 53                	push   r11
      d8a7e6:	e8 af 14 a5 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      d8a7eb:	48 83 c4 20          	add    rsp,0x20
      d8a7ef:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d8a7f4:	48 8d 5c 24 60       	lea    rbx,[rsp+0x60]
      d8a7f9:	48 89 de             	mov    rsi,rbx
      d8a7fc:	e8 2d 12 cf ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      d8a801:	48 89 df             	mov    rdi,rbx
      d8a804:	e8 87 36 a6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d8a809:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      d8a80e:	e8 7d 36 a6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d8a813:	0f 57 c0             	xorps  xmm0,xmm0
      d8a816:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
      d8a81b:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      d8a81e:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      d8a823:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      d8a827:	48 8d b8 e0 04 00 00 	lea    rdi,[rax+0x4e0]
      d8a82e:	4c 89 fe             	mov    rsi,r15
      d8a831:	e8 c9 ea ff ff       	call   d892ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56385>
      d8a836:	4c 8b 20             	mov    r12,QWORD PTR [rax]
      d8a839:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      d8a83d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax

### caller/xfer 0xd8a8bf; FDE=(14198362, 14199941)
      d8a890:	ff 90 00 01 00 00    	call   QWORD PTR [rax+0x100]
      d8a896:	41 0f b6 ce          	movzx  ecx,r14b
      d8a89a:	45 0f b6 c7          	movzx  r8d,r15b
      d8a89e:	45 0f b6 cd          	movzx  r9d,r13b
      d8a8a2:	44 0f b6 d0          	movzx  r10d,al
      d8a8a6:	48 83 ec 08          	sub    rsp,0x8
      d8a8aa:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
      d8a8af:	48 89 df             	mov    rdi,rbx
      d8a8b2:	48 8d 35 d9 f4 5e ff 	lea    rsi,[rip+0xffffffffff5ef4d9]        # 379d92 <_ZTSSt12bad_any_cast@@Base-0x16436>
      d8a8b9:	89 ea                	mov    edx,ebp
      d8a8bb:	31 c0                	xor    eax,eax
      d8a8bd:	41 52                	push   r10
      d8a8bf:	e8 d6 13 a5 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      d8a8c4:	48 83 c4 10          	add    rsp,0x10
      d8a8c8:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d8a8cd:	48 89 de             	mov    rsi,rbx
      d8a8d0:	e8 67 da d1 ff       	call   aa833c <JNI_OnUnload@@Base+0x2fc09>
      d8a8d5:	48 89 df             	mov    rdi,rbx
      d8a8d8:	e8 b3 35 a6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d8a8dd:	49 83 c4 08          	add    r12,0x8
      d8a8e1:	4c 3b 64 24 08       	cmp    r12,QWORD PTR [rsp+0x8]
      d8a8e6:	0f 85 5f ff ff ff    	jne    d8a84b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x578d1>
      d8a8ec:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      d8a8f1:	e8 06 4d d1 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
      d8a8f6:	48 8d 35 93 11 5c ff 	lea    rsi,[rip+0xffffffffff5c1193]        # 34ba90 <_ZTSSt12bad_any_cast@@Base-0x44738>
      d8a8fd:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d8a902:	e8 b9 36 a6 00       	call   17edfc0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKc@plt>
      d8a907:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
      d8a90c:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
      d8a910:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d8a915:	e8 a6 4d d1 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
      d8a91a:	49 89 c7             	mov    r15,rax
      d8a91d:	49 8d 86 30 05 00 00 	lea    rax,[r14+0x530]

### caller/xfer 0xdacbb4; FDE=(14337790, 14339188)
      dacb8c:	eb 56                	jmp    dacbe4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79c6a>
      dacb8e:	41 f6 c4 01          	test   r12b,0x1
      dacb92:	74 06                	je     dacb9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79c20>
      dacb94:	4d 8b 7f 10          	mov    r15,QWORD PTR [r15+0x10]
      dacb98:	eb 03                	jmp    dacb9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79c23>
      dacb9a:	49 ff c7             	inc    r15
      dacb9d:	48 8d 35 1a 5d 5b ff 	lea    rsi,[rip+0xffffffffff5b5d1a]        # 3628be <_ZTSSt12bad_any_cast@@Base-0x2d90a>
      dacba4:	4c 8d b4 24 00 01 00 	lea    r14,[rsp+0x100]
      dacbab:	00 
      dacbac:	4c 89 f7             	mov    rdi,r14
      dacbaf:	4c 89 fa             	mov    rdx,r15
      dacbb2:	31 c0                	xor    eax,eax
      dacbb4:	e8 e1 f0 a2 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      dacbb9:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      dacbbd:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      dacbc1:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
      dacbc5:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
      dacbc9:	0f 57 c0             	xorps  xmm0,xmm0
      dacbcc:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      dacbd1:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      dacbd5:	83 a3 90 00 00 00 00 	and    DWORD PTR [rbx+0x90],0x0
      dacbdc:	4c 89 f7             	mov    rdi,r14
      dacbdf:	e8 ac 12 a4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dacbe4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      dacbeb:	00 00 
      dacbed:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
      dacbf4:	00 
      dacbf5:	75 78                	jne    dacc6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79cf5>
      dacbf7:	48 81 c4 f8 01 00 00 	add    rsp,0x1f8
      dacbfe:	5b                   	pop    rbx
      dacbff:	41 5c                	pop    r12
      dacc01:	41 5d                	pop    r13
      dacc03:	41 5e                	pop    r14

### caller/xfer 0xdb675a; FDE=(14376564, 14379773)
      db6736:	41 5d                	pop    r13
      db6738:	41 5e                	pop    r14
      db673a:	41 5f                	pop    r15
      db673c:	5d                   	pop    rbp
      db673d:	c3                   	ret
      db673e:	48 8d 54 24 69       	lea    rdx,[rsp+0x69]
      db6743:	48 8d 35 0a 37 5c ff 	lea    rsi,[rip+0xffffffffff5c370a]        # 379e54 <_ZTSSt12bad_any_cast@@Base-0x16374>
      db674a:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
      db6751:	00 
      db6752:	48 89 d9             	mov    rcx,rbx
      db6755:	41 89 c0             	mov    r8d,eax
      db6758:	31 c0                	xor    eax,eax
      db675a:	e8 3b 55 a2 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      db675f:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      db6764:	48 83 67 f0 00       	and    QWORD PTR [rdi-0x10],0x0
      db6769:	48 8d 05 90 f0 ad 00 	lea    rax,[rip+0xadf090]        # 1895800 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x2740>
      db6770:	48 89 47 e8          	mov    QWORD PTR [rdi-0x18],rax
      db6774:	48 8d 05 7d 90 68 ff 	lea    rax,[rip+0xffffffffff68907d]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      db677b:	48 89 07             	mov    QWORD PTR [rdi],rax
      db677e:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      db6782:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      db6786:	48 83 67 18 00       	and    QWORD PTR [rdi+0x18],0x0
      db678b:	48 c7 47 f8 01 00 00 	mov    QWORD PTR [rdi-0x8],0x1
      db6792:	00 
      db6793:	48 8d 35 31 34 59 ff 	lea    rsi,[rip+0xffffffffff593431]        # 349bcb <_ZTSSt12bad_any_cast@@Base-0x465fd>
      db679a:	31 d2                	xor    edx,edx
      db679c:	e8 b1 f5 d4 ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
      db67a1:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      db67a6:	80 4f f0 02          	or     BYTE PTR [rdi-0x10],0x2
      db67aa:	48 8b 57 e8          	mov    rdx,QWORD PTR [rdi-0x18]
      db67ae:	f6 c2 01             	test   dl,0x1
      db67b1:	0f 85 28 01 00 00    	jne    db68df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83965>
      db67b7:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]

### caller/xfer 0xdb70a9; FDE=(14380256, 14381941)
      db7071:	44 8b 83 78 06 00 00 	mov    r8d,DWORD PTR [rbx+0x678]
      db7078:	f6 83 80 06 00 00 01 	test   BYTE PTR [rbx+0x680],0x1
      db707f:	74 09                	je     db708a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84110>
      db7081:	48 8b 83 90 06 00 00 	mov    rax,QWORD PTR [rbx+0x690]
      db7088:	eb 07                	jmp    db7091 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84117>
      db708a:	48 8d 83 81 06 00 00 	lea    rax,[rbx+0x681]
      db7091:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      db7095:	48 8d 35 e5 32 5d ff 	lea    rsi,[rip+0xffffffffff5d32e5]        # 38a381 <_ZTSSt12bad_any_cast@@Base-0x5e47>
      db709c:	4c 8d bc 24 b0 01 00 	lea    r15,[rsp+0x1b0]
      db70a3:	00 
      db70a4:	4c 89 ff             	mov    rdi,r15
      db70a7:	31 c0                	xor    eax,eax
      db70a9:	e8 ec 4b a2 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      db70ae:	c7 84 24 20 01 00 00 	mov    DWORD PTR [rsp+0x120],0x2
      db70b5:	02 00 00 00 
      db70b9:	4c 89 f7             	mov    rdi,r14
      db70bc:	4c 89 fe             	mov    rsi,r15
      db70bf:	31 d2                	xor    edx,edx
      db70c1:	e8 20 e7 9a 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      db70c6:	4c 8d b4 24 38 01 00 	lea    r14,[rsp+0x138]
      db70cd:	00 
      db70ce:	4c 8d bc 24 b0 01 00 	lea    r15,[rsp+0x1b0]
      db70d5:	00 
      db70d6:	4c 89 ff             	mov    rdi,r15
      db70d9:	e8 b2 6d a3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      db70de:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
      db70e3:	41 8b 46 e8          	mov    eax,DWORD PTR [r14-0x18]
      db70e7:	0f 10 83 e0 05 00 00 	movups xmm0,XMMWORD PTR [rbx+0x5e0]
      db70ee:	41 0f 11 47 01       	movups XMMWORD PTR [r15+0x1],xmm0
      db70f3:	41 c6 07 20          	mov    BYTE PTR [r15],0x20
      db70f7:	41 c6 47 11 00       	mov    BYTE PTR [r15+0x11],0x0
      db70fc:	83 c8 0c             	or     eax,0xc
      db70ff:	41 89 46 e8          	mov    DWORD PTR [r14-0x18],eax

### caller/xfer 0xdba6a1; FDE=(14394414, 14396039)
      dba675:	42 f6 04 33 01       	test   BYTE PTR [rbx+r14*1],0x1
      dba67a:	74 06                	je     dba682 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87708>
      dba67c:	4d 8b 7f 10          	mov    r15,QWORD PTR [r15+0x10]
      dba680:	eb 03                	jmp    dba685 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8770b>
      dba682:	49 ff c7             	inc    r15
      dba685:	4c 8d b4 24 a8 00 00 	lea    r14,[rsp+0xa8]
      dba68c:	00 
      dba68d:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
      dba691:	48 8d 35 d3 5d 5b ff 	lea    rsi,[rip+0xffffffffff5b5dd3]        # 37046b <_ZTSSt12bad_any_cast@@Base-0x1fd5d>
      dba698:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      dba69d:	89 e9                	mov    ecx,ebp
      dba69f:	31 c0                	xor    eax,eax
      dba6a1:	e8 f4 15 a2 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      dba6a6:	41 80 4e f0 02       	or     BYTE PTR [r14-0x10],0x2
      dba6ab:	49 8b 56 e8          	mov    rdx,QWORD PTR [r14-0x18]
      dba6af:	f6 c2 01             	test   dl,0x1
      dba6b2:	0f 85 31 03 00 00    	jne    dba9e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87a6f>
      dba6b8:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      dba6bd:	4c 89 f7             	mov    rdi,r14
      dba6c0:	e8 21 b1 9a 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      dba6c5:	4c 8d b4 24 b0 00 00 	lea    r14,[rsp+0xb0]
      dba6cc:	00 
      dba6cd:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
      dba6d2:	4c 89 ff             	mov    rdi,r15
      dba6d5:	e8 b6 37 a3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dba6da:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      dba6df:	e8 ac 37 a3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dba6e4:	48 63 44 24 20       	movsxd rax,DWORD PTR [rsp+0x20]
      dba6e9:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      dba6ed:	41 8b 46 e8          	mov    eax,DWORD PTR [r14-0x18]
      dba6f1:	0f 10 83 d0 02 00 00 	movups xmm0,XMMWORD PTR [rbx+0x2d0]
      dba6f8:	41 0f 11 47 01       	movups XMMWORD PTR [r15+0x1],xmm0
      dba6fd:	41 c6 07 20          	mov    BYTE PTR [r15],0x20

### caller/xfer 0xdbb1fb; FDE=(14397204, 14398328)
      dbb1cf:	74 06                	je     dbb1d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8825d>
      dbb1d1:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
      dbb1d5:	eb 04                	jmp    dbb1db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x88261>
      dbb1d7:	48 8d 43 09          	lea    rax,[rbx+0x9]
      dbb1db:	4c 8d 6c 24 78       	lea    r13,[rsp+0x78]
      dbb1e0:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      dbb1e4:	48 8d 35 b2 b2 5a ff 	lea    rsi,[rip+0xffffffffff5ab2b2]        # 36649d <_ZTSSt12bad_any_cast@@Base-0x29d2b>
      dbb1eb:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      dbb1f2:	00 
      dbb1f3:	4c 89 e2             	mov    rdx,r12
      dbb1f6:	4c 89 f9             	mov    rcx,r15
      dbb1f9:	31 c0                	xor    eax,eax
      dbb1fb:	e8 9a 0a a2 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      dbb200:	41 80 4d f0 02       	or     BYTE PTR [r13-0x10],0x2
      dbb205:	49 8b 55 e8          	mov    rdx,QWORD PTR [r13-0x18]
      dbb209:	f6 c2 01             	test   dl,0x1
      dbb20c:	0f 85 d8 00 00 00    	jne    dbb2ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x88370>
      dbb212:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
      dbb219:	00 
      dbb21a:	4c 89 ef             	mov    rdi,r13
      dbb21d:	e8 c4 a5 9a 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      dbb222:	4c 8d bc 24 80 00 00 	lea    r15,[rsp+0x80]
      dbb229:	00 
      dbb22a:	4c 8d a4 24 90 00 00 	lea    r12,[rsp+0x90]
      dbb231:	00 
      dbb232:	4c 89 e7             	mov    rdi,r12
      dbb235:	e8 56 2c a3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dbb23a:	49 83 67 08 00       	and    QWORD PTR [r15+0x8],0x0
      dbb23f:	41 8b 47 e8          	mov    eax,DWORD PTR [r15-0x18]
      dbb243:	41 0f 10 86 d0 02 00 	movups xmm0,XMMWORD PTR [r14+0x2d0]
      dbb24a:	00 
      dbb24b:	41 0f 11 44 24 01    	movups XMMWORD PTR [r12+0x1],xmm0
      dbb251:	41 c6 04 24 20       	mov    BYTE PTR [r12],0x20

### caller/xfer 0xdbb8b5; FDE=(14399422, 14400009)
      dbb884:	4d 8d 8f 79 02 00 00 	lea    r9,[r15+0x279]
      dbb88b:	44 8b 00             	mov    r8d,DWORD PTR [rax]
      dbb88e:	f6 40 08 01          	test   BYTE PTR [rax+0x8],0x1
      dbb892:	74 06                	je     dbb89a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x88920>
      dbb894:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
      dbb898:	eb 04                	jmp    dbb89e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x88924>
      dbb89a:	48 83 c0 09          	add    rax,0x9
      dbb89e:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
      dbb8a3:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      dbb8a7:	48 8d 35 d3 ea 5c ff 	lea    rsi,[rip+0xffffffffff5cead3]        # 38a381 <_ZTSSt12bad_any_cast@@Base-0x5e47>
      dbb8ae:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      dbb8b3:	31 c0                	xor    eax,eax
      dbb8b5:	e8 e0 03 a2 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      dbb8ba:	80 4b f0 02          	or     BYTE PTR [rbx-0x10],0x2
      dbb8be:	48 8b 53 e8          	mov    rdx,QWORD PTR [rbx-0x18]
      dbb8c2:	f6 c2 01             	test   dl,0x1
      dbb8c5:	0f 85 cf 00 00 00    	jne    dbb99a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x88a20>
      dbb8cb:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
      dbb8d0:	48 89 df             	mov    rdi,rbx
      dbb8d3:	e8 0e 9f 9a 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      dbb8d8:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
      dbb8dd:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
      dbb8e2:	4c 89 f7             	mov    rdi,r14
      dbb8e5:	e8 a6 25 a3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dbb8ea:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
      dbb8ef:	8b 43 e8             	mov    eax,DWORD PTR [rbx-0x18]
      dbb8f2:	41 0f 10 87 d0 02 00 	movups xmm0,XMMWORD PTR [r15+0x2d0]
      dbb8f9:	00 
      dbb8fa:	41 0f 11 46 01       	movups XMMWORD PTR [r14+0x1],xmm0
      dbb8ff:	41 c6 06 20          	mov    BYTE PTR [r14],0x20
      dbb903:	41 c6 46 11 00       	mov    BYTE PTR [r14+0x11],0x0
      dbb908:	83 c8 0c             	or     eax,0xc
      dbb90b:	89 43 e8             	mov    DWORD PTR [rbx-0x18],eax

### caller/xfer 0xdd6a69; FDE=(14508954, 14511121)
      dd6a3b:	eb 2a                	jmp    dd6a67 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa3aed>
      dd6a3d:	41 f6 04 24 01       	test   BYTE PTR [r12],0x1
      dd6a42:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
      dd6a47:	74 05                	je     dd6a4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa3ad4>
      dd6a49:	49 8b 4c 24 10       	mov    rcx,QWORD PTR [r12+0x10]
      dd6a4e:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
      dd6a52:	4c 89 ef             	mov    rdi,r13
      dd6a55:	48 8d 35 d1 6a 57 ff 	lea    rsi,[rip+0xffffffffff576ad1]        # 34d52d <_ZTSSt12bad_any_cast@@Base-0x42c9b>
      dd6a5c:	8b 54 24 30          	mov    edx,DWORD PTR [rsp+0x30]
      dd6a60:	89 c1                	mov    ecx,eax
      dd6a62:	44 8b 44 24 20       	mov    r8d,DWORD PTR [rsp+0x20]
      dd6a67:	31 c0                	xor    eax,eax
      dd6a69:	e8 2c 52 a0 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      dd6a6e:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
      dd6a72:	4c 01 ff             	add    rdi,r15
      dd6a75:	4c 89 ee             	mov    rsi,r13
      dd6a78:	e8 b1 4f ca ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      dd6a7d:	4c 89 ef             	mov    rdi,r13
      dd6a80:	e8 0b 74 a1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dd6a85:	49 ff c6             	inc    r14
      dd6a88:	49 81 c7 a0 00 00 00 	add    r15,0xa0
      dd6a8f:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      dd6a94:	48 83 c0 20          	add    rax,0x20
      dd6a98:	4c 3b 75 10          	cmp    r14,QWORD PTR [rbp+0x10]
      dd6a9c:	0f 82 d9 fe ff ff    	jb     dd697b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa3a01>
      dd6aa2:	48 81 c5 60 01 00 00 	add    rbp,0x160
      dd6aa9:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      dd6aae:	e8 33 d3 d5 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
      dd6ab3:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      dd6ab8:	e8 6b 4c ca ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      dd6abd:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      dd6ac4:	00 
      dd6ac5:	e8 d0 03 cd ff       	call   aa6e9a <JNI_OnUnload@@Base+0x2e767>

### caller/xfer 0xde1eec; FDE=(14556706, 14557230)
      de1ebc:	49 8b 07             	mov    rax,QWORD PTR [r15]
      de1ebf:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      de1ec4:	4c 89 ff             	mov    rdi,r15
      de1ec7:	ff 50 18             	call   QWORD PTR [rax+0x18]
      de1eca:	0f 57 c0             	xorps  xmm0,xmm0
      de1ecd:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      de1ed2:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
      de1ed8:	eb 17                	jmp    de1ef1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaef77>
      de1eda:	48 83 ca 01          	or     rdx,0x1
      de1ede:	48 8d 35 76 25 54 ff 	lea    rsi,[rip+0xffffffffff542576]        # 32445b <_ZTSSt12bad_any_cast@@Base-0x6bd6d>
      de1ee5:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      de1eea:	31 c0                	xor    eax,eax
      de1eec:	e8 a9 9d 9f 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      de1ef1:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      de1ef6:	e8 33 34 8e 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      de1efb:	0f b6 44 24 20       	movzx  eax,BYTE PTR [rsp+0x20]
      de1f00:	a8 01                	test   al,0x1
      de1f02:	74 07                	je     de1f0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaef91>
      de1f04:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      de1f09:	eb 02                	jmp    de1f0d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaef93>
      de1f0b:	d1 e8                	shr    eax,1
      de1f0d:	4d 8b 36             	mov    r14,QWORD PTR [r14]
      de1f10:	48 85 c0             	test   rax,rax
      de1f13:	74 6d                	je     de1f82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf008>
      de1f15:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      de1f1a:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      de1f1f:	e8 1c c0 a0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      de1f24:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      de1f29:	48 83 67 f0 00       	and    QWORD PTR [rdi-0x10],0x0
      de1f2e:	48 8d 05 bb 92 a4 00 	lea    rax,[rip+0xa492bb]        # 182b1f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7820>
      de1f35:	48 89 47 e8          	mov    QWORD PTR [rdi-0x18],rax
      de1f39:	48 8d 05 b8 d8 65 ff 	lea    rax,[rip+0xffffffffff65d8b8]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      de1f40:	48 89 07             	mov    QWORD PTR [rdi],rax

### caller/xfer 0xde3faf; FDE=(14565110, 14565878)
      de3f81:	f6 44 24 20 01       	test   BYTE PTR [rsp+0x20],0x1
      de3f86:	74 16                	je     de3f9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1024>
      de3f88:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
      de3f8d:	eb 14                	jmp    de3fa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1029>
      de3f8f:	0f 57 c0             	xorps  xmm0,xmm0
      de3f92:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      de3f96:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
      de3f9c:	eb 16                	jmp    de3fb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb103a>
      de3f9e:	48 8d 54 24 21       	lea    rdx,[rsp+0x21]
      de3fa3:	48 8d 35 8b 5c 56 ff 	lea    rsi,[rip+0xffffffffff565c8b]        # 349c35 <_ZTSSt12bad_any_cast@@Base-0x46593>
      de3faa:	48 89 e7             	mov    rdi,rsp
      de3fad:	31 c0                	xor    eax,eax
      de3faf:	e8 e6 7c 9f 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      de3fb4:	6a 50                	push   0x50
      de3fb6:	5f                   	pop    rdi
      de3fb7:	e8 44 9f a0 00       	call   17edf00 <_Znwm@plt>
      de3fbc:	48 89 c3             	mov    rbx,rax
      de3fbf:	41 8a 6f 28          	mov    bpl,BYTE PTR [r15+0x28]
      de3fc3:	48 8d 05 a6 01 a8 00 	lea    rax,[rip+0xa801a6]        # 1864170 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20858>
      de3fca:	48 89 03             	mov    QWORD PTR [rbx],rax
      de3fcd:	4c 8d 44 24 38       	lea    r8,[rsp+0x38]
      de3fd2:	49 89 18             	mov    QWORD PTR [r8],rbx
      de3fd5:	48 8d 35 b5 90 cb ff 	lea    rsi,[rip+0xffffffffffcb90b5]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      de3fdc:	48 8d 0d 6d 3f 52 00 	lea    rcx,[rip+0x523f6d]        # 1307f50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d4d4>
      de3fe3:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
      de3fe8:	6a 08                	push   0x8
      de3fea:	41 59                	pop    r9
      de3fec:	4c 89 ff             	mov    rdi,r15
      de3fef:	31 d2                	xor    edx,edx
      de3ff1:	e8 9e 67 9f 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      de3ff6:	49 8b 06             	mov    rax,QWORD PTR [r14]
      de3ff9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      de3ffe:	4c 89 f6             	mov    rsi,r14

### caller/xfer 0xde7b6c; FDE=(14579182, 14583796)
      de7b40:	74 0a                	je     de7b4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb4bd2>
      de7b42:	48 8b 84 24 60 0b 00 	mov    rax,QWORD PTR [rsp+0xb60]
      de7b49:	00 
      de7b4a:	eb 08                	jmp    de7b54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb4bda>
      de7b4c:	48 8d 84 24 51 0b 00 	lea    rax,[rsp+0xb51]
      de7b53:	00 
      de7b54:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      de7b58:	48 8d 35 59 de 53 ff 	lea    rsi,[rip+0xffffffffff53de59]        # 3259b8 <_ZTSSt12bad_any_cast@@Base-0x6a810>
      de7b5f:	48 8d 9c 24 20 05 00 	lea    rbx,[rsp+0x520]
      de7b66:	00 
      de7b67:	48 89 df             	mov    rdi,rbx
      de7b6a:	31 c0                	xor    eax,eax
      de7b6c:	e8 29 41 9f 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      de7b71:	48 8d bc 24 60 06 00 	lea    rdi,[rsp+0x660]
      de7b78:	00 
      de7b79:	e8 12 63 a0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      de7b7e:	48 8d bc 24 20 0b 00 	lea    rdi,[rsp+0xb20]
      de7b85:	00 
      de7b86:	e8 d3 0d ce ff       	call   ac895e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x158fe>
      de7b8b:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
      de7b92:	00 
      de7b93:	48 89 de             	mov    rsi,rbx
      de7b96:	e8 93 3e c9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      de7b9b:	48 89 df             	mov    rdi,rbx
      de7b9e:	e8 ed 62 a0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      de7ba3:	49 8b 06             	mov    rax,QWORD PTR [r14]
      de7ba6:	80 b8 90 02 00 00 00 	cmp    BYTE PTR [rax+0x290],0x0
      de7bad:	74 21                	je     de7bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb4c56>
      de7baf:	4c 69 a0 88 02 00 00 	imul   r12,QWORD PTR [rax+0x288],0x3e8
      de7bb6:	e8 03 00 00 
      de7bba:	4d 89 e5             	mov    r13,r12
      de7bbd:	49 81 e5 00 ff ff ff 	and    r13,0xffffffffffffff00
      de7bc4:	b1 01                	mov    cl,0x1

### caller/xfer 0xdf5fe6; FDE=(14637849, 14641021)
      df5fb2:	41 80 7e 30 00       	cmp    BYTE PTR [r14+0x30],0x0
      df5fb7:	48 8d 15 61 18 55 ff 	lea    rdx,[rip+0xffffffffff551861]        # 34781f <_ZTSSt12bad_any_cast@@Base-0x489a9>
      df5fbe:	48 8d 05 ed 23 58 ff 	lea    rax,[rip+0xffffffffff5823ed]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      df5fc5:	48 0f 44 d0          	cmove  rdx,rax
      df5fc9:	41 f6 46 18 01       	test   BYTE PTR [r14+0x18],0x1
      df5fce:	74 06                	je     df5fd6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc305c>
      df5fd0:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
      df5fd4:	eb 04                	jmp    df5fda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3060>
      df5fd6:	49 8d 4e 19          	lea    rcx,[r14+0x19]
      df5fda:	4c 89 ef             	mov    rdi,r13
      df5fdd:	48 8d 35 ef 57 58 ff 	lea    rsi,[rip+0xffffffffff5857ef]        # 37b7d3 <_ZTSSt12bad_any_cast@@Base-0x149f5>
      df5fe4:	31 c0                	xor    eax,eax
      df5fe6:	e8 af 5c 9e 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      df5feb:	41 80 4c 24 10 01    	or     BYTE PTR [r12+0x10],0x1
      df5ff1:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
      df5ff6:	f6 c2 01             	test   dl,0x1
      df5ff9:	75 71                	jne    df606c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc30f2>
      df5ffb:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
      df6000:	4c 89 ee             	mov    rsi,r13
      df6003:	e8 de f7 96 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      df6008:	4c 89 ef             	mov    rdi,r13
      df600b:	e8 80 7e 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      df6010:	41 8a 46 31          	mov    al,BYTE PTR [r14+0x31]
      df6014:	41 88 44 24 2c       	mov    BYTE PTR [r12+0x2c],al
      df6019:	41 8b 44 24 10       	mov    eax,DWORD PTR [r12+0x10]
      df601e:	89 c1                	mov    ecx,eax
      df6020:	83 c9 08             	or     ecx,0x8
      df6023:	41 89 4c 24 10       	mov    DWORD PTR [r12+0x10],ecx
      df6028:	41 8b 56 50          	mov    edx,DWORD PTR [r14+0x50]
      df602c:	83 fa 04             	cmp    edx,0x4
      df602f:	77 0a                	ja     df603b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc30c1>
      df6031:	41 89 54 24 30       	mov    DWORD PTR [r12+0x30],edx
      df6036:	83 c8 18             	or     eax,0x18

### caller/xfer 0xe02815; FDE=(14689918, 14692393)
      e027e9:	e8 e4 40 9d 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e027ee:	6a 09                	push   0x9
      e027f0:	5e                   	pop    rsi
      e027f1:	4c 89 ff             	mov    rdi,r15
      e027f4:	e8 e5 25 00 00       	call   e04dde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1e64>
      e027f9:	31 db                	xor    ebx,ebx
      e027fb:	e9 cc 05 00 00       	jmp    e02dcc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfe52>
      e02800:	48 83 c2 29          	add    rdx,0x29
      e02804:	48 8d 35 d3 55 52 ff 	lea    rsi,[rip+0xffffffffff5255d3]        # 327dde <_ZTSSt12bad_any_cast@@Base-0x683ea>
      e0280b:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e02812:	00 
      e02813:	31 c0                	xor    eax,eax
      e02815:	e8 80 94 9d 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e0281a:	83 3d 97 71 b2 00 06 	cmp    DWORD PTR [rip+0xb27197],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e02821:	7c 39                	jl     e0285c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf8e2>
      e02823:	f6 84 24 70 06 00 00 	test   BYTE PTR [rsp+0x670],0x1
      e0282a:	01 
      e0282b:	74 0a                	je     e02837 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf8bd>
      e0282d:	4c 8b 84 24 80 06 00 	mov    r8,QWORD PTR [rsp+0x680]
      e02834:	00 
      e02835:	eb 08                	jmp    e0283f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf8c5>
      e02837:	4c 8d 84 24 71 06 00 	lea    r8,[rsp+0x671]
      e0283e:	00 
      e0283f:	48 8d 35 36 f7 64 ff 	lea    rsi,[rip+0xffffffffff64f736]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e02846:	48 8d 0d c2 c4 54 ff 	lea    rcx,[rip+0xffffffffff54c4c2]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e0284d:	6a 06                	push   0x6
      e0284f:	5f                   	pop    rdi
      e02850:	ba 72 01 00 00       	mov    edx,0x172
      e02855:	31 c0                	xor    eax,eax
      e02857:	e8 76 40 9d 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e0285c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      e0285f:	48 85 ff             	test   rdi,rdi
      e02862:	74 45                	je     e028a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf92f>

### caller/xfer 0xe02cd0; FDE=(14689918, 14692393)
      e02ca3:	74 0a                	je     e02caf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfd35>
      e02ca5:	48 8b 94 24 60 03 00 	mov    rdx,QWORD PTR [rsp+0x360]
      e02cac:	00 
      e02cad:	eb 08                	jmp    e02cb7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfd3d>
      e02caf:	48 8d 94 24 51 03 00 	lea    rdx,[rsp+0x351]
      e02cb6:	00 
      e02cb7:	48 8d 9c 24 a8 01 00 	lea    rbx,[rsp+0x1a8]
      e02cbe:	00 
      e02cbf:	48 8d 35 3a 75 56 ff 	lea    rsi,[rip+0xffffffffff56753a]        # 36a200 <_ZTSSt12bad_any_cast@@Base-0x25fc8>
      e02cc6:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e02ccd:	00 
      e02cce:	31 c0                	xor    eax,eax
      e02cd0:	e8 c5 8f 9d 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e02cd5:	83 3d dc 6c b2 00 06 	cmp    DWORD PTR [rip+0xb26cdc],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e02cdc:	7c 39                	jl     e02d17 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfd9d>
      e02cde:	f6 84 24 70 06 00 00 	test   BYTE PTR [rsp+0x670],0x1
      e02ce5:	01 
      e02ce6:	74 0a                	je     e02cf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfd78>
      e02ce8:	4c 8b 84 24 80 06 00 	mov    r8,QWORD PTR [rsp+0x680]
      e02cef:	00 
      e02cf0:	eb 08                	jmp    e02cfa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfd80>
      e02cf2:	4c 8d 84 24 71 06 00 	lea    r8,[rsp+0x671]
      e02cf9:	00 
      e02cfa:	48 8d 35 7b f2 64 ff 	lea    rsi,[rip+0xffffffffff64f27b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e02d01:	48 8d 0d 07 c0 54 ff 	lea    rcx,[rip+0xffffffffff54c007]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e02d08:	6a 06                	push   0x6
      e02d0a:	5f                   	pop    rdi
      e02d0b:	ba c9 01 00 00       	mov    edx,0x1c9
      e02d10:	31 c0                	xor    eax,eax
      e02d12:	e8 bb 3b 9d 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e02d17:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      e02d1a:	48 85 ff             	test   rdi,rdi
      e02d1d:	74 45                	je     e02d64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfdea>

### caller/xfer 0xe1f199; FDE=(14807336, 14807642)
      e1f16f:	eb 05                	jmp    e1f176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec1fc>
      e1f171:	48 8d 54 24 09       	lea    rdx,[rsp+0x9]
      e1f176:	41 8b 06             	mov    eax,DWORD PTR [r14]
      e1f179:	ff c8                	dec    eax
      e1f17b:	83 f8 fe             	cmp    eax,0xfffffffe
      e1f17e:	0f 92 c0             	setb   al
      e1f181:	41 22 46 0c          	and    al,BYTE PTR [r14+0xc]
      e1f185:	0f b6 c8             	movzx  ecx,al
      e1f188:	48 8d 35 ac 42 56 ff 	lea    rsi,[rip+0xffffffffff5642ac]        # 38343b <_ZTSSt12bad_any_cast@@Base-0xcd8d>
      e1f18f:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
      e1f194:	4c 89 ef             	mov    rdi,r13
      e1f197:	31 c0                	xor    eax,eax
      e1f199:	e8 fc ca 9b 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e1f19e:	4c 89 e7             	mov    rdi,r12
      e1f1a1:	4c 89 ee             	mov    rsi,r13
      e1f1a4:	e8 f3 03 00 00       	call   e1f59c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec622>
      e1f1a9:	4c 89 ef             	mov    rdi,r13
      e1f1ac:	e8 df ec 9c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e1f1b1:	4c 89 ff             	mov    rdi,r15
      e1f1b4:	e8 d7 ec 9c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e1f1b9:	48 8b bb a8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1a8]
      e1f1c0:	41 8b 36             	mov    esi,DWORD PTR [r14]
      e1f1c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e1f1c6:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
      e1f1cc:	41 8b 06             	mov    eax,DWORD PTR [r14]
      e1f1cf:	ff c8                	dec    eax
      e1f1d1:	83 f8 fe             	cmp    eax,0xfffffffe
      e1f1d4:	0f 92 c0             	setb   al
      e1f1d7:	41 22 46 0c          	and    al,BYTE PTR [r14+0xc]
      e1f1db:	48 8b bb b8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b8]
      e1f1e2:	41 0f b6 56 12       	movzx  edx,BYTE PTR [r14+0x12]
      e1f1e7:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
      e1f1ea:	0f b6 f0             	movzx  esi,al

### caller/xfer 0xe1f2d0; FDE=(14807650, 14808476)
      e1f2a4:	48 83 7b 18 00       	cmp    QWORD PTR [rbx+0x18],0x0
      e1f2a9:	74 3d                	je     e1f2e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec36e>
      e1f2ab:	4c 8d 7b 08          	lea    r15,[rbx+0x8]
      e1f2af:	41 f6 06 01          	test   BYTE PTR [r14],0x1
      e1f2b3:	74 06                	je     e1f2bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec341>
      e1f2b5:	49 8b 56 10          	mov    rdx,QWORD PTR [r14+0x10]
      e1f2b9:	eb 04                	jmp    e1f2bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec345>
      e1f2bb:	49 8d 56 01          	lea    rdx,[r14+0x1]
      e1f2bf:	48 8d 35 dd 77 56 ff 	lea    rsi,[rip+0xffffffffff5677dd]        # 386aa3 <_ZTSSt12bad_any_cast@@Base-0x9725>
      e1f2c6:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
      e1f2cb:	4c 89 e7             	mov    rdi,r12
      e1f2ce:	31 c0                	xor    eax,eax
      e1f2d0:	e8 c5 c9 9b 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e1f2d5:	4c 89 ff             	mov    rdi,r15
      e1f2d8:	4c 89 e6             	mov    rsi,r12
      e1f2db:	e8 bc 02 00 00       	call   e1f59c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec622>
      e1f2e0:	4c 89 e7             	mov    rdi,r12
      e1f2e3:	e8 a8 eb 9c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e1f2e8:	48 ff 83 e0 13 00 00 	inc    QWORD PTR [rbx+0x13e0]
      e1f2ef:	41 8a 2e             	mov    bpl,BYTE PTR [r14]
      e1f2f2:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
      e1f2f6:	40 0f b6 fd          	movzx  edi,bpl
      e1f2fa:	e8 21 c5 c5 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
      e1f2ff:	84 c0                	test   al,al
      e1f301:	0f 84 58 01 00 00    	je     e1f45f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec4e5>
      e1f307:	48 8d 35 a4 90 55 ff 	lea    rsi,[rip+0xffffffffff5590a4]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      e1f30e:	48 8d 0d a3 51 50 ff 	lea    rcx,[rip+0xffffffffff5051a3]        # 3244b8 <_ZTSSt12bad_any_cast@@Base-0x6bd10>
      e1f315:	6a 04                	push   0x4
      e1f317:	5f                   	pop    rdi
      e1f318:	ba 3b 06 00 00       	mov    edx,0x63b
      e1f31d:	31 c0                	xor    eax,eax
      e1f31f:	e8 ae 75 9b 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e1f324:	83 3d 8d a6 b0 00 06 	cmp    DWORD PTR [rip+0xb0a68d],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>

### caller/xfer 0xe26ec2; FDE=(14839399, 14839796)
      e26e96:	75 2f                	jne    e26ec7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3f4d>
      e26e98:	8b 56 10             	mov    edx,DWORD PTR [rsi+0x10]
      e26e9b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e26ea2:	00 00 
      e26ea4:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      e26ea9:	0f 85 28 01 00 00    	jne    e26fd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf405d>
      e26eaf:	48 8d 35 2b b8 51 ff 	lea    rsi,[rip+0xffffffffff51b82b]        # 3426e1 <_ZTSSt12bad_any_cast@@Base-0x4dae7>
      e26eb6:	48 89 df             	mov    rdi,rbx
      e26eb9:	31 c0                	xor    eax,eax
      e26ebb:	48 83 c4 38          	add    rsp,0x38
      e26ebf:	5b                   	pop    rbx
      e26ec0:	41 5e                	pop    r14
      e26ec2:	e9 d3 4d 9b 00       	jmp    17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e26ec7:	48 39 d1             	cmp    rcx,rdx
      e26eca:	75 2a                	jne    e26ef6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3f7c>
      e26ecc:	3d 29 23 00 00       	cmp    eax,0x2329
      e26ed1:	75 23                	jne    e26ef6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3f7c>
      e26ed3:	48 83 c6 58          	add    rsi,0x58
      e26ed7:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      e26edc:	b9 00 04 00 00       	mov    ecx,0x400
      e26ee1:	31 d2                	xor    edx,edx
      e26ee3:	e8 3c 67 c9 ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
      e26ee8:	f6 44 24 18 01       	test   BYTE PTR [rsp+0x18],0x1
      e26eed:	74 30                	je     e26f1f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3fa5>
      e26eef:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
      e26ef4:	eb 2e                	jmp    e26f24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3faa>
      e26ef6:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      e26efb:	e8 e0 75 9c 00       	call   17ee4e0 <_ZNKSt6__ndk110error_code7messageEv@plt>
      e26f00:	f6 44 24 18 01       	test   BYTE PTR [rsp+0x18],0x1
      e26f05:	74 07                	je     e26f0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3f94>
      e26f07:	48 8b 54 24 28       	mov    rdx,QWORD PTR [rsp+0x28]
      e26f0c:	eb 05                	jmp    e26f13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3f99>
      e26f0e:	48 8d 54 24 19       	lea    rdx,[rsp+0x19]

### caller/xfer 0xe26f90; FDE=(14839399, 14839796)
      e26f65:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      e26f6a:	48 89 c6             	mov    rsi,rax
      e26f6d:	31 c9                	xor    ecx,ecx
      e26f6f:	e8 a7 45 9b 00       	call   17db51b <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x733c>
      e26f74:	f6 04 24 01          	test   BYTE PTR [rsp],0x1
      e26f78:	74 3d                	je     e26fb7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf403d>
      e26f7a:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      e26f7f:	eb 3b                	jmp    e26fbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf4042>
      e26f81:	48 8d 35 4d 01 55 ff 	lea    rsi,[rip+0xffffffffff55014d]        # 3770d5 <_ZTSSt12bad_any_cast@@Base-0x190f3>
      e26f88:	48 89 df             	mov    rdi,rbx
      e26f8b:	4c 89 f2             	mov    rdx,r14
      e26f8e:	31 c0                	xor    eax,eax
      e26f90:	e8 05 4d 9b 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e26f95:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      e26f9a:	e8 f1 6e 9c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e26f9f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e26fa6:	00 00 
      e26fa8:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      e26fad:	75 28                	jne    e26fd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf405d>
      e26faf:	48 83 c4 38          	add    rsp,0x38
      e26fb3:	5b                   	pop    rbx
      e26fb4:	41 5e                	pop    r14
      e26fb6:	c3                   	ret
      e26fb7:	48 8d 54 24 01       	lea    rdx,[rsp+0x1]
      e26fbc:	48 8d 35 69 65 55 ff 	lea    rsi,[rip+0xffffffffff556569]        # 37d52c <_ZTSSt12bad_any_cast@@Base-0x12c9c>
      e26fc3:	48 89 df             	mov    rdi,rbx
      e26fc6:	31 c0                	xor    eax,eax
      e26fc8:	e8 cd 4c 9b 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e26fcd:	48 89 e7             	mov    rdi,rsp
      e26fd0:	e8 bb 6e 9c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e26fd5:	eb be                	jmp    e26f95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf401b>
      e26fd7:	e8 d4 8a 9c 00       	call   17efab0 <__stack_chk_fail@plt>
      e26fdc:	48 89 c3             	mov    rbx,rax

### caller/xfer 0xe26fc8; FDE=(14839399, 14839796)
      e26f9f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e26fa6:	00 00 
      e26fa8:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      e26fad:	75 28                	jne    e26fd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf405d>
      e26faf:	48 83 c4 38          	add    rsp,0x38
      e26fb3:	5b                   	pop    rbx
      e26fb4:	41 5e                	pop    r14
      e26fb6:	c3                   	ret
      e26fb7:	48 8d 54 24 01       	lea    rdx,[rsp+0x1]
      e26fbc:	48 8d 35 69 65 55 ff 	lea    rsi,[rip+0xffffffffff556569]        # 37d52c <_ZTSSt12bad_any_cast@@Base-0x12c9c>
      e26fc3:	48 89 df             	mov    rdi,rbx
      e26fc6:	31 c0                	xor    eax,eax
      e26fc8:	e8 cd 4c 9b 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e26fcd:	48 89 e7             	mov    rdi,rsp
      e26fd0:	e8 bb 6e 9c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e26fd5:	eb be                	jmp    e26f95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf401b>
      e26fd7:	e8 d4 8a 9c 00       	call   17efab0 <__stack_chk_fail@plt>
      e26fdc:	48 89 c3             	mov    rbx,rax
      e26fdf:	48 89 e7             	mov    rdi,rsp
      e26fe2:	e8 a9 6e 9c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e26fe7:	eb 03                	jmp    e26fec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf4072>
      e26fe9:	48 89 c3             	mov    rbx,rax
      e26fec:	48 89 df             	mov    rdi,rbx
      e26fef:	e8 b1 2a c5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e26ff4:	41 56                	push   r14
      e26ff6:	53                   	push   rbx
      e26ff7:	50                   	push   rax
      e26ff8:	48 89 fb             	mov    rbx,rdi
      e26ffb:	48 8d 05 3e 68 a0 00 	lea    rax,[rip+0xa0683e]        # 182d840 <_ZTIN4asio2ip16bad_address_castE@@Base+0x9e70>
      e27002:	48 89 07             	mov    QWORD PTR [rdi],rax
      e27005:	48 8b bf 00 05 00 00 	mov    rdi,QWORD PTR [rdi+0x500]
      e2700c:	e8 75 74 c7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e27011:	48 8b b3 e0 04 00 00 	mov    rsi,QWORD PTR [rbx+0x4e0]

### caller/xfer 0xe29e8d; FDE=(14851294, 14852107)
      e29e5e:	4d 8b 7f 10          	mov    r15,QWORD PTR [r15+0x10]
      e29e62:	eb 03                	jmp    e29e67 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf6eed>
      e29e64:	49 ff c7             	inc    r15
      e29e67:	48 8d ac 24 b0 00 00 	lea    rbp,[rsp+0xb0]
      e29e6e:	00 
      e29e6f:	48 8d 35 fb 99 54 ff 	lea    rsi,[rip+0xffffffffff5499fb]        # 373871 <_ZTSSt12bad_any_cast@@Base-0x1c957>
      e29e76:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
      e29e7b:	4c 89 e7             	mov    rdi,r12
      e29e7e:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      e29e83:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
      e29e88:	4d 89 f9             	mov    r9,r15
      e29e8b:	31 c0                	xor    eax,eax
      e29e8d:	e8 08 1e 9b 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e29e92:	48 89 df             	mov    rdi,rbx
      e29e95:	4c 89 e6             	mov    rsi,r12
      e29e98:	e8 bd fc 7b 00       	call   15e9b5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f0de>
      e29e9d:	49 8d 76 20          	lea    rsi,[r14+0x20]
      e29ea1:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      e29ea6:	e8 95 40 9c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e29eab:	4c 8d a4 24 10 01 00 	lea    r12,[rsp+0x110]
      e29eb2:	00 
      e29eb3:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
      e29eb8:	4c 89 e7             	mov    rdi,r12
      e29ebb:	4c 89 fe             	mov    rsi,r15
      e29ebe:	e8 95 cb 70 00       	call   1536a58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37bfdc>
      e29ec3:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      e29ec8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e29ecb:	4c 89 e6             	mov    rsi,r12
      e29ece:	ff 50 60             	call   QWORD PTR [rax+0x60]
      e29ed1:	48 8d 05 c0 3c a0 00 	lea    rax,[rip+0xa03cc0]        # 182db98 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa1c8>
      e29ed8:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      e29edf:	00 
      e29ee0:	4c 89 b4 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r14

### caller/xfer 0xe3b8e4; FDE=(14923606, 14924100)
      e3b8be:	eb 05                	jmp    e3b8c5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cdb>
      e3b8c0:	4c 8d 44 24 01       	lea    r8,[rsp+0x1]
      e3b8c5:	41 0f b7 8f b0 00 00 	movzx  ecx,WORD PTR [r15+0xb0]
      e3b8cc:	00 
      e3b8cd:	41 f6 06 01          	test   BYTE PTR [r14],0x1
      e3b8d1:	74 06                	je     e3b8d9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cef>
      e3b8d3:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
      e3b8d7:	eb 03                	jmp    e3b8dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf2>
      e3b8d9:	49 ff c6             	inc    r14
      e3b8dc:	48 89 df             	mov    rdi,rbx
      e3b8df:	4d 89 f1             	mov    r9,r14
      e3b8e2:	31 c0                	xor    eax,eax
      e3b8e4:	e8 b1 03 9a 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e3b8e9:	48 89 e7             	mov    rdi,rsp
      e3b8ec:	e8 9f 25 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e3b8f1:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      e3b8f6:	e8 95 25 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e3b8fb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e3b902:	00 00 
      e3b904:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      e3b909:	75 34                	jne    e3b93f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d55>
      e3b90b:	48 83 c4 48          	add    rsp,0x48
      e3b90f:	5b                   	pop    rbx
      e3b910:	41 5c                	pop    r12
      e3b912:	41 5d                	pop    r13
      e3b914:	41 5e                	pop    r14
      e3b916:	41 5f                	pop    r15
      e3b918:	5d                   	pop    rbp
      e3b919:	c3                   	ret
      e3b91a:	48 89 c3             	mov    rbx,rax
      e3b91d:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      e3b922:	e8 69 25 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e3b927:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### caller/xfer 0xe5340b; FDE=(15020950, 15021627)
      e533dd:	48 89 de             	mov    rsi,rbx
      e533e0:	48 89 c2             	mov    rdx,rax
      e533e3:	e8 0c b2 87 00       	call   16ce5f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82760>
      e533e8:	f6 45 00 01          	test   BYTE PTR [rbp+0x0],0x1
      e533ec:	74 07                	je     e533f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a80b>
      e533ee:	48 8b 54 24 38       	mov    rdx,QWORD PTR [rsp+0x38]
      e533f3:	eb 05                	jmp    e533fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a810>
      e533f5:	48 8d 54 24 29       	lea    rdx,[rsp+0x29]
      e533fa:	48 8d 35 98 7e 4d ff 	lea    rsi,[rip+0xffffffffff4d7e98]        # 32b299 <_ZTSSt12bad_any_cast@@Base-0x64f2f>
      e53401:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e53406:	48 89 df             	mov    rdi,rbx
      e53409:	31 c0                	xor    eax,eax
      e5340b:	e8 8a 88 98 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e53410:	48 89 ef             	mov    rdi,rbp
      e53413:	e8 78 aa 99 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e53418:	41 80 7d 18 00       	cmp    BYTE PTR [r13+0x18],0x0
      e5341d:	74 4c                	je     e5346b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a881>
      e5341f:	4c 89 ef             	mov    rdi,r13
      e53422:	e8 0f 84 c2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      e53427:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      e5342c:	48 89 c6             	mov    rsi,rax
      e5342f:	e8 c0 b1 87 00       	call   16ce5f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82760>
      e53434:	48 8d 35 d2 f4 4e ff 	lea    rsi,[rip+0xffffffffff4ef4d2]        # 34290d <_ZTSSt12bad_any_cast@@Base-0x4d8bb>
      e5343b:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      e53440:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
      e53445:	e8 4f 29 c6 ff       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      e5344a:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      e5344f:	48 89 df             	mov    rdi,rbx
      e53452:	e8 e5 4e c5 ff       	call   aa833c <JNI_OnUnload@@Base+0x2fc09>
      e53457:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      e5345c:	e8 2f aa 99 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e53461:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      e53466:	e8 25 aa 99 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### caller/xfer 0xe57d25; FDE=(15039653, 15039829)
      e57cf6:	e8 5f 97 ed ff       	call   d3145a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27e3fa>
      e57cfb:	41 f6 07 01          	test   BYTE PTR [r15],0x1
      e57cff:	74 07                	je     e57d08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f11e>
      e57d01:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      e57d06:	eb 05                	jmp    e57d0d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f123>
      e57d08:	48 8d 54 24 01       	lea    rdx,[rsp+0x1]
      e57d0d:	41 0f b7 46 02       	movzx  eax,WORD PTR [r14+0x2]
      e57d12:	66 c1 c0 08          	rol    ax,0x8
      e57d16:	0f b7 c8             	movzx  ecx,ax
      e57d19:	48 8d 35 10 14 53 ff 	lea    rsi,[rip+0xffffffffff531410]        # 389130 <_ZTSSt12bad_any_cast@@Base-0x7098>
      e57d20:	48 89 df             	mov    rdi,rbx
      e57d23:	31 c0                	xor    eax,eax
      e57d25:	e8 70 3f 98 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e57d2a:	4c 89 ff             	mov    rdi,r15
      e57d2d:	e8 5e 61 99 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e57d32:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e57d39:	00 00 
      e57d3b:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      e57d40:	75 0e                	jne    e57d50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f166>
      e57d42:	48 83 c4 50          	add    rsp,0x50
      e57d46:	5b                   	pop    rbx
      e57d47:	41 5c                	pop    r12
      e57d49:	41 5d                	pop    r13
      e57d4b:	41 5e                	pop    r14
      e57d4d:	41 5f                	pop    r15
      e57d4f:	c3                   	ret
      e57d50:	e8 5b 7d 99 00       	call   17efab0 <__stack_chk_fail@plt>
      e57d55:	cc                   	int3
      e57d56:	55                   	push   rbp
      e57d57:	41 57                	push   r15
      e57d59:	41 56                	push   r14
      e57d5b:	41 55                	push   r13
      e57d5d:	41 54                	push   r12

### caller/xfer 0xe5e28a; FDE=(15065500, 15066837)
      e5e25d:	eb 08                	jmp    e5e267 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2567d>
      e5e25f:	4c 8d 8c 24 11 01 00 	lea    r9,[rsp+0x111]
      e5e266:	00 
      e5e267:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e5e26c:	48 8d 58 10          	lea    rbx,[rax+0x10]
      e5e270:	48 8d 35 fe 53 52 ff 	lea    rsi,[rip+0xffffffffff5253fe]        # 383675 <_ZTSSt12bad_any_cast@@Base-0xcb53>
      e5e277:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      e5e27e:	00 
      e5e27f:	4c 89 ea             	mov    rdx,r13
      e5e282:	4c 89 e1             	mov    rcx,r12
      e5e285:	49 89 e8             	mov    r8,rbp
      e5e288:	31 c0                	xor    eax,eax
      e5e28a:	e8 0b da 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5e28f:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      e5e296:	00 
      e5e297:	e8 f4 fb 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e5e29c:	83 3d 15 b7 ac 00 06 	cmp    DWORD PTR [rip+0xacb715],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5e2a3:	7c 39                	jl     e5e2de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256f4>
      e5e2a5:	f6 84 24 90 00 00 00 	test   BYTE PTR [rsp+0x90],0x1
      e5e2ac:	01 
      e5e2ad:	74 0a                	je     e5e2b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256cf>
      e5e2af:	4c 8b 84 24 a0 00 00 	mov    r8,QWORD PTR [rsp+0xa0]
      e5e2b6:	00 
      e5e2b7:	eb 08                	jmp    e5e2c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256d7>
      e5e2b9:	4c 8d 84 24 91 00 00 	lea    r8,[rsp+0x91]
      e5e2c0:	00 
      e5e2c1:	48 8d 35 b4 3c 5f ff 	lea    rsi,[rip+0xffffffffff5f3cb4]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e5e2c8:	48 8d 0d 40 0a 4f ff 	lea    rcx,[rip+0xffffffffff4f0a40]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e5e2cf:	6a 06                	push   0x6
      e5e2d1:	5f                   	pop    rdi
      e5e2d2:	ba 5d 01 00 00       	mov    edx,0x15d
      e5e2d7:	31 c0                	xor    eax,eax
      e5e2d9:	e8 f4 85 97 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>

### caller/xfer 0xe5e86a; FDE=(15066958, 15067564)
      e5e839:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      e5e83e:	eb 05                	jmp    e5e845 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c5b>
      e5e840:	48 8d 44 24 29       	lea    rax,[rsp+0x29]
      e5e845:	44 8b 44 24 14       	mov    r8d,DWORD PTR [rsp+0x14]
      e5e84a:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
      e5e84f:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      e5e853:	48 8d 35 1a 0c 4e ff 	lea    rsi,[rip+0xffffffffff4e0c1a]        # 33f474 <_ZTSSt12bad_any_cast@@Base-0x50d54>
      e5e85a:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      e5e861:	00 
      e5e862:	44 89 f2             	mov    edx,r14d
      e5e865:	4d 89 e1             	mov    r9,r12
      e5e868:	31 c0                	xor    eax,eax
      e5e86a:	e8 2b d4 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5e86f:	4c 89 ef             	mov    rdi,r13
      e5e872:	e8 19 f6 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e5e877:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      e5e87c:	e8 0f f6 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e5e881:	83 3d 30 b1 ac 00 06 	cmp    DWORD PTR [rip+0xacb130],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5e888:	7c 39                	jl     e5e8c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25cd9>
      e5e88a:	f6 84 24 90 00 00 00 	test   BYTE PTR [rsp+0x90],0x1
      e5e891:	01 
      e5e892:	74 0a                	je     e5e89e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25cb4>
      e5e894:	4c 8b 84 24 a0 00 00 	mov    r8,QWORD PTR [rsp+0xa0]
      e5e89b:	00 
      e5e89c:	eb 08                	jmp    e5e8a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25cbc>
      e5e89e:	4c 8d 84 24 91 00 00 	lea    r8,[rsp+0x91]
      e5e8a5:	00 
      e5e8a6:	48 8d 35 cf 36 5f ff 	lea    rsi,[rip+0xffffffffff5f36cf]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e5e8ad:	48 8d 0d 5b 04 4f ff 	lea    rcx,[rip+0xffffffffff4f045b]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e5e8b4:	6a 06                	push   0x6
      e5e8b6:	5f                   	pop    rdi
      e5e8b7:	ba 91 01 00 00       	mov    edx,0x191
      e5e8bc:	31 c0                	xor    eax,eax

### caller/xfer 0xe5eac3; FDE=(15067564, 15076953)
      e5ea98:	74 0a                	je     e5eaa4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25eba>
      e5ea9a:	48 8b 94 24 80 01 00 	mov    rdx,QWORD PTR [rsp+0x180]
      e5eaa1:	00 
      e5eaa2:	eb 08                	jmp    e5eaac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ec2>
      e5eaa4:	48 8d 94 24 71 01 00 	lea    rdx,[rsp+0x171]
      e5eaab:	00 
      e5eaac:	48 8d 35 34 7f 50 ff 	lea    rsi,[rip+0xffffffffff507f34]        # 3669e7 <_ZTSSt12bad_any_cast@@Base-0x297e1>
      e5eab3:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5eaba:	00 
      e5eabb:	44 89 f9             	mov    ecx,r15d
      e5eabe:	4d 89 f0             	mov    r8,r14
      e5eac1:	31 c0                	xor    eax,eax
      e5eac3:	e8 d2 d1 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5eac8:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e5eacf:	00 
      e5ead0:	e8 bb f3 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e5ead5:	83 3d dc ae ac 00 06 	cmp    DWORD PTR [rip+0xacaedc],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5eadc:	7c 39                	jl     e5eb17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f2d>
      e5eade:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5eae5:	01 
      e5eae6:	74 0a                	je     e5eaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f08>
      e5eae8:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5eaef:	00 
      e5eaf0:	eb 08                	jmp    e5eafa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f10>
      e5eaf2:	4c 8d 84 24 01 01 00 	lea    r8,[rsp+0x101]
      e5eaf9:	00 
      e5eafa:	48 8d 35 7b 34 5f ff 	lea    rsi,[rip+0xffffffffff5f347b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e5eb01:	48 8d 0d 07 02 4f ff 	lea    rcx,[rip+0xffffffffff4f0207]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e5eb08:	6a 06                	push   0x6
      e5eb0a:	5f                   	pop    rdi
      e5eb0b:	ba 9a 01 00 00       	mov    edx,0x19a
      e5eb10:	31 c0                	xor    eax,eax
      e5eb12:	e8 bb 7d 97 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>

### caller/xfer 0xe5ecff; FDE=(15067564, 15076953)
      e5ecd3:	74 0a                	je     e5ecdf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260f5>
      e5ecd5:	48 8b 94 24 c8 00 00 	mov    rdx,QWORD PTR [rsp+0xc8]
      e5ecdc:	00 
      e5ecdd:	eb 0f                	jmp    e5ecee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26104>
      e5ecdf:	48 8d 94 24 b9 00 00 	lea    rdx,[rsp+0xb9]
      e5ece6:	00 
      e5ece7:	eb 05                	jmp    e5ecee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26104>
      e5ece9:	48 8d 54 24 49       	lea    rdx,[rsp+0x49]
      e5ecee:	48 8d 35 9c b5 50 ff 	lea    rsi,[rip+0xffffffffff50b59c]        # 36a291 <_ZTSSt12bad_any_cast@@Base-0x25f37>
      e5ecf5:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5ecfc:	00 
      e5ecfd:	31 c0                	xor    eax,eax
      e5ecff:	e8 96 cf 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5ed04:	40 84 ed             	test   bpl,bpl
      e5ed07:	74 14                	je     e5ed1d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26133>
      e5ed09:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      e5ed0e:	e8 7d f1 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e5ed13:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      e5ed18:	e8 73 f1 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e5ed1d:	83 3d 94 ac ac 00 06 	cmp    DWORD PTR [rip+0xacac94],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5ed24:	7c 39                	jl     e5ed5f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26175>
      e5ed26:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5ed2d:	01 
      e5ed2e:	74 0a                	je     e5ed3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26150>
      e5ed30:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5ed37:	00 
      e5ed38:	eb 08                	jmp    e5ed42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26158>
      e5ed3a:	4c 8d 84 24 01 01 00 	lea    r8,[rsp+0x101]
      e5ed41:	00 
      e5ed42:	48 8d 35 33 32 5f ff 	lea    rsi,[rip+0xffffffffff5f3233]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e5ed49:	48 8d 0d bf ff 4e ff 	lea    rcx,[rip+0xffffffffff4effbf]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e5ed50:	6a 06                	push   0x6
      e5ed52:	5f                   	pop    rdi

### caller/xfer 0xe5ede6; FDE=(15067564, 15076953)
      e5edb4:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      e5edb8:	8b 48 1c             	mov    ecx,DWORD PTR [rax+0x1c]
      e5edbb:	48 83 f9 08          	cmp    rcx,0x8
      e5edbf:	0f 87 ad fd ff ff    	ja     e5eb72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f88>
      e5edc5:	48 8d 15 84 7d 53 ff 	lea    rdx,[rip+0xffffffffff537d84]        # 396b50 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x3731>
      e5edcc:	48 63 0c 8a          	movsxd rcx,DWORD PTR [rdx+rcx*4]
      e5edd0:	48 01 d1             	add    rcx,rdx
      e5edd3:	ff e1                	jmp    rcx
      e5edd5:	48 8d 35 50 b5 51 ff 	lea    rsi,[rip+0xffffffffff51b550]        # 37a32c <_ZTSSt12bad_any_cast@@Base-0x15e9c>
      e5eddc:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5ede3:	00 
      e5ede4:	31 c0                	xor    eax,eax
      e5ede6:	e8 af ce 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5edeb:	83 3d c6 ab ac 00 06 	cmp    DWORD PTR [rip+0xacabc6],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5edf2:	0f 8c 98 07 00 00    	jl     e5f590 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269a6>
      e5edf8:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5edff:	01 
      e5ee00:	0f 84 65 07 00 00    	je     e5f56b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26981>
      e5ee06:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5ee0d:	00 
      e5ee0e:	e9 60 07 00 00       	jmp    e5f573 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26989>
      e5ee13:	48 8d 35 21 4c 51 ff 	lea    rsi,[rip+0xffffffffff514c21]        # 373a3b <_ZTSSt12bad_any_cast@@Base-0x1c78d>
      e5ee1a:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5ee21:	00 
      e5ee22:	31 c0                	xor    eax,eax
      e5ee24:	e8 71 ce 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5ee29:	83 3d 88 ab ac 00 06 	cmp    DWORD PTR [rip+0xacab88],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5ee30:	0f 8c eb 06 00 00    	jl     e5f521 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26937>
      e5ee36:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5ee3d:	01 
      e5ee3e:	0f 84 b8 06 00 00    	je     e5f4fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26912>
      e5ee44:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5ee4b:	00 

### caller/xfer 0xe5ee24; FDE=(15067564, 15076953)
      e5edeb:	83 3d c6 ab ac 00 06 	cmp    DWORD PTR [rip+0xacabc6],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5edf2:	0f 8c 98 07 00 00    	jl     e5f590 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269a6>
      e5edf8:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5edff:	01 
      e5ee00:	0f 84 65 07 00 00    	je     e5f56b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26981>
      e5ee06:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5ee0d:	00 
      e5ee0e:	e9 60 07 00 00       	jmp    e5f573 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26989>
      e5ee13:	48 8d 35 21 4c 51 ff 	lea    rsi,[rip+0xffffffffff514c21]        # 373a3b <_ZTSSt12bad_any_cast@@Base-0x1c78d>
      e5ee1a:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5ee21:	00 
      e5ee22:	31 c0                	xor    eax,eax
      e5ee24:	e8 71 ce 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5ee29:	83 3d 88 ab ac 00 06 	cmp    DWORD PTR [rip+0xacab88],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5ee30:	0f 8c eb 06 00 00    	jl     e5f521 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26937>
      e5ee36:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5ee3d:	01 
      e5ee3e:	0f 84 b8 06 00 00    	je     e5f4fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26912>
      e5ee44:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5ee4b:	00 
      e5ee4c:	e9 b3 06 00 00       	jmp    e5f504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2691a>
      e5ee51:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
      e5ee58:	00 
      e5ee59:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      e5ee5d:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]
      e5ee61:	48 8d 15 82 de 5d ff 	lea    rdx,[rip+0xffffffffff5dde82]        # 43ccea <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x28f6>
      e5ee68:	31 c9                	xor    ecx,ecx
      e5ee6a:	e8 23 5b 96 00       	call   17c4992 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178afe>
      e5ee6f:	48 89 c7             	mov    rdi,rax
      e5ee72:	31 f6                	xor    esi,esi
      e5ee74:	e8 c9 48 96 00       	call   17c3742 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1778ae>
      e5ee79:	48 85 c0             	test   rax,rax
      e5ee7c:	0f 84 f0 fc ff ff    	je     e5eb72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f88>

### caller/xfer 0xe5eef2; FDE=(15067564, 15076953)
      e5eec4:	31 c9                	xor    ecx,ecx
      e5eec6:	e8 c7 5a 96 00       	call   17c4992 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178afe>
      e5eecb:	48 89 c7             	mov    rdi,rax
      e5eece:	31 f6                	xor    esi,esi
      e5eed0:	e8 6d 48 96 00       	call   17c3742 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1778ae>
      e5eed5:	48 85 c0             	test   rax,rax
      e5eed8:	0f 84 d3 0d 00 00    	je     e5fcb1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270c7>
      e5eede:	49 89 c6             	mov    r14,rax
      e5eee1:	48 8d 35 87 a5 4f ff 	lea    rsi,[rip+0xffffffffff4fa587]        # 35946f <_ZTSSt12bad_any_cast@@Base-0x36d59>
      e5eee8:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5eeef:	00 
      e5eef0:	31 c0                	xor    eax,eax
      e5eef2:	e8 a3 cd 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5eef7:	83 3d ba aa ac 00 06 	cmp    DWORD PTR [rip+0xacaaba],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5eefe:	0f 8c 8c 0e 00 00    	jl     e5fd90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271a6>
      e5ef04:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5ef0b:	01 
      e5ef0c:	0f 84 59 0e 00 00    	je     e5fd6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27181>
      e5ef12:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5ef19:	00 
      e5ef1a:	e9 54 0e 00 00       	jmp    e5fd73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27189>
      e5ef1f:	8a 94 24 a4 00 00 00 	mov    dl,BYTE PTR [rsp+0xa4]
      e5ef26:	8b 8c 24 a0 00 00 00 	mov    ecx,DWORD PTR [rsp+0xa0]
      e5ef2d:	84 d2                	test   dl,dl
      e5ef2f:	0f 84 2f 03 00 00    	je     e5f264 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2667a>
      e5ef35:	3b 88 00 03 00 00    	cmp    ecx,DWORD PTR [rax+0x300]
      e5ef3b:	0f 85 23 03 00 00    	jne    e5f264 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2667a>
      e5ef41:	48 8d 35 57 e1 4e ff 	lea    rsi,[rip+0xffffffffff4ee157]        # 34d09f <_ZTSSt12bad_any_cast@@Base-0x43129>
      e5ef48:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5ef4f:	00 
      e5ef50:	31 c0                	xor    eax,eax
      e5ef52:	e8 43 cd 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5ef57:	83 3d 5a aa ac 00 06 	cmp    DWORD PTR [rip+0xacaa5a],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>

### caller/xfer 0xe5ef52; FDE=(15067564, 15076953)
      e5ef19:	00 
      e5ef1a:	e9 54 0e 00 00       	jmp    e5fd73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27189>
      e5ef1f:	8a 94 24 a4 00 00 00 	mov    dl,BYTE PTR [rsp+0xa4]
      e5ef26:	8b 8c 24 a0 00 00 00 	mov    ecx,DWORD PTR [rsp+0xa0]
      e5ef2d:	84 d2                	test   dl,dl
      e5ef2f:	0f 84 2f 03 00 00    	je     e5f264 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2667a>
      e5ef35:	3b 88 00 03 00 00    	cmp    ecx,DWORD PTR [rax+0x300]
      e5ef3b:	0f 85 23 03 00 00    	jne    e5f264 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2667a>
      e5ef41:	48 8d 35 57 e1 4e ff 	lea    rsi,[rip+0xffffffffff4ee157]        # 34d09f <_ZTSSt12bad_any_cast@@Base-0x43129>
      e5ef48:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5ef4f:	00 
      e5ef50:	31 c0                	xor    eax,eax
      e5ef52:	e8 43 cd 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5ef57:	83 3d 5a aa ac 00 06 	cmp    DWORD PTR [rip+0xacaa5a],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5ef5e:	0f 8c 53 08 00 00    	jl     e5f7b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bcd>
      e5ef64:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5ef6b:	01 
      e5ef6c:	0f 84 20 08 00 00    	je     e5f792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ba8>
      e5ef72:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5ef79:	00 
      e5ef7a:	e9 1b 08 00 00       	jmp    e5f79a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bb0>
      e5ef7f:	80 bc 24 a4 00 00 00 	cmp    BYTE PTR [rsp+0xa4],0x0
      e5ef86:	00 
      e5ef87:	0f 84 6e 03 00 00    	je     e5f2fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26711>
      e5ef8d:	8b 80 04 03 00 00    	mov    eax,DWORD PTR [rax+0x304]
      e5ef93:	39 84 24 a0 00 00 00 	cmp    DWORD PTR [rsp+0xa0],eax
      e5ef9a:	0f 85 5b 03 00 00    	jne    e5f2fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26711>
      e5efa0:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
      e5efa7:	00 
      e5efa8:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
      e5efac:	48 8b 50 10          	mov    rdx,QWORD PTR [rax+0x10]
      e5efb0:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5efb7:	00 

### caller/xfer 0xe5f002; FDE=(15067564, 15076953)
      e5efd3:	4c 8b b4 24 08 01 00 	mov    r14,QWORD PTR [rsp+0x108]
      e5efda:	00 
      e5efdb:	4c 39 f7             	cmp    rdi,r14
      e5efde:	74 11                	je     e5eff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26407>
      e5efe0:	4c 89 f6             	mov    rsi,r14
      e5efe3:	e8 0e 21 00 00       	call   e610f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2850c>
      e5efe8:	4c 39 f0             	cmp    rax,r14
      e5efeb:	0f 84 de 0f 00 00    	je     e5ffcf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273e5>
      e5eff1:	48 8d 35 08 83 51 ff 	lea    rsi,[rip+0xffffffffff518308]        # 377300 <_ZTSSt12bad_any_cast@@Base-0x18ec8>
      e5eff8:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e5efff:	00 
      e5f000:	31 c0                	xor    eax,eax
      e5f002:	e8 93 cc 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f007:	83 3d aa a9 ac 00 06 	cmp    DWORD PTR [rip+0xaca9aa],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f00e:	0f 8c 53 0c 00 00    	jl     e5fc67 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2707d>
      e5f014:	f6 84 24 70 01 00 00 	test   BYTE PTR [rsp+0x170],0x1
      e5f01b:	01 
      e5f01c:	0f 84 20 0c 00 00    	je     e5fc42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27058>
      e5f022:	4c 8b 84 24 80 01 00 	mov    r8,QWORD PTR [rsp+0x180]
      e5f029:	00 
      e5f02a:	e9 1b 0c 00 00       	jmp    e5fc4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27060>
      e5f02f:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
      e5f036:	00 
      e5f037:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      e5f03b:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]
      e5f03f:	48 8d 15 a4 dc 5d ff 	lea    rdx,[rip+0xffffffffff5ddca4]        # 43ccea <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x28f6>
      e5f046:	31 c9                	xor    ecx,ecx
      e5f048:	e8 45 59 96 00       	call   17c4992 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178afe>
      e5f04d:	48 89 c7             	mov    rdi,rax
      e5f050:	31 f6                	xor    esi,esi
      e5f052:	e8 eb 46 96 00       	call   17c3742 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1778ae>
      e5f057:	48 85 c0             	test   rax,rax
      e5f05a:	0f 84 12 fb ff ff    	je     e5eb72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f88>

### caller/xfer 0xe5f099; FDE=(15067564, 15076953)
      e5f06b:	48 8d 3d b2 ad 4e ff 	lea    rdi,[rip+0xffffffffff4eadb2]        # 349e24 <_ZTSSt12bad_any_cast@@Base-0x463a4>
      e5f072:	6a 05                	push   0x5
      e5f074:	5e                   	pop    rsi
      e5f075:	4c 89 f2             	mov    rdx,r14
      e5f078:	48 89 c1             	mov    rcx,rax
      e5f07b:	e8 00 c8 c1 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
      e5f080:	84 c0                	test   al,al
      e5f082:	0f 84 ea fa ff ff    	je     e5eb72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f88>
      e5f088:	48 8d 35 ed 96 4d ff 	lea    rsi,[rip+0xffffffffff4d96ed]        # 33877c <_ZTSSt12bad_any_cast@@Base-0x57a4c>
      e5f08f:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f096:	00 
      e5f097:	31 c0                	xor    eax,eax
      e5f099:	e8 fc cb 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f09e:	83 3d 13 a9 ac 00 06 	cmp    DWORD PTR [rip+0xaca913],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f0a5:	0f 8c 21 09 00 00    	jl     e5f9cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26de2>
      e5f0ab:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f0b2:	01 
      e5f0b3:	0f 84 ee 08 00 00    	je     e5f9a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dbd>
      e5f0b9:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f0c0:	00 
      e5f0c1:	e9 e9 08 00 00       	jmp    e5f9af <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc5>
      e5f0c6:	80 bc 24 a4 00 00 00 	cmp    BYTE PTR [rsp+0xa4],0x0
      e5f0cd:	00 
      e5f0ce:	0f 84 32 03 00 00    	je     e5f406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2681c>
      e5f0d4:	8b 80 0c 03 00 00    	mov    eax,DWORD PTR [rax+0x30c]
      e5f0da:	39 84 24 a0 00 00 00 	cmp    DWORD PTR [rsp+0xa0],eax
      e5f0e1:	0f 85 1f 03 00 00    	jne    e5f406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2681c>
      e5f0e7:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
      e5f0ee:	00 
      e5f0ef:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      e5f0f3:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]
      e5f0f7:	48 8d 15 ec db 5d ff 	lea    rdx,[rip+0xffffffffff5ddbec]        # 43ccea <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x28f6>
      e5f0fe:	31 c9                	xor    ecx,ecx

### caller/xfer 0xe5f14d; FDE=(15067564, 15076953)
      e5f11f:	48 8d 3d 9e b1 4f ff 	lea    rdi,[rip+0xffffffffff4fb19e]        # 35a2c4 <_ZTSSt12bad_any_cast@@Base-0x35f04>
      e5f126:	6a 08                	push   0x8
      e5f128:	5e                   	pop    rsi
      e5f129:	4c 89 f2             	mov    rdx,r14
      e5f12c:	48 89 c1             	mov    rcx,rax
      e5f12f:	e8 4c c7 c1 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
      e5f134:	84 c0                	test   al,al
      e5f136:	0f 84 18 06 00 00    	je     e5f754 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b6a>
      e5f13c:	48 8d 35 11 30 4d ff 	lea    rsi,[rip+0xffffffffff4d3011]        # 332154 <_ZTSSt12bad_any_cast@@Base-0x5e074>
      e5f143:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f14a:	00 
      e5f14b:	31 c0                	xor    eax,eax
      e5f14d:	e8 48 cb 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f152:	83 3d 5f a8 ac 00 06 	cmp    DWORD PTR [rip+0xaca85f],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f159:	0f 8c 01 0a 00 00    	jl     e5fb60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f76>
      e5f15f:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f166:	01 
      e5f167:	0f 84 ce 09 00 00    	je     e5fb3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f51>
      e5f16d:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f174:	00 
      e5f175:	e9 c9 09 00 00       	jmp    e5fb43 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f59>
      e5f17a:	8a 94 24 a4 00 00 00 	mov    dl,BYTE PTR [rsp+0xa4]
      e5f181:	8b 8c 24 a0 00 00 00 	mov    ecx,DWORD PTR [rsp+0xa0]
      e5f188:	84 d2                	test   dl,dl
      e5f18a:	0f 84 b4 02 00 00    	je     e5f444 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2685a>
      e5f190:	3b 88 04 03 00 00    	cmp    ecx,DWORD PTR [rax+0x304]
      e5f196:	0f 85 a8 02 00 00    	jne    e5f444 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2685a>
      e5f19c:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
      e5f1a3:	00 
      e5f1a4:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
      e5f1a8:	48 8b 50 10          	mov    rdx,QWORD PTR [rax+0x10]
      e5f1ac:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f1b3:	00 

### caller/xfer 0xe5f1f9; FDE=(15067564, 15076953)
      e5f1c7:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
      e5f1ce:	00 
      e5f1cf:	4c 8b b4 24 08 01 00 	mov    r14,QWORD PTR [rsp+0x108]
      e5f1d6:	00 
      e5f1d7:	4c 89 f6             	mov    rsi,r14
      e5f1da:	e8 17 1f 00 00       	call   e610f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2850c>
      e5f1df:	4c 39 f0             	cmp    rax,r14
      e5f1e2:	0f 84 07 0b 00 00    	je     e5fcef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27105>
      e5f1e8:	48 8d 35 0d 77 4e ff 	lea    rsi,[rip+0xffffffffff4e770d]        # 3468fc <_ZTSSt12bad_any_cast@@Base-0x498cc>
      e5f1ef:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e5f1f6:	00 
      e5f1f7:	31 c0                	xor    eax,eax
      e5f1f9:	e8 9c ca 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f1fe:	83 3d b3 a7 ac 00 06 	cmp    DWORD PTR [rip+0xaca7b3],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f205:	0f 8c 69 0c 00 00    	jl     e5fe74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2728a>
      e5f20b:	f6 84 24 70 01 00 00 	test   BYTE PTR [rsp+0x170],0x1
      e5f212:	01 
      e5f213:	0f 84 36 0c 00 00    	je     e5fe4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27265>
      e5f219:	4c 8b 84 24 80 01 00 	mov    r8,QWORD PTR [rsp+0x180]
      e5f220:	00 
      e5f221:	e9 31 0c 00 00       	jmp    e5fe57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2726d>
      e5f226:	48 8d 35 f7 7a 52 ff 	lea    rsi,[rip+0xffffffffff527af7]        # 386d24 <_ZTSSt12bad_any_cast@@Base-0x94a4>
      e5f22d:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f234:	00 
      e5f235:	31 c0                	xor    eax,eax
      e5f237:	e8 5e ca 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f23c:	83 3d 75 a7 ac 00 06 	cmp    DWORD PTR [rip+0xaca775],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f243:	0f 8c b6 03 00 00    	jl     e5f5ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a15>
      e5f249:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f250:	01 
      e5f251:	0f 84 83 03 00 00    	je     e5f5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269f0>
      e5f257:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f25e:	00 

### caller/xfer 0xe5f237; FDE=(15067564, 15076953)
      e5f1fe:	83 3d b3 a7 ac 00 06 	cmp    DWORD PTR [rip+0xaca7b3],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f205:	0f 8c 69 0c 00 00    	jl     e5fe74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2728a>
      e5f20b:	f6 84 24 70 01 00 00 	test   BYTE PTR [rsp+0x170],0x1
      e5f212:	01 
      e5f213:	0f 84 36 0c 00 00    	je     e5fe4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27265>
      e5f219:	4c 8b 84 24 80 01 00 	mov    r8,QWORD PTR [rsp+0x180]
      e5f220:	00 
      e5f221:	e9 31 0c 00 00       	jmp    e5fe57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2726d>
      e5f226:	48 8d 35 f7 7a 52 ff 	lea    rsi,[rip+0xffffffffff527af7]        # 386d24 <_ZTSSt12bad_any_cast@@Base-0x94a4>
      e5f22d:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f234:	00 
      e5f235:	31 c0                	xor    eax,eax
      e5f237:	e8 5e ca 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f23c:	83 3d 75 a7 ac 00 06 	cmp    DWORD PTR [rip+0xaca775],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f243:	0f 8c b6 03 00 00    	jl     e5f5ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a15>
      e5f249:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f250:	01 
      e5f251:	0f 84 83 03 00 00    	je     e5f5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269f0>
      e5f257:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f25e:	00 
      e5f25f:	e9 7e 03 00 00       	jmp    e5f5e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269f8>
      e5f264:	84 d2                	test   dl,dl
      e5f266:	0f 84 8a 0e 00 00    	je     e600f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750c>
      e5f26c:	3b 88 04 03 00 00    	cmp    ecx,DWORD PTR [rax+0x304]
      e5f272:	0f 85 7e 0e 00 00    	jne    e600f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750c>
      e5f278:	c6 80 11 03 00 00 01 	mov    BYTE PTR [rax+0x311],0x1
      e5f27f:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
      e5f286:	00 
      e5f287:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
      e5f28b:	48 8b 50 10          	mov    rdx,QWORD PTR [rax+0x10]
      e5f28f:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f296:	00 
      e5f297:	e8 58 1d 00 00       	call   e60ff4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2840a>

### caller/xfer 0xe5f3d9; FDE=(15067564, 15076953)
      e5f3ab:	48 8d 3d 3e 36 4e ff 	lea    rdi,[rip+0xffffffffff4e363e]        # 3429f0 <_ZTSSt12bad_any_cast@@Base-0x4d7d8>
      e5f3b2:	6a 0f                	push   0xf
      e5f3b4:	5e                   	pop    rsi
      e5f3b5:	4c 89 f2             	mov    rdx,r14
      e5f3b8:	48 89 c1             	mov    rcx,rax
      e5f3bb:	e8 c0 c4 c1 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
      e5f3c0:	84 c0                	test   al,al
      e5f3c2:	0f 84 66 12 00 00    	je     e6062e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a44>
      e5f3c8:	48 8d 35 c3 e2 50 ff 	lea    rsi,[rip+0xffffffffff50e2c3]        # 36d692 <_ZTSSt12bad_any_cast@@Base-0x22b36>
      e5f3cf:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f3d6:	00 
      e5f3d7:	31 c0                	xor    eax,eax
      e5f3d9:	e8 bc c8 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f3de:	83 3d d3 a5 ac 00 06 	cmp    DWORD PTR [rip+0xaca5d3],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f3e5:	0f 8c 22 18 00 00    	jl     e60c0d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28023>
      e5f3eb:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f3f2:	01 
      e5f3f3:	0f 84 ef 17 00 00    	je     e60be8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ffe>
      e5f3f9:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f400:	00 
      e5f401:	e9 ea 17 00 00       	jmp    e60bf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28006>
      e5f406:	48 8d 35 a0 93 4d ff 	lea    rsi,[rip+0xffffffffff4d93a0]        # 3387ad <_ZTSSt12bad_any_cast@@Base-0x57a1b>
      e5f40d:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f414:	00 
      e5f415:	31 c0                	xor    eax,eax
      e5f417:	e8 7e c8 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f41c:	83 3d 95 a5 ac 00 06 	cmp    DWORD PTR [rip+0xaca595],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f423:	0f 8c bd 04 00 00    	jl     e5f8e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26cfc>
      e5f429:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f430:	01 
      e5f431:	0f 84 8a 04 00 00    	je     e5f8c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26cd7>
      e5f437:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f43e:	00 

### caller/xfer 0xe5f417; FDE=(15067564, 15076953)
      e5f3de:	83 3d d3 a5 ac 00 06 	cmp    DWORD PTR [rip+0xaca5d3],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f3e5:	0f 8c 22 18 00 00    	jl     e60c0d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28023>
      e5f3eb:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f3f2:	01 
      e5f3f3:	0f 84 ef 17 00 00    	je     e60be8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ffe>
      e5f3f9:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f400:	00 
      e5f401:	e9 ea 17 00 00       	jmp    e60bf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28006>
      e5f406:	48 8d 35 a0 93 4d ff 	lea    rsi,[rip+0xffffffffff4d93a0]        # 3387ad <_ZTSSt12bad_any_cast@@Base-0x57a1b>
      e5f40d:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f414:	00 
      e5f415:	31 c0                	xor    eax,eax
      e5f417:	e8 7e c8 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f41c:	83 3d 95 a5 ac 00 06 	cmp    DWORD PTR [rip+0xaca595],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f423:	0f 8c bd 04 00 00    	jl     e5f8e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26cfc>
      e5f429:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f430:	01 
      e5f431:	0f 84 8a 04 00 00    	je     e5f8c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26cd7>
      e5f437:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f43e:	00 
      e5f43f:	e9 85 04 00 00       	jmp    e5f8c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26cdf>
      e5f444:	84 d2                	test   dl,dl
      e5f446:	0f 84 ca 02 00 00    	je     e5f716 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b2c>
      e5f44c:	3b 88 08 03 00 00    	cmp    ecx,DWORD PTR [rax+0x308]
      e5f452:	0f 85 be 02 00 00    	jne    e5f716 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b2c>
      e5f458:	80 b8 12 03 00 00 00 	cmp    BYTE PTR [rax+0x312],0x0
      e5f45f:	0f 84 0d f7 ff ff    	je     e5eb72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f88>
      e5f465:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
      e5f46c:	00 
      e5f46d:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      e5f471:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]
      e5f475:	48 8d 15 6e d8 5d ff 	lea    rdx,[rip+0xffffffffff5dd86e]        # 43ccea <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x28f6>
      e5f47c:	31 c9                	xor    ecx,ecx

### caller/xfer 0xe5f4cf; FDE=(15067564, 15076953)
      e5f4a1:	48 8d 3d 1c ae 4f ff 	lea    rdi,[rip+0xffffffffff4fae1c]        # 35a2c4 <_ZTSSt12bad_any_cast@@Base-0x35f04>
      e5f4a8:	6a 08                	push   0x8
      e5f4aa:	5e                   	pop    rsi
      e5f4ab:	4c 89 f2             	mov    rdx,r14
      e5f4ae:	48 89 c1             	mov    rcx,rax
      e5f4b1:	e8 ca c3 c1 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
      e5f4b6:	84 c0                	test   al,al
      e5f4b8:	0f 84 6f 08 00 00    	je     e5fd2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27143>
      e5f4be:	48 8d 35 da 7d 51 ff 	lea    rsi,[rip+0xffffffffff517dda]        # 37729f <_ZTSSt12bad_any_cast@@Base-0x18f29>
      e5f4c5:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f4cc:	00 
      e5f4cd:	31 c0                	xor    eax,eax
      e5f4cf:	e8 c6 c7 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f4d4:	83 3d dd a4 ac 00 06 	cmp    DWORD PTR [rip+0xaca4dd],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f4db:	0f 8c a1 16 00 00    	jl     e60b82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f98>
      e5f4e1:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f4e8:	01 
      e5f4e9:	0f 84 6e 16 00 00    	je     e60b5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f73>
      e5f4ef:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f4f6:	00 
      e5f4f7:	e9 69 16 00 00       	jmp    e60b65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f7b>
      e5f4fc:	4c 8d 84 24 01 01 00 	lea    r8,[rsp+0x101]
      e5f503:	00 
      e5f504:	48 8d 35 71 2a 5f ff 	lea    rsi,[rip+0xffffffffff5f2a71]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e5f50b:	48 8d 0d fd f7 4e ff 	lea    rcx,[rip+0xffffffffff4ef7fd]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e5f512:	6a 06                	push   0x6
      e5f514:	5f                   	pop    rdi
      e5f515:	ba b7 01 00 00       	mov    edx,0x1b7
      e5f51a:	31 c0                	xor    eax,eax
      e5f51c:	e8 b1 73 97 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e5f521:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e5f525:	48 85 ff             	test   rdi,rdi
      e5f528:	0f 84 37 f6 ff ff    	je     e5eb65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f7b>

### caller/xfer 0xe5f65a; FDE=(15067564, 15076953)
      e5f628:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
      e5f62b:	0f 57 c0             	xorps  xmm0,xmm0
      e5f62e:	0f 29 84 24 00 01 00 	movaps XMMWORD PTR [rsp+0x100],xmm0
      e5f635:	00 
      e5f636:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
      e5f63d:	00 00 
      e5f63f:	e8 b4 e9 ff ff       	call   e5dff8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2540e>
      e5f644:	e9 0f f5 ff ff       	jmp    e5eb58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f6e>
      e5f649:	48 8d 35 ae ac 51 ff 	lea    rsi,[rip+0xffffffffff51acae]        # 37a2fe <_ZTSSt12bad_any_cast@@Base-0x15eca>
      e5f650:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f657:	00 
      e5f658:	31 c0                	xor    eax,eax
      e5f65a:	e8 3b c6 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f65f:	83 3d 52 a3 ac 00 06 	cmp    DWORD PTR [rip+0xaca352],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f666:	0f 8c f1 02 00 00    	jl     e5f95d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d73>
      e5f66c:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f673:	01 
      e5f674:	0f 84 be 02 00 00    	je     e5f938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d4e>
      e5f67a:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f681:	00 
      e5f682:	e9 b9 02 00 00       	jmp    e5f940 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d56>
      e5f687:	48 8d 3d 98 4a 50 ff 	lea    rdi,[rip+0xffffffffff504a98]        # 364126 <_ZTSSt12bad_any_cast@@Base-0x2c0a2>
      e5f68e:	6a 05                	push   0x5
      e5f690:	5e                   	pop    rsi
      e5f691:	4c 89 f2             	mov    rdx,r14
      e5f694:	4c 89 f9             	mov    rcx,r15
      e5f697:	e8 e4 c1 c1 ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
      e5f69c:	84 c0                	test   al,al
      e5f69e:	0f 84 ce f4 ff ff    	je     e5eb72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f88>
      e5f6a4:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
      e5f6ab:	00 
      e5f6ac:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      e5f6b0:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]

### caller/xfer 0xe5f727; FDE=(15067564, 15076953)
      e5f6f3:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
      e5f6f7:	41 0f 95 c7          	setne  r15b
      e5f6fb:	f6 84 24 b8 00 00 00 	test   BYTE PTR [rsp+0xb8],0x1
      e5f702:	01 
      e5f703:	0f 84 e9 07 00 00    	je     e5fef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27308>
      e5f709:	48 8b 94 24 c8 00 00 	mov    rdx,QWORD PTR [rsp+0xc8]
      e5f710:	00 
      e5f711:	e9 e4 07 00 00       	jmp    e5fefa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27310>
      e5f716:	48 8d 35 9d 0e 52 ff 	lea    rsi,[rip+0xffffffffff520e9d]        # 3805ba <_ZTSSt12bad_any_cast@@Base-0xfc0e>
      e5f71d:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f724:	00 
      e5f725:	31 c0                	xor    eax,eax
      e5f727:	e8 6e c5 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f72c:	83 3d 85 a2 ac 00 06 	cmp    DWORD PTR [rip+0xaca285],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f733:	0f 8c b8 03 00 00    	jl     e5faf1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f07>
      e5f739:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f740:	01 
      e5f741:	0f 84 85 03 00 00    	je     e5facc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ee2>
      e5f747:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f74e:	00 
      e5f74f:	e9 80 03 00 00       	jmp    e5fad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eea>
      e5f754:	48 8d 35 06 bc 4c ff 	lea    rsi,[rip+0xffffffffff4cbc06]        # 32b361 <_ZTSSt12bad_any_cast@@Base-0x64e67>
      e5f75b:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f762:	00 
      e5f763:	31 c0                	xor    eax,eax
      e5f765:	e8 30 c5 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f76a:	83 3d 47 a2 ac 00 06 	cmp    DWORD PTR [rip+0xaca247],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f771:	0f 8c 79 04 00 00    	jl     e5fbf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27006>
      e5f777:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f77e:	01 
      e5f77f:	0f 84 46 04 00 00    	je     e5fbcb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fe1>
      e5f785:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f78c:	00 

### caller/xfer 0xe5f765; FDE=(15067564, 15076953)
      e5f72c:	83 3d 85 a2 ac 00 06 	cmp    DWORD PTR [rip+0xaca285],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f733:	0f 8c b8 03 00 00    	jl     e5faf1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f07>
      e5f739:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f740:	01 
      e5f741:	0f 84 85 03 00 00    	je     e5facc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ee2>
      e5f747:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f74e:	00 
      e5f74f:	e9 80 03 00 00       	jmp    e5fad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eea>
      e5f754:	48 8d 35 06 bc 4c ff 	lea    rsi,[rip+0xffffffffff4cbc06]        # 32b361 <_ZTSSt12bad_any_cast@@Base-0x64e67>
      e5f75b:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5f762:	00 
      e5f763:	31 c0                	xor    eax,eax
      e5f765:	e8 30 c5 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5f76a:	83 3d 47 a2 ac 00 06 	cmp    DWORD PTR [rip+0xaca247],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5f771:	0f 8c 79 04 00 00    	jl     e5fbf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27006>
      e5f777:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5f77e:	01 
      e5f77f:	0f 84 46 04 00 00    	je     e5fbcb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fe1>
      e5f785:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5f78c:	00 
      e5f78d:	e9 41 04 00 00       	jmp    e5fbd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fe9>
      e5f792:	4c 8d 84 24 01 01 00 	lea    r8,[rsp+0x101]
      e5f799:	00 
      e5f79a:	48 8d 35 db 27 5f ff 	lea    rsi,[rip+0xffffffffff5f27db]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e5f7a1:	48 8d 0d 67 f5 4e ff 	lea    rcx,[rip+0xffffffffff4ef567]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e5f7a8:	6a 06                	push   0x6
      e5f7aa:	5f                   	pop    rdi
      e5f7ab:	ba 09 02 00 00       	mov    edx,0x209
      e5f7b0:	31 c0                	xor    eax,eax
      e5f7b2:	e8 1b 71 97 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e5f7b7:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e5f7bb:	48 85 ff             	test   rdi,rdi
      e5f7be:	74 45                	je     e5f805 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c1b>

### caller/xfer 0xe5fa8a; FDE=(15067564, 15076953)
      e5fa62:	75 dc                	jne    e5fa40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e56>
      e5fa64:	4d 39 ee             	cmp    r14,r13
      e5fa67:	74 4e                	je     e5fab7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ecd>
      e5fa69:	49 8d 76 20          	lea    rsi,[r14+0x20]
      e5fa6d:	4c 89 ff             	mov    rdi,r15
      e5fa70:	e8 44 c1 c9 ff       	call   afbbb9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x48b59>
      e5fa75:	84 c0                	test   al,al
      e5fa77:	78 3e                	js     e5fab7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ecd>
      e5fa79:	48 8d 35 b2 db 50 ff 	lea    rsi,[rip+0xffffffffff50dbb2]        # 36d632 <_ZTSSt12bad_any_cast@@Base-0x22b96>
      e5fa80:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5fa87:	00 
      e5fa88:	31 c0                	xor    eax,eax
      e5fa8a:	e8 0b c2 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5fa8f:	83 3d 22 9f ac 00 06 	cmp    DWORD PTR [rip+0xac9f22],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5fa96:	0f 8c f5 0b 00 00    	jl     e60691 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27aa7>
      e5fa9c:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5faa3:	01 
      e5faa4:	0f 84 c2 0b 00 00    	je     e6066c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a82>
      e5faaa:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5fab1:	00 
      e5fab2:	e9 bd 0b 00 00       	jmp    e60674 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a8a>
      e5fab7:	31 c0                	xor    eax,eax
      e5fab9:	88 84 24 e0 00 00 00 	mov    BYTE PTR [rsp+0xe0],al
      e5fac0:	88 84 24 f8 00 00 00 	mov    BYTE PTR [rsp+0xf8],al
      e5fac7:	e9 34 0c 00 00       	jmp    e60700 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27b16>
      e5facc:	4c 8d 84 24 01 01 00 	lea    r8,[rsp+0x101]
      e5fad3:	00 
      e5fad4:	48 8d 35 a1 24 5f ff 	lea    rsi,[rip+0xffffffffff5f24a1]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e5fadb:	48 8d 0d 2d f2 4e ff 	lea    rcx,[rip+0xffffffffff4ef22d]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e5fae2:	6a 06                	push   0x6
      e5fae4:	5f                   	pop    rdi
      e5fae5:	ba 59 02 00 00       	mov    edx,0x259
      e5faea:	31 c0                	xor    eax,eax

### caller/xfer 0xe5fcc2; FDE=(15067564, 15076953)
      e5fc90:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
      e5fc93:	0f 57 c0             	xorps  xmm0,xmm0
      e5fc96:	0f 29 84 24 70 01 00 	movaps XMMWORD PTR [rsp+0x170],xmm0
      e5fc9d:	00 
      e5fc9e:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
      e5fca5:	00 00 
      e5fca7:	e8 4c e3 ff ff       	call   e5dff8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2540e>
      e5fcac:	e9 8a 07 00 00       	jmp    e6043b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27851>
      e5fcb1:	48 8d 35 46 70 52 ff 	lea    rsi,[rip+0xffffffffff527046]        # 386cfe <_ZTSSt12bad_any_cast@@Base-0x94ca>
      e5fcb8:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5fcbf:	00 
      e5fcc0:	31 c0                	xor    eax,eax
      e5fcc2:	e8 d3 bf 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5fcc7:	83 3d ea 9c ac 00 06 	cmp    DWORD PTR [rip+0xac9cea],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5fcce:	0f 8c a1 06 00 00    	jl     e60375 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2778b>
      e5fcd4:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5fcdb:	01 
      e5fcdc:	0f 84 6e 06 00 00    	je     e60350 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27766>
      e5fce2:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5fce9:	00 
      e5fcea:	e9 69 06 00 00       	jmp    e60358 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2776e>
      e5fcef:	48 8d 35 66 d9 50 ff 	lea    rsi,[rip+0xffffffffff50d966]        # 36d65c <_ZTSSt12bad_any_cast@@Base-0x22b6c>
      e5fcf6:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e5fcfd:	00 
      e5fcfe:	31 c0                	xor    eax,eax
      e5fd00:	e8 95 bf 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5fd05:	83 3d ac 9c ac 00 06 	cmp    DWORD PTR [rip+0xac9cac],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5fd0c:	0f 8c e8 06 00 00    	jl     e603fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27810>
      e5fd12:	f6 84 24 70 01 00 00 	test   BYTE PTR [rsp+0x170],0x1
      e5fd19:	01 
      e5fd1a:	0f 84 b5 06 00 00    	je     e603d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277eb>
      e5fd20:	4c 8b 84 24 80 01 00 	mov    r8,QWORD PTR [rsp+0x180]
      e5fd27:	00 

### caller/xfer 0xe5fd00; FDE=(15067564, 15076953)
      e5fcc7:	83 3d ea 9c ac 00 06 	cmp    DWORD PTR [rip+0xac9cea],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5fcce:	0f 8c a1 06 00 00    	jl     e60375 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2778b>
      e5fcd4:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5fcdb:	01 
      e5fcdc:	0f 84 6e 06 00 00    	je     e60350 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27766>
      e5fce2:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5fce9:	00 
      e5fcea:	e9 69 06 00 00       	jmp    e60358 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2776e>
      e5fcef:	48 8d 35 66 d9 50 ff 	lea    rsi,[rip+0xffffffffff50d966]        # 36d65c <_ZTSSt12bad_any_cast@@Base-0x22b6c>
      e5fcf6:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e5fcfd:	00 
      e5fcfe:	31 c0                	xor    eax,eax
      e5fd00:	e8 95 bf 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5fd05:	83 3d ac 9c ac 00 06 	cmp    DWORD PTR [rip+0xac9cac],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5fd0c:	0f 8c e8 06 00 00    	jl     e603fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27810>
      e5fd12:	f6 84 24 70 01 00 00 	test   BYTE PTR [rsp+0x170],0x1
      e5fd19:	01 
      e5fd1a:	0f 84 b5 06 00 00    	je     e603d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277eb>
      e5fd20:	4c 8b 84 24 80 01 00 	mov    r8,QWORD PTR [rsp+0x180]
      e5fd27:	00 
      e5fd28:	e9 b0 06 00 00       	jmp    e603dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277f3>
      e5fd2d:	48 8d 35 f0 a4 50 ff 	lea    rsi,[rip+0xffffffffff50a4f0]        # 36a224 <_ZTSSt12bad_any_cast@@Base-0x25fa4>
      e5fd34:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5fd3b:	00 
      e5fd3c:	31 c0                	xor    eax,eax
      e5fd3e:	e8 57 bf 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5fd43:	83 3d 6e 9c ac 00 06 	cmp    DWORD PTR [rip+0xac9c6e],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5fd4a:	0f 8c 3c 07 00 00    	jl     e6048c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278a2>
      e5fd50:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5fd57:	01 
      e5fd58:	0f 84 09 07 00 00    	je     e60467 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2787d>
      e5fd5e:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5fd65:	00 

### caller/xfer 0xe5fd3e; FDE=(15067564, 15076953)
      e5fd05:	83 3d ac 9c ac 00 06 	cmp    DWORD PTR [rip+0xac9cac],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5fd0c:	0f 8c e8 06 00 00    	jl     e603fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27810>
      e5fd12:	f6 84 24 70 01 00 00 	test   BYTE PTR [rsp+0x170],0x1
      e5fd19:	01 
      e5fd1a:	0f 84 b5 06 00 00    	je     e603d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277eb>
      e5fd20:	4c 8b 84 24 80 01 00 	mov    r8,QWORD PTR [rsp+0x180]
      e5fd27:	00 
      e5fd28:	e9 b0 06 00 00       	jmp    e603dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277f3>
      e5fd2d:	48 8d 35 f0 a4 50 ff 	lea    rsi,[rip+0xffffffffff50a4f0]        # 36a224 <_ZTSSt12bad_any_cast@@Base-0x25fa4>
      e5fd34:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5fd3b:	00 
      e5fd3c:	31 c0                	xor    eax,eax
      e5fd3e:	e8 57 bf 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5fd43:	83 3d 6e 9c ac 00 06 	cmp    DWORD PTR [rip+0xac9c6e],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5fd4a:	0f 8c 3c 07 00 00    	jl     e6048c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278a2>
      e5fd50:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5fd57:	01 
      e5fd58:	0f 84 09 07 00 00    	je     e60467 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2787d>
      e5fd5e:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5fd65:	00 
      e5fd66:	e9 04 07 00 00       	jmp    e6046f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27885>
      e5fd6b:	4c 8d 84 24 01 01 00 	lea    r8,[rsp+0x101]
      e5fd72:	00 
      e5fd73:	48 8d 35 02 22 5f ff 	lea    rsi,[rip+0xffffffffff5f2202]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e5fd7a:	48 8d 0d 8e ef 4e ff 	lea    rcx,[rip+0xffffffffff4eef8e]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e5fd81:	6a 06                	push   0x6
      e5fd83:	5f                   	pop    rdi
      e5fd84:	ba ef 01 00 00       	mov    edx,0x1ef
      e5fd89:	31 c0                	xor    eax,eax
      e5fd8b:	e8 42 6b 97 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e5fd90:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e5fd94:	48 85 ff             	test   rdi,rdi
      e5fd97:	74 45                	je     e5fdde <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271f4>

### caller/xfer 0xe5ff0b; FDE=(15067564, 15076953)
      e5fede:	6a 07                	push   0x7
      e5fee0:	5e                   	pop    rsi
      e5fee1:	e8 fc 0f 00 00       	call   e60ee2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282f8>
      e5fee6:	e9 6a 05 00 00       	jmp    e60455 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2786b>
      e5feeb:	31 c0                	xor    eax,eax
      e5feed:	e9 2f 01 00 00       	jmp    e60021 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27437>
      e5fef2:	48 8d 94 24 b9 00 00 	lea    rdx,[rsp+0xb9]
      e5fef9:	00 
      e5fefa:	48 8d 35 22 3b 51 ff 	lea    rsi,[rip+0xffffffffff513b22]        # 373a23 <_ZTSSt12bad_any_cast@@Base-0x1c7a5>
      e5ff01:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e5ff08:	00 
      e5ff09:	31 c0                	xor    eax,eax
      e5ff0b:	e8 8a bd 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5ff10:	83 3d a1 9a ac 00 06 	cmp    DWORD PTR [rip+0xac9aa1],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5ff17:	7c 39                	jl     e5ff52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27368>
      e5ff19:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e5ff20:	01 
      e5ff21:	74 0a                	je     e5ff2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27343>
      e5ff23:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e5ff2a:	00 
      e5ff2b:	eb 08                	jmp    e5ff35 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2734b>
      e5ff2d:	4c 8d 84 24 01 01 00 	lea    r8,[rsp+0x101]
      e5ff34:	00 
      e5ff35:	48 8d 35 40 20 5f ff 	lea    rsi,[rip+0xffffffffff5f2040]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e5ff3c:	48 8d 0d cc ed 4e ff 	lea    rcx,[rip+0xffffffffff4eedcc]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e5ff43:	6a 06                	push   0x6
      e5ff45:	5f                   	pop    rdi
      e5ff46:	ba fe 01 00 00       	mov    edx,0x1fe
      e5ff4b:	31 c0                	xor    eax,eax
      e5ff4d:	e8 80 69 97 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e5ff52:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e5ff56:	48 85 ff             	test   rdi,rdi
      e5ff59:	74 45                	je     e5ffa0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273b6>

### caller/xfer 0xe5ffeb; FDE=(15067564, 15076953)
      e5ffb5:	48 b8 02 00 00 00 01 	movabs rax,0x100000002
      e5ffbc:	00 00 00 
      e5ffbf:	48 8d 50 05          	lea    rdx,[rax+0x5]
      e5ffc3:	45 84 ff             	test   r15b,r15b
      e5ffc6:	48 0f 44 d0          	cmove  rdx,rax
      e5ffca:	e9 25 05 00 00       	jmp    e604f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2790a>
      e5ffcf:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      e5ffd3:	c6 80 12 03 00 00 00 	mov    BYTE PTR [rax+0x312],0x0
      e5ffda:	48 8d 35 ec a2 51 ff 	lea    rsi,[rip+0xffffffffff51a2ec]        # 37a2cd <_ZTSSt12bad_any_cast@@Base-0x15efb>
      e5ffe1:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e5ffe8:	00 
      e5ffe9:	31 c0                	xor    eax,eax
      e5ffeb:	e8 aa bc 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e5fff0:	83 3d c1 99 ac 00 06 	cmp    DWORD PTR [rip+0xac99c1],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e5fff7:	0f 8c cc 09 00 00    	jl     e609c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ddf>
      e5fffd:	f6 84 24 70 01 00 00 	test   BYTE PTR [rsp+0x170],0x1
      e60004:	01 
      e60005:	0f 84 99 09 00 00    	je     e609a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dba>
      e6000b:	4c 8b 84 24 80 01 00 	mov    r8,QWORD PTR [rsp+0x180]
      e60012:	00 
      e60013:	e9 94 09 00 00       	jmp    e609ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dc2>
      e60018:	4d 89 e5             	mov    r13,r12
      e6001b:	4d 39 ec             	cmp    r12,r13
      e6001e:	0f 95 c0             	setne  al
      e60021:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e60025:	88 81 12 03 00 00    	mov    BYTE PTR [rcx+0x312],al
      e6002b:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      e6002f:	0f b6 90 12 03 00 00 	movzx  edx,BYTE PTR [rax+0x312]
      e60036:	48 8d 35 b9 0a 51 ff 	lea    rsi,[rip+0xffffffffff510ab9]        # 370af6 <_ZTSSt12bad_any_cast@@Base-0x1f6d2>
      e6003d:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e60044:	00 
      e60045:	31 c0                	xor    eax,eax
      e60047:	e8 4e bc 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>

### caller/xfer 0xe60047; FDE=(15067564, 15076953)
      e60013:	e9 94 09 00 00       	jmp    e609ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dc2>
      e60018:	4d 89 e5             	mov    r13,r12
      e6001b:	4d 39 ec             	cmp    r12,r13
      e6001e:	0f 95 c0             	setne  al
      e60021:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e60025:	88 81 12 03 00 00    	mov    BYTE PTR [rcx+0x312],al
      e6002b:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      e6002f:	0f b6 90 12 03 00 00 	movzx  edx,BYTE PTR [rax+0x312]
      e60036:	48 8d 35 b9 0a 51 ff 	lea    rsi,[rip+0xffffffffff510ab9]        # 370af6 <_ZTSSt12bad_any_cast@@Base-0x1f6d2>
      e6003d:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e60044:	00 
      e60045:	31 c0                	xor    eax,eax
      e60047:	e8 4e bc 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e6004c:	83 3d 65 99 ac 00 06 	cmp    DWORD PTR [rip+0xac9965],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e60053:	7c 39                	jl     e6008e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274a4>
      e60055:	f6 84 24 70 01 00 00 	test   BYTE PTR [rsp+0x170],0x1
      e6005c:	01 
      e6005d:	74 0a                	je     e60069 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2747f>
      e6005f:	4c 8b 84 24 80 01 00 	mov    r8,QWORD PTR [rsp+0x180]
      e60066:	00 
      e60067:	eb 08                	jmp    e60071 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27487>
      e60069:	4c 8d 84 24 71 01 00 	lea    r8,[rsp+0x171]
      e60070:	00 
      e60071:	48 8d 35 04 1f 5f ff 	lea    rsi,[rip+0xffffffffff5f1f04]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e60078:	48 8d 0d 90 ec 4e ff 	lea    rcx,[rip+0xffffffffff4eec90]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e6007f:	6a 06                	push   0x6
      e60081:	5f                   	pop    rdi
      e60082:	ba 2c 02 00 00       	mov    edx,0x22c
      e60087:	31 c0                	xor    eax,eax
      e60089:	e8 44 68 97 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e6008e:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e60092:	48 85 ff             	test   rdi,rdi
      e60095:	74 45                	je     e600dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f2>

### caller/xfer 0xe60125; FDE=(15067564, 15076953)
      e600e9:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e600f0:	00 
      e600f1:	e8 32 b4 e1 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
      e600f6:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      e600fa:	80 b8 10 03 00 00 00 	cmp    BYTE PTR [rax+0x310],0x0
      e60101:	0f 84 6b ea ff ff    	je     e5eb72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f88>
      e60107:	80 b8 11 03 00 00 00 	cmp    BYTE PTR [rax+0x311],0x0
      e6010e:	0f 84 5e ea ff ff    	je     e5eb72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f88>
      e60114:	48 8d 35 b5 67 4e ff 	lea    rsi,[rip+0xffffffffff4e67b5]        # 3468d0 <_ZTSSt12bad_any_cast@@Base-0x498f8>
      e6011b:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e60122:	00 
      e60123:	31 c0                	xor    eax,eax
      e60125:	e8 70 bb 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e6012a:	83 3d 87 98 ac 00 06 	cmp    DWORD PTR [rip+0xac9887],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e60131:	7c 39                	jl     e6016c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27582>
      e60133:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e6013a:	01 
      e6013b:	74 0a                	je     e60147 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2755d>
      e6013d:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e60144:	00 
      e60145:	eb 08                	jmp    e6014f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27565>
      e60147:	4c 8d 84 24 01 01 00 	lea    r8,[rsp+0x101]
      e6014e:	00 
      e6014f:	48 8d 35 26 1e 5f ff 	lea    rsi,[rip+0xffffffffff5f1e26]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e60156:	48 8d 0d b2 eb 4e ff 	lea    rcx,[rip+0xffffffffff4eebb2]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e6015d:	6a 06                	push   0x6
      e6015f:	5f                   	pop    rdi
      e60160:	ba 33 02 00 00       	mov    edx,0x233
      e60165:	31 c0                	xor    eax,eax
      e60167:	e8 66 67 97 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e6016c:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e60170:	48 85 ff             	test   rdi,rdi
      e60173:	74 45                	je     e601ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275d0>

### caller/xfer 0xe60512; FDE=(15067564, 15076953)
      e604e2:	e8 a9 d9 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e604e7:	6a 01                	push   0x1
      e604e9:	5e                   	pop    rsi
      e604ea:	48 ba 02 00 00 00 01 	movabs rdx,0x100000002
      e604f1:	00 00 00 
      e604f4:	48 89 df             	mov    rdi,rbx
      e604f7:	e8 a0 dc ff ff       	call   e5e19c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255b2>
      e604fc:	e9 71 e6 ff ff       	jmp    e5eb72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f88>
      e60501:	48 8d 35 1a 1c 4d ff 	lea    rsi,[rip+0xffffffffff4d1c1a]        # 332122 <_ZTSSt12bad_any_cast@@Base-0x5e0a6>
      e60508:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e6050f:	00 
      e60510:	31 c0                	xor    eax,eax
      e60512:	e8 83 b7 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e60517:	83 3d 9a 94 ac 00 06 	cmp    DWORD PTR [rip+0xac949a],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e6051e:	0f 8c 42 05 00 00    	jl     e60a66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e7c>
      e60524:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e6052b:	01 
      e6052c:	0f 84 0f 05 00 00    	je     e60a41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e57>
      e60532:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e60539:	00 
      e6053a:	e9 0a 05 00 00       	jmp    e60a49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e5f>
      e6053f:	4c 8d 6d 08          	lea    r13,[rbp+0x8]
      e60543:	6a 50                	push   0x50
      e60545:	5f                   	pop    rdi
      e60546:	e8 b5 d9 98 00       	call   17edf00 <_Znwm@plt>
      e6054b:	49 89 c4             	mov    r12,rax
      e6054e:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
      e60555:	00 
      e60556:	4c 89 b4 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r14
      e6055d:	00 
      e6055e:	c6 84 24 10 01 00 00 	mov    BYTE PTR [rsp+0x110],0x0
      e60565:	00 
      e60566:	4c 8d 70 20          	lea    r14,[rax+0x20]

### caller/xfer 0xe6063f; FDE=(15067564, 15076953)
      e60611:	6a 01                	push   0x1
      e60613:	5e                   	pop    rsi
      e60614:	e8 ff 13 00 00       	call   e61a18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28e2e>
      e60619:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e6061d:	89 81 04 03 00 00    	mov    DWORD PTR [rcx+0x304],eax
      e60623:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e60627:	6a 03                	push   0x3
      e60629:	e9 6b 03 00 00       	jmp    e60999 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27daf>
      e6062e:	48 8d 35 4b 41 4c ff 	lea    rsi,[rip+0xffffffffff4c414b]        # 324780 <_ZTSSt12bad_any_cast@@Base-0x6ba48>
      e60635:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e6063c:	00 
      e6063d:	31 c0                	xor    eax,eax
      e6063f:	e8 56 b6 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e60644:	83 3d 6d 93 ac 00 06 	cmp    DWORD PTR [rip+0xac936d],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e6064b:	0f 8c 52 06 00 00    	jl     e60ca3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280b9>
      e60651:	f6 84 24 00 01 00 00 	test   BYTE PTR [rsp+0x100],0x1
      e60658:	01 
      e60659:	0f 84 1f 06 00 00    	je     e60c7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28094>
      e6065f:	4c 8b 84 24 10 01 00 	mov    r8,QWORD PTR [rsp+0x110]
      e60666:	00 
      e60667:	e9 1a 06 00 00       	jmp    e60c86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2809c>
      e6066c:	4c 8d 84 24 01 01 00 	lea    r8,[rsp+0x101]
      e60673:	00 
      e60674:	48 8d 35 01 19 5f ff 	lea    rsi,[rip+0xffffffffff5f1901]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e6067b:	48 8d 0d 8d e6 4e ff 	lea    rcx,[rip+0xffffffffff4ee68d]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e60682:	6a 06                	push   0x6
      e60684:	5f                   	pop    rdi
      e60685:	ba db 01 00 00       	mov    edx,0x1db
      e6068a:	31 c0                	xor    eax,eax
      e6068c:	e8 41 62 97 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e60691:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e60695:	48 85 ff             	test   rdi,rdi
      e60698:	74 45                	je     e606df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27af5>

### caller/xfer 0xe611a6; FDE=(15077702, 15078379)
      e61174:	48 2b 81 e0 03 00 00 	sub    rax,QWORD PTR [rcx+0x3e0]
      e6117b:	48 69 93 a8 00 00 00 	imul   rdx,QWORD PTR [rbx+0xa8],0x3b9aca00
      e61182:	00 ca 9a 3b 
      e61186:	48 39 d0             	cmp    rax,rdx
      e61189:	7e 42                	jle    e611cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285e3>
      e6118b:	b9 40 42 0f 00       	mov    ecx,0xf4240
      e61190:	48 99                	cqo
      e61192:	48 f7 f9             	idiv   rcx
      e61195:	48 8d 35 51 17 4f ff 	lea    rsi,[rip+0xffffffffff4f1751]        # 3528ed <_ZTSSt12bad_any_cast@@Base-0x3d8db>
      e6119c:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      e611a1:	48 89 c2             	mov    rdx,rax
      e611a4:	31 c0                	xor    eax,eax
      e611a6:	e8 ef aa 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e611ab:	83 3d 06 88 ac 00 06 	cmp    DWORD PTR [rip+0xac8806],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e611b2:	0f 8c ba 00 00 00    	jl     e61272 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28688>
      e611b8:	f6 44 24 60 01       	test   BYTE PTR [rsp+0x60],0x1
      e611bd:	0f 84 8d 00 00 00    	je     e61250 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28666>
      e611c3:	4c 8b 44 24 70       	mov    r8,QWORD PTR [rsp+0x70]
      e611c8:	e9 88 00 00 00       	jmp    e61255 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2866b>
      e611cd:	48 8d b9 18 03 00 00 	lea    rdi,[rcx+0x318]
      e611d4:	48 8d 71 28          	lea    rsi,[rcx+0x28]
      e611d8:	40 0f b6 d5          	movzx  edx,bpl
      e611dc:	ff 91 30 03 00 00    	call   QWORD PTR [rcx+0x330]
      e611e2:	84 c0                	test   al,al
      e611e4:	74 35                	je     e6121b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28631>
      e611e6:	48 8d 35 ed ac 4d ff 	lea    rsi,[rip+0xffffffffff4daced]        # 33beda <_ZTSSt12bad_any_cast@@Base-0x542ee>
      e611ed:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      e611f2:	31 c0                	xor    eax,eax
      e611f4:	e8 a1 aa 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e611f9:	83 3d b8 87 ac 00 06 	cmp    DWORD PTR [rip+0xac87b8],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e61200:	0f 8c e3 00 00 00    	jl     e612e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286ff>
      e61206:	f6 44 24 60 01       	test   BYTE PTR [rsp+0x60],0x1
      e6120b:	0f 84 b6 00 00 00    	je     e612c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286dd>

### caller/xfer 0xe611f4; FDE=(15077702, 15078379)
      e611bd:	0f 84 8d 00 00 00    	je     e61250 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28666>
      e611c3:	4c 8b 44 24 70       	mov    r8,QWORD PTR [rsp+0x70]
      e611c8:	e9 88 00 00 00       	jmp    e61255 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2866b>
      e611cd:	48 8d b9 18 03 00 00 	lea    rdi,[rcx+0x318]
      e611d4:	48 8d 71 28          	lea    rsi,[rcx+0x28]
      e611d8:	40 0f b6 d5          	movzx  edx,bpl
      e611dc:	ff 91 30 03 00 00    	call   QWORD PTR [rcx+0x330]
      e611e2:	84 c0                	test   al,al
      e611e4:	74 35                	je     e6121b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28631>
      e611e6:	48 8d 35 ed ac 4d ff 	lea    rsi,[rip+0xffffffffff4daced]        # 33beda <_ZTSSt12bad_any_cast@@Base-0x542ee>
      e611ed:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      e611f2:	31 c0                	xor    eax,eax
      e611f4:	e8 a1 aa 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e611f9:	83 3d b8 87 ac 00 06 	cmp    DWORD PTR [rip+0xac87b8],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e61200:	0f 8c e3 00 00 00    	jl     e612e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286ff>
      e61206:	f6 44 24 60 01       	test   BYTE PTR [rsp+0x60],0x1
      e6120b:	0f 84 b6 00 00 00    	je     e612c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286dd>
      e61211:	4c 8b 44 24 70       	mov    r8,QWORD PTR [rsp+0x70]
      e61216:	e9 b1 00 00 00       	jmp    e612cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286e2>
      e6121b:	48 8d 35 85 57 50 ff 	lea    rsi,[rip+0xffffffffff505785]        # 3669a7 <_ZTSSt12bad_any_cast@@Base-0x29821>
      e61222:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      e61227:	31 c0                	xor    eax,eax
      e61229:	e8 6c aa 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e6122e:	83 3d 83 87 ac 00 06 	cmp    DWORD PTR [rip+0xac8783],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e61235:	0f 8c 1e 01 00 00    	jl     e61359 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876f>
      e6123b:	f6 44 24 60 01       	test   BYTE PTR [rsp+0x60],0x1
      e61240:	0f 84 f1 00 00 00    	je     e61337 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874d>
      e61246:	4c 8b 44 24 70       	mov    r8,QWORD PTR [rsp+0x70]
      e6124b:	e9 ec 00 00 00       	jmp    e6133c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28752>
      e61250:	4c 8d 44 24 61       	lea    r8,[rsp+0x61]
      e61255:	48 8d 35 20 0d 5f ff 	lea    rsi,[rip+0xffffffffff5f0d20]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e6125c:	48 8d 0d ac da 4e ff 	lea    rcx,[rip+0xffffffffff4edaac]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e61263:	6a 06                	push   0x6

### caller/xfer 0xe61229; FDE=(15077702, 15078379)
      e611ed:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      e611f2:	31 c0                	xor    eax,eax
      e611f4:	e8 a1 aa 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e611f9:	83 3d b8 87 ac 00 06 	cmp    DWORD PTR [rip+0xac87b8],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e61200:	0f 8c e3 00 00 00    	jl     e612e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286ff>
      e61206:	f6 44 24 60 01       	test   BYTE PTR [rsp+0x60],0x1
      e6120b:	0f 84 b6 00 00 00    	je     e612c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286dd>
      e61211:	4c 8b 44 24 70       	mov    r8,QWORD PTR [rsp+0x70]
      e61216:	e9 b1 00 00 00       	jmp    e612cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286e2>
      e6121b:	48 8d 35 85 57 50 ff 	lea    rsi,[rip+0xffffffffff505785]        # 3669a7 <_ZTSSt12bad_any_cast@@Base-0x29821>
      e61222:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      e61227:	31 c0                	xor    eax,eax
      e61229:	e8 6c aa 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e6122e:	83 3d 83 87 ac 00 06 	cmp    DWORD PTR [rip+0xac8783],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e61235:	0f 8c 1e 01 00 00    	jl     e61359 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876f>
      e6123b:	f6 44 24 60 01       	test   BYTE PTR [rsp+0x60],0x1
      e61240:	0f 84 f1 00 00 00    	je     e61337 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874d>
      e61246:	4c 8b 44 24 70       	mov    r8,QWORD PTR [rsp+0x70]
      e6124b:	e9 ec 00 00 00       	jmp    e6133c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28752>
      e61250:	4c 8d 44 24 61       	lea    r8,[rsp+0x61]
      e61255:	48 8d 35 20 0d 5f ff 	lea    rsi,[rip+0xffffffffff5f0d20]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e6125c:	48 8d 0d ac da 4e ff 	lea    rcx,[rip+0xffffffffff4edaac]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e61263:	6a 06                	push   0x6
      e61265:	5f                   	pop    rdi
      e61266:	ba a5 02 00 00       	mov    edx,0x2a5
      e6126b:	31 c0                	xor    eax,eax
      e6126d:	e8 60 56 97 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e61272:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
      e61276:	48 85 ff             	test   rdi,rdi
      e61279:	74 2f                	je     e612aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286c0>
      e6127b:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e61280:	48 89 e6             	mov    rsi,rsp
      e61283:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax

### caller/xfer 0xe61574; FDE=(15078636, 15079914)
      e6154b:	01 
      e6154c:	8b 0a                	mov    ecx,DWORD PTR [rdx]
      e6154e:	48 8b 52 08          	mov    rdx,QWORD PTR [rdx+0x8]
      e61552:	89 4c 24 28          	mov    DWORD PTR [rsp+0x28],ecx
      e61556:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
      e6155b:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
      e6155f:	84 c0                	test   al,al
      e61561:	74 33                	je     e61596 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x289ac>
      e61563:	48 8d 35 a7 54 50 ff 	lea    rsi,[rip+0xffffffffff5054a7]        # 366a11 <_ZTSSt12bad_any_cast@@Base-0x297b7>
      e6156a:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      e61571:	00 
      e61572:	31 c0                	xor    eax,eax
      e61574:	e8 21 a7 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e61579:	83 3d 38 84 ac 00 06 	cmp    DWORD PTR [rip+0xac8438],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e61580:	7c 66                	jl     e615e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x289fe>
      e61582:	f6 84 24 f0 00 00 00 	test   BYTE PTR [rsp+0xf0],0x1
      e61589:	01 
      e6158a:	74 37                	je     e615c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x289d9>
      e6158c:	4c 8b 84 24 00 01 00 	mov    r8,QWORD PTR [rsp+0x100]
      e61593:	00 
      e61594:	eb 35                	jmp    e615cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x289e1>
      e61596:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      e6159d:	00 
      e6159e:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      e615a3:	e8 38 cf 98 00       	call   17ee4e0 <_ZNKSt6__ndk110error_code7messageEv@plt>
      e615a8:	f6 84 24 d0 00 00 00 	test   BYTE PTR [rsp+0xd0],0x1
      e615af:	01 
      e615b0:	0f 84 93 02 00 00    	je     e61849 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28c5f>
      e615b6:	4c 8b bc 24 e0 00 00 	mov    r15,QWORD PTR [rsp+0xe0]
      e615bd:	00 
      e615be:	e9 8e 02 00 00       	jmp    e61851 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28c67>
      e615c3:	4c 8d 84 24 f1 00 00 	lea    r8,[rsp+0xf1]
      e615ca:	00 

### caller/xfer 0xe61891; FDE=(15078636, 15079914)
      e61864:	41 f6 04 24 01       	test   BYTE PTR [r12],0x1
      e61869:	74 0a                	je     e61875 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28c8b>
      e6186b:	48 8b 8c 24 c0 00 00 	mov    rcx,QWORD PTR [rsp+0xc0]
      e61872:	00 
      e61873:	eb 08                	jmp    e6187d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28c93>
      e61875:	48 8d 8c 24 b1 00 00 	lea    rcx,[rsp+0xb1]
      e6187c:	00 
      e6187d:	48 8d 35 3e 2f 4c ff 	lea    rsi,[rip+0xffffffffff4c2f3e]        # 3247c2 <_ZTSSt12bad_any_cast@@Base-0x6ba06>
      e61884:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      e6188b:	00 
      e6188c:	4c 89 fa             	mov    rdx,r15
      e6188f:	31 c0                	xor    eax,eax
      e61891:	e8 04 a4 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e61896:	4c 89 e7             	mov    rdi,r12
      e61899:	e8 f2 c5 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e6189e:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      e618a5:	00 
      e618a6:	e8 e5 c5 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e618ab:	83 3d 06 81 ac 00 06 	cmp    DWORD PTR [rip+0xac8106],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e618b2:	7c 39                	jl     e618ed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28d03>
      e618b4:	f6 84 24 f0 00 00 00 	test   BYTE PTR [rsp+0xf0],0x1
      e618bb:	01 
      e618bc:	74 0a                	je     e618c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28cde>
      e618be:	4c 8b 84 24 00 01 00 	mov    r8,QWORD PTR [rsp+0x100]
      e618c5:	00 
      e618c6:	eb 08                	jmp    e618d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28ce6>
      e618c8:	4c 8d 84 24 f1 00 00 	lea    r8,[rsp+0xf1]
      e618cf:	00 
      e618d0:	48 8d 35 a5 06 5f ff 	lea    rsi,[rip+0xffffffffff5f06a5]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e618d7:	48 8d 0d 31 d4 4e ff 	lea    rcx,[rip+0xffffffffff4ed431]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
      e618de:	6a 06                	push   0x6
      e618e0:	5f                   	pop    rdi
      e618e1:	ba 1c 02 00 00       	mov    edx,0x21c

### caller/xfer 0xe6b9ce; FDE=(15120420, 15121698)
      e6b998:	00 
      e6b999:	0f 84 91 00 00 00    	je     e6ba30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32e46>
      e6b99f:	48 8d 54 24 21       	lea    rdx,[rsp+0x21]
      e6b9a4:	80 ba bf 01 00 00 00 	cmp    BYTE PTR [rdx+0x1bf],0x0
      e6b9ab:	0f 84 24 02 00 00    	je     e6bbd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32feb>
      e6b9b1:	f6 44 24 20 01       	test   BYTE PTR [rsp+0x20],0x1
      e6b9b6:	74 05                	je     e6b9bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32dd3>
      e6b9b8:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
      e6b9bd:	48 8d 35 c6 73 4f ff 	lea    rsi,[rip+0xffffffffff4f73c6]        # 362d8a <_ZTSSt12bad_any_cast@@Base-0x2d43e>
      e6b9c4:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
      e6b9c9:	4c 89 f7             	mov    rdi,r14
      e6b9cc:	31 c0                	xor    eax,eax
      e6b9ce:	e8 c7 02 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e6b9d3:	48 8d 15 96 34 9c 00 	lea    rdx,[rip+0x9c3496]        # 182ee70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xe08>
      e6b9da:	e9 1f 02 00 00       	jmp    e6bbfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33014>
      e6b9df:	83 3d d2 df ab 00 06 	cmp    DWORD PTR [rip+0xabdfd2],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e6b9e6:	0f 8c f3 02 00 00    	jl     e6bcdf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330f5>
      e6b9ec:	48 8d 35 bf c9 50 ff 	lea    rsi,[rip+0xffffffffff50c9bf]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      e6b9f3:	48 8d 0d 47 53 50 ff 	lea    rcx,[rip+0xffffffffff505347]        # 370d41 <_ZTSSt12bad_any_cast@@Base-0x1f487>
      e6b9fa:	6a 06                	push   0x6
      e6b9fc:	5f                   	pop    rdi
      e6b9fd:	ba ec 04 00 00       	mov    edx,0x4ec
      e6ba02:	31 c0                	xor    eax,eax
      e6ba04:	e8 c9 ae 96 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e6ba09:	e9 d1 02 00 00       	jmp    e6bcdf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330f5>
      e6ba0e:	48 8d 35 cc ed 51 ff 	lea    rsi,[rip+0xffffffffff51edcc]        # 38a7e1 <_ZTSSt12bad_any_cast@@Base-0x59e7>
      e6ba15:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      e6ba1a:	48 8d 94 24 28 03 00 	lea    rdx,[rsp+0x328]
      e6ba21:	00 
      e6ba22:	e8 49 2b 98 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>
      e6ba27:	48 8d 15 12 34 9c 00 	lea    rdx,[rip+0x9c3412]        # 182ee40 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdd8>
      e6ba2e:	eb 18                	jmp    e6ba48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32e5e>
      e6ba30:	48 8d 35 85 b0 4f ff 	lea    rsi,[rip+0xffffffffff4fb085]        # 366abc <_ZTSSt12bad_any_cast@@Base-0x2970c>

### caller/xfer 0xe6bbf2; FDE=(15120420, 15121698)
      e6bbb9:	83 b8 74 01 00 00 03 	cmp    DWORD PTR [rax+0x174],0x3
      e6bbc0:	0f 85 0f 01 00 00    	jne    e6bcd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330eb>
      e6bbc6:	c7 80 74 01 00 00 04 	mov    DWORD PTR [rax+0x174],0x4
      e6bbcd:	00 00 00 
      e6bbd0:	e9 00 01 00 00       	jmp    e6bcd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330eb>
      e6bbd5:	f6 44 24 20 01       	test   BYTE PTR [rsp+0x20],0x1
      e6bbda:	74 05                	je     e6bbe1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32ff7>
      e6bbdc:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
      e6bbe1:	48 8d 35 00 0e 4f ff 	lea    rsi,[rip+0xffffffffff4f0e00]        # 35c9e8 <_ZTSSt12bad_any_cast@@Base-0x337e0>
      e6bbe8:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
      e6bbed:	4c 89 f7             	mov    rdi,r14
      e6bbf0:	31 c0                	xor    eax,eax
      e6bbf2:	e8 a3 00 97 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
      e6bbf7:	48 8d 15 5a 32 9c 00 	lea    rdx,[rip+0x9c325a]        # 182ee58 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdf0>
      e6bbfe:	48 89 df             	mov    rdi,rbx
      e6bc01:	4c 89 f6             	mov    rsi,r14
      e6bc04:	e8 0f c2 ff ff       	call   e67e18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f22e>
      e6bc09:	4c 89 f7             	mov    rdi,r14
      e6bc0c:	e8 7f 22 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e6bc11:	48 8d bc 24 28 03 00 	lea    rdi,[rsp+0x328]
      e6bc18:	00 
      e6bc19:	e8 12 b1 c3 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e6bc1e:	48 8b 43 38          	mov    rax,QWORD PTR [rbx+0x38]
      e6bc22:	48 85 c0             	test   rax,rax
      e6bc25:	74 21                	je     e6bc48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3305e>
      e6bc27:	80 bc 24 e0 01 00 00 	cmp    BYTE PTR [rsp+0x1e0],0x1
      e6bc2e:	01 
      e6bc2f:	6a 04                	push   0x4
      e6bc31:	59                   	pop    rcx
      e6bc32:	89 ca                	mov    edx,ecx
      e6bc34:	83 da 00             	sbb    edx,0x0
      e6bc37:	80 bc 24 20 03 00 00 	cmp    BYTE PTR [rsp+0x320],0x0
      e6bc3e:	00 

### caller/xfer 0x104cd13; FDE=(17091408, 17092258)
     104cce1:	4c 8d 3d 48 c4 33 ff 	lea    r15,[rip+0xffffffffff33c448]        # 389130 <_ZTSSt12bad_any_cast@@Base-0x7098>
     104cce8:	8b 5c 24 14          	mov    ebx,DWORD PTR [rsp+0x14]
     104ccec:	e9 2f 01 00 00       	jmp    104ce20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x214236>
     104ccf1:	8b 5c 24 14          	mov    ebx,DWORD PTR [rsp+0x14]
     104ccf5:	85 db                	test   ebx,ebx
     104ccf7:	0f 84 99 00 00 00    	je     104cd96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2141ac>
     104ccfd:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
     104cd02:	4c 89 e7             	mov    rdi,r12
     104cd05:	4c 89 fe             	mov    rsi,r15
     104cd08:	48 8d 15 02 05 3f ff 	lea    rdx,[rip+0xffffffffff3f0502]        # 43d211 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2e1d>
     104cd0f:	89 d9                	mov    ecx,ebx
     104cd11:	31 c0                	xor    eax,eax
     104cd13:	e8 82 ef 78 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     104cd18:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     104cd1c:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     104cd20:	e8 11 eb a2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     104cd25:	48 89 d1             	mov    rcx,rdx
     104cd28:	48 8b 94 24 10 01 00 	mov    rdx,QWORD PTR [rsp+0x110]
     104cd2f:	00 
     104cd30:	4d 89 e6             	mov    r14,r12
     104cd33:	49 89 d4             	mov    r12,rdx
     104cd36:	48 8b 7a 20          	mov    rdi,QWORD PTR [rdx+0x20]
     104cd3a:	4c 89 f6             	mov    rsi,r14
     104cd3d:	48 89 c2             	mov    rdx,rax
     104cd40:	e8 77 5c e7 ff       	call   ec29bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89dd2>
     104cd45:	4c 89 f7             	mov    rdi,r14
     104cd48:	e8 43 11 7a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     104cd4d:	4c 8d 74 24 28       	lea    r14,[rsp+0x28]
     104cd52:	4c 89 f7             	mov    rdi,r14
     104cd55:	4c 89 fe             	mov    rsi,r15
     104cd58:	48 8d 15 9a 04 3f ff 	lea    rdx,[rip+0xffffffffff3f049a]        # 43d1f9 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2e05>
     104cd5f:	89 d9                	mov    ecx,ebx
     104cd61:	31 c0                	xor    eax,eax

### caller/xfer 0x104cd63; FDE=(17091408, 17092258)
     104cd36:	48 8b 7a 20          	mov    rdi,QWORD PTR [rdx+0x20]
     104cd3a:	4c 89 f6             	mov    rsi,r14
     104cd3d:	48 89 c2             	mov    rdx,rax
     104cd40:	e8 77 5c e7 ff       	call   ec29bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89dd2>
     104cd45:	4c 89 f7             	mov    rdi,r14
     104cd48:	e8 43 11 7a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     104cd4d:	4c 8d 74 24 28       	lea    r14,[rsp+0x28]
     104cd52:	4c 89 f7             	mov    rdi,r14
     104cd55:	4c 89 fe             	mov    rsi,r15
     104cd58:	48 8d 15 9a 04 3f ff 	lea    rdx,[rip+0xffffffffff3f049a]        # 43d1f9 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2e05>
     104cd5f:	89 d9                	mov    ecx,ebx
     104cd61:	31 c0                	xor    eax,eax
     104cd63:	e8 32 ef 78 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     104cd68:	48 89 ef             	mov    rdi,rbp
     104cd6b:	e8 c6 ea a2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     104cd70:	48 89 d1             	mov    rcx,rdx
     104cd73:	49 8b 7c 24 20       	mov    rdi,QWORD PTR [r12+0x20]
     104cd78:	4c 89 f6             	mov    rsi,r14
     104cd7b:	48 89 c2             	mov    rdx,rax
     104cd7e:	e8 39 5c e7 ff       	call   ec29bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89dd2>
     104cd83:	4c 89 f7             	mov    rdi,r14
     104cd86:	e8 05 11 7a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     104cd8b:	ff c3                	inc    ebx
     104cd8d:	4c 8d 3d 9c c3 33 ff 	lea    r15,[rip+0xffffffffff33c39c]        # 389130 <_ZTSSt12bad_any_cast@@Base-0x7098>
     104cd94:	eb 7e                	jmp    104ce14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21422a>
     104cd96:	48 8d 5c 24 70       	lea    rbx,[rsp+0x70]
     104cd9b:	48 89 df             	mov    rdi,rbx
     104cd9e:	48 8d 35 6b 04 3f ff 	lea    rsi,[rip+0xffffffffff3f046b]        # 43d210 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2e1c>
     104cda5:	e8 96 11 7a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     104cdaa:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     104cdae:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     104cdb2:	e8 7f ea a2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     104cdb7:	48 89 d1             	mov    rcx,rdx

### caller/xfer 0x10bee88; FDE=(17558590, 17560084)
     10bee60:	41 5f                	pop    r15
     10bee62:	5d                   	pop    rbp
     10bee63:	c3                   	ret
     10bee64:	4c 8d a4 24 90 00 00 	lea    r12,[rsp+0x90]
     10bee6b:	00 
     10bee6c:	4c 89 e7             	mov    rdi,r12
     10bee6f:	4c 89 fe             	mov    rsi,r15
     10bee72:	e8 a9 54 ad ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
     10bee77:	48 8d 35 bc cb 26 ff 	lea    rsi,[rip+0xffffffffff26cbbc]        # 32ba3a <_ZTSSt12bad_any_cast@@Base-0x6478e>
     10bee7e:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     10bee83:	4c 89 e2             	mov    rdx,r12
     10bee86:	31 c0                	xor    eax,eax
     10bee88:	e8 0d ce 71 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     10bee8d:	80 bb 40 01 00 00 00 	cmp    BYTE PTR [rbx+0x140],0x0
     10bee94:	0f 84 d3 02 00 00    	je     10bf16d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286583>
     10bee9a:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     10beea1:	00 
     10beea2:	48 83 67 d8 00       	and    QWORD PTR [rdi-0x28],0x0
     10beea7:	48 8d 05 32 5b 7d 00 	lea    rax,[rip+0x7d5b32]        # 18949e0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1920>
     10beeae:	48 89 47 d0          	mov    QWORD PTR [rdi-0x30],rax
     10beeb2:	0f 57 c0             	xorps  xmm0,xmm0
     10beeb5:	0f 11 47 e0          	movups XMMWORD PTR [rdi-0x20],xmm0
     10beeb9:	0f 11 47 f0          	movups XMMWORD PTR [rdi-0x10],xmm0
     10beebd:	48 8d 05 34 09 38 ff 	lea    rax,[rip+0xffffffffff380934]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     10beec4:	48 89 07             	mov    QWORD PTR [rdi],rax
     10beec7:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     10beecb:	c7 47 e0 01 00 00 00 	mov    DWORD PTR [rdi-0x20],0x1
     10beed2:	48 8d 35 33 76 29 ff 	lea    rsi,[rip+0xffffffffff297633]        # 35650c <_ZTSSt12bad_any_cast@@Base-0x39cbc>
     10beed9:	6a 12                	push   0x12
     10beedb:	5a                   	pop    rdx
     10beedc:	31 c9                	xor    ecx,ecx
     10beede:	e8 79 68 6a 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
     10beee3:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]

### caller/xfer 0x10ebaf2; FDE=(17742430, 17742696)
     10ebaca:	d1 e9                	shr    ecx,1
     10ebacc:	48 85 c9             	test   rcx,rcx
     10ebacf:	74 39                	je     10ebb0a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b2f20>
     10ebad1:	a8 01                	test   al,0x1
     10ebad3:	74 07                	je     10ebadc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b2ef2>
     10ebad5:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
     10ebada:	eb 05                	jmp    10ebae1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b2ef7>
     10ebadc:	48 8d 54 24 21       	lea    rdx,[rsp+0x21]
     10ebae1:	48 8d 35 16 f1 29 ff 	lea    rsi,[rip+0xffffffffff29f116]        # 38abfe <_ZTSSt12bad_any_cast@@Base-0x55ca>
     10ebae8:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     10ebaed:	4c 89 f7             	mov    rdi,r14
     10ebaf0:	31 c0                	xor    eax,eax
     10ebaf2:	e8 a3 01 6f 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     10ebaf7:	48 89 df             	mov    rdi,rbx
     10ebafa:	4c 89 f6             	mov    rsi,r14
     10ebafd:	e8 2c ff 98 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     10ebb02:	4c 89 f7             	mov    rdi,r14
     10ebb05:	e8 86 23 70 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10ebb0a:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     10ebb0f:	e8 7c 23 70 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10ebb14:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     10ebb19:	e8 ea ee 9b ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     10ebb1e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ebb25:	00 00 
     10ebb27:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     10ebb2c:	75 35                	jne    10ebb63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b2f79>
     10ebb2e:	48 83 c4 68          	add    rsp,0x68
     10ebb32:	5b                   	pop    rbx
     10ebb33:	41 5e                	pop    r14
     10ebb35:	c3                   	ret
     10ebb36:	49 89 c6             	mov    r14,rax
     10ebb39:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     10ebb3e:	e8 c5 ee 9b ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>

### caller/xfer 0x1129464; FDE=(17994722, 17994963)
     1129436:	49 89 e6             	mov    r14,rsp
     1129439:	4c 89 f7             	mov    rdi,r14
     112943c:	e8 e9 10 5a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     1129441:	41 f6 06 01          	test   BYTE PTR [r14],0x1
     1129445:	74 07                	je     112944e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f0864>
     1129447:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     112944c:	eb 05                	jmp    1129453 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f0869>
     112944e:	48 8d 54 24 01       	lea    rdx,[rsp+0x1]
     1129453:	48 8d 35 13 30 21 ff 	lea    rsi,[rip+0xffffffffff213013]        # 33c46d <_ZTSSt12bad_any_cast@@Base-0x53d5b>
     112945a:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
     112945f:	4c 89 f7             	mov    rdi,r14
     1129462:	31 c0                	xor    eax,eax
     1129464:	e8 31 28 6b 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1129469:	6a 03                	push   0x3
     112946b:	5e                   	pop    rsi
     112946c:	48 89 df             	mov    rdi,rbx
     112946f:	4c 89 f2             	mov    rdx,r14
     1129472:	e8 1d c3 ff ff       	call   1125794 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ecbaa>
     1129477:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     112947c:	e8 0f 4a 6c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1129481:	48 89 e7             	mov    rdi,rsp
     1129484:	e8 07 4a 6c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1129489:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1129490:	00 00 
     1129492:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     1129497:	75 35                	jne    11294ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f08e4>
     1129499:	48 83 c4 38          	add    rsp,0x38
     112949d:	5b                   	pop    rbx
     112949e:	41 5e                	pop    r14
     11294a0:	c3                   	ret
     11294a1:	48 89 c3             	mov    rbx,rax
     11294a4:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11294a9:	e8 e2 49 6c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### caller/xfer 0x112bbe0; FDE=(18004536, 18005157)
     112bbb3:	41 f6 06 01          	test   BYTE PTR [r14],0x1
     112bbb7:	74 0a                	je     112bbc3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f2fd9>
     112bbb9:	48 8b 94 24 98 00 00 	mov    rdx,QWORD PTR [rsp+0x98]
     112bbc0:	00 
     112bbc1:	eb 08                	jmp    112bbcb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f2fe1>
     112bbc3:	48 8d 94 24 89 00 00 	lea    rdx,[rsp+0x89]
     112bbca:	00 
     112bbcb:	8b 8b 1c 01 00 00    	mov    ecx,DWORD PTR [rbx+0x11c]
     112bbd1:	48 8d 35 8b b8 25 ff 	lea    rsi,[rip+0xffffffffff25b88b]        # 387463 <_ZTSSt12bad_any_cast@@Base-0x8d65>
     112bbd8:	49 89 e7             	mov    r15,rsp
     112bbdb:	4c 89 ff             	mov    rdi,r15
     112bbde:	31 c0                	xor    eax,eax
     112bbe0:	e8 b5 00 6b 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     112bbe5:	c7 83 1c 01 00 00 01 	mov    DWORD PTR [rbx+0x11c],0x1
     112bbec:	00 00 00 
     112bbef:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
     112bbf6:	4c 89 fe             	mov    rsi,r15
     112bbf9:	e8 30 fe 94 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     112bbfe:	4c 89 ff             	mov    rdi,r15
     112bc01:	e8 8a 22 6c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     112bc06:	4c 89 f7             	mov    rdi,r14
     112bc09:	e8 82 22 6c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     112bc0e:	40 b5 01             	mov    bpl,0x1
     112bc11:	83 bb 1c 01 00 00 00 	cmp    DWORD PTR [rbx+0x11c],0x0
     112bc18:	75 22                	jne    112bc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f3052>
     112bc1a:	44 8b 83 38 01 00 00 	mov    r8d,DWORD PTR [rbx+0x138]
     112bc21:	48 8d 35 54 63 32 ff 	lea    rsi,[rip+0xffffffffff326354]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     112bc28:	48 8d 0d 9f ea 23 ff 	lea    rcx,[rip+0xffffffffff23ea9f]        # 36a6ce <_ZTSSt12bad_any_cast@@Base-0x25afa>
     112bc2f:	6a 04                	push   0x4
     112bc31:	5f                   	pop    rdi
     112bc32:	6a 5c                	push   0x5c
     112bc34:	5a                   	pop    rdx
     112bc35:	31 c0                	xor    eax,eax

### caller/xfer 0x112dea1; FDE=(18013678, 18014820)
     112de76:	41 89 84 24 1c 01 00 	mov    DWORD PTR [r12+0x11c],eax
     112de7d:	00 
     112de7e:	eb 0b                	jmp    112de8b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f52a1>
     112de80:	41 83 bc 24 1c 01 00 	cmp    DWORD PTR [r12+0x11c],0x0
     112de87:	00 00 
     112de89:	74 33                	je     112debe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f52d4>
     112de8b:	48 8d 35 d0 dc 1f ff 	lea    rsi,[rip+0xffffffffff1fdcd0]        # 32bb62 <_ZTSSt12bad_any_cast@@Base-0x64666>
     112de92:	4c 8d b4 24 e0 01 00 	lea    r14,[rsp+0x1e0]
     112de99:	00 
     112de9a:	4c 89 f7             	mov    rdi,r14
     112de9d:	89 da                	mov    edx,ebx
     112de9f:	31 c0                	xor    eax,eax
     112dea1:	e8 f4 dd 6a 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     112dea6:	49 8d bc 24 20 01 00 	lea    rdi,[r12+0x120]
     112dead:	00 
     112deae:	4c 89 f6             	mov    rsi,r14
     112deb1:	e8 78 db 94 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     112deb6:	4c 89 f7             	mov    rdi,r14
     112deb9:	e8 d2 ff 6b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     112debe:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     112dec3:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     112deca:	00 
     112decb:	e8 7e a6 a3 ff       	call   b6854e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54ee>
     112ded0:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     112ded7:	00 
     112ded8:	e8 37 f7 ae ff       	call   c1d614 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a5b4>
     112dedd:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     112dee3:	66 48 0f 7e c0       	movq   rax,xmm0
     112dee8:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     112deeb:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     112def0:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
     112def4:	48 8d 9c 24 c8 00 00 	lea    rbx,[rsp+0xc8]
     112defb:	00 

### caller/xfer 0x11356b7; FDE=(18044522, 18044680)
     1135686:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
     1135689:	48 8b 40 58          	mov    rax,QWORD PTR [rax+0x58]
     113568d:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     1135691:	e8 72 00 00 00       	call   1135708 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fcb1e>
     1135696:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     113569b:	48 89 07             	mov    QWORD PTR [rdi],rax
     113569e:	e8 9d 94 6b 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
     11356a3:	48 8d 35 8d b5 1f ff 	lea    rsi,[rip+0xffffffffff1fb58d]        # 330c37 <_ZTSSt12bad_any_cast@@Base-0x5f591>
     11356aa:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
     11356af:	4c 89 f7             	mov    rdi,r14
     11356b2:	48 89 c2             	mov    rdx,rax
     11356b5:	31 c0                	xor    eax,eax
     11356b7:	e8 de 65 6a 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     11356bc:	4c 89 f7             	mov    rdi,r14
     11356bf:	48 89 de             	mov    rsi,rbx
     11356c2:	e8 27 a0 96 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     11356c7:	89 c5                	mov    ebp,eax
     11356c9:	84 c0                	test   al,al
     11356cb:	75 0d                	jne    11356da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fcaf0>
     11356cd:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     11356d2:	48 89 df             	mov    rdi,rbx
     11356d5:	e8 54 63 94 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     11356da:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     11356df:	e8 ac 87 6b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11356e4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11356eb:	00 00 
     11356ed:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     11356f2:	75 0f                	jne    1135703 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fcb19>
     11356f4:	40 80 f5 01          	xor    bpl,0x1
     11356f8:	89 e8                	mov    eax,ebp
     11356fa:	48 83 c4 30          	add    rsp,0x30
     11356fe:	5b                   	pop    rbx
     11356ff:	41 5e                	pop    r14

### caller/xfer 0x114d9b8; FDE=(18140382, 18145996)
     114d98f:	eb 23                	jmp    114d9b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314dca>
     114d991:	41 f6 07 01          	test   BYTE PTR [r15],0x1
     114d995:	74 04                	je     114d99b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314db1>
     114d997:	4d 8b 57 10          	mov    r10,QWORD PTR [r15+0x10]
     114d99b:	48 83 ec 08          	sub    rsp,0x8
     114d99f:	4c 89 ef             	mov    rdi,r13
     114d9a2:	48 8d 35 84 fb 1f ff 	lea    rsi,[rip+0xffffffffff1ffb84]        # 34d52d <_ZTSSt12bad_any_cast@@Base-0x42c9b>
     114d9a9:	8b 54 24 10          	mov    edx,DWORD PTR [rsp+0x10]
     114d9ad:	89 c1                	mov    ecx,eax
     114d9af:	44 8b 44 24 18       	mov    r8d,DWORD PTR [rsp+0x18]
     114d9b4:	31 c0                	xor    eax,eax
     114d9b6:	41 52                	push   r10
     114d9b8:	e8 dd e2 68 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     114d9bd:	58                   	pop    rax
     114d9be:	59                   	pop    rcx
     114d9bf:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
     114d9c3:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     114d9c7:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     114d9ca:	4c 01 e7             	add    rdi,r12
     114d9cd:	4c 89 ee             	mov    rsi,r13
     114d9d0:	e8 59 e0 92 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     114d9d5:	4c 89 ef             	mov    rdi,r13
     114d9d8:	e8 b3 04 6a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     114d9dd:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
     114d9e1:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     114d9e5:	48 2b 01             	sub    rax,QWORD PTR [rcx]
     114d9e8:	49 ff c6             	inc    r14
     114d9eb:	48 99                	cqo
     114d9ed:	b9 90 00 00 00       	mov    ecx,0x90
     114d9f2:	48 f7 f9             	idiv   rcx
     114d9f5:	49 01 cc             	add    r12,rcx
     114d9f8:	48 83 c5 20          	add    rbp,0x20
     114d9fc:	4c 39 f0             	cmp    rax,r14

### caller/xfer 0x119f842; FDE=(18478859, 18479175)
     119f813:	48 8d 51 f7          	lea    rdx,[rcx-0x9]
     119f817:	48 83 c1 03          	add    rcx,0x3
     119f81b:	48 81 fe 32 01 00 00 	cmp    rsi,0x132
     119f822:	48 0f 4d ca          	cmovge rcx,rdx
     119f826:	31 d2                	xor    edx,edx
     119f828:	48 83 f9 03          	cmp    rcx,0x3
     119f82c:	0f 9c c2             	setl   dl
     119f82f:	44 01 c2             	add    edx,r8d
     119f832:	44 8d 04 30          	lea    r8d,[rax+rsi*1]
     119f836:	41 ff c0             	inc    r8d
     119f839:	48 8d 35 d6 80 1d ff 	lea    rsi,[rip+0xffffffffff1d80d6]        # 377916 <_ZTSSt12bad_any_cast@@Base-0x188b2>
     119f840:	31 c0                	xor    eax,eax
     119f842:	e9 53 c4 63 00       	jmp    17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     119f847:	53                   	push   rbx
     119f848:	48 83 ec 30          	sub    rsp,0x30
     119f84c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     119f853:	00 00 
     119f855:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     119f85a:	40 f6 c6 01          	test   sil,0x1
     119f85e:	75 06                	jne    119f866 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366c7c>
     119f860:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     119f864:	eb 30                	jmp    119f896 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366cac>
     119f866:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     119f86b:	48 89 16             	mov    QWORD PTR [rsi],rdx
     119f86e:	88 4e 08             	mov    BYTE PTR [rsi+0x8],cl
     119f871:	48 8d 05 cc e3 93 ff 	lea    rax,[rip+0xffffffffff93e3cc]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
     119f878:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     119f87c:	48 8d 05 53 00 00 00 	lea    rax,[rip+0x53]        # 119f8d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366cec>
     119f883:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     119f887:	e8 06 76 fc ff       	call   1166e92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32e2a8>
     119f88c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     119f891:	e8 6e 76 fc ff       	call   1166f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32e31a>
     119f896:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### caller/xfer 0x12180c7; FDE=(18972790, 18973073)
     1218093:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     1218097:	ff 80 04 11 00 00    	inc    DWORD PTR [rax+0x1104]
     121809d:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     12180a1:	c7 83 c0 11 00 00 03 	mov    DWORD PTR [rbx+0x11c0],0x3
     12180a8:	00 00 00 
     12180ab:	8b 7f 10             	mov    edi,DWORD PTR [rdi+0x10]
     12180ae:	e8 3e fd 00 00       	call   1227df1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d375>
     12180b3:	48 8d 35 d2 b3 14 ff 	lea    rsi,[rip+0xffffffffff14b3d2]        # 36348c <_ZTSSt12bad_any_cast@@Base-0x2cd3c>
     12180ba:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     12180bf:	4c 89 ff             	mov    rdi,r15
     12180c2:	48 89 c1             	mov    rcx,rax
     12180c5:	31 c0                	xor    eax,eax
     12180c7:	e8 ce 3b 5c 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12180cc:	48 8d bb c8 11 00 00 	lea    rdi,[rbx+0x11c8]
     12180d3:	4c 89 fe             	mov    rsi,r15
     12180d6:	e8 53 39 86 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12180db:	4c 89 ff             	mov    rdi,r15
     12180de:	e8 ad 5d 5d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12180e3:	48 8d 35 c2 5b 15 ff 	lea    rsi,[rip+0xffffffffff155bc2]        # 36dcac <_ZTSSt12bad_any_cast@@Base-0x2251c>
     12180ea:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     12180ef:	e8 8a 19 86 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12180f4:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
     12180f9:	49 83 67 e8 00       	and    QWORD PTR [r15-0x18],0x0
     12180fe:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
     1218102:	41 89 47 f0          	mov    DWORD PTR [r15-0x10],eax
     1218106:	41 c6 47 f4 01       	mov    BYTE PTR [r15-0xc],0x1
     121810b:	31 c0                	xor    eax,eax
     121810d:	41 88 47 f8          	mov    BYTE PTR [r15-0x8],al
     1218111:	41 88 47 fc          	mov    BYTE PTR [r15-0x4],al
     1218115:	41 88 07             	mov    BYTE PTR [r15],al
     1218118:	41 88 47 18          	mov    BYTE PTR [r15+0x18],al
     121811c:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     1218121:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]

### caller/xfer 0x1296c89; FDE=(19491208, 19492888)
     1296c59:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     1296c5c:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
     1296c63:	00 
     1296c64:	be 93 01 00 00       	mov    esi,0x193
     1296c69:	e8 3c 13 00 00       	call   1297faa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdd52e>
     1296c6e:	eb 7d                	jmp    1296ced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdc271>
     1296c70:	48 8d 54 24 41       	lea    rdx,[rsp+0x41]
     1296c75:	48 8d 35 d5 0b 0f ff 	lea    rsi,[rip+0xffffffffff0f0bd5]        # 387851 <_ZTSSt12bad_any_cast@@Base-0x8977>
     1296c7c:	4c 8d bc 24 c0 00 00 	lea    r15,[rsp+0xc0]
     1296c83:	00 
     1296c84:	4c 89 ff             	mov    rdi,r15
     1296c87:	31 c0                	xor    eax,eax
     1296c89:	e8 0c 50 54 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1296c8e:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     1296c91:	be 90 01 00 00       	mov    esi,0x190
     1296c96:	4c 89 fa             	mov    rdx,r15
     1296c99:	e8 0c 13 00 00       	call   1297faa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdd52e>
     1296c9e:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1296ca5:	00 
     1296ca6:	e8 e5 71 55 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1296cab:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     1296cb0:	eb 43                	jmp    1296cf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdc279>
     1296cb2:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     1296cb6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1296cb9:	ff 50 48             	call   QWORD PTR [rax+0x48]
     1296cbc:	84 c0                	test   al,al
     1296cbe:	0f 84 e8 00 00 00    	je     1296dac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdc330>
     1296cc4:	48 8d 35 2b 05 0b ff 	lea    rsi,[rip+0xffffffffff0b052b]        # 3471f6 <_ZTSSt12bad_any_cast@@Base-0x48fd2>
     1296ccb:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1296cd2:	00 
     1296cd3:	e8 a6 2d 7e ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1296cd8:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     1296cdb:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]

### caller/xfer 0x1297eee; FDE=(19496546, 19496746)
     1297ec5:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
     1297ec9:	eb 03                	jmp    1297ece <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdd452>
     1297ecb:	49 ff c6             	inc    r14
     1297ece:	48 8d 35 c1 b3 0b ff 	lea    rsi,[rip+0xffffffffff0bb3c1]        # 353296 <_ZTSSt12bad_any_cast@@Base-0x3cf32>
     1297ed5:	eb 0a                	jmp    1297ee1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdd465>
     1297ed7:	49 ff c6             	inc    r14
     1297eda:	48 8d 35 7f 1c 0c ff 	lea    rsi,[rip+0xffffffffff0c1c7f]        # 359b60 <_ZTSSt12bad_any_cast@@Base-0x36668>
     1297ee1:	31 ed                	xor    ebp,ebp
     1297ee3:	49 89 e7             	mov    r15,rsp
     1297ee6:	4c 89 ff             	mov    rdi,r15
     1297ee9:	4c 89 f2             	mov    rdx,r14
     1297eec:	31 c0                	xor    eax,eax
     1297eee:	e8 a7 3d 54 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1297ef3:	48 89 df             	mov    rdi,rbx
     1297ef6:	4c 89 fe             	mov    rsi,r15
     1297ef9:	e8 30 3b 7e ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1297efe:	4c 89 ff             	mov    rdi,r15
     1297f01:	e8 8a 5f 55 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1297f06:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1297f0d:	00 00 
     1297f0f:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     1297f14:	75 0f                	jne    1297f25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdd4a9>
     1297f16:	89 e8                	mov    eax,ebp
     1297f18:	48 83 c4 20          	add    rsp,0x20
     1297f1c:	5b                   	pop    rbx
     1297f1d:	41 5c                	pop    r12
     1297f1f:	41 5e                	pop    r14
     1297f21:	41 5f                	pop    r15
     1297f23:	5d                   	pop    rbp
     1297f24:	c3                   	ret
     1297f25:	e8 86 7b 55 00       	call   17efab0 <__stack_chk_fail@plt>
     1297f2a:	55                   	push   rbp
     1297f2b:	41 56                	push   r14

### caller/xfer 0x129fdba; FDE=(19527890, 19529648)
     129fd8b:	4c 89 f7             	mov    rdi,r14
     129fd8e:	48 89 de             	mov    rsi,rbx
     129fd91:	e8 f8 19 34 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
     129fd96:	48 89 df             	mov    rdi,rbx
     129fd99:	e8 00 75 80 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     129fd9e:	eb 68                	jmp    129fe08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe538c>
     129fda0:	48 83 ca 01          	or     rdx,0x1
     129fda4:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     129fda9:	48 8d 35 fa 34 0a ff 	lea    rsi,[rip+0xffffffffff0a34fa]        # 3432aa <_ZTSSt12bad_any_cast@@Base-0x4cf1e>
     129fdb0:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
     129fdb5:	48 89 df             	mov    rdi,rbx
     129fdb8:	31 c0                	xor    eax,eax
     129fdba:	e8 db be 53 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     129fdbf:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     129fdc6:	00 
     129fdc7:	be 90 01 00 00       	mov    esi,0x190
     129fdcc:	48 89 da             	mov    rdx,rbx
     129fdcf:	e8 e4 01 00 00       	call   129ffb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe553c>
     129fdd4:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
     129fdd9:	66 48 0f 7e c7       	movq   rdi,xmm0
     129fdde:	48 8d 9c 24 20 03 00 	lea    rbx,[rsp+0x320]
     129fde5:	00 
     129fde6:	48 89 de             	mov    rsi,rbx
     129fde9:	e8 6e 1a 34 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
     129fdee:	48 89 df             	mov    rdi,rbx
     129fdf1:	e8 a8 ea 04 00       	call   12ee89e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e22>
     129fdf6:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     129fdfb:	e8 90 e0 54 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     129fe00:	4c 89 f7             	mov    rdi,r14
     129fe03:	e8 29 19 34 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
     129fe08:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     129fe0f:	00 
     129fe10:	e8 1f 03 00 00       	call   12a0134 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe56b8>

### caller/xfer 0x12bb5ca; FDE=(19641466, 19642544)
     12bb59c:	49 8b 06             	mov    rax,QWORD PTR [r14]
     12bb59f:	4c 89 f7             	mov    rdi,r14
     12bb5a2:	4c 89 fe             	mov    rsi,r15
     12bb5a5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12bb5a8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12bb5ad:	e8 e8 69 82 ff       	call   ae1f9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2ef3a>
     12bb5b2:	eb 3f                	jmp    12bb5f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x100b77>
     12bb5b4:	48 8d 54 24 09       	lea    rdx,[rsp+0x9]
     12bb5b9:	48 8d 35 91 c2 0c ff 	lea    rsi,[rip+0xffffffffff0cc291]        # 387851 <_ZTSSt12bad_any_cast@@Base-0x8977>
     12bb5c0:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     12bb5c5:	4c 89 ff             	mov    rdi,r15
     12bb5c8:	31 c0                	xor    eax,eax
     12bb5ca:	e8 cb 06 52 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12bb5cf:	4c 89 f7             	mov    rdi,r14
     12bb5d2:	e8 b9 28 53 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12bb5d7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     12bb5db:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12bb5de:	be 90 01 00 00       	mov    esi,0x190
     12bb5e3:	4c 89 fa             	mov    rdx,r15
     12bb5e6:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12bb5e9:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12bb5ee:	e8 9d 28 53 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12bb5f3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12bb5fa:	00 00 
     12bb5fc:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
     12bb603:	00 
     12bb604:	0f 85 a1 02 00 00    	jne    12bb8ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x100e2f>
     12bb60a:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
     12bb611:	5b                   	pop    rbx
     12bb612:	41 5c                	pop    r12
     12bb614:	41 5d                	pop    r13
     12bb616:	41 5e                	pop    r14
     12bb618:	41 5f                	pop    r15

### caller/xfer 0x12bc0bb; FDE=(19644276, 19645073)
     12bc08d:	e8 ec d9 7b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12bc092:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12bc095:	48 89 df             	mov    rdi,rbx
     12bc098:	be 93 01 00 00       	mov    esi,0x193
     12bc09d:	4c 89 f2             	mov    rdx,r14
     12bc0a0:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12bc0a3:	eb 38                	jmp    12bc0dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101661>
     12bc0a5:	48 8d 54 24 09       	lea    rdx,[rsp+0x9]
     12bc0aa:	48 8d 35 a0 b7 0c ff 	lea    rsi,[rip+0xffffffffff0cb7a0]        # 387851 <_ZTSSt12bad_any_cast@@Base-0x8977>
     12bc0b1:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     12bc0b6:	4c 89 ff             	mov    rdi,r15
     12bc0b9:	31 c0                	xor    eax,eax
     12bc0bb:	e8 da fb 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12bc0c0:	4c 89 f7             	mov    rdi,r14
     12bc0c3:	e8 c8 1d 53 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12bc0c8:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
     12bc0cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12bc0d2:	be 90 01 00 00       	mov    esi,0x190
     12bc0d7:	4c 89 fa             	mov    rdx,r15
     12bc0da:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12bc0dd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12bc0e2:	e8 a9 1d 53 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12bc0e7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12bc0ee:	00 00 
     12bc0f0:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
     12bc0f7:	00 
     12bc0f8:	0f 85 8e 01 00 00    	jne    12bc28c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101810>
     12bc0fe:	48 81 c4 98 00 00 00 	add    rsp,0x98
     12bc105:	5b                   	pop    rbx
     12bc106:	41 5c                	pop    r12
     12bc108:	41 5d                	pop    r13
     12bc10a:	41 5e                	pop    r14
     12bc10c:	41 5f                	pop    r15

### caller/xfer 0x12bec77; FDE=(19652843, 19657156)
     12bec4a:	e8 d1 cb 7b ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     12bec4f:	84 c0                	test   al,al
     12bec51:	74 3e                	je     12bec91 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104215>
     12bec53:	f6 44 24 18 01       	test   BYTE PTR [rsp+0x18],0x1
     12bec58:	74 07                	je     12bec61 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1041e5>
     12bec5a:	48 8b 54 24 28       	mov    rdx,QWORD PTR [rsp+0x28]
     12bec5f:	eb 05                	jmp    12bec66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1041ea>
     12bec61:	48 8d 54 24 19       	lea    rdx,[rsp+0x19]
     12bec66:	48 8d 35 41 49 0a ff 	lea    rsi,[rip+0xffffffffff0a4941]        # 3635ae <_ZTSSt12bad_any_cast@@Base-0x2cc1a>
     12bec6d:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     12bec72:	4c 89 ff             	mov    rdi,r15
     12bec75:	31 c0                	xor    eax,eax
     12bec77:	e8 1e d0 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12bec7c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     12bec81:	4c 89 fe             	mov    rsi,r15
     12bec84:	e8 a5 cd 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12bec89:	4c 89 ff             	mov    rdi,r15
     12bec8c:	e8 ff f1 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12bec91:	31 c0                	xor    eax,eax
     12bec93:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12bec98:	88 01                	mov    BYTE PTR [rcx],al
     12bec9a:	88 81 c0 00 00 00    	mov    BYTE PTR [rcx+0xc0],al
     12beca0:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     12beca5:	e8 e6 f1 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12becaa:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
     12becb1:	00 
     12becb2:	e8 43 05 00 00       	call   12bf1fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10477e>
     12becb7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12becbe:	00 00 
     12becc0:	48 3b 84 24 a0 03 00 	cmp    rax,QWORD PTR [rsp+0x3a0]
     12becc7:	00 
     12becc8:	0f 85 f1 04 00 00    	jne    12bf1bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104743>
     12becce:	48 81 c4 a8 03 00 00 	add    rsp,0x3a8

### caller/xfer 0x12bf2d7; FDE=(19657342, 19657492)
     12bf2ad:	f6 c1 01             	test   cl,0x1
     12bf2b0:	48 0f 44 c7          	cmove  rax,rdi
     12bf2b4:	4a 8d 14 f8          	lea    rdx,[rax+r15*8]
     12bf2b8:	48 89 f7             	mov    rdi,rsi
     12bf2bb:	48 89 c6             	mov    rsi,rax
     12bf2be:	e8 a3 63 9c ff       	call   c85666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2606>
     12bf2c3:	eb 2a                	jmp    12bf2ef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104873>
     12bf2c5:	48 89 d3             	mov    rbx,rdx
     12bf2c8:	48 8d 35 13 eb 0b ff 	lea    rsi,[rip+0xffffffffff0beb13]        # 37dde2 <_ZTSSt12bad_any_cast@@Base-0x123e6>
     12bf2cf:	49 89 e6             	mov    r14,rsp
     12bf2d2:	4c 89 f7             	mov    rdi,r14
     12bf2d5:	31 c0                	xor    eax,eax
     12bf2d7:	e8 be c9 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12bf2dc:	48 89 df             	mov    rdi,rbx
     12bf2df:	4c 89 f6             	mov    rsi,r14
     12bf2e2:	e8 47 c7 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12bf2e7:	4c 89 f7             	mov    rdi,r14
     12bf2ea:	e8 a1 eb 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12bf2ef:	45 85 ff             	test   r15d,r15d
     12bf2f2:	0f 95 c0             	setne  al
     12bf2f5:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     12bf2fc:	00 00 
     12bf2fe:	48 3b 4c 24 18       	cmp    rcx,QWORD PTR [rsp+0x18]
     12bf303:	75 0a                	jne    12bf30f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104893>
     12bf305:	48 83 c4 20          	add    rsp,0x20
     12bf309:	5b                   	pop    rbx
     12bf30a:	41 5e                	pop    r14
     12bf30c:	41 5f                	pop    r15
     12bf30e:	c3                   	ret
     12bf30f:	e8 9c 07 53 00       	call   17efab0 <__stack_chk_fail@plt>
     12bf314:	53                   	push   rbx
     12bf315:	48 89 fb             	mov    rbx,rdi
     12bf318:	e8 6f 02 00 00       	call   12bf58c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104b10>

### caller/xfer 0x12c077e; FDE=(19662612, 19662782)
     12c0756:	49 8b 07             	mov    rax,QWORD PTR [r15]
     12c0759:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
     12c075d:	48 89 df             	mov    rdi,rbx
     12c0760:	4c 89 fe             	mov    rsi,r15
     12c0763:	e8 64 00 00 00       	call   12c07cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x105d50>
     12c0768:	eb 2c                	jmp    12c0796 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x105d1a>
     12c076a:	48 8d 35 5b 94 09 ff 	lea    rsi,[rip+0xffffffffff09945b]        # 359bcc <_ZTSSt12bad_any_cast@@Base-0x365fc>
     12c0771:	49 89 e7             	mov    r15,rsp
     12c0774:	4c 89 ff             	mov    rdi,r15
     12c0777:	89 ea                	mov    edx,ebp
     12c0779:	4c 89 e1             	mov    rcx,r12
     12c077c:	31 c0                	xor    eax,eax
     12c077e:	e8 17 b5 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c0783:	4c 89 f7             	mov    rdi,r14
     12c0786:	4c 89 fe             	mov    rsi,r15
     12c0789:	e8 a0 b2 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c078e:	4c 89 ff             	mov    rdi,r15
     12c0791:	e8 fa d6 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c0796:	48 85 db             	test   rbx,rbx
     12c0799:	0f 95 c0             	setne  al
     12c079c:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     12c07a3:	00 00 
     12c07a5:	48 3b 4c 24 18       	cmp    rcx,QWORD PTR [rsp+0x18]
     12c07aa:	75 0d                	jne    12c07b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x105d3d>
     12c07ac:	48 83 c4 20          	add    rsp,0x20
     12c07b0:	5b                   	pop    rbx
     12c07b1:	41 5c                	pop    r12
     12c07b3:	41 5e                	pop    r14
     12c07b5:	41 5f                	pop    r15
     12c07b7:	5d                   	pop    rbp
     12c07b8:	c3                   	ret
     12c07b9:	e8 f2 f2 52 00       	call   17efab0 <__stack_chk_fail@plt>
     12c07be:	80 bf b0 00 00 00 00 	cmp    BYTE PTR [rdi+0xb0],0x0

### caller/xfer 0x12c0e2f; FDE=(19664208, 19664644)
     12c0e05:	41 f6 06 01          	test   BYTE PTR [r14],0x1
     12c0e09:	74 06                	je     12c0e11 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x106395>
     12c0e0b:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
     12c0e0f:	eb 03                	jmp    12c0e14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x106398>
     12c0e11:	49 ff c6             	inc    r14
     12c0e14:	49 8b 4f 48          	mov    rcx,QWORD PTR [r15+0x48]
     12c0e18:	48 8d 35 ce 66 0a ff 	lea    rsi,[rip+0xffffffffff0a66ce]        # 3674ed <_ZTSSt12bad_any_cast@@Base-0x28cdb>
     12c0e1f:	45 31 e4             	xor    r12d,r12d
     12c0e22:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     12c0e27:	4c 89 ff             	mov    rdi,r15
     12c0e2a:	4c 89 f2             	mov    rdx,r14
     12c0e2d:	31 c0                	xor    eax,eax
     12c0e2f:	e8 66 ae 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c0e34:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     12c0e38:	4c 89 fe             	mov    rsi,r15
     12c0e3b:	e8 ee ab 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c0e40:	4c 89 ff             	mov    rdi,r15
     12c0e43:	e8 48 d0 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c0e48:	eb 0e                	jmp    12c0e58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1063dc>
     12c0e4a:	44 0f b6 63 08       	movzx  r12d,BYTE PTR [rbx+0x8]
     12c0e4f:	44 03 65 0c          	add    r12d,DWORD PTR [rbp+0xc]
     12c0e53:	49 0f ba ec 20       	bts    r12,0x20
     12c0e58:	4c 89 e1             	mov    rcx,r12
     12c0e5b:	48 c1 e9 08          	shr    rcx,0x8
     12c0e5f:	49 bf 00 00 00 00 01 	movabs r15,0x100000000
     12c0e66:	00 00 00 
     12c0e69:	4d 21 e7             	and    r15,r12
     12c0e6c:	eb 58                	jmp    12c0ec6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10644a>
     12c0e6e:	80 7b 08 00          	cmp    BYTE PTR [rbx+0x8],0x0
     12c0e72:	74 1b                	je     12c0e8f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x106413>
     12c0e74:	89 d1                	mov    ecx,edx
     12c0e76:	81 e1 00 ff ff ff    	and    ecx,0xffffff00
     12c0e7c:	89 d0                	mov    eax,edx

### caller/xfer 0x12c0ea3; FDE=(19664208, 19664644)
     12c0e7c:	89 d0                	mov    eax,edx
     12c0e7e:	eb 40                	jmp    12c0ec0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x106444>
     12c0e80:	45 31 ff             	xor    r15d,r15d
     12c0e83:	eb 37                	jmp    12c0ebc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x106440>
     12c0e85:	89 c1                	mov    ecx,eax
     12c0e87:	81 e1 00 ff ff ff    	and    ecx,0xffffff00
     12c0e8d:	eb 31                	jmp    12c0ec0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x106444>
     12c0e8f:	48 8d 35 4a f6 08 ff 	lea    rsi,[rip+0xffffffffff08f64a]        # 3504e0 <_ZTSSt12bad_any_cast@@Base-0x3fce8>
     12c0e96:	45 31 ff             	xor    r15d,r15d
     12c0e99:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     12c0e9e:	4c 89 f7             	mov    rdi,r14
     12c0ea1:	31 c0                	xor    eax,eax
     12c0ea3:	e8 f2 ad 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c0ea8:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     12c0eac:	4c 89 f6             	mov    rsi,r14
     12c0eaf:	e8 7a ab 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c0eb4:	4c 89 f7             	mov    rdi,r14
     12c0eb7:	e8 d4 cf 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c0ebc:	31 c0                	xor    eax,eax
     12c0ebe:	31 c9                	xor    ecx,ecx
     12c0ec0:	41 89 c4             	mov    r12d,eax
     12c0ec3:	c1 e9 08             	shr    ecx,0x8
     12c0ec6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12c0ecd:	00 00 
     12c0ecf:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     12c0ed4:	75 29                	jne    12c0eff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x106483>
     12c0ed6:	48 b8 00 00 00 00 01 	movabs rax,0x100000000
     12c0edd:	00 00 00 
     12c0ee0:	49 21 c7             	and    r15,rax
     12c0ee3:	c1 e1 08             	shl    ecx,0x8
     12c0ee6:	4c 09 f9             	or     rcx,r15
     12c0ee9:	41 0f b6 c4          	movzx  eax,r12b
     12c0eed:	48 09 c8             	or     rax,rcx

### caller/xfer 0x12c1d10; FDE=(19667052, 19669841)
     12c1ce1:	00 
     12c1ce2:	e8 a9 c1 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c1ce7:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c1cee:	00 
     12c1cef:	e9 c2 00 00 00       	jmp    12c1db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10733a>
     12c1cf4:	48 8d 94 24 71 02 00 	lea    rdx,[rsp+0x271]
     12c1cfb:	00 
     12c1cfc:	48 8d 35 4e 5b 0c ff 	lea    rsi,[rip+0xffffffffff0c5b4e]        # 387851 <_ZTSSt12bad_any_cast@@Base-0x8977>
     12c1d03:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
     12c1d0a:	00 
     12c1d0b:	4c 89 ff             	mov    rdi,r15
     12c1d0e:	31 c0                	xor    eax,eax
     12c1d10:	e8 85 9f 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c1d15:	49 89 e4             	mov    r12,rsp
     12c1d18:	4c 89 e7             	mov    rdi,r12
     12c1d1b:	4c 89 fe             	mov    rsi,r15
     12c1d1e:	e8 0b 9d 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c1d23:	4c 89 ff             	mov    rdi,r15
     12c1d26:	e8 65 c1 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c1d2b:	4c 89 f7             	mov    rdi,r14
     12c1d2e:	e8 5d c1 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c1d33:	48 8b bb a0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1a0]
     12c1d3a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12c1d3d:	be 90 01 00 00       	mov    esi,0x190
     12c1d42:	4c 89 e2             	mov    rdx,r12
     12c1d45:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12c1d48:	eb 4f                	jmp    12c1d99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10731d>
     12c1d4a:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     12c1d4d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12c1d50:	ff 50 48             	call   QWORD PTR [rax+0x48]
     12c1d53:	84 c0                	test   al,al
     12c1d55:	0f 84 93 00 00 00    	je     12c1dee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107372>
     12c1d5b:	48 8b 9b a0 01 00 00 	mov    rbx,QWORD PTR [rbx+0x1a0]

### caller/xfer 0x12c32c3; FDE=(19673564, 19677186)
     12c3293:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     12c3298:	4c 89 e7             	mov    rdi,r12
     12c329b:	31 d2                	xor    edx,edx
     12c329d:	e8 00 dd ff ff       	call   12c0fa2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x106526>
     12c32a2:	48 89 c1             	mov    rcx,rax
     12c32a5:	48 c1 e9 20          	shr    rcx,0x20
     12c32a9:	0f 85 3c 01 00 00    	jne    12c33eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10896f>
     12c32af:	48 8d 35 10 0f 0b ff 	lea    rsi,[rip+0xffffffffff0b0f10]        # 3741c6 <_ZTSSt12bad_any_cast@@Base-0x1c002>
     12c32b6:	4c 8d b4 24 30 01 00 	lea    r14,[rsp+0x130]
     12c32bd:	00 
     12c32be:	4c 89 f7             	mov    rdi,r14
     12c32c1:	31 c0                	xor    eax,eax
     12c32c3:	e8 d2 89 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c32c8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12c32cd:	4c 89 f6             	mov    rsi,r14
     12c32d0:	e8 59 87 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c32d5:	4c 89 f7             	mov    rdi,r14
     12c32d8:	e8 b3 ab 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c32dd:	bd 90 01 00 00       	mov    ebp,0x190
     12c32e2:	e9 b4 03 00 00       	jmp    12c369b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108c1f>
     12c32e7:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     12c32ec:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
     12c32f2:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
     12c32f6:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
     12c32fa:	48 39 c8             	cmp    rax,rcx
     12c32fd:	40 0f 94 c7          	sete   dil
     12c3301:	49 8b 76 38          	mov    rsi,QWORD PTR [r14+0x38]
     12c3305:	49 8b 56 40          	mov    rdx,QWORD PTR [r14+0x40]
     12c3309:	48 39 d6             	cmp    rsi,rdx
     12c330c:	41 0f 94 c0          	sete   r8b
     12c3310:	41 30 f8             	xor    r8b,dil
     12c3313:	0f 84 b7 00 00 00    	je     12c33d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108954>
     12c3319:	48 39 c8             	cmp    rax,rcx

### caller/xfer 0x12c3450; FDE=(19673564, 19677186)
     12c3420:	4c 89 e7             	mov    rdi,r12
     12c3423:	ff 50 70             	call   QWORD PTR [rax+0x70]
     12c3426:	44 01 f8             	add    eax,r15d
     12c3429:	3d 12 27 00 00       	cmp    eax,0x2712
     12c342e:	0f 82 fe 00 00 00    	jb     12c3532 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108ab6>
     12c3434:	48 8d 35 e2 1c 06 ff 	lea    rsi,[rip+0xffffffffff061ce2]        # 32511d <_ZTSSt12bad_any_cast@@Base-0x6b0ab>
     12c343b:	4c 8d b4 24 30 01 00 	lea    r14,[rsp+0x130]
     12c3442:	00 
     12c3443:	b9 10 27 00 00       	mov    ecx,0x2710
     12c3448:	4c 89 f7             	mov    rdi,r14
     12c344b:	44 89 fa             	mov    edx,r15d
     12c344e:	31 c0                	xor    eax,eax
     12c3450:	e8 45 88 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c3455:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12c345a:	4c 89 f6             	mov    rsi,r14
     12c345d:	e8 cc 85 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c3462:	4c 89 f7             	mov    rdi,r14
     12c3465:	e8 26 aa 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c346a:	bd fb 01 00 00       	mov    ebp,0x1fb
     12c346f:	e9 27 02 00 00       	jmp    12c369b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108c1f>
     12c3474:	84 c9                	test   cl,cl
     12c3476:	0f 84 45 03 00 00    	je     12c37c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108d45>
     12c347c:	49 83 c6 60          	add    r14,0x60
     12c3480:	31 d2                	xor    edx,edx
     12c3482:	84 c0                	test   al,al
     12c3484:	0f 94 c2             	sete   dl
     12c3487:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
     12c348c:	4c 89 e3             	mov    rbx,r12
     12c348f:	4c 89 e7             	mov    rdi,r12
     12c3492:	4c 89 f6             	mov    rsi,r14
     12c3495:	e8 08 db ff ff       	call   12c0fa2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x106526>
     12c349a:	49 89 c6             	mov    r14,rax
     12c349d:	48 c1 e8 20          	shr    rax,0x20

### caller/xfer 0x12c38b2; FDE=(19673564, 19677186)
     12c3881:	84 c0                	test   al,al
     12c3883:	0f 84 c7 00 00 00    	je     12c3950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108ed4>
     12c3889:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     12c3890:	00 
     12c3891:	e8 98 1a 40 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     12c3896:	45 31 ff             	xor    r15d,r15d
     12c3899:	e9 12 01 00 00       	jmp    12c39b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108f34>
     12c389e:	48 8d 35 6f 38 08 ff 	lea    rsi,[rip+0xffffffffff08386f]        # 347114 <_ZTSSt12bad_any_cast@@Base-0x490b4>
     12c38a5:	48 8d 9c 24 d0 00 00 	lea    rbx,[rsp+0xd0]
     12c38ac:	00 
     12c38ad:	48 89 df             	mov    rdi,rbx
     12c38b0:	31 c0                	xor    eax,eax
     12c38b2:	e8 e3 83 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c38b7:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12c38bc:	48 89 de             	mov    rsi,rbx
     12c38bf:	e8 6a 81 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c38c4:	48 89 df             	mov    rdi,rbx
     12c38c7:	e8 c4 a5 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c38cc:	e9 76 04 00 00       	jmp    12c3d47 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1092cb>
     12c38d1:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     12c38d8:	00 
     12c38d9:	e8 3a f5 94 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
     12c38de:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     12c38e5:	00 
     12c38e6:	e8 2d f5 94 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
     12c38eb:	4c 89 e7             	mov    rdi,r12
     12c38ee:	e8 b1 ec 2d 00       	call   15a25a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e7b28>
     12c38f3:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
     12c38f8:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
     12c38fd:	48 29 d1             	sub    rcx,rdx
     12c3900:	48 c1 f9 02          	sar    rcx,0x2
     12c3904:	6a 01                	push   0x1
     12c3906:	5e                   	pop    rsi

### caller/xfer 0x12c3a11; FDE=(19673564, 19677186)
     12c39e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12c39e8:	ff 50 70             	call   QWORD PTR [rax+0x70]
     12c39eb:	44 01 e0             	add    eax,r12d
     12c39ee:	3d 11 27 00 00       	cmp    eax,0x2711
     12c39f3:	72 40                	jb     12c3a35 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108fb9>
     12c39f5:	48 8d 35 10 b8 06 ff 	lea    rsi,[rip+0xffffffffff06b810]        # 32f20c <_ZTSSt12bad_any_cast@@Base-0x60fbc>
     12c39fc:	48 8d 9c 24 30 01 00 	lea    rbx,[rsp+0x130]
     12c3a03:	00 
     12c3a04:	b9 10 27 00 00       	mov    ecx,0x2710
     12c3a09:	48 89 df             	mov    rdi,rbx
     12c3a0c:	44 89 e2             	mov    edx,r12d
     12c3a0f:	31 c0                	xor    eax,eax
     12c3a11:	e8 84 82 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c3a16:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12c3a1b:	48 89 de             	mov    rsi,rbx
     12c3a1e:	e8 0b 80 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c3a23:	48 89 df             	mov    rdi,rbx
     12c3a26:	e8 65 a4 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c3a2b:	bd fb 01 00 00       	mov    ebp,0x1fb
     12c3a30:	e9 05 fe ff ff       	jmp    12c383a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108dbe>
     12c3a35:	4d 8b 66 20          	mov    r12,QWORD PTR [r14+0x20]
     12c3a39:	49 8b 5e 28          	mov    rbx,QWORD PTR [r14+0x28]
     12c3a3d:	49 39 dc             	cmp    r12,rbx
     12c3a40:	74 22                	je     12c3a64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108fe8>
     12c3a42:	49 8b be 00 01 00 00 	mov    rdi,QWORD PTR [r14+0x100]
     12c3a49:	48 85 ff             	test   rdi,rdi
     12c3a4c:	74 10                	je     12c3a5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108fe2>
     12c3a4e:	4c 89 e6             	mov    rsi,r12
     12c3a51:	e8 3a a3 7f ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     12c3a56:	84 c0                	test   al,al
     12c3a58:	0f 84 8c 01 00 00    	je     12c3bea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10916e>
     12c3a5e:	49 83 c4 58          	add    r12,0x58
     12c3a62:	eb d9                	jmp    12c3a3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108fc1>

### caller/xfer 0x12c3dea; FDE=(19673564, 19677186)
     12c3dc7:	41 5c                	pop    r12
     12c3dc9:	41 5d                	pop    r13
     12c3dcb:	41 5e                	pop    r14
     12c3dcd:	41 5f                	pop    r15
     12c3dcf:	5d                   	pop    rbp
     12c3dd0:	c3                   	ret
     12c3dd1:	48 8d 54 24 59       	lea    rdx,[rsp+0x59]
     12c3dd6:	48 8d 35 5b 3d 0b ff 	lea    rsi,[rip+0xffffffffff0b3d5b]        # 377b38 <_ZTSSt12bad_any_cast@@Base-0x18690>
     12c3ddd:	4c 8d b4 24 90 01 00 	lea    r14,[rsp+0x190]
     12c3de4:	00 
     12c3de5:	4c 89 f7             	mov    rdi,r14
     12c3de8:	31 c0                	xor    eax,eax
     12c3dea:	e8 ab 7e 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c3def:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12c3df4:	4c 89 f6             	mov    rsi,r14
     12c3df7:	e8 32 7c 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c3dfc:	4c 89 f7             	mov    rdi,r14
     12c3dff:	e8 8c a0 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c3e04:	48 89 df             	mov    rdi,rbx
     12c3e07:	e8 84 a0 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c3e0c:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     12c3e13:	00 
     12c3e14:	e8 ff ef 94 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
     12c3e19:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     12c3e20:	00 
     12c3e21:	e8 f2 ef 94 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
     12c3e26:	e9 b6 f5 ff ff       	jmp    12c33e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108965>
     12c3e2b:	48 8d 94 24 d1 00 00 	lea    rdx,[rsp+0xd1]
     12c3e32:	00 
     12c3e33:	48 8d 35 bd 48 06 ff 	lea    rsi,[rip+0xffffffffff0648bd]        # 3286f7 <_ZTSSt12bad_any_cast@@Base-0x67ad1>
     12c3e3a:	4c 8d bc 24 30 01 00 	lea    r15,[rsp+0x130]
     12c3e41:	00 
     12c3e42:	4c 89 ff             	mov    rdi,r15

### caller/xfer 0x12c3e47; FDE=(19673564, 19677186)
     12c3e14:	e8 ff ef 94 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
     12c3e19:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     12c3e20:	00 
     12c3e21:	e8 f2 ef 94 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
     12c3e26:	e9 b6 f5 ff ff       	jmp    12c33e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108965>
     12c3e2b:	48 8d 94 24 d1 00 00 	lea    rdx,[rsp+0xd1]
     12c3e32:	00 
     12c3e33:	48 8d 35 bd 48 06 ff 	lea    rsi,[rip+0xffffffffff0648bd]        # 3286f7 <_ZTSSt12bad_any_cast@@Base-0x67ad1>
     12c3e3a:	4c 8d bc 24 30 01 00 	lea    r15,[rsp+0x130]
     12c3e41:	00 
     12c3e42:	4c 89 ff             	mov    rdi,r15
     12c3e45:	31 c0                	xor    eax,eax
     12c3e47:	e8 4e 7e 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c3e4c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12c3e51:	4c 89 fe             	mov    rsi,r15
     12c3e54:	e8 d5 7b 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c3e59:	4c 89 ff             	mov    rdi,r15
     12c3e5c:	e8 2f a0 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c3e61:	e9 6f f4 ff ff       	jmp    12c32d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108859>
     12c3e66:	48 8d 94 24 d1 00 00 	lea    rdx,[rsp+0xd1]
     12c3e6d:	00 
     12c3e6e:	48 8d 35 13 f7 09 ff 	lea    rsi,[rip+0xffffffffff09f713]        # 363588 <_ZTSSt12bad_any_cast@@Base-0x2cc40>
     12c3e75:	4c 8d b4 24 30 01 00 	lea    r14,[rsp+0x130]
     12c3e7c:	00 
     12c3e7d:	4c 89 f7             	mov    rdi,r14
     12c3e80:	31 c0                	xor    eax,eax
     12c3e82:	e8 13 7e 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c3e87:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12c3e8c:	4c 89 f6             	mov    rsi,r14
     12c3e8f:	e8 9a 7b 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c3e94:	4c 89 f7             	mov    rdi,r14
     12c3e97:	e8 f4 9f 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c3e9c:	48 89 df             	mov    rdi,rbx

### caller/xfer 0x12c3e82; FDE=(19673564, 19677186)
     12c3e51:	4c 89 fe             	mov    rsi,r15
     12c3e54:	e8 d5 7b 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c3e59:	4c 89 ff             	mov    rdi,r15
     12c3e5c:	e8 2f a0 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c3e61:	e9 6f f4 ff ff       	jmp    12c32d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108859>
     12c3e66:	48 8d 94 24 d1 00 00 	lea    rdx,[rsp+0xd1]
     12c3e6d:	00 
     12c3e6e:	48 8d 35 13 f7 09 ff 	lea    rsi,[rip+0xffffffffff09f713]        # 363588 <_ZTSSt12bad_any_cast@@Base-0x2cc40>
     12c3e75:	4c 8d b4 24 30 01 00 	lea    r14,[rsp+0x130]
     12c3e7c:	00 
     12c3e7d:	4c 89 f7             	mov    rdi,r14
     12c3e80:	31 c0                	xor    eax,eax
     12c3e82:	e8 13 7e 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c3e87:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12c3e8c:	4c 89 f6             	mov    rsi,r14
     12c3e8f:	e8 9a 7b 7b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12c3e94:	4c 89 f7             	mov    rdi,r14
     12c3e97:	e8 f4 9f 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c3e9c:	48 89 df             	mov    rdi,rbx
     12c3e9f:	e8 ec 9f 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c3ea4:	e9 91 f9 ff ff       	jmp    12c383a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108dbe>
     12c3ea9:	e8 02 bc 52 00       	call   17efab0 <__stack_chk_fail@plt>
     12c3eae:	49 89 c6             	mov    r14,rax
     12c3eb1:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     12c3eb8:	00 
     12c3eb9:	e8 70 14 40 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     12c3ebe:	e9 37 01 00 00       	jmp    12c3ffa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10957e>
     12c3ec3:	e9 bc 00 00 00       	jmp    12c3f84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x109508>
     12c3ec8:	e9 b7 00 00 00       	jmp    12c3f84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x109508>
     12c3ecd:	49 89 c6             	mov    r14,rax
     12c3ed0:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     12c3ed7:	00 
     12c3ed8:	e8 b3 9f 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### caller/xfer 0x12c4d84; FDE=(19680288, 19680901)
     12c4d57:	48 89 c1             	mov    rcx,rax
     12c4d5a:	41 ff 90 80 00 00 00 	call   QWORD PTR [r8+0x80]
     12c4d61:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     12c4d65:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12c4d68:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12c4d6b:	eb 65                	jmp    12c4dd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a356>
     12c4d6d:	48 ff c0             	inc    rax
     12c4d70:	48 8d 35 08 ea 09 ff 	lea    rsi,[rip+0xffffffffff09ea08]        # 36377f <_ZTSSt12bad_any_cast@@Base-0x2ca49>
     12c4d77:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
     12c4d7c:	48 89 df             	mov    rdi,rbx
     12c4d7f:	48 89 c2             	mov    rdx,rax
     12c4d82:	31 c0                	xor    eax,eax
     12c4d84:	e8 11 6f 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c4d89:	49 8b 06             	mov    rax,QWORD PTR [r14]
     12c4d8c:	4c 89 f7             	mov    rdi,r14
     12c4d8f:	be f4 01 00 00       	mov    esi,0x1f4
     12c4d94:	48 89 da             	mov    rdx,rbx
     12c4d97:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12c4d9a:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12c4d9f:	e8 ec 90 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c4da4:	eb 4c                	jmp    12c4df2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a376>
     12c4da6:	48 8b 5b 08          	mov    rbx,QWORD PTR [rbx+0x8]
     12c4daa:	48 8d 35 39 db 06 ff 	lea    rsi,[rip+0xffffffffff06db39]        # 3328ea <_ZTSSt12bad_any_cast@@Base-0x5d8de>
     12c4db1:	48 89 e7             	mov    rdi,rsp
     12c4db4:	e8 c5 4c 7b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12c4db9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12c4dbc:	48 89 e2             	mov    rdx,rsp
     12c4dbf:	48 89 df             	mov    rdi,rbx
     12c4dc2:	be f4 01 00 00       	mov    esi,0x1f4
     12c4dc7:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12c4dca:	48 89 e7             	mov    rdi,rsp
     12c4dcd:	e8 be 90 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c4dd2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]

### caller/xfer 0x12c7acb; FDE=(19692188, 19692368)
     12c7a9f:	48 83 ec 28          	sub    rsp,0x28
     12c7aa3:	48 89 fb             	mov    rbx,rdi
     12c7aa6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12c7aad:	00 00 
     12c7aaf:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     12c7ab4:	85 f6                	test   esi,esi
     12c7ab6:	74 4b                	je     12c7b03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d087>
     12c7ab8:	89 f2                	mov    edx,esi
     12c7aba:	48 8d 35 f1 ad 06 ff 	lea    rsi,[rip+0xffffffffff06adf1]        # 3328b2 <_ZTSSt12bad_any_cast@@Base-0x5d916>
     12c7ac1:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     12c7ac6:	4c 89 f7             	mov    rdi,r14
     12c7ac9:	31 c0                	xor    eax,eax
     12c7acb:	e8 ca 41 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c7ad0:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12c7ad3:	48 89 df             	mov    rdi,rbx
     12c7ad6:	be f4 01 00 00       	mov    esi,0x1f4
     12c7adb:	4c 89 f2             	mov    rdx,r14
     12c7ade:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12c7ae1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     12c7ae6:	e8 a5 63 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c7aeb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12c7af2:	00 00 
     12c7af4:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     12c7af9:	75 50                	jne    12c7b4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d0cf>
     12c7afb:	48 83 c4 28          	add    rsp,0x28
     12c7aff:	5b                   	pop    rbx
     12c7b00:	41 5e                	pop    r14
     12c7b02:	c3                   	ret
     12c7b03:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12c7b06:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     12c7b0a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     12c7b11:	00 00 
     12c7b13:	48 3b 4c 24 20       	cmp    rcx,QWORD PTR [rsp+0x20]

### caller/xfer 0x12db67f; FDE=(19772728, 19773791)
     12db651:	e8 28 e4 79 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12db656:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12db659:	48 89 df             	mov    rdi,rbx
     12db65c:	be 93 01 00 00       	mov    esi,0x193
     12db661:	4c 89 f2             	mov    rdx,r14
     12db664:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12db667:	eb 38                	jmp    12db6a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x120c25>
     12db669:	48 8d 54 24 29       	lea    rdx,[rsp+0x29]
     12db66e:	48 8d 35 dc c1 0a ff 	lea    rsi,[rip+0xffffffffff0ac1dc]        # 387851 <_ZTSSt12bad_any_cast@@Base-0x8977>
     12db675:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
     12db67a:	4c 89 ff             	mov    rdi,r15
     12db67d:	31 c0                	xor    eax,eax
     12db67f:	e8 16 06 50 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12db684:	4c 89 f7             	mov    rdi,r14
     12db687:	e8 04 28 51 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12db68c:	48 8b bb 18 01 00 00 	mov    rdi,QWORD PTR [rbx+0x118]
     12db693:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12db696:	be 90 01 00 00       	mov    esi,0x190
     12db69b:	4c 89 fa             	mov    rdx,r15
     12db69e:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12db6a1:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     12db6a6:	e8 e5 27 51 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12db6ab:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12db6b2:	00 00 
     12db6b4:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
     12db6bb:	00 
     12db6bc:	0f 85 98 02 00 00    	jne    12db95a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x120ede>
     12db6c2:	48 81 c4 e8 00 00 00 	add    rsp,0xe8
     12db6c9:	5b                   	pop    rbx
     12db6ca:	41 5c                	pop    r12
     12db6cc:	41 5d                	pop    r13
     12db6ce:	41 5e                	pop    r14
     12db6d0:	41 5f                	pop    r15

### caller/xfer 0x12e26d3; FDE=(19799654, 19806798)
     12e269e:	00 
     12e269f:	4c 89 e6             	mov    rsi,r12
     12e26a2:	e9 6a 05 00 00       	jmp    12e2c11 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x128195>
     12e26a7:	48 8d 35 01 3b 05 ff 	lea    rsi,[rip+0xffffffffff053b01]        # 3361af <_ZTSSt12bad_any_cast@@Base-0x5a019>
     12e26ae:	e9 6d 06 00 00       	jmp    12e2d20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1282a4>
     12e26b3:	48 8d 35 3a 82 08 ff 	lea    rsi,[rip+0xffffffffff08823a]        # 36a8f4 <_ZTSSt12bad_any_cast@@Base-0x258d4>
     12e26ba:	e9 61 06 00 00       	jmp    12e2d20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1282a4>
     12e26bf:	48 8d 35 4e 4a 06 ff 	lea    rsi,[rip+0xffffffffff064a4e]        # 347114 <_ZTSSt12bad_any_cast@@Base-0x490b4>
     12e26c6:	48 8d 9c 24 40 01 00 	lea    rbx,[rsp+0x140]
     12e26cd:	00 
     12e26ce:	48 89 df             	mov    rdi,rbx
     12e26d1:	31 c0                	xor    eax,eax
     12e26d3:	e8 c2 95 4f 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12e26d8:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     12e26dd:	48 89 de             	mov    rsi,rbx
     12e26e0:	e8 49 93 79 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12e26e5:	48 89 df             	mov    rdi,rbx
     12e26e8:	e8 a3 b7 50 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12e26ed:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     12e26f4:	00 
     12e26f5:	e8 b6 e3 7d ff       	call   ac0ab0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda50>
     12e26fa:	e9 2b 06 00 00       	jmp    12e2d2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1282ae>
     12e26ff:	48 8d 35 fc b7 09 ff 	lea    rsi,[rip+0xffffffffff09b7fc]        # 37df02 <_ZTSSt12bad_any_cast@@Base-0x122c6>
     12e2706:	45 31 f6             	xor    r14d,r14d
     12e2709:	4c 8d a4 24 40 01 00 	lea    r12,[rsp+0x140]
     12e2710:	00 
     12e2711:	4c 89 e7             	mov    rdi,r12
     12e2714:	4c 89 ea             	mov    rdx,r13
     12e2717:	31 c0                	xor    eax,eax
     12e2719:	e8 7c 95 4f 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12e271e:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     12e2723:	4c 89 e6             	mov    rsi,r12
     12e2726:	e8 03 93 79 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>

### caller/xfer 0x12e2719; FDE=(19799654, 19806798)
     12e26e8:	e8 a3 b7 50 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12e26ed:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     12e26f4:	00 
     12e26f5:	e8 b6 e3 7d ff       	call   ac0ab0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda50>
     12e26fa:	e9 2b 06 00 00       	jmp    12e2d2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1282ae>
     12e26ff:	48 8d 35 fc b7 09 ff 	lea    rsi,[rip+0xffffffffff09b7fc]        # 37df02 <_ZTSSt12bad_any_cast@@Base-0x122c6>
     12e2706:	45 31 f6             	xor    r14d,r14d
     12e2709:	4c 8d a4 24 40 01 00 	lea    r12,[rsp+0x140]
     12e2710:	00 
     12e2711:	4c 89 e7             	mov    rdi,r12
     12e2714:	4c 89 ea             	mov    rdx,r13
     12e2717:	31 c0                	xor    eax,eax
     12e2719:	e8 7c 95 4f 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12e271e:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     12e2723:	4c 89 e6             	mov    rsi,r12
     12e2726:	e8 03 93 79 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12e272b:	4c 89 e7             	mov    rdi,r12
     12e272e:	e8 5d b7 50 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12e2733:	45 31 ed             	xor    r13d,r13d
     12e2736:	31 c9                	xor    ecx,ecx
     12e2738:	e9 e8 04 00 00       	jmp    12e2c25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1281a9>
     12e273d:	48 83 a4 24 d0 00 00 	and    QWORD PTR [rsp+0xd0],0x0
     12e2744:	00 00 
     12e2746:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
     12e274d:	00 
     12e274e:	48 39 ce             	cmp    rsi,rcx
     12e2751:	74 30                	je     12e2783 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x127d07>
     12e2753:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
     12e275a:	00 
     12e275b:	4c 89 f7             	mov    rdi,r14
     12e275e:	e8 c7 7d 3e 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     12e2763:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     12e276a:	00 

### caller/xfer 0x12e2c9d; FDE=(19799654, 19806798)
     12e2c72:	4c 8b 65 78          	mov    r12,QWORD PTR [rbp+0x78]
     12e2c76:	4c 8b ad 80 00 00 00 	mov    r13,QWORD PTR [rbp+0x80]
     12e2c7d:	8a 45 58             	mov    al,BYTE PTR [rbp+0x58]
     12e2c80:	4d 39 ec             	cmp    r12,r13
     12e2c83:	74 34                	je     12e2cb9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12823d>
     12e2c85:	84 c0                	test   al,al
     12e2c87:	75 30                	jne    12e2cb9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12823d>
     12e2c89:	48 8d 35 c4 63 05 ff 	lea    rsi,[rip+0xffffffffff0563c4]        # 339054 <_ZTSSt12bad_any_cast@@Base-0x57174>
     12e2c90:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     12e2c97:	00 
     12e2c98:	48 89 df             	mov    rdi,rbx
     12e2c9b:	31 c0                	xor    eax,eax
     12e2c9d:	e8 f8 8f 4f 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12e2ca2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     12e2ca7:	48 89 de             	mov    rsi,rbx
     12e2caa:	e8 7f 8d 79 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12e2caf:	48 89 df             	mov    rdi,rbx
     12e2cb2:	e8 d9 b1 50 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12e2cb7:	eb 71                	jmp    12e2d2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1282ae>
     12e2cb9:	4d 39 ec             	cmp    r12,r13
     12e2cbc:	74 2d                	je     12e2ceb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12826f>
     12e2cbe:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     12e2cc3:	48 8b b8 a0 01 00 00 	mov    rdi,QWORD PTR [rax+0x1a0]
     12e2cca:	48 85 ff             	test   rdi,rdi
     12e2ccd:	74 10                	je     12e2cdf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x128263>
     12e2ccf:	4c 89 e6             	mov    rsi,r12
     12e2cd2:	e8 b9 b0 7d ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     12e2cd7:	84 c0                	test   al,al
     12e2cd9:	0f 84 da 01 00 00    	je     12e2eb9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12843d>
     12e2cdf:	49 83 c4 58          	add    r12,0x58
     12e2ce3:	4d 39 ec             	cmp    r12,r13
     12e2ce6:	75 d6                	jne    12e2cbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x128242>
     12e2ce8:	41 8a 07             	mov    al,BYTE PTR [r15]

### caller/xfer 0x12e2d9f; FDE=(19799654, 19806798)
     12e2d7b:	41 5d                	pop    r13
     12e2d7d:	41 5e                	pop    r14
     12e2d7f:	41 5f                	pop    r15
     12e2d81:	5d                   	pop    rbp
     12e2d82:	c3                   	ret
     12e2d83:	48 8d 94 24 c1 00 00 	lea    rdx,[rsp+0xc1]
     12e2d8a:	00 
     12e2d8b:	48 8d 35 6c 62 05 ff 	lea    rsi,[rip+0xffffffffff05626c]        # 338ffe <_ZTSSt12bad_any_cast@@Base-0x571ca>
     12e2d92:	4c 8d b4 24 40 01 00 	lea    r14,[rsp+0x140]
     12e2d99:	00 
     12e2d9a:	4c 89 f7             	mov    rdi,r14
     12e2d9d:	31 c0                	xor    eax,eax
     12e2d9f:	e8 f6 8e 4f 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12e2da4:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     12e2da9:	4c 89 f6             	mov    rsi,r14
     12e2dac:	e8 7d 8c 79 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12e2db1:	4c 89 f7             	mov    rdi,r14
     12e2db4:	e8 d7 b0 50 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12e2db9:	48 89 df             	mov    rdi,rbx
     12e2dbc:	e8 cf b0 50 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12e2dc1:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     12e2dc8:	00 
     12e2dc9:	e8 4a 00 93 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
     12e2dce:	e9 57 ff ff ff       	jmp    12e2d2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1282ae>
     12e2dd3:	48 89 df             	mov    rdi,rbx
     12e2dd6:	e8 db 78 2c 00       	call   15aa6b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3efc3a>
     12e2ddb:	48 89 df             	mov    rdi,rbx
     12e2dde:	e8 ef dd fd ff       	call   12c0bd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x106156>
     12e2de3:	4d 39 f4             	cmp    r12,r14
     12e2de6:	74 7a                	je     12e2e62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1283e6>
     12e2de8:	45 31 e4             	xor    r12d,r12d
     12e2deb:	be e8 00 00 00       	mov    esi,0xe8
     12e2df0:	31 ed                	xor    ebp,ebp

### caller/xfer 0x12e3314; FDE=(19799654, 19806798)
     12e32e1:	e8 48 20 3e 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     12e32e6:	4c 89 f7             	mov    rdi,r14
     12e32e9:	e8 a2 ab 50 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12e32ee:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     12e32f3:	e9 5e 03 00 00       	jmp    12e3656 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x128bda>
     12e32f8:	48 8d 94 24 41 01 00 	lea    rdx,[rsp+0x141]
     12e32ff:	00 
     12e3300:	48 8d 35 8b 68 07 ff 	lea    rsi,[rip+0xffffffffff07688b]        # 359b92 <_ZTSSt12bad_any_cast@@Base-0x36636>
     12e3307:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
     12e330e:	00 
     12e330f:	4c 89 f7             	mov    rdi,r14
     12e3312:	31 c0                	xor    eax,eax
     12e3314:	e8 81 89 4f 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12e3319:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     12e331e:	4c 89 f6             	mov    rsi,r14
     12e3321:	e8 08 87 79 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12e3326:	4c 89 f7             	mov    rdi,r14
     12e3329:	e8 62 ab 50 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12e332e:	e9 7c f9 ff ff       	jmp    12e2caf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x128233>
     12e3333:	49 ff c6             	inc    r14
     12e3336:	48 8d 35 3b 77 09 ff 	lea    rsi,[rip+0xffffffffff09773b]        # 37aa78 <_ZTSSt12bad_any_cast@@Base-0x15750>
     12e333d:	48 8d 9c 24 40 01 00 	lea    rbx,[rsp+0x140]
     12e3344:	00 
     12e3345:	48 89 df             	mov    rdi,rbx
     12e3348:	4c 89 f2             	mov    rdx,r14
     12e334b:	31 c0                	xor    eax,eax
     12e334d:	e8 48 89 4f 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12e3352:	e9 81 f3 ff ff       	jmp    12e26d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x127c5c>
     12e3357:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     12e335e:	00 
     12e335f:	6a 03                	push   0x3
     12e3361:	5e                   	pop    rsi
     12e3362:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]

### caller/xfer 0x12e334d; FDE=(19799654, 19806798)
     12e331e:	4c 89 f6             	mov    rsi,r14
     12e3321:	e8 08 87 79 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12e3326:	4c 89 f7             	mov    rdi,r14
     12e3329:	e8 62 ab 50 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12e332e:	e9 7c f9 ff ff       	jmp    12e2caf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x128233>
     12e3333:	49 ff c6             	inc    r14
     12e3336:	48 8d 35 3b 77 09 ff 	lea    rsi,[rip+0xffffffffff09773b]        # 37aa78 <_ZTSSt12bad_any_cast@@Base-0x15750>
     12e333d:	48 8d 9c 24 40 01 00 	lea    rbx,[rsp+0x140]
     12e3344:	00 
     12e3345:	48 89 df             	mov    rdi,rbx
     12e3348:	4c 89 f2             	mov    rdx,r14
     12e334b:	31 c0                	xor    eax,eax
     12e334d:	e8 48 89 4f 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12e3352:	e9 81 f3 ff ff       	jmp    12e26d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x127c5c>
     12e3357:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     12e335e:	00 
     12e335f:	6a 03                	push   0x3
     12e3361:	5e                   	pop    rsi
     12e3362:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
     12e3369:	00 
     12e336a:	e8 33 97 2c 00       	call   15acaa2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f2026>
     12e336f:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     12e3376:	00 
     12e3377:	4c 8d bc 24 40 01 00 	lea    r15,[rsp+0x140]
     12e337e:	00 
     12e337f:	4c 89 fe             	mov    rsi,r15
     12e3382:	e8 c3 73 2c 00       	call   15aa74a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3efcce>
     12e3387:	4c 89 ff             	mov    rdi,r15
     12e338a:	e8 c3 70 2c 00       	call   15aa452 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ef9d6>
     12e338f:	e9 97 00 00 00       	jmp    12e342b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1289af>
     12e3394:	31 f6                	xor    esi,esi
     12e3396:	eb 05                	jmp    12e339d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x128921>
     12e3398:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]

### caller/xfer 0x13f24a8; FDE=(20915233, 20916194)
     13f2479:	48 89 7b 48          	mov    QWORD PTR [rbx+0x48],rdi
     13f247d:	83 63 50 00          	and    DWORD PTR [rbx+0x50],0x0
     13f2481:	48 8d 05 40 56 54 00 	lea    rax,[rip+0x545640]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     13f2488:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
     13f248c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13f248f:	ff 50 60             	call   QWORD PTR [rax+0x60]
     13f2492:	4c 8d 7b 60          	lea    r15,[rbx+0x60]
     13f2496:	48 8d 35 09 ee f8 fe 	lea    rsi,[rip+0xfffffffffef8ee09]        # 3812a6 <_ZTSSt12bad_any_cast@@Base-0xef22>
     13f249d:	45 31 ed             	xor    r13d,r13d
     13f24a0:	4c 89 ff             	mov    rdi,r15
     13f24a3:	48 89 c2             	mov    rdx,rax
     13f24a6:	31 c0                	xor    eax,eax
     13f24a8:	e8 ed 97 3e 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     13f24ad:	48 c7 43 78 02 00 00 	mov    QWORD PTR [rbx+0x78],0x2
     13f24b4:	00 
     13f24b5:	83 a3 80 00 00 00 00 	and    DWORD PTR [rbx+0x80],0x0
     13f24bc:	48 83 a3 88 00 00 00 	and    QWORD PTR [rbx+0x88],0x0
     13f24c3:	00 
     13f24c4:	4c 89 a3 90 00 00 00 	mov    QWORD PTR [rbx+0x90],r12
     13f24cb:	40 84 ed             	test   bpl,bpl
     13f24ce:	74 41                	je     13f2511 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x237a95>
     13f24d0:	0f 57 c0             	xorps  xmm0,xmm0
     13f24d3:	48 89 e6             	mov    rsi,rsp
     13f24d6:	0f 11 46 4c          	movups XMMWORD PTR [rsi+0x4c],xmm0
     13f24da:	0f 29 46 40          	movaps XMMWORD PTR [rsi+0x40],xmm0
     13f24de:	0f 29 46 30          	movaps XMMWORD PTR [rsi+0x30],xmm0
     13f24e2:	0f 29 46 20          	movaps XMMWORD PTR [rsi+0x20],xmm0
     13f24e6:	0f 29 46 10          	movaps XMMWORD PTR [rsi+0x10],xmm0
     13f24ea:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
     13f24ed:	48 8d 3d d0 9a f8 fe 	lea    rdi,[rip+0xfffffffffef89ad0]        # 37bfc4 <_ZTSSt12bad_any_cast@@Base-0x14204>
     13f24f4:	e8 b7 c1 3f 00       	call   17ee6b0 <__system_property_get@plt>
     13f24f9:	85 c0                	test   eax,eax
     13f24fb:	7e 11                	jle    13f250e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x237a92>

### caller/xfer 0x145fa35; FDE=(21362972, 21363603)
     145f9ff:	74 07                	je     145fa08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a4f8c>
     145fa01:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
     145fa06:	eb 05                	jmp    145fa0d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a4f91>
     145fa08:	48 8d 54 24 21       	lea    rdx,[rsp+0x21]
     145fa0d:	80 7c 24 38 00       	cmp    BYTE PTR [rsp+0x38],0x0
     145fa12:	48 8d 05 4b 3b fe fe 	lea    rax,[rip+0xfffffffffefe3b4b]        # 443564 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9170>
     145fa19:	48 8d 0d 40 3b fe fe 	lea    rcx,[rip+0xfffffffffefe3b40]        # 443560 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x916c>
     145fa20:	48 0f 44 c8          	cmove  rcx,rax
     145fa24:	48 8d 35 d2 95 ec fe 	lea    rsi,[rip+0xfffffffffeec95d2]        # 328ffd <_ZTSSt12bad_any_cast@@Base-0x671cb>
     145fa2b:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
     145fa30:	48 89 df             	mov    rdi,rbx
     145fa33:	31 c0                	xor    eax,eax
     145fa35:	e8 60 c2 37 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     145fa3a:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
     145fa41:	00 
     145fa42:	48 89 de             	mov    rsi,rbx
     145fa45:	e8 14 ba 08 00       	call   14eb45e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3309e2>
     145fa4a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     145fa4f:	e8 3c e4 38 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     145fa54:	48 8d 9c 24 e0 04 00 	lea    rbx,[rsp+0x4e0]
     145fa5b:	00 
     145fa5c:	48 89 df             	mov    rdi,rbx
     145fa5f:	e8 2c e4 38 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     145fa64:	4c 8d b4 24 b0 05 00 	lea    r14,[rsp+0x5b0]
     145fa6b:	00 
     145fa6c:	4c 89 f7             	mov    rdi,r14
     145fa6f:	e8 1c e4 38 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     145fa74:	48 8d b4 24 08 05 00 	lea    rsi,[rsp+0x508]
     145fa7b:	00 
     145fa7c:	49 8b bf b8 00 00 00 	mov    rdi,QWORD PTR [r15+0xb8]
     145fa83:	31 c0                	xor    eax,eax
     145fa85:	88 03                	mov    BYTE PTR [rbx],al
     145fa87:	88 43 18             	mov    BYTE PTR [rbx+0x18],al

### caller/xfer 0x14601e3; FDE=(21365048, 21365495)
     14601b2:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14601b7:	48 89 e6             	mov    rsi,rsp
     14601ba:	e8 5f b4 08 00       	call   14eb61e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x330ba2>
     14601bf:	f6 44 24 18 01       	test   BYTE PTR [rsp+0x18],0x1
     14601c4:	74 07                	je     14601cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a5751>
     14601c6:	48 8b 54 24 28       	mov    rdx,QWORD PTR [rsp+0x28]
     14601cb:	eb 05                	jmp    14601d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a5756>
     14601cd:	48 8d 54 24 19       	lea    rdx,[rsp+0x19]
     14601d2:	48 8d 35 78 95 ed fe 	lea    rsi,[rip+0xfffffffffeed9578]        # 339751 <_ZTSSt12bad_any_cast@@Base-0x56a77>
     14601d9:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
     14601de:	48 89 df             	mov    rdi,rbx
     14601e1:	31 c0                	xor    eax,eax
     14601e3:	e8 b2 ba 37 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     14601e8:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14601ed:	48 89 de             	mov    rsi,rbx
     14601f0:	e8 69 b2 08 00       	call   14eb45e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3309e2>
     14601f5:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
     14601fa:	48 89 df             	mov    rdi,rbx
     14601fd:	e8 8e dc 38 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1460202:	4c 8d b4 24 00 01 00 	lea    r14,[rsp+0x100]
     1460209:	00 
     146020a:	4c 89 f7             	mov    rdi,r14
     146020d:	e8 7e dc 38 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1460212:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
     1460217:	49 8b bf b8 00 00 00 	mov    rdi,QWORD PTR [r15+0xb8]
     146021e:	31 c0                	xor    eax,eax
     1460220:	88 03                	mov    BYTE PTR [rbx],al
     1460222:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
     1460225:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
     146022a:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
     146022f:	48 8d 8c 24 00 01 00 	lea    rcx,[rsp+0x100]
     1460236:	00 
     1460237:	e8 e6 4b 1c 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>

### caller/xfer 0x14ca21c; FDE=(21798980, 21800002)
     14ca1ee:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     14ca1f5:	00 
     14ca1f6:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
     14ca1fd:	00 
     14ca1fe:	e8 33 12 02 00       	call   14eb436 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3309ba>
     14ca203:	48 8d 35 f2 5a e6 fe 	lea    rsi,[rip+0xfffffffffee65af2]        # 32fcfc <_ZTSSt12bad_any_cast@@Base-0x604cc>
     14ca20a:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
     14ca20f:	48 89 df             	mov    rdi,rbx
     14ca212:	89 ea                	mov    edx,ebp
     14ca214:	44 89 f9             	mov    ecx,r15d
     14ca217:	45 89 e0             	mov    r8d,r12d
     14ca21a:	31 c0                	xor    eax,eax
     14ca21c:	e8 79 1a 31 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     14ca221:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     14ca228:	00 
     14ca229:	48 89 de             	mov    rsi,rbx
     14ca22c:	e8 2d 12 02 00       	call   14eb45e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3309e2>
     14ca231:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
     14ca236:	48 89 df             	mov    rdi,rbx
     14ca239:	e8 52 3c 32 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ca23e:	4c 8d bc 24 10 01 00 	lea    r15,[rsp+0x110]
     14ca245:	00 
     14ca246:	4c 89 ff             	mov    rdi,r15
     14ca249:	e8 42 3c 32 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ca24e:	48 8d b4 24 48 01 00 	lea    rsi,[rsp+0x148]
     14ca255:	00 
     14ca256:	4d 89 f4             	mov    r12,r14
     14ca259:	49 8b be c8 01 00 00 	mov    rdi,QWORD PTR [r14+0x1c8]
     14ca260:	31 c0                	xor    eax,eax
     14ca262:	88 03                	mov    BYTE PTR [rbx],al
     14ca264:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
     14ca267:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
     14ca26c:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]

### caller/xfer 0x14cabf3; FDE=(21801740, 21802151)
     14cabc4:	74 10                	je     14cabd6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31015a>
     14cabc6:	48 8b 54 08 10       	mov    rdx,QWORD PTR [rax+rcx*1+0x10]
     14cabcb:	eb 10                	jmp    14cabdd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x310161>
     14cabcd:	48 8d 15 b1 84 e6 fe 	lea    rdx,[rip+0xfffffffffee684b1]        # 333085 <_ZTSSt12bad_any_cast@@Base-0x5d143>
     14cabd4:	eb 07                	jmp    14cabdd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x310161>
     14cabd6:	48 8d 14 08          	lea    rdx,[rax+rcx*1]
     14cabda:	48 ff c2             	inc    rdx
     14cabdd:	0f b6 8b 79 02 00 00 	movzx  ecx,BYTE PTR [rbx+0x279]
     14cabe4:	48 8d 35 7b 84 e6 fe 	lea    rsi,[rip+0xfffffffffee6847b]        # 333066 <_ZTSSt12bad_any_cast@@Base-0x5d162>
     14cabeb:	49 89 e6             	mov    r14,rsp
     14cabee:	4c 89 f7             	mov    rdi,r14
     14cabf1:	31 c0                	xor    eax,eax
     14cabf3:	e8 a2 10 31 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     14cabf8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14cabfd:	4c 89 f6             	mov    rsi,r14
     14cac00:	e8 59 08 02 00       	call   14eb45e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3309e2>
     14cac05:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14cac0a:	48 8d 35 f7 e4 f6 fe 	lea    rsi,[rip+0xfffffffffef6e4f7]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14cac11:	e8 39 fd 61 ff       	call   aea94f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x378ef>
     14cac16:	49 89 e6             	mov    r14,rsp
     14cac19:	4c 89 f7             	mov    rdi,r14
     14cac1c:	e8 6f 32 32 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14cac21:	4c 8d bc 24 d0 00 00 	lea    r15,[rsp+0xd0]
     14cac28:	00 
     14cac29:	4c 89 ff             	mov    rdi,r15
     14cac2c:	e8 5f 32 32 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14cac31:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     14cac36:	48 8b bb c8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1c8]
     14cac3d:	31 c0                	xor    eax,eax
     14cac3f:	41 88 06             	mov    BYTE PTR [r14],al
     14cac42:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
     14cac46:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
     14cac4b:	48 89 e2             	mov    rdx,rsp

### caller/xfer 0x15095b9; FDE=(22058231, 22058502)
     150958b:	e8 38 a4 0f 00       	call   16039c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x448f4c>
     1509590:	41 f6 07 01          	test   BYTE PTR [r15],0x1
     1509594:	74 07                	je     150959d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34eb21>
     1509596:	4c 8b 4c 24 20       	mov    r9,QWORD PTR [rsp+0x20]
     150959b:	eb 05                	jmp    15095a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34eb26>
     150959d:	4c 8d 4c 24 11       	lea    r9,[rsp+0x11]
     15095a2:	48 8d 35 20 e9 e5 fe 	lea    rsi,[rip+0xfffffffffee5e920]        # 367ec9 <_ZTSSt12bad_any_cast@@Base-0x282ff>
     15095a9:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     15095ae:	4c 89 e2             	mov    rdx,r12
     15095b1:	48 89 d9             	mov    rcx,rbx
     15095b4:	4d 89 f0             	mov    r8,r14
     15095b7:	31 c0                	xor    eax,eax
     15095b9:	e8 dc 26 2d 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15095be:	4c 89 ff             	mov    rdi,r15
     15095c1:	e8 ca 48 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15095c6:	48 89 ef             	mov    rdi,rbp
     15095c9:	e8 c2 48 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15095ce:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     15095d3:	e8 b8 48 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15095d8:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     15095dd:	e8 ae 48 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15095e2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15095e9:	00 00 
     15095eb:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
     15095f0:	75 0f                	jne    1509601 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34eb85>
     15095f2:	48 83 c4 78          	add    rsp,0x78
     15095f6:	5b                   	pop    rbx
     15095f7:	41 5c                	pop    r12
     15095f9:	41 5d                	pop    r13
     15095fb:	41 5e                	pop    r14
     15095fd:	41 5f                	pop    r15
     15095ff:	5d                   	pop    rbp
     1509600:	c3                   	ret

### caller/xfer 0x1509703; FDE=(22058658, 22058817)
     15096d4:	eb 44                	jmp    150971a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ec9e>
     15096d6:	49 8d 5f 20          	lea    rbx,[r15+0x20]
     15096da:	41 f6 87 c8 00 00 00 	test   BYTE PTR [r15+0xc8],0x1
     15096e1:	01 
     15096e2:	74 09                	je     15096ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ec71>
     15096e4:	49 8b 97 d8 00 00 00 	mov    rdx,QWORD PTR [r15+0xd8]
     15096eb:	eb 07                	jmp    15096f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ec78>
     15096ed:	49 8d 97 c9 00 00 00 	lea    rdx,[r15+0xc9]
     15096f4:	48 8d 35 f3 7f e7 fe 	lea    rsi,[rip+0xfffffffffee77ff3]        # 3816ee <_ZTSSt12bad_any_cast@@Base-0xeada>
     15096fb:	49 89 e6             	mov    r14,rsp
     15096fe:	4c 89 f7             	mov    rdi,r14
     1509701:	31 c0                	xor    eax,eax
     1509703:	e8 92 25 2d 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1509708:	48 89 df             	mov    rdi,rbx
     150970b:	4c 89 f6             	mov    rsi,r14
     150970e:	41 ff 57 38          	call   QWORD PTR [r15+0x38]
     1509712:	48 89 e7             	mov    rdi,rsp
     1509715:	e8 76 47 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150971a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1509721:	00 00 
     1509723:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     1509728:	75 0a                	jne    1509734 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ecb8>
     150972a:	48 83 c4 20          	add    rsp,0x20
     150972e:	5b                   	pop    rbx
     150972f:	41 5e                	pop    r14
     1509731:	41 5f                	pop    r15
     1509733:	c3                   	ret
     1509734:	e8 77 63 2e 00       	call   17efab0 <__stack_chk_fail@plt>
     1509739:	48 89 c7             	mov    rdi,rax
     150973c:	e8 64 03 57 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1509741:	cc                   	int3
     1509742:	53                   	push   rbx
     1509743:	48 89 fb             	mov    rbx,rdi

### caller/xfer 0x15307a1; FDE=(22218500, 22218748)
     1530775:	e9 82 00 00 00       	jmp    15307fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375d80>
     153077a:	48 8d 54 24 01       	lea    rdx,[rsp+0x1]
     153077f:	f6 03 01             	test   BYTE PTR [rbx],0x1
     1530782:	74 06                	je     153078a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375d0e>
     1530784:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
     1530788:	eb 03                	jmp    153078d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375d11>
     153078a:	48 ff c3             	inc    rbx
     153078d:	48 8d 35 1a 47 e4 fe 	lea    rsi,[rip+0xfffffffffee4471a]        # 374eae <_ZTSSt12bad_any_cast@@Base-0x1b31a>
     1530794:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
     1530799:	4c 89 e7             	mov    rdi,r12
     153079c:	48 89 d9             	mov    rcx,rbx
     153079f:	31 c0                	xor    eax,eax
     15307a1:	e8 f4 b4 2a 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15307a6:	4c 89 ff             	mov    rdi,r15
     15307a9:	e8 e2 d6 2b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15307ae:	48 8d 05 3b 6c 40 00 	lea    rax,[rip+0x406c3b]        # 19373f0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x38>
     15307b5:	49 39 46 08          	cmp    QWORD PTR [r14+0x8],rax
     15307b9:	0f 94 c0             	sete   al
     15307bc:	41 83 3e 07          	cmp    DWORD PTR [r14],0x7
     15307c0:	0f 94 c1             	sete   cl
     15307c3:	20 c1                	and    cl,al
     15307c5:	0f b6 f1             	movzx  esi,cl
     15307c8:	83 f6 03             	xor    esi,0x3
     15307cb:	4c 89 e7             	mov    rdi,r12
     15307ce:	e8 29 00 00 00       	call   15307fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375d80>
     15307d3:	4c 89 e7             	mov    rdi,r12
     15307d6:	e8 b5 d6 2b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15307db:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15307e2:	00 00 
     15307e4:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     15307e9:	75 0c                	jne    15307f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375d7b>
     15307eb:	48 83 c4 38          	add    rsp,0x38
     15307ef:	5b                   	pop    rbx

### caller/xfer 0x156d758; FDE=(22467210, 22471908)
     156d72f:	85 c0                	test   eax,eax
     156d731:	7e 59                	jle    156d78c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b2d10>
     156d733:	4d 8b 6e 28          	mov    r13,QWORD PTR [r14+0x28]
     156d737:	4c 89 f7             	mov    rdi,r14
     156d73a:	e8 ff 69 00 00       	call   157413e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b96c2>
     156d73f:	48 89 c3             	mov    rbx,rax
     156d742:	48 8d 35 dd a9 df fe 	lea    rsi,[rip+0xfffffffffedfa9dd]        # 368126 <_ZTSSt12bad_any_cast@@Base-0x280a2>
     156d749:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
     156d750:	00 
     156d751:	4c 89 e7             	mov    rdi,r12
     156d754:	89 ea                	mov    edx,ebp
     156d756:	31 c0                	xor    eax,eax
     156d758:	e8 3d e5 26 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     156d75d:	4c 89 e7             	mov    rdi,r12
     156d760:	e8 d1 e0 50 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     156d765:	49 89 d0             	mov    r8,rdx
     156d768:	4d 8b 55 00          	mov    r10,QWORD PTR [r13+0x0]
     156d76c:	6a 01                	push   0x1
     156d76e:	41 59                	pop    r9
     156d770:	4c 89 ef             	mov    rdi,r13
     156d773:	48 89 de             	mov    rsi,rbx
     156d776:	31 d2                	xor    edx,edx
     156d778:	48 89 c1             	mov    rcx,rax
     156d77b:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     156d77f:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     156d786:	00 
     156d787:	e8 04 07 28 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     156d78c:	4d 63 ae e0 00 00 00 	movsxd r13,DWORD PTR [r14+0xe0]
     156d793:	41 0f b7 86 81 00 00 	movzx  eax,WORD PTR [r14+0x81]
     156d79a:	00 
     156d79b:	a8 20                	test   al,0x20
     156d79d:	6a 01                	push   0x1
     156d79f:	5b                   	pop    rbx

### caller/xfer 0x156dd52; FDE=(22467210, 22471908)
     156dd24:	4c 8b 84 24 70 01 00 	mov    r8,QWORD PTR [rsp+0x170]
     156dd2b:	00 
     156dd2c:	eb 08                	jmp    156dd36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b32ba>
     156dd2e:	4c 8d 84 24 61 01 00 	lea    r8,[rsp+0x161]
     156dd35:	00 
     156dd36:	48 8d 35 b4 6f e1 fe 	lea    rsi,[rip+0xfffffffffee16fb4]        # 384cf1 <_ZTSSt12bad_any_cast@@Base-0xb4d7>
     156dd3d:	4c 8d ac 24 f0 00 00 	lea    r13,[rsp+0xf0]
     156dd44:	00 
     156dd45:	4c 89 ef             	mov    rdi,r13
     156dd48:	48 89 da             	mov    rdx,rbx
     156dd4b:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     156dd50:	31 c0                	xor    eax,eax
     156dd52:	e8 43 df 26 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     156dd57:	4c 89 ef             	mov    rdi,r13
     156dd5a:	e8 d7 da 50 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     156dd5f:	49 89 d0             	mov    r8,rdx
     156dd62:	4d 8b 17             	mov    r10,QWORD PTR [r15]
     156dd65:	6a 01                	push   0x1
     156dd67:	41 59                	pop    r9
     156dd69:	4c 89 ff             	mov    rdi,r15
     156dd6c:	4c 89 e6             	mov    rsi,r12
     156dd6f:	31 d2                	xor    edx,edx
     156dd71:	48 89 c1             	mov    rcx,rax
     156dd74:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     156dd78:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     156dd7f:	00 
     156dd80:	e8 0b 01 28 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     156dd85:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     156dd8c:	00 
     156dd8d:	e8 fe 00 28 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     156dd92:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]
     156dd96:	49 8d 86 d8 00 00 00 	lea    rax,[r14+0xd8]
     156dd9d:	4c 8b bd a0 01 00 00 	mov    r15,QWORD PTR [rbp+0x1a0]

### caller/xfer 0x156eb00; FDE=(22471908, 22476960)
     156ead5:	85 c0                	test   eax,eax
     156ead7:	7e 5d                	jle    156eb36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b40ba>
     156ead9:	4c 8b 63 28          	mov    r12,QWORD PTR [rbx+0x28]
     156eadd:	48 89 df             	mov    rdi,rbx
     156eae0:	e8 8d 50 00 00       	call   1573b72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b90f6>
     156eae5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     156eaea:	48 8d 35 35 96 df fe 	lea    rsi,[rip+0xfffffffffedf9635]        # 368126 <_ZTSSt12bad_any_cast@@Base-0x280a2>
     156eaf1:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
     156eaf8:	00 
     156eaf9:	4c 89 ef             	mov    rdi,r13
     156eafc:	89 ea                	mov    edx,ebp
     156eafe:	31 c0                	xor    eax,eax
     156eb00:	e8 95 d1 26 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     156eb05:	4c 89 ef             	mov    rdi,r13
     156eb08:	e8 29 cd 50 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     156eb0d:	49 89 d0             	mov    r8,rdx
     156eb10:	4d 8b 14 24          	mov    r10,QWORD PTR [r12]
     156eb14:	6a 01                	push   0x1
     156eb16:	41 59                	pop    r9
     156eb18:	4c 89 e7             	mov    rdi,r12
     156eb1b:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     156eb20:	31 d2                	xor    edx,edx
     156eb22:	48 89 c1             	mov    rcx,rax
     156eb25:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     156eb29:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     156eb30:	00 
     156eb31:	e8 5a f3 27 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     156eb36:	48 63 ab e0 00 00 00 	movsxd rbp,DWORD PTR [rbx+0xe0]
     156eb3d:	0f b7 83 81 00 00 00 	movzx  eax,WORD PTR [rbx+0x81]
     156eb44:	a8 20                	test   al,0x20
     156eb46:	6a 01                	push   0x1
     156eb48:	41 5d                	pop    r13
     156eb4a:	4c 0f 44 ed          	cmove  r13,rbp

### caller/xfer 0x156f117; FDE=(22471908, 22476960)
     156f0e9:	4c 8b 84 24 80 01 00 	mov    r8,QWORD PTR [rsp+0x180]
     156f0f0:	00 
     156f0f1:	eb 08                	jmp    156f0fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b467f>
     156f0f3:	4c 8d 84 24 71 01 00 	lea    r8,[rsp+0x171]
     156f0fa:	00 
     156f0fb:	48 8d 35 ef 5b e1 fe 	lea    rsi,[rip+0xfffffffffee15bef]        # 384cf1 <_ZTSSt12bad_any_cast@@Base-0xb4d7>
     156f102:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
     156f109:	00 
     156f10a:	4c 89 ef             	mov    rdi,r13
     156f10d:	48 89 ea             	mov    rdx,rbp
     156f110:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     156f115:	31 c0                	xor    eax,eax
     156f117:	e8 7e cb 26 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     156f11c:	4c 89 ef             	mov    rdi,r13
     156f11f:	e8 12 c7 50 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     156f124:	49 89 d0             	mov    r8,rdx
     156f127:	4d 8b 17             	mov    r10,QWORD PTR [r15]
     156f12a:	6a 01                	push   0x1
     156f12c:	41 59                	pop    r9
     156f12e:	4c 89 ff             	mov    rdi,r15
     156f131:	4c 89 e6             	mov    rsi,r12
     156f134:	31 d2                	xor    edx,edx
     156f136:	48 89 c1             	mov    rcx,rax
     156f139:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     156f13d:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     156f144:	00 
     156f145:	e8 46 ed 27 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     156f14a:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     156f151:	00 
     156f152:	e8 39 ed 27 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     156f157:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     156f15c:	48 8d 83 d8 00 00 00 	lea    rax,[rbx+0xd8]
     156f163:	4d 8b bd a0 01 00 00 	mov    r15,QWORD PTR [r13+0x1a0]

### caller/xfer 0x1579d4f; FDE=(22517128, 22520847)
     1579d1e:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1579d23:	4c 89 f6             	mov    rsi,r14
     1579d26:	e8 35 c7 00 00       	call   1586460 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cb9e4>
     1579d2b:	f6 44 24 30 01       	test   BYTE PTR [rsp+0x30],0x1
     1579d30:	74 66                	je     1579d98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bf31c>
     1579d32:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
     1579d37:	eb 64                	jmp    1579d9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bf321>
     1579d39:	48 8d 54 24 61       	lea    rdx,[rsp+0x61]
     1579d3e:	48 8d 35 53 71 dd fe 	lea    rsi,[rip+0xfffffffffedd7153]        # 350e98 <_ZTSSt12bad_any_cast@@Base-0x3f330>
     1579d45:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     1579d4a:	4c 89 ff             	mov    rdi,r15
     1579d4d:	31 c0                	xor    eax,eax
     1579d4f:	e8 46 1f 26 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1579d54:	4c 89 ff             	mov    rdi,r15
     1579d57:	e8 da 1a 50 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1579d5c:	49 89 d0             	mov    r8,rdx
     1579d5f:	4d 8b 16             	mov    r10,QWORD PTR [r14]
     1579d62:	6a 01                	push   0x1
     1579d64:	41 59                	pop    r9
     1579d66:	4c 89 f7             	mov    rdi,r14
     1579d69:	4c 89 e6             	mov    rsi,r12
     1579d6c:	31 d2                	xor    edx,edx
     1579d6e:	48 89 c1             	mov    rcx,rax
     1579d71:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     1579d75:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1579d7a:	e8 11 41 27 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1579d7f:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1579d84:	e8 07 41 27 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1579d89:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1579d90:	00 
     1579d91:	e8 1e 39 71 ff       	call   c8d6b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1da654>
     1579d96:	eb 57                	jmp    1579def <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bf373>
     1579d98:	48 8d 54 24 31       	lea    rdx,[rsp+0x31]

### caller/xfer 0x1579db1; FDE=(22517128, 22520847)
     1579d7f:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1579d84:	e8 07 41 27 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1579d89:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1579d90:	00 
     1579d91:	e8 1e 39 71 ff       	call   c8d6b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1da654>
     1579d96:	eb 57                	jmp    1579def <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bf373>
     1579d98:	48 8d 54 24 31       	lea    rdx,[rsp+0x31]
     1579d9d:	48 8d 35 a6 96 db fe 	lea    rsi,[rip+0xfffffffffedb96a6]        # 33344a <_ZTSSt12bad_any_cast@@Base-0x5cd7e>
     1579da4:	4c 8d b4 24 b0 00 00 	lea    r14,[rsp+0xb0]
     1579dab:	00 
     1579dac:	4c 89 f7             	mov    rdi,r14
     1579daf:	31 c0                	xor    eax,eax
     1579db1:	e8 e4 1e 26 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1579db6:	4c 89 f7             	mov    rdi,r14
     1579db9:	e8 78 1a 50 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1579dbe:	49 89 d0             	mov    r8,rdx
     1579dc1:	4d 8b 14 24          	mov    r10,QWORD PTR [r12]
     1579dc5:	6a 02                	push   0x2
     1579dc7:	41 59                	pop    r9
     1579dc9:	4c 89 e7             	mov    rdi,r12
     1579dcc:	4c 89 ee             	mov    rsi,r13
     1579dcf:	31 d2                	xor    edx,edx
     1579dd1:	48 89 c1             	mov    rcx,rax
     1579dd4:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     1579dd8:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1579ddf:	00 
     1579de0:	e8 ab 40 27 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1579de5:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1579dea:	e8 a1 40 27 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1579def:	0f b7 83 81 00 00 00 	movzx  eax,WORD PTR [rbx+0x81]
     1579df6:	b9 00 02 00 00       	mov    ecx,0x200
     1579dfb:	89 c2                	mov    edx,eax
     1579dfd:	21 ca                	and    edx,ecx

### caller/xfer 0x157a007; FDE=(22517128, 22520847)
     1579fd6:	74 62                	je     157a03a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bf5be>
     1579fd8:	4c 8b 73 28          	mov    r14,QWORD PTR [rbx+0x28]
     1579fdc:	48 89 df             	mov    rdi,rbx
     1579fdf:	e8 5a a1 ff ff       	call   157413e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b96c2>
     1579fe4:	49 89 c7             	mov    r15,rax
     1579fe7:	8b 93 00 01 00 00    	mov    edx,DWORD PTR [rbx+0x100]
     1579fed:	03 93 e0 00 00 00    	add    edx,DWORD PTR [rbx+0xe0]
     1579ff3:	48 8d 35 93 0e dd fe 	lea    rsi,[rip+0xfffffffffedd0e93]        # 34ae8d <_ZTSSt12bad_any_cast@@Base-0x4533b>
     1579ffa:	4c 8d ac 24 b0 00 00 	lea    r13,[rsp+0xb0]
     157a001:	00 
     157a002:	4c 89 ef             	mov    rdi,r13
     157a005:	31 c0                	xor    eax,eax
     157a007:	e8 8e 1c 26 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     157a00c:	4c 89 ef             	mov    rdi,r13
     157a00f:	e8 22 18 50 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     157a014:	49 89 d0             	mov    r8,rdx
     157a017:	4d 8b 16             	mov    r10,QWORD PTR [r14]
     157a01a:	6a 01                	push   0x1
     157a01c:	41 59                	pop    r9
     157a01e:	4c 89 f7             	mov    rdi,r14
     157a021:	4c 89 fe             	mov    rsi,r15
     157a024:	31 d2                	xor    edx,edx
     157a026:	48 89 c1             	mov    rcx,rax
     157a029:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     157a02d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     157a034:	00 
     157a035:	e8 56 3e 27 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     157a03a:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
     157a041:	e8 72 fa 72 ff       	call   ca9ab8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f6a58>
     157a046:	48 8d bb f8 00 00 00 	lea    rdi,[rbx+0xf8]
     157a04d:	e8 66 fa 72 ff       	call   ca9ab8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f6a58>
     157a052:	80 a3 81 00 00 00 fb 	and    BYTE PTR [rbx+0x81],0xfb
     157a059:	48 89 df             	mov    rdi,rbx

### caller/xfer 0x157a6a0; FDE=(22521060, 22523726)
     157a672:	48 8b 5f 28          	mov    rbx,QWORD PTR [rdi+0x28]
     157a676:	e8 c3 9a ff ff       	call   157413e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b96c2>
     157a67b:	48 89 c5             	mov    rbp,rax
     157a67e:	41 f6 45 00 01       	test   BYTE PTR [r13+0x0],0x1
     157a683:	74 04                	je     157a689 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bfc0d>
     157a685:	4d 8b 75 10          	mov    r14,QWORD PTR [r13+0x10]
     157a689:	48 8d 35 13 f5 db fe 	lea    rsi,[rip+0xfffffffffedbf513]        # 339ba3 <_ZTSSt12bad_any_cast@@Base-0x56625>
     157a690:	4c 8d 6c 24 48       	lea    r13,[rsp+0x48]
     157a695:	4c 89 ef             	mov    rdi,r13
     157a698:	4c 89 fa             	mov    rdx,r15
     157a69b:	4c 89 f1             	mov    rcx,r14
     157a69e:	31 c0                	xor    eax,eax
     157a6a0:	e8 f5 15 26 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     157a6a5:	4c 89 ef             	mov    rdi,r13
     157a6a8:	e8 89 11 50 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     157a6ad:	49 89 d0             	mov    r8,rdx
     157a6b0:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     157a6b5:	48 b9 00 00 00 00 01 	movabs rcx,0x100000000
     157a6bc:	00 00 00 
     157a6bf:	48 09 ca             	or     rdx,rcx
     157a6c2:	4c 8b 13             	mov    r10,QWORD PTR [rbx]
     157a6c5:	48 89 df             	mov    rdi,rbx
     157a6c8:	48 89 ee             	mov    rsi,rbp
     157a6cb:	48 89 c1             	mov    rcx,rax
     157a6ce:	45 31 c9             	xor    r9d,r9d
     157a6d1:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     157a6d5:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     157a6da:	e8 b1 37 27 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     157a6df:	4d 85 e4             	test   r12,r12
     157a6e2:	74 19                	je     157a6fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bfc81>
     157a6e4:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     157a6e9:	48 8d b8 d8 00 00 00 	lea    rdi,[rax+0xd8]
     157a6f0:	49 63 54 24 08       	movsxd rdx,DWORD PTR [r12+0x8]

### caller/xfer 0x157adfa; FDE=(22521060, 22523726)
     157adc8:	e8 ed b7 25 00       	call   17d65ba <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x23db>
     157adcd:	48 83 c4 20          	add    rsp,0x20
     157add1:	49 8b 5c 24 28       	mov    rbx,QWORD PTR [r12+0x28]
     157add6:	4c 89 e7             	mov    rdi,r12
     157add9:	e8 60 93 ff ff       	call   157413e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b96c2>
     157adde:	49 89 c7             	mov    r15,rax
     157ade1:	41 8b 94 24 e0 00 00 	mov    edx,DWORD PTR [r12+0xe0]
     157ade8:	00 
     157ade9:	48 8d 35 9a f7 dd fe 	lea    rsi,[rip+0xfffffffffeddf79a]        # 35a58a <_ZTSSt12bad_any_cast@@Base-0x35c3e>
     157adf0:	4c 8d 74 24 48       	lea    r14,[rsp+0x48]
     157adf5:	4c 89 f7             	mov    rdi,r14
     157adf8:	31 c0                	xor    eax,eax
     157adfa:	e8 9b 0e 26 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     157adff:	4c 89 f7             	mov    rdi,r14
     157ae02:	e8 2f 0a 50 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     157ae07:	49 89 d0             	mov    r8,rdx
     157ae0a:	4d 89 ee             	mov    r14,r13
     157ae0d:	48 b9 00 00 00 00 01 	movabs rcx,0x100000000
     157ae14:	00 00 00 
     157ae17:	49 09 ce             	or     r14,rcx
     157ae1a:	4c 8b 13             	mov    r10,QWORD PTR [rbx]
     157ae1d:	48 89 df             	mov    rdi,rbx
     157ae20:	4c 89 fe             	mov    rsi,r15
     157ae23:	4c 89 f2             	mov    rdx,r14
     157ae26:	48 89 c1             	mov    rcx,rax
     157ae29:	45 31 c9             	xor    r9d,r9d
     157ae2c:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     157ae30:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     157ae35:	e8 56 30 27 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     157ae3a:	6a 05                	push   0x5
     157ae3c:	5d                   	pop    rbp
     157ae3d:	41 f6 84 24 81 00 00 	test   BYTE PTR [r12+0x81],0x10
     157ae44:	00 10 

### caller/xfer 0x157e54b; FDE=(22535814, 22539243)
     157e51a:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     157e51f:	4c 89 f6             	mov    rsi,r14
     157e522:	e8 39 7f 00 00       	call   1586460 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cb9e4>
     157e527:	f6 44 24 10 01       	test   BYTE PTR [rsp+0x10],0x1
     157e52c:	74 69                	je     157e597 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c3b1b>
     157e52e:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     157e533:	eb 67                	jmp    157e59c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c3b20>
     157e535:	48 8d 54 24 41       	lea    rdx,[rsp+0x41]
     157e53a:	48 8d 35 57 29 dd fe 	lea    rsi,[rip+0xfffffffffedd2957]        # 350e98 <_ZTSSt12bad_any_cast@@Base-0x3f330>
     157e541:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
     157e546:	4c 89 ef             	mov    rdi,r13
     157e549:	31 c0                	xor    eax,eax
     157e54b:	e8 4a d7 25 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     157e550:	4c 89 ef             	mov    rdi,r13
     157e553:	e8 de d2 4f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     157e558:	49 89 d0             	mov    r8,rdx
     157e55b:	4d 8b 16             	mov    r10,QWORD PTR [r14]
     157e55e:	6a 01                	push   0x1
     157e560:	41 59                	pop    r9
     157e562:	4c 89 f7             	mov    rdi,r14
     157e565:	4c 89 e6             	mov    rsi,r12
     157e568:	31 d2                	xor    edx,edx
     157e56a:	48 89 c1             	mov    rcx,rax
     157e56d:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     157e571:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     157e576:	e8 15 f9 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     157e57b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     157e580:	e8 0b f9 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     157e585:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     157e58c:	00 
     157e58d:	e8 22 f1 70 ff       	call   c8d6b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1da654>
     157e592:	49 89 ec             	mov    r12,rbp
     157e595:	eb 5b                	jmp    157e5f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c3b76>

### caller/xfer 0x157e5b0; FDE=(22535814, 22539243)
     157e580:	e8 0b f9 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     157e585:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     157e58c:	00 
     157e58d:	e8 22 f1 70 ff       	call   c8d6b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1da654>
     157e592:	49 89 ec             	mov    r12,rbp
     157e595:	eb 5b                	jmp    157e5f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c3b76>
     157e597:	48 8d 54 24 11       	lea    rdx,[rsp+0x11]
     157e59c:	48 8d 35 a7 4e db fe 	lea    rsi,[rip+0xfffffffffedb4ea7]        # 33344a <_ZTSSt12bad_any_cast@@Base-0x5cd7e>
     157e5a3:	4c 8d b4 24 90 00 00 	lea    r14,[rsp+0x90]
     157e5aa:	00 
     157e5ab:	4c 89 f7             	mov    rdi,r14
     157e5ae:	31 c0                	xor    eax,eax
     157e5b0:	e8 e5 d6 25 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     157e5b5:	4c 89 f7             	mov    rdi,r14
     157e5b8:	e8 79 d2 4f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     157e5bd:	49 89 d0             	mov    r8,rdx
     157e5c0:	4d 8b 14 24          	mov    r10,QWORD PTR [r12]
     157e5c4:	6a 02                	push   0x2
     157e5c6:	41 59                	pop    r9
     157e5c8:	4c 89 e7             	mov    rdi,r12
     157e5cb:	4c 89 ee             	mov    rsi,r13
     157e5ce:	31 d2                	xor    edx,edx
     157e5d0:	48 89 c1             	mov    rcx,rax
     157e5d3:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     157e5d7:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     157e5de:	00 
     157e5df:	e8 ac f8 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     157e5e4:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     157e5e9:	e8 a2 f8 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     157e5ee:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     157e5f2:	0f b7 83 81 00 00 00 	movzx  eax,WORD PTR [rbx+0x81]
     157e5f9:	b9 00 02 00 00       	mov    ecx,0x200
     157e5fe:	89 c2                	mov    edx,eax

### caller/xfer 0x157e81b; FDE=(22535814, 22539243)
     157e7ea:	74 66                	je     157e852 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c3dd6>
     157e7ec:	4c 8b 73 28          	mov    r14,QWORD PTR [rbx+0x28]
     157e7f0:	48 89 df             	mov    rdi,rbx
     157e7f3:	e8 7a 53 ff ff       	call   1573b72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b90f6>
     157e7f8:	49 89 c7             	mov    r15,rax
     157e7fb:	8b 93 00 01 00 00    	mov    edx,DWORD PTR [rbx+0x100]
     157e801:	03 93 e0 00 00 00    	add    edx,DWORD PTR [rbx+0xe0]
     157e807:	48 8d 35 7f c6 dc fe 	lea    rsi,[rip+0xfffffffffedcc67f]        # 34ae8d <_ZTSSt12bad_any_cast@@Base-0x4533b>
     157e80e:	4c 8d a4 24 90 00 00 	lea    r12,[rsp+0x90]
     157e815:	00 
     157e816:	4c 89 e7             	mov    rdi,r12
     157e819:	31 c0                	xor    eax,eax
     157e81b:	e8 7a d4 25 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     157e820:	4c 89 e7             	mov    rdi,r12
     157e823:	e8 0e d0 4f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     157e828:	49 89 d0             	mov    r8,rdx
     157e82b:	4d 8b 16             	mov    r10,QWORD PTR [r14]
     157e82e:	6a 01                	push   0x1
     157e830:	41 59                	pop    r9
     157e832:	4c 89 f7             	mov    rdi,r14
     157e835:	4c 89 fe             	mov    rsi,r15
     157e838:	31 d2                	xor    edx,edx
     157e83a:	48 89 c1             	mov    rcx,rax
     157e83d:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     157e841:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     157e848:	00 
     157e849:	e8 42 f6 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     157e84e:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     157e852:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
     157e859:	e8 5a b2 72 ff       	call   ca9ab8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f6a58>
     157e85e:	48 8d bb f8 00 00 00 	lea    rdi,[rbx+0xf8]
     157e865:	e8 4e b2 72 ff       	call   ca9ab8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f6a58>
     157e86a:	80 a3 81 00 00 00 fb 	and    BYTE PTR [rbx+0x81],0xfb

### caller/xfer 0x157ee80; FDE=(22539456, 22542042)
     157ee51:	49 89 fe             	mov    r14,rdi
     157ee54:	e8 19 4d ff ff       	call   1573b72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b90f6>
     157ee59:	48 89 c5             	mov    rbp,rax
     157ee5c:	41 f6 45 00 01       	test   BYTE PTR [r13+0x0],0x1
     157ee61:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     157ee66:	74 04                	je     157ee6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c43f0>
     157ee68:	49 8b 4d 10          	mov    rcx,QWORD PTR [r13+0x10]
     157ee6c:	48 8d 35 30 ad db fe 	lea    rsi,[rip+0xfffffffffedbad30]        # 339ba3 <_ZTSSt12bad_any_cast@@Base-0x56625>
     157ee73:	4c 8d 6c 24 48       	lea    r13,[rsp+0x48]
     157ee78:	4c 89 ef             	mov    rdi,r13
     157ee7b:	4c 89 fa             	mov    rdx,r15
     157ee7e:	31 c0                	xor    eax,eax
     157ee80:	e8 15 ce 25 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     157ee85:	4c 89 ef             	mov    rdi,r13
     157ee88:	e8 a9 c9 4f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     157ee8d:	49 89 d0             	mov    r8,rdx
     157ee90:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
     157ee95:	48 b9 00 00 00 00 01 	movabs rcx,0x100000000
     157ee9c:	00 00 00 
     157ee9f:	48 09 ca             	or     rdx,rcx
     157eea2:	4c 8b 13             	mov    r10,QWORD PTR [rbx]
     157eea5:	48 89 df             	mov    rdi,rbx
     157eea8:	48 89 ee             	mov    rsi,rbp
     157eeab:	48 89 c1             	mov    rcx,rax
     157eeae:	45 31 c9             	xor    r9d,r9d
     157eeb1:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     157eeb5:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     157eeba:	e8 d1 ef 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     157eebf:	4c 89 f3             	mov    rbx,r14
     157eec2:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     157eec7:	8b 6c 24 1c          	mov    ebp,DWORD PTR [rsp+0x1c]
     157eecb:	4d 85 e4             	test   r12,r12
     157eece:	74 14                	je     157eee4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c4468>

### caller/xfer 0x157f57e; FDE=(22539456, 22542042)
     157f54f:	48 83 c4 20          	add    rsp,0x20
     157f553:	49 89 dc             	mov    r12,rbx
     157f556:	48 8b 5b 28          	mov    rbx,QWORD PTR [rbx+0x28]
     157f55a:	4c 89 e7             	mov    rdi,r12
     157f55d:	e8 10 46 ff ff       	call   1573b72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b90f6>
     157f562:	49 89 c7             	mov    r15,rax
     157f565:	41 8b 94 24 e0 00 00 	mov    edx,DWORD PTR [r12+0xe0]
     157f56c:	00 
     157f56d:	48 8d 35 16 b0 dd fe 	lea    rsi,[rip+0xfffffffffeddb016]        # 35a58a <_ZTSSt12bad_any_cast@@Base-0x35c3e>
     157f574:	4c 8d 74 24 48       	lea    r14,[rsp+0x48]
     157f579:	4c 89 f7             	mov    rdi,r14
     157f57c:	31 c0                	xor    eax,eax
     157f57e:	e8 17 c7 25 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     157f583:	4c 89 f7             	mov    rdi,r14
     157f586:	e8 ab c2 4f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     157f58b:	49 89 d0             	mov    r8,rdx
     157f58e:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     157f593:	48 b9 00 00 00 00 01 	movabs rcx,0x100000000
     157f59a:	00 00 00 
     157f59d:	49 09 ce             	or     r14,rcx
     157f5a0:	4c 8b 13             	mov    r10,QWORD PTR [rbx]
     157f5a3:	48 89 df             	mov    rdi,rbx
     157f5a6:	4c 89 fe             	mov    rsi,r15
     157f5a9:	4c 89 f2             	mov    rdx,r14
     157f5ac:	48 89 c1             	mov    rcx,rax
     157f5af:	45 31 c9             	xor    r9d,r9d
     157f5b2:	41 ff 52 10          	call   QWORD PTR [r10+0x10]
     157f5b6:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     157f5bb:	e8 d0 e8 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     157f5c0:	6a 05                	push   0x5
     157f5c2:	5d                   	pop    rbp
     157f5c3:	41 f6 84 24 81 00 00 	test   BYTE PTR [r12+0x81],0x10
     157f5ca:	00 10 

### caller/xfer 0x1586287; FDE=(22569511, 22570080)
     1586259:	41 8d af 38 ff ff ff 	lea    ebp,[r15-0xc8]
     1586260:	83 fd 64             	cmp    ebp,0x64
     1586263:	72 6a                	jb     15862cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cb853>
     1586265:	49 8b 7c 24 10       	mov    rdi,QWORD PTR [r12+0x10]
     158626a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     158626d:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1586270:	48 8d 35 00 d2 da fe 	lea    rsi,[rip+0xfffffffffedad200]        # 333477 <_ZTSSt12bad_any_cast@@Base-0x5cd51>
     1586277:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     158627c:	4c 89 ef             	mov    rdi,r13
     158627f:	48 89 c2             	mov    rdx,rax
     1586282:	44 89 f9             	mov    ecx,r15d
     1586285:	31 c0                	xor    eax,eax
     1586287:	e8 0e 5a 25 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     158628c:	4c 89 f7             	mov    rdi,r14
     158628f:	4c 89 ee             	mov    rsi,r13
     1586292:	e8 97 57 4f ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1586297:	4c 89 ef             	mov    rdi,r13
     158629a:	e8 f1 7b 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     158629f:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     15862a4:	48 8d 0d ad a5 3c 00 	lea    rcx,[rip+0x3ca5ad]        # 1950858 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x194a0>
     15862ab:	41 8b 54 24 08       	mov    edx,DWORD PTR [r12+0x8]
     15862b0:	48 8d 35 8b 85 df fe 	lea    rsi,[rip+0xfffffffffedf858b]        # 37e842 <_ZTSSt12bad_any_cast@@Base-0x11986>
     15862b7:	48 39 c8             	cmp    rax,rcx
     15862ba:	75 3c                	jne    15862f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cb87c>
     15862bc:	83 fa 07             	cmp    edx,0x7
     15862bf:	75 37                	jne    15862f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cb87c>
     15862c1:	45 31 ff             	xor    r15d,r15d
     15862c4:	4c 89 f7             	mov    rdi,r14
     15862c7:	e8 f4 7c 26 00       	call   17edfc0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKc@plt>
     15862cc:	44 89 3b             	mov    DWORD PTR [rbx],r15d
     15862cf:	83 fd 64             	cmp    ebp,0x64
     15862d2:	0f 92 c0             	setb   al
     15862d5:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28

### caller/xfer 0x15866b4; FDE=(22570328, 22570803)
     1586689:	0f 44 d0             	cmove  edx,eax
     158668c:	48 89 e7             	mov    rdi,rsp
     158668f:	e8 da 01 00 00       	call   158686e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cbdf2>
     1586694:	0f cd                	bswap  ebp
     1586696:	f6 04 24 01          	test   BYTE PTR [rsp],0x1
     158669a:	74 22                	je     15866be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cbc42>
     158669c:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     15866a1:	eb 20                	jmp    15866c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cbc47>
     15866a3:	48 8d 54 24 19       	lea    rdx,[rsp+0x19]
     15866a8:	48 8d 35 69 b7 de fe 	lea    rsi,[rip+0xfffffffffedeb769]        # 371e18 <_ZTSSt12bad_any_cast@@Base-0x1e3b0>
     15866af:	48 89 df             	mov    rdi,rbx
     15866b2:	31 c0                	xor    eax,eax
     15866b4:	e8 e1 55 25 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15866b9:	4c 89 f7             	mov    rdi,r14
     15866bc:	eb 25                	jmp    15866e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cbc67>
     15866be:	48 8d 4c 24 01       	lea    rcx,[rsp+0x1]
     15866c3:	48 8d 35 b3 1d e0 fe 	lea    rsi,[rip+0xfffffffffee01db3]        # 38847d <_ZTSSt12bad_any_cast@@Base-0x7d4b>
     15866ca:	48 89 df             	mov    rdi,rbx
     15866cd:	89 ea                	mov    edx,ebp
     15866cf:	31 c0                	xor    eax,eax
     15866d1:	e8 c4 55 25 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15866d6:	48 89 e7             	mov    rdi,rsp
     15866d9:	e8 b2 77 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15866de:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     15866e3:	e8 a8 77 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15866e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15866ef:	00 00 
     15866f1:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     15866f6:	75 36                	jne    158672e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cbcb2>
     15866f8:	48 83 c4 38          	add    rsp,0x38
     15866fc:	5b                   	pop    rbx
     15866fd:	41 5c                	pop    r12
     15866ff:	41 5d                	pop    r13

### caller/xfer 0x15866d1; FDE=(22570328, 22570803)
     15866a3:	48 8d 54 24 19       	lea    rdx,[rsp+0x19]
     15866a8:	48 8d 35 69 b7 de fe 	lea    rsi,[rip+0xfffffffffedeb769]        # 371e18 <_ZTSSt12bad_any_cast@@Base-0x1e3b0>
     15866af:	48 89 df             	mov    rdi,rbx
     15866b2:	31 c0                	xor    eax,eax
     15866b4:	e8 e1 55 25 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15866b9:	4c 89 f7             	mov    rdi,r14
     15866bc:	eb 25                	jmp    15866e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cbc67>
     15866be:	48 8d 4c 24 01       	lea    rcx,[rsp+0x1]
     15866c3:	48 8d 35 b3 1d e0 fe 	lea    rsi,[rip+0xfffffffffee01db3]        # 38847d <_ZTSSt12bad_any_cast@@Base-0x7d4b>
     15866ca:	48 89 df             	mov    rdi,rbx
     15866cd:	89 ea                	mov    edx,ebp
     15866cf:	31 c0                	xor    eax,eax
     15866d1:	e8 c4 55 25 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15866d6:	48 89 e7             	mov    rdi,rsp
     15866d9:	e8 b2 77 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15866de:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     15866e3:	e8 a8 77 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15866e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15866ef:	00 00 
     15866f1:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     15866f6:	75 36                	jne    158672e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cbcb2>
     15866f8:	48 83 c4 38          	add    rsp,0x38
     15866fc:	5b                   	pop    rbx
     15866fd:	41 5c                	pop    r12
     15866ff:	41 5d                	pop    r13
     1586701:	41 5e                	pop    r14
     1586703:	41 5f                	pop    r15
     1586705:	5d                   	pop    rbp
     1586706:	c3                   	ret
     1586707:	eb 00                	jmp    1586709 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cbc8d>
     1586709:	48 89 c3             	mov    rbx,rax
     158670c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1586711:	e8 7a 77 26 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### caller/xfer 0x15af1b9; FDE=(22737168, 22738175)
     15af188:	48 89 c6             	mov    rsi,rax
     15af18b:	e8 96 f4 11 00       	call   16ce626 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82792>
     15af190:	4d 8d 6f 30          	lea    r13,[r15+0x30]
     15af194:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     15af198:	f6 44 24 40 01       	test   BYTE PTR [rsp+0x40],0x1
     15af19d:	74 07                	je     15af1a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f472a>
     15af19f:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
     15af1a4:	eb 05                	jmp    15af1ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f472f>
     15af1a6:	48 8d 54 24 41       	lea    rdx,[rsp+0x41]
     15af1ab:	48 8d 35 f2 f6 dc fe 	lea    rsi,[rip+0xfffffffffedcf6f2]        # 37e8a4 <_ZTSSt12bad_any_cast@@Base-0x11924>
     15af1b2:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     15af1b7:	31 c0                	xor    eax,eax
     15af1b9:	e8 dc ca 22 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15af1be:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     15af1c3:	e8 c8 ec 23 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15af1c8:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     15af1cc:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
     15af1d1:	4c 89 ee             	mov    rsi,r13
     15af1d4:	e8 67 ed 23 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     15af1d9:	4c 89 73 50          	mov    QWORD PTR [rbx+0x50],r14
     15af1dd:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
     15af1e1:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     15af1e6:	48 89 ee             	mov    rsi,rbp
     15af1e9:	e8 d4 24 21 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     15af1ee:	48 89 6b 68          	mov    QWORD PTR [rbx+0x68],rbp
     15af1f2:	48 83 63 70 00       	and    QWORD PTR [rbx+0x70],0x0
     15af1f7:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
     15af1fb:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     15af1ff:	e8 a2 a6 03 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     15af204:	0f 57 c0             	xorps  xmm0,xmm0
     15af207:	0f 11 83 98 00 00 00 	movups XMMWORD PTR [rbx+0x98],xmm0
     15af20e:	0f 11 83 88 00 00 00 	movups XMMWORD PTR [rbx+0x88],xmm0
     15af215:	4c 89 a3 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],r12

### caller/xfer 0x15af711; FDE=(22738432, 22741911)
     15af6e5:	e8 a8 e0 1f 00       	call   17ad792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1618fe>
     15af6ea:	89 c5                	mov    ebp,eax
     15af6ec:	e8 a1 e0 1f 00       	call   17ad792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1618fe>
     15af6f1:	89 e9                	mov    ecx,ebp
     15af6f3:	48 c1 e0 20          	shl    rax,0x20
     15af6f7:	48 09 c8             	or     rax,rcx
     15af6fa:	48 8d 35 1b b9 d9 fe 	lea    rsi,[rip+0xfffffffffed9b91b]        # 34b01c <_ZTSSt12bad_any_cast@@Base-0x451ac>
     15af701:	4c 8d bc 24 a0 01 00 	lea    r15,[rsp+0x1a0]
     15af708:	00 
     15af709:	4c 89 ff             	mov    rdi,r15
     15af70c:	48 89 c2             	mov    rdx,rax
     15af70f:	31 c0                	xor    eax,eax
     15af711:	e8 84 c5 22 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15af716:	4c 8d b3 a8 01 00 00 	lea    r14,[rbx+0x1a8]
     15af71d:	4c 89 f7             	mov    rdi,r14
     15af720:	4c 89 fe             	mov    rsi,r15
     15af723:	e8 06 c3 4c ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     15af728:	4c 89 ff             	mov    rdi,r15
     15af72b:	e8 60 e7 23 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15af730:	48 8d bb 80 01 00 00 	lea    rdi,[rbx+0x180]
     15af737:	4c 89 f6             	mov    rsi,r14
     15af73a:	e8 23 0d 00 00       	call   15b0462 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f59e6>
     15af73f:	80 8b 18 01 00 00 01 	or     BYTE PTR [rbx+0x118],0x1
     15af746:	48 8d 73 38          	lea    rsi,[rbx+0x38]
     15af74a:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
     15af751:	48 8b 93 10 01 00 00 	mov    rdx,QWORD PTR [rbx+0x110]
     15af758:	f6 c2 01             	test   dl,0x1
     15af75b:	0f 85 a3 09 00 00    	jne    15b0104 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f5688>
     15af761:	e8 2c 60 1b 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15af766:	80 8b 18 01 00 00 02 	or     BYTE PTR [rbx+0x118],0x2
     15af76d:	48 8d 73 08          	lea    rsi,[rbx+0x8]
     15af771:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
     15af778:	48 8b 93 10 01 00 00 	mov    rdx,QWORD PTR [rbx+0x110]

### caller/xfer 0x15b4350; FDE=(22758014, 22758425)
     15b4322:	e8 49 1a 0e 00       	call   1695d70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49edc>
     15b4327:	e8 66 94 1f 00       	call   17ad792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1618fe>
     15b432c:	89 c5                	mov    ebp,eax
     15b432e:	e8 5f 94 1f 00       	call   17ad792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1618fe>
     15b4333:	89 e9                	mov    ecx,ebp
     15b4335:	48 c1 e0 20          	shl    rax,0x20
     15b4339:	48 09 c8             	or     rax,rcx
     15b433c:	48 8d 35 d9 6c d9 fe 	lea    rsi,[rip+0xfffffffffed96cd9]        # 34b01c <_ZTSSt12bad_any_cast@@Base-0x451ac>
     15b4343:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
     15b4348:	4c 89 e7             	mov    rdi,r12
     15b434b:	48 89 c2             	mov    rdx,rax
     15b434e:	31 c0                	xor    eax,eax
     15b4350:	e8 45 79 22 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15b4355:	4c 89 ff             	mov    rdi,r15
     15b4358:	4c 89 e6             	mov    rsi,r12
     15b435b:	e8 ce 76 4c ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     15b4360:	4c 89 e7             	mov    rdi,r12
     15b4363:	e8 28 9b 23 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15b4368:	49 8d b6 88 01 00 00 	lea    rsi,[r14+0x188]
     15b436f:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
     15b4374:	4c 89 e7             	mov    rdi,r12
     15b4377:	e8 da 1d 50 ff       	call   ab6156 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30f6>
     15b437c:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
     15b4381:	4c 89 ef             	mov    rdi,r13
     15b4384:	4c 89 fe             	mov    rsi,r15
     15b4387:	e8 ca 1d 50 ff       	call   ab6156 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30f6>
     15b438c:	49 89 e7             	mov    r15,rsp
     15b438f:	4c 89 ff             	mov    rdi,r15
     15b4392:	4c 89 e6             	mov    rsi,r12
     15b4395:	4c 89 ea             	mov    rdx,r13
     15b4398:	e8 f9 19 0e 00       	call   1695d96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49f02>
     15b439d:	49 8b 06             	mov    rax,QWORD PTR [r14]
     15b43a0:	48 89 df             	mov    rdi,rbx

### caller/xfer 0x15d9a15; FDE=(22911015, 22912492)
     15d99e7:	6a 01                	push   0x1
     15d99e9:	5b                   	pop    rbx
     15d99ea:	48 83 3c 24 00       	cmp    QWORD PTR [rsp],0x0
     15d99ef:	4c 8d a4 24 d8 00 00 	lea    r12,[rsp+0xd8]
     15d99f6:	00 
     15d99f7:	0f 84 ed 02 00 00    	je     15d9cea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f26e>
     15d99fd:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
     15d9a02:	48 89 df             	mov    rdi,rbx
     15d9a05:	48 8d 35 5a 80 da fe 	lea    rsi,[rip+0xfffffffffeda805a]        # 381a66 <_ZTSSt12bad_any_cast@@Base-0xe762>
     15d9a0c:	89 ea                	mov    edx,ebp
     15d9a0e:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     15d9a13:	31 c0                	xor    eax,eax
     15d9a15:	e8 80 22 20 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15d9a1a:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     15d9a1e:	48 89 de             	mov    rsi,rbx
     15d9a21:	e8 08 20 4a ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     15d9a26:	48 89 df             	mov    rdi,rbx
     15d9a29:	e8 62 44 21 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15d9a2e:	6a 01                	push   0x1
     15d9a30:	5b                   	pop    rbx
     15d9a31:	e9 b4 02 00 00       	jmp    15d9cea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f26e>
     15d9a36:	49 83 c4 fe          	add    r12,0xfffffffffffffffe
     15d9a3a:	48 8d 4b 30          	lea    rcx,[rbx+0x30]
     15d9a3e:	48 8d 05 44 3a d5 fe 	lea    rax,[rip+0xfffffffffed53a44]        # 32d489 <_ZTSSt12bad_any_cast@@Base-0x62d3f>
     15d9a45:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     15d9a4a:	48 c7 44 24 48 01 00 	mov    QWORD PTR [rsp+0x48],0x1
     15d9a51:	00 00 
     15d9a53:	4c 89 e0             	mov    rax,r12
     15d9a56:	48 83 e8 01          	sub    rax,0x1
     15d9a5a:	be 00 00 00 00       	mov    esi,0x0
     15d9a5f:	48 0f 43 f0          	cmovae rsi,rax
     15d9a63:	4d 85 e4             	test   r12,r12
     15d9a66:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx

### caller/xfer 0x15d9d61; FDE=(22911015, 22912492)
     15d9d35:	48 83 3c 24 00       	cmp    QWORD PTR [rsp],0x0
     15d9d3a:	74 a6                	je     15d9ce2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f266>
     15d9d3c:	41 f6 45 18 01       	test   BYTE PTR [r13+0x18],0x1
     15d9d41:	74 06                	je     15d9d49 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f2cd>
     15d9d43:	4d 8b 6d 28          	mov    r13,QWORD PTR [r13+0x28]
     15d9d47:	eb 04                	jmp    15d9d4d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f2d1>
     15d9d49:	49 83 c5 19          	add    r13,0x19
     15d9d4d:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
     15d9d52:	48 89 df             	mov    rdi,rbx
     15d9d55:	48 8d 35 98 b3 d9 fe 	lea    rsi,[rip+0xfffffffffed9b398]        # 3750f4 <_ZTSSt12bad_any_cast@@Base-0x1b0d4>
     15d9d5c:	4c 89 ea             	mov    rdx,r13
     15d9d5f:	31 c0                	xor    eax,eax
     15d9d61:	e8 34 1f 20 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15d9d66:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     15d9d6a:	48 89 de             	mov    rsi,rbx
     15d9d6d:	e8 bc 1c 4a ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     15d9d72:	48 89 df             	mov    rdi,rbx
     15d9d75:	e8 16 41 21 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15d9d7a:	6a 01                	push   0x1
     15d9d7c:	5b                   	pop    rbx
     15d9d7d:	4c 8d a4 24 d8 00 00 	lea    r12,[rsp+0xd8]
     15d9d84:	00 
     15d9d85:	e9 58 ff ff ff       	jmp    15d9ce2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f266>
     15d9d8a:	48 89 c3             	mov    rbx,rax
     15d9d8d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     15d9d92:	e8 35 4a 4c ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     15d9d97:	eb 03                	jmp    15d9d9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f320>
     15d9d99:	48 89 c3             	mov    rbx,rax
     15d9d9c:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     15d9da3:	00 
     15d9da4:	eb 08                	jmp    15d9dae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f332>
     15d9da6:	48 89 c3             	mov    rbx,rax
     15d9da9:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]

### caller/xfer 0x15da12e; FDE=(22912866, 22913939)
     15da101:	48 8b 54 24 38       	mov    rdx,QWORD PTR [rsp+0x38]
     15da106:	4c 89 e7             	mov    rdi,r12
     15da109:	48 8d 35 73 a0 d7 fe 	lea    rsi,[rip+0xfffffffffed7a073]        # 354183 <_ZTSSt12bad_any_cast@@Base-0x3c045>
     15da110:	eb 65                	jmp    15da177 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f6fb>
     15da112:	6a 01                	push   0x1
     15da114:	41 5f                	pop    r15
     15da116:	48 85 db             	test   rbx,rbx
     15da119:	0f 84 ab 01 00 00    	je     15da2ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f84e>
     15da11f:	4c 89 e7             	mov    rdi,r12
     15da122:	48 8d 35 d5 05 d8 fe 	lea    rsi,[rip+0xfffffffffed805d5]        # 35a6fe <_ZTSSt12bad_any_cast@@Base-0x35aca>
     15da129:	48 89 ea             	mov    rdx,rbp
     15da12c:	31 c0                	xor    eax,eax
     15da12e:	e8 67 1b 20 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15da133:	48 89 df             	mov    rdi,rbx
     15da136:	4c 89 e6             	mov    rsi,r12
     15da139:	e8 f0 18 4a ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     15da13e:	4c 89 e7             	mov    rdi,r12
     15da141:	e8 4a 3d 21 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15da146:	6a 01                	push   0x1
     15da148:	41 5f                	pop    r15
     15da14a:	e9 7b 01 00 00       	jmp    15da2ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f84e>
     15da14f:	6a 01                	push   0x1
     15da151:	41 5f                	pop    r15
     15da153:	48 85 db             	test   rbx,rbx
     15da156:	0f 84 64 01 00 00    	je     15da2c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f844>
     15da15c:	f6 44 24 28 01       	test   BYTE PTR [rsp+0x28],0x1
     15da161:	48 8d 54 24 29       	lea    rdx,[rsp+0x29]
     15da166:	74 05                	je     15da16d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f6f1>
     15da168:	48 8b 54 24 38       	mov    rdx,QWORD PTR [rsp+0x38]
     15da16d:	4c 89 e7             	mov    rdi,r12
     15da170:	48 8d 35 a3 d3 d7 fe 	lea    rsi,[rip+0xfffffffffed7d3a3]        # 35751a <_ZTSSt12bad_any_cast@@Base-0x38cae>
     15da177:	31 c0                	xor    eax,eax
     15da179:	e8 1c 1b 20 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>

### caller/xfer 0x15da179; FDE=(22912866, 22913939)
     15da14a:	e9 7b 01 00 00       	jmp    15da2ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f84e>
     15da14f:	6a 01                	push   0x1
     15da151:	41 5f                	pop    r15
     15da153:	48 85 db             	test   rbx,rbx
     15da156:	0f 84 64 01 00 00    	je     15da2c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f844>
     15da15c:	f6 44 24 28 01       	test   BYTE PTR [rsp+0x28],0x1
     15da161:	48 8d 54 24 29       	lea    rdx,[rsp+0x29]
     15da166:	74 05                	je     15da16d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f6f1>
     15da168:	48 8b 54 24 38       	mov    rdx,QWORD PTR [rsp+0x38]
     15da16d:	4c 89 e7             	mov    rdi,r12
     15da170:	48 8d 35 a3 d3 d7 fe 	lea    rsi,[rip+0xfffffffffed7d3a3]        # 35751a <_ZTSSt12bad_any_cast@@Base-0x38cae>
     15da177:	31 c0                	xor    eax,eax
     15da179:	e8 1c 1b 20 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15da17e:	48 89 df             	mov    rdi,rbx
     15da181:	4c 89 e6             	mov    rsi,r12
     15da184:	e8 a5 18 4a ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     15da189:	4c 89 e7             	mov    rdi,r12
     15da18c:	e8 ff 3c 21 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15da191:	6a 01                	push   0x1
     15da193:	41 5f                	pop    r15
     15da195:	e9 26 01 00 00       	jmp    15da2c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f844>
     15da19a:	b0 01                	mov    al,0x1
     15da19c:	48 83 f9 30          	cmp    rcx,0x30
     15da1a0:	75 3f                	jne    15da1e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f765>
     15da1a2:	4c 8d 7d 18          	lea    r15,[rbp+0x18]
     15da1a6:	4c 89 ff             	mov    rdi,r15
     15da1a9:	48 8d 35 97 fb d5 fe 	lea    rsi,[rip+0xfffffffffed5fb97]        # 339d47 <_ZTSSt12bad_any_cast@@Base-0x56481>
     15da1b0:	e8 9a 16 4a ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     15da1b5:	84 c0                	test   al,al
     15da1b7:	75 17                	jne    15da1d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f754>
     15da1b9:	4c 89 ff             	mov    rdi,r15
     15da1bc:	48 8d 35 38 14 d9 fe 	lea    rsi,[rip+0xfffffffffed91438]        # 36b5fb <_ZTSSt12bad_any_cast@@Base-0x24bcd>
     15da1c3:	e8 87 16 4a ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>

### caller/xfer 0x15da3b2; FDE=(22913954, 22913975)
     15da38e:	e8 1d 57 21 00       	call   17efab0 <__stack_chk_fail@plt>
     15da393:	8a 47 18             	mov    al,BYTE PTR [rdi+0x18]
     15da396:	3a 46 18             	cmp    al,BYTE PTR [rsi+0x18]
     15da399:	0f 84 4f 53 4c ff    	je     a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     15da39f:	31 c0                	xor    eax,eax
     15da3a1:	c3                   	ret
     15da3a2:	f6 02 01             	test   BYTE PTR [rdx],0x1
     15da3a5:	74 06                	je     15da3ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f931>
     15da3a7:	48 8b 52 10          	mov    rdx,QWORD PTR [rdx+0x10]
     15da3ab:	eb 03                	jmp    15da3b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f934>
     15da3ad:	48 ff c2             	inc    rdx
     15da3b0:	31 c0                	xor    eax,eax
     15da3b2:	e9 e3 18 20 00       	jmp    17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15da3b7:	f6 02 01             	test   BYTE PTR [rdx],0x1
     15da3ba:	74 06                	je     15da3c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f946>
     15da3bc:	48 8b 52 10          	mov    rdx,QWORD PTR [rdx+0x10]
     15da3c0:	eb 03                	jmp    15da3c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f949>
     15da3c2:	48 ff c2             	inc    rdx
     15da3c5:	f6 01 01             	test   BYTE PTR [rcx],0x1
     15da3c8:	74 06                	je     15da3d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f954>
     15da3ca:	48 8b 49 10          	mov    rcx,QWORD PTR [rcx+0x10]
     15da3ce:	eb 03                	jmp    15da3d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f957>
     15da3d0:	48 ff c1             	inc    rcx
     15da3d3:	31 c0                	xor    eax,eax
     15da3d5:	e9 c0 18 20 00       	jmp    17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15da3da:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
     15da3de:	74 01                	je     15da3e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f965>
     15da3e0:	c3                   	ret
     15da3e1:	41 56                	push   r14
     15da3e3:	53                   	push   rbx
     15da3e4:	50                   	push   rax
     15da3e5:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     15da3e9:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]

### caller/xfer 0x15da3d5; FDE=(22913975, 22914010)
     15da3b2:	e9 e3 18 20 00       	jmp    17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15da3b7:	f6 02 01             	test   BYTE PTR [rdx],0x1
     15da3ba:	74 06                	je     15da3c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f946>
     15da3bc:	48 8b 52 10          	mov    rdx,QWORD PTR [rdx+0x10]
     15da3c0:	eb 03                	jmp    15da3c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f949>
     15da3c2:	48 ff c2             	inc    rdx
     15da3c5:	f6 01 01             	test   BYTE PTR [rcx],0x1
     15da3c8:	74 06                	je     15da3d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f954>
     15da3ca:	48 8b 49 10          	mov    rcx,QWORD PTR [rcx+0x10]
     15da3ce:	eb 03                	jmp    15da3d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f957>
     15da3d0:	48 ff c1             	inc    rcx
     15da3d3:	31 c0                	xor    eax,eax
     15da3d5:	e9 c0 18 20 00       	jmp    17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15da3da:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
     15da3de:	74 01                	je     15da3e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f965>
     15da3e0:	c3                   	ret
     15da3e1:	41 56                	push   r14
     15da3e3:	53                   	push   rbx
     15da3e4:	50                   	push   rax
     15da3e5:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     15da3e9:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     15da3ed:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
     15da3f0:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     15da3f3:	4c 39 f3             	cmp    rbx,r14
     15da3f6:	74 0e                	je     15da406 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f98a>
     15da3f8:	48 83 c3 d8          	add    rbx,0xffffffffffffffd8
     15da3fc:	48 89 df             	mov    rdi,rbx
     15da3ff:	e8 8c 3a 21 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15da404:	eb ed                	jmp    15da3f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f977>
     15da406:	48 83 c4 08          	add    rsp,0x8
     15da40a:	5b                   	pop    rbx
     15da40b:	41 5e                	pop    r14
     15da40d:	c3                   	ret

### caller/xfer 0x15f8e33; FDE=(23039216, 23042847)
     15f8e01:	89 c5                	mov    ebp,eax
     15f8e03:	48 8d b3 80 01 00 00 	lea    rsi,[rbx+0x180]
     15f8e0a:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     15f8e0f:	e8 2c 51 1f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     15f8e14:	8b 93 b0 01 00 00    	mov    edx,DWORD PTR [rbx+0x1b0]
     15f8e1a:	83 fa 50             	cmp    edx,0x50
     15f8e1d:	74 33                	je     15f8e52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e3d6>
     15f8e1f:	48 8d 35 e4 b3 d5 fe 	lea    rsi,[rip+0xfffffffffed5b3e4]        # 35420a <_ZTSSt12bad_any_cast@@Base-0x3bfbe>
     15f8e26:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     15f8e2d:	00 
     15f8e2e:	4c 89 f7             	mov    rdi,r14
     15f8e31:	31 c0                	xor    eax,eax
     15f8e33:	e8 62 2e 1e 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15f8e38:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     15f8e3d:	4c 89 f6             	mov    rsi,r14
     15f8e40:	e8 f7 f4 4a ff       	call   aa833c <JNI_OnUnload@@Base+0x2fc09>
     15f8e45:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15f8e4c:	00 
     15f8e4d:	e8 3e 50 1f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15f8e52:	4c 8b 7b 28          	mov    r15,QWORD PTR [rbx+0x28]
     15f8e56:	4c 8d 73 40          	lea    r14,[rbx+0x40]
     15f8e5a:	48 8d 15 28 46 d3 fe 	lea    rdx,[rip+0xfffffffffed34628]        # 32d489 <_ZTSSt12bad_any_cast@@Base-0x62d3f>
     15f8e61:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15f8e68:	00 
     15f8e69:	4c 89 f6             	mov    rsi,r14
     15f8e6c:	e8 54 c9 4f ff       	call   af57c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x42765>
     15f8e71:	f6 84 24 a0 00 00 00 	test   BYTE PTR [rsp+0xa0],0x1
     15f8e78:	01 
     15f8e79:	0f 84 44 04 00 00    	je     15f92c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e847>
     15f8e7f:	48 8b b4 24 b0 00 00 	mov    rsi,QWORD PTR [rsp+0xb0]
     15f8e86:	00 
     15f8e87:	e9 3f 04 00 00       	jmp    15f92cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e84f>
     15f8e8c:	6a 0e                	push   0xe

### caller/xfer 0x15f9408; FDE=(23039216, 23042847)
     15f93df:	89 c8                	mov    eax,ecx
     15f93e1:	31 d2                	xor    edx,edx
     15f93e3:	f7 f6                	div    esi
     15f93e5:	3d 2d 01 00 00       	cmp    eax,0x12d
     15f93ea:	ba 2c 01 00 00       	mov    edx,0x12c
     15f93ef:	0f 43 d0             	cmovae edx,eax
     15f93f2:	85 c9                	test   ecx,ecx
     15f93f4:	0f 44 d1             	cmove  edx,ecx
     15f93f7:	48 8d 35 58 96 d7 fe 	lea    rsi,[rip+0xfffffffffed79658]        # 372a56 <_ZTSSt12bad_any_cast@@Base-0x1d772>
     15f93fe:	4c 8d 7c 24 78       	lea    r15,[rsp+0x78]
     15f9403:	4c 89 ff             	mov    rdi,r15
     15f9406:	31 c0                	xor    eax,eax
     15f9408:	e8 8d 28 1e 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15f940d:	48 8d 35 9c 15 e4 fe 	lea    rsi,[rip+0xfffffffffee4159c]        # 43a9b0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5bc>
     15f9414:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15f941b:	00 
     15f941c:	4c 89 fa             	mov    rdx,r15
     15f941f:	e8 70 24 00 00       	call   15fb894 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x440e18>
     15f9424:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     15f9429:	e8 62 4a 1f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15f942e:	6a 40                	push   0x40
     15f9430:	5f                   	pop    rdi
     15f9431:	e8 ca 4a 1f 00       	call   17edf00 <_Znwm@plt>
     15f9436:	49 89 c7             	mov    r15,rax
     15f9439:	4c 8d ac 24 b0 00 00 	lea    r13,[rsp+0xb0]
     15f9440:	00 
     15f9441:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     15f9446:	4c 89 ac 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r13
     15f944d:	00 
     15f944e:	c6 84 24 88 00 00 00 	mov    BYTE PTR [rsp+0x88],0x0
     15f9455:	00 
     15f9456:	4c 8d 60 10          	lea    r12,[rax+0x10]
     15f945a:	0f 57 c0             	xorps  xmm0,xmm0

### caller/xfer 0x15f9803; FDE=(23039216, 23042847)
     15f97c6:	c7 43 30 08 00 00 00 	mov    DWORD PTR [rbx+0x30],0x8
     15f97cd:	e9 2b f7 ff ff       	jmp    15f8efd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e481>
     15f97d2:	48 8d 93 e1 03 00 00 	lea    rdx,[rbx+0x3e1]
     15f97d9:	f6 83 f8 03 00 00 01 	test   BYTE PTR [rbx+0x3f8],0x1
     15f97e0:	74 09                	je     15f97eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43ed6f>
     15f97e2:	48 8b 8b 08 04 00 00 	mov    rcx,QWORD PTR [rbx+0x408]
     15f97e9:	eb 07                	jmp    15f97f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43ed76>
     15f97eb:	48 8d 8b f9 03 00 00 	lea    rcx,[rbx+0x3f9]
     15f97f2:	48 8d 35 da 1f d8 fe 	lea    rsi,[rip+0xfffffffffed81fda]        # 37b7d3 <_ZTSSt12bad_any_cast@@Base-0x149f5>
     15f97f9:	4c 8d 7c 24 78       	lea    r15,[rsp+0x78]
     15f97fe:	4c 89 ff             	mov    rdi,r15
     15f9801:	31 c0                	xor    eax,eax
     15f9803:	e8 92 24 1e 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15f9808:	41 0f b6 07          	movzx  eax,BYTE PTR [r15]
     15f980c:	89 c2                	mov    edx,eax
     15f980e:	d1 ea                	shr    edx,1
     15f9810:	a8 01                	test   al,0x1
     15f9812:	48 8d 44 24 79       	lea    rax,[rsp+0x79]
     15f9817:	48 8b 70 0f          	mov    rsi,QWORD PTR [rax+0xf]
     15f981b:	48 0f 45 50 07       	cmovne rdx,QWORD PTR [rax+0x7]
     15f9820:	48 0f 44 f0          	cmove  rsi,rax
     15f9824:	0f 57 c0             	xorps  xmm0,xmm0
     15f9827:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     15f982c:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     15f982f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     15f9834:	31 c9                	xor    ecx,ecx
     15f9836:	e8 e0 1c 1e 00       	call   17db51b <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x733c>
     15f983b:	f6 44 24 30 01       	test   BYTE PTR [rsp+0x30],0x1
     15f9840:	74 07                	je     15f9849 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43edcd>
     15f9842:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
     15f9847:	eb 05                	jmp    15f984e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43edd2>
     15f9849:	48 8d 54 24 31       	lea    rdx,[rsp+0x31]
     15f984e:	48 8d 35 30 4c d5 fe 	lea    rsi,[rip+0xfffffffffed54c30]        # 34e485 <_ZTSSt12bad_any_cast@@Base-0x41d43>

### caller/xfer 0x15f985f; FDE=(23039216, 23042847)
     15f982f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     15f9834:	31 c9                	xor    ecx,ecx
     15f9836:	e8 e0 1c 1e 00       	call   17db51b <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x733c>
     15f983b:	f6 44 24 30 01       	test   BYTE PTR [rsp+0x30],0x1
     15f9840:	74 07                	je     15f9849 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43edcd>
     15f9842:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
     15f9847:	eb 05                	jmp    15f984e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43edd2>
     15f9849:	48 8d 54 24 31       	lea    rdx,[rsp+0x31]
     15f984e:	48 8d 35 30 4c d5 fe 	lea    rsi,[rip+0xfffffffffed54c30]        # 34e485 <_ZTSSt12bad_any_cast@@Base-0x41d43>
     15f9855:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
     15f985a:	4c 89 ff             	mov    rdi,r15
     15f985d:	31 c0                	xor    eax,eax
     15f985f:	e8 36 24 1e 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     15f9864:	48 8d 35 65 11 e4 fe 	lea    rsi,[rip+0xfffffffffee41165]        # 43a9d0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5dc>
     15f986b:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15f9872:	00 
     15f9873:	4c 89 fa             	mov    rdx,r15
     15f9876:	e8 19 20 00 00       	call   15fb894 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x440e18>
     15f987b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     15f9880:	e8 0b 46 1f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15f9885:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     15f988a:	e8 01 46 1f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15f988f:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     15f9894:	e8 f7 45 1f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15f9899:	48 8d 35 80 11 e4 fe 	lea    rsi,[rip+0xfffffffffee41180]        # 43aa20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x62c>
     15f98a0:	4c 89 f7             	mov    rdi,r14
     15f98a3:	e8 46 5e 4a ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     15f98a8:	84 c0                	test   al,al
     15f98aa:	74 45                	je     15f98f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43ee75>
     15f98ac:	0f b6 b3 98 00 00 00 	movzx  esi,BYTE PTR [rbx+0x98]
     15f98b3:	40 f6 c6 01          	test   sil,0x1
     15f98b7:	74 09                	je     15f98c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43ee46>
     15f98b9:	48 8b b3 a0 00 00 00 	mov    rsi,QWORD PTR [rbx+0xa0]

### caller/xfer 0x160d976; FDE=(23124231, 23124384)
     160d94b:	89 df                	mov    edi,ebx
     160d94d:	e8 1e 07 1e 00       	call   17ee070 <strerror@plt>
     160d952:	48 89 c6             	mov    rsi,rax
     160d955:	49 89 e7             	mov    r15,rsp
     160d958:	ba 00 01 00 00       	mov    edx,0x100
     160d95d:	4c 89 ff             	mov    rdi,r15
     160d960:	e8 bb 1c 1e 00       	call   17ef620 <strlcpy@plt>
     160d965:	48 8d 35 f3 fe d2 fe 	lea    rsi,[rip+0xfffffffffed2fef3]        # 33d85f <_ZTSSt12bad_any_cast@@Base-0x52969>
     160d96c:	4c 89 f7             	mov    rdi,r14
     160d96f:	4c 89 fa             	mov    rdx,r15
     160d972:	89 d9                	mov    ecx,ebx
     160d974:	31 c0                	xor    eax,eax
     160d976:	e8 1f e3 1c 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     160d97b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     160d982:	00 00 
     160d984:	48 3b 84 24 08 01 00 	cmp    rax,QWORD PTR [rsp+0x108]
     160d98b:	00 
     160d98c:	75 0d                	jne    160d99b <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b09>
     160d98e:	48 81 c4 10 01 00 00 	add    rsp,0x110
     160d995:	5b                   	pop    rbx
     160d996:	41 5e                	pop    r14
     160d998:	41 5f                	pop    r15
     160d99a:	c3                   	ret
     160d99b:	e8 10 21 1e 00       	call   17efab0 <__stack_chk_fail@plt>
     160d9a0:	83 ff ff             	cmp    edi,0xffffffff
     160d9a3:	74 08                	je     160d9ad <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b1b>
     160d9a5:	6a 01                	push   0x1
     160d9a7:	5e                   	pop    rsi
     160d9a8:	e9 13 17 1e 00       	jmp    17ef0c0 <shutdown@plt>
     160d9ad:	c3                   	ret
     160d9ae:	80 7f 20 00          	cmp    BYTE PTR [rdi+0x20],0x0
     160d9b2:	74 01                	je     160d9b5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b23>
     160d9b4:	c3                   	ret

### caller/xfer 0x160e03d; FDE=(23125518, 23126406)
     160e00b:	eb 07                	jmp    160e014 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9182>
     160e00d:	49 8d 96 b1 00 00 00 	lea    rdx,[r14+0xb1]
     160e014:	41 f6 86 c8 00 00 00 	test   BYTE PTR [r14+0xc8],0x1
     160e01b:	01 
     160e01c:	74 09                	je     160e027 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9195>
     160e01e:	49 8b 8e d8 00 00 00 	mov    rcx,QWORD PTR [r14+0xd8]
     160e025:	eb 07                	jmp    160e02e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x919c>
     160e027:	49 8d 8e c9 00 00 00 	lea    rcx,[r14+0xc9]
     160e02e:	48 8d 35 9e d7 d6 fe 	lea    rsi,[rip+0xfffffffffed6d79e]        # 37b7d3 <_ZTSSt12bad_any_cast@@Base-0x149f5>
     160e035:	49 89 e7             	mov    r15,rsp
     160e038:	4c 89 ff             	mov    rdi,r15
     160e03b:	31 c0                	xor    eax,eax
     160e03d:	e8 58 dc 1c 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     160e042:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     160e047:	4c 89 fe             	mov    rsi,r15
     160e04a:	e8 ed a2 49 ff       	call   aa833c <JNI_OnUnload@@Base+0x2fc09>
     160e04f:	49 89 e7             	mov    r15,rsp
     160e052:	4c 89 ff             	mov    rdi,r15
     160e055:	e8 36 fe 1d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     160e05a:	48 8d 44 24 21       	lea    rax,[rsp+0x21]
     160e05f:	0f b6 48 ff          	movzx  ecx,BYTE PTR [rax-0x1]
     160e063:	89 ca                	mov    edx,ecx
     160e065:	d1 ea                	shr    edx,1
     160e067:	f6 c1 01             	test   cl,0x1
     160e06a:	48 8b 70 0f          	mov    rsi,QWORD PTR [rax+0xf]
     160e06e:	48 0f 44 f0          	cmove  rsi,rax
     160e072:	48 0f 45 50 07       	cmovne rdx,QWORD PTR [rax+0x7]
     160e077:	0f 57 c0             	xorps  xmm0,xmm0
     160e07a:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     160e07e:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     160e083:	48 89 e7             	mov    rdi,rsp
     160e086:	31 c9                	xor    ecx,ecx
     160e088:	e8 8e d4 1c 00       	call   17db51b <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x733c>

### caller/xfer 0x160fc5e; FDE=(23133223, 23133309)
     160fc39:	74 06                	je     160fc41 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xadaf>
     160fc3b:	48 8b 52 10          	mov    rdx,QWORD PTR [rdx+0x10]
     160fc3f:	eb 03                	jmp    160fc44 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xadb2>
     160fc41:	48 ff c2             	inc    rdx
     160fc44:	48 83 ec 08          	sub    rsp,0x8
     160fc48:	4d 85 db             	test   r11,r11
     160fc4b:	74 1c                	je     160fc69 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xadd7>
     160fc4d:	48 8d 35 41 8a d6 fe 	lea    rsi,[rip+0xfffffffffed68a41]        # 378695 <_ZTSSt12bad_any_cast@@Base-0x17b33>
     160fc54:	31 c0                	xor    eax,eax
     160fc56:	ff 74 24 18          	push   QWORD PTR [rsp+0x18]
     160fc5a:	41 53                	push   r11
     160fc5c:	41 52                	push   r10
     160fc5e:	e8 37 c0 1c 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     160fc63:	48 83 c4 20          	add    rsp,0x20
     160fc67:	eb 12                	jmp    160fc7b <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xade9>
     160fc69:	48 8d 35 34 e8 d3 fe 	lea    rsi,[rip+0xfffffffffed3e834]        # 34e4a4 <_ZTSSt12bad_any_cast@@Base-0x41d24>
     160fc70:	31 c0                	xor    eax,eax
     160fc72:	41 52                	push   r10
     160fc74:	e8 21 c0 1c 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     160fc79:	58                   	pop    rax
     160fc7a:	59                   	pop    rcx
     160fc7b:	58                   	pop    rax
     160fc7c:	c3                   	ret
     160fc7d:	cc                   	int3
     160fc7e:	80 7f 60 00          	cmp    BYTE PTR [rdi+0x60],0x0
     160fc82:	0f 85 f0 f2 ff ff    	jne    160ef78 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa0e6>
     160fc88:	c3                   	ret
     160fc89:	cc                   	int3
     160fc8a:	53                   	push   rbx
     160fc8b:	48 89 fb             	mov    rbx,rdi
     160fc8e:	48 8b bf 88 00 00 00 	mov    rdi,QWORD PTR [rdi+0x88]
     160fc95:	e8 ec e7 48 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     160fc9a:	48 8d 7b 60          	lea    rdi,[rbx+0x60]

### caller/xfer 0x160fc74; FDE=(23133223, 23133309)
     160fc4b:	74 1c                	je     160fc69 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xadd7>
     160fc4d:	48 8d 35 41 8a d6 fe 	lea    rsi,[rip+0xfffffffffed68a41]        # 378695 <_ZTSSt12bad_any_cast@@Base-0x17b33>
     160fc54:	31 c0                	xor    eax,eax
     160fc56:	ff 74 24 18          	push   QWORD PTR [rsp+0x18]
     160fc5a:	41 53                	push   r11
     160fc5c:	41 52                	push   r10
     160fc5e:	e8 37 c0 1c 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     160fc63:	48 83 c4 20          	add    rsp,0x20
     160fc67:	eb 12                	jmp    160fc7b <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xade9>
     160fc69:	48 8d 35 34 e8 d3 fe 	lea    rsi,[rip+0xfffffffffed3e834]        # 34e4a4 <_ZTSSt12bad_any_cast@@Base-0x41d24>
     160fc70:	31 c0                	xor    eax,eax
     160fc72:	41 52                	push   r10
     160fc74:	e8 21 c0 1c 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     160fc79:	58                   	pop    rax
     160fc7a:	59                   	pop    rcx
     160fc7b:	58                   	pop    rax
     160fc7c:	c3                   	ret
     160fc7d:	cc                   	int3
     160fc7e:	80 7f 60 00          	cmp    BYTE PTR [rdi+0x60],0x0
     160fc82:	0f 85 f0 f2 ff ff    	jne    160ef78 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa0e6>
     160fc88:	c3                   	ret
     160fc89:	cc                   	int3
     160fc8a:	53                   	push   rbx
     160fc8b:	48 89 fb             	mov    rbx,rdi
     160fc8e:	48 8b bf 88 00 00 00 	mov    rdi,QWORD PTR [rdi+0x88]
     160fc95:	e8 ec e7 48 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     160fc9a:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     160fc9e:	e8 8d 70 49 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     160fca3:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     160fca7:	e8 be a2 46 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     160fcac:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     160fcb0:	e8 d1 e7 48 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     160fcb5:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]

### caller/xfer 0x1610d2e; FDE=(23136822, 23139490)
     1610cff:	4c 89 e7             	mov    rdi,r12
     1610d02:	4c 89 ee             	mov    rsi,r13
     1610d05:	e8 40 51 4a ff       	call   ab5e4a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dea>
     1610d0a:	49 89 d0             	mov    r8,rdx
     1610d0d:	f6 44 24 50 01       	test   BYTE PTR [rsp+0x50],0x1
     1610d12:	74 21                	je     1610d35 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbea3>
     1610d14:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]
     1610d19:	eb 1f                	jmp    1610d3a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbea8>
     1610d1b:	48 8d 54 24 51       	lea    rdx,[rsp+0x51]
     1610d20:	48 8d 35 0a 3a d3 fe 	lea    rsi,[rip+0xfffffffffed33a0a]        # 344731 <_ZTSSt12bad_any_cast@@Base-0x4ba97>
     1610d27:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1610d2c:	31 c0                	xor    eax,eax
     1610d2e:	e8 67 af 1c 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1610d33:	eb 2a                	jmp    1610d5f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbecd>
     1610d35:	48 8d 54 24 51       	lea    rdx,[rsp+0x51]
     1610d3a:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
     1610d3d:	45 8b 57 10          	mov    r10d,DWORD PTR [r15+0x10]
     1610d41:	48 83 ec 08          	sub    rsp,0x8
     1610d45:	48 8d 35 5e 3a d5 fe 	lea    rsi,[rip+0xfffffffffed53a5e]        # 3647aa <_ZTSSt12bad_any_cast@@Base-0x2ba1e>
     1610d4c:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1610d51:	49 89 c1             	mov    r9,rax
     1610d54:	31 c0                	xor    eax,eax
     1610d56:	41 52                	push   r10
     1610d58:	e8 3d af 1c 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1610d5d:	58                   	pop    rax
     1610d5e:	59                   	pop    rcx
     1610d5f:	6a 28                	push   0x28
     1610d61:	5f                   	pop    rdi
     1610d62:	e8 99 d1 1d 00       	call   17edf00 <_Znwm@plt>
     1610d67:	49 89 c4             	mov    r12,rax
     1610d6a:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     1610d6f:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     1610d76:	00 

### caller/xfer 0x1610d58; FDE=(23136822, 23139490)
     1610d2c:	31 c0                	xor    eax,eax
     1610d2e:	e8 67 af 1c 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1610d33:	eb 2a                	jmp    1610d5f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbecd>
     1610d35:	48 8d 54 24 51       	lea    rdx,[rsp+0x51]
     1610d3a:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
     1610d3d:	45 8b 57 10          	mov    r10d,DWORD PTR [r15+0x10]
     1610d41:	48 83 ec 08          	sub    rsp,0x8
     1610d45:	48 8d 35 5e 3a d5 fe 	lea    rsi,[rip+0xfffffffffed53a5e]        # 3647aa <_ZTSSt12bad_any_cast@@Base-0x2ba1e>
     1610d4c:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1610d51:	49 89 c1             	mov    r9,rax
     1610d54:	31 c0                	xor    eax,eax
     1610d56:	41 52                	push   r10
     1610d58:	e8 3d af 1c 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1610d5d:	58                   	pop    rax
     1610d5e:	59                   	pop    rcx
     1610d5f:	6a 28                	push   0x28
     1610d61:	5f                   	pop    rdi
     1610d62:	e8 99 d1 1d 00       	call   17edf00 <_Znwm@plt>
     1610d67:	49 89 c4             	mov    r12,rax
     1610d6a:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     1610d6f:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     1610d76:	00 
     1610d77:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
     1610d7c:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     1610d83:	00 
     1610d84:	0f 57 c9             	xorps  xmm1,xmm1
     1610d87:	0f 29 4c 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm1
     1610d8c:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
     1610d92:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
     1610d97:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
     1610d9e:	00 00 
     1610da0:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     1610da5:	41 83 64 24 18 00    	and    DWORD PTR [r12+0x18],0x0

### caller/xfer 0x1660a08; FDE=(23464398, 23464651)
     16609d8:	48 89 fb             	mov    rbx,rdi
     16609db:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     16609e2:	00 00 
     16609e4:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     16609e9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     16609ec:	48 89 f7             	mov    rdi,rsi
     16609ef:	ff 50 48             	call   QWORD PTR [rax+0x48]
     16609f2:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     16609f5:	48 8d 35 2d 96 cd fe 	lea    rsi,[rip+0xfffffffffecd962d]        # 33a029 <_ZTSSt12bad_any_cast@@Base-0x5619f>
     16609fc:	48 8d 15 1a 5c cc fe 	lea    rdx,[rip+0xfffffffffecc5c1a]        # 32661d <_ZTSSt12bad_any_cast@@Base-0x69bab>
     1660a03:	48 89 df             	mov    rdi,rbx
     1660a06:	31 c0                	xor    eax,eax
     1660a08:	e8 8d b2 17 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1660a0d:	48 8d 35 68 15 df fe 	lea    rsi,[rip+0xfffffffffedf1568]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1660a14:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1660a19:	e8 60 90 41 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1660a1e:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     1660a23:	48 89 df             	mov    rdi,rbx
     1660a26:	4c 89 f2             	mov    rdx,r14
     1660a29:	e8 9d 00 00 00       	call   1660acb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c37>
     1660a2e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1660a33:	e8 58 d4 18 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1660a38:	0f b6 03             	movzx  eax,BYTE PTR [rbx]
     1660a3b:	a8 01                	test   al,0x1
     1660a3d:	74 06                	je     1660a45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14bb1>
     1660a3f:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     1660a43:	eb 04                	jmp    1660a49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14bb5>
     1660a45:	89 c6                	mov    esi,eax
     1660a47:	d1 ee                	shr    esi,1
     1660a49:	48 83 fe 03          	cmp    rsi,0x3
     1660a4d:	72 2b                	jb     1660a7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14be6>
     1660a4f:	a8 01                	test   al,0x1
     1660a51:	74 06                	je     1660a59 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14bc5>

### caller/xfer 0x1660bf3; FDE=(23464651, 23465232)
     1660bc5:	75 65                	jne    1660c2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d98>
     1660bc7:	4f 8b 24 37          	mov    r12,QWORD PTR [r15+r14*1]
     1660bcb:	4d 85 e4             	test   r12,r12
     1660bce:	0f 84 d5 00 00 00    	je     1660ca9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e15>
     1660bd4:	f6 45 00 01          	test   BYTE PTR [rbp+0x0],0x1
     1660bd8:	48 8b 54 24 28       	mov    rdx,QWORD PTR [rsp+0x28]
     1660bdd:	74 04                	je     1660be3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d4f>
     1660bdf:	48 8b 55 10          	mov    rdx,QWORD PTR [rbp+0x10]
     1660be3:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
     1660be7:	48 89 df             	mov    rdi,rbx
     1660bea:	48 8d 35 15 10 d2 fe 	lea    rsi,[rip+0xfffffffffed21015]        # 381c06 <_ZTSSt12bad_any_cast@@Base-0xe5c2>
     1660bf1:	31 c0                	xor    eax,eax
     1660bf3:	e8 a2 b0 17 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1660bf8:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1660bfd:	48 89 de             	mov    rsi,rbx
     1660c00:	4c 89 e2             	mov    rdx,r12
     1660c03:	e8 c3 fe ff ff       	call   1660acb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c37>
     1660c08:	8b 4c 24 0c          	mov    ecx,DWORD PTR [rsp+0xc]
     1660c0c:	80 e1 01             	and    cl,0x1
     1660c0f:	08 c1                	or     cl,al
     1660c11:	89 4c 24 0c          	mov    DWORD PTR [rsp+0xc],ecx
     1660c15:	48 89 df             	mov    rdi,rbx
     1660c18:	e8 73 d2 18 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1660c1d:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     1660c22:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     1660c27:	e9 82 00 00 00       	jmp    1660cae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e1a>
     1660c2c:	45 31 e4             	xor    r12d,r12d
     1660c2f:	47 3b 64 37 08       	cmp    r12d,DWORD PTR [r15+r14*1+0x8]
     1660c34:	74 67                	je     1660c9d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e09>
     1660c36:	f6 45 00 01          	test   BYTE PTR [rbp+0x0],0x1
     1660c3a:	48 8b 54 24 28       	mov    rdx,QWORD PTR [rsp+0x28]
     1660c3f:	74 04                	je     1660c45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14db1>
     1660c41:	48 8b 55 10          	mov    rdx,QWORD PTR [rbp+0x10]

### caller/xfer 0x1660c63; FDE=(23464651, 23465232)
     1660c36:	f6 45 00 01          	test   BYTE PTR [rbp+0x0],0x1
     1660c3a:	48 8b 54 24 28       	mov    rdx,QWORD PTR [rsp+0x28]
     1660c3f:	74 04                	je     1660c45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14db1>
     1660c41:	48 8b 55 10          	mov    rdx,QWORD PTR [rbp+0x10]
     1660c45:	49 89 ed             	mov    r13,rbp
     1660c48:	44 89 e5             	mov    ebp,r12d
     1660c4b:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
     1660c4f:	48 8d 5c 24 38       	lea    rbx,[rsp+0x38]
     1660c54:	48 89 df             	mov    rdi,rbx
     1660c57:	48 8d 35 ce 7b d2 fe 	lea    rsi,[rip+0xfffffffffed27bce]        # 38882c <_ZTSSt12bad_any_cast@@Base-0x799c>
     1660c5e:	45 89 e0             	mov    r8d,r12d
     1660c61:	31 c0                	xor    eax,eax
     1660c63:	e8 32 b0 17 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     1660c68:	4b 8b 04 37          	mov    rax,QWORD PTR [r15+r14*1]
     1660c6c:	48 8b 14 e8          	mov    rdx,QWORD PTR [rax+rbp*8]
     1660c70:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1660c75:	48 89 de             	mov    rsi,rbx
     1660c78:	e8 4e fe ff ff       	call   1660acb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c37>
     1660c7d:	89 c5                	mov    ebp,eax
     1660c7f:	48 89 df             	mov    rdi,rbx
     1660c82:	e8 09 d2 18 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1660c87:	41 ff c4             	inc    r12d
     1660c8a:	40 84 ed             	test   bpl,bpl
     1660c8d:	4c 89 ed             	mov    rbp,r13
     1660c90:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     1660c95:	74 98                	je     1660c2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d9b>
     1660c97:	b0 01                	mov    al,0x1
     1660c99:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
     1660c9d:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     1660ca2:	48 8d 5c 24 38       	lea    rbx,[rsp+0x38]
     1660ca7:	eb 05                	jmp    1660cae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e1a>
     1660ca9:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     1660cae:	48 83 c7 28          	add    rdi,0x28

### caller/xfer 0x16665b3; FDE=(23487690, 23488259)
     1666587:	4c 89 e6             	mov    rsi,r12
     166658a:	e8 bb f8 44 ff       	call   ab5e4a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dea>
     166658f:	49 89 d0             	mov    r8,rdx
     1666592:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
     1666596:	74 22                	je     16665ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a726>
     1666598:	48 8b 53 40          	mov    rdx,QWORD PTR [rbx+0x40]
     166659c:	eb 23                	jmp    16665c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a72d>
     166659e:	48 89 da             	mov    rdx,rbx
     16665a1:	48 83 c2 31          	add    rdx,0x31
     16665a5:	48 8d 35 85 e1 cd fe 	lea    rsi,[rip+0xfffffffffecde185]        # 344731 <_ZTSSt12bad_any_cast@@Base-0x4ba97>
     16665ac:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     16665b1:	31 c0                	xor    eax,eax
     16665b3:	e8 e2 56 17 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     16665b8:	eb 27                	jmp    16665e1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a74d>
     16665ba:	48 89 da             	mov    rdx,rbx
     16665bd:	48 83 c2 31          	add    rdx,0x31
     16665c1:	48 8b 4b 48          	mov    rcx,QWORD PTR [rbx+0x48]
     16665c5:	8b 73 58             	mov    esi,DWORD PTR [rbx+0x58]
     16665c8:	89 34 24             	mov    DWORD PTR [rsp],esi
     16665cb:	48 8d 35 d8 e1 cf fe 	lea    rsi,[rip+0xfffffffffecfe1d8]        # 3647aa <_ZTSSt12bad_any_cast@@Base-0x2ba1e>
     16665d2:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     16665d7:	49 89 c1             	mov    r9,rax
     16665da:	31 c0                	xor    eax,eax
     16665dc:	e8 b9 56 17 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     16665e1:	80 7b 28 00          	cmp    BYTE PTR [rbx+0x28],0x0
     16665e5:	74 12                	je     16665f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a765>
     16665e7:	49 8b 06             	mov    rax,QWORD PTR [r14]
     16665ea:	48 85 c0             	test   rax,rax
     16665ed:	74 06                	je     16665f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a761>
     16665ef:	49 83 26 00          	and    QWORD PTR [r14],0x0
     16665f3:	ff d0                	call   rax
     16665f5:	c6 43 28 00          	mov    BYTE PTR [rbx+0x28],0x0
     16665f9:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]

### caller/xfer 0x16665dc; FDE=(23487690, 23488259)
     16665b1:	31 c0                	xor    eax,eax
     16665b3:	e8 e2 56 17 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     16665b8:	eb 27                	jmp    16665e1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a74d>
     16665ba:	48 89 da             	mov    rdx,rbx
     16665bd:	48 83 c2 31          	add    rdx,0x31
     16665c1:	48 8b 4b 48          	mov    rcx,QWORD PTR [rbx+0x48]
     16665c5:	8b 73 58             	mov    esi,DWORD PTR [rbx+0x58]
     16665c8:	89 34 24             	mov    DWORD PTR [rsp],esi
     16665cb:	48 8d 35 d8 e1 cf fe 	lea    rsi,[rip+0xfffffffffecfe1d8]        # 3647aa <_ZTSSt12bad_any_cast@@Base-0x2ba1e>
     16665d2:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     16665d7:	49 89 c1             	mov    r9,rax
     16665da:	31 c0                	xor    eax,eax
     16665dc:	e8 b9 56 17 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     16665e1:	80 7b 28 00          	cmp    BYTE PTR [rbx+0x28],0x0
     16665e5:	74 12                	je     16665f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a765>
     16665e7:	49 8b 06             	mov    rax,QWORD PTR [r14]
     16665ea:	48 85 c0             	test   rax,rax
     16665ed:	74 06                	je     16665f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a761>
     16665ef:	49 83 26 00          	and    QWORD PTR [r14],0x0
     16665f3:	ff d0                	call   rax
     16665f5:	c6 43 28 00          	mov    BYTE PTR [rbx+0x28],0x0
     16665f9:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     16665fe:	e8 33 52 41 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1666603:	49 89 c7             	mov    r15,rax
     1666606:	49 89 d4             	mov    r12,rdx
     1666609:	49 83 26 00          	and    QWORD PTR [r14],0x0
     166660d:	e8 fd 06 00 00       	call   1666d0f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ae7b>
     1666612:	84 c0                	test   al,al
     1666614:	74 46                	je     166665c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7c8>
     1666616:	48 83 3d 62 b8 24 00 	cmp    QWORD PTR [rip+0x24b862],0x0        # 18b1e80 <ATrace_beginSection@Base>
     166661d:	00 
     166661e:	74 32                	je     1666652 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7be>
     1666620:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]

### caller/xfer 0x16c9c38; FDE=(23894884, 23895300)
     16c9c0b:	4c 89 f7             	mov    rdi,r14
     16c9c0e:	31 c0                	xor    eax,eax
     16c9c10:	e8 fb 55 12 00       	call   17ef210 <sscanf@plt>
     16c9c15:	83 f8 03             	cmp    eax,0x3
     16c9c18:	75 25                	jne    16c9c3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7ddab>
     16c9c1a:	8b 54 24 14          	mov    edx,DWORD PTR [rsp+0x14]
     16c9c1e:	8b 4c 24 10          	mov    ecx,DWORD PTR [rsp+0x10]
     16c9c22:	44 8b 44 24 0c       	mov    r8d,DWORD PTR [rsp+0xc]
     16c9c27:	48 8d 35 bb 54 cb fe 	lea    rsi,[rip+0xfffffffffecb54bb]        # 37f0e9 <_ZTSSt12bad_any_cast@@Base-0x110df>
     16c9c2e:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     16c9c33:	4c 89 ff             	mov    rdi,r15
     16c9c36:	31 c0                	xor    eax,eax
     16c9c38:	e8 5d 20 11 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     16c9c3d:	eb 7b                	jmp    16c9cba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7de26>
     16c9c3f:	48 8d 35 c0 23 ca fe 	lea    rsi,[rip+0xfffffffffeca23c0]        # 36c006 <_ZTSSt12bad_any_cast@@Base-0x241c2>
     16c9c46:	48 8d 54 24 14       	lea    rdx,[rsp+0x14]
     16c9c4b:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     16c9c50:	4c 89 f7             	mov    rdi,r14
     16c9c53:	31 c0                	xor    eax,eax
     16c9c55:	e8 b6 55 12 00       	call   17ef210 <sscanf@plt>
     16c9c5a:	83 f8 02             	cmp    eax,0x2
     16c9c5d:	75 24                	jne    16c9c83 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7ddef>
     16c9c5f:	8b 54 24 14          	mov    edx,DWORD PTR [rsp+0x14]
     16c9c63:	8b 4c 24 10          	mov    ecx,DWORD PTR [rsp+0x10]
     16c9c67:	48 8d 35 98 23 ca fe 	lea    rsi,[rip+0xfffffffffeca2398]        # 36c006 <_ZTSSt12bad_any_cast@@Base-0x241c2>
     16c9c6e:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     16c9c73:	4c 89 ff             	mov    rdi,r15
     16c9c76:	31 c0                	xor    eax,eax
     16c9c78:	e8 1d 20 11 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     16c9c7d:	eb 3b                	jmp    16c9cba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7de26>
     16c9c7f:	31 ed                	xor    ebp,ebp
     16c9c81:	eb 56                	jmp    16c9cd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7de45>
     16c9c83:	48 8d 35 cc 8d ca fe 	lea    rsi,[rip+0xfffffffffeca8dcc]        # 372a56 <_ZTSSt12bad_any_cast@@Base-0x1d772>

### caller/xfer 0x16c9c78; FDE=(23894884, 23895300)
     16c9c4b:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     16c9c50:	4c 89 f7             	mov    rdi,r14
     16c9c53:	31 c0                	xor    eax,eax
     16c9c55:	e8 b6 55 12 00       	call   17ef210 <sscanf@plt>
     16c9c5a:	83 f8 02             	cmp    eax,0x2
     16c9c5d:	75 24                	jne    16c9c83 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7ddef>
     16c9c5f:	8b 54 24 14          	mov    edx,DWORD PTR [rsp+0x14]
     16c9c63:	8b 4c 24 10          	mov    ecx,DWORD PTR [rsp+0x10]
     16c9c67:	48 8d 35 98 23 ca fe 	lea    rsi,[rip+0xfffffffffeca2398]        # 36c006 <_ZTSSt12bad_any_cast@@Base-0x241c2>
     16c9c6e:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     16c9c73:	4c 89 ff             	mov    rdi,r15
     16c9c76:	31 c0                	xor    eax,eax
     16c9c78:	e8 1d 20 11 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     16c9c7d:	eb 3b                	jmp    16c9cba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7de26>
     16c9c7f:	31 ed                	xor    ebp,ebp
     16c9c81:	eb 56                	jmp    16c9cd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7de45>
     16c9c83:	48 8d 35 cc 8d ca fe 	lea    rsi,[rip+0xfffffffffeca8dcc]        # 372a56 <_ZTSSt12bad_any_cast@@Base-0x1d772>
     16c9c8a:	31 ed                	xor    ebp,ebp
     16c9c8c:	48 8d 54 24 14       	lea    rdx,[rsp+0x14]
     16c9c91:	4c 89 f7             	mov    rdi,r14
     16c9c94:	31 c0                	xor    eax,eax
     16c9c96:	e8 75 55 12 00       	call   17ef210 <sscanf@plt>
     16c9c9b:	83 f8 01             	cmp    eax,0x1
     16c9c9e:	75 2f                	jne    16c9ccf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7de3b>
     16c9ca0:	8b 54 24 14          	mov    edx,DWORD PTR [rsp+0x14]
     16c9ca4:	48 8d 35 ab 8d ca fe 	lea    rsi,[rip+0xfffffffffeca8dab]        # 372a56 <_ZTSSt12bad_any_cast@@Base-0x1d772>
     16c9cab:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     16c9cb0:	4c 89 ff             	mov    rdi,r15
     16c9cb3:	31 c0                	xor    eax,eax
     16c9cb5:	e8 e0 1f 11 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     16c9cba:	4c 89 ff             	mov    rdi,r15
     16c9cbd:	4c 89 f6             	mov    rsi,r14
     16c9cc0:	e8 8a 1b 3b ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>

### caller/xfer 0x16c9cb5; FDE=(23894884, 23895300)
     16c9c8a:	31 ed                	xor    ebp,ebp
     16c9c8c:	48 8d 54 24 14       	lea    rdx,[rsp+0x14]
     16c9c91:	4c 89 f7             	mov    rdi,r14
     16c9c94:	31 c0                	xor    eax,eax
     16c9c96:	e8 75 55 12 00       	call   17ef210 <sscanf@plt>
     16c9c9b:	83 f8 01             	cmp    eax,0x1
     16c9c9e:	75 2f                	jne    16c9ccf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7de3b>
     16c9ca0:	8b 54 24 14          	mov    edx,DWORD PTR [rsp+0x14]
     16c9ca4:	48 8d 35 ab 8d ca fe 	lea    rsi,[rip+0xfffffffffeca8dab]        # 372a56 <_ZTSSt12bad_any_cast@@Base-0x1d772>
     16c9cab:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     16c9cb0:	4c 89 ff             	mov    rdi,r15
     16c9cb3:	31 c0                	xor    eax,eax
     16c9cb5:	e8 e0 1f 11 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     16c9cba:	4c 89 ff             	mov    rdi,r15
     16c9cbd:	4c 89 f6             	mov    rsi,r14
     16c9cc0:	e8 8a 1b 3b ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     16c9cc5:	89 c5                	mov    ebp,eax
     16c9cc7:	4c 89 ff             	mov    rdi,r15
     16c9cca:	e8 c1 41 12 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     16c9ccf:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     16c9cd4:	e8 b7 41 12 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     16c9cd9:	49 39 dc             	cmp    r12,rbx
     16c9cdc:	0f 93 c0             	setae  al
     16c9cdf:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     16c9ce6:	00 00 
     16c9ce8:	48 3b 4c 24 48       	cmp    rcx,QWORD PTR [rsp+0x48]
     16c9ced:	75 10                	jne    16c9cff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7de6b>
     16c9cef:	40 08 e8             	or     al,bpl
     16c9cf2:	48 83 c4 50          	add    rsp,0x50
     16c9cf6:	5b                   	pop    rbx
     16c9cf7:	41 5c                	pop    r12
     16c9cf9:	41 5e                	pop    r14
     16c9cfb:	41 5f                	pop    r15

### caller/xfer 0x16cb9c1; FDE=(23897414, 23903933)
     16cb99a:	41 57                	push   r15
     16cb99c:	e8 2e 02 11 00       	call   17dbbcf <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x79f0>
     16cb9a1:	59                   	pop    rcx
     16cb9a2:	5a                   	pop    rdx
     16cb9a3:	e9 aa 02 00 00       	jmp    16cbc52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7fdbe>
     16cb9a8:	48 8d 4c 24 19       	lea    rcx,[rsp+0x19]
     16cb9ad:	48 8d 35 37 33 cb fe 	lea    rsi,[rip+0xfffffffffecb3337]        # 37eceb <_ZTSSt12bad_any_cast@@Base-0x114dd>
     16cb9b4:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
     16cb9b9:	6a 3a                	push   0x3a
     16cb9bb:	5a                   	pop    rdx
     16cb9bc:	4c 89 f7             	mov    rdi,r14
     16cb9bf:	31 c0                	xor    eax,eax
     16cb9c1:	e8 d4 02 11 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     16cb9c6:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     16cb9cb:	4c 89 f6             	mov    rsi,r14
     16cb9ce:	e8 5b 00 3b ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     16cb9d3:	4c 89 f7             	mov    rdi,r14
     16cb9d6:	e8 b5 24 12 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     16cb9db:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     16cb9e0:	e8 ab 24 12 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     16cb9e5:	f6 44 24 30 01       	test   BYTE PTR [rsp+0x30],0x1
     16cb9ea:	74 07                	je     16cb9f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7fb5f>
     16cb9ec:	4c 8b 44 24 40       	mov    r8,QWORD PTR [rsp+0x40]
     16cb9f1:	eb 05                	jmp    16cb9f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7fb64>
     16cb9f3:	4c 8d 44 24 31       	lea    r8,[rsp+0x31]
     16cb9f8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     16cb9fd:	48 8d 35 8e 02 cb fe 	lea    rsi,[rip+0xfffffffffecb028e]        # 37bc92 <_ZTSSt12bad_any_cast@@Base-0x14536>
     16cba04:	eb 11                	jmp    16cba17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7fb83>
     16cba06:	4c 8d 44 24 31       	lea    r8,[rsp+0x31]
     16cba0b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     16cba10:	48 8d 35 68 02 cb fe 	lea    rsi,[rip+0xfffffffffecb0268]        # 37bc7f <_ZTSSt12bad_any_cast@@Base-0x14549>
     16cba17:	6a 3a                	push   0x3a
     16cba19:	59                   	pop    rcx

### caller/xfer 0x17c4ae2; FDE=(24922756, 24922936)
     17c4ab8:	e8 85 ec ff ff       	call   17c3742 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1778ae>
     17c4abd:	48 89 df             	mov    rdi,rbx
     17c4ac0:	48 89 c6             	mov    rsi,rax
     17c4ac3:	e8 b6 4f 2b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     17c4ac8:	eb df                	jmp    17c4aa9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178c15>
     17c4aca:	0f 57 c0             	xorps  xmm0,xmm0
     17c4acd:	48 89 f7             	mov    rdi,rsi
     17c4ad0:	e8 6f f5 ff ff       	call   17c4044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1781b0>
     17c4ad5:	48 8d 35 c3 1d b6 fe 	lea    rsi,[rip+0xfffffffffeb61dc3]        # 32689f <_ZTSSt12bad_any_cast@@Base-0x69929>
     17c4adc:	48 89 df             	mov    rdi,rbx
     17c4adf:	b0 01                	mov    al,0x1
     17c4ae1:	5b                   	pop    rbx
     17c4ae2:	e9 b3 71 01 00       	jmp    17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     17c4ae7:	48 89 f7             	mov    rdi,rsi
     17c4aea:	31 f6                	xor    esi,esi
     17c4aec:	e8 ff f4 ff ff       	call   17c3ff0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17815c>
     17c4af1:	48 8d 35 73 74 ba fe 	lea    rsi,[rip+0xfffffffffeba7473]        # 36bf6b <_ZTSSt12bad_any_cast@@Base-0x2425d>
     17c4af8:	48 89 df             	mov    rdi,rbx
     17c4afb:	89 c2                	mov    edx,eax
     17c4afd:	31 c0                	xor    eax,eax
     17c4aff:	5b                   	pop    rbx
     17c4b00:	e9 95 71 01 00       	jmp    17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     17c4b05:	48 89 f7             	mov    rdi,rsi
     17c4b08:	31 f6                	xor    esi,esi
     17c4b0a:	e8 8f f5 ff ff       	call   17c409e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17820a>
     17c4b0f:	48 8d 0d 0a d1 c8 fe 	lea    rcx,[rip+0xfffffffffec8d10a]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     17c4b16:	48 8d 35 08 d1 c8 fe 	lea    rsi,[rip+0xfffffffffec8d108]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
     17c4b1d:	84 c0                	test   al,al
     17c4b1f:	48 0f 45 f1          	cmovne rsi,rcx
     17c4b23:	48 89 df             	mov    rdi,rbx
     17c4b26:	e8 53 4f 2b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     17c4b2b:	e9 79 ff ff ff       	jmp    17c4aa9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178c15>
     17c4b30:	48 89 c7             	mov    rdi,rax

### caller/xfer 0x17c4b00; FDE=(24922756, 24922936)
     17c4adc:	48 89 df             	mov    rdi,rbx
     17c4adf:	b0 01                	mov    al,0x1
     17c4ae1:	5b                   	pop    rbx
     17c4ae2:	e9 b3 71 01 00       	jmp    17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     17c4ae7:	48 89 f7             	mov    rdi,rsi
     17c4aea:	31 f6                	xor    esi,esi
     17c4aec:	e8 ff f4 ff ff       	call   17c3ff0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17815c>
     17c4af1:	48 8d 35 73 74 ba fe 	lea    rsi,[rip+0xfffffffffeba7473]        # 36bf6b <_ZTSSt12bad_any_cast@@Base-0x2425d>
     17c4af8:	48 89 df             	mov    rdi,rbx
     17c4afb:	89 c2                	mov    edx,eax
     17c4afd:	31 c0                	xor    eax,eax
     17c4aff:	5b                   	pop    rbx
     17c4b00:	e9 95 71 01 00       	jmp    17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     17c4b05:	48 89 f7             	mov    rdi,rsi
     17c4b08:	31 f6                	xor    esi,esi
     17c4b0a:	e8 8f f5 ff ff       	call   17c409e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17820a>
     17c4b0f:	48 8d 0d 0a d1 c8 fe 	lea    rcx,[rip+0xfffffffffec8d10a]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     17c4b16:	48 8d 35 08 d1 c8 fe 	lea    rsi,[rip+0xfffffffffec8d108]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
     17c4b1d:	84 c0                	test   al,al
     17c4b1f:	48 0f 45 f1          	cmovne rsi,rcx
     17c4b23:	48 89 df             	mov    rdi,rbx
     17c4b26:	e8 53 4f 2b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     17c4b2b:	e9 79 ff ff ff       	jmp    17c4aa9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178c15>
     17c4b30:	48 89 c7             	mov    rdi,rax
     17c4b33:	e8 6d 4f 2b ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     17c4b38:	50                   	push   rax
     17c4b39:	48 8d 3d 34 18 23 00 	lea    rdi,[rip+0x231834]        # 19f6374 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x4433>
     17c4b40:	e8 6b 9f 02 00       	call   17eeab0 <_ZNSt6__ndk115recursive_mutexC1Ev@plt>
     17c4b45:	58                   	pop    rax
     17c4b46:	c3                   	ret
     17c4b47:	48 89 c7             	mov    rdi,rax
     17c4b4a:	e8 56 4f 2b ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     17c4b4f:	cc                   	int3

### caller/xfer 0x17c5111; FDE=(24924341, 24924540)
     17c50e4:	74 07                	je     17c50ed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179259>
     17c50e6:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     17c50eb:	eb 05                	jmp    17c50f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17925e>
     17c50ed:	48 8d 7c 24 09       	lea    rdi,[rsp+0x9]
     17c50f2:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     17c50f7:	e8 54 9e 02 00       	call   17eef50 <stat@plt>
     17c50fc:	83 f8 ff             	cmp    eax,0xffffffff
     17c50ff:	74 17                	je     17c5118 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179284>
     17c5101:	8b 54 24 20          	mov    edx,DWORD PTR [rsp+0x20]
     17c5105:	48 8d 35 4a d9 ba fe 	lea    rsi,[rip+0xfffffffffebad94a]        # 372a56 <_ZTSSt12bad_any_cast@@Base-0x1d772>
     17c510c:	48 89 df             	mov    rdi,rbx
     17c510f:	31 c0                	xor    eax,eax
     17c5111:	e8 84 6b 01 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     17c5116:	eb 0f                	jmp    17c5127 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179293>
     17c5118:	48 8d 35 5d ce c8 fe 	lea    rsi,[rip+0xfffffffffec8ce5d]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     17c511f:	48 89 df             	mov    rdi,rbx
     17c5122:	e8 57 49 2b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     17c5127:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     17c512c:	e8 5f 8d 02 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     17c5131:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     17c5138:	00 00 
     17c513a:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
     17c5141:	00 
     17c5142:	75 33                	jne    17c5177 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1792e3>
     17c5144:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
     17c514b:	5b                   	pop    rbx
     17c514c:	41 5e                	pop    r14
     17c514e:	c3                   	ret
     17c514f:	48 89 c3             	mov    rbx,rax
     17c5152:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     17c5157:	e8 34 8d 02 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     17c515c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     17c5163:	00 00 

