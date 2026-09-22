# Restrictions provider callsite summary

This summarizes the focused provider-vector trace after replacing the first huge report with a connector-readable concise report.

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

## Restrictions factory consumption

At the factory entry, `rdx` is saved into `rbx` and then used as the setup bundle:

```text
10ab7c2  mov rbx, rdx
10ab824  mov rax, [rbx+0x30]
10ab82d  mov rax, [rbx+0x60]
10ab836  mov rax, [rbx+0x98]
10ab842  mov rbp, [rbx+0x68]
```

This proves why the next edge should be traced as stack-slot dataflow, not as another abstract provider object:

```text
provider-vector caller rsp+0x310
  -> RestrictionsSetupImpl rdx+0x30
  -> factory constructor rcx
  -> Restrictions child +0x18
  -> child +0x38 / b411a4
  -> final readiness dependency chain
```

## Current limitation

The concise trace did **not** find direct `bundle+0x30` writes immediately before the 8 provider calls. That means the source is likely one of:

1. initialized earlier in `0x14cdc2a..0x14d4d4c` outside the local backscan window,
2. copied into the stack bundle by a helper before the provider-call block,
3. propagated through another stack alias before becoming `rsp+0x310`.

The next focused trace should follow all reads/writes and aliasing of:

```text
[rsp+0x310]
```

inside `0x14cdc2a..0x14d4d4c`, plus any helper calls that receive `rsp+0x2e0` or a pointer derived from it before the provider `+0x28` calls.

## Evidence files

- `analysis/restrictions-provider-callsite.md`
- `analysis/shared-setup-bundle-source.md`
- `analysis/provider-vector-factory-caller.md`
- `analysis/setup-dependency-bundle30.md`
- `analysis/final-readiness-provenance-summary.md`
