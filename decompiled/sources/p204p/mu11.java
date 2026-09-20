package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mu11 {

    /* JADX INFO: renamed from: a */
    public final String f147234a;

    /* JADX INFO: renamed from: b */
    public final String f147235b;

    /* JADX INFO: renamed from: c */
    public final boolean f147236c;

    /* JADX INFO: renamed from: d */
    public final int f147237d;

    public mu11(String str, String str2, boolean z, int i) {
        this.f147234a = str;
        this.f147235b = str2;
        this.f147236c = z;
        this.f147237d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu11)) {
            return false;
        }
        mu11 mu11Var = (mu11) obj;
        return wj50.m88271j(this.f147234a, mu11Var.f147234a) && wj50.m88271j(this.f147235b, mu11Var.f147235b) && this.f147236c == mu11Var.f147236c && this.f147237d == mu11Var.f147237d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f147237d) + s571.m77245d(s571.m77243b(this.f147234a.hashCode() * 31, 31, this.f147235b), 31, this.f147236c);
    }
}
