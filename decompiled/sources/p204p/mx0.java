package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mx0 {

    /* JADX INFO: renamed from: a */
    public final jx0 f147914a;

    /* JADX INFO: renamed from: b */
    public final jx0 f147915b;

    public mx0(jx0 jx0Var, jx0 jx0Var2) {
        this.f147914a = jx0Var;
        this.f147915b = jx0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx0)) {
            return false;
        }
        mx0 mx0Var = (mx0) obj;
        return wj50.m88271j(this.f147914a, mx0Var.f147914a) && wj50.m88271j(this.f147915b, mx0Var.f147915b);
    }

    public final int hashCode() {
        int iHashCode = this.f147914a.hashCode() * 31;
        jx0 jx0Var = this.f147915b;
        return iHashCode + (jx0Var == null ? 0 : jx0Var.hashCode());
    }
}
