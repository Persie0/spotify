package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class efl0 extends mfl0 {

    /* JADX INFO: renamed from: a */
    public final String f59066a;

    /* JADX INFO: renamed from: b */
    public final boolean f59067b;

    public efl0(String str, boolean z) {
        this.f59066a = str;
        this.f59067b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efl0)) {
            return false;
        }
        efl0 efl0Var = (efl0) obj;
        return wj50.m88271j(this.f59066a, efl0Var.f59066a) && this.f59067b == efl0Var.f59067b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59067b) + (this.f59066a.hashCode() * 31);
    }
}
