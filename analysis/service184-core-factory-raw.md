# Raw service184 core factory 0x17db9e4..0x17dbc9a


/tmp/s184raw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000017db9e4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7805>:
 17db9e4:	55                   	push   rbp
 17db9e5:	41 57                	push   r15
 17db9e7:	41 56                	push   r14
 17db9e9:	41 55                	push   r13
 17db9eb:	41 54                	push   r12
 17db9ed:	53                   	push   rbx
 17db9ee:	48 81 ec 58 04 00 00 	sub    rsp,0x458
 17db9f5:	49 89 d7             	mov    r15,rdx
 17db9f8:	49 89 f4             	mov    r12,rsi
 17db9fb:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
 17dba00:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17dba07:	00 00 
 17dba09:	48 89 84 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rax
 17dba10:	00 
 17dba11:	48 8b 42 10          	mov    rax,QWORD PTR [rdx+0x10]
 17dba15:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
 17dba1a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 17dba1e:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
 17dba21:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
 17dba25:	e8 56 28 01 00       	call   17ee280 <__errno@plt>
 17dba2a:	8b 08                	mov    ecx,DWORD PTR [rax]
 17dba2c:	89 4c 24 04          	mov    DWORD PTR [rsp+0x4],ecx
 17dba30:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 17dba35:	83 20 00             	and    DWORD PTR [rax],0x0
 17dba38:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 17dba3d:	be 00 04 00 00       	mov    esi,0x400
 17dba42:	b9 00 04 00 00       	mov    ecx,0x400
 17dba47:	31 d2                	xor    edx,edx
 17dba49:	4d 89 e0             	mov    r8,r12
 17dba4c:	4d 89 f1             	mov    r9,r14
 17dba4f:	e8 1c 37 01 00       	call   17ef170 <__vsnprintf_chk@plt>
 17dba54:	41 89 c6             	mov    r14d,eax
 17dba57:	3d 00 04 00 00       	cmp    eax,0x400
 17dba5c:	73 17                	jae    17dba75 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7896>
 17dba5e:	44 89 f2             	mov    edx,r14d
 17dba61:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
 17dba66:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 17dba6b:	e8 f0 25 01 00       	call   17ee060 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm@plt>
 17dba70:	e9 f7 00 00 00       	jmp    17dbb6c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x798d>
 17dba75:	bb 00 04 00 00       	mov    ebx,0x400
 17dba7a:	b8 30 01 00 00       	mov    eax,0x130
 17dba7f:	48 03 05 f2 61 0d 00 	add    rax,QWORD PTR [rip+0xd61f2]        # 18b1c78 <__sF@LIBC>
 17dba86:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 17dba8b:	45 85 f6             	test   r14d,r14d
 17dba8e:	78 06                	js     17dba96 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x78b7>
 17dba90:	41 8d 5e 01          	lea    ebx,[r14+0x1]
 17dba94:	eb 16                	jmp    17dbaac <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x78cd>
 17dba96:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 17dba9b:	8b 38                	mov    edi,DWORD PTR [rax]
 17dba9d:	85 ff                	test   edi,edi
 17dba9f:	74 09                	je     17dbaaa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x78cb>
 17dbaa1:	83 ff 4b             	cmp    edi,0x4b
 17dbaa4:	0f 85 f2 00 00 00    	jne    17dbb9c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x79bd>
 17dbaaa:	01 db                	add    ebx,ebx
 17dbaac:	81 fb 01 00 00 02    	cmp    ebx,0x2000001
 17dbab2:	0f 8d 96 00 00 00    	jge    17dbb4e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x796f>
 17dbab8:	48 63 eb             	movsxd rbp,ebx
 17dbabb:	48 89 ef             	mov    rdi,rbp
 17dbabe:	48 8d 74 24 27       	lea    rsi,[rsp+0x27]
 17dbac3:	e8 98 3f 01 00       	call   17efa60 <_ZnamRKSt9nothrow_t@plt>
 17dbac8:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 17dbacd:	48 85 c0             	test   rax,rax
 17dbad0:	74 4e                	je     17dbb20 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7941>
 17dbad2:	49 89 c5             	mov    r13,rax
 17dbad5:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
 17dbad9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 17dbade:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
 17dbae2:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
 17dbae7:	4c 89 ef             	mov    rdi,r13
 17dbaea:	48 89 ee             	mov    rsi,rbp
 17dbaed:	31 d2                	xor    edx,edx
 17dbaef:	6a ff                	push   0xffffffffffffffff
 17dbaf1:	59                   	pop    rcx
 17dbaf2:	4d 89 e0             	mov    r8,r12
 17dbaf5:	4c 8d 4c 24 30       	lea    r9,[rsp+0x30]
 17dbafa:	e8 71 36 01 00       	call   17ef170 <__vsnprintf_chk@plt>
 17dbaff:	41 89 c6             	mov    r14d,eax
 17dbb02:	40 b5 01             	mov    bpl,0x1
 17dbb05:	85 c0                	test   eax,eax
 17dbb07:	78 30                	js     17dbb39 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x795a>
 17dbb09:	41 39 de             	cmp    r14d,ebx
 17dbb0c:	7d 2b                	jge    17dbb39 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x795a>
 17dbb0e:	44 89 f2             	mov    edx,r14d
 17dbb11:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 17dbb16:	4c 89 ee             	mov    rsi,r13
 17dbb19:	e8 42 25 01 00       	call   17ee060 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm@plt>
 17dbb1e:	eb 17                	jmp    17dbb37 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7958>
 17dbb20:	48 8d 3d 40 ac b4 fe 	lea    rdi,[rip+0xfffffffffeb4ac40]        # 326767 <_ZTSSt12bad_any_cast@@Base-0x69a61>
 17dbb27:	6a 44                	push   0x44
 17dbb29:	5e                   	pop    rsi
 17dbb2a:	6a 01                	push   0x1
 17dbb2c:	5a                   	pop    rdx
 17dbb2d:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 17dbb32:	e8 19 30 01 00       	call   17eeb50 <fwrite@plt>
 17dbb37:	31 ed                	xor    ebp,ebp
 17dbb39:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 17dbb3e:	e8 95 ba 41 ff       	call   bf75d8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x144578>
 17dbb43:	40 84 ed             	test   bpl,bpl
 17dbb46:	0f 85 3f ff ff ff    	jne    17dba8b <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x78ac>
 17dbb4c:	eb 1e                	jmp    17dbb6c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x798d>
 17dbb4e:	b9 30 01 00 00       	mov    ecx,0x130
 17dbb53:	48 03 0d 1e 61 0d 00 	add    rcx,QWORD PTR [rip+0xd611e]        # 18b1c78 <__sF@LIBC>
 17dbb5a:	48 8d 3d 90 5d b7 fe 	lea    rdi,[rip+0xfffffffffeb75d90]        # 3518f1 <_ZTSSt12bad_any_cast@@Base-0x3e8d7>
 17dbb61:	6a 42                	push   0x42
 17dbb63:	5e                   	pop    rsi
 17dbb64:	6a 01                	push   0x1
 17dbb66:	5a                   	pop    rdx
 17dbb67:	e8 e4 2f 01 00       	call   17eeb50 <fwrite@plt>
 17dbb6c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 17dbb71:	8b 4c 24 04          	mov    ecx,DWORD PTR [rsp+0x4]
 17dbb75:	89 08                	mov    DWORD PTR [rax],ecx
 17dbb77:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17dbb7e:	00 00 
 17dbb80:	48 3b 84 24 50 04 00 	cmp    rax,QWORD PTR [rsp+0x450]
 17dbb87:	00 
 17dbb88:	75 36                	jne    17dbbc0 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x79e1>
 17dbb8a:	48 81 c4 58 04 00 00 	add    rsp,0x458
 17dbb91:	5b                   	pop    rbx
 17dbb92:	41 5c                	pop    r12
 17dbb94:	41 5d                	pop    r13
 17dbb96:	41 5e                	pop    r14
 17dbb98:	41 5f                	pop    r15
 17dbb9a:	5d                   	pop    rbp
 17dbb9b:	c3                   	ret
 17dbb9c:	e8 cf 24 01 00       	call   17ee070 <strerror@plt>
 17dbba1:	bf 30 01 00 00       	mov    edi,0x130
 17dbba6:	48 03 3d cb 60 0d 00 	add    rdi,QWORD PTR [rip+0xd60cb]        # 18b1c78 <__sF@LIBC>
 17dbbad:	48 8d 35 e4 c3 b7 fe 	lea    rsi,[rip+0xfffffffffeb7c3e4]        # 357f98 <_ZTSSt12bad_any_cast@@Base-0x38230>
 17dbbb4:	48 89 c2             	mov    rdx,rax
 17dbbb7:	31 c0                	xor    eax,eax
 17dbbb9:	e8 92 3a 01 00       	call   17ef650 <fprintf@plt>
 17dbbbe:	eb ac                	jmp    17dbb6c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x798d>
 17dbbc0:	e8 eb 3e 01 00       	call   17efab0 <__stack_chk_fail@plt>
 17dbbc5:	eb 00                	jmp    17dbbc7 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x79e8>
 17dbbc7:	48 89 c7             	mov    rdi,rax
 17dbbca:	e8 d6 de 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 17dbbcf:	41 57                	push   r15
 17dbbd1:	41 56                	push   r14
 17dbbd3:	53                   	push   rbx
 17dbbd4:	48 81 ec d0 00 00 00 	sub    rsp,0xd0
 17dbbdb:	49 89 f6             	mov    r14,rsi
 17dbbde:	48 89 fb             	mov    rbx,rdi
 17dbbe1:	48 89 e6             	mov    rsi,rsp
 17dbbe4:	48 89 56 10          	mov    QWORD PTR [rsi+0x10],rdx
 17dbbe8:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
 17dbbec:	4c 89 46 20          	mov    QWORD PTR [rsi+0x20],r8
 17dbbf0:	4c 89 4e 28          	mov    QWORD PTR [rsi+0x28],r9
 17dbbf4:	84 c0                	test   al,al
 17dbbf6:	74 31                	je     17dbc29 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7a4a>
 17dbbf8:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
 17dbbfd:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
 17dbc02:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
 17dbc07:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
 17dbc0c:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
 17dbc11:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
 17dbc18:	00 
 17dbc19:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
 17dbc20:	00 
 17dbc21:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
 17dbc28:	00 
 17dbc29:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17dbc30:	00 00 
 17dbc32:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
 17dbc39:	00 
 17dbc3a:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]
 17dbc41:	00 
 17dbc42:	49 89 77 10          	mov    QWORD PTR [r15+0x10],rsi
 17dbc46:	48 8d 84 24 f0 00 00 	lea    rax,[rsp+0xf0]
 17dbc4d:	00 
 17dbc4e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
 17dbc52:	48 b8 10 00 00 00 30 	movabs rax,0x3000000010
 17dbc59:	00 00 00 
 17dbc5c:	49 89 07             	mov    QWORD PTR [r15],rax
 17dbc5f:	e8 f6 c9 2c ff       	call   aa865a <JNI_OnUnload@@Base+0x2ff27>
 17dbc64:	48 89 df             	mov    rdi,rbx
 17dbc67:	4c 89 f6             	mov    rsi,r14
 17dbc6a:	4c 89 fa             	mov    rdx,r15
 17dbc6d:	e8 72 fd ff ff       	call   17db9e4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7805>
 17dbc72:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17dbc79:	00 00 
 17dbc7b:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
 17dbc82:	00 
 17dbc83:	75 10                	jne    17dbc95 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7ab6>
 17dbc85:	48 89 d8             	mov    rax,rbx
 17dbc88:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
 17dbc8f:	5b                   	pop    rbx
 17dbc90:	41 5e                	pop    r14
 17dbc92:	41 5f                	pop    r15
 17dbc94:	c3                   	ret
 17dbc95:	e8 16 3e 01 00       	call   17efab0 <__stack_chk_fail@plt>
