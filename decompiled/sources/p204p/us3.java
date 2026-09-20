package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class us3 {

    /* JADX INFO: renamed from: a */
    public final String f233515a;

    /* JADX INFO: renamed from: b */
    public final String f233516b;

    public us3(String str, String str2) {
        this.f233515a = str;
        this.f233516b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m83877a() {
        return this.f233515a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us3)) {
            return false;
        }
        us3 us3Var = (us3) obj;
        return wj50.m88271j(this.f233515a, us3Var.f233515a) && wj50.m88271j(this.f233516b, us3Var.f233516b);
    }

    public final int hashCode() {
        int iHashCode = this.f233515a.hashCode() * 31;
        String str = this.f233516b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
