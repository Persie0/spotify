# Restrictions original object builder trace v13

Focus: find constructors/materializers that put an AP into `[original]`, plus fields `[original+0x8]` and `[original+0x10]` consumed by `e99c54`. Static provenance only.

## Candidate AP bases inspected

```text
0x1831938
0x1831968
0x1831980
0x18319e0
0x1831a00
0x1831a48
0x188bd68
```
## AP base materialization windows

### AP materialization near `0xe9207e`

```text
  e91fbc:	48 8d b4 24 60 04 00 	lea    rsi,[rsp+0x460]
  e91fc3:	00
  e91fc4:	e8 c7 82 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e91fc9:	48 8b 84 24 d0 07 00 	mov    rax,QWORD PTR [rsp+0x7d0]
  e91fd0:	00
  e91fd1:	40 8a 68 01          	mov    bpl,BYTE PTR [rax+0x1]
  e91fd5:	48 8b 9c 24 48 03 00 	mov    rbx,QWORD PTR [rsp+0x348]
  e91fdc:	00
  e91fdd:	48 8d 35 d2 8f 4f ff 	lea    rsi,[rip+0xffffffffff4f8fd2]        # 38afb6 <_ZTSSt12bad_any_cast@@Base-0x5212>
  e91fe4:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  e91feb:	00
  e91fec:	e8 8d 7a be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e91ff1:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
  e91ff6:	48 8b b4 24 00 05 00 	mov    rsi,QWORD PTR [rsp+0x500]
  e91ffd:	00
  e91ffe:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
  e92005:	00
  e92006:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
  e9200d:	00
  e9200e:	e8 a7 b0 c1 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
  e92013:	48 8d 05 c6 c8 97 00 	lea    rax,[rip+0x97c8c6]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e9201a:	48 8d 8c 24 00 08 00 	lea    rcx,[rsp+0x800]
  e92021:	00
  e92022:	48 89 01             	mov    QWORD PTR [rcx],rax
  e92025:	48 8b 05 74 fa a1 00 	mov    rax,QWORD PTR [rip+0xa1fa74]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
  e9202c:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
  e92030:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
  e92034:	bf 60 01 00 00       	mov    edi,0x160
  e92039:	e8 c2 be 95 00       	call   17edf00 <_Znwm@plt>
  e9203e:	49 89 c4             	mov    r12,rax
  e92041:	66 0f ef c0          	pxor   xmm0,xmm0
  e92045:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9204a:	48 8d 05 57 f9 99 00 	lea    rax,[rip+0x99f957]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e92051:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e92055:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
  e9205c:	00
  e9205d:	48 8d b4 24 30 08 00 	lea    rsi,[rsp+0x830]
  e92064:	00
  e92065:	e8 8e 71 cf ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e9206a:	48 83 a4 24 80 08 00 	and    QWORD PTR [rsp+0x880],0x0
  e92071:	00 00
  e92073:	6a 40                	push   0x40
  e92075:	5f                   	pop    rdi
  e92076:	e8 85 be 95 00       	call   17edf00 <_Znwm@plt>
  e9207b:	49 89 c7             	mov    r15,rax
  e9207e:	48 8d 05 5b f9 99 00 	lea    rax,[rip+0x99f95b]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e92085:	49 89 07             	mov    QWORD PTR [r15],rax
  e92088:	4c 89 ff             	mov    rdi,r15
  e9208b:	48 83 c7 10          	add    rdi,0x10
  e9208f:	48 8d b4 24 90 09 00 	lea    rsi,[rsp+0x990]
  e92096:	00
  e92097:	e8 5c 71 cf ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e9209c:	48 8d b4 24 60 08 00 	lea    rsi,[rsp+0x860]
  e920a3:	00
  e920a4:	4c 89 7e 20          	mov    QWORD PTR [rsi+0x20],r15
  e920a8:	48 8d 05 79 f9 99 00 	lea    rax,[rip+0x99f979]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e920af:	48 89 84 24 60 09 00 	mov    QWORD PTR [rsp+0x960],rax
  e920b6:	00
  e920b7:	40 88 ac 24 68 09 00 	mov    BYTE PTR [rsp+0x968],bpl
  e920be:	00
  e920bf:	4c 89 b4 24 80 09 00 	mov    QWORD PTR [rsp+0x980],r14
  e920c6:	00
  e920c7:	48 8d 05 9a 62 9e 00 	lea    rax,[rip+0x9e629a]        # 1878368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34a50>
  e920ce:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
  e920d3:	41 c6 44 24 28 00    	mov    BYTE PTR [r12+0x28],0x0
  e920d9:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
  e920df:	4d 8d 7c 24 40       	lea    r15,[r12+0x40]
  e920e4:	66 41 83 64 24 3c 00 	and    WORD PTR [r12+0x3c],0x0
  e920eb:	4c 89 ff             	mov    rdi,r15
  e920ee:	e8 05 71 cf ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e920f3:	49 8d 6c 24 70       	lea    rbp,[r12+0x70]
  e920f8:	48 89 ef             	mov    rdi,rbp
  e920fb:	4c 89 f6             	mov    rsi,r14
  e920fe:	e8 f5 70 cf ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e92103:	48 8b 84 24 d8 08 00 	mov    rax,QWORD PTR [rsp+0x8d8]
  e9210a:	00
  e9210b:	66 0f 6f 84 24 d0 08 	movdqa xmm0,XMMWORD PTR [rsp+0x8d0]
  e92112:	00 00
  e92114:	66 41 0f 7f 84 24 a0 	movdqa XMMWORD PTR [r12+0xa0],xmm0
  e9211b:	00 00 00
  e9211e:	48 85 c0             	test   rax,rax
  e92121:	74 05                	je     e92128 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5953e>
  e92123:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e92128:	4d 8d b4 24 b0 00 00 	lea    r14,[r12+0xb0]
  e9212f:	00
  e92130:	4c 89 f7             	mov    rdi,r14
  e92133:	48 89 de             	mov    rsi,rbx
  e92136:	e8 87 f5 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
  e9213b:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]
  e92142:	00
  e92143:	48 8d b4 24 b8 00 00 	lea    rsi,[rsp+0xb8]
  e9214a:	00
  e9214b:	48 89 df             	mov    rdi,rbx
  e9214e:	e8 ed bd 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e92153:	4d 8d ac 24 e0 00 00 	lea    r13,[r12+0xe0]
  e9215a:	00
  e9215b:	48 8d b4 24 00 08 00 	lea    rsi,[rsp+0x800]
  e92162:	00
  e92163:	4c 89 ef             	mov    rdi,r13
  e92166:	e8 25 81 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9216b:	49 8d bc 24 10 01 00 	lea    rdi,[r12+0x110]
  e92172:	00
  e92173:	48 8d b4 24 b0 02 00 	lea    rsi,[rsp+0x2b0]
  e9217a:	00
  e9217b:	e8 10 81 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e92180:	49 8d 5c 24 20       	lea    rbx,[r12+0x20]
  e92185:	31 c0                	xor    eax,eax
  e92187:	41 88 84 24 40 01 00 	mov    BYTE PTR [r12+0x140],al
  e9218e:	00
  e9218f:	41 88 84 24 48 01 00 	mov    BYTE PTR [r12+0x148],al
  e92196:	00
  e92197:	41 83 a4 24 50 01 00 	and    DWORD PTR [r12+0x150],0x0
  e9219e:	00 00
  e921a0:	48 8d bc 24 60 09 00 	lea    rdi,[rsp+0x960]
  e921a7:	00
  e921a8:	e8 bd 7d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e921ad:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]
  e921b4:	00
  e921b5:	e8 b0 7d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e921ba:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
  e921c1:	00
  e921c2:	e8 a3 7d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e921c7:	66 49 0f 6e c4       	movq   xmm0,r12
  e921cc:	66 48 0f 6e cb       	movq   xmm1,rbx
  e921d1:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e921d5:	66 0f 7f 4c 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm1
  e921db:	31 ff                	xor    edi,edi
  e921dd:	e8 3a c2 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e921e2:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
  e921e9:	00
  e921ea:	e8 7b 7d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e921ef:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
  e921f6:	00
  e921f7:	e8 94 bc 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e921fc:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  e92203:	00
  e92204:	e8 87 bc 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e92209:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
  e92210:	00
  e92211:	e8 54 7d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
```
### AP materialization near `0xe992a2`

```text
  e9920d:	48 83 ec 20          	sub    rsp,0x20
  e99211:	48 89 fe             	mov    rsi,rdi
  e99214:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9921b:	00 00
  e9921d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  e99222:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  e99227:	48 89 df             	mov    rdi,rbx
  e9922a:	e8 01 21 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99232:	48 85 ff             	test   rdi,rdi
  e99235:	74 06                	je     e9923d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60653>
  e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e9923d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99242:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99249:	00 00
  e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  e99250:	75 0a                	jne    e9925c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60672>
  e99252:	48 83 c4 20          	add    rsp,0x20
  e99256:	5b                   	pop    rbx
  e99257:	e9 2a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9925c:	e8 4f 68 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99261:	48 89 c7             	mov    rdi,rax
  e99264:	e8 3c 08 be ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e99269:	cc                   	int3
  e9926a:	53                   	push   rbx
  e9926b:	48 89 fb             	mov    rbx,rdi
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
```
### AP materialization near `0xe99303`

```text
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
```
### AP materialization near `0xe9936c`

```text
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
```
### AP materialization near `0x160bad8`

```text
 160ba1d:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
 160ba22:	41 0f 11 45 28       	movups XMMWORD PTR [r13+0x28],xmm0
 160ba27:	4c 8d bc 24 d0 00 00 	lea    r15,[rsp+0xd0]
 160ba2e:	00
 160ba2f:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
 160ba36:	00
 160ba37:	4c 89 ff             	mov    rdi,r15
 160ba3a:	e8 09 89 58 ff       	call   b94348 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12e8>
 160ba3f:	4c 89 ef             	mov    rdi,r13
 160ba42:	4c 89 fe             	mov    rsi,r15
 160ba45:	e8 14 55 56 ff       	call   b70f5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdefe>
 160ba4a:	4c 8d 7c 24 48       	lea    r15,[rsp+0x48]
 160ba4f:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
 160ba56:	00
 160ba57:	e8 56 2a 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160ba5c:	4d 8b 67 e8          	mov    r12,QWORD PTR [r15-0x18]
 160ba60:	4d 8b 6f f0          	mov    r13,QWORD PTR [r15-0x10]
 160ba64:	4c 89 64 24 70       	mov    QWORD PTR [rsp+0x70],r12
 160ba69:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
 160ba6e:	4d 8b 77 f8          	mov    r14,QWORD PTR [r15-0x8]
 160ba72:	4c 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r14
 160ba79:	00
 160ba7a:	0f 57 c0             	xorps  xmm0,xmm0
 160ba7d:	41 0f 29 47 e8       	movaps XMMWORD PTR [r15-0x18],xmm0
 160ba82:	49 83 67 f8 00       	and    QWORD PTR [r15-0x8],0x0
 160ba87:	49 8b 07             	mov    rax,QWORD PTR [r15]
 160ba8a:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
 160ba91:	00
 160ba92:	41 8b 47 08          	mov    eax,DWORD PTR [r15+0x8]
 160ba96:	89 84 24 90 00 00 00 	mov    DWORD PTR [rsp+0x90],eax
 160ba9d:	49 8b 6f 10          	mov    rbp,QWORD PTR [r15+0x10]
 160baa1:	48 89 ac 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rbp
 160baa8:	00
 160baa9:	49 8b 5f 18          	mov    rbx,QWORD PTR [r15+0x18]
 160baad:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
 160bab4:	00
 160bab5:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0
 160baba:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
 160bac1:	00 00
 160bac3:	6a 40                	push   0x40
 160bac5:	5f                   	pop    rdi
 160bac6:	e8 35 24 1e 00       	call   17edf00 <_Znwm@plt>
 160bacb:	0f b6 4c 24 0f       	movzx  ecx,BYTE PTR [rsp+0xf]
 160bad0:	48 8d 94 24 98 00 00 	lea    rdx,[rsp+0x98]
 160bad7:	00
 160bad8:	48 8d 35 89 02 28 00 	lea    rsi,[rip+0x280289]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160badf:	48 89 30             	mov    QWORD PTR [rax],rsi
 160bae2:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
 160bae6:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
 160baea:	4c 89 70 18          	mov    QWORD PTR [rax+0x18],r14
 160baee:	0f 57 c0             	xorps  xmm0,xmm0
 160baf1:	0f 29 42 d8          	movaps XMMWORD PTR [rdx-0x28],xmm0
 160baf5:	48 83 62 e8 00       	and    QWORD PTR [rdx-0x18],0x0
 160bafa:	41 8b 77 08          	mov    esi,DWORD PTR [r15+0x8]
 160bafe:	89 70 28             	mov    DWORD PTR [rax+0x28],esi
 160bb01:	49 8b 37             	mov    rsi,QWORD PTR [r15]
 160bb04:	48 89 70 20          	mov    QWORD PTR [rax+0x20],rsi
 160bb08:	48 89 68 30          	mov    QWORD PTR [rax+0x30],rbp
 160bb0c:	48 89 58 38          	mov    QWORD PTR [rax+0x38],rbx
 160bb10:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
 160bb13:	48 8d 94 24 e0 00 00 	lea    rdx,[rsp+0xe0]
 160bb1a:	00
 160bb1b:	48 89 42 20          	mov    QWORD PTR [rdx+0x20],rax
 160bb1f:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
 160bb26:	00
 160bb27:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 160bb2c:	e8 87 91 ff ff       	call   1604cb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44a23c>
 160bb31:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
 160bb38:	00
 160bb39:	e8 2c e4 46 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 160bb3e:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 160bb43:	e8 be 05 00 00       	call   160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160bb48:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 160bb4d:	e8 b4 05 00 00       	call   160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160bb52:	31 ff                	xor    edi,edi
 160bb54:	e8 59 29 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160bb59:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 160bb60:	00
 160bb61:	e8 2a 23 1e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 160bb66:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 160bb6b:	e8 42 29 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160bb70:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160bb77:	00 00
 160bb79:	48 3b 84 24 b0 01 00 	cmp    rax,QWORD PTR [rsp+0x1b0]
 160bb80:	00
 160bb81:	0f 85 9c 00 00 00    	jne    160bc23 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d91>
 160bb87:	48 81 c4 b8 01 00 00 	add    rsp,0x1b8
 160bb8e:	5b                   	pop    rbx
 160bb8f:	41 5c                	pop    r12
 160bb91:	41 5d                	pop    r13
 160bb93:	41 5e                	pop    r14
 160bb95:	41 5f                	pop    r15
 160bb97:	5d                   	pop    rbp
 160bb98:	c3                   	ret
 160bb99:	49 89 c6             	mov    r14,rax
 160bb9c:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
 160bba3:	00
 160bba4:	e8 c1 e3 46 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 160bba9:	eb 03                	jmp    160bbae <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d1c>
 160bbab:	49 89 c6             	mov    r14,rax
 160bbae:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 160bbb3:	e8 4e 05 00 00       	call   160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160bbb8:	eb 10                	jmp    160bbca <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d38>
 160bbba:	49 89 c6             	mov    r14,rax
 160bbbd:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
 160bbc4:	00
 160bbc5:	e8 e8 28 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160bbca:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 160bbcf:	e8 32 05 00 00       	call   160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160bbd4:	31 ff                	xor    edi,edi
 160bbd6:	e8 d7 28 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160bbdb:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 160bbe2:	00
 160bbe3:	e8 a8 22 1e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 160bbe8:	eb 05                	jmp    160bbef <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d5d>
 160bbea:	eb 00                	jmp    160bbec <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d5a>
 160bbec:	49 89 c6             	mov    r14,rax
 160bbef:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 160bbf4:	e8 b9 28 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160bbf9:	eb 0d                	jmp    160bc08 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d76>
 160bbfb:	49 89 c6             	mov    r14,rax
 160bbfe:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 160bc03:	e8 88 22 1e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 160bc08:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160bc0f:	00 00
 160bc11:	48 3b 84 24 b0 01 00 	cmp    rax,QWORD PTR [rsp+0x1b0]
 160bc18:	00
 160bc19:	75 08                	jne    160bc23 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d91>
 160bc1b:	4c 89 f7             	mov    rdi,r14
 160bc1e:	e8 ad 40 46 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 160bc23:	e8 88 3e 1e 00       	call   17efab0 <__stack_chk_fail@plt>
 160bc28:	48 83 7f 78 00       	cmp    QWORD PTR [rdi+0x78],0x0
 160bc2d:	74 08                	je     160bc37 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6da5>
 160bc2f:	c6 87 92 00 00 00 01 	mov    BYTE PTR [rdi+0x92],0x1
 160bc36:	c3                   	ret
 160bc37:	8b 7f 10             	mov    edi,DWORD PTR [rdi+0x10]
 160bc3a:	e9 61 1d 00 00       	jmp    160d9a0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b0e>
 160bc3f:	cc                   	int3
 160bc40:	55                   	push   rbp
 160bc41:	53                   	push   rbx
```
### AP materialization near `0x160c11c`

```text
 160c07d:	c6 83 8d 00 00 00 00 	mov    BYTE PTR [rbx+0x8d],0x0
 160c084:	eb 19                	jmp    160c09f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x720d>
 160c086:	c6 83 92 00 00 00 00 	mov    BYTE PTR [rbx+0x92],0x0
 160c08d:	8b 7b 10             	mov    edi,DWORD PTR [rbx+0x10]
 160c090:	e8 0b 19 00 00       	call   160d9a0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b0e>
 160c095:	eb 08                	jmp    160c09f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x720d>
 160c097:	48 89 df             	mov    rdi,rbx
 160c09a:	e8 2b 00 00 00       	call   160c0ca <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7238>
 160c09f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c0a6:	00 00
 160c0a8:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
 160c0af:	00
 160c0b0:	75 12                	jne    160c0c4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7232>
 160c0b2:	48 81 c4 08 01 00 00 	add    rsp,0x108
 160c0b9:	5b                   	pop    rbx
 160c0ba:	41 5c                	pop    r12
 160c0bc:	41 5d                	pop    r13
 160c0be:	41 5e                	pop    r14
 160c0c0:	41 5f                	pop    r15
 160c0c2:	5d                   	pop    rbp
 160c0c3:	c3                   	ret
 160c0c4:	e8 e7 39 1e 00       	call   17efab0 <__stack_chk_fail@plt>
 160c0c9:	cc                   	int3
 160c0ca:	66 83 a7 8c 00 00 00 	and    WORD PTR [rdi+0x8c],0x0
 160c0d1:	00
 160c0d2:	89 b7 98 00 00 00    	mov    DWORD PTR [rdi+0x98],esi
 160c0d8:	c6 87 95 00 00 00 01 	mov    BYTE PTR [rdi+0x95],0x1
 160c0df:	e9 32 e4 ff ff       	jmp    160a516 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5684>
 160c0e4:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 160c0e8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 160c0eb:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
 160c0ef:	48 89 51 08          	mov    QWORD PTR [rcx+0x8],rdx
 160c0f3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 160c0f6:	48 89 0a             	mov    QWORD PTR [rdx],rcx
 160c0f9:	48 ff 4f 10          	dec    QWORD PTR [rdi+0x10]
 160c0fd:	48 89 c7             	mov    rdi,rax
 160c100:	e9 1b 1e 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c105:	cc                   	int3
 160c106:	53                   	push   rbx
 160c107:	48 89 fb             	mov    rbx,rdi
 160c10a:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
 160c10e:	e8 9f 23 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160c113:	48 89 df             	mov    rdi,rbx
 160c116:	5b                   	pop    rbx
 160c117:	e9 60 31 fe ff       	jmp    15ef27c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x434800>
 160c11c:	48 8d 05 45 fc 27 00 	lea    rax,[rip+0x27fc45]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c123:	48 89 07             	mov    QWORD PTR [rdi],rax
 160c126:	48 83 c7 08          	add    rdi,0x8
 160c12a:	e9 d7 ff ff ff       	jmp    160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c12f:	cc                   	int3
 160c130:	53                   	push   rbx
 160c131:	48 89 fb             	mov    rbx,rdi
 160c134:	e8 e3 ff ff ff       	call   160c11c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x728a>
 160c139:	48 89 df             	mov    rdi,rbx
 160c13c:	5b                   	pop    rbx
 160c13d:	e9 de 1d 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c142:	41 56                	push   r14
 160c144:	53                   	push   rbx
 160c145:	48 83 ec 28          	sub    rsp,0x28
 160c149:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c150:	00 00
 160c152:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 160c157:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 160c15b:	6a 40                	push   0x40
 160c15d:	5f                   	pop    rdi
 160c15e:	e8 9d 1d 1e 00       	call   17edf00 <_Znwm@plt>
 160c163:	48 89 c3             	mov    rbx,rax
 160c166:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 160c16a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
 160c16f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 160c174:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
 160c17b:	00 00
 160c17d:	48 8d 05 e4 fb 27 00 	lea    rax,[rip+0x27fbe4]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c184:	48 89 03             	mov    QWORD PTR [rbx],rax
 160c187:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 160c18b:	4c 89 f6             	mov    rsi,r14
 160c18e:	e8 f7 05 00 00       	call   160c78a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f8>
 160c193:	48 89 e7             	mov    rdi,rsp
 160c196:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 160c19a:	e8 2b e1 46 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 160c19f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c1a6:	00 00
 160c1a8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 160c1ad:	75 2e                	jne    160c1dd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734b>
 160c1af:	48 89 d8             	mov    rax,rbx
 160c1b2:	48 83 c4 28          	add    rsp,0x28
 160c1b6:	5b                   	pop    rbx
 160c1b7:	41 5e                	pop    r14
 160c1b9:	c3                   	ret
 160c1ba:	48 89 c3             	mov    rbx,rax
 160c1bd:	48 89 e7             	mov    rdi,rsp
 160c1c0:	e8 05 e1 46 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 160c1c5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c1cc:	00 00
 160c1ce:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 160c1d3:	75 08                	jne    160c1dd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734b>
 160c1d5:	48 89 df             	mov    rdi,rbx
 160c1d8:	e8 f3 3a 46 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 160c1dd:	e8 ce 38 1e 00       	call   17efab0 <__stack_chk_fail@plt>
 160c1e2:	48 8d 47 08          	lea    rax,[rdi+0x8]
 160c1e6:	48 8d 0d 7b fb 27 00 	lea    rcx,[rip+0x27fb7b]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c1ed:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 160c1f0:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
 160c1f4:	48 89 c6             	mov    rsi,rax
 160c1f7:	e9 8e 05 00 00       	jmp    160c78a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f8>
 160c1fc:	48 83 c7 08          	add    rdi,0x8
 160c200:	e9 01 ff ff ff       	jmp    160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c205:	cc                   	int3
 160c206:	53                   	push   rbx
 160c207:	48 89 fb             	mov    rbx,rdi
 160c20a:	48 83 c7 08          	add    rdi,0x8
 160c20e:	e8 f3 fe ff ff       	call   160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c213:	48 89 df             	mov    rdi,rbx
 160c216:	5b                   	pop    rbx
 160c217:	e9 04 1d 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c21c:	41 57                	push   r15
 160c21e:	41 56                	push   r14
 160c220:	41 55                	push   r13
 160c222:	41 54                	push   r12
 160c224:	53                   	push   rbx
 160c225:	48 81 ec 90 01 00 00 	sub    rsp,0x190
 160c22c:	49 89 f4             	mov    r12,rsi
 160c22f:	49 89 ff             	mov    r15,rdi
 160c232:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c239:	00 00
 160c23b:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
 160c242:	00
 160c243:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
 160c247:	48 8b 57 10          	mov    rdx,QWORD PTR [rdi+0x10]
 160c24b:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 160c250:	48 89 df             	mov    rdi,rbx
 160c253:	e8 52 bd 1c 00       	call   17d7faa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3dcb>
 160c258:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 160c25c:	0f 84 38 01 00 00    	je     160c39a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7508>
 160c262:	4d 8b 6f 20          	mov    r13,QWORD PTR [r15+0x20]
 160c266:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 160c26a:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
 160c26e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 160c271:	ff 50 28             	call   QWORD PTR [rax+0x28]
 160c274:	49 89 c6             	mov    r14,rax
```
### AP materialization near `0x160c17d`

```text
 160c0df:	e9 32 e4 ff ff       	jmp    160a516 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5684>
 160c0e4:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 160c0e8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 160c0eb:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
 160c0ef:	48 89 51 08          	mov    QWORD PTR [rcx+0x8],rdx
 160c0f3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 160c0f6:	48 89 0a             	mov    QWORD PTR [rdx],rcx
 160c0f9:	48 ff 4f 10          	dec    QWORD PTR [rdi+0x10]
 160c0fd:	48 89 c7             	mov    rdi,rax
 160c100:	e9 1b 1e 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c105:	cc                   	int3
 160c106:	53                   	push   rbx
 160c107:	48 89 fb             	mov    rbx,rdi
 160c10a:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
 160c10e:	e8 9f 23 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160c113:	48 89 df             	mov    rdi,rbx
 160c116:	5b                   	pop    rbx
 160c117:	e9 60 31 fe ff       	jmp    15ef27c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x434800>
 160c11c:	48 8d 05 45 fc 27 00 	lea    rax,[rip+0x27fc45]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c123:	48 89 07             	mov    QWORD PTR [rdi],rax
 160c126:	48 83 c7 08          	add    rdi,0x8
 160c12a:	e9 d7 ff ff ff       	jmp    160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c12f:	cc                   	int3
 160c130:	53                   	push   rbx
 160c131:	48 89 fb             	mov    rbx,rdi
 160c134:	e8 e3 ff ff ff       	call   160c11c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x728a>
 160c139:	48 89 df             	mov    rdi,rbx
 160c13c:	5b                   	pop    rbx
 160c13d:	e9 de 1d 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c142:	41 56                	push   r14
 160c144:	53                   	push   rbx
 160c145:	48 83 ec 28          	sub    rsp,0x28
 160c149:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c150:	00 00
 160c152:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 160c157:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 160c15b:	6a 40                	push   0x40
 160c15d:	5f                   	pop    rdi
 160c15e:	e8 9d 1d 1e 00       	call   17edf00 <_Znwm@plt>
 160c163:	48 89 c3             	mov    rbx,rax
 160c166:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 160c16a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
 160c16f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 160c174:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
 160c17b:	00 00
 160c17d:	48 8d 05 e4 fb 27 00 	lea    rax,[rip+0x27fbe4]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c184:	48 89 03             	mov    QWORD PTR [rbx],rax
 160c187:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 160c18b:	4c 89 f6             	mov    rsi,r14
 160c18e:	e8 f7 05 00 00       	call   160c78a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f8>
 160c193:	48 89 e7             	mov    rdi,rsp
 160c196:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 160c19a:	e8 2b e1 46 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 160c19f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c1a6:	00 00
 160c1a8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 160c1ad:	75 2e                	jne    160c1dd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734b>
 160c1af:	48 89 d8             	mov    rax,rbx
 160c1b2:	48 83 c4 28          	add    rsp,0x28
 160c1b6:	5b                   	pop    rbx
 160c1b7:	41 5e                	pop    r14
 160c1b9:	c3                   	ret
 160c1ba:	48 89 c3             	mov    rbx,rax
 160c1bd:	48 89 e7             	mov    rdi,rsp
 160c1c0:	e8 05 e1 46 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 160c1c5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c1cc:	00 00
 160c1ce:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 160c1d3:	75 08                	jne    160c1dd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734b>
 160c1d5:	48 89 df             	mov    rdi,rbx
 160c1d8:	e8 f3 3a 46 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 160c1dd:	e8 ce 38 1e 00       	call   17efab0 <__stack_chk_fail@plt>
 160c1e2:	48 8d 47 08          	lea    rax,[rdi+0x8]
 160c1e6:	48 8d 0d 7b fb 27 00 	lea    rcx,[rip+0x27fb7b]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c1ed:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 160c1f0:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
 160c1f4:	48 89 c6             	mov    rsi,rax
 160c1f7:	e9 8e 05 00 00       	jmp    160c78a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f8>
 160c1fc:	48 83 c7 08          	add    rdi,0x8
 160c200:	e9 01 ff ff ff       	jmp    160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c205:	cc                   	int3
 160c206:	53                   	push   rbx
 160c207:	48 89 fb             	mov    rbx,rdi
 160c20a:	48 83 c7 08          	add    rdi,0x8
 160c20e:	e8 f3 fe ff ff       	call   160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c213:	48 89 df             	mov    rdi,rbx
 160c216:	5b                   	pop    rbx
 160c217:	e9 04 1d 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c21c:	41 57                	push   r15
 160c21e:	41 56                	push   r14
 160c220:	41 55                	push   r13
 160c222:	41 54                	push   r12
 160c224:	53                   	push   rbx
 160c225:	48 81 ec 90 01 00 00 	sub    rsp,0x190
 160c22c:	49 89 f4             	mov    r12,rsi
 160c22f:	49 89 ff             	mov    r15,rdi
 160c232:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c239:	00 00
 160c23b:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
 160c242:	00
 160c243:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
 160c247:	48 8b 57 10          	mov    rdx,QWORD PTR [rdi+0x10]
 160c24b:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 160c250:	48 89 df             	mov    rdi,rbx
 160c253:	e8 52 bd 1c 00       	call   17d7faa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3dcb>
 160c258:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 160c25c:	0f 84 38 01 00 00    	je     160c39a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7508>
 160c262:	4d 8b 6f 20          	mov    r13,QWORD PTR [r15+0x20]
 160c266:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 160c26a:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
 160c26e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 160c271:	ff 50 28             	call   QWORD PTR [rax+0x28]
 160c274:	49 89 c6             	mov    r14,rax
 160c277:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
 160c27c:	4c 89 6b f8          	mov    QWORD PTR [rbx-0x8],r13
 160c280:	48 89 df             	mov    rdi,rbx
 160c283:	4c 89 e6             	mov    rsi,r12
 160c286:	e8 a9 07 ff ff       	call   15fca34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441fb8>
 160c28b:	41 8b 47 28          	mov    eax,DWORD PTR [r15+0x28]
 160c28f:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
 160c294:	89 46 48             	mov    DWORD PTR [rsi+0x48],eax
 160c297:	0f 57 c0             	xorps  xmm0,xmm0
 160c29a:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 160c2a1:	00
 160c2a2:	0f 29 47 e8          	movaps XMMWORD PTR [rdi-0x18],xmm0
 160c2a6:	48 83 67 f8 00       	and    QWORD PTR [rdi-0x8],0x0
 160c2ab:	e8 a4 01 00 00       	call   160c454 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75c2>
 160c2b0:	49 83 c7 30          	add    r15,0x30
 160c2b4:	4c 8d a4 24 00 01 00 	lea    r12,[rsp+0x100]
 160c2bb:	00
 160c2bc:	4c 89 e7             	mov    rdi,r12
 160c2bf:	4c 89 fe             	mov    rsi,r15
 160c2c2:	e8 81 80 58 ff       	call   b94348 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12e8>
 160c2c7:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 160c2ce:	00
 160c2cf:	4c 89 e6             	mov    rsi,r12
 160c2d2:	e8 87 4c 56 ff       	call   b70f5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdefe>
 160c2d7:	4c 8d bc 24 00 01 00 	lea    r15,[rsp+0x100]
 160c2de:	00
 160c2df:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
```
### AP materialization near `0x160c1e6`

```text
 160c13d:	e9 de 1d 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c142:	41 56                	push   r14
 160c144:	53                   	push   rbx
 160c145:	48 83 ec 28          	sub    rsp,0x28
 160c149:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c150:	00 00
 160c152:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 160c157:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 160c15b:	6a 40                	push   0x40
 160c15d:	5f                   	pop    rdi
 160c15e:	e8 9d 1d 1e 00       	call   17edf00 <_Znwm@plt>
 160c163:	48 89 c3             	mov    rbx,rax
 160c166:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 160c16a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
 160c16f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 160c174:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
 160c17b:	00 00
 160c17d:	48 8d 05 e4 fb 27 00 	lea    rax,[rip+0x27fbe4]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c184:	48 89 03             	mov    QWORD PTR [rbx],rax
 160c187:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 160c18b:	4c 89 f6             	mov    rsi,r14
 160c18e:	e8 f7 05 00 00       	call   160c78a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f8>
 160c193:	48 89 e7             	mov    rdi,rsp
 160c196:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 160c19a:	e8 2b e1 46 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 160c19f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c1a6:	00 00
 160c1a8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 160c1ad:	75 2e                	jne    160c1dd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734b>
 160c1af:	48 89 d8             	mov    rax,rbx
 160c1b2:	48 83 c4 28          	add    rsp,0x28
 160c1b6:	5b                   	pop    rbx
 160c1b7:	41 5e                	pop    r14
 160c1b9:	c3                   	ret
 160c1ba:	48 89 c3             	mov    rbx,rax
 160c1bd:	48 89 e7             	mov    rdi,rsp
 160c1c0:	e8 05 e1 46 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 160c1c5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c1cc:	00 00
 160c1ce:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 160c1d3:	75 08                	jne    160c1dd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x734b>
 160c1d5:	48 89 df             	mov    rdi,rbx
 160c1d8:	e8 f3 3a 46 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 160c1dd:	e8 ce 38 1e 00       	call   17efab0 <__stack_chk_fail@plt>
 160c1e2:	48 8d 47 08          	lea    rax,[rdi+0x8]
 160c1e6:	48 8d 0d 7b fb 27 00 	lea    rcx,[rip+0x27fb7b]        # 188bd68 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4a40>
 160c1ed:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 160c1f0:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
 160c1f4:	48 89 c6             	mov    rsi,rax
 160c1f7:	e9 8e 05 00 00       	jmp    160c78a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f8>
 160c1fc:	48 83 c7 08          	add    rdi,0x8
 160c200:	e9 01 ff ff ff       	jmp    160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c205:	cc                   	int3
 160c206:	53                   	push   rbx
 160c207:	48 89 fb             	mov    rbx,rdi
 160c20a:	48 83 c7 08          	add    rdi,0x8
 160c20e:	e8 f3 fe ff ff       	call   160c106 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7274>
 160c213:	48 89 df             	mov    rdi,rbx
 160c216:	5b                   	pop    rbx
 160c217:	e9 04 1d 1e 00       	jmp    17edf20 <_ZdlPv@plt>
 160c21c:	41 57                	push   r15
 160c21e:	41 56                	push   r14
 160c220:	41 55                	push   r13
 160c222:	41 54                	push   r12
 160c224:	53                   	push   rbx
 160c225:	48 81 ec 90 01 00 00 	sub    rsp,0x190
 160c22c:	49 89 f4             	mov    r12,rsi
 160c22f:	49 89 ff             	mov    r15,rdi
 160c232:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 160c239:	00 00
 160c23b:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
 160c242:	00
 160c243:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
 160c247:	48 8b 57 10          	mov    rdx,QWORD PTR [rdi+0x10]
 160c24b:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 160c250:	48 89 df             	mov    rdi,rbx
 160c253:	e8 52 bd 1c 00       	call   17d7faa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3dcb>
 160c258:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 160c25c:	0f 84 38 01 00 00    	je     160c39a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7508>
 160c262:	4d 8b 6f 20          	mov    r13,QWORD PTR [r15+0x20]
 160c266:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 160c26a:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
 160c26e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 160c271:	ff 50 28             	call   QWORD PTR [rax+0x28]
 160c274:	49 89 c6             	mov    r14,rax
 160c277:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
 160c27c:	4c 89 6b f8          	mov    QWORD PTR [rbx-0x8],r13
 160c280:	48 89 df             	mov    rdi,rbx
 160c283:	4c 89 e6             	mov    rsi,r12
 160c286:	e8 a9 07 ff ff       	call   15fca34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441fb8>
 160c28b:	41 8b 47 28          	mov    eax,DWORD PTR [r15+0x28]
 160c28f:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
 160c294:	89 46 48             	mov    DWORD PTR [rsi+0x48],eax
 160c297:	0f 57 c0             	xorps  xmm0,xmm0
 160c29a:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 160c2a1:	00
 160c2a2:	0f 29 47 e8          	movaps XMMWORD PTR [rdi-0x18],xmm0
 160c2a6:	48 83 67 f8 00       	and    QWORD PTR [rdi-0x8],0x0
 160c2ab:	e8 a4 01 00 00       	call   160c454 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75c2>
 160c2b0:	49 83 c7 30          	add    r15,0x30
 160c2b4:	4c 8d a4 24 00 01 00 	lea    r12,[rsp+0x100]
 160c2bb:	00
 160c2bc:	4c 89 e7             	mov    rdi,r12
 160c2bf:	4c 89 fe             	mov    rsi,r15
 160c2c2:	e8 81 80 58 ff       	call   b94348 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12e8>
 160c2c7:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 160c2ce:	00
 160c2cf:	4c 89 e6             	mov    rsi,r12
 160c2d2:	e8 87 4c 56 ff       	call   b70f5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdefe>
 160c2d7:	4c 8d bc 24 00 01 00 	lea    r15,[rsp+0x100]
 160c2de:	00
 160c2df:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 160c2e3:	e8 ca 21 49 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 160c2e8:	48 8d 05 29 59 e4 fe 	lea    rax,[rip+0xfffffffffee45929]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 160c2ef:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 160c2f4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 160c2f9:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 160c2ff:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 160c306:	00
 160c307:	4c 89 ff             	mov    rdi,r15
 160c30a:	e8 71 01 00 00       	call   160c480 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75ee>
 160c30f:	48 83 a4 24 68 01 00 	and    QWORD PTR [rsp+0x168],0x0
 160c316:	00 00
 160c318:	48 83 a4 24 78 01 00 	and    QWORD PTR [rsp+0x178],0x0
 160c31f:	00 00
 160c321:	6a 68                	push   0x68
 160c323:	5f                   	pop    rdi
 160c324:	e8 d7 1b 1e 00       	call   17edf00 <_Znwm@plt>
 160c329:	49 89 c7             	mov    r15,rax
 160c32c:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
 160c333:	00
 160c334:	48 89 c7             	mov    rdi,rax
 160c337:	e8 44 01 00 00       	call   160c480 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75ee>
 160c33c:	4c 8d a4 24 68 01 00 	lea    r12,[rsp+0x168]
 160c343:	00
 160c344:	4d 89 3c 24          	mov    QWORD PTR [r12],r15
 160c348:	48 8d 05 b7 08 ff ff 	lea    rax,[rip+0xffffffffffff08b7]        # 15fcc06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44218a>
 160c34f:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
 160c354:	48 8d 05 7d 01 00 00 	lea    rax,[rip+0x17d]        # 160c4d8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7646>
 160c35b:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
```
## Filtered object-field instructions: near e99

| addr | instruction |
|---:|---|
| `0xe99005` | `e99005:	e8 26 23 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe9900a` | `e9900a:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xe9904f` | `e9904f:	49 8d 7e 08          	lea    rdi,[r14+0x8]` |
| `0xe990c2` | `e990c2:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0xe990c5` | `e990c5:	4d 89 77 08          	mov    QWORD PTR [r15+0x8],r14` |
| `0xe990c9` | `e990c9:	48 8d 05 74 4b c4 ff 	lea    rax,[rip+0xffffffffffc44b74]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>` |
| `0xe990d0` | `e990d0:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax` |
| `0xe990d4` | `e990d4:	48 8d 05 1f e1 61 00 	lea    rax,[rip+0x61e11f]        # 14b71fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc77e>` |
| `0xe99108` | `e99108:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0` |
| `0xe991d0` | `e991d0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xe99202` | `e99202:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xe9922a` | `e9922a:	e8 01 21 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe9922f` | `e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xe99237` | `e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xe9923a` | `e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xe99271` | `e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe99280` | `e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]` |
| `0xe99288` | `e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>` |
| `0xe99292` | `e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]` |
| `0xe9929a` | `e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0` |
| `0xe992a2` | `e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>` |
| `0xe992a9` | `e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xe992dd` | `e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]` |
| `0xe992e4` | `e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe992f0` | `e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]` |
| `0xe99303` | `e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>` |
| `0xe9930a` | `e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xe9930d` | `e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]` |
| `0xe9931c` | `e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0xe99368` | `e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]` |
| `0xe9938c` | `e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>` |
| `0xe99393` | `e99393:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xe99435` | `e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe9943a` | `e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe99442` | `e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]` |
| `0xe9944e` | `e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe99451` | `e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xe9945c` | `e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe994ef` | `e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]` |
| `0xe994f3` | `e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]` |
| `0xe9950b` | `e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15` |
| `0xe99511` | `e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]` |
| `0xe99515` | `e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xe9952a` | `e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]` |
| `0xe9952e` | `e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]` |
| `0xe99568` | `e99568:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]` |
| `0xe99574` | `e99574:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15` |
| `0xe995c5` | `e995c5:	e8 66 1d c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe995ca` | `e995ca:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe995d2` | `e995d2:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]` |
| `0xe995de` | `e995de:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe995e1` | `e995e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xe995ec` | `e995ec:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xe99668` | `e99668:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0` |
| `0xe99676` | `e99676:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xe99681` | `e99681:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0` |
| `0xe99685` | `e99685:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0` |
| `0xe9968a` | `e9968a:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xe9968d` | `e9968d:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xe99690` | `e99690:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]` |
| `0xe99694` | `e99694:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0xe99698` | `e99698:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0xe9969c` | `e9969c:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0xe996a3` | `e996a3:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0xe996a6` | `e996a6:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0` |
| `0xe996b5` | `e996b5:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]` |
| `0xe996b8` | `e996b8:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0xe99713` | `e99713:	e8 18 1c c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe99718` | `e99718:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe99720` | `e99720:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]` |
| `0xe9972c` | `e9972c:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe9974f` | `e9974f:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xe99758` | `e99758:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe997f0` | `e997f0:	e8 3b 1b c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe997f5` | `e997f5:	49 83 3f 00          	cmp    QWORD PTR [r15],0x0` |
| `0xe997fb` | `e997fb:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]` |
| `0xe9981b` | `e9981b:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xe99824` | `e99824:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xe99893` | `e99893:	e8 68 46 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe998a2` | `e998a2:	48 8d 05 1f 7b 99 00 	lea    rax,[rip+0x997b1f]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>` |
| `0xe998a9` | `e998a9:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xe998b0` | `e998b0:	48 8d 05 21 a6 9a 00 	lea    rax,[rip+0x9aa621]        # 1843ed8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5c0>` |
| `0xe998d3` | `e998d3:	4c 89 3b             	mov    QWORD PTR [rbx],r15` |
| `0xe998d6` | `e998d6:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14` |
| `0xe99a1d` | `e99a1d:	48 8b 33             	mov    rsi,QWORD PTR [rbx]` |
| `0xe99abf` | `e99abf:	4c 8b 6f 08          	mov    r13,QWORD PTR [rdi+0x8]` |
| `0xe99ac3` | `e99ac3:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]` |
| `0xe99acc` | `e99acc:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0xe99ad3` | `e99ad3:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]` |
| `0xe99ade` | `e99ade:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0` |
| `0xe99aee` | `e99aee:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]` |
| `0xe99b48` | `e99b48:	e8 b3 43 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe99b51` | `e99b51:	49 8b 0f             	mov    rcx,QWORD PTR [r15]` |
| `0xe99b5c` | `e99b5c:	49 8b 4f 08          	mov    rcx,QWORD PTR [r15+0x8]` |
| `0xe99b68` | `e99b68:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0` |
| `0xe99b6c` | `e99b6c:	48 8b 13             	mov    rdx,QWORD PTR [rbx]` |
| `0xe99b6f` | `e99b6f:	4c 8b 6b 08          	mov    r13,QWORD PTR [rbx+0x8]` |
| `0xe99ba0` | `e99ba0:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]` |
| `0xe99ba3` | `e99ba3:	4c 8b 6b 08          	mov    r13,QWORD PTR [rbx+0x8]` |
| `0xe99bb6` | `e99bb6:	48 89 0b             	mov    QWORD PTR [rbx],rcx` |
| `0xe99bb9` | `e99bb9:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12` |
| `0xe99bbd` | `e99bbd:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |
| `0xe99be2` | `e99be2:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12` |
| `0xe99c1f` | `e99c1f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]` |
| `0xe99c22` | `e99c22:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0xe99c7d` | `e99c7d:	e8 ae 16 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xe99c82` | `e99c82:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe99c8a` | `e99c8a:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]` |
| `0xe99c96` | `e99c96:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xe99c99` | `e99c99:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xe99ca7` | `e99ca7:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xe99d6d` | `e99d6d:	48 8d 05 4c 40 96 00 	lea    rax,[rip+0x96404c]        # 17fddc0 <_ZTINSt6__ndk117bad_function_callE@@Base+0xe60>` |
| `0xe99dd2` | `e99dd2:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xe99de0` | `e99de0:	e8 1b 41 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe99f9e` | `e99f9e:	e8 5d 3f 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe99faf` | `e99faf:	48 8d 05 12 0e 97 00 	lea    rax,[rip+0x970e12]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>` |
| `0xe99fba` | `e99fba:	48 8d 05 8f 96 97 00 	lea    rax,[rip+0x97968f]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>` |
| `0xe99fcc` | `e99fcc:	48 8d 05 37 68 02 00 	lea    rax,[rip+0x26837]        # ec080a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87c20>` |
| `0xe99fdb` | `e99fdb:	48 8d 05 1e 74 99 00 	lea    rax,[rip+0x99741e]        # 1831400 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3398>` |
| `0xe9a162` | `e9a162:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xe9a191` | `e9a191:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xe9a1b4` | `e9a1b4:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xe9a1dc` | `e9a1dc:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xe9a200` | `e9a200:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xe9a226` | `e9a226:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xe9a24c` | `e9a24c:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xe9a270` | `e9a270:	49 8b 37             	mov    rsi,QWORD PTR [r15]` |
| `0xe9a392` | `e9a392:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xe9a395` | `e9a395:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]` |
| `0xe9a42d` | `e9a42d:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xe9a430` | `e9a430:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]` |
| `0xe9a455` | `e9a455:	e8 a6 3a 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe9a464` | `e9a464:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0` |
| `0xe9a46a` | `e9a46a:	48 8d 05 57 09 97 00 	lea    rax,[rip+0x970957]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>` |
| `0xe9a471` | `e9a471:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xe9a474` | `e9a474:	48 8d 05 e5 6f 99 00 	lea    rax,[rip+0x996fe5]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>` |
| `0xe9a483` | `e9a483:	48 8d 05 0b 72 09 00 	lea    rax,[rip+0x9720b]        # f31695 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf8aab>` |
| `0xe9a4a2` | `e9a4a2:	48 8d 05 ff 6f 99 00 	lea    rax,[rip+0x996fff]        # 18314a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3440>` |
| `0xe9a640` | `e9a640:	e8 bb 38 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe9a64f` | `e9a64f:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0` |
| `0xe9a655` | `e9a655:	48 8d 05 6c 07 97 00 	lea    rax,[rip+0x97076c]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>` |
| `0xe9a65c` | `e9a65c:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0xe9a65f` | `e9a65f:	48 8d 05 ea 8f 97 00 	lea    rax,[rip+0x978fea]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>` |
| `0xe9a66e` | `e9a66e:	48 8d 05 28 20 12 00 	lea    rax,[rip+0x122028]        # fbc69d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183ab3>` |
| `0xe9a685` | `e9a685:	48 8d 05 7c 6e 99 00 	lea    rax,[rip+0x996e7c]        # 1831508 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x34a0>` |
| `0xe9a7f1` | `e9a7f1:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]` |
| `0xe9a819` | `e9a819:	e8 e2 36 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe9a84d` | `e9a84d:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xe9a88a` | `e9a88a:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xe9a899` | `e9a899:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xe9a8b0` | `e9a8b0:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xe9a8d8` | `e9a8d8:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xe9a8ff` | `e9a8ff:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xe9acc1` | `e9acc1:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]` |
| `0xe9acfd` | `e9acfd:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]` |
| `0xe9ad2d` | `e9ad2d:	e8 ce 31 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe9ad35` | `e9ad35:	48 8d 05 ac da 9f 00 	lea    rax,[rip+0x9fdaac]        # 18987e8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5728>` |
| `0xe9ad3c` | `e9ad3c:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xe9ad47` | `e9ad47:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]` |
| `0xe9ad4b` | `e9ad4b:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0` |
| `0xe9ad52` | `e9ad52:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0` |
| `0xe9adaa` | `e9adaa:	e8 51 31 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe9adb2` | `e9adb2:	48 8d 05 0f d9 9f 00 	lea    rax,[rip+0x9fd90f]        # 18986c8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5608>` |
| `0xe9adb9` | `e9adb9:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xe9ae3b` | `e9ae3b:	e8 c0 30 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe9ae7a` | `e9ae7a:	48 8d 05 57 67 99 00 	lea    rax,[rip+0x996757]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>` |
| `0xe9b01d` | `e9b01d:	4d 8b 26             	mov    r12,QWORD PTR [r14]` |
| `0xe9b028` | `e9b028:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]` |
| `0xe9b039` | `e9b039:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]` |
| `0xe9b059` | `e9b059:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]` |
| `0xe9b069` | `e9b069:	e8 92 2e 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe9b085` | `e9b085:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]` |
| `0xe9b098` | `e9b098:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]` |
| `0xe9b0b6` | `e9b0b6:	4d 8b 3e             	mov    r15,QWORD PTR [r14]` |
| `0xe9b0c1` | `e9b0c1:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]` |
| `0xe9b0d2` | `e9b0d2:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]` |
| `0xe9b0eb` | `e9b0eb:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]` |
| `0xe9b0fb` | `e9b0fb:	e8 00 2e 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe9b117` | `e9b117:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]` |
| `0xe9b12c` | `e9b12c:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]` |
| `0xe9b248` | `e9b248:	48 89 17             	mov    QWORD PTR [rdi],rdx` |
| `0xe9b24b` | `e9b24b:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax` |
| `0xe9b253` | `e9b253:	48 8d 05 56 77 99 00 	lea    rax,[rip+0x997756]        # 18329b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4948>` |
| `0xe9b26a` | `e9b26a:	48 8d 84 24 d0 0e 00 	lea    rax,[rsp+0xed0]` |
| `0xe9b2a0` | `e9b2a0:	48 8d 05 39 36 97 00 	lea    rax,[rip+0x973639]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>` |
| `0xe9b2be` | `e9b2be:	48 8d 84 24 e0 03 00 	lea    rax,[rsp+0x3e0]` |
| `0xe9b2d5` | `e9b2d5:	48 8d 84 24 a0 0e 00 	lea    rax,[rsp+0xea0]` |
| `0xe9b30c` | `e9b30c:	48 8d 05 3d 83 97 00 	lea    rax,[rip+0x97833d]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>` |
| `0xe9b31e` | `e9b31e:	48 8d 05 88 d3 05 00 	lea    rax,[rip+0x5d388]        # ef86ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbfac3>` |
| `0xe9b36f` | `e9b36f:	e8 8c 2b 95 00       	call   17edf00 <_Znwm@plt>` |
| `0xe9b377` | `e9b377:	48 8d 05 32 5b 9c 00 	lea    rax,[rip+0x9c5b32]        # 1860eb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d598>` |
| `0xe9b37e` | `e9b37e:	48 89 03             	mov    QWORD PTR [rbx],rax` |

## Filtered object-field instructions: near fd

| addr | instruction |
|---:|---|
| `0xfd3000` | `fd3000:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xfd3031` | `fd3031:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]` |
| `0xfd3038` | `fd3038:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0` |
| `0xfd3059` | `fd3059:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd` |
| `0xfd30bd` | `fd30bd:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xfd3170` | `fd3170:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]` |
| `0xfd3173` | `fd3173:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0` |
| `0xfd3177` | `fd3177:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0xfd317b` | `fd317b:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0xfd3182` | `fd3182:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0xfd3185` | `fd3185:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0` |
| `0xfd31c0` | `fd31c0:	e8 3b ad 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd31cf` | `fd31cf:	48 8d 05 d2 72 86 00 	lea    rax,[rip+0x8672d2]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>` |
| `0xfd31d6` | `fd31d6:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xfd3201` | `fd3201:	4c 89 23             	mov    QWORD PTR [rbx],r12` |
| `0xfd3204` | `fd3204:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14` |
| `0xfd3264` | `fd3264:	48 8d 77 10          	lea    rsi,[rdi+0x10]` |
| `0xfd3270` | `fd3270:	e8 bb 80 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xfd3275` | `fd3275:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xfd32f1` | `fd32f1:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]` |
| `0xfd32fa` | `fd32fa:	4c 8b 6d 10          	mov    r13,QWORD PTR [rbp+0x10]` |
| `0xfd32fe` | `fd32fe:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0` |
| `0xfd3370` | `fd3370:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0xfd3373` | `fd3373:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0` |
| `0xfd33f0` | `fd33f0:	48 8d 05 91 e9 86 00 	lea    rax,[rip+0x86e991]        # 1841d88 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13d20>` |
| `0xfd33f7` | `fd33f7:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xfd3403` | `fd3403:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]` |
| `0xfd34d5` | `fd34d5:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xfd350c` | `fd350c:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xfd3590` | `fd3590:	48 8d 77 10          	lea    rsi,[rdi+0x10]` |
| `0xfd359c` | `fd359c:	e8 8f 7d ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xfd35a1` | `fd35a1:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xfd35bf` | `fd35bf:	48 8d 7b 08          	lea    rdi,[rbx+0x8]` |
| `0xfd35ec` | `fd35ec:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]` |
| `0xfd35f5` | `fd35f5:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]` |
| `0xfd3601` | `fd3601:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0` |
| `0xfd3605` | `fd3605:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0` |
| `0xfd3673` | `fd3673:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xfd3686` | `fd3686:	41 0f 10 46 10       	movups xmm0,XMMWORD PTR [r14+0x10]` |
| `0xfd3698` | `fd3698:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xfd36aa` | `fd36aa:	e8 51 a8 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd36bc` | `fd36bc:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xfd36ea` | `fd36ea:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]` |
| `0xfd36f1` | `fd36f1:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0` |
| `0xfd370f` | `fd370f:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd` |
| `0xfd3765` | `fd3765:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xfd383c` | `fd383c:	ff 50 70             	call   QWORD PTR [rax+0x70]` |
| `0xfd384a` | `fd384a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xfd384d` | `fd384d:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]` |
| `0xfd3923` | `fd3923:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xfd3926` | `fd3926:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]` |
| `0xfd39ab` | `fd39ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xfd39ae` | `fd39ae:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0xfd3a35` | `fd3a35:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0xfd3a4d` | `fd3a4d:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]` |
| `0xfd3a75` | `fd3a75:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfd3aad` | `fd3aad:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xfd3af0` | `fd3af0:	49 8b 2e             	mov    rbp,QWORD PTR [r14]` |
| `0xfd3b0e` | `fd3b0e:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]` |
| `0xfd3b1e` | `fd3b1e:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0` |
| `0xfd3b2a` | `fd3b2a:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0` |
| `0xfd3b36` | `fd3b36:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfd3b76` | `fd3b76:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xfd3b8c` | `fd3b8c:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0` |
| `0xfd3b9d` | `fd3b9d:	66 0f 7f 4b 10       	movdqa XMMWORD PTR [rbx+0x10],xmm1` |
| `0xfd3beb` | `fd3beb:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xfd3bf0` | `fd3bf0:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xfd3c0f` | `fd3c0f:	e8 ec a2 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd3c4a` | `fd3c4a:	4c 8b 37             	mov    r14,QWORD PTR [rdi]` |
| `0xfd3c4d` | `fd3c4d:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]` |
| `0xfd3c55` | `fd3c55:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0` |
| `0xfd3c78` | `fd3c78:	49 83 3e fd          	cmp    QWORD PTR [r14],0xfffffffffffffffd` |
| `0xfd3c8a` | `fd3c8a:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]` |
| `0xfd3ce0` | `fd3ce0:	e8 4b 76 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xfd3ce5` | `fd3ce5:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xfd3d3d` | `fd3d3d:	48 83 7d 08 00       	cmp    QWORD PTR [rbp+0x8],0x0` |
| `0xfd3d50` | `fd3d50:	48 8d 7d 08          	lea    rdi,[rbp+0x8]` |
| `0xfd3d60` | `fd3d60:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0` |
| `0xfd3d6c` | `fd3d6c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfd3d8a` | `fd3d8a:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]` |
| `0xfd3dae` | `fd3dae:	e8 4d a1 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd3dbf` | `fd3dbf:	48 8d 05 0a d7 85 00 	lea    rax,[rip+0x85d70a]        # 18314d0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3468>` |
| `0xfd3dc6` | `fd3dc6:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xfd3de6` | `fd3de6:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]` |
| `0xfd3e3d` | `fd3e3d:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0xfd3ea6` | `fd3ea6:	49 83 3e fd          	cmp    QWORD PTR [r14],0xfffffffffffffffd` |
| `0xfd3ec5` | `fd3ec5:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]` |
| `0xfd3f18` | `fd3f18:	e8 e3 9f 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd3f28` | `fd3f28:	48 8d 05 fb 1c 00 00 	lea    rax,[rip+0x1cfb]        # fd5c2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d040>` |
| `0xfd3f33` | `fd3f33:	48 8d 05 7e b9 b6 ff 	lea    rax,[rip+0xffffffffffb6b97e]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>` |
| `0xfd3f6a` | `fd3f6a:	41 ff 55 08          	call   QWORD PTR [r13+0x8]` |
| `0xfd3f79` | `fd3f79:	4d 89 2e             	mov    QWORD PTR [r14],r13` |
| `0xfd3f8d` | `fd3f8d:	49 83 3e fd          	cmp    QWORD PTR [r14],0xfffffffffffffffd` |
| `0xfd3fd3` | `fd3fd3:	e8 58 73 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xfd3fd8` | `fd3fd8:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xfd400a` | `fd400a:	48 8b 5b 08          	mov    rbx,QWORD PTR [rbx+0x8]` |
| `0xfd4059` | `fd4059:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]` |
| `0xfd4069` | `fd4069:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0` |
| `0xfd4075` | `fd4075:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0` |
| `0xfd4081` | `fd4081:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfd40bc` | `fd40bc:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]` |
| `0xfd40fd` | `fd40fd:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]` |
| `0xfd4102` | `fd4102:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]` |
| `0xfd4152` | `fd4152:	e8 a9 9d 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd4184` | `fd4184:	4c 8b 37             	mov    r14,QWORD PTR [rdi]` |
| `0xfd4187` | `fd4187:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]` |
| `0xfd418f` | `fd418f:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0` |
| `0xfd41a8` | `fd41a8:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]` |
| `0xfd41b1` | `fd41b1:	49 83 3e fd          	cmp    QWORD PTR [r14],0xfffffffffffffffd` |
| `0xfd41d2` | `fd41d2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]` |
| `0xfd421e` | `fd421e:	e8 0d 71 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xfd4223` | `fd4223:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xfd429b` | `fd429b:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0` |
| `0xfd42a7` | `fd42a7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfd42c5` | `fd42c5:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]` |
| `0xfd42dc` | `fd42dc:	e8 1f 9c 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd42f2` | `fd42f2:	48 8d 05 cf 8d 86 00 	lea    rax,[rip+0x868dcf]        # 183d0c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf060>` |
| `0xfd42f9` | `fd42f9:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xfd4324` | `fd4324:	e8 d7 9b 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd433d` | `fd433d:	48 8d 05 cc e0 86 00 	lea    rax,[rip+0x86e0cc]        # 1842410 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x143a8>` |
| `0xfd4373` | `fd4373:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]` |
| `0xfd4390` | `fd4390:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]` |
| `0xfd43a5` | `fd43a5:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]` |
| `0xfd43ad` | `fd43ad:	e8 4e 9b 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd43c2` | `fd43c2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]` |
| `0xfd4408` | `fd4408:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0` |
| `0xfd4414` | `fd4414:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0` |
| `0xfd4421` | `fd4421:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xfd4450` | `fd4450:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]` |
| `0xfd4490` | `fd4490:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]` |
| `0xfd44a5` | `fd44a5:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]` |
| `0xfd44ad` | `fd44ad:	e8 4e 9a 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd44c2` | `fd44c2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]` |
| `0xfd4508` | `fd4508:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0` |
| `0xfd4514` | `fd4514:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0` |
| `0xfd4521` | `fd4521:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xfd4551` | `fd4551:	4d 89 66 10          	mov    QWORD PTR [r14+0x10],r12` |
| `0xfd45ae` | `fd45ae:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd` |
| `0xfd45c5` | `fd45c5:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]` |
| `0xfd45fc` | `fd45fc:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]` |
| `0xfd462e` | `fd462e:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]` |
| `0xfd4633` | `fd4633:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]` |
| `0xfd463b` | `fd463b:	e8 c0 98 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd4651` | `fd4651:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]` |
| `0xfd4656` | `fd4656:	48 8d 05 15 1a 00 00 	lea    rax,[rip+0x1a15]        # fd6072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d488>` |
| `0xfd465d` | `fd465d:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xfd4660` | `fd4660:	48 8d 05 51 b2 b6 ff 	lea    rax,[rip+0xffffffffffb6b251]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>` |
| `0xfd4667` | `fd4667:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0xfd4699` | `fd4699:	41 ff 56 08          	call   QWORD PTR [r14+0x8]` |
| `0xfd46d9` | `fd46d9:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0` |
| `0xfd46e2` | `fd46e2:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]` |
| `0xfd47ed` | `fd47ed:	48 8d 05 cc d7 86 00 	lea    rax,[rip+0x86d7cc]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>` |
| `0xfd47f4` | `fd47f4:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xfd47f7` | `fd47f7:	4c 8d 77 08          	lea    r14,[rdi+0x8]` |
| `0xfd47fb` | `fd47fb:	48 8d 05 ae d9 86 00 	lea    rax,[rip+0x86d9ae]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>` |
| `0xfd4802` | `fd4802:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax` |
| `0xfd487b` | `fd487b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0` |
| `0xfd4880` | `fd4880:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0` |
| `0xfd48e0` | `fd48e0:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]` |
| `0xfd48f9` | `fd48f9:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xfd490a` | `fd490a:	4c 8b 23             	mov    r12,QWORD PTR [rbx]` |
| `0xfd4912` | `fd4912:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]` |
| `0xfd4920` | `fd4920:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xfd4925` | `fd4925:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xfd492a` | `fd492a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xfd493c` | `fd493c:	e8 bf 95 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd496e` | `fd496e:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]` |
| `0xfd4976` | `fd4976:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0` |
| `0xfd4996` | `fd4996:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd` |
| `0xfd49fd` | `fd49fd:	e8 2e 69 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xfd4a02` | `fd4a02:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xfd4afa` | `fd4afa:	49 8b 37             	mov    rsi,QWORD PTR [r15]` |
| `0xfd4c17` | `fd4c17:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xfd4c1e` | `fd4c1e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0xfd4c3d` | `fd4c3d:	e8 be 92 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd4d26` | `fd4d26:	e8 d5 91 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd4d35` | `fd4d35:	48 8d 05 6c 57 86 00 	lea    rax,[rip+0x86576c]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>` |
| `0xfd4d3c` | `fd4d3c:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xfd4d67` | `fd4d67:	4c 89 23             	mov    QWORD PTR [rbx],r12` |
| `0xfd4d6a` | `fd4d6a:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14` |
| `0xfd4da4` | `fd4da4:	48 8d 05 2d d4 86 00 	lea    rax,[rip+0x86d42d]        # 18421d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14170>` |
| `0xfd4dab` | `fd4dab:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xfd4db7` | `fd4db7:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]` |
| `0xfd4e12` | `fd4e12:	e8 e9 90 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd4e21` | `fd4e21:	48 8d 05 80 56 86 00 	lea    rax,[rip+0x865680]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>` |
| `0xfd4e28` | `fd4e28:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xfd4e73` | `fd4e73:	4c 89 3b             	mov    QWORD PTR [rbx],r15` |
| `0xfd4e76` | `fd4e76:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14` |
| `0xfd4e81` | `fd4e81:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]` |
| `0xfd4ef1` | `fd4ef1:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0` |
| `0xfd4f0b` | `fd4f0b:	48 8d 7b 08          	lea    rdi,[rbx+0x8]` |
| `0xfd4f0f` | `fd4f0f:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]` |
| `0xfd4f22` | `fd4f22:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]` |
| `0xfd4f27` | `fd4f27:	4d 8b 26             	mov    r12,QWORD PTR [r14]` |
| `0xfd4f2a` | `fd4f2a:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]` |
| `0xfd4f34` | `fd4f34:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0xfd4f3c` | `fd4f3c:	4d 8b 26             	mov    r12,QWORD PTR [r14]` |
| `0xfd4f67` | `fd4f67:	e8 94 8f 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd4f79` | `fd4f79:	0f 11 45 10          	movups XMMWORD PTR [rbp+0x10],xmm0` |
| `0xfd4fa2` | `fd4fa2:	48 8d 05 8f 02 00 00 	lea    rax,[rip+0x28f]        # fd5238 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c64e>` |
| `0xfd4fad` | `fd4fad:	48 8d 05 e6 3d f5 ff 	lea    rax,[rip+0xfffffffffff53de6]        # f28d9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf01b0>` |
| `0xfd4fb4` | `fd4fb4:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax` |
| `0xfd4ffe` | `fd4ffe:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]` |
| `0xfd507a` | `fd507a:	4c 8b 23             	mov    r12,QWORD PTR [rbx]` |
| `0xfd5082` | `fd5082:	48 8b 5b 08          	mov    rbx,QWORD PTR [rbx+0x8]` |
| `0xfd5090` | `fd5090:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]` |
| `0xfd5095` | `fd5095:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]` |
| `0xfd509a` | `fd509a:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]` |
| `0xfd509f` | `fd509f:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]` |
| `0xfd50a4` | `fd50a4:	4d 8b 3e             	mov    r15,QWORD PTR [r14]` |
| `0xfd50af` | `fd50af:	e8 4c 8e 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd50dc` | `fd50dc:	4d 8b 2e             	mov    r13,QWORD PTR [r14]` |
| `0xfd50df` | `fd50df:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]` |
| `0xfd50e6` | `fd50e6:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0` |
| `0xfd512a` | `fd512a:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]` |
| `0xfd5178` | `fd5178:	e8 b3 61 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xfd517d` | `fd517d:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xfd51a3` | `fd51a3:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]` |
| `0xfd5262` | `fd5262:	4c 8d 77 10          	lea    r14,[rdi+0x10]` |
| `0xfd5271` | `fd5271:	e8 ba 60 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xfd5276` | `fd5276:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xfd5297` | `fd5297:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0` |
| `0xfd529b` | `fd529b:	48 8d 7b 08          	lea    rdi,[rbx+0x8]` |
| `0xfd52a7` | `fd52a7:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xfd52e8` | `fd52e8:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax` |
| `0xfd5349` | `fd5349:	49 8b 2e             	mov    rbp,QWORD PTR [r14]` |
| `0xfd535d` | `fd535d:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]` |
| `0xfd5401` | `fd5401:	e8 fa 8a 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd541e` | `fd541e:	48 8d 05 83 50 86 00 	lea    rax,[rip+0x865083]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>` |
| `0xfd546b` | `fd546b:	49 89 6f 10          	mov    QWORD PTR [r15+0x10],rbp` |
| `0xfd549b` | `fd549b:	0f 29 45 10          	movaps XMMWORD PTR [rbp+0x10],xmm0` |
| `0xfd5551` | `fd5551:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0` |
| `0xfd5555` | `fd5555:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0` |
| `0xfd5581` | `fd5581:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]` |
| `0xfd5594` | `fd5594:	ff 50 10             	call   QWORD PTR [rax+0x10]` |

## Filtered object-field instructions: restrictions ctor region

| addr | instruction |
|---:|---|
| `0x10b009d` | `10b009d:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b00a0` | `10b00a0:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10b02fd` | `10b02fd:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b0300` | `10b0300:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10b0420` | `10b0420:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b0430` | `10b0430:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]` |
| `0x10b0438` | `10b0438:	49 8d 7f 10          	lea    rdi,[r15+0x10]` |
| `0x10b043c` | `10b043c:	49 8d 76 10          	lea    rsi,[r14+0x10]` |
| `0x10b050f` | `10b050f:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]` |
| `0x10b0513` | `10b0513:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |
| `0x10b0517` | `10b0517:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]` |
| `0x10b051b` | `10b051b:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b0521` | `10b0521:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0` |
| `0x10b0525` | `10b0525:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0` |
| `0x10b0577` | `10b0577:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0` |
| `0x10b057a` | `10b057a:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0` |
| `0x10b05ca` | `10b05ca:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0x10b05ce` | `10b05ce:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0` |
| `0x10b05e2` | `10b05e2:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax` |
| `0x10b05f9` | `10b05f9:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0` |
| `0x10b0615` | `10b0615:	48 8d 05 2c c7 79 00 	lea    rax,[rip+0x79c72c]        # 184cd48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9430>` |
| `0x10b061c` | `10b061c:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10b0702` | `10b0702:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b0705` | `10b0705:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b076f` | `10b076f:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b0772` | `10b0772:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b077f` | `10b077f:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10b0785` | `10b0785:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b07b1` | `10b07b1:	41 8b 7e 10          	mov    edi,DWORD PTR [r14+0x10]` |
| `0x10b07d1` | `10b07d1:	48 8d 05 d8 c6 79 00 	lea    rax,[rip+0x79c6d8]        # 184ceb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9598>` |
| `0x10b0825` | `10b0825:	49 8b 2f             	mov    rbp,QWORD PTR [r15]` |
| `0x10b0871` | `10b0871:	49 2b 06             	sub    rax,QWORD PTR [r14]` |
| `0x10b087c` | `10b087c:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]` |
| `0x10b089d` | `10b089d:	49 8d 5e 10          	lea    rbx,[r14+0x10]` |
| `0x10b08da` | `10b08da:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10b08e0` | `10b08e0:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b0994` | `10b0994:	49 2b 07             	sub    rax,QWORD PTR [r15]` |
| `0x10b09a5` | `10b09a5:	49 2b 06             	sub    rax,QWORD PTR [r14]` |
| `0x10b09b0` | `10b09b0:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]` |
| `0x10b0a21` | `10b0a21:	49 89 3f             	mov    QWORD PTR [r15],rdi` |
| `0x10b0a2b` | `10b0a2b:	49 2b 36             	sub    rsi,QWORD PTR [r14]` |
| `0x10b0a37` | `10b0a37:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]` |
| `0x10b0a43` | `10b0a43:	ff 57 18             	call   QWORD PTR [rdi+0x18]` |
| `0x10b0a74` | `10b0a74:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10b0b07` | `10b0b07:	48 8d 05 0a 11 3a ff 	lea    rax,[rip+0xffffffffff3a110a]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>` |
| `0x10b0b22` | `10b0b22:	49 89 1f             	mov    QWORD PTR [r15],rbx` |
| `0x10b0b25` | `10b0b25:	48 8d 05 38 b9 9c ff 	lea    rax,[rip+0xffffffffff9cb938]        # a7c464 <JNI_OnUnload@@Base+0x3d31>` |
| `0x10b0b2c` | `10b0b2c:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax` |
| `0x10b0b30` | `10b0b30:	48 8d 05 39 00 00 00 	lea    rax,[rip+0x39]        # 10b0b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277f86>` |
| `0x10b0b70` | `10b0b70:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]` |
| `0x10b0b7e` | `10b0b7e:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b0b81` | `10b0b81:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b0b8e` | `10b0b8e:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b0b94` | `10b0b94:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b0bca` | `10b0bca:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0x10b0be9` | `10b0be9:	e8 12 d3 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b0c36` | `10b0c36:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]` |
| `0x10b0c49` | `10b0c49:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0x10b0c5a` | `10b0c5a:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b0c5d` | `10b0c5d:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0x10b0c64` | `10b0c64:	4c 2b 73 08          	sub    r14,QWORD PTR [rbx+0x8]` |
| `0x10b0c85` | `10b0c85:	e8 76 d2 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b0ccd` | `10b0ccd:	48 8d 04 d0          	lea    rax,[rax+rdx*8]` |
| `0x10b0cdb` | `10b0cdb:	e8 20 d2 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b0d0d` | `10b0d0d:	4c 8b 73 10          	mov    r14,QWORD PTR [rbx+0x10]` |
| `0x10b0d16` | `10b0d16:	4c 3b 73 08          	cmp    r14,QWORD PTR [rbx+0x8]` |
| `0x10b0d2d` | `10b0d2d:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b0d35` | `10b0d35:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]` |
| `0x10b0d39` | `10b0d39:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0x10b0d3c` | `10b0d3c:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b0d3f` | `10b0d3f:	4d 89 77 08          	mov    QWORD PTR [r15+0x8],r14` |
| `0x10b0d43` | `10b0d43:	41 0f 28 47 10       	movaps xmm0,XMMWORD PTR [r15+0x10]` |
| `0x10b0d48` | `10b0d48:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]` |
| `0x10b0d4c` | `10b0d4c:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0` |
| `0x10b0d50` | `10b0d50:	41 0f 29 4f 10       	movaps XMMWORD PTR [r15+0x10],xmm1` |
| `0x10b0d81` | `10b0d81:	e8 7a d1 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b0d8b` | `10b0d8b:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10b0d99` | `10b0d99:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]` |
| `0x10b0da0` | `10b0da0:	49 89 0e             	mov    QWORD PTR [r14],rcx` |
| `0x10b0da7` | `10b0da7:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0x10b0ec7` | `10b0ec7:	48 8d 44 24 40       	lea    rax,[rsp+0x40]` |
| `0x10b0f46` | `10b0f46:	f3 41 0f 6f 47 08    	movdqu xmm0,XMMWORD PTR [r15+0x8]` |
| `0x10b0fdc` | `10b0fdc:	f3 41 0f 6f 47 08    	movdqu xmm0,XMMWORD PTR [r15+0x8]` |
| `0x10b1015` | `10b1015:	f3 41 0f 6f 46 08    	movdqu xmm0,XMMWORD PTR [r14+0x8]` |
| `0x10b10ab` | `10b10ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b110a` | `10b110a:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]` |
| `0x10b1128` | `10b1128:	4c 8b 75 08          	mov    r14,QWORD PTR [rbp+0x8]` |
| `0x10b1142` | `10b1142:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b1177` | `10b1177:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10b11d1` | `10b11d1:	49 03 07             	add    rax,QWORD PTR [r15]` |
| `0x10b11d9` | `10b11d9:	4d 8b 67 08          	mov    r12,QWORD PTR [r15+0x8]` |
| `0x10b11f4` | `10b11f4:	4c 89 33             	mov    QWORD PTR [rbx],r14` |
| `0x10b11f7` | `10b11f7:	f3 0f 7f 4b 08       	movdqu XMMWORD PTR [rbx+0x8],xmm1` |
| `0x10b1213` | `10b1213:	48 8d 05 76 bb 79 00 	lea    rax,[rip+0x79bb76]        # 184cd90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9478>` |
| `0x10b121a` | `10b121a:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10b12a2` | `10b12a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b12a5` | `10b12a5:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b12b2` | `10b12b2:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b12b8` | `10b12b8:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b12ee` | `10b12ee:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b12f4` | `10b12f4:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b1357` | `10b1357:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b135d` | `10b135d:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10b138d` | `10b138d:	8b 7f 10             	mov    edi,DWORD PTR [rdi+0x10]` |
| `0x10b13ac` | `10b13ac:	48 8d 05 65 ba 79 00 	lea    rax,[rip+0x79ba65]        # 184ce18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9500>` |
| `0x10b13fc` | `10b13fc:	4d 8b 2f             	mov    r13,QWORD PTR [r15]` |
| `0x10b1447` | `10b1447:	49 2b 06             	sub    rax,QWORD PTR [r14]` |
| `0x10b1452` | `10b1452:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]` |
| `0x10b1508` | `10b1508:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0x10b1527` | `10b1527:	e8 d4 c9 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b15c5` | `10b15c5:	48 8d 05 4c 06 3a ff 	lea    rax,[rip+0xffffffffff3a064c]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>` |
| `0x10b15e0` | `10b15e0:	49 89 1f             	mov    QWORD PTR [r15],rbx` |
| `0x10b15e3` | `10b15e3:	48 8d 05 7a ae 9c ff 	lea    rax,[rip+0xffffffffff9cae7a]        # a7c464 <JNI_OnUnload@@Base+0x3d31>` |
| `0x10b15ea` | `10b15ea:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax` |
| `0x10b15ee` | `10b15ee:	48 8d 05 39 00 00 00 	lea    rax,[rip+0x39]        # 10b162e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278a44>` |
| `0x10b162e` | `10b162e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]` |
| `0x10b163c` | `10b163c:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b163f` | `10b163f:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b164c` | `10b164c:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b1652` | `10b1652:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b1689` | `10b1689:	48 83 7b 10 00       	cmp    QWORD PTR [rbx+0x10],0x0` |
| `0x10b16bf` | `10b16bf:	48 8d 05 6a 6b 84 00 	lea    rax,[rip+0x846b6a]        # 18f8230 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f640>` |
| `0x10b1715` | `10b1715:	48 8d 05 44 6a 84 00 	lea    rax,[rip+0x846a44]        # 18f8160 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f570>` |
| `0x10b1735` | `10b1735:	48 83 7b 10 00       	cmp    QWORD PTR [rbx+0x10],0x0` |
| `0x10b176b` | `10b176b:	48 8d 05 06 6d 84 00 	lea    rax,[rip+0x846d06]        # 18f8478 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f888>` |
| `0x10b17c1` | `10b17c1:	48 8d 05 e0 6b 84 00 	lea    rax,[rip+0x846be0]        # 18f83a8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f7b8>` |
| `0x10b1848` | `10b1848:	41 80 7f 10 00       	cmp    BYTE PTR [r15+0x10],0x0` |
| `0x10b1857` | `10b1857:	48 8d 43 50          	lea    rax,[rbx+0x50]` |
| `0x10b1894` | `10b1894:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10b18a2` | `10b18a2:	48 8d 44 24 78       	lea    rax,[rsp+0x78]` |
| `0x10b1970` | `10b1970:	49 8d 45 ff          	lea    rax,[r13-0x1]` |
| `0x10b1979` | `10b1979:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]` |
| `0x10b1984` | `10b1984:	49 8d 7f 10          	lea    rdi,[r15+0x10]` |
| `0x10b19bb` | `10b19bb:	4d 8b 3f             	mov    r15,QWORD PTR [r15]` |
| `0x10b19c8` | `10b19c8:	e8 33 c5 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b19d0` | `10b19d0:	49 8d 44 24 38       	lea    rax,[r12+0x38]` |
| `0x10b19da` | `10b19da:	49 83 27 00          	and    QWORD PTR [r15],0x0` |
| `0x10b19f2` | `10b19f2:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax` |
| `0x10b19f6` | `10b19f6:	49 8d 7f 10          	lea    rdi,[r15+0x10]` |
| `0x10b1afe` | `10b1afe:	4a 8d 04 68          	lea    rax,[rax+r13*2]` |
| `0x10b1b3d` | `10b1b3d:	48 8d 45 ff          	lea    rax,[rbp-0x1]` |
| `0x10b1b73` | `10b1b73:	e8 88 c3 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b1bb1` | `10b1bb1:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]` |
| `0x10b1bc0` | `10b1bc0:	49 8d 47 ff          	lea    rax,[r15-0x1]` |
| `0x10b1c08` | `10b1c08:	4c 8b 07             	mov    r8,QWORD PTR [rdi]` |
| `0x10b1c4a` | `10b1c4a:	48 89 17             	mov    QWORD PTR [rdi],rdx` |
| `0x10b1cd4` | `10b1cd4:	48 8d 47 ff          	lea    rax,[rdi-0x1]` |
| `0x10b1d26` | `10b1d26:	49 8d 45 ff          	lea    rax,[r13-0x1]` |
| `0x10b1d64` | `10b1d64:	49 89 0f             	mov    QWORD PTR [r15],rcx` |
| `0x10b1d71` | `10b1d71:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0x10b1d7e` | `10b1d7e:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10b1db9` | `10b1db9:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0x10b1e6a` | `10b1e6a:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]` |
| `0x10b1f4f` | `10b1f4f:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]` |
| `0x10b1faf` | `10b1faf:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]` |
| `0x10b200a` | `10b200a:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0x10b200d` | `10b200d:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]` |
| `0x10b2020` | `10b2020:	49 8d 40 ff          	lea    rax,[r8-0x1]` |
| `0x10b2039` | `10b2039:	4d 8b 27             	mov    r12,QWORD PTR [r15]` |
| `0x10b207e` | `10b207e:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]` |
| `0x10b20ab` | `10b20ab:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0x10b20b3` | `10b20b3:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]` |
| `0x10b20da` | `10b20da:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10b20e1` | `10b20e1:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0x10b20eb` | `10b20eb:	49 83 26 00          	and    QWORD PTR [r14],0x0` |
| `0x10b20f8` | `10b20f8:	4c 89 37             	mov    QWORD PTR [rdi],r14` |
| `0x10b20fb` | `10b20fb:	4c 89 57 08          	mov    QWORD PTR [rdi+0x8],r10` |
| `0x10b20ff` | `10b20ff:	c6 47 10 01          	mov    BYTE PTR [rdi+0x10],0x1` |
| `0x10b2146` | `10b2146:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0x10b21ba` | `10b21ba:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b21bd` | `10b21bd:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10b226b` | `10b226b:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]` |
| `0x10b226f` | `10b226f:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b2283` | `10b2283:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]` |
| `0x10b2287` | `10b2287:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b22b4` | `10b22b4:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]` |
| `0x10b22bd` | `10b22bd:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0x10b22c0` | `10b22c0:	48 83 23 00          	and    QWORD PTR [rbx],0x0` |
| `0x10b22de` | `10b22de:	4c 8b 33             	mov    r14,QWORD PTR [rbx]` |
| `0x10b22e1` | `10b22e1:	48 8d 7b 10          	lea    rdi,[rbx+0x10]` |
| `0x10b2372` | `10b2372:	41 c6 07 07          	mov    BYTE PTR [r15],0x7` |
| `0x10b2379` | `10b2379:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0` |
| `0x10b23cf` | `10b23cf:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]` |
| `0x10b23f2` | `10b23f2:	4c 8b 03             	mov    r8,QWORD PTR [rbx]` |
| `0x10b23f5` | `10b23f5:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10b2403` | `10b2403:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0x10b2481` | `10b2481:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]` |
| `0x10b2484` | `10b2484:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0x10b248d` | `10b248d:	80 7f 10 00          	cmp    BYTE PTR [rdi+0x10],0x0` |
| `0x10b2493` | `10b2493:	48 8d 7b 10          	lea    rdi,[rbx+0x10]` |
| `0x10b2564` | `10b2564:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b25a3` | `10b25a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b25a6` | `10b25a6:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10b2652` | `10b2652:	41 ff 54 24 10       	call   QWORD PTR [r12+0x10]` |
| `0x10b2665` | `10b2665:	41 ff 57 10          	call   QWORD PTR [r15+0x10]` |
| `0x10b266f` | `10b266f:	41 0f 10 4f 10       	movups xmm1,XMMWORD PTR [r15+0x10]` |
| `0x10b2674` | `10b2674:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0` |
| `0x10b269c` | `10b269c:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0` |
| `0x10b26b4` | `10b26b4:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]` |
| `0x10b2727` | `10b2727:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0x10b272b` | `10b272b:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b272e` | `10b272e:	ff 90 98 01 00 00    	call   QWORD PTR [rax+0x198]` |
| `0x10b2737` | `10b2737:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0x10b273b` | `10b273b:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b273e` | `10b273e:	ff 90 90 01 00 00    	call   QWORD PTR [rax+0x190]` |
| `0x10b278b` | `10b278b:	48 8d 05 7e a8 79 00 	lea    rax,[rip+0x79a87e]        # 184d010 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96f8>` |
| `0x10b27bd` | `10b27bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b27c0` | `10b27c0:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]` |
| `0x10b27c6` | `10b27c6:	48 8d 05 8b a8 79 00 	lea    rax,[rip+0x79a88b]        # 184d058 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9740>` |
| `0x10b27d9` | `10b27d9:	4c 89 75 08          	mov    QWORD PTR [rbp+0x8],r14` |
| `0x10b27e5` | `10b27e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b27eb` | `10b27eb:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0x10b27f9` | `10b27f9:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b27fc` | `10b27fc:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]` |
| `0x10b2814` | `10b2814:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]` |
| `0x10b2890` | `10b2890:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b2893` | `10b2893:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b2896` | `10b2896:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]` |
| `0x10b289a` | `10b289a:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]` |
| `0x10b289e` | `10b289e:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b2989` | `10b2989:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b298c` | `10b298c:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10b29bf` | `10b29bf:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]` |
| `0x10b29d4` | `10b29d4:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0` |
| `0x10b2a87` | `10b2a87:	e8 74 b4 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b2a96` | `10b2a96:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]` |
| `0x10b2aa0` | `10b2aa0:	48 8d 05 b1 a5 79 00 	lea    rax,[rip+0x79a5b1]        # 184d058 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9740>` |
| `0x10b2aaa` | `10b2aaa:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x10b2ac7` | `10b2ac7:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]` |
| `0x10b2acb` | `10b2acb:	48 8d 05 86 dd 89 00 	lea    rax,[rip+0x89dd86]        # 1950858 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x194a0>` |
| `0x10b2b39` | `10b2b39:	e8 c2 b3 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b2b48` | `10b2b48:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]` |
| `0x10b2b52` | `10b2b52:	48 8d 05 b7 a4 79 00 	lea    rax,[rip+0x79a4b7]        # 184d010 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96f8>` |
| `0x10b2b5c` | `10b2b5c:	0f 10 47 08          	movups xmm0,XMMWORD PTR [rdi+0x8]` |
| `0x10b2b88` | `10b2b88:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]` |
| `0x10b2bdd` | `10b2bdd:	4d 63 67 10          	movsxd r12,DWORD PTR [r15+0x10]` |
| `0x10b2bee` | `10b2bee:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0` |
| `0x10b2bf2` | `10b2bf2:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0` |
| `0x10b2c26` | `10b2c26:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0` |
| `0x10b2c2a` | `10b2c2a:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0` |
| `0x10b2ccc` | `10b2ccc:	48 8d 45 01          	lea    rax,[rbp+0x1]` |
| `0x10b2da4` | `10b2da4:	4c 8b 37             	mov    r14,QWORD PTR [rdi]` |
| `0x10b2e20` | `10b2e20:	48 8d 05 a9 a2 79 00 	lea    rax,[rip+0x79a2a9]        # 184d0d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x97b8>` |
| `0x10b2e37` | `10b2e37:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]` |
| `0x10b2eaf` | `10b2eaf:	e8 4c b0 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b2ebf` | `10b2ebf:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax` |
| `0x10b2ef0` | `10b2ef0:	48 8d 05 9f 04 00 00 	lea    rax,[rip+0x49f]        # 10b3396 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a7ac>` |
| `0x10b2efb` | `10b2efb:	48 8d 05 cc 04 00 00 	lea    rax,[rip+0x4cc]        # 10b33ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a7e4>` |
| `0x10b2f02` | `10b2f02:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax` |
| `0x10b2f14` | `10b2f14:	4c 8b 6f 08          	mov    r13,QWORD PTR [rdi+0x8]` |
| `0x10b2f1b` | `10b2f1b:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0` |
| `0x10b2f3a` | `10b2f3a:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd` |
| `0x10b2fb6` | `10b2fb6:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10b309e` | `10b309e:	48 8b 2f             	mov    rbp,QWORD PTR [rdi]` |
| `0x10b30b6` | `10b30b6:	4c 8b 7d 08          	mov    r15,QWORD PTR [rbp+0x8]` |
| `0x10b30d5` | `10b30d5:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10b30e7` | `10b30e7:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0x10b319d` | `10b319d:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10b31b0` | `10b31b0:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b31ee` | `10b31ee:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0x10b3202` | `10b3202:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0x10b320c` | `10b320c:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b3237` | `10b3237:	e8 c4 ac 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b32a8` | `10b32a8:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0` |
| `0x10b32be` | `10b32be:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0x10b32d1` | `10b32d1:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b32d9` | `10b32d9:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]` |
| `0x10b33a3` | `10b33a3:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]` |
| `0x10b3414` | `10b3414:	48 8d 77 10          	lea    rsi,[rdi+0x10]` |
| `0x10b341e` | `10b341e:	e8 0d 7f 9f ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0x10b3423` | `10b3423:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0x10b346f` | `10b346f:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0` |
| `0x10b3473` | `10b3473:	48 8d 05 06 a9 7a 00 	lea    rax,[rip+0x7aa906]        # 185dd80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a468>` |
| `0x10b347e` | `10b347e:	41 83 67 10 00       	and    DWORD PTR [r15+0x10],0x0` |
| `0x10b3547` | `10b3547:	e8 b4 a9 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b3556` | `10b3556:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]` |
| `0x10b3560` | `10b3560:	48 8d 05 69 9b 79 00 	lea    rax,[rip+0x799b69]        # 184d0d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x97b8>` |
| `0x10b356a` | `10b356a:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x10b357a` | `10b357a:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]` |
| `0x10b35ad` | `10b35ad:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b35b7` | `10b35b7:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0x10b35c4` | `10b35c4:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b35c7` | `10b35c7:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10b35cd` | `10b35cd:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0x10b35d1` | `10b35d1:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b35da` | `10b35da:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10b361d` | `10b361d:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]` |
| `0x10b3658` | `10b3658:	48 8d 05 41 9a 79 00 	lea    rax,[rip+0x799a41]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>` |
| `0x10b365f` | `10b365f:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10b3794` | `10b3794:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b37a5` | `10b37a5:	c6 03 00             	mov    BYTE PTR [rbx],0x0` |
| `0x10b37aa` | `10b37aa:	88 43 10             	mov    BYTE PTR [rbx+0x10],al` |
| `0x10b37e3` | `10b37e3:	4d 8b 3e             	mov    r15,QWORD PTR [r14]` |
| `0x10b37e6` | `10b37e6:	49 8d 7e 10          	lea    rdi,[r14+0x10]` |
| `0x10b381b` | `10b381b:	4d 8b 3e             	mov    r15,QWORD PTR [r14]` |
| `0x10b3837` | `10b3837:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]` |
| `0x10b383b` | `10b383b:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0` |
| `0x10b38b5` | `10b38b5:	e8 46 a6 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b38f8` | `10b38f8:	e8 03 a6 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b390c` | `10b390c:	e8 ef a5 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b3932` | `10b3932:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0x10b3935` | `10b3935:	48 8d 05 9e c2 a8 ff 	lea    rax,[rip+0xffffffffffa8c29e]        # b3fbda <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8cb7a>` |
| `0x10b393c` | `10b393c:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax` |
| `0x10b3940` | `10b3940:	48 8d 05 f1 11 00 00 	lea    rax,[rip+0x11f1]        # 10b4b38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27bf4e>` |
| `0x10b399f` | `10b399f:	e8 5c a5 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b39c4` | `10b39c4:	48 8d 05 43 e9 aa ff 	lea    rax,[rip+0xffffffffffaae943]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>` |
| `0x10b39d3` | `10b39d3:	48 8d 05 3c 13 00 00 	lea    rax,[rip+0x133c]        # 10b4d16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27c12c>` |
| `0x10b3a4b` | `10b3a4b:	48 8d 05 86 5a 7f 00 	lea    rax,[rip+0x7f5a86]        # 18a94d8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x16418>` |
| `0x10b3a5a` | `10b3a5a:	48 8d 05 97 bd 38 ff 	lea    rax,[rip+0xffffffffff38bd97]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>` |
| `0x10b3a8c` | `10b3a8c:	4c 8b 13             	mov    r10,QWORD PTR [rbx]` |
| `0x10b3aa3` | `10b3aa3:	41 ff 52 30          	call   QWORD PTR [r10+0x30]` |
| `0x10b3c7f` | `10b3c7f:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10b3ccb` | `10b3ccb:	e8 30 a2 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b3cfc` | `10b3cfc:	48 8d 84 24 98 00 00 	lea    rax,[rsp+0x98]` |
| `0x10b3d3e` | `10b3d3e:	e8 bd a1 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b3d4e` | `10b3d4e:	48 8d 84 24 a8 00 00 	lea    rax,[rsp+0xa8]` |
| `0x10b3dc2` | `10b3dc2:	48 8d 84 24 98 00 00 	lea    rax,[rsp+0x98]` |
| `0x10b3e01` | `10b3e01:	48 8d 04 d0          	lea    rax,[rax+rdx*8]` |
| `0x10b3ece` | `10b3ece:	48 8d 84 24 98 00 00 	lea    rax,[rsp+0x98]` |
| `0x10b3f06` | `10b3f06:	48 8d 04 d0          	lea    rax,[rax+rdx*8]` |
| `0x10b3f7a` | `10b3f7a:	4d 89 2f             	mov    QWORD PTR [r15],r13` |
| `0x10b4086` | `10b4086:	48 8d 04 d0          	lea    rax,[rax+rdx*8]` |
| `0x10b4228` | `10b4228:	e8 d3 9c 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b4243` | `10b4243:	48 8d 05 36 8f 79 00 	lea    rax,[rip+0x798f36]        # 184d180 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9868>` |
| `0x10b424e` | `10b424e:	49 8d 44 24 20       	lea    rax,[r12+0x20]` |
| `0x10b43ee` | `10b43ee:	48 8d 05 4f 98 a2 ff 	lea    rax,[rip+0xffffffffffa2984f]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>` |
| `0x10b43fd` | `10b43fd:	48 8d 05 f2 2d 00 00 	lea    rax,[rip+0x2df2]        # 10b71f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e60c>` |
| `0x10b4699` | `10b4699:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]` |
| `0x10b46a2` | `10b46a2:	45 39 7e 10          	cmp    DWORD PTR [r14+0x10],r15d` |
| `0x10b46c9` | `10b46c9:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0x10b46d4` | `10b46d4:	e8 27 98 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b46ed` | `10b46ed:	49 83 26 00          	and    QWORD PTR [r14],0x0` |
| `0x10b46f9` | `10b46f9:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15` |
| `0x10b46fd` | `10b46fd:	45 89 7e 10          	mov    DWORD PTR [r14+0x10],r15d` |
| `0x10b47ab` | `10b47ab:	48 8d 04 68          	lea    rax,[rax+rbp*2]` |
| `0x10b47f5` | `10b47f5:	48 8d 45 ff          	lea    rax,[rbp-0x1]` |
| `0x10b482a` | `10b482a:	49 89 0e             	mov    QWORD PTR [r14],rcx` |
| `0x10b4839` | `10b4839:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b483c` | `10b483c:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10b483f` | `10b483f:	4c 89 33             	mov    QWORD PTR [rbx],r14` |
| `0x10b4846` | `10b4846:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10b488a` | `10b488a:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0x10b48fd` | `10b48fd:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0x10b4900` | `10b4900:	49 89 5f 08          	mov    QWORD PTR [r15+0x8],rbx` |
| `0x10b4904` | `10b4904:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]` |
| `0x10b4b13` | `10b4b13:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]` |
| `0x10b4b28` | `10b4b28:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0` |
| `0x10b4b5b` | `10b4b5b:	4c 8b 27             	mov    r12,QWORD PTR [rdi]` |
| `0x10b4bd3` | `10b4bd3:	ff 17                	call   QWORD PTR [rdi]` |
| `0x10b4bd9` | `10b4bd9:	49 8d 45 ff          	lea    rax,[r13-0x1]` |
| `0x10b4be6` | `10b4be6:	41 ff 55 08          	call   QWORD PTR [r13+0x8]` |
| `0x10b4d3b` | `10b4d3b:	4c 8b 27             	mov    r12,QWORD PTR [rdi]` |
| `0x10b4da5` | `10b4da5:	48 8d 7b 10          	lea    rdi,[rbx+0x10]` |
| `0x10b4eb3` | `10b4eb3:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]` |
| `0x10b50ea` | `10b50ea:	49 8d 47 ff          	lea    rax,[r15-0x1]` |
| `0x10b50f3` | `10b50f3:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]` |
| `0x10b50fc` | `10b50fc:	48 8d 7d 10          	lea    rdi,[rbp+0x10]` |
| `0x10b51b2` | `10b51b2:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]` |
| `0x10b51df` | `10b51df:	e8 1c 8d 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b543e` | `10b543e:	e8 bd 8a 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b547f` | `10b547f:	48 8d 05 d8 0e 00 00 	lea    rax,[rip+0xed8]        # 10b635e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d774>` |
| `0x10b548e` | `10b548e:	48 8d 05 f5 0e 00 00 	lea    rax,[rip+0xef5]        # 10b638a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d7a0>` |
| `0x10b549d` | `10b549d:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b54f5` | `10b54f5:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10b56c6` | `10b56c6:	0f b6 0f             	movzx  ecx,BYTE PTR [rdi]` |
| `0x10b5700` | `10b5700:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax` |
| `0x10b5707` | `10b5707:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0x10b576a` | `10b576a:	4c 8b 6f 08          	mov    r13,QWORD PTR [rdi+0x8]` |
| `0x10b576e` | `10b576e:	48 8b 6f 10          	mov    rbp,QWORD PTR [rdi+0x10]` |
| `0x10b57d2` | `10b57d2:	4c 8b 6b 08          	mov    r13,QWORD PTR [rbx+0x8]` |
| `0x10b57d6` | `10b57d6:	48 8b 6b 10          	mov    rbp,QWORD PTR [rbx+0x10]` |
| `0x10b57f8` | `10b57f8:	4c 8b 6b 08          	mov    r13,QWORD PTR [rbx+0x8]` |
| `0x10b57fc` | `10b57fc:	48 8b 6b 10          	mov    rbp,QWORD PTR [rbx+0x10]` |
| `0x10b5804` | `10b5804:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13` |
| `0x10b5846` | `10b5846:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]` |
| `0x10b584a` | `10b584a:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]` |
| `0x10b5861` | `10b5861:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |
| `0x10b5865` | `10b5865:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0x10b588d` | `10b588d:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]` |
| `0x10b58a2` | `10b58a2:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0` |
| `0x10b58b3` | `10b58b3:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]` |
| `0x10b58b6` | `10b58b6:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0x10b58bf` | `10b58bf:	80 7f 10 00          	cmp    BYTE PTR [rdi+0x10],0x0` |
| `0x10b58db` | `10b58db:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]` |
| `0x10b58de` | `10b58de:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0x10b5910` | `10b5910:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10b5927` | `10b5927:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]` |
| `0x10b592b` | `10b592b:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]` |
| `0x10b5934` | `10b5934:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0x10b594a` | `10b594a:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0x10b5997` | `10b5997:	49 2b 06             	sub    rax,QWORD PTR [r14]` |
| `0x10b59a2` | `10b59a2:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]` |
| `0x10b59b4` | `10b59b4:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]` |
| `0x10b59b8` | `10b59b8:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]` |
| `0x10b59d1` | `10b59d1:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]` |
| `0x10b59d5` | `10b59d5:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]` |
| `0x10b59dd` | `10b59dd:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0x10b5a1d` | `10b5a1d:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]` |
| `0x10b5a21` | `10b5a21:	48 8d 04 c1          	lea    rax,[rcx+rax*8]` |
| `0x10b5a25` | `10b5a25:	48 39 4f 10          	cmp    QWORD PTR [rdi+0x10],rcx` |
| `0x10b5a59` | `10b5a59:	4c 8b 6f 08          	mov    r13,QWORD PTR [rdi+0x8]` |
| `0x10b5a92` | `10b5a92:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b5aaf` | `10b5aaf:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]` |
| `0x10b5ab8` | `10b5ab8:	41 39 6e 10          	cmp    DWORD PTR [r14+0x10],ebp` |
| `0x10b5adf` | `10b5adf:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0x10b5aea` | `10b5aea:	48 8d 5f 10          	lea    rbx,[rdi+0x10]` |
| `0x10b5af1` | `10b5af1:	e8 0a 84 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b5ba8` | `10b5ba8:	4a 8d 04 68          	lea    rax,[rax+r13*2]` |
| `0x10b5be9` | `10b5be9:	49 8d 45 ff          	lea    rax,[r13-0x1]` |
| `0x10b5c1f` | `10b5c1f:	49 89 0e             	mov    QWORD PTR [r14],rcx` |
| `0x10b5c2c` | `10b5c2c:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10b5c36` | `10b5c36:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10b5c6d` | `10b5c6d:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0x10b5ce6` | `10b5ce6:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]` |
| `0x10b5cf2` | `10b5cf2:	48 83 43 08 08       	add    QWORD PTR [rbx+0x8],0x8` |
| `0x10b5d26` | `10b5d26:	48 2b 0f             	sub    rcx,QWORD PTR [rdi]` |
| `0x10b5d2d` | `10b5d2d:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x10b5d31` | `10b5d31:	48 8b 57 10          	mov    rdx,QWORD PTR [rdi+0x10]` |
| `0x10b5d5e` | `10b5d5e:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]` |
| `0x10b5d62` | `10b5d62:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]` |
| `0x10b5d72` | `10b5d72:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10b5d75` | `10b5d75:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10b5d79` | `10b5d79:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10b5d7d` | `10b5d7d:	48 8d 04 c8          	lea    rax,[rax+rcx*8]` |
| `0x10b5d8d` | `10b5d8d:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]` |
| `0x10b5d91` | `10b5d91:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]` |
| `0x10b5d95` | `10b5d95:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]` |
| `0x10b5d99` | `10b5d99:	0f 10 0b             	movups xmm1,XMMWORD PTR [rbx]` |
| `0x10b5d9c` | `10b5d9c:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b5d9f` | `10b5d9f:	41 0f 29 0e          	movaps XMMWORD PTR [r14],xmm1` |
| `0x10b5da7` | `10b5da7:	0f 10 43 10          	movups xmm0,XMMWORD PTR [rbx+0x10]` |
| `0x10b5dab` | `10b5dab:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0x10b5db5` | `10b5db5:	48 89 73 10          	mov    QWORD PTR [rbx+0x10],rsi` |
| `0x10b5dbd` | `10b5dbd:	41 0f 29 46 10       	movaps XMMWORD PTR [r14+0x10],xmm0` |
| `0x10b5e2c` | `10b5e2c:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x10b5eb3` | `10b5eb3:	0f b7 03             	movzx  eax,WORD PTR [rbx]` |
| `0x10b5eee` | `10b5eee:	48 8b 6b 08          	mov    rbp,QWORD PTR [rbx+0x8]` |
| `0x10b5f28` | `10b5f28:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b5f3c` | `10b5f3c:	48 8d 45 ff          	lea    rax,[rbp-0x1]` |
| `0x10b5f90` | `10b5f90:	4c 8d 73 10          	lea    r14,[rbx+0x10]` |
| `0x10b5f97` | `10b5f97:	e8 64 7f 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b6048` | `10b6048:	48 8d 04 68          	lea    rax,[rax+rbp*2]` |
| `0x10b6088` | `10b6088:	49 8d 44 24 ff       	lea    rax,[r12-0x1]` |
| `0x10b609d` | `10b609d:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]` |
| `0x10b60be` | `10b60be:	e8 3d 7e 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b60ce` | `10b60ce:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15` |
| `0x10b60d4` | `10b60d4:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]` |
| `0x10b60f5` | `10b60f5:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]` |
| `0x10b6104` | `10b6104:	49 8d 47 ff          	lea    rax,[r15-0x1]` |
| `0x10b613a` | `10b613a:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b6146` | `10b6146:	4c 8b 07             	mov    r8,QWORD PTR [rdi]` |
| `0x10b6176` | `10b6176:	48 8b 13             	mov    rdx,QWORD PTR [rbx]` |
| `0x10b6183` | `10b6183:	48 89 17             	mov    QWORD PTR [rdi],rdx` |
| `0x10b6186` | `10b6186:	48 8b 13             	mov    rdx,QWORD PTR [rbx]` |
| `0x10b6193` | `10b6193:	48 8b 13             	mov    rdx,QWORD PTR [rbx]` |
| `0x10b620b` | `10b620b:	48 8d 47 ff          	lea    rax,[rdi-0x1]` |
| `0x10b6250` | `10b6250:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0` |
| `0x10b6255` | `10b6255:	48 8b 6b 08          	mov    rbp,QWORD PTR [rbx+0x8]` |
| `0x10b6259` | `10b6259:	48 8d 45 ff          	lea    rax,[rbp-0x1]` |
| `0x10b6281` | `10b6281:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b629b` | `10b629b:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0x10b62a3` | `10b62a3:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13` |
| `0x10b62a7` | `10b62a7:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b62df` | `10b62df:	48 03 03             	add    rax,QWORD PTR [rbx]` |
| `0x10b62ea` | `10b62ea:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0x10b63ac` | `10b63ac:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]` |
| `0x10b63c4` | `10b63c4:	49 8b 1f             	mov    rbx,QWORD PTR [r15]` |
| `0x10b63dd` | `10b63dd:	41 8b 77 08          	mov    esi,DWORD PTR [r15+0x8]` |
| `0x10b6458` | `10b6458:	41 8b 77 08          	mov    esi,DWORD PTR [r15+0x8]` |
| `0x10b647b` | `10b647b:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0x10b6484` | `10b6484:	41 8b 77 08          	mov    esi,DWORD PTR [r15+0x8]` |
| `0x10b6530` | `10b6530:	49 8d 45 ff          	lea    rax,[r13-0x1]` |
| `0x10b6539` | `10b6539:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]` |
| `0x10b6542` | `10b6542:	48 8d 7d 10          	lea    rdi,[rbp+0x10]` |
| `0x10b65ce` | `10b65ce:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x10b6665` | `10b6665:	48 89 37             	mov    QWORD PTR [rdi],rsi` |
| `0x10b69ad` | `10b69ad:	4c 8b 4f 08          	mov    r9,QWORD PTR [rdi+0x8]` |
| `0x10b69e6` | `10b69e6:	4c 8b 37             	mov    r14,QWORD PTR [rdi]` |
| `0x10b6a71` | `10b6a71:	4c 8d 67 10          	lea    r12,[rdi+0x10]` |
| `0x10b6a7a` | `10b6a7a:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]` |
| `0x10b6af5` | `10b6af5:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b6b04` | `10b6b04:	4d 89 07             	mov    QWORD PTR [r15],r8` |
| `0x10b6b14` | `10b6b14:	4c 89 17             	mov    QWORD PTR [rdi],r10` |
| `0x10b6b17` | `10b6b17:	4c 89 67 08          	mov    QWORD PTR [rdi+0x8],r12` |
| `0x10b6b1b` | `10b6b1b:	c6 47 10 01          	mov    BYTE PTR [rdi+0x10],0x1` |
| `0x10b6b72` | `10b6b72:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0` |
| `0x10b6b77` | `10b6b77:	48 8d 05 5a 29 7f 00 	lea    rax,[rip+0x7f295a]        # 18a94d8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x16418>` |
| `0x10b6b7e` | `10b6b7e:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0x10b6b81` | `10b6b81:	48 8d 05 70 8c 38 ff 	lea    rax,[rip+0xffffffffff388c70]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>` |
| `0x10b6b9f` | `10b6b9f:	4d 8b 16             	mov    r10,QWORD PTR [r14]` |
| `0x10b6bb2` | `10b6bb2:	41 ff 52 30          	call   QWORD PTR [r10+0x30]` |
| `0x10b6c4d` | `10b6c4d:	66 89 07             	mov    WORD PTR [rdi],ax` |
| `0x10b6c50` | `10b6c50:	48 8d 5f 08          	lea    rbx,[rdi+0x8]` |
| `0x10b6cdc` | `10b6cdc:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]` |
| `0x10b6ce2` | `10b6ce2:	48 2b 4f 08          	sub    rcx,QWORD PTR [rdi+0x8]` |
| `0x10b6d35` | `10b6d35:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]` |
| `0x10b6d48` | `10b6d48:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0x10b6d59` | `10b6d59:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]` |
| `0x10b6d5d` | `10b6d5d:	48 8b 2b             	mov    rbp,QWORD PTR [rbx]` |
| `0x10b6d60` | `10b6d60:	4c 8b 6b 08          	mov    r13,QWORD PTR [rbx+0x8]` |
| `0x10b6d85` | `10b6d85:	e8 76 71 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b6d93` | `10b6d93:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0x10b6d96` | `10b6d96:	48 83 43 10 08       	add    QWORD PTR [rbx+0x10],0x8` |
| `0x10b6ddd` | `10b6ddd:	e8 1e 71 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b6e57` | `10b6e57:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0x10b6e69` | `10b6e69:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx` |
| `0x10b6e6d` | `10b6e6d:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx` |
| `0x10b6e71` | `10b6e71:	48 8d 04 d0          	lea    rax,[rax+rdx*8]` |
| `0x10b6e79` | `10b6e79:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]` |
| `0x10b6e7d` | `10b6e7d:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]` |
| `0x10b6e89` | `10b6e89:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]` |
| `0x10b6e8d` | `10b6e8d:	0f 10 0b             	movups xmm1,XMMWORD PTR [rbx]` |
| `0x10b6e90` | `10b6e90:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b6e93` | `10b6e93:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1` |
| `0x10b6e97` | `10b6e97:	41 0f 28 47 10       	movaps xmm0,XMMWORD PTR [r15+0x10]` |
| `0x10b6e9c` | `10b6e9c:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]` |
| `0x10b6ea0` | `10b6ea0:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0` |
| `0x10b6ea4` | `10b6ea4:	41 0f 29 4f 10       	movaps XMMWORD PTR [r15+0x10],xmm1` |
| `0x10b6eb4` | `10b6eb4:	4c 8b 6b 08          	mov    r13,QWORD PTR [rbx+0x8]` |
| `0x10b6ebc` | `10b6ebc:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]` |
| `0x10b6ec4` | `10b6ec4:	48 89 4b 08          	mov    QWORD PTR [rbx+0x8],rcx` |
| `0x10b6f14` | `10b6f14:	48 8d 04 d0          	lea    rax,[rax+rdx*8]` |
| `0x10b6f61` | `10b6f61:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10b6f81` | `10b6f81:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]` |
| `0x10b6f85` | `10b6f85:	4c 3b 7b 08          	cmp    r15,QWORD PTR [rbx+0x8]` |
| `0x10b7038` | `10b7038:	48 8d 04 d0          	lea    rax,[rax+rdx*8]` |
| `0x10b70a5` | `10b70a5:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b70ad` | `10b70ad:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]` |
| `0x10b70b1` | `10b70b1:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10b70b4` | `10b70b4:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b70b7` | `10b70b7:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15` |
| `0x10b70bb` | `10b70bb:	41 0f 28 46 10       	movaps xmm0,XMMWORD PTR [r14+0x10]` |
| `0x10b70c0` | `10b70c0:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]` |
| `0x10b70c4` | `10b70c4:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0` |
| `0x10b70c8` | `10b70c8:	41 0f 29 4e 10       	movaps XMMWORD PTR [r14+0x10],xmm1` |
| `0x10b7146` | `10b7146:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0x10b714a` | `10b714a:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0` |
| `0x10b715e` | `10b715e:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax` |
| `0x10b7175` | `10b7175:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0` |
| `0x10b718a` | `10b718a:	48 8d 05 b7 5f 79 00 	lea    rax,[rip+0x795fb7]        # 184d148 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9830>` |
| `0x10b7191` | `10b7191:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10b71b7` | `10b71b7:	49 8d 46 ff          	lea    rax,[r14-0x1]` |
| `0x10b71c4` | `10b71c4:	41 ff 56 08          	call   QWORD PTR [r14+0x8]` |
| `0x10b7218` | `10b7218:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]` |
| `0x10b721b` | `10b721b:	8b 7f 08             	mov    edi,DWORD PTR [rdi+0x8]` |
| `0x10b7222` | `10b7222:	48 03 7b 08          	add    rdi,QWORD PTR [rbx+0x8]` |
| `0x10b722b` | `10b722b:	ff 0b                	dec    DWORD PTR [rbx]` |
| `0x10b725f` | `10b725f:	4c 8b 63 08          	mov    r12,QWORD PTR [rbx+0x8]` |
| `0x10b7268` | `10b7268:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0x10b735c` | `10b735c:	e8 9f 6b 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b7431` | `10b7431:	48 8d 04 68          	lea    rax,[rax+rbp*2]` |
| `0x10b7471` | `10b7471:	49 8d 45 ff          	lea    rax,[r13-0x1]` |
| `0x10b74a7` | `10b74a7:	e8 54 6a 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b74de` | `10b74de:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]` |
| `0x10b74ed` | `10b74ed:	48 8d 43 ff          	lea    rax,[rbx-0x1]` |
| `0x10b7532` | `10b7532:	4c 8b 07             	mov    r8,QWORD PTR [rdi]` |
| `0x10b7571` | `10b7571:	48 89 17             	mov    QWORD PTR [rdi],rdx` |
| `0x10b7615` | `10b7615:	48 8d 47 ff          	lea    rax,[rdi-0x1]` |
| `0x10b7664` | `10b7664:	48 8d 45 ff          	lea    rax,[rbp-0x1]` |
| `0x10b782d` | `10b782d:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]` |
| `0x10b7842` | `10b7842:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0` |
| `0x10b7852` | `10b7852:	48 8d 05 27 59 79 00 	lea    rax,[rip+0x795927]        # 184d180 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9868>` |
| `0x10b7859` | `10b7859:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10b794c` | `10b794c:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]` |
| `0x10b79f8` | `10b79f8:	e8 03 65 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b7a07` | `10b7a07:	48 8d 05 aa 57 79 00 	lea    rax,[rip+0x7957aa]        # 184d1b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x98a0>` |
| `0x10b7a0e` | `10b7a0e:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0x10b7a6a` | `10b7a6a:	49 89 2e             	mov    QWORD PTR [r14],rbp` |
| `0x10b7a6d` | `10b7a6d:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx` |
| `0x10b7b80` | `10b7b80:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]` |
| `0x10b7b96` | `10b7b96:	0f 10 43 10          	movups xmm0,XMMWORD PTR [rbx+0x10]` |
| `0x10b7b9f` | `10b7b9f:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0` |
| `0x10b7bd4` | `10b7bd4:	48 8d 05 dd 55 79 00 	lea    rax,[rip+0x7955dd]        # 184d1b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x98a0>` |
| `0x10b7bdb` | `10b7bdb:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10b7c81` | `10b7c81:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x10b7c85` | `10b7c85:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b7c88` | `10b7c88:	ff 90 80 01 00 00    	call   QWORD PTR [rax+0x180]` |
| `0x10b7c96` | `10b7c96:	48 8d 43 48          	lea    rax,[rbx+0x48]` |
| `0x10b7cb0` | `10b7cb0:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0x10b7cb3` | `10b7cb3:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]` |
| `0x10b7cd5` | `10b7cd5:	48 8d 05 ac 73 38 ff 	lea    rax,[rip+0xffffffffff3873ac]        # 43f088 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4c94>` |
| `0x10b7e11` | `10b7e11:	e8 ea 60 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b7e46` | `10b7e46:	48 8d 05 c3 00 00 00 	lea    rax,[rip+0xc3]        # 10b7f10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f326>` |
| `0x10b7e51` | `10b7e51:	48 8d 05 e2 00 00 00 	lea    rax,[rip+0xe2]        # 10b7f3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f350>` |
| `0x10b7e69` | `10b7e69:	ff 10                	call   QWORD PTR [rax]` |
| `0x10b7e6f` | `10b7e6f:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b7f5c` | `10b7f5c:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]` |
| `0x10b8161` | `10b8161:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10b816f` | `10b816f:	ff 90 70 01 00 00    	call   QWORD PTR [rax+0x170]` |
| `0x10b8185` | `10b8185:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0x10b81eb` | `10b81eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b81f3` | `10b81f3:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b81fe` | `10b81fe:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0` |
| `0x10b821a` | `10b821a:	41 89 57 10          	mov    DWORD PTR [r15+0x10],edx` |
| `0x10b8222` | `10b8222:	41 c7 47 08 03 00 00 	mov    DWORD PTR [r15+0x8],0x3` |
| `0x10b822a` | `10b822a:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0x10b8293` | `10b8293:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b829b` | `10b829b:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10b82a6` | `10b82a6:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0` |
| `0x10b82c2` | `10b82c2:	41 89 57 10          	mov    DWORD PTR [r15+0x10],edx` |
| `0x10b82ca` | `10b82ca:	41 c7 47 08 03 00 00 	mov    DWORD PTR [r15+0x8],0x3` |
| `0x10b82d2` | `10b82d2:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0x10b833b` | `10b833b:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b8343` | `10b8343:	ff 50 50             	call   QWORD PTR [rax+0x50]` |
| `0x10b834e` | `10b834e:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0` |
| `0x10b836a` | `10b836a:	41 89 57 10          	mov    DWORD PTR [r15+0x10],edx` |
| `0x10b8372` | `10b8372:	41 c7 47 08 03 00 00 	mov    DWORD PTR [r15+0x8],0x3` |
| `0x10b837a` | `10b837a:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0x10b83e3` | `10b83e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b83e6` | `10b83e6:	ff 90 38 01 00 00    	call   QWORD PTR [rax+0x138]` |
| `0x10b83f1` | `10b83f1:	49 83 27 00          	and    QWORD PTR [r15],0x0` |
| `0x10b8407` | `10b8407:	41 89 4f 10          	mov    DWORD PTR [r15+0x10],ecx` |
| `0x10b840b` | `10b840b:	49 c7 47 08 01 00 00 	mov    QWORD PTR [r15+0x8],0x1` |
| `0x10b8413` | `10b8413:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0x10b847b` | `10b847b:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b847e` | `10b847e:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]` |
| `0x10b8489` | `10b8489:	49 83 27 00          	and    QWORD PTR [r15],0x0` |
| `0x10b8496` | `10b8496:	48 8d 05 23 4f 79 00 	lea    rax,[rip+0x794f23]        # 184d3c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9aa8>` |
| `0x10b84a1` | `10b84a1:	41 89 4f 10          	mov    DWORD PTR [r15+0x10],ecx` |
| `0x10b84a5` | `10b84a5:	49 c7 47 08 01 00 00 	mov    QWORD PTR [r15+0x8],0x1` |
| `0x10b84ad` | `10b84ad:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0x10b852f` | `10b852f:	48 8d 42 18          	lea    rax,[rdx+0x18]` |
| `0x10b858c` | `10b858c:	41 ff 56 40          	call   QWORD PTR [r14+0x40]` |
| `0x10b85d1` | `10b85d1:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b85d8` | `10b85d8:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10b85fc` | `10b85fc:	48 8d 43 01          	lea    rax,[rbx+0x1]` |
| `0x10b865a` | `10b865a:	ff 90 60 01 00 00    	call   QWORD PTR [rax+0x160]` |
| `0x10b868f` | `10b868f:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b8694` | `10b8694:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10b8722` | `10b8722:	e8 d9 57 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b87d0` | `10b87d0:	4a 8d 04 60          	lea    rax,[rax+r12*2]` |
| `0x10b8810` | `10b8810:	49 8d 47 ff          	lea    rax,[r15-0x1]` |
| `0x10b8845` | `10b8845:	e8 b6 56 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b887d` | `10b887d:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]` |
| `0x10b888c` | `10b888c:	49 8d 45 ff          	lea    rax,[r13-0x1]` |
| `0x10b88cf` | `10b88cf:	4c 8b 07             	mov    r8,QWORD PTR [rdi]` |
| `0x10b890d` | `10b890d:	48 89 17             	mov    QWORD PTR [rdi],rdx` |
| `0x10b8998` | `10b8998:	48 8d 47 ff          	lea    rax,[rdi-0x1]` |
| `0x10b8a82` | `10b8a82:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0x10b8b00` | `10b8b00:	e8 fb 53 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b8b1a` | `10b8b1a:	48 8d 05 9f 47 79 00 	lea    rax,[rip+0x79479f]        # 184d2c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x99a8>` |
| `0x10b8b42` | `10b8b42:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]` |
| `0x10b8b4e` | `10b8b4e:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b8b51` | `10b8b51:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0x10b8b6b` | `10b8b6b:	48 8d 44 24 38       	lea    rax,[rsp+0x38]` |
| `0x10b8ca1` | `10b8ca1:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0` |
| `0x10b8ca6` | `10b8ca6:	48 8d 05 13 48 79 00 	lea    rax,[rip+0x794813]        # 184d4c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ba8>` |
| `0x10b8cad` | `10b8cad:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10b8cba` | `10b8cba:	48 8d 7b 08          	lea    rdi,[rbx+0x8]` |
| `0x10b8ccb` | `10b8ccb:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]` |
| `0x10b8ccf` | `10b8ccf:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax` |
| `0x10b8d1c` | `10b8d1c:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0` |
| `0x10b8d21` | `10b8d21:	48 8d 05 98 47 79 00 	lea    rax,[rip+0x794798]        # 184d4c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ba8>` |
| `0x10b8d28` | `10b8d28:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10b8d2e` | `10b8d2e:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0` |
| `0x10b8d36` | `10b8d36:	48 8d 05 bb 6a 38 ff 	lea    rax,[rip+0xffffffffff386abb]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>` |
| `0x10b8e16` | `10b8e16:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]` |
| `0x10b8e1f` | `10b8e1f:	48 39 4f 10          	cmp    QWORD PTR [rdi+0x10],rcx` |
| `0x10b8e44` | `10b8e44:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]` |
| `0x10b8e6e` | `10b8e6e:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0` |
| `0x10b8e78` | `10b8e78:	48 8d 05 c1 46 79 00 	lea    rax,[rip+0x7946c1]        # 184d540 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9c28>` |
| `0x10b8e7f` | `10b8e7f:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10b8e85` | `10b8e85:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0` |
| `0x10b8eb2` | `10b8eb2:	48 8d 40 18          	lea    rax,[rax+0x18]` |
| `0x10b8ed0` | `10b8ed0:	4a 8d 44 20 ff       	lea    rax,[rax+r12*1-0x1]` |
| `0x10b8f22` | `10b8f22:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]` |
| `0x10b8f2a` | `10b8f2a:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx` |
| `0x10b8f4f` | `10b8f4f:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx` |
| `0x10b8f65` | `10b8f65:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax` |
| `0x10b8f71` | `10b8f71:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10b9036` | `10b9036:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]` |
| `0x10b90ab` | `10b90ab:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0x10b90c9` | `10b90c9:	e8 32 4e 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b9115` | `10b9115:	e8 e6 4d 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b9144` | `10b9144:	48 8d 05 75 41 79 00 	lea    rax,[rip+0x794175]        # 184d2c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x99a8>` |
| `0x10b914b` | `10b914b:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10b917f` | `10b917f:	4c 8d 77 08          	lea    r14,[rdi+0x8]` |
| `0x10b9186` | `10b9186:	e8 75 4d 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b9192` | `10b9192:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]` |
| `0x10b91a5` | `10b91a5:	48 8d 05 14 41 79 00 	lea    rax,[rip+0x794114]        # 184d2c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x99a8>` |
| `0x10b91ac` | `10b91ac:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0x10b91af` | `10b91af:	48 8d 7b 08          	lea    rdi,[rbx+0x8]` |
| `0x10b91be` | `10b91be:	48 83 27 00          	and    QWORD PTR [rdi],0x0` |
| `0x10b920a` | `10b920a:	48 8d 47 08          	lea    rax,[rdi+0x8]` |
| `0x10b9260` | `10b9260:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]` |
| `0x10b9264` | `10b9264:	48 8d 57 10          	lea    rdx,[rdi+0x10]` |
| `0x10b92b8` | `10b92b8:	49 8d 46 ff          	lea    rax,[r14-0x1]` |
| `0x10b9392` | `10b9392:	48 89 0f             	mov    QWORD PTR [rdi],rcx` |
| `0x10b9395` | `10b9395:	4c 89 57 08          	mov    QWORD PTR [rdi+0x8],r10` |
| `0x10b9399` | `10b9399:	c6 47 10 01          	mov    BYTE PTR [rdi+0x10],0x1` |
| `0x10b93a6` | `10b93a6:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b93ab` | `10b93ab:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10b940b` | `10b940b:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10b9478` | `10b9478:	48 83 23 00          	and    QWORD PTR [rbx],0x0` |
| `0x10b947c` | `10b947c:	48 8d 05 7d 3f 79 00 	lea    rax,[rip+0x793f7d]        # 184d400 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ae8>` |
| `0x10b9487` | `10b9487:	48 c7 43 08 01 00 00 	mov    QWORD PTR [rbx+0x8],0x1` |
| `0x10b948f` | `10b948f:	c6 43 10 01          	mov    BYTE PTR [rbx+0x10],0x1` |
| `0x10b9493` | `10b9493:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]` |
| `0x10b9504` | `10b9504:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]` |
| `0x10b950e` | `10b950e:	89 37                	mov    DWORD PTR [rdi],esi` |
| `0x10b9528` | `10b9528:	48 8d 05 09 ec 92 00 	lea    rax,[rip+0x92ec09]        # 19e8138 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2728>` |
| `0x10b9541` | `10b9541:	48 8d 41 08          	lea    rax,[rcx+0x8]` |
| `0x10b955a` | `10b955a:	48 89 0f             	mov    QWORD PTR [rdi],rcx` |
| `0x10b95aa` | `10b95aa:	48 8d 05 9f eb 92 00 	lea    rax,[rip+0x92eb9f]        # 19e8150 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2740>` |
| `0x10b95c3` | `10b95c3:	48 8d 41 08          	lea    rax,[rcx+0x8]` |
| `0x10b95dc` | `10b95dc:	48 89 0f             	mov    QWORD PTR [rdi],rcx` |
| `0x10b962c` | `10b962c:	48 8d 05 35 eb 92 00 	lea    rax,[rip+0x92eb35]        # 19e8168 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2758>` |
| `0x10b9645` | `10b9645:	48 8d 41 08          	lea    rax,[rcx+0x8]` |
| `0x10b965e` | `10b965e:	48 89 0f             	mov    QWORD PTR [rdi],rcx` |
| `0x10b96c0` | `10b96c0:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]` |
| `0x10b970e` | `10b970e:	e8 ed 47 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b9733` | `10b9733:	49 8b 17             	mov    rdx,QWORD PTR [r15]` |
| `0x10b973a` | `10b973a:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]` |
| `0x10b9754` | `10b9754:	48 89 0b             	mov    QWORD PTR [rbx],rcx` |
| `0x10b9757` | `10b9757:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0x10b9782` | `10b9782:	48 8d 05 c7 3b 79 00 	lea    rax,[rip+0x793bc7]        # 184d350 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9a38>` |
| `0x10b9789` | `10b9789:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10b9795` | `10b9795:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]` |
| `0x10b97e5` | `10b97e5:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]` |
| `0x10b9823` | `10b9823:	ff 10                	call   QWORD PTR [rax]` |
| `0x10b9854` | `10b9854:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b9857` | `10b9857:	ff 50 68             	call   QWORD PTR [rax+0x68]` |
| `0x10b9867` | `10b9867:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b98c4` | `10b98c4:	e8 37 46 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b98cc` | `10b98cc:	48 8d 05 4d e8 92 00 	lea    rax,[rip+0x92e84d]        # 19e8120 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2710>` |
| `0x10b9933` | `10b9933:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b9946` | `10b9946:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0x10b9963` | `10b9963:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]` |
| `0x10b9995` | `10b9995:	e8 66 45 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b999d` | `10b999d:	48 8d 05 ac e7 92 00 	lea    rax,[rip+0x92e7ac]        # 19e8150 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2740>` |
| `0x10b99ac` | `10b99ac:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10b99c8` | `10b99c8:	41 c6 46 10 01       	mov    BYTE PTR [r14+0x10],0x1` |
| `0x10b99e0` | `10b99e0:	49 83 26 00          	and    QWORD PTR [r14],0x0` |
| `0x10b99fd` | `10b99fd:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10b9a0d` | `10b9a0d:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0x10b9a24` | `10b9a24:	4c 8b 33             	mov    r14,QWORD PTR [rbx]` |
| `0x10b9a57` | `10b9a57:	e8 a4 44 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b9a5f` | `10b9a5f:	48 8d 05 02 e7 92 00 	lea    rax,[rip+0x92e702]        # 19e8168 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2758>` |
| `0x10b9abd` | `10b9abd:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10b9acd` | `10b9acd:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0x10b9ae4` | `10b9ae4:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0x10b9afb` | `10b9afb:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x10b9b04` | `10b9b04:	ff 10                	call   QWORD PTR [rax]` |
| `0x10b9b8c` | `10b9b8c:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10b9b8f` | `10b9b8f:	ff 50 68             	call   QWORD PTR [rax+0x68]` |
| `0x10b9c45` | `10b9c45:	e8 b6 42 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b9c4d` | `10b9c4d:	48 8d 05 e4 e4 92 00 	lea    rax,[rip+0x92e4e4]        # 19e8138 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2728>` |
| `0x10b9ca1` | `10b9ca1:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10b9cb1` | `10b9cb1:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0x10b9ccc` | `10b9ccc:	4d 8b 3e             	mov    r15,QWORD PTR [r14]` |
| `0x10b9ce3` | `10b9ce3:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10b9cec` | `10b9cec:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10b9cf9` | `10b9cf9:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0x10b9d07` | `10b9d07:	ff 50 50             	call   QWORD PTR [rax+0x50]` |
| `0x10b9d14` | `10b9d14:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]` |
| `0x10b9e60` | `10b9e60:	48 8d 05 d1 ee 7e 00 	lea    rax,[rip+0x7eeed1]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>` |
| `0x10b9ea2` | `10b9ea2:	e8 59 40 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b9eb1` | `10b9eb1:	48 8d 05 f0 38 74 00 	lea    rax,[rip+0x7438f0]        # 17fd7a8 <_ZTINSt6__ndk117bad_function_callE@@Base+0x848>` |
| `0x10b9ed3` | `10b9ed3:	4d 89 2f             	mov    QWORD PTR [r15],r13` |
| `0x10b9ed6` | `10b9ed6:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12` |
| `0x10b9eda` | `10b9eda:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10b9ef1` | `10b9ef1:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10b9ef4` | `10b9ef4:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0x10b9f1f` | `10b9f1f:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10b9f39` | `10b9f39:	48 8d 05 f8 ed 7e 00 	lea    rax,[rip+0x7eedf8]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>` |
| `0x10b9f7b` | `10b9f7b:	e8 80 3f 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10b9f8a` | `10b9f8a:	48 8d 05 17 38 74 00 	lea    rax,[rip+0x743817]        # 17fd7a8 <_ZTINSt6__ndk117bad_function_callE@@Base+0x848>` |
| `0x10b9fac` | `10b9fac:	4d 89 2f             	mov    QWORD PTR [r15],r13` |
| `0x10b9faf` | `10b9faf:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12` |
| `0x10b9fb3` | `10b9fb3:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10b9fc7` | `10b9fc7:	ff 50 50             	call   QWORD PTR [rax+0x50]` |
| `0x10b9fca` | `10b9fca:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0x10b9ff7` | `10b9ff7:	48 8d 05 3a ed 7e 00 	lea    rax,[rip+0x7eed3a]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>` |
| `0x10ba043` | `10ba043:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10ba05f` | `10ba05f:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0x10ba074` | `10ba074:	48 8d 05 45 34 79 00 	lea    rax,[rip+0x793445]        # 184d4c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ba8>` |
| `0x10ba08c` | `10ba08c:	48 8d 05 65 57 38 ff 	lea    rax,[rip+0xffffffffff385765]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>` |
| `0x10ba0d0` | `10ba0d0:	e8 2b 3e 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ba0df` | `10ba0df:	48 8d 05 c2 36 74 00 	lea    rax,[rip+0x7436c2]        # 17fd7a8 <_ZTINSt6__ndk117bad_function_callE@@Base+0x848>` |
| `0x10ba101` | `10ba101:	4d 89 2f             	mov    QWORD PTR [r15],r13` |
| `0x10ba104` | `10ba104:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12` |
| `0x10ba108` | `10ba108:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10ba11c` | `10ba11c:	ff 50 58             	call   QWORD PTR [rax+0x58]` |
| `0x10ba11f` | `10ba11f:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0x10ba147` | `10ba147:	48 8d 05 ea eb 7e 00 	lea    rax,[rip+0x7eebea]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>` |
| `0x10ba193` | `10ba193:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10ba1af` | `10ba1af:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0x10ba1c6` | `10ba1c6:	48 8d 05 6b eb 7e 00 	lea    rax,[rip+0x7eeb6b]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>` |
| `0x10ba212` | `10ba212:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10ba22e` | `10ba22e:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0x10ba255` | `10ba255:	48 8d 05 dc ea 7e 00 	lea    rax,[rip+0x7eeadc]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>` |
| `0x10ba297` | `10ba297:	e8 64 3c 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ba2a6` | `10ba2a6:	48 8d 05 fb 34 74 00 	lea    rax,[rip+0x7434fb]        # 17fd7a8 <_ZTINSt6__ndk117bad_function_callE@@Base+0x848>` |
| `0x10ba2c8` | `10ba2c8:	4d 89 2f             	mov    QWORD PTR [r15],r13` |
| `0x10ba2cb` | `10ba2cb:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12` |
| `0x10ba2cf` | `10ba2cf:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10ba2e3` | `10ba2e3:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x10ba2e6` | `10ba2e6:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0x10ba306` | `10ba306:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10ba340` | `10ba340:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0` |
| `0x10ba367` | `10ba367:	48 8d 05 ca ea 83 00 	lea    rax,[rip+0x83eaca]        # 18f8e38 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40248>` |
| `0x10ba3b8` | `10ba3b8:	49 8d 7e 08          	lea    rdi,[r14+0x8]` |
| `0x10ba3f3` | `10ba3f3:	48 8d 05 76 e8 83 00 	lea    rax,[rip+0x83e876]        # 18f8c70 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40080>` |
| `0x10ba457` | `10ba457:	48 8d 05 4a e7 83 00 	lea    rax,[rip+0x83e74a]        # 18f8ba8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3ffb8>` |
| `0x10ba477` | `10ba477:	48 83 7b 10 00       	cmp    QWORD PTR [rbx+0x10],0x0` |
| `0x10ba4ad` | `10ba4ad:	48 8d 05 24 e6 83 00 	lea    rax,[rip+0x83e624]        # 18f8ad8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fee8>` |
| `0x10ba4e9` | `10ba4e9:	48 8d 05 70 e4 83 00 	lea    rax,[rip+0x83e470]        # 18f8960 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fd70>` |
| `0x10ba535` | `10ba535:	48 8d 05 5c e3 83 00 	lea    rax,[rip+0x83e35c]        # 18f8898 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fca8>` |
| `0x10ba56b` | `10ba56b:	48 8d 05 5e e2 83 00 	lea    rax,[rip+0x83e25e]        # 18f87d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fbe0>` |
| `0x10ba5a1` | `10ba5a1:	48 8d 05 48 e1 83 00 	lea    rax,[rip+0x83e148]        # 18f86f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fb00>` |
| `0x10ba5eb` | `10ba5eb:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]` |
| `0x10ba73b` | `10ba73b:	48 03 07             	add    rax,QWORD PTR [rdi]` |
| `0x10ba74b` | `10ba74b:	48 03 07             	add    rax,QWORD PTR [rdi]` |
| `0x10ba75e` | `10ba75e:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]` |
| `0x10ba767` | `10ba767:	4d 8b 3e             	mov    r15,QWORD PTR [r14]` |
| `0x10ba783` | `10ba783:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0x10ba786` | `10ba786:	48 83 23 00          	and    QWORD PTR [rbx],0x0` |
| `0x10ba7bf` | `10ba7bf:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0x10ba7dc` | `10ba7dc:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ba7e4` | `10ba7e4:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ba81a` | `10ba81a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ba81d` | `10ba81d:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]` |
| `0x10ba827` | `10ba827:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10ba82d` | `10ba82d:	ff 90 a8 01 00 00    	call   QWORD PTR [rax+0x1a8]` |
| `0x10ba837` | `10ba837:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0x10ba844` | `10ba844:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x10ba85d` | `10ba85d:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x10ba85f` | `10ba85f:	83 3b 02             	cmp    DWORD PTR [rbx],0x2` |
| `0x10ba880` | `10ba880:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ba888` | `10ba888:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10ba8b8` | `10ba8b8:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ba8c0` | `10ba8c0:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0x10ba8f3` | `10ba8f3:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x10ba8fa` | `10ba8fa:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ba8fd` | `10ba8fd:	ff 90 a8 01 00 00    	call   QWORD PTR [rax+0x1a8]` |
| `0x10ba907` | `10ba907:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0x10ba914` | `10ba914:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x10ba92f` | `10ba92f:	83 3b 02             	cmp    DWORD PTR [rbx],0x2` |
| `0x10ba950` | `10ba950:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ba958` | `10ba958:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0x10ba9a0` | `10ba9a0:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ba9a8` | `10ba9a8:	ff 50 50             	call   QWORD PTR [rax+0x50]` |
| `0x10ba9db` | `10ba9db:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x10ba9e2` | `10ba9e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10ba9e5` | `10ba9e5:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]` |
| `0x10ba9ef` | `10ba9ef:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0x10ba9fc` | `10ba9fc:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x10baa17` | `10baa17:	83 3b 02             	cmp    DWORD PTR [rbx],0x2` |
| `0x10baa38` | `10baa38:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |
| `0x10baa73` | `10baa73:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x10baa7a` | `10baa7a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10baa7d` | `10baa7d:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]` |
| `0x10baa87` | `10baa87:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0x10baa94` | `10baa94:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x10baaa6` | `10baaa6:	83 3b 02             	cmp    DWORD PTR [rbx],0x2` |
| `0x10baac6` | `10baac6:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10baace` | `10baace:	ff 50 70             	call   QWORD PTR [rax+0x70]` |
| `0x10bab09` | `10bab09:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]` |
| `0x10bab16` | `10bab16:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x10bab27` | `10bab27:	c7 03 01 00 00 00    	mov    DWORD PTR [rbx],0x1` |
| `0x10bab2d` | `10bab2d:	83 3b 02             	cmp    DWORD PTR [rbx],0x2` |
| `0x10bab4e` | `10bab4e:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10bab56` | `10bab56:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]` |
| `0x10bab88` | `10bab88:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10bab90` | `10bab90:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]` |
| `0x10babcb` | `10babcb:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]` |
| `0x10babd8` | `10babd8:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x10babe9` | `10babe9:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10babef` | `10babef:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]` |
| `0x10babf9` | `10babf9:	83 23 00             	and    DWORD PTR [rbx],0x0` |
| `0x10bac1c` | `10bac1c:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10bac24` | `10bac24:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0x10bac5f` | `10bac5f:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]` |
| `0x10bac6c` | `10bac6c:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x10bac7d` | `10bac7d:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10bac83` | `10bac83:	ff 90 b0 01 00 00    	call   QWORD PTR [rax+0x1b0]` |
| `0x10bac8d` | `10bac8d:	83 23 00             	and    DWORD PTR [rbx],0x0` |
| `0x10bacb0` | `10bacb0:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10bacb8` | `10bacb8:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]` |
| `0x10bacf3` | `10bacf3:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]` |
| `0x10bad00` | `10bad00:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x10bad1a` | `10bad1a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10bad1d` | `10bad1d:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10bad28` | `10bad28:	83 23 00             	and    DWORD PTR [rbx],0x0` |
| `0x10bad4c` | `10bad4c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]` |
| `0x10bad59` | `10bad59:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]` |
| `0x10bad6a` | `10bad6a:	41 c7 06 02 00 00 00 	mov    DWORD PTR [r14],0x2` |
| `0x10bad9c` | `10bad9c:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10bada4` | `10bada4:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]` |
| `0x10badf0` | `10badf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10badf8` | `10badf8:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]` |
| `0x10bae30` | `10bae30:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10bae38` | `10bae38:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]` |
| `0x10bae72` | `10bae72:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10bae7a` | `10bae7a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]` |
| `0x10baebe` | `10baebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x10baec1` | `10baec1:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10baec8` | `10baec8:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0x10baed5` | `10baed5:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| ... | truncated 543 more |

