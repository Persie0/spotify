package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class g840 implements l840 {

    /* JADX INFO: renamed from: a */
    public final z840 f77406a;

    /* JADX INFO: renamed from: b */
    public final String f77407b;

    public g840(z840 z840Var, String str) {
        this.f77406a = z840Var;
        this.f77407b = str;
    }

    @Override // p204p.l840
    /* JADX INFO: renamed from: a */
    public final String mo43945a() {
        return this.f77407b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g840)) {
            return false;
        }
        g840 g840Var = (g840) obj;
        return wj50.m88271j(this.f77406a, g840Var.f77406a) && wj50.m88271j(this.f77407b, g840Var.f77407b);
    }

    public final int hashCode() {
        return this.f77407b.hashCode() + (this.f77406a.hashCode() * 31);
    }
}
