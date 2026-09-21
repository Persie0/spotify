# Service184 candidate ABI classification v2

Observed service184 call ABI:
- +0x28: this in rdi, no explicit args, returns pointer in rax
- +0x30: this in rdi, no explicit args, returns pointer in rax
- +0x38: sret/output in rdi, this in rsi
- object returned by +0x28 is later dereferenced as polymorphic and invoked at +0x68

## Candidate 0x18228d8
### slot +0x20 -> 0xd1710c
- FDE=(13725964, 13726226) nins=73 regs=['rcx', 'rdi', 'rsi']
- calls:
  - 0xd1715b: call   c4fbf2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cb92>
  - 0xd17186: call   QWORD PTR [rax+0x10]
  - 0xd1718f: call   c511ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e15a>
  - 0xd17197: call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  - 0xd171ac: call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
  - 0xd171e5: call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  - 0xd171ed: call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
  - 0xd17208: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  - 0xd1720d: call   17efab0 <__stack_chk_fail@plt>
- first reads:
  - 0xd17142: mov    rax,QWORD PTR [rbx+0x220]
  - 0xd17149: sub    rax,QWORD PTR [rbx+0x218]
  - 0xd17160: mov    r15,QWORD PTR [rbx+0x218]
  - 0xd17167: mov    r12,QWORD PTR [rbx+0x220]
  - 0xd17173: lea    rbx,[rsp+0x28]
  - 0xd1717b: mov    rsi,QWORD PTR [r15]
  - 0xd1717e: mov    rax,QWORD PTR [rsi]
  - 0xd171a8: mov    rbx,QWORD PTR [rdi+0x18]
  - 0xd171ba: cmp    rax,QWORD PTR [rsp+0x80]
  - 0xd171e0: lea    rdi,[rsp+0x28]
  - 0xd171fb: cmp    rax,QWORD PTR [rsp+0x80]
- first writes:
  - 0xd17126: mov    QWORD PTR [rsp+0x80],rax
  - 0xd17134: movaps XMMWORD PTR [rdi+0x10],xmm0
  - 0xd17138: movaps XMMWORD PTR [rdi],xmm0
  - 0xd1713b: mov    DWORD PTR [rdi+0x20],0x3f800000
  - 0xd17186: call   QWORD PTR [rax+0x10]
- tail:
    d171ea:	48 89 e7             	mov    rdi,rsp
    d171ed:	e8 26 bc ef ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
    d171f2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
    d171f9:	00 00 
    d171fb:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
    d17202:	00 
    d17203:	75 08                	jne    d1720d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2641ad>
    d17205:	48 89 df             	mov    rdi,rbx
    d17208:	e8 c3 8a d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
    d1720d:	e8 9e 88 ad 00       	call   17efab0 <__stack_chk_fail@plt>

### slot +0x28 -> 0xd17212
- FDE=(13726226, 13726234) nins=2 regs=['rdi']
- calls:
- first reads:
  - 0xd17212: lea    rax,[rdi+0x218]
- first writes:
- tail:
    d17212:	48 8d 87 18 02 00 00 	lea    rax,[rdi+0x218]
    d17219:	c3                   	ret

### slot +0x30 -> 0xd1721a
- FDE=(13726234, 13726305) nins=20 regs=['r8', 'rcx', 'rdi', 'rsi']
- calls:
- first reads:
  - 0xd1721a: mov    rax,QWORD PTR [rdi+0x238]
  - 0xd17221: mov    dl,BYTE PTR [rdi+0x240]
  - 0xd17227: mov    rcx,QWORD PTR [rdi+0x218]
  - 0xd1722e: mov    rsi,QWORD PTR [rdi+0x220]
  - 0xd1723d: mov    r8,QWORD PTR [rcx+0x10]
- first writes:
- tail:
    d17244:	49 0f 4e c0          	cmovle rax,r8
    d17248:	84 d2                	test   dl,dl
    d1724a:	49 0f 44 c0          	cmove  rax,r8
    d1724e:	0f b6 d2             	movzx  edx,dl
    d17251:	80 fa 02             	cmp    dl,0x2
    d17254:	0f 42 d7             	cmovb  edx,edi
    d17257:	48 83 c1 30          	add    rcx,0x30
    d1725b:	48 39 f1             	cmp    rcx,rsi
    d1725e:	75 dd                	jne    d1723d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2641dd>
    d17260:	c3                   	ret

### slot +0x38 -> 0xd17262
- FDE=(13726306, 13726538) nins=68 regs=['rcx', 'rdi', 'rdx', 'rsi']
- calls:
  - 0xd172ca: call   d2383a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2707da>
  - 0xd172d4: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  - 0xd17320: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  - 0xd17338: call   ab7556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x44f6>
  - 0xd17340: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  - 0xd17345: call   17efab0 <__stack_chk_fail@plt>
- first reads:
  - 0xd1728a: mov    rcx,QWORD PTR [rsi+0x218]
  - 0xd172ad: mov    rax,QWORD PTR [rcx+rdx*1+0x8]
  - 0xd172b2: movups xmm0,XMMWORD PTR [rcx+rdx*1]
  - 0xd172cf: mov    rdi,QWORD PTR [rsp+0x8]
  - 0xd172db: mov    rcx,QWORD PTR [r14+0x218]
  - 0xd172e2: mov    rax,QWORD PTR [r14+0x220]
  - 0xd17301: cmp    rax,QWORD PTR [rsp+0x18]
  - 0xd1731b: mov    rdi,QWORD PTR [rsp+0x8]
  - 0xd1732e: cmp    rax,QWORD PTR [rsp+0x18]
- first writes:
  - 0xd1727a: mov    QWORD PTR [rsp+0x18],rax
  - 0xd17282: and    QWORD PTR [rdi+0x10],0x0
  - 0xd17287: movups XMMWORD PTR [rdi],xmm0
  - 0xd17291: cmp    QWORD PTR [rsi+0x220],rcx
  - 0xd172b6: movaps XMMWORD PTR [rsp],xmm0
  - 0xd172bf: lock inc QWORD PTR [rax+0x8]
- tail:
    d17320:	e8 61 71 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
    d17325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
    d1732c:	00 00 
    d1732e:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
    d17333:	75 10                	jne    d17345 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2642e5>
    d17335:	48 89 df             	mov    rdi,rbx
    d17338:	e8 19 02 da ff       	call   ab7556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x44f6>
    d1733d:	4c 89 f7             	mov    rdi,r14
    d17340:	e8 8b 89 d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
    d17345:	e8 66 87 ad 00       	call   17efab0 <__stack_chk_fail@plt>


## Candidate 0x1821448
### slot +0x20 -> 0xcf95be
- FDE=(13604286, 13608751) nins=1174 regs=['r8', 'r9', 'rcx', 'rdi', 'rdx', 'rsi']
- calls:
  - 0xcf960d: call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
  - 0xcf9628: call   QWORD PTR [rax+0x10]
  - 0xcf9699: call   b7746c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc440c>
  - 0xcf9724: call   QWORD PTR [rax+0x28]
  - 0xcf978f: call   QWORD PTR [rax+0x18]
  - 0xcf979d: call   QWORD PTR [rax+0x28]
  - 0xcf97b4: call   cfa816 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2477b6>
  - 0xcf97db: call   aa8be4 <JNI_OnUnload@@Base+0x304b1>
  - 0xcf97e3: call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
  - 0xcf97ed: call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
  - 0xcf9806: call   QWORD PTR [rax+0xc8]
  - 0xcf9811: call   bc7d7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x114d1a>
- first reads:
  - 0xcf95f9: lea    rdi,[r14+0x10]
  - 0xcf9612: lea    rax,[r14+0x120]
  - 0xcf961e: mov    rdi,QWORD PTR [r14+0x120]
  - 0xcf9625: mov    rax,QWORD PTR [rdi]
  - 0xcf963d: mov    rax,QWORD PTR [rbx]
  - 0xcf9640: mov    rax,QWORD PTR [rax+0x20]
  - 0xcf964b: mov    rax,QWORD PTR [rbx]
  - 0xcf9657: mov    r15,QWORD PTR [rax+0x20]
  - 0xcf9660: lea    rbx,[r14+0xb8]
  - 0xcf966c: mov    r13,QWORD PTR [rax+0x18]
  - 0xcf9670: lea    rbp,[r15*4+0x0]
  - 0xcf967b: lea    r12,[rsp+0x178]
  - 0xcf9683: movss  xmm0,DWORD PTR [r13+r14*1+0x0]
  - 0xcf96a7: mov    r14,QWORD PTR [rsp+0x40]
  - 0xcf96ac: lea    r13,[r14+0xa8]
  - 0xcf96c4: mov    r12,QWORD PTR [r14+0x80]
- first writes:
  - 0xcf95db: mov    QWORD PTR [rsp+0x1a0],rax
  - 0xcf95e3: cmp    QWORD PTR [rsi],0x0
  - 0xcf95f0: and    QWORD PTR [rsp+0x80],0x0
  - 0xcf95fd: mov    QWORD PTR [rsp+0x140],rdi
  - 0xcf9605: mov    BYTE PTR [rsp+0x148],0x1
  - 0xcf9619: mov    QWORD PTR [rsp+0x58],rax
  - 0xcf9628: call   QWORD PTR [rax+0x10]
  - 0xcf962b: mov    QWORD PTR [r14+0x138],rax
  - 0xcf9635: movups XMMWORD PTR [r14+0x140],xmm0
  - 0xcf9644: mov    QWORD PTR [r14+0x148],rax
  - 0xcf964e: and    QWORD PTR [rbx],0x0
  - 0xcf9652: mov    QWORD PTR [rsp+0x70],rax
  - 0xcf965b: mov    QWORD PTR [rsp+0x40],r14
  - 0xcf968a: movss  DWORD PTR [rsp+0x178],xmm0
  - 0xcf96b8: div    QWORD PTR [r14+0xb0]
  - 0xcf96d5: mov    QWORD PTR [r14+0x100],rax
- tail:
    cfa709:	00 
    cfa70a:	e8 cd e4 da ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
    cfa70f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
    cfa716:	00 00 
    cfa718:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
    cfa71f:	00 
    cfa720:	75 08                	jne    cfa72a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2476ca>
    cfa722:	4c 89 f7             	mov    rdi,r14
    cfa725:	e8 a6 55 d7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
    cfa72a:	e8 81 53 af 00       	call   17efab0 <__stack_chk_fail@plt>

### slot +0x28 -> 0xb7d2ca
- FDE=(12047050, 12047060) nins=3 regs=['rdi']
- calls:
- first reads:
  - 0xb7d2ca: mov    rdi,QWORD PTR [rdi+0x8]
  - 0xb7d2ce: mov    rax,QWORD PTR [rdi]
- first writes:
  - 0xb7d2d1: jmp    QWORD PTR [rax+0x30]
- tail:
    b7d2ca:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
    b7d2ce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
    b7d2d1:	ff 60 30             	jmp    QWORD PTR [rax+0x30]

### slot +0x30 -> 0xbd7f6a
- FDE=(12418922, 12418932) nins=3 regs=['rdi']
- calls:
- first reads:
  - 0xbd7f6a: mov    rdi,QWORD PTR [rdi+0x8]
  - 0xbd7f6e: mov    rax,QWORD PTR [rdi]
- first writes:
  - 0xbd7f71: jmp    QWORD PTR [rax+0x38]
- tail:
    bd7f6a:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
    bd7f6e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
    bd7f71:	ff 60 38             	jmp    QWORD PTR [rax+0x38]

### slot +0x38 -> 0xcfa730
- FDE=(13608752, 13608949) nins=50 regs=['rdi', 'rsi']
- calls:
  - 0xcfa765: call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
  - 0xcfa774: call   QWORD PTR [rax+0x98]
  - 0xcfa78e: call   b70718 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbd6b8>
  - 0xcfa79f: call   aabe30 <JNI_OnUnload@@Base+0x336fd>
  - 0xcfa7ae: call   QWORD PTR [rax+0x40]
  - 0xcfa7d3: call   aabe30 <JNI_OnUnload@@Base+0x336fd>
  - 0xcfa7eb: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  - 0xcfa7f0: call   17efab0 <__stack_chk_fail@plt>
- first reads:
  - 0xcfa74d: mov    rax,QWORD PTR [rsi]
  - 0xcfa76a: mov    rdi,QWORD PTR [r14+0xf0]
  - 0xcfa771: mov    rax,QWORD PTR [rdi]
  - 0xcfa784: mov    r15,QWORD PTR [rbx]
  - 0xcfa787: lea    rdi,[r14+0xb8]
  - 0xcfa79a: lea    rdi,[rsp+0x8]
  - 0xcfa7a4: mov    rdi,QWORD PTR [r14+0x8]
  - 0xcfa7a8: mov    rax,QWORD PTR [rdi]
  - 0xcfa7ba: cmp    rax,QWORD PTR [rsp+0x18]
  - 0xcfa7ce: lea    rdi,[rsp+0x8]
  - 0xcfa7e1: cmp    rax,QWORD PTR [rsp+0x18]
- first writes:
  - 0xcfa748: mov    QWORD PTR [rsp+0x18],rax
  - 0xcfa750: mov    QWORD PTR [rdi+0x100],rax
  - 0xcfa75b: mov    QWORD PTR [rsp+0x8],rdi
  - 0xcfa760: mov    BYTE PTR [rsp+0x10],0x1
  - 0xcfa774: call   QWORD PTR [rax+0x98]
  - 0xcfa77a: cmp    BYTE PTR [r14+0xe8],0x0
  - 0xcfa793: mov    QWORD PTR [r14+0xa8],r15
  - 0xcfa7ae: call   QWORD PTR [rax+0x40]
- tail:
    cfa7cb:	48 89 c3             	mov    rbx,rax
    cfa7ce:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
    cfa7d3:	e8 58 16 db ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
    cfa7d8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
    cfa7df:	00 00 
    cfa7e1:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
    cfa7e6:	75 08                	jne    cfa7f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x247790>
    cfa7e8:	48 89 df             	mov    rdi,rbx
    cfa7eb:	e8 e0 54 d7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
    cfa7f0:	e8 bb 52 af 00       	call   17efab0 <__stack_chk_fail@plt>


## Candidate 0x1822988
### slot +0x20 -> 0xd1a2b6
- FDE=(13738678, 13739072) nins=99 regs=['rcx', 'rdi', 'rdx', 'rsi']
- calls:
  - 0xd1a2e2: call   163d3b2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38520>
  - 0xd1a308: call   QWORD PTR [rax+0xc0]
  - 0xd1a34a: call   QWORD PTR [rax+0xf0]
  - 0xd1a36b: call   d1618a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26312a>
  - 0xd1a373: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  - 0xd1a3aa: call   163d660 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x387ce>
  - 0xd1a3b4: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  - 0xd1a3bc: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  - 0xd1a3cb: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  - 0xd1a3f2: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  - 0xd1a401: call   d1618a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26312a>
  - 0xd1a409: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- first reads:
  - 0xd1a2d3: mov    rsi,QWORD PTR [rdi+0x1b0]
  - 0xd1a2da: lea    rbx,[rsp+0x10]
  - 0xd1a2e7: mov    r15,QWORD PTR [rbx]
  - 0xd1a2f3: mov    rbx,QWORD PTR [rsp+0x18]
  - 0xd1a302: mov    rax,QWORD PTR [r15]
  - 0xd1a30e: mov    rcx,QWORD PTR [rax]
  - 0xd1a311: cmp    rcx,QWORD PTR [rax+0x8]
  - 0xd1a325: lea    rsi,[rsp+0x20]
  - 0xd1a32e: lea    rax,[rip+0xffffffffffcbdaab]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
  - 0xd1a339: lea    rax,[rip+0x4572]        # d1e8b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26b852>
  - 0xd1a344: mov    rax,QWORD PTR [r15]
  - 0xd1a363: lea    r15,[rsp+0x20]
  - 0xd1a380: mov    rax,QWORD PTR [r14+0x1b0]
  - 0xd1a387: movaps xmm0,XMMWORD PTR [rsp]
  - 0xd1a399: mov    rax,QWORD PTR [rax]
  - 0xd1a39c: mov    rdi,QWORD PTR [rax+0x90]
- first writes:
  - 0xd1a2ce: mov    QWORD PTR [rsp+0x48],rax
  - 0xd1a2fd: lock inc QWORD PTR [rbx+0x8]
  - 0xd1a308: call   QWORD PTR [rax+0xc0]
  - 0xd1a320: lock inc QWORD PTR [rbx+0x8]
  - 0xd1a32a: and    QWORD PTR [rsi],0x0
  - 0xd1a335: mov    QWORD PTR [rsi+0x10],rax
  - 0xd1a340: mov    QWORD PTR [rsi+0x18],rax
  - 0xd1a34a: call   QWORD PTR [rax+0xf0]
  - 0xd1a35e: movdqa XMMWORD PTR [rsp],xmm1
  - 0xd1a378: mov    BYTE PTR [r14+0x412],0x1
  - 0xd1a38b: movaps XMMWORD PTR [r15],xmm0
  - 0xd1a394: lock inc QWORD PTR [rbx+0x8]
- tail:
    d1a416:	e8 6b 40 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
    d1a41b:	48 89 df             	mov    rdi,rbx
    d1a41e:	e8 63 40 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
    d1a423:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
    d1a42a:	00 00 
    d1a42c:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
    d1a431:	75 08                	jne    d1a43b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2673db>
    d1a433:	4c 89 f7             	mov    rdi,r14
    d1a436:	e8 95 58 d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
    d1a43b:	e8 70 56 ad 00       	call   17efab0 <__stack_chk_fail@plt>

### slot +0x28 -> 0xd1a440
- FDE=(13739072, 13739108) nins=9 regs=['rdi']
- calls:
- first reads:
  - 0xd1a440: mov    rax,QWORD PTR [rdi+0x408]
  - 0xd1a447: mov    rdi,QWORD PTR [rax+0x20]
- first writes:
  - 0xd1a450: cmp    BYTE PTR [rdi+0x98],0x0
  - 0xd1a459: cmp    BYTE PTR [rdi+0x15],0x0
- tail:
    d1a440:	48 8b 87 08 04 00 00 	mov    rax,QWORD PTR [rdi+0x408]
    d1a447:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
    d1a44b:	48 85 ff             	test   rdi,rdi
    d1a44e:	74 13                	je     d1a463 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267403>
    d1a450:	80 bf 98 00 00 00 00 	cmp    BYTE PTR [rdi+0x98],0x0
    d1a457:	74 0a                	je     d1a463 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267403>
    d1a459:	80 7f 15 00          	cmp    BYTE PTR [rdi+0x15],0x0
    d1a45d:	0f 85 91 a5 00 00    	jne    d249f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271994>
    d1a463:	c3                   	ret

### slot +0x30 -> 0xaf6576
- FDE=(11494774, 11494779) nins=2 regs=['rdi']
- calls:
- first reads:
  - 0xaf6576: lea    rax,[rdi+0x8]
- first writes:
- tail:
    af6576:	48 8d 47 08          	lea    rax,[rdi+0x8]
    af657a:	c3                   	ret

### slot +0x38 -> 0xd1a464
- FDE=(13739108, 13741320) nins=568 regs=['r8', 'r9', 'rcx', 'rdi', 'rdx', 'rsi']
- calls:
  - 0xd1a4b1: call   d1d3dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26a37c>
  - 0xd1a522: call   a79a7e <JNI_OnUnload@@Base+0x134b>
  - 0xd1a535: call   d29675 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x276615>
  - 0xd1a53d: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  - 0xd1a566: call   aa7c9c <JNI_OnUnload@@Base+0x2f569>
  - 0xd1a579: call   ab667e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x361e>
  - 0xd1a589: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  - 0xd1a59e: call   ab67d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3770>
  - 0xd1a5ab: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  - 0xd1a5d8: call   a7b836 <JNI_OnUnload@@Base+0x3103>
  - 0xd1a616: call   c6e6e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bb684>
  - 0xd1a672: call   c6e736 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bb6d6>
- first reads:
  - 0xd1a496: lea    rdi,[rsp+0xe0]
  - 0xd1a4a6: mov    rsi,QWORD PTR [rsi+0x8]
  - 0xd1a4aa: sub    rsi,QWORD PTR [rbx]
  - 0xd1a4b6: mov    rcx,QWORD PTR [rbx+0x8]
  - 0xd1a4ba: sub    rcx,QWORD PTR [rbx]
  - 0xd1a4f4: lea    r14,[rsp+0x160]
  - 0xd1a513: mov    rax,QWORD PTR [rbx]
  - 0xd1a51b: mov    rsi,QWORD PTR [rax+rcx*8]
  - 0xd1a527: lea    r15,[rsp+0xc8]
  - 0xd1a542: mov    rax,QWORD PTR [rsp+0x48]
  - 0xd1a547: mov    rax,QWORD PTR [rax]
  - 0xd1a54a: mov    rcx,QWORD PTR [rsp+0x30]
  - 0xd1a54f: mov    rax,QWORD PTR [rax+rcx*8]
  - 0xd1a558: lea    r12,[rsp+0xb0]
  - 0xd1a56b: lea    r15,[rsp+0x80]
  - 0xd1a57e: lea    rdi,[rsp+0x98]
- first writes:
  - 0xd1a475: mov    QWORD PTR [rsp+0x48],rdx
  - 0xd1a47d: mov    QWORD PTR [rsp+0x10],rdi
  - 0xd1a48b: mov    QWORD PTR [rsp+0x190],rax
  - 0xd1a49e: movaps XMMWORD PTR [rdi],xmm0
  - 0xd1a4a1: and    QWORD PTR [rdi+0x10],0x0
  - 0xd1a4c3: mov    DWORD PTR [rsp+0x18],0x0
  - 0xd1a4d0: mov    QWORD PTR [rsp+0x28],rax
  - 0xd1a4d7: mov    DWORD PTR [rsp+0x1c],0x0
  - 0xd1a4e2: mov    QWORD PTR [rsp+0x40],rcx
  - 0xd1a4ef: mov    QWORD PTR [rsp+0x28],rax
  - 0xd1a4fc: mov    DWORD PTR [rsp+0x18],0x0
  - 0xd1a504: mov    DWORD PTR [rsp+0x1c],0x0
  - 0xd1a50e: mov    QWORD PTR [rsp+0x38],rbx
  - 0xd1a516: mov    QWORD PTR [rsp+0x30],rcx
  - 0xd1a553: mov    QWORD PTR [rsp+0x20],rax
  - 0xd1a5bf: movaps XMMWORD PTR [rsp+0x110],xmm0
- tail:
    d1ace2:	00 
    d1ace3:	e8 3a 2e da ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
    d1ace8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
    d1acef:	00 00 
    d1acf1:	48 3b 84 24 90 01 00 	cmp    rax,QWORD PTR [rsp+0x190]
    d1acf8:	00 
    d1acf9:	75 08                	jne    d1ad03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267ca3>
    d1acfb:	4c 89 ff             	mov    rdi,r15
    d1acfe:	e8 cd 4f d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
    d1ad03:	e8 a8 4d ad 00       	call   17efab0 <__stack_chk_fail@plt>


## Candidate 0x181f788
### slot +0x20 -> 0xcc4eba
- FDE=(13389498, 13389546) nins=16 regs=['rdi', 'rdx', 'rsi']
- calls:
  - 0xcc4ed4: call   QWORD PTR [rax+0x168]
- first reads:
  - 0xcc4ec5: mov    rdi,QWORD PTR [rsi+0x5e0]
  - 0xcc4ed1: mov    rax,QWORD PTR [rdi]
- first writes:
  - 0xcc4ec0: mov    BYTE PTR [rdi],al
  - 0xcc4ec2: mov    BYTE PTR [rdi+0x10],al
  - 0xcc4ed4: call   QWORD PTR [rax+0x168]
  - 0xcc4eda: mov    QWORD PTR [rbx],rax
  - 0xcc4edd: mov    QWORD PTR [rbx+0x8],rdx
  - 0xcc4ee1: mov    BYTE PTR [rbx+0x10],0x1
- tail:
    cc4ecc:	48 85 ff             	test   rdi,rdi
    cc4ecf:	74 14                	je     cc4ee5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211e85>
    cc4ed1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
    cc4ed4:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
    cc4eda:	48 89 03             	mov    QWORD PTR [rbx],rax
    cc4edd:	48 89 53 08          	mov    QWORD PTR [rbx+0x8],rdx
    cc4ee1:	c6 43 10 01          	mov    BYTE PTR [rbx+0x10],0x1
    cc4ee5:	48 89 d8             	mov    rax,rbx
    cc4ee8:	5b                   	pop    rbx
    cc4ee9:	c3                   	ret

### slot +0x28 -> 0xcc4eea
- FDE=(13389546, 13389554) nins=2 regs=['rdi']
- calls:
- first reads:
  - 0xcc4eea: mov    rax,QWORD PTR [rdi+0x5e0]
- first writes:
- tail:
    cc4eea:	48 8b 87 e0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5e0]
    cc4ef1:	c3                   	ret

### slot +0x30 -> 0xcc4eea
- FDE=(13389546, 13389554) nins=2 regs=['rdi']
- calls:
- first reads:
  - 0xcc4eea: mov    rax,QWORD PTR [rdi+0x5e0]
- first writes:
- tail:
    cc4eea:	48 8b 87 e0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5e0]
    cc4ef1:	c3                   	ret

### slot +0x38 -> 0xcc4ef2
- FDE=(13389554, 13389787) nins=59 regs=['rdi', 'rdx', 'rsi']
- calls:
  - 0xcc4f40: call   QWORD PTR [rax+0x150]
  - 0xcc4f4e: call   cc1ada <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20ea7a>
  - 0xcc4f62: call   cc5836 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2127d6>
  - 0xcc4f6c: call   bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>
  - 0xcc4f79: call   b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
  - 0xcc4fa4: call   bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>
  - 0xcc4fb6: call   b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
  - 0xcc4fd1: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  - 0xcc4fd6: call   17efab0 <__stack_chk_fail@plt>
- first reads:
  - 0xcc4f0d: mov    eax,DWORD PTR [rsi+0x8]
  - 0xcc4f16: mov    rax,QWORD PTR [rsi]
  - 0xcc4f20: mov    rsi,QWORD PTR [rdi+0x5e0]
  - 0xcc4f2f: mov    rax,QWORD PTR [rsi]
  - 0xcc4f32: lea    r14,[rsp+0x170]
  - 0xcc4f46: lea    rdi,[rsp+0x8]
  - 0xcc4f5a: lea    rsi,[rsp+0x8]
  - 0xcc4f67: lea    rdi,[rsp+0x8]
  - 0xcc4f71: lea    rdi,[rsp+0x170]
  - 0xcc4f87: cmp    rax,QWORD PTR [rsp+0x2d0]
  - 0xcc4f9f: lea    rdi,[rsp+0x8]
  - 0xcc4fae: lea    rdi,[rsp+0x170]
  - 0xcc4fc4: cmp    rax,QWORD PTR [rsp+0x2d0]
- first writes:
  - 0xcc4f05: mov    QWORD PTR [rsp+0x2d0],rax
  - 0xcc4f10: mov    DWORD PTR [rdi+0x6a0],eax
  - 0xcc4f19: mov    QWORD PTR [rdi+0x698],rax
  - 0xcc4f40: call   QWORD PTR [rax+0x150]
- tail:
    cc4fb5:	00 
    cc4fb6:	e8 2b 51 ec ff       	call   b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
    cc4fbb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
    cc4fc2:	00 00 
    cc4fc4:	48 3b 84 24 d0 02 00 	cmp    rax,QWORD PTR [rsp+0x2d0]
    cc4fcb:	00 
    cc4fcc:	75 08                	jne    cc4fd6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211f76>
    cc4fce:	48 89 df             	mov    rdi,rbx
    cc4fd1:	e8 fa ac da ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
    cc4fd6:	e8 d5 aa b2 00       	call   17efab0 <__stack_chk_fail@plt>


## Exact known call-site ABI examples
### around 0xb8ec45; FDE=(12119050, 12120109)
      b8ec2d:	00 00 
      b8ec2f:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      b8ec36:	00 
      b8ec37:	48 89 cf             	mov    rdi,rcx
      b8ec3a:	e8 03 93 ff ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
      b8ec3f:	48 89 c3             	mov    rbx,rax
      b8ec42:	4c 89 f7             	mov    rdi,r14
      b8ec45:	e8 e4 03 00 00       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      b8ec4a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      b8ec4d:	48 89 c7             	mov    rdi,rax
      b8ec50:	ff 51 28             	call   QWORD PTR [rcx+0x28]
      b8ec53:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      b8ec58:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      b8ec5c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b8ec60:	49 8b 6f 60          	mov    rbp,QWORD PTR [r15+0x60]
      b8ec64:	4d 8b af 80 00 00 00 	mov    r13,QWORD PTR [r15+0x80]
      b8ec6b:	4d 8b 77 68          	mov    r14,QWORD PTR [r15+0x68]
      b8ec6f:	48 8d 35 8a 91 7a ff 	lea    rsi,[rip+0xffffffffff7a918a]        # 337e00 <_ZTSSt12bad_any_cast@@Base-0x583c8>
      b8ec76:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      b8ec7b:	4c 89 ff             	mov    rdi,r15
      b8ec7e:	e8 fb ad ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b8ec83:	49 8b 06             	mov    rax,QWORD PTR [r14]

### around 0xc7d490; FDE=(13096030, 13096412)
      c7d47e:	00 00 
      c7d480:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      c7d485:	48 89 cf             	mov    rdi,rcx
      c7d488:	e8 4f 01 00 00       	call   c7d5dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ca57c>
      c7d48d:	4c 89 ff             	mov    rdi,r15
      c7d490:	e8 99 1b f1 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      c7d495:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      c7d498:	48 89 c7             	mov    rdi,rax
      c7d49b:	ff 51 30             	call   QWORD PTR [rcx+0x30]
      c7d49e:	49 89 c4             	mov    r12,rax
      c7d4a1:	4c 89 ff             	mov    rdi,r15
      c7d4a4:	e8 f7 5e fd ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
      c7d4a9:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      c7d4ac:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      c7d4b1:	48 89 c6             	mov    rsi,rax
      c7d4b4:	ff 51 48             	call   QWORD PTR [rcx+0x48]
      c7d4b7:	4d 8b ae 80 00 00 00 	mov    r13,QWORD PTR [r14+0x80]
      c7d4be:	4d 8b be 38 01 00 00 	mov    r15,QWORD PTR [r14+0x138]
      c7d4c5:	6a 78                	push   0x78
      c7d4c7:	5f                   	pop    rdi
      c7d4c8:	e8 33 0a b7 00       	call   17edf00 <_Znwm@plt>
      c7d4cd:	49 89 c6             	mov    r14,rax
      c7d4d0:	48 8d 68 10          	lea    rbp,[rax+0x10]

### around 0xe8c9d1; FDE=(15255132, 15263896)
      e8c9bb:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      e8c9c2:	00 
      e8c9c3:	4c 89 fe             	mov    rsi,r15
      e8c9c6:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e8c9c9:	48 8b 6c 24 50       	mov    rbp,QWORD PTR [rsp+0x50]
      e8c9ce:	4c 89 ef             	mov    rdi,r13
      e8c9d1:	e8 58 26 d0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      e8c9d6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8c9d9:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
      e8c9e0:	00 
      e8c9e1:	48 89 c6             	mov    rsi,rax
      e8c9e4:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      e8c9e7:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      e8c9ec:	48 8b 75 58          	mov    rsi,QWORD PTR [rbp+0x58]
      e8c9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e8c9f3:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
      e8c9fa:	00 
      e8c9fb:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8c9fe:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
      e8ca02:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
      e8ca09:	00 
      e8ca0a:	48 8b 45 40          	mov    rax,QWORD PTR [rbp+0x40]
      e8ca0e:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax

### around 0x10885e3; FDE=(17335610, 17338257)
     10885cc:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     10885cf:	48 89 c5             	mov    rbp,rax
     10885d2:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10885d5:	4c 89 f7             	mov    rdi,r14
     10885d8:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10885db:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10885e0:	48 89 df             	mov    rdi,rbx
     10885e3:	e8 46 6a b0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     10885e8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     10885eb:	48 89 c7             	mov    rdi,rax
     10885ee:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     10885f1:	49 89 c6             	mov    r14,rax
     10885f4:	6a 28                	push   0x28
     10885f6:	5f                   	pop    rdi
     10885f7:	e8 04 59 76 00       	call   17edf00 <_Znwm@plt>
     10885fc:	48 89 c3             	mov    rbx,rax
     10885ff:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
     1088603:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     1088608:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
     108860c:	48 85 c0             	test   rax,rax
     108860f:	74 05                	je     1088616 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24fa2c>
     1088611:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1088616:	41 0f 28 87 40 01 00 	movaps xmm0,XMMWORD PTR [r15+0x140]
     108861d:	00 
     108861e:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     1088623:	49 8b 87 48 01 00 00 	mov    rax,QWORD PTR [r15+0x148]

### around 0x11ee6b0; FDE=(18802184, 18804775)
     11ee69b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ee6a0:	48 89 df             	mov    rdi,rbx
     11ee6a3:	e8 d2 30 a2 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
     11ee6a8:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11ee6ad:	48 89 df             	mov    rdi,rbx
     11ee6b0:	e8 79 09 9a ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     11ee6b5:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11ee6ba:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee6be:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee6c2:	ba b8 00 00 00       	mov    edx,0xb8
     11ee6c7:	e8 12 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
     11ee6d6:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     11ee6db:	e8 ba 85 bf ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
     11ee6e0:	48 89 df             	mov    rdi,rbx
     11ee6e3:	e8 2c 99 99 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
     11ee6e8:	49 89 c4             	mov    r12,rax
     11ee6eb:	48 89 df             	mov    rdi,rbx
     11ee6ee:	e8 43 86 ac ff       	call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>

### around 0x1442026; FDE=(21241846, 21243183)
     1442012:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1442019:	00 00 
     144201b:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
     1442022:	00 
     1442023:	48 89 cf             	mov    rdi,rcx
     1442026:	e8 03 d0 74 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     144202b:	49 89 c7             	mov    r15,rax
     144202e:	4c 89 f7             	mov    rdi,r14
     1442031:	e8 e6 a2 83 ff       	call   c7c31c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c92bc>
     1442036:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     144203a:	4c 89 f7             	mov    rdi,r14
     144203d:	e8 d2 5f 74 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
     1442042:	49 89 c4             	mov    r12,rax
     1442045:	4c 89 f7             	mov    rdi,r14
     1442048:	e8 f5 5e 74 ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
     144204d:	49 89 c5             	mov    r13,rax
     1442050:	4c 89 f7             	mov    rdi,r14
     1442053:	e8 64 39 c3 ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
     1442058:	48 89 c5             	mov    rbp,rax
     144205b:	49 8b 07             	mov    rax,QWORD PTR [r15]
     144205e:	4c 89 ff             	mov    rdi,r15
     1442061:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1442064:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax

## Returned-dependency +0x68 compatibility
### owner 0x18228d8; getter 0xd17212; dependency offset 0x218
      d17212:	48 8d 87 18 02 00 00 	lea    rax,[rdi+0x218]
      d17219:	c3                   	ret

### owner 0x181f788; getter 0xcc4eea; dependency offset 0x5e0
      cc4eea:	48 8b 87 e0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5e0]
      cc4ef1:	c3                   	ret

