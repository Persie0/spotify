package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fid {

    /* JADX INFO: renamed from: a */
    public final String f69849a;

    public fid(String str) {
        this.f69849a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fid) && wj50.m88271j(this.f69849a, ((fid) obj).f69849a);
    }

    public final int hashCode() {
        return this.f69849a.hashCode();
    }
}
