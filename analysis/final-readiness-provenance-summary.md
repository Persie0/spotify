# Final Skip-Ad readiness provenance summary

Compact current state after resolving the Restrictions setup-bundle source, rejecting descriptor/builder false leads, proving the direct `this+0x18` writer, tracing the installed object, following downstream consumers, and narrowing the remaining erased-interface bridge through v11. Static provenance documentation only; no runtime patching or bypass behavior.

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

The `fd381a state+0x40` dependency remains best explained as a RestrictionsSetupImpl-derived readiness source, not TimelineAds owner `+0x50`, `0x18678f8`, or the old raw `0x6b0` interpretation. The direct AP identity does not appear in the `fd381a` window; the remaining gap is through erased interfaces and temporary stack output.

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

## Setup-bundle source: closed

`bundle+0x30` is the first element of inline vector storage for the vector subobject at `bundle+0x18`.

```text
provider-vector caller
  -> constructs setup bundle at rsp+0x2e0
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

Descriptor/builder/buffer false leads are closed. `0x165dd40` and helpers are descriptor/builder/buffer logic, not the final readiness object.

## Direct `child+0x18` writer: resolved

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

Follow-up reads:

```text
10ac1e6  rax = [rsp+0x60]
10ac1eb  r13 = [rax]               ; r13 = this+0x18 = allocated_0x28

10ad136  rax = [rsp+0x60]
10ad13b  rbx = [rax]               ; rbx = this+0x18 = allocated_0x28
```

## Installed object AP `0x184d898`

```text
0x184d898 +0x00 -> 10bff2c
0x184d898 +0x08 -> 10bff40
0x184d898 +0x10 -> 10bff52
0x184d898 +0x18 -> 10bffde
```

Known method semantics:

```text
10bff2c:
  reset/destruct payload at this+0x08

10bff40:
  deleting destructor wrapper

10bff52:
  calls virtual [this.vtable+0x20] with rsi=this+0x08 payload
  transforms external rdx via a7b836 and 17c4ef2
  => forwarding/string helper over installed payload

10bffde:
  calls virtual [input.vtable+0x20] with rsi=input+0x08 payload
  calls 17c4edc(temp, out, 0), tests boolean result
  if true:
    [this+0x10] = [rsp+0x30]
    [this+0x00..0x0f] = [rsp+0x20..0x2f]
    [this+0x18] = 1
  if false:
    [this+0x00] = 0
    [this+0x18] = 0
  returns this
  => condition/update helper over installed payload
```

Payload install:

```text
107162a(dst, src):
  [dst+0x00] = 0
  [dst+0x10] = 0
  rax = [src+0x10]
  if rax != 0:
    [dst+0x10] = rax
    call rax(1, dst, src)
    [dst+0x18] = [src+0x18]
    [src+0x10] = 0
```

For the constructor call:

```text
dst = allocated_0x28+0x08
src = stack_wrapper at rsp+0x110

stack_wrapper:
  +0x00 = allocated_0x30 copied from earlier [rsp+0x10]
  +0x10 = ac39da
  +0x18 = 10adc16
```

## Late consumer: `0x198` object AP `0x184d5d0`

```text
10ad136  rax = [rsp+0x60]
10ad13b  rbx = [rax]               ; rbx = this+0x18 = allocated_0x28 / AP 0x184d898
10ad156  operator new(0x198)
10ad160  rbp = allocated_0x198
10ad19e  lea rax, 0x184d5d0
10ad1a5  [rbp+0x00] = 0x184d5d0
10ad217  [rbp+0x60] = rbx          ; captures installed this+0x18
```

Confirmed method-side `+0x60` consumers:

```text
0x184d720 +0x150 -> 10bb09e
  reads [this+0x50] and [this+0x54]
  r14 = [this+0x60]
  calls installed AP 0x184d898 method +0x10 (10bff52)

0x184d728 +0x158 -> 10bb16e
  rsi = [this+0x60]
  calls installed AP 0x184d898 method +0x18 (10bffde)
  if returned stack payload is present and passes 177f852:
    [this+0x50] = clamped result code <= 5
    [this+0x54] = result flag byte
```

This closes the key downstream link:

```text
0x184d5d0 object
  +0x60 = installed child+0x18 object / AP 0x184d898
  methods +0x150/+0x158 call that installed object via +0x10/+0x18
  +0x158 refreshes cached fields +0x50/+0x54 from the installed-object result
  +0x150 reads those cached fields and calls installed object +0x10
```

## Erased `e99c96/e99ca7` bridge: v11 status

Current local bridge shape:

```text
e99c72  r14 = rsp+0x8
e99c77  rdi = r14
e99c7a  rsi = original object
e99c7d  aab330(&stack_slot, original)

e99c82  rsi = [r14]                ; provider/source produced by aab330
e99c8e  rax = [rsi]
e99c91  rdi = rsp+0x18             ; stack output
e99c96  call [rax+0x78]            ; provider-side virtual fills stack output

e99c8a  rbx = [original+0x10]      ; consumer
e99c99  rax = [rbx]
e99ca1  rdi = rbx
e99ca4  rsi = rsp+0x18             ; same stack output
e99ca7  call [rax+0x10]            ; consumer-side virtual consumes stack output

e99cad  ea785e(rsp+0x18)           ; stack-output cleanup/destructor
```

`ea785e` is cleanup, not the producer:

```text
ea785e:
  e0c8c6(rdi + 0xa8)
  aad132(rdi + 0x70)
```

v11 did **not** close the erased bridge, but it narrowed the candidate space:

```text
likely provider/bridge AP candidate group includes near-e99 tables:
  0x1831968 +0x78 -> 0xe992a2
  0x1831980 +0x78 -> 0xe99368
  0x18319e0 +0x78 -> 0xe9929a
  0x1831938 +0x78 -> 0xe9939c
  0x188bd68 +0x78 -> 0xe99382
```

The same candidate table still shows many unrelated `+0x78` entries around Restrictions AP tables. Therefore the bridge should not be treated as resolved by AP-literal matching alone. The next useful step is dataflow through `aab330`, not another broad relocation scan.

## Side paths

`[rsp+0x40]`:

```text
initially constructor arg rdx
used as vtable+0x28 receiver at:
  10ac372
  10ac4e4
  10acd33
  10acdad
later reused as local byte/vector storage around 10acf8d and 10ad163+
```

`[rsp+0x70]`:

```text
10ac454  [rsp+0x70] = wrapper_0x80 / AP 0x184d0a0
10ac47f  fallback [rsp+0x70] = fallback_0x8 / AP 0x184d1f0
10ad69b  late read
10adb4f  cleanup/read
```

`wrapper_0xd8 / AP 0x184d9a8`:

```text
10ac4f7  operator new(0xd8)
10ac503  [wrapper_0xd8+0x00] = 0x184d9a8
10ac506  [wrapper_0xd8+0x08] = r14_return
10ac50f  [wrapper_0xd8+0x10] = allocated_0x150
10ac513  [wrapper_0xd8+0x18] = 0
```

These remain relevant to construction, but not the direct `b411a4 -> child+0x18` getter value.

## Closed items

```text
setup-bundle +0x30 source
factory-consumption path
slot AP relocation targets
descriptor/builder/buffer false leads
child getter b411a4 = trivial [rdi+0x18] getter
child AP 0x184da88 +0x38 = b411a4
[rsp+0x60] = &this+0x18
this+0x18 direct writer at 10ac1a9
installed child+0x18 object AP 0x184d898
107162a payload installer into allocated_0x28+0x08
10bff52 forwarding/helper method
10bffde condition/update method
late 0x198/AP 0x184d5d0 consumer stores installed object at +0x60
0x184d5d0 +0x150/+0x158 read +0x60 and dispatch to installed object +0x10/+0x18
0x184d5d0 +0x158 refreshes cache fields +0x50/+0x54 from installed-object result
ea785e stack-output cleanup/destructor path
```

## Still open / next best targets

```text
Trace aab330 internals and stores to [rsp+0x8] / provider slot
Resolve which near-e99 AP candidate is actually returned by aab330
Resolve concrete consumer object [original+0x10]
Resolve concrete consumer virtual +0x10 target for e99ca7
Tie the erased e99c96/e99ca7 stack output to fd4c04/fd381a state+0x40 without relying on AP literals
```

## Evidence reports

- `analysis/restrictions-aab330-provider-v11.md`
- `analysis/restrictions-plus78-plus10-candidates-v11.md`
- `analysis/restrictions-original-consumer-owner-v11.md`
- `analysis/restrictions-source-plus78-v10.md`
- `analysis/restrictions-consumer-plus10-v10.md`
- `analysis/restrictions-ea785e-output-v10.md`
- `analysis/restrictions-condition-propagation-v9.md`
- `analysis/restrictions-184d5d0-callers-v9.md`
- `analysis/restrictions-fd381a-state-bridge-v9.md`
- older v4-v8 reports remain available in `analysis/`.
