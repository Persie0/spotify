package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ctx {

    /* JADX INFO: renamed from: a */
    public final boolean f41996a;

    /* JADX INFO: renamed from: b */
    public final boolean f41997b;

    /* JADX INFO: renamed from: c */
    public final boolean f41998c;

    /* JADX INFO: renamed from: d */
    public final boolean f41999d;

    public ctx(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f41996a = z;
        this.f41997b = z2;
        this.f41998c = z3;
        this.f41999d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctx)) {
            return false;
        }
        ctx ctxVar = (ctx) obj;
        return this.f41996a == ctxVar.f41996a && this.f41997b == ctxVar.f41997b && this.f41998c == ctxVar.f41998c && this.f41999d == ctxVar.f41999d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41999d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f41996a) * 31, 31, this.f41997b), 31, this.f41998c);
    }
}
