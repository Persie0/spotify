package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xx20 implements gy20 {

    /* JADX INFO: renamed from: a */
    public final String f266844a;

    /* JADX INFO: renamed from: b */
    public final Exception f266845b;

    public xx20(Exception exc, String str) {
        this.f266844a = str;
        this.f266845b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx20)) {
            return false;
        }
        xx20 xx20Var = (xx20) obj;
        return wj50.m88271j(this.f266844a, xx20Var.f266844a) && wj50.m88271j(this.f266845b, xx20Var.f266845b);
    }

    public final int hashCode() {
        return this.f266845b.hashCode() + (this.f266844a.hashCode() * 31);
    }
}
