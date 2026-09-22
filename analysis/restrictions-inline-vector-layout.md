# Restrictions inline vector layout trace

Purpose: close the `bundle+0x30` provenance edge by interpreting `bundle+0x18` as a vector-like subobject whose inline storage starts at `bundle+0x30`. Earlier direct-write traces missed writes through the vector data pointer loaded from `[bundle+0x18]`.

## Key result

```text
14ce677 initializes [bundle+0x18] = bundle+0x30
1507b0d loads rcx = [bundle+0x18] = bundle+0x30
1507b1a writes [rcx + 0*8] = new slot object pointer
Therefore 1507b1a writes the value later read by Restrictions as [bundle+0x30].
```

## Stack-bundle constructor evidence

At this point `rcx = rsp+0x310 = bundle+0x30`; therefore negative offsets from `rcx` are fields in the stack bundle object whose base is `rsp+0x2e0`.

```text
 14ce65f:	48 8d 05 62 fd 3a 00 	lea    rax,[rip+0x3afd62]        # 187e3c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3aab0>
 14ce666:	48 8d 8c 24 10 03 00 	lea    rcx,[rsp+0x310]
 14ce66e:	48 89 41 d0          	mov    QWORD PTR [rcx-0x30],rax
 14ce672:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0
 14ce677:	48 89 49 e8          	mov    QWORD PTR [rcx-0x18],rcx
 14ce67b:	48 b8 00 00 00 00 04 	movabs rax,0x400000000
 14ce685:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
 14ce689:	83 61 f8 00          	and    DWORD PTR [rcx-0x8],0x0
 14ce68d:	83 61 20 00          	and    DWORD PTR [rcx+0x20],0x0
```

Field interpretation from the constructor:

| instruction | resolved field | interpretation |
|---|---|---|
| `mov [rcx-0x30], rax` | `bundle+0x00 = 0x187e3c8` | bundle vptr/address-point |
| `and [rcx-0x20], 0` | `bundle+0x10 = 0` | subobject/state zero |
| `mov [rcx-0x18], rcx` | `bundle+0x18 = bundle+0x30` | vector data pointer points at inline storage |
| `mov [rcx-0x10], 0x400000000` | `bundle+0x20 low=0, bundle+0x24 high=4` | vector count/capacity-style packed fields |
| `and [rcx-0x8], 0` | `bundle+0x28 = 0` | vector used/constructed count-style field |
| `and [rcx+0x20], 0` | `bundle+0x50 = 0` | later scalar/substructure field |

## Caller and slot helper evidence

`0x153cbfc` passes the vector subobject, not the bundle base, to `1507a9e`:

```text
 153cc43:	49 8d 6e 18          	lea    rbp,[r14+0x18]
 153cc94:	48 89 ef             	mov    rdi,rbp
 153cc97:	e8 02 ae fc ff       	call   1507a9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d022>
 153cc9c:	48 89 c7             	mov    rdi,rax
 153cc9f:	48 89 de             	mov    rsi,rbx
 153cca2:	e8 fd 05 00 00       	call   153d2a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382828>
```

With `rdi = bundle+0x18`, the vector helper uses `[rbx]` as the data pointer. Because the constructor set `[bundle+0x18] = bundle+0x30`, the store at `1507b1a` resolves to `bundle+0x30` for the first slot (`r14d = 0`).

```text
 1507aa2:	48 89 fb             	mov    rbx,rdi
 1507aa5:	44 8b 77 08          	mov    r14d,DWORD PTR [rdi+0x8]
 1507aa9:	8b 47 10             	mov    eax,DWORD PTR [rdi+0x10]
 1507aac:	41 39 c6             	cmp    r14d,eax
 1507aaf:	73 17                	jae    1507ac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d04c>
 1507ab1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1507ab9:	89 4b 08             	mov    DWORD PTR [rbx+0x8],ecx
 1507abc:	4a 8b 04 f0          	mov    rax,QWORD PTR [rax+r14*8]
 1507ac8:	44 3b 73 0c          	cmp    r14d,DWORD PTR [rbx+0xc]
 1507ae3:	ff c0                	inc    eax
 1507ae5:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
 1507ae8:	6a 38                	push   0x38
 1507aeb:	e8 10 64 2e 00       	call   17edf00 <_Znwm@plt>
 1507af0:	48 8d 0d 01 68 37 00 	lea    rcx,[rip+0x376801]        # 187e2f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a9e0>
 1507af7:	48 89 08             	mov    QWORD PTR [rax],rcx
 1507b0d:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
 1507b10:	41 8d 56 01          	lea    edx,[r14+0x1]
 1507b14:	89 53 08             	mov    DWORD PTR [rbx+0x8],edx
 1507b17:	44 89 f2             	mov    edx,r14d
 1507b1a:	48 89 04 d1          	mov    QWORD PTR [rcx+rdx*8],rax
```

Critical derivation:

```text
entry to 1507a9e: rdi = bundle+0x18
1507aa2: rbx = rdi = bundle+0x18
constructor: [bundle+0x18] = bundle+0x30
1507b0d: rcx = [rbx] = [bundle+0x18] = bundle+0x30
1507b17: edx = r14d = 0 for the first appended slot
1507b1a: [rcx + rdx*8] = rax -> [bundle+0x30] = allocated slot pointer
caller 153cc9c/153cca2 then passes rax to 153d2a4 to fill that slot
Restrictions factory later reads [rdx+0x30], so it reads this first slot pointer
```

## Destructor/free-guard corroboration

The destructor path compares the vector data pointer against `bundle+0x30` before freeing it, matching the inline-storage interpretation:

```text
 153cb26:	8b 4b 28             	mov    ecx,DWORD PTR [rbx+0x28]
 153cb29:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 153cb54:	48 8d 43 30          	lea    rax,[rbx+0x30]
 153cb58:	48 39 c7             	cmp    rdi,rax
 153cb5d:	e8 fe 1b 2b 00       	call   17ee760 <free@plt>
 153cb62:	48 83 c3 10          	add    rbx,0x10
```

This pattern means `bundle+0x30` is not a normal independent field initialized by a direct store. It is inline vector storage used when `[bundle+0x18]` points at the embedded array. The first append stores into it through the loaded data pointer.

## Provenance closure

```text
provider-vector caller
  -> constructs stack bundle at rsp+0x2e0
  -> rcx = rsp+0x310 = bundle+0x30
  -> [bundle+0x18] = bundle+0x30
  -> 153cbfc chooses bundle+0x18 vector
  -> 1507a9e appends a newly allocated slot object
  -> 1507b1a stores that pointer through [bundle+0x18] into bundle+0x30
  -> 153d2a4 fills that object from the descriptor stream
  -> provider +0x28 passes rdx = bundle base
  -> RestrictionsSetupImpl factory reads [rdx+0x30]
```

## Conclusion

The previously missing edge is closed: `bundle+0x30` is populated indirectly as the first element of inline vector storage, not through a direct `[bundle+0x30]` store. This explains why direct stack-slot, vtable-method, descriptor-helper, and resize-helper scans all saw zero direct writes.
