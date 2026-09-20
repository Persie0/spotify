package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a431 {

    /* JADX INFO: renamed from: a */
    public final String f12130a;

    /* JADX INFO: renamed from: b */
    public final long f12131b;

    public a431(String str, long j) {
        this.f12130a = str;
        this.f12131b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a431)) {
            return false;
        }
        a431 a431Var = (a431) obj;
        return wj50.m88271j(this.f12130a, a431Var.f12130a) && this.f12131b == a431Var.f12131b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12131b) + (this.f12130a.hashCode() * 31);
    }
}
