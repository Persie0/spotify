package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nh5 {

    /* JADX INFO: renamed from: a */
    public final String f153877a;

    /* JADX INFO: renamed from: b */
    public final String f153878b;

    public nh5(String str, String str2) {
        this.f153877a = str;
        this.f153878b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh5)) {
            return false;
        }
        nh5 nh5Var = (nh5) obj;
        return wj50.m88271j(this.f153877a, nh5Var.f153877a) && wj50.m88271j(this.f153878b, nh5Var.f153878b);
    }

    public final int hashCode() {
        int iHashCode = this.f153877a.hashCode() * 31;
        String str = this.f153878b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
