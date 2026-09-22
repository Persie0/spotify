# Final Skip-Ad readiness provenance summary

This is the compact current state after rejecting the old `0x6b0` and TimelineAds-wrapper interpretations, resolving the Restrictions setup-bundle source, and tracing the slot-object descriptor/builder path down through the local output layout.

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

The `owner+0x428` input is proven by the call layout into `ece57c`. Both sibling source builders pass `source+0x178` as SysV argument 12, and `ece57c` copies that pair into the wrapper installed at `owner+0x428`.

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

The secondary interface `0x1843bf8` is the exported readiness interface head, not the full owning object.

`0x1843bf8:+0x10` resolves to `0xfec736`, which delegates through the pointer stored at `interface+0x8`, i.e. the owning object's `base+0x20` field.

Construction shows:

```text
e94925  [base+0x20] = r12
e947cb  r12 = rbx+0x18
e947d6  [rbx+0x18] = AP 0x1832be8
```

So the inner dependency reached by `0x1843bf8:+0x10` is the secondary interface at `AP 0x1832be8`, not the rejected raw `0x6b0` record.

Current method chain:

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

## Setup-bundle source: closed

`bundle+0x30` is not an independent direct field store. It is the first element of inline vector storage for the vector subobject at `bundle+0x18`.

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

## Constructor and slot-object semantics

At `0x10aba36`, the `rcx` dependency is preserved in `rbp`, then repeatedly dereferenced and passed to deeper helpers. It is not a simple direct store to `child+0x18` in the scanned constructor windows.

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

The constructor helper wrappers are classified:

```text
10abfc3  call 15e768e
  -> 15e768e loads slot_obj vtable and calls [slot_obj.vtable+0x90]

10abff8 / 10ac028  call 15e75f2
  -> 15e75f2 loads slot_obj vtable and calls [slot_obj.vtable+0x98]

a7b5e8
  -> forwards to a7b624 / cleanup-style wrapper in the scanned window
```

Because the slot object AP is relocation-filled, raw `.data.rel.ro` bytes read as zero. Relocation-aware resolution gives:

```text
slot AP 0x187e2f8
  +0x30 -> 0x153d2a4   ; fill method already seen from 153cbfc
  +0x90 -> 0x165dd40   ; semantic target used by 15e768e
  +0x98 -> 0x153d0d0   ; semantic target used by 15e75f2
```

## Descriptor interpreter and local output path

`0x165dd40` is a descriptor/field interpreter. It calls the slot object's `+0x48` method, iterates 0x28-byte descriptor entries, dispatches by entry kind, and repeatedly calls branch helpers. These helpers are not final readiness methods; they write/update an output/builder object passed in `rdi`/`rbx`.

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

The deeper buffer/growth helpers are also classified as buffer/capacity emit helpers. None directly touches `child+0x18`.

```text
165c600: refs=9, writes=5,  calls=3, child+0x18 hits=0
165c67e: refs=4, writes=6,  calls=0, child+0x18 hits=0
165c6ca: refs=3, writes=21, calls=0, child+0x18 hits=0
165c7ae: refs=5, writes=18, calls=0, child+0x18 hits=0
165d0d4: refs=7, writes=2,  calls=2, child+0x18 hits=0
```

`165c600` contains a generic slow path that looks like a sink/refill interface:

```text
165c63b  mov rdi, [r13+0x18]       ; sink/interface object, if this path is live
165c63f  mov rax, [rdi]
165c642  mov rsi, r15              ; &builder output pointer
165c645  mov rdx, r14              ; &builder capacity
165c648  call [rax+0x10]           ; sink refill / flush
```

However, the local-builder layout trace shows this is a false semantic lead for the wrapper call path. The output objects passed into the slot AP methods are stack-local. For the first output object in each wrapper, `builder+0x18` resolves to the stack canary slot; for following output objects, `builder+0x18` overlaps adjacent local output objects.

`15e768e / AP +0x90` stack layout:

```text
frame: sub rsp,0x58
canary: rsp+0x50
out0 = rsp+0x38 -> out0+0x18 = rsp+0x50 = stack canary
out1 = rsp+0x20 -> out1+0x18 = rsp+0x38 = out0 base
out2 = rsp+0x08 -> out2+0x18 = rsp+0x20 = out1 base
```

`15e75f2 / AP +0x98` stack layout:

```text
frame: sub rsp,0x38
canary: rsp+0x30
out0 = rsp+0x18 -> out0+0x18 = rsp+0x30 = stack canary
out1 = rsp+0x00 -> out1+0x18 = rsp+0x18 = out0 base
```

This means `builder+0x18 -> sink.vtable+0x10` is a generic conditional slow path for the output/string-builder representation, not the Restrictions readiness object.

## Current conclusion

The final `state+0x40` dependency used by `fd381a` is a **RestrictionsSetupImpl-derived readiness source**. It should not be attributed to TimelineAds owner `+0x50`, the `0x18678f8` TimelineAds wrapper, or the old raw `0x6b0` interpretation.

Closed:

```text
setup-bundle +0x30 source
factory-consumption path
slot AP relocation targets
0x165dd40 branch helpers
buffer/growth emit helpers
builder sink/refill abstraction
local output builder layout / builder+0x18 false lead
```

Still open:

```text
post-wrapper output consumption inside 0x10aba36
  -> object stored/exposed as child+0x18
  -> inner virtual +0x30 / state+0x40 readiness discriminator
```

The next concrete target is not the generic emit/sink helpers. It is the post-wrapper object lifecycle inside `0x10aba36`: identify how the stack-local outputs from `15e768e`, `a7b5e8`, and `15e75f2` are consumed after the calls return, and where that processed result is assigned to the dependency returned by `b411a4`.

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
- `analysis/restrictions-builder-sink-finalization.md`
- `analysis/restrictions-local-builder-layout.md`
- `docs/15-skip-ad-signal.md`
