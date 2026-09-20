package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class pn1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final x93 f179283a;

    /* JADX INFO: renamed from: b */
    public final String f179284b;

    /* JADX INFO: renamed from: c */
    public final boolean f179285c;

    public pn1(x93 x93Var, String str, boolean z) {
        this.f179283a = x93Var;
        this.f179284b = str;
        this.f179285c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn1)) {
            return false;
        }
        pn1 pn1Var = (pn1) obj;
        return this.f179283a == pn1Var.f179283a && wj50.m88271j(this.f179284b, pn1Var.f179284b) && this.f179285c == pn1Var.f179285c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f179285c) + s571.m77243b(this.f179283a.hashCode() * 31, 31, this.f179284b);
    }
}
