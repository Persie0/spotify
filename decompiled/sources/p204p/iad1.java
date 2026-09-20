package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iad1 extends sxg1 {

    /* JADX INFO: renamed from: b */
    public final String f100231b;

    /* JADX INFO: renamed from: c */
    public final String f100232c;

    /* JADX INFO: renamed from: d */
    public final String f100233d;

    /* JADX INFO: renamed from: e */
    public final oad1 f100234e;

    /* JADX INFO: renamed from: f */
    public final had1 f100235f;

    /* JADX INFO: renamed from: g */
    public final String f100236g;

    /* JADX INFO: renamed from: h */
    public final String f100237h;

    /* JADX INFO: renamed from: i */
    public final gad1 f100238i;

    public iad1(String str, String str2, String str3, oad1 oad1Var, had1 had1Var, String str4, String str5, gad1 gad1Var) {
        this.f100231b = str;
        this.f100232c = str2;
        this.f100233d = str3;
        this.f100234e = oad1Var;
        this.f100235f = had1Var;
        this.f100236g = str4;
        this.f100237h = str5;
        this.f100238i = gad1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iad1)) {
            return false;
        }
        iad1 iad1Var = (iad1) obj;
        return wj50.m88271j(this.f100231b, iad1Var.f100231b) && wj50.m88271j(this.f100232c, iad1Var.f100232c) && wj50.m88271j(this.f100233d, iad1Var.f100233d) && wj50.m88271j(this.f100234e, iad1Var.f100234e) && wj50.m88271j(this.f100235f, iad1Var.f100235f) && wj50.m88271j(this.f100236g, iad1Var.f100236g) && wj50.m88271j(this.f100237h, iad1Var.f100237h) && wj50.m88271j(this.f100238i, iad1Var.f100238i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b((this.f100235f.hashCode() + ((this.f100234e.hashCode() + s571.m77243b(s571.m77243b(this.f100231b.hashCode() * 31, 31, this.f100232c), 31, this.f100233d)) * 31)) * 31, 31, this.f100236g), 31, this.f100237h);
        gad1 gad1Var = this.f100238i;
        return iM77243b + (gad1Var == null ? 0 : gad1Var.hashCode());
    }

    public /* synthetic */ iad1(oad1 oad1Var, had1 had1Var) {
        this("", "", "", oad1Var, had1Var, "", "", null);
    }
}
