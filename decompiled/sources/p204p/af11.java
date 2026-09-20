package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class af11 {

    /* JADX INFO: renamed from: a */
    public final String f14999a;

    /* JADX INFO: renamed from: b */
    public final String f15000b;

    /* JADX INFO: renamed from: c */
    public final String f15001c;

    /* JADX INFO: renamed from: d */
    public final String f15002d;

    /* JADX INFO: renamed from: e */
    public final String f15003e;

    /* JADX INFO: renamed from: f */
    public final long f15004f;

    /* JADX INFO: renamed from: g */
    public final pla1 f15005g;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public af11(String str, String str2, String str3, String str4, String str5, long j, pla1 pla1Var) {
        this.f14999a = str;
        this.f15000b = str2;
        this.f15001c = str3;
        this.f15002d = str4;
        this.f15003e = str5;
        this.f15004f = j;
        this.f15005g = pla1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af11)) {
            return false;
        }
        af11 af11Var = (af11) obj;
        return wj50.m88271j(this.f14999a, af11Var.f14999a) && wj50.m88271j(this.f15000b, af11Var.f15000b) && wj50.m88271j(this.f15001c, af11Var.f15001c) && wj50.m88271j(this.f15002d, af11Var.f15002d) && wj50.m88271j(this.f15003e, af11Var.f15003e) && this.f15004f == af11Var.f15004f && wj50.m88271j(this.f15005g, af11Var.f15005g);
    }

    public final int hashCode() {
        return this.f15005g.hashCode() + dq60.m36605e(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f14999a.hashCode() * 31, 31, this.f15000b), 31, this.f15001c), 31, this.f15002d), 31, this.f15003e), this.f15004f, 31);
    }
}
