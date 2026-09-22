# Restrictions provider callsite summary

This is the compact state of the Restrictions setup-bundle provenance trace.

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

The concise report found 8 provider-like `+0x28` callsites. All 8 resolve their `rdx` setup-bundle argument to the same stack-local base:

```text
rdx -> rsp+0x2e0
```

Therefore the Restrictions factory field previously described abstractly as `bundle+0x30` is, at the provider-vector call boundary, the concrete stack slot:

```text
rsp+0x310
```

The Restrictions factory consumes this bundle as:

```text
10ab7c2  mov rbx, rdx
10ab824  mov rax, [rbx+0x30]
10ab82d  mov rax, [rbx+0x60]
10ab836  mov rax, [rbx+0x98]
10ab842  mov rbp, [rbx+0x68]
```

## Closed `bundle+0x30` provenance

The missing edge is now closed. `bundle+0x30` is not populated by a direct `[bundle+0x30]` store. It is the first element of inline vector storage for the vector subobject at `bundle+0x18`.

Constructor evidence:

```text
14ce65f  lea rax, [rip+...]  # 0x187e3c8
14ce666  lea rcx, [rsp+0x310]       ; rcx = bundle+0x30
14ce66e  mov [rcx-0x30], rax        ; bundle+0x00 = AP 0x187e3c8
14ce672  and [rcx-0x20], 0x0        ; bundle+0x10 = 0
14ce677  mov [rcx-0x18], rcx        ; bundle+0x18 = bundle+0x30
14ce685  mov [rcx-0x10], 0x400000000; bundle+0x20/0x24 packed vector fields
14ce689  and [rcx-0x8], 0x0         ; bundle+0x28 = 0
14ce68d  and [rcx+0x20], 0x0        ; bundle+0x50 = 0
```

`0x153cbfc` passes the vector subobject, not the whole bundle, to the slot helper:

```text
153cc43  lea rbp, [r14+0x18]  ; rbp = bundle+0x18
153cc94  mov rdi, rbp
153cc97  call 1507a9e
153cc9c  mov rdi, rax
153cc9f  mov rsi, rbx
153cca2  call 153d2a4
```

Inside `1507a9e`, `rbx = bundle+0x18`; `[rbx]` is the vector data pointer. Since the constructor set `[bundle+0x18] = bundle+0x30`, the store at `1507b1a` writes the first slot pointer into `bundle+0x30`:

```text
1507aa2  mov rbx, rdi               ; rbx = bundle+0x18
1507aa5  mov r14d, [rdi+0x8]
1507aa9  mov eax, [rdi+0x10]
1507aeb  call operator new          ; returns new slot object in rax
1507b0d  mov rcx, [rbx]             ; rcx = [bundle+0x18] = bundle+0x30
1507b14  mov [rbx+0x8], edx
1507b17  mov edx, r14d              ; first append: edx = 0
1507b1a  mov [rcx+rdx*8], rax       ; [bundle+0x30] = new slot object pointer
```

`153d2a4` then fills that newly allocated object from the descriptor stream. The Restrictions factory later reads `[rdx+0x30]`, so it receives this first inline-vector slot pointer.

The destructor/free guard corroborates the inline-storage interpretation:

```text
153cb29  mov rdi, [rbx+0x18]
153cb54  lea rax, [rbx+0x30]
153cb58  cmp rdi, rax
153cb5d  call free@plt
```

That check avoids freeing the inline vector buffer when the data pointer still equals `bundle+0x30`.

## Proven path

```text
provider-vector caller
  -> constructs stack bundle at rsp+0x2e0
  -> rcx = rsp+0x310 = bundle+0x30
  -> [bundle+0x18] = bundle+0x30
  -> 166103c(bundle, post_add2a_obj)
  -> bundle.vtable+0x30 = 0x153cbfc
  -> 153cbfc selects the bundle+0x18 vector subobject
  -> 1507a9e appends a newly allocated slot object
  -> 1507b1a stores that object pointer through [bundle+0x18] into bundle+0x30
  -> 153d2a4 fills that object from the descriptor stream
  -> provider +0x28 calls pass rdx = rsp+0x2e0
  -> RestrictionsSetupImpl factory reads [rdx+0x30]
  -> Restrictions child +0x18
  -> child +0x38 / b411a4
  -> final readiness dependency chain
```

## Ruled-out direct writer paths

Earlier traces saw zero direct `bundle+0x30` writes because the real write is indirect through the inline-vector data pointer. These branches are ruled out as direct writers:

1. simple local provider-vector store,
2. `a79a7e`,
3. `17add2a`,
4. `bundle.vtable+0x30` / `0x153cbfc` direct body stores,
5. `bundle+0x18 -> 1507a9e` interpreted only as direct `arg+offset` stores,
6. `bundle+0x18 -> d15d98` resize helper,
7. other resolved bundle vtable methods under direct `rdi=bundle_base` tracking,
8. descriptor helpers `165fe6a`, `165ffb0`, `1660032`, `153d2a4`, and `153d0d0`,
9. direct descriptor callees `16609b0`, `1660346`, `165feb3`, and `1660070`.

The earlier apparent contradiction is resolved by distinguishing direct field stores from stores through `[bundle+0x18]`, whose data pointer is initialized to the inline storage address `bundle+0x30`.

## Current conclusion

The `RestrictionsSetupImpl` dependency consumed at `[bundle+0x30]` is the first object pointer appended into the stack bundle's inline vector storage. That object is allocated by `1507a9e`, stored at `1507b1a`, and filled by `153d2a4` before provider factories consume the shared setup bundle.

## Evidence files

- `analysis/restrictions-inline-vector-layout.md`
- `analysis/restrictions-provider-callsite.md`
- `analysis/restrictions-bundle30-stackslot.md`
- `analysis/restrictions-bundle30-consumers.md`
- `analysis/restrictions-local-slice-a79a7e.md`
- `analysis/restrictions-followup-helpers.md`
- `analysis/restrictions-post-add2a-handoff.md`
- `analysis/restrictions-bundle-vtable.md`
- `analysis/restrictions-vtable30-method-summary.md`
- `analysis/restrictions-substructure-writers.md`
- `analysis/restrictions-resize-helper.md`
- `analysis/restrictions-other-vtable-methods.md`
- `analysis/restrictions-descriptor-helpers.md`
- `analysis/restrictions-direct-callees.md`
- `analysis/final-readiness-provenance-summary.md`
