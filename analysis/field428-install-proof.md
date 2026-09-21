# field428 installation source proof

## Result

The `owner+0x428` readiness object is fed directly from the source object's `+0x178` member in **both** sibling readiness-source implementations.

The two concrete source interfaces are:

- AP `0x1834728`, builder `+0x30 -> 0xece084`
- AP `0x1834418`, builder `+0x30 -> 0xee6db8`

Both builders prepare the same argument layout for `0xece57c`.

## Outer source: AP 0x1834728 / builder 0xece084

Before calling `0xece57c`:

- `r11 = source+0x178` at `0xece15e`
- the outgoing stack arguments are pushed in reverse order
- the push of `r11` is therefore SysV argument 12
- call site: `0xece198 -> 0xece57c`

```text
ece15e  lea r11,[r14+0x178]
...
ece183  push r14          ; arg14
ece185  push rbp          ; arg13
ece186  push r11          ; arg12 = source+0x178
ece188  push r10          ; arg11 = source+0x168
ece18a  push r15          ; arg10 = source+0x160
ece18c  push rax          ; arg9  = source+0xb0
ece18d  push r13          ; arg8
ece197  push rax          ; arg7
ece198  call ece57c
```

Inside the callee FDE, argument 12 is read from the callee's current `[rsp+0x1c8]`:

```text
ecedfd  mov rcx,[rsp+0x1c8]
ecee05  mov rax,[rcx+0x8]
ecee09  movups xmm0,[rcx]
ecee0c  movups [r14],xmm0
...
ecee52  mov [rbx+0x428],r14
```

Therefore the first 16 bytes copied into the erased/shared wrapper installed at `owner+0x428` come directly from `source+0x178`.

## Inner source: AP 0x1834418 / builder 0xee6db8

The sibling builder uses the same layout:

- `r11 = source+0x178` at `0xee6e83`
- `r11` is again pushed as argument 12
- call site: `0xee6ebd -> 0xece57c`

```text
ee6e83  lea r11,[r13+0x178]
...
ee6ea9  push r13          ; arg14
ee6eab  push rbx          ; arg13
ee6eac  push r11          ; arg12 = source+0x178
ee6eae  push r10          ; arg11 = source+0x168
ee6eb0  push rbp          ; arg10 = source+0x160
ee6eb1  push rax          ; arg9  = source+0xb0
ee6eb2  push r12          ; arg8
ee6ebc  push rax          ; arg7
ee6ebd  call ece57c
```

The same `ece57c` constructor copies argument 12 into the wrapper and installs that wrapper at `owner+0x428`.

## Corrected provenance

```text
readiness-source object
  +0x178 shared/erased payload
          |
          | builder +0x30
          | (ece084 or ee6db8)
          v
      ece57c
          |
          | copy first 16 bytes of arg12
          v
0x98-byte erased/shared wrapper
          |
          v
     owner+0x428
```

This replaces the weaker earlier statement that `owner+0x428` was merely associated with source `+0x178`: the value transfer is now proven by the calling convention and exact argument mapping.

## Remaining edge

The next unresolved step is to follow the copied payload through:

```text
owner+0x428 -> e99d07 -> fd4c04 -> source-inner+0x40 -> virtual +0x140
```

and identify the final concrete discriminator object/class used by `fd381a` to decide whether to export `"skip-ad"`.
