package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gax extends hax {

    /* JADX INFO: renamed from: a */
    public final int f78104a;

    /* JADX INFO: renamed from: b */
    public final b450 f78105b;

    public gax(int i, b450 b450Var) {
        this.f78104a = i;
        this.f78105b = b450Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gax)) {
            return false;
        }
        gax gaxVar = (gax) obj;
        return this.f78104a == gaxVar.f78104a && wj50.m88271j(this.f78105b, gaxVar.f78105b);
    }

    public final int hashCode() {
        return this.f78105b.hashCode() + (Integer.hashCode(this.f78104a) * 31);
    }
}
