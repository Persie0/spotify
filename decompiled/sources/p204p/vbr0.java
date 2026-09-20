package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vbr0 {

    /* JADX INFO: renamed from: a */
    public final String f239565a;

    /* JADX INFO: renamed from: b */
    public final String f239566b;

    /* JADX INFO: renamed from: c */
    public final String f239567c;

    public vbr0(String str, String str2, String str3) {
        this.f239565a = str;
        this.f239566b = str2;
        this.f239567c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbr0)) {
            return false;
        }
        vbr0 vbr0Var = (vbr0) obj;
        return wj50.m88271j(this.f239565a, vbr0Var.f239565a) && wj50.m88271j(this.f239566b, vbr0Var.f239566b) && wj50.m88271j(this.f239567c, vbr0Var.f239567c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f239565a.hashCode() * 31, 31, this.f239566b);
        String str = this.f239567c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
