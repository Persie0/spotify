package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qdr implements wdr {

    /* JADX INFO: renamed from: a */
    public final qcr f187742a;

    /* JADX INFO: renamed from: b */
    public final e261 f187743b;

    public qdr(qcr qcrVar, e261 e261Var) {
        this.f187742a = qcrVar;
        this.f187743b = e261Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdr)) {
            return false;
        }
        qdr qdrVar = (qdr) obj;
        return wj50.m88271j(this.f187742a, qdrVar.f187742a) && this.f187743b == qdrVar.f187743b;
    }

    public final int hashCode() {
        qcr qcrVar = this.f187742a;
        return this.f187743b.hashCode() + ((qcrVar == null ? 0 : qcrVar.hashCode()) * 31);
    }
}
