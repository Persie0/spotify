package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class k35 {

    /* JADX INFO: renamed from: a */
    public final tn61 f118762a;

    /* JADX INFO: renamed from: b */
    public final Object f118763b;

    /* JADX INFO: renamed from: c */
    public final int f118764c;

    public k35(tn61 tn61Var, Object obj) {
        this.f118762a = tn61Var;
        this.f118763b = obj;
        this.f118764c = obj.hashCode() + (tn61Var.hashCode() * 31);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55230a() {
        return wj50.m88271j(this.f118763b, r101.f194657X0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k35)) {
            return false;
        }
        k35 k35Var = (k35) obj;
        return wj50.m88271j(this.f118762a, k35Var.f118762a) && wj50.m88271j(this.f118763b, k35Var.f118763b);
    }

    public final int hashCode() {
        return this.f118764c;
    }
}
