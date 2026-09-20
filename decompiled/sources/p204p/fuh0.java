package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fuh0 {

    /* JADX INFO: renamed from: a */
    public final String f73506a;

    /* JADX INFO: renamed from: b */
    public final String f73507b;

    public fuh0(String str, String str2) {
        this.f73506a = str;
        this.f73507b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuh0)) {
            return false;
        }
        fuh0 fuh0Var = (fuh0) obj;
        return wj50.m88271j(this.f73506a, fuh0Var.f73506a) && wj50.m88271j(this.f73507b, fuh0Var.f73507b);
    }

    public final int hashCode() {
        return this.f73507b.hashCode() + (this.f73506a.hashCode() * 31);
    }
}
