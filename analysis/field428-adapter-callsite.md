# field428 adapter call-site / rsi-source trace

Known nested adapters:
- inner AP 0x1834418 built at 0xe9ff24 from rsp+0x770/+0x780/+0x790; +0x30 -> 0xee6db8
- outer AP 0x1834728 built at 0xea01e4; +0x10 copies rsp+0x1060 (inner shared-pointer pair); +0x30 -> 0xece084
- outer allocation pointer is saved at rsp+0xea0 at 0xea01c0
- containing FDE=(15310087, 15343400)

## All exact references to adapter stack slots
### rsp+0xea0: 30 refs
- 0xe9b0b9: mov    QWORD PTR [rsp+0xea0],r15
- 0xe9b13d: lea    rdi,[rsp+0xea0]
- 0xe9b2d5: lea    rax,[rsp+0xea0]
- 0xe9ca1f: lea    rsi,[rsp+0xea0]
- 0xe9d1a2: lea    rdi,[rsp+0xea0]
- 0xe9d4d1: lea    rax,[rsp+0xea0]
- 0xe9d5e1: lea    r13,[rsp+0xea0]
- 0xe9db11: lea    r13,[rsp+0xea0]
- 0xe9e0b2: lea    r15,[rsp+0xea0]
- 0xe9e45d: lea    rdi,[rsp+0xea0]
- 0xe9e5c2: lea    r15,[rsp+0xea0]
- 0xe9e7d9: lea    rdi,[rsp+0xea0]
- 0xe9e897: lea    rsi,[rsp+0xea0]
- 0xe9e8c1: lea    r13,[rsp+0xea0]
- 0xe9e948: mov    QWORD PTR [rsp+0xea0],rcx
- 0xe9e984: lea    rsi,[rsp+0xea0]
- 0xe9ea25: lea    rsi,[rsp+0xea0]
- 0xe9eb21: lea    rdi,[rsp+0xea0]
- 0xea01c0: mov    QWORD PTR [rsp+0xea0],rax
- 0xea031e: lea    rdi,[rsp+0xea0]
- 0xea03df: lea    rdi,[rsp+0xea0]
- 0xea0602: lea    r12,[rsp+0xea0]
- 0xea09ff: lea    rdi,[rsp+0xea0]
- 0xea0a86: lea    rdi,[rsp+0xea0]
- 0xea0cee: lea    rdi,[rsp+0xea0]
- 0xea0d6f: lea    rdi,[rsp+0xea0]
- 0xea11b1: lea    rdi,[rsp+0xea0]
- 0xea1257: lea    rdi,[rsp+0xea0]
- 0xea1621: lea    rdi,[rsp+0xea0]
- 0xea1c57: lea    rdi,[rsp+0xea0]

### rsp+0xea8: 3 refs
- 0xe9b0c5: mov    QWORD PTR [rsp+0xea8],r14
- 0xe9e950: mov    QWORD PTR [rsp+0xea8],rax
- 0xea01d0: mov    QWORD PTR [rsp+0xea8],rax

### rsp+0xeb0: 3 refs
- 0xe9b0dd: movdqu XMMWORD PTR [rsp+0xeb0],xmm0
- 0xe9e958: mov    QWORD PTR [rsp+0xeb0],rbp
- 0xea01d8: mov    QWORD PTR [rsp+0xeb0],0x1

### rsp+0x1060: 113 refs
- 0xe9a0e3: lea    r15,[rsp+0x1060]
- 0xe9a5b6: lea    r15,[rsp+0x1060]
- 0xe9a79f: lea    r15,[rsp+0x1060]
- 0xe9ad91: lea    rsi,[rsp+0x1060]
- 0xe9adf3: lea    rbx,[rsp+0x1060]
- 0xe9ae81: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9b166: lea    rsi,[rsp+0x1060]
- 0xe9b1d2: lea    rdi,[rsp+0x1060]
- 0xe9b701: mov    QWORD PTR [rsp+0x1060],r12
- 0xe9b777: lea    rdi,[rsp+0x1060]
- 0xe9b837: lea    rdi,[rsp+0x1060]
- 0xe9b85e: lea    rcx,[rsp+0x1060]
- 0xe9b8a3: lea    rdi,[rsp+0x1060]
- 0xe9ba78: lea    r14,[rsp+0x1060]
- 0xe9bb80: lea    rdi,[rsp+0x1060]
- 0xe9be3a: lea    rsi,[rsp+0x1060]
- 0xe9bf49: lea    rsi,[rsp+0x1060]
- 0xe9c05c: lea    rsi,[rsp+0x1060]
- 0xe9c0b7: lea    rdi,[rsp+0x1060]
- 0xe9c0f3: lea    rsi,[rsp+0x1060]
- 0xe9c25c: lea    rdi,[rsp+0x1060]
- 0xe9d321: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9d3e8: lea    r14,[rsp+0x1060]
- 0xe9d4f8: mov    rax,QWORD PTR [rsp+0x1060]
- 0xe9d5a5: lea    rdi,[rsp+0x1060]
- 0xe9da31: lea    rdi,[rsp+0x1060]
- 0xe9da97: lea    r13,[rsp+0x1060]
- 0xe9dc07: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9dc1c: lea    rdx,[rsp+0x1060]
- 0xe9dc41: lea    rdi,[rsp+0x1060]
- 0xe9df6a: lea    rdi,[rsp+0x1060]
- 0xe9e029: lea    rsi,[rsp+0x1060]
- 0xe9e0fd: lea    r13,[rsp+0x1060]
- 0xe9e192: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9e265: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9e2fd: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9e395: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9e5ca: lea    rbp,[rsp+0x1060]
- 0xe9e694: mov    QWORD PTR [rsp+0x1060],rcx
- 0xe9e701: lea    r14,[rsp+0x1060]
- 0xe9e7e6: lea    rdi,[rsp+0x1060]
- 0xe9e84f: lea    rsi,[rsp+0x1060]
- 0xe9e8b4: lea    rdi,[rsp+0x1060]
- 0xe9e97c: lea    rdi,[rsp+0x1060]
- 0xe9e9eb: lea    rsi,[rsp+0x1060]
- 0xe9eb0c: lea    rdi,[rsp+0x1060]
- 0xe9ebac: lea    r15,[rsp+0x1060]
- 0xe9ec2d: mov    QWORD PTR [rsp+0x1060],rcx
- 0xe9ec5d: lea    rdi,[rsp+0x1060]
- 0xe9ed3d: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9ed74: lea    rdi,[rsp+0x1060]
- 0xe9edd7: mov    QWORD PTR [rsp+0x1060],rcx
- 0xe9ee4c: lea    r12,[rsp+0x1060]
- 0xe9eeb0: lea    r15,[rsp+0x1060]
- 0xe9eefd: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9ef95: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9efbd: lea    rbx,[rsp+0x1060]
- 0xe9f017: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f03f: lea    rbx,[rsp+0x1060]
- 0xe9f099: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f0c1: lea    rbx,[rsp+0x1060]
- 0xe9f15e: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f1a6: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f1d7: lea    rdi,[rsp+0x1060]
- 0xe9f21b: lea    r15,[rsp+0x1060]
- 0xe9f2a3: mov    QWORD PTR [rsp+0x1060],rcx
- 0xe9f308: lea    r12,[rsp+0x1060]
- 0xe9f423: lea    rdx,[rsp+0x1060]
- 0xe9f44c: lea    rbx,[rsp+0x1060]
- 0xe9f4b3: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f4db: lea    rdi,[rsp+0x1060]
- 0xe9f59e: movdqa xmm0,XMMWORD PTR [rsp+0x1060]
- 0xe9f5b1: movdqa XMMWORD PTR [rsp+0x1060],xmm0
- 0xe9f5f7: lea    rbx,[rsp+0x1060]
- 0xe9f665: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f68d: lea    r14,[rsp+0x1060]
- 0xe9f6f8: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9f730: lea    rdi,[rsp+0x1060]
- 0xe9f8b5: lea    rdx,[rsp+0x1060]
- 0xe9f8d6: lea    rdi,[rsp+0x1060]
- 0xe9f93c: mov    QWORD PTR [rsp+0x1060],rax
- 0xe9ff00: mov    QWORD PTR [rsp+0x1060],rax
- 0xea005c: lea    rbx,[rsp+0x1060]
- 0xea01ef: movaps xmm0,XMMWORD PTR [rsp+0x1060]
- 0xea036c: lea    rdi,[rsp+0x1060]
- 0xea03f6: mov    QWORD PTR [rsp+0x1060],rax
- 0xea0498: movdqu xmm0,XMMWORD PTR [rsp+0x1060]
- 0xea0640: lea    rbx,[rsp+0x1060]
- 0xea069a: mov    QWORD PTR [rsp+0x1060],rax
- 0xea06c2: lea    rdi,[rsp+0x1060]
- 0xea0841: lea    rdi,[rsp+0x1060]
- 0xea0887: lea    rdi,[rsp+0x1060]
- 0xea0951: lea    rdi,[rsp+0x1060]
- 0xea09e5: lea    rdi,[rsp+0x1060]
- 0xea0a72: lea    rdi,[rsp+0x1060]
- 0xea0af0: lea    rdi,[rsp+0x1060]
- 0xea0b98: lea    rdi,[rsp+0x1060]
- 0xea0baf: lea    rdi,[rsp+0x1060]
- 0xea0c80: lea    rdi,[rsp+0x1060]
- 0xea0ce1: lea    rdi,[rsp+0x1060]
- 0xea0d88: lea    rdi,[rsp+0x1060]
- 0xea0e68: lea    rdi,[rsp+0x1060]
- 0xea1076: lea    rdi,[rsp+0x1060]
- 0xea10d1: lea    rdi,[rsp+0x1060]
- 0xea10fa: lea    rdi,[rsp+0x1060]
- 0xea1190: lea    rdi,[rsp+0x1060]
- 0xea1299: lea    rdi,[rsp+0x1060]
- 0xea13e9: lea    rdi,[rsp+0x1060]
- 0xea162e: lea    rdi,[rsp+0x1060]
- 0xea166e: lea    rdi,[rsp+0x1060]
- 0xea16fc: lea    rdi,[rsp+0x1060]
- 0xea17bc: lea    rdi,[rsp+0x1060]
- 0xea1b10: lea    rdi,[rsp+0x1060]

### rsp+0x1068: 19 refs
- 0xe9ae89: mov    QWORD PTR [rsp+0x1068],r15
- 0xe9b709: mov    QWORD PTR [rsp+0x1068],rbx
- 0xe9be59: mov    rdi,QWORD PTR [rsp+0x1068]
- 0xe9bf68: mov    rdi,QWORD PTR [rsp+0x1068]
- 0xe9c07b: mov    rdi,QWORD PTR [rsp+0x1068]
- 0xe9d329: mov    QWORD PTR [rsp+0x1068],rbp
- 0xe9dc14: movups XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9e1a2: mov    QWORD PTR [rsp+0x1068],rcx
- 0xe9e6a1: movups XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9ec35: mov    QWORD PTR [rsp+0x1068],rax
- 0xe9ed4b: movdqu XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9ede4: movups XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9f166: movdqu XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9f1ae: movdqu XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9f2b0: movups XMMWORD PTR [rsp+0x1068],xmm0
- 0xe9f708: mov    QWORD PTR [rsp+0x1068],rax
- 0xe9ff10: mov    QWORD PTR [rsp+0x1068],rax
- 0xea03fe: mov    QWORD PTR [rsp+0x1068],rbx
- 0xea1b35: mov    rdi,QWORD PTR [rsp+0x1068]

### rsp+0x1070: 9 refs
- 0xe9b716: mov    QWORD PTR [rsp+0x1070],rbp
- 0xe9b73c: lea    rcx,[rsp+0x1070]
- 0xe9d331: mov    QWORD PTR [rsp+0x1070],0x1
- 0xe9d41c: lea    rbx,[rsp+0x1070]
- 0xe9e1aa: mov    BYTE PTR [rsp+0x1070],bl
- 0xe9f55b: lea    rbx,[rsp+0x1070]
- 0xe9ff18: mov    QWORD PTR [rsp+0x1070],0x1
- 0xea0205: movaps xmm0,XMMWORD PTR [rsp+0x1070]
- 0xea0406: mov    QWORD PTR [rsp+0x1070],r13

### rsp+0x1078: 5 refs
- 0xe9b71e: mov    QWORD PTR [rsp+0x1078],r15
- 0xe9edec: mov    QWORD PTR [rsp+0x1078],r14
- 0xea01fd: mov    rax,QWORD PTR [rsp+0x1078]
- 0xea0413: mov    QWORD PTR [rsp+0x1078],rax
- 0xea0df1: mov    rdi,QWORD PTR [rsp+0x1078]

### rsp+0x1080: 31 refs
- 0xe9ad21: and    QWORD PTR [rsp+0x1080],0x0
- 0xe9ad6e: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9ad7e: cmp    QWORD PTR [rsp+0x1080],0x0
- 0xe9ae91: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9b0a1: mov    QWORD PTR [rsp+0x1080],rax
- 0xe9dc24: mov    QWORD PTR [rsp+0x1080],rdx
- 0xe9e1b1: mov    QWORD PTR [rsp+0x1080],r13
- 0xe9e26d: mov    QWORD PTR [rsp+0x1080],r13
- 0xe9e305: mov    QWORD PTR [rsp+0x1080],r13
- 0xe9e39d: mov    QWORD PTR [rsp+0x1080],r13
- 0xe9e4c0: and    QWORD PTR [rsp+0x1080],0x0
- 0xe9e50b: mov    QWORD PTR [rsp+0x1080],rax
- 0xe9e6a9: mov    QWORD PTR [rsp+0x1080],rbp
- 0xe9ec3d: mov    QWORD PTR [rsp+0x1080],r15
- 0xe9ed54: mov    QWORD PTR [rsp+0x1080],r15
- 0xe9edf4: mov    QWORD PTR [rsp+0x1080],r15
- 0xe9ef05: mov    QWORD PTR [rsp+0x1080],r15
- 0xe9ef9d: mov    QWORD PTR [rsp+0x1080],r15
- 0xe9f01f: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9f0a1: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9f1b7: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9f2b8: mov    QWORD PTR [rsp+0x1080],r15
- 0xe9f3dd: and    QWORD PTR [rsp+0x1080],0x0
- 0xe9f4bb: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9f66d: mov    QWORD PTR [rsp+0x1080],rbx
- 0xe9f710: mov    QWORD PTR [rsp+0x1080],r14
- 0xe9f873: and    QWORD PTR [rsp+0x1080],0x0
- 0xe9f944: mov    QWORD PTR [rsp+0x1080],r14
- 0xea0225: movaps xmm0,XMMWORD PTR [rsp+0x1080]
- 0xea0425: mov    QWORD PTR [rsp+0x1080],rax
- 0xea06a2: mov    QWORD PTR [rsp+0x1080],rbx

### rsp+0x1088: 3 refs
- 0xea021d: mov    rax,QWORD PTR [rsp+0x1088]
- 0xea042d: mov    QWORD PTR [rsp+0x1088],r14
- 0xea0de4: mov    rdi,QWORD PTR [rsp+0x1088]

### rsp+0x770: 200 refs
- 0xe99dca: lea    rdi,[rsp+0x770]
- 0xe99e08: movaps xmm0,XMMWORD PTR [rsp+0x770]
- 0xe99e10: movdqa XMMWORD PTR [rsp+0x770],xmm1
- 0xe99eb4: lea    rbx,[rsp+0x770]
- 0xe99edb: lea    rdi,[rsp+0x770]
- 0xe99ef3: lea    rdi,[rsp+0x770]
- 0xe99f06: lea    rdi,[rsp+0x770]
- 0xe99f29: lea    rbx,[rsp+0x770]
- 0xe99f4d: lea    rdi,[rsp+0x770]
- 0xe99f68: lea    rdi,[rsp+0x770]
- 0xe9a0f9: lea    r12,[rsp+0x770]
- 0xe9a281: lea    rbx,[rsp+0x770]
- 0xe9a2b2: lea    rdi,[rsp+0x770]
- 0xe9a2c3: lea    rdi,[rsp+0x770]
- 0xe9a2e1: lea    rdi,[rsp+0x770]
- 0xe9a2f6: lea    rdi,[rsp+0x770]
- 0xe9a5cc: lea    r12,[rsp+0x770]
- 0xe9a7b5: lea    r12,[rsp+0x770]
- 0xe9a910: lea    r14,[rsp+0x770]
- 0xe9a935: lea    rdi,[rsp+0x770]
- 0xe9a94e: lea    rdi,[rsp+0x770]
- 0xe9acf0: movaps XMMWORD PTR [rsp+0x770],xmm0
- 0xe9ad3f: lea    r15,[rsp+0x770]
- 0xe9ad89: lea    rdi,[rsp+0x770]
- 0xe9adc3: lea    r15,[rsp+0x770]
- 0xe9ae5f: lea    r12,[rsp+0x770]
- 0xe9b191: lea    r12,[rsp+0x770]
- 0xe9b1ef: lea    rdi,[rsp+0x770]
- 0xe9b426: lea    rdi,[rsp+0x770]
- 0xe9b44f: lea    rsi,[rsp+0x770]
- 0xe9b45f: lea    rdi,[rsp+0x770]
- 0xe9b49d: lea    rdi,[rsp+0x770]
- 0xe9b4c6: lea    rsi,[rsp+0x770]
- 0xe9b4d6: lea    rdi,[rsp+0x770]
- 0xe9b4ff: lea    rdi,[rsp+0x770]
- 0xe9b514: lea    rsi,[rsp+0x770]
- 0xe9b524: lea    rdi,[rsp+0x770]
- 0xe9b565: lea    rdi,[rsp+0x770]
- 0xe9b57a: lea    rsi,[rsp+0x770]
- 0xe9b58a: lea    rdi,[rsp+0x770]
- 0xe9b608: lea    r14,[rsp+0x770]
- 0xe9b62f: lea    rdi,[rsp+0x770]
- 0xe9b76b: lea    r14,[rsp+0x770]
- 0xe9b7a7: lea    rdi,[rsp+0x770]
- 0xe9b7e4: lea    rdi,[rsp+0x770]
- 0xe9b7f9: lea    rdi,[rsp+0x770]
- 0xe9b856: lea    rbx,[rsp+0x770]
- 0xe9b896: lea    rdi,[rsp+0x770]
- 0xe9b8dd: lea    rdi,[rsp+0x770]
- 0xe9b914: lea    rdi,[rsp+0x770]
- 0xe9b929: lea    rdi,[rsp+0x770]
- 0xe9b944: mov    QWORD PTR [rsp+0x770],rax
- 0xe9b94c: lea    rax,[rsp+0x770]
- 0xe9b981: lea    rcx,[rsp+0x770]
- 0xe9b9a2: lea    rdi,[rsp+0x770]
- 0xe9b9b3: lea    rdi,[rsp+0x770]
- 0xe9ba07: movdqa XMMWORD PTR [rsp+0x770],xmm0
- 0xe9bb18: lea    rsi,[rsp+0x770]
- 0xe9bd33: lea    rbx,[rsp+0x770]
- 0xe9bdec: mov    QWORD PTR [rsp+0x770],rax
- 0xe9bec6: mov    QWORD PTR [rsp+0x770],rax
- 0xe9bee2: mov    QWORD PTR [rsp+0x770],rax
- 0xe9c00e: mov    QWORD PTR [rsp+0x770],rax
- 0xe9c1c8: lea    r13,[rsp+0x770]
- 0xe9c2e4: lea    rsi,[rsp+0x770]
- 0xe9c336: mov    QWORD PTR [rsp+0x770],rax
- 0xe9c3d7: mov    QWORD PTR [rsp+0x770],rax
- 0xe9c4d4: mov    QWORD PTR [rsp+0x770],rax
- 0xe9c5e7: mov    QWORD PTR [rsp+0x770],rax
- 0xe9c6bd: mov    QWORD PTR [rsp+0x770],rcx
- 0xe9c7d7: lea    rsi,[rsp+0x770]
- 0xe9c84e: lea    rdi,[rsp+0x770]
- 0xe9c8b0: lea    r14,[rsp+0x770]
- 0xe9d0ca: lea    rdi,[rsp+0x770]
- 0xe9d347: mov    rax,QWORD PTR [rsp+0x770]
- 0xe9d404: lea    rdi,[rsp+0x770]
- 0xe9d6ab: lea    rdi,[rsp+0x770]
- 0xe9d6c8: lea    rsi,[rsp+0x770]
- 0xe9d6d5: lea    rdi,[rsp+0x770]
- 0xe9d715: lea    rdi,[rsp+0x770]
- 0xe9d732: lea    rsi,[rsp+0x770]
- 0xe9d73f: lea    rdi,[rsp+0x770]
- 0xe9d760: lea    rdi,[rsp+0x770]
- 0xe9d76d: lea    rsi,[rsp+0x770]
- 0xe9d792: lea    rdi,[rsp+0x770]
- 0xe9d979: lea    rdi,[rsp+0x770]
- 0xe9d9e6: lea    r13,[rsp+0x770]
- 0xe9dc2c: lea    rdi,[rsp+0x770]
- 0xe9dc6a: lea    rsi,[rsp+0x770]
- 0xe9dc77: lea    rdi,[rsp+0x770]
- 0xe9df39: lea    rdi,[rsp+0x770]
- 0xe9dfab: lea    rsi,[rsp+0x770]
- 0xe9e10d: lea    rdi,[rsp+0x770]
- 0xe9e1df: lea    rbx,[rsp+0x770]
- 0xe9e228: lea    rdi,[rsp+0x770]
- 0xe9e28c: lea    rbx,[rsp+0x770]
- 0xe9e2d5: lea    rdi,[rsp+0x770]
- 0xe9e324: lea    rbx,[rsp+0x770]
- 0xe9e36d: lea    rdi,[rsp+0x770]
- 0xe9e3bc: lea    rbx,[rsp+0x770]
- 0xe9e405: lea    rdi,[rsp+0x770]
- 0xe9e5ba: lea    rbx,[rsp+0x770]
- 0xe9e625: lea    rdi,[rsp+0x770]
- 0xe9e6f1: lea    r12,[rsp+0x770]
- 0xe9e758: lea    rdi,[rsp+0x770]
- 0xe9e88f: lea    rdi,[rsp+0x770]
- 0xe9e8f5: lea    rsi,[rsp+0x770]
- 0xe9e902: lea    rdi,[rsp+0x770]
- 0xe9eac6: lea    rbx,[rsp+0x770]
- 0xe9eb4d: lea    rdi,[rsp+0x770]
- 0xe9eb82: lea    rdi,[rsp+0x770]
- 0xe9eb9f: lea    rsi,[rsp+0x770]
- 0xe9ebb4: lea    rdi,[rsp+0x770]
- 0xe9ec45: lea    rdi,[rsp+0x770]
- 0xe9ec7f: lea    rsi,[rsp+0x770]
- 0xe9ec8c: lea    rdi,[rsp+0x770]
- 0xe9ed5c: lea    rdi,[rsp+0x770]
- 0xe9ed9d: lea    rsi,[rsp+0x770]
- 0xe9edaa: lea    rdi,[rsp+0x770]
- 0xe9ee3c: lea    r15,[rsp+0x770]
- 0xe9ee9b: lea    rdi,[rsp+0x770]
- 0xe9ef24: lea    rbx,[rsp+0x770]
- 0xe9ef6d: lea    rdi,[rsp+0x770]
- 0xe9efa5: lea    rdi,[rsp+0x770]
- 0xe9efe2: lea    rsi,[rsp+0x770]
- 0xe9efef: lea    rdi,[rsp+0x770]
- 0xe9f027: lea    rdi,[rsp+0x770]
- 0xe9f064: lea    rsi,[rsp+0x770]
- 0xe9f071: lea    rdi,[rsp+0x770]
- 0xe9f0a9: lea    rdi,[rsp+0x770]
- 0xe9f0e6: lea    rsi,[rsp+0x770]
- 0xe9f0f3: lea    rdi,[rsp+0x770]
- 0xe9f17d: lea    rdi,[rsp+0x770]
- 0xe9f192: lea    rdi,[rsp+0x770]
- 0xe9f1bf: lea    rdi,[rsp+0x770]
- 0xe9f201: lea    rsi,[rsp+0x770]
- 0xe9f20e: lea    rdi,[rsp+0x770]
- 0xe9f2f8: lea    r15,[rsp+0x770]
- 0xe9f357: lea    rdi,[rsp+0x770]
- 0xe9f42f: lea    rdi,[rsp+0x770]
- 0xe9f47e: lea    rsi,[rsp+0x770]
- 0xe9f48b: lea    rdi,[rsp+0x770]
- 0xe9f4c3: lea    rdi,[rsp+0x770]
- 0xe9f4fd: lea    rsi,[rsp+0x770]
- 0xe9f50a: lea    rdi,[rsp+0x770]
- 0xe9f5d5: lea    rdi,[rsp+0x770]
- 0xe9f61c: lea    rsi,[rsp+0x770]
- 0xe9f629: lea    rdi,[rsp+0x770]
- 0xe9f675: lea    rdi,[rsp+0x770]
- 0xe9f6b5: lea    rsi,[rsp+0x770]
- 0xe9f6c2: lea    rdi,[rsp+0x770]
- 0xe9f718: lea    rdi,[rsp+0x770]
- 0xe9f752: lea    rsi,[rsp+0x770]
- 0xe9f75f: lea    rdi,[rsp+0x770]
- 0xe9f79a: lea    rdi,[rsp+0x770]
- 0xe9f7b7: lea    rsi,[rsp+0x770]
- 0xe9f7c4: lea    rdi,[rsp+0x770]
- 0xe9f8c1: lea    rdi,[rsp+0x770]
- 0xe9f8ff: lea    rsi,[rsp+0x770]
- 0xe9f90c: lea    rdi,[rsp+0x770]
- 0xe9f963: lea    rbx,[rsp+0x770]
- 0xe9f9ac: lea    rdi,[rsp+0x770]
- 0xe9ff2f: movaps xmm0,XMMWORD PTR [rsp+0x770]
- 0xea0381: lea    rdi,[rsp+0x770]
- 0xea05fa: lea    r15,[rsp+0x770]
- 0xea0668: lea    rdi,[rsp+0x770]
- 0xea06aa: lea    rdi,[rsp+0x770]
- 0xea06e4: lea    rsi,[rsp+0x770]
- 0xea06f1: lea    rdi,[rsp+0x770]
- 0xea0705: lea    rdi,[rsp+0x770]
- 0xea0712: lea    rsi,[rsp+0x770]
- 0xea0737: lea    rdi,[rsp+0x770]
- 0xea0870: lea    rdi,[rsp+0x770]
- 0xea091e: lea    rdi,[rsp+0x770]
- 0xea0935: lea    rdi,[rsp+0x770]
- 0xea0a36: lea    rdi,[rsp+0x770]
- 0xea0b11: lea    rdi,[rsp+0x770]
- 0xea0b34: lea    rdi,[rsp+0x770]
- 0xea0b8b: lea    rdi,[rsp+0x770]
- 0xea0c3c: lea    rdi,[rsp+0x770]
- 0xea0c6c: lea    rdi,[rsp+0x770]
- 0xea0ca1: lea    rdi,[rsp+0x770]
- 0xea0e0b: lea    rdi,[rsp+0x770]
- 0xea0ff0: lea    rdi,[rsp+0x770]
- 0xea100f: lea    rdi,[rsp+0x770]
- 0xea104e: lea    rdi,[rsp+0x770]
- 0xea1141: lea    rdi,[rsp+0x770]
- 0xea116f: lea    rdi,[rsp+0x770]
- 0xea1204: lea    rdi,[rsp+0x770]
- 0xea12a6: lea    rdi,[rsp+0x770]
- 0xea13d5: lea    rdi,[rsp+0x770]
- 0xea14bc: lea    rbx,[rsp+0x770]
- 0xea152b: lea    rdi,[rsp+0x770]
- 0xea1544: lea    rdi,[rsp+0x770]
- 0xea156f: lea    rdi,[rsp+0x770]
- 0xea15ef: lea    rdi,[rsp+0x770]
- 0xea1661: lea    rdi,[rsp+0x770]
- 0xea17c9: lea    rdi,[rsp+0x770]
- 0xea194d: lea    rdi,[rsp+0x770]
- 0xea1d74: lea    rdi,[rsp+0x770]

### rsp+0x778: 20 refs
- 0xe99e31: mov    rdi,QWORD PTR [rsp+0x778]
- 0xe9bd57: mov    rdi,QWORD PTR [rsp+0x778]
- 0xe9bdbf: movdqu XMMWORD PTR [rsp+0x778],xmm0
- 0xe9bdcf: movq   QWORD PTR [rsp+0x778],xmm0
- 0xe9bed3: movups XMMWORD PTR [rsp+0x778],xmm0
- 0xe9beef: movups XMMWORD PTR [rsp+0x778],xmm0
- 0xe9bfe1: movdqu XMMWORD PTR [rsp+0x778],xmm0
- 0xe9bff1: movq   QWORD PTR [rsp+0x778],xmm0
- 0xe9c300: mov    rdi,QWORD PTR [rsp+0x778]
- 0xe9c3e7: mov    QWORD PTR [rsp+0x778],rax
- 0xe9c4a7: movdqu XMMWORD PTR [rsp+0x778],xmm0
- 0xe9c4b7: movq   QWORD PTR [rsp+0x778],xmm0
- 0xe9c5ba: movdqu XMMWORD PTR [rsp+0x778],xmm0
- 0xe9c5ca: movq   QWORD PTR [rsp+0x778],xmm0
- 0xe9c6cd: mov    QWORD PTR [rsp+0x778],rcx
- 0xe9c7f0: mov    rdi,QWORD PTR [rsp+0x778]
- 0xea158b: mov    rdi,QWORD PTR [rsp+0x778]
- 0xea15c2: mov    rdi,QWORD PTR [rsp+0x778]
- 0xea1b74: mov    rdi,QWORD PTR [rsp+0x778]
- 0xea1f0e: mov    rdi,QWORD PTR [rsp+0x778]

### rsp+0x780: 9 refs
- 0xe9ad02: lea    r14,[rsp+0x780]
- 0xe9bdd8: and    QWORD PTR [rsp+0x780],0x0
- 0xe9bffa: and    QWORD PTR [rsp+0x780],0x0
- 0xe9c4c0: and    QWORD PTR [rsp+0x780],0x0
- 0xe9c5d3: and    QWORD PTR [rsp+0x780],0x0
- 0xe9c6d5: mov    QWORD PTR [rsp+0x780],rax
- 0xe9c8ef: lea    rbp,[rsp+0x780]
- 0xe9d26f: lea    r12,[rsp+0x780]
- 0xe9ff45: movaps xmm0,XMMWORD PTR [rsp+0x780]

### rsp+0x788: 3 refs
- 0xe9befb: mov    QWORD PTR [rsp+0x788],rcx
- 0xe9ff3d: mov    rax,QWORD PTR [rsp+0x788]
- 0xea0ee2: mov    rdi,QWORD PTR [rsp+0x788]

### rsp+0x790: 16 refs
- 0xe9b5c8: and    QWORD PTR [rsp+0x790],0x0
- 0xe9b72b: and    QWORD PTR [rsp+0x790],0x0
- 0xe9b954: mov    QWORD PTR [rsp+0x790],rax
- 0xe9b974: mov    rax,QWORD PTR [rsp+0x790]
- 0xe9b991: lea    rbx,[rsp+0x790]
- 0xe9ba25: lea    r14,[rsp+0x790]
- 0xe9bab2: mov    QWORD PTR [rsp+0x790],r12
- 0xe9bdf4: mov    QWORD PTR [rsp+0x790],rbx
- 0xe9bf03: mov    QWORD PTR [rsp+0x790],rbx
- 0xe9c016: mov    QWORD PTR [rsp+0x790],rbx
- 0xe9c33e: mov    QWORD PTR [rsp+0x790],r13
- 0xe9c3ef: mov    QWORD PTR [rsp+0x790],r13
- 0xe9c4dc: mov    QWORD PTR [rsp+0x790],r13
- 0xe9c5ef: mov    QWORD PTR [rsp+0x790],r13
- 0xe9c6dd: mov    QWORD PTR [rsp+0x790],r13
- 0xe9ff65: movaps xmm0,XMMWORD PTR [rsp+0x790]

### rsp+0x798: 3 refs
- 0xe9baba: mov    QWORD PTR [rsp+0x798],r15
- 0xe9ff5d: mov    rax,QWORD PTR [rsp+0x798]
- 0xea0ed5: mov    rdi,QWORD PTR [rsp+0x798]

## Context for every rsp+0xea0 use
### 0xe9b0b9: mov    QWORD PTR [rsp+0xea0],r15
      e9b069:	e8 92 2e 95 00       	call   17edf00 <_Znwm@plt>
      e9b06e:	48 8d 0d 3b e3 99 00 	lea    rcx,[rip+0x99e33b]        # 18393b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb348>
      e9b075:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9b078:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      e9b07c:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
      e9b080:	4d 85 ff             	test   r15,r15
      e9b083:	74 05                	je     e9b08a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x624a0>
      e9b085:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9b08a:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9b08f:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
      e9b093:	48 85 db             	test   rbx,rbx
      e9b096:	74 05                	je     e9b09d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x624b3>
      e9b098:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9b09d:	40 88 68 28          	mov    BYTE PTR [rax+0x28],bpl
      e9b0a1:	48 89 84 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rax
      e9b0a8:	00 
      e9b0a9:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9b0b0:	00 
      e9b0b1:	e8 5a 7a c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e9b0b6:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
      e9b0b9:	4c 89 bc 24 a0 0e 00 	mov    QWORD PTR [rsp+0xea0],r15
      e9b0c0:	00 
      e9b0c1:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
      e9b0c5:	4c 89 b4 24 a8 0e 00 	mov    QWORD PTR [rsp+0xea8],r14
      e9b0cc:	00 
      e9b0cd:	4d 85 f6             	test   r14,r14
      e9b0d0:	74 05                	je     e9b0d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x624ed>
      e9b0d2:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9b0d7:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9b0dd:	f3 0f 7f 84 24 b0 0e 	movdqu XMMWORD PTR [rsp+0xeb0],xmm0
      e9b0e4:	00 00 
      e9b0e6:	48 85 db             	test   rbx,rbx
      e9b0e9:	74 05                	je     e9b0f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62506>
      e9b0eb:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9b0f0:	40 88 ac 24 c0 0e 00 	mov    BYTE PTR [rsp+0xec0],bpl
      e9b0f7:	00 
      e9b0f8:	6a 30                	push   0x30
      e9b0fa:	5f                   	pop    rdi
      e9b0fb:	e8 00 2e 95 00       	call   17edf00 <_Znwm@plt>
      e9b100:	48 8d 0d a9 e2 99 00 	lea    rcx,[rip+0x99e2a9]        # 18393b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb348>
      e9b107:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9b10a:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
      e9b10e:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
      e9b112:	4d 85 f6             	test   r14,r14
      e9b115:	74 05                	je     e9b11c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62532>
      e9b117:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9b11c:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9b122:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
      e9b127:	48 85 db             	test   rbx,rbx
      e9b12a:	74 05                	je     e9b131 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62547>
      e9b12c:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9b131:	40 88 68 28          	mov    BYTE PTR [rax+0x28],bpl
      e9b135:	48 89 84 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rax
      e9b13c:	00 
      e9b13d:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9b144:	00 
      e9b145:	e8 c6 79 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e9b14a:	48 8d 35 bf 9e 53 ff 	lea    rsi,[rip+0xffffffffff539ebf]        # 3d5010 <_ZTSN5boost17bad_function_callE@@Base+0x2356>
      e9b151:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      e9b158:	00 
      e9b159:	e8 e2 2d 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9b15e:	48 8d ac 24 30 0b 00 	lea    rbp,[rsp+0xb30]
      e9b165:	00 
      e9b166:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9b16d:	00 
      e9b16e:	48 89 ef             	mov    rdi,rbp

### 0xe9b13d: lea    rdi,[rsp+0xea0]
      e9b0f0:	40 88 ac 24 c0 0e 00 	mov    BYTE PTR [rsp+0xec0],bpl
      e9b0f7:	00 
      e9b0f8:	6a 30                	push   0x30
      e9b0fa:	5f                   	pop    rdi
      e9b0fb:	e8 00 2e 95 00       	call   17edf00 <_Znwm@plt>
      e9b100:	48 8d 0d a9 e2 99 00 	lea    rcx,[rip+0x99e2a9]        # 18393b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb348>
      e9b107:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9b10a:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
      e9b10e:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
      e9b112:	4d 85 f6             	test   r14,r14
      e9b115:	74 05                	je     e9b11c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62532>
      e9b117:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9b11c:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9b122:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
      e9b127:	48 85 db             	test   rbx,rbx
      e9b12a:	74 05                	je     e9b131 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62547>
      e9b12c:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9b131:	40 88 68 28          	mov    BYTE PTR [rax+0x28],bpl
      e9b135:	48 89 84 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rax
      e9b13c:	00 
      e9b13d:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9b144:	00 
      e9b145:	e8 c6 79 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e9b14a:	48 8d 35 bf 9e 53 ff 	lea    rsi,[rip+0xffffffffff539ebf]        # 3d5010 <_ZTSN5boost17bad_function_callE@@Base+0x2356>
      e9b151:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      e9b158:	00 
      e9b159:	e8 e2 2d 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9b15e:	48 8d ac 24 30 0b 00 	lea    rbp,[rsp+0xb30]
      e9b165:	00 
      e9b166:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9b16d:	00 
      e9b16e:	48 89 ef             	mov    rdi,rbp
      e9b171:	e8 9c dc ce ff       	call   b88e12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5db2>
      e9b176:	4c 8d ac 24 d0 0e 00 	lea    r13,[rsp+0xed0]
      e9b17d:	00 
      e9b17e:	4c 8d b4 24 00 0d 00 	lea    r14,[rsp+0xd00]
      e9b185:	00 
      e9b186:	4c 89 ef             	mov    rdi,r13
      e9b189:	4c 89 f6             	mov    rsi,r14
      e9b18c:	e8 c5 dc ce ff       	call   b88e56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5df6>
      e9b191:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9b198:	00 
      e9b199:	4c 8d bc 24 d0 0c 00 	lea    r15,[rsp+0xcd0]
      e9b1a0:	00 
      e9b1a1:	4c 89 e7             	mov    rdi,r12
      e9b1a4:	4c 89 fe             	mov    rsi,r15
      e9b1a7:	48 89 ea             	mov    rdx,rbp
      e9b1aa:	4c 89 e9             	mov    rcx,r13
      e9b1ad:	e8 94 cf ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9b1b2:	4c 89 ef             	mov    rdi,r13
      e9b1b5:	e8 b0 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b1ba:	48 89 ef             	mov    rdi,rbp
      e9b1bd:	e8 a8 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b1c2:	4c 89 ff             	mov    rdi,r15
      e9b1c5:	e8 c6 2c 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9b1ca:	4c 89 f7             	mov    rdi,r14
      e9b1cd:	e8 98 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b1d2:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9b1d9:	00 
      e9b1da:	e8 8b ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b1df:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9b1e6:	00 
      e9b1e7:	4c 89 e6             	mov    rsi,r12
      e9b1ea:	e8 09 3f ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9b1ef:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9b1f6:	00 

### 0xe9b2d5: lea    rax,[rsp+0xea0]
      e9b27d:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
      e9b282:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9b286:	48 85 c0             	test   rax,rax
      e9b289:	74 05                	je     e9b290 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x626a6>
      e9b28b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9b290:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
      e9b297:	00 
      e9b298:	4c 8b b4 24 98 13 00 	mov    r14,QWORD PTR [rsp+0x1398]
      e9b29f:	00 
      e9b2a0:	48 8d 05 39 36 97 00 	lea    rax,[rip+0x973639]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e9b2a7:	48 89 84 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rax
      e9b2ae:	00 
      e9b2af:	48 8b 05 f2 67 a1 00 	mov    rax,QWORD PTR [rip+0xa167f2]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
      e9b2b6:	48 89 84 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],rax
      e9b2bd:	00 
      e9b2be:	48 8d 84 24 e0 03 00 	lea    rax,[rsp+0x3e0]
      e9b2c5:	00 
      e9b2c6:	48 89 84 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rax
      e9b2cd:	00 
      e9b2ce:	48 8d 0d 0b 36 97 00 	lea    rcx,[rip+0x97360b]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e9b2d5:	48 8d 84 24 a0 0e 00 	lea    rax,[rsp+0xea0]
      e9b2dc:	00 
      e9b2dd:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9b2e0:	48 8d 0d 3b 25 91 00 	lea    rcx,[rip+0x91253b]        # 17ad822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16198e>
      e9b2e7:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e9b2eb:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e9b2ef:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e9b2f6:	00 
      e9b2f7:	e8 70 b0 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e9b2fc:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      e9b303:	00 
      e9b304:	48 89 de             	mov    rsi,rbx
      e9b307:	e8 a4 b0 00 00       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
      e9b30c:	48 8d 05 3d 83 97 00 	lea    rax,[rip+0x97833d]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>
      e9b313:	48 8d 8c 24 80 05 00 	lea    rcx,[rsp+0x580]
      e9b31a:	00 
      e9b31b:	48 89 01             	mov    QWORD PTR [rcx],rax
      e9b31e:	48 8d 05 88 d3 05 00 	lea    rax,[rip+0x5d388]        # ef86ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbfac3>
      e9b325:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
      e9b329:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      e9b32d:	48 8b 84 24 80 12 00 	mov    rax,QWORD PTR [rsp+0x1280]
      e9b334:	00 
      e9b335:	f3 0f 6f 08          	movdqu xmm1,XMMWORD PTR [rax]
      e9b339:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9b33d:	48 85 c0             	test   rax,rax
      e9b340:	74 05                	je     e9b347 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6275d>
      e9b342:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9b347:	41 80 7e 01 00       	cmp    BYTE PTR [r14+0x1],0x0
      e9b34c:	66 48 0f 3a 16 8c 24 	pextrq QWORD PTR [rsp+0x90],xmm1,0x1
      e9b353:	90 00 00 00 01 
      e9b358:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
      e9b35e:	66 48 0f 3a 16 84 24 	pextrq QWORD PTR [rsp+0x88],xmm0,0x1
      e9b365:	88 00 00 00 01 
      e9b36a:	74 1a                	je     e9b386 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6279c>
      e9b36c:	6a 08                	push   0x8
      e9b36e:	5f                   	pop    rdi
      e9b36f:	e8 8c 2b 95 00       	call   17edf00 <_Znwm@plt>
      e9b374:	48 89 c3             	mov    rbx,rax
      e9b377:	48 8d 05 32 5b 9c 00 	lea    rax,[rip+0x9c5b32]        # 1860eb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d598>
      e9b37e:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9b381:	e9 74 08 00 00       	jmp    e9bbfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63010>
      e9b386:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
      e9b38d:	00 
      e9b38e:	48 8b 00             	mov    rax,QWORD PTR [rax]
      e9b391:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      e9b398:	00 

### 0xe9ca1f: lea    rsi,[rsp+0xea0]
      e9c9cb:	4c 8b bc 24 b8 00 00 	mov    r15,QWORD PTR [rsp+0xb8]
      e9c9d2:	00 
      e9c9d3:	74 05                	je     e9c9da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63df0>
      e9c9d5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9c9da:	48 8d bc 24 c0 08 00 	lea    rdi,[rsp+0x8c0]
      e9c9e1:	00 
      e9c9e2:	48 8d b4 24 d0 06 00 	lea    rsi,[rsp+0x6d0]
      e9c9e9:	00 
      e9c9ea:	e8 3d c5 05 00       	call   ef8f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0342>
      e9c9ef:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
      e9c9f4:	66 48 0f 6e c0       	movq   xmm0,rax
      e9c9f9:	f3 0f 7e 4c 24 70    	movq   xmm1,QWORD PTR [rsp+0x70]
      e9c9ff:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9ca03:	48 83 c0 08          	add    rax,0x8
      e9ca07:	48 8d bc 24 80 09 00 	lea    rdi,[rsp+0x980]
      e9ca0e:	00 
      e9ca0f:	66 0f 7f 4f e0       	movdqa XMMWORD PTR [rdi-0x20],xmm1
      e9ca14:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e9ca18:	8a 44 24 27          	mov    al,BYTE PTR [rsp+0x27]
      e9ca1c:	88 47 f0             	mov    BYTE PTR [rdi-0x10],al
      e9ca1f:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9ca26:	00 
      e9ca27:	e8 64 d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9ca2c:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      e9ca31:	66 48 0f 6e c0       	movq   xmm0,rax
      e9ca36:	f3 0f 7e 8c 24 30 01 	movq   xmm1,QWORD PTR [rsp+0x130]
      e9ca3d:	00 00 
      e9ca3f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9ca43:	48 8d bc 24 c0 09 00 	lea    rdi,[rsp+0x9c0]
      e9ca4a:	00 
      e9ca4b:	66 0f 7f 4f f0       	movdqa XMMWORD PTR [rdi-0x10],xmm1
      e9ca50:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ca55:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ca5c:	00 
      e9ca5d:	e8 2e d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9ca62:	48 8d bc 24 f0 09 00 	lea    rdi,[rsp+0x9f0]
      e9ca69:	00 
      e9ca6a:	48 8d b4 24 e0 03 00 	lea    rsi,[rsp+0x3e0]
      e9ca71:	00 
      e9ca72:	e8 19 d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9ca77:	66 49 0f 6e cf       	movq   xmm1,r15
      e9ca7c:	f3 0f 7e 84 24 40 01 	movq   xmm0,QWORD PTR [rsp+0x140]
      e9ca83:	00 00 
      e9ca85:	48 8b 8c 24 40 13 00 	mov    rcx,QWORD PTR [rsp+0x1340]
      e9ca8c:	00 
      e9ca8d:	0f 28 54 24 40       	movaps xmm2,XMMWORD PTR [rsp+0x40]
      e9ca92:	0f 29 94 24 20 0a 00 	movaps XMMWORD PTR [rsp+0xa20],xmm2
      e9ca99:	00 
      e9ca9a:	48 8b 84 24 38 01 00 	mov    rax,QWORD PTR [rsp+0x138]
      e9caa1:	00 
      e9caa2:	48 85 c0             	test   rax,rax
      e9caa5:	74 05                	je     e9caac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63ec2>
      e9caa7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9caac:	49 83 c7 08          	add    r15,0x8
      e9cab0:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
      e9cab4:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9cab8:	0f 10 09             	movups xmm1,XMMWORD PTR [rcx]
      e9cabb:	0f 29 8c 24 30 0a 00 	movaps XMMWORD PTR [rsp+0xa30],xmm1
      e9cac2:	00 
      e9cac3:	48 85 c0             	test   rax,rax
      e9cac6:	74 05                	je     e9cacd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63ee3>
      e9cac8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9cacd:	66 0f 7f 84 24 40 0a 	movdqa XMMWORD PTR [rsp+0xa40],xmm0
      e9cad4:	00 00 
      e9cad6:	f0 49 ff 07          	lock inc QWORD PTR [r15]
      e9cada:	48 8b 8c 24 98 12 00 	mov    rcx,QWORD PTR [rsp+0x1298]

### 0xe9d1a2: lea    rdi,[rsp+0xea0]
      e9d148:	e8 39 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d14d:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e9d152:	e8 2f 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d157:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e9d15e:	00 
      e9d15f:	e8 22 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d164:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      e9d169:	e8 18 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d16e:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      e9d175:	00 
      e9d176:	e8 0b 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d17b:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      e9d182:	00 
      e9d183:	e8 e2 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d188:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      e9d18f:	00 
      e9d190:	e8 d5 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d195:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e9d19c:	00 
      e9d19d:	e8 c8 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1a2:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9d1a9:	00 
      e9d1aa:	e8 bb cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1af:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9d1b6:	00 
      e9d1b7:	e8 ae cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1bc:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      e9d1c3:	00 
      e9d1c4:	e8 bd 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d1c9:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9d1d0:	00 
      e9d1d1:	48 89 ef             	mov    rdi,rbp
      e9d1d4:	e8 91 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1d9:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      e9d1e0:	00 
      e9d1e1:	e8 84 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1e6:	48 8b 4c 24 78       	mov    rcx,QWORD PTR [rsp+0x78]
      e9d1eb:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e9d1f0:	48 8d 05 b9 44 99 00 	lea    rax,[rip+0x9944b9]        # 18316b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3648>
      e9d1f7:	49 89 06             	mov    QWORD PTR [r14],rax
      e9d1fa:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e9d1ff:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      e9d203:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
      e9d207:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
      e9d20b:	31 ff                	xor    edi,edi
      e9d20d:	e8 74 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d212:	48 8d 05 37 64 97 00 	lea    rax,[rip+0x976437]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>
      e9d219:	48 89 84 24 20 05 00 	mov    QWORD PTR [rsp+0x520],rax
      e9d220:	00 
      e9d221:	48 8d 05 a0 81 06 00 	lea    rax,[rip+0x681a0]        # f053c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc7de>
      e9d228:	48 89 84 24 28 05 00 	mov    QWORD PTR [rsp+0x528],rax
      e9d22f:	00 
      e9d230:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
      e9d237:	00 
      e9d238:	48 89 b4 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rsi
      e9d23f:	00 
      e9d240:	48 8d 05 b1 44 99 00 	lea    rax,[rip+0x9944b1]        # 18316f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3690>
      e9d247:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9d24a:	4c 8b b4 24 e8 12 00 	mov    r14,QWORD PTR [rsp+0x12e8]
      e9d251:	00 
      e9d252:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
      e9d256:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
      e9d25a:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
      e9d261:	00 
      e9d262:	e8 29 d0 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d267:	44 8b bc 24 48 07 00 	mov    r15d,DWORD PTR [rsp+0x748]

### 0xe9d4d1: lea    rax,[rsp+0xea0]
      e9d47f:	48 8d bc 24 30 11 00 	lea    rdi,[rsp+0x1130]
      e9d486:	00 
      e9d487:	48 8b b4 24 c0 12 00 	mov    rsi,QWORD PTR [rsp+0x12c0]
      e9d48e:	00 
      e9d48f:	e8 fc cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d494:	4c 8d a4 24 60 11 00 	lea    r12,[rsp+0x1160]
      e9d49b:	00 
      e9d49c:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
      e9d4a3:	00 
      e9d4a4:	4c 89 e7             	mov    rdi,r12
      e9d4a7:	e8 e4 cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d4ac:	44 89 ac 24 90 11 00 	mov    DWORD PTR [rsp+0x1190],r13d
      e9d4b3:	00 
      e9d4b4:	c6 84 24 94 11 00 00 	mov    BYTE PTR [rsp+0x1194],0x1
      e9d4bb:	01 
      e9d4bc:	bf 50 01 00 00       	mov    edi,0x150
      e9d4c1:	e8 3a 0a 95 00       	call   17edf00 <_Znwm@plt>
      e9d4c6:	49 89 c5             	mov    r13,rax
      e9d4c9:	48 89 84 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rax
      e9d4d0:	00 
      e9d4d1:	48 8d 84 24 a0 0e 00 	lea    rax,[rsp+0xea0]
      e9d4d8:	00 
      e9d4d9:	48 89 84 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],rax
      e9d4e0:	00 
      e9d4e1:	48 c7 84 24 f0 03 00 	mov    QWORD PTR [rsp+0x3f0],0x1
      e9d4e8:	00 01 00 00 00 
      e9d4ed:	48 8d 05 9c a6 99 00 	lea    rax,[rip+0x99a69c]        # 1837b90 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x9b28>
      e9d4f4:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      e9d4f8:	48 8b 84 24 60 10 00 	mov    rax,QWORD PTR [rsp+0x1060]
      e9d4ff:	00 
      e9d500:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      e9d504:	4d 8d 7d 20          	lea    r15,[r13+0x20]
      e9d508:	4c 89 ff             	mov    rdi,r15
      e9d50b:	48 89 de             	mov    rsi,rbx
      e9d50e:	e8 7d cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d513:	49 8d 5d 50          	lea    rbx,[r13+0x50]
      e9d517:	48 89 df             	mov    rdi,rbx
      e9d51a:	4c 89 f6             	mov    rsi,r14
      e9d51d:	e8 6e cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d522:	4d 8d b5 80 00 00 00 	lea    r14,[r13+0x80]
      e9d529:	4c 89 f7             	mov    rdi,r14
      e9d52c:	48 89 ee             	mov    rsi,rbp
      e9d52f:	e8 5c cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d534:	49 8d ad b0 00 00 00 	lea    rbp,[r13+0xb0]
      e9d53b:	48 89 ef             	mov    rdi,rbp
      e9d53e:	48 8d b4 24 00 11 00 	lea    rsi,[rsp+0x1100]
      e9d545:	00 
      e9d546:	e8 45 cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d54b:	49 8d bd e0 00 00 00 	lea    rdi,[r13+0xe0]
      e9d552:	48 8d b4 24 30 11 00 	lea    rsi,[rsp+0x1130]
      e9d559:	00 
      e9d55a:	e8 31 cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d55f:	48 8d 9c 24 90 11 00 	lea    rbx,[rsp+0x1190]
      e9d566:	00 
      e9d567:	4c 89 ef             	mov    rdi,r13
      e9d56a:	48 81 c7 10 01 00 00 	add    rdi,0x110
      e9d571:	4c 89 e6             	mov    rsi,r12
      e9d574:	e8 2b b3 06 00       	call   f088a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcba>
      e9d579:	8a 43 04             	mov    al,BYTE PTR [rbx+0x4]
      e9d57c:	41 88 85 44 01 00 00 	mov    BYTE PTR [r13+0x144],al
      e9d583:	8b 03                	mov    eax,DWORD PTR [rbx]
      e9d585:	41 89 85 40 01 00 00 	mov    DWORD PTR [r13+0x140],eax
      e9d58c:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9d593:	00 
      e9d594:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9d598:	4c 89 ac 24 f0 0e 00 	mov    QWORD PTR [rsp+0xef0],r13

### 0xe9d5e1: lea    r13,[rsp+0xea0]
      e9d58c:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9d593:	00 
      e9d594:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9d598:	4c 89 ac 24 f0 0e 00 	mov    QWORD PTR [rsp+0xef0],r13
      e9d59f:	00 
      e9d5a0:	e8 25 cd bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9d5a5:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9d5ac:	00 
      e9d5ad:	e8 36 b3 06 00       	call   f088e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcfe>
      e9d5b2:	48 8d 35 c7 79 53 ff 	lea    rsi,[rip+0xffffffffff5379c7]        # 3d4f80 <_ZTSN5boost17bad_function_callE@@Base+0x22c6>
      e9d5b9:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9d5c0:	00 
      e9d5c1:	e8 7a 09 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9d5c6:	4c 8d a4 24 e0 03 00 	lea    r12,[rsp+0x3e0]
      e9d5cd:	00 
      e9d5ce:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9d5d5:	00 
      e9d5d6:	4c 89 e7             	mov    rdi,r12
      e9d5d9:	4c 89 f6             	mov    rsi,r14
      e9d5dc:	e8 31 b8 ce ff       	call   b88e12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5db2>
      e9d5e1:	4c 8d ac 24 a0 0e 00 	lea    r13,[rsp+0xea0]
      e9d5e8:	00 
      e9d5e9:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9d5f0:	00 
      e9d5f1:	4c 89 ef             	mov    rdi,r13
      e9d5f4:	48 89 ee             	mov    rsi,rbp
      e9d5f7:	e8 5a b8 ce ff       	call   b88e56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5df6>
      e9d5fc:	4c 8d bc 24 00 0d 00 	lea    r15,[rsp+0xd00]
      e9d603:	00 
      e9d604:	48 8d 9c 24 b0 03 00 	lea    rbx,[rsp+0x3b0]
      e9d60b:	00 
      e9d60c:	4c 89 ff             	mov    rdi,r15
      e9d60f:	48 89 de             	mov    rsi,rbx
      e9d612:	4c 89 e2             	mov    rdx,r12
      e9d615:	4c 89 e9             	mov    rcx,r13
      e9d618:	e8 29 ab ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9d61d:	4c 89 ef             	mov    rdi,r13
      e9d620:	e8 45 c9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d625:	4c 89 e7             	mov    rdi,r12
      e9d628:	e8 3d c9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d62d:	48 89 df             	mov    rdi,rbx
      e9d630:	e8 5b 08 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9d635:	48 89 ef             	mov    rdi,rbp
      e9d638:	e8 2d c9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d63d:	4c 89 f7             	mov    rdi,r14
      e9d640:	e8 25 c9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d645:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9d64c:	00 
      e9d64d:	4c 89 fe             	mov    rsi,r15
      e9d650:	e8 a3 1a ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9d655:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9d65c:	00 
      e9d65d:	e8 0c ac ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9d662:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
      e9d669:	00 
      e9d66a:	e8 fb c8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d66f:	4c 8d b4 24 d0 0c 00 	lea    r14,[rsp+0xcd0]
      e9d676:	00 
      e9d677:	4c 89 f7             	mov    rdi,r14
      e9d67a:	e8 eb c8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d67f:	48 8b 84 24 98 13 00 	mov    rax,QWORD PTR [rsp+0x1398]
      e9d686:	00 
      e9d687:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e9d68b:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      e9d690:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
      e9d695:	48 8b 9c 24 48 12 00 	mov    rbx,QWORD PTR [rsp+0x1248]

### 0xe9db11: lea    r13,[rsp+0xea0]
      e9dabb:	4c 89 fe             	mov    rsi,r15
      e9dabe:	e8 3d 89 e2 ff       	call   cc6400 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2133a0>
      e9dac3:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
      e9daca:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
      e9dad1:	00 
      e9dad2:	4c 89 a4 24 f0 0e 00 	mov    QWORD PTR [rsp+0xef0],r12
      e9dad9:	00 
      e9dada:	4c 89 ef             	mov    rdi,r13
      e9dadd:	e8 ea 27 d4 ff       	call   be02cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d26c>
      e9dae2:	48 8d 35 9f 75 53 ff 	lea    rsi,[rip+0xffffffffff53759f]        # 3d5088 <_ZTSN5boost17bad_function_callE@@Base+0x23ce>
      e9dae9:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9daf0:	00 
      e9daf1:	e8 4a 04 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9daf6:	4c 8d a4 24 e0 03 00 	lea    r12,[rsp+0x3e0]
      e9dafd:	00 
      e9dafe:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9db05:	00 
      e9db06:	4c 89 e7             	mov    rdi,r12
      e9db09:	4c 89 f6             	mov    rsi,r14
      e9db0c:	e8 01 b3 ce ff       	call   b88e12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5db2>
      e9db11:	4c 8d ac 24 a0 0e 00 	lea    r13,[rsp+0xea0]
      e9db18:	00 
      e9db19:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9db20:	00 
      e9db21:	4c 89 ef             	mov    rdi,r13
      e9db24:	48 89 ee             	mov    rsi,rbp
      e9db27:	e8 2a b3 ce ff       	call   b88e56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5df6>
      e9db2c:	4c 8d bc 24 00 0d 00 	lea    r15,[rsp+0xd00]
      e9db33:	00 
      e9db34:	48 8d 9c 24 b0 03 00 	lea    rbx,[rsp+0x3b0]
      e9db3b:	00 
      e9db3c:	4c 89 ff             	mov    rdi,r15
      e9db3f:	48 89 de             	mov    rsi,rbx
      e9db42:	4c 89 e2             	mov    rdx,r12
      e9db45:	4c 89 e9             	mov    rcx,r13
      e9db48:	e8 f9 a5 ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9db4d:	4c 89 ef             	mov    rdi,r13
      e9db50:	e8 15 c4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9db55:	4c 89 e7             	mov    rdi,r12
      e9db58:	e8 0d c4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9db5d:	48 89 df             	mov    rdi,rbx
      e9db60:	e8 2b 03 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9db65:	48 89 ef             	mov    rdi,rbp
      e9db68:	e8 fd c3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9db6d:	4c 89 f7             	mov    rdi,r14
      e9db70:	e8 f5 c3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9db75:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9db7c:	00 
      e9db7d:	4c 89 fe             	mov    rsi,r15
      e9db80:	e8 73 15 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9db85:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9db8c:	00 
      e9db8d:	e8 dc a6 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9db92:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
      e9db99:	00 
      e9db9a:	e8 cb c3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9db9f:	48 8d bc 24 90 04 00 	lea    rdi,[rsp+0x490]
      e9dba6:	00 
      e9dba7:	e8 be c3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9dbac:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
      e9dbb3:	00 
      e9dbb4:	e8 b1 c3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9dbb9:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      e9dbc0:	00 
      e9dbc1:	e8 a4 c3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9dbc6:	4c 8d b4 24 d0 0c 00 	lea    r14,[rsp+0xcd0]

### 0xe9e0b2: lea    r15,[rsp+0xea0]
      e9e05b:	48 c7 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],0x1
      e9e062:	00 01 00 00 00 
      e9e067:	48 8d 05 ea a5 9d 00 	lea    rax,[rip+0x9da5ea]        # 1878658 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34d40>
      e9e06e:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9e071:	48 89 df             	mov    rdi,rbx
      e9e074:	48 83 c7 10          	add    rdi,0x10
      e9e078:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9e07f:	00 
      e9e080:	e8 a7 aa 61 00       	call   14b8b2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0b0>
      e9e085:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      e9e08c:	00 
      e9e08d:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9e091:	4c 8d b4 24 d0 0c 00 	lea    r14,[rsp+0xcd0]
      e9e098:	00 
      e9e099:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx
      e9e09d:	e8 28 c2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9e0a2:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9e0a9:	00 
      e9e0aa:	48 8d 9c 24 88 01 00 	lea    rbx,[rsp+0x188]
      e9e0b1:	00 
      e9e0b2:	4c 8d bc 24 a0 0e 00 	lea    r15,[rsp+0xea0]
      e9e0b9:	00 
      e9e0ba:	48 89 de             	mov    rsi,rbx
      e9e0bd:	4c 89 fa             	mov    rdx,r15
      e9e0c0:	4c 89 f1             	mov    rcx,r14
      e9e0c3:	e8 7e a0 ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9e0c8:	4c 89 f7             	mov    rdi,r14
      e9e0cb:	e8 9a be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e0d0:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e0d7:	00 
      e9e0d8:	e8 75 aa 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      e9e0dd:	4c 89 ff             	mov    rdi,r15
      e9e0e0:	e8 85 be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e0e5:	4c 8d a4 24 00 0d 00 	lea    r12,[rsp+0xd00]
      e9e0ec:	00 
      e9e0ed:	4c 89 e7             	mov    rdi,r12
      e9e0f0:	e8 5d aa 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      e9e0f5:	48 89 df             	mov    rdi,rbx
      e9e0f8:	e8 93 fd 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e0fd:	4c 8d ac 24 60 10 00 	lea    r13,[rsp+0x1060]
      e9e104:	00 
      e9e105:	4c 89 ef             	mov    rdi,r13
      e9e108:	e8 45 aa 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      e9e10d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e114:	00 
      e9e115:	e8 38 aa 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      e9e11a:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      e9e121:	00 
      e9e122:	e8 2b aa 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      e9e127:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      e9e12e:	00 
      e9e12f:	e8 36 be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e134:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
      e9e13b:	00 
      e9e13c:	e8 29 be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e141:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
      e9e148:	00 
      e9e149:	e8 1c be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e14e:	48 89 ef             	mov    rdi,rbp
      e9e151:	e8 30 03 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e156:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
      e9e15d:	00 
      e9e15e:	e8 07 be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e163:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9e16a:	00 
      e9e16b:	e8 fa bd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### 0xe9e45d: lea    rdi,[rsp+0xea0]
      e9e40d:	e8 5c 9e ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e412:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      e9e419:	00 
      e9e41a:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9e41d:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
      e9e422:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9e426:	48 85 c0             	test   rax,rax
      e9e429:	48 8b 9c 24 48 13 00 	mov    rbx,QWORD PTR [rsp+0x1348]
      e9e430:	00 
      e9e431:	74 05                	je     e9e438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6584e>
      e9e433:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9e438:	48 8b 84 24 40 13 00 	mov    rax,QWORD PTR [rsp+0x1340]
      e9e43f:	00 
      e9e440:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9e443:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9e448:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9e44c:	48 85 c0             	test   rax,rax
      e9e44f:	74 05                	je     e9e456 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6586c>
      e9e451:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9e456:	48 8d 35 63 6a 53 ff 	lea    rsi,[rip+0xffffffffff536a63]        # 3d4ec0 <_ZTSN5boost17bad_function_callE@@Base+0x2206>
      e9e45d:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9e464:	00 
      e9e465:	e8 d6 fa 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e46a:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9e46f:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9e476:	00 
      e9e477:	48 89 9c 24 08 0d 00 	mov    QWORD PTR [rsp+0xd08],rbx
      e9e47e:	00 
      e9e47f:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
      e9e485:	f3 0f 7f 84 24 10 0d 	movdqu XMMWORD PTR [rsp+0xd10],xmm0
      e9e48c:	00 00 
      e9e48e:	66 49 0f 3a 16 c4 01 	pextrq r12,xmm0,0x1
      e9e495:	4d 85 e4             	test   r12,r12
      e9e498:	74 06                	je     e9e4a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x658b6>
      e9e49a:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      e9e4a0:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9e4a6:	f3 0f 7f 84 24 20 0d 	movdqu XMMWORD PTR [rsp+0xd20],xmm0
      e9e4ad:	00 00 
      e9e4af:	66 49 0f 3a 16 c5 01 	pextrq r13,xmm0,0x1
      e9e4b6:	4d 85 ed             	test   r13,r13
      e9e4b9:	74 05                	je     e9e4c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x658d6>
      e9e4bb:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      e9e4c0:	48 83 a4 24 80 10 00 	and    QWORD PTR [rsp+0x1080],0x0
      e9e4c7:	00 00 
      e9e4c9:	6a 38                	push   0x38
      e9e4cb:	5f                   	pop    rdi
      e9e4cc:	e8 2f fa 94 00       	call   17edf00 <_Znwm@plt>
      e9e4d1:	48 8d 8c 24 10 0d 00 	lea    rcx,[rsp+0xd10]
      e9e4d8:	00 
      e9e4d9:	48 8d 15 48 8d 99 00 	lea    rdx,[rip+0x998d48]        # 1837228 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x91c0>
      e9e4e0:	48 89 10             	mov    QWORD PTR [rax],rdx
      e9e4e3:	0f 10 41 f0          	movups xmm0,XMMWORD PTR [rcx-0x10]
      e9e4e7:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9e4eb:	66 0f 6f 4c 24 40    	movdqa xmm1,XMMWORD PTR [rsp+0x40]
      e9e4f1:	f3 0f 7f 48 18       	movdqu XMMWORD PTR [rax+0x18],xmm1
      e9e4f6:	0f 57 c0             	xorps  xmm0,xmm0
      e9e4f9:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
      e9e4fc:	66 0f 6f 54 24 10    	movdqa xmm2,XMMWORD PTR [rsp+0x10]
      e9e502:	f3 0f 7f 50 28       	movdqu XMMWORD PTR [rax+0x28],xmm2
      e9e507:	0f 11 41 10          	movups XMMWORD PTR [rcx+0x10],xmm0
      e9e50b:	48 89 84 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rax
      e9e512:	00 
      e9e513:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9e518:	48 89 84 24 d0 0e 00 	mov    QWORD PTR [rsp+0xed0],rax
      e9e51f:	00 
      e9e520:	48 8b 84 24 48 13 00 	mov    rax,QWORD PTR [rsp+0x1348]

### 0xe9e5c2: lea    r15,[rsp+0xea0]
      e9e56a:	48 8d 8c 24 f0 0e 00 	lea    rcx,[rsp+0xef0]
      e9e571:	00 
      e9e572:	48 8d 15 f7 8c 99 00 	lea    rdx,[rip+0x998cf7]        # 1837270 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x9208>
      e9e579:	48 89 10             	mov    QWORD PTR [rax],rdx
      e9e57c:	0f 10 41 e0          	movups xmm0,XMMWORD PTR [rcx-0x20]
      e9e580:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9e584:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
      e9e58a:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
      e9e58f:	66 0f ef c0          	pxor   xmm0,xmm0
      e9e593:	48 8d 94 24 e0 0e 00 	lea    rdx,[rsp+0xee0]
      e9e59a:	00 
      e9e59b:	f3 0f 7f 02          	movdqu XMMWORD PTR [rdx],xmm0
      e9e59f:	66 0f 6f 4c 24 10    	movdqa xmm1,XMMWORD PTR [rsp+0x10]
      e9e5a5:	f3 0f 7f 48 28       	movdqu XMMWORD PTR [rax+0x28],xmm1
      e9e5aa:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
      e9e5ae:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9e5b5:	00 
      e9e5b6:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      e9e5ba:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9e5c1:	00 
      e9e5c2:	4c 8d bc 24 a0 0e 00 	lea    r15,[rsp+0xea0]
      e9e5c9:	00 
      e9e5ca:	48 8d ac 24 60 10 00 	lea    rbp,[rsp+0x1060]
      e9e5d1:	00 
      e9e5d2:	48 89 df             	mov    rdi,rbx
      e9e5d5:	4c 89 fe             	mov    rsi,r15
      e9e5d8:	48 89 ea             	mov    rdx,rbp
      e9e5db:	4c 89 f1             	mov    rcx,r14
      e9e5de:	e8 63 9b ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9e5e3:	4c 89 f7             	mov    rdi,r14
      e9e5e6:	e8 7f b9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e5eb:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      e9e5f2:	00 
      e9e5f3:	e8 0c 59 06 00       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
      e9e5f8:	48 89 ef             	mov    rdi,rbp
      e9e5fb:	e8 6a b9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e600:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9e607:	00 
      e9e608:	e8 f7 58 06 00       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
      e9e60d:	4c 89 ff             	mov    rdi,r15
      e9e610:	e8 7b f8 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e615:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e61c:	00 
      e9e61d:	48 89 de             	mov    rsi,rbx
      e9e620:	e8 d3 0a ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e625:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e62c:	00 
      e9e62d:	e8 3c 9c ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e632:	4c 89 ef             	mov    rdi,r13
      e9e635:	e8 4c fe bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e63a:	4c 89 e7             	mov    rdi,r12
      e9e63d:	e8 44 fe bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e642:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      e9e649:	00 
      e9e64a:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9e64d:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9e652:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
      e9e656:	48 85 db             	test   rbx,rbx
      e9e659:	74 05                	je     e9e660 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65a76>
      e9e65b:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9e660:	48 8d 35 09 6a 53 ff 	lea    rsi,[rip+0xffffffffff536a09]        # 3d5070 <_ZTSN5boost17bad_function_callE@@Base+0x23b6>
      e9e667:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e66e:	00 
      e9e66f:	e8 cc f8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e674:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
      e9e67b:	00 

### 0xe9e7d9: lea    rdi,[rsp+0xea0]
      e9e787:	48 85 ed             	test   rbp,rbp
      e9e78a:	74 14                	je     e9e7a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65bb6>
      e9e78c:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      e9e791:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      e9e796:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      e9e79b:	49 89 ec             	mov    r12,rbp
      e9e79e:	eb 03                	jmp    e9e7a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65bb9>
      e9e7a0:	45 31 e4             	xor    r12d,r12d
      e9e7a3:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
      e9e7aa:	00 
      e9e7ab:	48 8d 0d ae 30 99 00 	lea    rcx,[rip+0x9930ae]        # 1831860 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x37f8>
      e9e7b2:	48 89 8c 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],rcx
      e9e7b9:	00 
      e9e7ba:	48 89 84 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],rax
      e9e7c1:	00 
      e9e7c2:	4c 89 a4 24 40 0b 00 	mov    QWORD PTR [rsp+0xb40],r12
      e9e7c9:	00 
      e9e7ca:	4c 89 bc 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],r15
      e9e7d1:	00 
      e9e7d2:	48 8d 35 17 5f 53 ff 	lea    rsi,[rip+0xffffffffff535f17]        # 3d46f0 <_ZTSN5boost17bad_function_callE@@Base+0x1a36>
      e9e7d9:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9e7e0:	00 
      e9e7e1:	e8 5a f7 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e7e6:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9e7ed:	00 
      e9e7ee:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9e7f5:	00 
      e9e7f6:	e8 95 ba bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e7fb:	6a 01                	push   0x1
      e9e7fd:	58                   	pop    rax
      e9e7fe:	48 89 84 24 90 10 00 	mov    QWORD PTR [rsp+0x1090],rax
      e9e805:	00 
      e9e806:	48 89 84 24 98 10 00 	mov    QWORD PTR [rsp+0x1098],rax
      e9e80d:	00 
      e9e80e:	48 83 a4 24 20 0d 00 	and    QWORD PTR [rsp+0xd20],0x0
      e9e815:	00 00 
      e9e817:	6a 50                	push   0x50
      e9e819:	5f                   	pop    rdi
      e9e81a:	e8 e1 f6 94 00       	call   17edf00 <_Znwm@plt>
      e9e81f:	49 89 c7             	mov    r15,rax
      e9e822:	48 89 84 24 d0 0e 00 	mov    QWORD PTR [rsp+0xed0],rax
      e9e829:	00 
      e9e82a:	48 89 9c 24 d8 0e 00 	mov    QWORD PTR [rsp+0xed8],rbx
      e9e831:	00 
      e9e832:	48 c7 84 24 e0 0e 00 	mov    QWORD PTR [rsp+0xee0],0x1
      e9e839:	00 01 00 00 00 
      e9e83e:	48 8d 05 c3 46 99 00 	lea    rax,[rip+0x9946c3]        # 1832f08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4ea0>
      e9e845:	49 89 07             	mov    QWORD PTR [r15],rax
      e9e848:	4c 89 ff             	mov    rdi,r15
      e9e84b:	48 83 c7 10          	add    rdi,0x10
      e9e84f:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9e856:	00 
      e9e857:	e8 34 ba bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e85c:	4c 8d b4 24 90 10 00 	lea    r14,[rsp+0x1090]
      e9e863:	00 
      e9e864:	48 8d 9c 24 d0 0e 00 	lea    rbx,[rsp+0xed0]
      e9e86b:	00 
      e9e86c:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      e9e870:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      e9e875:	66 41 0f 7f 47 40    	movdqa XMMWORD PTR [r15+0x40],xmm0
      e9e87b:	4c 8d ac 24 00 0d 00 	lea    r13,[rsp+0xd00]
      e9e882:	00 
      e9e883:	4d 89 7d 20          	mov    QWORD PTR [r13+0x20],r15
      e9e887:	48 89 df             	mov    rdi,rbx
      e9e88a:	e8 3b ba bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9e88f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]

### 0xe9e897: lea    rsi,[rsp+0xea0]
      e9e845:	49 89 07             	mov    QWORD PTR [r15],rax
      e9e848:	4c 89 ff             	mov    rdi,r15
      e9e84b:	48 83 c7 10          	add    rdi,0x10
      e9e84f:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9e856:	00 
      e9e857:	e8 34 ba bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e85c:	4c 8d b4 24 90 10 00 	lea    r14,[rsp+0x1090]
      e9e863:	00 
      e9e864:	48 8d 9c 24 d0 0e 00 	lea    rbx,[rsp+0xed0]
      e9e86b:	00 
      e9e86c:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      e9e870:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      e9e875:	66 41 0f 7f 47 40    	movdqa XMMWORD PTR [r15+0x40],xmm0
      e9e87b:	4c 8d ac 24 00 0d 00 	lea    r13,[rsp+0xd00]
      e9e882:	00 
      e9e883:	4d 89 7d 20          	mov    QWORD PTR [r13+0x20],r15
      e9e887:	48 89 df             	mov    rdi,rbx
      e9e88a:	e8 3b ba bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9e88f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e896:	00 
      e9e897:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9e89e:	00 
      e9e89f:	4c 89 ea             	mov    rdx,r13
      e9e8a2:	e8 01 82 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9e8a7:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9e8ae:	00 
      e9e8af:	e8 b6 b6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e8b4:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9e8bb:	00 
      e9e8bc:	e8 a9 b6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e8c1:	4c 8d ac 24 a0 0e 00 	lea    r13,[rsp+0xea0]
      e9e8c8:	00 
      e9e8c9:	4c 89 ef             	mov    rdi,r13
      e9e8cc:	e8 bf f5 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e8d1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e8d8:	00 
      e9e8d9:	e8 8c b6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e8de:	31 ff                	xor    edi,edi
      e9e8e0:	e8 a1 fb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e8e5:	4c 89 e7             	mov    rdi,r12
      e9e8e8:	e8 99 fb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e8ed:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e8f4:	00 
      e9e8f5:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9e8fc:	00 
      e9e8fd:	e8 f6 07 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e902:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e909:	00 
      e9e90a:	e8 5f 99 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e90f:	48 89 ef             	mov    rdi,rbp
      e9e912:	e8 6f fb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e917:	48 8b 8c 24 98 12 00 	mov    rcx,QWORD PTR [rsp+0x1298]
      e9e91e:	00 
      e9e91f:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      e9e922:	4c 8b 79 08          	mov    r15,QWORD PTR [rcx+0x8]
      e9e926:	4d 85 ff             	test   r15,r15
      e9e929:	74 14                	je     e9e93f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65d55>
      e9e92b:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e930:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e935:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e93a:	4c 89 fd             	mov    rbp,r15
      e9e93d:	eb 02                	jmp    e9e941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65d57>
      e9e93f:	31 ed                	xor    ebp,ebp
      e9e941:	48 8d 0d 18 2f 99 00 	lea    rcx,[rip+0x992f18]        # 1831860 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x37f8>
      e9e948:	48 89 8c 24 a0 0e 00 	mov    QWORD PTR [rsp+0xea0],rcx
      e9e94f:	00 

### 0xe9e8c1: lea    r13,[rsp+0xea0]
      e9e86c:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      e9e870:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      e9e875:	66 41 0f 7f 47 40    	movdqa XMMWORD PTR [r15+0x40],xmm0
      e9e87b:	4c 8d ac 24 00 0d 00 	lea    r13,[rsp+0xd00]
      e9e882:	00 
      e9e883:	4d 89 7d 20          	mov    QWORD PTR [r13+0x20],r15
      e9e887:	48 89 df             	mov    rdi,rbx
      e9e88a:	e8 3b ba bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9e88f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e896:	00 
      e9e897:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9e89e:	00 
      e9e89f:	4c 89 ea             	mov    rdx,r13
      e9e8a2:	e8 01 82 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9e8a7:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9e8ae:	00 
      e9e8af:	e8 b6 b6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e8b4:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9e8bb:	00 
      e9e8bc:	e8 a9 b6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e8c1:	4c 8d ac 24 a0 0e 00 	lea    r13,[rsp+0xea0]
      e9e8c8:	00 
      e9e8c9:	4c 89 ef             	mov    rdi,r13
      e9e8cc:	e8 bf f5 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e8d1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e8d8:	00 
      e9e8d9:	e8 8c b6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e8de:	31 ff                	xor    edi,edi
      e9e8e0:	e8 a1 fb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e8e5:	4c 89 e7             	mov    rdi,r12
      e9e8e8:	e8 99 fb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e8ed:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e8f4:	00 
      e9e8f5:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9e8fc:	00 
      e9e8fd:	e8 f6 07 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e902:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e909:	00 
      e9e90a:	e8 5f 99 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e90f:	48 89 ef             	mov    rdi,rbp
      e9e912:	e8 6f fb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e917:	48 8b 8c 24 98 12 00 	mov    rcx,QWORD PTR [rsp+0x1298]
      e9e91e:	00 
      e9e91f:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      e9e922:	4c 8b 79 08          	mov    r15,QWORD PTR [rcx+0x8]
      e9e926:	4d 85 ff             	test   r15,r15
      e9e929:	74 14                	je     e9e93f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65d55>
      e9e92b:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e930:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e935:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e93a:	4c 89 fd             	mov    rbp,r15
      e9e93d:	eb 02                	jmp    e9e941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65d57>
      e9e93f:	31 ed                	xor    ebp,ebp
      e9e941:	48 8d 0d 18 2f 99 00 	lea    rcx,[rip+0x992f18]        # 1831860 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x37f8>
      e9e948:	48 89 8c 24 a0 0e 00 	mov    QWORD PTR [rsp+0xea0],rcx
      e9e94f:	00 
      e9e950:	48 89 84 24 a8 0e 00 	mov    QWORD PTR [rsp+0xea8],rax
      e9e957:	00 
      e9e958:	48 89 ac 24 b0 0e 00 	mov    QWORD PTR [rsp+0xeb0],rbp
      e9e95f:	00 
      e9e960:	4c 89 ac 24 c0 0e 00 	mov    QWORD PTR [rsp+0xec0],r13
      e9e967:	00 
      e9e968:	48 8d 35 e9 66 53 ff 	lea    rsi,[rip+0xffffffffff5366e9]        # 3d5058 <_ZTSN5boost17bad_function_callE@@Base+0x239e>
      e9e96f:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9e976:	00 
      e9e977:	e8 c4 f5 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>

### 0xe9e948: mov    QWORD PTR [rsp+0xea0],rcx
      e9e8fc:	00 
      e9e8fd:	e8 f6 07 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e902:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e909:	00 
      e9e90a:	e8 5f 99 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e90f:	48 89 ef             	mov    rdi,rbp
      e9e912:	e8 6f fb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e917:	48 8b 8c 24 98 12 00 	mov    rcx,QWORD PTR [rsp+0x1298]
      e9e91e:	00 
      e9e91f:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      e9e922:	4c 8b 79 08          	mov    r15,QWORD PTR [rcx+0x8]
      e9e926:	4d 85 ff             	test   r15,r15
      e9e929:	74 14                	je     e9e93f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65d55>
      e9e92b:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e930:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e935:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e93a:	4c 89 fd             	mov    rbp,r15
      e9e93d:	eb 02                	jmp    e9e941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65d57>
      e9e93f:	31 ed                	xor    ebp,ebp
      e9e941:	48 8d 0d 18 2f 99 00 	lea    rcx,[rip+0x992f18]        # 1831860 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x37f8>
      e9e948:	48 89 8c 24 a0 0e 00 	mov    QWORD PTR [rsp+0xea0],rcx
      e9e94f:	00 
      e9e950:	48 89 84 24 a8 0e 00 	mov    QWORD PTR [rsp+0xea8],rax
      e9e957:	00 
      e9e958:	48 89 ac 24 b0 0e 00 	mov    QWORD PTR [rsp+0xeb0],rbp
      e9e95f:	00 
      e9e960:	4c 89 ac 24 c0 0e 00 	mov    QWORD PTR [rsp+0xec0],r13
      e9e967:	00 
      e9e968:	48 8d 35 e9 66 53 ff 	lea    rsi,[rip+0xffffffffff5366e9]        # 3d5058 <_ZTSN5boost17bad_function_callE@@Base+0x239e>
      e9e96f:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9e976:	00 
      e9e977:	e8 c4 f5 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e97c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9e983:	00 
      e9e984:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9e98b:	00 
      e9e98c:	e8 ff b8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e991:	48 c7 84 24 90 10 00 	mov    QWORD PTR [rsp+0x1090],0x5
      e9e998:	00 05 00 00 00 
      e9e99d:	48 c7 84 24 98 10 00 	mov    QWORD PTR [rsp+0x1098],0xa
      e9e9a4:	00 0a 00 00 00 
      e9e9a9:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9e9b0:	00 00 
      e9e9b2:	6a 50                	push   0x50
      e9e9b4:	5f                   	pop    rdi
      e9e9b5:	e8 46 f5 94 00       	call   17edf00 <_Znwm@plt>
      e9e9ba:	49 89 c4             	mov    r12,rax
      e9e9bd:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9e9c4:	00 
      e9e9c5:	48 89 9c 24 08 0d 00 	mov    QWORD PTR [rsp+0xd08],rbx
      e9e9cc:	00 
      e9e9cd:	48 c7 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],0x1
      e9e9d4:	00 01 00 00 00 
      e9e9d9:	48 8d 05 a8 ab 99 00 	lea    rax,[rip+0x99aba8]        # 1839588 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb520>
      e9e9e0:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9e9e4:	4c 89 e7             	mov    rdi,r12
      e9e9e7:	48 83 c7 10          	add    rdi,0x10
      e9e9eb:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9e9f2:	00 
      e9e9f3:	e8 98 b8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e9f8:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      e9e9fd:	66 41 0f 7f 44 24 40 	movdqa XMMWORD PTR [r12+0x40],xmm0
      e9ea04:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ea0b:	00 
      e9ea0c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9ea10:	4c 89 a4 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],r12

### 0xe9e984: lea    rsi,[rsp+0xea0]
      e9e930:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e935:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e93a:	4c 89 fd             	mov    rbp,r15
      e9e93d:	eb 02                	jmp    e9e941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65d57>
      e9e93f:	31 ed                	xor    ebp,ebp
      e9e941:	48 8d 0d 18 2f 99 00 	lea    rcx,[rip+0x992f18]        # 1831860 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x37f8>
      e9e948:	48 89 8c 24 a0 0e 00 	mov    QWORD PTR [rsp+0xea0],rcx
      e9e94f:	00 
      e9e950:	48 89 84 24 a8 0e 00 	mov    QWORD PTR [rsp+0xea8],rax
      e9e957:	00 
      e9e958:	48 89 ac 24 b0 0e 00 	mov    QWORD PTR [rsp+0xeb0],rbp
      e9e95f:	00 
      e9e960:	4c 89 ac 24 c0 0e 00 	mov    QWORD PTR [rsp+0xec0],r13
      e9e967:	00 
      e9e968:	48 8d 35 e9 66 53 ff 	lea    rsi,[rip+0xffffffffff5366e9]        # 3d5058 <_ZTSN5boost17bad_function_callE@@Base+0x239e>
      e9e96f:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9e976:	00 
      e9e977:	e8 c4 f5 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e97c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9e983:	00 
      e9e984:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9e98b:	00 
      e9e98c:	e8 ff b8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e991:	48 c7 84 24 90 10 00 	mov    QWORD PTR [rsp+0x1090],0x5
      e9e998:	00 05 00 00 00 
      e9e99d:	48 c7 84 24 98 10 00 	mov    QWORD PTR [rsp+0x1098],0xa
      e9e9a4:	00 0a 00 00 00 
      e9e9a9:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9e9b0:	00 00 
      e9e9b2:	6a 50                	push   0x50
      e9e9b4:	5f                   	pop    rdi
      e9e9b5:	e8 46 f5 94 00       	call   17edf00 <_Znwm@plt>
      e9e9ba:	49 89 c4             	mov    r12,rax
      e9e9bd:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9e9c4:	00 
      e9e9c5:	48 89 9c 24 08 0d 00 	mov    QWORD PTR [rsp+0xd08],rbx
      e9e9cc:	00 
      e9e9cd:	48 c7 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],0x1
      e9e9d4:	00 01 00 00 00 
      e9e9d9:	48 8d 05 a8 ab 99 00 	lea    rax,[rip+0x99aba8]        # 1839588 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb520>
      e9e9e0:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9e9e4:	4c 89 e7             	mov    rdi,r12
      e9e9e7:	48 83 c7 10          	add    rdi,0x10
      e9e9eb:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9e9f2:	00 
      e9e9f3:	e8 98 b8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e9f8:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      e9e9fd:	66 41 0f 7f 44 24 40 	movdqa XMMWORD PTR [r12+0x40],xmm0
      e9ea04:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ea0b:	00 
      e9ea0c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9ea10:	4c 89 a4 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],r12
      e9ea17:	00 
      e9ea18:	e8 ad b8 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9ea1d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ea24:	00 
      e9ea25:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9ea2c:	00 
      e9ea2d:	e8 5e b8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9ea32:	48 c7 84 24 30 0d 00 	mov    QWORD PTR [rsp+0xd30],0x5
      e9ea39:	00 05 00 00 00 
      e9ea3e:	48 c7 84 24 38 0d 00 	mov    QWORD PTR [rsp+0xd38],0xa
      e9ea45:	00 0a 00 00 00 
      e9ea4a:	6a 50                	push   0x50
      e9ea4c:	5f                   	pop    rdi
      e9ea4d:	e8 ae f4 94 00       	call   17edf00 <_Znwm@plt>

### 0xe9ea25: lea    rsi,[rsp+0xea0]
      e9e9cc:	00 
      e9e9cd:	48 c7 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],0x1
      e9e9d4:	00 01 00 00 00 
      e9e9d9:	48 8d 05 a8 ab 99 00 	lea    rax,[rip+0x99aba8]        # 1839588 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb520>
      e9e9e0:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9e9e4:	4c 89 e7             	mov    rdi,r12
      e9e9e7:	48 83 c7 10          	add    rdi,0x10
      e9e9eb:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9e9f2:	00 
      e9e9f3:	e8 98 b8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e9f8:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      e9e9fd:	66 41 0f 7f 44 24 40 	movdqa XMMWORD PTR [r12+0x40],xmm0
      e9ea04:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ea0b:	00 
      e9ea0c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9ea10:	4c 89 a4 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],r12
      e9ea17:	00 
      e9ea18:	e8 ad b8 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9ea1d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ea24:	00 
      e9ea25:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9ea2c:	00 
      e9ea2d:	e8 5e b8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9ea32:	48 c7 84 24 30 0d 00 	mov    QWORD PTR [rsp+0xd30],0x5
      e9ea39:	00 05 00 00 00 
      e9ea3e:	48 c7 84 24 38 0d 00 	mov    QWORD PTR [rsp+0xd38],0xa
      e9ea45:	00 0a 00 00 00 
      e9ea4a:	6a 50                	push   0x50
      e9ea4c:	5f                   	pop    rdi
      e9ea4d:	e8 ae f4 94 00       	call   17edf00 <_Znwm@plt>
      e9ea52:	48 89 c3             	mov    rbx,rax
      e9ea55:	48 89 84 24 d0 0c 00 	mov    QWORD PTR [rsp+0xcd0],rax
      e9ea5c:	00 
      e9ea5d:	48 8d 84 24 80 03 00 	lea    rax,[rsp+0x380]
      e9ea64:	00 
      e9ea65:	48 89 84 24 d8 0c 00 	mov    QWORD PTR [rsp+0xcd8],rax
      e9ea6c:	00 
      e9ea6d:	48 c7 84 24 e0 0c 00 	mov    QWORD PTR [rsp+0xce0],0x1
      e9ea74:	00 01 00 00 00 
      e9ea79:	48 8d 05 50 ab 99 00 	lea    rax,[rip+0x99ab50]        # 18395d0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb568>
      e9ea80:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9ea83:	48 89 df             	mov    rdi,rbx
      e9ea86:	48 83 c7 10          	add    rdi,0x10
      e9ea8a:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ea91:	00 
      e9ea92:	e8 f9 b7 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9ea97:	48 8d 84 24 30 0d 00 	lea    rax,[rsp+0xd30]
      e9ea9e:	00 
      e9ea9f:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      e9eaa6:	00 
      e9eaa7:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9eaab:	66 0f 6f 00          	movdqa xmm0,XMMWORD PTR [rax]
      e9eaaf:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
      e9eab4:	4c 8d a4 24 d0 0e 00 	lea    r12,[rsp+0xed0]
      e9eabb:	00 
      e9eabc:	49 89 5c 24 20       	mov    QWORD PTR [r12+0x20],rbx
      e9eac1:	e8 04 b8 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9eac6:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9eacd:	00 
      e9eace:	4c 8d ac 24 b0 03 00 	lea    r13,[rsp+0x3b0]
      e9ead5:	00 
      e9ead6:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9eadd:	00 
      e9eade:	48 89 df             	mov    rdi,rbx
      e9eae1:	4c 89 ee             	mov    rsi,r13
      e9eae4:	4c 89 f2             	mov    rdx,r14

### 0xe9eb21: lea    rdi,[rsp+0xea0]
      e9ead5:	00 
      e9ead6:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9eadd:	00 
      e9eade:	48 89 df             	mov    rdi,rbx
      e9eae1:	4c 89 ee             	mov    rsi,r13
      e9eae4:	4c 89 f2             	mov    rdx,r14
      e9eae7:	4c 89 e1             	mov    rcx,r12
      e9eaea:	e8 57 96 ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9eaef:	4c 89 e7             	mov    rdi,r12
      e9eaf2:	e8 73 b4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9eaf7:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9eafe:	00 
      e9eaff:	e8 66 b4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9eb04:	4c 89 f7             	mov    rdi,r14
      e9eb07:	e8 5e b4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9eb0c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9eb13:	00 
      e9eb14:	e8 51 b4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9eb19:	4c 89 ef             	mov    rdi,r13
      e9eb1c:	e8 6f f3 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9eb21:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9eb28:	00 
      e9eb29:	e8 3c b4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9eb2e:	31 ff                	xor    edi,edi
      e9eb30:	e8 51 f9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9eb35:	48 89 ef             	mov    rdi,rbp
      e9eb38:	e8 49 f9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9eb3d:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9eb44:	00 
      e9eb45:	48 89 de             	mov    rsi,rbx
      e9eb48:	e8 ab 05 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9eb4d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eb54:	00 
      e9eb55:	e8 14 97 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9eb5a:	4c 89 ff             	mov    rdi,r15
      e9eb5d:	e8 24 f9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9eb62:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
      e9eb69:	00 
      e9eb6a:	4c 8b b4 24 40 12 00 	mov    r14,QWORD PTR [rsp+0x1240]
      e9eb71:	00 
      e9eb72:	48 8d ac 24 00 0d 00 	lea    rbp,[rsp+0xd00]
      e9eb79:	00 
      e9eb7a:	0f b6 94 24 d4 06 00 	movzx  edx,BYTE PTR [rsp+0x6d4]
      e9eb81:	00 
      e9eb82:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eb89:	00 
      e9eb8a:	48 8b b4 24 90 12 00 	mov    rsi,QWORD PTR [rsp+0x1290]
      e9eb91:	00 
      e9eb92:	e8 1b c0 07 00       	call   f1abb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1fc8>
      e9eb97:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9eb9e:	00 
      e9eb9f:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9eba6:	00 
      e9eba7:	e8 4c 05 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9ebac:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9ebb3:	00 
      e9ebb4:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ebbb:	00 
      e9ebbc:	e8 ad 96 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9ebc1:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ebc8:	00 
      e9ebc9:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
      e9ebcd:	48 8b 84 24 10 01 00 	mov    rax,QWORD PTR [rsp+0x110]
      e9ebd4:	00 
      e9ebd5:	48 8b 10             	mov    rdx,QWORD PTR [rax]
      e9ebd8:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]

### 0xea01c0: mov    QWORD PTR [rsp+0xea0],rax
      ea016d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0172:	48 8d bc 24 d8 11 00 	lea    rdi,[rsp+0x11d8]
      ea0179:	00 
      ea017a:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
      ea0181:	00 
      ea0182:	e8 b9 dd 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0187:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      ea018e:	00 
      ea018f:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ea0193:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      ea0197:	66 0f 7f 84 24 f0 11 	movdqa XMMWORD PTR [rsp+0x11f0],xmm0
      ea019e:	00 00 
      ea01a0:	48 85 c0             	test   rax,rax
      ea01a3:	74 05                	je     ea01aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x675c0>
      ea01a5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea01aa:	48 83 a4 24 f0 0e 00 	and    QWORD PTR [rsp+0xef0],0x0
      ea01b1:	00 00 
      ea01b3:	bf b0 01 00 00       	mov    edi,0x1b0
      ea01b8:	e8 43 dd 94 00       	call   17edf00 <_Znwm@plt>
      ea01bd:	49 89 c4             	mov    r12,rax
      ea01c0:	48 89 84 24 a0 0e 00 	mov    QWORD PTR [rsp+0xea0],rax
      ea01c7:	00 
      ea01c8:	48 8d 84 24 80 03 00 	lea    rax,[rsp+0x380]
      ea01cf:	00 
      ea01d0:	48 89 84 24 a8 0e 00 	mov    QWORD PTR [rsp+0xea8],rax
      ea01d7:	00 
      ea01d8:	48 c7 84 24 b0 0e 00 	mov    QWORD PTR [rsp+0xeb0],0x1
      ea01df:	00 01 00 00 00 
      ea01e4:	48 8d 05 3d 45 99 00 	lea    rax,[rip+0x99453d]        # 1834728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x66c0>
      ea01eb:	49 89 04 24          	mov    QWORD PTR [r12],rax
      ea01ef:	0f 28 84 24 60 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1060]
      ea01f6:	00 
      ea01f7:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      ea01fd:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
      ea0204:	00 
      ea0205:	0f 28 84 24 70 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1070]
      ea020c:	00 
      ea020d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      ea0213:	48 85 c0             	test   rax,rax
      ea0216:	74 05                	je     ea021d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67633>
      ea0218:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea021d:	48 8b 84 24 88 10 00 	mov    rax,QWORD PTR [rsp+0x1088]
      ea0224:	00 
      ea0225:	0f 28 84 24 80 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1080]
      ea022c:	00 
      ea022d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      ea0233:	48 85 c0             	test   rax,rax
      ea0236:	74 05                	je     ea023d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67653>
      ea0238:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea023d:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
      ea0244:	00 
      ea0245:	0f 28 84 24 90 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1090]
      ea024c:	00 
      ea024d:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0
      ea0253:	48 85 c0             	test   rax,rax
      ea0256:	74 05                	je     ea025d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67673>
      ea0258:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea025d:	49 8d 5c 24 50       	lea    rbx,[r12+0x50]
      ea0262:	48 89 df             	mov    rdi,rbx
      ea0265:	4c 89 ee             	mov    rsi,r13
      ea0268:	e8 2b dc 02 00       	call   ecde98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952ae>
      ea026d:	4d 8d ac 24 80 00 00 	lea    r13,[r12+0x80]
      ea0274:	00 
      ea0275:	4c 89 ef             	mov    rdi,r13
      ea0278:	4c 89 fe             	mov    rsi,r15
      ea027b:	e8 5c dc 02 00       	call   ecdedc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952f2>

### 0xea031e: lea    rdi,[rsp+0xea0]
      ea02cc:	00 00 
      ea02ce:	f3 41 0f 7f 84 24 78 	movdqu XMMWORD PTR [r12+0x178],xmm0
      ea02d5:	01 00 00 
      ea02d8:	48 85 c0             	test   rax,rax
      ea02db:	74 05                	je     ea02e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x676f8>
      ea02dd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea02e2:	4c 89 e7             	mov    rdi,r12
      ea02e5:	48 81 c7 88 01 00 00 	add    rdi,0x188
      ea02ec:	48 8d b4 24 d8 11 00 	lea    rsi,[rsp+0x11d8]
      ea02f3:	00 
      ea02f4:	e8 47 dc 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea02f9:	48 8b 84 24 f8 11 00 	mov    rax,QWORD PTR [rsp+0x11f8]
      ea0300:	00 
      ea0301:	66 0f 6f 84 24 f0 11 	movdqa xmm0,XMMWORD PTR [rsp+0x11f0]
      ea0308:	00 00 
      ea030a:	f3 41 0f 7f 84 24 a0 	movdqu XMMWORD PTR [r12+0x1a0],xmm0
      ea0311:	01 00 00 
      ea0314:	48 85 c0             	test   rax,rax
      ea0317:	74 05                	je     ea031e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67734>
      ea0319:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea031e:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0325:	00 
      ea0326:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ea032a:	4c 8d bc 24 d0 0e 00 	lea    r15,[rsp+0xed0]
      ea0331:	00 
      ea0332:	4d 89 67 20          	mov    QWORD PTR [r15+0x20],r12
      ea0336:	e8 8f 9f bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea033b:	48 8d 9c 24 00 0d 00 	lea    rbx,[rsp+0xd00]
      ea0342:	00 
      ea0343:	4c 8d a4 24 d0 0c 00 	lea    r12,[rsp+0xcd0]
      ea034a:	00 
      ea034b:	4c 8d ac 24 30 0b 00 	lea    r13,[rsp+0xb30]
      ea0352:	00 
      ea0353:	48 89 df             	mov    rdi,rbx
      ea0356:	4c 89 e6             	mov    rsi,r12
      ea0359:	4c 89 ea             	mov    rdx,r13
      ea035c:	4c 89 f9             	mov    rcx,r15
      ea035f:	e8 e2 7d ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      ea0364:	4c 89 ff             	mov    rdi,r15
      ea0367:	e8 fe 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea036c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0373:	00 
      ea0374:	e8 a7 db 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea0379:	4c 89 ef             	mov    rdi,r13
      ea037c:	e8 e9 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0381:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0388:	00 
      ea0389:	e8 92 db 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea038e:	4c 89 e7             	mov    rdi,r12
      ea0391:	e8 fa da 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0396:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea039d:	00 
      ea039e:	48 89 de             	mov    rsi,rbx
      ea03a1:	e8 52 ed fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      ea03a6:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea03ad:	00 
      ea03ae:	e8 bb 7e ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea03b3:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
      ea03ba:	00 
      ea03bb:	e8 aa 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03c0:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
      ea03c7:	00 
      ea03c8:	e8 9d 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03cd:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
      ea03d4:	00 
      ea03d5:	48 8b 18             	mov    rbx,QWORD PTR [rax]

### 0xea03df: lea    rdi,[rsp+0xea0]
      ea0389:	e8 92 db 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea038e:	4c 89 e7             	mov    rdi,r12
      ea0391:	e8 fa da 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0396:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea039d:	00 
      ea039e:	48 89 de             	mov    rsi,rbx
      ea03a1:	e8 52 ed fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      ea03a6:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea03ad:	00 
      ea03ae:	e8 bb 7e ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea03b3:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
      ea03ba:	00 
      ea03bb:	e8 aa 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03c0:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
      ea03c7:	00 
      ea03c8:	e8 9d 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03cd:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
      ea03d4:	00 
      ea03d5:	48 8b 18             	mov    rbx,QWORD PTR [rax]
      ea03d8:	48 8d 35 f1 43 53 ff 	lea    rsi,[rip+0xffffffffff5343f1]        # 3d47d0 <_ZTSN5boost17bad_function_callE@@Base+0x1b16>
      ea03df:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea03e6:	00 
      ea03e7:	e8 54 db 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea03ec:	4c 8b 6c 24 60       	mov    r13,QWORD PTR [rsp+0x60]
      ea03f1:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ea03f6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      ea03fd:	00 
      ea03fe:	48 89 9c 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rbx
      ea0405:	00 
      ea0406:	4c 89 ac 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r13
      ea040d:	00 
      ea040e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ea0413:	48 89 84 24 78 10 00 	mov    QWORD PTR [rsp+0x1078],rax
      ea041a:	00 
      ea041b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0420:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      ea0425:	48 89 84 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rax
      ea042c:	00 
      ea042d:	4c 89 b4 24 88 10 00 	mov    QWORD PTR [rsp+0x1088],r14
      ea0434:	00 
      ea0435:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      ea043a:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      ea043f:	48 89 84 24 90 10 00 	mov    QWORD PTR [rsp+0x1090],rax
      ea0446:	00 
      ea0447:	48 89 ac 24 98 10 00 	mov    QWORD PTR [rsp+0x1098],rbp
      ea044e:	00 
      ea044f:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      ea0454:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      ea045b:	00 
      ea045c:	4c 8b 20             	mov    r12,QWORD PTR [rax]
      ea045f:	4c 89 a4 24 a0 10 00 	mov    QWORD PTR [rsp+0x10a0],r12
      ea0466:	00 
      ea0467:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      ea046b:	4c 89 bc 24 a8 10 00 	mov    QWORD PTR [rsp+0x10a8],r15
      ea0472:	00 
      ea0473:	4d 85 ff             	test   r15,r15
      ea0476:	74 05                	je     ea047d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67893>
      ea0478:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      ea047d:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      ea0484:	00 00 
      ea0486:	6a 58                	push   0x58
      ea0488:	5f                   	pop    rdi
      ea0489:	e8 72 da 94 00       	call   17edf00 <_Znwm@plt>
      ea048e:	48 8d 0d db 43 99 00 	lea    rcx,[rip+0x9943db]        # 1834870 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6808>
      ea0495:	48 89 08             	mov    QWORD PTR [rax],rcx
      ea0498:	f3 0f 6f 84 24 60 10 	movdqu xmm0,XMMWORD PTR [rsp+0x1060]

### 0xea0602: lea    r12,[rsp+0xea0]
      ea05af:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      ea05b3:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      ea05b8:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
      ea05bd:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
      ea05c1:	4c 89 70 30          	mov    QWORD PTR [rax+0x30],r14
      ea05c5:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      ea05ca:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
      ea05cf:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      ea05d3:	48 89 68 40          	mov    QWORD PTR [rax+0x40],rbp
      ea05d7:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      ea05dc:	4c 89 78 48          	mov    QWORD PTR [rax+0x48],r15
      ea05e0:	48 89 58 50          	mov    QWORD PTR [rax+0x50],rbx
      ea05e4:	48 85 db             	test   rbx,rbx
      ea05e7:	74 05                	je     ea05ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a04>
      ea05e9:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ea05ee:	48 8d 9c 24 d0 0e 00 	lea    rbx,[rsp+0xed0]
      ea05f5:	00 
      ea05f6:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      ea05fa:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      ea0601:	00 
      ea0602:	4c 8d a4 24 a0 0e 00 	lea    r12,[rsp+0xea0]
      ea0609:	00 
      ea060a:	4c 8d ac 24 30 0b 00 	lea    r13,[rsp+0xb30]
      ea0611:	00 
      ea0612:	4c 89 ff             	mov    rdi,r15
      ea0615:	4c 89 e6             	mov    rsi,r12
      ea0618:	4c 89 ea             	mov    rdx,r13
      ea061b:	48 89 d9             	mov    rcx,rbx
      ea061e:	e8 23 7b ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      ea0623:	48 89 df             	mov    rdi,rbx
      ea0626:	e8 3f 99 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea062b:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0632:	00 
      ea0633:	e8 32 77 04 00       	call   ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ea0638:	4c 89 ef             	mov    rdi,r13
      ea063b:	e8 2a 99 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0640:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      ea0647:	00 
      ea0648:	48 89 df             	mov    rdi,rbx
      ea064b:	e8 1a 77 04 00       	call   ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ea0650:	4c 89 e7             	mov    rdi,r12
      ea0653:	e8 38 d8 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0658:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea065f:	00 
      ea0660:	4c 89 fe             	mov    rsi,r15
      ea0663:	e8 90 ea fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      ea0668:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea066f:	00 
      ea0670:	e8 f9 7b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0675:	48 8d 35 84 4a 53 ff 	lea    rsi,[rip+0xffffffffff534a84]        # 3d5100 <_ZTSN5boost17bad_function_callE@@Base+0x2446>
      ea067c:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0683:	00 
      ea0684:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      ea0689:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
      ea068e:	e8 ad d8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0693:	48 8d 05 1e 9a 99 00 	lea    rax,[rip+0x999a1e]        # 183a0b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc050>
      ea069a:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      ea06a1:	00 
      ea06a2:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      ea06a9:	00 
      ea06aa:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea06b1:	00 
      ea06b2:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      ea06b9:	00 
      ea06ba:	48 89 da             	mov    rdx,rbx
      ea06bd:	e8 e6 63 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>

### 0xea09ff: lea    rdi,[rsp+0xea0]
      ea09ac:	e8 b9 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea09b1:	eb 0a                	jmp    ea09bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67dd3>
      ea09b3:	e9 5b 08 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea09b8:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea09bd:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea09c4:	00 
      ea09c5:	e8 a0 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea09ca:	eb 19                	jmp    ea09e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67dfb>
      ea09cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea09d1:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea09d8:	00 
      ea09d9:	e8 ec 98 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea09de:	eb 05                	jmp    ea09e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67dfb>
      ea09e0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea09e5:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea09ec:	00 
      ea09ed:	e8 78 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea09f2:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      ea09f9:	00 
      ea09fa:	e8 91 d4 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea09ff:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0a06:	00 
      ea0a07:	e8 5e 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0a0c:	31 ff                	xor    edi,edi
      ea0a0e:	e8 73 da bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0a13:	48 89 ef             	mov    rdi,rbp
      ea0a16:	e8 6b da bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0a1b:	4c 89 ff             	mov    rdi,r15
      ea0a1e:	e9 96 00 00 00       	jmp    ea0ab9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67ecf>
      ea0a23:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a28:	eb c8                	jmp    ea09f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e08>
      ea0a2a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a2f:	eb ce                	jmp    ea09ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e15>
      ea0a31:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a36:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0a3d:	00 
      ea0a3e:	e8 2b 78 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0a43:	eb 71                	jmp    ea0ab6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67ecc>
      ea0a45:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a4a:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0a51:	00 
      ea0a52:	e8 13 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0a57:	eb 19                	jmp    ea0a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e88>
      ea0a59:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a5e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea0a65:	00 
      ea0a66:	e8 5f 98 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea0a6b:	eb 05                	jmp    ea0a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e88>
      ea0a6d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a72:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0a79:	00 
      ea0a7a:	e8 eb 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0a7f:	eb 05                	jmp    ea0a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e9c>
      ea0a81:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a86:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0a8d:	00 
      ea0a8e:	e8 fd d3 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0a93:	eb 05                	jmp    ea0a9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67eb0>
      ea0a95:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a9a:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea0aa1:	00 
      ea0aa2:	e8 c3 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0aa7:	31 ff                	xor    edi,edi
      ea0aa9:	e8 d8 d9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0aae:	4c 89 e7             	mov    rdi,r12
      ea0ab1:	e8 d0 d9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0xea0a86: lea    rdi,[rsp+0xea0]
      ea0a36:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0a3d:	00 
      ea0a3e:	e8 2b 78 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0a43:	eb 71                	jmp    ea0ab6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67ecc>
      ea0a45:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a4a:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0a51:	00 
      ea0a52:	e8 13 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0a57:	eb 19                	jmp    ea0a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e88>
      ea0a59:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a5e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea0a65:	00 
      ea0a66:	e8 5f 98 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea0a6b:	eb 05                	jmp    ea0a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e88>
      ea0a6d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a72:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0a79:	00 
      ea0a7a:	e8 eb 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0a7f:	eb 05                	jmp    ea0a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e9c>
      ea0a81:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a86:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0a8d:	00 
      ea0a8e:	e8 fd d3 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0a93:	eb 05                	jmp    ea0a9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67eb0>
      ea0a95:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a9a:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea0aa1:	00 
      ea0aa2:	e8 c3 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0aa7:	31 ff                	xor    edi,edi
      ea0aa9:	e8 d8 d9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0aae:	4c 89 e7             	mov    rdi,r12
      ea0ab1:	e8 d0 d9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0ab6:	48 89 ef             	mov    rdi,rbp
      ea0ab9:	e8 c8 d9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0abe:	e9 55 07 00 00       	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea0ac3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0ac8:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0acf:	00 
      ea0ad0:	e8 99 77 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0ad5:	eb 71                	jmp    ea0b48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f5e>
      ea0ad7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0adc:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea0ae3:	00 
      ea0ae4:	e8 81 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0ae9:	eb 12                	jmp    ea0afd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f13>
      ea0aeb:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0af0:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0af7:	00 
      ea0af8:	e8 cf f7 d3 ff       	call   be02cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d26c>
      ea0afd:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea0b04:	00 
      ea0b05:	e8 60 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b0a:	eb 3c                	jmp    ea0b48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f5e>
      ea0b0c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0b11:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0b18:	00 
      ea0b19:	e8 ae f7 d3 ff       	call   be02cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d26c>
      ea0b1e:	eb 28                	jmp    ea0b48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f5e>
      ea0b20:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0b25:	4c 89 f7             	mov    rdi,r14
      ea0b28:	e8 3d 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b2d:	eb 05                	jmp    ea0b34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f4a>
      ea0b2f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0b34:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0b3b:	00 
      ea0b3c:	e8 29 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### 0xea0cee: lea    rdi,[rsp+0xea0]
      ea0c9c:	eb 62                	jmp    ea0d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68116>
      ea0c9e:	48 89 c3             	mov    rbx,rax
      ea0ca1:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0ca8:	00 
      ea0ca9:	e8 c0 75 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0cae:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0cb3:	e9 5e 02 00 00       	jmp    ea0f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6832c>
      ea0cb8:	48 89 c3             	mov    rbx,rax
      ea0cbb:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0cc2:	00 
      ea0cc3:	e8 a2 70 04 00       	call   ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ea0cc8:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea0ccf:	00 
      ea0cd0:	e8 95 92 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0cd5:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0cda:	eb 05                	jmp    ea0ce1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x680f7>
      ea0cdc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0ce1:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0ce8:	00 
      ea0ce9:	e8 7c 70 04 00       	call   ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ea0cee:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0cf5:	00 
      ea0cf6:	e8 95 d1 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0cfb:	e9 16 02 00 00       	jmp    ea0f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6832c>
      ea0d00:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0d05:	e9 0c 02 00 00       	jmp    ea0f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6832c>
      ea0d0a:	48 89 c3             	mov    rbx,rax
      ea0d0d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0d14:	00 
      ea0d15:	e8 54 75 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0d1a:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0d1f:	e9 d8 01 00 00       	jmp    ea0efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68312>
      ea0d24:	49 89 c7             	mov    r15,rax
      ea0d27:	49 8b bc 24 80 01 00 	mov    rdi,QWORD PTR [r12+0x180]
      ea0d2e:	00 
      ea0d2f:	e8 52 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d34:	49 8b bc 24 70 01 00 	mov    rdi,QWORD PTR [r12+0x170]
      ea0d3b:	00 
      ea0d3c:	e8 45 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d41:	4c 89 ef             	mov    rdi,r13
      ea0d44:	e8 21 92 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0d49:	48 89 df             	mov    rdi,rbx
      ea0d4c:	e8 19 92 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0d51:	49 8b 7c 24 48       	mov    rdi,QWORD PTR [r12+0x48]
      ea0d56:	e8 2b d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d5b:	49 8b 7c 24 38       	mov    rdi,QWORD PTR [r12+0x38]
      ea0d60:	e8 21 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d65:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      ea0d6a:	e8 17 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d6f:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0d76:	00 
      ea0d77:	e8 4e 95 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea0d7c:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      ea0d81:	eb 05                	jmp    ea0d88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6819e>
      ea0d83:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0d88:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0d8f:	00 
      ea0d90:	e8 8b d1 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea0d95:	eb 67                	jmp    ea0dfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68214>
      ea0d97:	48 89 c3             	mov    rbx,rax
      ea0d9a:	48 8b bc 24 d0 11 00 	mov    rdi,QWORD PTR [rsp+0x11d0]
      ea0da1:	00 
      ea0da2:	e8 df d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0da7:	48 8b bc 24 c0 11 00 	mov    rdi,QWORD PTR [rsp+0x11c0]
      ea0dae:	00 
      ea0daf:	e8 d2 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0xea0d6f: lea    rdi,[rsp+0xea0]
      ea0d15:	e8 54 75 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0d1a:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0d1f:	e9 d8 01 00 00       	jmp    ea0efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68312>
      ea0d24:	49 89 c7             	mov    r15,rax
      ea0d27:	49 8b bc 24 80 01 00 	mov    rdi,QWORD PTR [r12+0x180]
      ea0d2e:	00 
      ea0d2f:	e8 52 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d34:	49 8b bc 24 70 01 00 	mov    rdi,QWORD PTR [r12+0x170]
      ea0d3b:	00 
      ea0d3c:	e8 45 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d41:	4c 89 ef             	mov    rdi,r13
      ea0d44:	e8 21 92 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0d49:	48 89 df             	mov    rdi,rbx
      ea0d4c:	e8 19 92 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0d51:	49 8b 7c 24 48       	mov    rdi,QWORD PTR [r12+0x48]
      ea0d56:	e8 2b d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d5b:	49 8b 7c 24 38       	mov    rdi,QWORD PTR [r12+0x38]
      ea0d60:	e8 21 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d65:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      ea0d6a:	e8 17 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d6f:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0d76:	00 
      ea0d77:	e8 4e 95 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea0d7c:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      ea0d81:	eb 05                	jmp    ea0d88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6819e>
      ea0d83:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0d88:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0d8f:	00 
      ea0d90:	e8 8b d1 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea0d95:	eb 67                	jmp    ea0dfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68214>
      ea0d97:	48 89 c3             	mov    rbx,rax
      ea0d9a:	48 8b bc 24 d0 11 00 	mov    rdi,QWORD PTR [rsp+0x11d0]
      ea0da1:	00 
      ea0da2:	e8 df d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0da7:	48 8b bc 24 c0 11 00 	mov    rdi,QWORD PTR [rsp+0x11c0]
      ea0dae:	00 
      ea0daf:	e8 d2 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0db4:	4c 89 ff             	mov    rdi,r15
      ea0db7:	e8 ae 91 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0dbc:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0dc1:	eb 05                	jmp    ea0dc8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x681de>
      ea0dc3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0dc8:	4c 89 ef             	mov    rdi,r13
      ea0dcb:	e8 9a 91 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0dd0:	eb 05                	jmp    ea0dd7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x681ed>
      ea0dd2:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0dd7:	48 8b bc 24 98 10 00 	mov    rdi,QWORD PTR [rsp+0x1098]
      ea0dde:	00 
      ea0ddf:	e8 a2 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0de4:	48 8b bc 24 88 10 00 	mov    rdi,QWORD PTR [rsp+0x1088]
      ea0deb:	00 
      ea0dec:	e8 95 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0df1:	48 8b bc 24 78 10 00 	mov    rdi,QWORD PTR [rsp+0x1078]
      ea0df8:	00 
      ea0df9:	e8 88 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0dfe:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea0e05:	00 
      ea0e06:	e8 5f 91 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0e0b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0e12:	00 
      ea0e13:	e8 08 d1 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea0e18:	e9 d2 00 00 00       	jmp    ea0eef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68305>
      ea0e1d:	49 89 c7             	mov    r15,rax
      ea0e20:	49 8b bc 24 80 01 00 	mov    rdi,QWORD PTR [r12+0x180]
      ea0e27:	00 
      ea0e28:	e8 59 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0xea11b1: lea    rdi,[rsp+0xea0]
      ea115b:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      ea1162:	48 89 df             	mov    rdi,rbx
      ea1165:	e9 80 00 00 00       	jmp    ea11ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68600>
      ea116a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea116f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1176:	00 
      ea1177:	e8 f2 70 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea117c:	eb 61                	jmp    ea11df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685f5>
      ea117e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1183:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea118a:	00 
      ea118b:	e8 74 2d 06 00       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
      ea1190:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1197:	00 
      ea1198:	e8 cd 8d bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea119d:	eb 05                	jmp    ea11a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685ba>
      ea119f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea11a4:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea11ab:	00 
      ea11ac:	e8 53 2d 06 00       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
      ea11b1:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea11b8:	00 
      ea11b9:	e8 d2 cc 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea11be:	eb 1f                	jmp    ea11df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685f5>
      ea11c0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea11c5:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea11cb:	66 49 0f 3a 16 c5 01 	pextrq r13,xmm0,0x1
      ea11d2:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
      ea11d8:	66 49 0f 3a 16 c4 01 	pextrq r12,xmm0,0x1
      ea11df:	4c 89 ef             	mov    rdi,r13
      ea11e2:	e8 9f d2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea11e7:	4c 89 e7             	mov    rdi,r12
      ea11ea:	e8 97 d2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea11ef:	eb 27                	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea11f1:	eb 0c                	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea11f3:	eb 1e                	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea11f5:	eb 08                	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea11f7:	eb 1a                	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea11f9:	eb 04                	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea11fb:	eb 16                	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea11fd:	eb 14                	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea11ff:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1204:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea120b:	00 
      ea120c:	e8 5d 70 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea1211:	eb 05                	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea1213:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1218:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea121f:	00 
      ea1220:	e8 49 70 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea1225:	e9 22 06 00 00       	jmp    ea184c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c62>
      ea122a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea122f:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      ea1236:	00 
      ea1237:	e8 8e 90 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea123c:	eb 05                	jmp    ea1243 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68659>
      ea123e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1243:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea124a:	00 
      ea124b:	e8 02 79 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea1250:	eb 05                	jmp    ea1257 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6866d>
      ea1252:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1257:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea125e:	00 
      ea125f:	e8 06 8d bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1264:	eb 19                	jmp    ea127f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68695>

### 0xea1257: lea    rdi,[rsp+0xea0]
      ea1204:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea120b:	00 
      ea120c:	e8 5d 70 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea1211:	eb 05                	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea1213:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1218:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea121f:	00 
      ea1220:	e8 49 70 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea1225:	e9 22 06 00 00       	jmp    ea184c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c62>
      ea122a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea122f:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      ea1236:	00 
      ea1237:	e8 8e 90 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea123c:	eb 05                	jmp    ea1243 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68659>
      ea123e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1243:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea124a:	00 
      ea124b:	e8 02 79 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea1250:	eb 05                	jmp    ea1257 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6866d>
      ea1252:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1257:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea125e:	00 
      ea125f:	e8 06 8d bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1264:	eb 19                	jmp    ea127f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68695>
      ea1266:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea126b:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1272:	00 
      ea1273:	e8 52 90 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea1278:	eb 05                	jmp    ea127f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68695>
      ea127a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea127f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1286:	00 
      ea1287:	e8 c6 78 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea128c:	48 8d bc 24 88 01 00 	lea    rdi,[rsp+0x188]
      ea1293:	00 
      ea1294:	e8 f7 cb 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea1299:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea12a0:	00 
      ea12a1:	e8 ac 78 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea12a6:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea12ad:	00 
      ea12ae:	e8 9f 78 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea12b3:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea12ba:	00 
      ea12bb:	e8 92 78 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea12c0:	e9 bd 00 00 00       	jmp    ea1382 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68798>
      ea12c5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12ca:	eb c0                	jmp    ea128c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686a2>
      ea12cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12d1:	eb c6                	jmp    ea1299 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686af>
      ea12d3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12d8:	eb cc                	jmp    ea12a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686bc>
      ea12da:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12df:	eb d2                	jmp    ea12b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686c9>
      ea12e1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12e6:	48 8b bc 24 08 10 00 	mov    rdi,QWORD PTR [rsp+0x1008]
      ea12ed:	00 
      ea12ee:	e8 93 d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea12f3:	48 8b bc 24 f8 0f 00 	mov    rdi,QWORD PTR [rsp+0xff8]
      ea12fa:	00 
      ea12fb:	e8 86 d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1300:	48 8b bc 24 e8 0f 00 	mov    rdi,QWORD PTR [rsp+0xfe8]
      ea1307:	00 
      ea1308:	e8 79 d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea130d:	48 8b bc 24 d8 0f 00 	mov    rdi,QWORD PTR [rsp+0xfd8]
      ea1314:	00 

### 0xea1621: lea    rdi,[rsp+0xea0]
      ea15ca:	e8 b7 ce bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea15cf:	31 ff                	xor    edi,edi
      ea15d1:	e8 b0 ce bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea15d6:	e9 b4 05 00 00       	jmp    ea1b8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa5>
      ea15db:	e9 aa 05 00 00       	jmp    ea1b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa0>
      ea15e0:	e9 4b 05 00 00       	jmp    ea1b30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f46>
      ea15e5:	e9 61 05 00 00       	jmp    ea1b4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f61>
      ea15ea:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea15ef:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea15f6:	00 
      ea15f7:	e8 72 6c ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea15fc:	eb 51                	jmp    ea164f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68a65>
      ea15fe:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1603:	e9 1b 06 00 00       	jmp    ea1c23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69039>
      ea1608:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea160d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1614:	00 
      ea1615:	e8 50 89 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea161a:	eb 12                	jmp    ea162e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68a44>
      ea161c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1621:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea1628:	00 
      ea1629:	e8 e2 14 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea162e:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1635:	00 
      ea1636:	e8 2f 89 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea163b:	eb 12                	jmp    ea164f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68a65>
      ea163d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1642:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1649:	00 
      ea164a:	e8 c1 14 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea164f:	48 89 df             	mov    rdi,rbx
      ea1652:	e8 2f ce bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1657:	e9 3c 06 00 00       	jmp    ea1c98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690ae>
      ea165c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1661:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1668:	00 
      ea1669:	e8 fc 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea166e:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1675:	00 
      ea1676:	e8 ef 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea167b:	e9 01 07 00 00       	jmp    ea1d81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69197>
      ea1680:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1685:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea168c:	00 
      ea168d:	e8 dc 6b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea1692:	e9 9b 01 00 00       	jmp    ea1832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c48>
      ea1697:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea169c:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea16a3:	00 
      ea16a4:	e8 c1 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16a9:	e9 b2 00 00 00       	jmp    ea1760 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b76>
      ea16ae:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16b3:	48 89 ef             	mov    rdi,rbp
      ea16b6:	e8 af 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16bb:	eb 05                	jmp    ea16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ad8>
      ea16bd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16c2:	4c 89 f7             	mov    rdi,r14
      ea16c5:	e8 a0 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16ca:	eb 05                	jmp    ea16d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ae7>
      ea16cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16d1:	48 89 df             	mov    rdi,rbx
      ea16d4:	e8 91 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16d9:	eb 05                	jmp    ea16e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68af6>
      ea16db:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16e0:	4c 89 ff             	mov    rdi,r15

### 0xea1c57: lea    rdi,[rsp+0xea0]
      ea1c03:	e8 7e c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c08:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      ea1c0d:	e8 74 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c12:	31 c0                	xor    eax,eax
      ea1c14:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      ea1c19:	31 c0                	xor    eax,eax
      ea1c1b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      ea1c22:	00 
      ea1c23:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      ea1c2a:	00 
      ea1c2b:	e8 56 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c30:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      ea1c37:	00 
      ea1c38:	e8 2d 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c3d:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      ea1c44:	00 
      ea1c45:	e8 20 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c4a:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      ea1c51:	00 
      ea1c52:	e8 13 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c57:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea1c5e:	00 
      ea1c5f:	e8 06 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c64:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1c6b:	00 
      ea1c6c:	e8 f9 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c71:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      ea1c78:	00 
      ea1c79:	e8 08 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c7e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea1c85:	00 
      ea1c86:	e8 df 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1cb4:	e8 cd c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cb9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1cc0:	00 
      ea1cc1:	e8 c0 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cc6:	31 c0                	xor    eax,eax
      ea1cc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea1ccd:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ea1cd2:	e8 af c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cd7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      ea1cdc:	e8 a5 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ce1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      ea1ce6:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      ea1ceb:	e8 96 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cf0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea1cf7:	00 
      ea1cf8:	e8 27 cd fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea1cfd:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      ea1d04:	00 00 
      ea1d06:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1d0d:	e8 74 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d12:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1d17:	e8 6a c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d1c:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea1d23:	00 
      ea1d24:	e8 41 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

## rsp+0x1060 shared-pointer pair provenance
### READ 0xe9a0e3: lea    r15,[rsp+0x1060]
      e9a09a:	66 0f ef c0          	pxor   xmm0,xmm0
      e9a09e:	66 41 0f 7f 85 30 01 	movdqa XMMWORD PTR [r13+0x130],xmm0
      e9a0a5:	00 00 
      e9a0a7:	49 83 a5 40 01 00 00 	and    QWORD PTR [r13+0x140],0x0
      e9a0ae:	00 
      e9a0af:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      e9a0b4:	4d 8d b5 48 01 00 00 	lea    r14,[r13+0x148]
      e9a0bb:	4c 89 f7             	mov    rdi,r14
      e9a0be:	e8 33 f9 93 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e9a0c3:	4c 8d 84 24 e0 03 00 	lea    r8,[rsp+0x3e0]
      e9a0ca:	00 
      e9a0cb:	49 89 28             	mov    QWORD PTR [r8],rbp
      e9a0ce:	48 8d 35 bc 2f c0 ff 	lea    rsi,[rip+0xffffffffffc02fbc]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e9a0d5:	48 8d 0d 7e b5 00 00 	lea    rcx,[rip+0xb57e]        # ea565a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ca70>
      e9a0dc:	31 c0                	xor    eax,eax
      e9a0de:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      e9a0e3:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9a0ea:	00 
      e9a0eb:	6a 08                	push   0x8
      e9a0ed:	41 59                	pop    r9
      e9a0ef:	4c 89 ff             	mov    rdi,r15
      e9a0f2:	31 d2                	xor    edx,edx
      e9a0f4:	e8 9b 06 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e9a0f9:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9a100:	00 
      e9a101:	4c 89 e7             	mov    rdi,r12
      e9a104:	4c 89 fe             	mov    rsi,r15
      e9a107:	e8 2e 06 94 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      e9a10c:	4c 8d ac 24 d0 0e 00 	lea    r13,[rsp+0xed0]
      e9a113:	00 
      e9a114:	4c 89 ef             	mov    rdi,r13
      e9a117:	48 89 de             	mov    rsi,rbx
      e9a11a:	4c 89 e2             	mov    rdx,r12
      e9a11d:	e8 a8 fe 93 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      e9a122:	4c 89 e7             	mov    rdi,r12
      e9a125:	e8 be 06 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9a12a:	4c 89 f7             	mov    rdi,r14
      e9a12d:	4c 89 ee             	mov    rsi,r13
      e9a130:	e8 bd fa 93 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e9a135:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      e9a139:	e8 48 43 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9a13e:	4c 89 ff             	mov    rdi,r15
      e9a141:	e8 a2 06 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9a146:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9a14d:	00 
      e9a14e:	e8 17 fe bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9a153:	31 ff                	xor    edi,edi
      e9a155:	e8 c2 42 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9a15a:	4c 8b bc 24 48 12 00 	mov    r15,QWORD PTR [rsp+0x1248]

### READ 0xe9a5b6: lea    r15,[rsp+0x1060]
      e9a56f:	00 00 
      e9a571:	4c 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],r13
      e9a576:	49 83 a5 40 01 00 00 	and    QWORD PTR [r13+0x140],0x0
      e9a57d:	00 
      e9a57e:	48 89 ac 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rbp
      e9a585:	00 
      e9a586:	4c 8d b5 48 01 00 00 	lea    r14,[rbp+0x148]
      e9a58d:	4c 89 f7             	mov    rdi,r14
      e9a590:	e8 61 f4 93 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e9a595:	4c 8d 84 24 e0 03 00 	lea    r8,[rsp+0x3e0]
      e9a59c:	00 
      e9a59d:	4c 89 bc 24 48 01 00 	mov    QWORD PTR [rsp+0x148],r15
      e9a5a4:	00 
      e9a5a5:	4d 89 38             	mov    QWORD PTR [r8],r15
      e9a5a8:	48 8d 35 e2 2a c0 ff 	lea    rsi,[rip+0xffffffffffc02ae2]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e9a5af:	48 8d 0d f8 b4 00 00 	lea    rcx,[rip+0xb4f8]        # ea5aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6cec4>
      e9a5b6:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9a5bd:	00 
      e9a5be:	6a 08                	push   0x8
      e9a5c0:	41 59                	pop    r9
      e9a5c2:	4c 89 ff             	mov    rdi,r15
      e9a5c5:	31 d2                	xor    edx,edx
      e9a5c7:	e8 c8 01 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e9a5cc:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9a5d3:	00 
      e9a5d4:	4c 89 e7             	mov    rdi,r12
      e9a5d7:	4c 89 fe             	mov    rsi,r15
      e9a5da:	e8 5b 01 94 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      e9a5df:	4c 8d ac 24 d0 0e 00 	lea    r13,[rsp+0xed0]
      e9a5e6:	00 
      e9a5e7:	4c 89 ef             	mov    rdi,r13
      e9a5ea:	48 89 de             	mov    rsi,rbx
      e9a5ed:	4c 89 e2             	mov    rdx,r12
      e9a5f0:	e8 d5 f9 93 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      e9a5f5:	4c 89 e7             	mov    rdi,r12
      e9a5f8:	e8 eb 01 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9a5fd:	4c 89 f7             	mov    rdi,r14
      e9a600:	4c 89 ee             	mov    rsi,r13
      e9a603:	e8 ea f5 93 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e9a608:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      e9a60c:	e8 75 3e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9a611:	4c 89 ff             	mov    rdi,r15
      e9a614:	e8 cf 01 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9a619:	48 8d 9c 24 30 0b 00 	lea    rbx,[rsp+0xb30]
      e9a620:	00 
      e9a621:	48 89 df             	mov    rdi,rbx
      e9a624:	e8 41 f9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9a629:	31 ff                	xor    edi,edi
      e9a62b:	e8 ec 3d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>

### READ 0xe9a79f: lea    r15,[rsp+0x1060]
      e9a757:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
      e9a75c:	49 83 a5 40 01 00 00 	and    QWORD PTR [r13+0x140],0x0
      e9a763:	00 
      e9a764:	48 89 ac 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rbp
      e9a76b:	00 
      e9a76c:	4c 8d b5 48 01 00 00 	lea    r14,[rbp+0x148]
      e9a773:	4c 89 f7             	mov    rdi,r14
      e9a776:	e8 7b f2 93 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e9a77b:	4c 8d 84 24 e0 03 00 	lea    r8,[rsp+0x3e0]
      e9a782:	00 
      e9a783:	4c 89 bc 24 40 01 00 	mov    QWORD PTR [rsp+0x140],r15
      e9a78a:	00 
      e9a78b:	4d 89 38             	mov    QWORD PTR [r8],r15
      e9a78e:	48 8d 35 fc 28 c0 ff 	lea    rsi,[rip+0xffffffffffc028fc]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e9a795:	48 8d 0d 58 b6 00 00 	lea    rcx,[rip+0xb658]        # ea5df4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d20a>
      e9a79c:	45 31 ed             	xor    r13d,r13d
      e9a79f:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9a7a6:	00 
      e9a7a7:	6a 08                	push   0x8
      e9a7a9:	41 59                	pop    r9
      e9a7ab:	4c 89 ff             	mov    rdi,r15
      e9a7ae:	31 d2                	xor    edx,edx
      e9a7b0:	e8 df ff 93 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e9a7b5:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9a7bc:	00 
      e9a7bd:	4c 89 e7             	mov    rdi,r12
      e9a7c0:	4c 89 fe             	mov    rsi,r15
      e9a7c3:	e8 72 ff 93 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
      e9a7c8:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9a7cf:	00 
      e9a7d0:	48 89 ef             	mov    rdi,rbp
      e9a7d3:	48 89 de             	mov    rsi,rbx
      e9a7d6:	4c 89 e2             	mov    rdx,r12
      e9a7d9:	e8 ec f7 93 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
      e9a7de:	4c 89 e7             	mov    rdi,r12
      e9a7e1:	e8 02 00 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9a7e6:	4c 89 f7             	mov    rdi,r14
      e9a7e9:	48 89 ee             	mov    rsi,rbp
      e9a7ec:	e8 01 f4 93 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e9a7f1:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
      e9a7f5:	e8 8c 3c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9a7fa:	4c 89 ff             	mov    rdi,r15
      e9a7fd:	e8 e6 ff 93 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9a802:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9a809:	00 
      e9a80a:	e8 5b f7 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9a80f:	31 ff                	xor    edi,edi
      e9a811:	e8 06 3c c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9a816:	6a 20                	push   0x20

### READ 0xe9ad91: lea    rsi,[rsp+0x1060]
      e9ad52:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
      e9ad56:	48 89 df             	mov    rdi,rbx
      e9ad59:	48 83 c7 20          	add    rdi,0x20
      e9ad5d:	4c 89 f6             	mov    rsi,r14
      e9ad60:	e8 c7 1c fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e9ad65:	41 0f b7 47 40       	movzx  eax,WORD PTR [r15+0x40]
      e9ad6a:	66 89 43 50          	mov    WORD PTR [rbx+0x50],ax
      e9ad6e:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9ad75:	00 
      e9ad76:	4c 89 ff             	mov    rdi,r15
      e9ad79:	e8 66 ae c9 ff       	call   b35be4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82b84>
      e9ad7e:	48 83 bc 24 80 10 00 	cmp    QWORD PTR [rsp+0x1080],0x0
      e9ad85:	00 00 
      e9ad87:	74 5c                	je     e9ade5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x621fb>
      e9ad89:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ad90:	00 
      e9ad91:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9ad98:	00 
      e9ad99:	e8 06 de 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
      e9ad9e:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9ada5:	00 00 
      e9ada7:	6a 40                	push   0x40
      e9ada9:	5f                   	pop    rdi
      e9adaa:	e8 51 31 95 00       	call   17edf00 <_Znwm@plt>
      e9adaf:	48 89 c3             	mov    rbx,rax
      e9adb2:	48 8d 05 0f d9 9f 00 	lea    rax,[rip+0x9fd90f]        # 18986c8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5608>
      e9adb9:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9adbc:	48 89 df             	mov    rdi,rbx
      e9adbf:	48 83 c7 10          	add    rdi,0x10
      e9adc3:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9adca:	00 
      e9adcb:	4c 89 fe             	mov    rsi,r15
      e9adce:	e8 d1 dd 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
      e9add3:	48 89 9c 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rbx
      e9adda:	00 
      e9addb:	4c 89 ff             	mov    rdi,r15
      e9adde:	e8 87 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ade3:	eb 09                	jmp    e9adee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62204>
      e9ade5:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9adec:	00 00 
      e9adee:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      e9adf3:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9adfa:	00 
      e9adfb:	48 89 df             	mov    rdi,rbx
      e9adfe:	e8 67 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae03:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ae0a:	00 
      e9ae0b:	e8 5a f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae10:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]

### READ 0xe9adf3: lea    rbx,[rsp+0x1060]
      e9adb2:	48 8d 05 0f d9 9f 00 	lea    rax,[rip+0x9fd90f]        # 18986c8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5608>
      e9adb9:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9adbc:	48 89 df             	mov    rdi,rbx
      e9adbf:	48 83 c7 10          	add    rdi,0x10
      e9adc3:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9adca:	00 
      e9adcb:	4c 89 fe             	mov    rsi,r15
      e9adce:	e8 d1 dd 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
      e9add3:	48 89 9c 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rbx
      e9adda:	00 
      e9addb:	4c 89 ff             	mov    rdi,r15
      e9adde:	e8 87 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ade3:	eb 09                	jmp    e9adee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62204>
      e9ade5:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9adec:	00 00 
      e9adee:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      e9adf3:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9adfa:	00 
      e9adfb:	48 89 df             	mov    rdi,rbx
      e9adfe:	e8 67 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae03:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ae0a:	00 
      e9ae0b:	e8 5a f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae10:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ae16:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9ae1d:	e8 64 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae22:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9ae29:	00 
      e9ae2a:	e8 3b f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae2f:	31 ff                	xor    edi,edi
      e9ae31:	e8 50 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae36:	bf 00 01 00 00       	mov    edi,0x100
      e9ae3b:	e8 c0 30 95 00       	call   17edf00 <_Znwm@plt>
      e9ae40:	4c 8b bc 24 e8 12 00 	mov    r15,QWORD PTR [rsp+0x12e8]
      e9ae47:	00 
      e9ae48:	66 0f ef c0          	pxor   xmm0,xmm0
      e9ae4c:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9ae51:	48 8d 0d 48 67 99 00 	lea    rcx,[rip+0x996748]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>
      e9ae58:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9ae5b:	48 8d 68 20          	lea    rbp,[rax+0x20]
      e9ae5f:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9ae66:	00 
      e9ae67:	48 8d b4 24 a0 06 00 	lea    rsi,[rsp+0x6a0]
      e9ae6e:	00 
      e9ae6f:	49 89 c6             	mov    r14,rax
      e9ae72:	4c 89 e7             	mov    rdi,r12
      e9ae75:	e8 6a b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
      e9ae7a:	48 8d 05 57 67 99 00 	lea    rax,[rip+0x996757]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>
      e9ae81:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax

### WRITE 0xe9ae81: mov    QWORD PTR [rsp+0x1060],rax
      e9ae3b:	e8 c0 30 95 00       	call   17edf00 <_Znwm@plt>
      e9ae40:	4c 8b bc 24 e8 12 00 	mov    r15,QWORD PTR [rsp+0x12e8]
      e9ae47:	00 
      e9ae48:	66 0f ef c0          	pxor   xmm0,xmm0
      e9ae4c:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9ae51:	48 8d 0d 48 67 99 00 	lea    rcx,[rip+0x996748]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>
      e9ae58:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9ae5b:	48 8d 68 20          	lea    rbp,[rax+0x20]
      e9ae5f:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9ae66:	00 
      e9ae67:	48 8d b4 24 a0 06 00 	lea    rsi,[rsp+0x6a0]
      e9ae6e:	00 
      e9ae6f:	49 89 c6             	mov    r14,rax
      e9ae72:	4c 89 e7             	mov    rdi,r12
      e9ae75:	e8 6a b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
      e9ae7a:	48 8d 05 57 67 99 00 	lea    rax,[rip+0x996757]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>
      e9ae81:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ae88:	00 
      e9ae89:	4c 89 bc 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],r15
      e9ae90:	00 
      e9ae91:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9ae98:	00 
      e9ae99:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
      e9ae9e:	48 89 ef             	mov    rdi,rbp
      e9aea1:	4c 89 e6             	mov    rsi,r12
      e9aea4:	e8 3b b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
      e9aea9:	49 8d 7e 50          	lea    rdi,[r14+0x50]
      e9aead:	48 89 de             	mov    rsi,rbx
      e9aeb0:	e8 73 b4 00 00       	call   ea6328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d73e>
      e9aeb5:	66 0f ef c0          	pxor   xmm0,xmm0
      e9aeb9:	66 41 0f 7f 86 90 00 	movdqa XMMWORD PTR [r14+0x90],xmm0
      e9aec0:	00 00 
      e9aec2:	66 41 0f 7f 86 80 00 	movdqa XMMWORD PTR [r14+0x80],xmm0
      e9aec9:	00 00 
      e9aecb:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e9aed0:	41 89 86 a0 00 00 00 	mov    DWORD PTR [r14+0xa0],eax
      e9aed7:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
      e9aede:	00 00 
      e9aee0:	f3 41 0f 7f 86 b8 00 	movdqu XMMWORD PTR [r14+0xb8],xmm0
      e9aee7:	00 00 
      e9aee9:	41 89 86 c8 00 00 00 	mov    DWORD PTR [r14+0xc8],eax
      e9aef0:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
      e9aef7:	00 00 
      e9aef9:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
      e9af00:	00 00 
      e9af02:	4c 89 74 24 78       	mov    QWORD PTR [rsp+0x78],r14
      e9af07:	41 89 86 f0 00 00 00 	mov    DWORD PTR [r14+0xf0],eax
      e9af0e:	48 89 df             	mov    rdi,rbx
      e9af11:	e8 54 f0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### READ 0xe9b166: lea    rsi,[rsp+0x1060]
      e9b122:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
      e9b127:	48 85 db             	test   rbx,rbx
      e9b12a:	74 05                	je     e9b131 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62547>
      e9b12c:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9b131:	40 88 68 28          	mov    BYTE PTR [rax+0x28],bpl
      e9b135:	48 89 84 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rax
      e9b13c:	00 
      e9b13d:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9b144:	00 
      e9b145:	e8 c6 79 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e9b14a:	48 8d 35 bf 9e 53 ff 	lea    rsi,[rip+0xffffffffff539ebf]        # 3d5010 <_ZTSN5boost17bad_function_callE@@Base+0x2356>
      e9b151:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      e9b158:	00 
      e9b159:	e8 e2 2d 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9b15e:	48 8d ac 24 30 0b 00 	lea    rbp,[rsp+0xb30]
      e9b165:	00 
      e9b166:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9b16d:	00 
      e9b16e:	48 89 ef             	mov    rdi,rbp
      e9b171:	e8 9c dc ce ff       	call   b88e12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5db2>
      e9b176:	4c 8d ac 24 d0 0e 00 	lea    r13,[rsp+0xed0]
      e9b17d:	00 
      e9b17e:	4c 8d b4 24 00 0d 00 	lea    r14,[rsp+0xd00]
      e9b185:	00 
      e9b186:	4c 89 ef             	mov    rdi,r13
      e9b189:	4c 89 f6             	mov    rsi,r14
      e9b18c:	e8 c5 dc ce ff       	call   b88e56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5df6>
      e9b191:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9b198:	00 
      e9b199:	4c 8d bc 24 d0 0c 00 	lea    r15,[rsp+0xcd0]
      e9b1a0:	00 
      e9b1a1:	4c 89 e7             	mov    rdi,r12
      e9b1a4:	4c 89 fe             	mov    rsi,r15
      e9b1a7:	48 89 ea             	mov    rdx,rbp
      e9b1aa:	4c 89 e9             	mov    rcx,r13
      e9b1ad:	e8 94 cf ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9b1b2:	4c 89 ef             	mov    rdi,r13
      e9b1b5:	e8 b0 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b1ba:	48 89 ef             	mov    rdi,rbp
      e9b1bd:	e8 a8 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b1c2:	4c 89 ff             	mov    rdi,r15
      e9b1c5:	e8 c6 2c 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9b1ca:	4c 89 f7             	mov    rdi,r14
      e9b1cd:	e8 98 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b1d2:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9b1d9:	00 
      e9b1da:	e8 8b ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b1df:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9b1e6:	00 

### READ 0xe9b1d2: lea    rdi,[rsp+0x1060]
      e9b198:	00 
      e9b199:	4c 8d bc 24 d0 0c 00 	lea    r15,[rsp+0xcd0]
      e9b1a0:	00 
      e9b1a1:	4c 89 e7             	mov    rdi,r12
      e9b1a4:	4c 89 fe             	mov    rsi,r15
      e9b1a7:	48 89 ea             	mov    rdx,rbp
      e9b1aa:	4c 89 e9             	mov    rcx,r13
      e9b1ad:	e8 94 cf ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9b1b2:	4c 89 ef             	mov    rdi,r13
      e9b1b5:	e8 b0 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b1ba:	48 89 ef             	mov    rdi,rbp
      e9b1bd:	e8 a8 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b1c2:	4c 89 ff             	mov    rdi,r15
      e9b1c5:	e8 c6 2c 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9b1ca:	4c 89 f7             	mov    rdi,r14
      e9b1cd:	e8 98 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b1d2:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9b1d9:	00 
      e9b1da:	e8 8b ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b1df:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9b1e6:	00 
      e9b1e7:	4c 89 e6             	mov    rsi,r12
      e9b1ea:	e8 09 3f ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9b1ef:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9b1f6:	00 
      e9b1f7:	e8 72 d0 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9b1fc:	48 89 df             	mov    rdi,rbx
      e9b1ff:	e8 82 32 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9b204:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
      e9b209:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
      e9b210:	00 
      e9b211:	48 8b 84 24 60 13 00 	mov    rax,QWORD PTR [rsp+0x1360]
      e9b218:	00 
      e9b219:	48 8b 8c 24 18 13 00 	mov    rcx,QWORD PTR [rsp+0x1318]
      e9b220:	00 
      e9b221:	4c 8b 84 24 00 13 00 	mov    r8,QWORD PTR [rsp+0x1300]
      e9b228:	00 
      e9b229:	48 8b 9c 24 f8 12 00 	mov    rbx,QWORD PTR [rsp+0x12f8]
      e9b230:	00 
      e9b231:	48 8b b4 24 f0 12 00 	mov    rsi,QWORD PTR [rsp+0x12f0]
      e9b238:	00 
      e9b239:	48 8d 15 e0 63 99 00 	lea    rdx,[rip+0x9963e0]        # 1831620 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x35b8>
      e9b240:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      e9b247:	00 
      e9b248:	48 89 17             	mov    QWORD PTR [rdi],rdx
      e9b24b:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      e9b24f:	48 89 7f 20          	mov    QWORD PTR [rdi+0x20],rdi
      e9b253:	48 8d 05 56 77 99 00 	lea    rax,[rip+0x997756]        # 18329b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4948>
      e9b25a:	48 89 84 24 d0 0e 00 	mov    QWORD PTR [rsp+0xed0],rax

### WRITE 0xe9b701: mov    QWORD PTR [rsp+0x1060],r12
      e9b6bd:	66 0f ef c0          	pxor   xmm0,xmm0
      e9b6c1:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9b6c6:	48 8d 05 6b 91 99 00 	lea    rax,[rip+0x99916b]        # 1834838 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x67d0>
      e9b6cd:	49 89 07             	mov    QWORD PTR [r15],rax
      e9b6d0:	4c 89 fd             	mov    rbp,r15
      e9b6d3:	48 83 c5 18          	add    rbp,0x18
      e9b6d7:	41 b8 e8 03 00 00    	mov    r8d,0x3e8
      e9b6dd:	48 89 ef             	mov    rdi,rbp
      e9b6e0:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
      e9b6e5:	48 8b 94 24 f0 00 00 	mov    rdx,QWORD PTR [rsp+0xf0]
      e9b6ec:	00 
      e9b6ed:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      e9b6f4:	00 
      e9b6f5:	e8 b4 e8 04 00       	call   ee9fae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb13c4>
      e9b6fa:	31 ff                	xor    edi,edi
      e9b6fc:	e8 1b 2d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9b701:	4c 89 a4 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],r12
      e9b708:	00 
      e9b709:	48 89 9c 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rbx
      e9b710:	00 
      e9b711:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9b716:	48 89 ac 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],rbp
      e9b71d:	00 
      e9b71e:	4c 89 bc 24 78 10 00 	mov    QWORD PTR [rsp+0x1078],r15
      e9b725:	00 
      e9b726:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9b72b:	48 83 a4 24 90 07 00 	and    QWORD PTR [rsp+0x790],0x0
      e9b732:	00 00 
      e9b734:	6a 28                	push   0x28
      e9b736:	5f                   	pop    rdi
      e9b737:	e8 c4 27 95 00       	call   17edf00 <_Znwm@plt>
      e9b73c:	48 8d 8c 24 70 10 00 	lea    rcx,[rsp+0x1070]
      e9b743:	00 
      e9b744:	48 8d 15 5d 90 99 00 	lea    rdx,[rip+0x99905d]        # 18347a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6740>
      e9b74b:	48 89 10             	mov    QWORD PTR [rax],rdx
      e9b74e:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      e9b752:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
      e9b756:	66 0f ef c0          	pxor   xmm0,xmm0
      e9b75a:	66 0f 7f 41 f0       	movdqa XMMWORD PTR [rcx-0x10],xmm0
      e9b75f:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
      e9b763:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
      e9b767:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
      e9b76b:	4c 8d b4 24 70 07 00 	lea    r14,[rsp+0x770]
      e9b772:	00 
      e9b773:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      e9b777:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9b77e:	00 
      e9b77f:	e8 8c 73 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e9b784:	4c 89 ff             	mov    rdi,r15

### READ 0xe9b777: lea    rdi,[rsp+0x1060]
      e9b736:	5f                   	pop    rdi
      e9b737:	e8 c4 27 95 00       	call   17edf00 <_Znwm@plt>
      e9b73c:	48 8d 8c 24 70 10 00 	lea    rcx,[rsp+0x1070]
      e9b743:	00 
      e9b744:	48 8d 15 5d 90 99 00 	lea    rdx,[rip+0x99905d]        # 18347a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6740>
      e9b74b:	48 89 10             	mov    QWORD PTR [rax],rdx
      e9b74e:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      e9b752:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
      e9b756:	66 0f ef c0          	pxor   xmm0,xmm0
      e9b75a:	66 0f 7f 41 f0       	movdqa XMMWORD PTR [rcx-0x10],xmm0
      e9b75f:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
      e9b763:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
      e9b767:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
      e9b76b:	4c 8d b4 24 70 07 00 	lea    r14,[rsp+0x770]
      e9b772:	00 
      e9b773:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      e9b777:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9b77e:	00 
      e9b77f:	e8 8c 73 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e9b784:	4c 89 ff             	mov    rdi,r15
      e9b787:	e8 fa 2c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9b78c:	48 89 df             	mov    rdi,rbx
      e9b78f:	e8 f2 2c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9b794:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9b79b:	00 
      e9b79c:	6a 3c                	push   0x3c
      e9b79e:	5a                   	pop    rdx
      e9b79f:	4c 89 f6             	mov    rsi,r14
      e9b7a2:	e8 97 f7 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
      e9b7a7:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9b7ae:	00 
      e9b7af:	e8 b6 e7 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9b7b4:	48 8b 84 24 50 05 00 	mov    rax,QWORD PTR [rsp+0x550]
      e9b7bb:	00 
      e9b7bc:	48 3b 84 24 58 05 00 	cmp    rax,QWORD PTR [rsp+0x558]
      e9b7c3:	00 
      e9b7c4:	74 50                	je     e9b816 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62c2c>
      e9b7c6:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9b7cd:	00 
      e9b7ce:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
      e9b7d5:	00 
      e9b7d6:	e8 09 f9 3e 00       	call   128b0e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd0668>
      e9b7db:	eb 42                	jmp    e9b81f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62c35>
      e9b7dd:	48 8d 35 13 ac 59 ff 	lea    rsi,[rip+0xffffffffff59ac13]        # 4363f7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5be46>
      e9b7e4:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9b7eb:	00 
      e9b7ec:	e8 5e 00 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e9b7f1:	84 c0                	test   al,al
      e9b7f3:	0f 84 14 01 00 00    	je     e9b90d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d23>

### READ 0xe9b837: lea    rdi,[rsp+0x1060]
      e9b7f3:	0f 84 14 01 00 00    	je     e9b90d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d23>
      e9b7f9:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9b800:	00 
      e9b801:	e8 2a b5 c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e9b806:	6a 02                	push   0x2
      e9b808:	58                   	pop    rax
      e9b809:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      e9b80e:	45 31 ed             	xor    r13d,r13d
      e9b811:	e9 f0 ea ff ff       	jmp    e9a306 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6171c>
      e9b816:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9b81d:	00 00 
      e9b81f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9b823:	e8 80 aa 00 00       	call   ea62a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6be>
      e9b828:	84 c0                	test   al,al
      e9b82a:	0f 84 85 00 00 00    	je     e9b8b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ccb>
      e9b830:	48 8d 35 45 67 5b ff 	lea    rsi,[rip+0xffffffffff5b6745]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e9b837:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9b83e:	00 
      e9b83f:	e8 3a e2 bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e9b844:	48 8b 84 24 78 12 00 	mov    rax,QWORD PTR [rsp+0x1278]
      e9b84b:	00 
      e9b84c:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      e9b84f:	48 8d 15 aa 3e b5 00 	lea    rdx,[rip+0xb53eaa]        # 19ef700 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xe30>
      e9b856:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9b85d:	00 
      e9b85e:	48 8d 8c 24 60 10 00 	lea    rcx,[rsp+0x1060]
      e9b865:	00 
      e9b866:	48 89 df             	mov    rdi,rbx
      e9b869:	e8 82 77 77 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
      e9b86e:	48 89 df             	mov    rdi,rbx
      e9b871:	e8 ae 32 83 00       	call   16ceb24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82c90>
      e9b876:	89 c3                	mov    ebx,eax
      e9b878:	6a 40                	push   0x40
      e9b87a:	5f                   	pop    rdi
      e9b87b:	e8 80 26 95 00       	call   17edf00 <_Znwm@plt>
      e9b880:	49 89 c5             	mov    r13,rax
      e9b883:	0f b6 f3             	movzx  esi,bl
      e9b886:	48 8d 94 24 30 0b 00 	lea    rdx,[rsp+0xb30]
      e9b88d:	00 
      e9b88e:	48 89 c7             	mov    rdi,rax
      e9b891:	e8 34 2e 3f 00       	call   128e6ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3c4e>
      e9b896:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9b89d:	00 
      e9b89e:	e8 ed 25 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9b8a3:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9b8aa:	00 
      e9b8ab:	e8 e0 25 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9b8b0:	e9 0b 01 00 00       	jmp    e9b9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62dd6>
      e9b8b5:	6a 40                	push   0x40

### READ 0xe9b85e: lea    rcx,[rsp+0x1060]
      e9b816:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9b81d:	00 00 
      e9b81f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9b823:	e8 80 aa 00 00       	call   ea62a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6be>
      e9b828:	84 c0                	test   al,al
      e9b82a:	0f 84 85 00 00 00    	je     e9b8b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ccb>
      e9b830:	48 8d 35 45 67 5b ff 	lea    rsi,[rip+0xffffffffff5b6745]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e9b837:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9b83e:	00 
      e9b83f:	e8 3a e2 bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e9b844:	48 8b 84 24 78 12 00 	mov    rax,QWORD PTR [rsp+0x1278]
      e9b84b:	00 
      e9b84c:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      e9b84f:	48 8d 15 aa 3e b5 00 	lea    rdx,[rip+0xb53eaa]        # 19ef700 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xe30>
      e9b856:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9b85d:	00 
      e9b85e:	48 8d 8c 24 60 10 00 	lea    rcx,[rsp+0x1060]
      e9b865:	00 
      e9b866:	48 89 df             	mov    rdi,rbx
      e9b869:	e8 82 77 77 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
      e9b86e:	48 89 df             	mov    rdi,rbx
      e9b871:	e8 ae 32 83 00       	call   16ceb24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82c90>
      e9b876:	89 c3                	mov    ebx,eax
      e9b878:	6a 40                	push   0x40
      e9b87a:	5f                   	pop    rdi
      e9b87b:	e8 80 26 95 00       	call   17edf00 <_Znwm@plt>
      e9b880:	49 89 c5             	mov    r13,rax
      e9b883:	0f b6 f3             	movzx  esi,bl
      e9b886:	48 8d 94 24 30 0b 00 	lea    rdx,[rsp+0xb30]
      e9b88d:	00 
      e9b88e:	48 89 c7             	mov    rdi,rax
      e9b891:	e8 34 2e 3f 00       	call   128e6ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3c4e>
      e9b896:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9b89d:	00 
      e9b89e:	e8 ed 25 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9b8a3:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9b8aa:	00 
      e9b8ab:	e8 e0 25 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9b8b0:	e9 0b 01 00 00       	jmp    e9b9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62dd6>
      e9b8b5:	6a 40                	push   0x40
      e9b8b7:	5f                   	pop    rdi
      e9b8b8:	e8 43 26 95 00       	call   17edf00 <_Znwm@plt>
      e9b8bd:	48 89 c3             	mov    rbx,rax
      e9b8c0:	49 89 c5             	mov    r13,rax
      e9b8c3:	48 8d 05 c6 58 9c 00 	lea    rax,[rip+0x9c58c6]        # 1861190 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d878>
      e9b8ca:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9b8cd:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
      e9b8d2:	48 83 bc 24 50 0b 00 	cmp    QWORD PTR [rsp+0xb50],0x0
      e9b8d9:	00 00 

### READ 0xe9b8a3: lea    rdi,[rsp+0x1060]
      e9b869:	e8 82 77 77 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
      e9b86e:	48 89 df             	mov    rdi,rbx
      e9b871:	e8 ae 32 83 00       	call   16ceb24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82c90>
      e9b876:	89 c3                	mov    ebx,eax
      e9b878:	6a 40                	push   0x40
      e9b87a:	5f                   	pop    rdi
      e9b87b:	e8 80 26 95 00       	call   17edf00 <_Znwm@plt>
      e9b880:	49 89 c5             	mov    r13,rax
      e9b883:	0f b6 f3             	movzx  esi,bl
      e9b886:	48 8d 94 24 30 0b 00 	lea    rdx,[rsp+0xb30]
      e9b88d:	00 
      e9b88e:	48 89 c7             	mov    rdi,rax
      e9b891:	e8 34 2e 3f 00       	call   128e6ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3c4e>
      e9b896:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9b89d:	00 
      e9b89e:	e8 ed 25 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9b8a3:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9b8aa:	00 
      e9b8ab:	e8 e0 25 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9b8b0:	e9 0b 01 00 00       	jmp    e9b9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62dd6>
      e9b8b5:	6a 40                	push   0x40
      e9b8b7:	5f                   	pop    rdi
      e9b8b8:	e8 43 26 95 00       	call   17edf00 <_Znwm@plt>
      e9b8bd:	48 89 c3             	mov    rbx,rax
      e9b8c0:	49 89 c5             	mov    r13,rax
      e9b8c3:	48 8d 05 c6 58 9c 00 	lea    rax,[rip+0x9c58c6]        # 1861190 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d878>
      e9b8ca:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9b8cd:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
      e9b8d2:	48 83 bc 24 50 0b 00 	cmp    QWORD PTR [rsp+0xb50],0x0
      e9b8d9:	00 00 
      e9b8db:	74 60                	je     e9b93d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d53>
      e9b8dd:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9b8e4:	00 
      e9b8e5:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9b8ec:	00 
      e9b8ed:	e8 08 f6 3e 00       	call   128aefa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd047e>
      e9b8f2:	49 8b 7d 30          	mov    rdi,QWORD PTR [r13+0x30]
      e9b8f6:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
      e9b8fa:	49 83 65 30 00       	and    QWORD PTR [r13+0x30],0x0
      e9b8ff:	4c 39 ff             	cmp    rdi,r15
      e9b902:	74 63                	je     e9b967 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d7d>
      e9b904:	48 85 ff             	test   rdi,rdi
      e9b907:	74 67                	je     e9b970 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d86>
      e9b909:	6a 05                	push   0x5
      e9b90b:	eb 5c                	jmp    e9b969 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d7f>
      e9b90d:	48 8d 35 e2 74 49 ff 	lea    rsi,[rip+0xffffffffff4974e2]        # 332df6 <_ZTSSt12bad_any_cast@@Base-0x5d3d2>
      e9b914:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9b91b:	00 
      e9b91c:	e8 2e ff bd ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>

### READ 0xe9ba78: lea    r14,[rsp+0x1060]
      e9ba3c:	00 
      e9ba3d:	48 8b 84 24 70 12 00 	mov    rax,QWORD PTR [rsp+0x1270]
      e9ba44:	00 
      e9ba45:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9ba49:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ba50:	00 
      e9ba51:	e8 40 66 06 00       	call   f02096 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc94ac>
      e9ba56:	6a 60                	push   0x60
      e9ba58:	5f                   	pop    rdi
      e9ba59:	e8 a2 24 95 00       	call   17edf00 <_Znwm@plt>
      e9ba5e:	49 89 c7             	mov    r15,rax
      e9ba61:	66 0f ef c0          	pxor   xmm0,xmm0
      e9ba65:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9ba6a:	48 8d 05 57 f3 96 00 	lea    rax,[rip+0x96f357]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      e9ba71:	49 89 07             	mov    QWORD PTR [r15],rax
      e9ba74:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9ba78:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
      e9ba7f:	00 
      e9ba80:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ba87:	00 
      e9ba88:	4c 89 f7             	mov    rdi,r14
      e9ba8b:	e8 42 66 06 00       	call   f020d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc94e8>
      e9ba90:	48 8d 05 a9 54 9c 00 	lea    rax,[rip+0x9c54a9]        # 1860f40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d628>
      e9ba97:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e9ba9b:	4c 89 ff             	mov    rdi,r15
      e9ba9e:	48 83 c7 30          	add    rdi,0x30
      e9baa2:	4c 89 f6             	mov    rsi,r14
      e9baa5:	e8 28 66 06 00       	call   f020d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc94e8>
      e9baaa:	4c 89 f7             	mov    rdi,r14
      e9baad:	e8 b8 e4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9bab2:	4c 89 a4 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r12
      e9bab9:	00 
      e9baba:	4c 89 bc 24 98 07 00 	mov    QWORD PTR [rsp+0x798],r15
      e9bac1:	00 
      e9bac2:	6a 48                	push   0x48
      e9bac4:	5f                   	pop    rdi
      e9bac5:	e8 36 24 95 00       	call   17edf00 <_Znwm@plt>
      e9baca:	49 89 c6             	mov    r14,rax
      e9bacd:	89 e8                	mov    eax,ebp
      e9bacf:	66 0f ef c0          	pxor   xmm0,xmm0
      e9bad3:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      e9bad9:	48 8d 0d 88 19 96 00 	lea    rcx,[rip+0x961988]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e9bae0:	49 89 0e             	mov    QWORD PTR [r14],rcx
      e9bae3:	4d 89 f7             	mov    r15,r14
      e9bae6:	49 83 c7 18          	add    r15,0x18
      e9baea:	48 8d 0d a7 55 9c 00 	lea    rcx,[rip+0x9c55a7]        # 1861098 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d780>
      e9baf1:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx
      e9baf5:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
      e9baf9:	49 c7 46 28 14 00 00 	mov    QWORD PTR [r14+0x28],0x14

### READ 0xe9bb80: lea    rdi,[rsp+0x1060]
      e9bb3b:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
      e9bb40:	e8 bb 23 95 00       	call   17edf00 <_Znwm@plt>
      e9bb45:	4c 8b b4 24 98 13 00 	mov    r14,QWORD PTR [rsp+0x1398]
      e9bb4c:	00 
      e9bb4d:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
      e9bb54:	00 
      e9bb55:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
      e9bb59:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      e9bb5d:	66 0f ef c9          	pxor   xmm1,xmm1
      e9bb61:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      e9bb65:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      e9bb6a:	48 8d 0d 37 52 9c 00 	lea    rcx,[rip+0x9c5237]        # 1860da8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d490>
      e9bb71:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9bb74:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9bb79:	49 89 c7             	mov    r15,rax
      e9bb7c:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e9bb80:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9bb87:	00 
      e9bb88:	66 0f 7f 0f          	movdqa XMMWORD PTR [rdi],xmm1
      e9bb8c:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      e9bb91:	e8 b2 8c c1 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
      e9bb96:	48 89 df             	mov    rdi,rbx
      e9bb99:	e8 aa 8c c1 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
      e9bb9e:	6a 40                	push   0x40
      e9bba0:	5b                   	pop    rbx
      e9bba1:	48 8b bc 1c 68 07 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0x768]
      e9bba8:	00 
      e9bba9:	e8 d8 28 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bbae:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
      e9bbb2:	75 ed                	jne    e9bba1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62fb7>
      e9bbb4:	31 ff                	xor    edi,edi
      e9bbb6:	e8 cb 28 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bbbb:	31 ff                	xor    edi,edi
      e9bbbd:	e8 c4 28 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bbc2:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9bbc9:	00 
      e9bbca:	e8 9b e3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9bbcf:	31 ff                	xor    edi,edi
      e9bbd1:	e8 b0 28 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bbd6:	31 ff                	xor    edi,edi
      e9bbd8:	e8 a9 28 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bbdd:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9bbe4:	00 
      e9bbe5:	e8 80 e3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9bbea:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9bbf1:	00 
      e9bbf2:	e8 f7 bc e1 ff       	call   cb78ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20488e>
      e9bbf7:	4c 89 fb             	mov    rbx,r15
      e9bbfa:	6a 20                	push   0x20

### READ 0xe9be3a: lea    rsi,[rsp+0x1060]
      e9bdfb:	00 
      e9bdfc:	4c 89 e7             	mov    rdi,r12
      e9bdff:	48 89 de             	mov    rsi,rbx
      e9be02:	e8 81 b4 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9be07:	48 89 df             	mov    rdi,rbx
      e9be0a:	e8 5b e1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9be0f:	4c 89 f7             	mov    rdi,r14
      e9be12:	e8 6f 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be17:	66 49 0f 6e c7       	movq   xmm0,r15
      e9be1c:	66 49 0f 6e cc       	movq   xmm1,r12
      e9be21:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9be25:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9be2b:	31 ff                	xor    edi,edi
      e9be2d:	e8 ea 25 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9be32:	4c 89 f7             	mov    rdi,r14
      e9be35:	e8 4c 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be3a:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9be41:	00 
      e9be42:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9be48:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9be4c:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9be53:	00 
      e9be54:	e8 55 dc ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9be59:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      e9be60:	00 
      e9be61:	e8 20 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be66:	31 ff                	xor    edi,edi
      e9be68:	e8 19 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be6d:	4c 89 f7             	mov    rdi,r14
      e9be70:	e8 11 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be75:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9be7c:	00 
      e9be7d:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9be80:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9be85:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      e9be89:	4d 85 f6             	test   r14,r14
      e9be8c:	74 0a                	je     e9be98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x632ae>
      e9be8e:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9be93:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9be98:	6a 60                	push   0x60
      e9be9a:	5f                   	pop    rdi
      e9be9b:	e8 60 20 95 00       	call   17edf00 <_Znwm@plt>
      e9bea0:	49 89 c7             	mov    r15,rax
      e9bea3:	48 8b 8c 24 48 13 00 	mov    rcx,QWORD PTR [rsp+0x1348]
      e9beaa:	00 
      e9beab:	0f 57 c0             	xorps  xmm0,xmm0
      e9beae:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9beb2:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9beb5:	48 8d 05 f4 14 9a 00 	lea    rax,[rip+0x9a14f4]        # 183d3b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf348>

### READ 0xe9bf49: lea    rsi,[rsp+0x1060]
      e9bf0a:	00 
      e9bf0b:	4c 89 e7             	mov    rdi,r12
      e9bf0e:	48 89 de             	mov    rsi,rbx
      e9bf11:	e8 72 b3 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9bf16:	48 89 df             	mov    rdi,rbx
      e9bf19:	e8 4c e0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9bf1e:	4c 89 f7             	mov    rdi,r14
      e9bf21:	e8 60 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf26:	66 49 0f 6e c7       	movq   xmm0,r15
      e9bf2b:	66 49 0f 6e cc       	movq   xmm1,r12
      e9bf30:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9bf34:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9bf3a:	31 ff                	xor    edi,edi
      e9bf3c:	e8 db 24 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9bf41:	4c 89 f7             	mov    rdi,r14
      e9bf44:	e8 3d 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf49:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9bf50:	00 
      e9bf51:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9bf57:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9bf5b:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9bf62:	00 
      e9bf63:	e8 46 db ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9bf68:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      e9bf6f:	00 
      e9bf70:	e8 11 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf75:	31 ff                	xor    edi,edi
      e9bf77:	e8 0a 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf7c:	4c 89 f7             	mov    rdi,r14
      e9bf7f:	e8 02 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf84:	80 bc 24 e7 06 00 00 	cmp    BYTE PTR [rsp+0x6e7],0x0
      e9bf8b:	00 
      e9bf8c:	0f 84 05 01 00 00    	je     e9c097 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x634ad>
      e9bf92:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9bf99:	00 
      e9bf9a:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9bf9d:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9bfa2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9bfa6:	48 85 c0             	test   rax,rax
      e9bfa9:	74 0a                	je     e9bfb5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x633cb>
      e9bfab:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9bfb0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9bfb5:	6a 60                	push   0x60
      e9bfb7:	5f                   	pop    rdi
      e9bfb8:	e8 43 1f 95 00       	call   17edf00 <_Znwm@plt>
      e9bfbd:	49 89 c7             	mov    r15,rax
      e9bfc0:	0f 57 c0             	xorps  xmm0,xmm0
      e9bfc3:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9bfc7:	48 89 28             	mov    QWORD PTR [rax],rbp

### READ 0xe9c05c: lea    rsi,[rsp+0x1060]
      e9c01d:	00 
      e9c01e:	4c 89 e7             	mov    rdi,r12
      e9c021:	48 89 de             	mov    rsi,rbx
      e9c024:	e8 5f b2 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c029:	48 89 df             	mov    rdi,rbx
      e9c02c:	e8 39 df bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c031:	4c 89 f7             	mov    rdi,r14
      e9c034:	e8 4d 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c039:	66 49 0f 6e c7       	movq   xmm0,r15
      e9c03e:	66 49 0f 6e cc       	movq   xmm1,r12
      e9c043:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c047:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c04d:	31 ff                	xor    edi,edi
      e9c04f:	e8 c8 23 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c054:	4c 89 f7             	mov    rdi,r14
      e9c057:	e8 2a 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c05c:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9c063:	00 
      e9c064:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c06a:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c06e:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c075:	00 
      e9c076:	e8 33 da ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c07b:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      e9c082:	00 
      e9c083:	e8 fe 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c088:	31 ff                	xor    edi,edi
      e9c08a:	e8 f7 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c08f:	4c 89 f7             	mov    rdi,r14
      e9c092:	e8 ef 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c097:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9c09e:	00 
      e9c09f:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9c0a3:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e9c0a9:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
      e9c0ad:	48 85 db             	test   rbx,rbx
      e9c0b0:	74 05                	je     e9c0b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x634cd>
      e9c0b2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c0b7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9c0be:	00 
      e9c0bf:	48 8d b4 24 28 02 00 	lea    rsi,[rsp+0x228]
      e9c0c6:	00 
      e9c0c7:	e8 f0 b9 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9c0cc:	bf 80 00 00 00       	mov    edi,0x80
      e9c0d1:	e8 2a 1e 95 00       	call   17edf00 <_Znwm@plt>
      e9c0d6:	49 89 c6             	mov    r14,rax
      e9c0d9:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c0dd:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9c0e2:	48 8d 05 b7 11 9a 00 	lea    rax,[rip+0x9a11b7]        # 183d2a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf238>

### READ 0xe9c0b7: lea    rdi,[rsp+0x1060]
      e9c076:	e8 33 da ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c07b:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      e9c082:	00 
      e9c083:	e8 fe 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c088:	31 ff                	xor    edi,edi
      e9c08a:	e8 f7 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c08f:	4c 89 f7             	mov    rdi,r14
      e9c092:	e8 ef 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c097:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9c09e:	00 
      e9c09f:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9c0a3:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e9c0a9:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
      e9c0ad:	48 85 db             	test   rbx,rbx
      e9c0b0:	74 05                	je     e9c0b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x634cd>
      e9c0b2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c0b7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9c0be:	00 
      e9c0bf:	48 8d b4 24 28 02 00 	lea    rsi,[rsp+0x228]
      e9c0c6:	00 
      e9c0c7:	e8 f0 b9 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9c0cc:	bf 80 00 00 00       	mov    edi,0x80
      e9c0d1:	e8 2a 1e 95 00       	call   17edf00 <_Znwm@plt>
      e9c0d6:	49 89 c6             	mov    r14,rax
      e9c0d9:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c0dd:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9c0e2:	48 8d 05 b7 11 9a 00 	lea    rax,[rip+0x9a11b7]        # 183d2a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf238>
      e9c0e9:	49 89 06             	mov    QWORD PTR [r14],rax
      e9c0ec:	4d 89 f7             	mov    r15,r14
      e9c0ef:	49 83 c7 18          	add    r15,0x18
      e9c0f3:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9c0fa:	00 
      e9c0fb:	4c 89 ff             	mov    rdi,r15
      e9c0fe:	e8 b9 b9 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9c103:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c109:	66 0f 7f 84 24 d0 0c 	movdqa XMMWORD PTR [rsp+0xcd0],xmm0
      e9c110:	00 00 
      e9c112:	48 85 db             	test   rbx,rbx
      e9c115:	74 05                	je     e9c11c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63532>
      e9c117:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c11c:	4c 89 bc 24 e0 0c 00 	mov    QWORD PTR [rsp+0xce0],r15
      e9c123:	00 
      e9c124:	4c 89 b4 24 e8 0c 00 	mov    QWORD PTR [rsp+0xce8],r14
      e9c12b:	00 
      e9c12c:	6a 60                	push   0x60
      e9c12e:	5f                   	pop    rdi
      e9c12f:	e8 cc 1d 95 00       	call   17edf00 <_Znwm@plt>
      e9c134:	48 89 c3             	mov    rbx,rax
      e9c137:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]

### READ 0xe9c0f3: lea    rsi,[rsp+0x1060]
      e9c0b0:	74 05                	je     e9c0b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x634cd>
      e9c0b2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c0b7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9c0be:	00 
      e9c0bf:	48 8d b4 24 28 02 00 	lea    rsi,[rsp+0x228]
      e9c0c6:	00 
      e9c0c7:	e8 f0 b9 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9c0cc:	bf 80 00 00 00       	mov    edi,0x80
      e9c0d1:	e8 2a 1e 95 00       	call   17edf00 <_Znwm@plt>
      e9c0d6:	49 89 c6             	mov    r14,rax
      e9c0d9:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c0dd:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9c0e2:	48 8d 05 b7 11 9a 00 	lea    rax,[rip+0x9a11b7]        # 183d2a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf238>
      e9c0e9:	49 89 06             	mov    QWORD PTR [r14],rax
      e9c0ec:	4d 89 f7             	mov    r15,r14
      e9c0ef:	49 83 c7 18          	add    r15,0x18
      e9c0f3:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9c0fa:	00 
      e9c0fb:	4c 89 ff             	mov    rdi,r15
      e9c0fe:	e8 b9 b9 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9c103:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c109:	66 0f 7f 84 24 d0 0c 	movdqa XMMWORD PTR [rsp+0xcd0],xmm0
      e9c110:	00 00 
      e9c112:	48 85 db             	test   rbx,rbx
      e9c115:	74 05                	je     e9c11c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63532>
      e9c117:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c11c:	4c 89 bc 24 e0 0c 00 	mov    QWORD PTR [rsp+0xce0],r15
      e9c123:	00 
      e9c124:	4c 89 b4 24 e8 0c 00 	mov    QWORD PTR [rsp+0xce8],r14
      e9c12b:	00 
      e9c12c:	6a 60                	push   0x60
      e9c12e:	5f                   	pop    rdi
      e9c12f:	e8 cc 1d 95 00       	call   17edf00 <_Znwm@plt>
      e9c134:	48 89 c3             	mov    rbx,rax
      e9c137:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c13d:	66 49 0f 7e c4       	movq   r12,xmm0
      e9c142:	48 8d 84 24 e0 0c 00 	lea    rax,[rsp+0xce0]
      e9c149:	00 
      e9c14a:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c14e:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9c153:	48 89 2b             	mov    QWORD PTR [rbx],rbp
      e9c156:	4c 89 a4 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],r12
      e9c15d:	00 
      e9c15e:	4c 8b 68 f8          	mov    r13,QWORD PTR [rax-0x8]
      e9c162:	4c 89 ac 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],r13
      e9c169:	00 
      e9c16a:	4d 85 ed             	test   r13,r13
      e9c16d:	74 05                	je     e9c174 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6358a>
      e9c16f:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]

### READ 0xe9c25c: lea    rdi,[rsp+0x1060]
      e9c21a:	e8 f1 68 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e9c21f:	31 ff                	xor    edi,edi
      e9c221:	e8 60 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c226:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
      e9c22d:	00 
      e9c22e:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
      e9c235:	00 00 
      e9c237:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c23b:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c242:	00 
      e9c243:	e8 66 d8 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c248:	48 8b bc 24 28 05 00 	mov    rdi,QWORD PTR [rsp+0x528]
      e9c24f:	00 
      e9c250:	e8 31 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c255:	31 ff                	xor    edi,edi
      e9c257:	e8 2a 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c25c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9c263:	00 
      e9c264:	e8 91 b8 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      e9c269:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c26f:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9c276:	e8 0b 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c27b:	80 bc 24 21 07 00 00 	cmp    BYTE PTR [rsp+0x721],0x0
      e9c282:	00 
      e9c283:	0f 84 8b 00 00 00    	je     e9c314 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6372a>
      e9c289:	6a 30                	push   0x30
      e9c28b:	5f                   	pop    rdi
      e9c28c:	e8 6f 1c 95 00       	call   17edf00 <_Znwm@plt>
      e9c291:	48 89 c3             	mov    rbx,rax
      e9c294:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      e9c299:	66 48 0f 6e c0       	movq   xmm0,rax
      e9c29e:	f3 0f 7e 8c 24 20 01 	movq   xmm1,QWORD PTR [rsp+0x120]
      e9c2a5:	00 00 
      e9c2a7:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c2ab:	48 83 c0 08          	add    rax,0x8
      e9c2af:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c2b3:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9c2b8:	48 8d 0d 09 51 99 00 	lea    rcx,[rip+0x995109]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e9c2bf:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      e9c2c2:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e9c2c6:	49 89 de             	mov    r14,rbx
      e9c2c9:	49 83 c6 18          	add    r14,0x18
      e9c2cd:	48 8d 05 6c 11 9a 00 	lea    rax,[rip+0x9a116c]        # 183d440 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf3d8>
      e9c2d4:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e9c2d8:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1
      e9c2dd:	31 ff                	xor    edi,edi
      e9c2df:	e8 a2 21 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c2e4:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9c2eb:	00 

### WRITE 0xe9d321: mov    QWORD PTR [rsp+0x1060],rax
      e9d2e0:	00 
      e9d2e1:	e8 aa cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2e6:	48 8d bc 24 70 08 00 	lea    rdi,[rsp+0x870]
      e9d2ed:	00 
      e9d2ee:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
      e9d2f5:	00 
      e9d2f6:	e8 95 cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2fb:	44 89 bc 24 a0 08 00 	mov    DWORD PTR [rsp+0x8a0],r15d
      e9d302:	00 
      e9d303:	c6 84 24 a4 08 00 00 	mov    BYTE PTR [rsp+0x8a4],0x1
      e9d30a:	01 
      e9d30b:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9d312:	00 00 
      e9d314:	bf 50 01 00 00       	mov    edi,0x150
      e9d319:	e8 e2 0b 95 00       	call   17edf00 <_Znwm@plt>
      e9d31e:	48 89 c3             	mov    rbx,rax
      e9d321:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9d328:	00 
      e9d329:	48 89 ac 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rbp
      e9d330:	00 
      e9d331:	48 c7 84 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],0x1
      e9d338:	00 01 00 00 00 
      e9d33d:	48 8d 05 04 a8 99 00 	lea    rax,[rip+0x99a804]        # 1837b48 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x9ae0>
      e9d344:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9d347:	48 8b 84 24 70 07 00 	mov    rax,QWORD PTR [rsp+0x770]
      e9d34e:	00 
      e9d34f:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e9d353:	48 8d 6b 20          	lea    rbp,[rbx+0x20]
      e9d357:	48 89 ef             	mov    rdi,rbp
      e9d35a:	4c 89 e6             	mov    rsi,r12
      e9d35d:	e8 2e cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d362:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
      e9d367:	4c 8d 63 50          	lea    r12,[rbx+0x50]
      e9d36b:	4c 89 e7             	mov    rdi,r12
      e9d36e:	4c 89 f6             	mov    rsi,r14
      e9d371:	e8 1a cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d376:	44 89 fd             	mov    ebp,r15d
      e9d379:	4c 8d b3 80 00 00 00 	lea    r14,[rbx+0x80]
      e9d380:	4c 89 f7             	mov    rdi,r14
      e9d383:	4c 89 ee             	mov    rsi,r13
      e9d386:	e8 05 cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d38b:	4c 8d bb b0 00 00 00 	lea    r15,[rbx+0xb0]
      e9d392:	4c 89 ff             	mov    rdi,r15
      e9d395:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
      e9d39c:	00 
      e9d39d:	e8 ee ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d3a2:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
      e9d3a9:	48 8d b4 24 40 08 00 	lea    rsi,[rsp+0x840]
      e9d3b0:	00 

### READ 0xe9d3e8: lea    r14,[rsp+0x1060]
      e9d39d:	e8 ee ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d3a2:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
      e9d3a9:	48 8d b4 24 40 08 00 	lea    rsi,[rsp+0x840]
      e9d3b0:	00 
      e9d3b1:	e8 da ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d3b6:	4c 8d b4 24 a0 08 00 	lea    r14,[rsp+0x8a0]
      e9d3bd:	00 
      e9d3be:	48 89 df             	mov    rdi,rbx
      e9d3c1:	48 81 c7 10 01 00 00 	add    rdi,0x110
      e9d3c8:	48 8d b4 24 70 08 00 	lea    rsi,[rsp+0x870]
      e9d3cf:	00 
      e9d3d0:	e8 cf b4 06 00       	call   f088a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcba>
      e9d3d5:	41 8a 46 04          	mov    al,BYTE PTR [r14+0x4]
      e9d3d9:	88 83 44 01 00 00    	mov    BYTE PTR [rbx+0x144],al
      e9d3df:	41 8b 06             	mov    eax,DWORD PTR [r14]
      e9d3e2:	89 83 40 01 00 00    	mov    DWORD PTR [rbx+0x140],eax
      e9d3e8:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
      e9d3ef:	00 
      e9d3f0:	49 83 26 00          	and    QWORD PTR [r14],0x0
      e9d3f4:	48 89 9c 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],rbx
      e9d3fb:	00 
      e9d3fc:	4c 89 f7             	mov    rdi,r14
      e9d3ff:	e8 c6 ce bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9d404:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d40b:	00 
      e9d40c:	e8 d7 b4 06 00       	call   f088e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcfe>
      e9d411:	48 8b 84 24 e8 12 00 	mov    rax,QWORD PTR [rsp+0x12e8]
      e9d418:	00 
      e9d419:	49 89 06             	mov    QWORD PTR [r14],rax
      e9d41c:	48 8d 9c 24 70 10 00 	lea    rbx,[rsp+0x1070]
      e9d423:	00 
      e9d424:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
      e9d42b:	00 
      e9d42c:	48 89 df             	mov    rdi,rbx
      e9d42f:	e8 5c ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d434:	4c 8d b4 24 a0 10 00 	lea    r14,[rsp+0x10a0]
      e9d43b:	00 
      e9d43c:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
      e9d443:	00 
      e9d444:	4c 89 f7             	mov    rdi,r14
      e9d447:	e8 44 ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d44c:	41 89 ed             	mov    r13d,ebp
      e9d44f:	48 8d ac 24 d0 10 00 	lea    rbp,[rsp+0x10d0]
      e9d456:	00 
      e9d457:	48 8d b4 24 d0 0c 00 	lea    rsi,[rsp+0xcd0]
      e9d45e:	00 
      e9d45f:	48 89 ef             	mov    rdi,rbp
      e9d462:	e8 29 ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d467:	4c 8d bc 24 00 11 00 	lea    r15,[rsp+0x1100]

### READ 0xe9d4f8: mov    rax,QWORD PTR [rsp+0x1060]
      e9d4b3:	00 
      e9d4b4:	c6 84 24 94 11 00 00 	mov    BYTE PTR [rsp+0x1194],0x1
      e9d4bb:	01 
      e9d4bc:	bf 50 01 00 00       	mov    edi,0x150
      e9d4c1:	e8 3a 0a 95 00       	call   17edf00 <_Znwm@plt>
      e9d4c6:	49 89 c5             	mov    r13,rax
      e9d4c9:	48 89 84 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rax
      e9d4d0:	00 
      e9d4d1:	48 8d 84 24 a0 0e 00 	lea    rax,[rsp+0xea0]
      e9d4d8:	00 
      e9d4d9:	48 89 84 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],rax
      e9d4e0:	00 
      e9d4e1:	48 c7 84 24 f0 03 00 	mov    QWORD PTR [rsp+0x3f0],0x1
      e9d4e8:	00 01 00 00 00 
      e9d4ed:	48 8d 05 9c a6 99 00 	lea    rax,[rip+0x99a69c]        # 1837b90 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x9b28>
      e9d4f4:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      e9d4f8:	48 8b 84 24 60 10 00 	mov    rax,QWORD PTR [rsp+0x1060]
      e9d4ff:	00 
      e9d500:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      e9d504:	4d 8d 7d 20          	lea    r15,[r13+0x20]
      e9d508:	4c 89 ff             	mov    rdi,r15
      e9d50b:	48 89 de             	mov    rsi,rbx
      e9d50e:	e8 7d cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d513:	49 8d 5d 50          	lea    rbx,[r13+0x50]
      e9d517:	48 89 df             	mov    rdi,rbx
      e9d51a:	4c 89 f6             	mov    rsi,r14
      e9d51d:	e8 6e cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d522:	4d 8d b5 80 00 00 00 	lea    r14,[r13+0x80]
      e9d529:	4c 89 f7             	mov    rdi,r14
      e9d52c:	48 89 ee             	mov    rsi,rbp
      e9d52f:	e8 5c cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d534:	49 8d ad b0 00 00 00 	lea    rbp,[r13+0xb0]
      e9d53b:	48 89 ef             	mov    rdi,rbp
      e9d53e:	48 8d b4 24 00 11 00 	lea    rsi,[rsp+0x1100]
      e9d545:	00 
      e9d546:	e8 45 cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d54b:	49 8d bd e0 00 00 00 	lea    rdi,[r13+0xe0]
      e9d552:	48 8d b4 24 30 11 00 	lea    rsi,[rsp+0x1130]
      e9d559:	00 
      e9d55a:	e8 31 cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d55f:	48 8d 9c 24 90 11 00 	lea    rbx,[rsp+0x1190]
      e9d566:	00 
      e9d567:	4c 89 ef             	mov    rdi,r13
      e9d56a:	48 81 c7 10 01 00 00 	add    rdi,0x110
      e9d571:	4c 89 e6             	mov    rsi,r12
      e9d574:	e8 2b b3 06 00       	call   f088a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcba>
      e9d579:	8a 43 04             	mov    al,BYTE PTR [rbx+0x4]
      e9d57c:	41 88 85 44 01 00 00 	mov    BYTE PTR [r13+0x144],al
      e9d583:	8b 03                	mov    eax,DWORD PTR [rbx]

### READ 0xe9d5a5: lea    rdi,[rsp+0x1060]
      e9d55f:	48 8d 9c 24 90 11 00 	lea    rbx,[rsp+0x1190]
      e9d566:	00 
      e9d567:	4c 89 ef             	mov    rdi,r13
      e9d56a:	48 81 c7 10 01 00 00 	add    rdi,0x110
      e9d571:	4c 89 e6             	mov    rsi,r12
      e9d574:	e8 2b b3 06 00       	call   f088a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcba>
      e9d579:	8a 43 04             	mov    al,BYTE PTR [rbx+0x4]
      e9d57c:	41 88 85 44 01 00 00 	mov    BYTE PTR [r13+0x144],al
      e9d583:	8b 03                	mov    eax,DWORD PTR [rbx]
      e9d585:	41 89 85 40 01 00 00 	mov    DWORD PTR [r13+0x140],eax
      e9d58c:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9d593:	00 
      e9d594:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9d598:	4c 89 ac 24 f0 0e 00 	mov    QWORD PTR [rsp+0xef0],r13
      e9d59f:	00 
      e9d5a0:	e8 25 cd bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9d5a5:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9d5ac:	00 
      e9d5ad:	e8 36 b3 06 00       	call   f088e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcfe>
      e9d5b2:	48 8d 35 c7 79 53 ff 	lea    rsi,[rip+0xffffffffff5379c7]        # 3d4f80 <_ZTSN5boost17bad_function_callE@@Base+0x22c6>
      e9d5b9:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9d5c0:	00 
      e9d5c1:	e8 7a 09 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9d5c6:	4c 8d a4 24 e0 03 00 	lea    r12,[rsp+0x3e0]
      e9d5cd:	00 
      e9d5ce:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9d5d5:	00 
      e9d5d6:	4c 89 e7             	mov    rdi,r12
      e9d5d9:	4c 89 f6             	mov    rsi,r14
      e9d5dc:	e8 31 b8 ce ff       	call   b88e12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5db2>
      e9d5e1:	4c 8d ac 24 a0 0e 00 	lea    r13,[rsp+0xea0]
      e9d5e8:	00 
      e9d5e9:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9d5f0:	00 
      e9d5f1:	4c 89 ef             	mov    rdi,r13
      e9d5f4:	48 89 ee             	mov    rsi,rbp
      e9d5f7:	e8 5a b8 ce ff       	call   b88e56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5df6>
      e9d5fc:	4c 8d bc 24 00 0d 00 	lea    r15,[rsp+0xd00]
      e9d603:	00 
      e9d604:	48 8d 9c 24 b0 03 00 	lea    rbx,[rsp+0x3b0]
      e9d60b:	00 
      e9d60c:	4c 89 ff             	mov    rdi,r15
      e9d60f:	48 89 de             	mov    rsi,rbx
      e9d612:	4c 89 e2             	mov    rdx,r12
      e9d615:	4c 89 e9             	mov    rcx,r13
      e9d618:	e8 29 ab ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9d61d:	4c 89 ef             	mov    rdi,r13
      e9d620:	e8 45 c9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d625:	4c 89 e7             	mov    rdi,r12

### READ 0xe9da31: lea    rdi,[rsp+0x1060]
      e9d9ee:	4c 89 ee             	mov    rsi,r13
      e9d9f1:	e8 0e 8b 00 00       	call   ea6504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d91a>
      e9d9f6:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]
      e9d9fb:	4c 89 f6             	mov    rsi,r14
      e9d9fe:	e8 bf 2e 08 00       	call   f208c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7cd8>
      e9da03:	4c 89 e7             	mov    rdi,r12
      e9da06:	48 83 c7 70          	add    rdi,0x70
      e9da0a:	4c 89 fe             	mov    rsi,r15
      e9da0d:	e8 ee 89 e2 ff       	call   cc6400 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2133a0>
      e9da12:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
      e9da19:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
      e9da20:	00 
      e9da21:	4c 89 a4 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],r12
      e9da28:	00 
      e9da29:	4c 89 ef             	mov    rdi,r13
      e9da2c:	e8 9b 28 d4 ff       	call   be02cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d26c>
      e9da31:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9da38:	00 
      e9da39:	48 8d b4 24 c0 04 00 	lea    rsi,[rsp+0x4c0]
      e9da40:	00 
      e9da41:	e8 be 8a 00 00       	call   ea6504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d91a>
      e9da46:	4c 8d b4 24 90 10 00 	lea    r14,[rsp+0x1090]
      e9da4d:	00 
      e9da4e:	48 8d b4 24 90 04 00 	lea    rsi,[rsp+0x490]
      e9da55:	00 
      e9da56:	4c 89 f7             	mov    rdi,r14
      e9da59:	e8 64 2e 08 00       	call   f208c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7cd8>
      e9da5e:	4c 8d bc 24 c0 10 00 	lea    r15,[rsp+0x10c0]
      e9da65:	00 
      e9da66:	48 8d b4 24 60 04 00 	lea    rsi,[rsp+0x460]
      e9da6d:	00 
      e9da6e:	4c 89 ff             	mov    rdi,r15
      e9da71:	e8 8a 89 e2 ff       	call   cc6400 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2133a0>
      e9da76:	49 89 5f 30          	mov    QWORD PTR [r15+0x30],rbx
      e9da7a:	bf b0 00 00 00       	mov    edi,0xb0
      e9da7f:	e8 7c 04 95 00       	call   17edf00 <_Znwm@plt>
      e9da84:	49 89 c4             	mov    r12,rax
      e9da87:	48 8d 05 ca bf 99 00 	lea    rax,[rip+0x99bfca]        # 1839a58 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb9f0>
      e9da8e:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9da92:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
      e9da97:	4c 8d ac 24 60 10 00 	lea    r13,[rsp+0x1060]
      e9da9e:	00 
      e9da9f:	4c 89 ee             	mov    rsi,r13
      e9daa2:	e8 5d 8a 00 00       	call   ea6504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d91a>
      e9daa7:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]
      e9daac:	4c 89 f6             	mov    rsi,r14
      e9daaf:	e8 0e 2e 08 00       	call   f208c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7cd8>
      e9dab4:	4c 89 e7             	mov    rdi,r12
      e9dab7:	48 83 c7 70          	add    rdi,0x70

### READ 0xe9da97: lea    r13,[rsp+0x1060]
      e9da55:	00 
      e9da56:	4c 89 f7             	mov    rdi,r14
      e9da59:	e8 64 2e 08 00       	call   f208c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7cd8>
      e9da5e:	4c 8d bc 24 c0 10 00 	lea    r15,[rsp+0x10c0]
      e9da65:	00 
      e9da66:	48 8d b4 24 60 04 00 	lea    rsi,[rsp+0x460]
      e9da6d:	00 
      e9da6e:	4c 89 ff             	mov    rdi,r15
      e9da71:	e8 8a 89 e2 ff       	call   cc6400 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2133a0>
      e9da76:	49 89 5f 30          	mov    QWORD PTR [r15+0x30],rbx
      e9da7a:	bf b0 00 00 00       	mov    edi,0xb0
      e9da7f:	e8 7c 04 95 00       	call   17edf00 <_Znwm@plt>
      e9da84:	49 89 c4             	mov    r12,rax
      e9da87:	48 8d 05 ca bf 99 00 	lea    rax,[rip+0x99bfca]        # 1839a58 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb9f0>
      e9da8e:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9da92:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
      e9da97:	4c 8d ac 24 60 10 00 	lea    r13,[rsp+0x1060]
      e9da9e:	00 
      e9da9f:	4c 89 ee             	mov    rsi,r13
      e9daa2:	e8 5d 8a 00 00       	call   ea6504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d91a>
      e9daa7:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]
      e9daac:	4c 89 f6             	mov    rsi,r14
      e9daaf:	e8 0e 2e 08 00       	call   f208c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7cd8>
      e9dab4:	4c 89 e7             	mov    rdi,r12
      e9dab7:	48 83 c7 70          	add    rdi,0x70
      e9dabb:	4c 89 fe             	mov    rsi,r15
      e9dabe:	e8 3d 89 e2 ff       	call   cc6400 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2133a0>
      e9dac3:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
      e9daca:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
      e9dad1:	00 
      e9dad2:	4c 89 a4 24 f0 0e 00 	mov    QWORD PTR [rsp+0xef0],r12
      e9dad9:	00 
      e9dada:	4c 89 ef             	mov    rdi,r13
      e9dadd:	e8 ea 27 d4 ff       	call   be02cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d26c>
      e9dae2:	48 8d 35 9f 75 53 ff 	lea    rsi,[rip+0xffffffffff53759f]        # 3d5088 <_ZTSN5boost17bad_function_callE@@Base+0x23ce>
      e9dae9:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9daf0:	00 
      e9daf1:	e8 4a 04 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9daf6:	4c 8d a4 24 e0 03 00 	lea    r12,[rsp+0x3e0]
      e9dafd:	00 
      e9dafe:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9db05:	00 
      e9db06:	4c 89 e7             	mov    rdi,r12
      e9db09:	4c 89 f6             	mov    rsi,r14
      e9db0c:	e8 01 b3 ce ff       	call   b88e12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5db2>
      e9db11:	4c 8d ac 24 a0 0e 00 	lea    r13,[rsp+0xea0]
      e9db18:	00 
      e9db19:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9db20:	00 

### WRITE 0xe9dc07: mov    QWORD PTR [rsp+0x1060],rax
      e9dbc1:	e8 a4 c3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9dbc6:	4c 8d b4 24 d0 0c 00 	lea    r14,[rsp+0xcd0]
      e9dbcd:	00 
      e9dbce:	48 8b 84 24 a0 13 00 	mov    rax,QWORD PTR [rsp+0x13a0]
      e9dbd5:	00 
      e9dbd6:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9dbd9:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9dbde:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9dbe2:	48 85 c0             	test   rax,rax
      e9dbe5:	74 05                	je     e9dbec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65002>
      e9dbe7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9dbec:	48 8d 35 15 73 53 ff 	lea    rsi,[rip+0xffffffffff537315]        # 3d4f08 <_ZTSN5boost17bad_function_callE@@Base+0x224e>
      e9dbf3:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9dbfa:	00 
      e9dbfb:	e8 40 03 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9dc00:	48 8d 05 b9 9a 99 00 	lea    rax,[rip+0x999ab9]        # 18376c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x9658>
      e9dc07:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9dc0e:	00 
      e9dc0f:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9dc14:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9dc1b:	00 
      e9dc1c:	48 8d 94 24 60 10 00 	lea    rdx,[rsp+0x1060]
      e9dc23:	00 
      e9dc24:	48 89 94 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rdx
      e9dc2b:	00 
      e9dc2c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9dc33:	00 
      e9dc34:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9dc3b:	00 
      e9dc3c:	e8 67 8e 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9dc41:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9dc48:	00 
      e9dc49:	e8 1c c3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9dc4e:	31 ff                	xor    edi,edi
      e9dc50:	e8 31 08 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
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

### READ 0xe9dc1c: lea    rdx,[rsp+0x1060]
      e9dbd6:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9dbd9:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9dbde:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9dbe2:	48 85 c0             	test   rax,rax
      e9dbe5:	74 05                	je     e9dbec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65002>
      e9dbe7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9dbec:	48 8d 35 15 73 53 ff 	lea    rsi,[rip+0xffffffffff537315]        # 3d4f08 <_ZTSN5boost17bad_function_callE@@Base+0x224e>
      e9dbf3:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9dbfa:	00 
      e9dbfb:	e8 40 03 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9dc00:	48 8d 05 b9 9a 99 00 	lea    rax,[rip+0x999ab9]        # 18376c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x9658>
      e9dc07:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9dc0e:	00 
      e9dc0f:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9dc14:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9dc1b:	00 
      e9dc1c:	48 8d 94 24 60 10 00 	lea    rdx,[rsp+0x1060]
      e9dc23:	00 
      e9dc24:	48 89 94 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rdx
      e9dc2b:	00 
      e9dc2c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9dc33:	00 
      e9dc34:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9dc3b:	00 
      e9dc3c:	e8 67 8e 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9dc41:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9dc48:	00 
      e9dc49:	e8 1c c3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9dc4e:	31 ff                	xor    edi,edi
      e9dc50:	e8 31 08 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
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

### READ 0xe9dc41: lea    rdi,[rsp+0x1060]
      e9dbfb:	e8 40 03 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9dc00:	48 8d 05 b9 9a 99 00 	lea    rax,[rip+0x999ab9]        # 18376c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x9658>
      e9dc07:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9dc0e:	00 
      e9dc0f:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9dc14:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9dc1b:	00 
      e9dc1c:	48 8d 94 24 60 10 00 	lea    rdx,[rsp+0x1060]
      e9dc23:	00 
      e9dc24:	48 89 94 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rdx
      e9dc2b:	00 
      e9dc2c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9dc33:	00 
      e9dc34:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9dc3b:	00 
      e9dc3c:	e8 67 8e 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9dc41:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9dc48:	00 
      e9dc49:	e8 1c c3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9dc4e:	31 ff                	xor    edi,edi
      e9dc50:	e8 31 08 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
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

### READ 0xe9df6a: lea    rdi,[rsp+0x1060]
      e9df25:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e9df2a:	48 8d b4 24 d0 0e 00 	lea    rsi,[rsp+0xed0]
      e9df31:	00 
      e9df32:	48 89 86 88 01 00 00 	mov    QWORD PTR [rsi+0x188],rax
      e9df39:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9df40:	00 
      e9df41:	e8 88 a9 61 00       	call   14b88ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fde52>
      e9df46:	48 63 84 24 c4 00 00 	movsxd rax,DWORD PTR [rsp+0xc4]
      e9df4d:	00 
      e9df4e:	48 63 9c 24 c8 00 00 	movsxd rbx,DWORD PTR [rsp+0xc8]
      e9df55:	00 
      e9df56:	4c 6b f8 3c          	imul   r15,rax,0x3c
      e9df5a:	48 89 9c 24 00 09 00 	mov    QWORD PTR [rsp+0x900],rbx
      e9df61:	00 
      e9df62:	4c 89 bc 24 08 09 00 	mov    QWORD PTR [rsp+0x908],r15
      e9df69:	00 
      e9df6a:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9df71:	00 
      e9df72:	48 8d b4 24 d0 0e 00 	lea    rsi,[rsp+0xed0]
      e9df79:	00 
      e9df7a:	e8 4f a9 61 00       	call   14b88ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fde52>
      e9df7f:	48 89 9c 24 f0 11 00 	mov    QWORD PTR [rsp+0x11f0],rbx
      e9df86:	00 
      e9df87:	4c 89 bc 24 f8 11 00 	mov    QWORD PTR [rsp+0x11f8],r15
      e9df8e:	00 
      e9df8f:	48 8d 35 f2 9e 59 ff 	lea    rsi,[rip+0xffffffffff599ef2]        # 437e88 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5d8d7>
      e9df96:	48 8d bc 24 88 01 00 	lea    rdi,[rsp+0x188]
      e9df9d:	00 
      e9df9e:	e8 9d ff 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9dfa3:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9dfaa:	00 
      e9dfab:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9dfb2:	00 
      e9dfb3:	e8 74 ab 61 00       	call   14b8b2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0b0>
      e9dfb8:	48 83 a4 24 c0 0e 00 	and    QWORD PTR [rsp+0xec0],0x0
      e9dfbf:	00 00 
      e9dfc1:	bf b0 01 00 00       	mov    edi,0x1b0
      e9dfc6:	e8 35 ff 94 00       	call   17edf00 <_Znwm@plt>
      e9dfcb:	48 89 c3             	mov    rbx,rax
      e9dfce:	48 89 84 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],rax
      e9dfd5:	00 
      e9dfd6:	4c 89 b4 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],r14
      e9dfdd:	00 
      e9dfde:	48 c7 84 24 40 0b 00 	mov    QWORD PTR [rsp+0xb40],0x1
      e9dfe5:	00 01 00 00 00 
      e9dfea:	48 8d 05 8f a4 9d 00 	lea    rax,[rip+0x9da48f]        # 1878480 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34b68>
      e9dff1:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9dff4:	48 89 df             	mov    rdi,rbx
      e9dff7:	48 83 c7 10          	add    rdi,0x10

### READ 0xe9e029: lea    rsi,[rsp+0x1060]
      e9dfe5:	00 01 00 00 00 
      e9dfea:	48 8d 05 8f a4 9d 00 	lea    rax,[rip+0x9da48f]        # 1878480 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34b68>
      e9dff1:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9dff4:	48 89 df             	mov    rdi,rbx
      e9dff7:	48 83 c7 10          	add    rdi,0x10
      e9dffb:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9e002:	00 
      e9e003:	e8 24 ab 61 00       	call   14b8b2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0b0>
      e9e008:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e00f:	00 
      e9e010:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9e014:	48 89 9c 24 c0 0e 00 	mov    QWORD PTR [rsp+0xec0],rbx
      e9e01b:	00 
      e9e01c:	e8 a9 c2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9e021:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e028:	00 
      e9e029:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9e030:	00 
      e9e031:	e8 f6 aa 61 00       	call   14b8b2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0b0>
      e9e036:	bf b0 01 00 00       	mov    edi,0x1b0
      e9e03b:	e8 c0 fe 94 00       	call   17edf00 <_Znwm@plt>
      e9e040:	48 89 c3             	mov    rbx,rax
      e9e043:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
      e9e04a:	00 
      e9e04b:	48 8d 84 24 bf 01 00 	lea    rax,[rsp+0x1bf]
      e9e052:	00 
      e9e053:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
      e9e05a:	00 
      e9e05b:	48 c7 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],0x1
      e9e062:	00 01 00 00 00 
      e9e067:	48 8d 05 ea a5 9d 00 	lea    rax,[rip+0x9da5ea]        # 1878658 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34d40>
      e9e06e:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9e071:	48 89 df             	mov    rdi,rbx
      e9e074:	48 83 c7 10          	add    rdi,0x10
      e9e078:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9e07f:	00 
      e9e080:	e8 a7 aa 61 00       	call   14b8b2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0b0>
      e9e085:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      e9e08c:	00 
      e9e08d:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9e091:	4c 8d b4 24 d0 0c 00 	lea    r14,[rsp+0xcd0]
      e9e098:	00 
      e9e099:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx
      e9e09d:	e8 28 c2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9e0a2:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9e0a9:	00 
      e9e0aa:	48 8d 9c 24 88 01 00 	lea    rbx,[rsp+0x188]
      e9e0b1:	00 
      e9e0b2:	4c 8d bc 24 a0 0e 00 	lea    r15,[rsp+0xea0]

### READ 0xe9e0fd: lea    r13,[rsp+0x1060]
      e9e0bd:	4c 89 fa             	mov    rdx,r15
      e9e0c0:	4c 89 f1             	mov    rcx,r14
      e9e0c3:	e8 7e a0 ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9e0c8:	4c 89 f7             	mov    rdi,r14
      e9e0cb:	e8 9a be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e0d0:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e0d7:	00 
      e9e0d8:	e8 75 aa 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      e9e0dd:	4c 89 ff             	mov    rdi,r15
      e9e0e0:	e8 85 be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e0e5:	4c 8d a4 24 00 0d 00 	lea    r12,[rsp+0xd00]
      e9e0ec:	00 
      e9e0ed:	4c 89 e7             	mov    rdi,r12
      e9e0f0:	e8 5d aa 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      e9e0f5:	48 89 df             	mov    rdi,rbx
      e9e0f8:	e8 93 fd 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e0fd:	4c 8d ac 24 60 10 00 	lea    r13,[rsp+0x1060]
      e9e104:	00 
      e9e105:	4c 89 ef             	mov    rdi,r13
      e9e108:	e8 45 aa 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      e9e10d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e114:	00 
      e9e115:	e8 38 aa 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      e9e11a:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      e9e121:	00 
      e9e122:	e8 2b aa 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      e9e127:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      e9e12e:	00 
      e9e12f:	e8 36 be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e134:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
      e9e13b:	00 
      e9e13c:	e8 29 be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e141:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
      e9e148:	00 
      e9e149:	e8 1c be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e14e:	48 89 ef             	mov    rdi,rbp
      e9e151:	e8 30 03 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e156:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
      e9e15d:	00 
      e9e15e:	e8 07 be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e163:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9e16a:	00 
      e9e16b:	e8 fa bd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e170:	8a 9c 24 60 07 00 00 	mov    bl,BYTE PTR [rsp+0x760]
      e9e177:	48 8d 35 32 6e 53 ff 	lea    rsi,[rip+0xffffffffff536e32]        # 3d4fb0 <_ZTSN5boost17bad_function_callE@@Base+0x22f6>
      e9e17e:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e185:	00 
      e9e186:	e8 b5 fd 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e18b:	48 8d 05 26 ae 99 00 	lea    rax,[rip+0x99ae26]        # 1838fb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xaf50>

### WRITE 0xe9e192: mov    QWORD PTR [rsp+0x1060],rax
      e9e148:	00 
      e9e149:	e8 1c be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e14e:	48 89 ef             	mov    rdi,rbp
      e9e151:	e8 30 03 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e156:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
      e9e15d:	00 
      e9e15e:	e8 07 be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e163:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9e16a:	00 
      e9e16b:	e8 fa bd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e170:	8a 9c 24 60 07 00 00 	mov    bl,BYTE PTR [rsp+0x760]
      e9e177:	48 8d 35 32 6e 53 ff 	lea    rsi,[rip+0xffffffffff536e32]        # 3d4fb0 <_ZTSN5boost17bad_function_callE@@Base+0x22f6>
      e9e17e:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e185:	00 
      e9e186:	e8 b5 fd 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e18b:	48 8d 05 26 ae 99 00 	lea    rax,[rip+0x99ae26]        # 1838fb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xaf50>
      e9e192:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9e199:	00 
      e9e19a:	48 8b 8c 24 38 13 00 	mov    rcx,QWORD PTR [rsp+0x1338]
      e9e1a1:	00 
      e9e1a2:	48 89 8c 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rcx
      e9e1a9:	00 
      e9e1aa:	88 9c 24 70 10 00 00 	mov    BYTE PTR [rsp+0x1070],bl
      e9e1b1:	4c 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r13
      e9e1b8:	00 
      e9e1b9:	48 8d 05 40 ae 99 00 	lea    rax,[rip+0x99ae40]        # 1839000 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xaf98>
      e9e1c0:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9e1c7:	00 
      e9e1c8:	48 89 8c 24 08 0d 00 	mov    QWORD PTR [rsp+0xd08],rcx
      e9e1cf:	00 
      e9e1d0:	88 9c 24 10 0d 00 00 	mov    BYTE PTR [rsp+0xd10],bl
      e9e1d7:	4c 89 a4 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],r12
      e9e1de:	00 
      e9e1df:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9e1e6:	00 
      e9e1e7:	4c 8d bc 24 30 0b 00 	lea    r15,[rsp+0xb30]
      e9e1ee:	00 
      e9e1ef:	48 89 df             	mov    rdi,rbx
      e9e1f2:	4c 89 fe             	mov    rsi,r15
      e9e1f5:	4c 89 ea             	mov    rdx,r13
      e9e1f8:	4c 89 e1             	mov    rcx,r12
      e9e1fb:	e8 46 9f ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9e200:	4c 89 e7             	mov    rdi,r12
      e9e203:	e8 62 bd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e208:	4c 89 ef             	mov    rdi,r13
      e9e20b:	e8 5a bd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e210:	4c 89 ff             	mov    rdi,r15
      e9e213:	e8 78 fc 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e218:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]

### WRITE 0xe9e265: mov    QWORD PTR [rsp+0x1060],rax
      e9e21f:	00 
      e9e220:	48 89 de             	mov    rsi,rbx
      e9e223:	e8 d0 0e ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e228:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e22f:	00 
      e9e230:	e8 39 a0 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e235:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e23c:	00 
      e9e23d:	48 8d b4 24 e0 03 00 	lea    rsi,[rsp+0x3e0]
      e9e244:	00 
      e9e245:	e8 b0 0d ff ff       	call   e8effa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56410>
      e9e24a:	48 8d 35 57 6c 53 ff 	lea    rsi,[rip+0xffffffffff536c57]        # 3d4ea8 <_ZTSN5boost17bad_function_callE@@Base+0x21ee>
      e9e251:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e258:	00 
      e9e259:	e8 e2 fc 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e25e:	48 8d 05 a3 8d 99 00 	lea    rax,[rip+0x998da3]        # 1837008 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8fa0>
      e9e265:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9e26c:	00 
      e9e26d:	4c 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r13
      e9e274:	00 
      e9e275:	48 8d 05 d4 8d 99 00 	lea    rax,[rip+0x998dd4]        # 1837050 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8fe8>
      e9e27c:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9e283:	00 
      e9e284:	4c 89 a4 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],r12
      e9e28b:	00 
      e9e28c:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9e293:	00 
      e9e294:	4c 8d bc 24 30 0b 00 	lea    r15,[rsp+0xb30]
      e9e29b:	00 
      e9e29c:	48 89 df             	mov    rdi,rbx
      e9e29f:	4c 89 fe             	mov    rsi,r15
      e9e2a2:	4c 89 ea             	mov    rdx,r13
      e9e2a5:	4c 89 e1             	mov    rcx,r12
      e9e2a8:	e8 99 9e ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9e2ad:	4c 89 e7             	mov    rdi,r12
      e9e2b0:	e8 b5 bc bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e2b5:	4c 89 ef             	mov    rdi,r13
      e9e2b8:	e8 ad bc bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e2bd:	4c 89 ff             	mov    rdi,r15
      e9e2c0:	e8 cb fb 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e2c5:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e2cc:	00 
      e9e2cd:	48 89 de             	mov    rsi,rbx
      e9e2d0:	e8 23 0e ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e2d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e2dc:	00 
      e9e2dd:	e8 8c 9f ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e2e2:	48 8d 35 cf 6d 53 ff 	lea    rsi,[rip+0xffffffffff536dcf]        # 3d50b8 <_ZTSN5boost17bad_function_callE@@Base+0x23fe>
      e9e2e9:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]

### WRITE 0xe9e2fd: mov    QWORD PTR [rsp+0x1060],rax
      e9e2b5:	4c 89 ef             	mov    rdi,r13
      e9e2b8:	e8 ad bc bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e2bd:	4c 89 ff             	mov    rdi,r15
      e9e2c0:	e8 cb fb 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e2c5:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e2cc:	00 
      e9e2cd:	48 89 de             	mov    rsi,rbx
      e9e2d0:	e8 23 0e ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e2d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e2dc:	00 
      e9e2dd:	e8 8c 9f ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e2e2:	48 8d 35 cf 6d 53 ff 	lea    rsi,[rip+0xffffffffff536dcf]        # 3d50b8 <_ZTSN5boost17bad_function_callE@@Base+0x23fe>
      e9e2e9:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e2f0:	00 
      e9e2f1:	e8 4a fc 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e2f6:	48 8d 05 2b bd 99 00 	lea    rax,[rip+0x99bd2b]        # 183a028 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xbfc0>
      e9e2fd:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9e304:	00 
      e9e305:	4c 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r13
      e9e30c:	00 
      e9e30d:	48 8d 05 5c bd 99 00 	lea    rax,[rip+0x99bd5c]        # 183a070 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc008>
      e9e314:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9e31b:	00 
      e9e31c:	4c 89 a4 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],r12
      e9e323:	00 
      e9e324:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9e32b:	00 
      e9e32c:	4c 8d bc 24 30 0b 00 	lea    r15,[rsp+0xb30]
      e9e333:	00 
      e9e334:	48 89 df             	mov    rdi,rbx
      e9e337:	4c 89 fe             	mov    rsi,r15
      e9e33a:	4c 89 ea             	mov    rdx,r13
      e9e33d:	4c 89 e1             	mov    rcx,r12
      e9e340:	e8 01 9e ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9e345:	4c 89 e7             	mov    rdi,r12
      e9e348:	e8 1d bc bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e34d:	4c 89 ef             	mov    rdi,r13
      e9e350:	e8 15 bc bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e355:	4c 89 ff             	mov    rdi,r15
      e9e358:	e8 33 fb 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e35d:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e364:	00 
      e9e365:	48 89 de             	mov    rsi,rbx
      e9e368:	e8 8b 0d ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e36d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e374:	00 
      e9e375:	e8 f4 9e ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e37a:	48 8d 35 8f 8f b4 00 	lea    rsi,[rip+0xb48f8f]        # 19e7310 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1900>
      e9e381:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]

### WRITE 0xe9e395: mov    QWORD PTR [rsp+0x1060],rax
      e9e34d:	4c 89 ef             	mov    rdi,r13
      e9e350:	e8 15 bc bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e355:	4c 89 ff             	mov    rdi,r15
      e9e358:	e8 33 fb 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e35d:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e364:	00 
      e9e365:	48 89 de             	mov    rsi,rbx
      e9e368:	e8 8b 0d ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e36d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e374:	00 
      e9e375:	e8 f4 9e ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e37a:	48 8d 35 8f 8f b4 00 	lea    rsi,[rip+0xb48f8f]        # 19e7310 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1900>
      e9e381:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e388:	00 
      e9e389:	e8 b2 fb 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e38e:	48 8d 05 73 ba 99 00 	lea    rax,[rip+0x99ba73]        # 1839e08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xbda0>
      e9e395:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9e39c:	00 
      e9e39d:	4c 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r13
      e9e3a4:	00 
      e9e3a5:	48 8d 05 a4 ba 99 00 	lea    rax,[rip+0x99baa4]        # 1839e50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xbde8>
      e9e3ac:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9e3b3:	00 
      e9e3b4:	4c 89 a4 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],r12
      e9e3bb:	00 
      e9e3bc:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9e3c3:	00 
      e9e3c4:	4c 8d bc 24 30 0b 00 	lea    r15,[rsp+0xb30]
      e9e3cb:	00 
      e9e3cc:	48 89 df             	mov    rdi,rbx
      e9e3cf:	4c 89 fe             	mov    rsi,r15
      e9e3d2:	4c 89 ea             	mov    rdx,r13
      e9e3d5:	4c 89 e1             	mov    rcx,r12
      e9e3d8:	e8 69 9d ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9e3dd:	4c 89 e7             	mov    rdi,r12
      e9e3e0:	e8 85 bb bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e3e5:	4c 89 ef             	mov    rdi,r13
      e9e3e8:	e8 7d bb bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e3ed:	4c 89 ff             	mov    rdi,r15
      e9e3f0:	e8 9b fa 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e3f5:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e3fc:	00 
      e9e3fd:	48 89 de             	mov    rsi,rbx
      e9e400:	e8 f3 0c ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e405:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e40c:	00 
      e9e40d:	e8 5c 9e ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e412:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      e9e419:	00 

### READ 0xe9e5ca: lea    rbp,[rsp+0x1060]
      e9e584:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
      e9e58a:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
      e9e58f:	66 0f ef c0          	pxor   xmm0,xmm0
      e9e593:	48 8d 94 24 e0 0e 00 	lea    rdx,[rsp+0xee0]
      e9e59a:	00 
      e9e59b:	f3 0f 7f 02          	movdqu XMMWORD PTR [rdx],xmm0
      e9e59f:	66 0f 6f 4c 24 10    	movdqa xmm1,XMMWORD PTR [rsp+0x10]
      e9e5a5:	f3 0f 7f 48 28       	movdqu XMMWORD PTR [rax+0x28],xmm1
      e9e5aa:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
      e9e5ae:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9e5b5:	00 
      e9e5b6:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      e9e5ba:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9e5c1:	00 
      e9e5c2:	4c 8d bc 24 a0 0e 00 	lea    r15,[rsp+0xea0]
      e9e5c9:	00 
      e9e5ca:	48 8d ac 24 60 10 00 	lea    rbp,[rsp+0x1060]
      e9e5d1:	00 
      e9e5d2:	48 89 df             	mov    rdi,rbx
      e9e5d5:	4c 89 fe             	mov    rsi,r15
      e9e5d8:	48 89 ea             	mov    rdx,rbp
      e9e5db:	4c 89 f1             	mov    rcx,r14
      e9e5de:	e8 63 9b ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9e5e3:	4c 89 f7             	mov    rdi,r14
      e9e5e6:	e8 7f b9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e5eb:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      e9e5f2:	00 
      e9e5f3:	e8 0c 59 06 00       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
      e9e5f8:	48 89 ef             	mov    rdi,rbp
      e9e5fb:	e8 6a b9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e600:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9e607:	00 
      e9e608:	e8 f7 58 06 00       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
      e9e60d:	4c 89 ff             	mov    rdi,r15
      e9e610:	e8 7b f8 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e615:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e61c:	00 
      e9e61d:	48 89 de             	mov    rsi,rbx
      e9e620:	e8 d3 0a ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e625:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e62c:	00 
      e9e62d:	e8 3c 9c ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e632:	4c 89 ef             	mov    rdi,r13
      e9e635:	e8 4c fe bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e63a:	4c 89 e7             	mov    rdi,r12
      e9e63d:	e8 44 fe bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e642:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      e9e649:	00 
      e9e64a:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]

### WRITE 0xe9e694: mov    QWORD PTR [rsp+0x1060],rcx
      e9e656:	48 85 db             	test   rbx,rbx
      e9e659:	74 05                	je     e9e660 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65a76>
      e9e65b:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9e660:	48 8d 35 09 6a 53 ff 	lea    rsi,[rip+0xffffffffff536a09]        # 3d5070 <_ZTSN5boost17bad_function_callE@@Base+0x23b6>
      e9e667:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e66e:	00 
      e9e66f:	e8 cc f8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e674:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
      e9e67b:	00 
      e9e67c:	48 85 db             	test   rbx,rbx
      e9e67f:	74 0a                	je     e9e68b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65aa1>
      e9e681:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9e686:	48 89 d8             	mov    rax,rbx
      e9e689:	eb 02                	jmp    e9e68d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65aa3>
      e9e68b:	31 c0                	xor    eax,eax
      e9e68d:	48 8d 0d 84 af 99 00 	lea    rcx,[rip+0x99af84]        # 1839618 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb5b0>
      e9e694:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9e69b:	00 
      e9e69c:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9e6a1:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9e6a8:	00 
      e9e6a9:	48 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbp
      e9e6b0:	00 
      e9e6b1:	48 85 c0             	test   rax,rax
      e9e6b4:	74 05                	je     e9e6bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65ad1>
      e9e6b6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9e6bb:	48 8d 0d 2e b1 99 00 	lea    rcx,[rip+0x99b12e]        # 18397f0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb788>
      e9e6c2:	48 89 8c 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rcx
      e9e6c9:	00 
      e9e6ca:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9e6d0:	66 0f d6 84 24 08 0d 	movq   QWORD PTR [rsp+0xd08],xmm0
      e9e6d7:	00 00 
      e9e6d9:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
      e9e6e0:	00 
      e9e6e1:	48 8d ac 24 00 0d 00 	lea    rbp,[rsp+0xd00]
      e9e6e8:	00 
      e9e6e9:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
      e9e6f0:	00 
      e9e6f1:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9e6f8:	00 
      e9e6f9:	4c 8d bc 24 30 0b 00 	lea    r15,[rsp+0xb30]
      e9e700:	00 
      e9e701:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
      e9e708:	00 
      e9e709:	4c 89 e7             	mov    rdi,r12
      e9e70c:	4c 89 fe             	mov    rsi,r15
      e9e70f:	4c 89 f2             	mov    rdx,r14
      e9e712:	48 89 e9             	mov    rcx,rbp
      e9e715:	e8 2c 9a ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>

### READ 0xe9e701: lea    r14,[rsp+0x1060]
      e9e6bb:	48 8d 0d 2e b1 99 00 	lea    rcx,[rip+0x99b12e]        # 18397f0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb788>
      e9e6c2:	48 89 8c 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rcx
      e9e6c9:	00 
      e9e6ca:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9e6d0:	66 0f d6 84 24 08 0d 	movq   QWORD PTR [rsp+0xd08],xmm0
      e9e6d7:	00 00 
      e9e6d9:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
      e9e6e0:	00 
      e9e6e1:	48 8d ac 24 00 0d 00 	lea    rbp,[rsp+0xd00]
      e9e6e8:	00 
      e9e6e9:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
      e9e6f0:	00 
      e9e6f1:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9e6f8:	00 
      e9e6f9:	4c 8d bc 24 30 0b 00 	lea    r15,[rsp+0xb30]
      e9e700:	00 
      e9e701:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
      e9e708:	00 
      e9e709:	4c 89 e7             	mov    rdi,r12
      e9e70c:	4c 89 fe             	mov    rsi,r15
      e9e70f:	4c 89 f2             	mov    rdx,r14
      e9e712:	48 89 e9             	mov    rcx,rbp
      e9e715:	e8 2c 9a ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9e71a:	48 89 ef             	mov    rdi,rbp
      e9e71d:	e8 48 b8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e722:	31 ff                	xor    edi,edi
      e9e724:	e8 5d fd bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e729:	4c 89 f7             	mov    rdi,r14
      e9e72c:	e8 39 b8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e731:	31 ff                	xor    edi,edi
      e9e733:	e8 4e fd bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e738:	4c 89 ff             	mov    rdi,r15
      e9e73b:	e8 50 f7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e740:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e747:	00 
      e9e748:	4c 89 e6             	mov    rsi,r12
      e9e74b:	e8 a8 09 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e750:	4c 8b b4 24 40 12 00 	mov    r14,QWORD PTR [rsp+0x1240]
      e9e757:	00 
      e9e758:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e75f:	00 
      e9e760:	e8 09 9b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e765:	48 89 df             	mov    rdi,rbx
      e9e768:	e8 19 fd bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e76d:	80 7c 24 25 00       	cmp    BYTE PTR [rsp+0x25],0x0
      e9e772:	0f 85 02 04 00 00    	jne    e9eb7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65f90>
      e9e778:	48 8b 8c 24 98 12 00 	mov    rcx,QWORD PTR [rsp+0x1298]
      e9e77f:	00 
      e9e780:	48 8b 01             	mov    rax,QWORD PTR [rcx]

### READ 0xe9e7e6: lea    rdi,[rsp+0x1060]
      e9e7a0:	45 31 e4             	xor    r12d,r12d
      e9e7a3:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
      e9e7aa:	00 
      e9e7ab:	48 8d 0d ae 30 99 00 	lea    rcx,[rip+0x9930ae]        # 1831860 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x37f8>
      e9e7b2:	48 89 8c 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],rcx
      e9e7b9:	00 
      e9e7ba:	48 89 84 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],rax
      e9e7c1:	00 
      e9e7c2:	4c 89 a4 24 40 0b 00 	mov    QWORD PTR [rsp+0xb40],r12
      e9e7c9:	00 
      e9e7ca:	4c 89 bc 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],r15
      e9e7d1:	00 
      e9e7d2:	48 8d 35 17 5f 53 ff 	lea    rsi,[rip+0xffffffffff535f17]        # 3d46f0 <_ZTSN5boost17bad_function_callE@@Base+0x1a36>
      e9e7d9:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9e7e0:	00 
      e9e7e1:	e8 5a f7 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e7e6:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9e7ed:	00 
      e9e7ee:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9e7f5:	00 
      e9e7f6:	e8 95 ba bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e7fb:	6a 01                	push   0x1
      e9e7fd:	58                   	pop    rax
      e9e7fe:	48 89 84 24 90 10 00 	mov    QWORD PTR [rsp+0x1090],rax
      e9e805:	00 
      e9e806:	48 89 84 24 98 10 00 	mov    QWORD PTR [rsp+0x1098],rax
      e9e80d:	00 
      e9e80e:	48 83 a4 24 20 0d 00 	and    QWORD PTR [rsp+0xd20],0x0
      e9e815:	00 00 
      e9e817:	6a 50                	push   0x50
      e9e819:	5f                   	pop    rdi
      e9e81a:	e8 e1 f6 94 00       	call   17edf00 <_Znwm@plt>
      e9e81f:	49 89 c7             	mov    r15,rax
      e9e822:	48 89 84 24 d0 0e 00 	mov    QWORD PTR [rsp+0xed0],rax
      e9e829:	00 
      e9e82a:	48 89 9c 24 d8 0e 00 	mov    QWORD PTR [rsp+0xed8],rbx
      e9e831:	00 
      e9e832:	48 c7 84 24 e0 0e 00 	mov    QWORD PTR [rsp+0xee0],0x1
      e9e839:	00 01 00 00 00 
      e9e83e:	48 8d 05 c3 46 99 00 	lea    rax,[rip+0x9946c3]        # 1832f08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4ea0>
      e9e845:	49 89 07             	mov    QWORD PTR [r15],rax
      e9e848:	4c 89 ff             	mov    rdi,r15
      e9e84b:	48 83 c7 10          	add    rdi,0x10
      e9e84f:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9e856:	00 
      e9e857:	e8 34 ba bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e85c:	4c 8d b4 24 90 10 00 	lea    r14,[rsp+0x1090]
      e9e863:	00 
      e9e864:	48 8d 9c 24 d0 0e 00 	lea    rbx,[rsp+0xed0]

### READ 0xe9e84f: lea    rsi,[rsp+0x1060]
      e9e80e:	48 83 a4 24 20 0d 00 	and    QWORD PTR [rsp+0xd20],0x0
      e9e815:	00 00 
      e9e817:	6a 50                	push   0x50
      e9e819:	5f                   	pop    rdi
      e9e81a:	e8 e1 f6 94 00       	call   17edf00 <_Znwm@plt>
      e9e81f:	49 89 c7             	mov    r15,rax
      e9e822:	48 89 84 24 d0 0e 00 	mov    QWORD PTR [rsp+0xed0],rax
      e9e829:	00 
      e9e82a:	48 89 9c 24 d8 0e 00 	mov    QWORD PTR [rsp+0xed8],rbx
      e9e831:	00 
      e9e832:	48 c7 84 24 e0 0e 00 	mov    QWORD PTR [rsp+0xee0],0x1
      e9e839:	00 01 00 00 00 
      e9e83e:	48 8d 05 c3 46 99 00 	lea    rax,[rip+0x9946c3]        # 1832f08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4ea0>
      e9e845:	49 89 07             	mov    QWORD PTR [r15],rax
      e9e848:	4c 89 ff             	mov    rdi,r15
      e9e84b:	48 83 c7 10          	add    rdi,0x10
      e9e84f:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9e856:	00 
      e9e857:	e8 34 ba bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e85c:	4c 8d b4 24 90 10 00 	lea    r14,[rsp+0x1090]
      e9e863:	00 
      e9e864:	48 8d 9c 24 d0 0e 00 	lea    rbx,[rsp+0xed0]
      e9e86b:	00 
      e9e86c:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      e9e870:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      e9e875:	66 41 0f 7f 47 40    	movdqa XMMWORD PTR [r15+0x40],xmm0
      e9e87b:	4c 8d ac 24 00 0d 00 	lea    r13,[rsp+0xd00]
      e9e882:	00 
      e9e883:	4d 89 7d 20          	mov    QWORD PTR [r13+0x20],r15
      e9e887:	48 89 df             	mov    rdi,rbx
      e9e88a:	e8 3b ba bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9e88f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e896:	00 
      e9e897:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9e89e:	00 
      e9e89f:	4c 89 ea             	mov    rdx,r13
      e9e8a2:	e8 01 82 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9e8a7:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9e8ae:	00 
      e9e8af:	e8 b6 b6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e8b4:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9e8bb:	00 
      e9e8bc:	e8 a9 b6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e8c1:	4c 8d ac 24 a0 0e 00 	lea    r13,[rsp+0xea0]
      e9e8c8:	00 
      e9e8c9:	4c 89 ef             	mov    rdi,r13
      e9e8cc:	e8 bf f5 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e8d1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e8d8:	00 

### READ 0xe9e8b4: lea    rdi,[rsp+0x1060]
      e9e870:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      e9e875:	66 41 0f 7f 47 40    	movdqa XMMWORD PTR [r15+0x40],xmm0
      e9e87b:	4c 8d ac 24 00 0d 00 	lea    r13,[rsp+0xd00]
      e9e882:	00 
      e9e883:	4d 89 7d 20          	mov    QWORD PTR [r13+0x20],r15
      e9e887:	48 89 df             	mov    rdi,rbx
      e9e88a:	e8 3b ba bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9e88f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e896:	00 
      e9e897:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9e89e:	00 
      e9e89f:	4c 89 ea             	mov    rdx,r13
      e9e8a2:	e8 01 82 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9e8a7:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9e8ae:	00 
      e9e8af:	e8 b6 b6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e8b4:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9e8bb:	00 
      e9e8bc:	e8 a9 b6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e8c1:	4c 8d ac 24 a0 0e 00 	lea    r13,[rsp+0xea0]
      e9e8c8:	00 
      e9e8c9:	4c 89 ef             	mov    rdi,r13
      e9e8cc:	e8 bf f5 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e8d1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e8d8:	00 
      e9e8d9:	e8 8c b6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e8de:	31 ff                	xor    edi,edi
      e9e8e0:	e8 a1 fb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e8e5:	4c 89 e7             	mov    rdi,r12
      e9e8e8:	e8 99 fb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e8ed:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e8f4:	00 
      e9e8f5:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9e8fc:	00 
      e9e8fd:	e8 f6 07 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e902:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9e909:	00 
      e9e90a:	e8 5f 99 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9e90f:	48 89 ef             	mov    rdi,rbp
      e9e912:	e8 6f fb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9e917:	48 8b 8c 24 98 12 00 	mov    rcx,QWORD PTR [rsp+0x1298]
      e9e91e:	00 
      e9e91f:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      e9e922:	4c 8b 79 08          	mov    r15,QWORD PTR [rcx+0x8]
      e9e926:	4d 85 ff             	test   r15,r15
      e9e929:	74 14                	je     e9e93f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65d55>
      e9e92b:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e930:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9e935:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]

### READ 0xe9e97c: lea    rdi,[rsp+0x1060]
      e9e93a:	4c 89 fd             	mov    rbp,r15
      e9e93d:	eb 02                	jmp    e9e941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65d57>
      e9e93f:	31 ed                	xor    ebp,ebp
      e9e941:	48 8d 0d 18 2f 99 00 	lea    rcx,[rip+0x992f18]        # 1831860 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x37f8>
      e9e948:	48 89 8c 24 a0 0e 00 	mov    QWORD PTR [rsp+0xea0],rcx
      e9e94f:	00 
      e9e950:	48 89 84 24 a8 0e 00 	mov    QWORD PTR [rsp+0xea8],rax
      e9e957:	00 
      e9e958:	48 89 ac 24 b0 0e 00 	mov    QWORD PTR [rsp+0xeb0],rbp
      e9e95f:	00 
      e9e960:	4c 89 ac 24 c0 0e 00 	mov    QWORD PTR [rsp+0xec0],r13
      e9e967:	00 
      e9e968:	48 8d 35 e9 66 53 ff 	lea    rsi,[rip+0xffffffffff5366e9]        # 3d5058 <_ZTSN5boost17bad_function_callE@@Base+0x239e>
      e9e96f:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9e976:	00 
      e9e977:	e8 c4 f5 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e97c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9e983:	00 
      e9e984:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9e98b:	00 
      e9e98c:	e8 ff b8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e991:	48 c7 84 24 90 10 00 	mov    QWORD PTR [rsp+0x1090],0x5
      e9e998:	00 05 00 00 00 
      e9e99d:	48 c7 84 24 98 10 00 	mov    QWORD PTR [rsp+0x1098],0xa
      e9e9a4:	00 0a 00 00 00 
      e9e9a9:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9e9b0:	00 00 
      e9e9b2:	6a 50                	push   0x50
      e9e9b4:	5f                   	pop    rdi
      e9e9b5:	e8 46 f5 94 00       	call   17edf00 <_Znwm@plt>
      e9e9ba:	49 89 c4             	mov    r12,rax
      e9e9bd:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9e9c4:	00 
      e9e9c5:	48 89 9c 24 08 0d 00 	mov    QWORD PTR [rsp+0xd08],rbx
      e9e9cc:	00 
      e9e9cd:	48 c7 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],0x1
      e9e9d4:	00 01 00 00 00 
      e9e9d9:	48 8d 05 a8 ab 99 00 	lea    rax,[rip+0x99aba8]        # 1839588 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb520>
      e9e9e0:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9e9e4:	4c 89 e7             	mov    rdi,r12
      e9e9e7:	48 83 c7 10          	add    rdi,0x10
      e9e9eb:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9e9f2:	00 
      e9e9f3:	e8 98 b8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e9f8:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      e9e9fd:	66 41 0f 7f 44 24 40 	movdqa XMMWORD PTR [r12+0x40],xmm0
      e9ea04:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ea0b:	00 
      e9ea0c:	48 83 27 00          	and    QWORD PTR [rdi],0x0

### READ 0xe9e9eb: lea    rsi,[rsp+0x1060]
      e9e9a9:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9e9b0:	00 00 
      e9e9b2:	6a 50                	push   0x50
      e9e9b4:	5f                   	pop    rdi
      e9e9b5:	e8 46 f5 94 00       	call   17edf00 <_Znwm@plt>
      e9e9ba:	49 89 c4             	mov    r12,rax
      e9e9bd:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9e9c4:	00 
      e9e9c5:	48 89 9c 24 08 0d 00 	mov    QWORD PTR [rsp+0xd08],rbx
      e9e9cc:	00 
      e9e9cd:	48 c7 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],0x1
      e9e9d4:	00 01 00 00 00 
      e9e9d9:	48 8d 05 a8 ab 99 00 	lea    rax,[rip+0x99aba8]        # 1839588 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb520>
      e9e9e0:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9e9e4:	4c 89 e7             	mov    rdi,r12
      e9e9e7:	48 83 c7 10          	add    rdi,0x10
      e9e9eb:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9e9f2:	00 
      e9e9f3:	e8 98 b8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9e9f8:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      e9e9fd:	66 41 0f 7f 44 24 40 	movdqa XMMWORD PTR [r12+0x40],xmm0
      e9ea04:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ea0b:	00 
      e9ea0c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9ea10:	4c 89 a4 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],r12
      e9ea17:	00 
      e9ea18:	e8 ad b8 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9ea1d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ea24:	00 
      e9ea25:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9ea2c:	00 
      e9ea2d:	e8 5e b8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9ea32:	48 c7 84 24 30 0d 00 	mov    QWORD PTR [rsp+0xd30],0x5
      e9ea39:	00 05 00 00 00 
      e9ea3e:	48 c7 84 24 38 0d 00 	mov    QWORD PTR [rsp+0xd38],0xa
      e9ea45:	00 0a 00 00 00 
      e9ea4a:	6a 50                	push   0x50
      e9ea4c:	5f                   	pop    rdi
      e9ea4d:	e8 ae f4 94 00       	call   17edf00 <_Znwm@plt>
      e9ea52:	48 89 c3             	mov    rbx,rax
      e9ea55:	48 89 84 24 d0 0c 00 	mov    QWORD PTR [rsp+0xcd0],rax
      e9ea5c:	00 
      e9ea5d:	48 8d 84 24 80 03 00 	lea    rax,[rsp+0x380]
      e9ea64:	00 
      e9ea65:	48 89 84 24 d8 0c 00 	mov    QWORD PTR [rsp+0xcd8],rax
      e9ea6c:	00 
      e9ea6d:	48 c7 84 24 e0 0c 00 	mov    QWORD PTR [rsp+0xce0],0x1
      e9ea74:	00 01 00 00 00 
      e9ea79:	48 8d 05 50 ab 99 00 	lea    rax,[rip+0x99ab50]        # 18395d0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb568>

### READ 0xe9eb0c: lea    rdi,[rsp+0x1060]
      e9eace:	4c 8d ac 24 b0 03 00 	lea    r13,[rsp+0x3b0]
      e9ead5:	00 
      e9ead6:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9eadd:	00 
      e9eade:	48 89 df             	mov    rdi,rbx
      e9eae1:	4c 89 ee             	mov    rsi,r13
      e9eae4:	4c 89 f2             	mov    rdx,r14
      e9eae7:	4c 89 e1             	mov    rcx,r12
      e9eaea:	e8 57 96 ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9eaef:	4c 89 e7             	mov    rdi,r12
      e9eaf2:	e8 73 b4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9eaf7:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9eafe:	00 
      e9eaff:	e8 66 b4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9eb04:	4c 89 f7             	mov    rdi,r14
      e9eb07:	e8 5e b4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9eb0c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9eb13:	00 
      e9eb14:	e8 51 b4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9eb19:	4c 89 ef             	mov    rdi,r13
      e9eb1c:	e8 6f f3 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9eb21:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9eb28:	00 
      e9eb29:	e8 3c b4 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9eb2e:	31 ff                	xor    edi,edi
      e9eb30:	e8 51 f9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9eb35:	48 89 ef             	mov    rdi,rbp
      e9eb38:	e8 49 f9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9eb3d:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9eb44:	00 
      e9eb45:	48 89 de             	mov    rsi,rbx
      e9eb48:	e8 ab 05 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9eb4d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eb54:	00 
      e9eb55:	e8 14 97 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9eb5a:	4c 89 ff             	mov    rdi,r15
      e9eb5d:	e8 24 f9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9eb62:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
      e9eb69:	00 
      e9eb6a:	4c 8b b4 24 40 12 00 	mov    r14,QWORD PTR [rsp+0x1240]
      e9eb71:	00 
      e9eb72:	48 8d ac 24 00 0d 00 	lea    rbp,[rsp+0xd00]
      e9eb79:	00 
      e9eb7a:	0f b6 94 24 d4 06 00 	movzx  edx,BYTE PTR [rsp+0x6d4]
      e9eb81:	00 
      e9eb82:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eb89:	00 
      e9eb8a:	48 8b b4 24 90 12 00 	mov    rsi,QWORD PTR [rsp+0x1290]
      e9eb91:	00 

### READ 0xe9ebac: lea    r15,[rsp+0x1060]
      e9eb6a:	4c 8b b4 24 40 12 00 	mov    r14,QWORD PTR [rsp+0x1240]
      e9eb71:	00 
      e9eb72:	48 8d ac 24 00 0d 00 	lea    rbp,[rsp+0xd00]
      e9eb79:	00 
      e9eb7a:	0f b6 94 24 d4 06 00 	movzx  edx,BYTE PTR [rsp+0x6d4]
      e9eb81:	00 
      e9eb82:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eb89:	00 
      e9eb8a:	48 8b b4 24 90 12 00 	mov    rsi,QWORD PTR [rsp+0x1290]
      e9eb91:	00 
      e9eb92:	e8 1b c0 07 00       	call   f1abb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1fc8>
      e9eb97:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9eb9e:	00 
      e9eb9f:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9eba6:	00 
      e9eba7:	e8 4c 05 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9ebac:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9ebb3:	00 
      e9ebb4:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ebbb:	00 
      e9ebbc:	e8 ad 96 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9ebc1:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ebc8:	00 
      e9ebc9:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
      e9ebcd:	48 8b 84 24 10 01 00 	mov    rax,QWORD PTR [rsp+0x110]
      e9ebd4:	00 
      e9ebd5:	48 8b 10             	mov    rdx,QWORD PTR [rax]
      e9ebd8:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
      e9ebdc:	e8 1f 01 ff ff       	call   e8ed00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56116>
      e9ebe1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ebe5:	48 8d 35 e9 57 53 ff 	lea    rsi,[rip+0xffffffffff5357e9]        # 3d43d5 <_ZTSN5boost17bad_function_callE@@Base+0x171b>
      e9ebec:	48 8d 0d fd 57 53 ff 	lea    rcx,[rip+0xffffffffff5357fd]        # 3d43f0 <_ZTSN5boost17bad_function_callE@@Base+0x1736>
      e9ebf3:	6a 0b                	push   0xb
      e9ebf5:	5a                   	pop    rdx
      e9ebf6:	6a 27                	push   0x27
      e9ebf8:	41 58                	pop    r8
      e9ebfa:	45 31 c9             	xor    r9d,r9d
      e9ebfd:	e8 88 87 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ec02:	84 c0                	test   al,al
      e9ec04:	0f 84 8f 00 00 00    	je     e9ec99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x660af>
      e9ec0a:	48 8d 35 d2 13 4b ff 	lea    rsi,[rip+0xffffffffff4b13d2]        # 34ffe3 <_ZTSSt12bad_any_cast@@Base-0x401e5>
      e9ec11:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ec18:	00 
      e9ec19:	e8 60 ae bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e9ec1e:	48 8b 84 24 b0 12 00 	mov    rax,QWORD PTR [rsp+0x12b0]
      e9ec25:	00 
      e9ec26:	48 8d 0d eb 9f 99 00 	lea    rcx,[rip+0x999feb]        # 1838c18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xabb0>
      e9ec2d:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9ec34:	00 

### WRITE 0xe9ec2d: mov    QWORD PTR [rsp+0x1060],rcx
      e9ebec:	48 8d 0d fd 57 53 ff 	lea    rcx,[rip+0xffffffffff5357fd]        # 3d43f0 <_ZTSN5boost17bad_function_callE@@Base+0x1736>
      e9ebf3:	6a 0b                	push   0xb
      e9ebf5:	5a                   	pop    rdx
      e9ebf6:	6a 27                	push   0x27
      e9ebf8:	41 58                	pop    r8
      e9ebfa:	45 31 c9             	xor    r9d,r9d
      e9ebfd:	e8 88 87 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ec02:	84 c0                	test   al,al
      e9ec04:	0f 84 8f 00 00 00    	je     e9ec99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x660af>
      e9ec0a:	48 8d 35 d2 13 4b ff 	lea    rsi,[rip+0xffffffffff4b13d2]        # 34ffe3 <_ZTSSt12bad_any_cast@@Base-0x401e5>
      e9ec11:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ec18:	00 
      e9ec19:	e8 60 ae bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e9ec1e:	48 8b 84 24 b0 12 00 	mov    rax,QWORD PTR [rsp+0x12b0]
      e9ec25:	00 
      e9ec26:	48 8d 0d eb 9f 99 00 	lea    rcx,[rip+0x999feb]        # 1838c18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xabb0>
      e9ec2d:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9ec34:	00 
      e9ec35:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9ec3c:	00 
      e9ec3d:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9ec44:	00 
      e9ec45:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ec4c:	00 
      e9ec4d:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ec54:	00 
      e9ec55:	4c 89 fa             	mov    rdx,r15
      e9ec58:	e8 4b 7e 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9ec5d:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9ec64:	00 
      e9ec65:	e8 00 b3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ec6a:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ec71:	00 
      e9ec72:	e8 19 f2 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9ec77:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ec7e:	00 
      e9ec7f:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9ec86:	00 
      e9ec87:	e8 6c 04 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9ec8c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ec93:	00 
      e9ec94:	e8 d5 95 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9ec99:	80 bc 24 c0 00 00 00 	cmp    BYTE PTR [rsp+0xc0],0x0
      e9eca0:	00 
      e9eca1:	74 55                	je     e9ecf8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6610e>
      e9eca3:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      e9ecaa:	00 
      e9ecab:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9ecae:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0

### READ 0xe9ec5d: lea    rdi,[rsp+0x1060]
      e9ec19:	e8 60 ae bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e9ec1e:	48 8b 84 24 b0 12 00 	mov    rax,QWORD PTR [rsp+0x12b0]
      e9ec25:	00 
      e9ec26:	48 8d 0d eb 9f 99 00 	lea    rcx,[rip+0x999feb]        # 1838c18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xabb0>
      e9ec2d:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9ec34:	00 
      e9ec35:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9ec3c:	00 
      e9ec3d:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9ec44:	00 
      e9ec45:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ec4c:	00 
      e9ec4d:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ec54:	00 
      e9ec55:	4c 89 fa             	mov    rdx,r15
      e9ec58:	e8 4b 7e 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9ec5d:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9ec64:	00 
      e9ec65:	e8 00 b3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ec6a:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ec71:	00 
      e9ec72:	e8 19 f2 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9ec77:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ec7e:	00 
      e9ec7f:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9ec86:	00 
      e9ec87:	e8 6c 04 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9ec8c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ec93:	00 
      e9ec94:	e8 d5 95 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9ec99:	80 bc 24 c0 00 00 00 	cmp    BYTE PTR [rsp+0xc0],0x0
      e9eca0:	00 
      e9eca1:	74 55                	je     e9ecf8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6610e>
      e9eca3:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      e9ecaa:	00 
      e9ecab:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9ecae:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9ecb3:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9ecb7:	48 85 c0             	test   rax,rax
      e9ecba:	74 05                	je     e9ecc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x660d7>
      e9ecbc:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ecc1:	48 8d 35 08 9c 53 ff 	lea    rsi,[rip+0xffffffffff539c08]        # 3d88d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34b5>
      e9ecc8:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9eccf:	00 
      e9ecd0:	e8 6b f2 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9ecd5:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ecdb:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e9ece2:	48 85 db             	test   rbx,rbx
      e9ece5:	0f 84 e3 00 00 00    	je     e9edce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x661e4>

### WRITE 0xe9ed3d: mov    QWORD PTR [rsp+0x1060],rax
      e9ecf8:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      e9ecff:	00 
      e9ed00:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9ed04:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e9ed0a:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
      e9ed0e:	48 85 db             	test   rbx,rbx
      e9ed11:	74 05                	je     e9ed18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6612e>
      e9ed13:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9ed18:	48 8d 35 b1 9b 53 ff 	lea    rsi,[rip+0xffffffffff539bb1]        # 3d88d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34b5>
      e9ed1f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ed26:	00 
      e9ed27:	e8 14 f2 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9ed2c:	48 85 db             	test   rbx,rbx
      e9ed2f:	74 05                	je     e9ed36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6614c>
      e9ed31:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9ed36:	48 8d 05 03 1b 9b 00 	lea    rax,[rip+0x9b1b03]        # 1850840 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xcf28>
      e9ed3d:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ed44:	00 
      e9ed45:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ed4b:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9ed52:	00 00 
      e9ed54:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9ed5b:	00 
      e9ed5c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ed63:	00 
      e9ed64:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ed6b:	00 
      e9ed6c:	4c 89 fa             	mov    rdx,r15
      e9ed6f:	e8 34 7d 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9ed74:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9ed7b:	00 
      e9ed7c:	e8 e9 b1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ed81:	31 ff                	xor    edi,edi
      e9ed83:	e8 fe f6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ed88:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ed8f:	00 
      e9ed90:	e8 fb f0 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9ed95:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ed9c:	00 
      e9ed9d:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9eda4:	00 
      e9eda5:	e8 4e 03 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9edaa:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9edb1:	00 
      e9edb2:	e8 b7 94 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9edb7:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9edbd:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9edc4:	e8 bd f6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9edc9:	e9 ea 00 00 00       	jmp    e9eeb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x662ce>

### READ 0xe9ed74: lea    rdi,[rsp+0x1060]
      e9ed2f:	74 05                	je     e9ed36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6614c>
      e9ed31:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9ed36:	48 8d 05 03 1b 9b 00 	lea    rax,[rip+0x9b1b03]        # 1850840 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xcf28>
      e9ed3d:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ed44:	00 
      e9ed45:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ed4b:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9ed52:	00 00 
      e9ed54:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9ed5b:	00 
      e9ed5c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ed63:	00 
      e9ed64:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ed6b:	00 
      e9ed6c:	4c 89 fa             	mov    rdx,r15
      e9ed6f:	e8 34 7d 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9ed74:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9ed7b:	00 
      e9ed7c:	e8 e9 b1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ed81:	31 ff                	xor    edi,edi
      e9ed83:	e8 fe f6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ed88:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ed8f:	00 
      e9ed90:	e8 fb f0 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9ed95:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ed9c:	00 
      e9ed9d:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9eda4:	00 
      e9eda5:	e8 4e 03 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9edaa:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9edb1:	00 
      e9edb2:	e8 b7 94 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9edb7:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9edbd:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9edc4:	e8 bd f6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9edc9:	e9 ea 00 00 00       	jmp    e9eeb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x662ce>
      e9edce:	31 c0                	xor    eax,eax
      e9edd0:	48 8d 0d 49 18 9b 00 	lea    rcx,[rip+0x9b1849]        # 1850620 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xcd08>
      e9edd7:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9edde:	00 
      e9eddf:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9ede4:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9edeb:	00 
      e9edec:	4c 89 b4 24 78 10 00 	mov    QWORD PTR [rsp+0x1078],r14
      e9edf3:	00 
      e9edf4:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9edfb:	00 
      e9edfc:	48 85 c0             	test   rax,rax
      e9edff:	74 05                	je     e9ee06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6621c>

### WRITE 0xe9edd7: mov    QWORD PTR [rsp+0x1060],rcx
      e9ed8f:	00 
      e9ed90:	e8 fb f0 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9ed95:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ed9c:	00 
      e9ed9d:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9eda4:	00 
      e9eda5:	e8 4e 03 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9edaa:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9edb1:	00 
      e9edb2:	e8 b7 94 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9edb7:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9edbd:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9edc4:	e8 bd f6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9edc9:	e9 ea 00 00 00       	jmp    e9eeb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x662ce>
      e9edce:	31 c0                	xor    eax,eax
      e9edd0:	48 8d 0d 49 18 9b 00 	lea    rcx,[rip+0x9b1849]        # 1850620 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xcd08>
      e9edd7:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9edde:	00 
      e9eddf:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9ede4:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9edeb:	00 
      e9edec:	4c 89 b4 24 78 10 00 	mov    QWORD PTR [rsp+0x1078],r14
      e9edf3:	00 
      e9edf4:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9edfb:	00 
      e9edfc:	48 85 c0             	test   rax,rax
      e9edff:	74 05                	je     e9ee06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6621c>
      e9ee01:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ee06:	48 8d 0d eb 19 9b 00 	lea    rcx,[rip+0x9b19eb]        # 18507f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xcee0>
      e9ee0d:	48 89 8c 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rcx
      e9ee14:	00 
      e9ee15:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ee1b:	66 0f d6 84 24 08 0d 	movq   QWORD PTR [rsp+0xd08],xmm0
      e9ee22:	00 00 
      e9ee24:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
      e9ee2b:	00 
      e9ee2c:	4c 89 b4 24 18 0d 00 	mov    QWORD PTR [rsp+0xd18],r14
      e9ee33:	00 
      e9ee34:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
      e9ee3b:	00 
      e9ee3c:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9ee43:	00 
      e9ee44:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9ee4b:	00 
      e9ee4c:	4c 8d a4 24 60 10 00 	lea    r12,[rsp+0x1060]
      e9ee53:	00 
      e9ee54:	4c 89 ff             	mov    rdi,r15
      e9ee57:	4c 89 f6             	mov    rsi,r14
      e9ee5a:	4c 89 e2             	mov    rdx,r12

### READ 0xe9ee4c: lea    r12,[rsp+0x1060]
      e9ee06:	48 8d 0d eb 19 9b 00 	lea    rcx,[rip+0x9b19eb]        # 18507f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xcee0>
      e9ee0d:	48 89 8c 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rcx
      e9ee14:	00 
      e9ee15:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ee1b:	66 0f d6 84 24 08 0d 	movq   QWORD PTR [rsp+0xd08],xmm0
      e9ee22:	00 00 
      e9ee24:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
      e9ee2b:	00 
      e9ee2c:	4c 89 b4 24 18 0d 00 	mov    QWORD PTR [rsp+0xd18],r14
      e9ee33:	00 
      e9ee34:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
      e9ee3b:	00 
      e9ee3c:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9ee43:	00 
      e9ee44:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9ee4b:	00 
      e9ee4c:	4c 8d a4 24 60 10 00 	lea    r12,[rsp+0x1060]
      e9ee53:	00 
      e9ee54:	4c 89 ff             	mov    rdi,r15
      e9ee57:	4c 89 f6             	mov    rsi,r14
      e9ee5a:	4c 89 e2             	mov    rdx,r12
      e9ee5d:	48 89 e9             	mov    rcx,rbp
      e9ee60:	e8 e1 92 ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9ee65:	48 89 ef             	mov    rdi,rbp
      e9ee68:	e8 fd b0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ee6d:	31 ff                	xor    edi,edi
      e9ee6f:	e8 12 f6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ee74:	4c 89 e7             	mov    rdi,r12
      e9ee77:	e8 ee b0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ee7c:	31 ff                	xor    edi,edi
      e9ee7e:	e8 03 f6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ee83:	4c 89 f7             	mov    rdi,r14
      e9ee86:	e8 05 f0 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9ee8b:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ee92:	00 
      e9ee93:	4c 89 fe             	mov    rsi,r15
      e9ee96:	e8 5d 02 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9ee9b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eea2:	00 
      e9eea3:	e8 c6 93 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9eea8:	48 89 df             	mov    rdi,rbx
      e9eeab:	e8 d6 f5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9eeb0:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9eeb7:	00 
      e9eeb8:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9eebc:	48 8d 35 35 57 53 ff 	lea    rsi,[rip+0xffffffffff535735]        # 3d45f8 <_ZTSN5boost17bad_function_callE@@Base+0x193e>
      e9eec3:	48 8d 0d 46 57 53 ff 	lea    rcx,[rip+0xffffffffff535746]        # 3d4610 <_ZTSN5boost17bad_function_callE@@Base+0x1956>
      e9eeca:	6a 0b                	push   0xb
      e9eecc:	5a                   	pop    rdx

### READ 0xe9eeb0: lea    r15,[rsp+0x1060]
      e9ee6f:	e8 12 f6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ee74:	4c 89 e7             	mov    rdi,r12
      e9ee77:	e8 ee b0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ee7c:	31 ff                	xor    edi,edi
      e9ee7e:	e8 03 f6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ee83:	4c 89 f7             	mov    rdi,r14
      e9ee86:	e8 05 f0 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9ee8b:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ee92:	00 
      e9ee93:	4c 89 fe             	mov    rsi,r15
      e9ee96:	e8 5d 02 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9ee9b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eea2:	00 
      e9eea3:	e8 c6 93 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9eea8:	48 89 df             	mov    rdi,rbx
      e9eeab:	e8 d6 f5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9eeb0:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9eeb7:	00 
      e9eeb8:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9eebc:	48 8d 35 35 57 53 ff 	lea    rsi,[rip+0xffffffffff535735]        # 3d45f8 <_ZTSN5boost17bad_function_callE@@Base+0x193e>
      e9eec3:	48 8d 0d 46 57 53 ff 	lea    rcx,[rip+0xffffffffff535746]        # 3d4610 <_ZTSN5boost17bad_function_callE@@Base+0x1956>
      e9eeca:	6a 0b                	push   0xb
      e9eecc:	5a                   	pop    rdx
      e9eecd:	6a 20                	push   0x20
      e9eecf:	41 58                	pop    r8
      e9eed1:	6a 01                	push   0x1
      e9eed3:	41 59                	pop    r9
      e9eed5:	e8 b0 84 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9eeda:	84 c0                	test   al,al
      e9eedc:	0f 84 41 03 00 00    	je     e9f223 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66639>
      e9eee2:	48 8d 35 7f 5a 53 ff 	lea    rsi,[rip+0xffffffffff535a7f]        # 3d4968 <_ZTSN5boost17bad_function_callE@@Base+0x1cae>
      e9eee9:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9eef0:	00 
      e9eef1:	e8 4a f0 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9eef6:	48 8d 05 33 71 99 00 	lea    rax,[rip+0x997133]        # 1836030 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7fc8>
      e9eefd:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ef04:	00 
      e9ef05:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9ef0c:	00 
      e9ef0d:	48 8d 05 ac 73 99 00 	lea    rax,[rip+0x9973ac]        # 18362c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8258>
      e9ef14:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9ef1b:	00 
      e9ef1c:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
      e9ef23:	00 
      e9ef24:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9ef2b:	00 
      e9ef2c:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9ef33:	00 
      e9ef34:	48 89 df             	mov    rdi,rbx

### WRITE 0xe9eefd: mov    QWORD PTR [rsp+0x1060],rax
      e9eebc:	48 8d 35 35 57 53 ff 	lea    rsi,[rip+0xffffffffff535735]        # 3d45f8 <_ZTSN5boost17bad_function_callE@@Base+0x193e>
      e9eec3:	48 8d 0d 46 57 53 ff 	lea    rcx,[rip+0xffffffffff535746]        # 3d4610 <_ZTSN5boost17bad_function_callE@@Base+0x1956>
      e9eeca:	6a 0b                	push   0xb
      e9eecc:	5a                   	pop    rdx
      e9eecd:	6a 20                	push   0x20
      e9eecf:	41 58                	pop    r8
      e9eed1:	6a 01                	push   0x1
      e9eed3:	41 59                	pop    r9
      e9eed5:	e8 b0 84 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9eeda:	84 c0                	test   al,al
      e9eedc:	0f 84 41 03 00 00    	je     e9f223 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66639>
      e9eee2:	48 8d 35 7f 5a 53 ff 	lea    rsi,[rip+0xffffffffff535a7f]        # 3d4968 <_ZTSN5boost17bad_function_callE@@Base+0x1cae>
      e9eee9:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9eef0:	00 
      e9eef1:	e8 4a f0 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9eef6:	48 8d 05 33 71 99 00 	lea    rax,[rip+0x997133]        # 1836030 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7fc8>
      e9eefd:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ef04:	00 
      e9ef05:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9ef0c:	00 
      e9ef0d:	48 8d 05 ac 73 99 00 	lea    rax,[rip+0x9973ac]        # 18362c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8258>
      e9ef14:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9ef1b:	00 
      e9ef1c:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
      e9ef23:	00 
      e9ef24:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9ef2b:	00 
      e9ef2c:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9ef33:	00 
      e9ef34:	48 89 df             	mov    rdi,rbx
      e9ef37:	4c 89 f6             	mov    rsi,r14
      e9ef3a:	4c 89 fa             	mov    rdx,r15
      e9ef3d:	48 89 e9             	mov    rcx,rbp
      e9ef40:	e8 01 92 ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9ef45:	48 89 ef             	mov    rdi,rbp
      e9ef48:	e8 1d b0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ef4d:	4c 89 ff             	mov    rdi,r15
      e9ef50:	e8 15 b0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ef55:	4c 89 f7             	mov    rdi,r14
      e9ef58:	e8 33 ef 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9ef5d:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ef64:	00 
      e9ef65:	48 89 de             	mov    rsi,rbx
      e9ef68:	e8 8b 01 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9ef6d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ef74:	00 
      e9ef75:	e8 f4 92 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9ef7a:	48 8d 35 f7 58 53 ff 	lea    rsi,[rip+0xffffffffff5358f7]        # 3d4878 <_ZTSN5boost17bad_function_callE@@Base+0x1bbe>
      e9ef81:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]

### WRITE 0xe9ef95: mov    QWORD PTR [rsp+0x1060],rax
      e9ef4d:	4c 89 ff             	mov    rdi,r15
      e9ef50:	e8 15 b0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ef55:	4c 89 f7             	mov    rdi,r14
      e9ef58:	e8 33 ef 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9ef5d:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ef64:	00 
      e9ef65:	48 89 de             	mov    rsi,rbx
      e9ef68:	e8 8b 01 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9ef6d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ef74:	00 
      e9ef75:	e8 f4 92 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9ef7a:	48 8d 35 f7 58 53 ff 	lea    rsi,[rip+0xffffffffff5358f7]        # 3d4878 <_ZTSN5boost17bad_function_callE@@Base+0x1bbe>
      e9ef81:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ef88:	00 
      e9ef89:	e8 b2 ef 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9ef8e:	48 8d 05 8b 6e 99 00 	lea    rax,[rip+0x996e8b]        # 1835e20 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7db8>
      e9ef95:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ef9c:	00 
      e9ef9d:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9efa4:	00 
      e9efa5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9efac:	00 
      e9efad:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9efb4:	00 
      e9efb5:	4c 89 fa             	mov    rdx,r15
      e9efb8:	e8 eb 7a 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9efbd:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9efc4:	00 
      e9efc5:	48 89 df             	mov    rdi,rbx
      e9efc8:	e8 9d af bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9efcd:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9efd4:	00 
      e9efd5:	e8 b6 ee 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9efda:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9efe1:	00 
      e9efe2:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9efe9:	00 
      e9efea:	e8 09 01 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9efef:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eff6:	00 
      e9eff7:	e8 72 92 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9effc:	48 8d 35 2d 58 53 ff 	lea    rsi,[rip+0xffffffffff53582d]        # 3d4830 <_ZTSN5boost17bad_function_callE@@Base+0x1b76>
      e9f003:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f00a:	00 
      e9f00b:	e8 30 ef 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f010:	48 8d 05 f9 69 99 00 	lea    rax,[rip+0x9969f9]        # 1835a10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x79a8>
      e9f017:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f01e:	00 
      e9f01f:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx

### READ 0xe9efbd: lea    rbx,[rsp+0x1060]
      e9ef75:	e8 f4 92 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9ef7a:	48 8d 35 f7 58 53 ff 	lea    rsi,[rip+0xffffffffff5358f7]        # 3d4878 <_ZTSN5boost17bad_function_callE@@Base+0x1bbe>
      e9ef81:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ef88:	00 
      e9ef89:	e8 b2 ef 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9ef8e:	48 8d 05 8b 6e 99 00 	lea    rax,[rip+0x996e8b]        # 1835e20 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7db8>
      e9ef95:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ef9c:	00 
      e9ef9d:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9efa4:	00 
      e9efa5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9efac:	00 
      e9efad:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9efb4:	00 
      e9efb5:	4c 89 fa             	mov    rdx,r15
      e9efb8:	e8 eb 7a 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9efbd:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9efc4:	00 
      e9efc5:	48 89 df             	mov    rdi,rbx
      e9efc8:	e8 9d af bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9efcd:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9efd4:	00 
      e9efd5:	e8 b6 ee 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9efda:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9efe1:	00 
      e9efe2:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9efe9:	00 
      e9efea:	e8 09 01 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9efef:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eff6:	00 
      e9eff7:	e8 72 92 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9effc:	48 8d 35 2d 58 53 ff 	lea    rsi,[rip+0xffffffffff53582d]        # 3d4830 <_ZTSN5boost17bad_function_callE@@Base+0x1b76>
      e9f003:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f00a:	00 
      e9f00b:	e8 30 ef 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f010:	48 8d 05 f9 69 99 00 	lea    rax,[rip+0x9969f9]        # 1835a10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x79a8>
      e9f017:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f01e:	00 
      e9f01f:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f026:	00 
      e9f027:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f02e:	00 
      e9f02f:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f036:	00 
      e9f037:	48 89 da             	mov    rdx,rbx
      e9f03a:	e8 69 7a 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f03f:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9f046:	00 
      e9f047:	48 89 df             	mov    rdi,rbx

### WRITE 0xe9f017: mov    QWORD PTR [rsp+0x1060],rax
      e9efcd:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9efd4:	00 
      e9efd5:	e8 b6 ee 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9efda:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9efe1:	00 
      e9efe2:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9efe9:	00 
      e9efea:	e8 09 01 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9efef:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eff6:	00 
      e9eff7:	e8 72 92 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9effc:	48 8d 35 2d 58 53 ff 	lea    rsi,[rip+0xffffffffff53582d]        # 3d4830 <_ZTSN5boost17bad_function_callE@@Base+0x1b76>
      e9f003:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f00a:	00 
      e9f00b:	e8 30 ef 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f010:	48 8d 05 f9 69 99 00 	lea    rax,[rip+0x9969f9]        # 1835a10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x79a8>
      e9f017:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f01e:	00 
      e9f01f:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f026:	00 
      e9f027:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f02e:	00 
      e9f02f:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f036:	00 
      e9f037:	48 89 da             	mov    rdx,rbx
      e9f03a:	e8 69 7a 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f03f:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9f046:	00 
      e9f047:	48 89 df             	mov    rdi,rbx
      e9f04a:	e8 1b af bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f04f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f056:	00 
      e9f057:	e8 34 ee 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f05c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f063:	00 
      e9f064:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f06b:	00 
      e9f06c:	e8 87 00 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f071:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f078:	00 
      e9f079:	e8 f0 91 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f07e:	48 8d 35 c3 57 53 ff 	lea    rsi,[rip+0xffffffffff5357c3]        # 3d4848 <_ZTSN5boost17bad_function_callE@@Base+0x1b8e>
      e9f085:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f08c:	00 
      e9f08d:	e8 ae ee 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f092:	48 8d 05 87 6b 99 00 	lea    rax,[rip+0x996b87]        # 1835c20 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7bb8>
      e9f099:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f0a0:	00 
      e9f0a1:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx

### READ 0xe9f03f: lea    rbx,[rsp+0x1060]
      e9eff7:	e8 72 92 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9effc:	48 8d 35 2d 58 53 ff 	lea    rsi,[rip+0xffffffffff53582d]        # 3d4830 <_ZTSN5boost17bad_function_callE@@Base+0x1b76>
      e9f003:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f00a:	00 
      e9f00b:	e8 30 ef 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f010:	48 8d 05 f9 69 99 00 	lea    rax,[rip+0x9969f9]        # 1835a10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x79a8>
      e9f017:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f01e:	00 
      e9f01f:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f026:	00 
      e9f027:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f02e:	00 
      e9f02f:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f036:	00 
      e9f037:	48 89 da             	mov    rdx,rbx
      e9f03a:	e8 69 7a 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f03f:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9f046:	00 
      e9f047:	48 89 df             	mov    rdi,rbx
      e9f04a:	e8 1b af bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f04f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f056:	00 
      e9f057:	e8 34 ee 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f05c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f063:	00 
      e9f064:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f06b:	00 
      e9f06c:	e8 87 00 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f071:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f078:	00 
      e9f079:	e8 f0 91 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f07e:	48 8d 35 c3 57 53 ff 	lea    rsi,[rip+0xffffffffff5357c3]        # 3d4848 <_ZTSN5boost17bad_function_callE@@Base+0x1b8e>
      e9f085:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f08c:	00 
      e9f08d:	e8 ae ee 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f092:	48 8d 05 87 6b 99 00 	lea    rax,[rip+0x996b87]        # 1835c20 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7bb8>
      e9f099:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f0a0:	00 
      e9f0a1:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f0a8:	00 
      e9f0a9:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f0b0:	00 
      e9f0b1:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f0b8:	00 
      e9f0b9:	48 89 da             	mov    rdx,rbx
      e9f0bc:	e8 e7 79 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f0c1:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9f0c8:	00 
      e9f0c9:	48 89 df             	mov    rdi,rbx

### WRITE 0xe9f099: mov    QWORD PTR [rsp+0x1060],rax
      e9f04f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f056:	00 
      e9f057:	e8 34 ee 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f05c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f063:	00 
      e9f064:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f06b:	00 
      e9f06c:	e8 87 00 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f071:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f078:	00 
      e9f079:	e8 f0 91 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f07e:	48 8d 35 c3 57 53 ff 	lea    rsi,[rip+0xffffffffff5357c3]        # 3d4848 <_ZTSN5boost17bad_function_callE@@Base+0x1b8e>
      e9f085:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f08c:	00 
      e9f08d:	e8 ae ee 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f092:	48 8d 05 87 6b 99 00 	lea    rax,[rip+0x996b87]        # 1835c20 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7bb8>
      e9f099:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f0a0:	00 
      e9f0a1:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f0a8:	00 
      e9f0a9:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f0b0:	00 
      e9f0b1:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f0b8:	00 
      e9f0b9:	48 89 da             	mov    rdx,rbx
      e9f0bc:	e8 e7 79 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f0c1:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9f0c8:	00 
      e9f0c9:	48 89 df             	mov    rdi,rbx
      e9f0cc:	e8 99 ae bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f0d1:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f0d8:	00 
      e9f0d9:	e8 b2 ed 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f0de:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f0e5:	00 
      e9f0e6:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f0ed:	00 
      e9f0ee:	e8 05 00 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f0f3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f0fa:	00 
      e9f0fb:	e8 6e 91 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f100:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9f104:	48 8d 35 26 55 53 ff 	lea    rsi,[rip+0xffffffffff535526]        # 3d4631 <_ZTSN5boost17bad_function_callE@@Base+0x1977>
      e9f10b:	48 8d 0d 2e 55 53 ff 	lea    rcx,[rip+0xffffffffff53552e]        # 3d4640 <_ZTSN5boost17bad_function_callE@@Base+0x1986>
      e9f112:	6a 0b                	push   0xb
      e9f114:	5a                   	pop    rdx
      e9f115:	6a 1a                	push   0x1a
      e9f117:	41 58                	pop    r8
      e9f119:	45 31 c9             	xor    r9d,r9d

### READ 0xe9f0c1: lea    rbx,[rsp+0x1060]
      e9f079:	e8 f0 91 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f07e:	48 8d 35 c3 57 53 ff 	lea    rsi,[rip+0xffffffffff5357c3]        # 3d4848 <_ZTSN5boost17bad_function_callE@@Base+0x1b8e>
      e9f085:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f08c:	00 
      e9f08d:	e8 ae ee 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f092:	48 8d 05 87 6b 99 00 	lea    rax,[rip+0x996b87]        # 1835c20 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7bb8>
      e9f099:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f0a0:	00 
      e9f0a1:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f0a8:	00 
      e9f0a9:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f0b0:	00 
      e9f0b1:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f0b8:	00 
      e9f0b9:	48 89 da             	mov    rdx,rbx
      e9f0bc:	e8 e7 79 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f0c1:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9f0c8:	00 
      e9f0c9:	48 89 df             	mov    rdi,rbx
      e9f0cc:	e8 99 ae bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f0d1:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f0d8:	00 
      e9f0d9:	e8 b2 ed 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f0de:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f0e5:	00 
      e9f0e6:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f0ed:	00 
      e9f0ee:	e8 05 00 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f0f3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f0fa:	00 
      e9f0fb:	e8 6e 91 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f100:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9f104:	48 8d 35 26 55 53 ff 	lea    rsi,[rip+0xffffffffff535526]        # 3d4631 <_ZTSN5boost17bad_function_callE@@Base+0x1977>
      e9f10b:	48 8d 0d 2e 55 53 ff 	lea    rcx,[rip+0xffffffffff53552e]        # 3d4640 <_ZTSN5boost17bad_function_callE@@Base+0x1986>
      e9f112:	6a 0b                	push   0xb
      e9f114:	5a                   	pop    rdx
      e9f115:	6a 1a                	push   0x1a
      e9f117:	41 58                	pop    r8
      e9f119:	45 31 c9             	xor    r9d,r9d
      e9f11c:	e8 69 82 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9f121:	84 c0                	test   al,al
      e9f123:	0f 84 fa 00 00 00    	je     e9f223 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66639>
      e9f129:	48 8d 35 d0 5c 53 ff 	lea    rsi,[rip+0xffffffffff535cd0]        # 3d4e00 <_ZTSN5boost17bad_function_callE@@Base+0x2146>
      e9f130:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f137:	00 
      e9f138:	e8 03 ee 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f13d:	48 8b 84 24 70 12 00 	mov    rax,QWORD PTR [rsp+0x1270]
      e9f144:	00 
      e9f145:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]

### WRITE 0xe9f15e: mov    QWORD PTR [rsp+0x1060],rax
      e9f119:	45 31 c9             	xor    r9d,r9d
      e9f11c:	e8 69 82 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9f121:	84 c0                	test   al,al
      e9f123:	0f 84 fa 00 00 00    	je     e9f223 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66639>
      e9f129:	48 8d 35 d0 5c 53 ff 	lea    rsi,[rip+0xffffffffff535cd0]        # 3d4e00 <_ZTSN5boost17bad_function_callE@@Base+0x2146>
      e9f130:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f137:	00 
      e9f138:	e8 03 ee 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f13d:	48 8b 84 24 70 12 00 	mov    rax,QWORD PTR [rsp+0x1270]
      e9f144:	00 
      e9f145:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9f149:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      e9f14d:	48 8d 05 b4 71 99 00 	lea    rax,[rip+0x9971b4]        # 1836308 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x82a0>
      e9f154:	4d 85 ff             	test   r15,r15
      e9f157:	74 4d                	je     e9f1a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x665bc>
      e9f159:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9f15e:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f165:	00 
      e9f166:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f16d:	00 00 
      e9f16f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9f174:	eb 41                	jmp    e9f1b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x665cd>
      e9f176:	48 8d 35 2e 3d 4c ff 	lea    rsi,[rip+0xffffffffff4c3d2e]        # 362eab <_ZTSSt12bad_any_cast@@Base-0x2d31d>
      e9f17d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f184:	00 
      e9f185:	e8 c5 c6 bd ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e9f18a:	84 c0                	test   al,al
      e9f18c:	0f 84 64 b1 ff ff    	je     e9a2f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6170c>
      e9f192:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f199:	00 
      e9f19a:	e8 91 7b c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e9f19f:	6a 04                	push   0x4
      e9f1a1:	e9 2c b1 ff ff       	jmp    e9a2d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x616e8>
      e9f1a6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f1ad:	00 
      e9f1ae:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f1b5:	00 00 
      e9f1b7:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f1be:	00 
      e9f1bf:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f1c6:	00 
      e9f1c7:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f1ce:	00 
      e9f1cf:	48 89 da             	mov    rdx,rbx
      e9f1d2:	e8 d1 78 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f1d7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f1de:	00 
      e9f1df:	e8 86 ad bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f1e4:	4c 89 ff             	mov    rdi,r15

### WRITE 0xe9f1a6: mov    QWORD PTR [rsp+0x1060],rax
      e9f165:	00 
      e9f166:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f16d:	00 00 
      e9f16f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9f174:	eb 41                	jmp    e9f1b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x665cd>
      e9f176:	48 8d 35 2e 3d 4c ff 	lea    rsi,[rip+0xffffffffff4c3d2e]        # 362eab <_ZTSSt12bad_any_cast@@Base-0x2d31d>
      e9f17d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f184:	00 
      e9f185:	e8 c5 c6 bd ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e9f18a:	84 c0                	test   al,al
      e9f18c:	0f 84 64 b1 ff ff    	je     e9a2f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6170c>
      e9f192:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f199:	00 
      e9f19a:	e8 91 7b c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e9f19f:	6a 04                	push   0x4
      e9f1a1:	e9 2c b1 ff ff       	jmp    e9a2d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x616e8>
      e9f1a6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f1ad:	00 
      e9f1ae:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f1b5:	00 00 
      e9f1b7:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f1be:	00 
      e9f1bf:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f1c6:	00 
      e9f1c7:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f1ce:	00 
      e9f1cf:	48 89 da             	mov    rdx,rbx
      e9f1d2:	e8 d1 78 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f1d7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f1de:	00 
      e9f1df:	e8 86 ad bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f1e4:	4c 89 ff             	mov    rdi,r15
      e9f1e7:	e8 9a f2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f1ec:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f1f3:	00 
      e9f1f4:	e8 97 ec 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f1f9:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f200:	00 
      e9f201:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f208:	00 
      e9f209:	e8 ea fe fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f20e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f215:	00 
      e9f216:	e8 53 90 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f21b:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9f222:	00 
      e9f223:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9f227:	48 8d 35 fc 52 53 ff 	lea    rsi,[rip+0xffffffffff5352fc]        # 3d452a <_ZTSN5boost17bad_function_callE@@Base+0x1870>
      e9f22e:	48 8d 0d 0b 53 53 ff 	lea    rcx,[rip+0xffffffffff53530b]        # 3d4540 <_ZTSN5boost17bad_function_callE@@Base+0x1886>

### READ 0xe9f1d7: lea    rdi,[rsp+0x1060]
      e9f199:	00 
      e9f19a:	e8 91 7b c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e9f19f:	6a 04                	push   0x4
      e9f1a1:	e9 2c b1 ff ff       	jmp    e9a2d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x616e8>
      e9f1a6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f1ad:	00 
      e9f1ae:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f1b5:	00 00 
      e9f1b7:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f1be:	00 
      e9f1bf:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f1c6:	00 
      e9f1c7:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f1ce:	00 
      e9f1cf:	48 89 da             	mov    rdx,rbx
      e9f1d2:	e8 d1 78 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f1d7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f1de:	00 
      e9f1df:	e8 86 ad bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f1e4:	4c 89 ff             	mov    rdi,r15
      e9f1e7:	e8 9a f2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f1ec:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f1f3:	00 
      e9f1f4:	e8 97 ec 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f1f9:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f200:	00 
      e9f201:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f208:	00 
      e9f209:	e8 ea fe fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f20e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f215:	00 
      e9f216:	e8 53 90 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f21b:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9f222:	00 
      e9f223:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9f227:	48 8d 35 fc 52 53 ff 	lea    rsi,[rip+0xffffffffff5352fc]        # 3d452a <_ZTSN5boost17bad_function_callE@@Base+0x1870>
      e9f22e:	48 8d 0d 0b 53 53 ff 	lea    rcx,[rip+0xffffffffff53530b]        # 3d4540 <_ZTSN5boost17bad_function_callE@@Base+0x1886>
      e9f235:	6a 0b                	push   0xb
      e9f237:	5a                   	pop    rdx
      e9f238:	6a 24                	push   0x24
      e9f23a:	41 58                	pop    r8
      e9f23c:	45 31 c9             	xor    r9d,r9d
      e9f23f:	e8 46 81 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9f244:	84 c0                	test   al,al
      e9f246:	0f 84 20 01 00 00    	je     e9f36c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66782>
      e9f24c:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      e9f253:	00 
      e9f254:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9f257:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0

### READ 0xe9f21b: lea    r15,[rsp+0x1060]
      e9f1d7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f1de:	00 
      e9f1df:	e8 86 ad bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f1e4:	4c 89 ff             	mov    rdi,r15
      e9f1e7:	e8 9a f2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f1ec:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f1f3:	00 
      e9f1f4:	e8 97 ec 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f1f9:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f200:	00 
      e9f201:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f208:	00 
      e9f209:	e8 ea fe fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f20e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f215:	00 
      e9f216:	e8 53 90 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f21b:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9f222:	00 
      e9f223:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9f227:	48 8d 35 fc 52 53 ff 	lea    rsi,[rip+0xffffffffff5352fc]        # 3d452a <_ZTSN5boost17bad_function_callE@@Base+0x1870>
      e9f22e:	48 8d 0d 0b 53 53 ff 	lea    rcx,[rip+0xffffffffff53530b]        # 3d4540 <_ZTSN5boost17bad_function_callE@@Base+0x1886>
      e9f235:	6a 0b                	push   0xb
      e9f237:	5a                   	pop    rdx
      e9f238:	6a 24                	push   0x24
      e9f23a:	41 58                	pop    r8
      e9f23c:	45 31 c9             	xor    r9d,r9d
      e9f23f:	e8 46 81 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9f244:	84 c0                	test   al,al
      e9f246:	0f 84 20 01 00 00    	je     e9f36c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66782>
      e9f24c:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      e9f253:	00 
      e9f254:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9f257:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9f25c:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9f260:	48 85 c0             	test   rax,rax
      e9f263:	74 05                	je     e9f26a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66680>
      e9f265:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9f26a:	48 8d 35 97 69 b4 00 	lea    rsi,[rip+0xb46997]        # 19e5c08 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1f8>
      e9f271:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f278:	00 
      e9f279:	e8 c2 ec 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f27e:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f284:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e9f28b:	48 85 db             	test   rbx,rbx
      e9f28e:	74 0a                	je     e9f29a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666b0>
      e9f290:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9f295:	48 89 d8             	mov    rax,rbx
      e9f298:	eb 02                	jmp    e9f29c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666b2>
      e9f29a:	31 c0                	xor    eax,eax

### WRITE 0xe9f2a3: mov    QWORD PTR [rsp+0x1060],rcx
      e9f260:	48 85 c0             	test   rax,rax
      e9f263:	74 05                	je     e9f26a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66680>
      e9f265:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9f26a:	48 8d 35 97 69 b4 00 	lea    rsi,[rip+0xb46997]        # 19e5c08 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1f8>
      e9f271:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f278:	00 
      e9f279:	e8 c2 ec 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f27e:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f284:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e9f28b:	48 85 db             	test   rbx,rbx
      e9f28e:	74 0a                	je     e9f29a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666b0>
      e9f290:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9f295:	48 89 d8             	mov    rax,rbx
      e9f298:	eb 02                	jmp    e9f29c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666b2>
      e9f29a:	31 c0                	xor    eax,eax
      e9f29c:	48 8d 0d 15 65 99 00 	lea    rcx,[rip+0x996515]        # 18357b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7750>
      e9f2a3:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9f2aa:	00 
      e9f2ab:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9f2b0:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9f2b7:	00 
      e9f2b8:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9f2bf:	00 
      e9f2c0:	48 85 c0             	test   rax,rax
      e9f2c3:	74 05                	je     e9f2ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666e0>
      e9f2c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9f2ca:	48 8d 0d f7 66 99 00 	lea    rcx,[rip+0x9966f7]        # 18359c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7960>
      e9f2d1:	48 89 8c 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rcx
      e9f2d8:	00 
      e9f2d9:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f2df:	66 0f d6 84 24 08 0d 	movq   QWORD PTR [rsp+0xd08],xmm0
      e9f2e6:	00 00 
      e9f2e8:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
      e9f2ef:	00 
      e9f2f0:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
      e9f2f7:	00 
      e9f2f8:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9f2ff:	00 
      e9f300:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9f307:	00 
      e9f308:	4c 8d a4 24 60 10 00 	lea    r12,[rsp+0x1060]
      e9f30f:	00 
      e9f310:	4c 89 ff             	mov    rdi,r15
      e9f313:	4c 89 f6             	mov    rsi,r14
      e9f316:	4c 89 e2             	mov    rdx,r12
      e9f319:	48 89 e9             	mov    rcx,rbp
      e9f31c:	e8 25 8e ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9f321:	48 89 ef             	mov    rdi,rbp
      e9f324:	e8 41 ac bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### READ 0xe9f308: lea    r12,[rsp+0x1060]
      e9f2c3:	74 05                	je     e9f2ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666e0>
      e9f2c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9f2ca:	48 8d 0d f7 66 99 00 	lea    rcx,[rip+0x9966f7]        # 18359c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7960>
      e9f2d1:	48 89 8c 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rcx
      e9f2d8:	00 
      e9f2d9:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f2df:	66 0f d6 84 24 08 0d 	movq   QWORD PTR [rsp+0xd08],xmm0
      e9f2e6:	00 00 
      e9f2e8:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
      e9f2ef:	00 
      e9f2f0:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
      e9f2f7:	00 
      e9f2f8:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9f2ff:	00 
      e9f300:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9f307:	00 
      e9f308:	4c 8d a4 24 60 10 00 	lea    r12,[rsp+0x1060]
      e9f30f:	00 
      e9f310:	4c 89 ff             	mov    rdi,r15
      e9f313:	4c 89 f6             	mov    rsi,r14
      e9f316:	4c 89 e2             	mov    rdx,r12
      e9f319:	48 89 e9             	mov    rcx,rbp
      e9f31c:	e8 25 8e ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9f321:	48 89 ef             	mov    rdi,rbp
      e9f324:	e8 41 ac bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f329:	31 ff                	xor    edi,edi
      e9f32b:	e8 56 f1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f330:	4c 89 e7             	mov    rdi,r12
      e9f333:	e8 32 ac bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f338:	31 ff                	xor    edi,edi
      e9f33a:	e8 47 f1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f33f:	4c 89 f7             	mov    rdi,r14
      e9f342:	e8 49 eb 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f347:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f34e:	00 
      e9f34f:	4c 89 fe             	mov    rsi,r15
      e9f352:	e8 a1 fd fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f357:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f35e:	00 
      e9f35f:	e8 0a 8f ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f364:	48 89 df             	mov    rdi,rbx
      e9f367:	e8 1a f1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f36c:	48 8d 35 95 53 53 ff 	lea    rsi,[rip+0xffffffffff535395]        # 3d4708 <_ZTSN5boost17bad_function_callE@@Base+0x1a4e>
      e9f373:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f37a:	00 
      e9f37b:	e8 c0 eb 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f380:	48 8b 84 24 20 13 00 	mov    rax,QWORD PTR [rsp+0x1320]
      e9f387:	00 
      e9f388:	4c 8b 38             	mov    r15,QWORD PTR [rax]

### READ 0xe9f423: lea    rdx,[rsp+0x1060]
      e9f3e8:	5f                   	pop    rdi
      e9f3e9:	e8 12 eb 94 00       	call   17edf00 <_Znwm@plt>
      e9f3ee:	48 8d 0d eb 3c 99 00 	lea    rcx,[rip+0x993ceb]        # 18330e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5078>
      e9f3f5:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9f3f8:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
      e9f3fc:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
      e9f400:	48 85 db             	test   rbx,rbx
      e9f403:	74 05                	je     e9f40a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66820>
      e9f405:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9f40a:	4c 89 60 18          	mov    QWORD PTR [rax+0x18],r12
      e9f40e:	4c 89 70 20          	mov    QWORD PTR [rax+0x20],r14
      e9f412:	4d 85 f6             	test   r14,r14
      e9f415:	74 05                	je     e9f41c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66832>
      e9f417:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9f41c:	8a 4c 24 24          	mov    cl,BYTE PTR [rsp+0x24]
      e9f420:	88 48 28             	mov    BYTE PTR [rax+0x28],cl
      e9f423:	48 8d 94 24 60 10 00 	lea    rdx,[rsp+0x1060]
      e9f42a:	00 
      e9f42b:	48 89 42 20          	mov    QWORD PTR [rdx+0x20],rax
      e9f42f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f436:	00 
      e9f437:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9f43e:	00 
      e9f43f:	e8 64 76 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f444:	4c 8b a4 24 50 12 00 	mov    r12,QWORD PTR [rsp+0x1250]
      e9f44b:	00 
      e9f44c:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9f453:	00 
      e9f454:	48 89 df             	mov    rdi,rbx
      e9f457:	e8 0e ab bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f45c:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f463:	00 
      e9f464:	e8 a7 36 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e9f469:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f470:	00 
      e9f471:	e8 1a ea 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f476:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f47d:	00 
      e9f47e:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f485:	00 
      e9f486:	e8 6d fc fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f48b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f492:	00 
      e9f493:	e8 d6 8d ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f498:	48 8d 35 c1 59 53 ff 	lea    rsi,[rip+0xffffffffff5359c1]        # 3d4e60 <_ZTSN5boost17bad_function_callE@@Base+0x21a6>
      e9f49f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f4a6:	00 
      e9f4a7:	e8 94 ea 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f4ac:	48 8d 05 85 75 99 00 	lea    rax,[rip+0x997585]        # 1836a38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x89d0>

### READ 0xe9f44c: lea    rbx,[rsp+0x1060]
      e9f40e:	4c 89 70 20          	mov    QWORD PTR [rax+0x20],r14
      e9f412:	4d 85 f6             	test   r14,r14
      e9f415:	74 05                	je     e9f41c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66832>
      e9f417:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9f41c:	8a 4c 24 24          	mov    cl,BYTE PTR [rsp+0x24]
      e9f420:	88 48 28             	mov    BYTE PTR [rax+0x28],cl
      e9f423:	48 8d 94 24 60 10 00 	lea    rdx,[rsp+0x1060]
      e9f42a:	00 
      e9f42b:	48 89 42 20          	mov    QWORD PTR [rdx+0x20],rax
      e9f42f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f436:	00 
      e9f437:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9f43e:	00 
      e9f43f:	e8 64 76 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f444:	4c 8b a4 24 50 12 00 	mov    r12,QWORD PTR [rsp+0x1250]
      e9f44b:	00 
      e9f44c:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9f453:	00 
      e9f454:	48 89 df             	mov    rdi,rbx
      e9f457:	e8 0e ab bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f45c:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f463:	00 
      e9f464:	e8 a7 36 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e9f469:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f470:	00 
      e9f471:	e8 1a ea 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f476:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f47d:	00 
      e9f47e:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f485:	00 
      e9f486:	e8 6d fc fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f48b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f492:	00 
      e9f493:	e8 d6 8d ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f498:	48 8d 35 c1 59 53 ff 	lea    rsi,[rip+0xffffffffff5359c1]        # 3d4e60 <_ZTSN5boost17bad_function_callE@@Base+0x21a6>
      e9f49f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f4a6:	00 
      e9f4a7:	e8 94 ea 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f4ac:	48 8d 05 85 75 99 00 	lea    rax,[rip+0x997585]        # 1836a38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x89d0>
      e9f4b3:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f4ba:	00 
      e9f4bb:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f4c2:	00 
      e9f4c3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f4ca:	00 
      e9f4cb:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f4d2:	00 
      e9f4d3:	48 89 da             	mov    rdx,rbx
      e9f4d6:	e8 cd 75 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>

### WRITE 0xe9f4b3: mov    QWORD PTR [rsp+0x1060],rax
      e9f469:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f470:	00 
      e9f471:	e8 1a ea 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f476:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f47d:	00 
      e9f47e:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f485:	00 
      e9f486:	e8 6d fc fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f48b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f492:	00 
      e9f493:	e8 d6 8d ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f498:	48 8d 35 c1 59 53 ff 	lea    rsi,[rip+0xffffffffff5359c1]        # 3d4e60 <_ZTSN5boost17bad_function_callE@@Base+0x21a6>
      e9f49f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f4a6:	00 
      e9f4a7:	e8 94 ea 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f4ac:	48 8d 05 85 75 99 00 	lea    rax,[rip+0x997585]        # 1836a38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x89d0>
      e9f4b3:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f4ba:	00 
      e9f4bb:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f4c2:	00 
      e9f4c3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f4ca:	00 
      e9f4cb:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f4d2:	00 
      e9f4d3:	48 89 da             	mov    rdx,rbx
      e9f4d6:	e8 cd 75 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f4db:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f4e2:	00 
      e9f4e3:	e8 82 aa bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f4e8:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f4ef:	00 
      e9f4f0:	e8 9b e9 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f4f5:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f4fc:	00 
      e9f4fd:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f504:	00 
      e9f505:	e8 ee fb fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f50a:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f511:	00 
      e9f512:	e8 57 8d ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f517:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      e9f51e:	00 
      e9f51f:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9f523:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e9f529:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9f52d:	48 85 c0             	test   rax,rax
      e9f530:	74 05                	je     e9f537 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6694d>
      e9f532:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9f537:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]

### READ 0xe9f4db: lea    rdi,[rsp+0x1060]
      e9f493:	e8 d6 8d ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f498:	48 8d 35 c1 59 53 ff 	lea    rsi,[rip+0xffffffffff5359c1]        # 3d4e60 <_ZTSN5boost17bad_function_callE@@Base+0x21a6>
      e9f49f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f4a6:	00 
      e9f4a7:	e8 94 ea 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f4ac:	48 8d 05 85 75 99 00 	lea    rax,[rip+0x997585]        # 1836a38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x89d0>
      e9f4b3:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f4ba:	00 
      e9f4bb:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f4c2:	00 
      e9f4c3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f4ca:	00 
      e9f4cb:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f4d2:	00 
      e9f4d3:	48 89 da             	mov    rdx,rbx
      e9f4d6:	e8 cd 75 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f4db:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f4e2:	00 
      e9f4e3:	e8 82 aa bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f4e8:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f4ef:	00 
      e9f4f0:	e8 9b e9 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f4f5:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f4fc:	00 
      e9f4fd:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f504:	00 
      e9f505:	e8 ee fb fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f50a:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f511:	00 
      e9f512:	e8 57 8d ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f517:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      e9f51e:	00 
      e9f51f:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9f523:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e9f529:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9f52d:	48 85 c0             	test   rax,rax
      e9f530:	74 05                	je     e9f537 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6694d>
      e9f532:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9f537:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      e9f53e:	00 
      e9f53f:	4c 89 e6             	mov    rsi,r12
      e9f542:	e8 60 6f 00 00       	call   ea64a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d8bd>
      e9f547:	48 8d 35 2a 59 53 ff 	lea    rsi,[rip+0xffffffffff53592a]        # 3d4e78 <_ZTSN5boost17bad_function_callE@@Base+0x21be>
      e9f54e:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f555:	00 
      e9f556:	e8 e5 e9 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f55b:	48 8d 9c 24 70 10 00 	lea    rbx,[rsp+0x1070]
      e9f562:	00 
      e9f563:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]

### READ 0xe9f59e: movdqa xmm0,XMMWORD PTR [rsp+0x1060]
      e9f556:	e8 e5 e9 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f55b:	48 8d 9c 24 70 10 00 	lea    rbx,[rsp+0x1070]
      e9f562:	00 
      e9f563:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f569:	66 0f 7f 43 f0       	movdqa XMMWORD PTR [rbx-0x10],xmm0
      e9f56e:	48 8d b4 24 c0 01 00 	lea    rsi,[rsp+0x1c0]
      e9f575:	00 
      e9f576:	48 89 df             	mov    rdi,rbx
      e9f579:	e8 3e 85 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9f57e:	48 83 a4 24 20 0d 00 	and    QWORD PTR [rsp+0xd20],0x0
      e9f585:	00 00 
      e9f587:	bf 80 00 00 00       	mov    edi,0x80
      e9f58c:	e8 6f e9 94 00       	call   17edf00 <_Znwm@plt>
      e9f591:	49 89 c6             	mov    r14,rax
      e9f594:	48 8d 05 75 76 99 00 	lea    rax,[rip+0x997675]        # 1836c10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8ba8>
      e9f59b:	49 89 06             	mov    QWORD PTR [r14],rax
      e9f59e:	66 0f 6f 84 24 60 10 	movdqa xmm0,XMMWORD PTR [rsp+0x1060]
      e9f5a5:	00 00 
      e9f5a7:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      e9f5ad:	66 0f ef c0          	pxor   xmm0,xmm0
      e9f5b1:	66 0f 7f 84 24 60 10 	movdqa XMMWORD PTR [rsp+0x1060],xmm0
      e9f5b8:	00 00 
      e9f5ba:	4c 89 f7             	mov    rdi,r14
      e9f5bd:	48 83 c7 18          	add    rdi,0x18
      e9f5c1:	48 89 de             	mov    rsi,rbx
      e9f5c4:	e8 f3 84 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9f5c9:	48 8d 94 24 00 0d 00 	lea    rdx,[rsp+0xd00]
      e9f5d0:	00 
      e9f5d1:	4c 89 72 20          	mov    QWORD PTR [rdx+0x20],r14
      e9f5d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f5dc:	00 
      e9f5dd:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9f5e4:	00 
      e9f5e5:	e8 be 74 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f5ea:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f5f1:	00 
      e9f5f2:	e8 73 a9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f5f7:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9f5fe:	00 
      e9f5ff:	48 89 df             	mov    rdi,rbx
      e9f602:	e8 e7 35 06 00       	call   f02bee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca004>
      e9f607:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f60e:	00 
      e9f60f:	e8 7c e8 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f614:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f61b:	00 
      e9f61c:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f623:	00 
      e9f624:	e8 cf fa fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>

### WRITE 0xe9f5b1: movdqa XMMWORD PTR [rsp+0x1060],xmm0
      e9f569:	66 0f 7f 43 f0       	movdqa XMMWORD PTR [rbx-0x10],xmm0
      e9f56e:	48 8d b4 24 c0 01 00 	lea    rsi,[rsp+0x1c0]
      e9f575:	00 
      e9f576:	48 89 df             	mov    rdi,rbx
      e9f579:	e8 3e 85 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9f57e:	48 83 a4 24 20 0d 00 	and    QWORD PTR [rsp+0xd20],0x0
      e9f585:	00 00 
      e9f587:	bf 80 00 00 00       	mov    edi,0x80
      e9f58c:	e8 6f e9 94 00       	call   17edf00 <_Znwm@plt>
      e9f591:	49 89 c6             	mov    r14,rax
      e9f594:	48 8d 05 75 76 99 00 	lea    rax,[rip+0x997675]        # 1836c10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8ba8>
      e9f59b:	49 89 06             	mov    QWORD PTR [r14],rax
      e9f59e:	66 0f 6f 84 24 60 10 	movdqa xmm0,XMMWORD PTR [rsp+0x1060]
      e9f5a5:	00 00 
      e9f5a7:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      e9f5ad:	66 0f ef c0          	pxor   xmm0,xmm0
      e9f5b1:	66 0f 7f 84 24 60 10 	movdqa XMMWORD PTR [rsp+0x1060],xmm0
      e9f5b8:	00 00 
      e9f5ba:	4c 89 f7             	mov    rdi,r14
      e9f5bd:	48 83 c7 18          	add    rdi,0x18
      e9f5c1:	48 89 de             	mov    rsi,rbx
      e9f5c4:	e8 f3 84 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9f5c9:	48 8d 94 24 00 0d 00 	lea    rdx,[rsp+0xd00]
      e9f5d0:	00 
      e9f5d1:	4c 89 72 20          	mov    QWORD PTR [rdx+0x20],r14
      e9f5d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f5dc:	00 
      e9f5dd:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9f5e4:	00 
      e9f5e5:	e8 be 74 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f5ea:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f5f1:	00 
      e9f5f2:	e8 73 a9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f5f7:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9f5fe:	00 
      e9f5ff:	48 89 df             	mov    rdi,rbx
      e9f602:	e8 e7 35 06 00       	call   f02bee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca004>
      e9f607:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f60e:	00 
      e9f60f:	e8 7c e8 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f614:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f61b:	00 
      e9f61c:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f623:	00 
      e9f624:	e8 cf fa fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f629:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f630:	00 
      e9f631:	e8 38 8c ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f636:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]

### READ 0xe9f5f7: lea    rbx,[rsp+0x1060]
      e9f5b8:	00 00 
      e9f5ba:	4c 89 f7             	mov    rdi,r14
      e9f5bd:	48 83 c7 18          	add    rdi,0x18
      e9f5c1:	48 89 de             	mov    rsi,rbx
      e9f5c4:	e8 f3 84 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9f5c9:	48 8d 94 24 00 0d 00 	lea    rdx,[rsp+0xd00]
      e9f5d0:	00 
      e9f5d1:	4c 89 72 20          	mov    QWORD PTR [rdx+0x20],r14
      e9f5d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f5dc:	00 
      e9f5dd:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9f5e4:	00 
      e9f5e5:	e8 be 74 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f5ea:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f5f1:	00 
      e9f5f2:	e8 73 a9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f5f7:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9f5fe:	00 
      e9f5ff:	48 89 df             	mov    rdi,rbx
      e9f602:	e8 e7 35 06 00       	call   f02bee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca004>
      e9f607:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f60e:	00 
      e9f60f:	e8 7c e8 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f614:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f61b:	00 
      e9f61c:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f623:	00 
      e9f624:	e8 cf fa fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f629:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f630:	00 
      e9f631:	e8 38 8c ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f636:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      e9f63d:	00 
      e9f63e:	e8 b7 84 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      e9f643:	31 ff                	xor    edi,edi
      e9f645:	e8 3c ee bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f64a:	48 8d 35 9f 58 53 ff 	lea    rsi,[rip+0xffffffffff53589f]        # 3d4ef0 <_ZTSN5boost17bad_function_callE@@Base+0x2236>
      e9f651:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f658:	00 
      e9f659:	e8 e2 e8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f65e:	48 8d 05 e3 7d 99 00 	lea    rax,[rip+0x997de3]        # 1837448 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x93e0>
      e9f665:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f66c:	00 
      e9f66d:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f674:	00 
      e9f675:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f67c:	00 
      e9f67d:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f684:	00 

### WRITE 0xe9f665: mov    QWORD PTR [rsp+0x1060],rax
      e9f61c:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f623:	00 
      e9f624:	e8 cf fa fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f629:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f630:	00 
      e9f631:	e8 38 8c ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f636:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      e9f63d:	00 
      e9f63e:	e8 b7 84 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      e9f643:	31 ff                	xor    edi,edi
      e9f645:	e8 3c ee bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f64a:	48 8d 35 9f 58 53 ff 	lea    rsi,[rip+0xffffffffff53589f]        # 3d4ef0 <_ZTSN5boost17bad_function_callE@@Base+0x2236>
      e9f651:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f658:	00 
      e9f659:	e8 e2 e8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f65e:	48 8d 05 e3 7d 99 00 	lea    rax,[rip+0x997de3]        # 1837448 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x93e0>
      e9f665:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f66c:	00 
      e9f66d:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f674:	00 
      e9f675:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f67c:	00 
      e9f67d:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f684:	00 
      e9f685:	48 89 da             	mov    rdx,rbx
      e9f688:	e8 1b 74 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f68d:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
      e9f694:	00 
      e9f695:	4c 89 f7             	mov    rdi,r14
      e9f698:	e8 cd a8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f69d:	4c 8d bc 24 00 0d 00 	lea    r15,[rsp+0xd00]
      e9f6a4:	00 
      e9f6a5:	4c 89 ff             	mov    rdi,r15
      e9f6a8:	e8 e3 e7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f6ad:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f6b4:	00 
      e9f6b5:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f6bc:	00 
      e9f6bd:	e8 36 fa fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f6c2:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f6c9:	00 
      e9f6ca:	e8 9f 8b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f6cf:	80 bc 24 67 07 00 00 	cmp    BYTE PTR [rsp+0x767],0x0
      e9f6d6:	00 
      e9f6d7:	0f 84 8f 00 00 00    	je     e9f76c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66b82>
      e9f6dd:	48 8d 35 bc 59 53 ff 	lea    rsi,[rip+0xffffffffff5359bc]        # 3d50a0 <_ZTSN5boost17bad_function_callE@@Base+0x23e6>
      e9f6e4:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f6eb:	00 
      e9f6ec:	e8 4f e8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>

### READ 0xe9f68d: lea    r14,[rsp+0x1060]
      e9f645:	e8 3c ee bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f64a:	48 8d 35 9f 58 53 ff 	lea    rsi,[rip+0xffffffffff53589f]        # 3d4ef0 <_ZTSN5boost17bad_function_callE@@Base+0x2236>
      e9f651:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f658:	00 
      e9f659:	e8 e2 e8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f65e:	48 8d 05 e3 7d 99 00 	lea    rax,[rip+0x997de3]        # 1837448 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x93e0>
      e9f665:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f66c:	00 
      e9f66d:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f674:	00 
      e9f675:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f67c:	00 
      e9f67d:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f684:	00 
      e9f685:	48 89 da             	mov    rdx,rbx
      e9f688:	e8 1b 74 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f68d:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
      e9f694:	00 
      e9f695:	4c 89 f7             	mov    rdi,r14
      e9f698:	e8 cd a8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f69d:	4c 8d bc 24 00 0d 00 	lea    r15,[rsp+0xd00]
      e9f6a4:	00 
      e9f6a5:	4c 89 ff             	mov    rdi,r15
      e9f6a8:	e8 e3 e7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f6ad:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f6b4:	00 
      e9f6b5:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f6bc:	00 
      e9f6bd:	e8 36 fa fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f6c2:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f6c9:	00 
      e9f6ca:	e8 9f 8b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f6cf:	80 bc 24 67 07 00 00 	cmp    BYTE PTR [rsp+0x767],0x0
      e9f6d6:	00 
      e9f6d7:	0f 84 8f 00 00 00    	je     e9f76c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66b82>
      e9f6dd:	48 8d 35 bc 59 53 ff 	lea    rsi,[rip+0xffffffffff5359bc]        # 3d50a0 <_ZTSN5boost17bad_function_callE@@Base+0x23e6>
      e9f6e4:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f6eb:	00 
      e9f6ec:	e8 4f e8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f6f1:	48 8d 05 38 a5 99 00 	lea    rax,[rip+0x99a538]        # 1839c30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xbbc8>
      e9f6f8:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f6ff:	00 
      e9f700:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9f707:	00 
      e9f708:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9f70f:	00 
      e9f710:	4c 89 b4 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r14
      e9f717:	00 
      e9f718:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]

### WRITE 0xe9f6f8: mov    QWORD PTR [rsp+0x1060],rax
      e9f6ad:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f6b4:	00 
      e9f6b5:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f6bc:	00 
      e9f6bd:	e8 36 fa fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f6c2:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f6c9:	00 
      e9f6ca:	e8 9f 8b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f6cf:	80 bc 24 67 07 00 00 	cmp    BYTE PTR [rsp+0x767],0x0
      e9f6d6:	00 
      e9f6d7:	0f 84 8f 00 00 00    	je     e9f76c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66b82>
      e9f6dd:	48 8d 35 bc 59 53 ff 	lea    rsi,[rip+0xffffffffff5359bc]        # 3d50a0 <_ZTSN5boost17bad_function_callE@@Base+0x23e6>
      e9f6e4:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f6eb:	00 
      e9f6ec:	e8 4f e8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f6f1:	48 8d 05 38 a5 99 00 	lea    rax,[rip+0x99a538]        # 1839c30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xbbc8>
      e9f6f8:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f6ff:	00 
      e9f700:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9f707:	00 
      e9f708:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9f70f:	00 
      e9f710:	4c 89 b4 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r14
      e9f717:	00 
      e9f718:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f71f:	00 
      e9f720:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f727:	00 
      e9f728:	4c 89 f2             	mov    rdx,r14
      e9f72b:	e8 78 73 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f730:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f737:	00 
      e9f738:	e8 2d a8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f73d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f744:	00 
      e9f745:	e8 46 e7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f74a:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f751:	00 
      e9f752:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f759:	00 
      e9f75a:	e8 99 f9 fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f75f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f766:	00 
      e9f767:	e8 02 8b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f76c:	48 8b 8c 24 58 12 00 	mov    rcx,QWORD PTR [rsp+0x1258]
      e9f773:	00 
      e9f774:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9f778:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9f77c:	66 0f 7f 84 24 50 01 	movdqa XMMWORD PTR [rsp+0x150],xmm0

### READ 0xe9f730: lea    rdi,[rsp+0x1060]
      e9f6ec:	e8 4f e8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f6f1:	48 8d 05 38 a5 99 00 	lea    rax,[rip+0x99a538]        # 1839c30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xbbc8>
      e9f6f8:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f6ff:	00 
      e9f700:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9f707:	00 
      e9f708:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9f70f:	00 
      e9f710:	4c 89 b4 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r14
      e9f717:	00 
      e9f718:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f71f:	00 
      e9f720:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f727:	00 
      e9f728:	4c 89 f2             	mov    rdx,r14
      e9f72b:	e8 78 73 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f730:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f737:	00 
      e9f738:	e8 2d a8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f73d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f744:	00 
      e9f745:	e8 46 e7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f74a:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f751:	00 
      e9f752:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f759:	00 
      e9f75a:	e8 99 f9 fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f75f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f766:	00 
      e9f767:	e8 02 8b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f76c:	48 8b 8c 24 58 12 00 	mov    rcx,QWORD PTR [rsp+0x1258]
      e9f773:	00 
      e9f774:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9f778:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9f77c:	66 0f 7f 84 24 50 01 	movdqa XMMWORD PTR [rsp+0x150],xmm0
      e9f783:	00 00 
      e9f785:	48 85 c0             	test   rax,rax
      e9f788:	74 05                	je     e9f78f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66ba5>
      e9f78a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9f78f:	4c 89 e7             	mov    rdi,r12
      e9f792:	e8 4c 6d 00 00       	call   ea64e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d8f9>
      e9f797:	0f b6 d0             	movzx  edx,al
      e9f79a:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f7a1:	00 
      e9f7a2:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
      e9f7a9:	00 
      e9f7aa:	e8 d8 88 06 00       	call   f08087 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf49d>
      e9f7af:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f7b6:	00 

### READ 0xe9f8b5: lea    rdx,[rsp+0x1060]
      e9f873:	48 83 a4 24 80 10 00 	and    QWORD PTR [rsp+0x1080],0x0
      e9f87a:	00 00 
      e9f87c:	6a 30                	push   0x30
      e9f87e:	5f                   	pop    rdi
      e9f87f:	e8 7c e6 94 00       	call   17edf00 <_Znwm@plt>
      e9f884:	48 8d 0d a5 3a 99 00 	lea    rcx,[rip+0x993aa5]        # 1833330 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x52c8>
      e9f88b:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9f88e:	48 8b 8c 24 d0 00 00 	mov    rcx,QWORD PTR [rsp+0xd0]
      e9f895:	00 
      e9f896:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e9f89a:	48 8b 8c 24 78 12 00 	mov    rcx,QWORD PTR [rsp+0x1278]
      e9f8a1:	00 
      e9f8a2:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      e9f8a6:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f8ac:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
      e9f8b1:	40 88 68 28          	mov    BYTE PTR [rax+0x28],bpl
      e9f8b5:	48 8d 94 24 60 10 00 	lea    rdx,[rsp+0x1060]
      e9f8bc:	00 
      e9f8bd:	48 89 42 20          	mov    QWORD PTR [rdx+0x20],rax
      e9f8c1:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f8c8:	00 
      e9f8c9:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f8d0:	00 
      e9f8d1:	e8 d2 71 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f8d6:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f8dd:	00 
      e9f8de:	e8 87 a6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f8e3:	31 ff                	xor    edi,edi
      e9f8e5:	e8 9c eb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f8ea:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f8f1:	00 
      e9f8f2:	e8 99 e5 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f8f7:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f8fe:	00 
      e9f8ff:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f906:	00 
      e9f907:	e8 ec f7 fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f90c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f913:	00 
      e9f914:	e8 55 89 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f919:	48 89 df             	mov    rdi,rbx
      e9f91c:	e8 65 eb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f921:	48 8d 35 68 55 53 ff 	lea    rsi,[rip+0xffffffffff535568]        # 3d4e90 <_ZTSN5boost17bad_function_callE@@Base+0x21d6>
      e9f928:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f92f:	00 
      e9f930:	e8 0b e6 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f935:	48 8d 05 ac 74 99 00 	lea    rax,[rip+0x9974ac]        # 1836de8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8d80>
      e9f93c:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f943:	00 

### READ 0xe9f8d6: lea    rdi,[rsp+0x1060]
      e9f895:	00 
      e9f896:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e9f89a:	48 8b 8c 24 78 12 00 	mov    rcx,QWORD PTR [rsp+0x1278]
      e9f8a1:	00 
      e9f8a2:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      e9f8a6:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f8ac:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
      e9f8b1:	40 88 68 28          	mov    BYTE PTR [rax+0x28],bpl
      e9f8b5:	48 8d 94 24 60 10 00 	lea    rdx,[rsp+0x1060]
      e9f8bc:	00 
      e9f8bd:	48 89 42 20          	mov    QWORD PTR [rdx+0x20],rax
      e9f8c1:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f8c8:	00 
      e9f8c9:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f8d0:	00 
      e9f8d1:	e8 d2 71 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f8d6:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f8dd:	00 
      e9f8de:	e8 87 a6 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f8e3:	31 ff                	xor    edi,edi
      e9f8e5:	e8 9c eb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f8ea:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f8f1:	00 
      e9f8f2:	e8 99 e5 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f8f7:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f8fe:	00 
      e9f8ff:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f906:	00 
      e9f907:	e8 ec f7 fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f90c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f913:	00 
      e9f914:	e8 55 89 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f919:	48 89 df             	mov    rdi,rbx
      e9f91c:	e8 65 eb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f921:	48 8d 35 68 55 53 ff 	lea    rsi,[rip+0xffffffffff535568]        # 3d4e90 <_ZTSN5boost17bad_function_callE@@Base+0x21d6>
      e9f928:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f92f:	00 
      e9f930:	e8 0b e6 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f935:	48 8d 05 ac 74 99 00 	lea    rax,[rip+0x9974ac]        # 1836de8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8d80>
      e9f93c:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f943:	00 
      e9f944:	4c 89 b4 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r14
      e9f94b:	00 
      e9f94c:	48 8d 05 dd 74 99 00 	lea    rax,[rip+0x9974dd]        # 1836e30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8dc8>
      e9f953:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9f95a:	00 
      e9f95b:	4c 89 bc 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],r15
      e9f962:	00 
      e9f963:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]

### WRITE 0xe9f93c: mov    QWORD PTR [rsp+0x1060],rax
      e9f8f2:	e8 99 e5 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f8f7:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f8fe:	00 
      e9f8ff:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f906:	00 
      e9f907:	e8 ec f7 fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f90c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f913:	00 
      e9f914:	e8 55 89 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f919:	48 89 df             	mov    rdi,rbx
      e9f91c:	e8 65 eb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f921:	48 8d 35 68 55 53 ff 	lea    rsi,[rip+0xffffffffff535568]        # 3d4e90 <_ZTSN5boost17bad_function_callE@@Base+0x21d6>
      e9f928:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f92f:	00 
      e9f930:	e8 0b e6 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f935:	48 8d 05 ac 74 99 00 	lea    rax,[rip+0x9974ac]        # 1836de8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8d80>
      e9f93c:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f943:	00 
      e9f944:	4c 89 b4 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r14
      e9f94b:	00 
      e9f94c:	48 8d 05 dd 74 99 00 	lea    rax,[rip+0x9974dd]        # 1836e30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8dc8>
      e9f953:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9f95a:	00 
      e9f95b:	4c 89 bc 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],r15
      e9f962:	00 
      e9f963:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9f96a:	00 
      e9f96b:	4c 8d a4 24 30 0b 00 	lea    r12,[rsp+0xb30]
      e9f972:	00 
      e9f973:	48 89 df             	mov    rdi,rbx
      e9f976:	4c 89 e6             	mov    rsi,r12
      e9f979:	4c 89 f2             	mov    rdx,r14
      e9f97c:	4c 89 f9             	mov    rcx,r15
      e9f97f:	e8 c2 87 ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9f984:	4c 89 ff             	mov    rdi,r15
      e9f987:	e8 de a5 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f98c:	4c 89 f7             	mov    rdi,r14
      e9f98f:	e8 d6 a5 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f994:	4c 89 e7             	mov    rdi,r12
      e9f997:	e8 f4 e4 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f99c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f9a3:	00 
      e9f9a4:	48 89 de             	mov    rsi,rbx
      e9f9a7:	e8 4c f7 fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f9ac:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f9b3:	00 
      e9f9b4:	e8 b5 88 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f9b9:	66 0f ef c0          	pxor   xmm0,xmm0
      e9f9bd:	66 0f 7f 84 24 b0 03 	movdqa XMMWORD PTR [rsp+0x3b0],xmm0

### WRITE 0xe9ff00: mov    QWORD PTR [rsp+0x1060],rax
      e9febf:	4c 89 ac 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r13
      e9fec6:	00 
      e9fec7:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      e9fece:	00 
      e9fecf:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fed3:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9fed7:	66 0f 7f 84 24 00 09 	movdqa XMMWORD PTR [rsp+0x900],xmm0
      e9fede:	00 00 
      e9fee0:	48 85 c0             	test   rax,rax
      e9fee3:	74 05                	je     e9feea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67300>
      e9fee5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9feea:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9fef1:	00 00 
      e9fef3:	bf b0 01 00 00       	mov    edi,0x1b0
      e9fef8:	e8 03 e0 94 00       	call   17edf00 <_Znwm@plt>
      e9fefd:	49 89 c4             	mov    r12,rax
      e9ff00:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ff07:	00 
      e9ff08:	48 8d 84 24 d0 0e 00 	lea    rax,[rsp+0xed0]
      e9ff0f:	00 
      e9ff10:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9ff17:	00 
      e9ff18:	48 c7 84 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],0x1
      e9ff1f:	00 01 00 00 00 
      e9ff24:	48 8d 05 ed 44 99 00 	lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
      e9ff2b:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ff2f:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
      e9ff36:	00 
      e9ff37:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      e9ff3d:	48 8b 84 24 88 07 00 	mov    rax,QWORD PTR [rsp+0x788]
      e9ff44:	00 
      e9ff45:	0f 28 84 24 80 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x780]
      e9ff4c:	00 
      e9ff4d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      e9ff53:	48 85 c0             	test   rax,rax
      e9ff56:	74 05                	je     e9ff5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67373>
      e9ff58:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff5d:	48 8b 84 24 98 07 00 	mov    rax,QWORD PTR [rsp+0x798]
      e9ff64:	00 
      e9ff65:	0f 28 84 24 90 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x790]
      e9ff6c:	00 
      e9ff6d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      e9ff73:	48 85 c0             	test   rax,rax
      e9ff76:	74 05                	je     e9ff7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67393>
      e9ff78:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff7d:	48 8b 84 24 a8 07 00 	mov    rax,QWORD PTR [rsp+0x7a8]
      e9ff84:	00 
      e9ff85:	0f 28 84 24 a0 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x7a0]
      e9ff8c:	00 

### READ 0xea005c: lea    rbx,[rsp+0x1060]
      ea001d:	48 85 c0             	test   rax,rax
      ea0020:	74 05                	je     ea0027 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6743d>
      ea0022:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0027:	4c 89 e7             	mov    rdi,r12
      ea002a:	48 81 c7 88 01 00 00 	add    rdi,0x188
      ea0031:	4c 89 fe             	mov    rsi,r15
      ea0034:	e8 07 df 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0039:	48 8b 84 24 08 09 00 	mov    rax,QWORD PTR [rsp+0x908]
      ea0040:	00 
      ea0041:	0f 28 84 24 00 09 00 	movaps xmm0,XMMWORD PTR [rsp+0x900]
      ea0048:	00 
      ea0049:	41 0f 11 84 24 a0 01 	movups XMMWORD PTR [r12+0x1a0],xmm0
      ea0050:	00 00 
      ea0052:	48 85 c0             	test   rax,rax
      ea0055:	74 05                	je     ea005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67472>
      ea0057:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea005c:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      ea0063:	00 
      ea0064:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      ea0068:	4c 89 a4 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],r12
      ea006f:	00 
      ea0070:	48 89 df             	mov    rdi,rbx
      ea0073:	e8 52 a2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea0078:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ea007d:	48 89 03             	mov    QWORD PTR [rbx],rax
      ea0080:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
      ea0087:	00 
      ea0088:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      ea008c:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
      ea0093:	00 
      ea0094:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0
      ea0098:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      ea009d:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      ea00a1:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
      ea00a8:	00 
      ea00a9:	0f 29 43 20          	movaps XMMWORD PTR [rbx+0x20],xmm0
      ea00ad:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
      ea00b4:	00 
      ea00b5:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      ea00b9:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
      ea00c0:	00 00 
      ea00c2:	66 0f 7f 43 30       	movdqa XMMWORD PTR [rbx+0x30],xmm0
      ea00c7:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
      ea00ce:	00 
      ea00cf:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      ea00d3:	4c 8d ac 24 a0 10 00 	lea    r13,[rsp+0x10a0]
      ea00da:	00 
      ea00db:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
      ea00e2:	00 

### READ 0xea01ef: movaps xmm0,XMMWORD PTR [rsp+0x1060]
      ea01a5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea01aa:	48 83 a4 24 f0 0e 00 	and    QWORD PTR [rsp+0xef0],0x0
      ea01b1:	00 00 
      ea01b3:	bf b0 01 00 00       	mov    edi,0x1b0
      ea01b8:	e8 43 dd 94 00       	call   17edf00 <_Znwm@plt>
      ea01bd:	49 89 c4             	mov    r12,rax
      ea01c0:	48 89 84 24 a0 0e 00 	mov    QWORD PTR [rsp+0xea0],rax
      ea01c7:	00 
      ea01c8:	48 8d 84 24 80 03 00 	lea    rax,[rsp+0x380]
      ea01cf:	00 
      ea01d0:	48 89 84 24 a8 0e 00 	mov    QWORD PTR [rsp+0xea8],rax
      ea01d7:	00 
      ea01d8:	48 c7 84 24 b0 0e 00 	mov    QWORD PTR [rsp+0xeb0],0x1
      ea01df:	00 01 00 00 00 
      ea01e4:	48 8d 05 3d 45 99 00 	lea    rax,[rip+0x99453d]        # 1834728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x66c0>
      ea01eb:	49 89 04 24          	mov    QWORD PTR [r12],rax
      ea01ef:	0f 28 84 24 60 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1060]
      ea01f6:	00 
      ea01f7:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      ea01fd:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
      ea0204:	00 
      ea0205:	0f 28 84 24 70 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1070]
      ea020c:	00 
      ea020d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      ea0213:	48 85 c0             	test   rax,rax
      ea0216:	74 05                	je     ea021d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67633>
      ea0218:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea021d:	48 8b 84 24 88 10 00 	mov    rax,QWORD PTR [rsp+0x1088]
      ea0224:	00 
      ea0225:	0f 28 84 24 80 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1080]
      ea022c:	00 
      ea022d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      ea0233:	48 85 c0             	test   rax,rax
      ea0236:	74 05                	je     ea023d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67653>
      ea0238:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea023d:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
      ea0244:	00 
      ea0245:	0f 28 84 24 90 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1090]
      ea024c:	00 
      ea024d:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0
      ea0253:	48 85 c0             	test   rax,rax
      ea0256:	74 05                	je     ea025d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67673>
      ea0258:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea025d:	49 8d 5c 24 50       	lea    rbx,[r12+0x50]
      ea0262:	48 89 df             	mov    rdi,rbx
      ea0265:	4c 89 ee             	mov    rsi,r13
      ea0268:	e8 2b dc 02 00       	call   ecde98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952ae>
      ea026d:	4d 8d ac 24 80 00 00 	lea    r13,[r12+0x80]
      ea0274:	00 

### READ 0xea036c: lea    rdi,[rsp+0x1060]
      ea0331:	00 
      ea0332:	4d 89 67 20          	mov    QWORD PTR [r15+0x20],r12
      ea0336:	e8 8f 9f bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea033b:	48 8d 9c 24 00 0d 00 	lea    rbx,[rsp+0xd00]
      ea0342:	00 
      ea0343:	4c 8d a4 24 d0 0c 00 	lea    r12,[rsp+0xcd0]
      ea034a:	00 
      ea034b:	4c 8d ac 24 30 0b 00 	lea    r13,[rsp+0xb30]
      ea0352:	00 
      ea0353:	48 89 df             	mov    rdi,rbx
      ea0356:	4c 89 e6             	mov    rsi,r12
      ea0359:	4c 89 ea             	mov    rdx,r13
      ea035c:	4c 89 f9             	mov    rcx,r15
      ea035f:	e8 e2 7d ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      ea0364:	4c 89 ff             	mov    rdi,r15
      ea0367:	e8 fe 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea036c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0373:	00 
      ea0374:	e8 a7 db 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea0379:	4c 89 ef             	mov    rdi,r13
      ea037c:	e8 e9 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0381:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0388:	00 
      ea0389:	e8 92 db 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea038e:	4c 89 e7             	mov    rdi,r12
      ea0391:	e8 fa da 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0396:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea039d:	00 
      ea039e:	48 89 de             	mov    rsi,rbx
      ea03a1:	e8 52 ed fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      ea03a6:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea03ad:	00 
      ea03ae:	e8 bb 7e ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea03b3:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
      ea03ba:	00 
      ea03bb:	e8 aa 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03c0:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
      ea03c7:	00 
      ea03c8:	e8 9d 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03cd:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
      ea03d4:	00 
      ea03d5:	48 8b 18             	mov    rbx,QWORD PTR [rax]
      ea03d8:	48 8d 35 f1 43 53 ff 	lea    rsi,[rip+0xffffffffff5343f1]        # 3d47d0 <_ZTSN5boost17bad_function_callE@@Base+0x1b16>
      ea03df:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea03e6:	00 
      ea03e7:	e8 54 db 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea03ec:	4c 8b 6c 24 60       	mov    r13,QWORD PTR [rsp+0x60]
      ea03f1:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ea03f6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax

### WRITE 0xea03f6: mov    QWORD PTR [rsp+0x1060],rax
      ea03ae:	e8 bb 7e ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea03b3:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
      ea03ba:	00 
      ea03bb:	e8 aa 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03c0:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
      ea03c7:	00 
      ea03c8:	e8 9d 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03cd:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
      ea03d4:	00 
      ea03d5:	48 8b 18             	mov    rbx,QWORD PTR [rax]
      ea03d8:	48 8d 35 f1 43 53 ff 	lea    rsi,[rip+0xffffffffff5343f1]        # 3d47d0 <_ZTSN5boost17bad_function_callE@@Base+0x1b16>
      ea03df:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea03e6:	00 
      ea03e7:	e8 54 db 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea03ec:	4c 8b 6c 24 60       	mov    r13,QWORD PTR [rsp+0x60]
      ea03f1:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ea03f6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      ea03fd:	00 
      ea03fe:	48 89 9c 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rbx
      ea0405:	00 
      ea0406:	4c 89 ac 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r13
      ea040d:	00 
      ea040e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ea0413:	48 89 84 24 78 10 00 	mov    QWORD PTR [rsp+0x1078],rax
      ea041a:	00 
      ea041b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0420:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      ea0425:	48 89 84 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rax
      ea042c:	00 
      ea042d:	4c 89 b4 24 88 10 00 	mov    QWORD PTR [rsp+0x1088],r14
      ea0434:	00 
      ea0435:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      ea043a:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      ea043f:	48 89 84 24 90 10 00 	mov    QWORD PTR [rsp+0x1090],rax
      ea0446:	00 
      ea0447:	48 89 ac 24 98 10 00 	mov    QWORD PTR [rsp+0x1098],rbp
      ea044e:	00 
      ea044f:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      ea0454:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      ea045b:	00 
      ea045c:	4c 8b 20             	mov    r12,QWORD PTR [rax]
      ea045f:	4c 89 a4 24 a0 10 00 	mov    QWORD PTR [rsp+0x10a0],r12
      ea0466:	00 
      ea0467:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      ea046b:	4c 89 bc 24 a8 10 00 	mov    QWORD PTR [rsp+0x10a8],r15
      ea0472:	00 
      ea0473:	4d 85 ff             	test   r15,r15
      ea0476:	74 05                	je     ea047d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67893>
      ea0478:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]

### READ 0xea0498: movdqu xmm0,XMMWORD PTR [rsp+0x1060]
      ea045c:	4c 8b 20             	mov    r12,QWORD PTR [rax]
      ea045f:	4c 89 a4 24 a0 10 00 	mov    QWORD PTR [rsp+0x10a0],r12
      ea0466:	00 
      ea0467:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      ea046b:	4c 89 bc 24 a8 10 00 	mov    QWORD PTR [rsp+0x10a8],r15
      ea0472:	00 
      ea0473:	4d 85 ff             	test   r15,r15
      ea0476:	74 05                	je     ea047d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67893>
      ea0478:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      ea047d:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      ea0484:	00 00 
      ea0486:	6a 58                	push   0x58
      ea0488:	5f                   	pop    rdi
      ea0489:	e8 72 da 94 00       	call   17edf00 <_Znwm@plt>
      ea048e:	48 8d 0d db 43 99 00 	lea    rcx,[rip+0x9943db]        # 1834870 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6808>
      ea0495:	48 89 08             	mov    QWORD PTR [rax],rcx
      ea0498:	f3 0f 6f 84 24 60 10 	movdqu xmm0,XMMWORD PTR [rsp+0x1060]
      ea049f:	00 00 
      ea04a1:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ea04a6:	4c 89 68 18          	mov    QWORD PTR [rax+0x18],r13
      ea04aa:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ea04af:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      ea04b3:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      ea04b8:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
      ea04bd:	48 89 50 28          	mov    QWORD PTR [rax+0x28],rdx
      ea04c1:	4c 89 70 30          	mov    QWORD PTR [rax+0x30],r14
      ea04c5:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      ea04ca:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
      ea04cf:	48 89 50 38          	mov    QWORD PTR [rax+0x38],rdx
      ea04d3:	48 89 68 40          	mov    QWORD PTR [rax+0x40],rbp
      ea04d7:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      ea04dc:	4c 89 60 48          	mov    QWORD PTR [rax+0x48],r12
      ea04e0:	4c 89 78 50          	mov    QWORD PTR [rax+0x50],r15
      ea04e4:	4d 85 ff             	test   r15,r15
      ea04e7:	74 05                	je     ea04ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67904>
      ea04e9:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      ea04ee:	48 89 84 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],rax
      ea04f5:	00 
      ea04f6:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ea04fb:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      ea0502:	00 
      ea0503:	48 89 9c 24 08 0d 00 	mov    QWORD PTR [rsp+0xd08],rbx
      ea050a:	00 
      ea050b:	4c 89 ac 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],r13
      ea0512:	00 
      ea0513:	48 89 8c 24 18 0d 00 	mov    QWORD PTR [rsp+0xd18],rcx
      ea051a:	00 
      ea051b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      ea0520:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]

### READ 0xea0640: lea    rbx,[rsp+0x1060]
      ea0602:	4c 8d a4 24 a0 0e 00 	lea    r12,[rsp+0xea0]
      ea0609:	00 
      ea060a:	4c 8d ac 24 30 0b 00 	lea    r13,[rsp+0xb30]
      ea0611:	00 
      ea0612:	4c 89 ff             	mov    rdi,r15
      ea0615:	4c 89 e6             	mov    rsi,r12
      ea0618:	4c 89 ea             	mov    rdx,r13
      ea061b:	48 89 d9             	mov    rcx,rbx
      ea061e:	e8 23 7b ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      ea0623:	48 89 df             	mov    rdi,rbx
      ea0626:	e8 3f 99 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea062b:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0632:	00 
      ea0633:	e8 32 77 04 00       	call   ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ea0638:	4c 89 ef             	mov    rdi,r13
      ea063b:	e8 2a 99 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0640:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      ea0647:	00 
      ea0648:	48 89 df             	mov    rdi,rbx
      ea064b:	e8 1a 77 04 00       	call   ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ea0650:	4c 89 e7             	mov    rdi,r12
      ea0653:	e8 38 d8 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0658:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea065f:	00 
      ea0660:	4c 89 fe             	mov    rsi,r15
      ea0663:	e8 90 ea fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      ea0668:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea066f:	00 
      ea0670:	e8 f9 7b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0675:	48 8d 35 84 4a 53 ff 	lea    rsi,[rip+0xffffffffff534a84]        # 3d5100 <_ZTSN5boost17bad_function_callE@@Base+0x2446>
      ea067c:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0683:	00 
      ea0684:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      ea0689:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
      ea068e:	e8 ad d8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0693:	48 8d 05 1e 9a 99 00 	lea    rax,[rip+0x999a1e]        # 183a0b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc050>
      ea069a:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      ea06a1:	00 
      ea06a2:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      ea06a9:	00 
      ea06aa:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea06b1:	00 
      ea06b2:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      ea06b9:	00 
      ea06ba:	48 89 da             	mov    rdx,rbx
      ea06bd:	e8 e6 63 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      ea06c2:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea06c9:	00 
      ea06ca:	e8 9b 98 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### WRITE 0xea069a: mov    QWORD PTR [rsp+0x1060],rax
      ea0650:	4c 89 e7             	mov    rdi,r12
      ea0653:	e8 38 d8 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0658:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea065f:	00 
      ea0660:	4c 89 fe             	mov    rsi,r15
      ea0663:	e8 90 ea fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      ea0668:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea066f:	00 
      ea0670:	e8 f9 7b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0675:	48 8d 35 84 4a 53 ff 	lea    rsi,[rip+0xffffffffff534a84]        # 3d5100 <_ZTSN5boost17bad_function_callE@@Base+0x2446>
      ea067c:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0683:	00 
      ea0684:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      ea0689:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
      ea068e:	e8 ad d8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0693:	48 8d 05 1e 9a 99 00 	lea    rax,[rip+0x999a1e]        # 183a0b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc050>
      ea069a:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      ea06a1:	00 
      ea06a2:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      ea06a9:	00 
      ea06aa:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea06b1:	00 
      ea06b2:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      ea06b9:	00 
      ea06ba:	48 89 da             	mov    rdx,rbx
      ea06bd:	e8 e6 63 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      ea06c2:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea06c9:	00 
      ea06ca:	e8 9b 98 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea06cf:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea06d6:	00 
      ea06d7:	e8 b4 d7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea06dc:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea06e3:	00 
      ea06e4:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      ea06eb:	00 
      ea06ec:	e8 07 ea fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      ea06f1:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea06f8:	00 
      ea06f9:	e8 70 7b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea06fe:	48 8d 35 c2 27 4c ff 	lea    rsi,[rip+0xffffffffff4c27c2]        # 362ec7 <_ZTSSt12bad_any_cast@@Base-0x2d301>
      ea0705:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea070c:	00 
      ea070d:	e8 6c 93 bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ea0712:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      ea0719:	00 
      ea071a:	48 8d 94 24 70 01 00 	lea    rdx,[rsp+0x170]
      ea0721:	00 
      ea0722:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]

### READ 0xea06c2: lea    rdi,[rsp+0x1060]
      ea067c:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0683:	00 
      ea0684:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      ea0689:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
      ea068e:	e8 ad d8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0693:	48 8d 05 1e 9a 99 00 	lea    rax,[rip+0x999a1e]        # 183a0b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc050>
      ea069a:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      ea06a1:	00 
      ea06a2:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      ea06a9:	00 
      ea06aa:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea06b1:	00 
      ea06b2:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      ea06b9:	00 
      ea06ba:	48 89 da             	mov    rdx,rbx
      ea06bd:	e8 e6 63 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      ea06c2:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea06c9:	00 
      ea06ca:	e8 9b 98 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea06cf:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea06d6:	00 
      ea06d7:	e8 b4 d7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea06dc:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea06e3:	00 
      ea06e4:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      ea06eb:	00 
      ea06ec:	e8 07 ea fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      ea06f1:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea06f8:	00 
      ea06f9:	e8 70 7b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea06fe:	48 8d 35 c2 27 4c ff 	lea    rsi,[rip+0xffffffffff4c27c2]        # 362ec7 <_ZTSSt12bad_any_cast@@Base-0x2d301>
      ea0705:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea070c:	00 
      ea070d:	e8 6c 93 bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ea0712:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      ea0719:	00 
      ea071a:	48 8d 94 24 70 01 00 	lea    rdx,[rsp+0x170]
      ea0721:	00 
      ea0722:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
      ea0729:	00 
      ea072a:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      ea0731:	00 
      ea0732:	e8 a2 e1 6b 00       	call   155e8d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a3e5d>
      ea0737:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea073e:	00 
      ea073f:	e8 4c d7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0744:	48 89 ef             	mov    rdi,rbp
      ea0747:	e8 3a dd bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea074c:	4c 89 f7             	mov    rdi,r14

### READ 0xea0841: lea    rdi,[rsp+0x1060]
      ea0809:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea0810:	00 00 
      ea0812:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea0819:	00 
      ea081a:	0f 85 d5 15 00 00    	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea0820:	48 81 c4 08 12 00 00 	add    rsp,0x1208
      ea0827:	5b                   	pop    rbx
      ea0828:	41 5c                	pop    r12
      ea082a:	41 5d                	pop    r13
      ea082c:	41 5e                	pop    r14
      ea082e:	41 5f                	pop    r15
      ea0830:	5d                   	pop    rbp
      ea0831:	c3                   	ret
      ea0832:	e9 d2 15 00 00       	jmp    ea1e09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6921f>
      ea0837:	e9 c3 09 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea083c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0841:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0848:	00 
      ea0849:	e8 1c 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea084e:	4c 89 ff             	mov    rdi,r15
      ea0851:	e8 30 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0856:	e9 83 08 00 00       	jmp    ea10de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684f4>
      ea085b:	e9 b3 09 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea0860:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0865:	4c 89 ef             	mov    rdi,r13
      ea0868:	e9 f3 0c 00 00       	jmp    ea1560 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68976>
      ea086d:	49 89 c6             	mov    r14,rax
      ea0870:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0877:	00 
      ea0878:	e8 f1 79 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea087d:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      ea0882:	eb 47                	jmp    ea08cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67ce1>
      ea0884:	49 89 c6             	mov    r14,rax
      ea0887:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea088e:	00 
      ea088f:	e8 d6 96 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0894:	31 ff                	xor    edi,edi
      ea0896:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      ea089b:	eb 08                	jmp    ea08a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67cbb>
      ea089d:	48 89 df             	mov    rdi,rbx
      ea08a0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea08a5:	e8 dc db bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea08aa:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea08b1:	00 
      ea08b2:	e8 d9 d5 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea08b7:	eb 12                	jmp    ea08cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67ce1>
      ea08b9:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea08bf:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      ea08c6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax

### READ 0xea0887: lea    rdi,[rsp+0x1060]
      ea0848:	00 
      ea0849:	e8 1c 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea084e:	4c 89 ff             	mov    rdi,r15
      ea0851:	e8 30 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0856:	e9 83 08 00 00       	jmp    ea10de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684f4>
      ea085b:	e9 b3 09 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea0860:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0865:	4c 89 ef             	mov    rdi,r13
      ea0868:	e9 f3 0c 00 00       	jmp    ea1560 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68976>
      ea086d:	49 89 c6             	mov    r14,rax
      ea0870:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0877:	00 
      ea0878:	e8 f1 79 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea087d:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      ea0882:	eb 47                	jmp    ea08cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67ce1>
      ea0884:	49 89 c6             	mov    r14,rax
      ea0887:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea088e:	00 
      ea088f:	e8 d6 96 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0894:	31 ff                	xor    edi,edi
      ea0896:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      ea089b:	eb 08                	jmp    ea08a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67cbb>
      ea089d:	48 89 df             	mov    rdi,rbx
      ea08a0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea08a5:	e8 dc db bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea08aa:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea08b1:	00 
      ea08b2:	e8 d9 d5 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea08b7:	eb 12                	jmp    ea08cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67ce1>
      ea08b9:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea08bf:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      ea08c6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea08cb:	48 89 df             	mov    rdi,rbx
      ea08ce:	e8 b3 db bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea08d3:	e9 40 09 00 00       	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea08d8:	e9 22 09 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea08dd:	e9 ea 07 00 00       	jmp    ea10cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684e2>
      ea08e2:	e9 2c 09 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea08e7:	e9 50 08 00 00       	jmp    ea113c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68552>
      ea08ec:	e9 0e 09 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea08f1:	e9 5a 08 00 00       	jmp    ea1150 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68566>
      ea08f6:	e9 d1 07 00 00       	jmp    ea10cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684e2>
      ea08fb:	e9 13 09 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea0900:	e9 fa 08 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea0905:	e9 c2 07 00 00       	jmp    ea10cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684e2>
      ea090a:	e9 04 09 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea090f:	e9 eb 08 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea0914:	e9 fa 08 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea0919:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax

### READ 0xea0951: lea    rdi,[rsp+0x1060]
      ea0905:	e9 c2 07 00 00       	jmp    ea10cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684e2>
      ea090a:	e9 04 09 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea090f:	e9 eb 08 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea0914:	e9 fa 08 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea0919:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea091e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0925:	00 
      ea0926:	e8 43 79 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea092b:	e9 85 07 00 00       	jmp    ea10b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684cb>
      ea0930:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0935:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea093c:	00 
      ea093d:	e8 2c 79 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0942:	e9 d4 00 00 00       	jmp    ea0a1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e31>
      ea0947:	e9 f0 07 00 00       	jmp    ea113c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68552>
      ea094c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0951:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0958:	00 
      ea0959:	e8 0c 96 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea095e:	31 ff                	xor    edi,edi
      ea0960:	e8 21 db bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0965:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea096c:	00 
      ea096d:	e8 1e d5 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0972:	e9 3e 07 00 00       	jmp    ea10b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684cb>
      ea0977:	e9 83 08 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea097c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0981:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      ea0988:	00 
      ea0989:	e8 3c 99 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea098e:	eb 14                	jmp    ea09a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67dba>
      ea0990:	e9 1b 07 00 00       	jmp    ea10b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684c6>
      ea0995:	e9 b6 07 00 00       	jmp    ea1150 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68566>
      ea099a:	e9 2d 07 00 00       	jmp    ea10cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684e2>
      ea099f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea09a4:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea09ab:	00 
      ea09ac:	e8 b9 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea09b1:	eb 0a                	jmp    ea09bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67dd3>
      ea09b3:	e9 5b 08 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea09b8:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea09bd:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea09c4:	00 
      ea09c5:	e8 a0 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea09ca:	eb 19                	jmp    ea09e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67dfb>
      ea09cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea09d1:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea09d8:	00 
      ea09d9:	e8 ec 98 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>

### READ 0xea09e5: lea    rdi,[rsp+0x1060]
      ea09a4:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea09ab:	00 
      ea09ac:	e8 b9 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea09b1:	eb 0a                	jmp    ea09bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67dd3>
      ea09b3:	e9 5b 08 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea09b8:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea09bd:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea09c4:	00 
      ea09c5:	e8 a0 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea09ca:	eb 19                	jmp    ea09e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67dfb>
      ea09cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea09d1:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea09d8:	00 
      ea09d9:	e8 ec 98 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea09de:	eb 05                	jmp    ea09e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67dfb>
      ea09e0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea09e5:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea09ec:	00 
      ea09ed:	e8 78 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea09f2:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      ea09f9:	00 
      ea09fa:	e8 91 d4 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea09ff:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0a06:	00 
      ea0a07:	e8 5e 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0a0c:	31 ff                	xor    edi,edi
      ea0a0e:	e8 73 da bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0a13:	48 89 ef             	mov    rdi,rbp
      ea0a16:	e8 6b da bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0a1b:	4c 89 ff             	mov    rdi,r15
      ea0a1e:	e9 96 00 00 00       	jmp    ea0ab9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67ecf>
      ea0a23:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a28:	eb c8                	jmp    ea09f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e08>
      ea0a2a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a2f:	eb ce                	jmp    ea09ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e15>
      ea0a31:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a36:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0a3d:	00 
      ea0a3e:	e8 2b 78 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0a43:	eb 71                	jmp    ea0ab6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67ecc>
      ea0a45:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a4a:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0a51:	00 
      ea0a52:	e8 13 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0a57:	eb 19                	jmp    ea0a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e88>
      ea0a59:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a5e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea0a65:	00 
      ea0a66:	e8 5f 98 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>

### READ 0xea0a72: lea    rdi,[rsp+0x1060]
      ea0a31:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a36:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0a3d:	00 
      ea0a3e:	e8 2b 78 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0a43:	eb 71                	jmp    ea0ab6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67ecc>
      ea0a45:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a4a:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0a51:	00 
      ea0a52:	e8 13 95 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0a57:	eb 19                	jmp    ea0a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e88>
      ea0a59:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a5e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea0a65:	00 
      ea0a66:	e8 5f 98 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea0a6b:	eb 05                	jmp    ea0a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e88>
      ea0a6d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a72:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0a79:	00 
      ea0a7a:	e8 eb 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0a7f:	eb 05                	jmp    ea0a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67e9c>
      ea0a81:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a86:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0a8d:	00 
      ea0a8e:	e8 fd d3 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0a93:	eb 05                	jmp    ea0a9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67eb0>
      ea0a95:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0a9a:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea0aa1:	00 
      ea0aa2:	e8 c3 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0aa7:	31 ff                	xor    edi,edi
      ea0aa9:	e8 d8 d9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0aae:	4c 89 e7             	mov    rdi,r12
      ea0ab1:	e8 d0 d9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0ab6:	48 89 ef             	mov    rdi,rbp
      ea0ab9:	e8 c8 d9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0abe:	e9 55 07 00 00       	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea0ac3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0ac8:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0acf:	00 
      ea0ad0:	e8 99 77 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0ad5:	eb 71                	jmp    ea0b48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f5e>
      ea0ad7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0adc:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea0ae3:	00 
      ea0ae4:	e8 81 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0ae9:	eb 12                	jmp    ea0afd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f13>
      ea0aeb:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0af0:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0af7:	00 

### READ 0xea0af0: lea    rdi,[rsp+0x1060]
      ea0aae:	4c 89 e7             	mov    rdi,r12
      ea0ab1:	e8 d0 d9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0ab6:	48 89 ef             	mov    rdi,rbp
      ea0ab9:	e8 c8 d9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0abe:	e9 55 07 00 00       	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea0ac3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0ac8:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0acf:	00 
      ea0ad0:	e8 99 77 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0ad5:	eb 71                	jmp    ea0b48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f5e>
      ea0ad7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0adc:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea0ae3:	00 
      ea0ae4:	e8 81 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0ae9:	eb 12                	jmp    ea0afd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f13>
      ea0aeb:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0af0:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0af7:	00 
      ea0af8:	e8 cf f7 d3 ff       	call   be02cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d26c>
      ea0afd:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea0b04:	00 
      ea0b05:	e8 60 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b0a:	eb 3c                	jmp    ea0b48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f5e>
      ea0b0c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0b11:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0b18:	00 
      ea0b19:	e8 ae f7 d3 ff       	call   be02cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d26c>
      ea0b1e:	eb 28                	jmp    ea0b48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f5e>
      ea0b20:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0b25:	4c 89 f7             	mov    rdi,r14
      ea0b28:	e8 3d 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b2d:	eb 05                	jmp    ea0b34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f4a>
      ea0b2f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0b34:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0b3b:	00 
      ea0b3c:	e8 29 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b41:	eb 05                	jmp    ea0b48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67f5e>
      ea0b43:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0b48:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
      ea0b4f:	00 
      ea0b50:	e8 15 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b55:	48 8d bc 24 90 04 00 	lea    rdi,[rsp+0x490]
      ea0b5c:	00 
      ea0b5d:	e8 08 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b62:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
      ea0b69:	00 
      ea0b6a:	e8 fb 93 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b6f:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      ea0b76:	00 

### READ 0xea0b98: lea    rdi,[rsp+0x1060]
      ea0b50:	e8 15 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b55:	48 8d bc 24 90 04 00 	lea    rdi,[rsp+0x490]
      ea0b5c:	00 
      ea0b5d:	e8 08 94 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b62:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
      ea0b69:	00 
      ea0b6a:	e8 fb 93 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b6f:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      ea0b76:	00 
      ea0b77:	e8 ee 93 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b7c:	e9 cb 0c 00 00       	jmp    ea184c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c62>
      ea0b81:	e9 b1 00 00 00       	jmp    ea0c37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6804d>
      ea0b86:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0b8b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0b92:	00 
      ea0b93:	e8 f8 d2 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0b98:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0b9f:	00 
      ea0ba0:	e8 eb d2 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0ba5:	e9 49 09 00 00       	jmp    ea14f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68909>
      ea0baa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0baf:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0bb6:	00 
      ea0bb7:	e8 54 1f c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea0bbc:	4c 89 ff             	mov    rdi,r15
      ea0bbf:	e8 c2 d8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0bc4:	eb 28                	jmp    ea0bee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68004>
      ea0bc6:	eb 00                	jmp    ea0bc8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67fde>
      ea0bc8:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0bcd:	e9 21 09 00 00       	jmp    ea14f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68909>
      ea0bd2:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0bd7:	4c 89 ff             	mov    rdi,r15
      ea0bda:	e8 31 d4 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea0bdf:	4c 89 ff             	mov    rdi,r15
      ea0be2:	e8 35 d8 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea0be7:	eb 05                	jmp    ea0bee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68004>
      ea0be9:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0bee:	48 89 df             	mov    rdi,rbx
      ea0bf1:	e8 90 d8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0bf6:	e9 05 09 00 00       	jmp    ea1500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68916>
      ea0bfb:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0c00:	48 89 df             	mov    rdi,rbx
      ea0c03:	e8 08 d4 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea0c08:	48 89 df             	mov    rdi,rbx
      ea0c0b:	e8 0c d8 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea0c10:	e9 eb 08 00 00       	jmp    ea1500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68916>
      ea0c15:	eb 43                	jmp    ea0c5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68070>
      ea0c17:	eb 1e                	jmp    ea0c37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6804d>
      ea0c19:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax

### READ 0xea0baf: lea    rdi,[rsp+0x1060]
      ea0b69:	00 
      ea0b6a:	e8 fb 93 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b6f:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      ea0b76:	00 
      ea0b77:	e8 ee 93 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0b7c:	e9 cb 0c 00 00       	jmp    ea184c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c62>
      ea0b81:	e9 b1 00 00 00       	jmp    ea0c37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6804d>
      ea0b86:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0b8b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0b92:	00 
      ea0b93:	e8 f8 d2 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0b98:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0b9f:	00 
      ea0ba0:	e8 eb d2 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0ba5:	e9 49 09 00 00       	jmp    ea14f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68909>
      ea0baa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0baf:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0bb6:	00 
      ea0bb7:	e8 54 1f c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea0bbc:	4c 89 ff             	mov    rdi,r15
      ea0bbf:	e8 c2 d8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0bc4:	eb 28                	jmp    ea0bee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68004>
      ea0bc6:	eb 00                	jmp    ea0bc8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67fde>
      ea0bc8:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0bcd:	e9 21 09 00 00       	jmp    ea14f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68909>
      ea0bd2:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0bd7:	4c 89 ff             	mov    rdi,r15
      ea0bda:	e8 31 d4 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea0bdf:	4c 89 ff             	mov    rdi,r15
      ea0be2:	e8 35 d8 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea0be7:	eb 05                	jmp    ea0bee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68004>
      ea0be9:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0bee:	48 89 df             	mov    rdi,rbx
      ea0bf1:	e8 90 d8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0bf6:	e9 05 09 00 00       	jmp    ea1500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68916>
      ea0bfb:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0c00:	48 89 df             	mov    rdi,rbx
      ea0c03:	e8 08 d4 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea0c08:	48 89 df             	mov    rdi,rbx
      ea0c0b:	e8 0c d8 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea0c10:	e9 eb 08 00 00       	jmp    ea1500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68916>
      ea0c15:	eb 43                	jmp    ea0c5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68070>
      ea0c17:	eb 1e                	jmp    ea0c37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6804d>
      ea0c19:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0c1e:	48 89 df             	mov    rdi,rbx
      ea0c21:	e8 60 d8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0c26:	e9 d5 08 00 00       	jmp    ea1500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68916>
      ea0c2b:	eb 0a                	jmp    ea0c37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6804d>
      ea0c2d:	eb 2b                	jmp    ea0c5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68070>

### READ 0xea0c80: lea    rdi,[rsp+0x1060]
      ea0c43:	00 
      ea0c44:	e9 b2 08 00 00       	jmp    ea14fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68911>
      ea0c49:	eb 0f                	jmp    ea0c5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68070>
      ea0c4b:	e9 9d 03 00 00       	jmp    ea0fed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68403>
      ea0c50:	e9 77 04 00 00       	jmp    ea10cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684e2>
      ea0c55:	e9 b9 05 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea0c5a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0c5f:	e9 9c 08 00 00       	jmp    ea1500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68916>
      ea0c64:	e9 7a 03 00 00       	jmp    ea0fe3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x683f9>
      ea0c69:	48 89 c3             	mov    rbx,rax
      ea0c6c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0c73:	00 
      ea0c74:	eb 1f                	jmp    ea0c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x680ab>
      ea0c76:	e9 85 00 00 00       	jmp    ea0d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68116>
      ea0c7b:	eb 21                	jmp    ea0c9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x680b4>
      ea0c7d:	48 89 c3             	mov    rbx,rax
      ea0c80:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0c87:	00 
      ea0c88:	e8 dd 92 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0c8d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0c94:	00 
      ea0c95:	e8 f6 d1 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0c9a:	eb 12                	jmp    ea0cae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x680c4>
      ea0c9c:	eb 62                	jmp    ea0d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68116>
      ea0c9e:	48 89 c3             	mov    rbx,rax
      ea0ca1:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0ca8:	00 
      ea0ca9:	e8 c0 75 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0cae:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0cb3:	e9 5e 02 00 00       	jmp    ea0f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6832c>
      ea0cb8:	48 89 c3             	mov    rbx,rax
      ea0cbb:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0cc2:	00 
      ea0cc3:	e8 a2 70 04 00       	call   ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ea0cc8:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea0ccf:	00 
      ea0cd0:	e8 95 92 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0cd5:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0cda:	eb 05                	jmp    ea0ce1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x680f7>
      ea0cdc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0ce1:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0ce8:	00 
      ea0ce9:	e8 7c 70 04 00       	call   ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ea0cee:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0cf5:	00 
      ea0cf6:	e8 95 d1 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0cfb:	e9 16 02 00 00       	jmp    ea0f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6832c>
      ea0d00:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0d05:	e9 0c 02 00 00       	jmp    ea0f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6832c>

### READ 0xea0ce1: lea    rdi,[rsp+0x1060]
      ea0c9e:	48 89 c3             	mov    rbx,rax
      ea0ca1:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0ca8:	00 
      ea0ca9:	e8 c0 75 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0cae:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0cb3:	e9 5e 02 00 00       	jmp    ea0f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6832c>
      ea0cb8:	48 89 c3             	mov    rbx,rax
      ea0cbb:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0cc2:	00 
      ea0cc3:	e8 a2 70 04 00       	call   ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ea0cc8:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea0ccf:	00 
      ea0cd0:	e8 95 92 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0cd5:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0cda:	eb 05                	jmp    ea0ce1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x680f7>
      ea0cdc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0ce1:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0ce8:	00 
      ea0ce9:	e8 7c 70 04 00       	call   ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ea0cee:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0cf5:	00 
      ea0cf6:	e8 95 d1 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0cfb:	e9 16 02 00 00       	jmp    ea0f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6832c>
      ea0d00:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0d05:	e9 0c 02 00 00       	jmp    ea0f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6832c>
      ea0d0a:	48 89 c3             	mov    rbx,rax
      ea0d0d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0d14:	00 
      ea0d15:	e8 54 75 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0d1a:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0d1f:	e9 d8 01 00 00       	jmp    ea0efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68312>
      ea0d24:	49 89 c7             	mov    r15,rax
      ea0d27:	49 8b bc 24 80 01 00 	mov    rdi,QWORD PTR [r12+0x180]
      ea0d2e:	00 
      ea0d2f:	e8 52 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d34:	49 8b bc 24 70 01 00 	mov    rdi,QWORD PTR [r12+0x170]
      ea0d3b:	00 
      ea0d3c:	e8 45 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d41:	4c 89 ef             	mov    rdi,r13
      ea0d44:	e8 21 92 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0d49:	48 89 df             	mov    rdi,rbx
      ea0d4c:	e8 19 92 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0d51:	49 8b 7c 24 48       	mov    rdi,QWORD PTR [r12+0x48]
      ea0d56:	e8 2b d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d5b:	49 8b 7c 24 38       	mov    rdi,QWORD PTR [r12+0x38]
      ea0d60:	e8 21 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d65:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      ea0d6a:	e8 17 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d6f:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]

### READ 0xea0d88: lea    rdi,[rsp+0x1060]
      ea0d41:	4c 89 ef             	mov    rdi,r13
      ea0d44:	e8 21 92 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0d49:	48 89 df             	mov    rdi,rbx
      ea0d4c:	e8 19 92 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0d51:	49 8b 7c 24 48       	mov    rdi,QWORD PTR [r12+0x48]
      ea0d56:	e8 2b d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d5b:	49 8b 7c 24 38       	mov    rdi,QWORD PTR [r12+0x38]
      ea0d60:	e8 21 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d65:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      ea0d6a:	e8 17 d7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0d6f:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0d76:	00 
      ea0d77:	e8 4e 95 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea0d7c:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      ea0d81:	eb 05                	jmp    ea0d88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6819e>
      ea0d83:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0d88:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0d8f:	00 
      ea0d90:	e8 8b d1 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea0d95:	eb 67                	jmp    ea0dfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68214>
      ea0d97:	48 89 c3             	mov    rbx,rax
      ea0d9a:	48 8b bc 24 d0 11 00 	mov    rdi,QWORD PTR [rsp+0x11d0]
      ea0da1:	00 
      ea0da2:	e8 df d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0da7:	48 8b bc 24 c0 11 00 	mov    rdi,QWORD PTR [rsp+0x11c0]
      ea0dae:	00 
      ea0daf:	e8 d2 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0db4:	4c 89 ff             	mov    rdi,r15
      ea0db7:	e8 ae 91 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0dbc:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0dc1:	eb 05                	jmp    ea0dc8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x681de>
      ea0dc3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0dc8:	4c 89 ef             	mov    rdi,r13
      ea0dcb:	e8 9a 91 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0dd0:	eb 05                	jmp    ea0dd7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x681ed>
      ea0dd2:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0dd7:	48 8b bc 24 98 10 00 	mov    rdi,QWORD PTR [rsp+0x1098]
      ea0dde:	00 
      ea0ddf:	e8 a2 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0de4:	48 8b bc 24 88 10 00 	mov    rdi,QWORD PTR [rsp+0x1088]
      ea0deb:	00 
      ea0dec:	e8 95 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0df1:	48 8b bc 24 78 10 00 	mov    rdi,QWORD PTR [rsp+0x1078]
      ea0df8:	00 
      ea0df9:	e8 88 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0dfe:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea0e05:	00 
      ea0e06:	e8 5f 91 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0e0b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]

### READ 0xea0e68: lea    rdi,[rsp+0x1060]
      ea0e20:	49 8b bc 24 80 01 00 	mov    rdi,QWORD PTR [r12+0x180]
      ea0e27:	00 
      ea0e28:	e8 59 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0e2d:	49 8b bc 24 70 01 00 	mov    rdi,QWORD PTR [r12+0x170]
      ea0e34:	00 
      ea0e35:	e8 4c d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0e3a:	48 89 df             	mov    rdi,rbx
      ea0e3d:	e8 28 91 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0e42:	4c 89 ef             	mov    rdi,r13
      ea0e45:	e8 20 91 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0e4a:	49 8b 7c 24 48       	mov    rdi,QWORD PTR [r12+0x48]
      ea0e4f:	e8 32 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0e54:	49 8b 7c 24 38       	mov    rdi,QWORD PTR [r12+0x38]
      ea0e59:	e8 28 d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0e5e:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      ea0e63:	e8 1e d6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0e68:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0e6f:	00 
      ea0e70:	e8 55 94 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea0e75:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      ea0e7a:	eb 8f                	jmp    ea0e0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68221>
      ea0e7c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0e81:	eb 88                	jmp    ea0e0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68221>
      ea0e83:	49 89 c7             	mov    r15,rax
      ea0e86:	48 8b bc 24 e0 08 00 	mov    rdi,QWORD PTR [rsp+0x8e0]
      ea0e8d:	00 
      ea0e8e:	e8 f3 d5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0e93:	48 8b bc 24 d0 08 00 	mov    rdi,QWORD PTR [rsp+0x8d0]
      ea0e9a:	00 
      ea0e9b:	e8 e6 d5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0ea0:	48 8d bc 24 e0 07 00 	lea    rdi,[rsp+0x7e0]
      ea0ea7:	00 
      ea0ea8:	e8 bd 90 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0ead:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      ea0eb2:	eb 05                	jmp    ea0eb9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x682cf>
      ea0eb4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0eb9:	48 89 df             	mov    rdi,rbx
      ea0ebc:	e8 a9 90 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0ec1:	eb 05                	jmp    ea0ec8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x682de>
      ea0ec3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0ec8:	48 8b bc 24 a8 07 00 	mov    rdi,QWORD PTR [rsp+0x7a8]
      ea0ecf:	00 
      ea0ed0:	e8 b1 d5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0ed5:	48 8b bc 24 98 07 00 	mov    rdi,QWORD PTR [rsp+0x798]
      ea0edc:	00 
      ea0edd:	e8 a4 d5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0ee2:	48 8b bc 24 88 07 00 	mov    rdi,QWORD PTR [rsp+0x788]
      ea0ee9:	00 
      ea0eea:	e8 97 d5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### READ 0xea1076: lea    rdi,[rsp+0x1060]
      ea1030:	e8 51 d4 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1035:	e9 de 01 00 00       	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea103a:	e9 c0 01 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea103f:	e9 88 00 00 00       	jmp    ea10cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684e2>
      ea1044:	e9 ca 01 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea1049:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea104e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1055:	00 
      ea1056:	e8 13 72 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea105b:	eb 33                	jmp    ea1090 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684a6>
      ea105d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1062:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1069:	00 
      ea106a:	e8 fb 8e bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea106f:	eb 05                	jmp    ea1076 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6848c>
      ea1071:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1076:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea107d:	00 
      ea107e:	e8 6b 1b 06 00       	call   f02bee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca004>
      ea1083:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea108a:	00 
      ea108b:	e8 00 ce 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea1090:	66 0f ef c0          	pxor   xmm0,xmm0
      ea1094:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      ea109a:	eb 05                	jmp    ea10a1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684b7>
      ea109c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10a1:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      ea10a8:	00 
      ea10a9:	e8 4c 6a 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      ea10ae:	eb 05                	jmp    ea10b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684cb>
      ea10b0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10b5:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea10bb:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea10c2:	e9 23 01 00 00       	jmp    ea11ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68600>
      ea10c7:	e9 33 01 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea10cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10d1:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea10d8:	00 
      ea10d9:	e8 8c 8e bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea10de:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea10e5:	00 
      ea10e6:	e9 4d fe ff ff       	jmp    ea0f38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6834e>
      ea10eb:	e9 23 01 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea10f0:	e9 0a 01 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea10f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10fa:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1101:	00 
      ea1102:	e8 63 8e bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1107:	eb 05                	jmp    ea110e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68524>

### READ 0xea10d1: lea    rdi,[rsp+0x1060]
      ea108a:	00 
      ea108b:	e8 00 ce 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea1090:	66 0f ef c0          	pxor   xmm0,xmm0
      ea1094:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      ea109a:	eb 05                	jmp    ea10a1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684b7>
      ea109c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10a1:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      ea10a8:	00 
      ea10a9:	e8 4c 6a 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      ea10ae:	eb 05                	jmp    ea10b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684cb>
      ea10b0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10b5:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea10bb:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea10c2:	e9 23 01 00 00       	jmp    ea11ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68600>
      ea10c7:	e9 33 01 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea10cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10d1:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea10d8:	00 
      ea10d9:	e8 8c 8e bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea10de:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea10e5:	00 
      ea10e6:	e9 4d fe ff ff       	jmp    ea0f38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6834e>
      ea10eb:	e9 23 01 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea10f0:	e9 0a 01 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea10f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10fa:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1101:	00 
      ea1102:	e8 63 8e bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1107:	eb 05                	jmp    ea110e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68524>
      ea1109:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea110e:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1115:	00 
      ea1116:	e8 f5 19 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea111b:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1122:	00 
      ea1123:	e9 10 fe ff ff       	jmp    ea0f38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6834e>
      ea1128:	e9 e6 00 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea112d:	e9 e1 00 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea1132:	e9 c8 00 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea1137:	e9 d7 00 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea113c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1141:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1148:	00 
      ea1149:	e8 20 71 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea114e:	eb 12                	jmp    ea1162 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68578>
      ea1150:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1155:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea115b:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      ea1162:	48 89 df             	mov    rdi,rbx

### READ 0xea10fa: lea    rdi,[rsp+0x1060]
      ea10ae:	eb 05                	jmp    ea10b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684cb>
      ea10b0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10b5:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea10bb:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea10c2:	e9 23 01 00 00       	jmp    ea11ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68600>
      ea10c7:	e9 33 01 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea10cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10d1:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea10d8:	00 
      ea10d9:	e8 8c 8e bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea10de:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea10e5:	00 
      ea10e6:	e9 4d fe ff ff       	jmp    ea0f38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6834e>
      ea10eb:	e9 23 01 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea10f0:	e9 0a 01 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea10f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10fa:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1101:	00 
      ea1102:	e8 63 8e bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1107:	eb 05                	jmp    ea110e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68524>
      ea1109:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea110e:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1115:	00 
      ea1116:	e8 f5 19 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea111b:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1122:	00 
      ea1123:	e9 10 fe ff ff       	jmp    ea0f38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6834e>
      ea1128:	e9 e6 00 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea112d:	e9 e1 00 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea1132:	e9 c8 00 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea1137:	e9 d7 00 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea113c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1141:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1148:	00 
      ea1149:	e8 20 71 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea114e:	eb 12                	jmp    ea1162 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68578>
      ea1150:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1155:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea115b:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      ea1162:	48 89 df             	mov    rdi,rbx
      ea1165:	e9 80 00 00 00       	jmp    ea11ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68600>
      ea116a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea116f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1176:	00 
      ea1177:	e8 f2 70 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea117c:	eb 61                	jmp    ea11df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685f5>
      ea117e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1183:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea118a:	00 

### READ 0xea1190: lea    rdi,[rsp+0x1060]
      ea1149:	e8 20 71 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea114e:	eb 12                	jmp    ea1162 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68578>
      ea1150:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1155:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea115b:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      ea1162:	48 89 df             	mov    rdi,rbx
      ea1165:	e9 80 00 00 00       	jmp    ea11ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68600>
      ea116a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea116f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1176:	00 
      ea1177:	e8 f2 70 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea117c:	eb 61                	jmp    ea11df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685f5>
      ea117e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1183:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea118a:	00 
      ea118b:	e8 74 2d 06 00       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
      ea1190:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1197:	00 
      ea1198:	e8 cd 8d bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea119d:	eb 05                	jmp    ea11a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685ba>
      ea119f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea11a4:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea11ab:	00 
      ea11ac:	e8 53 2d 06 00       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
      ea11b1:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea11b8:	00 
      ea11b9:	e8 d2 cc 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea11be:	eb 1f                	jmp    ea11df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685f5>
      ea11c0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea11c5:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea11cb:	66 49 0f 3a 16 c5 01 	pextrq r13,xmm0,0x1
      ea11d2:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
      ea11d8:	66 49 0f 3a 16 c4 01 	pextrq r12,xmm0,0x1
      ea11df:	4c 89 ef             	mov    rdi,r13
      ea11e2:	e8 9f d2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea11e7:	4c 89 e7             	mov    rdi,r12
      ea11ea:	e8 97 d2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea11ef:	eb 27                	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea11f1:	eb 0c                	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea11f3:	eb 1e                	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea11f5:	eb 08                	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea11f7:	eb 1a                	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea11f9:	eb 04                	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea11fb:	eb 16                	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea11fd:	eb 14                	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea11ff:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1204:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea120b:	00 
      ea120c:	e8 5d 70 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>

### READ 0xea1299: lea    rdi,[rsp+0x1060]
      ea1257:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea125e:	00 
      ea125f:	e8 06 8d bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1264:	eb 19                	jmp    ea127f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68695>
      ea1266:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea126b:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1272:	00 
      ea1273:	e8 52 90 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea1278:	eb 05                	jmp    ea127f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68695>
      ea127a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea127f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1286:	00 
      ea1287:	e8 c6 78 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea128c:	48 8d bc 24 88 01 00 	lea    rdi,[rsp+0x188]
      ea1293:	00 
      ea1294:	e8 f7 cb 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea1299:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea12a0:	00 
      ea12a1:	e8 ac 78 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea12a6:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea12ad:	00 
      ea12ae:	e8 9f 78 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea12b3:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea12ba:	00 
      ea12bb:	e8 92 78 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea12c0:	e9 bd 00 00 00       	jmp    ea1382 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68798>
      ea12c5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12ca:	eb c0                	jmp    ea128c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686a2>
      ea12cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12d1:	eb c6                	jmp    ea1299 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686af>
      ea12d3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12d8:	eb cc                	jmp    ea12a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686bc>
      ea12da:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12df:	eb d2                	jmp    ea12b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686c9>
      ea12e1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12e6:	48 8b bc 24 08 10 00 	mov    rdi,QWORD PTR [rsp+0x1008]
      ea12ed:	00 
      ea12ee:	e8 93 d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea12f3:	48 8b bc 24 f8 0f 00 	mov    rdi,QWORD PTR [rsp+0xff8]
      ea12fa:	00 
      ea12fb:	e8 86 d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1300:	48 8b bc 24 e8 0f 00 	mov    rdi,QWORD PTR [rsp+0xfe8]
      ea1307:	00 
      ea1308:	e8 79 d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea130d:	48 8b bc 24 d8 0f 00 	mov    rdi,QWORD PTR [rsp+0xfd8]
      ea1314:	00 
      ea1315:	e8 6c d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea131a:	48 8b bc 24 c8 0f 00 	mov    rdi,QWORD PTR [rsp+0xfc8]
      ea1321:	00 

### READ 0xea13e9: lea    rdi,[rsp+0x1060]
      ea13a4:	e8 c1 8b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea13a9:	48 89 ef             	mov    rdi,rbp
      ea13ac:	e8 d5 d0 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea13b1:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
      ea13b8:	00 
      ea13b9:	e8 ac 8b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea13be:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      ea13c5:	00 
      ea13c6:	e8 9f 8b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea13cb:	e9 7c 04 00 00       	jmp    ea184c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c62>
      ea13d0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea13d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea13dc:	00 
      ea13dd:	e8 8c 6e ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea13e2:	eb 26                	jmp    ea140a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68820>
      ea13e4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea13e9:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea13f0:	00 
      ea13f1:	e8 74 8b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea13f6:	31 ff                	xor    edi,edi
      ea13f8:	e8 89 d0 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea13fd:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1404:	00 
      ea1405:	e8 86 ca 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea140a:	0f 57 c0             	xorps  xmm0,xmm0
      ea140d:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      ea1412:	eb 05                	jmp    ea1419 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6882f>
      ea1414:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1419:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea141f:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1426:	e8 5b d0 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea142b:	e9 1c 04 00 00       	jmp    ea184c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c62>
      ea1430:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1435:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      ea143c:	00 
      ea143d:	e8 06 34 c1 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
      ea1442:	eb 05                	jmp    ea1449 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6885f>
      ea1444:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1449:	6a 40                	push   0x40
      ea144b:	5b                   	pop    rbx
      ea144c:	48 8b bc 1c 68 07 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0x768]
      ea1453:	00 
      ea1454:	e8 2d d0 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1459:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
      ea145d:	75 ed                	jne    ea144c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68862>
      ea145f:	45 31 ed             	xor    r13d,r13d
      ea1462:	31 ff                	xor    edi,edi
      ea1464:	e8 1d d0 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1469:	b3 01                	mov    bl,0x1

### READ 0xea162e: lea    rdi,[rsp+0x1060]
      ea15ea:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea15ef:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea15f6:	00 
      ea15f7:	e8 72 6c ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea15fc:	eb 51                	jmp    ea164f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68a65>
      ea15fe:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1603:	e9 1b 06 00 00       	jmp    ea1c23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69039>
      ea1608:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea160d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1614:	00 
      ea1615:	e8 50 89 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea161a:	eb 12                	jmp    ea162e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68a44>
      ea161c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1621:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea1628:	00 
      ea1629:	e8 e2 14 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea162e:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1635:	00 
      ea1636:	e8 2f 89 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea163b:	eb 12                	jmp    ea164f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68a65>
      ea163d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1642:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1649:	00 
      ea164a:	e8 c1 14 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea164f:	48 89 df             	mov    rdi,rbx
      ea1652:	e8 2f ce bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1657:	e9 3c 06 00 00       	jmp    ea1c98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690ae>
      ea165c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1661:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1668:	00 
      ea1669:	e8 fc 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea166e:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1675:	00 
      ea1676:	e8 ef 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea167b:	e9 01 07 00 00       	jmp    ea1d81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69197>
      ea1680:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1685:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea168c:	00 
      ea168d:	e8 dc 6b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea1692:	e9 9b 01 00 00       	jmp    ea1832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c48>
      ea1697:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea169c:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea16a3:	00 
      ea16a4:	e8 c1 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16a9:	e9 b2 00 00 00       	jmp    ea1760 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b76>
      ea16ae:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16b3:	48 89 ef             	mov    rdi,rbp
      ea16b6:	e8 af 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16bb:	eb 05                	jmp    ea16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ad8>

### READ 0xea166e: lea    rdi,[rsp+0x1060]
      ea1629:	e8 e2 14 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea162e:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1635:	00 
      ea1636:	e8 2f 89 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea163b:	eb 12                	jmp    ea164f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68a65>
      ea163d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1642:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1649:	00 
      ea164a:	e8 c1 14 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea164f:	48 89 df             	mov    rdi,rbx
      ea1652:	e8 2f ce bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1657:	e9 3c 06 00 00       	jmp    ea1c98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690ae>
      ea165c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1661:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1668:	00 
      ea1669:	e8 fc 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea166e:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1675:	00 
      ea1676:	e8 ef 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea167b:	e9 01 07 00 00       	jmp    ea1d81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69197>
      ea1680:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1685:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea168c:	00 
      ea168d:	e8 dc 6b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea1692:	e9 9b 01 00 00       	jmp    ea1832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c48>
      ea1697:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea169c:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea16a3:	00 
      ea16a4:	e8 c1 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16a9:	e9 b2 00 00 00       	jmp    ea1760 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b76>
      ea16ae:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16b3:	48 89 ef             	mov    rdi,rbp
      ea16b6:	e8 af 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16bb:	eb 05                	jmp    ea16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ad8>
      ea16bd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16c2:	4c 89 f7             	mov    rdi,r14
      ea16c5:	e8 a0 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16ca:	eb 05                	jmp    ea16d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ae7>
      ea16cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16d1:	48 89 df             	mov    rdi,rbx
      ea16d4:	e8 91 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16d9:	eb 05                	jmp    ea16e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68af6>
      ea16db:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16e0:	4c 89 ff             	mov    rdi,r15
      ea16e3:	e8 82 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16e8:	eb 05                	jmp    ea16ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b05>
      ea16ea:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16ef:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea16f6:	00 

### READ 0xea16fc: lea    rdi,[rsp+0x1060]
      ea16bd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16c2:	4c 89 f7             	mov    rdi,r14
      ea16c5:	e8 a0 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16ca:	eb 05                	jmp    ea16d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ae7>
      ea16cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16d1:	48 89 df             	mov    rdi,rbx
      ea16d4:	e8 91 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16d9:	eb 05                	jmp    ea16e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68af6>
      ea16db:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16e0:	4c 89 ff             	mov    rdi,r15
      ea16e3:	e8 82 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16e8:	eb 05                	jmp    ea16ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b05>
      ea16ea:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16ef:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea16f6:	00 
      ea16f7:	e8 ce 8b bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea16fc:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1703:	00 
      ea1704:	e8 df 71 06 00       	call   f088e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcfe>
      ea1709:	eb 55                	jmp    ea1760 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b76>
      ea170b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1710:	eb ea                	jmp    ea16fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b12>
      ea1712:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1717:	48 8d bc 24 30 11 00 	lea    rdi,[rsp+0x1130]
      ea171e:	00 
      ea171f:	e8 46 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1724:	eb 05                	jmp    ea172b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b41>
      ea1726:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea172b:	4c 89 ff             	mov    rdi,r15
      ea172e:	e8 37 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1733:	eb 05                	jmp    ea173a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b50>
      ea1735:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea173a:	48 89 ef             	mov    rdi,rbp
      ea173d:	e8 28 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1742:	eb 05                	jmp    ea1749 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b5f>
      ea1744:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1749:	4c 89 f7             	mov    rdi,r14
      ea174c:	e8 19 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1751:	eb 05                	jmp    ea1758 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b6e>
      ea1753:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1758:	48 89 df             	mov    rdi,rbx
      ea175b:	e8 0a 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1760:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1767:	00 
      ea1768:	e8 fd 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea176d:	e9 c0 00 00 00       	jmp    ea1832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c48>
      ea1772:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1777:	eb e7                	jmp    ea1760 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b76>
      ea1779:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax

### READ 0xea17bc: lea    rdi,[rsp+0x1060]
      ea177e:	4c 89 ff             	mov    rdi,r15
      ea1781:	e8 e4 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1786:	eb 05                	jmp    ea178d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ba3>
      ea1788:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea178d:	4c 89 f7             	mov    rdi,r14
      ea1790:	e8 d5 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1795:	eb 05                	jmp    ea179c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68bb2>
      ea1797:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea179c:	4c 89 e7             	mov    rdi,r12
      ea179f:	e8 c6 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea17a4:	eb 05                	jmp    ea17ab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68bc1>
      ea17a6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea17ab:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ea17b0:	e8 b5 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea17b5:	eb 05                	jmp    ea17bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68bd2>
      ea17b7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea17bc:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea17c3:	00 
      ea17c4:	e8 01 8b bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea17c9:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea17d0:	00 
      ea17d1:	e8 12 71 06 00       	call   f088e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcfe>
      ea17d6:	eb 5a                	jmp    ea1832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c48>
      ea17d8:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea17dd:	eb ea                	jmp    ea17c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68bdf>
      ea17df:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea17e4:	48 8d bc 24 40 08 00 	lea    rdi,[rsp+0x840]
      ea17eb:	00 
      ea17ec:	e8 79 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea17f1:	eb 05                	jmp    ea17f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c0e>
      ea17f3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea17f8:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
      ea17ff:	00 
      ea1800:	e8 65 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1805:	eb 05                	jmp    ea180c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c22>
      ea1807:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea180c:	4c 89 ef             	mov    rdi,r13
      ea180f:	e8 56 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1814:	eb 05                	jmp    ea181b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c31>
      ea1816:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea181b:	4c 89 f7             	mov    rdi,r14
      ea181e:	e8 47 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1823:	eb 05                	jmp    ea182a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c40>
      ea1825:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea182a:	4c 89 e7             	mov    rdi,r12
      ea182d:	e8 38 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1832:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
      ea1839:	00 
      ea183a:	e8 2b 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### READ 0xea1b10: lea    rdi,[rsp+0x1060]
      ea1ad1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1ad8:	00 
      ea1ad9:	e8 32 10 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea1ade:	48 89 df             	mov    rdi,rbx
      ea1ae1:	e8 2a c5 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea1ae6:	48 89 df             	mov    rdi,rbx
      ea1ae9:	e8 2e c9 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea1aee:	eb 05                	jmp    ea1af5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f0b>
      ea1af0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1af5:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      ea1afc:	00 
      ea1afd:	e8 0e 10 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea1b02:	31 ff                	xor    edi,edi
      ea1b04:	e8 7d c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b09:	eb 05                	jmp    ea1b10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f26>
      ea1b0b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b10:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1b17:	00 
      ea1b18:	e8 dd 5f 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      ea1b1d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1b23:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1b2a:	eb 3c                	jmp    ea1b68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f7e>
      ea1b2c:	eb 02                	jmp    ea1b30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f46>
      ea1b2e:	eb 1b                	jmp    ea1b4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f61>
      ea1b30:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b35:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      ea1b3c:	00 
      ea1b3d:	e8 44 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b42:	31 ff                	xor    edi,edi
      ea1b44:	e8 3d c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b49:	eb 1a                	jmp    ea1b65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f7b>
      ea1b4b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b50:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1b56:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
      ea1b5d:	4c 89 f7             	mov    rdi,r14
      ea1b60:	e8 21 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b65:	4c 89 f7             	mov    rdi,r14
      ea1b68:	e8 19 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b6d:	eb 20                	jmp    ea1b8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa5>
      ea1b6f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b74:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
      ea1b7b:	00 
      ea1b7c:	e8 05 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b81:	31 ff                	xor    edi,edi
      ea1b83:	e8 fe c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b88:	eb 05                	jmp    ea1b8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa5>
      ea1b8a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b8f:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea1b96:	00 

### WRITE 0xe9ae89: mov    QWORD PTR [rsp+0x1068],r15
      e9ae47:	00 
      e9ae48:	66 0f ef c0          	pxor   xmm0,xmm0
      e9ae4c:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9ae51:	48 8d 0d 48 67 99 00 	lea    rcx,[rip+0x996748]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>
      e9ae58:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9ae5b:	48 8d 68 20          	lea    rbp,[rax+0x20]
      e9ae5f:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9ae66:	00 
      e9ae67:	48 8d b4 24 a0 06 00 	lea    rsi,[rsp+0x6a0]
      e9ae6e:	00 
      e9ae6f:	49 89 c6             	mov    r14,rax
      e9ae72:	4c 89 e7             	mov    rdi,r12
      e9ae75:	e8 6a b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
      e9ae7a:	48 8d 05 57 67 99 00 	lea    rax,[rip+0x996757]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>
      e9ae81:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ae88:	00 
      e9ae89:	4c 89 bc 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],r15
      e9ae90:	00 
      e9ae91:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9ae98:	00 
      e9ae99:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
      e9ae9e:	48 89 ef             	mov    rdi,rbp
      e9aea1:	4c 89 e6             	mov    rsi,r12
      e9aea4:	e8 3b b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
      e9aea9:	49 8d 7e 50          	lea    rdi,[r14+0x50]
      e9aead:	48 89 de             	mov    rsi,rbx
      e9aeb0:	e8 73 b4 00 00       	call   ea6328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d73e>
      e9aeb5:	66 0f ef c0          	pxor   xmm0,xmm0
      e9aeb9:	66 41 0f 7f 86 90 00 	movdqa XMMWORD PTR [r14+0x90],xmm0
      e9aec0:	00 00 
      e9aec2:	66 41 0f 7f 86 80 00 	movdqa XMMWORD PTR [r14+0x80],xmm0
      e9aec9:	00 00 
      e9aecb:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e9aed0:	41 89 86 a0 00 00 00 	mov    DWORD PTR [r14+0xa0],eax
      e9aed7:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
      e9aede:	00 00 
      e9aee0:	f3 41 0f 7f 86 b8 00 	movdqu XMMWORD PTR [r14+0xb8],xmm0
      e9aee7:	00 00 
      e9aee9:	41 89 86 c8 00 00 00 	mov    DWORD PTR [r14+0xc8],eax
      e9aef0:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
      e9aef7:	00 00 
      e9aef9:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0
      e9af00:	00 00 
      e9af02:	4c 89 74 24 78       	mov    QWORD PTR [rsp+0x78],r14
      e9af07:	41 89 86 f0 00 00 00 	mov    DWORD PTR [r14+0xf0],eax
      e9af0e:	48 89 df             	mov    rdi,rbx
      e9af11:	e8 54 f0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9af16:	4c 89 e7             	mov    rdi,r12
      e9af19:	e8 4c f0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### WRITE 0xe9b709: mov    QWORD PTR [rsp+0x1068],rbx
      e9b6c6:	48 8d 05 6b 91 99 00 	lea    rax,[rip+0x99916b]        # 1834838 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x67d0>
      e9b6cd:	49 89 07             	mov    QWORD PTR [r15],rax
      e9b6d0:	4c 89 fd             	mov    rbp,r15
      e9b6d3:	48 83 c5 18          	add    rbp,0x18
      e9b6d7:	41 b8 e8 03 00 00    	mov    r8d,0x3e8
      e9b6dd:	48 89 ef             	mov    rdi,rbp
      e9b6e0:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
      e9b6e5:	48 8b 94 24 f0 00 00 	mov    rdx,QWORD PTR [rsp+0xf0]
      e9b6ec:	00 
      e9b6ed:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      e9b6f4:	00 
      e9b6f5:	e8 b4 e8 04 00       	call   ee9fae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb13c4>
      e9b6fa:	31 ff                	xor    edi,edi
      e9b6fc:	e8 1b 2d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9b701:	4c 89 a4 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],r12
      e9b708:	00 
      e9b709:	48 89 9c 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rbx
      e9b710:	00 
      e9b711:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9b716:	48 89 ac 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],rbp
      e9b71d:	00 
      e9b71e:	4c 89 bc 24 78 10 00 	mov    QWORD PTR [rsp+0x1078],r15
      e9b725:	00 
      e9b726:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9b72b:	48 83 a4 24 90 07 00 	and    QWORD PTR [rsp+0x790],0x0
      e9b732:	00 00 
      e9b734:	6a 28                	push   0x28
      e9b736:	5f                   	pop    rdi
      e9b737:	e8 c4 27 95 00       	call   17edf00 <_Znwm@plt>
      e9b73c:	48 8d 8c 24 70 10 00 	lea    rcx,[rsp+0x1070]
      e9b743:	00 
      e9b744:	48 8d 15 5d 90 99 00 	lea    rdx,[rip+0x99905d]        # 18347a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6740>
      e9b74b:	48 89 10             	mov    QWORD PTR [rax],rdx
      e9b74e:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      e9b752:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
      e9b756:	66 0f ef c0          	pxor   xmm0,xmm0
      e9b75a:	66 0f 7f 41 f0       	movdqa XMMWORD PTR [rcx-0x10],xmm0
      e9b75f:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
      e9b763:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
      e9b767:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
      e9b76b:	4c 8d b4 24 70 07 00 	lea    r14,[rsp+0x770]
      e9b772:	00 
      e9b773:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      e9b777:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9b77e:	00 
      e9b77f:	e8 8c 73 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e9b784:	4c 89 ff             	mov    rdi,r15
      e9b787:	e8 fa 2c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9b78c:	48 89 df             	mov    rdi,rbx

### READ 0xe9be59: mov    rdi,QWORD PTR [rsp+0x1068]
      e9be12:	e8 6f 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be17:	66 49 0f 6e c7       	movq   xmm0,r15
      e9be1c:	66 49 0f 6e cc       	movq   xmm1,r12
      e9be21:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9be25:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9be2b:	31 ff                	xor    edi,edi
      e9be2d:	e8 ea 25 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9be32:	4c 89 f7             	mov    rdi,r14
      e9be35:	e8 4c 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be3a:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9be41:	00 
      e9be42:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9be48:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9be4c:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9be53:	00 
      e9be54:	e8 55 dc ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9be59:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      e9be60:	00 
      e9be61:	e8 20 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be66:	31 ff                	xor    edi,edi
      e9be68:	e8 19 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be6d:	4c 89 f7             	mov    rdi,r14
      e9be70:	e8 11 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be75:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9be7c:	00 
      e9be7d:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9be80:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9be85:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      e9be89:	4d 85 f6             	test   r14,r14
      e9be8c:	74 0a                	je     e9be98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x632ae>
      e9be8e:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9be93:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9be98:	6a 60                	push   0x60
      e9be9a:	5f                   	pop    rdi
      e9be9b:	e8 60 20 95 00       	call   17edf00 <_Znwm@plt>
      e9bea0:	49 89 c7             	mov    r15,rax
      e9bea3:	48 8b 8c 24 48 13 00 	mov    rcx,QWORD PTR [rsp+0x1348]
      e9beaa:	00 
      e9beab:	0f 57 c0             	xorps  xmm0,xmm0
      e9beae:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9beb2:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9beb5:	48 8d 05 f4 14 9a 00 	lea    rax,[rip+0x9a14f4]        # 183d3b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf348>
      e9bebc:	4d 85 f6             	test   r14,r14
      e9bebf:	74 21                	je     e9bee2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x632f8>
      e9bec1:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bec6:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9becd:	00 
      e9bece:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9bed3:	0f 11 84 24 78 07 00 	movups XMMWORD PTR [rsp+0x778],xmm0

### READ 0xe9bf68: mov    rdi,QWORD PTR [rsp+0x1068]
      e9bf21:	e8 60 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf26:	66 49 0f 6e c7       	movq   xmm0,r15
      e9bf2b:	66 49 0f 6e cc       	movq   xmm1,r12
      e9bf30:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9bf34:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9bf3a:	31 ff                	xor    edi,edi
      e9bf3c:	e8 db 24 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9bf41:	4c 89 f7             	mov    rdi,r14
      e9bf44:	e8 3d 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf49:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9bf50:	00 
      e9bf51:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9bf57:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9bf5b:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9bf62:	00 
      e9bf63:	e8 46 db ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9bf68:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      e9bf6f:	00 
      e9bf70:	e8 11 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf75:	31 ff                	xor    edi,edi
      e9bf77:	e8 0a 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf7c:	4c 89 f7             	mov    rdi,r14
      e9bf7f:	e8 02 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf84:	80 bc 24 e7 06 00 00 	cmp    BYTE PTR [rsp+0x6e7],0x0
      e9bf8b:	00 
      e9bf8c:	0f 84 05 01 00 00    	je     e9c097 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x634ad>
      e9bf92:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9bf99:	00 
      e9bf9a:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9bf9d:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9bfa2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9bfa6:	48 85 c0             	test   rax,rax
      e9bfa9:	74 0a                	je     e9bfb5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x633cb>
      e9bfab:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9bfb0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9bfb5:	6a 60                	push   0x60
      e9bfb7:	5f                   	pop    rdi
      e9bfb8:	e8 43 1f 95 00       	call   17edf00 <_Znwm@plt>
      e9bfbd:	49 89 c7             	mov    r15,rax
      e9bfc0:	0f 57 c0             	xorps  xmm0,xmm0
      e9bfc3:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9bfc7:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9bfca:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9bfd0:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
      e9bfd7:	4d 85 f6             	test   r14,r14
      e9bfda:	74 15                	je     e9bff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63407>
      e9bfdc:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bfe1:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9bfe8:	00 00 

### READ 0xe9c07b: mov    rdi,QWORD PTR [rsp+0x1068]
      e9c034:	e8 4d 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c039:	66 49 0f 6e c7       	movq   xmm0,r15
      e9c03e:	66 49 0f 6e cc       	movq   xmm1,r12
      e9c043:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c047:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c04d:	31 ff                	xor    edi,edi
      e9c04f:	e8 c8 23 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c054:	4c 89 f7             	mov    rdi,r14
      e9c057:	e8 2a 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c05c:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9c063:	00 
      e9c064:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c06a:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c06e:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c075:	00 
      e9c076:	e8 33 da ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c07b:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      e9c082:	00 
      e9c083:	e8 fe 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c088:	31 ff                	xor    edi,edi
      e9c08a:	e8 f7 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c08f:	4c 89 f7             	mov    rdi,r14
      e9c092:	e8 ef 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c097:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9c09e:	00 
      e9c09f:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9c0a3:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e9c0a9:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
      e9c0ad:	48 85 db             	test   rbx,rbx
      e9c0b0:	74 05                	je     e9c0b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x634cd>
      e9c0b2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c0b7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9c0be:	00 
      e9c0bf:	48 8d b4 24 28 02 00 	lea    rsi,[rsp+0x228]
      e9c0c6:	00 
      e9c0c7:	e8 f0 b9 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9c0cc:	bf 80 00 00 00       	mov    edi,0x80
      e9c0d1:	e8 2a 1e 95 00       	call   17edf00 <_Znwm@plt>
      e9c0d6:	49 89 c6             	mov    r14,rax
      e9c0d9:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c0dd:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9c0e2:	48 8d 05 b7 11 9a 00 	lea    rax,[rip+0x9a11b7]        # 183d2a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf238>
      e9c0e9:	49 89 06             	mov    QWORD PTR [r14],rax
      e9c0ec:	4d 89 f7             	mov    r15,r14
      e9c0ef:	49 83 c7 18          	add    r15,0x18
      e9c0f3:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9c0fa:	00 
      e9c0fb:	4c 89 ff             	mov    rdi,r15
      e9c0fe:	e8 b9 b9 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>

### WRITE 0xe9d329: mov    QWORD PTR [rsp+0x1068],rbp
      e9d2e6:	48 8d bc 24 70 08 00 	lea    rdi,[rsp+0x870]
      e9d2ed:	00 
      e9d2ee:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
      e9d2f5:	00 
      e9d2f6:	e8 95 cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2fb:	44 89 bc 24 a0 08 00 	mov    DWORD PTR [rsp+0x8a0],r15d
      e9d302:	00 
      e9d303:	c6 84 24 a4 08 00 00 	mov    BYTE PTR [rsp+0x8a4],0x1
      e9d30a:	01 
      e9d30b:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9d312:	00 00 
      e9d314:	bf 50 01 00 00       	mov    edi,0x150
      e9d319:	e8 e2 0b 95 00       	call   17edf00 <_Znwm@plt>
      e9d31e:	48 89 c3             	mov    rbx,rax
      e9d321:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9d328:	00 
      e9d329:	48 89 ac 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rbp
      e9d330:	00 
      e9d331:	48 c7 84 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],0x1
      e9d338:	00 01 00 00 00 
      e9d33d:	48 8d 05 04 a8 99 00 	lea    rax,[rip+0x99a804]        # 1837b48 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x9ae0>
      e9d344:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9d347:	48 8b 84 24 70 07 00 	mov    rax,QWORD PTR [rsp+0x770]
      e9d34e:	00 
      e9d34f:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e9d353:	48 8d 6b 20          	lea    rbp,[rbx+0x20]
      e9d357:	48 89 ef             	mov    rdi,rbp
      e9d35a:	4c 89 e6             	mov    rsi,r12
      e9d35d:	e8 2e cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d362:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
      e9d367:	4c 8d 63 50          	lea    r12,[rbx+0x50]
      e9d36b:	4c 89 e7             	mov    rdi,r12
      e9d36e:	4c 89 f6             	mov    rsi,r14
      e9d371:	e8 1a cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d376:	44 89 fd             	mov    ebp,r15d
      e9d379:	4c 8d b3 80 00 00 00 	lea    r14,[rbx+0x80]
      e9d380:	4c 89 f7             	mov    rdi,r14
      e9d383:	4c 89 ee             	mov    rsi,r13
      e9d386:	e8 05 cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d38b:	4c 8d bb b0 00 00 00 	lea    r15,[rbx+0xb0]
      e9d392:	4c 89 ff             	mov    rdi,r15
      e9d395:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
      e9d39c:	00 
      e9d39d:	e8 ee ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d3a2:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
      e9d3a9:	48 8d b4 24 40 08 00 	lea    rsi,[rsp+0x840]
      e9d3b0:	00 
      e9d3b1:	e8 da ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d3b6:	4c 8d b4 24 a0 08 00 	lea    r14,[rsp+0x8a0]

### WRITE 0xe9dc14: movups XMMWORD PTR [rsp+0x1068],xmm0
      e9dbce:	48 8b 84 24 a0 13 00 	mov    rax,QWORD PTR [rsp+0x13a0]
      e9dbd5:	00 
      e9dbd6:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9dbd9:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9dbde:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9dbe2:	48 85 c0             	test   rax,rax
      e9dbe5:	74 05                	je     e9dbec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65002>
      e9dbe7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9dbec:	48 8d 35 15 73 53 ff 	lea    rsi,[rip+0xffffffffff537315]        # 3d4f08 <_ZTSN5boost17bad_function_callE@@Base+0x224e>
      e9dbf3:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9dbfa:	00 
      e9dbfb:	e8 40 03 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9dc00:	48 8d 05 b9 9a 99 00 	lea    rax,[rip+0x999ab9]        # 18376c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x9658>
      e9dc07:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9dc0e:	00 
      e9dc0f:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9dc14:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9dc1b:	00 
      e9dc1c:	48 8d 94 24 60 10 00 	lea    rdx,[rsp+0x1060]
      e9dc23:	00 
      e9dc24:	48 89 94 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rdx
      e9dc2b:	00 
      e9dc2c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9dc33:	00 
      e9dc34:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9dc3b:	00 
      e9dc3c:	e8 67 8e 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9dc41:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9dc48:	00 
      e9dc49:	e8 1c c3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9dc4e:	31 ff                	xor    edi,edi
      e9dc50:	e8 31 08 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
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

### WRITE 0xe9e1a2: mov    QWORD PTR [rsp+0x1068],rcx
      e9e156:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
      e9e15d:	00 
      e9e15e:	e8 07 be bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e163:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e9e16a:	00 
      e9e16b:	e8 fa bd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e170:	8a 9c 24 60 07 00 00 	mov    bl,BYTE PTR [rsp+0x760]
      e9e177:	48 8d 35 32 6e 53 ff 	lea    rsi,[rip+0xffffffffff536e32]        # 3d4fb0 <_ZTSN5boost17bad_function_callE@@Base+0x22f6>
      e9e17e:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e185:	00 
      e9e186:	e8 b5 fd 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e18b:	48 8d 05 26 ae 99 00 	lea    rax,[rip+0x99ae26]        # 1838fb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xaf50>
      e9e192:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9e199:	00 
      e9e19a:	48 8b 8c 24 38 13 00 	mov    rcx,QWORD PTR [rsp+0x1338]
      e9e1a1:	00 
      e9e1a2:	48 89 8c 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rcx
      e9e1a9:	00 
      e9e1aa:	88 9c 24 70 10 00 00 	mov    BYTE PTR [rsp+0x1070],bl
      e9e1b1:	4c 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r13
      e9e1b8:	00 
      e9e1b9:	48 8d 05 40 ae 99 00 	lea    rax,[rip+0x99ae40]        # 1839000 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xaf98>
      e9e1c0:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e9e1c7:	00 
      e9e1c8:	48 89 8c 24 08 0d 00 	mov    QWORD PTR [rsp+0xd08],rcx
      e9e1cf:	00 
      e9e1d0:	88 9c 24 10 0d 00 00 	mov    BYTE PTR [rsp+0xd10],bl
      e9e1d7:	4c 89 a4 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],r12
      e9e1de:	00 
      e9e1df:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9e1e6:	00 
      e9e1e7:	4c 8d bc 24 30 0b 00 	lea    r15,[rsp+0xb30]
      e9e1ee:	00 
      e9e1ef:	48 89 df             	mov    rdi,rbx
      e9e1f2:	4c 89 fe             	mov    rsi,r15
      e9e1f5:	4c 89 ea             	mov    rdx,r13
      e9e1f8:	4c 89 e1             	mov    rcx,r12
      e9e1fb:	e8 46 9f ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9e200:	4c 89 e7             	mov    rdi,r12
      e9e203:	e8 62 bd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e208:	4c 89 ef             	mov    rdi,r13
      e9e20b:	e8 5a bd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e210:	4c 89 ff             	mov    rdi,r15
      e9e213:	e8 78 fc 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9e218:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9e21f:	00 
      e9e220:	48 89 de             	mov    rsi,rbx
      e9e223:	e8 d0 0e ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9e228:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]

### WRITE 0xe9e6a1: movups XMMWORD PTR [rsp+0x1068],xmm0
      e9e660:	48 8d 35 09 6a 53 ff 	lea    rsi,[rip+0xffffffffff536a09]        # 3d5070 <_ZTSN5boost17bad_function_callE@@Base+0x23b6>
      e9e667:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9e66e:	00 
      e9e66f:	e8 cc f8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9e674:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
      e9e67b:	00 
      e9e67c:	48 85 db             	test   rbx,rbx
      e9e67f:	74 0a                	je     e9e68b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65aa1>
      e9e681:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9e686:	48 89 d8             	mov    rax,rbx
      e9e689:	eb 02                	jmp    e9e68d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65aa3>
      e9e68b:	31 c0                	xor    eax,eax
      e9e68d:	48 8d 0d 84 af 99 00 	lea    rcx,[rip+0x99af84]        # 1839618 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb5b0>
      e9e694:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9e69b:	00 
      e9e69c:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9e6a1:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9e6a8:	00 
      e9e6a9:	48 89 ac 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbp
      e9e6b0:	00 
      e9e6b1:	48 85 c0             	test   rax,rax
      e9e6b4:	74 05                	je     e9e6bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65ad1>
      e9e6b6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9e6bb:	48 8d 0d 2e b1 99 00 	lea    rcx,[rip+0x99b12e]        # 18397f0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xb788>
      e9e6c2:	48 89 8c 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rcx
      e9e6c9:	00 
      e9e6ca:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9e6d0:	66 0f d6 84 24 08 0d 	movq   QWORD PTR [rsp+0xd08],xmm0
      e9e6d7:	00 00 
      e9e6d9:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
      e9e6e0:	00 
      e9e6e1:	48 8d ac 24 00 0d 00 	lea    rbp,[rsp+0xd00]
      e9e6e8:	00 
      e9e6e9:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
      e9e6f0:	00 
      e9e6f1:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9e6f8:	00 
      e9e6f9:	4c 8d bc 24 30 0b 00 	lea    r15,[rsp+0xb30]
      e9e700:	00 
      e9e701:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
      e9e708:	00 
      e9e709:	4c 89 e7             	mov    rdi,r12
      e9e70c:	4c 89 fe             	mov    rsi,r15
      e9e70f:	4c 89 f2             	mov    rdx,r14
      e9e712:	48 89 e9             	mov    rcx,rbp
      e9e715:	e8 2c 9a ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9e71a:	48 89 ef             	mov    rdi,rbp
      e9e71d:	e8 48 b8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9e722:	31 ff                	xor    edi,edi

### WRITE 0xe9ec35: mov    QWORD PTR [rsp+0x1068],rax
      e9ebf5:	5a                   	pop    rdx
      e9ebf6:	6a 27                	push   0x27
      e9ebf8:	41 58                	pop    r8
      e9ebfa:	45 31 c9             	xor    r9d,r9d
      e9ebfd:	e8 88 87 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ec02:	84 c0                	test   al,al
      e9ec04:	0f 84 8f 00 00 00    	je     e9ec99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x660af>
      e9ec0a:	48 8d 35 d2 13 4b ff 	lea    rsi,[rip+0xffffffffff4b13d2]        # 34ffe3 <_ZTSSt12bad_any_cast@@Base-0x401e5>
      e9ec11:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ec18:	00 
      e9ec19:	e8 60 ae bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e9ec1e:	48 8b 84 24 b0 12 00 	mov    rax,QWORD PTR [rsp+0x12b0]
      e9ec25:	00 
      e9ec26:	48 8d 0d eb 9f 99 00 	lea    rcx,[rip+0x999feb]        # 1838c18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xabb0>
      e9ec2d:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9ec34:	00 
      e9ec35:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9ec3c:	00 
      e9ec3d:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9ec44:	00 
      e9ec45:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ec4c:	00 
      e9ec4d:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ec54:	00 
      e9ec55:	4c 89 fa             	mov    rdx,r15
      e9ec58:	e8 4b 7e 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9ec5d:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9ec64:	00 
      e9ec65:	e8 00 b3 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ec6a:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ec71:	00 
      e9ec72:	e8 19 f2 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9ec77:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ec7e:	00 
      e9ec7f:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9ec86:	00 
      e9ec87:	e8 6c 04 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9ec8c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ec93:	00 
      e9ec94:	e8 d5 95 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9ec99:	80 bc 24 c0 00 00 00 	cmp    BYTE PTR [rsp+0xc0],0x0
      e9eca0:	00 
      e9eca1:	74 55                	je     e9ecf8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6610e>
      e9eca3:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      e9ecaa:	00 
      e9ecab:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9ecae:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9ecb3:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9ecb7:	48 85 c0             	test   rax,rax

### WRITE 0xe9ed4b: movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9ed04:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e9ed0a:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
      e9ed0e:	48 85 db             	test   rbx,rbx
      e9ed11:	74 05                	je     e9ed18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6612e>
      e9ed13:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9ed18:	48 8d 35 b1 9b 53 ff 	lea    rsi,[rip+0xffffffffff539bb1]        # 3d88d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34b5>
      e9ed1f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ed26:	00 
      e9ed27:	e8 14 f2 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9ed2c:	48 85 db             	test   rbx,rbx
      e9ed2f:	74 05                	je     e9ed36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6614c>
      e9ed31:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9ed36:	48 8d 05 03 1b 9b 00 	lea    rax,[rip+0x9b1b03]        # 1850840 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xcf28>
      e9ed3d:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ed44:	00 
      e9ed45:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ed4b:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9ed52:	00 00 
      e9ed54:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9ed5b:	00 
      e9ed5c:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ed63:	00 
      e9ed64:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ed6b:	00 
      e9ed6c:	4c 89 fa             	mov    rdx,r15
      e9ed6f:	e8 34 7d 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9ed74:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9ed7b:	00 
      e9ed7c:	e8 e9 b1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ed81:	31 ff                	xor    edi,edi
      e9ed83:	e8 fe f6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ed88:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ed8f:	00 
      e9ed90:	e8 fb f0 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9ed95:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ed9c:	00 
      e9ed9d:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9eda4:	00 
      e9eda5:	e8 4e 03 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9edaa:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9edb1:	00 
      e9edb2:	e8 b7 94 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9edb7:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9edbd:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9edc4:	e8 bd f6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9edc9:	e9 ea 00 00 00       	jmp    e9eeb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x662ce>
      e9edce:	31 c0                	xor    eax,eax
      e9edd0:	48 8d 0d 49 18 9b 00 	lea    rcx,[rip+0x9b1849]        # 1850620 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xcd08>
      e9edd7:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx

### WRITE 0xe9ede4: movups XMMWORD PTR [rsp+0x1068],xmm0
      e9ed9c:	00 
      e9ed9d:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9eda4:	00 
      e9eda5:	e8 4e 03 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9edaa:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9edb1:	00 
      e9edb2:	e8 b7 94 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9edb7:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9edbd:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9edc4:	e8 bd f6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9edc9:	e9 ea 00 00 00       	jmp    e9eeb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x662ce>
      e9edce:	31 c0                	xor    eax,eax
      e9edd0:	48 8d 0d 49 18 9b 00 	lea    rcx,[rip+0x9b1849]        # 1850620 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xcd08>
      e9edd7:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9edde:	00 
      e9eddf:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9ede4:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9edeb:	00 
      e9edec:	4c 89 b4 24 78 10 00 	mov    QWORD PTR [rsp+0x1078],r14
      e9edf3:	00 
      e9edf4:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9edfb:	00 
      e9edfc:	48 85 c0             	test   rax,rax
      e9edff:	74 05                	je     e9ee06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6621c>
      e9ee01:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ee06:	48 8d 0d eb 19 9b 00 	lea    rcx,[rip+0x9b19eb]        # 18507f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xcee0>
      e9ee0d:	48 89 8c 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rcx
      e9ee14:	00 
      e9ee15:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ee1b:	66 0f d6 84 24 08 0d 	movq   QWORD PTR [rsp+0xd08],xmm0
      e9ee22:	00 00 
      e9ee24:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
      e9ee2b:	00 
      e9ee2c:	4c 89 b4 24 18 0d 00 	mov    QWORD PTR [rsp+0xd18],r14
      e9ee33:	00 
      e9ee34:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
      e9ee3b:	00 
      e9ee3c:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9ee43:	00 
      e9ee44:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9ee4b:	00 
      e9ee4c:	4c 8d a4 24 60 10 00 	lea    r12,[rsp+0x1060]
      e9ee53:	00 
      e9ee54:	4c 89 ff             	mov    rdi,r15
      e9ee57:	4c 89 f6             	mov    rsi,r14
      e9ee5a:	4c 89 e2             	mov    rdx,r12
      e9ee5d:	48 89 e9             	mov    rcx,rbp
      e9ee60:	e8 e1 92 ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9ee65:	48 89 ef             	mov    rdi,rbp

### WRITE 0xe9f166: movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f121:	84 c0                	test   al,al
      e9f123:	0f 84 fa 00 00 00    	je     e9f223 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66639>
      e9f129:	48 8d 35 d0 5c 53 ff 	lea    rsi,[rip+0xffffffffff535cd0]        # 3d4e00 <_ZTSN5boost17bad_function_callE@@Base+0x2146>
      e9f130:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f137:	00 
      e9f138:	e8 03 ee 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f13d:	48 8b 84 24 70 12 00 	mov    rax,QWORD PTR [rsp+0x1270]
      e9f144:	00 
      e9f145:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9f149:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      e9f14d:	48 8d 05 b4 71 99 00 	lea    rax,[rip+0x9971b4]        # 1836308 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x82a0>
      e9f154:	4d 85 ff             	test   r15,r15
      e9f157:	74 4d                	je     e9f1a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x665bc>
      e9f159:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9f15e:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f165:	00 
      e9f166:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f16d:	00 00 
      e9f16f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9f174:	eb 41                	jmp    e9f1b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x665cd>
      e9f176:	48 8d 35 2e 3d 4c ff 	lea    rsi,[rip+0xffffffffff4c3d2e]        # 362eab <_ZTSSt12bad_any_cast@@Base-0x2d31d>
      e9f17d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f184:	00 
      e9f185:	e8 c5 c6 bd ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e9f18a:	84 c0                	test   al,al
      e9f18c:	0f 84 64 b1 ff ff    	je     e9a2f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6170c>
      e9f192:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f199:	00 
      e9f19a:	e8 91 7b c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e9f19f:	6a 04                	push   0x4
      e9f1a1:	e9 2c b1 ff ff       	jmp    e9a2d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x616e8>
      e9f1a6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f1ad:	00 
      e9f1ae:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f1b5:	00 00 
      e9f1b7:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f1be:	00 
      e9f1bf:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f1c6:	00 
      e9f1c7:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f1ce:	00 
      e9f1cf:	48 89 da             	mov    rdx,rbx
      e9f1d2:	e8 d1 78 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f1d7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f1de:	00 
      e9f1df:	e8 86 ad bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f1e4:	4c 89 ff             	mov    rdi,r15
      e9f1e7:	e8 9a f2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f1ec:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]

### WRITE 0xe9f1ae: movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f16d:	00 00 
      e9f16f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9f174:	eb 41                	jmp    e9f1b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x665cd>
      e9f176:	48 8d 35 2e 3d 4c ff 	lea    rsi,[rip+0xffffffffff4c3d2e]        # 362eab <_ZTSSt12bad_any_cast@@Base-0x2d31d>
      e9f17d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f184:	00 
      e9f185:	e8 c5 c6 bd ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e9f18a:	84 c0                	test   al,al
      e9f18c:	0f 84 64 b1 ff ff    	je     e9a2f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6170c>
      e9f192:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f199:	00 
      e9f19a:	e8 91 7b c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e9f19f:	6a 04                	push   0x4
      e9f1a1:	e9 2c b1 ff ff       	jmp    e9a2d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x616e8>
      e9f1a6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f1ad:	00 
      e9f1ae:	f3 0f 7f 84 24 68 10 	movdqu XMMWORD PTR [rsp+0x1068],xmm0
      e9f1b5:	00 00 
      e9f1b7:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9f1be:	00 
      e9f1bf:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f1c6:	00 
      e9f1c7:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f1ce:	00 
      e9f1cf:	48 89 da             	mov    rdx,rbx
      e9f1d2:	e8 d1 78 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f1d7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f1de:	00 
      e9f1df:	e8 86 ad bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f1e4:	4c 89 ff             	mov    rdi,r15
      e9f1e7:	e8 9a f2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f1ec:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f1f3:	00 
      e9f1f4:	e8 97 ec 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f1f9:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f200:	00 
      e9f201:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f208:	00 
      e9f209:	e8 ea fe fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f20e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f215:	00 
      e9f216:	e8 53 90 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f21b:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9f222:	00 
      e9f223:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9f227:	48 8d 35 fc 52 53 ff 	lea    rsi,[rip+0xffffffffff5352fc]        # 3d452a <_ZTSN5boost17bad_function_callE@@Base+0x1870>
      e9f22e:	48 8d 0d 0b 53 53 ff 	lea    rcx,[rip+0xffffffffff53530b]        # 3d4540 <_ZTSN5boost17bad_function_callE@@Base+0x1886>
      e9f235:	6a 0b                	push   0xb
      e9f237:	5a                   	pop    rdx

### WRITE 0xe9f2b0: movups XMMWORD PTR [rsp+0x1068],xmm0
      e9f26a:	48 8d 35 97 69 b4 00 	lea    rsi,[rip+0xb46997]        # 19e5c08 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1f8>
      e9f271:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9f278:	00 
      e9f279:	e8 c2 ec 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f27e:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f284:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e9f28b:	48 85 db             	test   rbx,rbx
      e9f28e:	74 0a                	je     e9f29a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666b0>
      e9f290:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9f295:	48 89 d8             	mov    rax,rbx
      e9f298:	eb 02                	jmp    e9f29c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666b2>
      e9f29a:	31 c0                	xor    eax,eax
      e9f29c:	48 8d 0d 15 65 99 00 	lea    rcx,[rip+0x996515]        # 18357b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7750>
      e9f2a3:	48 89 8c 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rcx
      e9f2aa:	00 
      e9f2ab:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9f2b0:	0f 11 84 24 68 10 00 	movups XMMWORD PTR [rsp+0x1068],xmm0
      e9f2b7:	00 
      e9f2b8:	4c 89 bc 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r15
      e9f2bf:	00 
      e9f2c0:	48 85 c0             	test   rax,rax
      e9f2c3:	74 05                	je     e9f2ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x666e0>
      e9f2c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9f2ca:	48 8d 0d f7 66 99 00 	lea    rcx,[rip+0x9966f7]        # 18359c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7960>
      e9f2d1:	48 89 8c 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rcx
      e9f2d8:	00 
      e9f2d9:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9f2df:	66 0f d6 84 24 08 0d 	movq   QWORD PTR [rsp+0xd08],xmm0
      e9f2e6:	00 00 
      e9f2e8:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
      e9f2ef:	00 
      e9f2f0:	48 89 ac 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rbp
      e9f2f7:	00 
      e9f2f8:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9f2ff:	00 
      e9f300:	4c 8d b4 24 30 0b 00 	lea    r14,[rsp+0xb30]
      e9f307:	00 
      e9f308:	4c 8d a4 24 60 10 00 	lea    r12,[rsp+0x1060]
      e9f30f:	00 
      e9f310:	4c 89 ff             	mov    rdi,r15
      e9f313:	4c 89 f6             	mov    rsi,r14
      e9f316:	4c 89 e2             	mov    rdx,r12
      e9f319:	48 89 e9             	mov    rcx,rbp
      e9f31c:	e8 25 8e ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      e9f321:	48 89 ef             	mov    rdi,rbp
      e9f324:	e8 41 ac bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f329:	31 ff                	xor    edi,edi
      e9f32b:	e8 56 f1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9f330:	4c 89 e7             	mov    rdi,r12

### WRITE 0xe9f708: mov    QWORD PTR [rsp+0x1068],rax
      e9f6bd:	e8 36 fa fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f6c2:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f6c9:	00 
      e9f6ca:	e8 9f 8b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f6cf:	80 bc 24 67 07 00 00 	cmp    BYTE PTR [rsp+0x767],0x0
      e9f6d6:	00 
      e9f6d7:	0f 84 8f 00 00 00    	je     e9f76c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66b82>
      e9f6dd:	48 8d 35 bc 59 53 ff 	lea    rsi,[rip+0xffffffffff5359bc]        # 3d50a0 <_ZTSN5boost17bad_function_callE@@Base+0x23e6>
      e9f6e4:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f6eb:	00 
      e9f6ec:	e8 4f e8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9f6f1:	48 8d 05 38 a5 99 00 	lea    rax,[rip+0x99a538]        # 1839c30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xbbc8>
      e9f6f8:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9f6ff:	00 
      e9f700:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9f707:	00 
      e9f708:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9f70f:	00 
      e9f710:	4c 89 b4 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],r14
      e9f717:	00 
      e9f718:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f71f:	00 
      e9f720:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9f727:	00 
      e9f728:	4c 89 f2             	mov    rdx,r14
      e9f72b:	e8 78 73 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      e9f730:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9f737:	00 
      e9f738:	e8 2d a8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9f73d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9f744:	00 
      e9f745:	e8 46 e7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9f74a:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9f751:	00 
      e9f752:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9f759:	00 
      e9f75a:	e8 99 f9 fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9f75f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9f766:	00 
      e9f767:	e8 02 8b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9f76c:	48 8b 8c 24 58 12 00 	mov    rcx,QWORD PTR [rsp+0x1258]
      e9f773:	00 
      e9f774:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9f778:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9f77c:	66 0f 7f 84 24 50 01 	movdqa XMMWORD PTR [rsp+0x150],xmm0
      e9f783:	00 00 
      e9f785:	48 85 c0             	test   rax,rax
      e9f788:	74 05                	je     e9f78f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66ba5>
      e9f78a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### WRITE 0xe9ff10: mov    QWORD PTR [rsp+0x1068],rax
      e9fecf:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9fed3:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9fed7:	66 0f 7f 84 24 00 09 	movdqa XMMWORD PTR [rsp+0x900],xmm0
      e9fede:	00 00 
      e9fee0:	48 85 c0             	test   rax,rax
      e9fee3:	74 05                	je     e9feea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67300>
      e9fee5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9feea:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      e9fef1:	00 00 
      e9fef3:	bf b0 01 00 00       	mov    edi,0x1b0
      e9fef8:	e8 03 e0 94 00       	call   17edf00 <_Znwm@plt>
      e9fefd:	49 89 c4             	mov    r12,rax
      e9ff00:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ff07:	00 
      e9ff08:	48 8d 84 24 d0 0e 00 	lea    rax,[rsp+0xed0]
      e9ff0f:	00 
      e9ff10:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9ff17:	00 
      e9ff18:	48 c7 84 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],0x1
      e9ff1f:	00 01 00 00 00 
      e9ff24:	48 8d 05 ed 44 99 00 	lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
      e9ff2b:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ff2f:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
      e9ff36:	00 
      e9ff37:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      e9ff3d:	48 8b 84 24 88 07 00 	mov    rax,QWORD PTR [rsp+0x788]
      e9ff44:	00 
      e9ff45:	0f 28 84 24 80 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x780]
      e9ff4c:	00 
      e9ff4d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      e9ff53:	48 85 c0             	test   rax,rax
      e9ff56:	74 05                	je     e9ff5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67373>
      e9ff58:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff5d:	48 8b 84 24 98 07 00 	mov    rax,QWORD PTR [rsp+0x798]
      e9ff64:	00 
      e9ff65:	0f 28 84 24 90 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x790]
      e9ff6c:	00 
      e9ff6d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      e9ff73:	48 85 c0             	test   rax,rax
      e9ff76:	74 05                	je     e9ff7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67393>
      e9ff78:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff7d:	48 8b 84 24 a8 07 00 	mov    rax,QWORD PTR [rsp+0x7a8]
      e9ff84:	00 
      e9ff85:	0f 28 84 24 a0 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x7a0]
      e9ff8c:	00 
      e9ff8d:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0
      e9ff93:	48 85 c0             	test   rax,rax
      e9ff96:	74 05                	je     e9ff9d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x673b3>
      e9ff98:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### WRITE 0xea03fe: mov    QWORD PTR [rsp+0x1068],rbx
      ea03ba:	00 
      ea03bb:	e8 aa 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03c0:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
      ea03c7:	00 
      ea03c8:	e8 9d 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03cd:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
      ea03d4:	00 
      ea03d5:	48 8b 18             	mov    rbx,QWORD PTR [rax]
      ea03d8:	48 8d 35 f1 43 53 ff 	lea    rsi,[rip+0xffffffffff5343f1]        # 3d47d0 <_ZTSN5boost17bad_function_callE@@Base+0x1b16>
      ea03df:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea03e6:	00 
      ea03e7:	e8 54 db 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea03ec:	4c 8b 6c 24 60       	mov    r13,QWORD PTR [rsp+0x60]
      ea03f1:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ea03f6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      ea03fd:	00 
      ea03fe:	48 89 9c 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rbx
      ea0405:	00 
      ea0406:	4c 89 ac 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r13
      ea040d:	00 
      ea040e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ea0413:	48 89 84 24 78 10 00 	mov    QWORD PTR [rsp+0x1078],rax
      ea041a:	00 
      ea041b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0420:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      ea0425:	48 89 84 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rax
      ea042c:	00 
      ea042d:	4c 89 b4 24 88 10 00 	mov    QWORD PTR [rsp+0x1088],r14
      ea0434:	00 
      ea0435:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      ea043a:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      ea043f:	48 89 84 24 90 10 00 	mov    QWORD PTR [rsp+0x1090],rax
      ea0446:	00 
      ea0447:	48 89 ac 24 98 10 00 	mov    QWORD PTR [rsp+0x1098],rbp
      ea044e:	00 
      ea044f:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      ea0454:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      ea045b:	00 
      ea045c:	4c 8b 20             	mov    r12,QWORD PTR [rax]
      ea045f:	4c 89 a4 24 a0 10 00 	mov    QWORD PTR [rsp+0x10a0],r12
      ea0466:	00 
      ea0467:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      ea046b:	4c 89 bc 24 a8 10 00 	mov    QWORD PTR [rsp+0x10a8],r15
      ea0472:	00 
      ea0473:	4d 85 ff             	test   r15,r15
      ea0476:	74 05                	je     ea047d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67893>
      ea0478:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      ea047d:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      ea0484:	00 00 

### READ 0xea1b35: mov    rdi,QWORD PTR [rsp+0x1068]
      ea1af5:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      ea1afc:	00 
      ea1afd:	e8 0e 10 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea1b02:	31 ff                	xor    edi,edi
      ea1b04:	e8 7d c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b09:	eb 05                	jmp    ea1b10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f26>
      ea1b0b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b10:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1b17:	00 
      ea1b18:	e8 dd 5f 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      ea1b1d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1b23:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1b2a:	eb 3c                	jmp    ea1b68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f7e>
      ea1b2c:	eb 02                	jmp    ea1b30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f46>
      ea1b2e:	eb 1b                	jmp    ea1b4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f61>
      ea1b30:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b35:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      ea1b3c:	00 
      ea1b3d:	e8 44 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b42:	31 ff                	xor    edi,edi
      ea1b44:	e8 3d c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b49:	eb 1a                	jmp    ea1b65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f7b>
      ea1b4b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b50:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1b56:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
      ea1b5d:	4c 89 f7             	mov    rdi,r14
      ea1b60:	e8 21 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b65:	4c 89 f7             	mov    rdi,r14
      ea1b68:	e8 19 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b6d:	eb 20                	jmp    ea1b8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa5>
      ea1b6f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b74:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
      ea1b7b:	00 
      ea1b7c:	e8 05 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b81:	31 ff                	xor    edi,edi
      ea1b83:	e8 fe c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b88:	eb 05                	jmp    ea1b8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa5>
      ea1b8a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b8f:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea1b96:	00 
      ea1b97:	e8 86 bf c1 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      ea1b9c:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
      ea1ba2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1ba9:	e8 d8 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1bae:	31 c0                	xor    eax,eax
      ea1bb0:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea1bb5:	31 ff                	xor    edi,edi
      ea1bb7:	e8 ca c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1bbc:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]

## All virtual +0x30 calls in containing FDE
## Register backslice for each +0x30 call
## Loads of adapter pointers followed by polymorphic use
### load 0xe9d4f8: mov    rax,QWORD PTR [rsp+0x1060]
      e9d4f8:	48 8b 84 24 60 10 00 	mov    rax,QWORD PTR [rsp+0x1060]
      e9d500:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax

## Transfers from outer adapter slots into non-stack objects



- source load 0xe9d4f8: mov    rax,QWORD PTR [rsp+0x1060]
  -> store 0xe9d500: mov    QWORD PTR [r13+0x10],rax


## Direct references to builder targets ece084/ee6db8
### target 0xece084: 0 direct refs

### target 0xee6db8: 0 direct refs

## Full compact window ea0180..ea0900
      ea0181:	00 
      ea0182:	e8 b9 dd 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0187:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      ea018e:	00 
      ea018f:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ea0193:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      ea0197:	66 0f 7f 84 24 f0 11 	movdqa XMMWORD PTR [rsp+0x11f0],xmm0
      ea019e:	00 00 
      ea01a0:	48 85 c0             	test   rax,rax
      ea01a3:	74 05                	je     ea01aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x675c0>
      ea01a5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea01aa:	48 83 a4 24 f0 0e 00 	and    QWORD PTR [rsp+0xef0],0x0
      ea01b1:	00 00 
      ea01b3:	bf b0 01 00 00       	mov    edi,0x1b0
      ea01b8:	e8 43 dd 94 00       	call   17edf00 <_Znwm@plt>
      ea01bd:	49 89 c4             	mov    r12,rax
      ea01c0:	48 89 84 24 a0 0e 00 	mov    QWORD PTR [rsp+0xea0],rax
      ea01c7:	00 
      ea01c8:	48 8d 84 24 80 03 00 	lea    rax,[rsp+0x380]
      ea01cf:	00 
      ea01d0:	48 89 84 24 a8 0e 00 	mov    QWORD PTR [rsp+0xea8],rax
      ea01d7:	00 
      ea01d8:	48 c7 84 24 b0 0e 00 	mov    QWORD PTR [rsp+0xeb0],0x1
      ea01df:	00 01 00 00 00 
      ea01e4:	48 8d 05 3d 45 99 00 	lea    rax,[rip+0x99453d]        # 1834728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x66c0>
      ea01eb:	49 89 04 24          	mov    QWORD PTR [r12],rax
      ea01ef:	0f 28 84 24 60 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1060]
      ea01f6:	00 
      ea01f7:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      ea01fd:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
      ea0204:	00 
      ea0205:	0f 28 84 24 70 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1070]
      ea020c:	00 
      ea020d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      ea0213:	48 85 c0             	test   rax,rax
      ea0216:	74 05                	je     ea021d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67633>
      ea0218:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea021d:	48 8b 84 24 88 10 00 	mov    rax,QWORD PTR [rsp+0x1088]
      ea0224:	00 
      ea0225:	0f 28 84 24 80 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1080]
      ea022c:	00 
      ea022d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      ea0233:	48 85 c0             	test   rax,rax
      ea0236:	74 05                	je     ea023d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67653>
      ea0238:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea023d:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
      ea0244:	00 
      ea0245:	0f 28 84 24 90 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1090]
      ea024c:	00 
      ea024d:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0
      ea0253:	48 85 c0             	test   rax,rax
      ea0256:	74 05                	je     ea025d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67673>
      ea0258:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea025d:	49 8d 5c 24 50       	lea    rbx,[r12+0x50]
      ea0262:	48 89 df             	mov    rdi,rbx
      ea0265:	4c 89 ee             	mov    rsi,r13
      ea0268:	e8 2b dc 02 00       	call   ecde98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952ae>
      ea026d:	4d 8d ac 24 80 00 00 	lea    r13,[r12+0x80]
      ea0274:	00 
      ea0275:	4c 89 ef             	mov    rdi,r13
      ea0278:	4c 89 fe             	mov    rsi,r15
      ea027b:	e8 5c dc 02 00       	call   ecdedc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x952f2>
      ea0280:	49 8d bc 24 b0 00 00 	lea    rdi,[r12+0xb0]
      ea0287:	00 
      ea0288:	ba b8 00 00 00       	mov    edx,0xb8
      ea028d:	48 8d b4 24 00 11 00 	lea    rsi,[rsp+0x1100]
      ea0294:	00 
      ea0295:	e8 36 f8 94 00       	call   17efad0 <memcpy@plt>
      ea029a:	48 8b 84 24 c0 11 00 	mov    rax,QWORD PTR [rsp+0x11c0]
      ea02a1:	00 
      ea02a2:	0f 10 84 24 b8 11 00 	movups xmm0,XMMWORD PTR [rsp+0x11b8]
      ea02a9:	00 
      ea02aa:	41 0f 11 84 24 68 01 	movups XMMWORD PTR [r12+0x168],xmm0
      ea02b1:	00 00 
      ea02b3:	48 85 c0             	test   rax,rax
      ea02b6:	74 05                	je     ea02bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x676d3>
      ea02b8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea02bd:	48 8b 84 24 d0 11 00 	mov    rax,QWORD PTR [rsp+0x11d0]
      ea02c4:	00 
      ea02c5:	f3 0f 6f 84 24 c8 11 	movdqu xmm0,XMMWORD PTR [rsp+0x11c8]
      ea02cc:	00 00 
      ea02ce:	f3 41 0f 7f 84 24 78 	movdqu XMMWORD PTR [r12+0x178],xmm0
      ea02d5:	01 00 00 
      ea02d8:	48 85 c0             	test   rax,rax
      ea02db:	74 05                	je     ea02e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x676f8>
      ea02dd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea02e2:	4c 89 e7             	mov    rdi,r12
      ea02e5:	48 81 c7 88 01 00 00 	add    rdi,0x188
      ea02ec:	48 8d b4 24 d8 11 00 	lea    rsi,[rsp+0x11d8]
      ea02f3:	00 
      ea02f4:	e8 47 dc 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea02f9:	48 8b 84 24 f8 11 00 	mov    rax,QWORD PTR [rsp+0x11f8]
      ea0300:	00 
      ea0301:	66 0f 6f 84 24 f0 11 	movdqa xmm0,XMMWORD PTR [rsp+0x11f0]
      ea0308:	00 00 
      ea030a:	f3 41 0f 7f 84 24 a0 	movdqu XMMWORD PTR [r12+0x1a0],xmm0
      ea0311:	01 00 00 
      ea0314:	48 85 c0             	test   rax,rax
      ea0317:	74 05                	je     ea031e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67734>
      ea0319:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea031e:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea0325:	00 
      ea0326:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ea032a:	4c 8d bc 24 d0 0e 00 	lea    r15,[rsp+0xed0]
      ea0331:	00 
      ea0332:	4d 89 67 20          	mov    QWORD PTR [r15+0x20],r12
      ea0336:	e8 8f 9f bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea033b:	48 8d 9c 24 00 0d 00 	lea    rbx,[rsp+0xd00]
      ea0342:	00 
      ea0343:	4c 8d a4 24 d0 0c 00 	lea    r12,[rsp+0xcd0]
      ea034a:	00 
      ea034b:	4c 8d ac 24 30 0b 00 	lea    r13,[rsp+0xb30]
      ea0352:	00 
      ea0353:	48 89 df             	mov    rdi,rbx
      ea0356:	4c 89 e6             	mov    rsi,r12
      ea0359:	4c 89 ea             	mov    rdx,r13
      ea035c:	4c 89 f9             	mov    rcx,r15
      ea035f:	e8 e2 7d ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      ea0364:	4c 89 ff             	mov    rdi,r15
      ea0367:	e8 fe 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea036c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0373:	00 
      ea0374:	e8 a7 db 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea0379:	4c 89 ef             	mov    rdi,r13
      ea037c:	e8 e9 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0381:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0388:	00 
      ea0389:	e8 92 db 02 00       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ea038e:	4c 89 e7             	mov    rdi,r12
      ea0391:	e8 fa da 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0396:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea039d:	00 
      ea039e:	48 89 de             	mov    rsi,rbx
      ea03a1:	e8 52 ed fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      ea03a6:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea03ad:	00 
      ea03ae:	e8 bb 7e ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea03b3:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
      ea03ba:	00 
      ea03bb:	e8 aa 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03c0:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
      ea03c7:	00 
      ea03c8:	e8 9d 9b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea03cd:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
      ea03d4:	00 
      ea03d5:	48 8b 18             	mov    rbx,QWORD PTR [rax]
      ea03d8:	48 8d 35 f1 43 53 ff 	lea    rsi,[rip+0xffffffffff5343f1]        # 3d47d0 <_ZTSN5boost17bad_function_callE@@Base+0x1b16>
      ea03df:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea03e6:	00 
      ea03e7:	e8 54 db 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea03ec:	4c 8b 6c 24 60       	mov    r13,QWORD PTR [rsp+0x60]
      ea03f1:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ea03f6:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      ea03fd:	00 
      ea03fe:	48 89 9c 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rbx
      ea0405:	00 
      ea0406:	4c 89 ac 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r13
      ea040d:	00 
      ea040e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ea0413:	48 89 84 24 78 10 00 	mov    QWORD PTR [rsp+0x1078],rax
      ea041a:	00 
      ea041b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea0420:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      ea0425:	48 89 84 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rax
      ea042c:	00 
      ea042d:	4c 89 b4 24 88 10 00 	mov    QWORD PTR [rsp+0x1088],r14
      ea0434:	00 
      ea0435:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      ea043a:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      ea043f:	48 89 84 24 90 10 00 	mov    QWORD PTR [rsp+0x1090],rax
      ea0446:	00 
      ea0447:	48 89 ac 24 98 10 00 	mov    QWORD PTR [rsp+0x1098],rbp
      ea044e:	00 
      ea044f:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      ea0454:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      ea045b:	00 
      ea045c:	4c 8b 20             	mov    r12,QWORD PTR [rax]
      ea045f:	4c 89 a4 24 a0 10 00 	mov    QWORD PTR [rsp+0x10a0],r12
      ea0466:	00 
      ea0467:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      ea046b:	4c 89 bc 24 a8 10 00 	mov    QWORD PTR [rsp+0x10a8],r15
      ea0472:	00 
      ea0473:	4d 85 ff             	test   r15,r15
      ea0476:	74 05                	je     ea047d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67893>
      ea0478:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      ea047d:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
      ea0484:	00 00 
      ea0486:	6a 58                	push   0x58
      ea0488:	5f                   	pop    rdi
      ea0489:	e8 72 da 94 00       	call   17edf00 <_Znwm@plt>
      ea048e:	48 8d 0d db 43 99 00 	lea    rcx,[rip+0x9943db]        # 1834870 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6808>
      ea0495:	48 89 08             	mov    QWORD PTR [rax],rcx
      ea0498:	f3 0f 6f 84 24 60 10 	movdqu xmm0,XMMWORD PTR [rsp+0x1060]
      ea049f:	00 00 
      ea04a1:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ea04a6:	4c 89 68 18          	mov    QWORD PTR [rax+0x18],r13
      ea04aa:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ea04af:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      ea04b3:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      ea04b8:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
      ea04bd:	48 89 50 28          	mov    QWORD PTR [rax+0x28],rdx
      ea04c1:	4c 89 70 30          	mov    QWORD PTR [rax+0x30],r14
      ea04c5:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      ea04ca:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
      ea04cf:	48 89 50 38          	mov    QWORD PTR [rax+0x38],rdx
      ea04d3:	48 89 68 40          	mov    QWORD PTR [rax+0x40],rbp
      ea04d7:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      ea04dc:	4c 89 60 48          	mov    QWORD PTR [rax+0x48],r12
      ea04e0:	4c 89 78 50          	mov    QWORD PTR [rax+0x50],r15
      ea04e4:	4d 85 ff             	test   r15,r15
      ea04e7:	74 05                	je     ea04ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67904>
      ea04e9:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      ea04ee:	48 89 84 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],rax
      ea04f5:	00 
      ea04f6:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ea04fb:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      ea0502:	00 
      ea0503:	48 89 9c 24 08 0d 00 	mov    QWORD PTR [rsp+0xd08],rbx
      ea050a:	00 
      ea050b:	4c 89 ac 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],r13
      ea0512:	00 
      ea0513:	48 89 8c 24 18 0d 00 	mov    QWORD PTR [rsp+0xd18],rcx
      ea051a:	00 
      ea051b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      ea0520:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      ea0525:	48 89 84 24 20 0d 00 	mov    QWORD PTR [rsp+0xd20],rax
      ea052c:	00 
      ea052d:	4c 89 b4 24 28 0d 00 	mov    QWORD PTR [rsp+0xd28],r14
      ea0534:	00 
      ea0535:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      ea053a:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      ea053f:	48 89 84 24 30 0d 00 	mov    QWORD PTR [rsp+0xd30],rax
      ea0546:	00 
      ea0547:	48 89 ac 24 38 0d 00 	mov    QWORD PTR [rsp+0xd38],rbp
      ea054e:	00 
      ea054f:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      ea0554:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
      ea055b:	00 
      ea055c:	4c 8b 38             	mov    r15,QWORD PTR [rax]
      ea055f:	4c 89 bc 24 40 0d 00 	mov    QWORD PTR [rsp+0xd40],r15
      ea0566:	00 
      ea0567:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
      ea056b:	48 89 9c 24 48 0d 00 	mov    QWORD PTR [rsp+0xd48],rbx
      ea0572:	00 
      ea0573:	48 85 db             	test   rbx,rbx
      ea0576:	74 05                	je     ea057d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67993>
      ea0578:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ea057d:	48 83 a4 24 f0 0e 00 	and    QWORD PTR [rsp+0xef0],0x0
      ea0584:	00 00 
      ea0586:	6a 58                	push   0x58
      ea0588:	5f                   	pop    rdi
      ea0589:	e8 72 d9 94 00       	call   17edf00 <_Znwm@plt>
      ea058e:	48 8d 0d eb 44 99 00 	lea    rcx,[rip+0x9944eb]        # 1834a80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6a18>
      ea0595:	48 89 08             	mov    QWORD PTR [rax],rcx
      ea0598:	f3 0f 6f 84 24 00 0d 	movdqu xmm0,XMMWORD PTR [rsp+0xd00]
      ea059f:	00 00 
      ea05a1:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ea05a6:	4c 89 68 18          	mov    QWORD PTR [rax+0x18],r13
      ea05aa:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ea05af:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      ea05b3:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      ea05b8:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
      ea05bd:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
      ea05c1:	4c 89 70 30          	mov    QWORD PTR [rax+0x30],r14
      ea05c5:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      ea05ca:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
      ea05cf:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      ea05d3:	48 89 68 40          	mov    QWORD PTR [rax+0x40],rbp
      ea05d7:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      ea05dc:	4c 89 78 48          	mov    QWORD PTR [rax+0x48],r15
      ea05e0:	48 89 58 50          	mov    QWORD PTR [rax+0x50],rbx
      ea05e4:	48 85 db             	test   rbx,rbx
      ea05e7:	74 05                	je     ea05ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a04>
      ea05e9:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ea05ee:	48 8d 9c 24 d0 0e 00 	lea    rbx,[rsp+0xed0]
      ea05f5:	00 
      ea05f6:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      ea05fa:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      ea0601:	00 
      ea0602:	4c 8d a4 24 a0 0e 00 	lea    r12,[rsp+0xea0]
      ea0609:	00 
      ea060a:	4c 8d ac 24 30 0b 00 	lea    r13,[rsp+0xb30]
      ea0611:	00 
      ea0612:	4c 89 ff             	mov    rdi,r15
      ea0615:	4c 89 e6             	mov    rsi,r12
      ea0618:	4c 89 ea             	mov    rdx,r13
      ea061b:	48 89 d9             	mov    rcx,rbx
      ea061e:	e8 23 7b ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
      ea0623:	48 89 df             	mov    rdi,rbx
      ea0626:	e8 3f 99 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea062b:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0632:	00 
      ea0633:	e8 32 77 04 00       	call   ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ea0638:	4c 89 ef             	mov    rdi,r13
      ea063b:	e8 2a 99 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0640:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      ea0647:	00 
      ea0648:	48 89 df             	mov    rdi,rbx
      ea064b:	e8 1a 77 04 00       	call   ee7d6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaf180>
      ea0650:	4c 89 e7             	mov    rdi,r12
      ea0653:	e8 38 d8 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0658:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea065f:	00 
      ea0660:	4c 89 fe             	mov    rsi,r15
      ea0663:	e8 90 ea fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      ea0668:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea066f:	00 
      ea0670:	e8 f9 7b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0675:	48 8d 35 84 4a 53 ff 	lea    rsi,[rip+0xffffffffff534a84]        # 3d5100 <_ZTSN5boost17bad_function_callE@@Base+0x2446>
      ea067c:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea0683:	00 
      ea0684:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      ea0689:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
      ea068e:	e8 ad d8 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea0693:	48 8d 05 1e 9a 99 00 	lea    rax,[rip+0x999a1e]        # 183a0b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc050>
      ea069a:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      ea06a1:	00 
      ea06a2:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      ea06a9:	00 
      ea06aa:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea06b1:	00 
      ea06b2:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      ea06b9:	00 
      ea06ba:	48 89 da             	mov    rdx,rbx
      ea06bd:	e8 e6 63 02 00       	call   ec6aa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8debe>
      ea06c2:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea06c9:	00 
      ea06ca:	e8 9b 98 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea06cf:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea06d6:	00 
      ea06d7:	e8 b4 d7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea06dc:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea06e3:	00 
      ea06e4:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      ea06eb:	00 
      ea06ec:	e8 07 ea fe ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      ea06f1:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea06f8:	00 
      ea06f9:	e8 70 7b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea06fe:	48 8d 35 c2 27 4c ff 	lea    rsi,[rip+0xffffffffff4c27c2]        # 362ec7 <_ZTSSt12bad_any_cast@@Base-0x2d301>
      ea0705:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea070c:	00 
      ea070d:	e8 6c 93 bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ea0712:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      ea0719:	00 
      ea071a:	48 8d 94 24 70 01 00 	lea    rdx,[rsp+0x170]
      ea0721:	00 
      ea0722:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
      ea0729:	00 
      ea072a:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
      ea0731:	00 
      ea0732:	e8 a2 e1 6b 00       	call   155e8d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a3e5d>
      ea0737:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea073e:	00 
      ea073f:	e8 4c d7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0744:	48 89 ef             	mov    rdi,rbp
      ea0747:	e8 3a dd bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea074c:	4c 89 f7             	mov    rdi,r14
      ea074f:	e8 32 dd bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0754:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ea0759:	e8 28 dd bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea075e:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      ea0765:	00 
      ea0766:	e8 25 d7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea076b:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea0772:	00 
      ea0773:	e8 f6 7a ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0778:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]
      ea077d:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
      ea0784:	00 
      ea0785:	e8 e0 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea078a:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea0791:	00 
      ea0792:	e8 d3 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0797:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      ea079e:	00 
      ea079f:	e8 c6 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07a4:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea07a9:	e8 d8 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07ae:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea07b5:	00 
      ea07b6:	e8 af 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07bb:	31 ff                	xor    edi,edi
      ea07bd:	e8 c4 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c2:	31 ff                	xor    edi,edi
      ea07c4:	e8 bd dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c9:	31 ff                	xor    edi,edi
      ea07cb:	e8 b6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d0:	4c 89 e7             	mov    rdi,r12
      ea07d3:	e8 ae dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d8:	4c 89 ff             	mov    rdi,r15
      ea07db:	e8 a6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07e0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea07e7:	00 
      ea07e8:	e8 37 e2 fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea07ed:	48 89 df             	mov    rdi,rbx
      ea07f0:	e8 91 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07f5:	31 ff                	xor    edi,edi
      ea07f7:	e8 8a dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07fc:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea0803:	00 
      ea0804:	e8 61 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0809:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea0810:	00 00 
      ea0812:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea0819:	00 
      ea081a:	0f 85 d5 15 00 00    	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea0820:	48 81 c4 08 12 00 00 	add    rsp,0x1208
      ea0827:	5b                   	pop    rbx
      ea0828:	41 5c                	pop    r12
      ea082a:	41 5d                	pop    r13
      ea082c:	41 5e                	pop    r14
      ea082e:	41 5f                	pop    r15
      ea0830:	5d                   	pop    rbp
      ea0831:	c3                   	ret
      ea0832:	e9 d2 15 00 00       	jmp    ea1e09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6921f>
      ea0837:	e9 c3 09 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea083c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0841:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0848:	00 
      ea0849:	e8 1c 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea084e:	4c 89 ff             	mov    rdi,r15
      ea0851:	e8 30 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0856:	e9 83 08 00 00       	jmp    ea10de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684f4>
      ea085b:	e9 b3 09 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea0860:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0865:	4c 89 ef             	mov    rdi,r13
      ea0868:	e9 f3 0c 00 00       	jmp    ea1560 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68976>
      ea086d:	49 89 c6             	mov    r14,rax
      ea0870:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0877:	00 
      ea0878:	e8 f1 79 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea087d:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      ea0882:	eb 47                	jmp    ea08cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67ce1>
      ea0884:	49 89 c6             	mov    r14,rax
      ea0887:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea088e:	00 
      ea088f:	e8 d6 96 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0894:	31 ff                	xor    edi,edi
      ea0896:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      ea089b:	eb 08                	jmp    ea08a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67cbb>
      ea089d:	48 89 df             	mov    rdi,rbx
      ea08a0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea08a5:	e8 dc db bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea08aa:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea08b1:	00 
      ea08b2:	e8 d9 d5 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea08b7:	eb 12                	jmp    ea08cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67ce1>
      ea08b9:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea08bf:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      ea08c6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea08cb:	48 89 df             	mov    rdi,rbx
      ea08ce:	e8 b3 db bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea08d3:	e9 40 09 00 00       	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea08d8:	e9 22 09 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea08dd:	e9 ea 07 00 00       	jmp    ea10cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684e2>
      ea08e2:	e9 2c 09 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea08e7:	e9 50 08 00 00       	jmp    ea113c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68552>
      ea08ec:	e9 0e 09 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea08f1:	e9 5a 08 00 00       	jmp    ea1150 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68566>
      ea08f6:	e9 d1 07 00 00       	jmp    ea10cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684e2>
      ea08fb:	e9 13 09 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
