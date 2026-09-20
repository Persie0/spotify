package com.spotify.playbacknative;

import android.media.AudioDeviceInfo;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, m24212d2 = {"getAddressFrom", "", "audioDeviceInfo", "Landroid/media/AudioDeviceInfo;", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 2, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AudioDeviceInfoFacadeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAddressFrom(AudioDeviceInfo audioDeviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return audioDeviceInfo.getAddress();
        }
        return null;
    }
}
