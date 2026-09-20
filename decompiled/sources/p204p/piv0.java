package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class piv0 {

    /* JADX INFO: renamed from: a */
    public final String f178066a;

    /* JADX INFO: renamed from: b */
    public final String f178067b;

    /* JADX INFO: renamed from: c */
    public final q76 f178068c;

    public piv0(String str, String str2, q76 q76Var) {
        this.f178066a = str;
        this.f178067b = str2;
        this.f178068c = q76Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof piv0)) {
            return false;
        }
        piv0 piv0Var = (piv0) obj;
        return this.f178066a.equals(piv0Var.f178066a) && this.f178067b.equals(piv0Var.f178067b) && wj50.m88271j(this.f178068c, piv0Var.f178068c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f178066a.hashCode() * 31, 31, this.f178067b);
        q76 q76Var = this.f178068c;
        return (iM77243b + (q76Var == null ? 0 : q76Var.hashCode())) * 31;
    }
}
