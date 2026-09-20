package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fob0 {

    /* JADX INFO: renamed from: a */
    public final String f71493a;

    /* JADX INFO: renamed from: b */
    public final String f71494b;

    /* JADX INFO: renamed from: c */
    public final wab0 f71495c;

    /* JADX INFO: renamed from: d */
    public final vdb0 f71496d;

    /* JADX INFO: renamed from: e */
    public final boolean f71497e;

    public fob0(String str, String str2, wab0 wab0Var, vdb0 vdb0Var, boolean z) {
        this.f71493a = str;
        this.f71494b = str2;
        this.f71495c = wab0Var;
        this.f71496d = vdb0Var;
        this.f71497e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fob0)) {
            return false;
        }
        fob0 fob0Var = (fob0) obj;
        return wj50.m88271j(this.f71493a, fob0Var.f71493a) && wj50.m88271j(this.f71494b, fob0Var.f71494b) && wj50.m88271j(this.f71495c, fob0Var.f71495c) && this.f71496d == fob0Var.f71496d && this.f71497e == fob0Var.f71497e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71497e) + ((this.f71496d.hashCode() + ((this.f71495c.hashCode() + s571.m77243b(this.f71493a.hashCode() * 31, 31, this.f71494b)) * 31)) * 31);
    }
}
