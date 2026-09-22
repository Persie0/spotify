# Restrictions bundle+0x30 stack-slot trace

Target: provider-vector stack bundle base `rsp+0x2e0`; Restrictions `bundle+0x30` maps to `rsp+0x310`.
FDE: `0x14cdc2a..0x14d4d4c`.

## Summary
- instructions in FDE: 6856
- exact `[rsp+0x310]` / `[rsp+0x2e0]` refs: 192
- alias assignments involving bundle base/slot: 315
- alias-based bundle field refs: 33
- helper calls with bundle-derived args: 628
- provider `+0x28` calls: 8

## Exact stack-slot/base references
- `0x14cdf76` read base: `14cdf76:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14cdfd2` read base: `14cdfd2:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]`
- `0x14cdff7` read base: `14cdff7:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]`
- `0x14ce0f4` read base: `14ce0f4:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ce10d` read base: `14ce10d:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]`
- `0x14ce11a` read base: `14ce11a:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ce20c` read base: `14ce20c:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14ce273` read base: `14ce273:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14ce3e7` read base: `14ce3e7:	48 8d 84 24 e0 02 00 	lea    rax,[rsp+0x2e0]`
- `0x14ce403` write base: `14ce403:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax`
- `0x14ce4bf` read base: `14ce4bf:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]`
- `0x14ce5c4` read base: `14ce5c4:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ce5e1` read base: `14ce5e1:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]`
- `0x14ce5f1` read base: `14ce5f1:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ce666` read: `14ce666:	48 8d 8c 24 10 03 00 	lea    rcx,[rsp+0x310]`
- `0x14ce75d` read base: `14ce75d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ce83d` read base: `14ce83d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ce9c7` write base: `14ce9c7:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax`
- `0x14ce9de` read base: `14ce9de:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14cea96` read base: `14cea96:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]`
- `0x14ceb41` read base: `14ceb41:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ceb51` read base: `14ceb51:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14ceb64` read base: `14ceb64:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ceb78` read base: `14ceb78:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cebb4` read base: `14cebb4:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14cebeb` read base: `14cebeb:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cec30` read base: `14cec30:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14cec78` read base: `14cec78:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]`
- `0x14ced4e` write base: `14ced4e:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax`
- `0x14cedb1` read base: `14cedb1:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14ceeee` read base: `14ceeee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cef70` read base: `14cef70:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14cf114` read base: `14cf114:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cf1ba` read base: `14cf1ba:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14cf315` read base: `14cf315:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cf45d` read base: `14cf45d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cf46e` read base: `14cf46e:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14cf483` read base: `14cf483:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cf497` read base: `14cf497:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cf4a4` read base: `14cf4a4:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14cf4b9` read base: `14cf4b9:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cf849` read base: `14cf849:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14cf92b` read base: `14cf92b:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]`
- `0x14cf972` read base: `14cf972:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cfc16` read base: `14cfc16:	48 8d ac 24 e0 02 00 	lea    rbp,[rsp+0x2e0]`
- `0x14cfc62` read base: `14cfc62:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cfca1` read base: `14cfca1:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14cfcec` read base: `14cfcec:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cfd16` read base: `14cfd16:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14cfd61` read base: `14cfd61:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cfd8b` read base: `14cfd8b:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14cfdd6` read base: `14cfdd6:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cff67` read base: `14cff67:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14cffad` read base: `14cffad:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14d0078` write base: `14d0078:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax`
- `0x14d018a` read base: `14d018a:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14d0209` read base: `14d0209:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d033b` read base: `14d033b:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14d0382` read base: `14d0382:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]`
- `0x14d03b0` write base: `14d03b0:	48 83 a4 24 e0 02 00 	and    QWORD PTR [rsp+0x2e0],0x0`
- `0x14d0406` read base: `14d0406:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d0434` write base: `14d0434:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax`
- `0x14d0456` read base: `14d0456:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d0499` write base: `14d0499:	4c 89 b4 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],r14`
- `0x14d0531` write base: `14d0531:	48 83 a4 24 e0 02 00 	and    QWORD PTR [rsp+0x2e0],0x0`
- `0x14d058a` read base: `14d058a:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d0687` write base: `14d0687:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax`
- `0x14d06cc` read base: `14d06cc:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d06fe` read base: `14d06fe:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]`
- `0x14d0747` read base: `14d0747:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d0771` read base: `14d0771:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d0859` read base: `14d0859:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d08e8` read base: `14d08e8:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14d0a40` read base: `14d0a40:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]`
- `0x14d0be2` read base: `14d0be2:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d0c2b` read base: `14d0c2b:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d0ca5` read base: `14d0ca5:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d0cee` read base: `14d0cee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d0d3b` read base: `14d0d3b:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]`
- `0x14d0d8a` read base: `14d0d8a:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d0ddd` read base: `14d0ddd:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d0e26` read base: `14d0e26:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d0ea0` read base: `14d0ea0:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d0ee9` read base: `14d0ee9:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d0f36` read base: `14d0f36:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]`
- `0x14d0f89` read base: `14d0f89:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d0fb4` read base: `14d0fb4:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14d0ffb` read base: `14d0ffb:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d11b7` read base: `14d11b7:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14d1202` read base: `14d1202:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d1231` read base: `14d1231:	48 8d ac 24 e0 02 00 	lea    rbp,[rsp+0x2e0]`
- `0x14d1279` read base: `14d1279:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14d12e3` write base: `14d12e3:	88 84 24 e0 02 00 00 	mov    BYTE PTR [rsp+0x2e0],al`
- `0x14d1326` read base: `14d1326:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14d1368` read base: `14d1368:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d13bb` write base: `14d13bb:	88 84 24 e0 02 00 00 	mov    BYTE PTR [rsp+0x2e0],al`
- `0x14d13fe` read base: `14d13fe:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14d1440` read base: `14d1440:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d158c` read base: `14d158c:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]`
- `0x14d15c3` read base: `14d15c3:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d191c` read base: `14d191c:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]`
- `0x14d19aa` read base: `14d19aa:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]`
- `0x14d1a3c` read base: `14d1a3c:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]`
- `0x14d1acc` read base: `14d1acc:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]`
- `0x14d1b61` read base: `14d1b61:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]`
- `0x14d1bc3` read base: `14d1bc3:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d1c6d` read base: `14d1c6d:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]`
- `0x14d1cd3` read base: `14d1cd3:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d1cfd` read base: `14d1cfd:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d1d54` read base: `14d1d54:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d2111` read base: `14d2111:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14d2159` read base: `14d2159:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d217f` read base: `14d217f:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d21d0` read base: `14d21d0:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]`
- `0x14d23b9` write base: `14d23b9:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax`
- `0x14d24f3` read base: `14d24f3:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14d2556` read base: `14d2556:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d28a1` read base: `14d28a1:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d28ec` read base: `14d28ec:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d2919` read base: `14d2919:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`

... truncated 72 additional rows ...

## Alias assignments
- `0x14cdf76` `r14` = `bundle_base` via `14cdf76:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14cdf82` `rdi` = `bundle_base` via `14cdf82:	4c 89 f7             	mov    rdi,r14`
- `0x14cdf9e` `rdx` = `bundle_base` via `14cdf9e:	4c 89 f2             	mov    rdx,r14`
- `0x14cdfb8` `rdi` = `bundle_base` via `14cdfb8:	4c 89 f7             	mov    rdi,r14`
- `0x14cdfd2` `rdx` = `bundle_base` via `14cdfd2:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]`
- `0x14cdff7` `rdx` = `bundle_base` via `14cdff7:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]`
- `0x14ce0f4` `rdi` = `bundle_base` via `14ce0f4:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ce10d` `rdx` = `bundle_base` via `14ce10d:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]`
- `0x14ce11a` `rdi` = `bundle_base` via `14ce11a:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ce20c` `r14` = `bundle_base` via `14ce20c:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14ce22e` `rdx` = `bundle_base` via `14ce22e:	4c 89 f2             	mov    rdx,r14`
- `0x14ce236` `rdi` = `bundle_base` via `14ce236:	4c 89 f7             	mov    rdi,r14`
- `0x14ce273` `r14` = `bundle_base` via `14ce273:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14ce29e` `rdx` = `bundle_base` via `14ce29e:	4c 89 f2             	mov    rdx,r14`
- `0x14ce2a6` `rdi` = `bundle_base` via `14ce2a6:	4c 89 f7             	mov    rdi,r14`
- `0x14ce3e7` `rax` = `bundle_base` via `14ce3e7:	48 8d 84 24 e0 02 00 	lea    rax,[rsp+0x2e0]`
- `0x14ce4bf` `r12` = `bundle_base` via `14ce4bf:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]`
- `0x14ce4c7` `rsi` = `bundle_base` via `14ce4c7:	4c 89 e6             	mov    rsi,r12`
- `0x14ce4f5` `rdi` = `bundle_base` via `14ce4f5:	4c 89 e7             	mov    rdi,r12`
- `0x14ce5c4` `rdi` = `bundle_base` via `14ce5c4:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ce5e1` `rdx` = `bundle_base` via `14ce5e1:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]`
- `0x14ce5f1` `rdi` = `bundle_base` via `14ce5f1:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ce666` `rcx` = `bundle_30` via `14ce666:	48 8d 8c 24 10 03 00 	lea    rcx,[rsp+0x310]`
- `0x14ce75d` `rdi` = `bundle_base` via `14ce75d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ce83d` `rdi` = `bundle_base` via `14ce83d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ce9de` `rsi` = `bundle_base` via `14ce9de:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14cea96` `rbx` = `bundle_base` via `14cea96:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]`
- `0x14cea9e` `rdi` = `bundle_base` via `14cea9e:	48 89 df             	mov    rdi,rbx`
- `0x14ceb12` `rdi` = `bundle_base` via `14ceb12:	48 89 df             	mov    rdi,rbx`
- `0x14ceb1a` `rdi` = `bundle_base` via `14ceb1a:	48 89 df             	mov    rdi,rbx`
- `0x14ceb41` `rdi` = `bundle_base` via `14ceb41:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ceb51` `rsi` = `bundle_base` via `14ceb51:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14ceb64` `rdi` = `bundle_base` via `14ceb64:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14ceb78` `rdi` = `bundle_base` via `14ceb78:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cebb4` `rsi` = `bundle_base` via `14cebb4:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14cebeb` `rdi` = `bundle_base` via `14cebeb:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cec30` `r14` = `bundle_base` via `14cec30:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14cec3c` `rdi` = `bundle_base` via `14cec3c:	4c 89 f7             	mov    rdi,r14`
- `0x14cec52` `rdx` = `bundle_base` via `14cec52:	4c 89 f2             	mov    rdx,r14`
- `0x14cec78` `rbx` = `bundle_base` via `14cec78:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]`
- `0x14cec80` `rdi` = `bundle_base` via `14cec80:	48 89 df             	mov    rdi,rbx`
- `0x14cedb1` `rsi` = `bundle_base` via `14cedb1:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14ceeee` `rdi` = `bundle_base` via `14ceeee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cef70` `r13` = `bundle_base` via `14cef70:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14cef87` `rdi` = `bundle_base` via `14cef87:	4c 89 ef             	mov    rdi,r13`
- `0x14cefa0` `rsi` = `bundle_base` via `14cefa0:	4c 89 ee             	mov    rsi,r13`
- `0x14cefa6` `rdi` = `bundle_base` via `14cefa6:	4c 89 ef             	mov    rdi,r13`
- `0x14cf114` `rdi` = `bundle_base` via `14cf114:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cf1ba` `rsi` = `bundle_base` via `14cf1ba:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14cf315` `rdi` = `bundle_base` via `14cf315:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cf45d` `rdi` = `bundle_base` via `14cf45d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cf46e` `rsi` = `bundle_base` via `14cf46e:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14cf483` `rdi` = `bundle_base` via `14cf483:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cf497` `rdi` = `bundle_base` via `14cf497:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cf4a4` `rsi` = `bundle_base` via `14cf4a4:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14cf4b9` `rdi` = `bundle_base` via `14cf4b9:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cf849` `r14` = `bundle_base` via `14cf849:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14cf869` `rsi` = `bundle_base` via `14cf869:	4c 89 f6             	mov    rsi,r14`
- `0x14cf92b` `r15` = `bundle_base` via `14cf92b:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]`
- `0x14cf937` `rdi` = `bundle_base` via `14cf937:	4c 89 ff             	mov    rdi,r15`
- `0x14cf950` `rdx` = `bundle_base` via `14cf950:	4c 89 fa             	mov    rdx,r15`
- `0x14cf972` `rdi` = `bundle_base` via `14cf972:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cfc16` `rbp` = `bundle_base` via `14cfc16:	48 8d ac 24 e0 02 00 	lea    rbp,[rsp+0x2e0]`
- `0x14cfc2a` `rdi` = `bundle_base` via `14cfc2a:	48 89 ef             	mov    rdi,rbp`
- `0x14cfc40` `rdx` = `bundle_base` via `14cfc40:	48 89 ea             	mov    rdx,rbp`
- `0x14cfc62` `rdi` = `bundle_base` via `14cfc62:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cfca1` `r14` = `bundle_base` via `14cfca1:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14cfcad` `rdi` = `bundle_base` via `14cfcad:	4c 89 f7             	mov    rdi,r14`
- `0x14cfcc5` `rdx` = `bundle_base` via `14cfcc5:	4c 89 f2             	mov    rdx,r14`
- `0x14cfcec` `rdi` = `bundle_base` via `14cfcec:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cfd16` `r14` = `bundle_base` via `14cfd16:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14cfd22` `rdi` = `bundle_base` via `14cfd22:	4c 89 f7             	mov    rdi,r14`
- `0x14cfd3a` `rdx` = `bundle_base` via `14cfd3a:	4c 89 f2             	mov    rdx,r14`
- `0x14cfd61` `rdi` = `bundle_base` via `14cfd61:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cfd8b` `r14` = `bundle_base` via `14cfd8b:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14cfd97` `rdi` = `bundle_base` via `14cfd97:	4c 89 f7             	mov    rdi,r14`
- `0x14cfdaf` `rdx` = `bundle_base` via `14cfdaf:	4c 89 f2             	mov    rdx,r14`
- `0x14cfdd6` `rdi` = `bundle_base` via `14cfdd6:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14cff67` `r13` = `bundle_base` via `14cff67:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14cff73` `rdi` = `bundle_base` via `14cff73:	4c 89 ef             	mov    rdi,r13`
- `0x14cff8b` `rdx` = `bundle_base` via `14cff8b:	4c 89 ea             	mov    rdx,r13`
- `0x14cffad` `r13` = `bundle_base` via `14cffad:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14cffb5` `rdi` = `bundle_base` via `14cffb5:	4c 89 ef             	mov    rdi,r13`
- `0x14d018a` `rsi` = `bundle_base` via `14d018a:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]`
- `0x14d0209` `rdi` = `bundle_base` via `14d0209:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d033b` `r13` = `bundle_base` via `14d033b:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14d0347` `rdi` = `bundle_base` via `14d0347:	4c 89 ef             	mov    rdi,r13`
- `0x14d0360` `rdx` = `bundle_base` via `14d0360:	4c 89 ea             	mov    rdx,r13`
- `0x14d0382` `rbx` = `bundle_base` via `14d0382:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]`
- `0x14d038a` `rdi` = `bundle_base` via `14d038a:	48 89 df             	mov    rdi,rbx`
- `0x14d0406` `r14` = `bundle_base` via `14d0406:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d040e` `rdi` = `bundle_base` via `14d040e:	4c 89 f7             	mov    rdi,r14`
- `0x14d0450` `rsi` = `bundle_base` via `14d0450:	4c 89 f6             	mov    rsi,r14`
- `0x14d0456` `rdi` = `bundle_base` via `14d0456:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d058a` `r14` = `bundle_base` via `14d058a:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d0592` `rdi` = `bundle_base` via `14d0592:	4c 89 f7             	mov    rdi,r14`
- `0x14d06aa` `rdx` = `bundle_base` via `14d06aa:	4c 89 f2             	mov    rdx,r14`
- `0x14d06cc` `rdi` = `bundle_base` via `14d06cc:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d06fe` `r12` = `bundle_base` via `14d06fe:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]`
- `0x14d070a` `rdi` = `bundle_base` via `14d070a:	4c 89 e7             	mov    rdi,r12`
- `0x14d0725` `rcx` = `bundle_base` via `14d0725:	4c 89 e1             	mov    rcx,r12`
- `0x14d0747` `rdi` = `bundle_base` via `14d0747:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`
- `0x14d0771` `r14` = `bundle_base` via `14d0771:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d077d` `rdi` = `bundle_base` via `14d077d:	4c 89 f7             	mov    rdi,r14`
- `0x14d0795` `rdx` = `bundle_base` via `14d0795:	4c 89 f2             	mov    rdx,r14`
- `0x14d07b4` `rdi` = `bundle_base` via `14d07b4:	4c 89 f7             	mov    rdi,r14`
- `0x14d0859` `r14` = `bundle_base` via `14d0859:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d0880` `rsi` = `bundle_base` via `14d0880:	4c 89 f6             	mov    rsi,r14`
- `0x14d08e8` `r13` = `bundle_base` via `14d08e8:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]`
- `0x14d0915` `rdi` = `bundle_base` via `14d0915:	4c 89 ef             	mov    rdi,r13`
- `0x14d0944` `rcx` = `bundle_base` via `14d0944:	4c 89 e9             	mov    rcx,r13`
- `0x14d0964` `rdi` = `bundle_base` via `14d0964:	4c 89 ef             	mov    rdi,r13`
- `0x14d0a40` `r15` = `bundle_base` via `14d0a40:	4c 8d bc 24 e0 02 00 	lea    r15,[rsp+0x2e0]`
- `0x14d0a67` `rdi` = `bundle_base` via `14d0a67:	4c 89 ff             	mov    rdi,r15`
- `0x14d0a97` `rcx` = `bundle_base` via `14d0a97:	4c 89 f9             	mov    rcx,r15`
- `0x14d0ab7` `rdi` = `bundle_base` via `14d0ab7:	4c 89 ff             	mov    rdi,r15`
- `0x14d0be2` `r14` = `bundle_base` via `14d0be2:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]`
- `0x14d0bf2` `rdi` = `bundle_base` via `14d0bf2:	4c 89 f7             	mov    rdi,r14`
- `0x14d0c08` `rdx` = `bundle_base` via `14d0c08:	4c 89 f2             	mov    rdx,r14`
- `0x14d0c2b` `rdi` = `bundle_base` via `14d0c2b:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]`

... truncated 195 additional rows ...

## Alias-based bundle field references
- `0x14cdfc4` `bundle+0x0` via `14cdfc4:	41 c6 06 00          	mov    BYTE PTR [r14],0x0`
- `0x14cdfff` `bundle+0x0` via `14cdfff:	c6 02 00             	mov    BYTE PTR [rdx],0x0`
- `0x14ce214` `bundle+0x0` via `14ce214:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0`
- `0x14ce21f` `bundle+0x10` via `14ce21f:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax`
- `0x14ce22a` `bundle+0x18` via `14ce22a:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax`
- `0x14ce27b` `bundle+0x0` via `14ce27b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0`
- `0x14ce287` `bundle+0x10` via `14ce287:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax`
- `0x14ce292` `bundle+0x18` via `14ce292:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax`
- `0x14ceafe` `bundle+0x0` via `14ceafe:	48 89 03             	mov    QWORD PTR [rbx],rax`
- `0x14ceb01` `bundle+0x8` via `14ceb01:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15`
- `0x14ceb05` `bundle+0x10` via `14ceb05:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13`
- `0x14ceb0e` `bundle+0x20` via `14ceb0e:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx`
- `0x14cf851` `bundle+0x0` via `14cf851:	49 89 06             	mov    QWORD PTR [r14],rax`
- `0x14cf854` `bundle+0x8` via `14cf854:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx`
- `0x14cf871` `bundle+0x8` via `14cf871:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]`
- `0x14d0392` `bundle+0x0` via `14d0392:	4c 89 3b             	mov    QWORD PTR [rbx],r15`
- `0x14d0861` `bundle+0x0` via `14d0861:	49 89 06             	mov    QWORD PTR [r14],rax`
- `0x14d0864` `bundle+0x8` via `14d0864:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx`
- `0x14d0888` `bundle+0x8` via `14d0888:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]`
- `0x14d1c30` `bundle+0x0` via `14d1c30:	49 89 06             	mov    QWORD PTR [r14],rax`
- `0x14d1c33` `bundle+0x8` via `14d1c33:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp`
- `0x14d1c37` `bundle+0x20` via `14d1c37:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14`
- `0x14d1c8b` `bundle+0x0` via `14d1c8b:	48 89 03             	mov    QWORD PTR [rbx],rax`
- `0x14d1c8e` `bundle+0x8` via `14d1c8e:	48 89 6b 08          	mov    QWORD PTR [rbx+0x8],rbp`
- `0x14d1c92` `bundle+0x20` via `14d1c92:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx`
- `0x14d2c11` `bundle+0x8` via `14d2c11:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]`
- `0x14d3201` `bundle+0x8` via `14d3201:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]`
- `0x14d32ea` `bundle+0x0` via `14d32ea:	4c 89 3b             	mov    QWORD PTR [rbx],r15`
- `0x14d32ed` `bundle+0x8` via `14d32ed:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14`
- `0x14d3302` `bundle+0x8` via `14d3302:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]`
- `0x14d3522` `bundle+0x0` via `14d3522:	49 89 1e             	mov    QWORD PTR [r14],rbx`
- `0x14d3525` `bundle+0x8` via `14d3525:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12`
- `0x14d353d` `bundle+0x8` via `14d353d:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]`

## Helper calls with bundle-derived arguments
| call | bundle-derived args | target/context |
|---|---|---|
| `0x14cdf87` | `rdi=bundle_base` | `14cdf87:	e8 08 c8 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0x14cdfa1` | `rdx=bundle_base` | `14cdfa1:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x14cdfaa` | `rdx=bundle_base` | `14cdfaa:	e8 43 bc 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0x14cdfb3` | `rdx=bundle_base` | `14cdfb3:	e8 ce 04 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x14cdfbb` | `rdi=bundle_base, rdx=bundle_base` | `14cdfbb:	e8 28 c8 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x14cdfdd` | `rdx=bundle_base` | `14cdfdd:	e8 7c f7 6b ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>` |
| `0x14cdfeb` | `rdx=bundle_base` | `14cdfeb:	e8 04 85 00 00       	call   14d64f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31ba78>` |
| `0x14ce00f` | `rdx=bundle_base` | `14ce00f:	e8 4a f7 6b ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>` |
| `0x14ce01d` | `rdx=bundle_base` | `14ce01d:	e8 d2 84 00 00       	call   14d64f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31ba78>` |
| `0x14ce027` | `rdx=bundle_base` | `14ce027:	e8 f0 03 5d ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>` |
| `0x14ce046` | `rdx=bundle_base` | `14ce046:	e8 3b 04 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x14ce0fc` | `rdi=bundle_base` | `14ce0fc:	e8 f5 f3 6b ff       	call   b8d4f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda496>` |
| `0x14ce115` | `rdx=bundle_base` | `14ce115:	e8 8d a1 5d ff       	call   aa82a7 <JNI_OnUnload@@Base+0x2fb74>` |
| `0x14ce122` | `rdi=bundle_base, rdx=bundle_base` | `14ce122:	e8 69 fd 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x14ce135` | `rdx=bundle_base` | `14ce135:	e8 88 35 2f 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>` |
| `0x14ce160` | `rdx=bundle_base` | `14ce160:	e8 9b fd 31 00       	call   17edf00 <_Znwm@plt>` |
| `0x14ce1cd` | `rdx=bundle_base` | `14ce1cd:	e8 e0 02 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0x14ce1d5` | `rdx=bundle_base` | `14ce1d5:	e8 ac 02 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x14ce231` | `rdx=bundle_base` | `14ce231:	e8 52 32 2f 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>` |
| `0x14ce239` | `rdi=bundle_base, rdx=bundle_base` | `14ce239:	e8 60 90 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0x14ce240` | `rdi=bundle_base, rdx=bundle_base` | `14ce240:	e8 9f 13 61 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>` |
| `0x14ce247` | `rdi=bundle_base, rdx=bundle_base` | `14ce247:	e8 66 02 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0x14ce2a1` | `rdx=bundle_base` | `14ce2a1:	e8 de 35 2f 00       	call   17c1884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1759f0>` |
| `0x14ce2a9` | `rdi=bundle_base, rdx=bundle_base` | `14ce2a9:	e8 f0 8f 5d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0x14ce2b0` | `rdi=bundle_base, rdx=bundle_base` | `14ce2b0:	e8 2f 13 61 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>` |
| `0x14ce2b7` | `rdi=bundle_base, rdx=bundle_base` | `14ce2b7:	e8 f6 01 5d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0x14ce2be` | `rdi=bundle_base, rdx=bundle_base` | `14ce2be:	e8 c3 01 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x14ce2cd` | `rdx=bundle_base` | `14ce2cd:	e8 2e fc 31 00       	call   17edf00 <_Znwm@plt>` |
| `0x14ce33d` | `rdx=bundle_base` | `14ce33d:	e8 64 b5 11 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>` |
| `0x14ce4ca` | `rsi=bundle_base` | `14ce4ca:	e8 73 bd 01 00       	call   14ea242 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32f7c6>` |
| `0x14ce4f8` | `rdi=bundle_base` | `14ce4f8:	e8 6d ba 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0x14ce4ff` | `rdi=bundle_base` | `14ce4ff:	e8 ae ff 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0x14ce5d1` | `rdi=bundle_base` | `14ce5d1:	e8 20 ef 6b ff       	call   b8d4f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda496>` |
| `0x14ce5ec` | `rdx=bundle_base` | `14ce5ec:	e8 b6 9c 5d ff       	call   aa82a7 <JNI_OnUnload@@Base+0x2fb74>` |
| `0x14ce5f9` | `rdi=bundle_base, rdx=bundle_base` | `14ce5f9:	e8 92 f8 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x14ce65a` | `rdx=bundle_base` | `14ce65a:	e8 91 fa 31 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0x14ce6b8` | `rdx=bundle_base` | `14ce6b8:	e8 83 f8 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0x14ce6d4` | `rdx=bundle_base` | `14ce6d4:	e8 27 f8 31 00       	call   17edf00 <_Znwm@plt>` |
| `0x14ce717` | `rdx=bundle_base` | `14ce717:	e8 62 b3 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x14ce72c` | `rdx=bundle_base` | `14ce72c:	e8 f9 f5 2d 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>` |
| `0x14ce739` | `rdx=bundle_base` | `14ce739:	e8 52 f7 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x14ce746` | `rdx=bundle_base` | `14ce746:	e8 45 f7 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x14ce76d` | `rdi=bundle_base, rdx=bundle_base` | `14ce76d:	e8 ca 28 19 00       	call   166103c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x151a8>` |
| `0x14ce7c5` | `rdx=bundle_base` | `14ce7c5:	e8 5a 8c 03 00       	call   1507424 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c9a8>` |
| `0x14ce80c` | `rdx=bundle_base` | `14ce80c:	e8 db ab 9b ff       	call   e893ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50802>` |
| `0x14ce81b` | `rdx=bundle_base` | `14ce81b:	e8 60 f8 31 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>` |
| `0x14ce838` | `rdx=bundle_base` | `14ce838:	e8 5b f5 2d 00       	call   17add98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161f04>` |
| `0x14ce845` | `rdi=bundle_base, rdx=bundle_base` | `14ce845:	e8 90 e2 06 00       	call   153cada <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38205e>` |
| `0x14ce852` | `rdx=bundle_base` | `14ce852:	e8 d9 d5 5d ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>` |
| `0x14ce859` | `rdx=bundle_base` | `14ce859:	e8 be fb 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>` |
| `0x14ce884` | `rdx=bundle_base` | `14ce884:	e8 fd fb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x14ce88e` | `rdx=bundle_base` | `14ce88e:	e8 6d f6 31 00       	call   17edf00 <_Znwm@plt>` |
| `0x14ce8b7` | `rdx=bundle_base` | `14ce8b7:	e8 d4 02 32 00       	call   17eeb90 <memset@plt>` |
| `0x14ce8bf` | `rdx=bundle_base` | `14ce8bf:	e8 ca 99 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x14ce8c8` | `rdx=bundle_base` | `14ce8c8:	e8 c1 99 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x14ce8d4` | `rdx=bundle_base` | `14ce8d4:	e8 b5 99 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x14ce8e0` | `rdx=bundle_base` | `14ce8e0:	e8 67 64 00 00       	call   14d4d4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a2d0>` |
| `0x14ce8ef` | `rdx=bundle_base` | `14ce8ef:	e8 9a 99 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x14ce8f7` | `rdx=bundle_base` | `14ce8f7:	e8 04 f6 31 00       	call   17edf00 <_Znwm@plt>` |
| `0x14ce925` | `rdx=bundle_base` | `14ce925:	e8 5c fb 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x14ce951` | `rdx=bundle_base` | `14ce951:	e8 aa f5 31 00       	call   17edf00 <_Znwm@plt>` |
| `0x14ce99a` | `rdx=bundle_base` | `14ce99a:	e8 ef 98 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x14ce9a4` | `rdx=bundle_base` | `14ce9a4:	e8 57 f5 31 00       	call   17edf00 <_Znwm@plt>` |
| `0x14cea2d` | `rsi=bundle_base, rdx=bundle_base` | `14cea2d:	e8 5e b8 5a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>` |
| `0x14cea58` | `rsi=bundle_base, rdx=bundle_base` | `14cea58:	e8 b7 f6 00 00       	call   14de114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x323698>` |
| `0x14cea64` | `rsi=bundle_base, rdx=bundle_base` | `14cea64:	e8 ab f6 00 00       	call   14de114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x323698>` |
| `0x14cea91` | `rsi=bundle_base, rdx=bundle_base` | `14cea91:	e8 f8 97 65 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>` |
| `0x14ceaa1` | `rdi=bundle_base, rsi=bundle_base, rdx=bundle_base` | `14ceaa1:	e8 c4 b4 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0x14ceabc` | `rdi=bundle_base, rsi=bundle_base, rdx=bundle_base` | `14ceabc:	e8 5b f9 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>` |
| `0x14ceae1` | `rsi=bundle_base, rdx=bundle_base` | `14ceae1:	e8 a0 f9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x14ceb15` | `rdi=bundle_base, rdx=bundle_base` | `14ceb15:	e8 50 6a 70 ff       	call   bd556a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12250a>` |
| `0x14ceb1d` | `rdi=bundle_base, rdx=bundle_base` | `14ceb1d:	e8 48 b4 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0x14ceb25` | `rdx=bundle_base` | `14ceb25:	e8 5c f9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x14ceb35` | `rdx=bundle_base` | `14ceb35:	e8 4c f9 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0x14ceb49` | `rdi=bundle_base, rdx=bundle_base` | `14ceb49:	e8 30 af 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x14ceb61` | `rsi=bundle_base` | `14ceb61:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x14ceb6c` | `rdi=bundle_base, rsi=bundle_base` | `14ceb6c:	e8 1f f3 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x14ceb80` | `rdi=bundle_base` | `14ceb80:	e8 f9 ae 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x14cebcf` | `rsi=bundle_base` | `14cebcf:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x14cebe6` | `rsi=bundle_base` | `14cebe6:	e8 a5 f2 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |

Truncated 548 additional helper calls.


### First helper-call contexts
#### helper `0x14cdf87` args `rdi=bundle_base`
```text
     14cdf6f:	48 8d 0d fa 84 00 00 	lea    rcx,[rip+0x84fa]        # 14d6470 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31b9f4>
     14cdf76:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
     14cdf7d:	00 
     14cdf7e:	6a 08                	push   0x8
     14cdf80:	41 59                	pop    r9
     14cdf82:	4c 89 f7             	mov    rdi,r14
     14cdf85:	31 d2                	xor    edx,edx
     14cdf87:	e8 08 c8 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cdf8c:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
     14cdf90:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14cdf93:	4c 8d ac 24 a0 03 00 	lea    r13,[rsp+0x3a0]
```

#### helper `0x14cdfa1` args `rdx=bundle_base`
```text
     14cdf87:	e8 08 c8 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cdf8c:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
     14cdf90:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14cdf93:	4c 8d ac 24 a0 03 00 	lea    r13,[rsp+0x3a0]
     14cdf9a:	00 
     14cdf9b:	4c 89 ef             	mov    rdi,r13
     14cdf9e:	4c 89 f2             	mov    rdx,r14
     14cdfa1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14cdfa4:	4c 89 e7             	mov    rdi,r12
     14cdfa7:	4c 89 ee             	mov    rsi,r13
     14cdfaa:	e8 43 bc 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
```

#### helper `0x14cdfaa` args `rdx=bundle_base`
```text
     14cdf93:	4c 8d ac 24 a0 03 00 	lea    r13,[rsp+0x3a0]
     14cdf9a:	00 
     14cdf9b:	4c 89 ef             	mov    rdi,r13
     14cdf9e:	4c 89 f2             	mov    rdx,r14
     14cdfa1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14cdfa4:	4c 89 e7             	mov    rdi,r12
     14cdfa7:	4c 89 ee             	mov    rsi,r13
     14cdfaa:	e8 43 bc 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cdfaf:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14cdfb3:	e8 ce 04 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cdfb8:	4c 89 f7             	mov    rdi,r14
```

#### helper `0x14cdfb3` args `rdx=bundle_base`
```text
     14cdf9b:	4c 89 ef             	mov    rdi,r13
     14cdf9e:	4c 89 f2             	mov    rdx,r14
     14cdfa1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14cdfa4:	4c 89 e7             	mov    rdi,r12
     14cdfa7:	4c 89 ee             	mov    rsi,r13
     14cdfaa:	e8 43 bc 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cdfaf:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14cdfb3:	e8 ce 04 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cdfb8:	4c 89 f7             	mov    rdi,r14
     14cdfbb:	e8 28 c8 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cdfc0:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
```

#### helper `0x14cdfbb` args `rdi=bundle_base, rdx=bundle_base`
```text
     14cdfa1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14cdfa4:	4c 89 e7             	mov    rdi,r12
     14cdfa7:	4c 89 ee             	mov    rsi,r13
     14cdfaa:	e8 43 bc 30 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     14cdfaf:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     14cdfb3:	e8 ce 04 5d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cdfb8:	4c 89 f7             	mov    rdi,r14
     14cdfbb:	e8 28 c8 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14cdfc0:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     14cdfc4:	41 c6 06 00          	mov    BYTE PTR [r14],0x0
     14cdfc8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
```

#### helper `0x14cdfdd` args `rdx=bundle_base`
```text
     14cdfc0:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     14cdfc4:	41 c6 06 00          	mov    BYTE PTR [r14],0x0
     14cdfc8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14cdfcb:	4c 8d 2d 2e a7 f6 fe 	lea    r13,[rip+0xfffffffffef6a72e]        # 438700 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e14f>
     14cdfd2:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]
     14cdfd9:	00 
     14cdfda:	4c 89 ee             	mov    rsi,r13
     14cdfdd:	e8 7c f7 6b ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
     14cdfe2:	41 89 c6             	mov    r14d,eax
     14cdfe5:	4c 89 ff             	mov    rdi,r15
     14cdfe8:	4c 89 ee             	mov    rsi,r13
```

#### helper `0x14cdfeb` args `rdx=bundle_base`
```text
     14cdfd2:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]
     14cdfd9:	00 
     14cdfda:	4c 89 ee             	mov    rsi,r13
     14cdfdd:	e8 7c f7 6b ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
     14cdfe2:	41 89 c6             	mov    r14d,eax
     14cdfe5:	4c 89 ff             	mov    rdi,r15
     14cdfe8:	4c 89 ee             	mov    rsi,r13
     14cdfeb:	e8 04 85 00 00       	call   14d64f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31ba78>
     14cdff0:	44 88 30             	mov    BYTE PTR [rax],r14b
     14cdff3:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     14cdff7:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]
```

#### helper `0x14ce00f` args `rdx=bundle_base`
```text
     14cdff3:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     14cdff7:	48 8d 94 24 e0 02 00 	lea    rdx,[rsp+0x2e0]
     14cdffe:	00 
     14cdfff:	c6 02 00             	mov    BYTE PTR [rdx],0x0
     14ce002:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14ce005:	4c 8d 2d 0c a7 f6 fe 	lea    r13,[rip+0xfffffffffef6a70c]        # 438718 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e167>
     14ce00c:	4c 89 ee             	mov    rsi,r13
     14ce00f:	e8 4a f7 6b ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
     14ce014:	41 89 c6             	mov    r14d,eax
     14ce017:	4c 89 ff             	mov    rdi,r15
     14ce01a:	4c 89 ee             	mov    rsi,r13
```

#### helper `0x14ce01d` args `rdx=bundle_base`
```text
     14ce002:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14ce005:	4c 8d 2d 0c a7 f6 fe 	lea    r13,[rip+0xfffffffffef6a70c]        # 438718 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e167>
     14ce00c:	4c 89 ee             	mov    rsi,r13
     14ce00f:	e8 4a f7 6b ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
     14ce014:	41 89 c6             	mov    r14d,eax
     14ce017:	4c 89 ff             	mov    rdi,r15
     14ce01a:	4c 89 ee             	mov    rsi,r13
     14ce01d:	e8 d2 84 00 00       	call   14d64f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31ba78>
     14ce022:	44 88 30             	mov    BYTE PTR [rax],r14b
     14ce025:	31 ff                	xor    edi,edi
     14ce027:	e8 f0 03 5d ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
```

#### helper `0x14ce027` args `rdx=bundle_base`
```text
     14ce00f:	e8 4a f7 6b ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
     14ce014:	41 89 c6             	mov    r14d,eax
     14ce017:	4c 89 ff             	mov    rdi,r15
     14ce01a:	4c 89 ee             	mov    rsi,r13
     14ce01d:	e8 d2 84 00 00       	call   14d64f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31ba78>
     14ce022:	44 88 30             	mov    BYTE PTR [rax],r14b
     14ce025:	31 ff                	xor    edi,edi
     14ce027:	e8 f0 03 5d ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14ce02c:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14ce031:	49 89 ae f8 00 00 00 	mov    QWORD PTR [r14+0xf8],rbp
     14ce038:	49 8b be 00 01 00 00 	mov    rdi,QWORD PTR [r14+0x100]
```

## Provider +0x28 calls and bundle arg state
| call | bundle-derived args at call |
|---|---|
| `0x14cfd3d` | `rdx=bundle_base` |
| `0x14cfdb2` | `rdx=bundle_base` |
| `0x14d06ad` | `rdx=bundle_base` |
| `0x14d0cce` | `rdx=bundle_base` |
| `0x14d0d6a` | `rdx=bundle_base` |
| `0x14d1c49` | `rdx=bundle_base` |
| `0x14d1caf` | `rdx=bundle_base` |
| `0x14d2a30` | `rdx=bundle_base` |

### Provider-call contexts
#### provider call `0x14cfd3d`
```text
     14cfd20:	41 59                	pop    r9
     14cfd22:	4c 89 f7             	mov    rdi,r14
     14cfd25:	31 d2                	xor    edx,edx
     14cfd27:	e8 68 aa 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cfd2c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14cfd2f:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14cfd36:	00 
     14cfd37:	48 89 de             	mov    rsi,rbx
     14cfd3a:	4c 89 f2             	mov    rdx,r14
     14cfd3d:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14cfd40:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14cfd47:	00 
     14cfd48:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     14cfd4f:	00 
```

#### provider call `0x14cfdb2`
```text
     14cfd95:	41 59                	pop    r9
     14cfd97:	4c 89 f7             	mov    rdi,r14
     14cfd9a:	31 d2                	xor    edx,edx
     14cfd9c:	e8 f3 a9 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14cfda1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14cfda4:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14cfdab:	00 
     14cfdac:	48 89 de             	mov    rsi,rbx
     14cfdaf:	4c 89 f2             	mov    rdx,r14
     14cfdb2:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14cfdb5:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14cfdbc:	00 
     14cfdbd:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     14cfdc4:	00 
```

#### provider call `0x14d06ad`
```text
     14d068e:	00 
     14d068f:	48 89 ac 24 e8 02 00 	mov    QWORD PTR [rsp+0x2e8],rbp
     14d0696:	00 
     14d0697:	4c 89 b4 24 00 03 00 	mov    QWORD PTR [rsp+0x300],r14
     14d069e:	00 
     14d069f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14d06a2:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d06a9:	00 
     14d06aa:	4c 89 f2             	mov    rdx,r14
     14d06ad:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d06b0:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14d06b7:	00 
     14d06b8:	4c 89 e7             	mov    rdi,r12
     14d06bb:	4c 89 f6             	mov    rsi,r14
```

#### provider call `0x14d0cce`
```text
     14d0cad:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d0cb4:	00 
     14d0cb5:	4c 89 f7             	mov    rdi,r14
     14d0cb8:	e8 bf 5e 01 00       	call   14e6b7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32c100>
     14d0cbd:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d0cc0:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     14d0cc7:	00 
     14d0cc8:	48 89 de             	mov    rsi,rbx
     14d0ccb:	4c 89 f2             	mov    rdx,r14
     14d0cce:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d0cd1:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
     14d0cd8:	00 
     14d0cd9:	4c 89 ff             	mov    rdi,r15
     14d0cdc:	e8 79 af 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
```

#### provider call `0x14d0d6a`
```text
     14d0d4d:	41 59                	pop    r9
     14d0d4f:	48 89 df             	mov    rdi,rbx
     14d0d52:	31 d2                	xor    edx,edx
     14d0d54:	e8 3b 9a 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d0d59:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14d0d5c:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d0d63:	00 
     14d0d64:	4c 89 f6             	mov    rsi,r14
     14d0d67:	48 89 da             	mov    rdx,rbx
     14d0d6a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d0d6d:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     14d0d74:	00 
     14d0d75:	4c 89 ff             	mov    rdi,r15
     14d0d78:	e8 dd ae 5e ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
```

#### provider call `0x14d1c49`
```text
     14d1c22:	49 8b b5 a0 00 00 00 	mov    rsi,QWORD PTR [r13+0xa0]
     14d1c29:	48 8d 05 50 92 3a 00 	lea    rax,[rip+0x3a9250]        # 187ae80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37568>
     14d1c30:	49 89 06             	mov    QWORD PTR [r14],rax
     14d1c33:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp
     14d1c37:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
     14d1c3b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14d1c3e:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d1c45:	00 
     14d1c46:	4c 89 f2             	mov    rdx,r14
     14d1c49:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d1c4c:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d1c53:	00 
     14d1c54:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     14d1c5b:	00 
```

#### provider call `0x14d1caf`
```text
     14d1c8e:	48 89 6b 08          	mov    QWORD PTR [rbx+0x8],rbp
     14d1c92:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     14d1c96:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14d1c99:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d1ca0:	00 
     14d1ca1:	48 89 da             	mov    rdx,rbx
     14d1ca4:	4d 89 fe             	mov    r14,r15
     14d1ca7:	4c 8b bc 24 08 01 00 	mov    r15,QWORD PTR [rsp+0x108]
     14d1cae:	00 
     14d1caf:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d1cb2:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     14d1cb7:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d1cbe:	00 
     14d1cbf:	4c 89 ff             	mov    rdi,r15
```

#### provider call `0x14d2a30`
```text
     14d2a13:	41 59                	pop    r9
     14d2a15:	4c 89 f7             	mov    rdi,r14
     14d2a18:	31 d2                	xor    edx,edx
     14d2a1a:	e8 75 7d 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     14d2a1f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14d2a22:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14d2a29:	00 
     14d2a2a:	48 89 de             	mov    rsi,rbx
     14d2a2d:	4c 89 f2             	mov    rdx,r14
     14d2a30:	ff 50 28             	call   QWORD PTR [rax+0x28]
     14d2a33:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
     14d2a3a:	00 
     14d2a3b:	48 8b bc 24 30 01 00 	mov    rdi,QWORD PTR [rsp+0x130]
     14d2a42:	00 
```

## Next interpretation
- If direct writes to `[rsp+0x310]` appear above, those are the immediate source candidates for `RestrictionsSetupImpl` `bundle+0x30`.
- If only helper calls receive `bundle_base`, the next trace should inspect the helper body that writes into `[bundle_base+0x30]`.
- If `bundle+0x30` is only read, the source was initialized earlier or copied through another stack alias before this FDE window.
