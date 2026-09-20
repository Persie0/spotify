package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cgt implements xmt {

    /* JADX INFO: renamed from: a */
    public final String f37787a;

    /* JADX INFO: renamed from: b */
    public final String f37788b;

    public cgt(String str, String str2) {
        this.f37787a = str;
        this.f37788b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgt)) {
            return false;
        }
        cgt cgtVar = (cgt) obj;
        return wj50.m88271j(this.f37787a, cgtVar.f37787a) && wj50.m88271j(this.f37788b, cgtVar.f37788b);
    }

    public final int hashCode() {
        return this.f37788b.hashCode() + (this.f37787a.hashCode() * 31);
    }
}
