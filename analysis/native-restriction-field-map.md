# Orbit restriction field map

Direct native references to public restriction schema names, grouped by ELF unwind function.

- disallow_pausing_reasons: 3 direct xref(s) @ 0xfe9d52, 0x166ee78, 0x1677af1
- disallow_resuming_reasons: 3 direct xref(s) @ 0xfe9d8a, 0x166efcc, 0x1677b31
- disallow_seeking_reasons: 3 direct xref(s) @ 0xfe9dc3, 0x166f021, 0x1677b67
- disallow_peeking_prev_reasons: 3 direct xref(s) @ 0xfe9dfc, 0x166ef22, 0x1677b99
- disallow_peeking_next_reasons: 3 direct xref(s) @ 0xfe9e35, 0x166eecd, 0x1677bcb
- disallow_skipping_prev_reasons: 3 direct xref(s) @ 0xfe9e6e, 0x166f0cb, 0x1677c00
- disallow_skipping_next_reasons: 3 direct xref(s) @ 0xfe9ea7, 0x166f076, 0x1677c35
- disallow_swipe_prev_reasons: 0 direct xref(s)
- disallow_swipe_next_reasons: 0 direct xref(s)
- disallow_toggling_repeat_context_reasons: 3 direct xref(s) @ 0xfe9ee2, 0x166f120, 0x1677c6a
- disallow_toggling_repeat_track_reasons: 3 direct xref(s) @ 0xfe9f1d, 0x166f175, 0x1677c9f
- disallow_toggling_shuffle_reasons: 3 direct xref(s) @ 0xfe9f58, 0x166f1ca, 0x1677cd4
- disallow_set_queue_reasons: 4 direct xref(s) @ 0xfe9f93, 0x14bcb09, 0x166f21f, 0x1677d09
- disallow_add_to_queue_reasons: 4 direct xref(s) @ 0xfe9fce, 0x14bcc83, 0x166f274, 0x1677d3e
- disallow_interrupting_playback_reasons: 3 direct xref(s) @ 0xfea009, 0x166ee23, 0x1677d73
- disallow_transferring_playback_reasons: 4 direct xref(s) @ 0xe19ecf, 0xfea044, 0x166f2c9, 0x1677da8
- disallow_remote_control_reasons: 3 direct xref(s) @ 0xfea07f, 0x166ef77, 0x1677ddd
- disallow_inserting_into_next_tracks_reasons: 3 direct xref(s) @ 0xfea0ba, 0x166f31e, 0x1677e12
- disallow_inserting_into_context_tracks_reasons: 3 direct xref(s) @ 0xfea0f5, 0x166f373, 0x1677e47
- disallow_reordering_in_next_tracks_reasons: 3 direct xref(s) @ 0xfea130, 0x166f3c8, 0x1677e7c
- disallow_reordering_in_context_tracks_reasons: 3 direct xref(s) @ 0xfea16b, 0x166f41d, 0x1677eb1
- disallow_removing_from_next_tracks_reasons: 3 direct xref(s) @ 0xfea1a6, 0x166f472, 0x1677ee6
- disallow_removing_from_context_tracks_reasons: 3 direct xref(s) @ 0xfea1e1, 0x166f4c7, 0x1677f1b
- disallow_updating_context_reasons: 3 direct xref(s) @ 0xfea21c, 0x166f51c, 0x1677f50
- disallow_setting_playback_speed_reasons: 0 direct xref(s)
- disallow_signals: 0 direct xref(s)
- disallow_play_as_next_in_queue_reasons: 0 direct xref(s)
- disallow_sleep_timer_clear_reasons: 0 direct xref(s)
- disallow_sleep_timer_duration_reasons: 0 direct xref(s)
- disallow_sleep_timer_end_of_track_reasons: 0 direct xref(s)
- disallow_add_to_queue_track_reasons: 0 direct xref(s)
- disallow_tap_to_play_track_in_next_tracks_reasons: 0 direct xref(s)
- disallow_reordering_track_in_next_tracks_reasons: 0 direct xref(s)
- disallow_reordering_episode_in_next_tracks_reasons: 0 direct xref(s)
- disallow_reordering_enqueued_track_in_next_tracks_reasons: 0 direct xref(s)
- disallow_reordering_enqueued_episode_in_next_tracks_reasons: 0 direct xref(s)
- disallow_viewing_queue_reasons: 0 direct xref(s)
- disallow_viewing_ordered_tracks_in_next_tracks_reasons: 0 direct xref(s)

## Function 0xe19e74..0xe19ef1

Fields in instruction order:
- 0xe19ecf: disallow_transferring_playback_reasons

### disallow_transferring_playback_reasons @ 0xe19ecf
      e19ea3:	83 3d 0e fb b0 00 06 	cmp    DWORD PTR [rip+0xb0fb0e],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e19eaa:	7c 39                	jl     e19ee5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe6f6b>
      e19eac:	4c 8b 88 78 0b 00 00 	mov    r9,QWORD PTR [rax+0xb78]
      e19eb3:	41 f6 41 20 01       	test   BYTE PTR [r9+0x20],0x1
      e19eb8:	74 0a                	je     e19ec4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe6f4a>
      e19eba:	4d 8b 49 30          	mov    r9,QWORD PTR [r9+0x30]
      e19ebe:	eb 08                	jmp    e19ec8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe6f4e>
      e19ec0:	31 db                	xor    ebx,ebx
      e19ec2:	eb 21                	jmp    e19ee5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe6f6b>
      e19ec4:	49 83 c1 21          	add    r9,0x21
      e19ec8:	48 8d 35 e3 e4 55 ff 	lea    rsi,[rip+0xffffffffff55e4e3]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      e19ecf:	48 8d 0d 8d c7 54 ff 	lea    rcx,[rip+0xffffffffff54c78d]        # 366663 <_ZTSSt12bad_any_cast@@Base-0x29b65>
      e19ed6:	6a 06                	push   0x6
      e19ed8:	5f                   	pop    rdi
      e19ed9:	ba 25 07 00 00       	mov    edx,0x725
      e19ede:	31 c0                	xor    eax,eax
      e19ee0:	e8 ed c9 9b 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      e19ee5:	89 d8                	mov    eax,ebx
      e19ee7:	5b                   	pop    rbx
      e19ee8:	c3                   	ret
      e19ee9:	48 89 c7             	mov    rdi,rax
      e19eec:	e8 b4 fb c5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e19ef1:	cc                   	int3
      e19ef2:	55                   	push   rbp
      e19ef3:	41 57                	push   r15
      e19ef5:	41 56                	push   r14

## Function 0xfe9a77..0xfea5b8

Fields in instruction order:
- 0xfe9d52: disallow_pausing_reasons
- 0xfe9d8a: disallow_resuming_reasons
- 0xfe9dc3: disallow_seeking_reasons
- 0xfe9dfc: disallow_peeking_prev_reasons
- 0xfe9e35: disallow_peeking_next_reasons
- 0xfe9e6e: disallow_skipping_prev_reasons
- 0xfe9ea7: disallow_skipping_next_reasons
- 0xfe9ee2: disallow_toggling_repeat_context_reasons
- 0xfe9f1d: disallow_toggling_repeat_track_reasons
- 0xfe9f58: disallow_toggling_shuffle_reasons
- 0xfe9f93: disallow_set_queue_reasons
- 0xfe9fce: disallow_add_to_queue_reasons
- 0xfea009: disallow_interrupting_playback_reasons
- 0xfea044: disallow_transferring_playback_reasons
- 0xfea07f: disallow_remote_control_reasons
- 0xfea0ba: disallow_inserting_into_next_tracks_reasons
- 0xfea0f5: disallow_inserting_into_context_tracks_reasons
- 0xfea130: disallow_reordering_in_next_tracks_reasons
- 0xfea16b: disallow_reordering_in_context_tracks_reasons
- 0xfea1a6: disallow_removing_from_next_tracks_reasons
- 0xfea1e1: disallow_removing_from_context_tracks_reasons
- 0xfea21c: disallow_updating_context_reasons

### disallow_pausing_reasons @ 0xfe9d52
      fe9d24:	00 
      fe9d25:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
      fe9d2c:	00 
      fe9d2d:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
      fe9d34:	00 00 
      fe9d36:	c7 84 24 68 01 00 00 	mov    DWORD PTR [rsp+0x168],0x3f800000
      fe9d3d:	00 00 80 3f 
      fe9d41:	0f 29 84 24 70 01 00 	movaps XMMWORD PTR [rsp+0x170],xmm0
      fe9d48:	00 
      fe9d49:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
      fe9d50:	00 00 
      fe9d52:	48 8d 35 f3 a5 36 ff 	lea    rsi,[rip+0xffffffffff36a5f3]        # 35434c <_ZTSSt12bad_any_cast@@Base-0x3be7c>
      fe9d59:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9d60:	00 
      fe9d61:	e8 18 fd a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9d66:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9d6d:	00 
      fe9d6e:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9d75:	00 
      fe9d76:	31 d2                	xor    edx,edx
      fe9d78:	e8 6b 0a 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9d7d:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9d84:	00 
      fe9d85:	e8 06 41 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9d8a:	48 8d 35 20 73 37 ff 	lea    rsi,[rip+0xffffffffff377320]        # 3610b1 <_ZTSSt12bad_any_cast@@Base-0x2f117>
      fe9d91:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_resuming_reasons @ 0xfe9d8a
      fe9d60:	00 
      fe9d61:	e8 18 fd a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9d66:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9d6d:	00 
      fe9d6e:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9d75:	00 
      fe9d76:	31 d2                	xor    edx,edx
      fe9d78:	e8 6b 0a 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9d7d:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9d84:	00 
      fe9d85:	e8 06 41 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9d8a:	48 8d 35 20 73 37 ff 	lea    rsi,[rip+0xffffffffff377320]        # 3610b1 <_ZTSSt12bad_any_cast@@Base-0x2f117>
      fe9d91:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9d98:	00 
      fe9d99:	e8 e0 fc a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9d9e:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9da5:	00 
      fe9da6:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9dad:	00 
      fe9dae:	6a 18                	push   0x18
      fe9db0:	5a                   	pop    rdx
      fe9db1:	e8 32 0a 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9db6:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9dbd:	00 
      fe9dbe:	e8 cd 40 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9dc3:	48 8d 35 82 65 34 ff 	lea    rsi,[rip+0xffffffffff346582]        # 33034c <_ZTSSt12bad_any_cast@@Base-0x5fe7c>

### disallow_seeking_reasons @ 0xfe9dc3
      fe9d99:	e8 e0 fc a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9d9e:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9da5:	00 
      fe9da6:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9dad:	00 
      fe9dae:	6a 18                	push   0x18
      fe9db0:	5a                   	pop    rdx
      fe9db1:	e8 32 0a 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9db6:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9dbd:	00 
      fe9dbe:	e8 cd 40 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9dc3:	48 8d 35 82 65 34 ff 	lea    rsi,[rip+0xffffffffff346582]        # 33034c <_ZTSSt12bad_any_cast@@Base-0x5fe7c>
      fe9dca:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9dd1:	00 
      fe9dd2:	e8 a7 fc a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9dd7:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9dde:	00 
      fe9ddf:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9de6:	00 
      fe9de7:	6a 30                	push   0x30
      fe9de9:	5a                   	pop    rdx
      fe9dea:	e8 f9 09 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9def:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9df6:	00 
      fe9df7:	e8 94 40 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9dfc:	48 8d 35 f0 3b 35 ff 	lea    rsi,[rip+0xffffffffff353bf0]        # 33d9f3 <_ZTSSt12bad_any_cast@@Base-0x527d5>

### disallow_peeking_prev_reasons @ 0xfe9dfc
      fe9dd2:	e8 a7 fc a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9dd7:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9dde:	00 
      fe9ddf:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9de6:	00 
      fe9de7:	6a 30                	push   0x30
      fe9de9:	5a                   	pop    rdx
      fe9dea:	e8 f9 09 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9def:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9df6:	00 
      fe9df7:	e8 94 40 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9dfc:	48 8d 35 f0 3b 35 ff 	lea    rsi,[rip+0xffffffffff353bf0]        # 33d9f3 <_ZTSSt12bad_any_cast@@Base-0x527d5>
      fe9e03:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9e0a:	00 
      fe9e0b:	e8 6e fc a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9e10:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9e17:	00 
      fe9e18:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9e1f:	00 
      fe9e20:	6a 48                	push   0x48
      fe9e22:	5a                   	pop    rdx
      fe9e23:	e8 c0 09 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9e28:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9e2f:	00 
      fe9e30:	e8 5b 40 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9e35:	48 8d 35 f9 b2 39 ff 	lea    rsi,[rip+0xffffffffff39b2f9]        # 385135 <_ZTSSt12bad_any_cast@@Base-0xb093>

### disallow_peeking_next_reasons @ 0xfe9e35
      fe9e0b:	e8 6e fc a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9e10:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9e17:	00 
      fe9e18:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9e1f:	00 
      fe9e20:	6a 48                	push   0x48
      fe9e22:	5a                   	pop    rdx
      fe9e23:	e8 c0 09 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9e28:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9e2f:	00 
      fe9e30:	e8 5b 40 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9e35:	48 8d 35 f9 b2 39 ff 	lea    rsi,[rip+0xffffffffff39b2f9]        # 385135 <_ZTSSt12bad_any_cast@@Base-0xb093>
      fe9e3c:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9e43:	00 
      fe9e44:	e8 35 fc a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9e49:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9e50:	00 
      fe9e51:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9e58:	00 
      fe9e59:	6a 60                	push   0x60
      fe9e5b:	5a                   	pop    rdx
      fe9e5c:	e8 87 09 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9e61:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9e68:	00 
      fe9e69:	e8 22 40 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9e6e:	48 8d 35 9c 3b 35 ff 	lea    rsi,[rip+0xffffffffff353b9c]        # 33da11 <_ZTSSt12bad_any_cast@@Base-0x527b7>

### disallow_skipping_prev_reasons @ 0xfe9e6e
      fe9e44:	e8 35 fc a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9e49:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9e50:	00 
      fe9e51:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9e58:	00 
      fe9e59:	6a 60                	push   0x60
      fe9e5b:	5a                   	pop    rdx
      fe9e5c:	e8 87 09 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9e61:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9e68:	00 
      fe9e69:	e8 22 40 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9e6e:	48 8d 35 9c 3b 35 ff 	lea    rsi,[rip+0xffffffffff353b9c]        # 33da11 <_ZTSSt12bad_any_cast@@Base-0x527b7>
      fe9e75:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9e7c:	00 
      fe9e7d:	e8 fc fb a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9e82:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9e89:	00 
      fe9e8a:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9e91:	00 
      fe9e92:	6a 78                	push   0x78
      fe9e94:	5a                   	pop    rdx
      fe9e95:	e8 4e 09 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9e9a:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9ea1:	00 
      fe9ea2:	e8 e9 3f 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9ea7:	48 8d 35 e2 0b 37 ff 	lea    rsi,[rip+0xffffffffff370be2]        # 35aa90 <_ZTSSt12bad_any_cast@@Base-0x35738>

### disallow_skipping_next_reasons @ 0xfe9ea7
      fe9e7d:	e8 fc fb a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9e82:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9e89:	00 
      fe9e8a:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9e91:	00 
      fe9e92:	6a 78                	push   0x78
      fe9e94:	5a                   	pop    rdx
      fe9e95:	e8 4e 09 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9e9a:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9ea1:	00 
      fe9ea2:	e8 e9 3f 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9ea7:	48 8d 35 e2 0b 37 ff 	lea    rsi,[rip+0xffffffffff370be2]        # 35aa90 <_ZTSSt12bad_any_cast@@Base-0x35738>
      fe9eae:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9eb5:	00 
      fe9eb6:	e8 c3 fb a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9ebb:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9ec2:	00 
      fe9ec3:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9eca:	00 
      fe9ecb:	ba 90 00 00 00       	mov    edx,0x90
      fe9ed0:	e8 13 09 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9ed5:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9edc:	00 
      fe9edd:	e8 ae 3f 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9ee2:	48 8d 35 c0 e1 35 ff 	lea    rsi,[rip+0xffffffffff35e1c0]        # 3480a9 <_ZTSSt12bad_any_cast@@Base-0x4811f>
      fe9ee9:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_toggling_repeat_context_reasons @ 0xfe9ee2
      fe9eb5:	00 
      fe9eb6:	e8 c3 fb a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9ebb:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9ec2:	00 
      fe9ec3:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9eca:	00 
      fe9ecb:	ba 90 00 00 00       	mov    edx,0x90
      fe9ed0:	e8 13 09 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9ed5:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9edc:	00 
      fe9edd:	e8 ae 3f 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9ee2:	48 8d 35 c0 e1 35 ff 	lea    rsi,[rip+0xffffffffff35e1c0]        # 3480a9 <_ZTSSt12bad_any_cast@@Base-0x4811f>
      fe9ee9:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9ef0:	00 
      fe9ef1:	e8 88 fb a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9ef6:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9efd:	00 
      fe9efe:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9f05:	00 
      fe9f06:	ba d8 00 00 00       	mov    edx,0xd8
      fe9f0b:	e8 d8 08 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9f10:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9f17:	00 
      fe9f18:	e8 73 3f 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9f1d:	48 8d 35 8c a8 35 ff 	lea    rsi,[rip+0xffffffffff35a88c]        # 3447b0 <_ZTSSt12bad_any_cast@@Base-0x4ba18>
      fe9f24:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_toggling_repeat_track_reasons @ 0xfe9f1d
      fe9ef0:	00 
      fe9ef1:	e8 88 fb a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9ef6:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9efd:	00 
      fe9efe:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9f05:	00 
      fe9f06:	ba d8 00 00 00       	mov    edx,0xd8
      fe9f0b:	e8 d8 08 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9f10:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9f17:	00 
      fe9f18:	e8 73 3f 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9f1d:	48 8d 35 8c a8 35 ff 	lea    rsi,[rip+0xffffffffff35a88c]        # 3447b0 <_ZTSSt12bad_any_cast@@Base-0x4ba18>
      fe9f24:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9f2b:	00 
      fe9f2c:	e8 4d fb a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9f31:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9f38:	00 
      fe9f39:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9f40:	00 
      fe9f41:	ba f0 00 00 00       	mov    edx,0xf0
      fe9f46:	e8 9d 08 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9f4b:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9f52:	00 
      fe9f53:	e8 38 3f 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9f58:	48 8d 35 81 1f 3a ff 	lea    rsi,[rip+0xffffffffff3a1f81]        # 38bee0 <_ZTSSt12bad_any_cast@@Base-0x42e8>
      fe9f5f:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_toggling_shuffle_reasons @ 0xfe9f58
      fe9f2b:	00 
      fe9f2c:	e8 4d fb a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9f31:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9f38:	00 
      fe9f39:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9f40:	00 
      fe9f41:	ba f0 00 00 00       	mov    edx,0xf0
      fe9f46:	e8 9d 08 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9f4b:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9f52:	00 
      fe9f53:	e8 38 3f 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9f58:	48 8d 35 81 1f 3a ff 	lea    rsi,[rip+0xffffffffff3a1f81]        # 38bee0 <_ZTSSt12bad_any_cast@@Base-0x42e8>
      fe9f5f:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9f66:	00 
      fe9f67:	e8 12 fb a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9f6c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9f73:	00 
      fe9f74:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9f7b:	00 
      fe9f7c:	ba 08 01 00 00       	mov    edx,0x108
      fe9f81:	e8 62 08 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9f86:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9f8d:	00 
      fe9f8e:	e8 fd 3e 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9f93:	48 8d 35 8c 18 38 ff 	lea    rsi,[rip+0xffffffffff38188c]        # 36b826 <_ZTSSt12bad_any_cast@@Base-0x249a2>
      fe9f9a:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_set_queue_reasons @ 0xfe9f93
      fe9f66:	00 
      fe9f67:	e8 12 fb a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9f6c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9f73:	00 
      fe9f74:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9f7b:	00 
      fe9f7c:	ba 08 01 00 00       	mov    edx,0x108
      fe9f81:	e8 62 08 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9f86:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9f8d:	00 
      fe9f8e:	e8 fd 3e 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9f93:	48 8d 35 8c 18 38 ff 	lea    rsi,[rip+0xffffffffff38188c]        # 36b826 <_ZTSSt12bad_any_cast@@Base-0x249a2>
      fe9f9a:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9fa1:	00 
      fe9fa2:	e8 d7 fa a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9fa7:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9fae:	00 
      fe9faf:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9fb6:	00 
      fe9fb7:	ba 20 01 00 00       	mov    edx,0x120
      fe9fbc:	e8 27 08 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9fc1:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9fc8:	00 
      fe9fc9:	e8 c2 3e 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9fce:	48 8d 35 f6 70 37 ff 	lea    rsi,[rip+0xffffffffff3770f6]        # 3610cb <_ZTSSt12bad_any_cast@@Base-0x2f0fd>
      fe9fd5:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_add_to_queue_reasons @ 0xfe9fce
      fe9fa1:	00 
      fe9fa2:	e8 d7 fa a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9fa7:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9fae:	00 
      fe9faf:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9fb6:	00 
      fe9fb7:	ba 20 01 00 00       	mov    edx,0x120
      fe9fbc:	e8 27 08 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9fc1:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9fc8:	00 
      fe9fc9:	e8 c2 3e 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fe9fce:	48 8d 35 f6 70 37 ff 	lea    rsi,[rip+0xffffffffff3770f6]        # 3610cb <_ZTSSt12bad_any_cast@@Base-0x2f0fd>
      fe9fd5:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fe9fdc:	00 
      fe9fdd:	e8 9c fa a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9fe2:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9fe9:	00 
      fe9fea:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9ff1:	00 
      fe9ff2:	ba 38 01 00 00       	mov    edx,0x138
      fe9ff7:	e8 ec 07 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9ffc:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea003:	00 
      fea004:	e8 87 3e 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea009:	48 8d 35 d9 12 36 ff 	lea    rsi,[rip+0xffffffffff3612d9]        # 34b2e9 <_ZTSSt12bad_any_cast@@Base-0x44edf>
      fea010:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_interrupting_playback_reasons @ 0xfea009
      fe9fdc:	00 
      fe9fdd:	e8 9c fa a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fe9fe2:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fe9fe9:	00 
      fe9fea:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fe9ff1:	00 
      fe9ff2:	ba 38 01 00 00       	mov    edx,0x138
      fe9ff7:	e8 ec 07 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fe9ffc:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea003:	00 
      fea004:	e8 87 3e 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea009:	48 8d 35 d9 12 36 ff 	lea    rsi,[rip+0xffffffffff3612d9]        # 34b2e9 <_ZTSSt12bad_any_cast@@Base-0x44edf>
      fea010:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea017:	00 
      fea018:	e8 61 fa a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea01d:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea024:	00 
      fea025:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea02c:	00 
      fea02d:	ba 50 01 00 00       	mov    edx,0x150
      fea032:	e8 b1 07 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea037:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea03e:	00 
      fea03f:	e8 4c 3e 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea044:	48 8d 35 87 e0 35 ff 	lea    rsi,[rip+0xffffffffff35e087]        # 3480d2 <_ZTSSt12bad_any_cast@@Base-0x480f6>
      fea04b:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_transferring_playback_reasons @ 0xfea044
      fea017:	00 
      fea018:	e8 61 fa a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea01d:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea024:	00 
      fea025:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea02c:	00 
      fea02d:	ba 50 01 00 00       	mov    edx,0x150
      fea032:	e8 b1 07 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea037:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea03e:	00 
      fea03f:	e8 4c 3e 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea044:	48 8d 35 87 e0 35 ff 	lea    rsi,[rip+0xffffffffff35e087]        # 3480d2 <_ZTSSt12bad_any_cast@@Base-0x480f6>
      fea04b:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea052:	00 
      fea053:	e8 26 fa a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea058:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea05f:	00 
      fea060:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea067:	00 
      fea068:	ba 68 01 00 00       	mov    edx,0x168
      fea06d:	e8 76 07 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea072:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea079:	00 
      fea07a:	e8 11 3e 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea07f:	48 8d 35 9a 2d 34 ff 	lea    rsi,[rip+0xffffffffff342d9a]        # 32ce20 <_ZTSSt12bad_any_cast@@Base-0x633a8>
      fea086:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_remote_control_reasons @ 0xfea07f
      fea052:	00 
      fea053:	e8 26 fa a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea058:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea05f:	00 
      fea060:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea067:	00 
      fea068:	ba 68 01 00 00       	mov    edx,0x168
      fea06d:	e8 76 07 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea072:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea079:	00 
      fea07a:	e8 11 3e 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea07f:	48 8d 35 9a 2d 34 ff 	lea    rsi,[rip+0xffffffffff342d9a]        # 32ce20 <_ZTSSt12bad_any_cast@@Base-0x633a8>
      fea086:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea08d:	00 
      fea08e:	e8 eb f9 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea093:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea09a:	00 
      fea09b:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea0a2:	00 
      fea0a3:	ba 80 01 00 00       	mov    edx,0x180
      fea0a8:	e8 3b 07 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea0ad:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea0b4:	00 
      fea0b5:	e8 d6 3d 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea0ba:	48 8d 35 ff ff 34 ff 	lea    rsi,[rip+0xffffffffff34ffff]        # 33a0c0 <_ZTSSt12bad_any_cast@@Base-0x56108>
      fea0c1:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_inserting_into_next_tracks_reasons @ 0xfea0ba
      fea08d:	00 
      fea08e:	e8 eb f9 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea093:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea09a:	00 
      fea09b:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea0a2:	00 
      fea0a3:	ba 80 01 00 00       	mov    edx,0x180
      fea0a8:	e8 3b 07 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea0ad:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea0b4:	00 
      fea0b5:	e8 d6 3d 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea0ba:	48 8d 35 ff ff 34 ff 	lea    rsi,[rip+0xffffffffff34ffff]        # 33a0c0 <_ZTSSt12bad_any_cast@@Base-0x56108>
      fea0c1:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea0c8:	00 
      fea0c9:	e8 b0 f9 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea0ce:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea0d5:	00 
      fea0d6:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea0dd:	00 
      fea0de:	ba 98 01 00 00       	mov    edx,0x198
      fea0e3:	e8 00 07 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea0e8:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea0ef:	00 
      fea0f0:	e8 9b 3d 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea0f5:	48 8d 35 ad d6 36 ff 	lea    rsi,[rip+0xffffffffff36d6ad]        # 3577a9 <_ZTSSt12bad_any_cast@@Base-0x38a1f>
      fea0fc:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_inserting_into_context_tracks_reasons @ 0xfea0f5
      fea0c8:	00 
      fea0c9:	e8 b0 f9 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea0ce:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea0d5:	00 
      fea0d6:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea0dd:	00 
      fea0de:	ba 98 01 00 00       	mov    edx,0x198
      fea0e3:	e8 00 07 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea0e8:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea0ef:	00 
      fea0f0:	e8 9b 3d 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea0f5:	48 8d 35 ad d6 36 ff 	lea    rsi,[rip+0xffffffffff36d6ad]        # 3577a9 <_ZTSSt12bad_any_cast@@Base-0x38a1f>
      fea0fc:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea103:	00 
      fea104:	e8 75 f9 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea109:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea110:	00 
      fea111:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea118:	00 
      fea119:	ba b0 01 00 00       	mov    edx,0x1b0
      fea11e:	e8 c5 06 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea123:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea12a:	00 
      fea12b:	e8 60 3d 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea130:	48 8d 35 0c cf 34 ff 	lea    rsi,[rip+0xffffffffff34cf0c]        # 337043 <_ZTSSt12bad_any_cast@@Base-0x59185>
      fea137:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_reordering_in_next_tracks_reasons @ 0xfea130
      fea103:	00 
      fea104:	e8 75 f9 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea109:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea110:	00 
      fea111:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea118:	00 
      fea119:	ba b0 01 00 00       	mov    edx,0x1b0
      fea11e:	e8 c5 06 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea123:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea12a:	00 
      fea12b:	e8 60 3d 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea130:	48 8d 35 0c cf 34 ff 	lea    rsi,[rip+0xffffffffff34cf0c]        # 337043 <_ZTSSt12bad_any_cast@@Base-0x59185>
      fea137:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea13e:	00 
      fea13f:	e8 3a f9 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea144:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea14b:	00 
      fea14c:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea153:	00 
      fea154:	ba c8 01 00 00       	mov    edx,0x1c8
      fea159:	e8 8a 06 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea15e:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea165:	00 
      fea166:	e8 25 3d 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea16b:	48 8d 35 90 1d 3a ff 	lea    rsi,[rip+0xffffffffff3a1d90]        # 38bf02 <_ZTSSt12bad_any_cast@@Base-0x42c6>
      fea172:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_reordering_in_context_tracks_reasons @ 0xfea16b
      fea13e:	00 
      fea13f:	e8 3a f9 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea144:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea14b:	00 
      fea14c:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea153:	00 
      fea154:	ba c8 01 00 00       	mov    edx,0x1c8
      fea159:	e8 8a 06 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea15e:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea165:	00 
      fea166:	e8 25 3d 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea16b:	48 8d 35 90 1d 3a ff 	lea    rsi,[rip+0xffffffffff3a1d90]        # 38bf02 <_ZTSSt12bad_any_cast@@Base-0x42c6>
      fea172:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea179:	00 
      fea17a:	e8 ff f8 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea17f:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea186:	00 
      fea187:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea18e:	00 
      fea18f:	ba e0 01 00 00       	mov    edx,0x1e0
      fea194:	e8 4f 06 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea199:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea1a0:	00 
      fea1a1:	e8 ea 3c 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea1a6:	48 8d 35 07 a7 37 ff 	lea    rsi,[rip+0xffffffffff37a707]        # 3648b4 <_ZTSSt12bad_any_cast@@Base-0x2b914>
      fea1ad:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_removing_from_next_tracks_reasons @ 0xfea1a6
      fea179:	00 
      fea17a:	e8 ff f8 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea17f:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea186:	00 
      fea187:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea18e:	00 
      fea18f:	ba e0 01 00 00       	mov    edx,0x1e0
      fea194:	e8 4f 06 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea199:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea1a0:	00 
      fea1a1:	e8 ea 3c 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea1a6:	48 8d 35 07 a7 37 ff 	lea    rsi,[rip+0xffffffffff37a707]        # 3648b4 <_ZTSSt12bad_any_cast@@Base-0x2b914>
      fea1ad:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea1b4:	00 
      fea1b5:	e8 c4 f8 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea1ba:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea1c1:	00 
      fea1c2:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea1c9:	00 
      fea1ca:	ba f8 01 00 00       	mov    edx,0x1f8
      fea1cf:	e8 14 06 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea1d4:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea1db:	00 
      fea1dc:	e8 af 3c 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea1e1:	48 8d 35 c7 08 37 ff 	lea    rsi,[rip+0xffffffffff3708c7]        # 35aaaf <_ZTSSt12bad_any_cast@@Base-0x35719>
      fea1e8:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_removing_from_context_tracks_reasons @ 0xfea1e1
      fea1b4:	00 
      fea1b5:	e8 c4 f8 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea1ba:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea1c1:	00 
      fea1c2:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea1c9:	00 
      fea1ca:	ba f8 01 00 00       	mov    edx,0x1f8
      fea1cf:	e8 14 06 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea1d4:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea1db:	00 
      fea1dc:	e8 af 3c 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea1e1:	48 8d 35 c7 08 37 ff 	lea    rsi,[rip+0xffffffffff3708c7]        # 35aaaf <_ZTSSt12bad_any_cast@@Base-0x35719>
      fea1e8:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea1ef:	00 
      fea1f0:	e8 89 f8 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea1f5:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea1fc:	00 
      fea1fd:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea204:	00 
      fea205:	ba 10 02 00 00       	mov    edx,0x210
      fea20a:	e8 d9 05 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea20f:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea216:	00 
      fea217:	e8 74 3c 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea21c:	48 8d 35 19 18 39 ff 	lea    rsi,[rip+0xffffffffff391819]        # 37ba3c <_ZTSSt12bad_any_cast@@Base-0x1478c>
      fea223:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]

### disallow_updating_context_reasons @ 0xfea21c
      fea1ef:	00 
      fea1f0:	e8 89 f8 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea1f5:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea1fc:	00 
      fea1fd:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea204:	00 
      fea205:	ba 10 02 00 00       	mov    edx,0x210
      fea20a:	e8 d9 05 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea20f:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea216:	00 
      fea217:	e8 74 3c 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea21c:	48 8d 35 19 18 39 ff 	lea    rsi,[rip+0xffffffffff391819]        # 37ba3c <_ZTSSt12bad_any_cast@@Base-0x1478c>
      fea223:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea22a:	00 
      fea22b:	e8 4e f8 a8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      fea230:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      fea237:	00 
      fea238:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      fea23f:	00 
      fea240:	ba 28 02 00 00       	mov    edx,0x228
      fea245:	e8 9e 05 00 00       	call   fea7e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1bfe>
      fea24a:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      fea251:	00 
      fea252:	e8 39 3c 80 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fea257:	6a 70                	push   0x70
      fea259:	5f                   	pop    rdi

## Function 0x14bc4aa..0x14bda9d

Fields in instruction order:
- 0x14bcb09: disallow_set_queue_reasons
- 0x14bcc83: disallow_add_to_queue_reasons

### disallow_set_queue_reasons @ 0x14bcb09
     14bcad7:	48 8d bc 24 b0 09 00 	lea    rdi,[rsp+0x9b0]
     14bcade:	00 
     14bcadf:	e8 ac 13 33 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14bcae4:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
     14bcaeb:	00 
     14bcaec:	e8 9f 13 33 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14bcaf1:	48 8d 05 06 ee 1a 00 	lea    rax,[rip+0x1aee06]        # 166b8fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa6a>
     14bcaf8:	48 89 84 24 60 09 00 	mov    QWORD PTR [rsp+0x960],rax
     14bcaff:	00 
     14bcb00:	48 83 a4 24 68 09 00 	and    QWORD PTR [rsp+0x968],0x0
     14bcb07:	00 00 
     14bcb09:	48 8d 35 16 ed ea fe 	lea    rsi,[rip+0xfffffffffeeaed16]        # 36b826 <_ZTSSt12bad_any_cast@@Base-0x249a2>
     14bcb10:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
     14bcb17:	00 
     14bcb18:	e8 61 cf 5b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14bcb1d:	48 8d 35 71 ae e8 fe 	lea    rsi,[rip+0xfffffffffee8ae71]        # 347995 <_ZTSSt12bad_any_cast@@Base-0x48833>
     14bcb24:	48 8d bc 24 b0 09 00 	lea    rdi,[rsp+0x9b0]
     14bcb2b:	00 
     14bcb2c:	e8 4d cf 5b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14bcb31:	48 8d b4 24 60 09 00 	lea    rsi,[rsp+0x960]
     14bcb38:	00 
     14bcb39:	48 8d 94 24 f0 04 00 	lea    rdx,[rsp+0x4f0]
     14bcb40:	00 
     14bcb41:	48 89 df             	mov    rdi,rbx
     14bcb44:	e8 c1 4c 00 00       	call   14c180a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d8e>
     14bcb49:	48 8d bc 24 b0 09 00 	lea    rdi,[rsp+0x9b0]

### disallow_add_to_queue_reasons @ 0x14bcc83
     14bcc54:	e8 37 12 33 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14bcc59:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     14bcc5d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14bcc60:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14bcc63:	84 c0                	test   al,al
     14bcc65:	0f 85 9e 05 00 00    	jne    14bd209 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30278d>
     14bcc6b:	48 8d 05 9c ec 1a 00 	lea    rax,[rip+0x1aec9c]        # 166b90e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa7a>
     14bcc72:	48 89 84 24 60 09 00 	mov    QWORD PTR [rsp+0x960],rax
     14bcc79:	00 
     14bcc7a:	48 83 a4 24 68 09 00 	and    QWORD PTR [rsp+0x968],0x0
     14bcc81:	00 00 
     14bcc83:	48 8d 35 41 44 ea fe 	lea    rsi,[rip+0xfffffffffeea4441]        # 3610cb <_ZTSSt12bad_any_cast@@Base-0x2f0fd>
     14bcc8a:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
     14bcc91:	00 
     14bcc92:	e8 e7 cd 5b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14bcc97:	48 8d 35 72 eb ec fe 	lea    rsi,[rip+0xfffffffffeeceb72]        # 38b810 <_ZTSSt12bad_any_cast@@Base-0x49b8>
     14bcc9e:	48 8d bc 24 b0 09 00 	lea    rdi,[rsp+0x9b0]
     14bcca5:	00 
     14bcca6:	e8 d3 cd 5b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14bccab:	48 8d b4 24 60 09 00 	lea    rsi,[rsp+0x960]
     14bccb2:	00 
     14bccb3:	48 8d 94 24 f0 04 00 	lea    rdx,[rsp+0x4f0]
     14bccba:	00 
     14bccbb:	48 89 df             	mov    rdi,rbx
     14bccbe:	e8 47 4b 00 00       	call   14c180a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x306d8e>
     14bccc3:	48 8d bc 24 b0 09 00 	lea    rdi,[rsp+0x9b0]

## Function 0x166eaaa..0x166f5b3

Fields in instruction order:
- 0x166ee23: disallow_interrupting_playback_reasons
- 0x166ee78: disallow_pausing_reasons
- 0x166eecd: disallow_peeking_next_reasons
- 0x166ef22: disallow_peeking_prev_reasons
- 0x166ef77: disallow_remote_control_reasons
- 0x166efcc: disallow_resuming_reasons
- 0x166f021: disallow_seeking_reasons
- 0x166f076: disallow_skipping_next_reasons
- 0x166f0cb: disallow_skipping_prev_reasons
- 0x166f120: disallow_toggling_repeat_context_reasons
- 0x166f175: disallow_toggling_repeat_track_reasons
- 0x166f1ca: disallow_toggling_shuffle_reasons
- 0x166f21f: disallow_set_queue_reasons
- 0x166f274: disallow_add_to_queue_reasons
- 0x166f2c9: disallow_transferring_playback_reasons
- 0x166f31e: disallow_inserting_into_next_tracks_reasons
- 0x166f373: disallow_inserting_into_context_tracks_reasons
- 0x166f3c8: disallow_reordering_in_next_tracks_reasons
- 0x166f41d: disallow_reordering_in_context_tracks_reasons
- 0x166f472: disallow_removing_from_next_tracks_reasons
- 0x166f4c7: disallow_removing_from_context_tracks_reasons
- 0x166f51c: disallow_updating_context_reasons

### disallow_interrupting_playback_reasons @ 0x166ee23
     166edf7:	48 83 c4 10          	add    rsp,0x10
     166edfb:	5b                   	pop    rbx
     166edfc:	41 5e                	pop    r14
     166edfe:	41 5f                	pop    r15
     166ee00:	e9 d5 e7 7b ff       	jmp    e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     166ee05:	4c 8d 3d 44 3f 38 00 	lea    r15,[rip+0x383f44]        # 19f2d50 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe0f>
     166ee0c:	4c 89 ff             	mov    rdi,r15
     166ee0f:	e8 5c f3 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166ee14:	85 c0                	test   eax,eax
     166ee16:	0f 84 c9 fc ff ff    	je     166eae5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c51>
     166ee1c:	48 8d 3d 05 3f 38 00 	lea    rdi,[rip+0x383f05]        # 19f2d28 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xde7>
     166ee23:	48 8d 35 bf c4 cd fe 	lea    rsi,[rip+0xfffffffffecdc4bf]        # 34b2e9 <_ZTSSt12bad_any_cast@@Base-0x44edf>
     166ee2a:	e8 a5 8c ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166ee2f:	48 8d 3d aa 1a 45 ff 	lea    rdi,[rip+0xffffffffff451aaa]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166ee36:	48 8d 35 eb 3e 38 00 	lea    rsi,[rip+0x383eeb]        # 19f2d28 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xde7>
     166ee3d:	48 8d 15 bc 51 18 00 	lea    rdx,[rip+0x1851bc]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166ee44:	e8 17 f0 17 00       	call   17ede60 <__cxa_atexit@plt>
     166ee49:	48 8d 3d 00 3f 38 00 	lea    rdi,[rip+0x383f00]        # 19f2d50 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe0f>
     166ee50:	e8 2b f3 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166ee55:	e9 8b fc ff ff       	jmp    166eae5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c51>
     166ee5a:	4c 8d 3d 1f 3f 38 00 	lea    r15,[rip+0x383f1f]        # 19f2d80 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe3f>
     166ee61:	4c 89 ff             	mov    rdi,r15
     166ee64:	e8 07 f3 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166ee69:	85 c0                	test   eax,eax
     166ee6b:	0f 84 82 fc ff ff    	je     166eaf3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c5f>
     166ee71:	48 8d 3d e0 3e 38 00 	lea    rdi,[rip+0x383ee0]        # 19f2d58 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe17>

### disallow_pausing_reasons @ 0x166ee78
     166ee3d:	48 8d 15 bc 51 18 00 	lea    rdx,[rip+0x1851bc]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166ee44:	e8 17 f0 17 00       	call   17ede60 <__cxa_atexit@plt>
     166ee49:	48 8d 3d 00 3f 38 00 	lea    rdi,[rip+0x383f00]        # 19f2d50 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe0f>
     166ee50:	e8 2b f3 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166ee55:	e9 8b fc ff ff       	jmp    166eae5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c51>
     166ee5a:	4c 8d 3d 1f 3f 38 00 	lea    r15,[rip+0x383f1f]        # 19f2d80 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe3f>
     166ee61:	4c 89 ff             	mov    rdi,r15
     166ee64:	e8 07 f3 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166ee69:	85 c0                	test   eax,eax
     166ee6b:	0f 84 82 fc ff ff    	je     166eaf3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c5f>
     166ee71:	48 8d 3d e0 3e 38 00 	lea    rdi,[rip+0x383ee0]        # 19f2d58 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe17>
     166ee78:	48 8d 35 cd 54 ce fe 	lea    rsi,[rip+0xfffffffffece54cd]        # 35434c <_ZTSSt12bad_any_cast@@Base-0x3be7c>
     166ee7f:	e8 50 8c ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166ee84:	48 8d 3d 55 1a 45 ff 	lea    rdi,[rip+0xffffffffff451a55]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166ee8b:	48 8d 35 c6 3e 38 00 	lea    rsi,[rip+0x383ec6]        # 19f2d58 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe17>
     166ee92:	48 8d 15 67 51 18 00 	lea    rdx,[rip+0x185167]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166ee99:	e8 c2 ef 17 00       	call   17ede60 <__cxa_atexit@plt>
     166ee9e:	48 8d 3d db 3e 38 00 	lea    rdi,[rip+0x383edb]        # 19f2d80 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe3f>
     166eea5:	e8 d6 f2 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166eeaa:	e9 44 fc ff ff       	jmp    166eaf3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c5f>
     166eeaf:	4c 8d 3d fa 3e 38 00 	lea    r15,[rip+0x383efa]        # 19f2db0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe6f>
     166eeb6:	4c 89 ff             	mov    rdi,r15
     166eeb9:	e8 b2 f2 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166eebe:	85 c0                	test   eax,eax
     166eec0:	0f 84 3b fc ff ff    	je     166eb01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c6d>
     166eec6:	48 8d 3d bb 3e 38 00 	lea    rdi,[rip+0x383ebb]        # 19f2d88 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe47>

### disallow_peeking_next_reasons @ 0x166eecd
     166ee92:	48 8d 15 67 51 18 00 	lea    rdx,[rip+0x185167]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166ee99:	e8 c2 ef 17 00       	call   17ede60 <__cxa_atexit@plt>
     166ee9e:	48 8d 3d db 3e 38 00 	lea    rdi,[rip+0x383edb]        # 19f2d80 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe3f>
     166eea5:	e8 d6 f2 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166eeaa:	e9 44 fc ff ff       	jmp    166eaf3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c5f>
     166eeaf:	4c 8d 3d fa 3e 38 00 	lea    r15,[rip+0x383efa]        # 19f2db0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe6f>
     166eeb6:	4c 89 ff             	mov    rdi,r15
     166eeb9:	e8 b2 f2 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166eebe:	85 c0                	test   eax,eax
     166eec0:	0f 84 3b fc ff ff    	je     166eb01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c6d>
     166eec6:	48 8d 3d bb 3e 38 00 	lea    rdi,[rip+0x383ebb]        # 19f2d88 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe47>
     166eecd:	48 8d 35 61 62 d1 fe 	lea    rsi,[rip+0xfffffffffed16261]        # 385135 <_ZTSSt12bad_any_cast@@Base-0xb093>
     166eed4:	e8 fb 8b ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166eed9:	48 8d 3d 00 1a 45 ff 	lea    rdi,[rip+0xffffffffff451a00]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166eee0:	48 8d 35 a1 3e 38 00 	lea    rsi,[rip+0x383ea1]        # 19f2d88 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe47>
     166eee7:	48 8d 15 12 51 18 00 	lea    rdx,[rip+0x185112]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166eeee:	e8 6d ef 17 00       	call   17ede60 <__cxa_atexit@plt>
     166eef3:	48 8d 3d b6 3e 38 00 	lea    rdi,[rip+0x383eb6]        # 19f2db0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe6f>
     166eefa:	e8 81 f2 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166eeff:	e9 fd fb ff ff       	jmp    166eb01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c6d>
     166ef04:	4c 8d 3d d5 3e 38 00 	lea    r15,[rip+0x383ed5]        # 19f2de0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe9f>
     166ef0b:	4c 89 ff             	mov    rdi,r15
     166ef0e:	e8 5d f2 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166ef13:	85 c0                	test   eax,eax
     166ef15:	0f 84 f4 fb ff ff    	je     166eb0f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c7b>
     166ef1b:	48 8d 3d 96 3e 38 00 	lea    rdi,[rip+0x383e96]        # 19f2db8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe77>

### disallow_peeking_prev_reasons @ 0x166ef22
     166eee7:	48 8d 15 12 51 18 00 	lea    rdx,[rip+0x185112]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166eeee:	e8 6d ef 17 00       	call   17ede60 <__cxa_atexit@plt>
     166eef3:	48 8d 3d b6 3e 38 00 	lea    rdi,[rip+0x383eb6]        # 19f2db0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe6f>
     166eefa:	e8 81 f2 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166eeff:	e9 fd fb ff ff       	jmp    166eb01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c6d>
     166ef04:	4c 8d 3d d5 3e 38 00 	lea    r15,[rip+0x383ed5]        # 19f2de0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe9f>
     166ef0b:	4c 89 ff             	mov    rdi,r15
     166ef0e:	e8 5d f2 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166ef13:	85 c0                	test   eax,eax
     166ef15:	0f 84 f4 fb ff ff    	je     166eb0f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c7b>
     166ef1b:	48 8d 3d 96 3e 38 00 	lea    rdi,[rip+0x383e96]        # 19f2db8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe77>
     166ef22:	48 8d 35 ca ea cc fe 	lea    rsi,[rip+0xfffffffffecceaca]        # 33d9f3 <_ZTSSt12bad_any_cast@@Base-0x527d5>
     166ef29:	e8 a6 8b ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166ef2e:	48 8d 3d ab 19 45 ff 	lea    rdi,[rip+0xffffffffff4519ab]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166ef35:	48 8d 35 7c 3e 38 00 	lea    rsi,[rip+0x383e7c]        # 19f2db8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe77>
     166ef3c:	48 8d 15 bd 50 18 00 	lea    rdx,[rip+0x1850bd]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166ef43:	e8 18 ef 17 00       	call   17ede60 <__cxa_atexit@plt>
     166ef48:	48 8d 3d 91 3e 38 00 	lea    rdi,[rip+0x383e91]        # 19f2de0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe9f>
     166ef4f:	e8 2c f2 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166ef54:	e9 b6 fb ff ff       	jmp    166eb0f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c7b>
     166ef59:	4c 8d 3d b0 3e 38 00 	lea    r15,[rip+0x383eb0]        # 19f2e10 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xecf>
     166ef60:	4c 89 ff             	mov    rdi,r15
     166ef63:	e8 08 f2 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166ef68:	85 c0                	test   eax,eax
     166ef6a:	0f 84 ad fb ff ff    	je     166eb1d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c89>
     166ef70:	48 8d 3d 71 3e 38 00 	lea    rdi,[rip+0x383e71]        # 19f2de8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xea7>

### disallow_remote_control_reasons @ 0x166ef77
     166ef3c:	48 8d 15 bd 50 18 00 	lea    rdx,[rip+0x1850bd]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166ef43:	e8 18 ef 17 00       	call   17ede60 <__cxa_atexit@plt>
     166ef48:	48 8d 3d 91 3e 38 00 	lea    rdi,[rip+0x383e91]        # 19f2de0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xe9f>
     166ef4f:	e8 2c f2 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166ef54:	e9 b6 fb ff ff       	jmp    166eb0f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c7b>
     166ef59:	4c 8d 3d b0 3e 38 00 	lea    r15,[rip+0x383eb0]        # 19f2e10 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xecf>
     166ef60:	4c 89 ff             	mov    rdi,r15
     166ef63:	e8 08 f2 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166ef68:	85 c0                	test   eax,eax
     166ef6a:	0f 84 ad fb ff ff    	je     166eb1d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c89>
     166ef70:	48 8d 3d 71 3e 38 00 	lea    rdi,[rip+0x383e71]        # 19f2de8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xea7>
     166ef77:	48 8d 35 a2 de cb fe 	lea    rsi,[rip+0xfffffffffecbdea2]        # 32ce20 <_ZTSSt12bad_any_cast@@Base-0x633a8>
     166ef7e:	e8 51 8b ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166ef83:	48 8d 3d 56 19 45 ff 	lea    rdi,[rip+0xffffffffff451956]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166ef8a:	48 8d 35 57 3e 38 00 	lea    rsi,[rip+0x383e57]        # 19f2de8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xea7>
     166ef91:	48 8d 15 68 50 18 00 	lea    rdx,[rip+0x185068]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166ef98:	e8 c3 ee 17 00       	call   17ede60 <__cxa_atexit@plt>
     166ef9d:	48 8d 3d 6c 3e 38 00 	lea    rdi,[rip+0x383e6c]        # 19f2e10 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xecf>
     166efa4:	e8 d7 f1 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166efa9:	e9 6f fb ff ff       	jmp    166eb1d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c89>
     166efae:	4c 8d 3d 8b 3e 38 00 	lea    r15,[rip+0x383e8b]        # 19f2e40 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xeff>
     166efb5:	4c 89 ff             	mov    rdi,r15
     166efb8:	e8 b3 f1 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166efbd:	85 c0                	test   eax,eax
     166efbf:	0f 84 66 fb ff ff    	je     166eb2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c97>
     166efc5:	48 8d 3d 4c 3e 38 00 	lea    rdi,[rip+0x383e4c]        # 19f2e18 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xed7>

### disallow_resuming_reasons @ 0x166efcc
     166ef91:	48 8d 15 68 50 18 00 	lea    rdx,[rip+0x185068]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166ef98:	e8 c3 ee 17 00       	call   17ede60 <__cxa_atexit@plt>
     166ef9d:	48 8d 3d 6c 3e 38 00 	lea    rdi,[rip+0x383e6c]        # 19f2e10 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xecf>
     166efa4:	e8 d7 f1 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166efa9:	e9 6f fb ff ff       	jmp    166eb1d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c89>
     166efae:	4c 8d 3d 8b 3e 38 00 	lea    r15,[rip+0x383e8b]        # 19f2e40 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xeff>
     166efb5:	4c 89 ff             	mov    rdi,r15
     166efb8:	e8 b3 f1 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166efbd:	85 c0                	test   eax,eax
     166efbf:	0f 84 66 fb ff ff    	je     166eb2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c97>
     166efc5:	48 8d 3d 4c 3e 38 00 	lea    rdi,[rip+0x383e4c]        # 19f2e18 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xed7>
     166efcc:	48 8d 35 de 20 cf fe 	lea    rsi,[rip+0xfffffffffecf20de]        # 3610b1 <_ZTSSt12bad_any_cast@@Base-0x2f117>
     166efd3:	e8 fc 8a ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166efd8:	48 8d 3d 01 19 45 ff 	lea    rdi,[rip+0xffffffffff451901]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166efdf:	48 8d 35 32 3e 38 00 	lea    rsi,[rip+0x383e32]        # 19f2e18 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xed7>
     166efe6:	48 8d 15 13 50 18 00 	lea    rdx,[rip+0x185013]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166efed:	e8 6e ee 17 00       	call   17ede60 <__cxa_atexit@plt>
     166eff2:	48 8d 3d 47 3e 38 00 	lea    rdi,[rip+0x383e47]        # 19f2e40 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xeff>
     166eff9:	e8 82 f1 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166effe:	e9 28 fb ff ff       	jmp    166eb2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c97>
     166f003:	4c 8d 3d 66 3e 38 00 	lea    r15,[rip+0x383e66]        # 19f2e70 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf2f>
     166f00a:	4c 89 ff             	mov    rdi,r15
     166f00d:	e8 5e f1 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f012:	85 c0                	test   eax,eax
     166f014:	0f 84 1f fb ff ff    	je     166eb39 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ca5>
     166f01a:	48 8d 3d 27 3e 38 00 	lea    rdi,[rip+0x383e27]        # 19f2e48 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf07>

### disallow_seeking_reasons @ 0x166f021
     166efe6:	48 8d 15 13 50 18 00 	lea    rdx,[rip+0x185013]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166efed:	e8 6e ee 17 00       	call   17ede60 <__cxa_atexit@plt>
     166eff2:	48 8d 3d 47 3e 38 00 	lea    rdi,[rip+0x383e47]        # 19f2e40 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xeff>
     166eff9:	e8 82 f1 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166effe:	e9 28 fb ff ff       	jmp    166eb2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22c97>
     166f003:	4c 8d 3d 66 3e 38 00 	lea    r15,[rip+0x383e66]        # 19f2e70 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf2f>
     166f00a:	4c 89 ff             	mov    rdi,r15
     166f00d:	e8 5e f1 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f012:	85 c0                	test   eax,eax
     166f014:	0f 84 1f fb ff ff    	je     166eb39 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ca5>
     166f01a:	48 8d 3d 27 3e 38 00 	lea    rdi,[rip+0x383e27]        # 19f2e48 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf07>
     166f021:	48 8d 35 24 13 cc fe 	lea    rsi,[rip+0xfffffffffecc1324]        # 33034c <_ZTSSt12bad_any_cast@@Base-0x5fe7c>
     166f028:	e8 a7 8a ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f02d:	48 8d 3d ac 18 45 ff 	lea    rdi,[rip+0xffffffffff4518ac]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f034:	48 8d 35 0d 3e 38 00 	lea    rsi,[rip+0x383e0d]        # 19f2e48 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf07>
     166f03b:	48 8d 15 be 4f 18 00 	lea    rdx,[rip+0x184fbe]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f042:	e8 19 ee 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f047:	48 8d 3d 22 3e 38 00 	lea    rdi,[rip+0x383e22]        # 19f2e70 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf2f>
     166f04e:	e8 2d f1 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f053:	e9 e1 fa ff ff       	jmp    166eb39 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ca5>
     166f058:	4c 8d 3d 41 3e 38 00 	lea    r15,[rip+0x383e41]        # 19f2ea0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf5f>
     166f05f:	4c 89 ff             	mov    rdi,r15
     166f062:	e8 09 f1 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f067:	85 c0                	test   eax,eax
     166f069:	0f 84 d8 fa ff ff    	je     166eb47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cb3>
     166f06f:	48 8d 3d 02 3e 38 00 	lea    rdi,[rip+0x383e02]        # 19f2e78 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf37>

### disallow_skipping_next_reasons @ 0x166f076
     166f03b:	48 8d 15 be 4f 18 00 	lea    rdx,[rip+0x184fbe]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f042:	e8 19 ee 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f047:	48 8d 3d 22 3e 38 00 	lea    rdi,[rip+0x383e22]        # 19f2e70 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf2f>
     166f04e:	e8 2d f1 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f053:	e9 e1 fa ff ff       	jmp    166eb39 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ca5>
     166f058:	4c 8d 3d 41 3e 38 00 	lea    r15,[rip+0x383e41]        # 19f2ea0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf5f>
     166f05f:	4c 89 ff             	mov    rdi,r15
     166f062:	e8 09 f1 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f067:	85 c0                	test   eax,eax
     166f069:	0f 84 d8 fa ff ff    	je     166eb47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cb3>
     166f06f:	48 8d 3d 02 3e 38 00 	lea    rdi,[rip+0x383e02]        # 19f2e78 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf37>
     166f076:	48 8d 35 13 ba ce fe 	lea    rsi,[rip+0xfffffffffeceba13]        # 35aa90 <_ZTSSt12bad_any_cast@@Base-0x35738>
     166f07d:	e8 52 8a ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f082:	48 8d 3d 57 18 45 ff 	lea    rdi,[rip+0xffffffffff451857]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f089:	48 8d 35 e8 3d 38 00 	lea    rsi,[rip+0x383de8]        # 19f2e78 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf37>
     166f090:	48 8d 15 69 4f 18 00 	lea    rdx,[rip+0x184f69]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f097:	e8 c4 ed 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f09c:	48 8d 3d fd 3d 38 00 	lea    rdi,[rip+0x383dfd]        # 19f2ea0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf5f>
     166f0a3:	e8 d8 f0 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f0a8:	e9 9a fa ff ff       	jmp    166eb47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cb3>
     166f0ad:	4c 8d 3d 1c 3e 38 00 	lea    r15,[rip+0x383e1c]        # 19f2ed0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf8f>
     166f0b4:	4c 89 ff             	mov    rdi,r15
     166f0b7:	e8 b4 f0 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f0bc:	85 c0                	test   eax,eax
     166f0be:	0f 84 91 fa ff ff    	je     166eb55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cc1>
     166f0c4:	48 8d 3d dd 3d 38 00 	lea    rdi,[rip+0x383ddd]        # 19f2ea8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf67>

### disallow_skipping_prev_reasons @ 0x166f0cb
     166f090:	48 8d 15 69 4f 18 00 	lea    rdx,[rip+0x184f69]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f097:	e8 c4 ed 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f09c:	48 8d 3d fd 3d 38 00 	lea    rdi,[rip+0x383dfd]        # 19f2ea0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf5f>
     166f0a3:	e8 d8 f0 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f0a8:	e9 9a fa ff ff       	jmp    166eb47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cb3>
     166f0ad:	4c 8d 3d 1c 3e 38 00 	lea    r15,[rip+0x383e1c]        # 19f2ed0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf8f>
     166f0b4:	4c 89 ff             	mov    rdi,r15
     166f0b7:	e8 b4 f0 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f0bc:	85 c0                	test   eax,eax
     166f0be:	0f 84 91 fa ff ff    	je     166eb55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cc1>
     166f0c4:	48 8d 3d dd 3d 38 00 	lea    rdi,[rip+0x383ddd]        # 19f2ea8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf67>
     166f0cb:	48 8d 35 3f e9 cc fe 	lea    rsi,[rip+0xfffffffffecce93f]        # 33da11 <_ZTSSt12bad_any_cast@@Base-0x527b7>
     166f0d2:	e8 fd 89 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f0d7:	48 8d 3d 02 18 45 ff 	lea    rdi,[rip+0xffffffffff451802]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f0de:	48 8d 35 c3 3d 38 00 	lea    rsi,[rip+0x383dc3]        # 19f2ea8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf67>
     166f0e5:	48 8d 15 14 4f 18 00 	lea    rdx,[rip+0x184f14]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f0ec:	e8 6f ed 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f0f1:	48 8d 3d d8 3d 38 00 	lea    rdi,[rip+0x383dd8]        # 19f2ed0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf8f>
     166f0f8:	e8 83 f0 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f0fd:	e9 53 fa ff ff       	jmp    166eb55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cc1>
     166f102:	4c 8d 3d f7 3d 38 00 	lea    r15,[rip+0x383df7]        # 19f2f00 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xfbf>
     166f109:	4c 89 ff             	mov    rdi,r15
     166f10c:	e8 5f f0 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f111:	85 c0                	test   eax,eax
     166f113:	0f 84 4a fa ff ff    	je     166eb63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ccf>
     166f119:	48 8d 3d b8 3d 38 00 	lea    rdi,[rip+0x383db8]        # 19f2ed8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf97>

### disallow_toggling_repeat_context_reasons @ 0x166f120
     166f0e5:	48 8d 15 14 4f 18 00 	lea    rdx,[rip+0x184f14]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f0ec:	e8 6f ed 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f0f1:	48 8d 3d d8 3d 38 00 	lea    rdi,[rip+0x383dd8]        # 19f2ed0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf8f>
     166f0f8:	e8 83 f0 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f0fd:	e9 53 fa ff ff       	jmp    166eb55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cc1>
     166f102:	4c 8d 3d f7 3d 38 00 	lea    r15,[rip+0x383df7]        # 19f2f00 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xfbf>
     166f109:	4c 89 ff             	mov    rdi,r15
     166f10c:	e8 5f f0 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f111:	85 c0                	test   eax,eax
     166f113:	0f 84 4a fa ff ff    	je     166eb63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ccf>
     166f119:	48 8d 3d b8 3d 38 00 	lea    rdi,[rip+0x383db8]        # 19f2ed8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf97>
     166f120:	48 8d 35 82 8f cd fe 	lea    rsi,[rip+0xfffffffffecd8f82]        # 3480a9 <_ZTSSt12bad_any_cast@@Base-0x4811f>
     166f127:	e8 a8 89 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f12c:	48 8d 3d ad 17 45 ff 	lea    rdi,[rip+0xffffffffff4517ad]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f133:	48 8d 35 9e 3d 38 00 	lea    rsi,[rip+0x383d9e]        # 19f2ed8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xf97>
     166f13a:	48 8d 15 bf 4e 18 00 	lea    rdx,[rip+0x184ebf]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f141:	e8 1a ed 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f146:	48 8d 3d b3 3d 38 00 	lea    rdi,[rip+0x383db3]        # 19f2f00 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xfbf>
     166f14d:	e8 2e f0 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f152:	e9 0c fa ff ff       	jmp    166eb63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ccf>
     166f157:	4c 8d 3d d2 3d 38 00 	lea    r15,[rip+0x383dd2]        # 19f2f30 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xfef>
     166f15e:	4c 89 ff             	mov    rdi,r15
     166f161:	e8 0a f0 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f166:	85 c0                	test   eax,eax
     166f168:	0f 84 03 fa ff ff    	je     166eb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cdd>
     166f16e:	48 8d 3d 93 3d 38 00 	lea    rdi,[rip+0x383d93]        # 19f2f08 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xfc7>

### disallow_toggling_repeat_track_reasons @ 0x166f175
     166f13a:	48 8d 15 bf 4e 18 00 	lea    rdx,[rip+0x184ebf]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f141:	e8 1a ed 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f146:	48 8d 3d b3 3d 38 00 	lea    rdi,[rip+0x383db3]        # 19f2f00 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xfbf>
     166f14d:	e8 2e f0 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f152:	e9 0c fa ff ff       	jmp    166eb63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ccf>
     166f157:	4c 8d 3d d2 3d 38 00 	lea    r15,[rip+0x383dd2]        # 19f2f30 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xfef>
     166f15e:	4c 89 ff             	mov    rdi,r15
     166f161:	e8 0a f0 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f166:	85 c0                	test   eax,eax
     166f168:	0f 84 03 fa ff ff    	je     166eb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cdd>
     166f16e:	48 8d 3d 93 3d 38 00 	lea    rdi,[rip+0x383d93]        # 19f2f08 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xfc7>
     166f175:	48 8d 35 34 56 cd fe 	lea    rsi,[rip+0xfffffffffecd5634]        # 3447b0 <_ZTSSt12bad_any_cast@@Base-0x4ba18>
     166f17c:	e8 53 89 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f181:	48 8d 3d 58 17 45 ff 	lea    rdi,[rip+0xffffffffff451758]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f188:	48 8d 35 79 3d 38 00 	lea    rsi,[rip+0x383d79]        # 19f2f08 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xfc7>
     166f18f:	48 8d 15 6a 4e 18 00 	lea    rdx,[rip+0x184e6a]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f196:	e8 c5 ec 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f19b:	48 8d 3d 8e 3d 38 00 	lea    rdi,[rip+0x383d8e]        # 19f2f30 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xfef>
     166f1a2:	e8 d9 ef 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f1a7:	e9 c5 f9 ff ff       	jmp    166eb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cdd>
     166f1ac:	4c 8d 3d ad 3d 38 00 	lea    r15,[rip+0x383dad]        # 19f2f60 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x101f>
     166f1b3:	4c 89 ff             	mov    rdi,r15
     166f1b6:	e8 b5 ef 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f1bb:	85 c0                	test   eax,eax
     166f1bd:	0f 84 bc f9 ff ff    	je     166eb7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ceb>
     166f1c3:	48 8d 3d 6e 3d 38 00 	lea    rdi,[rip+0x383d6e]        # 19f2f38 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xff7>

### disallow_toggling_shuffle_reasons @ 0x166f1ca
     166f18f:	48 8d 15 6a 4e 18 00 	lea    rdx,[rip+0x184e6a]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f196:	e8 c5 ec 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f19b:	48 8d 3d 8e 3d 38 00 	lea    rdi,[rip+0x383d8e]        # 19f2f30 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xfef>
     166f1a2:	e8 d9 ef 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f1a7:	e9 c5 f9 ff ff       	jmp    166eb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cdd>
     166f1ac:	4c 8d 3d ad 3d 38 00 	lea    r15,[rip+0x383dad]        # 19f2f60 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x101f>
     166f1b3:	4c 89 ff             	mov    rdi,r15
     166f1b6:	e8 b5 ef 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f1bb:	85 c0                	test   eax,eax
     166f1bd:	0f 84 bc f9 ff ff    	je     166eb7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ceb>
     166f1c3:	48 8d 3d 6e 3d 38 00 	lea    rdi,[rip+0x383d6e]        # 19f2f38 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xff7>
     166f1ca:	48 8d 35 0f cd d1 fe 	lea    rsi,[rip+0xfffffffffed1cd0f]        # 38bee0 <_ZTSSt12bad_any_cast@@Base-0x42e8>
     166f1d1:	e8 fe 88 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f1d6:	48 8d 3d 03 17 45 ff 	lea    rdi,[rip+0xffffffffff451703]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f1dd:	48 8d 35 54 3d 38 00 	lea    rsi,[rip+0x383d54]        # 19f2f38 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xff7>
     166f1e4:	48 8d 15 15 4e 18 00 	lea    rdx,[rip+0x184e15]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f1eb:	e8 70 ec 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f1f0:	48 8d 3d 69 3d 38 00 	lea    rdi,[rip+0x383d69]        # 19f2f60 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x101f>
     166f1f7:	e8 84 ef 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f1fc:	e9 7e f9 ff ff       	jmp    166eb7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ceb>
     166f201:	4c 8d 3d 88 3d 38 00 	lea    r15,[rip+0x383d88]        # 19f2f90 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x104f>
     166f208:	4c 89 ff             	mov    rdi,r15
     166f20b:	e8 60 ef 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f210:	85 c0                	test   eax,eax
     166f212:	0f 84 75 f9 ff ff    	je     166eb8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cf9>
     166f218:	48 8d 3d 49 3d 38 00 	lea    rdi,[rip+0x383d49]        # 19f2f68 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1027>

### disallow_set_queue_reasons @ 0x166f21f
     166f1e4:	48 8d 15 15 4e 18 00 	lea    rdx,[rip+0x184e15]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f1eb:	e8 70 ec 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f1f0:	48 8d 3d 69 3d 38 00 	lea    rdi,[rip+0x383d69]        # 19f2f60 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x101f>
     166f1f7:	e8 84 ef 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f1fc:	e9 7e f9 ff ff       	jmp    166eb7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ceb>
     166f201:	4c 8d 3d 88 3d 38 00 	lea    r15,[rip+0x383d88]        # 19f2f90 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x104f>
     166f208:	4c 89 ff             	mov    rdi,r15
     166f20b:	e8 60 ef 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f210:	85 c0                	test   eax,eax
     166f212:	0f 84 75 f9 ff ff    	je     166eb8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cf9>
     166f218:	48 8d 3d 49 3d 38 00 	lea    rdi,[rip+0x383d49]        # 19f2f68 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1027>
     166f21f:	48 8d 35 00 c6 cf fe 	lea    rsi,[rip+0xfffffffffecfc600]        # 36b826 <_ZTSSt12bad_any_cast@@Base-0x249a2>
     166f226:	e8 a9 88 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f22b:	48 8d 3d ae 16 45 ff 	lea    rdi,[rip+0xffffffffff4516ae]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f232:	48 8d 35 2f 3d 38 00 	lea    rsi,[rip+0x383d2f]        # 19f2f68 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1027>
     166f239:	48 8d 15 c0 4d 18 00 	lea    rdx,[rip+0x184dc0]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f240:	e8 1b ec 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f245:	48 8d 3d 44 3d 38 00 	lea    rdi,[rip+0x383d44]        # 19f2f90 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x104f>
     166f24c:	e8 2f ef 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f251:	e9 37 f9 ff ff       	jmp    166eb8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cf9>
     166f256:	4c 8d 3d 63 3d 38 00 	lea    r15,[rip+0x383d63]        # 19f2fc0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x107f>
     166f25d:	4c 89 ff             	mov    rdi,r15
     166f260:	e8 0b ef 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f265:	85 c0                	test   eax,eax
     166f267:	0f 84 2e f9 ff ff    	je     166eb9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d07>
     166f26d:	48 8d 3d 24 3d 38 00 	lea    rdi,[rip+0x383d24]        # 19f2f98 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1057>

### disallow_add_to_queue_reasons @ 0x166f274
     166f239:	48 8d 15 c0 4d 18 00 	lea    rdx,[rip+0x184dc0]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f240:	e8 1b ec 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f245:	48 8d 3d 44 3d 38 00 	lea    rdi,[rip+0x383d44]        # 19f2f90 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x104f>
     166f24c:	e8 2f ef 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f251:	e9 37 f9 ff ff       	jmp    166eb8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22cf9>
     166f256:	4c 8d 3d 63 3d 38 00 	lea    r15,[rip+0x383d63]        # 19f2fc0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x107f>
     166f25d:	4c 89 ff             	mov    rdi,r15
     166f260:	e8 0b ef 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f265:	85 c0                	test   eax,eax
     166f267:	0f 84 2e f9 ff ff    	je     166eb9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d07>
     166f26d:	48 8d 3d 24 3d 38 00 	lea    rdi,[rip+0x383d24]        # 19f2f98 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1057>
     166f274:	48 8d 35 50 1e cf fe 	lea    rsi,[rip+0xfffffffffecf1e50]        # 3610cb <_ZTSSt12bad_any_cast@@Base-0x2f0fd>
     166f27b:	e8 54 88 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f280:	48 8d 3d 59 16 45 ff 	lea    rdi,[rip+0xffffffffff451659]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f287:	48 8d 35 0a 3d 38 00 	lea    rsi,[rip+0x383d0a]        # 19f2f98 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1057>
     166f28e:	48 8d 15 6b 4d 18 00 	lea    rdx,[rip+0x184d6b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f295:	e8 c6 eb 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f29a:	48 8d 3d 1f 3d 38 00 	lea    rdi,[rip+0x383d1f]        # 19f2fc0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x107f>
     166f2a1:	e8 da ee 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f2a6:	e9 f0 f8 ff ff       	jmp    166eb9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d07>
     166f2ab:	4c 8d 3d 3e 3d 38 00 	lea    r15,[rip+0x383d3e]        # 19f2ff0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10af>
     166f2b2:	4c 89 ff             	mov    rdi,r15
     166f2b5:	e8 b6 ee 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f2ba:	85 c0                	test   eax,eax
     166f2bc:	0f 84 e7 f8 ff ff    	je     166eba9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d15>
     166f2c2:	48 8d 3d ff 3c 38 00 	lea    rdi,[rip+0x383cff]        # 19f2fc8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1087>

### disallow_transferring_playback_reasons @ 0x166f2c9
     166f28e:	48 8d 15 6b 4d 18 00 	lea    rdx,[rip+0x184d6b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f295:	e8 c6 eb 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f29a:	48 8d 3d 1f 3d 38 00 	lea    rdi,[rip+0x383d1f]        # 19f2fc0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x107f>
     166f2a1:	e8 da ee 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f2a6:	e9 f0 f8 ff ff       	jmp    166eb9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d07>
     166f2ab:	4c 8d 3d 3e 3d 38 00 	lea    r15,[rip+0x383d3e]        # 19f2ff0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10af>
     166f2b2:	4c 89 ff             	mov    rdi,r15
     166f2b5:	e8 b6 ee 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f2ba:	85 c0                	test   eax,eax
     166f2bc:	0f 84 e7 f8 ff ff    	je     166eba9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d15>
     166f2c2:	48 8d 3d ff 3c 38 00 	lea    rdi,[rip+0x383cff]        # 19f2fc8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1087>
     166f2c9:	48 8d 35 02 8e cd fe 	lea    rsi,[rip+0xfffffffffecd8e02]        # 3480d2 <_ZTSSt12bad_any_cast@@Base-0x480f6>
     166f2d0:	e8 ff 87 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f2d5:	48 8d 3d 04 16 45 ff 	lea    rdi,[rip+0xffffffffff451604]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f2dc:	48 8d 35 e5 3c 38 00 	lea    rsi,[rip+0x383ce5]        # 19f2fc8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1087>
     166f2e3:	48 8d 15 16 4d 18 00 	lea    rdx,[rip+0x184d16]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f2ea:	e8 71 eb 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f2ef:	48 8d 3d fa 3c 38 00 	lea    rdi,[rip+0x383cfa]        # 19f2ff0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10af>
     166f2f6:	e8 85 ee 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f2fb:	e9 a9 f8 ff ff       	jmp    166eba9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d15>
     166f300:	4c 8d 3d 19 3d 38 00 	lea    r15,[rip+0x383d19]        # 19f3020 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10df>
     166f307:	4c 89 ff             	mov    rdi,r15
     166f30a:	e8 61 ee 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f30f:	85 c0                	test   eax,eax
     166f311:	0f 84 a0 f8 ff ff    	je     166ebb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d23>
     166f317:	48 8d 3d da 3c 38 00 	lea    rdi,[rip+0x383cda]        # 19f2ff8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10b7>

### disallow_inserting_into_next_tracks_reasons @ 0x166f31e
     166f2e3:	48 8d 15 16 4d 18 00 	lea    rdx,[rip+0x184d16]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f2ea:	e8 71 eb 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f2ef:	48 8d 3d fa 3c 38 00 	lea    rdi,[rip+0x383cfa]        # 19f2ff0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10af>
     166f2f6:	e8 85 ee 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f2fb:	e9 a9 f8 ff ff       	jmp    166eba9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d15>
     166f300:	4c 8d 3d 19 3d 38 00 	lea    r15,[rip+0x383d19]        # 19f3020 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10df>
     166f307:	4c 89 ff             	mov    rdi,r15
     166f30a:	e8 61 ee 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f30f:	85 c0                	test   eax,eax
     166f311:	0f 84 a0 f8 ff ff    	je     166ebb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d23>
     166f317:	48 8d 3d da 3c 38 00 	lea    rdi,[rip+0x383cda]        # 19f2ff8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10b7>
     166f31e:	48 8d 35 9b ad cc fe 	lea    rsi,[rip+0xfffffffffeccad9b]        # 33a0c0 <_ZTSSt12bad_any_cast@@Base-0x56108>
     166f325:	e8 aa 87 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f32a:	48 8d 3d af 15 45 ff 	lea    rdi,[rip+0xffffffffff4515af]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f331:	48 8d 35 c0 3c 38 00 	lea    rsi,[rip+0x383cc0]        # 19f2ff8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10b7>
     166f338:	48 8d 15 c1 4c 18 00 	lea    rdx,[rip+0x184cc1]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f33f:	e8 1c eb 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f344:	48 8d 3d d5 3c 38 00 	lea    rdi,[rip+0x383cd5]        # 19f3020 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10df>
     166f34b:	e8 30 ee 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f350:	e9 62 f8 ff ff       	jmp    166ebb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d23>
     166f355:	4c 8d 3d f4 3c 38 00 	lea    r15,[rip+0x383cf4]        # 19f3050 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x110f>
     166f35c:	4c 89 ff             	mov    rdi,r15
     166f35f:	e8 0c ee 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f364:	85 c0                	test   eax,eax
     166f366:	0f 84 59 f8 ff ff    	je     166ebc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d31>
     166f36c:	48 8d 3d b5 3c 38 00 	lea    rdi,[rip+0x383cb5]        # 19f3028 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10e7>

### disallow_inserting_into_context_tracks_reasons @ 0x166f373
     166f338:	48 8d 15 c1 4c 18 00 	lea    rdx,[rip+0x184cc1]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f33f:	e8 1c eb 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f344:	48 8d 3d d5 3c 38 00 	lea    rdi,[rip+0x383cd5]        # 19f3020 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10df>
     166f34b:	e8 30 ee 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f350:	e9 62 f8 ff ff       	jmp    166ebb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d23>
     166f355:	4c 8d 3d f4 3c 38 00 	lea    r15,[rip+0x383cf4]        # 19f3050 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x110f>
     166f35c:	4c 89 ff             	mov    rdi,r15
     166f35f:	e8 0c ee 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f364:	85 c0                	test   eax,eax
     166f366:	0f 84 59 f8 ff ff    	je     166ebc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d31>
     166f36c:	48 8d 3d b5 3c 38 00 	lea    rdi,[rip+0x383cb5]        # 19f3028 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10e7>
     166f373:	48 8d 35 2f 84 ce fe 	lea    rsi,[rip+0xfffffffffece842f]        # 3577a9 <_ZTSSt12bad_any_cast@@Base-0x38a1f>
     166f37a:	e8 55 87 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f37f:	48 8d 3d 5a 15 45 ff 	lea    rdi,[rip+0xffffffffff45155a]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f386:	48 8d 35 9b 3c 38 00 	lea    rsi,[rip+0x383c9b]        # 19f3028 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x10e7>
     166f38d:	48 8d 15 6c 4c 18 00 	lea    rdx,[rip+0x184c6c]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f394:	e8 c7 ea 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f399:	48 8d 3d b0 3c 38 00 	lea    rdi,[rip+0x383cb0]        # 19f3050 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x110f>
     166f3a0:	e8 db ed 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f3a5:	e9 1b f8 ff ff       	jmp    166ebc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d31>
     166f3aa:	4c 8d 3d cf 3c 38 00 	lea    r15,[rip+0x383ccf]        # 19f3080 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x113f>
     166f3b1:	4c 89 ff             	mov    rdi,r15
     166f3b4:	e8 b7 ed 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f3b9:	85 c0                	test   eax,eax
     166f3bb:	0f 84 12 f8 ff ff    	je     166ebd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d3f>
     166f3c1:	48 8d 3d 90 3c 38 00 	lea    rdi,[rip+0x383c90]        # 19f3058 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1117>

### disallow_reordering_in_next_tracks_reasons @ 0x166f3c8
     166f38d:	48 8d 15 6c 4c 18 00 	lea    rdx,[rip+0x184c6c]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f394:	e8 c7 ea 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f399:	48 8d 3d b0 3c 38 00 	lea    rdi,[rip+0x383cb0]        # 19f3050 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x110f>
     166f3a0:	e8 db ed 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f3a5:	e9 1b f8 ff ff       	jmp    166ebc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d31>
     166f3aa:	4c 8d 3d cf 3c 38 00 	lea    r15,[rip+0x383ccf]        # 19f3080 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x113f>
     166f3b1:	4c 89 ff             	mov    rdi,r15
     166f3b4:	e8 b7 ed 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f3b9:	85 c0                	test   eax,eax
     166f3bb:	0f 84 12 f8 ff ff    	je     166ebd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d3f>
     166f3c1:	48 8d 3d 90 3c 38 00 	lea    rdi,[rip+0x383c90]        # 19f3058 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1117>
     166f3c8:	48 8d 35 74 7c cc fe 	lea    rsi,[rip+0xfffffffffecc7c74]        # 337043 <_ZTSSt12bad_any_cast@@Base-0x59185>
     166f3cf:	e8 00 87 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f3d4:	48 8d 3d 05 15 45 ff 	lea    rdi,[rip+0xffffffffff451505]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f3db:	48 8d 35 76 3c 38 00 	lea    rsi,[rip+0x383c76]        # 19f3058 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1117>
     166f3e2:	48 8d 15 17 4c 18 00 	lea    rdx,[rip+0x184c17]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f3e9:	e8 72 ea 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f3ee:	48 8d 3d 8b 3c 38 00 	lea    rdi,[rip+0x383c8b]        # 19f3080 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x113f>
     166f3f5:	e8 86 ed 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f3fa:	e9 d4 f7 ff ff       	jmp    166ebd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d3f>
     166f3ff:	4c 8d 3d aa 3c 38 00 	lea    r15,[rip+0x383caa]        # 19f30b0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x116f>
     166f406:	4c 89 ff             	mov    rdi,r15
     166f409:	e8 62 ed 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f40e:	85 c0                	test   eax,eax
     166f410:	0f 84 cb f7 ff ff    	je     166ebe1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d4d>
     166f416:	48 8d 3d 6b 3c 38 00 	lea    rdi,[rip+0x383c6b]        # 19f3088 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1147>

### disallow_reordering_in_context_tracks_reasons @ 0x166f41d
     166f3e2:	48 8d 15 17 4c 18 00 	lea    rdx,[rip+0x184c17]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f3e9:	e8 72 ea 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f3ee:	48 8d 3d 8b 3c 38 00 	lea    rdi,[rip+0x383c8b]        # 19f3080 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x113f>
     166f3f5:	e8 86 ed 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f3fa:	e9 d4 f7 ff ff       	jmp    166ebd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d3f>
     166f3ff:	4c 8d 3d aa 3c 38 00 	lea    r15,[rip+0x383caa]        # 19f30b0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x116f>
     166f406:	4c 89 ff             	mov    rdi,r15
     166f409:	e8 62 ed 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f40e:	85 c0                	test   eax,eax
     166f410:	0f 84 cb f7 ff ff    	je     166ebe1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d4d>
     166f416:	48 8d 3d 6b 3c 38 00 	lea    rdi,[rip+0x383c6b]        # 19f3088 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1147>
     166f41d:	48 8d 35 de ca d1 fe 	lea    rsi,[rip+0xfffffffffed1cade]        # 38bf02 <_ZTSSt12bad_any_cast@@Base-0x42c6>
     166f424:	e8 ab 86 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f429:	48 8d 3d b0 14 45 ff 	lea    rdi,[rip+0xffffffffff4514b0]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f430:	48 8d 35 51 3c 38 00 	lea    rsi,[rip+0x383c51]        # 19f3088 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1147>
     166f437:	48 8d 15 c2 4b 18 00 	lea    rdx,[rip+0x184bc2]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f43e:	e8 1d ea 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f443:	48 8d 3d 66 3c 38 00 	lea    rdi,[rip+0x383c66]        # 19f30b0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x116f>
     166f44a:	e8 31 ed 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f44f:	e9 8d f7 ff ff       	jmp    166ebe1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d4d>
     166f454:	4c 8d 3d 85 3c 38 00 	lea    r15,[rip+0x383c85]        # 19f30e0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x119f>
     166f45b:	4c 89 ff             	mov    rdi,r15
     166f45e:	e8 0d ed 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f463:	85 c0                	test   eax,eax
     166f465:	0f 84 84 f7 ff ff    	je     166ebef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d5b>
     166f46b:	48 8d 3d 46 3c 38 00 	lea    rdi,[rip+0x383c46]        # 19f30b8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1177>

### disallow_removing_from_next_tracks_reasons @ 0x166f472
     166f437:	48 8d 15 c2 4b 18 00 	lea    rdx,[rip+0x184bc2]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f43e:	e8 1d ea 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f443:	48 8d 3d 66 3c 38 00 	lea    rdi,[rip+0x383c66]        # 19f30b0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x116f>
     166f44a:	e8 31 ed 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f44f:	e9 8d f7 ff ff       	jmp    166ebe1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d4d>
     166f454:	4c 8d 3d 85 3c 38 00 	lea    r15,[rip+0x383c85]        # 19f30e0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x119f>
     166f45b:	4c 89 ff             	mov    rdi,r15
     166f45e:	e8 0d ed 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f463:	85 c0                	test   eax,eax
     166f465:	0f 84 84 f7 ff ff    	je     166ebef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d5b>
     166f46b:	48 8d 3d 46 3c 38 00 	lea    rdi,[rip+0x383c46]        # 19f30b8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1177>
     166f472:	48 8d 35 3b 54 cf fe 	lea    rsi,[rip+0xfffffffffecf543b]        # 3648b4 <_ZTSSt12bad_any_cast@@Base-0x2b914>
     166f479:	e8 56 86 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f47e:	48 8d 3d 5b 14 45 ff 	lea    rdi,[rip+0xffffffffff45145b]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f485:	48 8d 35 2c 3c 38 00 	lea    rsi,[rip+0x383c2c]        # 19f30b8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x1177>
     166f48c:	48 8d 15 6d 4b 18 00 	lea    rdx,[rip+0x184b6d]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f493:	e8 c8 e9 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f498:	48 8d 3d 41 3c 38 00 	lea    rdi,[rip+0x383c41]        # 19f30e0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x119f>
     166f49f:	e8 dc ec 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f4a4:	e9 46 f7 ff ff       	jmp    166ebef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d5b>
     166f4a9:	4c 8d 3d 60 3c 38 00 	lea    r15,[rip+0x383c60]        # 19f3110 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11cf>
     166f4b0:	4c 89 ff             	mov    rdi,r15
     166f4b3:	e8 b8 ec 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f4b8:	85 c0                	test   eax,eax
     166f4ba:	0f 84 3d f7 ff ff    	je     166ebfd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d69>
     166f4c0:	48 8d 3d 21 3c 38 00 	lea    rdi,[rip+0x383c21]        # 19f30e8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11a7>

### disallow_removing_from_context_tracks_reasons @ 0x166f4c7
     166f48c:	48 8d 15 6d 4b 18 00 	lea    rdx,[rip+0x184b6d]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f493:	e8 c8 e9 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f498:	48 8d 3d 41 3c 38 00 	lea    rdi,[rip+0x383c41]        # 19f30e0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x119f>
     166f49f:	e8 dc ec 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f4a4:	e9 46 f7 ff ff       	jmp    166ebef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d5b>
     166f4a9:	4c 8d 3d 60 3c 38 00 	lea    r15,[rip+0x383c60]        # 19f3110 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11cf>
     166f4b0:	4c 89 ff             	mov    rdi,r15
     166f4b3:	e8 b8 ec 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f4b8:	85 c0                	test   eax,eax
     166f4ba:	0f 84 3d f7 ff ff    	je     166ebfd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d69>
     166f4c0:	48 8d 3d 21 3c 38 00 	lea    rdi,[rip+0x383c21]        # 19f30e8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11a7>
     166f4c7:	48 8d 35 e1 b5 ce fe 	lea    rsi,[rip+0xfffffffffeceb5e1]        # 35aaaf <_ZTSSt12bad_any_cast@@Base-0x35719>
     166f4ce:	e8 01 86 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f4d3:	48 8d 3d 06 14 45 ff 	lea    rdi,[rip+0xffffffffff451406]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f4da:	48 8d 35 07 3c 38 00 	lea    rsi,[rip+0x383c07]        # 19f30e8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11a7>
     166f4e1:	48 8d 15 18 4b 18 00 	lea    rdx,[rip+0x184b18]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f4e8:	e8 73 e9 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f4ed:	48 8d 3d 1c 3c 38 00 	lea    rdi,[rip+0x383c1c]        # 19f3110 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11cf>
     166f4f4:	e8 87 ec 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f4f9:	e9 ff f6 ff ff       	jmp    166ebfd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d69>
     166f4fe:	4c 8d 3d 3b 3c 38 00 	lea    r15,[rip+0x383c3b]        # 19f3140 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11ff>
     166f505:	4c 89 ff             	mov    rdi,r15
     166f508:	e8 63 ec 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f50d:	85 c0                	test   eax,eax
     166f50f:	0f 84 f6 f6 ff ff    	je     166ec0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d77>
     166f515:	48 8d 3d fc 3b 38 00 	lea    rdi,[rip+0x383bfc]        # 19f3118 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11d7>

### disallow_updating_context_reasons @ 0x166f51c
     166f4e1:	48 8d 15 18 4b 18 00 	lea    rdx,[rip+0x184b18]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f4e8:	e8 73 e9 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f4ed:	48 8d 3d 1c 3c 38 00 	lea    rdi,[rip+0x383c1c]        # 19f3110 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11cf>
     166f4f4:	e8 87 ec 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f4f9:	e9 ff f6 ff ff       	jmp    166ebfd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d69>
     166f4fe:	4c 8d 3d 3b 3c 38 00 	lea    r15,[rip+0x383c3b]        # 19f3140 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11ff>
     166f505:	4c 89 ff             	mov    rdi,r15
     166f508:	e8 63 ec 17 00       	call   17ee170 <__cxa_guard_acquire@plt>
     166f50d:	85 c0                	test   eax,eax
     166f50f:	0f 84 f6 f6 ff ff    	je     166ec0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d77>
     166f515:	48 8d 3d fc 3b 38 00 	lea    rdi,[rip+0x383bfc]        # 19f3118 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11d7>
     166f51c:	48 8d 35 19 c5 d0 fe 	lea    rsi,[rip+0xfffffffffed0c519]        # 37ba3c <_ZTSSt12bad_any_cast@@Base-0x1478c>
     166f523:	e8 ac 85 ac ff       	call   1137ad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2feeea>
     166f528:	48 8d 3d b1 13 45 ff 	lea    rdi,[rip+0xffffffffff4513b1]        # ac08e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd880>
     166f52f:	48 8d 35 e2 3b 38 00 	lea    rsi,[rip+0x383be2]        # 19f3118 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11d7>
     166f536:	48 8d 15 c3 4a 18 00 	lea    rdx,[rip+0x184ac3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
     166f53d:	e8 1e e9 17 00       	call   17ede60 <__cxa_atexit@plt>
     166f542:	48 8d 3d f7 3b 38 00 	lea    rdi,[rip+0x383bf7]        # 19f3140 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x11ff>
     166f549:	e8 32 ec 17 00       	call   17ee180 <__cxa_guard_release@plt>
     166f54e:	e9 b8 f6 ff ff       	jmp    166ec0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d77>
     166f553:	eb 28                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
     166f555:	eb 26                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
     166f557:	eb 24                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
     166f559:	eb 22                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
     166f55b:	eb 20                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>
     166f55d:	eb 1e                	jmp    166f57d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236e9>

## Function 0x16778df..0x1678098

Fields in instruction order:
- 0x1677af1: disallow_pausing_reasons
- 0x1677b31: disallow_resuming_reasons
- 0x1677b67: disallow_seeking_reasons
- 0x1677b99: disallow_peeking_prev_reasons
- 0x1677bcb: disallow_peeking_next_reasons
- 0x1677c00: disallow_skipping_prev_reasons
- 0x1677c35: disallow_skipping_next_reasons
- 0x1677c6a: disallow_toggling_repeat_context_reasons
- 0x1677c9f: disallow_toggling_repeat_track_reasons
- 0x1677cd4: disallow_toggling_shuffle_reasons
- 0x1677d09: disallow_set_queue_reasons
- 0x1677d3e: disallow_add_to_queue_reasons
- 0x1677d73: disallow_interrupting_playback_reasons
- 0x1677da8: disallow_transferring_playback_reasons
- 0x1677ddd: disallow_remote_control_reasons
- 0x1677e12: disallow_inserting_into_next_tracks_reasons
- 0x1677e47: disallow_inserting_into_context_tracks_reasons
- 0x1677e7c: disallow_reordering_in_next_tracks_reasons
- 0x1677eb1: disallow_reordering_in_context_tracks_reasons
- 0x1677ee6: disallow_removing_from_next_tracks_reasons
- 0x1677f1b: disallow_removing_from_context_tracks_reasons
- 0x1677f50: disallow_updating_context_reasons

### disallow_pausing_reasons @ 0x1677af1
     1677ac4:	e8 c9 ce 14 00       	call   17c4992 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178afe>
     1677ac9:	4c 8d b4 24 d0 03 00 	lea    r14,[rsp+0x3d0]
     1677ad0:	00 
     1677ad1:	4c 89 f7             	mov    rdi,r14
     1677ad4:	48 89 c6             	mov    rsi,rax
     1677ad7:	e8 b8 ac 79 ff       	call   e12794 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdf81a>
     1677adc:	41 8a 1e             	mov    bl,BYTE PTR [r14]
     1677adf:	84 db                	test   bl,bl
     1677ae1:	0f 84 ba 04 00 00    	je     1677fa1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c10d>
     1677ae7:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1677aec:	e8 4d 98 05 00       	call   16d133e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x854aa>
     1677af1:	48 8d 35 54 c8 cd fe 	lea    rsi,[rip+0xfffffffffecdc854]        # 35434c <_ZTSSt12bad_any_cast@@Base-0x3be7c>
     1677af8:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677afd:	e8 7c 1f 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677b02:	80 fb 07             	cmp    bl,0x7
     1677b05:	4c 8d 3d 44 a1 dd fe 	lea    r15,[rip+0xfffffffffedda144]        # 451c50 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1785c>
     1677b0c:	4d 0f 44 fe          	cmove  r15,r14
     1677b10:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677b14:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677b18:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677b1d:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
     1677b22:	e8 59 f8 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677b27:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677b2c:	e8 5f 63 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677b31:	48 8d 35 79 95 ce fe 	lea    rsi,[rip+0xfffffffffece9579]        # 3610b1 <_ZTSSt12bad_any_cast@@Base-0x2f117>
     1677b38:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]

### disallow_resuming_reasons @ 0x1677b31
     1677afd:	e8 7c 1f 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677b02:	80 fb 07             	cmp    bl,0x7
     1677b05:	4c 8d 3d 44 a1 dd fe 	lea    r15,[rip+0xfffffffffedda144]        # 451c50 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1785c>
     1677b0c:	4d 0f 44 fe          	cmove  r15,r14
     1677b10:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677b14:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677b18:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677b1d:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
     1677b22:	e8 59 f8 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677b27:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677b2c:	e8 5f 63 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677b31:	48 8d 35 79 95 ce fe 	lea    rsi,[rip+0xfffffffffece9579]        # 3610b1 <_ZTSSt12bad_any_cast@@Base-0x2f117>
     1677b38:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677b3d:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
     1677b41:	e8 38 1f 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677b46:	48 8d 4c 24 38       	lea    rcx,[rsp+0x38]
     1677b4b:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677b4f:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677b53:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677b58:	e8 23 f8 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677b5d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677b62:	e8 29 63 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677b67:	48 8d 35 de 87 cb fe 	lea    rsi,[rip+0xfffffffffecb87de]        # 33034c <_ZTSSt12bad_any_cast@@Base-0x5fe7c>
     1677b6e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677b73:	e8 06 1f 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677b78:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]

### disallow_seeking_reasons @ 0x1677b67
     1677b31:	48 8d 35 79 95 ce fe 	lea    rsi,[rip+0xfffffffffece9579]        # 3610b1 <_ZTSSt12bad_any_cast@@Base-0x2f117>
     1677b38:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677b3d:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
     1677b41:	e8 38 1f 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677b46:	48 8d 4c 24 38       	lea    rcx,[rsp+0x38]
     1677b4b:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677b4f:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677b53:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677b58:	e8 23 f8 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677b5d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677b62:	e8 29 63 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677b67:	48 8d 35 de 87 cb fe 	lea    rsi,[rip+0xfffffffffecb87de]        # 33034c <_ZTSSt12bad_any_cast@@Base-0x5fe7c>
     1677b6e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677b73:	e8 06 1f 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677b78:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
     1677b7d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677b81:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677b85:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677b8a:	e8 f1 f7 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677b8f:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677b94:	e8 f7 62 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677b99:	48 8d 35 53 5e cc fe 	lea    rsi,[rip+0xfffffffffecc5e53]        # 33d9f3 <_ZTSSt12bad_any_cast@@Base-0x527d5>
     1677ba0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ba5:	e8 d4 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677baa:	48 8d 4c 24 68       	lea    rcx,[rsp+0x68]
     1677baf:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]

### disallow_peeking_prev_reasons @ 0x1677b99
     1677b62:	e8 29 63 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677b67:	48 8d 35 de 87 cb fe 	lea    rsi,[rip+0xfffffffffecb87de]        # 33034c <_ZTSSt12bad_any_cast@@Base-0x5fe7c>
     1677b6e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677b73:	e8 06 1f 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677b78:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
     1677b7d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677b81:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677b85:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677b8a:	e8 f1 f7 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677b8f:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677b94:	e8 f7 62 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677b99:	48 8d 35 53 5e cc fe 	lea    rsi,[rip+0xfffffffffecc5e53]        # 33d9f3 <_ZTSSt12bad_any_cast@@Base-0x527d5>
     1677ba0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ba5:	e8 d4 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677baa:	48 8d 4c 24 68       	lea    rcx,[rsp+0x68]
     1677baf:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677bb3:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677bb7:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677bbc:	e8 bf f7 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677bc1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677bc6:	e8 c5 62 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677bcb:	48 8d 35 63 d5 d0 fe 	lea    rsi,[rip+0xfffffffffed0d563]        # 385135 <_ZTSSt12bad_any_cast@@Base-0xb093>
     1677bd2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677bd7:	e8 a2 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677bdc:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
     1677be3:	00 

### disallow_peeking_next_reasons @ 0x1677bcb
     1677b94:	e8 f7 62 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677b99:	48 8d 35 53 5e cc fe 	lea    rsi,[rip+0xfffffffffecc5e53]        # 33d9f3 <_ZTSSt12bad_any_cast@@Base-0x527d5>
     1677ba0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ba5:	e8 d4 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677baa:	48 8d 4c 24 68       	lea    rcx,[rsp+0x68]
     1677baf:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677bb3:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677bb7:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677bbc:	e8 bf f7 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677bc1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677bc6:	e8 c5 62 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677bcb:	48 8d 35 63 d5 d0 fe 	lea    rsi,[rip+0xfffffffffed0d563]        # 385135 <_ZTSSt12bad_any_cast@@Base-0xb093>
     1677bd2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677bd7:	e8 a2 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677bdc:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
     1677be3:	00 
     1677be4:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677be8:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677bec:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677bf1:	e8 8a f7 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677bf6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677bfb:	e8 90 62 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677c00:	48 8d 35 0a 5e cc fe 	lea    rsi,[rip+0xfffffffffecc5e0a]        # 33da11 <_ZTSSt12bad_any_cast@@Base-0x527b7>
     1677c07:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c0c:	e8 6d 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677c11:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]

### disallow_skipping_prev_reasons @ 0x1677c00
     1677bcb:	48 8d 35 63 d5 d0 fe 	lea    rsi,[rip+0xfffffffffed0d563]        # 385135 <_ZTSSt12bad_any_cast@@Base-0xb093>
     1677bd2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677bd7:	e8 a2 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677bdc:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
     1677be3:	00 
     1677be4:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677be8:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677bec:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677bf1:	e8 8a f7 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677bf6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677bfb:	e8 90 62 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677c00:	48 8d 35 0a 5e cc fe 	lea    rsi,[rip+0xfffffffffecc5e0a]        # 33da11 <_ZTSSt12bad_any_cast@@Base-0x527b7>
     1677c07:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c0c:	e8 6d 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677c11:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
     1677c18:	00 
     1677c19:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677c1d:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677c21:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677c26:	e8 55 f7 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677c2b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c30:	e8 5b 62 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677c35:	48 8d 35 54 2e ce fe 	lea    rsi,[rip+0xfffffffffece2e54]        # 35aa90 <_ZTSSt12bad_any_cast@@Base-0x35738>
     1677c3c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c41:	e8 38 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677c46:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]

### disallow_skipping_next_reasons @ 0x1677c35
     1677c00:	48 8d 35 0a 5e cc fe 	lea    rsi,[rip+0xfffffffffecc5e0a]        # 33da11 <_ZTSSt12bad_any_cast@@Base-0x527b7>
     1677c07:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c0c:	e8 6d 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677c11:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
     1677c18:	00 
     1677c19:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677c1d:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677c21:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677c26:	e8 55 f7 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677c2b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c30:	e8 5b 62 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677c35:	48 8d 35 54 2e ce fe 	lea    rsi,[rip+0xfffffffffece2e54]        # 35aa90 <_ZTSSt12bad_any_cast@@Base-0x35738>
     1677c3c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c41:	e8 38 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677c46:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]
     1677c4d:	00 
     1677c4e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677c52:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677c56:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677c5b:	e8 20 f7 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677c60:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c65:	e8 26 62 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677c6a:	48 8d 35 38 04 cd fe 	lea    rsi,[rip+0xfffffffffecd0438]        # 3480a9 <_ZTSSt12bad_any_cast@@Base-0x4811f>
     1677c71:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c76:	e8 03 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677c7b:	48 8d 8c 24 f8 00 00 	lea    rcx,[rsp+0xf8]

### disallow_toggling_repeat_context_reasons @ 0x1677c6a
     1677c35:	48 8d 35 54 2e ce fe 	lea    rsi,[rip+0xfffffffffece2e54]        # 35aa90 <_ZTSSt12bad_any_cast@@Base-0x35738>
     1677c3c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c41:	e8 38 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677c46:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]
     1677c4d:	00 
     1677c4e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677c52:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677c56:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677c5b:	e8 20 f7 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677c60:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c65:	e8 26 62 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677c6a:	48 8d 35 38 04 cd fe 	lea    rsi,[rip+0xfffffffffecd0438]        # 3480a9 <_ZTSSt12bad_any_cast@@Base-0x4811f>
     1677c71:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c76:	e8 03 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677c7b:	48 8d 8c 24 f8 00 00 	lea    rcx,[rsp+0xf8]
     1677c82:	00 
     1677c83:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677c87:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677c8b:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677c90:	e8 eb f6 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677c95:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c9a:	e8 f1 61 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677c9f:	48 8d 35 0a cb cc fe 	lea    rsi,[rip+0xfffffffffecccb0a]        # 3447b0 <_ZTSSt12bad_any_cast@@Base-0x4ba18>
     1677ca6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677cab:	e8 ce 1d 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677cb0:	48 8d 8c 24 10 01 00 	lea    rcx,[rsp+0x110]

### disallow_toggling_repeat_track_reasons @ 0x1677c9f
     1677c6a:	48 8d 35 38 04 cd fe 	lea    rsi,[rip+0xfffffffffecd0438]        # 3480a9 <_ZTSSt12bad_any_cast@@Base-0x4811f>
     1677c71:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c76:	e8 03 1e 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677c7b:	48 8d 8c 24 f8 00 00 	lea    rcx,[rsp+0xf8]
     1677c82:	00 
     1677c83:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677c87:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677c8b:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677c90:	e8 eb f6 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677c95:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677c9a:	e8 f1 61 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677c9f:	48 8d 35 0a cb cc fe 	lea    rsi,[rip+0xfffffffffecccb0a]        # 3447b0 <_ZTSSt12bad_any_cast@@Base-0x4ba18>
     1677ca6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677cab:	e8 ce 1d 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677cb0:	48 8d 8c 24 10 01 00 	lea    rcx,[rsp+0x110]
     1677cb7:	00 
     1677cb8:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677cbc:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677cc0:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677cc5:	e8 b6 f6 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677cca:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ccf:	e8 bc 61 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677cd4:	48 8d 35 05 42 d1 fe 	lea    rsi,[rip+0xfffffffffed14205]        # 38bee0 <_ZTSSt12bad_any_cast@@Base-0x42e8>
     1677cdb:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ce0:	e8 99 1d 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677ce5:	48 8d 8c 24 28 01 00 	lea    rcx,[rsp+0x128]

### disallow_toggling_shuffle_reasons @ 0x1677cd4
     1677c9f:	48 8d 35 0a cb cc fe 	lea    rsi,[rip+0xfffffffffecccb0a]        # 3447b0 <_ZTSSt12bad_any_cast@@Base-0x4ba18>
     1677ca6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677cab:	e8 ce 1d 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677cb0:	48 8d 8c 24 10 01 00 	lea    rcx,[rsp+0x110]
     1677cb7:	00 
     1677cb8:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677cbc:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677cc0:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677cc5:	e8 b6 f6 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677cca:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ccf:	e8 bc 61 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677cd4:	48 8d 35 05 42 d1 fe 	lea    rsi,[rip+0xfffffffffed14205]        # 38bee0 <_ZTSSt12bad_any_cast@@Base-0x42e8>
     1677cdb:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ce0:	e8 99 1d 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677ce5:	48 8d 8c 24 28 01 00 	lea    rcx,[rsp+0x128]
     1677cec:	00 
     1677ced:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677cf1:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677cf5:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677cfa:	e8 81 f6 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677cff:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d04:	e8 87 61 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677d09:	48 8d 35 16 3b cf fe 	lea    rsi,[rip+0xfffffffffecf3b16]        # 36b826 <_ZTSSt12bad_any_cast@@Base-0x249a2>
     1677d10:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d15:	e8 64 1d 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677d1a:	48 8d 8c 24 40 01 00 	lea    rcx,[rsp+0x140]

### disallow_set_queue_reasons @ 0x1677d09
     1677cd4:	48 8d 35 05 42 d1 fe 	lea    rsi,[rip+0xfffffffffed14205]        # 38bee0 <_ZTSSt12bad_any_cast@@Base-0x42e8>
     1677cdb:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ce0:	e8 99 1d 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677ce5:	48 8d 8c 24 28 01 00 	lea    rcx,[rsp+0x128]
     1677cec:	00 
     1677ced:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677cf1:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677cf5:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677cfa:	e8 81 f6 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677cff:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d04:	e8 87 61 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677d09:	48 8d 35 16 3b cf fe 	lea    rsi,[rip+0xfffffffffecf3b16]        # 36b826 <_ZTSSt12bad_any_cast@@Base-0x249a2>
     1677d10:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d15:	e8 64 1d 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677d1a:	48 8d 8c 24 40 01 00 	lea    rcx,[rsp+0x140]
     1677d21:	00 
     1677d22:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677d26:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677d2a:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677d2f:	e8 4c f6 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677d34:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d39:	e8 52 61 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677d3e:	48 8d 35 86 93 ce fe 	lea    rsi,[rip+0xfffffffffece9386]        # 3610cb <_ZTSSt12bad_any_cast@@Base-0x2f0fd>
     1677d45:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d4a:	e8 2f 1d 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677d4f:	48 8d 8c 24 58 01 00 	lea    rcx,[rsp+0x158]

### disallow_add_to_queue_reasons @ 0x1677d3e
     1677d09:	48 8d 35 16 3b cf fe 	lea    rsi,[rip+0xfffffffffecf3b16]        # 36b826 <_ZTSSt12bad_any_cast@@Base-0x249a2>
     1677d10:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d15:	e8 64 1d 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677d1a:	48 8d 8c 24 40 01 00 	lea    rcx,[rsp+0x140]
     1677d21:	00 
     1677d22:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677d26:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677d2a:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677d2f:	e8 4c f6 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677d34:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d39:	e8 52 61 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677d3e:	48 8d 35 86 93 ce fe 	lea    rsi,[rip+0xfffffffffece9386]        # 3610cb <_ZTSSt12bad_any_cast@@Base-0x2f0fd>
     1677d45:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d4a:	e8 2f 1d 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677d4f:	48 8d 8c 24 58 01 00 	lea    rcx,[rsp+0x158]
     1677d56:	00 
     1677d57:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677d5b:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677d5f:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677d64:	e8 17 f6 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677d69:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d6e:	e8 1d 61 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677d73:	48 8d 35 6f 35 cd fe 	lea    rsi,[rip+0xfffffffffecd356f]        # 34b2e9 <_ZTSSt12bad_any_cast@@Base-0x44edf>
     1677d7a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d7f:	e8 fa 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677d84:	48 8d 8c 24 70 01 00 	lea    rcx,[rsp+0x170]

### disallow_interrupting_playback_reasons @ 0x1677d73
     1677d3e:	48 8d 35 86 93 ce fe 	lea    rsi,[rip+0xfffffffffece9386]        # 3610cb <_ZTSSt12bad_any_cast@@Base-0x2f0fd>
     1677d45:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d4a:	e8 2f 1d 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677d4f:	48 8d 8c 24 58 01 00 	lea    rcx,[rsp+0x158]
     1677d56:	00 
     1677d57:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677d5b:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677d5f:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677d64:	e8 17 f6 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677d69:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d6e:	e8 1d 61 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677d73:	48 8d 35 6f 35 cd fe 	lea    rsi,[rip+0xfffffffffecd356f]        # 34b2e9 <_ZTSSt12bad_any_cast@@Base-0x44edf>
     1677d7a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d7f:	e8 fa 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677d84:	48 8d 8c 24 70 01 00 	lea    rcx,[rsp+0x170]
     1677d8b:	00 
     1677d8c:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677d90:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677d94:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677d99:	e8 e2 f5 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677d9e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677da3:	e8 e8 60 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677da8:	48 8d 35 23 03 cd fe 	lea    rsi,[rip+0xfffffffffecd0323]        # 3480d2 <_ZTSSt12bad_any_cast@@Base-0x480f6>
     1677daf:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677db4:	e8 c5 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677db9:	48 8d 8c 24 88 01 00 	lea    rcx,[rsp+0x188]

### disallow_transferring_playback_reasons @ 0x1677da8
     1677d73:	48 8d 35 6f 35 cd fe 	lea    rsi,[rip+0xfffffffffecd356f]        # 34b2e9 <_ZTSSt12bad_any_cast@@Base-0x44edf>
     1677d7a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677d7f:	e8 fa 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677d84:	48 8d 8c 24 70 01 00 	lea    rcx,[rsp+0x170]
     1677d8b:	00 
     1677d8c:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677d90:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677d94:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677d99:	e8 e2 f5 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677d9e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677da3:	e8 e8 60 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677da8:	48 8d 35 23 03 cd fe 	lea    rsi,[rip+0xfffffffffecd0323]        # 3480d2 <_ZTSSt12bad_any_cast@@Base-0x480f6>
     1677daf:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677db4:	e8 c5 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677db9:	48 8d 8c 24 88 01 00 	lea    rcx,[rsp+0x188]
     1677dc0:	00 
     1677dc1:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677dc5:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677dc9:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677dce:	e8 ad f5 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677dd3:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677dd8:	e8 b3 60 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677ddd:	48 8d 35 3c 50 cb fe 	lea    rsi,[rip+0xfffffffffecb503c]        # 32ce20 <_ZTSSt12bad_any_cast@@Base-0x633a8>
     1677de4:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677de9:	e8 90 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677dee:	48 8d 8c 24 a0 01 00 	lea    rcx,[rsp+0x1a0]

### disallow_remote_control_reasons @ 0x1677ddd
     1677da8:	48 8d 35 23 03 cd fe 	lea    rsi,[rip+0xfffffffffecd0323]        # 3480d2 <_ZTSSt12bad_any_cast@@Base-0x480f6>
     1677daf:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677db4:	e8 c5 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677db9:	48 8d 8c 24 88 01 00 	lea    rcx,[rsp+0x188]
     1677dc0:	00 
     1677dc1:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677dc5:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677dc9:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677dce:	e8 ad f5 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677dd3:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677dd8:	e8 b3 60 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677ddd:	48 8d 35 3c 50 cb fe 	lea    rsi,[rip+0xfffffffffecb503c]        # 32ce20 <_ZTSSt12bad_any_cast@@Base-0x633a8>
     1677de4:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677de9:	e8 90 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677dee:	48 8d 8c 24 a0 01 00 	lea    rcx,[rsp+0x1a0]
     1677df5:	00 
     1677df6:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677dfa:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677dfe:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677e03:	e8 78 f5 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677e08:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e0d:	e8 7e 60 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677e12:	48 8d 35 a7 22 cc fe 	lea    rsi,[rip+0xfffffffffecc22a7]        # 33a0c0 <_ZTSSt12bad_any_cast@@Base-0x56108>
     1677e19:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e1e:	e8 5b 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677e23:	48 8d 8c 24 b8 01 00 	lea    rcx,[rsp+0x1b8]

### disallow_inserting_into_next_tracks_reasons @ 0x1677e12
     1677ddd:	48 8d 35 3c 50 cb fe 	lea    rsi,[rip+0xfffffffffecb503c]        # 32ce20 <_ZTSSt12bad_any_cast@@Base-0x633a8>
     1677de4:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677de9:	e8 90 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677dee:	48 8d 8c 24 a0 01 00 	lea    rcx,[rsp+0x1a0]
     1677df5:	00 
     1677df6:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677dfa:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677dfe:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677e03:	e8 78 f5 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677e08:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e0d:	e8 7e 60 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677e12:	48 8d 35 a7 22 cc fe 	lea    rsi,[rip+0xfffffffffecc22a7]        # 33a0c0 <_ZTSSt12bad_any_cast@@Base-0x56108>
     1677e19:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e1e:	e8 5b 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677e23:	48 8d 8c 24 b8 01 00 	lea    rcx,[rsp+0x1b8]
     1677e2a:	00 
     1677e2b:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677e2f:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677e33:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677e38:	e8 43 f5 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677e3d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e42:	e8 49 60 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677e47:	48 8d 35 5b f9 cd fe 	lea    rsi,[rip+0xfffffffffecdf95b]        # 3577a9 <_ZTSSt12bad_any_cast@@Base-0x38a1f>
     1677e4e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e53:	e8 26 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677e58:	48 8d 8c 24 d0 01 00 	lea    rcx,[rsp+0x1d0]

### disallow_inserting_into_context_tracks_reasons @ 0x1677e47
     1677e12:	48 8d 35 a7 22 cc fe 	lea    rsi,[rip+0xfffffffffecc22a7]        # 33a0c0 <_ZTSSt12bad_any_cast@@Base-0x56108>
     1677e19:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e1e:	e8 5b 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677e23:	48 8d 8c 24 b8 01 00 	lea    rcx,[rsp+0x1b8]
     1677e2a:	00 
     1677e2b:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677e2f:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677e33:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677e38:	e8 43 f5 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677e3d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e42:	e8 49 60 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677e47:	48 8d 35 5b f9 cd fe 	lea    rsi,[rip+0xfffffffffecdf95b]        # 3577a9 <_ZTSSt12bad_any_cast@@Base-0x38a1f>
     1677e4e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e53:	e8 26 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677e58:	48 8d 8c 24 d0 01 00 	lea    rcx,[rsp+0x1d0]
     1677e5f:	00 
     1677e60:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677e64:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677e68:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677e6d:	e8 0e f5 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677e72:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e77:	e8 14 60 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677e7c:	48 8d 35 c0 f1 cb fe 	lea    rsi,[rip+0xfffffffffecbf1c0]        # 337043 <_ZTSSt12bad_any_cast@@Base-0x59185>
     1677e83:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e88:	e8 f1 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677e8d:	48 8d 8c 24 e8 01 00 	lea    rcx,[rsp+0x1e8]

### disallow_reordering_in_next_tracks_reasons @ 0x1677e7c
     1677e47:	48 8d 35 5b f9 cd fe 	lea    rsi,[rip+0xfffffffffecdf95b]        # 3577a9 <_ZTSSt12bad_any_cast@@Base-0x38a1f>
     1677e4e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e53:	e8 26 1c 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677e58:	48 8d 8c 24 d0 01 00 	lea    rcx,[rsp+0x1d0]
     1677e5f:	00 
     1677e60:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677e64:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677e68:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677e6d:	e8 0e f5 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677e72:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e77:	e8 14 60 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677e7c:	48 8d 35 c0 f1 cb fe 	lea    rsi,[rip+0xfffffffffecbf1c0]        # 337043 <_ZTSSt12bad_any_cast@@Base-0x59185>
     1677e83:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e88:	e8 f1 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677e8d:	48 8d 8c 24 e8 01 00 	lea    rcx,[rsp+0x1e8]
     1677e94:	00 
     1677e95:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677e99:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677e9d:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677ea2:	e8 d9 f4 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677ea7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677eac:	e8 df 5f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677eb1:	48 8d 35 4a 40 d1 fe 	lea    rsi,[rip+0xfffffffffed1404a]        # 38bf02 <_ZTSSt12bad_any_cast@@Base-0x42c6>
     1677eb8:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ebd:	e8 bc 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677ec2:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]

### disallow_reordering_in_context_tracks_reasons @ 0x1677eb1
     1677e7c:	48 8d 35 c0 f1 cb fe 	lea    rsi,[rip+0xfffffffffecbf1c0]        # 337043 <_ZTSSt12bad_any_cast@@Base-0x59185>
     1677e83:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677e88:	e8 f1 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677e8d:	48 8d 8c 24 e8 01 00 	lea    rcx,[rsp+0x1e8]
     1677e94:	00 
     1677e95:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677e99:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677e9d:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677ea2:	e8 d9 f4 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677ea7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677eac:	e8 df 5f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677eb1:	48 8d 35 4a 40 d1 fe 	lea    rsi,[rip+0xfffffffffed1404a]        # 38bf02 <_ZTSSt12bad_any_cast@@Base-0x42c6>
     1677eb8:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ebd:	e8 bc 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677ec2:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
     1677ec9:	00 
     1677eca:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677ece:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677ed2:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677ed7:	e8 a4 f4 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677edc:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ee1:	e8 aa 5f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677ee6:	48 8d 35 c7 c9 ce fe 	lea    rsi,[rip+0xfffffffffecec9c7]        # 3648b4 <_ZTSSt12bad_any_cast@@Base-0x2b914>
     1677eed:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ef2:	e8 87 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677ef7:	48 8d 8c 24 18 02 00 	lea    rcx,[rsp+0x218]

### disallow_removing_from_next_tracks_reasons @ 0x1677ee6
     1677eb1:	48 8d 35 4a 40 d1 fe 	lea    rsi,[rip+0xfffffffffed1404a]        # 38bf02 <_ZTSSt12bad_any_cast@@Base-0x42c6>
     1677eb8:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ebd:	e8 bc 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677ec2:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
     1677ec9:	00 
     1677eca:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677ece:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677ed2:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677ed7:	e8 a4 f4 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677edc:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ee1:	e8 aa 5f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677ee6:	48 8d 35 c7 c9 ce fe 	lea    rsi,[rip+0xfffffffffecec9c7]        # 3648b4 <_ZTSSt12bad_any_cast@@Base-0x2b914>
     1677eed:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ef2:	e8 87 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677ef7:	48 8d 8c 24 18 02 00 	lea    rcx,[rsp+0x218]
     1677efe:	00 
     1677eff:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677f03:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677f07:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677f0c:	e8 6f f4 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677f11:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677f16:	e8 75 5f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677f1b:	48 8d 35 8d 2b ce fe 	lea    rsi,[rip+0xfffffffffece2b8d]        # 35aaaf <_ZTSSt12bad_any_cast@@Base-0x35719>
     1677f22:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677f27:	e8 52 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677f2c:	48 8d 8c 24 30 02 00 	lea    rcx,[rsp+0x230]

### disallow_removing_from_context_tracks_reasons @ 0x1677f1b
     1677ee6:	48 8d 35 c7 c9 ce fe 	lea    rsi,[rip+0xfffffffffecec9c7]        # 3648b4 <_ZTSSt12bad_any_cast@@Base-0x2b914>
     1677eed:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677ef2:	e8 87 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677ef7:	48 8d 8c 24 18 02 00 	lea    rcx,[rsp+0x218]
     1677efe:	00 
     1677eff:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677f03:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677f07:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677f0c:	e8 6f f4 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677f11:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677f16:	e8 75 5f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677f1b:	48 8d 35 8d 2b ce fe 	lea    rsi,[rip+0xfffffffffece2b8d]        # 35aaaf <_ZTSSt12bad_any_cast@@Base-0x35719>
     1677f22:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677f27:	e8 52 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677f2c:	48 8d 8c 24 30 02 00 	lea    rcx,[rsp+0x230]
     1677f33:	00 
     1677f34:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677f38:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677f3c:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677f41:	e8 3a f4 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677f46:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677f4b:	e8 40 5f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677f50:	48 8d 35 e5 3a d0 fe 	lea    rsi,[rip+0xfffffffffed03ae5]        # 37ba3c <_ZTSSt12bad_any_cast@@Base-0x1478c>
     1677f57:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677f5c:	e8 1d 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677f61:	48 8d 8c 24 48 02 00 	lea    rcx,[rsp+0x248]

### disallow_updating_context_reasons @ 0x1677f50
     1677f1b:	48 8d 35 8d 2b ce fe 	lea    rsi,[rip+0xfffffffffece2b8d]        # 35aaaf <_ZTSSt12bad_any_cast@@Base-0x35719>
     1677f22:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677f27:	e8 52 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677f2c:	48 8d 8c 24 30 02 00 	lea    rcx,[rsp+0x230]
     1677f33:	00 
     1677f34:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677f38:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677f3c:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677f41:	e8 3a f4 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677f46:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677f4b:	e8 40 5f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677f50:	48 8d 35 e5 3a d0 fe 	lea    rsi,[rip+0xfffffffffed03ae5]        # 37ba3c <_ZTSSt12bad_any_cast@@Base-0x1478c>
     1677f57:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677f5c:	e8 1d 1b 40 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1677f61:	48 8d 8c 24 48 02 00 	lea    rcx,[rsp+0x248]
     1677f68:	00 
     1677f69:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1677f6d:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     1677f71:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1677f76:	e8 05 f4 ff ff       	call   1677380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4ec>
     1677f7b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1677f80:	e8 0b 5f 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1677f85:	48 83 c3 68          	add    rbx,0x68
     1677f89:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1677f8e:	48 89 df             	mov    rdi,rbx
     1677f91:	4c 89 f6             	mov    rsi,r14

