package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q211 extends w211 {

    /* JADX INFO: renamed from: a */
    public final int f184459a;

    /* JADX INFO: renamed from: b */
    public final u511 f184460b;

    /* JADX INFO: renamed from: c */
    public final s511 f184461c;

    public q211(int i, u511 u511Var, s511 s511Var) {
        this.f184459a = i;
        this.f184460b = u511Var;
        this.f184461c = s511Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q211)) {
            return false;
        }
        q211 q211Var = (q211) obj;
        return this.f184459a == q211Var.f184459a && wj50.m88271j(this.f184460b, q211Var.f184460b) && wj50.m88271j(this.f184461c, q211Var.f184461c);
    }

    public final int hashCode() {
        return this.f184461c.hashCode() + ((this.f184460b.f226878a.hashCode() + (Integer.hashCode(this.f184459a) * 31)) * 31);
    }
}
