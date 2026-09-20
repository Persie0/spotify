package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mwd0 {

    /* JADX INFO: renamed from: a */
    public final String f147769a;

    /* JADX INFO: renamed from: b */
    public final zz70 f147770b;

    public mwd0(String str, zz70 zz70Var) {
        this.f147769a = str;
        this.f147770b = zz70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwd0)) {
            return false;
        }
        mwd0 mwd0Var = (mwd0) obj;
        return wj50.m88271j(this.f147769a, mwd0Var.f147769a) && this.f147770b.equals(mwd0Var.f147770b);
    }

    public final int hashCode() {
        return this.f147770b.hashCode() + (this.f147769a.hashCode() * 31);
    }
}
