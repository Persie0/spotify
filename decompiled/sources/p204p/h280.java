package p204p;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class h280 {
    public static final g280 Companion = new g280();

    /* JADX INFO: renamed from: a */
    public final String f86930a;

    /* JADX INFO: renamed from: b */
    public final String f86931b;

    /* JADX INFO: renamed from: c */
    public final int f86932c;

    /* JADX INFO: renamed from: d */
    public final String f86933d;

    public /* synthetic */ h280(int i, int i2, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, f280.f65130a.getDescriptor());
            throw null;
        }
        this.f86930a = str;
        this.f86931b = str2;
        this.f86932c = i2;
        if ((i & 8) == 0) {
            this.f86933d = "";
        } else {
            this.f86933d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h280)) {
            return false;
        }
        h280 h280Var = (h280) obj;
        return wj50.m88271j(this.f86930a, h280Var.f86930a) && wj50.m88271j(this.f86931b, h280Var.f86931b) && this.f86932c == h280Var.f86932c && wj50.m88271j(this.f86933d, h280Var.f86933d);
    }

    public final int hashCode() {
        return this.f86933d.hashCode() + mt60.m62800g(this.f86932c, s571.m77243b(this.f86930a.hashCode() * 31, 31, this.f86931b), 31);
    }

    public h280(String str, String str2, int i, String str3) {
        this.f86930a = str;
        this.f86931b = str2;
        this.f86932c = i;
        this.f86933d = str3;
    }
}
