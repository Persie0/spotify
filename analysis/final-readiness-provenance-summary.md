# Final Skip-Ad readiness provenance summary

Compact current state after resolving the Restrictions setup-bundle source, rejecting descriptor/builder false leads, proving the direct `this+0x18` writer, and tracing the installed object plus late downstream consumer.

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
e99d07
      v
fd4c04
      v
Skip-Ad adapter outer+0x58 / this+0x40
      v
fd381a state+0x40 virtual +0x140 readiness/mode discriminator
```

The final `state+0x40` dependency used by `fd381a` remains best explained as a **RestrictionsSetupImpl-derived readiness source**, not TimelineAds owner `+0x50`, `0x18678f8`, or the old raw `0x6b0` interpretation.

## Restrictions service / child getter path

```text
registry ID 0x9e
  -> RestrictionsSetupImpl
  -> service AP 0x184ca90
  -> service +0x28 returns [this+0x10]
  -> child AP 0x184da88 installed at service+0x10
  -> child +0x38 = b411a4
  -> b411a4 returns [child+0x18]
```

Getter:

```text
b411a4   mov rax, [rdi+0x18]
b411a8   ret
```

Relocation-backed child AP evidence:

```text
child AP 0x184da88
  +0x00 -> 10c09c6
  +0x08 -> 10c0a66
  +0x38 -> b411a4
```

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

Factory call:

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

## Descriptor/builder false leads: closed

The slot AP is relocation-filled and resolves to:

```text
slot AP 0x187e2f8
  +0x30 -> 0x153d2a4
  +0x90 -> 0x165dd40
  +0x98 -> 0x153d0d0
```

`0x165dd40` and its helper chain are descriptor/builder/buffer logic, not the final readiness object. Wrapper-local `builder+0x18` was rejected because it overlaps stack-local output/canary layout in the wrapper path.

## Direct `child+0x18` writer: resolved

The true direct writer is `[rsp+0x60] = this+0x18` followed by `10ac1a9`:

```text
10aba8a  lea rax, [rdi+0x18]
10aba8e  [rsp+0x60] = rax          ; &this+0x18

10ac12c  operator new(0x28)
10ac131  r14 = allocated_0x28
10ac180  lea rax, 0x184d898
10ac187  [allocated_0x28+0x00] = 0x184d898
10ac194  107162a(allocated_0x28+0x08, stack_wrapper)

10ac1a1  rax = [rsp+0x60]          ; &this+0x18
10ac1a6  rdi = [rax]               ; old this+0x18
10ac1a9  [rax] = r14               ; this+0x18 = allocated_0x28
10ac1b4  if old != null: call [old.vtable+0x8]
```

Immediate follow-up read confirms the installed object is reused:

```text
10ac1e6  rax = [rsp+0x60]
10ac1eb  r13 = [rax]               ; r13 = this+0x18 = allocated_0x28
```

Late read confirms the same field is consumed again:

```text
10ad136  rax = [rsp+0x60]
10ad13b  rbx = [rax]               ; rbx = this+0x18
```

## Installed object AP `0x184d898`: v6 status

Relocation-backed AP/method entries start as:

```text
0x184d898 +0x00 -> 10bff2c
0x184d898 +0x08 -> 10bff40
0x184d898 +0x10 -> 10bff52
0x184d898 +0x18 -> 10bffde
0x184d8c8        -> abfe12
0x184d8d0        -> abfe54
```

Method semantics currently known:

```text
10bff2c:
  [this+0x00] = 0x184d898
  de1c52(this+0x08)
  => reset/destruct payload at +0x08

10bff40:
  calls 10bff2c(this)
  operator delete(this)
  => deleting destructor wrapper

10bff52:
  delegates through object field [this+0x20]
  uses this+0x08 as payload input
  transforms external rdx via a7b836 and 17c4ef2
  => payload/string-style forwarding helper, not direct readiness verdict yet

10bffde:
  delegates through object field [this+0x20]
  then calls 17c4edc and tests result
  => boolean/condition helper over the installed payload, still needs semantic naming
```

The current direct `b411a4` return object is therefore:

```text
child+0x18
  = allocated_0x28
  -> AP/literal 0x184d898
  -> erased/shared payload at +0x08 initialized via 107162a from stack_wrapper
  -> payload helper/function field around +0x20 used by 10bff52/10bffde
```

## Late consumer: `0x198` object AP `0x184d5d0`

After `this+0x18` is read into `rbx`, the constructor builds a `0x198` object with AP `0x184d5d0` and stores the installed object into field `+0x60`:

```text
10ad136  rax = [rsp+0x60]
10ad13b  rbx = [rax]               ; rbx = this+0x18 = allocated_0x28 / AP 0x184d898
10ad156  operator new(0x198)
10ad160  rbp = allocated_0x198
10ad19e  lea rax, 0x184d5d0
10ad1a5  [rbp+0x00] = 0x184d5d0
...
10ad217  [rbp+0x60] = rbx          ; captures installed this+0x18
```

Relocation-backed AP `0x184d5d0` starts as:

```text
0x184d5d0 +0x00 -> a3fa60
0x184d5d8 +0x08 -> 10ba7ca
0x184d5e0 +0x10 -> 10ba802
0x184d5e8 +0x18 -> 10ba86e
0x184d5f0 +0x20 -> 10ba802
0x184d5f8 +0x28 -> 10ba8a6
0x184d600 +0x30 -> 10ba8de
0x184d608 +0x38 -> 10ba93e
...
0x184d738        -> 10bc22a
0x184d740        -> 10bc6aa
0x184d748        -> 10bc716
```

Early AP `0x184d5d0` method pattern:

```text
10ba802:
  writes status 2 to output
  checks [this+0x50]
  dispatches [this.vtable+0x1a0] / [this.vtable+0x1a8]
  calls helpers through fields +0x08/+0x10/+0x30

10ba86e / 10ba8a6 / 10ba98e / 10baa26:
  stack status wrappers that dispatch to sibling vtable offsets

10ba976 / 10ba9c6:
  similar condition/status helpers gated by [this+0x50]
```

So `0x184d5d0` is a large composite interface around the captured installed object, but v6 did **not yet prove** which AP method first reads `this+0x60` semantically. The trace only proves the capture at `+0x60`.

## Wrapper/side paths still relevant but not direct getter value

First `vtable+0x28` returns are packed into wrapper_0x80:

```text
10ac37a  call [rax+0x28]
10ac37d  r14 = first_return
10ac386  call [rax+0x28]
10ac389  r15 = second_return
10ac391  operator new(0x80)
10ac3a0  [wrapper_0x80+0x00] = 0x184d0a0
10ac3a3  [wrapper_0x80+0x08] = first_return
10ac3a7  [wrapper_0x80+0x10] = second_return
10ac3b0  [wrapper_0x80+0x18] = allocated_0x150
```

`wrapper_0x80` is stored in `[rsp+0x70]` or replaced by fallback_0x8, then read later at `10ad69b`; this is not the direct `this+0x18` writer.

A later `0xd8` wrapper is also built:

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

## `10ac7dd` correction

The direct output-store at `10ac7dd` writes `this+0x40`, not `this+0x18`:

```text
10aba93  lea rax, [rdi+0x40]
10aba97  [rsp+0x18] = rax          ; this+0x40

10ac7d5  mov rax, [rsp+0x18]
10ac7dd  mov [rax], r14            ; this+0x40 = r14
```

It remains semantically useful for the broader object graph, but not for `b411a4`'s direct `+0x18` getter value.

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
child getter b411a4 classified as trivial [rdi+0x18] getter
child AP 0x184da88 +0x38 = b411a4
[rsp+0x40] provenance as constructor arg rdx saved at entry
10ac7dd classified as this+0x40, not child+0x18
[rsp+0x60] classified as &this+0x18
this+0x18 direct writer at 10ac1a9
installed this+0x18 object AP 0x184d898
AP 0x184d898 initial methods identified
late 0x198/AP 0x184d5d0 consumer captures installed this+0x18 at +0x60
```

## Still open / next best targets

```text
1. Resolve payload at allocated_0x28+0x08:
   - 107162a installation result
   - object field/function at +0x20 used by 10bff52/10bffde

2. Trace AP 0x184d5d0 methods that read [this+0x60]:
   - current v6 proves capture at +0x60
   - still need the semantic consumer method of that captured installed object

3. Trace whether 0x184d5d0 connects to fd381a state+0x40 / +0x140:
   - this is the remaining bridge from Restrictions child+0x18 to Skip-Ad readiness discriminator

Known side paths:
  [rsp+0x70] wrapper_0x80/fallback holder
  [rsp+0x40] constructor arg rdx vtable+0x28 receivers
  wrapper_0xd8 / AP 0x184d9a8
```

## Evidence reports

- `analysis/restrictions-ap184d898-methods-v6.md`
- `analysis/restrictions-ap184d5d0-methods-v6.md`
- `analysis/restrictions-this18-to-0x198-bridge-v6.md`
- `analysis/restrictions-installed-ap184d898-v5.md`
- `analysis/restrictions-child184da88-v5.md`
- `analysis/restrictions-late-0x198-184d5d0-v5.md`
- `analysis/restrictions-this18-rsp60-v4.md`
- `analysis/restrictions-rsp70-late-v4.md`
- `analysis/restrictions-rsp40-late-v4.md`
- `analysis/restrictions-output-store-10ac7dd.md`
- `analysis/restrictions-tail-after-wrapperd8-v2.md`
- `analysis/restrictions-frame-provenance-v2.md`
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
