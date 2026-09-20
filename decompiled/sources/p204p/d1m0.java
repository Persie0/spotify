package p204p;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public interface d1m0 {

    /* JADX INFO: renamed from: a */
    public static final Pair f44316a;

    /* JADX INFO: renamed from: b */
    public static final Pair f44317b;

    /* JADX INFO: renamed from: c */
    public static final Pair f44318c;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        f44316a = Pair.create(fValueOf, fValueOf);
        f44317b = Pair.create(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(1.0f);
        f44318c = Pair.create(fValueOf2, fValueOf2);
    }

    /* JADX INFO: renamed from: a */
    default Pair mo34660a() {
        return f44318c;
    }

    /* JADX INFO: renamed from: b */
    default float mo34661b() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    default Pair mo34662c() {
        return f44316a;
    }

    /* JADX INFO: renamed from: d */
    default Pair mo34663d() {
        return f44317b;
    }
}
