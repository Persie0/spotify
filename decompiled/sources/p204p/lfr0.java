package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lfr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f132999a;

    /* JADX INFO: renamed from: b */
    public final r6m0 f133000b;

    /* JADX INFO: renamed from: c */
    public final String f133001c;

    /* JADX INFO: renamed from: d */
    public final boolean f133002d;

    public lfr0(boolean z, r6m0 r6m0Var, String str, boolean z2) {
        this.f132999a = z;
        this.f133000b = r6m0Var;
        this.f133001c = str;
        this.f133002d = z2;
    }

    /* JADX INFO: renamed from: a */
    public static lfr0 m58915a(lfr0 lfr0Var, boolean z, r6m0 r6m0Var, String str, int i) {
        if ((i & 1) != 0) {
            z = lfr0Var.f132999a;
        }
        if ((i & 2) != 0) {
            r6m0Var = lfr0Var.f133000b;
        }
        if ((i & 4) != 0) {
            str = lfr0Var.f133001c;
        }
        boolean z2 = (i & 8) != 0 ? lfr0Var.f133002d : true;
        lfr0Var.getClass();
        return new lfr0(z, r6m0Var, str, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfr0)) {
            return false;
        }
        lfr0 lfr0Var = (lfr0) obj;
        return this.f132999a == lfr0Var.f132999a && this.f133000b == lfr0Var.f133000b && wj50.m88271j(this.f133001c, lfr0Var.f133001c) && this.f133002d == lfr0Var.f133002d;
    }

    public final int hashCode() {
        int iHashCode = (this.f133000b.hashCode() + (Boolean.hashCode(this.f132999a) * 31)) * 31;
        String str = this.f133001c;
        return Boolean.hashCode(this.f133002d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
