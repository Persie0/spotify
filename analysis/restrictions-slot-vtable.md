# Restrictions slot-object vtable trace

Purpose: resolve the object allocated by `1507a9e` and stored into `bundle+0x30`. Allocation writes AP `0x187e2f8` into the new slot object. The helper wrappers `15e768e` and `15e75f2` dispatch through this object at vtable offsets `+0x90` and `+0x98`.

## Slot AP entries

| offset | target | section | file offset |
|---:|---:|---|---:|
| `+0x0` | `0x0` | `.data.rel.ro` | `0x187e2f8` |
| `+0x8` | `0x0` | `.data.rel.ro` | `0x187e300` |
| `+0x10` | `0x0` | `.data.rel.ro` | `0x187e308` |
| `+0x18` | `0x0` | `.data.rel.ro` | `0x187e310` |
| `+0x20` | `0x0` | `.data.rel.ro` | `0x187e318` |
| `+0x28` | `0x0` | `.data.rel.ro` | `0x187e320` |
| `+0x30` | `0x0` | `.data.rel.ro` | `0x187e328` |
| `+0x38` | `0x0` | `.data.rel.ro` | `0x187e330` |
| `+0x40` | `0x0` | `.data.rel.ro` | `0x187e338` |
| `+0x48` | `0x0` | `.data.rel.ro` | `0x187e340` |
| `+0x50` | `0x0` | `.data.rel.ro` | `0x187e348` |
| `+0x58` | `0x0` | `.data.rel.ro` | `0x187e350` |
| `+0x60` | `0x0` | `.data.rel.ro` | `0x187e358` |
| `+0x68` | `0x0` | `.data.rel.ro` | `0x187e360` |
| `+0x70` | `0x0` | `.data.rel.ro` | `0x187e368` |
| `+0x78` | `0x0` | `.data.rel.ro` | `0x187e370` |
| `+0x80` | `0x0` | `.data.rel.ro` | `0x187e378` |
| `+0x88` | `0x0` | `.data.rel.ro` | `0x187e380` |
| `+0x90` | `0x0` **semantic target** | `.data.rel.ro` | `0x187e388` |
| `+0x98` | `0x0` **semantic target** | `.data.rel.ro` | `0x187e390` |
| `+0xa0` | `0x0` | `.data.rel.ro` | `0x187e398` |

## Interpretation

The semantic implementation of the bundle30-derived slot object is not in `15e768e` / `15e75f2`; those are wrapper thunks. The real implementation is the AP `0x187e2f8` entries at `+0x90` and `+0x98`, resolved above. These are the next concrete methods to classify against the final readiness/mode discriminator path.
