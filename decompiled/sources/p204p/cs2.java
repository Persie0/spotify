package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cs2 extends ds2 {

    /* JADX INFO: renamed from: a */
    public final String f41444a;

    public cs2(String str) {
        this.f41444a = str;
    }

    @Override // p204p.ds2
    /* JADX INFO: renamed from: a */
    public final String mo30342a() {
        return this.f41444a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cs2) && wj50.m88271j(this.f41444a, ((cs2) obj).f41444a);
    }

    public final int hashCode() {
        return this.f41444a.hashCode();
    }
}
