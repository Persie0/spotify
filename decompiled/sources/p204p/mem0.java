package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mem0 implements pem0 {

    /* JADX INFO: renamed from: a */
    public final knm0 f142766a;

    public mem0(knm0 knm0Var) {
        this.f142766a = knm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mem0) && wj50.m88271j(this.f142766a, ((mem0) obj).f142766a);
    }

    public final int hashCode() {
        return this.f142766a.hashCode();
    }
}
