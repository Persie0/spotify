package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y3v {

    /* JADX INFO: renamed from: a */
    public final int f268988a;

    /* JADX INFO: renamed from: b */
    public final String f268989b;

    public y3v(int i, String str) {
        this.f268988a = i;
        this.f268989b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3v)) {
            return false;
        }
        y3v y3vVar = (y3v) obj;
        return this.f268988a == y3vVar.f268988a && wj50.m88271j(this.f268989b, y3vVar.f268989b);
    }

    public final int hashCode() {
        return this.f268989b.hashCode() + (edb.m38547C(this.f268988a) * 31);
    }
}
