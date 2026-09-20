package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final o8b1 f218086a;

    public t8i(o8b1 o8b1Var) {
        this.f218086a = o8b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8i) && wj50.m88271j(this.f218086a, ((t8i) obj).f218086a);
    }

    public final int hashCode() {
        return this.f218086a.hashCode();
    }
}
