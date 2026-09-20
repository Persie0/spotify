package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qr00 implements xr00 {

    /* JADX INFO: renamed from: a */
    public final String f191689a;

    /* JADX INFO: renamed from: b */
    public final int f191690b;

    /* JADX INFO: renamed from: c */
    public final boolean f191691c;

    public qr00(String str, int i, boolean z) {
        this.f191689a = str;
        this.f191690b = i;
        this.f191691c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr00)) {
            return false;
        }
        qr00 qr00Var = (qr00) obj;
        return wj50.m88271j(this.f191689a, qr00Var.f191689a) && this.f191690b == qr00Var.f191690b && this.f191691c == qr00Var.f191691c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191691c) + f710.m40938f(this.f191690b, this.f191689a.hashCode() * 31, 31);
    }
}
