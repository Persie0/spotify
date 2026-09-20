package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mib0 implements nib0 {

    /* JADX INFO: renamed from: a */
    public final long f143995a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof mib0)) {
            return false;
        }
        long j = ((mib0) obj).f143995a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f143995a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f143995a);
    }

    public final String toString() {
        return s571.m77251j("RoundRect(color=", n6f.m63771h(this.f143995a), ")");
    }
}
