package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mtw implements s2x {

    /* JADX INFO: renamed from: a */
    public final boolean f147192a;

    /* JADX INFO: renamed from: b */
    public final boolean f147193b;

    /* JADX INFO: renamed from: c */
    public final boolean f147194c;

    /* JADX INFO: renamed from: d */
    public final boolean f147195d;

    public mtw(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f147192a = z;
        this.f147193b = z2;
        this.f147194c = z3;
        this.f147195d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtw)) {
            return false;
        }
        mtw mtwVar = (mtw) obj;
        return this.f147192a == mtwVar.f147192a && this.f147193b == mtwVar.f147193b && this.f147194c == mtwVar.f147194c && this.f147195d == mtwVar.f147195d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147195d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f147192a) * 31, 31, this.f147193b), 31, this.f147194c);
    }
}
