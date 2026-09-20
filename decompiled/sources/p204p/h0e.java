package p204p;

/* JADX INFO: loaded from: classes.dex */
@rtz0
public final class h0e {
    public static final g0e Companion = new g0e();

    /* JADX INFO: renamed from: a */
    public final String f86257a;

    /* JADX INFO: renamed from: b */
    public final String f86258b;

    /* JADX INFO: renamed from: c */
    public final double f86259c;

    public /* synthetic */ h0e(int i, String str, String str2, double d) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, f0e.f64615a.getDescriptor());
            throw null;
        }
        this.f86257a = str;
        this.f86258b = str2;
        this.f86259c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0e)) {
            return false;
        }
        h0e h0eVar = (h0e) obj;
        return wj50.m88271j(this.f86257a, h0eVar.f86257a) && wj50.m88271j(this.f86258b, h0eVar.f86258b) && Double.compare(this.f86259c, h0eVar.f86259c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f86259c) + s571.m77243b(this.f86257a.hashCode() * 31, 31, this.f86258b);
    }

    public h0e(String str, double d) {
        this.f86257a = str;
        this.f86258b = "USD";
        this.f86259c = d;
    }
}
