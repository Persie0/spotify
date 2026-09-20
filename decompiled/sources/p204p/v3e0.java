package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v3e0 extends x3e0 {

    /* JADX INFO: renamed from: a */
    public final ezs0 f236839a;

    /* JADX INFO: renamed from: b */
    public final String f236840b;

    /* JADX INFO: renamed from: c */
    public final b250 f236841c;

    public v3e0(String str, b250 b250Var, ezs0 ezs0Var) {
        this.f236839a = ezs0Var;
        this.f236840b = str;
        this.f236841c = b250Var;
    }

    @Override // p204p.x3e0
    /* JADX INFO: renamed from: a */
    public final ezs0 mo84560a() {
        return this.f236839a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3e0)) {
            return false;
        }
        v3e0 v3e0Var = (v3e0) obj;
        return wj50.m88271j(this.f236839a, v3e0Var.f236839a) && wj50.m88271j(this.f236840b, v3e0Var.f236840b) && wj50.m88271j(this.f236841c, v3e0Var.f236841c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f236840b;
    }

    public final int hashCode() {
        return this.f236841c.hashCode() + s571.m77243b(this.f236839a.hashCode() * 31, 31, this.f236840b);
    }
}
