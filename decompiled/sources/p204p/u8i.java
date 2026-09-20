package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final r8b1 f227953a;

    public u8i(r8b1 r8b1Var) {
        this.f227953a = r8b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8i) && wj50.m88271j(this.f227953a, ((u8i) obj).f227953a);
    }

    public final int hashCode() {
        return this.f227953a.hashCode();
    }
}
