# Final Skip-Ad readiness provenance summary

Compact current state after rejecting the old `0x6b0` and TimelineAds-wrapper interpretations, resolving the Restrictions setup-bundle source, classifying the slot-object descriptor/builder path, tracing the constructor-owned `this+0x78` lifecycle, following the first constructor-tail wrapper objects, and running parallel open-path traces for `[rsp+0x40]`, `[rsp+0x70]`, `wrapper_0xd8`, and `child+0x18 / b411a4`.

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
      | copies first 16 bytes of arg12
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

The final `state+0x40` dependency used by `fd381a` is still best explained as a **RestrictionsSetupImpl-derived readiness source**, not TimelineAds owner `+0x50`, `0x18678f8`, or the old raw `0x6b0` interpretation.

## Restrictions-derived source path

```text
registry ID 0x9e
  -> RestrictionsSetupImpl
  -> service AP 0x184ca90
  -> service +0x28 returns [this+0x10]
  -> child AP 0x184da88 installed at service+0x10
  -> child +0x38 = b411a4
  -> b411a4 returns [child+0x18]
```

`b411a4` itself is confirmed as only a trivial getter:

```text
b411a4   mov rax, [rdi+0x18]
b411a8   ret
```

So the remaining task is still to identify the writer/source of the child object's `+0x18`, not the getter.

## Setup-bundle source: closed

`bundle+0x30` is the first element of inline vector storage for the vector subobject at `bundle+0x18`.

```text
provider-vector caller
  -> constructs setup bundle at rsp+0x2e0
  -> rcx = rsp+0x310 = bundle+0x30
  -> [bundle+0x18] = bundle+0x30
  -> 166103c(bundle, post_add2a_obj)
  -> bundle.vtable+0x30 = 0x153cbfc
  -> 153cbfc selects bundle+0x18 vector subobject
  -> 1507a9e appends newly allocated slot object
  -> 1507b1a stores that object pointer through [bundle+0x18] into bundle+0x30
  -> 153d2a4 fills slot object from descriptor stream
  -> RestrictionsSetupImpl factory reads [rdx+0x30]
  -> factory passes it as rcx into constructor 0x10aba36
```

Factory call evidence remains:

```text
10ab824  mov rax, [rbx+0x30]
10ab828  mov [rsp+0x40], rax
...
10ab93c  mov rdi, rbx
10ab93f  mov rsi, [rsp+0x58]
10ab944  mov rdx, [rsp+0x50]
10ab949  mov rcx, [rsp+0x40]
10ab94e  mov r9,  [rsp+0x48]
10ab97f  call 10aba36
```

## Slot/descriptor path: closed as final-source false lead

The slot AP is relocation-filled and resolves to:

```text
slot AP 0x187e2f8
  +0x30 -> 0x153d2a4
  +0x90 -> 0x165dd40
  +0x98 -> 0x153d0d0
```

`0x165dd40` and its helper chain are descriptor/builder/buffer logic, not the final readiness object. Wrapper-local `builder+0x18` was rejected because it overlaps stack-local output/canary layout in the wrapper path.

## Constructor-owned persistent path

The constructor pivots after the final `15e75f2` calls into persistent object allocation:

```text
10ac12c  operator new(0x28)
10ac131  r14 = allocated_0x28
10ac149  operator new(0x30)
10ac159  a7a290(allocated_0x30, [rsp+0x10])
10ac187  [allocated_0x28+0x00] = 0x184d898
10ac194  107162a(allocated_0x28+0x08, stack_wrapper)
10ac1a9  [this+0x78_target] = allocated_0x28
```

Then it builds inner objects:

```text
10ac1ba  operator new(0x58)   -> AP 0x187e260
10ac249  operator new(0x150)  -> AP 0x184d808
```

The `vtable+0x28` calls on the installed object family return objects that get packed into a `0x80` wrapper:

```text
10ac37a  call [rax+0x28]     ; receiver from [rsp+0x40]
10ac37d  r14 = first_return
10ac386  call [rax+0x28]     ; receiver r15
10ac389  r15 = second_return
10ac391  operator new(0x80)
10ac3a0  [wrapper_0x80+0x00] = 0x184d0a0
10ac3a3  [wrapper_0x80+0x08] = first_return
10ac3a7  [wrapper_0x80+0x10] = second_return
10ac3b0  [wrapper_0x80+0x18] = allocated_0x150
```

`wrapper_0x80` is initialized further and stored locally, but is not yet the proven `child+0x18` value:

```text
10ac3bc  [wrapper_0x80+0x20] = rax
10ac3c0  [wrapper_0x80+0x28] = rdx
10ac454  [rsp+0x70] = wrapper_0x80
10ac459  [wrapper_0x80+0x78] = 0x3f800000
```

Frame-provenance trace v2 clarified:

```text
[rsp+0x40]
  10aba54  [rsp+0x40] = rdx          ; constructor arg rdx, saved at entry
  10ac372  receiver for first vtable+0x28 call
  10ac4e4  receiver for later vtable+0x28 call
  10acd33 / 10acdad later receivers before the stack slot is reused

[rsp+0x70]
  10ac454  [rsp+0x70] = wrapper_0x80
  10ac47f  fallback: [rsp+0x70] = fallback_0x8 AP 0x184d1f0
  10ad69b  later read into rcx
  10adb4f  later cleanup/read into rdi
```

## Latest constructor-tail result: wrapper_0xd8 and stronger final-store candidate

After the second `[rsp+0x40]` `vtable+0x28` call, the constructor builds a `0xd8` wrapper:

```text
10ac4e4  mov rdi, [rsp+0x40]
10ac4ec  call [rax+0x28]
10ac4ef  r14 = return_from_vtable28
10ac4f7  operator new(0xd8)
10ac503  [wrapper_0xd8+0x00] = 0x184d9a8
10ac506  [wrapper_0xd8+0x08] = r14_return
10ac50f  [wrapper_0xd8+0x10] = allocated_0x150
10ac513  [wrapper_0xd8+0x18] = 0
```

Then it initializes callback/erased-wrapper state on `wrapper_0xd8`:

```text
10ac523  [stack_wrapper] = wrapper_0xd8
10ac52d  [stack_wrapper+0x10] = a7c464
10ac538  [stack_wrapper+0x18] = 10c0234
10ac542  call [allocated_0x150.vtable+0x18]

10ac560  [stack_wrapper] = wrapper_0xd8
10ac56a  [stack_wrapper+0x10] = a7c464
10ac575  [stack_wrapper+0x18] = 10c02ae
10ac584  call [allocated_0x150.vtable+0x10]
```

The next stronger final-store candidate appears later in the same constructor tail:

```text
10ac7d5  mov rax, [rsp+0x18]
10ac7dd  mov [rax], r14
10ac7e8  call [old_value.vtable+0x8]   ; cleanup of previous pointee if present
```

This is important because it is a direct store through an output pointer, unlike the earlier wrapper-local stores. The open question is now the provenance of `[rsp+0x18]` and whether the `r14` stored there is the object later exposed as `child+0x18`.

## Current closed items

```text
setup-bundle +0x30 source
factory-consumption path
slot AP relocation targets
0x165dd40 branch helpers
buffer/growth emit helpers
builder sink/refill abstraction
local output builder layout / builder+0x18 false lead
post-wrapper return-value consumption
this+0x78 allocation sequence through allocated_0x28 install
ac39da / 10adc16 stack-wrapper behavior
this+0x78 fast reader trace through first [vtable+0x28] calls
first vtable+0x28 returns packed into wrapper_0x80 / AP 0x184d0a0
child getter b411a4 classified as trivial [rdi+0x18] getter
[rsp+0x40] provenance as constructor argument rdx saved at entry
```

## Still open / next best target

```text
[rsp+0x18] provenance before 10ac7d5
r14 provenance at 10ac7dd
whether [rsp+0x18] is the output slot that becomes child+0x18
later [rsp+0x70] read at 10ad69b and cleanup at 10adb4f
later [rsp+0x40] receivers at 10acd33 / 10acdad
whether wrapper_0xd8 / AP 0x184d9a8 or the later r14 store feeds b411a4
```

## Evidence reports

- `analysis/restrictions-tail-after-wrapperd8-v2.md`
- `analysis/restrictions-frame-provenance-v2.md`
- `analysis/restrictions-child18-parallel.md`
- `analysis/restrictions-child18-parallel-v2.md`
- `analysis/restrictions-wrapper80-provenance.md`
- `analysis/restrictions-vtable28-provenance.md`
- `analysis/restrictions-this78-readers-fast.md`
- `analysis/restrictions-this78-lifecycle.md`
- `analysis/restrictions-post-wrapper-output-consumption.md`
- `analysis/restrictions-local-builder-layout.md`
- `analysis/restrictions-builder-sink-finalization.md`
- `analysis/restrictions-builder-buffer-helpers.md`
- `analysis/restrictions-165dd40-branch-helpers.md`
- `analysis/restrictions-slot-relocations.md`
- `analysis/restrictions-slot-vtable.md`
- `analysis/restrictions-helper-semantics.md`
- `analysis/restrictions-constructor-dataflow.md`
- `analysis/restrictions-child18-semantics.md`
- `analysis/restrictions-factory-consumption.md`
- `analysis/restrictions-inline-vector-layout.md`
- `analysis/restrictions-provider-callsite-summary.md`
- `analysis/restrictions-readiness-objects.md`
- `analysis/readiness-registry-services.md`
- `analysis/readiness-concrete-service-vtables.md`
- `analysis/final-readiness-source-rsi.md`
- `analysis/final-readiness-dependency-methods.md`
- `analysis/final-readiness-carrier-inner.md`
- `analysis/final-readiness-secondary-1843bf8.md`
- `analysis/field428-install-proof.md`
- `docs/15-skip-ad-signal.md`
