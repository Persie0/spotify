package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e56 {

    /* JADX INFO: renamed from: a */
    public final String f56297a;

    /* JADX INFO: renamed from: b */
    public final String f56298b;

    public e56(String str, String str2) {
        this.f56297a = str;
        this.f56298b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e56)) {
            return false;
        }
        e56 e56Var = (e56) obj;
        return wj50.m88271j(this.f56297a, e56Var.f56297a) && wj50.m88271j(this.f56298b, e56Var.f56298b);
    }

    public final int hashCode() {
        return this.f56298b.hashCode() + (this.f56297a.hashCode() * 31);
    }
}
