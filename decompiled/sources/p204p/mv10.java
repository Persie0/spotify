package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mv10 {

    /* JADX INFO: renamed from: a */
    public final String f147481a;

    /* JADX INFO: renamed from: b */
    public final boolean f147482b;

    public mv10(String str, boolean z) {
        this.f147481a = str;
        this.f147482b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv10)) {
            return false;
        }
        mv10 mv10Var = (mv10) obj;
        return wj50.m88271j(this.f147481a, mv10Var.f147481a) && this.f147482b == mv10Var.f147482b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147482b) + (this.f147481a.hashCode() * 31);
    }
}
