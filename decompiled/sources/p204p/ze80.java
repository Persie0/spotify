package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ze80 extends af80 {

    /* JADX INFO: renamed from: a */
    public final String f281902a;

    /* JADX INFO: renamed from: b */
    public final String f281903b;

    /* JADX INFO: renamed from: c */
    public final int f281904c;

    /* JADX INFO: renamed from: d */
    public final boolean f281905d;

    public ze80(String str, int i, String str2, boolean z) {
        this.f281902a = str;
        this.f281903b = str2;
        this.f281904c = i;
        this.f281905d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze80)) {
            return false;
        }
        ze80 ze80Var = (ze80) obj;
        return wj50.m88271j(this.f281902a, ze80Var.f281902a) && wj50.m88271j(this.f281903b, ze80Var.f281903b) && this.f281904c == ze80Var.f281904c && this.f281905d == ze80Var.f281905d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281905d) + mt60.m62800g(this.f281904c, s571.m77243b(this.f281902a.hashCode() * 31, 31, this.f281903b), 31);
    }
}
