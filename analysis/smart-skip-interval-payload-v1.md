# Smart-skip interval payload semantics v1

Defensive documentation only. No patching, bypass, exploit.

## 1. Factory arg flow (TimelineConductorSetupImpl::factory 0x135c878 -> ctor 0x135d056)

- Primary: `call b632ca` @0x135c8c6 (validates svc 0x2f DownloadSetupImpl)
  -> `mov [rsp+0x1b8],rax` @0x135c8cb
  -> `mov rcx,[rsp+0x1b8]` @0x135ce83 -> `call 0x135d056` @0x135ce8b.
  SysV arg 4 (rcx). Ctor saves it: `mov [rsp+0x70],rcx` @0x135d0f7.
- Fallback: `call b9150c` @0x135c921 (validates svc 0x32 DspSetupImpl)
  -> `mov [rsp+0x190],rax` @0x135c926
  -> `mov rax,[rsp+0x190]; mov [rsp+0x48],rax` @0x135cde7/0x135cdef.
  SysV stack arg +0x48 (16th arg; callee `[rsp+0x10a8]` = caller `[rsp+0x48]`).
  Consumed @0x135da8e / @0x135dd44: `mov rdi,[rsp+0x10a8]; call [rdi+0x28]`
  (-> rbx @0x135da9c, -> r15 @0x135dd52).

## 2. Helper field map (0x110-byte helpers)

- Service (0xf0) holder slots: `lea rax,[rdi+0xb0]->[rsp+0xa8]` @0x135d155;
  `lea rax,[rdi+0xb8]->[rsp+0xa0]` @0x135d164.
- Primary alloc: `mov edi,0x110; call new` @0x135ece1, vptr `0x1869ea8` @0x135ecee.
  Setup `call 0x13a1b30` @0x135ed2a: rsi=`rbx+0x10`, rdi=`r13` (=`[rsp+0xad0]` stack obj).
  `0x13a1b30`: `[rsi]=0x1869f48; [rsi+0x8]=[rdi+0x8]` (8-byte copy).
- Fallback alloc @0x135edd7, vptr `0x186a0b8` @0x135ede4.
  Setup `call 0x13a3b66` @0x135ee28: `[rsi]=0x186a158; 16B [rdi+0x8]->[rsi+0x8]`.
- Helper init: `[rbx+0x30]=rbx+0x10` @0x135ed23/0x135ee21;
  `[rbx+0x68]/[rbx+0x70]=self` @0x135ed45/0x135ee43 (empty); mutex/zeroes
  +0x40/+0x50/+0x60/+0x78/+0x88/+0x98/+0xf0/+0x100.
- Dependency (0xbd0, r14) install: `[r14+0xb08]=r15` @0x135fc03,
  `[r14+0xb10]=r12` @0x135fc0a, where `r15=[rsp+0x70]+0x10`,
  `r12=[rsp+0x48]+0x10` (post-0x135f3b6 phase: `[rsp+0x70]/[rsp+0x48]`
  hold `[service+0xb0]/[service+0xb8]` contents, i.e. helper_base).
  Hence `dep+0xb08=primary_helper+0x10`, `dep+0xb10=fallback_helper+0x10`.
- Probe: `mov rdi,[rbx+0xb08]; call 0x13a1a4a` @0x1371ea5/0x1371eb2;
  `mov rdi,[rbx+0xb10]; call 0x13a392c` @0x1371ed3/0x1371ee5; rdx=current_ms.

## 3. Lookup-helper data structure

- `0x13a1a4a` / `0x13a392c`: build 24B stack vector at `[rsp+0x10]`
  (16B zero + 8B zero), fill via `call 0x13a1922` @0x13a1a80 /
  `call 0x13a37f8` @0x13a3962, then linear scan:
  `begin=[rsp+0x10], end=[rsp+0x18]`; `add rax,0x10` @0x13a1aa6/0x13a3988;
  match `start=[rax]<=cur<r14 && end=[rax+0x8]>cur` @0x13a1a9b/0x13a1aa0.
  Confirms 16-byte `(start_ms,end_ms)` pairs. Hit copies pair to out
  (`[rbx]=start,[rbx+0x8]=end` @0x13a1ad6/0x13a39b8); caller loads `end_ms`.
- Extractor `0x13a1922`/`0x13a37f8`: rdi=helper+0x10; mutex `rdi+0x30`
  (=base+0x40) via `17ee0f0`; `r15+0x58` (=base+0x68) as source to
  `call 0x13a046a` @0x13a199d / `call 0x13a3354` @0x13a387a.
- `0x13a046a`/`0x13a3354` -> `0x139fd9e`/`0x13a2c58`: `rdi+0x18` weak-lock
  via `c263ee`, generation check `[rbx+0x8]` vs `[obj+0x98]` (primary) /
  `[obj+0xa8]` (fallback), `d8ad18`, then copy `[upstream+0x68]` vector via
  `0x13a0498`/`0x13a3382` -> `0x13a04c6` (sar 4 = /16 element vector assign;
  callees `b03762/ab959e/b4db4e/b4db7c/b4dbef`).
- Pair array lives as heap vector buffer owned by upstream timeline object
  at `+0x68`, reached through helper_base+0x68 weak ref; copied to caller
  stack vector before scan. Helper itself does not store the array inline.

## 4. Population path: not found in ctor scope

- Searched: setup helpers `0x13a1b30/0x13a3b66` (only 8/16B copies);
  alloc/init `0x135ece1-0x135ee92`; vector-assign `0x13a04c6/0x13a0498/0x13a3382`;
  resolvers `0x139fd9e/0x13a2c58/0x13a046a/0x13a3354`; ctor range
  `0x135d056-0x1361200` for push_back/resize/append into helper+0x68.
- Helper+0x68 left as empty self-list at init; no interval-pair store into
  helper found. Content arrives later via upstream object behind the weak ref.

## 5. Payload verdict

Ordered `(start_ms,end_ms)` exclusion-interval lists sourced from the
Downloaded-content timeline (primary, DownloadSetupImpl 0x2f) vs the DSP
timeline (fallback, DspSetupImpl 0x32), probed in that order; containing
interval's `end_ms` becomes the `0x137cb68` seek target.
NOT proven: whether entries are ad markers vs chapter/clip boundaries, exact
writer/population timing of upstream+0x68, or units beyond the ms conversion
(`imul 0x3e8/div` @0x1371e6e) in `0x1371d90`. The two names denote upstream
playback sources, not two ad categories.

## 6. Open remainder

Setter/writer of upstream `+0x68` interval vector; semantic label of entries;
whether Download vs DSP lists can overlap/diverge; full type of `rsi+0x38==0x3f`
active-item gate in `0x13a1a4a/0x13a392c`.
