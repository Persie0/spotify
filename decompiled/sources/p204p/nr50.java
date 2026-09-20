package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nr50 {

    /* JADX INFO: renamed from: a */
    public final boolean f157447a;

    /* JADX INFO: renamed from: b */
    public final Boolean f157448b;

    public /* synthetic */ nr50() {
        this(true, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr50)) {
            return false;
        }
        nr50 nr50Var = (nr50) obj;
        return this.f157447a == nr50Var.f157447a && wj50.m88271j(this.f157448b, nr50Var.f157448b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f157447a) * 31;
        Boolean bool = this.f157448b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public nr50(boolean z, Boolean bool) {
        this.f157447a = z;
        this.f157448b = bool;
    }
}
