# Restrictions installed payload `allocated_0x28+0x08` trace

Parallel v7 report. Focus: the erased/shared payload copied into the `0x28` object at `+0x08` via `107162a`, then destroyed/reset through `de1c52` and `10bff2c`.

## Install window `10ac120..10ac1b7`

```text
 10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac125:	48 83 c4 10          	add    rsp,0x10
 10ac129:	6a 28                	push   0x28
 10ac12b:	5f                   	pop    rdi
 10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac131:	49 89 c6             	mov    r14,rax
 10ac134:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
 10ac13b:	00 00
 10ac13d:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 10ac144:	00 00
 10ac146:	6a 30                	push   0x30
 10ac148:	5f                   	pop    rdi
 10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac14e:	49 89 c4             	mov    r12,rax
 10ac151:	48 89 c7             	mov    rdi,rax
 10ac154:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 10ac15e:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10ac165:	00
 10ac166:	4d 89 65 00          	mov    QWORD PTR [r13+0x0],r12
 10ac16a:	48 8d 05 69 78 a1 ff 	lea    rax,[rip+0xffffffffffa17869]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 10ac171:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 10ac175:	48 8d 05 9a 1a 00 00 	lea    rax,[rip+0x1a9a]        # 10adc16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27502c>
 10ac17c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10ac187:	49 89 06             	mov    QWORD PTR [r14],rax
 10ac18a:	4c 89 f7             	mov    rdi,r14
 10ac18d:	48 83 c7 08          	add    rdi,0x8
 10ac191:	4c 89 ee             	mov    rsi,r13
 10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
 10ac199:	4c 89 ef             	mov    rdi,r13
 10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1a6:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac1ac:	48 85 ff             	test   rdi,rdi
 10ac1af:	74 06                	je     10ac1b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2735cd>
 10ac1b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac1b7:	6a 58                	push   0x58
```
## `107162a payload installer` at `0x107162a`

```text
 10715cb:	cc                   	int3
 10715cc:	53                   	push   rbx
 10715cd:	48 89 fb             	mov    rbx,rdi
 10715d0:	48 81 c7 d8 00 00 00 	add    rdi,0xd8
 10715d7:	e8 06 db af ff       	call   b6f0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc082>
 10715dc:	48 8b bb a0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa0]
 10715e3:	e8 36 85 76 00       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
 10715e8:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
 10715ef:	e8 b0 05 c4 ff       	call   cb1ba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb44>
 10715f4:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
 10715f8:	48 89 df             	mov    rdi,rbx
 10715fb:	5b                   	pop    rbx
 10715fc:	e9 25 d3 a3 ff       	jmp    aae926 <JNI_OnUnload@@Base+0x361f3>
 1071601:	cc                   	int3
 1071602:	48 8b bf a0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xa0]
 1071609:	e9 5a 85 76 00       	jmp    17d9b68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5989>
 107160e:	80 7f 10 00          	cmp    BYTE PTR [rdi+0x10],0x0
 1071612:	74 06                	je     107161a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a30>
 1071614:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1071617:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
 107161a:	c3                   	ret
 107161b:	cc                   	int3
 107161c:	80 7f 11 00          	cmp    BYTE PTR [rdi+0x11],0x0
 1071620:	74 06                	je     1071628 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a3e>
 1071622:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1071625:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
 1071628:	c3                   	ret
 1071629:	cc                   	int3
 107162a:	41 56                	push   r14
 107162c:	53                   	push   rbx
 107162d:	50                   	push   rax
 107162e:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1071632:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 1071637:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 107163b:	48 85 c0             	test   rax,rax
 107163e:	74 22                	je     1071662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a78>
 1071640:	48 89 fb             	mov    rbx,rdi
 1071643:	49 89 f6             	mov    r14,rsi
 1071646:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 107164a:	6a 01                	push   0x1
 107164c:	5f                   	pop    rdi
 107164d:	48 89 de             	mov    rsi,rbx
 1071650:	4c 89 f2             	mov    rdx,r14
 1071653:	ff d0                	call   rax
 1071655:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 1071659:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 107165d:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 1071662:	48 83 c4 08          	add    rsp,0x8
 1071666:	5b                   	pop    rbx
 1071667:	41 5e                	pop    r14
 1071669:	c3                   	ret
 107166a:	48 89 c7             	mov    rdi,rax
 107166d:	e8 33 84 a0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1071672:	53                   	push   rbx
 1071673:	48 89 fb             	mov    rbx,rdi
 1071676:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 107167a:	e8 c3 fa ff ff       	call   1071142 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238558>
 107167f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1071682:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 1071686:	48 85 ff             	test   rdi,rdi
 1071689:	74 06                	je     1071691 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238aa7>
 107168b:	5b                   	pop    rbx
 107168c:	e9 8f c8 77 00       	jmp    17edf20 <_ZdlPv@plt>
 1071691:	5b                   	pop    rbx
 1071692:	c3                   	ret
 1071693:	cc                   	int3
 1071694:	41 56                	push   r14
 1071696:	53                   	push   rbx
 1071697:	50                   	push   rax
 1071698:	48 89 fb             	mov    rbx,rdi
 107169b:	48 8d 05 ce 77 7d 00 	lea    rax,[rip+0x7d77ce]        # 1848e70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5558>
 10716a2:	48 89 07             	mov    QWORD PTR [rdi],rax
 10716a5:	48 8d 05 54 78 7d 00 	lea    rax,[rip+0x7d7854]        # 1848f00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x55e8>
 10716ac:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 10716b0:	4c 8d b7 d8 00 00 00 	lea    r14,[rdi+0xd8]
 10716b7:	4c 89 f7             	mov    rdi,r14
 10716ba:	e8 23 da af ff       	call   b6f0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc082>
 10716bf:	4c 89 f7             	mov    rdi,r14
 10716c2:	e8 b5 da af ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 10716c7:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
 10716ce:	e8 9f ff ff ff       	call   1071672 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a88>
 10716d3:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10716da:	e8 f5 84 76 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10716df:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
 10716e6:	e8 19 08 c4 ff       	call   cb1f04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feea4>
 10716eb:	48 8b bb 88 00 00 00 	mov    rdi,QWORD PTR [rbx+0x88]
 10716f2:	e8 8f cd a2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10716f7:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10716fb:	e8 de c8 b0 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
 1071700:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 1071704:	e8 49 05 d7 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 1071709:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
 107170d:	48 83 c4 08          	add    rsp,0x8
 1071711:	5b                   	pop    rbx
 1071712:	41 5e                	pop    r14
 1071714:	e9 6d cd a2 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 1071719:	48 89 c7             	mov    rdi,rax
 107171c:	e8 84 83 a0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1071721:	cc                   	int3
 1071722:	53                   	push   rbx
 1071723:	48 89 fb             	mov    rbx,rdi
 1071726:	e8 69 ff ff ff       	call   1071694 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238aaa>
 107172b:	48 89 df             	mov    rdi,rbx
 107172e:	5b                   	pop    rbx
 107172f:	e9 ec c7 77 00       	jmp    17edf20 <_ZdlPv@plt>
 1071734:	e9 f9 e3 ff ff       	jmp    106fb32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236f48>
 1071739:	cc                   	int3
 107173a:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
 107173e:	e9 51 ff ff ff       	jmp    1071694 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238aaa>
 1071743:	cc                   	int3
 1071744:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
 1071748:	e9 d5 ff ff ff       	jmp    1071722 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238b38>
 107174d:	cc                   	int3
 107174e:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
 1071752:	e9 db e3 ff ff       	jmp    106fb32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236f48>
 1071757:	cc                   	int3
 1071758:	41 57                	push   r15
 107175a:	41 56                	push   r14
 107175c:	53                   	push   rbx
 107175d:	48 89 fb             	mov    rbx,rdi
 1071760:	48 8d 05 99 78 7d 00 	lea    rax,[rip+0x7d7899]        # 1849000 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x56e8>
 1071767:	48 89 07             	mov    QWORD PTR [rdi],rax
 107176a:	4c 8b b7 98 00 00 00 	mov    r14,QWORD PTR [rdi+0x98]
```
## `de1c52 stack-wrapper cleanup/copy cleanup` at `0xde1c52`

```text
  de1bf1:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  de1bf6:	e8 1d 12 e3 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
  de1bfb:	4c 89 e7             	mov    rdi,r12
  de1bfe:	e8 1d c3 a0 00       	call   17edf20 <_ZdlPv@plt>
  de1c03:	eb 03                	jmp    de1c08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaec8e>
  de1c05:	49 89 c6             	mov    r14,rax
  de1c08:	4c 89 ff             	mov    rdi,r15
  de1c0b:	e8 18 82 c9 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  de1c10:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  de1c15:	e8 38 00 00 00       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
  de1c1a:	48 89 df             	mov    rdi,rbx
  de1c1d:	e8 fe c2 a0 00       	call   17edf20 <_ZdlPv@plt>
  de1c22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  de1c29:	00 00
  de1c2b:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
  de1c30:	75 08                	jne    de1c3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecc0>
  de1c32:	4c 89 f7             	mov    rdi,r14
  de1c35:	e8 96 e0 c8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  de1c3a:	e8 71 de a0 00       	call   17efab0 <__stack_chk_fail@plt>
  de1c3f:	cc                   	int3
  de1c40:	53                   	push   rbx
  de1c41:	48 89 fb             	mov    rbx,rdi
  de1c44:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
  de1c47:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  de1c4a:	ff 50 28             	call   QWORD PTR [rax+0x28]
  de1c4d:	48 89 d8             	mov    rax,rbx
  de1c50:	5b                   	pop    rbx
  de1c51:	c3                   	ret
  de1c52:	53                   	push   rbx
  de1c53:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  de1c57:	48 85 c0             	test   rax,rax
  de1c5a:	74 11                	je     de1c6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecf3>
  de1c5c:	48 89 fb             	mov    rbx,rdi
  de1c5f:	31 ff                	xor    edi,edi
  de1c61:	48 89 de             	mov    rsi,rbx
  de1c64:	31 d2                	xor    edx,edx
  de1c66:	ff d0                	call   rax
  de1c68:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  de1c6d:	5b                   	pop    rbx
  de1c6e:	c3                   	ret
  de1c6f:	48 89 c7             	mov    rdi,rax
  de1c72:	e8 2e 7e c9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  de1c77:	cc                   	int3
  de1c78:	53                   	push   rbx
  de1c79:	48 89 fb             	mov    rbx,rdi
  de1c7c:	48 8d 05 25 95 a4 00 	lea    rax,[rip+0xa49525]        # 182b1a8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x77d8>
  de1c83:	48 89 07             	mov    QWORD PTR [rdi],rax
  de1c86:	48 83 c7 30          	add    rdi,0x30
  de1c8a:	e8 db 82 c9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  de1c8f:	48 89 df             	mov    rdi,rbx
  de1c92:	5b                   	pop    rbx
  de1c93:	e9 4c 1f 80 00       	jmp    15e3be4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429168>
  de1c98:	53                   	push   rbx
  de1c99:	48 89 fb             	mov    rbx,rdi
  de1c9c:	e8 d7 ff ff ff       	call   de1c78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecfe>
  de1ca1:	48 89 df             	mov    rdi,rbx
  de1ca4:	5b                   	pop    rbx
  de1ca5:	e9 76 c2 a0 00       	jmp    17edf20 <_ZdlPv@plt>
  de1caa:	55                   	push   rbp
  de1cab:	41 57                	push   r15
  de1cad:	41 56                	push   r14
  de1caf:	41 55                	push   r13
  de1cb1:	41 54                	push   r12
  de1cb3:	53                   	push   rbx
  de1cb4:	48 81 ec 98 00 00 00 	sub    rsp,0x98
  de1cbb:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
  de1cbf:	49 89 d4             	mov    r12,rdx
  de1cc2:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
  de1cc7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  de1cce:	00 00
  de1cd0:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  de1cd7:	00
  de1cd8:	4c 8b 7e 20          	mov    r15,QWORD PTR [rsi+0x20]
  de1cdc:	0f 57 c0             	xorps  xmm0,xmm0
  de1cdf:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  de1ce4:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
  de1ce8:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  de1ceb:	c7 47 20 00 00 80 3f 	mov    DWORD PTR [rdi+0x20],0x3f800000
  de1cf2:	48 63 72 18          	movsxd rsi,DWORD PTR [rdx+0x18]
  de1cf6:	e8 f7 de e6 ff       	call   c4fbf2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cb92>
  de1cfb:	49 8d 44 24 10       	lea    rax,[r12+0x10]
  de1d00:	49 8b 4c 24 10       	mov    rcx,QWORD PTR [r12+0x10]
  de1d05:	48 89 cd             	mov    rbp,rcx
  de1d08:	48 83 c5 07          	add    rbp,0x7
  de1d0c:	f6 c1 01             	test   cl,0x1
  de1d0f:	48 0f 44 e8          	cmove  rbp,rax
  de1d13:	4d 63 74 24 18       	movsxd r14,DWORD PTR [r12+0x18]
  de1d18:	4d 85 f6             	test   r14,r14
  de1d1b:	74 48                	je     de1d65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaedeb>
  de1d1d:	49 c1 e6 03          	shl    r14,0x3
  de1d21:	31 db                	xor    ebx,ebx
  de1d23:	4c 8d 64 24 38       	lea    r12,[rsp+0x38]
  de1d28:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
  de1d2d:	48 8b 7c 1d 00       	mov    rdi,QWORD PTR [rbp+rbx*1+0x0]
  de1d32:	e8 ff 9a c9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  de1d37:	4c 89 e7             	mov    rdi,r12
  de1d3a:	48 89 c6             	mov    rsi,rax
  de1d3d:	e8 e6 36 8e 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
  de1d42:	83 7c 24 70 00       	cmp    DWORD PTR [rsp+0x70],0x0
  de1d47:	74 0b                	je     de1d54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaedda>
  de1d49:	4c 89 ef             	mov    rdi,r13
  de1d4c:	4c 89 e6             	mov    rsi,r12
  de1d4f:	e8 ee de e6 ff       	call   c4fc42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cbe2>
  de1d54:	4c 89 e7             	mov    rdi,r12
  de1d57:	e8 d2 35 8e 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  de1d5c:	48 83 c3 08          	add    rbx,0x8
  de1d60:	49 39 de             	cmp    r14,rbx
  de1d63:	75 c8                	jne    de1d2d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaedb3>
  de1d65:	49 8b 07             	mov    rax,QWORD PTR [r15]
  de1d68:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
  de1d6d:	4c 89 ff             	mov    rdi,r15
  de1d70:	ff 50 10             	call   QWORD PTR [rax+0x10]
  de1d73:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  de1d78:	e8 9b 10 e3 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
  de1d7d:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
  de1d81:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  de1d84:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
  de1d89:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
  de1d8e:	48 8d 05 5b 94 a4 00 	lea    rax,[rip+0xa4945b]        # 182b1f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7820>
  de1d95:	49 89 06             	mov    QWORD PTR [r14],rax
  de1d98:	48 8d 05 59 da 65 ff 	lea    rax,[rip+0xffffffffff65da59]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
  de1d9f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  de1da3:	41 c7 46 20 c8 00 00 	mov    DWORD PTR [r14+0x20],0xc8
```
## `a7a290 erased-wrapper copy helper` at `0xa7a290`

```text
  a7a22d:	4d 89 7e 20          	mov    QWORD PTR [r14+0x20],r15
  a7a231:	e8 94 00 00 00       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  a7a236:	48 89 df             	mov    rdi,rbx
  a7a239:	e8 2c fd ff ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  a7a23e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7a245:	00 00
  a7a247:	48 3b 44 24 68       	cmp    rax,QWORD PTR [rsp+0x68]
  a7a24c:	75 3d                	jne    a7a28b <JNI_OnUnload@@Base+0x1b58>
  a7a24e:	4c 89 f0             	mov    rax,r14
  a7a251:	48 83 c4 70          	add    rsp,0x70
  a7a255:	5b                   	pop    rbx
  a7a256:	41 5e                	pop    r14
  a7a258:	41 5f                	pop    r15
  a7a25a:	c3                   	ret
  a7a25b:	49 89 c6             	mov    r14,rax
  a7a25e:	48 89 e7             	mov    rdi,rsp
  a7a261:	e8 64 00 00 00       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  a7a266:	eb 03                	jmp    a7a26b <JNI_OnUnload@@Base+0x1b38>
  a7a268:	49 89 c6             	mov    r14,rax
  a7a26b:	48 89 df             	mov    rdi,rbx
  a7a26e:	e8 f7 fc ff ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  a7a273:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7a27a:	00 00
  a7a27c:	48 3b 44 24 68       	cmp    rax,QWORD PTR [rsp+0x68]
  a7a281:	75 08                	jne    a7a28b <JNI_OnUnload@@Base+0x1b58>
  a7a283:	4c 89 f7             	mov    rdi,r14
  a7a286:	e8 45 5a ff ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a7a28b:	e8 20 58 d7 00       	call   17efab0 <__stack_chk_fail@plt>
  a7a290:	53                   	push   rbx
  a7a291:	48 89 fb             	mov    rbx,rdi
  a7a294:	48 8b 7e 20          	mov    rdi,QWORD PTR [rsi+0x20]
  a7a298:	48 85 ff             	test   rdi,rdi
  a7a29b:	74 11                	je     a7a2ae <JNI_OnUnload@@Base+0x1b7b>
  a7a29d:	48 39 f7             	cmp    rdi,rsi
  a7a2a0:	74 13                	je     a7a2b5 <JNI_OnUnload@@Base+0x1b82>
  a7a2a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a7a2a5:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a7a2a8:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  a7a2ac:	eb 05                	jmp    a7a2b3 <JNI_OnUnload@@Base+0x1b80>
  a7a2ae:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
  a7a2b3:	5b                   	pop    rbx
  a7a2b4:	c3                   	ret
  a7a2b5:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
  a7a2b9:	48 8b 7e 20          	mov    rdi,QWORD PTR [rsi+0x20]
  a7a2bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a7a2c0:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
  a7a2c4:	48 89 de             	mov    rsi,rbx
  a7a2c7:	5b                   	pop    rbx
  a7a2c8:	ff e0                	jmp    rax
  a7a2ca:	48 89 f8             	mov    rax,rdi
  a7a2cd:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  a7a2d0:	48 83 20 00          	and    QWORD PTR [rax],0x0
  a7a2d4:	48 85 ff             	test   rdi,rdi
  a7a2d7:	0f 85 43 3c d7 00    	jne    17edf20 <_ZdlPv@plt>
  a7a2dd:	c3                   	ret
  a7a2de:	48 8d 05 43 2c d8 00 	lea    rax,[rip+0xd82c43]        # 17fcf28 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2c48>
  a7a2e5:	48 89 07             	mov    QWORD PTR [rdi],rax
  a7a2e8:	48 83 c7 20          	add    rdi,0x20
  a7a2ec:	e9 79 fc ff ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  a7a2f1:	cc                   	int3
  a7a2f2:	53                   	push   rbx
  a7a2f3:	48 89 fb             	mov    rbx,rdi
  a7a2f6:	e8 e3 ff ff ff       	call   a7a2de <JNI_OnUnload@@Base+0x1bab>
  a7a2fb:	48 89 df             	mov    rdi,rbx
  a7a2fe:	5b                   	pop    rbx
  a7a2ff:	e9 1c 3c d7 00       	jmp    17edf20 <_ZdlPv@plt>
  a7a304:	41 56                	push   r14
  a7a306:	53                   	push   rbx
  a7a307:	48 83 ec 28          	sub    rsp,0x28
  a7a30b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7a312:	00 00
  a7a314:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  a7a319:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  a7a31d:	6a 50                	push   0x50
  a7a31f:	5f                   	pop    rdi
  a7a320:	e8 db 3b d7 00       	call   17edf00 <_Znwm@plt>
  a7a325:	48 89 c3             	mov    rbx,rax
  a7a328:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  a7a32c:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  a7a331:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  a7a336:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  a7a33d:	00 00
  a7a33f:	48 8d 05 e2 2b d8 00 	lea    rax,[rip+0xd82be2]        # 17fcf28 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2c48>
  a7a346:	48 89 03             	mov    QWORD PTR [rbx],rax
  a7a349:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  a7a34d:	4c 89 f6             	mov    rsi,r14
  a7a350:	e8 47 01 00 00       	call   a7a49c <JNI_OnUnload@@Base+0x1d69>
  a7a355:	48 89 e7             	mov    rdi,rsp
  a7a358:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  a7a35c:	e8 69 ff ff ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  a7a361:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7a368:	00 00
  a7a36a:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  a7a36f:	75 2e                	jne    a7a39f <JNI_OnUnload@@Base+0x1c6c>
  a7a371:	48 89 d8             	mov    rax,rbx
  a7a374:	48 83 c4 28          	add    rsp,0x28
  a7a378:	5b                   	pop    rbx
  a7a379:	41 5e                	pop    r14
  a7a37b:	c3                   	ret
  a7a37c:	48 89 c3             	mov    rbx,rax
  a7a37f:	48 89 e7             	mov    rdi,rsp
  a7a382:	e8 43 ff ff ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  a7a387:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7a38e:	00 00
  a7a390:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  a7a395:	75 08                	jne    a7a39f <JNI_OnUnload@@Base+0x1c6c>
  a7a397:	48 89 df             	mov    rdi,rbx
  a7a39a:	e8 31 59 ff ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a7a39f:	e8 0c 57 d7 00       	call   17efab0 <__stack_chk_fail@plt>
  a7a3a4:	48 8d 47 10          	lea    rax,[rdi+0x10]
  a7a3a8:	48 8d 0d 79 2b d8 00 	lea    rcx,[rip+0xd82b79]        # 17fcf28 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2c48>
  a7a3af:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  a7a3b2:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  a7a3b6:	48 89 c6             	mov    rsi,rax
  a7a3b9:	e9 de 00 00 00       	jmp    a7a49c <JNI_OnUnload@@Base+0x1d69>
  a7a3be:	48 83 c7 20          	add    rdi,0x20
  a7a3c2:	e9 a3 fb ff ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  a7a3c7:	cc                   	int3
  a7a3c8:	53                   	push   rbx
  a7a3c9:	48 89 fb             	mov    rbx,rdi
  a7a3cc:	48 83 c7 20          	add    rdi,0x20
  a7a3d0:	e8 95 fb ff ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  a7a3d5:	48 89 df             	mov    rdi,rbx
```
## `ac39da wrapper destroy/copy helper` at `0xac39da`

```text
  ac3990:	48 83 7b 08 00       	cmp    QWORD PTR [rbx+0x8],0x0
  ac3995:	74 06                	je     ac399d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1093d>
  ac3997:	49 83 26 00          	and    QWORD PTR [r14],0x0
  ac399b:	eb 0e                	jmp    ac39ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1094b>
  ac399d:	48 89 df             	mov    rdi,rbx
  ac39a0:	e8 21 23 d1 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
  ac39a5:	0f 57 c0             	xorps  xmm0,xmm0
  ac39a8:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  ac39ab:	48 83 c4 08          	add    rsp,0x8
  ac39af:	5b                   	pop    rbx
  ac39b0:	41 5e                	pop    r14
  ac39b2:	c3                   	ret
  ac39b3:	cc                   	int3
  ac39b4:	53                   	push   rbx
  ac39b5:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  ac39b9:	48 85 c0             	test   rax,rax
  ac39bc:	74 11                	je     ac39cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1096f>
  ac39be:	48 89 fb             	mov    rbx,rdi
  ac39c1:	31 ff                	xor    edi,edi
  ac39c3:	48 89 de             	mov    rsi,rbx
  ac39c6:	31 d2                	xor    edx,edx
  ac39c8:	ff d0                	call   rax
  ac39ca:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  ac39cf:	5b                   	pop    rbx
  ac39d0:	c3                   	ret
  ac39d1:	48 89 c7             	mov    rdi,rax
  ac39d4:	e8 cc 60 fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ac39d9:	cc                   	int3
  ac39da:	83 ff 01             	cmp    edi,0x1
  ac39dd:	74 1e                	je     ac39fd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1099d>
  ac39df:	85 ff                	test   edi,edi
  ac39e1:	75 20                	jne    ac3a03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109a3>
  ac39e3:	53                   	push   rbx
  ac39e4:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
  ac39e7:	48 85 db             	test   rbx,rbx
  ac39ea:	74 08                	je     ac39f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10994>
  ac39ec:	48 89 df             	mov    rdi,rbx
  ac39ef:	e8 76 65 fb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ac39f4:	48 89 df             	mov    rdi,rbx
  ac39f7:	5b                   	pop    rbx
  ac39f8:	e9 23 a5 d2 00       	jmp    17edf20 <_ZdlPv@plt>
  ac39fd:	48 8b 02             	mov    rax,QWORD PTR [rdx]
  ac3a00:	48 89 06             	mov    QWORD PTR [rsi],rax
  ac3a03:	c3                   	ret
  ac3a04:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ac3a07:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
  ac3a0b:	e9 52 6a fb ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  ac3a10:	41 57                	push   r15
  ac3a12:	41 56                	push   r14
  ac3a14:	53                   	push   rbx
  ac3a15:	49 89 fe             	mov    r14,rdi
  ac3a18:	4c 8b 3e             	mov    r15,QWORD PTR [rsi]
  ac3a1b:	6a 38                	push   0x38
  ac3a1d:	5f                   	pop    rdi
  ac3a1e:	e8 dd a4 d2 00       	call   17edf00 <_Znwm@plt>
  ac3a23:	48 89 c3             	mov    rbx,rax
  ac3a26:	48 8d 35 be b8 88 ff 	lea    rsi,[rip+0xffffffffff88b8be]        # 34f2eb <_ZTSSt12bad_any_cast@@Base-0x40edd>
  ac3a2d:	48 89 c7             	mov    rdi,rax
  ac3a30:	e8 9b 01 b2 00       	call   15e3bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429154>
  ac3a35:	48 8d 05 cc 91 d4 00 	lea    rax,[rip+0xd491cc]        # 180cc08 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x28c8>
  ac3a3c:	48 89 03             	mov    QWORD PTR [rbx],rax
  ac3a3f:	4c 89 7b 20          	mov    QWORD PTR [rbx+0x20],r15
  ac3a43:	48 89 df             	mov    rdi,rbx
  ac3a46:	48 83 c7 28          	add    rdi,0x28
  ac3a4a:	e8 e0 b6 07 00       	call   b3f12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c0cf>
  ac3a4f:	49 89 1e             	mov    QWORD PTR [r14],rbx
  ac3a52:	4c 89 f0             	mov    rax,r14
  ac3a55:	5b                   	pop    rbx
  ac3a56:	41 5e                	pop    r14
  ac3a58:	41 5f                	pop    r15
  ac3a5a:	c3                   	ret
  ac3a5b:	49 89 c6             	mov    r14,rax
  ac3a5e:	48 89 df             	mov    rdi,rbx
  ac3a61:	e8 7e 01 b2 00       	call   15e3be4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429168>
  ac3a66:	48 89 df             	mov    rdi,rbx
  ac3a69:	e8 b2 a4 d2 00       	call   17edf20 <_ZdlPv@plt>
  ac3a6e:	eb 0b                	jmp    ac3a7b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a1b>
  ac3a70:	48 89 c7             	mov    rdi,rax
  ac3a73:	e8 2d 60 fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ac3a78:	49 89 c6             	mov    r14,rax
  ac3a7b:	4c 89 f7             	mov    rdi,r14
  ac3a7e:	e8 22 60 fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ac3a83:	cc                   	int3
  ac3a84:	53                   	push   rbx
  ac3a85:	48 89 fb             	mov    rbx,rdi
  ac3a88:	48 8d 05 59 d7 da 00 	lea    rax,[rip+0xdad759]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
  ac3a8f:	48 89 07             	mov    QWORD PTR [rdi],rax
  ac3a92:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
  ac3a96:	e8 eb a9 fd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ac3a9b:	48 83 c3 10          	add    rbx,0x10
  ac3a9f:	48 89 df             	mov    rdi,rbx
  ac3aa2:	5b                   	pop    rbx
  ac3aa3:	e9 00 00 00 00       	jmp    ac3aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a48>
  ac3aa8:	53                   	push   rbx
  ac3aa9:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  ac3aad:	48 85 c0             	test   rax,rax
  ac3ab0:	74 11                	je     ac3ac3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a63>
  ac3ab2:	48 89 fb             	mov    rbx,rdi
  ac3ab5:	31 ff                	xor    edi,edi
  ac3ab7:	48 89 de             	mov    rsi,rbx
  ac3aba:	31 d2                	xor    edx,edx
  ac3abc:	ff d0                	call   rax
  ac3abe:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  ac3ac3:	5b                   	pop    rbx
  ac3ac4:	c3                   	ret
  ac3ac5:	48 89 c7             	mov    rdi,rax
  ac3ac8:	e8 d8 5f fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ac3acd:	cc                   	int3
  ac3ace:	53                   	push   rbx
  ac3acf:	48 89 fb             	mov    rbx,rdi
  ac3ad2:	e8 ad ff ff ff       	call   ac3a84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a24>
  ac3ad7:	48 89 df             	mov    rdi,rbx
  ac3ada:	5b                   	pop    rbx
  ac3adb:	e9 40 a4 d2 00       	jmp    17edf20 <_ZdlPv@plt>
  ac3ae0:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
  ac3ae4:	c3                   	ret
  ac3ae5:	cc                   	int3
  ac3ae6:	48 8d 05 33 c9 d3 00 	lea    rax,[rip+0xd3c933]        # 1800420 <_ZTIN4asio22service_already_existsE@@Base+0x1c08>
  ac3aed:	48 89 07             	mov    QWORD PTR [rdi],rax
  ac3af0:	e9 1b a5 d2 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  ac3af5:	cc                   	int3
  ac3af6:	53                   	push   rbx
  ac3af7:	48 89 fb             	mov    rbx,rdi
```
## `10adc16 payload adapter helper` at `0x10adc16`

```text
 10adb9c:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
 10adba1:	e8 82 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adba6:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 10adbab:	e8 78 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbb0:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
 10adbb5:	e8 c2 15 ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 10adbba:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 10adbbf:	e8 64 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbc4:	4c 8b b4 24 a0 00 00 	mov    r14,QWORD PTR [rsp+0xa0]
 10adbcb:	00
 10adbcc:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 10adbd0:	e8 b1 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10adbd5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10adbd9:	e8 a8 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10adbde:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 10adbe3:	e8 40 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbe8:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
 10adbef:	00
 10adbf0:	e8 33 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbf5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10adbfc:	00 00
 10adbfe:	48 3b 84 24 50 01 00 	cmp    rax,QWORD PTR [rsp+0x150]
 10adc05:	00
 10adc06:	75 08                	jne    10adc10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275026>
 10adc08:	48 89 df             	mov    rdi,rbx
 10adc0b:	e8 c0 20 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10adc10:	e8 9b 1e 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10adc15:	cc                   	int3
 10adc16:	53                   	push   rbx
 10adc17:	48 89 fb             	mov    rbx,rdi
 10adc1a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10adc1d:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10adc21:	e8 94 f4 9f ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 10adc26:	48 89 d8             	mov    rax,rbx
 10adc29:	5b                   	pop    rbx
 10adc2a:	c3                   	ret
 10adc2b:	cc                   	int3
 10adc2c:	50                   	push   rax
 10adc2d:	e8 4c 60 3d 00       	call   1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
 10adc32:	59                   	pop    rcx
 10adc33:	c3                   	ret
 10adc34:	48 89 c7             	mov    rdi,rax
 10adc37:	e8 69 be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc3c:	53                   	push   rbx
 10adc3d:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 10adc41:	48 85 c0             	test   rax,rax
 10adc44:	74 11                	je     10adc57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27506d>
 10adc46:	48 89 fb             	mov    rbx,rdi
 10adc49:	31 ff                	xor    edi,edi
 10adc4b:	48 89 de             	mov    rsi,rbx
 10adc4e:	31 d2                	xor    edx,edx
 10adc50:	ff d0                	call   rax
 10adc52:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 10adc57:	5b                   	pop    rbx
 10adc58:	c3                   	ret
 10adc59:	48 89 c7             	mov    rdi,rax
 10adc5c:	e8 44 be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc61:	cc                   	int3
 10adc62:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 10adc65:	e9 dc 02 00 00       	jmp    10adf46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27535c>
 10adc6a:	50                   	push   rax
 10adc6b:	e8 0e 60 3d 00       	call   1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
 10adc70:	59                   	pop    rcx
 10adc71:	c3                   	ret
 10adc72:	48 89 c7             	mov    rdi,rax
 10adc75:	e8 2b be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc7a:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 10adc7d:	e9 ce 00 00 00       	jmp    10add50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275166>
 10adc82:	53                   	push   rbx
 10adc83:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10adc86:	48 89 37             	mov    QWORD PTR [rdi],rsi
 10adc89:	48 85 db             	test   rbx,rbx
 10adc8c:	74 12                	je     10adca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b6>
 10adc8e:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
 10adc92:	e8 19 46 00 00       	call   10b22b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2796c6>
 10adc97:	48 89 df             	mov    rdi,rbx
 10adc9a:	5b                   	pop    rbx
 10adc9b:	e9 80 02 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10adca0:	5b                   	pop    rbx
 10adca1:	c3                   	ret
 10adca2:	31 f6                	xor    esi,esi
 10adca4:	e9 d9 ff ff ff       	jmp    10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>
 10adca9:	cc                   	int3
 10adcaa:	53                   	push   rbx
 10adcab:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10adcae:	48 89 37             	mov    QWORD PTR [rdi],rsi
 10adcb1:	48 85 db             	test   rbx,rbx
 10adcb4:	74 11                	je     10adcc7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750dd>
 10adcb6:	48 89 df             	mov    rdi,rbx
 10adcb9:	e8 96 08 00 00       	call   10ae554 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27596a>
 10adcbe:	48 89 df             	mov    rdi,rbx
 10adcc1:	5b                   	pop    rbx
 10adcc2:	e9 59 02 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10adcc7:	5b                   	pop    rbx
 10adcc8:	c3                   	ret
 10adcc9:	cc                   	int3
 10adcca:	31 f6                	xor    esi,esi
 10adccc:	e9 d9 ff ff ff       	jmp    10adcaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750c0>
 10adcd1:	cc                   	int3
 10adcd2:	53                   	push   rbx
 10adcd3:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10adcd6:	48 89 37             	mov    QWORD PTR [rdi],rsi
 10adcd9:	48 85 db             	test   rbx,rbx
 10adcdc:	74 11                	je     10adcef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275105>
 10adcde:	48 89 df             	mov    rdi,rbx
 10adce1:	e8 92 2d 01 00       	call   10c0a78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287e8e>
 10adce6:	48 89 df             	mov    rdi,rbx
 10adce9:	5b                   	pop    rbx
 10adcea:	e9 31 02 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10adcef:	5b                   	pop    rbx
 10adcf0:	c3                   	ret
 10adcf1:	cc                   	int3
 10adcf2:	31 f6                	xor    esi,esi
 10adcf4:	e9 d9 ff ff ff       	jmp    10adcd2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e8>
 10adcf9:	cc                   	int3
 10adcfa:	53                   	push   rbx
 10adcfb:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 10adcff:	48 85 c0             	test   rax,rax
 10add02:	74 11                	je     10add15 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27512b>
 10add04:	48 89 fb             	mov    rbx,rdi
 10add07:	31 ff                	xor    edi,edi
 10add09:	48 89 de             	mov    rsi,rbx
 10add0c:	31 d2                	xor    edx,edx
```
## `10bff2c installed AP reset/destructor` at `0x10bff2c`

```text
 10bfed8:	74 08                	je     10bfee2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2872f8>
 10bfeda:	4c 89 ff             	mov    rdi,r15
 10bfedd:	e8 3e e0 72 00       	call   17edf20 <_ZdlPv@plt>
 10bfee2:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
 10bfee6:	48 83 c4 08          	add    rsp,0x8
 10bfeea:	5b                   	pop    rbx
 10bfeeb:	41 5c                	pop    r12
 10bfeed:	41 5d                	pop    r13
 10bfeef:	41 5e                	pop    r14
 10bfef1:	41 5f                	pop    r15
 10bfef3:	5d                   	pop    rbp
 10bfef4:	c3                   	ret
 10bfef5:	e8 c6 46 94 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
 10bfefa:	e8 e0 b7 9b ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
 10bfeff:	cc                   	int3
 10bff00:	48 8d 05 59 d9 78 00 	lea    rax,[rip+0x78d959]        # 184d860 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f48>
 10bff07:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff0a:	e9 01 e1 72 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 10bff0f:	cc                   	int3
 10bff10:	53                   	push   rbx
 10bff11:	48 89 fb             	mov    rbx,rdi
 10bff14:	e8 e7 ff ff ff       	call   10bff00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287316>
 10bff19:	48 89 df             	mov    rdi,rbx
 10bff1c:	5b                   	pop    rbx
 10bff1d:	e9 fe df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff22:	48 83 c7 18          	add    rdi,0x18
 10bff26:	e9 ff dd fe ff       	jmp    10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10bff2b:	cc                   	int3
 10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10bff33:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff36:	48 83 c7 08          	add    rdi,0x8
 10bff3a:	e9 13 1d d2 ff       	jmp    de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10bff3f:	cc                   	int3
 10bff40:	53                   	push   rbx
 10bff41:	48 89 fb             	mov    rbx,rdi
 10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>
 10bff49:	48 89 df             	mov    rdi,rbx
 10bff4c:	5b                   	pop    rbx
 10bff4d:	e9 ce df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff52:	41 56                	push   r14
 10bff54:	53                   	push   rbx
 10bff55:	48 83 ec 28          	sub    rsp,0x28
 10bff59:	48 89 d3             	mov    rbx,rdx
 10bff5c:	48 89 f2             	mov    rdx,rsi
 10bff5f:	48 89 f8             	mov    rax,rdi
 10bff62:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bff69:	00 00
 10bff6b:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 10bff70:	48 8d 77 08          	lea    rsi,[rdi+0x8]
 10bff74:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bff79:	4c 89 f7             	mov    rdi,r14
 10bff7c:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10bff7f:	48 89 df             	mov    rdi,rbx
 10bff82:	e8 af b8 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bff87:	4c 89 f7             	mov    rdi,r14
 10bff8a:	48 89 c6             	mov    rsi,rax
 10bff8d:	e8 60 4f 70 00       	call   17c4ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17905e>
 10bff92:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bff97:	e8 f4 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bff9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffa3:	00 00
 10bffa5:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffaa:	75 2d                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffac:	48 83 c4 28          	add    rsp,0x28
 10bffb0:	5b                   	pop    rbx
 10bffb1:	41 5e                	pop    r14
 10bffb3:	c3                   	ret
 10bffb4:	48 89 c3             	mov    rbx,rax
 10bffb7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bffbc:	e8 cf de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bffc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffc8:	00 00
 10bffca:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffcf:	75 08                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffd1:	48 89 df             	mov    rdi,rbx
 10bffd4:	e8 f7 fc 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bffd9:	e8 d2 fa 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10bffde:	55                   	push   rbp
 10bffdf:	53                   	push   rbx
 10bffe0:	48 83 ec 48          	sub    rsp,0x48
 10bffe4:	48 89 f0             	mov    rax,rsi
 10bffe7:	48 89 fb             	mov    rbx,rdi
 10bffea:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bfff1:	00 00
 10bfff3:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
 10bfff8:	0f 57 c0             	xorps  xmm0,xmm0
 10bfffb:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c0000:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0006:	48 83 c6 08          	add    rsi,0x8
 10c000a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c000f:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c0012:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c0017:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10c001c:	31 d2                	xor    edx,edx
 10c001e:	e8 b9 4e 70 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>
 10c0023:	89 c5                	mov    ebp,eax
 10c0025:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c002a:	e8 61 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c002f:	40 84 ed             	test   bpl,bpl
 10c0032:	74 23                	je     10c0057 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28746d>
 10c0034:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10c0039:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 10c003d:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
 10c0042:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10c0045:	0f 57 c0             	xorps  xmm0,xmm0
 10c0048:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c004d:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0053:	b0 01                	mov    al,0x1
 10c0055:	eb 05                	jmp    10c005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287472>
 10c0057:	c6 03 00             	mov    BYTE PTR [rbx],0x0
 10c005a:	31 c0                	xor    eax,eax
 10c005c:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
 10c005f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10c0064:	e8 27 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c0069:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10c0070:	00 00
 10c0072:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10c0077:	75 3e                	jne    10c00b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874cd>
 10c0079:	48 89 d8             	mov    rax,rbx
 10c007c:	48 83 c4 48          	add    rsp,0x48
 10c0080:	5b                   	pop    rbx
 10c0081:	5d                   	pop    rbp
 10c0082:	c3                   	ret
```
## `10bff52 installed AP forwarding helper` at `0x10bff52`

```text
 10bfef4:	c3                   	ret
 10bfef5:	e8 c6 46 94 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
 10bfefa:	e8 e0 b7 9b ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
 10bfeff:	cc                   	int3
 10bff00:	48 8d 05 59 d9 78 00 	lea    rax,[rip+0x78d959]        # 184d860 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f48>
 10bff07:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff0a:	e9 01 e1 72 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 10bff0f:	cc                   	int3
 10bff10:	53                   	push   rbx
 10bff11:	48 89 fb             	mov    rbx,rdi
 10bff14:	e8 e7 ff ff ff       	call   10bff00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287316>
 10bff19:	48 89 df             	mov    rdi,rbx
 10bff1c:	5b                   	pop    rbx
 10bff1d:	e9 fe df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff22:	48 83 c7 18          	add    rdi,0x18
 10bff26:	e9 ff dd fe ff       	jmp    10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10bff2b:	cc                   	int3
 10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10bff33:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff36:	48 83 c7 08          	add    rdi,0x8
 10bff3a:	e9 13 1d d2 ff       	jmp    de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10bff3f:	cc                   	int3
 10bff40:	53                   	push   rbx
 10bff41:	48 89 fb             	mov    rbx,rdi
 10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>
 10bff49:	48 89 df             	mov    rdi,rbx
 10bff4c:	5b                   	pop    rbx
 10bff4d:	e9 ce df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff52:	41 56                	push   r14
 10bff54:	53                   	push   rbx
 10bff55:	48 83 ec 28          	sub    rsp,0x28
 10bff59:	48 89 d3             	mov    rbx,rdx
 10bff5c:	48 89 f2             	mov    rdx,rsi
 10bff5f:	48 89 f8             	mov    rax,rdi
 10bff62:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bff69:	00 00
 10bff6b:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 10bff70:	48 8d 77 08          	lea    rsi,[rdi+0x8]
 10bff74:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bff79:	4c 89 f7             	mov    rdi,r14
 10bff7c:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10bff7f:	48 89 df             	mov    rdi,rbx
 10bff82:	e8 af b8 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bff87:	4c 89 f7             	mov    rdi,r14
 10bff8a:	48 89 c6             	mov    rsi,rax
 10bff8d:	e8 60 4f 70 00       	call   17c4ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17905e>
 10bff92:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bff97:	e8 f4 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bff9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffa3:	00 00
 10bffa5:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffaa:	75 2d                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffac:	48 83 c4 28          	add    rsp,0x28
 10bffb0:	5b                   	pop    rbx
 10bffb1:	41 5e                	pop    r14
 10bffb3:	c3                   	ret
 10bffb4:	48 89 c3             	mov    rbx,rax
 10bffb7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bffbc:	e8 cf de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bffc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffc8:	00 00
 10bffca:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffcf:	75 08                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffd1:	48 89 df             	mov    rdi,rbx
 10bffd4:	e8 f7 fc 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bffd9:	e8 d2 fa 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10bffde:	55                   	push   rbp
 10bffdf:	53                   	push   rbx
 10bffe0:	48 83 ec 48          	sub    rsp,0x48
 10bffe4:	48 89 f0             	mov    rax,rsi
 10bffe7:	48 89 fb             	mov    rbx,rdi
 10bffea:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bfff1:	00 00
 10bfff3:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
 10bfff8:	0f 57 c0             	xorps  xmm0,xmm0
 10bfffb:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c0000:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0006:	48 83 c6 08          	add    rsi,0x8
 10c000a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c000f:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c0012:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c0017:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10c001c:	31 d2                	xor    edx,edx
 10c001e:	e8 b9 4e 70 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>
 10c0023:	89 c5                	mov    ebp,eax
 10c0025:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c002a:	e8 61 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c002f:	40 84 ed             	test   bpl,bpl
 10c0032:	74 23                	je     10c0057 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28746d>
 10c0034:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10c0039:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 10c003d:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
 10c0042:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10c0045:	0f 57 c0             	xorps  xmm0,xmm0
 10c0048:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c004d:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0053:	b0 01                	mov    al,0x1
 10c0055:	eb 05                	jmp    10c005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287472>
 10c0057:	c6 03 00             	mov    BYTE PTR [rbx],0x0
 10c005a:	31 c0                	xor    eax,eax
 10c005c:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
 10c005f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10c0064:	e8 27 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c0069:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10c0070:	00 00
 10c0072:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10c0077:	75 3e                	jne    10c00b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874cd>
 10c0079:	48 89 d8             	mov    rax,rbx
 10c007c:	48 83 c4 48          	add    rsp,0x48
 10c0080:	5b                   	pop    rbx
 10c0081:	5d                   	pop    rbp
 10c0082:	c3                   	ret
 10c0083:	48 89 c3             	mov    rbx,rax
 10c0086:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c008b:	e8 00 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c0090:	eb 03                	jmp    10c0095 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874ab>
 10c0092:	48 89 c3             	mov    rbx,rax
 10c0095:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10c009a:	e8 f1 dd 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c009f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10c00a6:	00 00
 10c00a8:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10c00ad:	75 08                	jne    10c00b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874cd>
```
## `10bffde installed AP bool/helper` at `0x10bffde`

```text
 10bff74:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bff79:	4c 89 f7             	mov    rdi,r14
 10bff7c:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10bff7f:	48 89 df             	mov    rdi,rbx
 10bff82:	e8 af b8 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bff87:	4c 89 f7             	mov    rdi,r14
 10bff8a:	48 89 c6             	mov    rsi,rax
 10bff8d:	e8 60 4f 70 00       	call   17c4ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17905e>
 10bff92:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bff97:	e8 f4 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bff9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffa3:	00 00
 10bffa5:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffaa:	75 2d                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffac:	48 83 c4 28          	add    rsp,0x28
 10bffb0:	5b                   	pop    rbx
 10bffb1:	41 5e                	pop    r14
 10bffb3:	c3                   	ret
 10bffb4:	48 89 c3             	mov    rbx,rax
 10bffb7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bffbc:	e8 cf de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bffc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffc8:	00 00
 10bffca:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffcf:	75 08                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffd1:	48 89 df             	mov    rdi,rbx
 10bffd4:	e8 f7 fc 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bffd9:	e8 d2 fa 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10bffde:	55                   	push   rbp
 10bffdf:	53                   	push   rbx
 10bffe0:	48 83 ec 48          	sub    rsp,0x48
 10bffe4:	48 89 f0             	mov    rax,rsi
 10bffe7:	48 89 fb             	mov    rbx,rdi
 10bffea:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bfff1:	00 00
 10bfff3:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
 10bfff8:	0f 57 c0             	xorps  xmm0,xmm0
 10bfffb:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c0000:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0006:	48 83 c6 08          	add    rsi,0x8
 10c000a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c000f:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c0012:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c0017:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10c001c:	31 d2                	xor    edx,edx
 10c001e:	e8 b9 4e 70 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>
 10c0023:	89 c5                	mov    ebp,eax
 10c0025:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c002a:	e8 61 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c002f:	40 84 ed             	test   bpl,bpl
 10c0032:	74 23                	je     10c0057 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28746d>
 10c0034:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10c0039:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 10c003d:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
 10c0042:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10c0045:	0f 57 c0             	xorps  xmm0,xmm0
 10c0048:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c004d:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0053:	b0 01                	mov    al,0x1
 10c0055:	eb 05                	jmp    10c005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287472>
 10c0057:	c6 03 00             	mov    BYTE PTR [rbx],0x0
 10c005a:	31 c0                	xor    eax,eax
 10c005c:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
 10c005f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10c0064:	e8 27 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c0069:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10c0070:	00 00
 10c0072:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10c0077:	75 3e                	jne    10c00b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874cd>
 10c0079:	48 89 d8             	mov    rax,rbx
 10c007c:	48 83 c4 48          	add    rsp,0x48
 10c0080:	5b                   	pop    rbx
 10c0081:	5d                   	pop    rbp
 10c0082:	c3                   	ret
 10c0083:	48 89 c3             	mov    rbx,rax
 10c0086:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c008b:	e8 00 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c0090:	eb 03                	jmp    10c0095 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874ab>
 10c0092:	48 89 c3             	mov    rbx,rax
 10c0095:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10c009a:	e8 f1 dd 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c009f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10c00a6:	00 00
 10c00a8:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10c00ad:	75 08                	jne    10c00b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874cd>
 10c00af:	48 89 df             	mov    rdi,rbx
 10c00b2:	e8 19 fc 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10c00b7:	e8 f4 f9 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10c00bc:	53                   	push   rbx
 10c00bd:	48 89 fb             	mov    rbx,rdi
 10c00c0:	48 83 c7 08          	add    rdi,0x8
 10c00c4:	e8 3f a9 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10c00c9:	48 8b 5b 18          	mov    rbx,QWORD PTR [rbx+0x18]
 10c00cd:	48 85 db             	test   rbx,rbx
 10c00d0:	74 08                	je     10c00da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874f0>
 10c00d2:	48 89 df             	mov    rdi,rbx
 10c00d5:	e8 b8 00 00 00       	call   10c0192 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2875a8>
 10c00da:	48 89 df             	mov    rdi,rbx
 10c00dd:	5b                   	pop    rbx
 10c00de:	e9 3d de 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10c00e3:	cc                   	int3
 10c00e4:	53                   	push   rbx
 10c00e5:	48 89 fb             	mov    rbx,rdi
 10c00e8:	e8 cf ff ff ff       	call   10c00bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874d2>
 10c00ed:	48 89 df             	mov    rdi,rbx
 10c00f0:	5b                   	pop    rbx
 10c00f1:	e9 2a de 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10c00f6:	0f 18 0d 1b 93 83 00 	prefetcht0 BYTE PTR [rip+0x83931b]        # 18f9418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40828>
 10c00fd:	48 8d 05 14 93 83 00 	lea    rax,[rip+0x839314]        # 18f9418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40828>
 10c0104:	48 8b 0d 15 93 83 00 	mov    rcx,QWORD PTR [rip+0x839315]        # 18f9420 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40830>
 10c010b:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10c010e:	c3                   	ret
 10c010f:	cc                   	int3
 10c0110:	48 89 f0             	mov    rax,rsi
 10c0113:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10c0117:	48 8d 0d 2a d8 78 00 	lea    rcx,[rip+0x78d82a]        # 184d948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa030>
 10c011e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10c0121:	0f 57 c0             	xorps  xmm0,xmm0
 10c0124:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 10c0128:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
 10c012d:	c3                   	ret
 10c012e:	53                   	push   rbx
 10c012f:	48 89 f3             	mov    rbx,rsi
```
## Constructor payload-related signals

| addr | instruction |
|---:|---|
| `0x10aba39` | `10aba39:	41 56                	push   r14` |
| `0x10abb09` | `10abb09:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abb14` | `10abb14:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abb3d` | `10abb3d:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abb91` | `10abb91:	4c 89 f7             	mov    rdi,r14` |
| `0x10abbaa` | `10abbaa:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abbae` | `10abbae:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abbda` | `10abbda:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abc27` | `10abc27:	4c 89 f7             	mov    rdi,r14` |
| `0x10abc3d` | `10abc3d:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abc48` | `10abc48:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abc71` | `10abc71:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abcbe` | `10abcbe:	4c 89 f7             	mov    rdi,r14` |
| `0x10abcd4` | `10abcd4:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abcdf` | `10abcdf:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abd08` | `10abd08:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abd55` | `10abd55:	4c 89 f7             	mov    rdi,r14` |
| `0x10abd6b` | `10abd6b:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abd76` | `10abd76:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abd9f` | `10abd9f:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abdec` | `10abdec:	4c 89 f7             	mov    rdi,r14` |
| `0x10abe02` | `10abe02:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abe0d` | `10abe0d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abe36` | `10abe36:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abe83` | `10abe83:	4c 89 f7             	mov    rdi,r14` |
| `0x10abe99` | `10abe99:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0x10abea4` | `10abea4:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abecd` | `10abecd:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abf1a` | `10abf1a:	4c 89 f7             	mov    rdi,r14` |
| `0x10abf3b` | `10abf3b:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10abf64` | `10abf64:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10abf7e` | `10abf7e:	41 5e                	pop    r14` |
| `0x10abf80` | `10abf80:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10abf90` | `10abf90:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10abf94` | `10abf94:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10abfb4` | `10abfb4:	41 5e                	pop    r14` |
| `0x10abfbc` | `10abfbc:	4d 89 f0             	mov    r8,r14` |
| `0x10ac03c` | `10ac03c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac065` | `10ac065:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10ac07a` | `10ac07a:	41 5e                	pop    r14` |
| `0x10ac07c` | `10ac07c:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ac08c` | `10ac08c:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ac090` | `10ac090:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ac0ad` | `10ac0ad:	41 5e                	pop    r14` |
| `0x10ac0b6` | `10ac0b6:	4c 89 f2             	mov    rdx,r14` |
| `0x10ac0ea` | `10ac0ea:	4c 89 f2             	mov    rdx,r14` |
| `0x10ac110` | `10ac110:	4c 89 f2             	mov    rdx,r14` |
| `0x10ac131` | `10ac131:	49 89 c6             	mov    r14,rax` |
| `0x10ac134` | `10ac134:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0` |
| `0x10ac13d` | `10ac13d:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0` |
| `0x10ac159` | `10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>` |
| `0x10ac15e` | `10ac15e:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ac16a` | `10ac16a:	48 8d 05 69 78 a1 ff 	lea    rax,[rip+0xffffffffffa17869]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>` |
| `0x10ac171` | `10ac171:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ac175` | `10ac175:	48 8d 05 9a 1a 00 00 	lea    rax,[rip+0x1a9a]        # 10adc16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27502c>` |
| `0x10ac17c` | `10ac17c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ac180` | `10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>` |
| `0x10ac187` | `10ac187:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ac18a` | `10ac18a:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac194` | `10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>` |
| `0x10ac19c` | `10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10ac1a9` | `10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac204` | `10ac204:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac213` | `10ac213:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac21b` | `10ac21b:	41 38 6e 18          	cmp    BYTE PTR [r14+0x18],bpl` |
| `0x10ac228` | `10ac228:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac237` | `10ac237:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac327` | `10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac336` | `10ac336:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac33e` | `10ac33e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10ac350` | `10ac350:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac365` | `10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac37d` | `10ac37d:	49 89 c6             	mov    r14,rax` |
| `0x10ac3a3` | `10ac3a3:	4c 89 71 08          	mov    QWORD PTR [rcx+0x8],r14` |
| `0x10ac3d1` | `10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac3f8` | `10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac400` | `10ac400:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac40c` | `10ac40c:	4d 89 3e             	mov    QWORD PTR [r14],r15` |
| `0x10ac416` | `10ac416:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10ac421` | `10ac421:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0x10ac42f` | `10ac42f:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac43a` | `10ac43a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac463` | `10ac463:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac499` | `10ac499:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac4a8` | `10ac4a8:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac4b0` | `10ac4b0:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10ac4c2` | `10ac4c2:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac4d7` | `10ac4d7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac4ef` | `10ac4ef:	49 89 c6             	mov    r14,rax` |
| `0x10ac506` | `10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ac51b` | `10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac545` | `10ac545:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac54d` | `10ac54d:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac560` | `10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15` |
| `0x10ac56a` | `10ac56a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10ac575` | `10ac575:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax` |
| `0x10ac57c` | `10ac57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ac587` | `10ac587:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac5da` | `10ac5da:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac610` | `10ac610:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac61f` | `10ac61f:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac627` | `10ac627:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10ac639` | `10ac639:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac64e` | `10ac64e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac6a1` | `10ac6a1:	41 5e                	pop    r14` |
| `0x10ac6ab` | `10ac6ab:	4c 89 f2             	mov    rdx,r14` |
| `0x10ac6cb` | `10ac6cb:	4c 89 f2             	mov    rdx,r14` |
| `0x10ac6e6` | `10ac6e6:	49 89 c6             	mov    r14,rax` |
| `0x10ac718` | `10ac718:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ac737` | `10ac737:	49 89 55 10          	mov    QWORD PTR [r13+0x10],rdx` |
| `0x10ac742` | `10ac742:	49 89 55 18          	mov    QWORD PTR [r13+0x18],rdx` |
| `0x10ac74d` | `10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx` |
| `0x10ac758` | `10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx` |
| `0x10ac760` | `10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx` |
| `0x10ac768` | `10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10ac776` | `10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx` |
| `0x10ac77a` | `10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax` |
| `0x10ac77e` | `10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]` |
| `0x10ac78d` | `10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0` |
| `0x10ac792` | `10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0` |
| `0x10ac797` | `10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0` |
| `0x10ac79c` | `10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]` |
| `0x10ac7a3` | `10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]` |
| `0x10ac7ac` | `10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100` |
| `0x10ac7b6` | `10ac7b6:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac7dd` | `10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac824` | `10ac824:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]` |
| `0x10ac82c` | `10ac82c:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax` |
| `0x10ac838` | `10ac838:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac875` | `10ac875:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0` |
| `0x10ac87e` | `10ac87e:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0` |
| `0x10ac8a2` | `10ac8a2:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ac8b5` | `10ac8b5:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ac8c0` | `10ac8c0:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ac8f1` | `10ac8f1:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac908` | `10ac908:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ac970` | `10ac970:	49 89 c6             	mov    r14,rax` |
| `0x10ac9a5` | `10ac9a5:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]` |
| `0x10ac9da` | `10ac9da:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ac9e5` | `10ac9e5:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10ac9f1` | `10ac9f1:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax` |
| `0x10ac9fd` | `10ac9fd:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10aca1e` | `10aca1e:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax` |
| `0x10aca32` | `10aca32:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax` |
| `0x10aca36` | `10aca36:	49 8d 7e 38          	lea    rdi,[r14+0x38]` |
| `0x10aca42` | `10aca42:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0` |
| `0x10aca47` | `10aca47:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0` |
| `0x10aca4c` | `10aca4c:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0` |
| `0x10aca51` | `10aca51:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]` |
| `0x10aca58` | `10aca58:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]` |
| `0x10aca61` | `10aca61:	41 c6 86 98 00 00 00 	mov    BYTE PTR [r14+0x98],0x0` |
| `0x10aca69` | `10aca69:	4c 89 f7             	mov    rdi,r14` |
| `0x10acac9` | `10acac9:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10acaeb` | `10acaeb:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10acb2d` | `10acb2d:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]` |
| `0x10acb35` | `10acb35:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax` |
| `0x10acb41` | `10acb41:	4c 89 f7             	mov    rdi,r14` |
| `0x10acb7e` | `10acb7e:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0` |
| `0x10acb87` | `10acb87:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0` |
| `0x10acbab` | `10acbab:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10acbbe` | `10acbbe:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10acbc9` | `10acbc9:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10acbfa` | `10acbfa:	4c 89 f7             	mov    rdi,r14` |
| `0x10acc1c` | `10acc1c:	49 89 c6             	mov    r14,rax` |
| `0x10acc26` | `10acc26:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10acc30` | `10acc30:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10acc3b` | `10acc3b:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10acc47` | `10acc47:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12` |
| `0x10acc4b` | `10acc4b:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx` |
| `0x10acc4f` | `10acc4f:	4d 89 7e 28          	mov    QWORD PTR [r14+0x28],r15` |
| `0x10acc55` | `10acc55:	41 88 5e 30          	mov    BYTE PTR [r14+0x30],bl` |
| `0x10acc59` | `10acc59:	41 88 5e 60          	mov    BYTE PTR [r14+0x60],bl` |
| `0x10acc5d` | `10acc5d:	41 88 5e 68          	mov    BYTE PTR [r14+0x68],bl` |
| `0x10acc61` | `10acc61:	41 88 9e c0 00 00 00 	mov    BYTE PTR [r14+0xc0],bl` |
| `0x10acc6b` | `10acc6b:	41 0f 11 86 c8 00 00 	movups XMMWORD PTR [r14+0xc8],xmm0` |
| `0x10acc7b` | `10acc7b:	4d 89 30             	mov    QWORD PTR [r8],r14` |
| `0x10acc8c` | `10acc8c:	4c 8d bc 24 10 01 00 	lea    r15,[rsp+0x110]` |
| `0x10acca2` | `10acca2:	4d 89 f5             	mov    r13,r14` |
| `0x10acce0` | `10acce0:	41 88 9e e8 00 00 00 	mov    BYTE PTR [r14+0xe8],bl` |
| `0x10accea` | `10accea:	41 0f 11 86 f0 00 00 	movups XMMWORD PTR [r14+0xf0],xmm0` |
| `0x10accf2` | `10accf2:	41 0f 11 86 00 01 00 	movups XMMWORD PTR [r14+0x100],xmm0` |
| `0x10accfa` | `10accfa:	41 c7 86 10 01 00 00 	mov    DWORD PTR [r14+0x110],0x3f800000` |
| `0x10acd05` | `10acd05:	41 0f 11 86 18 01 00 	movups XMMWORD PTR [r14+0x118],xmm0` |
| `0x10acd0d` | `10acd0d:	41 0f 11 86 28 01 00 	movups XMMWORD PTR [r14+0x128],xmm0` |
| `0x10acd15` | `10acd15:	41 0f 11 86 38 01 00 	movups XMMWORD PTR [r14+0x138],xmm0` |
| `0x10acd25` | `10acd25:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10acd3e` | `10acd3e:	49 89 c6             	mov    r14,rax` |
| `0x10acd66` | `10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14` |
| `0x10acd8c` | `10acd8c:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10acd94` | `10acd94:	49 83 26 00          	and    QWORD PTR [r14],0x0` |
| `0x10acda5` | `10acda5:	4c 89 f7             	mov    rdi,r14` |
| `0x10acdd6` | `10acdd6:	49 89 c6             	mov    r14,rax` |
| `0x10acde0` | `10acde0:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10acdea` | `10acdea:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10acdee` | `10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15` |
| `0x10acdf2` | `10acdf2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13` |
| `0x10acdf6` | `10acdf6:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx` |
| `0x10acdfa` | `10acdfa:	4d 8d 66 28          	lea    r12,[r14+0x28]` |
| `0x10ace01` | `10ace01:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0` |
| `0x10ace06` | `10ace06:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0` |
| `0x10ace0b` | `10ace0b:	41 c7 46 48 00 00 80 	mov    DWORD PTR [r14+0x48],0x3f800000` |
| `0x10ace13` | `10ace13:	49 8d 6e 50          	lea    rbp,[r14+0x50]` |
| `0x10ace1f` | `10ace1f:	4d 8d ae a8 00 00 00 	lea    r13,[r14+0xa8]` |
| `0x10ace3e` | `10ace3e:	4d 89 30             	mov    QWORD PTR [r8],r14` |
| `0x10ace4f` | `10ace4f:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ace7c` | `10ace7c:	4c 89 f7             	mov    rdi,r14` |
| `0x10ace9f` | `10ace9f:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10acec3` | `10acec3:	4c 89 f6             	mov    rsi,r14` |
| `0x10acee6` | `10acee6:	49 89 c6             	mov    r14,rax` |
| `0x10acef0` | `10acef0:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10acefa` | `10acefa:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10acefe` | `10acefe:	4d 89 f7             	mov    r15,r14` |
| `0x10acf08` | `10acf08:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10acf0d` | `10acf0d:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0` |
| `0x10acf12` | `10acf12:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0` |
| `0x10acf32` | `10acf32:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10acf46` | `10acf46:	4c 89 f6             	mov    rsi,r14` |
| `0x10acf7b` | `10acf7b:	41 5e                	pop    r14` |
| `0x10acf82` | `10acf82:	4d 89 f0             	mov    r8,r14` |
| `0x10ad015` | `10ad015:	4d 89 f0             	mov    r8,r14` |
| `0x10ad036` | `10ad036:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad05a` | `10ad05a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad069` | `10ad069:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad088` | `10ad088:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad0ac` | `10ad0ac:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad0c7` | `10ad0c7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad0e6` | `10ad0e6:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad10e` | `10ad10e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad129` | `10ad129:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad14b` | `10ad14b:	4c 8b 30             	mov    r14,QWORD PTR [rax]` |
| `0x10ad193` | `10ad193:	4d 8d 6e 08          	lea    r13,[r14+0x8]` |
| `0x10ad197` | `10ad197:	4d 85 f6             	test   r14,r14` |
| `0x10ad19a` | `10ad19a:	4d 0f 44 ee          	cmove  r13,r14` |
| `0x10ad2b1` | `10ad2b1:	4c 8d b5 78 01 00 00 	lea    r14,[rbp+0x178]` |
| `0x10ad2b8` | `10ad2b8:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad2f5` | `10ad2f5:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad322` | `10ad322:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad363` | `10ad363:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad3a9` | `10ad3a9:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad3d8` | `10ad3d8:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad41e` | `10ad41e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad44d` | `10ad44d:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad495` | `10ad495:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad4aa` | `10ad4aa:	49 89 c6             	mov    r14,rax` |
| `0x10ad4b4` | `10ad4b4:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ad4b7` | `10ad4b7:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp` |
| `0x10ad4c6` | `10ad4c6:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10ad4d9` | `10ad4d9:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax` |
| `0x10ad4dd` | `10ad4dd:	49 83 66 48 00       	and    QWORD PTR [r14+0x48],0x0` |
| `0x10ad4e2` | `10ad4e2:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0` |
| `0x10ad4e7` | `10ad4e7:	49 83 66 38 00       	and    QWORD PTR [r14+0x38],0x0` |
| `0x10ad502` | `10ad502:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]` |
| `0x10ad526` | `10ad526:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad537` | `10ad537:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad556` | `10ad556:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ad568` | `10ad568:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad57c` | `10ad57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ad5ed` | `10ad5ed:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]` |
| `0x10ad608` | `10ad608:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ad613` | `10ad613:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ad61f` | `10ad61f:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]` |
| `0x10ad65d` | `10ad65d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad697` | `10ad697:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ad70a` | `10ad70a:	41 5e                	pop    r14` |
| `0x10ad749` | `10ad749:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad756` | `10ad756:	4d 89 fe             	mov    r14,r15` |
| `0x10ad76c` | `10ad76c:	4d 89 fe             	mov    r14,r15` |
| `0x10ad772` | `10ad772:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad77f` | `10ad77f:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad794` | `10ad794:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad7a1` | `10ad7a1:	4d 89 fe             	mov    r14,r15` |
| `0x10ad7af` | `10ad7af:	4d 89 fe             	mov    r14,r15` |
| `0x10ad7b5` | `10ad7b5:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad7c2` | `10ad7c2:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad7d4` | `10ad7d4:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]` |
| `0x10ad7ef` | `10ad7ef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad814` | `10ad814:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad82b` | `10ad82b:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad885` | `10ad885:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad8a4` | `10ad8a4:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad903` | `10ad903:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad918` | `10ad918:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad95c` | `10ad95c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10ad964` | `10ad964:	e8 e9 42 d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10ad969` | `10ad969:	4c 89 f7             	mov    rdi,r14` |
| `0x10ad97e` | `10ad97e:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ad98e` | `10ad98e:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ad992` | `10ad992:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ad9a7` | `10ad9a7:	41 5e                	pop    r14` |
| `0x10ad9a9` | `10ad9a9:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ad9b9` | `10ad9b9:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ad9bd` | `10ad9bd:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ad9d2` | `10ad9d2:	41 5e                	pop    r14` |
| `0x10ad9d4` | `10ad9d4:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ad9e4` | `10ad9e4:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ad9e8` | `10ad9e8:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ad9fd` | `10ad9fd:	41 5e                	pop    r14` |
| `0x10ad9ff` | `10ad9ff:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ada0f` | `10ada0f:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ada13` | `10ada13:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ada28` | `10ada28:	41 5e                	pop    r14` |
| `0x10ada2a` | `10ada2a:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ada3a` | `10ada3a:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ada3e` | `10ada3e:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ada53` | `10ada53:	41 5e                	pop    r14` |
| `0x10ada55` | `10ada55:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ada65` | `10ada65:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ada69` | `10ada69:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10ada7b` | `10ada7b:	41 5e                	pop    r14` |
| `0x10ada7d` | `10ada7d:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10ada8d` | `10ada8d:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10ada91` | `10ada91:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10adaa3` | `10adaa3:	41 5e                	pop    r14` |
| `0x10adaa5` | `10adaa5:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10adab5` | `10adab5:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10adab9` | `10adab9:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10adacb` | `10adacb:	41 5e                	pop    r14` |
| `0x10adacd` | `10adacd:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0x10adadd` | `10adadd:	49 83 c6 e8          	add    r14,0xffffffffffffffe8` |
| `0x10adae1` | `10adae1:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0x10adaef` | `10adaef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0x10adb2e` | `10adb2e:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10adb31` | `10adb31:	4c 89 f7             	mov    rdi,r14` |
| `0x10adbc4` | `10adbc4:	4c 8b b4 24 a0 00 00 	mov    r14,QWORD PTR [rsp+0xa0]` |
| `0x10adbcc` | `10adbcc:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]` |
| `0x10adbd5` | `10adbd5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]` |
| `0x10adc16` | `10adc16:	53                   	push   rbx` |

## Text mentions of payload helper targets

| addr | instruction |
|---:|---|
| `0xde1bb4` | `de1bb4:	e8 99 00 00 00       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0xde1c15` | `de1c15:	e8 38 00 00 00       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0xde1c52` | `de1c52:	53                   	push   rbx` |
| `0x106e01a` | `106e01a:	e8 0b 36 00 00       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>` |
| `0x106e096` | `106e096:	e8 b7 3b d7 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x106e19b` | `106e19b:	e8 b2 3a d7 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x106e1af` | `106e1af:	e8 9e 3a d7 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x107162a` | `107162a:	41 56                	push   r14` |
| `0x1071704` | `1071704:	e8 49 05 d7 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10ac175` | `10ac175:	48 8d 05 9a 1a 00 00 	lea    rax,[rip+0x1a9a]        # 10adc16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27502c>` |
| `0x10ac180` | `10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>` |
| `0x10ac194` | `10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>` |
| `0x10ac19c` | `10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10ad964` | `10ad964:	e8 e9 42 d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10adc16` | `10adc16:	53                   	push   rbx` |
| `0x10bff2c` | `10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>` |
| `0x10bff3a` | `10bff3a:	e9 13 1d d2 ff       	jmp    de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10bff44` | `10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>` |
| `0x10bff52` | `10bff52:	41 56                	push   r14` |
| `0x10bffde` | `10bffde:	55                   	push   rbp` |
| `0x11ef75c` | `11ef75c:	e8 c9 1e e8 ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>` |
| `0x11ef810` | `11ef810:	e8 15 1e e8 ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>` |
| `0x11ef911` | `11ef911:	e8 3c 23 bf ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x11ef945` | `11ef945:	e8 08 23 bf ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x11f5935` | `11f5935:	e8 18 c3 be ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x11f5955` | `11f5955:	e8 f8 c2 be ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x11fa142` | `11fa142:	e8 0b 7b be ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |

