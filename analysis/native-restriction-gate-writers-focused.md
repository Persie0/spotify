# Focused restriction-owner gate writer trace

Scope: native text 0x10a0000..0x10b0000, the same code cluster as the 0x18b0-byte restriction owner.
Authoritative read sites: owner+0x598 and owner+0x470 gate ad_disallow insertion into skip-next.

## Constructor writes overlapping gate/object fields (base=rbp)

- none
## Constructor member-address handoffs near gates

## Region-wide direct writes to exact +0x470/+0x598

- none
## Gate-accessing functions that rebuild restrictions

### 0x10a9668..0x10a969c
- gate @0x10a966e: cmp    BYTE PTR [rdi+0x598],0x0
- gate @0x10a9677: cmp    BYTE PTR [rdi+0x470],0x0
- rebuild @0x10a9696: jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>

## All direct restriction-builder callers

### 0x10a645c..0x10a6464
     10a645f:	e9 00 00 00 00       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>

### 0x10a8aae..0x10a8da4
     10a8d97:	e9 c8 d6 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>

### 0x10a9668..0x10a969c
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>

### 0x10a9f9e..0x10a9fbe
     10a9fa2:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     10a9fb1:	e9 ae c4 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>

## Same-class identity anchors plus gate accesses

