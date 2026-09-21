# Registry facade argument provenance into 0x11ee608

0x11ee608 copies incoming rcx to rbx; that exact rbx is passed to b8f02e.
Therefore caller rcx is the proven registry-facade pointer.

## Direct call sites to 0x11ee608
count=0

## Backward rcx definitions in each caller
## Textual references to function address 0x11ee608
