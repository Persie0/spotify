package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class los0 implements oos0 {

    /* JADX INFO: renamed from: a */
    public final String f135541a;

    /* JADX INFO: renamed from: b */
    public final String f135542b;

    /* JADX INFO: renamed from: c */
    public final int f135543c;

    public los0(String str, String str2, int i) {
        this.f135541a = str;
        this.f135542b = str2;
        this.f135543c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof los0)) {
            return false;
        }
        los0 los0Var = (los0) obj;
        return wj50.m88271j(this.f135541a, los0Var.f135541a) && wj50.m88271j(this.f135542b, los0Var.f135542b) && this.f135543c == los0Var.f135543c;
    }

    public final int hashCode() {
        int iHashCode = this.f135541a.hashCode() * 31;
        String str = this.f135542b;
        return edb.m38547C(this.f135543c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
