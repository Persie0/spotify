package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class di81 extends ii81 {

    /* JADX INFO: renamed from: a */
    public final String f49276a;

    /* JADX INFO: renamed from: b */
    public final int f49277b;

    /* JADX INFO: renamed from: c */
    public final String f49278c;

    public di81(String str, int i, String str2) {
        this.f49276a = str;
        this.f49277b = i;
        this.f49278c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di81)) {
            return false;
        }
        di81 di81Var = (di81) obj;
        return wj50.m88271j(this.f49276a, di81Var.f49276a) && this.f49277b == di81Var.f49277b && wj50.m88271j(this.f49278c, di81Var.f49278c);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f49277b, this.f49276a.hashCode() * 31, 31);
        String str = this.f49278c;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }
}
