package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class uo51 implements cvb0 {

    /* JADX INFO: renamed from: a */
    public final Context f232335a;

    /* JADX INFO: renamed from: b */
    public final rq4 f232336b;

    public uo51(Context context, rq4 rq4Var) {
        this.f232335a = context;
        this.f232336b = rq4Var;
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: g */
    public final void mo25304g(ViewGroup viewGroup) {
        int i = this.f232336b.m76216i() ? 1 : 2;
        Context context = this.f232335a;
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.spotify.music.StsShareTargetActivity"), i, 1);
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: c */
    public final void mo25302c() {
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: d */
    public final void mo25303d() {
    }
}
