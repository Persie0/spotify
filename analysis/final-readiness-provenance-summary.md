# Final Skip-Ad readiness provenance summary

This is the compact state of the final availability/export investigation after the `0x6b0` and TimelineAds-wrapper aliases were rejected, after the Restrictions setup-bundle source was resolved, and after the `0x165dd40` branch/buffer helper layers were classified.

## Correct high-level chain

```text
readiness-source object
  +0x178 shared/erased payload
      |
      | builders AP 0x1834728/+0x30 -> 0xece084
      |          AP 0x1834418/+0x30 -> 0xee6db8
      v
  ece57c
      |
      | copies the first 16 bytes of arg12
      v
0x98-byte erased/shared wrapper
      |
      v
owner+0x428
      |
      v
e99d07
      |
      v
fd4c04
      |
      v
Skip-Ad adapter outer+0x58 / this+0x40
      |
      v
fd381a state+0x40 virtual +0x140 readiness/mode discriminator
```

The `owner+0x428` input is no longer just nearby or associated with `source+0x178`; the transfer is proven by the call layout into `ece57c`. Both sibling source builders pass `source+0x178` as SysV argument 12, and `ece57c` copies that pair into the wrapper installed at `owner+0x428`.

## Concrete secondary readiness interface

The pair copied through `source+0x178` is a `{head, owner}` pair:

```text
head  = base+0x18
owner = base
```

The owner is the 0x58-byte object allocated at `e948ff`:

```text
base+0x00 = primary AP 0x1831a70
base+0x18 = secondary readiness AP 0x1843bf8
base+0x20 = r12
base+0x28 = rbx
base+0x48 = copied owner+0x470 pair
```

The secondary interface `0x1843bf8` is therefore the exported readiness interface head, not the full owning object.

## Inner dependency behind the readiness interface

`0x1843bf8:+0x10` resolves to `0xfec736`. That method delegates through the pointer stored at `interface+0x8`, which is the owning object's `base+0x20` field.

Construction shows:

```text
e94925  [base+0x20] = r12
e947cb  r12 = rbx+0x18
e947d6  [rbx+0x18] = AP 0x1832be8
```

So the inner dependency reached by `0x1843bf8:+0x10` is the secondary interface at `AP 0x1832be8`, not the rejected raw `0x6b0` record.

The current method chain is:

```text
0x1843bf8:+0x10
      -> 0xfec736
      -> [this+0x8]
      -> AP 0x1832be8
      -> +0x10 / 0xea0f30
      -> delegates to [this+0x8] virtual +0x30
```

## Restrictions-derived final source

The delegated source is constrained to the Restrictions registry path:

```text
registry ID 0x9e
      -> RestrictionsSetupImpl
      -> service AP 0x184ca90
      -> service +0x28 returns [this+0x10]
      -> child AP 0x184da88 installed at service+0x10
      -> child +0x38 = 0xb411a4
      -> returns [child+0x18]
      -> child+0x18 comes from constructor rcx path
      -> factory supplies constructor rcx from input dependency bundle +0x30
```

The setup-bundle source for that constructor argument is resolved. `bundle+0x30` is not an independent direct field store; it is the first element of inline vector storage for the vector subobject at `bundle+0x18`.

```text
provider-vector caller
  -> constructs setup bundle at rsp+0x2e0
  -> rcx = rsp+0x310 = bundle+0x30
  -> [bundle+0x18] = bundle+0x30
  -> 166103c(bundle, post_add2a_obj)
  -> bundle.vtable+0x30 = 0x153cbfc
  -> 153cbfc selects bundle+0x18 vector subobject
  -> 1507a9e appends a newly allocated slot object
  -> 1507b1a stores that object pointer through [bundle+0x18] into bundle+0x30
  -> 153d2a4 fills that object from the descriptor stream
  -> RestrictionsSetupImpl factory reads [rdx+0x30]
  -> factory copies it to rsp+0x40
  -> factory passes it as rcx into constructor 0x10aba36
  -> child +0x38 / b411a4 returns child+0x18
```

Factory-consumption evidence:

```text
10ab7c2  mov rbx, rdx
10ab824  mov rax, [rbx+0x30]
10ab828  mov [rsp+0x40], rax
...
10ab93c  mov rdi, rbx
10ab93f  mov rsi, [rsp+0x58]
10ab944  mov rdx, [rsp+0x50]
10ab949  mov rcx, [rsp+0x40]
10ab94e  mov r9,  [rsp+0x48]
10ab97f  call 10aba36

b411a4   mov rax, [rdi+0x18]
b411a8   ret
```

Constructor dataflow narrowed the semantic target. At `0x10aba36`, the `rcx` dependency is preserved in `rbp`, then repeatedly dereferenced and passed to deeper helpers; it is not a simple direct store to `child+0x18` in the scanned constructor window.

```text
10aba51  mov rbp, rcx              ; rbp = bundle30-derived dependency
10abb09  mov r14, [rbp+0x0]
10abbaa  mov r14, [rbp+0x0]
10abc3d  mov r14, [rbp+0x0]
10abcd4  mov r14, [rbp+0x0]
10abd6b  mov r14, [rbp+0x0]
10abe02  mov r14, [rbp+0x0]
10abe99  mov r14, [rbp+0x0]
10abf30  mov r12, [rbp+0x0]
```

The helper wrappers reached from that constructor are classified:

```text
10abfc3  call 15e768e
  -> 15e768e loads slot_obj vtable and calls [slot_obj.vtable+0x90]

10abff8 / 10ac028  call 15e75f2
  -> 15e75f2 loads slot_obj vtable and calls [slot_obj.vtable+0x98]

a7b5e8
  -> forwards to a7b624 / cleanup-style wrapper in the scanned window
```

Because the slot object AP is relocation-filled, raw `.data.rel.ro` bytes read as zero. The relocation-aware trace resolves AP `0x187e2f8` as:

```text
slot AP 0x187e2f8
  +0x30 -> 0x153d2a4   ; fill method already seen from 153cbfc
  +0x90 -> 0x165dd40   ; semantic target used by 15e768e
  +0x98 -> 0x153d0d0   ; semantic target used by 15e75f2
```

## Descriptor interpreter and builder path

`0x165dd40` is a large descriptor/field interpreter. It calls the slot object's `+0x48` method, iterates a table of 0x28-byte entries, dispatches by entry kind, and repeatedly calls branch helpers. The traced branch helpers are not final readiness methods; they write/update a builder/output object passed in `rdi`/`rbx`.

```text
0x165dd40 parent interpreter
  -> 165e51e(builder/output object, field id, scalar/value)
  -> 165cc82(builder/output object, field id, type tag)
  -> 165e60c(builder/output object, descriptor element value)
```

Branch-helper classification:

```text
165e51e: refs=13, writes=14, tracked calls=2   -> writes/updates builder object
165cc82: refs=13, writes=13, tracked calls=2   -> writes/updates builder object
165e60c: refs=15, writes=9,  tracked calls=6   -> writes/updates builder object
```

Representative builder writes from `165e51e`:

```text
165e52c  mov [rdi+0x20], esi       ; builder field/index cursor
165e544  mov [rcx], al             ; emit encoded tag byte
165e546  inc [r14+0x8]             ; advance output pointer
165e54a  dec [r14+0x10]            ; reduce available capacity
165e57f  mov [rax], ebx            ; emit scalar/value
165e581  add [r14+0x8], 0x4        ; advance output pointer
165e586  add [r14+0x10], -4        ; reduce available capacity
```

The deeper buffer/growth helpers reached by those branch helpers are now classified too. They are all builder buffer/capacity emit helpers and none has a direct `child+0x18` hit in the scanned windows:

```text
165c600: refs=9, writes=5,  calls=3, child+0x18 hits=0 -> append/copy bytes into builder output buffer
165c67e: refs=4, writes=6,  calls=0, child+0x18 hits=0 -> emit encoded scalar slow path
165c6ca: refs=3, writes=21, calls=0, child+0x18 hits=0 -> single-byte emit slow path / capacity refill
165c7ae: refs=5, writes=18, calls=0, child+0x18 hits=0 -> multi-byte varint emit slow path
165d0d4: refs=7, writes=2,  calls=2, child+0x18 hits=0 -> 32-bit scalar emit fallback
```

Important `165c600` behavior:

```text
165c611  lea r14, [rdi+0x10]       ; builder capacity field
165c615  lea r15, [rdi+0x8]        ; builder output pointer field
165c626  call memcpy               ; copy data into current output buffer
165c63b  mov rdi, [r13+0x18]
165c648  call [rax+0x10]           ; refill/flush via builder sink interface
165c64f  and [r13+0x8], 0
165c654  and [r13+0x10], 0
165c660..165c670                  ; fast-path memcpy + pointer/capacity update
```

So the proven semantic picture is:

```text
slot object AP 0x187e2f8
  -> +0x90 / 0x165dd40
  -> descriptor interpreter
  -> branch helpers encode descriptor fields
  -> builder/output buffer helpers append bytes, varints, scalars
  -> builder sink/refill interface at builder+0x18 / vtable+0x10
```

This still does not prove that the builder/output buffer is itself the object eventually exposed through `child+0x18`. The builder path now appears to be a materialization/serialization layer below the Restrictions-derived source, not the final readiness/mode-discriminator interface.

This means the final `state+0x40` dependency used by `fd381a` is still a **RestrictionsSetupImpl-derived readiness source**. It should not be attributed to TimelineAds owner `+0x50`, the `0x18678f8` TimelineAds wrapper, or the old raw `0x6b0` interpretation.

## What remains open

The setup-bundle `+0x30` source, factory-consumption path, slot AP relocation targets, `0x165dd40` branch-helper behavior, and lower buffer/growth emit helpers are now classified.

The remaining open area is the semantic bridge after materialization:

```text
builder/output buffer and sink interface
  -> wrapper/storage step inside or after constructor 0x10aba36
  -> object returned through child+0x18 / b411a4
  -> state+0x40 virtual +0x140 readiness/mode discriminator used by fd381a
```

The next concrete targets are therefore no longer the buffer emit helpers. They are the storage/finalization sites in `0x10aba36` after the builder output calls, plus the builder sink interface reached at:

```text
165c63b  mov rdi, [builder+0x18]
165c648  call [sink.vtable+0x10]
```

Resolving that sink AP and the later constructor writes should show whether the materialized descriptor stream is wrapped into the object returned by `b411a4` or only used as intermediate setup data.

The AdsRuntime/TimelineAds readiness graph is still proven as an execution-side readiness bridge:

```text
AdsRuntime+0x1b8
  -> TimelineAds owner+0x20/+0x10
  -> TimelineAds owner+0x50
  -> TimelineConductor consumption
```

But that graph must not be treated as the final availability-export receiver until it is connected to the Restrictions-derived `owner+0x428` source above.

## Evidence reports

- `analysis/field428-install-proof.md`
- `analysis/final-readiness-secondary-1843bf8.md`
- `analysis/final-readiness-carrier-inner.md`
- `analysis/final-readiness-dependency-methods.md`
- `analysis/final-readiness-source-rsi.md`
- `analysis/readiness-concrete-service-vtables.md`
- `analysis/readiness-registry-services.md`
- `analysis/restrictions-readiness-objects.md`
- `analysis/restrictions-provider-callsite-summary.md`
- `analysis/restrictions-inline-vector-layout.md`
- `analysis/restrictions-factory-consumption.md`
- `analysis/restrictions-child18-semantics.md`
- `analysis/restrictions-constructor-dataflow.md`
- `analysis/restrictions-helper-semantics.md`
- `analysis/restrictions-slot-vtable.md`
- `analysis/restrictions-slot-relocations.md`
- `analysis/restrictions-165dd40-branch-helpers.md`
- `analysis/restrictions-builder-buffer-helpers.md`
- `docs/15-skip-ad-signal.md`
