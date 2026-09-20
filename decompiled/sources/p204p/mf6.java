package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mf6 {

    /* JADX INFO: renamed from: a */
    public final String f142966a;

    /* JADX INFO: renamed from: b */
    public final String f142967b;

    public mf6(String str, String str2) {
        this.f142966a = str;
        this.f142967b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf6)) {
            return false;
        }
        mf6 mf6Var = (mf6) obj;
        return wj50.m88271j(this.f142966a, mf6Var.f142966a) && wj50.m88271j(this.f142967b, mf6Var.f142967b);
    }

    public final int hashCode() {
        int iHashCode = this.f142966a.hashCode() * 31;
        String str = this.f142967b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
