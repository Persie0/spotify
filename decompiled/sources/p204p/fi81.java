package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fi81 extends ii81 {

    /* JADX INFO: renamed from: a */
    public final String f69808a;

    /* JADX INFO: renamed from: b */
    public final int f69809b;

    /* JADX INFO: renamed from: c */
    public final String f69810c;

    public fi81(String str, int i, String str2) {
        this.f69808a = str;
        this.f69809b = i;
        this.f69810c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi81)) {
            return false;
        }
        fi81 fi81Var = (fi81) obj;
        return wj50.m88271j(this.f69808a, fi81Var.f69808a) && this.f69809b == fi81Var.f69809b && wj50.m88271j(this.f69810c, fi81Var.f69810c);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f69809b, this.f69808a.hashCode() * 31, 31);
        String str = this.f69810c;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }
}
