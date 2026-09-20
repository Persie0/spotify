package p204p;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: loaded from: classes3.dex */
public final class stj0 extends euj0 {

    /* JADX INFO: renamed from: e */
    public int[] f213922e = null;

    /* JADX INFO: renamed from: f */
    public MediaSessionCompat$Token f213923f;

    @Override // p204p.euj0
    /* JADX INFO: renamed from: b */
    public final void mo36987b(hr81 hr81Var) {
        Notification.Builder builder = (Notification.Builder) hr81Var.f94377d;
        if (Build.VERSION.SDK_INT >= 34) {
            dtj0.m36858d(builder, dtj0.m36856b(etj0.m39936a(dtj0.m36855a(), null, 0, null, Boolean.FALSE), this.f213922e, this.f213923f));
        } else {
            dtj0.m36858d(builder, dtj0.m36856b(dtj0.m36855a(), this.f213922e, this.f213923f));
        }
    }
}
