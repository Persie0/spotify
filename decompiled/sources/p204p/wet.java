package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wet {

    /* JADX INFO: renamed from: a */
    public final String f250619a;

    /* JADX INFO: renamed from: b */
    public final d850 f250620b;

    public wet(String str, d850 d850Var) {
        this.f250619a = str;
        this.f250620b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wet)) {
            return false;
        }
        wet wetVar = (wet) obj;
        return wj50.m88271j(this.f250619a, wetVar.f250619a) && wj50.m88271j(this.f250620b, wetVar.f250620b);
    }

    public final int hashCode() {
        return this.f250620b.hashCode() + (this.f250619a.hashCode() * 31);
    }
}
