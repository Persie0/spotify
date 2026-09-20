package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mtv0 extends s1h1 {

    /* JADX INFO: renamed from: b */
    public final String f147190b;

    /* JADX INFO: renamed from: c */
    public final boolean f147191c;

    public mtv0(String str, boolean z) {
        this.f147190b = str;
        this.f147191c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtv0)) {
            return false;
        }
        mtv0 mtv0Var = (mtv0) obj;
        return wj50.m88271j(this.f147190b, mtv0Var.f147190b) && this.f147191c == mtv0Var.f147191c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147191c) + (this.f147190b.hashCode() * 31);
    }
}
