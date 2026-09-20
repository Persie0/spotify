package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class am70 {

    /* JADX INFO: renamed from: a */
    public final zl70 f17051a;

    /* JADX INFO: renamed from: b */
    public final v140 f17052b;

    /* JADX INFO: renamed from: c */
    public final erc1 f17053c;

    /* JADX INFO: renamed from: d */
    public final String f17054d;

    /* JADX INFO: renamed from: e */
    public final rcr0 f17055e;

    /* JADX INFO: renamed from: f */
    public final boolean f17056f;

    /* JADX INFO: renamed from: g */
    public final boolean f17057g;

    public am70(zl70 zl70Var, v140 v140Var, erc1 erc1Var, String str, rcr0 rcr0Var, boolean z, boolean z2) {
        this.f17051a = zl70Var;
        this.f17052b = v140Var;
        this.f17053c = erc1Var;
        this.f17054d = str;
        this.f17055e = rcr0Var;
        this.f17056f = z;
        this.f17057g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am70)) {
            return false;
        }
        am70 am70Var = (am70) obj;
        return wj50.m88271j(this.f17051a, am70Var.f17051a) && wj50.m88271j(this.f17052b, am70Var.f17052b) && wj50.m88271j(this.f17053c, am70Var.f17053c) && wj50.m88271j(this.f17054d, am70Var.f17054d) && wj50.m88271j(this.f17055e, am70Var.f17055e) && this.f17056f == am70Var.f17056f && this.f17057g == am70Var.f17057g;
    }

    public final int hashCode() {
        int iHashCode = this.f17051a.hashCode() * 31;
        v140 v140Var = this.f17052b;
        int iHashCode2 = (iHashCode + (v140Var == null ? 0 : v140Var.hashCode())) * 31;
        erc1 erc1Var = this.f17053c;
        int iHashCode3 = (iHashCode2 + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        String str = this.f17054d;
        return Boolean.hashCode(this.f17057g) + s571.m77245d((this.f17055e.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.f17056f);
    }
}
