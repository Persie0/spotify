package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class btc0 implements ctc0 {

    /* JADX INFO: renamed from: a */
    public final String f30550a;

    /* JADX INFO: renamed from: b */
    public final String f30551b;

    public btc0(String str, String str2) {
        this.f30550a = str;
        this.f30551b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btc0)) {
            return false;
        }
        btc0 btc0Var = (btc0) obj;
        return wj50.m88271j(this.f30550a, btc0Var.f30550a) && wj50.m88271j(this.f30551b, btc0Var.f30551b);
    }

    public final int hashCode() {
        String str = this.f30550a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30551b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
