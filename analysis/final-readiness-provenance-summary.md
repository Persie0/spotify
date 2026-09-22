# Final Skip-Ad readiness provenance summary

This is the compact current state after rejecting the old `0x6b0` and TimelineAds-wrapper interpretations, resolving the Restrictions setup-bundle source, classifying the slot-object descriptor/builder path, rejecting the wrapper-local builder false leads, and tracing the constructor-owned `this+0x78` lifecycle.

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

The wrapper-local output layout rejects the `builder+0x18` sink as a semantic Restrictions object. In the wrapper call path, `builder+0x18` overlaps the stack canary or adjacent local outputs:

```text
15e768e out0 = rsp+0x38 -> out0+0x18 = rsp+0x50 = stack canary
15e75f2 out0 = rsp+0x18 -> out0+0x18 = rsp+0x30 = stack canary
```

## Post-wrapper constructor consumption

The post-wrapper trace shows the wrapper return values are not semantically consumed. The apparent `rax` uses after `15e768e` are just stack cleanup pops of extra pushed arguments:

```text
10abb9b  call 15e768e
10abba0  pop rax
10abba1  pop rcx
10abba2  mov rdi, r12
10abba5  call a7b5e8

10abc2e  call 15e768e
10abc33  pop rax
10abc34  pop rcx
10abc35  mov rdi, r12
10abc38  call a7b5e8
```

The same pattern repeats for all `15e768e` callsites. This means the `+0x90` wrapper calls are side-effect setup/fill calls followed by cleanup of local temporary output/string objects, not return-value-producing constructors.

## `this+0x78` lifecycle: current pivot

The batched lifecycle trace shows the constructor transitions into persistent object allocation after the final two `15e75f2` calls.

```text
10ac0f1  call 15e75f2
10ac120  call 15e75f2
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

The `allocated_0x28` object has two xrefs to AP/literal `0x184d898`:

```text
10ac180  lea rax, 0x184d898
10ac187  [allocated_0x28] = rax

10bff2c  lea rax, 0x184d898
10bff33  [rdi] = rax
10bff36  rdi += 0x8
10bff3a  jmp de1c52
```

`a7a290` is a small erased/shared-wrapper copy helper. It copies/clones the source object's `+0x20` payload into the destination object's `+0x20` slot, with a self-reference special case:

```text
a7a290  mov rbx, rdi
         mov rdi, [rsi+0x20]
         test rdi, rdi
         je   zero dest+0x20
         cmp  rdi, rsi
         je   self-reference path
         call [rdi.vtable+0x10]
         mov [rbx+0x20], rax
```

The `ac39da` / `10adc16` stack-wrapper pair is also classified:

```text
ac39da   mode 0: destroy/free [rsi]
         mode 1: copy [rdx] -> [rsi]
         other: no-op

10adc16  reads [rsi], then [that+0x20], calls aad0ba, returns rdi
```

After `allocated_0x28` is installed through the `this+0x78` slot, the constructor builds more inner objects:

```text
10ac1ba  operator new(0x58)
10ac1c6  [allocated_0x58+0x00] = 0x187e260
10ac1cb  [allocated_0x58+0x08] = 0
10ac1cf  [allocated_0x58+0x38] = 0
10ac1d3  [allocated_0x58+0x40] = 0
10ac1e2  zero [allocated_0x58+0x48..0x57]

10ac249  operator new(0x150)
10ac255  [allocated_0x150+0x00] = 0x184d808
10ac262..10ac27e  zero [allocated_0x150+0x08..0x87]
10ac289  [allocated_0x150+0x90] = 0x180e8e0
10ac297  [allocated_0x150+0x98] = system_clock::now entry
10ac29e  [allocated_0x150+0xb0] = allocated_0x150+0x90
10ac2b6  [allocated_0x150+0xc0] = 0x180e8e0
10ac2c4  [allocated_0x150+0xc8] = steady_clock::now entry
10ac2cb  [allocated_0x150+0xe0] = allocated_0x150+0xc0
10ac2ee  [allocated_0x150+0x130] = r13
10ac2fd  [allocated_0x150+0x138] = rcx
10ac309  [allocated_0x150+0x140] = 0
```

Important caution: the relocation table did not expose function entries at `0x184d898` in this run. The report therefore treats `0x184d898` primarily as the AP/literal written into the `0x28` object and follows its xrefs/constructors rather than claiming resolved virtual entries from relocation data.

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
post-wrapper return-value consumption / wrapper outputs as return values
this+0x78 allocation sequence through allocated_0x28 install
ac39da / 10adc16 stack-wrapper behavior
```

Still open:

```text
allocated_0x28 at this+0x78
  -> readers / AP methods / callsites after construction
  -> relation to object exposed as child+0x18
  -> inner virtual +0x30 / state+0x40 readiness discriminator
```

The next concrete target is to trace **readers of the installed `this+0x78` pointer** and the `0x184d898` object lifecycle after construction. The most useful next batch should include:

```text
10bff2c / 10bff40 constructor-like helpers for AP 0x184d898
107162a and de1c52 handling of the stack wrapper into allocated_0x28+0x08
readers of this+0x78 after 0x10aba36
virtual calls on allocated_0x28, especially calls through [object.vtable+0x28]
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
- `docs/15-skip-ad-signal.md`
