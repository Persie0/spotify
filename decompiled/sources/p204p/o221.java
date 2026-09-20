package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o221 {

    /* JADX INFO: renamed from: a */
    public final boolean f160923a;

    /* JADX INFO: renamed from: b */
    public final boolean f160924b;

    /* JADX INFO: renamed from: c */
    public final boolean f160925c;

    /* JADX INFO: renamed from: d */
    public final boolean f160926d;

    public o221(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f160923a = z;
        this.f160924b = z2;
        this.f160925c = z3;
        this.f160926d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o221)) {
            return false;
        }
        o221 o221Var = (o221) obj;
        return this.f160923a == o221Var.f160923a && this.f160924b == o221Var.f160924b && this.f160925c == o221Var.f160925c && this.f160926d == o221Var.f160926d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f160926d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f160923a) * 31, 31, this.f160924b), 31, this.f160925c);
    }
}
