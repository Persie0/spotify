package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hrl implements jrl {

    /* JADX INFO: renamed from: a */
    public final drl f94449a;

    /* JADX INFO: renamed from: b */
    public final String f94450b;

    /* JADX INFO: renamed from: c */
    public final int f94451c;

    public hrl(drl drlVar, String str, int i) {
        this.f94449a = drlVar;
        this.f94450b = str;
        this.f94451c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrl)) {
            return false;
        }
        hrl hrlVar = (hrl) obj;
        return wj50.m88271j(this.f94449a, hrlVar.f94449a) && wj50.m88271j(this.f94450b, hrlVar.f94450b) && this.f94451c == hrlVar.f94451c;
    }

    public final int hashCode() {
        int iHashCode = this.f94449a.hashCode() * 31;
        String str = this.f94450b;
        return edb.m38547C(this.f94451c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
