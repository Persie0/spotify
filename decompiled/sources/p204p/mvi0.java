package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mvi0 implements l630 {

    /* JADX INFO: renamed from: a */
    public final ovi0 f147589a;

    /* JADX INFO: renamed from: b */
    public final String f147590b;

    /* JADX INFO: renamed from: c */
    public final b250 f147591c;

    public mvi0(ovi0 ovi0Var, String str, b250 b250Var) {
        this.f147589a = ovi0Var;
        this.f147590b = str;
        this.f147591c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvi0)) {
            return false;
        }
        mvi0 mvi0Var = (mvi0) obj;
        return wj50.m88271j(this.f147589a, mvi0Var.f147589a) && wj50.m88271j(this.f147590b, mvi0Var.f147590b) && wj50.m88271j(this.f147591c, mvi0Var.f147591c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f147590b;
    }

    public final int hashCode() {
        return this.f147591c.hashCode() + s571.m77243b(this.f147589a.hashCode() * 31, 31, this.f147590b);
    }
}
