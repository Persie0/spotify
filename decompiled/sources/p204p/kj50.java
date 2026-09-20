package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kj50 {

    /* JADX INFO: renamed from: a */
    public final int f123247a;

    /* JADX INFO: renamed from: b */
    public final int f123248b;

    /* JADX INFO: renamed from: c */
    public final Object f123249c;

    public kj50(int i, int i2, Object obj) {
        this.f123247a = i;
        this.f123248b = i2;
        this.f123249c = obj;
        if (i < 0) {
            pt40.m70891a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        pt40.m70891a("size should be > 0");
    }
}
