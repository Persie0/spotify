# Final Skip-Ad readiness provenance summary

Compact current state after resolving the Restrictions setup-bundle source, proving the direct `child+0x18` writer, tracing the installed object and downstream consumers, and narrowing the remaining erased-interface bridge through v14. Static provenance documentation only; no runtime patching or bypass behavior.

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

The `fd381a state+0x40` dependency remains best explained as a RestrictionsSetupImpl-derived readiness source. Direct AP identity for `0x184d898` / `0x184d5d0` still does not appear in the `fd381a` window; the active remaining bridge is through erased interfaces, callback packaging, and temporary stack output.

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

## v13/v14 callback materialization path

v13 found no direct relocation/AP entry pointing to `e99c54`:

```text
Relocation entries targeting e99c54: none
```

Instead, `e99c54` is materialized as a packaged callback/code pointer:

```text
e950d9  rcx = e99c54
e950e0  rbx = rsp+0xbe0
e950e8  r9 = 0x20
e950ec  rdi = rbx
e950ef  call 17da794              ; packages callback object using rcx=e99c54

e95105  call [r14.vtable+0xa0]    ; passes packaged callback object via rdx=rbx
```

v14 resolved the callback-package helper `17da794`:

```text
17da794(pkg, fn_copy, fn_delete, callback, payload, size):
  [pkg+0x00..0x17] = zero / empty holder
  [pkg+0x18] = fn_copy       ; here dfa052
  [pkg+0x20] = fn_delete     ; here dfa086
  [pkg+0x28] = callback      ; here e99c54
  [pkg+0x30] = operator new[](size, align=8)
  [pkg+0x38] = size          ; here 0x20
  call [pkg+0x18]([pkg+0x30], payload, size)
```

Destructor / cleanup for that package:

```text
17da802(pkg):
  buf = [pkg+0x30]
  if buf != 0:
    if [pkg+0x20] != 0:
      call [pkg+0x20](buf)
    [pkg+0x30] = 0
    delete[] buf, align=8
```

Call-site binding now known:

```text
e950cb  rsi = dfa052       ; copy/fill function -> [pkg+0x18]
e950d2  rdx = dfa086       ; delete/cleanup function -> [pkg+0x20]
e950d9  rcx = e99c54       ; callback body -> [pkg+0x28]
e950e8  r9  = 0x20         ; package buffer size -> [pkg+0x38]
e95102  rdx = rsp+0xbe0    ; callback package passed to virtual +0xa0
```

Receiver path around the virtual `+0xa0` call:

```text
e95091  r14 = [rsp+0x390]
e95099  rax = [rsp+0x398]
e950a1  [rsp+0xa30] = r14
e950a4  [rsp+0xa38] = rax
...
e950f4  rax = [r14]
e950f7  rdi = rsp+0x1050
e950ff  rsi = r14
e95102  rdx = rsp+0xbe0    ; packaged callback
e95105  call [rax+0xa0]
```

This moves the remaining unknown to the concrete vtable behind `r14 = [rsp+0x390]` and its `+0xa0` implementation.

## Original-object builder candidates

The strongest builder materialization found so far:

```text
e92039  operator new(0x160)
e9204a  [r12] = 0x18319a8

e92076  operator new(0x40)
e9207e  rax = 0x18319e0
e92085  [r15] = 0x18319e0
e9208b  rdi = r15+0x10
e92097  b891f8(r15+0x10, stack_object)
e920a4  [stack_wrapper+0x20] = r15
```

Candidate AP table retained:

```text
0x1831968: +0x10 -> ea6568, +0x78 -> e992a2
0x1831980: +0x10 -> ea657c, +0x78 -> e99368
0x18319e0: +0x10 -> e992c8, +0x78 -> e9929a
0x1831938: +0x10 -> ea662e, +0x78 -> e9939c
0x188bd68: +0x10 -> 160c142, +0x78 -> e99382
0x1831a00: +0x10 -> e99382, +0x78 -> eaaf5c
0x1831a48: +0x10 -> e9929a, +0x78 -> eabb76
```

`0x18319e0` is still the most concrete provider candidate because v13 saw it materialized into a freshly allocated `0x40` object and initialized at `+0x10`. It is not yet proven to be the exact `[original]` object passed into `e99c54`.

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
17da794 callback package layout resolved: +0x18 copy, +0x20 delete, +0x28 callback, +0x30 buffer, +0x38 size
```

## Still open / next best targets

```text
Bind r14 = [rsp+0x390] at e95091 to a concrete AP/vtable.
Trace the concrete [r14.vtable+0xa0] implementation called at e95105.
Inside that +0xa0 implementation, find where callback package [rsp+0xbe0] is stored/invoked.
Bind the callback invocation's original object fields:
  [original]
  [original+0x08]
  [original+0x10]
Prove or reject AP 0x18319e0 as the concrete [original] provider object.
Then bind provider +0x78 and consumer +0x10 concretely.
```

## Evidence reports

- `analysis/restrictions-callback-package-17da794-v14.md`
- `analysis/restrictions-virtual-a0-e95105-v14.md`
- `analysis/restrictions-callback-original-flow-v14.md`
- `analysis/restrictions-e99c54-callers-v13.md`
- `analysis/restrictions-original-object-builders-v13.md`
- `analysis/restrictions-provider-consumer-bindings-v13.md`
- `analysis/restrictions-aab330-internals-v12.md`
- `analysis/restrictions-near-e99-ap-candidates-v12.md`
- `analysis/restrictions-original-plus10-consumer-v12.md`
