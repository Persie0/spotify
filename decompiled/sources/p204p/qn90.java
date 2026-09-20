package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qn90 {

    /* JADX INFO: renamed from: a */
    public final String f190537a;

    /* JADX INFO: renamed from: b */
    public final String f190538b;

    public qn90(String str, String str2) {
        this.f190537a = str;
        this.f190538b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn90)) {
            return false;
        }
        qn90 qn90Var = (qn90) obj;
        return wj50.m88271j(this.f190537a, qn90Var.f190537a) && wj50.m88271j(this.f190538b, qn90Var.f190538b);
    }

    public final int hashCode() {
        return this.f190538b.hashCode() + (this.f190537a.hashCode() * 31);
    }
}
