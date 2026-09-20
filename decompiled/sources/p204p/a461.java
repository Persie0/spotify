package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a461 {

    /* JADX INFO: renamed from: a */
    public final String f12146a;

    /* JADX INFO: renamed from: b */
    public final String f12147b;

    public /* synthetic */ a461(String str) {
        this(str, null);
    }

    /* JADX INFO: renamed from: a */
    public final String m24669a() {
        return this.f12147b;
    }

    /* JADX INFO: renamed from: b */
    public final String m24670b() {
        return this.f12146a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a461)) {
            return false;
        }
        a461 a461Var = (a461) obj;
        return wj50.m88271j(this.f12146a, a461Var.f12146a) && wj50.m88271j(this.f12147b, a461Var.f12147b);
    }

    public final int hashCode() {
        int iHashCode = this.f12146a.hashCode() * 31;
        String str = this.f12147b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public a461(String str, String str2) {
        this.f12146a = str;
        this.f12147b = str2;
    }
}
