package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class y1r extends z1r {

    /* JADX INFO: renamed from: a */
    public final String f268374a;

    public y1r(String str) {
        this.f268374a = str;
    }

    @Override // p204p.z1r
    /* JADX INFO: renamed from: a */
    public final String mo89689a() {
        return this.f268374a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1r) && wj50.m88271j(this.f268374a, ((y1r) obj).f268374a);
    }

    public final int hashCode() {
        return this.f268374a.hashCode();
    }
}
