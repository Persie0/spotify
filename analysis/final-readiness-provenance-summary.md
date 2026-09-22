# Final Skip-Ad readiness provenance summary

This is the compact state of the final availability/export investigation after the `0x6b0` and TimelineAds-wrapper aliases were rejected, and after the Restrictions setup-bundle source was resolved.

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

The setup-bundle source for that constructor argument is now resolved. `bundle+0x30` is not an independent direct field store; it is the first element of inline vector storage for the vector subobject at `bundle+0x18`.

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

The factory-consumption evidence is:

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

The helper wrappers reached from that constructor are now classified:

```text
10abfc3  call 15e768e
  -> 15e768e loads slot_obj vtable and calls [slot_obj.vtable+0x90]

10abff8 / 10ac028  call 15e75f2
  -> 15e75f2 loads slot_obj vtable and calls [slot_obj.vtable+0x98]

a7b5e8
  -> only forwards to a7b624 / cleanup-style wrapper in the scanned window
```

Because the slot object AP is relocation-filled, raw `.data.rel.ro` bytes read as zero. The relocation-aware trace resolves AP `0x187e2f8` as:

```text
slot AP 0x187e2f8
  +0x30 -> 0x153d2a4   ; fill method already seen from 153cbfc
  +0x90 -> 0x165dd40   ; semantic target used by 15e768e
  +0x98 -> 0x153d0d0   ; semantic target used by 15e75f2
```

`0x165dd40` is a large descriptor/field interpreter: it calls the slot object's `+0x48` method, then iterates a table of 0x28-byte entries, dispatches on entry kind, and calls helpers such as `165e51e`, `165cc82`, and `165e60c`. `0x153d0d0` is the other already-seen slot-fill/descriptor path. These are now the concrete semantic methods behind the bundle30-derived Restrictions source.

This means the final `state+0x40` dependency used by `fd381a` is a **RestrictionsSetupImpl-derived readiness source**. It should not be attributed to TimelineAds owner `+0x50`, the `0x18678f8` TimelineAds wrapper, or the old raw `0x6b0` interpretation.

## What remains open

The setup-bundle `+0x30` source and factory-consumption path are closed. The remaining open area is semantic interpretation inside the slot object's relocated AP methods:

```text
0x165dd40  ; AP 0x187e2f8 +0x90, descriptor/field interpreter
0x153d0d0  ; AP 0x187e2f8 +0x98, slot-fill/descriptor path
```

The next concrete target is `0x165dd40`, especially its branch helpers that consume descriptor table entries and may construct or update the object returned through `child+0x18`:

```text
165e51e
165cc82
165e60c
```

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
- `docs/15-skip-ad-signal.md`
