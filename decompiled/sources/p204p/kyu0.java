package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kyu0 {

    /* JADX INFO: renamed from: a */
    public final String f127922a;

    /* JADX INFO: renamed from: b */
    public final String f127923b;

    public kyu0(String str, String str2) {
        this.f127922a = str;
        this.f127923b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m57726a() {
        return this.f127922a;
    }

    /* JADX INFO: renamed from: b */
    public final String m57727b() {
        return this.f127923b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyu0)) {
            return false;
        }
        kyu0 kyu0Var = (kyu0) obj;
        return wj50.m88271j(this.f127922a, kyu0Var.f127922a) && wj50.m88271j(this.f127923b, kyu0Var.f127923b);
    }

    public final int hashCode() {
        int iHashCode = this.f127922a.hashCode() * 31;
        String str = this.f127923b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
