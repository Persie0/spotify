package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class adq0 {

    /* JADX INFO: renamed from: a */
    public final String f14666a;

    /* JADX INFO: renamed from: b */
    public final String f14667b;

    /* JADX INFO: renamed from: c */
    public final int f14668c;

    public adq0(String str, String str2, int i) {
        this.f14666a = str;
        this.f14667b = str2;
        this.f14668c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adq0)) {
            return false;
        }
        adq0 adq0Var = (adq0) obj;
        return wj50.m88271j(this.f14666a, adq0Var.f14666a) && wj50.m88271j(this.f14667b, adq0Var.f14667b) && this.f14668c == adq0Var.f14668c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f14668c) + s571.m77243b(this.f14666a.hashCode() * 31, 31, this.f14667b);
    }
}
