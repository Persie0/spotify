package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final zei f130874a;

    public l8i(zei zeiVar) {
        this.f130874a = zeiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l8i) && wj50.m88271j(this.f130874a, ((l8i) obj).f130874a);
    }

    public final int hashCode() {
        return this.f130874a.hashCode();
    }
}
