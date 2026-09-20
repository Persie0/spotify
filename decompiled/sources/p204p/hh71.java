package p204p;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class hh71 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final int f91300a;

    /* JADX INFO: renamed from: b */
    public final x10 f91301b;

    /* JADX INFO: renamed from: c */
    public long f91302c;

    public hh71(int i, x10 x10Var) {
        this.f91300a = i;
        this.f91301b = x10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f91300a;
        long j2 = jElapsedRealtime + j;
        if (j2 - this.f91302c < j) {
            return;
        }
        this.f91302c = j2;
        this.f91301b.invoke(view);
    }
}
