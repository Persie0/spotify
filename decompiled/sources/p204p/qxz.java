package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qxz implements sxz {

    /* JADX INFO: renamed from: a */
    public final String f193766a;

    public qxz(String str) {
        this.f193766a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxz) && wj50.m88271j(this.f193766a, ((qxz) obj).f193766a);
    }

    public final int hashCode() {
        return this.f193766a.hashCode();
    }
}
