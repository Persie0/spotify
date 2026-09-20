package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class izd0 extends kzd0 {

    /* JADX INFO: renamed from: a */
    public final ezs0 f107202a;

    /* JADX INFO: renamed from: b */
    public final String f107203b;

    /* JADX INFO: renamed from: c */
    public final b250 f107204c;

    public izd0(String str, b250 b250Var, ezs0 ezs0Var) {
        this.f107202a = ezs0Var;
        this.f107203b = str;
        this.f107204c = b250Var;
    }

    @Override // p204p.kzd0
    /* JADX INFO: renamed from: a */
    public final ezs0 mo51989a() {
        return this.f107202a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izd0)) {
            return false;
        }
        izd0 izd0Var = (izd0) obj;
        return wj50.m88271j(this.f107202a, izd0Var.f107202a) && wj50.m88271j(this.f107203b, izd0Var.f107203b) && wj50.m88271j(this.f107204c, izd0Var.f107204c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f107203b;
    }

    public final int hashCode() {
        return this.f107204c.hashCode() + s571.m77243b(this.f107202a.hashCode() * 31, 31, this.f107203b);
    }
}
