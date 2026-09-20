package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m4d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final String f139913a;

    /* JADX INFO: renamed from: b */
    public final g6d1 f139914b;

    /* JADX INFO: renamed from: c */
    public final boolean f139915c;

    public m4d1(String str, g6d1 g6d1Var, boolean z) {
        this.f139913a = str;
        this.f139914b = g6d1Var;
        this.f139915c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4d1)) {
            return false;
        }
        m4d1 m4d1Var = (m4d1) obj;
        return wj50.m88271j(this.f139913a, m4d1Var.f139913a) && wj50.m88271j(this.f139914b, m4d1Var.f139914b) && this.f139915c == m4d1Var.f139915c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139915c) + ((this.f139914b.hashCode() + (this.f139913a.hashCode() * 31)) * 31);
    }
}
