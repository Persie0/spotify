package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qyp0 extends ryp0 {

    /* JADX INFO: renamed from: a */
    public final String f193978a;

    /* JADX INFO: renamed from: b */
    public final String f193979b;

    /* JADX INFO: renamed from: c */
    public final String f193980c;

    /* JADX INFO: renamed from: d */
    public final String f193981d;

    /* JADX INFO: renamed from: e */
    public final int f193982e;

    public qyp0(int i, String str, String str2, String str3, String str4) {
        this.f193978a = str;
        this.f193979b = str2;
        this.f193980c = str3;
        this.f193981d = str4;
        this.f193982e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyp0)) {
            return false;
        }
        qyp0 qyp0Var = (qyp0) obj;
        return wj50.m88271j(this.f193978a, qyp0Var.f193978a) && wj50.m88271j(this.f193979b, qyp0Var.f193979b) && wj50.m88271j(this.f193980c, qyp0Var.f193980c) && wj50.m88271j(this.f193981d, qyp0Var.f193981d) && this.f193982e == qyp0Var.f193982e;
    }

    public final int hashCode() {
        return mt60.m62800g(this.f193982e, s571.m77243b(s571.m77243b(s571.m77243b(this.f193978a.hashCode() * 31, 31, this.f193979b), 31, this.f193980c), 31, this.f193981d), 31);
    }
}
