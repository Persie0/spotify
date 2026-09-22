# Restrictions provider callsite summary

This summarizes the focused provider-vector trace after replacing the first huge report with connector-readable bounded reports.

## Known target

Restrictions provider identity from earlier descriptor resolution:

```text
provider descriptor AP = 0x184ca50
provider ID            = 0x9e
provider name          = RestrictionsSetupImpl
factory                = 0x10ab7ae
```

The direct xrefs recovered in the concise report are:

```text
b60b43  lea rcx, [rip+...]  # 0x184ca50
10ab7ae RestrictionsSetupImpl factory entry
```

## Provider-vector call ABI

The ranked provider-vector caller remains:

```text
0x14cdc2a..0x14d4d4c
```

Within that FDE, provider factory calls use:

```text
rdi = hidden/sret output
rsi = provider descriptor
rdx = shared setup bundle
rcx = registry context
call provider +0x28
```

The concise report found **8** provider-like `+0x28` callsites.

## Shared setup bundle source at the callsites

All 8 provider-like callsites resolve their `rdx` setup-bundle argument to the same stack-local base:

```text
rdx -> rsp+0x2e0
```

Examples:

```text
14cfd3a  mov rdx, r14   ; r14 resolves to rsp+0x2e0
14d1c46  mov rdx, r14   ; r14 resolves to rsp+0x2e0
14d1ca1  mov rdx, rbx   ; rbx resolves to rsp+0x2e0
14d2a2d  mov rdx, r14   ; r14 resolves to rsp+0x2e0
```

So the Restrictions factory field that was previously described as:

```text
bundle+0x30
```

is, at this provider-vector call boundary, the stack slot:

```text
rsp+0x310
```

## Stack-slot follow-up findings

`analysis/restrictions-bundle30-stackslot.md` scanned the full provider-vector FDE for the concrete stack-slot mapping.

Key counts:

```text
instructions in FDE                         = 6856
exact [rsp+0x310] / [rsp+0x2e0] refs        = 192
alias assignments involving bundle base     = 315
alias-based bundle field refs               = 33
helper calls with bundle-derived args       = 628
provider +0x28 calls                        = 8
```

Important result: the alias-based bundle field refs contain no local `bundle+0x30` write. The visible alias field refs are offsets like:

```text
bundle+0x0
bundle+0x8
bundle+0x10
bundle+0x18
bundle+0x20
```

This suggests `bundle+0x30` is not populated by a simple local `[bundle_base+0x30]` store in the provider-vector FDE.

`analysis/restrictions-bundle30-consumers.md` then filtered specifically for `rsp+0x310` / `bundle_30` consumers.

It found exactly one concrete materialization:

```text
14ce666  lea rcx, [rsp+0x310]
```

The local object around that address is initialized through negative offsets from `rcx` and one positive field:

```text
14ce66e  mov [rcx-0x30], rax
14ce672  and [rcx-0x20], 0x0
14ce677  mov [rcx-0x18], rcx
14ce685  mov [rcx-0x10], rax
14ce689  and [rcx-0x8], 0x0
14ce68d  and [rcx+0x20], 0x0
```

The same narrow trace found **0** calls carrying a `bundle_30` argument while the simple alias tracker still knew it. The first calls after the `rsp+0x310` materialization are:

```text
14ce6b8  basic_string copy constructor
14ce6d4  operator new
14ce717  a79a7e
```

## Local slice around `0x14ce666..0x14ce717`

`analysis/restrictions-local-slice-a79a7e.md` narrowed the next edge.

The slice contained 64 local instructions and 6 calls. The key calls are:

```text
14ce65a  mutex::lock(rdi=r15)
14ce6b8  basic_string copy ctor(rdi=rsp+0x2b0, rsi=r12)
14ce6d4  operator new
14ce717  a79a7e(rdi=rsp+0x3a0, rsi=rsp+0x2b1, rcx=rsp+0x350)
14ce72c  17add2a(rdi=rsp+0x230, rsi=rsp+0x3a0)
14ce739  basic_string dtor(rdi=rsp+0x3a0)
```

Important correction: `a79a7e` does **not** receive `rsp+0x310` directly. At the callsite, tracked arguments are:

```text
rdi = rsp+0x3a0
rsi = rsp+0x2b1
rcx = rsp+0x350
```

So `a79a7e` is more likely a string/object construction or append helper used after building the local object, not the direct `bundle+0x30` carrier.

The helper target has many xrefs (`5651`), and its early body does not directly dereference incoming argument registers in the first `0x260` bytes. It saves arguments into callee-saved registers and forwards them to deeper helpers:

```text
a79abd  mov ebx, edx
a79abf  mov r15, rsi
a79ac2  mov r12, rdi
...
a79ae8  mov rdi, r13
a79aeb  mov rsi, r14
a79aee  mov rdx, r12
a79af1  mov rcx, r15
a79af4  call 17d5775
```

## Follow-up helper trace

`analysis/restrictions-followup-helpers.md` traced the two immediate follow-up helpers plus the formatter reached by `a79a7e`.

Helper summary:

```text
17add2a: direct xrefs 7, arg refs 6, arg-derived writes 4, calls 20
17d5775: direct xrefs 64, arg refs 3, arg-derived writes 0, calls 8
a79ce6 : direct xrefs 17, arg refs 2, arg-derived writes 1, calls 32
```

`17add2a` at the local callsite uses:

```text
rdi = rsp+0x230
rsi = rsp+0x3a0
```

and writes an object at the first argument:

```text
17add3c  mov [rdi], rax
17add7b  mov [rbx+0x8], r14
```

It reads the second argument as a small-string-like object:

```text
17add4e  test BYTE PTR [r15], 0x1
17add54  mov r15, [r15+0x10]
```

So `17add2a` builds a post-`a79a7e` object at `rsp+0x230`; it is not itself the provider bundle writer.

`17d5775` is more consistent with string/encoding conversion: it receives `a79a7e`'s original `rdi/rsi` as `rdx/rcx`, reads bytes from `arg:rdx`, and produced no arg-derived writes in the bounded window. This makes it less likely to be the Restrictions setup source.

## Post-`17add2a` handoff

`analysis/restrictions-post-add2a-handoff.md` found the concrete handoff back into the shared setup bundle.

Immediately after `17add2a`, the caller destroys temporary strings, checks the object at `rsp+0x230`, and then does:

```text
14ce75d  lea rdi, [rsp+0x2e0]
14ce765  lea rsi, [rsp+0x230]
14ce76d  call 166103c
```

The tracked call state is:

```text
14ce76d: rdi=bundle_base(rsp+0x2e0), rsi=post_add2a_obj(rsp+0x230)
```

This is now the best concrete candidate for the setup-bundle mutation path.

Inside `166103c`, the helper builds a local descriptor object from `rsi`, then calls virtual methods on the bundle object passed as `rdi`:

```text
166105d  mov [r14+0x8], rsi
166107b  mov rbx, rdi
1661086  mov rax, [rdi]
1661089  call [rax+0x10]
166108c  mov rax, [rbx]
166108f  mov rdi, rbx
1661092  mov rsi, r14
1661095  call [rax+0x30]
166109c  mov rax, [rbx]
16610a2  call [rax+0x18]
```

The important part is that the actual mutation is probably hidden behind the bundle object's vtable calls, especially:

```text
bundle.vtable+0x30(bundle, local_descriptor)
```

That means the next trace should resolve the vtable used by the stack bundle object at `rsp+0x2e0`, then inspect its `+0x30` method. This is stronger than continuing through generic string helpers.

## Restrictions factory consumption

At the factory entry, `rdx` is saved into `rbx` and then used as the setup bundle:

```text
10ab7c2  mov rbx, rdx
10ab824  mov rax, [rbx+0x30]
10ab82d  mov rax, [rbx+0x60]
10ab836  mov rax, [rbx+0x98]
10ab842  mov rbp, [rbx+0x68]
```

Current best path:

```text
provider-vector caller rsp+0x310
  -> local object materialized at 14ce666
  -> local calls 14ce6b8 / 14ce6d4 / 14ce717
  -> 17add2a builds object at rsp+0x230
  -> 14ce76d calls 166103c(bundle=rsp+0x2e0, object=rsp+0x230)
  -> 166103c calls bundle.vtable+0x30(bundle, local_descriptor)
  -> provider +0x28 receives rdx=rsp+0x2e0
  -> RestrictionsSetupImpl reads rdx+0x30
  -> factory constructor rcx
  -> Restrictions child +0x18
  -> child +0x38 / b411a4
  -> final readiness dependency chain
```

## Current limitation

The traces now prove the handoff from the local `rsp+0x230` object into the setup bundle interface, but they do **not** yet resolve the concrete vtable/method behind `bundle.vtable+0x30`. The next target is therefore:

```text
rsp+0x2e0 vtable source
  -> method at +0x30
  -> whether it writes setup_bundle+0x30
```

Most likely next targets:

1. identify where `[rsp+0x2e0]` gets its vtable,
2. resolve the concrete target of `[bundle.vtable+0x30]` used at `1661095`,
3. inspect whether that method stores the object/reference that becomes `rdx+0x30` for `RestrictionsSetupImpl`.

## Evidence files

- `analysis/restrictions-provider-callsite.md`
- `analysis/restrictions-provider-callsite-summary.md`
- `analysis/restrictions-bundle30-stackslot.md`
- `analysis/restrictions-bundle30-consumers.md`
- `analysis/restrictions-local-slice-a79a7e.md`
- `analysis/restrictions-followup-helpers.md`
- `analysis/restrictions-post-add2a-handoff.md`
- `analysis/shared-setup-bundle-source.md`
- `analysis/provider-vector-factory-caller.md`
- `analysis/setup-dependency-bundle30.md`
- `analysis/final-readiness-provenance-summary.md`
