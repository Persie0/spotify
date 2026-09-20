package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dd80 {

    /* JADX INFO: renamed from: a */
    public final ex81 f47743a;

    /* JADX INFO: renamed from: b */
    public final pro0 f47744b;

    /* JADX INFO: renamed from: c */
    public final glr f47745c;

    public dd80(ex81 ex81Var, pro0 pro0Var, glr glrVar) {
        this.f47743a = ex81Var;
        this.f47744b = pro0Var;
        this.f47745c = glrVar;
    }

    /* JADX INFO: renamed from: a */
    public static dd80 m35729a(dd80 dd80Var, ex81 ex81Var, pro0 pro0Var, glr glrVar, int i) {
        if ((i & 1) != 0) {
            ex81Var = dd80Var.f47743a;
        }
        if ((i & 2) != 0) {
            pro0Var = dd80Var.f47744b;
        }
        if ((i & 4) != 0) {
            glrVar = dd80Var.f47745c;
        }
        return new dd80(ex81Var, pro0Var, glrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd80)) {
            return false;
        }
        dd80 dd80Var = (dd80) obj;
        return wj50.m88271j(this.f47743a, dd80Var.f47743a) && this.f47744b == dd80Var.f47744b && wj50.m88271j(this.f47745c, dd80Var.f47745c);
    }

    public final int hashCode() {
        return this.f47745c.hashCode() + ((this.f47744b.hashCode() + (this.f47743a.hashCode() * 31)) * 31);
    }
}
