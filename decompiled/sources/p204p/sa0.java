package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sa0 extends ta0 implements ra0 {

    /* JADX INFO: renamed from: a */
    public final ip20 f207099a;

    public sa0(ip20 ip20Var) {
        this.f207099a = ip20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa0) && wj50.m88271j(this.f207099a, ((sa0) obj).f207099a);
    }

    public final int hashCode() {
        return this.f207099a.f104368a.hashCode();
    }
}
