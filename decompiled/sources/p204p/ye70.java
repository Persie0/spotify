package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ye70 {

    /* JADX INFO: renamed from: a */
    public final String f271929a;

    /* JADX INFO: renamed from: b */
    public final String f271930b;

    public ye70(String str, String str2) {
        this.f271929a = str;
        this.f271930b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye70)) {
            return false;
        }
        ye70 ye70Var = (ye70) obj;
        return wj50.m88271j(this.f271929a, ye70Var.f271929a) && wj50.m88271j(this.f271930b, ye70Var.f271930b);
    }

    public final int hashCode() {
        return this.f271930b.hashCode() + (this.f271929a.hashCode() * 31);
    }
}
