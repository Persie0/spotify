package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class muj0 {

    /* JADX INFO: renamed from: a */
    public final String f147370a;

    /* JADX INFO: renamed from: b */
    public final String f147371b;

    /* JADX INFO: renamed from: c */
    public final String f147372c;

    /* JADX INFO: renamed from: d */
    public final kuj0 f147373d;

    /* JADX INFO: renamed from: e */
    public final juj0 f147374e;

    /* JADX INFO: renamed from: f */
    public final String f147375f;

    /* JADX INFO: renamed from: g */
    public final boolean f147376g;

    public muj0(String str, String str2, String str3, kuj0 kuj0Var, juj0 juj0Var, String str4, boolean z) {
        this.f147370a = str;
        this.f147371b = str2;
        this.f147372c = str3;
        this.f147373d = kuj0Var;
        this.f147374e = juj0Var;
        this.f147375f = str4;
        this.f147376g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muj0)) {
            return false;
        }
        muj0 muj0Var = (muj0) obj;
        return wj50.m88271j(this.f147370a, muj0Var.f147370a) && wj50.m88271j(this.f147371b, muj0Var.f147371b) && wj50.m88271j(this.f147372c, muj0Var.f147372c) && wj50.m88271j(this.f147373d, muj0Var.f147373d) && wj50.m88271j(this.f147374e, muj0Var.f147374e) && wj50.m88271j(this.f147375f, muj0Var.f147375f) && this.f147376g == muj0Var.f147376g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f147370a.hashCode() * 31, 31, this.f147371b), 31, this.f147372c);
        kuj0 kuj0Var = this.f147373d;
        int iHashCode = (iM77243b + (kuj0Var == null ? 0 : kuj0Var.hashCode())) * 31;
        juj0 juj0Var = this.f147374e;
        int iHashCode2 = (iHashCode + (juj0Var == null ? 0 : juj0Var.hashCode())) * 31;
        String str = this.f147375f;
        return Boolean.hashCode(this.f147376g) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public /* synthetic */ muj0(String str, String str2, String str3, kuj0 kuj0Var, juj0 juj0Var, boolean z, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : kuj0Var, (i & 16) != 0 ? null : juj0Var, (String) null, z);
    }
}
