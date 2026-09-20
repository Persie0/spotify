package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ux11 implements vx11 {

    /* JADX INFO: renamed from: a */
    public final wwu f234799a;

    /* JADX INFO: renamed from: b */
    public final Integer f234800b;

    /* JADX INFO: renamed from: c */
    public final String f234801c;

    /* JADX INFO: renamed from: d */
    public final p221 f234802d;

    /* JADX INFO: renamed from: e */
    public final wx11 f234803e;

    /* JADX INFO: renamed from: f */
    public final ay11 f234804f;

    public ux11(wwu wwuVar, Integer num, String str, p221 p221Var, wx11 wx11Var, ay11 ay11Var) {
        this.f234799a = wwuVar;
        this.f234800b = num;
        this.f234801c = str;
        this.f234802d = p221Var;
        this.f234803e = wx11Var;
        this.f234804f = ay11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux11)) {
            return false;
        }
        ux11 ux11Var = (ux11) obj;
        return wj50.m88271j(this.f234799a, ux11Var.f234799a) && this.f234800b.equals(ux11Var.f234800b) && wj50.m88271j(this.f234801c, ux11Var.f234801c) && wj50.m88271j(this.f234802d, ux11Var.f234802d) && this.f234803e.equals(ux11Var.f234803e) && wj50.m88271j(this.f234804f, ux11Var.f234804f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f234800b.hashCode() + (this.f234799a.hashCode() * 961)) * 31, 31, this.f234801c);
        p221 p221Var = this.f234802d;
        return this.f234804f.hashCode() + ((this.f234803e.hashCode() + ((iM77243b + (p221Var == null ? 0 : p221Var.hashCode())) * 31)) * 31);
    }
}
