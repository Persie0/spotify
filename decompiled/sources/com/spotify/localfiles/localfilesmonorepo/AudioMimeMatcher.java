package com.spotify.localfiles.localfilesmonorepo;

import kotlin.Metadata;
import p204p.lnx0;
import p204p.o2d0;
import p204p.pnx0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m24212d2 = {"Lcom/spotify/localfiles/localfilesmonorepo/AudioMimeMatcher;", "Lp/o2d0;", "Lp/lnx0;", "<init>", "()V", "input", "", "match", "(Lp/lnx0;)Z", "", "description", "()Ljava/lang/String;", "src_main_java_com_spotify_localfiles_localfiles-android-localfiles"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AudioMimeMatcher implements o2d0 {
    public static final AudioMimeMatcher INSTANCE = new AudioMimeMatcher();

    private AudioMimeMatcher() {
    }

    @Override // p204p.o2d0
    public String description() {
        return "Audio MimeType matcher for Local Files";
    }

    @Override // p204p.o2d0
    public boolean match(lnx0 input) {
        return AudioMimeIntentChecker.INSTANCE.isAudioMimeIntent(((pnx0) input).f179540a);
    }
}
