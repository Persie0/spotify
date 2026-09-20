package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dqq0 {

    /* JADX INFO: renamed from: a */
    public final String f52064a;

    /* JADX INFO: renamed from: b */
    public final String f52065b;

    public dqq0(String str, String str2) {
        this.f52064a = str;
        this.f52065b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqq0)) {
            return false;
        }
        dqq0 dqq0Var = (dqq0) obj;
        return wj50.m88271j(this.f52064a, dqq0Var.f52064a) && wj50.m88271j(this.f52065b, dqq0Var.f52065b);
    }

    public final int hashCode() {
        String str = this.f52064a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f52065b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
