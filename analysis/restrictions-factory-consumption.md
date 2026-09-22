# Restrictions factory consumption trace

Purpose: close the link after `bundle+0x30` provenance. The inline-vector trace proved `bundle+0x30` is populated by `1507b1a`; this report follows how `RestrictionsSetupImpl` consumes that slot and how the child accessor exposes it as the readiness dependency.

## Targets

| item | address | reason |
|---|---:|---|
| RestrictionsSetupImpl provider factory | `0x10ab7ae` | provider `+0x28` entry; receives `rdx = setup bundle` |
| child readiness accessor | `0xb411a4` | known child `+0x38` accessor that returns the stored dependency |

## Factory bundle field reads

```text
 10ab7c2:	48 89 d3             	mov    rbx,rdx
 10ab824:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
 10ab82d:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
 10ab836:	48 8b 83 98 00 00 00 	mov    rax,QWORD PTR [rbx+0x98]
 10ab842:	48 8b 6b 68          	mov    rbp,QWORD PTR [rbx+0x68]
```

Interpretation: factory entry first preserves the setup bundle in `rbx`; reads from `[rbx+0x30]`, `[rbx+0x60]`, `[rbx+0x98]`, and `[rbx+0x68]` are bundle-field reads. The important one for the readiness source is `[rbx+0x30]`, whose provenance is now the inline-vector first slot.

## Factory entry excerpt

```text
 10ab7ae:	55                   	push   rbp
 10ab7af:	41 57                	push   r15
 10ab7b1:	41 56                	push   r14
 10ab7b3:	41 55                	push   r13
 10ab7b5:	41 54                	push   r12
 10ab7b7:	53                   	push   rbx
 10ab7b8:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
 10ab7bf:	49 89 ce             	mov    r14,rcx
 10ab7c2:	48 89 d3             	mov    rbx,rdx
 10ab7c5:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
 10ab7ca:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ab7d1:	00 00
 10ab7d3:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 10ab7da:	00
 10ab7db:	48 89 cf             	mov    rdi,rcx
 10ab7de:	e8 b5 30 de ff       	call   e8e898 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55cae>
 10ab7e3:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 10ab7e8:	4c 89 f7             	mov    rdi,r14
 10ab7eb:	e8 da 97 b8 ff       	call   c34fca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x181f6a>
 10ab7f0:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10ab7f5:	4c 89 f7             	mov    rdi,r14
 10ab7f8:	e8 a3 7a ab ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
 10ab7fd:	49 89 c5             	mov    r13,rax
 10ab800:	4c 89 f7             	mov    rdi,r14
 10ab803:	e8 48 5f b6 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
 10ab808:	49 89 c7             	mov    r15,rax
 10ab80b:	4c 89 f7             	mov    rdi,r14
 10ab80e:	e8 67 5f b6 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
 10ab813:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 10ab817:	4c 89 f7             	mov    rdi,r14
 10ab81a:	e8 07 5f b6 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
 10ab81f:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10ab824:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
 10ab828:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10ab82d:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
 10ab831:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 10ab836:	48 8b 83 98 00 00 00 	mov    rax,QWORD PTR [rbx+0x98]
 10ab83d:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10ab842:	48 8b 6b 68          	mov    rbp,QWORD PTR [rbx+0x68]
 10ab846:	48 8d 35 0a 4a 2b ff 	lea    rsi,[rip+0xffffffffff2b4a0a]        # 360257 <_ZTSSt12bad_any_cast@@Base-0x2ff71>
 10ab84d:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
 10ab852:	4c 89 e7             	mov    rdi,r12
 10ab855:	e8 24 e2 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ab85a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 10ab85e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 10ab865:	00
 10ab866:	48 89 ee             	mov    rsi,rbp
 10ab869:	4c 89 e2             	mov    rdx,r12
 10ab86c:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ab86f:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 10ab873:	4c 89 ef             	mov    rdi,r13
 10ab876:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ab879:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 10ab87e:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
 10ab882:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10ab887:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ab88a:	4c 89 ff             	mov    rdi,r15
 10ab88d:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ab890:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10ab895:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
 10ab899:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ab89e:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 10ab8a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ab8a5:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10ab8a8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 10ab8ab:	48 89 c7             	mov    rdi,rax
 10ab8ae:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
 10ab8b4:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 10ab8b8:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
 10ab8bf:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 10ab8c4:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 10ab8c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ab8cc:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ab8cf:	48 89 c5             	mov    rbp,rax
 10ab8d2:	4c 89 f7             	mov    rdi,r14
 10ab8d5:	e8 b4 b3 c0 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
 10ab8da:	49 89 c7             	mov    r15,rax
 10ab8dd:	4c 89 f7             	mov    rdi,r14
 10ab8e0:	e8 bb 79 ab ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
 10ab8e5:	49 89 c4             	mov    r12,rax
 10ab8e8:	4c 89 f7             	mov    rdi,r14
 10ab8eb:	e8 3e a4 ff ff       	call   10a5d2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d144>
 10ab8f0:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 10ab8f3:	48 89 c7             	mov    rdi,rax
 10ab8f6:	ff 51 28             	call   QWORD PTR [rcx+0x28]
 10ab8f9:	49 89 c5             	mov    r13,rax
 10ab8fc:	4c 89 f7             	mov    rdi,r14
 10ab8ff:	e8 b8 a0 fc ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
 10ab904:	49 89 c6             	mov    r14,rax
 10ab907:	bf 80 00 00 00       	mov    edi,0x80
 10ab90c:	e8 ef 25 74 00       	call   17edf00 <_Znwm@plt>
 10ab911:	48 89 c3             	mov    rbx,rax
 10ab914:	49 83 c6 10          	add    r14,0x10
 10ab918:	48 8d 05 99 59 78 00 	lea    rax,[rip+0x785999]        # 18312b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3250>
 10ab91f:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]
 10ab926:	00
 10ab927:	49 89 00             	mov    QWORD PTR [r8],rax
 10ab92a:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10ab92f:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
 10ab933:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
 10ab937:	41 0f b6 47 11       	movzx  eax,BYTE PTR [r15+0x11]
 10ab93c:	48 89 df             	mov    rdi,rbx
 10ab93f:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
 10ab944:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
 10ab949:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
 10ab94e:	4c 8b 4c 24 48       	mov    r9,QWORD PTR [rsp+0x48]
 10ab953:	41 56                	push   r14
 10ab955:	41 55                	push   r13
 10ab957:	41 54                	push   r12
 10ab959:	50                   	push   rax
```

## Child accessor excerpt

```text
  b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
  b411a8:	c3                   	ret
```

## Child accessor field hits

```text
  b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
```

## Provenance chain now closed

```text
provider-vector caller
  -> constructs setup bundle at rsp+0x2e0
  -> constructor sets [bundle+0x18] = bundle+0x30
  -> 1507a9e appends first slot through [bundle+0x18]
  -> 1507b1a stores allocated/filled slot pointer into [bundle+0x30]
  -> RestrictionsSetupImpl factory at 0x10ab7ae receives rdx=bundle
  -> factory reads [rbx+0x30], where rbx=rdx=bundle
  -> that dependency is used to initialize the Restrictions child/service state
  -> child accessor 0xb411a4 returns the stored dependency from child state
  -> final readiness chain reaches Skip-Ad adapter state+0x40 virtual +0x140
```

## Conclusion

The setup-bundle source is now connected to Restrictions factory consumption: the value read as `[bundle+0x30]` is the first inline-vector slot populated by `1507a9e`, not an independent direct store. The remaining verification point is only exact register-level constructor plumbing inside `0x10ab7ae`, but the consumed field itself is now resolved.
