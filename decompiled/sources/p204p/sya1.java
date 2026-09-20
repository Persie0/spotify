package p204p;

/* JADX INFO: loaded from: classes8.dex */
@rtz0
public final class sya1 {
    public static final rya1 Companion = new rya1();

    /* JADX INFO: renamed from: a */
    public final boolean f215202a;

    /* JADX INFO: renamed from: b */
    public final String f215203b;

    public /* synthetic */ sya1(String str, int i, boolean z) {
        if (1 != (i & 1)) {
            edo.m38617p(i, 1, qya1.f193861a.getDescriptor());
            throw null;
        }
        this.f215202a = z;
        if ((i & 2) == 0) {
            this.f215203b = null;
        } else {
            this.f215203b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sya1)) {
            return false;
        }
        sya1 sya1Var = (sya1) obj;
        return this.f215202a == sya1Var.f215202a && wj50.m88271j(this.f215203b, sya1Var.f215203b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f215202a) * 31;
        String str = this.f215203b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
