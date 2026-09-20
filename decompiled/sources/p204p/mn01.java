package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mn01 {

    /* JADX INFO: renamed from: a */
    public final String f145293a;

    /* JADX INFO: renamed from: b */
    public final String f145294b;

    public mn01(String str, String str2) {
        this.f145293a = str;
        this.f145294b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn01)) {
            return false;
        }
        mn01 mn01Var = (mn01) obj;
        return wj50.m88271j(this.f145293a, mn01Var.f145293a) && wj50.m88271j(this.f145294b, mn01Var.f145294b);
    }

    public final int hashCode() {
        int iHashCode = this.f145293a.hashCode() * 31;
        String str = this.f145294b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
