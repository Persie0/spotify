package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gl81 {

    /* JADX INFO: renamed from: a */
    public final String f81022a;

    /* JADX INFO: renamed from: b */
    public final wl81 f81023b;

    public gl81(String str, wl81 wl81Var) {
        this.f81022a = str;
        this.f81023b = wl81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl81)) {
            return false;
        }
        gl81 gl81Var = (gl81) obj;
        return wj50.m88271j(this.f81022a, gl81Var.f81022a) && wj50.m88271j(this.f81023b, gl81Var.f81023b);
    }

    public final int hashCode() {
        int iHashCode = this.f81022a.hashCode() * 31;
        this.f81023b.getClass();
        return iHashCode + 1396393329;
    }
}
