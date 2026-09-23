# Final Skip-Ad readiness provenance summary

Compact current state after resolving the Restrictions setup-bundle source, proving the direct `child+0x18` writer, tracing the installed object and downstream consumers, classifying callback packaging, and correcting the receiver-pair lifecycle through v18. Static provenance documentation only; no runtime patching or bypass behavior.

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

The `fd381a state+0x40` dependency remains best explained as a RestrictionsSetupImpl-derived readiness source. Direct AP identity for `0x184d898` / `0x184d5d0` still does not appear in the `fd381a` window; the remaining bridge is through erased interfaces, callback packages, and receiver-pair stack objects.

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

## Direct `child+0x18` writer

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

Direct getter return object:

```text
child+0x18
  = allocated_0x28
  -> AP 0x184d898
  -> erased/shared payload at +0x08
     -> installed by 107162a from stack_wrapper
```

## Installed object AP `0x184d898`

Relocation-backed entries:

```text
0x184d898 +0x00 -> 10bff2c
0x184d898 +0x08 -> 10bff40
0x184d898 +0x10 -> 10bff52
0x184d898 +0x18 -> 10bffde
```

Known method semantics:

```text
10bff2c = reset/destruct payload at +0x08
10bff40 = deleting destructor wrapper
10bff52 = forwarding/string helper over installed payload
10bffde = condition/update helper:
  success:
    [this+0x10] = [rsp+0x30]
    [this+0x00..0x0f] = [rsp+0x20..0x2f]
    [this+0x18] = 1
  failure:
    [this+0x00] = 0
    [this+0x18] = 0
```

## Late consumer: `0x198` object AP `0x184d5d0`

```text
10ad136  rax = [rsp+0x60]
10ad13b  rbx = [rax]               ; rbx = this+0x18 / AP 0x184d898
10ad156  operator new(0x198)
10ad19e  [rbp+0x00] = 0x184d5d0
10ad217  [rbp+0x60] = rbx          ; captures installed object
```

Confirmed method-side consumers:

```text
0x184d5d0 +0x150 -> 10bb09e
  reads [this+0x50], [this+0x54], [this+0x60]
  calls installed AP 0x184d898 +0x10 = 10bff52

0x184d5d0 +0x158 -> 10bb16e
  reads [this+0x60]
  calls installed AP 0x184d898 +0x18 = 10bffde
  updates [this+0x50] and [this+0x54] from the returned result
```

This closes the key downstream link from the getter value into the `0x198` object.

## Erased bridge around `e99c54`

Bridge body:

```text
e99c7d  aab330(&stack_slot, original)
e99c82  rsi = [rsp+0x08]           ; provider/source copied from [original]
e99c8a  rbx = [original+0x10]      ; consumer
e99c96  call [provider.vtable+0x78]
e99ca7  call [consumer.vtable+0x10]
e99cad  ea785e(rsp+0x18)           ; stack-output cleanup/destructor
```

`aab330` is a weak/shared-owner lock + pointer copier:

```text
aab330(dest, original):
  [dest+0x00..0x0f] = 0
  rdi = [original+0x08]
  if rdi != 0:
    rax = shared_weak_count::lock(rdi)
    [dest+0x08] = rax
    if rax != 0:
      [dest+0x00] = [original]
```

So the bridge source is not hidden inside `aab330`; it is the concrete object stored at `[original]`.

## Callback package result through v14

`e99c54` has no direct relocation/AP entry. It is materialized as a callback/code pointer and packaged by `17da794`:

```text
e950cb  rsi = dfa052
e950d2  rdx = dfa086
e950d9  rcx = e99c54
e950e0  rbx = rsp+0xbe0
e950e8  r9  = 0x20
e950ec  rdi = rbx
e950ef  call 17da794
```

Concrete package layout:

```text
17da794(pkg, fn_copy, fn_delete, callback, payload, size):
  [pkg+0x18] = fn_copy       ; dfa052 at e950ef
  [pkg+0x20] = fn_delete     ; dfa086 at e950ef
  [pkg+0x28] = callback      ; e99c54 at e950ef
  [pkg+0x30] = allocated buffer
  [pkg+0x38] = size          ; 0x20 at e950ef
  call [pkg+0x18]([pkg+0x30], payload, size)
```

Destructor/cleanup:

```text
17da802(pkg):
  buf = [pkg+0x30]
  if buf != 0:
    if [pkg+0x20] != 0:
      call [pkg+0x20](buf)
    [pkg+0x30] = 0
    delete[] buf
```

## Corrected receiver-pair lifecycle through v18

v16 initially localized the receiver near `[r13+0x410].vtable+0x28`, but v17/v18 corrected the producer. The receiver pair is initialized at function entry from `owner+0x480`:

```text
e92f4d  r13 = rsi                       ; owner/context object
e92f64  rsi = [r13+0x480]
e92f6b  rdi = &rsp+0x390
e92f73  af2eb8(&rsp+0x390, [r13+0x480])
```

`af2eb8` is a shared-pointer-style copy helper, copying pointer/control fields from the source pair to the destination and incrementing control-block refcounts:

```text
af2eb8:
  [dst+0x00] = [src+0x00]
  [dst+0x08] = [src+0x08]
  if [dst+0x08] != 0:
    lock inc [control+0x08]
  [dst+0x10] = [src+0x10]
  [dst+0x18] = [src+0x18]
  ... additional pair/subobject copy paths continue in the helper
```

The same receiver pair is then loaded and reused for the callback packages:

```text
e930dd  r14 = [rsp+0x390]
e930e5  rax = [rsp+0x398]

e9313a  rcx = e9940c
e93150  call 17da794
e93166  call [r14.vtable+0xa0]

e931cb  rcx = e9959c
e931e4  call 17da794
e931f5  call [r14.vtable+0xa8]

e950d9  rcx = e99c54
e950ef  call 17da794
e95105  call [r14.vtable+0xa0]
```

Corrected interpretation:

```text
[rsp+0x390]/[rsp+0x398] receiver pair source:
  owner+0x480 via af2eb8 copy helper

[r13+0x410].vtable+0x28:
  still important because it runs immediately before the receiver pair is loaded,
  but it is no longer proven to be the primary producer of [rsp+0x390]/[rsp+0x398].
  Treat it as a pre-use gate/update/side-effect until a direct write-back is proven.
```

## AP candidates retained

Near-`e99`/`e95` candidate group:

```text
0x1831968: +0x10 -> ea6568, +0x78 -> e992a2, +0xa0 -> ad647a
0x1831980: +0x10 -> ea657c, +0x78 -> e99368
0x18319e0: +0x10 -> e992c8, +0x78 -> e9929a, +0xa0 -> eaaf6e
0x1831938: +0x10 -> ea662e, +0x78 -> e9939c
0x188bd68: +0x10 -> 160c142, +0x78 -> e99382
0x1831a00: +0x10 -> e99382, +0x78 -> eaaf5c
0x1831a48: +0x10 -> e9929a, +0x78 -> eabb76, +0xa0 -> eaba80
```

Additional callback-package wrapper APs seen locally:

```text
0x1844890: +0xa0 -> 1008f1e
0x18448d8: +0xa0 -> 1009cb0
```

These local wrapper APs describe stack/package helper objects around the callback machinery; they do not yet prove the concrete AP of `r14 = [rsp+0x390]`.

## Closed items

```text
setup-bundle +0x30 source
factory-consumption path
slot AP descriptor/builder false leads
child getter b411a4 = [rdi+0x18]
child AP 0x184da88 +0x38 = b411a4
[rsp+0x60] = &this+0x18
this+0x18 direct writer at 10ac1a9
installed child+0x18 object AP 0x184d898
107162a payload installer into allocated_0x28+0x08
10bff52 forwarding/helper method
10bffde condition/update method
late 0x198/AP 0x184d5d0 stores installed object at +0x60
0x184d5d0 +0x150/+0x158 dispatch to installed object +0x10/+0x18
ea785e stack-output cleanup/destructor path
aab330 classified as weak/shared lock + pointer copier
e99c54 classified as packaged callback materialized at e950d9, not direct AP relocation
17da794 callback package layout resolved
17da802 callback package cleanup resolved
virtual +0xa0 receiver path localized to r14 = [rsp+0x390]
[rsp+0x390]/[rsp+0x398] receiver pair source corrected to owner+0x480 via af2eb8
```

## Still open / next best targets

```text
Bind concrete object/AP stored at owner+0x480.
Bind r14 concrete vtable and its +0xa0/+0xa8 implementations.
Trace owner+0x480 construction/writers with a more precise targeted workflow.
Keep [r13+0x410].vtable+0x28 as a side-effect/gate candidate and trace it separately.
Only after binding r14 +0xa0/+0xa8, trace where the e99c54 package is invoked and what original object reaches e99c54.
```

## Evidence reports

- `analysis/restrictions-rsp390-lifecycle-v18.md`
- `analysis/restrictions-af2eb8-receiver-copy-v18.md`
- `analysis/restrictions-owner-field-writers-fixed-v18.md` — generated but empty; do not use as evidence
- `analysis/restrictions-local-r13-plus410-v17.md`
- `analysis/restrictions-global-plus410-writers-v17.md` — generated but empty; do not use as evidence
- `analysis/restrictions-plus28-candidate-methods-v17.md`
- `analysis/restrictions-r13-plus410-provenance-v16.md`
- `analysis/restrictions-plus28-candidates-v16.md`
- `analysis/restrictions-plus28-writer-flow-v16.md`
- `analysis/restrictions-rsp390-r14-provenance-v15.md`
- `analysis/restrictions-plus-a0-candidates-v15.md`
- `analysis/restrictions-plus-a0-package-flow-v15.md`
- `analysis/restrictions-callback-package-17da794-v14.md`
- `analysis/restrictions-virtual-a0-e95105-v14.md`
- `analysis/restrictions-callback-original-flow-v14.md`
