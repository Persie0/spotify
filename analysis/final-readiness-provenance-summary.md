# Final Skip-Ad readiness provenance summary

This is the compact state of the final availability/export investigation after the `0x6b0` and TimelineAds-wrapper aliases were rejected.

## Correct high-level chain

```text
readiness-source object
  +0x178 shared/erased payload
      |
      | builders AP 0x1834728/+0x30 -> 0xece084
      |          AP 0x1834418/+0x30 -> 0xee6db8
      v
  ece57c
      |
      | copies the first 16 bytes of arg12
      v
0x98-byte erased/shared wrapper
      |
      v
owner+0x428
      |
      v
e99d07
      |
      v
fd4c04
      |
      v
Skip-Ad adapter outer+0x58 / this+0x40
      |
      v
fd381a state+0x40 virtual +0x140 readiness/mode discriminator
```

The `owner+0x428` input is no longer just nearby or associated with `source+0x178`; the transfer is proven by the call layout into `ece57c`. Both sibling source builders pass `source+0x178` as SysV argument 12, and `ece57c` copies that pair into the wrapper installed at `owner+0x428`.

## Concrete secondary readiness interface

The pair copied through `source+0x178` is a `{head, owner}` pair:

```text
head  = base+0x18
owner = base
```

The owner is the 0x58-byte object allocated at `e948ff`:

```text
base+0x00 = primary AP 0x1831a70
base+0x18 = secondary readiness AP 0x1843bf8
base+0x20 = r12
base+0x28 = rbx
base+0x48 = copied owner+0x470 pair
```

The secondary interface `0x1843bf8` is therefore the exported readiness interface head, not the full owning object.

## Inner dependency behind the readiness interface

`0x1843bf8:+0x10` resolves to `0xfec736`. That method delegates through the pointer stored at `interface+0x8`, which is the owning object's `base+0x20` field.

Construction shows:

```text
e94925  [base+0x20] = r12
e947cb  r12 = rbx+0x18
e947d6  [rbx+0x18] = AP 0x1832be8
```

So the inner dependency reached by `0x1843bf8:+0x10` is the secondary interface at `AP 0x1832be8`, not the rejected raw `0x6b0` record.

The current method chain is:

```text
0x1843bf8:+0x10
      -> 0xfec736
      -> [this+0x8]
      -> AP 0x1832be8
      -> +0x10 / 0xea0f30
      -> delegates to [this+0x8] virtual +0x30
```

## Restrictions-derived final source

The delegated source is now constrained to the Restrictions registry path:

```text
registry ID 0x9e
      -> RestrictionsSetupImpl
      -> service AP 0x184ca90
      -> service +0x28 returns [this+0x10]
      -> child AP 0x184da88 installed at service+0x10
      -> child +0x38 = 0xb411a4
      -> returns [child+0x18]
      -> child+0x18 comes from constructor rcx
      -> factory supplies constructor rcx from input dependency bundle +0x30
```

This means the final `state+0x40` dependency used by `fd381a` is now a **RestrictionsSetupImpl-derived readiness source**. It should not be attributed to TimelineAds owner `+0x50`, the `0x18678f8` TimelineAds wrapper, or the old raw `0x6b0` interpretation.

## What is still open

The remaining unresolved edge has narrowed to the object supplied from the Restrictions factory dependency bundle `+0x30` into child `+0x18`, and how that source ultimately implements or feeds the `state+0x40 / virtual +0x140` discriminator used by `fd381a`.

The AdsRuntime/TimelineAds readiness graph is still proven as an execution-side readiness bridge:

```text
AdsRuntime+0x1b8
  -> TimelineAds owner+0x20/+0x10
  -> TimelineAds owner+0x50
  -> TimelineConductor consumption
```

But that graph must not be treated as the final availability-export receiver until it is connected to the Restrictions-derived `owner+0x428` source above.

## Evidence reports

- `analysis/field428-install-proof.md`
- `analysis/final-readiness-secondary-1843bf8.md`
- `analysis/final-readiness-carrier-inner.md`
- `analysis/final-readiness-dependency-methods.md`
- `analysis/final-readiness-source-rsi.md`
- `analysis/readiness-concrete-service-vtables.md`
- `analysis/readiness-registry-services.md`
- `analysis/restrictions-readiness-objects.md`
- `docs/15-skip-ad-signal.md`
