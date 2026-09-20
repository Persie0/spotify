package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tim0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f220707a;

    /* JADX INFO: renamed from: b */
    public final String f220708b;

    /* JADX INFO: renamed from: c */
    public final boolean f220709c;

    /* JADX INFO: renamed from: d */
    public final gkm0 f220710d;

    public tim0(String str, String str2, boolean z, gkm0 gkm0Var) {
        this.f220707a = str;
        this.f220708b = str2;
        this.f220709c = z;
        this.f220710d = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tim0)) {
            return false;
        }
        tim0 tim0Var = (tim0) obj;
        return wj50.m88271j(this.f220707a, tim0Var.f220707a) && wj50.m88271j(this.f220708b, tim0Var.f220708b) && this.f220709c == tim0Var.f220709c && wj50.m88271j(this.f220710d, tim0Var.f220710d);
    }

    public final int hashCode() {
        return this.f220710d.hashCode() + s571.m77245d(s571.m77243b(this.f220707a.hashCode() * 31, 31, this.f220708b), 31, this.f220709c);
    }
}
