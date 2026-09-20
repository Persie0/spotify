package com.spotify.localfiles.localfilesmonorepo;

import android.content.Intent;
import kotlin.Metadata;
import p204p.bm51;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/localfiles/localfilesmonorepo/AudioMimeIntentChecker;", "", "<init>", "()V", "isAudioMimeIntent", "", "intent", "Landroid/content/Intent;", "src_main_java_com_spotify_localfiles_localfiles-android-localfiles"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AudioMimeIntentChecker {
    public static final AudioMimeIntentChecker INSTANCE = new AudioMimeIntentChecker();

    private AudioMimeIntentChecker() {
    }

    public final boolean isAudioMimeIntent(Intent intent) {
        String type;
        return (intent.getFlags() & 1048576) == 0 && wj50.m88271j(intent.getAction(), "android.intent.action.VIEW") && (type = intent.getType()) != null && bm51.m29803n0(type, "audio/", false);
    }
}
