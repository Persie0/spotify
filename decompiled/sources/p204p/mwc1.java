package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mwc1 implements bxc1 {

    /* JADX INFO: renamed from: a */
    public final dy1 f147766a;

    /* JADX INFO: renamed from: b */
    public final double f147767b;

    /* JADX INFO: renamed from: c */
    public final Double f147768c;

    public mwc1(dy1 dy1Var, double d, Double d2) {
        this.f147766a = dy1Var;
        this.f147767b = d;
        this.f147768c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwc1)) {
            return false;
        }
        mwc1 mwc1Var = (mwc1) obj;
        return wj50.m88271j(this.f147766a, mwc1Var.f147766a) && Double.compare(this.f147767b, mwc1Var.f147767b) == 0 && wj50.m88271j(this.f147768c, mwc1Var.f147768c);
    }

    public final int hashCode() {
        int iM91399h = xl81.m91399h(this.f147767b, this.f147766a.hashCode() * 31, 31);
        Double d = this.f147768c;
        return iM91399h + (d == null ? 0 : d.hashCode());
    }
}
