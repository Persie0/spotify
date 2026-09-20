package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class c26 {

    /* JADX INFO: renamed from: a */
    public final String f33301a;

    /* JADX INFO: renamed from: b */
    public final String f33302b;

    public c26(String str, String str2) {
        this.f33301a = str;
        this.f33302b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c26)) {
            return false;
        }
        c26 c26Var = (c26) obj;
        return wj50.m88271j(this.f33301a, c26Var.f33301a) && wj50.m88271j(this.f33302b, c26Var.f33302b);
    }

    public final int hashCode() {
        int iHashCode = this.f33301a.hashCode() * 31;
        String str = this.f33302b;
        return Boolean.hashCode(false) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
