package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ava0 implements fz0 {

    /* JADX INFO: renamed from: a */
    public final syx0 f20134a;

    /* JADX INFO: renamed from: b */
    public final String f20135b;

    /* JADX INFO: renamed from: c */
    public final String f20136c;

    /* JADX INFO: renamed from: d */
    public final int f20137d;

    public ava0(syx0 syx0Var, String str, String str2, int i) {
        this.f20134a = syx0Var;
        this.f20135b = str;
        this.f20136c = str2;
        this.f20137d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ava0)) {
            return false;
        }
        ava0 ava0Var = (ava0) obj;
        return wj50.m88271j(this.f20134a, ava0Var.f20134a) && wj50.m88271j(this.f20135b, ava0Var.f20135b) && wj50.m88271j(this.f20136c, ava0Var.f20136c) && this.f20137d == ava0Var.f20137d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20137d) + s571.m77243b(s571.m77243b(this.f20134a.hashCode() * 31, 31, this.f20135b), 31, this.f20136c);
    }
}
