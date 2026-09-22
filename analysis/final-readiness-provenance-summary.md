# Final Skip-Ad readiness provenance summary

Compact current state after resolving the Restrictions setup-bundle source, rejecting descriptor/builder false leads, proving the direct `this+0x18` writer, tracing the installed object, and tracing all currently open downstream/side branches through v7.

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

The `fd381a state+0x40` dependency remains best explained as a **RestrictionsSetupImpl-derived readiness source**, not TimelineAds owner `+0x50`, `0x18678f8`, or the old raw `0x6b0` interpretation.

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

```text
slot AP 0x187e2f8
  +0x30 -> 0x153d2a4
  +0x90 -> 0x165dd40
  +0x98 -> 0x153d0d0
```

`0x165dd40` and helper chains are descriptor/builder/buffer logic, not the final readiness object. Wrapper-local `builder+0x18` was rejected because it overlaps stack-local output/canary layout in the wrapper path.

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

Follow-up reads:

```text
10ac1e6  rax = [rsp+0x60]
10ac1eb  r13 = [rax]               ; r13 = this+0x18 = allocated_0x28

10ad136  rax = [rsp+0x60]
10ad13b  rbx = [rax]               ; rbx = this+0x18 = allocated_0x28
```

## Installed object AP `0x184d898`

Relocation-backed AP/method entries start as:

```text
0x184d898 +0x00 -> 10bff2c
0x184d898 +0x08 -> 10bff40
0x184d898 +0x10 -> 10bff52
0x184d898 +0x18 -> 10bffde
0x184d8c8        -> abfe12
0x184d8d0        -> abfe54
```

Known method semantics:

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
  => boolean/condition helper over installed payload, still needs semantic naming
```

## Payload at `allocated_0x28+0x08`: v7 result

`107162a` now classifies as a move/copy installer for the erased/shared payload stored at `allocated_0x28+0x08`:

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

So the direct `b411a4` return object is:

```text
child+0x18
  = allocated_0x28
  -> AP/literal 0x184d898
  -> erased/shared payload at +0x08
     -> installed by 107162a from stack_wrapper
     -> destructor/reset through 10bff2c -> de1c52(this+0x08)
```

## Late consumer: `0x198` object AP `0x184d5d0`

The constructor builds a `0x198` object with AP `0x184d5d0` and stores the installed `this+0x18` object into field `+0x60`:

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

v7 found real method-side `+0x60` consumers:

```text
0x184d720 +0x150 -> 10bb09e
  10bb0e5  r14 = [rdi+0x60]

0x184d728 +0x158 -> 10bb16e
  10bb186  rsi = [rdi+0x60]
```

These are the strongest confirmed downstream readers of the installed `child+0x18` object so far.

Other nearby `+0x60` hits such as `10baa40: call [rax+0x60]` are wrapper/delegation calls through another object's vtable, not direct reads of `0x198+0x60`.

## Side paths: v7 status

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
10ac4ec  call [constructor_arg_rdx.vtable+0x28]
10ac4ef  r14 = return
10ac4f7  operator new(0xd8)
10ac503  [wrapper_0xd8+0x00] = 0x184d9a8
10ac506  [wrapper_0xd8+0x08] = r14
10ac50f  [wrapper_0xd8+0x10] = allocated_0x150
10ac513  [wrapper_0xd8+0x18] = 0
```

These are still relevant side construction paths but not the direct `b411a4 -> child+0x18` value.

## `fd381a` bridge: v7 status

v7 captured the known `e99d07` / `fd4c04` / `fd381a` neighborhoods and confirms this branch remains separate from the constructor-local side paths. No direct contradiction to the Restrictions-derived interpretation was found.

Current confidence statement:

```text
Restrictions child+0x18 is fully resolved as AP 0x184d898 + erased/shared payload.
The 0x198/AP 0x184d5d0 object is the strongest confirmed downstream consumer and has direct method-side readers of +0x60.
The exact handoff from the Restrictions-derived consumer into fd381a state+0x40/+0x140 is still not fully closed.
```

## Closed items

```text
setup-bundle +0x30 source
factory-consumption path
slot AP relocation targets
0x165dd40 branch helpers
buffer/growth emit helpers
builder sink/refill abstraction
local output builder layout / builder+0x18 false lead
post-wrapper return-value consumption
child getter b411a4 = [rdi+0x18]
child AP 0x184da88 +0x38 = b411a4
[rsp+0x40] provenance as constructor arg rdx, then later stack-slot reuse
10ac7dd classified as this+0x40, not child+0x18
[rsp+0x60] classified as &this+0x18
this+0x18 direct writer at 10ac1a9
installed child+0x18 object AP 0x184d898
payload install into allocated_0x28+0x08 via 107162a
late 0x198/AP 0x184d5d0 consumer stores installed child+0x18 at +0x60
0x184d5d0 direct +0x60 readers at 10bb0e5 / 10bb186
side paths [rsp+0x70], [rsp+0x40], wrapper_0xd8 classified as non-direct getter paths
```

## Still open / next best targets

```text
Name semantics of 10bff52 / 10bffde:
  follow [this+0x20] provider in the installed AP 0x184d898 payload

Trace 0x184d5d0 +0x60 readers deeper:
  AP +0x150 -> 10bb09e -> 10bb0e5 reads [rdi+0x60]
  AP +0x158 -> 10bb16e -> 10bb186 reads [rdi+0x60]

Close bridge to fd381a:
  prove or reject whether 0x184d5d0 or AP 0x184d898 eventually feeds fd381a state+0x40 virtual +0x140
```

## Latest evidence reports

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
