package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zww0 extends xdf0 {

    /* JADX INFO: renamed from: c */
    public final Context f287109c;

    public zww0(Context context, int i, int i2) {
        super(i, i2);
        this.f287109c = context;
    }

    @Override // p204p.xdf0
    /* JADX INFO: renamed from: a */
    public final void mo25720a(u561 u561Var) {
        if (this.f260477b >= 10) {
            u561Var.mo82391V0(new Object[]{"reschedule_needed", 1});
        } else {
            this.f287109c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
