package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fmo {

    /* JADX INFO: renamed from: a */
    public final String f71088a;

    /* JADX INFO: renamed from: b */
    public final boolean f71089b;

    public fmo(String str, boolean z) {
        this.f71088a = str;
        this.f71089b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmo)) {
            return false;
        }
        fmo fmoVar = (fmo) obj;
        return wj50.m88271j(this.f71088a, fmoVar.f71088a) && this.f71089b == fmoVar.f71089b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71089b) + (this.f71088a.hashCode() * 31);
    }
}
