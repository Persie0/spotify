# Final Skip-Ad readiness provenance summary

This is the compact current state after rejecting the old `0x6b0` and TimelineAds-wrapper interpretations, resolving the Restrictions setup-bundle source, classifying the slot-object descriptor/builder path, tracing the constructor-owned `this+0x78` lifecycle, and following the first constructor-tail wrapper objects.

## Correct high-level chain

```text
readiness-source object
  +0x178 shared/erased payload
      |
      | builders AP 0x1834728/+0x30 -> 0xece084
      |          AP 0x1834418/+0x30 -> 0xee6db8
      v
  ece57c
      | copies first 16 bytes of arg12
      v
0x98-byte erased/shared wrapper
      v
owner+0x428
      v
e99d07 -> fd4c04 -> Skip-Ad adapter outer+0x58 / this+0x40
      v
fd381a state+0x40 virtual +0x140 readiness/mode discriminator
```

The `owner+0x428` path is proven by the call layout into `ece57c`. Both sibling source builders pass `source+0x178` as SysV argument 12, and `ece57c` copies that pair into the wrapper installed at `owner+0x428`.

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

`0x1843bf8:+0x10` resolves to `0xfec736`, which delegates through `interface+0x8` to the owner field `base+0x20`. Construction shows `base+0x20` is the secondary interface at `AP 0x1832be8`, not the rejected raw `0x6b0` record:

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

Factory-consumption evidence:

```text
10ab824  mov rax, [rbx+0x30]
10ab828  mov [rsp+0x40], rax
...
10ab949  mov rcx, [rsp+0x40]
10ab97f  call 10aba36

b411a4   mov rax, [rdi+0x18]
b411a8   ret
```

## Setup-bundle and slot-object path: closed

`bundle+0x30` is the first element of inline vector storage for the vector subobject at `bundle+0x18`, not an independent direct field store:

```text
provider-vector caller
  -> constructs setup bundle at rsp+0x2e0
  -> [bundle+0x18] = bundle+0x30
  -> 166103c(bundle, post_add2a_obj)
  -> bundle.vtable+0x30 = 0x153cbfc
  -> 153cbfc selects bundle+0x18 vector subobject
  -> 1507a9e appends a newly allocated slot object
  -> 1507b1a stores that object pointer through [bundle+0x18] into bundle+0x30
  -> 153d2a4 fills that object from the descriptor stream
  -> RestrictionsSetupImpl factory reads [rdx+0x30]
  -> factory passes it as rcx into constructor 0x10aba36
```

Slot AP relocation-aware resolution:

```text
slot AP 0x187e2f8
  +0x30 -> 0x153d2a4
  +0x90 -> 0x165dd40
  +0x98 -> 0x153d0d0
```

`0x165dd40` is a descriptor/field interpreter, not the final readiness method. Its branch helpers and deeper helpers write temporary builder/output buffers and do not touch `child+0x18`:

```text
0x165dd40
  -> 165e51e / 165cc82 / 165e60c builder writers
  -> 165c600 / 165c67e / 165c6ca / 165c7ae / 165d0d4 buffer emit helpers
  -> child+0x18 hits = 0
```

The wrapper-local `builder+0x18` sink was rejected because in the relevant wrapper call path it overlaps the stack canary or adjacent local outputs.

## Constructor `this+0x78` lifecycle

After the final two `15e75f2` calls, the constructor enters a persistent object allocation sequence:

```text
10ac12c  operator new(0x28)
10ac131  r14 = allocated_0x28
10ac149  operator new(0x30)
10ac14e  r12 = allocated_0x30
10ac159  a7a290(allocated_0x30, [rsp+0x10])
10ac166  [stack_wrapper+0x00] = allocated_0x30
10ac171  [stack_wrapper+0x10] = ac39da
10ac17c  [stack_wrapper+0x18] = 10adc16
10ac187  [allocated_0x28+0x00] = 0x184d898
10ac194  107162a(allocated_0x28+0x08, stack_wrapper)
10ac19c  de1c52(stack_wrapper)
10ac1a9  [this+0x78_target] = allocated_0x28
```

Then more inner objects are created:

```text
10ac1ba  operator new(0x58)
10ac1c6  [allocated_0x58+0x00] = 0x187e260

10ac249  operator new(0x150)
10ac255  [allocated_0x150+0x00] = 0x184d808
10ac262..10ac27e  zero [allocated_0x150+0x08..0x87]
10ac289  [allocated_0x150+0x90] = 0x180e8e0
10ac297  [allocated_0x150+0x98] = system_clock::now entry
10ac2b6  [allocated_0x150+0xc0] = 0x180e8e0
10ac2c4  [allocated_0x150+0xc8] = steady_clock::now entry
10ac2ee  [allocated_0x150+0x130] = r13
10ac2fd  [allocated_0x150+0x138] = rcx
10ac309  [allocated_0x150+0x140] = 0
```

## First `vtable+0x28` calls and `wrapper_0x80`

The post-install reader/method trace shows two indirect `vtable+0x28` calls:

```text
10ac372  mov rdi, [rsp+0x40]
10ac377  mov rax, [rdi]
10ac37a  call [rax+0x28]
10ac37d  r14 = return_from_first_vtable28
10ac380  mov rax, [r15]
10ac383  mov rdi, r15
10ac386  call [rax+0x28]
10ac389  r15 = return_from_second_vtable28
```

Those returns are packed into `wrapper_0x80`:

```text
10ac391  operator new(0x80)
10ac399  lea rax, 0x184d0a0
10ac3a0  [wrapper_0x80+0x00] = 0x184d0a0
10ac3a3  [wrapper_0x80+0x08] = first returned object
10ac3a7  [wrapper_0x80+0x10] = second returned object
10ac3ab  rax = [rsp+0x28]          ; allocated_0x150
10ac3b0  [wrapper_0x80+0x18] = allocated_0x150
```

This is not a direct `child+0x18` assignment.

## `wrapper_0x80` continuation: latest result

The wrapper trace shows `wrapper_0x80` is initialized further and saved in a stack slot, not immediately exported:

```text
10ac3b4  r15 = wrapper_0x80
10ac3b7  call b64110
10ac3bc  [wrapper_0x80+0x20] = rax
10ac3c0  [wrapper_0x80+0x28] = rdx
10ac3c4  [wrapper_0x80+0x30] = 0
10ac3c9  rdi = wrapper_0x80+0x38
10ac3cd  rsi = [wrapper_0x80+0x18] ; allocated_0x150
```

It then builds erased stack wrappers around `wrapper_0x80` and calls methods on `allocated_0x150`:

```text
10ac3d9  [stack_wrapper] = wrapper_0x80
10ac3e3  [stack_wrapper+0x10] = a7c464
10ac3ee  [stack_wrapper+0x18] = 10b2d7c
10ac3f2  rax = [allocated_0x150]
10ac3f5  call [rax+0x18]

10ac408  rsi = [wrapper_0x80+0x18]
10ac40c  [stack_wrapper] = wrapper_0x80
10ac416  [stack_wrapper+0x10] = a7c464
10ac421  [stack_wrapper+0x18] = 10b3082
10ac425  rdi = wrapper_0x80+0x48
10ac437  call [allocated_0x150.vtable+0x10]
```

Finally this branch stores the wrapper into a local slot and initializes local fields:

```text
10ac447  zero xmm0
10ac44a  zero [wrapper_0x80+0x68]
10ac44f  zero [wrapper_0x80+0x58]
10ac454  [rsp+0x70] = wrapper_0x80
10ac459  [wrapper_0x80+0x78] = 0x3f800000
```

If that branch is not taken, there is a fallback tiny object:

```text
10ac473  operator new(0x8)
10ac478  AP/literal 0x184d1f0
10ac47f  [rsp+0x70] = fallback_0x8
10ac484  [fallback_0x8] = 0x184d1f0
```

Construction then continues into another object:

```text
10ac4e4  mov rdi, [rsp+0x40]
10ac4ec  call [rax+0x28]
10ac4ef  r14 = return_from_vtable28
10ac4f7  operator new(0xd8)
10ac4fc  AP/literal 0x184d9a8
10ac503  [wrapper_0xd8+0x00] = 0x184d9a8
10ac506  [wrapper_0xd8+0x08] = r14_return
10ac50a  rsi = [rsp+0x28]          ; allocated_0x150
10ac50f  [wrapper_0xd8+0x10] = allocated_0x150
10ac513  [wrapper_0xd8+0x18] = 0
```

So the newest edge is:

```text
wrapper_0x80 / AP 0x184d0a0
  -> initialized with returned objects + allocated_0x150
  -> augmented with b64110 result and allocated_0x150 virtual calls
  -> stored in [rsp+0x70]
  -> constructor continues into wrapper_0xd8 / AP 0x184d9a8
```

## Current conclusion

The final `state+0x40` dependency used by `fd381a` is still best attributed to a **RestrictionsSetupImpl-derived readiness source**. It should not be attributed to TimelineAds owner `+0x50`, the `0x18678f8` TimelineAds wrapper, or the old raw `0x6b0` interpretation.

Closed:

```text
setup-bundle +0x30 source
factory-consumption path
slot AP relocation targets
0x165dd40 branch helpers
buffer/growth emit helpers
builder sink/refill abstraction
local output builder layout / builder+0x18 false lead
post-wrapper return-value consumption / wrapper outputs as return values
this+0x78 allocation sequence through allocated_0x28 install
ac39da / 10adc16 stack-wrapper behavior
this+0x78 fast reader trace through first [vtable+0x28] calls
first vtable+0x28 return packing into wrapper_0x80 / AP 0x184d0a0
wrapper_0x80 initialization through [rsp+0x70]
```

Still open:

```text
full provenance of [rsp+0x40] at 10ac372 / 10ac4e4
full provenance of r15 before 10ac386
concrete vtable+0x28 targets for the receivers
lifecycle/readers of wrapper_0x80 AP 0x184d0a0
lifecycle/readers of wrapper_0xd8 AP 0x184d9a8
whether wrapper_0x80, wrapper_0xd8, or their child objects feed child+0x18 / b411a4
inner virtual +0x30 / state+0x40 readiness discriminator
```

Next concrete batch:

```text
trace constructor tail after 10ac50f / 10ac51b
trace [rsp+0x70] consumption
trace wrapper_0xd8 / AP 0x184d9a8 lifecycle
search for the direct final store/read path to child+0x18 / b411a4
```

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
- `analysis/restrictions-post-wrapper-output-consumption.md`
- `analysis/restrictions-this78-lifecycle.md`
- `analysis/restrictions-this78-readers-fast.md`
- `analysis/restrictions-vtable28-provenance.md`
- `analysis/restrictions-wrapper80-provenance.md`
- `docs/15-skip-ad-signal.md`
