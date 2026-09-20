package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class p6e0 extends r6e0 {

    /* JADX INFO: renamed from: a */
    public final ezs0 f174349a;

    /* JADX INFO: renamed from: b */
    public final String f174350b;

    /* JADX INFO: renamed from: c */
    public final b250 f174351c;

    public p6e0(String str, b250 b250Var, ezs0 ezs0Var) {
        this.f174349a = ezs0Var;
        this.f174350b = str;
        this.f174351c = b250Var;
    }

    @Override // p204p.r6e0
    /* JADX INFO: renamed from: a */
    public final ezs0 mo69195a() {
        return this.f174349a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6e0)) {
            return false;
        }
        p6e0 p6e0Var = (p6e0) obj;
        return wj50.m88271j(this.f174349a, p6e0Var.f174349a) && wj50.m88271j(this.f174350b, p6e0Var.f174350b) && wj50.m88271j(this.f174351c, p6e0Var.f174351c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f174350b;
    }

    public final int hashCode() {
        return this.f174351c.hashCode() + s571.m77243b(this.f174349a.hashCode() * 31, 31, this.f174350b);
    }
}
