package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xvo0 implements cwo0 {

    /* JADX INFO: renamed from: a */
    public final String f266441a;

    /* JADX INFO: renamed from: b */
    public final String f266442b;

    /* JADX INFO: renamed from: c */
    public final boolean f266443c;

    public xvo0(String str, String str2, boolean z) {
        this.f266441a = str;
        this.f266442b = str2;
        this.f266443c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvo0)) {
            return false;
        }
        xvo0 xvo0Var = (xvo0) obj;
        return wj50.m88271j(this.f266441a, xvo0Var.f266441a) && wj50.m88271j(this.f266442b, xvo0Var.f266442b) && this.f266443c == xvo0Var.f266443c;
    }

    public final int hashCode() {
        int iHashCode = this.f266441a.hashCode() * 31;
        String str = this.f266442b;
        return Boolean.hashCode(this.f266443c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
