package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xjf implements ekf {

    /* JADX INFO: renamed from: a */
    public final String f262121a;

    /* JADX INFO: renamed from: b */
    public final String f262122b;

    public xjf(String str, String str2) {
        this.f262121a = str;
        this.f262122b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjf)) {
            return false;
        }
        xjf xjfVar = (xjf) obj;
        return wj50.m88271j(this.f262121a, xjfVar.f262121a) && wj50.m88271j(this.f262122b, xjfVar.f262122b);
    }

    public final int hashCode() {
        int iHashCode = this.f262121a.hashCode() * 31;
        String str = this.f262122b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
