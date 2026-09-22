# Shared setup dependency bundle +0x30 classification

This report treats the provider factory third argument (rdx) as one shared setup-dependency bundle and cross-correlates only factories that actually dereference bundle +0x30.

Providers parsed: 198
Providers consuming bundle+0x30: 83

## GreenbaseSetupImpl
- descriptor AP: 0x181eb50
- factory: 0xcb3f5e; FDE=0xcb3f5e..0xcb4254
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xcb3f85: mov    rbx,QWORD PTR [rdx+0x30]
  - loaded target register: rbx
  - target-derived uses:
    - 0xcb3fca: mov    rdi,QWORD PTR [rbx]
    - 0xcb3ff7: mov    rdi,QWORD PTR [rbx]
    - 0xcb4049: mov    QWORD PTR [rbx+0x10],rax
  - nearby literal/AP materializations:
    - 0xcb3fb4: lea    rcx,[rip+0xb6abd5]        # 181eb90 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14850>
    - 0xcb3fcd: lea    r13,[rip+0xffffffffff7190ec]        # 3cd0c0 <_ZTSN5boost9exceptionE@@Base+0x2daa2>
    - 0xcb3fd4: lea    rbp,[rip+0xffffffffff7190f5]        # 3cd0d0 <_ZTSN5boost9exceptionE@@Base+0x2dab2>
    - 0xcb4010: lea    rsi,[rip+0xffffffffff79df65]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>

## MediaParsersSetupImpl
- descriptor AP: 0x1824658
- factory: 0xd413a0; FDE=0xd413a0..0xd414f4
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xd413c1: mov    rbx,QWORD PTR [rdx+0x30]
  - loaded target register: rbx
  - target-derived uses:
    - 0xd413f6: mov    rdi,QWORD PTR [rbx]
    - 0xd4144a: mov    rdi,QWORD PTR [rbx]
  - nearby literal/AP materializations:
    - 0xd413d6: lea    rax,[rip+0xae32bb]        # 1824698 <_ZTIN4asio2ip16bad_address_castE@@Base+0xcc8>
    - 0xd413f9: lea    rsi,[rip+0xffffffffff68de10]        # 3cf210 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x64>
    - 0xd41400: lea    rcx,[rip+0xffffffffff68de29]        # 3cf230 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x84>
    - 0xd4141b: lea    rax,[rip+0xae32c6]        # 18246e8 <_ZTIN4asio2ip16bad_address_castE@@Base+0xd18>
    - 0xd4144d: lea    rsi,[rip+0xffffffffff68de0c]        # 3cf260 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0xb4>
    - 0xd41454: lea    rcx,[rip+0xffffffffff68de25]        # 3cf280 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0xd4>

## StorageSetupImpl
- descriptor AP: 0x181a908
- factory: 0xc6c08a; FDE=0xc6c08a..0xc6e081
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xc6c13c: mov    r13,QWORD PTR [rbx+0x30]
  - loaded target register: r13
  - target-derived uses:
    - 0xc6c18a: mov    rdi,QWORD PTR [r13+0x0]
    - 0xc6c1c4: mov    rdi,QWORD PTR [r13+0x0]
    - 0xc6c1ed: mov    rdi,QWORD PTR [r13+0x0]
    - 0xc6c216: mov    rdi,QWORD PTR [r13+0x0]
    - 0xc6c23f: mov    rdi,QWORD PTR [r13+0x0]
  - nearby literal/AP materializations:
    - 0xc6c14f: lea    rax,[rip+0xbae7f2]        # 181a948 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10608>
    - 0xc6c1a1: lea    rsi,[rip+0xffffffffff75faa7]        # 3cbc4f <_ZTSN5boost9exceptionE@@Base+0x2c631>
    - 0xc6c1a8: lea    rcx,[rip+0xffffffffff75faad]        # 3cbc5c <_ZTSN5boost9exceptionE@@Base+0x2c63e>
    - 0xc6c1c8: lea    rsi,[rip+0xffffffffff75fa9a]        # 3cbc69 <_ZTSN5boost9exceptionE@@Base+0x2c64b>
    - 0xc6c1cf: lea    rcx,[rip+0xffffffffff75faaa]        # 3cbc80 <_ZTSN5boost9exceptionE@@Base+0x2c662>

## ImageResolveSetupImpl
- descriptor AP: 0x18187d8
- factory: 0xc4520a; FDE=0xc4520a..0xc45864
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xc4525d: mov    r12,QWORD PTR [rbx+0x30]
  - loaded target register: r12
  - target-derived uses:
    - 0xc45331: mov    rdi,QWORD PTR [r12]
    - 0xc4535c: mov    rdi,QWORD PTR [rbx]
  - nearby literal/AP materializations:
    - 0xc45238: lea    rsi,[rip+0xffffffffff6f9936]        # 33eb75 <_ZTSSt12bad_any_cast@@Base-0x51653>
    - 0xc4528a: lea    rax,[rip+0xbd3587]        # 1818818 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe4d8>
    - 0xc452ce: lea    rdi,[rip+0xd94e0b]        # 19da0e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa2d28>
    - 0xc452f6: lea    rax,[rip+0xffffffffff80c91b]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
    - 0xc45314: lea    rdx,[rip+0xffffffffff73dc49]        # 382f64 <_ZTSSt12bad_any_cast@@Base-0xd264>

## DownloadSetupImpl
- descriptor AP: 0x181bc98
- factory: 0xc804b6; FDE=0xc804b6..0xc819dc
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xc8058c: mov    rbp,QWORD PTR [rbx+0x30]
  - loaded target register: rbp
  - target-derived uses:
    - 0xc8066f: mov    r14,QWORD PTR [rbp+0x0]
  - nearby literal/AP materializations:
    - 0xc805a5: lea    rax,[rip+0xb9b72c]        # 181bcd8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11998>
    - 0xc8061b: lea    rdi,[rip+0xd59abe]        # 19da0e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa2d28>
    - 0xc80634: lea    rax,[rip+0xffffffffff7d15dd]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
    - 0xc80652: lea    rdx,[rip+0xffffffffff70290b]        # 382f64 <_ZTSSt12bad_any_cast@@Base-0xd264>

## BitrateSetupImpl
- descriptor AP: 0x18184d0
- factory: 0xc42eec; FDE=0xc42eec..0xc43b7d
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xc42f8a: mov    rax,QWORD PTR [rbx+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0xc42fa8: mov    BYTE PTR [rax+0x8],0x0
    - 0xc42fb3: mov    QWORD PTR [rbx],rax
    - 0xc42fb6: lea    rax,[rbx+0x10]
    - 0xc42fbf: lea    rax,[rbx+0x18]
    - 0xc42fc8: lea    rax,[rbx+0x20]
    - 0xc42fd4: lea    rax,[rbx+0x28]
    - 0xc42fdd: lea    rdi,[rbx+0x30]
    - 0xc42fe4: movaps XMMWORD PTR [rbx+0x10],xmm0
    - 0xc42fe8: movaps XMMWORD PTR [rbx+0x20],xmm0
    - 0xc42ff6: lea    rax,[rbx+0x40]
    - 0xc42fff: and    QWORD PTR [rbx+0x40],0x0
    - 0xc43004: lea    rax,[rbx+0x50]
    - 0xc4300d: and    QWORD PTR [rbx+0x70],0x0
    - 0xc43012: lea    rax,[rbx+0x80]
    - 0xc4301e: and    QWORD PTR [rbx+0xa0],0x0
    - 0xc43026: lea    rax,[rbx+0xb0]
    - 0xc43032: and    QWORD PTR [rbx+0xd0],0x0
    - 0xc4303a: lea    rax,[rbx+0xe0]
    - 0xc43046: lea    rax,[rbx+0xe8]
    - 0xc4305c: and    QWORD PTR [rbx+0x110],0x0
  - nearby literal/AP materializations:
    - 0xc42fac: lea    rax,[rip+0xbd555d]        # 1818510 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe1d0>
- bundle+0x30 load/ref @ 0xc42fdd: lea    rdi,[rbx+0x30]
  - nearby literal/AP materializations:
    - 0xc42fac: lea    rax,[rip+0xbd555d]        # 1818510 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe1d0>
    - 0xc4306e: lea    rdi,[rip+0xd9706b]        # 19da0e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa2d28>
    - 0xc4308c: lea    rax,[rip+0xffffffffff80eb85]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
    - 0xc430aa: lea    rdx,[rip+0xffffffffff73feb3]        # 382f64 <_ZTSSt12bad_any_cast@@Base-0xd264>

## SettingsReporterSetupImpl
- descriptor AP: 0x181a7d0
- factory: 0xc6b19e; FDE=0xc6b19e..0xc6b592
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xc6b1e3: mov    r15,QWORD PTR [rbx+0x30]
  - loaded target register: r15
  - target-derived uses:
    - 0xc6b272: mov    rsi,QWORD PTR [r15]
    - 0xc6b29d: mov    QWORD PTR [r15],rax
    - 0xc6b2a0: lea    r13,[r15+0x18]
    - 0xc6b2a9: mov    QWORD PTR [r15+0x18],rax
    - 0xc6b2ad: mov    QWORD PTR [r15+0x20],r12
    - 0xc6b2b1: mov    QWORD PTR [r15+0x28],r14
    - 0xc6b2b5: mov    QWORD PTR [r15+0x30],rbp
    - 0xc6b2b9: mov    QWORD PTR [r15+0x38],rbx
    - 0xc6b2bf: mov    BYTE PTR [r15+0x40],al
    - 0xc6b2c3: mov    BYTE PTR [r15+0x88],al
    - 0xc6b2ca: mov    BYTE PTR [r15+0x90],al
    - 0xc6b2d1: mov    BYTE PTR [r15+0xd0],al
    - 0xc6b2d8: lea    rbx,[r15+0xd8]
    - 0xc6b2df: movups XMMWORD PTR [r15+0xd8],xmm0
    - 0xc6b2e7: lea    rdi,[r15+0xe8]
    - 0xc6b2f8: lea    rdi,[r15+0xf8]
    - 0xc6b309: mov    rsi,QWORD PTR [r15+0x20]
  - nearby literal/AP materializations:
    - 0xc6b20e: lea    rcx,[rip+0xbaf5fb]        # 181a810 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x104d0>
    - 0xc6b224: lea    rdi,[rip+0xd6eeb5]        # 19da0e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa2d28>
    - 0xc6b238: lea    rax,[rip+0xffffffffff7e69d9]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
    - 0xc6b253: lea    rdx,[rip+0xffffffffff717d0a]        # 382f64 <_ZTSSt12bad_any_cast@@Base-0xd264>
    - 0xc6b296: lea    rax,[rip+0xbaf5f3]        # 181a890 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10550>

## AnalyticsSetupImpl
- descriptor AP: 0x180e208
- factory: 0xb8b422; FDE=0xb8b422..0xb8d4f5
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xb8b7f7: lea    rdi,[rbx+0x30]

## MdataSetupImpl
- descriptor AP: 0x181b8b8
- factory: 0xc7db44; FDE=0xc7db44..0xc7dd6f
- early aliases of rdx: r15, rdx
- bundle+0x30 load/ref @ 0xc7dbb7: mov    r12,QWORD PTR [r15+0x30]
  - loaded target register: r12
  - target-derived uses:
    - 0xc7dc61: mov    QWORD PTR [r12],rax
    - 0xc7dc65: mov    QWORD PTR [r12+0x8],rbx
    - 0xc7dc8f: movups XMMWORD PTR [r12+0x28],xmm0
  - nearby literal/AP materializations:
    - 0xc7db7f: lea    rsi,[rip+0xffffffffff6e4e3e]        # 3629c4 <_ZTSSt12bad_any_cast@@Base-0x2d804>
    - 0xc7dc3e: lea    rax,[rip+0xb9dcb3]        # 181b8f8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x115b8>
    - 0xc7dc5a: lea    rax,[rip+0xb9dcff]        # 181b960 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11620>

## MetadataSetupImpl
- descriptor AP: 0x1825060
- factory: 0xd498ce; FDE=0xd498ce..0xd4aa39
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xd4993d: mov    r12,QWORD PTR [rbx+0x30]
  - loaded target register: r12
  - target-derived uses:
    - 0xd499a9: mov    rdi,QWORD PTR [r12]
    - 0xd499d1: mov    rdi,QWORD PTR [r12]
    - 0xd499f5: mov    rdi,QWORD PTR [r12]
    - 0xd49a16: mov    rdi,QWORD PTR [r12]
    - 0xd49a37: mov    rdi,QWORD PTR [r12]
  - nearby literal/AP materializations:
    - 0xd49955: lea    rcx,[rip+0xadb744]        # 18250a0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x16d0>
    - 0xd499ad: lea    rsi,[rip+0xffffffffff685cbc]        # 3cf670 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x4c4>
    - 0xd499b4: lea    rcx,[rip+0xffffffffff685cd5]        # 3cf690 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x4e4>
    - 0xd499d5: lea    rsi,[rip+0xffffffffff685cd4]        # 3cf6b0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x504>
    - 0xd499dc: lea    r15,[rip+0xffffffffff685ced]        # 3cf6d0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x524>
- bundle+0x30 load/ref @ 0xd49fbf: mov    BYTE PTR [rbx+0x30],0x0
- bundle+0x30 load/ref @ 0xd4a3f5: lea    r15,[rbx+0x30]
  - nearby literal/AP materializations:
    - 0xd4a3c8: lea    rax,[rip+0xb45f89]        # 1890358 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9030>
    - 0xd4a3d2: lea    rax,[rip+0xb45fcf]        # 18903a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9080>

## LocalFilesSetupImpl
- descriptor AP: 0x1821f80
- factory: 0xd077d6; FDE=0xd077d6..0xd090fa
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0xd07829: mov    rbp,QWORD PTR [r14+0x30]
  - loaded target register: rbp
  - nearby literal/AP materializations:
    - 0xd078aa: lea    rax,[rip+0xb1a70f]        # 1821fc0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17c80>
- bundle+0x30 load/ref @ 0xd0806e: and    QWORD PTR [r14+0x30],0x0

## LocalSyncSetupImpl
- descriptor AP: 0x18232d0
- factory: 0xd2c68e; FDE=0xd2c68e..0xd2d691
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xd2c710: mov    r13,QWORD PTR [rbx+0x30]
  - loaded target register: r13
  - target-derived uses:
    - 0xd2c7c3: mov    rdi,QWORD PTR [r13+0x0]
    - 0xd2c7fb: mov    rdi,QWORD PTR [r13+0x0]
  - nearby literal/AP materializations:
    - 0xd2c727: lea    rsi,[rip+0xffffffffff605408]        # 331b36 <_ZTSSt12bad_any_cast@@Base-0x5e692>
    - 0xd2c787: lea    rax,[rip+0xaf6b82]        # 1823310 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18fd0>
    - 0xd2c7c7: lea    rsi,[rip+0xffffffffff6a2902]        # 3cf0d0 <_ZTSN5boost9exceptionE@@Base+0x2fab2>

## ImageSetupImpl
- descriptor AP: 0x18188e8
- factory: 0xc45d3a; FDE=0xc45d3a..0xc466f7
- early aliases of rdx: r15, rdx
- bundle+0x30 load/ref @ 0xc45ddd: mov    rbp,QWORD PTR [r15+0x30]
  - loaded target register: rbp
  - target-derived uses:
    - 0xc45ec9: mov    rdi,QWORD PTR [rbp+0x0]
    - 0xc45eee: mov    rdi,QWORD PTR [rbp+0x0]
  - nearby literal/AP materializations:
    - 0xc45dae: lea    rsi,[rip+0xffffffffff726e0a]        # 36cbbf <_ZTSSt12bad_any_cast@@Base-0x23609>
    - 0xc45e15: lea    rax,[rip+0xbd2b0c]        # 1818928 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe5e8>
    - 0xc45e70: lea    rdi,[rip+0xd94269]        # 19da0e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa2d28>
    - 0xc45e89: lea    rax,[rip+0xffffffffff80bd88]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
- bundle+0x30 load/ref @ 0xc462e4: lea    r12,[r15+0x30]
  - nearby literal/AP materializations:
    - 0xc462d1: lea    rax,[rip+0xbd2d70]        # 1819048 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xed08>
    - 0xc46316: lea    rsi,[rip+0xffffffffff72cef6]        # 373213 <_ZTSSt12bad_any_cast@@Base-0x1cfb5>
    - 0xc4632a: lea    rsi,[rip+0xffffffffff73fe66]        # 386197 <_ZTSSt12bad_any_cast@@Base-0xa031>
- bundle+0x30 load/ref @ 0xc462e8: mov    QWORD PTR [r15+0x30],rbp
  - nearby literal/AP materializations:
    - 0xc462d1: lea    rax,[rip+0xbd2d70]        # 1819048 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xed08>
    - 0xc46316: lea    rsi,[rip+0xffffffffff72cef6]        # 373213 <_ZTSSt12bad_any_cast@@Base-0x1cfb5>
    - 0xc4632a: lea    rsi,[rip+0xffffffffff73fe66]        # 386197 <_ZTSSt12bad_any_cast@@Base-0xa031>
    - 0xc46391: lea    rsi,[rip+0xffffffffff743ad2]        # 389e6a <_ZTSSt12bad_any_cast@@Base-0x635e>

## OfflineSetupImpl
- descriptor AP: 0x1825310
- factory: 0xd4bfb8; FDE=0xd4bfb8..0xd4c529
- early aliases of rdx: r13, rdx
- bundle+0x30 load/ref @ 0xd4c119: mov    rax,QWORD PTR [r13+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0xd4c135: call   QWORD PTR [rax+0x10]
    - 0xd4c138: mov    rcx,QWORD PTR [rax]
    - 0xd4c13e: call   QWORD PTR [rcx+0x28]
    - 0xd4c169: call   QWORD PTR [rax+0x28]
    - 0xd4c175: call   QWORD PTR [rax+0x30]
    - 0xd4c178: mov    rcx,QWORD PTR [rax]
    - 0xd4c17e: call   QWORD PTR [rcx+0x178]

## DownloadEsperantoSetup
- descriptor AP: 0x181bc58
- factory: 0xc80358; FDE=0xc80358..0xc8049a
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0xc80427: push   QWORD PTR [r14+0x30]

## ListPlayerConfigImpl
- descriptor AP: 0x1874f70
- factory: 0x146f232; FDE=0x146f232..0x14708fa
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0x146f25f: mov    rax,QWORD PTR [rdx+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x146f263: mov    rdi,QWORD PTR [rax]
    - 0x146f290: mov    eax,DWORD PTR [rax+0x2a4]
    - 0x146f2a7: mov    BYTE PTR [rax+0x8],bpl
    - 0x146f2b2: mov    QWORD PTR [r14],rax
    - 0x146f2b5: mov    DWORD PTR [r14+0x10],0x1000000
    - 0x146f2bd: mov    BYTE PTR [r14+0x14],bpl
    - 0x146f2cb: mov    QWORD PTR [r14+0x18],rax
    - 0x146f2cf: mov    QWORD PTR [r14+0x20],0xc8
    - 0x146f2dc: mov    QWORD PTR [r14+0x28],rax
    - 0x146f2e0: mov    QWORD PTR [r14+0x30],rax
    - 0x146f2e4: mov    QWORD PTR [r14+0x38],rax
    - 0x146f2e8: mov    QWORD PTR [r14+0x40],rax
    - 0x146f2ef: movups XMMWORD PTR [r14+0x48],xmm0
    - 0x146f2f4: and    QWORD PTR [r14+0x78],0x0
    - 0x146f2f9: movups XMMWORD PTR [r14+0x58],xmm0
    - 0x146f2fe: movups XMMWORD PTR [r14+0x68],xmm0
    - 0x146f306: mov    QWORD PTR [r14+0x80],rax
    - 0x146f30d: and    WORD PTR [r14+0x88],0x0
    - 0x146f316: mov    QWORD PTR [r14+0x90],0x1388
    - 0x146f321: mov    BYTE PTR [r14+0x9c],bpl
  - nearby literal/AP materializations:
    - 0x146f266: lea    rsi,[rip+0xfffffffffefc6b13]        # 435d80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b7cf>
    - 0x146f26d: lea    rcx,[rip+0xfffffffffefc6b20]        # 435d94 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b7e3>
    - 0x146f2ab: lea    rax,[rip+0x39ef1e]        # 180e1d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e90>
- bundle+0x30 load/ref @ 0x146f28c: mov    r13,QWORD PTR [rbx+0x30]
  - loaded target register: r13
  - nearby literal/AP materializations:
    - 0x146f266: lea    rsi,[rip+0xfffffffffefc6b13]        # 435d80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b7cf>
    - 0x146f26d: lea    rcx,[rip+0xfffffffffefc6b20]        # 435d94 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b7e3>
    - 0x146f2ab: lea    rax,[rip+0x39ef1e]        # 180e1d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e90>

## PlaylistSetupImpl
- descriptor AP: 0x1849770
- factory: 0x1079e90; FDE=0x1079e90..0x107a02b
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0x1079f1d: mov    rbp,QWORD PTR [r14+0x30]
  - loaded target register: rbp

## ScrobbleSetupImpl
- descriptor AP: 0x1850a58
- factory: 0x10fe09e; FDE=0x10fe09e..0x10fe389
- early aliases of rdx: r15, rdx
- bundle+0x30 load/ref @ 0x10fe0d4: mov    rbp,QWORD PTR [rdx+0x30]
  - loaded target register: rbp
  - target-derived uses:
    - 0x10fe15c: mov    rdi,QWORD PTR [rbp+0x0]
  - nearby literal/AP materializations:
    - 0x10fe0f7: lea    rax,[rip+0x75299a]        # 1850a98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd180>
    - 0x10fe10e: lea    rax,[rip+0x77f453]        # 187d568 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x39c50>
    - 0x10fe160: lea    rsi,[rip+0xffffffffff2da79a]        # 3d8901 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34e6>
    - 0x10fe167: lea    rcx,[rip+0xffffffffff2da7a2]        # 3d8910 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34f5>

## PrefetchSetupImpl
- descriptor AP: 0x18197c0
- factory: 0xc53694; FDE=0xc53694..0xc53849
- early aliases of rdx: rbp, rdx
- bundle+0x30 load/ref @ 0xc5376e: mov    rbx,QWORD PTR [rbp+0x30]
  - loaded target register: rbx
  - nearby literal/AP materializations:
    - 0xc5377d: lea    rax,[rip+0xbd1bcc]        # 1825350 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1980>
    - 0xc5378c: lea    rax,[rip+0x15ab25]        # dae2b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7b33e>

## KaraokeSetupImpl
- descriptor AP: 0x1821318
- factory: 0xcf7acc; FDE=0xcf7acc..0xcf7db4
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xcf7cb0: mov    WORD PTR [rdx+0x30],0x1
  - nearby literal/AP materializations:
    - 0xcf7c81: lea    rsi,[rip+0xffffffffff6d7242]        # 3ceeca <_ZTSN5boost9exceptionE@@Base+0x2f8ac>
    - 0xcf7c88: lea    rcx,[rip+0xffffffffff6d7251]        # 3ceee0 <_ZTSN5boost9exceptionE@@Base+0x2f8c2>

## PlaybackSetupImpl
- descriptor AP: 0x18120d0
- factory: 0xbcf44a; FDE=0xbcf44a..0xbcfc9d
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xbcf48d: mov    rbx,QWORD PTR [rdx+0x30]
  - loaded target register: rbx
  - target-derived uses:
    - 0xbcf505: mov    rdi,QWORD PTR [rbx]
  - nearby literal/AP materializations:
    - 0xbcf4b0: lea    rax,[rip+0xc42c59]        # 1812110 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7dd0>
    - 0xbcf508: lea    rsi,[rip+0xffffffffff7df161]        # 3ae670 <_ZTSN5boost9exceptionE@@Base+0xf052>
    - 0xbcf50f: lea    rcx,[rip+0xffffffffff7df17a]        # 3ae690 <_ZTSN5boost9exceptionE@@Base+0xf072>
    - 0xbcf52e: lea    rsi,[rip+0xffffffffff869d2b]        # 439260 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ecaf>

## EqualizerSetupImpl
- descriptor AP: 0x1811900
- factory: 0xbc736c; FDE=0xbc736c..0xbc75d9
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0xbc73b3: mov    rbx,QWORD PTR [r14+0x30]
  - loaded target register: rbx
  - target-derived uses:
    - 0xbc73ec: mov    rdi,QWORD PTR [rbx]
    - 0xbc7419: mov    rdi,QWORD PTR [rbx]
    - 0xbc7434: mov    rdi,QWORD PTR [rbx]
    - 0xbc7460: mov    rdi,QWORD PTR [rbx]
    - 0xbc748a: mov    rdi,QWORD PTR [rbx]
    - 0xbc74a9: mov    rdi,QWORD PTR [rbx]
  - nearby literal/AP materializations:
    - 0xbc73cf: lea    rcx,[rip+0xc471d2]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
    - 0xbc73ef: lea    r15,[rip+0xffffffffff7e706a]        # 3ae460 <_ZTSN5boost9exceptionE@@Base+0xee42>
    - 0xbc73f6: lea    r13,[rip+0xffffffffff7e7083]        # 3ae480 <_ZTSN5boost9exceptionE@@Base+0xee62>
    - 0xbc7437: lea    rbp,[rip+0xffffffffff7e7062]        # 3ae4a0 <_ZTSN5boost9exceptionE@@Base+0xee82>
    - 0xbc743e: lea    rcx,[rip+0xffffffffff7e707b]        # 3ae4c0 <_ZTSN5boost9exceptionE@@Base+0xeea2>
- bundle+0x30 load/ref @ 0xbc7538: mov    WORD PTR [rdx+0x30],0x101

## ParametricEqSetupImpl
- descriptor AP: 0x1811db0
- factory: 0xbcdc32; FDE=0xbcdc32..0xbcdd78
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xbcdceb: mov    WORD PTR [rdx+0x30],0x101
  - nearby literal/AP materializations:
    - 0xbcdca5: lea    rax,[rip+0xc4417c]        # 1811e28 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7ae8>

## CrossfeedSetupImpl
- descriptor AP: 0x180e568
- factory: 0xb9135a; FDE=0xb9135a..0xb9150c
- early aliases of rdx: r15, rdx
- bundle+0x30 load/ref @ 0xb91397: mov    rbx,QWORD PTR [r15+0x30]
  - loaded target register: rbx
  - target-derived uses:
    - 0xb913cf: mov    rdi,QWORD PTR [rbx]
    - 0xb913f9: mov    rdi,QWORD PTR [rbx]
  - nearby literal/AP materializations:
    - 0xb913b3: lea    rcx,[rip+0xc7d1ee]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
    - 0xb913d2: lea    rbp,[rip+0xffffffffff80ec37]        # 3a0010 <_ZTSN5boost9exceptionE@@Base+0x9f2>
    - 0xb913d9: lea    rcx,[rip+0xffffffffff80ec50]        # 3a0030 <_ZTSN5boost9exceptionE@@Base+0xa12>
    - 0xb91402: lea    rcx,[rip+0xffffffffff80ec27]        # 3a0030 <_ZTSN5boost9exceptionE@@Base+0xa12>
    - 0xb9143e: lea    rax,[rip+0xc7d19b]        # 180e5e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x42a0>
- bundle+0x30 load/ref @ 0xb91476: mov    WORD PTR [rdx+0x30],0x101
  - nearby literal/AP materializations:
    - 0xb9143e: lea    rax,[rip+0xc7d19b]        # 180e5e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x42a0>

## DownmixerSetupImpl
- descriptor AP: 0x180e730
- factory: 0xb91e52; FDE=0xb91e52..0xb91f79
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xb91ef4: mov    WORD PTR [rdx+0x30],0x101
  - nearby literal/AP materializations:
    - 0xb91ecf: lea    rcx,[rip+0xc7c89a]        # 180e770 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4430>

## AnalyzerSetupImpl
- descriptor AP: 0x181b5c0
- factory: 0xc7c8e6; FDE=0xc7c8e6..0xc7cb3c
- early aliases of rdx: r12, rdx
- bundle+0x30 load/ref @ 0xc7c927: mov    rbp,QWORD PTR [r12+0x30]
  - loaded target register: rbp
  - target-derived uses:
    - 0xc7c9df: mov    rdi,QWORD PTR [rbp+0x0]
    - 0xc7ca0b: mov    rdi,QWORD PTR [rbp+0x0]
  - nearby literal/AP materializations:
    - 0xc7c935: lea    rax,[rip+0xffffffffffdffb28]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
    - 0xc7c941: lea    rax,[rip+0x21e]        # c7cb66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c9b06>
    - 0xc7c973: lea    rax,[rip+0xb9f18e]        # 181bb08 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x117c8>
    - 0xc7c9e3: lea    rsi,[rip+0xffffffffff74f6b6]        # 3cc0a0 <_ZTSN5boost9exceptionE@@Base+0x2ca82>
- bundle+0x30 load/ref @ 0xc7ca5a: mov    WORD PTR [rdx+0x30],0x1
  - nearby literal/AP materializations:
    - 0xc7ca19: lea    rcx,[rip+0xffffffffff74f690]        # 3cc0b0 <_ZTSN5boost9exceptionE@@Base+0x2ca92>
    - 0xc7ca2f: lea    rdx,[rip+0xb9f10a]        # 181bb40 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11800>

## TimeStretcherSetupImpl
- descriptor AP: 0x1813450
- factory: 0xbf5a30; FDE=0xbf5a30..0xbf5bd6
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xbf5aeb: mov    WORD PTR [rdx+0x30],0x1
  - nearby literal/AP materializations:
    - 0xbf5aac: lea    rcx,[rip+0xc1d9dd]        # 1813490 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9150>
    - 0xbf5b46: lea    rsi,[rip+0xffffffffff77a3d1]        # 36ff1e <_ZTSSt12bad_any_cast@@Base-0x202aa>
    - 0xbf5b61: lea    rax,[rip+0xffffffffff85c414]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
    - 0xbf5b6c: lea    rax,[rip+0xffffffffff77cee0]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>

## TimeStretcherAdvancedSetupImpl
- descriptor AP: 0x1812a40
- factory: 0xbd8d18; FDE=0xbd8d18..0xbd924b
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xbd8d4b: mov    rax,QWORD PTR [rbx+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0xbd8d63: mov    BYTE PTR [rax+0x8],0x0
    - 0xbd8d6e: mov    QWORD PTR [rax],rcx
    - 0xbd8d71: and    QWORD PTR [rax+0x30],0x0
    - 0xbd8d8b: call   QWORD PTR [rax+0x28]
    - 0xbd8d8e: cmp    QWORD PTR [rax+0x40],0x0
    - 0xbd8d9e: mov    r15,QWORD PTR [rax]
    - 0xbd8e49: mov    rsi,QWORD PTR [rax]
  - nearby literal/AP materializations:
    - 0xbd8d67: lea    rcx,[rip+0xc3583a]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
    - 0xbd8da1: lea    rsi,[rip+0xffffffffff783130]        # 35bed8 <_ZTSSt12bad_any_cast@@Base-0x342f0>
    - 0xbd8db7: lea    rsi,[rip+0xffffffffff7ee058]        # 3c6e16 <_ZTSN5boost9exceptionE@@Base+0x277f8>
    - 0xbd8e01: lea    r14,[rip+0xffffffffff7edfc8]        # 3c6dd0 <_ZTSN5boost9exceptionE@@Base+0x277b2>
    - 0xbd8e08: lea    rbx,[rip+0xffffffffff7edff1]        # 3c6e00 <_ZTSN5boost9exceptionE@@Base+0x277e2>
- bundle+0x30 load/ref @ 0xbd90df: mov    WORD PTR [rdx+0x30],0x101
  - nearby literal/AP materializations:
    - 0xbd90a4: lea    rax,[rip+0xc399d5]        # 1812a80 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x8740>
    - 0xbd914f: lea    rsi,[rip+0xffffffffff76ff80]        # 3490d6 <_ZTSSt12bad_any_cast@@Base-0x470f2>
    - 0xbd916a: lea    rax,[rip+0xffffffffff878e0b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
    - 0xbd9175: lea    rax,[rip+0xffffffffff7998d7]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>

## TimeStretcherChipmunkSetupImpl
- descriptor AP: 0x18132d0
- factory: 0xbf4a6a; FDE=0xbf4a6a..0xbf4bed
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xbf4b60: mov    WORD PTR [rdx+0x30],0x1
  - nearby literal/AP materializations:
    - 0xbf4b20: lea    rcx,[rip+0xc1e7e9]        # 1813310 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x8fd0>

## NormalizerSetupImpl
- descriptor AP: 0x1811a80
- factory: 0xbc7e9e; FDE=0xbc7e9e..0xbc7fc5
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xbc7f40: mov    WORD PTR [rdx+0x30],0x1
  - nearby literal/AP materializations:
    - 0xbc7f1b: lea    rcx,[rip+0xc49b9e]        # 1811ac0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7780>

## ResamplerSetupImpl
- descriptor AP: 0x1812800
- factory: 0xbd7146; FDE=0xbd7146..0xbd75c3
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xbd716d: mov    rbx,QWORD PTR [rdx+0x30]
  - loaded target register: rbx
  - target-derived uses:
    - 0xbd71a1: mov    rdi,QWORD PTR [rbx]
    - 0xbd71c9: mov    rdi,QWORD PTR [rbx]
    - 0xbd71e8: mov    rbp,QWORD PTR [rbx]
  - nearby literal/AP materializations:
    - 0xbd7184: lea    rcx,[rip+0xc3741d]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
    - 0xbd71a4: lea    r12,[rip+0xffffffffff7d7625]        # 3ae7d0 <_ZTSN5boost9exceptionE@@Base+0xf1b2>
    - 0xbd71ab: lea    r13,[rip+0xffffffffff7d763e]        # 3ae7f0 <_ZTSN5boost9exceptionE@@Base+0xf1d2>
    - 0xbd71eb: lea    rsi,[rip+0xffffffffff76ea02]        # 345bf4 <_ZTSSt12bad_any_cast@@Base-0x4a5d4>
    - 0xbd7201: lea    rsi,[rip+0xffffffffff852381]        # 429589 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x4efd8>
- bundle+0x30 load/ref @ 0xbd74b7: mov    WORD PTR [rdx+0x30],0x101
  - nearby literal/AP materializations:
    - 0xbd747b: lea    rax,[rip+0xc3b3be]        # 1812840 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x8500>

## OtfnSetupImpl
- descriptor AP: 0x1811c28
- factory: 0xbc8848; FDE=0xbc8848..0xbc8d86
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0xbc8889: mov    r15,QWORD PTR [r14+0x30]
  - loaded target register: r15
  - target-derived uses:
    - 0xbc88f6: mov    rdi,QWORD PTR [r15]
    - 0xbc8919: mov    rdi,QWORD PTR [r15]
    - 0xbc894a: mov    rdi,QWORD PTR [r15]
    - 0xbc8979: mov    rdi,QWORD PTR [r15]
  - nearby literal/AP materializations:
    - 0xbc88a0: lea    rcx,[rip+0xc45d01]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
    - 0xbc88f9: lea    rsi,[rip+0xffffffffff7e5c20]        # 3ae520 <_ZTSN5boost9exceptionE@@Base+0xef02>
    - 0xbc8900: lea    rcx,[rip+0xffffffffff7e5c2b]        # 3ae532 <_ZTSN5boost9exceptionE@@Base+0xef14>
    - 0xbc891c: lea    rsi,[rip+0xffffffffff7e5c1d]        # 3ae540 <_ZTSN5boost9exceptionE@@Base+0xef22>
    - 0xbc8923: lea    rcx,[rip+0xffffffffff7e5c28]        # 3ae552 <_ZTSN5boost9exceptionE@@Base+0xef34>
- bundle+0x30 load/ref @ 0xbc8c25: mov    WORD PTR [rdx+0x30],0x101
  - nearby literal/AP materializations:
    - 0xbc8c92: lea    rsi,[rip+0xffffffffff7ada32]        # 3766cb <_ZTSSt12bad_any_cast@@Base-0x19afd>
    - 0xbc8cad: lea    rax,[rip+0xffffffffff8892c8]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
    - 0xbc8cb8: lea    rax,[rip+0xffffffffff7a9d94]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>

## PeakLimiterSetupImpl
- descriptor AP: 0x186a678
- factory: 0x13a5df2; FDE=0x13a5df2..0x13a5ff1
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0x13a5e31: mov    r15,QWORD PTR [r14+0x30]
  - loaded target register: r15
  - target-derived uses:
    - 0x13a5e81: mov    rdi,QWORD PTR [r15]
  - nearby literal/AP materializations:
    - 0x13a5e52: lea    rax,[rip+0x4c485f]        # 186a6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26da0>
    - 0x13a5e84: lea    rsi,[rip+0xffffffffff038565]        # 3de3f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3e3f>
    - 0x13a5e8b: lea    rcx,[rip+0xffffffffff03857e]        # 3de410 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3e5f>
    - 0x13a5eae: lea    rcx,[rip+0x4c483b]        # 186a6f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26dd8>
    - 0x13a5ee0: lea    rax,[rip+0x4c4889]        # 186a770 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26e58>
- bundle+0x30 load/ref @ 0x13a5f4f: mov    WORD PTR [rdx+0x30],0x1
  - nearby literal/AP materializations:
    - 0x13a5f14: lea    rcx,[rip+0x4c489d]        # 186a7b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26ea0>

## PendingEventsAuthScopeSetupImpl
- descriptor AP: 0x1871108
- factory: 0x1438464; FDE=0x1438464..0x14385de
- early aliases of rdx: r12, rdx
- bundle+0x30 load/ref @ 0x1438495: mov    rbp,QWORD PTR [r12+0x30]
  - loaded target register: rbp
  - target-derived uses:
    - 0x1438509: call   QWORD PTR [rax+0x40]
  - nearby literal/AP materializations:
    - 0x14384a9: lea    rax,[rip+0x438c98]        # 1871148 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d830>
    - 0x14384ce: lea    rax,[rip+0x438cab]        # 1871180 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d868>

## StreamReportingSetupImpl
- descriptor AP: 0x1854768
- factory: 0x1141d8c; FDE=0x1141d8c..0x114323e
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0x1141e3e: mov    rbp,QWORD PTR [rbx+0x30]
  - loaded target register: rbp
  - target-derived uses:
    - 0x1141f23: mov    rdi,QWORD PTR [rbp+0x0]
  - nearby literal/AP materializations:
    - 0x1141e52: lea    rsi,[rip+0xffffffffff22521b]        # 367074 <_ZTSSt12bad_any_cast@@Base-0x29154>
    - 0x1141ede: lea    rax,[rip+0x7128c3]        # 18547a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10e90>

## AdDetectionSetupImpl
- descriptor AP: 0x180ce78
- factory: 0xb623ac; FDE=0xb623ac..0xb63274
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xb62448: mov    r12,QWORD PTR [rbx+0x30]
  - loaded target register: r12
  - target-derived uses:
    - 0xb62522: mov    rdi,QWORD PTR [r12]
    - 0xb6254a: mov    rdi,QWORD PTR [r12]
  - nearby literal/AP materializations:
    - 0xb6240a: lea    rsi,[rip+0xffffffffff7fcb9c]        # 35efad <_ZTSSt12bad_any_cast@@Base-0x3121b>
    - 0xb62467: lea    rcx,[rip+0xcaaa4a]        # 180ceb8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2b78>
    - 0xb624a2: lea    rsi,[rip+0xffffffffff817082]        # 37952b <_ZTSSt12bad_any_cast@@Base-0x16c9d>

## PuffinSetupImpl
- descriptor AP: 0x1812220
- factory: 0xbd0ca2; FDE=0xbd0ca2..0xbd0fff
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xbd0ccc: mov    r12,QWORD PTR [rdx+0x30]
  - loaded target register: r12
  - target-derived uses:
    - 0xbd0d11: mov    rdi,QWORD PTR [r12]
    - 0xbd0d37: mov    rdi,QWORD PTR [r12]
    - 0xbd0d69: mov    rdi,QWORD PTR [r12]
    - 0xbd0d93: mov    rdi,QWORD PTR [r12]
    - 0xbd0db8: mov    rdi,QWORD PTR [r12]
    - 0xbd0ddf: mov    rdi,QWORD PTR [r12]
  - nearby literal/AP materializations:
    - 0xbd0ceb: lea    rax,[rip+0xc4156e]        # 1812260 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7f20>
    - 0xbd0d15: lea    rsi,[rip+0xffffffffff7dda1e]        # 3ae73a <_ZTSN5boost9exceptionE@@Base+0xf11c>
    - 0xbd0d1c: lea    rcx,[rip+0xffffffffff7dda23]        # 3ae746 <_ZTSN5boost9exceptionE@@Base+0xf128>
    - 0xbd0d3b: lea    rsi,[rip+0xffffffffff7dda12]        # 3ae754 <_ZTSN5boost9exceptionE@@Base+0xf136>
    - 0xbd0d42: lea    rcx,[rip+0xffffffffff7dda17]        # 3ae760 <_ZTSN5boost9exceptionE@@Base+0xf142>
    - 0xbd0d6d: lea    r13,[rip+0xffffffffff7dd9f7]        # 3ae76b <_ZTSN5boost9exceptionE@@Base+0xf14d>
    - 0xbd0d74: lea    rbp,[rip+0xffffffffff7dda05]        # 3ae780 <_ZTSN5boost9exceptionE@@Base+0xf162>
- bundle+0x30 load/ref @ 0xbd0f37: mov    WORD PTR [rdx+0x30],0x1
  - nearby literal/AP materializations:
    - 0xbd0ef2: lea    rax,[rip+0xc413af]        # 18122a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7f68>

## AudioTrackPlayerSetupImpl
- descriptor AP: 0x181ef58
- factory: 0xcb6e5a; FDE=0xcb6e5a..0xcb749c
- early aliases of rdx: r13, rdx
- bundle+0x30 load/ref @ 0xcb7010: mov    rax,QWORD PTR [r13+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0xcb70b1: call   QWORD PTR [rax+0x28]
    - 0xcb70bf: call   QWORD PTR [rax+0x28]

## SocialGraphSetupImpl
- descriptor AP: 0x1853cb8
- factory: 0x113b9b4; FDE=0x113b9b4..0x113be72
- early aliases of rdx: r15, rdx
- bundle+0x30 load/ref @ 0x113b9ed: mov    r14,QWORD PTR [r15+0x30]
  - loaded target register: r14
  - target-derived uses:
    - 0x113ba31: mov    rdi,QWORD PTR [r14]
    - 0x113ba6b: mov    rdi,QWORD PTR [r14]
  - nearby literal/AP materializations:
    - 0x113ba11: lea    rcx,[rip+0x6d29b0]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
    - 0x113ba34: lea    rbx,[rip+0xffffffffff29d465]        # 3d8ea0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a85>
    - 0x113ba3b: lea    r12,[rip+0xffffffffff29d47e]        # 3d8ec0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3aa5>
    - 0x113ba99: lea    rsi,[rip+0xffffffffff20e866]        # 34a306 <_ZTSSt12bad_any_cast@@Base-0x45ec2>

## FormatsSetupImpl
- descriptor AP: 0x181e398
- factory: 0xcab824; FDE=0xcab824..0xcac198
- early aliases of rdx: r15, rdx
- bundle+0x30 load/ref @ 0xcab88d: mov    r14,QWORD PTR [r15+0x30]
  - loaded target register: r14
  - target-derived uses:
    - 0xcab8e9: mov    rdi,QWORD PTR [r14]
    - 0xcab920: mov    rdi,QWORD PTR [r14]
    - 0xcab947: mov    rdi,QWORD PTR [r14]
    - 0xcab96e: mov    rdi,QWORD PTR [r14]
  - nearby literal/AP materializations:
    - 0xcab8a9: lea    rcx,[rip+0xb72b28]        # 181e3d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14098>
    - 0xcab8f5: lea    rsi,[rip+0xffffffffff721494]        # 3ccd90 <_ZTSN5boost9exceptionE@@Base+0x2d772>
    - 0xcab8fc: lea    rcx,[rip+0xffffffffff7214ad]        # 3ccdb0 <_ZTSN5boost9exceptionE@@Base+0x2d792>
    - 0xcab923: lea    rsi,[rip+0xffffffffff7214c6]        # 3ccdf0 <_ZTSN5boost9exceptionE@@Base+0x2d7d2>
    - 0xcab92a: lea    rcx,[rip+0xffffffffff7214df]        # 3cce10 <_ZTSN5boost9exceptionE@@Base+0x2d7f2>
- bundle+0x30 load/ref @ 0xcabd06: mov    QWORD PTR [r15+0x30],r12
  - nearby literal/AP materializations:
    - 0xcabd5e: lea    rax,[rip+0xb727d3]        # 181e538 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x141f8>

## CollectionSetupImpl
- descriptor AP: 0x1817028
- factory: 0xc2c520; FDE=0xc2c520..0xc2e184
- early aliases of rdx: r12, rdx
- bundle+0x30 load/ref @ 0xc2c5ec: mov    r14,QWORD PTR [r12+0x30]
  - loaded target register: r14
  - nearby literal/AP materializations:
    - 0xc2c5ff: lea    rcx,[rip+0xbeaa62]        # 1817068 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcd28>
    - 0xc2c68e: lea    rax,[rip+0xbe002b]        # 180c6c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2380>
- bundle+0x30 load/ref @ 0xc2def8: mov    rdi,QWORD PTR [r12+0x30]
  - loaded target register: rdi

## CurationStateSetupImpl
- descriptor AP: 0x181c8b0
- factory: 0xc88e08; FDE=0xc88e08..0xc895dc
- early aliases of rdx: r15, rdx
- bundle+0x30 load/ref @ 0xc88e7c: mov    r14,QWORD PTR [r15+0x30]
  - loaded target register: r14
  - target-derived uses:
    - 0xc88ec9: mov    rdi,QWORD PTR [r14]
    - 0xc88eed: mov    rdi,QWORD PTR [r14]
    - 0xc88f16: mov    rdi,QWORD PTR [r14]
    - 0xc88f39: mov    rdi,QWORD PTR [r14]
  - nearby literal/AP materializations:
    - 0xc88e9b: lea    rcx,[rip+0xb93a4e]        # 181c8f0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x125b0>
    - 0xc88ecc: lea    rsi,[rip+0xffffffffff74391d]        # 3cc7f0 <_ZTSN5boost9exceptionE@@Base+0x2d1d2>
    - 0xc88ed3: lea    rcx,[rip+0xffffffffff743936]        # 3cc810 <_ZTSN5boost9exceptionE@@Base+0x2d1f2>
    - 0xc88ef0: lea    r12,[rip+0xffffffffff743939]        # 3cc830 <_ZTSN5boost9exceptionE@@Base+0x2d212>
    - 0xc88ef7: lea    r13,[rip+0xffffffffff743952]        # 3cc850 <_ZTSN5boost9exceptionE@@Base+0x2d232>
    - 0xc88f19: lea    rsi,[rip+0xffffffffff7438d0]        # 3cc7f0 <_ZTSN5boost9exceptionE@@Base+0x2d1d2>
    - 0xc88f23: lea    rcx,[rip+0xffffffffff7438e6]        # 3cc810 <_ZTSN5boost9exceptionE@@Base+0x2d1f2>

## PlaylistOffliningSetupImpl
- descriptor AP: 0x1849668
- factory: 0x1077eae; FDE=0x1077eae..0x10790ae
- early aliases of rdx: r12, rdx
- bundle+0x30 load/ref @ 0x1077f1e: mov    r13,QWORD PTR [r12+0x30]
  - loaded target register: r13
  - nearby literal/AP materializations:
    - 0x1077f5b: lea    rcx,[rip+0x7d1746]        # 18496a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5d90>

## CommonCappingSetupImpl
- descriptor AP: 0x18176d0
- factory: 0xc350c6; FDE=0xc350c6..0xc361d0
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xc35112: mov    r12,QWORD PTR [rbx+0x30]
  - loaded target register: r12
  - target-derived uses:
    - 0xc3520c: mov    rdi,QWORD PTR [r12]
  - nearby literal/AP materializations:
    - 0xc35163: lea    rsi,[rip+0xdba966]        # 19efad0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1200>
    - 0xc35180: lea    rax,[rip+0xbe2589]        # 1817710 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd3d0>
    - 0xc351aa: lea    rax,[rip+0xbd972f]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
    - 0xc351b5: mov    rax,QWORD PTR [rip+0xc7c8e4]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
- bundle+0x30 load/ref @ 0xc351a6: lea    rcx,[rbx+0x30]
  - nearby literal/AP materializations:
    - 0xc35163: lea    rsi,[rip+0xdba966]        # 19efad0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1200>
    - 0xc35180: lea    rax,[rip+0xbe2589]        # 1817710 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd3d0>
    - 0xc351aa: lea    rax,[rip+0xbd972f]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
    - 0xc351b5: mov    rax,QWORD PTR [rip+0xc7c8e4]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
    - 0xc35210: lea    rbx,[rip+0xffffffffff7947e9]        # 3c9a00 <_ZTSN5boost9exceptionE@@Base+0x2a3e2>
    - 0xc35217: lea    r14,[rip+0xffffffffff794802]        # 3c9a20 <_ZTSN5boost9exceptionE@@Base+0x2a402>
- bundle+0x30 load/ref @ 0xc351b1: mov    QWORD PTR [rbx+0x30],rax
  - nearby literal/AP materializations:
    - 0xc35180: lea    rax,[rip+0xbe2589]        # 1817710 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd3d0>
    - 0xc351aa: lea    rax,[rip+0xbd972f]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
    - 0xc351b5: mov    rax,QWORD PTR [rip+0xc7c8e4]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
    - 0xc35210: lea    rbx,[rip+0xffffffffff7947e9]        # 3c9a00 <_ZTSN5boost9exceptionE@@Base+0x2a3e2>
    - 0xc35217: lea    r14,[rip+0xffffffffff794802]        # 3c9a20 <_ZTSN5boost9exceptionE@@Base+0x2a402>
- bundle+0x30 load/ref @ 0xc35780: lea    r14,[rbx+0x30]
  - nearby literal/AP materializations:
    - 0xc35760: lea    rax,[rip+0xbe2b51]        # 18182b8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xdf78>
- bundle+0x30 load/ref @ 0xc35787: movups XMMWORD PTR [rbx+0x30],xmm0
  - nearby literal/AP materializations:
    - 0xc35760: lea    rax,[rip+0xbe2b51]        # 18182b8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xdf78>

## RestrictionsSetupImpl
- descriptor AP: 0x184ca50
- factory: 0x10ab7ae; FDE=0x10ab7ae..0x10aba35
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0x10ab824: mov    rax,QWORD PTR [rbx+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x10ab86c: call   QWORD PTR [rax+0x18]
    - 0x10ab876: call   QWORD PTR [rax+0x28]
    - 0x10ab88d: call   QWORD PTR [rax+0x28]
    - 0x10ab8a5: call   QWORD PTR [rax+0x30]
    - 0x10ab8a8: mov    rcx,QWORD PTR [rax]
    - 0x10ab8ae: call   QWORD PTR [rcx+0x178]
    - 0x10ab8c9: mov    rax,QWORD PTR [rdi]
    - 0x10ab8cc: call   QWORD PTR [rax+0x40]
    - 0x10ab8f0: mov    rcx,QWORD PTR [rax]
    - 0x10ab8f6: call   QWORD PTR [rcx+0x28]
    - 0x10ab937: movzx  eax,BYTE PTR [r15+0x11]
  - nearby literal/AP materializations:
    - 0x10ab846: lea    rsi,[rip+0xffffffffff2b4a0a]        # 360257 <_ZTSSt12bad_any_cast@@Base-0x2ff71>

## AdsSetupImpl
- descriptor AP: 0x180dc50
- factory: 0xb86086; FDE=0xb86086..0xb87f42
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0xb864e0: mov    rax,QWORD PTR [r14+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0xb86507: call   QWORD PTR [rax+0x18]
    - 0xb8651c: call   QWORD PTR [rax+0x28]
    - 0xb86522: mov    ebp,DWORD PTR [rax+0x48]
- bundle+0x30 load/ref @ 0xb86dba: lea    rdi,[r14+0x30]

## PodcastAdsSetupImpl
- descriptor AP: 0x1867ae8
- factory: 0x135a74c; FDE=0x135a74c..0x135c1fa
- early aliases of rdx: r12, rdx
- bundle+0x30 load/ref @ 0x135a7ac: mov    r13,QWORD PTR [r12+0x30]
  - loaded target register: r13
  - target-derived uses:
    - 0x135a847: mov    rdi,QWORD PTR [r13+0x0]
    - 0x135a881: mov    rdi,QWORD PTR [r13+0x0]
    - 0x135a8ac: mov    rdi,QWORD PTR [r13+0x0]
    - 0x135a8cf: mov    rdi,QWORD PTR [r13+0x0]
  - nearby literal/AP materializations:
    - 0x135a7e1: lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
    - 0x135a85c: lea    rsi,[rip+0xffffffffff0825cd]        # 3dce30 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x287f>
    - 0x135a863: lea    rcx,[rip+0xffffffffff0825e6]        # 3dce50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x289f>
- bundle+0x30 load/ref @ 0x135ad3f: lea    rdi,[r12+0x30]
  - nearby literal/AP materializations:
    - 0x135ad1c: lea    rax,[rip+0x4a2745]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
    - 0x135ad33: lea    rax,[rip+0x51a126]        # 1874e60 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x31548>
    - 0x135ae06: lea    rsi,[rip+0xffffffffff0dad83]        # 435b90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b5df>
    - 0x135ae0d: lea    rcx,[rip+0xffffffffff0dad9c]        # 435bb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b5ff>
- bundle+0x30 load/ref @ 0x135ae95: mov    QWORD PTR [r12+0x30],rax
  - nearby literal/AP materializations:
    - 0x135ae66: lea    rax,[rip+0x4aff5b]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
    - 0x135ae71: lea    rax,[rip+0x519380]        # 18741f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x308e0>
    - 0x135af43: lea    rax,[rip+0x519356]        # 18742a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30988>
- bundle+0x30 load/ref @ 0x135c13d: mov    rdi,QWORD PTR [r12+0x30]
  - loaded target register: rdi

## TimelineAdsSetupImpl
- descriptor AP: 0x1867300
- factory: 0x13524a4; FDE=0x13524a4..0x1353454
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0x1352569: mov    r13,QWORD PTR [rbx+0x30]
  - loaded target register: r13
  - target-derived uses:
    - 0x13525a3: mov    rdi,QWORD PTR [r13+0x0]
    - 0x13525d6: mov    rdi,QWORD PTR [r13+0x0]
  - nearby literal/AP materializations:
    - 0x135257c: lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
    - 0x13525a7: lea    rsi,[rip+0xffffffffff08a819]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
    - 0x13525ae: lea    rcx,[rip+0xffffffffff08a81b]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
    - 0x13525da: lea    rsi,[rip+0xffffffffff08a814]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>
    - 0x13525e1: lea    rcx,[rip+0xffffffffff08a818]        # 3dce00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x284f>
- bundle+0x30 load/ref @ 0x1352594: movdqu XMMWORD PTR [rbx+0x30],xmm0
  - nearby literal/AP materializations:
    - 0x135257c: lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
    - 0x13525a7: lea    rsi,[rip+0xffffffffff08a819]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
    - 0x13525ae: lea    rcx,[rip+0xffffffffff08a81b]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
    - 0x13525da: lea    rsi,[rip+0xffffffffff08a814]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>
    - 0x13525e1: lea    rcx,[rip+0xffffffffff08a818]        # 3dce00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x284f>
- bundle+0x30 load/ref @ 0x135262b: lea    rax,[rbx+0x30]
  - nearby literal/AP materializations:
    - 0x135268f: lea    rax,[rip+0x514d22]        # 18673b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23aa0>

## AdaptiveMediaStreamerSetupImpl
- descriptor AP: 0x185a808
- factory: 0x11c70ee; FDE=0x11c70ee..0x11c7ead
- early aliases of rdx: r12, rdx
- bundle+0x30 load/ref @ 0x11c7119: mov    rax,QWORD PTR [rdx+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x11c711d: mov    rdi,QWORD PTR [rax]
    - 0x11c71f6: call   QWORD PTR [rax+0x18]
    - 0x11c723b: mov    QWORD PTR [rax],rcx
  - nearby literal/AP materializations:
    - 0x11c7120: lea    rsi,[rip+0xffffffffff26ec59]        # 435d80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b7cf>
    - 0x11c7127: lea    rcx,[rip+0xffffffffff26ec66]        # 435d94 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b7e3>
    - 0x11c7162: lea    rsi,[rip+0xffffffffff196ebe]        # 35e027 <_ZTSSt12bad_any_cast@@Base-0x321a1>
    - 0x11c7176: lea    rbp,[rip+0xffffffffff28adff]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>

## TimelineConductorSetupImpl
- descriptor AP: 0x1867c58
- factory: 0x135c878; FDE=0x135c878..0x135d055
- early aliases of rdx: rbp, rdx
- bundle+0x30 load/ref @ 0x135ca97: mov    r13,QWORD PTR [rbp+0x30]
  - loaded target register: r13

## ResumptionSetupImpl
- descriptor AP: 0x184ea18
- factory: 0x10d0b1a; FDE=0x10d0b1a..0x10d0e58
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0x10d0c21: mov    rax,QWORD PTR [r14+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x10d0c35: call   QWORD PTR [rax+0x28]
    - 0x10d0c46: call   QWORD PTR [rax+0x30]
    - 0x10d0c5e: call   QWORD PTR [rax+0x28]
    - 0x10d0ca7: movaps XMMWORD PTR [rax],xmm1

## ResumptionProgressSetupImpl
- descriptor AP: 0x184dcb0
- factory: 0x10c157e; FDE=0x10c157e..0x10c23e0
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0x10c1606: mov    r13,QWORD PTR [r14+0x30]
  - loaded target register: r13
  - target-derived uses:
    - 0x10c164e: mov    rdi,QWORD PTR [r13+0x0]
    - 0x10c1673: mov    rdi,QWORD PTR [r13+0x0]
    - 0x10c1680: mov    rdi,QWORD PTR [r13+0x0]
    - 0x10c168d: mov    rdi,QWORD PTR [r13+0x0]
    - 0x10c16a8: mov    rdi,QWORD PTR [r13+0x0]
    - 0x10c16b5: mov    rdi,QWORD PTR [r13+0x0]
    - 0x10c16c1: mov    rdi,QWORD PTR [r13+0x0]
    - 0x10c16cd: mov    rdi,QWORD PTR [r13+0x0]
  - nearby literal/AP materializations:
    - 0x10c1638: lea    rcx,[rip+0x78c6b1]        # 184dcf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa3d8>
    - 0x10c1652: lea    rsi,[rip+0xffffffffff3169c7]        # 3d8020 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c05>
    - 0x10c1659: lea    rcx,[rip+0xffffffffff3169d0]        # 3d8030 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c15>
- bundle+0x30 load/ref @ 0x10c1d4e: mov    QWORD PTR [r14+0x30],rax
  - nearby literal/AP materializations:
    - 0x10c1d0e: lea    rax,[rip+0x73b753]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
    - 0x10c1d1f: lea    rax,[rip+0x78d5f2]        # 184f318 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xba00>
    - 0x10c1d8f: lea    rax,[rip+0xffffffffff29e524]        # 3602ba <_ZTSSt12bad_any_cast@@Base-0x2ff0e>
    - 0x10c1e06: lea    rax,[rip+0xffffffffff28b62e]        # 34d43b <_ZTSSt12bad_any_cast@@Base-0x42d8d>

## ResumptionProgressEsperantoSetup
- descriptor AP: 0x184dc28
- factory: 0x10c0d98; FDE=0x10c0d98..0x10c0f98
- early aliases of rdx: r12, rdx
- bundle+0x30 load/ref @ 0x10c0e22: mov    rbx,QWORD PTR [r12+0x30]
  - loaded target register: rbx
  - nearby literal/AP materializations:
    - 0x10c0e4e: lea    rax,[rip+0x7b0393]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
    - 0x10c0e9f: lea    rax,[rip+0xffffffffffaa1468]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
    - 0x10c0eab: lea    rax,[rip+0xe6]        # 10c0f98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2883ae>
- bundle+0x30 load/ref @ 0x10c0eba: movups XMMWORD PTR [r12+0x30],xmm0
  - nearby literal/AP materializations:
    - 0x10c0e9f: lea    rax,[rip+0xffffffffffaa1468]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
    - 0x10c0eab: lea    rax,[rip+0xe6]        # 10c0f98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2883ae>

## ContextMdataSetupImpl
- descriptor AP: 0x1846c20
- factory: 0x104577a; FDE=0x104577a..0x10470ec
- early aliases of rdx: rbp, rdx
- bundle+0x30 load/ref @ 0x1045868: mov    rax,QWORD PTR [rbp+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x104587b: call   QWORD PTR [rax+0x28]
    - 0x1045890: call   QWORD PTR [rax+0x38]
    - 0x10458a6: mov    rdi,QWORD PTR [rax]
    - 0x10458c8: mov    rax,QWORD PTR [r12]
    - 0x10458cc: movdqu xmm0,XMMWORD PTR [rax+0x28]
    - 0x10458d7: mov    r13,QWORD PTR [rax+0x30]
    - 0x10458ff: mov    QWORD PTR [rax],r12
    - 0x1045908: movdqu XMMWORD PTR [rax+0x8],xmm0
    - 0x1045915: mov    QWORD PTR [r12],rax
    - 0x1045920: mov    QWORD PTR [r12+0x10],rax
    - 0x104592c: mov    QWORD PTR [r12+0x18],rcx
    - 0x1045931: mov    DWORD PTR [r14+0x8],0x10017
    - 0x1045939: and    QWORD PTR [r14+0x10],0x0
    - 0x104594a: lea    rbx,[r14+0x18]
    - 0x1045955: mov    QWORD PTR [r14],rcx
    - 0x104595f: mov    QWORD PTR [r14+0x18],rcx
    - 0x1045963: lea    r15,[r14+0x20]
    - 0x1045967: and    QWORD PTR [r14+0x20],0x0
    - 0x104596c: mov    QWORD PTR [r14+0x30],rax
  - nearby literal/AP materializations:
    - 0x10458a9: lea    rsi,[rip+0xffffffffff3901f0]        # 3d5aa0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x685>
    - 0x10458b0: lea    rcx,[rip+0xffffffffff390209]        # 3d5ac0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6a5>

## ConnectSetupImpl
- descriptor AP: 0x182b7b8
- factory: 0xde75ee; FDE=0xde75ee..0xde87f4
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0xde76aa: mov    rsi,QWORD PTR [r14+0x30]
  - loaded target register: rsi
  - nearby literal/AP materializations:
    - 0xde773d: lea    rsi,[rip+0xffffffffff55428e]        # 33b9d2 <_ZTSSt12bad_any_cast@@Base-0x547f6>
    - 0xde7759: lea    rsi,[rip+0xffffffffff585ae3]        # 36d243 <_ZTSSt12bad_any_cast@@Base-0x22f85>

## SocialListeningImplSetup
- descriptor AP: 0x181eed8
- factory: 0xcb5f9c; FDE=0xcb5f9c..0xcb6c8e
- early aliases of rdx: r12, rdx
- bundle+0x30 load/ref @ 0xcb6138: mov    r15,QWORD PTR [r12+0x30]
  - loaded target register: r15
  - target-derived uses:
    - 0xcb61dc: mov    rdi,QWORD PTR [r15]
    - 0xcb6230: mov    rdi,QWORD PTR [r15]
  - nearby literal/AP materializations:
    - 0xcb61af: lea    rcx,[rip+0xb68d62]        # 181ef18 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14bd8>
    - 0xcb61df: lea    rsi,[rip+0xffffffffff716f2a]        # 3cd110 <_ZTSN5boost9exceptionE@@Base+0x2daf2>
    - 0xcb61e6: lea    rcx,[rip+0xffffffffff716f43]        # 3cd130 <_ZTSN5boost9exceptionE@@Base+0x2db12>
- bundle+0x30 load/ref @ 0xcb687c: lea    rdi,[r12+0x30]
  - nearby literal/AP materializations:
    - 0xcb685f: lea    rcx,[rip+0xb46cca]        # 17fd530 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe25750>

## PlaybackSettingsObserverSetupImpl
- descriptor AP: 0x18196c8
- factory: 0xc52de6; FDE=0xc52de6..0xc533a0
- early aliases of rdx: r13, rdx
- bundle+0x30 load/ref @ 0xc52e68: mov    rdi,QWORD PTR [r13+0x30]
  - loaded target register: rdi
  - nearby literal/AP materializations:
    - 0xc52e88: lea    rax,[rip+0xbdc309]        # 182f198 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x1130>
    - 0xc52e96: lea    rsi,[rip+0xffffffffff7e7b83]        # 43aa20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x62c>
    - 0xc52ebc: lea    rsi,[rip+0xffffffffff7e7a6b]        # 43a92e <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x53a>
    - 0xc52ed0: lea    rsi,[rip+0xffffffffff7e6659]        # 439530 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ef7f>
- bundle+0x30 load/ref @ 0xc53039: mov    r15,QWORD PTR [r13+0x30]
  - loaded target register: r15
  - target-derived uses:
    - 0xc53097: mov    rdi,QWORD PTR [r15]
    - 0xc530c3: mov    rdi,QWORD PTR [r15]
  - nearby literal/AP materializations:
    - 0xc53084: lea    rcx,[rip+0xbc667d]        # 1819708 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf3c8>
    - 0xc5309a: lea    rbx,[rip+0xffffffffff77717f]        # 3ca220 <_ZTSN5boost9exceptionE@@Base+0x2ac02>
    - 0xc530a1: lea    r12,[rip+0xffffffffff777198]        # 3ca240 <_ZTSN5boost9exceptionE@@Base+0x2ac22>

## PermissionsEsperantoSetup
- descriptor AP: 0x184ca10
- factory: 0x10ab2de; FDE=0x10ab2de..0x10ab4db
- early aliases of rdx: r12, rdx
- bundle+0x30 load/ref @ 0x10ab34d: mov    r14,QWORD PTR [r12+0x30]
  - loaded target register: r14
  - nearby literal/AP materializations:
    - 0x10ab398: lea    rax,[rip+0xffffffffffa332a9]        # ade648 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b5e8>
    - 0x10ab3a4: lea    rax,[rip+0xe2f7]        # 10b96a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280ab8>
    - 0x10ab3cc: lea    rax,[rip+0x7c5e15]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
- bundle+0x30 load/ref @ 0x10ab3b8: mov    rbp,QWORD PTR [r12+0x30]
  - loaded target register: rbp
  - nearby literal/AP materializations:
    - 0x10ab398: lea    rax,[rip+0xffffffffffa332a9]        # ade648 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b5e8>
    - 0x10ab3a4: lea    rax,[rip+0xe2f7]        # 10b96a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280ab8>
    - 0x10ab3cc: lea    rax,[rip+0x7c5e15]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
    - 0x10ab407: lea    rax,[rip+0xffffffffffab6f00]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
    - 0x10ab413: lea    rax,[rip+0xc2]        # 10ab4dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2728f2>
- bundle+0x30 load/ref @ 0x10ab422: movups XMMWORD PTR [r12+0x30],xmm0
  - nearby literal/AP materializations:
    - 0x10ab407: lea    rax,[rip+0xffffffffffab6f00]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
    - 0x10ab413: lea    rax,[rip+0xc2]        # 10ab4dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2728f2>

## AudiobookSequenceProviderSetupImpl
- descriptor AP: 0x1851730
- factory: 0x110f0a4; FDE=0x110f0a4..0x110f376
- early aliases of rdx: r14, r8, rdx
- bundle+0x30 load/ref @ 0x110f0f0: mov    rbp,QWORD PTR [r14+0x30]
  - loaded target register: rbp
  - target-derived uses:
    - 0x110f116: mov    rdi,QWORD PTR [rbp+0x0]
    - 0x110f13d: mov    rdi,QWORD PTR [rbp+0x0]
    - 0x110f163: mov    rdi,QWORD PTR [rbp+0x0]
    - 0x110f187: mov    rdi,QWORD PTR [rbp+0x0]
  - nearby literal/AP materializations:
    - 0x110f100: lea    rcx,[rip+0x7212b1]        # 18303b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2350>
    - 0x110f11a: lea    rsi,[rip+0xffffffffff2c990f]        # 3d8a30 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3615>
    - 0x110f121: lea    rcx,[rip+0xffffffffff2c9938]        # 3d8a60 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3645>
    - 0x110f141: lea    r15,[rip+0xffffffffff2c9948]        # 3d8a90 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3675>
    - 0x110f148: lea    r12,[rip+0xffffffffff2c9971]        # 3d8ac0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36a5>
    - 0x110f167: lea    rsi,[rip+0xffffffffff2c98c2]        # 3d8a30 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3615>
    - 0x110f171: lea    rcx,[rip+0xffffffffff2c98e8]        # 3d8a60 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3645>

## PlaybackPlatformSetupImpl
- descriptor AP: 0x182b558
- factory: 0xde44ca; FDE=0xde44ca..0xde4eb7
- early aliases of rdx: r15, rdx
- bundle+0x30 load/ref @ 0xde4520: mov    rbp,QWORD PTR [r15+0x30]
  - loaded target register: rbp
  - target-derived uses:
    - 0xde45ef: mov    rdi,QWORD PTR [rbp+0x0]
    - 0xde4613: mov    rdi,QWORD PTR [rbp+0x0]
    - 0xde4634: mov    rdi,QWORD PTR [rbp+0x0]
  - nearby literal/AP materializations:
    - 0xde4528: lea    rsi,[rip+0xffffffffff57e495]        # 3629c4 <_ZTSSt12bad_any_cast@@Base-0x2d804>
    - 0xde45a9: lea    rax,[rip+0xa46fe8]        # 182b598 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7bc8>
    - 0xde45c9: lea    rax,[rip+0xa63168]        # 1847738 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e20>

## PlaybackSettingsSetupImpl
- descriptor AP: 0x182b620
- factory: 0xde53c0; FDE=0xde53c0..0xde6c75
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xde54cb: mov    rbp,QWORD PTR [rbx+0x30]
  - loaded target register: rbp
- bundle+0x30 load/ref @ 0xde6be2: mov    rdi,QWORD PTR [rbx+0x30]
  - loaded target register: rdi

## PlayerRenderingSetupImpl
- descriptor AP: 0x1847f70
- factory: 0x10575d6; FDE=0x10575d6..0x1058f3c
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0x105764b: mov    rax,QWORD PTR [r14+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x1057665: call   QWORD PTR [rax+0x28]
    - 0x105766e: call   QWORD PTR [rax+0x18]
    - 0x1057690: movdqu XMMWORD PTR [rax+0x8],xmm0
    - 0x105769c: mov    QWORD PTR [r15],rax
    - 0x105769f: lea    r12,[r15+0x18]
    - 0x10576d3: call   QWORD PTR [rax+0x40]
    - 0x10576e8: call   QWORD PTR [rax+0x30]
    - 0x10576f7: call   QWORD PTR [rax+0x28]
    - 0x10576fa: mov    rcx,QWORD PTR [rax]
    - 0x1057708: call   QWORD PTR [rcx+0x10]
    - 0x1057713: call   QWORD PTR [rax+0x28]
    - 0x1057720: call   QWORD PTR [rax+0x30]
    - 0x1057723: mov    rcx,QWORD PTR [rax]
    - 0x1057729: call   QWORD PTR [rcx+0x178]
  - nearby literal/AP materializations:
    - 0x1057695: lea    rax,[rip+0x7a5dcc]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>

## AutomixSetupImpl
- descriptor AP: 0x18146c0
- factory: 0xc05d20; FDE=0xc05d20..0xc0724e
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xc05d45: mov    rbp,QWORD PTR [rdx+0x30]
  - loaded target register: rbp
  - nearby literal/AP materializations:
    - 0xc05d64: lea    rcx,[rip+0xc0e995]        # 1814700 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa3c0>
    - 0xc05d76: movaps xmm0,XMMWORD PTR [rip+0xffffffffff787db3]        # 38db30 <_ZTSSt12bad_any_cast@@Base-0x2698>
    - 0xc05d85: movaps xmm0,XMMWORD PTR [rip+0xffffffffff786e24]        # 38cbb0 <_ZTSSt12bad_any_cast@@Base-0x3618>
    - 0xc05dac: movaps xmm0,XMMWORD PTR [rip+0xffffffffff7874fd]        # 38d2b0 <_ZTSSt12bad_any_cast@@Base-0x2f18>
    - 0xc05dc1: movaps xmm0,XMMWORD PTR [rip+0xffffffffff7876d8]        # 38d4a0 <_ZTSSt12bad_any_cast@@Base-0x2d28>
    - 0xc05dcc: movaps xmm0,XMMWORD PTR [rip+0xffffffffff78841d]        # 38e1f0 <_ZTSSt12bad_any_cast@@Base-0x1fd8>
    - 0xc05de1: movaps xmm0,XMMWORD PTR [rip+0xffffffffff788148]        # 38df30 <_ZTSSt12bad_any_cast@@Base-0x2298>
    - 0xc05def: movsd  xmm0,QWORD PTR [rip+0xffffffffff787b69]        # 38d960 <_ZTSSt12bad_any_cast@@Base-0x2868>

## PrefetchPlayerSetupImpl
- descriptor AP: 0x184a728
- factory: 0x108853a; FDE=0x108853a..0x1088f91
- early aliases of rdx: r15, rdx
- bundle+0x30 load/ref @ 0x108899d: movups XMMWORD PTR [r15+0x30],xmm0
  - nearby literal/AP materializations:
    - 0x1088958: lea    rax,[rip+0x774b09]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
    - 0x1088977: lea    rax,[rip+0x7c1f4a]        # 184a8c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6fb0>
    - 0x10889df: lea    rax,[rip+0x7c1f6a]        # 184a950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7038>
    - 0x1088a08: lea    rcx,[rip+0x779c79]        # 1802688 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe2a8a8>
- bundle+0x30 load/ref @ 0x1088af9: mov    rdi,QWORD PTR [r15+0x30]
  - loaded target register: rdi
  - target-derived uses:
    - 0x1088afd: mov    rax,QWORD PTR [rdi]
    - 0x1088b05: call   QWORD PTR [rax+0xd8]
    - 0x1088b63: call   QWORD PTR [rax+0x108]
    - 0x1088bd9: call   QWORD PTR [rax+0x30]
  - nearby literal/AP materializations:
    - 0x1088b2d: lea    rsi,[rip+0xffffffffffa1455d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
    - 0x1088b34: lea    rcx,[rip+0x605f]        # 108eb9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255fb0>
    - 0x1088ba3: lea    rsi,[rip+0xffffffffffa144e7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
    - 0x1088baa: lea    rcx,[rip+0x6039]        # 108ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256000>
- bundle+0x30 load/ref @ 0x1088b1e: mov    rbp,QWORD PTR [r15+0x30]
  - loaded target register: rbp
  - target-derived uses:
    - 0x1088b51: mov    rax,QWORD PTR [rbp+0x0]
    - 0x1088b63: call   QWORD PTR [rax+0x108]
  - nearby literal/AP materializations:
    - 0x1088b2d: lea    rsi,[rip+0xffffffffffa1455d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
    - 0x1088b34: lea    rcx,[rip+0x605f]        # 108eb9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255fb0>
    - 0x1088ba3: lea    rsi,[rip+0xffffffffffa144e7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
    - 0x1088baa: lea    rcx,[rip+0x6039]        # 108ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256000>

## PlaylistEsperantoCommonSetupImpl
- descriptor AP: 0x18491e8
- factory: 0x10731f4; FDE=0x10731f4..0x107436b
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0x10732d7: mov    rax,QWORD PTR [rbx+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x10732f3: call   QWORD PTR [rax+0x30]
    - 0x107332d: mov    BYTE PTR [r12+0x8],0x0
    - 0x107333a: mov    QWORD PTR [r12],rax
    - 0x107333e: lea    rax,[r12+0x10]
    - 0x1073348: lea    rax,[r12+0x50]
    - 0x1073352: lea    rax,[r12+0x58]
    - 0x1073360: movdqu XMMWORD PTR [r12+0x10],xmm0
    - 0x1073367: movdqu XMMWORD PTR [r12+0x20],xmm0
    - 0x107336e: movdqu XMMWORD PTR [r12+0x30],xmm0
    - 0x1073375: movdqu XMMWORD PTR [r12+0x40],xmm0
    - 0x107337c: movdqu XMMWORD PTR [r12+0x50],xmm0
    - 0x1073391: call   QWORD PTR [rax+0x48]
    - 0x107339d: call   QWORD PTR [rax+0x40]
    - 0x10733b5: mov    rbx,QWORD PTR [rax]
  - nearby literal/AP materializations:
    - 0x107330d: lea    rsi,[rip+0xffffffffff2dfa67]        # 352d7b <_ZTSSt12bad_any_cast@@Base-0x3d44d>
    - 0x1073333: lea    rax,[rip+0x7d5eee]        # 1849228 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5910>

## PlayTelemetrySetup
- descriptor AP: 0x182b4d8
- factory: 0xde38ca; FDE=0xde38ca..0xde3d27
- early aliases of rdx: rdx
- bundle+0x30 load/ref @ 0xde38f1: mov    rax,QWORD PTR [rdx+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0xde3905: mov    BYTE PTR [rax+0x8],0x0
    - 0xde3910: mov    QWORD PTR [r14],rax
    - 0xde3923: movups XMMWORD PTR [rax+0x8],xmm0
    - 0xde392e: mov    QWORD PTR [rbx],rax
    - 0xde3952: lea    r12,[r14+0x10]
    - 0xde3976: lea    rbx,[r14+0x20]
    - 0xde3982: lea    rdi,[r14+0x30]
    - 0xde3990: lea    rdi,[r14+0x40]
    - 0xde399e: lea    rdi,[r14+0x50]
    - 0xde39b6: movups XMMWORD PTR [r14+0x68],xmm0
    - 0xde39bb: mov    QWORD PTR [r14+0x60],rax
    - 0xde39c7: movaps XMMWORD PTR [rsi],xmm0
    - 0xde39ca: and    QWORD PTR [rsi+0x10],0x0
    - 0xde39cf: mov    r12,QWORD PTR [r14+0x10]
    - 0xde39f0: mov    QWORD PTR [r15+0x18],rax
  - nearby literal/AP materializations:
    - 0xde3909: lea    rax,[rip+0xa47c08]        # 182b518 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7b48>
    - 0xde3927: lea    rax,[rip+0xa807b2]        # 18640e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x207c8>
    - 0xde3940: lea    rsi,[rip+0xffffffffff57f580]        # 362ec7 <_ZTSSt12bad_any_cast@@Base-0x2d301>

## QueueSetupImpl
- descriptor AP: 0x1861368
- factory: 0x1294f7a; FDE=0x1294f7a..0x129606d
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0x1295b4d: mov    QWORD PTR [rbx+0x30],r15
  - nearby literal/AP materializations:
    - 0x1295b5a: lea    rsi,[rip+0x75525f]        # 19eadc0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x19f8>
    - 0x1295bba: lea    rsi,[rip+0x755257]        # 19eae18 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1a50>

## TimelineTransformSetupImpl
- descriptor AP: 0x1871f30
- factory: 0x144e012; FDE=0x144e012..0x144e23a
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0x144e09f: mov    rax,QWORD PTR [r14+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x144e0a3: mov    rdi,QWORD PTR [rax]
    - 0x144e0cd: mov    rdi,QWORD PTR [rax]
    - 0x144e0f9: call   QWORD PTR [rax+0x30]
    - 0x144e107: call   QWORD PTR [rax+0x28]
    - 0x144e10e: mov    rdi,QWORD PTR [rax]
    - 0x144e128: mov    BYTE PTR [rax+0x8],0x0
    - 0x144e133: mov    QWORD PTR [r14],rax
    - 0x144e14b: mov    QWORD PTR [rax],rsi
    - 0x144e153: mov    QWORD PTR [rax+0x8],rsi
    - 0x144e15c: mov    QWORD PTR [rax+0x10],rsi
    - 0x144e165: movlps QWORD PTR [rax+0x18],xmm0
    - 0x144e16e: mov    QWORD PTR [rax+0x20],rsi
    - 0x144e172: mov    BYTE PTR [rax+0x28],r13b
    - 0x144e176: mov    QWORD PTR [rax+0x30],rdx
    - 0x144e17a: mov    QWORD PTR [rax+0x38],rcx
    - 0x144e17e: mov    BYTE PTR [rax+0x40],r15b
    - 0x144e182: mov    QWORD PTR [r14+0x10],rax
  - nearby literal/AP materializations:
    - 0x144e0a6: lea    rsi,[rip+0xfffffffffefe79b2]        # 435a5f <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4ae>
    - 0x144e0ad: lea    rcx,[rip+0xfffffffffefe79bc]        # 435a70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4bf>
    - 0x144e0d0: lea    rsi,[rip+0xfffffffffefe79b0]        # 435a87 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4d6>
    - 0x144e0d7: lea    rcx,[rip+0xfffffffffefe79b2]        # 435a90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4df>
    - 0x144e12c: lea    rax,[rip+0x3c001d]        # 180e150 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e10>
- bundle+0x30 load/ref @ 0x144e0c9: mov    rax,QWORD PTR [r14+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x144e0cd: mov    rdi,QWORD PTR [rax]
    - 0x144e0f9: call   QWORD PTR [rax+0x30]
    - 0x144e107: call   QWORD PTR [rax+0x28]
    - 0x144e10e: mov    rdi,QWORD PTR [rax]
    - 0x144e128: mov    BYTE PTR [rax+0x8],0x0
    - 0x144e133: mov    QWORD PTR [r14],rax
    - 0x144e14b: mov    QWORD PTR [rax],rsi
    - 0x144e153: mov    QWORD PTR [rax+0x8],rsi
    - 0x144e15c: mov    QWORD PTR [rax+0x10],rsi
    - 0x144e165: movlps QWORD PTR [rax+0x18],xmm0
    - 0x144e16e: mov    QWORD PTR [rax+0x20],rsi
    - 0x144e172: mov    BYTE PTR [rax+0x28],r13b
    - 0x144e176: mov    QWORD PTR [rax+0x30],rdx
    - 0x144e17a: mov    QWORD PTR [rax+0x38],rcx
    - 0x144e17e: mov    BYTE PTR [rax+0x40],r15b
    - 0x144e182: mov    QWORD PTR [r14+0x10],rax
  - nearby literal/AP materializations:
    - 0x144e0a6: lea    rsi,[rip+0xfffffffffefe79b2]        # 435a5f <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4ae>
    - 0x144e0ad: lea    rcx,[rip+0xfffffffffefe79bc]        # 435a70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4bf>
    - 0x144e0d0: lea    rsi,[rip+0xfffffffffefe79b0]        # 435a87 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4d6>
    - 0x144e0d7: lea    rcx,[rip+0xfffffffffefe79b2]        # 435a90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4df>
    - 0x144e12c: lea    rax,[rip+0x3c001d]        # 180e150 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e10>
    - 0x144e144: lea    rsi,[rip+0x426f75]        # 18750c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x317a8>
- bundle+0x30 load/ref @ 0x144e10a: mov    rax,QWORD PTR [r14+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x144e10e: mov    rdi,QWORD PTR [rax]
    - 0x144e128: mov    BYTE PTR [rax+0x8],0x0
    - 0x144e133: mov    QWORD PTR [r14],rax
    - 0x144e14b: mov    QWORD PTR [rax],rsi
    - 0x144e153: mov    QWORD PTR [rax+0x8],rsi
    - 0x144e15c: mov    QWORD PTR [rax+0x10],rsi
    - 0x144e165: movlps QWORD PTR [rax+0x18],xmm0
    - 0x144e16e: mov    QWORD PTR [rax+0x20],rsi
    - 0x144e172: mov    BYTE PTR [rax+0x28],r13b
    - 0x144e176: mov    QWORD PTR [rax+0x30],rdx
    - 0x144e17a: mov    QWORD PTR [rax+0x38],rcx
    - 0x144e17e: mov    BYTE PTR [rax+0x40],r15b
    - 0x144e182: mov    QWORD PTR [r14+0x10],rax
    - 0x144e1e7: mov    QWORD PTR [rax],r14
  - nearby literal/AP materializations:
    - 0x144e0d0: lea    rsi,[rip+0xfffffffffefe79b0]        # 435a87 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4d6>
    - 0x144e0d7: lea    rcx,[rip+0xfffffffffefe79b2]        # 435a90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4df>
    - 0x144e12c: lea    rax,[rip+0x3c001d]        # 180e150 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e10>
    - 0x144e144: lea    rsi,[rip+0x426f75]        # 18750c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x317a8>
    - 0x144e196: lea    rsi,[rip+0xfffffffffefe78c2]        # 435a5f <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4ae>
    - 0x144e19d: lea    rcx,[rip+0xfffffffffefe78cc]        # 435a70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4bf>
- bundle+0x30 load/ref @ 0x144e119: mov    rbx,QWORD PTR [r14+0x30]
  - loaded target register: rbx
  - target-derived uses:
    - 0x144e186: mov    rdi,QWORD PTR [rbx]
    - 0x144e1b7: mov    rdi,QWORD PTR [rbx]
  - nearby literal/AP materializations:
    - 0x144e12c: lea    rax,[rip+0x3c001d]        # 180e150 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e10>
    - 0x144e144: lea    rsi,[rip+0x426f75]        # 18750c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x317a8>
    - 0x144e196: lea    rsi,[rip+0xfffffffffefe78c2]        # 435a5f <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4ae>
    - 0x144e19d: lea    rcx,[rip+0xfffffffffefe78cc]        # 435a70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4bf>
    - 0x144e1c2: lea    rsi,[rip+0xfffffffffefe78be]        # 435a87 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4d6>

## ListPlayerSetupImpl
- descriptor AP: 0x185b8d0
- factory: 0x11ee608; FDE=0x11ee608..0x11ef027
- early aliases of rdx: r13, rdx
- bundle+0x30 load/ref @ 0x11ee986: mov    rax,QWORD PTR [r13+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x11ee9a0: call   QWORD PTR [rax+0x28]
    - 0x11ee9d0: call   QWORD PTR [rax+0x28]
    - 0x11ee9d9: call   QWORD PTR [rax+0x28]
    - 0x11ee9e7: call   QWORD PTR [rax+0x28]
    - 0x11ee9fa: call   QWORD PTR [rax+0x28]
    - 0x11eea17: mov    rcx,QWORD PTR [rax+0xb0]
    - 0x11eea26: mov    rax,QWORD PTR [rax+0xb8]
    - 0x11eea45: call   QWORD PTR [rax+0x30]
    - 0x11eea5a: call   QWORD PTR [rax+0x28]
    - 0x11eea7c: movups XMMWORD PTR [rax+0x8],xmm0
    - 0x11eea87: mov    QWORD PTR [r15],rax
    - 0x11eea8a: lea    r12,[r15+0x18]

## ShowCosmosSetupImpl
- descriptor AP: 0x1851990
- factory: 0x111a264; FDE=0x111a264..0x111b238
- early aliases of rdx: r13, rdx
- bundle+0x30 load/ref @ 0x111a341: mov    r14,QWORD PTR [r13+0x30]
  - loaded target register: r14
  - target-derived uses:
    - 0x111a3a7: mov    rbx,QWORD PTR [r14]
  - nearby literal/AP materializations:
    - 0x111a36c: lea    rcx,[rip+0x73765d]        # 18519d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe0b8>
    - 0x111a3aa: lea    rsi,[rip+0xffffffffff2be77e]        # 3d8b2f <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3714>
    - 0x111a3c9: lea    rsi,[rip+0xffffffffff26d085]        # 387455 <_ZTSSt12bad_any_cast@@Base-0x8d73>
    - 0x111a3e0: lea    rsi,[rip+0xffffffffff2be7e9]        # 3d8bd0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37b5>

## RecentlyPlayedEsperantoSetup
- descriptor AP: 0x184b5b0
- factory: 0x1098c64; FDE=0x1098c64..0x109900a
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0x1098ee6: movups XMMWORD PTR [r14+0x30],xmm0
  - nearby literal/AP materializations:
    - 0x1098ecd: lea    rax,[rip+0xffffffffffac943a]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
    - 0x1098ed8: lea    rax,[rip+0x12b]        # 109900a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260420>

## PlaylistCosmosCommonSetupImpl
- descriptor AP: 0x1848d08
- factory: 0x106dd98; FDE=0x106dd98..0x106e23f
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0x106ddde: mov    r13,QWORD PTR [r14+0x30]
  - loaded target register: r13
  - target-derived uses:
    - 0x106de12: mov    rbp,QWORD PTR [r13+0x0]
    - 0x106def2: mov    rsi,QWORD PTR [r13+0x0]
  - nearby literal/AP materializations:
    - 0x106ddf5: lea    rcx,[rip+0x7a05cc]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
    - 0x106de16: lea    rsi,[rip+0xffffffffff309946]        # 377763 <_ZTSSt12bad_any_cast@@Base-0x18a65>
    - 0x106de2f: lea    rsi,[rip+0xffffffffff319449]        # 38727f <_ZTSSt12bad_any_cast@@Base-0x8f49>
    - 0x106de43: lea    rsi,[rip+0xffffffffff3682e6]        # 3d6130 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd15>
    - 0x106de5a: lea    rsi,[rip+0xffffffffff2ba3f9]        # 32825a <_ZTSSt12bad_any_cast@@Base-0x67f6e>
    - 0x106de71: lea    rsi,[rip+0xffffffffff2d4e85]        # 342cfd <_ZTSSt12bad_any_cast@@Base-0x4d4cb>

## PlaylistCosmosSetupImpl
- descriptor AP: 0x1848d48
- factory: 0x106e2e0; FDE=0x106e2e0..0x106eb4f
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0x106e3b0: mov    r13,QWORD PTR [r14+0x30]
  - loaded target register: r13
  - target-derived uses:
    - 0x106e4a7: mov    rdi,QWORD PTR [r13+0x0]
    - 0x106e4b0: mov    rdi,QWORD PTR [r13+0x0]
  - nearby literal/AP materializations:
    - 0x106e414: lea    rcx,[rip+0x7da96d]        # 1848d88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5470>
- bundle+0x30 load/ref @ 0x106e3cd: mov    rax,QWORD PTR [r14+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x106e3d1: mov    rdi,QWORD PTR [rax]
    - 0x106e3e5: mov    rcx,QWORD PTR [rax]
    - 0x106e3eb: call   QWORD PTR [rcx+0x50]
    - 0x106e3fb: call   QWORD PTR [rax+0x28]
    - 0x106e410: mov    BYTE PTR [rax+0x8],0x0
    - 0x106e41b: mov    QWORD PTR [rax],rcx
    - 0x106e41e: lea    r14,[rax+0x10]
    - 0x106e422: lea    r15,[rax+0x18]
    - 0x106e426: lea    rcx,[rax+0x20]
    - 0x106e432: movups XMMWORD PTR [rax+0x10],xmm0
    - 0x106e436: movups XMMWORD PTR [rax+0x20],xmm0
    - 0x106e43a: and    QWORD PTR [rax+0x30],0x0
    - 0x106e45e: call   QWORD PTR [rcx+0x30]
    - 0x106e482: mov    QWORD PTR [rax],rcx
    - 0x106e485: mov    QWORD PTR [rax+0x8],rbx
    - 0x106e497: call   QWORD PTR [rax+0x8]
  - nearby literal/AP materializations:
    - 0x106e414: lea    rcx,[rip+0x7da96d]        # 1848d88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5470>

## PlaylistEsperantoSetupImpl
- descriptor AP: 0x1849578
- factory: 0x1076606; FDE=0x1076606..0x10776ba
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0x10767a0: mov    r13,QWORD PTR [rbx+0x30]
  - loaded target register: r13
  - target-derived uses:
    - 0x10768a5: mov    rdi,QWORD PTR [r13+0x0]
  - nearby literal/AP materializations:
    - 0x1076828: lea    rsi,[rip+0xffffffffff2dc54c]        # 352d7b <_ZTSSt12bad_any_cast@@Base-0x3d44d>

## PlaylistEsperantoPlaySetupImpl
- descriptor AP: 0x18493b8
- factory: 0x1074aca; FDE=0x1074aca..0x10759bb
- early aliases of rdx: r13, rdx
- bundle+0x30 load/ref @ 0x1074ba9: mov    rax,QWORD PTR [r13+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0x1074bad: mov    rdi,QWORD PTR [rax]
    - 0x1074bd1: call   QWORD PTR [rax+0x28]
    - 0x1074bee: call   QWORD PTR [rax+0x30]
    - 0x1074c03: call   QWORD PTR [rax+0x28]
    - 0x1074c11: call   QWORD PTR [rax+0x68]
    - 0x1074c2f: mov    rcx,QWORD PTR [rax]
    - 0x1074c3d: call   QWORD PTR [rcx+0x58]
    - 0x1074c58: mov    rsi,QWORD PTR [rax+0x438]
    - 0x1074c68: mov    rax,QWORD PTR [rsi]
    - 0x1074c73: call   QWORD PTR [rax+0x28]
    - 0x1074c98: mov    rcx,QWORD PTR [rax]
    - 0x1074ca6: call   QWORD PTR [rcx+0x28]
- bundle+0x30 load/ref @ 0x1074bf9: mov    r15,QWORD PTR [r13+0x30]
  - loaded target register: r15
- bundle+0x30 load/ref @ 0x107515b: mov    QWORD PTR [r13+0x30],rcx

## YourLibraryTagsSetupImpl
- descriptor AP: 0x1856c28
- factory: 0x1173426; FDE=0x1173426..0x1173f64
- early aliases of rdx: r13, rdx
- bundle+0x30 load/ref @ 0x11734ba: mov    r12,QWORD PTR [r13+0x30]
  - loaded target register: r12
  - target-derived uses:
    - 0x1173533: mov    rdi,QWORD PTR [r12]
    - 0x1173568: mov    rdi,QWORD PTR [r12]
  - nearby literal/AP materializations:
    - 0x11734dc: lea    rax,[rip+0x6e3785]        # 1856c68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x13350>
    - 0x1173537: lea    rbx,[rip+0xffffffffff266ab2]        # 3d9ff0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4bd5>
    - 0x117353e: lea    rbp,[rip+0xffffffffff266acb]        # 3da010 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4bf5>
- bundle+0x30 load/ref @ 0x117361c: movdqu XMMWORD PTR [rdx+0x30],xmm0
  - nearby literal/AP materializations:
    - 0x1173609: lea    rcx,[rip+0x734188]        # 18a7798 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x146d8>
    - 0x11736ae: lea    rax,[rip+0x6e36a3]        # 1856d58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x13440>
- bundle+0x30 load/ref @ 0x117380b: lea    r14,[r13+0x30]

## AutodownloadEsperantoSetup
- descriptor AP: 0x1849b88
- factory: 0x108067e; FDE=0x108067e..0x10808c9
- early aliases of rdx: r12, rdx
- bundle+0x30 load/ref @ 0x10807dc: movups XMMWORD PTR [r12+0x30],xmm0
  - nearby literal/AP materializations:
    - 0x10807c1: lea    rax,[rip+0xffffffffffae1b46]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
    - 0x10807cd: lea    rax,[rip+0xf6]        # 10808ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247ce0>

## OfflinePlayableCacheSetupImpl
- descriptor AP: 0x182a8f8
- factory: 0xdda4fa; FDE=0xdda4fa..0xddbda1
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0xdda5b6: mov    rax,QWORD PTR [r14+0x30]
  - loaded target register: rax
  - target-derived uses:
    - 0xdda5d4: call   QWORD PTR [rax+0x28]
    - 0xdda5e5: call   QWORD PTR [rax+0x28]
    - 0xdda60d: call   QWORD PTR [rax+0x28]
    - 0xdda610: mov    r15,QWORD PTR [rax+0x10]
    - 0xdda65f: mov    BYTE PTR [r14+0x8],0x0
    - 0xdda66b: mov    QWORD PTR [r14],rax
    - 0xdda66e: lea    rax,[r14+0x10]
    - 0xdda677: lea    rax,[r14+0x18]
    - 0xdda683: lea    rax,[r14+0x20]
    - 0xdda68f: lea    rax,[r14+0x28]
    - 0xdda69b: lea    rdi,[r14+0x30]
    - 0xdda6a3: movdqu XMMWORD PTR [r14+0x10],xmm0
    - 0xdda6a9: movdqu XMMWORD PTR [r14+0x20],xmm0
    - 0xdda6bc: and    QWORD PTR [r14+0x40],0x0
    - 0xdda6c1: lea    rax,[r14+0x40]
  - nearby literal/AP materializations:
    - 0xdda5ec: lea    r8,[rip+0xffffffffff5fff0d]        # 3da500 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x50e5>
    - 0xdda627: lea    rax,[rip+0xa5030a]        # 182a938 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6f68>
    - 0xdda664: lea    rax,[rip+0xa50315]        # 182a980 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6fb0>
- bundle+0x30 load/ref @ 0xdda69b: lea    rdi,[r14+0x30]
  - nearby literal/AP materializations:
    - 0xdda664: lea    rax,[rip+0xa50315]        # 182a980 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6fb0>
    - 0xdda6f9: lea    rsi,[rip+0xffffffffff5f67c0]        # 3d0ec0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d14>
    - 0xdda700: lea    rcx,[rip+0xffffffffff5f67dd]        # 3d0ee4 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d38>
    - 0xdda71d: lea    rsi,[rip+0xffffffffff5f67dc]        # 3d0f00 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d54>
    - 0xdda724: lea    rcx,[rip+0xffffffffff5f6805]        # 3d0f30 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d84>
    - 0xdda73d: lea    rsi,[rip+0xffffffffff5f67fc]        # 3d0f40 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d94>
    - 0xdda744: lea    rcx,[rip+0xffffffffff5f6825]        # 3d0f70 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1dc4>
- bundle+0x30 load/ref @ 0xddac2b: mov    QWORD PTR [r14+0x30],r13
  - nearby literal/AP materializations:
    - 0xddac01: lea    rax,[rip+0xa7e450]        # 1859058 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15740>

## OfflinePlayableCacheListProviderSetupImpl
- descriptor AP: 0x182a3f8
- factory: 0xdcdc4e; FDE=0xdcdc4e..0xdcecc2
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0xdcdcf2: mov    r13,QWORD PTR [rbx+0x30]
  - loaded target register: r13
  - target-derived uses:
    - 0xdcdd1a: mov    rdi,QWORD PTR [r13+0x0]
    - 0xdcdd3b: mov    rdi,QWORD PTR [r13+0x0]
    - 0xdcdd70: mov    rdi,QWORD PTR [r13+0x0]
    - 0xdcdd9a: mov    rdi,QWORD PTR [r13+0x0]
    - 0xdcddc4: mov    rdi,QWORD PTR [r13+0x0]
  - nearby literal/AP materializations:
    - 0xdcdd0b: lea    rcx,[rip+0xa404be]        # 180e1d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e90>
    - 0xdcdd1e: lea    rsi,[rip+0xffffffffff6030db]        # 3d0e00 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1c54>
    - 0xdcdd25: lea    rcx,[rip+0xffffffffff603104]        # 3d0e30 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1c84>
    - 0xdcdd45: lea    rsi,[rip+0xffffffffff602e34]        # 3d0b80 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x19d4>
    - 0xdcdd4c: lea    rcx,[rip+0xffffffffff602e4d]        # 3d0ba0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x19f4>
    - 0xdcdd74: lea    rsi,[rip+0xffffffffff602dc5]        # 3d0b40 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1994>
    - 0xdcdd7b: lea    rcx,[rip+0xffffffffff602dde]        # 3d0b60 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x19b4>

## SearchSetupImpl
- descriptor AP: 0x1850cd0
- factory: 0x10ff080; FDE=0x10ff080..0x10ff349
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0x10ff0ee: mov    r14,QWORD PTR [rbx+0x30]
  - loaded target register: r14
  - target-derived uses:
    - 0x10ff11a: mov    rdi,QWORD PTR [r14]
    - 0x10ff142: mov    rdi,QWORD PTR [r14]
  - nearby literal/AP materializations:
    - 0x10ff101: lea    rax,[rip+0x70f2c0]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
    - 0x10ff11d: lea    r15,[rip+0xffffffffff2d981c]        # 3d8940 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3525>
    - 0x10ff124: lea    rcx,[rip+0xffffffffff2d9835]        # 3d8960 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3545>
    - 0x10ff14b: lea    rcx,[rip+0xffffffffff2d980e]        # 3d8960 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3545>

## YourLibrarySetupImpl
- descriptor AP: 0x1854eb0
- factory: 0x1147c20; FDE=0x1147c20..0x114922c
- early aliases of rdx: r14, rdx
- bundle+0x30 load/ref @ 0x1147ce5: mov    rbx,QWORD PTR [r14+0x30]
  - loaded target register: rbx
  - nearby literal/AP materializations:
    - 0x1147d00: lea    rcx,[rip+0x70d1e9]        # 1854ef0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x115d8>
    - 0x1147d91: lea    rsi,[rip+0xffffffffff242f6c]        # 38ad04 <_ZTSSt12bad_any_cast@@Base-0x54c4>

## YourLibraryEsperantoSetup
- descriptor AP: 0x1854e70
- factory: 0x1147474; FDE=0x1147474..0x1147af2
- early aliases of rdx: rbx, rdx
- bundle+0x30 load/ref @ 0x114791c: movups XMMWORD PTR [rbx+0x30],xmm0
  - nearby literal/AP materializations:
    - 0x11478ed: lea    rax,[rip+0x7298f4]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
    - 0x1147903: lea    rax,[rip+0xffffffffff934b5a]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
    - 0x114790e: lea    rax,[rip+0x22d]        # 1147b42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ef58>

## MftLensPocSetup
- descriptor AP: 0x1848ac0
- factory: 0x106ade2; FDE=0x106ade2..0x106b59c
- early aliases of rdx: r15, rdx
- bundle+0x30 load/ref @ 0x106ae3d: mov    r13,QWORD PTR [r15+0x30]
  - loaded target register: r13
  - target-derived uses:
    - 0x106aed9: mov    rdi,QWORD PTR [r13+0x0]
    - 0x106af01: mov    rdi,QWORD PTR [r13+0x0]
    - 0x106af21: mov    rdi,QWORD PTR [r13+0x0]
    - 0x106af42: mov    rdi,QWORD PTR [r13+0x0]
  - nearby literal/AP materializations:
    - 0x106ae83: lea    rax,[rip+0x7ddc76]        # 1848b00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x51e8>
    - 0x106aedd: lea    rsi,[rip+0xffffffffff36b09c]        # 3d5f80 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb65>
    - 0x106aee4: lea    r12,[rip+0xffffffffff36b0b5]        # 3d5fa0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb85>
- bundle+0x30 load/ref @ 0x106b0fd: lea    rdi,[r15+0x30]
  - nearby literal/AP materializations:
    - 0x106b0d6: lea    rcx,[rip+0x7ddafb]        # 1848bd8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x52c0>

## Shared-bundle constructor/populator candidates
Candidates require stores to at least four exact factory-consumed offsets on one base register.
### rank 1: score=21 FDE=0xa1a840..0xa1ab9e base=r14 offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0xa1a8b1: mov    QWORD PTR [r14+0x20],rcx
- 0xa1a8d1: mov    QWORD PTR [r14+0x30],rcx
- 0xa1a903: mov    QWORD PTR [r14+0x40],r8
- 0xa1a982: mov    QWORD PTR [r14+0x40],rcx
- 0xa1a995: mov    QWORD PTR [r14+0x40],r8
- 0xa1a9dc: mov    QWORD PTR [r14+0x60],rsi
- 0xa1a9ec: mov    QWORD PTR [r14+0x68],rsi
- 0xa1aa22: mov    QWORD PTR [r14+0x80],rsi
- 0xa1aa75: mov    DWORD PTR [r14+0x98],esi
- 0xa1ab18: mov    QWORD PTR [r14+0x30],rdx
- 0xa1ab66: mov    QWORD PTR [r14+0x20],rsi
  - context around +0x30 store:
      a1a899:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
      a1a89d:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      a1a8a1:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx
      a1a8a5:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      a1a8a9:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
      a1a8ad:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
      a1a8b1:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
      a1a8b5:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      a1a8b9:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
      a1a8bd:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      a1a8c1:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
      a1a8c5:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      a1a8c9:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
      a1a8cd:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
      a1a8d1:	49 89 4e 30          	mov    QWORD PTR [r14+0x30],rcx
      a1a8d5:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
      a1a8d9:	49 8b 46 38          	mov    rax,QWORD PTR [r14+0x38]
      a1a8dd:	48 8b 4b 38          	mov    rcx,QWORD PTR [rbx+0x38]
      a1a8e1:	49 89 4e 38          	mov    QWORD PTR [r14+0x38],rcx
      a1a8e5:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      a1a8e9:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      a1a8ed:	49 8d 4e 58          	lea    rcx,[r14+0x58]
      a1a8f1:	48 8d 43 58          	lea    rax,[rbx+0x58]
      a1a8f5:	4c 8b 43 40          	mov    r8,QWORD PTR [rbx+0x40]
      a1a8f9:	48 39 cf             	cmp    rdi,rcx
      a1a8fc:	74 32                	je     a1a930 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE4swapERS3_@@Base+0xf0>
      a1a8fe:	49 39 c0             	cmp    r8,rax
      a1a901:	74 2d                	je     a1a930 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE4swapERS3_@@Base+0xf0>
      a1a903:	4d 89 46 40          	mov    QWORD PTR [r14+0x40],r8
      a1a907:	48 89 7b 40          	mov    QWORD PTR [rbx+0x40],rdi
      a1a90b:	49 8b 56 48          	mov    rdx,QWORD PTR [r14+0x48]
      a1a90f:	48 8b 73 48          	mov    rsi,QWORD PTR [rbx+0x48]
      a1a913:	49 89 76 48          	mov    QWORD PTR [r14+0x48],rsi
      a1a917:	48 89 53 48          	mov    QWORD PTR [rbx+0x48],rdx
      a1a91b:	49 8b 56 50          	mov    rdx,QWORD PTR [r14+0x50]
      a1a91f:	48 8b 73 50          	mov    rsi,QWORD PTR [rbx+0x50]
      a1a923:	49 89 76 50          	mov    QWORD PTR [r14+0x50],rsi
      a1a927:	48 89 53 50          	mov    QWORD PTR [rbx+0x50],rdx
      a1a92b:	e9 a4 00 00 00       	jmp    a1a9d4 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE4swapERS3_@@Base+0x194>
      a1a930:	49 8b 76 48          	mov    rsi,QWORD PTR [r14+0x48]

### rank 2: score=21 FDE=0xa1a840..0xa1ab9e base=rbx offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0xa1a8b5: mov    QWORD PTR [rbx+0x20],rax
- 0xa1a8d5: mov    QWORD PTR [rbx+0x30],rax
- 0xa1a907: mov    QWORD PTR [rbx+0x40],rdi
- 0xa1a97e: mov    QWORD PTR [rbx+0x40],rdi
- 0xa1a999: mov    QWORD PTR [rbx+0x40],rax
- 0xa1a9e0: mov    QWORD PTR [rbx+0x60],rdx
- 0xa1a9f0: mov    QWORD PTR [rbx+0x68],rdx
- 0xa1aa29: mov    QWORD PTR [rbx+0x80],rdx
- 0xa1aa7c: mov    DWORD PTR [rbx+0x98],edx
- 0xa1ab44: mov    QWORD PTR [rbx+0x30],rdx
- 0xa1ab8c: mov    QWORD PTR [rbx+0x20],rsi
  - context around +0x30 store:
      a1a89d:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      a1a8a1:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx
      a1a8a5:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      a1a8a9:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
      a1a8ad:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
      a1a8b1:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
      a1a8b5:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      a1a8b9:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
      a1a8bd:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      a1a8c1:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
      a1a8c5:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      a1a8c9:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
      a1a8cd:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
      a1a8d1:	49 89 4e 30          	mov    QWORD PTR [r14+0x30],rcx
      a1a8d5:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
      a1a8d9:	49 8b 46 38          	mov    rax,QWORD PTR [r14+0x38]
      a1a8dd:	48 8b 4b 38          	mov    rcx,QWORD PTR [rbx+0x38]
      a1a8e1:	49 89 4e 38          	mov    QWORD PTR [r14+0x38],rcx
      a1a8e5:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      a1a8e9:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      a1a8ed:	49 8d 4e 58          	lea    rcx,[r14+0x58]
      a1a8f1:	48 8d 43 58          	lea    rax,[rbx+0x58]
      a1a8f5:	4c 8b 43 40          	mov    r8,QWORD PTR [rbx+0x40]
      a1a8f9:	48 39 cf             	cmp    rdi,rcx
      a1a8fc:	74 32                	je     a1a930 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE4swapERS3_@@Base+0xf0>
      a1a8fe:	49 39 c0             	cmp    r8,rax
      a1a901:	74 2d                	je     a1a930 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE4swapERS3_@@Base+0xf0>
      a1a903:	4d 89 46 40          	mov    QWORD PTR [r14+0x40],r8
      a1a907:	48 89 7b 40          	mov    QWORD PTR [rbx+0x40],rdi
      a1a90b:	49 8b 56 48          	mov    rdx,QWORD PTR [r14+0x48]
      a1a90f:	48 8b 73 48          	mov    rsi,QWORD PTR [rbx+0x48]
      a1a913:	49 89 76 48          	mov    QWORD PTR [r14+0x48],rsi
      a1a917:	48 89 53 48          	mov    QWORD PTR [rbx+0x48],rdx
      a1a91b:	49 8b 56 50          	mov    rdx,QWORD PTR [r14+0x50]
      a1a91f:	48 8b 73 50          	mov    rsi,QWORD PTR [rbx+0x50]
      a1a923:	49 89 76 50          	mov    QWORD PTR [r14+0x50],rsi
      a1a927:	48 89 53 50          	mov    QWORD PTR [rbx+0x50],rdx
      a1a92b:	e9 a4 00 00 00       	jmp    a1a9d4 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE4swapERS3_@@Base+0x194>
      a1a930:	49 8b 76 48          	mov    rsi,QWORD PTR [r14+0x48]
      a1a934:	4d 8b 4e 50          	mov    r9,QWORD PTR [r14+0x50]

### rank 3: score=21 FDE=0xcec92c..0xced213 base=rdi offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0xcec95f: movups XMMWORD PTR [rdi+0x20],xmm0
- 0xcec96c: mov    QWORD PTR [rdi+0x20],rax
- 0xcec97c: mov    QWORD PTR [rdi+0x30],rax
- 0xcec99e: mov    QWORD PTR [rdi+0x40],rax
- 0xcec9d0: mov    QWORD PTR [rdi+0x60],rax
- 0xcec9e2: movups XMMWORD PTR [rdi+0x68],xmm0
- 0xcec9ea: mov    QWORD PTR [rdi+0x68],rax
- 0xceca07: movups XMMWORD PTR [rdi+0x80],xmm0
- 0xceca1d: mov    QWORD PTR [rdi+0x80],rax
- 0xceca57: movups XMMWORD PTR [rdi+0x98],xmm0
- 0xceca65: mov    QWORD PTR [rdi+0x98],rax
  - context around +0x30 store:
      cec942:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      cec946:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      cec94a:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      cec94e:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
      cec952:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
      cec956:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
      cec95a:	48 83 66 18 00       	and    QWORD PTR [rsi+0x18],0x0
      cec95f:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
      cec963:	48 83 67 30 00       	and    QWORD PTR [rdi+0x30],0x0
      cec968:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
      cec96c:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
      cec970:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
      cec974:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      cec978:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
      cec97c:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
      cec980:	48 83 66 30 00       	and    QWORD PTR [rsi+0x30],0x0
      cec985:	0f 11 46 20          	movups XMMWORD PTR [rsi+0x20],xmm0
      cec989:	48 83 67 48 00       	and    QWORD PTR [rdi+0x48],0x0
      cec98e:	0f 11 47 38          	movups XMMWORD PTR [rdi+0x38],xmm0
      cec992:	48 8b 46 38          	mov    rax,QWORD PTR [rsi+0x38]
      cec996:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
      cec99a:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
      cec99e:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
      cec9a2:	48 8b 46 48          	mov    rax,QWORD PTR [rsi+0x48]
      cec9a6:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
      cec9aa:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
      cec9ae:	48 83 66 48 00       	and    QWORD PTR [rsi+0x48],0x0
      cec9b3:	0f 11 47 50          	movups XMMWORD PTR [rdi+0x50],xmm0
      cec9b7:	48 83 67 60 00       	and    QWORD PTR [rdi+0x60],0x0
      cec9bc:	48 8b 46 50          	mov    rax,QWORD PTR [rsi+0x50]
      cec9c0:	48 89 47 50          	mov    QWORD PTR [rdi+0x50],rax
      cec9c4:	48 8b 46 58          	mov    rax,QWORD PTR [rsi+0x58]
      cec9c8:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
      cec9cc:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
      cec9d0:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
      cec9d4:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
      cec9d9:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
      cec9dd:	48 83 67 78 00       	and    QWORD PTR [rdi+0x78],0x0
      cec9e2:	0f 11 47 68          	movups XMMWORD PTR [rdi+0x68],xmm0
      cec9e6:	48 8b 46 68          	mov    rax,QWORD PTR [rsi+0x68]

### rank 4: score=21 FDE=0xee55c2..0xee6102 base=rdi offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0xee55e8: mov    QWORD PTR [rdi+0x20],rax
- 0xee560a: mov    QWORD PTR [rdi+0x30],rax
- 0xee5624: movups XMMWORD PTR [rdi+0x40],xmm0
- 0xee562c: mov    QWORD PTR [rdi+0x40],rax
- 0xee565e: mov    QWORD PTR [rdi+0x60],rax
- 0xee5666: mov    QWORD PTR [rdi+0x68],rax
- 0xee5696: mov    QWORD PTR [rdi+0x80],rax
- 0xee56db: mov    QWORD PTR [rdi+0x98],rax
  - context around +0x30 store:
      ee55d0:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      ee55d4:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      ee55d8:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ee55dc:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
      ee55e0:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
      ee55e4:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
      ee55e8:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
      ee55ec:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
      ee55f0:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
      ee55f5:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
      ee55f9:	48 83 67 38 00       	and    QWORD PTR [rdi+0x38],0x0
      ee55fe:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
      ee5602:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      ee5606:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
      ee560a:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
      ee560e:	48 8b 46 38          	mov    rax,QWORD PTR [rsi+0x38]
      ee5612:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
      ee5616:	48 83 66 38 00       	and    QWORD PTR [rsi+0x38],0x0
      ee561b:	0f 11 46 28          	movups XMMWORD PTR [rsi+0x28],xmm0
      ee561f:	48 83 67 50 00       	and    QWORD PTR [rdi+0x50],0x0
      ee5624:	0f 11 47 40          	movups XMMWORD PTR [rdi+0x40],xmm0
      ee5628:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
      ee562c:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
      ee5630:	48 8b 46 48          	mov    rax,QWORD PTR [rsi+0x48]
      ee5634:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
      ee5638:	48 8b 46 50          	mov    rax,QWORD PTR [rsi+0x50]
      ee563c:	48 89 47 50          	mov    QWORD PTR [rdi+0x50],rax
      ee5640:	0f 11 46 40          	movups XMMWORD PTR [rsi+0x40],xmm0
      ee5644:	48 83 66 50 00       	and    QWORD PTR [rsi+0x50],0x0
      ee5649:	0f 11 47 58          	movups XMMWORD PTR [rdi+0x58],xmm0
      ee564d:	48 83 67 68 00       	and    QWORD PTR [rdi+0x68],0x0
      ee5652:	48 8b 46 58          	mov    rax,QWORD PTR [rsi+0x58]
      ee5656:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
      ee565a:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
      ee565e:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
      ee5662:	48 8b 46 68          	mov    rax,QWORD PTR [rsi+0x68]
      ee5666:	48 89 47 68          	mov    QWORD PTR [rdi+0x68],rax
      ee566a:	48 83 66 68 00       	and    QWORD PTR [rsi+0x68],0x0
      ee566f:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
      ee5673:	48 83 a7 80 00 00 00 	and    QWORD PTR [rdi+0x80],0x0

### rank 5: score=21 FDE=0xef91cc..0xefe62b base=r15 offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0xef9394: movdqa XMMWORD PTR [r15+0x20],xmm0
- 0xef93ff: mov    QWORD PTR [r15+0x20],rbp
- 0xefa991: movups XMMWORD PTR [r15+0x20],xmm0
- 0xefa9a6: movups XMMWORD PTR [r15+0x30],xmm0
- 0xefa9b3: movups XMMWORD PTR [r15+0x40],xmm0
- 0xefa9cd: movups XMMWORD PTR [r15+0x60],xmm0
- 0xefa9e7: movups XMMWORD PTR [r15+0x80],xmm0
- 0xefaa22: mov    QWORD PTR [r15+0x20],rbx
- 0xefacbc: mov    QWORD PTR [r15+0x20],rax
- 0xefacc4: movdqa XMMWORD PTR [r15+0x30],xmm1
- 0xefaceb: mov    QWORD PTR [r15+0x20],rax
- 0xefad0f: mov    QWORD PTR [r15+0x20],rax
- 0xefad29: mov    QWORD PTR [r15+0x60],r13
- 0xefad32: mov    QWORD PTR [r15+0x68],r12
- 0xefb250: mov    QWORD PTR [r15+0x20],rax
- 0xefb28e: mov    QWORD PTR [r15+0x20],rax
- 0xefb2af: mov    QWORD PTR [r15+0x20],rax
- 0xefb2d3: mov    QWORD PTR [r15+0x20],rax
- 0xefb2f4: mov    QWORD PTR [r15+0x20],rax
- 0xefb325: mov    BYTE PTR [r15+0x68],0x0
- 0xefb33f: mov    QWORD PTR [r15+0x80],rax
- 0xefc7f3: mov    QWORD PTR [r15+0x20],rax
- 0xefc824: mov    QWORD PTR [r15+0x20],rax
- 0xefc83f: mov    QWORD PTR [r15+0x20],rax
- 0xefc90b: mov    QWORD PTR [r15+0x20],rax
- 0xefca91: mov    QWORD PTR [r15+0x20],r13
- 0xefca99: mov    QWORD PTR [r15+0x30],r12
- 0xefcc21: mov    QWORD PTR [r15+0x20],rax
- 0xefcc52: mov    QWORD PTR [r15+0x20],rax
- 0xefcc6d: mov    QWORD PTR [r15+0x20],rax
- 0xefcea1: mov    QWORD PTR [r15+0x20],rax
- 0xefcece: mov    QWORD PTR [r15+0x20],rax
- 0xefcee9: mov    QWORD PTR [r15+0x20],rax
- 0xefcf00: mov    BYTE PTR [r15+0x68],al
- 0xefcf11: mov    BYTE PTR [r15+0x80],al
- 0xefcf18: mov    BYTE PTR [r15+0x98],al
- 0xefd017: mov    QWORD PTR [r15+0x20],rax
- 0xefd044: mov    QWORD PTR [r15+0x20],rax
- 0xefd05f: mov    QWORD PTR [r15+0x20],rax
- 0xefd173: mov    QWORD PTR [r15+0x20],rax
- 0xefd1a0: mov    QWORD PTR [r15+0x20],rax
- 0xefd1bb: mov    QWORD PTR [r15+0x20],rax
- 0xefd2ab: mov    QWORD PTR [r15+0x20],rax
- 0xefd2d8: mov    QWORD PTR [r15+0x20],rax
- 0xefd2f3: mov    QWORD PTR [r15+0x20],rax
- 0xefd308: mov    BYTE PTR [r15+0x60],0x0
- 0xefd73a: mov    QWORD PTR [r15+0x20],rax
- 0xefd76b: mov    QWORD PTR [r15+0x20],rax
- 0xefd786: mov    QWORD PTR [r15+0x20],rax
- 0xefd7b2: mov    BYTE PTR [r15+0x60],al
- 0xefd880: mov    QWORD PTR [r15+0x20],rax
- 0xefd8b1: mov    QWORD PTR [r15+0x20],rax
- 0xefd8cc: mov    QWORD PTR [r15+0x20],rax
- 0xefd8ed: mov    BYTE PTR [r15+0x60],al
  - context around +0x30 store:
      efa969:	48 85 c0             	test   rax,rax
      efa96c:	74 05                	je     efa973 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1d89>
      efa96e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efa973:	bf b0 00 00 00       	mov    edi,0xb0
      efa978:	e8 83 35 8f 00       	call   17edf00 <_Znwm@plt>
      efa97d:	49 89 c7             	mov    r15,rax
      efa980:	0f 57 c0             	xorps  xmm0,xmm0
      efa983:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      efa987:	48 8d 05 da 2a 90 00 	lea    rax,[rip+0x902ada]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa98e:	49 89 07             	mov    QWORD PTR [r15],rax
      efa991:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      efa996:	48 8d 05 33 a1 94 00 	lea    rax,[rip+0x94a133]        # 1844ad0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11b8>
      efa99d:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efa9a1:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]
      efa9a6:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
      efa9ab:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
      efa9b2:	00 
      efa9b3:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0
      efa9b8:	0f 28 84 24 c0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xc0]
      efa9bf:	00 
      efa9c0:	41 0f 11 47 50       	movups XMMWORD PTR [r15+0x50],xmm0
      efa9c5:	0f 28 84 24 10 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x110]
      efa9cc:	00 
      efa9cd:	41 0f 11 47 60       	movups XMMWORD PTR [r15+0x60],xmm0
      efa9d2:	0f 28 84 24 60 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x160]
      efa9d9:	00 
      efa9da:	41 0f 11 47 70       	movups XMMWORD PTR [r15+0x70],xmm0
      efa9df:	0f 28 84 24 50 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x150]
      efa9e6:	00 
      efa9e7:	41 0f 11 87 80 00 00 	movups XMMWORD PTR [r15+0x80],xmm0
      efa9ee:	00 
      efa9ef:	0f 28 84 24 40 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x140]
      efa9f6:	00 
      efa9f7:	41 0f 11 87 90 00 00 	movups XMMWORD PTR [r15+0x90],xmm0
      efa9fe:	00 
      efa9ff:	66 0f 6f 84 24 30 01 	movdqa xmm0,XMMWORD PTR [rsp+0x130]
      efaa06:	00 00 
      efaa08:	f3 41 0f 7f 87 a0 00 	movdqu XMMWORD PTR [r15+0xa0],xmm0
      efaa0f:	00 00 
      efaa11:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]

### rank 6: score=21 FDE=0x1096a74..0x1096d00 base=rbx offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x1096ab6: movups XMMWORD PTR [rbx+0x20],xmm0
- 0x1096aeb: mov    QWORD PTR [rbx+0x30],rax
- 0x1096b19: mov    QWORD PTR [rbx+0x40],rax
- 0x1096b75: mov    QWORD PTR [rbx+0x60],rax
- 0x1096b8b: mov    QWORD PTR [rbx+0x68],rax
- 0x1096bd3: mov    QWORD PTR [rbx+0x80],rax
- 0x1096c2a: mov    QWORD PTR [rbx+0x98],rax
  - context around +0x30 store:
     1096ab6:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     1096aba:	41 83 7e 20 00       	cmp    DWORD PTR [r14+0x20],0x0
     1096abf:	74 17                	je     1096ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25deee>
     1096ac1:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     1096ac5:	49 8d 76 18          	lea    rsi,[r14+0x18]
     1096ac9:	48 8d 15 ea 2a 55 00 	lea    rdx,[rip+0x552aea]        # 15e95ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eb3e>
     1096ad0:	e8 b1 bc 6e 00       	call   1782786 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1368f2>
     1096ad5:	8b 6b 10             	mov    ebp,DWORD PTR [rbx+0x10]
     1096ad8:	40 f6 c5 01          	test   bpl,0x1
     1096adc:	75 04                	jne    1096ae2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25def8>
     1096ade:	31 c0                	xor    eax,eax
     1096ae0:	eb 09                	jmp    1096aeb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25df01>
     1096ae2:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     1096ae6:	e8 51 2b 55 00       	call   15e963c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ebc0>
     1096aeb:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     1096aef:	40 f6 c5 02          	test   bpl,0x2
     1096af3:	75 04                	jne    1096af9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25df0f>
     1096af5:	31 c0                	xor    eax,eax
     1096af7:	eb 09                	jmp    1096b02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25df18>
     1096af9:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
     1096afd:	e8 3a 2b 55 00       	call   15e963c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ebc0>
     1096b02:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
     1096b06:	40 f6 c5 04          	test   bpl,0x4
     1096b0a:	75 04                	jne    1096b10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25df26>
     1096b0c:	31 c0                	xor    eax,eax
     1096b0e:	eb 09                	jmp    1096b19 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25df2f>
     1096b10:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
     1096b14:	e8 87 2b 55 00       	call   15e96a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ec24>
     1096b19:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
     1096b1d:	40 f6 c5 08          	test   bpl,0x8
     1096b21:	75 04                	jne    1096b27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25df3d>
     1096b23:	31 c0                	xor    eax,eax
     1096b25:	eb 09                	jmp    1096b30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25df46>
     1096b27:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
     1096b2b:	e8 70 2b 55 00       	call   15e96a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ec24>
     1096b30:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     1096b34:	40 f6 c5 10          	test   bpl,0x10
     1096b38:	75 04                	jne    1096b3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25df54>
     1096b3a:	31 c0                	xor    eax,eax
     1096b3c:	eb 09                	jmp    1096b47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25df5d>

### rank 7: score=21 FDE=0x10c157e..0x10c23e0 base=r14 offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x10c1d3a: movups XMMWORD PTR [r14+0x20],xmm0
- 0x10c1d4e: mov    QWORD PTR [r14+0x30],rax
- 0x10c1d6b: movups XMMWORD PTR [r14+0x40],xmm0
- 0x10c1dae: mov    QWORD PTR [r14+0x60],rax
- 0x10c1db6: mov    QWORD PTR [r14+0x68],rax
- 0x10c1dce: mov    QWORD PTR [r14+0x80],rax
- 0x10c1e25: mov    QWORD PTR [r14+0x98],rax
  - context around +0x30 store:
     10c1d0e:	48 8d 05 53 b7 73 00 	lea    rax,[rip+0x73b753]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     10c1d15:	49 89 06             	mov    QWORD PTR [r14],rax
     10c1d18:	8a 9c 24 a8 01 00 00 	mov    bl,BYTE PTR [rsp+0x1a8]
     10c1d1f:	48 8d 05 f2 d5 78 00 	lea    rax,[rip+0x78d5f2]        # 184f318 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xba00>
     10c1d26:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     10c1d2a:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     10c1d31:	00 
     10c1d32:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
     10c1d39:	00 
     10c1d3a:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     10c1d3f:	48 85 c0             	test   rax,rax
     10c1d42:	74 05                	je     10c1d49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28915f>
     10c1d44:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10c1d49:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     10c1d4e:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     10c1d52:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     10c1d57:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     10c1d5b:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
     10c1d62:	00 
     10c1d63:	0f 28 84 24 80 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x80]
     10c1d6a:	00 
     10c1d6b:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     10c1d70:	48 85 c0             	test   rax,rax
     10c1d73:	74 05                	je     10c1d7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x289190>
     10c1d75:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10c1d7a:	48 8d bc 24 a8 02 00 	lea    rdi,[rsp+0x2a8]
     10c1d81:	00 
     10c1d82:	48 8d b4 24 d8 01 00 	lea    rsi,[rsp+0x1d8]
     10c1d89:	00 
     10c1d8a:	e8 73 44 01 00       	call   10d6202 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29d618>
     10c1d8f:	48 8d 05 24 e5 29 ff 	lea    rax,[rip+0xffffffffff29e524]        # 3602ba <_ZTSSt12bad_any_cast@@Base-0x2ff0e>
     10c1d96:	48 8d bc 24 c8 02 00 	lea    rdi,[rsp+0x2c8]
     10c1d9d:	00 
     10c1d9e:	48 89 47 e8          	mov    QWORD PTR [rdi-0x18],rax
     10c1da2:	48 c7 47 f0 1c 00 00 	mov    QWORD PTR [rdi-0x10],0x1c
     10c1da9:	00 
     10c1daa:	48 8b 47 f0          	mov    rax,QWORD PTR [rdi-0x10]
     10c1dae:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
     10c1db2:	48 8b 47 f8          	mov    rax,QWORD PTR [rdi-0x8]
     10c1db6:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax

### rank 8: score=21 FDE=0x1145c8a..0x1146a50 base=r13 offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x1145d43: movups XMMWORD PTR [r13+0x20],xmm0
- 0x1145d58: mov    QWORD PTR [r13+0x40],rbp
- 0x1145d68: mov    QWORD PTR [r13+0x60],rbp
- 0x1145d6c: mov    QWORD PTR [r13+0x68],rbp
- 0x1145d78: mov    QWORD PTR [r13+0x80],rbp
- 0x1145d8d: mov    QWORD PTR [r13+0x98],rbp
- 0x1145fb4: movups XMMWORD PTR [r13+0x20],xmm0
- 0x1146066: mov    QWORD PTR [r13+0x20],rbp
- 0x114613a: movups XMMWORD PTR [r13+0x20],xmm0
- 0x1146146: mov    QWORD PTR [r13+0x30],rbp
- 0x114614e: mov    QWORD PTR [r13+0x40],rbp
- 0x114615e: mov    QWORD PTR [r13+0x60],rbp
- 0x1146162: mov    QWORD PTR [r13+0x68],rbp
- 0x114616e: mov    QWORD PTR [r13+0x80],rbp
- 0x1146183: mov    QWORD PTR [r13+0x98],rbp
- 0x11463c4: movups XMMWORD PTR [r13+0x20],xmm0
- 0x1146472: mov    QWORD PTR [r13+0x20],rbp
- 0x114647a: mov    QWORD PTR [r13+0x30],rbp
- 0x1146482: mov    QWORD PTR [r13+0x40],rbp
- 0x1146492: mov    QWORD PTR [r13+0x60],rbp
- 0x1146496: mov    QWORD PTR [r13+0x68],rbp
- 0x11464a2: mov    QWORD PTR [r13+0x80],rbp
- 0x11464b7: mov    QWORD PTR [r13+0x98],rbp
  - context around +0x30 store:
     1146107:	00 
     1146108:	48 8d b4 24 98 04 00 	lea    rsi,[rsp+0x498]
     114610f:	00 
     1146110:	e8 4b 89 60 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
     1146115:	e9 42 06 00 00       	jmp    114675c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30db72>
     114611a:	4c 8d ac 24 98 04 00 	lea    r13,[rsp+0x498]
     1146121:	00 
     1146122:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
     1146127:	48 8d 05 f2 e9 70 00 	lea    rax,[rip+0x70e9f2]        # 1854b20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11208>
     114612e:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     1146132:	0f 57 c0             	xorps  xmm0,xmm0
     1146135:	41 0f 11 45 10       	movups XMMWORD PTR [r13+0x10],xmm0
     114613a:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
     114613f:	48 8d 2d b2 96 2f ff 	lea    rbp,[rip+0xffffffffff2f96b2]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1146146:	49 89 6d 30          	mov    QWORD PTR [r13+0x30],rbp
     114614a:	49 89 6d 38          	mov    QWORD PTR [r13+0x38],rbp
     114614e:	49 89 6d 40          	mov    QWORD PTR [r13+0x40],rbp
     1146152:	49 89 6d 48          	mov    QWORD PTR [r13+0x48],rbp
     1146156:	49 89 6d 50          	mov    QWORD PTR [r13+0x50],rbp
     114615a:	49 89 6d 58          	mov    QWORD PTR [r13+0x58],rbp
     114615e:	49 89 6d 60          	mov    QWORD PTR [r13+0x60],rbp
     1146162:	49 89 6d 68          	mov    QWORD PTR [r13+0x68],rbp
     1146166:	49 89 6d 70          	mov    QWORD PTR [r13+0x70],rbp
     114616a:	49 89 6d 78          	mov    QWORD PTR [r13+0x78],rbp
     114616e:	49 89 ad 80 00 00 00 	mov    QWORD PTR [r13+0x80],rbp
     1146175:	49 89 ad 88 00 00 00 	mov    QWORD PTR [r13+0x88],rbp
     114617c:	49 89 ad 90 00 00 00 	mov    QWORD PTR [r13+0x90],rbp
     1146183:	49 89 ad 98 00 00 00 	mov    QWORD PTR [r13+0x98],rbp
     114618a:	49 89 ad a0 00 00 00 	mov    QWORD PTR [r13+0xa0],rbp
     1146191:	49 89 ad a8 00 00 00 	mov    QWORD PTR [r13+0xa8],rbp
     1146198:	49 89 ad b0 00 00 00 	mov    QWORD PTR [r13+0xb0],rbp
     114619f:	49 89 ad b8 00 00 00 	mov    QWORD PTR [r13+0xb8],rbp
     11461a6:	41 0f 11 85 dc 00 00 	movups XMMWORD PTR [r13+0xdc],xmm0
     11461ad:	00 
     11461ae:	41 0f 11 85 d0 00 00 	movups XMMWORD PTR [r13+0xd0],xmm0
     11461b5:	00 
     11461b6:	41 0f 11 85 c0 00 00 	movups XMMWORD PTR [r13+0xc0],xmm0
     11461bd:	00 
     11461be:	49 83 c4 30          	add    r12,0x30
     11461c2:	4c 89 e7             	mov    rdi,r12

### rank 9: score=21 FDE=0x1147056..0x114712a base=rdi offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x1147070: movups XMMWORD PTR [rdi+0x20],xmm0
- 0x1147074: mov    QWORD PTR [rdi+0x30],rsi
- 0x1147083: mov    QWORD PTR [rdi+0x40],rax
- 0x1147093: mov    QWORD PTR [rdi+0x60],rax
- 0x1147097: mov    QWORD PTR [rdi+0x68],rax
- 0x11470a3: mov    QWORD PTR [rdi+0x80],rax
- 0x11470b8: mov    QWORD PTR [rdi+0x98],rax
  - context around +0x30 store:
     1147056:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
     114705a:	48 8d 05 07 dc 70 00 	lea    rax,[rip+0x70dc07]        # 1854c68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11350>
     1147061:	48 89 07             	mov    QWORD PTR [rdi],rax
     1147064:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     1147069:	83 67 18 00          	and    DWORD PTR [rdi+0x18],0x0
     114706d:	0f 57 c0             	xorps  xmm0,xmm0
     1147070:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
     1147074:	48 89 77 30          	mov    QWORD PTR [rdi+0x30],rsi
     1147078:	48 8d 05 79 87 2f ff 	lea    rax,[rip+0xffffffffff2f8779]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     114707f:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
     1147083:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
     1147087:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
     114708b:	48 89 47 50          	mov    QWORD PTR [rdi+0x50],rax
     114708f:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
     1147093:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
     1147097:	48 89 47 68          	mov    QWORD PTR [rdi+0x68],rax
     114709b:	48 89 47 70          	mov    QWORD PTR [rdi+0x70],rax
     114709f:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     11470a3:	48 89 87 80 00 00 00 	mov    QWORD PTR [rdi+0x80],rax
     11470aa:	48 89 87 88 00 00 00 	mov    QWORD PTR [rdi+0x88],rax
     11470b1:	48 89 87 90 00 00 00 	mov    QWORD PTR [rdi+0x90],rax
     11470b8:	48 89 87 98 00 00 00 	mov    QWORD PTR [rdi+0x98],rax
     11470bf:	48 89 87 a0 00 00 00 	mov    QWORD PTR [rdi+0xa0],rax
     11470c6:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     11470cd:	48 89 87 e0 00 00 00 	mov    QWORD PTR [rdi+0xe0],rax
     11470d4:	48 89 87 e8 00 00 00 	mov    QWORD PTR [rdi+0xe8],rax
     11470db:	48 89 87 f0 00 00 00 	mov    QWORD PTR [rdi+0xf0],rax
     11470e2:	48 89 87 f8 00 00 00 	mov    QWORD PTR [rdi+0xf8],rax
     11470e9:	48 89 87 00 01 00 00 	mov    QWORD PTR [rdi+0x100],rax
     11470f0:	48 89 87 08 01 00 00 	mov    QWORD PTR [rdi+0x108],rax
     11470f7:	48 89 87 10 01 00 00 	mov    QWORD PTR [rdi+0x110],rax
     11470fe:	48 89 87 18 01 00 00 	mov    QWORD PTR [rdi+0x118],rax
     1147105:	0f 11 87 cc 00 00 00 	movups XMMWORD PTR [rdi+0xcc],xmm0

### rank 10: score=21 FDE=0x1147326..0x11473db base=rdi offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x1147344: mov    QWORD PTR [rdi+0x20],rax
- 0x114734c: mov    QWORD PTR [rdi+0x30],rax
- 0x1147354: mov    QWORD PTR [rdi+0x40],rax
- 0x1147364: mov    QWORD PTR [rdi+0x60],rax
- 0x1147368: mov    QWORD PTR [rdi+0x68],rax
- 0x1147374: mov    QWORD PTR [rdi+0x80],rax
- 0x1147389: mov    QWORD PTR [rdi+0x98],rax
  - context around +0x30 store:
     1147326:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
     114732a:	48 8d 05 27 da 70 00 	lea    rax,[rip+0x70da27]        # 1854d58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11440>
     1147331:	48 89 07             	mov    QWORD PTR [rdi],rax
     1147334:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     1147339:	83 67 18 00          	and    DWORD PTR [rdi+0x18],0x0
     114733d:	48 8d 05 b4 84 2f ff 	lea    rax,[rip+0xffffffffff2f84b4]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1147344:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
     1147348:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     114734c:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
     1147350:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
     1147354:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
     1147358:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
     114735c:	48 89 47 50          	mov    QWORD PTR [rdi+0x50],rax
     1147360:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
     1147364:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
     1147368:	48 89 47 68          	mov    QWORD PTR [rdi+0x68],rax
     114736c:	48 89 47 70          	mov    QWORD PTR [rdi+0x70],rax
     1147370:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     1147374:	48 89 87 80 00 00 00 	mov    QWORD PTR [rdi+0x80],rax
     114737b:	48 89 87 88 00 00 00 	mov    QWORD PTR [rdi+0x88],rax
     1147382:	48 89 87 90 00 00 00 	mov    QWORD PTR [rdi+0x90],rax
     1147389:	48 89 87 98 00 00 00 	mov    QWORD PTR [rdi+0x98],rax
     1147390:	48 89 87 d8 00 00 00 	mov    QWORD PTR [rdi+0xd8],rax
     1147397:	48 89 87 e0 00 00 00 	mov    QWORD PTR [rdi+0xe0],rax
     114739e:	48 89 87 e8 00 00 00 	mov    QWORD PTR [rdi+0xe8],rax
     11473a5:	48 89 87 f0 00 00 00 	mov    QWORD PTR [rdi+0xf0],rax
     11473ac:	48 89 87 f8 00 00 00 	mov    QWORD PTR [rdi+0xf8],rax
     11473b3:	0f 57 c0             	xorps  xmm0,xmm0
     11473b6:	0f 11 87 c0 00 00 00 	movups XMMWORD PTR [rdi+0xc0],xmm0
     11473bd:	0f 11 87 b0 00 00 00 	movups XMMWORD PTR [rdi+0xb0],xmm0
     11473c4:	83 a7 d0 00 00 00 00 	and    DWORD PTR [rdi+0xd0],0x0
     11473cb:	0f 11 87 a0 00 00 00 	movups XMMWORD PTR [rdi+0xa0],xmm0
     11473d2:	48 83 a7 00 01 00 00 	and    QWORD PTR [rdi+0x100],0x0
     11473d9:	00 

### rank 11: score=21 FDE=0x11b6d3c..0x11b6e92 base=rdi offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x11b6d7a: mov    QWORD PTR [rdi+0x20],rax
- 0x11b6d94: movups XMMWORD PTR [rdi+0x30],xmm0
- 0x11b6d9c: mov    QWORD PTR [rdi+0x30],rax
- 0x11b6dac: mov    QWORD PTR [rdi+0x40],rax
- 0x11b6de8: movups XMMWORD PTR [rdi+0x60],xmm0
- 0x11b6df0: mov    QWORD PTR [rdi+0x60],rax
- 0x11b6df8: mov    QWORD PTR [rdi+0x68],rax
- 0x11b6e28: mov    QWORD PTR [rdi+0x80],rax
- 0x11b6e6d: mov    QWORD PTR [rdi+0x98],rax
  - context around +0x30 store:
     11b6d59:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     11b6d5d:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
     11b6d60:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     11b6d65:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
     11b6d69:	48 83 67 28 00       	and    QWORD PTR [rdi+0x28],0x0
     11b6d6e:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
     11b6d72:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     11b6d76:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
     11b6d7a:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
     11b6d7e:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
     11b6d82:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     11b6d86:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
     11b6d8b:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
     11b6d8f:	48 83 67 40 00       	and    QWORD PTR [rdi+0x40],0x0
     11b6d94:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
     11b6d98:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
     11b6d9c:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
     11b6da0:	48 8b 46 38          	mov    rax,QWORD PTR [rsi+0x38]
     11b6da4:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
     11b6da8:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     11b6dac:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
     11b6db0:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     11b6db4:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     11b6db9:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
     11b6dbd:	48 83 67 58 00       	and    QWORD PTR [rdi+0x58],0x0
     11b6dc2:	48 8b 46 48          	mov    rax,QWORD PTR [rsi+0x48]
     11b6dc6:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
     11b6dca:	48 8b 46 50          	mov    rax,QWORD PTR [rsi+0x50]
     11b6dce:	48 89 47 50          	mov    QWORD PTR [rdi+0x50],rax
     11b6dd2:	48 8b 46 58          	mov    rax,QWORD PTR [rsi+0x58]
     11b6dd6:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
     11b6dda:	48 83 66 58 00       	and    QWORD PTR [rsi+0x58],0x0
     11b6ddf:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
     11b6de3:	48 83 67 70 00       	and    QWORD PTR [rdi+0x70],0x0
     11b6de8:	0f 11 47 60          	movups XMMWORD PTR [rdi+0x60],xmm0
     11b6dec:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
     11b6df0:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
     11b6df4:	48 8b 46 68          	mov    rax,QWORD PTR [rsi+0x68]
     11b6df8:	48 89 47 68          	mov    QWORD PTR [rdi+0x68],rax
     11b6dfc:	48 8b 46 70          	mov    rax,QWORD PTR [rsi+0x70]

### rank 12: score=21 FDE=0x11ca706..0x11cd602 base=r14 offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x11cb616: mov    BYTE PTR [r14+0x40],cl
- 0x11cb627: mov    QWORD PTR [r14+0x68],rax
- 0x11cb9e6: mov    QWORD PTR [r14+0x20],r13
- 0x11cb9ee: mov    QWORD PTR [r14+0x30],r13
- 0x11cb9f6: mov    QWORD PTR [r14+0x40],r13
- 0x11cba06: mov    QWORD PTR [r14+0x60],r13
- 0x11cba0a: mov    QWORD PTR [r14+0x68],r13
- 0x11cba16: mov    QWORD PTR [r14+0x80],r13
- 0x11cba2b: mov    QWORD PTR [r14+0x98],r13
- 0x11ccdf9: movups XMMWORD PTR [r14+0x30],xmm0
- 0x11cce10: mov    QWORD PTR [r14+0x40],rax
  - context around +0x30 store:
     11cb9b4:	00 
     11cb9b5:	48 c7 84 24 98 05 00 	mov    QWORD PTR [rsp+0x598],0x3e8
     11cb9bc:	00 e8 03 00 00 
     11cb9c1:	bf b0 00 00 00       	mov    edi,0xb0
     11cb9c6:	e8 35 25 62 00       	call   17edf00 <_Znwm@plt>
     11cb9cb:	49 89 c6             	mov    r14,rax
     11cb9ce:	48 8b 84 24 60 0f 00 	mov    rax,QWORD PTR [rsp+0xf60]
     11cb9d5:	00 
     11cb9d6:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]
     11cb9da:	4d 89 6e 08          	mov    QWORD PTR [r14+0x8],r13
     11cb9de:	4d 89 6e 10          	mov    QWORD PTR [r14+0x10],r13
     11cb9e2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13
     11cb9e6:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
     11cb9ea:	4d 89 6e 28          	mov    QWORD PTR [r14+0x28],r13
     11cb9ee:	4d 89 6e 30          	mov    QWORD PTR [r14+0x30],r13
     11cb9f2:	4d 89 6e 38          	mov    QWORD PTR [r14+0x38],r13
     11cb9f6:	4d 89 6e 40          	mov    QWORD PTR [r14+0x40],r13
     11cb9fa:	4d 89 6e 48          	mov    QWORD PTR [r14+0x48],r13
     11cb9fe:	4d 89 6e 50          	mov    QWORD PTR [r14+0x50],r13
     11cba02:	4d 89 6e 58          	mov    QWORD PTR [r14+0x58],r13
     11cba06:	4d 89 6e 60          	mov    QWORD PTR [r14+0x60],r13
     11cba0a:	4d 89 6e 68          	mov    QWORD PTR [r14+0x68],r13
     11cba0e:	4d 89 6e 70          	mov    QWORD PTR [r14+0x70],r13
     11cba12:	4d 89 6e 78          	mov    QWORD PTR [r14+0x78],r13
     11cba16:	4d 89 ae 80 00 00 00 	mov    QWORD PTR [r14+0x80],r13
     11cba1d:	4d 89 ae 88 00 00 00 	mov    QWORD PTR [r14+0x88],r13
     11cba24:	4d 89 ae 90 00 00 00 	mov    QWORD PTR [r14+0x90],r13
     11cba2b:	4d 89 ae 98 00 00 00 	mov    QWORD PTR [r14+0x98],r13
     11cba32:	4d 89 ae a0 00 00 00 	mov    QWORD PTR [r14+0xa0],r13
     11cba39:	4d 89 ae a8 00 00 00 	mov    QWORD PTR [r14+0xa8],r13
     11cba40:	48 8d 0d 89 f1 68 00 	lea    rcx,[rip+0x68f189]        # 185abd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x172b8>
     11cba47:	49 89 0e             	mov    QWORD PTR [r14],rcx
     11cba4a:	4c 89 ac 24 b0 0a 00 	mov    QWORD PTR [rsp+0xab0],r13
     11cba51:	00 
     11cba52:	6a 04                	push   0x4
     11cba54:	59                   	pop    rcx
     11cba55:	48 89 8c 24 b8 0a 00 	mov    QWORD PTR [rsp+0xab8],rcx
     11cba5c:	00 
     11cba5d:	c7 84 24 c0 0a 00 00 	mov    DWORD PTR [rsp+0xac0],0x3f800000
     11cba64:	00 00 80 3f 

### rank 13: score=21 FDE=0x13390b8..0x1339999 base=r15 offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x13392a0: mov    DWORD PTR [r15+0x20],0x3f800000
- 0x1339445: mov    QWORD PTR [r15+0x20],rdx
- 0x133944d: mov    QWORD PTR [r15+0x30],rcx
- 0x1339455: mov    QWORD PTR [r15+0x40],r13
- 0x1339462: mov    BYTE PTR [r15+0x60],r11b
- 0x133946d: mov    QWORD PTR [r15+0x68],rcx
- 0x1339480: mov    QWORD PTR [r15+0x80],rax
- 0x13394a9: mov    QWORD PTR [r15+0x98],rax
  - context around +0x30 store:
     1339412:	4d 89 47 f0          	mov    QWORD PTR [r15-0x10],r8
     1339416:	4d 89 4f f8          	mov    QWORD PTR [r15-0x8],r9
     133941a:	44 8b 44 24 0c       	mov    r8d,DWORD PTR [rsp+0xc]
     133941f:	45 89 07             	mov    DWORD PTR [r15],r8d
     1339422:	44 8b 44 24 08       	mov    r8d,DWORD PTR [rsp+0x8]
     1339427:	45 89 47 04          	mov    DWORD PTR [r15+0x4],r8d
     133942b:	89 6c 24 04          	mov    DWORD PTR [rsp+0x4],ebp
     133942f:	41 88 6f 08          	mov    BYTE PTR [r15+0x8],bpl
     1339433:	4c 8b 44 24 50       	mov    r8,QWORD PTR [rsp+0x50]
     1339438:	4d 89 47 10          	mov    QWORD PTR [r15+0x10],r8
     133943c:	4c 8b 44 24 48       	mov    r8,QWORD PTR [rsp+0x48]
     1339441:	4d 89 47 18          	mov    QWORD PTR [r15+0x18],r8
     1339445:	49 89 57 20          	mov    QWORD PTR [r15+0x20],rdx
     1339449:	41 88 77 28          	mov    BYTE PTR [r15+0x28],sil
     133944d:	49 89 4f 30          	mov    QWORD PTR [r15+0x30],rcx
     1339451:	4d 89 67 38          	mov    QWORD PTR [r15+0x38],r12
     1339455:	4d 89 6f 40          	mov    QWORD PTR [r15+0x40],r13
     1339459:	49 89 7f 48          	mov    QWORD PTR [r15+0x48],rdi
     133945d:	41 0f 11 47 50       	movups XMMWORD PTR [r15+0x50],xmm0
     1339462:	45 88 5f 60          	mov    BYTE PTR [r15+0x60],r11b
     1339466:	48 8d 8b d8 04 00 00 	lea    rcx,[rbx+0x4d8]
     133946d:	49 89 4f 68          	mov    QWORD PTR [r15+0x68],rcx
     1339471:	48 8d 8b f8 04 00 00 	lea    rcx,[rbx+0x4f8]
     1339478:	49 89 4f 70          	mov    QWORD PTR [r15+0x70],rcx
     133947c:	4d 89 57 78          	mov    QWORD PTR [r15+0x78],r10
     1339480:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
     1339487:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
     133948e:	00 
     133948f:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
     1339496:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
     133949d:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
     13394a4:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13394a9:	49 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],rax
     13394b0:	48 8d 83 78 05 00 00 	lea    rax,[rbx+0x578]
     13394b7:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
     13394be:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13394c3:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
     13394ca:	f2 41 0f 10 47 e8    	movsd  xmm0,QWORD PTR [r15-0x18]
     13394d0:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     13394d5:	41 0f 10 47 f0       	movups xmm0,XMMWORD PTR [r15-0x10]

### rank 14: score=21 FDE=0x139a268..0x139a3b4 base=r15 offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x139a2b4: mov    QWORD PTR [r15+0x20],rdi
- 0x139a2bc: mov    QWORD PTR [r15+0x30],rsi
- 0x139a2c4: mov    QWORD PTR [r15+0x40],r9
- 0x139a2d4: mov    QWORD PTR [r15+0x60],rsi
- 0x139a2d8: mov    QWORD PTR [r15+0x68],r8
- 0x139a2e4: mov    QWORD PTR [r15+0x80],rdi
- 0x139a2f9: mov    QWORD PTR [r15+0x98],r8
  - context around +0x30 store:
     139a288:	00 
     139a289:	48 8b bc 24 38 01 00 	mov    rdi,QWORD PTR [rsp+0x138]
     139a290:	00 
     139a291:	64 4c 8b 14 25 28 00 	mov    r10,QWORD PTR fs:0x28
     139a298:	00 00 
     139a29a:	4c 89 94 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r10
     139a2a1:	00 
     139a2a2:	49 89 e7             	mov    r15,rsp
     139a2a5:	49 89 37             	mov    QWORD PTR [r15],rsi
     139a2a8:	4d 89 47 08          	mov    QWORD PTR [r15+0x8],r8
     139a2ac:	4d 89 4f 10          	mov    QWORD PTR [r15+0x10],r9
     139a2b0:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     139a2b4:	49 89 7f 20          	mov    QWORD PTR [r15+0x20],rdi
     139a2b8:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     139a2bc:	49 89 77 30          	mov    QWORD PTR [r15+0x30],rsi
     139a2c0:	4d 89 47 38          	mov    QWORD PTR [r15+0x38],r8
     139a2c4:	4d 89 4f 40          	mov    QWORD PTR [r15+0x40],r9
     139a2c8:	49 89 4f 48          	mov    QWORD PTR [r15+0x48],rcx
     139a2cc:	49 89 7f 50          	mov    QWORD PTR [r15+0x50],rdi
     139a2d0:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax
     139a2d4:	49 89 77 60          	mov    QWORD PTR [r15+0x60],rsi
     139a2d8:	4d 89 47 68          	mov    QWORD PTR [r15+0x68],r8
     139a2dc:	4d 89 4f 70          	mov    QWORD PTR [r15+0x70],r9
     139a2e0:	49 89 4f 78          	mov    QWORD PTR [r15+0x78],rcx
     139a2e4:	49 89 bf 80 00 00 00 	mov    QWORD PTR [r15+0x80],rdi
     139a2eb:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
     139a2f2:	49 89 b7 90 00 00 00 	mov    QWORD PTR [r15+0x90],rsi
     139a2f9:	4d 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],r8
     139a300:	4d 89 8f a0 00 00 00 	mov    QWORD PTR [r15+0xa0],r9
     139a307:	49 89 8f a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rcx
     139a30e:	41 89 97 b0 00 00 00 	mov    DWORD PTR [r15+0xb0],edx
     139a315:	49 89 bf b8 00 00 00 	mov    QWORD PTR [r15+0xb8],rdi
     139a31c:	49 89 87 c0 00 00 00 	mov    QWORD PTR [r15+0xc0],rax
     139a323:	49 89 b7 c8 00 00 00 	mov    QWORD PTR [r15+0xc8],rsi
     139a32a:	4d 89 87 d0 00 00 00 	mov    QWORD PTR [r15+0xd0],r8
     139a331:	4d 89 8f d8 00 00 00 	mov    QWORD PTR [r15+0xd8],r9
     139a338:	49 89 8f e0 00 00 00 	mov    QWORD PTR [r15+0xe0],rcx
     139a33f:	41 89 97 e8 00 00 00 	mov    DWORD PTR [r15+0xe8],edx
     139a346:	49 89 bf f0 00 00 00 	mov    QWORD PTR [r15+0xf0],rdi
     139a34d:	49 89 87 f8 00 00 00 	mov    QWORD PTR [r15+0xf8],rax

### rank 15: score=21 FDE=0x140970e..0x140a9f4 base=rax offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x1409838: mov    QWORD PTR [rax+0x20],0xe
- 0x140a554: mov    QWORD PTR [rax+0x20],r12
- 0x140a561: mov    QWORD PTR [rax+0x30],r14
- 0x140a56e: mov    QWORD PTR [rax+0x40],r13
- 0x140a59c: mov    BYTE PTR [rax+0x60],dl
- 0x140a59f: mov    DWORD PTR [rax+0x68],ecx
- 0x140a5b1: mov    BYTE PTR [rax+0x80],dl
- 0x140a5cf: mov    BYTE PTR [rax+0x98],dl
  - context around +0x30 store:
     140a525:	4c 89 ef             	mov    rdi,r13
     140a528:	48 83 c7 08          	add    rdi,0x8
     140a52c:	e8 9d d3 00 00       	call   14178ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ce52>
     140a531:	48 89 df             	mov    rdi,rbx
     140a534:	48 83 c7 08          	add    rdi,0x8
     140a538:	e8 cb 32 00 00       	call   140d808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252d8c>
     140a53d:	bf b0 00 00 00       	mov    edi,0xb0
     140a542:	e8 b9 39 3e 00       	call   17edf00 <_Znwm@plt>
     140a547:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     140a54c:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     140a550:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
     140a554:	4c 89 60 20          	mov    QWORD PTR [rax+0x20],r12
     140a558:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     140a55d:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     140a561:	4c 89 70 30          	mov    QWORD PTR [rax+0x30],r14
     140a565:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
     140a56a:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
     140a56e:	4c 89 68 40          	mov    QWORD PTR [rax+0x40],r13
     140a572:	48 89 58 48          	mov    QWORD PTR [rax+0x48],rbx
     140a576:	48 8d 0d 33 60 46 00 	lea    rcx,[rip+0x466033]        # 18705b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2cc98>
     140a57d:	48 89 08             	mov    QWORD PTR [rax],rcx
     140a580:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     140a585:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     140a589:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     140a58e:	0f b6 4e 16          	movzx  ecx,BYTE PTR [rsi+0x16]
     140a592:	48 83 60 50 00       	and    QWORD PTR [rax+0x50],0x0
     140a597:	31 d2                	xor    edx,edx
     140a599:	88 50 58             	mov    BYTE PTR [rax+0x58],dl
     140a59c:	88 50 60             	mov    BYTE PTR [rax+0x60],dl
     140a59f:	89 48 68             	mov    DWORD PTR [rax+0x68],ecx
     140a5a2:	89 48 6c             	mov    DWORD PTR [rax+0x6c],ecx
     140a5a5:	0f b6 4e 14          	movzx  ecx,BYTE PTR [rsi+0x14]
     140a5a9:	48 83 60 70 00       	and    QWORD PTR [rax+0x70],0x0
     140a5ae:	88 50 78             	mov    BYTE PTR [rax+0x78],dl
     140a5b1:	88 90 80 00 00 00    	mov    BYTE PTR [rax+0x80],dl
     140a5b7:	89 88 88 00 00 00    	mov    DWORD PTR [rax+0x88],ecx
     140a5bd:	89 88 8c 00 00 00    	mov    DWORD PTR [rax+0x8c],ecx
     140a5c3:	0f b6 4e 15          	movzx  ecx,BYTE PTR [rsi+0x15]
     140a5c7:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
     140a5ce:	00 

### rank 16: score=21 FDE=0x1421d56..0x1422627 base=rdi offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x1421d94: mov    QWORD PTR [rdi+0x20],rax
- 0x1421dae: movups XMMWORD PTR [rdi+0x30],xmm0
- 0x1421db6: mov    QWORD PTR [rdi+0x30],rax
- 0x1421dc6: mov    QWORD PTR [rdi+0x40],rax
- 0x1421e02: movups XMMWORD PTR [rdi+0x60],xmm0
- 0x1421e0a: mov    QWORD PTR [rdi+0x60],rax
- 0x1421e12: mov    QWORD PTR [rdi+0x68],rax
- 0x1421e42: mov    QWORD PTR [rdi+0x80],rax
- 0x1421e87: mov    QWORD PTR [rdi+0x98],rax
  - context around +0x30 store:
     1421d73:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     1421d77:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
     1421d7a:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     1421d7f:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
     1421d83:	48 83 67 28 00       	and    QWORD PTR [rdi+0x28],0x0
     1421d88:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
     1421d8c:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     1421d90:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
     1421d94:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
     1421d98:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
     1421d9c:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     1421da0:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
     1421da5:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
     1421da9:	48 83 67 40 00       	and    QWORD PTR [rdi+0x40],0x0
     1421dae:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
     1421db2:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
     1421db6:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
     1421dba:	48 8b 46 38          	mov    rax,QWORD PTR [rsi+0x38]
     1421dbe:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
     1421dc2:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     1421dc6:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
     1421dca:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     1421dce:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     1421dd3:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
     1421dd7:	48 83 67 58 00       	and    QWORD PTR [rdi+0x58],0x0
     1421ddc:	48 8b 46 48          	mov    rax,QWORD PTR [rsi+0x48]
     1421de0:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
     1421de4:	48 8b 46 50          	mov    rax,QWORD PTR [rsi+0x50]
     1421de8:	48 89 47 50          	mov    QWORD PTR [rdi+0x50],rax
     1421dec:	48 8b 46 58          	mov    rax,QWORD PTR [rsi+0x58]
     1421df0:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
     1421df4:	48 83 66 58 00       	and    QWORD PTR [rsi+0x58],0x0
     1421df9:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
     1421dfd:	48 83 67 70 00       	and    QWORD PTR [rdi+0x70],0x0
     1421e02:	0f 11 47 60          	movups XMMWORD PTR [rdi+0x60],xmm0
     1421e06:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
     1421e0a:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
     1421e0e:	48 8b 46 68          	mov    rax,QWORD PTR [rsi+0x68]
     1421e12:	48 89 47 68          	mov    QWORD PTR [rdi+0x68],rax
     1421e16:	48 8b 46 70          	mov    rax,QWORD PTR [rsi+0x70]

### rank 17: score=21 FDE=0x146f232..0x14708fa base=r14 offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x146f2cf: mov    QWORD PTR [r14+0x20],0xc8
- 0x146f2e0: mov    QWORD PTR [r14+0x30],rax
- 0x146f2e8: mov    QWORD PTR [r14+0x40],rax
- 0x146f2fe: movups XMMWORD PTR [r14+0x68],xmm0
- 0x146f306: mov    QWORD PTR [r14+0x80],rax
- 0x14705c9: mov    QWORD PTR [r14+0x20],rcx
- 0x14705db: mov    QWORD PTR [r14+0x30],rcx
- 0x14705ed: mov    QWORD PTR [r14+0x40],rcx
- 0x1470611: mov    QWORD PTR [r14+0x60],rcx
- 0x1470618: mov    QWORD PTR [r14+0x68],rcx
- 0x147062c: mov    QWORD PTR [r14+0x80],rax
- 0x1470659: mov    BYTE PTR [r14+0x98],al
  - context around +0x30 store:
     146f2a4:	49 89 c6             	mov    r14,rax
     146f2a7:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl
     146f2ab:	48 8d 05 1e ef 39 00 	lea    rax,[rip+0x39ef1e]        # 180e1d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e90>
     146f2b2:	49 89 06             	mov    QWORD PTR [r14],rax
     146f2b5:	41 c7 46 10 00 00 00 	mov    DWORD PTR [r14+0x10],0x1000000
     146f2bc:	01 
     146f2bd:	41 88 6e 14          	mov    BYTE PTR [r14+0x14],bpl
     146f2c1:	48 b8 0c 00 00 00 06 	movabs rax,0x60000000c
     146f2c8:	00 00 00 
     146f2cb:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     146f2cf:	49 c7 46 20 c8 00 00 	mov    QWORD PTR [r14+0x20],0xc8
     146f2d6:	00 
     146f2d7:	b8 d0 07 00 00       	mov    eax,0x7d0
     146f2dc:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
     146f2e0:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     146f2e4:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     146f2e8:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
     146f2ec:	0f 57 c0             	xorps  xmm0,xmm0
     146f2ef:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
     146f2f4:	49 83 66 78 00       	and    QWORD PTR [r14+0x78],0x0
     146f2f9:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
     146f2fe:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
     146f303:	6a 64                	push   0x64
     146f305:	58                   	pop    rax
     146f306:	49 89 86 80 00 00 00 	mov    QWORD PTR [r14+0x80],rax
     146f30d:	66 41 83 a6 88 00 00 	and    WORD PTR [r14+0x88],0x0
     146f314:	00 00 
     146f316:	49 c7 86 90 00 00 00 	mov    QWORD PTR [r14+0x90],0x1388
     146f31d:	88 13 00 00 
     146f321:	41 88 ae 9c 00 00 00 	mov    BYTE PTR [r14+0x9c],bpl
     146f328:	41 83 a6 98 00 00 00 	and    DWORD PTR [r14+0x98],0x0
     146f32f:	00 
     146f330:	49 c7 86 a0 00 00 00 	mov    QWORD PTR [r14+0xa0],0x5dc
     146f337:	dc 05 00 00 
     146f33b:	41 88 ae a8 00 00 00 	mov    BYTE PTR [r14+0xa8],bpl
     146f342:	49 89 86 b0 00 00 00 	mov    QWORD PTR [r14+0xb0],rax
     146f349:	66 b8 00 01          	mov    ax,0x100
     146f34d:	66 41 89 86 b8 00 00 	mov    WORD PTR [r14+0xb8],ax
     146f354:	00 
     146f355:	41 88 ae ba 00 00 00 	mov    BYTE PTR [r14+0xba],bpl

### rank 18: score=21 FDE=0x14cdc2a..0x14d4d4c base=r14 offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x14cead8: movdqa XMMWORD PTR [r14+0x80],xmm0
- 0x14ced78: mov    QWORD PTR [r14+0x20],rax
- 0x14cedd4: mov    QWORD PTR [r14+0x98],r15
- 0x14cef23: mov    QWORD PTR [r14+0x30],r14
- 0x14cf575: mov    BYTE PTR [r14+0x20],0x0
- 0x14cf8b9: mov    DWORD PTR [r14+0x40],0x3f800000
- 0x14d0495: mov    QWORD PTR [r14+0x20],r13
- 0x14d1c37: mov    QWORD PTR [r14+0x20],r14
- 0x14d2d9d: mov    QWORD PTR [r14+0x60],r15
- 0x14d2da5: mov    QWORD PTR [r14+0x68],rbp
- 0x14d3256: movups XMMWORD PTR [r14+0x20],xmm0
- 0x14d3265: mov    QWORD PTR [r14+0x30],r12
- 0x14d328a: movups XMMWORD PTR [r14+0x40],xmm0
  - context around +0x30 store:
     14ceeee:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14ceef5:	00 
     14ceef6:	e8 6f b0 5a ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14ceefb:	31 ff                	xor    edi,edi
     14ceefd:	e8 84 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef02:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
     14cef06:	48 85 ff             	test   rdi,rdi
     14cef09:	74 0a                	je     14cef15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314499>
     14cef0b:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14cef0f:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     14cef13:	75 1f                	jne    14cef34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3144b8>
     14cef15:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     14cef1a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     14cef1f:	4d 89 66 28          	mov    QWORD PTR [r14+0x28],r12
     14cef23:	4d 89 76 30          	mov    QWORD PTR [r14+0x30],r14
     14cef27:	e8 86 f5 5c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14cef2c:	4c 89 f7             	mov    rdi,r14
     14cef2f:	e8 52 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef34:	31 ff                	xor    edi,edi
     14cef36:	e8 e1 f4 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14cef3b:	31 ff                	xor    edi,edi
     14cef3d:	e8 44 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef42:	31 ff                	xor    edi,edi
     14cef44:	e8 3d f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef49:	31 ff                	xor    edi,edi
     14cef4b:	e8 36 f5 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14cef50:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     14cef55:	48 8b 98 f8 00 00 00 	mov    rbx,QWORD PTR [rax+0xf8]
     14cef5c:	4c 8d b8 00 01 00 00 	lea    r15,[rax+0x100]
     14cef63:	4c 39 fb             	cmp    rbx,r15
     14cef66:	74 5e                	je     14cefc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31454a>
     14cef68:	4c 8d b4 24 a0 03 00 	lea    r14,[rsp+0x3a0]
     14cef6f:	00 
     14cef70:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14cef77:	00 
     14cef78:	6a 01                	push   0x1
     14cef7a:	5d                   	pop    rbp
     14cef7b:	48 8d 73 20          	lea    rsi,[rbx+0x20]
     14cef7f:	4c 89 f7             	mov    rdi,r14
     14cef82:	e8 b9 ef 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>

### rank 19: score=21 FDE=0x150c2de..0x150c356 base=rdi offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x150c300: movups XMMWORD PTR [rdi+0x20],xmm0
- 0x150c307: movups XMMWORD PTR [rdi+0x30],xmm0
- 0x150c30f: movups XMMWORD PTR [rdi+0x40],xmm0
- 0x150c31b: mov    QWORD PTR [rdi+0x60],rcx
- 0x150c31f: mov    QWORD PTR [rdi+0x68],r11
- 0x150c32b: mov    QWORD PTR [rdi+0x80],r9
- 0x150c340: mov    QWORD PTR [rdi+0x98],r11
  - context around +0x30 store:
     150c2de:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     150c2e3:	4c 8b 54 24 10       	mov    r10,QWORD PTR [rsp+0x10]
     150c2e8:	4c 63 5c 24 18       	movsxd r11,DWORD PTR [rsp+0x18]
     150c2ed:	0f 10 46 30          	movups xmm0,XMMWORD PTR [rsi+0x30]
     150c2f1:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     150c2f4:	0f 10 46 40          	movups xmm0,XMMWORD PTR [rsi+0x40]
     150c2f8:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     150c2fc:	0f 10 46 50          	movups xmm0,XMMWORD PTR [rsi+0x50]
     150c300:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
     150c304:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     150c307:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
     150c30b:	0f 10 46 20          	movups xmm0,XMMWORD PTR [rsi+0x20]
     150c30f:	0f 11 47 40          	movups XMMWORD PTR [rdi+0x40],xmm0
     150c313:	48 89 57 50          	mov    QWORD PTR [rdi+0x50],rdx
     150c317:	4c 89 5f 58          	mov    QWORD PTR [rdi+0x58],r11
     150c31b:	48 89 4f 60          	mov    QWORD PTR [rdi+0x60],rcx
     150c31f:	4c 89 5f 68          	mov    QWORD PTR [rdi+0x68],r11
     150c323:	4c 89 47 70          	mov    QWORD PTR [rdi+0x70],r8
     150c327:	4c 89 5f 78          	mov    QWORD PTR [rdi+0x78],r11
     150c32b:	4c 89 8f 80 00 00 00 	mov    QWORD PTR [rdi+0x80],r9
     150c332:	4c 89 9f 88 00 00 00 	mov    QWORD PTR [rdi+0x88],r11
     150c339:	4c 89 97 90 00 00 00 	mov    QWORD PTR [rdi+0x90],r10
     150c340:	4c 89 9f 98 00 00 00 	mov    QWORD PTR [rdi+0x98],r11
     150c347:	48 89 87 a0 00 00 00 	mov    QWORD PTR [rdi+0xa0],rax
     150c34e:	4c 89 9f a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],r11
     150c355:	c3                   	ret

### rank 20: score=21 FDE=0x16131be..0x1613b38 base=r15 offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x16132a1: mov    QWORD PTR [r15+0x20],rax
- 0x16132ec: mov    QWORD PTR [r15+0x68],rax
- 0x16134fc: movups XMMWORD PTR [r15+0x98],xmm0
- 0x161354f: mov    QWORD PTR [r15+0x30],rax
- 0x16135b0: mov    BYTE PTR [r15+0x60],al
- 0x161364b: mov    QWORD PTR [r15+0x80],rax
- 0x1613970: mov    QWORD PTR [r15+0x40],r14
- 0x1613a13: mov    QWORD PTR [r15+0x30],rax
  - context around +0x30 store:
     1613514:	41 0f 11 87 c8 00 00 	movups XMMWORD PTR [r15+0xc8],xmm0
     161351b:	00 
     161351c:	41 0f 11 87 d8 00 00 	movups XMMWORD PTR [r15+0xd8],xmm0
     1613523:	00 
     1613524:	41 0f 11 87 e8 00 00 	movups XMMWORD PTR [r15+0xe8],xmm0
     161352b:	00 
     161352c:	4d 89 bf f8 00 00 00 	mov    QWORD PTR [r15+0xf8],r15
     1613533:	49 83 a7 00 01 00 00 	and    QWORD PTR [r15+0x100],0x0
     161353a:	00 
     161353b:	41 0f 11 87 10 01 00 	movups XMMWORD PTR [r15+0x110],xmm0
     1613542:	00 
     1613543:	41 0f 11 87 20 01 00 	movups XMMWORD PTR [r15+0x120],xmm0
     161354a:	00 
     161354b:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     161354f:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     1613553:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     1613557:	49 83 67 58 00       	and    QWORD PTR [r15+0x58],0x0
     161355c:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0
     1613561:	41 83 67 64 00       	and    DWORD PTR [r15+0x64],0x0
     1613566:	41 83 a7 10 02 00 00 	and    DWORD PTR [r15+0x210],0x0
     161356d:	00 
     161356e:	41 83 a7 44 02 00 00 	and    DWORD PTR [r15+0x244],0x0
     1613575:	00 
     1613576:	49 83 a7 a8 02 00 00 	and    QWORD PTR [r15+0x2a8],0x0
     161357d:	00 
     161357e:	49 83 a7 b8 02 00 00 	and    QWORD PTR [r15+0x2b8],0x0
     1613585:	00 
     1613586:	41 83 a7 cc 02 00 00 	and    DWORD PTR [r15+0x2cc],0x0
     161358d:	00 
     161358e:	49 83 a7 f0 01 00 00 	and    QWORD PTR [r15+0x1f0],0x0
     1613595:	00 
     1613596:	49 83 a7 78 03 00 00 	and    QWORD PTR [r15+0x378],0x0
     161359d:	00 
     161359e:	41 83 a7 80 03 00 00 	and    DWORD PTR [r15+0x380],0x0
     16135a5:	00 
     16135a6:	49 83 a7 88 03 00 00 	and    QWORD PTR [r15+0x388],0x0
     16135ad:	00 
     16135ae:	b0 01                	mov    al,0x1
     16135b0:	41 88 47 60          	mov    BYTE PTR [r15+0x60],al
     16135b4:	41 0f 11 87 48 02 00 	movups XMMWORD PTR [r15+0x248],xmm0

### rank 21: score=21 FDE=0x16259a6..0x1625c3b base=r14 offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x1625a07: mov    QWORD PTR [r14+0x20],rax
- 0x1625a27: mov    QWORD PTR [r14+0x30],rax
- 0x1625a47: mov    QWORD PTR [r14+0x40],rax
- 0x1625a87: mov    QWORD PTR [r14+0x60],rax
- 0x1625a97: mov    QWORD PTR [r14+0x68],rax
- 0x1625aec: mov    QWORD PTR [r14+0x80],rax
- 0x1625b4b: mov    QWORD PTR [r14+0x98],rax
  - context around +0x30 store:
     16259ef:	4c 89 fe             	mov    rsi,r15
     16259f2:	e8 0f 53 48 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     16259f7:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     16259fb:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     16259ff:	4c 89 fe             	mov    rsi,r15
     1625a02:	e8 ff 52 48 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1625a07:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     1625a0b:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     1625a0f:	4c 89 fe             	mov    rsi,r15
     1625a12:	e8 ef 52 48 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1625a17:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
     1625a1b:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     1625a1f:	4c 89 fe             	mov    rsi,r15
     1625a22:	e8 df 52 48 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1625a27:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     1625a2b:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     1625a2f:	4c 89 fe             	mov    rsi,r15
     1625a32:	e8 cf 52 48 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1625a37:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     1625a3b:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     1625a3f:	4c 89 fe             	mov    rsi,r15
     1625a42:	e8 bf 52 48 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1625a47:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
     1625a4b:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     1625a4f:	4c 89 fe             	mov    rsi,r15
     1625a52:	e8 af 52 48 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1625a57:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
     1625a5b:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
     1625a5f:	4c 89 fe             	mov    rsi,r15
     1625a62:	e8 9f 52 48 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1625a67:	49 89 46 50          	mov    QWORD PTR [r14+0x50],rax
     1625a6b:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     1625a6f:	4c 89 fe             	mov    rsi,r15
     1625a72:	e8 8f 52 48 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1625a77:	49 89 46 58          	mov    QWORD PTR [r14+0x58],rax
     1625a7b:	48 8b 7b 60          	mov    rdi,QWORD PTR [rbx+0x60]
     1625a7f:	4c 89 fe             	mov    rsi,r15
     1625a82:	e8 7f 52 48 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1625a87:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
     1625a8b:	48 8b 7b 68          	mov    rdi,QWORD PTR [rbx+0x68]

### rank 22: score=21 FDE=0x1654356..0x165451d base=rdi offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x165436b: mov    QWORD PTR [rdi+0x20],rsi
- 0x1654381: movups XMMWORD PTR [rdi+0x30],xmm1
- 0x165438c: mov    QWORD PTR [rdi+0x40],rax
- 0x1654398: mov    QWORD PTR [rdi+0x60],rsi
- 0x16543a3: mov    QWORD PTR [rdi+0x68],rax
- 0x16543af: mov    QWORD PTR [rdi+0x80],rax
- 0x16543c4: mov    QWORD PTR [rdi+0x98],rax
  - context around +0x30 store:
     1654356:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
     165435a:	48 8d 05 7f 1e 24 00 	lea    rax,[rip+0x241e7f]        # 18961e0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3120>
     1654361:	48 89 07             	mov    QWORD PTR [rdi],rax
     1654364:	0f 57 c0             	xorps  xmm0,xmm0
     1654367:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     165436b:	48 89 77 20          	mov    QWORD PTR [rdi+0x20],rsi
     165436f:	48 8d 05 0a 7d 32 00 	lea    rax,[rip+0x327d0a]        # 197c080 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x44cc8>
     1654376:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     165437a:	0f 28 0d 4f 89 d3 fe 	movaps xmm1,XMMWORD PTR [rip+0xfffffffffed3894f]        # 38ccd0 <_ZTSSt12bad_any_cast@@Base-0x34f8>
     1654381:	0f 11 4f 30          	movups XMMWORD PTR [rdi+0x30],xmm1
     1654385:	48 8d 05 3c b2 de fe 	lea    rax,[rip+0xfffffffffedeb23c]        # 43f5c8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x51d4>
     165438c:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
     1654390:	48 89 77 48          	mov    QWORD PTR [rdi+0x48],rsi
     1654394:	0f 11 47 50          	movups XMMWORD PTR [rdi+0x50],xmm0
     1654398:	48 89 77 60          	mov    QWORD PTR [rdi+0x60],rsi
     165439c:	48 8d 05 55 b4 de fe 	lea    rax,[rip+0xfffffffffedeb455]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     16543a3:	48 89 47 68          	mov    QWORD PTR [rdi+0x68],rax
     16543a7:	48 89 47 70          	mov    QWORD PTR [rdi+0x70],rax
     16543ab:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     16543af:	48 89 87 80 00 00 00 	mov    QWORD PTR [rdi+0x80],rax
     16543b6:	48 89 87 88 00 00 00 	mov    QWORD PTR [rdi+0x88],rax
     16543bd:	48 89 87 90 00 00 00 	mov    QWORD PTR [rdi+0x90],rax
     16543c4:	48 89 87 98 00 00 00 	mov    QWORD PTR [rdi+0x98],rax
     16543cb:	48 89 87 a0 00 00 00 	mov    QWORD PTR [rdi+0xa0],rax
     16543d2:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
     16543d9:	48 89 87 b0 00 00 00 	mov    QWORD PTR [rdi+0xb0],rax
     16543e0:	48 89 87 b8 00 00 00 	mov    QWORD PTR [rdi+0xb8],rax
     16543e7:	48 89 87 c0 00 00 00 	mov    QWORD PTR [rdi+0xc0],rax
     16543ee:	48 89 87 c8 00 00 00 	mov    QWORD PTR [rdi+0xc8],rax
     16543f5:	48 89 87 40 01 00 00 	mov    QWORD PTR [rdi+0x140],rax
     16543fc:	48 89 87 48 01 00 00 	mov    QWORD PTR [rdi+0x148],rax
     1654403:	48 89 87 50 01 00 00 	mov    QWORD PTR [rdi+0x150],rax
     165440a:	48 89 87 58 01 00 00 	mov    QWORD PTR [rdi+0x158],rax
     1654411:	48 89 87 60 01 00 00 	mov    QWORD PTR [rdi+0x160],rax
     1654418:	48 89 87 68 01 00 00 	mov    QWORD PTR [rdi+0x168],rax

### rank 23: score=21 FDE=0x166be7e..0x166bf53 base=rdi offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x166be8f: movups XMMWORD PTR [rdi+0x20],xmm0
- 0x166be9c: mov    QWORD PTR [rdi+0x20],rax
- 0x166beac: mov    QWORD PTR [rdi+0x30],rax
- 0x166bece: mov    QWORD PTR [rdi+0x40],rax
- 0x166bee7: mov    QWORD PTR [rdi+0x60],rax
- 0x166bf08: movups XMMWORD PTR [rdi+0x68],xmm1
- 0x166bf1c: mov    WORD PTR [rdi+0x80],ax
- 0x166bf4c: mov    BYTE PTR [rdi+0x98],al
  - context around +0x30 store:
     166be7e:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     166be81:	0f 10 4e 09          	movups xmm1,XMMWORD PTR [rsi+0x9]
     166be85:	0f 11 4f 09          	movups XMMWORD PTR [rdi+0x9],xmm1
     166be89:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     166be8c:	0f 57 c0             	xorps  xmm0,xmm0
     166be8f:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
     166be93:	48 83 67 30 00       	and    QWORD PTR [rdi+0x30],0x0
     166be98:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
     166be9c:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
     166bea0:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
     166bea4:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     166bea8:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
     166beac:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
     166beb0:	48 83 66 30 00       	and    QWORD PTR [rsi+0x30],0x0
     166beb5:	0f 11 46 20          	movups XMMWORD PTR [rsi+0x20],xmm0
     166beb9:	48 83 67 48 00       	and    QWORD PTR [rdi+0x48],0x0
     166bebe:	0f 11 47 38          	movups XMMWORD PTR [rdi+0x38],xmm0
     166bec2:	48 8b 46 38          	mov    rax,QWORD PTR [rsi+0x38]
     166bec6:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
     166beca:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     166bece:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
     166bed2:	48 8b 46 48          	mov    rax,QWORD PTR [rsi+0x48]
     166bed6:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
     166beda:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
     166bede:	48 83 66 48 00       	and    QWORD PTR [rsi+0x48],0x0
     166bee3:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
     166bee7:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
     166beeb:	0f 10 4e 50          	movups xmm1,XMMWORD PTR [rsi+0x50]
     166beef:	0f 11 4f 50          	movups XMMWORD PTR [rdi+0x50],xmm1
     166bef3:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
     166bef7:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
     166befc:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
     166bf00:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     166bf04:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
     166bf08:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
     166bf0c:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
     166bf10:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
     166bf15:	0f b7 86 80 00 00 00 	movzx  eax,WORD PTR [rsi+0x80]

### rank 24: score=21 FDE=0x1721a80..0x1721dd4 base=rbp offsets=0x20,0x30,0x40,0x60,0x68,0x80,0x98
- 0x1721c3f: mov    QWORD PTR [rbp+0x20],r13
- 0x1721c4b: mov    QWORD PTR [rbp+0x30],rax
- 0x1721c58: mov    QWORD PTR [rbp+0x40],r14
- 0x1721c7e: mov    QWORD PTR [rbp+0x60],rax
- 0x1721c82: mov    QWORD PTR [rbp+0x68],rdx
- 0x1721ca4: mov    QWORD PTR [rbp+0x80],rax
- 0x1721cc3: mov    QWORD PTR [rbp+0x98],rdx
  - context around +0x30 store:
     1721c0e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1721c13:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
     1721c18:	48 8d ac 24 e0 00 00 	lea    rbp,[rsp+0xe0]
     1721c1f:	00 
     1721c20:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     1721c25:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     1721c29:	4c 89 65 08          	mov    QWORD PTR [rbp+0x8],r12
     1721c2d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1721c32:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     1721c36:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     1721c3b:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     1721c3f:	4c 89 6d 20          	mov    QWORD PTR [rbp+0x20],r13
     1721c43:	48 89 5d 28          	mov    QWORD PTR [rbp+0x28],rbx
     1721c47:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     1721c4b:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
     1721c4f:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1721c54:	48 89 45 38          	mov    QWORD PTR [rbp+0x38],rax
     1721c58:	4c 89 75 40          	mov    QWORD PTR [rbp+0x40],r14
     1721c5c:	4c 89 7d 48          	mov    QWORD PTR [rbp+0x48],r15
     1721c60:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     1721c65:	48 89 45 50          	mov    QWORD PTR [rbp+0x50],rax
     1721c69:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     1721c6e:	48 89 45 58          	mov    QWORD PTR [rbp+0x58],rax
     1721c72:	48 8d 3d e1 83 c0 fe 	lea    rdi,[rip+0xfffffffffec083e1]        # 32a05a <_ZTSSt12bad_any_cast@@Base-0x6616e>
     1721c79:	e8 2a 7a fb ff       	call   16d96a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d814>
     1721c7e:	48 89 45 60          	mov    QWORD PTR [rbp+0x60],rax
     1721c82:	48 89 55 68          	mov    QWORD PTR [rbp+0x68],rdx
     1721c86:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1721c8b:	48 89 45 70          	mov    QWORD PTR [rbp+0x70],rax
     1721c8f:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     1721c94:	48 89 45 78          	mov    QWORD PTR [rbp+0x78],rax
     1721c98:	48 8d 3d 69 9a c2 fe 	lea    rdi,[rip+0xfffffffffec29a69]        # 34b708 <_ZTSSt12bad_any_cast@@Base-0x44ac0>
     1721c9f:	e8 04 7a fb ff       	call   16d96a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d814>
     1721ca4:	48 89 85 80 00 00 00 	mov    QWORD PTR [rbp+0x80],rax
     1721cab:	48 89 95 88 00 00 00 	mov    QWORD PTR [rbp+0x88],rdx
     1721cb2:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1721cb7:	e8 7a 9b 35 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1721cbc:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax
     1721cc3:	48 89 95 98 00 00 00 	mov    QWORD PTR [rbp+0x98],rdx
     1721cca:	48 8d 3d be eb c0 fe 	lea    rdi,[rip+0xfffffffffec0ebbe]        # 33088f <_ZTSSt12bad_any_cast@@Base-0x5f939>

### rank 25: score=10 FDE=0xa1a530..0xa1a6f2 base=rbx offsets=0x20,0x30,0x40,0x60,0x68,0x98
- 0xa1a563: movups XMMWORD PTR [rbx+0x20],xmm0
- 0xa1a56c: movups XMMWORD PTR [rbx+0x30],xmm0
- 0xa1a58b: mov    QWORD PTR [rbx+0x40],rax
- 0xa1a59d: mov    QWORD PTR [rbx+0x40],rax
- 0xa1a5d5: mov    QWORD PTR [rbx+0x60],rsi
- 0xa1a5dd: mov    QWORD PTR [rbx+0x68],rdi
- 0xa1a61c: mov    QWORD PTR [rbx+0x98],r8
- 0xa1a66b: mov    QWORD PTR [rbx+0x30],rax
- 0xa1a682: mov    QWORD PTR [rbx+0x30],rdi
- 0xa1a6be: mov    QWORD PTR [rbx+0x20],r8
  - context around +0x30 store:
      a1a533:	50                   	push   rax
      a1a534:	49 89 f6             	mov    r14,rsi
      a1a537:	48 89 fb             	mov    rbx,rdi
      a1a53a:	48 8b 05 27 7a e9 00 	mov    rax,QWORD PTR [rip+0xe97a27]        # 18b1f68 <_ZTVNSt6__ndk115basic_streambufIcNS_11char_traitsIcEEEE@@Base+0xbc9a0>
      a1a541:	48 83 c0 10          	add    rax,0x10
      a1a545:	48 89 07             	mov    QWORD PTR [rdi],rax
      a1a548:	48 83 c7 08          	add    rdi,0x8
      a1a54c:	48 83 c6 08          	add    rsi,0x8
      a1a550:	e8 2b 44 dd 00       	call   17ee980 <_ZNSt6__ndk16localeC1ERKS0_@plt>
      a1a555:	41 0f 10 46 10       	movups xmm0,XMMWORD PTR [r14+0x10]
      a1a55a:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
      a1a55e:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]
      a1a563:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
      a1a567:	41 0f 10 46 30       	movups xmm0,XMMWORD PTR [r14+0x30]
      a1a56c:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
      a1a570:	48 8b 05 49 7a e9 00 	mov    rax,QWORD PTR [rip+0xe97a49]        # 18b1fc0 <_ZTVNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEEE@@Base+0xbc648>
      a1a577:	48 83 c0 10          	add    rax,0x10
      a1a57b:	48 89 03             	mov    QWORD PTR [rbx],rax
      a1a57e:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      a1a582:	49 8d 4e 58          	lea    rcx,[r14+0x58]
      a1a586:	48 39 c8             	cmp    rax,rcx
      a1a589:	74 0e                	je     a1a599 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEEC1EOS3_@@Base+0x69>
      a1a58b:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      a1a58f:	49 8b 56 48          	mov    rdx,QWORD PTR [r14+0x48]
      a1a593:	49 8b 76 50          	mov    rsi,QWORD PTR [r14+0x50]
      a1a597:	eb 28                	jmp    a1a5c1 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEEC1EOS3_@@Base+0x91>
      a1a599:	48 8d 43 58          	lea    rax,[rbx+0x58]
      a1a59d:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      a1a5a1:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
      a1a5a5:	49 8b 56 48          	mov    rdx,QWORD PTR [r14+0x48]
      a1a5a9:	48 29 ca             	sub    rdx,rcx
      a1a5ac:	48 01 da             	add    rdx,rbx
      a1a5af:	48 83 c2 58          	add    rdx,0x58
      a1a5b3:	49 8b 76 50          	mov    rsi,QWORD PTR [r14+0x50]
      a1a5b7:	48 29 ce             	sub    rsi,rcx
      a1a5ba:	48 01 de             	add    rsi,rbx
      a1a5bd:	48 83 c6 58          	add    rsi,0x58
      a1a5c1:	49 8d 4e 10          	lea    rcx,[r14+0x10]
      a1a5c5:	48 89 53 48          	mov    QWORD PTR [rbx+0x48],rdx
      a1a5c9:	48 89 73 50          	mov    QWORD PTR [rbx+0x50],rsi

### rank 26: score=10 FDE=0xa1b670..0xa1b763 base=rbx offsets=0x20,0x30,0x40,0x60,0x68,0x80
- 0xa1b68f: mov    QWORD PTR [rbx+0x80],rax
- 0xa1b6b4: movups XMMWORD PTR [rbx+0x30],xmm0
- 0xa1b6b8: movups XMMWORD PTR [rbx+0x20],xmm0
- 0xa1b6f2: mov    QWORD PTR [rbx+0x60],rcx
- 0xa1b6f6: mov    QWORD PTR [rbx+0x40],rax
- 0xa1b704: movups XMMWORD PTR [rbx+0x68],xmm0
- 0xa1b71e: mov    QWORD PTR [rbx+0x68],rax
- 0xa1b743: mov    QWORD PTR [rbx+0x68],rax
- 0xa1b753: mov    QWORD PTR [rbx+0x40],rax
  - context around +0x30 store:
      a1b67a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a1b67d:	ff 50 30             	call   QWORD PTR [rax+0x30]
      a1b680:	48 8b 35 41 69 e9 00 	mov    rsi,QWORD PTR [rip+0xe96941]        # 18b1fc8 <_ZNSt6__ndk17codecvtIcc9mbstate_tE2idE@@Base-0x12dbf0>
      a1b687:	4c 89 f7             	mov    rdi,r14
      a1b68a:	e8 e1 2f dd 00       	call   17ee670 <_ZNKSt6__ndk16locale9use_facetERNS0_2idE@plt>
      a1b68f:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
      a1b696:	0f b6 ab a2 00 00 00 	movzx  ebp,BYTE PTR [rbx+0xa2]
      a1b69d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      a1b6a0:	48 89 c7             	mov    rdi,rax
      a1b6a3:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      a1b6a6:	88 83 a2 00 00 00    	mov    BYTE PTR [rbx+0xa2],al
      a1b6ac:	40 38 c5             	cmp    bpl,al
      a1b6af:	74 57                	je     a1b708 <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x98>
      a1b6b1:	0f 57 c0             	xorps  xmm0,xmm0
      a1b6b4:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
      a1b6b8:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
      a1b6bc:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
      a1b6c0:	0f b6 8b a0 00 00 00 	movzx  ecx,BYTE PTR [rbx+0xa0]
      a1b6c7:	84 c0                	test   al,al
      a1b6c9:	74 42                	je     a1b70d <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x9d>
      a1b6cb:	84 c9                	test   cl,cl
      a1b6cd:	74 0e                	je     a1b6dd <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x6d>
      a1b6cf:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      a1b6d3:	48 85 ff             	test   rdi,rdi
      a1b6d6:	74 05                	je     a1b6dd <_ZNSt6__ndk113basic_filebufIcNS_11char_traitsIcEEE5imbueERKNS_6localeE@@Base+0x6d>
      a1b6d8:	e8 13 2e dd 00       	call   17ee4f0 <_ZdaPv@plt>
      a1b6dd:	0f b6 83 a1 00 00 00 	movzx  eax,BYTE PTR [rbx+0xa1]
      a1b6e4:	88 83 a0 00 00 00    	mov    BYTE PTR [rbx+0xa0],al
      a1b6ea:	48 8b 43 68          	mov    rax,QWORD PTR [rbx+0x68]
      a1b6ee:	48 8b 4b 70          	mov    rcx,QWORD PTR [rbx+0x70]
      a1b6f2:	48 89 4b 60          	mov    QWORD PTR [rbx+0x60],rcx
      a1b6f6:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      a1b6fa:	c6 83 a1 00 00 00 00 	mov    BYTE PTR [rbx+0xa1],0x0
      a1b701:	0f 57 c0             	xorps  xmm0,xmm0
      a1b704:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0
      a1b708:	5b                   	pop    rbx
      a1b709:	41 5e                	pop    r14
      a1b70b:	5d                   	pop    rbp
      a1b70c:	c3                   	ret
      a1b70d:	84 c9                	test   cl,cl

### rank 27: score=10 FDE=0xa709f0..0xa70fa1 base=rbx offsets=0x20,0x30,0x40,0x60,0x68,0x80
- 0xa70e87: mov    QWORD PTR [rbx+0x20],rax
- 0xa70e99: mov    QWORD PTR [rbx+0x30],rax
- 0xa70eab: mov    QWORD PTR [rbx+0x40],rax
- 0xa70ecf: mov    QWORD PTR [rbx+0x60],rax
- 0xa70ed8: mov    QWORD PTR [rbx+0x68],rax
- 0xa70eed: mov    QWORD PTR [rbx+0x80],rbp
  - context around +0x30 store:
      a70e5d:	88 01                	mov    BYTE PTR [rcx],al
      a70e5f:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
      a70e64:	48 89 03             	mov    QWORD PTR [rbx],rax
      a70e67:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      a70e6c:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      a70e70:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
      a70e75:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      a70e79:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      a70e7e:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      a70e82:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
      a70e87:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      a70e8b:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      a70e90:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      a70e94:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
      a70e99:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
      a70e9d:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      a70ea2:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      a70ea6:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      a70eab:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      a70eaf:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      a70eb4:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      a70eb8:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      a70ebd:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
      a70ec1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      a70ec6:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
      a70eca:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      a70ecf:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
      a70ed3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      a70ed8:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
      a70edc:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      a70ee1:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
      a70ee5:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      a70ee9:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
      a70eed:	48 89 ab 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rbp
      a70ef4:	0f 28 84 24 10 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x110]
      a70efb:	00 
      a70efc:	0f 28 8c 24 20 01 00 	movaps xmm1,XMMWORD PTR [rsp+0x120]
      a70f03:	00 
      a70f04:	48 8b 84 24 00 01 00 	mov    rax,QWORD PTR [rsp+0x100]
      a70f0b:	00 

### rank 28: score=10 FDE=0xaa1418..0xaa6ad6 base=r15 offsets=0x20,0x30,0x40,0x60,0x68,0x80
- 0xaa3bbe: mov    QWORD PTR [r15+0x20],rax
- 0xaa3bdb: mov    QWORD PTR [r15+0x30],rdx
- 0xaa3c75: mov    QWORD PTR [r15+0x60],rcx
- 0xaa3c90: mov    QWORD PTR [r15+0x80],rcx
- 0xaa516a: mov    QWORD PTR [r15+0x20],r12
- 0xaa51df: mov    QWORD PTR [r15+0x30],rbp
- 0xaa5312: mov    QWORD PTR [r15+0x40],r12
- 0xaa54a7: mov    QWORD PTR [r15+0x60],rbp
- 0xaa54af: mov    QWORD PTR [r15+0x68],r14
  - context around +0x30 store:
      aa3b9f:	48 8d 0d 7a 62 db 00 	lea    rcx,[rip+0xdb627a]        # 1859e20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16508>
      aa3ba6:	48 89 08             	mov    QWORD PTR [rax],rcx
      aa3ba9:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
      aa3bb0:	00 
      aa3bb1:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      aa3bb5:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      aa3bb9:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      aa3bbe:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      aa3bc2:	49 8d 47 28          	lea    rax,[r15+0x28]
      aa3bc6:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
      aa3bcd:	00 
      aa3bce:	49 83 67 28 00       	and    QWORD PTR [r15+0x28],0x0
      aa3bd3:	48 89 94 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdx
      aa3bda:	00 
      aa3bdb:	49 89 57 30          	mov    QWORD PTR [r15+0x30],rdx
      aa3bdf:	6a 70                	push   0x70
      aa3be1:	5f                   	pop    rdi
      aa3be2:	e8 19 a3 d4 00       	call   17edf00 <_Znwm@plt>
      aa3be7:	48 89 c3             	mov    rbx,rax
      aa3bea:	66 0f ef c0          	pxor   xmm0,xmm0
      aa3bee:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      aa3bf3:	48 8d 05 5e ae d5 00 	lea    rax,[rip+0xd5ae5e]        # 17fea58 <_ZTIN4asio22service_already_existsE@@Base+0x240>
      aa3bfa:	48 89 03             	mov    QWORD PTR [rbx],rax
      aa3bfd:	49 89 de             	mov    r14,rbx
      aa3c00:	49 83 c6 18          	add    r14,0x18
      aa3c04:	4c 89 f7             	mov    rdi,r14
      aa3c07:	e8 f6 61 d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      aa3c0c:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      aa3c11:	4c 89 70 38          	mov    QWORD PTR [rax+0x38],r14
      aa3c15:	48 89 58 40          	mov    QWORD PTR [rax+0x40],rbx
      aa3c19:	48 83 c0 50          	add    rax,0x50
      aa3c1d:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      aa3c22:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      aa3c29:	00 00 
      aa3c2b:	66 48 0f 7e c0       	movq   rax,xmm0
      aa3c30:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]
      aa3c35:	48 85 db             	test   rbx,rbx
      aa3c38:	74 0a                	je     aa3c44 <JNI_OnUnload@@Base+0x2b511>
      aa3c3a:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      aa3c3f:	48 89 d9             	mov    rcx,rbx

### rank 29: score=10 FDE=0xacf342..0xacf4c8 base=rdi offsets=0x30,0x40,0x60,0x68,0x80,0x98
- 0xacf378: mov    QWORD PTR [rdi+0x40],rax
- 0xacf380: movups XMMWORD PTR [rdi+0x30],xmm1
- 0xacf3aa: mov    QWORD PTR [rdi+0x60],rax
- 0xacf3ba: movups XMMWORD PTR [rdi+0x68],xmm1
- 0xacf3dc: movups XMMWORD PTR [rdi+0x80],xmm1
- 0xacf407: movups XMMWORD PTR [rdi+0x98],xmm1
  - context around +0x30 store:
      acf34a:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
      acf34d:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      acf350:	0f 57 c0             	xorps  xmm0,xmm0
      acf353:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      acf358:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
      acf35b:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
      acf35f:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      acf363:	0f 10 4e 18          	movups xmm1,XMMWORD PTR [rsi+0x18]
      acf367:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1
      acf36b:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
      acf370:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
      acf374:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
      acf378:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
      acf37c:	0f 10 4e 30          	movups xmm1,XMMWORD PTR [rsi+0x30]
      acf380:	0f 11 4f 30          	movups XMMWORD PTR [rdi+0x30],xmm1
      acf384:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
      acf389:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
      acf38d:	48 8b 46 58          	mov    rax,QWORD PTR [rsi+0x58]
      acf391:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
      acf395:	0f 10 4e 48          	movups xmm1,XMMWORD PTR [rsi+0x48]
      acf399:	0f 11 4f 48          	movups XMMWORD PTR [rdi+0x48],xmm1
      acf39d:	48 83 66 58 00       	and    QWORD PTR [rsi+0x58],0x0
      acf3a2:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
      acf3a6:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
      acf3aa:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
      acf3ae:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
      acf3b2:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
      acf3b6:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
      acf3ba:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
      acf3be:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
      acf3c2:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
      acf3c7:	48 8b 86 90 00 00 00 	mov    rax,QWORD PTR [rsi+0x90]
      acf3ce:	48 89 87 90 00 00 00 	mov    QWORD PTR [rdi+0x90],rax
      acf3d5:	0f 10 8e 80 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x80]
      acf3dc:	0f 11 8f 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm1
      acf3e3:	0f 11 86 80 00 00 00 	movups XMMWORD PTR [rsi+0x80],xmm0
      acf3ea:	48 83 a6 90 00 00 00 	and    QWORD PTR [rsi+0x90],0x0
      acf3f1:	00 
      acf3f2:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
      acf3f9:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax

### rank 30: score=10 FDE=0xad5990..0xad5ab1 base=rdi offsets=0x20,0x30,0x60,0x68,0x80,0x98
- 0xad59b3: mov    QWORD PTR [rdi+0x30],rax
- 0xad59bb: movups XMMWORD PTR [rdi+0x20],xmm1
- 0xad59e5: mov    QWORD PTR [rdi+0x60],rax
- 0xad5a06: movups XMMWORD PTR [rdi+0x68],xmm1
- 0xad5a28: movups XMMWORD PTR [rdi+0x80],xmm1
- 0xad5a36: movups XMMWORD PTR [rdi+0x98],xmm1
  - context around +0x30 store:
      ad5990:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      ad5994:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ad5998:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
      ad599b:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      ad599e:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      ad59a3:	0f 57 c0             	xorps  xmm0,xmm0
      ad59a6:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
      ad59a9:	8b 46 18             	mov    eax,DWORD PTR [rsi+0x18]
      ad59ac:	89 47 18             	mov    DWORD PTR [rdi+0x18],eax
      ad59af:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
      ad59b3:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
      ad59b7:	0f 10 4e 20          	movups xmm1,XMMWORD PTR [rsi+0x20]
      ad59bb:	0f 11 4f 20          	movups XMMWORD PTR [rdi+0x20],xmm1
      ad59bf:	0f 11 46 20          	movups XMMWORD PTR [rsi+0x20],xmm0
      ad59c3:	48 83 66 30 00       	and    QWORD PTR [rsi+0x30],0x0
      ad59c8:	48 8b 46 48          	mov    rax,QWORD PTR [rsi+0x48]
      ad59cc:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
      ad59d0:	0f 10 4e 38          	movups xmm1,XMMWORD PTR [rsi+0x38]
      ad59d4:	0f 11 4f 38          	movups XMMWORD PTR [rdi+0x38],xmm1
      ad59d8:	0f 11 46 38          	movups XMMWORD PTR [rsi+0x38],xmm0
      ad59dc:	48 83 66 48 00       	and    QWORD PTR [rsi+0x48],0x0
      ad59e1:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
      ad59e5:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
      ad59e9:	0f 10 4e 50          	movups xmm1,XMMWORD PTR [rsi+0x50]
      ad59ed:	0f 11 4f 50          	movups XMMWORD PTR [rdi+0x50],xmm1
      ad59f1:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
      ad59f5:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
      ad59fa:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
      ad59fe:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
      ad5a02:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
      ad5a06:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
      ad5a0a:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
      ad5a0e:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
      ad5a13:	48 8b 86 90 00 00 00 	mov    rax,QWORD PTR [rsi+0x90]
      ad5a1a:	48 89 87 90 00 00 00 	mov    QWORD PTR [rdi+0x90],rax
      ad5a21:	0f 10 8e 80 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x80]

