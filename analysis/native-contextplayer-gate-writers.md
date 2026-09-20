# ContextPlayer gate-writer candidates

Skip-next ad_disallow is gated by byte fields ContextPlayer+0x598 and ContextPlayer+0x470.
This report compares the strongest same-layout writer candidates and avoids treating same numeric offsets in unrelated objects as proof.

## byte +0x470 writer: 0xcba8e9
Function range: 0xcb7a20..0xcbc937 (size 0x4f17)

### Signature field accesses
      cb7e2c:	48 8d 84 24 70 04 00 	lea    rax,[rsp+0x470]
      cba836:	f3 41 0f 7f 87 38 04 	movdqu XMMWORD PTR [r15+0x438],xmm0
      cba8e9:	41 88 bf 70 04 00 00 	mov    BYTE PTR [r15+0x470],dil

### Writer neighborhood
      cba893:	41 0f 10 00          	movups xmm0,XMMWORD PTR [r8]
      cba897:	41 0f 11 87 48 04 00 	movups XMMWORD PTR [r15+0x448],xmm0
      cba89e:	00 
      cba89f:	48 85 ff             	test   rdi,rdi
      cba8a2:	44 8b 84 24 20 01 00 	mov    r8d,DWORD PTR [rsp+0x120]
      cba8a9:	00 
      cba8aa:	74 05                	je     cba8b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x207851>
      cba8ac:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      cba8b1:	48 8b bc 24 f0 01 00 	mov    rdi,QWORD PTR [rsp+0x1f0]
      cba8b8:	00 
      cba8b9:	49 89 bf 58 04 00 00 	mov    QWORD PTR [r15+0x458],rdi
      cba8c0:	48 8b bc 24 a0 0a 00 	mov    rdi,QWORD PTR [rsp+0xaa0]
      cba8c7:	00 
      cba8c8:	49 89 bf 60 04 00 00 	mov    QWORD PTR [r15+0x460],rdi
      cba8cf:	45 89 87 68 04 00 00 	mov    DWORD PTR [r15+0x468],r8d
      cba8d6:	8b bc 24 7c 01 00 00 	mov    edi,DWORD PTR [rsp+0x17c]
      cba8dd:	41 89 bf 6c 04 00 00 	mov    DWORD PTR [r15+0x46c],edi
      cba8e4:	40 8a 7c 24 1f       	mov    dil,BYTE PTR [rsp+0x1f]
      cba8e9:	41 88 bf 70 04 00 00 	mov    BYTE PTR [r15+0x470],dil
      cba8f0:	40 8a 7c 24 1e       	mov    dil,BYTE PTR [rsp+0x1e]
      cba8f5:	41 88 bf 71 04 00 00 	mov    BYTE PTR [r15+0x471],dil
      cba8fc:	40 8a 7c 24 1d       	mov    dil,BYTE PTR [rsp+0x1d]
      cba901:	41 88 bf 72 04 00 00 	mov    BYTE PTR [r15+0x472],dil
      cba908:	8b bc 24 38 02 00 00 	mov    edi,DWORD PTR [rsp+0x238]
      cba90f:	41 89 bf 73 04 00 00 	mov    DWORD PTR [r15+0x473],edi
      cba916:	40 8a bc 24 3c 02 00 	mov    dil,BYTE PTR [rsp+0x23c]
      cba91d:	00 
      cba91e:	41 88 bf 77 04 00 00 	mov    BYTE PTR [r15+0x477],dil
      cba925:	8b bc 24 78 01 00 00 	mov    edi,DWORD PTR [rsp+0x178]
      cba92c:	41 89 bf 78 04 00 00 	mov    DWORD PTR [r15+0x478],edi
      cba933:	49 89 87 80 04 00 00 	mov    QWORD PTR [r15+0x480],rax
      cba93a:	49 89 8f 88 04 00 00 	mov    QWORD PTR [r15+0x488],rcx
      cba941:	8b 84 24 70 01 00 00 	mov    eax,DWORD PTR [rsp+0x170]
      cba948:	41 89 87 90 04 00 00 	mov    DWORD PTR [r15+0x490],eax
      cba94f:	f3 41 0f 11 97 94 04 	movss  DWORD PTR [r15+0x494],xmm2
      cba956:	00 00 
      cba958:	66 41 0f 7e 8f 98 04 	movd   DWORD PTR [r15+0x498],xmm1
      cba95f:	00 00 
      cba961:	49 89 97 a0 04 00 00 	mov    QWORD PTR [r15+0x4a0],rdx
      cba968:	49 89 b7 a8 04 00 00 	mov    QWORD PTR [r15+0x4a8],rsi
      cba96f:	0f 28 84 24 10 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x810]
      cba976:	00 
      cba977:	66 0f 6f 8c 24 20 08 	movdqa xmm1,XMMWORD PTR [rsp+0x820]
      cba97e:	00 00 
      cba980:	0f 28 94 24 30 08 00 	movaps xmm2,XMMWORD PTR [rsp+0x830]
      cba987:	00 
      cba988:	0f 28 9c 24 40 08 00 	movaps xmm3,XMMWORD PTR [rsp+0x840]
      cba98f:	00 

### Printable RIP-relative strings
- 0xcb7bb7 -> 0x3cd900: core-audio-track-player-feature
- 0xcb7bbe -> 0x3cd920: driver_buffer_target_duration
- 0xcb7bed -> 0x3cd960: max_prebuffer_duration_setting_when_stuttering
- 0xcb7c1c -> 0x3cd9b0: decompress_loop_wall_clock_budget_ms
- 0xcb7c3e -> 0x3363c5: Oboe
- 0xcb7c5d -> 0x36074e: AVFoundation
- 0xcb7c84 -> 0x33ffd2: AudioUnit2Renderer
- 0xcb7c9b -> 0x3251f2: CoreAudioRenderer
- 0xcb7cb2 -> 0x380fc9: Pipewire
- 0xcb7cc9 -> 0x37444a: PulseAudio
- 0xcb7ce0 -> 0x42957d: Unspecified
- 0xcb7d49 -> 0x3cd2d0: audio_driver_name
- 0xcb7d8a -> 0x3cdad0: audio_renderer_buffer_request_size_ms
- 0xcb7f4d -> 0x366015: api_renderer
- 0xcb7f8b -> 0x32c20f: com/spotify/playbacknative/AudioDriver
- 0xcb7fdc -> 0x379979: sUsingOboe
- 0xcb8034 -> 0x387acb: Could not find class AudioDriver
- 0xcb805b -> 0x3275fd: Could not find field sUsingOboe
- 0xcb809d -> 0x367672: Audio Driver Thread
- 0xcb81d2 -> 0x3cd2f0: core-audio-effects
- 0xcb81d9 -> 0x3cd310: echo_high_pass_cutoff_hz
- 0xcb8236 -> 0x3cd350: delay_high_pass_cutoff_hz
- 0xcb828a -> 0x3cd390: reverb_high_pass_cutoff_hz
- 0xcb8326 -> 0x3cd3d0: echo_equal_power_mix
- 0xcb8376 -> 0x3cd410: delay_equal_power_mix
- 0xcb83bf -> 0x3cd450: reverb_equal_power_mix
- 0xcb8408 -> 0x3cd490: reverb_output_gain_pct
- 0xcb845b -> 0x3cd4d0: noise_effect_gain_pct
- 0xcb84b2 -> 0x3cd510: jogwheel_buffer_size_ms
- 0xcb851c -> 0x3cd550: stop_processing_at_end_of_stream
- 0xcb8541 -> 0x342cfd: Always
- 0xcb855b -> 0x3cd580: MediaPlayerOnly
- 0xcb8577 -> 0x377763: Never
- 0xcb8693 -> 0x3cd590: core-audio-track-player
- 0xcb869a -> 0x3cd5b0: send_wasapi_audio_driver_info
- 0xcb86ee -> 0x3cd5f0: wasapi_sync_app_session_volume_to_spt_volume_slider
- 0xcb8738 -> 0x3cd650: wasapi_endpoint_volume_control
- 0xcb8784 -> 0x3cd690: send_wasapi_audio_driver_format_error
- 0xcb87d5 -> 0x3cd6e0: wasapi_thread_characteristics
- 0xcb87f9 -> 0x379984: ProAudio
- 0xcb882e -> 0x3cd3ab: None
- 0xcb884d -> 0x43edb0: Audio
- 0xcb8864 -> 0x3cd6b6: Playback
- 0xcb8932 -> 0x3cd730: wasapi_thread_priority
- 0xcb8956 -> 0x3505b1: Critical
- 0xcb8994 -> 0x3cd6fe: Normal
- 0xcb89d7 -> 0x356cfa: High
- 0xcb8ad9 -> 0x3cd770: audio_driver_with_audio_renderer_processing_interval
- 0xcb8b48 -> 0x3cd7d0: pulse_audio_tlength
- 0xcb8bb5 -> 0x3cd810: pulse_audio_minreq
- 0xcb8c2a -> 0x3cd850: oboe_callback_buffer_size_ms
- 0xcb8c95 -> 0x3cd890: oboe_legacy_close_delay_ms
- 0xcb8cfb -> 0x3cd8d0: oboe_underrun_check_mode
- 0xcb8d23 -> 0x37ce60: ControlScheduler
- 0xcb8d4c -> 0x3cd8e9: DataCallback
- 0xcb8e05 -> 0x3cda00: ignore_underruns_after_track_end_for_ms
- 0xcb8e6e -> 0x3cda50: audio_driver_pause_fade_time_ms
- 0xcb8ed5 -> 0x3cda90: audio_driver_flush_fade_time_ms
- 0xcb91d8 -> 0x3cdb20: use_driver_on_process_callback
- 0xcb943e -> 0x3cdb60: audio_mixer_use_audio_thread_processing
- 0xcb948c -> 0x3cdbb0: media_player_log_boombox_timeline_contents
- 0xcb94d0 -> 0x3cdc00: strict_timeline_event_ordering
- 0xcb9514 -> 0x3cdc40: cache_resolved_timepoints
- 0xcb9557 -> 0x3cdc80: serialize_position_observer
- 0xcb95a6 -> 0x3cdcc0: what_read_data_is_allowed_to_do_while_renderer_shuts_down
- 0xcb95cf -> 0x389f21: Everything
- 0xcb9605 -> 0x3cdcfa: Nothing
- 0xcb962b -> 0x3496a5: ReadSnapshot
- 0xcb9649 -> 0x369ac2: HandleRebuffering
- 0xcb9667 -> 0x36ccea: MixAudio
- 0xcb9bfe -> 0x3cdd02: core-bitrate
- 0xcb9c05 -> 0x3cdd10: net_fortune_use_playback_stats
- 0xcb9cff -> 0x3cdd50: bitrate_downgrade
- 0xcb9d26 -> 0x352283: DownloadBitrate
- 0xcb9d5c -> 0x369bb5: AudioBufferSize
- 0xcb9e66 -> 0x3cdd90: bitrate_downgrade_target_bitrate
- 0xcb9eba -> 0x3cdde0: bitrate_downgrade_non_lossless
- 0xcb9f00 -> 0x3cde20: darkload_dowgrading
- 0xcb9f46 -> 0x3cde60: send_midtrack_downgrade_event
- 0xcb9f8c -> 0x3cdea0: consecutive_low_buffer_count
- 0xcb9ff2 -> 0x3cdee0: critical_buffer_threshold_for_bitrate_downgrade
- 0xcba05b -> 0x3cdf30: min_buffer_for_buffer_monitoring_to_start
- 0xcba0bf -> 0x3cdf80: buffer_moving_average_window_size
- 0xcba121 -> 0x3cdfd0: max_buffer_depletion_rate
- 0xcba184 -> 0x3ce010: bitrate_downshift_advice_wait_for_key
- 0xcba1ca -> 0x3ce060: bitrate_downshift_prediction
- 0xcba20f -> 0x3ce0a0: downshift_wait_for_initial_buffering_completed
- 0xcba255 -> 0x3ce0f0: downshift_detailed_logs
- 0xcbaa9f -> 0x3ce130: handle_track_deferred_close_after_stream_resumption
- 0xcbaae9 -> 0x3ce190: track_deferred_close_after_stream_resumption_max_threshold
- 0xcbab3e -> 0x3ce1f0: rcheck_fail_on_stream_reporting_pending_event_errors
- 0xcbb567 -> 0x437c30: audio.normalize_v2
- 0xcbb678 -> 0x437c50: audio.loudness.environment

### Direct callers/jumpers of function entry
- 0xcb72c9 from 0xcb6e5a..0xcb749c

## byte +0x598 writer / +0x438 pointer owner: 0x13bd9a0
Function range: 0x13bd65e..0x13be0db (size 0xa7d)

### Signature field accesses
     13bd682:	83 bf 70 04 00 00 00 	cmp    DWORD PTR [rdi+0x470],0x0
     13bd78f:	49 8d 86 38 04 00 00 	lea    rax,[r14+0x438]
     13bd959:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     13bd9a0:	41 88 86 98 05 00 00 	mov    BYTE PTR [r14+0x598],al
     13bdb3a:	49 89 8e 38 04 00 00 	mov    QWORD PTR [r14+0x438],rcx

### Writer neighborhood
     13bd959:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     13bd960:	00 
     13bd961:	74 51                	je     13bd9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x202f38>
     13bd963:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     13bd968:	48 8b 41 30          	mov    rax,QWORD PTR [rcx+0x30]
     13bd96c:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
     13bd973:	00 
     13bd974:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     13bd977:	0f 10 49 10          	movups xmm1,XMMWORD PTR [rcx+0x10]
     13bd97b:	0f 10 51 20          	movups xmm2,XMMWORD PTR [rcx+0x20]
     13bd97f:	0f 29 94 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm2
     13bd986:	00 
     13bd987:	0f 29 8c 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm1
     13bd98e:	00 
     13bd98f:	0f 29 84 24 b0 00 00 	movaps XMMWORD PTR [rsp+0xb0],xmm0
     13bd996:	00 
     13bd997:	31 c0                	xor    eax,eax
     13bd999:	41 88 86 68 05 00 00 	mov    BYTE PTR [r14+0x568],al
     13bd9a0:	41 88 86 98 05 00 00 	mov    BYTE PTR [r14+0x598],al
     13bd9a7:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     13bd9ae:	00 
     13bd9af:	e8 c6 a3 80 ff       	call   bc7d7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x114d1a>
     13bd9b4:	85 db                	test   ebx,ebx
     13bd9b6:	74 19                	je     13bd9d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x202f55>
     13bd9b8:	48 8d 05 09 a1 57 00 	lea    rax,[rip+0x57a109]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     13bd9bf:	49 39 c5             	cmp    r13,rax
     13bd9c2:	0f 85 54 05 00 00    	jne    13bdf1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2034a0>
     13bd9c8:	83 fb 01             	cmp    ebx,0x1
     13bd9cb:	0f 85 4b 05 00 00    	jne    13bdf1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2034a0>
     13bd9d1:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
     13bd9d5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13bd9d8:	ff 50 20             	call   QWORD PTR [rax+0x20]
     13bd9db:	41 86 86 6b 04 00 00 	xchg   BYTE PTR [r14+0x46b],al
     13bd9e2:	4d 01 a6 10 04 00 00 	add    QWORD PTR [r14+0x410],r12
     13bd9e9:	4d 85 e4             	test   r12,r12
     13bd9ec:	74 5a                	je     13bda48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x202fcc>
     13bd9ee:	49 8b 86 00 04 00 00 	mov    rax,QWORD PTR [r14+0x400]
     13bd9f5:	4c 39 e0             	cmp    rax,r12
     13bd9f8:	4d 89 e7             	mov    r15,r12
     13bd9fb:	4c 0f 42 f8          	cmovb  r15,rax
     13bd9ff:	48 89 c1             	mov    rcx,rax
     13bda02:	4c 29 f9             	sub    rcx,r15
     13bda05:	49 89 8e 00 04 00 00 	mov    QWORD PTR [r14+0x400],rcx
     13bda0c:	4d 29 be f8 03 00 00 	sub    QWORD PTR [r14+0x3f8],r15
     13bda13:	48 85 c0             	test   rax,rax
     13bda16:	0f 84 a1 00 00 00    	je     13bdabd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x203041>
     13bda1c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     13bda21:	e8 14 0f 00 00       	call   13be93a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x203ebe>

### Printable RIP-relative strings
- 0x13bdd7f -> 0x377e53: snd
- 0x13bdd8e -> 0x377e57: Opening sink for playback.
- 0x13bdd9f -> 0x451c18: unknown
- 0x13bddb5 -> 0x343897:     codec: %s
- 0x13bddec -> 0x37463f:     bitrate: %d bits/s
- 0x13bde0d -> 0x3438a5:     sample rate: %d Hz
- 0x13bde27 -> 0x36b44d: 32-bit-float-pcm
- 0x13bde34 -> 0x33336e: 16-bit-pcm
- 0x13bde4a -> 0x36e19d:     sample format: %s
- 0x13bdeb3 -> 0x32f676:     duration: %s ms
- 0x13bdf6a -> 0x34db5b: Decode Error %s (%d)

### Direct callers/jumpers of function entry
- 0x13bcf9e from 0x13bcd44..0x13bd353
- 0x13be12b from 0x13be0dc..0x13be157

## other byte +0x598 writer: 0x13ace52
Function range: 0x13ac372..0x13adc94 (size 0x1922)

### Signature field accesses
     13acd5e:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     13ace52:	88 8b 98 05 00 00    	mov    BYTE PTR [rbx+0x598],cl

### Writer neighborhood
     13acdf0:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
     13acdf4:	48 8d 05 05 c4 47 00 	lea    rax,[rip+0x47c405]        # 1829200 <_ZTIN4asio2ip16bad_address_castE@@Base+0x5830>
     13acdfb:	48 89 83 00 05 00 00 	mov    QWORD PTR [rbx+0x500],rax
     13ace02:	48 89 b3 08 05 00 00 	mov    QWORD PTR [rbx+0x508],rsi
     13ace09:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
     13ace0e:	48 89 8b 20 05 00 00 	mov    QWORD PTR [rbx+0x520],rcx
     13ace15:	48 8d bb 30 05 00 00 	lea    rdi,[rbx+0x530]
     13ace1c:	48 89 bc 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rdi
     13ace23:	00 
     13ace24:	e8 99 48 41 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     13ace29:	48 8d bb 40 05 00 00 	lea    rdi,[rbx+0x540]
     13ace30:	48 89 bc 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rdi
     13ace37:	00 
     13ace38:	e8 c5 cf 42 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     13ace3d:	49 8d 85 08 01 00 00 	lea    rax,[r13+0x108]
     13ace44:	48 8d 8b 90 02 00 00 	lea    rcx,[rbx+0x290]
     13ace4b:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
     13ace50:	31 c9                	xor    ecx,ecx
     13ace52:	88 8b 98 05 00 00    	mov    BYTE PTR [rbx+0x598],cl
     13ace58:	88 8b c8 05 00 00    	mov    BYTE PTR [rbx+0x5c8],cl
     13ace5e:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     13ace61:	0f 11 83 c9 05 00 00 	movups XMMWORD PTR [rbx+0x5c9],xmm0
     13ace68:	c7 83 d9 05 00 00 01 	mov    DWORD PTR [rbx+0x5d9],0x1
     13ace6f:	00 00 00 
     13ace72:	c6 83 dd 05 00 00 01 	mov    BYTE PTR [rbx+0x5dd],0x1
     13ace79:	0f 57 c0             	xorps  xmm0,xmm0
     13ace7c:	0f 29 83 e0 05 00 00 	movaps XMMWORD PTR [rbx+0x5e0],xmm0
     13ace83:	48 83 a3 f0 05 00 00 	and    QWORD PTR [rbx+0x5f0],0x0
     13ace8a:	00 
     13ace8b:	48 8d bb 00 06 00 00 	lea    rdi,[rbx+0x600]
     13ace92:	48 8d b4 24 50 02 00 	lea    rsi,[rsp+0x250]
     13ace99:	00 
     13ace9a:	48 89 bc 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rdi
     13acea1:	00 
     13acea2:	4c 89 b4 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],r14
     13acea9:	00 
     13aceaa:	e8 e1 d3 6c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     13aceaf:	0f 57 c0             	xorps  xmm0,xmm0
     13aceb2:	0f 29 83 30 06 00 00 	movaps XMMWORD PTR [rbx+0x630],xmm0
     13aceb9:	48 c7 83 40 06 00 00 	mov    QWORD PTR [rbx+0x640],0x1
     13acec0:	01 00 00 00 
     13acec4:	31 ed                	xor    ebp,ebp
     13acec6:	40 88 ab 48 06 00 00 	mov    BYTE PTR [rbx+0x648],bpl
     13acecd:	83 a3 4c 06 00 00 00 	and    DWORD PTR [rbx+0x64c],0x0
     13aced4:	48 8d bb 50 06 00 00 	lea    rdi,[rbx+0x650]
     13acedb:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
     13acee2:	00 
     13acee3:	e8 94 48 00 00       	call   13b177c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f6d00>

### Printable RIP-relative strings
- 0x13ad1a5 -> 0x451c25: false
- 0x13ad1ac -> 0x451c20: true
- 0x13ad34e -> 0x35078a: AudioStreamer throttling enabled:
- 0x13ad36f -> 0x33cb50:   - Bandwidth limit: %.2f Mbps
- 0x13ad38a -> 0x36e16e:   - Max data bytes: %zu
- 0x13ad3a5 -> 0x36e186:   - Min delay: %lld ms
- 0x13ad3c0 -> 0x37ad96:   - Max delay: %lld ms
- 0x13ad3e5 -> 0x328c6f:   - Jitter: %.1f%%
- 0x13ad400 -> 0x34a634:   - Chunk split size: %zu
- 0x13ad56b -> 0x377e53: snd
- 0x13ad572 -> 0x3536e3: AudioStreamer: did not find file to play.
- 0x13ad731 -> 0x451c18: unknown

### Direct callers/jumpers of function entry
- 0xcd03da from 0xcd038a..0xcd0451
- 0x13624ec from 0x1361eb4..0x13626e6

## initializer touching all three offsets: 0x13bbced
Function range: 0x13bbbc2..0x13bc0d5 (size 0x513)

### Signature field accesses
     13bbcb5:	40 88 ab 38 04 00 00 	mov    BYTE PTR [rbx+0x438],bpl
     13bbced:	83 a3 70 04 00 00 00 	and    DWORD PTR [rbx+0x470],0x0
     13bbdfe:	c6 83 98 05 00 00 01 	mov    BYTE PTR [rbx+0x598],0x1

### Writer neighborhood
     13bbc83:	48 8d bb 90 03 00 00 	lea    rdi,[rbx+0x390]
     13bbc8a:	31 ed                	xor    ebp,ebp
     13bbc8c:	40 88 ab 1c 04 00 00 	mov    BYTE PTR [rbx+0x41c],bpl
     13bbc93:	ba 89 00 00 00       	mov    edx,0x89
     13bbc98:	31 f6                	xor    esi,esi
     13bbc9a:	e8 f1 2e 43 00       	call   17eeb90 <memset@plt>
     13bbc9f:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     13bbca3:	0f 11 83 20 04 00 00 	movups XMMWORD PTR [rbx+0x420],xmm0
     13bbcaa:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     13bbcae:	48 89 83 30 04 00 00 	mov    QWORD PTR [rbx+0x430],rax
     13bbcb5:	40 88 ab 38 04 00 00 	mov    BYTE PTR [rbx+0x438],bpl
     13bbcbc:	40 88 ab 40 04 00 00 	mov    BYTE PTR [rbx+0x440],bpl
     13bbcc3:	40 88 ab 48 04 00 00 	mov    BYTE PTR [rbx+0x448],bpl
     13bbcca:	40 88 ab 50 04 00 00 	mov    BYTE PTR [rbx+0x450],bpl
     13bbcd1:	40 88 ab 58 04 00 00 	mov    BYTE PTR [rbx+0x458],bpl
     13bbcd8:	40 88 ab 60 04 00 00 	mov    BYTE PTR [rbx+0x460],bpl
     13bbcdf:	83 a3 68 04 00 00 00 	and    DWORD PTR [rbx+0x468],0x0
     13bbce6:	40 88 ab 6c 04 00 00 	mov    BYTE PTR [rbx+0x46c],bpl
     13bbced:	83 a3 70 04 00 00 00 	and    DWORD PTR [rbx+0x470],0x0
     13bbcf4:	48 8d 05 cd bd 57 00 	lea    rax,[rip+0x57bdcd]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     13bbcfb:	48 89 83 78 04 00 00 	mov    QWORD PTR [rbx+0x478],rax
     13bbd02:	40 88 ab b8 04 00 00 	mov    BYTE PTR [rbx+0x4b8],bpl
     13bbd09:	0f 57 c0             	xorps  xmm0,xmm0
     13bbd0c:	0f 11 83 c0 04 00 00 	movups XMMWORD PTR [rbx+0x4c0],xmm0
     13bbd13:	0f 11 83 d0 04 00 00 	movups XMMWORD PTR [rbx+0x4d0],xmm0
     13bbd1a:	48 83 a3 e0 04 00 00 	and    QWORD PTR [rbx+0x4e0],0x0
     13bbd21:	00 
     13bbd22:	40 88 ab 88 04 00 00 	mov    BYTE PTR [rbx+0x488],bpl
     13bbd29:	48 83 a3 80 04 00 00 	and    QWORD PTR [rbx+0x480],0x0
     13bbd30:	00 
     13bbd31:	c6 83 e8 04 00 00 01 	mov    BYTE PTR [rbx+0x4e8],0x1
     13bbd38:	48 8b 83 20 04 00 00 	mov    rax,QWORD PTR [rbx+0x420]
     13bbd3f:	48 89 83 f0 04 00 00 	mov    QWORD PTR [rbx+0x4f0],rax
     13bbd46:	48 8d bb f8 04 00 00 	lea    rdi,[rbx+0x4f8]
     13bbd4d:	48 8d 35 30 bd fc fe 	lea    rsi,[rip+0xfffffffffefcbd30]        # 387a84 <_ZTSSt12bad_any_cast@@Base-0x8744>
     13bbd54:	4c 89 64 24 18       	mov    QWORD PTR [rsp+0x18],r12
     13bbd59:	e8 3c 65 15 00       	call   151229a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35781e>
     13bbd5e:	48 83 a3 08 05 00 00 	and    QWORD PTR [rbx+0x508],0x0
     13bbd65:	00 
     13bbd66:	8b 44 24 08          	mov    eax,DWORD PTR [rsp+0x8]
     13bbd6a:	88 83 10 05 00 00    	mov    BYTE PTR [rbx+0x510],al
     13bbd70:	48 83 a3 18 05 00 00 	and    QWORD PTR [rbx+0x518],0x0
     13bbd77:	00 
     13bbd78:	48 83 a3 28 05 00 00 	and    QWORD PTR [rbx+0x528],0x0
     13bbd7f:	00 
     13bbd80:	4c 8d b3 18 05 00 00 	lea    r14,[rbx+0x518]
     13bbd87:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     13bbd8b:	48 85 c0             	test   rax,rax

### Printable RIP-relative strings
- 0x13bbd4d -> 0x387a84: AudioDecompressorProcess

### Direct callers/jumpers of function entry
- 0x11c943a from 0x11c93ca..0x11c949e
- 0x13addbe from 0x13add12..0x13ade28

## Event callback table neighborhood around relocation 0x184c840

    000000000184c780  0000000000000008 R_X86_64_RELATIVE                         10a8ecc
    000000000184c788  0000000000000008 R_X86_64_RELATIVE                         10a8f66
    000000000184c790  0000000000000008 R_X86_64_RELATIVE                         10a8f84
    000000000184c798  0000000000000008 R_X86_64_RELATIVE                         10a913a
    000000000184c7a0  0000000000000008 R_X86_64_RELATIVE                         10a9298
    000000000184c7a8  0000000000000008 R_X86_64_RELATIVE                         10a92b6
    000000000184c7b0  0000000000000008 R_X86_64_RELATIVE                         10a92d4
    000000000184c7b8  0000000000000008 R_X86_64_RELATIVE                         10a92f2
    000000000184c7c0  0000000000000008 R_X86_64_RELATIVE                         10a9310
    000000000184c7c8  0000000000000008 R_X86_64_RELATIVE                         10a932e
    000000000184c7d0  0000000000000008 R_X86_64_RELATIVE                         10a934c
    000000000184c7d8  0000000000000008 R_X86_64_RELATIVE                         10a936a
    000000000184c7e0  0000000000000008 R_X86_64_RELATIVE                         10a9388
    000000000184c7e8  0000000000000008 R_X86_64_RELATIVE                         10a93a6
    000000000184c7f0  0000000000000008 R_X86_64_RELATIVE                         10a93c4
    000000000184c7f8  0000000000000008 R_X86_64_RELATIVE                         10a93dc
    000000000184c800  0000000000000008 R_X86_64_RELATIVE                         10a941c
    000000000184c808  0000000000000008 R_X86_64_RELATIVE                         10a9436
    000000000184c810  0000000000000008 R_X86_64_RELATIVE                         10a9566
    000000000184c818  0000000000000008 R_X86_64_RELATIVE                         10a9584
    000000000184c820  0000000000000008 R_X86_64_RELATIVE                         10a95a2
    000000000184c828  0000000000000008 R_X86_64_RELATIVE                         10a95c0
    000000000184c830  0000000000000008 R_X86_64_RELATIVE                         10a95de
    000000000184c838  0000000000000008 R_X86_64_RELATIVE                         10a95fc
    000000000184c840  0000000000000008 R_X86_64_RELATIVE                         10a9668
    000000000184c858  0000000000000008 R_X86_64_RELATIVE                         10a969c
    000000000184c860  0000000000000008 R_X86_64_RELATIVE                         10a96a6
    000000000184c868  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c870  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c878  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c880  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c888  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c890  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c898  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8a0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8a8  0000000000000008 R_X86_64_RELATIVE                         10a96b0
    000000000184c8b0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8b8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8c0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8c8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8d0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8d8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8e0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8f8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c900  0000000000000008 R_X86_64_RELATIVE                         a50370

## Relocations to candidate function regions


## Known authoritative consumer

0x10a7492: test ContextPlayer+0x598
0x10a74a0: test ContextPlayer+0x470
0x10a74ae: construct ad_disallow
0x10a74c2: insert into r14+0x14a0 = disallowSkippingNextReasons
