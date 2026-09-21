# Service184 provenance corrections

This note records two false provenance paths that were investigated and disproven while tracing the native `ContextPlayer / Signal("skip-ad")` execution dependency.

## Authoritative anchor

The only currently authoritative service-184 accessor is `b8f02e`.

It performs:

```text
facade +0x08 -> service-ID byte buffer
facade +0x10 -> service-ID count
b622de(..., 0xb8) -> validate service ID 184

table = [facade +0x00]
service184 = [table + 0x5c0]   # 0xb8 * 8
```

Any other `+0x5c0` field in the binary must not be called service184 unless its base is independently proven to be this facade's service table.

## Disproven path 1: playback-object +0x5c0

The large playback constructor around `0x1333835` contains:

```text
mov [rbx+0x5c0], rax
```

That numeric offset collision is not enough to identify the field as registry service 184. The object is a normal large playback object, whereas `b8f02e` first loads the service-table pointer from `[facade+0]` and only then reads `table+0x5c0`.

Therefore `0x1333835` is not registry-table population evidence.

## Disproven path 2: map holder / first-insertion +0x10

A second attempted chain followed a map node / holder path around `0x1334484` and interpreted a moved `+0x10` word as a service pointer.

Focused tracing proves that this branch is string/error formatting:

```text
0x1334484
  -> 0x15da3b7
  -> tail jump 0x17dbc9a
  -> 0x17db9e4
  -> __vsnprintf_chk
  -> libc++ basic_string::append
```

The selector passed at `0x32f434` is the literal:

```text
List could not be created from '%s': %s
```

`0x17dbc9a` initializes a 24-byte string-like output aggregate and `0x17db9e4` formats/appends text into it. Consequently the observed output `+0x10` word belongs to the string aggregate. It is not a service184 pointer.

The same correction also invalidates interpreting `0x1333cc3: mov [r8+0x10],rax` as a service assignment. Its exact local window shows it moving a 24-byte temporary between stack aggregates.

## Evidence retained for the correction

- `analysis/service184-holder-plus10.md`
- `analysis/service184-first-insertion-provider.md`
- `analysis/service184-real-factory.md`
- `analysis/service184-tail-factory.md`
- `analysis/service184-core-factory.md`

These reports remain useful as negative evidence even though some filenames reflect the hypothesis being tested rather than the final interpretation.

## Current valid next step

Recover the real service-table population by using the generated accessor family as a structural fingerprint:

```text
ID  47 -> table +0x178
ID  81 -> table +0x288
ID 178 -> table +0x590
ID 184 -> table +0x5c0
```

A genuine service-table constructor/populator should write several of these slots on the same table object, or populate them through an indexed ID-to-pointer loop. Once the real `table[184]` writer is proven, trace that concrete object's vtable and its `+0x28() -> execution dependency` method.
