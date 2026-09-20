package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class azo {

    /* JADX INFO: renamed from: a */
    public final wt7 f21654a;

    /* JADX INFO: renamed from: b */
    public final boolean f21655b;

    public azo(wt7 wt7Var, boolean z) {
        this.f21654a = wt7Var;
        this.f21655b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azo)) {
            return false;
        }
        azo azoVar = (azo) obj;
        return wj50.m88271j(this.f21654a, azoVar.f21654a) && this.f21655b == azoVar.f21655b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21655b) + (this.f21654a.hashCode() * 31);
    }
}
