package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mvv0 {

    /* JADX INFO: renamed from: a */
    public final xq81 f147659a;

    /* JADX INFO: renamed from: b */
    public final int f147660b;

    /* JADX INFO: renamed from: c */
    public final icc0 f147661c;

    public mvv0(xq81 xq81Var, int i, icc0 icc0Var) {
        this.f147659a = xq81Var;
        this.f147660b = i;
        this.f147661c = icc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvv0)) {
            return false;
        }
        mvv0 mvv0Var = (mvv0) obj;
        return wj50.m88271j(this.f147659a, mvv0Var.f147659a) && this.f147660b == mvv0Var.f147660b && wj50.m88271j(this.f147661c, mvv0Var.f147661c);
    }

    public final int hashCode() {
        return this.f147661c.hashCode() + f710.m40938f(this.f147660b, this.f147659a.hashCode() * 31, 31);
    }
}
