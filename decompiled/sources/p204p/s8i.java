package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final o8b1 f206650a;

    public s8i(o8b1 o8b1Var) {
        this.f206650a = o8b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8i) && wj50.m88271j(this.f206650a, ((s8i) obj).f206650a);
    }

    public final int hashCode() {
        return this.f206650a.hashCode();
    }
}
