package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pce0 {

    /* JADX INFO: renamed from: a */
    public final String f176065a;

    /* JADX INFO: renamed from: b */
    public final String f176066b;

    public pce0(String str, String str2) {
        this.f176065a = str;
        this.f176066b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pce0)) {
            return false;
        }
        pce0 pce0Var = (pce0) obj;
        return wj50.m88271j(this.f176065a, pce0Var.f176065a) && wj50.m88271j(this.f176066b, pce0Var.f176066b);
    }

    public final int hashCode() {
        return this.f176066b.hashCode() + (this.f176065a.hashCode() * 31);
    }
}
