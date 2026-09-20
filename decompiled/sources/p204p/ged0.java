package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ged0 {

    /* JADX INFO: renamed from: a */
    public final String f79096a;

    /* JADX INFO: renamed from: b */
    public final int f79097b;

    /* JADX INFO: renamed from: c */
    public final int f79098c;

    /* JADX INFO: renamed from: d */
    public final int f79099d;

    public ged0(int i, int i2, int i3, String str) {
        this.f79096a = str;
        this.f79097b = i;
        this.f79098c = i2;
        this.f79099d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ged0)) {
            return false;
        }
        ged0 ged0Var = (ged0) obj;
        return wj50.m88271j(this.f79096a, ged0Var.f79096a) && this.f79097b == ged0Var.f79097b && this.f79098c == ged0Var.f79098c && this.f79099d == ged0Var.f79099d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f79099d) + mt60.m62800g(this.f79098c, mt60.m62800g(this.f79097b, this.f79096a.hashCode() * 31, 31), 31);
    }
}
