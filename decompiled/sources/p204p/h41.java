package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class h41 extends i41 {

    /* JADX INFO: renamed from: a */
    public final String f87384a;

    /* JADX INFO: renamed from: b */
    public final String f87385b;

    /* JADX INFO: renamed from: c */
    public final h9o0 f87386c;

    /* JADX INFO: renamed from: d */
    public final boolean f87387d;

    /* JADX INFO: renamed from: e */
    public final String f87388e;

    /* JADX INFO: renamed from: f */
    public final boolean f87389f;

    public h41(String str, String str2, h9o0 h9o0Var, boolean z, String str3, boolean z2) {
        this.f87384a = str;
        this.f87385b = str2;
        this.f87386c = h9o0Var;
        this.f87387d = z;
        this.f87388e = str3;
        this.f87389f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h41)) {
            return false;
        }
        h41 h41Var = (h41) obj;
        return wj50.m88271j(this.f87384a, h41Var.f87384a) && this.f87385b.equals(h41Var.f87385b) && wj50.m88271j(this.f87386c, h41Var.f87386c) && this.f87387d == h41Var.f87387d && wj50.m88271j(this.f87388e, h41Var.f87388e) && this.f87389f == h41Var.f87389f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87389f) + s571.m77243b(s571.m77245d((this.f87386c.hashCode() + s571.m77243b(this.f87384a.hashCode() * 31, 31, this.f87385b)) * 31, 31, this.f87387d), 31, this.f87388e);
    }
}
