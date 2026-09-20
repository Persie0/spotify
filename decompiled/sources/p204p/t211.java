package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t211 extends w211 {

    /* JADX INFO: renamed from: a */
    public final int f216405a;

    /* JADX INFO: renamed from: b */
    public final u511 f216406b;

    public t211(int i, u511 u511Var) {
        this.f216405a = i;
        this.f216406b = u511Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t211)) {
            return false;
        }
        t211 t211Var = (t211) obj;
        return this.f216405a == t211Var.f216405a && wj50.m88271j(this.f216406b, t211Var.f216406b);
    }

    public final int hashCode() {
        return this.f216406b.f226878a.hashCode() + (Integer.hashCode(this.f216405a) * 31);
    }
}
