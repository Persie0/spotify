# Exact service184 +0x28 -> Skip Ad execution-dependency stack proof

This report closes the ABI/dataflow edge between registry service 184 and the dependency whose virtual `+0x68` method is invoked for the native `"skip-ad"` branch.

## 1. Source value

At `0x11ee8f7` the caller reloads the service-184 object from its local stack slot and calls virtual `+0x28`:

```text
0x11ee8f7  rdi = [rsp+0x60]
0x11ee8fc  rax = [rdi]
0x11ee8ff  call [rax+0x28]
0x11ee902  [rsp+0x60] = rax
```

After `0x11ee902`, physical caller stack cell `S0+0x60` contains the execution dependency returned by service184 `+0x28`.

Here `S0` means the caller RSP immediately before the argument-push sequence beginning at `0x11eed70`.

## 2. Exact push mapping

The call to `0x11ef334` is preceded by 36 eight-byte pushes, for a total of `0x120` bytes.

Tracking each `[rsp+offset]` source against the changing RSP shows that physical cell `S0+0x60` is read by **push #34**:

```text
before push #34:
    current_rsp = S0 - 0x108

instruction:
    push QWORD PTR [rsp+0x168]

physical source:
    (S0 - 0x108) + 0x168 = S0 + 0x60
```

With 36 total pushes, push #36 becomes SysV stack argument 7, push #35 argument 8, and therefore **push #34 becomes argument 9**.

So:

```text
service184->vtable[+0x28]()
    -> caller S0+0x60
    -> push #34
    -> callee argument 9
```

## 3. Argument 9 inside 0x11ef334

The constructor prologue pushes six registers (`0x30` bytes) and reserves `0x608` bytes:

```text
entry_rsp = E
working_rsp = E - 0x638
```

SysV argument 9 is at entry `E+0x18`, therefore from working RSP it is:

```text
(E + 0x18) - (E - 0x638) = 0x650
```

This matches the constructor exactly. During creation of the large dispatcher object:

```text
0x11f4142  install secondary address point 0x185bf88 at outer+0x18
0x11f414d  rax = [rsp+0x650]      ; argument 9
0x11f4155  [outer+0x20] = rax
```

Thus service184 `+0x28` return becomes **outer dispatcher +0x20**.

## 4. Why the secondary interface sees it as this+8

The secondary interface address point `0x185bf88` is installed at outer `+0x18`.

Methods on that secondary interface receive:

```text
this = outer + 0x18
```

Therefore:

```text
[this+0x8] = outer+0x20
```

which is exactly the argument-9/service184 dependency above.

## 5. Exact Skip Ad execution use

The secondary dispatcher method at `0x1204218` contains the exact `"skip-ad"` discriminator. On a match:

```text
0x12044eb  rdi = [rbp+0x8]
0x12044ef  rax = [rdi]
0x12044f2  call [rax+0x68]
```

Here `rbp` is the secondary-interface `this`, so `[rbp+8]` is outer `+0x20`.

The proven chain is therefore:

```text
registry service 184
    -> virtual +0x28()
    -> caller physical stack S0+0x60
    -> push #34 of 36
    -> SysV argument 9 to 0x11ef334
    -> constructor [rsp+0x650]
    -> outer dispatcher +0x20
    -> secondary interface [this+0x8]
    -> "skip-ad" branch
    -> dependency virtual +0x68()
```

This closes the structural identity/dataflow edge. The remaining question is the concrete vtable and side effect of the execution dependency's `+0x68` implementation.

Evidence:
- `analysis/service184-return-consumers.md`
- `analysis/dispatcher-arg9-this8.md`
- `docs/15-skip-ad-signal.md`
