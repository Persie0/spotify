package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h550 {

    /* JADX INFO: renamed from: a */
    public final String f87740a;

    /* JADX INFO: renamed from: b */
    public final String f87741b;

    /* JADX INFO: renamed from: c */
    public final wwu f87742c;

    /* JADX INFO: renamed from: d */
    public final qf40 f87743d;

    public h550(String str, String str2, wwu wwuVar, qf40 qf40Var) {
        this.f87740a = str;
        this.f87741b = str2;
        this.f87742c = wwuVar;
        this.f87743d = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h550)) {
            return false;
        }
        h550 h550Var = (h550) obj;
        return wj50.m88271j(this.f87740a, h550Var.f87740a) && wj50.m88271j(this.f87741b, h550Var.f87741b) && wj50.m88271j(this.f87742c, h550Var.f87742c) && wj50.m88271j(this.f87743d, h550Var.f87743d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f87740a.hashCode() * 31, 31, this.f87741b);
        wwu wwuVar = this.f87742c;
        return this.f87743d.hashCode() + ((iM77243b + (wwuVar == null ? 0 : wwuVar.hashCode())) * 31);
    }
}
