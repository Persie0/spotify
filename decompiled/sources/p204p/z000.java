package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z000 {

    /* JADX INFO: renamed from: a */
    public final String f277931a;

    /* JADX INFO: renamed from: b */
    public final c10 f277932b;

    public z000(String str, c10 c10Var) {
        this.f277931a = str;
        this.f277932b = c10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z000)) {
            return false;
        }
        z000 z000Var = (z000) obj;
        return wj50.m88271j(this.f277931a, z000Var.f277931a) && wj50.m88271j(this.f277932b, z000Var.f277932b);
    }

    public final int hashCode() {
        return this.f277932b.hashCode() + (this.f277931a.hashCode() * 31);
    }
}
