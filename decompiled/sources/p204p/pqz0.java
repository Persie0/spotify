package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pqz0 {

    /* JADX INFO: renamed from: a */
    public final String f180453a;

    /* JADX INFO: renamed from: b */
    public final int f180454b;

    /* JADX INFO: renamed from: c */
    public final String f180455c;

    public pqz0(String str, int i, String str2) {
        this.f180453a = str;
        this.f180454b = i;
        this.f180455c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqz0)) {
            return false;
        }
        pqz0 pqz0Var = (pqz0) obj;
        return wj50.m88271j(this.f180453a, pqz0Var.f180453a) && this.f180454b == pqz0Var.f180454b && wj50.m88271j(this.f180455c, pqz0Var.f180455c);
    }

    public final int hashCode() {
        String str = this.f180453a;
        int iM62800g = mt60.m62800g(this.f180454b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f180455c;
        return iM62800g + (str2 != null ? str2.hashCode() : 0);
    }
}
