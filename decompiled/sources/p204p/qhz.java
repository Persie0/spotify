package p204p;

/* JADX INFO: loaded from: classes.dex */
public interface qhz extends n05 {
    @Override // p204p.n05
    /* JADX INFO: renamed from: a */
    default g5b1 mo31113a(tm91 tm91Var) {
        return new dc31(this);
    }

    /* JADX INFO: renamed from: b */
    float mo26119b(float f, float f2, float f3, long j);

    /* JADX INFO: renamed from: c */
    default float mo26120c(float f, float f2, float f3) {
        return mo26119b(f, f2, f3, mo26121d(f, f2, f3));
    }

    /* JADX INFO: renamed from: d */
    long mo26121d(float f, float f2, float f3);

    /* JADX INFO: renamed from: e */
    float mo26122e(float f, float f2, float f3, long j);
}
