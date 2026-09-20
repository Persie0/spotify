package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mwl0 {

    /* JADX INFO: renamed from: a */
    public final int f147813a;

    /* JADX INFO: renamed from: b */
    public final boolean f147814b;

    /* JADX INFO: renamed from: c */
    public final boolean f147815c;

    public mwl0(int i, boolean z, boolean z2) {
        this.f147813a = i;
        this.f147814b = z;
        this.f147815c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwl0)) {
            return false;
        }
        mwl0 mwl0Var = (mwl0) obj;
        return this.f147813a == mwl0Var.f147813a && this.f147814b == mwl0Var.f147814b && this.f147815c == mwl0Var.f147815c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147815c) + s571.m77245d(s571.m77245d(Integer.hashCode(this.f147813a) * 31, 31, this.f147814b), 31, true);
    }
}
