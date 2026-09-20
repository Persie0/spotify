package p204p;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;

/* JADX INFO: loaded from: classes3.dex */
public final class ghs implements ihs {
    @Override // p204p.ihs
    /* JADX INFO: renamed from: c */
    public final int mo44756c(r300 r300Var) {
        return r300Var.f195391t != null ? 1 : 0;
    }

    @Override // p204p.ihs
    /* JADX INFO: renamed from: e */
    public final bhs mo44758e(ehs ehsVar, r300 r300Var) {
        if (r300Var.f195391t == null) {
            return null;
        }
        return new vgw(new DrmSession$DrmSessionException(6001, new UnsupportedDrmException()));
    }

    @Override // p204p.ihs
    /* JADX INFO: renamed from: d */
    public final void mo44757d(Looper looper, w9p0 w9p0Var) {
    }
}
