package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cku0 implements qku0 {

    /* JADX INFO: renamed from: a */
    public final String f39088a;

    /* JADX INFO: renamed from: b */
    public final Throwable f39089b;

    public cku0(String str, Throwable th) {
        this.f39088a = str;
        this.f39089b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cku0)) {
            return false;
        }
        cku0 cku0Var = (cku0) obj;
        return wj50.m88271j(this.f39088a, cku0Var.f39088a) && wj50.m88271j(this.f39089b, cku0Var.f39089b);
    }

    public final int hashCode() {
        return this.f39089b.hashCode() + (this.f39088a.hashCode() * 31);
    }
}
