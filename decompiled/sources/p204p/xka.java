package p204p;

/* JADX INFO: loaded from: classes.dex */
public interface xka {

    /* JADX INFO: renamed from: a */
    public static final wka f262314a = wka.f252170a;

    /* JADX INFO: renamed from: a */
    default float mo83568a(float f, float f2, float f3) {
        f262314a.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
