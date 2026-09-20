package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d79 {

    /* JADX INFO: renamed from: a */
    public final String f46046a;

    /* JADX INFO: renamed from: b */
    public final String f46047b;

    public d79(String str, String str2) {
        this.f46046a = str;
        this.f46047b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d79)) {
            return false;
        }
        d79 d79Var = (d79) obj;
        return wj50.m88271j(this.f46046a, d79Var.f46046a) && wj50.m88271j(this.f46047b, d79Var.f46047b);
    }

    public final int hashCode() {
        String str = this.f46046a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f46047b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
