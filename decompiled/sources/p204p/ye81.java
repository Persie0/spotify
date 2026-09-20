package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ye81 {

    /* JADX INFO: renamed from: a */
    public final String f271936a;

    /* JADX INFO: renamed from: b */
    public final String f271937b;

    /* JADX INFO: renamed from: c */
    public final boolean f271938c;

    public ye81(String str, String str2, boolean z) {
        this.f271936a = str;
        this.f271937b = str2;
        this.f271938c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye81)) {
            return false;
        }
        ye81 ye81Var = (ye81) obj;
        return wj50.m88271j(this.f271936a, ye81Var.f271936a) && wj50.m88271j(this.f271937b, ye81Var.f271937b) && this.f271938c == ye81Var.f271938c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271938c) + s571.m77243b(this.f271936a.hashCode() * 31, 31, this.f271937b);
    }
}
