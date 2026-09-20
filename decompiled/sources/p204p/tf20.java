package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tf20 {

    /* JADX INFO: renamed from: a */
    public final nh20 f219835a;

    /* JADX INFO: renamed from: b */
    public final kqi0 f219836b;

    public tf20(nh20 nh20Var, kqi0 kqi0Var) {
        this.f219835a = nh20Var;
        this.f219836b = kqi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf20)) {
            return false;
        }
        tf20 tf20Var = (tf20) obj;
        return wj50.m88271j(this.f219835a, tf20Var.f219835a) && wj50.m88271j(this.f219836b, tf20Var.f219836b);
    }

    public final int hashCode() {
        return this.f219836b.hashCode() + (this.f219835a.hashCode() * 31);
    }
}
