package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h4e1 {

    /* JADX INFO: renamed from: a */
    public final String f87521a;

    /* JADX INFO: renamed from: b */
    public final n3e1 f87522b;

    public h4e1(String str, n3e1 n3e1Var) {
        this.f87521a = str;
        this.f87522b = n3e1Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m46639a() {
        return this.f87521a;
    }

    /* JADX INFO: renamed from: b */
    public final n3e1 m46640b() {
        return this.f87522b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4e1)) {
            return false;
        }
        h4e1 h4e1Var = (h4e1) obj;
        return wj50.m88271j(this.f87521a, h4e1Var.f87521a) && wj50.m88271j(this.f87522b, h4e1Var.f87522b);
    }

    public final int hashCode() {
        return this.f87522b.hashCode() + (this.f87521a.hashCode() * 31);
    }
}
