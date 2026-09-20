package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eeb0 implements heb0 {

    /* JADX INFO: renamed from: a */
    public final s7f f58735a;

    /* JADX INFO: renamed from: b */
    public final xf81 f58736b;

    /* JADX INFO: renamed from: c */
    public final String f58737c;

    /* JADX INFO: renamed from: d */
    public final int f58738d;

    public eeb0(s7f s7fVar, xf81 xf81Var, String str, int i) {
        this.f58735a = s7fVar;
        this.f58736b = xf81Var;
        this.f58737c = str;
        this.f58738d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eeb0)) {
            return false;
        }
        eeb0 eeb0Var = (eeb0) obj;
        return wj50.m88271j(this.f58735a, eeb0Var.f58735a) && wj50.m88271j(this.f58736b, eeb0Var.f58736b) && wj50.m88271j(this.f58737c, eeb0Var.f58737c) && this.f58738d == eeb0Var.f58738d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58738d) + s571.m77243b((this.f58736b.hashCode() + (this.f58735a.hashCode() * 31)) * 31, 31, this.f58737c);
    }
}
