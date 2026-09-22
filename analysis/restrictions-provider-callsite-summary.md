# Restrictions provider callsite summary

This is the current compact state of the Restrictions setup-bundle provenance trace.

## Known Restrictions provider target

Earlier descriptor resolution identified the Restrictions provider as:

```text
provider descriptor AP = 0x184ca50
provider ID            = 0x9e
provider name          = RestrictionsSetupImpl
factory                = 0x10ab7ae
```

The direct xrefs recovered in the concise provider report are:

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

The concise report found 8 provider-like `+0x28` callsites.

## Shared setup bundle source at callsites

All 8 provider-like callsites resolve their `rdx` setup-bundle argument to the same stack-local base:

```text
rdx -> rsp+0x2e0
```

Therefore the Restrictions factory field previously described abstractly as:

```text
bundle+0x30
```

is, at the provider-vector call boundary, the concrete stack slot:

```text
rsp+0x310
```

The Restrictions factory later consumes this bundle as:

```text
10ab7c2  mov rbx, rdx
10ab824  mov rax, [rbx+0x30]
10ab82d  mov rax, [rbx+0x60]
10ab836  mov rax, [rbx+0x98]
10ab842  mov rbp, [rbx+0x68]
```

## Stack-slot and local construction findings

The stack-slot trace found no direct local `bundle+0x30` write in the broad provider-vector FDE. The visible alias field refs were offsets like:

```text
bundle+0x0
bundle+0x8
bundle+0x10
bundle+0x18
bundle+0x20
```

The concrete `rsp+0x310` materialization is:

```text
14ce65f  lea rax, [rip+...]  # 0x187e3c8
14ce666  lea rcx, [rsp+0x310]
14ce66e  mov [rcx-0x30], rax   ; [rsp+0x2e0] = 0x187e3c8
14ce672  and [rcx-0x20], 0x0
14ce677  mov [rcx-0x18], rcx
14ce685  mov [rcx-0x10], 0x400000000
14ce689  and [rcx-0x8], 0x0
14ce68d  and [rcx+0x20], 0x0
```

So `rsp+0x2e0` is a local stack bundle object whose vptr/address-point is `0x187e3c8`.

## Local helper path after materialization

`a79a7e` does not receive `rsp+0x310` directly. At its callsite:

```text
14ce717  call a79a7e
rdi = rsp+0x3a0
rsi = rsp+0x2b1
rcx = rsp+0x350
```

`17add2a` then builds a post-`a79a7e` object at `rsp+0x230`:

```text
14ce72c  17add2a(rdi=rsp+0x230, rsi=rsp+0x3a0)
17add3c  mov [rdi], rax
17add7b  mov [rbx+0x8], r14
```

The concrete handoff back into the setup bundle is:

```text
14ce75d  lea rdi, [rsp+0x2e0]
14ce765  lea rsi, [rsp+0x230]
14ce76d  call 166103c
```

Tracked call state:

```text
rdi = bundle_base(rsp+0x2e0)
rsi = post_add2a_obj(rsp+0x230)
```

## Bundle vtable resolution

The vptr/address-point stored in `[rsp+0x2e0]` resolves as:

```text
AP 0x187e3c8
+0x10 -> 0x153cb86
+0x18 -> 0xa3fa60
+0x30 -> 0x153cbfc
```

Inside `166103c`, these are reached as:

```text
1661089  call [bundle.vtable+0x10]
1661095  call [bundle.vtable+0x30]
16610a2  call [bundle.vtable+0x18]
```

The important dispatch is:

```text
1661095  bundle.vtable+0x30(bundle, local_descriptor)
```

## `bundle.vtable+0x30` method summary

`bundle.vtable+0x30` resolves to:

```text
0x153cbfc
```

ABI at `1661095`:

```text
rdi = bundle_base = rsp+0x2e0
rsi = local descriptor inside 166103c
descriptor+0x8 = post_add2a_obj = rsp+0x230
```

The method starts by preserving these inputs:

```text
153cc0a  mov rbx, rsi     ; descriptor
153cc0d  mov r14, rdi     ; bundle
153cc1e  lea rdx, [rdi+0x10]
153cc27  mov rdi, rbx
153cc2a  call 165fe6a
```

Then it prepares bundle-substructure aliases:

```text
153cc2f  lea r15, [r14+0x90]
153cc36  lea rax, [r14+0x58]
153cc3f  lea r13, [r14+0x50]
153cc43  lea rbp, [r14+0x18]
```

The method parses a descriptor stream and dispatches by tag. Observed bundle mutations are through substructures, not through a direct `bundle+0x30` access:

```text
153cc94  mov rdi, rbp              ; bundle+0x18 path
153cc97  call 1507a9e
153cca2  call 153d2a4

153ccb5  mov rdi, [rsp+0x8]        ; bundle+0x58 path
153ccba  call 1507b20
153ccc5  call 153d0d0

153cccc  mov rdi, rbx              ; descriptor
153cccf  mov rsi, r15              ; bundle+0x90
153ccd2  call 1660032
153ccdc  or [r14+0x8], eax

153cce5  mov rdi, rbx              ; descriptor
153cce8  mov rsi, r13              ; bundle+0x50
153cceb  call 1660032
153ccf3  or [r14+0x8], eax
```

Current conclusion: `+0x30` is a real bundle mutation method, but it does not show a direct write to `bundle+0x30` in its own body. It appears to populate/merge parsed descriptor data into bundle substructures at `+0x18`, `+0x50`, `+0x58`, and `+0x90`, with status flags in `bundle+0x8`.

## Current best path

```text
provider-vector caller
  -> stack bundle object at rsp+0x2e0
  -> bundle AP 0x187e3c8
  -> post-add2a object at rsp+0x230
  -> 166103c(bundle, post_add2a_obj)
  -> bundle.vtable+0x30 = 0x153cbfc
  -> parsed descriptor data stored into bundle substructures
  -> provider +0x28 calls pass rdx = rsp+0x2e0
  -> RestrictionsSetupImpl factory reads [rdx+0x30]
  -> Restrictions child +0x18
  -> child +0x38 / b411a4
  -> final readiness dependency chain
```

## Remaining open edge

The exact source of the value read by Restrictions as `rdx+0x30` is still not closed. Current evidence suggests it is not written by:

1. a simple local provider-vector store,
2. `a79a7e`,
3. `17add2a`, or
4. `bundle.vtable+0x30` / `0x153cbfc` directly.

Next best target:

```text
resolve whether bundle+0x30 is initialized by:
  A) the bundle constructor/setup around 14ce65f..14ce68d,
  B) another vtable method such as +0x0/+0x8/+0x10,
  C) a helper reached by 0x153cbfc, especially 165fe6a or the bundle+0x18/+0x50/+0x58/+0x90 helpers.
```

## Evidence files

- `analysis/restrictions-provider-callsite.md`
- `analysis/restrictions-provider-callsite-summary.md`
- `analysis/restrictions-bundle30-stackslot.md`
- `analysis/restrictions-bundle30-consumers.md`
- `analysis/restrictions-local-slice-a79a7e.md`
- `analysis/restrictions-followup-helpers.md`
- `analysis/restrictions-post-add2a-handoff.md`
- `analysis/restrictions-bundle-vtable.md`
- `analysis/restrictions-vtable30-method-summary.md`
- `analysis/shared-setup-bundle-source.md`
- `analysis/provider-vector-factory-caller.md`
- `analysis/setup-dependency-bundle30.md`
- `analysis/final-readiness-provenance-summary.md`
