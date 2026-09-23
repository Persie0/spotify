# Final Skip-Ad readiness provenance summary

Compact current state after resolving the Restrictions setup-bundle source, rejecting descriptor/builder false leads, proving the direct `this+0x18` writer, tracing the installed object and downstream consumers, and narrowing the remaining erased-interface bridge through v12. Static provenance documentation only; no runtime patching or bypass behavior.

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

The `fd381a state+0x40` dependency remains best explained as a RestrictionsSetupImpl-derived readiness source. Direct AP identity for `0x184d898` / `0x184d5d0` still does not appear in the `fd381a` window; the active remaining bridge is through erased interfaces and temporary stack output.

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

Child AP evidence:

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

Descriptor/builder paths (`0x165dd40`, buffer helpers, local builder sinks) are closed as false leads.

## Direct `child+0x18` writer: resolved

```text
10aba8a  lea rax, [rdi+0x18]
10aba8e  [rsp+0x60] = rax          ; &this+0x18

10ac12c  operator new(0x28)
10ac131  r14 = allocated_0x28
10ac180  lea rax, 0x184d898
10ac187  [allocated_0x28+0x00] = 0x184d898
10ac194  107162a(allocated_0x28+0x08, stack_wrapper)

10ac1a1  rax = [rsp+0x60]
10ac1a9  [rax] = r14               ; this+0x18 = allocated_0x28
```

Follow-up reads confirm the same installed pointer:

```text
10ac1e6  rax = [rsp+0x60]
10ac1eb  r13 = [rax]

10ad136  rax = [rsp+0x60]
10ad13b  rbx = [rax]
```

## Installed object AP `0x184d898`

```text
0x184d898 +0x00 -> 10bff2c
0x184d898 +0x08 -> 10bff40
0x184d898 +0x10 -> 10bff52
0x184d898 +0x18 -> 10bffde
```

Known semantics:

```text
10bff2c:
  reset/destruct payload at +0x08 through de1c52(this+0x08)

10bff40:
  deleting destructor wrapper

10bff52:
  forwarding/string helper over installed payload

10bffde:
  condition/update helper over installed payload
  success:
    [this+0x10] = [rsp+0x30]
    [this+0x00..0x0f] = [rsp+0x20..0x2f]
    [this+0x18] = 1
  failure:
    [this+0x00] = 0
    [this+0x18] = 0
```

`107162a` installs the erased/shared payload into `allocated_0x28+0x08`:

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

For this constructor:

```text
dst = allocated_0x28+0x08
src = stack_wrapper at rsp+0x110

stack_wrapper:
  +0x00 = allocated_0x30
  +0x10 = ac39da
  +0x18 = 10adc16
```

## Late consumer: `0x198` object AP `0x184d5d0`

The constructor builds a `0x198` object and stores the installed child object into field `+0x60`:

```text
10ad136  rax = [rsp+0x60]
10ad13b  rbx = [rax]               ; installed child+0x18 / AP 0x184d898
10ad156  operator new(0x198)
10ad19e  [rbp+0x00] = 0x184d5d0
10ad217  [rbp+0x60] = rbx
```

Confirmed method-side `+0x60` consumers:

```text
0x184d720 +0x150 -> 10bb09e
  reads [this+0x50], [this+0x54], [this+0x60]
  calls installed AP 0x184d898 +0x10 -> 10bff52

0x184d728 +0x158 -> 10bb16e
  reads [this+0x60]
  calls installed AP 0x184d898 +0x18 -> 10bffde
  if returned stack payload is present and passes 177f852:
    [this+0x50] = clamped result code <= 5
    [this+0x54] = result flag byte
```

## Erased `e99c96/e99ca7` bridge: v12 status

Local bridge shape:

```text
e99c72  r14 = rsp+0x8
e99c77  rdi = r14
e99c7a  rsi = original object
e99c7d  aab330(&stack_slot, original)

e99c82  rsi = [r14]                ; provider/source copied by aab330
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

v12 resolved `aab330` itself as a weak/shared-owner lock plus pointer copier, not as a direct new provider factory:

```text
aab330(dest, original):
  rbx = dest
  [dest+0x00..0x0f] = 0
  rdi = [original+0x08]
  if rdi != 0:
    rax = shared_weak_count::lock(rdi)
    [dest+0x08] = rax
    if rax != 0:
      [dest+0x00] = [original]
```

Therefore in `e99c54`:

```text
[rsp+0x08] = [original]       ; provider/source pointer
[rsp+0x10] = strong lifetime  ; lock result / lifetime guard
```

So the concrete provider for `e99c96` is the object pointer already stored at `[original]`, kept alive by `[original+0x8]`, not an AP literal created by `aab330`.

`ea785e` is closed as cleanup/destructor:

```text
ea785e:
  e0c8c6(stack_output + 0xa8)
  aad132(stack_output + 0x70)
```

## Near-e99 candidate AP group

v12 kept the near-e99 AP candidates as a candidate set, but did not yet bind one to the actual `[original]` object at runtime:

```text
AP 0x1831968:
  +0x10 -> ea6568
  +0x78 -> e992a2

AP 0x1831980:
  +0x10 -> ea657c
  +0x78 -> e99368

AP 0x18319e0:
  +0x10 -> e992c8
  +0x78 -> e9929a

AP 0x1831938:
  +0x10 -> ea662e
  +0x78 -> e9939c

AP 0x188bd68:
  +0x10 -> 160c142
  +0x78 -> e99382

AP 0x1831a00:
  +0x10 -> e99382
  +0x78 -> eaaf5c

AP 0x1831a48:
  +0x10 -> e9929a
  +0x78 -> eabb76
```

Important limitation:

```text
The candidate table narrows plausible erased-interface APs.
It does not prove which one is `[original]` in e99c54.
The next target must trace construction/assignment of the `original` object passed to e99c54, not scan for AP literals in fd381a.
```

## Side paths

```text
[rsp+0x40]
  initially constructor arg rdx
  used as vtable+0x28 receiver at 10ac372 / 10ac4e4 / 10acd33 / 10acdad
  later reused as local byte/vector storage

[rsp+0x70]
  wrapper_0x80 / AP 0x184d0a0 or fallback AP 0x184d1f0 holder

wrapper_0xd8 / AP 0x184d9a8
  relevant construction branch, but not direct b411a4 -> child+0x18 getter value
```

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
aab330 behavior: copies [original] into provider slot after locking [original+0x8]
```

## Still open / next best targets

```text
Trace construction/assignment of the original object passed to e99c54
Resolve which concrete AP is stored at [original]
Resolve [original+0x10] consumer construction/assignment
Then bind provider +0x78 and consumer +0x10 concretely
Tie the erased e99c96/e99ca7 stack output to fd4c04/fd381a state+0x40 without relying on AP literals
```

## Evidence reports

- `analysis/restrictions-aab330-internals-v12.md`
- `analysis/restrictions-near-e99-ap-candidates-v12.md`
- `analysis/restrictions-original-plus10-consumer-v12.md`
- `analysis/restrictions-aab330-provider-v11.md`
- `analysis/restrictions-plus78-plus10-candidates-v11.md`
- `analysis/restrictions-original-consumer-owner-v11.md`
- `analysis/restrictions-source-plus78-v10.md`
- `analysis/restrictions-consumer-plus10-v10.md`
- `analysis/restrictions-ea785e-output-v10.md`
- `analysis/restrictions-condition-propagation-v9.md`
- `analysis/restrictions-184d5d0-callers-v9.md`
- `analysis/restrictions-fd381a-state-bridge-v9.md`
- `analysis/restrictions-installed-method-semantics-v8.md`
- `analysis/restrictions-184d5d0-reader-flows-v8.md`
- `analysis/restrictions-fd381a-bridge-deeper-v8.md`
- `analysis/restrictions-payload-107162a-v7.md`
- `analysis/restrictions-ap184d5d0-60-readers-v7.md`
- `analysis/restrictions-fd381a-bridge-v7.md`
- `analysis/restrictions-side-paths-v7.md`
- `analysis/restrictions-ap184d898-methods-v6.md`
- `analysis/restrictions-ap184d5d0-methods-v6.md`
- `analysis/restrictions-this18-to-0x198-bridge-v6.md`
- `analysis/restrictions-installed-ap184d898-v5.md`
- `analysis/restrictions-child184da88-v5.md`
- `analysis/restrictions-late-0x198-184d5d0-v5.md`
- `analysis/restrictions-this18-rsp60-v4.md`
- `analysis/restrictions-rsp70-late-v4.md`
- `analysis/restrictions-rsp40-late-v4.md`
