package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kky0 {

    /* JADX INFO: renamed from: a */
    public final String f123739a;

    /* JADX INFO: renamed from: b */
    public final String f123740b;

    /* JADX INFO: renamed from: c */
    public final String f123741c;

    /* JADX INFO: renamed from: d */
    public final String f123742d;

    public kky0(String str, String str2, String str3, String str4) {
        this.f123739a = str;
        this.f123740b = str2;
        this.f123741c = str3;
        this.f123742d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kky0)) {
            return false;
        }
        kky0 kky0Var = (kky0) obj;
        return wj50.m88271j(this.f123739a, kky0Var.f123739a) && wj50.m88271j(this.f123740b, kky0Var.f123740b) && wj50.m88271j(this.f123741c, kky0Var.f123741c) && wj50.m88271j(this.f123742d, kky0Var.f123742d);
    }

    public final int hashCode() {
        return this.f123742d.hashCode() + s571.m77243b(s571.m77243b(this.f123739a.hashCode() * 31, 31, this.f123740b), 31, this.f123741c);
    }
}
