# Readiness owner +0x3b8 provider resolution

Target use:
- e94787 reads [owner+0x3b8]
- virtual +0x10 on that provider returns a 16-byte pair
- pair feeds AP 0x1832be8/cache wrapper -> carrier AP 0x1843bf8 -> owner+0x428 readiness chain

Owner fingerprint anchors: +0x428, +0x470, +0x570, +0x598.

## Same-base FDE matches
### score=100 FDE=0x16fe1fc..0x1703c8a base=rsp
- WRITE +0x428 @0x16fe8da: mov    DWORD PTR [rsp+0x428],ebp
- WRITE +0x3b8 @0x16ff0c0: mov    QWORD PTR [rsp+0x3b8],rdx
- READ +0x3b8 @0x16ff151: mov    r12,QWORD PTR [rsp+0x3b8]
- READ +0x3b8 @0x16ff36d: mov    rdx,QWORD PTR [rsp+0x3b8]
- READ +0x3b8 @0x16ff3a4: mov    rdx,QWORD PTR [rsp+0x3b8]
- READ +0x3b8 @0x16ff486: mov    rdx,QWORD PTR [rsp+0x3b8]
- READ +0x3b8 @0x16ff557: mov    rdx,QWORD PTR [rsp+0x3b8]
- WRITE +0x3b8 @0x16fff83: mov    QWORD PTR [rsp+0x3b8],r12
- WRITE +0x3b8 @0x17003e6: mov    QWORD PTR [rsp+0x3b8],r14
- READ +0x3b8 @0x1701d43: mov    rcx,QWORD PTR [rsp+0x3b8]
- WRITE +0x3b8 @0x1701d95: mov    QWORD PTR [rsp+0x3b8],rax
- READ +0x3b8 @0x1701e4f: mov    rdx,QWORD PTR [rsp+0x3b8]
- READ +0x3b8 @0x1701e90: mov    rcx,QWORD PTR [rsp+0x3b8]
- READ +0x3b8 @0x1701fb4: mov    rcx,QWORD PTR [rsp+0x3b8]

### score=60 FDE=0x12286bc..0x12291d6 base=rsp
- WRITE +0x3b8 @0x1228af8: mov    BYTE PTR [rsp+0x3b8],al
- WRITE +0x598 @0x1228bda: mov    BYTE PTR [rsp+0x598],0x0
- WRITE +0x428 @0x1228d01: mov    BYTE PTR [rsp+0x428],al
- WRITE +0x470 @0x1228d24: mov    BYTE PTR [rsp+0x470],al
- READ +0x470 @0x1229128: lea    rdi,[rsp+0x470]

### score=60 FDE=0x15182d6..0x1519a71 base=rsp
- WRITE +0x470 @0x151835d: movaps XMMWORD PTR [rsp+0x470],xmm0
- READ +0x470 @0x15188ae: lea    rcx,[rsp+0x470]
- WRITE +0x3b8 @0x1518f1f: cmp    BYTE PTR [rsp+0x3b8],0x0
- WRITE +0x3b8 @0x1518f32: mov    BYTE PTR [rsp+0x3b8],0x1
- READ +0x470 @0x15195ea: lea    rdx,[rsp+0x470]

### score=50 FDE=0xa8ae88..0xa8c879 base=rsp
- READ +0x570 @0xa8b569: mov    rax,QWORD PTR [rsp+0x570]
- WRITE +0x570 @0xa8b575: and    QWORD PTR [rsp+0x570],0x0
- READ +0x470 @0xa8b83d: mov    rax,QWORD PTR [rsp+0x470]
- WRITE +0x470 @0xa8b849: and    QWORD PTR [rsp+0x470],0x0
- READ +0x3b8 @0xa8ba68: movups xmm1,XMMWORD PTR [rsp+0x3b8]
- WRITE +0x3b8 @0xa8ba91: movups XMMWORD PTR [rsp+0x3b8],xmm0

### score=50 FDE=0xd6aa99..0xd6f087 base=rsp
- WRITE +0x3b8 @0xd6cad8: mov    QWORD PTR [rsp+0x3b8],rdx
- WRITE +0x470 @0xd6cb4d: mov    QWORD PTR [rsp+0x470],rax
- READ +0x3b8 @0xd6ce6b: lea    rdi,[rsp+0x3b8]
- WRITE +0x428 @0xd6cecf: mov    DWORD PTR [rsp+0x428],eax
- READ +0x428 @0xd6cf23: lea    rsi,[rsp+0x428]
- READ +0x428 @0xd6d047: lea    rdi,[rsp+0x428]
- READ +0x428 @0xd6d064: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0xd6d0ef: lea    rdi,[rsp+0x428]
- READ +0x428 @0xd6d101: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x3b8 @0xd6d181: lea    rdi,[rsp+0x3b8]
- READ +0x3b8 @0xd6d1ac: lea    rdi,[rsp+0x3b8]
- READ +0x3b8 @0xd6d434: lea    rdi,[rsp+0x3b8]
- READ +0x3b8 @0xd6d46f: lea    rdi,[rsp+0x3b8]
- READ +0x3b8 @0xd6d48d: lea    rdi,[rsp+0x3b8]
- READ +0x470 @0xd6d7f3: movdqa xmm0,XMMWORD PTR [rsp+0x470]
- READ +0x3b8 @0xd6d819: lea    rdi,[rsp+0x3b8]

### score=50 FDE=0xdf78ee..0xdf9239 base=rsp
- WRITE +0x470 @0xdf7f4f: mov    QWORD PTR [rsp+0x470],rax
- READ +0x470 @0xdf7f89: lea    rdi,[rsp+0x470]
- READ +0x428 @0xdf862a: lea    rdi,[rsp+0x428]
- READ +0x428 @0xdf8652: lea    r15,[rsp+0x428]
- WRITE +0x3b8 @0xdf878e: mov    QWORD PTR [rsp+0x3b8],rbp
- READ +0x470 @0xdf8c32: lea    rsi,[rsp+0x470]
- READ +0x470 @0xdf8c8e: lea    r12,[rsp+0x470]

### score=50 FDE=0xe92f2c..0xe98f3b base=r13
- READ +0x570 @0xe93091: mov    rax,QWORD PTR [r13+0x570]
- READ +0x570 @0xe932b6: mov    rax,QWORD PTR [r13+0x570]
- READ +0x428 @0xe9475b: mov    rax,QWORD PTR [r13+0x428]
- READ +0x598 @0xe94762: mov    rcx,QWORD PTR [r13+0x598]
- READ +0x3b8 @0xe94787: mov    rsi,QWORD PTR [r13+0x3b8]
- READ +0x570 @0xe947a4: mov    r15,QWORD PTR [r13+0x570]
- READ +0x470 @0xe94945: lea    rcx,[r13+0x470]
- READ +0x570 @0xe95190: mov    rax,QWORD PTR [r13+0x570]
- READ +0x428 @0xe96195: mov    rax,QWORD PTR [r13+0x428]
- READ +0x598 @0xe961a4: mov    rax,QWORD PTR [r13+0x598]
- READ +0x428 @0xe964fe: mov    r12,QWORD PTR [r13+0x428]
- READ +0x470 @0xe96505: movaps xmm0,XMMWORD PTR [r13+0x470]
- READ +0x570 @0xe976ac: mov    rax,QWORD PTR [r13+0x570]

### score=50 FDE=0x10d0e58..0x10d4cf6 base=rsp
- READ +0x570 @0x10d0e8d: mov    rbp,QWORD PTR [rsp+0x570]
- READ +0x570 @0x10d160b: mov    r15,QWORD PTR [rsp+0x570]
- READ +0x570 @0x10d188e: mov    rax,QWORD PTR [rsp+0x570]
- READ +0x570 @0x10d18bc: mov    rax,QWORD PTR [rsp+0x570]
- READ +0x570 @0x10d18db: mov    r15,QWORD PTR [rsp+0x570]
- READ +0x598 @0x10d1c3c: mov    r12,QWORD PTR [rsp+0x598]
- WRITE +0x470 @0x10d2678: mov    QWORD PTR [rsp+0x470],rsi
- READ +0x598 @0x10d2cf7: mov    rsi,QWORD PTR [rsp+0x598]
- WRITE +0x470 @0x10d2e48: mov    QWORD PTR [rsp+0x470],r12
- READ +0x570 @0x10d36f7: mov    rsi,QWORD PTR [rsp+0x570]
- READ +0x598 @0x10d37d2: mov    rbx,QWORD PTR [rsp+0x598]
- READ +0x428 @0x10d3bec: mov    rdi,QWORD PTR [rsp+0x428]
- WRITE +0x470 @0x10d3ffe: movdqa XMMWORD PTR [rsp+0x470],xmm0
- READ +0x3b8 @0x10d4594: mov    rdi,QWORD PTR [rsp+0x3b8]
- READ +0x428 @0x10d46e3: mov    rdi,QWORD PTR [rsp+0x428]

### score=50 FDE=0x1263214..0x12658e5 base=rsp
- READ +0x3b8 @0x1263480: lea    rdi,[rsp+0x3b8]
- READ +0x470 @0x1263586: mov    esi,DWORD PTR [rsp+0x470]
- WRITE +0x428 @0x12635d8: cmp    BYTE PTR [rsp+0x428],al
- WRITE +0x570 @0x1264349: mov    BYTE PTR [rsp+0x570],al
- WRITE +0x570 @0x1264360: mov    BYTE PTR [rsp+0x570],al
- READ +0x570 @0x126438d: lea    rsi,[rsp+0x570]
- READ +0x570 @0x1265118: lea    rdi,[rsp+0x570]
- WRITE +0x570 @0x1265188: movaps XMMWORD PTR [rsp+0x570],xmm0
- WRITE +0x598 @0x12651a0: mov    QWORD PTR [rsp+0x598],rax
- WRITE +0x570 @0x126541e: movaps XMMWORD PTR [rsp+0x570],xmm0
- WRITE +0x598 @0x1265439: and    QWORD PTR [rsp+0x598],0x0
- READ +0x570 @0x12656fb: lea    rdi,[rsp+0x570]

### score=50 FDE=0x127b26e..0x127d87f base=rsp
- READ +0x428 @0x127b443: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127b500: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127b588: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127b623: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127b6cb: mov    rax,QWORD PTR [rsp+0x428]
- WRITE +0x570 @0x127b74b: mov    QWORD PTR [rsp+0x570],rbp
- READ +0x428 @0x127b766: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x570 @0x127b77f: lea    rdi,[rsp+0x570]
- READ +0x428 @0x127b801: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127b889: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127b924: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127b9c0: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127ba75: mov    rax,QWORD PTR [rsp+0x428]
- WRITE +0x3b8 @0x127bb38: movups XMMWORD PTR [rsp+0x3b8],xmm0
- READ +0x428 @0x127bb86: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127bc39: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127bcd4: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127bd7d: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127be25: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127becc: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127bf67: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127c001: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127c0a8: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127c150: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127c1d4: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127c293: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127c33a: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127c3d5: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127c470: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127c519: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x428 @0x127c5db: mov    rax,QWORD PTR [rsp+0x428]
- READ +0x570 @0x127c946: lea    rsi,[rsp+0x570]
- READ +0x570 @0x127c974: lea    r15,[rsp+0x570]

### score=50 FDE=0x12cb106..0x12cbc74 base=rbx
- READ +0x3b8 @0x12cb645: lea    rdi,[rbx+0x3b8]
- READ +0x428 @0x12cb6d1: lea    rdi,[rbx+0x428]
- READ +0x470 @0x12cb719: lea    rdi,[rbx+0x470]
- WRITE +0x570 @0x12cb7e0: movups XMMWORD PTR [rbx+0x570],xmm0
- WRITE +0x598 @0x12cb7f4: movups XMMWORD PTR [rbx+0x598],xmm0
- READ +0x570 @0x12cb866: lea    rcx,[rbx+0x570]

### score=50 FDE=0x14b91f2..0x14ba12f base=rsp
- WRITE +0x428 @0x14b93b8: mov    QWORD PTR [rsp+0x428],rax
- WRITE +0x470 @0x14b940c: mov    QWORD PTR [rsp+0x470],rax
- WRITE +0x3b8 @0x14b9a13: mov    QWORD PTR [rsp+0x3b8],rax

### score=50 FDE=0x15229bc..0x1523550 base=rbx
- WRITE +0x3b8 @0x15230d0: mov    QWORD PTR [rbx+0x3b8],rax
- WRITE +0x428 @0x152318d: mov    QWORD PTR [rbx+0x428],rax
- WRITE +0x470 @0x152324a: mov    QWORD PTR [rbx+0x470],rax

### score=50 FDE=0x17dfd00..0x17e673e base=rsp
- WRITE +0x470 @0x17e2076: mov    BYTE PTR [rsp+0x470],cl
- READ +0x470 @0x17e2104: movzx  ecx,BYTE PTR [rsp+0x470]
- WRITE +0x3b8 @0x17e3327: mov    BYTE PTR [rsp+0x3b8],al
- WRITE +0x428 @0x17e5d1d: movss  DWORD PTR [rsp+0x428],xmm3
- WRITE +0x428 @0x17e5f20: movss  DWORD PTR [rsp+0x428],xmm4

### score=40 FDE=0xae306e..0xae4ac2 base=rsp
- WRITE +0x3b8 @0xae32b7: add    QWORD PTR [rsp+0x3b8],rax
- WRITE +0x428 @0xae3b6d: mov    QWORD PTR [rsp+0x428],rax
- READ +0x428 @0xae3ecd: mov    r15,QWORD PTR [rsp+0x428]
- READ +0x428 @0xae4003: movdqu xmm0,XMMWORD PTR [rsp+0x428]
- WRITE +0x428 @0xae40ec: mov    QWORD PTR [rsp+0x428],rax
- READ +0x428 @0xae4179: mov    r13,QWORD PTR [rsp+0x428]
- WRITE +0x428 @0xae41c3: movdqu XMMWORD PTR [rsp+0x428],xmm0

### score=40 FDE=0xb6f222..0xb703a3 base=rax
- WRITE +0x3b8 @0xb6f470: movups XMMWORD PTR [rax+0x3b8],xmm0
- WRITE +0x428 @0xb6f4a9: movups XMMWORD PTR [rax+0x428],xmm0
- READ +0x428 @0xb6fc25: mov    rdi,QWORD PTR [rax+0x428]

### score=40 FDE=0xb8b422..0xb8d4f5 base=rsp
- WRITE +0x428 @0xb8c6bc: movups XMMWORD PTR [rsp+0x428],xmm0
- WRITE +0x3b8 @0xb8c70d: mov    QWORD PTR [rsp+0x3b8],r13

### score=40 FDE=0xe92f2c..0xe98f3b base=rbx
- READ +0x428 @0xe95a7d: mov    rax,QWORD PTR [rbx+0x428]
- READ +0x3b8 @0xe95b6e: mov    r11,QWORD PTR [rbx+0x3b8]
- READ +0x428 @0xe96029: mov    rax,QWORD PTR [rbx+0x428]
- READ +0x598 @0xe96038: mov    rax,QWORD PTR [rbx+0x598]
- READ +0x598 @0xe96dd5: mov    rax,QWORD PTR [rbx+0x598]
- READ +0x570 @0xe97203: mov    rax,QWORD PTR [rbx+0x570]

### score=40 FDE=0x109917a..0x1099d71 base=r13
- WRITE +0x3b8 @0x1099796: movups XMMWORD PTR [r13+0x3b8],xmm0
- READ +0x470 @0x1099801: lea    r14,[r13+0x470]

### score=40 FDE=0x1145c8a..0x1146a50 base=rsp
- WRITE +0x3b8 @0x1145e74: mov    QWORD PTR [rsp+0x3b8],rbp
- WRITE +0x470 @0x1145efc: mov    QWORD PTR [rsp+0x470],rbp

### score=40 FDE=0x12ccf68..0x12cd22e base=rbx
- READ +0x570 @0x12ccff9: lea    rdi,[rbx+0x570]
- READ +0x470 @0x12cd059: lea    rdi,[rbx+0x470]
- READ +0x428 @0x12cd089: lea    rdi,[rbx+0x428]
- READ +0x3b8 @0x12cd0dd: lea    rdi,[rbx+0x3b8]

### score=40 FDE=0x1332e00..0x1334bda base=rbx
- WRITE +0x3b8 @0x1333649: movdqu XMMWORD PTR [rbx+0x3b8],xmm0
- WRITE +0x598 @0x133379e: mov    DWORD PTR [rbx+0x598],0x3f800000

### score=40 FDE=0x135d056..0x1360c1b base=rsp
- WRITE +0x3b8 @0x135f1fd: mov    BYTE PTR [rsp+0x3b8],al
- READ +0x3b8 @0x135f41c: lea    rbp,[rsp+0x3b8]
- READ +0x570 @0x135f653: lea    rcx,[rsp+0x570]
- READ +0x570 @0x135f685: lea    rdi,[rsp+0x570]
- READ +0x570 @0x136009c: lea    rdi,[rsp+0x570]
- READ +0x570 @0x1360adb: lea    rdi,[rsp+0x570]

### score=40 FDE=0x13912b4..0x1391aee base=rsp
- READ +0x570 @0x13913be: lea    rsi,[rsp+0x570]
- WRITE +0x3b8 @0x1391732: mov    BYTE PTR [rsp+0x3b8],r12b

### score=40 FDE=0x14462dc..0x1446ffc base=r12
- WRITE +0x3b8 @0x1446429: mov    QWORD PTR [r12+0x3b8],r15
- WRITE +0x428 @0x144646b: mov    BYTE PTR [r12+0x428],al

### score=40 FDE=0x14740f4..0x147584c base=rsp
- WRITE +0x470 @0x1474268: mov    QWORD PTR [rsp+0x470],r13
- WRITE +0x470 @0x147428d: mov    QWORD PTR [rsp+0x470],rax
- READ +0x470 @0x14742b3: lea    r14,[rsp+0x470]
- READ +0x470 @0x14743bc: lea    rdi,[rsp+0x470]
- READ +0x470 @0x14743f9: lea    r12,[rsp+0x470]
- READ +0x470 @0x147449f: lea    rdi,[rsp+0x470]
- READ +0x470 @0x14744d5: lea    r12,[rsp+0x470]
- READ +0x470 @0x14744fa: movaps xmm0,XMMWORD PTR [rsp+0x470]
- WRITE +0x470 @0x1474516: movaps XMMWORD PTR [rsp+0x470],xmm1
- READ +0x470 @0x1474563: lea    r12,[rsp+0x470]
- READ +0x470 @0x147462a: lea    rdi,[rsp+0x470]
- READ +0x470 @0x147465f: lea    rbx,[rsp+0x470]
- WRITE +0x470 @0x1474712: mov    QWORD PTR [rsp+0x470],rax
- WRITE +0x470 @0x14747b6: and    QWORD PTR [rsp+0x470],0x0
- READ +0x470 @0x14747bf: lea    rdi,[rsp+0x470]
- READ +0x470 @0x1474927: lea    rdi,[rsp+0x470]
- READ +0x470 @0x1474956: lea    rbx,[rsp+0x470]
- READ +0x470 @0x1474cbd: lea    rbx,[rsp+0x470]
- READ +0x470 @0x1474e08: lea    rsi,[rsp+0x470]
- READ +0x470 @0x147503a: lea    rbx,[rsp+0x470]
- READ +0x470 @0x147507d: lea    rdi,[rsp+0x470]
- READ +0x470 @0x14750b4: lea    rbx,[rsp+0x470]
- READ +0x470 @0x147529e: lea    r15,[rsp+0x470]
- WRITE +0x3b8 @0x1475492: mov    DWORD PTR [rsp+0x3b8],ebp
- READ +0x470 @0x1475604: lea    rdi,[rsp+0x470]
- READ +0x470 @0x1475694: lea    rdi,[rsp+0x470]
- READ +0x470 @0x14756da: lea    rdi,[rsp+0x470]
- READ +0x470 @0x147571c: lea    rdi,[rsp+0x470]
- READ +0x470 @0x1475770: lea    rdi,[rsp+0x470]
- READ +0x470 @0x14757d0: lea    rdi,[rsp+0x470]

### score=40 FDE=0x15c9e9a..0x15cab0b base=rsp
- READ +0x3b8 @0x15ca10e: mov    rcx,QWORD PTR [rsp+0x3b8]
- WRITE +0x570 @0x15ca3e9: and    DWORD PTR [rsp+0x570],0x0
- WRITE +0x428 @0x15ca6c2: movups XMMWORD PTR [rsp+0x428],xmm0
- READ +0x470 @0x15ca7e4: mov    rdx,QWORD PTR [rsp+0x470]

### score=40 FDE=0x1632440..0x1633995 base=rsp
- WRITE +0x3b8 @0x1632a64: movq   QWORD PTR [rsp+0x3b8],xmm2
- WRITE +0x598 @0x1632bc4: test   BYTE PTR [rsp+0x598],0x1
- WRITE +0x598 @0x1632bce: and    WORD PTR [rsp+0x598],0x0
- WRITE +0x598 @0x1633446: mov    BYTE PTR [rsp+0x598],al

### score=30 FDE=0xdb6ce0..0xdb7375 base=rbx
- READ +0x570 @0xdb6e5d: lea    r12,[rbx+0x570]
- READ +0x3b8 @0xdb6e7f: lea    rdi,[rbx+0x3b8]
- READ +0x598 @0xdb7059: mov    r9,QWORD PTR [rbx+0x598]

### score=30 FDE=0x1298d86..0x129a87b base=rsp
- READ +0x428 @0x12994f2: lea    r14,[rsp+0x428]
- READ +0x470 @0x1299d1a: mov    sil,BYTE PTR [rsp+0x470]
- READ +0x3b8 @0x129a197: lea    rdi,[rsp+0x3b8]
- READ +0x3b8 @0x129a5e8: lea    rdi,[rsp+0x3b8]

### score=30 FDE=0x151f0d6..0x15219ce base=rsp
- WRITE +0x570 @0x151f4a9: movaps XMMWORD PTR [rsp+0x570],xmm0
- READ +0x3b8 @0x152045d: mov    rdi,QWORD PTR [rsp+0x3b8]
- READ +0x428 @0x1520591: mov    rdi,QWORD PTR [rsp+0x428]
- READ +0x570 @0x15206f6: lea    rsi,[rsp+0x570]

### score=30 FDE=0x15229bc..0x1523550 base=r14
- READ +0x3b8 @0x15230c2: mov    rdi,QWORD PTR [r14+0x3b8]
- READ +0x428 @0x152317f: mov    rdi,QWORD PTR [r14+0x428]
- READ +0x470 @0x152323c: mov    rdi,QWORD PTR [r14+0x470]

### score=20 FDE=0xa7e773..0xa7f6a3 base=rsp
- READ +0x3b8 @0xa7e961: lea    rdi,[rsp+0x3b8]
- READ +0x470 @0xa7f4ad: lea    rbx,[rsp+0x470]

### score=20 FDE=0xa8721f..0xa89272 base=rsp
- READ +0x598 @0xa873af: lea    rdi,[rsp+0x598]
- READ +0x598 @0xa873ce: lea    rsi,[rsp+0x598]
- READ +0x3b8 @0xa87757: lea    rdi,[rsp+0x3b8]
- READ +0x3b8 @0xa87769: lea    rsi,[rsp+0x3b8]
- READ +0x3b8 @0xa881ef: lea    rdi,[rsp+0x3b8]
- READ +0x598 @0xa8834d: lea    rdi,[rsp+0x598]
- READ +0x3b8 @0xa88890: lea    rdi,[rsp+0x3b8]
- READ +0x598 @0xa88b04: lea    rdi,[rsp+0x598]

### score=20 FDE=0xac6a72..0xac8907 base=rsp
- READ +0x470 @0xac7be9: lea    r14,[rsp+0x470]
- READ +0x3b8 @0xac82fe: mov    rdi,QWORD PTR [rsp+0x3b8]

### score=20 FDE=0xb7e3ae..0xb7fb0a base=r14
- READ +0x3b8 @0xb7f697: mov    rsi,QWORD PTR [r14+0x3b8]
- READ +0x3b8 @0xb7f845: mov    rsi,QWORD PTR [r14+0x3b8]
- READ +0x428 @0xb7f895: mov    rdi,QWORD PTR [r14+0x428]

### score=20 FDE=0xb86086..0xb87f42 base=rsp
- READ +0x3b8 @0xb86d01: lea    rdi,[rsp+0x3b8]
- READ +0x598 @0xb87a85: mov    rdi,QWORD PTR [rsp+0x598]
- READ +0x3b8 @0xb87b75: lea    rdi,[rsp+0x3b8]

### score=20 FDE=0xc6c08a..0xc6e081 base=rsp
- WRITE +0x470 @0xc6d111: mov    QWORD PTR [rsp+0x470],rdx
- WRITE +0x470 @0xc6d77f: mov    QWORD PTR [rsp+0x470],rax
- WRITE +0x470 @0xc6d7e1: mov    QWORD PTR [rsp+0x470],rax
- READ +0x3b8 @0xc6dd01: mov    rdi,QWORD PTR [rsp+0x3b8]

### score=20 FDE=0xe3b996..0xe3d367 base=rsp
- WRITE +0x570 @0xe3b9b5: mov    QWORD PTR [rsp+0x570],rax
- READ +0x3b8 @0xe3c207: lea    rdi,[rsp+0x3b8]
- READ +0x570 @0xe3c3bd: cmp    rax,QWORD PTR [rsp+0x570]
- READ +0x3b8 @0xe3d095: lea    rsi,[rsp+0x3b8]

### score=20 FDE=0x11ca706..0x11cd602 base=r15
- READ +0x3b8 @0x11cbe03: lea    rbx,[r15+0x3b8]
- WRITE +0x470 @0x11cbeb0: mov    QWORD PTR [r15+0x470],rbp

### score=20 FDE=0x11ca706..0x11cd602 base=rbx
- READ +0x3b8 @0x11cc53a: lea    r14,[rbx+0x3b8]
- READ +0x470 @0x11cd49a: mov    rdi,QWORD PTR [rbx+0x470]

### score=20 FDE=0x11d4aba..0x11d4ea4 base=rbx
- READ +0x470 @0x11d4d2f: mov    rdi,QWORD PTR [rbx+0x470]
- READ +0x3b8 @0x11d4d5f: lea    rdi,[rbx+0x3b8]

### score=20 FDE=0x120290a..0x1203fe5 base=rsp
- READ +0x3b8 @0x1203aeb: mov    rdi,QWORD PTR [rsp+0x3b8]
- READ +0x428 @0x1203b30: lea    rsi,[rsp+0x428]

### score=20 FDE=0x141a788..0x141b53b base=rbx
- READ +0x3b8 @0x141abf5: lea    rax,[rbx+0x3b8]
- WRITE +0x428 @0x141aead: mov    BYTE PTR [rbx+0x428],al

### score=20 FDE=0x1435020..0x1436dd5 base=rsp
- READ +0x3b8 @0x1435078: lea    r15,[rsp+0x3b8]
- READ +0x428 @0x1435829: movups xmm1,XMMWORD PTR [rsp+0x428]

### score=20 FDE=0x149488b..0x149769a base=rsp
- READ +0x598 @0x1495fbc: lea    rdi,[rsp+0x598]
- READ +0x598 @0x1495fd4: lea    rsi,[rsp+0x598]
- READ +0x598 @0x1495ff1: lea    rdi,[rsp+0x598]
- READ +0x3b8 @0x1496556: lea    rdi,[rsp+0x3b8]
- READ +0x3b8 @0x149658a: lea    rsi,[rsp+0x3b8]
- READ +0x3b8 @0x14965fe: lea    rdi,[rsp+0x3b8]
- READ +0x3b8 @0x149728f: lea    rdi,[rsp+0x3b8]
- READ +0x598 @0x14973c6: lea    rdi,[rsp+0x598]

### score=20 FDE=0x151f0d6..0x15219ce base=r15
- READ +0x3b8 @0x1520724: lea    rdi,[r15+0x3b8]
- READ +0x470 @0x15207d3: lea    rdi,[r15+0x470]

### score=20 FDE=0x15246f2..0x1524868 base=rbx
- READ +0x470 @0x152476b: lea    r9,[rbx+0x470]
- READ +0x3b8 @0x15247ad: lea    rdi,[rbx+0x3b8]

## +0x3b8 writes from same-base owner matches
### 0x16ff0c0; FDE=0x16fe1fc..0x1703c8a; base=rsp; score=100
     16ff034:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     16ff039:	8b 48 20             	mov    ecx,DWORD PTR [rax+0x20]
     16ff03c:	8b 80 b8 00 00 00    	mov    eax,DWORD PTR [rax+0xb8]
     16ff042:	01 c8                	add    eax,ecx
     16ff044:	4c 8b 64 24 60       	mov    r12,QWORD PTR [rsp+0x60]
     16ff049:	4c 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r13
     16ff050:	00 
     16ff051:	0f 8e 77 06 00 00    	jle    16ff6ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb383a>
     16ff057:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     16ff05c:	48 8d 58 18          	lea    rbx,[rax+0x18]
     16ff060:	45 31 ff             	xor    r15d,r15d
     16ff063:	45 31 ed             	xor    r13d,r13d
     16ff066:	48 89 5c 24 48       	mov    QWORD PTR [rsp+0x48],rbx
     16ff06b:	4c 8d b4 24 40 02 00 	lea    r14,[rsp+0x240]
     16ff072:	00 
     16ff073:	48 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],rbp
     16ff078:	48 63 d1             	movsxd rdx,ecx
     16ff07b:	49 39 d7             	cmp    r15,rdx
     16ff07e:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     16ff083:	48 0f 4c c3          	cmovl  rax,rbx
     16ff087:	b9 00 00 00 00       	mov    ecx,0x0
     16ff08c:	48 89 54 24 50       	mov    QWORD PTR [rsp+0x50],rdx
     16ff091:	48 0f 4d ca          	cmovge rcx,rdx
     16ff095:	4c 89 fa             	mov    rdx,r15
     16ff098:	48 29 ca             	sub    rdx,rcx
     16ff09b:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     16ff09e:	f6 c1 01             	test   cl,0x1
     16ff0a1:	48 8d 4c d1 07       	lea    rcx,[rcx+rdx*8+0x7]
     16ff0a6:	48 0f 44 c8          	cmove  rcx,rax
     16ff0aa:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     16ff0ad:	e8 84 c7 37 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     16ff0b2:	48 89 c5             	mov    rbp,rax
     16ff0b5:	49 89 d4             	mov    r12,rdx
     16ff0b8:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
     16ff0bf:	00 
     16ff0c0:	48 89 94 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rdx
     16ff0c7:	00 
     16ff0c8:	48 83 bc 24 70 01 00 	cmp    QWORD PTR [rsp+0x170],0x1
     16ff0cf:	00 01 
     16ff0d1:	77 2b                	ja     16ff0fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb326a>
     16ff0d3:	48 81 bc 24 78 01 00 	cmp    QWORD PTR [rsp+0x178],0x1ffff
     16ff0da:	00 ff ff 01 00 
     16ff0df:	0f 87 79 01 00 00    	ja     16ff25e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb33ca>
     16ff0e5:	48 c7 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],0x20000
     16ff0ec:	00 00 00 02 00 
     16ff0f1:	48 8d 84 24 80 01 00 	lea    rax,[rsp+0x180]
     16ff0f8:	00 
     16ff0f9:	e9 47 02 00 00       	jmp    16ff345 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb34b1>
     16ff0fe:	48 8b 84 24 80 01 00 	mov    rax,QWORD PTR [rsp+0x180]
     16ff105:	00 
     16ff106:	0f 18 18             	prefetcht2 BYTE PTR [rax]
     16ff109:	48 0f bf 94 24 78 01 	movsx  rdx,WORD PTR [rsp+0x178]
     16ff110:	00 00 
     16ff112:	48 89 ef             	mov    rdi,rbp
     16ff115:	4c 89 e6             	mov    rsi,r12
     16ff118:	e8 cf c9 fd ff       	call   16dbaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fc58>
     16ff11d:	48 89 c2             	mov    rdx,rax
     16ff120:	48 8b 8c 24 70 01 00 	mov    rcx,QWORD PTR [rsp+0x170]
     16ff127:	00 
     16ff128:	48 8b b4 24 80 01 00 	mov    rsi,QWORD PTR [rsp+0x180]
     16ff12f:	00 
     16ff130:	48 c1 e8 39          	shr    rax,0x39
     16ff134:	66 0f 6e c8          	movd   xmm1,eax
     16ff138:	66 0f 38 00 0d af ec 	pshufb xmm1,XMMWORD PTR [rip+0xfffffffffec8ecaf]        # 38ddf0 <_ZTSSt12bad_any_cast@@Base-0x23d8>
     16ff13f:	c8 fe 
     16ff141:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
     16ff148:	00 
     16ff149:	48 8b ac 24 b0 03 00 	mov    rbp,QWORD PTR [rsp+0x3b0]
     16ff150:	00 
     16ff151:	4c 8b a4 24 b8 03 00 	mov    r12,QWORD PTR [rsp+0x3b8]
     16ff158:	00 
     16ff159:	48 89 d3             	mov    rbx,rdx
     16ff15c:	45 31 c0             	xor    r8d,r8d
     16ff15f:	48 21 cb             	and    rbx,rcx
     16ff162:	48 89 d8             	mov    rax,rbx
     16ff165:	48 c1 e0 04          	shl    rax,0x4
     16ff169:	0f 18 0c 07          	prefetcht0 BYTE PTR [rdi+rax*1]
     16ff16d:	f3 0f 6f 14 1e       	movdqu xmm2,XMMWORD PTR [rsi+rbx*1]
     16ff172:	66 0f 6f c1          	movdqa xmm0,xmm1
     16ff176:	66 0f 74 c2          	pcmpeqb xmm0,xmm2
     16ff17a:	66 44 0f d7 f0       	pmovmskb r14d,xmm0
     16ff17f:	45 85 f6             	test   r14d,r14d
     16ff182:	0f 84 a1 00 00 00    	je     16ff229 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3395>
     16ff188:	48 89 94 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdx
     16ff18f:	00 
     16ff190:	48 89 74 24 70       	mov    QWORD PTR [rsp+0x70],rsi
     16ff195:	66 0f 7f 8c 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm1
     16ff19c:	00 00 
     16ff19e:	4c 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],r15
     16ff1a3:	4c 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r8
     16ff1aa:	00 

### 0x16fff83; FDE=0x16fe1fc..0x1703c8a; base=rsp; score=100
     16ffef0:	48 8b 94 24 28 01 00 	mov    rdx,QWORD PTR [rsp+0x128]
     16ffef7:	00 
     16ffef8:	4c 89 f9             	mov    rcx,r15
     16ffefb:	49 89 d0             	mov    r8,rdx
     16ffefe:	e8 89 95 00 00       	call   170948c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbd5f8>
     16fff03:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
     16fff0a:	00 
     16fff0b:	48 8d 9c 24 40 02 00 	lea    rbx,[rsp+0x240]
     16fff12:	00 
     16fff13:	48 89 de             	mov    rsi,rbx
     16fff16:	e8 75 96 00 00       	call   1709590 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbd6fc>
     16fff1b:	48 89 df             	mov    rdi,rbx
     16fff1e:	e8 b1 97 00 00       	call   17096d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbd840>
     16fff23:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     16fff27:	48 8d 2d 42 f6 d3 fe 	lea    rbp,[rip+0xfffffffffed3f642]        # 43f570 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x517c>
     16fff2e:	a8 01                	test   al,0x1
     16fff30:	0f 85 8c 02 00 00    	jne    17001c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb432e>
     16fff36:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
     16fff3a:	a8 04                	test   al,0x4
     16fff3c:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     16fff41:	0f 84 b7 00 00 00    	je     16ffffe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb416a>
     16fff47:	8b 45 10             	mov    eax,DWORD PTR [rbp+0x10]
     16fff4a:	e9 b2 00 00 00       	jmp    1700001 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb416d>
     16fff4f:	4c 89 bc 24 40 02 00 	mov    QWORD PTR [rsp+0x240],r15
     16fff56:	00 
     16fff57:	4c 89 a4 24 48 02 00 	mov    QWORD PTR [rsp+0x248],r12
     16fff5e:	00 
     16fff5f:	48 8d 3d 83 a8 c3 fe 	lea    rdi,[rip+0xfffffffffec3a883]        # 33a7e9 <_ZTSSt12bad_any_cast@@Base-0x559df>
     16fff66:	e8 3d 97 fd ff       	call   16d96a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d814>
     16fff6b:	48 89 84 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rax
     16fff72:	00 
     16fff73:	48 89 94 24 58 03 00 	mov    QWORD PTR [rsp+0x358],rdx
     16fff7a:	00 
     16fff7b:	4c 89 bc 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],r15
     16fff82:	00 
     16fff83:	4c 89 a4 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r12
     16fff8a:	00 
     16fff8b:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     16fff92:	00 
     16fff93:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
     16fff9a:	00 
     16fff9b:	48 8d 94 24 50 03 00 	lea    rdx,[rsp+0x350]
     16fffa2:	00 
     16fffa3:	48 8d 8c 24 b0 03 00 	lea    rcx,[rsp+0x3b0]
     16fffaa:	00 
     16fffab:	e8 ae ab 09 00       	call   179ab5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ecca>
     16fffb0:	48 8d 9c 24 00 04 00 	lea    rbx,[rsp+0x400]
     16fffb7:	00 
     16fffb8:	48 89 df             	mov    rdi,rbx
     16fffbb:	e8 76 b8 37 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     16fffc0:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     16fffc5:	48 89 c6             	mov    rsi,rax
     16fffc8:	4c 89 f1             	mov    rcx,r14
     16fffcb:	6a 07                	push   0x7
     16fffcd:	41 58                	pop    r8
     16fffcf:	4c 8d 0d 46 8c c7 fe 	lea    r9,[rip+0xfffffffffec78c46]        # 378c1c <_ZTSSt12bad_any_cast@@Base-0x175ac>
     16fffd6:	e8 29 d5 ff ff       	call   16fd504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1670>
     16fffdb:	48 89 df             	mov    rdi,rbx
     16fffde:	e8 ad de 0e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     16fffe3:	48 8d 05 be 98 2d 00 	lea    rax,[rip+0x2d98be]        # 19d98a8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa24f0>
     16fffea:	48 8b 5c 24 50       	mov    rbx,QWORD PTR [rsp+0x50]
     16fffef:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     16ffff4:	4c 8b bc 24 d0 00 00 	mov    r15,QWORD PTR [rsp+0xd0]
     16ffffb:	00 
     16ffffc:	eb 69                	jmp    1700067 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb41d3>
     16ffffe:	83 e0 03             	and    eax,0x3
     1700001:	85 c0                	test   eax,eax
     1700003:	74 41                	je     1700046 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb41b2>
     1700005:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     170000a:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     170000e:	48 8d 35 be a3 c3 fe 	lea    rsi,[rip+0xfffffffffec3a3be]        # 33a3d3 <_ZTSSt12bad_any_cast@@Base-0x55df5>
     1700015:	6a 1d                	push   0x1d
     1700017:	5a                   	pop    rdx
     1700018:	e8 59 8f ff ff       	call   16f8f76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xad0e2>
     170001d:	49 89 c6             	mov    r14,rax
     1700020:	80 38 01             	cmp    BYTE PTR [rax],0x1
     1700023:	75 28                	jne    170004d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb41b9>
     1700025:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
     1700029:	a8 04                	test   al,0x4
     170002b:	48 8b 5c 24 50       	mov    rbx,QWORD PTR [rsp+0x50]
     1700030:	4c 8b bc 24 d0 00 00 	mov    r15,QWORD PTR [rsp+0xd0]
     1700037:	00 
     1700038:	0f 84 a4 00 00 00    	je     17000e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb424e>
     170003e:	8b 45 10             	mov    eax,DWORD PTR [rbp+0x10]
     1700041:	e9 9f 00 00 00       	jmp    17000e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb4251>
     1700046:	48 8b 5c 24 50       	mov    rbx,QWORD PTR [rsp+0x50]
     170004b:	eb 0a                	jmp    1700057 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb41c3>
     170004d:	48 8b 5c 24 50       	mov    rbx,QWORD PTR [rsp+0x50]
     1700052:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     1700057:	4c 8b bc 24 d0 00 00 	mov    r15,QWORD PTR [rsp+0xd0]
     170005e:	00 

### 0x17003e6; FDE=0x16fe1fc..0x1703c8a; base=rsp; score=100
     1700353:	4d 89 f0             	mov    r8,r14
     1700356:	e8 31 91 00 00       	call   170948c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbd5f8>
     170035b:	48 8b bc 24 20 01 00 	mov    rdi,QWORD PTR [rsp+0x120]
     1700362:	00 
     1700363:	48 8d 9c 24 40 02 00 	lea    rbx,[rsp+0x240]
     170036a:	00 
     170036b:	48 89 de             	mov    rsi,rbx
     170036e:	e8 1d 92 00 00       	call   1709590 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbd6fc>
     1700373:	48 89 df             	mov    rdi,rbx
     1700376:	e8 59 93 00 00       	call   17096d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbd840>
     170037b:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     170037f:	48 8d 1d ea f1 d3 fe 	lea    rbx,[rip+0xfffffffffed3f1ea]        # 43f570 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x517c>
     1700386:	a8 01                	test   al,0x1
     1700388:	0f 85 78 02 00 00    	jne    1700606 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb4772>
     170038e:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     1700392:	a8 04                	test   al,0x4
     1700394:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
     170039b:	00 
     170039c:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
     17003a3:	00 
     17003a4:	0f 84 c5 00 00 00    	je     170046f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb45db>
     17003aa:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
     17003ad:	e9 c0 00 00 00       	jmp    1700472 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb45de>
     17003b2:	48 89 9c 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rbx
     17003b9:	00 
     17003ba:	4c 89 b4 24 48 02 00 	mov    QWORD PTR [rsp+0x248],r14
     17003c1:	00 
     17003c2:	48 8d 3d 20 a4 c3 fe 	lea    rdi,[rip+0xfffffffffec3a420]        # 33a7e9 <_ZTSSt12bad_any_cast@@Base-0x559df>
     17003c9:	e8 da 92 fd ff       	call   16d96a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d814>
     17003ce:	48 89 84 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rax
     17003d5:	00 
     17003d6:	48 89 94 24 58 03 00 	mov    QWORD PTR [rsp+0x358],rdx
     17003dd:	00 
     17003de:	48 89 9c 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rbx
     17003e5:	00 
     17003e6:	4c 89 b4 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r14
     17003ed:	00 
     17003ee:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     17003f5:	00 
     17003f6:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
     17003fd:	00 
     17003fe:	48 8d 94 24 50 03 00 	lea    rdx,[rsp+0x350]
     1700405:	00 
     1700406:	48 8d 8c 24 b0 03 00 	lea    rcx,[rsp+0x3b0]
     170040d:	00 
     170040e:	e8 4b a7 09 00       	call   179ab5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ecca>
     1700413:	48 8d 9c 24 00 04 00 	lea    rbx,[rsp+0x400]
     170041a:	00 
     170041b:	48 89 df             	mov    rdi,rbx
     170041e:	e8 13 b4 37 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1700423:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     1700428:	48 89 c6             	mov    rsi,rax
     170042b:	4c 89 e9             	mov    rcx,r13
     170042e:	6a 07                	push   0x7
     1700430:	41 58                	pop    r8
     1700432:	4c 8d 0d e3 87 c7 fe 	lea    r9,[rip+0xfffffffffec787e3]        # 378c1c <_ZTSSt12bad_any_cast@@Base-0x175ac>
     1700439:	e8 c6 d0 ff ff       	call   16fd504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1670>
     170043e:	48 89 df             	mov    rdi,rbx
     1700441:	e8 4a da 0e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1700446:	48 8d 05 03 94 2d 00 	lea    rax,[rip+0x2d9403]        # 19d9850 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa2498>
     170044d:	4c 8b 64 24 60       	mov    r12,QWORD PTR [rsp+0x60]
     1700452:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
     1700459:	00 
     170045a:	4c 8b bc 24 e0 00 00 	mov    r15,QWORD PTR [rsp+0xe0]
     1700461:	00 
     1700462:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
     1700469:	00 
     170046a:	e9 1f 01 00 00       	jmp    170058e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb46fa>
     170046f:	83 e0 03             	and    eax,0x3
     1700472:	85 c0                	test   eax,eax
     1700474:	74 42                	je     17004b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb4624>
     1700476:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     170047b:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     170047f:	48 8d 35 a4 87 c8 fe 	lea    rsi,[rip+0xfffffffffec887a4]        # 388c2a <_ZTSSt12bad_any_cast@@Base-0x759e>
     1700486:	6a 1e                	push   0x1e
     1700488:	5a                   	pop    rdx
     1700489:	e8 e8 8a ff ff       	call   16f8f76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xad0e2>
     170048e:	49 89 c6             	mov    r14,rax
     1700491:	80 38 01             	cmp    BYTE PTR [rax],0x1
     1700494:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
     170049b:	00 
     170049c:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
     17004a3:	00 
     17004a4:	75 12                	jne    17004b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb4624>
     17004a6:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     17004aa:	a8 04                	test   al,0x4
     17004ac:	4c 8b 64 24 60       	mov    r12,QWORD PTR [rsp+0x60]
     17004b1:	74 0f                	je     17004c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb462e>
     17004b3:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
     17004b6:	eb 0d                	jmp    17004c5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb4631>
     17004b8:	4c 8b 64 24 60       	mov    r12,QWORD PTR [rsp+0x60]

### 0x1701d95; FDE=0x16fe1fc..0x1703c8a; base=rsp; score=100
     1701d22:	41 f6 c4 01          	test   r12b,0x1
     1701d26:	74 6d                	je     1701d95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5f01>
     1701d28:	48 8b 55 00          	mov    rdx,QWORD PTR [rbp+0x0]
     1701d2c:	48 8b 72 18          	mov    rsi,QWORD PTR [rdx+0x18]
     1701d30:	40 f6 c6 04          	test   sil,0x4
     1701d34:	74 05                	je     1701d3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5ea7>
     1701d36:	8b 4a 20             	mov    ecx,DWORD PTR [rdx+0x20]
     1701d39:	eb 05                	jmp    1701d40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5eac>
     1701d3b:	89 f1                	mov    ecx,esi
     1701d3d:	83 e1 03             	and    ecx,0x3
     1701d40:	48 63 f9             	movsxd rdi,ecx
     1701d43:	48 8b 8c 24 b8 03 00 	mov    rcx,QWORD PTR [rsp+0x3b8]
     1701d4a:	00 
     1701d4b:	48 29 c1             	sub    rcx,rax
     1701d4e:	48 c1 f9 02          	sar    rcx,0x2
     1701d52:	48 39 f9             	cmp    rcx,rdi
     1701d55:	7f 3b                	jg     1701d92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5efe>
     1701d57:	48 83 c2 20          	add    rdx,0x20
     1701d5b:	48 89 f7             	mov    rdi,rsi
     1701d5e:	48 83 e7 f8          	and    rdi,0xfffffffffffffff8
     1701d62:	40 f6 c6 04          	test   sil,0x4
     1701d66:	48 0f 44 fa          	cmove  rdi,rdx
     1701d6a:	31 d2                	xor    edx,edx
     1701d6c:	31 f6                	xor    esi,esi
     1701d6e:	48 39 f1             	cmp    rcx,rsi
     1701d71:	0f 84 64 03 00 00    	je     17020db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb6247>
     1701d77:	49 89 d0             	mov    r8,rdx
     1701d7a:	49 c1 f8 1e          	sar    r8,0x1e
     1701d7e:	46 8b 04 07          	mov    r8d,DWORD PTR [rdi+r8*1]
     1701d82:	4c 8d 4e 01          	lea    r9,[rsi+0x1]
     1701d86:	4c 01 d2             	add    rdx,r10
     1701d89:	44 3b 04 b0          	cmp    r8d,DWORD PTR [rax+rsi*4]
     1701d8d:	4c 89 ce             	mov    rsi,r9
     1701d90:	74 dc                	je     1701d6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5eda>
     1701d92:	45 31 e4             	xor    r12d,r12d
     1701d95:	48 89 84 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rax
     1701d9c:	00 
     1701d9d:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1701da1:	48 8b 48 18          	mov    rcx,QWORD PTR [rax+0x18]
     1701da5:	f6 c1 04             	test   cl,0x4
     1701da8:	0f 94 c2             	sete   dl
     1701dab:	74 05                	je     1701db2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5f1e>
     1701dad:	8b 70 20             	mov    esi,DWORD PTR [rax+0x20]
     1701db0:	eb 05                	jmp    1701db7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5f23>
     1701db2:	89 ce                	mov    esi,ecx
     1701db4:	83 e6 03             	and    esi,0x3
     1701db7:	85 f6                	test   esi,esi
     1701db9:	7e 4f                	jle    1701e0a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5f76>
     1701dbb:	48 83 c0 20          	add    rax,0x20
     1701dbf:	31 db                	xor    ebx,ebx
     1701dc1:	48 83 e1 f8          	and    rcx,0xfffffffffffffff8
     1701dc5:	f6 c2 01             	test   dl,0x1
     1701dc8:	48 0f 45 c8          	cmovne rcx,rax
     1701dcc:	8b 04 99             	mov    eax,DWORD PTR [rcx+rbx*4]
     1701dcf:	89 84 24 00 04 00 00 	mov    DWORD PTR [rsp+0x400],eax
     1701dd6:	4c 89 ff             	mov    rdi,r15
     1701dd9:	4c 89 f6             	mov    rsi,r14
     1701ddc:	e8 cf 33 4e ff       	call   be51b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x132150>
     1701de1:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1701de5:	48 8b 48 18          	mov    rcx,QWORD PTR [rax+0x18]
     1701de9:	f6 c1 04             	test   cl,0x4
     1701dec:	0f 94 c2             	sete   dl
     1701def:	74 05                	je     1701df6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5f62>
     1701df1:	8b 70 20             	mov    esi,DWORD PTR [rax+0x20]
     1701df4:	eb 05                	jmp    1701dfb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5f67>
     1701df6:	89 ce                	mov    esi,ecx
     1701df8:	83 e6 03             	and    esi,0x3
     1701dfb:	48 ff c3             	inc    rbx
     1701dfe:	48 83 c0 20          	add    rax,0x20
     1701e02:	48 63 f6             	movsxd rsi,esi
     1701e05:	48 39 f3             	cmp    rbx,rsi
     1701e08:	7c b7                	jl     1701dc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5f2d>
     1701e0a:	48 83 bc 24 58 02 00 	cmp    QWORD PTR [rsp+0x258],0x1
     1701e11:	00 01 
     1701e13:	44 89 64 24 50       	mov    DWORD PTR [rsp+0x50],r12d
     1701e18:	77 19                	ja     1701e33 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5f9f>
     1701e1a:	48 81 bc 24 60 02 00 	cmp    QWORD PTR [rsp+0x260],0x20000
     1701e21:	00 00 00 02 00 
     1701e26:	0f 83 70 01 00 00    	jae    1701f9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb6108>
     1701e2c:	31 c9                	xor    ecx,ecx
     1701e2e:	e9 a0 01 00 00       	jmp    1701fd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb613f>
     1701e33:	48 8b 84 24 68 02 00 	mov    rax,QWORD PTR [rsp+0x268]
     1701e3a:	00 
     1701e3b:	0f 18 18             	prefetcht2 BYTE PTR [rax]
     1701e3e:	48 0f bf bc 24 60 02 	movsx  rdi,WORD PTR [rsp+0x260]
     1701e45:	00 00 
     1701e47:	48 8b b4 24 b0 03 00 	mov    rsi,QWORD PTR [rsp+0x3b0]
     1701e4e:	00 
     1701e4f:	48 8b 94 24 b8 03 00 	mov    rdx,QWORD PTR [rsp+0x3b8]
     1701e56:	00 
     1701e57:	e8 5c de 00 00       	call   170fcb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3e24>

### 0x1228af8; FDE=0x12286bc..0x12291d6; base=rsp; score=60
     1228a69:	0f 29 4c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm1
     1228a6e:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
     1228a74:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     1228a78:	48 8d ac 24 48 03 00 	lea    rbp,[rsp+0x348]
     1228a7f:	00 
     1228a80:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     1228a84:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
     1228a89:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
     1228a8d:	41 0f 11 4d 00       	movups XMMWORD PTR [r13+0x0],xmm1
     1228a92:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     1228a97:	41 8a 44 24 10       	mov    al,BYTE PTR [r12+0x10]
     1228a9c:	88 45 28             	mov    BYTE PTR [rbp+0x28],al
     1228a9f:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     1228aa4:	0f 11 45 18          	movups XMMWORD PTR [rbp+0x18],xmm0
     1228aa8:	48 8d bc 24 78 03 00 	lea    rdi,[rsp+0x378]
     1228aaf:	00 
     1228ab0:	48 89 de             	mov    rsi,rbx
     1228ab3:	e8 88 54 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1228ab8:	4b 8b 84 3e 78 01 00 	mov    rax,QWORD PTR [r14+r15*1+0x178]
     1228abf:	00 
     1228ac0:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
     1228ac7:	00 
     1228ac8:	43 8a 84 3e 88 01 00 	mov    al,BYTE PTR [r14+r15*1+0x188]
     1228acf:	00 
     1228ad0:	88 45 58             	mov    BYTE PTR [rbp+0x58],al
     1228ad3:	4b 8b 84 3e 80 01 00 	mov    rax,QWORD PTR [r14+r15*1+0x180]
     1228ada:	00 
     1228adb:	48 89 45 50          	mov    QWORD PTR [rbp+0x50],rax
     1228adf:	43 8a 84 3e 98 01 00 	mov    al,BYTE PTR [r14+r15*1+0x198]
     1228ae6:	00 
     1228ae7:	88 45 68             	mov    BYTE PTR [rbp+0x68],al
     1228aea:	4b 8b 84 3e 90 01 00 	mov    rax,QWORD PTR [r14+r15*1+0x190]
     1228af1:	00 
     1228af2:	48 89 45 60          	mov    QWORD PTR [rbp+0x60],rax
     1228af6:	31 c0                	xor    eax,eax
     1228af8:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     1228aff:	88 84 24 f8 04 00 00 	mov    BYTE PTR [rsp+0x4f8],al
     1228b06:	88 84 24 00 05 00 00 	mov    BYTE PTR [rsp+0x500],al
     1228b0d:	88 84 24 58 05 00 00 	mov    BYTE PTR [rsp+0x558],al
     1228b14:	f3 43 0f 10 84 3e a8 	movss  xmm0,DWORD PTR [r14+r15*1+0x2a8]
     1228b1b:	02 00 00 
     1228b1e:	f3 0f 11 84 24 60 05 	movss  DWORD PTR [rsp+0x560],xmm0
     1228b25:	00 00 
     1228b27:	43 8a 8c 3e c0 02 00 	mov    cl,BYTE PTR [r14+r15*1+0x2c0]
     1228b2e:	00 
     1228b2f:	88 8c 24 64 05 00 00 	mov    BYTE PTR [rsp+0x564],cl
     1228b36:	43 8a 8c 3e c1 02 00 	mov    cl,BYTE PTR [r14+r15*1+0x2c1]
     1228b3d:	00 
     1228b3e:	88 8c 24 65 05 00 00 	mov    BYTE PTR [rsp+0x565],cl
     1228b45:	43 8a 8c 3e c2 02 00 	mov    cl,BYTE PTR [r14+r15*1+0x2c2]
     1228b4c:	00 
     1228b4d:	88 8c 24 66 05 00 00 	mov    BYTE PTR [rsp+0x566],cl
     1228b54:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     1228b59:	8a 8a 79 06 00 00    	mov    cl,BYTE PTR [rdx+0x679]
     1228b5f:	88 8c 24 67 05 00 00 	mov    BYTE PTR [rsp+0x567],cl
     1228b66:	8a 8a 7b 06 00 00    	mov    cl,BYTE PTR [rdx+0x67b]
     1228b6c:	88 8c 24 68 05 00 00 	mov    BYTE PTR [rsp+0x568],cl
     1228b73:	88 84 24 69 05 00 00 	mov    BYTE PTR [rsp+0x569],al
     1228b7a:	4b 8b 8c 3e 80 02 00 	mov    rcx,QWORD PTR [r14+r15*1+0x280]
     1228b81:	00 
     1228b82:	4b 8b 94 3e 85 02 00 	mov    rdx,QWORD PTR [r14+r15*1+0x285]
     1228b89:	00 
     1228b8a:	48 89 95 29 02 00 00 	mov    QWORD PTR [rbp+0x229],rdx
     1228b91:	48 89 8d 24 02 00 00 	mov    QWORD PTR [rbp+0x224],rcx
     1228b98:	48 83 a5 48 02 00 00 	and    QWORD PTR [rbp+0x248],0x0
     1228b9f:	00 
     1228ba0:	0f 57 c0             	xorps  xmm0,xmm0
     1228ba3:	0f 11 85 38 02 00 00 	movups XMMWORD PTR [rbp+0x238],xmm0
     1228baa:	43 38 84 3e c6 02 00 	cmp    BYTE PTR [r14+r15*1+0x2c6],al
     1228bb1:	00 
     1228bb2:	75 26                	jne    1228bda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e15e>
     1228bb4:	66 c7 84 24 99 05 00 	mov    WORD PTR [rsp+0x599],0x1
     1228bbb:	00 01 00 
     1228bbe:	b0 01                	mov    al,0x1
     1228bc0:	88 84 24 9b 05 00 00 	mov    BYTE PTR [rsp+0x59b],al
     1228bc7:	48 c7 84 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],0xbb8
     1228bce:	00 b8 0b 00 00 
     1228bd3:	88 84 24 a8 05 00 00 	mov    BYTE PTR [rsp+0x5a8],al
     1228bda:	c6 84 24 98 05 00 00 	mov    BYTE PTR [rsp+0x598],0x0
     1228be1:	00 
     1228be2:	88 84 24 b0 05 00 00 	mov    BYTE PTR [rsp+0x5b0],al
     1228be9:	43 80 bc 3e c3 02 00 	cmp    BYTE PTR [r14+r15*1+0x2c3],0x1
     1228bf0:	00 01 
     1228bf2:	0f 94 84 24 b8 05 00 	sete   BYTE PTR [rsp+0x5b8]
     1228bf9:	00 
     1228bfa:	48 8d 5c 24 60       	lea    rbx,[rsp+0x60]
     1228bff:	48 89 df             	mov    rdi,rbx
     1228c02:	e8 c5 5b 87 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1228c07:	48 89 df             	mov    rdi,rbx
     1228c0a:	48 8d 9c 24 30 03 00 	lea    rbx,[rsp+0x330]
     1228c11:	00 

### 0x1518f1f; FDE=0x15182d6..0x1519a71; base=rsp; score=60
     1518e82:	e8 b3 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518e87:	80 bb 78 02 00 00 00 	cmp    BYTE PTR [rbx+0x278],0x0
     1518e8e:	74 1f                	je     1518eaf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e433>
     1518e90:	4c 8d a3 60 02 00 00 	lea    r12,[rbx+0x260]
     1518e97:	4c 89 e7             	mov    rdi,r12
     1518e9a:	e8 b3 cc 62 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1518e9f:	48 8d bc 24 48 03 00 	lea    rdi,[rsp+0x348]
     1518ea6:	00 
     1518ea7:	4c 89 e6             	mov    rsi,r12
     1518eaa:	e8 8b 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518eaf:	80 bb 98 02 00 00 00 	cmp    BYTE PTR [rbx+0x298],0x0
     1518eb6:	74 1f                	je     1518ed7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e45b>
     1518eb8:	4c 8d a3 80 02 00 00 	lea    r12,[rbx+0x280]
     1518ebf:	4c 89 e7             	mov    rdi,r12
     1518ec2:	e8 8b cc 62 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1518ec7:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]
     1518ece:	00 
     1518ecf:	4c 89 e6             	mov    rsi,r12
     1518ed2:	e8 63 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518ed7:	80 bb b8 02 00 00 00 	cmp    BYTE PTR [rbx+0x2b8],0x0
     1518ede:	74 1f                	je     1518eff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e483>
     1518ee0:	4c 8d a3 a0 02 00 00 	lea    r12,[rbx+0x2a0]
     1518ee7:	4c 89 e7             	mov    rdi,r12
     1518eea:	e8 63 cc 62 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1518eef:	48 8d bc 24 88 03 00 	lea    rdi,[rsp+0x388]
     1518ef6:	00 
     1518ef7:	4c 89 e6             	mov    rsi,r12
     1518efa:	e8 3b 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518eff:	4c 8d b4 24 a8 03 00 	lea    r14,[rsp+0x3a8]
     1518f06:	00 
     1518f07:	80 bb d0 02 00 00 00 	cmp    BYTE PTR [rbx+0x2d0],0x0
     1518f0e:	74 2a                	je     1518f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4be>
     1518f10:	4c 8d a3 c0 02 00 00 	lea    r12,[rbx+0x2c0]
     1518f17:	4c 89 e7             	mov    rdi,r12
     1518f1a:	e8 87 d6 65 ff       	call   b765a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc3546>
     1518f1f:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     1518f26:	00 
     1518f27:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     1518f2c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1518f30:	75 08                	jne    1518f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4be>
     1518f32:	c6 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],0x1
     1518f39:	01 
     1518f3a:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1518f3f:	48 8d b0 78 13 00 00 	lea    rsi,[rax+0x1378]
     1518f46:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
     1518f4d:	00 
     1518f4e:	e8 75 25 01 00       	call   152b4c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x370a4c>
     1518f53:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
     1518f58:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     1518f5d:	89 84 24 bc 03 00 00 	mov    DWORD PTR [rsp+0x3bc],eax
     1518f64:	48 c1 e8 20          	shr    rax,0x20
     1518f68:	88 84 24 c0 03 00 00 	mov    BYTE PTR [rsp+0x3c0],al
     1518f6f:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     1518f74:	41 80 7f 40 00       	cmp    BYTE PTR [r15+0x40],0x0
     1518f79:	0f 85 80 06 00 00    	jne    15195ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35eb83>
     1518f7f:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
     1518f86:	00 
     1518f87:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1518f8e:	00 
     1518f8f:	e8 91 34 01 00       	call   152c425 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3719a9>
     1518f94:	49 8d bf f8 06 00 00 	lea    rdi,[r15+0x6f8]
     1518f9b:	4c 8d a4 24 80 04 00 	lea    r12,[rsp+0x480]
     1518fa2:	00 
     1518fa3:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     1518fa8:	4c 89 e6             	mov    rsi,r12
     1518fab:	e8 7e 2a 56 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1518fb0:	4c 89 e7             	mov    rdi,r12
     1518fb3:	e8 d8 4e 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1518fb8:	41 83 a7 10 07 00 00 	and    DWORD PTR [r15+0x710],0x0
     1518fbf:	00 
     1518fc0:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
     1518fc7:	00 f0 3f 
     1518fca:	49 89 87 18 07 00 00 	mov    QWORD PTR [r15+0x718],rax
     1518fd1:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     1518fd5:	41 0f 11 87 4c 07 00 	movups XMMWORD PTR [r15+0x74c],xmm0
     1518fdc:	00 
     1518fdd:	41 8a 46 10          	mov    al,BYTE PTR [r14+0x10]
     1518fe1:	41 88 87 5c 07 00 00 	mov    BYTE PTR [r15+0x75c],al
     1518fe8:	44 8a b4 24 b2 02 00 	mov    r14b,BYTE PTR [rsp+0x2b2]
     1518fef:	00 
     1518ff0:	48 8b b4 24 b4 02 00 	mov    rsi,QWORD PTR [rsp+0x2b4]
     1518ff7:	00 
     1518ff8:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1518fff:	00 
     1519000:	e8 ed 2d 01 00       	call   152bdf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371376>
     1519005:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     151900c:	00 
     151900d:	48 8d 8c 24 80 04 00 	lea    rcx,[rsp+0x480]
     1519014:	00 
     1519015:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     1519019:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]

### 0x1518f32; FDE=0x15182d6..0x1519a71; base=rsp; score=60
     1518e9a:	e8 b3 cc 62 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1518e9f:	48 8d bc 24 48 03 00 	lea    rdi,[rsp+0x348]
     1518ea6:	00 
     1518ea7:	4c 89 e6             	mov    rsi,r12
     1518eaa:	e8 8b 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518eaf:	80 bb 98 02 00 00 00 	cmp    BYTE PTR [rbx+0x298],0x0
     1518eb6:	74 1f                	je     1518ed7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e45b>
     1518eb8:	4c 8d a3 80 02 00 00 	lea    r12,[rbx+0x280]
     1518ebf:	4c 89 e7             	mov    rdi,r12
     1518ec2:	e8 8b cc 62 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1518ec7:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]
     1518ece:	00 
     1518ecf:	4c 89 e6             	mov    rsi,r12
     1518ed2:	e8 63 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518ed7:	80 bb b8 02 00 00 00 	cmp    BYTE PTR [rbx+0x2b8],0x0
     1518ede:	74 1f                	je     1518eff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e483>
     1518ee0:	4c 8d a3 a0 02 00 00 	lea    r12,[rbx+0x2a0]
     1518ee7:	4c 89 e7             	mov    rdi,r12
     1518eea:	e8 63 cc 62 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1518eef:	48 8d bc 24 88 03 00 	lea    rdi,[rsp+0x388]
     1518ef6:	00 
     1518ef7:	4c 89 e6             	mov    rsi,r12
     1518efa:	e8 3b 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518eff:	4c 8d b4 24 a8 03 00 	lea    r14,[rsp+0x3a8]
     1518f06:	00 
     1518f07:	80 bb d0 02 00 00 00 	cmp    BYTE PTR [rbx+0x2d0],0x0
     1518f0e:	74 2a                	je     1518f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4be>
     1518f10:	4c 8d a3 c0 02 00 00 	lea    r12,[rbx+0x2c0]
     1518f17:	4c 89 e7             	mov    rdi,r12
     1518f1a:	e8 87 d6 65 ff       	call   b765a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc3546>
     1518f1f:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     1518f26:	00 
     1518f27:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     1518f2c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1518f30:	75 08                	jne    1518f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4be>
     1518f32:	c6 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],0x1
     1518f39:	01 
     1518f3a:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1518f3f:	48 8d b0 78 13 00 00 	lea    rsi,[rax+0x1378]
     1518f46:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
     1518f4d:	00 
     1518f4e:	e8 75 25 01 00       	call   152b4c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x370a4c>
     1518f53:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
     1518f58:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     1518f5d:	89 84 24 bc 03 00 00 	mov    DWORD PTR [rsp+0x3bc],eax
     1518f64:	48 c1 e8 20          	shr    rax,0x20
     1518f68:	88 84 24 c0 03 00 00 	mov    BYTE PTR [rsp+0x3c0],al
     1518f6f:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     1518f74:	41 80 7f 40 00       	cmp    BYTE PTR [r15+0x40],0x0
     1518f79:	0f 85 80 06 00 00    	jne    15195ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35eb83>
     1518f7f:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
     1518f86:	00 
     1518f87:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1518f8e:	00 
     1518f8f:	e8 91 34 01 00       	call   152c425 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3719a9>
     1518f94:	49 8d bf f8 06 00 00 	lea    rdi,[r15+0x6f8]
     1518f9b:	4c 8d a4 24 80 04 00 	lea    r12,[rsp+0x480]
     1518fa2:	00 
     1518fa3:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     1518fa8:	4c 89 e6             	mov    rsi,r12
     1518fab:	e8 7e 2a 56 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1518fb0:	4c 89 e7             	mov    rdi,r12
     1518fb3:	e8 d8 4e 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1518fb8:	41 83 a7 10 07 00 00 	and    DWORD PTR [r15+0x710],0x0
     1518fbf:	00 
     1518fc0:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
     1518fc7:	00 f0 3f 
     1518fca:	49 89 87 18 07 00 00 	mov    QWORD PTR [r15+0x718],rax
     1518fd1:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     1518fd5:	41 0f 11 87 4c 07 00 	movups XMMWORD PTR [r15+0x74c],xmm0
     1518fdc:	00 
     1518fdd:	41 8a 46 10          	mov    al,BYTE PTR [r14+0x10]
     1518fe1:	41 88 87 5c 07 00 00 	mov    BYTE PTR [r15+0x75c],al
     1518fe8:	44 8a b4 24 b2 02 00 	mov    r14b,BYTE PTR [rsp+0x2b2]
     1518fef:	00 
     1518ff0:	48 8b b4 24 b4 02 00 	mov    rsi,QWORD PTR [rsp+0x2b4]
     1518ff7:	00 
     1518ff8:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1518fff:	00 
     1519000:	e8 ed 2d 01 00       	call   152bdf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371376>
     1519005:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     151900c:	00 
     151900d:	48 8d 8c 24 80 04 00 	lea    rcx,[rsp+0x480]
     1519014:	00 
     1519015:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     1519019:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
     1519020:	00 
     1519021:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
     1519024:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
     151902b:	00 00 
     151902d:	0f 57 c0             	xorps  xmm0,xmm0

### 0xa8ba91; FDE=0xa8ae88..0xa8c879; base=rsp; score=50
      a8b9fa:	e8 7f e0 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a8b9ff:	48 8d 35 1f 62 9c ff 	lea    rsi,[rip+0xffffffffff9c621f]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
      a8ba06:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      a8ba0b:	e8 6e e0 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a8ba10:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
      a8ba17:	00 
      a8ba18:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
      a8ba1d:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      a8ba22:	31 c9                	xor    ecx,ecx
      a8ba24:	e8 c5 0c 28 00       	call   d0c6ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25968e>
      a8ba29:	c7 84 24 f0 0b 00 00 	mov    DWORD PTR [rsp+0xbf0],0x10
      a8ba30:	10 00 00 00 
      a8ba34:	0f 28 84 24 a0 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x3a0]
      a8ba3b:	00 
      a8ba3c:	0f 11 84 24 f8 0b 00 	movups XMMWORD PTR [rsp+0xbf8],xmm0
      a8ba43:	00 
      a8ba44:	48 8b 84 24 b0 03 00 	mov    rax,QWORD PTR [rsp+0x3b0]
      a8ba4b:	00 
      a8ba4c:	48 89 84 24 08 0c 00 	mov    QWORD PTR [rsp+0xc08],rax
      a8ba53:	00 
      a8ba54:	48 83 a4 24 b0 03 00 	and    QWORD PTR [rsp+0x3b0],0x0
      a8ba5b:	00 00 
      a8ba5d:	0f 57 c0             	xorps  xmm0,xmm0
      a8ba60:	0f 29 84 24 a0 03 00 	movaps XMMWORD PTR [rsp+0x3a0],xmm0
      a8ba67:	00 
      a8ba68:	0f 10 8c 24 b8 03 00 	movups xmm1,XMMWORD PTR [rsp+0x3b8]
      a8ba6f:	00 
      a8ba70:	0f 11 8c 24 10 0c 00 	movups XMMWORD PTR [rsp+0xc10],xmm1
      a8ba77:	00 
      a8ba78:	48 8b 84 24 c8 03 00 	mov    rax,QWORD PTR [rsp+0x3c8]
      a8ba7f:	00 
      a8ba80:	48 83 a4 24 c8 03 00 	and    QWORD PTR [rsp+0x3c8],0x0
      a8ba87:	00 00 
      a8ba89:	48 89 84 24 20 0c 00 	mov    QWORD PTR [rsp+0xc20],rax
      a8ba90:	00 
      a8ba91:	0f 11 84 24 b8 03 00 	movups XMMWORD PTR [rsp+0x3b8],xmm0
      a8ba98:	00 
      a8ba99:	8b 84 24 d0 03 00 00 	mov    eax,DWORD PTR [rsp+0x3d0]
      a8baa0:	89 84 24 28 0c 00 00 	mov    DWORD PTR [rsp+0xc28],eax
      a8baa7:	48 8d 35 3c d7 8a ff 	lea    rsi,[rip+0xffffffffff8ad73c]        # 3391ea <_ZTSSt12bad_any_cast@@Base-0x56fde>
      a8baae:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      a8bab3:	e8 c6 df fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a8bab8:	48 8d 35 66 61 9c ff 	lea    rsi,[rip+0xffffffffff9c6166]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
      a8babf:	48 89 e7             	mov    rdi,rsp
      a8bac2:	e8 b7 df fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a8bac7:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
      a8bace:	00 
      a8bacf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      a8bad4:	48 89 e2             	mov    rdx,rsp
      a8bad7:	31 c9                	xor    ecx,ecx
      a8bad9:	e8 10 0c 28 00       	call   d0c6ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25968e>
      a8bade:	c7 84 24 30 0c 00 00 	mov    DWORD PTR [rsp+0xc30],0x11
      a8bae5:	11 00 00 00 
      a8bae9:	0f 28 84 24 60 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x360]
      a8baf0:	00 
      a8baf1:	0f 11 84 24 38 0c 00 	movups XMMWORD PTR [rsp+0xc38],xmm0
      a8baf8:	00 
      a8baf9:	48 8b 84 24 70 03 00 	mov    rax,QWORD PTR [rsp+0x370]
      a8bb00:	00 
      a8bb01:	48 89 84 24 48 0c 00 	mov    QWORD PTR [rsp+0xc48],rax
      a8bb08:	00 
      a8bb09:	0f 57 c0             	xorps  xmm0,xmm0
      a8bb0c:	0f 29 84 24 60 03 00 	movaps XMMWORD PTR [rsp+0x360],xmm0
      a8bb13:	00 
      a8bb14:	48 83 a4 24 70 03 00 	and    QWORD PTR [rsp+0x370],0x0
      a8bb1b:	00 00 
      a8bb1d:	0f 10 8c 24 78 03 00 	movups xmm1,XMMWORD PTR [rsp+0x378]
      a8bb24:	00 
      a8bb25:	0f 11 8c 24 50 0c 00 	movups XMMWORD PTR [rsp+0xc50],xmm1
      a8bb2c:	00 
      a8bb2d:	48 8b 84 24 88 03 00 	mov    rax,QWORD PTR [rsp+0x388]
      a8bb34:	00 
      a8bb35:	48 89 84 24 60 0c 00 	mov    QWORD PTR [rsp+0xc60],rax
      a8bb3c:	00 
      a8bb3d:	0f 11 84 24 78 03 00 	movups XMMWORD PTR [rsp+0x378],xmm0
      a8bb44:	00 
      a8bb45:	48 83 a4 24 88 03 00 	and    QWORD PTR [rsp+0x388],0x0
      a8bb4c:	00 00 
      a8bb4e:	8b 84 24 90 03 00 00 	mov    eax,DWORD PTR [rsp+0x390]
      a8bb55:	89 84 24 68 0c 00 00 	mov    DWORD PTR [rsp+0xc68],eax
      a8bb5c:	0f 11 05 3d f1 f5 00 	movups XMMWORD PTR [rip+0xf5f13d],xmm0        # 19eaca0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18d8>
      a8bb63:	0f 11 05 26 f1 f5 00 	movups XMMWORD PTR [rip+0xf5f126],xmm0        # 19eac90 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18c8>
      a8bb6a:	c7 05 3c f1 f5 00 00 	mov    DWORD PTR [rip+0xf5f13c],0x3f800000        # 19eacb0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18e8>
      a8bb71:	00 80 3f 
      a8bb74:	45 31 ed             	xor    r13d,r13d
      a8bb77:	48 8d 2d 22 f1 f5 00 	lea    rbp,[rip+0xf5f122]        # 19eaca0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18d8>
      a8bb7e:	31 db                	xor    ebx,ebx
      a8bb80:	44 8b b4 1c f0 07 00 	mov    r14d,DWORD PTR [rsp+rbx*1+0x7f0]
      a8bb87:	00 
      a8bb88:	4d 63 fe             	movsxd r15,r14d
      a8bb8b:	4d 85 ed             	test   r13,r13

### 0xd6cad8; FDE=0xd6aa99..0xd6f087; base=rsp; score=50
      d6ca45:	6a 10                	push   0x10
      d6ca47:	5f                   	pop    rdi
      d6ca48:	e8 b3 14 a8 00       	call   17edf00 <_Znwm@plt>
      d6ca4d:	48 89 c1             	mov    rcx,rax
      d6ca50:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6ca55:	48 89 01             	mov    QWORD PTR [rcx],rax
      d6ca58:	48 89 8c 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rcx
      d6ca5f:	00 
      d6ca60:	c6 41 08 00          	mov    BYTE PTR [rcx+0x8],0x0
      d6ca64:	48 8d 35 4d a6 ab 00 	lea    rsi,[rip+0xaba64d]        # 18270b8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x36e8>
      d6ca6b:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
      d6ca72:	00 
      d6ca73:	e8 7e 0a e2 ff       	call   b8d4f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda496>
      d6ca78:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
      d6ca7f:	00 
      d6ca80:	48 8d 94 24 c0 03 00 	lea    rdx,[rsp+0x3c0]
      d6ca87:	00 
      d6ca88:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
      d6ca8d:	e8 15 b8 d3 ff       	call   aa82a7 <JNI_OnUnload@@Base+0x2fb74>
      d6ca92:	48 8d bc 24 f0 03 00 	lea    rdi,[rsp+0x3f0]
      d6ca99:	00 
      d6ca9a:	48 8d b4 24 d8 03 00 	lea    rsi,[rsp+0x3d8]
      d6caa1:	00 
      d6caa2:	e8 99 14 a8 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d6caa7:	48 8b 94 24 d8 00 00 	mov    rdx,QWORD PTR [rsp+0xd8]
      d6caae:	00 
      d6caaf:	48 8b 1a             	mov    rbx,QWORD PTR [rdx]
      d6cab2:	48 8b 83 88 00 00 00 	mov    rax,QWORD PTR [rbx+0x88]
      d6cab9:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
      d6cabe:	48 8d 05 5b a7 ab 00 	lea    rax,[rip+0xaba75b]        # 1827220 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3850>
      d6cac5:	48 8d 8c 24 30 07 00 	lea    rcx,[rsp+0x730]
      d6cacc:	00 
      d6cacd:	48 89 01             	mov    QWORD PTR [rcx],rax
      d6cad0:	48 89 51 08          	mov    QWORD PTR [rcx+0x8],rdx
      d6cad4:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      d6cad8:	48 89 94 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rdx
      d6cadf:	00 
      d6cae0:	4c 8d b4 24 c0 04 00 	lea    r14,[rsp+0x4c0]
      d6cae7:	00 
      d6cae8:	48 8d b4 24 f0 03 00 	lea    rsi,[rsp+0x3f0]
      d6caef:	00 
      d6caf0:	4c 89 f7             	mov    rdi,r14
      d6caf3:	e8 32 12 a4 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>
      d6caf8:	48 8b 84 24 c8 04 00 	mov    rax,QWORD PTR [rsp+0x4c8]
      d6caff:	00 
      d6cb00:	80 78 14 00          	cmp    BYTE PTR [rax+0x14],0x0
      d6cb04:	0f 85 1f 0d 00 00    	jne    d6d829 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a8af>
      d6cb0a:	48 8d 83 a8 0b 00 00 	lea    rax,[rbx+0xba8]
      d6cb11:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      d6cb18:	00 
      d6cb19:	48 8d 8c 24 a8 04 00 	lea    rcx,[rsp+0x4a8]
      d6cb20:	00 
      d6cb21:	66 c7 41 d8 01 00    	mov    WORD PTR [rcx-0x28],0x1
      d6cb27:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0
      d6cb2c:	83 61 e8 00          	and    DWORD PTR [rcx-0x18],0x0
      d6cb30:	4c 89 71 f0          	mov    QWORD PTR [rcx-0x10],r14
      d6cb34:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      d6cb38:	48 89 69 08          	mov    QWORD PTR [rcx+0x8],rbp
      d6cb3c:	48 b8 01 00 00 00 40 	movabs rax,0x4000000001
      d6cb43:	00 00 00 
      d6cb46:	48 89 41 f8          	mov    QWORD PTR [rcx-0x8],rax
      d6cb4a:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      d6cb4d:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      d6cb54:	00 
      d6cb55:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      d6cb59:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      d6cb5d:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
      d6cb64:	00 
      d6cb65:	48 89 69 08          	mov    QWORD PTR [rcx+0x8],rbp
      d6cb69:	48 8d 83 20 0c 00 00 	lea    rax,[rbx+0xc20]
      d6cb70:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
      d6cb77:	00 
      d6cb78:	48 8d 83 30 0c 00 00 	lea    rax,[rbx+0xc30]
      d6cb7f:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
      d6cb86:	00 
      d6cb87:	48 8d 83 48 0c 00 00 	lea    rax,[rbx+0xc48]
      d6cb8e:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      d6cb95:	00 
      d6cb96:	b8 88 00 00 00       	mov    eax,0x88
      d6cb9b:	4c 01 e0             	add    rax,r12
      d6cb9e:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      d6cba3:	48 8d 84 24 60 07 00 	lea    rax,[rsp+0x760]
      d6cbaa:	00 
      d6cbab:	48 01 e8             	add    rax,rbp
      d6cbae:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      d6cbb5:	00 
      d6cbb6:	4c 8d bc 24 40 04 00 	lea    r15,[rsp+0x440]
      d6cbbd:	00 
      d6cbbe:	49 8d 04 2f          	lea    rax,[r15+rbp*1]
      d6cbc2:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      d6cbc7:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx

### 0xdf878e; FDE=0xdf78ee..0xdf9239; base=rsp; score=50
      df86f5:	0f 85 ff 0a 00 00    	jne    df91fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6280>
      df86fb:	48 85 c0             	test   rax,rax
      df86fe:	0f 84 0c 09 00 00    	je     df9010 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6096>
      df8704:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
      df870b:	00 
      df870c:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
      df8713:	00 
      df8714:	e8 47 63 95 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
      df8719:	e9 2a 09 00 00       	jmp    df9048 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc60ce>
      df871e:	0f 57 c0             	xorps  xmm0,xmm0
      df8721:	4c 8d ac 24 80 02 00 	lea    r13,[rsp+0x280]
      df8728:	00 
      df8729:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
      df872e:	48 8d 05 83 e1 a7 00 	lea    rax,[rip+0xa7e183]        # 18768b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32fa0>
      df8735:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      df8739:	48 8d 2d b8 70 64 ff 	lea    rbp,[rip+0xffffffffff6470b8]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      df8740:	49 89 6d 18          	mov    QWORD PTR [r13+0x18],rbp
      df8744:	49 89 6d 20          	mov    QWORD PTR [r13+0x20],rbp
      df8748:	49 83 65 28 00       	and    QWORD PTR [r13+0x28],0x0
      df874d:	49 83 c4 30          	add    r12,0x30
      df8751:	4c 89 e7             	mov    rdi,r12
      df8754:	e8 dd 30 c8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      df8759:	4c 89 ef             	mov    rdi,r13
      df875c:	48 89 c6             	mov    rsi,rax
      df875f:	e8 ee 70 98 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
      df8764:	0f 57 c0             	xorps  xmm0,xmm0
      df8767:	84 c0                	test   al,al
      df8769:	0f 84 25 02 00 00    	je     df8994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a1a>
      df876f:	0f 11 84 24 a0 03 00 	movups XMMWORD PTR [rsp+0x3a0],xmm0
      df8776:	00 
      df8777:	48 8d 05 3a e1 a7 00 	lea    rax,[rip+0xa7e13a]        # 18768b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32fa0>
      df877e:	48 89 84 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rax
      df8785:	00 
      df8786:	48 89 ac 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rbp
      df878d:	00 
      df878e:	48 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rbp
      df8795:	00 
      df8796:	48 83 a4 24 c0 03 00 	and    QWORD PTR [rsp+0x3c0],0x0
      df879d:	00 00 
      df879f:	48 8b 84 24 88 02 00 	mov    rax,QWORD PTR [rsp+0x288]
      df87a6:	00 
      df87a7:	a8 01                	test   al,0x1
      df87a9:	0f 85 57 0a 00 00    	jne    df9206 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc628c>
      df87af:	48 85 c0             	test   rax,rax
      df87b2:	0f 84 0b 09 00 00    	je     df90c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6149>
      df87b8:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
      df87bf:	00 
      df87c0:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
      df87c7:	00 
      df87c8:	e8 93 62 95 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
      df87cd:	e9 29 09 00 00       	jmp    df90fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6181>
      df87d2:	4c 8d ac 24 80 02 00 	lea    r13,[rsp+0x280]
      df87d9:	00 
      df87da:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
      df87df:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0
      df87e4:	48 8d 05 4d 05 ab 00 	lea    rax,[rip+0xab054d]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>
      df87eb:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      df87ef:	49 83 c4 30          	add    r12,0x30
      df87f3:	4c 89 e7             	mov    rdi,r12
      df87f6:	e8 3b 30 c8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      df87fb:	4c 89 ef             	mov    rdi,r13
      df87fe:	48 89 c6             	mov    rsi,rax
      df8801:	e8 4c 70 98 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
      df8806:	84 c0                	test   al,al
      df8808:	0f 84 df 00 00 00    	je     df88ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5973>
      df880e:	48 8d bc 24 10 03 00 	lea    rdi,[rsp+0x310]
      df8815:	00 
      df8816:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
      df881d:	00 
      df881e:	e8 e1 70 cb ff       	call   aaf904 <JNI_OnUnload@@Base+0x371d1>
      df8823:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
      df882a:	00 
      df882b:	4c 89 fe             	mov    rsi,r15
      df882e:	e8 06 21 cb ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
      df8833:	49 8b 06             	mov    rax,QWORD PTR [r14]
      df8836:	4c 8d bc 24 10 03 00 	lea    r15,[rsp+0x310]
      df883d:	00 
      df883e:	4c 8d a4 24 98 00 00 	lea    r12,[rsp+0x98]
      df8845:	00 
      df8846:	48 89 df             	mov    rdi,rbx
      df8849:	4c 89 f6             	mov    rsi,r14
      df884c:	4c 89 fa             	mov    rdx,r15
      df884f:	4c 89 e1             	mov    rcx,r12
      df8852:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
      df8858:	eb 7f                	jmp    df88d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc595f>
      df885a:	4c 8d ac 24 80 02 00 	lea    r13,[rsp+0x280]
      df8861:	00 
      df8862:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
      df8867:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0
      df886c:	48 8d 05 c5 04 ab 00 	lea    rax,[rip+0xab04c5]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>
      df8873:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax

### 0x127bb38; FDE=0x127b26e..0x127d87f; base=rsp; score=50
     127ba96:	48 8d b4 24 20 04 00 	lea    rsi,[rsp+0x420]
     127ba9d:	00 
     127ba9e:	e8 bd 2f 4d 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
     127baa3:	e9 94 11 00 00       	jmp    127cc3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc21c0>
     127baa8:	4c 8d ac 24 20 04 00 	lea    r13,[rsp+0x420]
     127baaf:	00 
     127bab0:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
     127bab5:	48 8d 05 6c 6d 62 00 	lea    rax,[rip+0x626d6c]        # 18a2828 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xf768>
     127babc:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     127bac0:	0f 57 c0             	xorps  xmm0,xmm0
     127bac3:	41 0f 11 45 10       	movups XMMWORD PTR [r13+0x10],xmm0
     127bac8:	48 8d 05 c9 4c 73 00 	lea    rax,[rip+0x734cc9]        # 19b0798 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x793e0>
     127bacf:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
     127bad3:	0f 28 0d f6 21 11 ff 	movaps xmm1,XMMWORD PTR [rip+0xffffffffff1121f6]        # 38dcd0 <_ZTSSt12bad_any_cast@@Base-0x24f8>
     127bada:	41 0f 11 4d 28       	movups XMMWORD PTR [r13+0x28],xmm1
     127badf:	48 8d 2d e2 3a 1c ff 	lea    rbp,[rip+0xffffffffff1c3ae2]        # 43f5c8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x51d4>
     127bae6:	49 89 6d 38          	mov    QWORD PTR [r13+0x38],rbp
     127baea:	49 83 c4 30          	add    r12,0x30
     127baee:	41 0f 11 45 40       	movups XMMWORD PTR [r13+0x40],xmm0
     127baf3:	41 0f 11 45 50       	movups XMMWORD PTR [r13+0x50],xmm0
     127baf8:	41 0f 11 45 60       	movups XMMWORD PTR [r13+0x60],xmm0
     127bafd:	41 83 65 70 00       	and    DWORD PTR [r13+0x70],0x0
     127bb02:	4c 89 e7             	mov    rdi,r12
     127bb05:	e8 2c fd 7f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     127bb0a:	4c 89 ef             	mov    rdi,r13
     127bb0d:	48 89 c6             	mov    rsi,rax
     127bb10:	e8 3d 3d 50 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     127bb15:	84 c0                	test   al,al
     127bb17:	0f 84 46 0b 00 00    	je     127c663 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1be7>
     127bb1d:	48 83 a4 24 b0 03 00 	and    QWORD PTR [rsp+0x3b0],0x0
     127bb24:	00 00 
     127bb26:	48 8d 05 fb 6c 62 00 	lea    rax,[rip+0x626cfb]        # 18a2828 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xf768>
     127bb2d:	48 89 84 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],rax
     127bb34:	00 
     127bb35:	0f 57 c0             	xorps  xmm0,xmm0
     127bb38:	0f 11 84 24 b8 03 00 	movups XMMWORD PTR [rsp+0x3b8],xmm0
     127bb3f:	00 
     127bb40:	48 8d 05 51 4c 73 00 	lea    rax,[rip+0x734c51]        # 19b0798 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x793e0>
     127bb47:	48 89 84 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],rax
     127bb4e:	00 
     127bb4f:	0f 28 0d 7a 21 11 ff 	movaps xmm1,XMMWORD PTR [rip+0xffffffffff11217a]        # 38dcd0 <_ZTSSt12bad_any_cast@@Base-0x24f8>
     127bb56:	0f 11 8c 24 d0 03 00 	movups XMMWORD PTR [rsp+0x3d0],xmm1
     127bb5d:	00 
     127bb5e:	48 89 ac 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rbp
     127bb65:	00 
     127bb66:	0f 11 84 24 e8 03 00 	movups XMMWORD PTR [rsp+0x3e8],xmm0
     127bb6d:	00 
     127bb6e:	83 a4 24 18 04 00 00 	and    DWORD PTR [rsp+0x418],0x0
     127bb75:	00 
     127bb76:	0f 11 84 24 f8 03 00 	movups XMMWORD PTR [rsp+0x3f8],xmm0
     127bb7d:	00 
     127bb7e:	0f 11 84 24 08 04 00 	movups XMMWORD PTR [rsp+0x408],xmm0
     127bb85:	00 
     127bb86:	48 8b 84 24 28 04 00 	mov    rax,QWORD PTR [rsp+0x428]
     127bb8d:	00 
     127bb8e:	a8 01                	test   al,0x1
     127bb90:	0f 85 cc 1b 00 00    	jne    127d762 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2ce6>
     127bb96:	48 85 c0             	test   rax,rax
     127bb99:	0f 84 f3 10 00 00    	je     127cc92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2216>
     127bb9f:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
     127bba6:	00 
     127bba7:	48 8d b4 24 20 04 00 	lea    rsi,[rsp+0x420]
     127bbae:	00 
     127bbaf:	e8 ac 2e 4d 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
     127bbb4:	e9 11 11 00 00       	jmp    127ccca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc224e>
     127bbb9:	0f 57 c0             	xorps  xmm0,xmm0
     127bbbc:	4c 8d ac 24 20 04 00 	lea    r13,[rsp+0x420]
     127bbc3:	00 
     127bbc4:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
     127bbc9:	48 8d 05 90 6f 62 00 	lea    rax,[rip+0x626f90]        # 18a2b60 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xfaa0>
     127bbd0:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     127bbd4:	48 8d 2d 1d 3c 1c ff 	lea    rbp,[rip+0xffffffffff1c3c1d]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     127bbdb:	49 89 6d 18          	mov    QWORD PTR [r13+0x18],rbp
     127bbdf:	49 89 6d 20          	mov    QWORD PTR [r13+0x20],rbp
     127bbe3:	41 0f 11 45 28       	movups XMMWORD PTR [r13+0x28],xmm0
     127bbe8:	49 83 c4 30          	add    r12,0x30
     127bbec:	4c 89 e7             	mov    rdi,r12
     127bbef:	e8 42 fc 7f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     127bbf4:	4c 89 ef             	mov    rdi,r13
     127bbf7:	48 89 c6             	mov    rsi,rax
     127bbfa:	e8 53 3c 50 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     127bbff:	0f 57 c0             	xorps  xmm0,xmm0
     127bc02:	84 c0                	test   al,al
     127bc04:	0f 84 64 0a 00 00    	je     127c66e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1bf2>
     127bc0a:	0f 11 84 24 40 02 00 	movups XMMWORD PTR [rsp+0x240],xmm0
     127bc11:	00 
     127bc12:	48 8d 05 47 6f 62 00 	lea    rax,[rip+0x626f47]        # 18a2b60 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xfaa0>
     127bc19:	48 89 84 24 38 02 00 	mov    QWORD PTR [rsp+0x238],rax
     127bc20:	00 
     127bc21:	48 89 ac 24 50 02 00 	mov    QWORD PTR [rsp+0x250],rbp
     127bc28:	00 

### 0x14b9a13; FDE=0x14b91f2..0x14ba12f; base=rsp; score=50
     14b9983:	41 0f 28 87 20 01 00 	movaps xmm0,XMMWORD PTR [r15+0x120]
     14b998a:	00 
     14b998b:	0f 29 84 24 20 03 00 	movaps XMMWORD PTR [rsp+0x320],xmm0
     14b9992:	00 
     14b9993:	48 85 c0             	test   rax,rax
     14b9996:	74 05                	je     14b999d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fef21>
     14b9998:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14b999d:	49 8b 87 38 01 00 00 	mov    rax,QWORD PTR [r15+0x138]
     14b99a4:	41 0f 28 87 30 01 00 	movaps xmm0,XMMWORD PTR [r15+0x130]
     14b99ab:	00 
     14b99ac:	0f 29 84 24 30 03 00 	movaps XMMWORD PTR [rsp+0x330],xmm0
     14b99b3:	00 
     14b99b4:	48 85 c0             	test   rax,rax
     14b99b7:	74 05                	je     14b99be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fef42>
     14b99b9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14b99be:	4c 8d ac 24 40 03 00 	lea    r13,[rsp+0x340]
     14b99c5:	00 
     14b99c6:	4c 89 ef             	mov    rdi,r13
     14b99c9:	4c 89 f6             	mov    rsi,r14
     14b99cc:	e8 bf 08 5c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14b99d1:	4c 8d b4 24 70 03 00 	lea    r14,[rsp+0x370]
     14b99d8:	00 
     14b99d9:	4c 89 f7             	mov    rdi,r14
     14b99dc:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     14b99e1:	e8 aa 08 5c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14b99e6:	89 ac 24 a0 03 00 00 	mov    DWORD PTR [rsp+0x3a0],ebp
     14b99ed:	49 8b 87 80 01 00 00 	mov    rax,QWORD PTR [r15+0x180]
     14b99f4:	41 0f 10 87 78 01 00 	movups xmm0,XMMWORD PTR [r15+0x178]
     14b99fb:	00 
     14b99fc:	0f 11 84 24 a8 03 00 	movups XMMWORD PTR [rsp+0x3a8],xmm0
     14b9a03:	00 
     14b9a04:	48 85 c0             	test   rax,rax
     14b9a07:	74 05                	je     14b9a0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fef92>
     14b9a09:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14b9a0e:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14b9a13:	48 89 84 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rax
     14b9a1a:	00 
     14b9a1b:	48 83 a4 24 e0 03 00 	and    QWORD PTR [rsp+0x3e0],0x0
     14b9a22:	00 00 
     14b9a24:	bf c0 01 00 00       	mov    edi,0x1c0
     14b9a29:	e8 d2 44 33 00       	call   17edf00 <_Znwm@plt>
     14b9a2e:	49 89 c7             	mov    r15,rax
     14b9a31:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
     14b9a38:	00 
     14b9a39:	4c 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r15
     14b9a40:	00 
     14b9a41:	48 8d 8c 24 af 00 00 	lea    rcx,[rsp+0xaf]
     14b9a48:	00 
     14b9a49:	48 89 8c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rcx
     14b9a50:	00 
     14b9a51:	48 c7 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],0x1
     14b9a58:	00 01 00 00 00 
     14b9a5d:	48 8d 0d 5c ee 3b 00 	lea    rcx,[rip+0x3bee5c]        # 18788c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34fa8>
     14b9a64:	49 89 0f             	mov    QWORD PTR [r15],rcx
     14b9a67:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
     14b9a6b:	41 0f 29 47 10       	movaps XMMWORD PTR [r15+0x10],xmm0
     14b9a70:	48 8b 48 10          	mov    rcx,QWORD PTR [rax+0x10]
     14b9a74:	49 89 4f 30          	mov    QWORD PTR [r15+0x30],rcx
     14b9a78:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     14b9a7b:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
     14b9a80:	48 8b 48 28          	mov    rcx,QWORD PTR [rax+0x28]
     14b9a84:	49 89 4f 48          	mov    QWORD PTR [r15+0x48],rcx
     14b9a88:	0f 10 40 18          	movups xmm0,XMMWORD PTR [rax+0x18]
     14b9a8c:	41 0f 11 47 38       	movups XMMWORD PTR [r15+0x38],xmm0
     14b9a91:	48 8b 48 40          	mov    rcx,QWORD PTR [rax+0x40]
     14b9a95:	49 89 4f 60          	mov    QWORD PTR [r15+0x60],rcx
     14b9a99:	0f 10 40 30          	movups xmm0,XMMWORD PTR [rax+0x30]
     14b9a9d:	41 0f 11 47 50       	movups XMMWORD PTR [r15+0x50],xmm0
     14b9aa2:	48 8b 48 58          	mov    rcx,QWORD PTR [rax+0x58]
     14b9aa6:	49 89 4f 78          	mov    QWORD PTR [r15+0x78],rcx
     14b9aaa:	0f 10 40 48          	movups xmm0,XMMWORD PTR [rax+0x48]
     14b9aae:	41 0f 11 47 68       	movups XMMWORD PTR [r15+0x68],xmm0
     14b9ab3:	0f 10 40 60          	movups xmm0,XMMWORD PTR [rax+0x60]
     14b9ab7:	41 0f 11 87 80 00 00 	movups XMMWORD PTR [r15+0x80],xmm0
     14b9abe:	00 
     14b9abf:	48 8b 48 70          	mov    rcx,QWORD PTR [rax+0x70]
     14b9ac3:	49 89 8f 90 00 00 00 	mov    QWORD PTR [r15+0x90],rcx
     14b9aca:	48 8b 88 80 00 00 00 	mov    rcx,QWORD PTR [rax+0x80]
     14b9ad1:	0f 10 40 78          	movups xmm0,XMMWORD PTR [rax+0x78]
     14b9ad5:	41 0f 11 87 98 00 00 	movups XMMWORD PTR [r15+0x98],xmm0
     14b9adc:	00 
     14b9add:	48 85 c9             	test   rcx,rcx
     14b9ae0:	74 05                	je     14b9ae7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ff06b>
     14b9ae2:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     14b9ae7:	48 8b 84 24 b0 02 00 	mov    rax,QWORD PTR [rsp+0x2b0]
     14b9aee:	00 
     14b9aef:	0f 10 84 24 a8 02 00 	movups xmm0,XMMWORD PTR [rsp+0x2a8]
     14b9af6:	00 
     14b9af7:	41 0f 11 87 a8 00 00 	movups XMMWORD PTR [r15+0xa8],xmm0
     14b9afe:	00 
     14b9aff:	48 85 c0             	test   rax,rax

### 0x15230d0; FDE=0x15229bc..0x1523550; base=rbx; score=50
     152301a:	49 8b be 78 03 00 00 	mov    rdi,QWORD PTR [r14+0x378]
     1523021:	31 f6                	xor    esi,esi
     1523023:	e8 de 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523028:	48 89 83 78 03 00 00 	mov    QWORD PTR [rbx+0x378],rax
     152302f:	49 8b be 80 03 00 00 	mov    rdi,QWORD PTR [r14+0x380]
     1523036:	31 f6                	xor    esi,esi
     1523038:	e8 c9 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152303d:	48 89 83 80 03 00 00 	mov    QWORD PTR [rbx+0x380],rax
     1523044:	49 8b be 88 03 00 00 	mov    rdi,QWORD PTR [r14+0x388]
     152304b:	31 f6                	xor    esi,esi
     152304d:	e8 b4 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523052:	48 89 83 88 03 00 00 	mov    QWORD PTR [rbx+0x388],rax
     1523059:	49 8b be 90 03 00 00 	mov    rdi,QWORD PTR [r14+0x390]
     1523060:	31 f6                	xor    esi,esi
     1523062:	e8 9f 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523067:	48 89 83 90 03 00 00 	mov    QWORD PTR [rbx+0x390],rax
     152306e:	49 8b be 98 03 00 00 	mov    rdi,QWORD PTR [r14+0x398]
     1523075:	31 f6                	xor    esi,esi
     1523077:	e8 8a 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152307c:	48 89 83 98 03 00 00 	mov    QWORD PTR [rbx+0x398],rax
     1523083:	49 8b be a0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3a0]
     152308a:	31 f6                	xor    esi,esi
     152308c:	e8 75 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523091:	48 89 83 a0 03 00 00 	mov    QWORD PTR [rbx+0x3a0],rax
     1523098:	49 8b be a8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3a8]
     152309f:	31 f6                	xor    esi,esi
     15230a1:	e8 60 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230a6:	48 89 83 a8 03 00 00 	mov    QWORD PTR [rbx+0x3a8],rax
     15230ad:	49 8b be b0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3b0]
     15230b4:	31 f6                	xor    esi,esi
     15230b6:	e8 4b 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230bb:	48 89 83 b0 03 00 00 	mov    QWORD PTR [rbx+0x3b0],rax
     15230c2:	49 8b be b8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3b8]
     15230c9:	31 f6                	xor    esi,esi
     15230cb:	e8 36 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230d0:	48 89 83 b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],rax
     15230d7:	49 8b be c0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3c0]
     15230de:	31 f6                	xor    esi,esi
     15230e0:	e8 21 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230e5:	48 89 83 c0 03 00 00 	mov    QWORD PTR [rbx+0x3c0],rax
     15230ec:	49 8b be c8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3c8]
     15230f3:	31 f6                	xor    esi,esi
     15230f5:	e8 0c 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230fa:	48 89 83 c8 03 00 00 	mov    QWORD PTR [rbx+0x3c8],rax
     1523101:	49 8b be d0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3d0]
     1523108:	31 f6                	xor    esi,esi
     152310a:	e8 f7 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152310f:	48 89 83 d0 03 00 00 	mov    QWORD PTR [rbx+0x3d0],rax
     1523116:	49 8b be d8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3d8]
     152311d:	31 f6                	xor    esi,esi
     152311f:	e8 e2 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523124:	48 89 83 d8 03 00 00 	mov    QWORD PTR [rbx+0x3d8],rax
     152312b:	49 8b be e0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3e0]
     1523132:	31 f6                	xor    esi,esi
     1523134:	e8 cd 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523139:	48 89 83 e0 03 00 00 	mov    QWORD PTR [rbx+0x3e0],rax
     1523140:	49 8b be e8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3e8]
     1523147:	31 f6                	xor    esi,esi
     1523149:	e8 b8 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152314e:	48 89 83 e8 03 00 00 	mov    QWORD PTR [rbx+0x3e8],rax
     1523155:	49 8b be f0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3f0]
     152315c:	31 f6                	xor    esi,esi
     152315e:	e8 a3 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523163:	48 89 83 f0 03 00 00 	mov    QWORD PTR [rbx+0x3f0],rax
     152316a:	49 8b be 20 04 00 00 	mov    rdi,QWORD PTR [r14+0x420]
     1523171:	31 f6                	xor    esi,esi
     1523173:	e8 8e 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523178:	48 89 83 20 04 00 00 	mov    QWORD PTR [rbx+0x420],rax
     152317f:	49 8b be 28 04 00 00 	mov    rdi,QWORD PTR [r14+0x428]
     1523186:	31 f6                	xor    esi,esi
     1523188:	e8 79 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152318d:	48 89 83 28 04 00 00 	mov    QWORD PTR [rbx+0x428],rax
     1523194:	49 8b be 30 04 00 00 	mov    rdi,QWORD PTR [r14+0x430]
     152319b:	31 f6                	xor    esi,esi
     152319d:	e8 64 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15231a2:	48 89 83 30 04 00 00 	mov    QWORD PTR [rbx+0x430],rax
     15231a9:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
     15231b0:	31 f6                	xor    esi,esi
     15231b2:	e8 4f 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15231b7:	48 89 83 38 04 00 00 	mov    QWORD PTR [rbx+0x438],rax
     15231be:	49 8b be 40 04 00 00 	mov    rdi,QWORD PTR [r14+0x440]
     15231c5:	31 f6                	xor    esi,esi
     15231c7:	e8 3a 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15231cc:	48 89 83 40 04 00 00 	mov    QWORD PTR [rbx+0x440],rax
     15231d3:	49 8b be 48 04 00 00 	mov    rdi,QWORD PTR [r14+0x448]
     15231da:	31 f6                	xor    esi,esi
     15231dc:	e8 25 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15231e1:	48 89 83 48 04 00 00 	mov    QWORD PTR [rbx+0x448],rax
     15231e8:	49 8b be 50 04 00 00 	mov    rdi,QWORD PTR [r14+0x450]
     15231ef:	31 f6                	xor    esi,esi
     15231f1:	e8 10 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>

### 0x17e3327; FDE=0x17dfd00..0x17e673e; base=rsp; score=50
     17e3293:	00 00 
     17e3295:	66 0f 29 84 24 c0 15 	movapd XMMWORD PTR [rsp+0x15c0],xmm0
     17e329c:	00 00 
     17e329e:	48 b9 02 00 00 00 01 	movabs rcx,0x100000002
     17e32a5:	00 00 00 
     17e32a8:	48 89 8c 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rcx
     17e32af:	00 
     17e32b0:	6a 08                	push   0x8
     17e32b2:	5a                   	pop    rdx
     17e32b3:	48 89 94 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],rdx
     17e32ba:	00 
     17e32bb:	4c 8d a4 24 d0 15 00 	lea    r12,[rsp+0x15d0]
     17e32c2:	00 
     17e32c3:	4c 89 a4 24 f0 03 00 	mov    QWORD PTR [rsp+0x3f0],r12
     17e32ca:	00 
     17e32cb:	b8 00 00 00 00       	mov    eax,0x0
     17e32d0:	88 84 24 f8 03 00 00 	mov    BYTE PTR [rsp+0x3f8],al
     17e32d7:	48 be 02 00 00 00 02 	movabs rsi,0x200000002
     17e32de:	00 00 00 
     17e32e1:	48 89 b4 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rsi
     17e32e8:	00 
     17e32e9:	48 c7 84 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],0x10
     17e32f0:	00 10 00 00 00 
     17e32f5:	48 89 9c 24 d0 03 00 	mov    QWORD PTR [rsp+0x3d0],rbx
     17e32fc:	00 
     17e32fd:	88 84 24 d8 03 00 00 	mov    BYTE PTR [rsp+0x3d8],al
     17e3304:	48 89 8c 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],rcx
     17e330b:	00 
     17e330c:	48 89 94 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],rdx
     17e3313:	00 
     17e3314:	49 89 dc             	mov    r12,rbx
     17e3317:	48 8d 9c 24 c0 15 00 	lea    rbx,[rsp+0x15c0]
     17e331e:	00 
     17e331f:	48 89 9c 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rbx
     17e3326:	00 
     17e3327:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     17e332e:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
     17e3335:	00 
     17e3336:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     17e333d:	00 
     17e333e:	48 8d 94 24 e0 03 00 	lea    rdx,[rsp+0x3e0]
     17e3345:	00 
     17e3346:	e8 28 41 00 00       	call   17e7473 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x13294>
     17e334b:	48 89 df             	mov    rdi,rbx
     17e334e:	31 f6                	xor    esi,esi
     17e3350:	e8 1b 41 eb ff       	call   1697470 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b5dc>
     17e3355:	4c 89 e7             	mov    rdi,r12
     17e3358:	31 f6                	xor    esi,esi
     17e335a:	e8 11 41 eb ff       	call   1697470 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b5dc>
     17e335f:	48 8d bc 24 d0 15 00 	lea    rdi,[rsp+0x15d0]
     17e3366:	00 
     17e3367:	31 f6                	xor    esi,esi
     17e3369:	e8 02 41 eb ff       	call   1697470 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b5dc>
     17e336e:	4d 85 ff             	test   r15,r15
     17e3371:	48 be 00 00 00 00 00 	movabs rsi,0x3ff0000000000000
     17e3378:	00 f0 3f 
     17e337b:	0f 28 5c 24 30       	movaps xmm3,XMMWORD PTR [rsp+0x30]
     17e3380:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     17e3385:	74 4e                	je     17e33d5 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xf1f6>
     17e3387:	66 0f 28 84 24 d0 15 	movapd xmm0,XMMWORD PTR [rsp+0x15d0]
     17e338e:	00 00 
     17e3390:	48 8d 43 10          	lea    rax,[rbx+0x10]
     17e3394:	31 c9                	xor    ecx,ecx
     17e3396:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     17e3399:	f2 0f 10 0c cf       	movsd  xmm1,QWORD PTR [rdi+rcx*8]
     17e339e:	0f 5b c9             	cvtdq2ps xmm1,xmm1
     17e33a1:	0f 5c cb             	subps  xmm1,xmm3
     17e33a4:	0f 5a c9             	cvtps2pd xmm1,xmm1
     17e33a7:	48 89 74 cd 00       	mov    QWORD PTR [rbp+rcx*8+0x0],rsi
     17e33ac:	66 0f 5c c8          	subpd  xmm1,xmm0
     17e33b0:	66 0f 28 d1          	movapd xmm2,xmm1
     17e33b4:	66 0f 15 d1          	unpckhpd xmm2,xmm1
     17e33b8:	f2 0f 59 d1          	mulsd  xmm2,xmm1
     17e33bc:	66 0f 59 c9          	mulpd  xmm1,xmm1
     17e33c0:	66 0f 11 48 f0       	movupd XMMWORD PTR [rax-0x10],xmm1
     17e33c5:	f2 0f 11 10          	movsd  QWORD PTR [rax],xmm2
     17e33c9:	48 ff c1             	inc    rcx
     17e33cc:	48 83 c0 18          	add    rax,0x18
     17e33d0:	49 39 cf             	cmp    r15,rcx
     17e33d3:	75 c1                	jne    17e3396 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xf1b7>
     17e33d5:	48 b8 03 00 00 00 01 	movabs rax,0x100000003
     17e33dc:	00 00 00 
     17e33df:	48 89 84 24 20 16 00 	mov    QWORD PTR [rsp+0x1620],rax
     17e33e6:	00 
     17e33e7:	6a 08                	push   0x8
     17e33e9:	59                   	pop    rcx
     17e33ea:	48 89 8c 24 28 16 00 	mov    QWORD PTR [rsp+0x1628],rcx
     17e33f1:	00 
     17e33f2:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     17e33f9:	00 
     17e33fa:	4c 89 b4 24 30 16 00 	mov    QWORD PTR [rsp+0x1630],r14

### 0xae32b7; FDE=0xae306e..0xae4ac2; base=rsp; score=40
      ae31fb:	88 84 24 20 02 00 00 	mov    BYTE PTR [rsp+0x220],al
      ae3202:	88 84 24 58 02 00 00 	mov    BYTE PTR [rsp+0x258],al
      ae3209:	88 84 24 60 02 00 00 	mov    BYTE PTR [rsp+0x260],al
      ae3210:	88 84 24 98 02 00 00 	mov    BYTE PTR [rsp+0x298],al
      ae3217:	88 84 24 a0 02 00 00 	mov    BYTE PTR [rsp+0x2a0],al
      ae321e:	88 84 24 d8 02 00 00 	mov    BYTE PTR [rsp+0x2d8],al
      ae3225:	88 84 24 e0 02 00 00 	mov    BYTE PTR [rsp+0x2e0],al
      ae322c:	88 84 24 18 03 00 00 	mov    BYTE PTR [rsp+0x318],al
      ae3233:	88 84 24 20 03 00 00 	mov    BYTE PTR [rsp+0x320],al
      ae323a:	88 84 24 58 03 00 00 	mov    BYTE PTR [rsp+0x358],al
      ae3241:	0f 57 c0             	xorps  xmm0,xmm0
      ae3244:	48 8d 84 24 60 03 00 	lea    rax,[rsp+0x360]
      ae324b:	00 
      ae324c:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      ae3250:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      ae3254:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      ae3257:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
      ae325c:	c7 84 24 98 03 00 00 	mov    DWORD PTR [rsp+0x398],0x3f800000
      ae3263:	00 00 80 3f 
      ae3267:	48 8d 84 24 60 02 00 	lea    rax,[rsp+0x260]
      ae326e:	00 
      ae326f:	0f 11 80 70 01 00 00 	movups XMMWORD PTR [rax+0x170],xmm0
      ae3276:	0f 11 80 60 01 00 00 	movups XMMWORD PTR [rax+0x160],xmm0
      ae327d:	0f 11 80 50 01 00 00 	movups XMMWORD PTR [rax+0x150],xmm0
      ae3284:	0f 11 80 40 01 00 00 	movups XMMWORD PTR [rax+0x140],xmm0
      ae328b:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
      ae3290:	4a 8b 44 31 70       	mov    rax,QWORD PTR [rcx+r14*1+0x70]
      ae3295:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
      ae329c:	00 
      ae329d:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
      ae32a2:	4e 8b 7c 31 58       	mov    r15,QWORD PTR [rcx+r14*1+0x58]
      ae32a7:	45 31 f6             	xor    r14d,r14d
      ae32aa:	4d 85 ff             	test   r15,r15
      ae32ad:	0f 84 ec 00 00 00    	je     ae339f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3033f>
      ae32b3:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
      ae32b7:	48 01 84 24 b8 03 00 	add    QWORD PTR [rsp+0x3b8],rax
      ae32be:	00 
      ae32bf:	49 8b 47 48          	mov    rax,QWORD PTR [r15+0x48]
      ae32c3:	48 01 84 24 c0 03 00 	add    QWORD PTR [rsp+0x3c0],rax
      ae32ca:	00 
      ae32cb:	49 8d 5f 28          	lea    rbx,[r15+0x28]
      ae32cf:	48 8b b4 24 70 03 00 	mov    rsi,QWORD PTR [rsp+0x370]
      ae32d6:	00 
      ae32d7:	49 39 f6             	cmp    r14,rsi
      ae32da:	73 14                	jae    ae32f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30290>
      ae32dc:	4c 89 f7             	mov    rdi,r14
      ae32df:	48 89 de             	mov    rsi,rbx
      ae32e2:	e8 1d 30 00 00       	call   ae6304 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x332a4>
      ae32e7:	49 83 c6 30          	add    r14,0x30
      ae32eb:	e9 91 00 00 00       	jmp    ae3381 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30321>
      ae32f0:	48 8b bc 24 60 03 00 	mov    rdi,QWORD PTR [rsp+0x360]
      ae32f7:	00 
      ae32f8:	49 29 fe             	sub    r14,rdi
      ae32fb:	4c 89 f0             	mov    rax,r14
      ae32fe:	48 99                	cqo
      ae3300:	6a 30                	push   0x30
      ae3302:	41 5e                	pop    r14
      ae3304:	49 f7 fe             	idiv   r14
      ae3307:	48 8d 50 01          	lea    rdx,[rax+0x1]
      ae330b:	e8 8a 9a fc ff       	call   aacd9a <JNI_OnUnload@@Base+0x34667>
      ae3310:	48 89 c6             	mov    rsi,rax
      ae3313:	48 8b 84 24 68 03 00 	mov    rax,QWORD PTR [rsp+0x368]
      ae331a:	00 
      ae331b:	48 2b 84 24 60 03 00 	sub    rax,QWORD PTR [rsp+0x360]
      ae3322:	00 
      ae3323:	48 99                	cqo
      ae3325:	49 f7 fe             	idiv   r14
      ae3328:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      ae332f:	00 
      ae3330:	48 89 c2             	mov    rdx,rax
      ae3333:	48 8d 8c 24 70 03 00 	lea    rcx,[rsp+0x370]
      ae333a:	00 
      ae333b:	e8 ec 2f 00 00       	call   ae632c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x332cc>
      ae3340:	48 8b bc 24 30 04 00 	mov    rdi,QWORD PTR [rsp+0x430]
      ae3347:	00 
      ae3348:	48 89 de             	mov    rsi,rbx
      ae334b:	e8 b4 2f 00 00       	call   ae6304 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x332a4>
      ae3350:	48 83 84 24 30 04 00 	add    QWORD PTR [rsp+0x430],0x30
      ae3357:	00 30 
      ae3359:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
      ae3360:	00 
      ae3361:	48 8d 9c 24 20 04 00 	lea    rbx,[rsp+0x420]
      ae3368:	00 
      ae3369:	48 89 de             	mov    rsi,rbx
      ae336c:	e8 07 30 00 00       	call   ae6378 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x33318>
      ae3371:	4c 8b b4 24 68 03 00 	mov    r14,QWORD PTR [rsp+0x368]
      ae3378:	00 
      ae3379:	48 89 df             	mov    rdi,rbx
      ae337c:	e8 81 30 00 00       	call   ae6402 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x333a2>
      ae3381:	4c 89 b4 24 68 03 00 	mov    QWORD PTR [rsp+0x368],r14
      ae3388:	00 

### 0xb6f470; FDE=0xb6f222..0xb703a3; base=rax; score=40
      b6f3c0:	00 00 
      b6f3c2:	49 8d 85 90 01 00 00 	lea    rax,[r13+0x190]
      b6f3c9:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      b6f3ce:	49 89 9d 90 01 00 00 	mov    QWORD PTR [r13+0x190],rbx
      b6f3d5:	4d 89 b5 98 01 00 00 	mov    QWORD PTR [r13+0x198],r14
      b6f3dc:	4d 8d b5 a0 01 00 00 	lea    r14,[r13+0x1a0]
      b6f3e3:	4c 89 f7             	mov    rdi,r14
      b6f3e6:	e8 67 40 ff ff       	call   b63452 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb03f2>
      b6f3eb:	49 8d bd e0 02 00 00 	lea    rdi,[r13+0x2e0]
      b6f3f2:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
      b6f3f9:	00 
      b6f3fa:	c6 06 01             	mov    BYTE PTR [rsi],0x1
      b6f3fd:	4c 89 eb             	mov    rbx,r13
      b6f400:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
      b6f407:	00 
      b6f408:	4c 89 b4 24 88 00 00 	mov    QWORD PTR [rsp+0x88],r14
      b6f40f:	00 
      b6f410:	e8 c7 65 ff ff       	call   b659dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb297c>
      b6f415:	0f 57 c0             	xorps  xmm0,xmm0
      b6f418:	0f 11 83 00 03 00 00 	movups XMMWORD PTR [rbx+0x300],xmm0
      b6f41f:	0f 11 83 f0 02 00 00 	movups XMMWORD PTR [rbx+0x2f0],xmm0
      b6f426:	48 83 a3 10 03 00 00 	and    QWORD PTR [rbx+0x310],0x0
      b6f42d:	00 
      b6f42e:	4c 8d a3 18 03 00 00 	lea    r12,[rbx+0x318]
      b6f435:	4c 89 e7             	mov    rdi,r12
      b6f438:	e8 c5 a9 c6 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      b6f43d:	48 89 d8             	mov    rax,rbx
      b6f440:	48 81 c3 38 01 00 00 	add    rbx,0x138
      b6f447:	0f 57 c0             	xorps  xmm0,xmm0
      b6f44a:	0f 11 80 80 03 00 00 	movups XMMWORD PTR [rax+0x380],xmm0
      b6f451:	0f 11 80 70 03 00 00 	movups XMMWORD PTR [rax+0x370],xmm0
      b6f458:	c7 80 90 03 00 00 00 	mov    DWORD PTR [rax+0x390],0x3f800000
      b6f45f:	00 80 3f 
      b6f462:	0f 11 80 98 03 00 00 	movups XMMWORD PTR [rax+0x398],xmm0
      b6f469:	0f 11 80 a8 03 00 00 	movups XMMWORD PTR [rax+0x3a8],xmm0
      b6f470:	0f 11 80 b8 03 00 00 	movups XMMWORD PTR [rax+0x3b8],xmm0
      b6f477:	c6 80 c8 03 00 00 00 	mov    BYTE PTR [rax+0x3c8],0x0
      b6f47e:	0f 11 80 d0 03 00 00 	movups XMMWORD PTR [rax+0x3d0],xmm0
      b6f485:	0f 11 80 d9 03 00 00 	movups XMMWORD PTR [rax+0x3d9],xmm0
      b6f48c:	0f 11 80 f0 03 00 00 	movups XMMWORD PTR [rax+0x3f0],xmm0
      b6f493:	0f 11 80 00 04 00 00 	movups XMMWORD PTR [rax+0x400],xmm0
      b6f49a:	66 83 a0 20 04 00 00 	and    WORD PTR [rax+0x420],0x0
      b6f4a1:	00 
      b6f4a2:	0f 11 80 10 04 00 00 	movups XMMWORD PTR [rax+0x410],xmm0
      b6f4a9:	0f 11 80 28 04 00 00 	movups XMMWORD PTR [rax+0x428],xmm0
      b6f4b0:	0f 11 80 38 04 00 00 	movups XMMWORD PTR [rax+0x438],xmm0
      b6f4b7:	0f 11 80 48 04 00 00 	movups XMMWORD PTR [rax+0x448],xmm0
      b6f4be:	0f 11 80 58 04 00 00 	movups XMMWORD PTR [rax+0x458],xmm0
      b6f4c5:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b6f4ca:	48 83 a0 68 04 00 00 	and    QWORD PTR [rax+0x468],0x0
      b6f4d1:	00 
      b6f4d2:	4c 8d bc 24 e0 00 00 	lea    r15,[rsp+0xe0]
      b6f4d9:	00 
      b6f4da:	4c 89 ff             	mov    rdi,r15
      b6f4dd:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
      b6f4e2:	e8 43 b0 b5 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
      b6f4e7:	41 f6 07 01          	test   BYTE PTR [r15],0x1
      b6f4eb:	4c 89 a4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r12
      b6f4f2:	00 
      b6f4f3:	0f 84 09 05 00 00    	je     b6fa02 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc9a2>
      b6f4f9:	4c 8b 84 24 f0 00 00 	mov    r8,QWORD PTR [rsp+0xf0]
      b6f500:	00 
      b6f501:	e9 04 05 00 00       	jmp    b6fa0a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc9aa>
      b6f506:	44 89 74 24 20       	mov    DWORD PTR [rsp+0x20],r14d
      b6f50b:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
      b6f50f:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      b6f514:	48 8b 45 18          	mov    rax,QWORD PTR [rbp+0x18]
      b6f518:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      b6f51d:	4c 8b 65 08          	mov    r12,QWORD PTR [rbp+0x8]
      b6f521:	48 89 6c 24 50       	mov    QWORD PTR [rsp+0x50],rbp
      b6f526:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
      b6f52a:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
      b6f52f:	bf 80 05 00 00       	mov    edi,0x580
      b6f534:	e8 c7 e9 c7 00       	call   17edf00 <_Znwm@plt>
      b6f539:	49 89 c6             	mov    r14,rax
      b6f53c:	48 8d 05 d5 e2 c9 00 	lea    rax,[rip+0xc9e2d5]        # 180d818 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x34d8>
      b6f543:	49 89 06             	mov    QWORD PTR [r14],rax
      b6f546:	49 8d 7e 28          	lea    rdi,[r14+0x28]
      b6f54a:	0f 57 c0             	xorps  xmm0,xmm0
      b6f54d:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
      b6f552:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
      b6f557:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      b6f55c:	48 89 de             	mov    rsi,rbx
      b6f55f:	e8 7a ad ff ff       	call   b6a2de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb727e>
      b6f564:	0f 28 44 24 60       	movaps xmm0,XMMWORD PTR [rsp+0x60]
      b6f569:	41 0f 11 86 c0 00 00 	movups XMMWORD PTR [r14+0xc0],xmm0
      b6f570:	00 
      b6f571:	49 8d be d0 00 00 00 	lea    rdi,[r14+0xd0]
      b6f578:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
      b6f57d:	4c 89 e3             	mov    rbx,r12
      b6f580:	4c 89 e6             	mov    rsi,r12

### 0xb8c70d; FDE=0xb8b422..0xb8d4f5; base=rsp; score=40
      b8c688:	74 05                	je     b8c68f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd962f>
      b8c68a:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c68f:	4c 89 bc 24 08 04 00 	mov    QWORD PTR [rsp+0x408],r15
      b8c696:	00 
      b8c697:	4c 89 ac 24 10 04 00 	mov    QWORD PTR [rsp+0x410],r13
      b8c69e:	00 
      b8c69f:	4c 89 b4 24 18 04 00 	mov    QWORD PTR [rsp+0x418],r14
      b8c6a6:	00 
      b8c6a7:	40 84 ed             	test   bpl,bpl
      b8c6aa:	75 05                	jne    b8c6b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9651>
      b8c6ac:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c6b1:	4c 89 bc 24 20 04 00 	mov    QWORD PTR [rsp+0x420],r15
      b8c6b8:	00 
      b8c6b9:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      b8c6bc:	0f 11 84 24 28 04 00 	movups XMMWORD PTR [rsp+0x428],xmm0
      b8c6c3:	00 
      b8c6c4:	4c 89 ac 24 38 04 00 	mov    QWORD PTR [rsp+0x438],r13
      b8c6cb:	00 
      b8c6cc:	4c 89 b4 24 40 04 00 	mov    QWORD PTR [rsp+0x440],r14
      b8c6d3:	00 
      b8c6d4:	4d 85 f6             	test   r14,r14
      b8c6d7:	74 05                	je     b8c6de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd967e>
      b8c6d9:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c6de:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
      b8c6e3:	48 89 8c 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rcx
      b8c6ea:	00 
      b8c6eb:	4c 89 ac 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],r13
      b8c6f2:	00 
      b8c6f3:	4c 89 b4 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],r14
      b8c6fa:	00 
      b8c6fb:	4d 85 f6             	test   r14,r14
      b8c6fe:	74 05                	je     b8c705 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd96a5>
      b8c700:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c705:	4c 89 bc 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],r15
      b8c70c:	00 
      b8c70d:	4c 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r13
      b8c714:	00 
      b8c715:	4c 89 b4 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],r14
      b8c71c:	00 
      b8c71d:	40 84 ed             	test   bpl,bpl
      b8c720:	75 05                	jne    b8c727 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd96c7>
      b8c722:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c727:	4c 89 bc 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r15
      b8c72e:	00 
      b8c72f:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      b8c732:	0f 11 84 24 d0 03 00 	movups XMMWORD PTR [rsp+0x3d0],xmm0
      b8c739:	00 
      b8c73a:	4c 89 ac 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],r13
      b8c741:	00 
      b8c742:	4c 89 b4 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],r14
      b8c749:	00 
      b8c74a:	4d 85 f6             	test   r14,r14
      b8c74d:	74 05                	je     b8c754 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd96f4>
      b8c74f:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c754:	48 83 a4 24 48 03 00 	and    QWORD PTR [rsp+0x348],0x0
      b8c75b:	00 00 
      b8c75d:	48 83 a4 24 58 03 00 	and    QWORD PTR [rsp+0x358],0x0
      b8c764:	00 00 
      b8c766:	6a 58                	push   0x58
      b8c768:	5f                   	pop    rdi
      b8c769:	e8 92 17 c6 00       	call   17edf00 <_Znwm@plt>
      b8c76e:	49 89 c7             	mov    r15,rax
      b8c771:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
      b8c778:	00 
      b8c779:	48 89 c7             	mov    rdi,rax
      b8c77c:	e8 79 41 8e 00       	call   14708fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b5e7e>
      b8c781:	4d 89 6f 48          	mov    QWORD PTR [r15+0x48],r13
      b8c785:	4d 89 77 50          	mov    QWORD PTR [r15+0x50],r14
      b8c789:	40 84 ed             	test   bpl,bpl
      b8c78c:	75 05                	jne    b8c793 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9733>
      b8c78e:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c793:	48 8d b4 24 48 03 00 	lea    rsi,[rsp+0x348]
      b8c79a:	00 
      b8c79b:	4c 89 3e             	mov    QWORD PTR [rsi],r15
      b8c79e:	48 8d 05 a9 41 8e 00 	lea    rax,[rip+0x8e41a9]        # 147094e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b5ed2>
      b8c7a5:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
      b8c7a9:	48 8d 05 c8 41 8e 00 	lea    rax,[rip+0x8e41c8]        # 1470978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b5efc>
      b8c7b0:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
      b8c7b4:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
      b8c7bb:	00 
      b8c7bc:	e8 f7 27 b4 00       	call   16cefb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83124>
      b8c7c1:	48 8d 35 26 76 7d ff 	lea    rsi,[rip+0xffffffffff7d7626]        # 363dee <_ZTSSt12bad_any_cast@@Base-0x2c3da>
      b8c7c8:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
      b8c7cf:	00 
      b8c7d0:	e8 a9 d2 ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b8c7d5:	4c 8d bc 24 18 02 00 	lea    r15,[rsp+0x218]
      b8c7dc:	00 
      b8c7dd:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
      b8c7e4:	00 
      b8c7e5:	4c 89 ff             	mov    rdi,r15
      b8c7e8:	e8 f7 29 b4 00       	call   16cf1e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83350>

### 0x1099796; FDE=0x109917a..0x1099d71; base=r13; score=40
     10996f5:	48 89 c3             	mov    rbx,rax
     10996f8:	0f 57 c0             	xorps  xmm0,xmm0
     10996fb:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     10996ff:	48 8d 05 aa 2d 7b 00 	lea    rax,[rip+0x7b2daa]        # 184c4b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b98>
     1099706:	48 89 03             	mov    QWORD PTR [rbx],rax
     1099709:	48 89 d8             	mov    rax,rbx
     109970c:	48 83 c0 18          	add    rax,0x18
     1099710:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
     1099714:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
     1099718:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
     109971c:	c7 43 38 00 00 80 3f 	mov    DWORD PTR [rbx+0x38],0x3f800000
     1099723:	48 83 63 58 00       	and    QWORD PTR [rbx+0x58],0x0
     1099728:	49 89 85 88 03 00 00 	mov    QWORD PTR [r13+0x388],rax
     109972f:	49 89 9d 90 03 00 00 	mov    QWORD PTR [r13+0x390],rbx
     1099736:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     109973b:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     1099740:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     1099744:	48 89 5b 50          	mov    QWORD PTR [rbx+0x50],rbx
     1099748:	31 ff                	xor    edi,edi
     109974a:	e8 63 4d a0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     109974f:	48 89 df             	mov    rdi,rbx
     1099752:	e8 2f 4d a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099757:	4c 8d 25 89 f5 29 ff 	lea    r12,[rip+0xffffffffff29f589]        # 338ce7 <_ZTSSt12bad_any_cast@@Base-0x574e1>
     109975e:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1099765:	00 
     1099766:	4c 89 e6             	mov    rsi,r12
     1099769:	e8 10 03 9e ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     109976e:	48 8d 05 3b 0d 7f 00 	lea    rax,[rip+0x7f0d3b]        # 188a4b0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3188>
     1099775:	49 89 85 98 03 00 00 	mov    QWORD PTR [r13+0x398],rax
     109977c:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     1099783:	00 
     1099784:	49 89 85 a0 03 00 00 	mov    QWORD PTR [r13+0x3a0],rax
     109978b:	0f 57 c0             	xorps  xmm0,xmm0
     109978e:	41 0f 11 85 a8 03 00 	movups XMMWORD PTR [r13+0x3a8],xmm0
     1099795:	00 
     1099796:	41 0f 11 85 b8 03 00 	movups XMMWORD PTR [r13+0x3b8],xmm0
     109979d:	00 
     109979e:	41 c7 85 c8 03 00 00 	mov    DWORD PTR [r13+0x3c8],0x3f800000
     10997a5:	00 00 80 3f 
     10997a9:	41 0f 29 85 d0 03 00 	movaps XMMWORD PTR [r13+0x3d0],xmm0
     10997b0:	00 
     10997b1:	41 0f 11 85 d9 03 00 	movups XMMWORD PTR [r13+0x3d9],xmm0
     10997b8:	00 
     10997b9:	0f 57 c9             	xorps  xmm1,xmm1
     10997bc:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     10997c3:	00 
     10997c4:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     10997c8:	49 89 85 00 04 00 00 	mov    QWORD PTR [r13+0x400],rax
     10997cf:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
     10997d2:	41 0f 11 85 f0 03 00 	movups XMMWORD PTR [r13+0x3f0],xmm0
     10997d9:	00 
     10997da:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     10997dd:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     10997e2:	e8 a9 46 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10997e7:	0f 57 c0             	xorps  xmm0,xmm0
     10997ea:	41 0f 11 85 08 04 00 	movups XMMWORD PTR [r13+0x408],xmm0
     10997f1:	00 
     10997f2:	49 8d 9d 18 04 00 00 	lea    rbx,[r13+0x418]
     10997f9:	48 89 df             	mov    rdi,rbx
     10997fc:	e8 8d ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099801:	4d 8d b5 70 04 00 00 	lea    r14,[r13+0x470]
     1099808:	4c 89 f7             	mov    rdi,r14
     109980b:	e8 7e ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099810:	4d 8d bd c8 04 00 00 	lea    r15,[r13+0x4c8]
     1099817:	4c 89 ff             	mov    rdi,r15
     109981a:	e8 0b bf ac ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     109981f:	4c 89 ef             	mov    rdi,r13
     1099822:	e8 19 7c 00 00       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>
     1099827:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     109982b:	4c 89 6d 00          	mov    QWORD PTR [rbp+0x0],r13
     109982f:	48 85 ff             	test   rdi,rdi
     1099832:	74 06                	je     109983a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260c50>
     1099834:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1099837:	ff 50 08             	call   QWORD PTR [rax+0x8]
     109983a:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     1099841:	00 
     1099842:	e8 3f 4c a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099847:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
     109984e:	00 
     109984f:	e8 32 4c a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099854:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     109985b:	00 
     109985c:	e8 2f 46 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1099861:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     1099868:	00 
     1099869:	e8 fc 06 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     109986e:	48 8b 5d 00          	mov    rbx,QWORD PTR [rbp+0x0]
     1099872:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1099879:	00 
     109987a:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]
     1099881:	00 

### 0x1145e74; FDE=0x1145c8a..0x1146a50; base=rsp; score=40
     1145de9:	00 
     1145dea:	41 0f 11 85 b0 00 00 	movups XMMWORD PTR [r13+0xb0],xmm0
     1145df1:	00 
     1145df2:	41 0f 11 85 20 01 00 	movups XMMWORD PTR [r13+0x120],xmm0
     1145df9:	00 
     1145dfa:	49 83 a5 30 01 00 00 	and    QWORD PTR [r13+0x130],0x0
     1145e01:	00 
     1145e02:	49 83 c4 30          	add    r12,0x30
     1145e06:	4c 89 e7             	mov    rdi,r12
     1145e09:	e8 28 5a 93 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1145e0e:	4c 89 ef             	mov    rdi,r13
     1145e11:	48 89 c6             	mov    rsi,rax
     1145e14:	e8 39 9a 63 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     1145e19:	0f 57 c0             	xorps  xmm0,xmm0
     1145e1c:	84 c0                	test   al,al
     1145e1e:	0f 84 5d 08 00 00    	je     1146681 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30da97>
     1145e24:	0f 11 84 24 68 03 00 	movups XMMWORD PTR [rsp+0x368],xmm0
     1145e2b:	00 
     1145e2c:	48 8d 05 35 ee 70 00 	lea    rax,[rip+0x70ee35]        # 1854c68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11350>
     1145e33:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
     1145e3a:	00 
     1145e3b:	83 a4 24 78 03 00 00 	and    DWORD PTR [rsp+0x378],0x0
     1145e42:	00 
     1145e43:	0f 11 84 24 80 03 00 	movups XMMWORD PTR [rsp+0x380],xmm0
     1145e4a:	00 
     1145e4b:	48 83 a4 24 90 03 00 	and    QWORD PTR [rsp+0x390],0x0
     1145e52:	00 00 
     1145e54:	48 89 ac 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rbp
     1145e5b:	00 
     1145e5c:	48 89 ac 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],rbp
     1145e63:	00 
     1145e64:	48 89 ac 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],rbp
     1145e6b:	00 
     1145e6c:	48 89 ac 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rbp
     1145e73:	00 
     1145e74:	48 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rbp
     1145e7b:	00 
     1145e7c:	48 89 ac 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rbp
     1145e83:	00 
     1145e84:	48 89 ac 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],rbp
     1145e8b:	00 
     1145e8c:	48 89 ac 24 d0 03 00 	mov    QWORD PTR [rsp+0x3d0],rbp
     1145e93:	00 
     1145e94:	48 89 ac 24 d8 03 00 	mov    QWORD PTR [rsp+0x3d8],rbp
     1145e9b:	00 
     1145e9c:	48 89 ac 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rbp
     1145ea3:	00 
     1145ea4:	48 89 ac 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],rbp
     1145eab:	00 
     1145eac:	48 89 ac 24 f0 03 00 	mov    QWORD PTR [rsp+0x3f0],rbp
     1145eb3:	00 
     1145eb4:	48 89 ac 24 f8 03 00 	mov    QWORD PTR [rsp+0x3f8],rbp
     1145ebb:	00 
     1145ebc:	48 89 ac 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rbp
     1145ec3:	00 
     1145ec4:	48 89 ac 24 08 04 00 	mov    QWORD PTR [rsp+0x408],rbp
     1145ecb:	00 
     1145ecc:	48 89 ac 24 40 04 00 	mov    QWORD PTR [rsp+0x440],rbp
     1145ed3:	00 
     1145ed4:	48 89 ac 24 48 04 00 	mov    QWORD PTR [rsp+0x448],rbp
     1145edb:	00 
     1145edc:	48 89 ac 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rbp
     1145ee3:	00 
     1145ee4:	48 89 ac 24 58 04 00 	mov    QWORD PTR [rsp+0x458],rbp
     1145eeb:	00 
     1145eec:	48 89 ac 24 60 04 00 	mov    QWORD PTR [rsp+0x460],rbp
     1145ef3:	00 
     1145ef4:	48 89 ac 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rbp
     1145efb:	00 
     1145efc:	48 89 ac 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rbp
     1145f03:	00 
     1145f04:	48 89 ac 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rbp
     1145f0b:	00 
     1145f0c:	0f 11 84 24 2c 04 00 	movups XMMWORD PTR [rsp+0x42c],xmm0
     1145f13:	00 
     1145f14:	0f 11 84 24 20 04 00 	movups XMMWORD PTR [rsp+0x420],xmm0
     1145f1b:	00 
     1145f1c:	0f 11 84 24 10 04 00 	movups XMMWORD PTR [rsp+0x410],xmm0
     1145f23:	00 
     1145f24:	48 83 a4 24 90 04 00 	and    QWORD PTR [rsp+0x490],0x0
     1145f2b:	00 00 
     1145f2d:	0f 11 84 24 80 04 00 	movups XMMWORD PTR [rsp+0x480],xmm0
     1145f34:	00 
     1145f35:	48 8b 84 24 a0 04 00 	mov    rax,QWORD PTR [rsp+0x4a0]
     1145f3c:	00 
     1145f3d:	a8 01                	test   al,0x1
     1145f3f:	0f 85 ce 0a 00 00    	jne    1146a13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30de29>
     1145f45:	48 85 c0             	test   rax,rax
     1145f48:	0f 84 e6 08 00 00    	je     1146834 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dc4a>
     1145f4e:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
     1145f55:	00 

### 0x1333649; FDE=0x1332e00..0x1334bda; base=rbx; score=40
     13335b3:	48 8d 83 30 01 00 00 	lea    rax,[rbx+0x130]
     13335ba:	48 8d bb 80 03 00 00 	lea    rdi,[rbx+0x380]
     13335c1:	45 0f b6 c7          	movzx  r8d,r15b
     13335c5:	49 89 c7             	mov    r15,rax
     13335c8:	48 8d 8c 24 b8 02 00 	lea    rcx,[rsp+0x2b8]
     13335cf:	00 
     13335d0:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]
     13335d5:	48 89 c2             	mov    rdx,rax
     13335d8:	e8 bb c7 00 00       	call   133fd98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18531c>
     13335dd:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
     13335e4:	00 
     13335e5:	e8 3e b8 d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
     13335ea:	48 8d 83 90 03 00 00 	lea    rax,[rbx+0x390]
     13335f1:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     13335f8:	00 
     13335f9:	48 83 a3 90 03 00 00 	and    QWORD PTR [rbx+0x390],0x0
     1333600:	00 
     1333601:	4c 8d b3 98 03 00 00 	lea    r14,[rbx+0x398]
     1333608:	6a 01                	push   0x1
     133360a:	59                   	pop    rcx
     133360b:	4c 89 f7             	mov    rdi,r14
     133360e:	4c 89 fe             	mov    rsi,r15
     1333611:	89 ca                	mov    edx,ecx
     1333613:	41 89 c8             	mov    r8d,ecx
     1333616:	49 89 e9             	mov    r9,rbp
     1333619:	e8 66 88 f9 ff       	call   12cbe84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x111408>
     133361e:	4c 89 bc 24 38 01 00 	mov    QWORD PTR [rsp+0x138],r15
     1333625:	00 
     1333626:	48 8d bb a8 03 00 00 	lea    rdi,[rbx+0x3a8]
     133362d:	66 0f 6f 44 24 50    	movdqa xmm0,XMMWORD PTR [rsp+0x50]
     1333633:	66 48 0f 7e c6       	movq   rsi,xmm0
     1333638:	48 89 bc 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rdi
     133363f:	00 
     1333640:	e8 c9 42 fa ff       	call   12d790e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11ce92>
     1333645:	66 0f ef c0          	pxor   xmm0,xmm0
     1333649:	f3 0f 7f 83 b8 03 00 	movdqu XMMWORD PTR [rbx+0x3b8],xmm0
     1333650:	00 
     1333651:	0f 28 84 24 e0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xe0]
     1333658:	00 
     1333659:	0f 11 83 c8 03 00 00 	movups XMMWORD PTR [rbx+0x3c8],xmm0
     1333660:	4c 8d bb d8 03 00 00 	lea    r15,[rbx+0x3d8]
     1333667:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     133366e:	00 
     133366f:	4c 89 ff             	mov    rdi,r15
     1333672:	e8 db dc 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
     1333677:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     133367c:	48 89 83 40 04 00 00 	mov    QWORD PTR [rbx+0x440],rax
     1333683:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     1333688:	48 89 83 48 04 00 00 	mov    QWORD PTR [rbx+0x448],rax
     133368f:	83 a3 50 04 00 00 00 	and    DWORD PTR [rbx+0x450],0x0
     1333696:	41 8a 84 24 61 01 00 	mov    al,BYTE PTR [r12+0x161]
     133369d:	00 
     133369e:	88 83 54 04 00 00    	mov    BYTE PTR [rbx+0x454],al
     13336a4:	66 83 a3 55 04 00 00 	and    WORD PTR [rbx+0x455],0x0
     13336ab:	00 
     13336ac:	48 8d bb 58 04 00 00 	lea    rdi,[rbx+0x458]
     13336b3:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
     13336ba:	00 
     13336bb:	e8 36 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336c0:	48 8d bb 68 04 00 00 	lea    rdi,[rbx+0x468]
     13336c7:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
     13336ce:	00 
     13336cf:	e8 22 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336d4:	48 8d bb 78 04 00 00 	lea    rdi,[rbx+0x478]
     13336db:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
     13336e2:	00 
     13336e3:	e8 0e 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336e8:	48 8d bb 88 04 00 00 	lea    rdi,[rbx+0x488]
     13336ef:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
     13336f6:	00 
     13336f7:	e8 fa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336fc:	48 8d bb 98 04 00 00 	lea    rdi,[rbx+0x498]
     1333703:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
     133370a:	00 
     133370b:	e8 e6 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333710:	48 8d bb a8 04 00 00 	lea    rdi,[rbx+0x4a8]
     1333717:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     133371e:	00 
     133371f:	e8 d2 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333724:	48 8d bb b8 04 00 00 	lea    rdi,[rbx+0x4b8]
     133372b:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
     1333732:	00 
     1333733:	e8 be 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333738:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
     133373f:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
     1333746:	00 
     1333747:	e8 aa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     133374c:	48 83 a3 d8 04 00 00 	and    QWORD PTR [rbx+0x4d8],0x0
     1333753:	00 
     1333754:	48 83 a3 e8 04 00 00 	and    QWORD PTR [rbx+0x4e8],0x0
     133375b:	00 

### 0x135f1fd; FDE=0x135d056..0x1360c1b; base=rsp; score=40
     135f18d:	4c 89 f3             	mov    rbx,r14
     135f190:	4c 39 f0             	cmp    rax,r14
     135f193:	74 17                	je     135f1ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4730>
     135f195:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
     135f199:	7f 0e                	jg     135f1a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a472d>
     135f19b:	48 83 c0 18          	add    rax,0x18
     135f19f:	4c 39 f0             	cmp    rax,r14
     135f1a2:	75 f1                	jne    135f195 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4719>
     135f1a4:	4c 89 f3             	mov    rbx,r14
     135f1a7:	eb 03                	jmp    135f1ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4730>
     135f1a9:	48 89 c3             	mov    rbx,rax
     135f1ac:	48 89 9c 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rbx
     135f1b3:	00 
     135f1b4:	c6 84 24 20 02 00 00 	mov    BYTE PTR [rsp+0x220],0x1
     135f1bb:	01 
     135f1bc:	4c 39 f3             	cmp    rbx,r14
     135f1bf:	74 38                	je     135f1f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a477d>
     135f1c1:	4c 89 ef             	mov    rdi,r13
     135f1c4:	48 89 de             	mov    rsi,rbx
     135f1c7:	e8 ec 1b 00 00       	call   1360db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a633c>
     135f1cc:	48 8b 84 24 08 02 00 	mov    rax,QWORD PTR [rsp+0x208]
     135f1d3:	00 
     135f1d4:	48 83 c3 18          	add    rbx,0x18
     135f1d8:	48 39 c3             	cmp    rbx,rax
     135f1db:	74 14                	je     135f1f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4775>
     135f1dd:	48 8d 4b 18          	lea    rcx,[rbx+0x18]
     135f1e1:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     135f1e5:	48 89 cb             	mov    rbx,rcx
     135f1e8:	7e ee                	jle    135f1d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a475c>
     135f1ea:	48 83 c1 e8          	add    rcx,0xffffffffffffffe8
     135f1ee:	48 89 c8             	mov    rax,rcx
     135f1f1:	48 89 c3             	mov    rbx,rax
     135f1f4:	4c 39 f0             	cmp    rax,r14
     135f1f7:	75 c8                	jne    135f1c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4745>
     135f1f9:	8a 44 24 2f          	mov    al,BYTE PTR [rsp+0x2f]
     135f1fd:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     135f204:	48 63 84 24 e8 00 00 	movsxd rax,DWORD PTR [rsp+0xe8]
     135f20b:	00 
     135f20c:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
     135f213:	00 
     135f214:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     135f21b:	00 
     135f21c:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f21f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135f224:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f227:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f22a:	49 89 c6             	mov    r14,rax
     135f22d:	4c 89 a4 24 90 02 00 	mov    QWORD PTR [rsp+0x290],r12
     135f234:	00 
     135f235:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f23c:	00 
     135f23d:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
     135f244:	00 
     135f245:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     135f24a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f24d:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135f250:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135f257:	00 
     135f258:	48 89 c6             	mov    rsi,rax
     135f25b:	e8 30 b0 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f260:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
     135f265:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
     135f26a:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     135f271:	00 
     135f272:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f275:	48 8b bc 24 08 11 00 	mov    rdi,QWORD PTR [rsp+0x1108]
     135f27c:	00 
     135f27d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f280:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f283:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135f28f:	00 
     135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
     135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
     135f2bd:	49 89 c6             	mov    r14,rax
     135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
     135f2c7:	00 
     135f2c8:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135f2d2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135f2d6:	48 85 c0             	test   rax,rax
     135f2d9:	74 05                	je     135f2e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4864>

### 0x1391732; FDE=0x13912b4..0x1391aee; base=rsp; score=40
     13916a9:	00 
     13916aa:	44 88 a4 24 58 02 00 	mov    BYTE PTR [rsp+0x258],r12b
     13916b1:	00 
     13916b2:	44 88 a4 24 78 02 00 	mov    BYTE PTR [rsp+0x278],r12b
     13916b9:	00 
     13916ba:	44 88 a4 24 80 02 00 	mov    BYTE PTR [rsp+0x280],r12b
     13916c1:	00 
     13916c2:	44 88 a4 24 a0 02 00 	mov    BYTE PTR [rsp+0x2a0],r12b
     13916c9:	00 
     13916ca:	44 88 a4 24 a8 02 00 	mov    BYTE PTR [rsp+0x2a8],r12b
     13916d1:	00 
     13916d2:	44 88 a4 24 c8 02 00 	mov    BYTE PTR [rsp+0x2c8],r12b
     13916d9:	00 
     13916da:	44 88 a4 24 d0 02 00 	mov    BYTE PTR [rsp+0x2d0],r12b
     13916e1:	00 
     13916e2:	44 88 a4 24 f0 02 00 	mov    BYTE PTR [rsp+0x2f0],r12b
     13916e9:	00 
     13916ea:	44 88 a4 24 f8 02 00 	mov    BYTE PTR [rsp+0x2f8],r12b
     13916f1:	00 
     13916f2:	44 88 a4 24 18 03 00 	mov    BYTE PTR [rsp+0x318],r12b
     13916f9:	00 
     13916fa:	44 88 a4 24 20 03 00 	mov    BYTE PTR [rsp+0x320],r12b
     1391701:	00 
     1391702:	44 88 a4 24 40 03 00 	mov    BYTE PTR [rsp+0x340],r12b
     1391709:	00 
     139170a:	44 88 a4 24 48 03 00 	mov    BYTE PTR [rsp+0x348],r12b
     1391711:	00 
     1391712:	44 88 a4 24 68 03 00 	mov    BYTE PTR [rsp+0x368],r12b
     1391719:	00 
     139171a:	44 88 a4 24 70 03 00 	mov    BYTE PTR [rsp+0x370],r12b
     1391721:	00 
     1391722:	44 88 a4 24 90 03 00 	mov    BYTE PTR [rsp+0x390],r12b
     1391729:	00 
     139172a:	44 88 a4 24 98 03 00 	mov    BYTE PTR [rsp+0x398],r12b
     1391731:	00 
     1391732:	44 88 a4 24 b8 03 00 	mov    BYTE PTR [rsp+0x3b8],r12b
     1391739:	00 
     139173a:	44 88 a4 24 c0 03 00 	mov    BYTE PTR [rsp+0x3c0],r12b
     1391741:	00 
     1391742:	44 88 a4 24 e0 03 00 	mov    BYTE PTR [rsp+0x3e0],r12b
     1391749:	00 
     139174a:	44 88 a4 24 e8 03 00 	mov    BYTE PTR [rsp+0x3e8],r12b
     1391751:	00 
     1391752:	44 88 a4 24 08 04 00 	mov    BYTE PTR [rsp+0x408],r12b
     1391759:	00 
     139175a:	44 88 a4 24 10 04 00 	mov    BYTE PTR [rsp+0x410],r12b
     1391761:	00 
     1391762:	44 88 a4 24 30 04 00 	mov    BYTE PTR [rsp+0x430],r12b
     1391769:	00 
     139176a:	44 88 a4 24 38 04 00 	mov    BYTE PTR [rsp+0x438],r12b
     1391771:	00 
     1391772:	44 88 a4 24 58 04 00 	mov    BYTE PTR [rsp+0x458],r12b
     1391779:	00 
     139177a:	44 88 a4 24 60 04 00 	mov    BYTE PTR [rsp+0x460],r12b
     1391781:	00 
     1391782:	44 88 a4 24 80 04 00 	mov    BYTE PTR [rsp+0x480],r12b
     1391789:	00 
     139178a:	44 88 a4 24 88 04 00 	mov    BYTE PTR [rsp+0x488],r12b
     1391791:	00 
     1391792:	44 88 a4 24 a8 04 00 	mov    BYTE PTR [rsp+0x4a8],r12b
     1391799:	00 
     139179a:	44 88 a4 24 b0 04 00 	mov    BYTE PTR [rsp+0x4b0],r12b
     13917a1:	00 
     13917a2:	44 88 a4 24 d0 04 00 	mov    BYTE PTR [rsp+0x4d0],r12b
     13917a9:	00 
     13917aa:	44 88 a4 24 d8 04 00 	mov    BYTE PTR [rsp+0x4d8],r12b
     13917b1:	00 
     13917b2:	44 88 a4 24 f8 04 00 	mov    BYTE PTR [rsp+0x4f8],r12b
     13917b9:	00 
     13917ba:	44 88 a4 24 00 05 00 	mov    BYTE PTR [rsp+0x500],r12b
     13917c1:	00 
     13917c2:	44 88 a4 24 18 05 00 	mov    BYTE PTR [rsp+0x518],r12b
     13917c9:	00 
     13917ca:	31 c0                	xor    eax,eax
     13917cc:	88 84 24 20 05 00 00 	mov    BYTE PTR [rsp+0x520],al
     13917d3:	88 84 24 38 05 00 00 	mov    BYTE PTR [rsp+0x538],al
     13917da:	48 8b b3 c8 08 00 00 	mov    rsi,QWORD PTR [rbx+0x8c8]
     13917e1:	48 85 f6             	test   rsi,rsi
     13917e4:	74 1b                	je     1391801 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6d85>
     13917e6:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     13917ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13917ed:	ff 50 20             	call   QWORD PTR [rax+0x20]
     13917f0:	48 85 c0             	test   rax,rax
     13917f3:	74 0c                	je     1391801 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6d85>
     13917f5:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13917f8:	48 89 e6             	mov    rsi,rsp
     13917fb:	48 89 c7             	mov    rdi,rax
     13917fe:	ff 51 18             	call   QWORD PTR [rcx+0x18]
     1391801:	48 89 e7             	mov    rdi,rsp
     1391804:	e8 4b 7f 94 ff       	call   cd9754 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2266f4>
     1391809:	48 8d bc 24 40 05 00 	lea    rdi,[rsp+0x540]

### 0x1446429; FDE=0x14462dc..0x1446ffc; base=r12; score=40
     1446390:	0f 57 c0             	xorps  xmm0,xmm0
     1446393:	0f 29 84 24 b0 00 00 	movaps XMMWORD PTR [rsp+0xb0],xmm0
     144639a:	00 
     144639b:	0f 10 84 24 c8 00 00 	movups xmm0,XMMWORD PTR [rsp+0xc8]
     14463a2:	00 
     14463a3:	0f 10 8c 24 d8 00 00 	movups xmm1,XMMWORD PTR [rsp+0xd8]
     14463aa:	00 
     14463ab:	41 0f 11 4c 24 28    	movups XMMWORD PTR [r12+0x28],xmm1
     14463b1:	41 0f 11 44 24 18    	movups XMMWORD PTR [r12+0x18],xmm0
     14463b7:	8a 84 24 e8 00 00 00 	mov    al,BYTE PTR [rsp+0xe8]
     14463be:	41 88 44 24 38       	mov    BYTE PTR [r12+0x38],al
     14463c3:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
     14463c8:	41 0f 29 44 24 40    	movaps XMMWORD PTR [r12+0x40],xmm0
     14463ce:	41 88 6c 24 50       	mov    BYTE PTR [r12+0x50],bpl
     14463d3:	31 c0                	xor    eax,eax
     14463d5:	41 88 44 24 58       	mov    BYTE PTR [r12+0x58],al
     14463da:	41 88 84 24 38 02 00 	mov    BYTE PTR [r12+0x238],al
     14463e1:	00 
     14463e2:	41 88 84 24 40 02 00 	mov    BYTE PTR [r12+0x240],al
     14463e9:	00 
     14463ea:	41 88 84 24 70 02 00 	mov    BYTE PTR [r12+0x270],al
     14463f1:	00 
     14463f2:	4d 8d ac 24 80 02 00 	lea    r13,[r12+0x280]
     14463f9:	00 
     14463fa:	4c 89 ef             	mov    rdi,r13
     14463fd:	e8 e4 6b 66 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     1446402:	49 81 c6 90 01 00 00 	add    r14,0x190
     1446409:	31 c0                	xor    eax,eax
     144640b:	41 88 84 24 40 03 00 	mov    BYTE PTR [r12+0x340],al
     1446412:	00 
     1446413:	41 88 84 24 a0 03 00 	mov    BYTE PTR [r12+0x3a0],al
     144641a:	00 
     144641b:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
     1446420:	41 0f 11 84 24 a8 03 	movups XMMWORD PTR [r12+0x3a8],xmm0
     1446427:	00 00 
     1446429:	4d 89 bc 24 b8 03 00 	mov    QWORD PTR [r12+0x3b8],r15
     1446430:	00 
     1446431:	4d 8d bc 24 c0 03 00 	lea    r15,[r12+0x3c0]
     1446438:	00 
     1446439:	4c 89 ff             	mov    rdi,r15
     144643c:	4c 89 f6             	mov    rsi,r14
     144643f:	4c 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],r13
     1446444:	e8 47 3e 63 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1446449:	4d 8d b4 24 f0 03 00 	lea    r14,[r12+0x3f0]
     1446450:	00 
     1446451:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
     1446458:	00 
     1446459:	4c 89 f7             	mov    rdi,r14
     144645c:	e8 97 2d 74 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
     1446461:	49 89 9c 24 20 04 00 	mov    QWORD PTR [r12+0x420],rbx
     1446468:	00 
     1446469:	31 c0                	xor    eax,eax
     144646b:	41 88 84 24 28 04 00 	mov    BYTE PTR [r12+0x428],al
     1446472:	00 
     1446473:	41 88 84 24 b8 04 00 	mov    BYTE PTR [r12+0x4b8],al
     144647a:	00 
     144647b:	48 8d 8c 24 80 05 00 	lea    rcx,[rsp+0x580]
     1446482:	00 
     1446483:	c7 41 f0 01 00 00 00 	mov    DWORD PTR [rcx-0x10],0x1
     144648a:	48 8d 05 d7 b5 42 00 	lea    rax,[rip+0x42b5d7]        # 1871a68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e150>
     1446491:	48 89 01             	mov    QWORD PTR [rcx],rax
     1446494:	4c 89 61 08          	mov    QWORD PTR [rcx+0x8],r12
     1446498:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     144649c:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
     14464a3:	00 
     14464a4:	48 8d 94 24 70 05 00 	lea    rdx,[rsp+0x570]
     14464ab:	00 
     14464ac:	31 f6                	xor    esi,esi
     14464ae:	4c 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],r15
     14464b3:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
     14464b8:	e8 b1 1c 00 00       	call   144816e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28d6f2>
     14464bd:	48 8d 9c 24 00 06 00 	lea    rbx,[rsp+0x600]
     14464c4:	00 
     14464c5:	48 8d 8c 24 40 05 00 	lea    rcx,[rsp+0x540]
     14464cc:	00 
     14464cd:	83 61 f0 00          	and    DWORD PTR [rcx-0x10],0x0
     14464d1:	48 8d 05 d8 b5 42 00 	lea    rax,[rip+0x42b5d8]        # 1871ab0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e198>
     14464d8:	48 89 01             	mov    QWORD PTR [rcx],rax
     14464db:	4c 89 61 08          	mov    QWORD PTR [rcx+0x8],r12
     14464df:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     14464e3:	48 be 00 00 00 00 01 	movabs rsi,0x100000000
     14464ea:	00 00 00 
     14464ed:	48 8d 94 24 30 05 00 	lea    rdx,[rsp+0x530]
     14464f4:	00 
     14464f5:	48 89 df             	mov    rdi,rbx
     14464f8:	e8 71 1c 00 00       	call   144816e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28d6f2>
     14464fd:	48 8d 9c 24 50 06 00 	lea    rbx,[rsp+0x650]
     1446504:	00 
     1446505:	48 8d 8c 24 00 05 00 	lea    rcx,[rsp+0x500]
     144650c:	00 
     144650d:	c7 41 f0 01 00 00 00 	mov    DWORD PTR [rcx-0x10],0x1

### 0x1475492; FDE=0x14740f4..0x147584c; base=rsp; score=40
     147540a:	48 89 c7             	mov    rdi,rax
     147540d:	48 89 ee             	mov    rsi,rbp
     1475410:	e8 d9 a2 62 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1475415:	84 c0                	test   al,al
     1475417:	0f 84 cd 01 00 00    	je     14755ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bab6e>
     147541d:	4c 89 f7             	mov    rdi,r14
     1475420:	6a 02                	push   0x2
     1475422:	5e                   	pop    rsi
     1475423:	e8 22 28 00 00       	call   1477c4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bd1ce>
     1475428:	84 c0                	test   al,al
     147542a:	0f 85 ba 01 00 00    	jne    14755ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bab6e>
     1475430:	48 83 a4 24 70 03 00 	and    QWORD PTR [rsp+0x370],0x0
     1475437:	00 00 
     1475439:	0f 57 c0             	xorps  xmm0,xmm0
     147543c:	0f 29 84 24 60 03 00 	movaps XMMWORD PTR [rsp+0x360],xmm0
     1475443:	00 
     1475444:	6a 64                	push   0x64
     1475446:	5d                   	pop    rbp
     1475447:	89 ac 24 78 03 00 00 	mov    DWORD PTR [rsp+0x378],ebp
     147544e:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     1475453:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1475456:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
     147545c:	48 f7 d8             	neg    rax
     147545f:	48 89 84 24 80 03 00 	mov    QWORD PTR [rsp+0x380],rax
     1475466:	00 
     1475467:	31 c9                	xor    ecx,ecx
     1475469:	88 8c 24 88 03 00 00 	mov    BYTE PTR [rsp+0x388],cl
     1475470:	88 8c 24 90 03 00 00 	mov    BYTE PTR [rsp+0x390],cl
     1475477:	c6 84 24 98 03 00 00 	mov    BYTE PTR [rsp+0x398],0x2
     147547e:	02 
     147547f:	48 8d 84 24 a0 03 00 	lea    rax,[rsp+0x3a0]
     1475486:	00 
     1475487:	0f 57 c0             	xorps  xmm0,xmm0
     147548a:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     147548d:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1475492:	89 ac 24 b8 03 00 00 	mov    DWORD PTR [rsp+0x3b8],ebp
     1475499:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     147549e:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
     14754a5:	00 
     14754a6:	88 8c 24 c8 03 00 00 	mov    BYTE PTR [rsp+0x3c8],cl
     14754ad:	88 8c 24 d0 03 00 00 	mov    BYTE PTR [rsp+0x3d0],cl
     14754b4:	c6 84 24 d8 03 00 00 	mov    BYTE PTR [rsp+0x3d8],0x3
     14754bb:	03 
     14754bc:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
     14754c3:	00 
     14754c4:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
     14754cb:	00 
     14754cc:	6a 02                	push   0x2
     14754ce:	5a                   	pop    rdx
     14754cf:	e8 16 0c 00 00       	call   14760ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb66e>
     14754d4:	48 8b 94 24 10 07 00 	mov    rdx,QWORD PTR [rsp+0x710]
     14754db:	00 
     14754dc:	48 8b 8c 24 18 07 00 	mov    rcx,QWORD PTR [rsp+0x718]
     14754e3:	00 
     14754e4:	48 29 d1             	sub    rcx,rdx
     14754e7:	48 c1 f9 06          	sar    rcx,0x6
     14754eb:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     14754ef:	48 89 de             	mov    rsi,rbx
     14754f2:	e8 f1 34 0e 00       	call   15589e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39df6c>
     14754f7:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
     14754fe:	00 
     14754ff:	e8 16 f0 da ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     1475504:	6a 40                	push   0x40
     1475506:	5b                   	pop    rbx
     1475507:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
     147550b:	48 81 c7 60 03 00 00 	add    rdi,0x360
     1475512:	e8 79 89 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1475517:	48 83 c3 c0          	add    rbx,0xffffffffffffffc0
     147551b:	48 83 fb c0          	cmp    rbx,0xffffffffffffffc0
     147551f:	75 e6                	jne    1475507 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2baa8b>
     1475521:	e9 c4 00 00 00       	jmp    14755ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bab6e>
     1475526:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     147552b:	80 78 10 00          	cmp    BYTE PTR [rax+0x10],0x0
     147552f:	0f 84 b5 00 00 00    	je     14755ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bab6e>
     1475535:	4c 89 f7             	mov    rdi,r14
     1475538:	6a 04                	push   0x4
     147553a:	5e                   	pop    rsi
     147553b:	e8 0a 27 00 00       	call   1477c4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bd1ce>
     1475540:	84 c0                	test   al,al
     1475542:	0f 85 a2 00 00 00    	jne    14755ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bab6e>
     1475548:	0f 57 c0             	xorps  xmm0,xmm0
     147554b:	0f 29 84 24 60 03 00 	movaps XMMWORD PTR [rsp+0x360],xmm0
     1475552:	00 
     1475553:	48 83 a4 24 70 03 00 	and    QWORD PTR [rsp+0x370],0x0
     147555a:	00 00 
     147555c:	c7 84 24 78 03 00 00 	mov    DWORD PTR [rsp+0x378],0x64
     1475563:	64 00 00 00 
     1475567:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     147556c:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
     1475570:	31 c9                	xor    ecx,ecx
     1475572:	48 29 c1             	sub    rcx,rax

### 0x1632a64; FDE=0x1632440..0x1633995; base=rsp; score=40
     16329bd:	41 8b 86 b9 00 00 00 	mov    eax,DWORD PTR [r14+0xb9]
     16329c4:	8b 8c 24 c8 02 00 00 	mov    ecx,DWORD PTR [rsp+0x2c8]
     16329cb:	ba 00 bf 01 00       	mov    edx,0x1bf00
     16329d0:	09 d1                	or     ecx,edx
     16329d2:	48 8d 94 24 f8 02 00 	lea    rdx,[rsp+0x2f8]
     16329d9:	00 
     16329da:	89 42 79             	mov    DWORD PTR [rdx+0x79],eax
     16329dd:	41 0f 10 86 a9 00 00 	movups xmm0,XMMWORD PTR [r14+0xa9]
     16329e4:	00 
     16329e5:	0f 11 42 69          	movups XMMWORD PTR [rdx+0x69],xmm0
     16329e9:	41 8b 86 cd 00 00 00 	mov    eax,DWORD PTR [r14+0xcd]
     16329f0:	89 82 8d 00 00 00    	mov    DWORD PTR [rdx+0x8d],eax
     16329f6:	41 0f 10 86 bd 00 00 	movups xmm0,XMMWORD PTR [r14+0xbd]
     16329fd:	00 
     16329fe:	0f 11 42 7d          	movups XMMWORD PTR [rdx+0x7d],xmm0
     1632a02:	41 8b 86 e1 00 00 00 	mov    eax,DWORD PTR [r14+0xe1]
     1632a09:	89 82 a1 00 00 00    	mov    DWORD PTR [rdx+0xa1],eax
     1632a0f:	41 0f 10 86 d1 00 00 	movups xmm0,XMMWORD PTR [r14+0xd1]
     1632a16:	00 
     1632a17:	0f 11 82 91 00 00 00 	movups XMMWORD PTR [rdx+0x91],xmm0
     1632a1e:	41 8b 86 f5 00 00 00 	mov    eax,DWORD PTR [r14+0xf5]
     1632a25:	89 82 b5 00 00 00    	mov    DWORD PTR [rdx+0xb5],eax
     1632a2b:	41 0f 10 86 e5 00 00 	movups xmm0,XMMWORD PTR [r14+0xe5]
     1632a32:	00 
     1632a33:	0f 11 82 a5 00 00 00 	movups XMMWORD PTR [rdx+0xa5],xmm0
     1632a3a:	f3 41 0f 7e 86 fc 00 	movq   xmm0,QWORD PTR [r14+0xfc]
     1632a41:	00 00 
     1632a43:	66 0f 6f c8          	movdqa xmm1,xmm0
     1632a47:	66 0f fe 0d 51 9e d5 	paddd  xmm1,XMMWORD PTR [rip+0xfffffffffed59e51]        # 38c8a0 <_ZTSSt12bad_any_cast@@Base-0x3928>
     1632a4e:	fe 
     1632a4f:	66 0f 6f d1          	movdqa xmm2,xmm1
     1632a53:	66 0f 38 3f 15 14 b1 	pmaxud xmm2,XMMWORD PTR [rip+0xfffffffffed5b114]        # 38db70 <_ZTSSt12bad_any_cast@@Base-0x2658>
     1632a5a:	d5 fe 
     1632a5c:	66 0f 76 d1          	pcmpeqd xmm2,xmm1
     1632a60:	66 0f df d0          	pandn  xmm2,xmm0
     1632a64:	66 0f d6 94 24 b8 03 	movq   QWORD PTR [rsp+0x3b8],xmm2
     1632a6b:	00 00 
     1632a6d:	89 8c 24 c8 02 00 00 	mov    DWORD PTR [rsp+0x2c8],ecx
     1632a74:	49 8b 86 10 01 00 00 	mov    rax,QWORD PTR [r14+0x110]
     1632a7b:	49 2b 86 08 01 00 00 	sub    rax,QWORD PTR [r14+0x108]
     1632a82:	48 99                	cqo
     1632a84:	6a 18                	push   0x18
     1632a86:	59                   	pop    rcx
     1632a87:	48 f7 f9             	idiv   rcx
     1632a8a:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
     1632a91:	00 
     1632a92:	89 c6                	mov    esi,eax
     1632a94:	e8 d9 84 6f ff       	call   d2af72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x277f12>
     1632a99:	49 8b b6 08 01 00 00 	mov    rsi,QWORD PTR [r14+0x108]
     1632aa0:	49 39 b6 10 01 00 00 	cmp    QWORD PTR [r14+0x110],rsi
     1632aa7:	74 3e                	je     1632ae7 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dc55>
     1632aa9:	31 db                	xor    ebx,ebx
     1632aab:	45 31 ed             	xor    r13d,r13d
     1632aae:	48 01 de             	add    rsi,rbx
     1632ab1:	48 8b 84 24 c0 03 00 	mov    rax,QWORD PTR [rsp+0x3c0]
     1632ab8:	00 
     1632ab9:	4a 8b 3c e8          	mov    rdi,QWORD PTR [rax+r13*8]
     1632abd:	e8 be b5 1b 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1632ac2:	49 ff c5             	inc    r13
     1632ac5:	49 8b b6 08 01 00 00 	mov    rsi,QWORD PTR [r14+0x108]
     1632acc:	49 8b 86 10 01 00 00 	mov    rax,QWORD PTR [r14+0x110]
     1632ad3:	48 29 f0             	sub    rax,rsi
     1632ad6:	48 99                	cqo
     1632ad8:	6a 18                	push   0x18
     1632ada:	59                   	pop    rcx
     1632adb:	48 f7 f9             	idiv   rcx
     1632ade:	48 83 c3 18          	add    rbx,0x18
     1632ae2:	49 39 c5             	cmp    r13,rax
     1632ae5:	72 c7                	jb     1632aae <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dc1c>
     1632ae7:	41 8a 86 39 01 00 00 	mov    al,BYTE PTR [r14+0x139]
     1632aee:	88 84 24 f8 03 00 00 	mov    BYTE PTR [rsp+0x3f8],al
     1632af5:	41 8a 86 3a 01 00 00 	mov    al,BYTE PTR [r14+0x13a]
     1632afc:	88 84 24 f9 03 00 00 	mov    BYTE PTR [rsp+0x3f9],al
     1632b03:	81 8c 24 c8 02 00 00 	or     DWORD PTR [rsp+0x2c8],0x60000
     1632b0a:	00 00 06 00 
     1632b0e:	6a 15                	push   0x15
     1632b10:	5e                   	pop    rsi
     1632b11:	48 8d 94 24 c0 02 00 	lea    rdx,[rsp+0x2c0]
     1632b18:	00 
     1632b19:	e9 f7 01 00 00       	jmp    1632d15 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2de83>
     1632b1e:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
     1632b21:	48 8d 8c 24 28 05 00 	lea    rcx,[rsp+0x528]
     1632b28:	00 
     1632b29:	89 41 10             	mov    DWORD PTR [rcx+0x10],eax
     1632b2c:	f3 0f 6f 03          	movdqu xmm0,XMMWORD PTR [rbx]
     1632b30:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
     1632b34:	41 83 cc 06          	or     r12d,0x6
     1632b38:	44 89 a4 24 f0 04 00 	mov    DWORD PTR [rsp+0x4f0],r12d
     1632b3f:	00 
     1632b40:	49 8b 5e 58          	mov    rbx,QWORD PTR [r14+0x58]
     1632b44:	49 2b 5e 50          	sub    rbx,QWORD PTR [r14+0x50]

## All nonzero-looking +0x3b8 writes globally (for alias recovery)
### 0xacdf98; FDE=(11323428, 11332417): mov    QWORD PTR [rsp+0x3b8],r14
      acdf4e:	48 8d 05 d3 7c 06 00 	lea    rax,[rip+0x67cd3]        # b35c28 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82bc8>
      acdf55:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      acdf59:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      acdf60:	00 
      acdf61:	48 89 da             	mov    rdx,rbx
      acdf64:	31 c9                	xor    ecx,ecx
      acdf66:	45 31 c0             	xor    r8d,r8d
      acdf69:	e8 5e 38 cf 00       	call   17c17cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175938>
      acdf6e:	48 89 df             	mov    rdi,rbx
      acdf71:	e8 28 93 fd ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      acdf76:	31 ff                	xor    edi,edi
      acdf78:	e8 b9 2d 00 00       	call   ad0d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1dcd6>
      acdf7d:	31 ff                	xor    edi,edi
      acdf7f:	e8 02 05 fd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      acdf84:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      acdf89:	48 8d 0d 38 c2 d3 00 	lea    rcx,[rip+0xd3c238]        # 180a1c8 <_ZTIN4asio22service_already_existsE@@Base+0xb9b0>
      acdf90:	48 89 8c 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rcx
      acdf97:	00 
      acdf98:	4c 89 b4 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r14
      acdf9f:	00 
      acdfa0:	48 89 ac 24 d0 03 00 	mov    QWORD PTR [rsp+0x3d0],rbp
      acdfa7:	00 
      acdfa8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      acdfab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      acdfae:	48 89 ee             	mov    rsi,rbp
      acdfb1:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      acdfb7:	48 89 ef             	mov    rdi,rbp
      acdfba:	e8 ab bf fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      acdfbf:	4c 89 e7             	mov    rdi,r12
      acdfc2:	e8 61 68 fe ff       	call   ab4828 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17c8>
      acdfc7:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      acdfcc:	4c 89 60 28          	mov    QWORD PTR [rax+0x28],r12
      acdfd0:	49 89 c4             	mov    r12,rax
      acdfd3:	48 8d bc 24 70 03 00 	lea    rdi,[rsp+0x370]
      acdfda:	00 
      acdfdb:	e8 04 7c 06 00       	call   b35be4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82b84>
      acdfe0:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
      acdfe7:	00 
      acdfe8:	e8 99 04 fd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      acdfed:	48 8d 05 3c bc d3 00 	lea    rax,[rip+0xd3bc3c]        # 1809c30 <_ZTIN4asio22service_already_existsE@@Base+0xb418>
      acdff4:	49 89 44 24 30       	mov    QWORD PTR [r12+0x30],rax
      acdff9:	6a 58                	push   0x58
      acdffb:	5f                   	pop    rdi
      acdffc:	e8 ff fe d1 00       	call   17edf00 <_Znwm@plt>
      ace001:	48 89 c3             	mov    rbx,rax
      ace004:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      ace00b:	00 

### 0xae32b7; FDE=(11415662, 11422402): add    QWORD PTR [rsp+0x3b8],rax
      ae325c:	c7 84 24 98 03 00 00 	mov    DWORD PTR [rsp+0x398],0x3f800000
      ae3263:	00 00 80 3f 
      ae3267:	48 8d 84 24 60 02 00 	lea    rax,[rsp+0x260]
      ae326e:	00 
      ae326f:	0f 11 80 70 01 00 00 	movups XMMWORD PTR [rax+0x170],xmm0
      ae3276:	0f 11 80 60 01 00 00 	movups XMMWORD PTR [rax+0x160],xmm0
      ae327d:	0f 11 80 50 01 00 00 	movups XMMWORD PTR [rax+0x150],xmm0
      ae3284:	0f 11 80 40 01 00 00 	movups XMMWORD PTR [rax+0x140],xmm0
      ae328b:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
      ae3290:	4a 8b 44 31 70       	mov    rax,QWORD PTR [rcx+r14*1+0x70]
      ae3295:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
      ae329c:	00 
      ae329d:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
      ae32a2:	4e 8b 7c 31 58       	mov    r15,QWORD PTR [rcx+r14*1+0x58]
      ae32a7:	45 31 f6             	xor    r14d,r14d
      ae32aa:	4d 85 ff             	test   r15,r15
      ae32ad:	0f 84 ec 00 00 00    	je     ae339f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3033f>
      ae32b3:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
      ae32b7:	48 01 84 24 b8 03 00 	add    QWORD PTR [rsp+0x3b8],rax
      ae32be:	00 
      ae32bf:	49 8b 47 48          	mov    rax,QWORD PTR [r15+0x48]
      ae32c3:	48 01 84 24 c0 03 00 	add    QWORD PTR [rsp+0x3c0],rax
      ae32ca:	00 
      ae32cb:	49 8d 5f 28          	lea    rbx,[r15+0x28]
      ae32cf:	48 8b b4 24 70 03 00 	mov    rsi,QWORD PTR [rsp+0x370]
      ae32d6:	00 
      ae32d7:	49 39 f6             	cmp    r14,rsi
      ae32da:	73 14                	jae    ae32f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30290>
      ae32dc:	4c 89 f7             	mov    rdi,r14
      ae32df:	48 89 de             	mov    rsi,rbx
      ae32e2:	e8 1d 30 00 00       	call   ae6304 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x332a4>
      ae32e7:	49 83 c6 30          	add    r14,0x30
      ae32eb:	e9 91 00 00 00       	jmp    ae3381 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30321>
      ae32f0:	48 8b bc 24 60 03 00 	mov    rdi,QWORD PTR [rsp+0x360]
      ae32f7:	00 
      ae32f8:	49 29 fe             	sub    r14,rdi
      ae32fb:	4c 89 f0             	mov    rax,r14
      ae32fe:	48 99                	cqo
      ae3300:	6a 30                	push   0x30
      ae3302:	41 5e                	pop    r14
      ae3304:	49 f7 fe             	idiv   r14
      ae3307:	48 8d 50 01          	lea    rdx,[rax+0x1]
      ae330b:	e8 8a 9a fc ff       	call   aacd9a <JNI_OnUnload@@Base+0x34667>
      ae3310:	48 89 c6             	mov    rsi,rax
      ae3313:	48 8b 84 24 68 03 00 	mov    rax,QWORD PTR [rsp+0x368]
      ae331a:	00 
      ae331b:	48 2b 84 24 60 03 00 	sub    rax,QWORD PTR [rsp+0x360]

### 0xb39d06; FDE=(11770934, 11772028): add    DWORD PTR [r13+0x3b8],ebp
      b39cb4:	e8 8d 0f ca 00       	call   17dac46 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a67>
      b39cb9:	49 89 c4             	mov    r12,rax
      b39cbc:	49 8d bd c8 03 00 00 	lea    rdi,[r13+0x3c8]
      b39cc3:	48 8d b4 24 00 02 00 	lea    rsi,[rsp+0x200]
      b39cca:	00 
      b39ccb:	c7 06 04 00 00 00    	mov    DWORD PTR [rsi],0x4
      b39cd1:	e8 ac 11 ab 00       	call   15eae82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x430406>
      b39cd6:	4c 89 20             	mov    QWORD PTR [rax],r12
      b39cd9:	41 c6 85 b1 03 00 00 	mov    BYTE PTR [r13+0x3b1],0x1
      b39ce0:	01 
      b39ce1:	e8 60 0f ca 00       	call   17dac46 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a67>
      b39ce6:	49 89 c4             	mov    r12,rax
      b39ce9:	49 8d bd c8 03 00 00 	lea    rdi,[r13+0x3c8]
      b39cf0:	48 8d b4 24 00 02 00 	lea    rsi,[rsp+0x200]
      b39cf7:	00 
      b39cf8:	c7 06 05 00 00 00    	mov    DWORD PTR [rsi],0x5
      b39cfe:	e8 7f 11 ab 00       	call   15eae82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x430406>
      b39d03:	4c 89 20             	mov    QWORD PTR [rax],r12
      b39d06:	41 01 ad b8 03 00 00 	add    DWORD PTR [r13+0x3b8],ebp
      b39d0d:	6a 01                	push   0x1
      b39d0f:	5e                   	pop    rsi
      b39d10:	48 89 df             	mov    rdi,rbx
      b39d13:	e8 22 58 02 00       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>
      b39d18:	48 89 e7             	mov    rdi,rsp
      b39d1b:	4c 89 f6             	mov    rsi,r14
      b39d1e:	4c 89 fa             	mov    rdx,r15
      b39d21:	e8 44 bf c9 00       	call   17d5c6a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1a8b>
      b39d26:	85 ed                	test   ebp,ebp
      b39d28:	7e 2a                	jle    b39d54 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x86cf4>
      b39d2a:	89 ee                	mov    esi,ebp
      b39d2c:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
      b39d33:	00 
      b39d34:	31 d2                	xor    edx,edx
      b39d36:	e8 75 4a cb 00       	call   17ee7b0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEmc@plt>
      b39d3b:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
      b39d40:	f6 84 24 00 02 00 00 	test   BYTE PTR [rsp+0x200],0x1
      b39d47:	01 
      b39d48:	74 1a                	je     b39d64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x86d04>
      b39d4a:	4c 8b 84 24 10 02 00 	mov    r8,QWORD PTR [rsp+0x210]
      b39d51:	00 
      b39d52:	eb 18                	jmp    b39d6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x86d0c>
      b39d54:	0f 57 c0             	xorps  xmm0,xmm0
      b39d57:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      b39d5c:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
      b39d62:	eb 49                	jmp    b39dad <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x86d4d>
      b39d64:	4c 8d 84 24 01 02 00 	lea    r8,[rsp+0x201]
      b39d6b:	00 

### 0xb7e60e; FDE=(12051374, 12057354): mov    QWORD PTR [r12+0x3b8],rax
      b7e5c6:	48 0f 42 c1          	cmovb  rax,rcx
      b7e5ca:	48 69 c0 40 1f 00 00 	imul   rax,rax,0x1f40
      b7e5d1:	31 d2                	xor    edx,edx
      b7e5d3:	49 f7 f6             	div    r14
      b7e5d6:	89 84 24 b4 00 00 00 	mov    DWORD PTR [rsp+0xb4],eax
      b7e5dd:	48 89 df             	mov    rdi,rbx
      b7e5e0:	4c 89 fe             	mov    rsi,r15
      b7e5e3:	e8 c4 f8 ff ff       	call   b7deac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcae4c>
      b7e5e8:	48 83 c5 08          	add    rbp,0x8
      b7e5ec:	4c 39 e5             	cmp    rbp,r12
      b7e5ef:	75 b4                	jne    b7e5a5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb545>
      b7e5f1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      b7e5f6:	4d 8d ac 24 b0 03 00 	lea    r13,[r12+0x3b0]
      b7e5fd:	00 
      b7e5fe:	49 8b 84 24 b0 03 00 	mov    rax,QWORD PTR [r12+0x3b0]
      b7e605:	00 
      b7e606:	4d 8b b4 24 08 04 00 	mov    r14,QWORD PTR [r12+0x408]
      b7e60d:	00 
      b7e60e:	49 89 84 24 b8 03 00 	mov    QWORD PTR [r12+0x3b8],rax
      b7e615:	00 
      b7e616:	4d 8b bc 24 10 04 00 	mov    r15,QWORD PTR [r12+0x410]
      b7e61d:	00 
      b7e61e:	4d 39 fe             	cmp    r14,r15
      b7e621:	74 52                	je     b7e675 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb615>
      b7e623:	48 8d 9c 24 b0 00 00 	lea    rbx,[rsp+0xb0]
      b7e62a:	00 
      b7e62b:	49 8b bc 24 70 03 00 	mov    rdi,QWORD PTR [r12+0x370]
      b7e632:	00 
      b7e633:	49 8b b4 24 78 03 00 	mov    rsi,QWORD PTR [r12+0x378]
      b7e63a:	00 
      b7e63b:	41 8b 16             	mov    edx,DWORD PTR [r14]
      b7e63e:	e8 4f 1d 00 00       	call   b80392 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcd332>
      b7e643:	48 85 c0             	test   rax,rax
      b7e646:	74 24                	je     b7e66c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb60c>
      b7e648:	8b 40 14             	mov    eax,DWORD PTR [rax+0x14]
      b7e64b:	85 c0                	test   eax,eax
      b7e64d:	78 1d                	js     b7e66c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb60c>
      b7e64f:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax
      b7e656:	41 8b 46 04          	mov    eax,DWORD PTR [r14+0x4]
      b7e65a:	89 84 24 b4 00 00 00 	mov    DWORD PTR [rsp+0xb4],eax
      b7e661:	4c 89 ef             	mov    rdi,r13
      b7e664:	48 89 de             	mov    rsi,rbx
      b7e667:	e8 ac 1d 00 00       	call   b80418 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcd3b8>
      b7e66c:	49 83 c6 08          	add    r14,0x8
      b7e670:	4d 39 fe             	cmp    r14,r15
      b7e673:	75 b6                	jne    b7e62b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb5cb>
      b7e675:	41 c6 84 24 c8 03 00 	mov    BYTE PTR [r12+0x3c8],0x1

### 0xb7f020; FDE=(12051374, 12057354): mov    QWORD PTR [rbx+0x3b8],rcx
      b7efc8:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      b7efcd:	48 8b bb f0 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3f0]
      b7efd4:	48 85 ff             	test   rdi,rdi
      b7efd7:	74 0c                	je     b7efe5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcbf85>
      b7efd9:	48 89 bb f8 03 00 00 	mov    QWORD PTR [rbx+0x3f8],rdi
      b7efe0:	e8 3b ef c6 00       	call   17edf20 <_ZdlPv@plt>
      b7efe5:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      b7efec:	00 
      b7efed:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
      b7eff0:	0f 11 83 f0 03 00 00 	movups XMMWORD PTR [rbx+0x3f0],xmm0
      b7eff7:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      b7effb:	48 89 83 00 04 00 00 	mov    QWORD PTR [rbx+0x400],rax
      b7f002:	0f 57 c0             	xorps  xmm0,xmm0
      b7f005:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      b7f008:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      b7f00d:	e8 ea 05 f2 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
      b7f012:	48 8b 8b b0 03 00 00 	mov    rcx,QWORD PTR [rbx+0x3b0]
      b7f019:	48 8b b3 c0 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3c0]
      b7f020:	48 89 8b b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],rcx
      b7f027:	4c 8b bb f8 03 00 00 	mov    r15,QWORD PTR [rbx+0x3f8]
      b7f02e:	4c 8b a3 f0 03 00 00 	mov    r12,QWORD PTR [rbx+0x3f0]
      b7f035:	4c 89 f8             	mov    rax,r15
      b7f038:	4c 29 e0             	sub    rax,r12
      b7f03b:	6a 0c                	push   0xc
      b7f03d:	5f                   	pop    rdi
      b7f03e:	48 99                	cqo
      b7f040:	48 f7 ff             	idiv   rdi
      b7f043:	48 01 c0             	add    rax,rax
      b7f046:	48 29 ce             	sub    rsi,rcx
      b7f049:	48 c1 fe 03          	sar    rsi,0x3
      b7f04d:	48 39 c6             	cmp    rsi,rax
      b7f050:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
      b7f055:	73 65                	jae    b7f0bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcc05c>
      b7f057:	48 89 c1             	mov    rcx,rax
      b7f05a:	48 c1 e9 3d          	shr    rcx,0x3d
      b7f05e:	0f 85 2e 09 00 00    	jne    b7f992 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcc932>
      b7f064:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      b7f069:	49 8d 8e c0 03 00 00 	lea    rcx,[r14+0x3c0]
      b7f070:	48 89 8c 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rcx
      b7f077:	00 
      b7f078:	48 89 c7             	mov    rdi,rax
      b7f07b:	e8 a2 08 f2 ff       	call   a9f922 <JNI_OnUnload@@Base+0x271ef>
      b7f080:	48 8d 9c 24 b0 00 00 	lea    rbx,[rsp+0xb0]
      b7f087:	00 
      b7f088:	48 89 03             	mov    QWORD PTR [rbx],rax
      b7f08b:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      b7f08f:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax

### 0xb7ffe1; FDE=(12058340, 12059537): mov    QWORD PTR [rbx+0x3b8],r15
      b7ffa1:	48 83 c1 08          	add    rcx,0x8
      b7ffa5:	4c 39 f9             	cmp    rcx,r15
      b7ffa8:	75 e7                	jne    b7ff91 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xccf31>
      b7ffaa:	4c 8b b3 b0 03 00 00 	mov    r14,QWORD PTR [rbx+0x3b0]
      b7ffb1:	4c 8b bb b8 03 00 00 	mov    r15,QWORD PTR [rbx+0x3b8]
      b7ffb8:	49 83 c4 08          	add    r12,0x8
      b7ffbc:	4d 39 fc             	cmp    r12,r15
      b7ffbf:	74 2c                	je     b7ffed <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xccf8d>
      b7ffc1:	4c 89 fe             	mov    rsi,r15
      b7ffc4:	4c 29 e6             	sub    rsi,r12
      b7ffc7:	4c 01 e6             	add    rsi,r12
      b7ffca:	49 29 f7             	sub    r15,rsi
      b7ffcd:	74 0f                	je     b7ffde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xccf7e>
      b7ffcf:	4c 89 e7             	mov    rdi,r12
      b7ffd2:	4c 89 fa             	mov    rdx,r15
      b7ffd5:	e8 06 fb c6 00       	call   17efae0 <memmove@plt>
      b7ffda:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
      b7ffde:	4d 01 e7             	add    r15,r12
      b7ffe1:	4c 89 bb b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],r15
      b7ffe8:	eb 03                	jmp    b7ffed <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xccf8d>
      b7ffea:	4d 89 f7             	mov    r15,r14
      b7ffed:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      b7fff2:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
      b7fff7:	4c 8b ab c0 03 00 00 	mov    r13,QWORD PTR [rbx+0x3c0]
      b7fffe:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13
      b80003:	0f 57 c0             	xorps  xmm0,xmm0
      b80006:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
      b8000a:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
      b8000f:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
      b80014:	4c 89 fd             	mov    rbp,r15
      b80017:	4c 29 f5             	sub    rbp,r14
      b8001a:	48 c1 fd 03          	sar    rbp,0x3
      b8001e:	83 fd 01             	cmp    ebp,0x1
      b80021:	7f 17                	jg     b8003a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xccfda>
      b80023:	4c 89 74 24 30       	mov    QWORD PTR [rsp+0x30],r14
      b80028:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
      b8002d:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
      b80032:	4d 89 fc             	mov    r12,r15
      b80035:	e9 8e 02 00 00       	jmp    b802c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcd268>
      b8003a:	41 89 ec             	mov    r12d,ebp
      b8003d:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      b80044:	00 
      b80045:	4c 89 e6             	mov    rsi,r12
      b80048:	e8 05 43 f3 ff       	call   ab4352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12f2>
      b8004d:	48 8d 94 24 98 00 00 	lea    rdx,[rsp+0x98]
      b80054:	00 
      b80055:	83 0a ff             	or     DWORD PTR [rdx],0xffffffff

### 0xb802bc; FDE=(12058340, 12059537): mov    QWORD PTR [rbx+0x3b8],rdi
      b8026c:	e8 2d f7 f1 ff       	call   a9f99e <JNI_OnUnload@@Base+0x2726b>
      b80271:	4d 8b 67 08          	mov    r12,QWORD PTR [r15+0x8]
      b80275:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      b8027a:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
      b8027f:	4c 89 74 24 30       	mov    QWORD PTR [rsp+0x30],r14
      b80284:	0f 57 c0             	xorps  xmm0,xmm0
      b80287:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      b8028c:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
      b80292:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      b80297:	e8 ea 19 00 00       	call   b81c86 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcec26>
      b8029c:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      b802a1:	e8 82 b4 ef ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      b802a6:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      b802ad:	00 
      b802ae:	e8 75 b4 ef ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      b802b3:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
      b802b7:	48 85 ff             	test   rdi,rdi
      b802ba:	74 18                	je     b802d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcd274>
      b802bc:	48 89 bb b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],rdi
      b802c3:	e8 58 dc c6 00       	call   17edf20 <_ZdlPv@plt>
      b802c8:	0f 57 c0             	xorps  xmm0,xmm0
      b802cb:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
      b802cf:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
      b802d4:	4c 89 b3 b0 03 00 00 	mov    QWORD PTR [rbx+0x3b0],r14
      b802db:	4c 89 a3 b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],r12
      b802e2:	4c 89 ab c0 03 00 00 	mov    QWORD PTR [rbx+0x3c0],r13
      b802e9:	0f 57 c0             	xorps  xmm0,xmm0
      b802ec:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      b802f1:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      b802f4:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      b802f9:	e8 fe f2 f1 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
      b802fe:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      b80303:	e8 f4 f2 f1 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
      b80308:	c6 83 c8 03 00 00 00 	mov    BYTE PTR [rbx+0x3c8],0x0
      b8030f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b80316:	00 00 
      b80318:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
      b8031f:	00 
      b80320:	75 6a                	jne    b8038c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcd32c>
      b80322:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
      b80329:	5b                   	pop    rbx
      b8032a:	41 5c                	pop    r12
      b8032c:	41 5d                	pop    r13
      b8032e:	41 5e                	pop    r14
      b80330:	41 5f                	pop    r15
      b80332:	5d                   	pop    rbp
      b80333:	c3                   	ret

### 0xb802db; FDE=(12058340, 12059537): mov    QWORD PTR [rbx+0x3b8],r12
      b80287:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      b8028c:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
      b80292:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      b80297:	e8 ea 19 00 00       	call   b81c86 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcec26>
      b8029c:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      b802a1:	e8 82 b4 ef ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      b802a6:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      b802ad:	00 
      b802ae:	e8 75 b4 ef ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      b802b3:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
      b802b7:	48 85 ff             	test   rdi,rdi
      b802ba:	74 18                	je     b802d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcd274>
      b802bc:	48 89 bb b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],rdi
      b802c3:	e8 58 dc c6 00       	call   17edf20 <_ZdlPv@plt>
      b802c8:	0f 57 c0             	xorps  xmm0,xmm0
      b802cb:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
      b802cf:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
      b802d4:	4c 89 b3 b0 03 00 00 	mov    QWORD PTR [rbx+0x3b0],r14
      b802db:	4c 89 a3 b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],r12
      b802e2:	4c 89 ab c0 03 00 00 	mov    QWORD PTR [rbx+0x3c0],r13
      b802e9:	0f 57 c0             	xorps  xmm0,xmm0
      b802ec:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      b802f1:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      b802f4:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      b802f9:	e8 fe f2 f1 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
      b802fe:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      b80303:	e8 f4 f2 f1 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
      b80308:	c6 83 c8 03 00 00 00 	mov    BYTE PTR [rbx+0x3c8],0x0
      b8030f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b80316:	00 00 
      b80318:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
      b8031f:	00 
      b80320:	75 6a                	jne    b8038c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcd32c>
      b80322:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
      b80329:	5b                   	pop    rbx
      b8032a:	41 5c                	pop    r12
      b8032c:	41 5d                	pop    r13
      b8032e:	41 5e                	pop    r14
      b80330:	41 5f                	pop    r15
      b80332:	5d                   	pop    rbp
      b80333:	c3                   	ret
      b80334:	48 89 c3             	mov    rbx,rax
      b80337:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      b8033c:	e8 45 19 00 00       	call   b81c86 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcec26>
      b80341:	eb 03                	jmp    b80346 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcd2e6>
      b80343:	48 89 c3             	mov    rbx,rax
      b80346:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]

### 0xb8c70d; FDE=(12104738, 12113141): mov    QWORD PTR [rsp+0x3b8],r13
      b8c6cb:	00 
      b8c6cc:	4c 89 b4 24 40 04 00 	mov    QWORD PTR [rsp+0x440],r14
      b8c6d3:	00 
      b8c6d4:	4d 85 f6             	test   r14,r14
      b8c6d7:	74 05                	je     b8c6de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd967e>
      b8c6d9:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c6de:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
      b8c6e3:	48 89 8c 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rcx
      b8c6ea:	00 
      b8c6eb:	4c 89 ac 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],r13
      b8c6f2:	00 
      b8c6f3:	4c 89 b4 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],r14
      b8c6fa:	00 
      b8c6fb:	4d 85 f6             	test   r14,r14
      b8c6fe:	74 05                	je     b8c705 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd96a5>
      b8c700:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c705:	4c 89 bc 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],r15
      b8c70c:	00 
      b8c70d:	4c 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r13
      b8c714:	00 
      b8c715:	4c 89 b4 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],r14
      b8c71c:	00 
      b8c71d:	40 84 ed             	test   bpl,bpl
      b8c720:	75 05                	jne    b8c727 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd96c7>
      b8c722:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c727:	4c 89 bc 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r15
      b8c72e:	00 
      b8c72f:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      b8c732:	0f 11 84 24 d0 03 00 	movups XMMWORD PTR [rsp+0x3d0],xmm0
      b8c739:	00 
      b8c73a:	4c 89 ac 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],r13
      b8c741:	00 
      b8c742:	4c 89 b4 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],r14
      b8c749:	00 
      b8c74a:	4d 85 f6             	test   r14,r14
      b8c74d:	74 05                	je     b8c754 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd96f4>
      b8c74f:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c754:	48 83 a4 24 48 03 00 	and    QWORD PTR [rsp+0x348],0x0
      b8c75b:	00 00 
      b8c75d:	48 83 a4 24 58 03 00 	and    QWORD PTR [rsp+0x358],0x0
      b8c764:	00 00 
      b8c766:	6a 58                	push   0x58
      b8c768:	5f                   	pop    rdi
      b8c769:	e8 92 17 c6 00       	call   17edf00 <_Znwm@plt>
      b8c76e:	49 89 c7             	mov    r15,rax
      b8c771:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
      b8c778:	00 

### 0xbda8ee; FDE=(12426058, 12436663): mov    BYTE PTR [r13+0x3b8],0x1
      bda8a0:	48 8d 94 24 30 02 00 	lea    rdx,[rsp+0x230]
      bda8a7:	00 
      bda8a8:	48 83 22 00          	and    QWORD PTR [rdx],0x0
      bda8ac:	48 89 df             	mov    rdi,rbx
      bda8af:	4c 89 fe             	mov    rsi,r15
      bda8b2:	e8 39 51 01 00       	call   bef9f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13c990>
      bda8b7:	49 8d bd 90 03 00 00 	lea    rdi,[r13+0x390]
      bda8be:	48 8d 94 24 30 02 00 	lea    rdx,[rsp+0x230]
      bda8c5:	00 
      bda8c6:	48 83 22 00          	and    QWORD PTR [rdx],0x0
      bda8ca:	4c 89 fe             	mov    rsi,r15
      bda8cd:	e8 1e 51 01 00       	call   bef9f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13c990>
      bda8d2:	49 8d 85 a8 03 00 00 	lea    rax,[r13+0x3a8]
      bda8d9:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      bda8e0:	00 
      bda8e1:	66 0f 57 c0          	xorpd  xmm0,xmm0
      bda8e5:	66 41 0f 11 85 a8 03 	movupd XMMWORD PTR [r13+0x3a8],xmm0
      bda8ec:	00 00 
      bda8ee:	41 c6 85 b8 03 00 00 	mov    BYTE PTR [r13+0x3b8],0x1
      bda8f5:	01 
      bda8f6:	48 b8 01 00 00 00 01 	movabs rax,0x100000001
      bda8fd:	00 00 00 
      bda900:	49 89 85 bc 03 00 00 	mov    QWORD PTR [r13+0x3bc],rax
      bda907:	41 c7 85 c4 03 00 00 	mov    DWORD PTR [r13+0x3c4],0x1
      bda90e:	01 00 00 00 
      bda912:	49 8d 85 08 04 00 00 	lea    rax,[r13+0x408]
      bda919:	66 41 0f 11 85 08 04 	movupd XMMWORD PTR [r13+0x408],xmm0
      bda920:	00 00 
      bda922:	66 41 0f 11 85 c8 03 	movupd XMMWORD PTR [r13+0x3c8],xmm0
      bda929:	00 00 
      bda92b:	66 41 0f 11 85 d8 03 	movupd XMMWORD PTR [r13+0x3d8],xmm0
      bda932:	00 00 
      bda934:	66 41 0f 11 85 e8 03 	movupd XMMWORD PTR [r13+0x3e8],xmm0
      bda93b:	00 00 
      bda93d:	49 83 a5 f8 03 00 00 	and    QWORD PTR [r13+0x3f8],0x0
      bda944:	00 
      bda945:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
      bda94c:	00 
      bda94d:	49 89 85 00 04 00 00 	mov    QWORD PTR [r13+0x400],rax
      bda954:	41 83 a5 18 04 00 00 	and    DWORD PTR [r13+0x418],0x0
      bda95b:	00 
      bda95c:	f2 41 0f 10 85 a0 00 	movsd  xmm0,QWORD PTR [r13+0xa0]
      bda963:	00 00 
      bda965:	f2 41 0f 2a 8d ac 00 	cvtsi2sd xmm1,DWORD PTR [r13+0xac]
      bda96c:	00 00 
      bda96e:	49 8b bd 80 00 00 00 	mov    rdi,QWORD PTR [r13+0x80]
      bda975:	41 8b b5 90 00 00 00 	mov    esi,DWORD PTR [r13+0x90]

### 0xbf144e; FDE=(12521182, 12534473): cmp    BYTE PTR [rax+0x3b8],0x0
      bf1409:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
      bf140d:	8b 7e 1c             	mov    edi,DWORD PTR [rsi+0x1c]
      bf1410:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
      bf1414:	e8 eb 30 00 00       	call   bf4504 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1414a4>
      bf1419:	4c 89 ef             	mov    rdi,r13
      bf141c:	e8 c1 d3 ea ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
      bf1421:	49 89 c5             	mov    r13,rax
      bf1424:	4c 39 e0             	cmp    rax,r12
      bf1427:	75 aa                	jne    bf13d3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e373>
      bf1429:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      bf142e:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      bf1431:	44 8b 74 24 50       	mov    r14d,DWORD PTR [rsp+0x50]
      bf1436:	44 89 f6             	mov    esi,r14d
      bf1439:	e8 66 30 00 00       	call   bf44a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x141444>
      bf143e:	49 89 c4             	mov    r12,rax
      bf1441:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      bf1446:	4c 8b 28             	mov    r13,QWORD PTR [rax]
      bf1449:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      bf144e:	80 b8 b8 03 00 00 00 	cmp    BYTE PTR [rax+0x3b8],0x0
      bf1455:	0f 84 a8 00 00 00    	je     bf1503 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e4a3>
      bf145b:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
      bf1462:	00 
      bf1463:	44 89 f6             	mov    esi,r14d
      bf1466:	e8 39 30 00 00       	call   bf44a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x141444>
      bf146b:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      bf146e:	44 29 f5             	sub    ebp,r14d
      bf1471:	89 e8                	mov    eax,ebp
      bf1473:	99                   	cdq
      bf1474:	6a 02                	push   0x2
      bf1476:	59                   	pop    rcx
      bf1477:	f7 f9                	idiv   ecx
      bf1479:	4c 63 f0             	movsxd r14,eax
      bf147c:	4b 8d 04 b7          	lea    rax,[r15+r14*4]
      bf1480:	48 8b 8c 24 00 01 00 	mov    rcx,QWORD PTR [rsp+0x100]
      bf1487:	00 
      bf1488:	48 8d 14 88          	lea    rdx,[rax+rcx*4]
      bf148c:	49 8b 4d 30          	mov    rcx,QWORD PTR [r13+0x30]
      bf1490:	8b 7e 1c             	mov    edi,DWORD PTR [rsi+0x1c]
      bf1493:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
      bf1497:	e8 68 30 00 00       	call   bf4504 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1414a4>
      bf149c:	39 5c 24 5c          	cmp    DWORD PTR [rsp+0x5c],ebx
      bf14a0:	75 6f                	jne    bf1511 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e4b1>
      bf14a2:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      bf14a7:	48 8b 00             	mov    rax,QWORD PTR [rax]
      bf14aa:	80 78 78 00          	cmp    BYTE PTR [rax+0x78],0x0
      bf14ae:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
      bf14b3:	74 61                	je     bf1516 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e4b6>

### 0xbf14b5; FDE=(12521182, 12534473): cmp    BYTE PTR [rbp+0x3b8],0x0
      bf1476:	59                   	pop    rcx
      bf1477:	f7 f9                	idiv   ecx
      bf1479:	4c 63 f0             	movsxd r14,eax
      bf147c:	4b 8d 04 b7          	lea    rax,[r15+r14*4]
      bf1480:	48 8b 8c 24 00 01 00 	mov    rcx,QWORD PTR [rsp+0x100]
      bf1487:	00 
      bf1488:	48 8d 14 88          	lea    rdx,[rax+rcx*4]
      bf148c:	49 8b 4d 30          	mov    rcx,QWORD PTR [r13+0x30]
      bf1490:	8b 7e 1c             	mov    edi,DWORD PTR [rsi+0x1c]
      bf1493:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
      bf1497:	e8 68 30 00 00       	call   bf4504 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1414a4>
      bf149c:	39 5c 24 5c          	cmp    DWORD PTR [rsp+0x5c],ebx
      bf14a0:	75 6f                	jne    bf1511 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e4b1>
      bf14a2:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      bf14a7:	48 8b 00             	mov    rax,QWORD PTR [rax]
      bf14aa:	80 78 78 00          	cmp    BYTE PTR [rax+0x78],0x0
      bf14ae:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
      bf14b3:	74 61                	je     bf1516 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e4b6>
      bf14b5:	80 bd b8 03 00 00 00 	cmp    BYTE PTR [rbp+0x3b8],0x0
      bf14bc:	0f 84 88 0c 00 00    	je     bf214a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f0ea>
      bf14c2:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      bf14c6:	8b 50 04             	mov    edx,DWORD PTR [rax+0x4]
      bf14c9:	85 d2                	test   edx,edx
      bf14cb:	44 8b 74 24 50       	mov    r14d,DWORD PTR [rsp+0x50]
      bf14d0:	7e 2d                	jle    bf14ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e49f>
      bf14d2:	49 8b 75 48          	mov    rsi,QWORD PTR [r13+0x48]
      bf14d6:	48 8b 78 50          	mov    rdi,QWORD PTR [rax+0x50]
      bf14da:	48 c1 e2 02          	shl    rdx,0x2
      bf14de:	e8 ed e5 bf 00       	call   17efad0 <memcpy@plt>
      bf14e3:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      bf14e7:	8b 50 04             	mov    edx,DWORD PTR [rax+0x4]
      bf14ea:	85 d2                	test   edx,edx
      bf14ec:	7e 11                	jle    bf14ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e49f>
      bf14ee:	49 8b 75 60          	mov    rsi,QWORD PTR [r13+0x60]
      bf14f2:	48 8b 78 68          	mov    rdi,QWORD PTR [rax+0x68]
      bf14f6:	48 c1 e2 02          	shl    rdx,0x2
      bf14fa:	e8 d1 e5 bf 00       	call   17efad0 <memcpy@plt>
      bf14ff:	31 db                	xor    ebx,ebx
      bf1501:	eb 53                	jmp    bf1556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e4f6>
      bf1503:	44 29 f5             	sub    ebp,r14d
      bf1506:	89 e8                	mov    eax,ebp
      bf1508:	99                   	cdq
      bf1509:	6a 02                	push   0x2
      bf150b:	59                   	pop    rcx
      bf150c:	f7 f9                	idiv   ecx
      bf150e:	4c 63 f0             	movsxd r14,eax
      bf1511:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]

### 0xbf1549; FDE=(12521182, 12534473): cmp    BYTE PTR [rbp+0x3b8],0x0
      bf150b:	59                   	pop    rcx
      bf150c:	f7 f9                	idiv   ecx
      bf150e:	4c 63 f0             	movsxd r14,eax
      bf1511:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
      bf1516:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
      bf151d:	00 
      bf151e:	8b 5c 24 50          	mov    ebx,DWORD PTR [rsp+0x50]
      bf1522:	89 de                	mov    esi,ebx
      bf1524:	e8 7b 2f 00 00       	call   bf44a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x141444>
      bf1529:	48 8b 00             	mov    rax,QWORD PTR [rax]
      bf152c:	4b 8d 14 b7          	lea    rdx,[r15+r14*4]
      bf1530:	41 89 de             	mov    r14d,ebx
      bf1533:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
      bf1537:	48 8b 49 08          	mov    rcx,QWORD PTR [rcx+0x8]
      bf153b:	8b 78 1c             	mov    edi,DWORD PTR [rax+0x1c]
      bf153e:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
      bf1542:	e8 bd 2f 00 00       	call   bf4504 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1414a4>
      bf1547:	b3 01                	mov    bl,0x1
      bf1549:	80 bd b8 03 00 00 00 	cmp    BYTE PTR [rbp+0x3b8],0x0
      bf1550:	0f 84 07 01 00 00    	je     bf165d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e5fd>
      bf1556:	49 8b 7d 30          	mov    rdi,QWORD PTR [r13+0x30]
      bf155a:	44 89 f6             	mov    esi,r14d
      bf155d:	e8 c5 2f 00 00       	call   bf4527 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1414c7>
      bf1562:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
      bf1569:	00 
      bf156a:	44 89 f6             	mov    esi,r14d
      bf156d:	e8 32 2f 00 00       	call   bf44a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x141444>
      bf1572:	48 8b 00             	mov    rax,QWORD PTR [rax]
      bf1575:	49 8b 75 30          	mov    rsi,QWORD PTR [r13+0x30]
      bf1579:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
      bf157d:	48 8b 51 20          	mov    rdx,QWORD PTR [rcx+0x20]
      bf1581:	48 8b 49 38          	mov    rcx,QWORD PTR [rcx+0x38]
      bf1585:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      bf1589:	e8 b2 ac ff ff       	call   bec240 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1391e0>
      bf158e:	8b 85 e0 02 00 00    	mov    eax,DWORD PTR [rbp+0x2e0]
      bf1594:	85 c0                	test   eax,eax
      bf1596:	b9 00 00 00 00       	mov    ecx,0x0
      bf159b:	0f 4e c1             	cmovle eax,ecx
      bf159e:	48 f7 d8             	neg    rax
      bf15a1:	48 8b 94 24 10 01 00 	mov    rdx,QWORD PTR [rsp+0x110]
      bf15a8:	00 
      bf15a9:	6a ff                	push   0xffffffffffffffff
      bf15ab:	59                   	pop    rcx
      bf15ac:	48 8d 34 08          	lea    rsi,[rax+rcx*1]
      bf15b0:	48 83 fe ff          	cmp    rsi,0xffffffffffffffff
      bf15b4:	0f 84 97 00 00 00    	je     bf1651 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e5f1>
      bf15ba:	48 ff c1             	inc    rcx

### 0xbf1b9f; FDE=(12521182, 12534473): cmp    BYTE PTR [rbp+0x3b8],0x0
      bf1b5a:	48 29 fa             	sub    rdx,rdi
      bf1b5d:	48 89 d1             	mov    rcx,rdx
      bf1b60:	48 c1 e9 02          	shr    rcx,0x2
      bf1b64:	85 c9                	test   ecx,ecx
      bf1b66:	4c 8b b4 24 c8 00 00 	mov    r14,QWORD PTR [rsp+0xc8]
      bf1b6d:	00 
      bf1b6e:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]
      bf1b75:	00 
      bf1b76:	7e 1c                	jle    bf1b94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13eb34>
      bf1b78:	48 8b b0 a0 00 00 00 	mov    rsi,QWORD PTR [rax+0xa0]
      bf1b7f:	48 b8 fc ff ff ff 03 	movabs rax,0x3fffffffc
      bf1b86:	00 00 00 
      bf1b89:	48 21 c2             	and    rdx,rax
      bf1b8c:	e8 3f df bf 00       	call   17efad0 <memcpy@plt>
      bf1b91:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      bf1b94:	49 83 c7 48          	add    r15,0x48
      bf1b98:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
      bf1b9b:	48 83 c1 50          	add    rcx,0x50
      bf1b9f:	80 bd b8 03 00 00 00 	cmp    BYTE PTR [rbp+0x3b8],0x0
      bf1ba6:	48 8b 98 80 00 00 00 	mov    rbx,QWORD PTR [rax+0x80]
      bf1bad:	49 0f 45 cf          	cmovne rcx,r15
      bf1bb1:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
      bf1bb8:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
      bf1bbd:	4c 63 23             	movsxd r12,DWORD PTR [rbx]
      bf1bc0:	45 85 e4             	test   r12d,r12d
      bf1bc3:	41 bf 00 00 00 00    	mov    r15d,0x0
      bf1bc9:	45 0f 4f fc          	cmovg  r15d,r12d
      bf1bcd:	44 89 e5             	mov    ebp,r12d
      bf1bd0:	4d 85 e4             	test   r12,r12
      bf1bd3:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
      bf1bda:	00 
      bf1bdb:	48 89 ac 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rbp
      bf1be2:	00 
      bf1be3:	7e 72                	jle    bf1c57 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13ebf7>
      bf1be5:	4c 8b 29             	mov    r13,QWORD PTR [rcx]
      bf1be8:	45 31 f6             	xor    r14d,r14d
      bf1beb:	45 31 e4             	xor    r12d,r12d
      bf1bee:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
      bf1bf2:	f3 43 0f 10 44 a5 00 	movss  xmm0,DWORD PTR [r13+r12*4+0x0]
      bf1bf9:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      bf1bfc:	4a 8b 04 37          	mov    rax,QWORD PTR [rdi+r14*1]
      bf1c00:	4c 01 f7             	add    rdi,r14
      bf1c03:	ff 50 18             	call   QWORD PTR [rax+0x18]
      bf1c06:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
      bf1c0a:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      bf1c0d:	4a 8b 04 37          	mov    rax,QWORD PTR [rdi+r14*1]
      bf1c11:	4c 01 f7             	add    rdi,r14

### 0xbf224f; FDE=(12521182, 12534473): cmp    BYTE PTR [rdx+0x3b8],0x0
      bf220d:	f7 fe                	idiv   esi
      bf220f:	85 c0                	test   eax,eax
      bf2211:	ba 00 00 00 00       	mov    edx,0x0
      bf2216:	0f 4f d0             	cmovg  edx,eax
      bf2219:	66 0f 57 c0          	xorpd  xmm0,xmm0
      bf221d:	83 ff 02             	cmp    edi,0x2
      bf2220:	7c 10                	jl     bf2232 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f1d2>
      bf2222:	31 f6                	xor    esi,esi
      bf2224:	f3 0f 58 44 b5 04    	addss  xmm0,DWORD PTR [rbp+rsi*4+0x4]
      bf222a:	48 ff c6             	inc    rsi
      bf222d:	48 39 f2             	cmp    rdx,rsi
      bf2230:	75 f2                	jne    bf2224 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f1c4>
      bf2232:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
      bf2237:	83 ba a8 00 00 00 02 	cmp    DWORD PTR [rdx+0xa8],0x2
      bf223e:	40 0f 94 c6          	sete   sil
      bf2242:	48 83 bc 24 80 00 00 	cmp    QWORD PTR [rsp+0x80],0x1
      bf2249:	00 01 
      bf224b:	40 0f 94 c7          	sete   dil
      bf224f:	80 ba b8 03 00 00 00 	cmp    BYTE PTR [rdx+0x3b8],0x0
      bf2256:	49 8b 19             	mov    rbx,QWORD PTR [r9]
      bf2259:	49 8b 90 98 00 00 00 	mov    rdx,QWORD PTR [r8+0x98]
      bf2260:	74 06                	je     bf2268 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f208>
      bf2262:	4c 8b 73 48          	mov    r14,QWORD PTR [rbx+0x48]
      bf2266:	eb 06                	jmp    bf226e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f20e>
      bf2268:	49 89 ee             	mov    r14,rbp
      bf226b:	48 89 d5             	mov    rbp,rdx
      bf226e:	44 8a a3 28 02 00 00 	mov    r12b,BYTE PTR [rbx+0x228]
      bf2275:	45 31 c0             	xor    r8d,r8d
      bf2278:	44 88 83 28 02 00 00 	mov    BYTE PTR [rbx+0x228],r8b
      bf227f:	44 88 83 e0 01 00 00 	mov    BYTE PTR [rbx+0x1e0],r8b
      bf2286:	44 88 83 f8 01 00 00 	mov    BYTE PTR [rbx+0x1f8],r8b
      bf228d:	44 88 83 10 02 00 00 	mov    BYTE PTR [rbx+0x210],r8b
      bf2294:	44 88 83 40 02 00 00 	mov    BYTE PTR [rbx+0x240],r8b
      bf229b:	4c 8b 4c 24 08       	mov    r9,QWORD PTR [rsp+0x8]
      bf22a0:	f2 45 0f 10 81 10 01 	movsd  xmm8,QWORD PTR [r9+0x110]
      bf22a7:	00 00 
      bf22a9:	f2 44 0f 59 05 8e ce 	mulsd  xmm8,QWORD PTR [rip+0xffffffffff79ce8e]        # 38f140 <_ZTSSt12bad_any_cast@@Base-0x1088>
      bf22b0:	79 ff 
      bf22b2:	45 38 81 18 01 00 00 	cmp    BYTE PTR [r9+0x118],r8b
      bf22b9:	0f 84 5e 01 00 00    	je     bf241d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f3bd>
      bf22bf:	6a 01                	push   0x1
      bf22c1:	41 5a                	pop    r10
      bf22c3:	44 89 93 50 01 00 00 	mov    DWORD PTR [rbx+0x150],r10d
      bf22ca:	45 8b 81 c8 01 00 00 	mov    r8d,DWORD PTR [r9+0x1c8]
      bf22d1:	44 89 83 08 01 00 00 	mov    DWORD PTR [rbx+0x108],r8d
      bf22d8:	48 83 a3 10 01 00 00 	and    QWORD PTR [rbx+0x110],0x0
      bf22df:	00 

### 0xc5e395; FDE=(12968332, 12971020): mov    QWORD PTR [rcx+0x3b8],rax
      c5e34f:	48 f7 fb             	idiv   rbx
      c5e352:	49 89 c2             	mov    r10,rax
      c5e355:	48 8d 35 20 3c 7f ff 	lea    rsi,[rip+0xffffffffff7f3c20]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      c5e35c:	48 8d 0d d5 e8 71 ff 	lea    rcx,[rip+0xffffffffff71e8d5]        # 37cc38 <_ZTSSt12bad_any_cast@@Base-0x13590>
      c5e363:	6a 04                	push   0x4
      c5e365:	5f                   	pop    rdi
      c5e366:	ba 99 00 00 00       	mov    edx,0x99
      c5e36b:	45 89 f9             	mov    r9d,r15d
      c5e36e:	31 c0                	xor    eax,eax
      c5e370:	41 ff 75 60          	push   QWORD PTR [r13+0x60]
      c5e374:	41 52                	push   r10
      c5e376:	e8 57 85 b7 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      c5e37b:	48 83 c4 10          	add    rsp,0x10
      c5e37f:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      c5e384:	48 83 b9 b0 03 00 00 	cmp    QWORD PTR [rcx+0x3b0],0x1
      c5e38b:	01 
      c5e38c:	75 0e                	jne    c5e39c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ab33c>
      c5e38e:	48 8b 81 a0 03 00 00 	mov    rax,QWORD PTR [rcx+0x3a0]
      c5e395:	48 89 81 b8 03 00 00 	mov    QWORD PTR [rcx+0x3b8],rax
      c5e39c:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
      c5e3a0:	e8 93 f7 ff ff       	call   c5db38 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1aaad8>
      c5e3a5:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      c5e3aa:	4c 8b 30             	mov    r14,QWORD PTR [rax]
      c5e3ad:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      c5e3b1:	4c 29 f0             	sub    rax,r14
      c5e3b4:	48 99                	cqo
      c5e3b6:	48 f7 fb             	idiv   rbx
      c5e3b9:	41 39 c7             	cmp    r15d,eax
      c5e3bc:	41 0f 4c c7          	cmovl  eax,r15d
      c5e3c0:	85 c0                	test   eax,eax
      c5e3c2:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
      c5e3c7:	0f 84 d4 05 00 00    	je     c5e9a1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ab941>
      c5e3cd:	49 8d 4d 60          	lea    rcx,[r13+0x60]
      c5e3d1:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
      c5e3d6:	48 98                	cdqe
      c5e3d8:	48 69 c0 a8 00 00 00 	imul   rax,rax,0xa8
      c5e3df:	4c 01 f0             	add    rax,r14
      c5e3e2:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      c5e3e7:	49 8d 45 50          	lea    rax,[r13+0x50]
      c5e3eb:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      c5e3f0:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]
      c5e3f7:	00 
      c5e3f8:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      c5e3fd:	f6 45 00 01          	test   BYTE PTR [rbp+0x0],0x1
      c5e401:	4c 89 fb             	mov    rbx,r15
      c5e404:	74 04                	je     c5e40a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ab3aa>
      c5e406:	48 8b 5d 10          	mov    rbx,QWORD PTR [rbp+0x10]

### 0xc5f527; FDE=(12972618, 12978686): mov    QWORD PTR [rbx+0x3b8],rbp
      c5f4d7:	6a 18                	push   0x18
      c5f4d9:	5e                   	pop    rsi
      c5f4da:	48 f7 f6             	div    rsi
      c5f4dd:	48 69 fa a8 00 00 00 	imul   rdi,rdx,0xa8
      c5f4e4:	48 03 3c c1          	add    rdi,QWORD PTR [rcx+rax*8]
      c5f4e8:	e8 55 98 ff ff       	call   c58d42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a5ce2>
      c5f4ed:	f3 41 0f 6f 44 24 58 	movdqu xmm0,XMMWORD PTR [r12+0x58]
      c5f4f4:	66 0f d4 05 54 e9 72 	paddq  xmm0,XMMWORD PTR [rip+0xffffffffff72e954]        # 38de50 <_ZTSSt12bad_any_cast@@Base-0x2378>
      c5f4fb:	ff 
      c5f4fc:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
      c5f503:	66 48 0f 7e c0       	movq   rax,xmm0
      c5f508:	48 83 f8 30          	cmp    rax,0x30
      c5f50c:	72 19                	jb     c5f527 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ac4c7>
      c5f50e:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
      c5f513:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c5f516:	e8 05 ea b8 00       	call   17edf20 <_ZdlPv@plt>
      c5f51b:	49 83 44 24 40 08    	add    QWORD PTR [r12+0x40],0x8
      c5f521:	49 83 44 24 58 e8    	add    QWORD PTR [r12+0x58],0xffffffffffffffe8
      c5f527:	48 89 ab b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],rbp
      c5f52e:	4c 8d a4 24 00 02 00 	lea    r12,[rsp+0x200]
      c5f535:	00 
      c5f536:	4c 89 e7             	mov    rdi,r12
      c5f539:	4c 89 fe             	mov    rsi,r15
      c5f53c:	e8 ff e9 b8 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      c5f541:	4c 8d bc 24 18 02 00 	lea    r15,[rsp+0x218]
      c5f548:	00 
      c5f549:	4c 89 ff             	mov    rdi,r15
      c5f54c:	48 8d ac 24 90 06 00 	lea    rbp,[rsp+0x690]
      c5f553:	00 
      c5f554:	48 89 ee             	mov    rsi,rbp
      c5f557:	e8 6e 96 ff ff       	call   c58bca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a5b6a>
      c5f55c:	48 8b 84 24 10 02 00 	mov    rax,QWORD PTR [rsp+0x210]
      c5f563:	00 
      c5f564:	48 89 84 24 20 03 00 	mov    QWORD PTR [rsp+0x320],rax
      c5f56b:	00 
      c5f56c:	0f 28 84 24 00 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x200]
      c5f573:	00 
      c5f574:	0f 29 84 24 10 03 00 	movaps XMMWORD PTR [rsp+0x310],xmm0
      c5f57b:	00 
      c5f57c:	0f 57 c0             	xorps  xmm0,xmm0
      c5f57f:	0f 29 84 24 00 02 00 	movaps XMMWORD PTR [rsp+0x200],xmm0
      c5f586:	00 
      c5f587:	48 83 a4 24 10 02 00 	and    QWORD PTR [rsp+0x210],0x0
      c5f58e:	00 00 
      c5f590:	48 8d bc 24 28 03 00 	lea    rdi,[rsp+0x328]
      c5f597:	00 
      c5f598:	4c 89 fe             	mov    rsi,r15

### 0xd25279; FDE=(13782062, 13785944): mov    QWORD PTR [rsp+0x3b8],rax
      d2522a:	00 
      d2522b:	6a 02                	push   0x2
      d2522d:	5f                   	pop    rdi
      d2522e:	48 8d 35 47 cd 72 ff 	lea    rsi,[rip+0xffffffffff72cd47]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      d25235:	ba 48 01 00 00       	mov    edx,0x148
      d2523a:	48 8d 0d e9 71 63 ff 	lea    rcx,[rip+0xffffffffff6371e9]        # 35c42a <_ZTSSt12bad_any_cast@@Base-0x33d9e>
      d25241:	31 c0                	xor    eax,eax
      d25243:	e8 8a 16 ab 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      d25248:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      d2524d:	48 8d b4 24 c8 01 00 	lea    rsi,[rsp+0x1c8]
      d25254:	00 
      d25255:	e8 d0 52 9a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
      d2525a:	48 83 a4 24 a8 03 00 	and    QWORD PTR [rsp+0x3a8],0x0
      d25261:	00 00 
      d25263:	48 8d 05 56 ef b6 00 	lea    rax,[rip+0xb6ef56]        # 18941c0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1100>
      d2526a:	48 89 84 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],rax
      d25271:	00 
      d25272:	48 8d 05 7f a5 71 ff 	lea    rax,[rip+0xffffffffff71a57f]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      d25279:	48 89 84 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rax
      d25280:	00 
      d25281:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
      d25288:	00 
      d25289:	48 89 84 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],rax
      d25290:	00 
      d25291:	83 a4 24 d0 03 00 00 	and    DWORD PTR [rsp+0x3d0],0x0
      d25298:	00 
      d25299:	48 c7 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],0x1
      d252a0:	00 01 00 00 00 
      d252a5:	48 8d bc 24 b8 03 00 	lea    rdi,[rsp+0x3b8]
      d252ac:	00 
      d252ad:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
      d252b4:	00 
      d252b5:	31 d2                	xor    edx,edx
      d252b7:	e8 d6 04 a4 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      d252bc:	83 a4 24 d0 03 00 00 	and    DWORD PTR [rsp+0x3d0],0x0
      d252c3:	00 
      d252c4:	8b 84 24 b0 03 00 00 	mov    eax,DWORD PTR [rsp+0x3b0]
      d252cb:	89 c1                	mov    ecx,eax
      d252cd:	83 c9 08             	or     ecx,0x8
      d252d0:	89 8c 24 b0 03 00 00 	mov    DWORD PTR [rsp+0x3b0],ecx
      d252d7:	0f b6 4c 24 78       	movzx  ecx,BYTE PTR [rsp+0x78]
      d252dc:	f6 c1 01             	test   cl,0x1
      d252df:	74 3e                	je     d2531f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2722bf>
      d252e1:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]
      d252e8:	00 
      d252e9:	eb 36                	jmp    d25321 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2722c1>
      d252eb:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]

### 0xd6b5db; FDE=(14068377, 14086279): mov    DWORD PTR [rbx+0x3b8],0x3f800000
      d6b587:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
      d6b58e:	00 
      d6b58f:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
      d6b596:	00 
      d6b597:	48 89 83 f8 02 00 00 	mov    QWORD PTR [rbx+0x2f8],rax
      d6b59e:	48 8d 83 00 03 00 00 	lea    rax,[rbx+0x300]
      d6b5a5:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
      d6b5ac:	00 
      d6b5ad:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      d6b5b2:	48 89 83 00 03 00 00 	mov    QWORD PTR [rbx+0x300],rax
      d6b5b9:	31 c0                	xor    eax,eax
      d6b5bb:	88 83 08 03 00 00    	mov    BYTE PTR [rbx+0x308],al
      d6b5c1:	88 83 90 03 00 00    	mov    BYTE PTR [rbx+0x390],al
      d6b5c7:	66 0f ef c0          	pxor   xmm0,xmm0
      d6b5cb:	f3 0f 7f 83 98 03 00 	movdqu XMMWORD PTR [rbx+0x398],xmm0
      d6b5d2:	00 
      d6b5d3:	f3 0f 7f 83 a8 03 00 	movdqu XMMWORD PTR [rbx+0x3a8],xmm0
      d6b5da:	00 
      d6b5db:	c7 83 b8 03 00 00 00 	mov    DWORD PTR [rbx+0x3b8],0x3f800000
      d6b5e2:	00 80 3f 
      d6b5e5:	48 8d bb c0 03 00 00 	lea    rdi,[rbx+0x3c0]
      d6b5ec:	48 8d 05 0d bb ab 00 	lea    rax,[rip+0xabbb0d]        # 1827100 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3730>
      d6b5f3:	48 89 84 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rax
      d6b5fa:	00 
      d6b5fb:	48 89 9c 24 28 08 00 	mov    QWORD PTR [rsp+0x828],rbx
      d6b602:	00 
      d6b603:	4c 89 a4 24 40 08 00 	mov    QWORD PTR [rsp+0x840],r12
      d6b60a:	00 
      d6b60b:	48 8d 05 36 bb ab 00 	lea    rax,[rip+0xabbb36]        # 1827148 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3778>
      d6b612:	48 89 84 24 c0 07 00 	mov    QWORD PTR [rsp+0x7c0],rax
      d6b619:	00 
      d6b61a:	48 89 9c 24 c8 07 00 	mov    QWORD PTR [rsp+0x7c8],rbx
      d6b621:	00 
      d6b622:	4c 89 bc 24 e0 07 00 	mov    QWORD PTR [rsp+0x7e0],r15
      d6b629:	00 
      d6b62a:	48 8d b4 24 e0 06 00 	lea    rsi,[rsp+0x6e0]
      d6b631:	00 
      d6b632:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      d6b637:	4c 89 e2             	mov    rdx,r12
      d6b63a:	4c 89 f9             	mov    rcx,r15
      d6b63d:	ff 56 18             	call   QWORD PTR [rsi+0x18]
      d6b640:	48 8d bc 24 c0 07 00 	lea    rdi,[rsp+0x7c0]
      d6b647:	00 
      d6b648:	e8 1d e9 d0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d6b64d:	4c 8d b4 24 20 08 00 	lea    r14,[rsp+0x820]
      d6b654:	00 
      d6b655:	4c 89 f7             	mov    rdi,r14

### 0xd6cad8; FDE=(14068377, 14086279): mov    QWORD PTR [rsp+0x3b8],rdx
      d6ca88:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
      d6ca8d:	e8 15 b8 d3 ff       	call   aa82a7 <JNI_OnUnload@@Base+0x2fb74>
      d6ca92:	48 8d bc 24 f0 03 00 	lea    rdi,[rsp+0x3f0]
      d6ca99:	00 
      d6ca9a:	48 8d b4 24 d8 03 00 	lea    rsi,[rsp+0x3d8]
      d6caa1:	00 
      d6caa2:	e8 99 14 a8 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d6caa7:	48 8b 94 24 d8 00 00 	mov    rdx,QWORD PTR [rsp+0xd8]
      d6caae:	00 
      d6caaf:	48 8b 1a             	mov    rbx,QWORD PTR [rdx]
      d6cab2:	48 8b 83 88 00 00 00 	mov    rax,QWORD PTR [rbx+0x88]
      d6cab9:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
      d6cabe:	48 8d 05 5b a7 ab 00 	lea    rax,[rip+0xaba75b]        # 1827220 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3850>
      d6cac5:	48 8d 8c 24 30 07 00 	lea    rcx,[rsp+0x730]
      d6cacc:	00 
      d6cacd:	48 89 01             	mov    QWORD PTR [rcx],rax
      d6cad0:	48 89 51 08          	mov    QWORD PTR [rcx+0x8],rdx
      d6cad4:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      d6cad8:	48 89 94 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rdx
      d6cadf:	00 
      d6cae0:	4c 8d b4 24 c0 04 00 	lea    r14,[rsp+0x4c0]
      d6cae7:	00 
      d6cae8:	48 8d b4 24 f0 03 00 	lea    rsi,[rsp+0x3f0]
      d6caef:	00 
      d6caf0:	4c 89 f7             	mov    rdi,r14
      d6caf3:	e8 32 12 a4 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>
      d6caf8:	48 8b 84 24 c8 04 00 	mov    rax,QWORD PTR [rsp+0x4c8]
      d6caff:	00 
      d6cb00:	80 78 14 00          	cmp    BYTE PTR [rax+0x14],0x0
      d6cb04:	0f 85 1f 0d 00 00    	jne    d6d829 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a8af>
      d6cb0a:	48 8d 83 a8 0b 00 00 	lea    rax,[rbx+0xba8]
      d6cb11:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      d6cb18:	00 
      d6cb19:	48 8d 8c 24 a8 04 00 	lea    rcx,[rsp+0x4a8]
      d6cb20:	00 
      d6cb21:	66 c7 41 d8 01 00    	mov    WORD PTR [rcx-0x28],0x1
      d6cb27:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0
      d6cb2c:	83 61 e8 00          	and    DWORD PTR [rcx-0x18],0x0
      d6cb30:	4c 89 71 f0          	mov    QWORD PTR [rcx-0x10],r14
      d6cb34:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      d6cb38:	48 89 69 08          	mov    QWORD PTR [rcx+0x8],rbp
      d6cb3c:	48 b8 01 00 00 00 40 	movabs rax,0x4000000001
      d6cb43:	00 00 00 
      d6cb46:	48 89 41 f8          	mov    QWORD PTR [rcx-0x8],rax
      d6cb4a:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      d6cb4d:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      d6cb54:	00 

### 0xd9e076; FDE=(14278746, 14279386): mov    QWORD PTR [rsp+0x3b8],rax
      d9e041:	5d                   	pop    rbp
      d9e042:	c3                   	ret
      d9e043:	e8 68 1a a5 00       	call   17efab0 <__stack_chk_fail@plt>
      d9e048:	53                   	push   rbx
      d9e049:	48 89 fb             	mov    rbx,rdi
      d9e04c:	e8 8b ad ff ff       	call   d98ddc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65e62>
      d9e051:	48 89 df             	mov    rdi,rbx
      d9e054:	5b                   	pop    rbx
      d9e055:	e9 c6 fe a4 00       	jmp    17edf20 <_ZdlPv@plt>
      d9e05a:	41 57                	push   r15
      d9e05c:	41 56                	push   r14
      d9e05e:	41 55                	push   r13
      d9e060:	41 54                	push   r12
      d9e062:	53                   	push   rbx
      d9e063:	48 81 ec c0 03 00 00 	sub    rsp,0x3c0
      d9e06a:	48 89 fb             	mov    rbx,rdi
      d9e06d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d9e074:	00 00 
      d9e076:	48 89 84 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rax
      d9e07d:	00 
      d9e07e:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      d9e082:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9e085:	ff 90 f8 00 00 00    	call   QWORD PTR [rax+0xf8]
      d9e08b:	49 89 c6             	mov    r14,rax
      d9e08e:	4c 8d bb 90 00 00 00 	lea    r15,[rbx+0x90]
      d9e095:	48 8b 00             	mov    rax,QWORD PTR [rax]
      d9e098:	6a 0e                	push   0xe
      d9e09a:	5e                   	pop    rsi
      d9e09b:	4c 89 f7             	mov    rdi,r14
      d9e09e:	4c 89 fa             	mov    rdx,r15
      d9e0a1:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
      d9e0a7:	84 c0                	test   al,al
      d9e0a9:	75 41                	jne    d9e0ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6b172>
      d9e0ab:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d9e0ae:	6a 0e                	push   0xe
      d9e0b0:	5e                   	pop    rsi
      d9e0b1:	4c 89 f7             	mov    rdi,r14
      d9e0b4:	4c 89 fa             	mov    rdx,r15
      d9e0b7:	ff 50 58             	call   QWORD PTR [rax+0x58]
      d9e0ba:	84 d2                	test   dl,dl
      d9e0bc:	0f 84 7d 01 00 00    	je     d9e23f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6b2c5>
      d9e0c2:	49 89 c4             	mov    r12,rax
      d9e0c5:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d9e0c8:	6a 0e                	push   0xe
      d9e0ca:	5e                   	pop    rsi
      d9e0cb:	4c 89 f7             	mov    rdi,r14
      d9e0ce:	ff 50 70             	call   QWORD PTR [rax+0x70]

### 0xde78dc; FDE=(14579182, 14583796): mov    BYTE PTR [rsp+0x3b8],al
      de788d:	49 83 c4 e8          	add    r12,0xffffffffffffffe8
      de7891:	49 83 fc e8          	cmp    r12,0xffffffffffffffe8
      de7895:	75 e6                	jne    de787d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb4903>
      de7897:	66 0f ef c0          	pxor   xmm0,xmm0
      de789b:	66 0f 7f 84 24 60 03 	movdqa XMMWORD PTR [rsp+0x360],xmm0
      de78a2:	00 00 
      de78a4:	66 0f 7f 84 24 70 03 	movdqa XMMWORD PTR [rsp+0x370],xmm0
      de78ab:	00 00 
      de78ad:	83 a4 24 80 03 00 00 	and    DWORD PTR [rsp+0x380],0x0
      de78b4:	00 
      de78b5:	c6 84 24 84 03 00 00 	mov    BYTE PTR [rsp+0x384],0x1
      de78bc:	01 
      de78bd:	83 a4 24 88 03 00 00 	and    DWORD PTR [rsp+0x388],0x0
      de78c4:	00 
      de78c5:	31 c0                	xor    eax,eax
      de78c7:	88 84 24 8c 03 00 00 	mov    BYTE PTR [rsp+0x38c],al
      de78ce:	88 84 24 ac 03 00 00 	mov    BYTE PTR [rsp+0x3ac],al
      de78d5:	88 84 24 b0 03 00 00 	mov    BYTE PTR [rsp+0x3b0],al
      de78dc:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
      de78e3:	88 84 24 d0 03 00 00 	mov    BYTE PTR [rsp+0x3d0],al
      de78ea:	66 c7 84 24 d8 03 00 	mov    WORD PTR [rsp+0x3d8],0x100
      de78f1:	00 00 01 
      de78f4:	66 0f 7f 84 24 90 03 	movdqa XMMWORD PTR [rsp+0x390],xmm0
      de78fb:	00 00 
      de78fd:	f3 0f 7f 84 24 99 03 	movdqu XMMWORD PTR [rsp+0x399],xmm0
      de7904:	00 00 
      de7906:	48 8d bc 24 20 08 00 	lea    rdi,[rsp+0x820]
      de790d:	00 
      de790e:	e8 7d 65 a0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      de7913:	49 8d 77 30          	lea    rsi,[r15+0x30]
      de7917:	48 8d bc 24 20 0b 00 	lea    rdi,[rsp+0xb20]
      de791e:	00 
      de791f:	e8 1c 66 a0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      de7924:	48 8d bc 24 88 02 00 	lea    rdi,[rsp+0x288]
      de792b:	00 
      de792c:	4c 8d a4 24 20 0b 00 	lea    r12,[rsp+0xb20]
      de7933:	00 
      de7934:	4c 89 e6             	mov    rsi,r12
      de7937:	e8 f2 40 c9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      de793c:	4c 89 e7             	mov    rdi,r12
      de793f:	e8 4c 65 a0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      de7944:	49 8d b7 a8 02 00 00 	lea    rsi,[r15+0x2a8]
      de794b:	4c 89 ef             	mov    rdi,r13
      de794e:	e8 2d 67 a0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      de7953:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      de795a:	00 
      de795b:	48 89 de             	mov    rsi,rbx

### 0xdf1a54; FDE=(14621006, 14622676): mov    QWORD PTR [rsp+0x3b8],r13
      df1a0c:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
      df1a13:	00 
      df1a14:	4c 89 ac 24 78 03 00 	mov    QWORD PTR [rsp+0x378],r13
      df1a1b:	00 
      df1a1c:	4c 89 ac 24 80 03 00 	mov    QWORD PTR [rsp+0x380],r13
      df1a23:	00 
      df1a24:	4c 89 ac 24 88 03 00 	mov    QWORD PTR [rsp+0x388],r13
      df1a2b:	00 
      df1a2c:	4c 89 ac 24 90 03 00 	mov    QWORD PTR [rsp+0x390],r13
      df1a33:	00 
      df1a34:	4c 89 ac 24 98 03 00 	mov    QWORD PTR [rsp+0x398],r13
      df1a3b:	00 
      df1a3c:	4c 89 ac 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],r13
      df1a43:	00 
      df1a44:	4c 89 ac 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],r13
      df1a4b:	00 
      df1a4c:	4c 89 ac 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],r13
      df1a53:	00 
      df1a54:	4c 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r13
      df1a5b:	00 
      df1a5c:	4c 89 ac 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],r13
      df1a63:	00 
      df1a64:	4c 89 ac 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r13
      df1a6b:	00 
      df1a6c:	4c 89 ac 24 d0 03 00 	mov    QWORD PTR [rsp+0x3d0],r13
      df1a73:	00 
      df1a74:	4c 89 ac 24 d8 03 00 	mov    QWORD PTR [rsp+0x3d8],r13
      df1a7b:	00 
      df1a7c:	c6 84 24 e0 03 00 00 	mov    BYTE PTR [rsp+0x3e0],0x0
      df1a83:	00 
      df1a84:	48 c7 84 24 70 03 00 	mov    QWORD PTR [rsp+0x370],0x1
      df1a8b:	00 01 00 00 00 
      df1a90:	48 8d bc 24 78 03 00 	lea    rdi,[rsp+0x378]
      df1a97:	00 
      df1a98:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      df1a9d:	31 d2                	xor    edx,edx
      df1a9f:	e8 ee 3c 97 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      df1aa4:	41 8b 86 8c fd ff ff 	mov    eax,DWORD PTR [r14-0x274]
      df1aab:	48 8d 35 66 01 66 ff 	lea    rsi,[rip+0xffffffffff660166]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      df1ab2:	48 83 f8 03          	cmp    rax,0x3
      df1ab6:	77 0e                	ja     df1ac6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbeb4c>
      df1ab8:	48 8d 0d 51 14 5e ff 	lea    rcx,[rip+0xffffffffff5e1451]        # 3d2f10 <_ZTSN5boost17bad_function_callE@@Base+0x256>
      df1abf:	48 63 34 81          	movsxd rsi,DWORD PTR [rcx+rax*4]
      df1ac3:	48 01 ce             	add    rsi,rcx
      df1ac6:	80 8c 24 70 03 00 00 	or     BYTE PTR [rsp+0x370],0x2
      df1acd:	02 
      df1ace:	48 8b 94 24 68 03 00 	mov    rdx,QWORD PTR [rsp+0x368]

### 0xdf579c; FDE=(14636292, 14637501): mov    QWORD PTR [rsp+0x3b8],rcx
      df5753:	48 29 d8             	sub    rax,rbx
      df5756:	0f 84 89 00 00 00    	je     df57e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc286b>
      df575c:	bd e0 02 00 00       	mov    ebp,0x2e0
      df5761:	48 99                	cqo
      df5763:	48 f7 fd             	idiv   rbp
      df5766:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      df576b:	48 89 c6             	mov    rsi,rax
      df576e:	e8 2b 03 00 00       	call   df5a9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2b24>
      df5773:	48 8d 44 24 30       	lea    rax,[rsp+0x30]
      df5778:	4c 8b 60 f8          	mov    r12,QWORD PTR [rax-0x8]
      df577c:	48 8d 4c 24 48       	lea    rcx,[rsp+0x48]
      df5781:	4c 89 21             	mov    QWORD PTR [rcx],r12
      df5784:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
      df5789:	4c 89 22             	mov    QWORD PTR [rdx],r12
      df578c:	48 89 84 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],rax
      df5793:	00 
      df5794:	48 89 94 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rdx
      df579b:	00 
      df579c:	48 89 8c 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rcx
      df57a3:	00 
      df57a4:	c6 84 24 c0 03 00 00 	mov    BYTE PTR [rsp+0x3c0],0x0
      df57ab:	00 
      df57ac:	4d 89 e6             	mov    r14,r12
      df57af:	4c 89 f7             	mov    rdi,r14
      df57b2:	48 89 de             	mov    rsi,rbx
      df57b5:	e8 ce ea 6a 00       	call   14a4288 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e980c>
      df57ba:	48 01 eb             	add    rbx,rbp
      df57bd:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      df57c2:	49 01 ee             	add    r14,rbp
      df57c5:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
      df57ca:	4c 39 eb             	cmp    rbx,r13
      df57cd:	75 e0                	jne    df57af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2835>
      df57cf:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
      df57d6:	00 
      df57d7:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
      df57db:	e8 f6 02 00 00       	call   df5ad6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2b5c>
      df57e0:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
      df57e5:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
      df57ec:	00 
      df57ed:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
      df57f1:	e8 18 03 00 00       	call   df5b0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2b94>
      df57f6:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      df57fb:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
      df5802:	00 
      df5803:	48 2b 84 24 90 00 00 	sub    rax,QWORD PTR [rsp+0x90]
      df580a:	00 
      df580b:	b9 e0 02 00 00       	mov    ecx,0x2e0

### 0xdf878e; FDE=(14645486, 14651961): mov    QWORD PTR [rsp+0x3b8],rbp
      df8744:	49 89 6d 20          	mov    QWORD PTR [r13+0x20],rbp
      df8748:	49 83 65 28 00       	and    QWORD PTR [r13+0x28],0x0
      df874d:	49 83 c4 30          	add    r12,0x30
      df8751:	4c 89 e7             	mov    rdi,r12
      df8754:	e8 dd 30 c8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      df8759:	4c 89 ef             	mov    rdi,r13
      df875c:	48 89 c6             	mov    rsi,rax
      df875f:	e8 ee 70 98 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
      df8764:	0f 57 c0             	xorps  xmm0,xmm0
      df8767:	84 c0                	test   al,al
      df8769:	0f 84 25 02 00 00    	je     df8994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a1a>
      df876f:	0f 11 84 24 a0 03 00 	movups XMMWORD PTR [rsp+0x3a0],xmm0
      df8776:	00 
      df8777:	48 8d 05 3a e1 a7 00 	lea    rax,[rip+0xa7e13a]        # 18768b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32fa0>
      df877e:	48 89 84 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rax
      df8785:	00 
      df8786:	48 89 ac 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rbp
      df878d:	00 
      df878e:	48 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rbp
      df8795:	00 
      df8796:	48 83 a4 24 c0 03 00 	and    QWORD PTR [rsp+0x3c0],0x0
      df879d:	00 00 
      df879f:	48 8b 84 24 88 02 00 	mov    rax,QWORD PTR [rsp+0x288]
      df87a6:	00 
      df87a7:	a8 01                	test   al,0x1
      df87a9:	0f 85 57 0a 00 00    	jne    df9206 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc628c>
      df87af:	48 85 c0             	test   rax,rax
      df87b2:	0f 84 0b 09 00 00    	je     df90c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6149>
      df87b8:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
      df87bf:	00 
      df87c0:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
      df87c7:	00 
      df87c8:	e8 93 62 95 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
      df87cd:	e9 29 09 00 00       	jmp    df90fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6181>
      df87d2:	4c 8d ac 24 80 02 00 	lea    r13,[rsp+0x280]
      df87d9:	00 
      df87da:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
      df87df:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0
      df87e4:	48 8d 05 4d 05 ab 00 	lea    rax,[rip+0xab054d]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>
      df87eb:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      df87ef:	49 83 c4 30          	add    r12,0x30
      df87f3:	4c 89 e7             	mov    rdi,r12
      df87f6:	e8 3b 30 c8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      df87fb:	4c 89 ef             	mov    rdi,r13
      df87fe:	48 89 c6             	mov    rsi,rax
      df8801:	e8 4c 70 98 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
      df8806:	84 c0                	test   al,al

### 0xe0d7fb; FDE=(14734888, 14746893): cmp    BYTE PTR [r14+0x3b8],0x0
      e0d7b6:	e8 9d 67 f2 ff       	call   d33f58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfde>
      e0d7bb:	0f b6 53 18          	movzx  edx,BYTE PTR [rbx+0x18]
      e0d7bf:	4c 89 f7             	mov    rdi,r14
      e0d7c2:	48 89 de             	mov    rsi,rbx
      e0d7c5:	e8 15 7e 02 00       	call   e355df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102665>
      e0d7ca:	89 c5                	mov    ebp,eax
      e0d7cc:	4c 89 f7             	mov    rdi,r14
      e0d7cf:	e8 bc 06 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e0d7d4:	48 83 c3 20          	add    rbx,0x20
      e0d7d8:	40 84 ed             	test   bpl,bpl
      e0d7db:	74 bc                	je     e0d799 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda81f>
      e0d7dd:	eb 78                	jmp    e0d857 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda8dd>
      e0d7df:	41 80 be a0 02 00 00 	cmp    BYTE PTR [r14+0x2a0],0x0
      e0d7e6:	00 
      e0d7e7:	75 12                	jne    e0d7fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda881>
      e0d7e9:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e0d7ee:	80 b8 78 03 00 00 00 	cmp    BYTE PTR [rax+0x378],0x0
      e0d7f5:	0f 85 a8 07 00 00    	jne    e0dfa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdb029>
      e0d7fb:	41 80 be b8 03 00 00 	cmp    BYTE PTR [r14+0x3b8],0x0
      e0d802:	00 
      e0d803:	74 0c                	je     e0d811 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda897>
      e0d805:	b3 01                	mov    bl,0x1
      e0d807:	41 80 be b9 03 00 00 	cmp    BYTE PTR [r14+0x3b9],0x0
      e0d80e:	00 
      e0d80f:	75 15                	jne    e0d826 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda8ac>
      e0d811:	49 8b b6 a0 00 00 00 	mov    rsi,QWORD PTR [r14+0xa0]
      e0d818:	41 8b be 98 00 00 00 	mov    edi,DWORD PTR [r14+0x98]
      e0d81f:	e8 06 5f e6 ff       	call   c7372a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c06ca>
      e0d824:	89 c3                	mov    ebx,eax
      e0d826:	41 80 be d8 00 00 00 	cmp    BYTE PTR [r14+0xd8],0x0
      e0d82d:	00 
      e0d82e:	0f 84 60 02 00 00    	je     e0da94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdab1a>
      e0d834:	49 69 86 d0 00 00 00 	imul   rax,QWORD PTR [r14+0xd0],0x3b9aca00
      e0d83b:	00 ca 9a 3b 
      e0d83f:	49 03 86 90 03 00 00 	add    rax,QWORD PTR [r14+0x390]
      e0d846:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      e0d84b:	40 0f 9d c5          	setge  bpl
      e0d84f:	e9 43 02 00 00       	jmp    e0da97 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdab1d>
      e0d854:	45 31 ed             	xor    r13d,r13d
      e0d857:	4d 8b 7c 24 38       	mov    r15,QWORD PTR [r12+0x38]
      e0d85c:	40 b5 01             	mov    bpl,0x1
      e0d85f:	49 81 bf 30 01 00 00 	cmp    QWORD PTR [r15+0x130],0x1f3
      e0d866:	f3 01 00 00 
      e0d86a:	77 20                	ja     e0d88c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda912>
      e0d86c:	41 80 bf 08 01 00 00 	cmp    BYTE PTR [r15+0x108],0x0
      e0d873:	00 
      e0d874:	74 14                	je     e0d88a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda910>

### 0xe12daa; FDE=(14756822, 14758744): cmp    BYTE PTR [rax+0x3b8],0x0
      e12d63:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      e12d68:	48 89 de             	mov    rsi,rbx
      e12d6b:	e8 d0 b1 9d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e12d70:	eb 0d                	jmp    e12d7f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfe05>
      e12d72:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      e12d77:	48 89 de             	mov    rsi,rbx
      e12d7a:	e8 17 19 00 00       	call   e14696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe171c>
      e12d7f:	41 80 7d 48 00       	cmp    BYTE PTR [r13+0x48],0x0
      e12d84:	74 0f                	je     e12d95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfe1b>
      e12d86:	41 8b 45 00          	mov    eax,DWORD PTR [r13+0x0]
      e12d8a:	89 84 24 f0 00 00 00 	mov    DWORD PTR [rsp+0xf0],eax
      e12d91:	b0 01                	mov    al,0x1
      e12d93:	eb 0a                	jmp    e12d9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfe25>
      e12d95:	c6 84 24 f0 00 00 00 	mov    BYTE PTR [rsp+0xf0],0x0
      e12d9c:	00 
      e12d9d:	31 c0                	xor    eax,eax
      e12d9f:	88 84 24 f4 00 00 00 	mov    BYTE PTR [rsp+0xf4],al
      e12da6:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      e12daa:	80 b8 b8 03 00 00 00 	cmp    BYTE PTR [rax+0x3b8],0x0
      e12db1:	74 37                	je     e12dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfe70>
      e12db3:	49 8d b4 24 10 01 00 	lea    rsi,[r12+0x110]
      e12dba:	00 
      e12dbb:	48 8d 9c 24 f8 00 00 	lea    rbx,[rsp+0xf8]
      e12dc2:	00 
      e12dc3:	48 89 df             	mov    rdi,rbx
      e12dc6:	e8 ef 3c fe ff       	call   df6aba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3b40>
      e12dcb:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      e12dd0:	48 8d 94 24 f0 00 00 	lea    rdx,[rsp+0xf0]
      e12dd7:	00 
      e12dd8:	48 89 de             	mov    rsi,rbx
      e12ddb:	e8 19 9c ff ff       	call   e0c9f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9a7f>
      e12de0:	48 89 df             	mov    rdi,rbx
      e12de3:	e8 a8 b0 9d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e12de8:	eb 12                	jmp    e12dfc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfe82>
      e12dea:	49 8d b4 24 10 01 00 	lea    rsi,[r12+0x110]
      e12df1:	00 
      e12df2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      e12df7:	e8 44 b1 9d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e12dfc:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
      e12e03:	00 
      e12e04:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      e12e09:	e8 ac 3c fe ff       	call   df6aba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3b40>
      e12e0e:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      e12e13:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
      e12e18:	48 8d 54 24 58       	lea    rdx,[rsp+0x58]
      e12e1d:	e8 db e1 d7 ff       	call   b90ffd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xddf9d>
      e12e22:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]

### 0xe3aafb; FDE=(14919980, 14920497): mov    WORD PTR [rbx+0x3b8],0x1
      e3aaa6:	48 83 a3 70 03 00 00 	and    QWORD PTR [rbx+0x370],0x0
      e3aaad:	00 
      e3aaae:	ba 91 00 00 00       	mov    edx,0x91
      e3aab3:	31 f6                	xor    esi,esi
      e3aab5:	e8 d6 40 9b 00       	call   17eeb90 <memset@plt>
      e3aaba:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e3aabd:	48 89 83 78 03 00 00 	mov    QWORD PTR [rbx+0x378],rax
      e3aac4:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
      e3aac8:	48 89 83 80 03 00 00 	mov    QWORD PTR [rbx+0x380],rax
      e3aacf:	0f 57 c0             	xorps  xmm0,xmm0
      e3aad2:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
      e3aad6:	e8 75 36 9b 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
      e3aadb:	48 89 83 88 03 00 00 	mov    QWORD PTR [rbx+0x388],rax
      e3aae2:	48 83 a3 b0 03 00 00 	and    QWORD PTR [rbx+0x3b0],0x0
      e3aae9:	00 
      e3aaea:	0f 57 c0             	xorps  xmm0,xmm0
      e3aaed:	0f 29 83 90 03 00 00 	movaps XMMWORD PTR [rbx+0x390],xmm0
      e3aaf4:	0f 29 83 a0 03 00 00 	movaps XMMWORD PTR [rbx+0x3a0],xmm0
      e3aafb:	66 c7 83 b8 03 00 00 	mov    WORD PTR [rbx+0x3b8],0x1
      e3ab02:	01 00 
      e3ab04:	48 8d bb c0 03 00 00 	lea    rdi,[rbx+0x3c0]
      e3ab0b:	e8 ce 20 dc ff       	call   bfcbde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x149b7e>
      e3ab10:	40 88 ab d0 03 00 00 	mov    BYTE PTR [rbx+0x3d0],bpl
      e3ab17:	40 88 ab d4 03 00 00 	mov    BYTE PTR [rbx+0x3d4],bpl
      e3ab1e:	48 83 a3 d8 03 00 00 	and    QWORD PTR [rbx+0x3d8],0x0
      e3ab25:	00 
      e3ab26:	48 83 c4 08          	add    rsp,0x8
      e3ab2a:	5b                   	pop    rbx
      e3ab2b:	41 5e                	pop    r14
      e3ab2d:	41 5f                	pop    r15
      e3ab2f:	5d                   	pop    rbp
      e3ab30:	c3                   	ret
      e3ab31:	cc                   	int3
      e3ab32:	53                   	push   rbx
      e3ab33:	48 89 fb             	mov    rbx,rdi
      e3ab36:	48 8d 05 db 34 9f 00 	lea    rax,[rip+0x9f34db]        # 182e018 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa648>
      e3ab3d:	48 89 07             	mov    QWORD PTR [rdi],rax
      e3ab40:	48 8b bf d8 03 00 00 	mov    rdi,QWORD PTR [rdi+0x3d8]
      e3ab47:	48 83 a3 d8 03 00 00 	and    QWORD PTR [rbx+0x3d8],0x0
      e3ab4e:	00 
      e3ab4f:	48 85 ff             	test   rdi,rdi
      e3ab52:	74 06                	je     e3ab5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f70>
      e3ab54:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e3ab57:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e3ab5a:	48 8d bb a0 03 00 00 	lea    rdi,[rbx+0x3a0]
      e3ab61:	e8 2a 33 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e3ab66:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]

### 0xe41cc7; FDE=(14949480, 14949935): cmp    BYTE PTR [r12+0x3b8],0x0
      e41c76:	89 74 24 04          	mov    DWORD PTR [rsp+0x4],esi
      e41c7a:	48 89 fb             	mov    rbx,rdi
      e41c7d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e41c84:	00 00 
      e41c86:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e41c8b:	48 8b bf 78 01 00 00 	mov    rdi,QWORD PTR [rdi+0x178]
      e41c92:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e41c95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e41c98:	48 8b 28             	mov    rbp,QWORD PTR [rax]
      e41c9b:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      e41c9f:	4c 39 f5             	cmp    rbp,r14
      e41ca2:	0f 84 46 01 00 00    	je     e41dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9204>
      e41ca8:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      e41cad:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      e41cb2:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      e41cb7:	48 8b bb 60 02 00 00 	mov    rdi,QWORD PTR [rbx+0x260]
      e41cbe:	e8 9f 87 c3 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      e41cc3:	4c 8b 65 00          	mov    r12,QWORD PTR [rbp+0x0]
      e41cc7:	41 80 bc 24 b8 03 00 	cmp    BYTE PTR [r12+0x3b8],0x0
      e41cce:	00 00 
      e41cd0:	0f 84 0b 01 00 00    	je     e41de1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x91f7>
      e41cd6:	80 7c 24 04 00       	cmp    BYTE PTR [rsp+0x4],0x0
      e41cdb:	75 1c                	jne    e41cf9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x910f>
      e41cdd:	49 2b 84 24 70 03 00 	sub    rax,QWORD PTR [r12+0x370]
      e41ce4:	00 
      e41ce5:	48 69 8b d0 01 00 00 	imul   rcx,QWORD PTR [rbx+0x1d0],0xf4240
      e41cec:	40 42 0f 00 
      e41cf0:	48 39 c8             	cmp    rax,rcx
      e41cf3:	0f 8e e8 00 00 00    	jle    e41de1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x91f7>
      e41cf9:	48 8b b3 a0 02 00 00 	mov    rsi,QWORD PTR [rbx+0x2a0]
      e41d00:	4c 89 ff             	mov    rdi,r15
      e41d03:	e8 9e 7b 7a 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      e41d08:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx
      e41d0d:	4c 8b ab 78 03 00 00 	mov    r13,QWORD PTR [rbx+0x378]
      e41d14:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13
      e41d19:	48 8b 9b 80 03 00 00 	mov    rbx,QWORD PTR [rbx+0x380]
      e41d20:	48 89 5c 24 28       	mov    QWORD PTR [rsp+0x28],rbx
      e41d25:	48 85 db             	test   rbx,rbx
      e41d28:	74 05                	je     e41d2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9145>
      e41d2a:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e41d2f:	4c 8b 7d 00          	mov    r15,QWORD PTR [rbp+0x0]
      e41d33:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
      e41d38:	4c 8b 75 08          	mov    r14,QWORD PTR [rbp+0x8]
      e41d3c:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
      e41d41:	4d 85 f6             	test   r14,r14
      e41d44:	74 05                	je     e41d4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9161>
      e41d46:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]

### 0xe4868b; FDE=(14973470, 14978888): cmp    BYTE PTR [rax+0x3b8],0x0
      e48632:	e8 a1 51 ff ff       	call   e3d7d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bee>
      e48637:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      e4863e:	00 
      e4863f:	e8 4c 58 9a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e48644:	49 8b bc 24 b0 01 00 	mov    rdi,QWORD PTR [r12+0x1b0]
      e4864b:	00 
      e4864c:	e8 11 1e c3 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      e48651:	48 8b 4d 00          	mov    rcx,QWORD PTR [rbp+0x0]
      e48655:	48 89 81 90 03 00 00 	mov    QWORD PTR [rcx+0x390],rax
      e4865c:	e8 ef 5a 9a 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
      e48661:	48 8b 4d 00          	mov    rcx,QWORD PTR [rbp+0x0]
      e48665:	48 89 81 98 03 00 00 	mov    QWORD PTR [rcx+0x398],rax
      e4866c:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e48670:	80 b8 d8 00 00 00 00 	cmp    BYTE PTR [rax+0xd8],0x0
      e48677:	75 07                	jne    e48680 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa96>
      e48679:	c6 80 d8 00 00 00 01 	mov    BYTE PTR [rax+0xd8],0x1
      e48680:	4c 89 b8 d0 00 00 00 	mov    QWORD PTR [rax+0xd0],r15
      e48687:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e4868b:	80 b8 b8 03 00 00 00 	cmp    BYTE PTR [rax+0x3b8],0x0
      e48692:	c6 80 b8 03 00 00 01 	mov    BYTE PTR [rax+0x3b8],0x1
      e48699:	4c 8b 6d 00          	mov    r13,QWORD PTR [rbp+0x0]
      e4869d:	74 78                	je     e48717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb2d>
      e4869f:	41 0f b7 85 b0 00 00 	movzx  eax,WORD PTR [r13+0xb0]
      e486a6:	00 
      e486a7:	41 39 46 30          	cmp    DWORD PTR [r14+0x30],eax
      e486ab:	75 6a                	jne    e48717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb2d>
      e486ad:	49 8d bd b8 00 00 00 	lea    rdi,[r13+0xb8]
      e486b4:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      e486b9:	e8 30 70 c5 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      e486be:	84 c0                	test   al,al
      e486c0:	74 55                	je     e48717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb2d>
      e486c2:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      e486c9:	00 
      e486ca:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
      e486d1:	00 
      e486d2:	e8 17 70 c5 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      e486d7:	84 c0                	test   al,al
      e486d9:	74 3c                	je     e48717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb2d>
      e486db:	49 8b bd d0 02 00 00 	mov    rdi,QWORD PTR [r13+0x2d0]
      e486e2:	49 8b b5 d8 02 00 00 	mov    rsi,QWORD PTR [r13+0x2d8]
      e486e9:	48 8b 94 24 c0 00 00 	mov    rdx,QWORD PTR [rsp+0xc0]
      e486f0:	00 
      e486f1:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
      e486f8:	00 
      e486f9:	e8 78 ca df ff       	call   c45176 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192116>
      e486fe:	84 c0                	test   al,al
      e48700:	74 15                	je     e48717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb2d>

### 0xe48692; FDE=(14973470, 14978888): mov    BYTE PTR [rax+0x3b8],0x1
      e48637:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      e4863e:	00 
      e4863f:	e8 4c 58 9a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e48644:	49 8b bc 24 b0 01 00 	mov    rdi,QWORD PTR [r12+0x1b0]
      e4864b:	00 
      e4864c:	e8 11 1e c3 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      e48651:	48 8b 4d 00          	mov    rcx,QWORD PTR [rbp+0x0]
      e48655:	48 89 81 90 03 00 00 	mov    QWORD PTR [rcx+0x390],rax
      e4865c:	e8 ef 5a 9a 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
      e48661:	48 8b 4d 00          	mov    rcx,QWORD PTR [rbp+0x0]
      e48665:	48 89 81 98 03 00 00 	mov    QWORD PTR [rcx+0x398],rax
      e4866c:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e48670:	80 b8 d8 00 00 00 00 	cmp    BYTE PTR [rax+0xd8],0x0
      e48677:	75 07                	jne    e48680 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa96>
      e48679:	c6 80 d8 00 00 00 01 	mov    BYTE PTR [rax+0xd8],0x1
      e48680:	4c 89 b8 d0 00 00 00 	mov    QWORD PTR [rax+0xd0],r15
      e48687:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e4868b:	80 b8 b8 03 00 00 00 	cmp    BYTE PTR [rax+0x3b8],0x0
      e48692:	c6 80 b8 03 00 00 01 	mov    BYTE PTR [rax+0x3b8],0x1
      e48699:	4c 8b 6d 00          	mov    r13,QWORD PTR [rbp+0x0]
      e4869d:	74 78                	je     e48717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb2d>
      e4869f:	41 0f b7 85 b0 00 00 	movzx  eax,WORD PTR [r13+0xb0]
      e486a6:	00 
      e486a7:	41 39 46 30          	cmp    DWORD PTR [r14+0x30],eax
      e486ab:	75 6a                	jne    e48717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb2d>
      e486ad:	49 8d bd b8 00 00 00 	lea    rdi,[r13+0xb8]
      e486b4:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      e486b9:	e8 30 70 c5 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      e486be:	84 c0                	test   al,al
      e486c0:	74 55                	je     e48717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb2d>
      e486c2:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      e486c9:	00 
      e486ca:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
      e486d1:	00 
      e486d2:	e8 17 70 c5 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      e486d7:	84 c0                	test   al,al
      e486d9:	74 3c                	je     e48717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb2d>
      e486db:	49 8b bd d0 02 00 00 	mov    rdi,QWORD PTR [r13+0x2d0]
      e486e2:	49 8b b5 d8 02 00 00 	mov    rsi,QWORD PTR [r13+0x2d8]
      e486e9:	48 8b 94 24 c0 00 00 	mov    rdx,QWORD PTR [rsp+0xc0]
      e486f0:	00 
      e486f1:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
      e486f8:	00 
      e486f9:	e8 78 ca df ff       	call   c45176 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192116>
      e486fe:	84 c0                	test   al,al
      e48700:	74 15                	je     e48717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb2d>
      e48702:	83 3d af 12 ae 00 0d 	cmp    DWORD PTR [rip+0xae12af],0xd        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>

### 0xe524f6; FDE=(15017194, 15017256): cmp    BYTE PTR [rdi+0x3b8],0x0
      e524bc:	5b                   	pop    rbx
      e524bd:	c3                   	ret
      e524be:	48 8d 35 d2 78 4f ff 	lea    rsi,[rip+0xffffffffff4f78d2]        # 349d97 <_ZTSSt12bad_any_cast@@Base-0x46431>
      e524c5:	48 8d 0d 64 43 51 ff 	lea    rcx,[rip+0xffffffffff514364]        # 366830 <_ZTSSt12bad_any_cast@@Base-0x29998>
      e524cc:	6a 06                	push   0x6
      e524ce:	5f                   	pop    rdi
      e524cf:	ba b3 00 00 00       	mov    edx,0xb3
      e524d4:	31 c0                	xor    eax,eax
      e524d6:	e8 f7 43 98 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e524db:	eb ba                	jmp    e52497 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198ad>
      e524dd:	e8 ce d5 99 00       	call   17efab0 <__stack_chk_fail@plt>
      e524e2:	48 89 c7             	mov    rdi,rax
      e524e5:	e8 bb 75 c2 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e524ea:	31 c0                	xor    eax,eax
      e524ec:	48 85 ff             	test   rdi,rdi
      e524ef:	74 22                	je     e52513 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19929>
      e524f1:	48 85 f6             	test   rsi,rsi
      e524f4:	74 1d                	je     e52513 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19929>
      e524f6:	80 bf b8 03 00 00 00 	cmp    BYTE PTR [rdi+0x3b8],0x0
      e524fd:	74 09                	je     e52508 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1991e>
      e524ff:	80 bf b9 03 00 00 00 	cmp    BYTE PTR [rdi+0x3b9],0x0
      e52506:	75 09                	jne    e52511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19927>
      e52508:	80 be 08 01 00 00 00 	cmp    BYTE PTR [rsi+0x108],0x0
      e5250f:	74 03                	je     e52514 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1992a>
      e52511:	31 c0                	xor    eax,eax
      e52513:	c3                   	ret
      e52514:	80 be 00 01 00 00 00 	cmp    BYTE PTR [rsi+0x100],0x0
      e5251b:	74 f4                	je     e52511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19927>
      e5251d:	80 bf 48 03 00 00 00 	cmp    BYTE PTR [rdi+0x348],0x0
      e52524:	0f 95 c0             	setne  al
      e52527:	c3                   	ret
      e52528:	31 c0                	xor    eax,eax
      e5252a:	84 d2                	test   dl,dl
      e5252c:	74 67                	je     e52595 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ab>
      e5252e:	48 85 ff             	test   rdi,rdi
      e52531:	74 62                	je     e52595 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199ab>
      e52533:	53                   	push   rbx
      e52534:	48 89 f3             	mov    rbx,rsi
      e52537:	48 85 f6             	test   rsi,rsi
      e5253a:	74 58                	je     e52594 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199aa>
      e5253c:	80 bf a0 01 00 00 00 	cmp    BYTE PTR [rdi+0x1a0],0x0
      e52543:	74 4d                	je     e52592 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199a8>
      e52545:	48 81 c7 88 01 00 00 	add    rdi,0x188
      e5254c:	e8 e5 92 c2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      e52551:	4c 8d 05 1e 58 4d ff 	lea    r8,[rip+0xffffffffff4d581e]        # 327d76 <_ZTSSt12bad_any_cast@@Base-0x68452>
      e52558:	6a 06                	push   0x6
      e5255a:	59                   	pop    rcx

### 0xe778aa; FDE=(15169538, 15170113): cmp    BYTE PTR [rsp+0x3b8],0x0
      e77862:	e8 f5 9f 76 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
      e77867:	48 89 df             	mov    rdi,rbx
      e7786a:	e8 c2 9e 76 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
      e7786f:	4c 89 ff             	mov    rdi,r15
      e77872:	e8 91 31 c3 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
      e77877:	e9 90 01 00 00       	jmp    e77a0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ee22>
      e7787c:	49 89 d4             	mov    r12,rdx
      e7787f:	49 89 f7             	mov    r15,rsi
      e77882:	48 8b 72 18          	mov    rsi,QWORD PTR [rdx+0x18]
      e77886:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
      e7788a:	4c 8d 6c 24 18       	lea    r13,[rsp+0x18]
      e7788f:	4c 89 ef             	mov    rdi,r13
      e77892:	e8 f7 d4 f7 ff       	call   df4d8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e14>
      e77897:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      e7789e:	00 
      e7789f:	4c 89 fe             	mov    rsi,r15
      e778a2:	4c 89 ea             	mov    rdx,r13
      e778a5:	e8 a0 0b 00 00       	call   e7844a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f860>
      e778aa:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
      e778b1:	00 
      e778b2:	0f 84 fc 00 00 00    	je     e779b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3edca>
      e778b8:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      e778bd:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0
      e778c2:	48 8d 05 ff 3e a0 00 	lea    rax,[rip+0xa03eff]        # 187b7c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37eb0>
      e778c9:	48 89 07             	mov    QWORD PTR [rdi],rax
      e778cc:	0f 57 c0             	xorps  xmm0,xmm0
      e778cf:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      e778d3:	c7 47 20 01 00 00 00 	mov    DWORD PTR [rdi+0x20],0x1
      e778da:	c7 47 10 02 00 00 00 	mov    DWORD PTR [rdi+0x10],0x2
      e778e1:	41 8b 6c 24 20       	mov    ebp,DWORD PTR [r12+0x20]
      e778e6:	e8 0b 87 ff ff       	call   e6fff6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3740c>
      e778eb:	83 fd 05             	cmp    ebp,0x5
      e778ee:	6a 06                	push   0x6
      e778f0:	5e                   	pop    rsi
      e778f1:	0f 45 f5             	cmovne esi,ebp
      e778f4:	48 89 c7             	mov    rdi,rax
      e778f7:	e8 2a 87 ff ff       	call   e70026 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3743c>
      e778fc:	4d 8b 7f 68          	mov    r15,QWORD PTR [r15+0x68]
      e77900:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      e77905:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      e7790c:	00 
      e7790d:	e8 ed 0b 00 00       	call   e784ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f915>
      e77912:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      e77919:	00 
      e7791a:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
      e7791f:	e8 de 88 ff ff       	call   e70202 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37618>
      e77924:	48 89 e7             	mov    rdi,rsp

### 0xe78161; FDE=(15170678, 15172406): cmp    BYTE PTR [rsp+0x3b8],0x0
      e78114:	e8 18 96 76 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
      e78119:	4c 89 f7             	mov    rdi,r14
      e7811c:	e8 e7 28 c3 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
      e78121:	e9 a7 01 00 00       	jmp    e782cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6e3>
      e78126:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      e7812b:	48 8b 70 30          	mov    rsi,QWORD PTR [rax+0x30]
      e7812f:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
      e78133:	4c 8d 74 24 48       	lea    r14,[rsp+0x48]
      e78138:	4c 89 f7             	mov    rdi,r14
      e7813b:	e8 4e cc f7 ff       	call   df4d8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e14>
      e78140:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      e78147:	00 
      e78148:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
      e7814d:	4c 89 fe             	mov    rsi,r15
      e78150:	4c 89 f2             	mov    rdx,r14
      e78153:	e8 f2 02 00 00       	call   e7844a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f860>
      e78158:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e7815d:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
      e78161:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
      e78168:	00 
      e78169:	0f 84 f8 00 00 00    	je     e78267 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f67d>
      e7816f:	4d 8b 7f 68          	mov    r15,QWORD PTR [r15+0x68]
      e78173:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      e78178:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      e7817f:	00 
      e78180:	e8 7a 03 00 00       	call   e784ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f915>
      e78185:	0f 28 44 24 60       	movaps xmm0,XMMWORD PTR [rsp+0x60]
      e7818a:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      e7818f:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      e78193:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e78198:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      e7819c:	0f 57 c0             	xorps  xmm0,xmm0
      e7819f:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
      e781a4:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
      e781aa:	41 0f 10 0c 24       	movups xmm1,XMMWORD PTR [r12]
      e781af:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
      e781b4:	48 8d 05 35 79 9b 00 	lea    rax,[rip+0x9b7935]        # 182faf0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x1a88>
      e781bb:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
      e781c2:	00 
      e781c3:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e781c7:	41 0f 11 4c 24 08    	movups XMMWORD PTR [r12+0x8],xmm1
      e781cd:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      e781d2:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e781d5:	4c 8d 6c 24 78       	lea    r13,[rsp+0x78]
      e781da:	4c 89 ff             	mov    rdi,r15
      e781dd:	4c 89 ee             	mov    rsi,r13
      e781e0:	4c 89 f2             	mov    rdx,r14

### 0xe9dca3; FDE=(15310087, 15343400): mov    QWORD PTR [rsp+0x3b8],rax
      e9dc55:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9dc5c:	00 
      e9dc5d:	e8 2e 02 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9dc62:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9dc69:	00 
      e9dc6a:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9dc71:	00 
      e9dc72:	e8 81 14 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9dc77:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9dc7e:	00 
      e9dc7f:	e8 ea a5 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9dc84:	31 db                	xor    ebx,ebx
      e9dc86:	31 ff                	xor    edi,edi
      e9dc88:	e8 f9 07 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9dc8d:	48 8d 05 4c 0c 97 00 	lea    rax,[rip+0x970c4c]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e9dc94:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
      e9dc9b:	00 
      e9dc9c:	48 8d 05 db 5f 5e 00 	lea    rax,[rip+0x5e5fdb]        # 1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
      e9dca3:	48 89 84 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rax
      e9dcaa:	00 
      e9dcab:	48 8d 84 24 b0 03 00 	lea    rax,[rsp+0x3b0]
      e9dcb2:	00 
      e9dcb3:	48 89 84 24 d0 03 00 	mov    QWORD PTR [rsp+0x3d0],rax
      e9dcba:	00 
      e9dcbb:	48 8d 84 24 80 03 00 	lea    rax,[rsp+0x380]
      e9dcc2:	00 
      e9dcc3:	48 8d 0d 16 0c 97 00 	lea    rcx,[rip+0x970c16]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e9dcca:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9dccd:	48 8d 0d 4e fb 90 00 	lea    rcx,[rip+0x90fb4e]        # 17ad822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16198e>
      e9dcd4:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e9dcd8:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e9dcdc:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      e9dce3:	00 00 
      e9dce5:	66 48 0f 7e c0       	movq   rax,xmm0
      e9dcea:	66 48 0f 3a 16 c5 01 	pextrq rbp,xmm0,0x1
      e9dcf1:	48 85 ed             	test   rbp,rbp
      e9dcf4:	74 08                	je     e9dcfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65114>
      e9dcf6:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      e9dcfb:	48 89 eb             	mov    rbx,rbp
      e9dcfe:	48 83 a4 24 70 03 00 	and    QWORD PTR [rsp+0x370],0x0
      e9dd05:	00 00 
      e9dd07:	48 8d 0d 7a 3a 99 00 	lea    rcx,[rip+0x993a7a]        # 1831788 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3720>
      e9dd0e:	48 89 8c 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rcx
      e9dd15:	00 
      e9dd16:	48 89 84 24 58 03 00 	mov    QWORD PTR [rsp+0x358],rax
      e9dd1d:	00 
      e9dd1e:	48 89 9c 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rbx

### 0xee6023; FDE=(15619522, 15622402): mov    QWORD PTR [rdi+0x3b8],rax
      ee5fb7:	48 83 a7 a8 03 00 00 	and    QWORD PTR [rdi+0x3a8],0x0
      ee5fbe:	00 
      ee5fbf:	0f 11 87 98 03 00 00 	movups XMMWORD PTR [rdi+0x398],xmm0
      ee5fc6:	48 8b 86 98 03 00 00 	mov    rax,QWORD PTR [rsi+0x398]
      ee5fcd:	48 89 87 98 03 00 00 	mov    QWORD PTR [rdi+0x398],rax
      ee5fd4:	48 8b 86 a0 03 00 00 	mov    rax,QWORD PTR [rsi+0x3a0]
      ee5fdb:	48 89 87 a0 03 00 00 	mov    QWORD PTR [rdi+0x3a0],rax
      ee5fe2:	48 8b 86 a8 03 00 00 	mov    rax,QWORD PTR [rsi+0x3a8]
      ee5fe9:	48 89 87 a8 03 00 00 	mov    QWORD PTR [rdi+0x3a8],rax
      ee5ff0:	0f 11 86 98 03 00 00 	movups XMMWORD PTR [rsi+0x398],xmm0
      ee5ff7:	48 83 a6 a8 03 00 00 	and    QWORD PTR [rsi+0x3a8],0x0
      ee5ffe:	00 
      ee5fff:	0f 11 87 b0 03 00 00 	movups XMMWORD PTR [rdi+0x3b0],xmm0
      ee6006:	48 83 a7 c0 03 00 00 	and    QWORD PTR [rdi+0x3c0],0x0
      ee600d:	00 
      ee600e:	48 8b 86 b0 03 00 00 	mov    rax,QWORD PTR [rsi+0x3b0]
      ee6015:	48 89 87 b0 03 00 00 	mov    QWORD PTR [rdi+0x3b0],rax
      ee601c:	48 8b 86 b8 03 00 00 	mov    rax,QWORD PTR [rsi+0x3b8]
      ee6023:	48 89 87 b8 03 00 00 	mov    QWORD PTR [rdi+0x3b8],rax
      ee602a:	48 8b 86 c0 03 00 00 	mov    rax,QWORD PTR [rsi+0x3c0]
      ee6031:	48 89 87 c0 03 00 00 	mov    QWORD PTR [rdi+0x3c0],rax
      ee6038:	48 83 a6 c0 03 00 00 	and    QWORD PTR [rsi+0x3c0],0x0
      ee603f:	00 
      ee6040:	0f 11 86 b0 03 00 00 	movups XMMWORD PTR [rsi+0x3b0],xmm0
      ee6047:	48 83 a7 d8 03 00 00 	and    QWORD PTR [rdi+0x3d8],0x0
      ee604e:	00 
      ee604f:	0f 11 87 c8 03 00 00 	movups XMMWORD PTR [rdi+0x3c8],xmm0
      ee6056:	48 8b 86 c8 03 00 00 	mov    rax,QWORD PTR [rsi+0x3c8]
      ee605d:	48 89 87 c8 03 00 00 	mov    QWORD PTR [rdi+0x3c8],rax
      ee6064:	48 8b 86 d0 03 00 00 	mov    rax,QWORD PTR [rsi+0x3d0]
      ee606b:	48 89 87 d0 03 00 00 	mov    QWORD PTR [rdi+0x3d0],rax
      ee6072:	48 8b 86 d8 03 00 00 	mov    rax,QWORD PTR [rsi+0x3d8]
      ee6079:	48 89 87 d8 03 00 00 	mov    QWORD PTR [rdi+0x3d8],rax
      ee6080:	0f 11 86 c8 03 00 00 	movups XMMWORD PTR [rsi+0x3c8],xmm0
      ee6087:	48 83 a6 d8 03 00 00 	and    QWORD PTR [rsi+0x3d8],0x0
      ee608e:	00 
      ee608f:	48 8b 86 e0 03 00 00 	mov    rax,QWORD PTR [rsi+0x3e0]
      ee6096:	48 89 87 e0 03 00 00 	mov    QWORD PTR [rdi+0x3e0],rax
      ee609d:	48 83 a7 f8 03 00 00 	and    QWORD PTR [rdi+0x3f8],0x0
      ee60a4:	00 
      ee60a5:	0f 11 87 e8 03 00 00 	movups XMMWORD PTR [rdi+0x3e8],xmm0
      ee60ac:	48 8b 86 e8 03 00 00 	mov    rax,QWORD PTR [rsi+0x3e8]
      ee60b3:	48 89 87 e8 03 00 00 	mov    QWORD PTR [rdi+0x3e8],rax
      ee60ba:	48 8b 86 f0 03 00 00 	mov    rax,QWORD PTR [rsi+0x3f0]
      ee60c1:	48 89 87 f0 03 00 00 	mov    QWORD PTR [rdi+0x3f0],rax
      ee60c8:	48 8b 86 f8 03 00 00 	mov    rax,QWORD PTR [rsi+0x3f8]
      ee60cf:	48 89 87 f8 03 00 00 	mov    QWORD PTR [rdi+0x3f8],rax

### 0xf01f68; FDE=(15735664, 15736876): mov    QWORD PTR [rbx+0x3b8],rax
      f01f02:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f01f07:	49 8b 86 90 03 00 00 	mov    rax,QWORD PTR [r14+0x390]
      f01f0e:	48 89 83 90 03 00 00 	mov    QWORD PTR [rbx+0x390],rax
      f01f15:	49 8b 86 98 03 00 00 	mov    rax,QWORD PTR [r14+0x398]
      f01f1c:	48 89 83 98 03 00 00 	mov    QWORD PTR [rbx+0x398],rax
      f01f23:	48 85 c0             	test   rax,rax
      f01f26:	74 05                	je     f01f2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9343>
      f01f28:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f01f2d:	49 8b 86 a0 03 00 00 	mov    rax,QWORD PTR [r14+0x3a0]
      f01f34:	48 89 83 a0 03 00 00 	mov    QWORD PTR [rbx+0x3a0],rax
      f01f3b:	49 8b 86 a8 03 00 00 	mov    rax,QWORD PTR [r14+0x3a8]
      f01f42:	48 89 83 a8 03 00 00 	mov    QWORD PTR [rbx+0x3a8],rax
      f01f49:	48 85 c0             	test   rax,rax
      f01f4c:	74 05                	je     f01f53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9369>
      f01f4e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f01f53:	49 8b 86 b0 03 00 00 	mov    rax,QWORD PTR [r14+0x3b0]
      f01f5a:	48 89 83 b0 03 00 00 	mov    QWORD PTR [rbx+0x3b0],rax
      f01f61:	49 8b 86 b8 03 00 00 	mov    rax,QWORD PTR [r14+0x3b8]
      f01f68:	48 89 83 b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],rax
      f01f6f:	48 85 c0             	test   rax,rax
      f01f72:	74 05                	je     f01f79 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc938f>
      f01f74:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f01f79:	48 83 c4 18          	add    rsp,0x18
      f01f7d:	5b                   	pop    rbx
      f01f7e:	41 5c                	pop    r12
      f01f80:	41 5d                	pop    r13
      f01f82:	41 5e                	pop    r14
      f01f84:	41 5f                	pop    r15
      f01f86:	5d                   	pop    rbp
      f01f87:	c3                   	ret
      f01f88:	49 89 c6             	mov    r14,rax
      f01f8b:	4c 89 ef             	mov    rdi,r13
      f01f8e:	e8 d7 7f b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f01f93:	eb 03                	jmp    f01f98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc93ae>
      f01f95:	49 89 c6             	mov    r14,rax
      f01f98:	48 8b bb 48 02 00 00 	mov    rdi,QWORD PTR [rbx+0x248]
      f01f9f:	e8 e2 c4 b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f01fa4:	4c 89 e7             	mov    rdi,r12
      f01fa7:	e8 be 7f b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f01fac:	eb 03                	jmp    f01fb1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc93c7>
      f01fae:	49 89 c6             	mov    r14,rax
      f01fb1:	48 8b bb f8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1f8]
      f01fb8:	e8 c9 c4 b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f01fbd:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
      f01fc4:	e8 a1 7f b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f01fc9:	eb 03                	jmp    f01fce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc93e4>
      f01fcb:	49 89 c6             	mov    r14,rax

### 0xfea740; FDE=(16688930, 16689045): mov    QWORD PTR [rsp+0x3b8],rax
      fea6ff:	e8 c6 fb a8 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      fea704:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fea70b:	00 00 
      fea70d:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      fea712:	75 08                	jne    fea71c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1b32>
      fea714:	48 89 df             	mov    rdi,rbx
      fea717:	e8 b4 55 a8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      fea71c:	e8 8f 53 80 00       	call   17efab0 <__stack_chk_fail@plt>
      fea721:	cc                   	int3
      fea722:	41 57                	push   r15
      fea724:	41 56                	push   r14
      fea726:	53                   	push   rbx
      fea727:	48 81 ec c0 03 00 00 	sub    rsp,0x3c0
      fea72e:	48 89 d3             	mov    rbx,rdx
      fea731:	48 89 f2             	mov    rdx,rsi
      fea734:	49 89 fe             	mov    r14,rdi
      fea737:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fea73e:	00 00 
      fea740:	48 89 84 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rax
      fea747:	00 
      fea748:	48 8d 77 10          	lea    rsi,[rdi+0x10]
      fea74c:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      fea751:	4c 89 ff             	mov    rdi,r15
      fea754:	e8 3d 00 00 00       	call   fea796 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bac>
      fea759:	49 03 5e 68          	add    rbx,QWORD PTR [r14+0x68]
      fea75d:	48 89 df             	mov    rdi,rbx
      fea760:	4c 89 fe             	mov    rsi,r15
      fea763:	e8 46 71 6e 00       	call   16d18ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85a1a>
      fea768:	4c 89 ff             	mov    rdi,r15
      fea76b:	e8 bc 73 6e 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
      fea770:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fea777:	00 00 
      fea779:	48 3b 84 24 b8 03 00 	cmp    rax,QWORD PTR [rsp+0x3b8]
      fea780:	00 
      fea781:	75 0d                	jne    fea790 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1ba6>
      fea783:	48 81 c4 c0 03 00 00 	add    rsp,0x3c0
      fea78a:	5b                   	pop    rbx
      fea78b:	41 5e                	pop    r14
      fea78d:	41 5f                	pop    r15
      fea78f:	c3                   	ret
      fea790:	e8 1b 53 80 00       	call   17efab0 <__stack_chk_fail@plt>
      fea795:	cc                   	int3
      fea796:	41 57                	push   r15
      fea798:	41 56                	push   r14
      fea79a:	53                   	push   rbx
      fea79b:	49 89 d6             	mov    r14,rdx
      fea79e:	49 89 f7             	mov    r15,rsi

### 0xff75da; FDE=(16741830, 16742529): mov    QWORD PTR [rsp+0x3b8],rax
      ff759b:	48 89 e7             	mov    rdi,rsp
      ff759e:	e8 ed 68 7f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ff75a3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff75aa:	00 00 
      ff75ac:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ff75b1:	75 0e                	jne    ff75c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1be9d7>
      ff75b3:	4c 09 f3             	or     rbx,r14
      ff75b6:	48 89 d8             	mov    rax,rbx
      ff75b9:	48 83 c4 28          	add    rsp,0x28
      ff75bd:	5b                   	pop    rbx
      ff75be:	41 5e                	pop    r14
      ff75c0:	c3                   	ret
      ff75c1:	e8 ea 84 7f 00       	call   17efab0 <__stack_chk_fail@plt>
      ff75c6:	53                   	push   rbx
      ff75c7:	48 81 ec c0 03 00 00 	sub    rsp,0x3c0
      ff75ce:	48 89 fb             	mov    rbx,rdi
      ff75d1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff75d8:	00 00 
      ff75da:	48 89 84 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rax
      ff75e1:	00 
      ff75e2:	48 89 f0             	mov    rax,rsi
      ff75e5:	48 c1 e8 20          	shr    rax,0x20
      ff75e9:	84 c0                	test   al,al
      ff75eb:	0f 84 b5 00 00 00    	je     ff76a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1beabc>
      ff75f1:	83 fe 01             	cmp    esi,0x1
      ff75f4:	0f 85 ac 00 00 00    	jne    ff76a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1beabc>
      ff75fa:	31 c0                	xor    eax,eax
      ff75fc:	48 8d b4 24 e8 02 00 	lea    rsi,[rsp+0x2e8]
      ff7603:	00 
      ff7604:	88 46 13             	mov    BYTE PTR [rsi+0x13],al
      ff7607:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
      ff760d:	88 46 18             	mov    BYTE PTR [rsi+0x18],al
      ff7610:	88 46 20             	mov    BYTE PTR [rsi+0x20],al
      ff7613:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
      ff7616:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
      ff7619:	0f 57 c0             	xorps  xmm0,xmm0
      ff761c:	0f 11 86 a0 00 00 00 	movups XMMWORD PTR [rsi+0xa0],xmm0
      ff7623:	88 86 b0 00 00 00    	mov    BYTE PTR [rsi+0xb0],al
      ff7629:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
      ff762d:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
      ff7631:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
      ff7635:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
      ff7639:	0f 11 46 78          	movups XMMWORD PTR [rsi+0x78],xmm0
      ff763d:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
      ff7644:	66 83 a6 98 00 00 00 	and    WORD PTR [rsi+0x98],0x0
      ff764b:	00 
      ff764c:	0f 11 86 b8 00 00 00 	movups XMMWORD PTR [rsi+0xb8],xmm0

### 0x1144dea; FDE=(18107854, 18109511): mov    QWORD PTR [rsp+0x3b8],rax
     1144dad:	e8 fe ac 6a 00       	call   17efab0 <__stack_chk_fail@plt>
     1144db2:	48 89 c3             	mov    rbx,rax
     1144db5:	eb 0f                	jmp    1144dc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c1dc>
     1144db7:	eb 00                	jmp    1144db9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30c1cf>
     1144db9:	48 89 c3             	mov    rbx,rax
     1144dbc:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1144dc1:	e8 0e 72 ba ff       	call   cebfd4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x238f74>
     1144dc6:	48 89 df             	mov    rdi,rbx
     1144dc9:	e8 d7 4c 93 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1144dce:	41 57                	push   r15
     1144dd0:	41 56                	push   r14
     1144dd2:	41 55                	push   r13
     1144dd4:	41 54                	push   r12
     1144dd6:	53                   	push   rbx
     1144dd7:	48 81 ec c0 03 00 00 	sub    rsp,0x3c0
     1144dde:	48 89 cb             	mov    rbx,rcx
     1144de1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1144de8:	00 00 
     1144dea:	48 89 84 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rax
     1144df1:	00 
     1144df2:	31 c9                	xor    ecx,ecx
     1144df4:	48 89 e0             	mov    rax,rsp
     1144df7:	88 48 30             	mov    BYTE PTR [rax+0x30],cl
     1144dfa:	88 48 68             	mov    BYTE PTR [rax+0x68],cl
     1144dfd:	88 48 70             	mov    BYTE PTR [rax+0x70],cl
     1144e00:	88 88 88 00 00 00    	mov    BYTE PTR [rax+0x88],cl
     1144e06:	88 88 90 00 00 00    	mov    BYTE PTR [rax+0x90],cl
     1144e0c:	88 88 a8 00 00 00    	mov    BYTE PTR [rax+0xa8],cl
     1144e12:	88 88 b8 00 00 00    	mov    BYTE PTR [rax+0xb8],cl
     1144e18:	88 88 d0 00 00 00    	mov    BYTE PTR [rax+0xd0],cl
     1144e1e:	88 88 d8 00 00 00    	mov    BYTE PTR [rax+0xd8],cl
     1144e24:	88 88 f0 00 00 00    	mov    BYTE PTR [rax+0xf0],cl
     1144e2a:	88 88 f8 00 00 00    	mov    BYTE PTR [rax+0xf8],cl
     1144e30:	88 88 fc 00 00 00    	mov    BYTE PTR [rax+0xfc],cl
     1144e36:	88 88 00 01 00 00    	mov    BYTE PTR [rax+0x100],cl
     1144e3c:	88 88 18 01 00 00    	mov    BYTE PTR [rax+0x118],cl
     1144e42:	88 88 20 01 00 00    	mov    BYTE PTR [rax+0x120],cl
     1144e48:	88 88 38 01 00 00    	mov    BYTE PTR [rax+0x138],cl
     1144e4e:	88 88 40 01 00 00    	mov    BYTE PTR [rax+0x140],cl
     1144e54:	88 88 58 01 00 00    	mov    BYTE PTR [rax+0x158],cl
     1144e5a:	88 88 60 01 00 00    	mov    BYTE PTR [rax+0x160],cl
     1144e60:	88 88 78 01 00 00    	mov    BYTE PTR [rax+0x178],cl
     1144e66:	88 88 80 01 00 00    	mov    BYTE PTR [rax+0x180],cl
     1144e6c:	88 88 84 01 00 00    	mov    BYTE PTR [rax+0x184],cl
     1144e72:	88 88 90 01 00 00    	mov    BYTE PTR [rax+0x190],cl
     1144e78:	88 88 a8 01 00 00    	mov    BYTE PTR [rax+0x1a8],cl
     1144e7e:	88 88 b0 01 00 00    	mov    BYTE PTR [rax+0x1b0],cl

### 0x1145e74; FDE=(18111626, 18115152): mov    QWORD PTR [rsp+0x3b8],rbp
     1145e2b:	00 
     1145e2c:	48 8d 05 35 ee 70 00 	lea    rax,[rip+0x70ee35]        # 1854c68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11350>
     1145e33:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
     1145e3a:	00 
     1145e3b:	83 a4 24 78 03 00 00 	and    DWORD PTR [rsp+0x378],0x0
     1145e42:	00 
     1145e43:	0f 11 84 24 80 03 00 	movups XMMWORD PTR [rsp+0x380],xmm0
     1145e4a:	00 
     1145e4b:	48 83 a4 24 90 03 00 	and    QWORD PTR [rsp+0x390],0x0
     1145e52:	00 00 
     1145e54:	48 89 ac 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rbp
     1145e5b:	00 
     1145e5c:	48 89 ac 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],rbp
     1145e63:	00 
     1145e64:	48 89 ac 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],rbp
     1145e6b:	00 
     1145e6c:	48 89 ac 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rbp
     1145e73:	00 
     1145e74:	48 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rbp
     1145e7b:	00 
     1145e7c:	48 89 ac 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rbp
     1145e83:	00 
     1145e84:	48 89 ac 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],rbp
     1145e8b:	00 
     1145e8c:	48 89 ac 24 d0 03 00 	mov    QWORD PTR [rsp+0x3d0],rbp
     1145e93:	00 
     1145e94:	48 89 ac 24 d8 03 00 	mov    QWORD PTR [rsp+0x3d8],rbp
     1145e9b:	00 
     1145e9c:	48 89 ac 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rbp
     1145ea3:	00 
     1145ea4:	48 89 ac 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],rbp
     1145eab:	00 
     1145eac:	48 89 ac 24 f0 03 00 	mov    QWORD PTR [rsp+0x3f0],rbp
     1145eb3:	00 
     1145eb4:	48 89 ac 24 f8 03 00 	mov    QWORD PTR [rsp+0x3f8],rbp
     1145ebb:	00 
     1145ebc:	48 89 ac 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rbp
     1145ec3:	00 
     1145ec4:	48 89 ac 24 08 04 00 	mov    QWORD PTR [rsp+0x408],rbp
     1145ecb:	00 
     1145ecc:	48 89 ac 24 40 04 00 	mov    QWORD PTR [rsp+0x440],rbp
     1145ed3:	00 
     1145ed4:	48 89 ac 24 48 04 00 	mov    QWORD PTR [rsp+0x448],rbp
     1145edb:	00 
     1145edc:	48 89 ac 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rbp
     1145ee3:	00 
     1145ee4:	48 89 ac 24 58 04 00 	mov    QWORD PTR [rsp+0x458],rbp

### 0x11cb1c5; FDE=(18654982, 18667010): mov    QWORD PTR [rbp+0x3b8],rax
     11cb16e:	e8 81 ed ff ff       	call   11c9ef4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf478>
     11cb173:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     11cb177:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
     11cb17c:	48 89 85 78 03 00 00 	mov    QWORD PTR [rbp+0x378],rax
     11cb183:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11cb187:	48 89 85 80 03 00 00 	mov    QWORD PTR [rbp+0x380],rax
     11cb18e:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
     11cb193:	48 89 85 88 03 00 00 	mov    QWORD PTR [rbp+0x388],rax
     11cb19a:	66 0f 57 c0          	xorpd  xmm0,xmm0
     11cb19e:	66 41 0f 11 04 24    	movupd XMMWORD PTR [r12],xmm0
     11cb1a4:	66 0f 11 85 a0 03 00 	movupd XMMWORD PTR [rbp+0x3a0],xmm0
     11cb1ab:	00 
     11cb1ac:	66 0f 11 85 90 03 00 	movupd XMMWORD PTR [rbp+0x390],xmm0
     11cb1b3:	00 
     11cb1b4:	c7 85 b0 03 00 00 00 	mov    DWORD PTR [rbp+0x3b0],0x3f800000
     11cb1bb:	00 80 3f 
     11cb1be:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11cb1c1:	49 83 27 00          	and    QWORD PTR [r15],0x0
     11cb1c5:	48 89 85 b8 03 00 00 	mov    QWORD PTR [rbp+0x3b8],rax
     11cb1cc:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     11cb1d0:	48 89 85 c0 03 00 00 	mov    QWORD PTR [rbp+0x3c0],rax
     11cb1d7:	4c 89 b5 c8 03 00 00 	mov    QWORD PTR [rbp+0x3c8],r14
     11cb1de:	48 8d bd d0 03 00 00 	lea    rdi,[rbp+0x3d0]
     11cb1e5:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
     11cb1ec:	00 
     11cb1ed:	48 89 de             	mov    rsi,rbx
     11cb1f0:	e8 47 ed ff ff       	call   11c9f3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf4c0>
     11cb1f5:	48 8d bd 48 04 00 00 	lea    rdi,[rbp+0x448]
     11cb1fc:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
     11cb203:	00 
     11cb204:	48 89 eb             	mov    rbx,rbp
     11cb207:	e8 23 3f 97 ff       	call   b3f12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c0cf>
     11cb20c:	66 0f 57 c0          	xorpd  xmm0,xmm0
     11cb210:	66 0f 11 83 68 04 00 	movupd XMMWORD PTR [rbx+0x468],xmm0
     11cb217:	00 
     11cb218:	66 0f 11 83 58 04 00 	movupd XMMWORD PTR [rbx+0x458],xmm0
     11cb21f:	00 
     11cb220:	48 83 a3 78 04 00 00 	and    QWORD PTR [rbx+0x478],0x0
     11cb227:	00 
     11cb228:	6a 01                	push   0x1
     11cb22a:	58                   	pop    rax
     11cb22b:	48 89 83 80 04 00 00 	mov    QWORD PTR [rbx+0x480],rax
     11cb232:	48 83 a3 88 04 00 00 	and    QWORD PTR [rbx+0x488],0x0
     11cb239:	00 
     11cb23a:	48 89 83 90 04 00 00 	mov    QWORD PTR [rbx+0x490],rax
     11cb241:	48 83 a3 98 04 00 00 	and    QWORD PTR [rbx+0x498],0x0
     11cb248:	00 

### 0x11f2602; FDE=(18805556, 18832116): mov    QWORD PTR [rbp+0x3b8],rax
     11f25ae:	00 
     11f25af:	f3 0f 7f 85 48 03 00 	movdqu XMMWORD PTR [rbp+0x348],xmm0
     11f25b6:	00 
     11f25b7:	f3 0f 7f 85 58 03 00 	movdqu XMMWORD PTR [rbp+0x358],xmm0
     11f25be:	00 
     11f25bf:	f3 0f 7f 85 68 03 00 	movdqu XMMWORD PTR [rbp+0x368],xmm0
     11f25c6:	00 
     11f25c7:	48 83 a5 80 03 00 00 	and    QWORD PTR [rbp+0x380],0x0
     11f25ce:	00 
     11f25cf:	48 8d 05 c2 5a 6a 00 	lea    rax,[rip+0x6a5ac2]        # 1898098 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4fd8>
     11f25d6:	48 89 85 78 03 00 00 	mov    QWORD PTR [rbp+0x378],rax
     11f25dd:	f3 0f 7f 85 88 03 00 	movdqu XMMWORD PTR [rbp+0x388],xmm0
     11f25e4:	00 
     11f25e5:	f3 0f 7f 85 98 03 00 	movdqu XMMWORD PTR [rbp+0x398],xmm0
     11f25ec:	00 
     11f25ed:	48 8d 05 04 d2 24 ff 	lea    rax,[rip+0xffffffffff24d204]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     11f25f4:	48 89 85 a8 03 00 00 	mov    QWORD PTR [rbp+0x3a8],rax
     11f25fb:	48 89 85 b0 03 00 00 	mov    QWORD PTR [rbp+0x3b0],rax
     11f2602:	48 89 85 b8 03 00 00 	mov    QWORD PTR [rbp+0x3b8],rax
     11f2609:	48 83 a5 c0 03 00 00 	and    QWORD PTR [rbp+0x3c0],0x0
     11f2610:	00 
     11f2611:	48 83 a5 d0 03 00 00 	and    QWORD PTR [rbp+0x3d0],0x0
     11f2618:	00 
     11f2619:	48 8d 05 60 d5 69 00 	lea    rax,[rip+0x69d560]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     11f2620:	48 89 85 c8 03 00 00 	mov    QWORD PTR [rbp+0x3c8],rax
     11f2627:	48 89 ef             	mov    rdi,rbp
     11f262a:	48 81 c7 08 04 00 00 	add    rdi,0x408
     11f2631:	f3 0f 7f 85 d8 03 00 	movdqu XMMWORD PTR [rbp+0x3d8],xmm0
     11f2638:	00 
     11f2639:	f3 0f 7f 85 e8 03 00 	movdqu XMMWORD PTR [rbp+0x3e8],xmm0
     11f2640:	00 
     11f2641:	f3 0f 7f 85 f8 03 00 	movdqu XMMWORD PTR [rbp+0x3f8],xmm0
     11f2648:	00 
     11f2649:	e8 2a b3 ba ff       	call   d9d978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a9fe>
     11f264e:	49 89 6f 10          	mov    QWORD PTR [r15+0x10],rbp
     11f2652:	80 7c 24 40 00       	cmp    BYTE PTR [rsp+0x40],0x0
     11f2657:	74 3d                	je     11f2696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37c1a>
     11f2659:	6a 50                	push   0x50
     11f265b:	5f                   	pop    rdi
     11f265c:	e8 9f b8 5f 00       	call   17edf00 <_Znwm@plt>
     11f2661:	49 89 c6             	mov    r14,rax
     11f2664:	66 0f ef c0          	pxor   xmm0,xmm0
     11f2668:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     11f266d:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     11f2671:	c7 40 20 00 00 80 3f 	mov    DWORD PTR [rax+0x20],0x3f800000
     11f2678:	0f 28 8c 24 e0 00 00 	movaps xmm1,XMMWORD PTR [rsp+0xe0]
     11f267f:	00 

### 0x1228af8; FDE=(19039932, 19042774): mov    BYTE PTR [rsp+0x3b8],al
     1228ab3:	e8 88 54 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1228ab8:	4b 8b 84 3e 78 01 00 	mov    rax,QWORD PTR [r14+r15*1+0x178]
     1228abf:	00 
     1228ac0:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
     1228ac7:	00 
     1228ac8:	43 8a 84 3e 88 01 00 	mov    al,BYTE PTR [r14+r15*1+0x188]
     1228acf:	00 
     1228ad0:	88 45 58             	mov    BYTE PTR [rbp+0x58],al
     1228ad3:	4b 8b 84 3e 80 01 00 	mov    rax,QWORD PTR [r14+r15*1+0x180]
     1228ada:	00 
     1228adb:	48 89 45 50          	mov    QWORD PTR [rbp+0x50],rax
     1228adf:	43 8a 84 3e 98 01 00 	mov    al,BYTE PTR [r14+r15*1+0x198]
     1228ae6:	00 
     1228ae7:	88 45 68             	mov    BYTE PTR [rbp+0x68],al
     1228aea:	4b 8b 84 3e 90 01 00 	mov    rax,QWORD PTR [r14+r15*1+0x190]
     1228af1:	00 
     1228af2:	48 89 45 60          	mov    QWORD PTR [rbp+0x60],rax
     1228af6:	31 c0                	xor    eax,eax
     1228af8:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     1228aff:	88 84 24 f8 04 00 00 	mov    BYTE PTR [rsp+0x4f8],al
     1228b06:	88 84 24 00 05 00 00 	mov    BYTE PTR [rsp+0x500],al
     1228b0d:	88 84 24 58 05 00 00 	mov    BYTE PTR [rsp+0x558],al
     1228b14:	f3 43 0f 10 84 3e a8 	movss  xmm0,DWORD PTR [r14+r15*1+0x2a8]
     1228b1b:	02 00 00 
     1228b1e:	f3 0f 11 84 24 60 05 	movss  DWORD PTR [rsp+0x560],xmm0
     1228b25:	00 00 
     1228b27:	43 8a 8c 3e c0 02 00 	mov    cl,BYTE PTR [r14+r15*1+0x2c0]
     1228b2e:	00 
     1228b2f:	88 8c 24 64 05 00 00 	mov    BYTE PTR [rsp+0x564],cl
     1228b36:	43 8a 8c 3e c1 02 00 	mov    cl,BYTE PTR [r14+r15*1+0x2c1]
     1228b3d:	00 
     1228b3e:	88 8c 24 65 05 00 00 	mov    BYTE PTR [rsp+0x565],cl
     1228b45:	43 8a 8c 3e c2 02 00 	mov    cl,BYTE PTR [r14+r15*1+0x2c2]
     1228b4c:	00 
     1228b4d:	88 8c 24 66 05 00 00 	mov    BYTE PTR [rsp+0x566],cl
     1228b54:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     1228b59:	8a 8a 79 06 00 00    	mov    cl,BYTE PTR [rdx+0x679]
     1228b5f:	88 8c 24 67 05 00 00 	mov    BYTE PTR [rsp+0x567],cl
     1228b66:	8a 8a 7b 06 00 00    	mov    cl,BYTE PTR [rdx+0x67b]
     1228b6c:	88 8c 24 68 05 00 00 	mov    BYTE PTR [rsp+0x568],cl
     1228b73:	88 84 24 69 05 00 00 	mov    BYTE PTR [rsp+0x569],al
     1228b7a:	4b 8b 8c 3e 80 02 00 	mov    rcx,QWORD PTR [r14+r15*1+0x280]
     1228b81:	00 
     1228b82:	4b 8b 94 3e 85 02 00 	mov    rdx,QWORD PTR [r14+r15*1+0x285]
     1228b89:	00 
     1228b8a:	48 89 95 29 02 00 00 	mov    QWORD PTR [rbp+0x229],rdx
     1228b91:	48 89 8d 24 02 00 00 	mov    QWORD PTR [rbp+0x224],rcx

### 0x1258e0c; FDE=(19238385, 19239149): mov    QWORD PTR [rsp+0x3b8],rax
     1258dd6:	00 00 
     1258dd8:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     1258ddd:	75 0d                	jne    1258dec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e370>
     1258ddf:	48 89 d8             	mov    rax,rbx
     1258de2:	48 83 c4 50          	add    rsp,0x50
     1258de6:	5b                   	pop    rbx
     1258de7:	41 5e                	pop    r14
     1258de9:	41 5f                	pop    r15
     1258deb:	c3                   	ret
     1258dec:	e8 bf 6c 59 00       	call   17efab0 <__stack_chk_fail@plt>
     1258df1:	41 57                	push   r15
     1258df3:	41 56                	push   r14
     1258df5:	53                   	push   rbx
     1258df6:	48 81 ec c0 03 00 00 	sub    rsp,0x3c0
     1258dfd:	49 89 f6             	mov    r14,rsi
     1258e00:	48 89 fb             	mov    rbx,rdi
     1258e03:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1258e0a:	00 00 
     1258e0c:	48 89 84 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rax
     1258e13:	00 
     1258e14:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     1258e19:	4c 89 ff             	mov    rdi,r15
     1258e1c:	e8 1d 85 47 00       	call   16d133e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x854aa>
     1258e21:	4c 89 f7             	mov    rdi,r14
     1258e24:	4c 89 fe             	mov    rsi,r15
     1258e27:	e8 82 8a 47 00       	call   16d18ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85a1a>
     1258e2c:	4c 89 ff             	mov    rdi,r15
     1258e2f:	e8 f8 8c 47 00       	call   16d1b2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85c98>
     1258e34:	4c 89 f7             	mov    rdi,r14
     1258e37:	48 89 de             	mov    rsi,rbx
     1258e3a:	e8 55 a0 bd ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
     1258e3f:	48 8d 73 18          	lea    rsi,[rbx+0x18]
     1258e43:	49 8d 7e 18          	lea    rdi,[r14+0x18]
     1258e47:	e8 48 a0 bd ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
     1258e4c:	48 8d 73 30          	lea    rsi,[rbx+0x30]
     1258e50:	49 8d 7e 30          	lea    rdi,[r14+0x30]
     1258e54:	e8 3b a0 bd ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
     1258e59:	48 8d 73 48          	lea    rsi,[rbx+0x48]
     1258e5d:	49 8d 7e 48          	lea    rdi,[r14+0x48]
     1258e61:	e8 2e a0 bd ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
     1258e66:	48 8d 73 60          	lea    rsi,[rbx+0x60]
     1258e6a:	49 8d 7e 60          	lea    rdi,[r14+0x60]
     1258e6e:	e8 21 a0 bd ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
     1258e73:	48 8d 73 78          	lea    rsi,[rbx+0x78]
     1258e77:	49 8d 7e 78          	lea    rdi,[r14+0x78]
     1258e7b:	e8 14 a0 bd ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
     1258e80:	bf 90 00 00 00       	mov    edi,0x90

### 0x1283bc7; FDE=(19412762, 19415636): cmp    BYTE PTR [rsp+0x3b8],bl
     1283b71:	eb 38                	jmp    1283bab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc912f>
     1283b73:	31 db                	xor    ebx,ebx
     1283b75:	88 9c 24 18 03 00 00 	mov    BYTE PTR [rsp+0x318],bl
     1283b7c:	88 9c 24 58 03 00 00 	mov    BYTE PTR [rsp+0x358],bl
     1283b83:	c6 84 24 f8 01 00 00 	mov    BYTE PTR [rsp+0x1f8],0x1
     1283b8a:	01 
     1283b8b:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     1283b92:	00 
     1283b93:	4c 8d b4 24 18 03 00 	lea    r14,[rsp+0x318]
     1283b9a:	00 
     1283b9b:	4c 89 f6             	mov    rsi,r14
     1283b9e:	e8 0b ad e3 ff       	call   10be8ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285cc4>
     1283ba3:	4c 89 f7             	mov    rdi,r14
     1283ba6:	e8 91 a8 e3 ff       	call   10be43c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285852>
     1283bab:	8a 84 24 60 03 00 00 	mov    al,BYTE PTR [rsp+0x360]
     1283bb2:	88 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],al
     1283bb9:	88 9c 24 c0 00 00 00 	mov    BYTE PTR [rsp+0xc0],bl
     1283bc0:	88 9c 24 10 01 00 00 	mov    BYTE PTR [rsp+0x110],bl
     1283bc7:	38 9c 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],bl
     1283bce:	74 1d                	je     1283bed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9171>
     1283bd0:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1283bd7:	00 
     1283bd8:	48 8d b4 24 68 03 00 	lea    rsi,[rsp+0x368]
     1283bdf:	00 
     1283be0:	e8 03 a9 e3 ff       	call   10be4e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2858fe>
     1283be5:	c6 84 24 10 01 00 00 	mov    BYTE PTR [rsp+0x110],0x1
     1283bec:	01 
     1283bed:	8a 84 24 80 02 00 00 	mov    al,BYTE PTR [rsp+0x280]
     1283bf4:	88 84 24 18 01 00 00 	mov    BYTE PTR [rsp+0x118],al
     1283bfb:	88 9c 24 20 01 00 00 	mov    BYTE PTR [rsp+0x120],bl
     1283c02:	88 9c 24 58 01 00 00 	mov    BYTE PTR [rsp+0x158],bl
     1283c09:	38 9c 24 c0 02 00 00 	cmp    BYTE PTR [rsp+0x2c0],bl
     1283c10:	74 1d                	je     1283c2f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc91b3>
     1283c12:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1283c19:	00 
     1283c1a:	48 8d b4 24 88 02 00 	lea    rsi,[rsp+0x288]
     1283c21:	00 
     1283c22:	e8 03 0d 0c 00       	call   134492a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x189eae>
     1283c27:	c6 84 24 58 01 00 00 	mov    BYTE PTR [rsp+0x158],0x1
     1283c2e:	01 
     1283c2f:	8a 84 24 f8 01 00 00 	mov    al,BYTE PTR [rsp+0x1f8]
     1283c36:	88 84 24 60 01 00 00 	mov    BYTE PTR [rsp+0x160],al
     1283c3d:	88 9c 24 68 01 00 00 	mov    BYTE PTR [rsp+0x168],bl
     1283c44:	88 9c 24 a8 01 00 00 	mov    BYTE PTR [rsp+0x1a8],bl
     1283c4b:	38 9c 24 40 02 00 00 	cmp    BYTE PTR [rsp+0x240],bl
     1283c52:	74 5f                	je     1283cb3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9237>
     1283c54:	8a 84 24 00 02 00 00 	mov    al,BYTE PTR [rsp+0x200]

### 0x1303d04; FDE=(19937174, 19938842): mov    BYTE PTR [rsp+0x3b8],cl
     1303cbc:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
     1303cc3:	00 
     1303cc4:	e8 9b 1a 7d ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
     1303cc9:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
     1303cd0:	00 
     1303cd1:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
     1303cd8:	00 
     1303cd9:	e8 86 1a 7d ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
     1303cde:	0f b7 85 60 01 00 00 	movzx  eax,WORD PTR [rbp+0x160]
     1303ce5:	66 89 84 24 b0 03 00 	mov    WORD PTR [rsp+0x3b0],ax
     1303cec:	00 
     1303ced:	48 89 ef             	mov    rdi,rbp
     1303cf0:	e8 f5 50 ef ff       	call   11f8dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e36e>
     1303cf5:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
     1303cf9:	4d 89 e5             	mov    r13,r12
     1303cfc:	a8 10                	test   al,0x10
     1303cfe:	74 0b                	je     1303d0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14928f>
     1303d00:	41 8a 4e 38          	mov    cl,BYTE PTR [r14+0x38]
     1303d04:	88 8c 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],cl
     1303d0b:	a8 08                	test   al,0x8
     1303d0d:	74 57                	je     1303d66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1492ea>
     1303d0f:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     1303d13:	48 85 c0             	test   rax,rax
     1303d16:	48 8d 0d ab 58 6a 00 	lea    rcx,[rip+0x6a58ab]        # 19a95c8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x72210>
     1303d1d:	48 0f 45 c8          	cmovne rcx,rax
     1303d21:	8b 51 10             	mov    edx,DWORD PTR [rcx+0x10]
     1303d24:	89 d0                	mov    eax,edx
     1303d26:	83 e0 01             	and    eax,0x1
     1303d29:	f7 d8                	neg    eax
     1303d2b:	0f b6 71 18          	movzx  esi,BYTE PTR [rcx+0x18]
     1303d2f:	81 ce 00 01 00 00    	or     esi,0x100
     1303d35:	21 c6                	and    esi,eax
     1303d37:	c1 e2 1e             	shl    edx,0x1e
     1303d3a:	c1 fa 1f             	sar    edx,0x1f
     1303d3d:	0f b6 41 19          	movzx  eax,BYTE PTR [rcx+0x19]
     1303d41:	c1 e0 10             	shl    eax,0x10
     1303d44:	0d 00 00 00 01       	or     eax,0x1000000
     1303d49:	21 d0                	and    eax,edx
     1303d4b:	09 f0                	or     eax,esi
     1303d4d:	80 bc 24 bd 03 00 00 	cmp    BYTE PTR [rsp+0x3bd],0x0
     1303d54:	00 
     1303d55:	75 08                	jne    1303d5f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1492e3>
     1303d57:	c6 84 24 bd 03 00 00 	mov    BYTE PTR [rsp+0x3bd],0x1
     1303d5e:	01 
     1303d5f:	89 84 24 b9 03 00 00 	mov    DWORD PTR [rsp+0x3b9],eax
     1303d66:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
     1303d6d:	00 

### 0x1333649; FDE=(20131328, 20138970): movdqu XMMWORD PTR [rbx+0x3b8],xmm0
     1333601:	4c 8d b3 98 03 00 00 	lea    r14,[rbx+0x398]
     1333608:	6a 01                	push   0x1
     133360a:	59                   	pop    rcx
     133360b:	4c 89 f7             	mov    rdi,r14
     133360e:	4c 89 fe             	mov    rsi,r15
     1333611:	89 ca                	mov    edx,ecx
     1333613:	41 89 c8             	mov    r8d,ecx
     1333616:	49 89 e9             	mov    r9,rbp
     1333619:	e8 66 88 f9 ff       	call   12cbe84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x111408>
     133361e:	4c 89 bc 24 38 01 00 	mov    QWORD PTR [rsp+0x138],r15
     1333625:	00 
     1333626:	48 8d bb a8 03 00 00 	lea    rdi,[rbx+0x3a8]
     133362d:	66 0f 6f 44 24 50    	movdqa xmm0,XMMWORD PTR [rsp+0x50]
     1333633:	66 48 0f 7e c6       	movq   rsi,xmm0
     1333638:	48 89 bc 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rdi
     133363f:	00 
     1333640:	e8 c9 42 fa ff       	call   12d790e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11ce92>
     1333645:	66 0f ef c0          	pxor   xmm0,xmm0
     1333649:	f3 0f 7f 83 b8 03 00 	movdqu XMMWORD PTR [rbx+0x3b8],xmm0
     1333650:	00 
     1333651:	0f 28 84 24 e0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xe0]
     1333658:	00 
     1333659:	0f 11 83 c8 03 00 00 	movups XMMWORD PTR [rbx+0x3c8],xmm0
     1333660:	4c 8d bb d8 03 00 00 	lea    r15,[rbx+0x3d8]
     1333667:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     133366e:	00 
     133366f:	4c 89 ff             	mov    rdi,r15
     1333672:	e8 db dc 97 ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
     1333677:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     133367c:	48 89 83 40 04 00 00 	mov    QWORD PTR [rbx+0x440],rax
     1333683:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     1333688:	48 89 83 48 04 00 00 	mov    QWORD PTR [rbx+0x448],rax
     133368f:	83 a3 50 04 00 00 00 	and    DWORD PTR [rbx+0x450],0x0
     1333696:	41 8a 84 24 61 01 00 	mov    al,BYTE PTR [r12+0x161]
     133369d:	00 
     133369e:	88 83 54 04 00 00    	mov    BYTE PTR [rbx+0x454],al
     13336a4:	66 83 a3 55 04 00 00 	and    WORD PTR [rbx+0x455],0x0
     13336ab:	00 
     13336ac:	48 8d bb 58 04 00 00 	lea    rdi,[rbx+0x458]
     13336b3:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
     13336ba:	00 
     13336bb:	e8 36 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336c0:	48 8d bb 68 04 00 00 	lea    rdi,[rbx+0x468]
     13336c7:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
     13336ce:	00 
     13336cf:	e8 22 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     13336d4:	48 8d bb 78 04 00 00 	lea    rdi,[rbx+0x478]

### 0x133a1df; FDE=(20160970, 20161124): cmp    QWORD PTR [rdi+0x3b8],0x0
     133a1a8:	48 89 df             	mov    rdi,rbx
     133a1ab:	48 83 c4 08          	add    rsp,0x8
     133a1af:	5b                   	pop    rbx
     133a1b0:	41 5e                	pop    r14
     133a1b2:	e9 2b e9 ff ff       	jmp    1338ae2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e066>
     133a1b7:	cc                   	int3
     133a1b8:	53                   	push   rbx
     133a1b9:	48 89 fb             	mov    rbx,rdi
     133a1bc:	e8 23 fe ff ff       	call   1339fe4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f568>
     133a1c1:	48 89 df             	mov    rdi,rbx
     133a1c4:	5b                   	pop    rbx
     133a1c5:	e9 56 3d 4b 00       	jmp    17edf20 <_ZdlPv@plt>
     133a1ca:	41 56                	push   r14
     133a1cc:	53                   	push   rbx
     133a1cd:	48 83 ec 18          	sub    rsp,0x18
     133a1d1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133a1d8:	00 00 
     133a1da:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     133a1df:	48 83 bf b8 03 00 00 	cmp    QWORD PTR [rdi+0x3b8],0x0
     133a1e6:	00 
     133a1e7:	75 49                	jne    133a232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f7b6>
     133a1e9:	48 89 fb             	mov    rbx,rdi
     133a1ec:	48 8b bf 30 01 00 00 	mov    rdi,QWORD PTR [rdi+0x130]
     133a1f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     133a1f6:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     133a1fc:	48 8b b3 c0 02 00 00 	mov    rsi,QWORD PTR [rbx+0x2c0]
     133a203:	48 85 f6             	test   rsi,rsi
     133a206:	74 42                	je     133a24a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f7ce>
     133a208:	48 81 c3 b8 03 00 00 	add    rbx,0x3b8
     133a20f:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
     133a212:	49 89 e6             	mov    r14,rsp
     133a215:	4c 89 f7             	mov    rdi,r14
     133a218:	48 89 c2             	mov    rdx,rax
     133a21b:	ff 51 30             	call   QWORD PTR [rcx+0x30]
     133a21e:	48 89 df             	mov    rdi,rbx
     133a221:	4c 89 f6             	mov    rsi,r14
     133a224:	e8 f3 f5 77 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     133a229:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     133a22d:	e8 54 42 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     133a232:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133a239:	00 00 
     133a23b:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     133a240:	75 1d                	jne    133a25f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f7e3>
     133a242:	48 83 c4 18          	add    rsp,0x18
     133a246:	5b                   	pop    rbx
     133a247:	41 5e                	pop    r14
     133a249:	c3                   	ret

### 0x135f1fd; FDE=(20303958, 20319259): mov    BYTE PTR [rsp+0x3b8],al
     135f1c1:	4c 89 ef             	mov    rdi,r13
     135f1c4:	48 89 de             	mov    rsi,rbx
     135f1c7:	e8 ec 1b 00 00       	call   1360db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a633c>
     135f1cc:	48 8b 84 24 08 02 00 	mov    rax,QWORD PTR [rsp+0x208]
     135f1d3:	00 
     135f1d4:	48 83 c3 18          	add    rbx,0x18
     135f1d8:	48 39 c3             	cmp    rbx,rax
     135f1db:	74 14                	je     135f1f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4775>
     135f1dd:	48 8d 4b 18          	lea    rcx,[rbx+0x18]
     135f1e1:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     135f1e5:	48 89 cb             	mov    rbx,rcx
     135f1e8:	7e ee                	jle    135f1d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a475c>
     135f1ea:	48 83 c1 e8          	add    rcx,0xffffffffffffffe8
     135f1ee:	48 89 c8             	mov    rax,rcx
     135f1f1:	48 89 c3             	mov    rbx,rax
     135f1f4:	4c 39 f0             	cmp    rax,r14
     135f1f7:	75 c8                	jne    135f1c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4745>
     135f1f9:	8a 44 24 2f          	mov    al,BYTE PTR [rsp+0x2f]
     135f1fd:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     135f204:	48 63 84 24 e8 00 00 	movsxd rax,DWORD PTR [rsp+0xe8]
     135f20b:	00 
     135f20c:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
     135f213:	00 
     135f214:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     135f21b:	00 
     135f21c:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f21f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135f224:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f227:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f22a:	49 89 c6             	mov    r14,rax
     135f22d:	4c 89 a4 24 90 02 00 	mov    QWORD PTR [rsp+0x290],r12
     135f234:	00 
     135f235:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f23c:	00 
     135f23d:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
     135f244:	00 
     135f245:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     135f24a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f24d:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135f250:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135f257:	00 
     135f258:	48 89 c6             	mov    rsi,rax
     135f25b:	e8 30 b0 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f260:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
     135f265:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
     135f26a:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     135f271:	00 

### 0x1391732; FDE=(20517556, 20519662): mov    BYTE PTR [rsp+0x3b8],r12b
     13916ea:	44 88 a4 24 f8 02 00 	mov    BYTE PTR [rsp+0x2f8],r12b
     13916f1:	00 
     13916f2:	44 88 a4 24 18 03 00 	mov    BYTE PTR [rsp+0x318],r12b
     13916f9:	00 
     13916fa:	44 88 a4 24 20 03 00 	mov    BYTE PTR [rsp+0x320],r12b
     1391701:	00 
     1391702:	44 88 a4 24 40 03 00 	mov    BYTE PTR [rsp+0x340],r12b
     1391709:	00 
     139170a:	44 88 a4 24 48 03 00 	mov    BYTE PTR [rsp+0x348],r12b
     1391711:	00 
     1391712:	44 88 a4 24 68 03 00 	mov    BYTE PTR [rsp+0x368],r12b
     1391719:	00 
     139171a:	44 88 a4 24 70 03 00 	mov    BYTE PTR [rsp+0x370],r12b
     1391721:	00 
     1391722:	44 88 a4 24 90 03 00 	mov    BYTE PTR [rsp+0x390],r12b
     1391729:	00 
     139172a:	44 88 a4 24 98 03 00 	mov    BYTE PTR [rsp+0x398],r12b
     1391731:	00 
     1391732:	44 88 a4 24 b8 03 00 	mov    BYTE PTR [rsp+0x3b8],r12b
     1391739:	00 
     139173a:	44 88 a4 24 c0 03 00 	mov    BYTE PTR [rsp+0x3c0],r12b
     1391741:	00 
     1391742:	44 88 a4 24 e0 03 00 	mov    BYTE PTR [rsp+0x3e0],r12b
     1391749:	00 
     139174a:	44 88 a4 24 e8 03 00 	mov    BYTE PTR [rsp+0x3e8],r12b
     1391751:	00 
     1391752:	44 88 a4 24 08 04 00 	mov    BYTE PTR [rsp+0x408],r12b
     1391759:	00 
     139175a:	44 88 a4 24 10 04 00 	mov    BYTE PTR [rsp+0x410],r12b
     1391761:	00 
     1391762:	44 88 a4 24 30 04 00 	mov    BYTE PTR [rsp+0x430],r12b
     1391769:	00 
     139176a:	44 88 a4 24 38 04 00 	mov    BYTE PTR [rsp+0x438],r12b
     1391771:	00 
     1391772:	44 88 a4 24 58 04 00 	mov    BYTE PTR [rsp+0x458],r12b
     1391779:	00 
     139177a:	44 88 a4 24 60 04 00 	mov    BYTE PTR [rsp+0x460],r12b
     1391781:	00 
     1391782:	44 88 a4 24 80 04 00 	mov    BYTE PTR [rsp+0x480],r12b
     1391789:	00 
     139178a:	44 88 a4 24 88 04 00 	mov    BYTE PTR [rsp+0x488],r12b
     1391791:	00 
     1391792:	44 88 a4 24 a8 04 00 	mov    BYTE PTR [rsp+0x4a8],r12b
     1391799:	00 
     139179a:	44 88 a4 24 b0 04 00 	mov    BYTE PTR [rsp+0x4b0],r12b
     13917a1:	00 
     13917a2:	44 88 a4 24 d0 04 00 	mov    BYTE PTR [rsp+0x4d0],r12b

### 0x1446429; FDE=(21258972, 21262332): mov    QWORD PTR [r12+0x3b8],r15
     14463e1:	00 
     14463e2:	41 88 84 24 40 02 00 	mov    BYTE PTR [r12+0x240],al
     14463e9:	00 
     14463ea:	41 88 84 24 70 02 00 	mov    BYTE PTR [r12+0x270],al
     14463f1:	00 
     14463f2:	4d 8d ac 24 80 02 00 	lea    r13,[r12+0x280]
     14463f9:	00 
     14463fa:	4c 89 ef             	mov    rdi,r13
     14463fd:	e8 e4 6b 66 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     1446402:	49 81 c6 90 01 00 00 	add    r14,0x190
     1446409:	31 c0                	xor    eax,eax
     144640b:	41 88 84 24 40 03 00 	mov    BYTE PTR [r12+0x340],al
     1446412:	00 
     1446413:	41 88 84 24 a0 03 00 	mov    BYTE PTR [r12+0x3a0],al
     144641a:	00 
     144641b:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
     1446420:	41 0f 11 84 24 a8 03 	movups XMMWORD PTR [r12+0x3a8],xmm0
     1446427:	00 00 
     1446429:	4d 89 bc 24 b8 03 00 	mov    QWORD PTR [r12+0x3b8],r15
     1446430:	00 
     1446431:	4d 8d bc 24 c0 03 00 	lea    r15,[r12+0x3c0]
     1446438:	00 
     1446439:	4c 89 ff             	mov    rdi,r15
     144643c:	4c 89 f6             	mov    rsi,r14
     144643f:	4c 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],r13
     1446444:	e8 47 3e 63 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1446449:	4d 8d b4 24 f0 03 00 	lea    r14,[r12+0x3f0]
     1446450:	00 
     1446451:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
     1446458:	00 
     1446459:	4c 89 f7             	mov    rdi,r14
     144645c:	e8 97 2d 74 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
     1446461:	49 89 9c 24 20 04 00 	mov    QWORD PTR [r12+0x420],rbx
     1446468:	00 
     1446469:	31 c0                	xor    eax,eax
     144646b:	41 88 84 24 28 04 00 	mov    BYTE PTR [r12+0x428],al
     1446472:	00 
     1446473:	41 88 84 24 b8 04 00 	mov    BYTE PTR [r12+0x4b8],al
     144647a:	00 
     144647b:	48 8d 8c 24 80 05 00 	lea    rcx,[rsp+0x580]
     1446482:	00 
     1446483:	c7 41 f0 01 00 00 00 	mov    DWORD PTR [rcx-0x10],0x1
     144648a:	48 8d 05 d7 b5 42 00 	lea    rax,[rip+0x42b5d7]        # 1871a68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e150>
     1446491:	48 89 01             	mov    QWORD PTR [rcx],rax
     1446494:	4c 89 61 08          	mov    QWORD PTR [rcx+0x8],r12
     1446498:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     144649c:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]

### 0x1475492; FDE=(21446900, 21452876): mov    DWORD PTR [rsp+0x3b8],ebp
     1475446:	5d                   	pop    rbp
     1475447:	89 ac 24 78 03 00 00 	mov    DWORD PTR [rsp+0x378],ebp
     147544e:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     1475453:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1475456:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
     147545c:	48 f7 d8             	neg    rax
     147545f:	48 89 84 24 80 03 00 	mov    QWORD PTR [rsp+0x380],rax
     1475466:	00 
     1475467:	31 c9                	xor    ecx,ecx
     1475469:	88 8c 24 88 03 00 00 	mov    BYTE PTR [rsp+0x388],cl
     1475470:	88 8c 24 90 03 00 00 	mov    BYTE PTR [rsp+0x390],cl
     1475477:	c6 84 24 98 03 00 00 	mov    BYTE PTR [rsp+0x398],0x2
     147547e:	02 
     147547f:	48 8d 84 24 a0 03 00 	lea    rax,[rsp+0x3a0]
     1475486:	00 
     1475487:	0f 57 c0             	xorps  xmm0,xmm0
     147548a:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     147548d:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1475492:	89 ac 24 b8 03 00 00 	mov    DWORD PTR [rsp+0x3b8],ebp
     1475499:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     147549e:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
     14754a5:	00 
     14754a6:	88 8c 24 c8 03 00 00 	mov    BYTE PTR [rsp+0x3c8],cl
     14754ad:	88 8c 24 d0 03 00 00 	mov    BYTE PTR [rsp+0x3d0],cl
     14754b4:	c6 84 24 d8 03 00 00 	mov    BYTE PTR [rsp+0x3d8],0x3
     14754bb:	03 
     14754bc:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
     14754c3:	00 
     14754c4:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
     14754cb:	00 
     14754cc:	6a 02                	push   0x2
     14754ce:	5a                   	pop    rdx
     14754cf:	e8 16 0c 00 00       	call   14760ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb66e>
     14754d4:	48 8b 94 24 10 07 00 	mov    rdx,QWORD PTR [rsp+0x710]
     14754db:	00 
     14754dc:	48 8b 8c 24 18 07 00 	mov    rcx,QWORD PTR [rsp+0x718]
     14754e3:	00 
     14754e4:	48 29 d1             	sub    rcx,rdx
     14754e7:	48 c1 f9 06          	sar    rcx,0x6
     14754eb:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     14754ef:	48 89 de             	mov    rsi,rbx
     14754f2:	e8 f1 34 0e 00       	call   15589e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39df6c>
     14754f7:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
     14754fe:	00 
     14754ff:	e8 16 f0 da ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     1475504:	6a 40                	push   0x40
     1475506:	5b                   	pop    rbx

### 0x1497cd6; FDE=(21591706, 21596010): mov    BYTE PTR [rsp+0x3b8],0x1
     1497c88:	e8 fb 26 ff ff       	call   148a388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf90c>
     1497c8d:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
     1497c94:	00 
     1497c95:	48 89 df             	mov    rdi,rbx
     1497c98:	e8 09 58 a4 ff       	call   edd4a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa48bc>
     1497c9d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1497ca2:	e9 6d fe ff ff       	jmp    1497b14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd098>
     1497ca7:	83 fa 06             	cmp    edx,0x6
     1497caa:	0f 84 f0 05 00 00    	je     14982a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd824>
     1497cb0:	83 fa 08             	cmp    edx,0x8
     1497cb3:	0f 84 6c 05 00 00    	je     1498225 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd7a9>
     1497cb9:	83 fa 07             	cmp    edx,0x7
     1497cbc:	0f 85 d5 01 00 00    	jne    1497e97 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd41b>
     1497cc2:	0f 57 c0             	xorps  xmm0,xmm0
     1497cc5:	0f 29 84 24 a0 03 00 	movaps XMMWORD PTR [rsp+0x3a0],xmm0
     1497ccc:	00 
     1497ccd:	48 83 a4 24 b0 03 00 	and    QWORD PTR [rsp+0x3b0],0x0
     1497cd4:	00 00 
     1497cd6:	c6 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],0x1
     1497cdd:	01 
     1497cde:	0f 16 05 63 71 ef fe 	movhps xmm0,QWORD PTR [rip+0xfffffffffeef7163]        # 38ee48 <_ZTSSt12bad_any_cast@@Base-0x1380>
     1497ce5:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
     1497cec:	00 
     1497ced:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
     1497cf0:	0f 28 05 19 5f ef fe 	movaps xmm0,XMMWORD PTR [rip+0xfffffffffeef5f19]        # 38dc10 <_ZTSSt12bad_any_cast@@Base-0x25b8>
     1497cf7:	0f 29 46 10          	movaps XMMWORD PTR [rsi+0x10],xmm0
     1497cfb:	66 0f 28 05 2d 5c ef 	movapd xmm0,XMMWORD PTR [rip+0xfffffffffeef5c2d]        # 38d930 <_ZTSSt12bad_any_cast@@Base-0x2898>
     1497d02:	fe 
     1497d03:	66 0f 29 46 20       	movapd XMMWORD PTR [rsi+0x20],xmm0
     1497d08:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     1497d0f:	00 
     1497d10:	6a 03                	push   0x3
     1497d12:	5a                   	pop    rdx
     1497d13:	e8 1a 0e ff ff       	call   1488b32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce0b6>
     1497d18:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1497d1f:	00 
     1497d20:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
     1497d27:	00 
     1497d28:	e8 5b 26 ff ff       	call   148a388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf90c>
     1497d2d:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     1497d34:	00 
     1497d35:	48 89 df             	mov    rdi,rbx
     1497d38:	e8 69 57 a4 ff       	call   edd4a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa48bc>
     1497d3d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     1497d44:	00 
     1497d45:	e9 d6 05 00 00       	jmp    1498320 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd8a4>
     1497d4a:	83 fa 0d             	cmp    edx,0xd

### 0x14982c1; FDE=(21591706, 21596010): mov    BYTE PTR [rsp+0x3b8],0x1
     1498276:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
     149827d:	00 
     149827e:	e8 05 21 ff ff       	call   148a388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf90c>
     1498283:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
     149828a:	00 
     149828b:	48 89 df             	mov    rdi,rbx
     149828e:	e8 13 52 a4 ff       	call   edd4a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa48bc>
     1498293:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     149829a:	00 
     149829b:	e9 74 f8 ff ff       	jmp    1497b14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd098>
     14982a0:	0f 57 c0             	xorps  xmm0,xmm0
     14982a3:	0f 29 84 24 a0 03 00 	movaps XMMWORD PTR [rsp+0x3a0],xmm0
     14982aa:	00 
     14982ab:	48 83 a4 24 b0 03 00 	and    QWORD PTR [rsp+0x3b0],0x0
     14982b2:	00 00 
     14982b4:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
     14982bb:	00 
     14982bc:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     14982c1:	c6 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],0x1
     14982c8:	01 
     14982c9:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
     14982cc:	66 0f 28 05 8c 57 ef 	movapd xmm0,XMMWORD PTR [rip+0xfffffffffeef578c]        # 38da60 <_ZTSSt12bad_any_cast@@Base-0x2768>
     14982d3:	fe 
     14982d4:	66 0f 11 46 18       	movupd XMMWORD PTR [rsi+0x18],xmm0
     14982d9:	66 0f 11 46 28       	movupd XMMWORD PTR [rsi+0x28],xmm0
     14982de:	48 83 66 38 00       	and    QWORD PTR [rsi+0x38],0x0
     14982e3:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
     14982ea:	00 
     14982eb:	6a 04                	push   0x4
     14982ed:	5a                   	pop    rdx
     14982ee:	e8 3f 08 ff ff       	call   1488b32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce0b6>
     14982f3:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14982fa:	00 
     14982fb:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
     1498302:	00 
     1498303:	e8 80 20 ff ff       	call   148a388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf90c>
     1498308:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     149830f:	00 
     1498310:	48 89 df             	mov    rdi,rbx
     1498313:	e8 8e 51 a4 ff       	call   edd4a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa48bc>
     1498318:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
     149831f:	00 
     1498320:	e8 03 34 5e ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1498325:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     149832c:	00 
     149832d:	e9 ef f7 ff ff       	jmp    1497b21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd0a5>
     1498332:	0f 57 c0             	xorps  xmm0,xmm0

### 0x14b9a13; FDE=(21729778, 21733679): mov    QWORD PTR [rsp+0x3b8],rax
     14b99c6:	4c 89 ef             	mov    rdi,r13
     14b99c9:	4c 89 f6             	mov    rsi,r14
     14b99cc:	e8 bf 08 5c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14b99d1:	4c 8d b4 24 70 03 00 	lea    r14,[rsp+0x370]
     14b99d8:	00 
     14b99d9:	4c 89 f7             	mov    rdi,r14
     14b99dc:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     14b99e1:	e8 aa 08 5c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14b99e6:	89 ac 24 a0 03 00 00 	mov    DWORD PTR [rsp+0x3a0],ebp
     14b99ed:	49 8b 87 80 01 00 00 	mov    rax,QWORD PTR [r15+0x180]
     14b99f4:	41 0f 10 87 78 01 00 	movups xmm0,XMMWORD PTR [r15+0x178]
     14b99fb:	00 
     14b99fc:	0f 11 84 24 a8 03 00 	movups XMMWORD PTR [rsp+0x3a8],xmm0
     14b9a03:	00 
     14b9a04:	48 85 c0             	test   rax,rax
     14b9a07:	74 05                	je     14b9a0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fef92>
     14b9a09:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14b9a0e:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14b9a13:	48 89 84 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rax
     14b9a1a:	00 
     14b9a1b:	48 83 a4 24 e0 03 00 	and    QWORD PTR [rsp+0x3e0],0x0
     14b9a22:	00 00 
     14b9a24:	bf c0 01 00 00       	mov    edi,0x1c0
     14b9a29:	e8 d2 44 33 00       	call   17edf00 <_Znwm@plt>
     14b9a2e:	49 89 c7             	mov    r15,rax
     14b9a31:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
     14b9a38:	00 
     14b9a39:	4c 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r15
     14b9a40:	00 
     14b9a41:	48 8d 8c 24 af 00 00 	lea    rcx,[rsp+0xaf]
     14b9a48:	00 
     14b9a49:	48 89 8c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rcx
     14b9a50:	00 
     14b9a51:	48 c7 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],0x1
     14b9a58:	00 01 00 00 00 
     14b9a5d:	48 8d 0d 5c ee 3b 00 	lea    rcx,[rip+0x3bee5c]        # 18788c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34fa8>
     14b9a64:	49 89 0f             	mov    QWORD PTR [r15],rcx
     14b9a67:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
     14b9a6b:	41 0f 29 47 10       	movaps XMMWORD PTR [r15+0x10],xmm0
     14b9a70:	48 8b 48 10          	mov    rcx,QWORD PTR [rax+0x10]
     14b9a74:	49 89 4f 30          	mov    QWORD PTR [r15+0x30],rcx
     14b9a78:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     14b9a7b:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
     14b9a80:	48 8b 48 28          	mov    rcx,QWORD PTR [rax+0x28]
     14b9a84:	49 89 4f 48          	mov    QWORD PTR [r15+0x48],rcx
     14b9a88:	0f 10 40 18          	movups xmm0,XMMWORD PTR [rax+0x18]
     14b9a8c:	41 0f 11 47 38       	movups XMMWORD PTR [r15+0x38],xmm0

### 0x14d12f8; FDE=(21814314, 21843276): mov    BYTE PTR [rsp+0x3b8],al
     14d129c:	48 8b b8 98 00 00 00 	mov    rdi,QWORD PTR [rax+0x98]
     14d12a3:	4c 89 b8 98 00 00 00 	mov    QWORD PTR [rax+0x98],r15
     14d12aa:	e8 d7 d1 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d12af:	80 bc 24 88 00 00 00 	cmp    BYTE PTR [rsp+0x88],0x0
     14d12b6:	00 
     14d12b7:	0f 84 d8 00 00 00    	je     14d1395 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x316919>
     14d12bd:	bf e8 00 00 00       	mov    edi,0xe8
     14d12c2:	e8 39 cc 31 00       	call   17edf00 <_Znwm@plt>
     14d12c7:	48 89 c3             	mov    rbx,rax
     14d12ca:	66 0f ef c0          	pxor   xmm0,xmm0
     14d12ce:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d12d3:	48 8d 05 a6 7f 3a 00 	lea    rax,[rip+0x3a7fa6]        # 1879280 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35968>
     14d12da:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d12dd:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14d12e1:	31 c0                	xor    eax,eax
     14d12e3:	88 84 24 e0 02 00 00 	mov    BYTE PTR [rsp+0x2e0],al
     14d12ea:	88 84 24 20 03 00 00 	mov    BYTE PTR [rsp+0x320],al
     14d12f1:	88 84 24 a0 03 00 00 	mov    BYTE PTR [rsp+0x3a0],al
     14d12f8:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     14d12ff:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d1304:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     14d130b:	66 0f 6f 81 80 00 00 	movdqa xmm0,XMMWORD PTR [rcx+0x80]
     14d1312:	00 
     14d1313:	66 0f 7f 84 24 b0 02 	movdqa XMMWORD PTR [rsp+0x2b0],xmm0
     14d131a:	00 00 
     14d131c:	48 85 c0             	test   rax,rax
     14d131f:	74 05                	je     14d1326 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3168aa>
     14d1321:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d1326:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     14d132d:	00 
     14d132e:	48 8d 94 24 a0 03 00 	lea    rdx,[rsp+0x3a0]
     14d1335:	00 
     14d1336:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d133d:	00 
     14d133e:	4c 89 f7             	mov    rdi,r14
     14d1341:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d1348:	00 
     14d1349:	e8 d4 3a 00 00       	call   14d4e22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a3a6>
     14d134e:	48 8b bc 24 b8 02 00 	mov    rdi,QWORD PTR [rsp+0x2b8]
     14d1355:	00 
     14d1356:	e8 2b d1 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d135b:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d1362:	00 
     14d1363:	e8 c8 59 5d ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     14d1368:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d136f:	00 
     14d1370:	e8 ed bc f8 ff       	call   145d062 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a25e6>

### 0x14d13d0; FDE=(21814314, 21843276): mov    BYTE PTR [rsp+0x3b8],al
     14d137a:	66 49 0f 6e ce       	movq   xmm1,r14
     14d137f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     14d1383:	66 0f 7f 4c 24 50    	movdqa XMMWORD PTR [rsp+0x50],xmm1
     14d1389:	31 ff                	xor    edi,edi
     14d138b:	e8 8c d0 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d1390:	e9 d3 00 00 00       	jmp    14d1468 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3169ec>
     14d1395:	bf b8 00 00 00       	mov    edi,0xb8
     14d139a:	e8 61 cb 31 00       	call   17edf00 <_Znwm@plt>
     14d139f:	48 89 c3             	mov    rbx,rax
     14d13a2:	66 0f ef c0          	pxor   xmm0,xmm0
     14d13a6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d13ab:	48 8d 05 ce 7e 3a 00 	lea    rax,[rip+0x3a7ece]        # 1879280 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35968>
     14d13b2:	48 89 03             	mov    QWORD PTR [rbx],rax
     14d13b5:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     14d13b9:	31 c0                	xor    eax,eax
     14d13bb:	88 84 24 e0 02 00 00 	mov    BYTE PTR [rsp+0x2e0],al
     14d13c2:	88 84 24 20 03 00 00 	mov    BYTE PTR [rsp+0x320],al
     14d13c9:	88 84 24 a0 03 00 00 	mov    BYTE PTR [rsp+0x3a0],al
     14d13d0:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     14d13d7:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d13dc:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     14d13e3:	66 0f 6f 81 80 00 00 	movdqa xmm0,XMMWORD PTR [rcx+0x80]
     14d13ea:	00 
     14d13eb:	66 0f 7f 84 24 b0 02 	movdqa XMMWORD PTR [rsp+0x2b0],xmm0
     14d13f2:	00 00 
     14d13f4:	48 85 c0             	test   rax,rax
     14d13f7:	74 05                	je     14d13fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x316982>
     14d13f9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14d13fe:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     14d1405:	00 
     14d1406:	48 8d 94 24 a0 03 00 	lea    rdx,[rsp+0x3a0]
     14d140d:	00 
     14d140e:	4c 8d 84 24 b0 02 00 	lea    r8,[rsp+0x2b0]
     14d1415:	00 
     14d1416:	4c 89 f7             	mov    rdi,r14
     14d1419:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     14d1420:	00 
     14d1421:	e8 2a 3a 00 00       	call   14d4e50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a3d4>
     14d1426:	48 8b bc 24 b8 02 00 	mov    rdi,QWORD PTR [rsp+0x2b8]
     14d142d:	00 
     14d142e:	e8 53 d0 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d1433:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d143a:	00 
     14d143b:	e8 f0 58 5d ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     14d1440:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d1447:	00 
     14d1448:	e8 15 bc f8 ff       	call   145d062 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a25e6>

### 0x14d1506; FDE=(21814314, 21843276): mov    QWORD PTR [rsp+0x3b8],r12
     14d14bd:	00 
     14d14be:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     14d14c3:	4c 8b b9 80 00 00 00 	mov    r15,QWORD PTR [rcx+0x80]
     14d14ca:	4c 8b a1 88 00 00 00 	mov    r12,QWORD PTR [rcx+0x88]
     14d14d1:	4d 85 e4             	test   r12,r12
     14d14d4:	74 08                	je     14d14de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x316a62>
     14d14d6:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     14d14dc:	eb 03                	jmp    14d14e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x316a65>
     14d14de:	45 31 e4             	xor    r12d,r12d
     14d14e1:	48 89 9c 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],rbx
     14d14e8:	00 
     14d14e9:	4c 89 b4 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],r14
     14d14f0:	00 
     14d14f1:	66 0f ef c0          	pxor   xmm0,xmm0
     14d14f5:	66 0f 7f 84 24 b0 02 	movdqa XMMWORD PTR [rsp+0x2b0],xmm0
     14d14fc:	00 00 
     14d14fe:	4c 89 bc 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],r15
     14d1505:	00 
     14d1506:	4c 89 a4 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r12
     14d150d:	00 
     14d150e:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     14d1512:	6a 28                	push   0x28
     14d1514:	5f                   	pop    rdi
     14d1515:	e8 e6 c9 31 00       	call   17edf00 <_Znwm@plt>
     14d151a:	48 8d 8c 24 b0 03 00 	lea    rcx,[rsp+0x3b0]
     14d1521:	00 
     14d1522:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     14d1527:	48 8d be 30 01 00 00 	lea    rdi,[rsi+0x130]
     14d152e:	48 8d 15 eb 7e 3a 00 	lea    rdx,[rip+0x3a7eeb]        # 1879420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35b08>
     14d1535:	48 89 10             	mov    QWORD PTR [rax],rdx
     14d1538:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     14d153c:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     14d1540:	66 0f ef c0          	pxor   xmm0,xmm0
     14d1544:	66 0f 7f 41 f0       	movdqa XMMWORD PTR [rcx-0x10],xmm0
     14d1549:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
     14d154d:	4c 89 60 20          	mov    QWORD PTR [rax+0x20],r12
     14d1551:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
     14d1555:	48 89 84 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rax
     14d155c:	00 
     14d155d:	4c 39 ef             	cmp    rdi,r13
     14d1560:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d1565:	4c 8b 6c 24 78       	mov    r13,QWORD PTR [rsp+0x78]
     14d156a:	74 57                	je     14d15c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x316b47>
     14d156c:	48 8b 8e 50 01 00 00 	mov    rcx,QWORD PTR [rsi+0x150]
     14d1573:	48 39 f9             	cmp    rcx,rdi
     14d1576:	74 11                	je     14d1589 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x316b0d>
     14d1578:	48 89 8c 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rcx

### 0x1518f1f; FDE=(22119126, 22125169): cmp    BYTE PTR [rsp+0x3b8],0x0
     1518ecf:	4c 89 e6             	mov    rsi,r12
     1518ed2:	e8 63 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518ed7:	80 bb b8 02 00 00 00 	cmp    BYTE PTR [rbx+0x2b8],0x0
     1518ede:	74 1f                	je     1518eff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e483>
     1518ee0:	4c 8d a3 a0 02 00 00 	lea    r12,[rbx+0x2a0]
     1518ee7:	4c 89 e7             	mov    rdi,r12
     1518eea:	e8 63 cc 62 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1518eef:	48 8d bc 24 88 03 00 	lea    rdi,[rsp+0x388]
     1518ef6:	00 
     1518ef7:	4c 89 e6             	mov    rsi,r12
     1518efa:	e8 3b 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518eff:	4c 8d b4 24 a8 03 00 	lea    r14,[rsp+0x3a8]
     1518f06:	00 
     1518f07:	80 bb d0 02 00 00 00 	cmp    BYTE PTR [rbx+0x2d0],0x0
     1518f0e:	74 2a                	je     1518f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4be>
     1518f10:	4c 8d a3 c0 02 00 00 	lea    r12,[rbx+0x2c0]
     1518f17:	4c 89 e7             	mov    rdi,r12
     1518f1a:	e8 87 d6 65 ff       	call   b765a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc3546>
     1518f1f:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     1518f26:	00 
     1518f27:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     1518f2c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1518f30:	75 08                	jne    1518f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4be>
     1518f32:	c6 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],0x1
     1518f39:	01 
     1518f3a:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1518f3f:	48 8d b0 78 13 00 00 	lea    rsi,[rax+0x1378]
     1518f46:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
     1518f4d:	00 
     1518f4e:	e8 75 25 01 00       	call   152b4c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x370a4c>
     1518f53:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
     1518f58:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     1518f5d:	89 84 24 bc 03 00 00 	mov    DWORD PTR [rsp+0x3bc],eax
     1518f64:	48 c1 e8 20          	shr    rax,0x20
     1518f68:	88 84 24 c0 03 00 00 	mov    BYTE PTR [rsp+0x3c0],al
     1518f6f:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     1518f74:	41 80 7f 40 00       	cmp    BYTE PTR [r15+0x40],0x0
     1518f79:	0f 85 80 06 00 00    	jne    15195ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35eb83>
     1518f7f:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
     1518f86:	00 
     1518f87:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1518f8e:	00 
     1518f8f:	e8 91 34 01 00       	call   152c425 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3719a9>
     1518f94:	49 8d bf f8 06 00 00 	lea    rdi,[r15+0x6f8]
     1518f9b:	4c 8d a4 24 80 04 00 	lea    r12,[rsp+0x480]
     1518fa2:	00 
     1518fa3:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi

### 0x1518f32; FDE=(22119126, 22125169): mov    BYTE PTR [rsp+0x3b8],0x1
     1518ee7:	4c 89 e7             	mov    rdi,r12
     1518eea:	e8 63 cc 62 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1518eef:	48 8d bc 24 88 03 00 	lea    rdi,[rsp+0x388]
     1518ef6:	00 
     1518ef7:	4c 89 e6             	mov    rsi,r12
     1518efa:	e8 3b 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518eff:	4c 8d b4 24 a8 03 00 	lea    r14,[rsp+0x3a8]
     1518f06:	00 
     1518f07:	80 bb d0 02 00 00 00 	cmp    BYTE PTR [rbx+0x2d0],0x0
     1518f0e:	74 2a                	je     1518f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4be>
     1518f10:	4c 8d a3 c0 02 00 00 	lea    r12,[rbx+0x2c0]
     1518f17:	4c 89 e7             	mov    rdi,r12
     1518f1a:	e8 87 d6 65 ff       	call   b765a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc3546>
     1518f1f:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     1518f26:	00 
     1518f27:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     1518f2c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1518f30:	75 08                	jne    1518f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4be>
     1518f32:	c6 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],0x1
     1518f39:	01 
     1518f3a:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1518f3f:	48 8d b0 78 13 00 00 	lea    rsi,[rax+0x1378]
     1518f46:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
     1518f4d:	00 
     1518f4e:	e8 75 25 01 00       	call   152b4c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x370a4c>
     1518f53:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
     1518f58:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     1518f5d:	89 84 24 bc 03 00 00 	mov    DWORD PTR [rsp+0x3bc],eax
     1518f64:	48 c1 e8 20          	shr    rax,0x20
     1518f68:	88 84 24 c0 03 00 00 	mov    BYTE PTR [rsp+0x3c0],al
     1518f6f:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     1518f74:	41 80 7f 40 00       	cmp    BYTE PTR [r15+0x40],0x0
     1518f79:	0f 85 80 06 00 00    	jne    15195ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35eb83>
     1518f7f:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
     1518f86:	00 
     1518f87:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1518f8e:	00 
     1518f8f:	e8 91 34 01 00       	call   152c425 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3719a9>
     1518f94:	49 8d bf f8 06 00 00 	lea    rdi,[r15+0x6f8]
     1518f9b:	4c 8d a4 24 80 04 00 	lea    r12,[rsp+0x480]
     1518fa2:	00 
     1518fa3:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     1518fa8:	4c 89 e6             	mov    rsi,r12
     1518fab:	e8 7e 2a 56 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1518fb0:	4c 89 e7             	mov    rdi,r12
     1518fb3:	e8 d8 4e 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1518fb8:	41 83 a7 10 07 00 00 	and    DWORD PTR [r15+0x710],0x0

### 0x15230d0; FDE=(22161852, 22164816): mov    QWORD PTR [rbx+0x3b8],rax
     1523075:	31 f6                	xor    esi,esi
     1523077:	e8 8a 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152307c:	48 89 83 98 03 00 00 	mov    QWORD PTR [rbx+0x398],rax
     1523083:	49 8b be a0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3a0]
     152308a:	31 f6                	xor    esi,esi
     152308c:	e8 75 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523091:	48 89 83 a0 03 00 00 	mov    QWORD PTR [rbx+0x3a0],rax
     1523098:	49 8b be a8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3a8]
     152309f:	31 f6                	xor    esi,esi
     15230a1:	e8 60 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230a6:	48 89 83 a8 03 00 00 	mov    QWORD PTR [rbx+0x3a8],rax
     15230ad:	49 8b be b0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3b0]
     15230b4:	31 f6                	xor    esi,esi
     15230b6:	e8 4b 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230bb:	48 89 83 b0 03 00 00 	mov    QWORD PTR [rbx+0x3b0],rax
     15230c2:	49 8b be b8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3b8]
     15230c9:	31 f6                	xor    esi,esi
     15230cb:	e8 36 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230d0:	48 89 83 b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],rax
     15230d7:	49 8b be c0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3c0]
     15230de:	31 f6                	xor    esi,esi
     15230e0:	e8 21 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230e5:	48 89 83 c0 03 00 00 	mov    QWORD PTR [rbx+0x3c0],rax
     15230ec:	49 8b be c8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3c8]
     15230f3:	31 f6                	xor    esi,esi
     15230f5:	e8 0c 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230fa:	48 89 83 c8 03 00 00 	mov    QWORD PTR [rbx+0x3c8],rax
     1523101:	49 8b be d0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3d0]
     1523108:	31 f6                	xor    esi,esi
     152310a:	e8 f7 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152310f:	48 89 83 d0 03 00 00 	mov    QWORD PTR [rbx+0x3d0],rax
     1523116:	49 8b be d8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3d8]
     152311d:	31 f6                	xor    esi,esi
     152311f:	e8 e2 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523124:	48 89 83 d8 03 00 00 	mov    QWORD PTR [rbx+0x3d8],rax
     152312b:	49 8b be e0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3e0]
     1523132:	31 f6                	xor    esi,esi
     1523134:	e8 cd 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523139:	48 89 83 e0 03 00 00 	mov    QWORD PTR [rbx+0x3e0],rax
     1523140:	49 8b be e8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3e8]
     1523147:	31 f6                	xor    esi,esi
     1523149:	e8 b8 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152314e:	48 89 83 e8 03 00 00 	mov    QWORD PTR [rbx+0x3e8],rax
     1523155:	49 8b be f0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3f0]
     152315c:	31 f6                	xor    esi,esi
     152315e:	e8 a3 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523163:	48 89 83 f0 03 00 00 	mov    QWORD PTR [rbx+0x3f0],rax

### 0x152863f; FDE=(22184136, 22186498): cmp    BYTE PTR [rbx+0x3b8],0x0
     15285e3:	0f 85 13 03 00 00    	jne    15288fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36de80>
     15285e9:	e8 a4 d1 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15285ee:	80 bb 9c 03 00 00 00 	cmp    BYTE PTR [rbx+0x39c],0x0
     15285f5:	74 48                	je     152863f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dbc3>
     15285f7:	48 8d bb 98 03 00 00 	lea    rdi,[rbx+0x398]
     15285fe:	e8 5f d5 61 ff       	call   b45b62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b02>
     1528603:	8b b3 98 03 00 00    	mov    esi,DWORD PTR [rbx+0x398]
     1528609:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     152860e:	e8 cf 36 00 00       	call   152bce2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371266>
     1528613:	80 4b 14 04          	or     BYTE PTR [rbx+0x14],0x4
     1528617:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
     152861e:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1528622:	f6 c2 01             	test   dl,0x1
     1528625:	0f 85 f5 02 00 00    	jne    1528920 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dea4>
     152862b:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
     1528630:	e8 b1 d1 23 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     1528635:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     152863a:	e8 51 58 2c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     152863f:	80 bb b8 03 00 00 00 	cmp    BYTE PTR [rbx+0x3b8],0x0
     1528646:	74 2f                	je     1528677 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dbfb>
     1528648:	4c 8d b3 a0 03 00 00 	lea    r14,[rbx+0x3a0]
     152864f:	4c 89 f7             	mov    rdi,r14
     1528652:	e8 fb d4 61 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1528657:	80 4b 14 08          	or     BYTE PTR [rbx+0x14],0x8
     152865b:	48 8d bb 60 01 00 00 	lea    rdi,[rbx+0x160]
     1528662:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1528666:	f6 c2 01             	test   dl,0x1
     1528669:	0f 85 bd 02 00 00    	jne    152892c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36deb0>
     152866f:	4c 89 f6             	mov    rsi,r14
     1528672:	e8 1b d1 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1528677:	80 bb f8 03 00 00 00 	cmp    BYTE PTR [rbx+0x3f8],0x0
     152867e:	74 24                	je     15286a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dc28>
     1528680:	80 4b 14 10          	or     BYTE PTR [rbx+0x14],0x10
     1528684:	48 8d b3 e0 03 00 00 	lea    rsi,[rbx+0x3e0]
     152868b:	48 8d bb 68 01 00 00 	lea    rdi,[rbx+0x168]
     1528692:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1528696:	f6 c2 01             	test   dl,0x1
     1528699:	0f 85 99 02 00 00    	jne    1528938 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36debc>
     152869f:	e8 ee d0 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15286a4:	80 bb 18 04 00 00 00 	cmp    BYTE PTR [rbx+0x418],0x0
     15286ab:	74 24                	je     15286d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dc55>
     15286ad:	80 4b 14 20          	or     BYTE PTR [rbx+0x14],0x20
     15286b1:	48 8d b3 00 04 00 00 	lea    rsi,[rbx+0x400]
     15286b8:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
     15286bf:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     15286c3:	f6 c2 01             	test   dl,0x1
     15286c6:	0f 85 78 02 00 00    	jne    1528944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dec8>

### 0x153fcdf; FDE=(22275720, 22301459): mov    DWORD PTR [rsp+0x3b8],0x4
     153fc96:	e8 89 ac 94 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     153fc9b:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     153fca2:	00 
     153fca3:	48 89 c6             	mov    rsi,rax
     153fca6:	e8 95 e2 2a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     153fcab:	48 8b 84 24 10 03 00 	mov    rax,QWORD PTR [rsp+0x310]
     153fcb2:	00 
     153fcb3:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
     153fcba:	00 
     153fcbb:	0f 28 84 24 00 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x300]
     153fcc2:	00 
     153fcc3:	0f 29 84 24 a0 03 00 	movaps XMMWORD PTR [rsp+0x3a0],xmm0
     153fcca:	00 
     153fccb:	0f 57 c0             	xorps  xmm0,xmm0
     153fcce:	0f 29 84 24 00 03 00 	movaps XMMWORD PTR [rsp+0x300],xmm0
     153fcd5:	00 
     153fcd6:	48 83 a4 24 10 03 00 	and    QWORD PTR [rsp+0x310],0x0
     153fcdd:	00 00 
     153fcdf:	c7 84 24 b8 03 00 00 	mov    DWORD PTR [rsp+0x3b8],0x4
     153fce6:	04 00 00 00 
     153fcea:	c6 84 24 bc 03 00 00 	mov    BYTE PTR [rsp+0x3bc],0x1
     153fcf1:	01 
     153fcf2:	83 a4 24 d0 03 00 00 	and    DWORD PTR [rsp+0x3d0],0x0
     153fcf9:	00 
     153fcfa:	48 8d 35 e7 08 4b 00 	lea    rsi,[rip+0x4b08e7]        # 19f05e8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1d18>
     153fd01:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     153fd08:	00 
     153fd09:	e8 16 ac 94 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     153fd0e:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     153fd15:	00 
     153fd16:	48 89 c6             	mov    rsi,rax
     153fd19:	e8 22 e2 2a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     153fd1e:	4c 8d bc 24 d8 03 00 	lea    r15,[rsp+0x3d8]
     153fd25:	00 
     153fd26:	48 8b 84 24 f0 02 00 	mov    rax,QWORD PTR [rsp+0x2f0]
     153fd2d:	00 
     153fd2e:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     153fd32:	0f 28 84 24 e0 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x2e0]
     153fd39:	00 
     153fd3a:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     153fd3e:	0f 57 c0             	xorps  xmm0,xmm0
     153fd41:	0f 29 84 24 e0 02 00 	movaps XMMWORD PTR [rsp+0x2e0],xmm0
     153fd48:	00 
     153fd49:	48 83 a4 24 f0 02 00 	and    QWORD PTR [rsp+0x2f0],0x0
     153fd50:	00 00 
     153fd52:	41 c7 47 18 04 00 00 	mov    DWORD PTR [r15+0x18],0x4
     153fd59:	00 

### 0x153fe13; FDE=(22275720, 22301459): mov    DWORD PTR [rsp+0x3b8],0x4
     153fdca:	e8 55 ab 94 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     153fdcf:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     153fdd6:	00 
     153fdd7:	48 89 c6             	mov    rsi,rax
     153fdda:	e8 61 e1 2a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     153fddf:	48 8b 84 24 b0 02 00 	mov    rax,QWORD PTR [rsp+0x2b0]
     153fde6:	00 
     153fde7:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
     153fdee:	00 
     153fdef:	0f 28 84 24 a0 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x2a0]
     153fdf6:	00 
     153fdf7:	0f 29 84 24 a0 03 00 	movaps XMMWORD PTR [rsp+0x3a0],xmm0
     153fdfe:	00 
     153fdff:	0f 57 c0             	xorps  xmm0,xmm0
     153fe02:	0f 29 84 24 a0 02 00 	movaps XMMWORD PTR [rsp+0x2a0],xmm0
     153fe09:	00 
     153fe0a:	48 83 a4 24 b0 02 00 	and    QWORD PTR [rsp+0x2b0],0x0
     153fe11:	00 00 
     153fe13:	c7 84 24 b8 03 00 00 	mov    DWORD PTR [rsp+0x3b8],0x4
     153fe1a:	04 00 00 00 
     153fe1e:	c6 84 24 bc 03 00 00 	mov    BYTE PTR [rsp+0x3bc],0x1
     153fe25:	01 
     153fe26:	83 a4 24 d0 03 00 00 	and    DWORD PTR [rsp+0x3d0],0x0
     153fe2d:	00 
     153fe2e:	48 8d 35 cb 07 4b 00 	lea    rsi,[rip+0x4b07cb]        # 19f0600 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1d30>
     153fe35:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     153fe3c:	00 
     153fe3d:	e8 e2 aa 94 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     153fe42:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     153fe49:	00 
     153fe4a:	48 89 c6             	mov    rsi,rax
     153fe4d:	e8 ee e0 2a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     153fe52:	48 8b 84 24 90 02 00 	mov    rax,QWORD PTR [rsp+0x290]
     153fe59:	00 
     153fe5a:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     153fe5e:	0f 28 84 24 80 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x280]
     153fe65:	00 
     153fe66:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     153fe6a:	48 83 a4 24 90 02 00 	and    QWORD PTR [rsp+0x290],0x0
     153fe71:	00 00 
     153fe73:	0f 57 c0             	xorps  xmm0,xmm0
     153fe76:	0f 29 84 24 80 02 00 	movaps XMMWORD PTR [rsp+0x280],xmm0
     153fe7d:	00 
     153fe7e:	4c 8d a4 24 a0 03 00 	lea    r12,[rsp+0x3a0]
     153fe85:	00 
     153fe86:	41 c7 44 24 50 04 00 	mov    DWORD PTR [r12+0x50],0x4
     153fe8d:	00 00 

### 0x15401ee; FDE=(22275720, 22301459): mov    DWORD PTR [rsp+0x3b8],0x4
     15401a5:	e8 7a a7 94 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     15401aa:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     15401b1:	00 
     15401b2:	48 89 c6             	mov    rsi,rax
     15401b5:	e8 86 dd 2a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     15401ba:	48 8b 84 24 f0 02 00 	mov    rax,QWORD PTR [rsp+0x2f0]
     15401c1:	00 
     15401c2:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
     15401c9:	00 
     15401ca:	0f 28 84 24 e0 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x2e0]
     15401d1:	00 
     15401d2:	0f 29 84 24 a0 03 00 	movaps XMMWORD PTR [rsp+0x3a0],xmm0
     15401d9:	00 
     15401da:	0f 57 c0             	xorps  xmm0,xmm0
     15401dd:	0f 29 84 24 e0 02 00 	movaps XMMWORD PTR [rsp+0x2e0],xmm0
     15401e4:	00 
     15401e5:	48 83 a4 24 f0 02 00 	and    QWORD PTR [rsp+0x2f0],0x0
     15401ec:	00 00 
     15401ee:	c7 84 24 b8 03 00 00 	mov    DWORD PTR [rsp+0x3b8],0x4
     15401f5:	04 00 00 00 
     15401f9:	c6 84 24 bc 03 00 00 	mov    BYTE PTR [rsp+0x3bc],0x1
     1540200:	01 
     1540201:	83 a4 24 d0 03 00 00 	and    DWORD PTR [rsp+0x3d0],0x0
     1540208:	00 
     1540209:	48 8d 35 38 04 4b 00 	lea    rsi,[rip+0x4b0438]        # 19f0648 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1d78>
     1540210:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1540217:	00 
     1540218:	e8 07 a7 94 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     154021d:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
     1540224:	00 
     1540225:	48 89 c6             	mov    rsi,rax
     1540228:	e8 13 dd 2a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     154022d:	48 8b 84 24 d0 02 00 	mov    rax,QWORD PTR [rsp+0x2d0]
     1540234:	00 
     1540235:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     1540239:	0f 28 84 24 c0 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x2c0]
     1540240:	00 
     1540241:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     1540245:	48 83 a4 24 d0 02 00 	and    QWORD PTR [rsp+0x2d0],0x0
     154024c:	00 00 
     154024e:	0f 57 c0             	xorps  xmm0,xmm0
     1540251:	0f 29 84 24 c0 02 00 	movaps XMMWORD PTR [rsp+0x2c0],xmm0
     1540258:	00 
     1540259:	4c 8d bc 24 10 04 00 	lea    r15,[rsp+0x410]
     1540260:	00 
     1540261:	41 c7 47 e0 04 00 00 	mov    DWORD PTR [r15-0x20],0x4
     1540268:	00 

### 0x154057a; FDE=(22275720, 22301459): mov    BYTE PTR [rsp+0x3b8],0x1
     1540536:	00 
     1540537:	48 8d bc 24 e0 0a 00 	lea    rdi,[rsp+0xae0]
     154053e:	00 
     154053f:	31 d2                	xor    edx,edx
     1540541:	e8 6e 58 00 00       	call   1545db4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b338>
     1540546:	0f 28 84 24 e0 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xae0]
     154054d:	00 
     154054e:	0f 29 84 24 a0 03 00 	movaps XMMWORD PTR [rsp+0x3a0],xmm0
     1540555:	00 
     1540556:	48 8b 84 24 f0 0a 00 	mov    rax,QWORD PTR [rsp+0xaf0]
     154055d:	00 
     154055e:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
     1540565:	00 
     1540566:	48 83 a4 24 f0 0a 00 	and    QWORD PTR [rsp+0xaf0],0x0
     154056d:	00 00 
     154056f:	0f 57 c0             	xorps  xmm0,xmm0
     1540572:	0f 29 84 24 e0 0a 00 	movaps XMMWORD PTR [rsp+0xae0],xmm0
     1540579:	00 
     154057a:	c6 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],0x1
     1540581:	01 
     1540582:	48 8b b4 24 80 03 00 	mov    rsi,QWORD PTR [rsp+0x380]
     1540589:	00 
     154058a:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
     1540591:	00 
     1540592:	6a 01                	push   0x1
     1540594:	5a                   	pop    rdx
     1540595:	e8 1a 58 00 00       	call   1545db4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b338>
     154059a:	4c 8d b4 24 c0 03 00 	lea    r14,[rsp+0x3c0]
     15405a1:	00 
     15405a2:	0f 28 84 24 60 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x360]
     15405a9:	00 
     15405aa:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     15405ae:	48 8b 84 24 70 03 00 	mov    rax,QWORD PTR [rsp+0x370]
     15405b5:	00 
     15405b6:	48 83 a4 24 70 03 00 	and    QWORD PTR [rsp+0x370],0x0
     15405bd:	00 00 
     15405bf:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     15405c3:	0f 57 c0             	xorps  xmm0,xmm0
     15405c6:	0f 29 84 24 60 03 00 	movaps XMMWORD PTR [rsp+0x360],xmm0
     15405cd:	00 
     15405ce:	41 c6 46 18 01       	mov    BYTE PTR [r14+0x18],0x1
     15405d3:	48 8b b4 24 80 03 00 	mov    rsi,QWORD PTR [rsp+0x380]
     15405da:	00 
     15405db:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
     15405e2:	00 
     15405e3:	6a 02                	push   0x2
     15405e5:	5a                   	pop    rdx

### 0x1540762; FDE=(22275720, 22301459): mov    BYTE PTR [rsp+0x3b8],0x1
     154071e:	00 
     154071f:	48 8d bc 24 e0 0a 00 	lea    rdi,[rsp+0xae0]
     1540726:	00 
     1540727:	31 d2                	xor    edx,edx
     1540729:	e8 86 56 00 00       	call   1545db4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b338>
     154072e:	0f 28 84 24 e0 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xae0]
     1540735:	00 
     1540736:	0f 29 84 24 a0 03 00 	movaps XMMWORD PTR [rsp+0x3a0],xmm0
     154073d:	00 
     154073e:	48 8b 84 24 f0 0a 00 	mov    rax,QWORD PTR [rsp+0xaf0]
     1540745:	00 
     1540746:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
     154074d:	00 
     154074e:	48 83 a4 24 f0 0a 00 	and    QWORD PTR [rsp+0xaf0],0x0
     1540755:	00 00 
     1540757:	0f 57 c0             	xorps  xmm0,xmm0
     154075a:	0f 29 84 24 e0 0a 00 	movaps XMMWORD PTR [rsp+0xae0],xmm0
     1540761:	00 
     1540762:	c6 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],0x1
     1540769:	01 
     154076a:	48 8b b4 24 80 03 00 	mov    rsi,QWORD PTR [rsp+0x380]
     1540771:	00 
     1540772:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
     1540779:	00 
     154077a:	6a 01                	push   0x1
     154077c:	5a                   	pop    rdx
     154077d:	e8 32 56 00 00       	call   1545db4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b338>
     1540782:	4c 8d b4 24 c0 03 00 	lea    r14,[rsp+0x3c0]
     1540789:	00 
     154078a:	0f 28 84 24 60 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x360]
     1540791:	00 
     1540792:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     1540796:	48 8b 84 24 70 03 00 	mov    rax,QWORD PTR [rsp+0x370]
     154079d:	00 
     154079e:	48 83 a4 24 70 03 00 	and    QWORD PTR [rsp+0x370],0x0
     15407a5:	00 00 
     15407a7:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     15407ab:	0f 57 c0             	xorps  xmm0,xmm0
     15407ae:	0f 29 84 24 60 03 00 	movaps XMMWORD PTR [rsp+0x360],xmm0
     15407b5:	00 
     15407b6:	41 c6 46 18 01       	mov    BYTE PTR [r14+0x18],0x1
     15407bb:	48 8b b4 24 80 03 00 	mov    rsi,QWORD PTR [rsp+0x380]
     15407c2:	00 
     15407c3:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
     15407ca:	00 
     15407cb:	6a 02                	push   0x2
     15407cd:	5a                   	pop    rdx

### 0x1540dd0; FDE=(22275720, 22301459): movups XMMWORD PTR [rsp+0x3b8],xmm1
     1540d8c:	00 
     1540d8d:	e8 9c 50 00 00       	call   1545e2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b3b2>
     1540d92:	eb 6c                	jmp    1540e00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x386384>
     1540d94:	0f 28 84 24 00 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb00]
     1540d9b:	00 
     1540d9c:	0f 29 84 24 a0 03 00 	movaps XMMWORD PTR [rsp+0x3a0],xmm0
     1540da3:	00 
     1540da4:	48 8b 8c 24 10 0b 00 	mov    rcx,QWORD PTR [rsp+0xb10]
     1540dab:	00 
     1540dac:	48 89 8c 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rcx
     1540db3:	00 
     1540db4:	48 83 a4 24 10 0b 00 	and    QWORD PTR [rsp+0xb10],0x0
     1540dbb:	00 00 
     1540dbd:	0f 57 c0             	xorps  xmm0,xmm0
     1540dc0:	0f 29 84 24 00 0b 00 	movaps XMMWORD PTR [rsp+0xb00],xmm0
     1540dc7:	00 
     1540dc8:	0f 10 8c 24 18 0b 00 	movups xmm1,XMMWORD PTR [rsp+0xb18]
     1540dcf:	00 
     1540dd0:	0f 11 8c 24 b8 03 00 	movups XMMWORD PTR [rsp+0x3b8],xmm1
     1540dd7:	00 
     1540dd8:	48 8b 8c 24 28 0b 00 	mov    rcx,QWORD PTR [rsp+0xb28]
     1540ddf:	00 
     1540de0:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     1540de5:	48 89 8c 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],rcx
     1540dec:	00 
     1540ded:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1540df1:	88 84 24 d0 03 00 00 	mov    BYTE PTR [rsp+0x3d0],al
     1540df8:	c6 84 24 d8 03 00 00 	mov    BYTE PTR [rsp+0x3d8],0x1
     1540dff:	01 
     1540e00:	48 8d bc 24 00 0b 00 	lea    rdi,[rsp+0xb00]
     1540e07:	00 
     1540e08:	e8 e9 9a 78 ff       	call   cca8f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x217896>
     1540e0d:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
     1540e14:	00 
     1540e15:	e8 ee 99 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1540e1a:	48 8d bc 24 e0 0a 00 	lea    rdi,[rsp+0xae0]
     1540e21:	00 
     1540e22:	e8 e1 99 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1540e27:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
     1540e2e:	00 
     1540e2f:	e8 38 4f 00 00       	call   1545d6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b2f0>
     1540e34:	48 8d b4 24 a0 02 00 	lea    rsi,[rsp+0x2a0]
     1540e3b:	00 
     1540e3c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1540e41:	e8 48 45 00 00       	call   154538e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38a912>
     1540e46:	84 c0                	test   al,al
     1540e48:	0f 84 92 01 00 00    	je     1540fe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x386564>

### 0x15417ec; FDE=(22275720, 22301459): cmp    BYTE PTR [rsp+0x3b8],0x0
     15417a2:	00 
     15417a3:	e8 e8 c6 2a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15417a8:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
     15417af:	00 
     15417b0:	e8 db c6 2a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15417b5:	48 8d b4 24 40 03 00 	lea    rsi,[rsp+0x340]
     15417bc:	00 
     15417bd:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     15417c2:	e8 c7 3b 00 00       	call   154538e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38a912>
     15417c7:	84 c0                	test   al,al
     15417c9:	0f 84 b3 00 00 00    	je     1541882 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x386e06>
     15417cf:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     15417d6:	00 
     15417d7:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     15417de:	00 
     15417df:	48 8d 94 24 40 03 00 	lea    rdx,[rsp+0x340]
     15417e6:	00 
     15417e7:	e8 c0 3c 00 00       	call   15454ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38aa30>
     15417ec:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     15417f3:	00 
     15417f4:	74 7f                	je     1541875 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x386df9>
     15417f6:	48 8b b4 24 a0 03 00 	mov    rsi,QWORD PTR [rsp+0x3a0]
     15417fd:	00 
     15417fe:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
     1541805:	00 
     1541806:	31 d2                	xor    edx,edx
     1541808:	e8 a7 45 00 00       	call   1545db4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b338>
     154180d:	48 8d 9c 24 60 03 00 	lea    rbx,[rsp+0x360]
     1541814:	00 
     1541815:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     1541819:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
     154181c:	0f 57 c9             	xorps  xmm1,xmm1
     154181f:	0f 29 0b             	movaps XMMWORD PTR [rbx],xmm1
     1541822:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     1541827:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     154182e:	00 
     154182f:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     1541833:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1541837:	4c 8d bc 24 e0 0a 00 	lea    r15,[rsp+0xae0]
     154183e:	00 
     154183f:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
     1541843:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     1541848:	41 c6 46 18 01       	mov    BYTE PTR [r14+0x18],0x1
     154184d:	48 8d bc 24 00 0b 00 	lea    rdi,[rsp+0xb00]
     1541854:	00 
     1541855:	4c 89 f6             	mov    rsi,r14
     1541858:	e8 ff 45 00 00       	call   1545e5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b3e0>

### 0x15418c1; FDE=(22275720, 22301459): cmp    BYTE PTR [rsp+0x3b8],0x0
     1541875:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     154187c:	00 
     154187d:	e8 ea 44 00 00       	call   1545d6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b2f0>
     1541882:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
     1541889:	00 
     154188a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     154188f:	e8 fa 3a 00 00       	call   154538e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38a912>
     1541894:	4c 8d bc 24 20 0b 00 	lea    r15,[rsp+0xb20]
     154189b:	00 
     154189c:	84 c0                	test   al,al
     154189e:	0f 84 af 00 00 00    	je     1541953 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x386ed7>
     15418a4:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     15418ab:	00 
     15418ac:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     15418b3:	00 
     15418b4:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]
     15418bb:	00 
     15418bc:	e8 eb 3b 00 00       	call   15454ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38aa30>
     15418c1:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     15418c8:	00 
     15418c9:	74 7b                	je     1541946 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x386eca>
     15418cb:	48 8b b4 24 a0 03 00 	mov    rsi,QWORD PTR [rsp+0x3a0]
     15418d2:	00 
     15418d3:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
     15418da:	00 
     15418db:	31 d2                	xor    edx,edx
     15418dd:	e8 d2 44 00 00       	call   1545db4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b338>
     15418e2:	48 8d 9c 24 60 03 00 	lea    rbx,[rsp+0x360]
     15418e9:	00 
     15418ea:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     15418ee:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
     15418f1:	0f 57 c9             	xorps  xmm1,xmm1
     15418f4:	0f 29 0b             	movaps XMMWORD PTR [rbx],xmm1
     15418f7:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     15418fc:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     1541903:	00 
     1541904:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     1541908:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     154190c:	4c 8d ac 24 e0 0a 00 	lea    r13,[rsp+0xae0]
     1541913:	00 
     1541914:	41 0f 29 4d 00       	movaps XMMWORD PTR [r13+0x0],xmm1
     1541919:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     154191e:	41 c6 46 18 01       	mov    BYTE PTR [r14+0x18],0x1
     1541923:	4c 89 ff             	mov    rdi,r15
     1541926:	4c 89 f6             	mov    rsi,r14
     1541929:	e8 2e 45 00 00       	call   1545e5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b3e0>
     154192e:	4c 89 f7             	mov    rdi,r14

### 0x1541aff; FDE=(22275720, 22301459): cmp    BYTE PTR [rsp+0x3b8],0x0
     1541ab5:	00 
     1541ab6:	e8 d5 c3 2a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1541abb:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     1541ac2:	00 
     1541ac3:	e8 c8 c3 2a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1541ac8:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
     1541acf:	00 
     1541ad0:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1541ad5:	e8 b4 38 00 00       	call   154538e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38a912>
     1541ada:	84 c0                	test   al,al
     1541adc:	0f 84 95 00 00 00    	je     1541b77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3870fb>
     1541ae2:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1541ae9:	00 
     1541aea:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     1541af1:	00 
     1541af2:	48 8d 94 24 60 03 00 	lea    rdx,[rsp+0x360]
     1541af9:	00 
     1541afa:	e8 ad 39 00 00       	call   15454ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38aa30>
     1541aff:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     1541b06:	00 
     1541b07:	74 61                	je     1541b6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3870ee>
     1541b09:	48 8b b4 24 a0 03 00 	mov    rsi,QWORD PTR [rsp+0x3a0]
     1541b10:	00 
     1541b11:	48 8d bc 24 e0 0a 00 	lea    rdi,[rsp+0xae0]
     1541b18:	00 
     1541b19:	31 d2                	xor    edx,edx
     1541b1b:	e8 94 42 00 00       	call   1545db4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b338>
     1541b20:	48 8d 9c 24 e0 0a 00 	lea    rbx,[rsp+0xae0]
     1541b27:	00 
     1541b28:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
     1541b2b:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     1541b32:	00 
     1541b33:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     1541b37:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     1541b3b:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1541b3f:	0f 57 c0             	xorps  xmm0,xmm0
     1541b42:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     1541b45:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     1541b4a:	48 8d bc 24 00 0b 00 	lea    rdi,[rsp+0xb00]
     1541b51:	00 
     1541b52:	4c 89 f6             	mov    rsi,r14
     1541b55:	e8 5e 9a f3 ff       	call   147b5b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0b3c>
     1541b5a:	4c 89 f7             	mov    rdi,r14
     1541b5d:	e8 a6 8c 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1541b62:	48 89 df             	mov    rdi,rbx
     1541b65:	e8 9e 8c 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1541b6a:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]

### 0x1541bae; FDE=(22275720, 22301459): cmp    BYTE PTR [rsp+0x3b8],0x0
     1541b62:	48 89 df             	mov    rdi,rbx
     1541b65:	e8 9e 8c 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1541b6a:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1541b71:	00 
     1541b72:	e8 f5 41 00 00       	call   1545d6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b2f0>
     1541b77:	48 8d b4 24 00 03 00 	lea    rsi,[rsp+0x300]
     1541b7e:	00 
     1541b7f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1541b84:	e8 05 38 00 00       	call   154538e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38a912>
     1541b89:	84 c0                	test   al,al
     1541b8b:	0f 84 90 00 00 00    	je     1541c21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3871a5>
     1541b91:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1541b98:	00 
     1541b99:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     1541ba0:	00 
     1541ba1:	48 8d 94 24 00 03 00 	lea    rdx,[rsp+0x300]
     1541ba8:	00 
     1541ba9:	e8 fe 38 00 00       	call   15454ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38aa30>
     1541bae:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     1541bb5:	00 
     1541bb6:	74 5c                	je     1541c14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x387198>
     1541bb8:	48 8b b4 24 a0 03 00 	mov    rsi,QWORD PTR [rsp+0x3a0]
     1541bbf:	00 
     1541bc0:	48 8d bc 24 e0 0a 00 	lea    rdi,[rsp+0xae0]
     1541bc7:	00 
     1541bc8:	31 d2                	xor    edx,edx
     1541bca:	e8 e5 41 00 00       	call   1545db4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b338>
     1541bcf:	48 8d 9c 24 e0 0a 00 	lea    rbx,[rsp+0xae0]
     1541bd6:	00 
     1541bd7:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
     1541bda:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     1541be1:	00 
     1541be2:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     1541be6:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     1541bea:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1541bee:	0f 57 c0             	xorps  xmm0,xmm0
     1541bf1:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     1541bf4:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     1541bf9:	4c 89 ff             	mov    rdi,r15
     1541bfc:	4c 89 f6             	mov    rsi,r14
     1541bff:	e8 b4 99 f3 ff       	call   147b5b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0b3c>
     1541c04:	4c 89 f7             	mov    rdi,r14
     1541c07:	e8 fc 8b 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1541c0c:	48 89 df             	mov    rdi,rbx
     1541c0f:	e8 f4 8b 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1541c14:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1541c1b:	00 

### 0x154244c; FDE=(22275720, 22301459): cmp    BYTE PTR [rsp+0x3b8],0x0
     1542402:	00 
     1542403:	e8 88 ba 2a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1542408:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     154240f:	00 
     1542410:	e8 7b ba 2a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1542415:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
     154241c:	00 
     154241d:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1542422:	e8 67 2f 00 00       	call   154538e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38a912>
     1542427:	84 c0                	test   al,al
     1542429:	0f 84 ff 00 00 00    	je     154252e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x387ab2>
     154242f:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1542436:	00 
     1542437:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     154243e:	00 
     154243f:	48 8d 94 24 60 03 00 	lea    rdx,[rsp+0x360]
     1542446:	00 
     1542447:	e8 60 30 00 00       	call   15454ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38aa30>
     154244c:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     1542453:	00 
     1542454:	0f 84 c7 00 00 00    	je     1542521 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x387aa5>
     154245a:	48 8b b4 24 a0 03 00 	mov    rsi,QWORD PTR [rsp+0x3a0]
     1542461:	00 
     1542462:	48 8d bc 24 e0 0a 00 	lea    rdi,[rsp+0xae0]
     1542469:	00 
     154246a:	31 d2                	xor    edx,edx
     154246c:	e8 43 39 00 00       	call   1545db4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b338>
     1542471:	48 8b 84 24 e0 0a 00 	mov    rax,QWORD PTR [rsp+0xae0]
     1542478:	00 
     1542479:	48 8b 8c 24 e8 0a 00 	mov    rcx,QWORD PTR [rsp+0xae8]
     1542480:	00 
     1542481:	48 89 84 24 80 03 00 	mov    QWORD PTR [rsp+0x380],rax
     1542488:	00 
     1542489:	48 89 8c 24 88 03 00 	mov    QWORD PTR [rsp+0x388],rcx
     1542490:	00 
     1542491:	48 8b 94 24 f0 0a 00 	mov    rdx,QWORD PTR [rsp+0xaf0]
     1542498:	00 
     1542499:	48 89 94 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rdx
     15424a0:	00 
     15424a1:	48 83 a4 24 f0 0a 00 	and    QWORD PTR [rsp+0xaf0],0x0
     15424a8:	00 00 
     15424aa:	0f 57 c0             	xorps  xmm0,xmm0
     15424ad:	0f 29 84 24 e0 0a 00 	movaps XMMWORD PTR [rsp+0xae0],xmm0
     15424b4:	00 
     15424b5:	80 bc 24 18 0b 00 00 	cmp    BYTE PTR [rsp+0xb18],0x0
     15424bc:	00 
     15424bd:	74 17                	je     15424d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x387a5a>

### 0x1542565; FDE=(22275720, 22301459): cmp    BYTE PTR [rsp+0x3b8],0x0
     154251b:	00 
     154251c:	e8 e7 82 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1542521:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1542528:	00 
     1542529:	e8 3e 38 00 00       	call   1545d6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b2f0>
     154252e:	48 8d b4 24 00 03 00 	lea    rsi,[rsp+0x300]
     1542535:	00 
     1542536:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     154253b:	e8 4e 2e 00 00       	call   154538e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38a912>
     1542540:	84 c0                	test   al,al
     1542542:	0f 84 90 00 00 00    	je     15425d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x387b5c>
     1542548:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     154254f:	00 
     1542550:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     1542557:	00 
     1542558:	48 8d 94 24 00 03 00 	lea    rdx,[rsp+0x300]
     154255f:	00 
     1542560:	e8 47 2f 00 00       	call   15454ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38aa30>
     1542565:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     154256c:	00 
     154256d:	74 5c                	je     15425cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x387b4f>
     154256f:	48 8b b4 24 a0 03 00 	mov    rsi,QWORD PTR [rsp+0x3a0]
     1542576:	00 
     1542577:	48 8d bc 24 e0 0a 00 	lea    rdi,[rsp+0xae0]
     154257e:	00 
     154257f:	31 d2                	xor    edx,edx
     1542581:	e8 2e 38 00 00       	call   1545db4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b338>
     1542586:	48 8d 9c 24 e0 0a 00 	lea    rbx,[rsp+0xae0]
     154258d:	00 
     154258e:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
     1542591:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     1542598:	00 
     1542599:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     154259d:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     15425a1:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     15425a5:	0f 57 c0             	xorps  xmm0,xmm0
     15425a8:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     15425ab:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     15425b0:	4c 89 ff             	mov    rdi,r15
     15425b3:	4c 89 f6             	mov    rsi,r14
     15425b6:	e8 fd 8f f3 ff       	call   147b5b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0b3c>
     15425bb:	4c 89 f7             	mov    rdi,r14
     15425be:	e8 45 82 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     15425c3:	48 89 df             	mov    rdi,rbx
     15425c6:	e8 3d 82 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     15425cb:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     15425d2:	00 

### 0x15fc477; FDE=(23052696, 23054182): mov    QWORD PTR [rbx+0x3b8],rax
     15fc417:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     15fc41b:	f6 83 c8 03 00 00 01 	test   BYTE PTR [rbx+0x3c8],0x1
     15fc422:	0f 84 a2 02 00 00    	je     15fc6ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441c4e>
     15fc428:	48 8b b3 d8 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3d8]
     15fc42f:	e9 9d 02 00 00       	jmp    15fc6d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441c55>
     15fc434:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     15fc438:	f6 83 80 01 00 00 01 	test   BYTE PTR [rbx+0x180],0x1
     15fc43f:	0f 84 9a 02 00 00    	je     15fc6df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441c63>
     15fc445:	48 8b b3 90 01 00 00 	mov    rsi,QWORD PTR [rbx+0x190]
     15fc44c:	e9 95 02 00 00       	jmp    15fc6e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441c6a>
     15fc451:	31 c0                	xor    eax,eax
     15fc453:	eb 1b                	jmp    15fc470 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4419f4>
     15fc455:	48 8d 8b 81 01 00 00 	lea    rcx,[rbx+0x181]
     15fc45c:	48 8b b8 50 01 00 00 	mov    rdi,QWORD PTR [rax+0x150]
     15fc463:	48 8d 94 24 d0 00 00 	lea    rdx,[rsp+0xd0]
     15fc46a:	00 
     15fc46b:	e8 fc 72 ff ff       	call   15f376c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x438cf0>
     15fc470:	48 8b bb b8 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3b8]
     15fc477:	48 89 83 b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],rax
     15fc47e:	48 85 ff             	test   rdi,rdi
     15fc481:	74 0d                	je     15fc490 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441a14>
     15fc483:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15fc486:	ff 50 08             	call   QWORD PTR [rax+0x8]
     15fc489:	48 8b 83 b8 03 00 00 	mov    rax,QWORD PTR [rbx+0x3b8]
     15fc490:	48 85 c0             	test   rax,rax
     15fc493:	74 24                	je     15fc4b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441a3d>
     15fc495:	c7 43 30 01 00 00 00 	mov    DWORD PTR [rbx+0x30],0x1
     15fc49c:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     15fc4a0:	f6 83 c8 03 00 00 01 	test   BYTE PTR [rbx+0x3c8],0x1
     15fc4a7:	0f 84 e3 01 00 00    	je     15fc690 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441c14>
     15fc4ad:	48 8b b3 d8 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3d8]
     15fc4b4:	e9 de 01 00 00       	jmp    15fc697 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441c1b>
     15fc4b9:	c7 43 30 02 00 00 00 	mov    DWORD PTR [rbx+0x30],0x2
     15fc4c0:	4c 8d b3 80 03 00 00 	lea    r14,[rbx+0x380]
     15fc4c7:	4c 89 f7             	mov    rdi,r14
     15fc4ca:	e8 99 df ff ff       	call   15fa468 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43f9ec>
     15fc4cf:	48 83 bb a8 03 00 00 	cmp    QWORD PTR [rbx+0x3a8],0x0
     15fc4d6:	00 
     15fc4d7:	0f 84 a3 01 00 00    	je     15fc680 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441c04>
     15fc4dd:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
     15fc4e2:	48 8b 6b 10          	mov    rbp,QWORD PTR [rbx+0x10]
     15fc4e6:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
     15fc4ed:	00 
     15fc4ee:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
     15fc4f2:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     15fc4f9:	00 
     15fc4fa:	48 85 c0             	test   rax,rax

### 0x15fcce9; FDE=(23055520, 23055990): cmp    QWORD PTR [rbx+0x3b8],0x0
     15fcca2:	41 56                	push   r14
     15fcca4:	53                   	push   rbx
     15fcca5:	48 81 ec f0 00 00 00 	sub    rsp,0xf0
     15fccac:	49 89 fe             	mov    r14,rdi
     15fccaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15fccb6:	00 00 
     15fccb8:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
     15fccbf:	00 
     15fccc0:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
     15fccc3:	48 8b 57 08          	mov    rdx,QWORD PTR [rdi+0x8]
     15fccc7:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
     15fcccc:	48 89 df             	mov    rdi,rbx
     15fcccf:	e8 d6 b2 1d 00       	call   17d7faa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3dcb>
     15fccd4:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
     15fccd8:	74 75                	je     15fcd4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4422d3>
     15fccda:	49 8b 5e 18          	mov    rbx,QWORD PTR [r14+0x18]
     15fccde:	41 83 7e 20 00       	cmp    DWORD PTR [r14+0x20],0x0
     15fcce3:	0f 84 94 00 00 00    	je     15fcd7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x442301>
     15fcce9:	48 83 bb b8 03 00 00 	cmp    QWORD PTR [rbx+0x3b8],0x0
     15fccf0:	00 
     15fccf1:	75 5c                	jne    15fcd4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4422d3>
     15fccf3:	83 63 30 00          	and    DWORD PTR [rbx+0x30],0x0
     15fccf7:	c7 44 24 18 0c 00 00 	mov    DWORD PTR [rsp+0x18],0xc
     15fccfe:	00 
     15fccff:	48 8d 05 52 3b 35 00 	lea    rax,[rip+0x353b52]        # 1950858 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x194a0>
     15fcd06:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     15fcd0b:	48 8d 35 b4 d0 d3 fe 	lea    rsi,[rip+0xfffffffffed3d0b4]        # 339dc6 <_ZTSSt12bad_any_cast@@Base-0x56402>
     15fcd12:	48 89 e7             	mov    rdi,rsp
     15fcd15:	e8 64 cd 47 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     15fcd1a:	41 8b 4e 20          	mov    ecx,DWORD PTR [r14+0x20]
     15fcd1e:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     15fcd23:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     15fcd28:	48 89 e2             	mov    rdx,rsp
     15fcd2b:	e8 56 ea ff ff       	call   15fb786 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x440d0a>
     15fcd30:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     15fcd35:	48 89 df             	mov    rdi,rbx
     15fcd38:	e8 93 dc ff ff       	call   15fa9d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43ff54>
     15fcd3d:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     15fcd42:	e8 0d a1 4a ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     15fcd47:	48 89 e7             	mov    rdi,rsp
     15fcd4a:	e8 41 11 1f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15fcd4f:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     15fcd54:	e8 c1 47 57 ff       	call   b7151a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbe4ba>
     15fcd59:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15fcd60:	00 00 
     15fcd62:	48 3b 84 24 e8 00 00 	cmp    rax,QWORD PTR [rsp+0xe8]
     15fcd69:	00 

### 0x15fcdf2; FDE=(23055520, 23055990): mov    QWORD PTR [rbx+0x3b8],rax
     15fcda3:	41 89 47 fc          	mov    DWORD PTR [r15-0x4],eax
     15fcda7:	48 83 c6 1c          	add    rsi,0x1c
     15fcdab:	ba 84 00 00 00       	mov    edx,0x84
     15fcdb0:	4c 89 ff             	mov    rdi,r15
     15fcdb3:	e8 18 2d 1f 00       	call   17efad0 <memcpy@plt>
     15fcdb8:	8b 83 b0 01 00 00    	mov    eax,DWORD PTR [rbx+0x1b0]
     15fcdbe:	41 89 07             	mov    DWORD PTR [r15],eax
     15fcdc1:	48 8b 83 a8 03 00 00 	mov    rax,QWORD PTR [rbx+0x3a8]
     15fcdc8:	48 85 c0             	test   rax,rax
     15fcdcb:	74 1c                	je     15fcde9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44236d>
     15fcdcd:	48 8d b3 c0 03 00 00 	lea    rsi,[rbx+0x3c0]
     15fcdd4:	48 8b b8 50 01 00 00 	mov    rdi,QWORD PTR [rax+0x150]
     15fcddb:	48 8d 54 24 48       	lea    rdx,[rsp+0x48]
     15fcde0:	31 c9                	xor    ecx,ecx
     15fcde2:	e8 85 69 ff ff       	call   15f376c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x438cf0>
     15fcde7:	eb 02                	jmp    15fcdeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44236f>
     15fcde9:	31 c0                	xor    eax,eax
     15fcdeb:	48 8b bb b8 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3b8]
     15fcdf2:	48 89 83 b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],rax
     15fcdf9:	48 85 ff             	test   rdi,rdi
     15fcdfc:	74 0d                	je     15fce0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44238f>
     15fcdfe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15fce01:	ff 50 08             	call   QWORD PTR [rax+0x8]
     15fce04:	48 8b 83 b8 03 00 00 	mov    rax,QWORD PTR [rbx+0x3b8]
     15fce0b:	48 85 c0             	test   rax,rax
     15fce0e:	0f 84 d5 fe ff ff    	je     15fcce9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44226d>
     15fce14:	c7 43 30 01 00 00 00 	mov    DWORD PTR [rbx+0x30],0x1
     15fce1b:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     15fce1f:	f6 83 c8 03 00 00 01 	test   BYTE PTR [rbx+0x3c8],0x1
     15fce26:	74 09                	je     15fce31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4423b5>
     15fce28:	48 8b b3 d8 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3d8]
     15fce2f:	eb 07                	jmp    15fce38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4423bc>
     15fce31:	48 8d b3 c9 03 00 00 	lea    rsi,[rbx+0x3c9]
     15fce38:	8b 93 c4 03 00 00    	mov    edx,DWORD PTR [rbx+0x3c4]
     15fce3e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15fce41:	ff 50 58             	call   QWORD PTR [rax+0x58]
     15fce44:	e8 fd dd 1d 00       	call   17dac46 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a67>
     15fce49:	49 89 c7             	mov    r15,rax
     15fce4c:	48 8d bb 60 04 00 00 	lea    rdi,[rbx+0x460]
     15fce53:	48 89 e6             	mov    rsi,rsp
     15fce56:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
     15fce5c:	e8 21 e0 fe ff       	call   15eae82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x430406>
     15fce61:	4c 89 38             	mov    QWORD PTR [rax],r15
     15fce64:	e9 80 fe ff ff       	jmp    15fcce9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44226d>
     15fce69:	e8 42 2c 1f 00       	call   17efab0 <__stack_chk_fail@plt>
     15fce6e:	48 89 c7             	mov    rdi,rax
     15fce71:	e8 2f cc 47 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

### 0x1632a64; FDE=(23274560, 23280021): movq   QWORD PTR [rsp+0x3b8],xmm2
     1632a0f:	41 0f 10 86 d1 00 00 	movups xmm0,XMMWORD PTR [r14+0xd1]
     1632a16:	00 
     1632a17:	0f 11 82 91 00 00 00 	movups XMMWORD PTR [rdx+0x91],xmm0
     1632a1e:	41 8b 86 f5 00 00 00 	mov    eax,DWORD PTR [r14+0xf5]
     1632a25:	89 82 b5 00 00 00    	mov    DWORD PTR [rdx+0xb5],eax
     1632a2b:	41 0f 10 86 e5 00 00 	movups xmm0,XMMWORD PTR [r14+0xe5]
     1632a32:	00 
     1632a33:	0f 11 82 a5 00 00 00 	movups XMMWORD PTR [rdx+0xa5],xmm0
     1632a3a:	f3 41 0f 7e 86 fc 00 	movq   xmm0,QWORD PTR [r14+0xfc]
     1632a41:	00 00 
     1632a43:	66 0f 6f c8          	movdqa xmm1,xmm0
     1632a47:	66 0f fe 0d 51 9e d5 	paddd  xmm1,XMMWORD PTR [rip+0xfffffffffed59e51]        # 38c8a0 <_ZTSSt12bad_any_cast@@Base-0x3928>
     1632a4e:	fe 
     1632a4f:	66 0f 6f d1          	movdqa xmm2,xmm1
     1632a53:	66 0f 38 3f 15 14 b1 	pmaxud xmm2,XMMWORD PTR [rip+0xfffffffffed5b114]        # 38db70 <_ZTSSt12bad_any_cast@@Base-0x2658>
     1632a5a:	d5 fe 
     1632a5c:	66 0f 76 d1          	pcmpeqd xmm2,xmm1
     1632a60:	66 0f df d0          	pandn  xmm2,xmm0
     1632a64:	66 0f d6 94 24 b8 03 	movq   QWORD PTR [rsp+0x3b8],xmm2
     1632a6b:	00 00 
     1632a6d:	89 8c 24 c8 02 00 00 	mov    DWORD PTR [rsp+0x2c8],ecx
     1632a74:	49 8b 86 10 01 00 00 	mov    rax,QWORD PTR [r14+0x110]
     1632a7b:	49 2b 86 08 01 00 00 	sub    rax,QWORD PTR [r14+0x108]
     1632a82:	48 99                	cqo
     1632a84:	6a 18                	push   0x18
     1632a86:	59                   	pop    rcx
     1632a87:	48 f7 f9             	idiv   rcx
     1632a8a:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
     1632a91:	00 
     1632a92:	89 c6                	mov    esi,eax
     1632a94:	e8 d9 84 6f ff       	call   d2af72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x277f12>
     1632a99:	49 8b b6 08 01 00 00 	mov    rsi,QWORD PTR [r14+0x108]
     1632aa0:	49 39 b6 10 01 00 00 	cmp    QWORD PTR [r14+0x110],rsi
     1632aa7:	74 3e                	je     1632ae7 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dc55>
     1632aa9:	31 db                	xor    ebx,ebx
     1632aab:	45 31 ed             	xor    r13d,r13d
     1632aae:	48 01 de             	add    rsi,rbx
     1632ab1:	48 8b 84 24 c0 03 00 	mov    rax,QWORD PTR [rsp+0x3c0]
     1632ab8:	00 
     1632ab9:	4a 8b 3c e8          	mov    rdi,QWORD PTR [rax+r13*8]
     1632abd:	e8 be b5 1b 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1632ac2:	49 ff c5             	inc    r13
     1632ac5:	49 8b b6 08 01 00 00 	mov    rsi,QWORD PTR [r14+0x108]
     1632acc:	49 8b 86 10 01 00 00 	mov    rax,QWORD PTR [r14+0x110]
     1632ad3:	48 29 f0             	sub    rax,rsi
     1632ad6:	48 99                	cqo
     1632ad8:	6a 18                	push   0x18

### 0x16ff0c0; FDE=(24109564, 24132746): mov    QWORD PTR [rsp+0x3b8],rdx
     16ff07b:	49 39 d7             	cmp    r15,rdx
     16ff07e:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     16ff083:	48 0f 4c c3          	cmovl  rax,rbx
     16ff087:	b9 00 00 00 00       	mov    ecx,0x0
     16ff08c:	48 89 54 24 50       	mov    QWORD PTR [rsp+0x50],rdx
     16ff091:	48 0f 4d ca          	cmovge rcx,rdx
     16ff095:	4c 89 fa             	mov    rdx,r15
     16ff098:	48 29 ca             	sub    rdx,rcx
     16ff09b:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     16ff09e:	f6 c1 01             	test   cl,0x1
     16ff0a1:	48 8d 4c d1 07       	lea    rcx,[rcx+rdx*8+0x7]
     16ff0a6:	48 0f 44 c8          	cmove  rcx,rax
     16ff0aa:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     16ff0ad:	e8 84 c7 37 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     16ff0b2:	48 89 c5             	mov    rbp,rax
     16ff0b5:	49 89 d4             	mov    r12,rdx
     16ff0b8:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
     16ff0bf:	00 
     16ff0c0:	48 89 94 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rdx
     16ff0c7:	00 
     16ff0c8:	48 83 bc 24 70 01 00 	cmp    QWORD PTR [rsp+0x170],0x1
     16ff0cf:	00 01 
     16ff0d1:	77 2b                	ja     16ff0fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb326a>
     16ff0d3:	48 81 bc 24 78 01 00 	cmp    QWORD PTR [rsp+0x178],0x1ffff
     16ff0da:	00 ff ff 01 00 
     16ff0df:	0f 87 79 01 00 00    	ja     16ff25e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb33ca>
     16ff0e5:	48 c7 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],0x20000
     16ff0ec:	00 00 00 02 00 
     16ff0f1:	48 8d 84 24 80 01 00 	lea    rax,[rsp+0x180]
     16ff0f8:	00 
     16ff0f9:	e9 47 02 00 00       	jmp    16ff345 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb34b1>
     16ff0fe:	48 8b 84 24 80 01 00 	mov    rax,QWORD PTR [rsp+0x180]
     16ff105:	00 
     16ff106:	0f 18 18             	prefetcht2 BYTE PTR [rax]
     16ff109:	48 0f bf 94 24 78 01 	movsx  rdx,WORD PTR [rsp+0x178]
     16ff110:	00 00 
     16ff112:	48 89 ef             	mov    rdi,rbp
     16ff115:	4c 89 e6             	mov    rsi,r12
     16ff118:	e8 cf c9 fd ff       	call   16dbaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fc58>
     16ff11d:	48 89 c2             	mov    rdx,rax
     16ff120:	48 8b 8c 24 70 01 00 	mov    rcx,QWORD PTR [rsp+0x170]
     16ff127:	00 
     16ff128:	48 8b b4 24 80 01 00 	mov    rsi,QWORD PTR [rsp+0x180]
     16ff12f:	00 
     16ff130:	48 c1 e8 39          	shr    rax,0x39
     16ff134:	66 0f 6e c8          	movd   xmm1,eax
     16ff138:	66 0f 38 00 0d af ec 	pshufb xmm1,XMMWORD PTR [rip+0xfffffffffec8ecaf]        # 38ddf0 <_ZTSSt12bad_any_cast@@Base-0x23d8>

### 0x16fff83; FDE=(24109564, 24132746): mov    QWORD PTR [rsp+0x3b8],r12
     16fff36:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
     16fff3a:	a8 04                	test   al,0x4
     16fff3c:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     16fff41:	0f 84 b7 00 00 00    	je     16ffffe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb416a>
     16fff47:	8b 45 10             	mov    eax,DWORD PTR [rbp+0x10]
     16fff4a:	e9 b2 00 00 00       	jmp    1700001 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb416d>
     16fff4f:	4c 89 bc 24 40 02 00 	mov    QWORD PTR [rsp+0x240],r15
     16fff56:	00 
     16fff57:	4c 89 a4 24 48 02 00 	mov    QWORD PTR [rsp+0x248],r12
     16fff5e:	00 
     16fff5f:	48 8d 3d 83 a8 c3 fe 	lea    rdi,[rip+0xfffffffffec3a883]        # 33a7e9 <_ZTSSt12bad_any_cast@@Base-0x559df>
     16fff66:	e8 3d 97 fd ff       	call   16d96a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d814>
     16fff6b:	48 89 84 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rax
     16fff72:	00 
     16fff73:	48 89 94 24 58 03 00 	mov    QWORD PTR [rsp+0x358],rdx
     16fff7a:	00 
     16fff7b:	4c 89 bc 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],r15
     16fff82:	00 
     16fff83:	4c 89 a4 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r12
     16fff8a:	00 
     16fff8b:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     16fff92:	00 
     16fff93:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
     16fff9a:	00 
     16fff9b:	48 8d 94 24 50 03 00 	lea    rdx,[rsp+0x350]
     16fffa2:	00 
     16fffa3:	48 8d 8c 24 b0 03 00 	lea    rcx,[rsp+0x3b0]
     16fffaa:	00 
     16fffab:	e8 ae ab 09 00       	call   179ab5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ecca>
     16fffb0:	48 8d 9c 24 00 04 00 	lea    rbx,[rsp+0x400]
     16fffb7:	00 
     16fffb8:	48 89 df             	mov    rdi,rbx
     16fffbb:	e8 76 b8 37 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     16fffc0:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     16fffc5:	48 89 c6             	mov    rsi,rax
     16fffc8:	4c 89 f1             	mov    rcx,r14
     16fffcb:	6a 07                	push   0x7
     16fffcd:	41 58                	pop    r8
     16fffcf:	4c 8d 0d 46 8c c7 fe 	lea    r9,[rip+0xfffffffffec78c46]        # 378c1c <_ZTSSt12bad_any_cast@@Base-0x175ac>
     16fffd6:	e8 29 d5 ff ff       	call   16fd504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1670>
     16fffdb:	48 89 df             	mov    rdi,rbx
     16fffde:	e8 ad de 0e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     16fffe3:	48 8d 05 be 98 2d 00 	lea    rax,[rip+0x2d98be]        # 19d98a8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa24f0>
     16fffea:	48 8b 5c 24 50       	mov    rbx,QWORD PTR [rsp+0x50]
     16fffef:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     16ffff4:	4c 8b bc 24 d0 00 00 	mov    r15,QWORD PTR [rsp+0xd0]
     16ffffb:	00 

### 0x17003e6; FDE=(24109564, 24132746): mov    QWORD PTR [rsp+0x3b8],r14
     170039b:	00 
     170039c:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
     17003a3:	00 
     17003a4:	0f 84 c5 00 00 00    	je     170046f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb45db>
     17003aa:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
     17003ad:	e9 c0 00 00 00       	jmp    1700472 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb45de>
     17003b2:	48 89 9c 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rbx
     17003b9:	00 
     17003ba:	4c 89 b4 24 48 02 00 	mov    QWORD PTR [rsp+0x248],r14
     17003c1:	00 
     17003c2:	48 8d 3d 20 a4 c3 fe 	lea    rdi,[rip+0xfffffffffec3a420]        # 33a7e9 <_ZTSSt12bad_any_cast@@Base-0x559df>
     17003c9:	e8 da 92 fd ff       	call   16d96a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d814>
     17003ce:	48 89 84 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rax
     17003d5:	00 
     17003d6:	48 89 94 24 58 03 00 	mov    QWORD PTR [rsp+0x358],rdx
     17003dd:	00 
     17003de:	48 89 9c 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rbx
     17003e5:	00 
     17003e6:	4c 89 b4 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r14
     17003ed:	00 
     17003ee:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     17003f5:	00 
     17003f6:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
     17003fd:	00 
     17003fe:	48 8d 94 24 50 03 00 	lea    rdx,[rsp+0x350]
     1700405:	00 
     1700406:	48 8d 8c 24 b0 03 00 	lea    rcx,[rsp+0x3b0]
     170040d:	00 
     170040e:	e8 4b a7 09 00       	call   179ab5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ecca>
     1700413:	48 8d 9c 24 00 04 00 	lea    rbx,[rsp+0x400]
     170041a:	00 
     170041b:	48 89 df             	mov    rdi,rbx
     170041e:	e8 13 b4 37 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1700423:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     1700428:	48 89 c6             	mov    rsi,rax
     170042b:	4c 89 e9             	mov    rcx,r13
     170042e:	6a 07                	push   0x7
     1700430:	41 58                	pop    r8
     1700432:	4c 8d 0d e3 87 c7 fe 	lea    r9,[rip+0xfffffffffec787e3]        # 378c1c <_ZTSSt12bad_any_cast@@Base-0x175ac>
     1700439:	e8 c6 d0 ff ff       	call   16fd504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1670>
     170043e:	48 89 df             	mov    rdi,rbx
     1700441:	e8 4a da 0e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1700446:	48 8d 05 03 94 2d 00 	lea    rax,[rip+0x2d9403]        # 19d9850 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa2498>
     170044d:	4c 8b 64 24 60       	mov    r12,QWORD PTR [rsp+0x60]
     1700452:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
     1700459:	00 
     170045a:	4c 8b bc 24 e0 00 00 	mov    r15,QWORD PTR [rsp+0xe0]

### 0x1701d95; FDE=(24109564, 24132746): mov    QWORD PTR [rsp+0x3b8],rax
     1701d57:	48 83 c2 20          	add    rdx,0x20
     1701d5b:	48 89 f7             	mov    rdi,rsi
     1701d5e:	48 83 e7 f8          	and    rdi,0xfffffffffffffff8
     1701d62:	40 f6 c6 04          	test   sil,0x4
     1701d66:	48 0f 44 fa          	cmove  rdi,rdx
     1701d6a:	31 d2                	xor    edx,edx
     1701d6c:	31 f6                	xor    esi,esi
     1701d6e:	48 39 f1             	cmp    rcx,rsi
     1701d71:	0f 84 64 03 00 00    	je     17020db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb6247>
     1701d77:	49 89 d0             	mov    r8,rdx
     1701d7a:	49 c1 f8 1e          	sar    r8,0x1e
     1701d7e:	46 8b 04 07          	mov    r8d,DWORD PTR [rdi+r8*1]
     1701d82:	4c 8d 4e 01          	lea    r9,[rsi+0x1]
     1701d86:	4c 01 d2             	add    rdx,r10
     1701d89:	44 3b 04 b0          	cmp    r8d,DWORD PTR [rax+rsi*4]
     1701d8d:	4c 89 ce             	mov    rsi,r9
     1701d90:	74 dc                	je     1701d6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5eda>
     1701d92:	45 31 e4             	xor    r12d,r12d
     1701d95:	48 89 84 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rax
     1701d9c:	00 
     1701d9d:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1701da1:	48 8b 48 18          	mov    rcx,QWORD PTR [rax+0x18]
     1701da5:	f6 c1 04             	test   cl,0x4
     1701da8:	0f 94 c2             	sete   dl
     1701dab:	74 05                	je     1701db2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5f1e>
     1701dad:	8b 70 20             	mov    esi,DWORD PTR [rax+0x20]
     1701db0:	eb 05                	jmp    1701db7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5f23>
     1701db2:	89 ce                	mov    esi,ecx
     1701db4:	83 e6 03             	and    esi,0x3
     1701db7:	85 f6                	test   esi,esi
     1701db9:	7e 4f                	jle    1701e0a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5f76>
     1701dbb:	48 83 c0 20          	add    rax,0x20
     1701dbf:	31 db                	xor    ebx,ebx
     1701dc1:	48 83 e1 f8          	and    rcx,0xfffffffffffffff8
     1701dc5:	f6 c2 01             	test   dl,0x1
     1701dc8:	48 0f 45 c8          	cmovne rcx,rax
     1701dcc:	8b 04 99             	mov    eax,DWORD PTR [rcx+rbx*4]
     1701dcf:	89 84 24 00 04 00 00 	mov    DWORD PTR [rsp+0x400],eax
     1701dd6:	4c 89 ff             	mov    rdi,r15
     1701dd9:	4c 89 f6             	mov    rsi,r14
     1701ddc:	e8 cf 33 4e ff       	call   be51b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x132150>
     1701de1:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1701de5:	48 8b 48 18          	mov    rcx,QWORD PTR [rax+0x18]
     1701de9:	f6 c1 04             	test   cl,0x4
     1701dec:	0f 94 c2             	sete   dl
     1701def:	74 05                	je     1701df6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5f62>
     1701df1:	8b 70 20             	mov    esi,DWORD PTR [rax+0x20]

### 0x17e3327; FDE=(25033984, 25061182): mov    BYTE PTR [rsp+0x3b8],al
     17e32d7:	48 be 02 00 00 00 02 	movabs rsi,0x200000002
     17e32de:	00 00 00 
     17e32e1:	48 89 b4 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rsi
     17e32e8:	00 
     17e32e9:	48 c7 84 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],0x10
     17e32f0:	00 10 00 00 00 
     17e32f5:	48 89 9c 24 d0 03 00 	mov    QWORD PTR [rsp+0x3d0],rbx
     17e32fc:	00 
     17e32fd:	88 84 24 d8 03 00 00 	mov    BYTE PTR [rsp+0x3d8],al
     17e3304:	48 89 8c 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],rcx
     17e330b:	00 
     17e330c:	48 89 94 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],rdx
     17e3313:	00 
     17e3314:	49 89 dc             	mov    r12,rbx
     17e3317:	48 8d 9c 24 c0 15 00 	lea    rbx,[rsp+0x15c0]
     17e331e:	00 
     17e331f:	48 89 9c 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rbx
     17e3326:	00 
     17e3327:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     17e332e:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
     17e3335:	00 
     17e3336:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     17e333d:	00 
     17e333e:	48 8d 94 24 e0 03 00 	lea    rdx,[rsp+0x3e0]
     17e3345:	00 
     17e3346:	e8 28 41 00 00       	call   17e7473 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x13294>
     17e334b:	48 89 df             	mov    rdi,rbx
     17e334e:	31 f6                	xor    esi,esi
     17e3350:	e8 1b 41 eb ff       	call   1697470 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b5dc>
     17e3355:	4c 89 e7             	mov    rdi,r12
     17e3358:	31 f6                	xor    esi,esi
     17e335a:	e8 11 41 eb ff       	call   1697470 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b5dc>
     17e335f:	48 8d bc 24 d0 15 00 	lea    rdi,[rsp+0x15d0]
     17e3366:	00 
     17e3367:	31 f6                	xor    esi,esi
     17e3369:	e8 02 41 eb ff       	call   1697470 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b5dc>
     17e336e:	4d 85 ff             	test   r15,r15
     17e3371:	48 be 00 00 00 00 00 	movabs rsi,0x3ff0000000000000
     17e3378:	00 f0 3f 
     17e337b:	0f 28 5c 24 30       	movaps xmm3,XMMWORD PTR [rsp+0x30]
     17e3380:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     17e3385:	74 4e                	je     17e33d5 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xf1f6>
     17e3387:	66 0f 28 84 24 d0 15 	movapd xmm0,XMMWORD PTR [rsp+0x15d0]
     17e338e:	00 00 
     17e3390:	48 8d 43 10          	lea    rax,[rbx+0x10]
     17e3394:	31 c9                	xor    ecx,ecx
     17e3396:	49 8b 3e             	mov    rdi,QWORD PTR [r14]

## Exact known use e94787
      e9471a:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e94721:	00 
      e94722:	e8 a5 a0 c0 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
      e94727:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9472e:	00 
      e9472f:	e8 36 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94734:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e9473b:	00 
      e9473c:	e8 29 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94741:	48 8d bc 24 d0 0f 00 	lea    rdi,[rsp+0xfd0]
      e94748:	00 
      e94749:	e8 1c 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9474e:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e94755:	00 
      e94756:	e8 0f 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9475b:	49 8b 85 28 04 00 00 	mov    rax,QWORD PTR [r13+0x428]
      e94762:	49 8b 8d 98 05 00 00 	mov    rcx,QWORD PTR [r13+0x598]
      e94769:	48 8d 15 c8 3c 9e 00 	lea    rdx,[rip+0x9e3cc8]        # 1878438 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34b20>
      e94770:	48 8d b4 24 c0 0e 00 	lea    rsi,[rsp+0xec0]
      e94777:	00 
      e94778:	48 89 16             	mov    QWORD PTR [rsi],rdx
      e9477b:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e9477f:	48 89 4e 10          	mov    QWORD PTR [rsi+0x10],rcx
      e94783:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      e94787:	49 8b b5 b8 03 00 00 	mov    rsi,QWORD PTR [r13+0x3b8]
      e9478e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e94791:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e94798:	00 
      e94799:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e9479c:	48 89 ac 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rbp
      e947a3:	00 
      e947a4:	4d 8b bd 70 05 00 00 	mov    r15,QWORD PTR [r13+0x570]
      e947ab:	bf b0 00 00 00       	mov    edi,0xb0
      e947b0:	e8 4b 97 95 00       	call   17edf00 <_Znwm@plt>
      e947b5:	48 89 c3             	mov    rbx,rax
      e947b8:	66 0f ef c0          	pxor   xmm0,xmm0
      e947bc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e947c1:	48 8d 05 a8 d2 99 00 	lea    rax,[rip+0x99d2a8]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e947c8:	48 89 03             	mov    QWORD PTR [rbx],rax
      e947cb:	4c 8d 63 18          	lea    r12,[rbx+0x18]
      e947cf:	48 8d 05 12 e4 99 00 	lea    rax,[rip+0x99e412]        # 1832be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4b80>
      e947d6:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e947da:	66 0f 6f 8c 24 30 0a 	movdqa xmm1,XMMWORD PTR [rsp+0xa30]
      e947e1:	00 00 
      e947e3:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1
      e947e8:	66 0f 7f 84 24 30 0a 	movdqa XMMWORD PTR [rsp+0xa30],xmm0
      e947ef:	00 00 
      e947f1:	4c 8d 73 30          	lea    r14,[rbx+0x30]
      e947f5:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
      e947f9:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14
      e947fd:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
      e94802:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
      e94807:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
      e9480c:	c7 43 68 00 00 80 3f 	mov    DWORD PTR [rbx+0x68],0x3f800000
      e94813:	b8 10 27 00 00       	mov    eax,0x2710
      e94818:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
      e9481c:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
      e94820:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
      e94827:	00 
      e94828:	f3 0f 7f 83 90 00 00 	movdqu XMMWORD PTR [rbx+0x90],xmm0
      e9482f:	00 
      e94830:	41 8a 6f 01          	mov    bpl,BYTE PTR [r15+0x1]
      e94834:	40 84 ed             	test   bpl,bpl
      e94837:	74 22                	je     e9485b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bc71>
      e94839:	4c 8d b4 24 50 0f 00 	lea    r14,[rsp+0xf50]
      e94840:	00 
      e94841:	4c 89 f7             	mov    rdi,r14

## Constructor/reset zeroing references
### 0x1099796
     1099744:	48 89 5b 50          	mov    QWORD PTR [rbx+0x50],rbx
     1099748:	31 ff                	xor    edi,edi
     109974a:	e8 63 4d a0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     109974f:	48 89 df             	mov    rdi,rbx
     1099752:	e8 2f 4d a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099757:	4c 8d 25 89 f5 29 ff 	lea    r12,[rip+0xffffffffff29f589]        # 338ce7 <_ZTSSt12bad_any_cast@@Base-0x574e1>
     109975e:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1099765:	00 
     1099766:	4c 89 e6             	mov    rsi,r12
     1099769:	e8 10 03 9e ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     109976e:	48 8d 05 3b 0d 7f 00 	lea    rax,[rip+0x7f0d3b]        # 188a4b0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3188>
     1099775:	49 89 85 98 03 00 00 	mov    QWORD PTR [r13+0x398],rax
     109977c:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
     1099783:	00 
     1099784:	49 89 85 a0 03 00 00 	mov    QWORD PTR [r13+0x3a0],rax
     109978b:	0f 57 c0             	xorps  xmm0,xmm0
     109978e:	41 0f 11 85 a8 03 00 	movups XMMWORD PTR [r13+0x3a8],xmm0
     1099795:	00 
     1099796:	41 0f 11 85 b8 03 00 	movups XMMWORD PTR [r13+0x3b8],xmm0
     109979d:	00 
     109979e:	41 c7 85 c8 03 00 00 	mov    DWORD PTR [r13+0x3c8],0x3f800000
     10997a5:	00 00 80 3f 
     10997a9:	41 0f 29 85 d0 03 00 	movaps XMMWORD PTR [r13+0x3d0],xmm0
     10997b0:	00 
     10997b1:	41 0f 11 85 d9 03 00 	movups XMMWORD PTR [r13+0x3d9],xmm0
     10997b8:	00 
     10997b9:	0f 57 c9             	xorps  xmm1,xmm1
     10997bc:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     10997c3:	00 
     10997c4:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     10997c8:	49 89 85 00 04 00 00 	mov    QWORD PTR [r13+0x400],rax
     10997cf:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
     10997d2:	41 0f 11 85 f0 03 00 	movups XMMWORD PTR [r13+0x3f0],xmm0
     10997d9:	00 
     10997da:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     10997dd:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     10997e2:	e8 a9 46 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10997e7:	0f 57 c0             	xorps  xmm0,xmm0
     10997ea:	41 0f 11 85 08 04 00 	movups XMMWORD PTR [r13+0x408],xmm0
     10997f1:	00 
     10997f2:	49 8d 9d 18 04 00 00 	lea    rbx,[r13+0x418]
     10997f9:	48 89 df             	mov    rdi,rbx
     10997fc:	e8 8d ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099801:	4d 8d b5 70 04 00 00 	lea    r14,[r13+0x470]

### 0x10a6444
     10a63ca:	48 89 87 00 03 00 00 	mov    QWORD PTR [rdi+0x300],rax
     10a63d1:	48 8d 87 20 03 00 00 	lea    rax,[rdi+0x320]
     10a63d8:	0f 11 87 20 03 00 00 	movups XMMWORD PTR [rdi+0x320],xmm0
     10a63df:	48 89 87 18 03 00 00 	mov    QWORD PTR [rdi+0x318],rax
     10a63e6:	0f 11 87 40 03 00 00 	movups XMMWORD PTR [rdi+0x340],xmm0
     10a63ed:	0f 11 87 30 03 00 00 	movups XMMWORD PTR [rdi+0x330],xmm0
     10a63f4:	b8 00 00 80 3f       	mov    eax,0x3f800000
     10a63f9:	89 87 50 03 00 00    	mov    DWORD PTR [rdi+0x350],eax
     10a63ff:	0f 11 87 68 03 00 00 	movups XMMWORD PTR [rdi+0x368],xmm0
     10a6406:	0f 11 87 58 03 00 00 	movups XMMWORD PTR [rdi+0x358],xmm0
     10a640d:	89 87 78 03 00 00    	mov    DWORD PTR [rdi+0x378],eax
     10a6413:	48 8d 87 88 03 00 00 	lea    rax,[rdi+0x388]
     10a641a:	0f 11 87 88 03 00 00 	movups XMMWORD PTR [rdi+0x388],xmm0
     10a6421:	48 89 87 80 03 00 00 	mov    QWORD PTR [rdi+0x380],rax
     10a6428:	48 8d 87 a0 03 00 00 	lea    rax,[rdi+0x3a0]
     10a642f:	0f 11 87 a0 03 00 00 	movups XMMWORD PTR [rdi+0x3a0],xmm0
     10a6436:	48 89 87 98 03 00 00 	mov    QWORD PTR [rdi+0x398],rax
     10a643d:	48 8d 87 b8 03 00 00 	lea    rax,[rdi+0x3b8]
     10a6444:	0f 11 87 b8 03 00 00 	movups XMMWORD PTR [rdi+0x3b8],xmm0
     10a644b:	48 89 87 b0 03 00 00 	mov    QWORD PTR [rdi+0x3b0],rax
     10a6452:	c3                   	ret
     10a6453:	cc                   	int3
     10a6454:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     10a6457:	e9 00 00 00 00       	jmp    10a645c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d872>
     10a645c:	6a 01                	push   0x1
     10a645e:	5e                   	pop    rsi
     10a645f:	e9 00 00 00 00       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a6464:	55                   	push   rbp
     10a6465:	41 57                	push   r15
     10a6467:	41 56                	push   r14
     10a6469:	41 55                	push   r13
     10a646b:	41 54                	push   r12
     10a646d:	53                   	push   rbx
     10a646e:	48 81 ec 38 08 00 00 	sub    rsp,0x838
     10a6475:	89 f5                	mov    ebp,esi
     10a6477:	49 89 fe             	mov    r14,rdi
     10a647a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a6481:	00 00 
     10a6483:	48 89 84 24 30 08 00 	mov    QWORD PTR [rsp+0x830],rax
     10a648a:	00 
     10a648b:	48 8d 9f 58 14 00 00 	lea    rbx,[rdi+0x1458]
     10a6492:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     10a6497:	48 89 de             	mov    rsi,rbx
     10a649a:	e8 95 e5 c4 ff       	call   cf4a34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2419d4>

