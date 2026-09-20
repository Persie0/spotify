package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ub91 {

    /* JADX INFO: renamed from: a */
    public final String f228660a;

    /* JADX INFO: renamed from: b */
    public final String f228661b;

    /* JADX INFO: renamed from: c */
    public final String f228662c;

    public ub91(String str, String str2, String str3) {
        this.f228660a = str;
        this.f228661b = str2;
        this.f228662c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub91)) {
            return false;
        }
        ub91 ub91Var = (ub91) obj;
        return wj50.m88271j(this.f228660a, ub91Var.f228660a) && wj50.m88271j(this.f228661b, ub91Var.f228661b) && wj50.m88271j(this.f228662c, ub91Var.f228662c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f228660a.hashCode() * 31, 31, this.f228661b);
        String str = this.f228662c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
