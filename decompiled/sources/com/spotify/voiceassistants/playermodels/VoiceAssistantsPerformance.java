package com.spotify.voiceassistants.playermodels;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/VoiceAssistantsPerformance;", "", "<init>", "()V", "PERFORMANCE_CATEGORY_PLAY_URI", "", "PERFORMANCE_CALLING_PACKAGE_KEY", "PERFORMANCE_PLAY_URI_KEY", "MEASURE_PREPARE_URI", "MEASURE_PLAY_URI", "MEASURE_SWITCH_TO_LOCAL", "MEASURE_DETECT_LOGIN", "MEASURE_PLAY_COMMAND", "MEASURE_NETWORK_SPEAKEASY", "MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START", "MEASURE_POLL_AND_PLAY_PLAYER_START_TO_PLAYBACK_STARTED", "DIMENSION_NL_URI", "DIMENSION_VOICE_CONNECT_FLOW", "DIMENSION_PREPARED", "DIMENSION_REQUIRES_POLLING", "METADATA_POLLING_RETRY_COUNT", "DIMENSION_OUTCOME", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VoiceAssistantsPerformance {
    public static final String DIMENSION_NL_URI = "is-nl-uri";
    public static final String DIMENSION_OUTCOME = "outcome";
    public static final String DIMENSION_PREPARED = "is-prepared";
    public static final String DIMENSION_REQUIRES_POLLING = "requires_polling";
    public static final String DIMENSION_VOICE_CONNECT_FLOW = "is-voice-connect-flow";
    public static final VoiceAssistantsPerformance INSTANCE = new VoiceAssistantsPerformance();
    public static final String MEASURE_DETECT_LOGIN = "detect-login";
    public static final String MEASURE_NETWORK_SPEAKEASY = "network-speakeasy";
    public static final String MEASURE_PLAY_COMMAND = "play-command";
    public static final String MEASURE_PLAY_URI = "play-uri";
    public static final String MEASURE_POLL_AND_PLAY_COMMAND_TO_PLAYER_START = "command_to_player_start";
    public static final String MEASURE_POLL_AND_PLAY_PLAYER_START_TO_PLAYBACK_STARTED = "player_start_to_playback_started";
    public static final String MEASURE_PREPARE_URI = "prepare-uri";
    public static final String MEASURE_SWITCH_TO_LOCAL = "switch-to-local";
    public static final String METADATA_POLLING_RETRY_COUNT = "retry_count";
    public static final String PERFORMANCE_CALLING_PACKAGE_KEY = "calling-package";
    public static final String PERFORMANCE_CATEGORY_PLAY_URI = "voice-assistants-play-uri-performance";
    public static final String PERFORMANCE_PLAY_URI_KEY = "input-play-uri";

    private VoiceAssistantsPerformance() {
    }
}
