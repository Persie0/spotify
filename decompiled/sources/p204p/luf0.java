package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class luf0 {

    /* JADX INFO: renamed from: a */
    public final lb81 f137077a;

    /* JADX INFO: renamed from: b */
    public final int f137078b;

    /* JADX INFO: renamed from: c */
    public final boolean f137079c;

    /* JADX INFO: renamed from: d */
    public final wef0 f137080d;

    public luf0(lb81 lb81Var, int i, boolean z, wef0 wef0Var) {
        this.f137077a = lb81Var;
        this.f137078b = i;
        this.f137079c = z;
        this.f137080d = wef0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luf0)) {
            return false;
        }
        luf0 luf0Var = (luf0) obj;
        return this.f137077a == luf0Var.f137077a && this.f137078b == luf0Var.f137078b && this.f137079c == luf0Var.f137079c && this.f137080d == luf0Var.f137080d;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(mt60.m62800g(this.f137078b, this.f137077a.hashCode() * 31, 31), 31, this.f137079c);
        wef0 wef0Var = this.f137080d;
        return iM77245d + (wef0Var == null ? 0 : wef0Var.hashCode());
    }
}
