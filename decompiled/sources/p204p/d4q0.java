package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d4q0 extends f4q0 {

    /* JADX INFO: renamed from: k */
    public final String f45229k;

    /* JADX INFO: renamed from: l */
    public final boolean f45230l;

    /* JADX INFO: renamed from: m */
    public final boolean f45231m;

    public d4q0(String str, boolean z, boolean z2) {
        this.f45229k = str;
        this.f45230l = z;
        this.f45231m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4q0)) {
            return false;
        }
        d4q0 d4q0Var = (d4q0) obj;
        return wj50.m88271j(this.f45229k, d4q0Var.f45229k) && this.f45230l == d4q0Var.f45230l && this.f45231m == d4q0Var.f45231m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45231m) + s571.m77245d(this.f45229k.hashCode() * 31, 31, this.f45230l);
    }
}
