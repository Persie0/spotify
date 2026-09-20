package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class al50 implements bl50 {

    /* JADX INFO: renamed from: a */
    public final String f16774a;

    /* JADX INFO: renamed from: b */
    public final boolean f16775b;

    /* JADX INFO: renamed from: c */
    public final boolean f16776c;

    /* JADX INFO: renamed from: d */
    public final w9m0 f16777d;

    public al50(String str, boolean z, boolean z2, w9m0 w9m0Var) {
        this.f16774a = str;
        this.f16775b = z;
        this.f16776c = z2;
        this.f16777d = w9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al50)) {
            return false;
        }
        al50 al50Var = (al50) obj;
        return wj50.m88271j(this.f16774a, al50Var.f16774a) && this.f16775b == al50Var.f16775b && this.f16776c == al50Var.f16776c && wj50.m88271j(this.f16777d, al50Var.f16777d);
    }

    public final int hashCode() {
        return this.f16777d.hashCode() + s571.m77245d(s571.m77245d(this.f16774a.hashCode() * 31, 31, this.f16775b), 31, this.f16776c);
    }
}
