# TimelineConductor skip-ad operation semantics

Proven entry: dependency AP 0x1868200, virtual +0x68 -> 0x1371d90.

## Exact string VA 0x371518
- cstr: 'smartSkipEmbeddedPodcastAd'
- nearby 0x371398: ': %s'
- nearby 0x37139d: 'init_fetch'
- nearby 0x3713a8: 'applyUpdateFromBackend: invalid field ID %d or mismatched value type'
- nearby 0x3713ed: 'RowIds should not be set for Playlist set operations'
- nearby 0x371422: 'jam'
- nearby 0x371426: "Couldn't create rootlist!"
- nearby 0x371440: 'socialgraph-v4.proto'
- nearby 0x371455: 'mft/inject_filler_tracks/future'
- nearby 0x371475: 'requires_explicit_content_allowed'
- nearby 0x371497: 'media.start_position'
- nearby 0x3714ac: 'original_index<50'
- nearby 0x3714be: 'slice_start_ms'
- nearby 0x3714d0: 'age_assurance'
- nearby 0x3714de: 'lbnst'
- nearby 0x3714e4: '/v1/'
- nearby 0x3714e9: 'cpp-ads-podcast_ads_setup_impl'
- nearby 0x371508: ', new_timeline='
- nearby 0x371518: 'smartSkipEmbeddedPodcastAd'
- nearby 0x371533: 'conductor'
- nearby 0x37153d: 'Resume'
- nearby 0x371544: 'MediaResolutionTTS'
- nearby 0x371557: 'clip-ended'
- nearby 0x371562: 'onClipWillEnd'
- nearby 0x371570: ' (final)'
- nearby 0x371579: 'timeline_conductor::CosmosVideoProtocolDispatcher::handleState JSON error'
- nearby 0x3715c3: 'timeline_conductor::CosmosVideoProtocolDispatcher::handleSubscribe'
- nearby 0x371609: 'reporter'
- nearby 0x371612: 'media_clips'
- nearby 0x37161e: 'playbackError: %s (%d)'
- nearby 0x371635: 'stopPlayback'
- nearby 0x371642: 'setPaused'
- nearby 0x37164c: '(ZI)V'
- nearby 0x371652: 'pause_timer tried overwriting wanted_play_state %s with %s, current_pl'

## Exact string VA 0x34d976
- cstr: 'smart-skip-embedded-podcast-ad'
- nearby 0x34d7f6: 'rmer'
- nearby 0x34d7fb: 'EmptyFullListTransformer'
- nearby 0x34d814: 'cflt'
- nearby 0x34d819: 'collection.can_add'
- nearby 0x34d82c: 'speed_preview_'
- nearby 0x34d83b: "Failed to lookup URI for item_id '%s' when removing from collection"
- nearby 0x34d87f: 'Failed to set playlist member permission'
- nearby 0x34d8a8: 'playlist_load'
- nearby 0x34d8b9: 'playlist_find_request.proto'
- nearby 0x34d8d5: 'album_disc_number DESC,album_track_number,original_index'
- nearby 0x34d90e: 'is_trailer'
- nearby 0x34d919: 'feedback/v1/feedback/dislike?uri='
- nearby 0x34d93b: '/v2/playlist/'
- nearby 0x34d949: 'not_paused'
- nearby 0x34d954: 'ConductorImpl::skipToNextListItem'
- nearby 0x34d976: 'smart-skip-embedded-podcast-ad'
- nearby 0x34d995: '==> clip: %p %s'
- nearby 0x34d9a5: 'Stuck advancement event: reason=%s, active_clips=%zu, paused=%d, buffering=%d'
- nearby 0x34d9f3: 'timeline_conductor::CosmosVideo: stopAt'
- nearby 0x34da1b: 'timeline_conductor::CosmosVideo::stop video never started, invoking callback with nullopt'
- nearby 0x34da75: 'Missing or invalid playback id.'
- nearby 0x34da95: 'state_playback_id_mismatch'
- nearby 0x34dab0: 'slice_begin_ms'
- nearby 0x34dabf: 'buffer.data.size() % psl::kChannelCount == 0: '
- nearby 0x34daee: 'playback'

## Direct calls from +0x68 body
- 0x1371dc2 -> 0x137c2cc; FDE=(20431564, 20432409)
- 0x1371dd9 -> 0x1382d90; FDE=(20458896, 20458957)
- 0x1371e01 -> 0xb33de6; FDE=(11746790, 11746835)
- 0x1371e15 -> 0x1382e18; FDE=(20459032, 20459079)
- 0x1371e42 -> 0x1367944; FDE=(20347204, 20347227)
- 0x1371e57 -> 0x1393c2a; FDE=(20528170, 20528203)
- 0x1371e66 -> 0x13933de; FDE=(20526046, 20526124)
- 0x1371e82 -> 0xa7b836; FDE=(10991670, 10991695)
- 0x1371e95 -> 0x16c5428; FDE=(23876648, 23876671)
- 0x1371eb2 -> 0x13a1a4a; FDE=(20585034, 20585231)
- 0x1371ee5 -> 0x13a392c; FDE=(20592940, 20593137)
- 0x1371f05 -> 0x16c532e; FDE=(23876398, 23876425)
- 0x1371f0f -> 0xaa6d30; FDE=(11169072, 11169083)
- 0x1371f2b -> 0x137cb68; FDE=(20433768, 20436289)
- 0x1371f67 -> 0x1367944; FDE=(20347204, 20347227)
- 0x1371f7c -> 0x1382662; FDE=(20457058, 20457656)
- 0x1371fa0 -> 0x13825fa; FDE=(20456954, 20457057)
- 0x1371fad -> 0x136795c; FDE=(20347228, 20347262)
- 0x1371fb7 -> 0xa9e7cc; FDE=(11134924, 11134946)
- 0x1371fce -> 0x136795c; FDE=(20347228, 20347262)
- 0x1371fe2 -> 0x16c532e; FDE=(23876398, 23876425)
- 0x1371ff1 -> 0xaa6d30; FDE=(11169072, 11169083)
- 0x1372000 -> 0xa9e7cc; FDE=(11134924, 11134946)
- 0x1372016 -> 0x1382e18; FDE=(20459032, 20459079)
- 0x1372031 -> 0xa6fcd0; FDE=(10943696, 10943824)
- 0x1372036 -> 0x17efab0; FDE=None

## All literal strings referenced by +0x68 and one-hop callees
### function/FDE containing 0xa6fcd0: (10943696, 10943824)
- xref 0xa6fd24 -> 0x32693a: 'libunwind: %s - %s\n'
- xref 0xa6fd2b -> 0x37c2c2: '_Unwind_Resume'
- xref 0xa6fd32 -> 0x3340bd: "_Unwind_Resume() can't return"

### function/FDE containing 0x1371d90: (20389264, 20389947)
- xref 0x1371db1 -> 0x371518: 'smartSkipEmbeddedPodcastAd'
- xref 0x1371f88 -> 0x34d976: 'smart-skip-embedded-podcast-ad'

### function/FDE containing 0x137c2cc: (20431564, 20432409)
- xref 0x137c32d -> 0x3614ac: ' -> '
- xref 0x137c36d -> 0x3533ba: 'Conductor observer callbacks must not synchronously mutate the Conductor'
- xref 0x137c37b -> 0x3878f4: 'Conductor observer contract violation: %.*s: %.*s'
- xref 0x137c3d3 -> 0x37f220: ': '
- xref 0x137c465 -> 0x32c00b: 'observer_contract_violation'

### function/FDE containing 0x137cb68: (20433768, 20436289)
- xref 0x137cc8d -> 0x325204: 'Seeking to position: %lldms'
- xref 0x137cd42 -> 0x32c047: 'Seeking by playing clip %s with start offset'
- xref 0x137cdcd -> 0x38420f: 'Seeking within current clip'
- xref 0x137cf11 -> 0x9d7de0: "b'\\xc3\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\xcc\\x83\\x7f\\x08'"

## +0x68 control-flow semantic anchors
 1371dc7:	48 8d b3 b8 09 00 00 	lea    rsi,[rbx+0x9b8]
 1371dde:	48 8b b3 40 02 00 00 	mov    rsi,QWORD PTR [rbx+0x240]
 1371ea5:	48 8b bb 08 0b 00 00 	mov    rdi,QWORD PTR [rbx+0xb08]
 1371ed3:	48 8b bb 10 0b 00 00 	mov    rdi,QWORD PTR [rbx+0xb10]
 1371f30:	4c 8b b3 d0 00 00 00 	mov    r14,QWORD PTR [rbx+0xd0]

## Exact "skip-ad" literal occurrences and native code xrefs
- literal file+0x34708a, VA=0x34708a
  - xref 0xfd3857; FDE=(16594970, 16595158): lea    rsi,[rip+0xffffffffff37382c]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
  - xref 0xfd3908; FDE=(16595158, 16595387): lea    rdi,[rip+0xffffffffff37377b]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
  - xref 0x12044d8; FDE=(18891288, 18894558): lea    rsi,[rip+0xffffffffff142bab]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
