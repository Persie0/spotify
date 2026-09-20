package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o80 {

    /* JADX INFO: renamed from: a */
    public final x02 f162665a;

    /* JADX INFO: renamed from: b */
    public final int f162666b;

    /* JADX INFO: renamed from: c */
    public final long f162667c;

    public o80(x02 x02Var, int i, long j) {
        this.f162665a = x02Var;
        this.f162666b = i;
        this.f162667c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o80)) {
            return false;
        }
        o80 o80Var = (o80) obj;
        return wj50.m88271j(this.f162665a, o80Var.f162665a) && this.f162666b == o80Var.f162666b && this.f162667c == o80Var.f162667c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f162667c) + f710.m40938f(this.f162666b, this.f162665a.hashCode() * 31, 31);
    }
}
