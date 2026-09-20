package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w520 {

    /* JADX INFO: renamed from: a */
    public final String f247971a;

    /* JADX INFO: renamed from: b */
    public final String f247972b;

    /* JADX INFO: renamed from: c */
    public final String f247973c;

    /* JADX INFO: renamed from: d */
    public final String f247974d;

    /* JADX INFO: renamed from: e */
    public final int f247975e;

    /* JADX INFO: renamed from: f */
    public final boolean f247976f;

    public w520(String str, int i, String str2, String str3, boolean z, String str4) {
        this.f247971a = str;
        this.f247972b = str2;
        this.f247973c = str3;
        this.f247974d = str4;
        this.f247975e = i;
        this.f247976f = z;
    }

    /* JADX INFO: renamed from: a */
    public static w520 m87216a(w520 w520Var, boolean z) {
        String str = w520Var.f247971a;
        String str2 = w520Var.f247972b;
        String str3 = w520Var.f247973c;
        String str4 = w520Var.f247974d;
        int i = w520Var.f247975e;
        w520Var.getClass();
        return new w520(str, i, str2, str3, z, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w520)) {
            return false;
        }
        w520 w520Var = (w520) obj;
        return wj50.m88271j(this.f247971a, w520Var.f247971a) && wj50.m88271j(this.f247972b, w520Var.f247972b) && wj50.m88271j(this.f247973c, w520Var.f247973c) && wj50.m88271j(this.f247974d, w520Var.f247974d) && this.f247975e == w520Var.f247975e && this.f247976f == w520Var.f247976f;
    }

    public final int hashCode() {
        String str = this.f247971a;
        return Boolean.hashCode(this.f247976f) + mt60.m62800g(this.f247975e, s571.m77243b(s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f247972b), 31, this.f247973c), 31, this.f247974d), 31);
    }
}
