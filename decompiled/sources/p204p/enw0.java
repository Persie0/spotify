package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class enw0 {

    /* JADX INFO: renamed from: a */
    public final int f61237a;

    /* JADX INFO: renamed from: b */
    public final qf40 f61238b;

    /* JADX INFO: renamed from: c */
    public final int f61239c;

    /* JADX INFO: renamed from: d */
    public final String f61240d;

    /* JADX INFO: renamed from: e */
    public final String f61241e;

    /* JADX INFO: renamed from: f */
    public final boolean f61242f;

    public enw0(int i, qf40 qf40Var, int i2, String str, String str2, boolean z) {
        this.f61237a = i;
        this.f61238b = qf40Var;
        this.f61239c = i2;
        this.f61240d = str;
        this.f61241e = str2;
        this.f61242f = z;
    }

    /* JADX INFO: renamed from: a */
    public static enw0 m39525a(enw0 enw0Var, int i, qf40 qf40Var, int i2, String str, String str2, int i3) {
        if ((i3 & 1) != 0) {
            i = enw0Var.f61237a;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = enw0Var.f61239c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = enw0Var.f61240d;
        }
        String str3 = str;
        if ((i3 & 16) != 0) {
            str2 = enw0Var.f61241e;
        }
        return new enw0(i4, qf40Var, i5, str3, str2, (i3 & 32) != 0 ? enw0Var.f61242f : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enw0)) {
            return false;
        }
        enw0 enw0Var = (enw0) obj;
        return this.f61237a == enw0Var.f61237a && wj50.m88271j(this.f61238b, enw0Var.f61238b) && this.f61239c == enw0Var.f61239c && wj50.m88271j(this.f61240d, enw0Var.f61240d) && wj50.m88271j(this.f61241e, enw0Var.f61241e) && this.f61242f == enw0Var.f61242f;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f61239c, fr0.m42461e(this.f61238b, Integer.hashCode(this.f61237a) * 31, 31), 31);
        String str = this.f61240d;
        int iHashCode = (iM62800g + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61241e;
        return Boolean.hashCode(this.f61242f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ enw0(qf40 qf40Var, int i, String str, String str2, boolean z, int i2) {
        this(1, qf40Var, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? false : z);
    }
}
