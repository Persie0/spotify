package p204p;

import android.R;
import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public final class g5j0 {

    /* JADX INFO: renamed from: a */
    public final voc1 f76689a;

    /* JADX INFO: renamed from: b */
    public final Activity f76690b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f76691c;

    /* JADX INFO: renamed from: d */
    public final dd41 f76692d;

    /* JADX INFO: renamed from: e */
    public final uc3 f76693e;

    /* JADX INFO: renamed from: f */
    public final bbl f76694f;

    /* JADX INFO: renamed from: g */
    public final Bundle f76695g;

    public g5j0(voc1 voc1Var, Activity activity, z9j0 z9j0Var, dd41 dd41Var, uc3 uc3Var, bbl bblVar) {
        this.f76689a = voc1Var;
        this.f76690b = activity;
        this.f76691c = z9j0Var;
        this.f76692d = dd41Var;
        this.f76693e = uc3Var;
        this.f76694f = bblVar;
        this.f76695g = ActivityOptions.makeCustomAnimation(activity, R.anim.fade_in, R.anim.fade_out).toBundle();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m43611a() {
        return !this.f76690b.isDestroyed();
    }
}
