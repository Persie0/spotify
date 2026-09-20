package p204p;

import android.content.Context;
import android.media.session.MediaSession;

/* JADX INFO: loaded from: classes.dex */
public final class mod0 extends lod0 {
    public mod0(MediaSession mediaSession) {
        super(mediaSession);
        this.f114397e = mediaSession.getController().getSessionInfo();
    }

    @Override // p204p.jod0
    /* JADX INFO: renamed from: a */
    public final MediaSession mo53880a(Context context, String str) {
        return ap4.m26638g(context, str);
    }
}
