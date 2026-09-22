# Final Skip-Ad readiness provenance summary

Compact current state after rejecting the old `0x6b0` and TimelineAds-wrapper interpretations, resolving the Restrictions setup-bundle source, classifying descriptor/builder false leads, tracing constructor-owned wrappers, and running the parallel v4 open-path trace for `[rsp+0x60]`, `[rsp+0x70]`, and `[rsp+0x40]`.

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

The final `state+0x40` dependency used by `fd381a` remains best explained as a **RestrictionsSetupImpl-derived readiness source**, not TimelineAds owner `+0x50`, `0x18678f8`, or the old raw `0x6b0` interpretation.

## Restrictions-derived source path

```text
registry ID 0x9e
  -> RestrictionsSetupImpl
  -> service AP 0x184ca90
  -> service +0x28 returns [this+0x10]
  -> child AP 0x184da88 / getter-side interface
  -> b411a4 returns [rdi+0x18]
```

`b411a4` itself is only a trivial getter:

```text
b411a4   mov rax, [rdi+0x18]
b411a8   ret
```

So the important question is the writer/source of the object field read through that `+0x18` getter path.

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

Factory call evidence:

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

Constructor `0x10aba36` starts by setting up the service object:

```text
10aba74  lea rax, 0x184ca90
10aba7b  [this+0x00] = 0x184ca90
10aba7e  [rsp+0x98] = this+0x10
10aba8a  [rsp+0x60] = this+0x18
10aba93  [rsp+0x18] = this+0x40
```

The parallel v4 trace clarified a major correction: the real direct readiness-slot candidate is `[rsp+0x60] = this+0x18`, not `[rsp+0x18]`.

### `this+0x18` / `[rsp+0x60]`: strongest current source

The `this+0x18` path is now directly traced:

```text
10ac12c  operator new(0x28)
10ac131  r14 = allocated_0x28
10ac149  operator new(0x30)
10ac159  a7a290(allocated_0x30, [rsp+0x10])
10ac187  [allocated_0x28+0x00] = 0x184d898
10ac194  107162a(allocated_0x28+0x08, stack_wrapper)
10ac19c  de1c52(stack_wrapper)
10ac1a1  rax = [rsp+0x60]          ; rax = &this+0x18
10ac1a6  rdi = [rax]               ; old this+0x18
10ac1a9  [rax] = r14               ; this+0x18 = allocated_0x28
10ac1b4  if old != null: call [old.vtable+0x8]
```

So the constructor installs the `0x28` object with AP/literal `0x184d898` into `this+0x18`. This is currently the strongest concrete writer for the getter-side `+0x18` readiness source.

The same slot is read again immediately:

```text
10ac1e6  rax = [rsp+0x60]
10ac1eb  r13 = [rax]               ; r13 = this+0x18 = allocated_0x28
```

and much later:

```text
10ad136  rax = [rsp+0x60]
10ad13b  rbx = [rax]               ; rbx = this+0x18
...
10ad15b  operator new(0x198)
10ad1a5  [rbp+0x00] = 0x184d5d0
10ad1bb  [rbp+0x18] = r12          ; r12 came from this+0x40, not this+0x18
```

`[rsp+0x60]` is only cleanup-read at the end:

```text
10adbde  rdi = [rsp+0x60]
10adbe3  call a79e28               ; cleanup helper on &this+0x18
```

## `this+0x40` / `[rsp+0x18]`: direct store, but not the getter slot

The v3 output-store trace followed this store:

```text
10ac7d5  rax = [rsp+0x18]
10ac7da  rdi = [rax]               ; old this+0x40
10ac7dd  [rax] = r14               ; this+0x40 = r14
10ac7e8  if old != null: call [old.vtable+0x8]
```

But `[rsp+0x18]` was proven to be `this+0x40`, not `this+0x18`:

```text
10aba93  lea rax, [rdi+0x40]
10aba97  [rsp+0x18] = rax
```

So `10ac7dd` is semantically useful for the broader object graph, but it is **not** the direct `b411a4`/`+0x18` field writer.

## Wrapper paths still connected to the constructor graph

The `vtable+0x28` calls on the saved constructor argument produce objects packed into `wrapper_0x80`:

```text
10aba54  [rsp+0x40] = rdx          ; constructor arg rdx
10ac372  call [[rsp+0x40].vtable+0x28]
10ac37d  r14 = first_return
10ac386  call [r15.vtable+0x28]
10ac389  r15 = second_return
10ac391  operator new(0x80)
10ac3a0  [wrapper_0x80+0x00] = 0x184d0a0
10ac3a3  [wrapper_0x80+0x08] = first_return
10ac3a7  [wrapper_0x80+0x10] = second_return
10ac3b0  [wrapper_0x80+0x18] = allocated_0x150
10ac454  [rsp+0x70] = wrapper_0x80
```

Fallback path:

```text
10ac47f  [rsp+0x70] = fallback_0x8 AP 0x184d1f0
```

`[rsp+0x70]` is later consumed but not as the direct `this+0x18` writer:

```text
10ad69b  rcx = [rsp+0x70]
10adb4f  rdi = [rsp+0x70]          ; cleanup/read
```

After the second `[rsp+0x40]` `vtable+0x28` call, the constructor also builds `wrapper_0xd8`:

```text
10ac4e4  rdi = [rsp+0x40]
10ac4ec  call [rdi.vtable+0x28]
10ac4ef  r14 = return_from_vtable28
10ac4f7  operator new(0xd8)
10ac503  [wrapper_0xd8+0x00] = 0x184d9a8
10ac506  [wrapper_0xd8+0x08] = r14_return
10ac50f  [wrapper_0xd8+0x10] = allocated_0x150
10ac513  [wrapper_0xd8+0x18] = 0
```

`wrapper_0xd8` is initialized through callback wrappers and appears to feed the broader persistent graph, but the direct `this+0x18` writer is already the earlier `allocated_0x28` store at `10ac1a9`.

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
ac39da / 10adc16 stack-wrapper behavior
first vtable+0x28 returns packed into wrapper_0x80 / AP 0x184d0a0
child/getter-side b411a4 classified as trivial [rdi+0x18] getter
[rsp+0x40] provenance as constructor argument rdx saved at entry
10ac7dd output store classified as this+0x40, not direct getter +0x18
[rsp+0x60] / this+0x18 writer resolved to allocated_0x28 AP 0x184d898 at 10ac1a9
```

## Still open / next best target

```text
allocated_0x28 / AP 0x184d898 methods and readers after installation into this+0x18
relation between service this+0x18 and the exact child AP 0x184da88 getter interface
late this+0x18 consumer at 10ad136 and the 0x198 object AP 0x184d5d0
late [rsp+0x70] read at 10ad69b
late [rsp+0x40] receivers at 10acd33 / 10acdad
whether wrapper_0xd8 / AP 0x184d9a8 feeds this+0x40 or later readiness state indirectly
```

## Evidence reports

- `analysis/restrictions-this18-rsp60-v4.md`
- `analysis/restrictions-rsp70-late-v4.md`
- `analysis/restrictions-rsp40-late-v4.md`
- `analysis/restrictions-output-store-10ac7dd.md`
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
