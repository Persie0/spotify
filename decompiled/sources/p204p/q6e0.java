package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class q6e0 extends r6e0 {

    /* JADX INFO: renamed from: a */
    public final ezs0 f185762a;

    /* JADX INFO: renamed from: b */
    public final String f185763b;

    /* JADX INFO: renamed from: c */
    public final b250 f185764c;

    public q6e0(String str, b250 b250Var, ezs0 ezs0Var) {
        this.f185762a = ezs0Var;
        this.f185763b = str;
        this.f185764c = b250Var;
    }

    @Override // p204p.r6e0
    /* JADX INFO: renamed from: a */
    public final ezs0 mo69195a() {
        return this.f185762a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6e0)) {
            return false;
        }
        q6e0 q6e0Var = (q6e0) obj;
        return wj50.m88271j(this.f185762a, q6e0Var.f185762a) && wj50.m88271j(this.f185763b, q6e0Var.f185763b) && wj50.m88271j(this.f185764c, q6e0Var.f185764c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f185763b;
    }

    public final int hashCode() {
        return this.f185764c.hashCode() + s571.m77243b(this.f185762a.hashCode() * 31, 31, this.f185763b);
    }
}
