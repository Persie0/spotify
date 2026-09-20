package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b8g0 {

    /* JADX INFO: renamed from: a */
    public final qcr f24585a;

    /* JADX INFO: renamed from: b */
    public final e261 f24586b;

    public b8g0(qcr qcrVar, e261 e261Var) {
        this.f24585a = qcrVar;
        this.f24586b = e261Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8g0)) {
            return false;
        }
        b8g0 b8g0Var = (b8g0) obj;
        return wj50.m88271j(this.f24585a, b8g0Var.f24585a) && this.f24586b == b8g0Var.f24586b;
    }

    public final int hashCode() {
        qcr qcrVar = this.f24585a;
        return this.f24586b.hashCode() + ((qcrVar == null ? 0 : qcrVar.hashCode()) * 31);
    }
}
