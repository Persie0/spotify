package p204p;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zvd1 {

    /* JADX INFO: renamed from: a */
    public final int f286690a;

    /* JADX INFO: renamed from: b */
    public float f286691b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f286692c;

    /* JADX INFO: renamed from: d */
    public final long f286693d;

    public zvd1(int i, Interpolator interpolator, long j) {
        this.f286690a = i;
        this.f286692c = interpolator;
        this.f286693d = j;
    }

    /* JADX INFO: renamed from: a */
    public float mo94688a() {
        return 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public long mo94689b() {
        return this.f286693d;
    }

    /* JADX INFO: renamed from: c */
    public float mo94690c() {
        Interpolator interpolator = this.f286692c;
        return interpolator != null ? interpolator.getInterpolation(this.f286691b) : this.f286691b;
    }

    /* JADX INFO: renamed from: d */
    public int mo94691d() {
        return this.f286690a;
    }

    /* JADX INFO: renamed from: e */
    public void mo94692e(float f) {
        this.f286691b = f;
    }
}
