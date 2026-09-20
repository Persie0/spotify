package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h5z0 extends i5z0 {

    /* JADX INFO: renamed from: a */
    public final String f87932a;

    /* JADX INFO: renamed from: b */
    public final String f87933b;

    /* JADX INFO: renamed from: c */
    public final String f87934c;

    /* JADX INFO: renamed from: d */
    public final String f87935d;

    /* JADX INFO: renamed from: e */
    public final String f87936e;

    public h5z0(String str, String str2, String str3, String str4, String str5) {
        this.f87932a = str;
        this.f87933b = str2;
        this.f87934c = str3;
        this.f87935d = str4;
        this.f87936e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5z0)) {
            return false;
        }
        h5z0 h5z0Var = (h5z0) obj;
        return wj50.m88271j(this.f87932a, h5z0Var.f87932a) && wj50.m88271j(this.f87933b, h5z0Var.f87933b) && wj50.m88271j(this.f87934c, h5z0Var.f87934c) && wj50.m88271j(this.f87935d, h5z0Var.f87935d) && wj50.m88271j(this.f87936e, h5z0Var.f87936e);
    }

    public final int hashCode() {
        return this.f87936e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f87932a.hashCode() * 31, 31, this.f87933b), 31, this.f87934c), 31, this.f87935d);
    }
}
