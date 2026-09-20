package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e6x0 extends y6x0 {

    /* JADX INFO: renamed from: a */
    public final String f56774a;

    /* JADX INFO: renamed from: b */
    public final String f56775b;

    public e6x0(String str, String str2) {
        this.f56774a = str;
        this.f56775b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6x0)) {
            return false;
        }
        e6x0 e6x0Var = (e6x0) obj;
        return wj50.m88271j(this.f56774a, e6x0Var.f56774a) && wj50.m88271j(this.f56775b, e6x0Var.f56775b);
    }

    public final int hashCode() {
        return this.f56775b.hashCode() + (this.f56774a.hashCode() * 31);
    }
}
