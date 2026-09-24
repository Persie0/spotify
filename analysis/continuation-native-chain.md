# Continuation state: owner+0x480 native chain (in progress)

Session checkpoint. Goal: finish the "Still open" items of `final-readiness-provenance-summary.md`
(bind `owner+0x480`, bind `r14` vtable `+0xa0/+0xa8`, trace `e99c54` invocation/original,
resolve final `+0x140` discriminator). Static provenance only.

## Tooling (rebuildable; harness lives in /tmp, NOT in repo)

Binary: `app/src/main/lib/x86_64/liborbit-jni-spotify.so` (x86_64).

1. Code VAs == file offsets (first LOAD R+E at VA 0; `.text` = `[0x9d6e40, 0x17ed990)`).
2. `.data.rel.ro` is **zero-filled in the file**; 123,196 `R_X86_64_RELATIVE` relocs
   (`.rela.dyn` at `0x370f0`, 24 B entries) populate it at load. Runtime value (bias 0)
   = reloc addend. Rebuild: parse `.rela.dyn`, map `{offset: addend}`.
   Validated: reproduces `0x184d898` slots (`+0x00=10bff2c, +0x10=10bff52, +0x18=10bffde`)
   and `0x1867c58+0x28=0x135c878`.
3. Exact function bounds from `.eh_frame` FDEs (`readelf --debug-dump=frames`,
   parse `pc=S..E` lines; 71,694 functions).
4. Instruction index: linear capstone walk of executable sections only
   (`.text`, `malloc_hook`, `.plt`); `.text` disassembles with zero invalid bytes.
5. Provider-ID scan: function starts matching bytes `B0 XX C3` (`mov al, XX; ret`)
   = tiny ID methods (197 total). Known IDs validate the method
   (`b8->135c85c`, `9e->10ab792`, `55->d498b2`, `2f->c8049a`, `32->c8f428`, `b7->1352488`).
   Provider AP = (reloc-holder of idmethod) minus `0x10` (ID lives at AP `+0x10`,
   header `pre8 == 0`); name string via AP `+0x18` method (`lea rax,[rip]` + length).

## Proven chain so far (all VAs verified against index/eh_frame)

```text
H (Restrictions factory) [e8c65c, e8e898)
  |-- 61-push storm (e8d9f7..e8dba0, sub rsp,8; cleanup add rsp,0x1f0) calls
  v
G (68-arg ctor/factory) [e8fad0, e92c49)
  |-- single call F at e91e06: rdi=&G.rsp+0x8a0, rsi=&G.rsp+0x260 (owner), rdx=[rsp+8], rcx=&G.rsp+0xe0
  v
F (owner fn) [e92f2c, e98f3b]   (ONLY caller: e91e06; no outside jmps in)
  e92f4d r13 = rsi (owner = G.rsp+0x260)
  e92f64 rsi = [r13+0x480] = [G.rsp+0x6e0]
  e92f73 af2eb8(&rsp+0x390, [r13+0x480])   -> receiver = O50[0..0x20], r14 = O50[0]
```

Stack-arg math (verified): `rsp_G = rsp_entry - 0x9f8`; stack arg k at `rsp_G+0x1000+(k-1)*8`.
G reads `[rsp+0xb88..0xba0]` = H outgoing args = G stack args **#50..#53**:

```text
owner+0x480 = arg50 = &O50,  O50 = H.rsp+0x1c0   (12th push e8da35, lea [rsp+0x220])
owner+0x488 = O51[0..16],    O51 = H.rsp+0x358   (11th push e8da2c, lea [rsp+0x3b0])
owner+0x498 = arg52 = H.r15 at e8da22            (10th push; r15 <- [H.rsp+0x10] at e8c9e7)
owner+0x4a0 = arg53 = H.r12 at e8da20            (9th push;  r12 <- [H.rsp+0x368] at e8d730)
```

O50/O51 constructors in H:

```text
e8c9d6  rax = b8f02e(rdi=r13)              ; registry accessor, ID 0xb8 path
e8c9d9  rdi = &O51
e8c9e4  call [rax_vtable+0x38]             ; builds O51

e8cc55  rsi = [H.rsp+0xb8]                 ; = rootTable[0x76], see below
e8cc60  rdi = &O50
e8cc68  call [vtable+0x28]                 ; builds O50
```

`[H.rsp+0xb8]` (stored e8c866): `[[r13]+0x3b0]` after `b622de(r13, [r13+0x10], 0x76)`.
Slot math proves array indexing: `0x76*8=0x3b0`, `0x78*8=0x3c0`, `0x6e*8=0x370`.
So `[r13]` = service table, `[rsp+0xb8]` = **registry service 0x76**.

New provider identities (via ID-method scan + AP inversion + `+0x18` name strings):

```text
0x76 -> PlayerRenderingSetupImpl  (idmethod 10575ba, provider AP 0x1847f70)
0x78 -> PlayerSequenceSetupImpl   (idmethod e8b75e,  provider AP 0x1831120)
0x6e -> PlaybackPlatformSetupImpl (idmethod de44ae,  provider AP 0x182b558)
```

Service-0x76 path (factory `0x10575d6..0x1058f3c`):

```text
service obj = 0x30 bytes, AP 0x1847fb0 (installed 0x105778c)
  +0x00 = 0x1058f3c (dtor path: call 1058f3c; jmp operator delete)
  +0x28 = 0x1058f62: push rbx; mov rbx,rdi; add rsi,0x10; call af2eb8; mov rax,rbx; ret
        => +0x28(out=&O50, svc): af2eb8(dst=out, src=svc+0x10); returns out
        => O50 = copy of svc-0x76 +0x10 pair; r14 = svc+0x10[0]
factory output: *out = service (0x10589fc: mov [rbx],r12, rbx=[rsp+0x98]=rdi arg)
svc+0x10 filled at 0x10589b0 via ab981c(dst=&svc+0x10, src=&[rsp+0xd8]),
  where [rsp+0xd8] = factory-rbp (block built 0x1058968-85: [rsp+0xd8]=rbp)
```

rbp chain (factory-rbp = r14's object):

```text
rbp <- [rcx+0x178] (0x1057729) where rcx = vtable of A,
A <- [rax+0x30] (0x1057720) where rax = c1177a(rdi=r15) result
c1177a (c1177a..c117a4): b622de([rbx+8],[rbx+0x10],0x4a); return [[rbx]+0x250]
  => c1177a_result = rootTable[0x4a]  (0x4a*8 = 0x250)
0x4a = LocalFilesSetupImpl (idmethod d077ba, provider AP 0x1821f80, factory d077d6..d090fa)
service-0x4a AP = 0x1821fc0 (installed d078b1 into r13-obj):
  +0x30 = b411a4  (shared getter: return [this+0x18])
  +0x178 = d0ad40
  => A = [localfiles-svc+0x18]; rbp-object = A.+0x178 result; r14 = rbp (via svc+0x10 copy)
```

## NEXT STEPS (do these first on resume)

1. **Bind A = [localfiles-svc+0x18].** In 0x4a factory: `rbp=&svc+0x18` loaded at
   `d0812a` from `[rsp+0x40]` (saved `d078bd`); `[rbp]=r12` stored at `d083ed`;
   `rbp` reloaded from `[r12+0x160]` at `d084a4`. Finish: identify `r12` at `d083e9`
   (its AP = A's AP). Watch for reassignments (`d088ac/d088cc` reload `[rsp+0x40]`;
   `d08b31 rbp=&r15+0xd8`, `d08e8f rbp=&r12+0x328` are different scopes — verify by CFG).
2. **Disassemble `d0ad40`** (service-0x4a `+0x178`): find the constructed/returned
   object → its vptr = **r14's AP**. Then read AP `+0xa0/+0xa8` = the three
   callback receivers (`e9940c/e9959c/e99c54` packages).
3. **Trace `e99c54` invocation**: the `rsp+0xbe0` package is passed as `rdx` to
   `[r14+0xa0]` at `e95105`; the `+0xa0` impl invokes the package → `e99c54`
   runs with `(stack_slot, original)`. Identify `original`'s source object there.
4. **Resolve final `+0x140`**: with r14's AP bound, check whether its vtable even
   has `+0x140`, or whether the `fd381a state+0x40` object comes from the OTHER
   chain (`owner+0x428 -> e99d07 -> 0x1843bf8 -> P(0x1832be8) -> P+0x40`); do NOT
   conflate the two receivers.
5. Leftover bindings for completeness: H `r15`/`r12` final values into
   `owner+0x498/+0x4a0` (`[H.rsp+0x10]` flow: stored `e8c7f2/e8d299/e8d68a`, read
   `e8c9e7/e8d44b/e8d631`; `[H.rsp+0x368]` filled via `rdi`-out call at `e8c99e`).

## Already finished in parallel (committed here)

- `0x1624e22` sink = synchronous in-process state-bus action dispatcher
  (appended section at `analysis/timeline-action-sink-classification.md:4480`).
- Interval-source payload semantics: `analysis/smart-skip-interval-payload-v1.md`
  (ordered `(start_ms,end_ms)` exclusion intervals; Download-primary vs DSP-fallback;
  population writer/timing still open).
- External adblock verdict unchanged: `analysis/adblock-final-verdict.md`
  (mute-only via public MediaSession APIs; auto-skip rejected with evidence).

## Gotchas re-learned (do not repeat)

- Query VAs with FULL hex including leading `e` (`0xe991da`, not `0x991da`).
- `q.py show` decodes fresh from the address (not index-anchored); always anchor
  windows on index starts / eh_frame bounds.
- Raw byte scans for `E8` produce false hits inside immediates; validate call sites
  against the instruction index.
- Data VAs (`0x17f4000..`) read as zero in-file; ALWAYS resolve through the reloc map.
