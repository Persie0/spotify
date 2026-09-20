package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pxz implements sxz {

    /* JADX INFO: renamed from: a */
    public final String f183277a;

    public pxz(String str) {
        this.f183277a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxz) && wj50.m88271j(this.f183277a, ((pxz) obj).f183277a);
    }

    public final int hashCode() {
        return this.f183277a.hashCode();
    }
}
