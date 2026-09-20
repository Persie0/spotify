package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eac implements iac {

    /* JADX INFO: renamed from: a */
    public final vbc f57619a;

    public eac(vbc vbcVar) {
        this.f57619a = vbcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eac) && this.f57619a.equals(((eac) obj).f57619a);
    }

    public final int hashCode() {
        return (this.f57619a.hashCode() * 31) + 1155674821;
    }
}
