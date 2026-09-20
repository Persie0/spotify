package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x001 implements z001 {

    /* JADX INFO: renamed from: a */
    public final vbc f256748a;

    public x001(vbc vbcVar) {
        this.f256748a = vbcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x001) && this.f256748a.equals(((x001) obj).f256748a);
    }

    public final int hashCode() {
        return (this.f256748a.hashCode() * 31) + 1155674821;
    }
}
