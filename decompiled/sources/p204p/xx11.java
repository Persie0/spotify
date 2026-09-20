package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xx11 {

    /* JADX INFO: renamed from: a */
    public final vx11 f266842a;

    public xx11(vx11 vx11Var) {
        this.f266842a = vx11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xx11) && wj50.m88271j(this.f266842a, ((xx11) obj).f266842a);
    }

    public final int hashCode() {
        return this.f266842a.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xx11(wwu wwuVar, Integer num, String str, p221 p221Var, wx11 wx11Var, ay11 ay11Var, int i) {
        p221 p221Var2 = (i & 16) != 0 ? null : p221Var;
        if ((i & 64) != 0) {
            ay11.f21062a.getClass();
            ay11Var = zx11.f287179b;
        }
        this(new ux11(wwuVar, num, str, p221Var2, wx11Var, ay11Var));
    }

    public xx11(ax11 ax11Var) {
        this(new tx11(ax11Var));
    }
}
