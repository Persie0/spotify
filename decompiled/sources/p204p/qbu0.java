package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qbu0 {

    /* JADX INFO: renamed from: a */
    public final String f187172a;

    /* JADX INFO: renamed from: b */
    public final t2b0 f187173b;

    public qbu0(String str, t2b0 t2b0Var) {
        this.f187172a = str;
        this.f187173b = t2b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbu0)) {
            return false;
        }
        qbu0 qbu0Var = (qbu0) obj;
        return this.f187172a.equals(qbu0Var.f187172a) && this.f187173b.equals(qbu0Var.f187173b);
    }

    public final int hashCode() {
        return this.f187173b.hashCode() + (this.f187172a.hashCode() * 31);
    }
}
