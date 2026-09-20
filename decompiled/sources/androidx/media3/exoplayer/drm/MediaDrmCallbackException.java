package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import p204p.sjo;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: a */
    public final sjo f993a;

    /* JADX INFO: renamed from: b */
    public final Uri f994b;

    /* JADX INFO: renamed from: c */
    public final Map f995c;

    /* JADX INFO: renamed from: d */
    public final long f996d;

    public MediaDrmCallbackException(sjo sjoVar, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.f993a = sjoVar;
        this.f994b = uri;
        this.f995c = map;
        this.f996d = j;
    }
}
