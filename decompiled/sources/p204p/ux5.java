package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ux5 {

    /* JADX INFO: renamed from: a */
    public final String f234824a;

    /* JADX INFO: renamed from: b */
    public final String f234825b;

    /* JADX INFO: renamed from: c */
    public final String f234826c;

    public ux5(String str, String str2, String str3) {
        this.f234824a = str;
        this.f234825b = str2;
        this.f234826c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux5)) {
            return false;
        }
        ux5 ux5Var = (ux5) obj;
        return wj50.m88271j(this.f234824a, ux5Var.f234824a) && wj50.m88271j(this.f234825b, ux5Var.f234825b) && wj50.m88271j(this.f234826c, ux5Var.f234826c);
    }

    public final int hashCode() {
        String str = this.f234824a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f234825b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f234826c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
