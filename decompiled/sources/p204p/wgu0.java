package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wgu0 implements ehu0 {

    /* JADX INFO: renamed from: a */
    public final String f251151a;

    /* JADX INFO: renamed from: b */
    public final d850 f251152b;

    public wgu0(String str, d850 d850Var) {
        this.f251151a = str;
        this.f251152b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgu0)) {
            return false;
        }
        wgu0 wgu0Var = (wgu0) obj;
        return wj50.m88271j(this.f251151a, wgu0Var.f251151a) && wj50.m88271j(this.f251152b, wgu0Var.f251152b);
    }

    public final int hashCode() {
        int iHashCode = this.f251151a.hashCode() * 31;
        d850 d850Var = this.f251152b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
