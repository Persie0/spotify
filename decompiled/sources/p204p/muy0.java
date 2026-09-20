package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class muy0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f147454a;

    /* JADX INFO: renamed from: b */
    public final d850 f147455b;

    public muy0(String str, d850 d850Var) {
        this.f147454a = str;
        this.f147455b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muy0)) {
            return false;
        }
        muy0 muy0Var = (muy0) obj;
        return wj50.m88271j(this.f147454a, muy0Var.f147454a) && wj50.m88271j(this.f147455b, muy0Var.f147455b);
    }

    public final int hashCode() {
        int iHashCode = this.f147454a.hashCode() * 31;
        d850 d850Var = this.f147455b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
