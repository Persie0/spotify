# d88caa secondary-argument interface

Known adapter:
- d88caa subtracts 0x28 from RSI and calls d85524
- d85524 later captures that adjusted RSI as carrier[0]
- d8a5c2 eventually calls carrier[0]->vtable+0x1d8

## Relocation slots targeting d88caa
['0x1826fc8']

## Plausible Itanium address points containing d88caa
### AP 0x1826ec0: d88caa at +0x108; offset-to-top=-40; typeinfo=0x0; codeSlots=41
- +0x0: 0xd88b48 FDE=(14191432, 14191441)
- +0x8: 0xd88b52 FDE=(14191442, 14191451)
- +0x10: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x18: 0xd88b5c FDE=(14191452, 14191465)
- +0x20: 0xd88b6a FDE=(14191466, 14191474)
- +0x28: 0xd88b72 FDE=(14191474, 14191483)
- +0x30: 0xd88b7c FDE=(14191484, 14191493)
- +0x38: 0xd88b86 FDE=(14191494, 14191503)
- +0x40: 0xd88b90 FDE=(14191504, 14191513)
- +0x48: 0xd88b9a FDE=(14191514, 14191523)
- +0x50: 0xd88ba4 FDE=(14191524, 14191533)
- +0x58: 0xd88bae FDE=(14191534, 14191543)
- +0x60: 0xd88bb8 FDE=(14191544, 14191553)
- +0x68: 0xd88bc2 FDE=(14191554, 14191561)
- +0x70: 0xd88bca FDE=(14191562, 14191571)
- +0x78: 0xd88bd4 FDE=(14191572, 14191581)
- +0x80: 0xa4b900 FDE=(10795264, 10795272)
- +0x88: 0xd88bde FDE=(14191582, 14191591)
- +0x90: 0xd88be8 FDE=(14191592, 14191610)
- +0x98: 0xd88bfa FDE=(14191610, 14191628)
- +0xa0: 0xd88c0c FDE=(14191628, 14191646)
- +0xa8: 0xd88c1e FDE=(14191646, 14191664)
- +0xb0: 0xd88c30 FDE=(14191664, 14191682)
- +0xb8: 0xd88c42 FDE=(14191682, 14191700)
- +0xc0: 0xd88c54 FDE=(14191700, 14191718)
- +0xc8: 0xd88c66 FDE=(14191718, 14191731)
- +0xd0: 0xd88c74 FDE=(14191732, 14191737)
- +0xd8: 0xd88c7a FDE=(14191738, 14191747)
- +0xe0: 0xc44ecc FDE=(12865228, 12865236)
- +0xe8: 0xd88c84 FDE=(14191748, 14191756)
- +0xf0: 0xd88c8c FDE=(14191756, 14191763)
- +0xf8: 0xc2e960 FDE=(12773728, 12773736)

### AP 0x1826e80: d88caa at +0x148; offset-to-top=-32; typeinfo=0x0; codeSlots=47
- +0x0: 0xd88b04 FDE=(14191364, 14191373)
- +0x8: 0xd88b0e FDE=(14191374, 14191383)
- +0x10: 0xd88b18 FDE=(14191384, 14191393)
- +0x18: 0xd88b22 FDE=(14191394, 14191412)
- +0x20: 0xd88b34 FDE=(14191412, 14191421)
- +0x28: 0xd88b3e FDE=(14191422, 14191431)
- +0x30: 0xffffffffffffffd8 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0xd88b48 FDE=(14191432, 14191441)
- +0x48: 0xd88b52 FDE=(14191442, 14191451)
- +0x50: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x58: 0xd88b5c FDE=(14191452, 14191465)
- +0x60: 0xd88b6a FDE=(14191466, 14191474)
- +0x68: 0xd88b72 FDE=(14191474, 14191483)
- +0x70: 0xd88b7c FDE=(14191484, 14191493)
- +0x78: 0xd88b86 FDE=(14191494, 14191503)
- +0x80: 0xd88b90 FDE=(14191504, 14191513)
- +0x88: 0xd88b9a FDE=(14191514, 14191523)
- +0x90: 0xd88ba4 FDE=(14191524, 14191533)
- +0x98: 0xd88bae FDE=(14191534, 14191543)
- +0xa0: 0xd88bb8 FDE=(14191544, 14191553)
- +0xa8: 0xd88bc2 FDE=(14191554, 14191561)
- +0xb0: 0xd88bca FDE=(14191562, 14191571)
- +0xb8: 0xd88bd4 FDE=(14191572, 14191581)
- +0xc0: 0xa4b900 FDE=(10795264, 10795272)
- +0xc8: 0xd88bde FDE=(14191582, 14191591)
- +0xd0: 0xd88be8 FDE=(14191592, 14191610)
- +0xd8: 0xd88bfa FDE=(14191610, 14191628)
- +0xe0: 0xd88c0c FDE=(14191628, 14191646)
- +0xe8: 0xd88c1e FDE=(14191646, 14191664)
- +0xf0: 0xd88c30 FDE=(14191664, 14191682)
- +0xf8: 0xd88c42 FDE=(14191682, 14191700)

### AP 0x1826e50: d88caa at +0x178; offset-to-top=-24; typeinfo=0x0; codeSlots=51
- +0x0: 0xd88acc FDE=(14191308, 14191317)
- +0x8: 0xd88ad6 FDE=(14191318, 14191327)
- +0x10: 0xd88ae0 FDE=(14191328, 14191346)
- +0x18: 0xd88af2 FDE=(14191346, 14191364)
- +0x20: 0xffffffffffffffe0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0xd88b04 FDE=(14191364, 14191373)
- +0x38: 0xd88b0e FDE=(14191374, 14191383)
- +0x40: 0xd88b18 FDE=(14191384, 14191393)
- +0x48: 0xd88b22 FDE=(14191394, 14191412)
- +0x50: 0xd88b34 FDE=(14191412, 14191421)
- +0x58: 0xd88b3e FDE=(14191422, 14191431)
- +0x60: 0xffffffffffffffd8 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0xd88b48 FDE=(14191432, 14191441)
- +0x78: 0xd88b52 FDE=(14191442, 14191451)
- +0x80: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x88: 0xd88b5c FDE=(14191452, 14191465)
- +0x90: 0xd88b6a FDE=(14191466, 14191474)
- +0x98: 0xd88b72 FDE=(14191474, 14191483)
- +0xa0: 0xd88b7c FDE=(14191484, 14191493)
- +0xa8: 0xd88b86 FDE=(14191494, 14191503)
- +0xb0: 0xd88b90 FDE=(14191504, 14191513)
- +0xb8: 0xd88b9a FDE=(14191514, 14191523)
- +0xc0: 0xd88ba4 FDE=(14191524, 14191533)
- +0xc8: 0xd88bae FDE=(14191534, 14191543)
- +0xd0: 0xd88bb8 FDE=(14191544, 14191553)
- +0xd8: 0xd88bc2 FDE=(14191554, 14191561)
- +0xe0: 0xd88bca FDE=(14191562, 14191571)
- +0xe8: 0xd88bd4 FDE=(14191572, 14191581)
- +0xf0: 0xa4b900 FDE=(10795264, 10795272)
- +0xf8: 0xd88bde FDE=(14191582, 14191591)

### AP 0x1826e20: d88caa at +0x1a8; offset-to-top=-16; typeinfo=0x0; codeSlots=55
- +0x0: 0xd88aa6 FDE=(14191270, 14191279)
- +0x8: 0xd88ab0 FDE=(14191280, 14191289)
- +0x10: 0xd88aba FDE=(14191290, 14191298)
- +0x18: 0xd88ac2 FDE=(14191298, 14191307)
- +0x20: 0xffffffffffffffe8 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0xd88acc FDE=(14191308, 14191317)
- +0x38: 0xd88ad6 FDE=(14191318, 14191327)
- +0x40: 0xd88ae0 FDE=(14191328, 14191346)
- +0x48: 0xd88af2 FDE=(14191346, 14191364)
- +0x50: 0xffffffffffffffe0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0xd88b04 FDE=(14191364, 14191373)
- +0x68: 0xd88b0e FDE=(14191374, 14191383)
- +0x70: 0xd88b18 FDE=(14191384, 14191393)
- +0x78: 0xd88b22 FDE=(14191394, 14191412)
- +0x80: 0xd88b34 FDE=(14191412, 14191421)
- +0x88: 0xd88b3e FDE=(14191422, 14191431)
- +0x90: 0xffffffffffffffd8 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0xd88b48 FDE=(14191432, 14191441)
- +0xa8: 0xd88b52 FDE=(14191442, 14191451)
- +0xb0: 0xa4b8e0 FDE=(10795232, 10795237)
- +0xb8: 0xd88b5c FDE=(14191452, 14191465)
- +0xc0: 0xd88b6a FDE=(14191466, 14191474)
- +0xc8: 0xd88b72 FDE=(14191474, 14191483)
- +0xd0: 0xd88b7c FDE=(14191484, 14191493)
- +0xd8: 0xd88b86 FDE=(14191494, 14191503)
- +0xe0: 0xd88b90 FDE=(14191504, 14191513)
- +0xe8: 0xd88b9a FDE=(14191514, 14191523)
- +0xf0: 0xd88ba4 FDE=(14191524, 14191533)
- +0xf8: 0xd88bae FDE=(14191534, 14191543)

### AP 0x1826d98: d88caa at +0x230; offset-to-top=-8; typeinfo=0x0; codeSlots=60
- +0x0: 0xd88a08 FDE=(14191112, 14191121)
- +0x8: 0xd88a12 FDE=(14191122, 14191131)
- +0x10: 0xd88a1c FDE=(14191132, 14191150)
- +0x18: 0xd88a2e FDE=(14191150, 14191163)
- +0x20: 0xd88a3c FDE=(14191164, 14191173)
- +0x28: 0xd88a46 FDE=(14191174, 14191183)
- +0x30: 0xd88a50 FDE=(14191184, 14191193)
- +0x38: 0xd88a5a FDE=(14191194, 14191203)
- +0x40: 0xd88a64 FDE=(14191204, 14191213)
- +0x48: 0xd88a6e FDE=(14191214, 14191221)
- +0x50: 0xd88a76 FDE=(14191222, 14191231)
- +0x58: 0xd88a80 FDE=(14191232, 14191241)
- +0x60: 0xd88a8a FDE=(14191242, 14191250)
- +0x68: 0xd88a92 FDE=(14191250, 14191259)
- +0x70: 0xd88a9c FDE=(14191260, 14191269)
- +0x78: 0xfffffffffffffff0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0xd88aa6 FDE=(14191270, 14191279)
- +0x90: 0xd88ab0 FDE=(14191280, 14191289)
- +0x98: 0xd88aba FDE=(14191290, 14191298)
- +0xa0: 0xd88ac2 FDE=(14191298, 14191307)
- +0xa8: 0xffffffffffffffe8 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0xd88acc FDE=(14191308, 14191317)
- +0xc0: 0xd88ad6 FDE=(14191318, 14191327)
- +0xc8: 0xd88ae0 FDE=(14191328, 14191346)
- +0xd0: 0xd88af2 FDE=(14191346, 14191364)
- +0xd8: 0xffffffffffffffe0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0xd88b04 FDE=(14191364, 14191373)
- +0xf0: 0xd88b0e FDE=(14191374, 14191383)
- +0xf8: 0xd88b18 FDE=(14191384, 14191393)

## Code materializations of plausible APs
### 0xd6b0b7: lea    rax,[rip+0xabbcda]        # 1826d98 <_ZTIN4asio2ip16bad_address_castE@@Base+0x33c8>; FDE=(14068377, 14086279)
      d6b078:	48 8d 8c 24 30 05 00 	lea    rcx,[rsp+0x530]
      d6b07f:	00 
      d6b080:	48 89 01             	mov    QWORD PTR [rcx],rax
      d6b083:	48 89 51 08          	mov    QWORD PTR [rcx+0x8],rdx
      d6b087:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      d6b08b:	48 8d 84 24 28 0a 00 	lea    rax,[rsp+0xa28]
      d6b092:	00 
      d6b093:	66 0f 6e 40 54       	movd   xmm0,DWORD PTR [rax+0x54]
      d6b098:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
      d6b09d:	8a 80 80 00 00 00    	mov    al,BYTE PTR [rax+0x80]
      d6b0a3:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
      d6b0a7:	48 8d 05 42 b9 ab 00 	lea    rax,[rip+0xabb942]        # 18269f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3020>
      d6b0ae:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6b0b3:	49 89 04 24          	mov    QWORD PTR [r12],rax
      d6b0b7:	48 8d 05 da bc ab 00 	lea    rax,[rip+0xabbcda]        # 1826d98 <_ZTIN4asio2ip16bad_address_castE@@Base+0x33c8>
      d6b0be:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      d6b0c3:	48 8d 05 56 bd ab 00 	lea    rax,[rip+0xabbd56]        # 1826e20 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3450>
      d6b0ca:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      d6b0cf:	48 8d 05 7a bd ab 00 	lea    rax,[rip+0xabbd7a]        # 1826e50 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3480>
      d6b0d6:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      d6b0db:	48 8d 05 9e bd ab 00 	lea    rax,[rip+0xabbd9e]        # 1826e80 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34b0>
      d6b0e2:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      d6b0e7:	48 8d 05 d2 bd ab 00 	lea    rax,[rip+0xabbdd2]        # 1826ec0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34f0>
      d6b0ee:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      d6b0f3:	48 8d 05 e6 be ab 00 	lea    rax,[rip+0xabbee6]        # 1826fe0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3610>
      d6b0fa:	49 89 44 24 30       	mov    QWORD PTR [r12+0x30],rax
      d6b0ff:	66 0f ef c0          	pxor   xmm0,xmm0
      d6b103:	f3 41 0f 7f 44 24 38 	movdqu XMMWORD PTR [r12+0x38],xmm0
      d6b10a:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      d6b111:	b8 00 00 80 3f       	mov    eax,0x3f800000
      d6b116:	41 89 44 24 58       	mov    DWORD PTR [r12+0x58],eax
      d6b11b:	66 41 0f 7f 44 24 60 	movdqa XMMWORD PTR [r12+0x60],xmm0
      d6b122:	66 41 0f 7f 44 24 70 	movdqa XMMWORD PTR [r12+0x70],xmm0
      d6b129:	41 89 84 24 80 00 00 	mov    DWORD PTR [r12+0x80],eax
      d6b130:	00 
      d6b131:	49 89 ac 24 88 00 00 	mov    QWORD PTR [r12+0x88],rbp
      d6b138:	00 
      d6b139:	4d 89 bc 24 90 00 00 	mov    QWORD PTR [r12+0x90],r15
      d6b140:	00 

### 0xd6b0c3: lea    rax,[rip+0xabbd56]        # 1826e20 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3450>; FDE=(14068377, 14086279)
      d6b080:	48 89 01             	mov    QWORD PTR [rcx],rax
      d6b083:	48 89 51 08          	mov    QWORD PTR [rcx+0x8],rdx
      d6b087:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      d6b08b:	48 8d 84 24 28 0a 00 	lea    rax,[rsp+0xa28]
      d6b092:	00 
      d6b093:	66 0f 6e 40 54       	movd   xmm0,DWORD PTR [rax+0x54]
      d6b098:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
      d6b09d:	8a 80 80 00 00 00    	mov    al,BYTE PTR [rax+0x80]
      d6b0a3:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
      d6b0a7:	48 8d 05 42 b9 ab 00 	lea    rax,[rip+0xabb942]        # 18269f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3020>
      d6b0ae:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6b0b3:	49 89 04 24          	mov    QWORD PTR [r12],rax
      d6b0b7:	48 8d 05 da bc ab 00 	lea    rax,[rip+0xabbcda]        # 1826d98 <_ZTIN4asio2ip16bad_address_castE@@Base+0x33c8>
      d6b0be:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      d6b0c3:	48 8d 05 56 bd ab 00 	lea    rax,[rip+0xabbd56]        # 1826e20 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3450>
      d6b0ca:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      d6b0cf:	48 8d 05 7a bd ab 00 	lea    rax,[rip+0xabbd7a]        # 1826e50 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3480>
      d6b0d6:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      d6b0db:	48 8d 05 9e bd ab 00 	lea    rax,[rip+0xabbd9e]        # 1826e80 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34b0>
      d6b0e2:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      d6b0e7:	48 8d 05 d2 bd ab 00 	lea    rax,[rip+0xabbdd2]        # 1826ec0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34f0>
      d6b0ee:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      d6b0f3:	48 8d 05 e6 be ab 00 	lea    rax,[rip+0xabbee6]        # 1826fe0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3610>
      d6b0fa:	49 89 44 24 30       	mov    QWORD PTR [r12+0x30],rax
      d6b0ff:	66 0f ef c0          	pxor   xmm0,xmm0
      d6b103:	f3 41 0f 7f 44 24 38 	movdqu XMMWORD PTR [r12+0x38],xmm0
      d6b10a:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      d6b111:	b8 00 00 80 3f       	mov    eax,0x3f800000
      d6b116:	41 89 44 24 58       	mov    DWORD PTR [r12+0x58],eax
      d6b11b:	66 41 0f 7f 44 24 60 	movdqa XMMWORD PTR [r12+0x60],xmm0
      d6b122:	66 41 0f 7f 44 24 70 	movdqa XMMWORD PTR [r12+0x70],xmm0
      d6b129:	41 89 84 24 80 00 00 	mov    DWORD PTR [r12+0x80],eax
      d6b130:	00 
      d6b131:	49 89 ac 24 88 00 00 	mov    QWORD PTR [r12+0x88],rbp
      d6b138:	00 
      d6b139:	4d 89 bc 24 90 00 00 	mov    QWORD PTR [r12+0x90],r15
      d6b140:	00 
      d6b141:	6a 28                	push   0x28
      d6b143:	5f                   	pop    rdi

### 0xd6b0cf: lea    rax,[rip+0xabbd7a]        # 1826e50 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3480>; FDE=(14068377, 14086279)
      d6b087:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      d6b08b:	48 8d 84 24 28 0a 00 	lea    rax,[rsp+0xa28]
      d6b092:	00 
      d6b093:	66 0f 6e 40 54       	movd   xmm0,DWORD PTR [rax+0x54]
      d6b098:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
      d6b09d:	8a 80 80 00 00 00    	mov    al,BYTE PTR [rax+0x80]
      d6b0a3:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
      d6b0a7:	48 8d 05 42 b9 ab 00 	lea    rax,[rip+0xabb942]        # 18269f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3020>
      d6b0ae:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6b0b3:	49 89 04 24          	mov    QWORD PTR [r12],rax
      d6b0b7:	48 8d 05 da bc ab 00 	lea    rax,[rip+0xabbcda]        # 1826d98 <_ZTIN4asio2ip16bad_address_castE@@Base+0x33c8>
      d6b0be:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      d6b0c3:	48 8d 05 56 bd ab 00 	lea    rax,[rip+0xabbd56]        # 1826e20 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3450>
      d6b0ca:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      d6b0cf:	48 8d 05 7a bd ab 00 	lea    rax,[rip+0xabbd7a]        # 1826e50 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3480>
      d6b0d6:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      d6b0db:	48 8d 05 9e bd ab 00 	lea    rax,[rip+0xabbd9e]        # 1826e80 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34b0>
      d6b0e2:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      d6b0e7:	48 8d 05 d2 bd ab 00 	lea    rax,[rip+0xabbdd2]        # 1826ec0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34f0>
      d6b0ee:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      d6b0f3:	48 8d 05 e6 be ab 00 	lea    rax,[rip+0xabbee6]        # 1826fe0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3610>
      d6b0fa:	49 89 44 24 30       	mov    QWORD PTR [r12+0x30],rax
      d6b0ff:	66 0f ef c0          	pxor   xmm0,xmm0
      d6b103:	f3 41 0f 7f 44 24 38 	movdqu XMMWORD PTR [r12+0x38],xmm0
      d6b10a:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      d6b111:	b8 00 00 80 3f       	mov    eax,0x3f800000
      d6b116:	41 89 44 24 58       	mov    DWORD PTR [r12+0x58],eax
      d6b11b:	66 41 0f 7f 44 24 60 	movdqa XMMWORD PTR [r12+0x60],xmm0
      d6b122:	66 41 0f 7f 44 24 70 	movdqa XMMWORD PTR [r12+0x70],xmm0
      d6b129:	41 89 84 24 80 00 00 	mov    DWORD PTR [r12+0x80],eax
      d6b130:	00 
      d6b131:	49 89 ac 24 88 00 00 	mov    QWORD PTR [r12+0x88],rbp
      d6b138:	00 
      d6b139:	4d 89 bc 24 90 00 00 	mov    QWORD PTR [r12+0x90],r15
      d6b140:	00 
      d6b141:	6a 28                	push   0x28
      d6b143:	5f                   	pop    rdi
      d6b144:	e8 b7 2d a8 00       	call   17edf00 <_Znwm@plt>
      d6b149:	66 0f ef c0          	pxor   xmm0,xmm0

### 0xd6b0db: lea    rax,[rip+0xabbd9e]        # 1826e80 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34b0>; FDE=(14068377, 14086279)
      d6b092:	00 
      d6b093:	66 0f 6e 40 54       	movd   xmm0,DWORD PTR [rax+0x54]
      d6b098:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
      d6b09d:	8a 80 80 00 00 00    	mov    al,BYTE PTR [rax+0x80]
      d6b0a3:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
      d6b0a7:	48 8d 05 42 b9 ab 00 	lea    rax,[rip+0xabb942]        # 18269f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3020>
      d6b0ae:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6b0b3:	49 89 04 24          	mov    QWORD PTR [r12],rax
      d6b0b7:	48 8d 05 da bc ab 00 	lea    rax,[rip+0xabbcda]        # 1826d98 <_ZTIN4asio2ip16bad_address_castE@@Base+0x33c8>
      d6b0be:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      d6b0c3:	48 8d 05 56 bd ab 00 	lea    rax,[rip+0xabbd56]        # 1826e20 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3450>
      d6b0ca:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      d6b0cf:	48 8d 05 7a bd ab 00 	lea    rax,[rip+0xabbd7a]        # 1826e50 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3480>
      d6b0d6:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      d6b0db:	48 8d 05 9e bd ab 00 	lea    rax,[rip+0xabbd9e]        # 1826e80 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34b0>
      d6b0e2:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      d6b0e7:	48 8d 05 d2 bd ab 00 	lea    rax,[rip+0xabbdd2]        # 1826ec0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34f0>
      d6b0ee:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      d6b0f3:	48 8d 05 e6 be ab 00 	lea    rax,[rip+0xabbee6]        # 1826fe0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3610>
      d6b0fa:	49 89 44 24 30       	mov    QWORD PTR [r12+0x30],rax
      d6b0ff:	66 0f ef c0          	pxor   xmm0,xmm0
      d6b103:	f3 41 0f 7f 44 24 38 	movdqu XMMWORD PTR [r12+0x38],xmm0
      d6b10a:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      d6b111:	b8 00 00 80 3f       	mov    eax,0x3f800000
      d6b116:	41 89 44 24 58       	mov    DWORD PTR [r12+0x58],eax
      d6b11b:	66 41 0f 7f 44 24 60 	movdqa XMMWORD PTR [r12+0x60],xmm0
      d6b122:	66 41 0f 7f 44 24 70 	movdqa XMMWORD PTR [r12+0x70],xmm0
      d6b129:	41 89 84 24 80 00 00 	mov    DWORD PTR [r12+0x80],eax
      d6b130:	00 
      d6b131:	49 89 ac 24 88 00 00 	mov    QWORD PTR [r12+0x88],rbp
      d6b138:	00 
      d6b139:	4d 89 bc 24 90 00 00 	mov    QWORD PTR [r12+0x90],r15
      d6b140:	00 
      d6b141:	6a 28                	push   0x28
      d6b143:	5f                   	pop    rdi
      d6b144:	e8 b7 2d a8 00       	call   17edf00 <_Znwm@plt>
      d6b149:	66 0f ef c0          	pxor   xmm0,xmm0
      d6b14d:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      d6b152:	48 8d 0d 77 57 a9 00 	lea    rcx,[rip+0xa95777]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>

### 0xd6b0e7: lea    rax,[rip+0xabbdd2]        # 1826ec0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34f0>; FDE=(14068377, 14086279)
      d6b098:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
      d6b09d:	8a 80 80 00 00 00    	mov    al,BYTE PTR [rax+0x80]
      d6b0a3:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
      d6b0a7:	48 8d 05 42 b9 ab 00 	lea    rax,[rip+0xabb942]        # 18269f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3020>
      d6b0ae:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6b0b3:	49 89 04 24          	mov    QWORD PTR [r12],rax
      d6b0b7:	48 8d 05 da bc ab 00 	lea    rax,[rip+0xabbcda]        # 1826d98 <_ZTIN4asio2ip16bad_address_castE@@Base+0x33c8>
      d6b0be:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      d6b0c3:	48 8d 05 56 bd ab 00 	lea    rax,[rip+0xabbd56]        # 1826e20 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3450>
      d6b0ca:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      d6b0cf:	48 8d 05 7a bd ab 00 	lea    rax,[rip+0xabbd7a]        # 1826e50 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3480>
      d6b0d6:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      d6b0db:	48 8d 05 9e bd ab 00 	lea    rax,[rip+0xabbd9e]        # 1826e80 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34b0>
      d6b0e2:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      d6b0e7:	48 8d 05 d2 bd ab 00 	lea    rax,[rip+0xabbdd2]        # 1826ec0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34f0>
      d6b0ee:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      d6b0f3:	48 8d 05 e6 be ab 00 	lea    rax,[rip+0xabbee6]        # 1826fe0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3610>
      d6b0fa:	49 89 44 24 30       	mov    QWORD PTR [r12+0x30],rax
      d6b0ff:	66 0f ef c0          	pxor   xmm0,xmm0
      d6b103:	f3 41 0f 7f 44 24 38 	movdqu XMMWORD PTR [r12+0x38],xmm0
      d6b10a:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      d6b111:	b8 00 00 80 3f       	mov    eax,0x3f800000
      d6b116:	41 89 44 24 58       	mov    DWORD PTR [r12+0x58],eax
      d6b11b:	66 41 0f 7f 44 24 60 	movdqa XMMWORD PTR [r12+0x60],xmm0
      d6b122:	66 41 0f 7f 44 24 70 	movdqa XMMWORD PTR [r12+0x70],xmm0
      d6b129:	41 89 84 24 80 00 00 	mov    DWORD PTR [r12+0x80],eax
      d6b130:	00 
      d6b131:	49 89 ac 24 88 00 00 	mov    QWORD PTR [r12+0x88],rbp
      d6b138:	00 
      d6b139:	4d 89 bc 24 90 00 00 	mov    QWORD PTR [r12+0x90],r15
      d6b140:	00 
      d6b141:	6a 28                	push   0x28
      d6b143:	5f                   	pop    rdi
      d6b144:	e8 b7 2d a8 00       	call   17edf00 <_Znwm@plt>
      d6b149:	66 0f ef c0          	pxor   xmm0,xmm0
      d6b14d:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      d6b152:	48 8d 0d 77 57 a9 00 	lea    rcx,[rip+0xa95777]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
      d6b159:	48 89 08             	mov    QWORD PTR [rax],rcx
      d6b15c:	48 89 c1             	mov    rcx,rax

### 0xd7e36d: lea    rax,[rip+0xaa8a24]        # 1826d98 <_ZTIN4asio2ip16bad_address_castE@@Base+0x33c8>; FDE=(14148414, 14150526)
      d7e33e:	55                   	push   rbp
      d7e33f:	41 57                	push   r15
      d7e341:	41 56                	push   r14
      d7e343:	41 55                	push   r13
      d7e345:	41 54                	push   r12
      d7e347:	53                   	push   rbx
      d7e348:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
      d7e34f:	48 89 fb             	mov    rbx,rdi
      d7e352:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d7e359:	00 00 
      d7e35b:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      d7e362:	00 
      d7e363:	48 8d 05 86 86 aa 00 	lea    rax,[rip+0xaa8686]        # 18269f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3020>
      d7e36a:	48 89 07             	mov    QWORD PTR [rdi],rax
      d7e36d:	48 8d 05 24 8a aa 00 	lea    rax,[rip+0xaa8a24]        # 1826d98 <_ZTIN4asio2ip16bad_address_castE@@Base+0x33c8>
      d7e374:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      d7e378:	48 8d 05 a1 8a aa 00 	lea    rax,[rip+0xaa8aa1]        # 1826e20 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3450>
      d7e37f:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      d7e383:	48 8d 05 c6 8a aa 00 	lea    rax,[rip+0xaa8ac6]        # 1826e50 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3480>
      d7e38a:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
      d7e38e:	48 8d 05 eb 8a aa 00 	lea    rax,[rip+0xaa8aeb]        # 1826e80 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34b0>
      d7e395:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
      d7e399:	48 8d 05 20 8b aa 00 	lea    rax,[rip+0xaa8b20]        # 1826ec0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34f0>
      d7e3a0:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      d7e3a4:	48 8d 05 35 8c aa 00 	lea    rax,[rip+0xaa8c35]        # 1826fe0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3610>
      d7e3ab:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
      d7e3af:	c6 87 e8 01 00 00 01 	mov    BYTE PTR [rdi+0x1e8],0x1
      d7e3b6:	48 8d 87 b0 04 00 00 	lea    rax,[rdi+0x4b0]
      d7e3bd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d7e3c2:	48 8b bf b0 04 00 00 	mov    rdi,QWORD PTR [rdi+0x4b0]
      d7e3c9:	48 85 ff             	test   rdi,rdi
      d7e3cc:	74 11                	je     d7e3df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b465>
      d7e3ce:	e8 95 23 01 00       	call   d90768 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d7ee>
      d7e3d3:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d7e3d8:	31 f6                	xor    esi,esi
      d7e3da:	e8 eb 21 ff ff       	call   d705ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d650>
      d7e3df:	4c 8d bb c0 00 00 00 	lea    r15,[rbx+0xc0]
      d7e3e6:	4c 89 ff             	mov    rdi,r15
      d7e3e9:	e8 b6 37 f3 ff       	call   cb1ba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb44>

### 0xd7e378: lea    rax,[rip+0xaa8aa1]        # 1826e20 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3450>; FDE=(14148414, 14150526)
      d7e341:	41 56                	push   r14
      d7e343:	41 55                	push   r13
      d7e345:	41 54                	push   r12
      d7e347:	53                   	push   rbx
      d7e348:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
      d7e34f:	48 89 fb             	mov    rbx,rdi
      d7e352:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d7e359:	00 00 
      d7e35b:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      d7e362:	00 
      d7e363:	48 8d 05 86 86 aa 00 	lea    rax,[rip+0xaa8686]        # 18269f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3020>
      d7e36a:	48 89 07             	mov    QWORD PTR [rdi],rax
      d7e36d:	48 8d 05 24 8a aa 00 	lea    rax,[rip+0xaa8a24]        # 1826d98 <_ZTIN4asio2ip16bad_address_castE@@Base+0x33c8>
      d7e374:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      d7e378:	48 8d 05 a1 8a aa 00 	lea    rax,[rip+0xaa8aa1]        # 1826e20 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3450>
      d7e37f:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      d7e383:	48 8d 05 c6 8a aa 00 	lea    rax,[rip+0xaa8ac6]        # 1826e50 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3480>
      d7e38a:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
      d7e38e:	48 8d 05 eb 8a aa 00 	lea    rax,[rip+0xaa8aeb]        # 1826e80 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34b0>
      d7e395:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
      d7e399:	48 8d 05 20 8b aa 00 	lea    rax,[rip+0xaa8b20]        # 1826ec0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34f0>
      d7e3a0:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      d7e3a4:	48 8d 05 35 8c aa 00 	lea    rax,[rip+0xaa8c35]        # 1826fe0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3610>
      d7e3ab:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
      d7e3af:	c6 87 e8 01 00 00 01 	mov    BYTE PTR [rdi+0x1e8],0x1
      d7e3b6:	48 8d 87 b0 04 00 00 	lea    rax,[rdi+0x4b0]
      d7e3bd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d7e3c2:	48 8b bf b0 04 00 00 	mov    rdi,QWORD PTR [rdi+0x4b0]
      d7e3c9:	48 85 ff             	test   rdi,rdi
      d7e3cc:	74 11                	je     d7e3df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b465>
      d7e3ce:	e8 95 23 01 00       	call   d90768 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d7ee>
      d7e3d3:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d7e3d8:	31 f6                	xor    esi,esi
      d7e3da:	e8 eb 21 ff ff       	call   d705ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d650>
      d7e3df:	4c 8d bb c0 00 00 00 	lea    r15,[rbx+0xc0]
      d7e3e6:	4c 89 ff             	mov    rdi,r15
      d7e3e9:	e8 b6 37 f3 ff       	call   cb1ba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb44>
      d7e3ee:	48 8d b3 f8 00 00 00 	lea    rsi,[rbx+0xf8]
      d7e3f5:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]

### 0xd7e383: lea    rax,[rip+0xaa8ac6]        # 1826e50 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3480>; FDE=(14148414, 14150526)
      d7e345:	41 54                	push   r12
      d7e347:	53                   	push   rbx
      d7e348:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
      d7e34f:	48 89 fb             	mov    rbx,rdi
      d7e352:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d7e359:	00 00 
      d7e35b:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      d7e362:	00 
      d7e363:	48 8d 05 86 86 aa 00 	lea    rax,[rip+0xaa8686]        # 18269f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3020>
      d7e36a:	48 89 07             	mov    QWORD PTR [rdi],rax
      d7e36d:	48 8d 05 24 8a aa 00 	lea    rax,[rip+0xaa8a24]        # 1826d98 <_ZTIN4asio2ip16bad_address_castE@@Base+0x33c8>
      d7e374:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      d7e378:	48 8d 05 a1 8a aa 00 	lea    rax,[rip+0xaa8aa1]        # 1826e20 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3450>
      d7e37f:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      d7e383:	48 8d 05 c6 8a aa 00 	lea    rax,[rip+0xaa8ac6]        # 1826e50 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3480>
      d7e38a:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
      d7e38e:	48 8d 05 eb 8a aa 00 	lea    rax,[rip+0xaa8aeb]        # 1826e80 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34b0>
      d7e395:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
      d7e399:	48 8d 05 20 8b aa 00 	lea    rax,[rip+0xaa8b20]        # 1826ec0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34f0>
      d7e3a0:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      d7e3a4:	48 8d 05 35 8c aa 00 	lea    rax,[rip+0xaa8c35]        # 1826fe0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3610>
      d7e3ab:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
      d7e3af:	c6 87 e8 01 00 00 01 	mov    BYTE PTR [rdi+0x1e8],0x1
      d7e3b6:	48 8d 87 b0 04 00 00 	lea    rax,[rdi+0x4b0]
      d7e3bd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d7e3c2:	48 8b bf b0 04 00 00 	mov    rdi,QWORD PTR [rdi+0x4b0]
      d7e3c9:	48 85 ff             	test   rdi,rdi
      d7e3cc:	74 11                	je     d7e3df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b465>
      d7e3ce:	e8 95 23 01 00       	call   d90768 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d7ee>
      d7e3d3:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d7e3d8:	31 f6                	xor    esi,esi
      d7e3da:	e8 eb 21 ff ff       	call   d705ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d650>
      d7e3df:	4c 8d bb c0 00 00 00 	lea    r15,[rbx+0xc0]
      d7e3e6:	4c 89 ff             	mov    rdi,r15
      d7e3e9:	e8 b6 37 f3 ff       	call   cb1ba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb44>
      d7e3ee:	48 8d b3 f8 00 00 00 	lea    rsi,[rbx+0xf8]
      d7e3f5:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
      d7e3fc:	00 
      d7e3fd:	4c 89 f7             	mov    rdi,r14

### 0xd7e38e: lea    rax,[rip+0xaa8aeb]        # 1826e80 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34b0>; FDE=(14148414, 14150526)
      d7e348:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
      d7e34f:	48 89 fb             	mov    rbx,rdi
      d7e352:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d7e359:	00 00 
      d7e35b:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      d7e362:	00 
      d7e363:	48 8d 05 86 86 aa 00 	lea    rax,[rip+0xaa8686]        # 18269f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3020>
      d7e36a:	48 89 07             	mov    QWORD PTR [rdi],rax
      d7e36d:	48 8d 05 24 8a aa 00 	lea    rax,[rip+0xaa8a24]        # 1826d98 <_ZTIN4asio2ip16bad_address_castE@@Base+0x33c8>
      d7e374:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      d7e378:	48 8d 05 a1 8a aa 00 	lea    rax,[rip+0xaa8aa1]        # 1826e20 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3450>
      d7e37f:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      d7e383:	48 8d 05 c6 8a aa 00 	lea    rax,[rip+0xaa8ac6]        # 1826e50 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3480>
      d7e38a:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
      d7e38e:	48 8d 05 eb 8a aa 00 	lea    rax,[rip+0xaa8aeb]        # 1826e80 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34b0>
      d7e395:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
      d7e399:	48 8d 05 20 8b aa 00 	lea    rax,[rip+0xaa8b20]        # 1826ec0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34f0>
      d7e3a0:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      d7e3a4:	48 8d 05 35 8c aa 00 	lea    rax,[rip+0xaa8c35]        # 1826fe0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3610>
      d7e3ab:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
      d7e3af:	c6 87 e8 01 00 00 01 	mov    BYTE PTR [rdi+0x1e8],0x1
      d7e3b6:	48 8d 87 b0 04 00 00 	lea    rax,[rdi+0x4b0]
      d7e3bd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d7e3c2:	48 8b bf b0 04 00 00 	mov    rdi,QWORD PTR [rdi+0x4b0]
      d7e3c9:	48 85 ff             	test   rdi,rdi
      d7e3cc:	74 11                	je     d7e3df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b465>
      d7e3ce:	e8 95 23 01 00       	call   d90768 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d7ee>
      d7e3d3:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d7e3d8:	31 f6                	xor    esi,esi
      d7e3da:	e8 eb 21 ff ff       	call   d705ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d650>
      d7e3df:	4c 8d bb c0 00 00 00 	lea    r15,[rbx+0xc0]
      d7e3e6:	4c 89 ff             	mov    rdi,r15
      d7e3e9:	e8 b6 37 f3 ff       	call   cb1ba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb44>
      d7e3ee:	48 8d b3 f8 00 00 00 	lea    rsi,[rbx+0xf8]
      d7e3f5:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
      d7e3fc:	00 
      d7e3fd:	4c 89 f7             	mov    rdi,r14
      d7e400:	48 89 74 24 60       	mov    QWORD PTR [rsp+0x60],rsi
      d7e405:	e8 50 b8 a5 00       	call   17d9c5a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a7b>

### 0xd7e399: lea    rax,[rip+0xaa8b20]        # 1826ec0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34f0>; FDE=(14148414, 14150526)
      d7e352:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d7e359:	00 00 
      d7e35b:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      d7e362:	00 
      d7e363:	48 8d 05 86 86 aa 00 	lea    rax,[rip+0xaa8686]        # 18269f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3020>
      d7e36a:	48 89 07             	mov    QWORD PTR [rdi],rax
      d7e36d:	48 8d 05 24 8a aa 00 	lea    rax,[rip+0xaa8a24]        # 1826d98 <_ZTIN4asio2ip16bad_address_castE@@Base+0x33c8>
      d7e374:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      d7e378:	48 8d 05 a1 8a aa 00 	lea    rax,[rip+0xaa8aa1]        # 1826e20 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3450>
      d7e37f:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      d7e383:	48 8d 05 c6 8a aa 00 	lea    rax,[rip+0xaa8ac6]        # 1826e50 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3480>
      d7e38a:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
      d7e38e:	48 8d 05 eb 8a aa 00 	lea    rax,[rip+0xaa8aeb]        # 1826e80 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34b0>
      d7e395:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
      d7e399:	48 8d 05 20 8b aa 00 	lea    rax,[rip+0xaa8b20]        # 1826ec0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x34f0>
      d7e3a0:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      d7e3a4:	48 8d 05 35 8c aa 00 	lea    rax,[rip+0xaa8c35]        # 1826fe0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3610>
      d7e3ab:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
      d7e3af:	c6 87 e8 01 00 00 01 	mov    BYTE PTR [rdi+0x1e8],0x1
      d7e3b6:	48 8d 87 b0 04 00 00 	lea    rax,[rdi+0x4b0]
      d7e3bd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d7e3c2:	48 8b bf b0 04 00 00 	mov    rdi,QWORD PTR [rdi+0x4b0]
      d7e3c9:	48 85 ff             	test   rdi,rdi
      d7e3cc:	74 11                	je     d7e3df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b465>
      d7e3ce:	e8 95 23 01 00       	call   d90768 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d7ee>
      d7e3d3:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d7e3d8:	31 f6                	xor    esi,esi
      d7e3da:	e8 eb 21 ff ff       	call   d705ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d650>
      d7e3df:	4c 8d bb c0 00 00 00 	lea    r15,[rbx+0xc0]
      d7e3e6:	4c 89 ff             	mov    rdi,r15
      d7e3e9:	e8 b6 37 f3 ff       	call   cb1ba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb44>
      d7e3ee:	48 8d b3 f8 00 00 00 	lea    rsi,[rbx+0xf8]
      d7e3f5:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
      d7e3fc:	00 
      d7e3fd:	4c 89 f7             	mov    rdi,r14
      d7e400:	48 89 74 24 60       	mov    QWORD PTR [rsp+0x60],rsi
      d7e405:	e8 50 b8 a5 00       	call   17d9c5a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a7b>
      d7e40a:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      d7e40d:	e8 0c b7 a5 00       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>

## Candidate virtual call sites at matching slot offsets with RSI = base+0x28
## Any indirect matching-slot calls with nearby RSI provenance (fallback)
### 0xa73c06 slot +0x108; FDE=(10958968, 10979123)
      a73bc9:	4c 89 f9             	mov    rcx,r15
      a73bcc:	e8 ae 09 d6 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a73bd1:	4c 89 ff             	mov    rdi,r15
      a73bd4:	e8 b7 a2 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a73bd9:	48 89 df             	mov    rdi,rbx
      a73bdc:	e8 07 10 d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a73be1:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
      a73be6:	4d 85 f6             	test   r14,r14
      a73be9:	0f 84 88 00 00 00    	je     a73c77 <JNI_OnLoad@@Base+0x3ff>
      a73bef:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a73bf2:	48 8d 15 ba 4c 8d ff 	lea    rdx,[rip+0xffffffffff8d4cba]        # 3488b3 <_ZTSSt12bad_any_cast@@Base-0x47915>
      a73bf9:	48 8d 0d ca 10 8e ff 	lea    rcx,[rip+0xffffffffff8e10ca]        # 354cca <_ZTSSt12bad_any_cast@@Base-0x3b4fe>
      a73c00:	48 89 df             	mov    rdi,rbx
      a73c03:	4c 89 f6             	mov    rsi,r14
      a73c06:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a73c0c:	49 89 c7             	mov    r15,rax
      a73c0f:	48 89 df             	mov    rdi,rbx
      a73c12:	e8 d1 0f d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a73c17:	4d 85 ff             	test   r15,r15
      a73c1a:	74 64                	je     a73c80 <JNI_OnLoad@@Base+0x408>
      a73c1c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a73c1f:	48 8d 15 b1 ed 8f ff 	lea    rdx,[rip+0xffffffffff8fedb1]        # 3729d7 <_ZTSSt12bad_any_cast@@Base-0x1d7f1>
      a73c26:	48 8d 0d b9 18 8d ff 	lea    rcx,[rip+0xffffffffff8d18b9]        # 3454e6 <_ZTSSt12bad_any_cast@@Base-0x4ace2>
      a73c2d:	48 89 df             	mov    rdi,rbx
      a73c30:	4c 89 f6             	mov    rsi,r14
      a73c33:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a73c39:	49 89 c4             	mov    r12,rax
      a73c3c:	48 89 df             	mov    rdi,rbx
      a73c3f:	e8 a4 0f d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a73c44:	4d 85 e4             	test   r12,r12
      a73c47:	74 40                	je     a73c89 <JNI_OnLoad@@Base+0x411>
      a73c49:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a73c4c:	48 89 df             	mov    rdi,rbx
      a73c4f:	4c 89 f6             	mov    rsi,r14
      a73c52:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]

### 0xa73c33 slot +0x108; FDE=(10958968, 10979123)
      a73bf9:	48 8d 0d ca 10 8e ff 	lea    rcx,[rip+0xffffffffff8e10ca]        # 354cca <_ZTSSt12bad_any_cast@@Base-0x3b4fe>
      a73c00:	48 89 df             	mov    rdi,rbx
      a73c03:	4c 89 f6             	mov    rsi,r14
      a73c06:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a73c0c:	49 89 c7             	mov    r15,rax
      a73c0f:	48 89 df             	mov    rdi,rbx
      a73c12:	e8 d1 0f d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a73c17:	4d 85 ff             	test   r15,r15
      a73c1a:	74 64                	je     a73c80 <JNI_OnLoad@@Base+0x408>
      a73c1c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a73c1f:	48 8d 15 b1 ed 8f ff 	lea    rdx,[rip+0xffffffffff8fedb1]        # 3729d7 <_ZTSSt12bad_any_cast@@Base-0x1d7f1>
      a73c26:	48 8d 0d b9 18 8d ff 	lea    rcx,[rip+0xffffffffff8d18b9]        # 3454e6 <_ZTSSt12bad_any_cast@@Base-0x4ace2>
      a73c2d:	48 89 df             	mov    rdi,rbx
      a73c30:	4c 89 f6             	mov    rsi,r14
      a73c33:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a73c39:	49 89 c4             	mov    r12,rax
      a73c3c:	48 89 df             	mov    rdi,rbx
      a73c3f:	e8 a4 0f d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a73c44:	4d 85 e4             	test   r12,r12
      a73c47:	74 40                	je     a73c89 <JNI_OnLoad@@Base+0x411>
      a73c49:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a73c4c:	48 89 df             	mov    rdi,rbx
      a73c4f:	4c 89 f6             	mov    rsi,r14
      a73c52:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a73c58:	48 89 05 21 03 f7 00 	mov    QWORD PTR [rip+0xf70321],rax        # 19e3f80 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x9b0>
      a73c5f:	4c 89 3d 02 03 f7 00 	mov    QWORD PTR [rip+0xf70302],r15        # 19e3f68 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x998>
      a73c66:	4c 89 25 03 03 f7 00 	mov    QWORD PTR [rip+0xf70303],r12        # 19e3f70 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x9a0>
      a73c6d:	eb 29                	jmp    a73c98 <JNI_OnLoad@@Base+0x420>
      a73c6f:	6a ff                	push   0xffffffffffffffff
      a73c71:	58                   	pop    rax
      a73c72:	e9 34 43 00 00       	jmp    a77fab <JNI_OnLoad@@Base+0x4733>
      a73c77:	48 8d 35 b6 17 8e ff 	lea    rsi,[rip+0xffffffffff8e17b6]        # 355434 <_ZTSSt12bad_any_cast@@Base-0x3ad94>
      a73c7e:	eb 10                	jmp    a73c90 <JNI_OnLoad@@Base+0x418>
      a73c80:	48 8d 35 ee 5d 91 ff 	lea    rsi,[rip+0xffffffffff915dee]        # 389a75 <_ZTSSt12bad_any_cast@@Base-0x6753>
      a73c87:	eb 07                	jmp    a73c90 <JNI_OnLoad@@Base+0x418>

### 0xa73d0d slot +0x108; FDE=(10958968, 10979123)
      a73cd4:	4c 89 f9             	mov    rcx,r15
      a73cd7:	e8 a3 08 d6 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a73cdc:	4c 89 ff             	mov    rdi,r15
      a73cdf:	e8 ac a1 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a73ce4:	48 89 df             	mov    rdi,rbx
      a73ce7:	e8 fc 0e d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a73cec:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
      a73cf1:	4d 85 f6             	test   r14,r14
      a73cf4:	74 4c                	je     a73d42 <JNI_OnLoad@@Base+0x4ca>
      a73cf6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a73cf9:	48 8d 15 ff 82 8f ff 	lea    rdx,[rip+0xffffffffff8f82ff]        # 36bfff <_ZTSSt12bad_any_cast@@Base-0x241c9>
      a73d00:	48 8d 0d 6d e2 9d ff 	lea    rcx,[rip+0xffffffffff9de26d]        # 451f74 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b80>
      a73d07:	48 89 df             	mov    rdi,rbx
      a73d0a:	4c 89 f6             	mov    rsi,r14
      a73d0d:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a73d13:	49 89 c7             	mov    r15,rax
      a73d16:	48 89 df             	mov    rdi,rbx
      a73d19:	e8 ca 0e d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a73d1e:	4d 85 ff             	test   r15,r15
      a73d21:	74 28                	je     a73d4b <JNI_OnLoad@@Base+0x4d3>
      a73d23:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a73d26:	48 89 df             	mov    rdi,rbx
      a73d29:	4c 89 f6             	mov    rsi,r14
      a73d2c:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a73d32:	48 89 05 3f 02 f7 00 	mov    QWORD PTR [rip+0xf7023f],rax        # 19e3f78 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x9a8>
      a73d39:	4c 89 3d 20 02 f7 00 	mov    QWORD PTR [rip+0xf70220],r15        # 19e3f60 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x990>
      a73d40:	eb 18                	jmp    a73d5a <JNI_OnLoad@@Base+0x4e2>
      a73d42:	48 8d 35 11 8a 90 ff 	lea    rsi,[rip+0xffffffffff908a11]        # 37c75a <_ZTSSt12bad_any_cast@@Base-0x13a6e>
      a73d49:	eb 07                	jmp    a73d52 <JNI_OnLoad@@Base+0x4da>
      a73d4b:	48 8d 35 66 6a 8b ff 	lea    rsi,[rip+0xffffffffff8b6a66]        # 32a7b8 <_ZTSSt12bad_any_cast@@Base-0x65a10>
      a73d52:	48 89 df             	mov    rdi,rbx
      a73d55:	e8 fa 14 d6 00       	call   17d5254 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1075>
      a73d5a:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      a73d61:	00 
      a73d62:	e8 5f 1f d6 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>

### 0xa73dd3 slot +0x108; FDE=(10958968, 10979123)
      a73d96:	4c 89 f9             	mov    rcx,r15
      a73d99:	e8 e1 07 d6 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a73d9e:	4c 89 ff             	mov    rdi,r15
      a73da1:	e8 ea a0 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a73da6:	48 89 df             	mov    rdi,rbx
      a73da9:	e8 3a 0e d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a73dae:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
      a73db3:	4d 85 f6             	test   r14,r14
      a73db6:	0f 84 80 00 00 00    	je     a73e3c <JNI_OnLoad@@Base+0x5c4>
      a73dbc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a73dbf:	48 8d 15 b7 61 9c ff 	lea    rdx,[rip+0xffffffffff9c61b7]        # 439f7d <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f9cc>
      a73dc6:	48 8d 0d d7 db 8c ff 	lea    rcx,[rip+0xffffffffff8cdbd7]        # 3419a4 <_ZTSSt12bad_any_cast@@Base-0x4e824>
      a73dcd:	48 89 df             	mov    rdi,rbx
      a73dd0:	4c 89 f6             	mov    rsi,r14
      a73dd3:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a73dd9:	49 89 c7             	mov    r15,rax
      a73ddc:	48 89 df             	mov    rdi,rbx
      a73ddf:	e8 04 0e d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a73de4:	4d 85 ff             	test   r15,r15
      a73de7:	74 5c                	je     a73e45 <JNI_OnLoad@@Base+0x5cd>
      a73de9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a73dec:	48 8d 15 f0 50 90 ff 	lea    rdx,[rip+0xffffffffff9050f0]        # 378ee3 <_ZTSSt12bad_any_cast@@Base-0x172e5>
      a73df3:	48 8d 0d c6 eb 8f ff 	lea    rcx,[rip+0xffffffffff8febc6]        # 3729c0 <_ZTSSt12bad_any_cast@@Base-0x1d808>
      a73dfa:	48 89 df             	mov    rdi,rbx
      a73dfd:	4c 89 f6             	mov    rsi,r14
      a73e00:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a73e06:	49 89 c4             	mov    r12,rax
      a73e09:	48 89 df             	mov    rdi,rbx
      a73e0c:	e8 d7 0d d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a73e11:	4d 85 e4             	test   r12,r12
      a73e14:	74 38                	je     a73e4e <JNI_OnLoad@@Base+0x5d6>
      a73e16:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a73e19:	48 89 df             	mov    rdi,rbx
      a73e1c:	4c 89 f6             	mov    rsi,r14
      a73e1f:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]

### 0xa73e00 slot +0x108; FDE=(10958968, 10979123)
      a73dc6:	48 8d 0d d7 db 8c ff 	lea    rcx,[rip+0xffffffffff8cdbd7]        # 3419a4 <_ZTSSt12bad_any_cast@@Base-0x4e824>
      a73dcd:	48 89 df             	mov    rdi,rbx
      a73dd0:	4c 89 f6             	mov    rsi,r14
      a73dd3:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a73dd9:	49 89 c7             	mov    r15,rax
      a73ddc:	48 89 df             	mov    rdi,rbx
      a73ddf:	e8 04 0e d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a73de4:	4d 85 ff             	test   r15,r15
      a73de7:	74 5c                	je     a73e45 <JNI_OnLoad@@Base+0x5cd>
      a73de9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a73dec:	48 8d 15 f0 50 90 ff 	lea    rdx,[rip+0xffffffffff9050f0]        # 378ee3 <_ZTSSt12bad_any_cast@@Base-0x172e5>
      a73df3:	48 8d 0d c6 eb 8f ff 	lea    rcx,[rip+0xffffffffff8febc6]        # 3729c0 <_ZTSSt12bad_any_cast@@Base-0x1d808>
      a73dfa:	48 89 df             	mov    rdi,rbx
      a73dfd:	4c 89 f6             	mov    rsi,r14
      a73e00:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a73e06:	49 89 c4             	mov    r12,rax
      a73e09:	48 89 df             	mov    rdi,rbx
      a73e0c:	e8 d7 0d d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a73e11:	4d 85 e4             	test   r12,r12
      a73e14:	74 38                	je     a73e4e <JNI_OnLoad@@Base+0x5d6>
      a73e16:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a73e19:	48 89 df             	mov    rdi,rbx
      a73e1c:	4c 89 f6             	mov    rsi,r14
      a73e1f:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a73e25:	48 89 05 5c 01 f7 00 	mov    QWORD PTR [rip+0xf7015c],rax        # 19e3f88 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x9b8>
      a73e2c:	4c 89 25 5d 01 f7 00 	mov    QWORD PTR [rip+0xf7015d],r12        # 19e3f90 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x9c0>
      a73e33:	4c 89 3d 5e 01 f7 00 	mov    QWORD PTR [rip+0xf7015e],r15        # 19e3f98 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x9c8>
      a73e3a:	eb 21                	jmp    a73e5d <JNI_OnLoad@@Base+0x5e5>
      a73e3c:	48 8d 35 38 89 90 ff 	lea    rsi,[rip+0xffffffffff908938]        # 37c77b <_ZTSSt12bad_any_cast@@Base-0x13a4d>
      a73e43:	eb 10                	jmp    a73e55 <JNI_OnLoad@@Base+0x5dd>
      a73e45:	48 8d 35 9c 08 8c ff 	lea    rsi,[rip+0xffffffffff8c089c]        # 3346e8 <_ZTSSt12bad_any_cast@@Base-0x5bae0>
      a73e4c:	eb 07                	jmp    a73e55 <JNI_OnLoad@@Base+0x5dd>
      a73e4e:	48 8d 35 f7 1d 8f ff 	lea    rsi,[rip+0xffffffffff8f1df7]        # 365c4c <_ZTSSt12bad_any_cast@@Base-0x2a57c>
      a73e55:	48 89 df             	mov    rdi,rbx
      a73e58:	e8 f7 13 d6 00       	call   17d5254 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1075>

### 0xa740ed slot +0x108; FDE=(10958968, 10979123)
      a740b0:	4c 89 f9             	mov    rcx,r15
      a740b3:	e8 c7 04 d6 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a740b8:	4c 89 ff             	mov    rdi,r15
      a740bb:	e8 d0 9d d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a740c0:	48 89 df             	mov    rdi,rbx
      a740c3:	e8 20 0b d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a740c8:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
      a740cd:	4d 85 f6             	test   r14,r14
      a740d0:	0f 84 e5 3f 00 00    	je     a780bb <JNI_OnLoad@@Base+0x4843>
      a740d6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a740d9:	48 8d 15 30 13 8e ff 	lea    rdx,[rip+0xffffffffff8e1330]        # 355410 <_ZTSSt12bad_any_cast@@Base-0x3adb8>
      a740e0:	48 8d 0d 8d de 9d ff 	lea    rcx,[rip+0xffffffffff9dde8d]        # 451f74 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b80>
      a740e7:	48 89 df             	mov    rdi,rbx
      a740ea:	4c 89 f6             	mov    rsi,r14
      a740ed:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a740f3:	49 89 c7             	mov    r15,rax
      a740f6:	48 89 df             	mov    rdi,rbx
      a740f9:	e8 ea 0a d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a740fe:	4d 85 ff             	test   r15,r15
      a74101:	0f 84 b9 3f 00 00    	je     a780c0 <JNI_OnLoad@@Base+0x4848>
      a74107:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a7410a:	48 89 df             	mov    rdi,rbx
      a7410d:	4c 89 f6             	mov    rsi,r14
      a74110:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a74116:	48 89 05 43 fd f6 00 	mov    QWORD PTR [rip+0xf6fd43],rax        # 19e3e60 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x890>
      a7411d:	4c 89 3d 44 fd f6 00 	mov    QWORD PTR [rip+0xf6fd44],r15        # 19e3e68 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x898>
      a74124:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      a7412b:	00 
      a7412c:	e8 95 1b d6 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      a74131:	48 83 3d 1f fd f6 00 	cmp    QWORD PTR [rip+0xf6fd1f],0x0        # 19e3e58 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x888>
      a74138:	00 
      a74139:	0f 85 86 3f 00 00    	jne    a780c5 <JNI_OnLoad@@Base+0x484d>
      a7413f:	6a 08                	push   0x8
      a74141:	5f                   	pop    rdi
      a74142:	e8 b9 9d d7 00       	call   17edf00 <_Znwm@plt>

### 0xa7453d slot +0x108; FDE=(10958968, 10979123)
      a74500:	4c 89 f9             	mov    rcx,r15
      a74503:	e8 77 00 d6 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a74508:	4c 89 ff             	mov    rdi,r15
      a7450b:	e8 80 99 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a74510:	48 89 df             	mov    rdi,rbx
      a74513:	e8 d0 06 d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a74518:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
      a7451d:	4d 85 f6             	test   r14,r14
      a74520:	0f 84 80 00 00 00    	je     a745a6 <JNI_OnLoad@@Base+0xd2e>
      a74526:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a74529:	48 8d 15 dd 48 8f ff 	lea    rdx,[rip+0xffffffffff8f48dd]        # 368e0d <_ZTSSt12bad_any_cast@@Base-0x273bb>
      a74530:	48 8d 0d 6f e4 8f ff 	lea    rcx,[rip+0xffffffffff8fe46f]        # 3729a6 <_ZTSSt12bad_any_cast@@Base-0x1d822>
      a74537:	48 89 df             	mov    rdi,rbx
      a7453a:	4c 89 f6             	mov    rsi,r14
      a7453d:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a74543:	49 89 c7             	mov    r15,rax
      a74546:	48 89 df             	mov    rdi,rbx
      a74549:	e8 9a 06 d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a7454e:	4d 85 ff             	test   r15,r15
      a74551:	74 5c                	je     a745af <JNI_OnLoad@@Base+0xd37>
      a74553:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a74556:	48 8d 15 19 fd 8b ff 	lea    rdx,[rip+0xffffffffff8bfd19]        # 334276 <_ZTSSt12bad_any_cast@@Base-0x5bf52>
      a7455d:	48 8d 0d fc 78 8d ff 	lea    rcx,[rip+0xffffffffff8d78fc]        # 34be60 <_ZTSSt12bad_any_cast@@Base-0x44368>
      a74564:	48 89 df             	mov    rdi,rbx
      a74567:	4c 89 f6             	mov    rsi,r14
      a7456a:	ff 90 88 03 00 00    	call   QWORD PTR [rax+0x388]
      a74570:	49 89 c4             	mov    r12,rax
      a74573:	48 89 df             	mov    rdi,rbx
      a74576:	e8 6d 06 d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a7457b:	4d 85 e4             	test   r12,r12
      a7457e:	74 38                	je     a745b8 <JNI_OnLoad@@Base+0xd40>
      a74580:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a74583:	48 89 df             	mov    rdi,rbx
      a74586:	4c 89 f6             	mov    rsi,r14
      a74589:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]

### 0xa74640 slot +0x108; FDE=(10958968, 10979123)
      a74603:	4c 89 f9             	mov    rcx,r15
      a74606:	e8 74 ff d5 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a7460b:	4c 89 ff             	mov    rdi,r15
      a7460e:	e8 7d 98 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a74613:	48 89 df             	mov    rdi,rbx
      a74616:	e8 cd 05 d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a7461b:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
      a74620:	4d 85 f6             	test   r14,r14
      a74623:	0f 84 80 00 00 00    	je     a746a9 <JNI_OnLoad@@Base+0xe31>
      a74629:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a7462c:	48 8d 15 da 47 8f ff 	lea    rdx,[rip+0xffffffffff8f47da]        # 368e0d <_ZTSSt12bad_any_cast@@Base-0x273bb>
      a74633:	48 8d 0d 6c e3 8f ff 	lea    rcx,[rip+0xffffffffff8fe36c]        # 3729a6 <_ZTSSt12bad_any_cast@@Base-0x1d822>
      a7463a:	48 89 df             	mov    rdi,rbx
      a7463d:	4c 89 f6             	mov    rsi,r14
      a74640:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a74646:	49 89 c7             	mov    r15,rax
      a74649:	48 89 df             	mov    rdi,rbx
      a7464c:	e8 97 05 d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a74651:	4d 85 ff             	test   r15,r15
      a74654:	74 5c                	je     a746b2 <JNI_OnLoad@@Base+0xe3a>
      a74656:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a74659:	48 8d 15 35 d0 8c ff 	lea    rdx,[rip+0xffffffffff8cd035]        # 341695 <_ZTSSt12bad_any_cast@@Base-0x4eb33>
      a74660:	48 8d 0d 4d 0e 8f ff 	lea    rcx,[rip+0xffffffffff8f0e4d]        # 3654b4 <_ZTSSt12bad_any_cast@@Base-0x2ad14>
      a74667:	48 89 df             	mov    rdi,rbx
      a7466a:	4c 89 f6             	mov    rsi,r14
      a7466d:	ff 90 88 03 00 00    	call   QWORD PTR [rax+0x388]
      a74673:	49 89 c4             	mov    r12,rax
      a74676:	48 89 df             	mov    rdi,rbx
      a74679:	e8 6a 05 d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a7467e:	4d 85 e4             	test   r12,r12
      a74681:	74 38                	je     a746bb <JNI_OnLoad@@Base+0xe43>
      a74683:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a74686:	48 89 df             	mov    rdi,rbx
      a74689:	4c 89 f6             	mov    rsi,r14
      a7468c:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]

### 0xa747d6 slot +0x108; FDE=(10958968, 10979123)
      a74798:	48 8d 0d 1f 0f 8b ff 	lea    rcx,[rip+0xffffffffff8b0f1f]        # 3256be <_ZTSSt12bad_any_cast@@Base-0x6ab0a>
      a7479f:	48 89 df             	mov    rdi,rbx
      a747a2:	4c 89 f6             	mov    rsi,r14
      a747a5:	ff 90 f0 02 00 00    	call   QWORD PTR [rax+0x2f0]
      a747ab:	49 89 c5             	mov    r13,rax
      a747ae:	48 89 df             	mov    rdi,rbx
      a747b1:	e8 32 04 d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a747b6:	4d 85 ed             	test   r13,r13
      a747b9:	0f 84 80 00 00 00    	je     a7483f <JNI_OnLoad@@Base+0xfc7>
      a747bf:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a747c2:	48 8d 15 36 78 8f ff 	lea    rdx,[rip+0xffffffffff8f7836]        # 36bfff <_ZTSSt12bad_any_cast@@Base-0x241c9>
      a747c9:	48 8d 0d e6 c8 8b ff 	lea    rcx,[rip+0xffffffffff8bc8e6]        # 3310b6 <_ZTSSt12bad_any_cast@@Base-0x5f112>
      a747d0:	48 89 df             	mov    rdi,rbx
      a747d3:	4c 89 f6             	mov    rsi,r14
      a747d6:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a747dc:	48 89 c5             	mov    rbp,rax
      a747df:	48 89 df             	mov    rdi,rbx
      a747e2:	e8 01 04 d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a747e7:	48 85 ed             	test   rbp,rbp
      a747ea:	0f 84 9d 00 00 00    	je     a7488d <JNI_OnLoad@@Base+0x1015>
      a747f0:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a747f3:	48 89 df             	mov    rdi,rbx
      a747f6:	4c 89 f6             	mov    rsi,r14
      a747f9:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a747ff:	48 89 05 ca ef f6 00 	mov    QWORD PTR [rip+0xf6efca],rax        # 19e37d0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x200>
      a74806:	4c 89 3d cb ef f6 00 	mov    QWORD PTR [rip+0xf6efcb],r15        # 19e37d8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x208>
      a7480d:	4c 89 25 cc ef f6 00 	mov    QWORD PTR [rip+0xf6efcc],r12        # 19e37e0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x210>
      a74814:	4c 89 2d cd ef f6 00 	mov    QWORD PTR [rip+0xf6efcd],r13        # 19e37e8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x218>
      a7481b:	48 89 2d ce ef f6 00 	mov    QWORD PTR [rip+0xf6efce],rbp        # 19e37f0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x220>
      a74822:	eb 78                	jmp    a7489c <JNI_OnLoad@@Base+0x1024>
      a74824:	48 8d 35 8d a5 8e ff 	lea    rsi,[rip+0xffffffffff8ea58d]        # 35edb8 <_ZTSSt12bad_any_cast@@Base-0x31410>
      a7482b:	eb 67                	jmp    a74894 <JNI_OnLoad@@Base+0x101c>
      a7482d:	48 8d 35 87 49 8f ff 	lea    rsi,[rip+0xffffffffff8f4987]        # 3691bb <_ZTSSt12bad_any_cast@@Base-0x2700d>
      a74834:	eb 5e                	jmp    a74894 <JNI_OnLoad@@Base+0x101c>
      a74836:	48 8d 35 0a 34 8c ff 	lea    rsi,[rip+0xffffffffff8c340a]        # 337c47 <_ZTSSt12bad_any_cast@@Base-0x58581>

### 0xa74a1a slot +0x108; FDE=(10958968, 10979123)
      a749e0:	48 8d 0d 8e 6a 8e ff 	lea    rcx,[rip+0xffffffffff8e6a8e]        # 35b475 <_ZTSSt12bad_any_cast@@Base-0x34d53>
      a749e7:	48 89 df             	mov    rdi,rbx
      a749ea:	4c 89 f6             	mov    rsi,r14
      a749ed:	ff 90 f0 02 00 00    	call   QWORD PTR [rax+0x2f0]
      a749f3:	49 89 c5             	mov    r13,rax
      a749f6:	48 89 df             	mov    rdi,rbx
      a749f9:	e8 ea 01 d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a749fe:	4d 85 ed             	test   r13,r13
      a74a01:	74 7c                	je     a74a7f <JNI_OnLoad@@Base+0x1207>
      a74a03:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a74a06:	48 8d 15 f2 75 8f ff 	lea    rdx,[rip+0xffffffffff8f75f2]        # 36bfff <_ZTSSt12bad_any_cast@@Base-0x241c9>
      a74a0d:	48 8d 0d 70 09 8e ff 	lea    rcx,[rip+0xffffffffff8e0970]        # 355384 <_ZTSSt12bad_any_cast@@Base-0x3ae44>
      a74a14:	48 89 df             	mov    rdi,rbx
      a74a17:	4c 89 f6             	mov    rsi,r14
      a74a1a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a74a20:	48 89 c5             	mov    rbp,rax
      a74a23:	48 89 df             	mov    rdi,rbx
      a74a26:	e8 bd 01 d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a74a2b:	48 85 ed             	test   rbp,rbp
      a74a2e:	74 58                	je     a74a88 <JNI_OnLoad@@Base+0x1210>
      a74a30:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a74a33:	48 89 df             	mov    rdi,rbx
      a74a36:	4c 89 f6             	mov    rsi,r14
      a74a39:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a74a3f:	48 89 05 32 ed f6 00 	mov    QWORD PTR [rip+0xf6ed32],rax        # 19e3778 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1a8>
      a74a46:	4c 89 3d 3b ed f6 00 	mov    QWORD PTR [rip+0xf6ed3b],r15        # 19e3788 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1b8>
      a74a4d:	4c 89 25 3c ed f6 00 	mov    QWORD PTR [rip+0xf6ed3c],r12        # 19e3790 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1c0>
      a74a54:	4c 89 2d 3d ed f6 00 	mov    QWORD PTR [rip+0xf6ed3d],r13        # 19e3798 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1c8>
      a74a5b:	48 89 2d 1e ed f6 00 	mov    QWORD PTR [rip+0xf6ed1e],rbp        # 19e3780 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1b0>
      a74a62:	eb 33                	jmp    a74a97 <JNI_OnLoad@@Base+0x121f>
      a74a64:	48 8d 35 4d a3 8e ff 	lea    rsi,[rip+0xffffffffff8ea34d]        # 35edb8 <_ZTSSt12bad_any_cast@@Base-0x31410>
      a74a6b:	eb 22                	jmp    a74a8f <JNI_OnLoad@@Base+0x1217>
      a74a6d:	48 8d 35 14 42 8d ff 	lea    rsi,[rip+0xffffffffff8d4214]        # 348c88 <_ZTSSt12bad_any_cast@@Base-0x47540>
      a74a74:	eb 19                	jmp    a74a8f <JNI_OnLoad@@Base+0x1217>
      a74a76:	48 8d 35 10 71 8e ff 	lea    rsi,[rip+0xffffffffff8e7110]        # 35bb8d <_ZTSSt12bad_any_cast@@Base-0x3463b>

### 0xa74c9f slot +0x108; FDE=(10958968, 10979123)
      a74c66:	4c 89 f2             	mov    rdx,r14
      a74c69:	4c 89 f9             	mov    rcx,r15
      a74c6c:	e8 0e f9 d5 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a74c71:	4c 89 ff             	mov    rdi,r15
      a74c74:	e8 17 92 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a74c79:	48 89 df             	mov    rdi,rbx
      a74c7c:	e8 67 ff d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a74c81:	49 8b 74 24 08       	mov    rsi,QWORD PTR [r12+0x8]
      a74c86:	48 85 f6             	test   rsi,rsi
      a74c89:	74 3c                	je     a74cc7 <JNI_OnLoad@@Base+0x144f>
      a74c8b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a74c8e:	48 8d 15 81 d0 8d ff 	lea    rdx,[rip+0xffffffffff8dd081]        # 351d16 <_ZTSSt12bad_any_cast@@Base-0x3e4b2>
      a74c95:	48 8d 0d 7b 7a 8f ff 	lea    rcx,[rip+0xffffffffff8f7a7b]        # 36c717 <_ZTSSt12bad_any_cast@@Base-0x23ab1>
      a74c9c:	48 89 df             	mov    rdi,rbx
      a74c9f:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a74ca5:	48 89 05 84 ea f6 00 	mov    QWORD PTR [rip+0xf6ea84],rax        # 19e3730 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x160>
      a74cac:	48 89 df             	mov    rdi,rbx
      a74caf:	e8 34 ff d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a74cb4:	48 83 3d 74 ea f6 00 	cmp    QWORD PTR [rip+0xf6ea74],0x0        # 19e3730 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x160>
      a74cbb:	00 
      a74cbc:	75 18                	jne    a74cd6 <JNI_OnLoad@@Base+0x145e>
      a74cbe:	48 8d 35 ef c2 8b ff 	lea    rsi,[rip+0xffffffffff8bc2ef]        # 330fb4 <_ZTSSt12bad_any_cast@@Base-0x5f214>
      a74cc5:	eb 07                	jmp    a74cce <JNI_OnLoad@@Base+0x1456>
      a74cc7:	48 8d 35 61 08 8f ff 	lea    rsi,[rip+0xffffffffff8f0861]        # 36552f <_ZTSSt12bad_any_cast@@Base-0x2ac99>
      a74cce:	48 89 df             	mov    rdi,rbx
      a74cd1:	e8 7e 05 d6 00       	call   17d5254 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1075>
      a74cd6:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      a74cdd:	00 
      a74cde:	e8 e3 0f d6 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      a74ce3:	6a 08                	push   0x8
      a74ce5:	5f                   	pop    rdi
      a74ce6:	e8 15 92 d7 00       	call   17edf00 <_Znwm@plt>
      a74ceb:	48 8d 0d 6e 8f d8 00 	lea    rcx,[rip+0xd88f6e]        # 17fdc60 <_ZTINSt6__ndk117bad_function_callE@@Base+0xd00>
      a74cf2:	48 89 08             	mov    QWORD PTR [rax],rcx
      a74cf5:	48 83 3d 03 f0 f6 00 	cmp    QWORD PTR [rip+0xf6f003],0x0        # 19e3d00 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x730>

### 0xa74e36 slot +0x108; FDE=(10958968, 10979123)
      a74dfd:	4c 89 f2             	mov    rdx,r14
      a74e00:	4c 89 f9             	mov    rcx,r15
      a74e03:	e8 77 f7 d5 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a74e08:	4c 89 ff             	mov    rdi,r15
      a74e0b:	e8 80 90 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a74e10:	48 89 df             	mov    rdi,rbx
      a74e13:	e8 d0 fd d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a74e18:	49 8b 74 24 08       	mov    rsi,QWORD PTR [r12+0x8]
      a74e1d:	48 85 f6             	test   rsi,rsi
      a74e20:	74 3c                	je     a74e5e <JNI_OnLoad@@Base+0x15e6>
      a74e22:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a74e25:	48 8d 15 b5 99 8c ff 	lea    rdx,[rip+0xffffffffff8c99b5]        # 33e7e1 <_ZTSSt12bad_any_cast@@Base-0x519e7>
      a74e2c:	48 8d 0d bd a0 8e ff 	lea    rcx,[rip+0xffffffffff8ea0bd]        # 35eef0 <_ZTSSt12bad_any_cast@@Base-0x312d8>
      a74e33:	48 89 df             	mov    rdi,rbx
      a74e36:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a74e3c:	48 89 05 1d e9 f6 00 	mov    QWORD PTR [rip+0xf6e91d],rax        # 19e3760 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x190>
      a74e43:	48 89 df             	mov    rdi,rbx
      a74e46:	e8 9d fd d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a74e4b:	48 83 3d 0d e9 f6 00 	cmp    QWORD PTR [rip+0xf6e90d],0x0        # 19e3760 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x190>
      a74e52:	00 
      a74e53:	75 18                	jne    a74e6d <JNI_OnLoad@@Base+0x15f5>
      a74e55:	48 8d 35 53 c8 8c ff 	lea    rsi,[rip+0xffffffffff8cc853]        # 3416af <_ZTSSt12bad_any_cast@@Base-0x4eb19>
      a74e5c:	eb 07                	jmp    a74e65 <JNI_OnLoad@@Base+0x15ed>
      a74e5e:	48 8d 35 ca 06 8f ff 	lea    rsi,[rip+0xffffffffff8f06ca]        # 36552f <_ZTSSt12bad_any_cast@@Base-0x2ac99>
      a74e65:	48 89 df             	mov    rdi,rbx
      a74e68:	e8 e7 03 d6 00       	call   17d5254 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1075>
      a74e6d:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      a74e74:	00 
      a74e75:	e8 4c 0e d6 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      a74e7a:	6a 08                	push   0x8
      a74e7c:	5f                   	pop    rdi
      a74e7d:	e8 7e 90 d7 00       	call   17edf00 <_Znwm@plt>
      a74e82:	48 8d 0d d7 8d d8 00 	lea    rcx,[rip+0xd88dd7]        # 17fdc60 <_ZTINSt6__ndk117bad_function_callE@@Base+0xd00>
      a74e89:	48 89 08             	mov    QWORD PTR [rax],rcx
      a74e8c:	48 83 3d 8c ee f6 00 	cmp    QWORD PTR [rip+0xf6ee8c],0x0        # 19e3d20 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x750>

### 0xa755df slot +0x108; FDE=(10958968, 10979123)
      a755a6:	4c 89 f9             	mov    rcx,r15
      a755a9:	e8 d1 ef d5 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a755ae:	4c 89 ff             	mov    rdi,r15
      a755b1:	e8 da 88 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a755b6:	48 89 df             	mov    rdi,rbx
      a755b9:	e8 2a f6 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a755be:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
      a755c3:	4d 85 f6             	test   r14,r14
      a755c6:	74 4c                	je     a75614 <JNI_OnLoad@@Base+0x1d9c>
      a755c8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a755cb:	48 8d 15 e5 22 8d ff 	lea    rdx,[rip+0xffffffffff8d22e5]        # 3478b7 <_ZTSSt12bad_any_cast@@Base-0x48911>
      a755d2:	48 8d 0d 16 7c 8c ff 	lea    rcx,[rip+0xffffffffff8c7c16]        # 33d1ef <_ZTSSt12bad_any_cast@@Base-0x52fd9>
      a755d9:	48 89 df             	mov    rdi,rbx
      a755dc:	4c 89 f6             	mov    rsi,r14
      a755df:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a755e5:	49 89 c7             	mov    r15,rax
      a755e8:	48 89 df             	mov    rdi,rbx
      a755eb:	e8 f8 f5 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a755f0:	4d 85 ff             	test   r15,r15
      a755f3:	74 28                	je     a7561d <JNI_OnLoad@@Base+0x1da5>
      a755f5:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a755f8:	48 89 df             	mov    rdi,rbx
      a755fb:	4c 89 f6             	mov    rsi,r14
      a755fe:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a75604:	48 89 05 45 9e f7 00 	mov    QWORD PTR [rip+0xf79e45],rax        # 19ef450 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb80>
      a7560b:	4c 89 3d 46 9e f7 00 	mov    QWORD PTR [rip+0xf79e46],r15        # 19ef458 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb88>
      a75612:	eb 18                	jmp    a7562c <JNI_OnLoad@@Base+0x1db4>
      a75614:	48 8d 35 aa f2 90 ff 	lea    rsi,[rip+0xffffffffff90f2aa]        # 3848c5 <_ZTSSt12bad_any_cast@@Base-0xb903>
      a7561b:	eb 07                	jmp    a75624 <JNI_OnLoad@@Base+0x1dac>
      a7561d:	48 8d 35 2e 1a 8e ff 	lea    rsi,[rip+0xffffffffff8e1a2e]        # 357052 <_ZTSSt12bad_any_cast@@Base-0x39176>
      a75624:	48 89 df             	mov    rdi,rbx
      a75627:	e8 28 fc d5 00       	call   17d5254 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1075>
      a7562c:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      a75633:	00 
      a75634:	e8 8d 06 d6 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>

### 0xa75807 slot +0x108; FDE=(10958968, 10979123)
      a757ce:	4c 89 f9             	mov    rcx,r15
      a757d1:	e8 a9 ed d5 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a757d6:	4c 89 ff             	mov    rdi,r15
      a757d9:	e8 b2 86 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a757de:	48 89 df             	mov    rdi,rbx
      a757e1:	e8 02 f4 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a757e6:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
      a757eb:	4d 85 f6             	test   r14,r14
      a757ee:	74 4c                	je     a7583c <JNI_OnLoad@@Base+0x1fc4>
      a757f0:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a757f3:	48 8d 15 86 b3 8e ff 	lea    rdx,[rip+0xffffffffff8eb386]        # 360b80 <_ZTSSt12bad_any_cast@@Base-0x2f648>
      a757fa:	48 8d 0d bd 20 8d ff 	lea    rcx,[rip+0xffffffffff8d20bd]        # 3478be <_ZTSSt12bad_any_cast@@Base-0x4890a>
      a75801:	48 89 df             	mov    rdi,rbx
      a75804:	4c 89 f6             	mov    rsi,r14
      a75807:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a7580d:	49 89 c7             	mov    r15,rax
      a75810:	48 89 df             	mov    rdi,rbx
      a75813:	e8 d0 f3 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a75818:	4d 85 ff             	test   r15,r15
      a7581b:	74 28                	je     a75845 <JNI_OnLoad@@Base+0x1fcd>
      a7581d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75820:	48 89 df             	mov    rdi,rbx
      a75823:	4c 89 f6             	mov    rsi,r14
      a75826:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a7582c:	48 89 05 35 9c f7 00 	mov    QWORD PTR [rip+0xf79c35],rax        # 19ef468 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb98>
      a75833:	4c 89 3d 36 9c f7 00 	mov    QWORD PTR [rip+0xf79c36],r15        # 19ef470 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xba0>
      a7583a:	eb 18                	jmp    a75854 <JNI_OnLoad@@Base+0x1fdc>
      a7583c:	48 8d 35 f1 ac 8c ff 	lea    rsi,[rip+0xffffffffff8cacf1]        # 340534 <_ZTSSt12bad_any_cast@@Base-0x4fc94>
      a75843:	eb 07                	jmp    a7584c <JNI_OnLoad@@Base+0x1fd4>
      a75845:	48 8d 35 98 f0 90 ff 	lea    rsi,[rip+0xffffffffff90f098]        # 3848e4 <_ZTSSt12bad_any_cast@@Base-0xb8e4>
      a7584c:	48 89 df             	mov    rdi,rbx
      a7584f:	e8 00 fa d5 00       	call   17d5254 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1075>
      a75854:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      a7585b:	00 
      a7585c:	e8 65 04 d6 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>

### 0xa758cd slot +0x108; FDE=(10958968, 10979123)
      a75890:	4c 89 f9             	mov    rcx,r15
      a75893:	e8 e7 ec d5 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a75898:	4c 89 ff             	mov    rdi,r15
      a7589b:	e8 f0 85 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a758a0:	48 89 df             	mov    rdi,rbx
      a758a3:	e8 40 f3 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a758a8:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
      a758ad:	4d 85 f6             	test   r14,r14
      a758b0:	0f 84 80 00 00 00    	je     a75936 <JNI_OnLoad@@Base+0x20be>
      a758b6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a758b9:	48 8d 15 82 78 8c ff 	lea    rdx,[rip+0xffffffffff8c7882]        # 33d142 <_ZTSSt12bad_any_cast@@Base-0x53086>
      a758c0:	48 8d 0d 28 79 8c ff 	lea    rcx,[rip+0xffffffffff8c7928]        # 33d1ef <_ZTSSt12bad_any_cast@@Base-0x52fd9>
      a758c7:	48 89 df             	mov    rdi,rbx
      a758ca:	4c 89 f6             	mov    rsi,r14
      a758cd:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a758d3:	49 89 c7             	mov    r15,rax
      a758d6:	48 89 df             	mov    rdi,rbx
      a758d9:	e8 0a f3 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a758de:	4d 85 ff             	test   r15,r15
      a758e1:	74 5c                	je     a7593f <JNI_OnLoad@@Base+0x20c7>
      a758e3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a758e6:	48 8d 15 93 b2 8e ff 	lea    rdx,[rip+0xffffffffff8eb293]        # 360b80 <_ZTSSt12bad_any_cast@@Base-0x2f648>
      a758ed:	48 8d 0d ca 1f 8d ff 	lea    rcx,[rip+0xffffffffff8d1fca]        # 3478be <_ZTSSt12bad_any_cast@@Base-0x4890a>
      a758f4:	48 89 df             	mov    rdi,rbx
      a758f7:	4c 89 f6             	mov    rsi,r14
      a758fa:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a75900:	49 89 c4             	mov    r12,rax
      a75903:	48 89 df             	mov    rdi,rbx
      a75906:	e8 dd f2 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a7590b:	4d 85 e4             	test   r12,r12
      a7590e:	74 38                	je     a75948 <JNI_OnLoad@@Base+0x20d0>
      a75910:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75913:	48 89 df             	mov    rdi,rbx
      a75916:	4c 89 f6             	mov    rsi,r14
      a75919:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]

### 0xa758fa slot +0x108; FDE=(10958968, 10979123)
      a758c0:	48 8d 0d 28 79 8c ff 	lea    rcx,[rip+0xffffffffff8c7928]        # 33d1ef <_ZTSSt12bad_any_cast@@Base-0x52fd9>
      a758c7:	48 89 df             	mov    rdi,rbx
      a758ca:	4c 89 f6             	mov    rsi,r14
      a758cd:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a758d3:	49 89 c7             	mov    r15,rax
      a758d6:	48 89 df             	mov    rdi,rbx
      a758d9:	e8 0a f3 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a758de:	4d 85 ff             	test   r15,r15
      a758e1:	74 5c                	je     a7593f <JNI_OnLoad@@Base+0x20c7>
      a758e3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a758e6:	48 8d 15 93 b2 8e ff 	lea    rdx,[rip+0xffffffffff8eb293]        # 360b80 <_ZTSSt12bad_any_cast@@Base-0x2f648>
      a758ed:	48 8d 0d ca 1f 8d ff 	lea    rcx,[rip+0xffffffffff8d1fca]        # 3478be <_ZTSSt12bad_any_cast@@Base-0x4890a>
      a758f4:	48 89 df             	mov    rdi,rbx
      a758f7:	4c 89 f6             	mov    rsi,r14
      a758fa:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a75900:	49 89 c4             	mov    r12,rax
      a75903:	48 89 df             	mov    rdi,rbx
      a75906:	e8 dd f2 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a7590b:	4d 85 e4             	test   r12,r12
      a7590e:	74 38                	je     a75948 <JNI_OnLoad@@Base+0x20d0>
      a75910:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75913:	48 89 df             	mov    rdi,rbx
      a75916:	4c 89 f6             	mov    rsi,r14
      a75919:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a7591f:	48 89 05 52 9b f7 00 	mov    QWORD PTR [rip+0xf79b52],rax        # 19ef478 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xba8>
      a75926:	4c 89 3d 53 9b f7 00 	mov    QWORD PTR [rip+0xf79b53],r15        # 19ef480 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xbb0>
      a7592d:	4c 89 25 54 9b f7 00 	mov    QWORD PTR [rip+0xf79b54],r12        # 19ef488 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xbb8>
      a75934:	eb 21                	jmp    a75957 <JNI_OnLoad@@Base+0x20df>
      a75936:	48 8d 35 74 e4 8d ff 	lea    rsi,[rip+0xffffffffff8de474]        # 353db1 <_ZTSSt12bad_any_cast@@Base-0x3c417>
      a7593d:	eb 10                	jmp    a7594f <JNI_OnLoad@@Base+0x20d7>
      a7593f:	48 8d 35 06 78 8c ff 	lea    rsi,[rip+0xffffffffff8c7806]        # 33d14c <_ZTSSt12bad_any_cast@@Base-0x5307c>
      a75946:	eb 07                	jmp    a7594f <JNI_OnLoad@@Base+0x20d7>
      a75948:	48 8d 35 95 ef 90 ff 	lea    rsi,[rip+0xffffffffff90ef95]        # 3848e4 <_ZTSSt12bad_any_cast@@Base-0xb8e4>
      a7594f:	48 89 df             	mov    rdi,rbx
      a75952:	e8 fd f8 d5 00       	call   17d5254 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1075>

### 0xa75a46 slot +0x108; FDE=(10958968, 10979123)
      a75a09:	4c 89 f9             	mov    rcx,r15
      a75a0c:	e8 6e eb d5 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a75a11:	4c 89 ff             	mov    rdi,r15
      a75a14:	e8 77 84 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a75a19:	48 89 df             	mov    rdi,rbx
      a75a1c:	e8 c7 f1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a75a21:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
      a75a26:	4d 85 f6             	test   r14,r14
      a75a29:	0f 84 80 00 00 00    	je     a75aaf <JNI_OnLoad@@Base+0x2237>
      a75a2f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75a32:	48 8d 15 cc 50 8d ff 	lea    rdx,[rip+0xffffffffff8d50cc]        # 34ab05 <_ZTSSt12bad_any_cast@@Base-0x456c3>
      a75a39:	48 8d 0d 5d 10 8c ff 	lea    rcx,[rip+0xffffffffff8c105d]        # 336a9d <_ZTSSt12bad_any_cast@@Base-0x5972b>
      a75a40:	48 89 df             	mov    rdi,rbx
      a75a43:	4c 89 f6             	mov    rsi,r14
      a75a46:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a75a4c:	49 89 c7             	mov    r15,rax
      a75a4f:	48 89 df             	mov    rdi,rbx
      a75a52:	e8 91 f1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a75a57:	4d 85 ff             	test   r15,r15
      a75a5a:	74 5c                	je     a75ab8 <JNI_OnLoad@@Base+0x2240>
      a75a5c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75a5f:	48 8d 15 1a b1 8e ff 	lea    rdx,[rip+0xffffffffff8eb11a]        # 360b80 <_ZTSSt12bad_any_cast@@Base-0x2f648>
      a75a66:	48 8d 0d 66 bf 8f ff 	lea    rcx,[rip+0xffffffffff8fbf66]        # 3719d3 <_ZTSSt12bad_any_cast@@Base-0x1e7f5>
      a75a6d:	48 89 df             	mov    rdi,rbx
      a75a70:	4c 89 f6             	mov    rsi,r14
      a75a73:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a75a79:	49 89 c4             	mov    r12,rax
      a75a7c:	48 89 df             	mov    rdi,rbx
      a75a7f:	e8 64 f1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a75a84:	4d 85 e4             	test   r12,r12
      a75a87:	74 38                	je     a75ac1 <JNI_OnLoad@@Base+0x2249>
      a75a89:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75a8c:	48 89 df             	mov    rdi,rbx
      a75a8f:	4c 89 f6             	mov    rsi,r14
      a75a92:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]

### 0xa75a73 slot +0x108; FDE=(10958968, 10979123)
      a75a39:	48 8d 0d 5d 10 8c ff 	lea    rcx,[rip+0xffffffffff8c105d]        # 336a9d <_ZTSSt12bad_any_cast@@Base-0x5972b>
      a75a40:	48 89 df             	mov    rdi,rbx
      a75a43:	4c 89 f6             	mov    rsi,r14
      a75a46:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a75a4c:	49 89 c7             	mov    r15,rax
      a75a4f:	48 89 df             	mov    rdi,rbx
      a75a52:	e8 91 f1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a75a57:	4d 85 ff             	test   r15,r15
      a75a5a:	74 5c                	je     a75ab8 <JNI_OnLoad@@Base+0x2240>
      a75a5c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75a5f:	48 8d 15 1a b1 8e ff 	lea    rdx,[rip+0xffffffffff8eb11a]        # 360b80 <_ZTSSt12bad_any_cast@@Base-0x2f648>
      a75a66:	48 8d 0d 66 bf 8f ff 	lea    rcx,[rip+0xffffffffff8fbf66]        # 3719d3 <_ZTSSt12bad_any_cast@@Base-0x1e7f5>
      a75a6d:	48 89 df             	mov    rdi,rbx
      a75a70:	4c 89 f6             	mov    rsi,r14
      a75a73:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a75a79:	49 89 c4             	mov    r12,rax
      a75a7c:	48 89 df             	mov    rdi,rbx
      a75a7f:	e8 64 f1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a75a84:	4d 85 e4             	test   r12,r12
      a75a87:	74 38                	je     a75ac1 <JNI_OnLoad@@Base+0x2249>
      a75a89:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75a8c:	48 89 df             	mov    rdi,rbx
      a75a8f:	4c 89 f6             	mov    rsi,r14
      a75a92:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a75a98:	48 89 05 99 99 f7 00 	mov    QWORD PTR [rip+0xf79999],rax        # 19ef438 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb68>
      a75a9f:	4c 89 3d 9a 99 f7 00 	mov    QWORD PTR [rip+0xf7999a],r15        # 19ef440 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb70>
      a75aa6:	4c 89 25 9b 99 f7 00 	mov    QWORD PTR [rip+0xf7999b],r12        # 19ef448 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb78>
      a75aad:	eb 21                	jmp    a75ad0 <JNI_OnLoad@@Base+0x2258>
      a75aaf:	48 8d 35 4f 84 8d ff 	lea    rsi,[rip+0xffffffffff8d844f]        # 34df05 <_ZTSSt12bad_any_cast@@Base-0x422c3>
      a75ab6:	eb 10                	jmp    a75ac8 <JNI_OnLoad@@Base+0x2250>
      a75ab8:	48 8d 35 8c 46 8e ff 	lea    rsi,[rip+0xffffffffff8e468c]        # 35a14b <_ZTSSt12bad_any_cast@@Base-0x3607d>
      a75abf:	eb 07                	jmp    a75ac8 <JNI_OnLoad@@Base+0x2250>
      a75ac1:	48 8d 35 88 d4 8b ff 	lea    rsi,[rip+0xffffffffff8bd488]        # 332f50 <_ZTSSt12bad_any_cast@@Base-0x5d278>
      a75ac8:	48 89 df             	mov    rdi,rbx
      a75acb:	e8 84 f7 d5 00       	call   17d5254 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1075>

### 0xa75b49 slot +0x108; FDE=(10958968, 10979123)
      a75b0c:	4c 89 f9             	mov    rcx,r15
      a75b0f:	e8 6b ea d5 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      a75b14:	4c 89 ff             	mov    rdi,r15
      a75b17:	e8 74 83 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a75b1c:	48 89 df             	mov    rdi,rbx
      a75b1f:	e8 c4 f0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a75b24:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
      a75b29:	4d 85 f6             	test   r14,r14
      a75b2c:	0f 84 80 00 00 00    	je     a75bb2 <JNI_OnLoad@@Base+0x233a>
      a75b32:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75b35:	48 8d 15 8a 3f 8b ff 	lea    rdx,[rip+0xffffffffff8b3f8a]        # 329ac6 <_ZTSSt12bad_any_cast@@Base-0x66702>
      a75b3c:	48 8d 0d 5a 0f 8c ff 	lea    rcx,[rip+0xffffffffff8c0f5a]        # 336a9d <_ZTSSt12bad_any_cast@@Base-0x5972b>
      a75b43:	48 89 df             	mov    rdi,rbx
      a75b46:	4c 89 f6             	mov    rsi,r14
      a75b49:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a75b4f:	49 89 c7             	mov    r15,rax
      a75b52:	48 89 df             	mov    rdi,rbx
      a75b55:	e8 8e f0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a75b5a:	4d 85 ff             	test   r15,r15
      a75b5d:	74 5c                	je     a75bbb <JNI_OnLoad@@Base+0x2343>
      a75b5f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75b62:	48 8d 15 17 b0 8e ff 	lea    rdx,[rip+0xffffffffff8eb017]        # 360b80 <_ZTSSt12bad_any_cast@@Base-0x2f648>
      a75b69:	48 8d 0d 63 be 8f ff 	lea    rcx,[rip+0xffffffffff8fbe63]        # 3719d3 <_ZTSSt12bad_any_cast@@Base-0x1e7f5>
      a75b70:	48 89 df             	mov    rdi,rbx
      a75b73:	4c 89 f6             	mov    rsi,r14
      a75b76:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a75b7c:	49 89 c4             	mov    r12,rax
      a75b7f:	48 89 df             	mov    rdi,rbx
      a75b82:	e8 61 f0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a75b87:	4d 85 e4             	test   r12,r12
      a75b8a:	74 38                	je     a75bc4 <JNI_OnLoad@@Base+0x234c>
      a75b8c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75b8f:	48 89 df             	mov    rdi,rbx
      a75b92:	4c 89 f6             	mov    rsi,r14
      a75b95:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]

### 0xa75b76 slot +0x108; FDE=(10958968, 10979123)
      a75b3c:	48 8d 0d 5a 0f 8c ff 	lea    rcx,[rip+0xffffffffff8c0f5a]        # 336a9d <_ZTSSt12bad_any_cast@@Base-0x5972b>
      a75b43:	48 89 df             	mov    rdi,rbx
      a75b46:	4c 89 f6             	mov    rsi,r14
      a75b49:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a75b4f:	49 89 c7             	mov    r15,rax
      a75b52:	48 89 df             	mov    rdi,rbx
      a75b55:	e8 8e f0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a75b5a:	4d 85 ff             	test   r15,r15
      a75b5d:	74 5c                	je     a75bbb <JNI_OnLoad@@Base+0x2343>
      a75b5f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75b62:	48 8d 15 17 b0 8e ff 	lea    rdx,[rip+0xffffffffff8eb017]        # 360b80 <_ZTSSt12bad_any_cast@@Base-0x2f648>
      a75b69:	48 8d 0d 63 be 8f ff 	lea    rcx,[rip+0xffffffffff8fbe63]        # 3719d3 <_ZTSSt12bad_any_cast@@Base-0x1e7f5>
      a75b70:	48 89 df             	mov    rdi,rbx
      a75b73:	4c 89 f6             	mov    rsi,r14
      a75b76:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a75b7c:	49 89 c4             	mov    r12,rax
      a75b7f:	48 89 df             	mov    rdi,rbx
      a75b82:	e8 61 f0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a75b87:	4d 85 e4             	test   r12,r12
      a75b8a:	74 38                	je     a75bc4 <JNI_OnLoad@@Base+0x234c>
      a75b8c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a75b8f:	48 89 df             	mov    rdi,rbx
      a75b92:	4c 89 f6             	mov    rsi,r14
      a75b95:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a75b9b:	48 89 05 7e 98 f7 00 	mov    QWORD PTR [rip+0xf7987e],rax        # 19ef420 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb50>
      a75ba2:	4c 89 3d 7f 98 f7 00 	mov    QWORD PTR [rip+0xf7987f],r15        # 19ef428 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb58>
      a75ba9:	4c 89 25 80 98 f7 00 	mov    QWORD PTR [rip+0xf79880],r12        # 19ef430 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb60>
      a75bb0:	eb 21                	jmp    a75bd3 <JNI_OnLoad@@Base+0x235b>
      a75bb2:	48 8d 35 b7 f0 8f ff 	lea    rsi,[rip+0xffffffffff8ff0b7]        # 374c70 <_ZTSSt12bad_any_cast@@Base-0x1b558>
      a75bb9:	eb 10                	jmp    a75bcb <JNI_OnLoad@@Base+0x2353>
      a75bbb:	48 8d 35 c7 1c 8d ff 	lea    rsi,[rip+0xffffffffff8d1cc7]        # 347889 <_ZTSSt12bad_any_cast@@Base-0x4893f>
      a75bc2:	eb 07                	jmp    a75bcb <JNI_OnLoad@@Base+0x2353>
      a75bc4:	48 8d 35 23 36 8b ff 	lea    rsi,[rip+0xffffffffff8b3623]        # 3291ee <_ZTSSt12bad_any_cast@@Base-0x66fda>
      a75bcb:	48 89 df             	mov    rdi,rbx
      a75bce:	e8 81 f6 d5 00       	call   17d5254 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1075>

### 0xa7633b slot +0x108; FDE=(10958968, 10979123)
      a762fe:	4c 89 e2             	mov    rdx,r12
      a76301:	e8 6d e1 d5 00       	call   17d4473 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x294>
      a76306:	4c 89 e7             	mov    rdi,r12
      a76309:	e8 82 7b d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a7630e:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76315:	00 
      a76316:	e8 cd e8 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a7631b:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76322:	00 
      a76323:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]
      a76327:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a7632a:	48 8d 15 2a 30 91 ff 	lea    rdx,[rip+0xffffffffff91302a]        # 38935b <_ZTSSt12bad_any_cast@@Base-0x6e6d>
      a76331:	48 8d 0d 38 bc 9d ff 	lea    rcx,[rip+0xffffffffff9dbc38]        # 451f70 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b7c>
      a76338:	4c 89 fe             	mov    rsi,r15
      a7633b:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a76341:	48 89 05 40 d0 f6 00 	mov    QWORD PTR [rip+0xf6d040],rax        # 19e3388 <__cxa_new_handler@@Base+0x2c18>
      a76348:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a7634f:	00 
      a76350:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a76353:	48 8d 15 b1 fc 8f ff 	lea    rdx,[rip+0xffffffffff8ffcb1]        # 37600b <_ZTSSt12bad_any_cast@@Base-0x1a1bd>
      a7635a:	4c 8d 35 0f bc 9d ff 	lea    r14,[rip+0xffffffffff9dbc0f]        # 451f70 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b7c>
      a76361:	4c 89 fe             	mov    rsi,r15
      a76364:	4c 89 f1             	mov    rcx,r14
      a76367:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a7636d:	48 89 05 1c d0 f6 00 	mov    QWORD PTR [rip+0xf6d01c],rax        # 19e3390 <__cxa_new_handler@@Base+0x2c20>
      a76374:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a7637b:	00 
      a7637c:	e8 67 e8 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76381:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76388:	00 
      a76389:	48 8b 35 70 cf f6 00 	mov    rsi,QWORD PTR [rip+0xf6cf70]        # 19e3300 <__cxa_new_handler@@Base+0x2b90>
      a76390:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a76393:	48 8d 15 22 5e 8f ff 	lea    rdx,[rip+0xffffffffff8f5e22]        # 36c1bc <_ZTSSt12bad_any_cast@@Base-0x2400c>
      a7639a:	48 8d 0d d1 2f 91 ff 	lea    rcx,[rip+0xffffffffff912fd1]        # 389372 <_ZTSSt12bad_any_cast@@Base-0x6e56>
      a763a1:	ff 90 88 03 00 00    	call   QWORD PTR [rax+0x388]

### 0xa76367 slot +0x108; FDE=(10958968, 10979123)
      a76323:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]
      a76327:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a7632a:	48 8d 15 2a 30 91 ff 	lea    rdx,[rip+0xffffffffff91302a]        # 38935b <_ZTSSt12bad_any_cast@@Base-0x6e6d>
      a76331:	48 8d 0d 38 bc 9d ff 	lea    rcx,[rip+0xffffffffff9dbc38]        # 451f70 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b7c>
      a76338:	4c 89 fe             	mov    rsi,r15
      a7633b:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a76341:	48 89 05 40 d0 f6 00 	mov    QWORD PTR [rip+0xf6d040],rax        # 19e3388 <__cxa_new_handler@@Base+0x2c18>
      a76348:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a7634f:	00 
      a76350:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a76353:	48 8d 15 b1 fc 8f ff 	lea    rdx,[rip+0xffffffffff8ffcb1]        # 37600b <_ZTSSt12bad_any_cast@@Base-0x1a1bd>
      a7635a:	4c 8d 35 0f bc 9d ff 	lea    r14,[rip+0xffffffffff9dbc0f]        # 451f70 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b7c>
      a76361:	4c 89 fe             	mov    rsi,r15
      a76364:	4c 89 f1             	mov    rcx,r14
      a76367:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a7636d:	48 89 05 1c d0 f6 00 	mov    QWORD PTR [rip+0xf6d01c],rax        # 19e3390 <__cxa_new_handler@@Base+0x2c20>
      a76374:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a7637b:	00 
      a7637c:	e8 67 e8 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76381:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76388:	00 
      a76389:	48 8b 35 70 cf f6 00 	mov    rsi,QWORD PTR [rip+0xf6cf70]        # 19e3300 <__cxa_new_handler@@Base+0x2b90>
      a76390:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a76393:	48 8d 15 22 5e 8f ff 	lea    rdx,[rip+0xffffffffff8f5e22]        # 36c1bc <_ZTSSt12bad_any_cast@@Base-0x2400c>
      a7639a:	48 8d 0d d1 2f 91 ff 	lea    rcx,[rip+0xffffffffff912fd1]        # 389372 <_ZTSSt12bad_any_cast@@Base-0x6e56>
      a763a1:	ff 90 88 03 00 00    	call   QWORD PTR [rax+0x388]
      a763a7:	48 89 05 ea cf f6 00 	mov    QWORD PTR [rip+0xf6cfea],rax        # 19e3398 <__cxa_new_handler@@Base+0x2c28>
      a763ae:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a763b5:	00 
      a763b6:	e8 2d e8 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a763bb:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a763c2:	00 
      a763c3:	48 8b 35 36 cf f6 00 	mov    rsi,QWORD PTR [rip+0xf6cf36]        # 19e3300 <__cxa_new_handler@@Base+0x2b90>
      a763ca:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a763cd:	48 8d 15 4f fc 8f ff 	lea    rdx,[rip+0xffffffffff8ffc4f]        # 376023 <_ZTSSt12bad_any_cast@@Base-0x1a1a5>

### 0xa76a34 slot +0x108; FDE=(10958968, 10979123)
      a769eb:	48 8d 15 d6 ff 8a ff 	lea    rdx,[rip+0xffffffffff8affd6]        # 3269c8 <_ZTSSt12bad_any_cast@@Base-0x69800>
      a769f2:	48 8d 0d 57 56 90 ff 	lea    rcx,[rip+0xffffffffff905657]        # 37c050 <_ZTSSt12bad_any_cast@@Base-0x14178>
      a769f9:	ff 90 88 03 00 00    	call   QWORD PTR [rax+0x388]
      a769ff:	48 89 05 d2 c9 f6 00 	mov    QWORD PTR [rip+0xf6c9d2],rax        # 19e33d8 <__cxa_new_handler@@Base+0x2c68>
      a76a06:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76a0d:	00 
      a76a0e:	e8 d5 e1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76a13:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76a1a:	00 
      a76a1b:	48 8b b4 24 e8 00 00 	mov    rsi,QWORD PTR [rsp+0xe8]
      a76a22:	00 
      a76a23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a76a26:	48 8d 15 6b cd 8a ff 	lea    rdx,[rip+0xffffffffff8acd6b]        # 323798 <_ZTSSt12bad_any_cast@@Base-0x6ca30>
      a76a2d:	48 8d 0d 28 7a 8c ff 	lea    rcx,[rip+0xffffffffff8c7a28]        # 33e45c <_ZTSSt12bad_any_cast@@Base-0x51d6c>
      a76a34:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a76a3a:	48 89 05 9f c9 f6 00 	mov    QWORD PTR [rip+0xf6c99f],rax        # 19e33e0 <__cxa_new_handler@@Base+0x2c70>
      a76a41:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76a48:	00 
      a76a49:	e8 9a e1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76a4e:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76a55:	00 
      a76a56:	48 8b b4 24 d8 00 00 	mov    rsi,QWORD PTR [rsp+0xd8]
      a76a5d:	00 
      a76a5e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a76a61:	48 8d 15 48 46 8b ff 	lea    rdx,[rip+0xffffffffff8b4648]        # 32b0b0 <_ZTSSt12bad_any_cast@@Base-0x65118>
      a76a68:	48 8d 0d ed 79 8c ff 	lea    rcx,[rip+0xffffffffff8c79ed]        # 33e45c <_ZTSSt12bad_any_cast@@Base-0x51d6c>
      a76a6f:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a76a75:	48 89 05 6c c9 f6 00 	mov    QWORD PTR [rip+0xf6c96c],rax        # 19e33e8 <__cxa_new_handler@@Base+0x2c78>
      a76a7c:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76a83:	00 
      a76a84:	e8 5f e1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76a89:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76a90:	00 
      a76a91:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
      a76a98:	00 

### 0xa76a6f slot +0x108; FDE=(10958968, 10979123)
      a76a26:	48 8d 15 6b cd 8a ff 	lea    rdx,[rip+0xffffffffff8acd6b]        # 323798 <_ZTSSt12bad_any_cast@@Base-0x6ca30>
      a76a2d:	48 8d 0d 28 7a 8c ff 	lea    rcx,[rip+0xffffffffff8c7a28]        # 33e45c <_ZTSSt12bad_any_cast@@Base-0x51d6c>
      a76a34:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a76a3a:	48 89 05 9f c9 f6 00 	mov    QWORD PTR [rip+0xf6c99f],rax        # 19e33e0 <__cxa_new_handler@@Base+0x2c70>
      a76a41:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76a48:	00 
      a76a49:	e8 9a e1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76a4e:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76a55:	00 
      a76a56:	48 8b b4 24 d8 00 00 	mov    rsi,QWORD PTR [rsp+0xd8]
      a76a5d:	00 
      a76a5e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a76a61:	48 8d 15 48 46 8b ff 	lea    rdx,[rip+0xffffffffff8b4648]        # 32b0b0 <_ZTSSt12bad_any_cast@@Base-0x65118>
      a76a68:	48 8d 0d ed 79 8c ff 	lea    rcx,[rip+0xffffffffff8c79ed]        # 33e45c <_ZTSSt12bad_any_cast@@Base-0x51d6c>
      a76a6f:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a76a75:	48 89 05 6c c9 f6 00 	mov    QWORD PTR [rip+0xf6c96c],rax        # 19e33e8 <__cxa_new_handler@@Base+0x2c78>
      a76a7c:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76a83:	00 
      a76a84:	e8 5f e1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76a89:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76a90:	00 
      a76a91:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
      a76a98:	00 
      a76a99:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a76a9c:	48 8d 15 72 57 8f ff 	lea    rdx,[rip+0xffffffffff8f5772]        # 36c215 <_ZTSSt12bad_any_cast@@Base-0x23fb3>
      a76aa3:	48 8d 0d ca b4 9d ff 	lea    rcx,[rip+0xffffffffff9db4ca]        # 451f74 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b80>
      a76aaa:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a76ab0:	48 89 05 39 c9 f6 00 	mov    QWORD PTR [rip+0xf6c939],rax        # 19e33f0 <__cxa_new_handler@@Base+0x2c80>
      a76ab7:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76abe:	00 
      a76abf:	e8 24 e1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76ac4:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76acb:	00 
      a76acc:	48 8b b4 24 98 00 00 	mov    rsi,QWORD PTR [rsp+0x98]
      a76ad3:	00 

### 0xa76aaa slot +0x108; FDE=(10958968, 10979123)
      a76a61:	48 8d 15 48 46 8b ff 	lea    rdx,[rip+0xffffffffff8b4648]        # 32b0b0 <_ZTSSt12bad_any_cast@@Base-0x65118>
      a76a68:	48 8d 0d ed 79 8c ff 	lea    rcx,[rip+0xffffffffff8c79ed]        # 33e45c <_ZTSSt12bad_any_cast@@Base-0x51d6c>
      a76a6f:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a76a75:	48 89 05 6c c9 f6 00 	mov    QWORD PTR [rip+0xf6c96c],rax        # 19e33e8 <__cxa_new_handler@@Base+0x2c78>
      a76a7c:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76a83:	00 
      a76a84:	e8 5f e1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76a89:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76a90:	00 
      a76a91:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
      a76a98:	00 
      a76a99:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a76a9c:	48 8d 15 72 57 8f ff 	lea    rdx,[rip+0xffffffffff8f5772]        # 36c215 <_ZTSSt12bad_any_cast@@Base-0x23fb3>
      a76aa3:	48 8d 0d ca b4 9d ff 	lea    rcx,[rip+0xffffffffff9db4ca]        # 451f74 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b80>
      a76aaa:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a76ab0:	48 89 05 39 c9 f6 00 	mov    QWORD PTR [rip+0xf6c939],rax        # 19e33f0 <__cxa_new_handler@@Base+0x2c80>
      a76ab7:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76abe:	00 
      a76abf:	e8 24 e1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76ac4:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76acb:	00 
      a76acc:	48 8b b4 24 98 00 00 	mov    rsi,QWORD PTR [rsp+0x98]
      a76ad3:	00 
      a76ad4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a76ad7:	48 8d 15 56 7d 90 ff 	lea    rdx,[rip+0xffffffffff907d56]        # 37e834 <_ZTSSt12bad_any_cast@@Base-0x11994>
      a76ade:	48 8d 0d af e7 8e ff 	lea    rcx,[rip+0xffffffffff8ee7af]        # 365294 <_ZTSSt12bad_any_cast@@Base-0x2af34>
      a76ae5:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a76aeb:	48 89 05 06 c9 f6 00 	mov    QWORD PTR [rip+0xf6c906],rax        # 19e33f8 <__cxa_new_handler@@Base+0x2c88>
      a76af2:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76af9:	00 
      a76afa:	e8 e9 e0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76aff:	48 8d 35 3a 67 d8 00 	lea    rsi,[rip+0xd8673a]        # 17fd240 <_ZTINSt6__ndk117bad_function_callE@@Base+0x2e0>
      a76b06:	6a 09                	push   0x9
      a76b08:	59                   	pop    rcx
      a76b09:	48 8d 94 24 80 01 00 	lea    rdx,[rsp+0x180]

### 0xa76ae5 slot +0x108; FDE=(10958968, 10979123)
      a76a9c:	48 8d 15 72 57 8f ff 	lea    rdx,[rip+0xffffffffff8f5772]        # 36c215 <_ZTSSt12bad_any_cast@@Base-0x23fb3>
      a76aa3:	48 8d 0d ca b4 9d ff 	lea    rcx,[rip+0xffffffffff9db4ca]        # 451f74 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b80>
      a76aaa:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a76ab0:	48 89 05 39 c9 f6 00 	mov    QWORD PTR [rip+0xf6c939],rax        # 19e33f0 <__cxa_new_handler@@Base+0x2c80>
      a76ab7:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76abe:	00 
      a76abf:	e8 24 e1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76ac4:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76acb:	00 
      a76acc:	48 8b b4 24 98 00 00 	mov    rsi,QWORD PTR [rsp+0x98]
      a76ad3:	00 
      a76ad4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a76ad7:	48 8d 15 56 7d 90 ff 	lea    rdx,[rip+0xffffffffff907d56]        # 37e834 <_ZTSSt12bad_any_cast@@Base-0x11994>
      a76ade:	48 8d 0d af e7 8e ff 	lea    rcx,[rip+0xffffffffff8ee7af]        # 365294 <_ZTSSt12bad_any_cast@@Base-0x2af34>
      a76ae5:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a76aeb:	48 89 05 06 c9 f6 00 	mov    QWORD PTR [rip+0xf6c906],rax        # 19e33f8 <__cxa_new_handler@@Base+0x2c88>
      a76af2:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76af9:	00 
      a76afa:	e8 e9 e0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a76aff:	48 8d 35 3a 67 d8 00 	lea    rsi,[rip+0xd8673a]        # 17fd240 <_ZTINSt6__ndk117bad_function_callE@@Base+0x2e0>
      a76b06:	6a 09                	push   0x9
      a76b08:	59                   	pop    rcx
      a76b09:	48 8d 94 24 80 01 00 	lea    rdx,[rsp+0x180]
      a76b10:	00 
      a76b11:	48 89 d7             	mov    rdi,rdx
      a76b14:	f3 48 a5             	rep movs QWORD PTR es:[rdi],QWORD PTR ds:[rsi]
      a76b17:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      a76b1e:	00 
      a76b1f:	48 8b 35 da c7 f6 00 	mov    rsi,QWORD PTR [rip+0xf6c7da]        # 19e3300 <__cxa_new_handler@@Base+0x2b90>
      a76b26:	6a 03                	push   0x3
      a76b28:	59                   	pop    rcx
      a76b29:	e8 5b f4 d5 00       	call   17d5f89 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1daa>
      a76b2e:	48 8d 05 e3 11 e4 00 	lea    rax,[rip+0xe411e3]        # 18b7d18 <__cxa_unexpected_handler@@Base+0x88>
      a76b35:	48 89 05 c4 c8 f6 00 	mov    QWORD PTR [rip+0xf6c8c4],rax        # 19e3400 <__cxa_new_handler@@Base+0x2c90>
      a76b3c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]

### 0xa7753f slot +0x108; FDE=(10958968, 10979123)
      a77502:	4c 89 ea             	mov    rdx,r13
      a77505:	e8 69 cf d5 00       	call   17d4473 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x294>
      a7750a:	4c 89 ef             	mov    rdi,r13
      a7750d:	e8 7e 69 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a77512:	48 89 df             	mov    rdi,rbx
      a77515:	e8 ce d6 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a7751a:	4d 8b 64 24 08       	mov    r12,QWORD PTR [r12+0x8]
      a7751f:	4d 85 e4             	test   r12,r12
      a77522:	0f 84 da 00 00 00    	je     a77602 <JNI_OnLoad@@Base+0x3d8a>
      a77528:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a7752b:	48 8d 15 cd 4a 8f ff 	lea    rdx,[rip+0xffffffffff8f4acd]        # 36bfff <_ZTSSt12bad_any_cast@@Base-0x241c9>
      a77532:	48 8d 0d e0 70 8f ff 	lea    rcx,[rip+0xffffffffff8f70e0]        # 36e619 <_ZTSSt12bad_any_cast@@Base-0x21baf>
      a77539:	48 89 df             	mov    rdi,rbx
      a7753c:	4c 89 fe             	mov    rsi,r15
      a7753f:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a77545:	48 89 05 9c 80 f7 00 	mov    QWORD PTR [rip+0xf7809c],rax        # 19ef5e8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xd18>
      a7754c:	48 89 df             	mov    rdi,rbx
      a7754f:	e8 94 d6 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a77554:	48 83 3d 8c 80 f7 00 	cmp    QWORD PTR [rip+0xf7808c],0x0        # 19ef5e8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xd18>
      a7755b:	00 
      a7755c:	0f 84 a9 00 00 00    	je     a7760b <JNI_OnLoad@@Base+0x3d93>
      a77562:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a77565:	48 8d 15 5a 96 8d ff 	lea    rdx,[rip+0xffffffffff8d965a]        # 350bc6 <_ZTSSt12bad_any_cast@@Base-0x3f602>
      a7756c:	48 8d 0d ea 8f 8c ff 	lea    rcx,[rip+0xffffffffff8c8fea]        # 34055d <_ZTSSt12bad_any_cast@@Base-0x4fc6b>
      a77573:	48 89 df             	mov    rdi,rbx
      a77576:	4c 89 e6             	mov    rsi,r12
      a77579:	ff 90 88 03 00 00    	call   QWORD PTR [rax+0x388]
      a7757f:	48 89 05 6a 80 f7 00 	mov    QWORD PTR [rip+0xf7806a],rax        # 19ef5f0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xd20>
      a77586:	48 89 df             	mov    rdi,rbx
      a77589:	e8 5a d6 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a7758e:	48 83 3d 5a 80 f7 00 	cmp    QWORD PTR [rip+0xf7805a],0x0        # 19ef5f0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xd20>
      a77595:	00 
      a77596:	74 7c                	je     a77614 <JNI_OnLoad@@Base+0x3d9c>
      a77598:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a7759b:	48 89 df             	mov    rdi,rbx

### 0xa7780e slot +0x108; FDE=(10958968, 10979123)
      a777d6:	4c 89 e2             	mov    rdx,r12
      a777d9:	e8 95 cc d5 00       	call   17d4473 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x294>
      a777de:	4c 89 e7             	mov    rdi,r12
      a777e1:	e8 aa 66 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a777e6:	48 89 df             	mov    rdi,rbx
      a777e9:	e8 fa d3 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a777ee:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]
      a777f2:	4d 85 ff             	test   r15,r15
      a777f5:	74 4e                	je     a77845 <JNI_OnLoad@@Base+0x3fcd>
      a777f7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a777fa:	48 8d 15 fe 47 8f ff 	lea    rdx,[rip+0xffffffffff8f47fe]        # 36bfff <_ZTSSt12bad_any_cast@@Base-0x241c9>
      a77801:	48 8d 0d b5 7e 90 ff 	lea    rcx,[rip+0xffffffffff907eb5]        # 37f6bd <_ZTSSt12bad_any_cast@@Base-0x10b0b>
      a77808:	48 89 df             	mov    rdi,rbx
      a7780b:	4c 89 fe             	mov    rsi,r15
      a7780e:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a77814:	48 89 05 95 c5 f6 00 	mov    QWORD PTR [rip+0xf6c595],rax        # 19e3db0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7e0>
      a7781b:	48 89 df             	mov    rdi,rbx
      a7781e:	e8 c5 d3 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a77823:	48 83 3d 85 c5 f6 00 	cmp    QWORD PTR [rip+0xf6c585],0x0        # 19e3db0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7e0>
      a7782a:	00 
      a7782b:	74 21                	je     a7784e <JNI_OnLoad@@Base+0x3fd6>
      a7782d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a77830:	48 89 df             	mov    rdi,rbx
      a77833:	4c 89 fe             	mov    rsi,r15
      a77836:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a7783c:	48 89 05 75 c5 f6 00 	mov    QWORD PTR [rip+0xf6c575],rax        # 19e3db8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7e8>
      a77843:	eb 18                	jmp    a7785d <JNI_OnLoad@@Base+0x3fe5>
      a77845:	48 8d 35 63 21 91 ff 	lea    rsi,[rip+0xffffffffff912163]        # 3899af <_ZTSSt12bad_any_cast@@Base-0x6819>
      a7784c:	eb 07                	jmp    a77855 <JNI_OnLoad@@Base+0x3fdd>
      a7784e:	48 8d 35 47 62 8b ff 	lea    rsi,[rip+0xffffffffff8b6247]        # 32da9c <_ZTSSt12bad_any_cast@@Base-0x6272c>
      a77855:	48 89 df             	mov    rdi,rbx
      a77858:	e8 f7 d9 d5 00       	call   17d5254 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1075>
      a7785d:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      a77864:	00 
      a77865:	e8 5c e4 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>

### 0xa778d0 slot +0x108; FDE=(10958968, 10979123)
      a77894:	4c 89 e2             	mov    rdx,r12
      a77897:	e8 d7 cb d5 00       	call   17d4473 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x294>
      a7789c:	4c 89 e7             	mov    rdi,r12
      a7789f:	e8 ec 65 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a778a4:	48 89 df             	mov    rdi,rbx
      a778a7:	e8 3c d3 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a778ac:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]
      a778b0:	4d 85 ff             	test   r15,r15
      a778b3:	0f 84 be 00 00 00    	je     a77977 <JNI_OnLoad@@Base+0x40ff>
      a778b9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a778bc:	48 8d 15 ab 36 8c ff 	lea    rdx,[rip+0xffffffffff8c36ab]        # 33af6e <_ZTSSt12bad_any_cast@@Base-0x5525a>
      a778c3:	48 8d 0d dc b0 8f ff 	lea    rcx,[rip+0xffffffffff8fb0dc]        # 3729a6 <_ZTSSt12bad_any_cast@@Base-0x1d822>
      a778ca:	48 89 df             	mov    rdi,rbx
      a778cd:	4c 89 fe             	mov    rsi,r15
      a778d0:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a778d6:	48 89 05 e3 c4 f6 00 	mov    QWORD PTR [rip+0xf6c4e3],rax        # 19e3dc0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7f0>
      a778dd:	48 89 df             	mov    rdi,rbx
      a778e0:	e8 03 d3 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a778e5:	48 83 3d d3 c4 f6 00 	cmp    QWORD PTR [rip+0xf6c4d3],0x0        # 19e3dc0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7f0>
      a778ec:	00 
      a778ed:	0f 84 8d 00 00 00    	je     a77980 <JNI_OnLoad@@Base+0x4108>
      a778f3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a778f6:	48 8d 15 51 76 8e ff 	lea    rdx,[rip+0xffffffffff8e7651]        # 35ef4e <_ZTSSt12bad_any_cast@@Base-0x3127a>
      a778fd:	48 8d 0d 3a 5c 8b ff 	lea    rcx,[rip+0xffffffffff8b5c3a]        # 32d53e <_ZTSSt12bad_any_cast@@Base-0x62c8a>
      a77904:	48 89 df             	mov    rdi,rbx
      a77907:	4c 89 fe             	mov    rsi,r15
      a7790a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a77910:	48 89 05 b1 c4 f6 00 	mov    QWORD PTR [rip+0xf6c4b1],rax        # 19e3dc8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7f8>
      a77917:	48 89 df             	mov    rdi,rbx
      a7791a:	e8 c9 d2 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a7791f:	48 83 3d a1 c4 f6 00 	cmp    QWORD PTR [rip+0xf6c4a1],0x0        # 19e3dc8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7f8>
      a77926:	00 
      a77927:	74 60                	je     a77989 <JNI_OnLoad@@Base+0x4111>
      a77929:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a7792c:	48 8d 15 0a a7 8e ff 	lea    rdx,[rip+0xffffffffff8ea70a]        # 36203d <_ZTSSt12bad_any_cast@@Base-0x2e18b>

### 0xa7790a slot +0x108; FDE=(10958968, 10979123)
      a778ca:	48 89 df             	mov    rdi,rbx
      a778cd:	4c 89 fe             	mov    rsi,r15
      a778d0:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a778d6:	48 89 05 e3 c4 f6 00 	mov    QWORD PTR [rip+0xf6c4e3],rax        # 19e3dc0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7f0>
      a778dd:	48 89 df             	mov    rdi,rbx
      a778e0:	e8 03 d3 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a778e5:	48 83 3d d3 c4 f6 00 	cmp    QWORD PTR [rip+0xf6c4d3],0x0        # 19e3dc0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7f0>
      a778ec:	00 
      a778ed:	0f 84 8d 00 00 00    	je     a77980 <JNI_OnLoad@@Base+0x4108>
      a778f3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a778f6:	48 8d 15 51 76 8e ff 	lea    rdx,[rip+0xffffffffff8e7651]        # 35ef4e <_ZTSSt12bad_any_cast@@Base-0x3127a>
      a778fd:	48 8d 0d 3a 5c 8b ff 	lea    rcx,[rip+0xffffffffff8b5c3a]        # 32d53e <_ZTSSt12bad_any_cast@@Base-0x62c8a>
      a77904:	48 89 df             	mov    rdi,rbx
      a77907:	4c 89 fe             	mov    rsi,r15
      a7790a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a77910:	48 89 05 b1 c4 f6 00 	mov    QWORD PTR [rip+0xf6c4b1],rax        # 19e3dc8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7f8>
      a77917:	48 89 df             	mov    rdi,rbx
      a7791a:	e8 c9 d2 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a7791f:	48 83 3d a1 c4 f6 00 	cmp    QWORD PTR [rip+0xf6c4a1],0x0        # 19e3dc8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7f8>
      a77926:	00 
      a77927:	74 60                	je     a77989 <JNI_OnLoad@@Base+0x4111>
      a77929:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a7792c:	48 8d 15 0a a7 8e ff 	lea    rdx,[rip+0xffffffffff8ea70a]        # 36203d <_ZTSSt12bad_any_cast@@Base-0x2e18b>
      a77933:	48 8d 0d 04 5c 8b ff 	lea    rcx,[rip+0xffffffffff8b5c04]        # 32d53e <_ZTSSt12bad_any_cast@@Base-0x62c8a>
      a7793a:	48 89 df             	mov    rdi,rbx
      a7793d:	4c 89 fe             	mov    rsi,r15
      a77940:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a77946:	48 89 05 83 c4 f6 00 	mov    QWORD PTR [rip+0xf6c483],rax        # 19e3dd0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x800>
      a7794d:	48 89 df             	mov    rdi,rbx
      a77950:	e8 93 d2 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a77955:	48 83 3d 73 c4 f6 00 	cmp    QWORD PTR [rip+0xf6c473],0x0        # 19e3dd0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x800>
      a7795c:	00 
      a7795d:	74 33                	je     a77992 <JNI_OnLoad@@Base+0x411a>
      a7795f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a77962:	48 89 df             	mov    rdi,rbx

### 0xa77940 slot +0x108; FDE=(10958968, 10979123)
      a77904:	48 89 df             	mov    rdi,rbx
      a77907:	4c 89 fe             	mov    rsi,r15
      a7790a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a77910:	48 89 05 b1 c4 f6 00 	mov    QWORD PTR [rip+0xf6c4b1],rax        # 19e3dc8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7f8>
      a77917:	48 89 df             	mov    rdi,rbx
      a7791a:	e8 c9 d2 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a7791f:	48 83 3d a1 c4 f6 00 	cmp    QWORD PTR [rip+0xf6c4a1],0x0        # 19e3dc8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7f8>
      a77926:	00 
      a77927:	74 60                	je     a77989 <JNI_OnLoad@@Base+0x4111>
      a77929:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a7792c:	48 8d 15 0a a7 8e ff 	lea    rdx,[rip+0xffffffffff8ea70a]        # 36203d <_ZTSSt12bad_any_cast@@Base-0x2e18b>
      a77933:	48 8d 0d 04 5c 8b ff 	lea    rcx,[rip+0xffffffffff8b5c04]        # 32d53e <_ZTSSt12bad_any_cast@@Base-0x62c8a>
      a7793a:	48 89 df             	mov    rdi,rbx
      a7793d:	4c 89 fe             	mov    rsi,r15
      a77940:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a77946:	48 89 05 83 c4 f6 00 	mov    QWORD PTR [rip+0xf6c483],rax        # 19e3dd0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x800>
      a7794d:	48 89 df             	mov    rdi,rbx
      a77950:	e8 93 d2 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a77955:	48 83 3d 73 c4 f6 00 	cmp    QWORD PTR [rip+0xf6c473],0x0        # 19e3dd0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x800>
      a7795c:	00 
      a7795d:	74 33                	je     a77992 <JNI_OnLoad@@Base+0x411a>
      a7795f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a77962:	48 89 df             	mov    rdi,rbx
      a77965:	4c 89 fe             	mov    rsi,r15
      a77968:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a7796e:	48 89 05 63 c4 f6 00 	mov    QWORD PTR [rip+0xf6c463],rax        # 19e3dd8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x808>
      a77975:	eb 2a                	jmp    a779a1 <JNI_OnLoad@@Base+0x4129>
      a77977:	48 8d 35 df 82 8f ff 	lea    rsi,[rip+0xffffffffff8f82df]        # 36fc5d <_ZTSSt12bad_any_cast@@Base-0x2056b>
      a7797e:	eb 19                	jmp    a77999 <JNI_OnLoad@@Base+0x4121>
      a77980:	48 8d 35 da 99 8b ff 	lea    rsi,[rip+0xffffffffff8b99da]        # 331361 <_ZTSSt12bad_any_cast@@Base-0x5ee67>
      a77987:	eb 10                	jmp    a77999 <JNI_OnLoad@@Base+0x4121>
      a77989:	48 8d 35 59 7d 90 ff 	lea    rsi,[rip+0xffffffffff907d59]        # 37f6e9 <_ZTSSt12bad_any_cast@@Base-0x10adf>
      a77990:	eb 07                	jmp    a77999 <JNI_OnLoad@@Base+0x4121>
      a77992:	48 8d 35 e9 4d 8f ff 	lea    rsi,[rip+0xffffffffff8f4de9]        # 36c782 <_ZTSSt12bad_any_cast@@Base-0x23a46>
      a77999:	48 89 df             	mov    rdi,rbx

### 0xa77a10 slot +0x108; FDE=(10958968, 10979123)
      a779d8:	4c 89 e2             	mov    rdx,r12
      a779db:	e8 93 ca d5 00       	call   17d4473 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x294>
      a779e0:	4c 89 e7             	mov    rdi,r12
      a779e3:	e8 a8 64 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a779e8:	48 89 df             	mov    rdi,rbx
      a779eb:	e8 f8 d1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a779f0:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]
      a779f4:	4d 85 ff             	test   r15,r15
      a779f7:	74 4e                	je     a77a47 <JNI_OnLoad@@Base+0x41cf>
      a779f9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a779fc:	48 8d 15 fc 45 8f ff 	lea    rdx,[rip+0xffffffffff8f45fc]        # 36bfff <_ZTSSt12bad_any_cast@@Base-0x241c9>
      a77a03:	48 8d 0d cb 78 8d ff 	lea    rcx,[rip+0xffffffffff8d78cb]        # 34f2d5 <_ZTSSt12bad_any_cast@@Base-0x40ef3>
      a77a0a:	48 89 df             	mov    rdi,rbx
      a77a0d:	4c 89 fe             	mov    rsi,r15
      a77a10:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      a77a16:	48 89 05 83 c3 f6 00 	mov    QWORD PTR [rip+0xf6c383],rax        # 19e3da0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7d0>
      a77a1d:	48 89 df             	mov    rdi,rbx
      a77a20:	e8 c3 d1 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a77a25:	48 83 3d 73 c3 f6 00 	cmp    QWORD PTR [rip+0xf6c373],0x0        # 19e3da0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7d0>
      a77a2c:	00 
      a77a2d:	74 21                	je     a77a50 <JNI_OnLoad@@Base+0x41d8>
      a77a2f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a77a32:	48 89 df             	mov    rdi,rbx
      a77a35:	4c 89 fe             	mov    rsi,r15
      a77a38:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a77a3e:	48 89 05 63 c3 f6 00 	mov    QWORD PTR [rip+0xf6c363],rax        # 19e3da8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7d8>
      a77a45:	eb 18                	jmp    a77a5f <JNI_OnLoad@@Base+0x41e7>
      a77a47:	48 8d 35 9b b4 8f ff 	lea    rsi,[rip+0xffffffffff8fb49b]        # 372ee9 <_ZTSSt12bad_any_cast@@Base-0x1d2df>
      a77a4e:	eb 07                	jmp    a77a57 <JNI_OnLoad@@Base+0x41df>
      a77a50:	48 8d 35 3f 7c 90 ff 	lea    rsi,[rip+0xffffffffff907c3f]        # 37f696 <_ZTSSt12bad_any_cast@@Base-0x10b32>
      a77a57:	48 89 df             	mov    rdi,rbx
      a77a5a:	e8 f5 d7 d5 00       	call   17d5254 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1075>
      a77a5f:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      a77a66:	00 
      a77a67:	e8 5a e2 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>

### 0xa77b16 slot +0x108; FDE=(10958968, 10979123)
      a77ad8:	84 c0                	test   al,al
      a77ada:	0f 84 34 02 00 00    	je     a77d14 <JNI_OnLoad@@Base+0x449c>
      a77ae0:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a77ae3:	48 89 df             	mov    rdi,rbx
      a77ae6:	4c 89 fe             	mov    rsi,r15
      a77ae9:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a77aef:	48 89 05 7a c2 f6 00 	mov    QWORD PTR [rip+0xf6c27a],rax        # 19e3d70 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7a0>
      a77af6:	48 85 c0             	test   rax,rax
      a77af9:	0f 84 78 02 00 00    	je     a77d77 <JNI_OnLoad@@Base+0x44ff>
      a77aff:	4c 8b 03             	mov    r8,QWORD PTR [rbx]
      a77b02:	48 8d 15 f6 44 8f ff 	lea    rdx,[rip+0xffffffffff8f44f6]        # 36bfff <_ZTSSt12bad_any_cast@@Base-0x241c9>
      a77b09:	48 8d 0d 64 a4 9d ff 	lea    rcx,[rip+0xffffffffff9da464]        # 451f74 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b80>
      a77b10:	48 89 df             	mov    rdi,rbx
      a77b13:	48 89 c6             	mov    rsi,rax
      a77b16:	41 ff 90 08 01 00 00 	call   QWORD PTR [r8+0x108]
      a77b1d:	48 89 05 54 c2 f6 00 	mov    QWORD PTR [rip+0xf6c254],rax        # 19e3d78 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7a8>
      a77b24:	48 89 df             	mov    rdi,rbx
      a77b27:	e8 bc d0 d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a77b2c:	48 83 3d 44 c2 f6 00 	cmp    QWORD PTR [rip+0xf6c244],0x0        # 19e3d78 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7a8>
      a77b33:	00 
      a77b34:	0f 84 a0 02 00 00    	je     a77dda <JNI_OnLoad@@Base+0x4562>
      a77b3a:	48 8b 35 2f c2 f6 00 	mov    rsi,QWORD PTR [rip+0xf6c22f]        # 19e3d70 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7a0>
      a77b41:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a77b44:	48 8d 15 ad 1b 9b ff 	lea    rdx,[rip+0xffffffffff9b1bad]        # 4296f8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x4f147>
      a77b4b:	48 8d 0d c7 e3 8f ff 	lea    rcx,[rip+0xffffffffff8fe3c7]        # 375f19 <_ZTSSt12bad_any_cast@@Base-0x1a2af>
      a77b52:	48 89 df             	mov    rdi,rbx
      a77b55:	ff 90 f0 02 00 00    	call   QWORD PTR [rax+0x2f0]
      a77b5b:	48 89 05 1e c2 f6 00 	mov    QWORD PTR [rip+0xf6c21e],rax        # 19e3d80 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7b0>
      a77b62:	48 8b 35 07 c2 f6 00 	mov    rsi,QWORD PTR [rip+0xf6c207]        # 19e3d70 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7a0>
      a77b69:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a77b6c:	48 8d 15 35 0c 8e ff 	lea    rdx,[rip+0xffffffffff8e0c35]        # 3587a8 <_ZTSSt12bad_any_cast@@Base-0x37a20>
      a77b73:	48 8d 0d 3b 46 8d ff 	lea    rcx,[rip+0xffffffffff8d463b]        # 34c1b5 <_ZTSSt12bad_any_cast@@Base-0x44013>
      a77b7a:	48 89 df             	mov    rdi,rbx
      a77b7d:	ff 90 f0 02 00 00    	call   QWORD PTR [rax+0x2f0]
      a77b83:	48 89 05 fe c1 f6 00 	mov    QWORD PTR [rip+0xf6c1fe],rax        # 19e3d88 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7b8>

### 0xa77c2a slot +0x108; FDE=(10958968, 10979123)
      a77be9:	49 8b 74 24 08       	mov    rsi,QWORD PTR [r12+0x8]
      a77bee:	48 85 f6             	test   rsi,rsi
      a77bf1:	0f 84 dd 03 00 00    	je     a77fd4 <JNI_OnLoad@@Base+0x475c>
      a77bf7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      a77bfa:	48 89 df             	mov    rdi,rbx
      a77bfd:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      a77c03:	48 89 05 86 c1 f6 00 	mov    QWORD PTR [rip+0xf6c186],rax        # 19e3d90 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7c0>
      a77c0a:	48 85 c0             	test   rax,rax
      a77c0d:	0f 84 21 04 00 00    	je     a78034 <JNI_OnLoad@@Base+0x47bc>
      a77c13:	4c 8b 03             	mov    r8,QWORD PTR [rbx]
      a77c16:	48 8d 15 22 2b 8b ff 	lea    rdx,[rip+0xffffffffff8b2b22]        # 32a73f <_ZTSSt12bad_any_cast@@Base-0x65a89>
      a77c1d:	48 8d 0d 5d 99 90 ff 	lea    rcx,[rip+0xffffffffff90995d]        # 381581 <_ZTSSt12bad_any_cast@@Base-0xec47>
      a77c24:	48 89 df             	mov    rdi,rbx
      a77c27:	48 89 c6             	mov    rsi,rax
      a77c2a:	41 ff 90 08 01 00 00 	call   QWORD PTR [r8+0x108]
      a77c31:	48 89 05 60 c1 f6 00 	mov    QWORD PTR [rip+0xf6c160],rax        # 19e3d98 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7c8>
      a77c38:	48 89 df             	mov    rdi,rbx
      a77c3b:	e8 a8 cf d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      a77c40:	48 83 3d 50 c1 f6 00 	cmp    QWORD PTR [rip+0xf6c150],0x0        # 19e3d98 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7c8>
      a77c47:	00 
      a77c48:	0f 85 54 04 00 00    	jne    a780a2 <JNI_OnLoad@@Base+0x482a>
      a77c4e:	0f 57 c0             	xorps  xmm0,xmm0
      a77c51:	4c 8d bc 24 60 01 00 	lea    r15,[rsp+0x160]
      a77c58:	00 
      a77c59:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
      a77c5d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
      a77c62:	48 8d 35 93 58 8b ff 	lea    rsi,[rip+0xffffffffff8b5893]        # 32d4fc <_ZTSSt12bad_any_cast@@Base-0x62ccc>
      a77c69:	4c 89 ff             	mov    rdi,r15
      a77c6c:	e8 81 e3 d5 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
      a77c71:	48 8d 35 29 76 8d ff 	lea    rsi,[rip+0xffffffffff8d7629]        # 34f2a1 <_ZTSSt12bad_any_cast@@Base-0x40f27>
      a77c78:	4c 89 ff             	mov    rdi,r15
      a77c7b:	e8 72 e3 d5 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
      a77c80:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      a77c87:	00 
      a77c88:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1

### 0xaa2b6f slot +0x108; FDE=(11146264, 11168470)
      aa2b35:	e8 98 3d d3 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      aa2b3a:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      aa2b41:	00 00 
      aa2b43:	e9 f8 09 00 00       	jmp    aa3540 <JNI_OnUnload@@Base+0x2ae0d>
      aa2b48:	31 db                	xor    ebx,ebx
      aa2b4a:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
      aa2b4f:	eb 53                	jmp    aa2ba4 <JNI_OnUnload@@Base+0x2a471>
      aa2b51:	48 8d 94 24 31 10 00 	lea    rdx,[rsp+0x1031]
      aa2b58:	00 
      aa2b59:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
      aa2b5e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      aa2b62:	48 8d 0d 18 ba 8c ff 	lea    rcx,[rip+0xffffffffff8cba18]        # 36e581 <_ZTSSt12bad_any_cast@@Base-0x21c47>
      aa2b69:	4c 89 e7             	mov    rdi,r12
      aa2b6c:	4c 89 f6             	mov    rsi,r14
      aa2b6f:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa2b75:	49 89 c6             	mov    r14,rax
      aa2b78:	4c 89 e7             	mov    rdi,r12
      aa2b7b:	e8 68 20 d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa2b80:	4d 85 f6             	test   r14,r14
      aa2b83:	74 1d                	je     aa2ba2 <JNI_OnUnload@@Base+0x2a46f>
      aa2b85:	4c 89 e7             	mov    rdi,r12
      aa2b88:	48 89 de             	mov    rsi,rbx
      aa2b8b:	4c 89 f2             	mov    rdx,r14
      aa2b8e:	31 c0                	xor    eax,eax
      aa2b90:	e8 7f 25 02 00       	call   ac5114 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120b4>
      aa2b95:	48 89 c3             	mov    rbx,rax
      aa2b98:	4c 89 e7             	mov    rdi,r12
      aa2b9b:	e8 48 20 d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa2ba0:	eb 02                	jmp    aa2ba4 <JNI_OnUnload@@Base+0x2a471>
      aa2ba2:	31 db                	xor    ebx,ebx
      aa2ba4:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
      aa2bab:	00 
      aa2bac:	e8 15 31 d3 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      aa2bb1:	4c 89 a4 24 90 02 00 	mov    QWORD PTR [rsp+0x290],r12
      aa2bb8:	00 

### 0xaa2c23 slot +0x108; FDE=(11146264, 11168470)
      aa2be7:	49 89 c6             	mov    r14,rax
      aa2bea:	4c 89 a4 24 10 08 00 	mov    QWORD PTR [rsp+0x810],r12
      aa2bf1:	00 
      aa2bf2:	48 89 84 24 18 08 00 	mov    QWORD PTR [rsp+0x818],rax
      aa2bf9:	00 
      aa2bfa:	4c 89 e7             	mov    rdi,r12
      aa2bfd:	e8 e6 1f d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa2c02:	4d 85 f6             	test   r14,r14
      aa2c05:	0f 84 a5 02 00 00    	je     aa2eb0 <JNI_OnUnload@@Base+0x2a77d>
      aa2c0b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      aa2c0f:	48 8d 15 77 1c 8e ff 	lea    rdx,[rip+0xffffffffff8e1c77]        # 38488d <_ZTSSt12bad_any_cast@@Base-0xb93b>
      aa2c16:	48 8d 0d 89 fd 8c ff 	lea    rcx,[rip+0xffffffffff8cfd89]        # 3729a6 <_ZTSSt12bad_any_cast@@Base-0x1d822>
      aa2c1d:	4c 89 e7             	mov    rdi,r12
      aa2c20:	4c 89 f6             	mov    rsi,r14
      aa2c23:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa2c29:	49 89 c7             	mov    r15,rax
      aa2c2c:	4c 89 e7             	mov    rdi,r12
      aa2c2f:	e8 b4 1f d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa2c34:	4d 85 ff             	test   r15,r15
      aa2c37:	0f 84 73 02 00 00    	je     aa2eb0 <JNI_OnUnload@@Base+0x2a77d>
      aa2c3d:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      aa2c41:	48 8d 15 3d 4c 8a ff 	lea    rdx,[rip+0xffffffffff8a4c3d]        # 347885 <_ZTSSt12bad_any_cast@@Base-0x48943>
      aa2c48:	48 8d 0d 9a 9a 88 ff 	lea    rcx,[rip+0xffffffffff889a9a]        # 32c6e9 <_ZTSSt12bad_any_cast@@Base-0x63adf>
      aa2c4f:	4c 89 e7             	mov    rdi,r12
      aa2c52:	4c 89 f6             	mov    rsi,r14
      aa2c55:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa2c5b:	49 89 c6             	mov    r14,rax
      aa2c5e:	4c 89 e7             	mov    rdi,r12
      aa2c61:	e8 82 1f d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa2c66:	4d 85 f6             	test   r14,r14
      aa2c69:	0f 84 41 02 00 00    	je     aa2eb0 <JNI_OnUnload@@Base+0x2a77d>
      aa2c6f:	4c 89 e7             	mov    rdi,r12
      aa2c72:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx
      aa2c77:	48 89 de             	mov    rsi,rbx
      aa2c7a:	4c 89 fa             	mov    rdx,r15

### 0xaa2c55 slot +0x108; FDE=(11146264, 11168470)
      aa2c16:	48 8d 0d 89 fd 8c ff 	lea    rcx,[rip+0xffffffffff8cfd89]        # 3729a6 <_ZTSSt12bad_any_cast@@Base-0x1d822>
      aa2c1d:	4c 89 e7             	mov    rdi,r12
      aa2c20:	4c 89 f6             	mov    rsi,r14
      aa2c23:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa2c29:	49 89 c7             	mov    r15,rax
      aa2c2c:	4c 89 e7             	mov    rdi,r12
      aa2c2f:	e8 b4 1f d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa2c34:	4d 85 ff             	test   r15,r15
      aa2c37:	0f 84 73 02 00 00    	je     aa2eb0 <JNI_OnUnload@@Base+0x2a77d>
      aa2c3d:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      aa2c41:	48 8d 15 3d 4c 8a ff 	lea    rdx,[rip+0xffffffffff8a4c3d]        # 347885 <_ZTSSt12bad_any_cast@@Base-0x48943>
      aa2c48:	48 8d 0d 9a 9a 88 ff 	lea    rcx,[rip+0xffffffffff889a9a]        # 32c6e9 <_ZTSSt12bad_any_cast@@Base-0x63adf>
      aa2c4f:	4c 89 e7             	mov    rdi,r12
      aa2c52:	4c 89 f6             	mov    rsi,r14
      aa2c55:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa2c5b:	49 89 c6             	mov    r14,rax
      aa2c5e:	4c 89 e7             	mov    rdi,r12
      aa2c61:	e8 82 1f d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa2c66:	4d 85 f6             	test   r14,r14
      aa2c69:	0f 84 41 02 00 00    	je     aa2eb0 <JNI_OnUnload@@Base+0x2a77d>
      aa2c6f:	4c 89 e7             	mov    rdi,r12
      aa2c72:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx
      aa2c77:	48 89 de             	mov    rsi,rbx
      aa2c7a:	4c 89 fa             	mov    rdx,r15
      aa2c7d:	31 c0                	xor    eax,eax
      aa2c7f:	e8 fa 0e 01 00       	call   ab3b7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1e>
      aa2c84:	89 c5                	mov    ebp,eax
      aa2c86:	4c 89 e7             	mov    rdi,r12
      aa2c89:	e8 5a 1f d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa2c8e:	85 ed                	test   ebp,ebp
      aa2c90:	0f 88 1a 02 00 00    	js     aa2eb0 <JNI_OnUnload@@Base+0x2a77d>
      aa2c96:	66 0f ef c0          	pxor   xmm0,xmm0
      aa2c9a:	66 0f 7f 84 24 30 10 	movdqa XMMWORD PTR [rsp+0x1030],xmm0
      aa2ca1:	00 00 
      aa2ca3:	48 83 a4 24 40 10 00 	and    QWORD PTR [rsp+0x1040],0x0

### 0xaa2f65 slot +0x108; FDE=(11146264, 11168470)
      aa2f29:	4c 89 bc 24 70 02 00 	mov    QWORD PTR [rsp+0x270],r15
      aa2f30:	00 
      aa2f31:	48 89 84 24 78 02 00 	mov    QWORD PTR [rsp+0x278],rax
      aa2f38:	00 
      aa2f39:	4c 89 ff             	mov    rdi,r15
      aa2f3c:	e8 a7 1c d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa2f41:	4d 85 f6             	test   r14,r14
      aa2f44:	0f 84 75 05 00 00    	je     aa34bf <JNI_OnUnload@@Base+0x2ad8c>
      aa2f4a:	48 8b 5d 08          	mov    rbx,QWORD PTR [rbp+0x8]
      aa2f4e:	49 8b 07             	mov    rax,QWORD PTR [r15]
      aa2f51:	4c 89 ff             	mov    rdi,r15
      aa2f54:	4c 89 f6             	mov    rsi,r14
      aa2f57:	48 8d 15 f3 50 8e ff 	lea    rdx,[rip+0xffffffffff8e50f3]        # 388051 <_ZTSSt12bad_any_cast@@Base-0x8177>
      aa2f5e:	48 8d 0d 1c e6 8d ff 	lea    rcx,[rip+0xffffffffff8de61c]        # 381581 <_ZTSSt12bad_any_cast@@Base-0xec47>
      aa2f65:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa2f6b:	49 89 c6             	mov    r14,rax
      aa2f6e:	4c 89 ff             	mov    rdi,r15
      aa2f71:	e8 72 1c d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa2f76:	4d 85 f6             	test   r14,r14
      aa2f79:	0f 84 01 01 00 00    	je     aa3080 <JNI_OnUnload@@Base+0x2a94d>
      aa2f7f:	4c 89 ff             	mov    rdi,r15
      aa2f82:	48 89 de             	mov    rsi,rbx
      aa2f85:	4c 89 f2             	mov    rdx,r14
      aa2f88:	31 c0                	xor    eax,eax
      aa2f8a:	e8 85 21 02 00       	call   ac5114 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120b4>
      aa2f8f:	48 89 c3             	mov    rbx,rax
      aa2f92:	4c 89 bc 24 70 21 00 	mov    QWORD PTR [rsp+0x2170],r15
      aa2f99:	00 
      aa2f9a:	48 89 84 24 78 21 00 	mov    QWORD PTR [rsp+0x2178],rax
      aa2fa1:	00 
      aa2fa2:	4c 89 ff             	mov    rdi,r15
      aa2fa5:	e8 3e 1c d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa2faa:	48 85 db             	test   rbx,rbx
      aa2fad:	0f 84 e2 00 00 00    	je     aa3095 <JNI_OnUnload@@Base+0x2a962>
      aa2fb3:	49 8b 07             	mov    rax,QWORD PTR [r15]

### 0xaa31ba slot +0x108; FDE=(11146264, 11168470)
      aa317a:	48 8d bc 24 70 21 00 	lea    rdi,[rsp+0x2170]
      aa3181:	00 
      aa3182:	e8 3f 2b d3 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      aa3187:	80 bc 24 90 10 00 00 	cmp    BYTE PTR [rsp+0x1090],0x0
      aa318e:	00 
      aa318f:	0f 84 58 02 00 00    	je     aa33ed <JNI_OnUnload@@Base+0x2acba>
      aa3195:	48 8b b4 24 78 02 00 	mov    rsi,QWORD PTR [rsp+0x278]
      aa319c:	00 
      aa319d:	48 8b 5d 08          	mov    rbx,QWORD PTR [rbp+0x8]
      aa31a1:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
      aa31a6:	49 8b 07             	mov    rax,QWORD PTR [r15]
      aa31a9:	4c 89 ff             	mov    rdi,r15
      aa31ac:	48 8d 15 49 80 8c ff 	lea    rdx,[rip+0xffffffffff8c8049]        # 36b1fc <_ZTSSt12bad_any_cast@@Base-0x24fcc>
      aa31b3:	48 8d 0d b3 4e 8e ff 	lea    rcx,[rip+0xffffffffff8e4eb3]        # 38806d <_ZTSSt12bad_any_cast@@Base-0x815b>
      aa31ba:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa31c0:	49 89 c6             	mov    r14,rax
      aa31c3:	4c 89 ff             	mov    rdi,r15
      aa31c6:	e8 1d 1a d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa31cb:	4d 85 f6             	test   r14,r14
      aa31ce:	0f 84 19 02 00 00    	je     aa33ed <JNI_OnUnload@@Base+0x2acba>
      aa31d4:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
      aa31d9:	4c 89 ff             	mov    rdi,r15
      aa31dc:	48 89 de             	mov    rsi,rbx
      aa31df:	4c 89 f2             	mov    rdx,r14
      aa31e2:	31 c0                	xor    eax,eax
      aa31e4:	e8 2b 1f 02 00       	call   ac5114 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120b4>
      aa31e9:	48 89 c3             	mov    rbx,rax
      aa31ec:	4c 89 bc 24 10 08 00 	mov    QWORD PTR [rsp+0x810],r15
      aa31f3:	00 
      aa31f4:	48 89 84 24 18 08 00 	mov    QWORD PTR [rsp+0x818],rax
      aa31fb:	00 
      aa31fc:	4c 89 ff             	mov    rdi,r15
      aa31ff:	e8 e4 19 d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa3204:	48 85 db             	test   rbx,rbx
      aa3207:	74 1d                	je     aa3226 <JNI_OnUnload@@Base+0x2aaf3>

### 0xaa4c22 slot +0x108; FDE=(11146264, 11168470)
      aa4bdf:	0f 85 d2 00 00 00    	jne    aa4cb7 <JNI_OnUnload@@Base+0x2c584>
      aa4be5:	48 89 df             	mov    rdi,rbx
      aa4be8:	4c 89 f6             	mov    rsi,r14
      aa4beb:	ff 91 a8 00 00 00    	call   QWORD PTR [rcx+0xa8]
      aa4bf1:	48 89 05 98 ea f3 00 	mov    QWORD PTR [rip+0xf3ea98],rax        # 19e3690 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc0>
      aa4bf8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      aa4bfb:	48 89 df             	mov    rdi,rbx
      aa4bfe:	4c 89 f6             	mov    rsi,r14
      aa4c01:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
      aa4c07:	48 8b 35 82 ea f3 00 	mov    rsi,QWORD PTR [rip+0xf3ea82]        # 19e3690 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc0>
      aa4c0e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      aa4c11:	48 8d 15 9a 37 8d ff 	lea    rdx,[rip+0xffffffffff8d379a]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      aa4c18:	48 8d 0d 01 db 8d ff 	lea    rcx,[rip+0xffffffffff8ddb01]        # 382720 <_ZTSSt12bad_any_cast@@Base-0xdaa8>
      aa4c1f:	48 89 df             	mov    rdi,rbx
      aa4c22:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa4c28:	48 89 05 69 ea f3 00 	mov    QWORD PTR [rip+0xf3ea69],rax        # 19e3698 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc8>
      aa4c2f:	48 8b 35 5a ea f3 00 	mov    rsi,QWORD PTR [rip+0xf3ea5a]        # 19e3690 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc0>
      aa4c36:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      aa4c39:	48 8d 15 90 eb 8d ff 	lea    rdx,[rip+0xffffffffff8deb90]        # 3837d0 <_ZTSSt12bad_any_cast@@Base-0xc9f8>
      aa4c40:	48 8d 0d 2d d3 9a ff 	lea    rcx,[rip+0xffffffffff9ad32d]        # 451f74 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b80>
      aa4c47:	48 89 df             	mov    rdi,rbx
      aa4c4a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa4c50:	48 89 05 49 ea f3 00 	mov    QWORD PTR [rip+0xf3ea49],rax        # 19e36a0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xd0>
      aa4c57:	48 8b 35 32 ea f3 00 	mov    rsi,QWORD PTR [rip+0xf3ea32]        # 19e3690 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc0>
      aa4c5e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      aa4c61:	48 8d 15 c8 3f e1 00 	lea    rdx,[rip+0xe13fc8]        # 18b8c30 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40>
      aa4c68:	6a 06                	push   0x6
      aa4c6a:	59                   	pop    rcx
      aa4c6b:	48 89 df             	mov    rdi,rbx
      aa4c6e:	ff 90 b8 06 00 00    	call   QWORD PTR [rax+0x6b8]
      aa4c74:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      aa4c77:	48 89 df             	mov    rdi,rbx
      aa4c7a:	ff 90 20 07 00 00    	call   QWORD PTR [rax+0x720]
      aa4c80:	84 c0                	test   al,al
      aa4c82:	74 57                	je     aa4cdb <JNI_OnUnload@@Base+0x2c5a8>

### 0xaa4c4a slot +0x108; FDE=(11146264, 11168470)
      aa4bfe:	4c 89 f6             	mov    rsi,r14
      aa4c01:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
      aa4c07:	48 8b 35 82 ea f3 00 	mov    rsi,QWORD PTR [rip+0xf3ea82]        # 19e3690 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc0>
      aa4c0e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      aa4c11:	48 8d 15 9a 37 8d ff 	lea    rdx,[rip+0xffffffffff8d379a]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      aa4c18:	48 8d 0d 01 db 8d ff 	lea    rcx,[rip+0xffffffffff8ddb01]        # 382720 <_ZTSSt12bad_any_cast@@Base-0xdaa8>
      aa4c1f:	48 89 df             	mov    rdi,rbx
      aa4c22:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa4c28:	48 89 05 69 ea f3 00 	mov    QWORD PTR [rip+0xf3ea69],rax        # 19e3698 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc8>
      aa4c2f:	48 8b 35 5a ea f3 00 	mov    rsi,QWORD PTR [rip+0xf3ea5a]        # 19e3690 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc0>
      aa4c36:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      aa4c39:	48 8d 15 90 eb 8d ff 	lea    rdx,[rip+0xffffffffff8deb90]        # 3837d0 <_ZTSSt12bad_any_cast@@Base-0xc9f8>
      aa4c40:	48 8d 0d 2d d3 9a ff 	lea    rcx,[rip+0xffffffffff9ad32d]        # 451f74 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b80>
      aa4c47:	48 89 df             	mov    rdi,rbx
      aa4c4a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa4c50:	48 89 05 49 ea f3 00 	mov    QWORD PTR [rip+0xf3ea49],rax        # 19e36a0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xd0>
      aa4c57:	48 8b 35 32 ea f3 00 	mov    rsi,QWORD PTR [rip+0xf3ea32]        # 19e3690 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc0>
      aa4c5e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      aa4c61:	48 8d 15 c8 3f e1 00 	lea    rdx,[rip+0xe13fc8]        # 18b8c30 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40>
      aa4c68:	6a 06                	push   0x6
      aa4c6a:	59                   	pop    rcx
      aa4c6b:	48 89 df             	mov    rdi,rbx
      aa4c6e:	ff 90 b8 06 00 00    	call   QWORD PTR [rax+0x6b8]
      aa4c74:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      aa4c77:	48 89 df             	mov    rdi,rbx
      aa4c7a:	ff 90 20 07 00 00    	call   QWORD PTR [rax+0x720]
      aa4c80:	84 c0                	test   al,al
      aa4c82:	74 57                	je     aa4cdb <JNI_OnUnload@@Base+0x2c5a8>
      aa4c84:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      aa4c87:	48 89 df             	mov    rdi,rbx
      aa4c8a:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
      aa4c90:	48 8d 35 9e e0 8c ff 	lea    rsi,[rip+0xffffffffff8ce09e]        # 372d35 <_ZTSSt12bad_any_cast@@Base-0x1d493>
      aa4c97:	48 8d 0d ae 48 8e ff 	lea    rcx,[rip+0xffffffffff8e48ae]        # 38954c <_ZTSSt12bad_any_cast@@Base-0x6c7c>
      aa4c9e:	6a 03                	push   0x3
      aa4ca0:	5f                   	pop    rdi

### 0xaa5d01 slot +0x148; FDE=(11146264, 11168470)
      aa5ccc:	48 8b bc 24 38 10 00 	mov    rdi,QWORD PTR [rsp+0x1038]
      aa5cd3:	00 
      aa5cd4:	e8 ad 87 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      aa5cd9:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      aa5cde:	e8 a1 0f 00 00       	call   aa6c84 <JNI_OnUnload@@Base+0x2e551>
      aa5ce3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      aa5ce6:	48 8d bc 24 30 10 00 	lea    rdi,[rsp+0x1030]
      aa5ced:	00 
      aa5cee:	48 89 c6             	mov    rsi,rax
      aa5cf1:	ff 51 60             	call   QWORD PTR [rcx+0x60]
      aa5cf4:	48 8b bc 24 30 10 00 	mov    rdi,QWORD PTR [rsp+0x1030]
      aa5cfb:	00 
      aa5cfc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      aa5cff:	31 f6                	xor    esi,esi
      aa5d01:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
      aa5d07:	48 8b bc 24 38 10 00 	mov    rdi,QWORD PTR [rsp+0x1038]
      aa5d0e:	00 
      aa5d0f:	e8 72 87 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      aa5d14:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      aa5d19:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      aa5d1c:	6a 41                	push   0x41
      aa5d1e:	5e                   	pop    rsi
      aa5d1f:	ff 50 40             	call   QWORD PTR [rax+0x40]
      aa5d22:	48 85 c0             	test   rax,rax
      aa5d25:	0f 84 db 01 00 00    	je     aa5f06 <JNI_OnUnload@@Base+0x2d7d3>
      aa5d2b:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      aa5d2e:	48 89 c7             	mov    rdi,rax
      aa5d31:	ff 51 28             	call   QWORD PTR [rcx+0x28]
      aa5d34:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      aa5d37:	48 89 c7             	mov    rdi,rax
      aa5d3a:	ff 51 10             	call   QWORD PTR [rcx+0x10]
      aa5d3d:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      aa5d44:	00 
      aa5d45:	e8 94 0e 00 00       	call   aa6bde <JNI_OnUnload@@Base+0x2e4ab>
      aa5d4a:	48 8d bc 24 80 07 00 	lea    rdi,[rsp+0x780]

### 0xaa709b slot +0x108; FDE=(11169834, 11170070)
      aa7062:	4c 89 fe             	mov    rsi,r15
      aa7065:	ff 90 f8 00 00 00    	call   QWORD PTR [rax+0xf8]
      aa706b:	49 89 c4             	mov    r12,rax
      aa706e:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
      aa7072:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      aa7077:	4c 89 f7             	mov    rdi,r14
      aa707a:	e8 69 db d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa707f:	4d 85 e4             	test   r12,r12
      aa7082:	74 45                	je     aa70c9 <JNI_OnUnload@@Base+0x2e996>
      aa7084:	49 8b 06             	mov    rax,QWORD PTR [r14]
      aa7087:	48 8d 15 69 40 8a ff 	lea    rdx,[rip+0xffffffffff8a4069]        # 34b0f7 <_ZTSSt12bad_any_cast@@Base-0x450d1>
      aa708e:	48 8d 0d df ae 9a ff 	lea    rcx,[rip+0xffffffffff9aaedf]        # 451f74 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b80>
      aa7095:	4c 89 f7             	mov    rdi,r14
      aa7098:	4c 89 e6             	mov    rsi,r12
      aa709b:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa70a1:	49 89 c4             	mov    r12,rax
      aa70a4:	4c 89 f7             	mov    rdi,r14
      aa70a7:	e8 3c db d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa70ac:	4d 85 e4             	test   r12,r12
      aa70af:	74 18                	je     aa70c9 <JNI_OnUnload@@Base+0x2e996>
      aa70b1:	4c 89 f7             	mov    rdi,r14
      aa70b4:	4c 89 fe             	mov    rsi,r15
      aa70b7:	4c 89 e2             	mov    rdx,r12
      aa70ba:	31 c0                	xor    eax,eax
      aa70bc:	e8 63 5b ff ff       	call   a9cc24 <JNI_OnUnload@@Base+0x244f1>
      aa70c1:	4c 89 f7             	mov    rdi,r14
      aa70c4:	e8 1f db d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa70c9:	48 89 e7             	mov    rdi,rsp
      aa70cc:	e8 f5 eb d2 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      aa70d1:	48 83 c3 08          	add    rbx,0x8
      aa70d5:	48 89 df             	mov    rdi,rbx
      aa70d8:	e8 27 dc 00 00       	call   ab4d04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ca4>
      aa70dd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      aa70e4:	00 00 
      aa70e6:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]

### 0xaacaea slot +0x1a8; FDE=(11190071, 11193682)
      aacab3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      aacab6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      aacab9:	48 89 df             	mov    rdi,rbx
      aacabc:	e8 0d 06 00 00       	call   aad0ce <JNI_OnUnload@@Base+0x3499b>
      aacac1:	4c 89 ff             	mov    rdi,r15
      aacac4:	e8 41 06 00 00       	call   aad10a <JNI_OnUnload@@Base+0x349d7>
      aacac9:	49 83 c6 30          	add    r14,0x30
      aacacd:	49 39 ee             	cmp    r14,rbp
      aacad0:	0f 85 98 fe ff ff    	jne    aac96e <JNI_OnUnload@@Base+0x3423b>
      aacad6:	4c 8b 74 24 30       	mov    r14,QWORD PTR [rsp+0x30]
      aacadb:	49 8b 06             	mov    rax,QWORD PTR [r14]
      aacade:	48 8b 78 30          	mov    rdi,QWORD PTR [rax+0x30]
      aacae2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      aacae5:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
      aacaea:	ff 90 a8 01 00 00    	call   QWORD PTR [rax+0x1a8]
      aacaf0:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      aacaf5:	48 8b 00             	mov    rax,QWORD PTR [rax]
      aacaf8:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
      aacaff:	00 
      aacb00:	48 89 03             	mov    QWORD PTR [rbx],rax
      aacb03:	c6 43 04 11          	mov    BYTE PTR [rbx+0x4],0x11
      aacb07:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      aacb0a:	e8 df 01 a6 00       	call   150ccee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x352272>
      aacb0f:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      aacb12:	48 89 c7             	mov    rdi,rax
      aacb15:	48 89 de             	mov    rsi,rbx
      aacb18:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
      aacb1d:	ff 51 10             	call   QWORD PTR [rcx+0x10]
      aacb20:	4c 8b 74 24 78       	mov    r14,QWORD PTR [rsp+0x78]
      aacb25:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
      aacb2c:	00 
      aacb2d:	e8 34 05 00 00       	call   aad066 <JNI_OnUnload@@Base+0x34933>
      aacb32:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
      aacb39:	00 
      aacb3a:	e8 2b d4 fc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### 0xab37f5 slot +0x108; FDE=(11220858, 11221641)
      ab37bb:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ab37be:	48 89 df             	mov    rdi,rbx
      ab37c1:	48 89 ce             	mov    rsi,rcx
      ab37c4:	ff 90 f8 00 00 00    	call   QWORD PTR [rax+0xf8]
      ab37ca:	49 89 c4             	mov    r12,rax
      ab37cd:	48 89 df             	mov    rdi,rbx
      ab37d0:	e8 13 14 d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      ab37d5:	4d 85 e4             	test   r12,r12
      ab37d8:	0f 84 c0 01 00 00    	je     ab399e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x93e>
      ab37de:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ab37e1:	48 8d 15 e0 22 8d ff 	lea    rdx,[rip+0xffffffffff8d22e0]        # 385ac8 <_ZTSSt12bad_any_cast@@Base-0xa700>
      ab37e8:	48 8d 0d b7 f1 8b ff 	lea    rcx,[rip+0xffffffffff8bf1b7]        # 3729a6 <_ZTSSt12bad_any_cast@@Base-0x1d822>
      ab37ef:	48 89 df             	mov    rdi,rbx
      ab37f2:	4c 89 e6             	mov    rsi,r12
      ab37f5:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      ab37fb:	49 89 c4             	mov    r12,rax
      ab37fe:	48 89 df             	mov    rdi,rbx
      ab3801:	e8 e2 13 d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      ab3806:	4d 85 e4             	test   r12,r12
      ab3809:	0f 84 93 01 00 00    	je     ab39a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x942>
      ab380f:	48 89 df             	mov    rdi,rbx
      ab3812:	4c 89 fe             	mov    rsi,r15
      ab3815:	4c 89 e2             	mov    rdx,r12
      ab3818:	31 c0                	xor    eax,eax
      ab381a:	e8 5f 03 00 00       	call   ab3b7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1e>
      ab381f:	41 89 c7             	mov    r15d,eax
      ab3822:	48 89 df             	mov    rdi,rbx
      ab3825:	e8 be 13 d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      ab382a:	45 31 e4             	xor    r12d,r12d
      ab382d:	45 85 ff             	test   r15d,r15d
      ab3830:	41 0f 95 c5          	setne  r13b
      ab3834:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
      ab3838:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ab383b:	48 8d 7c 24 63       	lea    rdi,[rsp+0x63]
      ab3840:	89 ea                	mov    edx,ebp

### 0xab3957 slot +0x108; FDE=(11220858, 11221641)
      ab391a:	4c 89 e9             	mov    rcx,r13
      ab391d:	e8 5d 0c d2 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      ab3922:	4c 89 ef             	mov    rdi,r13
      ab3925:	e8 66 a5 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab392a:	48 89 df             	mov    rdi,rbx
      ab392d:	e8 b6 12 d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      ab3932:	4d 8b 7c 24 08       	mov    r15,QWORD PTR [r12+0x8]
      ab3937:	4d 85 ff             	test   r15,r15
      ab393a:	0f 84 d6 00 00 00    	je     ab3a16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b6>
      ab3940:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ab3943:	48 8d 15 b5 86 8b ff 	lea    rdx,[rip+0xffffffffff8b86b5]        # 36bfff <_ZTSSt12bad_any_cast@@Base-0x241c9>
      ab394a:	48 8d 0d 17 9e 87 ff 	lea    rcx,[rip+0xffffffffff879e17]        # 32d768 <_ZTSSt12bad_any_cast@@Base-0x62a60>
      ab3951:	48 89 df             	mov    rdi,rbx
      ab3954:	4c 89 fe             	mov    rsi,r15
      ab3957:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      ab395d:	49 89 c4             	mov    r12,rax
      ab3960:	48 89 df             	mov    rdi,rbx
      ab3963:	e8 80 12 d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      ab3968:	4d 85 e4             	test   r12,r12
      ab396b:	0f 84 b2 00 00 00    	je     ab3a23 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9c3>
      ab3971:	0f 57 c0             	xorps  xmm0,xmm0
      ab3974:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      ab3979:	48 89 df             	mov    rdi,rbx
      ab397c:	4c 89 fe             	mov    rsi,r15
      ab397f:	4c 89 e2             	mov    rdx,r12
      ab3982:	4c 89 f1             	mov    rcx,r14
      ab3985:	31 c0                	xor    eax,eax
      ab3987:	e8 b0 02 00 00       	call   ab3c3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdc>
      ab398c:	e9 9d 00 00 00       	jmp    ab3a2e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9ce>
      ab3991:	6a 01                	push   0x1
      ab3993:	5e                   	pop    rsi
      ab3994:	48 89 df             	mov    rdi,rbx
      ab3997:	e8 ed 00 00 00       	call   ab3a89 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa29>
      ab399c:	eb 0f                	jmp    ab39ad <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x94d>
      ab399e:	6a 02                	push   0x2

### 0xab3b03 slot +0x108; FDE=(11221641, 11221886)
      ab3aca:	4c 89 f6             	mov    rsi,r14
      ab3acd:	4c 89 fa             	mov    rdx,r15
      ab3ad0:	4c 89 e1             	mov    rcx,r12
      ab3ad3:	e8 a7 0a d2 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      ab3ad8:	4c 89 e7             	mov    rdi,r12
      ab3adb:	e8 b0 a3 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab3ae0:	4c 89 f7             	mov    rdi,r14
      ab3ae3:	e8 00 11 d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      ab3ae8:	4d 8b 7d 08          	mov    r15,QWORD PTR [r13+0x8]
      ab3aec:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ab3aef:	48 8d 15 09 85 8b ff 	lea    rdx,[rip+0xffffffffff8b8509]        # 36bfff <_ZTSSt12bad_any_cast@@Base-0x241c9>
      ab3af6:	48 8d 0d f9 b6 8b ff 	lea    rcx,[rip+0xffffffffff8bb6f9]        # 36f1f6 <_ZTSSt12bad_any_cast@@Base-0x20fd2>
      ab3afd:	4c 89 f7             	mov    rdi,r14
      ab3b00:	4c 89 fe             	mov    rsi,r15
      ab3b03:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      ab3b09:	49 89 c4             	mov    r12,rax
      ab3b0c:	4c 89 f7             	mov    rdi,r14
      ab3b0f:	e8 d4 10 d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      ab3b14:	4c 89 f7             	mov    rdi,r14
      ab3b17:	4c 89 fe             	mov    rsi,r15
      ab3b1a:	4c 89 e2             	mov    rdx,r12
      ab3b1d:	89 d9                	mov    ecx,ebx
      ab3b1f:	31 c0                	xor    eax,eax
      ab3b21:	e8 16 01 00 00       	call   ab3c3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdc>
      ab3b26:	48 89 c3             	mov    rbx,rax
      ab3b29:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      ab3b2e:	e8 93 21 d2 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      ab3b33:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ab3b3a:	00 00 
      ab3b3c:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
      ab3b41:	75 36                	jne    ab3b79 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb19>
      ab3b43:	48 89 d8             	mov    rax,rbx
      ab3b46:	48 83 c4 30          	add    rsp,0x30
      ab3b4a:	5b                   	pop    rbx
      ab3b4b:	41 5c                	pop    r12

### 0xacf639 slot +0x108; FDE=(11335022, 11340014)
      acf5fe:	4c 89 f7             	mov    rdi,r14
      acf601:	ff 50 30             	call   QWORD PTR [rax+0x30]
      acf604:	49 89 c4             	mov    r12,rax
      acf607:	4c 89 74 24 68       	mov    QWORD PTR [rsp+0x68],r14
      acf60c:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      acf611:	4c 89 f7             	mov    rdi,r14
      acf614:	e8 cf 55 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf619:	4d 85 e4             	test   r12,r12
      acf61c:	0f 84 fa 04 00 00    	je     acfb1c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cabc>
      acf622:	49 8b 06             	mov    rax,QWORD PTR [r14]
      acf625:	48 8d 15 55 1c 87 ff 	lea    rdx,[rip+0xffffffffff871c55]        # 341281 <_ZTSSt12bad_any_cast@@Base-0x4ef47>
      acf62c:	48 8d 0d ba c9 89 ff 	lea    rcx,[rip+0xffffffffff89c9ba]        # 36bfed <_ZTSSt12bad_any_cast@@Base-0x241db>
      acf633:	4c 89 f7             	mov    rdi,r14
      acf636:	4c 89 e6             	mov    rsi,r12
      acf639:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      acf63f:	48 89 c3             	mov    rbx,rax
      acf642:	4c 89 f7             	mov    rdi,r14
      acf645:	e8 9e 55 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf64a:	48 85 db             	test   rbx,rbx
      acf64d:	0f 84 de 04 00 00    	je     acfb31 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cad1>
      acf653:	4c 89 f7             	mov    rdi,r14
      acf656:	4c 89 fe             	mov    rsi,r15
      acf659:	48 89 da             	mov    rdx,rbx
      acf65c:	31 c0                	xor    eax,eax
      acf65e:	e8 b1 5a ff ff       	call   ac5114 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120b4>
      acf663:	49 89 c7             	mov    r15,rax
      acf666:	4c 89 b4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r14
      acf66d:	00 
      acf66e:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
      acf675:	00 
      acf676:	4c 89 f7             	mov    rdi,r14
      acf679:	e8 6a 55 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf67e:	4d 85 ff             	test   r15,r15
      acf681:	0f 84 e1 04 00 00    	je     acfb68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb08>
      acf687:	49 8b 06             	mov    rax,QWORD PTR [r14]

### 0xacf6d2 slot +0x108; FDE=(11335022, 11340014)
      acf697:	49 89 c4             	mov    r12,rax
      acf69a:	4c 89 b4 24 10 01 00 	mov    QWORD PTR [rsp+0x110],r14
      acf6a1:	00 
      acf6a2:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
      acf6a9:	00 
      acf6aa:	4c 89 f7             	mov    rdi,r14
      acf6ad:	e8 36 55 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf6b2:	4d 85 e4             	test   r12,r12
      acf6b5:	0f 84 e4 04 00 00    	je     acfb9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb3f>
      acf6bb:	49 8b 06             	mov    rax,QWORD PTR [r14]
      acf6be:	48 8d 15 1e 98 8a ff 	lea    rdx,[rip+0xffffffffff8a981e]        # 378ee3 <_ZTSSt12bad_any_cast@@Base-0x172e5>
      acf6c5:	48 8d 0d f4 32 8a ff 	lea    rcx,[rip+0xffffffffff8a32f4]        # 3729c0 <_ZTSSt12bad_any_cast@@Base-0x1d808>
      acf6cc:	4c 89 f7             	mov    rdi,r14
      acf6cf:	4c 89 e6             	mov    rsi,r12
      acf6d2:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      acf6d8:	48 89 c3             	mov    rbx,rax
      acf6db:	4c 89 f7             	mov    rdi,r14
      acf6de:	e8 05 55 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf6e3:	48 85 db             	test   rbx,rbx
      acf6e6:	0f 84 c8 04 00 00    	je     acfbb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb54>
      acf6ec:	4c 89 f7             	mov    rdi,r14
      acf6ef:	4c 89 fe             	mov    rsi,r15
      acf6f2:	48 89 da             	mov    rdx,rbx
      acf6f5:	31 c0                	xor    eax,eax
      acf6f7:	e8 18 5a ff ff       	call   ac5114 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120b4>
      acf6fc:	49 89 c4             	mov    r12,rax
      acf6ff:	4c 89 b4 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r14
      acf706:	00 
      acf707:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
      acf70e:	00 
      acf70f:	4c 89 f7             	mov    rdi,r14
      acf712:	e8 d1 54 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf717:	4d 85 e4             	test   r12,r12
      acf71a:	4d 89 f7             	mov    r15,r14
      acf71d:	0f 84 c8 04 00 00    	je     acfbeb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb8b>

### 0xacf771 slot +0x108; FDE=(11335022, 11340014)
      acf736:	49 89 c7             	mov    r15,rax
      acf739:	48 89 9c 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rbx
      acf740:	00 
      acf741:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      acf748:	00 
      acf749:	48 89 df             	mov    rdi,rbx
      acf74c:	e8 97 54 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf751:	4d 85 ff             	test   r15,r15
      acf754:	0f 84 c5 04 00 00    	je     acfc1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cbbf>
      acf75a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      acf75d:	48 8d 15 4f 91 87 ff 	lea    rdx,[rip+0xffffffffff87914f]        # 3488b3 <_ZTSSt12bad_any_cast@@Base-0x47915>
      acf764:	48 8d 0d 5f 55 88 ff 	lea    rcx,[rip+0xffffffffff88555f]        # 354cca <_ZTSSt12bad_any_cast@@Base-0x3b4fe>
      acf76b:	48 89 df             	mov    rdi,rbx
      acf76e:	4c 89 fe             	mov    rsi,r15
      acf771:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      acf777:	49 89 c6             	mov    r14,rax
      acf77a:	48 89 df             	mov    rdi,rbx
      acf77d:	e8 66 54 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf782:	4d 85 f6             	test   r14,r14
      acf785:	0f 84 a9 04 00 00    	je     acfc34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cbd4>
      acf78b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      acf78e:	48 8d 15 42 32 8a ff 	lea    rdx,[rip+0xffffffffff8a3242]        # 3729d7 <_ZTSSt12bad_any_cast@@Base-0x1d7f1>
      acf795:	48 8d 0d 4a 5d 87 ff 	lea    rcx,[rip+0xffffffffff875d4a]        # 3454e6 <_ZTSSt12bad_any_cast@@Base-0x4ace2>
      acf79c:	48 89 df             	mov    rdi,rbx
      acf79f:	4c 89 fe             	mov    rsi,r15
      acf7a2:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      acf7a8:	49 89 c5             	mov    r13,rax
      acf7ab:	48 89 df             	mov    rdi,rbx
      acf7ae:	e8 35 54 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf7b3:	4d 85 ed             	test   r13,r13
      acf7b6:	49 89 df             	mov    r15,rbx
      acf7b9:	0f 84 ac 04 00 00    	je     acfc6b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cc0b>
      acf7bf:	49 8b 07             	mov    rax,QWORD PTR [r15]
      acf7c2:	48 8d 35 5f c3 87 ff 	lea    rsi,[rip+0xffffffffff87c35f]        # 34bb28 <_ZTSSt12bad_any_cast@@Base-0x446a0>
      acf7c9:	4c 89 ff             	mov    rdi,r15

### 0xacf7a2 slot +0x108; FDE=(11335022, 11340014)
      acf764:	48 8d 0d 5f 55 88 ff 	lea    rcx,[rip+0xffffffffff88555f]        # 354cca <_ZTSSt12bad_any_cast@@Base-0x3b4fe>
      acf76b:	48 89 df             	mov    rdi,rbx
      acf76e:	4c 89 fe             	mov    rsi,r15
      acf771:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      acf777:	49 89 c6             	mov    r14,rax
      acf77a:	48 89 df             	mov    rdi,rbx
      acf77d:	e8 66 54 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf782:	4d 85 f6             	test   r14,r14
      acf785:	0f 84 a9 04 00 00    	je     acfc34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cbd4>
      acf78b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      acf78e:	48 8d 15 42 32 8a ff 	lea    rdx,[rip+0xffffffffff8a3242]        # 3729d7 <_ZTSSt12bad_any_cast@@Base-0x1d7f1>
      acf795:	48 8d 0d 4a 5d 87 ff 	lea    rcx,[rip+0xffffffffff875d4a]        # 3454e6 <_ZTSSt12bad_any_cast@@Base-0x4ace2>
      acf79c:	48 89 df             	mov    rdi,rbx
      acf79f:	4c 89 fe             	mov    rsi,r15
      acf7a2:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      acf7a8:	49 89 c5             	mov    r13,rax
      acf7ab:	48 89 df             	mov    rdi,rbx
      acf7ae:	e8 35 54 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf7b3:	4d 85 ed             	test   r13,r13
      acf7b6:	49 89 df             	mov    r15,rbx
      acf7b9:	0f 84 ac 04 00 00    	je     acfc6b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cc0b>
      acf7bf:	49 8b 07             	mov    rax,QWORD PTR [r15]
      acf7c2:	48 8d 35 5f c3 87 ff 	lea    rsi,[rip+0xffffffffff87c35f]        # 34bb28 <_ZTSSt12bad_any_cast@@Base-0x446a0>
      acf7c9:	4c 89 ff             	mov    rdi,r15
      acf7cc:	ff 50 30             	call   QWORD PTR [rax+0x30]
      acf7cf:	4c 89 fb             	mov    rbx,r15
      acf7d2:	49 89 c7             	mov    r15,rax
      acf7d5:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
      acf7dc:	00 
      acf7dd:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      acf7e4:	00 
      acf7e5:	48 89 df             	mov    rdi,rbx
      acf7e8:	e8 fb 53 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf7ed:	4d 85 ff             	test   r15,r15
      acf7f0:	0f 84 a9 04 00 00    	je     acfc9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cc3f>

### 0xacf80d slot +0x108; FDE=(11335022, 11340014)
      acf7d2:	49 89 c7             	mov    r15,rax
      acf7d5:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
      acf7dc:	00 
      acf7dd:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      acf7e4:	00 
      acf7e5:	48 89 df             	mov    rdi,rbx
      acf7e8:	e8 fb 53 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf7ed:	4d 85 ff             	test   r15,r15
      acf7f0:	0f 84 a9 04 00 00    	je     acfc9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cc3f>
      acf7f6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      acf7f9:	48 8d 15 7c 20 88 ff 	lea    rdx,[rip+0xffffffffff88207c]        # 35187c <_ZTSSt12bad_any_cast@@Base-0x3e94c>
      acf800:	48 8d 0d df 5c 87 ff 	lea    rcx,[rip+0xffffffffff875cdf]        # 3454e6 <_ZTSSt12bad_any_cast@@Base-0x4ace2>
      acf807:	48 89 df             	mov    rdi,rbx
      acf80a:	4c 89 fe             	mov    rsi,r15
      acf80d:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      acf813:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      acf818:	48 89 df             	mov    rdi,rbx
      acf81b:	e8 c8 53 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf820:	48 83 7c 24 20 00    	cmp    QWORD PTR [rsp+0x20],0x0
      acf826:	0f 84 8b 04 00 00    	je     acfcb7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cc57>
      acf82c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      acf82f:	48 8d 15 d7 95 89 ff 	lea    rdx,[rip+0xffffffffff8995d7]        # 368e0d <_ZTSSt12bad_any_cast@@Base-0x273bb>
      acf836:	48 8d 0d a9 5c 87 ff 	lea    rcx,[rip+0xffffffffff875ca9]        # 3454e6 <_ZTSSt12bad_any_cast@@Base-0x4ace2>
      acf83d:	48 89 df             	mov    rdi,rbx
      acf840:	4c 89 fe             	mov    rsi,r15
      acf843:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      acf849:	49 89 c7             	mov    r15,rax
      acf84c:	48 89 df             	mov    rdi,rbx
      acf84f:	e8 94 53 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf854:	4c 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],r15
      acf859:	4d 85 ff             	test   r15,r15
      acf85c:	49 89 df             	mov    r15,rbx
      acf85f:	0f 84 8b 04 00 00    	je     acfcf0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cc90>
      acf865:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      acf86a:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14

### 0xacf843 slot +0x108; FDE=(11335022, 11340014)
      acf800:	48 8d 0d df 5c 87 ff 	lea    rcx,[rip+0xffffffffff875cdf]        # 3454e6 <_ZTSSt12bad_any_cast@@Base-0x4ace2>
      acf807:	48 89 df             	mov    rdi,rbx
      acf80a:	4c 89 fe             	mov    rsi,r15
      acf80d:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      acf813:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      acf818:	48 89 df             	mov    rdi,rbx
      acf81b:	e8 c8 53 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf820:	48 83 7c 24 20 00    	cmp    QWORD PTR [rsp+0x20],0x0
      acf826:	0f 84 8b 04 00 00    	je     acfcb7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cc57>
      acf82c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      acf82f:	48 8d 15 d7 95 89 ff 	lea    rdx,[rip+0xffffffffff8995d7]        # 368e0d <_ZTSSt12bad_any_cast@@Base-0x273bb>
      acf836:	48 8d 0d a9 5c 87 ff 	lea    rcx,[rip+0xffffffffff875ca9]        # 3454e6 <_ZTSSt12bad_any_cast@@Base-0x4ace2>
      acf83d:	48 89 df             	mov    rdi,rbx
      acf840:	4c 89 fe             	mov    rsi,r15
      acf843:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      acf849:	49 89 c7             	mov    r15,rax
      acf84c:	48 89 df             	mov    rdi,rbx
      acf84f:	e8 94 53 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      acf854:	4c 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],r15
      acf859:	4d 85 ff             	test   r15,r15
      acf85c:	49 89 df             	mov    r15,rbx
      acf85f:	0f 84 8b 04 00 00    	je     acfcf0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cc90>
      acf865:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      acf86a:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
      acf86f:	4c 89 64 24 28       	mov    QWORD PTR [rsp+0x28],r12
      acf874:	48 8d 84 24 e8 01 00 	lea    rax,[rsp+0x1e8]
      acf87b:	00 
      acf87c:	66 0f ef c0          	pxor   xmm0,xmm0
      acf880:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
      acf884:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
      acf888:	4d 89 fd             	mov    r13,r15
      acf88b:	4c 89 ef             	mov    rdi,r13
      acf88e:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
      acf893:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
      acf898:	31 c0                	xor    eax,eax

### 0xbc590e slot +0x178; FDE=(12343458, 12343599)
      bc58e4:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      bc58e7:	48 89 df             	mov    rdi,rbx
      bc58ea:	ff 90 e8 08 00 00    	call   QWORD PTR [rax+0x8e8]
      bc58f0:	48 89 c1             	mov    rcx,rax
      bc58f3:	48 c1 e9 20          	shr    rcx,0x20
      bc58f7:	89 c6                	mov    esi,eax
      bc58f9:	c1 ee 0b             	shr    esi,0xb
      bc58fc:	83 e6 07             	and    esi,0x7
      bc58ff:	ff c5                	inc    ebp
      bc5901:	39 f5                	cmp    ebp,esi
      bc5903:	72 d6                	jb     bc58db <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11287b>
      bc5905:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      bc5908:	48 89 df             	mov    rdi,rbx
      bc590b:	48 89 c6             	mov    rsi,rax
      bc590e:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
      bc5914:	48 89 c1             	mov    rcx,rax
      bc5917:	48 c1 e9 20          	shr    rcx,0x20
      bc591b:	48 89 d6             	mov    rsi,rdx
      bc591e:	48 c1 ee 20          	shr    rsi,0x20
      bc5922:	31 c8                	xor    eax,ecx
      bc5924:	31 d6                	xor    esi,edx
      bc5926:	01 f0                	add    eax,esi
      bc5928:	48 83 c4 08          	add    rsp,0x8
      bc592c:	5b                   	pop    rbx
      bc592d:	5d                   	pop    rbp
      bc592e:	c3                   	ret
      bc592f:	cc                   	int3
      bc5930:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bc5933:	48 03 78 b0          	add    rdi,QWORD PTR [rax-0x50]
      bc5937:	e9 66 ff ff ff       	jmp    bc58a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x112842>
      bc593c:	53                   	push   rbx
      bc593d:	48 89 fb             	mov    rbx,rdi
      bc5940:	48 89 f1             	mov    rcx,rsi
      bc5943:	48 c1 e9 20          	shr    rcx,0x20
      bc5947:	48 85 f6             	test   rsi,rsi

### 0xbc5984 slot +0x108; FDE=(12343612, 12343712)
      bc5953:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      bc5956:	48 89 df             	mov    rdi,rbx
      bc5959:	ff 90 40 06 00 00    	call   QWORD PTR [rax+0x640]
      bc595f:	89 c1                	mov    ecx,eax
      bc5961:	48 89 c6             	mov    rsi,rax
      bc5964:	48 c1 ee 20          	shr    rsi,0x20
      bc5968:	48 c1 e6 20          	shl    rsi,0x20
      bc596c:	48 09 ce             	or     rsi,rcx
      bc596f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      bc5972:	48 89 df             	mov    rdi,rbx
      bc5975:	ff 90 08 05 00 00    	call   QWORD PTR [rax+0x508]
      bc597b:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      bc597e:	48 89 df             	mov    rdi,rbx
      bc5981:	48 89 c6             	mov    rsi,rax
      bc5984:	ff 91 08 01 00 00    	call   QWORD PTR [rcx+0x108]
      bc598a:	48 89 c1             	mov    rcx,rax
      bc598d:	48 c1 e9 20          	shr    rcx,0x20
      bc5991:	48 89 d6             	mov    rsi,rdx
      bc5994:	48 c1 ee 20          	shr    rsi,0x20
      bc5998:	31 c8                	xor    eax,ecx
      bc599a:	31 d6                	xor    esi,edx
      bc599c:	01 f0                	add    eax,esi
      bc599e:	5b                   	pop    rbx
      bc599f:	c3                   	ret
      bc59a0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bc59a3:	48 03 b8 28 ff ff ff 	add    rdi,QWORD PTR [rax-0xd8]
      bc59aa:	e9 8d ff ff ff       	jmp    bc593c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1128dc>
      bc59af:	cc                   	int3
      bc59b0:	55                   	push   rbp
      bc59b1:	53                   	push   rbx
      bc59b2:	50                   	push   rax
      bc59b3:	48 89 fb             	mov    rbx,rdi
      bc59b6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bc59b9:	ff 90 48 06 00 00    	call   QWORD PTR [rax+0x648]
      bc59bf:	48 89 c7             	mov    rdi,rax

### 0xbc5ddc slot +0x148; FDE=(12344726, 12344829)
      bc5db2:	48 89 df             	mov    rdi,rbx
      bc5db5:	48 89 c6             	mov    rsi,rax
      bc5db8:	ff 91 f8 00 00 00    	call   QWORD PTR [rcx+0xf8]
      bc5dbe:	48 89 c6             	mov    rsi,rax
      bc5dc1:	48 c1 ee 20          	shr    rsi,0x20
      bc5dc5:	89 c1                	mov    ecx,eax
      bc5dc7:	c1 e9 0e             	shr    ecx,0xe
      bc5dca:	83 e1 07             	and    ecx,0x7
      bc5dcd:	ff c5                	inc    ebp
      bc5dcf:	39 cd                	cmp    ebp,ecx
      bc5dd1:	72 d3                	jb     bc5da6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x112d46>
      bc5dd3:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      bc5dd6:	48 89 df             	mov    rdi,rbx
      bc5dd9:	48 89 c6             	mov    rsi,rax
      bc5ddc:	ff 91 48 01 00 00    	call   QWORD PTR [rcx+0x148]
      bc5de2:	48 89 c1             	mov    rcx,rax
      bc5de5:	48 c1 e9 20          	shr    rcx,0x20
      bc5de9:	48 89 d6             	mov    rsi,rdx
      bc5dec:	48 c1 ee 20          	shr    rsi,0x20
      bc5df0:	31 c8                	xor    eax,ecx
      bc5df2:	31 d6                	xor    esi,edx
      bc5df4:	01 f0                	add    eax,esi
      bc5df6:	48 83 c4 08          	add    rsp,0x8
      bc5dfa:	5b                   	pop    rbx
      bc5dfb:	5d                   	pop    rbp
      bc5dfc:	c3                   	ret
      bc5dfd:	cc                   	int3
      bc5dfe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bc5e01:	48 03 b8 30 ff ff ff 	add    rdi,QWORD PTR [rax-0xd0]
      bc5e08:	e9 89 ff ff ff       	jmp    bc5d96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x112d36>
      bc5e0d:	cc                   	int3
      bc5e0e:	55                   	push   rbp
      bc5e0f:	53                   	push   rbx
      bc5e10:	50                   	push   rax
      bc5e11:	48 89 fb             	mov    rbx,rdi

### 0xc5a536 slot +0x108; FDE=(12952526, 12955045)
      c5a4fa:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      c5a4ff:	4c 8d a3 40 02 00 00 	lea    r12,[rbx+0x240]
      c5a506:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      c5a50d:	00 
      c5a50e:	4c 89 e6             	mov    rsi,r12
      c5a511:	e8 7a fd e1 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      c5a516:	48 8d 05 6b 02 bc 00 	lea    rax,[rip+0xbc026b]        # 181a788 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10448>
      c5a51d:	48 8d 8c 24 90 00 00 	lea    rcx,[rsp+0x90]
      c5a524:	00 
      c5a525:	48 89 01             	mov    QWORD PTR [rcx],rax
      c5a528:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
      c5a52c:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      c5a530:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      c5a533:	48 89 df             	mov    rdi,rbx
      c5a536:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      c5a53c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      c5a541:	4c 89 64 24 18       	mov    QWORD PTR [rsp+0x18],r12
      c5a546:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
      c5a54b:	89 6c 24 0c          	mov    DWORD PTR [rsp+0xc],ebp
      c5a54f:	bf 90 01 00 00       	mov    edi,0x190
      c5a554:	e8 a7 39 b9 00       	call   17edf00 <_Znwm@plt>
      c5a559:	49 89 c5             	mov    r13,rax
      c5a55c:	4c 8d a4 24 80 01 00 	lea    r12,[rsp+0x180]
      c5a563:	00 
      c5a564:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
      c5a56b:	00 
      c5a56c:	4c 89 e7             	mov    rdi,r12
      c5a56f:	e8 0c da 00 00       	call   c67f80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b4f20>
      c5a574:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
      c5a57b:	00 
      c5a57c:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
      c5a583:	00 
      c5a584:	4c 89 ff             	mov    rdi,r15
      c5a587:	e8 38 da 00 00       	call   c67fc4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b4f64>
      c5a58c:	48 8d 05 d5 00 bc 00 	lea    rax,[rip+0xbc00d5]        # 181a668 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10328>

### 0xcc329d slot +0x178; FDE=(13380596, 13383094)
      cc3262:	d1 e8                	shr    eax,1
      cc3264:	48 85 c0             	test   rax,rax
      cc3267:	74 2a                	je     cc3293 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x210233>
      cc3269:	41 81 cf 84 08 00 00 	or     r15d,0x884
      cc3270:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      cc3277:	00 
      cc3278:	44 89 7f e8          	mov    DWORD PTR [rdi-0x18],r15d
      cc327c:	48 8b 57 e0          	mov    rdx,QWORD PTR [rdi-0x20]
      cc3280:	f6 c2 01             	test   dl,0x1
      cc3283:	0f 85 e2 01 00 00    	jne    cc346b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21040b>
      cc3289:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
      cc328e:	e8 ff 24 aa 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      cc3293:	49 8b bd e8 05 00 00 	mov    rdi,QWORD PTR [r13+0x5e8]
      cc329a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc329d:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      cc32a3:	49 89 c6             	mov    r14,rax
      cc32a6:	48 8d 35 d9 7f 6c ff 	lea    rsi,[rip+0xffffffffff6c7fd9]        # 38b286 <_ZTSSt12bad_any_cast@@Base-0x4f42>
      cc32ad:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      cc32b2:	e8 c7 67 db ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cc32b7:	48 8d 35 be ec 78 ff 	lea    rsi,[rip+0xffffffffff78ecbe]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc32be:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      cc32c3:	e8 b6 67 db ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      cc32c8:	49 81 c6 98 00 00 00 	add    r14,0x98
      cc32cf:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
      cc32d4:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      cc32d9:	4c 89 f7             	mov    rdi,r14
      cc32dc:	e8 fb 62 f1 ff       	call   bd95dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12657c>
      cc32e1:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      cc32e8:	00 
      cc32e9:	48 89 c6             	mov    rsi,rax
      cc32ec:	e8 4f ac b2 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      cc32f1:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      cc32f6:	e8 95 ab b2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cc32fb:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      cc3300:	e8 8b ab b2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0xcc3de3 slot +0x178; FDE=(13384674, 13387367)
      cc3db0:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      cc3db3:	48 89 c7             	mov    rdi,rax
      cc3db6:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      cc3db9:	48 85 c0             	test   rax,rax
      cc3dbc:	74 1b                	je     cc3dd9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x210d79>
      cc3dbe:	48 8d 35 b7 e1 78 ff 	lea    rsi,[rip+0xffffffffff78e1b7]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc3dc5:	48 8d 0d e7 5b 6b ff 	lea    rcx,[rip+0xffffffffff6b5be7]        # 3799b3 <_ZTSSt12bad_any_cast@@Base-0x16815>
      cc3dcc:	45 31 e4             	xor    r12d,r12d
      cc3dcf:	6a 03                	push   0x3
      cc3dd1:	5f                   	pop    rdi
      cc3dd2:	ba 50 04 00 00       	mov    edx,0x450
      cc3dd7:	eb 38                	jmp    cc3e11 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x210db1>
      cc3dd9:	49 8b be e0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5e0]
      cc3de0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc3de3:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      cc3de9:	48 89 c7             	mov    rdi,rax
      cc3dec:	e8 c1 86 84 00       	call   150c4b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x351a36>
      cc3df1:	41 b4 01             	mov    r12b,0x1
      cc3df4:	84 c0                	test   al,al
      cc3df6:	74 20                	je     cc3e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x210db8>
      cc3df8:	48 8d 35 7d e1 78 ff 	lea    rsi,[rip+0xffffffffff78e17d]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc3dff:	48 8d 0d 36 02 66 ff 	lea    rcx,[rip+0xffffffffff660236]        # 32403c <_ZTSSt12bad_any_cast@@Base-0x6c18c>
      cc3e06:	45 31 e4             	xor    r12d,r12d
      cc3e09:	6a 03                	push   0x3
      cc3e0b:	5f                   	pop    rdi
      cc3e0c:	ba 53 04 00 00       	mov    edx,0x453
      cc3e11:	31 c0                	xor    eax,eax
      cc3e13:	e8 ba 2a b1 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc3e18:	48 8d 5c 24 58       	lea    rbx,[rsp+0x58]
      cc3e1d:	48 89 df             	mov    rdi,rbx
      cc3e20:	e8 09 1a 00 00       	call   cc582e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2127ce>
      cc3e25:	80 4b 10 01          	or     BYTE PTR [rbx+0x10],0x1
      cc3e29:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      cc3e2e:	48 8b 57 f0          	mov    rdx,QWORD PTR [rdi-0x10]
      cc3e32:	f6 c2 01             	test   dl,0x1

### 0xcc78d6 slot +0x108; FDE=(13399724, 13404900)
      cc7897:	c7 01 02 00 00 00    	mov    DWORD PTR [rcx],0x2
      cc789d:	48 8d 05 2c 5b c6 00 	lea    rax,[rip+0xc65b2c]        # 192d3d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x747e0>
      cc78a4:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
      cc78a8:	c6 41 10 00          	mov    BYTE PTR [rcx+0x10],0x0
      cc78ac:	e9 e7 0f 00 00       	jmp    cc8898 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215838>
      cc78b1:	4c 89 e7             	mov    rdi,r12
      cc78b4:	e8 e7 ee ff ff       	call   cc67a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213740>
      cc78b9:	49 8d 7c 24 08       	lea    rdi,[r12+0x8]
      cc78be:	49 8b b4 24 e0 05 00 	mov    rsi,QWORD PTR [r12+0x5e0]
      cc78c5:	00 
      cc78c6:	e8 07 ed ff ff       	call   cc65d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213572>
      cc78cb:	49 8b bc 24 e0 05 00 	mov    rdi,QWORD PTR [r12+0x5e0]
      cc78d2:	00 
      cc78d3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc78d6:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      cc78dc:	84 c0                	test   al,al
      cc78de:	74 3f                	je     cc791f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2148bf>
      cc78e0:	49 8b b4 24 e0 05 00 	mov    rsi,QWORD PTR [r12+0x5e0]
      cc78e7:	00 
      cc78e8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc78eb:	48 8d 9c 24 20 03 00 	lea    rbx,[rsp+0x320]
      cc78f2:	00 
      cc78f3:	6a ff                	push   0xffffffffffffffff
      cc78f5:	5a                   	pop    rdx
      cc78f6:	48 89 df             	mov    rdi,rbx
      cc78f9:	ff 90 50 01 00 00    	call   QWORD PTR [rax+0x150]
      cc78ff:	49 8b b4 24 e0 05 00 	mov    rsi,QWORD PTR [r12+0x5e0]
      cc7906:	00 
      cc7907:	4c 89 e7             	mov    rdi,r12
      cc790a:	48 89 da             	mov    rdx,rbx
      cc790d:	e8 d2 11 00 00       	call   cc8ae4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215a84>
      cc7912:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
      cc7919:	00 
      cc791a:	e8 c7 27 ec ff       	call   b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
      cc791f:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14

### 0xcc8eb7 slot +0x178; FDE=(13405622, 13406303)
      cc8e7f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      cc8e84:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
      cc8e89:	49 8b 07             	mov    rax,QWORD PTR [r15]
      cc8e8c:	4c 89 ff             	mov    rdi,r15
      cc8e8f:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc8e95:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
      cc8e9c:	00 
      cc8e9d:	48 89 06             	mov    QWORD PTR [rsi],rax
      cc8ea0:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
      cc8ea4:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      cc8ea9:	e8 74 1d ec ff       	call   b8ac22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7bc2>
      cc8eae:	89 c5                	mov    ebp,eax
      cc8eb0:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      cc8eb4:	4c 89 e7             	mov    rdi,r12
      cc8eb7:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      cc8ebd:	49 89 c5             	mov    r13,rax
      cc8ec0:	49 8b 07             	mov    rax,QWORD PTR [r15]
      cc8ec3:	4c 89 ff             	mov    rdi,r15
      cc8ec6:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      cc8ecc:	49 83 c5 10          	add    r13,0x10
      cc8ed0:	48 83 c0 10          	add    rax,0x10
      cc8ed4:	4c 89 ef             	mov    rdi,r13
      cc8ed7:	48 89 c6             	mov    rsi,rax
      cc8eda:	e8 a5 34 a0 00       	call   16cc384 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x804f0>
      cc8edf:	41 89 c5             	mov    r13d,eax
      cc8ee2:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      cc8ee6:	4c 89 e7             	mov    rdi,r12
      cc8ee9:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
      cc8eef:	48 89 d1             	mov    rcx,rdx
      cc8ef2:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
      cc8ef9:	48 99                	cqo
      cc8efb:	48 f7 f9             	idiv   rcx
      cc8efe:	b1 01                	mov    cl,0x1
      cc8f00:	4c 39 f0             	cmp    rax,r14
      cc8f03:	7e 21                	jle    cc8f26 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215ec6>

### 0xcc8ee9 slot +0x148; FDE=(13405622, 13406303)
      cc8eb4:	4c 89 e7             	mov    rdi,r12
      cc8eb7:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      cc8ebd:	49 89 c5             	mov    r13,rax
      cc8ec0:	49 8b 07             	mov    rax,QWORD PTR [r15]
      cc8ec3:	4c 89 ff             	mov    rdi,r15
      cc8ec6:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      cc8ecc:	49 83 c5 10          	add    r13,0x10
      cc8ed0:	48 83 c0 10          	add    rax,0x10
      cc8ed4:	4c 89 ef             	mov    rdi,r13
      cc8ed7:	48 89 c6             	mov    rsi,rax
      cc8eda:	e8 a5 34 a0 00       	call   16cc384 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x804f0>
      cc8edf:	41 89 c5             	mov    r13d,eax
      cc8ee2:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      cc8ee6:	4c 89 e7             	mov    rdi,r12
      cc8ee9:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
      cc8eef:	48 89 d1             	mov    rcx,rdx
      cc8ef2:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
      cc8ef9:	48 99                	cqo
      cc8efb:	48 f7 f9             	idiv   rcx
      cc8efe:	b1 01                	mov    cl,0x1
      cc8f00:	4c 39 f0             	cmp    rax,r14
      cc8f03:	7e 21                	jle    cc8f26 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215ec6>
      cc8f05:	49 8b 07             	mov    rax,QWORD PTR [r15]
      cc8f08:	4c 89 ff             	mov    rdi,r15
      cc8f0b:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
      cc8f11:	48 89 d1             	mov    rcx,rdx
      cc8f14:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
      cc8f1b:	48 99                	cqo
      cc8f1d:	48 f7 f9             	idiv   rcx
      cc8f20:	4c 39 f0             	cmp    rax,r14
      cc8f23:	0f 9e c1             	setle  cl
      cc8f26:	44 20 ed             	and    bpl,r13b
      cc8f29:	40 80 fd 01          	cmp    bpl,0x1
      cc8f2d:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      cc8f32:	0f 85 83 00 00 00    	jne    cc8fbb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215f5b>

### 0xccce54 slot +0x178; FDE=(13421734, 13430685)
      ccce12:	4d 8b af f0 03 00 00 	mov    r13,QWORD PTR [r15+0x3f0]
      ccce19:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      ccce1d:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
      ccce24:	00 
      ccce25:	49 8b 9f 20 01 00 00 	mov    rbx,QWORD PTR [r15+0x120]
      ccce2c:	49 8d b7 28 01 00 00 	lea    rsi,[r15+0x128]
      ccce33:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      ccce3a:	00 
      ccce3b:	41 ff 97 40 01 00 00 	call   QWORD PTR [r15+0x140]
      ccce42:	4c 89 fd             	mov    rbp,r15
      ccce45:	49 8b bf 00 04 00 00 	mov    rdi,QWORD PTR [r15+0x400]
      ccce4c:	48 85 ff             	test   rdi,rdi
      ccce4f:	74 0b                	je     ccce5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x219dfc>
      ccce51:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ccce54:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      ccce5a:	eb 02                	jmp    ccce5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x219dfe>
      ccce5c:	31 c0                	xor    eax,eax
      ccce5e:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      ccce65:	00 
      ccce66:	4c 89 ac 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r13
      ccce6d:	00 
      ccce6e:	4c 89 a4 24 28 01 00 	mov    QWORD PTR [rsp+0x128],r12
      ccce75:	00 
      ccce76:	48 89 9c 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rbx
      ccce7d:	00 
      ccce7e:	4c 89 74 24 68       	mov    QWORD PTR [rsp+0x68],r14
      ccce83:	49 89 ed             	mov    r13,rbp
      ccce86:	48 8b b5 10 02 00 00 	mov    rsi,QWORD PTR [rbp+0x210]
      ccce8d:	48 8d bc 24 58 02 00 	lea    rdi,[rsp+0x258]
      ccce94:	00 
      ccce95:	e8 20 02 de ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
      ccce9a:	48 8d 94 24 18 0a 00 	lea    rdx,[rsp+0xa18]
      cccea1:	00 
      cccea2:	48 8d b4 24 00 0a 00 	lea    rsi,[rsp+0xa00]
      cccea9:	00 

### 0xce1d60 slot +0x108; FDE=(13507826, 13509379)
      ce1d27:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      ce1d2c:	4c 89 ff             	mov    rdi,r15
      ce1d2f:	48 89 de             	mov    rsi,rbx
      ce1d32:	e8 6f fe ff ff       	call   ce1ba6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22eb46>
      ce1d37:	4c 8d b3 38 13 00 00 	lea    r14,[rbx+0x1338]
      ce1d3e:	4c 89 ff             	mov    rdi,r15
      ce1d41:	4c 89 f6             	mov    rsi,r14
      ce1d44:	e8 bb 05 00 00       	call   ce2304 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22f2a4>
      ce1d49:	84 c0                	test   al,al
      ce1d4b:	0f 84 f0 03 00 00    	je     ce2141 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22f0e1>
      ce1d51:	48 8b bb 38 04 00 00 	mov    rdi,QWORD PTR [rbx+0x438]
      ce1d58:	48 85 ff             	test   rdi,rdi
      ce1d5b:	74 09                	je     ce1d66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22ed06>
      ce1d5d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ce1d60:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      ce1d66:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
      ce1d6b:	4c 89 ff             	mov    rdi,r15
      ce1d6e:	e8 e1 05 00 00       	call   ce2354 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22f2f4>
      ce1d73:	48 8d b3 c8 03 00 00 	lea    rsi,[rbx+0x3c8]
      ce1d7a:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      ce1d81:	00 
      ce1d82:	e8 a3 87 9e 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
      ce1d87:	41 80 4f 10 01       	or     BYTE PTR [r15+0x10],0x1
      ce1d8c:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      ce1d91:	48 8b 57 f0          	mov    rdx,QWORD PTR [rdi-0x10]
      ce1d95:	f6 c2 01             	test   dl,0x1
      ce1d98:	0f 85 49 04 00 00    	jne    ce21e7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22f187>
      ce1d9e:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
      ce1da5:	00 
      ce1da6:	e8 3b 3a a8 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      ce1dab:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
      ce1db2:	00 
      ce1db3:	4c 89 ff             	mov    rdi,r15
      ce1db6:	e8 d5 c0 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ce1dbb:	0f 10 83 a8 04 00 00 	movups xmm0,XMMWORD PTR [rbx+0x4a8]

### 0xd0732f slot +0x108; FDE=(13660532, 13661714)
      d072f9:	4d 89 30             	mov    QWORD PTR [r8],r14
      d072fc:	48 8d 35 8e 5d d9 ff 	lea    rsi,[rip+0xffffffffffd95d8e]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      d07303:	48 8d 0d 6a 40 00 00 	lea    rcx,[rip+0x406a]        # d0b374 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258314>
      d0730a:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
      d0730f:	6a 08                	push   0x8
      d07311:	41 59                	pop    r9
      d07313:	4c 89 e7             	mov    rdi,r12
      d07316:	31 d2                	xor    edx,edx
      d07318:	e8 77 34 ad 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      d0731d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      d07321:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      d07328:	00 
      d07329:	4c 89 ee             	mov    rsi,r13
      d0732c:	4c 89 e2             	mov    rdx,r12
      d0732f:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      d07335:	4d 8d a6 88 00 00 00 	lea    r12,[r14+0x88]
      d0733c:	48 8d ac 24 90 00 00 	lea    rbp,[rsp+0x90]
      d07343:	00 
      d07344:	4c 89 e7             	mov    rdi,r12
      d07347:	48 89 ee             	mov    rsi,rbp
      d0734a:	e8 ef 26 ad 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      d0734f:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
      d07353:	e8 2e 71 d9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d07358:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d0735d:	e8 86 34 ad 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      d07362:	4c 8d 44 24 48       	lea    r8,[rsp+0x48]
      d07367:	4d 89 30             	mov    QWORD PTR [r8],r14
      d0736a:	48 8d 35 20 5d d9 ff 	lea    rsi,[rip+0xffffffffffd95d20]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      d07371:	48 8d 0d 0c 40 00 00 	lea    rcx,[rip+0x400c]        # d0b384 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258324>
      d07378:	48 8d 6c 24 50       	lea    rbp,[rsp+0x50]
      d0737d:	6a 08                	push   0x8
      d0737f:	41 59                	pop    r9
      d07381:	48 89 ef             	mov    rdi,rbp
      d07384:	31 d2                	xor    edx,edx
      d07386:	e8 09 34 ad 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>

### 0xd09145 slot +0x148; FDE=(13668626, 13668729)
      d09114:	53                   	push   rbx
      d09115:	48 83 ec 18          	sub    rsp,0x18
      d09119:	48 89 fb             	mov    rbx,rdi
      d0911c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d09123:	00 00 
      d09125:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      d0912a:	48 8d 77 08          	lea    rsi,[rdi+0x8]
      d0912e:	49 89 e6             	mov    r14,rsp
      d09131:	4c 89 f7             	mov    rdi,r14
      d09134:	e8 f7 21 da ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      d09139:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0
      d0913d:	74 0c                	je     d0914b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2560eb>
      d0913f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      d09142:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d09145:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
      d0914b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d09150:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d09157:	00 00 
      d09159:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      d0915e:	75 0c                	jne    d0916c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25610c>
      d09160:	48 83 c4 18          	add    rsp,0x18
      d09164:	5b                   	pop    rbx
      d09165:	41 5e                	pop    r14
      d09167:	e9 1a 53 d9 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      d0916c:	e8 3f 69 ae 00       	call   17efab0 <__stack_chk_fail@plt>
      d09171:	48 89 c7             	mov    rdi,rax
      d09174:	e8 2c 09 d7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      d09179:	cc                   	int3
      d0917a:	50                   	push   rax
      d0917b:	6a 10                	push   0x10
      d0917d:	5f                   	pop    rdi
      d0917e:	e8 7d 4d ae 00       	call   17edf00 <_Znwm@plt>
      d09183:	48 8d 0d c6 8e b1 00 	lea    rcx,[rip+0xb18ec6]        # 1822050 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17d10>
      d0918a:	48 89 08             	mov    QWORD PTR [rax],rcx
      d0918d:	59                   	pop    rcx

### 0xd09a3e slot +0x178; FDE=(13670832, 13671139)
      d09a08:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      d09a0e:	41 0f 29 44 24 20    	movaps XMMWORD PTR [r12+0x20],xmm0
      d09a14:	48 8b 7a 18          	mov    rdi,QWORD PTR [rdx+0x18]
      d09a18:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
      d09a1c:	e8 15 1e d7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      d09a21:	4c 89 e7             	mov    rdi,r12
      d09a24:	48 89 c6             	mov    rsi,rax
      d09a27:	e8 14 ba 9b 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
      d09a2c:	84 c0                	test   al,al
      d09a2e:	74 4e                	je     d09a7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x256a1e>
      d09a30:	83 7c 24 78 09       	cmp    DWORD PTR [rsp+0x78],0x9
      d09a35:	75 47                	jne    d09a7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x256a1e>
      d09a37:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
      d09a3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d09a3e:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      d09a44:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      d09a47:	48 89 e7             	mov    rdi,rsp
      d09a4a:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
      d09a4f:	48 89 c6             	mov    rsi,rax
      d09a52:	ff 51 18             	call   QWORD PTR [rcx+0x18]
      d09a55:	80 7c 24 18 00       	cmp    BYTE PTR [rsp+0x18],0x0
      d09a5a:	74 1a                	je     d09a76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x256a16>
      d09a5c:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      d09a61:	80 4f f8 01          	or     BYTE PTR [rdi-0x8],0x1
      d09a65:	48 8b 57 f0          	mov    rdx,QWORD PTR [rdi-0x10]
      d09a69:	f6 c2 01             	test   dl,0x1
      d09a6c:	75 5f                	jne    d09acd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x256a6d>
      d09a6e:	48 89 e6             	mov    rsi,rsp
      d09a71:	e8 1c bd a5 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d09a76:	48 89 e7             	mov    rdi,rsp
      d09a79:	e8 b2 d2 d9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      d09a7e:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      d09a81:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
      d09a86:	4c 89 f6             	mov    rsi,r14
      d09a89:	e8 ce 7d 8d 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>

### 0xd2b9ac slot +0x108; FDE=(13809798, 13810333)
      d2b975:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
      d2b97a:	49 89 18             	mov    QWORD PTR [r8],rbx
      d2b97d:	48 8d 35 0d 17 d7 ff 	lea    rsi,[rip+0xffffffffffd7170d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      d2b984:	48 8d 0d 49 01 00 00 	lea    rcx,[rip+0x149]        # d2bad4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x278a74>
      d2b98b:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
      d2b990:	6a 08                	push   0x8
      d2b992:	41 59                	pop    r9
      d2b994:	4c 89 ff             	mov    rdi,r15
      d2b997:	31 d2                	xor    edx,edx
      d2b999:	e8 f6 ed aa 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      d2b99e:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d2b9a1:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      d2b9a6:	4c 89 f6             	mov    rsi,r14
      d2b9a9:	4c 89 fa             	mov    rdx,r15
      d2b9ac:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      d2b9b2:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
      d2b9b6:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
      d2b9bb:	4c 89 f6             	mov    rsi,r14
      d2b9be:	e8 2f e2 aa 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      d2b9c3:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      d2b9c7:	e8 ba 2a d7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d2b9cc:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d2b9d1:	e8 12 ee aa 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      d2b9d6:	4c 8b 73 20          	mov    r14,QWORD PTR [rbx+0x20]
      d2b9da:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
      d2b9df:	49 89 18             	mov    QWORD PTR [r8],rbx
      d2b9e2:	48 8d 35 a8 16 d7 ff 	lea    rsi,[rip+0xffffffffffd716a8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      d2b9e9:	48 8d 0d 06 01 00 00 	lea    rcx,[rip+0x106]        # d2baf6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x278a96>
      d2b9f0:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
      d2b9f5:	6a 08                	push   0x8
      d2b9f7:	41 59                	pop    r9
      d2b9f9:	4c 89 ff             	mov    rdi,r15
      d2b9fc:	31 d2                	xor    edx,edx
      d2b9fe:	e8 91 ed aa 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      d2ba03:	49 8b 06             	mov    rax,QWORD PTR [r14]

### 0xd41b2b slot +0x108; FDE=(13900339, 13901422)
      d41aee:	4c 89 f9             	mov    rcx,r15
      d41af1:	e8 89 2a a9 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      d41af6:	4c 89 ff             	mov    rdi,r15
      d41af9:	e8 92 c3 aa 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d41afe:	4c 89 e7             	mov    rdi,r12
      d41b01:	e8 e2 30 a9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      d41b06:	4c 8b 6d 08          	mov    r13,QWORD PTR [rbp+0x8]
      d41b0a:	4d 85 ed             	test   r13,r13
      d41b0d:	0f 84 4a 02 00 00    	je     d41d5d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xede3>
      d41b13:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      d41b17:	48 8d 15 e1 a4 62 ff 	lea    rdx,[rip+0xffffffffff62a4e1]        # 36bfff <_ZTSSt12bad_any_cast@@Base-0x241c9>
      d41b1e:	48 8d 0d 4f 04 71 ff 	lea    rcx,[rip+0xffffffffff71044f]        # 451f74 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b80>
      d41b25:	4c 89 e7             	mov    rdi,r12
      d41b28:	4c 89 ee             	mov    rsi,r13
      d41b2b:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      d41b31:	48 89 c5             	mov    rbp,rax
      d41b34:	4c 89 e7             	mov    rdi,r12
      d41b37:	e8 ac 30 a9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      d41b3c:	48 85 ed             	test   rbp,rbp
      d41b3f:	0f 84 18 02 00 00    	je     d41d5d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xede3>
      d41b45:	4c 89 e7             	mov    rdi,r12
      d41b48:	4c 89 ee             	mov    rsi,r13
      d41b4b:	48 89 ea             	mov    rdx,rbp
      d41b4e:	31 c0                	xor    eax,eax
      d41b50:	e8 e7 20 d7 ff       	call   ab3c3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdc>
      d41b55:	49 89 c5             	mov    r13,rax
      d41b58:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
      d41b5d:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      d41b62:	4c 89 e7             	mov    rdi,r12
      d41b65:	e8 7e 30 a9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      d41b6a:	4d 85 ed             	test   r13,r13
      d41b6d:	74 10                	je     d41b7f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec05>
      d41b6f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d41b74:	4c 89 e6             	mov    rsi,r12
      d41b77:	4c 89 ea             	mov    rdx,r13

### 0xd436ae slot +0x108; FDE=(13907288, 13908353)
      d43672:	4c 89 e1             	mov    rcx,r12
      d43675:	e8 05 0f a9 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>
      d4367a:	4c 89 e7             	mov    rdi,r12
      d4367d:	e8 0e a8 aa 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d43682:	4c 89 f7             	mov    rdi,r14
      d43685:	e8 5e 15 a9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      d4368a:	4c 8b 6d 08          	mov    r13,QWORD PTR [rbp+0x8]
      d4368e:	4d 85 ed             	test   r13,r13
      d43691:	0f 84 a5 00 00 00    	je     d4373c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107c2>
      d43697:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d4369a:	48 8d 15 5e 89 62 ff 	lea    rdx,[rip+0xffffffffff62895e]        # 36bfff <_ZTSSt12bad_any_cast@@Base-0x241c9>
      d436a1:	48 8d 0d a8 89 63 ff 	lea    rcx,[rip+0xffffffffff6389a8]        # 37c050 <_ZTSSt12bad_any_cast@@Base-0x14178>
      d436a8:	4c 89 f7             	mov    rdi,r14
      d436ab:	4c 89 ee             	mov    rsi,r13
      d436ae:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      d436b4:	48 89 c5             	mov    rbp,rax
      d436b7:	4c 89 f7             	mov    rdi,r14
      d436ba:	e8 29 15 a9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      d436bf:	48 85 ed             	test   rbp,rbp
      d436c2:	74 78                	je     d4373c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107c2>
      d436c4:	41 f6 07 01          	test   BYTE PTR [r15],0x1
      d436c8:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      d436cc:	74 04                	je     d436d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10758>
      d436ce:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
      d436d2:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d436d5:	4c 89 f7             	mov    rdi,r14
      d436d8:	ff 90 38 05 00 00    	call   QWORD PTR [rax+0x538]
      d436de:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
      d436e3:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      d436e8:	4c 89 f7             	mov    rdi,r14
      d436eb:	4c 89 ee             	mov    rsi,r13
      d436ee:	48 89 ea             	mov    rdx,rbp
      d436f1:	48 89 c1             	mov    rcx,rax
      d436f4:	31 c0                	xor    eax,eax
      d436f6:	e8 41 05 d7 ff       	call   ab3c3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdc>

### 0xd437a4 slot +0x108; FDE=(13907288, 13908353)
      d43765:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d4376a:	e8 57 25 a9 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      d4376f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      d43774:	e8 4d 25 a9 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      d43779:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      d4377e:	e8 43 25 a9 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      d43783:	40 b5 01             	mov    bpl,0x1
      d43786:	4d 85 ff             	test   r15,r15
      d43789:	74 51                	je     d437dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10862>
      d4378b:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
      d43790:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d43793:	48 8d 15 21 6c 6f ff 	lea    rdx,[rip+0xffffffffff6f6c21]        # 43a3bb <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5fe0a>
      d4379a:	48 8d 0d cf e7 70 ff 	lea    rcx,[rip+0xffffffffff70e7cf]        # 451f70 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b7c>
      d437a1:	4c 89 f7             	mov    rdi,r14
      d437a4:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      d437aa:	49 89 c4             	mov    r12,rax
      d437ad:	4c 89 f7             	mov    rdi,r14
      d437b0:	e8 33 14 a9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      d437b5:	4d 85 e4             	test   r12,r12
      d437b8:	74 22                	je     d437dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10862>
      d437ba:	4c 89 f7             	mov    rdi,r14
      d437bd:	4c 89 fe             	mov    rsi,r15
      d437c0:	4c 89 e2             	mov    rdx,r12
      d437c3:	31 c0                	xor    eax,eax
      d437c5:	e8 34 ab d5 ff       	call   a9e2fe <JNI_OnUnload@@Base+0x25bcb>
      d437ca:	49 89 c6             	mov    r14,rax
      d437cd:	49 81 e6 00 ff ff ff 	and    r14,0xffffffffffffff00
      d437d4:	44 0f b6 f8          	movzx  r15d,al
      d437d8:	31 ed                	xor    ebp,ebp
      d437da:	eb 06                	jmp    d437e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10868>
      d437dc:	45 31 f6             	xor    r14d,r14d
      d437df:	45 31 ff             	xor    r15d,r15d
      d437e2:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d437e7:	e8 9c af d5 ff       	call   a9e788 <JNI_OnUnload@@Base+0x26055>
      d437ec:	0f b6 74 24 79       	movzx  esi,BYTE PTR [rsp+0x79]

### 0xd4e177 slot +0x108; FDE=(13944548, 13959782)
      d4e137:	f3 41 0f 7f 87 28 01 	movdqu XMMWORD PTR [r15+0x128],xmm0
      d4e13e:	00 00 
      d4e140:	f3 41 0f 7f 87 18 01 	movdqu XMMWORD PTR [r15+0x118],xmm0
      d4e147:	00 00 
      d4e149:	41 c7 87 38 01 00 00 	mov    DWORD PTR [r15+0x138],0x3f800000
      d4e150:	00 00 80 3f 
      d4e154:	41 88 9f 40 01 00 00 	mov    BYTE PTR [r15+0x140],bl
      d4e15b:	49 83 a7 48 01 00 00 	and    QWORD PTR [r15+0x148],0x0
      d4e162:	00 
      d4e163:	4c 89 fb             	mov    rbx,r15
      d4e166:	48 81 c3 18 01 00 00 	add    rbx,0x118
      d4e16d:	49 8b 7f 48          	mov    rdi,QWORD PTR [r15+0x48]
      d4e171:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d4e174:	48 89 ee             	mov    rsi,rbp
      d4e177:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      d4e17d:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      d4e184:	00 
      d4e185:	48 8d b4 24 30 02 00 	lea    rsi,[rsp+0x230]
      d4e18c:	00 
      d4e18d:	e8 f8 d3 00 00       	call   d5b58a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28610>
      d4e192:	48 8b 84 24 98 06 00 	mov    rax,QWORD PTR [rsp+0x698]
      d4e199:	00 
      d4e19a:	48 89 84 24 b0 05 00 	mov    QWORD PTR [rsp+0x5b0],rax
      d4e1a1:	00 
      d4e1a2:	bf f0 00 00 00       	mov    edi,0xf0
      d4e1a7:	e8 54 fd a9 00       	call   17edf00 <_Znwm@plt>
      d4e1ac:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
      d4e1b1:	49 89 c4             	mov    r12,rax
      d4e1b4:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      d4e1bb:	00 
      d4e1bc:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
      d4e1c3:	00 
      d4e1c4:	e8 8d 02 01 00       	call   d5e456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4dc>
      d4e1c9:	48 83 a4 24 a0 04 00 	and    QWORD PTR [rsp+0x4a0],0x0
      d4e1d0:	00 00 

### 0xd4e634 slot +0x178; FDE=(13944548, 13959782)
      d4e5fe:	48 8d 35 8c ea d4 ff 	lea    rsi,[rip+0xffffffffffd4ea8c]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      d4e605:	48 8d 0d fc 7a 01 00 	lea    rcx,[rip+0x17afc]        # d66108 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3318e>
      d4e60c:	4c 8d bc 24 20 04 00 	lea    r15,[rsp+0x420]
      d4e613:	00 
      d4e614:	6a 08                	push   0x8
      d4e616:	41 59                	pop    r9
      d4e618:	4c 89 ff             	mov    rdi,r15
      d4e61b:	31 d2                	xor    edx,edx
      d4e61d:	e8 72 c1 a8 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      d4e622:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      d4e626:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      d4e62d:	00 
      d4e62e:	48 89 ee             	mov    rsi,rbp
      d4e631:	4c 89 fa             	mov    rdx,r15
      d4e634:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      d4e63a:	49 8d 9e 78 01 00 00 	lea    rbx,[r14+0x178]
      d4e641:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
      d4e648:	00 
      d4e649:	48 89 df             	mov    rdi,rbx
      d4e64c:	4c 89 fe             	mov    rsi,r15
      d4e64f:	e8 ea b3 a8 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      d4e654:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      d4e658:	e8 29 fe d4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d4e65d:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      d4e664:	00 
      d4e665:	e8 7e c1 a8 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      d4e66a:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
      d4e671:	00 
      d4e672:	4d 89 28             	mov    QWORD PTR [r8],r13
      d4e675:	48 8d 35 15 ea d4 ff 	lea    rsi,[rip+0xffffffffffd4ea15]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      d4e67c:	48 8d 0d d7 7a 01 00 	lea    rcx,[rip+0x17ad7]        # d6615a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x331e0>
      d4e683:	4c 8d bc 24 20 04 00 	lea    r15,[rsp+0x420]
      d4e68a:	00 
      d4e68b:	6a 08                	push   0x8
      d4e68d:	41 59                	pop    r9

### 0xd53c79 slot +0x1a8; FDE=(13974594, 13974820)
      d53c46:	53                   	push   rbx
      d53c47:	48 83 ec 40          	sub    rsp,0x40
      d53c4b:	49 89 ce             	mov    r14,rcx
      d53c4e:	49 89 f7             	mov    r15,rsi
      d53c51:	48 89 fb             	mov    rbx,rdi
      d53c54:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d53c5b:	00 00 
      d53c5d:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      d53c62:	48 8b 7e 50          	mov    rdi,QWORD PTR [rsi+0x50]
      d53c66:	e8 f3 b2 88 00       	call   15def5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4244e2>
      d53c6b:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      d53c6f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
      d53c74:	89 06                	mov    DWORD PTR [rsi],eax
      d53c76:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d53c79:	ff 90 a8 01 00 00    	call   QWORD PTR [rax+0x1a8]
      d53c7f:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
      d53c85:	48 8d 0d ac 47 b3 00 	lea    rcx,[rip+0xb347ac]        # 1888438 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1110>
      d53c8c:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      d53c91:	48 8d 0d 60 bb 6e ff 	lea    rcx,[rip+0xffffffffff6ebb60]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d53c98:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
      d53c9d:	85 c0                	test   eax,eax
      d53c9f:	0f 94 44 24 30       	sete   BYTE PTR [rsp+0x30]
      d53ca4:	48 c7 44 24 20 02 00 	mov    QWORD PTR [rsp+0x20],0x2
      d53cab:	00 00 
      d53cad:	83 f8 02             	cmp    eax,0x2
      d53cb0:	74 0e                	je     d53cc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20d46>
      d53cb2:	83 f8 01             	cmp    eax,0x1
      d53cb5:	75 23                	jne    d53cda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20d60>
      d53cb7:	48 8d 35 05 31 62 ff 	lea    rsi,[rip+0xffffffffff623105]        # 376dc3 <_ZTSSt12bad_any_cast@@Base-0x19405>
      d53cbe:	eb 07                	jmp    d53cc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20d4d>
      d53cc0:	48 8d 35 41 65 63 ff 	lea    rsi,[rip+0xffffffffff636541]        # 38a208 <_ZTSSt12bad_any_cast@@Base-0x5fc0>
      d53cc7:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      d53ccc:	c7 47 f8 03 00 00 00 	mov    DWORD PTR [rdi-0x8],0x3
      d53cd3:	31 d2                	xor    edx,edx
      d53cd5:	e8 78 20 db ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>

### 0xd58ce0 slot +0x178; FDE=(13995144, 13995350)
      d58cab:	49 89 e0             	mov    r8,rsp
      d58cae:	49 89 18             	mov    QWORD PTR [r8],rbx
      d58cb1:	48 8d 35 d9 43 d4 ff 	lea    rsi,[rip+0xffffffffffd443d9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      d58cb8:	48 8d 0d 97 00 00 00 	lea    rcx,[rip+0x97]        # d58d56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ddc>
      d58cbf:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      d58cc4:	6a 08                	push   0x8
      d58cc6:	41 59                	pop    r9
      d58cc8:	4c 89 ff             	mov    rdi,r15
      d58ccb:	31 d2                	xor    edx,edx
      d58ccd:	e8 c2 1a a8 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      d58cd2:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d58cd5:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d58cda:	4c 89 f6             	mov    rsi,r14
      d58cdd:	4c 89 fa             	mov    rdx,r15
      d58ce0:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      d58ce6:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      d58cea:	4c 8d 74 24 48       	lea    r14,[rsp+0x48]
      d58cef:	4c 89 f6             	mov    rsi,r14
      d58cf2:	e8 fb 0e a8 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      d58cf7:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      d58cfb:	e8 86 57 d4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d58d00:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d58d05:	e8 de 1a a8 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      d58d0a:	48 89 df             	mov    rdi,rbx
      d58d0d:	e8 4c 00 00 00       	call   d58d5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25de4>
      d58d12:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d58d19:	00 00 
      d58d1b:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
      d58d20:	75 2f                	jne    d58d51 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25dd7>
      d58d22:	48 83 c4 60          	add    rsp,0x60
      d58d26:	5b                   	pop    rbx
      d58d27:	41 5e                	pop    r14
      d58d29:	41 5f                	pop    r15
      d58d2b:	c3                   	ret
      d58d2c:	48 89 c3             	mov    rbx,rax

### 0xd597b9 slot +0x108; FDE=(13997032, 14004414)
      d59787:	4d 89 e5             	mov    r13,r12
      d5978a:	49 83 c5 18          	add    r13,0x18
      d5978e:	4c 89 ef             	mov    rdi,r13
      d59791:	4c 89 fe             	mov    rsi,r15
      d59794:	e8 f3 82 88 00       	call   15e1a8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x427010>
      d59799:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
      d5979e:	4d 89 2f             	mov    QWORD PTR [r15],r13
      d597a1:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12
      d597a5:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d597a8:	48 8d 94 24 00 02 00 	lea    rdx,[rsp+0x200]
      d597af:	00 
      d597b0:	48 89 df             	mov    rdi,rbx
      d597b3:	4c 89 f6             	mov    rsi,r14
      d597b6:	4c 89 f9             	mov    rcx,r15
      d597b9:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      d597bf:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      d597c3:	48 85 ff             	test   rdi,rdi
      d597c6:	74 05                	je     d597cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26853>
      d597c8:	e8 c3 4c d4 ff       	call   a9e490 <JNI_OnUnload@@Base+0x25d5d>
      d597cd:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
      d597d4:	00 
      d597d5:	e9 64 11 00 00       	jmp    d5a93e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279c4>
      d597da:	4c 8d ac 24 e8 05 00 	lea    r13,[rsp+0x5e8]
      d597e1:	00 
      d597e2:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
      d597e7:	48 8d 05 0a e9 b2 00 	lea    rax,[rip+0xb2e90a]        # 18880f8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xdd0>
      d597ee:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      d597f2:	0f 57 c0             	xorps  xmm0,xmm0
      d597f5:	41 0f 11 45 10       	movups XMMWORD PTR [r13+0x10],xmm0
      d597fa:	41 0f 11 45 1c       	movups XMMWORD PTR [r13+0x1c],xmm0
      d597ff:	49 83 c4 30          	add    r12,0x30
      d59803:	4c 89 e7             	mov    rdi,r12
      d59806:	e8 2b 20 d2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      d5980b:	4c 89 ef             	mov    rdi,r13
      d5980e:	48 89 c6             	mov    rsi,rax

### 0xd74475 slot +0x148; FDE=(14104824, 14108823)
      d74443:	4c 89 f7             	mov    rdi,r14
      d74446:	e8 33 66 d3 ff       	call   aaaa7e <JNI_OnUnload@@Base+0x3234b>
      d7444b:	83 bc 24 78 02 00 00 	cmp    DWORD PTR [rsp+0x278],0x0
      d74452:	00 
      d74453:	4c 89 f5             	mov    rbp,r14
      d74456:	75 23                	jne    d7447b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41501>
      d74458:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      d7445d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d74460:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d74463:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
      d74467:	4c 89 e7             	mov    rdi,r12
      d7446a:	48 89 c6             	mov    rsi,rax
      d7446d:	48 8d 94 24 14 02 00 	lea    rdx,[rsp+0x214]
      d74474:	00 
      d74475:	ff 91 48 01 00 00    	call   QWORD PTR [rcx+0x148]
      d7447b:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
      d74482:	00 
      d74483:	e8 90 73 ee ff       	call   c5b818 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a87b8>
      d74488:	48 83 c3 08          	add    rbx,0x8
      d7448c:	48 39 5c 24 30       	cmp    QWORD PTR [rsp+0x30],rbx
      d74491:	0f 85 46 ff ff ff    	jne    d743dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41463>
      d74497:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      d7449e:	00 
      d7449f:	e8 28 07 8f 00       	call   1664bcc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18d38>
      d744a4:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
      d744a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d744ab:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d744ae:	48 8d 9c 24 08 02 00 	lea    rbx,[rsp+0x208]
      d744b5:	00 
      d744b6:	48 89 df             	mov    rdi,rbx
      d744b9:	48 89 c6             	mov    rsi,rax
      d744bc:	e8 69 60 95 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
      d744c1:	48 89 df             	mov    rdi,rbx
      d744c4:	e8 6d 73 d0 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      d744c9:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax

### 0xd7456b slot +0x108; FDE=(14104824, 14108823)
      d74537:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d7453a:	89 84 24 d8 01 00 00 	mov    DWORD PTR [rsp+0x1d8],eax
      d74541:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      d74545:	4c 89 e7             	mov    rdi,r12
      d74548:	4c 89 ee             	mov    rsi,r13
      d7454b:	ff 90 c8 02 00 00    	call   QWORD PTR [rax+0x2c8]
      d74551:	4c 89 ef             	mov    rdi,r13
      d74554:	e8 d5 0d 95 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d74559:	8a 4c 24 18          	mov    cl,BYTE PTR [rsp+0x18]
      d7455d:	84 c9                	test   cl,cl
      d7455f:	74 55                	je     d745b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4163c>
      d74561:	41 89 de             	mov    r14d,ebx
      d74564:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
      d74568:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d7456b:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      d74571:	89 c3                	mov    ebx,eax
      d74573:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
      d74577:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d7457a:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d7457d:	83 78 38 09          	cmp    DWORD PTR [rax+0x38],0x9
      d74581:	75 0d                	jne    d74590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41616>
      d74583:	80 f3 01             	xor    bl,0x1
      d74586:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      d7458b:	08 58 01             	or     BYTE PTR [rax+0x1],bl
      d7458e:	eb 23                	jmp    d745b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41639>
      d74590:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
      d74594:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d74597:	ff 50 48             	call   QWORD PTR [rax+0x48]
      d7459a:	84 c0                	test   al,al
      d7459c:	74 0c                	je     d745aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41630>
      d7459e:	80 f3 01             	xor    bl,0x1
      d745a1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      d745a6:	08 18                	or     BYTE PTR [rax],bl
      d745a8:	eb 09                	jmp    d745b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41639>
      d745aa:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]

### 0xd783f9 slot +0x108; FDE=(14123786, 14124338)
      d783c7:	48 89 01             	mov    QWORD PTR [rcx],rax
      d783ca:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
      d783ce:	4c 89 71 10          	mov    QWORD PTR [rcx+0x10],r14
      d783d2:	40 88 69 18          	mov    BYTE PTR [rcx+0x18],bpl
      d783d6:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      d783da:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d783dd:	4c 89 f7             	mov    rdi,r14
      d783e0:	4c 89 fe             	mov    rsi,r15
      d783e3:	4c 89 e2             	mov    rdx,r12
      d783e6:	ff 50 78             	call   QWORD PTR [rax+0x78]
      d783e9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      d783ee:	e8 77 1b d0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d783f3:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d783f6:	4c 89 f7             	mov    rdi,r14
      d783f9:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      d783ff:	84 c0                	test   al,al
      d78401:	74 3b                	je     d7843e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x454c4>
      d78403:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d78406:	4c 89 f7             	mov    rdi,r14
      d78409:	ff 50 28             	call   QWORD PTR [rax+0x28]
      d7840c:	80 78 59 00          	cmp    BYTE PTR [rax+0x59],0x0
      d78410:	75 2c                	jne    d7843e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x454c4>
      d78412:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d78415:	4c 89 f7             	mov    rdi,r14
      d78418:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
      d7841e:	84 c0                	test   al,al
      d78420:	74 1c                	je     d7843e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x454c4>
      d78422:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d78427:	e8 1e 28 00 00       	call   d7ac4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47cd0>
      d7842c:	48 8b bb 78 06 00 00 	mov    rdi,QWORD PTR [rbx+0x678]
      d78433:	48 85 ff             	test   rdi,rdi
      d78436:	74 06                	je     d7843e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x454c4>
      d78438:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d7843b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d7843e:	80 bb f2 01 00 00 00 	cmp    BYTE PTR [rbx+0x1f2],0x0

### 0xd8919e slot +0x148; FDE=(14192996, 14193407)
      d8916c:	53                   	push   rbx
      d8916d:	48 81 ec 90 00 00 00 	sub    rsp,0x90
      d89174:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8917b:	00 00 
      d8917d:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      d89184:	00 
      d89185:	48 8b 17             	mov    rdx,QWORD PTR [rdi]
      d89188:	48 8b 1a             	mov    rbx,QWORD PTR [rdx]
      d8918b:	83 fe 02             	cmp    esi,0x2
      d8918e:	75 14                	jne    d891a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5622a>
      d89190:	48 8d 72 08          	lea    rsi,[rdx+0x8]
      d89194:	48 83 c2 60          	add    rdx,0x60
      d89198:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      d8919b:	48 89 df             	mov    rdi,rbx
      d8919e:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
      d891a4:	48 8d bb 98 0c 00 00 	lea    rdi,[rbx+0xc98]
      d891ab:	e8 76 57 d2 ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
      d891b0:	48 83 bb 90 0c 00 00 	cmp    QWORD PTR [rbx+0xc90],0x0
      d891b7:	00 
      d891b8:	0f 84 f0 00 00 00    	je     d892ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56334>
      d891be:	48 8b 83 70 0c 00 00 	mov    rax,QWORD PTR [rbx+0xc70]
      d891c5:	4c 8b a3 88 0c 00 00 	mov    r12,QWORD PTR [rbx+0xc88]
      d891cc:	4c 89 e1             	mov    rcx,r12
      d891cf:	48 c1 e9 05          	shr    rcx,0x5
      d891d3:	4c 8b 2c c8          	mov    r13,QWORD PTR [rax+rcx*8]
      d891d7:	41 83 e4 1f          	and    r12d,0x1f
      d891db:	41 c1 e4 07          	shl    r12d,0x7
      d891df:	4b 8d 34 2c          	lea    rsi,[r12+r13*1]
      d891e3:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d891e8:	e8 79 0c 94 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
      d891ed:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
      d891f2:	43 8b 44 25 68       	mov    eax,DWORD PTR [r13+r12*1+0x68]
      d891f7:	41 89 46 10          	mov    DWORD PTR [r14+0x10],eax
      d891fb:	43 0f 10 44 25 58    	movups xmm0,XMMWORD PTR [r13+r12*1+0x58]
      d89201:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0

## Exact d88caa adapter
      d88c94:	53                   	push   rbx
      d88c95:	48 89 fb             	mov    rbx,rdi
      d88c98:	48 8b b6 f8 03 00 00 	mov    rsi,QWORD PTR [rsi+0x3f8]
      d88c9f:	e8 36 00 00 00       	call   d88cda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d60>
      d88ca4:	48 89 d8             	mov    rax,rbx
      d88ca7:	5b                   	pop    rbx
      d88ca8:	c3                   	ret
      d88ca9:	cc                   	int3
      d88caa:	53                   	push   rbx
      d88cab:	48 89 fb             	mov    rbx,rdi
      d88cae:	48 83 c6 d8          	add    rsi,0xffffffffffffffd8
      d88cb2:	e8 6d c8 ff ff       	call   d85524 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x525aa>
      d88cb7:	48 89 d8             	mov    rax,rbx
      d88cba:	5b                   	pop    rbx
      d88cbb:	c3                   	ret
      d88cbc:	48 83 c7 d0          	add    rdi,0xffffffffffffffd0
      d88cc0:	e9 79 56 ff ff       	jmp    d7e33e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b3c4>
      d88cc5:	cc                   	int3
      d88cc6:	48 83 c7 d0          	add    rdi,0xffffffffffffffd0
      d88cca:	e9 af 5e ff ff       	jmp    d7eb7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bc04>
      d88ccf:	cc                   	int3
      d88cd0:	48 83 c7 d0          	add    rdi,0xffffffffffffffd0
      d88cd4:	e9 cd fc ff ff       	jmp    d889a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55a2c>
      d88cd9:	cc                   	int3
      d88cda:	48 83 ec 18          	sub    rsp,0x18
