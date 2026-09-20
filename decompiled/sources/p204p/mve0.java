package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mve0 extends ove0 {

    /* JADX INFO: renamed from: a */
    public final String f147566a;

    /* JADX INFO: renamed from: b */
    public final int f147567b;

    /* JADX INFO: renamed from: c */
    public final String f147568c;

    /* JADX INFO: renamed from: d */
    public final boolean f147569d;

    /* JADX INFO: renamed from: e */
    public final boolean f147570e;

    public mve0(int i, String str, String str2, boolean z, boolean z2) {
        this.f147566a = str;
        this.f147567b = i;
        this.f147568c = str2;
        this.f147569d = z;
        this.f147570e = z2;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: a */
    public final String mo54379a() {
        return this.f147568c;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: b */
    public final String mo54380b() {
        return this.f147566a;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: d */
    public final int mo54381d() {
        return this.f147567b;
    }

    @Override // p204p.ove0
    /* JADX INFO: renamed from: e */
    public final boolean mo54382e() {
        return this.f147569d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mve0)) {
            return false;
        }
        mve0 mve0Var = (mve0) obj;
        return this.f147566a.equals(mve0Var.f147566a) && this.f147567b == mve0Var.f147567b && this.f147568c.equals(mve0Var.f147568c) && this.f147569d == mve0Var.f147569d && this.f147570e == mve0Var.f147570e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147570e) + s571.m77245d(s571.m77243b(f710.m40938f(this.f147567b, this.f147566a.hashCode() * 31, 31), 31, this.f147568c), 31, this.f147569d);
    }
}
