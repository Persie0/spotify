# Compact Orbit service 184 trace

b8f02e: registry lookup id 0xb8 then return table slot +0x5c0.

## Exact +0x5c0 memory accesses
- 0xa802c1 [READ] lea    r12,[rsp+0x5c0]
- 0xa8d053 [READ] lea    rdi,[rsp+0x5c0]
- 0xa8d068 [READ] lea    rsi,[rsp+0x5c0]
- 0xa8e04e [READ] lea    rdi,[rsp+0x5c0]
- 0xa8ebbe [READ] lea    rdi,[rsp+0x5c0]
- 0xaa2779 [WRITE] movaps XMMWORD PTR [rsp+0x5c0],xmm0
- 0xab3d5a [WRITE] call   QWORD PTR [rax+0x5c0]
- 0xabdcab [WRITE] call   QWORD PTR [rax+0x5c0]
- 0xad1308 [WRITE] call   QWORD PTR [rax+0x5c0]
- 0xb1e1c0 [WRITE] call   QWORD PTR [rax+0x5c0]
- 0xb3a15b [WRITE] call   QWORD PTR [rax+0x5c0]
- 0xb8f047 [READ] mov    rax,QWORD PTR [rax+0x5c0]
- 0xbc55a5 [WRITE] call   QWORD PTR [rax+0x5c0]
- 0xc548ce [READ] mov    rax,QWORD PTR [rsp+0x5c0]
- 0xcc776a [WRITE] cmp    BYTE PTR [rsp+0x5c0],0x0
- 0xcc7870 [WRITE] cmp    BYTE PTR [rsp+0x5c0],0x0
- 0xcc8821 [WRITE] cmp    BYTE PTR [rsp+0x5c0],0x0
- 0xcddeba [READ] lea    rdi,[rsp+0x5c0]
- 0xcde59e [READ] lea    rdi,[rsp+0x5c0]
- 0xd22c37 [READ] lea    r15,[r14+0x5c0]
- 0xd43afc [WRITE] call   QWORD PTR [rax+0x5c0]
- 0xd4d7d3 [READ] lea    rdi,[rsp+0x5c0]
- 0xd4d7f8 [READ] movdqa xmm0,XMMWORD PTR [rsp+0x5c0]
- 0xd4d80e [WRITE] movdqa XMMWORD PTR [rsp+0x5c0],xmm0
- 0xd4de45 [READ] lea    rdi,[rsp+0x5c0]
- 0xd4e1e5 [READ] lea    rax,[rsp+0x5c0]
- 0xd4e2fe [READ] lea    rdi,[rsp+0x5c0]
- 0xd4e30f [READ] lea    rbx,[rsp+0x5c0]
- 0xd4e36f [READ] lea    rdi,[rsp+0x5c0]
- 0xd4e380 [READ] lea    r13,[rsp+0x5c0]
- 0xd4e582 [READ] lea    rdi,[rsp+0x5c0]
- 0xd4e59a [READ] lea    r15,[rsp+0x5c0]
- 0xd4e626 [READ] lea    rdi,[rsp+0x5c0]
- 0xd4e641 [READ] lea    r15,[rsp+0x5c0]
- 0xd4e69d [READ] lea    rdi,[rsp+0x5c0]
- 0xd4e6b5 [READ] lea    r15,[rsp+0x5c0]
- 0xd4e6fb [READ] lea    rdi,[rsp+0x5c0]
- 0xd4e736 [READ] movzx  eax,BYTE PTR [rsp+0x5c0]
- 0xd4e77d [READ] lea    rdi,[rsp+0x5c0]
- 0xd4f119 [READ] lea    rsi,[rsp+0x5c0]
- 0xd4f358 [READ] lea    rdi,[rsp+0x5c0]
- 0xd4f6e2 [READ] lea    r14,[rsp+0x5c0]
- 0xd4fa7a [READ] lea    rdi,[rsp+0x5c0]
- 0xd4ff20 [READ] lea    rdi,[rsp+0x5c0]
- 0xd50074 [READ] lea    rdi,[rsp+0x5c0]
- 0xd6ba55 [WRITE] mov    BYTE PTR [r15+0x5c0],al
- 0xd6bb1c [READ] lea    rax,[rsp+0x5c0]
- 0xd6bb4d [READ] lea    rdi,[rsp+0x5c0]
- 0xd6e0bd [READ] lea    rdi,[rsp+0x5c0]
- 0xd6eeaf [READ] lea    rdi,[rsp+0x5c0]
- 0xd73ad5 [WRITE] cmp    BYTE PTR [r12+0x5c0],0x0
- 0xd772d2 [WRITE] cmp    BYTE PTR [rdi+0x5c0],0x0
- 0xd78336 [WRITE] cmp    BYTE PTR [rdi+0x5c0],0x0
- 0xd7849a [WRITE] cmp    BYTE PTR [rbx+0x5c0],0x0
- 0xd784ab [WRITE] mov    BYTE PTR [rbx+0x5c0],0x0
- 0xd7ad65 [WRITE] cmp    BYTE PTR [rbx+0x5c0],0x0
- 0xd7f3e5 [READ] mov    al,BYTE PTR [rbx+0x5c0]
- 0xd7f790 [READ] mov    al,BYTE PTR [rbx+0x5c0]
- 0xd80340 [WRITE] cmp    BYTE PTR [rbp+0x5c0],0x0
- 0xd82c40 [WRITE] cmp    BYTE PTR [rbx+0x5c0],0x0
- 0xd85046 [READ] movzx  eax,BYTE PTR [r12+0x5c0]
- 0xd85279 [WRITE] cmp    BYTE PTR [r14+0x5c0],0x0
- 0xd89fd3 [WRITE] cmp    BYTE PTR [rdi+0x5c0],0x0
- 0xd8b05b [WRITE] cmp    BYTE PTR [rax+0x5c0],0x0
- 0xd8b4d9 [WRITE] cmp    BYTE PTR [r13+0x5c0],0x0
- 0xdb13cc [READ] mov    rbx,QWORD PTR [rsp+0x5c0]
- 0xdb1e8c [READ] mov    rsi,QWORD PTR [rsp+0x5c0]
- 0xdb6e96 [READ] lea    rdi,[rbx+0x5c0]
- 0xdb6fb7 [READ] lea    rdi,[rbx+0x5c0]
- 0xdb701b [WRITE] test   BYTE PTR [rbx+0x5c0],0x1
- 0xdb71d9 [READ] lea    rdi,[rbx+0x5c0]
- 0xde7fe0 [READ] movups xmm0,XMMWORD PTR [rsp+0x5c0]
- 0xde800c [WRITE] movups XMMWORD PTR [rsp+0x5c0],xmm0
- 0xde85ed [READ] lea    rdi,[rsp+0x5c0]
- 0xe40d24 [READ] lea    rdi,[rsp+0x5c0]
- 0xe40e20 [READ] lea    rsi,[rsp+0x5c0]
- 0xe40f1b [READ] lea    rdi,[rsp+0x5c0]
- 0xe929dc [READ] lea    rbx,[rsp+0x5c0]
- 0xeb0bca [READ] lea    rdi,[rsp+0x5c0]
- 0xeb0c8b [READ] lea    r13,[rsp+0x5c0]
- 0xeb0d41 [READ] lea    rdi,[rsp+0x5c0]
- 0xeb0d9b [READ] lea    rdi,[rsp+0x5c0]
- 0xebce8b [WRITE] movdqu XMMWORD PTR [rsp+0x5c0],xmm0
- 0xebcee2 [READ] lea    rbx,[rsp+0x5c0]
- 0xebcfa0 [READ] lea    rdi,[rsp+0x5c0]
- 0xebd045 [READ] lea    rdi,[rsp+0x5c0]
- 0xebd13f [READ] mov    r8,QWORD PTR [rsp+0x5c0]
- 0xebd1d2 [READ] lea    rdi,[rsp+0x5c0]
- 0xebd1ef [READ] lea    rdi,[rsp+0x5c0]
- 0xebd28c [READ] lea    rdi,[rsp+0x5c0]
- 0xebd53b [READ] lea    rdi,[rsp+0x5c0]
- 0xebd558 [READ] mov    rcx,QWORD PTR [rsp+0x5c0]
- 0xebd5d0 [READ] lea    rdi,[rsp+0x5c0]
- 0xebd635 [READ] lea    rdi,[rsp+0x5c0]
- 0xebd734 [READ] mov    rcx,QWORD PTR [rsp+0x5c0]
- 0xebd757 [WRITE] movdqu XMMWORD PTR [rsp+0x5c0],xmm0
- 0xebd781 [READ] lea    rdi,[rsp+0x5c0]
- 0xebda43 [READ] lea    rdi,[rsp+0x5c0]
- 0xece2bf [READ] lea    rdi,[rbx+0x5c0]
- 0xed0aac [READ] lea    rdi,[rsp+0x5c0]
- 0xed0ad4 [READ] lea    rdi,[rsp+0x5c0]
- 0xed0b60 [READ] lea    rdi,[rsp+0x5c0]
- 0xed0db4 [READ] lea    rdx,[rsp+0x5c0]
- 0xed0dc3 [READ] lea    rdi,[rsp+0x5c0]
- 0xed0f62 [READ] lea    rdi,[rsp+0x5c0]
- 0xed0ffb [READ] lea    rsi,[rsp+0x5c0]
- 0xed1067 [READ] lea    r15,[rsp+0x5c0]
- 0xed1088 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1184 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1194 [WRITE] cmp    DWORD PTR [rsp+0x5c0],0x2
- 0xed1205 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1219 [READ] lea    rdx,[rsp+0x5c0]
- 0xed1229 [READ] lea    rdi,[rsp+0x5c0]
- 0xed123d [READ] lea    rdi,[rsp+0x5c0]
- 0xed1251 [READ] lea    rdx,[rsp+0x5c0]
- 0xed1261 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1275 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1289 [READ] lea    rdx,[rsp+0x5c0]
- 0xed1299 [READ] lea    rdi,[rsp+0x5c0]
- 0xed12ad [READ] lea    rdi,[rsp+0x5c0]
- 0xed12c1 [READ] lea    rdx,[rsp+0x5c0]
- 0xed12d1 [READ] lea    rdi,[rsp+0x5c0]
- 0xed12e5 [READ] lea    rdi,[rsp+0x5c0]
- 0xed12f9 [READ] lea    rdx,[rsp+0x5c0]
- 0xed1309 [READ] lea    rdi,[rsp+0x5c0]
- 0xed131d [READ] lea    rdi,[rsp+0x5c0]
- 0xed1331 [READ] lea    rdx,[rsp+0x5c0]
- 0xed1341 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1355 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1369 [READ] lea    rdx,[rsp+0x5c0]
- 0xed1379 [READ] lea    rdi,[rsp+0x5c0]
- 0xed138d [READ] lea    rdi,[rsp+0x5c0]
- 0xed13a1 [READ] lea    rdx,[rsp+0x5c0]
- 0xed13b1 [READ] lea    rdi,[rsp+0x5c0]
- 0xed13c5 [READ] lea    rdi,[rsp+0x5c0]
- 0xed13d9 [READ] lea    rdx,[rsp+0x5c0]
- 0xed13e9 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1407 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1414 [READ] lea    rsi,[rsp+0x5c0]
- 0xed1424 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1438 [READ] lea    rdi,[rsp+0x5c0]
- 0xed144c [READ] lea    rdx,[rsp+0x5c0]
- 0xed145c [READ] lea    rdi,[rsp+0x5c0]
- 0xed1470 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1484 [READ] lea    rdx,[rsp+0x5c0]
- 0xed1494 [READ] lea    rdi,[rsp+0x5c0]
- 0xed14a8 [READ] lea    rdi,[rsp+0x5c0]
- 0xed14bc [READ] lea    rdx,[rsp+0x5c0]
- 0xed14cc [READ] lea    rdi,[rsp+0x5c0]
- 0xed14e0 [READ] lea    rdi,[rsp+0x5c0]
- 0xed14f4 [READ] lea    rdx,[rsp+0x5c0]
- 0xed1504 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1b99 [READ] lea    rdi,[rsp+0x5c0]
- 0xed1bfb [READ] lea    rdi,[rsp+0x5c0]
- 0xed1c0d [READ] lea    rdi,[rsp+0x5c0]
- 0xf059e7 [WRITE] mov    QWORD PTR [rsp+0x5c0],rax
- 0xf05e6f [READ] cmp    rax,QWORD PTR [rsp+0x5c0]
- 0xf05f36 [READ] cmp    rax,QWORD PTR [rsp+0x5c0]
- 0xf35bf2 [READ] lea    rbx,[rsp+0x5c0]
- 0xf35c22 [READ] lea    r14,[rsp+0x5c0]
- 0xf35c73 [READ] lea    rdi,[rsp+0x5c0]
- 0xf35d46 [READ] lea    rbx,[rsp+0x5c0]
- 0xf36148 [WRITE] mov    QWORD PTR [rsp+0x5c0],rbp
- 0xf36162 [WRITE] movaps XMMWORD PTR [rsp+0x5c0],xmm0
- 0xf3616f [WRITE] mov    QWORD PTR [rsp+0x5c0],rbp
- 0xf361a5 [READ] mov    rax,QWORD PTR [rsp+0x5c0]
- 0xf3620d [READ] lea    r14,[rsp+0x5c0]
- 0xf36229 [READ] lea    r14,[rsp+0x5c0]
- 0xf3626d [READ] lea    r14,[rsp+0x5c0]
- 0xf36396 [READ] lea    rdi,[rsp+0x5c0]
- 0xf54ce5 [READ] mov    rdi,QWORD PTR [rsp+0x5c0]
- 0xf55008 [READ] lea    rdi,[rsp+0x5c0]
- 0xf55062 [READ] mov    r12,QWORD PTR [rsp+0x5c0]
- 0xf552a9 [READ] lea    rdi,[rsp+0x5c0]
- 0xf565c0 [WRITE] movaps XMMWORD PTR [rsp+0x5c0],xmm0
- 0x105e34b [WRITE] movaps XMMWORD PTR [rsp+0x5c0],xmm0
- 0x105e357 [WRITE] mov    BYTE PTR [rsp+0x5c0],0x0
- 0x105e361 [READ] lea    r8,[rsp+0x5c0]
- 0x1066952 [WRITE] and    QWORD PTR [rbx+0x5c0],0x0
- 0x1089e9f [READ] mov    rax,QWORD PTR [r14+0x5c0]
- 0x1089ea6 [WRITE] mov    QWORD PTR [rbx+0x5c0],rax
- 0x1089ebc [WRITE] and    QWORD PTR [r14+0x5c0],0x0
- 0x10a6bbb [READ] cmp    rax,QWORD PTR [r14+0x5c0]
- 0x10e57be [READ] lea    rdi,[rbx+0x5c0]
- 0x11a3653 [READ] mov    rdi,QWORD PTR [rbx+0x5c0]
- 0x11a365a [WRITE] mov    QWORD PTR [rbx+0x5c0],rax
- 0x11a3682 [READ] mov    rdi,QWORD PTR [rbx+0x5c0]
- 0x11b08c7 [READ] mov    rax,QWORD PTR [rsp+0x5c0]
- 0x11b08f1 [WRITE] and    QWORD PTR [rsp+0x5c0],0x0
- 0x11b7760 [READ] mov    r15,QWORD PTR [rsp+0x5c0]
- 0x11ee6cf [READ] mov    rdi,QWORD PTR [rax+0x5c0]
- 0x11ef6e0 [READ] lea    r14,[rsp+0x5c0]
- 0x11ef930 [READ] lea    rdi,[rsp+0x5c0]
- 0x11ef9d3 [READ] lea    rbp,[rsp+0x5c0]
- 0x11efa1f [READ] lea    rdi,[rsp+0x5c0]
- 0x11efbe0 [READ] lea    rbp,[rsp+0x5c0]
- 0x11efc46 [READ] lea    r14,[rsp+0x5c0]
- 0x11efca1 [READ] lea    rdi,[rsp+0x5c0]
- 0x11efcd3 [READ] lea    r15,[rsp+0x5c0]
- 0x11efd1b [READ] lea    rdi,[rsp+0x5c0]
- 0x11eff42 [WRITE] mov    QWORD PTR [rsp+0x5c0],rax
- 0x11eff52 [READ] lea    rdx,[rsp+0x5c0]
- 0x11eff96 [READ] lea    rdi,[rsp+0x5c0]
- 0x11effc3 [READ] lea    r15,[rsp+0x5c0]
- 0x11f0015 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f0046 [READ] lea    r13,[rsp+0x5c0]
- 0x11f00aa [READ] lea    r12,[rsp+0x5c0]
- 0x11f0139 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f018c [READ] lea    r15,[rsp+0x5c0]
- 0x11f01d4 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f0225 [READ] lea    r15,[rsp+0x5c0]
- 0x11f03d1 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f03ec [READ] lea    r14,[rsp+0x5c0]
- 0x11f0549 [READ] lea    r13,[rsp+0x5c0]
- 0x11f05a2 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f05cd [READ] lea    rbp,[rsp+0x5c0]
- 0x11f0619 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f0736 [WRITE] mov    QWORD PTR [rsp+0x5c0],rax
- 0x11f07c1 [READ] lea    r13,[rsp+0x5c0]
- 0x11f08d1 [READ] lea    r15,[rsp+0x5c0]
- 0x11f0925 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f09dc [READ] lea    rbp,[rsp+0x5c0]
- 0x11f0a23 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f0aeb [WRITE] mov    QWORD PTR [rsp+0x5c0],r14
- 0x11f0b80 [READ] lea    rsi,[rsp+0x5c0]
- 0x11f0bef [READ] lea    rdi,[rsp+0x5c0]
- 0x11f0c2d [READ] lea    rsi,[rsp+0x5c0]
- 0x11f0d6d [READ] lea    rdi,[rsp+0x5c0]
- 0x11f0e58 [WRITE] mov    QWORD PTR [rsp+0x5c0],r15
- 0x11f0f0a [READ] lea    rsi,[rsp+0x5c0]
- 0x11f1010 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f109e [READ] lea    r13,[rsp+0x5c0]
- 0x11f10fa [READ] lea    rdi,[rsp+0x5c0]
- 0x11f123f [READ] lea    r14,[rsp+0x5c0]
- 0x11f128c [READ] lea    rdi,[rsp+0x5c0]
- 0x11f13dd [READ] lea    r14,[rsp+0x5c0]
- 0x11f142a [READ] lea    rdi,[rsp+0x5c0]
- 0x11f1811 [READ] lea    r13,[rsp+0x5c0]
- 0x11f185c [READ] lea    rdi,[rsp+0x5c0]
- 0x11f1886 [READ] lea    r13,[rsp+0x5c0]
- 0x11f1969 [READ] lea    r15,[rsp+0x5c0]
- 0x11f1b1f [READ] lea    r15,[rsp+0x5c0]
- 0x11f1bc4 [READ] lea    r14,[rsp+0x5c0]
- 0x11f1c12 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f1ccf [READ] lea    r13,[rsp+0x5c0]
- 0x11f1d34 [READ] lea    r12,[rsp+0x5c0]
- 0x11f1d89 [READ] lea    r12,[rsp+0x5c0]
- 0x11f1e5b [READ] lea    r12,[rsp+0x5c0]
- 0x11f1f2f [READ] lea    r15,[rsp+0x5c0]
- 0x11f2001 [READ] lea    r15,[rsp+0x5c0]
- 0x11f20d3 [READ] lea    r15,[rsp+0x5c0]
- 0x11f21a5 [READ] lea    r15,[rsp+0x5c0]
- 0x11f2277 [READ] lea    r15,[rsp+0x5c0]
- 0x11f26ef [READ] lea    r13,[rsp+0x5c0]
- 0x11f2737 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f2761 [READ] lea    r12,[rsp+0x5c0]
- 0x11f2901 [READ] lea    r12,[rsp+0x5c0]
- 0x11f294c [READ] lea    rdi,[rsp+0x5c0]
- 0x11f2976 [READ] lea    rbp,[rsp+0x5c0]
- 0x11f29bf [READ] lea    rdi,[rsp+0x5c0]
- 0x11f2a77 [READ] lea    r12,[rsp+0x5c0]
- 0x11f2b46 [READ] lea    r15,[rsp+0x5c0]
- 0x11f2c18 [READ] lea    r15,[rsp+0x5c0]
- 0x11f2cea [READ] lea    r15,[rsp+0x5c0]
- 0x11f2dbc [READ] lea    r15,[rsp+0x5c0]
- 0x11f2e8e [READ] lea    r15,[rsp+0x5c0]
- 0x11f303e [READ] lea    r15,[rsp+0x5c0]
- 0x11f308b [READ] lea    rdi,[rsp+0x5c0]
- 0x11f30bd [READ] lea    r15,[rsp+0x5c0]
- 0x11f3379 [READ] lea    r14,[rsp+0x5c0]
- 0x11f33cc [READ] lea    rdi,[rsp+0x5c0]
- 0x11f3485 [READ] lea    r14,[rsp+0x5c0]
- 0x11f3a47 [READ] lea    r13,[rsp+0x5c0]
- 0x11f3b04 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f3b18 [READ] lea    r14,[rsp+0x5c0]
- 0x11f3b65 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f3b77 [READ] mov    rax,QWORD PTR [rsp+0x5c0]
- 0x11f3c78 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f3ca3 [READ] lea    r14,[rsp+0x5c0]
- 0x11f3d38 [READ] lea    rbp,[rsp+0x5c0]
- 0x11f3d93 [READ] lea    r15,[rsp+0x5c0]
- 0x11f3def [READ] lea    rdi,[rsp+0x5c0]
- 0x11f3e15 [READ] lea    r14,[rsp+0x5c0]
- 0x11f3e61 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f3f4e [READ] lea    r14,[rsp+0x5c0]
- 0x11f3fac [READ] lea    rdi,[rsp+0x5c0]
- 0x11f42b1 [READ] lea    r14,[rsp+0x5c0]
- 0x11f430a [READ] lea    rdi,[rsp+0x5c0]
- 0x11f4330 [READ] lea    r14,[rsp+0x5c0]
- 0x11f4387 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f43d3 [READ] lea    r12,[rsp+0x5c0]
- 0x11f4429 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f4631 [READ] lea    r12,[rsp+0x5c0]
- 0x11f46e4 [WRITE] mov    QWORD PTR [rsp+0x5c0],rcx
- 0x11f4709 [WRITE] movdqa XMMWORD PTR [rsp+0x5c0],xmm0
- 0x11f4720 [READ] lea    rdx,[rsp+0x5c0]
- 0x11f4798 [READ] lea    r12,[rsp+0x5c0]
- 0x11f47eb [READ] lea    rdi,[rsp+0x5c0]
- 0x11f4818 [READ] lea    r13,[rsp+0x5c0]
- 0x11f4863 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f48fc [READ] lea    rdi,[rsp+0x5c0]
- 0x11f491c [READ] lea    rdx,[rsp+0x5c0]
- 0x11f4966 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f497a [READ] lea    rdi,[rsp+0x5c0]
- 0x11f499a [READ] lea    rdx,[rsp+0x5c0]
- 0x11f49e8 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f4a4b [READ] lea    rdi,[rsp+0x5c0]
- 0x11f4a62 [READ] mov    r15,QWORD PTR [rsp+0x5c0]
- 0x11f4cbe [READ] lea    r15,[rsp+0x5c0]
- 0x11f4ccc [READ] mov    rdi,QWORD PTR [rsp+0x5c0]
- 0x11f4d29 [WRITE] mov    QWORD PTR [rsp+0x5c0],rax
- 0x11f4dfb [READ] lea    r12,[rsp+0x5c0]
- 0x11f4e84 [READ] lea    rbx,[rsp+0x5c0]
- 0x11f4ee4 [READ] lea    rsi,[rsp+0x5c0]
- 0x11f4f47 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f4f5c [READ] lea    rdi,[rsp+0x5c0]
- 0x11f4ffb [READ] lea    rdi,[rsp+0x5c0]
- 0x11f502e [READ] lea    rdi,[rsp+0x5c0]
- 0x11f50cf [READ] lea    rdi,[rsp+0x5c0]
- 0x11f5103 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f511a [READ] lea    rdi,[rsp+0x5c0]
- 0x11f51a9 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f526e [READ] lea    rdi,[rsp+0x5c0]
- 0x11f5288 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f52de [READ] lea    rdi,[rsp+0x5c0]
- 0x11f53cb [READ] lea    rdi,[rsp+0x5c0]
- 0x11f540c [READ] lea    rdi,[rsp+0x5c0]
- 0x11f545e [READ] lea    rdi,[rsp+0x5c0]
- 0x11f54ac [READ] lea    rdi,[rsp+0x5c0]
- 0x11f5534 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f557b [READ] lea    rdi,[rsp+0x5c0]
- 0x11f5590 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f55e6 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f562f [READ] lea    rdi,[rsp+0x5c0]
- 0x11f567d [READ] lea    rdi,[rsp+0x5c0]
- 0x11f5697 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f5709 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f571b [READ] lea    rdi,[rsp+0x5c0]
- 0x11f572d [READ] lea    rdi,[rsp+0x5c0]
- 0x11f57c3 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f58a8 [READ] lea    rdi,[rsp+0x5c0]
- 0x11f5974 [READ] lea    rdi,[rsp+0x5c0]
- 0x1203231 [READ] mov    rsi,QWORD PTR [rsp+0x5c0]
- 0x12286e1 [WRITE] mov    QWORD PTR [rsp+0x5c0],rax
- 0x1228eb4 [READ] mov    rsi,QWORD PTR [rcx+0x5c0]
- 0x122907f [READ] mov    rsi,QWORD PTR [r13+0x5c0]
- 0x12290b9 [READ] cmp    rax,QWORD PTR [rsp+0x5c0]
- 0x1229382 [READ] mov    al,BYTE PTR [rsp+0x5c0]
- 0x122ad5d [WRITE] movups XMMWORD PTR [rbx+0x5c0],xmm0
- 0x122c9dc [READ] lea    rdi,[rbx+0x5c0]
- 0x122cba0 [READ] lea    rax,[rdi+0x5c0]
- 0x1264a7c [READ] lea    rsi,[rsp+0x5c0]
- 0x127b61b [WRITE] movups XMMWORD PTR [rsp+0x5c0],xmm0
- 0x1288b5b [WRITE] mov    QWORD PTR [rsp+0x5c0],rax
- 0x1288d6c [READ] cmp    rax,QWORD PTR [rsp+0x5c0]
- 0x1288dc5 [READ] cmp    rax,QWORD PTR [rsp+0x5c0]
- 0x12995bb [WRITE] mov    QWORD PTR [rsp+0x5c0],rax
- 0x12abd08 [WRITE] mov    QWORD PTR [rsp+0x5c0],rax
- 0x12ac321 [READ] cmp    rax,QWORD PTR [rsp+0x5c0]
- 0x12ac4a6 [READ] cmp    rax,QWORD PTR [rsp+0x5c0]
- 0x12cb808 [WRITE] movups XMMWORD PTR [rbx+0x5c0],xmm0
- 0x12d8f46 [READ] lea    r14,[rbx+0x5c0]
- 0x12fb9b2 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fb9ce [READ] lea    rdi,[rsp+0x5c0]
- 0x12fba30 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fba52 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fbaca [READ] lea    rsi,[rsp+0x5c0]
- 0x12fbaec [READ] lea    rdi,[rsp+0x5c0]
- 0x12fbcec [READ] lea    rbp,[rsp+0x5c0]
- 0x12fbd14 [READ] mov    r15,QWORD PTR [rsp+0x5c0]
- 0x12fbdc6 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fbde0 [READ] lea    rbx,[rsp+0x5c0]
- 0x12fbe66 [READ] lea    r13,[rsp+0x5c0]
- 0x12fbf68 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fbf8a [READ] lea    rsi,[rsp+0x5c0]
- 0x12fbf97 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fbfa9 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fc0d4 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fc0ff [READ] lea    rdi,[rsp+0x5c0]
- 0x12fc165 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fc1b7 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fc431 [READ] lea    rbx,[rsp+0x5c0]
- 0x12fc4d3 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fc4f0 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fc520 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fc63d [READ] lea    rbx,[rsp+0x5c0]
- 0x12fc65f [READ] lea    rdi,[rsp+0x5c0]
- 0x12fc674 [READ] lea    r15,[rsp+0x5c0]
- 0x12fc6cb [READ] lea    r15,[rsp+0x5c0]
- 0x12fc843 [READ] lea    rbx,[rsp+0x5c0]
- 0x12fc96f [READ] lea    rdi,[rsp+0x5c0]
- 0x12fc9df [READ] lea    rdi,[rsp+0x5c0]
- 0x12fca28 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fca6c [READ] lea    rdi,[rsp+0x5c0]
- 0x12fcc41 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fcc6c [READ] lea    rdi,[rsp+0x5c0]
- 0x12fcc88 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fccf0 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fcd4a [READ] lea    rdi,[rsp+0x5c0]
- 0x12fcd65 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fcda8 [READ] lea    rdi,[rsp+0x5c0]
- 0x12fcdbc [READ] lea    rdi,[rsp+0x5c0]
- 0x1333835 [WRITE] mov    QWORD PTR [rbx+0x5c0],rax
- 0x1333859 [READ] mov    rdi,QWORD PTR [rbx+0x5c0]
- 0x1333ade [READ] mov    r15,QWORD PTR [rbx+0x5c0]
- 0x1333c33 [READ] mov    rsi,QWORD PTR [rbx+0x5c0]
- 0x133435a [READ] mov    rdi,QWORD PTR [rbx+0x5c0]
- 0x1337bfd [READ] mov    rdi,QWORD PTR [rbx+0x5c0]
- 0x13383d5 [READ] mov    rdi,QWORD PTR [rbx+0x5c0]
- 0x1339135 [READ] mov    rdi,QWORD PTR [rbx+0x5c0]
- 0x133a3e3 [READ] mov    rdi,QWORD PTR [rbx+0x5c0]
- 0x133a5c5 [READ] mov    rsi,QWORD PTR [rsi+0x5c0]
- 0x133a722 [READ] mov    rdi,QWORD PTR [rbx+0x5c0]
- 0x133a75c [READ] mov    rdi,QWORD PTR [r14+0x5c0]
- 0x133a84c [READ] mov    rdi,QWORD PTR [rdi+0x5c0]
- 0x1358d1c [READ] mov    rbx,QWORD PTR [rsp+0x5c0]
- 0x135c7b3 [READ] mov    r14,QWORD PTR [rax+0x5c0]
- 0x135d5f2 [READ] lea    rdi,[rsp+0x5c0]
- 0x135d936 [WRITE] mov    QWORD PTR [rsp+0x5c0],r14
- 0x135f6af [WRITE] and    WORD PTR [r14+0x5c0],0x0
- 0x1367c4d [WRITE] cmp    BYTE PTR [r14+0x5c0],0x0
- 0x1367cc8 [WRITE] mov    BYTE PTR [r14+0x5c0],0x0
- 0x136dd3d [READ] mov    rax,QWORD PTR [rbp+0x5c0]
- 0x136f412 [WRITE] mov    BYTE PTR [rbx+0x5c0],0x1
- 0x13760e8 [READ] lea    rsi,[rsp+0x5c0]
- 0x13760f3 [READ] lea    rdi,[rsp+0x5c0]
- 0x13762a8 [READ] lea    r14,[rsp+0x5c0]
- 0x137630c [READ] lea    r14,[rsp+0x5c0]
- 0x13764f8 [READ] lea    rdi,[rsp+0x5c0]
- 0x13771eb [WRITE] mov    QWORD PTR [rsp+0x5c0],rax
- 0x144b149 [READ] lea    rdi,[rsp+0x5c0]
- 0x146313f [READ] lea    rsi,[rsp+0x5c0]
- 0x14631f0 [READ] lea    rsi,[rsp+0x5c0]
- 0x148432a [WRITE] mov    BYTE PTR [rsp+0x5c0],cl
- 0x1484cae [READ] lea    r12,[rsp+0x5c0]
- 0x149df3e [READ] mov    rcx,QWORD PTR [rsp+0x5c0]
- 0x149e0c0 [READ] mov    rax,QWORD PTR [rsp+0x5c0]
- 0x149ea02 [READ] mov    rax,QWORD PTR [rsp+0x5c0]
- 0x149ed54 [READ] mov    rax,QWORD PTR [rsp+0x5c0]
- 0x149ef70 [READ] mov    rax,QWORD PTR [rsp+0x5c0]
- 0x149f6bf [READ] mov    rax,QWORD PTR [rsp+0x5c0]
- 0x149f8c9 [READ] mov    rax,QWORD PTR [rsp+0x5c0]
- 0x149fa0c [READ] mov    rax,QWORD PTR [rsp+0x5c0]
- 0x14a7845 [WRITE] call   QWORD PTR [rax+0x5c0]
- 0x14a7d33 [WRITE] call   QWORD PTR [rax+0x5c0]
- 0x151fe88 [WRITE] movaps XMMWORD PTR [rsi+0x5c0],xmm0
- 0x152075d [READ] lea    rsi,[rsp+0x5c0]
- 0x15290c8 [WRITE] cmp    BYTE PTR [r14+0x5c0],0x0
- 0x1632c13 [READ] mov    rax,QWORD PTR [rsp+0x5c0]
- 0x167af53 [WRITE] movups XMMWORD PTR [rdi+0x5c0],xmm0
- 0x17d4220 [WRITE] call   QWORD PTR [rax+0x5c0]

## Context for +0x5c0 writes
### 0xaa2779: movaps XMMWORD PTR [rsp+0x5c0],xmm0
      aa2745:	00 
      aa2746:	0f 29 8b 88 00 00 00 	movaps XMMWORD PTR [rbx+0x88],xmm1
      aa274d:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
      aa2754:	00 
      aa2755:	8b 83 a0 00 00 00    	mov    eax,DWORD PTR [rbx+0xa0]
      aa275b:	89 84 24 b8 05 00 00 	mov    DWORD PTR [rsp+0x5b8],eax
      aa2762:	48 8d 8c 24 10 13 00 	lea    rcx,[rsp+0x1310]
      aa2769:	00 
      aa276a:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
      aa276e:	48 89 84 24 d0 05 00 	mov    QWORD PTR [rsp+0x5d0],rax
      aa2775:	00 
      aa2776:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
      aa2779:	0f 29 84 24 c0 05 00 	movaps XMMWORD PTR [rsp+0x5c0],xmm0
      aa2780:	00 
      aa2781:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
      aa2786:	0f 29 09             	movaps XMMWORD PTR [rcx],xmm1
      aa2789:	48 8d 8c 24 28 13 00 	lea    rcx,[rsp+0x1328]
      aa2790:	00 
      aa2791:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
      aa2795:	48 89 84 24 e8 05 00 	mov    QWORD PTR [rsp+0x5e8],rax
      aa279c:	00 
      aa279d:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      aa27a1:	f3 0f 7f 84 24 d8 05 	movdqu XMMWORD PTR [rsp+0x5d8],xmm0
      aa27a8:	00 00 
      aa27aa:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
      aa27af:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
      aa27b2:	8a 83 e0 00 00 00    	mov    al,BYTE PTR [rbx+0xe0]
      aa27b8:	88 84 24 f8 05 00 00 	mov    BYTE PTR [rsp+0x5f8],al
      aa27bf:	48 8b 83 d8 00 00 00 	mov    rax,QWORD PTR [rbx+0xd8]
      aa27c6:	48 89 84 24 f0 05 00 	mov    QWORD PTR [rsp+0x5f0],rax

### 0xab3d5a: call   QWORD PTR [rax+0x5c0]
      ab3d36:	74 61                	je     ab3d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd39>
      ab3d38:	48 89 d3             	mov    rbx,rdx
      ab3d3b:	49 89 f6             	mov    r14,rsi
      ab3d3e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ab3d41:	48 89 f7             	mov    rdi,rsi
      ab3d44:	48 89 d6             	mov    rsi,rdx
      ab3d47:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
      ab3d4d:	89 c5                	mov    ebp,eax
      ab3d4f:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ab3d52:	4c 89 f7             	mov    rdi,r14
      ab3d55:	48 89 de             	mov    rsi,rbx
      ab3d58:	31 d2                	xor    edx,edx
      ab3d5a:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      ab3d60:	48 85 c0             	test   rax,rax
      ab3d63:	74 32                	je     ab3d97 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd37>
      ab3d65:	83 fd 10             	cmp    ebp,0x10
      ab3d68:	75 0f                	jne    ab3d79 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd19>
      ab3d6a:	49 8b 4f 08          	mov    rcx,QWORD PTR [r15+0x8]
      ab3d6e:	83 61 04 00          	and    DWORD PTR [rcx+0x4],0x0
      ab3d72:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      ab3d75:	0f 11 41 18          	movups XMMWORD PTR [rcx+0x18],xmm0
      ab3d79:	4d 8b 06             	mov    r8,QWORD PTR [r14]
      ab3d7c:	6a 02                	push   0x2
      ab3d7e:	59                   	pop    rcx
      ab3d7f:	4c 89 f7             	mov    rdi,r14
      ab3d82:	48 89 de             	mov    rsi,rbx
      ab3d85:	48 89 c2             	mov    rdx,rax
      ab3d88:	41 ff 90 00 06 00 00 	call   QWORD PTR [r8+0x600]
      ab3d8f:	83 fd 10             	cmp    ebp,0x10
      ab3d92:	0f 94 c0             	sete   al

### 0xabdcab: call   QWORD PTR [rax+0x5c0]
      abdc85:	49 89 ce             	mov    r14,rcx
      abdc88:	48 89 d3             	mov    rbx,rdx
      abdc8b:	49 89 ff             	mov    r15,rdi
      abdc8e:	48 89 d7             	mov    rdi,rdx
      abdc91:	e8 5a 04 d3 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
      abdc96:	48 83 bb 80 00 00 00 	cmp    QWORD PTR [rbx+0x80],0x0
      abdc9d:	00 
      abdc9e:	74 53                	je     abdcf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac93>
      abdca0:	49 8b 07             	mov    rax,QWORD PTR [r15]
      abdca3:	4c 89 ff             	mov    rdi,r15
      abdca6:	4c 89 f6             	mov    rsi,r14
      abdca9:	31 d2                	xor    edx,edx
      abdcab:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      abdcb1:	49 89 c4             	mov    r12,rax
      abdcb4:	48 85 c0             	test   rax,rax
      abdcb7:	74 3a                	je     abdcf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac93>
      abdcb9:	48 63 d5             	movsxd rdx,ebp
      abdcbc:	48 89 e7             	mov    rdi,rsp
      abdcbf:	4c 89 e6             	mov    rsi,r12
      abdcc2:	e8 d9 01 d3 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
      abdcc7:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
      abdcce:	48 89 e6             	mov    rsi,rsp
      abdcd1:	e8 ba 00 00 00       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      abdcd6:	48 89 e7             	mov    rdi,rsp
      abdcd9:	e8 b2 01 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      abdcde:	49 8b 07             	mov    rax,QWORD PTR [r15]
      abdce1:	6a 02                	push   0x2
      abdce3:	59                   	pop    rcx
      abdce4:	4c 89 ff             	mov    rdi,r15
      abdce7:	4c 89 f6             	mov    rsi,r14

### 0xad1308: call   QWORD PTR [rax+0x5c0]
      ad12df:	e8 99 41 d0 00       	call   17d547d <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x129e>
      ad12e4:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ad12e7:	4c 89 f7             	mov    rdi,r14
      ad12ea:	4c 89 e6             	mov    rsi,r12
      ad12ed:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
      ad12f3:	89 c5                	mov    ebp,eax
      ad12f5:	4c 89 f7             	mov    rdi,r14
      ad12f8:	e8 eb 38 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      ad12fd:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ad1300:	4c 89 f7             	mov    rdi,r14
      ad1303:	4c 89 e6             	mov    rsi,r12
      ad1306:	31 d2                	xor    edx,edx
      ad1308:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      ad130e:	49 89 c5             	mov    r13,rax
      ad1311:	4c 89 f7             	mov    rdi,r14
      ad1314:	e8 cf 38 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      ad1319:	4d 85 ed             	test   r13,r13
      ad131c:	0f 84 a4 00 00 00    	je     ad13c6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e366>
      ad1322:	48 63 d5             	movsxd rdx,ebp
      ad1325:	4c 01 ea             	add    rdx,r13
      ad1328:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ad132d:	4c 89 ee             	mov    rsi,r13
      ad1330:	e8 a7 01 00 00       	call   ad14dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e47c>
      ad1335:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ad1338:	6a 02                	push   0x2
      ad133a:	59                   	pop    rcx
      ad133b:	4c 89 f7             	mov    rdi,r14
      ad133e:	4c 89 e6             	mov    rsi,r12
      ad1341:	4c 89 ea             	mov    rdx,r13
      ad1344:	ff 90 00 06 00 00    	call   QWORD PTR [rax+0x600]

### 0xb1e1c0: call   QWORD PTR [rax+0x5c0]
      b1e197:	e8 e1 72 cb 00       	call   17d547d <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x129e>
      b1e19c:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b1e19f:	4c 89 f7             	mov    rdi,r14
      b1e1a2:	4c 89 fe             	mov    rsi,r15
      b1e1a5:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
      b1e1ab:	89 c5                	mov    ebp,eax
      b1e1ad:	4c 89 f7             	mov    rdi,r14
      b1e1b0:	e8 33 6a cb 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      b1e1b5:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b1e1b8:	4c 89 f7             	mov    rdi,r14
      b1e1bb:	4c 89 fe             	mov    rsi,r15
      b1e1be:	31 d2                	xor    edx,edx
      b1e1c0:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      b1e1c6:	49 89 c4             	mov    r12,rax
      b1e1c9:	4c 89 f7             	mov    rdi,r14
      b1e1cc:	e8 17 6a cb 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      b1e1d1:	4d 85 e4             	test   r12,r12
      b1e1d4:	0f 84 d0 00 00 00    	je     b1e2aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6b24a>
      b1e1da:	48 63 d5             	movsxd rdx,ebp
      b1e1dd:	4c 01 e2             	add    rdx,r12
      b1e1e0:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      b1e1e5:	4c 89 e6             	mov    rsi,r12
      b1e1e8:	e8 ef 32 fb ff       	call   ad14dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e47c>
      b1e1ed:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b1e1f0:	6a 02                	push   0x2
      b1e1f2:	59                   	pop    rcx
      b1e1f3:	4c 89 f7             	mov    rdi,r14
      b1e1f6:	4c 89 fe             	mov    rsi,r15
      b1e1f9:	4c 89 e2             	mov    rdx,r12
      b1e1fc:	ff 90 00 06 00 00    	call   QWORD PTR [rax+0x600]

### 0xb3a15b: call   QWORD PTR [rax+0x5c0]
      b3a135:	49 89 fe             	mov    r14,rdi
      b3a138:	48 89 d6             	mov    rsi,rdx
      b3a13b:	48 89 c2             	mov    rdx,rax
      b3a13e:	31 c0                	xor    eax,eax
      b3a140:	e8 cf af f8 ff       	call   ac5114 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120b4>
      b3a145:	49 89 c7             	mov    r15,rax
      b3a148:	4c 89 f7             	mov    rdi,r14
      b3a14b:	e8 98 aa c9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      b3a150:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b3a153:	4c 89 f7             	mov    rdi,r14
      b3a156:	4c 89 fe             	mov    rsi,r15
      b3a159:	31 d2                	xor    edx,edx
      b3a15b:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      b3a161:	49 89 c4             	mov    r12,rax
      b3a164:	4c 89 f7             	mov    rdi,r14
      b3a167:	e8 7c aa c9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      b3a16c:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b3a16f:	4c 89 f7             	mov    rdi,r14
      b3a172:	4c 89 fe             	mov    rsi,r15
      b3a175:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
      b3a17b:	89 c5                	mov    ebp,eax
      b3a17d:	4c 89 f7             	mov    rdi,r14
      b3a180:	e8 63 aa c9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      b3a185:	48 63 d5             	movsxd rdx,ebp
      b3a188:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      b3a18f:	00 
      b3a190:	4c 89 e6             	mov    rsi,r12
      b3a193:	e8 08 3d cb 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
      b3a198:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b3a19b:	6a 02                	push   0x2

### 0xbc55a5: call   QWORD PTR [rax+0x5c0]
      bc5589:	5b                   	pop    rbx
      bc558a:	5d                   	pop    rbp
      bc558b:	c3                   	ret
      bc558c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bc558f:	48 03 b8 38 ff ff ff 	add    rdi,QWORD PTR [rax-0xc8]
      bc5596:	e9 3b ff ff ff       	jmp    bc54d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x112476>
      bc559b:	cc                   	int3
      bc559c:	55                   	push   rbp
      bc559d:	53                   	push   rbx
      bc559e:	50                   	push   rax
      bc559f:	48 89 fb             	mov    rbx,rdi
      bc55a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bc55a5:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      bc55ab:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      bc55ae:	48 89 df             	mov    rdi,rbx
      bc55b1:	48 89 c6             	mov    rsi,rax
      bc55b4:	ff 91 e0 04 00 00    	call   QWORD PTR [rcx+0x4e0]
      bc55ba:	48 89 c1             	mov    rcx,rax
      bc55bd:	48 c1 e9 20          	shr    rcx,0x20
      bc55c1:	6a ff                	push   0xffffffffffffffff
      bc55c3:	5d                   	pop    rbp
      bc55c4:	48 c1 e0 20          	shl    rax,0x20
      bc55c8:	89 ce                	mov    esi,ecx
      bc55ca:	48 09 c6             	or     rsi,rax
      bc55cd:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      bc55d0:	48 89 df             	mov    rdi,rbx
      bc55d3:	ff 90 d8 05 00 00    	call   QWORD PTR [rax+0x5d8]
      bc55d9:	48 89 c1             	mov    rcx,rax
      bc55dc:	48 c1 e8 20          	shr    rax,0x20
      bc55e0:	89 ce                	mov    esi,ecx

### 0xcc776a: cmp    BYTE PTR [rsp+0x5c0],0x0
      cc7735:	31 c0                	xor    eax,eax
      cc7737:	e8 96 f1 b0 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc773c:	48 8d 0d 5f 8a 6a ff 	lea    rcx,[rip+0xffffffffff6a8a5f]        # 3701a2 <_ZTSSt12bad_any_cast@@Base-0x20026>
      cc7743:	89 ef                	mov    edi,ebp
      cc7745:	4c 89 fe             	mov    rsi,r15
      cc7748:	ba ec 01 00 00       	mov    edx,0x1ec
      cc774d:	4c 89 64 24 58       	mov    QWORD PTR [rsp+0x58],r12
      cc7752:	4d 89 e0             	mov    r8,r12
      cc7755:	31 c0                	xor    eax,eax
      cc7757:	e8 76 f1 b0 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc775c:	48 8d 05 bd a4 78 ff 	lea    rax,[rip+0xffffffffff78a4bd]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
      cc7763:	4c 8d 05 bb a4 78 ff 	lea    r8,[rip+0xffffffffff78a4bb]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
      cc776a:	80 bc 24 c0 05 00 00 	cmp    BYTE PTR [rsp+0x5c0],0x0
      cc7771:	00 
      cc7772:	4c 0f 45 c0          	cmovne r8,rax
      cc7776:	48 8d 0d ad b8 6b ff 	lea    rcx,[rip+0xffffffffff6bb8ad]        # 38302a <_ZTSSt12bad_any_cast@@Base-0xd19e>
      cc777d:	89 ef                	mov    edi,ebp
      cc777f:	4c 89 fe             	mov    rsi,r15
      cc7782:	ba ed 01 00 00       	mov    edx,0x1ed
      cc7787:	31 c0                	xor    eax,eax
      cc7789:	e8 44 f1 b0 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc778e:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
      cc7792:	48 83 f8 03          	cmp    rax,0x3
      cc7796:	77 0d                	ja     cc77a5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x214745>
      cc7798:	48 8d 0d 41 91 bb 00 	lea    rcx,[rip+0xbb9141]        # 18808e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3cfc8>
      cc779f:	4c 8b 04 c1          	mov    r8,QWORD PTR [rcx+rax*8]
      cc77a3:	eb 07                	jmp    cc77ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21474c>
      cc77a5:	4c 8d 05 6c a4 78 ff 	lea    r8,[rip+0xffffffffff78a46c]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      cc77ac:	48 8d 35 c9 a7 78 ff 	lea    rsi,[rip+0xffffffffff78a7c9]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc77b3:	48 8d 0d d1 ec 6b ff 	lea    rcx,[rip+0xffffffffff6becd1]        # 38648b <_ZTSSt12bad_any_cast@@Base-0x9d3d>

### 0xcc7870: cmp    BYTE PTR [rsp+0x5c0],0x0
      cc7841:	00 00 
      cc7843:	49 8b 06             	mov    rax,QWORD PTR [r14]
      cc7846:	31 f6                	xor    esi,esi
      cc7848:	80 b8 78 01 00 00 00 	cmp    BYTE PTR [rax+0x178],0x0
      cc784f:	48 63 80 74 01 00 00 	movsxd rax,DWORD PTR [rax+0x174]
      cc7856:	48 0f 45 f0          	cmovne rsi,rax
      cc785a:	49 83 bc 24 58 08 00 	cmp    QWORD PTR [r12+0x858],0x0
      cc7861:	00 00 
      cc7863:	7f 0b                	jg     cc7870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x214810>
      cc7865:	49 83 bc 24 60 08 00 	cmp    QWORD PTR [r12+0x860],0x0
      cc786c:	00 00 
      cc786e:	7e 49                	jle    cc78b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x214859>
      cc7870:	80 bc 24 c0 05 00 00 	cmp    BYTE PTR [rsp+0x5c0],0x0
      cc7877:	00 
      cc7878:	74 37                	je     cc78b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x214851>
      cc787a:	41 c6 84 24 f8 07 00 	mov    BYTE PTR [r12+0x7f8],0x1
      cc7881:	00 01 
      cc7883:	49 89 b4 24 00 08 00 	mov    QWORD PTR [r12+0x800],rsi
      cc788a:	00 
      cc788b:	eb 2c                	jmp    cc78b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x214859>
      cc788d:	e8 45 d4 7e 00       	call   14b4cd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fa25b>
      cc7892:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
      cc7897:	c7 01 02 00 00 00    	mov    DWORD PTR [rcx],0x2
      cc789d:	48 8d 05 2c 5b c6 00 	lea    rax,[rip+0xc65b2c]        # 192d3d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x747e0>
      cc78a4:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
      cc78a8:	c6 41 10 00          	mov    BYTE PTR [rcx+0x10],0x0
      cc78ac:	e9 e7 0f 00 00       	jmp    cc8898 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215838>
      cc78b1:	4c 89 e7             	mov    rdi,r12
      cc78b4:	e8 e7 ee ff ff       	call   cc67a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213740>
      cc78b9:	49 8d 7c 24 08       	lea    rdi,[r12+0x8]

### 0xcc8821: cmp    BYTE PTR [rsp+0x5c0],0x0
      cc87f2:	5f                   	pop    rdi
      cc87f3:	ba 87 02 00 00       	mov    edx,0x287
      cc87f8:	4d 89 e9             	mov    r9,r13
      cc87fb:	eb 1d                	jmp    cc881a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2157ba>
      cc87fd:	48 8d 35 78 97 78 ff 	lea    rsi,[rip+0xffffffffff789778]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc8804:	48 8d 0d a7 e3 6a ff 	lea    rcx,[rip+0xffffffffff6ae3a7]        # 376bb2 <_ZTSSt12bad_any_cast@@Base-0x19616>
      cc880b:	4c 8d 05 7c 46 6b ff 	lea    r8,[rip+0xffffffffff6b467c]        # 37ce8e <_ZTSSt12bad_any_cast@@Base-0x1333a>
      cc8812:	6a 04                	push   0x4
      cc8814:	5f                   	pop    rdi
      cc8815:	ba 97 02 00 00       	mov    edx,0x297
      cc881a:	31 c0                	xor    eax,eax
      cc881c:	e8 b1 e0 b0 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc8821:	80 bc 24 c0 05 00 00 	cmp    BYTE PTR [rsp+0x5c0],0x0
      cc8828:	00 
      cc8829:	74 0a                	je     cc8835 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2157d5>
      cc882b:	49 8d bc 24 68 01 00 	lea    rdi,[r12+0x168]
      cc8832:	00 
      cc8833:	eb 2c                	jmp    cc8861 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215801>
      cc8835:	41 80 bc 24 48 07 00 	cmp    BYTE PTR [r12+0x748],0x0
      cc883c:	00 00 
      cc883e:	74 08                	je     cc8848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2157e8>
      cc8840:	4c 89 e7             	mov    rdi,r12
      cc8843:	e8 ba de ff ff       	call   cc6702 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2136a2>
      cc8848:	49 8b bc 24 e0 05 00 	mov    rdi,QWORD PTR [r12+0x5e0]
      cc884f:	00 
      cc8850:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc8853:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      cc8859:	49 8d bc 24 c0 01 00 	lea    rdi,[r12+0x1c0]
      cc8860:	00 
      cc8861:	49 8b b4 24 e0 05 00 	mov    rsi,QWORD PTR [r12+0x5e0]

### 0xd43afc: call   QWORD PTR [rax+0x5c0]
      d43ada:	e8 09 11 a9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      d43adf:	4d 85 ed             	test   r13,r13
      d43ae2:	74 56                	je     d43b3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10bc0>
      d43ae4:	6a 02                	push   0x2
      d43ae6:	58                   	pop    rax
      d43ae7:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
      d43aeb:	4d 85 ff             	test   r15,r15
      d43aee:	74 51                	je     d43b41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10bc7>
      d43af0:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      d43af4:	4c 89 e7             	mov    rdi,r12
      d43af7:	4c 89 ee             	mov    rsi,r13
      d43afa:	31 d2                	xor    edx,edx
      d43afc:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      d43b02:	48 89 c5             	mov    rbp,rax
      d43b05:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      d43b09:	4c 89 e7             	mov    rdi,r12
      d43b0c:	4c 89 ee             	mov    rsi,r13
      d43b0f:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
      d43b15:	48 63 d0             	movsxd rdx,eax
      d43b18:	4c 89 ff             	mov    rdi,r15
      d43b1b:	48 89 ee             	mov    rsi,rbp
      d43b1e:	e8 2d ac aa 00       	call   17ee750 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKcm@plt>
      d43b23:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      d43b27:	4c 89 e7             	mov    rdi,r12
      d43b2a:	4c 89 ee             	mov    rsi,r13
      d43b2d:	48 89 ea             	mov    rdx,rbp
      d43b30:	31 c9                	xor    ecx,ecx
      d43b32:	ff 90 00 06 00 00    	call   QWORD PTR [rax+0x600]
      d43b38:	eb 07                	jmp    d43b41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10bc7>
      d43b3a:	6a ff                	push   0xffffffffffffffff

### 0xd4d80e: movdqa XMMWORD PTR [rsp+0x5c0],xmm0
      d4d7db:	48 8b b4 24 c0 06 00 	mov    rsi,QWORD PTR [rsp+0x6c0]
      d4d7e2:	00 
      d4d7e3:	e8 58 07 aa 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d4d7e8:	48 8b 84 24 d0 05 00 	mov    rax,QWORD PTR [rsp+0x5d0]
      d4d7ef:	00 
      d4d7f0:	48 89 84 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rax
      d4d7f7:	00 
      d4d7f8:	66 0f 6f 84 24 c0 05 	movdqa xmm0,XMMWORD PTR [rsp+0x5c0]
      d4d7ff:	00 00 
      d4d801:	66 0f 7f 84 24 80 04 	movdqa XMMWORD PTR [rsp+0x480],xmm0
      d4d808:	00 00 
      d4d80a:	66 0f ef c0          	pxor   xmm0,xmm0
      d4d80e:	66 0f 7f 84 24 c0 05 	movdqa XMMWORD PTR [rsp+0x5c0],xmm0
      d4d815:	00 00 
      d4d817:	48 83 a4 24 d0 05 00 	and    QWORD PTR [rsp+0x5d0],0x0
      d4d81e:	00 00 
      d4d820:	48 8d 9c 24 80 05 00 	lea    rbx,[rsp+0x580]
      d4d827:	00 
      d4d828:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
      d4d82f:	00 
      d4d830:	48 89 df             	mov    rdi,rbx
      d4d833:	e8 e8 6a e4 ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
      d4d838:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      d4d83f:	00 
      d4d840:	48 89 de             	mov    rsi,rbx
      d4d843:	e8 ce 17 f2 ff       	call   c6f016 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bbfb6>
      d4d848:	48 8b 9c 24 88 00 00 	mov    rbx,QWORD PTR [rsp+0x88]
      d4d84f:	00 
      d4d850:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      d4d853:	48 89 df             	mov    rdi,rbx

### 0xd6ba55: mov    BYTE PTR [r15+0x5c0],al
      d6ba1a:	f3 41 0f 7f 87 08 05 	movdqu XMMWORD PTR [r15+0x508],xmm0
      d6ba21:	00 00 
      d6ba23:	f3 41 0f 7f 87 18 05 	movdqu XMMWORD PTR [r15+0x518],xmm0
      d6ba2a:	00 00 
      d6ba2c:	41 89 9f 28 05 00 00 	mov    DWORD PTR [r15+0x528],ebx
      d6ba33:	66 41 0f 7f 87 30 05 	movdqa XMMWORD PTR [r15+0x530],xmm0
      d6ba3a:	00 00 
      d6ba3c:	66 41 0f 7f 87 40 05 	movdqa XMMWORD PTR [r15+0x540],xmm0
      d6ba43:	00 00 
      d6ba45:	41 89 9f 50 05 00 00 	mov    DWORD PTR [r15+0x550],ebx
      d6ba4c:	31 c0                	xor    eax,eax
      d6ba4e:	41 88 87 58 05 00 00 	mov    BYTE PTR [r15+0x558],al
      d6ba55:	41 88 87 c0 05 00 00 	mov    BYTE PTR [r15+0x5c0],al
      d6ba5c:	41 83 a7 d8 05 00 00 	and    DWORD PTR [r15+0x5d8],0x0
      d6ba63:	00 
      d6ba64:	f3 41 0f 7f 87 c8 05 	movdqu XMMWORD PTR [r15+0x5c8],xmm0
      d6ba6b:	00 00 
      d6ba6d:	41 83 a7 28 06 00 00 	and    DWORD PTR [r15+0x628],0x0
      d6ba74:	00 
      d6ba75:	f3 41 0f 7f 87 48 06 	movdqu XMMWORD PTR [r15+0x648],xmm0
      d6ba7c:	00 00 
      d6ba7e:	f3 41 0f 7f 87 58 06 	movdqu XMMWORD PTR [r15+0x658],xmm0
      d6ba85:	00 00 
      d6ba87:	f3 41 0f 7f 87 68 06 	movdqu XMMWORD PTR [r15+0x668],xmm0
      d6ba8e:	00 00 
      d6ba90:	49 83 a7 98 06 00 00 	and    QWORD PTR [r15+0x698],0x0
      d6ba97:	00 
      d6ba98:	f3 41 0f 7f 87 78 06 	movdqu XMMWORD PTR [r15+0x678],xmm0
      d6ba9f:	00 00 
      d6baa1:	f3 41 0f 7f 87 88 06 	movdqu XMMWORD PTR [r15+0x688],xmm0

### 0xd73ad5: cmp    BYTE PTR [r12+0x5c0],0x0
      d73aab:	00 
      d73aac:	48 8d ac 24 18 01 00 	lea    rbp,[rsp+0x118]
      d73ab3:	00 
      d73ab4:	31 c0                	xor    eax,eax
      d73ab6:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      d73abb:	31 c0                	xor    eax,eax
      d73abd:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      d73ac2:	31 c0                	xor    eax,eax
      d73ac4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d73ac9:	31 c0                	xor    eax,eax
      d73acb:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      d73ad0:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      d73ad5:	41 80 bc 24 c0 05 00 	cmp    BYTE PTR [r12+0x5c0],0x0
      d73adc:	00 00 
      d73ade:	74 2a                	je     d73b0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40b90>
      d73ae0:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
      d73ae4:	4c 89 ef             	mov    rdi,r13
      d73ae7:	e8 66 59 ff ff       	call   d69452 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364d8>
      d73aec:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      d73af3:	00 
      d73af4:	4c 89 ee             	mov    rsi,r13
      d73af7:	e8 ac 59 ff ff       	call   d694a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3652e>
      d73afc:	89 44 24 30          	mov    DWORD PTR [rsp+0x30],eax
      d73b00:	4c 89 ef             	mov    rdi,r13
      d73b03:	e8 26 18 95 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d73b08:	eb 08                	jmp    d73b12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40b98>
      d73b0a:	c7 44 24 30 00 00 00 	mov    DWORD PTR [rsp+0x30],0x0
      d73b11:	00 
      d73b12:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d73b15:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]

### 0xd772d2: cmp    BYTE PTR [rdi+0x5c0],0x0
      d772a2:	48 89 c3             	mov    rbx,rax
      d772a5:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      d772ac:	00 
      d772ad:	e8 4a 83 d2 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
      d772b2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d772b9:	00 00 
      d772bb:	48 3b 84 24 90 01 00 	cmp    rax,QWORD PTR [rsp+0x190]
      d772c2:	00 
      d772c3:	75 08                	jne    d772cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44353>
      d772c5:	48 89 df             	mov    rdi,rbx
      d772c8:	e8 03 8a cf ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d772cd:	e8 de 87 a7 00       	call   17efab0 <__stack_chk_fail@plt>
      d772d2:	80 bf c0 05 00 00 00 	cmp    BYTE PTR [rdi+0x5c0],0x0
      d772d9:	74 1e                	je     d772f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4437f>
      d772db:	50                   	push   rax
      d772dc:	48 8d b7 58 05 00 00 	lea    rsi,[rdi+0x558]
      d772e3:	48 81 c7 b8 04 00 00 	add    rdi,0x4b8
      d772ea:	e8 6b 4f 00 00       	call   d7c25a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x492e0>
      d772ef:	48 85 c0             	test   rax,rax
      d772f2:	74 08                	je     d772fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44382>
      d772f4:	48 8b 00             	mov    rax,QWORD PTR [rax]
      d772f7:	eb 05                	jmp    d772fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44384>
      d772f9:	31 c0                	xor    eax,eax
      d772fb:	c3                   	ret
      d772fc:	31 c0                	xor    eax,eax
      d772fe:	48 83 c4 08          	add    rsp,0x8
      d77302:	c3                   	ret
      d77303:	cc                   	int3
      d77304:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      d77307:	e9 3e 4f 00 00       	jmp    d7c24a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x492d0>

### 0xd78336: cmp    BYTE PTR [rdi+0x5c0],0x0
      d7830d:	41 56                	push   r14
      d7830f:	41 55                	push   r13
      d78311:	41 54                	push   r12
      d78313:	53                   	push   rbx
      d78314:	48 83 ec 78          	sub    rsp,0x78
      d78318:	49 89 d4             	mov    r12,rdx
      d7831b:	49 89 f6             	mov    r14,rsi
      d7831e:	48 89 fb             	mov    rbx,rdi
      d78321:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d78328:	00 00 
      d7832a:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      d7832f:	4c 8d bf 58 05 00 00 	lea    r15,[rdi+0x558]
      d78336:	80 bf c0 05 00 00 00 	cmp    BYTE PTR [rdi+0x5c0],0x0
      d7833d:	74 3c                	je     d7837b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45401>
      d7833f:	80 bb f2 01 00 00 00 	cmp    BYTE PTR [rbx+0x1f2],0x0
      d78346:	75 33                	jne    d7837b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45401>
      d78348:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
      d7834d:	4c 89 ef             	mov    rdi,r13
      d78350:	4c 89 fe             	mov    rsi,r15
      d78353:	e8 0e 1b 95 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
      d78358:	8b 83 b8 05 00 00    	mov    eax,DWORD PTR [rbx+0x5b8]
      d7835e:	41 89 45 58          	mov    DWORD PTR [r13+0x58],eax
      d78362:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      d78365:	48 89 df             	mov    rdi,rbx
      d78368:	4c 89 ee             	mov    rsi,r13
      d7836b:	ff 90 c8 02 00 00    	call   QWORD PTR [rax+0x2c8]
      d78371:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      d78376:	e8 b3 cf 94 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d7837b:	41 80 7e 68 00       	cmp    BYTE PTR [r14+0x68],0x0
      d78380:	0f 84 04 01 00 00    	je     d7848a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45510>

### 0xd7849a: cmp    BYTE PTR [rbx+0x5c0],0x0
      d7846f:	89 46 58             	mov    DWORD PTR [rsi+0x58],eax
      d78472:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      d78475:	48 89 df             	mov    rdi,rbx
      d78478:	ff 90 c8 02 00 00    	call   QWORD PTR [rax+0x2c8]
      d7847e:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      d78483:	e8 a6 ce 94 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d78488:	eb 4c                	jmp    d784d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4555c>
      d7848a:	48 89 df             	mov    rdi,rbx
      d7848d:	e8 40 ee ff ff       	call   d772d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44358>
      d78492:	48 85 c0             	test   rax,rax
      d78495:	74 3f                	je     d784d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4555c>
      d78497:	49 89 c6             	mov    r14,rax
      d7849a:	80 bb c0 05 00 00 00 	cmp    BYTE PTR [rbx+0x5c0],0x0
      d784a1:	74 0f                	je     d784b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45538>
      d784a3:	4c 89 ff             	mov    rdi,r15
      d784a6:	e8 83 ce 94 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d784ab:	c6 83 c0 05 00 00 00 	mov    BYTE PTR [rbx+0x5c0],0x0
      d784b2:	48 8d 05 5f 97 6d ff 	lea    rax,[rip+0xffffffffff6d975f]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      d784b9:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      d784be:	48 89 06             	mov    QWORD PTR [rsi],rax
      d784c1:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d784c5:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      d784ca:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d784cd:	4c 89 f7             	mov    rdi,r14
      d784d0:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
      d784d6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d784dd:	00 00 
      d784df:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
      d784e4:	75 47                	jne    d7852d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x455b3>
      d784e6:	48 83 c4 78          	add    rsp,0x78

### 0xd784ab: mov    BYTE PTR [rbx+0x5c0],0x0
      d7847e:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      d78483:	e8 a6 ce 94 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d78488:	eb 4c                	jmp    d784d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4555c>
      d7848a:	48 89 df             	mov    rdi,rbx
      d7848d:	e8 40 ee ff ff       	call   d772d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44358>
      d78492:	48 85 c0             	test   rax,rax
      d78495:	74 3f                	je     d784d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4555c>
      d78497:	49 89 c6             	mov    r14,rax
      d7849a:	80 bb c0 05 00 00 00 	cmp    BYTE PTR [rbx+0x5c0],0x0
      d784a1:	74 0f                	je     d784b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45538>
      d784a3:	4c 89 ff             	mov    rdi,r15
      d784a6:	e8 83 ce 94 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d784ab:	c6 83 c0 05 00 00 00 	mov    BYTE PTR [rbx+0x5c0],0x0
      d784b2:	48 8d 05 5f 97 6d ff 	lea    rax,[rip+0xffffffffff6d975f]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      d784b9:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      d784be:	48 89 06             	mov    QWORD PTR [rsi],rax
      d784c1:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d784c5:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      d784ca:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d784cd:	4c 89 f7             	mov    rdi,r14
      d784d0:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
      d784d6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d784dd:	00 00 
      d784df:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
      d784e4:	75 47                	jne    d7852d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x455b3>
      d784e6:	48 83 c4 78          	add    rsp,0x78
      d784ea:	5b                   	pop    rbx
      d784eb:	41 5c                	pop    r12
      d784ed:	41 5d                	pop    r13
      d784ef:	41 5e                	pop    r14

### 0xd7ad65: cmp    BYTE PTR [rbx+0x5c0],0x0
      d7ad40:	41 5d                	pop    r13
      d7ad42:	41 5e                	pop    r14
      d7ad44:	41 5f                	pop    r15
      d7ad46:	5d                   	pop    rbp
      d7ad47:	ff e0                	jmp    rax
      d7ad49:	49 83 c6 10          	add    r14,0x10
      d7ad4d:	4c 89 f7             	mov    rdi,r14
      d7ad50:	e8 f5 fe ff ff       	call   d7ac4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47cd0>
      d7ad55:	6a 1a                	push   0x1a
      d7ad57:	41 5e                	pop    r14
      d7ad59:	4c 8d 3d 58 6f 5b ff 	lea    r15,[rip+0xffffffffff5b6f58]        # 331cb8 <_ZTSSt12bad_any_cast@@Base-0x5e510>
      d7ad60:	e9 20 02 00 00       	jmp    d7af85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4800b>
      d7ad65:	80 bb c0 05 00 00 00 	cmp    BYTE PTR [rbx+0x5c0],0x0
      d7ad6c:	0f 84 c9 00 00 00    	je     d7ae3b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47ec1>
      d7ad72:	4c 8d b3 58 05 00 00 	lea    r14,[rbx+0x558]
      d7ad79:	48 89 df             	mov    rdi,rbx
      d7ad7c:	4c 89 f6             	mov    rsi,r14
      d7ad7f:	e8 ec 02 00 00       	call   d7b070 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x480f6>
      d7ad84:	83 e0 0e             	and    eax,0xe
      d7ad87:	83 f8 0a             	cmp    eax,0xa
      d7ad8a:	0f 85 ab 00 00 00    	jne    d7ae3b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47ec1>
      d7ad90:	48 8d 05 81 6e 6d ff 	lea    rax,[rip+0xffffffffff6d6e81]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      d7ad97:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      d7ad9e:	00 
      d7ad9f:	48 89 02             	mov    QWORD PTR [rdx],rax
      d7ada2:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
      d7ada6:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      d7adab:	48 89 df             	mov    rdi,rbx
      d7adae:	4c 89 f6             	mov    rsi,r14
      d7adb1:	e8 54 d5 ff ff       	call   d7830a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45390>

### 0xd80340: cmp    BYTE PTR [rbp+0x5c0],0x0
      d80312:	48 89 c2             	mov    rdx,rax
      d80315:	48 89 d9             	mov    rcx,rbx
      d80318:	e8 4f f8 d5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
      d8031d:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
      d80323:	4c 89 f7             	mov    rdi,r14
      d80326:	e8 0d 12 fd ff       	call   d51538 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e5be>
      d8032b:	48 89 ef             	mov    rdi,rbp
      d8032e:	e8 af e4 d1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
      d80333:	48 89 c5             	mov    rbp,rax
      d80336:	4c 39 e0             	cmp    rax,r12
      d80339:	75 ab                	jne    d802e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d36c>
      d8033b:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
      d80340:	80 bd c0 05 00 00 00 	cmp    BYTE PTR [rbp+0x5c0],0x0
      d80347:	74 67                	je     d803b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d436>
      d80349:	48 8d 9d 58 05 00 00 	lea    rbx,[rbp+0x558]
      d80350:	4d 8b 77 70          	mov    r14,QWORD PTR [r15+0x70]
      d80354:	4d 8b 67 78          	mov    r12,QWORD PTR [r15+0x78]
      d80358:	4d 39 e6             	cmp    r14,r12
      d8035b:	74 53                	je     d803b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d436>
      d8035d:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
      d80361:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d80364:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d80367:	48 89 c7             	mov    rdi,rax
      d8036a:	48 89 de             	mov    rsi,rbx
      d8036d:	e8 12 c0 94 00       	call   16cc384 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x804f0>
      d80372:	49 83 c6 20          	add    r14,0x20
      d80376:	84 c0                	test   al,al
      d80378:	74 de                	je     d80358 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d3de>
      d8037a:	31 c0                	xor    eax,eax
      d8037c:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]

### 0xd82c40: cmp    BYTE PTR [rbx+0x5c0],0x0
      d82c12:	75 2c                	jne    d82c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4fcc6>
      d82c14:	48 8d 83 d8 02 00 00 	lea    rax,[rbx+0x2d8]
      d82c1b:	eb 17                	jmp    d82c34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4fcba>
      d82c1d:	48 8b bb e0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2e0]
      d82c24:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d82c27:	4c 89 fe             	mov    rsi,r15
      d82c2a:	ff 50 30             	call   QWORD PTR [rax+0x30]
      d82c2d:	48 8d 83 e8 02 00 00 	lea    rax,[rbx+0x2e8]
      d82c34:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      d82c37:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d82c3a:	4c 89 fe             	mov    rsi,r15
      d82c3d:	ff 50 30             	call   QWORD PTR [rax+0x30]
      d82c40:	80 bb c0 05 00 00 00 	cmp    BYTE PTR [rbx+0x5c0],0x0
      d82c47:	74 5b                	je     d82ca4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4fd2a>
      d82c49:	48 8d b3 58 05 00 00 	lea    rsi,[rbx+0x558]
      d82c50:	4c 89 f7             	mov    rdi,r14
      d82c53:	e8 2c 97 94 00       	call   16cc384 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x804f0>
      d82c58:	84 c0                	test   al,al
      d82c5a:	74 48                	je     d82ca4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4fd2a>
      d82c5c:	31 c0                	xor    eax,eax
      d82c5e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      d82c63:	88 06                	mov    BYTE PTR [rsi],al
      d82c65:	88 46 68             	mov    BYTE PTR [rsi+0x68],al
      d82c68:	48 8d 05 a9 ef 6c ff 	lea    rax,[rip+0xffffffffff6cefa9]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      d82c6f:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      d82c74:	48 89 02             	mov    QWORD PTR [rdx],rax
      d82c77:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
      d82c7b:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      d82c80:	48 89 df             	mov    rdi,rbx
      d82c83:	e8 82 56 ff ff       	call   d7830a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45390>

### 0xd85279: cmp    BYTE PTR [r14+0x5c0],0x0
      d85252:	31 c0                	xor    eax,eax
      d85254:	e9 c7 00 00 00       	jmp    d85320 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x523a6>
      d85259:	45 31 e4             	xor    r12d,r12d
      d8525c:	45 85 ed             	test   r13d,r13d
      d8525f:	0f 84 81 00 00 00    	je     d852e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5236c>
      d85265:	89 f5                	mov    ebp,esi
      d85267:	44 29 ed             	sub    ebp,r13d
      d8526a:	48 63 c5             	movsxd rax,ebp
      d8526d:	49 0f af c4          	imul   rax,r12
      d85271:	31 d2                	xor    edx,edx
      d85273:	48 f7 f6             	div    rsi
      d85276:	48 89 c2             	mov    rdx,rax
      d85279:	41 80 be c0 05 00 00 	cmp    BYTE PTR [r14+0x5c0],0x0
      d85280:	00 
      d85281:	74 7b                	je     d852fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52384>
      d85283:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
      d85288:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
      d8528d:	49 83 c7 08          	add    r15,0x8
      d85291:	49 8d 86 58 05 00 00 	lea    rax,[r14+0x558]
      d85298:	4c 89 ff             	mov    rdi,r15
      d8529b:	49 89 c7             	mov    r15,rax
      d8529e:	48 89 c6             	mov    rsi,rax
      d852a1:	e8 36 42 fe ff       	call   d694dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36562>
      d852a6:	84 c0                	test   al,al
      d852a8:	74 4f                	je     d852f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5237f>
      d852aa:	4c 89 f7             	mov    rdi,r14
      d852ad:	4c 89 fe             	mov    rsi,r15
      d852b0:	e8 35 53 00 00       	call   d8a5ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57670>
      d852b5:	83 f8 01             	cmp    eax,0x1
      d852b8:	75 3f                	jne    d852f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5237f>

### 0xd89fd3: cmp    BYTE PTR [rdi+0x5c0],0x0
      d89fa9:	e8 02 5b a6 00       	call   17efab0 <__stack_chk_fail@plt>
      d89fae:	41 57                	push   r15
      d89fb0:	41 56                	push   r14
      d89fb2:	41 54                	push   r12
      d89fb4:	53                   	push   rbx
      d89fb5:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
      d89fbc:	49 89 f6             	mov    r14,rsi
      d89fbf:	48 89 fb             	mov    rbx,rdi
      d89fc2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d89fc9:	00 00 
      d89fcb:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      d89fd2:	00 
      d89fd3:	80 bf c0 05 00 00 00 	cmp    BYTE PTR [rdi+0x5c0],0x0
      d89fda:	74 49                	je     d8a025 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x570ab>
      d89fdc:	48 8d b3 58 05 00 00 	lea    rsi,[rbx+0x558]
      d89fe3:	4c 89 f7             	mov    rdi,r14
      d89fe6:	e8 bd f4 fd ff       	call   d694a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3652e>
      d89feb:	84 c0                	test   al,al
      d89fed:	74 36                	je     d8a025 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x570ab>
      d89fef:	31 c0                	xor    eax,eax
      d89ff1:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      d89ff6:	88 06                	mov    BYTE PTR [rsi],al
      d89ff8:	88 46 68             	mov    BYTE PTR [rsi+0x68],al
      d89ffb:	48 8d 05 16 7c 6c ff 	lea    rax,[rip+0xffffffffff6c7c16]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      d8a002:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      d8a007:	48 89 02             	mov    QWORD PTR [rdx],rax
      d8a00a:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
      d8a00e:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      d8a013:	48 89 df             	mov    rdi,rbx
      d8a016:	e8 ef e2 fe ff       	call   d7830a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45390>

### 0xd8b05b: cmp    BYTE PTR [rax+0x5c0],0x0
      d8b02d:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      d8b031:	48 89 ef             	mov    rdi,rbp
      d8b034:	ff 50 40             	call   QWORD PTR [rax+0x40]
      d8b037:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      d8b03c:	0f b6 b1 04 02 00 00 	movzx  esi,BYTE PTR [rcx+0x204]
      d8b043:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      d8b046:	48 89 c7             	mov    rdi,rax
      d8b049:	ff 51 40             	call   QWORD PTR [rcx+0x40]
      d8b04c:	31 db                	xor    ebx,ebx
      d8b04e:	84 c0                	test   al,al
      d8b050:	0f 84 a4 01 00 00    	je     d8b1fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58280>
      d8b056:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d8b05b:	80 b8 c0 05 00 00 00 	cmp    BYTE PTR [rax+0x5c0],0x0
      d8b062:	74 65                	je     d8b0c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5814f>
      d8b064:	4c 89 f7             	mov    rdi,r14
      d8b067:	48 89 ee             	mov    rsi,rbp
      d8b06a:	e8 e3 e3 fd ff       	call   d69452 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364d8>
      d8b06f:	4c 89 f3             	mov    rbx,r14
      d8b072:	4c 89 f7             	mov    rdi,r14
      d8b075:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
      d8b07a:	e8 29 e4 fd ff       	call   d694a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3652e>
      d8b07f:	84 c0                	test   al,al
      d8b081:	74 3e                	je     d8b0c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58147>
      d8b083:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d8b088:	80 b8 8d 01 00 00 00 	cmp    BYTE PTR [rax+0x18d],0x0
      d8b08f:	0f 84 58 01 00 00    	je     d8b1ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58273>
      d8b095:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      d8b099:	48 89 ef             	mov    rdi,rbp
      d8b09c:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      d8b0a2:	41 89 c4             	mov    r12d,eax

### 0xd8b4d9: cmp    BYTE PTR [r13+0x5c0],0x0
      d8b4bb:	ff 50 40             	call   QWORD PTR [rax+0x40]
      d8b4be:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      d8b4c1:	48 89 c7             	mov    rdi,rax
      d8b4c4:	ff 51 50             	call   QWORD PTR [rcx+0x50]
      d8b4c7:	48 89 c1             	mov    rcx,rax
      d8b4ca:	6a 08                	push   0x8
      d8b4cc:	5e                   	pop    rsi
      d8b4cd:	89 e8                	mov    eax,ebp
      d8b4cf:	99                   	cdq
      d8b4d0:	f7 fe                	idiv   esi
      d8b4d2:	4c 63 f0             	movsxd r14,eax
      d8b4d5:	4c 0f af f1          	imul   r14,rcx
      d8b4d9:	41 80 bd c0 05 00 00 	cmp    BYTE PTR [r13+0x5c0],0x0
      d8b4e0:	00 
      d8b4e1:	74 4e                	je     d8b531 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x585b7>
      d8b4e3:	4d 8d a5 58 05 00 00 	lea    r12,[r13+0x558]
      d8b4ea:	48 8d 6c 24 08       	lea    rbp,[rsp+0x8]
      d8b4ef:	48 89 ef             	mov    rdi,rbp
      d8b4f2:	4c 89 fe             	mov    rsi,r15
      d8b4f5:	e8 58 df fd ff       	call   d69452 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364d8>
      d8b4fa:	48 89 ef             	mov    rdi,rbp
      d8b4fd:	4c 89 e6             	mov    rsi,r12
      d8b500:	e8 a3 df fd ff       	call   d694a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3652e>
      d8b505:	89 c5                	mov    ebp,eax
      d8b507:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d8b50c:	e8 1d 9e 93 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d8b511:	40 84 ed             	test   bpl,bpl
      d8b514:	74 1b                	je     d8b531 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x585b7>
      d8b516:	49 8b 95 e8 05 00 00 	mov    rdx,QWORD PTR [r13+0x5e8]
      d8b51d:	49 03 95 e0 05 00 00 	add    rdx,QWORD PTR [r13+0x5e0]

### 0xdb701b: test   BYTE PTR [rbx+0x5c0],0x1
      db6fea:	00 
      db6feb:	83 a4 24 24 01 00 00 	and    DWORD PTR [rsp+0x124],0x0
      db6ff2:	00 
      db6ff3:	48 8d 05 fe 87 68 ff 	lea    rax,[rip+0xffffffffff6887fe]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      db6ffa:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
      db7001:	00 
      db7002:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
      db7009:	00 
      db700a:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
      db7011:	00 
      db7012:	48 83 a4 24 40 01 00 	and    QWORD PTR [rsp+0x140],0x0
      db7019:	00 00 
      db701b:	f6 83 c0 05 00 00 01 	test   BYTE PTR [rbx+0x5c0],0x1
      db7022:	74 09                	je     db702d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x840b3>
      db7024:	48 8b 93 d0 05 00 00 	mov    rdx,QWORD PTR [rbx+0x5d0]
      db702b:	eb 07                	jmp    db7034 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x840ba>
      db702d:	48 8d 93 c1 05 00 00 	lea    rdx,[rbx+0x5c1]
      db7034:	f6 84 24 90 01 00 00 	test   BYTE PTR [rsp+0x190],0x1
      db703b:	01 
      db703c:	74 0a                	je     db7048 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x840ce>
      db703e:	48 8b 8c 24 a0 01 00 	mov    rcx,QWORD PTR [rsp+0x1a0]
      db7045:	00 
      db7046:	eb 08                	jmp    db7050 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x840d6>
      db7048:	48 8d 8c 24 91 01 00 	lea    rcx,[rsp+0x191]
      db704f:	00 
      db7050:	f6 83 88 05 00 00 01 	test   BYTE PTR [rbx+0x588],0x1
      db7057:	74 09                	je     db7062 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x840e8>
      db7059:	4c 8b 8b 98 05 00 00 	mov    r9,QWORD PTR [rbx+0x598]
      db7060:	eb 07                	jmp    db7069 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x840ef>
      db7062:	4c 8d 8b 89 05 00 00 	lea    r9,[rbx+0x589]

### 0xde800c: movups XMMWORD PTR [rsp+0x5c0],xmm0
      de7fdf:	00 
      de7fe0:	0f 10 84 24 c0 05 00 	movups xmm0,XMMWORD PTR [rsp+0x5c0]
      de7fe7:	00 
      de7fe8:	0f 11 84 24 c0 08 00 	movups XMMWORD PTR [rsp+0x8c0],xmm0
      de7fef:	00 
      de7ff0:	48 8b 84 24 d0 05 00 	mov    rax,QWORD PTR [rsp+0x5d0]
      de7ff7:	00 
      de7ff8:	48 89 84 24 d0 08 00 	mov    QWORD PTR [rsp+0x8d0],rax
      de7fff:	00 
      de8000:	0f 57 c0             	xorps  xmm0,xmm0
      de8003:	48 83 a4 24 d0 05 00 	and    QWORD PTR [rsp+0x5d0],0x0
      de800a:	00 00 
      de800c:	0f 11 84 24 c0 05 00 	movups XMMWORD PTR [rsp+0x5c0],xmm0
      de8013:	00 
      de8014:	be b8 00 00 00       	mov    esi,0xb8
      de8019:	4a 8d 3c 2e          	lea    rdi,[rsi+r13*1]
      de801d:	4c 01 fe             	add    rsi,r15
      de8020:	ba 82 00 00 00       	mov    edx,0x82
      de8025:	e8 a6 7a a0 00       	call   17efad0 <memcpy@plt>
      de802a:	48 8d 8c 24 28 02 00 	lea    rcx,[rsp+0x228]
      de8031:	00 
      de8032:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
      de8039:	00 
      de803a:	48 89 01             	mov    QWORD PTR [rcx],rax
      de803d:	48 8d bc 24 f0 0a 00 	lea    rdi,[rsp+0xaf0]
      de8044:	00 
      de8045:	48 8d b4 24 f0 09 00 	lea    rsi,[rsp+0x9f0]
      de804c:	00 
      de804d:	e8 48 eb cb ff       	call   aa6b9a <JNI_OnUnload@@Base+0x2e467>
      de8052:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]

### 0xebce8b: movdqu XMMWORD PTR [rsp+0x5c0],xmm0
      ebce55:	f3 0f 7f 84 24 68 06 	movdqu XMMWORD PTR [rsp+0x668],xmm0
      ebce5c:	00 00 
      ebce5e:	66 83 a4 24 88 06 00 	and    WORD PTR [rsp+0x688],0x0
      ebce65:	00 00 
      ebce67:	f3 0f 7f 84 24 78 06 	movdqu XMMWORD PTR [rsp+0x678],xmm0
      ebce6e:	00 00 
      ebce70:	f3 0f 7f 84 24 90 05 	movdqu XMMWORD PTR [rsp+0x590],xmm0
      ebce77:	00 00 
      ebce79:	f3 0f 7f 84 24 a0 05 	movdqu XMMWORD PTR [rsp+0x5a0],xmm0
      ebce80:	00 00 
      ebce82:	f3 0f 7f 84 24 b0 05 	movdqu XMMWORD PTR [rsp+0x5b0],xmm0
      ebce89:	00 00 
      ebce8b:	f3 0f 7f 84 24 c0 05 	movdqu XMMWORD PTR [rsp+0x5c0],xmm0
      ebce92:	00 00 
      ebce94:	83 a4 24 f0 05 00 00 	and    DWORD PTR [rsp+0x5f0],0x0
      ebce9b:	00 
      ebce9c:	f3 0f 7f 84 24 d0 05 	movdqu XMMWORD PTR [rsp+0x5d0],xmm0
      ebcea3:	00 00 
      ebcea5:	f3 0f 7f 84 24 e0 05 	movdqu XMMWORD PTR [rsp+0x5e0],xmm0
      ebceac:	00 00 
      ebceae:	49 8b be 50 02 00 00 	mov    rdi,QWORD PTR [r14+0x250]
      ebceb5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ebceb8:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
      ebcebe:	48 8d bc 24 90 05 00 	lea    rdi,[rsp+0x590]
      ebcec5:	00 
      ebcec6:	48 8b 80 70 0e 00 00 	mov    rax,QWORD PTR [rax+0xe70]
      ebcecd:	48 89 47 f0          	mov    QWORD PTR [rdi-0x10],rax
      ebced1:	c6 47 f8 01          	mov    BYTE PTR [rdi-0x8],0x1
      ebced5:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
      ebcedc:	00 

### 0xebd757: movdqu XMMWORD PTR [rsp+0x5c0],xmm0
      ebd729:	48 8b b4 24 c8 05 00 	mov    rsi,QWORD PTR [rsp+0x5c8]
      ebd730:	00 
      ebd731:	4c 89 f0             	mov    rax,r14
      ebd734:	48 8b 8c 24 c0 05 00 	mov    rcx,QWORD PTR [rsp+0x5c0]
      ebd73b:	00 
      ebd73c:	48 8b 94 24 d8 05 00 	mov    rdx,QWORD PTR [rsp+0x5d8]
      ebd743:	00 
      ebd744:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
      ebd74b:	00 
      ebd74c:	66 0f 6f 07          	movdqa xmm0,XMMWORD PTR [rdi]
      ebd750:	0f 28 4f 10          	movaps xmm1,XMMWORD PTR [rdi+0x10]
      ebd754:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      ebd757:	f3 0f 7f 84 24 c0 05 	movdqu XMMWORD PTR [rsp+0x5c0],xmm0
      ebd75e:	00 00 
      ebd760:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
      ebd764:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ebd768:	0f 11 8c 24 d0 05 00 	movups XMMWORD PTR [rsp+0x5d0],xmm1
      ebd76f:	00 
      ebd770:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx
      ebd774:	4c 01 ac 24 e0 05 00 	add    QWORD PTR [rsp+0x5e0],r13
      ebd77b:	00 
      ebd77c:	e8 1d 22 be ff       	call   a9f99e <JNI_OnUnload@@Base+0x2726b>
      ebd781:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd788:	00 
      ebd789:	e8 7c e9 f4 ff       	call   e0c10a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9190>
      ebd78e:	49 89 d5             	mov    r13,rdx
      ebd791:	49 89 c4             	mov    r12,rax
      ebd794:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
      ebd79b:	00 
      ebd79c:	48 89 94 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rdx

### 0xed1194: cmp    DWORD PTR [rsp+0x5c0],0x2
      ed1167:	74 0f                	je     ed1178 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9858e>
      ed1169:	48 8d bc 24 70 12 00 	lea    rdi,[rsp+0x1270]
      ed1170:	00 
      ed1171:	e8 e0 c1 00 00       	call   edd356 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa476c>
      ed1176:	eb 5f                	jmp    ed11d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x985ed>
      ed1178:	40 84 ed             	test   bpl,bpl
      ed117b:	74 5a                	je     ed11d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x985ed>
      ed117d:	49 8b b6 c8 01 00 00 	mov    rsi,QWORD PTR [r14+0x1c8]
      ed1184:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ed118b:	00 
      ed118c:	4c 89 e2             	mov    rdx,r12
      ed118f:	e8 62 b2 00 00       	call   edc3f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa380c>
      ed1194:	83 bc 24 c0 05 00 00 	cmp    DWORD PTR [rsp+0x5c0],0x2
      ed119b:	02 
      ed119c:	0f 94 c0             	sete   al
      ed119f:	83 bc 24 c8 05 00 00 	cmp    DWORD PTR [rsp+0x5c8],0x0
      ed11a6:	00 
      ed11a7:	0f 95 c1             	setne  cl
      ed11aa:	20 c1                	and    cl,al
      ed11ac:	44 08 f9             	or     cl,r15b
      ed11af:	0f 84 7b 04 00 00    	je     ed1630 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x98a46>
      ed11b5:	48 8d b4 24 c8 05 00 	lea    rsi,[rsp+0x5c8]
      ed11bc:	00 
      ed11bd:	48 8d bc 24 70 12 00 	lea    rdi,[rsp+0x1270]
      ed11c4:	00 
      ed11c5:	e8 8c c1 00 00       	call   edd356 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa476c>
      ed11ca:	48 8d bc 24 d0 05 00 	lea    rdi,[rsp+0x5d0]
      ed11d1:	00 
      ed11d2:	e8 1b e9 ff ff       	call   ecfaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96f08>
      ed11d7:	48 8b 33             	mov    rsi,QWORD PTR [rbx]

### 0xf059e7: mov    QWORD PTR [rsp+0x5c0],rax
      f059c6:	c3                   	ret
      f059c7:	55                   	push   rbp
      f059c8:	41 57                	push   r15
      f059ca:	41 56                	push   r14
      f059cc:	41 55                	push   r13
      f059ce:	41 54                	push   r12
      f059d0:	53                   	push   rbx
      f059d1:	48 81 ec c8 05 00 00 	sub    rsp,0x5c8
      f059d8:	41 89 f4             	mov    r12d,esi
      f059db:	49 89 fd             	mov    r13,rdi
      f059de:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f059e5:	00 00 
      f059e7:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax
      f059ee:	00 
      f059ef:	48 8b 02             	mov    rax,QWORD PTR [rdx]
      f059f2:	48 85 c0             	test   rax,rax
      f059f5:	0f 84 92 00 00 00    	je     f05a8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xccea3>
      f059fb:	44 89 c5             	mov    ebp,r8d
      f059fe:	49 89 cf             	mov    r15,rcx
      f05a01:	49 89 d6             	mov    r14,rdx
      f05a04:	4c 89 2c 24          	mov    QWORD PTR [rsp],r13
      f05a08:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]
      f05a0c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f05a0f:	4c 8d 6c 24 18       	lea    r13,[rsp+0x18]
      f05a14:	4c 89 ef             	mov    rdi,r13
      f05a17:	ff 50 28             	call   QWORD PTR [rax+0x28]
      f05a1a:	49 8b 5d 00          	mov    rbx,QWORD PTR [r13+0x0]
      f05a1e:	48 85 db             	test   rbx,rbx
      f05a21:	74 32                	je     f05a55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcce6b>
      f05a23:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]

### 0xf36148: mov    QWORD PTR [rsp+0x5c0],rbp
      f3611a:	00 
      f3611b:	e8 08 f2 fe ff       	call   f25328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec73e>
      f36120:	48 8b ac 24 d0 00 00 	mov    rbp,QWORD PTR [rsp+0xd0]
      f36127:	00 
      f36128:	48 8d 7d 08          	lea    rdi,[rbp+0x8]
      f3612c:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
      f36131:	e8 00 8a ba ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      f36136:	48 8b 9c 24 d8 00 00 	mov    rbx,QWORD PTR [rsp+0xd8]
      f3613d:	00 
      f3613e:	48 85 db             	test   rbx,rbx
      f36141:	74 2c                	je     f3616f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd585>
      f36143:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      f36148:	48 89 ac 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rbp
      f3614f:	00 
      f36150:	48 89 9c 24 c8 05 00 	mov    QWORD PTR [rsp+0x5c8],rbx
      f36157:	00 
      f36158:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      f3615d:	eb 21                	jmp    f36180 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd596>
      f3615f:	0f 57 c0             	xorps  xmm0,xmm0
      f36162:	0f 29 84 24 c0 05 00 	movaps XMMWORD PTR [rsp+0x5c0],xmm0
      f36169:	00 
      f3616a:	e9 f9 00 00 00       	jmp    f36268 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd67e>
      f3616f:	48 89 ac 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rbp
      f36176:	00 
      f36177:	48 83 a4 24 c8 05 00 	and    QWORD PTR [rsp+0x5c8],0x0
      f3617e:	00 00 
      f36180:	4c 8d a4 24 d0 05 00 	lea    r12,[rsp+0x5d0]
      f36187:	00 
      f36188:	48 8d b4 24 30 04 00 	lea    rsi,[rsp+0x430]
      f3618f:	00 

### 0xf36162: movaps XMMWORD PTR [rsp+0x5c0],xmm0
      f36136:	48 8b 9c 24 d8 00 00 	mov    rbx,QWORD PTR [rsp+0xd8]
      f3613d:	00 
      f3613e:	48 85 db             	test   rbx,rbx
      f36141:	74 2c                	je     f3616f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd585>
      f36143:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      f36148:	48 89 ac 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rbp
      f3614f:	00 
      f36150:	48 89 9c 24 c8 05 00 	mov    QWORD PTR [rsp+0x5c8],rbx
      f36157:	00 
      f36158:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      f3615d:	eb 21                	jmp    f36180 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd596>
      f3615f:	0f 57 c0             	xorps  xmm0,xmm0
      f36162:	0f 29 84 24 c0 05 00 	movaps XMMWORD PTR [rsp+0x5c0],xmm0
      f36169:	00 
      f3616a:	e9 f9 00 00 00       	jmp    f36268 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd67e>
      f3616f:	48 89 ac 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rbp
      f36176:	00 
      f36177:	48 83 a4 24 c8 05 00 	and    QWORD PTR [rsp+0x5c8],0x0
      f3617e:	00 00 
      f36180:	4c 8d a4 24 d0 05 00 	lea    r12,[rsp+0x5d0]
      f36187:	00 
      f36188:	48 8d b4 24 30 04 00 	lea    rsi,[rsp+0x430]
      f3618f:	00 
      f36190:	4c 89 e7             	mov    rdi,r12
      f36193:	e8 4a 7f 00 00       	call   f3e0e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1054f8>
      f36198:	bf b0 01 00 00       	mov    edi,0x1b0
      f3619d:	e8 5e 7d 8b 00       	call   17edf00 <_Znwm@plt>
      f361a2:	49 89 c7             	mov    r15,rax
      f361a5:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
      f361ac:	00 

### 0xf3616f: mov    QWORD PTR [rsp+0x5c0],rbp
      f36141:	74 2c                	je     f3616f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd585>
      f36143:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      f36148:	48 89 ac 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rbp
      f3614f:	00 
      f36150:	48 89 9c 24 c8 05 00 	mov    QWORD PTR [rsp+0x5c8],rbx
      f36157:	00 
      f36158:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      f3615d:	eb 21                	jmp    f36180 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd596>
      f3615f:	0f 57 c0             	xorps  xmm0,xmm0
      f36162:	0f 29 84 24 c0 05 00 	movaps XMMWORD PTR [rsp+0x5c0],xmm0
      f36169:	00 
      f3616a:	e9 f9 00 00 00       	jmp    f36268 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd67e>
      f3616f:	48 89 ac 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rbp
      f36176:	00 
      f36177:	48 83 a4 24 c8 05 00 	and    QWORD PTR [rsp+0x5c8],0x0
      f3617e:	00 00 
      f36180:	4c 8d a4 24 d0 05 00 	lea    r12,[rsp+0x5d0]
      f36187:	00 
      f36188:	48 8d b4 24 30 04 00 	lea    rsi,[rsp+0x430]
      f3618f:	00 
      f36190:	4c 89 e7             	mov    rdi,r12
      f36193:	e8 4a 7f 00 00       	call   f3e0e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1054f8>
      f36198:	bf b0 01 00 00       	mov    edi,0x1b0
      f3619d:	e8 5e 7d 8b 00       	call   17edf00 <_Znwm@plt>
      f361a2:	49 89 c7             	mov    r15,rax
      f361a5:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
      f361ac:	00 
      f361ad:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      f361b1:	48 8b 84 24 c8 05 00 	mov    rax,QWORD PTR [rsp+0x5c8]
      f361b8:	00 

### 0xf565c0: movaps XMMWORD PTR [rsp+0x5c0],xmm0
      f5658c:	31 c0                	xor    eax,eax
      f5658e:	88 84 24 b8 05 00 00 	mov    BYTE PTR [rsp+0x5b8],al
      f56595:	0f 57 c0             	xorps  xmm0,xmm0
      f56598:	0f 29 84 24 70 05 00 	movaps XMMWORD PTR [rsp+0x570],xmm0
      f5659f:	00 
      f565a0:	0f 29 84 24 80 05 00 	movaps XMMWORD PTR [rsp+0x580],xmm0
      f565a7:	00 
      f565a8:	0f 29 84 24 90 05 00 	movaps XMMWORD PTR [rsp+0x590],xmm0
      f565af:	00 
      f565b0:	88 84 24 a0 05 00 00 	mov    BYTE PTR [rsp+0x5a0],al
      f565b7:	48 83 a4 24 d0 05 00 	and    QWORD PTR [rsp+0x5d0],0x0
      f565be:	00 00 
      f565c0:	0f 29 84 24 c0 05 00 	movaps XMMWORD PTR [rsp+0x5c0],xmm0
      f565c7:	00 
      f565c8:	49 8d 57 ff          	lea    rdx,[r15-0x1]
      f565cc:	49 8b 7c 24 48       	mov    rdi,QWORD PTR [r12+0x48]
      f565d1:	49 8b 74 24 50       	mov    rsi,QWORD PTR [r12+0x50]
      f565d6:	e8 d9 21 fb ff       	call   f087b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfbca>
      f565db:	48 83 c0 18          	add    rax,0x18
      f565df:	48 8d bc 24 70 05 00 	lea    rdi,[rsp+0x570]
      f565e6:	00 
      f565e7:	48 89 c6             	mov    rsi,rax
      f565ea:	e8 91 7a 89 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      f565ef:	eb 18                	jmp    f56609 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11da1f>
      f565f1:	4c 89 fa             	mov    rdx,r15
      f565f4:	e8 bb 21 fb ff       	call   f087b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfbca>
      f565f9:	48 8d bc 24 70 05 00 	lea    rdi,[rsp+0x570]
      f56600:	00 
      f56601:	48 89 c6             	mov    rsi,rax
      f56604:	e8 c9 a2 77 00       	call   16d08d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84a3e>

### 0x105e34b: movaps XMMWORD PTR [rsp+0x5c0],xmm0
     105e30e:	48 89 83 88 07 00 00 	mov    QWORD PTR [rbx+0x788],rax
     105e315:	48 89 93 90 07 00 00 	mov    QWORD PTR [rbx+0x790],rdx
     105e31c:	48 8d 93 40 02 00 00 	lea    rdx,[rbx+0x240]
     105e323:	48 89 84 24 e0 05 00 	mov    QWORD PTR [rsp+0x5e0],rax
     105e32a:	00 
     105e32b:	48 89 8c 24 e8 05 00 	mov    QWORD PTR [rsp+0x5e8],rcx
     105e332:	00 
     105e333:	c6 84 24 f0 05 00 00 	mov    BYTE PTR [rsp+0x5f0],0x1
     105e33a:	01 
     105e33b:	80 bb a8 07 00 00 00 	cmp    BYTE PTR [rbx+0x7a8],0x0
     105e342:	74 13                	je     105e357 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22576d>
     105e344:	0f 10 83 98 07 00 00 	movups xmm0,XMMWORD PTR [rbx+0x798]
     105e34b:	0f 29 84 24 c0 05 00 	movaps XMMWORD PTR [rsp+0x5c0],xmm0
     105e352:	00 
     105e353:	b0 01                	mov    al,0x1
     105e355:	eb 0a                	jmp    105e361 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x225777>
     105e357:	c6 84 24 c0 05 00 00 	mov    BYTE PTR [rsp+0x5c0],0x0
     105e35e:	00 
     105e35f:	31 c0                	xor    eax,eax
     105e361:	4c 8d 84 24 c0 05 00 	lea    r8,[rsp+0x5c0]
     105e368:	00 
     105e369:	41 88 40 10          	mov    BYTE PTR [r8+0x10],al
     105e36d:	31 c0                	xor    eax,eax
     105e36f:	4c 8d 8c 24 88 00 00 	lea    r9,[rsp+0x88]
     105e376:	00 
     105e377:	41 88 01             	mov    BYTE PTR [r9],al
     105e37a:	41 88 41 08          	mov    BYTE PTR [r9+0x8],al
     105e37e:	0f 57 c0             	xorps  xmm0,xmm0
     105e381:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
     105e386:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0

### 0x105e357: mov    BYTE PTR [rsp+0x5c0],0x0
     105e32a:	00 
     105e32b:	48 89 8c 24 e8 05 00 	mov    QWORD PTR [rsp+0x5e8],rcx
     105e332:	00 
     105e333:	c6 84 24 f0 05 00 00 	mov    BYTE PTR [rsp+0x5f0],0x1
     105e33a:	01 
     105e33b:	80 bb a8 07 00 00 00 	cmp    BYTE PTR [rbx+0x7a8],0x0
     105e342:	74 13                	je     105e357 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22576d>
     105e344:	0f 10 83 98 07 00 00 	movups xmm0,XMMWORD PTR [rbx+0x798]
     105e34b:	0f 29 84 24 c0 05 00 	movaps XMMWORD PTR [rsp+0x5c0],xmm0
     105e352:	00 
     105e353:	b0 01                	mov    al,0x1
     105e355:	eb 0a                	jmp    105e361 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x225777>
     105e357:	c6 84 24 c0 05 00 00 	mov    BYTE PTR [rsp+0x5c0],0x0
     105e35e:	00 
     105e35f:	31 c0                	xor    eax,eax
     105e361:	4c 8d 84 24 c0 05 00 	lea    r8,[rsp+0x5c0]
     105e368:	00 
     105e369:	41 88 40 10          	mov    BYTE PTR [r8+0x10],al
     105e36d:	31 c0                	xor    eax,eax
     105e36f:	4c 8d 8c 24 88 00 00 	lea    r9,[rsp+0x88]
     105e376:	00 
     105e377:	41 88 01             	mov    BYTE PTR [r9],al
     105e37a:	41 88 41 08          	mov    BYTE PTR [r9+0x8],al
     105e37e:	0f 57 c0             	xorps  xmm0,xmm0
     105e381:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
     105e386:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     105e389:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     105e38d:	48 8d bc 24 f8 05 00 	lea    rdi,[rsp+0x5f8]
     105e394:	00 
     105e395:	48 8d 8c 24 e0 05 00 	lea    rcx,[rsp+0x5e0]

### 0x1066952: and    QWORD PTR [rbx+0x5c0],0x0
     106691e:	48 8d 05 a3 44 7a 00 	lea    rax,[rip+0x7a44a3]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     1066925:	48 89 03             	mov    QWORD PTR [rbx],rax
     1066928:	4c 8d 6b 20          	lea    r13,[rbx+0x20]
     106692c:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
     1066930:	48 8d 05 91 1b 7e 00 	lea    rax,[rip+0x7e1b91]        # 18484c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4bb0>
     1066937:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     106693b:	31 ed                	xor    ebp,ebp
     106693d:	40 88 6b 38          	mov    BYTE PTR [rbx+0x38],bpl
     1066941:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     1066945:	e8 2a 26 ff ff       	call   1058f74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22038a>
     106694a:	48 83 a3 90 05 00 00 	and    QWORD PTR [rbx+0x590],0x0
     1066951:	00 
     1066952:	48 83 a3 c0 05 00 00 	and    QWORD PTR [rbx+0x5c0],0x0
     1066959:	00 
     106695a:	40 88 ab d0 05 00 00 	mov    BYTE PTR [rbx+0x5d0],bpl
     1066961:	44 89 a3 d4 05 00 00 	mov    DWORD PTR [rbx+0x5d4],r12d
     1066968:	40 88 ab d8 05 00 00 	mov    BYTE PTR [rbx+0x5d8],bpl
     106696f:	44 88 bb 60 05 00 00 	mov    BYTE PTR [rbx+0x560],r15b
     1066976:	44 88 7b 68          	mov    BYTE PTR [rbx+0x68],r15b
     106697a:	8b 44 24 04          	mov    eax,DWORD PTR [rsp+0x4]
     106697e:	88 83 61 05 00 00    	mov    BYTE PTR [rbx+0x561],al
     1066984:	4d 89 2e             	mov    QWORD PTR [r14],r13
     1066987:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     106698b:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     106698f:	48 85 ff             	test   rdi,rdi
     1066992:	74 19                	je     10669ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ddc3>
     1066994:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     1066998:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     106699c:	74 0f                	je     10669ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ddc3>
     106699e:	48 83 c4 08          	add    rsp,0x8

### 0x1089ea6: mov    QWORD PTR [rbx+0x5c0],rax
     1089e64:	00 
     1089e65:	49 8b 86 98 05 00 00 	mov    rax,QWORD PTR [r14+0x598]
     1089e6c:	48 89 83 98 05 00 00 	mov    QWORD PTR [rbx+0x598],rax
     1089e73:	49 8b 86 a0 05 00 00 	mov    rax,QWORD PTR [r14+0x5a0]
     1089e7a:	48 89 83 a0 05 00 00 	mov    QWORD PTR [rbx+0x5a0],rax
     1089e81:	49 8b 86 a8 05 00 00 	mov    rax,QWORD PTR [r14+0x5a8]
     1089e88:	48 89 83 a8 05 00 00 	mov    QWORD PTR [rbx+0x5a8],rax
     1089e8f:	49 83 a6 a8 05 00 00 	and    QWORD PTR [r14+0x5a8],0x0
     1089e96:	00 
     1089e97:	41 0f 11 8e 98 05 00 	movups XMMWORD PTR [r14+0x598],xmm1
     1089e9e:	00 
     1089e9f:	49 8b 86 c0 05 00 00 	mov    rax,QWORD PTR [r14+0x5c0]
     1089ea6:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
     1089ead:	41 0f 10 86 b0 05 00 	movups xmm0,XMMWORD PTR [r14+0x5b0]
     1089eb4:	00 
     1089eb5:	0f 11 83 b0 05 00 00 	movups XMMWORD PTR [rbx+0x5b0],xmm0
     1089ebc:	49 83 a6 c0 05 00 00 	and    QWORD PTR [r14+0x5c0],0x0
     1089ec3:	00 
     1089ec4:	41 0f 11 8e b0 05 00 	movups XMMWORD PTR [r14+0x5b0],xmm1
     1089ecb:	00 
     1089ecc:	be c8 05 00 00       	mov    esi,0x5c8
     1089ed1:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     1089ed5:	4c 01 f6             	add    rsi,r14
     1089ed8:	e8 a1 3d 00 00       	call   108dc7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255094>
     1089edd:	49 8b 86 f8 05 00 00 	mov    rax,QWORD PTR [r14+0x5f8]
     1089ee4:	48 89 83 f8 05 00 00 	mov    QWORD PTR [rbx+0x5f8],rax
     1089eeb:	b8 00 06 00 00       	mov    eax,0x600
     1089ef0:	48 8d 0c 03          	lea    rcx,[rbx+rax*1]
     1089ef4:	49 8b 96 00 06 00 00 	mov    rdx,QWORD PTR [r14+0x600]
     1089efb:	48 89 93 00 06 00 00 	mov    QWORD PTR [rbx+0x600],rdx

### 0x1089ebc: and    QWORD PTR [r14+0x5c0],0x0
     1089e7a:	48 89 83 a0 05 00 00 	mov    QWORD PTR [rbx+0x5a0],rax
     1089e81:	49 8b 86 a8 05 00 00 	mov    rax,QWORD PTR [r14+0x5a8]
     1089e88:	48 89 83 a8 05 00 00 	mov    QWORD PTR [rbx+0x5a8],rax
     1089e8f:	49 83 a6 a8 05 00 00 	and    QWORD PTR [r14+0x5a8],0x0
     1089e96:	00 
     1089e97:	41 0f 11 8e 98 05 00 	movups XMMWORD PTR [r14+0x598],xmm1
     1089e9e:	00 
     1089e9f:	49 8b 86 c0 05 00 00 	mov    rax,QWORD PTR [r14+0x5c0]
     1089ea6:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
     1089ead:	41 0f 10 86 b0 05 00 	movups xmm0,XMMWORD PTR [r14+0x5b0]
     1089eb4:	00 
     1089eb5:	0f 11 83 b0 05 00 00 	movups XMMWORD PTR [rbx+0x5b0],xmm0
     1089ebc:	49 83 a6 c0 05 00 00 	and    QWORD PTR [r14+0x5c0],0x0
     1089ec3:	00 
     1089ec4:	41 0f 11 8e b0 05 00 	movups XMMWORD PTR [r14+0x5b0],xmm1
     1089ecb:	00 
     1089ecc:	be c8 05 00 00       	mov    esi,0x5c8
     1089ed1:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     1089ed5:	4c 01 f6             	add    rsi,r14
     1089ed8:	e8 a1 3d 00 00       	call   108dc7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255094>
     1089edd:	49 8b 86 f8 05 00 00 	mov    rax,QWORD PTR [r14+0x5f8]
     1089ee4:	48 89 83 f8 05 00 00 	mov    QWORD PTR [rbx+0x5f8],rax
     1089eeb:	b8 00 06 00 00       	mov    eax,0x600
     1089ef0:	48 8d 0c 03          	lea    rcx,[rbx+rax*1]
     1089ef4:	49 8b 96 00 06 00 00 	mov    rdx,QWORD PTR [r14+0x600]
     1089efb:	48 89 93 00 06 00 00 	mov    QWORD PTR [rbx+0x600],rdx
     1089f02:	49 8b b6 08 06 00 00 	mov    rsi,QWORD PTR [r14+0x608]
     1089f09:	48 89 b3 08 06 00 00 	mov    QWORD PTR [rbx+0x608],rsi
     1089f10:	48 85 f6             	test   rsi,rsi
     1089f13:	74 16                	je     1089f2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251341>

### 0x11a365a: mov    QWORD PTR [rbx+0x5c0],rax
     11a3623:	48 8b bb b8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5b8]
     11a362a:	0f 29 83 b0 05 00 00 	movaps XMMWORD PTR [rbx+0x5b0],xmm0
     11a3631:	e8 50 ae 8f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11a3636:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
     11a363a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11a363d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11a3642:	6a 05                	push   0x5
     11a3644:	5a                   	pop    rdx
     11a3645:	ff 50 40             	call   QWORD PTR [rax+0x40]
     11a3648:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     11a364d:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     11a3653:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     11a365a:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
     11a3661:	48 85 ff             	test   rdi,rdi
     11a3664:	74 1c                	je     11a3682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36aa98>
     11a3666:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a3669:	ff 50 08             	call   QWORD PTR [rax+0x8]
     11a366c:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     11a3671:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     11a3677:	48 85 ff             	test   rdi,rdi
     11a367a:	74 06                	je     11a3682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36aa98>
     11a367c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a367f:	ff 50 08             	call   QWORD PTR [rax+0x8]
     11a3682:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     11a3689:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a368c:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11a368f:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
     11a3696:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a3699:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11a369c:	48 89 83 30 06 00 00 	mov    QWORD PTR [rbx+0x630],rax

### 0x11b08f1: and    QWORD PTR [rsp+0x5c0],0x0
     11b08c2:	e8 b7 91 8c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11b08c7:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
     11b08ce:	00 
     11b08cf:	48 8d 94 24 10 04 00 	lea    rdx,[rsp+0x410]
     11b08d6:	00 
     11b08d7:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     11b08db:	0f 28 84 24 b0 05 00 	movaps xmm0,XMMWORD PTR [rsp+0x5b0]
     11b08e2:	00 
     11b08e3:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     11b08e6:	0f 57 c0             	xorps  xmm0,xmm0
     11b08e9:	0f 29 84 24 b0 05 00 	movaps XMMWORD PTR [rsp+0x5b0],xmm0
     11b08f0:	00 
     11b08f1:	48 83 a4 24 c0 05 00 	and    QWORD PTR [rsp+0x5c0],0x0
     11b08f8:	00 00 
     11b08fa:	c7 42 18 07 00 00 00 	mov    DWORD PTR [rdx+0x18],0x7
     11b0901:	4c 8d a4 24 40 07 00 	lea    r12,[rsp+0x740]
     11b0908:	00 
     11b0909:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     11b0910:	00 
     11b0911:	4c 89 e7             	mov    rdi,r12
     11b0914:	e8 d3 40 00 00       	call   11b49ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37be02>
     11b0919:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
     11b0920:	00 
     11b0921:	6a 01                	push   0x1
     11b0923:	5a                   	pop    rdx
     11b0924:	4c 89 e6             	mov    rsi,r12
     11b0927:	e8 e6 40 00 00       	call   11b4a12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37be28>
     11b092c:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
     11b0933:	00 
     11b0934:	48 8d 94 24 e0 03 00 	lea    rdx,[rsp+0x3e0]

### 0x11eff42: mov    QWORD PTR [rsp+0x5c0],rax
     11eff03:	66 0f ef c0          	pxor   xmm0,xmm0
     11eff07:	f3 0f 7f 83 08 05 00 	movdqu XMMWORD PTR [rbx+0x508],xmm0
     11eff0e:	00 
     11eff0f:	f3 0f 7f 83 11 05 00 	movdqu XMMWORD PTR [rbx+0x511],xmm0
     11eff16:	00 
     11eff17:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
     11eff1c:	e8 e1 9e 5e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     11eff21:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
     11eff26:	4c 8d ab 00 04 00 00 	lea    r13,[rbx+0x400]
     11eff2d:	c6 83 88 05 00 00 00 	mov    BYTE PTR [rbx+0x588],0x0
     11eff34:	48 8b b3 20 04 00 00 	mov    rsi,QWORD PTR [rbx+0x420]
     11eff3b:	48 8d 05 be ed 66 00 	lea    rax,[rip+0x66edbe]        # 185ed00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b3e8>
     11eff42:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax
     11eff49:	00 
     11eff4a:	4c 89 ac 24 c8 05 00 	mov    QWORD PTR [rsp+0x5c8],r13
     11eff51:	00 
     11eff52:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]
     11eff59:	00 
     11eff5a:	48 89 94 24 e0 05 00 	mov    QWORD PTR [rsp+0x5e0],rdx
     11eff61:	00 
     11eff62:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11eff65:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11eff6c:	00 
     11eff6d:	4c 89 64 24 58       	mov    QWORD PTR [rsp+0x58],r12
     11eff72:	48 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],rbp
     11eff77:	ff 50 58             	call   QWORD PTR [rax+0x58]
     11eff7a:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
     11eff81:	00 
     11eff82:	4c 89 e7             	mov    rdi,r12
     11eff85:	4c 89 f6             	mov    rsi,r14

### 0x11f0736: mov    QWORD PTR [rsp+0x5c0],rax
     11f0708:	4c 8d b4 24 28 05 00 	lea    r14,[rsp+0x528]
     11f070f:	00 
     11f0710:	48 8b b4 24 78 06 00 	mov    rsi,QWORD PTR [rsp+0x678]
     11f0717:	00 
     11f0718:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f071b:	48 8d 94 24 b0 01 00 	lea    rdx,[rsp+0x1b0]
     11f0722:	00 
     11f0723:	4c 89 f7             	mov    rdi,r14
     11f0726:	ff 50 20             	call   QWORD PTR [rax+0x20]
     11f0729:	bf 90 01 00 00       	mov    edi,0x190
     11f072e:	e8 cd d7 5f 00       	call   17edf00 <_Znwm@plt>
     11f0733:	49 89 c7             	mov    r15,rax
     11f0736:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax
     11f073d:	00 
     11f073e:	48 8d 05 1f bd 88 ff 	lea    rax,[rip+0xffffffffff88bd1f]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11f0745:	48 89 84 24 d0 05 00 	mov    QWORD PTR [rsp+0x5d0],rax
     11f074c:	00 
     11f074d:	48 8d 05 24 d6 05 00 	lea    rax,[rip+0x5d624]        # 124dd78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x932fc>
     11f0754:	48 89 84 24 d8 05 00 	mov    QWORD PTR [rsp+0x5d8],rax
     11f075b:	00 
     11f075c:	4c 89 bc 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],r15
     11f0763:	00 
     11f0764:	48 8d 05 f9 bc 88 ff 	lea    rax,[rip+0xffffffffff88bcf9]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11f076b:	48 89 84 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rax
     11f0772:	00 
     11f0773:	48 8d 05 18 d6 05 00 	lea    rax,[rip+0x5d618]        # 124dd92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93316>
     11f077a:	48 89 84 24 f8 04 00 	mov    QWORD PTR [rsp+0x4f8],rax
     11f0781:	00 
     11f0782:	48 8b 84 24 20 05 00 	mov    rax,QWORD PTR [rsp+0x520]
     11f0789:	00 

### 0x11f0aeb: mov    QWORD PTR [rsp+0x5c0],r14
     11f0abb:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f0abe:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f0ac5:	00 
     11f0ac6:	48 8d 94 24 20 05 00 	lea    rdx,[rsp+0x520]
     11f0acd:	00 
     11f0ace:	ff 50 20             	call   QWORD PTR [rax+0x20]
     11f0ad1:	4c 8d b3 d8 0e 00 00 	lea    r14,[rbx+0xed8]
     11f0ad8:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f0adf:	00 
     11f0ae0:	e8 51 ad 88 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     11f0ae5:	49 89 c4             	mov    r12,rax
     11f0ae8:	49 89 d5             	mov    r13,rdx
     11f0aeb:	4c 89 b4 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],r14
     11f0af2:	00 
     11f0af3:	48 8d 05 6a b9 88 ff 	lea    rax,[rip+0xffffffffff88b96a]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11f0afa:	48 89 84 24 d0 05 00 	mov    QWORD PTR [rsp+0x5d0],rax
     11f0b01:	00 
     11f0b02:	48 8d 05 df e5 05 00 	lea    rax,[rip+0x5e5df]        # 124f0e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9466c>
     11f0b09:	48 89 84 24 d8 05 00 	mov    QWORD PTR [rsp+0x5d8],rax
     11f0b10:	00 
     11f0b11:	4c 89 b4 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],r14
     11f0b18:	00 
     11f0b19:	4c 89 b4 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],r14
     11f0b20:	00 
     11f0b21:	48 8d 05 3c b9 88 ff 	lea    rax,[rip+0xffffffffff88b93c]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11f0b28:	48 89 84 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rax
     11f0b2f:	00 
     11f0b30:	48 8d 05 cb e5 05 00 	lea    rax,[rip+0x5e5cb]        # 124f102 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x94686>
     11f0b37:	48 89 84 24 f8 04 00 	mov    QWORD PTR [rsp+0x4f8],rax
     11f0b3e:	00 

### 0x11f0e58: mov    QWORD PTR [rsp+0x5c0],r15
     11f0e2a:	00 
     11f0e2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f0e2e:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f0e35:	00 
     11f0e36:	48 8d 94 24 b0 01 00 	lea    rdx,[rsp+0x1b0]
     11f0e3d:	00 
     11f0e3e:	ff 50 20             	call   QWORD PTR [rax+0x20]
     11f0e41:	4c 8d bb 08 12 00 00 	lea    r15,[rbx+0x1208]
     11f0e48:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
     11f0e4f:	00 
     11f0e50:	48 c7 46 18 b8 0b 00 	mov    QWORD PTR [rsi+0x18],0xbb8
     11f0e57:	00 
     11f0e58:	4c 89 bc 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],r15
     11f0e5f:	00 
     11f0e60:	48 8d 05 fd b5 88 ff 	lea    rax,[rip+0xffffffffff88b5fd]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11f0e67:	48 89 84 24 d0 05 00 	mov    QWORD PTR [rsp+0x5d0],rax
     11f0e6e:	00 
     11f0e6f:	48 8d 05 2c 4f 07 00 	lea    rax,[rip+0x74f2c]        # 1265da2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xab326>
     11f0e76:	48 89 84 24 d8 05 00 	mov    QWORD PTR [rsp+0x5d8],rax
     11f0e7d:	00 
     11f0e7e:	4c 89 bc 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],r15
     11f0e85:	00 
     11f0e86:	48 8d 05 d7 b5 88 ff 	lea    rax,[rip+0xffffffffff88b5d7]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11f0e8d:	48 89 84 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rax
     11f0e94:	00 
     11f0e95:	48 8d 05 20 4f 07 00 	lea    rax,[rip+0x74f20]        # 1265dbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xab340>
     11f0e9c:	48 89 84 24 f8 04 00 	mov    QWORD PTR [rsp+0x4f8],rax
     11f0ea3:	00 
     11f0ea4:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f0eab:	00 

### 0x11f46e4: mov    QWORD PTR [rsp+0x5c0],rcx
     11f46b3:	eb 11                	jmp    11f46c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39c4a>
     11f46b5:	4c 8d a3 e8 4a 00 00 	lea    r12,[rbx+0x4ae8]
     11f46bc:	66 0f ef c0          	pxor   xmm0,xmm0
     11f46c0:	66 41 0f 7f 45 00    	movdqa XMMWORD PTR [r13+0x0],xmm0
     11f46c6:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     11f46cd:	00 
     11f46ce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f46d1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f46d4:	4c 8d b3 f0 4a 00 00 	lea    r14,[rbx+0x4af0]
     11f46db:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]
     11f46df:	48 85 c9             	test   rcx,rcx
     11f46e2:	74 16                	je     11f46fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39c7e>
     11f46e4:	48 89 8c 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rcx
     11f46eb:	00 
     11f46ec:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     11f46f0:	48 89 8c 24 c8 05 00 	mov    QWORD PTR [rsp+0x5c8],rcx
     11f46f7:	00 
     11f46f8:	eb 18                	jmp    11f4712 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39c96>
     11f46fa:	48 8b 8b d8 4a 00 00 	mov    rcx,QWORD PTR [rbx+0x4ad8]
     11f4701:	66 0f 6f 83 d0 4a 00 	movdqa xmm0,XMMWORD PTR [rbx+0x4ad0]
     11f4708:	00 
     11f4709:	66 0f 7f 84 24 c0 05 	movdqa XMMWORD PTR [rsp+0x5c0],xmm0
     11f4710:	00 00 
     11f4712:	48 85 c9             	test   rcx,rcx
     11f4715:	74 05                	je     11f471c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39ca0>
     11f4717:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     11f471c:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
     11f4720:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]
     11f4727:	00 
     11f4728:	4c 89 f7             	mov    rdi,r14

### 0x11f4709: movdqa XMMWORD PTR [rsp+0x5c0],xmm0
     11f46db:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]
     11f46df:	48 85 c9             	test   rcx,rcx
     11f46e2:	74 16                	je     11f46fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39c7e>
     11f46e4:	48 89 8c 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rcx
     11f46eb:	00 
     11f46ec:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     11f46f0:	48 89 8c 24 c8 05 00 	mov    QWORD PTR [rsp+0x5c8],rcx
     11f46f7:	00 
     11f46f8:	eb 18                	jmp    11f4712 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39c96>
     11f46fa:	48 8b 8b d8 4a 00 00 	mov    rcx,QWORD PTR [rbx+0x4ad8]
     11f4701:	66 0f 6f 83 d0 4a 00 	movdqa xmm0,XMMWORD PTR [rbx+0x4ad0]
     11f4708:	00 
     11f4709:	66 0f 7f 84 24 c0 05 	movdqa XMMWORD PTR [rsp+0x5c0],xmm0
     11f4710:	00 00 
     11f4712:	48 85 c9             	test   rcx,rcx
     11f4715:	74 05                	je     11f471c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39ca0>
     11f4717:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     11f471c:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
     11f4720:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]
     11f4727:	00 
     11f4728:	4c 89 f7             	mov    rdi,r14
     11f472b:	e8 8a 89 8b ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
     11f4730:	48 8b bc 24 c8 05 00 	mov    rdi,QWORD PTR [rsp+0x5c8]
     11f4737:	00 
     11f4738:	e8 49 9d 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f473d:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
     11f4740:	bf 98 0f 00 00       	mov    edi,0xf98
     11f4745:	e8 b6 97 5f 00       	call   17edf00 <_Znwm@plt>
     11f474a:	49 89 c6             	mov    r14,rax
     11f474d:	66 0f ef c0          	pxor   xmm0,xmm0

### 0x11f4d29: mov    QWORD PTR [rsp+0x5c0],rax
     11f4cf9:	74 06                	je     11f4d01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a285>
     11f4cfb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4cfe:	ff 50 08             	call   QWORD PTR [rax+0x8]
     11f4d01:	4c 8d a3 f0 29 00 00 	lea    r12,[rbx+0x29f0]
     11f4d08:	48 8b bc 24 c8 05 00 	mov    rdi,QWORD PTR [rsp+0x5c8]
     11f4d0f:	00 
     11f4d10:	e8 71 97 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f4d15:	48 8b bc 24 28 01 00 	mov    rdi,QWORD PTR [rsp+0x128]
     11f4d1c:	00 
     11f4d1d:	48 85 ff             	test   rdi,rdi
     11f4d20:	74 4e                	je     11f4d70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a2f4>
     11f4d22:	48 8d 05 97 6e 66 00 	lea    rax,[rip+0x666e97]        # 185bbc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x182a8>
     11f4d29:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax
     11f4d30:	00 
     11f4d31:	48 89 9c 24 c8 05 00 	mov    QWORD PTR [rsp+0x5c8],rbx
     11f4d38:	00 
     11f4d39:	4c 89 bc 24 e0 05 00 	mov    QWORD PTR [rsp+0x5e0],r15
     11f4d40:	00 
     11f4d41:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4d44:	4c 89 fe             	mov    rsi,r15
     11f4d47:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11f4d4a:	48 8b 8c 24 e0 05 00 	mov    rcx,QWORD PTR [rsp+0x5e0]
     11f4d51:	00 
     11f4d52:	4c 39 f9             	cmp    rcx,r15
     11f4d55:	74 0d                	je     11f4d64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a2e8>
     11f4d57:	48 85 c9             	test   rcx,rcx
     11f4d5a:	74 14                	je     11f4d70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a2f4>
     11f4d5c:	6a 05                	push   0x5
     11f4d5e:	58                   	pop    rax
     11f4d5f:	49 89 cf             	mov    r15,rcx

### 0x12286e1: mov    QWORD PTR [rsp+0x5c0],rax
     12286bc:	55                   	push   rbp
     12286bd:	41 57                	push   r15
     12286bf:	41 56                	push   r14
     12286c1:	41 55                	push   r13
     12286c3:	41 54                	push   r12
     12286c5:	53                   	push   rbx
     12286c6:	48 81 ec c8 05 00 00 	sub    rsp,0x5c8
     12286cd:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     12286d2:	49 89 d5             	mov    r13,rdx
     12286d5:	49 89 fc             	mov    r12,rdi
     12286d8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12286df:	00 00 
     12286e1:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax
     12286e8:	00 
     12286e9:	ba 70 03 00 00       	mov    edx,0x370
     12286ee:	31 f6                	xor    esi,esi
     12286f0:	e8 9b 64 5c 00       	call   17eeb90 <memset@plt>
     12286f5:	4c 89 e7             	mov    rdi,r12
     12286f8:	e8 d9 0a 00 00       	call   12291d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e75a>
     12286fd:	49 8d bc 24 20 02 00 	lea    rdi,[r12+0x220]
     1228704:	00 
     1228705:	4c 89 ee             	mov    rsi,r13
     1228708:	e8 73 59 5c 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     122870d:	49 8d b5 58 05 00 00 	lea    rsi,[r13+0x558]
     1228714:	49 8d bc 24 38 02 00 	lea    rdi,[r12+0x238]
     122871b:	00 
     122871c:	e8 57 40 e6 ff       	call   108c778 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b8e>
     1228721:	49 8d b5 70 04 00 00 	lea    rsi,[r13+0x470]
     1228728:	49 8d bc 24 68 02 00 	lea    rdi,[r12+0x268]
     122872f:	00 

### 0x122ad5d: movups XMMWORD PTR [rbx+0x5c0],xmm0
     122ad1a:	0f 57 c0             	xorps  xmm0,xmm0
     122ad1d:	0f 11 83 60 04 00 00 	movups XMMWORD PTR [rbx+0x460],xmm0
     122ad24:	48 89 83 58 04 00 00 	mov    QWORD PTR [rbx+0x458],rax
     122ad2b:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     122ad32:	40 88 ab 38 05 00 00 	mov    BYTE PTR [rbx+0x538],bpl
     122ad39:	40 88 ab 50 05 00 00 	mov    BYTE PTR [rbx+0x550],bpl
     122ad40:	ba c4 00 00 00       	mov    edx,0xc4
     122ad45:	31 f6                	xor    esi,esi
     122ad47:	e8 44 3e 5c 00       	call   17eeb90 <memset@plt>
     122ad4c:	40 88 ab b8 05 00 00 	mov    BYTE PTR [rbx+0x5b8],bpl
     122ad53:	40 88 ab f0 05 00 00 	mov    BYTE PTR [rbx+0x5f0],bpl
     122ad5a:	0f 57 c0             	xorps  xmm0,xmm0
     122ad5d:	0f 11 83 c0 05 00 00 	movups XMMWORD PTR [rbx+0x5c0],xmm0
     122ad64:	0f 11 83 c9 05 00 00 	movups XMMWORD PTR [rbx+0x5c9],xmm0
     122ad6b:	83 a3 f8 05 00 00 00 	and    DWORD PTR [rbx+0x5f8],0x0
     122ad72:	40 88 ab 00 06 00 00 	mov    BYTE PTR [rbx+0x600],bpl
     122ad79:	40 88 ab 18 06 00 00 	mov    BYTE PTR [rbx+0x618],bpl
     122ad80:	40 88 ab 20 06 00 00 	mov    BYTE PTR [rbx+0x620],bpl
     122ad87:	40 88 ab 40 06 00 00 	mov    BYTE PTR [rbx+0x640],bpl
     122ad8e:	48 83 a3 68 06 00 00 	and    QWORD PTR [rbx+0x668],0x0
     122ad95:	00 
     122ad96:	0f 11 83 48 06 00 00 	movups XMMWORD PTR [rbx+0x648],xmm0
     122ad9d:	0f 11 83 58 06 00 00 	movups XMMWORD PTR [rbx+0x658],xmm0
     122ada4:	0f 11 83 58 05 00 00 	movups XMMWORD PTR [rbx+0x558],xmm0
     122adab:	0f 11 83 68 05 00 00 	movups XMMWORD PTR [rbx+0x568],xmm0
     122adb2:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
     122adb9:	0f 11 83 88 05 00 00 	movups XMMWORD PTR [rbx+0x588],xmm0
     122adc0:	0f 11 83 91 05 00 00 	movups XMMWORD PTR [rbx+0x591],xmm0
     122adc7:	c7 83 70 06 00 00 00 	mov    DWORD PTR [rbx+0x670],0x3f800000
     122adce:	00 80 3f 

### 0x127b61b: movups XMMWORD PTR [rsp+0x5c0],xmm0
     127b5ec:	4c 89 ef             	mov    rdi,r13
     127b5ef:	48 89 c6             	mov    rsi,rax
     127b5f2:	e8 5b 42 50 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     127b5f7:	84 c0                	test   al,al
     127b5f9:	0f 84 1a 10 00 00    	je     127c619 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1b9d>
     127b5ff:	48 83 a4 24 a8 05 00 	and    QWORD PTR [rsp+0x5a8],0x0
     127b606:	00 00 
     127b608:	48 89 ac 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],rbp
     127b60f:	00 
     127b610:	0f 57 c0             	xorps  xmm0,xmm0
     127b613:	0f 11 84 24 b0 05 00 	movups XMMWORD PTR [rsp+0x5b0],xmm0
     127b61a:	00 
     127b61b:	0f 11 84 24 c0 05 00 	movups XMMWORD PTR [rsp+0x5c0],xmm0
     127b622:	00 
     127b623:	48 8b 84 24 28 04 00 	mov    rax,QWORD PTR [rsp+0x428]
     127b62a:	00 
     127b62b:	a8 01                	test   al,0x1
     127b62d:	0f 85 cf 20 00 00    	jne    127d702 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2c86>
     127b633:	48 85 c0             	test   rax,rax
     127b636:	0f 84 cb 11 00 00    	je     127c807 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1d8b>
     127b63c:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     127b643:	00 
     127b644:	48 8d b4 24 20 04 00 	lea    rsi,[rsp+0x420]
     127b64b:	00 
     127b64c:	e8 0f 34 4d 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
     127b651:	e9 e9 11 00 00       	jmp    127c83f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1dc3>
     127b656:	4c 8d ac 24 20 04 00 	lea    r13,[rsp+0x420]
     127b65d:	00 
     127b65e:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
     127b663:	48 8d 2d d6 70 62 00 	lea    rbp,[rip+0x6270d6]        # 18a2740 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xf680>

### 0x1288b5b: mov    QWORD PTR [rsp+0x5c0],rax
     1288b36:	48 89 df             	mov    rdi,rbx
     1288b39:	e8 67 0f 7f ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1288b3e:	55                   	push   rbp
     1288b3f:	41 57                	push   r15
     1288b41:	41 56                	push   r14
     1288b43:	41 55                	push   r13
     1288b45:	41 54                	push   r12
     1288b47:	53                   	push   rbx
     1288b48:	48 81 ec c8 05 00 00 	sub    rsp,0x5c8
     1288b4f:	49 89 f6             	mov    r14,rsi
     1288b52:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1288b59:	00 00 
     1288b5b:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax
     1288b62:	00 
     1288b63:	80 be f4 00 00 00 00 	cmp    BYTE PTR [rsi+0xf4],0x0
     1288b6a:	74 09                	je     1288b75 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xce0f9>
     1288b6c:	41 8b ae f0 00 00 00 	mov    ebp,DWORD PTR [r14+0xf0]
     1288b73:	eb 03                	jmp    1288b78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xce0fc>
     1288b75:	6a 01                	push   0x1
     1288b77:	5d                   	pop    rbp
     1288b78:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1288b7b:	49 8d 76 18          	lea    rsi,[r14+0x18]
     1288b7f:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     1288b86:	00 
     1288b87:	e8 b4 53 56 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1288b8c:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     1288b93:	00 
     1288b94:	4c 89 f6             	mov    rsi,r14
     1288b97:	e8 a4 53 56 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1288b9c:	89 ac 24 8c 00 00 00 	mov    DWORD PTR [rsp+0x8c],ebp

### 0x12995bb: mov    QWORD PTR [rsp+0x5c0],rax
     1299589:	48 0f 45 d8          	cmovne rbx,rax
     129958d:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     1299591:	48 85 c0             	test   rax,rax
     1299594:	48 8d 35 ed 21 73 00 	lea    rsi,[rip+0x7321ed]        # 19cb788 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x943d0>
     129959b:	48 0f 45 f0          	cmovne rsi,rax
     129959f:	e8 2e 16 00 00       	call   129abd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0156>
     12995a4:	48 8d bc 24 e0 07 00 	lea    rdi,[rsp+0x7e0]
     12995ab:	00 
     12995ac:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
     12995af:	0f 11 84 24 b0 05 00 	movups XMMWORD PTR [rsp+0x5b0],xmm0
     12995b6:	00 
     12995b7:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     12995bb:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax
     12995c2:	00 
     12995c3:	0f 57 c0             	xorps  xmm0,xmm0
     12995c6:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     12995c9:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     12995ce:	48 c7 84 24 c8 05 00 	mov    QWORD PTR [rsp+0x5c8],0x7d0
     12995d5:	00 d0 07 00 00 
     12995da:	e8 49 21 7e ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     12995df:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
     12995e5:	66 0f 7f 44 24 50    	movdqa XMMWORD PTR [rsp+0x50],xmm0
     12995eb:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
     12995f2:	00 
     12995f3:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     12995fa:	00 00 
     12995fc:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1299601:	66 0f ef c0          	pxor   xmm0,xmm0
     1299605:	66 0f 7f 44 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm0
     129960b:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]

### 0x12abd08: mov    QWORD PTR [rsp+0x5c0],rax
     12abcdf:	41 55                	push   r13
     12abce1:	41 54                	push   r12
     12abce3:	53                   	push   rbx
     12abce4:	48 81 ec c8 05 00 00 	sub    rsp,0x5c8
     12abceb:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
     12abcf0:	4d 89 c7             	mov    r15,r8
     12abcf3:	49 89 cd             	mov    r13,rcx
     12abcf6:	49 89 d6             	mov    r14,rdx
     12abcf9:	48 89 f3             	mov    rbx,rsi
     12abcfc:	49 89 fc             	mov    r12,rdi
     12abcff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12abd06:	00 00 
     12abd08:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax
     12abd0f:	00 
     12abd10:	48 8d bc 24 68 05 00 	lea    rdi,[rsp+0x568]
     12abd17:	00 
     12abd18:	e8 49 e1 41 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     12abd1d:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
     12abd21:	48 89 df             	mov    rdi,rbx
     12abd24:	e8 73 ec fe ff       	call   129a99c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdff20>
     12abd29:	84 c0                	test   al,al
     12abd2b:	74 4b                	je     12abd78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf12fc>
     12abd2d:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     12abd34:	00 
     12abd35:	4c 89 fe             	mov    rsi,r15
     12abd38:	e8 03 22 54 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12abd3d:	48 8d 9c 24 70 03 00 	lea    rbx,[rsp+0x370]
     12abd44:	00 
     12abd45:	48 8d ac 24 80 00 00 	lea    rbp,[rsp+0x80]
     12abd4c:	00 

### 0x12cb808: movups XMMWORD PTR [rbx+0x5c0],xmm0
     12cb7bd:	0f 11 83 58 05 00 00 	movups XMMWORD PTR [rbx+0x558],xmm0
     12cb7c4:	83 a3 40 05 00 00 00 	and    DWORD PTR [rbx+0x540],0x0
     12cb7cb:	45 31 f6             	xor    r14d,r14d
     12cb7ce:	44 88 b3 44 05 00 00 	mov    BYTE PTR [rbx+0x544],r14b
     12cb7d5:	b8 00 00 80 3f       	mov    eax,0x3f800000
     12cb7da:	89 83 68 05 00 00    	mov    DWORD PTR [rbx+0x568],eax
     12cb7e0:	0f 11 83 70 05 00 00 	movups XMMWORD PTR [rbx+0x570],xmm0
     12cb7e7:	0f 11 83 80 05 00 00 	movups XMMWORD PTR [rbx+0x580],xmm0
     12cb7ee:	89 83 90 05 00 00    	mov    DWORD PTR [rbx+0x590],eax
     12cb7f4:	0f 11 83 98 05 00 00 	movups XMMWORD PTR [rbx+0x598],xmm0
     12cb7fb:	0f 11 83 a8 05 00 00 	movups XMMWORD PTR [rbx+0x5a8],xmm0
     12cb802:	89 83 b8 05 00 00    	mov    DWORD PTR [rbx+0x5b8],eax
     12cb808:	0f 11 83 c0 05 00 00 	movups XMMWORD PTR [rbx+0x5c0],xmm0
     12cb80f:	0f 11 83 d0 05 00 00 	movups XMMWORD PTR [rbx+0x5d0],xmm0
     12cb816:	89 83 e0 05 00 00    	mov    DWORD PTR [rbx+0x5e0],eax
     12cb81c:	66 83 a3 e8 05 00 00 	and    WORD PTR [rbx+0x5e8],0x0
     12cb823:	00 
     12cb824:	48 8d 8b 38 05 00 00 	lea    rcx,[rbx+0x538]
     12cb82b:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     12cb830:	0f 11 83 00 06 00 00 	movups XMMWORD PTR [rbx+0x600],xmm0
     12cb837:	0f 11 83 f0 05 00 00 	movups XMMWORD PTR [rbx+0x5f0],xmm0
     12cb83e:	89 83 10 06 00 00    	mov    DWORD PTR [rbx+0x610],eax
     12cb844:	44 88 b3 18 06 00 00 	mov    BYTE PTR [rbx+0x618],r14b
     12cb84b:	83 a3 1c 06 00 00 00 	and    DWORD PTR [rbx+0x61c],0x0
     12cb852:	48 8d 8b 48 05 00 00 	lea    rcx,[rbx+0x548]
     12cb859:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
     12cb85e:	66 83 a3 20 06 00 00 	and    WORD PTR [rbx+0x620],0x0
     12cb865:	00 
     12cb866:	48 8d 8b 70 05 00 00 	lea    rcx,[rbx+0x570]
     12cb86d:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx

### 0x1333835: mov    QWORD PTR [rbx+0x5c0],rax
     13337fd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1333802:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1333806:	48 89 ef             	mov    rdi,rbp
     1333809:	4c 89 bc 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r15
     1333810:	00 
     1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1333814:	48 89 83 b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rax
     133381b:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
     1333822:	00 00 
     1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     1333829:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
     1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
     133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
     1333841:	48 89 83 c8 05 00 00 	mov    QWORD PTR [rbx+0x5c8],rax
     1333848:	48 8d bb d0 05 00 00 	lea    rdi,[rbx+0x5d0]
     133384f:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     1333854:	e8 9d 61 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1333863:	ff 50 20             	call   QWORD PTR [rax+0x20]
     1333866:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
     133386b:	34 01                	xor    al,0x1
     133386d:	88 83 e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],al
     1333873:	48 83 a3 e8 05 00 00 	and    QWORD PTR [rbx+0x5e8],0x0
     133387a:	00 
     133387b:	48 8d bb f0 05 00 00 	lea    rdi,[rbx+0x5f0]
     1333882:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     133388c:	e8 31 de 48 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>

### 0x135d936: mov    QWORD PTR [rsp+0x5c0],r14
     135d900:	49 89 c5             	mov    r13,rax
     135d903:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d90a:	00 
     135d90b:	48 8d b4 24 a0 09 00 	lea    rsi,[rsp+0x9a0]
     135d912:	00 
     135d913:	e8 78 c9 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135d918:	48 8d 05 c1 0f 4b 00 	lea    rax,[rip+0x4b0fc1]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     135d91f:	48 89 84 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],rax
     135d926:	00 
     135d927:	48 8b 05 7a 41 55 00 	mov    rax,QWORD PTR [rip+0x55417a]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
     135d92e:	48 89 84 24 a8 05 00 	mov    QWORD PTR [rsp+0x5a8],rax
     135d935:	00 
     135d936:	4c 89 b4 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],r14
     135d93d:	00 
     135d93e:	48 8d 05 6b a5 50 00 	lea    rax,[rip+0x50a56b]        # 1867eb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24598>
     135d945:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
     135d94c:	00 
     135d94d:	4c 89 bc 24 80 0f 00 	mov    QWORD PTR [rsp+0xf80],r15
     135d954:	00 
     135d955:	48 8b 9c 24 b0 0d 00 	mov    rbx,QWORD PTR [rsp+0xdb0]
     135d95c:	00 
     135d95d:	4c 8b b4 24 b8 0d 00 	mov    r14,QWORD PTR [rsp+0xdb8]
     135d964:	00 
     135d965:	48 89 9c 24 20 03 00 	mov    QWORD PTR [rsp+0x320],rbx
     135d96c:	00 
     135d96d:	4c 89 b4 24 28 03 00 	mov    QWORD PTR [rsp+0x328],r14
     135d974:	00 
     135d975:	4c 8b a4 24 c0 0d 00 	mov    r12,QWORD PTR [rsp+0xdc0]
     135d97c:	00 
     135d97d:	4c 89 a4 24 30 03 00 	mov    QWORD PTR [rsp+0x330],r12

### 0x135f6af: and    WORD PTR [r14+0x5c0],0x0
     135f678:	48 83 21 00          	and    QWORD PTR [rcx],0x0
     135f67c:	eb 15                	jmp    135f693 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4c17>
     135f67e:	49 89 b6 30 02 00 00 	mov    QWORD PTR [r14+0x230],rsi
     135f685:	48 8d bc 24 70 05 00 	lea    rdi,[rsp+0x570]
     135f68c:	00 
     135f68d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f690:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135f693:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     135f698:	49 89 86 40 02 00 00 	mov    QWORD PTR [r14+0x240],rax
     135f69f:	31 db                	xor    ebx,ebx
     135f6a1:	41 88 9e 48 02 00 00 	mov    BYTE PTR [r14+0x248],bl
     135f6a8:	41 88 9e b8 05 00 00 	mov    BYTE PTR [r14+0x5b8],bl
     135f6af:	66 41 83 a6 c0 05 00 	and    WORD PTR [r14+0x5c0],0x0
     135f6b6:	00 00 
     135f6b8:	4d 8d 6e 10          	lea    r13,[r14+0x10]
     135f6bc:	49 8d 6e 18          	lea    rbp,[r14+0x18]
     135f6c0:	66 0f ef c0          	pxor   xmm0,xmm0
     135f6c4:	f3 41 0f 7f 86 c8 05 	movdqu XMMWORD PTR [r14+0x5c8],xmm0
     135f6cb:	00 00 
     135f6cd:	f3 41 0f 7f 86 d4 05 	movdqu XMMWORD PTR [r14+0x5d4],xmm0
     135f6d4:	00 00 
     135f6d6:	48 8d 05 bb a6 50 00 	lea    rax,[rip+0x50a6bb]        # 1869d98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26480>
     135f6dd:	49 89 86 e8 05 00 00 	mov    QWORD PTR [r14+0x5e8],rax
     135f6e4:	49 8d be f0 05 00 00 	lea    rdi,[r14+0x5f0]
     135f6eb:	e8 06 a3 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135f6f0:	41 c6 86 00 06 00 00 	mov    BYTE PTR [r14+0x600],0x1
     135f6f7:	01 
     135f6f8:	41 c7 86 04 06 00 00 	mov    DWORD PTR [r14+0x604],0x1
     135f6ff:	01 00 00 00 
     135f703:	49 83 a6 08 06 00 00 	and    QWORD PTR [r14+0x608],0x0

### 0x1367c4d: cmp    BYTE PTR [r14+0x5c0],0x0
     1367c13:	45 31 c0             	xor    r8d,r8d
     1367c16:	e8 91 07 00 00       	call   13683ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad930>
     1367c1b:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     1367c20:	e8 75 95 73 ff       	call   aa119a <JNI_OnUnload@@Base+0x28a67>
     1367c25:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1367c2c:	00 
     1367c2d:	e8 5e 19 00 00       	call   1369590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aeb14>
     1367c32:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1367c37:	e8 2e 23 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1367c3c:	49 8d b6 b8 09 00 00 	lea    rsi,[r14+0x9b8]
     1367c43:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1367c48:	e8 1b b5 01 00       	call   1383168 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c86ec>
     1367c4d:	41 80 be c0 05 00 00 	cmp    BYTE PTR [r14+0x5c0],0x0
     1367c54:	00 
     1367c55:	74 79                	je     1367cd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad254>
     1367c57:	48 8d 05 85 36 02 ff 	lea    rax,[rip+0xffffffffff023685]        # 38b2e3 <_ZTSSt12bad_any_cast@@Base-0x4ee5>
     1367c5e:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     1367c65:	00 
     1367c66:	48 c7 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],0x16
     1367c6d:	00 16 00 00 00 
     1367c72:	0f 57 c0             	xorps  xmm0,xmm0
     1367c75:	0f 11 84 24 c0 00 00 	movups XMMWORD PTR [rsp+0xc0],xmm0
     1367c7c:	00 
     1367c7d:	0f 11 84 24 d0 00 00 	movups XMMWORD PTR [rsp+0xd0],xmm0
     1367c84:	00 
     1367c85:	48 8d 05 54 01 67 ff 	lea    rax,[rip+0xffffffffff670154]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     1367c8c:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
     1367c93:	00 
     1367c94:	48 8d 05 07 e1 01 00 	lea    rax,[rip+0x1e107]        # 1385da2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb326>
     1367c9b:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax

### 0x1367cc8: mov    BYTE PTR [r14+0x5c0],0x0
     1367c94:	48 8d 05 07 e1 01 00 	lea    rax,[rip+0x1e107]        # 1385da2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb326>
     1367c9b:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     1367ca2:	00 
     1367ca3:	48 83 7c 24 20 00    	cmp    QWORD PTR [rsp+0x20],0x0
     1367ca9:	74 10                	je     1367cbb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad23f>
     1367cab:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1367cb0:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     1367cb7:	00 
     1367cb8:	ff 57 18             	call   QWORD PTR [rdi+0x18]
     1367cbb:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1367cc2:	00 
     1367cc3:	e8 18 f6 ff ff       	call   13672e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac864>
     1367cc8:	41 c6 86 c0 05 00 00 	mov    BYTE PTR [r14+0x5c0],0x0
     1367ccf:	00 
     1367cd0:	49 8d be 48 02 00 00 	lea    rdi,[r14+0x248]
     1367cd7:	e8 1a e9 fe ff       	call   13565f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bb7a>
     1367cdc:	49 8d be 68 06 00 00 	lea    rdi,[r14+0x668]
     1367ce3:	e8 0e c9 9b ff       	call   d245f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271596>
     1367ce8:	49 8d be 80 06 00 00 	lea    rdi,[r14+0x680]
     1367cef:	e8 32 6c 74 ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
     1367cf4:	49 8d be b8 06 00 00 	lea    rdi,[r14+0x6b8]
     1367cfb:	e8 5e 06 00 00       	call   136835e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad8e2>
     1367d00:	41 80 be a8 09 00 00 	cmp    BYTE PTR [r14+0x9a8],0x0
     1367d07:	00 
     1367d08:	74 14                	je     1367d1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad2a2>
     1367d0a:	49 8d be 58 09 00 00 	lea    rdi,[r14+0x958]
     1367d11:	e8 ea a5 eb ff       	call   1222300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67884>
     1367d16:	41 c6 86 a8 09 00 00 	mov    BYTE PTR [r14+0x9a8],0x0
     1367d1d:	00 
     1367d1e:	4c 89 f7             	mov    rdi,r14

### 0x136f412: mov    BYTE PTR [rbx+0x5c0],0x1
     136f3e6:	00 
     136f3e7:	48 83 bc 24 98 00 00 	cmp    QWORD PTR [rsp+0x98],0x0
     136f3ee:	00 00 
     136f3f0:	74 13                	je     136f405 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4989>
     136f3f2:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     136f3f9:	00 
     136f3fa:	48 8d b4 24 e8 00 00 	lea    rsi,[rsp+0xe8]
     136f401:	00 
     136f402:	ff 57 18             	call   QWORD PTR [rdi+0x18]
     136f405:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
     136f40c:	00 
     136f40d:	e8 ce 7e ff ff       	call   13672e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac864>
     136f412:	c6 83 c0 05 00 00 01 	mov    BYTE PTR [rbx+0x5c0],0x1
     136f419:	4c 8d b4 24 f0 00 00 	lea    r14,[rsp+0xf0]
     136f420:	00 
     136f421:	41 c7 06 01 00 00 00 	mov    DWORD PTR [r14],0x1
     136f428:	41 83 66 68 00       	and    DWORD PTR [r14+0x68],0x0
     136f42d:	48 8d b4 24 68 02 00 	lea    rsi,[rsp+0x268]
     136f434:	00 
     136f435:	48 8d 8c 24 e8 00 00 	lea    rcx,[rsp+0xe8]
     136f43c:	00 
     136f43d:	48 89 df             	mov    rdi,rbx
     136f440:	44 89 ea             	mov    edx,r13d
     136f443:	e8 f8 7e ff ff       	call   1367340 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac8c4>
     136f448:	4c 89 f7             	mov    rdi,r14
     136f44b:	e8 1c 72 fe ff       	call   135666c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbf0>
     136f450:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
     136f457:	00 
     136f458:	48 89 df             	mov    rdi,rbx
     136f45b:	e8 22 22 01 00       	call   1381682 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c6c06>

### 0x13771eb: mov    QWORD PTR [rsp+0x5c0],rax
     13771b3:	48 89 de             	mov    rsi,rbx
     13771b6:	e8 6b 01 fe ff       	call   1357326 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c8aa>
     13771bb:	4c 89 e7             	mov    rdi,r12
     13771be:	48 81 c7 c8 00 00 00 	add    rdi,0xc8
     13771c5:	4c 89 fe             	mov    rsi,r15
     13771c8:	e8 dd 01 fe ff       	call   13573aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c92e>
     13771cd:	4c 89 a4 24 a8 05 00 	mov    QWORD PTR [rsp+0x5a8],r12
     13771d4:	00 
     13771d5:	48 8d 05 e8 e9 00 00 	lea    rax,[rip+0xe9e8]        # 1385bc4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb148>
     13771dc:	48 89 84 24 b8 05 00 	mov    QWORD PTR [rsp+0x5b8],rax
     13771e3:	00 
     13771e4:	48 8d 05 03 ea 00 00 	lea    rax,[rip+0xea03]        # 1385bee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb172>
     13771eb:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax
     13771f2:	00 
     13771f3:	48 83 bc 24 d8 01 00 	cmp    QWORD PTR [rsp+0x1d8],0x0
     13771fa:	00 00 
     13771fc:	74 13                	je     1377211 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bc795>
     13771fe:	48 8d bc 24 c8 01 00 	lea    rdi,[rsp+0x1c8]
     1377205:	00 
     1377206:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
     137720d:	00 
     137720e:	ff 57 18             	call   QWORD PTR [rdi+0x18]
     1377211:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
     1377218:	00 
     1377219:	e8 c2 00 ff ff       	call   13672e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac864>
     137721e:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     1377225:	00 
     1377226:	e8 07 ea 00 00       	call   1385c32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb1b6>
     137722b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     1377230:	e8 59 f3 fd ff       	call   135658e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bb12>

### 0x148432a: mov    BYTE PTR [rsp+0x5c0],cl
     14842ee:	73 1c                	jae    148430c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9890>
     14842f0:	48 8b 8d 80 00 00 00 	mov    rcx,QWORD PTR [rbp+0x80]
     14842f7:	48 85 c9             	test   rcx,rcx
     14842fa:	48 8d 15 1f c1 4b 00 	lea    rdx,[rip+0x4bc11f]        # 1940420 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x9068>
     1484301:	48 0f 45 d1          	cmovne rdx,rcx
     1484305:	8b 4a 18             	mov    ecx,DWORD PTR [rdx+0x18]
     1484308:	89 4c 24 74          	mov    DWORD PTR [rsp+0x74],ecx
     148430c:	31 c9                	xor    ecx,ecx
     148430e:	88 8c 24 80 05 00 00 	mov    BYTE PTR [rsp+0x580],cl
     1484315:	88 8c 24 98 05 00 00 	mov    BYTE PTR [rsp+0x598],cl
     148431c:	88 8c 24 a0 05 00 00 	mov    BYTE PTR [rsp+0x5a0],cl
     1484323:	88 8c 24 b8 05 00 00 	mov    BYTE PTR [rsp+0x5b8],cl
     148432a:	88 8c 24 c0 05 00 00 	mov    BYTE PTR [rsp+0x5c0],cl
     1484331:	88 8c 24 20 06 00 00 	mov    BYTE PTR [rsp+0x620],cl
     1484338:	88 8c 24 28 06 00 00 	mov    BYTE PTR [rsp+0x628],cl
     148433f:	88 8c 24 88 06 00 00 	mov    BYTE PTR [rsp+0x688],cl
     1484346:	88 8c 24 90 06 00 00 	mov    BYTE PTR [rsp+0x690],cl
     148434d:	88 8c 24 f0 06 00 00 	mov    BYTE PTR [rsp+0x6f0],cl
     1484354:	88 8c 24 f8 06 00 00 	mov    BYTE PTR [rsp+0x6f8],cl
     148435b:	88 8c 24 58 07 00 00 	mov    BYTE PTR [rsp+0x758],cl
     1484362:	88 8c 24 60 07 00 00 	mov    BYTE PTR [rsp+0x760],cl
     1484369:	88 8c 24 e0 08 00 00 	mov    BYTE PTR [rsp+0x8e0],cl
     1484370:	88 8c 24 e8 08 00 00 	mov    BYTE PTR [rsp+0x8e8],cl
     1484377:	88 8c 24 68 0a 00 00 	mov    BYTE PTR [rsp+0xa68],cl
     148437e:	48 8b 54 24 28       	mov    rdx,QWORD PTR [rsp+0x28]
     1484383:	38 8a a0 00 00 00    	cmp    BYTE PTR [rdx+0xa0],cl
     1484389:	0f 84 e8 09 00 00    	je     1484d77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ca2fb>
     148438f:	31 c9                	xor    ecx,ecx
     1484391:	88 8c 24 90 00 00 00 	mov    BYTE PTR [rsp+0x90],cl
     1484398:	88 8c 24 a8 00 00 00 	mov    BYTE PTR [rsp+0xa8],cl

### 0x14a7845: call   QWORD PTR [rax+0x5c0]
     14a781b:	e9 11 01 00 00       	jmp    14a7931 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2eceb5>
     14a7820:	4d 85 e4             	test   r12,r12
     14a7823:	0f 84 bd 00 00 00    	je     14a78e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ece6a>
     14a7829:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a782c:	4c 89 ff             	mov    rdi,r15
     14a782f:	4c 89 e6             	mov    rsi,r12
     14a7832:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
     14a7838:	89 c5                	mov    ebp,eax
     14a783a:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a783d:	4c 89 ff             	mov    rdi,r15
     14a7840:	4c 89 e6             	mov    rsi,r12
     14a7843:	31 d2                	xor    edx,edx
     14a7845:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
     14a784b:	49 89 c5             	mov    r13,rax
     14a784e:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14a7853:	48 89 c6             	mov    rsi,rax
     14a7856:	89 ea                	mov    edx,ebp
     14a7858:	e8 cb 80 2d 00       	call   177f928 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133a94>
     14a785d:	89 c5                	mov    ebp,eax
     14a785f:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a7862:	6a 02                	push   0x2
     14a7864:	59                   	pop    rcx
     14a7865:	4c 89 ff             	mov    rdi,r15
     14a7868:	4c 89 e6             	mov    rsi,r12
     14a786b:	4c 89 ea             	mov    rdx,r13
     14a786e:	ff 90 00 06 00 00    	call   QWORD PTR [rax+0x600]
     14a7874:	40 84 ed             	test   bpl,bpl
     14a7877:	0f 84 da 00 00 00    	je     14a7957 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ecedb>
     14a787d:	83 7c 24 38 00       	cmp    DWORD PTR [rsp+0x38],0x0
     14a7882:	75 12                	jne    14a7896 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ece1a>

### 0x14a7d33: call   QWORD PTR [rax+0x5c0]
     14a7d0d:	4d 85 e4             	test   r12,r12
     14a7d10:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     14a7d15:	74 6d                	je     14a7d84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ed308>
     14a7d17:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a7d1a:	4c 89 ff             	mov    rdi,r15
     14a7d1d:	4c 89 e6             	mov    rsi,r12
     14a7d20:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
     14a7d26:	89 c5                	mov    ebp,eax
     14a7d28:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a7d2b:	4c 89 ff             	mov    rdi,r15
     14a7d2e:	4c 89 e6             	mov    rsi,r12
     14a7d31:	31 d2                	xor    edx,edx
     14a7d33:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
     14a7d39:	49 89 c6             	mov    r14,rax
     14a7d3c:	48 63 d5             	movsxd rdx,ebp
     14a7d3f:	48 89 df             	mov    rdi,rbx
     14a7d42:	48 89 c6             	mov    rsi,rax
     14a7d45:	e8 56 61 34 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
     14a7d4a:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a7d4d:	6a 02                	push   0x2
     14a7d4f:	59                   	pop    rcx
     14a7d50:	4c 89 ff             	mov    rdi,r15
     14a7d53:	4c 89 e6             	mov    rsi,r12
     14a7d56:	4c 89 f2             	mov    rdx,r14
     14a7d59:	ff 90 00 06 00 00    	call   QWORD PTR [rax+0x600]
     14a7d5f:	eb 2e                	jmp    14a7d8f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ed313>
     14a7d61:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     14a7d66:	4c 89 ee             	mov    rsi,r13
     14a7d69:	4c 89 e2             	mov    rdx,r12
     14a7d6c:	e8 a9 4c 5f ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>

### 0x151fe88: movaps XMMWORD PTR [rsi+0x5c0],xmm0
     151fe5f:	6a 28                	push   0x28
     151fe61:	5a                   	pop    rdx
     151fe62:	e8 b3 cb 57 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
     151fe67:	eb 14                	jmp    151fe7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365401>
     151fe69:	0f 57 c0             	xorps  xmm0,xmm0
     151fe6c:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
     151fe73:	00 
     151fe74:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
     151fe7b:	00 00 
     151fe7d:	48 8d b4 24 a0 0c 00 	lea    rsi,[rsp+0xca0]
     151fe84:	00 
     151fe85:	0f 28 06             	movaps xmm0,XMMWORD PTR [rsi]
     151fe88:	0f 29 86 c0 05 00 00 	movaps XMMWORD PTR [rsi+0x5c0],xmm0
     151fe8f:	80 7e 40 00          	cmp    BYTE PTR [rsi+0x40],0x0
     151fe93:	74 0a                	je     151fe9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x365423>
     151fe95:	48 8d bc 24 68 11 00 	lea    rdi,[rsp+0x1168]
     151fe9c:	00 
     151fe9d:	eb 08                	jmp    151fea7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36542b>
     151fe9f:	48 8d bc 24 c8 0e 00 	lea    rdi,[rsp+0xec8]
     151fea6:	00 
     151fea7:	80 8f 35 fe ff ff 10 	or     BYTE PTR [rdi-0x1cb],0x10
     151feae:	48 8b 8f 28 fe ff ff 	mov    rcx,QWORD PTR [rdi-0x1d8]
     151feb5:	f6 c1 01             	test   cl,0x1
     151feb8:	0f 85 c3 13 00 00    	jne    1521281 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366805>
     151febe:	6a 10                	push   0x10
     151fec0:	5a                   	pop    rdx
     151fec1:	e8 96 58 24 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
     151fec6:	80 bc 24 e0 0c 00 00 	cmp    BYTE PTR [rsp+0xce0],0x0
     151fecd:	00 
     151fece:	74 0a                	je     151feda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36545e>

### 0x15290c8: cmp    BYTE PTR [r14+0x5c0],0x0
     152908f:	0f 85 48 01 00 00    	jne    15291dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e761>
     1529095:	e8 f8 c6 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     152909a:	41 80 be a0 05 00 00 	cmp    BYTE PTR [r14+0x5a0],0x0
     15290a1:	00 
     15290a2:	74 24                	je     15290c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e64c>
     15290a4:	80 4b 16 80          	or     BYTE PTR [rbx+0x16],0x80
     15290a8:	49 8d b6 88 05 00 00 	lea    rsi,[r14+0x588]
     15290af:	48 8d bb 00 02 00 00 	lea    rdi,[rbx+0x200]
     15290b6:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     15290ba:	f6 c2 01             	test   dl,0x1
     15290bd:	0f 85 26 01 00 00    	jne    15291e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e76d>
     15290c3:	e8 ca c6 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15290c8:	41 80 be c0 05 00 00 	cmp    BYTE PTR [r14+0x5c0],0x0
     15290cf:	00 
     15290d0:	74 24                	je     15290f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e67a>
     15290d2:	80 4b 17 02          	or     BYTE PTR [rbx+0x17],0x2
     15290d6:	49 8d b6 a8 05 00 00 	lea    rsi,[r14+0x5a8]
     15290dd:	48 8d bb 10 02 00 00 	lea    rdi,[rbx+0x210]
     15290e4:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     15290e8:	f6 c2 01             	test   dl,0x1
     15290eb:	0f 85 04 01 00 00    	jne    15291f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e779>
     15290f1:	e8 9c c6 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15290f6:	41 80 be e0 05 00 00 	cmp    BYTE PTR [r14+0x5e0],0x0
     15290fd:	00 
     15290fe:	74 24                	je     1529124 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e6a8>
     1529100:	80 4b 17 01          	or     BYTE PTR [rbx+0x17],0x1
     1529104:	49 8d b6 c8 05 00 00 	lea    rsi,[r14+0x5c8]
     152910b:	48 8d bb 08 02 00 00 	lea    rdi,[rbx+0x208]
     1529112:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1529116:	f6 c2 01             	test   dl,0x1

### 0x167af53: movups XMMWORD PTR [rdi+0x5c0],xmm0
     167af18:	4c 89 f7             	mov    rdi,r14
     167af1b:	e8 b0 4d 3f ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     167af20:	31 c0                	xor    eax,eax
     167af22:	88 07                	mov    BYTE PTR [rdi],al
     167af24:	88 87 70 05 00 00    	mov    BYTE PTR [rdi+0x570],al
     167af2a:	88 87 98 05 00 00    	mov    BYTE PTR [rdi+0x598],al
     167af30:	88 87 a0 05 00 00    	mov    BYTE PTR [rdi+0x5a0],al
     167af36:	88 87 a8 05 00 00    	mov    BYTE PTR [rdi+0x5a8],al
     167af3c:	0f 57 c0             	xorps  xmm0,xmm0
     167af3f:	0f 11 87 18 06 00 00 	movups XMMWORD PTR [rdi+0x618],xmm0
     167af46:	88 87 28 06 00 00    	mov    BYTE PTR [rdi+0x628],al
     167af4c:	0f 11 87 b0 05 00 00 	movups XMMWORD PTR [rdi+0x5b0],xmm0
     167af53:	0f 11 87 c0 05 00 00 	movups XMMWORD PTR [rdi+0x5c0],xmm0
     167af5a:	0f 11 87 d0 05 00 00 	movups XMMWORD PTR [rdi+0x5d0],xmm0
     167af61:	0f 11 87 e0 05 00 00 	movups XMMWORD PTR [rdi+0x5e0],xmm0
     167af68:	0f 11 87 f0 05 00 00 	movups XMMWORD PTR [rdi+0x5f0],xmm0
     167af6f:	0f 11 87 00 06 00 00 	movups XMMWORD PTR [rdi+0x600],xmm0
     167af76:	66 83 a7 10 06 00 00 	and    WORD PTR [rdi+0x610],0x0
     167af7d:	00 
     167af7e:	88 87 30 06 00 00    	mov    BYTE PTR [rdi+0x630],al
     167af84:	66 83 a7 38 06 00 00 	and    WORD PTR [rdi+0x638],0x0
     167af8b:	00 
     167af8c:	88 87 3a 06 00 00    	mov    BYTE PTR [rdi+0x63a],al
     167af92:	88 87 3c 06 00 00    	mov    BYTE PTR [rdi+0x63c],al
     167af98:	88 87 40 06 00 00    	mov    BYTE PTR [rdi+0x640],al
     167af9e:	0f 11 87 58 06 00 00 	movups XMMWORD PTR [rdi+0x658],xmm0
     167afa5:	0f 11 87 48 06 00 00 	movups XMMWORD PTR [rdi+0x648],xmm0
     167afac:	0f 11 87 81 05 00 00 	movups XMMWORD PTR [rdi+0x581],xmm0
     167afb3:	0f 11 87 78 05 00 00 	movups XMMWORD PTR [rdi+0x578],xmm0
     167afba:	c7 87 68 06 00 00 00 	mov    DWORD PTR [rdi+0x668],0x3f800000

### 0x17d4220: call   QWORD PTR [rax+0x5c0]
     17d41f6:	41 89 cf             	mov    r15d,ecx
     17d41f9:	49 89 d5             	mov    r13,rdx
     17d41fc:	49 89 fe             	mov    r14,rdi
     17d41ff:	4c 63 a4 24 d0 01 00 	movsxd r12,DWORD PTR [rsp+0x1d0]
     17d4206:	00 
     17d4207:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     17d420e:	00 00 
     17d4210:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
     17d4217:	00 
     17d4218:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     17d421b:	48 89 d6             	mov    rsi,rdx
     17d421e:	31 d2                	xor    edx,edx
     17d4220:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
     17d4226:	48 8d 74 24 5c       	lea    rsi,[rsp+0x5c]
     17d422b:	83 26 00             	and    DWORD PTR [rsi],0x0
     17d422e:	0f 57 c0             	xorps  xmm0,xmm0
     17d4231:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
     17d4236:	0f 11 42 1e          	movups XMMWORD PTR [rdx+0x1e],xmm0
     17d423a:	0f 29 42 10          	movaps XMMWORD PTR [rdx+0x10],xmm0
     17d423e:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     17d4241:	4d 63 ff             	movsxd r15,r15d
     17d4244:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     17d4249:	49 01 c7             	add    r15,rax
     17d424c:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     17d4253:	00 
     17d4254:	89 1f                	mov    DWORD PTR [rdi],ebx
     17d4256:	89 6f 04             	mov    DWORD PTR [rdi+0x4],ebp
     17d4259:	4c 89 67 08          	mov    QWORD PTR [rdi+0x8],r12
     17d425d:	4c 89 7f 10          	mov    QWORD PTR [rdi+0x10],r15
     17d4261:	c6 47 18 00          	mov    BYTE PTR [rdi+0x18],0x0

## Exact registry lookup sites with id 0xb8
### 0xb8f03a
      b8f020:	4c 89 ef             	mov    rdi,r13
      b8f023:	e8 a8 0c ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b8f028:	e8 83 0a c6 00       	call   17efab0 <__stack_chk_fail@plt>
      b8f02d:	cc                   	int3
      b8f02e:	53                   	push   rbx
      b8f02f:	48 89 fb             	mov    rbx,rdi
      b8f032:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b8f036:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      b8f03a:	ba b8 00 00 00       	mov    edx,0xb8
      b8f03f:	e8 9a 32 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      b8f044:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]
      b8f04e:	48 85 c0             	test   rax,rax
      b8f051:	74 02                	je     b8f055 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbff5>
      b8f053:	5b                   	pop    rbx
      b8f054:	c3                   	ret
      b8f055:	e8 65 af ee ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      b8f05a:	48 8d 05 67 f3 c7 00 	lea    rax,[rip+0xc7f367]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
      b8f061:	48 89 07             	mov    QWORD PTR [rdi],rax
      b8f064:	48 83 c7 10          	add    rdi,0x10
      b8f068:	e9 bb ad ee ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
      b8f06d:	cc                   	int3
      b8f06e:	53                   	push   rbx
      b8f06f:	48 89 fb             	mov    rbx,rdi
      b8f072:	e8 e3 ff ff ff       	call   b8f05a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbffa>
      b8f077:	48 89 df             	mov    rdi,rbx
      b8f07a:	5b                   	pop    rbx
      b8f07b:	e9 a0 ee c5 00       	jmp    17edf20 <_ZdlPv@plt>
      b8f080:	55                   	push   rbp
      b8f081:	41 57                	push   r15

### 0x11ee6c2
     11ee6a0:	48 89 df             	mov    rdi,rbx
     11ee6a3:	e8 d2 30 a2 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
     11ee6a8:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11ee6ad:	48 89 df             	mov    rdi,rbx
     11ee6b0:	e8 79 09 9a ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     11ee6b5:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11ee6ba:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee6be:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee6c2:	ba b8 00 00 00       	mov    edx,0xb8
     11ee6c7:	e8 12 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
     11ee6d6:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     11ee6db:	e8 ba 85 bf ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
     11ee6e0:	48 89 df             	mov    rdi,rbx
     11ee6e3:	e8 2c 99 99 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
     11ee6e8:	49 89 c4             	mov    r12,rax
     11ee6eb:	48 89 df             	mov    rdi,rbx
     11ee6ee:	e8 43 86 ac ff       	call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>
     11ee6f3:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
     11ee6fa:	00 
     11ee6fb:	48 89 df             	mov    rdi,rbx
     11ee6fe:	e8 c7 6a bf ff       	call   de51ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb2250>
     11ee703:	48 89 c5             	mov    rbp,rax
     11ee706:	48 89 df             	mov    rdi,rbx
     11ee709:	e8 c0 30 a2 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
     11ee70e:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
     11ee715:	00 
     11ee716:	48 89 df             	mov    rdi,rbx
     11ee719:	e8 10 76 eb ff       	call   10a5d2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d144>

### 0x135c7a6
     135c787:	49 89 ce             	mov    r14,rcx
     135c78a:	49 89 d7             	mov    r15,rdx
     135c78d:	48 89 fb             	mov    rbx,rdi
     135c790:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c797:	00 00 
     135c799:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     135c79e:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
     135c7a2:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
     135c7a6:	ba b8 00 00 00       	mov    edx,0xb8
     135c7ab:	e8 2e 5b 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     135c7b0:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135c7b3:	4c 8b b0 c0 05 00 00 	mov    r14,QWORD PTR [rax+0x5c0]
     135c7ba:	4c 89 f7             	mov    rdi,r14
     135c7bd:	e8 d8 a4 a8 ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
     135c7c2:	49 8b 8f 90 00 00 00 	mov    rcx,QWORD PTR [r15+0x90]
     135c7c9:	49 8b b7 38 01 00 00 	mov    rsi,QWORD PTR [r15+0x138]
     135c7d0:	49 83 c6 20          	add    r14,0x20
     135c7d4:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     135c7d9:	49 83 20 00          	and    QWORD PTR [r8],0x0
     135c7dd:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     135c7e2:	4c 89 f2             	mov    rdx,r14
     135c7e5:	e8 21 3e 96 ff       	call   cc060b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d5ab>
     135c7ea:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     135c7ef:	48 89 03             	mov    QWORD PTR [rbx],rax
     135c7f2:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135c7f7:	48 83 64 24 08 00    	and    QWORD PTR [rsp+0x8],0x0
     135c7fd:	48 85 ff             	test   rdi,rdi
     135c800:	74 06                	je     135c808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1d8c>
     135c802:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135c805:	ff 50 08             	call   QWORD PTR [rax+0x8]

## b8f02e family relocation hits
000000000180e3c8  0000000000000008 R_X86_64_RELATIVE                         b8f05a
000000000180e3d0  0000000000000008 R_X86_64_RELATIVE                         b8f06e

## Vptr-looking LEAs in b8f000..b90100
### 0xb8f05a: lea    rax,[rip+0xc7f367]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
      b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]
      b8f04e:	48 85 c0             	test   rax,rax
      b8f051:	74 02                	je     b8f055 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbff5>
      b8f053:	5b                   	pop    rbx
      b8f054:	c3                   	ret
      b8f055:	e8 65 af ee ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      b8f05a:	48 8d 05 67 f3 c7 00 	lea    rax,[rip+0xc7f367]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
      b8f061:	48 89 07             	mov    QWORD PTR [rdi],rax
      b8f064:	48 83 c7 10          	add    rdi,0x10
      b8f068:	e9 bb ad ee ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
      b8f06d:	cc                   	int3
      b8f06e:	53                   	push   rbx
      b8f06f:	48 89 fb             	mov    rbx,rdi
      b8f072:	e8 e3 ff ff ff       	call   b8f05a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbffa>
      b8f077:	48 89 df             	mov    rdi,rbx
      b8f07a:	5b                   	pop    rbx
      b8f07b:	e9 a0 ee c5 00       	jmp    17edf20 <_ZdlPv@plt>
      b8f080:	55                   	push   rbp

### 0xb8f2ea: lea    rax,[rip+0xd05c4f]        # 1894f40 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1e80>
      b8f2d2:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      b8f2d9:	00 
      b8f2da:	e8 b1 eb c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b8f2df:	0f 57 c0             	xorps  xmm0,xmm0
      b8f2e2:	0f 11 84 24 08 01 00 	movups XMMWORD PTR [rsp+0x108],xmm0
      b8f2e9:	00 
      b8f2ea:	48 8d 05 4f 5c d0 00 	lea    rax,[rip+0xd05c4f]        # 1894f40 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1e80>
      b8f2f1:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
      b8f2f8:	00 
      b8f2f9:	48 8d 05 f8 04 8b ff 	lea    rax,[rip+0xffffffffff8b04f8]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      b8f300:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
      b8f307:	00 
      b8f308:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
      b8f30f:	00 
      b8f310:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
      b8f317:	00 
      b8f318:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
      b8f31f:	00 

### 0xb8fa30: lea    rax,[rip+0xc81cf1]        # 1811728 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x73e8>
      b8fa1c:	00 
      b8fa1d:	48 89 03             	mov    QWORD PTR [rbx],rax
      b8fa20:	48 89 df             	mov    rdi,rbx
      b8fa23:	e8 18 f1 c5 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
      b8fa28:	49 89 c7             	mov    r15,rax
      b8fa2b:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
      b8fa30:	48 8d 05 f1 1c c8 00 	lea    rax,[rip+0xc81cf1]        # 1811728 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x73e8>
      b8fa37:	48 89 03             	mov    QWORD PTR [rbx],rax
      b8fa3a:	48 8d 05 b7 fd 8a ff 	lea    rax,[rip+0xffffffffff8afdb7]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      b8fa41:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b8fa45:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      b8fa49:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0
      b8fa4e:	0f 57 c0             	xorps  xmm0,xmm0
      b8fa51:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      b8fa55:	c7 43 28 05 00 00 00 	mov    DWORD PTR [rbx+0x28],0x5
      b8fa5c:	48 c7 43 10 04 00 00 	mov    QWORD PTR [rbx+0x10],0x4
      b8fa63:	00 
      b8fa64:	48 8d 35 d5 e9 81 ff 	lea    rsi,[rip+0xffffffffff81e9d5]        # 3ae440 <_ZTSN5boost9exceptionE@@Base+0xee22>

### 0xb8fb3f: lea    rax,[rip+0xc7153a]        # 1801080 <_ZTIN4asio22service_already_existsE@@Base+0x2868>
      b8fb2d:	6a 28                	push   0x28
      b8fb2f:	5f                   	pop    rdi
      b8fb30:	e8 cb e3 c5 00       	call   17edf00 <_Znwm@plt>
      b8fb35:	48 89 c3             	mov    rbx,rax
      b8fb38:	0f 57 c0             	xorps  xmm0,xmm0
      b8fb3b:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      b8fb3f:	48 8d 05 3a 15 c7 00 	lea    rax,[rip+0xc7153a]        # 1801080 <_ZTIN4asio22service_already_existsE@@Base+0x2868>
      b8fb46:	48 89 03             	mov    QWORD PTR [rbx],rax
      b8fb49:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
      b8fb4d:	4c 8b 6d 38          	mov    r13,QWORD PTR [rbp+0x38]
      b8fb51:	4c 8b 75 40          	mov    r14,QWORD PTR [rbp+0x40]
      b8fb55:	4d 85 f6             	test   r14,r14
      b8fb58:	74 05                	je     b8fb5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdcaff>
      b8fb5a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      b8fb5f:	48 8b 75 28          	mov    rsi,QWORD PTR [rbp+0x28]
      b8fb63:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      b8fb6a:	00 
      b8fb6b:	e8 36 9d a5 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>

### 0xb8fd70: lea    rdx,[rip+0xc7e761]        # 180e4d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4198>
      b8fd5e:	00 00 
      b8fd60:	6a 30                	push   0x30
      b8fd62:	5f                   	pop    rdi
      b8fd63:	e8 98 e1 c5 00       	call   17edf00 <_Znwm@plt>
      b8fd68:	48 8d 8c 24 08 01 00 	lea    rcx,[rsp+0x108]
      b8fd6f:	00 
      b8fd70:	48 8d 15 61 e7 c7 00 	lea    rdx,[rip+0xc7e761]        # 180e4d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4198>
      b8fd77:	48 89 10             	mov    QWORD PTR [rax],rdx
      b8fd7a:	48 89 68 08          	mov    QWORD PTR [rax+0x8],rbp
      b8fd7e:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
      b8fd82:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
      b8fd86:	0f 57 c0             	xorps  xmm0,xmm0
      b8fd89:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
      b8fd8c:	4c 89 68 20          	mov    QWORD PTR [rax+0x20],r13
      b8fd90:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
      b8fd94:	0f 11 41 10          	movups XMMWORD PTR [rcx+0x10],xmm0
      b8fd98:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]
      b8fd9f:	00 

### 0xb8fe29: lea    rdx,[rip+0xc7e6f0]        # 180e520 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x41e0>
      b8fe17:	00 00 
      b8fe19:	6a 30                	push   0x30
      b8fe1b:	5f                   	pop    rdi
      b8fe1c:	e8 df e0 c5 00       	call   17edf00 <_Znwm@plt>
      b8fe21:	48 8d 8c 24 38 01 00 	lea    rcx,[rsp+0x138]
      b8fe28:	00 
      b8fe29:	48 8d 15 f0 e6 c7 00 	lea    rdx,[rip+0xc7e6f0]        # 180e520 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x41e0>
      b8fe30:	48 89 10             	mov    QWORD PTR [rax],rdx
      b8fe33:	48 89 68 08          	mov    QWORD PTR [rax+0x8],rbp
      b8fe37:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
      b8fe3b:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
      b8fe3f:	0f 57 c0             	xorps  xmm0,xmm0
      b8fe42:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
      b8fe45:	4c 89 68 20          	mov    QWORD PTR [rax+0x20],r13
      b8fe49:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
      b8fe4d:	0f 11 41 10          	movups XMMWORD PTR [rcx+0x10],xmm0
      b8fe51:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
      b8fe58:	00 

## Calls to b8f02e immediately followed by virtual getters
### caller 0xb8ec45
      b8ec45:	e8 e4 03 00 00       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      b8ec4a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      b8ec4d:	48 89 c7             	mov    rdi,rax
      b8ec50:	ff 51 28             	call   QWORD PTR [rcx+0x28]
      b8ec53:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      b8ec58:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      b8ec5c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b8ec60:	49 8b 6f 60          	mov    rbp,QWORD PTR [r15+0x60]
      b8ec64:	4d 8b af 80 00 00 00 	mov    r13,QWORD PTR [r15+0x80]
      b8ec6b:	4d 8b 77 68          	mov    r14,QWORD PTR [r15+0x68]

### caller 0xc7d490
      c7d490:	e8 99 1b f1 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      c7d495:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      c7d498:	48 89 c7             	mov    rdi,rax
      c7d49b:	ff 51 30             	call   QWORD PTR [rcx+0x30]
      c7d49e:	49 89 c4             	mov    r12,rax
      c7d4a1:	4c 89 ff             	mov    rdi,r15
      c7d4a4:	e8 f7 5e fd ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
      c7d4a9:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      c7d4ac:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      c7d4b1:	48 89 c6             	mov    rsi,rax

### caller 0xe8c9d1
      e8c9d1:	e8 58 26 d0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      e8c9d6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8c9d9:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
      e8c9e0:	00 
      e8c9e1:	48 89 c6             	mov    rsi,rax
      e8c9e4:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      e8c9e7:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      e8c9ec:	48 8b 75 58          	mov    rsi,QWORD PTR [rbp+0x58]
      e8c9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e8c9f3:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]

### caller 0x10885e3
     10885e3:	e8 46 6a b0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     10885e8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     10885eb:	48 89 c7             	mov    rdi,rax
     10885ee:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     10885f1:	49 89 c6             	mov    r14,rax
     10885f4:	6a 28                	push   0x28
     10885f6:	5f                   	pop    rdi
     10885f7:	e8 04 59 76 00       	call   17edf00 <_Znwm@plt>
     10885fc:	48 89 c3             	mov    rbx,rax
     10885ff:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]

### caller 0x11ee6b0
     11ee6b0:	e8 79 09 9a ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     11ee6b5:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11ee6ba:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee6be:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee6c2:	ba b8 00 00 00       	mov    edx,0xb8
     11ee6c7:	e8 12 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
     11ee6d6:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     11ee6db:	e8 ba 85 bf ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>

### caller 0x1442026
     1442026:	e8 03 d0 74 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     144202b:	49 89 c7             	mov    r15,rax
     144202e:	4c 89 f7             	mov    rdi,r14
     1442031:	e8 e6 a2 83 ff       	call   c7c31c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c92bc>
     1442036:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     144203a:	4c 89 f7             	mov    rdi,r14
     144203d:	e8 d2 5f 74 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
     1442042:	49 89 c4             	mov    r12,rax
     1442045:	4c 89 f7             	mov    rdi,r14
     1442048:	e8 f5 5e 74 ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>

## Service-184 accessor
      b8f02e:	53                   	push   rbx
      b8f02f:	48 89 fb             	mov    rbx,rdi
      b8f032:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b8f036:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      b8f03a:	ba b8 00 00 00       	mov    edx,0xb8
      b8f03f:	e8 9a 32 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      b8f044:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]
      b8f04e:	48 85 c0             	test   rax,rax
      b8f051:	74 02                	je     b8f055 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbff5>
      b8f053:	5b                   	pop    rbx
      b8f054:	c3                   	ret
      b8f055:	e8 65 af ee ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      b8f05a:	48 8d 05 67 f3 c7 00 	lea    rax,[rip+0xc7f367]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
      b8f061:	48 89 07             	mov    QWORD PTR [rdi],rax
      b8f064:	48 83 c7 10          	add    rdi,0x10
      b8f068:	e9 bb ad ee ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
      b8f06d:	cc                   	int3
