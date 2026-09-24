# Interim: receiver bound, packages vestigial, seek avenue opened

Follows `analysis/continuation-native-chain.md`. Static provenance only.

## 1. r14 AP bound: 0x1822a40 (thread A CLOSED)

- `r12` at `d083e9` proven = `0x710`-byte object allocated at `d07bbd`
  (straight-line flow `d078b5 -> d083e9`; only out-jump `d0827b -> d08461` skips the site;
  all other jumps in range are local diamonds: `d07a2b->d07a33`, `d07d77/d07d7c/d07d84/d07d90`
  rejoins, `d081fc/d0824c/d08268 -> d08270`).
- Its vptrs (installed `d07bca..d07bf4`): `[+0x00]=0x1822840`, `[+0x08]=0x1822a40`,
  `[+0x10]=0x1822a80`, `[+0x18]=0x1822ac8`.
- `A = [localfiles-svc+0x18]`, `A[0] = r12` (stored `d083ed`), so A's vtable = `0x1822840`.
- AP `0x1822840 +0x178 = 0xaf6576` = `lea rax,[rdi+8]; ret`.
  => factory-0x76 `rbp` = `r12obj+8`; its vtable = `[r12obj+8]` = **`0x1822a40`**.
- Receiver `r14 = O50[0] = svc-0x76+0x10[0] = rbp`, therefore **r14's AP = `0x1822a40`**
  (header `pre8 == 0`).

## 2. r14 +0xa0/+0xa8 bound (thread B CLOSED)

Reloc-backed slots of AP `0x1822a40`:

```text
+0xa0 -> d1b8f6:  lea rax,[rdi+0xc0]; ret   (out-buffer accessor, ignores rdx package)
+0xa8 -> d1b8fe:  lea rax,[rdi+0x70]; ret   (out-buffer accessor, ignores rdx package)
+0x140 -> 9d7de0  (shared base helper, not a readiness discriminator here)
```

Sibling APs share the tails (`0x1822ac8 +0x18/+0x20 = d1b8f6/d1b8fe`).

## 3. Thread C CLOSED: e99c54 bridge is dead in F

- `e99c54` body (`e99c54..e99d07`): `aab330(&stack, original)`; if `[stack]` nonzero,
  `call [provider.vtable+0x78]` then `call [consumer.vtable+0x10]` (`consumer = [original+0x10]`),
  `ea785e` cleanup. Would-be bridge provider+0x78 -> consumer+0x10.
- But: **zero direct callers** of `e99c54`/`e9940c`/`e9959c` in all of `.text`
  (index-backed query); each packaged exactly once (`e9313a`, `e931cb`, `e950d9`
  via `17da794`), passed as ignored `rdx` to `+0xa0/+0xa8`, return values ignored,
  then destroyed via `17da7e8` (which is destroy-only: `17da802` deleter + free,
  then tail to `0x15ef27c`).
- `[rsp+0x390]/[rsp+0x398]` (receiver pair) has loads only in F
  (`e930dd/e5`, `e9344e/56`, `e95091/99`, `e95b66`, `e95d10`, `e96603/12`;
  `e97ab4`/`e988cd` pass `&pair` to destructors) — r14 is always AP `0x1822a40`.
- `e994ce` (`e994ce..e9959b`) is a 16-byte-element vector-append helper, not a dispatcher.
- The LIVE bridge is `e99d07` (function `e99d07..ea1f28`, 0x8221 bytes), called once
  from F at `e95d35` with ~48 stack args including `[rsp+0x398]` receiver material
  (`e95d10`) and duplicated `[rsp+0x220]` (`e95cfb`, `e95d17`). Tracing e99d07's interior
  (toward `P+0x40` / `fd381a state+0x40`) remains open but is PURE in-process RE with
  no external adblock consequence (no public MediaSession export exists for it).

## 4. Seek avenue (new, in progress)

Motivation: find any EXTERNAL adblock beyond mute.

- Ad metadata carries a `seekable` flag: AP-family `+0xd8 = 0x14e24b8`
  (`add rdi,0x20`, key `\x10seekable` at `0x4389c8`, compare `true` at `0x451c20`).
  Siblings: `+0xc8` raw `skippable` (`0x14e2472`, key `\x12skippable`),
  `+0xe0` `interruptible` (`0x14e24d0`, key `\x1ainterruptible`).
- Restriction builder `[0x10a6464, 0x10a7f53)` calls them virtually:
  `10a688e:+0xd8`, `10a68d4:+0xc8`, `10a69f2:+0xe8`, `10a7591:+0xd0`,
  `10a75df:+0xd8`, `10a762d:+0xe0`.
- Ad region (`0x10a7492+`, gated on `+0x598/+0x470` optionals) inserts `ad_disallow`
  (string at `0x36dd45`) into **7 slots**: `+0x14a0` (skip-next), `+0x14b8`,
  `+0x15c0`, `+0x14d0`, `+0x14e8` (unless `+0xd0` skippable), `+0x1488` (skipping-prev,
  unless `+0xd8` seekable), `+0x15a8` (unless `+0xe0` interruptible).
- Full restriction schema recovered from deserializer `fe9a77..fea5b8`
  (`fea7e8` field loop: 22 reason fields). Ground-truth offsets:
  pausing `0x00`, resuming `0x18`, **seeking `0x30`**, peeking_prev `0x48`,
  peeking_next `0x60`, skipping_prev `0x78`, skipping_next `0x90`,
  repeat_context `0xd8`, repeat_track `0xf0`, shuffle `0x108`, set_queue `0x120`,
  add_to_queue `0x138`, interrupting `0x150`, transferring `0x168`,
  remote_control `0x180`, inserting_next `0x198`, inserting_context `0x1b0`,
  reordering_next `0x1c8`, reordering_context `0x1e0`, removing_next `0x1f8`,
  removing_context `0x210`, updating_context `0x228`.
  (Builder working-struct base `r14+0x1410`: next `0x90->0x14a0` etc.;
  `+0x15a8` = inserting_next, `+0x15c0` = inserting_context — NOT seek slots.)
- **No write to the seeking restriction was found anywhere in the builder**
  (only the merge read `b499d2(dst=[r14+0x1808], src=[r14+0x1440])` at `0x10a7a45`).
- Android side: `pqd0.onSeekTo(J)` (smali `10466`) dispatches internal command **5**
  via `tpd0`; command 5 maps to action `0x100` (`ACTION_SEEK_TO`); the `0x100` bit is
  stripped only when `v6 == 0`, i.e. `!hasCommand(16) || pdp0.a1()` (`a1()` delegates
  to player iface `g7p0.a1()`, smali `pdp0:2634`).

## 5. Next steps

1. Decide seek viability: whether command 5 / the native Seek RPC honors seeks during
   ads (needs the Seek handler; candidates: secondary dispatcher `0x1204218` family
   or a `ContextPlayer/Seek` endpoint). If the handler clamps/rejects during ads,
   seek is closed and the external verdict stays mute-only.
2. Optional pure-RE remainder: trace `e99d07` interior to `P+0x40`/`fd381a state+0x40`
   (in-process only; does not affect the external verdict).
