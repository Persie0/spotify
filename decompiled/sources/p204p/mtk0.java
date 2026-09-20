package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mtk0 implements ntk0 {

    /* JADX INFO: renamed from: a */
    public final String f147103a;

    /* JADX INFO: renamed from: b */
    public final String f147104b;

    public mtk0(String str, String str2) {
        this.f147103a = str;
        this.f147104b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m62829a() {
        return this.f147103a;
    }

    /* JADX INFO: renamed from: b */
    public final String m62830b() {
        return this.f147104b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtk0)) {
            return false;
        }
        mtk0 mtk0Var = (mtk0) obj;
        return wj50.m88271j(this.f147103a, mtk0Var.f147103a) && wj50.m88271j(this.f147104b, mtk0Var.f147104b);
    }

    public final int hashCode() {
        int iHashCode = this.f147103a.hashCode() * 31;
        String str = this.f147104b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
