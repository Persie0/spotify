package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gvo0 {

    /* JADX INFO: renamed from: a */
    public final String f84793a;

    /* JADX INFO: renamed from: b */
    public final String f84794b;

    public gvo0(String str, String str2) {
        this.f84793a = str;
        this.f84794b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvo0)) {
            return false;
        }
        gvo0 gvo0Var = (gvo0) obj;
        return wj50.m88271j(this.f84793a, gvo0Var.f84793a) && wj50.m88271j(this.f84794b, gvo0Var.f84794b);
    }

    public final int hashCode() {
        String str = this.f84793a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f84794b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
