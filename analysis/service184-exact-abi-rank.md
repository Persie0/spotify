# Service184 exact-ABI vtable ranking

Observed ABI constraints:
- +0x20: scalar/bool-like return at service initialization
- +0x28: pointer return; this is the proven Skip Ad execution dependency
- +0x30: pointer return
- +0x38: called with hidden/sret destination in rdi and service-this in rsi

Candidates=30757
## score=36 address-point=0x18ad280
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18ad278
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbb10c; score=11; sret-rdi-rsi; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=36 address-point=0x18ad240
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb6af; score=10; direct-this-pointer,no-call; FDE=(12301999, 12302025)
      bbb6af:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb6b2:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb6b6:	48 83 c0 02          	add    rax,0x2
      bbb6ba:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb6bd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb6c0:	8a 4c 90 08          	mov    cl,BYTE PTR [rax+rdx*4+0x8]
      bbb6c4:	48 d3 24 90          	shl    QWORD PTR [rax+rdx*4],cl
      bbb6c8:	c3                   	ret
- +0x30 -> 0xbbb266; score=10; direct-this-pointer,no-call; FDE=(12300902, 12300936)
      bbb266:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb269:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb26d:	48 83 c0 02          	add    rax,0x2
      bbb271:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb274:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb277:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb27a:	31 f6                	xor    esi,esi
      bbb27c:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb280:	40 0f 9f c6          	setg   sil
      bbb284:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb287:	c3                   	ret
- +0x38 -> 0xbbb0da; score=11; sret-rdi-rsi; FDE=(12300506, 12300532)
      bbb0da:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0dd:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0e1:	48 83 c0 02          	add    rax,0x2
      bbb0e5:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb0e8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb0eb:	48 63 14 88          	movsxd rdx,DWORD PTR [rax+rcx*4]
      bbb0ef:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb0f3:	c3                   	ret

## score=36 address-point=0x18ad230
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x38 -> 0xbbb6af; score=11; sret-rdi-rsi; FDE=(12301999, 12302025)
      bbb6af:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb6b2:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb6b6:	48 83 c0 02          	add    rax,0x2
      bbb6ba:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb6bd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb6c0:	8a 4c 90 08          	mov    cl,BYTE PTR [rax+rdx*4+0x8]
      bbb6c4:	48 d3 24 90          	shl    QWORD PTR [rax+rdx*4],cl
      bbb6c8:	c3                   	ret

## score=36 address-point=0x18ad218
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb489; score=10; direct-this-pointer,no-call; FDE=(12301449, 12301476)
      bbb489:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb48c:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb490:	48 83 c0 02          	add    rax,0x2
      bbb494:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb497:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb49a:	48 8b 54 88 08       	mov    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb49f:	48 01 14 88          	add    QWORD PTR [rax+rcx*4],rdx
      bbb4a3:	c3                   	ret
- +0x30 -> 0xbbb7d6; score=10; direct-this-pointer,no-call; FDE=(12302294, 12302337)
      bbb7d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb7d9:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb7dd:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb7e1:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb7e4:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb7e7:	48 83 c0 06          	add    rax,0x6
      bbb7eb:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb7ee:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7f1:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7f4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7f8:	48 8b 14 3a          	mov    rdx,QWORD PTR [rdx+rdi*1]
      bbb7fc:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb800:	c3                   	ret
- +0x38 -> 0xbbb0f4; score=11; sret-rdi-rsi; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=36 address-point=0x18ad1c8
- +0x20 -> 0xbbb140; score=3; scalar-return; FDE=(12300608, 12300652)
      bbb140:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb143:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb147:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb14b:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb14e:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb151:	48 83 c0 06          	add    rax,0x6
      bbb155:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb158:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb15b:	40 8a 7c 88 04       	mov    dil,BYTE PTR [rax+rcx*4+0x4]
      bbb160:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb163:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb167:	40 88 3c 02          	mov    BYTE PTR [rdx+rax*1],dil
      bbb16b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb4a4; score=10; direct-this-pointer,no-call; FDE=(12301476, 12301510)
      bbb4a4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb4a7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb4ab:	48 83 c0 02          	add    rax,0x2
      bbb4af:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb4b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb4b5:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb4b8:	31 f6                	xor    esi,esi
      bbb4ba:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb4be:	40 0f 9e c6          	setle  sil
      bbb4c2:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb4c5:	c3                   	ret
- +0x38 -> 0xbbb10c; score=11; sret-rdi-rsi; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=36 address-point=0x18ad188
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18ad158
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x30 -> 0xbbb9fb; score=10; direct-this-pointer,no-call; FDE=(12302843, 12302907)
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18ad150
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb9fb; score=11; sret-rdi-rsi; FDE=(12302843, 12302907)
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret

## score=36 address-point=0x18ad128
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb359; score=10; direct-this-pointer,no-call; FDE=(12301145, 12301189)
      bbb359:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb35c:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb360:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb364:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb367:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb36a:	48 83 c0 06          	add    rax,0x6
      bbb36e:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb371:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb374:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb377:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb37b:	48 0f bf 14 3a       	movsx  rdx,WORD PTR [rdx+rdi*1]
      bbb380:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb384:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18ad118
- +0x20 -> 0xbbb98a; score=3; scalar-return; FDE=(12302730, 12302757)
      bbb98a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb98d:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb991:	48 83 c0 02          	add    rax,0x2
      bbb995:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb998:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb99b:	48 8b 56 18          	mov    rdx,QWORD PTR [rsi+0x18]
      bbb99f:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb9a2:	89 02                	mov    DWORD PTR [rdx],eax
      bbb9a4:	c3                   	ret
- +0x28 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x30 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x38 -> 0xbbb359; score=11; sret-rdi-rsi; FDE=(12301145, 12301189)
      bbb359:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb35c:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb360:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb364:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb367:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb36a:	48 83 c0 06          	add    rax,0x6
      bbb36e:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb371:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb374:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb377:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb37b:	48 0f bf 14 3a       	movsx  rdx,WORD PTR [rdx+rdi*1]
      bbb380:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb384:	c3                   	ret

## score=36 address-point=0x18ad0f8
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb8c7; score=10; direct-this-pointer,no-call; FDE=(12302535, 12302571)
      bbb8c7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ca:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8ce:	48 83 c0 02          	add    rax,0x2
      bbb8d2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8d5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8d8:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbb8dc:	31 f6                	xor    esi,esi
      bbb8de:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb8e3:	40 0f 93 c6          	setae  sil
      bbb8e7:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb8ea:	c3                   	ret
- +0x38 -> 0xbbb10c; score=11; sret-rdi-rsi; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=36 address-point=0x18ad070
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb305; score=10; direct-this-pointer,no-call; FDE=(12301061, 12301095)
      bbb305:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb308:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb30c:	48 83 c0 02          	add    rax,0x2
      bbb310:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb313:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb316:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb319:	31 f6                	xor    esi,esi
      bbb31b:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb31f:	40 0f 93 c6          	setae  sil
      bbb323:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb326:	c3                   	ret
- +0x30 -> 0xbbbaec; score=10; direct-this-pointer,no-call; FDE=(12303084, 12303117)
      bbbaec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbaef:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbaf3:	48 83 c0 02          	add    rax,0x2
      bbbaf7:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbafa:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbbafd:	48 8b 04 8e          	mov    rax,QWORD PTR [rsi+rcx*4]
      bbbb01:	31 d2                	xor    edx,edx
      bbbb03:	48 f7 74 8e 08       	div    QWORD PTR [rsi+rcx*4+0x8]
      bbbb08:	48 89 04 8e          	mov    QWORD PTR [rsi+rcx*4],rax
      bbbb0c:	c3                   	ret
- +0x38 -> 0xbbb10c; score=11; sret-rdi-rsi; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=36 address-point=0x18ad040
- +0x20 -> 0xbbb140; score=3; scalar-return; FDE=(12300608, 12300652)
      bbb140:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb143:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb147:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb14b:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb14e:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb151:	48 83 c0 06          	add    rax,0x6
      bbb155:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb158:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb15b:	40 8a 7c 88 04       	mov    dil,BYTE PTR [rax+rcx*4+0x4]
      bbb160:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb163:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb167:	40 88 3c 02          	mov    BYTE PTR [rdx+rax*1],dil
      bbb16b:	c3                   	ret
- +0x28 -> 0xbbb3b0; score=10; direct-this-pointer,no-call; FDE=(12301232, 12301261)
      bbb3b0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb3b3:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb3b7:	48 83 c0 02          	add    rax,0x2
      bbb3bb:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb3be:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb3c1:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb3c4:	0f af 54 88 04       	imul   edx,DWORD PTR [rax+rcx*4+0x4]
      bbb3c9:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb3cc:	c3                   	ret
- +0x30 -> 0xbbb8eb; score=10; direct-this-pointer,no-call; FDE=(12302571, 12302596)
      bbb8eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ee:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8f2:	48 83 c0 02          	add    rax,0x2
      bbb8f6:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8f9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8fc:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb900:	09 14 88             	or     DWORD PTR [rax+rcx*4],edx
      bbb903:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18ad030
- +0x20 -> 0xbbb91f; score=3; scalar-return; FDE=(12302623, 12302652)
      bbb91f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb922:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb926:	48 83 c0 02          	add    rax,0x2
      bbb92a:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb92d:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb930:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb933:	99                   	cdq
      bbb934:	f7 7c 8e 04          	idiv   DWORD PTR [rsi+rcx*4+0x4]
      bbb938:	89 14 8e             	mov    DWORD PTR [rsi+rcx*4],edx
      bbb93b:	c3                   	ret
- +0x28 -> 0xbbb84b; score=10; direct-this-pointer,no-call; FDE=(12302411, 12302475)
      bbb84b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb84e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb852:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb856:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb859:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb85e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb862:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb865:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb869:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb86d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb870:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb874:	48 83 c0 0c          	add    rax,0xc
      bbb878:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb87b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb87e:	44 0f af 04 90       	imul   r8d,DWORD PTR [rax+rdx*4]
      bbb883:	45 01 c8             	add    r8d,r9d
      bbb886:	44 89 04 88          	mov    DWORD PTR [rax+rcx*4],r8d
      bbb88a:	c3                   	ret
- +0x30 -> 0xbbb140; score=10; direct-this-pointer,no-call; FDE=(12300608, 12300652)
      bbb140:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb143:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb147:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb14b:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb14e:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb151:	48 83 c0 06          	add    rax,0x6
      bbb155:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb158:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb15b:	40 8a 7c 88 04       	mov    dil,BYTE PTR [rax+rcx*4+0x4]
      bbb160:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb163:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb167:	40 88 3c 02          	mov    BYTE PTR [rdx+rax*1],dil
      bbb16b:	c3                   	ret
- +0x38 -> 0xbbb3b0; score=11; sret-rdi-rsi; FDE=(12301232, 12301261)
      bbb3b0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb3b3:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb3b7:	48 83 c0 02          	add    rax,0x2
      bbb3bb:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb3be:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb3c1:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb3c4:	0f af 54 88 04       	imul   edx,DWORD PTR [rax+rcx*4+0x4]
      bbb3c9:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb3cc:	c3                   	ret

## score=36 address-point=0x18ad020
- +0x20 -> 0xbbb665; score=3; scalar-return; FDE=(12301925, 12301955)
      bbb665:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb668:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb66c:	48 83 c0 02          	add    rax,0x2
      bbb670:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb673:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb676:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb679:	31 d2                	xor    edx,edx
      bbb67b:	f7 74 8e 04          	div    DWORD PTR [rsi+rcx*4+0x4]
      bbb67f:	89 04 8e             	mov    DWORD PTR [rsi+rcx*4],eax
      bbb682:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb91f; score=10; direct-this-pointer,no-call; FDE=(12302623, 12302652)
      bbb91f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb922:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb926:	48 83 c0 02          	add    rax,0x2
      bbb92a:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb92d:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb930:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb933:	99                   	cdq
      bbb934:	f7 7c 8e 04          	idiv   DWORD PTR [rsi+rcx*4+0x4]
      bbb938:	89 14 8e             	mov    DWORD PTR [rsi+rcx*4],edx
      bbb93b:	c3                   	ret
- +0x38 -> 0xbbb84b; score=11; sret-rdi-rsi; FDE=(12302411, 12302475)
      bbb84b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb84e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb852:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb856:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb859:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb85e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb862:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb865:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb869:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb86d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb870:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb874:	48 83 c0 0c          	add    rax,0xc
      bbb878:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb87b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb87e:	44 0f af 04 90       	imul   r8d,DWORD PTR [rax+rdx*4]
      bbb883:	45 01 c8             	add    r8d,r9d
      bbb886:	44 89 04 88          	mov    DWORD PTR [rax+rcx*4],r8d
      bbb88a:	c3                   	ret

## score=36 address-point=0x18ad010
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb665; score=10; direct-this-pointer,no-call; FDE=(12301925, 12301955)
      bbb665:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb668:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb66c:	48 83 c0 02          	add    rax,0x2
      bbb670:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb673:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb676:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb679:	31 d2                	xor    edx,edx
      bbb67b:	f7 74 8e 04          	div    DWORD PTR [rsi+rcx*4+0x4]
      bbb67f:	89 04 8e             	mov    DWORD PTR [rsi+rcx*4],eax
      bbb682:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18acff0
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb757; score=10; direct-this-pointer,no-call; FDE=(12302167, 12302211)
      bbb757:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb75a:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb75e:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb762:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb765:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb768:	48 83 c0 06          	add    rax,0x6
      bbb76c:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb76f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb772:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb775:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb779:	48 0f be 14 3a       	movsx  rdx,BYTE PTR [rdx+rdi*1]
      bbb77e:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb782:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18acfc0
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbbb5d; score=10; direct-this-pointer,no-call; FDE=(12303197, 12303224)
      bbbb5d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbb60:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbb64:	48 83 c0 02          	add    rax,0x2
      bbbb68:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbb6b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbb6e:	48 8b 54 88 08       	mov    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbbb73:	48 09 14 88          	or     QWORD PTR [rax+rcx*4],rdx
      bbbb77:	c3                   	ret
- +0x38 -> 0xbbb960; score=11; sret-rdi-rsi; FDE=(12302688, 12302730)
      bbb960:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb963:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb967:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb96b:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb96e:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb971:	48 83 c0 06          	add    rax,0x6
      bbb975:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb978:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb97b:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb97e:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb982:	8b 14 3a             	mov    edx,DWORD PTR [rdx+rdi*1]
      bbb985:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb989:	c3                   	ret

## score=36 address-point=0x18acfa0
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb2c5; score=10; direct-this-pointer,no-call; FDE=(12300997, 12301061)
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret
- +0x30 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18acf88
- +0x20 -> 0xbbb56d; score=3; scalar-return; FDE=(12301677, 12301719)
      bbb56d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb570:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb574:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb578:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb57b:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb57e:	48 83 c0 06          	add    rax,0x6
      bbb582:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb585:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb588:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb58b:	8b 44 88 04          	mov    eax,DWORD PTR [rax+rcx*4+0x4]
      bbb58f:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb593:	89 04 3a             	mov    DWORD PTR [rdx+rdi*1],eax
      bbb596:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbb0f4; score=11; sret-rdi-rsi; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=36 address-point=0x18acf80
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb56d; score=10; direct-this-pointer,no-call; FDE=(12301677, 12301719)
      bbb56d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb570:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb574:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb578:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb57b:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb57e:	48 83 c0 06          	add    rax,0x6
      bbb582:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb585:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb588:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb58b:	8b 44 88 04          	mov    eax,DWORD PTR [rax+rcx*4+0x4]
      bbb58f:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb593:	89 04 3a             	mov    DWORD PTR [rdx+rdi*1],eax
      bbb596:	c3                   	ret
- +0x30 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x38 -> 0xbbb10c; score=11; sret-rdi-rsi; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=36 address-point=0x18acf68
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x30 -> 0xbbb4fa; score=10; direct-this-pointer,no-call; FDE=(12301562, 12301588)
      bbb4fa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb4fd:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb501:	48 83 c0 02          	add    rax,0x2
      bbb505:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb508:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb50b:	8a 4c 90 08          	mov    cl,BYTE PTR [rax+rdx*4+0x8]
      bbb50f:	48 d3 0c 90          	ror    QWORD PTR [rax+rdx*4],cl
      bbb513:	c3                   	ret
- +0x38 -> 0xbbb0f4; score=11; sret-rdi-rsi; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=36 address-point=0x18acf50
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb0f4; score=11; sret-rdi-rsi; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=36 address-point=0x18acf40
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18ace98
- +0x20 -> 0xbbb683; score=3; scalar-return; FDE=(12301955, 12301999)
      bbb683:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb686:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb68a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb68e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb691:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb694:	48 83 c0 06          	add    rax,0x6
      bbb698:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb69b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb69e:	0f b7 7c 88 04       	movzx  edi,WORD PTR [rax+rcx*4+0x4]
      bbb6a3:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb6a6:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb6aa:	66 89 3c 02          	mov    WORD PTR [rdx+rax*1],di
      bbb6ae:	c3                   	ret
- +0x28 -> 0xbbb327; score=10; direct-this-pointer,no-call; FDE=(12301095, 12301120)
      bbb327:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb32a:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb32e:	48 83 c0 02          	add    rax,0x2
      bbb332:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb335:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb338:	8a 4c 90 04          	mov    cl,BYTE PTR [rax+rdx*4+0x4]
      bbb33c:	d3 2c 90             	shr    DWORD PTR [rax+rdx*4],cl
      bbb33f:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18ace88
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb683; score=10; direct-this-pointer,no-call; FDE=(12301955, 12301999)
      bbb683:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb686:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb68a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb68e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb691:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb694:	48 83 c0 06          	add    rax,0x6
      bbb698:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb69b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb69e:	0f b7 7c 88 04       	movzx  edi,WORD PTR [rax+rcx*4+0x4]
      bbb6a3:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb6a6:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb6aa:	66 89 3c 02          	mov    WORD PTR [rdx+rax*1],di
      bbb6ae:	c3                   	ret
- +0x38 -> 0xbbb327; score=11; sret-rdi-rsi; FDE=(12301095, 12301120)
      bbb327:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb32a:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb32e:	48 83 c0 02          	add    rax,0x2
      bbb332:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb335:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb338:	8a 4c 90 04          	mov    cl,BYTE PTR [rax+rdx*4+0x4]
      bbb33c:	d3 2c 90             	shr    DWORD PTR [rax+rdx*4],cl
      bbb33f:	c3                   	ret

## score=36 address-point=0x18acde8
- +0x20 -> 0xbbb88b; score=3; scalar-return; FDE=(12302475, 12302504)
      bbb88b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb88e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb892:	48 83 c0 02          	add    rax,0x2
      bbb896:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb899:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb89c:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb89f:	99                   	cdq
      bbb8a0:	f7 7c 8e 04          	idiv   DWORD PTR [rsi+rcx*4+0x4]
      bbb8a4:	89 04 8e             	mov    DWORD PTR [rsi+rcx*4],eax
      bbb8a7:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x38 -> 0xbbba3b; score=11; sret-rdi-rsi; FDE=(12302907, 12302943)
      bbba3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba3e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba42:	48 83 c0 02          	add    rax,0x2
      bbba46:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba49:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba4c:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbba50:	31 f6                	xor    esi,esi
      bbba52:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbba57:	40 0f 94 c6          	sete   sil
      bbba5b:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbba5e:	c3                   	ret

## score=36 address-point=0x18acda8
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x38 -> 0xbbbbdf; score=11; sret-rdi-rsi; FDE=(12303327, 12303363)
      bbbbdf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbbe2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbbe6:	48 83 c0 02          	add    rax,0x2
      bbbbea:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbbed:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbbf0:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbbbf4:	31 f6                	xor    esi,esi
      bbbbf6:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbbbfb:	40 0f 9e c6          	setle  sil
      bbbbff:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbbc02:	c3                   	ret

## score=36 address-point=0x18acd98
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x38 -> 0xbbb10c; score=11; sret-rdi-rsi; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=36 address-point=0x18acd88
- +0x20 -> 0xbbb801; score=3; scalar-return; FDE=(12302337, 12302381)
      bbb801:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb804:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb808:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb80c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb80f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb812:	48 83 c0 06          	add    rax,0x6
      bbb816:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb819:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb81c:	48 8b 7c 88 04       	mov    rdi,QWORD PTR [rax+rcx*4+0x4]
      bbb821:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb824:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb828:	48 89 3c 02          	mov    QWORD PTR [rdx+rax*1],rdi
      bbb82c:	c3                   	ret
- +0x28 -> 0xbbbaaf; score=10; direct-this-pointer,no-call; FDE=(12303023, 12303057)
      bbbaaf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbab2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbab6:	48 83 c0 02          	add    rax,0x2
      bbbaba:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbabd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbac0:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbbac3:	31 f6                	xor    esi,esi
      bbbac5:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbbac9:	40 0f 9d c6          	setge  sil
      bbbacd:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbbad0:	c3                   	ret
- +0x30 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18acd50
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18acd18
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb340; score=10; direct-this-pointer,no-call; FDE=(12301120, 12301145)
      bbb340:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb343:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb347:	48 83 c0 02          	add    rax,0x2
      bbb34b:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb34e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb351:	8a 4c 90 04          	mov    cl,BYTE PTR [rax+rdx*4+0x4]
      bbb355:	d3 3c 90             	sar    DWORD PTR [rax+rdx*4],cl
      bbb358:	c3                   	ret
- +0x38 -> 0xbbb4df; score=11; sret-rdi-rsi; FDE=(12301535, 12301562)
      bbb4df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb4e2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb4e6:	48 83 c0 02          	add    rax,0x2
      bbb4ea:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb4ed:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb4f0:	48 8b 56 18          	mov    rdx,QWORD PTR [rsi+0x18]
      bbb4f4:	8b 12                	mov    edx,DWORD PTR [rdx]
      bbb4f6:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb4f9:	c3                   	ret

## score=36 address-point=0x18accd8
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb4c6; score=10; direct-this-pointer,no-call; FDE=(12301510, 12301535)
      bbb4c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb4c9:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb4cd:	48 83 c0 02          	add    rax,0x2
      bbb4d1:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb4d4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb4d7:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb4da:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb4de:	c3                   	ret
- +0x30 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18acc90
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x30 -> 0xbbb22b; score=10; direct-this-pointer,no-call; FDE=(12300843, 12300868)
      bbb22b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb22e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb232:	48 83 c0 02          	add    rax,0x2
      bbb236:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb239:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb23c:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb240:	29 14 88             	sub    DWORD PTR [rax+rcx*4],edx
      bbb243:	c3                   	ret
- +0x38 -> 0xbbb618; score=11; sret-rdi-rsi; FDE=(12301848, 12301891)
      bbb618:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb61b:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb61f:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb623:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb626:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb629:	48 83 c0 06          	add    rax,0x6
      bbb62d:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb630:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb633:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb636:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb63a:	48 63 14 3a          	movsxd rdx,DWORD PTR [rdx+rdi*1]
      bbb63e:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb642:	c3                   	ret

## score=36 address-point=0x18acc88
- +0x20 -> 0xbbb1ec; score=3; scalar-return; FDE=(12300780, 12300810)
      bbb1ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb1ef:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb1f3:	48 83 c0 02          	add    rax,0x2
      bbb1f7:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb1fa:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb1fd:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb200:	31 d2                	xor    edx,edx
      bbb202:	f7 74 8e 04          	div    DWORD PTR [rsi+rcx*4+0x4]
      bbb206:	89 14 8e             	mov    DWORD PTR [rsi+rcx*4],edx
      bbb209:	c3                   	ret
- +0x28 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb22b; score=11; sret-rdi-rsi; FDE=(12300843, 12300868)
      bbb22b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb22e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb232:	48 83 c0 02          	add    rax,0x2
      bbb236:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb239:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb23c:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb240:	29 14 88             	sub    DWORD PTR [rax+rcx*4],edx
      bbb243:	c3                   	ret

## score=36 address-point=0x18acc60
- +0x20 -> 0xbbb56d; score=3; scalar-return; FDE=(12301677, 12301719)
      bbb56d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb570:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb574:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb578:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb57b:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb57e:	48 83 c0 06          	add    rax,0x6
      bbb582:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb585:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb588:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb58b:	8b 44 88 04          	mov    eax,DWORD PTR [rax+rcx*4+0x4]
      bbb58f:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb593:	89 04 3a             	mov    DWORD PTR [rdx+rdi*1],eax
      bbb596:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x38 -> 0xbbba5f; score=11; sret-rdi-rsi; FDE=(12302943, 12302975)
      bbba5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba62:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba66:	48 83 c0 02          	add    rax,0x2
      bbba6a:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba6d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba70:	48 8b 54 88 08       	mov    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbba75:	48 0f af 14 88       	imul   rdx,QWORD PTR [rax+rcx*4]
      bbba7a:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbba7e:	c3                   	ret

## score=36 address-point=0x18acc48
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbb56d; score=11; sret-rdi-rsi; FDE=(12301677, 12301719)
      bbb56d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb570:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb574:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb578:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb57b:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb57e:	48 83 c0 06          	add    rax,0x6
      bbb582:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb585:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb588:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb58b:	8b 44 88 04          	mov    eax,DWORD PTR [rax+rcx*4+0x4]
      bbb58f:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb593:	89 04 3a             	mov    DWORD PTR [rdx+rdi*1],eax
      bbb596:	c3                   	ret

## score=36 address-point=0x18acc38
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x38 -> 0xbbb10c; score=11; sret-rdi-rsi; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=36 address-point=0x18acc18
- +0x20 -> 0xbbb5e3; score=3; scalar-return; FDE=(12301795, 12301848)
      bbb5e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb5e6:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb5ea:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb5ee:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb5f1:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb5f4:	4c 8d 40 06          	lea    r8,[rax+0x6]
      bbb5f8:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb5fb:	4c 8b 40 06          	mov    r8,QWORD PTR [rax+0x6]
      bbb5ff:	48 83 c0 0e          	add    rax,0xe
      bbb603:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb606:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb609:	48 0f af c2          	imul   rax,rdx
      bbb60d:	4c 01 c0             	add    rax,r8
      bbb610:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb613:	48 89 04 8a          	mov    QWORD PTR [rdx+rcx*4],rax
      bbb617:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb2c5; score=11; sret-rdi-rsi; FDE=(12300997, 12301061)
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret

## score=36 address-point=0x18acc00
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbb5e3; score=11; sret-rdi-rsi; FDE=(12301795, 12301848)
      bbb5e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb5e6:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb5ea:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb5ee:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb5f1:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb5f4:	4c 8d 40 06          	lea    r8,[rax+0x6]
      bbb5f8:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb5fb:	4c 8b 40 06          	mov    r8,QWORD PTR [rax+0x6]
      bbb5ff:	48 83 c0 0e          	add    rax,0xe
      bbb603:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb606:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb609:	48 0f af c2          	imul   rax,rdx
      bbb60d:	4c 01 c0             	add    rax,r8
      bbb610:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb613:	48 89 04 8a          	mov    QWORD PTR [rdx+rcx*4],rax
      bbb617:	c3                   	ret

## score=36 address-point=0x18acb90
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb6c9; score=10; direct-this-pointer,no-call; FDE=(12302025, 12302059)
      bbb6c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb6cc:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb6d0:	48 83 c0 02          	add    rax,0x2
      bbb6d4:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb6d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb6da:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb6dd:	31 f6                	xor    esi,esi
      bbb6df:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb6e3:	40 0f 9c c6          	setl   sil
      bbb6e7:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb6ea:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbb10c; score=11; sret-rdi-rsi; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=36 address-point=0x18acb50
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbbc62; score=10; direct-this-pointer,no-call; FDE=(12303458, 12303506)
      bbbc62:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc65:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbc69:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbc6d:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbc70:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbbc73:	48 83 c0 06          	add    rax,0x6
      bbbc77:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc7a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc7d:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbbc80:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbc84:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc87:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbc8b:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbbc8e:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbbc91:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18acb08
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb904; score=10; direct-this-pointer,no-call; FDE=(12302596, 12302623)
      bbb904:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb907:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb90b:	48 83 c0 02          	add    rax,0x2
      bbb90f:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb912:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb915:	48 8b 54 88 08       	mov    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb91a:	48 21 14 88          	and    QWORD PTR [rax+rcx*4],rdx
      bbb91e:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18acaf0
- +0x20 -> 0xbbb683; score=3; scalar-return; FDE=(12301955, 12301999)
      bbb683:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb686:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb68a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb68e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb691:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb694:	48 83 c0 06          	add    rax,0x6
      bbb698:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb69b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb69e:	0f b7 7c 88 04       	movzx  edi,WORD PTR [rax+rcx*4+0x4]
      bbb6a3:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb6a6:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb6aa:	66 89 3c 02          	mov    WORD PTR [rdx+rax*1],di
      bbb6ae:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbb0f4; score=11; sret-rdi-rsi; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=36 address-point=0x18acae8
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb683; score=10; direct-this-pointer,no-call; FDE=(12301955, 12301999)
      bbb683:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb686:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb68a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb68e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb691:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb694:	48 83 c0 06          	add    rax,0x6
      bbb698:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb69b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb69e:	0f b7 7c 88 04       	movzx  edi,WORD PTR [rax+rcx*4+0x4]
      bbb6a3:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb6a6:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb6aa:	66 89 3c 02          	mov    WORD PTR [rdx+rax*1],di
      bbb6ae:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbb10c; score=11; sret-rdi-rsi; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=36 address-point=0x18aca90
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbb10c; score=11; sret-rdi-rsi; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=36 address-point=0x18aca30
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb6af; score=11; sret-rdi-rsi; FDE=(12301999, 12302025)
      bbb6af:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb6b2:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb6b6:	48 83 c0 02          	add    rax,0x2
      bbb6ba:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb6bd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb6c0:	8a 4c 90 08          	mov    cl,BYTE PTR [rax+rdx*4+0x8]
      bbb6c4:	48 d3 24 90          	shl    QWORD PTR [rax+rdx*4],cl
      bbb6c8:	c3                   	ret

## score=36 address-point=0x18ac9c8
- +0x20 -> 0xbbb140; score=3; scalar-return; FDE=(12300608, 12300652)
      bbb140:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb143:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb147:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb14b:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb14e:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb151:	48 83 c0 06          	add    rax,0x6
      bbb155:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb158:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb15b:	40 8a 7c 88 04       	mov    dil,BYTE PTR [rax+rcx*4+0x4]
      bbb160:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb163:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb167:	40 88 3c 02          	mov    BYTE PTR [rdx+rax*1],dil
      bbb16b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb4a4; score=10; direct-this-pointer,no-call; FDE=(12301476, 12301510)
      bbb4a4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb4a7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb4ab:	48 83 c0 02          	add    rax,0x2
      bbb4af:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb4b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb4b5:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb4b8:	31 f6                	xor    esi,esi
      bbb4ba:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb4be:	40 0f 9e c6          	setle  sil
      bbb4c2:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb4c5:	c3                   	ret
- +0x38 -> 0xbbb0f4; score=11; sret-rdi-rsi; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=36 address-point=0x18ac9a8
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb1a8; score=10; direct-this-pointer,no-call; FDE=(12300712, 12300746)
      bbb1a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb1ab:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb1af:	48 83 c0 02          	add    rax,0x2
      bbb1b3:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb1b6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb1b9:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb1bc:	31 f6                	xor    esi,esi
      bbb1be:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb1c2:	40 0f 97 c6          	seta   sil
      bbb1c6:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb1c9:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18ac960
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb9fb; score=10; direct-this-pointer,no-call; FDE=(12302843, 12302907)
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
- +0x30 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x38 -> 0xbbb514; score=11; sret-rdi-rsi; FDE=(12301588, 12301613)
      bbb514:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb517:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb51b:	48 83 c0 02          	add    rax,0x2
      bbb51f:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb522:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb525:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb529:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb52c:	c3                   	ret

## score=36 address-point=0x18ac958
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x30 -> 0xbbb9fb; score=10; direct-this-pointer,no-call; FDE=(12302843, 12302907)
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18ac920
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb359; score=10; direct-this-pointer,no-call; FDE=(12301145, 12301189)
      bbb359:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb35c:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb360:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb364:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb367:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb36a:	48 83 c0 06          	add    rax,0x6
      bbb36e:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb371:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb374:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb377:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb37b:	48 0f bf 14 3a       	movsx  rdx,WORD PTR [rdx+rdi*1]
      bbb380:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb384:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18ac918
- +0x20 -> 0xbbb98a; score=3; scalar-return; FDE=(12302730, 12302757)
      bbb98a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb98d:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb991:	48 83 c0 02          	add    rax,0x2
      bbb995:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb998:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb99b:	48 8b 56 18          	mov    rdx,QWORD PTR [rsi+0x18]
      bbb99f:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb9a2:	89 02                	mov    DWORD PTR [rdx],eax
      bbb9a4:	c3                   	ret
- +0x28 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x30 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x38 -> 0xbbb359; score=11; sret-rdi-rsi; FDE=(12301145, 12301189)
      bbb359:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb35c:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb360:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb364:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb367:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb36a:	48 83 c0 06          	add    rax,0x6
      bbb36e:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb371:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb374:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb377:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb37b:	48 0f bf 14 3a       	movsx  rdx,WORD PTR [rdx+rdi*1]
      bbb380:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb384:	c3                   	ret

## score=36 address-point=0x18ac888
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb9a5; score=10; direct-this-pointer,no-call; FDE=(12302757, 12302783)
      bbb9a5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9a8:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb9ac:	48 83 c0 02          	add    rax,0x2
      bbb9b0:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb9b3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9b6:	8a 4c 90 08          	mov    cl,BYTE PTR [rax+rdx*4+0x8]
      bbb9ba:	48 d3 2c 90          	shr    QWORD PTR [rax+rdx*4],cl
      bbb9be:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbbc3e; score=11; sret-rdi-rsi; FDE=(12303422, 12303458)
      bbbc3e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc41:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbc45:	48 83 c0 02          	add    rax,0x2
      bbbc49:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc4c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc4f:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbbc53:	31 f6                	xor    esi,esi
      bbbc55:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbbc5a:	40 0f 9d c6          	setge  sil
      bbbc5e:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbbc61:	c3                   	ret

## score=36 address-point=0x18ac840
- +0x20 -> 0xbbb140; score=3; scalar-return; FDE=(12300608, 12300652)
      bbb140:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb143:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb147:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb14b:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb14e:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb151:	48 83 c0 06          	add    rax,0x6
      bbb155:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb158:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb15b:	40 8a 7c 88 04       	mov    dil,BYTE PTR [rax+rcx*4+0x4]
      bbb160:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb163:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb167:	40 88 3c 02          	mov    BYTE PTR [rdx+rax*1],dil
      bbb16b:	c3                   	ret
- +0x28 -> 0x13d1bd5; score=10; direct-this-pointer,no-call; FDE=(20782037, 20782066)
     13d1bd5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13d1bd8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
     13d1bdc:	48 83 c0 02          	add    rax,0x2
     13d1be0:	48 89 07             	mov    QWORD PTR [rdi],rax
     13d1be3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     13d1be6:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
     13d1bea:	0f af 14 88          	imul   edx,DWORD PTR [rax+rcx*4]
     13d1bee:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
     13d1bf1:	c3                   	ret
- +0x30 -> 0xbbb8eb; score=10; direct-this-pointer,no-call; FDE=(12302571, 12302596)
      bbb8eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ee:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8f2:	48 83 c0 02          	add    rax,0x2
      bbb8f6:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8f9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8fc:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb900:	09 14 88             	or     DWORD PTR [rax+rcx*4],edx
      bbb903:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18ac830
- +0x20 -> 0xbbb91f; score=3; scalar-return; FDE=(12302623, 12302652)
      bbb91f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb922:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb926:	48 83 c0 02          	add    rax,0x2
      bbb92a:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb92d:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb930:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb933:	99                   	cdq
      bbb934:	f7 7c 8e 04          	idiv   DWORD PTR [rsi+rcx*4+0x4]
      bbb938:	89 14 8e             	mov    DWORD PTR [rsi+rcx*4],edx
      bbb93b:	c3                   	ret
- +0x28 -> 0xbbb84b; score=10; direct-this-pointer,no-call; FDE=(12302411, 12302475)
      bbb84b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb84e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb852:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb856:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb859:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb85e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb862:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb865:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb869:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb86d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb870:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb874:	48 83 c0 0c          	add    rax,0xc
      bbb878:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb87b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb87e:	44 0f af 04 90       	imul   r8d,DWORD PTR [rax+rdx*4]
      bbb883:	45 01 c8             	add    r8d,r9d
      bbb886:	44 89 04 88          	mov    DWORD PTR [rax+rcx*4],r8d
      bbb88a:	c3                   	ret
- +0x30 -> 0xbbb140; score=10; direct-this-pointer,no-call; FDE=(12300608, 12300652)
      bbb140:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb143:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb147:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb14b:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb14e:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb151:	48 83 c0 06          	add    rax,0x6
      bbb155:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb158:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb15b:	40 8a 7c 88 04       	mov    dil,BYTE PTR [rax+rcx*4+0x4]
      bbb160:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb163:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb167:	40 88 3c 02          	mov    BYTE PTR [rdx+rax*1],dil
      bbb16b:	c3                   	ret
- +0x38 -> 0x13d1bd5; score=11; sret-rdi-rsi; FDE=(20782037, 20782066)
     13d1bd5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13d1bd8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
     13d1bdc:	48 83 c0 02          	add    rax,0x2
     13d1be0:	48 89 07             	mov    QWORD PTR [rdi],rax
     13d1be3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     13d1be6:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
     13d1bea:	0f af 14 88          	imul   edx,DWORD PTR [rax+rcx*4]
     13d1bee:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
     13d1bf1:	c3                   	ret

## score=36 address-point=0x18ac820
- +0x20 -> 0xbbb665; score=3; scalar-return; FDE=(12301925, 12301955)
      bbb665:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb668:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb66c:	48 83 c0 02          	add    rax,0x2
      bbb670:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb673:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb676:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb679:	31 d2                	xor    edx,edx
      bbb67b:	f7 74 8e 04          	div    DWORD PTR [rsi+rcx*4+0x4]
      bbb67f:	89 04 8e             	mov    DWORD PTR [rsi+rcx*4],eax
      bbb682:	c3                   	ret
- +0x28 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x30 -> 0xbbb91f; score=10; direct-this-pointer,no-call; FDE=(12302623, 12302652)
      bbb91f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb922:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb926:	48 83 c0 02          	add    rax,0x2
      bbb92a:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb92d:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb930:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb933:	99                   	cdq
      bbb934:	f7 7c 8e 04          	idiv   DWORD PTR [rsi+rcx*4+0x4]
      bbb938:	89 14 8e             	mov    DWORD PTR [rsi+rcx*4],edx
      bbb93b:	c3                   	ret
- +0x38 -> 0xbbb84b; score=11; sret-rdi-rsi; FDE=(12302411, 12302475)
      bbb84b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb84e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb852:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb856:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb859:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb85e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb862:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb865:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb869:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb86d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb870:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb874:	48 83 c0 0c          	add    rax,0xc
      bbb878:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb87b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb87e:	44 0f af 04 90       	imul   r8d,DWORD PTR [rax+rdx*4]
      bbb883:	45 01 c8             	add    r8d,r9d
      bbb886:	44 89 04 88          	mov    DWORD PTR [rax+rcx*4],r8d
      bbb88a:	c3                   	ret

## score=36 address-point=0x18ac818
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb665; score=10; direct-this-pointer,no-call; FDE=(12301925, 12301955)
      bbb665:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb668:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb66c:	48 83 c0 02          	add    rax,0x2
      bbb670:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb673:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb676:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb679:	31 d2                	xor    edx,edx
      bbb67b:	f7 74 8e 04          	div    DWORD PTR [rsi+rcx*4+0x4]
      bbb67f:	89 04 8e             	mov    DWORD PTR [rsi+rcx*4],eax
      bbb682:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb91f; score=11; sret-rdi-rsi; FDE=(12302623, 12302652)
      bbb91f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb922:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb926:	48 83 c0 02          	add    rax,0x2
      bbb92a:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb92d:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb930:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb933:	99                   	cdq
      bbb934:	f7 7c 8e 04          	idiv   DWORD PTR [rsi+rcx*4+0x4]
      bbb938:	89 14 8e             	mov    DWORD PTR [rsi+rcx*4],edx
      bbb93b:	c3                   	ret

## score=36 address-point=0x18ac808
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x38 -> 0xbbb665; score=11; sret-rdi-rsi; FDE=(12301925, 12301955)
      bbb665:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb668:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb66c:	48 83 c0 02          	add    rax,0x2
      bbb670:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb673:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb676:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb679:	31 d2                	xor    edx,edx
      bbb67b:	f7 74 8e 04          	div    DWORD PTR [rsi+rcx*4+0x4]
      bbb67f:	89 04 8e             	mov    DWORD PTR [rsi+rcx*4],eax
      bbb682:	c3                   	ret

## score=36 address-point=0x18ac798
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x30 -> 0xbbb2c5; score=10; direct-this-pointer,no-call; FDE=(12300997, 12301061)
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18ac790
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb2c5; score=11; sret-rdi-rsi; FDE=(12300997, 12301061)
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret

## score=36 address-point=0x18ac788
- +0x20 -> 0xbbb56d; score=3; scalar-return; FDE=(12301677, 12301719)
      bbb56d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb570:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb574:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb578:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb57b:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb57e:	48 83 c0 06          	add    rax,0x6
      bbb582:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb585:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb588:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb58b:	8b 44 88 04          	mov    eax,DWORD PTR [rax+rcx*4+0x4]
      bbb58f:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb593:	89 04 3a             	mov    DWORD PTR [rdx+rdi*1],eax
      bbb596:	c3                   	ret
- +0x28 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x30 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18ac780
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb56d; score=10; direct-this-pointer,no-call; FDE=(12301677, 12301719)
      bbb56d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb570:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb574:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb578:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb57b:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb57e:	48 83 c0 06          	add    rax,0x6
      bbb582:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb585:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb588:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb58b:	8b 44 88 04          	mov    eax,DWORD PTR [rax+rcx*4+0x4]
      bbb58f:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb593:	89 04 3a             	mov    DWORD PTR [rdx+rdi*1],eax
      bbb596:	c3                   	ret
- +0x30 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x38 -> 0xbbb0f4; score=11; sret-rdi-rsi; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=36 address-point=0x18ac6d8
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x30 -> 0xbbb3cd; score=10; direct-this-pointer,no-call; FDE=(12301261, 12301297)
      bbb3cd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb3d0:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb3d4:	48 83 c0 02          	add    rax,0x2
      bbb3d8:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb3db:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb3de:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbb3e2:	31 f6                	xor    esi,esi
      bbb3e4:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb3e9:	40 0f 96 c6          	setbe  sil
      bbb3ed:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb3f0:	c3                   	ret
- +0x38 -> 0xbbb783; score=11; sret-rdi-rsi; FDE=(12302211, 12302269)
      bbb783:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb786:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb78a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb78e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb791:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb794:	48 83 c0 06          	add    rax,0x6
      bbb798:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb79b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb79e:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7a1:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb7a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7a8:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7ac:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbb7af:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbb7b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7b5:	0f be 14 88          	movsx  edx,BYTE PTR [rax+rcx*4]
      bbb7b9:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb7bc:	c3                   	ret

## score=36 address-point=0x18ac6d0
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb3cd; score=11; sret-rdi-rsi; FDE=(12301261, 12301297)
      bbb3cd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb3d0:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb3d4:	48 83 c0 02          	add    rax,0x2
      bbb3d8:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb3db:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb3de:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbb3e2:	31 f6                	xor    esi,esi
      bbb3e4:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb3e9:	40 0f 96 c6          	setbe  sil
      bbb3ed:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb3f0:	c3                   	ret

## score=36 address-point=0x18ac6a8
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbb385; score=11; sret-rdi-rsi; FDE=(12301189, 12301232)
      bbb385:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb388:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb38c:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb390:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb393:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb396:	48 83 c0 06          	add    rax,0x6
      bbb39a:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb39d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb3a0:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb3a3:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb3a7:	0f b6 14 3a          	movzx  edx,BYTE PTR [rdx+rdi*1]
      bbb3ab:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb3af:	c3                   	ret

## score=36 address-point=0x18ac698
- +0x20 -> 0xbbb683; score=3; scalar-return; FDE=(12301955, 12301999)
      bbb683:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb686:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb68a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb68e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb691:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb694:	48 83 c0 06          	add    rax,0x6
      bbb698:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb69b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb69e:	0f b7 7c 88 04       	movzx  edi,WORD PTR [rax+rcx*4+0x4]
      bbb6a3:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb6a6:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb6aa:	66 89 3c 02          	mov    WORD PTR [rdx+rax*1],di
      bbb6ae:	c3                   	ret
- +0x28 -> 0xbbb327; score=10; direct-this-pointer,no-call; FDE=(12301095, 12301120)
      bbb327:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb32a:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb32e:	48 83 c0 02          	add    rax,0x2
      bbb332:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb335:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb338:	8a 4c 90 04          	mov    cl,BYTE PTR [rax+rdx*4+0x4]
      bbb33c:	d3 2c 90             	shr    DWORD PTR [rax+rdx*4],cl
      bbb33f:	c3                   	ret
- +0x30 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18ac630
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbbb0d; score=10; direct-this-pointer,no-call; FDE=(12303117, 12303161)
      bbbb0d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbb10:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbb14:	48 83 c0 02          	add    rax,0x2
      bbbb18:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbb1b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbb1e:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbbb22:	48 8b 74 88 08       	mov    rsi,QWORD PTR [rax+rcx*4+0x8]
      bbbb27:	48 8d 3c 16          	lea    rdi,[rsi+rdx*1]
      bbbb2b:	48 21 d6             	and    rsi,rdx
      bbbb2e:	48 01 f6             	add    rsi,rsi
      bbbb31:	48 29 f7             	sub    rdi,rsi
      bbbb34:	48 89 3c 88          	mov    QWORD PTR [rax+rcx*4],rdi
      bbbb38:	c3                   	ret
- +0x30 -> 0xbbb41c; score=10; direct-this-pointer,no-call; FDE=(12301340, 12301376)
      bbb41c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb41f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb423:	48 83 c0 02          	add    rax,0x2
      bbb427:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb42a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb42d:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbb431:	31 f6                	xor    esi,esi
      bbb433:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb438:	40 0f 9c c6          	setl   sil
      bbb43c:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb43f:	c3                   	ret
- +0x38 -> 0xbbb10c; score=11; sret-rdi-rsi; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=36 address-point=0x18ac5e8
- +0x20 -> 0xbbb88b; score=3; scalar-return; FDE=(12302475, 12302504)
      bbb88b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb88e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb892:	48 83 c0 02          	add    rax,0x2
      bbb896:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb899:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb89c:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb89f:	99                   	cdq
      bbb8a0:	f7 7c 8e 04          	idiv   DWORD PTR [rsi+rcx*4+0x4]
      bbb8a4:	89 04 8e             	mov    DWORD PTR [rsi+rcx*4],eax
      bbb8a7:	c3                   	ret
- +0x28 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x30 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x38 -> 0xbbba3b; score=11; sret-rdi-rsi; FDE=(12302907, 12302943)
      bbba3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba3e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba42:	48 83 c0 02          	add    rax,0x2
      bbba46:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba49:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba4c:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbba50:	31 f6                	xor    esi,esi
      bbba52:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbba57:	40 0f 94 c6          	sete   sil
      bbba5b:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbba5e:	c3                   	ret

## score=36 address-point=0x18ac5d8
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x30 -> 0xbbb88b; score=10; direct-this-pointer,no-call; FDE=(12302475, 12302504)
      bbb88b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb88e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb892:	48 83 c0 02          	add    rax,0x2
      bbb896:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb899:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb89c:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb89f:	99                   	cdq
      bbb8a0:	f7 7c 8e 04          	idiv   DWORD PTR [rsi+rcx*4+0x4]
      bbb8a4:	89 04 8e             	mov    DWORD PTR [rsi+rcx*4],eax
      bbb8a7:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18ac5a0
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18ac588
- +0x20 -> 0xbbb801; score=3; scalar-return; FDE=(12302337, 12302381)
      bbb801:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb804:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb808:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb80c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb80f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb812:	48 83 c0 06          	add    rax,0x6
      bbb816:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb819:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb81c:	48 8b 7c 88 04       	mov    rdi,QWORD PTR [rax+rcx*4+0x4]
      bbb821:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb824:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb828:	48 89 3c 02          	mov    QWORD PTR [rdx+rax*1],rdi
      bbb82c:	c3                   	ret
- +0x28 -> 0xbbbaaf; score=10; direct-this-pointer,no-call; FDE=(12303023, 12303057)
      bbbaaf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbab2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbab6:	48 83 c0 02          	add    rax,0x2
      bbbaba:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbabd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbac0:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbbac3:	31 f6                	xor    esi,esi
      bbbac5:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbbac9:	40 0f 9d c6          	setge  sil
      bbbacd:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbbad0:	c3                   	ret
- +0x30 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x38 -> 0xbbb0f4; score=11; sret-rdi-rsi; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=36 address-point=0x18ac580
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb801; score=10; direct-this-pointer,no-call; FDE=(12302337, 12302381)
      bbb801:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb804:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb808:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb80c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb80f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb812:	48 83 c0 06          	add    rax,0x6
      bbb816:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb819:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb81c:	48 8b 7c 88 04       	mov    rdi,QWORD PTR [rax+rcx*4+0x4]
      bbb821:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb824:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb828:	48 89 3c 02          	mov    QWORD PTR [rdx+rax*1],rdi
      bbb82c:	c3                   	ret
- +0x30 -> 0xbbbaaf; score=10; direct-this-pointer,no-call; FDE=(12303023, 12303057)
      bbbaaf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbab2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbab6:	48 83 c0 02          	add    rax,0x2
      bbbaba:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbabd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbac0:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbbac3:	31 f6                	xor    esi,esi
      bbbac5:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbbac9:	40 0f 9d c6          	setge  sil
      bbbacd:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbbad0:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18ac558
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb16c; score=10; direct-this-pointer,no-call; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
- +0x38 -> 0xbbbb78; score=11; sret-rdi-rsi; FDE=(12303224, 12303258)
      bbbb78:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbb7b:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbb7f:	48 83 c0 02          	add    rax,0x2
      bbbb83:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbb86:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbb89:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbbb8c:	31 f6                	xor    esi,esi
      bbbb8e:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbbb92:	40 0f 95 c6          	setne  sil
      bbbb96:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbbb99:	c3                   	ret

## score=36 address-point=0x18ac550
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x30 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=36 address-point=0x18ac4f8
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb10c; score=10; direct-this-pointer,no-call; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
- +0x30 -> 0xbbb244; score=10; direct-this-pointer,no-call; FDE=(12300868, 12300902)
      bbb244:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb247:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb24b:	48 83 c0 02          	add    rax,0x2
      bbb24f:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb252:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb255:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb258:	31 f6                	xor    esi,esi
      bbb25a:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb25e:	40 0f 94 c6          	sete   sil
      bbb262:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb265:	c3                   	ret
- +0x38 -> 0xbbb10c; score=11; sret-rdi-rsi; FDE=(12300556, 12300577)
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=36 address-point=0x18ac4c8
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbbb39; score=10; direct-this-pointer,no-call; FDE=(12303161, 12303197)
      bbbb39:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbb3c:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbb40:	48 83 c0 02          	add    rax,0x2
      bbbb44:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbb47:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbb4a:	48 8d 04 88          	lea    rax,[rax+rcx*4]
      bbbb4e:	31 c9                	xor    ecx,ecx
      bbbb50:	83 78 08 00          	cmp    DWORD PTR [rax+0x8],0x0
      bbbb54:	0f 94 c1             	sete   cl
      bbbb57:	8b 0c 88             	mov    ecx,DWORD PTR [rax+rcx*4]
      bbbb5a:	89 08                	mov    DWORD PTR [rax],ecx
      bbbb5c:	c3                   	ret
- +0x30 -> 0xbbb121; score=10; direct-this-pointer,no-call; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
- +0x38 -> 0xbbb4c6; score=11; sret-rdi-rsi; FDE=(12301510, 12301535)
      bbb4c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb4c9:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb4cd:	48 83 c0 02          	add    rax,0x2
      bbb4d1:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb4d4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb4d7:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb4da:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb4de:	c3                   	ret

## score=36 address-point=0x18ac4c0
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb0f4; score=10; direct-this-pointer,no-call; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x30 -> 0xbbbb39; score=10; direct-this-pointer,no-call; FDE=(12303161, 12303197)
      bbbb39:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbb3c:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbb40:	48 83 c0 02          	add    rax,0x2
      bbbb44:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbb47:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbb4a:	48 8d 04 88          	lea    rax,[rax+rcx*4]
      bbbb4e:	31 c9                	xor    ecx,ecx
      bbbb50:	83 78 08 00          	cmp    DWORD PTR [rax+0x8],0x0
      bbbb54:	0f 94 c1             	sete   cl
      bbbb57:	8b 0c 88             	mov    ecx,DWORD PTR [rax+rcx*4]
      bbbb5a:	89 08                	mov    DWORD PTR [rax],ecx
      bbbb5c:	c3                   	ret
- +0x38 -> 0xbbb121; score=11; sret-rdi-rsi; FDE=(12300577, 12300608)
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=36 address-point=0x18ac498
- +0x20 -> 0xbbb0f4; score=3; scalar-return; FDE=(12300532, 12300556)
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
- +0x28 -> 0xbbb22b; score=10; direct-this-pointer,no-call; FDE=(12300843, 12300868)
      bbb22b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb22e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb232:	48 83 c0 02          	add    rax,0x2
      bbb236:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb239:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb23c:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb240:	29 14 88             	sub    DWORD PTR [rax+rcx*4],edx
      bbb243:	c3                   	ret
- +0x30 -> 0xbbb618; score=10; direct-this-pointer,no-call; FDE=(12301848, 12301891)
      bbb618:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb61b:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb61f:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb623:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb626:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb629:	48 83 c0 06          	add    rax,0x6
      bbb62d:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb630:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb633:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb636:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb63a:	48 63 14 3a          	movsxd rdx,DWORD PTR [rdx+rdi*1]
      bbb63e:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb642:	c3                   	ret
- +0x38 -> 0xbbb16c; score=11; sret-rdi-rsi; FDE=(12300652, 12300676)
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## Top candidates: vptr materialization sites
