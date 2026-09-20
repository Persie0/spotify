package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ty2 {

    /* JADX INFO: renamed from: a */
    public final ybv f224803a;

    /* JADX INFO: renamed from: b */
    public final String f224804b;

    /* JADX INFO: renamed from: c */
    public final String f224805c;

    /* JADX INFO: renamed from: d */
    public final boolean f224806d;

    /* JADX INFO: renamed from: e */
    public final String f224807e;

    public ty2(ybv ybvVar, String str, String str2, boolean z, String str3) {
        this.f224803a = ybvVar;
        this.f224804b = str;
        this.f224805c = str2;
        this.f224806d = z;
        this.f224807e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2)) {
            return false;
        }
        ty2 ty2Var = (ty2) obj;
        return wj50.m88271j(this.f224803a, ty2Var.f224803a) && wj50.m88271j(this.f224804b, ty2Var.f224804b) && wj50.m88271j(this.f224805c, ty2Var.f224805c) && this.f224806d == ty2Var.f224806d && wj50.m88271j(this.f224807e, ty2Var.f224807e);
    }

    public final int hashCode() {
        return this.f224807e.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(this.f224803a.hashCode() * 31, 31, this.f224804b), 31, this.f224805c), 31, this.f224806d);
    }
}
