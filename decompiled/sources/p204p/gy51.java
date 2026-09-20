package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gy51 {

    /* JADX INFO: renamed from: a */
    public final n6f f85476a;

    /* JADX INFO: renamed from: b */
    public final String f85477b;

    public gy51(n6f n6fVar, String str) {
        this.f85476a = n6fVar;
        this.f85477b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy51)) {
            return false;
        }
        gy51 gy51Var = (gy51) obj;
        return wj50.m88271j(this.f85476a, gy51Var.f85476a) && wj50.m88271j(this.f85477b, gy51Var.f85477b);
    }

    public final int hashCode() {
        n6f n6fVar = this.f85476a;
        return this.f85477b.hashCode() + ((n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a)) * 31);
    }
}
