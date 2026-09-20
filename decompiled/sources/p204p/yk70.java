package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yk70 implements al70 {

    /* JADX INFO: renamed from: a */
    public final String f273620a;

    /* JADX INFO: renamed from: b */
    public final String f273621b;

    /* JADX INFO: renamed from: c */
    public final Double f273622c;

    /* JADX INFO: renamed from: d */
    public final String f273623d;

    public yk70(String str, String str2, Double d, String str3) {
        this.f273620a = str;
        this.f273621b = str2;
        this.f273622c = d;
        this.f273623d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk70)) {
            return false;
        }
        yk70 yk70Var = (yk70) obj;
        return wj50.m88271j(this.f273620a, yk70Var.f273620a) && wj50.m88271j(this.f273621b, yk70Var.f273621b) && wj50.m88271j(this.f273622c, yk70Var.f273622c) && wj50.m88271j(this.f273623d, yk70Var.f273623d);
    }

    public final int hashCode() {
        int iHashCode = this.f273620a.hashCode() * 31;
        String str = this.f273621b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f273622c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f273623d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
