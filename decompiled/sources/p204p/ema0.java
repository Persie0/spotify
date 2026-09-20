package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ema0 {

    /* JADX INFO: renamed from: a */
    public final String f60859a;

    /* JADX INFO: renamed from: b */
    public final String f60860b;

    /* JADX INFO: renamed from: c */
    public final int f60861c;

    public ema0(String str, String str2, int i) {
        this.f60859a = str;
        this.f60860b = str2;
        this.f60861c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ema0)) {
            return false;
        }
        ema0 ema0Var = (ema0) obj;
        return wj50.m88271j(this.f60859a, ema0Var.f60859a) && wj50.m88271j(this.f60860b, ema0Var.f60860b) && this.f60861c == ema0Var.f60861c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60861c) + s571.m77243b(this.f60859a.hashCode() * 31, 31, this.f60860b);
    }
}
