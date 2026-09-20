package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d461 extends g461 {

    /* JADX INFO: renamed from: a */
    public final String f45093a;

    /* JADX INFO: renamed from: b */
    public final boolean f45094b;

    public d461(String str, boolean z) {
        this.f45093a = str;
        this.f45094b = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m34909a() {
        return this.f45093a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d461)) {
            return false;
        }
        d461 d461Var = (d461) obj;
        return wj50.m88271j(this.f45093a, d461Var.f45093a) && this.f45094b == d461Var.f45094b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45094b) + (this.f45093a.hashCode() * 31);
    }

    public /* synthetic */ d461(String str) {
        this(str, false);
    }
}
