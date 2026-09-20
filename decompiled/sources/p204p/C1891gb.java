package p204p;

/* JADX INFO: renamed from: p.gb */
/* JADX INFO: loaded from: classes8.dex */
public final class C1891gb {

    /* JADX INFO: renamed from: a */
    public final String f78157a;

    /* JADX INFO: renamed from: b */
    public final int f78158b;

    public C1891gb(String str, int i) {
        this.f78157a = str;
        this.f78158b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1891gb)) {
            return false;
        }
        C1891gb c1891gb = (C1891gb) obj;
        return wj50.m88271j(this.f78157a, c1891gb.f78157a) && this.f78158b == c1891gb.f78158b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f78158b) + (this.f78157a.hashCode() * 31);
    }
}
