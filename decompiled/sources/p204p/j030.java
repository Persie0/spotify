package p204p;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j030 extends d19 {

    /* JADX INFO: renamed from: h */
    public int f107348h;

    @Override // p204p.xjx
    /* JADX INFO: renamed from: c */
    public final int mo28306c() {
        return this.f107348h;
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: j */
    public final Object mo28307j() {
        return null;
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: l */
    public final void mo28308l(long j, long j2, long j3, List list, nad0[] nad0VarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (mo34611a(this.f107348h, jElapsedRealtime)) {
            for (int i = this.f44199b - 1; i >= 0; i--) {
                if (!mo34611a(i, jElapsedRealtime)) {
                    this.f107348h = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: t */
    public final int mo28309t() {
        return 0;
    }
}
