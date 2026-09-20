package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final haz0 f162815a;

    public o8i(haz0 haz0Var) {
        this.f162815a = haz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8i) && wj50.m88271j(this.f162815a, ((o8i) obj).f162815a);
    }

    public final int hashCode() {
        return this.f162815a.hashCode();
    }
}
