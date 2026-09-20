package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w3b1 {

    /* JADX INFO: renamed from: a */
    public final String f247544a;

    /* JADX INFO: renamed from: b */
    public final String f247545b;

    public w3b1(String str, String str2) {
        this.f247544a = str;
        this.f247545b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3b1)) {
            return false;
        }
        w3b1 w3b1Var = (w3b1) obj;
        return wj50.m88271j(this.f247544a, w3b1Var.f247544a) && wj50.m88271j(this.f247545b, w3b1Var.f247545b);
    }

    public final int hashCode() {
        int iHashCode = this.f247544a.hashCode() * 31;
        String str = this.f247545b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
