package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mui {

    /* JADX INFO: renamed from: a */
    public final String f147361a;

    /* JADX INFO: renamed from: b */
    public final boolean f147362b;

    /* JADX INFO: renamed from: c */
    public final int f147363c;

    /* JADX INFO: renamed from: d */
    public final String f147364d;

    /* JADX INFO: renamed from: e */
    public final String f147365e;

    public mui(int i, String str, String str2, boolean z, String str3) {
        this.f147361a = str;
        this.f147362b = z;
        this.f147363c = i;
        this.f147364d = str2;
        this.f147365e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mui)) {
            return false;
        }
        mui muiVar = (mui) obj;
        return wj50.m88271j(this.f147361a, muiVar.f147361a) && this.f147362b == muiVar.f147362b && this.f147363c == muiVar.f147363c && wj50.m88271j(this.f147364d, muiVar.f147364d) && wj50.m88271j(this.f147365e, muiVar.f147365e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(f710.m40938f(this.f147363c, s571.m77245d(this.f147361a.hashCode() * 31, 31, this.f147362b), 31), 31, this.f147364d);
        String str = this.f147365e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
