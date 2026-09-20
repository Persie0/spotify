package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dk80 {

    /* JADX INFO: renamed from: d */
    public static final dk80 f49923d;

    /* JADX INFO: renamed from: a */
    public final float f49924a;

    /* JADX INFO: renamed from: b */
    public final int f49925b;

    /* JADX INFO: renamed from: c */
    public final int f49926c;

    static {
        float f = ak80.f16456b;
        f49923d = new dk80(17, 0, z96.m95640t());
    }

    public dk80(int i, int i2, float f) {
        this.f49924a = f;
        this.f49925b = i;
        this.f49926c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk80)) {
            return false;
        }
        dk80 dk80Var = (dk80) obj;
        float f = dk80Var.f49924a;
        float f2 = ak80.f16456b;
        return Float.compare(this.f49924a, f) == 0 && ck80.m33083b(this.f49925b, dk80Var.f49925b) && bk80.m29647b(this.f49926c, dk80Var.f49926c);
    }

    public final int hashCode() {
        float f = ak80.f16456b;
        return bk80.m29648c(this.f49926c) + ((ck80.m33084c(this.f49925b) + (Float.hashCode(this.f49924a) * 31)) * 31);
    }

    public final String toString() {
        return "LineHeightStyle(alignment=" + ((Object) ak80.m26201b(this.f49924a)) + ", trim=" + ((Object) ck80.m33085d(this.f49925b)) + ",mode=" + ((Object) bk80.m29649d(this.f49926c)) + ')';
    }
}
