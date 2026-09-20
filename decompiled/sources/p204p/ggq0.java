package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ggq0 extends sw41 {

    /* JADX INFO: renamed from: c */
    public final String f79730c;

    /* JADX INFO: renamed from: d */
    public final String f79731d;

    /* JADX INFO: renamed from: e */
    public final String f79732e;

    /* JADX INFO: renamed from: f */
    public final String f79733f;

    public ggq0(String str, String str2, String str3, String str4) {
        this.f79730c = str;
        this.f79731d = str2;
        this.f79732e = str3;
        this.f79733f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggq0)) {
            return false;
        }
        ggq0 ggq0Var = (ggq0) obj;
        return wj50.m88271j(this.f79730c, ggq0Var.f79730c) && wj50.m88271j(this.f79731d, ggq0Var.f79731d) && wj50.m88271j(this.f79732e, ggq0Var.f79732e) && wj50.m88271j(this.f79733f, ggq0Var.f79733f);
    }

    public final int hashCode() {
        return this.f79733f.hashCode() + s571.m77243b(s571.m77243b(this.f79730c.hashCode() * 31, 31, this.f79731d), 31, this.f79732e);
    }

    @Override // p204p.sw41
    /* JADX INFO: renamed from: j */
    public final String mo41613j() {
        return this.f79730c;
    }
}
