package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bqx0 implements zqx0 {

    /* JADX INFO: renamed from: a */
    public final int f29901a;

    /* JADX INFO: renamed from: b */
    public final String f29902b;

    /* JADX INFO: renamed from: c */
    public final String f29903c;

    /* JADX INFO: renamed from: d */
    public final String f29904d;

    public bqx0(String str, String str2, int i, String str3) {
        this.f29901a = i;
        this.f29902b = str;
        this.f29903c = str2;
        this.f29904d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqx0)) {
            return false;
        }
        bqx0 bqx0Var = (bqx0) obj;
        return this.f29901a == bqx0Var.f29901a && wj50.m88271j(this.f29902b, bqx0Var.f29902b) && wj50.m88271j(this.f29903c, bqx0Var.f29903c) && wj50.m88271j(this.f29904d, bqx0Var.f29904d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(Integer.hashCode(this.f29901a) * 31, 31, this.f29902b), 31, this.f29903c);
        String str = this.f29904d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // p204p.zqx0
    /* JADX INFO: renamed from: s */
    public final int mo30282s() {
        return this.f29901a;
    }
}
