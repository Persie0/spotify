package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class muf0 {

    /* JADX INFO: renamed from: a */
    public final lb81 f147337a;

    /* JADX INFO: renamed from: b */
    public final String f147338b;

    /* JADX INFO: renamed from: c */
    public final int f147339c;

    /* JADX INFO: renamed from: d */
    public final int f147340d;

    /* JADX INFO: renamed from: e */
    public final boolean f147341e;

    /* JADX INFO: renamed from: f */
    public final boolean f147342f;

    /* JADX INFO: renamed from: g */
    public final boolean f147343g;

    /* JADX INFO: renamed from: h */
    public final v4e0 f147344h;

    /* JADX INFO: renamed from: i */
    public final w2g0 f147345i;

    public muf0(lb81 lb81Var, String str, int i, int i2, boolean z, boolean z2, boolean z3, v4e0 v4e0Var, w2g0 w2g0Var) {
        this.f147337a = lb81Var;
        this.f147338b = str;
        this.f147339c = i;
        this.f147340d = i2;
        this.f147341e = z;
        this.f147342f = z2;
        this.f147343g = z3;
        this.f147344h = v4e0Var;
        this.f147345i = w2g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muf0)) {
            return false;
        }
        muf0 muf0Var = (muf0) obj;
        return this.f147337a == muf0Var.f147337a && wj50.m88271j(this.f147338b, muf0Var.f147338b) && this.f147339c == muf0Var.f147339c && this.f147340d == muf0Var.f147340d && this.f147341e == muf0Var.f147341e && this.f147342f == muf0Var.f147342f && this.f147343g == muf0Var.f147343g && this.f147344h.equals(muf0Var.f147344h) && this.f147345i.equals(muf0Var.f147345i);
    }

    public final int hashCode() {
        return this.f147345i.hashCode() + ((this.f147344h.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f147340d, mt60.m62800g(this.f147339c, s571.m77243b(this.f147337a.hashCode() * 31, 31, this.f147338b), 31), 31), 31, this.f147341e), 31, this.f147342f), 31, this.f147343g)) * 31);
    }
}
