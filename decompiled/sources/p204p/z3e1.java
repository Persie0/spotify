package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z3e1 {

    /* JADX INFO: renamed from: a */
    public final String f278880a;

    /* JADX INFO: renamed from: b */
    public final String f278881b;

    /* JADX INFO: renamed from: c */
    public final String f278882c;

    public z3e1(String str, String str2, String str3) {
        this.f278880a = str;
        this.f278881b = str2;
        this.f278882c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3e1)) {
            return false;
        }
        z3e1 z3e1Var = (z3e1) obj;
        return wj50.m88271j(this.f278880a, z3e1Var.f278880a) && wj50.m88271j(this.f278881b, z3e1Var.f278881b) && wj50.m88271j(this.f278882c, z3e1Var.f278882c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f278880a.hashCode() * 31, 31, this.f278881b);
        String str = this.f278882c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
