package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mu20 {

    /* JADX INFO: renamed from: a */
    public final String f147238a;

    /* JADX INFO: renamed from: b */
    public final e2r f147239b;

    /* JADX INFO: renamed from: c */
    public final int f147240c;

    /* JADX INFO: renamed from: d */
    public final String f147241d;

    public mu20(String str, e2r e2rVar, int i, String str2) {
        this.f147238a = str;
        this.f147239b = e2rVar;
        this.f147240c = i;
        this.f147241d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu20)) {
            return false;
        }
        mu20 mu20Var = (mu20) obj;
        return wj50.m88271j(this.f147238a, mu20Var.f147238a) && wj50.m88271j(this.f147239b, mu20Var.f147239b) && this.f147240c == mu20Var.f147240c && wj50.m88271j(this.f147241d, mu20Var.f147241d);
    }

    public final int hashCode() {
        return this.f147241d.hashCode() + mt60.m62800g(this.f147240c, (this.f147239b.hashCode() + (this.f147238a.hashCode() * 31)) * 31, 31);
    }
}
