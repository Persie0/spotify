package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class h5r {

    /* JADX INFO: renamed from: a */
    public final String f87888a;

    /* JADX INFO: renamed from: b */
    public final int f87889b;

    public h5r(String str, int i) {
        this.f87888a = str;
        this.f87889b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5r)) {
            return false;
        }
        h5r h5rVar = (h5r) obj;
        return wj50.m88271j(this.f87888a, h5rVar.f87888a) && this.f87889b == h5rVar.f87889b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f87889b) + (this.f87888a.hashCode() * 31);
    }
}
