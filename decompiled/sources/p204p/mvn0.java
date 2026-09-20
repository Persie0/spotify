package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mvn0 {

    /* JADX INFO: renamed from: a */
    public final String f147612a;

    /* JADX INFO: renamed from: b */
    public final String f147613b;

    /* JADX INFO: renamed from: c */
    public final String f147614c;

    /* JADX INFO: renamed from: d */
    public final String f147615d;

    /* JADX INFO: renamed from: e */
    public final String f147616e;

    /* JADX INFO: renamed from: f */
    public final String f147617f;

    /* JADX INFO: renamed from: g */
    public final String f147618g;

    /* JADX INFO: renamed from: h */
    public final boolean f147619h;

    /* JADX INFO: renamed from: i */
    public final boolean f147620i;

    /* JADX INFO: renamed from: j */
    public final boolean f147621j;

    public mvn0(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3) {
        this.f147612a = str;
        this.f147613b = str2;
        this.f147614c = str3;
        this.f147615d = str4;
        this.f147616e = str5;
        this.f147617f = str6;
        this.f147618g = str7;
        this.f147619h = z;
        this.f147620i = z2;
        this.f147621j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvn0)) {
            return false;
        }
        mvn0 mvn0Var = (mvn0) obj;
        return wj50.m88271j(this.f147612a, mvn0Var.f147612a) && wj50.m88271j(this.f147613b, mvn0Var.f147613b) && wj50.m88271j(this.f147614c, mvn0Var.f147614c) && wj50.m88271j(this.f147615d, mvn0Var.f147615d) && wj50.m88271j(this.f147616e, mvn0Var.f147616e) && wj50.m88271j(this.f147617f, mvn0Var.f147617f) && wj50.m88271j(this.f147618g, mvn0Var.f147618g) && this.f147619h == mvn0Var.f147619h && this.f147620i == mvn0Var.f147620i && this.f147621j == mvn0Var.f147621j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147621j) + s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f147612a.hashCode() * 31, 31, this.f147613b), 31, this.f147614c), 31, this.f147615d), 31, this.f147616e), 31, this.f147617f), 31, this.f147618g), 31, this.f147619h), 31, this.f147620i);
    }
}
