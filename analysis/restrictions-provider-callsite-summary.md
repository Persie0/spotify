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

This means the next useful step is not another broad provider-vector scan. It should be a local slice around `0x14ce666..0x14ce717`, especially the object formed at `rsp+0x2e0..rsp+0x330` and the call at `0x14ce717`.

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
  -> call sequence 14ce6b8 / 14ce6d4 / 14ce717
  -> RestrictionsSetupImpl rdx+0x30
  -> factory constructor rcx
  -> Restrictions child +0x18
  -> child +0x38 / b411a4
  -> final readiness dependency chain
```

## Current limitation

The traces do **not** yet prove the exact write source for the value that Restrictions reads from `rdx+0x30`. They prove the call-boundary mapping and narrow the local materialization site, but the value source still needs a local slice around:

```text
0x14ce666..0x14ce717
```

Most likely next targets:

1. classify the local object layout initialized around `rcx = rsp+0x310`,
2. inspect call `0x14ce717 -> a79a7e`,
3. determine whether that call moves/copies a field that later becomes provider setup `rdx+0x30`.

## Evidence files

- `analysis/restrictions-provider-callsite.md`
- `analysis/restrictions-provider-callsite-summary.md`
- `analysis/restrictions-bundle30-stackslot.md`
- `analysis/restrictions-bundle30-consumers.md`
- `analysis/shared-setup-bundle-source.md`
- `analysis/provider-vector-factory-caller.md`
- `analysis/setup-dependency-bundle30.md`
- `analysis/final-readiness-provenance-summary.md`
