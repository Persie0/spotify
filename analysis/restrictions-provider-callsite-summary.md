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

`analysis/restrictions-local-slice-a79a7e.md` narrows the next edge.

The slice contained 64 local instructions and 6 calls. The key calls are:

```text
14ce65a  mutex::lock(rdi=r15)
14ce6b8  basic_string copy ctor(rdi=rsp+0x2b0, rsi=r12)
14ce6d4  operator new
14ce717  a79a7e(rdi=rsp+0x3a0, rsi=rsp+0x2b1, rcx=rsp+0x350)
14ce72c  helper(rdi=rsp+0x230, rsi=rsp+0x3a0)
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

That means the next useful trace should follow `17d5775` and/or the post-`a79a7e` call `14ce72c -> 17add2a`, rather than treating `a79a7e` itself as the final owner.

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
  -> object fields around rcx-0x30..rcx+0x20
  -> local calls 14ce6b8 / 14ce6d4 / 14ce717 / 14ce72c
  -> likely deeper helper 17d5775 or 17add2a
  -> RestrictionsSetupImpl rdx+0x30
  -> factory constructor rcx
  -> Restrictions child +0x18
  -> child +0x38 / b411a4
  -> final readiness dependency chain
```

## Current limitation

The traces do **not** yet prove the exact write source for the value that Restrictions reads from `rdx+0x30`. They prove the call-boundary mapping and narrow the local materialization site, but the value source still needs deeper slicing through the local call chain.

Most likely next targets:

1. inspect `14ce72c -> 17add2a` because it consumes the `rsp+0x3a0` object returned/built after `a79a7e`,
2. inspect helper `17d5775` reached by `a79a7e`, because `a79a7e` forwards `rdi/rsi` there as `rdx/rcx`,
3. determine whether either helper stores into the structure whose later provider-call alias is `rsp+0x2e0 + 0x30`.

## Evidence files

- `analysis/restrictions-provider-callsite.md`
- `analysis/restrictions-provider-callsite-summary.md`
- `analysis/restrictions-bundle30-stackslot.md`
- `analysis/restrictions-bundle30-consumers.md`
- `analysis/restrictions-local-slice-a79a7e.md`
- `analysis/shared-setup-bundle-source.md`
- `analysis/provider-vector-factory-caller.md`
- `analysis/setup-dependency-bundle30.md`
- `analysis/final-readiness-provenance-summary.md`
