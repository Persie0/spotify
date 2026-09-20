package p204p;

import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;

/* JADX INFO: loaded from: classes8.dex */
public final class jyo0 {

    /* JADX INFO: renamed from: a */
    public final int f117449a;

    /* JADX INFO: renamed from: b */
    public final String f117450b;

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0183  */
    public jyo0(PlayerError playerError, boolean z) {
        int i;
        if (playerError.error() == ErrorType.PLAYBACK_REPORTING_ERROR) {
            i = 35;
        } else if (playerError.error() == ErrorType.TOGGLE_SHUFFLE_RESTRICTED) {
            i = z ? 38 : 16;
        } else if (playerError.error() == ErrorType.ONE_TRACK_UNPLAYABLE_AUTO_STOPPED) {
            if (playerError.reasons().equals("user_capping_reached")) {
                i = 14;
            } else if (playerError.reasons().equals("not_available")) {
                i = 3;
            } else if (playerError.reasons().equals("user_streaming_disallowed")) {
                i = 2;
            } else if (playerError.reasons().equals("age_restriction_filtered")) {
                i = 32;
            } else if (playerError.reasons().equals("explicit_content_filtered")) {
                i = 29;
            } else if (playerError.reasons().equals("local_file_not_found")) {
                i = 36;
            } else {
                i = 99;
            }
        } else if (playerError.error() == ErrorType.SKIP_TO_NEXT_RESTRICTED && playerError.reasons().equals("mft_disallow")) {
            i = 15;
        } else if (playerError.error() == ErrorType.ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED) {
            if (playerError.reasons().contains("not_available_offline")) {
                if (z) {
                    i = 3;
                } else {
                    i = 17;
                }
            } else if (playerError.reasons().contains("age_restriction_filtered")) {
                i = 33;
            } else if (playerError.reasons().contains("explicit_content_filtered")) {
                i = 30;
            } else if (playerError.reasons().contains("banned_by_user")) {
                i = 31;
            } else if (z) {
                i = 6;
            } else {
                i = 2;
            }
        } else if (playerError.error() == ErrorType.VIDEO_PLAYBACK_ERROR) {
            i = 20;
        } else if (playerError.error() == ErrorType.VIDEO_GEORESTRICTED) {
            i = 21;
        } else if (playerError.error() == ErrorType.VIDEO_UNSUPPORTED_PLATFORM_VERSION) {
            i = 22;
        } else if (playerError.error() == ErrorType.VIDEO_UNSUPPORTED_CLIENT_VERSION) {
            i = 23;
        } else if (playerError.error() == ErrorType.VIDEO_MANIFEST_DELETED) {
            i = 24;
        } else if (playerError.error() == ErrorType.VIDEO_COUNTRY_RESTRICTED) {
            i = 26;
        } else if (playerError.error() == ErrorType.VIDEO_UNAVAILABLE) {
            i = 27;
        } else if (playerError.error() == ErrorType.VIDEO_CATALOGUE_RESTRICTED) {
            i = 28;
        } else if (playerError.error() == ErrorType.PLAY_RESTRICTED && playerError.reasons().equals("gaia.content_not_supported")) {
            i = 25;
        } else if (playerError.error() == ErrorType.TIMEOUT) {
            i = 37;
        } else if (playerError.error() == ErrorType.PLAYBACK_ERROR && "playback_error_ad_detection_failed".equals(playerError.reasons())) {
            i = 39;
        } else {
            i = 99;
        }
        this.f117449a = i;
        this.f117450b = i == 33 ? playerError.contextUri() : playerError.trackUri();
    }
}
