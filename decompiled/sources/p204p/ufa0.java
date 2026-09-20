package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ufa0 {

    /* JADX INFO: renamed from: a */
    public final String f229733a;

    /* JADX INFO: renamed from: b */
    public final eh00 f229734b;

    public ufa0(String str, eh00 eh00Var) {
        this.f229733a = str;
        this.f229734b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufa0)) {
            return false;
        }
        ufa0 ufa0Var = (ufa0) obj;
        return wj50.m88271j(this.f229733a, ufa0Var.f229733a) && wj50.m88271j(this.f229734b, ufa0Var.f229734b);
    }

    public final int hashCode() {
        String str = this.f229733a;
        return this.f229734b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
