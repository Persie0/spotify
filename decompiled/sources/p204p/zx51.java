package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes5.dex */
public final class zx51 {

    /* JADX INFO: renamed from: a */
    public final Activity f287219a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f287220b;

    /* JADX INFO: renamed from: c */
    public final k5m0 f287221c;

    public zx51(Activity activity, z9j0 z9j0Var, k5m0 k5m0Var) {
        this.f287219a = activity;
        this.f287220b = z9j0Var;
        this.f287221c = k5m0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m97166a() {
        p6j0 p6j0Var = new p6j0("spotify:nowplaying:video-settings:subtitles", "", false, false, 0, 0, false, null, null, null);
        Activity activity = this.f287219a;
        z9j0 z9j0Var = this.f287220b;
        if (z9j0Var.mo47349j(activity)) {
            z9j0Var.mo63651f(p6j0Var);
        } else {
            k5m0.m55541i(this.f287221c, "spotify:nowplaying:video-settings:subtitles", null, null, false, 14);
        }
    }
}
