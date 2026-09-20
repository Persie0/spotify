package p204p;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class b4p0 {
    /* JADX INFO: renamed from: a */
    public static Bundle m28099a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    /* JADX INFO: renamed from: b */
    public static void m28100b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
