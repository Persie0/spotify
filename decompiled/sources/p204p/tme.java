package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tme extends kme {

    /* JADX INFO: renamed from: a */
    public final String f221667a;

    /* JADX INFO: renamed from: b */
    public final long f221668b;

    /* JADX INFO: renamed from: c */
    public final long f221669c;

    /* JADX INFO: renamed from: d */
    public final String f221670d;

    /* JADX INFO: renamed from: e */
    public final List f221671e;

    public tme(String str, long j, long j2, String str2, ae50 ae50Var) {
        this.f221667a = str;
        this.f221668b = j;
        this.f221669c = j2;
        this.f221670d = str2;
        this.f221671e = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tme)) {
            return false;
        }
        tme tmeVar = (tme) obj;
        return wj50.m88271j(this.f221667a, tmeVar.f221667a) && this.f221668b == tmeVar.f221668b && this.f221669c == tmeVar.f221669c && wj50.m88271j(this.f221670d, tmeVar.f221670d) && wj50.m88271j(this.f221671e, tmeVar.f221671e);
    }

    public final int hashCode() {
        return this.f221671e.hashCode() + s571.m77243b(dq60.m36605e(dq60.m36605e(this.f221667a.hashCode() * 31, this.f221668b, 31), this.f221669c, 31), 31, this.f221670d);
    }
}
