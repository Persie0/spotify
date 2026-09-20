package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mws0 {

    /* JADX INFO: renamed from: a */
    public final String f147879a;

    /* JADX INFO: renamed from: b */
    public final sr01 f147880b;

    public mws0(String str, sr01 sr01Var) {
        this.f147879a = str;
        this.f147880b = sr01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mws0)) {
            return false;
        }
        mws0 mws0Var = (mws0) obj;
        return wj50.m88271j(this.f147879a, mws0Var.f147879a) && wj50.m88271j(this.f147880b, mws0Var.f147880b);
    }

    public final int hashCode() {
        return this.f147880b.hashCode() + (this.f147879a.hashCode() * 31);
    }
}
