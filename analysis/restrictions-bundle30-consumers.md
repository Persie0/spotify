# Restrictions bundle+0x30 consumer trace

This is the narrow follow-up to `analysis/restrictions-bundle30-stackslot.md`.
It filters for `rsp+0x310` / `bundle_30` consumers inside `0x14cdc2a..0x14d4d4c`.

## Summary
- exact `[rsp+0x310]` materializations/references: 1
- calls with a `bundle_30` argument: 0
- provider `+0x28` calls seen: 8

## Exact `[rsp+0x310]` contexts
### `0x14ce666` `14ce666:	48 8d 8c 24 10 03 00 	lea    rcx,[rsp+0x310]`
```text
     14ce638:	41 89 85 b0 00 00 00 	mov    DWORD PTR [r13+0xb0],eax
     14ce63f:	4c 89 bc 24 80 03 00 	mov    QWORD PTR [rsp+0x380],r15
     14ce646:	00 
     14ce647:	c6 84 24 88 03 00 00 	mov    BYTE PTR [rsp+0x388],0x1
     14ce64e:	01 
     14ce64f:	4c 89 ff             	mov    rdi,r15
     14ce652:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
     14ce659:	00 
     14ce65a:	e8 91 fa 31 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     14ce65f:	48 8d 05 62 fd 3a 00 	lea    rax,[rip+0x3afd62]        # 187e3c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3aab0>
     14ce666:	48 8d 8c 24 10 03 00 	lea    rcx,[rsp+0x310]
     14ce66d:	00 
     14ce66e:	48 89 41 d0          	mov    QWORD PTR [rcx-0x30],rax
     14ce672:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0
     14ce677:	48 89 49 e8          	mov    QWORD PTR [rcx-0x18],rcx
     14ce67b:	48 b8 00 00 00 00 04 	movabs rax,0x400000000
     14ce682:	00 00 00 
     14ce685:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
     14ce689:	83 61 f8 00          	and    DWORD PTR [rcx-0x8],0x0
     14ce68d:	83 61 20 00          	and    DWORD PTR [rcx+0x20],0x0
     14ce691:	48 8d 8c 24 50 03 00 	lea    rcx,[rsp+0x350]
     14ce698:	00 
     14ce699:	48 89 49 e8          	mov    QWORD PTR [rcx-0x18],rcx
     14ce69d:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
     14ce6a1:	83 61 f8 00          	and    DWORD PTR [rcx-0x8],0x0
     14ce6a5:	83 61 20 00          	and    DWORD PTR [rcx+0x20],0x0
     14ce6a9:	83 61 98 00          	and    DWORD PTR [rcx-0x68],0x0
     14ce6ad:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     14ce6b4:	00 
```

## First calls after each `[rsp+0x310]` materialization
| source | following calls |
|---|---|
| `0x14ce666` | `0x14ce6b8 14ce6b8:	e8 83 f8 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>; 0x14ce6d4 14ce6d4:	e8 27 f8 31 00       	call   17edf00 <_Znwm@plt>; 0x14ce717 14ce717:	e8 62 b3 5a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |

## Calls that carry `bundle_30` in an argument register

None found. The slot is materialized but not passed to a call while the simple linear alias tracker still knows it. Inspect the exact contexts above.

## Provider calls
| call | tracked args |
|---|---|
| `0x14cfd3d` | `rdx=bundle_base` |
| `0x14cfdb2` | `rdx=bundle_base` |
| `0x14d06ad` | `rdx=bundle_base` |
| `0x14d0cce` | `rdx=bundle_base` |
| `0x14d0d6a` | `rdx=bundle_base` |
| `0x14d1c49` | `rdx=bundle_base` |
| `0x14d1caf` | `rdx=bundle_base` |
| `0x14d2a30` | `rdx=bundle_base` |

## Interpretation
- A `bundle_30` call argument is the strongest candidate for the helper that populates or consumes Restrictions `bundle+0x30`.
- If no `bundle_30` call argument is tracked, the next step is manual/automated local control-flow slicing around the exact `[rsp+0x310]` context rather than broader provider-vector scanning.
